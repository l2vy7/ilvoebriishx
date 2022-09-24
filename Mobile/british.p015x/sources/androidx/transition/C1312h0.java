package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: androidx.transition.h0 */
/* compiled from: ViewUtilsApi21 */
class C1312h0 extends C1309g0 {

    /* renamed from: g */
    private static boolean f5900g = true;

    /* renamed from: h */
    private static boolean f5901h = true;

    /* renamed from: i */
    private static boolean f5902i = true;

    C1312h0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo6330e(View view, Matrix matrix) {
        if (f5900g) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f5900g = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo6331i(View view, Matrix matrix) {
        if (f5901h) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f5901h = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: j */
    public void mo6332j(View view, Matrix matrix) {
        if (f5902i) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f5902i = false;
            }
        }
    }
}
