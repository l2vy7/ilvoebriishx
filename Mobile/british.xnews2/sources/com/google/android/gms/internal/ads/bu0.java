package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class bu0 implements View.OnAttachStateChangeListener {

    /* renamed from: b */
    final /* synthetic */ hl0 f30110b;

    /* renamed from: c */
    final /* synthetic */ eu0 f30111c;

    bu0(eu0 eu0, hl0 hl0) {
        this.f30111c = eu0;
        this.f30110b = hl0;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f30111c.m20411z(view, this.f30110b, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
