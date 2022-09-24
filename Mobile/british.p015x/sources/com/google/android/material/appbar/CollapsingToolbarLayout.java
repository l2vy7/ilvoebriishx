package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0600b;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.C10188a;
import com.google.android.material.internal.C10192c;
import p063d0.C5135a;
import p080g0.C5266a;
import p105l0.C5643c;
import p111m0.C5690c0;
import p111m0.C5718p;
import p111m0.C5723u;
import p194c6.C6522b;
import p194c6.C6524d;
import p194c6.C6526f;
import p194c6.C6531k;
import p194c6.C6532l;
import p200d6.C10493a;
import p219i6.C10604a;

public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: E */
    private static final int f47165E = C6531k.Widget_Design_CollapsingToolbar;

    /* renamed from: A */
    private int f47166A;

    /* renamed from: B */
    private boolean f47167B;

    /* renamed from: C */
    private int f47168C;

    /* renamed from: D */
    private boolean f47169D;

    /* renamed from: b */
    private boolean f47170b;

    /* renamed from: c */
    private int f47171c;

    /* renamed from: d */
    private ViewGroup f47172d;

    /* renamed from: e */
    private View f47173e;

    /* renamed from: f */
    private View f47174f;

    /* renamed from: g */
    private int f47175g;

    /* renamed from: h */
    private int f47176h;

    /* renamed from: i */
    private int f47177i;

    /* renamed from: j */
    private int f47178j;

    /* renamed from: k */
    private final Rect f47179k;

    /* renamed from: l */
    final C10188a f47180l;

    /* renamed from: m */
    final C10604a f47181m;

    /* renamed from: n */
    private boolean f47182n;

    /* renamed from: o */
    private boolean f47183o;

    /* renamed from: p */
    private Drawable f47184p;

    /* renamed from: q */
    Drawable f47185q;

    /* renamed from: r */
    private int f47186r;

    /* renamed from: s */
    private boolean f47187s;

    /* renamed from: t */
    private ValueAnimator f47188t;

    /* renamed from: u */
    private long f47189u;

    /* renamed from: v */
    private int f47190v;

    /* renamed from: w */
    private AppBarLayout.C10014d f47191w;

    /* renamed from: x */
    int f47192x;

    /* renamed from: y */
    private int f47193y;

    /* renamed from: z */
    C5690c0 f47194z;

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    class C10015a implements C5718p {
        C10015a() {
        }

        /* renamed from: a */
        public C5690c0 mo870a(View view, C5690c0 c0Var) {
            return CollapsingToolbarLayout.this.mo39621n(c0Var);
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    class C10016b implements ValueAnimator.AnimatorUpdateListener {
        C10016b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$c */
    private class C10017c implements AppBarLayout.C10014d {
        C10017c() {
        }

        /* renamed from: a */
        public void mo39590a(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f47192x = i;
            C5690c0 c0Var = collapsingToolbarLayout.f47194z;
            int l = c0Var != null ? c0Var.mo22413l() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                C10019a j = CollapsingToolbarLayout.m45699j(childAt);
                int i3 = layoutParams.f47195a;
                if (i3 == 1) {
                    j.mo39687f(C5266a.m23794b(-i, 0, CollapsingToolbarLayout.this.mo39620h(childAt)));
                } else if (i3 == 2) {
                    j.mo39687f(Math.round(((float) (-i)) * layoutParams.f47196b));
                }
            }
            CollapsingToolbarLayout.this.mo39663u();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f47185q != null && l > 0) {
                C5723u.m25310e0(collapsingToolbarLayout2);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int C = (height - C5723u.m25267C(CollapsingToolbarLayout.this)) - l;
            float f = (float) C;
            CollapsingToolbarLayout.this.f47180l.mo40925r0(Math.min(1.0f, ((float) (height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger())) / f));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f47180l.mo40911f0(collapsingToolbarLayout3.f47192x + C);
            CollapsingToolbarLayout.this.f47180l.mo40921p0(((float) Math.abs(i)) / f);
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.collapsingToolbarLayoutStyle);
    }

    /* renamed from: a */
    private void m45693a(int i) {
        m45695c();
        ValueAnimator valueAnimator = this.f47188t;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f47188t = valueAnimator2;
            valueAnimator2.setDuration(this.f47189u);
            this.f47188t.setInterpolator(i > this.f47186r ? C10493a.f49010c : C10493a.f49011d);
            this.f47188t.addUpdateListener(new C10016b());
        } else if (valueAnimator.isRunning()) {
            this.f47188t.cancel();
        }
        this.f47188t.setIntValues(new int[]{this.f47186r, i});
        this.f47188t.start();
    }

    /* renamed from: b */
    private void m45694b(AppBarLayout appBarLayout) {
        if (m45700k()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m45695c() {
        /*
            r6 = this;
            boolean r0 = r6.f47170b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.f47172d = r0
            r6.f47173e = r0
            int r1 = r6.f47171c
            r2 = -1
            if (r1 == r2) goto L_0x001f
            android.view.View r1 = r6.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.f47172d = r1
            if (r1 == 0) goto L_0x001f
            android.view.View r1 = r6.m45696d(r1)
            r6.f47173e = r1
        L_0x001f:
            android.view.ViewGroup r1 = r6.f47172d
            r2 = 0
            if (r1 != 0) goto L_0x003e
            int r1 = r6.getChildCount()
            r3 = 0
        L_0x0029:
            if (r3 >= r1) goto L_0x003c
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = m45701l(r4)
            if (r5 == 0) goto L_0x0039
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x003c
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x003c:
            r6.f47172d = r0
        L_0x003e:
            r6.m45707t()
            r6.f47170b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.m45695c():void");
    }

    /* renamed from: d */
    private View m45696d(View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    /* renamed from: g */
    private static int m45697g(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: i */
    private static CharSequence m45698i(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (Build.VERSION.SDK_INT < 21 || !(view instanceof android.widget.Toolbar)) {
            return null;
        }
        return ((android.widget.Toolbar) view).getTitle();
    }

    /* renamed from: j */
    static C10019a m45699j(View view) {
        int i = C6526f.view_offset_helper;
        C10019a aVar = (C10019a) view.getTag(i);
        if (aVar != null) {
            return aVar;
        }
        C10019a aVar2 = new C10019a(view);
        view.setTag(i, aVar2);
        return aVar2;
    }

    /* renamed from: k */
    private boolean m45700k() {
        return this.f47193y == 1;
    }

    /* renamed from: l */
    private static boolean m45701l(View view) {
        return (view instanceof Toolbar) || (Build.VERSION.SDK_INT >= 21 && (view instanceof android.widget.Toolbar));
    }

    /* renamed from: m */
    private boolean m45702m(View view) {
        View view2 = this.f47173e;
        if (view2 == null || view2 == this) {
            if (view == this.f47172d) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private void m45703p(boolean z) {
        int i;
        int i2;
        int i3;
        View view = this.f47173e;
        if (view == null) {
            view = this.f47172d;
        }
        int h = mo39620h(view);
        C10192c.m47017a(this, this.f47174f, this.f47179k);
        ViewGroup viewGroup = this.f47172d;
        int i4 = 0;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i4 = toolbar.getTitleMarginStart();
            i2 = toolbar.getTitleMarginEnd();
            i = toolbar.getTitleMarginTop();
            i3 = toolbar.getTitleMarginBottom();
        } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i4 = toolbar2.getTitleMarginStart();
            i2 = toolbar2.getTitleMarginEnd();
            i = toolbar2.getTitleMarginTop();
            i3 = toolbar2.getTitleMarginBottom();
        }
        C10188a aVar = this.f47180l;
        Rect rect = this.f47179k;
        int i5 = rect.left + (z ? i2 : i4);
        int i6 = rect.top + h + i;
        int i7 = rect.right;
        if (!z) {
            i4 = i2;
        }
        aVar.mo40904X(i5, i6, i7 - i4, (rect.bottom + h) - i3);
    }

    /* renamed from: q */
    private void m45704q() {
        setContentDescription(getTitle());
    }

    /* renamed from: r */
    private void m45705r(Drawable drawable, int i, int i2) {
        m45706s(drawable, this.f47172d, i, i2);
    }

    /* renamed from: s */
    private void m45706s(Drawable drawable, View view, int i, int i2) {
        if (m45700k() && view != null && this.f47182n) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    /* renamed from: t */
    private void m45707t() {
        View view;
        if (!this.f47182n && (view = this.f47174f) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f47174f);
            }
        }
        if (this.f47182n && this.f47172d != null) {
            if (this.f47174f == null) {
                this.f47174f = new View(getContext());
            }
            if (this.f47174f.getParent() == null) {
                this.f47172d.addView(this.f47174f, -1, -1);
            }
        }
    }

    /* renamed from: v */
    private void m45708v(int i, int i2, int i3, int i4, boolean z) {
        View view;
        if (this.f47182n && (view = this.f47174f) != null) {
            boolean z2 = false;
            boolean z3 = C5723u.m25293S(view) && this.f47174f.getVisibility() == 0;
            this.f47183o = z3;
            if (z3 || z) {
                if (C5723u.m25265B(this) == 1) {
                    z2 = true;
                }
                m45703p(z2);
                this.f47180l.mo40912g0(z2 ? this.f47177i : this.f47175g, this.f47179k.top + this.f47176h, (i3 - i) - (z2 ? this.f47175g : this.f47177i), (i4 - i2) - this.f47178j);
                this.f47180l.mo40903V(z);
            }
        }
    }

    /* renamed from: w */
    private void m45709w() {
        if (this.f47172d != null && this.f47182n && TextUtils.isEmpty(this.f47180l.mo40899K())) {
            setTitle(m45698i(this.f47172d));
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        m45695c();
        if (this.f47172d == null && (drawable = this.f47184p) != null && this.f47186r > 0) {
            drawable.mutate().setAlpha(this.f47186r);
            this.f47184p.draw(canvas);
        }
        if (this.f47182n && this.f47183o) {
            if (this.f47172d == null || this.f47184p == null || this.f47186r <= 0 || !m45700k() || this.f47180l.mo40892D() >= this.f47180l.mo40893E()) {
                this.f47180l.mo40917m(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.f47184p.getBounds(), Region.Op.DIFFERENCE);
                this.f47180l.mo40917m(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.f47185q != null && this.f47186r > 0) {
            C5690c0 c0Var = this.f47194z;
            int l = c0Var != null ? c0Var.mo22413l() : 0;
            if (l > 0) {
                this.f47185q.setBounds(0, -this.f47192x, getWidth(), l - this.f47192x);
                this.f47185q.mutate().setAlpha(this.f47186r);
                this.f47185q.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.f47184p == null || this.f47186r <= 0 || !m45702m(view)) {
            z = false;
        } else {
            m45706s(this.f47184p, view, getWidth(), getHeight());
            this.f47184p.mutate().setAlpha(this.f47186r);
            this.f47184p.draw(canvas);
            z = true;
        }
        if (super.drawChild(canvas, view, j) || z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f47185q;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f47184p;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C10188a aVar = this.f47180l;
        if (aVar != null) {
            z |= aVar.mo40936z0(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.f47180l.mo40924r();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f47180l.mo40929v();
    }

    public Drawable getContentScrim() {
        return this.f47184p;
    }

    public int getExpandedTitleGravity() {
        return this.f47180l.mo40886A();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f47178j;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f47177i;
    }

    public int getExpandedTitleMarginStart() {
        return this.f47175g;
    }

    public int getExpandedTitleMarginTop() {
        return this.f47176h;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f47180l.mo40890C();
    }

    public int getHyphenationFrequency() {
        return this.f47180l.mo40894F();
    }

    public int getLineCount() {
        return this.f47180l.mo40895G();
    }

    public float getLineSpacingAdd() {
        return this.f47180l.mo40896H();
    }

    public float getLineSpacingMultiplier() {
        return this.f47180l.mo40897I();
    }

    public int getMaxLines() {
        return this.f47180l.mo40898J();
    }

    /* access modifiers changed from: package-private */
    public int getScrimAlpha() {
        return this.f47186r;
    }

    public long getScrimAnimationDuration() {
        return this.f47189u;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.f47190v;
        if (i >= 0) {
            return i + this.f47166A + this.f47168C;
        }
        C5690c0 c0Var = this.f47194z;
        int l = c0Var != null ? c0Var.mo22413l() : 0;
        int C = C5723u.m25267C(this);
        if (C > 0) {
            return Math.min((C * 2) + l, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f47185q;
    }

    public CharSequence getTitle() {
        if (this.f47182n) {
            return this.f47180l.mo40899K();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f47193y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo39620h(View view) {
        return ((getHeight() - m45699j(view).mo39683b()) - view.getHeight()) - ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C5690c0 mo39621n(C5690c0 c0Var) {
        C5690c0 c0Var2 = C5723u.m25349y(this) ? c0Var : null;
        if (!C5643c.m24954a(this.f47194z, c0Var2)) {
            this.f47194z = c0Var2;
            requestLayout();
        }
        return c0Var.mo22402c();
    }

    /* renamed from: o */
    public void mo39622o(boolean z, boolean z2) {
        if (this.f47187s != z) {
            int i = 255;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                m45693a(i);
            } else {
                if (!z) {
                    i = 0;
                }
                setScrimAlpha(i);
            }
            this.f47187s = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            m45694b(appBarLayout);
            C5723u.m25346w0(this, C5723u.m25349y(appBarLayout));
            if (this.f47191w == null) {
                this.f47191w = new C10017c();
            }
            appBarLayout.mo39507b(this.f47191w);
            C5723u.m25324l0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.C10014d dVar = this.f47191w;
        if (dVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).mo39538p(dVar);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C5690c0 c0Var = this.f47194z;
        if (c0Var != null) {
            int l = c0Var.mo22413l();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!C5723u.m25349y(childAt) && childAt.getTop() < l) {
                    C5723u.m25300Z(childAt, l);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            m45699j(getChildAt(i6)).mo39685d();
        }
        m45708v(i, i2, i3, i4, false);
        m45709w();
        mo39663u();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m45699j(getChildAt(i7)).mo39682a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m45695c();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C5690c0 c0Var = this.f47194z;
        int l = c0Var != null ? c0Var.mo22413l() : 0;
        if ((mode == 0 || this.f47167B) && l > 0) {
            this.f47166A = l;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + l, 1073741824));
        }
        if (this.f47169D && this.f47180l.mo40898J() > 1) {
            m45709w();
            m45708v(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int G = this.f47180l.mo40895G();
            if (G > 1) {
                this.f47168C = Math.round(this.f47180l.mo40935z()) * (G - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f47168C, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f47172d;
        if (viewGroup != null) {
            View view = this.f47173e;
            if (view == null || view == this) {
                setMinimumHeight(m45697g(viewGroup));
            } else {
                setMinimumHeight(m45697g(view));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f47184p;
        if (drawable != null) {
            m45705r(drawable, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f47180l.mo40909c0(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f47180l.mo40906Z(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f47180l.mo40910d0(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f47184p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f47184p = drawable3;
            if (drawable3 != null) {
                m45705r(drawable3, getWidth(), getHeight());
                this.f47184p.setCallback(this);
                this.f47184p.setAlpha(this.f47186r);
            }
            C5723u.m25310e0(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C0600b.m3294f(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f47180l.mo40916l0(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f47178j = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f47177i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f47175g = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f47176h = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f47180l.mo40914i0(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f47180l.mo40915k0(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f47180l.mo40919n0(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.f47169D = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.f47167B = z;
    }

    public void setHyphenationFrequency(int i) {
        this.f47180l.mo40927s0(i);
    }

    public void setLineSpacingAdd(float f) {
        this.f47180l.mo40928u0(f);
    }

    public void setLineSpacingMultiplier(float f) {
        this.f47180l.mo40930v0(f);
    }

    public void setMaxLines(int i) {
        this.f47180l.mo40932w0(i);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f47180l.mo40934y0(z);
    }

    /* access modifiers changed from: package-private */
    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.f47186r) {
            if (!(this.f47184p == null || (viewGroup = this.f47172d) == null)) {
                C5723u.m25310e0(viewGroup);
            }
            this.f47186r = i;
            C5723u.m25310e0(this);
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.f47189u = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f47190v != i) {
            this.f47190v = i;
            mo39663u();
        }
    }

    public void setScrimsShown(boolean z) {
        mo39622o(z, C5723u.m25294T(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f47185q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f47185q = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f47185q.setState(getDrawableState());
                }
                C5135a.m23413m(this.f47185q, C5723u.m25265B(this));
                this.f47185q.setVisible(getVisibility() == 0, false);
                this.f47185q.setCallback(this);
                this.f47185q.setAlpha(this.f47186r);
            }
            C5723u.m25310e0(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C0600b.m3294f(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.f47180l.mo40887A0(charSequence);
        m45704q();
    }

    public void setTitleCollapseMode(int i) {
        this.f47193y = i;
        boolean k = m45700k();
        this.f47180l.mo40923q0(k);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            m45694b((AppBarLayout) parent);
        }
        if (k && this.f47184p == null) {
            setContentScrimColor(this.f47181m.mo42716d(getResources().getDimension(C6524d.design_appbar_elevation)));
        }
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f47182n) {
            this.f47182n = z;
            m45704q();
            m45707t();
            requestLayout();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f47185q;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.f47185q.setVisible(z, false);
        }
        Drawable drawable2 = this.f47184p;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f47184p.setVisible(z, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo39663u() {
        if (this.f47184p != null || this.f47185q != null) {
            setScrimsShown(getHeight() + this.f47192x < getScrimVisibleHeightTrigger());
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f47184p || drawable == this.f47185q;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollapsingToolbarLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = f47165E
            android.content.Context r10 = p246q6.C10962a.m49296c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = 1
            r9.f47170b = r10
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f47179k = r0
            r6 = -1
            r9.f47190v = r6
            r7 = 0
            r9.f47166A = r7
            r9.f47168C = r7
            android.content.Context r0 = r9.getContext()
            com.google.android.material.internal.a r8 = new com.google.android.material.internal.a
            r8.<init>(r9)
            r9.f47180l = r8
            android.animation.TimeInterpolator r1 = p200d6.C10493a.f49012e
            r8.mo40889B0(r1)
            r8.mo40934y0(r7)
            i6.a r1 = new i6.a
            r1.<init>(r0)
            r9.f47181m = r1
            int[] r2 = p194c6.C6532l.f26732L1
            int[] r5 = new int[r7]
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.C10220m.m47116h(r0, r1, r2, r3, r4, r5)
            int r12 = p194c6.C6532l.f26776P1
            r0 = 8388691(0x800053, float:1.175506E-38)
            int r12 = r11.getInt(r12, r0)
            r8.mo40916l0(r12)
            int r12 = p194c6.C6532l.f26743M1
            r0 = 8388627(0x800013, float:1.175497E-38)
            int r12 = r11.getInt(r12, r0)
            r8.mo40909c0(r12)
            int r12 = p194c6.C6532l.f26787Q1
            int r12 = r11.getDimensionPixelSize(r12, r7)
            r9.f47178j = r12
            r9.f47177i = r12
            r9.f47176h = r12
            r9.f47175g = r12
            int r12 = p194c6.C6532l.f26820T1
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0073
            int r12 = r11.getDimensionPixelSize(r12, r7)
            r9.f47175g = r12
        L_0x0073:
            int r12 = p194c6.C6532l.f26809S1
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0081
            int r12 = r11.getDimensionPixelSize(r12, r7)
            r9.f47177i = r12
        L_0x0081:
            int r12 = p194c6.C6532l.f26830U1
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x008f
            int r12 = r11.getDimensionPixelSize(r12, r7)
            r9.f47176h = r12
        L_0x008f:
            int r12 = p194c6.C6532l.f26798R1
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x009d
            int r12 = r11.getDimensionPixelSize(r12, r7)
            r9.f47178j = r12
        L_0x009d:
            int r12 = p194c6.C6532l.f26935e2
            boolean r12 = r11.getBoolean(r12, r10)
            r9.f47182n = r12
            int r12 = p194c6.C6532l.f26913c2
            java.lang.CharSequence r12 = r11.getText(r12)
            r9.setTitle(r12)
            int r12 = p194c6.C6531k.TextAppearance_Design_CollapsingToolbar_Expanded
            r8.mo40914i0(r12)
            int r12 = p073f.C5246i.f22976b
            r8.mo40906Z(r12)
            int r12 = p194c6.C6532l.f26840V1
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00c7
            int r12 = r11.getResourceId(r12, r7)
            r8.mo40914i0(r12)
        L_0x00c7:
            int r12 = p194c6.C6532l.f26754N1
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00d6
            int r12 = r11.getResourceId(r12, r7)
            r8.mo40906Z(r12)
        L_0x00d6:
            int r12 = p194c6.C6532l.f26891a2
            int r12 = r11.getDimensionPixelSize(r12, r6)
            r9.f47190v = r12
            int r12 = p194c6.C6532l.f26870Y1
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00ed
            int r10 = r11.getInt(r12, r10)
            r8.mo40932w0(r10)
        L_0x00ed:
            int r10 = p194c6.C6532l.f26880Z1
            r12 = 600(0x258, float:8.41E-43)
            int r10 = r11.getInt(r10, r12)
            long r0 = (long) r10
            r9.f47189u = r0
            int r10 = p194c6.C6532l.f26765O1
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setContentScrim(r10)
            int r10 = p194c6.C6532l.f26902b2
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarScrim(r10)
            int r10 = p194c6.C6532l.f26924d2
            int r10 = r11.getInt(r10, r7)
            r9.setTitleCollapseMode(r10)
            int r10 = p194c6.C6532l.f26946f2
            int r10 = r11.getResourceId(r10, r6)
            r9.f47171c = r10
            int r10 = p194c6.C6532l.f26860X1
            boolean r10 = r11.getBoolean(r10, r7)
            r9.f47167B = r10
            int r10 = p194c6.C6532l.f26850W1
            boolean r10 = r11.getBoolean(r10, r7)
            r9.f47169D = r10
            r11.recycle()
            r9.setWillNotDraw(r7)
            com.google.android.material.appbar.CollapsingToolbarLayout$a r10 = new com.google.android.material.appbar.CollapsingToolbarLayout$a
            r10.<init>()
            p111m0.C5723u.m25266B0(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f47180l.mo40907b0(colorStateList);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: a */
        int f47195a = 0;

        /* renamed from: b */
        float f47196b = 0.5f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6532l.f26957g2);
            this.f47195a = obtainStyledAttributes.getInt(C6532l.f26968h2, 0);
            mo39665a(obtainStyledAttributes.getFloat(C6532l.f26979i2, 0.5f));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo39665a(float f) {
            this.f47196b = f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
