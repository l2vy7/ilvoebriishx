package com.google.ads.interactivemedia.p038v3.internal;

import sun.misc.Unsafe;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bmt */
/* compiled from: IMASDK */
final class bmt extends bmu {
    bmt(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final void mo15532a(Object obj, long j, byte b) {
        if (bmv.f16711b) {
            bmv.m16724F(obj, j, b);
        } else {
            bmv.m16725G(obj, j, b);
        }
    }

    /* renamed from: b */
    public final boolean mo15533b(Object obj, long j) {
        if (bmv.f16711b) {
            return bmv.m16749w(obj, j);
        }
        return bmv.m16750x(obj, j);
    }

    /* renamed from: c */
    public final void mo15534c(Object obj, long j, boolean z) {
        if (bmv.f16711b) {
            bmv.m16724F(obj, j, r3 ? (byte) 1 : 0);
        } else {
            bmv.m16725G(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final float mo15535d(Object obj, long j) {
        return Float.intBitsToFloat(mo15542k(obj, j));
    }

    /* renamed from: e */
    public final void mo15536e(Object obj, long j, float f) {
        mo15543l(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: f */
    public final double mo15537f(Object obj, long j) {
        return Double.longBitsToDouble(mo15544m(obj, j));
    }

    /* renamed from: g */
    public final void mo15538g(Object obj, long j, double d) {
        mo15545n(obj, j, Double.doubleToLongBits(d));
    }
}
