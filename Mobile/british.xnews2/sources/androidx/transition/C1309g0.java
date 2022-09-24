package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: androidx.transition.g0 */
/* compiled from: ViewUtilsApi19 */
class C1309g0 extends C1321l0 {

    /* renamed from: f */
    private static boolean f5892f = true;

    C1309g0() {
    }

    /* renamed from: a */
    public void mo6320a(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public float mo6321c(View view) {
        if (f5892f) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f5892f = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo6322d(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo6323g(View view, float f) {
        if (f5892f) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f5892f = false;
            }
        }
        view.setAlpha(f);
    }
}
