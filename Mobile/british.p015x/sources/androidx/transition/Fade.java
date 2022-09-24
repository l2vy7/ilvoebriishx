package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p010b0.C1532g;
import p111m0.C5723u;

public class Fade extends Visibility {

    /* renamed from: androidx.transition.Fade$a */
    class C1265a extends C1330r {

        /* renamed from: a */
        final /* synthetic */ View f5759a;

        C1265a(View view) {
            this.f5759a = view;
        }

        /* renamed from: c */
        public void mo6184c(Transition transition) {
            C1305f0.m7067h(this.f5759a, 1.0f);
            C1305f0.m7060a(this.f5759a);
            transition.mo6246i0(this);
        }
    }

    /* renamed from: androidx.transition.Fade$b */
    private static class C1266b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f5761a;

        /* renamed from: b */
        private boolean f5762b = false;

        C1266b(View view) {
            this.f5761a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C1305f0.m7067h(this.f5761a, 1.0f);
            if (this.f5762b) {
                this.f5761a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C5723u.m25290P(this.f5761a) && this.f5761a.getLayerType() == 0) {
                this.f5762b = true;
                this.f5761a.setLayerType(2, (Paint) null);
            }
        }
    }

    public Fade(int i) {
        mo6283D0(i);
    }

    /* renamed from: E0 */
    private Animator m6850E0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C1305f0.m7067h(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C1305f0.f5883b, new float[]{f2});
        ofFloat.addListener(new C1266b(view));
        mo6239a(new C1265a(view));
        return ofFloat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f5949a.get("android:fade:transitionAlpha");
     */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float m6851F0(androidx.transition.C1336u r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f5949a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Fade.m6851F0(androidx.transition.u, float):float");
    }

    /* renamed from: B0 */
    public Animator mo6214B0(ViewGroup viewGroup, View view, C1336u uVar, C1336u uVar2) {
        C1305f0.m7064e(view);
        return m6850E0(view, m6851F0(uVar, 1.0f), 0.0f);
    }

    /* renamed from: n */
    public void mo6153n(C1336u uVar) {
        super.mo6153n(uVar);
        uVar.f5949a.put("android:fade:transitionAlpha", Float.valueOf(C1305f0.m7062c(uVar.f5950b)));
    }

    /* renamed from: z0 */
    public Animator mo6215z0(ViewGroup viewGroup, View view, C1336u uVar, C1336u uVar2) {
        float f = 0.0f;
        float F0 = m6851F0(uVar, 0.0f);
        if (F0 != 1.0f) {
            f = F0;
        }
        return m6850E0(view, f, 1.0f);
    }

    public Fade() {
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1329q.f5930f);
        mo6283D0(C1532g.m7913k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, mo6284x0()));
        obtainStyledAttributes.recycle();
    }
}
