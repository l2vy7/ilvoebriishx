package p200d6;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p156u0.C6171a;
import p156u0.C6172b;
import p156u0.C6173c;

/* renamed from: d6.a */
/* compiled from: AnimationUtils */
public class C10493a {

    /* renamed from: a */
    public static final TimeInterpolator f49008a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f49009b = new C6172b();

    /* renamed from: c */
    public static final TimeInterpolator f49010c = new C6171a();

    /* renamed from: d */
    public static final TimeInterpolator f49011d = new C6173c();

    /* renamed from: e */
    public static final TimeInterpolator f49012e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m48198a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: b */
    public static float m48199b(float f, float f2, float f3, float f4, float f5) {
        if (f5 < f3) {
            return f;
        }
        return f5 > f4 ? f2 : m48198a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: c */
    public static int m48200c(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
