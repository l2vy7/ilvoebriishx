package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p199d6.C10494b;
import p199d6.C10501i;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C10501i f48796c = new C10501i(75, 150);

    /* renamed from: d */
    private final C10501i f48797d = new C10501i(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    class C10381a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f48798a;

        /* renamed from: b */
        final /* synthetic */ View f48799b;

        C10381a(boolean z, View view) {
            this.f48798a = z;
            this.f48799b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f48798a) {
                this.f48799b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f48798a) {
                this.f48799b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    /* renamed from: K */
    private void m47918K(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        C10501i iVar = z ? this.f48796c : this.f48797d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.mo42632a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: D */
    public boolean mo2993D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo2993D(coordinatorLayout, view, motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public AnimatorSet mo41812J(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m47918K(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C10494b.m48201a(animatorSet, arrayList);
        animatorSet.addListener(new C10381a(z, view2));
        return animatorSet;
    }

    /* renamed from: e */
    public boolean mo2998e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
