package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.t1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8175t1 {

    /* renamed from: a */
    private final C8211u1 f39236a = new C8211u1();

    /* renamed from: b */
    private final uq2 f39237b = new uq2(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);

    /* renamed from: c */
    private int f39238c = -1;

    /* renamed from: d */
    private int f39239d;

    /* renamed from: e */
    private boolean f39240e;

    C8175t1() {
    }

    /* renamed from: f */
    private final int m37631f(int i) {
        int i2;
        int i3 = 0;
        this.f39239d = 0;
        do {
            int i4 = this.f39239d;
            int i5 = i + i4;
            C8211u1 u1Var = this.f39236a;
            if (i5 >= u1Var.f39710c) {
                break;
            }
            int[] iArr = u1Var.f39713f;
            this.f39239d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: a */
    public final uq2 mo34844a() {
        return this.f39237b;
    }

    /* renamed from: b */
    public final C8211u1 mo34845b() {
        return this.f39236a;
    }

    /* renamed from: c */
    public final void mo34846c() {
        this.f39236a.mo35079a();
        this.f39237b.mo35233c(0);
        this.f39238c = -1;
        this.f39240e = false;
    }

    /* renamed from: d */
    public final void mo34847d() {
        if (this.f39237b.mo35238h().length != 65025) {
            uq2 uq2 = this.f39237b;
            uq2.mo35234d(Arrays.copyOf(uq2.mo35238h(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, this.f39237b.mo35242l())), this.f39237b.mo35242l());
        }
    }

    /* renamed from: e */
    public final boolean mo34848e(wb4 wb4) throws IOException {
        if (this.f39240e) {
            this.f39240e = false;
            this.f39237b.mo35233c(0);
        }
        while (true) {
            boolean z = true;
            if (this.f39240e) {
                return true;
            }
            int i = this.f39238c;
            if (i < 0) {
                if (!this.f39236a.mo35081c(wb4, -1) || !this.f39236a.mo35080b(wb4, true)) {
                    return false;
                }
                C8211u1 u1Var = this.f39236a;
                int i2 = u1Var.f39711d;
                if ((u1Var.f39708a & 1) == 1 && this.f39237b.mo35242l() == 0) {
                    i2 += m37631f(0);
                    i = this.f39239d;
                } else {
                    i = 0;
                }
                if (!zb4.m21286e(wb4, i2)) {
                    return false;
                }
                this.f39238c = i;
            }
            int f = m37631f(i);
            int i3 = this.f39238c + this.f39239d;
            if (f > 0) {
                uq2 uq2 = this.f39237b;
                uq2.mo35230H(uq2.mo35242l() + f);
                if (!zb4.m21285d(wb4, this.f39237b.mo35238h(), this.f39237b.mo35242l(), f)) {
                    return false;
                }
                uq2 uq22 = this.f39237b;
                uq22.mo35235e(uq22.mo35242l() + f);
                if (this.f39236a.f39713f[i3 - 1] == 255) {
                    z = false;
                }
                this.f39240e = z;
            }
            if (i3 == this.f39236a.f39710c) {
                i3 = -1;
            }
            this.f39238c = i3;
        }
        return false;
    }
}
