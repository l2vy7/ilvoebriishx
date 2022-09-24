package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.C1336u;
import androidx.transition.Transition;
import java.util.Map;

/* renamed from: com.google.android.material.internal.k */
/* compiled from: TextScale */
public class C10217k extends Transition {

    /* renamed from: com.google.android.material.internal.k$a */
    /* compiled from: TextScale */
    class C10218a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TextView f48127a;

        C10218a(TextView textView) {
            this.f48127a = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f48127a.setScaleX(floatValue);
            this.f48127a.setScaleY(floatValue);
        }
    }

    /* renamed from: w0 */
    private void m47105w0(C1336u uVar) {
        View view = uVar.f5950b;
        if (view instanceof TextView) {
            uVar.f5949a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    /* renamed from: k */
    public void mo6152k(C1336u uVar) {
        m47105w0(uVar);
    }

    /* renamed from: n */
    public void mo6153n(C1336u uVar) {
        m47105w0(uVar);
    }

    /* renamed from: w */
    public Animator mo6154w(ViewGroup viewGroup, C1336u uVar, C1336u uVar2) {
        if (uVar == null || uVar2 == null || !(uVar.f5950b instanceof TextView)) {
            return null;
        }
        View view = uVar2.f5950b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = uVar.f5949a;
        Map<String, Object> map2 = uVar2.f5949a;
        float f = 1.0f;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        if (map2.get("android:textscale:scale") != null) {
            f = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (floatValue == f) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue, f});
        ofFloat.addUpdateListener(new C10218a(textView));
        return ofFloat;
    }
}
