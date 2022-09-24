package p112m1;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.C1336u;
import androidx.transition.Transition;

/* renamed from: m1.a */
/* compiled from: CircularPropagation */
public class C5745a extends C5749e {

    /* renamed from: b */
    private float f24387b = 3.0f;

    /* renamed from: h */
    private static float m25432h(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    /* renamed from: c */
    public long mo22518c(ViewGroup viewGroup, Transition transition, C1336u uVar, C1336u uVar2) {
        int i;
        int i2;
        int i3;
        if (uVar == null && uVar2 == null) {
            return 0;
        }
        if (uVar2 == null || mo22522e(uVar) == 0) {
            i = -1;
        } else {
            uVar = uVar2;
            i = 1;
        }
        int f = mo22523f(uVar);
        int g = mo22524g(uVar);
        Rect H = transition.mo6224H();
        if (H != null) {
            i3 = H.centerX();
            i2 = H.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int round = Math.round(((float) (iArr[0] + (viewGroup.getWidth() / 2))) + viewGroup.getTranslationX());
            i2 = Math.round(((float) (iArr[1] + (viewGroup.getHeight() / 2))) + viewGroup.getTranslationY());
            i3 = round;
        }
        float h = m25432h((float) f, (float) g, (float) i3, (float) i2) / m25432h(0.0f, 0.0f, (float) viewGroup.getWidth(), (float) viewGroup.getHeight());
        long C = transition.mo6223C();
        if (C < 0) {
            C = 300;
        }
        return (long) Math.round((((float) (C * ((long) i))) / this.f24387b) * h);
    }
}
