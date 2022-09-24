package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.C0462g;

/* renamed from: androidx.cardview.widget.c */
/* compiled from: CardViewBaseImpl */
class C0457c implements C0460e {

    /* renamed from: a */
    final RectF f1789a = new RectF();

    /* renamed from: androidx.cardview.widget.c$a */
    /* compiled from: CardViewBaseImpl */
    class C0458a implements C0462g.C0463a {
        C0458a() {
        }

        /* renamed from: a */
        public void mo2433a(Canvas canvas, RectF rectF, float f, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C0457c.this.f1789a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                Paint paint2 = paint;
                canvas.drawArc(C0457c.this.f1789a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0457c.this.f1789a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0457c.this.f1789a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0457c.this.f1789a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f5 = rectF2.top;
                canvas.drawRect((rectF2.left + f3) - 1.0f, f5, (rectF2.right - f3) + 1.0f, f5 + f3, paint2);
                float f6 = rectF2.bottom;
                Canvas canvas3 = canvas;
                canvas3.drawRect((rectF2.left + f3) - 1.0f, f6 - f3, (rectF2.right - f3) + 1.0f, f6, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
        }
    }

    C0457c() {
    }

    /* renamed from: p */
    private C0462g m2407p(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C0462g(context.getResources(), colorStateList, f, f2, f3);
    }

    /* renamed from: q */
    private C0462g m2408q(C0459d dVar) {
        return (C0462g) dVar.mo2430f();
    }

    /* renamed from: a */
    public void mo2434a(C0459d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0462g p = m2407p(context, colorStateList, f, f2, f3);
        p.mo2475m(dVar.mo2428d());
        dVar.mo2427c(p);
        mo2442i(dVar);
    }

    /* renamed from: b */
    public void mo2435b(C0459d dVar, float f) {
        m2408q(dVar).mo2479p(f);
        mo2442i(dVar);
    }

    /* renamed from: c */
    public float mo2436c(C0459d dVar) {
        return m2408q(dVar).mo2474l();
    }

    /* renamed from: d */
    public float mo2437d(C0459d dVar) {
        return m2408q(dVar).mo2466g();
    }

    /* renamed from: e */
    public void mo2438e(C0459d dVar) {
    }

    /* renamed from: f */
    public void mo2439f(C0459d dVar, float f) {
        m2408q(dVar).mo2481r(f);
    }

    /* renamed from: g */
    public float mo2440g(C0459d dVar) {
        return m2408q(dVar).mo2470i();
    }

    /* renamed from: h */
    public ColorStateList mo2441h(C0459d dVar) {
        return m2408q(dVar).mo2465f();
    }

    /* renamed from: i */
    public void mo2442i(C0459d dVar) {
        Rect rect = new Rect();
        m2408q(dVar).mo2469h(rect);
        dVar.mo2426b((int) Math.ceil((double) mo2444l(dVar)), (int) Math.ceil((double) mo2443k(dVar)));
        dVar.mo2425a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: j */
    public void mo2432j() {
        C0462g.f1803r = new C0458a();
    }

    /* renamed from: k */
    public float mo2443k(C0459d dVar) {
        return m2408q(dVar).mo2472j();
    }

    /* renamed from: l */
    public float mo2444l(C0459d dVar) {
        return m2408q(dVar).mo2473k();
    }

    /* renamed from: m */
    public void mo2445m(C0459d dVar) {
        m2408q(dVar).mo2475m(dVar.mo2428d());
        mo2442i(dVar);
    }

    /* renamed from: n */
    public void mo2446n(C0459d dVar, ColorStateList colorStateList) {
        m2408q(dVar).mo2476o(colorStateList);
    }

    /* renamed from: o */
    public void mo2447o(C0459d dVar, float f) {
        m2408q(dVar).mo2480q(f);
        mo2442i(dVar);
    }
}
