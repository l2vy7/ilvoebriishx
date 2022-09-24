package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
abstract class C9923u3 extends C9942w2 {

    /* renamed from: b */
    private boolean f46774b;

    C9923u3(C4670h4 h4Var) {
        super(h4Var);
        this.f21269a.mo19379d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo39230d() {
        if (!mo39233l()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: h */
    public final void mo39231h() {
        if (this.f46774b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo19403m()) {
            this.f21269a.mo19377b();
            this.f46774b = true;
        }
    }

    /* renamed from: i */
    public final void mo39232i() {
        if (!this.f46774b) {
            mo19402k();
            this.f21269a.mo19377b();
            this.f46774b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo19402k() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo39233l() {
        return this.f46774b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract boolean mo19403m();
}
