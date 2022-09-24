package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8187td;
import com.google.android.gms.internal.ads.C8223ud;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class zzbu extends C8187td implements zzbv {
    public zzbu() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            boolean zzf = zzf(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            C8223ud.m38294c(parcel2, zzf);
        } else if (i != 2) {
            return false;
        } else {
            zze(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
            parcel2.writeNoException();
        }
        return true;
    }
}
