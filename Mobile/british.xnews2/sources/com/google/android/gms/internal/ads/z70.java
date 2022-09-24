package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class z70 extends C8187td implements a80 {
    public z70() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    /* renamed from: n6 */
    public static a80 m40189n6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        return queryLocalInterface instanceof a80 ? (a80) queryLocalInterface : new y70(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo30322a(parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
