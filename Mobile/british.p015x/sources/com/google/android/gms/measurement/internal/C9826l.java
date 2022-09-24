package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.C9063a1;

/* renamed from: com.google.android.gms.measurement.internal.l */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
abstract class C9826l {

    /* renamed from: d */
    private static volatile Handler f46421d;

    /* renamed from: a */
    private final C9747d5 f46422a;

    /* renamed from: b */
    private final Runnable f46423b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile long f46424c;

    C9826l(C9747d5 d5Var) {
        C4604n.m20098k(d5Var);
        this.f46422a = d5Var;
        this.f46423b = new C9815k(this, d5Var);
    }

    /* renamed from: f */
    private final Handler m45205f() {
        Handler handler;
        if (f46421d != null) {
            return f46421d;
        }
        synchronized (C9826l.class) {
            if (f46421d == null) {
                f46421d = new C9063a1(this.f46422a.mo19277r().getMainLooper());
            }
            handler = f46421d;
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo39048b() {
        this.f46424c = 0;
        m45205f().removeCallbacks(this.f46423b);
    }

    /* renamed from: c */
    public abstract void mo38885c();

    /* renamed from: d */
    public final void mo39049d(long j) {
        mo39048b();
        if (j >= 0) {
            this.f46424c = this.f46422a.mo19274f().currentTimeMillis();
            if (!m45205f().postDelayed(this.f46423b, j)) {
                this.f46422a.mo19276j().mo19282q().mo38857b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: e */
    public final boolean mo39050e() {
        return this.f46424c != 0;
    }
}
