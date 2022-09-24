package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import p243p6.C10889h;
import p243p6.C10897m;

/* renamed from: com.google.android.material.textfield.c */
/* compiled from: CutoutDrawable */
class C10332c extends C10889h {

    /* renamed from: A */
    private final RectF f48633A;

    /* renamed from: B */
    private int f48634B;

    /* renamed from: z */
    private final Paint f48635z;

    C10332c() {
        this((C10897m) null);
    }

    /* renamed from: r0 */
    private void m47723r0(Canvas canvas) {
        if (!m47727y0(getCallback())) {
            canvas.restoreToCount(this.f48634B);
        }
    }

    /* renamed from: s0 */
    private void m47724s0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (m47727y0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
                return;
            }
            return;
        }
        m47725u0(canvas);
    }

    /* renamed from: u0 */
    private void m47725u0(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f48634B = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
            return;
        }
        this.f48634B = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null, 31);
    }

    /* renamed from: x0 */
    private void m47726x0() {
        this.f48635z.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f48635z.setColor(-1);
        this.f48635z.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: y0 */
    private boolean m47727y0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    public void draw(Canvas canvas) {
        m47724s0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f48633A, this.f48635z);
        m47723r0(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public boolean mo41719q0() {
        return !this.f48633A.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public void mo41720t0() {
        mo41721v0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void mo41721v0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f48633A;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void mo41722w0(RectF rectF) {
        mo41721v0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10332c(C10897m mVar) {
        super(mVar == null ? new C10897m() : mVar);
        this.f48635z = new Paint(1);
        m47726x0();
        this.f48633A = new RectF();
    }
}
