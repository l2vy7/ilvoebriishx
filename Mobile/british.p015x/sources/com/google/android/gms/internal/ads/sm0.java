package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class sm0 extends C8187td implements tm0 {
    public sm0() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
        } else if (i == 2) {
            mo34123a(parcel.readString());
        } else if (i != 3) {
            return false;
        } else {
            mo34122I1(parcel.readString(), parcel.readString(), (Bundle) C8223ud.m38292a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
