package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class z30 extends C8187td implements a40 {
    public z30() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    /* renamed from: n6 */
    public static a40 m40156n6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return queryLocalInterface instanceof a40 ? (a40) queryLocalInterface : new y30(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo18149K(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
        } else if (i == 2) {
            zzd();
        } else if (i != 3) {
            return false;
        } else {
            mo18150O(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
