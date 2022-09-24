package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AnimatorSet f48775b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    class C10375a extends AnimatorListenerAdapter {
        C10375a() {
        }

        public void onAnimationEnd(Animator animator) {
            AnimatorSet unused = ExpandableTransformationBehavior.this.f48775b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo41810H(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f48775b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet J = mo41812J(view, view2, z, z3);
        this.f48775b = J;
        J.addListener(new C10375a());
        this.f48775b.start();
        if (!z2) {
            this.f48775b.end();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract AnimatorSet mo41812J(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
