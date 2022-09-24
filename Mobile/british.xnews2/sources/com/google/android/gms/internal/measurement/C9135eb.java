package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.eb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9135eb extends C9150fb {
    C9135eb(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo37508a(Object obj, long j) {
        return Double.longBitsToDouble(mo37571k(obj, j));
    }

    /* renamed from: b */
    public final float mo37509b(Object obj, long j) {
        return Float.intBitsToFloat(mo37570j(obj, j));
    }

    /* renamed from: c */
    public final void mo37510c(Object obj, long j, boolean z) {
        if (C9165gb.f45057h) {
            C9165gb.m42948d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            C9165gb.m42949e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo37511d(Object obj, long j, byte b) {
        if (C9165gb.f45057h) {
            C9165gb.m42948d(obj, j, b);
        } else {
            C9165gb.m42949e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo37512e(Object obj, long j, double d) {
        mo37575o(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo37513f(Object obj, long j, float f) {
        mo37574n(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo37514g(Object obj, long j) {
        if (C9165gb.f45057h) {
            return C9165gb.m42969y(obj, j);
        }
        return C9165gb.m42970z(obj, j);
    }
}
