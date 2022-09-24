package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class z74 {

    /* renamed from: a */
    public final int f42337a;

    /* renamed from: b */
    public final jx3[] f42338b;

    /* renamed from: c */
    public final iw0 f42339c;

    /* renamed from: d */
    public final Object f42340d;

    /* renamed from: e */
    public final e74[] f42341e;

    public z74(jx3[] jx3Arr, e74[] e74Arr, iw0 iw0, Object obj, byte[] bArr) {
        this.f42338b = jx3Arr;
        this.f42341e = (e74[]) e74Arr.clone();
        this.f42339c = iw0;
        this.f42340d = obj;
        this.f42337a = jx3Arr.length;
    }

    /* renamed from: a */
    public final boolean mo36020a(z74 z74, int i) {
        if (z74 != null && d13.m20317p(this.f42338b[i], z74.f42338b[i]) && d13.m20317p(this.f42341e[i], z74.f42341e[i])) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo36021b(int i) {
        return this.f42338b[i] != null;
    }
}
