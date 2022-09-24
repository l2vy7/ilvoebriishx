package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p079g0.C5266a;
import p110m0.C5723u;

abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: d */
    private Runnable f47200d;

    /* renamed from: e */
    OverScroller f47201e;

    /* renamed from: f */
    private boolean f47202f;

    /* renamed from: g */
    private int f47203g = -1;

    /* renamed from: h */
    private int f47204h;

    /* renamed from: i */
    private int f47205i = -1;

    /* renamed from: j */
    private VelocityTracker f47206j;

    /* renamed from: com.google.android.material.appbar.HeaderBehavior$a */
    private class C10018a implements Runnable {

        /* renamed from: b */
        private final CoordinatorLayout f47207b;

        /* renamed from: c */
        private final V f47208c;

        C10018a(CoordinatorLayout coordinatorLayout, V v) {
            this.f47207b = coordinatorLayout;
            this.f47208c = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f47208c != null && (overScroller = HeaderBehavior.this.f47201e) != null) {
                if (overScroller.computeScrollOffset()) {
                    HeaderBehavior headerBehavior = HeaderBehavior.this;
                    headerBehavior.mo39669P(this.f47207b, this.f47208c, headerBehavior.f47201e.getCurrY());
                    C5723u.m25314g0(this.f47208c, this);
                    return;
                }
                HeaderBehavior.this.mo39558N(this.f47207b, this.f47208c);
            }
        }
    }

    public HeaderBehavior() {
    }

    /* renamed from: I */
    private void m45719I() {
        if (this.f47206j == null) {
            this.f47206j = VelocityTracker.obtain();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2993D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = 1
            goto L_0x001c
        L_0x001b:
            r12 = 0
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f47203g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f47204h = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f47203g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f47204h
            int r7 = r1 - r0
            r11.f47204h = r0
            int r8 = r11.mo39555K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.mo39668O(r5, r6, r7, r8, r9)
        L_0x004c:
            r12 = 0
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f47206j
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f47206j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f47206j
            int r4 = r11.f47203g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo39556L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.mo39667J(r6, r7, r8, r9, r10)
            r12 = 1
            goto L_0x0073
        L_0x0072:
            r12 = 0
        L_0x0073:
            r11.f47202f = r3
            r11.f47203g = r1
            android.view.VelocityTracker r13 = r11.f47206j
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f47206j = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f47206j
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f47202f
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = 0
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.mo2993D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo39554H(V v) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final boolean mo39667J(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f47200d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f47200d = null;
        }
        if (this.f47201e == null) {
            this.f47201e = new OverScroller(v.getContext());
        }
        this.f47201e.fling(0, mo39580E(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f47201e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C10018a aVar = new C10018a(coordinatorLayout, v);
            this.f47200d = aVar;
            C5723u.m25314g0(v, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo39558N(coordinatorLayout, v);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public int mo39555K(V v) {
        return -v.getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo39556L(V v) {
        return v.getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public int mo39557M() {
        return mo39580E();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo39558N(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final int mo39668O(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo39559Q(coordinatorLayout, v, mo39557M() - i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public int mo39669P(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo39559Q(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public int mo39559Q(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int b;
        int E = mo39580E();
        if (i2 == 0 || E < i2 || E > i3 || E == (b = C5266a.m23794b(i, i2, i3))) {
            return 0;
        }
        mo39581G(b);
        return E - b;
    }

    /* renamed from: k */
    public boolean mo3004k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f47205i < 0) {
            this.f47205i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f47202f) {
            int i = this.f47203g;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f47204h) > this.f47205i) {
                this.f47204h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f47203g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo39554H(v) && coordinatorLayout.mo2941F(v, x, y2);
            this.f47202f = z;
            if (z) {
                this.f47204h = y2;
                this.f47203g = motionEvent.getPointerId(0);
                m45719I();
                OverScroller overScroller = this.f47201e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f47201e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f47206j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
