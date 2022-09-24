package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import p111m0.C5723u;

/* renamed from: androidx.transition.f0 */
/* compiled from: ViewUtils */
class C1305f0 {

    /* renamed from: a */
    private static final C1321l0 f5882a;

    /* renamed from: b */
    static final Property<View, Float> f5883b = new C1306a(Float.class, "translationAlpha");

    /* renamed from: c */
    static final Property<View, Rect> f5884c = new C1307b(Rect.class, "clipBounds");

    /* renamed from: androidx.transition.f0$a */
    /* compiled from: ViewUtils */
    static class C1306a extends Property<View, Float> {
        C1306a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C1305f0.m7062c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C1305f0.m7067h(view, f.floatValue());
        }
    }

    /* renamed from: androidx.transition.f0$b */
    /* compiled from: ViewUtils */
    static class C1307b extends Property<View, Rect> {
        C1307b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C5723u.m25341u(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            C5723u.m25342u0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f5882a = new C1319k0();
        } else if (i >= 23) {
            f5882a = new C1316j0();
        } else if (i >= 22) {
            f5882a = new C1314i0();
        } else if (i >= 21) {
            f5882a = new C1312h0();
        } else if (i >= 19) {
            f5882a = new C1309g0();
        } else {
            f5882a = new C1321l0();
        }
    }

    /* renamed from: a */
    static void m7060a(View view) {
        f5882a.mo6320a(view);
    }

    /* renamed from: b */
    static C1303e0 m7061b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C1301d0(view);
        }
        return C1294c0.m7011e(view);
    }

    /* renamed from: c */
    static float m7062c(View view) {
        return f5882a.mo6321c(view);
    }

    /* renamed from: d */
    static C1327o0 m7063d(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C1325n0(view);
        }
        return new C1323m0(view.getWindowToken());
    }

    /* renamed from: e */
    static void m7064e(View view) {
        f5882a.mo6322d(view);
    }

    /* renamed from: f */
    static void m7065f(View view, Matrix matrix) {
        f5882a.mo6330e(view, matrix);
    }

    /* renamed from: g */
    static void m7066g(View view, int i, int i2, int i3, int i4) {
        f5882a.mo6333f(view, i, i2, i3, i4);
    }

    /* renamed from: h */
    static void m7067h(View view, float f) {
        f5882a.mo6323g(view, f);
    }

    /* renamed from: i */
    static void m7068i(View view, int i) {
        f5882a.mo6334h(view, i);
    }

    /* renamed from: j */
    static void m7069j(View view, Matrix matrix) {
        f5882a.mo6331i(view, matrix);
    }

    /* renamed from: k */
    static void m7070k(View view, Matrix matrix) {
        f5882a.mo6332j(view, matrix);
    }
}
