package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p062d0.C5135a;
import p078g.C5264a;
import p079g0.C5266a;
import p104l0.C5643c;
import p110m0.C5690c0;
import p110m0.C5712j;
import p110m0.C5718p;
import p110m0.C5723u;
import p116n0.C5771c;
import p116n0.C5781f;
import p193c6.C6522b;
import p193c6.C6524d;
import p193c6.C6527g;
import p193c6.C6531k;
import p193c6.C6532l;
import p199d6.C10493a;
import p242p6.C10889h;
import p242p6.C10893i;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.C0578b {

    /* renamed from: s */
    private static final int f47121s = C6531k.Widget_Design_AppBarLayout;

    /* renamed from: b */
    private int f47122b;

    /* renamed from: c */
    private int f47123c;

    /* renamed from: d */
    private int f47124d;

    /* renamed from: e */
    private int f47125e;

    /* renamed from: f */
    private boolean f47126f;

    /* renamed from: g */
    private int f47127g;

    /* renamed from: h */
    private C5690c0 f47128h;

    /* renamed from: i */
    private List<C10013c> f47129i;

    /* renamed from: j */
    private boolean f47130j;

    /* renamed from: k */
    private boolean f47131k;

    /* renamed from: l */
    private boolean f47132l;

    /* renamed from: m */
    private boolean f47133m;

    /* renamed from: n */
    private int f47134n;

    /* renamed from: o */
    private WeakReference<View> f47135o;

    /* renamed from: p */
    private ValueAnimator f47136p;

    /* renamed from: q */
    private int[] f47137q;

    /* renamed from: r */
    private Drawable f47138r;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        /* renamed from: E */
        public /* bridge */ /* synthetic */ int mo39580E() {
            return super.mo39580E();
        }

        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean mo39581G(int i) {
            return super.mo39581G(i);
        }

        /* renamed from: g0 */
        public /* bridge */ /* synthetic */ boolean mo39564g0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.mo3005l(coordinatorLayout, appBarLayout, i);
        }

        /* renamed from: h0 */
        public /* bridge */ /* synthetic */ boolean mo39565h0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo3006m(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        /* renamed from: i0 */
        public /* bridge */ /* synthetic */ void mo39566i0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo3010q(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        /* renamed from: j0 */
        public /* bridge */ /* synthetic */ void mo39567j0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.mo3013t(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        /* renamed from: k0 */
        public /* bridge */ /* synthetic */ void mo39568k0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo3017x(coordinatorLayout, appBarLayout, parcelable);
        }

        /* renamed from: l0 */
        public /* bridge */ /* synthetic */ Parcelable mo39569l0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo3018y(coordinatorLayout, appBarLayout);
        }

        /* renamed from: m0 */
        public /* bridge */ /* synthetic */ boolean mo39570m0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.mo2990A(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        /* renamed from: n0 */
        public /* bridge */ /* synthetic */ void mo39571n0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.mo2992C(coordinatorLayout, appBarLayout, view, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        /* renamed from: R */
        private static int m45678R(AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior f = ((CoordinatorLayout.C0581e) appBarLayout.getLayoutParams()).mo3035f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).mo39557M();
            }
            return 0;
        }

        /* renamed from: S */
        private void m45679S(View view, View view2) {
            CoordinatorLayout.Behavior f = ((CoordinatorLayout.C0581e) view2.getLayoutParams()).mo3035f();
            if (f instanceof BaseBehavior) {
                C5723u.m25300Z(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f).f47139k) + mo39674M()) - mo39672I(view2));
            }
        }

        /* renamed from: T */
        private void m45680T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo39529l()) {
                    appBarLayout.mo39551u(appBarLayout.mo39553w(view));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public float mo39586J(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = m45678R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) R) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public int mo39587L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo39587L(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public AppBarLayout mo39585H(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: e */
        public boolean mo2998e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: h */
        public boolean mo3001h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m45679S(view, view2);
            m45680T(view, view2);
            return false;
        }

        /* renamed from: i */
        public void mo3002i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C5723u.m25318i0(coordinatorLayout, C5771c.C5772a.f24484q.mo22669b());
                C5723u.m25318i0(coordinatorLayout, C5771c.C5772a.f24485r.mo22669b());
            }
        }

        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo3005l(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo3005l(coordinatorLayout, view, i);
        }

        /* renamed from: m */
        public /* bridge */ /* synthetic */ boolean mo3006m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo3006m(coordinatorLayout, view, i, i2, i3, i4);
        }

        /* renamed from: w */
        public boolean mo3016w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout Q = mo39585H(coordinatorLayout.mo2985v(view));
            if (Q != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f47210d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    Q.mo39540r(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6532l.f26961g6);
            mo39675O(obtainStyledAttributes.getDimensionPixelSize(C6532l.f26972h6, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    class C10011a implements C5718p {
        C10011a() {
        }

        /* renamed from: a */
        public C5690c0 mo870a(View view, C5690c0 c0Var) {
            return AppBarLayout.this.mo39531n(c0Var);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    class C10012b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C10889h f47163a;

        C10012b(C10889h hVar) {
            this.f47163a = hVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f47163a.mo43090Z(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public interface C10013c<T extends AppBarLayout> {
        /* renamed from: a */
        void mo39590a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public interface C10014d extends C10013c<AppBarLayout> {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.appBarLayoutStyle);
    }

    /* renamed from: c */
    private void m45592c() {
        WeakReference<View> weakReference = this.f47135o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f47135o = null;
    }

    /* renamed from: d */
    private View m45593d(View view) {
        int i;
        if (this.f47135o == null && (i = this.f47134n) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f47134n);
            }
            if (findViewById != null) {
                this.f47135o = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f47135o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: i */
    private boolean m45594i() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).mo39584c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m45595k() {
        this.f47123c = -1;
        this.f47124d = -1;
        this.f47125e = -1;
    }

    /* renamed from: s */
    private void m45596s(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f47127g = i2 | i;
        requestLayout();
    }

    /* renamed from: t */
    private boolean m45597t(boolean z) {
        if (this.f47131k == z) {
            return false;
        }
        this.f47131k = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: v */
    private boolean m45598v() {
        return this.f47138r != null && getTopInset() > 0;
    }

    /* renamed from: x */
    private boolean m45599x() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || C5723u.m25349y(childAt)) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private void m45600y(C10889h hVar, boolean z) {
        float dimension = getResources().getDimension(C6524d.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f47136p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
        this.f47136p = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(C6527g.app_bar_elevation_anim_duration));
        this.f47136p.setInterpolator(C10493a.f49008a);
        this.f47136p.addUpdateListener(new C10012b(hVar));
        this.f47136p.start();
    }

    /* renamed from: z */
    private void m45601z() {
        setWillNotDraw(!m45598v());
    }

    /* renamed from: a */
    public void mo39506a(C10013c cVar) {
        if (this.f47129i == null) {
            this.f47129i = new ArrayList();
        }
        if (cVar != null && !this.f47129i.contains(cVar)) {
            this.f47129i.add(cVar);
        }
    }

    /* renamed from: b */
    public void mo39507b(C10014d dVar) {
        mo39506a(dVar);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m45598v()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f47122b));
            this.f47138r.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f47138r;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    /* renamed from: f */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i;
        int C;
        int i2 = this.f47124d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.f47160a;
            if ((i4 & 5) == 5) {
                int i5 = layoutParams.topMargin + layoutParams.bottomMargin;
                if ((i4 & 8) != 0) {
                    C = C5723u.m25267C(childAt);
                } else if ((i4 & 2) != 0) {
                    C = measuredHeight - C5723u.m25267C(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C5723u.m25349y(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + C;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f47124d = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i = this.f47125e;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int i4 = layoutParams.f47160a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C5723u.m25267C(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f47125e = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f47134n;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int C = C5723u.m25267C(this);
        if (C == 0) {
            int childCount = getChildCount();
            C = childCount >= 1 ? C5723u.m25267C(getChildAt(childCount - 1)) : 0;
            if (C == 0) {
                return getHeight() / 3;
            }
        }
        return (C * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f47127g;
    }

    public Drawable getStatusBarForeground() {
        return this.f47138r;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        C5690c0 c0Var = this.f47128h;
        if (c0Var != null) {
            return c0Var.mo22413l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f47123c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.f47160a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin;
            if (i2 == 0 && C5723u.m25349y(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= C5723u.m25267C(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f47123c = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo39527h() {
        return this.f47126f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo39528j() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: l */
    public boolean mo39529l() {
        return this.f47133m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo39530m(int i) {
        this.f47122b = i;
        if (!willNotDraw()) {
            C5723u.m25310e0(this);
        }
        List<C10013c> list = this.f47129i;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C10013c cVar = this.f47129i.get(i2);
                if (cVar != null) {
                    cVar.mo39590a(this, i);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C5690c0 mo39531n(C5690c0 c0Var) {
        C5690c0 c0Var2 = C5723u.m25349y(this) ? c0Var : null;
        if (!C5643c.m24954a(this.f47128h, c0Var2)) {
            this.f47128h = c0Var2;
            m45601z();
            requestLayout();
        }
        return c0Var;
    }

    /* renamed from: o */
    public void mo39532o(C10013c cVar) {
        List<C10013c> list = this.f47129i;
        if (list != null && cVar != null) {
            list.remove(cVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10893i.m48986e(this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f47137q == null) {
            this.f47137q = new int[4];
        }
        int[] iArr = this.f47137q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f47131k;
        int i2 = C6522b.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (!z || !this.f47132l) ? -C6522b.state_lifted : C6522b.state_lifted;
        int i3 = C6522b.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (!z || !this.f47132l) ? -C6522b.state_collapsed : C6522b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m45592c();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C5723u.m25349y(this) && m45599x()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C5723u.m25300Z(getChildAt(childCount), topInset);
            }
        }
        m45595k();
        this.f47126f = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((LayoutParams) getChildAt(i5).getLayoutParams()).mo39583b() != null) {
                this.f47126f = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f47138r;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f47130j) {
            if (!this.f47133m && !m45594i()) {
                z2 = false;
            }
            m45597t(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C5723u.m25349y(this) && m45599x()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C5266a.m23794b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m45595k();
    }

    /* renamed from: p */
    public void mo39538p(C10014d dVar) {
        mo39532o(dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo39539q() {
        this.f47127g = 0;
    }

    /* renamed from: r */
    public void mo39540r(boolean z, boolean z2) {
        m45596s(z, z2, true);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C10893i.m48985d(this, f);
    }

    public void setExpanded(boolean z) {
        mo39540r(z, C5723u.m25294T(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f47133m = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f47134n = i;
        m45592c();
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f47138r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f47138r = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f47138r.setState(getDrawableState());
                }
                C5135a.m23413m(this.f47138r, C5723u.m25265B(this));
                this.f47138r.setVisible(getVisibility() == 0, false);
                this.f47138r.setCallback(this);
            }
            m45601z();
            C5723u.m25310e0(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C5264a.m23789d(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C10020b.m45758b(this, f);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f47138r;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo39551u(boolean z) {
        if (this.f47132l == z) {
            return false;
        }
        this.f47132l = z;
        refreshDrawableState();
        if (!this.f47133m || !(getBackground() instanceof C10889h)) {
            return true;
        }
        m45600y((C10889h) getBackground(), z);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f47138r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo39553w(View view) {
        View d = m45593d(view);
        if (d != null) {
            view = d;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    protected static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f47139k;

        /* renamed from: l */
        private int f47140l;

        /* renamed from: m */
        private ValueAnimator f47141m;

        /* renamed from: n */
        private int f47142n = -1;

        /* renamed from: o */
        private boolean f47143o;

        /* renamed from: p */
        private float f47144p;

        /* renamed from: q */
        private WeakReference<View> f47145q;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        class C10008a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f47149a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f47150b;

            C10008a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f47149a = coordinatorLayout;
                this.f47150b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.mo39669P(this.f47149a, this.f47150b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        class C10009b implements C5781f {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f47152a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f47153b;

            /* renamed from: c */
            final /* synthetic */ View f47154c;

            /* renamed from: d */
            final /* synthetic */ int f47155d;

            C10009b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.f47152a = coordinatorLayout;
                this.f47153b = appBarLayout;
                this.f47154c = view;
                this.f47155d = i;
            }

            /* renamed from: a */
            public boolean mo6785a(View view, C5781f.C5782a aVar) {
                BaseBehavior.this.mo3010q(this.f47152a, this.f47153b, this.f47154c, 0, this.f47155d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        class C10010c implements C5781f {

            /* renamed from: a */
            final /* synthetic */ AppBarLayout f47157a;

            /* renamed from: b */
            final /* synthetic */ boolean f47158b;

            C10010c(AppBarLayout appBarLayout, boolean z) {
                this.f47157a = appBarLayout;
                this.f47158b = z;
            }

            /* renamed from: a */
            public boolean mo6785a(View view, C5781f.C5782a aVar) {
                this.f47157a.setExpanded(this.f47158b);
                return true;
            }
        }

        public BaseBehavior() {
        }

        /* renamed from: S */
        private void m45619S(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (mo39557M() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                m45620T(coordinatorLayout, t, C5771c.C5772a.f24484q, false);
            }
            if (mo39557M() == 0) {
                return;
            }
            if (view.canScrollVertically(-1)) {
                int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    C5723u.m25322k0(coordinatorLayout, C5771c.C5772a.f24485r, (CharSequence) null, new C10009b(coordinatorLayout, t, view, i));
                    return;
                }
                return;
            }
            m45620T(coordinatorLayout, t, C5771c.C5772a.f24485r, true);
        }

        /* renamed from: T */
        private void m45620T(CoordinatorLayout coordinatorLayout, T t, C5771c.C5772a aVar, boolean z) {
            C5723u.m25322k0(coordinatorLayout, aVar, (CharSequence) null, new C10010c(t, z));
        }

        /* renamed from: U */
        private void m45621U(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int i2;
            int abs = Math.abs(mo39557M() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            m45622V(coordinatorLayout, t, i, i2);
        }

        /* renamed from: V */
        private void m45622V(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int M = mo39557M();
            if (M == i) {
                ValueAnimator valueAnimator = this.f47141m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f47141m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f47141m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f47141m = valueAnimator3;
                valueAnimator3.setInterpolator(C10493a.f49012e);
                this.f47141m.addUpdateListener(new C10008a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f47141m.setDuration((long) Math.min(i2, IronSourceError.ERROR_BN_LOAD_AFTER_INIT_FAILED));
            this.f47141m.setIntValues(new int[]{M, i});
            this.f47141m.start();
        }

        /* renamed from: X */
        private boolean m45623X(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.mo39528j() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: Y */
        private static boolean m45624Y(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: Z */
        private View m45625Z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C5712j) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a0 */
        private static View m45626a0(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: b0 */
        private int m45627b0(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m45624Y(layoutParams.mo39582a(), 32)) {
                    top -= layoutParams.topMargin;
                    bottom += layoutParams.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: e0 */
        private int m45628e0(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator b = layoutParams.mo39583b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = layoutParams.mo39582a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= C5723u.m25267C(childAt);
                        }
                    }
                    if (C5723u.m25349y(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: p0 */
        private boolean m45629p0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> w = coordinatorLayout.mo2987w(t);
            int size = w.size();
            int i = 0;
            while (i < size) {
                CoordinatorLayout.Behavior f = ((CoordinatorLayout.C0581e) w.get(i).getLayoutParams()).mo3035f();
                if (!(f instanceof ScrollingViewBehavior)) {
                    i++;
                } else if (((ScrollingViewBehavior) f).mo39673K() != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        /* renamed from: q0 */
        private void m45630q0(CoordinatorLayout coordinatorLayout, T t) {
            int M = mo39557M();
            int b0 = m45627b0(t, M);
            if (b0 >= 0) {
                View childAt = t.getChildAt(b0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int a = layoutParams.mo39582a();
                if ((a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b0 == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m45624Y(a, 2)) {
                        i2 += C5723u.m25267C(childAt);
                    } else if (m45624Y(a, 5)) {
                        int C = C5723u.m25267C(childAt) + i2;
                        if (M < C) {
                            i = C;
                        } else {
                            i2 = C;
                        }
                    }
                    if (m45624Y(a, 32)) {
                        i += layoutParams.topMargin;
                        i2 -= layoutParams.bottomMargin;
                    }
                    if (M < (i2 + i) / 2) {
                        i = i2;
                    }
                    m45621U(coordinatorLayout, t, C5266a.m23794b(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: r0 */
        private void m45631r0(CoordinatorLayout coordinatorLayout, T t) {
            C5723u.m25318i0(coordinatorLayout, C5771c.C5772a.f24484q.mo22669b());
            C5723u.m25318i0(coordinatorLayout, C5771c.C5772a.f24485r.mo22669b());
            View Z = m45625Z(coordinatorLayout);
            if (Z != null && t.getTotalScrollRange() != 0 && (((CoordinatorLayout.C0581e) Z.getLayoutParams()).mo3035f() instanceof ScrollingViewBehavior)) {
                m45619S(coordinatorLayout, t, Z);
            }
        }

        /* renamed from: s0 */
        private void m45632s0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View a0 = m45626a0(t, i);
            if (a0 != null) {
                int a = ((LayoutParams) a0.getLayoutParams()).mo39582a();
                boolean z2 = false;
                if ((a & 1) != 0) {
                    int C = C5723u.m25267C(a0);
                    if (i2 <= 0 || (a & 12) == 0 ? !((a & 2) == 0 || (-i) < (a0.getBottom() - C) - t.getTopInset()) : (-i) >= (a0.getBottom() - C) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.mo39529l()) {
                    z2 = t.mo39553w(m45625Z(coordinatorLayout));
                }
                boolean u = t.mo39551u(z2);
                if (z || (u && m45629p0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public int mo39557M() {
            return mo39580E() + this.f47139k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: W */
        public boolean mo39554H(T t) {
            WeakReference<View> weakReference = this.f47145q;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c0 */
        public int mo39555K(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d0 */
        public int mo39556L(T t) {
            return t.getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f0 */
        public void mo39558N(CoordinatorLayout coordinatorLayout, T t) {
            m45630q0(coordinatorLayout, t);
            if (t.mo39529l()) {
                t.mo39551u(t.mo39553w(m45625Z(coordinatorLayout)));
            }
        }

        /* renamed from: g0 */
        public boolean mo3005l(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            boolean l = super.mo3005l(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i3 = this.f47142n;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.f47143o) {
                    i2 = C5723u.m25267C(childAt) + t.getTopInset();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f47144p);
                }
                mo39669P(coordinatorLayout, t, i4 + i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m45621U(coordinatorLayout, t, i5, 0.0f);
                    } else {
                        mo39669P(coordinatorLayout, t, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m45621U(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        mo39669P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.mo39539q();
            this.f47142n = -1;
            mo39581G(C5266a.m23794b(mo39580E(), -t.getTotalScrollRange(), 0));
            m45632s0(coordinatorLayout, t, mo39580E(), 0, true);
            t.mo39530m(mo39580E());
            m45631r0(coordinatorLayout, t);
            return l;
        }

        /* renamed from: h0 */
        public boolean mo3006m(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.C0581e) t.getLayoutParams()).height != -2) {
                return super.mo3006m(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo2945N(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: i0 */
        public void mo3010q(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo39668O(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.mo39529l()) {
                t.mo39551u(t.mo39553w(view));
            }
        }

        /* renamed from: j0 */
        public void mo3013t(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = mo39668O(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                m45631r0(coordinatorLayout, t);
            }
        }

        /* renamed from: k0 */
        public void mo3017x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.mo3017x(coordinatorLayout, t, savedState.mo3233a());
                this.f47142n = savedState.f47146d;
                this.f47144p = savedState.f47147e;
                this.f47143o = savedState.f47148f;
                return;
            }
            super.mo3017x(coordinatorLayout, t, parcelable);
            this.f47142n = -1;
        }

        /* renamed from: l0 */
        public Parcelable mo3018y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable y = super.mo3018y(coordinatorLayout, t);
            int E = mo39580E();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(y);
                    savedState.f47146d = i;
                    if (bottom == C5723u.m25267C(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    savedState.f47148f = z;
                    savedState.f47147e = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return y;
        }

        /* renamed from: m0 */
        public boolean mo2990A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.mo39529l() || m45623X(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f47141m) != null) {
                valueAnimator.cancel();
            }
            this.f47145q = null;
            this.f47140l = i2;
            return z;
        }

        /* renamed from: n0 */
        public void mo2992C(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f47140l == 0 || i == 1) {
                m45630q0(coordinatorLayout, t);
                if (t.mo39529l()) {
                    t.mo39551u(t.mo39553w(view));
                }
            }
            this.f47145q = new WeakReference<>(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o0 */
        public int mo39559Q(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int M = mo39557M();
            int i4 = 0;
            if (i2 == 0 || M < i2 || M > i3) {
                this.f47139k = 0;
            } else {
                int b = C5266a.m23794b(i, i2, i3);
                if (M != b) {
                    int e0 = t.mo39527h() ? m45628e0(t, b) : b;
                    boolean G = mo39581G(e0);
                    i4 = M - b;
                    this.f47139k = b - e0;
                    if (!G && t.mo39527h()) {
                        coordinatorLayout.mo2971p(t);
                    }
                    t.mo39530m(mo39580E());
                    m45632s0(coordinatorLayout, t, b, b < M ? -1 : 1, false);
                }
            }
            m45631r0(coordinatorLayout, t);
            return i4;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C10007a();

            /* renamed from: d */
            int f47146d;

            /* renamed from: e */
            float f47147e;

            /* renamed from: f */
            boolean f47148f;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            static class C10007a implements Parcelable.ClassLoaderCreator<SavedState> {
                C10007a() {
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
                this.f47146d = parcel.readInt();
                this.f47147e = parcel.readFloat();
                this.f47148f = parcel.readByte() != 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f47146d);
                parcel.writeFloat(this.f47147e);
                parcel.writeByte(this.f47148f ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = f47121s
            android.content.Context r11 = p245q6.C10962a.m49296c(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            r11 = -1
            r10.f47123c = r11
            r10.f47124d = r11
            r10.f47125e = r11
            r6 = 0
            r10.f47127g = r6
            android.content.Context r7 = r10.getContext()
            r0 = 1
            r10.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 21
            if (r8 < r9) goto L_0x0027
            com.google.android.material.appbar.C10020b.m45757a(r10)
            com.google.android.material.appbar.C10020b.m45759c(r10, r12, r13, r4)
        L_0x0027:
            int[] r2 = p193c6.C6532l.f26998k
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.C10220m.m47116h(r0, r1, r2, r3, r4, r5)
            int r13 = p193c6.C6532l.f27009l
            android.graphics.drawable.Drawable r13 = r12.getDrawable(r13)
            p110m0.C5723u.m25336r0(r10, r13)
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            boolean r13 = r13 instanceof android.graphics.drawable.ColorDrawable
            if (r13 == 0) goto L_0x005f
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            android.graphics.drawable.ColorDrawable r13 = (android.graphics.drawable.ColorDrawable) r13
            p6.h r0 = new p6.h
            r0.<init>()
            int r13 = r13.getColor()
            android.content.res.ColorStateList r13 = android.content.res.ColorStateList.valueOf(r13)
            r0.mo43091a0(r13)
            r0.mo43084P(r7)
            p110m0.C5723u.m25336r0(r10, r0)
        L_0x005f:
            int r13 = p193c6.C6532l.f27053p
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x006e
            boolean r13 = r12.getBoolean(r13, r6)
            r10.m45596s(r13, r6, r6)
        L_0x006e:
            if (r8 < r9) goto L_0x0080
            int r13 = p193c6.C6532l.f27042o
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0080
            int r13 = r12.getDimensionPixelSize(r13, r6)
            float r13 = (float) r13
            com.google.android.material.appbar.C10020b.m45758b(r10, r13)
        L_0x0080:
            r13 = 26
            if (r8 < r13) goto L_0x00a2
            int r13 = p193c6.C6532l.f27031n
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0093
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setKeyboardNavigationCluster(r13)
        L_0x0093:
            int r13 = p193c6.C6532l.f27020m
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00a2
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setTouchscreenBlocksFocus(r13)
        L_0x00a2:
            int r13 = p193c6.C6532l.f27064q
            boolean r13 = r12.getBoolean(r13, r6)
            r10.f47133m = r13
            int r13 = p193c6.C6532l.f27075r
            int r11 = r12.getResourceId(r13, r11)
            r10.f47134n = r11
            int r11 = p193c6.C6532l.f27086s
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setStatusBarForeground(r11)
            r12.recycle()
            com.google.android.material.appbar.AppBarLayout$a r11 = new com.google.android.material.appbar.AppBarLayout$a
            r11.<init>()
            p110m0.C5723u.m25266B0(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f47160a = 1;

        /* renamed from: b */
        Interpolator f47161b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6532l.f27108u);
            this.f47160a = obtainStyledAttributes.getInt(C6532l.f27119v, 0);
            int i = C6532l.f27130w;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f47161b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public int mo39582a() {
            return this.f47160a;
        }

        /* renamed from: b */
        public Interpolator mo39583b() {
            return this.f47161b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo39584c() {
            int i = this.f47160a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
