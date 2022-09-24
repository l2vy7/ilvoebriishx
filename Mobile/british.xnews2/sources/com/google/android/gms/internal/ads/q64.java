package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.Log;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q64 implements ad4 {

    /* renamed from: A */
    private C8281w f37884A;

    /* renamed from: B */
    private boolean f37885B;

    /* renamed from: C */
    private boolean f37886C;

    /* renamed from: D */
    private m24 f37887D;

    /* renamed from: a */
    private final k64 f37888a;

    /* renamed from: b */
    private final m64 f37889b = new m64();

    /* renamed from: c */
    private final w64<o64> f37890c = new w64<>(l64.f34923a);

    /* renamed from: d */
    private final l24 f37891d;

    /* renamed from: e */
    private final f24 f37892e;

    /* renamed from: f */
    private final Looper f37893f;

    /* renamed from: g */
    private p64 f37894g;

    /* renamed from: h */
    private C8281w f37895h;

    /* renamed from: i */
    private int f37896i = 1000;

    /* renamed from: j */
    private int[] f37897j = new int[1000];

    /* renamed from: k */
    private long[] f37898k = new long[1000];

    /* renamed from: l */
    private int[] f37899l = new int[1000];

    /* renamed from: m */
    private int[] f37900m = new int[1000];

    /* renamed from: n */
    private long[] f37901n = new long[1000];

    /* renamed from: o */
    private zc4[] f37902o = new zc4[1000];

    /* renamed from: p */
    private int f37903p;

    /* renamed from: q */
    private int f37904q;

    /* renamed from: r */
    private int f37905r;

    /* renamed from: s */
    private int f37906s;

    /* renamed from: t */
    private long f37907t = Long.MIN_VALUE;

    /* renamed from: u */
    private long f37908u = Long.MIN_VALUE;

    /* renamed from: v */
    private long f37909v = Long.MIN_VALUE;

    /* renamed from: w */
    private boolean f37910w;

    /* renamed from: x */
    private boolean f37911x = true;

    /* renamed from: y */
    private boolean f37912y = true;

    /* renamed from: z */
    private C8281w f37913z;

    protected q64(o84 o84, Looper looper, l24 l24, f24 f24, byte[] bArr) {
        this.f37893f = looper;
        this.f37891d = l24;
        this.f37892e = f24;
        this.f37888a = new k64(o84, (byte[]) null);
    }

    /* renamed from: A */
    static /* synthetic */ void m36313A(o64 o64) {
        k24 k24 = o64.f36307b;
        int i = j24.f33733a;
    }

    /* renamed from: L */
    private final int m36314L(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f37901n[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.f37900m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f37896i) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: g */
    private final int m36315g(int i) {
        int i2 = this.f37905r + i;
        int i3 = this.f37896i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        return -3;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized int m36316h(com.google.android.gms.internal.ads.mw3 r6, com.google.android.gms.internal.ads.s51 r7, boolean r8, boolean r9, com.google.android.gms.internal.ads.m64 r10) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r7.f20811d = r0     // Catch:{ all -> 0x0083 }
            boolean r0 = r5.m36324p()     // Catch:{ all -> 0x0083 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x002b
            if (r9 != 0) goto L_0x0025
            boolean r9 = r5.f37910w     // Catch:{ all -> 0x0083 }
            if (r9 == 0) goto L_0x0014
            goto L_0x0025
        L_0x0014:
            com.google.android.gms.internal.ads.w r7 = r5.f37884A     // Catch:{ all -> 0x0083 }
            if (r7 == 0) goto L_0x0023
            if (r8 != 0) goto L_0x001e
            com.google.android.gms.internal.ads.w r8 = r5.f37895h     // Catch:{ all -> 0x0083 }
            if (r7 == r8) goto L_0x0023
        L_0x001e:
            r5.m36321m(r7, r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r1
        L_0x0023:
            monitor-exit(r5)
            return r2
        L_0x0025:
            r6 = 4
            r7.mo33437c(r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r3
        L_0x002b:
            com.google.android.gms.internal.ads.w64<com.google.android.gms.internal.ads.o64> r9 = r5.f37890c     // Catch:{ all -> 0x0083 }
            int r0 = r5.f37904q     // Catch:{ all -> 0x0083 }
            int r4 = r5.f37906s     // Catch:{ all -> 0x0083 }
            int r0 = r0 + r4
            java.lang.Object r9 = r9.mo35562a(r0)     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.o64 r9 = (com.google.android.gms.internal.ads.o64) r9     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.w r9 = r9.f36306a     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x007e
            com.google.android.gms.internal.ads.w r8 = r5.f37895h     // Catch:{ all -> 0x0083 }
            if (r9 == r8) goto L_0x0041
            goto L_0x007e
        L_0x0041:
            int r6 = r5.f37906s     // Catch:{ all -> 0x0083 }
            int r6 = r5.m36315g(r6)     // Catch:{ all -> 0x0083 }
            boolean r8 = r5.m36325q(r6)     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x0052
            r6 = 1
            r7.f20811d = r6     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r2
        L_0x0052:
            int[] r8 = r5.f37900m     // Catch:{ all -> 0x0083 }
            r8 = r8[r6]     // Catch:{ all -> 0x0083 }
            r7.mo33437c(r8)     // Catch:{ all -> 0x0083 }
            long[] r8 = r5.f37901n     // Catch:{ all -> 0x0083 }
            r0 = r8[r6]     // Catch:{ all -> 0x0083 }
            r7.f20812e = r0     // Catch:{ all -> 0x0083 }
            long r8 = r5.f37907t     // Catch:{ all -> 0x0083 }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x006a
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.mo33436a(r8)     // Catch:{ all -> 0x0083 }
        L_0x006a:
            int[] r7 = r5.f37899l     // Catch:{ all -> 0x0083 }
            r7 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.f35419a = r7     // Catch:{ all -> 0x0083 }
            long[] r7 = r5.f37898k     // Catch:{ all -> 0x0083 }
            r8 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.f35420b = r8     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.zc4[] r7 = r5.f37902o     // Catch:{ all -> 0x0083 }
            r6 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.f35421c = r6     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r3
        L_0x007e:
            r5.m36321m(r9, r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r1
        L_0x0083:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q64.m36316h(com.google.android.gms.internal.ads.mw3, com.google.android.gms.internal.ads.s51, boolean, boolean, com.google.android.gms.internal.ads.m64):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized long m36317i(long r10, boolean r12, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r12 = r9.f37903p     // Catch:{ all -> 0x002f }
            r0 = -1
            if (r12 == 0) goto L_0x002d
            long[] r2 = r9.f37901n     // Catch:{ all -> 0x002f }
            int r4 = r9.f37905r     // Catch:{ all -> 0x002f }
            r5 = r2[r4]     // Catch:{ all -> 0x002f }
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r13 == 0) goto L_0x001a
            int r13 = r9.f37906s     // Catch:{ all -> 0x002f }
            if (r13 == r12) goto L_0x001a
            int r12 = r13 + 1
        L_0x001a:
            r5 = r12
            r8 = 0
            r3 = r9
            r6 = r10
            int r10 = r3.m36314L(r4, r5, r6, r8)     // Catch:{ all -> 0x002f }
            r11 = -1
            if (r10 != r11) goto L_0x0027
            monitor-exit(r9)
            return r0
        L_0x0027:
            long r10 = r9.m36319k(r10)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)
            return r10
        L_0x002d:
            monitor-exit(r9)
            return r0
        L_0x002f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q64.m36317i(long, boolean, boolean):long");
    }

    /* renamed from: j */
    private final synchronized long m36318j() {
        int i = this.f37903p;
        if (i == 0) {
            return -1;
        }
        return m36319k(i);
    }

    /* renamed from: k */
    private final long m36319k(int i) {
        long j = this.f37908u;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int g = m36315g(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                j2 = Math.max(j2, this.f37901n[g]);
                if ((this.f37900m[g] & 1) != 0) {
                    break;
                }
                g--;
                if (g == -1) {
                    g = this.f37896i - 1;
                }
            }
        }
        this.f37908u = Math.max(j, j2);
        this.f37903p -= i;
        int i3 = this.f37904q + i;
        this.f37904q = i3;
        int i4 = this.f37905r + i;
        this.f37905r = i4;
        int i5 = this.f37896i;
        if (i4 >= i5) {
            this.f37905r = i4 - i5;
        }
        int i6 = this.f37906s - i;
        this.f37906s = i6;
        if (i6 < 0) {
            this.f37906s = 0;
        }
        this.f37890c.mo35566e(i3);
        if (this.f37903p != 0) {
            return this.f37898k[this.f37905r];
        }
        int i7 = this.f37905r;
        if (i7 == 0) {
            i7 = this.f37896i;
        }
        int i8 = i7 - 1;
        return this.f37898k[i8] + ((long) this.f37899l[i8]);
    }

    /* renamed from: l */
    private final synchronized void m36320l(long j, int i, long j2, int i2, zc4 zc4) {
        int i3 = this.f37903p;
        if (i3 > 0) {
            int g = m36315g(i3 - 1);
            nu1.m20745d(this.f37898k[g] + ((long) this.f37899l[g]) <= j2);
        }
        this.f37910w = (536870912 & i) != 0;
        this.f37909v = Math.max(this.f37909v, j);
        int g2 = m36315g(this.f37903p);
        this.f37901n[g2] = j;
        this.f37898k[g2] = j2;
        this.f37899l[g2] = i2;
        this.f37900m[g2] = i;
        this.f37902o[g2] = zc4;
        this.f37897j[g2] = 0;
        if (this.f37890c.mo35567f() || !this.f37890c.mo35563b().f36306a.equals(this.f37884A)) {
            k24 k24 = k24.f34130a;
            w64<o64> w64 = this.f37890c;
            int i4 = this.f37904q + this.f37903p;
            C8281w wVar = this.f37884A;
            Objects.requireNonNull(wVar);
            w64.mo35564c(i4, new o64(wVar, k24, (n64) null));
        }
        int i5 = this.f37903p + 1;
        this.f37903p = i5;
        int i6 = this.f37896i;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            int[] iArr = new int[i7];
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            zc4[] zc4Arr = new zc4[i7];
            int i8 = this.f37905r;
            int i9 = i6 - i8;
            System.arraycopy(this.f37898k, i8, jArr, 0, i9);
            System.arraycopy(this.f37901n, this.f37905r, jArr2, 0, i9);
            System.arraycopy(this.f37900m, this.f37905r, iArr2, 0, i9);
            System.arraycopy(this.f37899l, this.f37905r, iArr3, 0, i9);
            System.arraycopy(this.f37902o, this.f37905r, zc4Arr, 0, i9);
            System.arraycopy(this.f37897j, this.f37905r, iArr, 0, i9);
            int i10 = this.f37905r;
            System.arraycopy(this.f37898k, 0, jArr, i9, i10);
            System.arraycopy(this.f37901n, 0, jArr2, i9, i10);
            System.arraycopy(this.f37900m, 0, iArr2, i9, i10);
            System.arraycopy(this.f37899l, 0, iArr3, i9, i10);
            System.arraycopy(this.f37902o, 0, zc4Arr, i9, i10);
            System.arraycopy(this.f37897j, 0, iArr, i9, i10);
            this.f37898k = jArr;
            this.f37901n = jArr2;
            this.f37900m = iArr2;
            this.f37899l = iArr3;
            this.f37902o = zc4Arr;
            this.f37897j = iArr;
            this.f37905r = 0;
            this.f37896i = i7;
        }
    }

    /* renamed from: m */
    private final void m36321m(C8281w wVar, mw3 mw3) {
        zzs zzs;
        C8281w wVar2 = this.f37895h;
        m24 m24 = null;
        if (wVar2 == null) {
            zzs = null;
        } else {
            zzs = wVar2.f40622o;
        }
        this.f37895h = wVar;
        zzs zzs2 = wVar.f40622o;
        mw3.f35636a = wVar.mo35522c(this.f37891d.mo32325a(wVar));
        mw3.f35637b = this.f37887D;
        if (wVar2 == null || !d13.m20317p(zzs, zzs2)) {
            if (wVar.f40622o != null) {
                m24 = new m24(new d24(new o24(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
            }
            this.f37887D = m24;
            mw3.f35637b = m24;
        }
    }

    /* renamed from: n */
    private final void m36322n() {
        if (this.f37887D != null) {
            this.f37887D = null;
            this.f37895h = null;
        }
    }

    /* renamed from: o */
    private final synchronized void m36323o() {
        this.f37906s = 0;
        this.f37888a.mo33046g();
    }

    /* renamed from: p */
    private final boolean m36324p() {
        return this.f37906s != this.f37903p;
    }

    /* renamed from: q */
    private final boolean m36325q(int i) {
        if (this.f37887D != null) {
            return (this.f37900m[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    /* renamed from: r */
    private final synchronized boolean m36326r(C8281w wVar) {
        this.f37912y = false;
        if (d13.m20317p(wVar, this.f37884A)) {
            return false;
        }
        if (this.f37890c.mo35567f() || !this.f37890c.mo35563b().f36306a.equals(wVar)) {
            this.f37884A = wVar;
        } else {
            this.f37884A = this.f37890c.mo35563b().f36306a;
        }
        C8281w wVar2 = this.f37884A;
        this.f37885B = C7773hx.m32964f(wVar2.f40619l, wVar2.f40616i);
        this.f37886C = false;
        return true;
    }

    /* renamed from: B */
    public final void mo34240B() throws IOException {
        m24 m24 = this.f37887D;
        if (m24 != null) {
            throw m24.mo33460a();
        }
    }

    /* renamed from: C */
    public final void mo34241C() {
        mo34257z();
        m36322n();
    }

    /* renamed from: D */
    public final void mo34242D() {
        mo34243E(true);
        m36322n();
    }

    /* renamed from: E */
    public final void mo34243E(boolean z) {
        this.f37888a.mo33045f();
        this.f37903p = 0;
        this.f37904q = 0;
        this.f37905r = 0;
        this.f37906s = 0;
        this.f37911x = true;
        this.f37907t = Long.MIN_VALUE;
        this.f37908u = Long.MIN_VALUE;
        this.f37909v = Long.MIN_VALUE;
        this.f37910w = false;
        this.f37890c.mo35565d();
        if (z) {
            this.f37913z = null;
            this.f37884A = null;
            this.f37912y = true;
        }
    }

    /* renamed from: F */
    public final void mo34244F(long j) {
        this.f37907t = j;
    }

    /* renamed from: G */
    public final void mo34245G(p64 p64) {
        this.f37894g = p64;
    }

    /* renamed from: H */
    public final synchronized void mo34246H(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.f37906s + i <= this.f37903p) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        nu1.m20745d(z);
        this.f37906s += i;
    }

    /* renamed from: I */
    public final synchronized boolean mo34247I() {
        return this.f37910w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        return r1;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo34248J(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.m36324p()     // Catch:{ all -> 0x003e }
            r1 = 1
            if (r0 != 0) goto L_0x001d
            r0 = 0
            if (r4 != 0) goto L_0x001b
            boolean r4 = r3.f37910w     // Catch:{ all -> 0x003e }
            if (r4 != 0) goto L_0x001b
            com.google.android.gms.internal.ads.w r4 = r3.f37884A     // Catch:{ all -> 0x003e }
            if (r4 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.w r2 = r3.f37895h     // Catch:{ all -> 0x003e }
            if (r4 == r2) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            monitor-exit(r3)
            return r0
        L_0x001a:
            r1 = 0
        L_0x001b:
            monitor-exit(r3)
            return r1
        L_0x001d:
            com.google.android.gms.internal.ads.w64<com.google.android.gms.internal.ads.o64> r4 = r3.f37890c     // Catch:{ all -> 0x003e }
            int r0 = r3.f37904q     // Catch:{ all -> 0x003e }
            int r2 = r3.f37906s     // Catch:{ all -> 0x003e }
            int r0 = r0 + r2
            java.lang.Object r4 = r4.mo35562a(r0)     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.o64 r4 = (com.google.android.gms.internal.ads.o64) r4     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.w r4 = r4.f36306a     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.w r0 = r3.f37895h     // Catch:{ all -> 0x003e }
            if (r4 == r0) goto L_0x0032
            monitor-exit(r3)
            return r1
        L_0x0032:
            int r4 = r3.f37906s     // Catch:{ all -> 0x003e }
            int r4 = r3.m36315g(r4)     // Catch:{ all -> 0x003e }
            boolean r4 = r3.m36325q(r4)     // Catch:{ all -> 0x003e }
            monitor-exit(r3)
            return r4
        L_0x003e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q64.mo34248J(boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        return false;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo34249K(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.m36323o()     // Catch:{ all -> 0x003f }
            int r0 = r8.f37906s     // Catch:{ all -> 0x003f }
            int r2 = r8.m36315g(r0)     // Catch:{ all -> 0x003f }
            boolean r0 = r8.m36324p()     // Catch:{ all -> 0x003f }
            r7 = 0
            if (r0 == 0) goto L_0x003d
            long[] r0 = r8.f37901n     // Catch:{ all -> 0x003f }
            r3 = r0[r2]     // Catch:{ all -> 0x003f }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003d
            long r0 = r8.f37909v     // Catch:{ all -> 0x003f }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0021
            if (r11 == 0) goto L_0x003d
        L_0x0021:
            int r11 = r8.f37903p     // Catch:{ all -> 0x003f }
            int r0 = r8.f37906s     // Catch:{ all -> 0x003f }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.m36314L(r2, r3, r4, r6)     // Catch:{ all -> 0x003f }
            r0 = -1
            if (r11 != r0) goto L_0x0033
            monitor-exit(r8)
            return r7
        L_0x0033:
            r8.f37907t = r9     // Catch:{ all -> 0x003f }
            int r9 = r8.f37906s     // Catch:{ all -> 0x003f }
            int r9 = r9 + r11
            r8.f37906s = r9     // Catch:{ all -> 0x003f }
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x003d:
            monitor-exit(r8)
            return r7
        L_0x003f:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q64.mo34249K(long, boolean):boolean");
    }

    /* renamed from: a */
    public final void mo30354a(C8281w wVar) {
        this.f37913z = wVar;
        boolean r = m36326r(wVar);
        p64 p64 = this.f37894g;
        if (p64 != null && r) {
            p64.mo18206h(wVar);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ int mo30355b(wb1 wb1, int i, boolean z) {
        return yc4.m39856a(this, wb1, i, true);
    }

    /* renamed from: c */
    public final int mo30356c(wb1 wb1, int i, boolean z, int i2) throws IOException {
        return this.f37888a.mo33040a(wb1, i, z);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo30357d(uq2 uq2, int i) {
        yc4.m39857b(this, uq2, i);
    }

    /* renamed from: e */
    public final void mo30358e(long j, int i, int i2, int i3, zc4 zc4) {
        int i4 = i & 1;
        if (this.f37911x) {
            if (i4 != 0) {
                this.f37911x = false;
            } else {
                return;
            }
        }
        if (this.f37885B) {
            if (j >= this.f37907t) {
                if (i4 == 0) {
                    if (!this.f37886C) {
                        Log.w("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f37884A)));
                        this.f37886C = true;
                    }
                    i |= 1;
                }
            } else {
                return;
            }
        }
        m36320l(j, i, (this.f37888a.mo33041b() - ((long) i2)) - ((long) i3), i2, zc4);
    }

    /* renamed from: f */
    public final void mo30359f(uq2 uq2, int i, int i2) {
        this.f37888a.mo33047h(uq2, i);
    }

    /* renamed from: s */
    public final int mo34250s() {
        return this.f37904q + this.f37906s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r9 != -1) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return 0;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo34251t(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f37906s     // Catch:{ all -> 0x003c }
            int r2 = r8.m36315g(r0)     // Catch:{ all -> 0x003c }
            boolean r0 = r8.m36324p()     // Catch:{ all -> 0x003c }
            r7 = 0
            if (r0 == 0) goto L_0x003a
            long[] r0 = r8.f37901n     // Catch:{ all -> 0x003c }
            r3 = r0[r2]     // Catch:{ all -> 0x003c }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            long r0 = r8.f37909v     // Catch:{ all -> 0x003c }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0027
            if (r11 != 0) goto L_0x0020
            goto L_0x0027
        L_0x0020:
            int r9 = r8.f37903p     // Catch:{ all -> 0x003c }
            int r10 = r8.f37906s     // Catch:{ all -> 0x003c }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0027:
            int r11 = r8.f37903p     // Catch:{ all -> 0x003c }
            int r0 = r8.f37906s     // Catch:{ all -> 0x003c }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.m36314L(r2, r3, r4, r6)     // Catch:{ all -> 0x003c }
            r10 = -1
            monitor-exit(r8)
            if (r9 != r10) goto L_0x0039
            return r7
        L_0x0039:
            return r9
        L_0x003a:
            monitor-exit(r8)
            return r7
        L_0x003c:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q64.mo34251t(long, boolean):int");
    }

    /* renamed from: u */
    public final int mo34252u() {
        return this.f37904q + this.f37903p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r9 != 0) goto L_0x003d;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo34253v(com.google.android.gms.internal.ads.mw3 r9, com.google.android.gms.internal.ads.s51 r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L_0x0007
            r5 = 1
            goto L_0x0009
        L_0x0007:
            r0 = 0
            r5 = 0
        L_0x0009:
            com.google.android.gms.internal.ads.m64 r7 = r8.f37889b
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.m36316h(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L_0x003e
            boolean r9 = r10.mo33441g()
            if (r9 != 0) goto L_0x003d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L_0x0034
            if (r9 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.k64 r9 = r8.f37888a
            com.google.android.gms.internal.ads.m64 r11 = r8.f37889b
            r9.mo33043d(r10, r11)
            goto L_0x003d
        L_0x002c:
            com.google.android.gms.internal.ads.k64 r9 = r8.f37888a
            com.google.android.gms.internal.ads.m64 r11 = r8.f37889b
            r9.mo33044e(r10, r11)
            goto L_0x0037
        L_0x0034:
            if (r9 == 0) goto L_0x0037
            goto L_0x003d
        L_0x0037:
            int r9 = r8.f37906s
            int r9 = r9 + r1
            r8.f37906s = r9
            return r12
        L_0x003d:
            r9 = -4
        L_0x003e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q64.mo34253v(com.google.android.gms.internal.ads.mw3, com.google.android.gms.internal.ads.s51, int, boolean):int");
    }

    /* renamed from: w */
    public final synchronized long mo34254w() {
        return this.f37909v;
    }

    /* renamed from: x */
    public final synchronized C8281w mo34255x() {
        if (this.f37912y) {
            return null;
        }
        return this.f37884A;
    }

    /* renamed from: y */
    public final void mo34256y(long j, boolean z, boolean z2) {
        this.f37888a.mo33042c(m36317i(j, false, z2));
    }

    /* renamed from: z */
    public final void mo34257z() {
        this.f37888a.mo33042c(m36318j());
    }
}
