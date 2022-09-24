package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ha */
/* compiled from: IMASDK */
final class C4035ha implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f17353a;

    /* renamed from: b */
    final /* synthetic */ C4037hc f17354b;

    C4035ha(C4037hc hcVar, int i) {
        this.f17354b = hcVar;
        this.f17353a = i;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000c */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.google.ads.interactivemedia.v3.internal.hc r0 = r5.f17354b
            int r1 = r5.f17353a
            if (r1 <= 0) goto L_0x000c
            int r1 = r1 * 1000
            long r1 = (long) r1
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x000c }
        L_0x000c:
            android.content.Context r1 = r0.f17358a     // Catch:{ all -> 0x002e }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x002e }
            android.content.Context r2 = r0.f17358a     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ all -> 0x002e }
            r3 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch:{ all -> 0x002e }
            android.content.Context r0 = r0.f17358a     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r0.getPackageName()     // Catch:{ all -> 0x002e }
            int r1 = r1.versionCode     // Catch:{ all -> 0x002e }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x002e }
            com.google.ads.interactivemedia.v3.internal.u r0 = com.google.ads.interactivemedia.p038v3.internal.apm.m14505a(r0, r2, r1)     // Catch:{ all -> 0x002e }
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            com.google.ads.interactivemedia.v3.internal.hc r1 = r5.f17354b
            r1.f17369m = r0
            int r1 = r5.f17353a
            r2 = 4
            if (r1 >= r2) goto L_0x0076
            if (r0 != 0) goto L_0x003c
            goto L_0x006d
        L_0x003c:
            boolean r1 = r0.mo16666a()
            if (r1 == 0) goto L_0x006d
            java.lang.String r1 = r0.mo16667c()
            java.lang.String r2 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x006d
            boolean r1 = r0.mo16668d()
            if (r1 == 0) goto L_0x006d
            com.google.ads.interactivemedia.v3.internal.ad r1 = r0.mo16669e()
            boolean r1 = r1.mo13479a()
            if (r1 == 0) goto L_0x006d
            com.google.ads.interactivemedia.v3.internal.ad r0 = r0.mo16669e()
            long r0 = r0.mo13481c()
            r2 = -2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x006d
            goto L_0x0076
        L_0x006d:
            com.google.ads.interactivemedia.v3.internal.hc r0 = r5.f17354b
            int r1 = r5.f17353a
            int r1 = r1 + 1
            r0.mo15908r(r1)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4035ha.run():void");
    }
}
