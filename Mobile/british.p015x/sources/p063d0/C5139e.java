package p063d0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: d0.e */
/* compiled from: WrappedDrawableApi21 */
class C5139e extends C5138d {

    /* renamed from: i */
    private static Method f22557i;

    C5139e(Drawable drawable) {
        super(drawable);
        m23427g();
    }

    /* renamed from: g */
    private void m23427g() {
        if (f22557i == null) {
            try {
                f22557i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo21285c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f22556g;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public Rect getDirtyBounds() {
        return this.f22556g.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f22556g.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f22556g;
        if (!(drawable == null || (method = f22557i) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    public void setHotspot(float f, float f2) {
        this.f22556g.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f22556g.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo21285c()) {
            super.setTint(i);
        } else {
            this.f22556g.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo21285c()) {
            super.setTintList(colorStateList);
        } else {
            this.f22556g.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (mo21285c()) {
            super.setTintMode(mode);
        } else {
            this.f22556g.setTintMode(mode);
        }
    }

    C5139e(C5140f fVar, Resources resources) {
        super(fVar, resources);
        m23427g();
    }
}
