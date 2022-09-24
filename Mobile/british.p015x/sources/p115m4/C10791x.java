package p115m4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.cast.C8661o;

/* renamed from: m4.x */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public abstract class C10791x extends C8661o implements C10793y {
    /* renamed from: b2 */
    public static C10793y m48715b2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
        if (queryLocalInterface instanceof C10793y) {
            return (C10793y) queryLocalInterface;
        }
        return new C10789w(iBinder);
    }
}
