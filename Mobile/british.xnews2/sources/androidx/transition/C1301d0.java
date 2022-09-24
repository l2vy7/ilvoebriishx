package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: androidx.transition.d0 */
/* compiled from: ViewOverlayApi18 */
class C1301d0 implements C1303e0 {

    /* renamed from: a */
    private final ViewOverlay f5879a;

    C1301d0(View view) {
        this.f5879a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo6294a(Drawable drawable) {
        this.f5879a.add(drawable);
    }

    /* renamed from: b */
    public void mo6295b(Drawable drawable) {
        this.f5879a.remove(drawable);
    }
}
