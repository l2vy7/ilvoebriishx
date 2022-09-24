package com.google.android.gms.internal.cast;

import android.view.View;
import com.google.android.gms.cast.framework.media.C4580e;
import p115m4.C5759d;
import p126o4.C10843a;

/* renamed from: com.google.android.gms.internal.cast.k */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8596k extends C10843a {

    /* renamed from: b */
    private final View f43632b;

    public C8596k(View view) {
        this.f43632b = view;
    }

    /* renamed from: g */
    private final void m41086g() {
        C4580e b = mo36472b();
        if (b == null || !b.mo17850o() || b.mo17851p()) {
            this.f43632b.setVisibility(0);
        } else {
            this.f43632b.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo36473c() {
        m41086g();
    }

    /* renamed from: d */
    public final void mo36537d() {
        this.f43632b.setVisibility(0);
    }

    /* renamed from: e */
    public final void mo36474e(C5759d dVar) {
        super.mo36474e(dVar);
        m41086g();
    }

    /* renamed from: f */
    public final void mo36475f() {
        this.f43632b.setVisibility(8);
        super.mo36475f();
    }
}
