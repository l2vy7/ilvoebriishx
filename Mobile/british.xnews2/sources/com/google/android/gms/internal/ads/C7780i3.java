package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.android.gms.internal.ads.i3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7780i3 implements C7670f4 {

    /* renamed from: a */
    private final C8071q2 f33057a;

    /* renamed from: b */
    private final tp2 f33058b = new tp2(new byte[10], 10);

    /* renamed from: c */
    private int f33059c = 0;

    /* renamed from: d */
    private int f33060d;

    /* renamed from: e */
    private ay2 f33061e;

    /* renamed from: f */
    private boolean f33062f;

    /* renamed from: g */
    private boolean f33063g;

    /* renamed from: h */
    private boolean f33064h;

    /* renamed from: i */
    private int f33065i;

    /* renamed from: j */
    private int f33066j;

    /* renamed from: k */
    private boolean f33067k;

    public C7780i3(C8071q2 q2Var) {
        this.f33057a = q2Var;
    }

    /* renamed from: c */
    private final void m33045c(int i) {
        this.f33059c = i;
        this.f33060d = 0;
    }

    /* renamed from: d */
    private final boolean m33046d(uq2 uq2, byte[] bArr, int i) {
        int min = Math.min(uq2.mo35239i(), i - this.f33060d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            uq2.mo35237g(min);
        } else {
            uq2.mo35232b(bArr, this.f33060d, min);
        }
        int i2 = this.f33060d + min;
        this.f33060d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo31720a(uq2 uq2, int i) throws C7811iy {
        long j;
        uq2 uq22 = uq2;
        nu1.m20743b(this.f33061e);
        int i2 = -1;
        int i3 = 2;
        if ((i & 1) != 0) {
            int i4 = this.f33059c;
            if (!(i4 == 0 || i4 == 1)) {
                if (i4 != 2) {
                    int i5 = this.f33066j;
                    if (i5 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i5);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.f33057a.zzc();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            m33045c(1);
        }
        int i6 = i;
        while (uq2.mo35239i() > 0) {
            int i7 = this.f33059c;
            if (i7 != 0) {
                int i8 = 0;
                if (i7 != 1) {
                    if (i7 != i3) {
                        int i9 = uq2.mo35239i();
                        int i10 = this.f33066j;
                        if (i10 != i2) {
                            i8 = i9 - i10;
                        }
                        if (i8 > 0) {
                            i9 -= i8;
                            uq22.mo35235e(uq2.mo35241k() + i9);
                        }
                        this.f33057a.mo18072a(uq22);
                        int i11 = this.f33066j;
                        if (i11 != i2) {
                            int i12 = i11 - i9;
                            this.f33066j = i12;
                            if (i12 == 0) {
                                this.f33057a.zzc();
                                m33045c(1);
                            }
                        }
                    } else {
                        if (m33046d(uq22, this.f33058b.f39483a, Math.min(10, this.f33065i)) && m33046d(uq22, (byte[]) null, this.f33065i)) {
                            this.f33058b.mo35013h(0);
                            if (this.f33062f) {
                                this.f33058b.mo35015j(4);
                                int c = this.f33058b.mo35008c(3);
                                this.f33058b.mo35015j(1);
                                int c2 = this.f33058b.mo35008c(15);
                                this.f33058b.mo35015j(1);
                                long c3 = ((long) (c2 << 15)) | (((long) c) << 30) | ((long) this.f33058b.mo35008c(15));
                                this.f33058b.mo35015j(1);
                                if (!this.f33064h && this.f33063g) {
                                    this.f33058b.mo35015j(4);
                                    int c4 = this.f33058b.mo35008c(3);
                                    this.f33058b.mo35015j(1);
                                    int c5 = this.f33058b.mo35008c(15);
                                    this.f33058b.mo35015j(1);
                                    int c6 = this.f33058b.mo35008c(15);
                                    this.f33058b.mo35015j(1);
                                    this.f33061e.mo30573b((((long) c4) << 30) | ((long) (c5 << 15)) | ((long) c6));
                                    this.f33064h = true;
                                }
                                j = this.f33061e.mo30573b(c3);
                            } else {
                                j = C6540C.TIME_UNSET;
                            }
                            i6 |= true != this.f33067k ? 0 : 4;
                            this.f33057a.mo18074c(j, i6);
                            m33045c(3);
                            i2 = -1;
                        }
                    }
                } else if (m33046d(uq22, this.f33058b.f39483a, 9)) {
                    int i13 = 0;
                    this.f33058b.mo35013h(0);
                    int c7 = this.f33058b.mo35008c(24);
                    if (c7 != 1) {
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(c7);
                        Log.w("PesReader", sb2.toString());
                        i2 = -1;
                        this.f33066j = -1;
                    } else {
                        this.f33058b.mo35015j(8);
                        int c8 = this.f33058b.mo35008c(16);
                        this.f33058b.mo35015j(5);
                        this.f33067k = this.f33058b.mo35017l();
                        this.f33058b.mo35015j(2);
                        this.f33062f = this.f33058b.mo35017l();
                        this.f33063g = this.f33058b.mo35017l();
                        this.f33058b.mo35015j(6);
                        int c9 = this.f33058b.mo35008c(8);
                        this.f33065i = c9;
                        if (c8 == 0) {
                            this.f33066j = -1;
                        } else {
                            int i14 = (c8 - 3) - c9;
                            this.f33066j = i14;
                            if (i14 < 0) {
                                StringBuilder sb3 = new StringBuilder(47);
                                sb3.append("Found negative packet payload size: ");
                                sb3.append(i14);
                                Log.w("PesReader", sb3.toString());
                                i2 = -1;
                                this.f33066j = -1;
                                i13 = 2;
                            }
                        }
                        i2 = -1;
                        i13 = 2;
                    }
                    m33045c(i13);
                } else {
                    i2 = -1;
                }
            } else {
                uq22.mo35237g(uq2.mo35239i());
            }
            i3 = 2;
        }
    }

    /* renamed from: b */
    public final void mo31721b(ay2 ay2, yb4 yb4, C7633e4 e4Var) {
        this.f33061e = ay2;
        this.f33057a.mo18073b(yb4, e4Var);
    }

    public final void zzc() {
        this.f33059c = 0;
        this.f33060d = 0;
        this.f33064h = false;
        this.f33057a.zze();
    }
}
