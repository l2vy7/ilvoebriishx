package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p190b5.C6509b;

/* renamed from: com.google.firebase.iid.t */
public final class C10447t implements ServiceConnection {

    /* renamed from: b */
    private final Context f48913b;

    /* renamed from: c */
    private final Intent f48914c;

    /* renamed from: d */
    private final ScheduledExecutorService f48915d;

    /* renamed from: e */
    private final Queue<C10443p> f48916e;

    /* renamed from: f */
    private C10445r f48917f;

    /* renamed from: g */
    private boolean f48918g;

    public C10447t(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new C6509b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m48115b() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "EnhancedIntentService"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "flush queue called"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a9 }
        L_0x0011:
            java.util.Queue<com.google.firebase.iid.p> r0 = r6.f48916e     // Catch:{ all -> 0x00a9 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x00a7
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "found intent to be delivered"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a9 }
        L_0x0028:
            com.google.firebase.iid.r r0 = r6.f48917f     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x004f
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "binder is alive, sending the intent."
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a9 }
        L_0x0041:
            java.util.Queue<com.google.firebase.iid.p> r0 = r6.f48916e     // Catch:{ all -> 0x00a9 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x00a9 }
            com.google.firebase.iid.p r0 = (com.google.firebase.iid.C10443p) r0     // Catch:{ all -> 0x00a9 }
            com.google.firebase.iid.r r2 = r6.f48917f     // Catch:{ all -> 0x00a9 }
            r2.mo41909b(r0)     // Catch:{ all -> 0x00a9 }
            goto L_0x0011
        L_0x004f:
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a9 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = "EnhancedIntentService"
            boolean r3 = r6.f48918g     // Catch:{ all -> 0x00a9 }
            if (r3 != 0) goto L_0x0061
            r3 = 1
            goto L_0x0062
        L_0x0061:
            r3 = 0
        L_0x0062:
            r4 = 39
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            r5.<init>(r4)     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = "binder is dead. start connection? "
            r5.append(r4)     // Catch:{ all -> 0x00a9 }
            r5.append(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00a9 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00a9 }
        L_0x0078:
            boolean r0 = r6.f48918g     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x00a5
            r6.f48918g = r2     // Catch:{ all -> 0x00a9 }
            z4.a r0 = p186z4.C6469a.m28199b()     // Catch:{ SecurityException -> 0x0098 }
            android.content.Context r2 = r6.f48913b     // Catch:{ SecurityException -> 0x0098 }
            android.content.Intent r3 = r6.f48914c     // Catch:{ SecurityException -> 0x0098 }
            r4 = 65
            boolean r0 = r0.mo24298a(r2, r3, r6, r4)     // Catch:{ SecurityException -> 0x0098 }
            if (r0 == 0) goto L_0x0090
            monitor-exit(r6)
            return
        L_0x0090:
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "binding to the service failed"
            android.util.Log.e(r0, r2)     // Catch:{ SecurityException -> 0x0098 }
            goto L_0x00a0
        L_0x0098:
            r0 = move-exception
            java.lang.String r2 = "EnhancedIntentService"
            java.lang.String r3 = "Exception while binding the service"
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x00a9 }
        L_0x00a0:
            r6.f48918g = r1     // Catch:{ all -> 0x00a9 }
            r6.m48116c()     // Catch:{ all -> 0x00a9 }
        L_0x00a5:
            monitor-exit(r6)
            return
        L_0x00a7:
            monitor-exit(r6)
            return
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r6)
            goto L_0x00ad
        L_0x00ac:
            throw r0
        L_0x00ad:
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C10447t.m48115b():void");
    }

    /* renamed from: c */
    private final void m48116c() {
        while (!this.f48916e.isEmpty()) {
            this.f48916e.poll().mo41907a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo41911a(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
        }
        this.f48916e.add(new C10443p(intent, pendingResult, this.f48915d));
        m48115b();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f48918g = false;
            this.f48917f = (C10445r) iBinder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                String valueOf = String.valueOf(componentName);
                StringBuilder sb = new StringBuilder(valueOf.length() + 20);
                sb.append("onServiceConnected: ");
                sb.append(valueOf);
                Log.d("EnhancedIntentService", sb.toString());
            }
            if (iBinder == null) {
                Log.e("EnhancedIntentService", "Null service connection");
                m48116c();
            } else {
                m48115b();
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d("EnhancedIntentService", sb.toString());
        }
        m48115b();
    }

    private C10447t(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f48916e = new ArrayDeque();
        this.f48918g = false;
        Context applicationContext = context.getApplicationContext();
        this.f48913b = applicationContext;
        this.f48914c = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f48915d = scheduledExecutorService;
    }
}
