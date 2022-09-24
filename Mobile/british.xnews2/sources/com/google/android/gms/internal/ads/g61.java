package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g61 implements cc1, C7763hn {

    /* renamed from: b */
    private final ir2 f32166b;

    /* renamed from: c */
    private final fb1 f32167c;

    /* renamed from: d */
    private final lc1 f32168d;

    /* renamed from: e */
    private final AtomicBoolean f32169e = new AtomicBoolean();

    /* renamed from: f */
    private final AtomicBoolean f32170f = new AtomicBoolean();

    public g61(ir2 ir2, fb1 fb1, lc1 lc1) {
        this.f32166b = ir2;
        this.f32167c = fb1;
        this.f32168d = lc1;
    }

    /* renamed from: a */
    private final void m32365a() {
        if (this.f32169e.compareAndSet(false, true)) {
            this.f32167c.zza();
        }
    }

    /* renamed from: n0 */
    public final void mo18767n0(C7689fn fnVar) {
        if (this.f32166b.f33474f == 1 && fnVar.f31824j) {
            m32365a();
        }
        if (fnVar.f31824j && this.f32170f.compareAndSet(false, true)) {
            this.f32168d.zza();
        }
    }

    public final synchronized void zzn() {
        if (this.f32166b.f33474f != 1) {
            m32365a();
        }
    }
}
