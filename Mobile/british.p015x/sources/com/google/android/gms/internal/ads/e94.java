package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class e94 {

    /* renamed from: a */
    private final SparseBooleanArray f31281a = new SparseBooleanArray();

    /* renamed from: b */
    private boolean f31282b;

    /* renamed from: a */
    public final e94 mo31506a(int i) {
        nu1.m20747f(!this.f31282b);
        this.f31281a.append(i, true);
        return this;
    }

    /* renamed from: b */
    public final fb4 mo31507b() {
        nu1.m20747f(!this.f31282b);
        this.f31282b = true;
        return new fb4(this.f31281a, (ea4) null);
    }
}
