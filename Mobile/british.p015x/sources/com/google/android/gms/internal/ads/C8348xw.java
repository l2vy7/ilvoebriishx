package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.xw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C8348xw extends C8187td implements C8385yw {
    public C8348xw() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: n6 */
    public static C8385yw m39619n6(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof C8385yw ? (C8385yw) queryLocalInterface : new C8312ww(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo35445Y(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
