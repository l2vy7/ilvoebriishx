package p134q0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import p110m0.C5723u;

/* renamed from: q0.c */
/* compiled from: ViewDragHelper */
public class C5931c {

    /* renamed from: w */
    private static final Interpolator f24822w = new C5932a();

    /* renamed from: a */
    private int f24823a;

    /* renamed from: b */
    private int f24824b;

    /* renamed from: c */
    private int f24825c = -1;

    /* renamed from: d */
    private float[] f24826d;

    /* renamed from: e */
    private float[] f24827e;

    /* renamed from: f */
    private float[] f24828f;

    /* renamed from: g */
    private float[] f24829g;

    /* renamed from: h */
    private int[] f24830h;

    /* renamed from: i */
    private int[] f24831i;

    /* renamed from: j */
    private int[] f24832j;

    /* renamed from: k */
    private int f24833k;

    /* renamed from: l */
    private VelocityTracker f24834l;

    /* renamed from: m */
    private float f24835m;

    /* renamed from: n */
    private float f24836n;

    /* renamed from: o */
    private int f24837o;

    /* renamed from: p */
    private int f24838p;

    /* renamed from: q */
    private OverScroller f24839q;

    /* renamed from: r */
    private final C5934c f24840r;

    /* renamed from: s */
    private View f24841s;

    /* renamed from: t */
    private boolean f24842t;

    /* renamed from: u */
    private final ViewGroup f24843u;

    /* renamed from: v */
    private final Runnable f24844v = new C5933b();

    /* renamed from: q0.c$a */
    /* compiled from: ViewDragHelper */
    static class C5932a implements Interpolator {
        C5932a() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: q0.c$b */
    /* compiled from: ViewDragHelper */
    class C5933b implements Runnable {
        C5933b() {
        }

        public void run() {
            C5931c.this.mo22950K(0);
        }
    }

    /* renamed from: q0.c$c */
    /* compiled from: ViewDragHelper */
    public static abstract class C5934c {
        /* renamed from: a */
        public abstract int mo3319a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo3320b(View view, int i, int i2);

        /* renamed from: c */
        public int mo22969c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo3321d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo22970e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void mo3322f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean mo3323g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo3324h(int i, int i2) {
        }

        /* renamed from: i */
        public void mo3325i(View view, int i) {
        }

        /* renamed from: j */
        public abstract void mo3326j(int i);

        /* renamed from: k */
        public abstract void mo3327k(View view, int i, int i2, int i3, int i4);

        /* renamed from: l */
        public abstract void mo3328l(View view, float f, float f2);

        /* renamed from: m */
        public abstract boolean mo3329m(View view, int i);
    }

    private C5931c(Context context, ViewGroup viewGroup, C5934c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f24843u = viewGroup;
            this.f24840r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f24837o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f24824b = viewConfiguration.getScaledTouchSlop();
            this.f24835m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f24836n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f24839q = new OverScroller(context, f24822w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: D */
    private boolean m26169D(int i) {
        if (mo22947C(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: G */
    private void m26170G() {
        this.f24834l.computeCurrentVelocity(1000, this.f24835m);
        m26184q(m26176h(this.f24834l.getXVelocity(this.f24825c), this.f24836n, this.f24835m), m26176h(this.f24834l.getYVelocity(this.f24825c), this.f24836n, this.f24835m));
    }

    /* renamed from: H */
    private void m26171H(float f, float f2, int i) {
        boolean d = m26174d(f, f2, i, 1);
        if (m26174d(f2, f, i, 4)) {
            d |= true;
        }
        if (m26174d(f, f2, i, 2)) {
            d |= true;
        }
        if (m26174d(f2, f, i, 8)) {
            d |= true;
        }
        if (d) {
            int[] iArr = this.f24831i;
            iArr[i] = iArr[i] | d;
            this.f24840r.mo3322f(d ? 1 : 0, i);
        }
    }

    /* renamed from: I */
    private void m26172I(float f, float f2, int i) {
        m26187t(i);
        float[] fArr = this.f24826d;
        this.f24828f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f24827e;
        this.f24829g[i] = f2;
        fArr2[i] = f2;
        this.f24830h[i] = m26189y((int) f, (int) f2);
        this.f24833k |= 1 << i;
    }

    /* renamed from: J */
    private void m26173J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m26169D(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f24828f[pointerId] = x;
                this.f24829g[pointerId] = y;
            }
        }
    }

    /* renamed from: d */
    private boolean m26174d(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f24830h[i] & i2) != i2 || (this.f24838p & i2) == 0 || (this.f24832j[i] & i2) == i2 || (this.f24831i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f24824b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f24840r.mo3323g(i2)) {
            int[] iArr = this.f24832j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f24831i[i] & i2) != 0 || abs <= ((float) this.f24824b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: g */
    private boolean m26175g(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f24840r.mo3321d(view) > 0;
        boolean z2 = this.f24840r.mo22970e(view) > 0;
        if (z && z2) {
            int i = this.f24824b;
            if ((f * f) + (f2 * f2) > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f24824b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f24824b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: h */
    private float m26176h(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs > f3) {
            return f > 0.0f ? f3 : -f3;
        }
        return f;
    }

    /* renamed from: i */
    private int m26177i(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs > i3) {
            return i > 0 ? i3 : -i3;
        }
        return i;
    }

    /* renamed from: j */
    private void m26178j() {
        float[] fArr = this.f24826d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f24827e, 0.0f);
            Arrays.fill(this.f24828f, 0.0f);
            Arrays.fill(this.f24829g, 0.0f);
            Arrays.fill(this.f24830h, 0);
            Arrays.fill(this.f24831i, 0);
            Arrays.fill(this.f24832j, 0);
            this.f24833k = 0;
        }
    }

    /* renamed from: k */
    private void m26179k(int i) {
        if (this.f24826d != null && mo22947C(i)) {
            this.f24826d[i] = 0.0f;
            this.f24827e[i] = 0.0f;
            this.f24828f[i] = 0.0f;
            this.f24829g[i] = 0.0f;
            this.f24830h[i] = 0;
            this.f24831i[i] = 0;
            this.f24832j[i] = 0;
            this.f24833k = ((1 << i) ^ -1) & this.f24833k;
        }
    }

    /* renamed from: l */
    private int m26180l(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f24843u.getWidth();
        float f = (float) (width / 2);
        float r = f + (m26185r(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(r / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, IronSourceError.ERROR_BN_LOAD_AFTER_INIT_FAILED);
    }

    /* renamed from: m */
    private int m26181m(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int i5 = m26177i(i3, (int) this.f24836n, (int) this.f24835m);
        int i6 = m26177i(i4, (int) this.f24836n, (int) this.f24835m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (i5 != 0) {
            f2 = (float) abs3;
            f = (float) i7;
        } else {
            f2 = (float) abs;
            f = (float) i8;
        }
        float f5 = f2 / f;
        if (i6 != 0) {
            f4 = (float) abs4;
            f3 = (float) i7;
        } else {
            f4 = (float) abs2;
            f3 = (float) i8;
        }
        float f6 = f4 / f3;
        return (int) ((((float) m26180l(i, i5, this.f24840r.mo3321d(view))) * f5) + (((float) m26180l(i2, i6, this.f24840r.mo22970e(view))) * f6));
    }

    /* renamed from: o */
    public static C5931c m26182o(ViewGroup viewGroup, float f, C5934c cVar) {
        C5931c p = m26183p(viewGroup, cVar);
        p.f24824b = (int) (((float) p.f24824b) * (1.0f / f));
        return p;
    }

    /* renamed from: p */
    public static C5931c m26183p(ViewGroup viewGroup, C5934c cVar) {
        return new C5931c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: q */
    private void m26184q(float f, float f2) {
        this.f24842t = true;
        this.f24840r.mo3328l(this.f24841s, f, f2);
        this.f24842t = false;
        if (this.f24823a == 1) {
            mo22950K(0);
        }
    }

    /* renamed from: r */
    private float m26185r(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: s */
    private void m26186s(int i, int i2, int i3, int i4) {
        int left = this.f24841s.getLeft();
        int top = this.f24841s.getTop();
        if (i3 != 0) {
            i = this.f24840r.mo3319a(this.f24841s, i, i3);
            C5723u.m25299Y(this.f24841s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f24840r.mo3320b(this.f24841s, i2, i4);
            C5723u.m25300Z(this.f24841s, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f24840r.mo3327k(this.f24841s, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: t */
    private void m26187t(int i) {
        float[] fArr = this.f24826d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f24827e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f24828f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f24829g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f24830h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f24831i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f24832j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f24826d = fArr2;
            this.f24827e = fArr3;
            this.f24828f = fArr4;
            this.f24829g = fArr5;
            this.f24830h = iArr;
            this.f24831i = iArr2;
            this.f24832j = iArr3;
        }
    }

    /* renamed from: v */
    private boolean m26188v(int i, int i2, int i3, int i4) {
        int left = this.f24841s.getLeft();
        int top = this.f24841s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f24839q.abortAnimation();
            mo22950K(0);
            return false;
        }
        this.f24839q.startScroll(left, top, i5, i6, m26181m(this.f24841s, i5, i6, i3, i4));
        mo22950K(2);
        return true;
    }

    /* renamed from: y */
    private int m26189y(int i, int i2) {
        int i3 = i < this.f24843u.getLeft() + this.f24837o ? 1 : 0;
        if (i2 < this.f24843u.getTop() + this.f24837o) {
            i3 |= 4;
        }
        if (i > this.f24843u.getRight() - this.f24837o) {
            i3 |= 2;
        }
        return i2 > this.f24843u.getBottom() - this.f24837o ? i3 | 8 : i3;
    }

    /* renamed from: A */
    public int mo22945A() {
        return this.f24823a;
    }

    /* renamed from: B */
    public boolean mo22946B(int i, int i2) {
        return mo22948E(this.f24841s, i, i2);
    }

    /* renamed from: C */
    public boolean mo22947C(int i) {
        return ((1 << i) & this.f24833k) != 0;
    }

    /* renamed from: E */
    public boolean mo22948E(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public void mo22949F(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo22958b();
        }
        if (this.f24834l == null) {
            this.f24834l = VelocityTracker.obtain();
        }
        this.f24834l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View u = mo22963u((int) x, (int) y);
            m26172I(x, y, pointerId);
            mo22956Q(u, pointerId);
            int i3 = this.f24830h[pointerId];
            int i4 = this.f24838p;
            if ((i3 & i4) != 0) {
                this.f24840r.mo3324h(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f24823a == 1) {
                m26170G();
            }
            mo22958b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f24823a == 1) {
                    m26184q(0.0f, 0.0f);
                }
                mo22958b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m26172I(x2, y2, pointerId2);
                if (this.f24823a == 0) {
                    mo22956Q(mo22963u((int) x2, (int) y2), pointerId2);
                    int i5 = this.f24830h[pointerId2];
                    int i6 = this.f24838p;
                    if ((i5 & i6) != 0) {
                        this.f24840r.mo3324h(i5 & i6, pointerId2);
                    }
                } else if (mo22946B((int) x2, (int) y2)) {
                    mo22956Q(this.f24841s, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f24823a == 1 && pointerId3 == this.f24825c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f24825c) {
                            View u2 = mo22963u((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f24841s;
                            if (u2 == view && mo22956Q(view, pointerId4)) {
                                i = this.f24825c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m26170G();
                    }
                }
                m26179k(pointerId3);
            }
        } else if (this.f24823a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (m26169D(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f24826d[pointerId5];
                    float f2 = y3 - this.f24827e[pointerId5];
                    m26171H(f, f2, pointerId5);
                    if (this.f24823a != 1) {
                        View u3 = mo22963u((int) x3, (int) y3);
                        if (m26175g(u3, f, f2) && mo22956Q(u3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m26173J(motionEvent);
        } else if (m26169D(this.f24825c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f24825c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f24828f;
            int i7 = this.f24825c;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.f24829g[i7]);
            m26186s(this.f24841s.getLeft() + i8, this.f24841s.getTop() + i9, i8, i9);
            m26173J(motionEvent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo22950K(int i) {
        this.f24843u.removeCallbacks(this.f24844v);
        if (this.f24823a != i) {
            this.f24823a = i;
            this.f24840r.mo3326j(i);
            if (this.f24823a == 0) {
                this.f24841s = null;
            }
        }
    }

    /* renamed from: L */
    public void mo22951L(int i) {
        this.f24838p = i;
    }

    /* renamed from: M */
    public void mo22952M(float f) {
        this.f24836n = f;
    }

    /* renamed from: N */
    public boolean mo22953N(int i, int i2) {
        if (this.f24842t) {
            return m26188v(i, i2, (int) this.f24834l.getXVelocity(this.f24825c), (int) this.f24834l.getYVelocity(this.f24825c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo22954O(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo22958b()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f24834l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f24834l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f24834l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.m26179k(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m26172I(r7, r1, r2)
            int r3 = r0.f24823a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f24830h
            r1 = r1[r2]
            int r3 = r0.f24838p
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            q0.c$c r4 = r0.f24840r
            r1 = r1 & r3
            r4.mo3324h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo22963u(r3, r1)
            android.view.View r3 = r0.f24841s
            if (r1 != r3) goto L_0x0031
            r0.mo22956Q(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f24826d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f24827e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m26169D(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f24826d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f24827e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo22963u(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.m26175g(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            q0.c$c r14 = r0.f24840r
            int r12 = r14.mo3319a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            q0.c$c r5 = r0.f24840r
            int r5 = r5.mo3320b(r7, r15, r14)
            q0.c$c r14 = r0.f24840r
            int r14 = r14.mo3321d(r7)
            q0.c$c r15 = r0.f24840r
            int r15 = r15.mo22970e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.m26171H(r9, r10, r4)
            int r5 = r0.f24823a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo22956Q(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.m26173J(r17)
            goto L_0x0031
        L_0x00ff:
            r16.mo22958b()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m26172I(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo22963u(r2, r3)
            android.view.View r3 = r0.f24841s
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f24823a
            if (r3 != r4) goto L_0x0125
            r0.mo22956Q(r2, r1)
        L_0x0125:
            int[] r2 = r0.f24830h
            r2 = r2[r1]
            int r3 = r0.f24838p
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            q0.c$c r4 = r0.f24840r
            r2 = r2 & r3
            r4.mo3324h(r2, r1)
        L_0x0135:
            int r1 = r0.f24823a
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p134q0.C5931c.mo22954O(android.view.MotionEvent):boolean");
    }

    /* renamed from: P */
    public boolean mo22955P(View view, int i, int i2) {
        this.f24841s = view;
        this.f24825c = -1;
        boolean v = m26188v(i, i2, 0, 0);
        if (!v && this.f24823a == 0 && this.f24841s != null) {
            this.f24841s = null;
        }
        return v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public boolean mo22956Q(View view, int i) {
        if (view == this.f24841s && this.f24825c == i) {
            return true;
        }
        if (view == null || !this.f24840r.mo3329m(view, i)) {
            return false;
        }
        this.f24825c = i;
        mo22959c(view, i);
        return true;
    }

    /* renamed from: a */
    public void mo22957a() {
        mo22958b();
        if (this.f24823a == 2) {
            int currX = this.f24839q.getCurrX();
            int currY = this.f24839q.getCurrY();
            this.f24839q.abortAnimation();
            int currX2 = this.f24839q.getCurrX();
            int currY2 = this.f24839q.getCurrY();
            this.f24840r.mo3327k(this.f24841s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        mo22950K(0);
    }

    /* renamed from: b */
    public void mo22958b() {
        this.f24825c = -1;
        m26178j();
        VelocityTracker velocityTracker = this.f24834l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f24834l = null;
        }
    }

    /* renamed from: c */
    public void mo22959c(View view, int i) {
        if (view.getParent() == this.f24843u) {
            this.f24841s = view;
            this.f24825c = i;
            this.f24840r.mo3325i(view, i);
            mo22950K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f24843u + ")");
    }

    /* renamed from: e */
    public boolean mo22960e(int i) {
        int length = this.f24826d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo22961f(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo22961f(int i, int i2) {
        if (!mo22947C(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f24828f[i2] - this.f24826d[i2];
        float f2 = this.f24829g[i2] - this.f24827e[i2];
        if (z && z2) {
            int i3 = this.f24824b;
            if ((f * f) + (f2 * f2) > ((float) (i3 * i3))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f24824b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f24824b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: n */
    public boolean mo22962n(boolean z) {
        if (this.f24823a == 2) {
            boolean computeScrollOffset = this.f24839q.computeScrollOffset();
            int currX = this.f24839q.getCurrX();
            int currY = this.f24839q.getCurrY();
            int left = currX - this.f24841s.getLeft();
            int top = currY - this.f24841s.getTop();
            if (left != 0) {
                C5723u.m25299Y(this.f24841s, left);
            }
            if (top != 0) {
                C5723u.m25300Z(this.f24841s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f24840r.mo3327k(this.f24841s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f24839q.getFinalX() && currY == this.f24839q.getFinalY()) {
                this.f24839q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f24843u.post(this.f24844v);
                } else {
                    mo22950K(0);
                }
            }
        }
        if (this.f24823a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public View mo22963u(int i, int i2) {
        for (int childCount = this.f24843u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f24843u.getChildAt(this.f24840r.mo22969c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: w */
    public View mo22964w() {
        return this.f24841s;
    }

    /* renamed from: x */
    public int mo22965x() {
        return this.f24837o;
    }

    /* renamed from: z */
    public int mo22966z() {
        return this.f24824b;
    }
}
