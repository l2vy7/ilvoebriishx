package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.C0296j;
import p016c0.C2618b;
import p072f.C5238a;
import p072f.C5243f;
import p110m0.C5690c0;
import p110m0.C5714l;
import p110m0.C5715m;
import p110m0.C5716n;
import p110m0.C5717o;
import p110m0.C5723u;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements C0407n, C5716n, C5714l, C5715m {

    /* renamed from: G */
    static final int[] f1087G = {C5238a.f22806b, 16842841};

    /* renamed from: A */
    private OverScroller f1088A;

    /* renamed from: B */
    ViewPropertyAnimator f1089B;

    /* renamed from: C */
    final AnimatorListenerAdapter f1090C;

    /* renamed from: D */
    private final Runnable f1091D;

    /* renamed from: E */
    private final Runnable f1092E;

    /* renamed from: F */
    private final C5717o f1093F;

    /* renamed from: b */
    private int f1094b;

    /* renamed from: c */
    private int f1095c = 0;

    /* renamed from: d */
    private ContentFrameLayout f1096d;

    /* renamed from: e */
    ActionBarContainer f1097e;

    /* renamed from: f */
    private C0408o f1098f;

    /* renamed from: g */
    private Drawable f1099g;

    /* renamed from: h */
    private boolean f1100h;

    /* renamed from: i */
    private boolean f1101i;

    /* renamed from: j */
    private boolean f1102j;

    /* renamed from: k */
    private boolean f1103k;

    /* renamed from: l */
    boolean f1104l;

    /* renamed from: m */
    private int f1105m;

    /* renamed from: n */
    private int f1106n;

    /* renamed from: o */
    private final Rect f1107o = new Rect();

    /* renamed from: p */
    private final Rect f1108p = new Rect();

    /* renamed from: q */
    private final Rect f1109q = new Rect();

    /* renamed from: r */
    private final Rect f1110r = new Rect();

    /* renamed from: s */
    private final Rect f1111s = new Rect();

    /* renamed from: t */
    private final Rect f1112t = new Rect();

    /* renamed from: u */
    private final Rect f1113u = new Rect();

    /* renamed from: v */
    private C5690c0 f1114v;

    /* renamed from: w */
    private C5690c0 f1115w;

    /* renamed from: x */
    private C5690c0 f1116x;

    /* renamed from: y */
    private C5690c0 f1117y;

    /* renamed from: z */
    private C0308d f1118z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0305a extends AnimatorListenerAdapter {
        C0305a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1089B = null;
            actionBarOverlayLayout.f1104l = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1089B = null;
            actionBarOverlayLayout.f1104l = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class C0306b implements Runnable {
        C0306b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1380u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1089B = actionBarOverlayLayout.f1097e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1090C);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class C0307c implements Runnable {
        C0307c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1380u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1089B = actionBarOverlayLayout.f1097e.animate().translationY((float) (-ActionBarOverlayLayout.this.f1097e.getHeight())).setListener(ActionBarOverlayLayout.this.f1090C);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0308d {
        /* renamed from: a */
        void mo967a();

        /* renamed from: b */
        void mo968b();

        /* renamed from: c */
        void mo969c(boolean z);

        /* renamed from: d */
        void mo970d();

        /* renamed from: e */
        void mo971e();

        void onWindowVisibilityChanged(int i);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5690c0 c0Var = C5690c0.f24298b;
        this.f1114v = c0Var;
        this.f1115w = c0Var;
        this.f1116x = c0Var;
        this.f1117y = c0Var;
        this.f1090C = new C0305a();
        this.f1091D = new C0306b();
        this.f1092E = new C0307c();
        m1586v(context);
        this.f1093F = new C5717o(this);
    }

    /* renamed from: A */
    private void m1581A() {
        mo1380u();
        this.f1091D.run();
    }

    /* renamed from: B */
    private boolean m1582B(float f) {
        this.f1088A.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1088A.getFinalY() > this.f1097e.getHeight();
    }

    /* renamed from: p */
    private void m1583p() {
        mo1380u();
        this.f1092E.run();
    }

    /* renamed from: q */
    private boolean m1584q(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!z || layoutParams.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            layoutParams.leftMargin = i4;
            z5 = true;
        }
        if (z2 && layoutParams.topMargin != (i3 = rect.top)) {
            layoutParams.topMargin = i3;
            z5 = true;
        }
        if (z4 && layoutParams.rightMargin != (i2 = rect.right)) {
            layoutParams.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || layoutParams.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        layoutParams.bottomMargin = i;
        return true;
    }

    /* renamed from: t */
    private C0408o m1585t(View view) {
        if (view instanceof C0408o) {
            return (C0408o) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: v */
    private void m1586v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1087G);
        boolean z = false;
        this.f1094b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1099g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f1100h = z;
        this.f1088A = new OverScroller(context);
    }

    /* renamed from: x */
    private void m1587x() {
        mo1380u();
        postDelayed(this.f1092E, 600);
    }

    /* renamed from: y */
    private void m1588y() {
        mo1380u();
        postDelayed(this.f1091D, 600);
    }

    /* renamed from: a */
    public void mo1327a(Menu menu, C0296j.C0297a aVar) {
        mo1382z();
        this.f1098f.mo2120a(menu, aVar);
    }

    /* renamed from: b */
    public boolean mo1328b() {
        mo1382z();
        return this.f1098f.mo2121b();
    }

    /* renamed from: c */
    public void mo1329c() {
        mo1382z();
        this.f1098f.mo2122c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public boolean mo1331d() {
        mo1382z();
        return this.f1098f.mo2124d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1099g != null && !this.f1100h) {
            int bottom = this.f1097e.getVisibility() == 0 ? (int) (((float) this.f1097e.getBottom()) + this.f1097e.getTranslationY() + 0.5f) : 0;
            this.f1099g.setBounds(0, bottom, getWidth(), this.f1099g.getIntrinsicHeight() + bottom);
            this.f1099g.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo1333e() {
        mo1382z();
        return this.f1098f.mo2125e();
    }

    /* renamed from: f */
    public boolean mo1334f() {
        mo1382z();
        return this.f1098f.mo2126f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        mo1382z();
        boolean q = m1584q(this.f1097e, rect, true, true, false, true);
        this.f1110r.set(rect);
        C0401l0.m2124a(this, this.f1110r, this.f1107o);
        if (!this.f1111s.equals(this.f1110r)) {
            this.f1111s.set(this.f1110r);
            q = true;
        }
        if (!this.f1108p.equals(this.f1107o)) {
            this.f1108p.set(this.f1107o);
            q = true;
        }
        if (q) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo1336g() {
        mo1382z();
        return this.f1098f.mo2127g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1097e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f1093F.mo22469a();
    }

    public CharSequence getTitle() {
        mo1382z();
        return this.f1098f.getTitle();
    }

    /* renamed from: h */
    public void mo1343h(int i) {
        mo1382z();
        if (i == 2) {
            this.f1098f.mo2150v();
        } else if (i == 5) {
            this.f1098f.mo2151w();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: i */
    public void mo1344i() {
        mo1382z();
        this.f1098f.mo2130h();
    }

    /* renamed from: j */
    public void mo1345j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo1346k(view, i, i2, i3, i4, i5);
    }

    /* renamed from: k */
    public void mo1346k(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: l */
    public boolean mo1347l(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    /* renamed from: m */
    public void mo1348m(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: n */
    public void mo1349n(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: o */
    public void mo1350o(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        mo1382z();
        C5690c0 x = C5690c0.m25113x(windowInsets, this);
        boolean q = m1584q(this.f1097e, new Rect(x.mo22411j(), x.mo22413l(), x.mo22412k(), x.mo22410i()), true, true, false, true);
        C5723u.m25313g(this, x, this.f1107o);
        Rect rect = this.f1107o;
        C5690c0 n = x.mo22415n(rect.left, rect.top, rect.right, rect.bottom);
        this.f1114v = n;
        boolean z = true;
        if (!this.f1115w.equals(n)) {
            this.f1115w = this.f1114v;
            q = true;
        }
        if (!this.f1108p.equals(this.f1107o)) {
            this.f1108p.set(this.f1107o);
        } else {
            z = q;
        }
        if (z) {
            requestLayout();
        }
        return x.mo22400a().mo22402c().mo22401b().mo22422v();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1586v(getContext());
        C5723u.m25324l0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1380u();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = layoutParams.leftMargin + paddingLeft;
                int i7 = layoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        mo1382z();
        measureChildWithMargins(this.f1097e, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f1097e.getLayoutParams();
        int max = Math.max(0, this.f1097e.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.f1097e.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1097e.getMeasuredState());
        boolean z = (C5723u.m25287M(this) & 256) != 0;
        if (z) {
            i3 = this.f1094b;
            if (this.f1102j && this.f1097e.getTabContainer() != null) {
                i3 += this.f1094b;
            }
        } else {
            i3 = this.f1097e.getVisibility() != 8 ? this.f1097e.getMeasuredHeight() : 0;
        }
        this.f1109q.set(this.f1107o);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            this.f1116x = this.f1114v;
        } else {
            this.f1112t.set(this.f1110r);
        }
        if (!this.f1101i && !z) {
            Rect rect = this.f1109q;
            rect.top += i3;
            rect.bottom += 0;
            if (i4 >= 21) {
                this.f1116x = this.f1116x.mo22415n(0, i3, 0, 0);
            }
        } else if (i4 >= 21) {
            this.f1116x = new C5690c0.C5692b(this.f1116x).mo22425c(C2618b.m9121b(this.f1116x.mo22411j(), this.f1116x.mo22413l() + i3, this.f1116x.mo22412k(), this.f1116x.mo22410i() + 0)).mo22423a();
        } else {
            Rect rect2 = this.f1112t;
            rect2.top += i3;
            rect2.bottom += 0;
        }
        m1584q(this.f1096d, this.f1109q, true, true, true, true);
        if (i4 >= 21 && !this.f1117y.equals(this.f1116x)) {
            C5690c0 c0Var = this.f1116x;
            this.f1117y = c0Var;
            C5723u.m25315h(this.f1096d, c0Var);
        } else if (i4 < 21 && !this.f1113u.equals(this.f1112t)) {
            this.f1113u.set(this.f1112t);
            this.f1096d.mo1695a(this.f1112t);
        }
        measureChildWithMargins(this.f1096d, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f1096d.getLayoutParams();
        int max3 = Math.max(max, this.f1096d.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.f1096d.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1096d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1103k || !z) {
            return false;
        }
        if (m1582B(f2)) {
            m1583p();
        } else {
            m1581A();
        }
        this.f1104l = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1105m + i2;
        this.f1105m = i5;
        setActionBarHideOffset(i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1093F.mo22470b(view, view2, i);
        this.f1105m = getActionBarHideOffset();
        mo1380u();
        C0308d dVar = this.f1118z;
        if (dVar != null) {
            dVar.mo971e();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1097e.getVisibility() != 0) {
            return false;
        }
        return this.f1103k;
    }

    public void onStopNestedScroll(View view) {
        if (this.f1103k && !this.f1104l) {
            if (this.f1105m <= this.f1097e.getHeight()) {
                m1588y();
            } else {
                m1587x();
            }
        }
        C0308d dVar = this.f1118z;
        if (dVar != null) {
            dVar.mo968b();
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo1382z();
        int i2 = this.f1106n ^ i;
        this.f1106n = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        C0308d dVar = this.f1118z;
        if (dVar != null) {
            dVar.mo969c(!z);
            if (z2 || !z) {
                this.f1118z.mo967a();
            } else {
                this.f1118z.mo970d();
            }
        }
        if ((i2 & 256) != 0 && this.f1118z != null) {
            C5723u.m25324l0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1095c = i;
        C0308d dVar = this.f1118z;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: s */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i) {
        mo1380u();
        this.f1097e.setTranslationY((float) (-Math.max(0, Math.min(i, this.f1097e.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0308d dVar) {
        this.f1118z = dVar;
        if (getWindowToken() != null) {
            this.f1118z.onWindowVisibilityChanged(this.f1095c);
            int i = this.f1106n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C5723u.m25324l0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1102j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1103k) {
            this.f1103k = z;
            if (!z) {
                mo1380u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo1382z();
        this.f1098f.setIcon(i);
    }

    public void setLogo(int i) {
        mo1382z();
        this.f1098f.mo2136n(i);
    }

    public void setOverlayMode(boolean z) {
        this.f1101i = z;
        this.f1100h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo1382z();
        this.f1098f.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo1382z();
        this.f1098f.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo1380u() {
        removeCallbacks(this.f1091D);
        removeCallbacks(this.f1092E);
        ViewPropertyAnimator viewPropertyAnimator = this.f1089B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: w */
    public boolean mo1381w() {
        return this.f1101i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo1382z() {
        if (this.f1096d == null) {
            this.f1096d = (ContentFrameLayout) findViewById(C5243f.f22915b);
            this.f1097e = (ActionBarContainer) findViewById(C5243f.f22916c);
            this.f1098f = m1585t(findViewById(C5243f.f22914a));
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        mo1382z();
        this.f1098f.setIcon(drawable);
    }
}
