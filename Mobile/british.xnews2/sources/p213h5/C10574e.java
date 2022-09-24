package p213h5;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: h5.e */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public abstract class C10574e extends C10571b implements C10575f {
    /* renamed from: x */
    public static C10575f m48319x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (queryLocalInterface instanceof C10575f) {
            return (C10575f) queryLocalInterface;
        }
        return new C10573d(iBinder);
    }
}
