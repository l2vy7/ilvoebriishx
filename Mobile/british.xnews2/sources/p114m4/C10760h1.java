package p114m4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.cast.C8661o;

/* renamed from: m4.h1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public abstract class C10760h1 extends C8661o implements C10763i1 {
    /* renamed from: b2 */
    public static C10763i1 m48657b2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
        if (queryLocalInterface instanceof C10763i1) {
            return (C10763i1) queryLocalInterface;
        }
        return new C10757g1(iBinder);
    }
}
