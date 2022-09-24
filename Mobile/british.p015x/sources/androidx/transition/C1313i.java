package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.transition.i */
/* compiled from: GhostViewUtils */
class C1313i {
    /* renamed from: a */
    static C1302e m7096a(View view, ViewGroup viewGroup, Matrix matrix) {
        if (Build.VERSION.SDK_INT == 28) {
            return C1308g.m7075b(view, viewGroup, matrix);
        }
        return C1310h.m7085b(view, viewGroup, matrix);
    }

    /* renamed from: b */
    static void m7097b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            C1308g.m7079f(view);
        } else {
            C1310h.m7089f(view);
        }
    }
}
