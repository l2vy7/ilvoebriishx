package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C0600b;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p062d0.C5135a;
import p104l0.C5643c;
import p104l0.C5645e;
import p104l0.C5647g;
import p110m0.C5690c0;
import p110m0.C5705d;
import p110m0.C5714l;
import p110m0.C5715m;
import p110m0.C5717o;
import p110m0.C5718p;
import p110m0.C5723u;
import p175y.C6393a;
import p175y.C6394b;
import p175y.C6395c;

public class CoordinatorLayout extends ViewGroup implements C5714l, C5715m {

    /* renamed from: v */
    static final String f3067v;

    /* renamed from: w */
    static final Class<?>[] f3068w = {Context.class, AttributeSet.class};

    /* renamed from: x */
    static final ThreadLocal<Map<String, Constructor<Behavior>>> f3069x = new ThreadLocal<>();

    /* renamed from: y */
    static final Comparator<View> f3070y;

    /* renamed from: z */
    private static final C5645e<Rect> f3071z = new C5647g(12);

    /* renamed from: b */
    private final List<View> f3072b;

    /* renamed from: c */
    private final C0584a<View> f3073c;

    /* renamed from: d */
    private final List<View> f3074d;

    /* renamed from: e */
    private final List<View> f3075e;

    /* renamed from: f */
    private Paint f3076f;

    /* renamed from: g */
    private final int[] f3077g;

    /* renamed from: h */
    private final int[] f3078h;

    /* renamed from: i */
    private boolean f3079i;

    /* renamed from: j */
    private boolean f3080j;

    /* renamed from: k */
    private int[] f3081k;

    /* renamed from: l */
    private View f3082l;

    /* renamed from: m */
    private View f3083m;

    /* renamed from: n */
    private C0582f f3084n;

    /* renamed from: o */
    private boolean f3085o;

    /* renamed from: p */
    private C5690c0 f3086p;

    /* renamed from: q */
    private boolean f3087q;

    /* renamed from: r */
    private Drawable f3088r;

    /* renamed from: s */
    ViewGroup.OnHierarchyChangeListener f3089s;

    /* renamed from: t */
    private C5718p f3090t;

    /* renamed from: u */
    private final C5717o f3091u;

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        /* renamed from: A */
        public boolean mo2990A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo3019z(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* renamed from: B */
        public void mo2991B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: C */
        public void mo2992C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo2991B(coordinatorLayout, v, view);
            }
        }

        /* renamed from: D */
        public boolean mo2993D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2994a(CoordinatorLayout coordinatorLayout, V v) {
            return mo2997d(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo2995b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int mo2996c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: d */
        public float mo2997d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo2998e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: f */
        public C5690c0 mo2999f(CoordinatorLayout coordinatorLayout, V v, C5690c0 c0Var) {
            return c0Var;
        }

        /* renamed from: g */
        public void mo3000g(C0581e eVar) {
        }

        /* renamed from: h */
        public boolean mo3001h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: i */
        public void mo3002i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: j */
        public void mo3003j() {
        }

        /* renamed from: k */
        public boolean mo3004k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo3005l(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: m */
        public boolean mo3006m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: n */
        public boolean mo3007n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: o */
        public boolean mo3008o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: p */
        public void mo3009p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: q */
        public void mo3010q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo3009p(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: r */
        public void mo3011r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: s */
        public void mo3012s(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo3011r(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: t */
        public void mo3013t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            mo3012s(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        /* renamed from: u */
        public void mo3014u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: v */
        public void mo3015v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                mo3014u(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: w */
        public boolean mo3016w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: x */
        public void mo3017x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo3018y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: z */
        public boolean mo3019z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    class C0577a implements C5718p {
        C0577a() {
        }

        /* renamed from: a */
        public C5690c0 mo870a(View view, C5690c0 c0Var) {
            return CoordinatorLayout.this.mo2948a0(c0Var);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0578b {
        Behavior getBehavior();
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public @interface C0579c {
        Class<? extends Behavior> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    private class C0580d implements ViewGroup.OnHierarchyChangeListener {
        C0580d() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3089s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo2943L(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3089s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    class C0582f implements ViewTreeObserver.OnPreDrawListener {
        C0582f() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo2943L(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    static class C0583g implements Comparator<View> {
        C0583g() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float N = C5723u.m25288N(view);
            float N2 = C5723u.m25288N(view2);
            if (N > N2) {
                return -1;
            }
            return N < N2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            f3067v = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>()
            f3070y = r0
            goto L_0x0021
        L_0x001f:
            f3070y = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f3068w = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f3069x = r0
            l0.g r0 = new l0.g
            r1 = 12
            r0.<init>(r1)
            f3071z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6393a.f26288a);
    }

    /* renamed from: A */
    private int m3122A(int i) {
        int[] iArr = this.f3081k;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    /* renamed from: D */
    private void m3123D(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f3070y;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: E */
    private boolean m3124E(View view) {
        return this.f3073c.mo3057j(view);
    }

    /* renamed from: G */
    private void m3125G(View view, int i) {
        C0581e eVar = (C0581e) view.getLayoutParams();
        Rect e = m3140e();
        e.set(getPaddingLeft() + eVar.leftMargin, getPaddingTop() + eVar.topMargin, (getWidth() - getPaddingRight()) - eVar.rightMargin, (getHeight() - getPaddingBottom()) - eVar.bottomMargin);
        if (this.f3086p != null && C5723u.m25349y(this) && !C5723u.m25349y(view)) {
            e.left += this.f3086p.mo22411j();
            e.top += this.f3086p.mo22413l();
            e.right -= this.f3086p.mo22412k();
            e.bottom -= this.f3086p.mo22410i();
        }
        Rect e2 = m3140e();
        C5705d.m25205a(m3135W(eVar.f3097c), view.getMeasuredWidth(), view.getMeasuredHeight(), e, e2, i);
        view.layout(e2.left, e2.top, e2.right, e2.bottom);
        m3132S(e);
        m3132S(e2);
    }

    /* renamed from: H */
    private void m3126H(View view, View view2, int i) {
        Rect e = m3140e();
        Rect e2 = m3140e();
        try {
            mo2988x(view2, e);
            mo2989y(view, i, e, e2);
            view.layout(e2.left, e2.top, e2.right, e2.bottom);
        } finally {
            m3132S(e);
            m3132S(e2);
        }
    }

    /* renamed from: I */
    private void m3127I(View view, int i, int i2) {
        C0581e eVar = (C0581e) view.getLayoutParams();
        int b = C5705d.m25206b(m3136X(eVar.f3097c), i2);
        int i3 = b & 7;
        int i4 = b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int A = m3122A(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            A += measuredWidth / 2;
        } else if (i3 == 5) {
            A += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(A, ((width - getPaddingRight()) - measuredWidth) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: J */
    private void m3128J(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C5723u.m25294T(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0581e eVar = (C0581e) view.getLayoutParams();
            Behavior f = eVar.mo3035f();
            Rect e = m3140e();
            Rect e2 = m3140e();
            e2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f == null || !f.mo2995b(this, view, e)) {
                e.set(e2);
            } else if (!e2.contains(e)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + e.toShortString() + " | Bounds:" + e2.toShortString());
            }
            m3132S(e2);
            if (e.isEmpty()) {
                m3132S(e);
                return;
            }
            int b = C5705d.m25206b(eVar.f3102h, i);
            boolean z3 = true;
            if ((b & 48) != 48 || (i6 = (e.top - eVar.topMargin) - eVar.f3104j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m3138Z(view, i7 - i6);
                z = true;
            }
            if ((b & 80) == 80 && (height = ((getHeight() - e.bottom) - eVar.bottomMargin) + eVar.f3104j) < (i5 = rect.bottom)) {
                m3138Z(view, height - i5);
                z = true;
            }
            if (!z) {
                m3138Z(view, 0);
            }
            if ((b & 3) != 3 || (i3 = (e.left - eVar.leftMargin) - eVar.f3103i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m3137Y(view, i4 - i3);
                z2 = true;
            }
            if ((b & 5) != 5 || (width = ((getWidth() - e.right) - eVar.rightMargin) + eVar.f3103i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                m3137Y(view, width - i2);
            }
            if (!z3) {
                m3137Y(view, 0);
            }
            m3132S(e);
        }
    }

    /* renamed from: O */
    static Behavior m3129O(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f3067v;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = f3069x;
            Map map = threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f3068w);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: P */
    private boolean m3130P(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f3074d;
        m3123D(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            C0581e eVar = (C0581e) view.getLayoutParams();
            Behavior f = eVar.mo3035f();
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && f != null) {
                    if (i2 == 0) {
                        z = f.mo3004k(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = f.mo2993D(this, view, motionEvent2);
                    }
                    if (z) {
                        this.f3082l = view;
                    }
                }
                boolean c = eVar.mo3032c();
                boolean i4 = eVar.mo3038i(this, view);
                z2 = i4 && !c;
                if (i4 && !z2) {
                    break;
                }
            } else if (f != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    f.mo3004k(this, view, motionEvent3);
                } else if (i2 == 1) {
                    f.mo2993D(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: Q */
    private void m3131Q() {
        this.f3072b.clear();
        this.f3073c.mo3052c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0581e C = mo2940C(childAt);
            C.mo3033d(this, childAt);
            this.f3073c.mo3051b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (C.mo3031b(this, childAt, childAt2)) {
                        if (!this.f3073c.mo3053d(childAt2)) {
                            this.f3073c.mo3051b(childAt2);
                        }
                        this.f3073c.mo3050a(childAt2, childAt);
                    }
                }
            }
        }
        this.f3072b.addAll(this.f3073c.mo3056i());
        Collections.reverse(this.f3072b);
    }

    /* renamed from: S */
    private static void m3132S(Rect rect) {
        rect.setEmpty();
        f3071z.mo7110a(rect);
    }

    /* renamed from: U */
    private void m3133U(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior f = ((C0581e) childAt.getLayoutParams()).mo3035f();
            if (f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    f.mo3004k(this, childAt, obtain);
                } else {
                    f.mo2993D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0581e) getChildAt(i2).getLayoutParams()).mo3042m();
        }
        this.f3082l = null;
        this.f3079i = false;
    }

    /* renamed from: V */
    private static int m3134V(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: W */
    private static int m3135W(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: X */
    private static int m3136X(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: Y */
    private void m3137Y(View view, int i) {
        C0581e eVar = (C0581e) view.getLayoutParams();
        int i2 = eVar.f3103i;
        if (i2 != i) {
            C5723u.m25299Y(view, i - i2);
            eVar.f3103i = i;
        }
    }

    /* renamed from: Z */
    private void m3138Z(View view, int i) {
        C0581e eVar = (C0581e) view.getLayoutParams();
        int i2 = eVar.f3104j;
        if (i2 != i) {
            C5723u.m25300Z(view, i - i2);
            eVar.f3104j = i;
        }
    }

    /* renamed from: b0 */
    private void m3139b0() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (C5723u.m25349y(this)) {
                if (this.f3090t == null) {
                    this.f3090t = new C0577a();
                }
                C5723u.m25266B0(this, this.f3090t);
                setSystemUiVisibility(1280);
                return;
            }
            C5723u.m25266B0(this, (C5718p) null);
        }
    }

    /* renamed from: e */
    private static Rect m3140e() {
        Rect acquire = f3071z.acquire();
        return acquire == null ? new Rect() : acquire;
    }

    /* renamed from: g */
    private static int m3141g(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: h */
    private void m3142h(C0581e eVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - eVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: i */
    private C5690c0 m3143i(C5690c0 c0Var) {
        Behavior f;
        if (c0Var.mo22416p()) {
            return c0Var;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C5723u.m25349y(childAt) && (f = ((C0581e) childAt.getLayoutParams()).mo3035f()) != null) {
                c0Var = f.mo2999f(this, childAt, c0Var);
                if (c0Var.mo22416p()) {
                    break;
                }
            }
        }
        return c0Var;
    }

    /* renamed from: z */
    private void m3144z(View view, int i, Rect rect, Rect rect2, C0581e eVar, int i2, int i3) {
        int i4;
        int i5;
        int b = C5705d.m25206b(m3134V(eVar.f3097c), i);
        int b2 = C5705d.m25206b(m3135W(eVar.f3098d), i);
        int i6 = b & 7;
        int i7 = b & 112;
        int i8 = b2 & 7;
        int i9 = b2 & 112;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo2939B(View view, Rect rect) {
        rect.set(((C0581e) view.getLayoutParams()).mo3037h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public C0581e mo2940C(View view) {
        C0581e eVar = (C0581e) view.getLayoutParams();
        if (!eVar.f3096b) {
            if (view instanceof C0578b) {
                Behavior behavior = ((C0578b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                eVar.mo3043o(behavior);
                eVar.f3096b = true;
            } else {
                C0579c cVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    cVar = (C0579c) cls.getAnnotation(C0579c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        eVar.mo3043o((Behavior) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                eVar.f3096b = true;
            }
        }
        return eVar;
    }

    /* renamed from: F */
    public boolean mo2941F(View view, int i, int i2) {
        Rect e = m3140e();
        mo2988x(view, e);
        try {
            return e.contains(i, i2);
        } finally {
            m3132S(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo2942K(View view, int i) {
        Behavior f;
        View view2 = view;
        C0581e eVar = (C0581e) view.getLayoutParams();
        if (eVar.f3105k != null) {
            Rect e = m3140e();
            Rect e2 = m3140e();
            Rect e3 = m3140e();
            mo2988x(eVar.f3105k, e);
            boolean z = false;
            mo2984u(view2, false, e2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m3144z(view, i, e, e3, eVar, measuredWidth, measuredHeight);
            if (!(e3.left == e2.left && e3.top == e2.top)) {
                z = true;
            }
            m3142h(eVar, e3, measuredWidth, i2);
            int i3 = e3.left - e2.left;
            int i4 = e3.top - e2.top;
            if (i3 != 0) {
                C5723u.m25299Y(view2, i3);
            }
            if (i4 != 0) {
                C5723u.m25300Z(view2, i4);
            }
            if (z && (f = eVar.mo3035f()) != null) {
                f.mo3001h(this, view2, eVar.f3105k);
            }
            m3132S(e);
            m3132S(e2);
            m3132S(e3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo2943L(int i) {
        boolean z;
        int i2 = i;
        int B = C5723u.m25265B(this);
        int size = this.f3072b.size();
        Rect e = m3140e();
        Rect e2 = m3140e();
        Rect e3 = m3140e();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f3072b.get(i3);
            C0581e eVar = (C0581e) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (eVar.f3106l == this.f3072b.get(i4)) {
                        mo2942K(view, B);
                    }
                }
                mo2984u(view, true, e2);
                if (eVar.f3101g != 0 && !e2.isEmpty()) {
                    int b = C5705d.m25206b(eVar.f3101g, B);
                    int i5 = b & 112;
                    if (i5 == 48) {
                        e.top = Math.max(e.top, e2.bottom);
                    } else if (i5 == 80) {
                        e.bottom = Math.max(e.bottom, getHeight() - e2.top);
                    }
                    int i6 = b & 7;
                    if (i6 == 3) {
                        e.left = Math.max(e.left, e2.right);
                    } else if (i6 == 5) {
                        e.right = Math.max(e.right, getWidth() - e2.left);
                    }
                }
                if (eVar.f3102h != 0 && view.getVisibility() == 0) {
                    m3128J(view, e, B);
                }
                if (i2 != 2) {
                    mo2939B(view, e3);
                    if (!e3.equals(e2)) {
                        mo2946R(view, e2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.f3072b.get(i7);
                    C0581e eVar2 = (C0581e) view2.getLayoutParams();
                    Behavior f = eVar2.mo3035f();
                    if (f != null && f.mo2998e(this, view2, view)) {
                        if (i2 != 0 || !eVar2.mo3036g()) {
                            if (i2 != 2) {
                                z = f.mo3001h(this, view2, view);
                            } else {
                                f.mo3002i(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                eVar2.mo3044p(z);
                            }
                        } else {
                            eVar2.mo3040k();
                        }
                    }
                }
            }
        }
        m3132S(e);
        m3132S(e2);
        m3132S(e3);
    }

    /* renamed from: M */
    public void mo2944M(View view, int i) {
        C0581e eVar = (C0581e) view.getLayoutParams();
        if (!eVar.mo3030a()) {
            View view2 = eVar.f3105k;
            if (view2 != null) {
                m3126H(view, view2, i);
                return;
            }
            int i2 = eVar.f3099e;
            if (i2 >= 0) {
                m3127I(view, i2, i);
            } else {
                m3125G(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* renamed from: N */
    public void mo2945N(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo2946R(View view, Rect rect) {
        ((C0581e) view.getLayoutParams()).mo3045q(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo2947T() {
        if (this.f3080j && this.f3084n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3084n);
        }
        this.f3085o = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public final C5690c0 mo2948a0(C5690c0 c0Var) {
        if (C5643c.m24954a(this.f3086p, c0Var)) {
            return c0Var;
        }
        this.f3086p = c0Var;
        boolean z = true;
        boolean z2 = c0Var != null && c0Var.mo22413l() > 0;
        this.f3087q = z2;
        if (z2 || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C5690c0 i = m3143i(c0Var);
        requestLayout();
        return i;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0581e) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0581e eVar = (C0581e) view.getLayoutParams();
        Behavior behavior = eVar.f3095a;
        if (behavior != null) {
            float d = behavior.mo2997d(this, view);
            if (d > 0.0f) {
                if (this.f3076f == null) {
                    this.f3076f = new Paint();
                }
                this.f3076f.setColor(eVar.f3095a.mo2996c(this, view));
                this.f3076f.setAlpha(m3141g(Math.round(d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f3076f);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3088r;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2952f() {
        if (this.f3080j) {
            if (this.f3084n == null) {
                this.f3084n = new C0582f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3084n);
        }
        this.f3085o = true;
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        m3131Q();
        return Collections.unmodifiableList(this.f3072b);
    }

    public final C5690c0 getLastWindowInsets() {
        return this.f3086p;
    }

    public int getNestedScrollAxes() {
        return this.f3091u.mo22469a();
    }

    public Drawable getStatusBarBackground() {
        return this.f3088r;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* renamed from: j */
    public void mo1345j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Behavior f;
        int i6;
        int i7;
        int childCount = getChildCount();
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0581e eVar = (C0581e) childAt.getLayoutParams();
                if (eVar.mo3039j(i5) && (f = eVar.mo3035f()) != null) {
                    int[] iArr2 = this.f3077g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo3013t(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f3077g;
                    if (i3 > 0) {
                        i6 = Math.max(i8, iArr3[0]);
                    } else {
                        i6 = Math.min(i8, iArr3[0]);
                    }
                    i8 = i6;
                    if (i4 > 0) {
                        i7 = Math.max(i9, this.f3077g[1]);
                    } else {
                        i7 = Math.min(i9, this.f3077g[1]);
                    }
                    i9 = i7;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z) {
            mo2943L(1);
        }
    }

    /* renamed from: k */
    public void mo1346k(View view, int i, int i2, int i3, int i4, int i5) {
        mo1345j(view, i, i2, i3, i4, 0, this.f3078h);
    }

    /* renamed from: l */
    public boolean mo1347l(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0581e eVar = (C0581e) childAt.getLayoutParams();
                Behavior f = eVar.mo3035f();
                if (f != null) {
                    boolean A = f.mo2990A(this, childAt, view, view2, i, i2);
                    z |= A;
                    eVar.mo3046r(i3, A);
                } else {
                    eVar.mo3046r(i3, false);
                }
            }
        }
        return z;
    }

    /* renamed from: m */
    public void mo1348m(View view, View view2, int i, int i2) {
        Behavior f;
        this.f3091u.mo22471c(view, view2, i, i2);
        this.f3083m = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0581e eVar = (C0581e) childAt.getLayoutParams();
            if (eVar.mo3039j(i2) && (f = eVar.mo3035f()) != null) {
                f.mo3015v(this, childAt, view, view2, i, i2);
            }
        }
    }

    /* renamed from: n */
    public void mo1349n(View view, int i) {
        this.f3091u.mo22473e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0581e eVar = (C0581e) childAt.getLayoutParams();
            if (eVar.mo3039j(i)) {
                Behavior f = eVar.mo3035f();
                if (f != null) {
                    f.mo2992C(this, childAt, view, i);
                }
                eVar.mo3041l(i);
                eVar.mo3040k();
            }
        }
        this.f3083m = null;
    }

    /* renamed from: o */
    public void mo1350o(View view, int i, int i2, int[] iArr, int i3) {
        Behavior f;
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                int i9 = i3;
            } else {
                C0581e eVar = (C0581e) childAt.getLayoutParams();
                if (eVar.mo3039j(i3) && (f = eVar.mo3035f()) != null) {
                    int[] iArr2 = this.f3077g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo3010q(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f3077g;
                    if (i > 0) {
                        i4 = Math.max(i6, iArr3[0]);
                    } else {
                        i4 = Math.min(i6, iArr3[0]);
                    }
                    i6 = i4;
                    int[] iArr4 = this.f3077g;
                    if (i2 > 0) {
                        i5 = Math.max(i7, iArr4[1]);
                    } else {
                        i5 = Math.min(i7, iArr4[1]);
                    }
                    i7 = i5;
                    z = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo2943L(1);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m3133U(false);
        if (this.f3085o) {
            if (this.f3084n == null) {
                this.f3084n = new C0582f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3084n);
        }
        if (this.f3086p == null && C5723u.m25349y(this)) {
            C5723u.m25324l0(this);
        }
        this.f3080j = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3133U(false);
        if (this.f3085o && this.f3084n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3084n);
        }
        View view = this.f3083m;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f3080j = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3087q && this.f3088r != null) {
            C5690c0 c0Var = this.f3086p;
            int l = c0Var != null ? c0Var.mo22413l() : 0;
            if (l > 0) {
                this.f3088r.setBounds(0, 0, getWidth(), l);
                this.f3088r.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m3133U(true);
        }
        boolean P = m3130P(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m3133U(true);
        }
        return P;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior f;
        int B = C5723u.m25265B(this);
        int size = this.f3072b.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f3072b.get(i5);
            if (view.getVisibility() != 8 && ((f = ((C0581e) view.getLayoutParams()).mo3035f()) == null || !f.mo3005l(this, view, B))) {
                mo2944M(view, B);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.mo3006m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m3131Q()
            r30.mo2972q()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = p110m0.C5723u.m25265B(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            m0.c0 r3 = r7.f3086p
            if (r3 == 0) goto L_0x004b
            boolean r3 = p110m0.C5723u.m25349y(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f3072b
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List<android.view.View> r0 = r7.f3072b
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0581e) r1
            int r0 = r1.f3099e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.m3122A(r0)
            int r11 = r1.f3097c
            int r11 = m3136X(r11)
            int r11 = p110m0.C5705d.m25206b(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = 0
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = p110m0.C5723u.m25349y(r20)
            if (r0 != 0) goto L_0x00f1
            m0.c0 r0 = r7.f3086p
            int r0 = r0.mo22411j()
            m0.c0 r2 = r7.f3086p
            int r2 = r2.mo22412k()
            int r0 = r0 + r2
            m0.c0 r2 = r7.f3086p
            int r2 = r2.mo22413l()
            m0.c0 r11 = r7.f3086p
            int r11 = r11.mo22410i()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mo3035f()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo3006m(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo2945N(r1, r2, r3, r4, r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Behavior f3;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0581e eVar = (C0581e) childAt.getLayoutParams();
                if (eVar.mo3039j(0) && (f3 = eVar.mo3035f()) != null) {
                    z2 |= f3.mo3007n(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo2943L(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        Behavior f3;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0581e eVar = (C0581e) childAt.getLayoutParams();
                if (eVar.mo3039j(0) && (f3 = eVar.mo3035f()) != null) {
                    z |= f3.mo3008o(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1350o(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1346k(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1348m(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3233a());
        SparseArray<Parcelable> sparseArray = savedState.f3092d;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior f = mo2940C(childAt).mo3035f();
            if (!(id == -1 || f == null || (parcelable2 = sparseArray.get(id)) == null)) {
                f.mo3017x(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable y;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior f = ((C0581e) childAt.getLayoutParams()).mo3035f();
            if (!(id == -1 || f == null || (y = f.mo3018y(this, childAt)) == null)) {
                sparseArray.append(id, y);
            }
        }
        savedState.f3092d = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1347l(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo1349n(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f3082l
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m3130P(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f3082l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0581e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.mo3035f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f3082l
            boolean r6 = r6.mo2993D(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f3082l
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m3133U(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void mo2971p(View view) {
        List g = this.f3073c.mo3054g(view);
        if (g != null && !g.isEmpty()) {
            for (int i = 0; i < g.size(); i++) {
                View view2 = (View) g.get(i);
                Behavior f = ((C0581e) view2.getLayoutParams()).mo3035f();
                if (f != null) {
                    f.mo3001h(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2972q() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m3124E(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f3085o) {
            return;
        }
        if (z) {
            mo2952f();
        } else {
            mo2947T();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C0581e generateDefaultLayoutParams() {
        return new C0581e(-2, -2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior f = ((C0581e) view.getLayoutParams()).mo3035f();
        if (f == null || !f.mo3016w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f3079i) {
            m3133U(false);
            this.f3079i = true;
        }
    }

    /* renamed from: s */
    public C0581e generateLayoutParams(AttributeSet attributeSet) {
        return new C0581e(getContext(), attributeSet);
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m3139b0();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3089s = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f3088r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f3088r = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f3088r.setState(getDrawableState());
                }
                C5135a.m23413m(this.f3088r, C5723u.m25265B(this));
                this.f3088r.setVisible(getVisibility() == 0, false);
                this.f3088r.setCallback(this);
            }
            C5723u.m25310e0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0600b.m3294f(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f3088r;
        if (drawable != null && drawable.isVisible() != z) {
            this.f3088r.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C0581e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0581e) {
            return new C0581e((C0581e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0581e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0581e(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2984u(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo2988x(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: v */
    public List<View> mo2985v(View view) {
        List<View> h = this.f3073c.mo3055h(view);
        this.f3075e.clear();
        if (h != null) {
            this.f3075e.addAll(h);
        }
        return this.f3075e;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3088r;
    }

    /* renamed from: w */
    public List<View> mo2987w(View view) {
        List g = this.f3073c.mo3054g(view);
        this.f3075e.clear();
        if (g != null) {
            this.f3075e.addAll(g);
        }
        return this.f3075e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo2988x(View view, Rect rect) {
        C0585b.m3238a(this, view, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo2989y(View view, int i, Rect rect, Rect rect2) {
        C0581e eVar = (C0581e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m3144z(view, i, rect, rect2, eVar, measuredWidth, measuredHeight);
        m3142h(eVar, rect2, measuredWidth, measuredHeight);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.f3072b = new ArrayList();
        this.f3073c = new C0584a<>();
        this.f3074d = new ArrayList();
        this.f3075e = new ArrayList();
        this.f3077g = new int[2];
        this.f3078h = new int[2];
        this.f3091u = new C5717o(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C6395c.f26291b, 0, C6394b.f26289a);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C6395c.f26291b, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, C6395c.f26291b, attributeSet, typedArray, 0, C6394b.f26289a);
            } else {
                saveAttributeDataForStyleable(context, C6395c.f26291b, attributeSet, typedArray, i, 0);
            }
        }
        int resourceId = typedArray.getResourceId(C6395c.f26292c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f3081k = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f3081k.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f3081k;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f3088r = typedArray.getDrawable(C6395c.f26293d);
        typedArray.recycle();
        m3139b0();
        super.setOnHierarchyChangeListener(new C0580d());
        if (C5723u.m25351z(this) == 0) {
            C5723u.m25350y0(this, 1);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0576a();

        /* renamed from: d */
        SparseArray<Parcelable> f3092d;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        static class C0576a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0576a() {
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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f3092d = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f3092d.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f3092d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f3092d.keyAt(i2);
                parcelableArr[i2] = this.f3092d.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public static class C0581e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        Behavior f3095a;

        /* renamed from: b */
        boolean f3096b = false;

        /* renamed from: c */
        public int f3097c = 0;

        /* renamed from: d */
        public int f3098d = 0;

        /* renamed from: e */
        public int f3099e = -1;

        /* renamed from: f */
        int f3100f = -1;

        /* renamed from: g */
        public int f3101g = 0;

        /* renamed from: h */
        public int f3102h = 0;

        /* renamed from: i */
        int f3103i;

        /* renamed from: j */
        int f3104j;

        /* renamed from: k */
        View f3105k;

        /* renamed from: l */
        View f3106l;

        /* renamed from: m */
        private boolean f3107m;

        /* renamed from: n */
        private boolean f3108n;

        /* renamed from: o */
        private boolean f3109o;

        /* renamed from: p */
        private boolean f3110p;

        /* renamed from: q */
        final Rect f3111q = new Rect();

        /* renamed from: r */
        Object f3112r;

        public C0581e(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: n */
        private void m3206n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f3100f);
            this.f3105k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f3106l = null;
                            this.f3105k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f3106l = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f3106l = null;
                    this.f3105k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f3106l = null;
                this.f3105k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f3100f) + " to anchor view " + view);
            }
        }

        /* renamed from: s */
        private boolean m3207s(View view, int i) {
            int b = C5705d.m25206b(((C0581e) view.getLayoutParams()).f3101g, i);
            return b != 0 && (C5705d.m25206b(this.f3102h, i) & b) == b;
        }

        /* renamed from: t */
        private boolean m3208t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f3105k.getId() != this.f3100f) {
                return false;
            }
            View view2 = this.f3105k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f3106l = null;
                    this.f3105k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f3106l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3030a() {
            return this.f3105k == null && this.f3100f != -1;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f3095a;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3031b(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f3106l
                if (r4 == r0) goto L_0x001b
                int r0 = p110m0.C5723u.m25265B(r2)
                boolean r0 = r1.m3207s(r4, r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.f3095a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.mo2998e(r2, r3, r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.C0581e.mo3031b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo3032c() {
            if (this.f3095a == null) {
                this.f3107m = false;
            }
            return this.f3107m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public View mo3033d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f3100f == -1) {
                this.f3106l = null;
                this.f3105k = null;
                return null;
            }
            if (this.f3105k == null || !m3208t(view, coordinatorLayout)) {
                m3206n(view, coordinatorLayout);
            }
            return this.f3105k;
        }

        /* renamed from: e */
        public int mo3034e() {
            return this.f3100f;
        }

        /* renamed from: f */
        public Behavior mo3035f() {
            return this.f3095a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo3036g() {
            return this.f3110p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Rect mo3037h() {
            return this.f3111q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo3038i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f3107m;
            if (z) {
                return true;
            }
            Behavior behavior = this.f3095a;
            boolean a = (behavior != null ? behavior.mo2994a(coordinatorLayout, view) : false) | z;
            this.f3107m = a;
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo3039j(int i) {
            if (i == 0) {
                return this.f3108n;
            }
            if (i != 1) {
                return false;
            }
            return this.f3109o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo3040k() {
            this.f3110p = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo3041l(int i) {
            mo3046r(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo3042m() {
            this.f3107m = false;
        }

        /* renamed from: o */
        public void mo3043o(Behavior behavior) {
            Behavior behavior2 = this.f3095a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.mo3003j();
                }
                this.f3095a = behavior;
                this.f3112r = null;
                this.f3096b = true;
                if (behavior != null) {
                    behavior.mo3000g(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo3044p(boolean z) {
            this.f3110p = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo3045q(Rect rect) {
            this.f3111q.set(rect);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo3046r(int i, boolean z) {
            if (i == 0) {
                this.f3108n = z;
            } else if (i == 1) {
                this.f3109o = z;
            }
        }

        C0581e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6395c.f26294e);
            this.f3097c = obtainStyledAttributes.getInteger(C6395c.f26295f, 0);
            this.f3100f = obtainStyledAttributes.getResourceId(C6395c.f26296g, -1);
            this.f3098d = obtainStyledAttributes.getInteger(C6395c.f26297h, 0);
            this.f3099e = obtainStyledAttributes.getInteger(C6395c.f26301l, -1);
            this.f3101g = obtainStyledAttributes.getInt(C6395c.f26300k, 0);
            this.f3102h = obtainStyledAttributes.getInt(C6395c.f26299j, 0);
            int i = C6395c.f26298i;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f3096b = hasValue;
            if (hasValue) {
                this.f3095a = CoordinatorLayout.m3129O(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            Behavior behavior = this.f3095a;
            if (behavior != null) {
                behavior.mo3000g(this);
            }
        }

        public C0581e(C0581e eVar) {
            super(eVar);
        }

        public C0581e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0581e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
