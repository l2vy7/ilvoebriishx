package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;

/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
class OuterHighlightDrawable extends Drawable {

    /* renamed from: a */
    private final Paint f28572a;

    /* renamed from: b */
    private float f28573b;

    /* renamed from: c */
    private float f28574c;

    /* renamed from: d */
    private float f28575d;

    /* renamed from: e */
    private float f28576e;

    /* renamed from: f */
    private float f28577f;

    /* renamed from: g */
    private float f28578g;

    public final void draw(Canvas canvas) {
        canvas.drawCircle(this.f28575d + this.f28577f, this.f28576e + this.f28578g, this.f28573b * this.f28574c, this.f28572a);
    }

    public final int getAlpha() {
        return this.f28572a.getAlpha();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.f28572a.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28572a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setScale(float f) {
        this.f28574c = f;
        invalidateSelf();
    }

    @Keep
    public void setTranslationX(float f) {
        this.f28577f = f;
        invalidateSelf();
    }

    @Keep
    public void setTranslationY(float f) {
        this.f28578g = f;
        invalidateSelf();
    }
}
