package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o8 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
abstract class C9868o8 extends C9857n8 {

    /* renamed from: c */
    private boolean f46560c;

    C9868o8(C9958x8 x8Var) {
        super(x8Var);
        this.f46518b.mo39304p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo39090d() {
        if (!mo39092i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: h */
    public final void mo39091h() {
        if (!this.f46560c) {
            mo38861k();
            this.f46518b.mo39298k();
            this.f46560c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo39092i() {
        return this.f46560c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract boolean mo38861k();
}
