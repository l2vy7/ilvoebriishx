package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: androidx.transition.i0 */
/* compiled from: ViewUtilsApi22 */
class C1314i0 extends C1312h0 {

    /* renamed from: j */
    private static boolean f5903j = true;

    C1314i0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo6333f(View view, int i, int i2, int i3, int i4) {
        if (f5903j) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f5903j = false;
            }
        }
    }
}
