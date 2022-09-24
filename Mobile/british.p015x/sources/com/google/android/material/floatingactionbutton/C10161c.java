package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p017c0.C2617a;
import p243p6.C10897m;
import p243p6.C10901n;

/* renamed from: com.google.android.material.floatingactionbutton.c */
/* compiled from: BorderDrawable */
class C10161c extends Drawable {

    /* renamed from: a */
    private final C10901n f47866a = C10901n.m49062k();

    /* renamed from: b */
    private final Paint f47867b;

    /* renamed from: c */
    private final Path f47868c = new Path();

    /* renamed from: d */
    private final Rect f47869d = new Rect();

    /* renamed from: e */
    private final RectF f47870e = new RectF();

    /* renamed from: f */
    private final RectF f47871f = new RectF();

    /* renamed from: g */
    private final C10163b f47872g = new C10163b();

    /* renamed from: h */
    float f47873h;

    /* renamed from: i */
    private int f47874i;

    /* renamed from: j */
    private int f47875j;

    /* renamed from: k */
    private int f47876k;

    /* renamed from: l */
    private int f47877l;

    /* renamed from: m */
    private int f47878m;

    /* renamed from: n */
    private boolean f47879n = true;

    /* renamed from: o */
    private C10897m f47880o;

    /* renamed from: p */
    private ColorStateList f47881p;

    /* renamed from: com.google.android.material.floatingactionbutton.c$b */
    /* compiled from: BorderDrawable */
    private class C10163b extends Drawable.ConstantState {
        private C10163b() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return C10161c.this;
        }
    }

    C10161c(C10897m mVar) {
        this.f47880o = mVar;
        Paint paint = new Paint(1);
        this.f47867b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    private Shader m46794a() {
        Rect rect = this.f47869d;
        copyBounds(rect);
        float height = this.f47873h / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C2617a.m9115i(this.f47874i, this.f47878m), C2617a.m9115i(this.f47875j, this.f47878m), C2617a.m9115i(C2617a.m9119m(this.f47875j, 0), this.f47878m), C2617a.m9115i(C2617a.m9119m(this.f47877l, 0), this.f47878m), C2617a.m9115i(this.f47877l, this.f47878m), C2617a.m9115i(this.f47876k, this.f47878m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RectF mo40698b() {
        this.f47871f.set(getBounds());
        return this.f47871f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo40699c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f47878m = colorStateList.getColorForState(getState(), this.f47878m);
        }
        this.f47881p = colorStateList;
        this.f47879n = true;
        invalidateSelf();
    }

    /* renamed from: d */
    public void mo40700d(float f) {
        if (this.f47873h != f) {
            this.f47873h = f;
            this.f47867b.setStrokeWidth(f * 1.3333f);
            this.f47879n = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.f47879n) {
            this.f47867b.setShader(m46794a());
            this.f47879n = false;
        }
        float strokeWidth = this.f47867b.getStrokeWidth() / 2.0f;
        copyBounds(this.f47869d);
        this.f47870e.set(this.f47869d);
        float min = Math.min(this.f47880o.mo43136r().mo43065a(mo40698b()), this.f47870e.width() / 2.0f);
        if (this.f47880o.mo43139u(mo40698b())) {
            this.f47870e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f47870e, min, min, this.f47867b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo40702e(int i, int i2, int i3, int i4) {
        this.f47874i = i;
        this.f47875j = i2;
        this.f47876k = i3;
        this.f47877l = i4;
    }

    /* renamed from: f */
    public void mo40703f(C10897m mVar) {
        this.f47880o = mVar;
        invalidateSelf();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f47872g;
    }

    public int getOpacity() {
        return this.f47873h > 0.0f ? -3 : -2;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f47880o.mo43139u(mo40698b())) {
            outline.setRoundRect(getBounds(), this.f47880o.mo43136r().mo43065a(mo40698b()));
            return;
        }
        copyBounds(this.f47869d);
        this.f47870e.set(this.f47869d);
        this.f47866a.mo43167d(this.f47880o, 1.0f, this.f47870e, this.f47868c);
        if (this.f47868c.isConvex()) {
            outline.setConvexPath(this.f47868c);
        }
    }

    public boolean getPadding(Rect rect) {
        if (!this.f47880o.mo43139u(mo40698b())) {
            return true;
        }
        int round = Math.round(this.f47873h);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f47881p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f47879n = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f47881p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f47878m)) == this.f47878m)) {
            this.f47879n = true;
            this.f47878m = colorForState;
        }
        if (this.f47879n) {
            invalidateSelf();
        }
        return this.f47879n;
    }

    public void setAlpha(int i) {
        this.f47867b.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f47867b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
