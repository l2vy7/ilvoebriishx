package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;
import p110m0.C5723u;
import p193c6.C6522b;
import p193c6.C6524d;
import p193c6.C6531k;
import p193c6.C6532l;

class ClockHandView extends View {

    /* renamed from: b */
    private ValueAnimator f48725b;

    /* renamed from: c */
    private boolean f48726c;

    /* renamed from: d */
    private float f48727d;

    /* renamed from: e */
    private float f48728e;

    /* renamed from: f */
    private boolean f48729f;

    /* renamed from: g */
    private int f48730g;

    /* renamed from: h */
    private final List<C10363d> f48731h;

    /* renamed from: i */
    private final int f48732i;

    /* renamed from: j */
    private final float f48733j;

    /* renamed from: k */
    private final Paint f48734k;

    /* renamed from: l */
    private final RectF f48735l;

    /* renamed from: m */
    private final int f48736m;

    /* renamed from: n */
    private float f48737n;

    /* renamed from: o */
    private boolean f48738o;

    /* renamed from: p */
    private C10362c f48739p;

    /* renamed from: q */
    private double f48740q;

    /* renamed from: r */
    private int f48741r;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    class C10360a implements ValueAnimator.AnimatorUpdateListener {
        C10360a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m47852m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    class C10361b extends AnimatorListenerAdapter {
        C10361b() {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$c */
    public interface C10362c {
        /* renamed from: a */
        void mo41786a(float f, boolean z);
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$d */
    public interface C10363d {
        /* renamed from: a */
        void mo41771a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.materialClockStyle);
    }

    /* renamed from: c */
    private void m47848c(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = (float) width;
        float f2 = (float) height;
        this.f48734k.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) this.f48741r) * ((float) Math.cos(this.f48740q))) + f, (((float) this.f48741r) * ((float) Math.sin(this.f48740q))) + f2, (float) this.f48732i, this.f48734k);
        double sin = Math.sin(this.f48740q);
        double cos = Math.cos(this.f48740q);
        double d = (double) ((float) (this.f48741r - this.f48732i));
        Double.isNaN(d);
        float f3 = (float) (width + ((int) (cos * d)));
        Double.isNaN(d);
        float f4 = (float) (height + ((int) (d * sin)));
        this.f48734k.setStrokeWidth((float) this.f48736m);
        canvas.drawLine(f, f2, f3, f4, this.f48734k);
        canvas.drawCircle(f, f2, this.f48733j, this.f48734k);
    }

    /* renamed from: e */
    private int m47849e(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f2 - ((float) (getHeight() / 2))), (double) (f - ((float) (getWidth() / 2)))))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    /* renamed from: h */
    private Pair<Float, Float> m47850h(float f) {
        float f2 = mo41776f();
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f2), Float.valueOf(f));
    }

    /* renamed from: i */
    private boolean m47851i(float f, float f2, boolean z, boolean z2, boolean z3) {
        float e = (float) m47849e(f, f2);
        boolean z4 = false;
        boolean z5 = mo41776f() != e;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.f48726c) {
            z4 = true;
        }
        mo41780l(e, z4);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m47852m(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f48737n = f2;
        this.f48740q = Math.toRadians((double) (f2 - 90.0f));
        float width = ((float) (getWidth() / 2)) + (((float) this.f48741r) * ((float) Math.cos(this.f48740q)));
        float height = ((float) (getHeight() / 2)) + (((float) this.f48741r) * ((float) Math.sin(this.f48740q)));
        RectF rectF = this.f48735l;
        int i = this.f48732i;
        rectF.set(width - ((float) i), height - ((float) i), width + ((float) i), height + ((float) i));
        for (C10363d a : this.f48731h) {
            a.mo41771a(f2, z);
        }
        invalidate();
    }

    /* renamed from: b */
    public void mo41774b(C10363d dVar) {
        this.f48731h.add(dVar);
    }

    /* renamed from: d */
    public RectF mo41775d() {
        return this.f48735l;
    }

    /* renamed from: f */
    public float mo41776f() {
        return this.f48737n;
    }

    /* renamed from: g */
    public int mo41777g() {
        return this.f48732i;
    }

    /* renamed from: j */
    public void mo41778j(int i) {
        this.f48741r = i;
        invalidate();
    }

    /* renamed from: k */
    public void mo41779k(float f) {
        mo41780l(f, false);
    }

    /* renamed from: l */
    public void mo41780l(float f, boolean z) {
        ValueAnimator valueAnimator = this.f48725b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m47852m(f, false);
            return;
        }
        Pair<Float, Float> h = m47850h(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) h.first).floatValue(), ((Float) h.second).floatValue()});
        this.f48725b = ofFloat;
        ofFloat.setDuration(200);
        this.f48725b.addUpdateListener(new C10360a());
        this.f48725b.addListener(new C10361b());
        this.f48725b.start();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m47848c(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo41779k(mo41776f());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        C10362c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.f48727d);
                int i2 = (int) (y - this.f48728e);
                this.f48729f = (i * i) + (i2 * i2) > this.f48730g;
                boolean z4 = this.f48738o;
                z3 = actionMasked == 1;
                z2 = z4;
            } else {
                z3 = false;
                z2 = false;
            }
            z = false;
        } else {
            this.f48727d = x;
            this.f48728e = y;
            this.f48729f = true;
            this.f48738o = false;
            z3 = false;
            z2 = false;
            z = true;
        }
        boolean i3 = m47851i(x, y, z2, z, z3) | this.f48738o;
        this.f48738o = i3;
        if (i3 && z3 && (cVar = this.f48739p) != null) {
            cVar.mo41786a((float) m47849e(x, y), this.f48729f);
        }
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48731h = new ArrayList();
        Paint paint = new Paint();
        this.f48734k = paint;
        this.f48735l = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6532l.f26688H1, i, C6531k.Widget_MaterialComponents_TimePicker_Clock);
        this.f48741r = obtainStyledAttributes.getDimensionPixelSize(C6532l.f26710J1, 0);
        this.f48732i = obtainStyledAttributes.getDimensionPixelSize(C6532l.f26721K1, 0);
        Resources resources = getResources();
        this.f48736m = resources.getDimensionPixelSize(C6524d.material_clock_hand_stroke_width);
        this.f48733j = (float) resources.getDimensionPixelSize(C6524d.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(C6532l.f26699I1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        mo41779k(0.0f);
        this.f48730g = ViewConfiguration.get(context).getScaledTouchSlop();
        C5723u.m25350y0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
