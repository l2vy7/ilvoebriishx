package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p111m0.C5723u;

/* renamed from: androidx.core.widget.a */
/* compiled from: AutoScrollHelper */
public abstract class C0612a implements View.OnTouchListener {

    /* renamed from: s */
    private static final int f3212s = ViewConfiguration.getTapTimeout();

    /* renamed from: b */
    final C0613a f3213b = new C0613a();

    /* renamed from: c */
    private final Interpolator f3214c = new AccelerateInterpolator();

    /* renamed from: d */
    final View f3215d;

    /* renamed from: e */
    private Runnable f3216e;

    /* renamed from: f */
    private float[] f3217f = {0.0f, 0.0f};

    /* renamed from: g */
    private float[] f3218g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: h */
    private int f3219h;

    /* renamed from: i */
    private int f3220i;

    /* renamed from: j */
    private float[] f3221j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f3222k = {0.0f, 0.0f};

    /* renamed from: l */
    private float[] f3223l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: m */
    private boolean f3224m;

    /* renamed from: n */
    boolean f3225n;

    /* renamed from: o */
    boolean f3226o;

    /* renamed from: p */
    boolean f3227p;

    /* renamed from: q */
    private boolean f3228q;

    /* renamed from: r */
    private boolean f3229r;

    /* renamed from: androidx.core.widget.a$a */
    /* compiled from: AutoScrollHelper */
    private static class C0613a {

        /* renamed from: a */
        private int f3230a;

        /* renamed from: b */
        private int f3231b;

        /* renamed from: c */
        private float f3232c;

        /* renamed from: d */
        private float f3233d;

        /* renamed from: e */
        private long f3234e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f3235f = 0;

        /* renamed from: g */
        private int f3236g = 0;

        /* renamed from: h */
        private int f3237h = 0;

        /* renamed from: i */
        private long f3238i = -1;

        /* renamed from: j */
        private float f3239j;

        /* renamed from: k */
        private int f3240k;

        C0613a() {
        }

        /* renamed from: e */
        private float m3421e(long j) {
            long j2 = this.f3234e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f3238i;
            if (j3 < 0 || j < j3) {
                return C0612a.m3400e(((float) (j - j2)) / ((float) this.f3230a), 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f3239j;
            return (1.0f - f) + (f * C0612a.m3400e(((float) (j - j3)) / ((float) this.f3240k), 0.0f, 1.0f));
        }

        /* renamed from: g */
        private float m3422g(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void mo3215a() {
            if (this.f3235f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g = m3422g(m3421e(currentAnimationTimeMillis));
                this.f3235f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f3235f)) * g;
                this.f3236g = (int) (this.f3232c * f);
                this.f3237h = (int) (f * this.f3233d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int mo3216b() {
            return this.f3236g;
        }

        /* renamed from: c */
        public int mo3217c() {
            return this.f3237h;
        }

        /* renamed from: d */
        public int mo3218d() {
            float f = this.f3232c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int mo3219f() {
            float f = this.f3233d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: h */
        public boolean mo3220h() {
            return this.f3238i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f3238i + ((long) this.f3240k);
        }

        /* renamed from: i */
        public void mo3221i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3240k = C0612a.m3401f((int) (currentAnimationTimeMillis - this.f3234e), 0, this.f3231b);
            this.f3239j = m3421e(currentAnimationTimeMillis);
            this.f3238i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void mo3222j(int i) {
            this.f3231b = i;
        }

        /* renamed from: k */
        public void mo3223k(int i) {
            this.f3230a = i;
        }

        /* renamed from: l */
        public void mo3224l(float f, float f2) {
            this.f3232c = f;
            this.f3233d = f2;
        }

        /* renamed from: m */
        public void mo3225m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3234e = currentAnimationTimeMillis;
            this.f3238i = -1;
            this.f3235f = currentAnimationTimeMillis;
            this.f3239j = 0.5f;
            this.f3236g = 0;
            this.f3237h = 0;
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    /* compiled from: AutoScrollHelper */
    private class C0614b implements Runnable {
        C0614b() {
        }

        public void run() {
            C0612a aVar = C0612a.this;
            if (aVar.f3227p) {
                if (aVar.f3225n) {
                    aVar.f3225n = false;
                    aVar.f3213b.mo3225m();
                }
                C0613a aVar2 = C0612a.this.f3213b;
                if (aVar2.mo3220h() || !C0612a.this.mo3214u()) {
                    C0612a.this.f3227p = false;
                    return;
                }
                C0612a aVar3 = C0612a.this;
                if (aVar3.f3226o) {
                    aVar3.f3226o = false;
                    aVar3.mo3201c();
                }
                aVar2.mo3215a();
                C0612a.this.mo3202j(aVar2.mo3216b(), aVar2.mo3217c());
                C5723u.m25314g0(C0612a.this.f3215d, this);
            }
        }
    }

    public C0612a(View view) {
        this.f3215d = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo3207o(f2, f2);
        float f3 = (float) ((int) ((f * 315.0f) + 0.5f));
        mo3209p(f3, f3);
        mo3204l(1);
        mo3206n(Float.MAX_VALUE, Float.MAX_VALUE);
        mo3212s(0.2f, 0.2f);
        mo3213t(1.0f, 1.0f);
        mo3203k(f3212s);
        mo3211r(500);
        mo3210q(500);
    }

    /* renamed from: d */
    private float m3399d(int i, float f, float f2, float f3) {
        float h = m3403h(this.f3217f[i], f2, this.f3218g[i], f);
        if (h == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f3221j[i];
        float f5 = this.f3222k[i];
        float f6 = this.f3223l[i];
        float f7 = f4 * f3;
        if (h > 0.0f) {
            return m3400e(h * f7, f5, f6);
        }
        return -m3400e((-h) * f7, f5, f6);
    }

    /* renamed from: e */
    static float m3400e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    static int m3401f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: g */
    private float m3402g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f3219h;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                return (!this.f3227p || i != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: h */
    private float m3403h(float f, float f2, float f3, float f4) {
        float f5;
        float e = m3400e(f * f2, 0.0f, f3);
        float g = m3402g(f2 - f4, e) - m3402g(f4, e);
        if (g < 0.0f) {
            f5 = -this.f3214c.getInterpolation(-g);
        } else if (g <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f3214c.getInterpolation(g);
        }
        return m3400e(f5, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m3404i() {
        if (this.f3225n) {
            this.f3227p = false;
        } else {
            this.f3213b.mo3221i();
        }
    }

    /* renamed from: v */
    private void m3405v() {
        int i;
        if (this.f3216e == null) {
            this.f3216e = new C0614b();
        }
        this.f3227p = true;
        this.f3225n = true;
        if (this.f3224m || (i = this.f3220i) <= 0) {
            this.f3216e.run();
        } else {
            C5723u.m25316h0(this.f3215d, this.f3216e, (long) i);
        }
        this.f3224m = true;
    }

    /* renamed from: a */
    public abstract boolean mo3199a(int i);

    /* renamed from: b */
    public abstract boolean mo3200b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3201c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f3215d.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo3202j(int i, int i2);

    /* renamed from: k */
    public C0612a mo3203k(int i) {
        this.f3220i = i;
        return this;
    }

    /* renamed from: l */
    public C0612a mo3204l(int i) {
        this.f3219h = i;
        return this;
    }

    /* renamed from: m */
    public C0612a mo3205m(boolean z) {
        if (this.f3228q && !z) {
            m3404i();
        }
        this.f3228q = z;
        return this;
    }

    /* renamed from: n */
    public C0612a mo3206n(float f, float f2) {
        float[] fArr = this.f3218g;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: o */
    public C0612a mo3207o(float f, float f2) {
        float[] fArr = this.f3223l;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3228q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m3404i()
            goto L_0x0058
        L_0x001a:
            r5.f3226o = r2
            r5.f3224m = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f3215d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m3399d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f3215d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m3399d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f3213b
            r7.mo3224l(r0, r6)
            boolean r6 = r5.f3227p
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo3214u()
            if (r6 == 0) goto L_0x0058
            r5.m3405v()
        L_0x0058:
            boolean r6 = r5.f3229r
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f3227p
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C0612a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public C0612a mo3209p(float f, float f2) {
        float[] fArr = this.f3222k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public C0612a mo3210q(int i) {
        this.f3213b.mo3222j(i);
        return this;
    }

    /* renamed from: r */
    public C0612a mo3211r(int i) {
        this.f3213b.mo3223k(i);
        return this;
    }

    /* renamed from: s */
    public C0612a mo3212s(float f, float f2) {
        float[] fArr = this.f3217f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: t */
    public C0612a mo3213t(float f, float f2) {
        float[] fArr = this.f3221j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo3214u() {
        C0613a aVar = this.f3213b;
        int f = aVar.mo3219f();
        int d = aVar.mo3218d();
        return (f != 0 && mo3200b(f)) || (d != 0 && mo3199a(d));
    }
}
