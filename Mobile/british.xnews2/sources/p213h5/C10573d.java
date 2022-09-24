package p213h5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: h5.d */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public final class C10573d extends C10570a implements C10575f {
    C10573d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: C */
    public final boolean mo42693C(boolean z) throws RemoteException {
        Parcel x = mo42692x();
        C10572c.m48316a(x, true);
        Parcel b2 = mo42691b2(2, x);
        boolean b = C10572c.m48317b(b2);
        b2.recycle();
        return b;
    }

    public final String zzc() throws RemoteException {
        Parcel b2 = mo42691b2(1, mo42692x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final boolean zzd() throws RemoteException {
        Parcel b2 = mo42691b2(6, mo42692x());
        boolean b = C10572c.m48317b(b2);
        b2.recycle();
        return b;
    }
}
