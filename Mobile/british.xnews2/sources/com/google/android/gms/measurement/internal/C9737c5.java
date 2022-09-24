package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
abstract class C9737c5 extends C4666b5 {

    /* renamed from: b */
    private boolean f46195b;

    C9737c5(C4670h4 h4Var) {
        super(h4Var);
        this.f21269a.mo19379d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo19313d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo19280h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo38880i() {
        if (!mo38883m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: k */
    public final void mo38881k() {
        if (this.f46195b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo19280h()) {
            this.f21269a.mo19377b();
            this.f46195b = true;
        }
    }

    /* renamed from: l */
    public final void mo38882l() {
        if (!this.f46195b) {
            mo19313d();
            this.f21269a.mo19377b();
            this.f46195b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo38883m() {
        return this.f46195b;
    }
}
