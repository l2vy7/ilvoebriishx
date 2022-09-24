package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.ads.interactivemedia.v3.internal.sh */
/* compiled from: IMASDK */
public final class C4339sh implements C4306rb {

    /* renamed from: a */
    public static final /* synthetic */ int f18585a = 0;

    /* renamed from: b */
    private final byte[] f18586b;

    /* renamed from: c */
    private final alw f18587c;

    /* renamed from: d */
    private final C4312rh f18588d;

    /* renamed from: e */
    private C4309re f18589e;

    /* renamed from: f */
    private C4327rw f18590f;

    /* renamed from: g */
    private int f18591g;

    /* renamed from: h */
    private C4507yn f18592h;

    /* renamed from: i */
    private C4316rl f18593i;

    /* renamed from: j */
    private int f18594j;

    /* renamed from: k */
    private int f18595k;

    /* renamed from: l */
    private C4337sf f18596l;

    /* renamed from: m */
    private int f18597m;

    /* renamed from: n */
    private long f18598n;

    static {
        int i = C4338sg.f18584b;
    }

    public C4339sh() {
        this((byte[]) null);
    }

    /* renamed from: a */
    private final long m18847a(alw alw, boolean z) {
        boolean z2;
        aup.m14890u(this.f18593i);
        int h = alw.mo13950h();
        while (h <= alw.mo13948f() - 16) {
            alw.mo13951i(h);
            if (C4038hd.m17321g(alw, this.f18593i, this.f18595k, this.f18588d)) {
                alw.mo13951i(h);
                return this.f18588d.f18506a;
            }
            h++;
        }
        if (z) {
            while (h <= alw.mo13948f() - this.f18594j) {
                alw.mo13951i(h);
                try {
                    z2 = C4038hd.m17321g(alw, this.f18593i, this.f18595k, this.f18588d);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (alw.mo13950h() <= alw.mo13948f() && z2) {
                    alw.mo13951i(h);
                    return this.f18588d.f18506a;
                }
                h++;
            }
            alw.mo13951i(alw.mo13948f());
            return -1;
        }
        alw.mo13951i(h);
        return -1;
    }

    /* renamed from: b */
    private final void m18848b() {
        long j = this.f18598n;
        C4316rl rlVar = this.f18593i;
        int i = amm.f15298a;
        this.f18590f.mo13404b((j * 1000000) / ((long) rlVar.f18516e), 1, this.f18597m, 0, (C4326rv) null);
    }

    /* renamed from: d */
    public final boolean mo13689d(C4307rc rcVar) throws IOException {
        ajq.m13894h(rcVar, false);
        alw alw = new alw(4);
        rcVar.mo16600g(alw.mo13952j(), 0, 4);
        if (alw.mo13963u() == 1716281667) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo13690e(C4309re reVar) {
        this.f18589e = reVar;
        this.f18590f = reVar.mo13362ba(0, 1);
        reVar.mo13363bb();
    }

    /* renamed from: f */
    public final int mo13691f(C4307rc rcVar, C4321rq rqVar) throws IOException {
        boolean h;
        C4316rl rlVar;
        C4324rt rtVar;
        C4307rc rcVar2 = rcVar;
        int i = this.f18591g;
        boolean z = true;
        if (i == 0) {
            rcVar.mo16603j();
            long k = rcVar.mo16604k();
            C4507yn h2 = ajq.m13894h(rcVar2, true);
            rcVar2.mo16597d((int) (rcVar.mo16604k() - k));
            this.f18592h = h2;
            this.f18591g = 1;
            return 0;
        } else if (i == 1) {
            rcVar2.mo16600g(this.f18586b, 0, 42);
            rcVar.mo16603j();
            this.f18591g = 2;
            return 0;
        } else if (i == 2) {
            alw alw = new alw(4);
            rcVar2.mo16596c(alw.mo13952j(), 0, 4);
            if (alw.mo13963u() == 1716281667) {
                this.f18591g = 3;
                return 0;
            }
            throw new C4144lb("Failed to read FLAC stream marker.");
        } else if (i == 3) {
            C4313ri riVar = new C4313ri(this.f18593i);
            do {
                rcVar.mo16603j();
                alv alv = new alv(new byte[4]);
                rcVar2.mo16600g(alv.f15245a, 0, 4);
                h = alv.mo13926h();
                int i2 = alv.mo13927i(7);
                int i3 = alv.mo13927i(24) + 4;
                if (i2 == 0) {
                    byte[] bArr = new byte[38];
                    rcVar2.mo16596c(bArr, 0, 38);
                    riVar.f18507a = new C4316rl(bArr, 4);
                } else {
                    C4316rl rlVar2 = riVar.f18507a;
                    if (rlVar2 == null) {
                        throw new IllegalArgumentException();
                    } else if (i2 == 3) {
                        alw alw2 = new alw(i3);
                        rcVar2.mo16596c(alw2.mo13952j(), 0, i3);
                        riVar.f18507a = rlVar2.mo16612e(ajq.m13895i(alw2));
                    } else if (i2 == 4) {
                        alw alw3 = new alw(i3);
                        rcVar2.mo16596c(alw3.mo13952j(), 0, i3);
                        alw3.mo13954l(4);
                        riVar.f18507a = rlVar2.mo16613f(Arrays.asList(ajq.m13889c(alw3, false, false).f18549a));
                    } else if (i2 == 6) {
                        alw alw4 = new alw(i3);
                        rcVar2.mo16596c(alw4.mo13952j(), 0, i3);
                        alw4.mo13954l(4);
                        int w = alw4.mo13965w();
                        String G = alw4.mo13938G(alw4.mo13965w(), arm.f15613a);
                        String F = alw4.mo13937F(alw4.mo13965w());
                        int w2 = alw4.mo13965w();
                        int w3 = alw4.mo13965w();
                        int w4 = alw4.mo13965w();
                        int w5 = alw4.mo13965w();
                        int w6 = alw4.mo13965w();
                        byte[] bArr2 = new byte[w6];
                        alw4.mo13956n(bArr2, 0, w6);
                        riVar.f18507a = rlVar2.mo16614g(Collections.singletonList(new C4513yt(w, G, F, w2, w3, w4, w5, bArr2)));
                    } else {
                        rcVar2.mo16597d(i3);
                    }
                }
                rlVar = riVar.f18507a;
                int i4 = amm.f15298a;
                this.f18593i = rlVar;
            } while (!h);
            aup.m14890u(rlVar);
            this.f18594j = Math.max(this.f18593i.f18514c, 6);
            this.f18590f.mo13403a(this.f18593i.mo16610c(this.f18586b, this.f18592h));
            this.f18591g = 4;
            return 0;
        } else if (i != 4) {
            aup.m14890u(this.f18590f);
            aup.m14890u(this.f18593i);
            C4337sf sfVar = this.f18596l;
            if (sfVar != null && sfVar.mo16589c()) {
                return this.f18596l.mo16590d(rcVar2, rqVar);
            }
            if (this.f18598n == -1) {
                this.f18598n = C4038hd.m17323i(rcVar2, this.f18593i);
                return 0;
            }
            int f = this.f18587c.mo13948f();
            if (f < 32768) {
                int a = rcVar2.mo13294a(this.f18587c.mo13952j(), f, 32768 - f);
                if (a != -1) {
                    z = false;
                }
                if (!z) {
                    this.f18587c.mo13949g(f + a);
                } else if (this.f18587c.mo13947e() == 0) {
                    m18848b();
                    return -1;
                }
            } else {
                z = false;
            }
            int h3 = this.f18587c.mo13950h();
            int i5 = this.f18597m;
            int i6 = this.f18594j;
            if (i5 < i6) {
                alw alw5 = this.f18587c;
                alw5.mo13954l(Math.min(i6 - i5, alw5.mo13947e()));
            }
            long a2 = m18847a(this.f18587c, z);
            int h4 = this.f18587c.mo13950h() - h3;
            this.f18587c.mo13951i(h3);
            this.f18590f.mo13406d(this.f18587c, h4);
            this.f18597m += h4;
            if (a2 != -1) {
                m18848b();
                this.f18597m = 0;
                this.f18598n = a2;
            }
            if (this.f18587c.mo13947e() >= 16) {
                return 0;
            }
            int e = this.f18587c.mo13947e();
            System.arraycopy(this.f18587c.mo13952j(), this.f18587c.mo13950h(), this.f18587c.mo13952j(), 0, e);
            this.f18587c.mo13951i(0);
            this.f18587c.mo13949g(e);
            return 0;
        } else {
            rcVar.mo16603j();
            alw alw6 = new alw(2);
            rcVar2.mo16600g(alw6.mo13952j(), 0, 2);
            int p = alw6.mo13958p();
            if ((p >> 2) == 16382) {
                rcVar.mo16603j();
                this.f18595k = p;
                C4309re reVar = this.f18589e;
                int i7 = amm.f15298a;
                long l = rcVar.mo16605l();
                long m = rcVar.mo16606m();
                aup.m14890u(this.f18593i);
                C4316rl rlVar3 = this.f18593i;
                if (rlVar3.f18522k != null) {
                    rtVar = new C4314rj(rlVar3, l);
                } else if (m == -1 || rlVar3.f18521j <= 0) {
                    rtVar = new C4323rs(rlVar3.mo16608a());
                } else {
                    C4337sf sfVar2 = new C4337sf(rlVar3, this.f18595k, l, m);
                    this.f18596l = sfVar2;
                    rtVar = sfVar2.mo16587a();
                }
                reVar.mo13364bc(rtVar);
                this.f18591g = 5;
                return 0;
            }
            rcVar.mo16603j();
            throw new C4144lb("First frame does not start with sync code.");
        }
    }

    /* renamed from: g */
    public final void mo13692g(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f18591g = 0;
        } else {
            C4337sf sfVar = this.f18596l;
            if (sfVar != null) {
                sfVar.mo16588b(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f18598n = j3;
        this.f18597m = 0;
        this.f18587c.mo13943a(0);
    }

    /* renamed from: h */
    public final void mo13693h() {
    }

    public C4339sh(byte[] bArr) {
        this.f18586b = new byte[42];
        this.f18587c = new alw(new byte[32768], 0);
        this.f18588d = new C4312rh();
        this.f18591g = 0;
    }
}
