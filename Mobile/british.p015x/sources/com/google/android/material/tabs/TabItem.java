package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0384f0;
import p194c6.C6532l;

public class TabItem extends View {

    /* renamed from: b */
    public final CharSequence f48424b;

    /* renamed from: c */
    public final Drawable f48425c;

    /* renamed from: d */
    public final int f48426d;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0384f0 u = C0384f0.m1993u(context, attributeSet, C6532l.f27094s7);
        this.f48424b = u.mo2110p(C6532l.f27127v7);
        this.f48425c = u.mo2101g(C6532l.f27105t7);
        this.f48426d = u.mo2108n(C6532l.f27116u7, 0);
        u.mo2114w();
    }
}
