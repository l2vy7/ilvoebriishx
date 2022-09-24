package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import com.google.android.material.navigation.C10239a;
import p193c6.C6524d;
import p193c6.C6528h;

/* renamed from: com.google.android.material.navigationrail.a */
/* compiled from: NavigationRailItemView */
final class C10244a extends C10239a {
    public C10244a(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public int getItemDefaultMarginResId() {
        return C6524d.mtrl_navigation_rail_icon_margin;
    }

    /* access modifiers changed from: protected */
    public int getItemLayoutResId() {
        return C6528h.mtrl_navigation_rail_item;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), View.resolveSizeAndState(Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)), i2, 0));
        }
    }
}
