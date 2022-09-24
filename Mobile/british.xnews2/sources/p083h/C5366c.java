package p083h;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p062d0.C5135a;

/* renamed from: h.c */
/* compiled from: DrawableWrapper */
public class C5366c extends Drawable implements Drawable.Callback {

    /* renamed from: b */
    private Drawable f23635b;

    public C5366c(Drawable drawable) {
        mo21751b(drawable);
    }

    /* renamed from: a */
    public Drawable mo21750a() {
        return this.f23635b;
    }

    /* renamed from: b */
    public void mo21751b(Drawable drawable) {
        Drawable drawable2 = this.f23635b;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f23635b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f23635b.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f23635b.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f23635b.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f23635b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f23635b.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f23635b.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f23635b.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f23635b.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f23635b.getPadding(rect);
    }

    public int[] getState() {
        return this.f23635b.getState();
    }

    public Region getTransparentRegion() {
        return this.f23635b.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C5135a.m23408h(this.f23635b);
    }

    public boolean isStateful() {
        return this.f23635b.isStateful();
    }

    public void jumpToCurrentState() {
        this.f23635b.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f23635b.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f23635b.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f23635b.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C5135a.m23410j(this.f23635b, z);
    }

    public void setChangingConfigurations(int i) {
        this.f23635b.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f23635b.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f23635b.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f23635b.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C5135a.m23411k(this.f23635b, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C5135a.m23412l(this.f23635b, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f23635b.setState(iArr);
    }

    public void setTint(int i) {
        C5135a.m23414n(this.f23635b, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C5135a.m23415o(this.f23635b, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C5135a.m23416p(this.f23635b, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f23635b.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
