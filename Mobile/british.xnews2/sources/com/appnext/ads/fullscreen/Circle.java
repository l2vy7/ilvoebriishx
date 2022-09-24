package com.appnext.ads.fullscreen;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.appnext.base.C3117a;
import com.appnext.core.C3198g;

public class Circle extends View {

    /* renamed from: a */
    private Paint f11965a;

    /* renamed from: b */
    private RectF f11966b;

    /* renamed from: c */
    private float f11967c;

    public Circle(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        try {
            float a = (float) C3198g.m10773a(context, 5.0f);
            Paint paint = new Paint();
            this.f11965a = paint;
            paint.setAntiAlias(true);
            this.f11965a.setStyle(Paint.Style.STROKE);
            this.f11965a.setStrokeWidth(a);
            this.f11965a.setColor(-1);
            this.f11965a.setShadowLayer(2.0f, 2.0f, 2.0f, Color.argb(128, 0, 0, 0));
            setLayerType(1, this.f11965a);
            this.f11966b = new RectF(a, a, ((float) C3198g.m10773a(context, 20.0f)) + a, ((float) C3198g.m10773a(context, 20.0f)) + a);
            this.f11967c = 360.0f;
        } catch (Throwable th) {
            C3117a.m10553a("Circle$init", th);
        }
    }

    public float getAngle() {
        return this.f11967c;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            canvas.drawArc(this.f11966b, 180.0f, this.f11967c, false, this.f11965a);
        } catch (Throwable th) {
            C3117a.m10553a("Circle$onDraw", th);
        }
    }

    public void setAngle(float f) {
        this.f11967c = f;
    }

    public Circle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }
}
