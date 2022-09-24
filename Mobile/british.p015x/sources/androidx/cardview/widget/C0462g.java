package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p144s.C6004b;
import p144s.C6005c;

/* renamed from: androidx.cardview.widget.g */
/* compiled from: RoundRectDrawableWithShadow */
class C0462g extends Drawable {

    /* renamed from: q */
    private static final double f1802q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    static C0463a f1803r;

    /* renamed from: a */
    private final int f1804a;

    /* renamed from: b */
    private Paint f1805b;

    /* renamed from: c */
    private Paint f1806c;

    /* renamed from: d */
    private Paint f1807d;

    /* renamed from: e */
    private final RectF f1808e;

    /* renamed from: f */
    private float f1809f;

    /* renamed from: g */
    private Path f1810g;

    /* renamed from: h */
    private float f1811h;

    /* renamed from: i */
    private float f1812i;

    /* renamed from: j */
    private float f1813j;

    /* renamed from: k */
    private ColorStateList f1814k;

    /* renamed from: l */
    private boolean f1815l = true;

    /* renamed from: m */
    private final int f1816m;

    /* renamed from: n */
    private final int f1817n;

    /* renamed from: o */
    private boolean f1818o = true;

    /* renamed from: p */
    private boolean f1819p = false;

    /* renamed from: androidx.cardview.widget.g$a */
    /* compiled from: RoundRectDrawableWithShadow */
    interface C0463a {
        /* renamed from: a */
        void mo2433a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    C0462g(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f1816m = resources.getColor(C6004b.cardview_shadow_start_color);
        this.f1817n = resources.getColor(C6004b.cardview_shadow_end_color);
        this.f1804a = resources.getDimensionPixelSize(C6005c.cardview_compat_inset_shadow);
        this.f1805b = new Paint(5);
        m2461n(colorStateList);
        Paint paint = new Paint(5);
        this.f1806c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1809f = (float) ((int) (f + 0.5f));
        this.f1808e = new RectF();
        Paint paint2 = new Paint(this.f1806c);
        this.f1807d = paint2;
        paint2.setAntiAlias(false);
        m2462s(f2, f3);
    }

    /* renamed from: a */
    private void m2456a(Rect rect) {
        float f = this.f1811h;
        float f2 = 1.5f * f;
        this.f1808e.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        m2457b();
    }

    /* renamed from: b */
    private void m2457b() {
        float f = this.f1809f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f1812i;
        rectF2.inset(-f2, -f2);
        Path path = this.f1810g;
        if (path == null) {
            this.f1810g = new Path();
        } else {
            path.reset();
        }
        this.f1810g.setFillType(Path.FillType.EVEN_ODD);
        this.f1810g.moveTo(-this.f1809f, 0.0f);
        this.f1810g.rLineTo(-this.f1812i, 0.0f);
        this.f1810g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1810g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1810g.close();
        float f3 = this.f1809f;
        float f4 = f3 / (this.f1812i + f3);
        Paint paint = this.f1806c;
        float f5 = this.f1809f + this.f1812i;
        int i = this.f1816m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f1817n}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f1807d;
        float f6 = this.f1809f;
        float f7 = this.f1812i;
        int i2 = this.f1816m;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f1817n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f1807d.setAntiAlias(false);
    }

    /* renamed from: c */
    static float m2458c(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (float) (d + ((1.0d - f1802q) * d2));
    }

    /* renamed from: d */
    static float m2459d(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = (double) (f * 1.5f);
        double d2 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (float) (d + ((1.0d - f1802q) * d2));
    }

    /* renamed from: e */
    private void m2460e(Canvas canvas) {
        float f = this.f1809f;
        float f2 = (-f) - this.f1812i;
        float f3 = f + ((float) this.f1804a) + (this.f1813j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f1808e.width() - f4 > 0.0f;
        boolean z2 = this.f1808e.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f1808e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f1810g, this.f1806c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f1808e.width() - f4, -this.f1809f, this.f1807d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f1808e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1810g, this.f1806c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f1808e.width() - f4, (-this.f1809f) + this.f1812i, this.f1807d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f1808e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1810g, this.f1806c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f1808e.height() - f4, -this.f1809f, this.f1807d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f1808e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1810g, this.f1806c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f1808e.height() - f4, -this.f1809f, this.f1807d);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: n */
    private void m2461n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1814k = colorStateList;
        this.f1805b.setColor(colorStateList.getColorForState(getState(), this.f1814k.getDefaultColor()));
    }

    /* renamed from: s */
    private void m2462s(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= 0.0f) {
            float t = (float) m2463t(f);
            float t2 = (float) m2463t(f2);
            if (t > t2) {
                if (!this.f1819p) {
                    this.f1819p = true;
                }
                t = t2;
            }
            if (this.f1813j != t || this.f1811h != t2) {
                this.f1813j = t;
                this.f1811h = t2;
                this.f1812i = (float) ((int) ((t * 1.5f) + ((float) this.f1804a) + 0.5f));
                this.f1815l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }

    /* renamed from: t */
    private int m2463t(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    public void draw(Canvas canvas) {
        if (this.f1815l) {
            m2456a(getBounds());
            this.f1815l = false;
        }
        canvas.translate(0.0f, this.f1813j / 2.0f);
        m2460e(canvas);
        canvas.translate(0.0f, (-this.f1813j) / 2.0f);
        f1803r.mo2433a(canvas, this.f1808e, this.f1809f, this.f1805b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo2465f() {
        return this.f1814k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo2466g() {
        return this.f1809f;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m2459d(this.f1811h, this.f1809f, this.f1818o));
        int ceil2 = (int) Math.ceil((double) m2458c(this.f1811h, this.f1809f, this.f1818o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2469h(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo2470i() {
        return this.f1811h;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f1814k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo2472j() {
        float f = this.f1811h;
        return (Math.max(f, this.f1809f + ((float) this.f1804a) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f1811h * 1.5f) + ((float) this.f1804a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo2473k() {
        float f = this.f1811h;
        return (Math.max(f, this.f1809f + ((float) this.f1804a) + (f / 2.0f)) * 2.0f) + ((this.f1811h + ((float) this.f1804a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public float mo2474l() {
        return this.f1813j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo2475m(boolean z) {
        this.f1818o = z;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2476o(ColorStateList colorStateList) {
        m2461n(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1815l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1814k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1805b.getColor() == colorForState) {
            return false;
        }
        this.f1805b.setColor(colorForState);
        this.f1815l = true;
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo2479p(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f1809f != f2) {
                this.f1809f = f2;
                this.f1815l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2480q(float f) {
        m2462s(this.f1813j, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2481r(float f) {
        m2462s(f, this.f1811h);
    }

    public void setAlpha(int i) {
        this.f1805b.setAlpha(i);
        this.f1806c.setAlpha(i);
        this.f1807d.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1805b.setColorFilter(colorFilter);
    }
}
