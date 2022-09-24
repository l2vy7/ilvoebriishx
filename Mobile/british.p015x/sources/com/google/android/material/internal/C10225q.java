package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: com.google.android.material.internal.q */
/* compiled from: ViewOverlayApi18 */
class C10225q implements C10226r {

    /* renamed from: a */
    private final ViewOverlay f48138a;

    C10225q(View view) {
        this.f48138a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo41000a(Drawable drawable) {
        this.f48138a.add(drawable);
    }

    /* renamed from: b */
    public void mo41001b(Drawable drawable) {
        this.f48138a.remove(drawable);
    }
}
