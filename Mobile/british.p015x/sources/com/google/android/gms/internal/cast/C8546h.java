package com.google.android.gms.internal.cast;

import android.view.View;
import com.google.android.gms.cast.framework.media.C4580e;
import p115m4.C5759d;
import p126o4.C10843a;
import p126o4.C10844c;

/* renamed from: com.google.android.gms.internal.cast.h */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8546h extends C10843a implements C4580e.C4585e {

    /* renamed from: b */
    private final View f43511b;

    /* renamed from: c */
    private final C10844c f43512c;

    public C8546h(View view, C10844c cVar) {
        this.f43511b = view;
        this.f43512c = cVar;
        view.setEnabled(false);
    }

    /* renamed from: a */
    public final void mo17876a(long j, long j2) {
        mo36546g();
    }

    /* renamed from: c */
    public final void mo36473c() {
        mo36546g();
    }

    /* renamed from: d */
    public final void mo36537d() {
        this.f43511b.setEnabled(false);
    }

    /* renamed from: e */
    public final void mo36474e(C5759d dVar) {
        super.mo36474e(dVar);
        C4580e b = mo36472b();
        if (b != null) {
            b.mo17838c(this, 1000);
        }
        mo36546g();
    }

    /* renamed from: f */
    public final void mo36475f() {
        C4580e b = mo36472b();
        if (b != null) {
            b.mo17822G(this);
        }
        this.f43511b.setEnabled(false);
        super.mo36475f();
        mo36546g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo36546g() {
        C4580e b = mo36472b();
        boolean z = false;
        if (b == null || !b.mo17850o() || b.mo17856u()) {
            this.f43511b.setEnabled(false);
        } else if (!b.mo17852q()) {
            this.f43511b.setEnabled(true);
        } else {
            View view = this.f43511b;
            if (b.mo17835T() && !this.f43512c.mo43015e()) {
                z = true;
            }
            view.setEnabled(z);
        }
    }
}
