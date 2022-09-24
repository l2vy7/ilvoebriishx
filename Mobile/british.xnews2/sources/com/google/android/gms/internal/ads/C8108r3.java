package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8108r3 implements C7670f4 {

    /* renamed from: a */
    private final C8072q3 f38516a;

    /* renamed from: b */
    private final uq2 f38517b = new uq2(32);

    /* renamed from: c */
    private int f38518c;

    /* renamed from: d */
    private int f38519d;

    /* renamed from: e */
    private boolean f38520e;

    /* renamed from: f */
    private boolean f38521f;

    public C8108r3(C8072q3 q3Var) {
        this.f38516a = q3Var;
    }

    /* renamed from: a */
    public final void mo31720a(uq2 uq2, int i) {
        int i2 = i & 1;
        int k = i2 != 0 ? uq2.mo35241k() + uq2.mo35249s() : -1;
        if (this.f38521f) {
            if (i2 != 0) {
                this.f38521f = false;
                uq2.mo35236f(k);
                this.f38519d = 0;
            } else {
                return;
            }
        }
        while (uq2.mo35239i() > 0) {
            int i3 = this.f38519d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int s = uq2.mo35249s();
                    uq2.mo35236f(uq2.mo35241k() - 1);
                    if (s == 255) {
                        this.f38521f = true;
                        return;
                    }
                }
                int min = Math.min(uq2.mo35239i(), 3 - this.f38519d);
                uq2.mo35232b(this.f38517b.mo35238h(), this.f38519d, min);
                int i4 = this.f38519d + min;
                this.f38519d = i4;
                if (i4 == 3) {
                    this.f38517b.mo35236f(0);
                    this.f38517b.mo35235e(3);
                    this.f38517b.mo35237g(1);
                    int s2 = this.f38517b.mo35249s();
                    int s3 = this.f38517b.mo35249s();
                    this.f38520e = (s2 & 128) != 0;
                    this.f38518c = (((s2 & 15) << 8) | s3) + 3;
                    int j = this.f38517b.mo35240j();
                    int i5 = this.f38518c;
                    if (j < i5) {
                        int j2 = this.f38517b.mo35240j();
                        this.f38517b.mo35230H(Math.min(4098, Math.max(i5, j2 + j2)));
                    }
                }
            } else {
                int min2 = Math.min(uq2.mo35239i(), this.f38518c - this.f38519d);
                uq2.mo35232b(this.f38517b.mo35238h(), this.f38519d, min2);
                int i6 = this.f38519d + min2;
                this.f38519d = i6;
                int i7 = this.f38518c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.f38520e) {
                        this.f38517b.mo35235e(i7);
                    } else if (d13.m20282M(this.f38517b.mo35238h(), 0, this.f38518c, -1) != 0) {
                        this.f38521f = true;
                        return;
                    } else {
                        this.f38517b.mo35235e(this.f38518c - 4);
                    }
                    this.f38517b.mo35236f(0);
                    this.f38516a.mo32326a(this.f38517b);
                    this.f38519d = 0;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo31721b(ay2 ay2, yb4 yb4, C7633e4 e4Var) {
        this.f38516a.mo32327b(ay2, yb4, e4Var);
        this.f38521f = true;
    }

    public final void zzc() {
        this.f38521f = true;
    }
}
