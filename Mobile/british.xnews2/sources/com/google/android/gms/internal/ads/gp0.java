package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class gp0 {

    /* renamed from: b */
    private final WeakReference<View> f32386b;

    public gp0(View view) {
        this.f32386b = new WeakReference<>(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo31622a(ViewTreeObserver viewTreeObserver);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo31623b(ViewTreeObserver viewTreeObserver);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final ViewTreeObserver mo32210c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f32386b.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    /* renamed from: d */
    public final void mo32211d() {
        ViewTreeObserver c = mo32210c();
        if (c != null) {
            mo31622a(c);
        }
    }

    /* renamed from: e */
    public final void mo32212e() {
        ViewTreeObserver c = mo32210c();
        if (c != null) {
            mo31623b(c);
        }
    }
}
