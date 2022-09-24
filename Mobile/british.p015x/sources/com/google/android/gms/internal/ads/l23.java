package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import p199d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class l23 extends C8187td implements m23 {
    public l23() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                C10487a.C10488a.m48193b2(parcel.readStrongBinder());
                parcel.readString();
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                break;
            case 5:
                parcel.createByteArray();
                break;
            case 6:
                parcel.readInt();
                break;
            case 7:
                parcel.readInt();
                break;
            case 8:
                C10487a.C10488a.m48193b2(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
