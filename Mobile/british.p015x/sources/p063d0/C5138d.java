package p063d0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: d0.d */
/* compiled from: WrappedDrawableApi14 */
class C5138d extends Drawable implements Drawable.Callback, C5137c, C5136b {

    /* renamed from: h */
    static final PorterDuff.Mode f22550h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private int f22551b;

    /* renamed from: c */
    private PorterDuff.Mode f22552c;

    /* renamed from: d */
    private boolean f22553d;

    /* renamed from: e */
    C5140f f22554e;

    /* renamed from: f */
    private boolean f22555f;

    /* renamed from: g */
    Drawable f22556g;

    C5138d(C5140f fVar, Resources resources) {
        this.f22554e = fVar;
        m23422e(resources);
    }

    /* renamed from: d */
    private C5140f m23421d() {
        return new C5140f(this.f22554e);
    }

    /* renamed from: e */
    private void m23422e(Resources resources) {
        Drawable.ConstantState constantState;
        C5140f fVar = this.f22554e;
        if (fVar != null && (constantState = fVar.f22559b) != null) {
            mo21283a(constantState.newDrawable(resources));
        }
    }

    /* renamed from: f */
    private boolean m23423f(int[] iArr) {
        if (!mo21285c()) {
            return false;
        }
        C5140f fVar = this.f22554e;
        ColorStateList colorStateList = fVar.f22560c;
        PorterDuff.Mode mode = fVar.f22561d;
        if (colorStateList == null || mode == null) {
            this.f22553d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f22553d && colorForState == this.f22551b && mode == this.f22552c)) {
                setColorFilter(colorForState, mode);
                this.f22551b = colorForState;
                this.f22552c = mode;
                this.f22553d = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo21283a(Drawable drawable) {
        Drawable drawable2 = this.f22556g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f22556g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C5140f fVar = this.f22554e;
            if (fVar != null) {
                fVar.f22559b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: b */
    public final Drawable mo21284b() {
        return this.f22556g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo21285c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f22556g.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C5140f fVar = this.f22554e;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f22556g.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        C5140f fVar = this.f22554e;
        if (fVar == null || !fVar.mo21322a()) {
            return null;
        }
        this.f22554e.f22558a = getChangingConfigurations();
        return this.f22554e;
    }

    public Drawable getCurrent() {
        return this.f22556g.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f22556g.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f22556g.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return C5135a.m23406f(this.f22556g);
    }

    public int getMinimumHeight() {
        return this.f22556g.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f22556g.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f22556g.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f22556g.getPadding(rect);
    }

    public int[] getState() {
        return this.f22556g.getState();
    }

    public Region getTransparentRegion() {
        return this.f22556g.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C5135a.m23408h(this.f22556g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f22554e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.mo21285c()
            if (r0 == 0) goto L_0x000d
            d0.f r0 = r1.f22554e
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f22560c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f22556g
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p063d0.C5138d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f22556g.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f22555f && super.mutate() == this) {
            this.f22554e = m23421d();
            Drawable drawable = this.f22556g;
            if (drawable != null) {
                drawable.mutate();
            }
            C5140f fVar = this.f22554e;
            if (fVar != null) {
                Drawable drawable2 = this.f22556g;
                fVar.f22559b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f22555f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f22556g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return C5135a.m23413m(this.f22556g, i);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f22556g.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f22556g.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C5135a.m23410j(this.f22556g, z);
    }

    public void setChangingConfigurations(int i) {
        this.f22556g.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f22556g.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f22556g.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f22556g.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m23423f(iArr) || this.f22556g.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f22554e.f22560c = colorStateList;
        m23423f(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f22554e.f22561d = mode;
        m23423f(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f22556g.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    C5138d(Drawable drawable) {
        this.f22554e = m23421d();
        mo21283a(drawable);
    }
}
