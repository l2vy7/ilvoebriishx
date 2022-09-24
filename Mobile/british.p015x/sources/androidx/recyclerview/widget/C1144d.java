package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p111m0.C5723u;

/* renamed from: androidx.recyclerview.widget.d */
/* compiled from: FastScroller */
class C1144d extends RecyclerView.C1103o implements RecyclerView.C1111s {

    /* renamed from: D */
    private static final int[] f5314D = {16842919};

    /* renamed from: E */
    private static final int[] f5315E = new int[0];

    /* renamed from: A */
    int f5316A;

    /* renamed from: B */
    private final Runnable f5317B;

    /* renamed from: C */
    private final RecyclerView.C1112t f5318C;

    /* renamed from: a */
    private final int f5319a;

    /* renamed from: b */
    private final int f5320b;

    /* renamed from: c */
    final StateListDrawable f5321c;

    /* renamed from: d */
    final Drawable f5322d;

    /* renamed from: e */
    private final int f5323e;

    /* renamed from: f */
    private final int f5324f;

    /* renamed from: g */
    private final StateListDrawable f5325g;

    /* renamed from: h */
    private final Drawable f5326h;

    /* renamed from: i */
    private final int f5327i;

    /* renamed from: j */
    private final int f5328j;

    /* renamed from: k */
    int f5329k;

    /* renamed from: l */
    int f5330l;

    /* renamed from: m */
    float f5331m;

    /* renamed from: n */
    int f5332n;

    /* renamed from: o */
    int f5333o;

    /* renamed from: p */
    float f5334p;

    /* renamed from: q */
    private int f5335q = 0;

    /* renamed from: r */
    private int f5336r = 0;

    /* renamed from: s */
    private RecyclerView f5337s;

    /* renamed from: t */
    private boolean f5338t = false;

    /* renamed from: u */
    private boolean f5339u = false;

    /* renamed from: v */
    private int f5340v = 0;

    /* renamed from: w */
    private int f5341w = 0;

    /* renamed from: x */
    private final int[] f5342x = new int[2];

    /* renamed from: y */
    private final int[] f5343y = new int[2];

    /* renamed from: z */
    final ValueAnimator f5344z;

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* compiled from: FastScroller */
    class C1145a implements Runnable {
        C1145a() {
        }

        public void run() {
            C1144d.this.mo5736q(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* compiled from: FastScroller */
    class C1146b extends RecyclerView.C1112t {
        C1146b() {
        }

        /* renamed from: b */
        public void mo5506b(RecyclerView recyclerView, int i, int i2) {
            C1144d.this.mo5734B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* compiled from: FastScroller */
    private class C1147c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f5347a = false;

        C1147c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f5347a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f5347a) {
                this.f5347a = false;
            } else if (((Float) C1144d.this.f5344z.getAnimatedValue()).floatValue() == 0.0f) {
                C1144d dVar = C1144d.this;
                dVar.f5316A = 0;
                dVar.mo5740y(0);
            } else {
                C1144d dVar2 = C1144d.this;
                dVar2.f5316A = 2;
                dVar2.mo5739v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    /* compiled from: FastScroller */
    private class C1148d implements ValueAnimator.AnimatorUpdateListener {
        C1148d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1144d.this.f5321c.setAlpha(floatValue);
            C1144d.this.f5322d.setAlpha(floatValue);
            C1144d.this.mo5739v();
        }
    }

    C1144d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f5344z = ofFloat;
        this.f5316A = 0;
        this.f5317B = new C1145a();
        this.f5318C = new C1146b();
        this.f5321c = stateListDrawable;
        this.f5322d = drawable;
        this.f5325g = stateListDrawable2;
        this.f5326h = drawable2;
        this.f5323e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f5324f = Math.max(i, drawable.getIntrinsicWidth());
        this.f5327i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f5328j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f5319a = i2;
        this.f5320b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C1147c());
        ofFloat.addUpdateListener(new C1148d());
        mo5735j(recyclerView);
    }

    /* renamed from: C */
    private void m6329C(float f) {
        int[] p = m6335p();
        float max = Math.max((float) p[0], Math.min((float) p[1], f));
        if (Math.abs(((float) this.f5330l) - max) >= 2.0f) {
            int x = m6339x(this.f5331m, max, p, this.f5337s.computeVerticalScrollRange(), this.f5337s.computeVerticalScrollOffset(), this.f5336r);
            if (x != 0) {
                this.f5337s.scrollBy(0, x);
            }
            this.f5331m = max;
        }
    }

    /* renamed from: k */
    private void m6330k() {
        this.f5337s.removeCallbacks(this.f5317B);
    }

    /* renamed from: l */
    private void m6331l() {
        this.f5337s.mo5102Z0(this);
        this.f5337s.mo5105a1(this);
        this.f5337s.mo5108b1(this.f5318C);
        m6330k();
    }

    /* renamed from: m */
    private void m6332m(Canvas canvas) {
        int i = this.f5336r;
        int i2 = this.f5327i;
        int i3 = i - i2;
        int i4 = this.f5333o;
        int i5 = this.f5332n;
        int i6 = i4 - (i5 / 2);
        this.f5325g.setBounds(0, 0, i5, i2);
        this.f5326h.setBounds(0, 0, this.f5335q, this.f5328j);
        canvas.translate(0.0f, (float) i3);
        this.f5326h.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f5325g.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: n */
    private void m6333n(Canvas canvas) {
        int i = this.f5335q;
        int i2 = this.f5323e;
        int i3 = i - i2;
        int i4 = this.f5330l;
        int i5 = this.f5329k;
        int i6 = i4 - (i5 / 2);
        this.f5321c.setBounds(0, 0, i2, i5);
        this.f5322d.setBounds(0, 0, this.f5324f, this.f5336r);
        if (m6337s()) {
            this.f5322d.draw(canvas);
            canvas.translate((float) this.f5323e, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f5321c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate((float) (-this.f5323e), (float) (-i6));
            return;
        }
        canvas.translate((float) i3, 0.0f);
        this.f5322d.draw(canvas);
        canvas.translate(0.0f, (float) i6);
        this.f5321c.draw(canvas);
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* renamed from: o */
    private int[] m6334o() {
        int[] iArr = this.f5343y;
        int i = this.f5320b;
        iArr[0] = i;
        iArr[1] = this.f5335q - i;
        return iArr;
    }

    /* renamed from: p */
    private int[] m6335p() {
        int[] iArr = this.f5342x;
        int i = this.f5320b;
        iArr[0] = i;
        iArr[1] = this.f5336r - i;
        return iArr;
    }

    /* renamed from: r */
    private void m6336r(float f) {
        int[] o = m6334o();
        float max = Math.max((float) o[0], Math.min((float) o[1], f));
        if (Math.abs(((float) this.f5333o) - max) >= 2.0f) {
            int x = m6339x(this.f5334p, max, o, this.f5337s.computeHorizontalScrollRange(), this.f5337s.computeHorizontalScrollOffset(), this.f5335q);
            if (x != 0) {
                this.f5337s.scrollBy(x, 0);
            }
            this.f5334p = max;
        }
    }

    /* renamed from: s */
    private boolean m6337s() {
        return C5723u.m25265B(this.f5337s) == 1;
    }

    /* renamed from: w */
    private void m6338w(int i) {
        m6330k();
        this.f5337s.postDelayed(this.f5317B, (long) i);
    }

    /* renamed from: x */
    private int m6339x(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: z */
    private void m6340z() {
        this.f5337s.mo5152h(this);
        this.f5337s.mo5162k(this);
        this.f5337s.mo5164l(this.f5318C);
    }

    /* renamed from: A */
    public void mo5733A() {
        int i = this.f5316A;
        if (i != 0) {
            if (i == 3) {
                this.f5344z.cancel();
            } else {
                return;
            }
        }
        this.f5316A = 1;
        ValueAnimator valueAnimator = this.f5344z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f5344z.setDuration(500);
        this.f5344z.setStartDelay(0);
        this.f5344z.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo5734B(int i, int i2) {
        int computeVerticalScrollRange = this.f5337s.computeVerticalScrollRange();
        int i3 = this.f5336r;
        this.f5338t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f5319a;
        int computeHorizontalScrollRange = this.f5337s.computeHorizontalScrollRange();
        int i4 = this.f5335q;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f5319a;
        this.f5339u = z;
        boolean z2 = this.f5338t;
        if (z2 || z) {
            if (z2) {
                float f = (float) i3;
                this.f5330l = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f5329k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f5339u) {
                float f2 = (float) i4;
                this.f5333o = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f5332n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f5340v;
            if (i5 == 0 || i5 == 1) {
                mo5740y(1);
            }
        } else if (this.f5340v != 0) {
            mo5740y(0);
        }
    }

    /* renamed from: a */
    public void mo5502a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f5340v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean u = mo5738u(motionEvent.getX(), motionEvent.getY());
                boolean t = mo5737t(motionEvent.getX(), motionEvent.getY());
                if (u || t) {
                    if (t) {
                        this.f5341w = 1;
                        this.f5334p = (float) ((int) motionEvent.getX());
                    } else if (u) {
                        this.f5341w = 2;
                        this.f5331m = (float) ((int) motionEvent.getY());
                    }
                    mo5740y(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f5340v == 2) {
                this.f5331m = 0.0f;
                this.f5334p = 0.0f;
                mo5740y(1);
                this.f5341w = 0;
            } else if (motionEvent.getAction() == 2 && this.f5340v == 2) {
                mo5733A();
                if (this.f5341w == 1) {
                    m6336r(motionEvent.getX());
                }
                if (this.f5341w == 2) {
                    m6329C(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo5503b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f5340v;
        if (i == 1) {
            boolean u = mo5738u(motionEvent.getX(), motionEvent.getY());
            boolean t = mo5737t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!u && !t) {
                return false;
            }
            if (t) {
                this.f5341w = 1;
                this.f5334p = (float) ((int) motionEvent.getX());
            } else if (u) {
                this.f5341w = 2;
                this.f5331m = (float) ((int) motionEvent.getY());
            }
            mo5740y(2);
        } else if (i == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo5504c(boolean z) {
    }

    /* renamed from: i */
    public void mo5399i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1121z zVar) {
        if (this.f5335q != this.f5337s.getWidth() || this.f5336r != this.f5337s.getHeight()) {
            this.f5335q = this.f5337s.getWidth();
            this.f5336r = this.f5337s.getHeight();
            mo5740y(0);
        } else if (this.f5316A != 0) {
            if (this.f5338t) {
                m6333n(canvas);
            }
            if (this.f5339u) {
                m6332m(canvas);
            }
        }
    }

    /* renamed from: j */
    public void mo5735j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5337s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m6331l();
            }
            this.f5337s = recyclerView;
            if (recyclerView != null) {
                m6340z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo5736q(int i) {
        int i2 = this.f5316A;
        if (i2 == 1) {
            this.f5344z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f5316A = 3;
        ValueAnimator valueAnimator = this.f5344z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f5344z.setDuration((long) i);
        this.f5344z.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo5737t(float f, float f2) {
        if (f2 >= ((float) (this.f5336r - this.f5327i))) {
            int i = this.f5333o;
            int i2 = this.f5332n;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo5738u(float f, float f2) {
        if (!m6337s() ? f >= ((float) (this.f5335q - this.f5323e)) : f <= ((float) this.f5323e)) {
            int i = this.f5330l;
            int i2 = this.f5329k;
            return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo5739v() {
        this.f5337s.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo5740y(int i) {
        if (i == 2 && this.f5340v != 2) {
            this.f5321c.setState(f5314D);
            m6330k();
        }
        if (i == 0) {
            mo5739v();
        } else {
            mo5733A();
        }
        if (this.f5340v == 2 && i != 2) {
            this.f5321c.setState(f5315E);
            m6338w(IronSourceConstants.RV_INSTANCE_LOAD_FAILED);
        } else if (i == 1) {
            m6338w(IronSourceConstants.RV_INSTANCE_NOT_FOUND);
        }
        this.f5340v = i;
    }
}
