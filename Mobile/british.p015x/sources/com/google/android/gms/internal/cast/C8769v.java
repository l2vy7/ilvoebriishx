package com.google.android.gms.internal.cast;

import android.widget.TextView;
import com.google.android.gms.cast.framework.media.C4580e;
import p115m4.C10770m;
import p115m4.C5759d;
import p126o4.C10843a;
import p126o4.C10844c;

/* renamed from: com.google.android.gms.internal.cast.v */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8769v extends C10843a implements C4580e.C4585e {

    /* renamed from: b */
    private final TextView f44123b;

    /* renamed from: c */
    private final C10844c f44124c;

    public C8769v(TextView textView, C10844c cVar) {
        this.f44123b = textView;
        this.f44124c = cVar;
        mo36741g();
    }

    /* renamed from: a */
    public final void mo17876a(long j, long j2) {
        mo36741g();
    }

    /* renamed from: c */
    public final void mo36473c() {
        mo36741g();
    }

    /* renamed from: e */
    public final void mo36474e(C5759d dVar) {
        super.mo36474e(dVar);
        if (mo36472b() != null) {
            mo36472b().mo17838c(this, 1000);
        }
        mo36741g();
    }

    /* renamed from: f */
    public final void mo36475f() {
        if (mo36472b() != null) {
            mo36472b().mo17822G(this);
        }
        super.mo36475f();
        mo36741g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo36741g() {
        C4580e b = mo36472b();
        if (b == null || !b.mo17850o()) {
            TextView textView = this.f44123b;
            textView.setText(textView.getContext().getString(C10770m.f49459k));
            return;
        }
        this.f44123b.setText(this.f44124c.mo43023m(b.mo17842g()));
    }
}
