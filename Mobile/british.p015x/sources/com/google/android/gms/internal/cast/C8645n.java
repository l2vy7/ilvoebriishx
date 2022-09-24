package com.google.android.gms.internal.cast;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.framework.media.C4580e;
import p006a5.C6492o;
import p115m4.C10770m;
import p115m4.C5759d;
import p126o4.C10843a;

/* renamed from: com.google.android.gms.internal.cast.n */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8645n extends C10843a {

    /* renamed from: b */
    private final ImageView f43784b;

    /* renamed from: c */
    private final View f43785c;

    /* renamed from: d */
    private final boolean f43786d;

    /* renamed from: e */
    private final Drawable f43787e;

    /* renamed from: f */
    private final String f43788f;

    /* renamed from: g */
    private final Drawable f43789g;

    /* renamed from: h */
    private final String f43790h;

    /* renamed from: i */
    private final Drawable f43791i;

    /* renamed from: j */
    private final String f43792j;

    /* renamed from: k */
    private boolean f43793k = false;

    public C8645n(ImageView imageView, Context context, Drawable drawable, Drawable drawable2, Drawable drawable3, View view, boolean z) {
        this.f43784b = imageView;
        this.f43787e = drawable;
        this.f43789g = drawable2;
        this.f43791i = drawable3 != null ? drawable3 : drawable2;
        this.f43788f = context.getString(C10770m.f49462n);
        this.f43790h = context.getString(C10770m.f49461m);
        this.f43792j = context.getString(C10770m.f49468t);
        this.f43785c = view;
        this.f43786d = z;
        imageView.setEnabled(false);
    }

    /* renamed from: g */
    private final void m41137g() {
        C4580e b = mo36472b();
        if (b == null || !b.mo17850o()) {
            this.f43784b.setEnabled(false);
        } else if (b.mo17855t()) {
            if (b.mo17852q()) {
                m41138h(this.f43791i, this.f43792j);
            } else {
                m41138h(this.f43789g, this.f43790h);
            }
        } else if (b.mo17851p()) {
            m41139i(false);
        } else if (b.mo17854s()) {
            m41138h(this.f43787e, this.f43788f);
        } else if (b.mo17853r()) {
            m41139i(true);
        }
    }

    /* renamed from: h */
    private final void m41138h(Drawable drawable, String str) {
        boolean z = !drawable.equals(this.f43784b.getDrawable());
        this.f43784b.setImageDrawable(drawable);
        this.f43784b.setContentDescription(str);
        this.f43784b.setVisibility(0);
        this.f43784b.setEnabled(true);
        View view = this.f43785c;
        if (view != null) {
            view.setVisibility(8);
        }
        if (z && this.f43793k) {
            this.f43784b.sendAccessibilityEvent(8);
        }
    }

    @TargetApi(21)
    /* renamed from: i */
    private final void m41139i(boolean z) {
        if (C6492o.m28285h()) {
            this.f43793k = this.f43784b.isAccessibilityFocused();
        }
        View view = this.f43785c;
        int i = 0;
        if (view != null) {
            view.setVisibility(0);
            if (this.f43793k) {
                this.f43785c.sendAccessibilityEvent(8);
            }
        }
        ImageView imageView = this.f43784b;
        if (true == this.f43786d) {
            i = 4;
        }
        imageView.setVisibility(i);
        this.f43784b.setEnabled(!z);
    }

    /* renamed from: c */
    public final void mo36473c() {
        m41137g();
    }

    /* renamed from: d */
    public final void mo36537d() {
        m41139i(true);
    }

    /* renamed from: e */
    public final void mo36474e(C5759d dVar) {
        super.mo36474e(dVar);
        m41137g();
    }

    /* renamed from: f */
    public final void mo36475f() {
        this.f43784b.setEnabled(false);
        super.mo36475f();
    }
}
