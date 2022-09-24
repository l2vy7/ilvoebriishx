package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ex */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C7662ex extends C8187td implements C7699fx {
    public C7662ex() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo31418J((zzbew) C8223ud.m38292a(parcel, zzbew.CREATOR));
        } else if (i == 2) {
            zzf();
        } else if (i == 3) {
            zzc();
        } else if (i == 4) {
            zze();
        } else if (i != 5) {
            return false;
        } else {
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
