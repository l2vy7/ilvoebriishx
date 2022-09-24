package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* renamed from: androidx.transition.n0 */
/* compiled from: WindowIdApi18 */
class C1325n0 implements C1327o0 {

    /* renamed from: a */
    private final WindowId f5921a;

    C1325n0(View view) {
        this.f5921a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1325n0) && ((C1325n0) obj).f5921a.equals(this.f5921a);
    }

    public int hashCode() {
        return this.f5921a.hashCode();
    }
}
