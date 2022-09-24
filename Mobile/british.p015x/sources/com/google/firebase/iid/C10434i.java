package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;
import p150t.C6090g;

/* renamed from: com.google.firebase.iid.i */
public final class C10434i {

    /* renamed from: e */
    private static C10434i f48876e;
    @GuardedBy("serviceClassNames")

    /* renamed from: a */
    private final C6090g<String, String> f48877a = new C6090g<>();

    /* renamed from: b */
    private Boolean f48878b = null;

    /* renamed from: c */
    final Queue<Intent> f48879c = new ArrayDeque();

    /* renamed from: d */
    private final Queue<Intent> f48880d = new ArrayDeque();

    private C10434i() {
    }

    /* renamed from: a */
    public static PendingIntent m48057a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, i, m48058b(context, "com.google.firebase.MESSAGING_EVENT", intent), 1073741824);
    }

    /* renamed from: b */
    private static Intent m48058b(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }

    /* renamed from: c */
    public static synchronized C10434i m48059c() {
        C10434i iVar;
        synchronized (C10434i.class) {
            if (f48876e == null) {
                f48876e = new C10434i();
            }
            iVar = f48876e;
        }
        return iVar;
    }

    /* renamed from: f */
    public static void m48060f(Context context, Intent intent) {
        context.sendBroadcast(m48058b(context, "com.google.firebase.INSTANCE_ID_EVENT", intent));
    }

    /* renamed from: g */
    public static void m48061g(Context context, Intent intent) {
        context.sendBroadcast(m48058b(context, "com.google.firebase.MESSAGING_EVENT", intent));
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d4 A[Catch:{ SecurityException -> 0x012d, IllegalStateException -> 0x0109 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00eb A[Catch:{ SecurityException -> 0x012d, IllegalStateException -> 0x0109 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f0 A[Catch:{ SecurityException -> 0x012d, IllegalStateException -> 0x0109 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fd A[Catch:{ SecurityException -> 0x012d, IllegalStateException -> 0x0109 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0107 A[RETURN] */
    /* renamed from: h */
    private final int m48062h(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            t.g<java.lang.String, java.lang.String> r0 = r6.f48877a
            monitor-enter(r0)
            t.g<java.lang.String, java.lang.String> r1 = r6.f48877a     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = r8.getAction()     // Catch:{ all -> 0x0138 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0138 }
            monitor-exit(r0)     // Catch:{ all -> 0x0138 }
            r0 = 0
            if (r1 != 0) goto L_0x00a4
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            android.content.pm.ResolveInfo r1 = r1.resolveService(r8, r0)
            if (r1 == 0) goto L_0x009c
            android.content.pm.ServiceInfo r1 = r1.serviceInfo
            if (r1 != 0) goto L_0x0023
            goto L_0x009c
        L_0x0023:
            java.lang.String r2 = r7.getPackageName()
            java.lang.String r3 = r1.packageName
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0066
            java.lang.String r2 = r1.name
            if (r2 != 0) goto L_0x0034
            goto L_0x0066
        L_0x0034:
            java.lang.String r1 = "."
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x004f
            java.lang.String r1 = r1.concat(r2)
            goto L_0x0055
        L_0x004f:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
        L_0x0054:
            r1 = r2
        L_0x0055:
            t.g<java.lang.String, java.lang.String> r2 = r6.f48877a
            monitor-enter(r2)
            t.g<java.lang.String, java.lang.String> r3 = r6.f48877a     // Catch:{ all -> 0x0063 }
            java.lang.String r4 = r8.getAction()     // Catch:{ all -> 0x0063 }
            r3.put(r4, r1)     // Catch:{ all -> 0x0063 }
            monitor-exit(r2)     // Catch:{ all -> 0x0063 }
            goto L_0x00a4
        L_0x0063:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0063 }
            throw r7
        L_0x0066:
            java.lang.String r2 = "FirebaseInstanceId"
            java.lang.String r3 = r1.packageName
            java.lang.String r1 = r1.name
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 94
            java.lang.String r5 = java.lang.String.valueOf(r1)
            int r5 = r5.length()
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "/"
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            android.util.Log.e(r2, r1)
            goto L_0x00d0
        L_0x009c:
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r2 = "Failed to resolve target intent service, skipping classname enforcement"
            android.util.Log.e(r1, r2)
            goto L_0x00d0
        L_0x00a4:
            java.lang.String r2 = "FirebaseInstanceId"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L_0x00c9
            java.lang.String r2 = "FirebaseInstanceId"
            java.lang.String r3 = "Restricting intent to a specific service: "
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r5 = r4.length()
            if (r5 == 0) goto L_0x00c0
            java.lang.String r3 = r3.concat(r4)
            goto L_0x00c6
        L_0x00c0:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L_0x00c6:
            android.util.Log.d(r2, r3)
        L_0x00c9:
            java.lang.String r2 = r7.getPackageName()
            r8.setClassName(r2, r1)
        L_0x00d0:
            java.lang.Boolean r1 = r6.f48878b     // Catch:{ SecurityException -> 0x012d, IllegalStateException -> 0x0109 }
            if (r1 != 0) goto L_0x00e3
            java.lang.String r1 = "android.permission.WAKE_LOCK"
            int r1 = r7.checkCallingOrSelfPermission(r1)     // Catch:{ SecurityException -> 0x012d, IllegalStateException -> 0x0109 }
            if (r1 != 0) goto L_0x00dd
            r0 = 1
        L_0x00dd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ SecurityException -> 0x012d, IllegalStateException -> 0x0109 }
            r6.f48878b = r0     // Catch:{ SecurityException -> 0x012d, IllegalStateException -> 0x0109 }
        L_0x00e3:
            java.lang.Boolean r0 = r6.f48878b     // Catch:{ SecurityException -> 0x012d, IllegalStateException -> 0x0109 }
            boolean r0 = r0.booleanValue()     // Catch:{ SecurityException -> 0x012d, IllegalStateException -> 0x0109 }
            if (r0 == 0) goto L_0x00f0
            android.content.ComponentName r7 = androidx.legacy.content.WakefulBroadcastReceiver.m4214c(r7, r8)     // Catch:{ SecurityException -> 0x012d, IllegalStateException -> 0x0109 }
            goto L_0x00fb
        L_0x00f0:
            android.content.ComponentName r7 = r7.startService(r8)     // Catch:{ SecurityException -> 0x012d, IllegalStateException -> 0x0109 }
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r0 = "Missing wake lock permission, service start may be delayed"
            android.util.Log.d(r8, r0)     // Catch:{ SecurityException -> 0x012d, IllegalStateException -> 0x0109 }
        L_0x00fb:
            if (r7 != 0) goto L_0x0107
            java.lang.String r7 = "FirebaseInstanceId"
            java.lang.String r8 = "Error while delivering the message: ServiceIntent not found."
            android.util.Log.e(r7, r8)     // Catch:{ SecurityException -> 0x012d, IllegalStateException -> 0x0109 }
            r7 = 404(0x194, float:5.66E-43)
            return r7
        L_0x0107:
            r7 = -1
            return r7
        L_0x0109:
            r7 = move-exception
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r0 = r7.length()
            int r0 = r0 + 45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Failed to start service while in background: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            android.util.Log.e(r8, r7)
            r7 = 402(0x192, float:5.63E-43)
            return r7
        L_0x012d:
            r7 = move-exception
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r0 = "Error while delivering the message to the serviceIntent"
            android.util.Log.e(r8, r0, r7)
            r7 = 401(0x191, float:5.62E-43)
            return r7
        L_0x0138:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0138 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C10434i.m48062h(android.content.Context, android.content.Intent):int");
    }

    /* renamed from: d */
    public final Intent mo41885d() {
        return this.f48880d.poll();
    }

    /* renamed from: e */
    public final int mo41886e(Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Starting service: ".concat(valueOf) : new String("Starting service: "));
        }
        str.hashCode();
        if (str.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
            this.f48879c.offer(intent);
        } else if (!str.equals("com.google.firebase.MESSAGING_EVENT")) {
            Log.w("FirebaseInstanceId", str.length() != 0 ? "Unknown service action: ".concat(str) : new String("Unknown service action: "));
            return 500;
        } else {
            this.f48880d.offer(intent);
        }
        Intent intent2 = new Intent(str);
        intent2.setPackage(context.getPackageName());
        return m48062h(context, intent2);
    }
}
