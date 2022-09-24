package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.tk */
/* compiled from: IMASDK */
public final class C4369tk implements C4306rb {

    /* renamed from: a */
    public static final /* synthetic */ int f18803a = 0;

    /* renamed from: b */
    private final long f18804b;

    /* renamed from: c */
    private final alw f18805c;

    /* renamed from: d */
    private final C4255pe f18806d;

    /* renamed from: e */
    private final C4318rn f18807e;

    /* renamed from: f */
    private final C4319ro f18808f;

    /* renamed from: g */
    private final C4327rw f18809g;

    /* renamed from: h */
    private C4309re f18810h;

    /* renamed from: i */
    private C4327rw f18811i;

    /* renamed from: j */
    private C4327rw f18812j;

    /* renamed from: k */
    private int f18813k;

    /* renamed from: l */
    private C4507yn f18814l;

    /* renamed from: m */
    private long f18815m;

    /* renamed from: n */
    private long f18816n;

    /* renamed from: o */
    private long f18817o;

    /* renamed from: p */
    private int f18818p;

    /* renamed from: q */
    private C4370tl f18819q;

    /* renamed from: r */
    private boolean f18820r;

    /* renamed from: s */
    private long f18821s;

    static {
        int i = C4368tj.f18802b;
    }

    public C4369tk() {
        this((byte[]) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0081 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m18972b(com.google.ads.interactivemedia.p038v3.internal.C4307rc r20) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            int r2 = r0.f18813k
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.m18974i(r1, r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            com.google.ads.interactivemedia.v3.internal.tl r2 = r0.f18819q
            r5 = 0
            r10 = 1
            if (r2 != 0) goto L_0x01b2
            com.google.ads.interactivemedia.v3.internal.alw r2 = new com.google.ads.interactivemedia.v3.internal.alw
            com.google.ads.interactivemedia.v3.internal.pe r11 = r0.f18806d
            int r11 = r11.f18312c
            r2.<init>((int) r11)
            byte[] r11 = r2.mo13952j()
            com.google.ads.interactivemedia.v3.internal.pe r12 = r0.f18806d
            int r12 = r12.f18312c
            r1.mo16600g(r11, r4, r12)
            com.google.ads.interactivemedia.v3.internal.pe r11 = r0.f18806d
            int r12 = r11.f18310a
            r12 = r12 & r10
            r13 = 36
            r14 = 21
            if (r12 == 0) goto L_0x003c
            int r11 = r11.f18314e
            if (r11 == r10) goto L_0x0040
            r15 = 36
            goto L_0x0047
        L_0x003c:
            int r11 = r11.f18314e
            if (r11 == r10) goto L_0x0043
        L_0x0040:
            r15 = 21
            goto L_0x0047
        L_0x0043:
            r14 = 13
            r15 = 13
        L_0x0047:
            int r11 = r2.mo13948f()
            int r12 = r15 + 4
            r14 = 1483304551(0x58696e67, float:1.02664153E15)
            r10 = 1447187017(0x56425249, float:5.3414667E13)
            r9 = 1231971951(0x496e666f, float:976486.94)
            if (r11 < r12) goto L_0x0069
            r2.mo13951i(r15)
            int r11 = r2.mo13965w()
            if (r11 == r14) goto L_0x0067
            if (r11 != r9) goto L_0x0069
            r13 = 1231971951(0x496e666f, float:976486.94)
            goto L_0x007f
        L_0x0067:
            r13 = r11
            goto L_0x007f
        L_0x0069:
            int r11 = r2.mo13948f()
            r12 = 40
            if (r11 < r12) goto L_0x007e
            r2.mo13951i(r13)
            int r11 = r2.mo13965w()
            if (r11 != r10) goto L_0x007e
            r13 = 1447187017(0x56425249, float:5.3414667E13)
            goto L_0x007f
        L_0x007e:
            r13 = 0
        L_0x007f:
            if (r13 == r14) goto L_0x00a3
            if (r13 != r9) goto L_0x0084
            goto L_0x00a3
        L_0x0084:
            if (r13 != r10) goto L_0x009e
            long r11 = r20.mo16606m()
            long r13 = r20.mo16605l()
            com.google.ads.interactivemedia.v3.internal.pe r15 = r0.f18806d
            r16 = r2
            com.google.ads.interactivemedia.v3.internal.tm r2 = com.google.ads.interactivemedia.p038v3.internal.C4371tm.m18986f(r11, r13, r15, r16)
            com.google.ads.interactivemedia.v3.internal.pe r9 = r0.f18806d
            int r9 = r9.f18312c
            r1.mo16597d(r9)
            goto L_0x0102
        L_0x009e:
            r20.mo16603j()
            r2 = 0
            goto L_0x0102
        L_0x00a3:
            long r11 = r20.mo16606m()
            long r17 = r20.mo16605l()
            com.google.ads.interactivemedia.v3.internal.pe r10 = r0.f18806d
            r7 = r13
            r13 = r17
            r8 = r15
            r15 = r10
            r16 = r2
            com.google.ads.interactivemedia.v3.internal.tn r2 = com.google.ads.interactivemedia.p038v3.internal.C4372tn.m18992f(r11, r13, r15, r16)
            if (r2 == 0) goto L_0x00ed
            com.google.ads.interactivemedia.v3.internal.rn r10 = r0.f18807e
            boolean r10 = r10.mo16615a()
            if (r10 != 0) goto L_0x00ed
            r20.mo16603j()
            int r15 = r8 + 141
            r1.mo16602i(r15)
            com.google.ads.interactivemedia.v3.internal.alw r8 = r0.f18805c
            byte[] r8 = r8.mo13952j()
            r10 = 3
            r1.mo16600g(r8, r4, r10)
            com.google.ads.interactivemedia.v3.internal.alw r8 = r0.f18805c
            r8.mo13951i(r4)
            com.google.ads.interactivemedia.v3.internal.rn r8 = r0.f18807e
            com.google.ads.interactivemedia.v3.internal.alw r10 = r0.f18805c
            int r10 = r10.mo13961s()
            int r11 = r10 >> 12
            r10 = r10 & 4095(0xfff, float:5.738E-42)
            if (r11 > 0) goto L_0x00e9
            if (r10 <= 0) goto L_0x00ed
        L_0x00e9:
            r8.f18526a = r11
            r8.f18527b = r10
        L_0x00ed:
            com.google.ads.interactivemedia.v3.internal.pe r8 = r0.f18806d
            int r8 = r8.f18312c
            r1.mo16597d(r8)
            if (r2 == 0) goto L_0x0102
            boolean r8 = r2.mo16580a()
            if (r8 != 0) goto L_0x0102
            if (r7 != r9) goto L_0x0102
            com.google.ads.interactivemedia.v3.internal.tl r2 = r19.m18976k(r20)
        L_0x0102:
            com.google.ads.interactivemedia.v3.internal.yn r7 = r0.f18814l
            long r8 = r20.mo16605l()
            if (r7 == 0) goto L_0x0151
            int r10 = r7.mo16831a()
            r11 = 0
        L_0x010f:
            if (r11 >= r10) goto L_0x0151
            com.google.ads.interactivemedia.v3.internal.ym r12 = r7.mo16832b(r11)
            boolean r13 = r12 instanceof com.google.ads.interactivemedia.p038v3.internal.C4532zl
            if (r13 == 0) goto L_0x014e
            com.google.ads.interactivemedia.v3.internal.zl r12 = (com.google.ads.interactivemedia.p038v3.internal.C4532zl) r12
            int r10 = r7.mo16831a()
            r11 = 0
        L_0x0120:
            if (r11 >= r10) goto L_0x0144
            com.google.ads.interactivemedia.v3.internal.ym r13 = r7.mo16832b(r11)
            boolean r14 = r13 instanceof com.google.ads.interactivemedia.p038v3.internal.C4534zn
            if (r14 == 0) goto L_0x0141
            com.google.ads.interactivemedia.v3.internal.zn r13 = (com.google.ads.interactivemedia.p038v3.internal.C4534zn) r13
            java.lang.String r14 = r13.f19753f
            java.lang.String r15 = "TLEN"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0141
            java.lang.String r7 = r13.f19765b
            long r10 = java.lang.Long.parseLong(r7)
            long r10 = com.google.ads.interactivemedia.p038v3.internal.C4083iv.m17452b(r10)
            goto L_0x0149
        L_0x0141:
            int r11 = r11 + 1
            goto L_0x0120
        L_0x0144:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0149:
            com.google.ads.interactivemedia.v3.internal.ti r7 = com.google.ads.interactivemedia.p038v3.internal.C4367ti.m18963f(r8, r12, r10)
            goto L_0x0152
        L_0x014e:
            int r11 = r11 + 1
            goto L_0x010f
        L_0x0151:
            r7 = 0
        L_0x0152:
            boolean r8 = r0.f18820r
            if (r8 == 0) goto L_0x015c
            com.google.ads.interactivemedia.v3.internal.rs r2 = new com.google.ads.interactivemedia.v3.internal.rs
            r2.<init>()
            goto L_0x0169
        L_0x015c:
            if (r7 == 0) goto L_0x0160
            r2 = r7
            goto L_0x0163
        L_0x0160:
            if (r2 != 0) goto L_0x0163
            r2 = 0
        L_0x0163:
            if (r2 != 0) goto L_0x0169
            com.google.ads.interactivemedia.v3.internal.tl r2 = r19.m18976k(r20)
        L_0x0169:
            r0.f18819q = r2
            com.google.ads.interactivemedia.v3.internal.re r7 = r0.f18810h
            r7.mo13364bc(r2)
            com.google.ads.interactivemedia.v3.internal.rw r2 = r0.f18812j
            com.google.ads.interactivemedia.v3.internal.kd r7 = new com.google.ads.interactivemedia.v3.internal.kd
            r7.<init>()
            com.google.ads.interactivemedia.v3.internal.pe r8 = r0.f18806d
            java.lang.String r8 = r8.f18311b
            r7.mo16120ae(r8)
            r8 = 4096(0x1000, float:5.74E-42)
            r7.mo16111W(r8)
            com.google.ads.interactivemedia.v3.internal.pe r8 = r0.f18806d
            int r8 = r8.f18314e
            r7.mo16096H(r8)
            com.google.ads.interactivemedia.v3.internal.pe r8 = r0.f18806d
            int r8 = r8.f18313d
            r7.mo16121af(r8)
            com.google.ads.interactivemedia.v3.internal.rn r8 = r0.f18807e
            int r8 = r8.f18526a
            r7.mo16101M(r8)
            com.google.ads.interactivemedia.v3.internal.rn r8 = r0.f18807e
            int r8 = r8.f18527b
            r7.mo16102N(r8)
            com.google.ads.interactivemedia.v3.internal.yn r8 = r0.f18814l
            r7.mo16112X(r8)
            com.google.ads.interactivemedia.v3.internal.ke r7 = r7.mo16115a()
            r2.mo13403a(r7)
            long r7 = r20.mo16605l()
            r0.f18817o = r7
            goto L_0x01c7
        L_0x01b2:
            long r7 = r0.f18817o
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x01c7
            long r7 = r20.mo16605l()
            long r9 = r0.f18817o
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x01c7
            long r9 = r9 - r7
            int r2 = (int) r9
            r1.mo16597d(r2)
        L_0x01c7:
            int r2 = r0.f18818p
            if (r2 != 0) goto L_0x0243
            r20.mo16603j()
            boolean r2 = r19.m18975j(r20)
            if (r2 == 0) goto L_0x01d6
            goto L_0x0255
        L_0x01d6:
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f18805c
            r2.mo13951i(r4)
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f18805c
            int r2 = r2.mo13965w()
            int r7 = r0.f18813k
            long r7 = (long) r7
            boolean r7 = m18977l(r2, r7)
            if (r7 == 0) goto L_0x023c
            int r7 = com.google.ads.interactivemedia.p038v3.internal.C4256pf.m18509a(r2)
            if (r7 != r3) goto L_0x01f1
            goto L_0x023c
        L_0x01f1:
            com.google.ads.interactivemedia.v3.internal.pe r7 = r0.f18806d
            r7.mo16493a(r2)
            long r7 = r0.f18815m
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0221
            com.google.ads.interactivemedia.v3.internal.tl r2 = r0.f18819q
            long r7 = r20.mo16605l()
            long r7 = r2.mo16621d(r7)
            r0.f18815m = r7
            long r7 = r0.f18804b
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x0221
            com.google.ads.interactivemedia.v3.internal.tl r2 = r0.f18819q
            long r5 = r2.mo16621d(r5)
            long r7 = r0.f18815m
            long r9 = r0.f18804b
            long r9 = r9 - r5
            long r7 = r7 + r9
            r0.f18815m = r7
        L_0x0221:
            com.google.ads.interactivemedia.v3.internal.pe r2 = r0.f18806d
            int r5 = r2.f18312c
            r0.f18818p = r5
            com.google.ads.interactivemedia.v3.internal.tl r6 = r0.f18819q
            boolean r7 = r6 instanceof com.google.ads.interactivemedia.p038v3.internal.C4366th
            if (r7 != 0) goto L_0x022f
            r2 = r5
            goto L_0x0243
        L_0x022f:
            com.google.ads.interactivemedia.v3.internal.th r6 = (com.google.ads.interactivemedia.p038v3.internal.C4366th) r6
            long r3 = r0.f18816n
            int r1 = r2.f18316g
            long r1 = (long) r1
            long r3 = r3 + r1
            r0.m18973c(r3)
            r1 = 0
            throw r1
        L_0x023c:
            r5 = 1
            r1.mo16597d(r5)
            r0.f18813k = r4
            goto L_0x0254
        L_0x0243:
            r5 = 1
            com.google.ads.interactivemedia.v3.internal.rw r6 = r0.f18812j
            int r1 = r6.mo13405c(r1, r2, r5)
            if (r1 != r3) goto L_0x024d
            goto L_0x0255
        L_0x024d:
            int r2 = r0.f18818p
            int r2 = r2 - r1
            r0.f18818p = r2
            if (r2 <= 0) goto L_0x0256
        L_0x0254:
            r3 = 0
        L_0x0255:
            return r3
        L_0x0256:
            com.google.ads.interactivemedia.v3.internal.rw r5 = r0.f18812j
            long r1 = r0.f18816n
            long r6 = r0.m18973c(r1)
            r8 = 1
            com.google.ads.interactivemedia.v3.internal.pe r1 = r0.f18806d
            int r9 = r1.f18312c
            r10 = 0
            r11 = 0
            r5.mo13404b(r6, r8, r9, r10, r11)
            long r1 = r0.f18816n
            com.google.ads.interactivemedia.v3.internal.pe r3 = r0.f18806d
            int r3 = r3.f18316g
            long r5 = (long) r3
            long r1 = r1 + r5
            r0.f18816n = r1
            r0.f18818p = r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4369tk.m18972b(com.google.ads.interactivemedia.v3.internal.rc):int");
    }

    /* renamed from: c */
    private final long m18973c(long j) {
        return this.f18815m + ((j * 1000000) / ((long) this.f18806d.f18313d));
    }

    /* renamed from: i */
    private final boolean m18974i(C4307rc rcVar, boolean z) throws IOException {
        int i;
        int i2;
        int a;
        int i3 = true != z ? 131072 : 32768;
        rcVar.mo16603j();
        if (rcVar.mo16605l() == 0) {
            C4507yn a2 = this.f18808f.mo16617a(rcVar, (C4527zg) null);
            this.f18814l = a2;
            if (a2 != null) {
                this.f18807e.mo16616b(a2);
            }
            i = (int) rcVar.mo16604k();
            if (!z) {
                rcVar.mo16597d(i);
            }
            i2 = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!m18975j(rcVar)) {
                this.f18805c.mo13951i(0);
                int w = this.f18805c.mo13965w();
                if ((i2 == 0 || m18977l(w, (long) i2)) && (a = C4256pf.m18509a(w)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.f18806d.mo16493a(w);
                        i2 = w;
                    }
                    rcVar.mo16602i(a - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 != i3) {
                        if (z) {
                            rcVar.mo16603j();
                            rcVar.mo16602i(i + i6);
                        } else {
                            rcVar.mo16597d(1);
                        }
                        i5 = i6;
                        i2 = 0;
                        i4 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw new C4144lb("Searched too many bytes.");
                    }
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            rcVar.mo16597d(i + i5);
        } else {
            rcVar.mo16603j();
        }
        this.f18813k = i2;
        return true;
    }

    /* renamed from: j */
    private final boolean m18975j(C4307rc rcVar) throws IOException {
        C4370tl tlVar = this.f18819q;
        if (tlVar != null) {
            long e = tlVar.mo16622e();
            if (e != -1 && rcVar.mo16604k() > e - 4) {
                return true;
            }
        }
        try {
            return !rcVar.mo16599f(this.f18805c.mo13952j(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* renamed from: k */
    private final C4370tl m18976k(C4307rc rcVar) throws IOException {
        rcVar.mo16600g(this.f18805c.mo13952j(), 0, 4);
        this.f18805c.mo13951i(0);
        this.f18806d.mo16493a(this.f18805c.mo13965w());
        return new C4365tg(rcVar.mo16606m(), rcVar.mo16605l(), this.f18806d);
    }

    /* renamed from: l */
    private static boolean m18977l(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* renamed from: a */
    public final void mo16656a() {
        this.f18820r = true;
    }

    /* renamed from: d */
    public final boolean mo13689d(C4307rc rcVar) throws IOException {
        return m18974i(rcVar, true);
    }

    /* renamed from: e */
    public final void mo13690e(C4309re reVar) {
        this.f18810h = reVar;
        C4327rw ba = reVar.mo13362ba(0, 1);
        this.f18811i = ba;
        this.f18812j = ba;
        this.f18810h.mo13363bb();
    }

    /* renamed from: f */
    public final int mo13691f(C4307rc rcVar, C4321rq rqVar) throws IOException {
        aup.m14889t(this.f18811i);
        int i = amm.f15298a;
        int b = m18972b(rcVar);
        if (b == -1 && (this.f18819q instanceof C4366th)) {
            if (this.f18819q.mo16582c() != m18973c(this.f18816n)) {
                C4366th thVar = (C4366th) this.f18819q;
                throw null;
            }
        }
        return b;
    }

    /* renamed from: g */
    public final void mo13692g(long j, long j2) {
        this.f18813k = 0;
        this.f18815m = C6540C.TIME_UNSET;
        this.f18816n = 0;
        this.f18818p = 0;
        this.f18821s = j2;
        C4370tl tlVar = this.f18819q;
        if (tlVar instanceof C4366th) {
            C4366th thVar = (C4366th) tlVar;
            throw null;
        }
    }

    /* renamed from: h */
    public final void mo13693h() {
    }

    public C4369tk(byte[] bArr) {
        this((long) C6540C.TIME_UNSET);
    }

    public C4369tk(long j) {
        this.f18804b = j;
        this.f18805c = new alw(10);
        this.f18806d = new C4255pe();
        this.f18807e = new C4318rn();
        this.f18815m = C6540C.TIME_UNSET;
        this.f18808f = new C4319ro();
        C4305ra raVar = new C4305ra();
        this.f18809g = raVar;
        this.f18812j = raVar;
    }
}
