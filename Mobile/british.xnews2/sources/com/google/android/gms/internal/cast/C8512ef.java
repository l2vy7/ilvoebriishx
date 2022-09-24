package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.cast.ef */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8512ef extends C8529ff {
    C8512ef(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final void mo36435a(Object obj, long j, byte b) {
        if (C8545gf.f43510i) {
            C8545gf.m40950d(obj, j, b);
        } else {
            C8545gf.m40951e(obj, j, b);
        }
    }

    /* renamed from: b */
    public final boolean mo36436b(Object obj, long j) {
        if (C8545gf.f43510i) {
            return C8545gf.m40942A(obj, j);
        }
        return C8545gf.m40943B(obj, j);
    }

    /* renamed from: c */
    public final void mo36437c(Object obj, long j, boolean z) {
        if (C8545gf.f43510i) {
            C8545gf.m40950d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            C8545gf.m40951e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final float mo36438d(Object obj, long j) {
        return Float.intBitsToFloat(mo36531k(obj, j));
    }

    /* renamed from: e */
    public final void mo36439e(Object obj, long j, float f) {
        mo36532l(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: f */
    public final double mo36440f(Object obj, long j) {
        return Double.longBitsToDouble(mo36533m(obj, j));
    }

    /* renamed from: g */
    public final void mo36441g(Object obj, long j, double d) {
        mo36534n(obj, j, Double.doubleToLongBits(d));
    }
}
