package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import p199d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class ge0 extends C8187td implements he0 {
    public ge0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzg(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
        } else if (i == 2) {
            mo31120b(parcel.readString());
        } else if (i == 3) {
            mo31121m((zzbew) C8223ud.m38292a(parcel, zzbew.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            mo31122r3(bd0.m30666n6(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
