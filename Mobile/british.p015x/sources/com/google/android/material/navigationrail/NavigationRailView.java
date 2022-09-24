package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C0384f0;
import com.google.android.material.internal.C10220m;
import com.google.android.material.navigation.NavigationBarView;
import p194c6.C6522b;
import p194c6.C6524d;
import p194c6.C6531k;
import p194c6.C6532l;

public class NavigationRailView extends NavigationBarView {

    /* renamed from: i */
    private final int f48211i;

    /* renamed from: j */
    private View f48212j;

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.navigationRailStyle);
    }

    private C10245b getNavigationRailMenuView() {
        return (C10245b) getMenuView();
    }

    /* renamed from: j */
    private boolean m47203j() {
        View view = this.f48212j;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: k */
    private int m47204k(int i) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
    }

    /* renamed from: g */
    public void mo41116g(int i) {
        mo41119h(LayoutInflater.from(getContext()).inflate(i, this, false));
    }

    public View getHeaderView() {
        return this.f48212j;
    }

    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    /* renamed from: h */
    public void mo41119h(View view) {
        mo41121l();
        this.f48212j = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.f48211i;
        addView(view, 0, layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C10245b mo19413e(Context context) {
        return new C10245b(context);
    }

    /* renamed from: l */
    public void mo41121l() {
        View view = this.f48212j;
        if (view != null) {
            removeView(view);
            this.f48212j = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C10245b navigationRailMenuView = getNavigationRailMenuView();
        int i5 = 0;
        if (m47203j()) {
            int bottom = this.f48212j.getBottom() + this.f48211i;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
        } else if (navigationRailMenuView.mo41127l()) {
            i5 = this.f48211i;
        }
        if (i5 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i5, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int k = m47204k(i);
        super.onMeasure(k, i2);
        if (m47203j()) {
            measureChild(getNavigationRailMenuView(), k, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f48212j.getMeasuredHeight()) - this.f48211i, Integer.MIN_VALUE));
        }
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C6531k.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f48211i = getResources().getDimensionPixelSize(C6524d.mtrl_navigation_rail_margin);
        C0384f0 i3 = C10220m.m47117i(getContext(), attributeSet, C6532l.f27103t5, i, i2, new int[0]);
        int n = i3.mo2108n(C6532l.f27114u5, 0);
        if (n != 0) {
            mo41116g(n);
        }
        setMenuGravity(i3.mo2105k(C6532l.f27125v5, 49));
        i3.mo2114w();
    }
}
