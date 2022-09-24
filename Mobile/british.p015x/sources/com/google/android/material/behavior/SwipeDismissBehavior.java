package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p111m0.C5723u;
import p117n0.C5771c;
import p117n0.C5781f;
import p135q0.C5931c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    C5931c f47270a;

    /* renamed from: b */
    C10027c f47271b;

    /* renamed from: c */
    private boolean f47272c;

    /* renamed from: d */
    private float f47273d = 0.0f;

    /* renamed from: e */
    private boolean f47274e;

    /* renamed from: f */
    int f47275f = 2;

    /* renamed from: g */
    float f47276g = 0.5f;

    /* renamed from: h */
    float f47277h = 0.0f;

    /* renamed from: i */
    float f47278i = 0.5f;

    /* renamed from: j */
    private final C5931c.C5934c f47279j = new C10025a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    class C10025a extends C5931c.C5934c {

        /* renamed from: a */
        private int f47280a;

        /* renamed from: b */
        private int f47281b = -1;

        C10025a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0025 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0034 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m45847n(android.view.View r6, float r7) {
            /*
                r5 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0036
                int r6 = p111m0.C5723u.m25265B(r6)
                if (r6 != r2) goto L_0x000f
                r6 = 1
                goto L_0x0010
            L_0x000f:
                r6 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r3 = r3.f47275f
                r4 = 2
                if (r3 != r4) goto L_0x0018
                return r2
            L_0x0018:
                if (r3 != 0) goto L_0x0027
                if (r6 == 0) goto L_0x0021
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 >= 0) goto L_0x0026
                goto L_0x0025
            L_0x0021:
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 <= 0) goto L_0x0026
            L_0x0025:
                r1 = 1
            L_0x0026:
                return r1
            L_0x0027:
                if (r3 != r2) goto L_0x0035
                if (r6 == 0) goto L_0x0030
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 <= 0) goto L_0x0035
                goto L_0x0034
            L_0x0030:
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 >= 0) goto L_0x0035
            L_0x0034:
                r1 = 1
            L_0x0035:
                return r1
            L_0x0036:
                int r7 = r6.getLeft()
                int r0 = r5.f47280a
                int r7 = r7 - r0
                int r6 = r6.getWidth()
                float r6 = (float) r6
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.f47276g
                float r6 = r6 * r0
                int r6 = java.lang.Math.round(r6)
                int r7 = java.lang.Math.abs(r7)
                if (r7 < r6) goto L_0x0053
                r1 = 1
            L_0x0053:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C10025a.m45847n(android.view.View, float):boolean");
        }

        /* renamed from: a */
        public int mo3319a(View view, int i, int i2) {
            int i3;
            int i4;
            int width;
            boolean z = C5723u.m25265B(view) == 1;
            int i5 = SwipeDismissBehavior.this.f47275f;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.f47280a - view.getWidth();
                    i4 = view.getWidth() + this.f47280a;
                } else if (z) {
                    i3 = this.f47280a;
                    width = view.getWidth();
                } else {
                    i3 = this.f47280a - view.getWidth();
                    i4 = this.f47280a;
                }
                return SwipeDismissBehavior.m45836G(i3, i, i4);
            } else if (z) {
                i3 = this.f47280a - view.getWidth();
                i4 = this.f47280a;
                return SwipeDismissBehavior.m45836G(i3, i, i4);
            } else {
                i3 = this.f47280a;
                width = view.getWidth();
            }
            i4 = width + i3;
            return SwipeDismissBehavior.m45836G(i3, i, i4);
        }

        /* renamed from: b */
        public int mo3320b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo3321d(View view) {
            return view.getWidth();
        }

        /* renamed from: i */
        public void mo3325i(View view, int i) {
            this.f47281b = i;
            this.f47280a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: j */
        public void mo3326j(int i) {
            C10027c cVar = SwipeDismissBehavior.this.f47271b;
            if (cVar != null) {
                cVar.mo39732b(i);
            }
        }

        /* renamed from: k */
        public void mo3327k(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f47280a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f47277h);
            float width2 = ((float) this.f47280a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f47278i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m45835F(0.0f, 1.0f - SwipeDismissBehavior.m45838I(width, width2, f), 1.0f));
            }
        }

        /* renamed from: l */
        public void mo3328l(View view, float f, float f2) {
            boolean z;
            int i;
            C10027c cVar;
            this.f47281b = -1;
            int width = view.getWidth();
            if (m45847n(view, f)) {
                int left = view.getLeft();
                int i2 = this.f47280a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f47280a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f47270a.mo22953N(i, view.getTop())) {
                C5723u.m25314g0(view, new C10028d(view, z));
            } else if (z && (cVar = SwipeDismissBehavior.this.f47271b) != null) {
                cVar.mo39731a(view);
            }
        }

        /* renamed from: m */
        public boolean mo3329m(View view, int i) {
            int i2 = this.f47281b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo39727E(view);
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    class C10026b implements C5781f {
        C10026b() {
        }

        /* renamed from: a */
        public boolean mo6785a(View view, C5781f.C5782a aVar) {
            boolean z = false;
            if (!SwipeDismissBehavior.this.mo39727E(view)) {
                return false;
            }
            boolean z2 = C5723u.m25265B(view) == 1;
            int i = SwipeDismissBehavior.this.f47275f;
            if ((i == 0 && z2) || (i == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            C5723u.m25299Y(view, width);
            view.setAlpha(0.0f);
            C10027c cVar = SwipeDismissBehavior.this.f47271b;
            if (cVar != null) {
                cVar.mo39731a(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public interface C10027c {
        /* renamed from: a */
        void mo39731a(View view);

        /* renamed from: b */
        void mo39732b(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    private class C10028d implements Runnable {

        /* renamed from: b */
        private final View f47284b;

        /* renamed from: c */
        private final boolean f47285c;

        C10028d(View view, boolean z) {
            this.f47284b = view;
            this.f47285c = z;
        }

        public void run() {
            C10027c cVar;
            C5931c cVar2 = SwipeDismissBehavior.this.f47270a;
            if (cVar2 != null && cVar2.mo22962n(true)) {
                C5723u.m25314g0(this.f47284b, this);
            } else if (this.f47285c && (cVar = SwipeDismissBehavior.this.f47271b) != null) {
                cVar.mo39731a(this.f47284b);
            }
        }
    }

    /* renamed from: F */
    static float m45835F(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: G */
    static int m45836G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: H */
    private void m45837H(ViewGroup viewGroup) {
        C5931c cVar;
        if (this.f47270a == null) {
            if (this.f47274e) {
                cVar = C5931c.m26182o(viewGroup, this.f47273d, this.f47279j);
            } else {
                cVar = C5931c.m26183p(viewGroup, this.f47279j);
            }
            this.f47270a = cVar;
        }
    }

    /* renamed from: I */
    static float m45838I(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: M */
    private void m45839M(View view) {
        C5723u.m25318i0(view, ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        if (mo39727E(view)) {
            C5723u.m25322k0(view, C5771c.C5772a.f24492y, (CharSequence) null, new C10026b());
        }
    }

    /* renamed from: D */
    public boolean mo2993D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C5931c cVar = this.f47270a;
        if (cVar == null) {
            return false;
        }
        cVar.mo22949F(motionEvent);
        return true;
    }

    /* renamed from: E */
    public boolean mo39727E(View view) {
        return true;
    }

    /* renamed from: J */
    public void mo39728J(float f) {
        this.f47278i = m45835F(0.0f, f, 1.0f);
    }

    /* renamed from: K */
    public void mo39729K(float f) {
        this.f47277h = m45835F(0.0f, f, 1.0f);
    }

    /* renamed from: L */
    public void mo39730L(int i) {
        this.f47275f = i;
    }

    /* renamed from: k */
    public boolean mo3004k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f47272c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo2941F(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f47272c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f47272c = false;
        }
        if (!z) {
            return false;
        }
        m45837H(coordinatorLayout);
        return this.f47270a.mo22954O(motionEvent);
    }

    /* renamed from: l */
    public boolean mo3005l(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean l = super.mo3005l(coordinatorLayout, v, i);
        if (C5723u.m25351z(v) == 0) {
            C5723u.m25350y0(v, 1);
            m45839M(v);
        }
        return l;
    }
}
