package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Looper;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acg */
/* compiled from: IMASDK */
public class acg implements C4327rw {

    /* renamed from: A */
    private boolean f14133A;

    /* renamed from: B */
    private C4120ke f14134B;

    /* renamed from: C */
    private C4120ke f14135C;

    /* renamed from: D */
    private int f14136D;

    /* renamed from: E */
    private boolean f14137E;

    /* renamed from: F */
    private boolean f14138F;

    /* renamed from: G */
    private long f14139G;

    /* renamed from: H */
    private boolean f14140H;

    /* renamed from: a */
    private final acb f14141a;

    /* renamed from: b */
    private final acd f14142b = new acd();

    /* renamed from: c */
    private final acn<ace> f14143c = new acn<>(acm.f14183b);

    /* renamed from: d */
    private final C4286qi f14144d;

    /* renamed from: e */
    private final C4281qd f14145e;

    /* renamed from: f */
    private final Looper f14146f;

    /* renamed from: g */
    private acf f14147g;

    /* renamed from: h */
    private C4120ke f14148h;

    /* renamed from: i */
    private C4279qb f14149i;

    /* renamed from: j */
    private int f14150j = 1000;

    /* renamed from: k */
    private int[] f14151k = new int[1000];

    /* renamed from: l */
    private long[] f14152l = new long[1000];

    /* renamed from: m */
    private int[] f14153m = new int[1000];

    /* renamed from: n */
    private int[] f14154n = new int[1000];

    /* renamed from: o */
    private long[] f14155o = new long[1000];

    /* renamed from: p */
    private C4326rv[] f14156p = new C4326rv[1000];

    /* renamed from: q */
    private int f14157q;

    /* renamed from: r */
    private int f14158r;

    /* renamed from: s */
    private int f14159s;

    /* renamed from: t */
    private int f14160t;

    /* renamed from: u */
    private long f14161u = Long.MIN_VALUE;

    /* renamed from: v */
    private long f14162v = Long.MIN_VALUE;

    /* renamed from: w */
    private long f14163w = Long.MIN_VALUE;

    /* renamed from: x */
    private boolean f14164x;

    /* renamed from: y */
    private boolean f14165y = true;

    /* renamed from: z */
    private boolean f14166z = true;

    protected acg(ajl ajl, Looper looper, C4286qi qiVar, C4281qd qdVar) {
        this.f14146f = looper;
        this.f14144d = qiVar;
        this.f14145e = qdVar;
        this.f14141a = new acb(ajl);
    }

    /* renamed from: L */
    public static acg m13017L(ajl ajl) {
        return new acg(ajl, (Looper) null, (C4286qi) null, (C4281qd) null);
    }

    /* renamed from: M */
    public static acg m13018M(ajl ajl, Looper looper, C4286qi qiVar, C4281qd qdVar) {
        aup.m14890u(looper);
        aup.m14890u(qiVar);
        return new acg(ajl, looper, qiVar, qdVar);
    }

    /* renamed from: O */
    private final synchronized void m13019O() {
        this.f14160t = 0;
        this.f14141a.mo13384c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        return -3;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized int m13020P(com.google.ads.interactivemedia.p039v3.internal.C4121kf r5, com.google.ads.interactivemedia.p039v3.internal.C4269ps r6, boolean r7, boolean r8, com.google.ads.interactivemedia.p039v3.internal.acd r9) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r6.f18398c = r0     // Catch:{ all -> 0x0085 }
            boolean r0 = r4.m13027W()     // Catch:{ all -> 0x0085 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x002e
            if (r8 != 0) goto L_0x0028
            boolean r8 = r4.f14164x     // Catch:{ all -> 0x0085 }
            if (r8 == 0) goto L_0x0014
            goto L_0x0028
        L_0x0014:
            com.google.ads.interactivemedia.v3.internal.ke r6 = r4.f14135C     // Catch:{ all -> 0x0085 }
            if (r6 == 0) goto L_0x0026
            if (r7 != 0) goto L_0x001e
            com.google.ads.interactivemedia.v3.internal.ke r7 = r4.f14148h     // Catch:{ all -> 0x0085 }
            if (r6 == r7) goto L_0x0026
        L_0x001e:
            com.google.ads.interactivemedia.p039v3.internal.aup.m14890u(r6)     // Catch:{ all -> 0x0085 }
            r4.m13028X(r6, r5)     // Catch:{ all -> 0x0085 }
            monitor-exit(r4)
            return r1
        L_0x0026:
            monitor-exit(r4)
            return r2
        L_0x0028:
            r5 = 4
            r6.mo16513f(r5)     // Catch:{ all -> 0x0085 }
            monitor-exit(r4)
            return r3
        L_0x002e:
            com.google.ads.interactivemedia.v3.internal.acn<com.google.ads.interactivemedia.v3.internal.ace> r8 = r4.f14143c     // Catch:{ all -> 0x0085 }
            int r0 = r4.mo13420r()     // Catch:{ all -> 0x0085 }
            java.lang.Object r8 = r8.mo13438a(r0)     // Catch:{ all -> 0x0085 }
            com.google.ads.interactivemedia.v3.internal.ace r8 = (com.google.ads.interactivemedia.p039v3.internal.ace) r8     // Catch:{ all -> 0x0085 }
            com.google.ads.interactivemedia.v3.internal.ke r8 = r8.f14131a     // Catch:{ all -> 0x0085 }
            if (r7 != 0) goto L_0x0080
            com.google.ads.interactivemedia.v3.internal.ke r7 = r4.f14148h     // Catch:{ all -> 0x0085 }
            if (r8 == r7) goto L_0x0043
            goto L_0x0080
        L_0x0043:
            int r5 = r4.f14160t     // Catch:{ all -> 0x0085 }
            int r5 = r4.m13033ac(r5)     // Catch:{ all -> 0x0085 }
            boolean r7 = r4.m13029Y(r5)     // Catch:{ all -> 0x0085 }
            if (r7 != 0) goto L_0x0054
            r5 = 1
            r6.f18398c = r5     // Catch:{ all -> 0x0085 }
            monitor-exit(r4)
            return r2
        L_0x0054:
            int[] r7 = r4.f14154n     // Catch:{ all -> 0x0085 }
            r7 = r7[r5]     // Catch:{ all -> 0x0085 }
            r6.mo16513f(r7)     // Catch:{ all -> 0x0085 }
            long[] r7 = r4.f14155o     // Catch:{ all -> 0x0085 }
            r0 = r7[r5]     // Catch:{ all -> 0x0085 }
            r6.f18399d = r0     // Catch:{ all -> 0x0085 }
            long r7 = r4.f14161u     // Catch:{ all -> 0x0085 }
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x006c
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.mo16514g(r7)     // Catch:{ all -> 0x0085 }
        L_0x006c:
            int[] r6 = r4.f14153m     // Catch:{ all -> 0x0085 }
            r6 = r6[r5]     // Catch:{ all -> 0x0085 }
            r9.f14128a = r6     // Catch:{ all -> 0x0085 }
            long[] r6 = r4.f14152l     // Catch:{ all -> 0x0085 }
            r7 = r6[r5]     // Catch:{ all -> 0x0085 }
            r9.f14129b = r7     // Catch:{ all -> 0x0085 }
            com.google.ads.interactivemedia.v3.internal.rv[] r6 = r4.f14156p     // Catch:{ all -> 0x0085 }
            r5 = r6[r5]     // Catch:{ all -> 0x0085 }
            r9.f14130c = r5     // Catch:{ all -> 0x0085 }
            monitor-exit(r4)
            return r3
        L_0x0080:
            r4.m13028X(r8, r5)     // Catch:{ all -> 0x0085 }
            monitor-exit(r4)
            return r1
        L_0x0085:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.acg.m13020P(com.google.ads.interactivemedia.v3.internal.kf, com.google.ads.interactivemedia.v3.internal.ps, boolean, boolean, com.google.ads.interactivemedia.v3.internal.acd):int");
    }

    /* renamed from: Q */
    private final synchronized boolean m13021Q(C4120ke keVar) {
        this.f14166z = false;
        if (amm.m14233c(keVar, this.f14135C)) {
            return false;
        }
        if (this.f14143c.mo13444g() || !this.f14143c.mo13440c().f14131a.equals(keVar)) {
            this.f14135C = keVar;
        } else {
            this.f14135C = this.f14143c.mo13440c().f14131a;
        }
        C4120ke keVar2 = this.f14135C;
        this.f14137E = aln.m14034d(keVar2.f17681l, keVar2.f17678i);
        this.f14138F = false;
        return true;
    }

    /* renamed from: R */
    private final synchronized long m13022R() {
        int i = this.f14157q;
        if (i == 0) {
            return -1;
        }
        return m13031aa(i);
    }

    /* renamed from: S */
    private final void m13023S() {
        C4279qb qbVar = this.f14149i;
        if (qbVar != null) {
            qbVar.mo16571g(this.f14145e);
            this.f14149i = null;
            this.f14148h = null;
        }
    }

    /* renamed from: T */
    private final synchronized void m13024T(long j, int i, long j2, int i2, C4326rv rvVar) {
        C4285qh qhVar;
        int i3 = this.f14157q;
        if (i3 > 0) {
            int ac = m13033ac(i3 - 1);
            aup.m14885p(this.f14152l[ac] + ((long) this.f14153m[ac]) <= j2);
        }
        this.f14164x = (536870912 & i) != 0;
        this.f14163w = Math.max(this.f14163w, j);
        int ac2 = m13033ac(this.f14157q);
        this.f14155o[ac2] = j;
        this.f14152l[ac2] = j2;
        this.f14153m[ac2] = i2;
        this.f14154n[ac2] = i;
        this.f14156p[ac2] = rvVar;
        this.f14151k[ac2] = this.f14136D;
        if (this.f14143c.mo13444g() || !this.f14143c.mo13440c().f14131a.equals(this.f14135C)) {
            C4286qi qiVar = this.f14144d;
            if (qiVar != null) {
                Looper looper = this.f14146f;
                aup.m14890u(looper);
                qhVar = qiVar.mo16578e(looper, this.f14145e, this.f14135C);
            } else {
                qhVar = C4285qh.f18427b;
            }
            acn<ace> acn = this.f14143c;
            int m = mo13415m();
            C4120ke keVar = this.f14135C;
            aup.m14890u(keVar);
            acn.mo13439b(m, new ace(keVar, qhVar));
        }
        int i4 = this.f14157q + 1;
        this.f14157q = i4;
        int i5 = this.f14150j;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            int[] iArr = new int[i6];
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            C4326rv[] rvVarArr = new C4326rv[i6];
            int i7 = this.f14159s;
            int i8 = i5 - i7;
            System.arraycopy(this.f14152l, i7, jArr, 0, i8);
            System.arraycopy(this.f14155o, this.f14159s, jArr2, 0, i8);
            System.arraycopy(this.f14154n, this.f14159s, iArr2, 0, i8);
            System.arraycopy(this.f14153m, this.f14159s, iArr3, 0, i8);
            System.arraycopy(this.f14156p, this.f14159s, rvVarArr, 0, i8);
            System.arraycopy(this.f14151k, this.f14159s, iArr, 0, i8);
            int i9 = this.f14159s;
            System.arraycopy(this.f14152l, 0, jArr, i8, i9);
            System.arraycopy(this.f14155o, 0, jArr2, i8, i9);
            System.arraycopy(this.f14154n, 0, iArr2, i8, i9);
            System.arraycopy(this.f14153m, 0, iArr3, i8, i9);
            System.arraycopy(this.f14156p, 0, rvVarArr, i8, i9);
            System.arraycopy(this.f14151k, 0, iArr, i8, i9);
            this.f14152l = jArr;
            this.f14155o = jArr2;
            this.f14154n = iArr2;
            this.f14153m = iArr3;
            this.f14156p = rvVarArr;
            this.f14151k = iArr;
            this.f14159s = 0;
            this.f14150j = i6;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r7 <= r6.f14162v) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return false;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m13025U(long r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.f14157q     // Catch:{ all -> 0x0041 }
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            long r3 = r6.f14162v     // Catch:{ all -> 0x0041 }
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            monitor-exit(r6)
            if (r0 <= 0) goto L_0x000f
            return r1
        L_0x000f:
            return r2
        L_0x0010:
            long r3 = r6.mo13424v()     // Catch:{ all -> 0x0041 }
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
            int r0 = r6.f14157q     // Catch:{ all -> 0x0041 }
            int r2 = r0 + -1
            int r2 = r6.m13033ac(r2)     // Catch:{ all -> 0x0041 }
        L_0x0020:
            int r3 = r6.f14160t     // Catch:{ all -> 0x0041 }
            if (r0 <= r3) goto L_0x0037
            long[] r3 = r6.f14155o     // Catch:{ all -> 0x0041 }
            r4 = r3[r2]     // Catch:{ all -> 0x0041 }
            int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0037
            int r0 = r0 + -1
            int r2 = r2 + -1
            r3 = -1
            if (r2 != r3) goto L_0x0020
            int r2 = r6.f14150j     // Catch:{ all -> 0x0041 }
            int r2 = r2 + r3
            goto L_0x0020
        L_0x0037:
            int r7 = r6.f14158r     // Catch:{ all -> 0x0041 }
            int r7 = r7 + r0
            r6.m13026V(r7)     // Catch:{ all -> 0x0041 }
            monitor-exit(r6)
            return r1
        L_0x003f:
            monitor-exit(r6)
            return r2
        L_0x0041:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x0045
        L_0x0044:
            throw r7
        L_0x0045:
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.acg.m13025U(long):boolean");
    }

    /* renamed from: V */
    private final long m13026V(int i) {
        int m = mo13415m() - i;
        boolean z = true;
        aup.m14885p(m >= 0 && m <= this.f14157q - this.f14160t);
        int i2 = this.f14157q - m;
        this.f14157q = i2;
        this.f14163w = Math.max(this.f14162v, m13032ab(i2));
        if (m != 0 || !this.f14164x) {
            z = false;
        }
        this.f14164x = z;
        this.f14143c.mo13442e(i);
        int i3 = this.f14157q;
        if (i3 == 0) {
            return 0;
        }
        int ac = m13033ac(i3 - 1);
        return this.f14152l[ac] + ((long) this.f14153m[ac]);
    }

    /* renamed from: W */
    private final boolean m13027W() {
        return this.f14160t != this.f14157q;
    }

    /* renamed from: X */
    private final void m13028X(C4120ke keVar, C4121kf kfVar) {
        C4120ke keVar2 = this.f14148h;
        C4276pz pzVar = keVar2 == null ? null : keVar2.f17684o;
        this.f14148h = keVar;
        C4276pz pzVar2 = keVar.f17684o;
        C4286qi qiVar = this.f14144d;
        kfVar.f17697b = qiVar != null ? keVar.mo16128c(qiVar.mo16575b(keVar)) : keVar;
        kfVar.f17696a = this.f14149i;
        if (this.f14144d != null) {
            if (keVar2 == null || !amm.m14233c(pzVar, pzVar2)) {
                C4279qb qbVar = this.f14149i;
                C4286qi qiVar2 = this.f14144d;
                Looper looper = this.f14146f;
                aup.m14890u(looper);
                C4279qb a = qiVar2.mo16574a(looper, this.f14145e, keVar);
                this.f14149i = a;
                kfVar.f17696a = a;
                if (qbVar != null) {
                    qbVar.mo16571g(this.f14145e);
                }
            }
        }
    }

    /* renamed from: Y */
    private final boolean m13029Y(int i) {
        C4279qb qbVar = this.f14149i;
        if (qbVar == null || qbVar.mo16565a() == 4 || ((this.f14154n[i] & 1073741824) == 0 && this.f14149i.mo16566b())) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private final int m13030Z(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f14155o[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.f14154n[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f14150j) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: aa */
    private final long m13031aa(int i) {
        this.f14162v = Math.max(this.f14162v, m13032ab(i));
        this.f14157q -= i;
        int i2 = this.f14158r + i;
        this.f14158r = i2;
        int i3 = this.f14159s + i;
        this.f14159s = i3;
        int i4 = this.f14150j;
        if (i3 >= i4) {
            this.f14159s = i3 - i4;
        }
        int i5 = this.f14160t - i;
        this.f14160t = i5;
        if (i5 < 0) {
            this.f14160t = 0;
        }
        this.f14143c.mo13441d(i2);
        if (this.f14157q != 0) {
            return this.f14152l[this.f14159s];
        }
        int i6 = this.f14159s;
        if (i6 == 0) {
            i6 = this.f14150j;
        }
        int i7 = i6 - 1;
        return this.f14152l[i7] + ((long) this.f14153m[i7]);
    }

    /* renamed from: ab */
    private final long m13032ab(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int ac = m13033ac(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f14155o[ac]);
            if ((this.f14154n[ac] & 1) != 0) {
                break;
            }
            ac--;
            if (ac == -1) {
                ac = this.f14150j - 1;
            }
        }
        return j;
    }

    /* renamed from: ac */
    private final int m13033ac(int i) {
        int i2 = this.f14159s + i;
        int i3 = this.f14150j;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* renamed from: ad */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized long m13034ad(long r11, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.f14157q     // Catch:{ all -> 0x002f }
            r1 = -1
            if (r0 == 0) goto L_0x002d
            long[] r3 = r10.f14155o     // Catch:{ all -> 0x002f }
            int r5 = r10.f14159s     // Catch:{ all -> 0x002f }
            r6 = r3[r5]     // Catch:{ all -> 0x002f }
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r13 == 0) goto L_0x001a
            int r13 = r10.f14160t     // Catch:{ all -> 0x002f }
            if (r13 == r0) goto L_0x001a
            int r0 = r13 + 1
        L_0x001a:
            r6 = r0
            r9 = 0
            r4 = r10
            r7 = r11
            int r11 = r4.m13030Z(r5, r6, r7, r9)     // Catch:{ all -> 0x002f }
            r12 = -1
            if (r11 != r12) goto L_0x0027
            monitor-exit(r10)
            return r1
        L_0x0027:
            long r11 = r10.m13031aa(r11)     // Catch:{ all -> 0x002f }
            monitor-exit(r10)
            return r11
        L_0x002d:
            monitor-exit(r10)
            return r1
        L_0x002f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.acg.m13034ad(long, boolean):long");
    }

    /* renamed from: A */
    public final synchronized boolean mo13391A(int i) {
        boolean z;
        m13019O();
        int i2 = this.f14158r;
        if (i >= i2) {
            if (i <= this.f14157q + i2) {
                this.f14161u = Long.MIN_VALUE;
                this.f14160t = i - i2;
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        return false;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo13392B(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.m13019O()     // Catch:{ all -> 0x003f }
            int r0 = r8.f14160t     // Catch:{ all -> 0x003f }
            int r2 = r8.m13033ac(r0)     // Catch:{ all -> 0x003f }
            boolean r0 = r8.m13027W()     // Catch:{ all -> 0x003f }
            r7 = 0
            if (r0 == 0) goto L_0x003d
            long[] r0 = r8.f14155o     // Catch:{ all -> 0x003f }
            r3 = r0[r2]     // Catch:{ all -> 0x003f }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003d
            long r0 = r8.f14163w     // Catch:{ all -> 0x003f }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0021
            if (r11 == 0) goto L_0x003d
        L_0x0021:
            int r11 = r8.f14157q     // Catch:{ all -> 0x003f }
            int r0 = r8.f14160t     // Catch:{ all -> 0x003f }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.m13030Z(r2, r3, r4, r6)     // Catch:{ all -> 0x003f }
            r0 = -1
            if (r11 != r0) goto L_0x0033
            monitor-exit(r8)
            return r7
        L_0x0033:
            r8.f14161u = r9     // Catch:{ all -> 0x003f }
            int r9 = r8.f14160t     // Catch:{ all -> 0x003f }
            int r9 = r9 + r11
            r8.f14160t = r9     // Catch:{ all -> 0x003f }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.acg.mo13392B(long, boolean):boolean");
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
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo13393C(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f14160t     // Catch:{ all -> 0x003c }
            int r2 = r8.m13033ac(r0)     // Catch:{ all -> 0x003c }
            boolean r0 = r8.m13027W()     // Catch:{ all -> 0x003c }
            r7 = 0
            if (r0 == 0) goto L_0x003a
            long[] r0 = r8.f14155o     // Catch:{ all -> 0x003c }
            r3 = r0[r2]     // Catch:{ all -> 0x003c }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            long r0 = r8.f14163w     // Catch:{ all -> 0x003c }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0027
            if (r11 != 0) goto L_0x0020
            goto L_0x0027
        L_0x0020:
            int r9 = r8.f14157q     // Catch:{ all -> 0x003c }
            int r10 = r8.f14160t     // Catch:{ all -> 0x003c }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0027:
            int r11 = r8.f14157q     // Catch:{ all -> 0x003c }
            int r0 = r8.f14160t     // Catch:{ all -> 0x003c }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.m13030Z(r2, r3, r4, r6)     // Catch:{ all -> 0x003c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.acg.mo13393C(long, boolean):int");
    }

    /* renamed from: D */
    public final synchronized void mo13394D(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.f14160t + i <= this.f14157q) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aup.m14885p(z);
        this.f14160t += i;
    }

    /* renamed from: E */
    public final void mo13395E() {
        this.f14141a.mo13387f(mo13401K());
    }

    /* renamed from: F */
    public final void mo13396F() {
        this.f14141a.mo13387f(m13022R());
    }

    /* renamed from: G */
    public final void mo13397G(long j) {
        if (this.f14139G != j) {
            this.f14139G = j;
            mo13399I();
        }
    }

    /* renamed from: H */
    public final void mo13398H(acf acf) {
        this.f14147g = acf;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final void mo13399I() {
        this.f14133A = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public C4120ke mo13400J(C4120ke keVar) {
        if (this.f14139G == 0 || keVar.f17685p == Long.MAX_VALUE) {
            return keVar;
        }
        C4119kd a = keVar.mo16126a();
        a.mo16124ai(keVar.f17685p + this.f14139G);
        return a.mo16115a();
    }

    /* renamed from: K */
    public final synchronized long mo13401K() {
        int i = this.f14160t;
        if (i == 0) {
            return -1;
        }
        return m13031aa(i);
    }

    /* renamed from: N */
    public final void mo13402N(long j, boolean z) {
        this.f14141a.mo13387f(m13034ad(j, z));
    }

    /* renamed from: a */
    public final void mo13403a(C4120ke keVar) {
        C4120ke J = mo13400J(keVar);
        this.f14133A = false;
        this.f14134B = keVar;
        boolean Q = m13021Q(J);
        acf acf = this.f14147g;
        if (acf != null && Q) {
            acf.mo13361I();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13404b(long r12, int r14, int r15, int r16, com.google.ads.interactivemedia.p039v3.internal.C4326rv r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f14133A
            if (r0 == 0) goto L_0x000d
            com.google.ads.interactivemedia.v3.internal.ke r0 = r8.f14134B
            com.google.ads.interactivemedia.p039v3.internal.aup.m14889t(r0)
            r11.mo13403a(r0)
        L_0x000d:
            r0 = r14 & 1
            boolean r1 = r8.f14165y
            r2 = 0
            if (r1 == 0) goto L_0x0019
            if (r0 != 0) goto L_0x0017
            return
        L_0x0017:
            r8.f14165y = r2
        L_0x0019:
            long r3 = r8.f14139G
            long r3 = r3 + r12
            boolean r1 = r8.f14137E
            if (r1 == 0) goto L_0x0056
            long r5 = r8.f14161u
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0027
            return
        L_0x0027:
            if (r0 != 0) goto L_0x0056
            boolean r1 = r8.f14138F
            if (r1 != 0) goto L_0x0052
            com.google.ads.interactivemedia.v3.internal.ke r1 = r8.f14135C
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r5 = r1.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 50
            r6.<init>(r5)
            java.lang.String r5 = "Overriding unexpected non-sync sample for format: "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r5 = "SampleQueue"
            android.util.Log.w(r5, r1)
            r1 = 1
            r8.f14138F = r1
        L_0x0052:
            r1 = r14 | 1
            r5 = r1
            goto L_0x0057
        L_0x0056:
            r5 = r14
        L_0x0057:
            boolean r1 = r8.f14140H
            if (r1 == 0) goto L_0x0068
            if (r0 == 0) goto L_0x0067
            boolean r0 = r11.m13025U(r3)
            if (r0 != 0) goto L_0x0064
            goto L_0x0067
        L_0x0064:
            r8.f14140H = r2
            goto L_0x0068
        L_0x0067:
            return
        L_0x0068:
            com.google.ads.interactivemedia.v3.internal.acb r0 = r8.f14141a
            long r0 = r0.mo13388g()
            r6 = r15
            long r9 = (long) r6
            long r0 = r0 - r9
            r2 = r16
            long r9 = (long) r2
            long r9 = r0 - r9
            r0 = r11
            r1 = r3
            r3 = r5
            r4 = r9
            r7 = r17
            r0.m13024T(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.acg.mo13404b(long, int, int, int, com.google.ads.interactivemedia.v3.internal.rv):void");
    }

    /* renamed from: c */
    public final int mo13405c(ajd ajd, int i, boolean z) throws IOException {
        return ajq.m13892f(this, ajd, i, z);
    }

    /* renamed from: d */
    public final void mo13406d(alw alw, int i) {
        ajq.m13893g(this, alw, i);
    }

    /* renamed from: e */
    public final int mo13407e(ajd ajd, int i, boolean z) throws IOException {
        return this.f14141a.mo13389h(ajd, i, z);
    }

    /* renamed from: f */
    public final void mo13408f(alw alw, int i) {
        this.f14141a.mo13390i(alw, i);
    }

    /* renamed from: g */
    public final void mo13409g() {
        mo13411i(true);
        m13023S();
    }

    /* renamed from: h */
    public final void mo13410h() {
        mo13411i(false);
    }

    /* renamed from: i */
    public final void mo13411i(boolean z) {
        this.f14141a.mo13382a();
        this.f14157q = 0;
        this.f14158r = 0;
        this.f14159s = 0;
        this.f14160t = 0;
        this.f14165y = true;
        this.f14161u = Long.MIN_VALUE;
        this.f14162v = Long.MIN_VALUE;
        this.f14163w = Long.MIN_VALUE;
        this.f14164x = false;
        this.f14143c.mo13443f();
        if (z) {
            this.f14134B = null;
            this.f14135C = null;
            this.f14166z = true;
        }
    }

    /* renamed from: j */
    public final void mo13412j(long j) {
        this.f14161u = j;
    }

    /* renamed from: k */
    public final void mo13413k(int i) {
        this.f14136D = i;
    }

    /* renamed from: l */
    public final void mo13414l() {
        this.f14140H = true;
    }

    /* renamed from: m */
    public final int mo13415m() {
        return this.f14158r + this.f14157q;
    }

    /* renamed from: n */
    public final void mo13416n(int i) {
        this.f14141a.mo13383b(m13026V(i));
    }

    /* renamed from: o */
    public final void mo13417o() {
        mo13396F();
        m13023S();
    }

    /* renamed from: p */
    public final void mo13418p() throws IOException {
        C4279qb qbVar = this.f14149i;
        if (qbVar != null && qbVar.mo16565a() == 1) {
            C4278qa c = this.f14149i.mo16567c();
            aup.m14890u(c);
            throw c;
        }
    }

    /* renamed from: q */
    public final int mo13419q() {
        return this.f14158r;
    }

    /* renamed from: r */
    public final int mo13420r() {
        return this.f14158r + this.f14160t;
    }

    /* renamed from: s */
    public final synchronized int mo13421s() {
        return m13027W() ? this.f14151k[m13033ac(this.f14160t)] : this.f14136D;
    }

    /* renamed from: t */
    public final synchronized C4120ke mo13422t() {
        if (this.f14166z) {
            return null;
        }
        return this.f14135C;
    }

    /* renamed from: u */
    public final synchronized long mo13423u() {
        return this.f14163w;
    }

    /* renamed from: v */
    public final synchronized long mo13424v() {
        return Math.max(this.f14162v, m13032ab(this.f14160t));
    }

    /* renamed from: w */
    public final synchronized boolean mo13425w() {
        return this.f14164x;
    }

    /* renamed from: x */
    public final synchronized long mo13426x() {
        if (this.f14157q == 0) {
            return Long.MIN_VALUE;
        }
        return this.f14155o[this.f14159s];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        return r1;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo13427y(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.m13027W()     // Catch:{ all -> 0x003d }
            r1 = 1
            if (r0 != 0) goto L_0x001d
            r0 = 0
            if (r4 != 0) goto L_0x001b
            boolean r4 = r3.f14164x     // Catch:{ all -> 0x003d }
            if (r4 != 0) goto L_0x001b
            com.google.ads.interactivemedia.v3.internal.ke r4 = r3.f14135C     // Catch:{ all -> 0x003d }
            if (r4 == 0) goto L_0x001a
            com.google.ads.interactivemedia.v3.internal.ke r2 = r3.f14148h     // Catch:{ all -> 0x003d }
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
            com.google.ads.interactivemedia.v3.internal.acn<com.google.ads.interactivemedia.v3.internal.ace> r4 = r3.f14143c     // Catch:{ all -> 0x003d }
            int r0 = r3.mo13420r()     // Catch:{ all -> 0x003d }
            java.lang.Object r4 = r4.mo13438a(r0)     // Catch:{ all -> 0x003d }
            com.google.ads.interactivemedia.v3.internal.ace r4 = (com.google.ads.interactivemedia.p039v3.internal.ace) r4     // Catch:{ all -> 0x003d }
            com.google.ads.interactivemedia.v3.internal.ke r4 = r4.f14131a     // Catch:{ all -> 0x003d }
            com.google.ads.interactivemedia.v3.internal.ke r0 = r3.f14148h     // Catch:{ all -> 0x003d }
            if (r4 == r0) goto L_0x0031
            monitor-exit(r3)
            return r1
        L_0x0031:
            int r4 = r3.f14160t     // Catch:{ all -> 0x003d }
            int r4 = r3.m13033ac(r4)     // Catch:{ all -> 0x003d }
            boolean r4 = r3.m13029Y(r4)     // Catch:{ all -> 0x003d }
            monitor-exit(r3)
            return r4
        L_0x003d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.acg.mo13427y(boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r9 != 0) goto L_0x003d;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13428z(com.google.ads.interactivemedia.p039v3.internal.C4121kf r9, com.google.ads.interactivemedia.p039v3.internal.C4269ps r10, int r11, boolean r12) {
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
            com.google.ads.interactivemedia.v3.internal.acd r7 = r8.f14142b
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.m13020P(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L_0x003e
            boolean r9 = r10.mo16510c()
            if (r9 != 0) goto L_0x003d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L_0x0034
            if (r9 == 0) goto L_0x002c
            com.google.ads.interactivemedia.v3.internal.acb r9 = r8.f14141a
            com.google.ads.interactivemedia.v3.internal.acd r11 = r8.f14142b
            r9.mo13386e(r10, r11)
            goto L_0x003d
        L_0x002c:
            com.google.ads.interactivemedia.v3.internal.acb r9 = r8.f14141a
            com.google.ads.interactivemedia.v3.internal.acd r11 = r8.f14142b
            r9.mo13385d(r10, r11)
            goto L_0x0037
        L_0x0034:
            if (r9 == 0) goto L_0x0037
            goto L_0x003d
        L_0x0037:
            int r9 = r8.f14160t
            int r9 = r9 + r1
            r8.f14160t = r9
            return r12
        L_0x003d:
            r9 = -4
        L_0x003e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.acg.mo13428z(com.google.ads.interactivemedia.v3.internal.kf, com.google.ads.interactivemedia.v3.internal.ps, int, boolean):int");
    }
}
