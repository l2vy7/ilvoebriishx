package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.C0600b;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import p062d0.C5135a;
import p110m0.C5682a;
import p110m0.C5705d;
import p110m0.C5723u;
import p116n0.C5771c;
import p134q0.C5931c;

public class DrawerLayout extends ViewGroup {

    /* renamed from: M */
    private static final int[] f3264M = {16843828};

    /* renamed from: N */
    static final int[] f3265N = {16842931};

    /* renamed from: O */
    static final boolean f3266O;

    /* renamed from: P */
    private static final boolean f3267P;

    /* renamed from: A */
    private Drawable f3268A;

    /* renamed from: B */
    private CharSequence f3269B;

    /* renamed from: C */
    private CharSequence f3270C;

    /* renamed from: D */
    private Object f3271D;

    /* renamed from: E */
    private boolean f3272E;

    /* renamed from: F */
    private Drawable f3273F;

    /* renamed from: G */
    private Drawable f3274G;

    /* renamed from: H */
    private Drawable f3275H;

    /* renamed from: I */
    private Drawable f3276I;

    /* renamed from: J */
    private final ArrayList<View> f3277J;

    /* renamed from: K */
    private Rect f3278K;

    /* renamed from: L */
    private Matrix f3279L;

    /* renamed from: b */
    private final C0634c f3280b;

    /* renamed from: c */
    private float f3281c;

    /* renamed from: d */
    private int f3282d;

    /* renamed from: e */
    private int f3283e;

    /* renamed from: f */
    private float f3284f;

    /* renamed from: g */
    private Paint f3285g;

    /* renamed from: h */
    private final C5931c f3286h;

    /* renamed from: i */
    private final C5931c f3287i;

    /* renamed from: j */
    private final C0636e f3288j;

    /* renamed from: k */
    private final C0636e f3289k;

    /* renamed from: l */
    private int f3290l;

    /* renamed from: m */
    private boolean f3291m;

    /* renamed from: n */
    private boolean f3292n;

    /* renamed from: o */
    private int f3293o;

    /* renamed from: p */
    private int f3294p;

    /* renamed from: q */
    private int f3295q;

    /* renamed from: r */
    private int f3296r;

    /* renamed from: s */
    private boolean f3297s;

    /* renamed from: t */
    private boolean f3298t;

    /* renamed from: u */
    private C0635d f3299u;

    /* renamed from: v */
    private List<C0635d> f3300v;

    /* renamed from: w */
    private float f3301w;

    /* renamed from: x */
    private float f3302x;

    /* renamed from: y */
    private Drawable f3303y;

    /* renamed from: z */
    private Drawable f3304z;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    class C0632a implements View.OnApplyWindowInsetsListener {
        C0632a() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).mo3251P(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    class C0633b extends C5682a {

        /* renamed from: d */
        private final Rect f3315d = new Rect();

        C0633b() {
        }

        /* renamed from: n */
        private void m3529n(C5771c cVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m3492y(childAt)) {
                    cVar.mo22626c(childAt);
                }
            }
        }

        /* renamed from: o */
        private void m3530o(C5771c cVar, C5771c cVar2) {
            Rect rect = this.f3315d;
            cVar2.mo22643m(rect);
            cVar.mo22619X(rect);
            cVar2.mo22645n(rect);
            cVar.mo22620Y(rect);
            cVar.mo22605F0(cVar2.mo22614N());
            cVar.mo22651q0(cVar2.mo22660v());
            cVar.mo22627c0(cVar2.mo22649p());
            cVar.mo22634g0(cVar2.mo22652r());
            cVar.mo22635h0(cVar2.mo22604F());
            cVar.mo22629d0(cVar2.mo22602E());
            cVar.mo22639j0(cVar2.mo22606G());
            cVar.mo22641k0(cVar2.mo22608H());
            cVar.mo22618V(cVar2.mo22596B());
            cVar.mo22666y0(cVar2.mo22612L());
            cVar.mo22646n0(cVar2.mo22609I());
            cVar.mo22622a(cVar2.mo22640k());
        }

        /* renamed from: a */
        public boolean mo3313a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence q;
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo3313a(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View n = DrawerLayout.this.mo3278n();
            if (n == null || (q = DrawerLayout.this.mo3293q(DrawerLayout.this.mo3294r(n))) == null) {
                return true;
            }
            text.add(q);
            return true;
        }

        /* renamed from: f */
        public void mo3196f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3196f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        /* renamed from: g */
        public void mo3197g(View view, C5771c cVar) {
            if (DrawerLayout.f3266O) {
                super.mo3197g(view, cVar);
            } else {
                C5771c Q = C5771c.m25535Q(cVar);
                super.mo3197g(view, Q);
                cVar.mo22595A0(view);
                ViewParent H = C5723u.m25277H(view);
                if (H instanceof View) {
                    cVar.mo22655s0((View) H);
                }
                m3530o(cVar, Q);
                Q.mo22616S();
                m3529n(cVar, (ViewGroup) view);
            }
            cVar.mo22627c0(DrawerLayout.class.getName());
            cVar.mo22639j0(false);
            cVar.mo22641k0(false);
            cVar.mo22617T(C5771c.C5772a.f24472e);
            cVar.mo22617T(C5771c.C5772a.f24473f);
        }

        /* renamed from: i */
        public boolean mo3314i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f3266O || DrawerLayout.m3492y(view)) {
                return super.mo3314i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    static final class C0634c extends C5682a {
        C0634c() {
        }

        /* renamed from: g */
        public void mo3197g(View view, C5771c cVar) {
            super.mo3197g(view, cVar);
            if (!DrawerLayout.m3492y(view)) {
                cVar.mo22655s0((View) null);
            }
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public interface C0635d {
        /* renamed from: a */
        void mo3315a(View view);

        /* renamed from: b */
        void mo3316b(View view);

        /* renamed from: c */
        void mo3317c(int i);

        /* renamed from: d */
        void mo3318d(View view, float f);
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    private class C0636e extends C5931c.C5934c {

        /* renamed from: a */
        private final int f3317a;

        /* renamed from: b */
        private C5931c f3318b;

        /* renamed from: c */
        private final Runnable f3319c = new C0637a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e$a */
        class C0637a implements Runnable {
            C0637a() {
            }

            public void run() {
                C0636e.this.mo3330o();
            }
        }

        C0636e(int i) {
            this.f3317a = i;
        }

        /* renamed from: n */
        private void m3540n() {
            int i = 3;
            if (this.f3317a == 3) {
                i = 5;
            }
            View l = DrawerLayout.this.mo3276l(i);
            if (l != null) {
                DrawerLayout.this.mo3262d(l);
            }
        }

        /* renamed from: a */
        public int mo3319a(View view, int i, int i2) {
            if (DrawerLayout.this.mo3259c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        /* renamed from: b */
        public int mo3320b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo3321d(View view) {
            if (DrawerLayout.this.mo3243C(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: f */
        public void mo3322f(int i, int i2) {
            View view;
            if ((i & 1) == 1) {
                view = DrawerLayout.this.mo3276l(3);
            } else {
                view = DrawerLayout.this.mo3276l(5);
            }
            if (view != null && DrawerLayout.this.mo3292p(view) == 0) {
                this.f3318b.mo22959c(view, i2);
            }
        }

        /* renamed from: g */
        public boolean mo3323g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo3324h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f3319c, 160);
        }

        /* renamed from: i */
        public void mo3325i(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f3307c = false;
            m3540n();
        }

        /* renamed from: j */
        public void mo3326j(int i) {
            DrawerLayout.this.mo3254T(this.f3317a, i, this.f3318b.mo22964w());
        }

        /* renamed from: k */
        public void mo3327k(View view, int i, int i2, int i3, int i4) {
            float f;
            int width = view.getWidth();
            if (DrawerLayout.this.mo3259c(view, 3)) {
                f = (float) (i + width);
            } else {
                f = (float) (DrawerLayout.this.getWidth() - i);
            }
            float f2 = f / ((float) width);
            DrawerLayout.this.mo3253R(view, f2);
            view.setVisibility(f2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        /* renamed from: l */
        public void mo3328l(View view, float f, float f2) {
            int i;
            float s = DrawerLayout.this.mo3297s(view);
            int width = view.getWidth();
            if (DrawerLayout.this.mo3259c(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && s > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && s > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f3318b.mo22953N(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        /* renamed from: m */
        public boolean mo3329m(View view, int i) {
            return DrawerLayout.this.mo3243C(view) && DrawerLayout.this.mo3259c(view, this.f3317a) && DrawerLayout.this.mo3292p(view) == 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo3330o() {
            View view;
            int i;
            int x = this.f3318b.mo22965x();
            int i2 = 0;
            boolean z = this.f3317a == 3;
            if (z) {
                view = DrawerLayout.this.mo3276l(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + x;
            } else {
                view = DrawerLayout.this.mo3276l(5);
                i = DrawerLayout.this.getWidth() - x;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.mo3292p(view) == 0) {
                this.f3318b.mo22955P(view, i, view.getTop());
                ((LayoutParams) view.getLayoutParams()).f3307c = true;
                DrawerLayout.this.invalidate();
                m3540n();
                DrawerLayout.this.mo3258b();
            }
        }

        /* renamed from: p */
        public void mo3331p() {
            DrawerLayout.this.removeCallbacks(this.f3319c);
        }

        /* renamed from: q */
        public void mo3332q(C5931c cVar) {
            this.f3318b = cVar;
        }
    }

    static {
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        f3266O = i >= 19;
        if (i < 21) {
            z = false;
        }
        f3267P = z;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: E */
    private boolean m3480E(float f, float f2, View view) {
        if (this.f3278K == null) {
            this.f3278K = new Rect();
        }
        view.getHitRect(this.f3278K);
        return this.f3278K.contains((int) f, (int) f2);
    }

    /* renamed from: F */
    private boolean m3481F(Drawable drawable, int i) {
        if (drawable == null || !C5135a.m23408h(drawable)) {
            return false;
        }
        C5135a.m23413m(drawable, i);
        return true;
    }

    /* renamed from: M */
    private Drawable m3482M() {
        int B = C5723u.m25265B(this);
        if (B == 0) {
            Drawable drawable = this.f3273F;
            if (drawable != null) {
                m3481F(drawable, B);
                return this.f3273F;
            }
        } else {
            Drawable drawable2 = this.f3274G;
            if (drawable2 != null) {
                m3481F(drawable2, B);
                return this.f3274G;
            }
        }
        return this.f3275H;
    }

    /* renamed from: N */
    private Drawable m3483N() {
        int B = C5723u.m25265B(this);
        if (B == 0) {
            Drawable drawable = this.f3274G;
            if (drawable != null) {
                m3481F(drawable, B);
                return this.f3274G;
            }
        } else {
            Drawable drawable2 = this.f3273F;
            if (drawable2 != null) {
                m3481F(drawable2, B);
                return this.f3273F;
            }
        }
        return this.f3276I;
    }

    /* renamed from: O */
    private void m3484O() {
        if (!f3267P) {
            this.f3304z = m3482M();
            this.f3268A = m3483N();
        }
    }

    /* renamed from: S */
    private void m3485S(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || mo3243C(childAt)) && (!z || childAt != view)) {
                C5723u.m25350y0(childAt, 4);
            } else {
                C5723u.m25350y0(childAt, 1);
            }
        }
    }

    /* renamed from: k */
    private boolean m3486k(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent t = m3487t(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(t);
            t.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* renamed from: t */
    private MotionEvent m3487t(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f3279L == null) {
                this.f3279L = new Matrix();
            }
            matrix.invert(this.f3279L);
            obtain.transform(this.f3279L);
        }
        return obtain;
    }

    /* renamed from: u */
    static String m3488u(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: v */
    private static boolean m3489v(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    private boolean m3490w() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).f3307c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    private boolean m3491x() {
        return mo3278n() != null;
    }

    /* renamed from: y */
    static boolean m3492y(View view) {
        return (C5723u.m25351z(view) == 4 || C5723u.m25351z(view) == 2) ? false : true;
    }

    /* renamed from: A */
    public boolean mo3241A(int i) {
        View l = mo3276l(i);
        if (l != null) {
            return mo3242B(l);
        }
        return false;
    }

    /* renamed from: B */
    public boolean mo3242B(View view) {
        if (mo3243C(view)) {
            return (((LayoutParams) view.getLayoutParams()).f3308d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo3243C(View view) {
        int b = C5705d.m25206b(((LayoutParams) view.getLayoutParams()).f3305a, C5723u.m25265B(view));
        return ((b & 3) == 0 && (b & 5) == 0) ? false : true;
    }

    /* renamed from: D */
    public boolean mo3244D(View view) {
        if (mo3243C(view)) {
            return ((LayoutParams) view.getLayoutParams()).f3306b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo3245G(View view, float f) {
        float s = mo3297s(view);
        float width = (float) view.getWidth();
        int i = ((int) (width * f)) - ((int) (s * width));
        if (!mo3259c(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        mo3253R(view, f);
    }

    /* renamed from: H */
    public void mo3246H(int i) {
        mo3247I(i, true);
    }

    /* renamed from: I */
    public void mo3247I(int i, boolean z) {
        View l = mo3276l(i);
        if (l != null) {
            mo3249K(l, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m3488u(i));
    }

    /* renamed from: J */
    public void mo3248J(View view) {
        mo3249K(view, true);
    }

    /* renamed from: K */
    public void mo3249K(View view, boolean z) {
        if (mo3243C(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f3292n) {
                layoutParams.f3306b = 1.0f;
                layoutParams.f3308d = 1;
                m3485S(view, true);
            } else if (z) {
                layoutParams.f3308d |= 2;
                if (mo3259c(view, 3)) {
                    this.f3286h.mo22955P(view, 0, view.getTop());
                } else {
                    this.f3287i.mo22955P(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                mo3245G(view, 1.0f);
                mo3254T(layoutParams.f3305a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: L */
    public void mo3250L(C0635d dVar) {
        List<C0635d> list;
        if (dVar != null && (list = this.f3300v) != null) {
            list.remove(dVar);
        }
    }

    /* renamed from: P */
    public void mo3251P(Object obj, boolean z) {
        this.f3271D = obj;
        this.f3272E = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* renamed from: Q */
    public void mo3252Q(int i, int i2) {
        View l;
        int b = C5705d.m25206b(i2, C5723u.m25265B(this));
        if (i2 == 3) {
            this.f3293o = i;
        } else if (i2 == 5) {
            this.f3294p = i;
        } else if (i2 == 8388611) {
            this.f3295q = i;
        } else if (i2 == 8388613) {
            this.f3296r = i;
        }
        if (i != 0) {
            (b == 3 ? this.f3286h : this.f3287i).mo22958b();
        }
        if (i == 1) {
            View l2 = mo3276l(b);
            if (l2 != null) {
                mo3262d(l2);
            }
        } else if (i == 2 && (l = mo3276l(b)) != null) {
            mo3248J(l);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo3253R(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.f3306b) {
            layoutParams.f3306b = f;
            mo3275j(view, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo3254T(int i, int i2, View view) {
        int A = this.f3286h.mo22945A();
        int A2 = this.f3287i.mo22945A();
        int i3 = 2;
        if (A == 1 || A2 == 1) {
            i3 = 1;
        } else if (!(A == 2 || A2 == 2)) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f = ((LayoutParams) view.getLayoutParams()).f3306b;
            if (f == 0.0f) {
                mo3273h(view);
            } else if (f == 1.0f) {
                mo3274i(view);
            }
        }
        if (i3 != this.f3290l) {
            this.f3290l = i3;
            List<C0635d> list = this.f3300v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3300v.get(size).mo3317c(i3);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3255a(C0635d dVar) {
        if (dVar != null) {
            if (this.f3300v == null) {
                this.f3300v = new ArrayList();
            }
            this.f3300v.add(dVar);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!mo3243C(childAt)) {
                    this.f3277J.add(childAt);
                } else if (mo3242B(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f3277J.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.f3277J.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f3277J.clear();
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (mo3277m() != null || mo3243C(view)) {
            C5723u.m25350y0(view, 4);
        } else {
            C5723u.m25350y0(view, 1);
        }
        if (!f3266O) {
            C5723u.m25330o0(view, this.f3280b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3258b() {
        if (!this.f3298t) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f3298t = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3259c(View view, int i) {
        return (mo3294r(view) & i) == i;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f3306b);
        }
        this.f3284f = f;
        boolean n = this.f3286h.mo22962n(true);
        boolean n2 = this.f3287i.mo22962n(true);
        if (n || n2) {
            C5723u.m25310e0(this);
        }
    }

    /* renamed from: d */
    public void mo3262d(View view) {
        mo3265e(view, true);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f3284f <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (m3480E(x, y, childAt) && !mo3305z(childAt) && m3486k(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean z = mo3305z(view2);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (z) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view2 && childAt.getVisibility() == 0 && m3489v(childAt) && mo3243C(childAt) && childAt.getHeight() >= height) {
                    if (mo3259c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f3284f;
        if (f > 0.0f && z) {
            int i4 = this.f3283e;
            this.f3285g.setColor((i4 & 16777215) | (((int) (((float) ((-16777216 & i4) >>> 24)) * f)) << 24));
            canvas.drawRect((float) i, 0.0f, (float) width, (float) getHeight(), this.f3285g);
        } else if (this.f3304z != null && mo3259c(view2, 3)) {
            int intrinsicWidth = this.f3304z.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f3286h.mo22965x()), 1.0f));
            this.f3304z.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f3304z.setAlpha((int) (max * 255.0f));
            this.f3304z.draw(canvas);
        } else if (this.f3268A != null && mo3259c(view2, 5)) {
            int intrinsicWidth2 = this.f3268A.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f3287i.mo22965x()), 1.0f));
            this.f3268A.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f3268A.setAlpha((int) (max2 * 255.0f));
            this.f3268A.draw(canvas);
        }
        return drawChild;
    }

    /* renamed from: e */
    public void mo3265e(View view, boolean z) {
        if (mo3243C(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f3292n) {
                layoutParams.f3306b = 0.0f;
                layoutParams.f3308d = 0;
            } else if (z) {
                layoutParams.f3308d |= 4;
                if (mo3259c(view, 3)) {
                    this.f3286h.mo22955P(view, -view.getWidth(), view.getTop());
                } else {
                    this.f3287i.mo22955P(view, getWidth(), view.getTop());
                }
            } else {
                mo3245G(view, 0.0f);
                mo3254T(layoutParams.f3305a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: f */
    public void mo3266f() {
        mo3267g(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3267g(boolean z) {
        boolean z2;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (mo3243C(childAt) && (!z || layoutParams.f3307c)) {
                int width = childAt.getWidth();
                if (mo3259c(childAt, 3)) {
                    z2 = this.f3286h.mo22955P(childAt, -width, childAt.getTop());
                } else {
                    z2 = this.f3287i.mo22955P(childAt, getWidth(), childAt.getTop());
                }
                z3 |= z2;
                layoutParams.f3307c = false;
            }
        }
        this.f3288j.mo3331p();
        this.f3289k.mo3331p();
        if (z3) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (f3267P) {
            return this.f3281c;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f3303y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3273h(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f3308d & 1) == 1) {
            layoutParams.f3308d = 0;
            List<C0635d> list = this.f3300v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3300v.get(size).mo3316b(view);
                }
            }
            m3485S(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3274i(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f3308d & 1) == 0) {
            layoutParams.f3308d = 1;
            List<C0635d> list = this.f3300v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3300v.get(size).mo3315a(view);
                }
            }
            m3485S(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3275j(View view, float f) {
        List<C0635d> list = this.f3300v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3300v.get(size).mo3318d(view, f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public View mo3276l(int i) {
        int b = C5705d.m25206b(i, C5723u.m25265B(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo3294r(childAt) & 7) == b) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public View mo3277m() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f3308d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public View mo3278n() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo3243C(childAt) && mo3244D(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: o */
    public int mo3279o(int i) {
        int B = C5723u.m25265B(this);
        if (i == 3) {
            int i2 = this.f3293o;
            if (i2 != 3) {
                return i2;
            }
            int i3 = B == 0 ? this.f3295q : this.f3296r;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 5) {
            int i4 = this.f3294p;
            if (i4 != 3) {
                return i4;
            }
            int i5 = B == 0 ? this.f3296r : this.f3295q;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        } else if (i == 8388611) {
            int i6 = this.f3295q;
            if (i6 != 3) {
                return i6;
            }
            int i7 = B == 0 ? this.f3293o : this.f3294p;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.f3296r;
            if (i8 != 3) {
                return i8;
            }
            int i9 = B == 0 ? this.f3294p : this.f3293o;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3292n = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3292n = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r4.f3271D;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.f3272E
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r4.f3303y
            if (r0 == 0) goto L_0x002e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x001d
            java.lang.Object r0 = r4.f3271D
            if (r0 == 0) goto L_0x001d
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r1 = r4.f3303y
            int r3 = r4.getWidth()
            r1.setBounds(r2, r2, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.f3303y
            r0.draw(r5)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        r7 = r6.f3286h.mo22963u((int) r0, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            q0.c r1 = r6.f3286h
            boolean r1 = r1.mo22954O(r7)
            q0.c r2 = r6.f3287i
            boolean r2 = r2.mo22954O(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x003a
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0038
        L_0x001e:
            q0.c r7 = r6.f3286h
            boolean r7 = r7.mo22960e(r4)
            if (r7 == 0) goto L_0x0038
            androidx.drawerlayout.widget.DrawerLayout$e r7 = r6.f3288j
            r7.mo3331p()
            androidx.drawerlayout.widget.DrawerLayout$e r7 = r6.f3289k
            r7.mo3331p()
            goto L_0x0038
        L_0x0031:
            r6.mo3267g(r2)
            r6.f3297s = r3
            r6.f3298t = r3
        L_0x0038:
            r7 = 0
            goto L_0x0064
        L_0x003a:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f3301w = r0
            r6.f3302x = r7
            float r4 = r6.f3284f
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005f
            q0.c r4 = r6.f3286h
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.mo22963u(r0, r7)
            if (r7 == 0) goto L_0x005f
            boolean r7 = r6.mo3305z(r7)
            if (r7 == 0) goto L_0x005f
            r7 = 1
            goto L_0x0060
        L_0x005f:
            r7 = 0
        L_0x0060:
            r6.f3297s = r3
            r6.f3298t = r3
        L_0x0064:
            if (r1 != 0) goto L_0x0074
            if (r7 != 0) goto L_0x0074
            boolean r7 = r6.m3490w()
            if (r7 != 0) goto L_0x0074
            boolean r7 = r6.f3298t
            if (r7 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r2 = 0
        L_0x0074:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m3491x()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View n = mo3278n();
        if (n != null && mo3292p(n) == 0) {
            mo3266f();
        }
        return n != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        this.f3291m = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (mo3305z(childAt)) {
                    int i8 = layoutParams.leftMargin;
                    childAt.layout(i8, layoutParams.topMargin, childAt.getMeasuredWidth() + i8, layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (mo3259c(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.f3306b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i9 = i6 - ((int) (layoutParams.f3306b * f3));
                        f = ((float) (i6 - i9)) / f3;
                        i5 = i9;
                    }
                    boolean z2 = f != layoutParams.f3306b;
                    int i10 = layoutParams.f3305a & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = layoutParams.topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = layoutParams.bottomMargin;
                            if (i14 > i11 - i15) {
                                i12 = (i11 - i15) - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = layoutParams.topMargin;
                        childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i5, (i17 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - layoutParams.bottomMargin);
                    }
                    if (z2) {
                        mo3253R(childAt, f);
                    }
                    int i18 = layoutParams.f3306b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
        }
        this.f3291m = false;
        this.f3292n = false;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f3271D != null && C5723u.m25349y(this);
        int B = C5723u.m25265B(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int b = C5705d.m25206b(layoutParams.f3305a, B);
                    if (C5723u.m25349y(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f3271D;
                            if (b == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (b == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f3271D;
                        if (b == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        layoutParams.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        layoutParams.topMargin = windowInsets2.getSystemWindowInsetTop();
                        layoutParams.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        layoutParams.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (mo3305z(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else if (mo3243C(childAt)) {
                    if (f3267P) {
                        float w = C5723u.m25345w(childAt);
                        float f = this.f3281c;
                        if (w != f) {
                            C5723u.m25344v0(childAt, f);
                        }
                    }
                    int r = mo3294r(childAt) & 7;
                    boolean z4 = r == 3;
                    if ((!z4 || !z2) && (z4 || !z3)) {
                        if (z4) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f3282d + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), ViewGroup.getChildMeasureSpec(i2, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                        i4++;
                        i3 = 0;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m3488u(r) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i5 = i;
            int i6 = i2;
            i4++;
            i3 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View l;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3233a());
        int i = savedState.f3309d;
        if (!(i == 0 || (l = mo3276l(i)) == null)) {
            mo3248J(l);
        }
        int i2 = savedState.f3310e;
        if (i2 != 3) {
            mo3252Q(i2, 3);
        }
        int i3 = savedState.f3311f;
        if (i3 != 3) {
            mo3252Q(i3, 5);
        }
        int i4 = savedState.f3312g;
        if (i4 != 3) {
            mo3252Q(i4, 8388611);
        }
        int i5 = savedState.f3313h;
        if (i5 != 3) {
            mo3252Q(i5, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        m3484O();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.f3308d;
            boolean z = true;
            boolean z2 = i2 == 1;
            if (i2 != 2) {
                z = false;
            }
            if (z2 || z) {
                savedState.f3309d = layoutParams.f3305a;
            } else {
                i++;
            }
        }
        savedState.f3310e = this.f3293o;
        savedState.f3311f = this.f3294p;
        savedState.f3312g = this.f3295q;
        savedState.f3313h = this.f3296r;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View m;
        this.f3286h.mo22949F(motionEvent);
        this.f3287i.mo22949F(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f3301w = x;
            this.f3302x = y;
            this.f3297s = false;
            this.f3298t = false;
        } else if (action == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            View u = this.f3286h.mo22963u((int) x2, (int) y2);
            if (u != null && mo3305z(u)) {
                float f = x2 - this.f3301w;
                float f2 = y2 - this.f3302x;
                int z2 = this.f3286h.mo22966z();
                if (!((f * f) + (f2 * f2) >= ((float) (z2 * z2)) || (m = mo3277m()) == null || mo3292p(m) == 2)) {
                    z = false;
                    mo3267g(z);
                    this.f3297s = false;
                }
            }
            z = true;
            mo3267g(z);
            this.f3297s = false;
        } else if (action == 3) {
            mo3267g(true);
            this.f3297s = false;
            this.f3298t = false;
        }
        return true;
    }

    /* renamed from: p */
    public int mo3292p(View view) {
        if (mo3243C(view)) {
            return mo3279o(((LayoutParams) view.getLayoutParams()).f3305a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: q */
    public CharSequence mo3293q(int i) {
        int b = C5705d.m25206b(i, C5723u.m25265B(this));
        if (b == 3) {
            return this.f3269B;
        }
        if (b == 5) {
            return this.f3270C;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo3294r(View view) {
        return C5705d.m25206b(((LayoutParams) view.getLayoutParams()).f3305a, C5723u.m25265B(this));
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f3297s = z;
        if (z) {
            mo3267g(true);
        }
    }

    public void requestLayout() {
        if (!this.f3291m) {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public float mo3297s(View view) {
        return ((LayoutParams) view.getLayoutParams()).f3306b;
    }

    public void setDrawerElevation(float f) {
        this.f3281c = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (mo3243C(childAt)) {
                C5723u.m25344v0(childAt, this.f3281c);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C0635d dVar) {
        C0635d dVar2 = this.f3299u;
        if (dVar2 != null) {
            mo3250L(dVar2);
        }
        if (dVar != null) {
            mo3255a(dVar);
        }
        this.f3299u = dVar;
    }

    public void setDrawerLockMode(int i) {
        mo3252Q(i, 3);
        mo3252Q(i, 5);
    }

    public void setScrimColor(int i) {
        this.f3283e = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f3303y = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f3303y = new ColorDrawable(i);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo3305z(View view) {
        return ((LayoutParams) view.getLayoutParams()).f3305a == 0;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3280b = new C0634c();
        this.f3283e = -1728053248;
        this.f3285g = new Paint();
        this.f3292n = true;
        this.f3293o = 3;
        this.f3294p = 3;
        this.f3295q = 3;
        this.f3296r = 3;
        this.f3273F = null;
        this.f3274G = null;
        this.f3275H = null;
        this.f3276I = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f3282d = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        C0636e eVar = new C0636e(3);
        this.f3288j = eVar;
        C0636e eVar2 = new C0636e(5);
        this.f3289k = eVar2;
        C5931c o = C5931c.m26182o(this, 1.0f, eVar);
        this.f3286h = o;
        o.mo22951L(1);
        o.mo22952M(f2);
        eVar.mo3332q(o);
        C5931c o2 = C5931c.m26182o(this, 1.0f, eVar2);
        this.f3287i = o2;
        o2.mo22951L(2);
        o2.mo22952M(f2);
        eVar2.mo3332q(o2);
        setFocusableInTouchMode(true);
        C5723u.m25350y0(this, 1);
        C5723u.m25330o0(this, new C0633b());
        setMotionEventSplittingEnabled(false);
        if (C5723u.m25349y(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new C0632a());
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f3264M);
                try {
                    this.f3303y = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f3303y = null;
            }
        }
        this.f3281c = f * 10.0f;
        this.f3277J = new ArrayList<>();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setStatusBarBackground(int i) {
        this.f3303y = i != 0 ? C0600b.m3294f(getContext(), i) : null;
        invalidate();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f3305a = 0;

        /* renamed from: b */
        float f3306b;

        /* renamed from: c */
        boolean f3307c;

        /* renamed from: d */
        int f3308d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f3265N);
            this.f3305a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f3305a = layoutParams.f3305a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0631a();

        /* renamed from: d */
        int f3309d = 0;

        /* renamed from: e */
        int f3310e;

        /* renamed from: f */
        int f3311f;

        /* renamed from: g */
        int f3312g;

        /* renamed from: h */
        int f3313h;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
        static class C0631a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0631a() {
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
            this.f3309d = parcel.readInt();
            this.f3310e = parcel.readInt();
            this.f3311f = parcel.readInt();
            this.f3312g = parcel.readInt();
            this.f3313h = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3309d);
            parcel.writeInt(this.f3310e);
            parcel.writeInt(this.f3311f);
            parcel.writeInt(this.f3312g);
            parcel.writeInt(this.f3313h);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
