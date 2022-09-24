package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.m2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7926m2 implements C8071q2 {

    /* renamed from: v */
    private static final byte[] f35334v = {73, 68, 51};

    /* renamed from: a */
    private final boolean f35335a;

    /* renamed from: b */
    private final tp2 f35336b = new tp2(new byte[7], 7);

    /* renamed from: c */
    private final uq2 f35337c = new uq2(Arrays.copyOf(f35334v, 10));

    /* renamed from: d */
    private final String f35338d;

    /* renamed from: e */
    private String f35339e;

    /* renamed from: f */
    private ad4 f35340f;

    /* renamed from: g */
    private ad4 f35341g;

    /* renamed from: h */
    private int f35342h;

    /* renamed from: i */
    private int f35343i;

    /* renamed from: j */
    private int f35344j;

    /* renamed from: k */
    private boolean f35345k;

    /* renamed from: l */
    private boolean f35346l;

    /* renamed from: m */
    private int f35347m;

    /* renamed from: n */
    private int f35348n;

    /* renamed from: o */
    private int f35349o;

    /* renamed from: p */
    private boolean f35350p;

    /* renamed from: q */
    private long f35351q;

    /* renamed from: r */
    private int f35352r;

    /* renamed from: s */
    private long f35353s;

    /* renamed from: t */
    private ad4 f35354t;

    /* renamed from: u */
    private long f35355u;

    public C7926m2(boolean z, String str) {
        m34650f();
        this.f35347m = -1;
        this.f35348n = -1;
        this.f35351q = C6540C.TIME_UNSET;
        this.f35353s = C6540C.TIME_UNSET;
        this.f35335a = z;
        this.f35338d = str;
    }

    /* renamed from: d */
    public static boolean m34648d(int i) {
        return (i & 65526) == 65520;
    }

    /* renamed from: e */
    private final void m34649e() {
        this.f35346l = false;
        m34650f();
    }

    /* renamed from: f */
    private final void m34650f() {
        this.f35342h = 0;
        this.f35343i = 0;
        this.f35344j = 256;
    }

    /* renamed from: g */
    private final void m34651g() {
        this.f35342h = 3;
        this.f35343i = 0;
    }

    /* renamed from: h */
    private final void m34652h(ad4 ad4, long j, int i, int i2) {
        this.f35342h = 4;
        this.f35343i = i;
        this.f35354t = ad4;
        this.f35355u = j;
        this.f35352r = i2;
    }

    /* renamed from: i */
    private final boolean m34653i(uq2 uq2, byte[] bArr, int i) {
        int min = Math.min(uq2.mo35239i(), i - this.f35343i);
        uq2.mo35232b(bArr, this.f35343i, min);
        int i2 = this.f35343i + min;
        this.f35343i = i2;
        return i2 == i;
    }

    /* renamed from: j */
    private static final boolean m34654j(byte b, byte b2) {
        return m34648d((b2 & 255) | 65280);
    }

    /* renamed from: k */
    private static final boolean m34655k(uq2 uq2, byte[] bArr, int i) {
        if (uq2.mo35239i() < i) {
            return false;
        }
        uq2.mo35232b(bArr, 0, i);
        return true;
    }

    /* renamed from: a */
    public final void mo18072a(uq2 uq2) throws C7811iy {
        int i;
        byte b;
        int i2;
        uq2 uq22 = uq2;
        Objects.requireNonNull(this.f35340f);
        int i3 = d13.f20195a;
        while (uq2.mo35239i() > 0) {
            int i4 = this.f35342h;
            int i5 = 13;
            int i6 = 2;
            if (i4 == 0) {
                byte[] h = uq2.mo35238h();
                int k = uq2.mo35241k();
                int l = uq2.mo35242l();
                while (true) {
                    if (k >= l) {
                        uq22.mo35236f(k);
                        break;
                    }
                    i = k + 1;
                    b = h[k] & 255;
                    if (this.f35344j == 512 && m34654j((byte) -1, (byte) b)) {
                        if (this.f35346l) {
                            break;
                        }
                        int i7 = i - 2;
                        uq22.mo35236f(i7 + 1);
                        if (m34655k(uq22, this.f35336b.f39483a, 1)) {
                            this.f35336b.mo35013h(4);
                            int c = this.f35336b.mo35008c(1);
                            int i8 = this.f35347m;
                            if (i8 == -1 || c == i8) {
                                if (this.f35348n != -1) {
                                    if (!m34655k(uq22, this.f35336b.f39483a, 1)) {
                                        break;
                                    }
                                    this.f35336b.mo35013h(i6);
                                    if (this.f35336b.mo35008c(4) == this.f35348n) {
                                        uq22.mo35236f(i7 + 2);
                                    }
                                }
                                if (!m34655k(uq22, this.f35336b.f39483a, 4)) {
                                    break;
                                }
                                this.f35336b.mo35013h(14);
                                int c2 = this.f35336b.mo35008c(i5);
                                if (c2 >= 7) {
                                    byte[] h2 = uq2.mo35238h();
                                    int l2 = uq2.mo35242l();
                                    int i9 = i7 + c2;
                                    if (i9 >= l2) {
                                        break;
                                    }
                                    if ((r8 = h2[i9]) != -1) {
                                    }
                                }
                            }
                        }
                    }
                    int i10 = this.f35344j;
                    byte b2 = i10 | b;
                    if (b2 == 329) {
                        i2 = 768;
                    } else if (b2 == 511) {
                        i2 = 512;
                    } else if (b2 != 836) {
                        if (b2 == 1075) {
                            this.f35342h = 2;
                            this.f35343i = 3;
                            this.f35352r = 0;
                            this.f35337c.mo35236f(0);
                            uq22.mo35236f(i);
                            break;
                        } else if (i10 != 256) {
                            this.f35344j = 256;
                            k = i - 1;
                            i5 = 13;
                            i6 = 2;
                        } else {
                            k = i;
                            i5 = 13;
                            i6 = 2;
                        }
                    } else {
                        i2 = 1024;
                    }
                    this.f35344j = i2;
                    k = i;
                    i5 = 13;
                    i6 = 2;
                }
                this.f35349o = (b & 8) >> 3;
                this.f35345k = 1 == ((b & 1) ^ 1);
                if (!this.f35346l) {
                    this.f35342h = 1;
                    this.f35343i = 0;
                } else {
                    m34651g();
                }
                uq22.mo35236f(i);
            } else if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        int min = Math.min(uq2.mo35239i(), this.f35352r - this.f35343i);
                        this.f35354t.mo30357d(uq22, min);
                        int i11 = this.f35343i + min;
                        this.f35343i = i11;
                        int i12 = this.f35352r;
                        if (i11 == i12) {
                            long j = this.f35353s;
                            if (j != C6540C.TIME_UNSET) {
                                this.f35354t.mo30358e(j, 1, i12, 0, (zc4) null);
                                this.f35353s += this.f35355u;
                            }
                            m34650f();
                        }
                    } else {
                        if (m34653i(uq22, this.f35336b.f39483a, true != this.f35345k ? 5 : 7)) {
                            this.f35336b.mo35013h(0);
                            if (!this.f35350p) {
                                int c3 = this.f35336b.mo35008c(2) + 1;
                                if (c3 != 2) {
                                    StringBuilder sb = new StringBuilder(61);
                                    sb.append("Detected audio object type: ");
                                    sb.append(c3);
                                    sb.append(", but assuming AAC LC.");
                                    Log.w("AdtsReader", sb.toString());
                                }
                                this.f35336b.mo35015j(5);
                                int c4 = this.f35336b.mo35008c(3);
                                int i13 = this.f35348n;
                                int i14 = xa4.f41124c;
                                byte[] bArr = {(byte) (((i13 >> 1) & 7) | 16), (byte) (((c4 << 3) & 120) | ((i13 << 7) & 128))};
                                wa4 a = xa4.m39418a(bArr);
                                ge4 ge4 = new ge4();
                                ge4.mo32081h(this.f35339e);
                                ge4.mo32093s(MimeTypes.AUDIO_AAC);
                                ge4.mo32078f0(a.f40748c);
                                ge4.mo32076e0(a.f40747b);
                                ge4.mo32094t(a.f40746a);
                                ge4.mo32083i(Collections.singletonList(bArr));
                                ge4.mo32085k(this.f35338d);
                                C8281w y = ge4.mo32099y();
                                this.f35351q = 1024000000 / ((long) y.f40633z);
                                this.f35340f.mo30354a(y);
                                this.f35350p = true;
                            } else {
                                this.f35336b.mo35015j(10);
                            }
                            this.f35336b.mo35015j(4);
                            int c5 = this.f35336b.mo35008c(13) - 7;
                            if (this.f35345k) {
                                c5 -= 2;
                            }
                            m34652h(this.f35340f, this.f35351q, 0, c5);
                        }
                    }
                } else if (m34653i(uq22, this.f35337c.mo35238h(), 10)) {
                    this.f35341g.mo30357d(this.f35337c, 10);
                    this.f35337c.mo35236f(6);
                    m34652h(this.f35341g, 0, 10, 10 + this.f35337c.mo35248r());
                }
            } else if (uq2.mo35239i() != 0) {
                this.f35336b.f39483a[0] = uq2.mo35238h()[uq2.mo35241k()];
                this.f35336b.mo35013h(2);
                int c6 = this.f35336b.mo35008c(4);
                int i15 = this.f35348n;
                if (i15 == -1 || c6 == i15) {
                    if (!this.f35346l) {
                        this.f35346l = true;
                        this.f35347m = this.f35349o;
                        this.f35348n = c6;
                    }
                    m34651g();
                } else {
                    m34649e();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo18073b(yb4 yb4, C7633e4 e4Var) {
        e4Var.mo31471c();
        this.f35339e = e4Var.mo31470b();
        ad4 m = yb4.mo18211m(e4Var.mo31469a(), 1);
        this.f35340f = m;
        this.f35354t = m;
        if (this.f35335a) {
            e4Var.mo31471c();
            ad4 m2 = yb4.mo18211m(e4Var.mo31469a(), 5);
            this.f35341g = m2;
            ge4 ge4 = new ge4();
            ge4.mo32081h(e4Var.mo31470b());
            ge4.mo32093s(MimeTypes.APPLICATION_ID3);
            m2.mo30354a(ge4.mo32099y());
            return;
        }
        this.f35341g = new ub4();
    }

    /* renamed from: c */
    public final void mo18074c(long j, int i) {
        if (j != C6540C.TIME_UNSET) {
            this.f35353s = j;
        }
    }

    public final void zzc() {
    }

    public final void zze() {
        this.f35353s = C6540C.TIME_UNSET;
        m34649e();
    }
}
