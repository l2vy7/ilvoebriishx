package p114m4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.cast.C8661o;

/* renamed from: m4.a0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public abstract class C10740a0 extends C8661o implements C10742b0 {
    /* renamed from: b2 */
    public static C10742b0 m48624b2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
        if (queryLocalInterface instanceof C10742b0) {
            return (C10742b0) queryLocalInterface;
        }
        return new C10795z(iBinder);
    }
}
