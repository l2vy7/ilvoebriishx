package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import p207f6.C10538a;

/* renamed from: com.google.android.material.progressindicator.c */
/* compiled from: CircularDrawingDelegate */
final class C10252c extends C10264g<CircularProgressIndicatorSpec> {

    /* renamed from: c */
    private int f48247c = 1;

    /* renamed from: d */
    private float f48248d;

    /* renamed from: e */
    private float f48249e;

    /* renamed from: f */
    private float f48250f;

    public C10252c(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
    }

    /* renamed from: h */
    private void m47249h(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
        Canvas canvas2 = canvas;
        float f4 = z ? -1.0f : 1.0f;
        canvas.save();
        canvas.rotate(f3);
        float f5 = f / 2.0f;
        float f6 = f4 * f2;
        Paint paint2 = paint;
        canvas.drawRect((this.f48250f - f5) + f2, Math.min(0.0f, ((float) this.f48247c) * f6), (this.f48250f + f5) - f2, Math.max(0.0f, f6 * ((float) this.f48247c)), paint2);
        canvas.translate((this.f48250f - f5) + f2, 0.0f);
        RectF rectF2 = rectF;
        canvas.drawArc(rectF2, 180.0f, (-f4) * 90.0f * ((float) this.f48247c), true, paint2);
        canvas.translate(f - (f2 * 2.0f), 0.0f);
        canvas.drawArc(rectF2, 0.0f, f4 * 90.0f * ((float) this.f48247c), true, paint2);
        canvas.restore();
    }

    /* renamed from: i */
    private int m47250i() {
        S s = this.f48289a;
        return ((CircularProgressIndicatorSpec) s).f48215g + (((CircularProgressIndicatorSpec) s).f48216h * 2);
    }

    /* renamed from: a */
    public void mo41183a(Canvas canvas, float f) {
        S s = this.f48289a;
        float f2 = (((float) ((CircularProgressIndicatorSpec) s).f48215g) / 2.0f) + ((float) ((CircularProgressIndicatorSpec) s).f48216h);
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        S s2 = this.f48289a;
        this.f48247c = ((CircularProgressIndicatorSpec) s2).f48217i == 0 ? 1 : -1;
        this.f48248d = ((float) ((CircularProgressIndicatorSpec) s2).f48241a) * f;
        this.f48249e = ((float) ((CircularProgressIndicatorSpec) s2).f48242b) * f;
        this.f48250f = ((float) (((CircularProgressIndicatorSpec) s2).f48215g - ((CircularProgressIndicatorSpec) s2).f48241a)) / 2.0f;
        if ((this.f48290b.mo41215j() && ((CircularProgressIndicatorSpec) this.f48289a).f48245e == 2) || (this.f48290b.mo41213i() && ((CircularProgressIndicatorSpec) this.f48289a).f48246f == 1)) {
            this.f48250f += ((1.0f - f) * ((float) ((CircularProgressIndicatorSpec) this.f48289a).f48241a)) / 2.0f;
        } else if ((this.f48290b.mo41215j() && ((CircularProgressIndicatorSpec) this.f48289a).f48245e == 1) || (this.f48290b.mo41213i() && ((CircularProgressIndicatorSpec) this.f48289a).f48246f == 2)) {
            this.f48250f -= ((1.0f - f) * ((float) ((CircularProgressIndicatorSpec) this.f48289a).f48241a)) / 2.0f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo41184b(Canvas canvas, Paint paint, float f, float f2, int i) {
        Paint paint2 = paint;
        if (f != f2) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.f48248d);
            int i2 = this.f48247c;
            float f3 = f * 360.0f * ((float) i2);
            float f4 = (f2 >= f ? f2 - f : (f2 + 1.0f) - f) * 360.0f * ((float) i2);
            float f5 = this.f48250f;
            canvas.drawArc(new RectF(-f5, -f5, f5, f5), f3, f4, false, paint);
            if (this.f48249e > 0.0f && Math.abs(f4) < 360.0f) {
                paint.setStyle(Paint.Style.FILL);
                float f6 = this.f48249e;
                RectF rectF = new RectF(-f6, -f6, f6, f6);
                Canvas canvas2 = canvas;
                Paint paint3 = paint;
                RectF rectF2 = rectF;
                m47249h(canvas2, paint3, this.f48248d, this.f48249e, f3, true, rectF2);
                m47249h(canvas2, paint3, this.f48248d, this.f48249e, f3 + f4, false, rectF2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo41185c(Canvas canvas, Paint paint) {
        int a = C10538a.m48267a(((CircularProgressIndicatorSpec) this.f48289a).f48244d, this.f48290b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a);
        paint.setStrokeWidth(this.f48248d);
        float f = this.f48250f;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    /* renamed from: d */
    public int mo41186d() {
        return m47250i();
    }

    /* renamed from: e */
    public int mo41187e() {
        return m47250i();
    }
}
