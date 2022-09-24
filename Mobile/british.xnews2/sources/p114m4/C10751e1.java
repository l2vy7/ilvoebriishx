package p114m4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.cast.C8661o;

/* renamed from: m4.e1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public abstract class C10751e1 extends C8661o implements C10754f1 {
    /* renamed from: b2 */
    public static C10754f1 m48641b2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
        if (queryLocalInterface instanceof C10754f1) {
            return (C10754f1) queryLocalInterface;
        }
        return new C10748d1(iBinder);
    }
}
