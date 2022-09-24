package com.google.ads.interactivemedia.p038v3.internal;

import android.util.Log;
import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wj */
/* compiled from: IMASDK */
public final class C4449wj implements C4470xd {

    /* renamed from: a */
    private final C4432vt f19426a;

    /* renamed from: b */
    private final alv f19427b = new alv(new byte[10]);

    /* renamed from: c */
    private int f19428c = 0;

    /* renamed from: d */
    private int f19429d;

    /* renamed from: e */
    private amk f19430e;

    /* renamed from: f */
    private boolean f19431f;

    /* renamed from: g */
    private boolean f19432g;

    /* renamed from: h */
    private boolean f19433h;

    /* renamed from: i */
    private int f19434i;

    /* renamed from: j */
    private int f19435j;

    /* renamed from: k */
    private boolean f19436k;

    /* renamed from: l */
    private long f19437l;

    public C4449wj(C4432vt vtVar) {
        this.f19426a = vtVar;
    }

    /* renamed from: d */
    private final void m19362d(int i) {
        this.f19428c = i;
        this.f19429d = 0;
    }

    /* renamed from: e */
    private final boolean m19363e(alw alw, byte[] bArr, int i) {
        int min = Math.min(alw.mo13947e(), i - this.f19429d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            alw.mo13954l(min);
        } else {
            alw.mo13956n(bArr, this.f19429d, min);
        }
        int i2 = this.f19429d + min;
        this.f19429d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo16748a(amk amk, C4309re reVar, C4469xc xcVar) {
        this.f19430e = amk;
        this.f19426a.mo16708b(reVar, xcVar);
    }

    /* renamed from: b */
    public final void mo16749b() {
        this.f19428c = 0;
        this.f19429d = 0;
        this.f19433h = false;
        this.f19426a.mo16707a();
    }

    /* renamed from: c */
    public final void mo16750c(alw alw, int i) throws C4144lb {
        alw alw2 = alw;
        aup.m14889t(this.f19430e);
        int i2 = -1;
        int i3 = 2;
        if ((i & 1) != 0) {
            int i4 = this.f19428c;
            if (!(i4 == 0 || i4 == 1)) {
                if (i4 != 2) {
                    int i5 = this.f19435j;
                    if (i5 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i5);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.f19426a.mo16711e();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            m19362d(1);
        }
        int i6 = i;
        while (alw.mo13947e() > 0) {
            int i7 = this.f19428c;
            if (i7 != 0) {
                int i8 = 0;
                if (i7 != 1) {
                    if (i7 != i3) {
                        int e = alw.mo13947e();
                        int i9 = this.f19435j;
                        if (i9 != i2) {
                            i8 = e - i9;
                        }
                        if (i8 > 0) {
                            e -= i8;
                            alw2.mo13949g(alw.mo13950h() + e);
                        }
                        this.f19426a.mo16710d(alw2);
                        int i10 = this.f19435j;
                        if (i10 != i2) {
                            int i11 = i10 - e;
                            this.f19435j = i11;
                            if (i11 == 0) {
                                this.f19426a.mo16711e();
                                m19362d(1);
                            }
                        }
                    } else {
                        if (m19363e(alw2, this.f19427b.f15245a, Math.min(10, this.f19434i)) && m19363e(alw2, (byte[]) null, this.f19434i)) {
                            this.f19427b.mo13923e(0);
                            long j = C6540C.TIME_UNSET;
                            this.f19437l = C6540C.TIME_UNSET;
                            if (this.f19431f) {
                                this.f19427b.mo13925g(4);
                                int i12 = this.f19427b.mo13927i(3);
                                this.f19427b.mo13925g(1);
                                int i13 = this.f19427b.mo13927i(15);
                                this.f19427b.mo13925g(1);
                                long i14 = ((long) (i13 << 15)) | (((long) i12) << 30) | ((long) this.f19427b.mo13927i(15));
                                this.f19427b.mo13925g(1);
                                if (!this.f19433h && this.f19432g) {
                                    this.f19427b.mo13925g(4);
                                    int i15 = this.f19427b.mo13927i(3);
                                    this.f19427b.mo13925g(1);
                                    int i16 = this.f19427b.mo13927i(15);
                                    this.f19427b.mo13925g(1);
                                    int i17 = this.f19427b.mo13927i(15);
                                    this.f19427b.mo13925g(1);
                                    this.f19430e.mo13998f((((long) i15) << 30) | ((long) (i16 << 15)) | ((long) i17));
                                    this.f19433h = true;
                                }
                                j = this.f19430e.mo13998f(i14);
                                this.f19437l = j;
                            }
                            i6 |= true != this.f19436k ? 0 : 4;
                            this.f19426a.mo16709c(j, i6);
                            m19362d(3);
                            i2 = -1;
                        }
                    }
                } else if (m19363e(alw2, this.f19427b.f15245a, 9)) {
                    int i18 = 0;
                    this.f19427b.mo13923e(0);
                    int i19 = this.f19427b.mo13927i(24);
                    if (i19 != 1) {
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(i19);
                        Log.w("PesReader", sb2.toString());
                        i2 = -1;
                        this.f19435j = -1;
                    } else {
                        this.f19427b.mo13925g(8);
                        int i20 = this.f19427b.mo13927i(16);
                        this.f19427b.mo13925g(5);
                        this.f19436k = this.f19427b.mo13926h();
                        this.f19427b.mo13925g(2);
                        this.f19431f = this.f19427b.mo13926h();
                        this.f19432g = this.f19427b.mo13926h();
                        this.f19427b.mo13925g(6);
                        int i21 = this.f19427b.mo13927i(8);
                        this.f19434i = i21;
                        if (i20 == 0) {
                            this.f19435j = -1;
                        } else {
                            int i22 = (i20 - 3) - i21;
                            this.f19435j = i22;
                            if (i22 < 0) {
                                StringBuilder sb3 = new StringBuilder(47);
                                sb3.append("Found negative packet payload size: ");
                                sb3.append(i22);
                                Log.w("PesReader", sb3.toString());
                                i2 = -1;
                                this.f19435j = -1;
                                i18 = 2;
                            }
                        }
                        i2 = -1;
                        i18 = 2;
                    }
                    m19362d(i18);
                } else {
                    i2 = -1;
                }
            } else {
                alw2.mo13954l(alw.mo13947e());
            }
            i3 = 2;
        }
    }
}
