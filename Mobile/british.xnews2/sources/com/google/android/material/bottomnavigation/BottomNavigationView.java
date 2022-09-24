package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C0384f0;
import androidx.core.content.C0600b;
import com.google.android.material.internal.C10220m;
import com.google.android.material.navigation.C10242c;
import com.google.android.material.navigation.NavigationBarView;
import p193c6.C6522b;
import p193c6.C6523c;
import p193c6.C6524d;
import p193c6.C6531k;
import p193c6.C6532l;
import p242p6.C10889h;

public class BottomNavigationView extends NavigationBarView {

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    public interface C4673a extends NavigationBarView.C4678c {
    }

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    public interface C4674b extends NavigationBarView.C4679d {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.bottomNavigationStyle);
    }

    /* renamed from: g */
    private void m21641g(Context context) {
        View view = new View(context);
        view.setBackgroundColor(C0600b.m3292d(context, C6523c.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C6524d.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    /* renamed from: h */
    private boolean m21642h() {
        return Build.VERSION.SDK_INT < 21 && !(getBackground() instanceof C10889h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C10242c mo19413e(Context context) {
        return new C10044b(context);
    }

    public int getMaxItemCount() {
        return 5;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        C10044b bVar = (C10044b) getMenuView();
        if (bVar.mo39798l() != z) {
            bVar.setItemHorizontalTranslationEnabled(z);
            getPresenter().mo1028c(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(C4673a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(C4674b bVar) {
        setOnItemSelectedListener(bVar);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C6531k.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = getContext();
        C0384f0 i3 = C10220m.m47117i(context2, attributeSet, C6532l.f26944f0, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(i3.mo2095a(C6532l.f26955g0, true));
        i3.mo2114w();
        if (m21642h()) {
            m21641g(context2);
        }
    }
}
