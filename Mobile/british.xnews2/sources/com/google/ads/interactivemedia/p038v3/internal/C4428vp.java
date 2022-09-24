package com.google.ads.interactivemedia.p038v3.internal;

import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vp */
/* compiled from: IMASDK */
public final class C4428vp implements C4432vt {

    /* renamed from: a */
    private static final byte[] f19214a = {73, 68, 51};

    /* renamed from: b */
    private final boolean f19215b;

    /* renamed from: c */
    private final alv f19216c = new alv(new byte[7]);

    /* renamed from: d */
    private final alw f19217d = new alw(Arrays.copyOf(f19214a, 10));

    /* renamed from: e */
    private final String f19218e;

    /* renamed from: f */
    private String f19219f;

    /* renamed from: g */
    private C4327rw f19220g;

    /* renamed from: h */
    private C4327rw f19221h;

    /* renamed from: i */
    private int f19222i;

    /* renamed from: j */
    private int f19223j;

    /* renamed from: k */
    private int f19224k;

    /* renamed from: l */
    private boolean f19225l;

    /* renamed from: m */
    private boolean f19226m;

    /* renamed from: n */
    private int f19227n;

    /* renamed from: o */
    private int f19228o;

    /* renamed from: p */
    private int f19229p;

    /* renamed from: q */
    private boolean f19230q;

    /* renamed from: r */
    private long f19231r;

    /* renamed from: s */
    private int f19232s;

    /* renamed from: t */
    private long f19233t;

    /* renamed from: u */
    private C4327rw f19234u;

    /* renamed from: v */
    private long f19235v;

    public C4428vp(boolean z, String str) {
        m19255i();
        this.f19227n = -1;
        this.f19228o = -1;
        this.f19231r = C6540C.TIME_UNSET;
        this.f19215b = z;
        this.f19218e = str;
    }

    /* renamed from: f */
    public static boolean m19252f(int i) {
        return (i & 65526) == 65520;
    }

    /* renamed from: g */
    private final void m19253g() {
        this.f19226m = false;
        m19255i();
    }

    /* renamed from: h */
    private final boolean m19254h(alw alw, byte[] bArr, int i) {
        int min = Math.min(alw.mo13947e(), i - this.f19223j);
        alw.mo13956n(bArr, this.f19223j, min);
        int i2 = this.f19223j + min;
        this.f19223j = i2;
        return i2 == i;
    }

    /* renamed from: i */
    private final void m19255i() {
        this.f19222i = 0;
        this.f19223j = 0;
        this.f19224k = 256;
    }

    /* renamed from: j */
    private final void m19256j(C4327rw rwVar, long j, int i, int i2) {
        this.f19222i = 4;
        this.f19223j = i;
        this.f19234u = rwVar;
        this.f19235v = j;
        this.f19232s = i2;
    }

    /* renamed from: k */
    private final void m19257k() {
        this.f19222i = 3;
        this.f19223j = 0;
    }

    /* renamed from: l */
    private static final boolean m19258l(byte b) {
        return m19252f((b & 255) | 65280);
    }

    /* renamed from: m */
    private static final boolean m19259m(alw alw, byte[] bArr, int i) {
        if (alw.mo13947e() < i) {
            return false;
        }
        alw.mo13956n(bArr, 0, i);
        return true;
    }

    /* renamed from: a */
    public final void mo16707a() {
        m19253g();
    }

    /* renamed from: b */
    public final void mo16708b(C4309re reVar, C4469xc xcVar) {
        xcVar.mo16763a();
        this.f19219f = xcVar.mo16765c();
        C4327rw ba = reVar.mo13362ba(xcVar.mo16764b(), 1);
        this.f19220g = ba;
        this.f19234u = ba;
        if (this.f19215b) {
            xcVar.mo16763a();
            C4327rw ba2 = reVar.mo13362ba(xcVar.mo16764b(), 5);
            this.f19221h = ba2;
            C4119kd kdVar = new C4119kd();
            kdVar.mo16107S(xcVar.mo16765c());
            kdVar.mo16120ae(MimeTypes.APPLICATION_ID3);
            ba2.mo13403a(kdVar.mo16115a());
            return;
        }
        this.f19221h = new C4305ra();
    }

    /* renamed from: c */
    public final void mo16709c(long j, int i) {
        this.f19233t = j;
    }

    /* renamed from: d */
    public final void mo16710d(alw alw) throws C4144lb {
        int i;
        byte b;
        int i2;
        alw alw2 = alw;
        aup.m14890u(this.f19220g);
        int i3 = amm.f15298a;
        while (alw.mo13947e() > 0) {
            int i4 = this.f19222i;
            int i5 = 13;
            int i6 = 2;
            if (i4 == 0) {
                byte[] j = alw.mo13952j();
                int h = alw.mo13950h();
                int f = alw.mo13948f();
                while (true) {
                    if (h >= f) {
                        alw2.mo13951i(h);
                        break;
                    }
                    i = h + 1;
                    b = j[h] & 255;
                    if (this.f19224k == 512 && m19258l((byte) b)) {
                        if (this.f19226m) {
                            break;
                        }
                        int i7 = i - 2;
                        alw2.mo13951i(i7 + 1);
                        if (m19259m(alw2, this.f19216c.f15245a, 1)) {
                            this.f19216c.mo13923e(4);
                            int i8 = this.f19216c.mo13927i(1);
                            int i9 = this.f19227n;
                            if (i9 == -1 || i8 == i9) {
                                if (this.f19228o != -1) {
                                    if (!m19259m(alw2, this.f19216c.f15245a, 1)) {
                                        break;
                                    }
                                    this.f19216c.mo13923e(i6);
                                    if (this.f19216c.mo13927i(4) == this.f19228o) {
                                        alw2.mo13951i(i7 + 2);
                                    }
                                }
                                if (!m19259m(alw2, this.f19216c.f15245a, 4)) {
                                    break;
                                }
                                this.f19216c.mo13923e(14);
                                int i10 = this.f19216c.mo13927i(i5);
                                if (i10 >= 7) {
                                    byte[] j2 = alw.mo13952j();
                                    int f2 = alw.mo13948f();
                                    int i11 = i7 + i10;
                                    if (i11 >= f2) {
                                        break;
                                    }
                                    if ((r8 = j2[i11]) != -1) {
                                    }
                                }
                            }
                        }
                    }
                    int i12 = this.f19224k;
                    byte b2 = i12 | b;
                    if (b2 == 329) {
                        i2 = 768;
                    } else if (b2 == 511) {
                        i2 = 512;
                    } else if (b2 != 836) {
                        if (b2 == 1075) {
                            this.f19222i = 2;
                            this.f19223j = 3;
                            this.f19232s = 0;
                            this.f19217d.mo13951i(0);
                            alw2.mo13951i(i);
                            break;
                        } else if (i12 != 256) {
                            this.f19224k = 256;
                            h = i - 1;
                            i5 = 13;
                            i6 = 2;
                        } else {
                            h = i;
                            i5 = 13;
                            i6 = 2;
                        }
                    } else {
                        i2 = 1024;
                    }
                    this.f19224k = i2;
                    h = i;
                    i5 = 13;
                    i6 = 2;
                }
                this.f19229p = (b & 8) >> 3;
                this.f19225l = 1 == ((b & 1) ^ 1);
                if (!this.f19226m) {
                    this.f19222i = 1;
                    this.f19223j = 0;
                } else {
                    m19257k();
                }
                alw2.mo13951i(i);
            } else if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        int min = Math.min(alw.mo13947e(), this.f19232s - this.f19223j);
                        this.f19234u.mo13406d(alw2, min);
                        int i13 = this.f19223j + min;
                        this.f19223j = i13;
                        int i14 = this.f19232s;
                        if (i13 == i14) {
                            this.f19234u.mo13404b(this.f19233t, 1, i14, 0, (C4326rv) null);
                            this.f19233t += this.f19235v;
                            m19255i();
                        }
                    } else {
                        if (m19254h(alw2, this.f19216c.f15245a, true != this.f19225l ? 5 : 7)) {
                            this.f19216c.mo13923e(0);
                            if (!this.f19230q) {
                                int i15 = this.f19216c.mo13927i(2) + 1;
                                if (i15 != 2) {
                                    StringBuilder sb = new StringBuilder(61);
                                    sb.append("Detected audio object type: ");
                                    sb.append(i15);
                                    sb.append(", but assuming AAC LC.");
                                    Log.w("AdtsReader", sb.toString());
                                }
                                this.f19216c.mo13925g(5);
                                int i16 = this.f19216c.mo13927i(3);
                                int i17 = this.f19228o;
                                int i18 = C4205ni.f18068a;
                                byte[] bArr = {(byte) (((i17 >> 1) & 7) | 16), (byte) (((i16 << 3) & 120) | ((i17 << 7) & 128))};
                                C4204nh a = C4205ni.m18265a(bArr);
                                C4119kd kdVar = new C4119kd();
                                kdVar.mo16107S(this.f19219f);
                                kdVar.mo16120ae(MimeTypes.AUDIO_AAC);
                                kdVar.mo16097I(a.f18067c);
                                kdVar.mo16096H(a.f18066b);
                                kdVar.mo16121af(a.f18065a);
                                kdVar.mo16108T(Collections.singletonList(bArr));
                                kdVar.mo16110V(this.f19218e);
                                C4120ke a2 = kdVar.mo16115a();
                                this.f19231r = 1024000000 / ((long) a2.f17695z);
                                this.f19220g.mo13403a(a2);
                                this.f19230q = true;
                            } else {
                                this.f19216c.mo13925g(10);
                            }
                            this.f19216c.mo13925g(4);
                            int i19 = this.f19216c.mo13927i(13) - 7;
                            if (this.f19225l) {
                                i19 -= 2;
                            }
                            m19256j(this.f19220g, this.f19231r, 0, i19);
                        }
                    }
                } else if (m19254h(alw2, this.f19217d.mo13952j(), 10)) {
                    this.f19221h.mo13406d(this.f19217d, 10);
                    this.f19217d.mo13951i(6);
                    m19256j(this.f19221h, 0, 10, this.f19217d.mo13933B() + 10);
                }
            } else if (alw.mo13947e() != 0) {
                this.f19216c.f15245a[0] = alw.mo13952j()[alw.mo13950h()];
                this.f19216c.mo13923e(2);
                int i20 = this.f19216c.mo13927i(4);
                int i21 = this.f19228o;
                if (i21 == -1 || i20 == i21) {
                    if (!this.f19226m) {
                        this.f19226m = true;
                        this.f19227n = this.f19229p;
                        this.f19228o = i20;
                    }
                    m19257k();
                } else {
                    m19253g();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo16711e() {
    }
}
