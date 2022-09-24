package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: androidx.transition.k0 */
/* compiled from: ViewUtilsApi29 */
class C1319k0 extends C1316j0 {
    C1319k0() {
    }

    /* renamed from: c */
    public float mo6321c(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: e */
    public void mo6330e(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* renamed from: f */
    public void mo6333f(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: g */
    public void mo6323g(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: h */
    public void mo6334h(View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: i */
    public void mo6331i(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: j */
    public void mo6332j(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
