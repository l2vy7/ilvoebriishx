package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.android.gms.internal.ads.jh */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7831jh {

    /* renamed from: f */
    public static final C7831jh f33886f = new C7831jh(new C7829jf());

    /* renamed from: g */
    public static final wx3<C7831jh> f33887g = C7828je.f33858a;

    /* renamed from: a */
    public final long f33888a;

    /* renamed from: b */
    public final long f33889b;

    /* renamed from: c */
    public final long f33890c;

    /* renamed from: d */
    public final float f33891d;

    /* renamed from: e */
    public final float f33892e;

    private C7831jh(C7829jf jfVar) {
        this.f33888a = C6540C.TIME_UNSET;
        this.f33889b = C6540C.TIME_UNSET;
        this.f33890c = C6540C.TIME_UNSET;
        this.f33891d = -3.4028235E38f;
        this.f33892e = -3.4028235E38f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7831jh)) {
            return false;
        }
        long j = ((C7831jh) obj).f33888a;
        return true;
    }

    public final int hashCode() {
        int i = (int) -9223372034707292159L;
        return (((((((i * 31) + i) * 31) + i) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
