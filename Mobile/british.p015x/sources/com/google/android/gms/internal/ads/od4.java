package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class od4 implements vb4 {

    /* renamed from: n */
    public static final cc4 f36398n = nd4.f35988b;

    /* renamed from: a */
    private final byte[] f36399a = new byte[42];

    /* renamed from: b */
    private final uq2 f36400b = new uq2(new byte[32768], 0);

    /* renamed from: c */
    private final dc4 f36401c = new dc4();

    /* renamed from: d */
    private yb4 f36402d;

    /* renamed from: e */
    private ad4 f36403e;

    /* renamed from: f */
    private int f36404f = 0;

    /* renamed from: g */
    private zzdd f36405g;

    /* renamed from: h */
    private kc4 f36406h;

    /* renamed from: i */
    private int f36407i;

    /* renamed from: j */
    private int f36408j;

    /* renamed from: k */
    private md4 f36409k;

    /* renamed from: l */
    private int f36410l;

    /* renamed from: m */
    private long f36411m;

    public od4(int i) {
    }

    /* renamed from: b */
    private final long m35650b(uq2 uq2, boolean z) {
        boolean z2;
        Objects.requireNonNull(this.f36406h);
        int k = uq2.mo35241k();
        while (k <= uq2.mo35242l() - 16) {
            uq2.mo35236f(k);
            if (ec4.m31773c(uq2, this.f36406h, this.f36408j, this.f36401c)) {
                uq2.mo35236f(k);
                return this.f36401c.f30715a;
            }
            k++;
        }
        if (z) {
            while (k <= uq2.mo35242l() - this.f36407i) {
                uq2.mo35236f(k);
                try {
                    z2 = ec4.m31773c(uq2, this.f36406h, this.f36408j, this.f36401c);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (uq2.mo35241k() <= uq2.mo35242l() && z2) {
                    uq2.mo35236f(k);
                    return this.f36401c.f30715a;
                }
                k++;
            }
            uq2.mo35236f(uq2.mo35242l());
            return -1;
        }
        uq2.mo35236f(k);
        return -1;
    }

    /* renamed from: e */
    private final void m35651e() {
        long j = this.f36411m;
        kc4 kc4 = this.f36406h;
        int i = d13.f20195a;
        this.f36403e.mo30358e((j * 1000000) / ((long) kc4.f34245e), 1, this.f36410l, 0, (zc4) null);
    }

    /* renamed from: a */
    public final boolean mo18187a(wb4 wb4) throws IOException {
        hc4.m32853a(wb4, false);
        uq2 uq2 = new uq2(4);
        ((qb4) wb4).mo33311e(uq2.mo35238h(), 0, 4, false);
        if (uq2.mo35223A() == 1716281667) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int mo18189c(wb4 wb4, tc4 tc4) throws IOException {
        boolean l;
        kc4 kc4;
        wc4 wc4;
        wb4 wb42 = wb4;
        int i = this.f36404f;
        boolean z = true;
        if (i == 0) {
            wb4.zzj();
            long zzd = wb4.zzd();
            zzdd a = hc4.m32853a(wb42, true);
            ((qb4) wb42).mo34305k((int) (wb4.zzd() - zzd), false);
            this.f36405g = a;
            this.f36404f = 1;
            return 0;
        } else if (i == 1) {
            ((qb4) wb42).mo33311e(this.f36399a, 0, 42, false);
            wb4.zzj();
            this.f36404f = 2;
            return 0;
        } else if (i == 2) {
            uq2 uq2 = new uq2(4);
            ((qb4) wb42).mo33310d(uq2.mo35238h(), 0, 4, false);
            if (uq2.mo35223A() == 1716281667) {
                this.f36404f = 3;
                return 0;
            }
            throw C7811iy.m33482a("Failed to read FLAC stream marker.", (Throwable) null);
        } else if (i == 3) {
            fc4 fc4 = new fc4(this.f36406h);
            do {
                wb4.zzj();
                tp2 tp2 = new tp2(new byte[4], 4);
                qb4 qb4 = (qb4) wb42;
                qb4.mo33311e(tp2.f39483a, 0, 4, false);
                l = tp2.mo35017l();
                int c = tp2.mo35008c(7);
                int c2 = tp2.mo35008c(24) + 4;
                if (c == 0) {
                    byte[] bArr = new byte[38];
                    qb4.mo33310d(bArr, 0, 38, false);
                    fc4.f31701a = new kc4(bArr, 4);
                } else {
                    kc4 kc42 = fc4.f31701a;
                    if (kc42 == null) {
                        throw new IllegalArgumentException();
                    } else if (c == 3) {
                        uq2 uq22 = new uq2(c2);
                        qb4.mo33310d(uq22.mo35238h(), 0, c2, false);
                        fc4.f31701a = kc42.mo33065f(hc4.m32854b(uq22));
                    } else if (c == 4) {
                        uq2 uq23 = new uq2(c2);
                        qb4.mo33310d(uq23.mo35238h(), 0, c2, false);
                        uq23.mo35237g(4);
                        fc4.f31701a = kc42.mo33066g(Arrays.asList(fd4.m32128b(uq23, false, false).f30344b));
                    } else if (c == 6) {
                        uq2 uq24 = new uq2(c2);
                        qb4.mo33310d(uq24.mo35238h(), 0, c2, false);
                        uq24.mo35237g(4);
                        int m = uq24.mo35243m();
                        String F = uq24.mo35228F(uq24.mo35243m(), n33.f35885a);
                        String F2 = uq24.mo35228F(uq24.mo35243m(), n33.f35887c);
                        int m2 = uq24.mo35243m();
                        int m3 = uq24.mo35243m();
                        int m4 = uq24.mo35243m();
                        int m5 = uq24.mo35243m();
                        int m6 = uq24.mo35243m();
                        byte[] bArr2 = new byte[m6];
                        uq24.mo35232b(bArr2, 0, m6);
                        fc4.f31701a = kc42.mo33064e(Collections.singletonList(new zzyz(m, F, F2, m2, m3, m4, m5, bArr2)));
                    } else {
                        qb4.mo34305k(c2, false);
                    }
                }
                kc4 = fc4.f31701a;
                int i2 = d13.f20195a;
                this.f36406h = kc4;
            } while (!l);
            Objects.requireNonNull(kc4);
            this.f36407i = Math.max(kc4.f34243c, 6);
            this.f36403e.mo30354a(this.f36406h.mo33062c(this.f36399a, this.f36405g));
            this.f36404f = 4;
            return 0;
        } else if (i != 4) {
            Objects.requireNonNull(this.f36403e);
            Objects.requireNonNull(this.f36406h);
            md4 md4 = this.f36409k;
            if (md4 != null && md4.mo33524e()) {
                return this.f36409k.mo33520a(wb42, tc4);
            }
            if (this.f36411m == -1) {
                this.f36411m = ec4.m31772b(wb42, this.f36406h);
                return 0;
            }
            int l2 = this.f36400b.mo35242l();
            if (l2 < 32768) {
                int b = wb42.mo30477b(this.f36400b.mo35238h(), l2, 32768 - l2);
                if (b != -1) {
                    z = false;
                }
                if (!z) {
                    this.f36400b.mo35235e(l2 + b);
                } else if (this.f36400b.mo35239i() == 0) {
                    m35651e();
                    return -1;
                }
            } else {
                z = false;
            }
            int k = this.f36400b.mo35241k();
            int i3 = this.f36410l;
            int i4 = this.f36407i;
            if (i3 < i4) {
                uq2 uq25 = this.f36400b;
                uq25.mo35237g(Math.min(i4 - i3, uq25.mo35239i()));
            }
            long b2 = m35650b(this.f36400b, z);
            int k2 = this.f36400b.mo35241k() - k;
            this.f36400b.mo35236f(k);
            yc4.m39857b(this.f36403e, this.f36400b, k2);
            this.f36410l += k2;
            if (b2 != -1) {
                m35651e();
                this.f36410l = 0;
                this.f36411m = b2;
            }
            if (this.f36400b.mo35239i() >= 16) {
                return 0;
            }
            int i5 = this.f36400b.mo35239i();
            System.arraycopy(this.f36400b.mo35238h(), this.f36400b.mo35241k(), this.f36400b.mo35238h(), 0, i5);
            this.f36400b.mo35236f(0);
            this.f36400b.mo35235e(i5);
            return 0;
        } else {
            wb4.zzj();
            uq2 uq26 = new uq2(2);
            ((qb4) wb42).mo33311e(uq26.mo35238h(), 0, 2, false);
            int w = uq26.mo35253w();
            if ((w >> 2) == 16382) {
                wb4.zzj();
                this.f36408j = w;
                yb4 yb4 = this.f36402d;
                int i6 = d13.f20195a;
                long zze = wb4.zze();
                long zzc = wb4.zzc();
                kc4 kc43 = this.f36406h;
                Objects.requireNonNull(kc43);
                if (kc43.f34251k != null) {
                    wc4 = new ic4(kc43, zze);
                } else if (zzc == -1 || kc43.f34250j <= 0) {
                    wc4 = new vc4(kc43.mo33060a(), 0);
                } else {
                    md4 md42 = new md4(kc43, this.f36408j, zze, zzc);
                    this.f36409k = md42;
                    wc4 = md42.mo33521b();
                }
                yb4.mo18210l(wc4);
                this.f36404f = 5;
                return 0;
            }
            wb4.zzj();
            throw C7811iy.m33482a("First frame does not start with sync code.", (Throwable) null);
        }
    }

    /* renamed from: d */
    public final void mo18190d(yb4 yb4) {
        this.f36402d = yb4;
        this.f36403e = yb4.mo18211m(0, 1);
        yb4.zzB();
    }

    /* renamed from: f */
    public final void mo18191f(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f36404f = 0;
        } else {
            md4 md4 = this.f36409k;
            if (md4 != null) {
                md4.mo33523d(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f36411m = j3;
        this.f36410l = 0;
        this.f36400b.mo35233c(0);
    }
}
