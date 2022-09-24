package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.f */
/* compiled from: RoundRectDrawable */
class C0461f extends Drawable {

    /* renamed from: a */
    private float f1791a;

    /* renamed from: b */
    private final Paint f1792b;

    /* renamed from: c */
    private final RectF f1793c;

    /* renamed from: d */
    private final Rect f1794d;

    /* renamed from: e */
    private float f1795e;

    /* renamed from: f */
    private boolean f1796f = false;

    /* renamed from: g */
    private boolean f1797g = true;

    /* renamed from: h */
    private ColorStateList f1798h;

    /* renamed from: i */
    private PorterDuffColorFilter f1799i;

    /* renamed from: j */
    private ColorStateList f1800j;

    /* renamed from: k */
    private PorterDuff.Mode f1801k = PorterDuff.Mode.SRC_IN;

    C0461f(ColorStateList colorStateList, float f) {
        this.f1791a = f;
        this.f1792b = new Paint(5);
        m2448e(colorStateList);
        this.f1793c = new RectF();
        this.f1794d = new Rect();
    }

    /* renamed from: a */
    private PorterDuffColorFilter m2447a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: e */
    private void m2448e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1798h = colorStateList;
        this.f1792b.setColor(colorStateList.getColorForState(getState(), this.f1798h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m2449i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1793c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f1794d.set(rect);
        if (this.f1796f) {
            float d = C0462g.m2459d(this.f1795e, this.f1791a, this.f1797g);
            this.f1794d.inset((int) Math.ceil((double) C0462g.m2458c(this.f1795e, this.f1791a, this.f1797g)), (int) Math.ceil((double) d));
            this.f1793c.set(this.f1794d);
        }
    }

    /* renamed from: b */
    public ColorStateList mo2448b() {
        return this.f1798h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo2449c() {
        return this.f1795e;
    }

    /* renamed from: d */
    public float mo2450d() {
        return this.f1791a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1792b;
        if (this.f1799i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1799i);
            z = true;
        }
        RectF rectF = this.f1793c;
        float f = this.f1791a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    /* renamed from: f */
    public void mo2452f(ColorStateList colorStateList) {
        m2448e(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2453g(float f, boolean z, boolean z2) {
        if (f != this.f1795e || this.f1796f != z || this.f1797g != z2) {
            this.f1795e = f;
            this.f1796f = z;
            this.f1797g = z2;
            m2449i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1794d, this.f1791a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2456h(float f) {
        if (f != this.f1791a) {
            this.f1791a = f;
            m2449i((Rect) null);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f1798h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f1800j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f1798h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.cardview.widget.C0461f.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m2449i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1798h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f1792b.getColor();
        if (z) {
            this.f1792b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1800j;
        if (colorStateList2 == null || (mode = this.f1801k) == null) {
            return z;
        }
        this.f1799i = m2447a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i) {
        this.f1792b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1792b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1800j = colorStateList;
        this.f1799i = m2447a(colorStateList, this.f1801k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1801k = mode;
        this.f1799i = m2447a(this.f1800j, mode);
        invalidateSelf();
    }
}
