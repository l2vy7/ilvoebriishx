package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class qw3 {

    /* renamed from: a */
    public final c54 f38301a;

    /* renamed from: b */
    public final long f38302b;

    /* renamed from: c */
    public final long f38303c;

    /* renamed from: d */
    public final long f38304d;

    /* renamed from: e */
    public final long f38305e;

    /* renamed from: f */
    public final boolean f38306f;

    /* renamed from: g */
    public final boolean f38307g;

    /* renamed from: h */
    public final boolean f38308h;

    /* renamed from: i */
    public final boolean f38309i;

    qw3(c54 c54, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        nu1.m20745d(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        nu1.m20745d(z5);
        this.f38301a = c54;
        this.f38302b = j;
        this.f38303c = j2;
        this.f38304d = j3;
        this.f38305e = j4;
        this.f38306f = false;
        this.f38307g = z2;
        this.f38308h = z3;
        this.f38309i = z4;
    }

    /* renamed from: a */
    public final qw3 mo34421a(long j) {
        if (j == this.f38303c) {
            return this;
        }
        return new qw3(this.f38301a, this.f38302b, j, this.f38304d, this.f38305e, false, this.f38307g, this.f38308h, this.f38309i);
    }

    /* renamed from: b */
    public final qw3 mo34422b(long j) {
        if (j == this.f38302b) {
            return this;
        }
        return new qw3(this.f38301a, j, this.f38303c, this.f38304d, this.f38305e, false, this.f38307g, this.f38308h, this.f38309i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qw3.class == obj.getClass()) {
            qw3 qw3 = (qw3) obj;
            return this.f38302b == qw3.f38302b && this.f38303c == qw3.f38303c && this.f38304d == qw3.f38304d && this.f38305e == qw3.f38305e && this.f38307g == qw3.f38307g && this.f38308h == qw3.f38308h && this.f38309i == qw3.f38309i && d13.m20317p(this.f38301a, qw3.f38301a);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.f38301a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f38302b)) * 31) + ((int) this.f38303c)) * 31) + ((int) this.f38304d)) * 31) + ((int) this.f38305e)) * 961) + (this.f38307g ? 1 : 0)) * 31) + (this.f38308h ? 1 : 0)) * 31) + (this.f38309i ? 1 : 0);
    }
}
