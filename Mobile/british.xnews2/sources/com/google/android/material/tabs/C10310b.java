package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C10227s;
import com.google.android.material.tabs.TabLayout;
import p199d6.C10493a;

/* renamed from: com.google.android.material.tabs.b */
/* compiled from: TabIndicatorInterpolator */
class C10310b {
    C10310b() {
    }

    /* renamed from: a */
    static RectF m47609a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.mo41468x() || !(view instanceof TabLayout.C10306i)) {
            return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        }
        return m47610b((TabLayout.C10306i) view, 24);
    }

    /* renamed from: b */
    static RectF m47610b(TabLayout.C10306i iVar, int i) {
        int contentWidth = iVar.getContentWidth();
        int contentHeight = iVar.getContentHeight();
        int c = (int) C10227s.m47135c(iVar.getContext(), i);
        if (contentWidth < c) {
            contentWidth = c;
        }
        int left = (iVar.getLeft() + iVar.getRight()) / 2;
        int top = (iVar.getTop() + iVar.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new RectF((float) (left - i2), (float) (top - (contentHeight / 2)), (float) (i2 + left), (float) (top + (left / 2)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo41518c(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF a = m47609a(tabLayout, view);
        RectF a2 = m47609a(tabLayout, view2);
        drawable.setBounds(C10493a.m48200c((int) a.left, (int) a2.left, f), drawable.getBounds().top, C10493a.m48200c((int) a.right, (int) a2.right, f), drawable.getBounds().bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo41519d(TabLayout tabLayout, View view, Drawable drawable) {
        RectF a = m47609a(tabLayout, view);
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
    }
}
