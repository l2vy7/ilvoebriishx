package com.google.android.gms.internal.cast;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.gms.cast.framework.media.C4580e;
import p108l4.C10657a;
import p114m4.C10770m;
import p114m4.C5758b;
import p114m4.C5759d;
import p125o4.C10843a;

/* renamed from: com.google.android.gms.internal.cast.m */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8629m extends C10843a {

    /* renamed from: b */
    private final ImageView f43691b;

    /* renamed from: c */
    private final String f43692c;

    /* renamed from: d */
    private final String f43693d;

    /* renamed from: e */
    private final Context f43694e;

    /* renamed from: f */
    private C10657a.C10662d f43695f = null;

    public C8629m(ImageView imageView, Context context) {
        this.f43691b = imageView;
        Context applicationContext = context.getApplicationContext();
        this.f43694e = applicationContext;
        this.f43692c = applicationContext.getString(C10770m.f49460l);
        this.f43693d = applicationContext.getString(C10770m.f49449C);
        imageView.setEnabled(false);
    }

    /* renamed from: c */
    public final void mo36473c() {
        mo36604g();
    }

    /* renamed from: d */
    public final void mo36537d() {
        this.f43691b.setEnabled(false);
    }

    /* renamed from: e */
    public final void mo36474e(C5759d dVar) {
        if (this.f43695f == null) {
            this.f43695f = new C8613l(this);
        }
        super.mo36474e(dVar);
        dVar.mo22548o(this.f43695f);
        mo36604g();
    }

    /* renamed from: f */
    public final void mo36475f() {
        C10657a.C10662d dVar;
        this.f43691b.setEnabled(false);
        C5759d d = C5758b.m25464e(this.f43694e).mo22535c().mo42953d();
        if (!(d == null || (dVar = this.f43695f) == null)) {
            d.mo22552s(dVar);
        }
        super.mo36475f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo36604g() {
        String str;
        C5759d d = C5758b.m25464e(this.f43694e).mo22535c().mo42953d();
        if (d == null || !d.mo42943c()) {
            this.f43691b.setEnabled(false);
            return;
        }
        C4580e b = mo36472b();
        if (b == null || !b.mo17850o()) {
            this.f43691b.setEnabled(false);
        } else {
            this.f43691b.setEnabled(true);
        }
        boolean r = d.mo22551r();
        this.f43691b.setSelected(r);
        ImageView imageView = this.f43691b;
        if (r) {
            str = this.f43693d;
        } else {
            str = this.f43692c;
        }
        imageView.setContentDescription(str);
    }
}
