package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class h70 {

    /* renamed from: a */
    private boolean f32640a = false;

    /* renamed from: b */
    private boolean f32641b = false;

    /* renamed from: c */
    private float f32642c = 0.0f;

    /* renamed from: d */
    private final AtomicBoolean f32643d = new AtomicBoolean(false);

    /* renamed from: a */
    public final synchronized float mo32355a() {
        return this.f32642c;
    }

    /* renamed from: b */
    public final synchronized void mo32356b(boolean z, float f) {
        this.f32641b = z;
        this.f32642c = f;
    }

    /* renamed from: c */
    public final synchronized void mo32357c(boolean z) {
        this.f32640a = z;
        this.f32643d.set(true);
    }

    /* renamed from: d */
    public final synchronized boolean mo32358d() {
        return this.f32641b;
    }

    /* renamed from: e */
    public final synchronized boolean mo32359e(boolean z) {
        if (!this.f32643d.get()) {
            return z;
        }
        return this.f32640a;
    }
}
