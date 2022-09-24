package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class os3 extends ps3 {
    os3(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final byte mo33738a(long j) {
        return Memory.peekByte(j);
    }

    /* renamed from: b */
    public final double mo33739b(Object obj, long j) {
        return Double.longBitsToDouble(mo34184m(obj, j));
    }

    /* renamed from: c */
    public final float mo33740c(Object obj, long j) {
        return Float.intBitsToFloat(mo34183l(obj, j));
    }

    /* renamed from: d */
    public final void mo33741d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    /* renamed from: e */
    public final void mo33742e(Object obj, long j, boolean z) {
        if (qs3.f38281j) {
            qs3.m36715g(obj, j, r3 ? (byte) 1 : 0);
        } else {
            qs3.m36716h(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: f */
    public final void mo33743f(Object obj, long j, byte b) {
        if (qs3.f38281j) {
            qs3.m36715g(obj, j, b);
        } else {
            qs3.m36716h(obj, j, b);
        }
    }

    /* renamed from: g */
    public final void mo33744g(Object obj, long j, double d) {
        mo34188q(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: h */
    public final void mo33745h(Object obj, long j, float f) {
        mo34187p(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: i */
    public final boolean mo33746i(Object obj, long j) {
        if (qs3.f38281j) {
            return qs3.m36705E(obj, j);
        }
        return qs3.m36706F(obj, j);
    }
}
