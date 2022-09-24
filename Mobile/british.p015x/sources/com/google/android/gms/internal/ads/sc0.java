package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class sc0 extends C8187td implements tc0 {
    public sc0() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: n6 */
    public static tc0 m37373n6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof tc0 ? (tc0) queryLocalInterface : new rc0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            wc0 a = mo34307a(parcel.readString());
            parcel2.writeNoException();
            C8223ud.m38297f(parcel2, a);
        } else if (i == 2) {
            boolean c = mo34309c(parcel.readString());
            parcel2.writeNoException();
            C8223ud.m38294c(parcel2, c);
        } else if (i == 3) {
            te0 z = mo34311z(parcel.readString());
            parcel2.writeNoException();
            C8223ud.m38297f(parcel2, z);
        } else if (i != 4) {
            return false;
        } else {
            boolean b = mo34308b(parcel.readString());
            parcel2.writeNoException();
            C8223ud.m38294c(parcel2, b);
        }
        return true;
    }
}
