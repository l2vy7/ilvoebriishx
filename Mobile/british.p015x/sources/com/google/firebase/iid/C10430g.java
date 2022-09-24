package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.zzl;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import p078f7.C10541d;
import p078f7.C10551n;
import p078f7.C10553p;
import p150t.C6090g;

/* renamed from: com.google.firebase.iid.g */
final class C10430g {

    /* renamed from: g */
    private static int f48866g;

    /* renamed from: h */
    private static PendingIntent f48867h;
    @GuardedBy("responseCallbacks")

    /* renamed from: a */
    private final C6090g<String, TaskCompletionSource<Bundle>> f48868a = new C6090g<>();

    /* renamed from: b */
    private final Context f48869b;

    /* renamed from: c */
    private final C10553p f48870c;

    /* renamed from: d */
    private Messenger f48871d;

    /* renamed from: e */
    private Messenger f48872e;

    /* renamed from: f */
    private zzl f48873f;

    public C10430g(Context context, C10553p pVar) {
        this.f48869b = context;
        this.f48870c = pVar;
        this.f48871d = new Messenger(new C10432h(this, Looper.getMainLooper()));
    }

    /* renamed from: a */
    private static synchronized void m48047a(Context context, Intent intent) {
        synchronized (C10430g.class) {
            if (f48867h == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f48867h = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f48867h);
        }
    }

    /* renamed from: c */
    private final void m48049c(String str, Bundle bundle) {
        synchronized (this.f48868a) {
            TaskCompletionSource remove = this.f48868a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.setResult(bundle);
        }
    }

    /* renamed from: d */
    private static synchronized String m48050d() {
        String num;
        synchronized (C10430g.class) {
            int i = f48866g;
            f48866g = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m48051e(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzl.C10454a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzl) {
                        this.f48873f = (zzl) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f48872e = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            Log.w("FirebaseInstanceId", sb.toString());
                            return;
                        }
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            Log.d("FirebaseInstanceId", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                Log.w("FirebaseInstanceId", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                                return;
                            }
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            m48049c(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        }
                        synchronized (this.f48868a) {
                            for (int i = 0; i < this.f48868a.size(); i++) {
                                m48049c(this.f48868a.mo23390j(i), intent2.getExtras());
                            }
                        }
                        return;
                    }
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        m48049c(group, extras);
                        return;
                    } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        Log.d("FirebaseInstanceId", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf2 = String.valueOf(action);
                    Log.d("FirebaseInstanceId", valueOf2.length() != 0 ? "Unexpected response action: ".concat(valueOf2) : new String("Unexpected response action: "));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    /* renamed from: g */
    private final Bundle m48052g(Bundle bundle) throws IOException {
        Bundle h = m48053h(bundle);
        if (h == null || !h.containsKey("google.messenger")) {
            return h;
        }
        Bundle h2 = m48053h(bundle);
        if (h2 == null || !h2.containsKey("google.messenger")) {
            return h2;
        }
        return null;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: h */
    private final android.os.Bundle m48053h(android.os.Bundle r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = m48050d()
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            t.g<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r2 = r8.f48868a
            monitor-enter(r2)
            t.g<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r3 = r8.f48868a     // Catch:{ all -> 0x0120 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0120 }
            monitor-exit(r2)     // Catch:{ all -> 0x0120 }
            f7.p r2 = r8.f48870c
            int r2 = r2.mo42678c()
            if (r2 == 0) goto L_0x0118
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            f7.p r3 = r8.f48870c
            int r3 = r3.mo42678c()
            r4 = 2
            if (r3 != r4) goto L_0x0033
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            r2.setAction(r3)
            goto L_0x0038
        L_0x0033:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
            r2.setAction(r3)
        L_0x0038:
            r2.putExtras(r9)
            android.content.Context r9 = r8.f48869b
            m48047a(r9, r2)
            java.lang.String r9 = "kid"
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r3 = r3 + 5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "|ID|"
            r5.append(r3)
            r5.append(r0)
            java.lang.String r3 = "|"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.putExtra(r9, r3)
            java.lang.String r9 = "FirebaseInstanceId"
            r3 = 3
            boolean r9 = android.util.Log.isLoggable(r9, r3)
            if (r9 == 0) goto L_0x0092
            java.lang.String r9 = "FirebaseInstanceId"
            android.os.Bundle r5 = r2.getExtras()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            int r6 = r6 + 8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Sending "
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.util.Log.d(r9, r5)
        L_0x0092:
            java.lang.String r9 = "google.messenger"
            android.os.Messenger r5 = r8.f48871d
            r2.putExtra(r9, r5)
            android.os.Messenger r9 = r8.f48872e
            if (r9 != 0) goto L_0x00a1
            com.google.firebase.iid.zzl r9 = r8.f48873f
            if (r9 == 0) goto L_0x00c5
        L_0x00a1:
            android.os.Message r9 = android.os.Message.obtain()
            r9.obj = r2
            android.os.Messenger r5 = r8.f48872e     // Catch:{ RemoteException -> 0x00b5 }
            if (r5 == 0) goto L_0x00af
            r5.send(r9)     // Catch:{ RemoteException -> 0x00b5 }
            goto L_0x00d8
        L_0x00af:
            com.google.firebase.iid.zzl r5 = r8.f48873f     // Catch:{ RemoteException -> 0x00b5 }
            r5.mo41922b(r9)     // Catch:{ RemoteException -> 0x00b5 }
            goto L_0x00d8
        L_0x00b5:
            java.lang.String r9 = "FirebaseInstanceId"
            boolean r9 = android.util.Log.isLoggable(r9, r3)
            if (r9 == 0) goto L_0x00c5
            java.lang.String r9 = "FirebaseInstanceId"
            java.lang.String r3 = "Messenger failed, fallback to startService"
            android.util.Log.d(r9, r3)
        L_0x00c5:
            f7.p r9 = r8.f48870c
            int r9 = r9.mo42678c()
            if (r9 != r4) goto L_0x00d3
            android.content.Context r9 = r8.f48869b
            r9.sendBroadcast(r2)
            goto L_0x00d8
        L_0x00d3:
            android.content.Context r9 = r8.f48869b
            r9.startService(r2)
        L_0x00d8:
            com.google.android.gms.tasks.Task r9 = r1.getTask()     // Catch:{ InterruptedException | TimeoutException -> 0x00fc, ExecutionException -> 0x00f5 }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x00fc, ExecutionException -> 0x00f5 }
            java.lang.Object r9 = com.google.android.gms.tasks.Tasks.await(r9, r1, r3)     // Catch:{ InterruptedException | TimeoutException -> 0x00fc, ExecutionException -> 0x00f5 }
            android.os.Bundle r9 = (android.os.Bundle) r9     // Catch:{ InterruptedException | TimeoutException -> 0x00fc, ExecutionException -> 0x00f5 }
            t.g<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r1 = r8.f48868a
            monitor-enter(r1)
            t.g<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r2 = r8.f48868a     // Catch:{ all -> 0x00f0 }
            r2.remove(r0)     // Catch:{ all -> 0x00f0 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f0 }
            return r9
        L_0x00f0:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f0 }
            throw r9
        L_0x00f3:
            r9 = move-exception
            goto L_0x010b
        L_0x00f5:
            r9 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00f3 }
            r1.<init>(r9)     // Catch:{ all -> 0x00f3 }
            throw r1     // Catch:{ all -> 0x00f3 }
        L_0x00fc:
            java.lang.String r9 = "FirebaseInstanceId"
            java.lang.String r1 = "No response"
            android.util.Log.w(r9, r1)     // Catch:{ all -> 0x00f3 }
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = "TIMEOUT"
            r9.<init>(r1)     // Catch:{ all -> 0x00f3 }
            throw r9     // Catch:{ all -> 0x00f3 }
        L_0x010b:
            t.g<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r1 = r8.f48868a
            monitor-enter(r1)
            t.g<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r2 = r8.f48868a     // Catch:{ all -> 0x0115 }
            r2.remove(r0)     // Catch:{ all -> 0x0115 }
            monitor-exit(r1)     // Catch:{ all -> 0x0115 }
            throw r9
        L_0x0115:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0115 }
            throw r9
        L_0x0118:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r9.<init>(r0)
            throw r9
        L_0x0120:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0120 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C10430g.m48053h(android.os.Bundle):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Bundle mo41881f(Bundle bundle) throws IOException {
        if (this.f48870c.mo42681f() < 12000000) {
            return m48052g(bundle);
        }
        try {
            return (Bundle) Tasks.await(C10541d.m48280f(this.f48869b).mo42658d(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if (!(e.getCause() instanceof C10551n) || ((C10551n) e.getCause()).mo42677a() != 4) {
                return null;
            }
            return m48052g(bundle);
        }
    }
}
