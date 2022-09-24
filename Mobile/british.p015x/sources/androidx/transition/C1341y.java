package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: androidx.transition.y */
/* compiled from: ViewGroupOverlayApi18 */
class C1341y implements C1342z {

    /* renamed from: a */
    private final ViewGroupOverlay f5965a;

    C1341y(ViewGroup viewGroup) {
        this.f5965a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo6294a(Drawable drawable) {
        this.f5965a.add(drawable);
    }

    /* renamed from: b */
    public void mo6295b(Drawable drawable) {
        this.f5965a.remove(drawable);
    }

    /* renamed from: c */
    public void mo6389c(View view) {
        this.f5965a.add(view);
    }

    /* renamed from: d */
    public void mo6390d(View view) {
        this.f5965a.remove(view);
    }
}
