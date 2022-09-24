package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ja */
/* compiled from: IMASDK */
public final class C4089ja extends Exception {

    /* renamed from: a */
    public final int f17507a;

    /* renamed from: b */
    public final String f17508b;

    /* renamed from: c */
    public final int f17509c;

    /* renamed from: d */
    public final C4120ke f17510d;

    /* renamed from: e */
    public final int f17511e;

    /* renamed from: f */
    public final long f17512f;

    /* renamed from: g */
    public final aba f17513g;

    /* renamed from: h */
    final boolean f17514h;

    /* renamed from: i */
    private final Throwable f17515i;

    private C4089ja(int i, Throwable th) {
        this(i, th, (String) null, -1, (C4120ke) null, 4, false);
    }

    /* renamed from: a */
    public static C4089ja m17487a(IOException iOException) {
        return new C4089ja(0, iOException);
    }

    /* renamed from: b */
    public static C4089ja m17488b(Exception exc) {
        return new C4089ja(1, exc, (String) null, -1, (C4120ke) null, 4, false);
    }

    /* renamed from: c */
    public static C4089ja m17489c(Throwable th, String str, int i, C4120ke keVar, int i2, boolean z) {
        return new C4089ja(1, th, str, i, keVar, keVar == null ? 4 : i2, z);
    }

    /* renamed from: d */
    public static C4089ja m17490d(RuntimeException runtimeException) {
        return new C4089ja(2, runtimeException);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C4089ja mo15986e(aba aba) {
        return new C4089ja(getMessage(), this.f17515i, this.f17507a, this.f17508b, this.f17509c, this.f17510d, this.f17511e, aba, this.f17512f, this.f17514h);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C4089ja(int r13, java.lang.Throwable r14, java.lang.String r15, int r16, com.google.ads.interactivemedia.p039v3.internal.C4120ke r17, int r18, boolean r19) {
        /*
            r12 = this;
            r3 = r13
            if (r3 == 0) goto L_0x0050
            r0 = 1
            if (r3 == r0) goto L_0x000c
            java.lang.String r0 = "Unexpected runtime error"
            r4 = r15
            r5 = r16
            goto L_0x0055
        L_0x000c:
            java.lang.String r0 = java.lang.String.valueOf(r17)
            java.lang.String r1 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17454d(r18)
            java.lang.String r2 = java.lang.String.valueOf(r15)
            int r2 = r2.length()
            int r4 = r0.length()
            int r5 = r1.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r2 = r2 + 53
            int r2 = r2 + r4
            int r2 = r2 + r5
            r6.<init>(r2)
            r4 = r15
            r6.append(r15)
            java.lang.String r2 = " error, index="
            r6.append(r2)
            r5 = r16
            r6.append(r5)
            java.lang.String r2 = ", format="
            r6.append(r2)
            r6.append(r0)
            java.lang.String r0 = ", format_supported="
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = r6.toString()
            goto L_0x0055
        L_0x0050:
            r4 = r15
            r5 = r16
            java.lang.String r0 = "Source error"
        L_0x0055:
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0081
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            java.lang.String r6 = "null"
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r2 = r2 + 2
            int r2 = r2 + r6
            r7.<init>(r2)
            r7.append(r0)
            java.lang.String r0 = ": "
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = r7.toString()
        L_0x0081:
            r1 = r0
            r8 = 0
            long r9 = android.os.SystemClock.elapsedRealtime()
            r0 = r12
            r2 = r14
            r3 = r13
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4089ja.<init>(int, java.lang.Throwable, java.lang.String, int, com.google.ads.interactivemedia.v3.internal.ke, int, boolean):void");
    }

    private C4089ja(String str, Throwable th, int i, String str2, int i2, C4120ke keVar, int i3, aba aba, long j, boolean z) {
        super(str, th);
        boolean z2 = true;
        if (z) {
            if (i == 1) {
                i = 1;
            } else {
                z2 = false;
            }
        }
        aup.m14885p(z2);
        this.f17507a = i;
        this.f17515i = th;
        this.f17508b = str2;
        this.f17509c = i2;
        this.f17510d = keVar;
        this.f17511e = i3;
        this.f17513g = aba;
        this.f17512f = j;
        this.f17514h = z;
    }
}
