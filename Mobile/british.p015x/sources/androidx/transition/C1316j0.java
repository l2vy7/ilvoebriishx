package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: androidx.transition.j0 */
/* compiled from: ViewUtilsApi23 */
class C1316j0 extends C1314i0 {

    /* renamed from: k */
    private static boolean f5907k = true;

    C1316j0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo6334h(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo6334h(view, i);
        } else if (f5907k) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f5907k = false;
            }
        }
    }
}
