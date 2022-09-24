package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.Transition;
import p111m1.C5746b;

/* renamed from: androidx.transition.w */
/* compiled from: TranslationAnimationCreator */
class C1338w {

    /* renamed from: androidx.transition.w$a */
    /* compiled from: TranslationAnimationCreator */
    private static class C1339a extends AnimatorListenerAdapter implements Transition.C1281f {

        /* renamed from: a */
        private final View f5956a;

        /* renamed from: b */
        private final View f5957b;

        /* renamed from: c */
        private final int f5958c;

        /* renamed from: d */
        private final int f5959d;

        /* renamed from: e */
        private int[] f5960e;

        /* renamed from: f */
        private float f5961f;

        /* renamed from: g */
        private float f5962g;

        /* renamed from: h */
        private final float f5963h;

        /* renamed from: i */
        private final float f5964i;

        C1339a(View view, View view2, int i, int i2, float f, float f2) {
            this.f5957b = view;
            this.f5956a = view2;
            this.f5958c = i - Math.round(view.getTranslationX());
            this.f5959d = i2 - Math.round(view.getTranslationY());
            this.f5963h = f;
            this.f5964i = f2;
            int i3 = C5746b.transition_position;
            int[] iArr = (int[]) view2.getTag(i3);
            this.f5960e = iArr;
            if (iArr != null) {
                view2.setTag(i3, (Object) null);
            }
        }

        /* renamed from: a */
        public void mo6269a(Transition transition) {
        }

        /* renamed from: b */
        public void mo6183b(Transition transition) {
        }

        /* renamed from: c */
        public void mo6184c(Transition transition) {
            this.f5957b.setTranslationX(this.f5963h);
            this.f5957b.setTranslationY(this.f5964i);
            transition.mo6246i0(this);
        }

        /* renamed from: d */
        public void mo6185d(Transition transition) {
        }

        /* renamed from: e */
        public void mo6186e(Transition transition) {
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f5960e == null) {
                this.f5960e = new int[2];
            }
            this.f5960e[0] = Math.round(((float) this.f5958c) + this.f5957b.getTranslationX());
            this.f5960e[1] = Math.round(((float) this.f5959d) + this.f5957b.getTranslationY());
            this.f5956a.setTag(C5746b.transition_position, this.f5960e);
        }

        public void onAnimationPause(Animator animator) {
            this.f5961f = this.f5957b.getTranslationX();
            this.f5962g = this.f5957b.getTranslationY();
            this.f5957b.setTranslationX(this.f5963h);
            this.f5957b.setTranslationY(this.f5964i);
        }

        public void onAnimationResume(Animator animator) {
            this.f5957b.setTranslationX(this.f5961f);
            this.f5957b.setTranslationY(this.f5962g);
        }
    }

    /* renamed from: a */
    static Animator m7143a(View view, C1336u uVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
        float f5;
        float f6;
        View view2 = view;
        C1336u uVar2 = uVar;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) uVar2.f5950b.getTag(C5746b.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        C1339a aVar = new C1339a(view, uVar2.f5950b, round, round2, translationX, translationY);
        transition.mo6239a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        C1287a.m7000a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
