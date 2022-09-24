package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.material.internal.C10227s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p080g0.C5266a;
import p111m0.C5690c0;
import p111m0.C5723u;
import p117n0.C5771c;
import p117n0.C5781f;
import p135q0.C5931c;
import p194c6.C6522b;
import p194c6.C6524d;
import p194c6.C6530j;
import p194c6.C6531k;
import p194c6.C6532l;
import p233m6.C10805c;
import p243p6.C10889h;
import p243p6.C10897m;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: Y */
    private static final int f47347Y = C6531k.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    float f47348A = 0.5f;

    /* renamed from: B */
    int f47349B;

    /* renamed from: C */
    float f47350C = -1.0f;

    /* renamed from: D */
    boolean f47351D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f47352E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f47353F = true;

    /* renamed from: G */
    int f47354G = 4;

    /* renamed from: H */
    C5931c f47355H;

    /* renamed from: I */
    private boolean f47356I;

    /* renamed from: J */
    private int f47357J;

    /* renamed from: K */
    private boolean f47358K;

    /* renamed from: L */
    private int f47359L;

    /* renamed from: M */
    int f47360M;

    /* renamed from: N */
    int f47361N;

    /* renamed from: O */
    WeakReference<V> f47362O;

    /* renamed from: P */
    WeakReference<View> f47363P;

    /* renamed from: Q */
    private final ArrayList<C10052g> f47364Q = new ArrayList<>();

    /* renamed from: R */
    private VelocityTracker f47365R;

    /* renamed from: S */
    int f47366S;

    /* renamed from: T */
    private int f47367T;

    /* renamed from: U */
    boolean f47368U;

    /* renamed from: V */
    private Map<View, Integer> f47369V;

    /* renamed from: W */
    private int f47370W = -1;

    /* renamed from: X */
    private final C5931c.C5934c f47371X = new C10050e();

    /* renamed from: a */
    private int f47372a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f47373b = true;

    /* renamed from: c */
    private boolean f47374c = false;

    /* renamed from: d */
    private float f47375d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f47376e;

    /* renamed from: f */
    private boolean f47377f;

    /* renamed from: g */
    private int f47378g;

    /* renamed from: h */
    private int f47379h;

    /* renamed from: i */
    private boolean f47380i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C10889h f47381j;

    /* renamed from: k */
    private int f47382k = -1;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f47383l;

    /* renamed from: m */
    private boolean f47384m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f47385n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f47386o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f47387p;

    /* renamed from: q */
    private boolean f47388q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f47389r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f47390s;

    /* renamed from: t */
    private C10897m f47391t;

    /* renamed from: u */
    private boolean f47392u;

    /* renamed from: v */
    private BottomSheetBehavior<V>.h f47393v = null;

    /* renamed from: w */
    private ValueAnimator f47394w;

    /* renamed from: x */
    int f47395x;

    /* renamed from: y */
    int f47396y;

    /* renamed from: z */
    int f47397z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    class C10046a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f47403b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup.LayoutParams f47404c;

        C10046a(View view, ViewGroup.LayoutParams layoutParams) {
            this.f47403b = view;
            this.f47404c = layoutParams;
        }

        public void run() {
            this.f47403b.setLayoutParams(this.f47404c);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    class C10047b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f47406b;

        /* renamed from: c */
        final /* synthetic */ int f47407c;

        C10047b(View view, int i) {
            this.f47406b = view;
            this.f47407c = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo39819v0(this.f47406b, this.f47407c);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    class C10048c implements ValueAnimator.AnimatorUpdateListener {
        C10048c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f47381j != null) {
                BottomSheetBehavior.this.f47381j.mo43092b0(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    class C10049d implements C10227s.C10232e {

        /* renamed from: a */
        final /* synthetic */ boolean f47410a;

        C10049d(boolean z) {
            this.f47410a = z;
        }

        /* renamed from: a */
        public C5690c0 mo19455a(View view, C5690c0 c0Var, C10227s.C10233f fVar) {
            int unused = BottomSheetBehavior.this.f47390s = c0Var.mo22413l();
            boolean h = C10227s.m47140h(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f47385n) {
                int unused2 = BottomSheetBehavior.this.f47389r = c0Var.mo22410i();
                paddingBottom = fVar.f48149d + BottomSheetBehavior.this.f47389r;
            }
            if (BottomSheetBehavior.this.f47386o) {
                paddingLeft = (h ? fVar.f48148c : fVar.f48146a) + c0Var.mo22411j();
            }
            if (BottomSheetBehavior.this.f47387p) {
                paddingRight = (h ? fVar.f48146a : fVar.f48148c) + c0Var.mo22412k();
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f47410a) {
                int unused3 = BottomSheetBehavior.this.f47383l = c0Var.mo22407g().f10362d;
            }
            if (BottomSheetBehavior.this.f47385n || this.f47410a) {
                BottomSheetBehavior.this.m45949C0(false);
            }
            return c0Var;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    class C10050e extends C5931c.C5934c {
        C10050e() {
        }

        /* renamed from: n */
        private boolean m46014n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f47361N + bottomSheetBehavior.mo39804b0()) / 2;
        }

        /* renamed from: a */
        public int mo3319a(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: b */
        public int mo3320b(View view, int i, int i2) {
            int b0 = BottomSheetBehavior.this.mo39804b0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C5266a.m23794b(i, b0, bottomSheetBehavior.f47351D ? bottomSheetBehavior.f47361N : bottomSheetBehavior.f47349B);
        }

        /* renamed from: e */
        public int mo22970e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f47351D) {
                return bottomSheetBehavior.f47361N;
            }
            return bottomSheetBehavior.f47349B;
        }

        /* renamed from: j */
        public void mo3326j(int i) {
            if (i == 1 && BottomSheetBehavior.this.f47353F) {
                BottomSheetBehavior.this.mo39818t0(1);
            }
        }

        /* renamed from: k */
        public void mo3327k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo39802Z(i2);
        }

        /* renamed from: l */
        public void mo3328l(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 4;
            if (f2 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (!bottomSheetBehavior.f47351D || !bottomSheetBehavior.mo39820x0(view, f2)) {
                    if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top = view.getTop();
                        if (!BottomSheetBehavior.this.f47373b) {
                            BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                            int i4 = bottomSheetBehavior2.f47397z;
                            if (top < i4) {
                                if (top < Math.abs(top - bottomSheetBehavior2.f47349B)) {
                                    i = BottomSheetBehavior.this.mo39804b0();
                                } else {
                                    i2 = BottomSheetBehavior.this.f47397z;
                                }
                            } else if (Math.abs(top - i4) < Math.abs(top - BottomSheetBehavior.this.f47349B)) {
                                i2 = BottomSheetBehavior.this.f47397z;
                            } else {
                                i = BottomSheetBehavior.this.f47349B;
                                BottomSheetBehavior.this.mo39821y0(view, i3, i, true);
                            }
                            i3 = 6;
                            BottomSheetBehavior.this.mo39821y0(view, i3, i, true);
                        } else if (Math.abs(top - BottomSheetBehavior.this.f47396y) < Math.abs(top - BottomSheetBehavior.this.f47349B)) {
                            i = BottomSheetBehavior.this.f47396y;
                        } else {
                            i = BottomSheetBehavior.this.f47349B;
                            BottomSheetBehavior.this.mo39821y0(view, i3, i, true);
                        }
                    } else {
                        if (BottomSheetBehavior.this.f47373b) {
                            i = BottomSheetBehavior.this.f47349B;
                        } else {
                            int top2 = view.getTop();
                            if (Math.abs(top2 - BottomSheetBehavior.this.f47397z) < Math.abs(top2 - BottomSheetBehavior.this.f47349B)) {
                                i2 = BottomSheetBehavior.this.f47397z;
                                i3 = 6;
                            } else {
                                i = BottomSheetBehavior.this.f47349B;
                            }
                        }
                        BottomSheetBehavior.this.mo39821y0(view, i3, i, true);
                    }
                } else if ((Math.abs(f) < Math.abs(f2) && f2 > 500.0f) || m46014n(view)) {
                    i = BottomSheetBehavior.this.f47361N;
                    i3 = 5;
                    BottomSheetBehavior.this.mo39821y0(view, i3, i, true);
                } else if (BottomSheetBehavior.this.f47373b) {
                    i = BottomSheetBehavior.this.f47396y;
                } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.mo39804b0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f47397z)) {
                    i = BottomSheetBehavior.this.mo39804b0();
                } else {
                    i2 = BottomSheetBehavior.this.f47397z;
                    i3 = 6;
                    BottomSheetBehavior.this.mo39821y0(view, i3, i, true);
                }
            } else if (BottomSheetBehavior.this.f47373b) {
                i = BottomSheetBehavior.this.f47396y;
            } else {
                int top3 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                int i5 = bottomSheetBehavior3.f47397z;
                if (top3 > i5) {
                    i2 = i5;
                    i3 = 6;
                    BottomSheetBehavior.this.mo39821y0(view, i3, i, true);
                }
                i = bottomSheetBehavior3.mo39804b0();
            }
            i3 = 3;
            BottomSheetBehavior.this.mo39821y0(view, i3, i, true);
        }

        /* renamed from: m */
        public boolean mo3329m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f47354G;
            if (i2 == 1 || bottomSheetBehavior.f47368U) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f47366S == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f47363P;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f47362O;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    class C10051f implements C5781f {

        /* renamed from: a */
        final /* synthetic */ int f47413a;

        C10051f(int i) {
            this.f47413a = i;
        }

        /* renamed from: a */
        public boolean mo6785a(View view, C5781f.C5782a aVar) {
            BottomSheetBehavior.this.mo39817s0(this.f47413a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    public static abstract class C10052g {
        /* renamed from: a */
        public abstract void mo39831a(View view, float f);

        /* renamed from: b */
        public abstract void mo39832b(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h */
    private class C10053h implements Runnable {

        /* renamed from: b */
        private final View f47415b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f47416c;

        /* renamed from: d */
        int f47417d;

        C10053h(View view, int i) {
            this.f47415b = view;
            this.f47417d = i;
        }

        public void run() {
            C5931c cVar = BottomSheetBehavior.this.f47355H;
            if (cVar == null || !cVar.mo22962n(true)) {
                BottomSheetBehavior.this.mo39818t0(this.f47417d);
            } else {
                C5723u.m25314g0(this.f47415b, this);
            }
            this.f47416c = false;
        }
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: A0 */
    private void m45947A0(int i) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z = i == 3;
            if (this.f47392u != z) {
                this.f47392u = z;
                if (this.f47381j != null && (valueAnimator = this.f47394w) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f47394w.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.f47394w.setFloatValues(new float[]{1.0f - f, f});
                    this.f47394w.start();
                }
            }
        }
    }

    /* renamed from: B0 */
    private void m45948B0(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f47362O;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z) {
                    if (this.f47369V == null) {
                        this.f47369V = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f47362O.get()) {
                        if (z) {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.f47369V.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            if (this.f47374c) {
                                C5723u.m25350y0(childAt, 4);
                            }
                        } else if (this.f47374c && (map = this.f47369V) != null && map.containsKey(childAt)) {
                            C5723u.m25350y0(childAt, this.f47369V.get(childAt).intValue());
                        }
                    }
                }
                if (!z) {
                    this.f47369V = null;
                } else if (this.f47374c) {
                    ((View) this.f47362O.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public void m45949C0(boolean z) {
        View view;
        if (this.f47362O != null) {
            m45964S();
            if (this.f47354G == 4 && (view = (View) this.f47362O.get()) != null) {
                if (z) {
                    m45976w0(this.f47354G);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    /* renamed from: R */
    private int m45963R(V v, int i, int i2) {
        return C5723u.m25303b(v, v.getResources().getString(i), m45967V(i2));
    }

    /* renamed from: S */
    private void m45964S() {
        int U = m45966U();
        if (this.f47373b) {
            this.f47349B = Math.max(this.f47361N - U, this.f47396y);
        } else {
            this.f47349B = this.f47361N - U;
        }
    }

    /* renamed from: T */
    private void m45965T() {
        this.f47397z = (int) (((float) this.f47361N) * (1.0f - this.f47348A));
    }

    /* renamed from: U */
    private int m45966U() {
        int i;
        if (this.f47377f) {
            return Math.min(Math.max(this.f47378g, this.f47361N - ((this.f47360M * 9) / 16)), this.f47359L) + this.f47389r;
        }
        if (this.f47384m || this.f47385n || (i = this.f47383l) <= 0) {
            return this.f47376e + this.f47389r;
        }
        return Math.max(this.f47376e, i + this.f47379h);
    }

    /* renamed from: V */
    private C5781f m45967V(int i) {
        return new C10051f(i);
    }

    /* renamed from: W */
    private void m45968W(Context context, AttributeSet attributeSet, boolean z) {
        m45969X(context, attributeSet, z, (ColorStateList) null);
    }

    /* renamed from: X */
    private void m45969X(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f47380i) {
            this.f47391t = C10897m.m48996e(context, attributeSet, C6522b.bottomSheetStyle, f47347Y).mo43154m();
            C10889h hVar = new C10889h(this.f47391t);
            this.f47381j = hVar;
            hVar.mo43084P(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f47381j.setTint(typedValue.data);
                return;
            }
            this.f47381j.mo43091a0(colorStateList);
        }
    }

    /* renamed from: Y */
    private void m45970Y() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f47394w = ofFloat;
        ofFloat.setDuration(500);
        this.f47394w.addUpdateListener(new C10048c());
    }

    /* renamed from: c0 */
    private float m45971c0() {
        VelocityTracker velocityTracker = this.f47365R;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f47375d);
        return this.f47365R.getYVelocity(this.f47366S);
    }

    /* renamed from: e0 */
    private void m45972e0(V v, C5771c.C5772a aVar, int i) {
        C5723u.m25322k0(v, aVar, (CharSequence) null, m45967V(i));
    }

    /* renamed from: f0 */
    private void m45973f0() {
        this.f47366S = -1;
        VelocityTracker velocityTracker = this.f47365R;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f47365R = null;
        }
    }

    /* renamed from: g0 */
    private void m45974g0(SavedState savedState) {
        int i = this.f47372a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f47376e = savedState.f47399e;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f47373b = savedState.f47400f;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f47351D = savedState.f47401g;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f47352E = savedState.f47402h;
            }
        }
    }

    /* renamed from: u0 */
    private void m45975u0(View view) {
        boolean z = Build.VERSION.SDK_INT >= 29 && !mo39805d0() && !this.f47377f;
        if (this.f47385n || this.f47386o || this.f47387p || z) {
            C10227s.m47134b(view, new C10049d(z));
        }
    }

    /* renamed from: w0 */
    private void m45976w0(int i) {
        View view = (View) this.f47362O.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C5723u.m25293S(view)) {
                mo39819v0(view, i);
            } else {
                view.post(new C10047b(view, i));
            }
        }
    }

    /* renamed from: z0 */
    private void m45977z0() {
        View view;
        WeakReference<V> weakReference = this.f47362O;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C5723u.m25318i0(view, 524288);
            C5723u.m25318i0(view, 262144);
            C5723u.m25318i0(view, ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            int i = this.f47370W;
            if (i != -1) {
                C5723u.m25318i0(view, i);
            }
            int i2 = 6;
            if (!this.f47373b && this.f47354G != 6) {
                this.f47370W = m45963R(view, C6530j.bottomsheet_action_expand_halfway, 6);
            }
            if (this.f47351D && this.f47354G != 5) {
                m45972e0(view, C5771c.C5772a.f24492y, 5);
            }
            int i3 = this.f47354G;
            if (i3 == 3) {
                if (this.f47373b) {
                    i2 = 4;
                }
                m45972e0(view, C5771c.C5772a.f24491x, i2);
            } else if (i3 == 4) {
                if (this.f47373b) {
                    i2 = 3;
                }
                m45972e0(view, C5771c.C5772a.f24490w, i2);
            } else if (i3 == 6) {
                m45972e0(view, C5771c.C5772a.f24491x, 4);
                m45972e0(view, C5771c.C5772a.f24490w, 3);
            }
        }
    }

    /* renamed from: A */
    public boolean mo2990A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f47357J = 0;
        this.f47358K = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public void mo2992C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3;
        int i4 = 3;
        if (v.getTop() == mo39804b0()) {
            mo39818t0(3);
            return;
        }
        WeakReference<View> weakReference = this.f47363P;
        if (weakReference != null && view == weakReference.get() && this.f47358K) {
            if (this.f47357J > 0) {
                if (this.f47373b) {
                    i2 = this.f47396y;
                } else {
                    int top = v.getTop();
                    int i5 = this.f47397z;
                    if (top > i5) {
                        i2 = i5;
                    } else {
                        i2 = mo39804b0();
                    }
                }
                mo39821y0(v, i4, i2, false);
                this.f47358K = false;
            } else if (!this.f47351D || !mo39820x0(v, m45971c0())) {
                if (this.f47357J == 0) {
                    int top2 = v.getTop();
                    if (!this.f47373b) {
                        int i6 = this.f47397z;
                        if (top2 < i6) {
                            if (top2 < Math.abs(top2 - this.f47349B)) {
                                i2 = mo39804b0();
                                mo39821y0(v, i4, i2, false);
                                this.f47358K = false;
                            }
                            i2 = this.f47397z;
                        } else if (Math.abs(top2 - i6) < Math.abs(top2 - this.f47349B)) {
                            i2 = this.f47397z;
                        } else {
                            i3 = this.f47349B;
                        }
                    } else if (Math.abs(top2 - this.f47396y) < Math.abs(top2 - this.f47349B)) {
                        i2 = this.f47396y;
                        mo39821y0(v, i4, i2, false);
                        this.f47358K = false;
                    } else {
                        i3 = this.f47349B;
                    }
                } else if (this.f47373b) {
                    i3 = this.f47349B;
                } else {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.f47397z) < Math.abs(top3 - this.f47349B)) {
                        i2 = this.f47397z;
                    } else {
                        i3 = this.f47349B;
                    }
                }
                i4 = 4;
                mo39821y0(v, i4, i2, false);
                this.f47358K = false;
            } else {
                i2 = this.f47361N;
                i4 = 5;
                mo39821y0(v, i4, i2, false);
                this.f47358K = false;
            }
            i4 = 6;
            mo39821y0(v, i4, i2, false);
            this.f47358K = false;
        }
    }

    /* renamed from: D */
    public boolean mo2993D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f47354G == 1 && actionMasked == 0) {
            return true;
        }
        C5931c cVar = this.f47355H;
        if (cVar != null) {
            cVar.mo22949F(motionEvent);
        }
        if (actionMasked == 0) {
            m45973f0();
        }
        if (this.f47365R == null) {
            this.f47365R = VelocityTracker.obtain();
        }
        this.f47365R.addMovement(motionEvent);
        if (this.f47355H != null && actionMasked == 2 && !this.f47356I && Math.abs(((float) this.f47367T) - motionEvent.getY()) > ((float) this.f47355H.mo22966z())) {
            this.f47355H.mo22959c(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f47356I;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo39802Z(int i) {
        float f;
        float f2;
        View view = (View) this.f47362O.get();
        if (view != null && !this.f47364Q.isEmpty()) {
            int i2 = this.f47349B;
            if (i > i2 || i2 == mo39804b0()) {
                int i3 = this.f47349B;
                f = (float) (i3 - i);
                f2 = (float) (this.f47361N - i3);
            } else {
                int i4 = this.f47349B;
                f = (float) (i4 - i);
                f2 = (float) (i4 - mo39804b0());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f47364Q.size(); i5++) {
                this.f47364Q.get(i5).mo39831a(view, f3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public View mo39803a0(View view) {
        if (C5723u.m25295U(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View a0 = mo39803a0(viewGroup.getChildAt(i));
            if (a0 != null) {
                return a0;
            }
        }
        return null;
    }

    /* renamed from: b0 */
    public int mo39804b0() {
        if (this.f47373b) {
            return this.f47396y;
        }
        return Math.max(this.f47395x, this.f47388q ? 0 : this.f47390s);
    }

    /* renamed from: d0 */
    public boolean mo39805d0() {
        return this.f47384m;
    }

    /* renamed from: g */
    public void mo3000g(CoordinatorLayout.C0581e eVar) {
        super.mo3000g(eVar);
        this.f47362O = null;
        this.f47355H = null;
    }

    /* renamed from: h0 */
    public void mo39806h0(boolean z) {
        this.f47353F = z;
    }

    /* renamed from: i0 */
    public void mo39807i0(int i) {
        if (i >= 0) {
            this.f47395x = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: j */
    public void mo3003j() {
        super.mo3003j();
        this.f47362O = null;
        this.f47355H = null;
    }

    /* renamed from: j0 */
    public void mo39808j0(boolean z) {
        if (this.f47373b != z) {
            this.f47373b = z;
            if (this.f47362O != null) {
                m45964S();
            }
            mo39818t0((!this.f47373b || this.f47354G != 6) ? this.f47354G : 3);
            m45977z0();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3004k(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r9.f47353F
            if (r0 != 0) goto L_0x000e
            goto L_0x00d2
        L_0x000e:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0017
            r9.m45973f0()
        L_0x0017:
            android.view.VelocityTracker r3 = r9.f47365R
            if (r3 != 0) goto L_0x0021
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.f47365R = r3
        L_0x0021:
            android.view.VelocityTracker r3 = r9.f47365R
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x0031
            r11 = 3
            if (r0 == r11) goto L_0x0031
            goto L_0x007f
        L_0x0031:
            r9.f47368U = r1
            r9.f47366S = r4
            boolean r11 = r9.f47356I
            if (r11 == 0) goto L_0x007f
            r9.f47356I = r1
            return r1
        L_0x003c:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f47367T = r7
            int r7 = r9.f47354G
            if (r7 == r5) goto L_0x006e
            java.lang.ref.WeakReference<android.view.View> r7 = r9.f47363P
            if (r7 == 0) goto L_0x0057
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0058
        L_0x0057:
            r7 = r3
        L_0x0058:
            if (r7 == 0) goto L_0x006e
            int r8 = r9.f47367T
            boolean r7 = r10.mo2941F(r7, r6, r8)
            if (r7 == 0) goto L_0x006e
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f47366S = r7
            r9.f47368U = r2
        L_0x006e:
            int r7 = r9.f47366S
            if (r7 != r4) goto L_0x007c
            int r4 = r9.f47367T
            boolean r11 = r10.mo2941F(r11, r6, r4)
            if (r11 != 0) goto L_0x007c
            r11 = 1
            goto L_0x007d
        L_0x007c:
            r11 = 0
        L_0x007d:
            r9.f47356I = r11
        L_0x007f:
            boolean r11 = r9.f47356I
            if (r11 != 0) goto L_0x008e
            q0.c r11 = r9.f47355H
            if (r11 == 0) goto L_0x008e
            boolean r11 = r11.mo22954O(r12)
            if (r11 == 0) goto L_0x008e
            return r2
        L_0x008e:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.f47363P
            if (r11 == 0) goto L_0x0099
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0099:
            if (r0 != r5) goto L_0x00d1
            if (r3 == 0) goto L_0x00d1
            boolean r11 = r9.f47356I
            if (r11 != 0) goto L_0x00d1
            int r11 = r9.f47354G
            if (r11 == r2) goto L_0x00d1
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.mo2941F(r3, r11, r0)
            if (r10 != 0) goto L_0x00d1
            q0.c r10 = r9.f47355H
            if (r10 == 0) goto L_0x00d1
            int r10 = r9.f47367T
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            q0.c r11 = r9.f47355H
            int r11 = r11.mo22966z()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d1
            r1 = 1
        L_0x00d1:
            return r1
        L_0x00d2:
            r9.f47356I = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo3004k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: k0 */
    public void mo39809k0(boolean z) {
        this.f47384m = z;
    }

    /* renamed from: l */
    public boolean mo3005l(CoordinatorLayout coordinatorLayout, V v, int i) {
        C10889h hVar;
        if (C5723u.m25349y(coordinatorLayout) && !C5723u.m25349y(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f47362O == null) {
            this.f47378g = coordinatorLayout.getResources().getDimensionPixelSize(C6524d.design_bottom_sheet_peek_height_min);
            m45975u0(v);
            this.f47362O = new WeakReference<>(v);
            if (this.f47380i && (hVar = this.f47381j) != null) {
                C5723u.m25336r0(v, hVar);
            }
            C10889h hVar2 = this.f47381j;
            if (hVar2 != null) {
                float f = this.f47350C;
                if (f == -1.0f) {
                    f = C5723u.m25345w(v);
                }
                hVar2.mo43090Z(f);
                boolean z = this.f47354G == 3;
                this.f47392u = z;
                this.f47381j.mo43092b0(z ? 0.0f : 1.0f);
            }
            m45977z0();
            if (C5723u.m25351z(v) == 0) {
                C5723u.m25350y0(v, 1);
            }
            int measuredWidth = v.getMeasuredWidth();
            int i2 = this.f47382k;
            if (measuredWidth > i2 && i2 != -1) {
                ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
                layoutParams.width = this.f47382k;
                v.post(new C10046a(v, layoutParams));
            }
        }
        if (this.f47355H == null) {
            this.f47355H = C5931c.m26183p(coordinatorLayout, this.f47371X);
        }
        int top = v.getTop();
        coordinatorLayout.mo2944M(v, i);
        this.f47360M = coordinatorLayout.getWidth();
        this.f47361N = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f47359L = height;
        int i3 = this.f47361N;
        int i4 = i3 - height;
        int i5 = this.f47390s;
        if (i4 < i5) {
            if (this.f47388q) {
                this.f47359L = i3;
            } else {
                this.f47359L = i3 - i5;
            }
        }
        this.f47396y = Math.max(0, i3 - this.f47359L);
        m45965T();
        m45964S();
        int i6 = this.f47354G;
        if (i6 == 3) {
            C5723u.m25300Z(v, mo39804b0());
        } else if (i6 == 6) {
            C5723u.m25300Z(v, this.f47397z);
        } else if (this.f47351D && i6 == 5) {
            C5723u.m25300Z(v, this.f47361N);
        } else if (i6 == 4) {
            C5723u.m25300Z(v, this.f47349B);
        } else if (i6 == 1 || i6 == 2) {
            C5723u.m25300Z(v, top - v.getTop());
        }
        this.f47363P = new WeakReference<>(mo39803a0(v));
        return true;
    }

    /* renamed from: l0 */
    public void mo39810l0(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f47348A = f;
        if (this.f47362O != null) {
            m45965T();
        }
    }

    /* renamed from: m0 */
    public void mo39811m0(boolean z) {
        if (this.f47351D != z) {
            this.f47351D = z;
            if (!z && this.f47354G == 5) {
                mo39817s0(4);
            }
            m45977z0();
        }
    }

    /* renamed from: n0 */
    public void mo39812n0(int i) {
        this.f47382k = i;
    }

    /* renamed from: o */
    public boolean mo3008o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f47363P;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.f47354G != 3 || super.mo3008o(coordinatorLayout, v, view, f, f2)) {
            return true;
        }
        return false;
    }

    /* renamed from: o0 */
    public void mo39813o0(int i) {
        mo39814p0(i, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39814p0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f47377f
            if (r4 != 0) goto L_0x0015
            r3.f47377f = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f47377f
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f47376e
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f47377f = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f47376e = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.m45949C0(r5)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo39814p0(int, boolean):void");
    }

    /* renamed from: q */
    public void mo3010q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f47363P;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < mo39804b0()) {
                        iArr[1] = top - mo39804b0();
                        C5723u.m25300Z(v, -iArr[1]);
                        mo39818t0(3);
                    } else if (this.f47353F) {
                        iArr[1] = i2;
                        C5723u.m25300Z(v, -i2);
                        mo39818t0(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i5 = this.f47349B;
                    if (i4 > i5 && !this.f47351D) {
                        iArr[1] = top - i5;
                        C5723u.m25300Z(v, -iArr[1]);
                        mo39818t0(4);
                    } else if (this.f47353F) {
                        iArr[1] = i2;
                        C5723u.m25300Z(v, -i2);
                        mo39818t0(1);
                    } else {
                        return;
                    }
                }
                mo39802Z(v.getTop());
                this.f47357J = i2;
                this.f47358K = true;
            }
        }
    }

    /* renamed from: q0 */
    public void mo39815q0(int i) {
        this.f47372a = i;
    }

    /* renamed from: r0 */
    public void mo39816r0(boolean z) {
        this.f47352E = z;
    }

    /* renamed from: s0 */
    public void mo39817s0(int i) {
        if (i != this.f47354G) {
            if (this.f47362O != null) {
                m45976w0(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.f47351D && i == 5)) {
                this.f47354G = i;
            }
        }
    }

    /* renamed from: t */
    public void mo3013t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public void mo39818t0(int i) {
        View view;
        if (this.f47354G != i) {
            this.f47354G = i;
            WeakReference<V> weakReference = this.f47362O;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i == 3) {
                    m45948B0(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    m45948B0(false);
                }
                m45947A0(i);
                for (int i2 = 0; i2 < this.f47364Q.size(); i2++) {
                    this.f47364Q.get(i2).mo39832b(view, i);
                }
                m45977z0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void mo39819v0(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f47349B;
        } else if (i == 6) {
            int i4 = this.f47397z;
            if (!this.f47373b || i4 > (i3 = this.f47396y)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = mo39804b0();
        } else if (!this.f47351D || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.f47361N;
        }
        mo39821y0(view, i, i2, false);
    }

    /* renamed from: x */
    public void mo3017x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo3017x(coordinatorLayout, v, savedState.mo3233a());
        m45974g0(savedState);
        int i = savedState.f47398d;
        if (i == 1 || i == 2) {
            this.f47354G = 4;
        } else {
            this.f47354G = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public boolean mo39820x0(View view, float f) {
        if (this.f47352E) {
            return true;
        }
        if (view.getTop() < this.f47349B) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f47349B)) / ((float) m45966U()) > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public Parcelable mo3018y(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo3018y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo39821y0(View view, int i, int i2, boolean z) {
        C5931c cVar = this.f47355H;
        if (cVar != null && (!z ? cVar.mo22955P(view, view.getLeft(), i2) : cVar.mo22953N(view.getLeft(), i2))) {
            mo39818t0(2);
            m45947A0(i);
            if (this.f47393v == null) {
                this.f47393v = new C10053h(view, i);
            }
            if (!this.f47393v.f47416c) {
                BottomSheetBehavior<V>.h hVar = this.f47393v;
                hVar.f47417d = i;
                C5723u.m25314g0(view, hVar);
                boolean unused = this.f47393v.f47416c = true;
                return;
            }
            this.f47393v.f47417d = i;
            return;
        }
        mo39818t0(i);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10045a();

        /* renamed from: d */
        final int f47398d;

        /* renamed from: e */
        int f47399e;

        /* renamed from: f */
        boolean f47400f;

        /* renamed from: g */
        boolean f47401g;

        /* renamed from: h */
        boolean f47402h;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        static class C10045a implements Parcelable.ClassLoaderCreator<SavedState> {
            C10045a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f47398d = parcel.readInt();
            this.f47399e = parcel.readInt();
            boolean z = false;
            this.f47400f = parcel.readInt() == 1;
            this.f47401g = parcel.readInt() == 1;
            this.f47402h = parcel.readInt() == 1 ? true : z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f47398d);
            parcel.writeInt(this.f47399e);
            parcel.writeInt(this.f47400f ? 1 : 0);
            parcel.writeInt(this.f47401g ? 1 : 0);
            parcel.writeInt(this.f47402h ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f47398d = bottomSheetBehavior.f47354G;
            this.f47399e = bottomSheetBehavior.f47376e;
            this.f47400f = bottomSheetBehavior.f47373b;
            this.f47401g = bottomSheetBehavior.f47351D;
            this.f47402h = bottomSheetBehavior.f47352E;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f47379h = context.getResources().getDimensionPixelSize(C6524d.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6532l.f26966h0);
        this.f47380i = obtainStyledAttributes.hasValue(C6532l.f27153y0);
        int i2 = C6532l.f26999k0;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        if (hasValue) {
            m45969X(context, attributeSet, hasValue, C10805c.m48753a(context, obtainStyledAttributes, i2));
        } else {
            m45968W(context, attributeSet, hasValue);
        }
        m45970Y();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f47350C = obtainStyledAttributes.getDimension(C6532l.f26988j0, -1.0f);
        }
        int i3 = C6532l.f26977i0;
        if (obtainStyledAttributes.hasValue(i3)) {
            mo39812n0(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        }
        int i4 = C6532l.f27065q0;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i4);
        if (peekValue == null || (i = peekValue.data) != -1) {
            mo39813o0(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        } else {
            mo39813o0(i);
        }
        mo39811m0(obtainStyledAttributes.getBoolean(C6532l.f27054p0, false));
        mo39809k0(obtainStyledAttributes.getBoolean(C6532l.f27098t0, false));
        mo39808j0(obtainStyledAttributes.getBoolean(C6532l.f27032n0, true));
        mo39816r0(obtainStyledAttributes.getBoolean(C6532l.f27087s0, false));
        mo39806h0(obtainStyledAttributes.getBoolean(C6532l.f27010l0, true));
        mo39815q0(obtainStyledAttributes.getInt(C6532l.f27076r0, 0));
        mo39810l0(obtainStyledAttributes.getFloat(C6532l.f27043o0, 0.5f));
        int i5 = C6532l.f27021m0;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i5);
        if (peekValue2 == null || peekValue2.type != 16) {
            mo39807i0(obtainStyledAttributes.getDimensionPixelOffset(i5, 0));
        } else {
            mo39807i0(peekValue2.data);
        }
        this.f47385n = obtainStyledAttributes.getBoolean(C6532l.f27109u0, false);
        this.f47386o = obtainStyledAttributes.getBoolean(C6532l.f27120v0, false);
        this.f47387p = obtainStyledAttributes.getBoolean(C6532l.f27131w0, false);
        this.f47388q = obtainStyledAttributes.getBoolean(C6532l.f27142x0, true);
        obtainStyledAttributes.recycle();
        this.f47375d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
