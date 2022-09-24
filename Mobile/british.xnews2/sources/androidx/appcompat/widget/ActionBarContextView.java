package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0287e;
import p072f.C5238a;
import p072f.C5243f;
import p072f.C5244g;
import p072f.C5247j;
import p098k.C5522b;
import p110m0.C5723u;
import p110m0.C5740y;

public class ActionBarContextView extends C0371a {

    /* renamed from: j */
    private CharSequence f1074j;

    /* renamed from: k */
    private CharSequence f1075k;

    /* renamed from: l */
    private View f1076l;

    /* renamed from: m */
    private View f1077m;

    /* renamed from: n */
    private LinearLayout f1078n;

    /* renamed from: o */
    private TextView f1079o;

    /* renamed from: p */
    private TextView f1080p;

    /* renamed from: q */
    private int f1081q;

    /* renamed from: r */
    private int f1082r;

    /* renamed from: s */
    private boolean f1083s;

    /* renamed from: t */
    private int f1084t;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class C0304a implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ C5522b f1085b;

        C0304a(C5522b bVar) {
            this.f1085b = bVar;
        }

        public void onClick(View view) {
            this.f1085b.mo975c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: i */
    private void m1574i() {
        if (this.f1078n == null) {
            LayoutInflater.from(getContext()).inflate(C5244g.f22940a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1078n = linearLayout;
            this.f1079o = (TextView) linearLayout.findViewById(C5243f.f22918e);
            this.f1080p = (TextView) this.f1078n.findViewById(C5243f.f22917d);
            if (this.f1081q != 0) {
                this.f1079o.setTextAppearance(getContext(), this.f1081q);
            }
            if (this.f1082r != 0) {
                this.f1080p.setTextAppearance(getContext(), this.f1082r);
            }
        }
        this.f1079o.setText(this.f1074j);
        this.f1080p.setText(this.f1075k);
        boolean z = !TextUtils.isEmpty(this.f1074j);
        boolean z2 = !TextUtils.isEmpty(this.f1075k);
        int i = 0;
        this.f1080p.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1078n;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f1078n.getParent() == null) {
            addView(this.f1078n);
        }
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ C5740y mo1301f(int i, long j) {
        return super.mo1301f(i, j);
    }

    /* renamed from: g */
    public void mo1302g() {
        if (this.f1076l == null) {
            mo1311k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1075k;
    }

    public CharSequence getTitle() {
        return this.f1074j;
    }

    /* renamed from: h */
    public void mo1309h(C5522b bVar) {
        View view = this.f1076l;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1084t, this, false);
            this.f1076l = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1076l);
        }
        this.f1076l.findViewById(C5243f.f22922i).setOnClickListener(new C0304a(bVar));
        C0287e eVar = (C0287e) bVar.mo977e();
        ActionMenuPresenter actionMenuPresenter = this.f1511e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1387B();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f1511e = actionMenuPresenter2;
        actionMenuPresenter2.mo1397M(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.mo1126c(this.f1511e, this.f1509c);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1511e.mo1041r(this);
        this.f1510d = actionMenuView;
        C5723u.m25336r0(actionMenuView, (Drawable) null);
        addView(this.f1510d, layoutParams);
    }

    /* renamed from: j */
    public boolean mo1310j() {
        return this.f1083s;
    }

    /* renamed from: k */
    public void mo1311k() {
        removeAllViews();
        this.f1077m = null;
        this.f1510d = null;
    }

    /* renamed from: l */
    public boolean mo1312l() {
        ActionMenuPresenter actionMenuPresenter = this.f1511e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo1398N();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1511e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1389E();
            this.f1511e.mo1390F();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f1074j);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean b = C0401l0.m2125b(this);
        int paddingRight = b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1076l;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1076l.getLayoutParams();
            int i5 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d = C0371a.m1934d(paddingRight, i5, b);
            paddingRight = C0371a.m1934d(d + mo2052e(this.f1076l, d, paddingTop, paddingTop2, b), i6, b);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f1078n;
        if (!(linearLayout == null || this.f1077m != null || linearLayout.getVisibility() == 8)) {
            i7 += mo2052e(this.f1078n, i7, paddingTop, paddingTop2, b);
        }
        int i8 = i7;
        View view2 = this.f1077m;
        if (view2 != null) {
            mo2052e(view2, i8, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1510d;
        if (actionMenuView != null) {
            mo2052e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f1512f;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f1076l;
            if (view != null) {
                int c = mo2051c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1076l.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1510d;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo2051c(this.f1510d, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1078n;
            if (linearLayout != null && this.f1077m == null) {
                if (this.f1083s) {
                    this.f1078n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1078n.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1078n.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo2051c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1077m;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f1077m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f1512f <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i) {
        this.f1512f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1077m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1077m = view;
        if (!(view == null || (linearLayout = this.f1078n) == null)) {
            removeView(linearLayout);
            this.f1078n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1075k = charSequence;
        m1574i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1074j = charSequence;
        m1574i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1083s) {
            requestLayout();
        }
        this.f1083s = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5238a.f22814j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0384f0 v = C0384f0.m1994v(context, attributeSet, C5247j.f23231y, i, 0);
        C5723u.m25336r0(this, v.mo2101g(C5247j.f23236z));
        this.f1081q = v.mo2108n(C5247j.f22995D, 0);
        this.f1082r = v.mo2108n(C5247j.f22990C, 0);
        this.f1512f = v.mo2107m(C5247j.f22985B, 0);
        this.f1084t = v.mo2108n(C5247j.f22980A, C5244g.f22943d);
        v.mo2114w();
    }
}
