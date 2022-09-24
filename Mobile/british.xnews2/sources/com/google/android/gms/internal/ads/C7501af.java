package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.af */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C7501af {

    /* renamed from: a */
    public static final C7501af f29622a = new C8331xe();

    /* renamed from: a */
    public abstract int mo30363a(Object obj);

    /* renamed from: b */
    public abstract int mo30364b();

    /* renamed from: c */
    public abstract int mo30365c();

    /* renamed from: d */
    public abstract C8367ye mo30366d(int i, C8367ye yeVar, boolean z);

    /* renamed from: e */
    public abstract C8403ze mo30367e(int i, C8403ze zeVar, boolean z, long j);

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if ((mo30365c() - 1) == 0) goto L_0x0020;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo30368f(int r3, com.google.android.gms.internal.ads.C8367ye r4, com.google.android.gms.internal.ads.C8403ze r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.mo30366d(r3, r4, r0)
            r2.mo30369g(r0, r5, r0)
            r4 = 1
            if (r3 != 0) goto L_0x0031
            r3 = -1
            if (r6 == 0) goto L_0x0022
            if (r6 == r4) goto L_0x0020
            r1 = 2
            if (r6 != r1) goto L_0x001a
            int r6 = r2.mo30365c()
            int r6 = r6 + r3
            if (r6 != 0) goto L_0x002a
            goto L_0x0020
        L_0x001a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L_0x0020:
            r4 = 0
            goto L_0x002a
        L_0x0022:
            int r6 = r2.mo30365c()
            int r6 = r6 + r3
            if (r6 != 0) goto L_0x002a
            r4 = -1
        L_0x002a:
            if (r4 != r3) goto L_0x002d
            return r3
        L_0x002d:
            r2.mo30369g(r4, r5, r0)
            return r0
        L_0x0031:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7501af.mo30368f(int, com.google.android.gms.internal.ads.ye, com.google.android.gms.internal.ads.ze, int):int");
    }

    /* renamed from: g */
    public final C8403ze mo30369g(int i, C8403ze zeVar, boolean z) {
        return mo30367e(i, zeVar, false, 0);
    }

    /* renamed from: h */
    public final boolean mo30370h() {
        return mo30365c() == 0;
    }
}
