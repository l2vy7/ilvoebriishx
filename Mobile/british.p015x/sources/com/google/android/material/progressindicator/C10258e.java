package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import androidx.vectordrawable.graphics.drawable.C1344b;
import com.google.android.material.progressindicator.C10251b;
import p140r0.C5972c;
import p140r0.C5973d;
import p140r0.C5974e;
import p208f6.C10538a;

/* renamed from: com.google.android.material.progressindicator.e */
/* compiled from: DeterminateDrawable */
public final class C10258e<S extends C10251b> extends C10260f {

    /* renamed from: v */
    private static final C5972c<C10258e> f48266v = new C10259a("indicatorLevel");

    /* renamed from: q */
    private C10264g<S> f48267q;

    /* renamed from: r */
    private final C5974e f48268r;

    /* renamed from: s */
    private final C5973d f48269s;

    /* renamed from: t */
    private float f48270t;

    /* renamed from: u */
    private boolean f48271u = false;

    /* renamed from: com.google.android.material.progressindicator.e$a */
    /* compiled from: DeterminateDrawable */
    static class C10259a extends C5972c<C10258e> {
        C10259a(String str) {
            super(str);
        }

        /* renamed from: c */
        public float mo22993a(C10258e eVar) {
            return eVar.m47284x() * 10000.0f;
        }

        /* renamed from: d */
        public void mo22994b(C10258e eVar, float f) {
            eVar.m47285z(f / 10000.0f);
        }
    }

    C10258e(Context context, C10251b bVar, C10264g<S> gVar) {
        super(context, bVar);
        mo41228y(gVar);
        C5974e eVar = new C5974e();
        this.f48268r = eVar;
        eVar.mo23030d(1.0f);
        eVar.mo23032f(50.0f);
        C5973d dVar = new C5973d(this, f48266v);
        this.f48269s = dVar;
        dVar.mo23027p(eVar);
        mo41232m(1.0f);
    }

    /* renamed from: u */
    public static C10258e<CircularProgressIndicatorSpec> m47282u(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new C10258e<>(context, circularProgressIndicatorSpec, new C10252c(circularProgressIndicatorSpec));
    }

    /* renamed from: v */
    public static C10258e<LinearProgressIndicatorSpec> m47283v(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new C10258e<>(context, linearProgressIndicatorSpec, new C10267j(linearProgressIndicatorSpec));
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public float m47284x() {
        return this.f48270t;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m47285z(float f) {
        this.f48270t = f;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo41206A(float f) {
        setLevel((int) (f * 10000.0f));
    }

    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f48267q.mo41240g(canvas, mo41231g());
            this.f48267q.mo41185c(canvas, this.f48285n);
            Canvas canvas2 = canvas;
            this.f48267q.mo41184b(canvas2, this.f48285n, 0.0f, m47284x(), C10538a.m48267a(this.f48274c.f48243c[0], getAlpha()));
            canvas.restore();
        }
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public int getIntrinsicHeight() {
        return this.f48267q.mo41186d();
    }

    public int getIntrinsicWidth() {
        return this.f48267q.mo41187e();
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

    public void jumpToCurrentState() {
        this.f48269s.mo22986b();
        m47285z(((float) getLevel()) / 10000.0f);
    }

    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo41217l(C1344b bVar) {
        super.mo41217l(bVar);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f48271u) {
            this.f48269s.mo22986b();
            m47285z(((float) i) / 10000.0f);
            return true;
        }
        this.f48269s.mo22990i(m47284x() * 10000.0f);
        this.f48269s.mo23025m((float) i);
        return true;
    }

    /* renamed from: p */
    public /* bridge */ /* synthetic */ boolean mo41219p(boolean z, boolean z2, boolean z3) {
        return super.mo41219p(z, z2, z3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo41220q(boolean z, boolean z2, boolean z3) {
        boolean q = super.mo41220q(z, z2, z3);
        float a = this.f48275d.mo42876a(this.f48273b.getContentResolver());
        if (a == 0.0f) {
            this.f48271u = true;
        } else {
            this.f48271u = false;
            this.f48268r.mo23032f(50.0f / a);
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
    /* renamed from: w */
    public C10264g<S> mo41227w() {
        return this.f48267q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo41228y(C10264g<S> gVar) {
        this.f48267q = gVar;
        gVar.mo41239f(this);
    }
}
