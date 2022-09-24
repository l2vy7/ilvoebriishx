package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.vectordrawable.graphics.drawable.C1344b;
import com.google.android.material.progressindicator.C10251b;

/* renamed from: com.google.android.material.progressindicator.i */
/* compiled from: IndeterminateDrawable */
public final class C10266i<S extends C10251b> extends C10260f {

    /* renamed from: q */
    private C10264g<S> f48294q;

    /* renamed from: r */
    private C10265h<ObjectAnimator> f48295r;

    C10266i(Context context, C10251b bVar, C10264g<S> gVar, C10265h<ObjectAnimator> hVar) {
        super(context, bVar);
        mo41249x(gVar);
        mo41248w(hVar);
    }

    /* renamed from: s */
    public static C10266i<CircularProgressIndicatorSpec> m47335s(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new C10266i<>(context, circularProgressIndicatorSpec, new C10252c(circularProgressIndicatorSpec), new C10253d(circularProgressIndicatorSpec));
    }

    /* renamed from: t */
    public static C10266i<LinearProgressIndicatorSpec> m47336t(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new C10266i<>(context, linearProgressIndicatorSpec, new C10267j(linearProgressIndicatorSpec), linearProgressIndicatorSpec.f48219g == 0 ? new C10268k(linearProgressIndicatorSpec) : new C10271l(context, linearProgressIndicatorSpec));
    }

    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f48294q.mo41240g(canvas, mo41231g());
            this.f48294q.mo41185c(canvas, this.f48285n);
            int i = 0;
            while (true) {
                C10265h<ObjectAnimator> hVar = this.f48295r;
                int[] iArr = hVar.f48293c;
                if (i < iArr.length) {
                    C10264g<S> gVar = this.f48294q;
                    Paint paint = this.f48285n;
                    float[] fArr = hVar.f48292b;
                    int i2 = i * 2;
                    gVar.mo41184b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                    i++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public int getIntrinsicHeight() {
        return this.f48294q.mo41186d();
    }

    public int getIntrinsicWidth() {
        return this.f48294q.mo41187e();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ boolean mo41212h() {
        return super.mo41212h();
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ boolean mo41213i() {
        return super.mo41213i();
    }

    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo41215j() {
        return super.mo41215j();
    }

    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo41217l(C1344b bVar) {
        super.mo41217l(bVar);
    }

    /* renamed from: p */
    public /* bridge */ /* synthetic */ boolean mo41219p(boolean z, boolean z2, boolean z3) {
        return super.mo41219p(z, z2, z3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo41220q(boolean z, boolean z2, boolean z3) {
        boolean q = super.mo41220q(z, z2, z3);
        if (!isRunning()) {
            this.f48295r.mo41188a();
        }
        float a = this.f48275d.mo42876a(this.f48273b.getContentResolver());
        if (z && (z3 || (Build.VERSION.SDK_INT <= 21 && a > 0.0f))) {
            this.f48295r.mo41192g();
        }
        return q;
    }

    /* renamed from: r */
    public /* bridge */ /* synthetic */ boolean mo41221r(C1344b bVar) {
        return super.mo41221r(bVar);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C10265h<ObjectAnimator> mo41246u() {
        return this.f48295r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C10264g<S> mo41247v() {
        return this.f48294q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo41248w(C10265h<ObjectAnimator> hVar) {
        this.f48295r = hVar;
        hVar.mo41242e(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo41249x(C10264g<S> gVar) {
        this.f48294q = gVar;
        gVar.mo41239f(this);
    }
}
