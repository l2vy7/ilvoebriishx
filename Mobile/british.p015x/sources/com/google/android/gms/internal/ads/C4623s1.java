package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.google.android.gms.internal.ads.s1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4623s1 implements vb4 {

    /* renamed from: d */
    public static final cc4 f20802d = C8106r1.f38456b;

    /* renamed from: a */
    private yb4 f20803a;

    /* renamed from: b */
    private C4607b2 f20804b;

    /* renamed from: c */
    private boolean f20805c;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* renamed from: b */
    private final boolean m21008b(wb4 wb4) throws IOException {
        C8211u1 u1Var = new C8211u1();
        if (u1Var.mo35080b(wb4, true) && (u1Var.f39708a & 2) == 2) {
            int min = Math.min(u1Var.f39712e, 8);
            uq2 uq2 = new uq2(min);
            ((qb4) wb4).mo33311e(uq2.mo35238h(), 0, min, false);
            uq2.mo35236f(0);
            if (uq2.mo35239i() >= 5 && uq2.mo35249s() == 127 && uq2.mo35223A() == 1179402563) {
                this.f20804b = new C4619q1();
            } else {
                uq2.mo35236f(0);
                try {
                    if (fd4.m32129c(1, uq2, true)) {
                        this.f20804b = new C4611d2();
                    }
                } catch (C7811iy unused) {
                }
                uq2.mo35236f(0);
                if (C4629w1.m21089j(uq2)) {
                    this.f20804b = new C4629w1();
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo18187a(wb4 wb4) throws IOException {
        try {
            return m21008b(wb4);
        } catch (C7811iy unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final int mo18189c(wb4 wb4, tc4 tc4) throws IOException {
        nu1.m20743b(this.f20803a);
        if (this.f20804b == null) {
            if (m21008b(wb4)) {
                wb4.zzj();
            } else {
                throw C7811iy.m33482a("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.f20805c) {
            ad4 m = this.f20803a.mo18211m(0, 1);
            this.f20803a.zzB();
            this.f20804b.mo18114g(this.f20803a, m);
            this.f20805c = true;
        }
        return this.f20804b.mo18111d(wb4, tc4);
    }

    /* renamed from: d */
    public final void mo18190d(yb4 yb4) {
        this.f20803a = yb4;
    }

    /* renamed from: f */
    public final void mo18191f(long j, long j2) {
        C4607b2 b2Var = this.f20804b;
        if (b2Var != null) {
            b2Var.mo18116i(j, j2);
        }
    }
}
