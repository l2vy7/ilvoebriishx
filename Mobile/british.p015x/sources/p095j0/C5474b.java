package p095j0;

import android.os.Handler;
import android.os.Looper;

/* renamed from: j0.b */
/* compiled from: CalleeHandler */
class C5474b {
    /* renamed from: a */
    static Handler m24485a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
