package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0287e;
import com.google.android.material.navigation.C10239a;
import com.google.android.material.navigation.C10242c;
import p110m0.C5723u;
import p193c6.C6524d;

/* renamed from: com.google.android.material.bottomnavigation.b */
/* compiled from: BottomNavigationMenuView */
public class C10044b extends C10242c {

    /* renamed from: A */
    private final int f47340A;

    /* renamed from: B */
    private boolean f47341B;

    /* renamed from: C */
    private int[] f47342C = new int[5];

    /* renamed from: w */
    private final int f47343w;

    /* renamed from: x */
    private final int f47344x;

    /* renamed from: y */
    private final int f47345y;

    /* renamed from: z */
    private final int f47346z;

    public C10044b(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f47343w = resources.getDimensionPixelSize(C6524d.design_bottom_navigation_item_max_width);
        this.f47344x = resources.getDimensionPixelSize(C6524d.design_bottom_navigation_item_min_width);
        this.f47345y = resources.getDimensionPixelSize(C6524d.design_bottom_navigation_active_item_max_width);
        this.f47346z = resources.getDimensionPixelSize(C6524d.design_bottom_navigation_active_item_min_width);
        this.f47340A = resources.getDimensionPixelSize(C6524d.design_bottom_navigation_height);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C10239a mo39797f(Context context) {
        return new C10043a(context);
    }

    /* renamed from: l */
    public boolean mo39798l() {
        return this.f47341B;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C5723u.m25265B(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0287e menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.mo1095G().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f47340A, 1073741824);
        if (!mo41088g(getLabelVisibilityMode(), size2) || !mo39798l()) {
            int min = Math.min(size / (size2 == 0 ? 1 : size2), this.f47345y);
            int i3 = size - (size2 * min);
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).getVisibility() != 8) {
                    int[] iArr = this.f47342C;
                    iArr[i4] = min;
                    if (i3 > 0) {
                        iArr[i4] = iArr[i4] + 1;
                        i3--;
                    }
                } else {
                    this.f47342C[i4] = 0;
                }
            }
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            int i5 = this.f47346z;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f47345y, Integer.MIN_VALUE), makeMeasureSpec);
                i5 = Math.max(i5, childAt.getMeasuredWidth());
            }
            int i6 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.f47344x * i6), Math.min(i5, this.f47345y));
            int i7 = size - min2;
            int min3 = Math.min(i7 / (i6 == 0 ? 1 : i6), this.f47343w);
            int i8 = i7 - (i6 * min3);
            int i9 = 0;
            while (i9 < childCount) {
                if (getChildAt(i9).getVisibility() != 8) {
                    this.f47342C[i9] = i9 == getSelectedItemPosition() ? min2 : min3;
                    if (i8 > 0) {
                        int[] iArr2 = this.f47342C;
                        iArr2[i9] = iArr2[i9] + 1;
                        i8--;
                    }
                } else {
                    this.f47342C[i9] = 0;
                }
                i9++;
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f47342C[i11], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i10 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10, View.MeasureSpec.makeMeasureSpec(i10, 1073741824), 0), View.resolveSizeAndState(this.f47340A, makeMeasureSpec, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f47341B = z;
    }
}
