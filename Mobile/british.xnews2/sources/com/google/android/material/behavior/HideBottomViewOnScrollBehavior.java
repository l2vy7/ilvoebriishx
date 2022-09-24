package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p199d6.C10493a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    private int f47265a = 0;

    /* renamed from: b */
    private int f47266b = 2;

    /* renamed from: c */
    private int f47267c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ViewPropertyAnimator f47268d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    class C10024a extends AnimatorListenerAdapter {
        C10024a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f47268d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    /* renamed from: F */
    private void m45828F(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f47268d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C10024a());
    }

    /* renamed from: A */
    public boolean mo2990A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    /* renamed from: G */
    public void mo39723G(V v, int i) {
        this.f47267c = i;
        if (this.f47266b == 1) {
            v.setTranslationY((float) (this.f47265a + i));
        }
    }

    /* renamed from: H */
    public void mo39724H(V v) {
        if (this.f47266b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f47268d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f47266b = 1;
            m45828F(v, this.f47265a + this.f47267c, 175, C10493a.f49010c);
        }
    }

    /* renamed from: I */
    public void mo39725I(V v) {
        if (this.f47266b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f47268d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f47266b = 2;
            m45828F(v, 0, 225, C10493a.f49011d);
        }
    }

    /* renamed from: l */
    public boolean mo3005l(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f47265a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo3005l(coordinatorLayout, v, i);
    }

    /* renamed from: t */
    public void mo3013t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            mo39724H(v);
        } else if (i2 < 0) {
            mo39725I(v);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
