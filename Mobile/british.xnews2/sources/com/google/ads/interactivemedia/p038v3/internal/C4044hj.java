package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hj */
/* compiled from: IMASDK */
public final class C4044hj extends C4068ig {

    /* renamed from: h */
    private static final C4069ih<C3999fs> f17389h = new C4069ih<>();

    /* renamed from: i */
    private final Context f17390i;

    /* renamed from: j */
    private final C3980f f17391j;

    public C4044hj(C4037hc hcVar, C4115k kVar, int i, Context context, C3980f fVar) {
        super(hcVar, "p0TRkXE/NcSM6BGJMq+2rh+IfZ8Yp9IA3qvak/Mk1iX+ge9M5970NOJ17+Rrke0X", "xE1tXj7CYUbdHr3leN0Im7M6KUUnC9YYnjqy9MQetUk=", kVar, i, 27);
        this.f17390i = context;
        this.f17391j = fVar;
    }

    /* renamed from: b */
    public static String m17342b(C3980f fVar) {
        if (fVar == null || !fVar.mo15766d() || C4040hf.m17335c(fVar.mo15767e().mo15984a())) {
            return null;
        }
        return fVar.mo15767e().mo15984a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:44|45|(1:47)|48|(1:52)|53|54|(1:56)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0102 */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0108  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15910a() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r11 = this;
            com.google.ads.interactivemedia.v3.internal.ih<com.google.ads.interactivemedia.v3.internal.fs> r0 = f17389h
            android.content.Context r1 = r11.f17390i
            java.lang.String r1 = r1.getPackageName()
            java.util.concurrent.atomic.AtomicReference r0 = r0.mo15917a(r1)
            monitor-enter(r0)
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0141 }
            com.google.ads.interactivemedia.v3.internal.fs r1 = (com.google.ads.interactivemedia.p038v3.internal.C3999fs) r1     // Catch:{ all -> 0x0141 }
            if (r1 == 0) goto L_0x0031
            java.lang.String r2 = r1.f17079a     // Catch:{ all -> 0x0141 }
            boolean r2 = com.google.ads.interactivemedia.p038v3.internal.C4040hf.m17335c(r2)     // Catch:{ all -> 0x0141 }
            if (r2 != 0) goto L_0x0031
            java.lang.String r2 = r1.f17079a     // Catch:{ all -> 0x0141 }
            java.lang.String r3 = "E"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0141 }
            if (r2 != 0) goto L_0x0031
            java.lang.String r1 = r1.f17079a     // Catch:{ all -> 0x0141 }
            java.lang.String r2 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0141 }
            if (r1 == 0) goto L_0x010d
        L_0x0031:
            com.google.ads.interactivemedia.v3.internal.f r1 = r11.f17391j     // Catch:{ all -> 0x0141 }
            java.lang.String r1 = m17342b(r1)     // Catch:{ all -> 0x0141 }
            boolean r1 = com.google.ads.interactivemedia.p038v3.internal.C4040hf.m17335c(r1)     // Catch:{ all -> 0x0141 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0042
            com.google.ads.interactivemedia.v3.internal.i r1 = com.google.ads.interactivemedia.p038v3.internal.C4061i.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED     // Catch:{ all -> 0x0141 }
            goto L_0x007f
        L_0x0042:
            com.google.ads.interactivemedia.v3.internal.f r1 = r11.f17391j     // Catch:{ all -> 0x0141 }
            java.lang.String r4 = m17342b(r1)     // Catch:{ all -> 0x0141 }
            boolean r4 = com.google.ads.interactivemedia.p038v3.internal.C4040hf.m17335c(r4)     // Catch:{ all -> 0x0141 }
            if (r4 != 0) goto L_0x0051
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0141 }
            goto L_0x006c
        L_0x0051:
            if (r1 == 0) goto L_0x0067
            boolean r4 = r1.mo15764a()     // Catch:{ all -> 0x0141 }
            if (r4 == 0) goto L_0x0067
            com.google.ads.interactivemedia.v3.internal.g r1 = r1.mo15765c()     // Catch:{ all -> 0x0141 }
            com.google.ads.interactivemedia.v3.internal.i r1 = r1.mo15861a()     // Catch:{ all -> 0x0141 }
            com.google.ads.interactivemedia.v3.internal.i r4 = com.google.ads.interactivemedia.p038v3.internal.C4061i.ENUM_SIGNAL_SOURCE_GASS     // Catch:{ all -> 0x0141 }
            if (r1 != r4) goto L_0x0067
            r1 = 1
            goto L_0x0068
        L_0x0067:
            r1 = 0
        L_0x0068:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0141 }
        L_0x006c:
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0141 }
            if (r1 == 0) goto L_0x007d
            com.google.ads.interactivemedia.v3.internal.hc r1 = r11.f17420a     // Catch:{ all -> 0x0141 }
            boolean r1 = r1.mo15901i()     // Catch:{ all -> 0x0141 }
            if (r1 == 0) goto L_0x007d
            com.google.ads.interactivemedia.v3.internal.i r1 = com.google.ads.interactivemedia.p038v3.internal.C4061i.ENUM_SIGNAL_SOURCE_GASS     // Catch:{ all -> 0x0141 }
            goto L_0x007f
        L_0x007d:
            com.google.ads.interactivemedia.v3.internal.i r1 = com.google.ads.interactivemedia.p038v3.internal.C4061i.ENUM_SIGNAL_SOURCE_ADSHIELD     // Catch:{ all -> 0x0141 }
        L_0x007f:
            com.google.ads.interactivemedia.v3.internal.i r4 = com.google.ads.interactivemedia.p038v3.internal.C4061i.ENUM_SIGNAL_SOURCE_ADSHIELD     // Catch:{ all -> 0x0141 }
            if (r1 != r4) goto L_0x0085
            r4 = 1
            goto L_0x0086
        L_0x0085:
            r4 = 0
        L_0x0086:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0141 }
            com.google.ads.interactivemedia.v3.internal.aod<java.lang.Boolean> r5 = com.google.ads.interactivemedia.p038v3.internal.aok.f15485a     // Catch:{ all -> 0x0141 }
            java.lang.Object r5 = r5.mo14149f()     // Catch:{ all -> 0x0141 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0141 }
            com.google.ads.interactivemedia.v3.internal.aod<java.lang.String> r6 = com.google.ads.interactivemedia.p038v3.internal.aok.f15486b     // Catch:{ all -> 0x0141 }
            java.lang.Object r6 = r6.mo14149f()     // Catch:{ all -> 0x0141 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0141 }
            java.lang.reflect.Method r7 = r11.f17424e     // Catch:{ all -> 0x0141 }
            r8 = 4
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0141 }
            android.content.Context r10 = r11.f17390i     // Catch:{ all -> 0x0141 }
            r9[r3] = r10     // Catch:{ all -> 0x0141 }
            r9[r2] = r4     // Catch:{ all -> 0x0141 }
            r2 = 2
            r9[r2] = r5     // Catch:{ all -> 0x0141 }
            r2 = 3
            r9[r2] = r6     // Catch:{ all -> 0x0141 }
            r3 = 0
            java.lang.Object r4 = r7.invoke(r3, r9)     // Catch:{ all -> 0x0141 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0141 }
            com.google.ads.interactivemedia.v3.internal.fs r5 = new com.google.ads.interactivemedia.v3.internal.fs     // Catch:{ all -> 0x0141 }
            r5.<init>(r4)     // Catch:{ all -> 0x0141 }
            java.lang.String r4 = r5.f17079a     // Catch:{ all -> 0x0141 }
            boolean r4 = com.google.ads.interactivemedia.p038v3.internal.C4040hf.m17335c(r4)     // Catch:{ all -> 0x0141 }
            if (r4 != 0) goto L_0x00c9
            java.lang.String r4 = r5.f17079a     // Catch:{ all -> 0x0141 }
            java.lang.String r6 = "E"
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0141 }
            if (r4 == 0) goto L_0x010a
        L_0x00c9:
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0141 }
            if (r1 == r2) goto L_0x00df
            if (r1 == r8) goto L_0x00d2
            goto L_0x010a
        L_0x00d2:
            com.google.ads.interactivemedia.v3.internal.f r1 = r11.f17391j     // Catch:{ all -> 0x0141 }
            com.google.ads.interactivemedia.v3.internal.j r1 = r1.mo15767e()     // Catch:{ all -> 0x0141 }
            java.lang.String r1 = r1.mo15984a()     // Catch:{ all -> 0x0141 }
            r5.f17079a = r1     // Catch:{ all -> 0x0141 }
            goto L_0x010a
        L_0x00df:
            com.google.ads.interactivemedia.v3.internal.hc r1 = r11.f17420a     // Catch:{ InterruptedException | ExecutionException -> 0x0102 }
            java.util.concurrent.Future r1 = r1.mo15904l()     // Catch:{ InterruptedException | ExecutionException -> 0x0102 }
            if (r1 == 0) goto L_0x00f0
            com.google.ads.interactivemedia.v3.internal.hc r1 = r11.f17420a     // Catch:{ InterruptedException | ExecutionException -> 0x0102 }
            java.util.concurrent.Future r1 = r1.mo15904l()     // Catch:{ InterruptedException | ExecutionException -> 0x0102 }
            r1.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0102 }
        L_0x00f0:
            com.google.ads.interactivemedia.v3.internal.hc r1 = r11.f17420a     // Catch:{ InterruptedException | ExecutionException -> 0x0102 }
            com.google.ads.interactivemedia.v3.internal.u r1 = r1.mo15903k()     // Catch:{ InterruptedException | ExecutionException -> 0x0102 }
            if (r1 == 0) goto L_0x0102
            boolean r2 = r1.mo16666a()     // Catch:{ InterruptedException | ExecutionException -> 0x0102 }
            if (r2 == 0) goto L_0x0102
            java.lang.String r3 = r1.mo16667c()     // Catch:{ InterruptedException | ExecutionException -> 0x0102 }
        L_0x0102:
            boolean r1 = com.google.ads.interactivemedia.p038v3.internal.C4040hf.m17335c(r3)     // Catch:{ all -> 0x0141 }
            if (r1 != 0) goto L_0x010a
            r5.f17079a = r3     // Catch:{ all -> 0x0141 }
        L_0x010a:
            r0.set(r5)     // Catch:{ all -> 0x0141 }
        L_0x010d:
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0141 }
            com.google.ads.interactivemedia.v3.internal.fs r1 = (com.google.ads.interactivemedia.p038v3.internal.C3999fs) r1     // Catch:{ all -> 0x0141 }
            monitor-exit(r0)     // Catch:{ all -> 0x0141 }
            com.google.ads.interactivemedia.v3.internal.k r2 = r11.f17423d
            monitor-enter(r2)
            if (r1 == 0) goto L_0x013c
            com.google.ads.interactivemedia.v3.internal.k r0 = r11.f17423d     // Catch:{ all -> 0x013e }
            java.lang.String r3 = r1.f17079a     // Catch:{ all -> 0x013e }
            r0.mo16084s(r3)     // Catch:{ all -> 0x013e }
            com.google.ads.interactivemedia.v3.internal.k r0 = r11.f17423d     // Catch:{ all -> 0x013e }
            long r3 = r1.f17080b     // Catch:{ all -> 0x013e }
            r0.mo16064V(r3)     // Catch:{ all -> 0x013e }
            com.google.ads.interactivemedia.v3.internal.k r0 = r11.f17423d     // Catch:{ all -> 0x013e }
            java.lang.String r3 = r1.f17081c     // Catch:{ all -> 0x013e }
            r0.mo16065W(r3)     // Catch:{ all -> 0x013e }
            com.google.ads.interactivemedia.v3.internal.k r0 = r11.f17423d     // Catch:{ all -> 0x013e }
            java.lang.String r3 = r1.f17082d     // Catch:{ all -> 0x013e }
            r0.mo16070e(r3)     // Catch:{ all -> 0x013e }
            com.google.ads.interactivemedia.v3.internal.k r0 = r11.f17423d     // Catch:{ all -> 0x013e }
            java.lang.String r1 = r1.f17083e     // Catch:{ all -> 0x013e }
            r0.mo16083r(r1)     // Catch:{ all -> 0x013e }
        L_0x013c:
            monitor-exit(r2)     // Catch:{ all -> 0x013e }
            return
        L_0x013e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x013e }
            throw r0
        L_0x0141:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0141 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4044hj.mo15910a():void");
    }
}
