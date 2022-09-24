package androidx.transition;

import android.os.IBinder;

/* renamed from: androidx.transition.m0 */
/* compiled from: WindowIdApi14 */
class C1323m0 implements C1327o0 {

    /* renamed from: a */
    private final IBinder f5920a;

    C1323m0(IBinder iBinder) {
        this.f5920a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1323m0) && ((C1323m0) obj).f5920a.equals(this.f5920a);
    }

    public int hashCode() {
        return this.f5920a.hashCode();
    }
}
