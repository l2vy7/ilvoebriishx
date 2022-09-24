package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p104l0.C5648h;
import p155u0.C6172b;

/* renamed from: androidx.swiperefreshlayout.widget.b */
/* compiled from: CircularProgressDrawable */
public class C1240b extends Drawable implements Animatable {

    /* renamed from: h */
    private static final Interpolator f5640h = new LinearInterpolator();

    /* renamed from: i */
    private static final Interpolator f5641i = new C6172b();

    /* renamed from: j */
    private static final int[] f5642j = {-16777216};

    /* renamed from: b */
    private final C1243c f5643b;

    /* renamed from: c */
    private float f5644c;

    /* renamed from: d */
    private Resources f5645d;

    /* renamed from: e */
    private Animator f5646e;

    /* renamed from: f */
    float f5647f;

    /* renamed from: g */
    boolean f5648g;

    /* renamed from: androidx.swiperefreshlayout.widget.b$a */
    /* compiled from: CircularProgressDrawable */
    class C1241a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C1243c f5649a;

        C1241a(C1243c cVar) {
            this.f5649a = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C1240b.this.mo6110n(floatValue, this.f5649a);
            C1240b.this.mo6098b(floatValue, this.f5649a, false);
            C1240b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b */
    /* compiled from: CircularProgressDrawable */
    class C1242b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C1243c f5651a;

        C1242b(C1243c cVar) {
            this.f5651a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            C1240b.this.mo6098b(1.0f, this.f5651a, true);
            this.f5651a.mo6120A();
            this.f5651a.mo6132l();
            C1240b bVar = C1240b.this;
            if (bVar.f5648g) {
                bVar.f5648g = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f5651a.mo6144x(false);
                return;
            }
            bVar.f5647f += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            C1240b.this.f5647f = 0.0f;
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$c */
    /* compiled from: CircularProgressDrawable */
    private static class C1243c {

        /* renamed from: a */
        final RectF f5653a = new RectF();

        /* renamed from: b */
        final Paint f5654b;

        /* renamed from: c */
        final Paint f5655c;

        /* renamed from: d */
        final Paint f5656d;

        /* renamed from: e */
        float f5657e;

        /* renamed from: f */
        float f5658f;

        /* renamed from: g */
        float f5659g;

        /* renamed from: h */
        float f5660h;

        /* renamed from: i */
        int[] f5661i;

        /* renamed from: j */
        int f5662j;

        /* renamed from: k */
        float f5663k;

        /* renamed from: l */
        float f5664l;

        /* renamed from: m */
        float f5665m;

        /* renamed from: n */
        boolean f5666n;

        /* renamed from: o */
        Path f5667o;

        /* renamed from: p */
        float f5668p;

        /* renamed from: q */
        float f5669q;

        /* renamed from: r */
        int f5670r;

        /* renamed from: s */
        int f5671s;

        /* renamed from: t */
        int f5672t;

        /* renamed from: u */
        int f5673u;

        C1243c() {
            Paint paint = new Paint();
            this.f5654b = paint;
            Paint paint2 = new Paint();
            this.f5655c = paint2;
            Paint paint3 = new Paint();
            this.f5656d = paint3;
            this.f5657e = 0.0f;
            this.f5658f = 0.0f;
            this.f5659g = 0.0f;
            this.f5660h = 5.0f;
            this.f5668p = 1.0f;
            this.f5672t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo6120A() {
            this.f5663k = this.f5657e;
            this.f5664l = this.f5658f;
            this.f5665m = this.f5659g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6121a(Canvas canvas, Rect rect) {
            RectF rectF = this.f5653a;
            float f = this.f5669q;
            float f2 = (this.f5660h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f5670r) * this.f5668p) / 2.0f, this.f5660h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.f5657e;
            float f4 = this.f5659g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f5658f + f4) * 360.0f) - f5;
            this.f5654b.setColor(this.f5673u);
            this.f5654b.setAlpha(this.f5672t);
            float f7 = this.f5660h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f5656d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f5654b);
            mo6122b(canvas, f5, f6, rectF);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6122b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f5666n) {
                Path path = this.f5667o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f5667o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f5667o.moveTo(0.0f, 0.0f);
                this.f5667o.lineTo(((float) this.f5670r) * this.f5668p, 0.0f);
                Path path3 = this.f5667o;
                float f3 = this.f5668p;
                path3.lineTo((((float) this.f5670r) * f3) / 2.0f, ((float) this.f5671s) * f3);
                this.f5667o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.f5670r) * this.f5668p) / 2.0f), rectF.centerY() + (this.f5660h / 2.0f));
                this.f5667o.close();
                this.f5655c.setColor(this.f5673u);
                this.f5655c.setAlpha(this.f5672t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f5667o, this.f5655c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo6123c() {
            return this.f5672t;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public float mo6124d() {
            return this.f5658f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo6125e() {
            return this.f5661i[mo6126f()];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo6126f() {
            return (this.f5662j + 1) % this.f5661i.length;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public float mo6127g() {
            return this.f5657e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo6128h() {
            return this.f5661i[this.f5662j];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public float mo6129i() {
            return this.f5664l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public float mo6130j() {
            return this.f5665m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public float mo6131k() {
            return this.f5663k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo6132l() {
            mo6140t(mo6126f());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo6133m() {
            this.f5663k = 0.0f;
            this.f5664l = 0.0f;
            this.f5665m = 0.0f;
            mo6145y(0.0f);
            mo6142v(0.0f);
            mo6143w(0.0f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo6134n(int i) {
            this.f5672t = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo6135o(float f, float f2) {
            this.f5670r = (int) f;
            this.f5671s = (int) f2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo6136p(float f) {
            if (f != this.f5668p) {
                this.f5668p = f;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo6137q(float f) {
            this.f5669q = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo6138r(int i) {
            this.f5673u = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo6139s(ColorFilter colorFilter) {
            this.f5654b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo6140t(int i) {
            this.f5662j = i;
            this.f5673u = this.f5661i[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo6141u(int[] iArr) {
            this.f5661i = iArr;
            mo6140t(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo6142v(float f) {
            this.f5658f = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo6143w(float f) {
            this.f5659g = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo6144x(boolean z) {
            if (this.f5666n != z) {
                this.f5666n = z;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public void mo6145y(float f) {
            this.f5657e = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo6146z(float f) {
            this.f5660h = f;
            this.f5654b.setStrokeWidth(f);
        }
    }

    public C1240b(Context context) {
        this.f5645d = ((Context) C5648h.m24964c(context)).getResources();
        C1243c cVar = new C1243c();
        this.f5643b = cVar;
        cVar.mo6141u(f5642j);
        mo6108k(2.5f);
        m6726m();
    }

    /* renamed from: a */
    private void m6722a(float f, C1243c cVar) {
        mo6110n(f, cVar);
        cVar.mo6145y(cVar.mo6131k() + (((cVar.mo6129i() - 0.01f) - cVar.mo6131k()) * f));
        cVar.mo6142v(cVar.mo6129i());
        cVar.mo6143w(cVar.mo6130j() + ((((float) (Math.floor((double) (cVar.mo6130j() / 0.8f)) + 1.0d)) - cVar.mo6130j()) * f));
    }

    /* renamed from: c */
    private int m6723c(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    /* renamed from: h */
    private void m6724h(float f) {
        this.f5644c = f;
    }

    /* renamed from: i */
    private void m6725i(float f, float f2, float f3, float f4) {
        C1243c cVar = this.f5643b;
        float f5 = this.f5645d.getDisplayMetrics().density;
        cVar.mo6146z(f2 * f5);
        cVar.mo6137q(f * f5);
        cVar.mo6140t(0);
        cVar.mo6135o(f3 * f5, f4 * f5);
    }

    /* renamed from: m */
    private void m6726m() {
        C1243c cVar = this.f5643b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C1241a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f5640h);
        ofFloat.addListener(new C1242b(cVar));
        this.f5646e = ofFloat;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6098b(float f, C1243c cVar, boolean z) {
        float f2;
        float f3;
        if (this.f5648g) {
            m6722a(f, cVar);
        } else if (f != 1.0f || z) {
            float j = cVar.mo6130j();
            if (f < 0.5f) {
                f2 = cVar.mo6131k();
                f3 = (f5641i.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float k = cVar.mo6131k() + 0.79f;
                float f4 = k;
                f2 = k - (((1.0f - f5641i.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f4;
            }
            cVar.mo6145y(f2);
            cVar.mo6142v(f3);
            cVar.mo6143w(j + (0.20999998f * f));
            m6724h((f + this.f5647f) * 216.0f);
        }
    }

    /* renamed from: d */
    public void mo6099d(boolean z) {
        this.f5643b.mo6144x(z);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f5644c, bounds.exactCenterX(), bounds.exactCenterY());
        this.f5643b.mo6121a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void mo6101e(float f) {
        this.f5643b.mo6136p(f);
        invalidateSelf();
    }

    /* renamed from: f */
    public void mo6102f(int... iArr) {
        this.f5643b.mo6141u(iArr);
        this.f5643b.mo6140t(0);
        invalidateSelf();
    }

    /* renamed from: g */
    public void mo6103g(float f) {
        this.f5643b.mo6143w(f);
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f5643b.mo6123c();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f5646e.isRunning();
    }

    /* renamed from: j */
    public void mo6107j(float f, float f2) {
        this.f5643b.mo6145y(f);
        this.f5643b.mo6142v(f2);
        invalidateSelf();
    }

    /* renamed from: k */
    public void mo6108k(float f) {
        this.f5643b.mo6146z(f);
        invalidateSelf();
    }

    /* renamed from: l */
    public void mo6109l(int i) {
        if (i == 0) {
            m6725i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m6725i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo6110n(float f, C1243c cVar) {
        if (f > 0.75f) {
            cVar.mo6138r(m6723c((f - 0.75f) / 0.25f, cVar.mo6128h(), cVar.mo6125e()));
        } else {
            cVar.mo6138r(cVar.mo6128h());
        }
    }

    public void setAlpha(int i) {
        this.f5643b.mo6134n(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f5643b.mo6139s(colorFilter);
        invalidateSelf();
    }

    public void start() {
        this.f5646e.cancel();
        this.f5643b.mo6120A();
        if (this.f5643b.mo6124d() != this.f5643b.mo6127g()) {
            this.f5648g = true;
            this.f5646e.setDuration(666);
            this.f5646e.start();
            return;
        }
        this.f5643b.mo6140t(0);
        this.f5643b.mo6133m();
        this.f5646e.setDuration(1332);
        this.f5646e.start();
    }

    public void stop() {
        this.f5646e.cancel();
        m6724h(0.0f);
        this.f5643b.mo6144x(false);
        this.f5643b.mo6140t(0);
        this.f5643b.mo6133m();
        invalidateSelf();
    }
}
