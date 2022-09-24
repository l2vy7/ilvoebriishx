package com.startapp;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.startapp.C12443y3;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.startapp.z7 */
/* compiled from: Sta */
public class C12467z7 {

    /* renamed from: a */
    public static CountDownLatch f55201a;

    /* renamed from: b */
    public static volatile C11904f8 f55202b;

    /* renamed from: com.startapp.z7$a */
    /* compiled from: Sta */
    public static final class C12468a implements ServiceConnection {

        /* renamed from: a */
        public String f55203a;

        public C12468a(String str) {
            this.f55203a = str;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C12443y3 y3Var;
            int i = C12443y3.C12444a.f55152a;
            if (iBinder == null) {
                y3Var = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof C12443y3)) {
                    y3Var = new C12443y3.C12444a.C12445a(iBinder);
                } else {
                    y3Var = (C12443y3) queryLocalInterface;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f55203a);
            try {
                C12467z7.f55202b = new C11904f8(y3Var.mo46831a(bundle));
            } catch (RemoteException unused) {
            }
            C12467z7.f55201a.countDown();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C12467z7.f55201a.countDown();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:24|25|26|27) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0079 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.startapp.C11904f8 m53807a(android.content.Context r7) {
        /*
            java.lang.String r0 = "com.android.vending"
            com.startapp.f8 r1 = f55202b
            if (r1 != 0) goto L_0x0081
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            r2 = 1
            r1.<init>(r2)     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            f55201a = r1     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            com.startapp.z7$a r1 = new com.startapp.z7$a     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            java.lang.String r3 = r7.getPackageName()     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            r1.<init>(r3)     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            java.lang.String r4 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r3.<init>(r4)     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            java.lang.String r5 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r4.<init>(r0, r5)     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            r3.setComponent(r4)     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            android.content.pm.PackageManager r4 = r7.getPackageManager()     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            r5 = 0
            java.util.List r4 = r4.queryIntentServices(r3, r5)     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            if (r4 == 0) goto L_0x0081
            boolean r6 = r4.isEmpty()     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            if (r6 != 0) goto L_0x0081
            java.lang.Object r4 = r4.get(r5)     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            android.content.pm.ServiceInfo r4 = r4.serviceInfo     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            if (r4 == 0) goto L_0x0081
            java.lang.String r6 = r4.packageName     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            java.lang.String r4 = r4.name     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            boolean r6 = r0.equals(r6)     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            if (r6 == 0) goto L_0x0081
            if (r4 == 0) goto L_0x0081
            android.content.pm.PackageManager r4 = r7.getPackageManager()     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r0, r6)     // Catch:{ NameNotFoundException -> 0x0062 }
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x0062 }
            r4 = 80837300(0x4d17ab4, float:4.924835E-36)
            if (r0 < r4) goto L_0x0063
            r5 = 1
            goto L_0x0063
        L_0x0062:
        L_0x0063:
            if (r5 == 0) goto L_0x0081
            android.content.Intent r0 = new android.content.Intent     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            r0.<init>(r3)     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            boolean r0 = r7.bindService(r0, r1, r2)     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            if (r0 == 0) goto L_0x0081
            java.util.concurrent.CountDownLatch r0 = f55201a     // Catch:{ InterruptedException -> 0x0079 }
            r2 = 1
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0079 }
            r0.await(r2, r4)     // Catch:{ InterruptedException -> 0x0079 }
        L_0x0079:
            com.startapp.C12437y.m53777a((android.content.Context) r7, (android.content.ServiceConnection) r1)     // Catch:{ SecurityException -> 0x0081, all -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r7 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r7)
        L_0x0081:
            com.startapp.f8 r7 = f55202b
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12467z7.m53807a(android.content.Context):com.startapp.f8");
    }
}
