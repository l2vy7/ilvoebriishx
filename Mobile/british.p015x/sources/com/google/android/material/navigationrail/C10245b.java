package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.C10239a;
import com.google.android.material.navigation.C10242c;

/* renamed from: com.google.android.material.navigationrail.b */
/* compiled from: NavigationRailMenuView */
public class C10245b extends C10242c {

    /* renamed from: w */
    private final FrameLayout.LayoutParams f48213w;

    public C10245b(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f48213w = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
    }

    /* renamed from: m */
    private int m47210m(int i, int i2, int i3) {
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), i2 / Math.max(1, i3)), 0);
    }

    /* renamed from: n */
    private int m47211n(View view, int i, int i2) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        view.measure(i, i2);
        return view.getMeasuredHeight();
    }

    /* renamed from: o */
    private int m47212o(int i, int i2, int i3, View view) {
        int i4;
        m47210m(i, i2, i3);
        if (view == null) {
            i4 = m47210m(i, i2, i3);
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt != view) {
                i5 += m47211n(childAt, i, i4);
            }
        }
        return i5;
    }

    /* renamed from: p */
    private int m47213p(int i, int i2, int i3) {
        int i4;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i4 = m47211n(childAt, i, m47210m(i, i2, i3));
            i2 -= i4;
            i3--;
        } else {
            i4 = 0;
        }
        return i4 + m47212o(i, i2, i3, childAt);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C10239a mo39797f(Context context) {
        return new C10244a(context);
    }

    /* access modifiers changed from: package-private */
    public int getMenuGravity() {
        return this.f48213w.gravity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo41127l() {
        return (this.f48213w.gravity & 112) == 48;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                childAt.layout(0, i6, i5, measuredHeight);
                i6 = measuredHeight;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = getMenu().mo1095G().size();
        if (size2 <= 1 || !mo41088g(getLabelVisibilityMode(), size2)) {
            i3 = m47212o(i, size, size2, (View) null);
        } else {
            i3 = m47213p(i, size, size2);
        }
        setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i), i, 0), View.resolveSizeAndState(i3, i2, 0));
    }

    /* access modifiers changed from: package-private */
    public void setMenuGravity(int i) {
        FrameLayout.LayoutParams layoutParams = this.f48213w;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            setLayoutParams(layoutParams);
        }
    }
}
