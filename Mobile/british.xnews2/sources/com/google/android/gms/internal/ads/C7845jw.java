package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.jw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C7845jw extends C8187td implements C7882kw {
    public C7845jw() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo31966i4((zzbfd) C8223ud.m38292a(parcel, zzbfd.CREATOR));
            parcel2.writeNoException();
        } else if (i == 2) {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        } else if (i == 3) {
            boolean zzi = zzi();
            parcel2.writeNoException();
            C8223ud.m38294c(parcel2, zzi);
        } else if (i == 4) {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        } else if (i != 5) {
            return false;
        } else {
            mo31967y0((zzbfd) C8223ud.m38292a(parcel, zzbfd.CREATOR), parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}
