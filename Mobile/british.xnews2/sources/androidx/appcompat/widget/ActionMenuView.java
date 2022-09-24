package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.view.menu.C0291g;
import androidx.appcompat.view.menu.C0296j;
import androidx.appcompat.view.menu.C0298k;
import androidx.appcompat.widget.LinearLayoutCompat;

public class ActionMenuView extends LinearLayoutCompat implements C0287e.C0289b, C0298k {

    /* renamed from: A */
    private int f1152A;

    /* renamed from: B */
    C0320d f1153B;

    /* renamed from: q */
    private C0287e f1154q;

    /* renamed from: r */
    private Context f1155r;

    /* renamed from: s */
    private int f1156s;

    /* renamed from: t */
    private boolean f1157t;

    /* renamed from: u */
    private ActionMenuPresenter f1158u;

    /* renamed from: v */
    private C0296j.C0297a f1159v;

    /* renamed from: w */
    C0287e.C0288a f1160w;

    /* renamed from: x */
    private boolean f1161x;

    /* renamed from: y */
    private int f1162y;

    /* renamed from: z */
    private int f1163z;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f1164a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f1165b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f1166c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f1167d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f1168e;

        /* renamed from: f */
        boolean f1169f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1164a = layoutParams.f1164a;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f1164a = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0317a {
        /* renamed from: a */
        boolean mo990a();

        /* renamed from: b */
        boolean mo991b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private static class C0318b implements C0296j.C0297a {
        C0318b() {
        }

        /* renamed from: b */
        public void mo877b(C0287e eVar, boolean z) {
        }

        /* renamed from: c */
        public boolean mo878c(C0287e eVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    private class C0319c implements C0287e.C0288a {
        C0319c() {
        }

        /* renamed from: a */
        public boolean mo821a(C0287e eVar, MenuItem menuItem) {
            C0320d dVar = ActionMenuView.this.f1153B;
            return dVar != null && dVar.onMenuItemClick(menuItem);
        }

        /* renamed from: b */
        public void mo822b(C0287e eVar) {
            C0287e.C0288a aVar = ActionMenuView.this.f1160w;
            if (aVar != null) {
                aVar.mo822b(eVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public interface C0320d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: L */
    static int m1659L(View view, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo994f();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (layoutParams.f1164a || !z2) {
            z = false;
        }
        layoutParams.f1167d = z;
        layoutParams.f1165b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: M */
    private void m1660M(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        boolean z4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i7 = size - paddingLeft;
        int i8 = this.f1163z;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i11 = i8 + (i10 / i9);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z5 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i17 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z6) {
                    int i19 = this.f1152A;
                    i6 = i18;
                    z4 = false;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i6 = i18;
                    z4 = false;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f1169f = z4;
                layoutParams.f1166c = z4 ? 1 : 0;
                layoutParams.f1165b = z4;
                layoutParams.f1167d = z4;
                layoutParams.leftMargin = z4;
                layoutParams.rightMargin = z4;
                layoutParams.f1168e = z6 && ((ActionMenuItemView) childAt).mo994f();
                int L = m1659L(childAt, i11, layoutParams.f1164a ? 1 : i9, childMeasureSpec, paddingTop);
                i15 = Math.max(i15, L);
                if (layoutParams.f1167d) {
                    i16++;
                }
                if (layoutParams.f1164a) {
                    z5 = true;
                }
                i9 -= L;
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                if (L == 1) {
                    j |= (long) (1 << i13);
                    i12 = i12;
                } else {
                    int i20 = i12;
                }
                i14 = i6;
            }
            i13++;
            size2 = i17;
        }
        int i21 = size2;
        boolean z7 = z5 && i14 == 2;
        boolean z8 = false;
        while (true) {
            if (i16 <= 0 || i9 <= 0) {
                i5 = mode;
                i3 = i7;
                z = z8;
                i4 = i12;
            } else {
                int i22 = 0;
                int i23 = 0;
                int i24 = Integer.MAX_VALUE;
                long j2 = 0;
                while (i23 < childCount) {
                    boolean z9 = z8;
                    LayoutParams layoutParams2 = (LayoutParams) getChildAt(i23).getLayoutParams();
                    int i25 = i12;
                    if (layoutParams2.f1167d) {
                        int i26 = layoutParams2.f1165b;
                        if (i26 < i24) {
                            j2 = 1 << i23;
                            i24 = i26;
                            i22 = 1;
                        } else if (i26 == i24) {
                            i22++;
                            j2 |= 1 << i23;
                        }
                    }
                    i23++;
                    i12 = i25;
                    z8 = z9;
                }
                z = z8;
                i4 = i12;
                j |= j2;
                if (i22 > i9) {
                    i5 = mode;
                    i3 = i7;
                    break;
                }
                int i27 = i24 + 1;
                int i28 = 0;
                while (i28 < childCount) {
                    View childAt2 = getChildAt(i28);
                    LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                    int i29 = i7;
                    int i30 = mode;
                    long j3 = (long) (1 << i28);
                    if ((j2 & j3) == 0) {
                        if (layoutParams3.f1165b == i27) {
                            j |= j3;
                        }
                        z3 = z7;
                    } else {
                        if (!z7 || !layoutParams3.f1168e || i9 != 1) {
                            z3 = z7;
                        } else {
                            int i31 = this.f1152A;
                            z3 = z7;
                            childAt2.setPadding(i31 + i11, 0, i31, 0);
                        }
                        layoutParams3.f1165b++;
                        layoutParams3.f1169f = true;
                        i9--;
                    }
                    i28++;
                    mode = i30;
                    i7 = i29;
                    z7 = z3;
                }
                i12 = i4;
                z8 = true;
            }
        }
        boolean z10 = !z5 && i14 == 1;
        if (i9 <= 0 || j == 0 || (i9 >= i14 - 1 && !z10 && i15 <= 1)) {
            z2 = z;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f1168e) {
                    bitCount -= 0.5f;
                }
                int i32 = childCount - 1;
                if ((j & ((long) (1 << i32))) != 0 && !((LayoutParams) getChildAt(i32).getLayoutParams()).f1168e) {
                    bitCount -= 0.5f;
                }
            }
            int i33 = bitCount > 0.0f ? (int) (((float) (i9 * i11)) / bitCount) : 0;
            z2 = z;
            for (int i34 = 0; i34 < childCount; i34++) {
                if ((j & ((long) (1 << i34))) != 0) {
                    View childAt3 = getChildAt(i34);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.f1166c = i33;
                        layoutParams4.f1169f = true;
                        if (i34 == 0 && !layoutParams4.f1168e) {
                            layoutParams4.leftMargin = (-i33) / 2;
                        }
                    } else if (layoutParams4.f1164a) {
                        layoutParams4.f1166c = i33;
                        layoutParams4.f1169f = true;
                        layoutParams4.rightMargin = (-i33) / 2;
                    } else {
                        if (i34 != 0) {
                            layoutParams4.leftMargin = i33 / 2;
                        }
                        if (i34 != childCount - 1) {
                            layoutParams4.rightMargin = i33 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i35 = 0; i35 < childCount; i35++) {
                View childAt4 = getChildAt(i35);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.f1169f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.f1165b * i11) + layoutParams5.f1166c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : i21);
    }

    /* renamed from: B */
    public void mo1410B() {
        ActionMenuPresenter actionMenuPresenter = this.f1158u;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1387B();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public LayoutParams mo1432m() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    /* renamed from: D */
    public LayoutParams mo1433n(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public LayoutParams mo1434o(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams == null) {
            return mo1432m();
        }
        if (layoutParams instanceof LayoutParams) {
            layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
        } else {
            layoutParams2 = new LayoutParams(layoutParams);
        }
        if (layoutParams2.gravity <= 0) {
            layoutParams2.gravity = 16;
        }
        return layoutParams2;
    }

    /* renamed from: F */
    public LayoutParams mo1414F() {
        LayoutParams C = mo1432m();
        C.f1164a = true;
        return C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo1415G(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0317a)) {
            z = false | ((C0317a) childAt).mo990a();
        }
        return (i <= 0 || !(childAt2 instanceof C0317a)) ? z : z | ((C0317a) childAt2).mo991b();
    }

    /* renamed from: H */
    public boolean mo1416H() {
        ActionMenuPresenter actionMenuPresenter = this.f1158u;
        return actionMenuPresenter != null && actionMenuPresenter.mo1389E();
    }

    /* renamed from: I */
    public boolean mo1417I() {
        ActionMenuPresenter actionMenuPresenter = this.f1158u;
        return actionMenuPresenter != null && actionMenuPresenter.mo1391G();
    }

    /* renamed from: J */
    public boolean mo1418J() {
        ActionMenuPresenter actionMenuPresenter = this.f1158u;
        return actionMenuPresenter != null && actionMenuPresenter.mo1392H();
    }

    /* renamed from: K */
    public boolean mo1419K() {
        return this.f1157t;
    }

    /* renamed from: N */
    public C0287e mo1420N() {
        return this.f1154q;
    }

    /* renamed from: O */
    public void mo1421O(C0296j.C0297a aVar, C0287e.C0288a aVar2) {
        this.f1159v = aVar;
        this.f1160w = aVar2;
    }

    /* renamed from: P */
    public boolean mo1422P() {
        ActionMenuPresenter actionMenuPresenter = this.f1158u;
        return actionMenuPresenter != null && actionMenuPresenter.mo1398N();
    }

    /* renamed from: a */
    public boolean mo1012a(C0291g gVar) {
        return this.f1154q.mo1102N(gVar, 0);
    }

    /* renamed from: b */
    public void mo1013b(C0287e eVar) {
        this.f1154q = eVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1154q == null) {
            Context context = getContext();
            C0287e eVar = new C0287e(context);
            this.f1154q = eVar;
            eVar.mo1109V(new C0319c());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f1158u = actionMenuPresenter;
            actionMenuPresenter.mo1397M(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f1158u;
            C0296j.C0297a aVar = this.f1159v;
            if (aVar == null) {
                aVar = new C0318b();
            }
            actionMenuPresenter2.mo1031g(aVar);
            this.f1154q.mo1126c(this.f1158u, this.f1155r);
            this.f1158u.mo1395K(this);
        }
        return this.f1154q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1158u.mo1388D();
    }

    public int getPopupTheme() {
        return this.f1156s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f1158u;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1028c(false);
            if (this.f1158u.mo1392H()) {
                this.f1158u.mo1389E();
                this.f1158u.mo1398N();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1410B();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f1161x) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b = C0401l0.m2125b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1164a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo1415G(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i5 = getPaddingLeft() + layoutParams.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    mo1415G(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f1164a) {
                    int i17 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f1164a) {
                int i20 = paddingLeft + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + layoutParams3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0287e eVar;
        boolean z = this.f1161x;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1161x = z2;
        if (z != z2) {
            this.f1162y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f1161x || (eVar = this.f1154q) == null || size == this.f1162y)) {
            this.f1162y = size;
            eVar.mo1101M(true);
        }
        int childCount = getChildCount();
        if (!this.f1161x || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m1660M(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1158u.mo1394J(z);
    }

    public void setOnMenuItemClickListener(C0320d dVar) {
        this.f1153B = dVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1158u.mo1396L(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f1157t = z;
    }

    public void setPopupTheme(int i) {
        if (this.f1156s != i) {
            this.f1156s = i;
            if (i == 0) {
                this.f1155r = getContext();
            } else {
                this.f1155r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f1158u = actionMenuPresenter;
        actionMenuPresenter.mo1395K(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1163z = (int) (56.0f * f);
        this.f1152A = (int) (f * 4.0f);
        this.f1155r = context;
        this.f1156s = 0;
    }
}
