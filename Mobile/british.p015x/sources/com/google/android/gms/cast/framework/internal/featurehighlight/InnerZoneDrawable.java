package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;

/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
class InnerZoneDrawable extends Drawable {

    /* renamed from: a */
    private final Paint f28563a;

    /* renamed from: b */
    private final Paint f28564b;

    /* renamed from: c */
    private final int f28565c;

    /* renamed from: d */
    private float f28566d;

    /* renamed from: e */
    private float f28567e;

    /* renamed from: f */
    private float f28568f;

    /* renamed from: g */
    private float f28569g;

    /* renamed from: h */
    private float f28570h;

    /* renamed from: i */
    private float f28571i;

    public final void draw(Canvas canvas) {
        float f = this.f28571i;
        if (f > 0.0f) {
            float f2 = this.f28566d;
            float f3 = this.f28570h;
            this.f28564b.setAlpha((int) (((float) this.f28565c) * f));
            canvas.drawCircle(this.f28568f, this.f28569g, f2 * f3, this.f28564b);
        }
        canvas.drawCircle(this.f28568f, this.f28569g, this.f28566d * this.f28567e, this.f28563a);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.f28563a.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28563a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setPulseAlpha(float f) {
        this.f28571i = f;
        invalidateSelf();
    }

    @Keep
    public void setPulseScale(float f) {
        this.f28570h = f;
        invalidateSelf();
    }

    @Keep
    public void setScale(float f) {
        this.f28567e = f;
        invalidateSelf();
    }
}
