package com.startapp.sdk.cachedservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: Sta */
public final class BackgroundService extends Service {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r0 >= 26) goto L_0x001f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m53416a(android.content.Context r4, boolean r5) {
        /*
            int r0 = com.startapp.C12437y.f55146a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 26
            if (r0 < r2) goto L_0x001e
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ all -> 0x001a }
            java.lang.String r3 = r4.getPackageName()     // Catch:{ all -> 0x001a }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r1)     // Catch:{ all -> 0x001a }
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch:{ all -> 0x001a }
            int r0 = r0.targetSdkVersion     // Catch:{ all -> 0x001a }
            goto L_0x001c
        L_0x001a:
            int r0 = android.os.Build.VERSION.SDK_INT
        L_0x001c:
            if (r0 >= r2) goto L_0x001f
        L_0x001e:
            r1 = 1
        L_0x001f:
            if (r1 != 0) goto L_0x0022
            return
        L_0x0022:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.startapp.sdk.cachedservice.BackgroundService> r1 = com.startapp.sdk.cachedservice.BackgroundService.class
            r0.<init>(r4, r1)
            if (r5 == 0) goto L_0x003f
            java.util.Map<android.app.Activity, java.lang.Integer> r5 = com.startapp.C5015nb.f22145a
            r4.startService(r0)     // Catch:{ all -> 0x0031 }
            goto L_0x0052
        L_0x0031:
            r4 = move-exception
            java.lang.Class<android.os.RemoteException> r5 = android.os.RemoteException.class
            boolean r5 = com.startapp.C5015nb.m22923a((java.lang.Throwable) r4, (java.lang.Class<? extends java.lang.Throwable>) r5)
            if (r5 == 0) goto L_0x003b
            goto L_0x0052
        L_0x003b:
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r4)
            goto L_0x0052
        L_0x003f:
            java.util.Map<android.app.Activity, java.lang.Integer> r5 = com.startapp.C5015nb.f22145a
            r4.stopService(r0)     // Catch:{ all -> 0x0045 }
            goto L_0x0052
        L_0x0045:
            r4 = move-exception
            java.lang.Class<android.os.RemoteException> r5 = android.os.RemoteException.class
            boolean r5 = com.startapp.C5015nb.m22923a((java.lang.Throwable) r4, (java.lang.Class<? extends java.lang.Throwable>) r5)
            if (r5 == 0) goto L_0x004f
            goto L_0x0052
        L_0x004f:
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r4)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.cachedservice.BackgroundService.m53416a(android.content.Context, boolean):void");
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 3;
    }
}
