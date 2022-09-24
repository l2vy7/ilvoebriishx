package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.e0 */
/* compiled from: TintResources */
class C0381e0 extends C0429w {

    /* renamed from: b */
    private final WeakReference<Context> f1550b;

    public C0381e0(Context context, Resources resources) {
        super(resources);
        this.f1550b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f1550b.get();
        if (!(drawable == null || context == null)) {
            C0421v.m2245h().mo2266x(context, i, drawable);
        }
        return drawable;
    }
}
