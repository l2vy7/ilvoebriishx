package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ak */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7506ak {

    /* renamed from: a */
    private int f29657a = 1000;

    /* renamed from: b */
    private int[] f29658b = new int[1000];

    /* renamed from: c */
    private long[] f29659c = new long[1000];

    /* renamed from: d */
    private int[] f29660d = new int[1000];

    /* renamed from: e */
    private int[] f29661e = new int[1000];

    /* renamed from: f */
    private long[] f29662f = new long[1000];

    /* renamed from: g */
    private C7503ah[] f29663g = new C7503ah[1000];

    /* renamed from: h */
    private zzapg[] f29664h = new zzapg[1000];

    /* renamed from: i */
    private int f29665i;

    /* renamed from: j */
    private int f29666j;

    /* renamed from: k */
    private int f29667k;

    /* renamed from: l */
    private int f29668l;

    /* renamed from: m */
    private long f29669m = Long.MIN_VALUE;

    /* renamed from: n */
    private long f29670n = Long.MIN_VALUE;

    /* renamed from: o */
    private boolean f29671o = true;

    /* renamed from: p */
    private boolean f29672p = true;

    /* renamed from: q */
    private zzapg f29673q;

    /* renamed from: a */
    public final int mo30396a() {
        return this.f29666j + this.f29665i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        return -3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo30397b(com.google.android.gms.internal.ads.C8083qe r5, com.google.android.gms.internal.ads.C7940mg r6, boolean r7, boolean r8, com.google.android.gms.internal.ads.zzapg r9, com.google.android.gms.internal.ads.C8408zj r10) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mo30407l()     // Catch:{ all -> 0x0092 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0020
            if (r8 == 0) goto L_0x0012
            r5 = 4
            r6.mo32118c(r5)     // Catch:{ all -> 0x0092 }
            monitor-exit(r4)
            return r3
        L_0x0012:
            com.google.android.gms.internal.ads.zzapg r6 = r4.f29673q     // Catch:{ all -> 0x0092 }
            if (r6 == 0) goto L_0x001e
            if (r7 != 0) goto L_0x001a
            if (r6 == r9) goto L_0x001e
        L_0x001a:
            r5.f37994a = r6     // Catch:{ all -> 0x0092 }
            monitor-exit(r4)
            return r1
        L_0x001e:
            monitor-exit(r4)
            return r2
        L_0x0020:
            if (r7 != 0) goto L_0x0088
            com.google.android.gms.internal.ads.zzapg[] r7 = r4.f29664h     // Catch:{ all -> 0x0092 }
            int r8 = r4.f29667k     // Catch:{ all -> 0x0092 }
            r7 = r7[r8]     // Catch:{ all -> 0x0092 }
            if (r7 == r9) goto L_0x002b
            goto L_0x0088
        L_0x002b:
            java.nio.ByteBuffer r5 = r6.f35510c     // Catch:{ all -> 0x0092 }
            if (r5 == 0) goto L_0x0086
            long[] r5 = r4.f29662f     // Catch:{ all -> 0x0092 }
            r0 = r5[r8]     // Catch:{ all -> 0x0092 }
            r6.f35511d = r0     // Catch:{ all -> 0x0092 }
            int[] r5 = r4.f29661e     // Catch:{ all -> 0x0092 }
            r5 = r5[r8]     // Catch:{ all -> 0x0092 }
            r6.mo32118c(r5)     // Catch:{ all -> 0x0092 }
            int[] r5 = r4.f29660d     // Catch:{ all -> 0x0092 }
            int r7 = r4.f29667k     // Catch:{ all -> 0x0092 }
            r5 = r5[r7]     // Catch:{ all -> 0x0092 }
            r10.f42480a = r5     // Catch:{ all -> 0x0092 }
            long[] r5 = r4.f29659c     // Catch:{ all -> 0x0092 }
            r8 = r5[r7]     // Catch:{ all -> 0x0092 }
            r10.f42481b = r8     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.ads.ah[] r5 = r4.f29663g     // Catch:{ all -> 0x0092 }
            r5 = r5[r7]     // Catch:{ all -> 0x0092 }
            r10.f42483d = r5     // Catch:{ all -> 0x0092 }
            long r7 = r4.f29669m     // Catch:{ all -> 0x0092 }
            long r5 = r6.f35511d     // Catch:{ all -> 0x0092 }
            long r5 = java.lang.Math.max(r7, r5)     // Catch:{ all -> 0x0092 }
            r4.f29669m = r5     // Catch:{ all -> 0x0092 }
            int r5 = r4.f29665i     // Catch:{ all -> 0x0092 }
            int r5 = r5 + -1
            r4.f29665i = r5     // Catch:{ all -> 0x0092 }
            int r6 = r4.f29667k     // Catch:{ all -> 0x0092 }
            int r6 = r6 + 1
            r4.f29667k = r6     // Catch:{ all -> 0x0092 }
            int r7 = r4.f29666j     // Catch:{ all -> 0x0092 }
            int r7 = r7 + 1
            r4.f29666j = r7     // Catch:{ all -> 0x0092 }
            int r7 = r4.f29657a     // Catch:{ all -> 0x0092 }
            r8 = 0
            if (r6 != r7) goto L_0x0074
            r4.f29667k = r8     // Catch:{ all -> 0x0092 }
            r6 = 0
        L_0x0074:
            if (r5 <= 0) goto L_0x007b
            long[] r5 = r4.f29659c     // Catch:{ all -> 0x0092 }
            r6 = r5[r6]     // Catch:{ all -> 0x0092 }
            goto L_0x0082
        L_0x007b:
            long r5 = r10.f42481b     // Catch:{ all -> 0x0092 }
            int r7 = r10.f42480a     // Catch:{ all -> 0x0092 }
            long r7 = (long) r7     // Catch:{ all -> 0x0092 }
            long r5 = r5 + r7
            r6 = r5
        L_0x0082:
            r10.f42482c = r6     // Catch:{ all -> 0x0092 }
            monitor-exit(r4)
            return r3
        L_0x0086:
            monitor-exit(r4)
            return r2
        L_0x0088:
            com.google.android.gms.internal.ads.zzapg[] r6 = r4.f29664h     // Catch:{ all -> 0x0092 }
            int r7 = r4.f29667k     // Catch:{ all -> 0x0092 }
            r6 = r6[r7]     // Catch:{ all -> 0x0092 }
            r5.f37994a = r6     // Catch:{ all -> 0x0092 }
            monitor-exit(r4)
            return r1
        L_0x0092:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7506ak.mo30397b(com.google.android.gms.internal.ads.qe, com.google.android.gms.internal.ads.mg, boolean, boolean, com.google.android.gms.internal.ads.zzapg, com.google.android.gms.internal.ads.zj):int");
    }

    /* renamed from: c */
    public final synchronized long mo30398c() {
        return Math.max(this.f29669m, this.f29670n);
    }

    /* renamed from: d */
    public final synchronized long mo30399d() {
        if (!mo30407l()) {
            return -1;
        }
        int i = this.f29667k;
        int i2 = this.f29665i;
        int i3 = i + i2;
        int i4 = this.f29657a;
        int i5 = (i3 - 1) % i4;
        this.f29667k = i3 % i4;
        this.f29666j += i2;
        this.f29665i = 0;
        return this.f29659c[i5] + ((long) this.f29660d[i5]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        return -1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo30400e(long r10, boolean r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.mo30407l()     // Catch:{ all -> 0x005e }
            r1 = -1
            if (r0 == 0) goto L_0x005c
            long[] r0 = r9.f29662f     // Catch:{ all -> 0x005e }
            int r3 = r9.f29667k     // Catch:{ all -> 0x005e }
            r4 = r0[r3]     // Catch:{ all -> 0x005e }
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            goto L_0x005c
        L_0x0014:
            long r4 = r9.f29670n     // Catch:{ all -> 0x005e }
            r0 = 0
            r6 = -1
            int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0021
            if (r12 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            monitor-exit(r9)
            return r1
        L_0x0021:
            r12 = -1
        L_0x0022:
            int r4 = r9.f29668l     // Catch:{ all -> 0x005e }
            if (r3 == r4) goto L_0x0040
            long[] r4 = r9.f29662f     // Catch:{ all -> 0x005e }
            r7 = r4[r3]     // Catch:{ all -> 0x005e }
            int r4 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x002f
            goto L_0x0040
        L_0x002f:
            int[] r4 = r9.f29661e     // Catch:{ all -> 0x005e }
            r4 = r4[r3]     // Catch:{ all -> 0x005e }
            r5 = 1
            r4 = r4 & r5
            if (r5 != r4) goto L_0x0038
            r12 = r0
        L_0x0038:
            int r3 = r3 + 1
            int r4 = r9.f29657a     // Catch:{ all -> 0x005e }
            int r3 = r3 % r4
            int r0 = r0 + 1
            goto L_0x0022
        L_0x0040:
            if (r12 != r6) goto L_0x0044
            monitor-exit(r9)
            return r1
        L_0x0044:
            int r10 = r9.f29667k     // Catch:{ all -> 0x005e }
            int r10 = r10 + r12
            int r11 = r9.f29657a     // Catch:{ all -> 0x005e }
            int r10 = r10 % r11
            r9.f29667k = r10     // Catch:{ all -> 0x005e }
            int r11 = r9.f29666j     // Catch:{ all -> 0x005e }
            int r11 = r11 + r12
            r9.f29666j = r11     // Catch:{ all -> 0x005e }
            int r11 = r9.f29665i     // Catch:{ all -> 0x005e }
            int r11 = r11 - r12
            r9.f29665i = r11     // Catch:{ all -> 0x005e }
            long[] r11 = r9.f29659c     // Catch:{ all -> 0x005e }
            r10 = r11[r10]     // Catch:{ all -> 0x005e }
            monitor-exit(r9)
            return r10
        L_0x005c:
            monitor-exit(r9)
            return r1
        L_0x005e:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x0062
        L_0x0061:
            throw r10
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7506ak.mo30400e(long, boolean):long");
    }

    /* renamed from: f */
    public final synchronized zzapg mo30401f() {
        if (this.f29672p) {
            return null;
        }
        return this.f29673q;
    }

    /* renamed from: g */
    public final void mo30402g() {
        this.f29666j = 0;
        this.f29667k = 0;
        this.f29668l = 0;
        this.f29665i = 0;
        this.f29671o = true;
    }

    /* renamed from: h */
    public final synchronized void mo30403h(long j, int i, long j2, int i2, C7503ah ahVar) {
        if (this.f29671o) {
            if ((i & 1) != 0) {
                this.f29671o = false;
            } else {
                return;
            }
        }
        C8195tl.m37900e(!this.f29672p);
        mo30404i(j);
        long[] jArr = this.f29662f;
        int i3 = this.f29668l;
        jArr[i3] = j;
        long[] jArr2 = this.f29659c;
        jArr2[i3] = j2;
        this.f29660d[i3] = i2;
        this.f29661e[i3] = i;
        this.f29663g[i3] = ahVar;
        this.f29664h[i3] = this.f29673q;
        this.f29658b[i3] = 0;
        int i4 = this.f29665i + 1;
        this.f29665i = i4;
        int i5 = this.f29657a;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            int[] iArr = new int[i6];
            long[] jArr3 = new long[i6];
            long[] jArr4 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            C7503ah[] ahVarArr = new C7503ah[i6];
            zzapg[] zzapgArr = new zzapg[i6];
            int i7 = this.f29667k;
            int i8 = i5 - i7;
            System.arraycopy(jArr2, i7, jArr3, 0, i8);
            System.arraycopy(this.f29662f, this.f29667k, jArr4, 0, i8);
            System.arraycopy(this.f29661e, this.f29667k, iArr2, 0, i8);
            System.arraycopy(this.f29660d, this.f29667k, iArr3, 0, i8);
            System.arraycopy(this.f29663g, this.f29667k, ahVarArr, 0, i8);
            System.arraycopy(this.f29664h, this.f29667k, zzapgArr, 0, i8);
            System.arraycopy(this.f29658b, this.f29667k, iArr, 0, i8);
            int i9 = this.f29667k;
            System.arraycopy(this.f29659c, 0, jArr3, i8, i9);
            System.arraycopy(this.f29662f, 0, jArr4, i8, i9);
            System.arraycopy(this.f29661e, 0, iArr2, i8, i9);
            System.arraycopy(this.f29660d, 0, iArr3, i8, i9);
            System.arraycopy(this.f29663g, 0, ahVarArr, i8, i9);
            System.arraycopy(this.f29664h, 0, zzapgArr, i8, i9);
            System.arraycopy(this.f29658b, 0, iArr, i8, i9);
            this.f29659c = jArr3;
            this.f29662f = jArr4;
            this.f29661e = iArr2;
            this.f29660d = iArr3;
            this.f29663g = ahVarArr;
            this.f29664h = zzapgArr;
            this.f29658b = iArr;
            this.f29667k = 0;
            int i10 = this.f29657a;
            this.f29668l = i10;
            this.f29665i = i10;
            this.f29657a = i6;
            return;
        }
        int i11 = i3 + 1;
        this.f29668l = i11;
        if (i11 == i5) {
            this.f29668l = 0;
        }
    }

    /* renamed from: i */
    public final synchronized void mo30404i(long j) {
        this.f29670n = Math.max(this.f29670n, j);
    }

    /* renamed from: j */
    public final void mo30405j() {
        this.f29669m = Long.MIN_VALUE;
        this.f29670n = Long.MIN_VALUE;
    }

    /* renamed from: k */
    public final synchronized boolean mo30406k(zzapg zzapg) {
        if (zzapg == null) {
            this.f29672p = true;
            return false;
        }
        this.f29672p = false;
        if (C7836jm.m33653o(zzapg, this.f29673q)) {
            return false;
        }
        this.f29673q = zzapg;
        return true;
    }

    /* renamed from: l */
    public final synchronized boolean mo30407l() {
        return this.f29665i != 0;
    }
}
