package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class mi0 extends C8187td implements ni0 {
    public mi0() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        ri0 ri0 = null;
        if (i == 1) {
            zzcdc zzcdc = (zzcdc) C8223ud.m38292a(parcel, zzcdc.CREATOR);
            parcel2.writeNoException();
            C8223ud.m38296e(parcel2, (Parcelable) null);
        } else if (i == 2) {
            zzcdc zzcdc2 = (zzcdc) C8223ud.m38292a(parcel, zzcdc.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof oi0) {
                    oi0 oi0 = (oi0) queryLocalInterface;
                }
            }
            parcel2.writeNoException();
        } else if (i == 4) {
            zzcdq zzcdq = (zzcdq) C8223ud.m38292a(parcel, zzcdq.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                ri0 = queryLocalInterface2 instanceof ri0 ? (ri0) queryLocalInterface2 : new pi0(readStrongBinder2);
            }
            mo31078X2(zzcdq, ri0);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzcdq zzcdq2 = (zzcdq) C8223ud.m38292a(parcel, zzcdq.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                ri0 = queryLocalInterface3 instanceof ri0 ? (ri0) queryLocalInterface3 : new pi0(readStrongBinder3);
            }
            mo31080h0(zzcdq2, ri0);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzcdq zzcdq3 = (zzcdq) C8223ud.m38292a(parcel, zzcdq.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                ri0 = queryLocalInterface4 instanceof ri0 ? (ri0) queryLocalInterface4 : new pi0(readStrongBinder4);
            }
            mo31079d1(zzcdq3, ri0);
            parcel2.writeNoException();
        } else if (i != 7) {
            return false;
        } else {
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                ri0 = queryLocalInterface5 instanceof ri0 ? (ri0) queryLocalInterface5 : new pi0(readStrongBinder5);
            }
            mo31081n0(readString, ri0);
            parcel2.writeNoException();
        }
        return true;
    }
}
