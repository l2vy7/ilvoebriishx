package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p200d6.C10493a;

/* renamed from: com.google.android.material.tabs.a */
/* compiled from: ElasticTabIndicatorInterpolator */
class C10309a extends C10310b {
    C10309a() {
    }

    /* renamed from: e */
    private static float m47606e(float f) {
        double d = (double) f;
        Double.isNaN(d);
        return (float) (1.0d - Math.cos((d * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: f */
    private static float m47607f(float f) {
        double d = (double) f;
        Double.isNaN(d);
        return (float) Math.sin((d * 3.141592653589793d) / 2.0d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo41518c(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float f2;
        float f3;
        RectF a = C10310b.m47609a(tabLayout, view);
        RectF a2 = C10310b.m47609a(tabLayout, view2);
        if (a.left < a2.left) {
            f3 = m47606e(f);
            f2 = m47607f(f);
        } else {
            f3 = m47607f(f);
            f2 = m47606e(f);
        }
        drawable.setBounds(C10493a.m48200c((int) a.left, (int) a2.left, f3), drawable.getBounds().top, C10493a.m48200c((int) a.right, (int) a2.right, f2), drawable.getBounds().bottom);
    }
}
