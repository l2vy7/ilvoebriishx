package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kx3 {

    /* renamed from: c */
    public static final kx3 f34729c;

    /* renamed from: d */
    public static final kx3 f34730d = new kx3(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: e */
    public static final kx3 f34731e = new kx3(Long.MAX_VALUE, 0);

    /* renamed from: f */
    public static final kx3 f34732f = new kx3(0, Long.MAX_VALUE);

    /* renamed from: g */
    public static final kx3 f34733g;

    /* renamed from: a */
    public final long f34734a;

    /* renamed from: b */
    public final long f34735b;

    static {
        kx3 kx3 = new kx3(0, 0);
        f34729c = kx3;
        f34733g = kx3;
    }

    public kx3(long j, long j2) {
        boolean z = true;
        nu1.m20745d(j >= 0);
        nu1.m20745d(j2 < 0 ? false : z);
        this.f34734a = j;
        this.f34735b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kx3.class == obj.getClass()) {
            kx3 kx3 = (kx3) obj;
            return this.f34734a == kx3.f34734a && this.f34735b == kx3.f34735b;
        }
    }

    public final int hashCode() {
        return (((int) this.f34734a) * 31) + ((int) this.f34735b);
    }
}
