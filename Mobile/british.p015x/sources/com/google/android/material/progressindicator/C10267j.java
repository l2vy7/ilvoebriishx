package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p208f6.C10538a;

/* renamed from: com.google.android.material.progressindicator.j */
/* compiled from: LinearDrawingDelegate */
final class C10267j extends C10264g<LinearProgressIndicatorSpec> {

    /* renamed from: c */
    private float f48296c = 300.0f;

    /* renamed from: d */
    private float f48297d;

    /* renamed from: e */
    private float f48298e;

    public C10267j(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
    }

    /* renamed from: h */
    private static void m47348h(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
        Canvas canvas2 = canvas;
        float f4 = f;
        float f5 = f2;
        canvas.save();
        float f6 = f3;
        canvas.translate(f3, 0.0f);
        if (!z) {
            canvas.rotate(180.0f);
        }
        float f7 = ((-f4) / 2.0f) + f5;
        float f8 = (f4 / 2.0f) - f5;
        Canvas canvas3 = canvas;
        Paint paint2 = paint;
        canvas3.drawRect(-f5, f7, 0.0f, f8, paint2);
        canvas.save();
        canvas.translate(0.0f, f7);
        RectF rectF2 = rectF;
        canvas3.drawArc(rectF2, 180.0f, 90.0f, true, paint2);
        canvas.restore();
        canvas.translate(0.0f, f8);
        canvas3.drawArc(rectF2, 180.0f, -90.0f, true, paint2);
        canvas.restore();
    }

    /* renamed from: a */
    public void mo41183a(Canvas canvas, float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.f48296c = (float) clipBounds.width();
        float f2 = (float) ((LinearProgressIndicatorSpec) this.f48289a).f48241a;
        canvas.translate(((float) clipBounds.left) + (((float) clipBounds.width()) / 2.0f), ((float) clipBounds.top) + (((float) clipBounds.height()) / 2.0f) + Math.max(0.0f, ((float) (clipBounds.height() - ((LinearProgressIndicatorSpec) this.f48289a).f48241a)) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f48289a).f48221i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f48290b.mo41215j() && ((LinearProgressIndicatorSpec) this.f48289a).f48245e == 1) || (this.f48290b.mo41213i() && ((LinearProgressIndicatorSpec) this.f48289a).f48246f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f48290b.mo41215j() || this.f48290b.mo41213i()) {
            canvas.translate(0.0f, (((float) ((LinearProgressIndicatorSpec) this.f48289a).f48241a) * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.f48296c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        S s = this.f48289a;
        this.f48297d = ((float) ((LinearProgressIndicatorSpec) s).f48241a) * f;
        this.f48298e = ((float) ((LinearProgressIndicatorSpec) s).f48242b) * f;
    }

    /* renamed from: b */
    public void mo41184b(Canvas canvas, Paint paint, float f, float f2, int i) {
        Paint paint2 = paint;
        if (f != f2) {
            float f3 = this.f48296c;
            float f4 = this.f48298e;
            float f5 = ((-f3) / 2.0f) + f4 + ((f3 - (f4 * 2.0f)) * f);
            float f6 = ((-f3) / 2.0f) + f4 + ((f3 - (f4 * 2.0f)) * f2);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setColor(i);
            float f7 = this.f48297d;
            canvas.drawRect(f5, (-f7) / 2.0f, f6, f7 / 2.0f, paint);
            float f8 = this.f48298e;
            RectF rectF = new RectF(-f8, -f8, f8, f8);
            Canvas canvas2 = canvas;
            Paint paint3 = paint;
            float f9 = f5;
            RectF rectF2 = rectF;
            m47348h(canvas2, paint3, this.f48297d, this.f48298e, f9, true, rectF2);
            m47348h(canvas2, paint3, this.f48297d, this.f48298e, f6, false, rectF2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo41185c(Canvas canvas, Paint paint) {
        int a = C10538a.m48267a(((LinearProgressIndicatorSpec) this.f48289a).f48244d, this.f48290b.getAlpha());
        float f = ((-this.f48296c) / 2.0f) + this.f48298e;
        float f2 = -f;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(a);
        float f3 = this.f48297d;
        canvas.drawRect(f, (-f3) / 2.0f, f2, f3 / 2.0f, paint);
        float f4 = this.f48298e;
        RectF rectF = new RectF(-f4, -f4, f4, f4);
        m47348h(canvas, paint, this.f48297d, this.f48298e, f, true, rectF);
        m47348h(canvas, paint, this.f48297d, this.f48298e, f2, false, rectF);
    }

    /* renamed from: d */
    public int mo41186d() {
        return ((LinearProgressIndicatorSpec) this.f48289a).f48241a;
    }

    /* renamed from: e */
    public int mo41187e() {
        return -1;
    }
}
