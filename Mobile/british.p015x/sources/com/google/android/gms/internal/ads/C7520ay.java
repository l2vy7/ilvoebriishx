package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ay */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C7520ay extends C8187td implements C7555by {
    public C7520ay() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    /* renamed from: n6 */
    public static C7555by m30548n6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof C7555by ? (C7555by) queryLocalInterface : new C8422zx(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo30821F5((zzbfk) C8223ud.m38292a(parcel, zzbfk.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
