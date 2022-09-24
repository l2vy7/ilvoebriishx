package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.C9063a1;

/* renamed from: com.google.android.gms.measurement.internal.j8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9813j8 extends C9923u3 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f46389c;

    /* renamed from: d */
    protected final C9791h8 f46390d = new C9791h8(this);

    /* renamed from: e */
    protected final C9781g8 f46391e = new C9781g8(this);

    /* renamed from: f */
    protected final C9760e8 f46392f = new C9760e8(this);

    C9813j8(C4670h4 h4Var) {
        super(h4Var);
    }

    /* renamed from: p */
    static /* bridge */ /* synthetic */ void m45185p(C9813j8 j8Var, long j) {
        j8Var.mo19272b();
        j8Var.m45187s();
        j8Var.f21269a.mo19276j().mo19286v().mo38857b("Activity paused, time", Long.valueOf(j));
        j8Var.f46392f.mo38899a(j);
        if (j8Var.f21269a.mo19392z().mo19339D()) {
            j8Var.f46391e.mo38964b(j);
        }
    }

    /* renamed from: q */
    static /* bridge */ /* synthetic */ void m45186q(C9813j8 j8Var, long j) {
        j8Var.mo19272b();
        j8Var.m45187s();
        j8Var.f21269a.mo19276j().mo19286v().mo38857b("Activity resumed, time", Long.valueOf(j));
        if (j8Var.f21269a.mo19392z().mo19339D() || j8Var.f21269a.mo19365F().f21341q.mo39052b()) {
            j8Var.f46391e.mo38965c(j);
        }
        j8Var.f46392f.mo38900b();
        C9791h8 h8Var = j8Var.f46390d;
        h8Var.f46337a.mo19272b();
        if (h8Var.f46337a.f21269a.mo19385n()) {
            h8Var.mo38978b(h8Var.f46337a.f21269a.mo19274f().currentTimeMillis(), false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final void m45187s() {
        mo19272b();
        if (this.f46389c == null) {
            this.f46389c = new C9063a1(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo19403m() {
        return false;
    }
}
