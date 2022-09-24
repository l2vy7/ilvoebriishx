package com.google.android.gms.measurement.internal;

import com.google.android.exoplayer2.SimpleExoPlayer;

/* renamed from: com.google.android.gms.measurement.internal.e8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9760e8 {

    /* renamed from: a */
    private C9750d8 f46241a;

    /* renamed from: b */
    final /* synthetic */ C9813j8 f46242b;

    C9760e8(C9813j8 j8Var) {
        this.f46242b = j8Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo38899a(long j) {
        this.f46241a = new C9750d8(this, this.f46242b.f21269a.mo19274f().currentTimeMillis(), j);
        this.f46242b.f46389c.postDelayed(this.f46241a, SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo38900b() {
        this.f46242b.mo19272b();
        C9750d8 d8Var = this.f46241a;
        if (d8Var != null) {
            this.f46242b.f46389c.removeCallbacks(d8Var);
        }
        this.f46242b.f21269a.mo19365F().f21341q.mo39051a(false);
    }
}
