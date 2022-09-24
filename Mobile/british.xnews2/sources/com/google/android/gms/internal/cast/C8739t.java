package com.google.android.gms.internal.cast;

import android.widget.TextView;
import com.google.android.gms.cast.framework.media.C4580e;
import p114m4.C10770m;
import p114m4.C5759d;
import p125o4.C10843a;
import p125o4.C10844c;

/* renamed from: com.google.android.gms.internal.cast.t */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8739t extends C10843a implements C4580e.C4585e {

    /* renamed from: b */
    private final TextView f43988b;

    /* renamed from: c */
    private final C10844c f43989c;

    public C8739t(TextView textView, C10844c cVar) {
        this.f43988b = textView;
        this.f43989c = cVar;
        mo36729g();
    }

    /* renamed from: a */
    public final void mo17876a(long j, long j2) {
        mo36729g();
    }

    /* renamed from: c */
    public final void mo36473c() {
        mo36729g();
    }

    /* renamed from: e */
    public final void mo36474e(C5759d dVar) {
        super.mo36474e(dVar);
        if (mo36472b() != null) {
            mo36472b().mo17838c(this, 1000);
        }
        mo36729g();
    }

    /* renamed from: f */
    public final void mo36475f() {
        if (mo36472b() != null) {
            mo36472b().mo17822G(this);
        }
        super.mo36475f();
        mo36729g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo36729g() {
        C4580e b = mo36472b();
        if (b == null || !b.mo17850o()) {
            TextView textView = this.f43988b;
            textView.setText(textView.getContext().getString(C10770m.f49459k));
        } else if (!b.mo17852q() || this.f43989c.mo43020j() != null) {
            this.f43988b.setVisibility(0);
            TextView textView2 = this.f43988b;
            C10844c cVar = this.f43989c;
            textView2.setText(cVar.mo43023m(((long) cVar.mo43012b()) + cVar.mo43018h()));
        } else {
            this.f43988b.setVisibility(8);
        }
    }
}
