package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.u1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8211u1 {

    /* renamed from: a */
    public int f39708a;

    /* renamed from: b */
    public long f39709b;

    /* renamed from: c */
    public int f39710c;

    /* renamed from: d */
    public int f39711d;

    /* renamed from: e */
    public int f39712e;

    /* renamed from: f */
    public final int[] f39713f = new int[255];

    /* renamed from: g */
    private final uq2 f39714g = new uq2(255);

    C8211u1() {
    }

    /* renamed from: a */
    public final void mo35079a() {
        this.f39708a = 0;
        this.f39709b = 0;
        this.f39710c = 0;
        this.f39711d = 0;
        this.f39712e = 0;
    }

    /* renamed from: b */
    public final boolean mo35080b(wb4 wb4, boolean z) throws IOException {
        mo35079a();
        this.f39714g.mo35233c(27);
        if (zb4.m21284c(wb4, this.f39714g.mo35238h(), 0, 27, z) && this.f39714g.mo35223A() == 1332176723) {
            if (this.f39714g.mo35249s() == 0) {
                this.f39708a = this.f39714g.mo35249s();
                this.f39709b = this.f39714g.mo35254x();
                this.f39714g.mo35255y();
                this.f39714g.mo35255y();
                this.f39714g.mo35255y();
                int s = this.f39714g.mo35249s();
                this.f39710c = s;
                this.f39711d = s + 27;
                this.f39714g.mo35233c(s);
                if (zb4.m21284c(wb4, this.f39714g.mo35238h(), 0, this.f39710c, z)) {
                    for (int i = 0; i < this.f39710c; i++) {
                        this.f39713f[i] = this.f39714g.mo35249s();
                        this.f39712e += this.f39713f[i];
                    }
                    return true;
                }
            } else if (z) {
                return false;
            } else {
                throw C7811iy.m33484c("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo35081c(wb4 wb4, long j) throws IOException {
        nu1.m20745d(wb4.zze() == wb4.zzd());
        this.f39714g.mo35233c(4);
        while (true) {
            if ((j == -1 || wb4.zze() + 4 < j) && zb4.m21284c(wb4, this.f39714g.mo35238h(), 0, 4, true)) {
                this.f39714g.mo35236f(0);
                if (this.f39714g.mo35223A() != 1332176723) {
                    ((qb4) wb4).mo34305k(1, false);
                } else {
                    wb4.zzj();
                    return true;
                }
            }
        }
        do {
            if ((j != -1 && wb4.zze() >= j) || wb4.zzb(1) == -1) {
                return false;
            }
            break;
        } while (wb4.zzb(1) == -1);
        return false;
    }
}
