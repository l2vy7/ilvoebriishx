package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p079g0.C5266a;
import p110m0.C5690c0;
import p110m0.C5705d;
import p110m0.C5723u;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: d */
    final Rect f47210d = new Rect();

    /* renamed from: e */
    final Rect f47211e = new Rect();

    /* renamed from: f */
    private int f47212f = 0;

    /* renamed from: g */
    private int f47213g;

    public HeaderScrollingViewBehavior() {
    }

    /* renamed from: N */
    private static int m45731N(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo39671F(CoordinatorLayout coordinatorLayout, View view, int i) {
        View H = mo39585H(coordinatorLayout.mo2985v(view));
        if (H != null) {
            CoordinatorLayout.C0581e eVar = (CoordinatorLayout.C0581e) view.getLayoutParams();
            Rect rect = this.f47210d;
            rect.set(coordinatorLayout.getPaddingLeft() + eVar.leftMargin, H.getBottom() + eVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - eVar.rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - eVar.bottomMargin);
            C5690c0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C5723u.m25349y(coordinatorLayout) && !C5723u.m25349y(view)) {
                rect.left += lastWindowInsets.mo22411j();
                rect.right -= lastWindowInsets.mo22412k();
            }
            Rect rect2 = this.f47211e;
            C5705d.m25205a(m45731N(eVar.f3097c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int I = mo39672I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            this.f47212f = rect2.top - H.getBottom();
            return;
        }
        super.mo39671F(coordinatorLayout, view, i);
        this.f47212f = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public abstract View mo39585H(List<View> list);

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final int mo39672I(View view) {
        if (this.f47213g == 0) {
            return 0;
        }
        float J = mo39586J(view);
        int i = this.f47213g;
        return C5266a.m23794b((int) (J * ((float) i)), 0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public float mo39586J(View view) {
        return 1.0f;
    }

    /* renamed from: K */
    public final int mo39673K() {
        return this.f47213g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo39587L(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final int mo39674M() {
        return this.f47212f;
    }

    /* renamed from: O */
    public final void mo39675O(int i) {
        this.f47213g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public boolean mo39676P() {
        return false;
    }

    /* renamed from: m */
    public boolean mo3006m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View H;
        C5690c0 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (H = mo39585H(coordinatorLayout.mo2985v(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C5723u.m25349y(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.mo22413l() + lastWindowInsets.mo22410i();
        }
        int L = size + mo39587L(H);
        int measuredHeight = H.getMeasuredHeight();
        if (mo39676P()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            L -= measuredHeight;
        }
        coordinatorLayout.mo2945N(view, i, i2, View.MeasureSpec.makeMeasureSpec(L, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
