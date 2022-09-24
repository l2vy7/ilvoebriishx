package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ky */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C7884ky extends C8187td implements C7921ly {
    public C7884ky() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzi();
        } else if (i == 2) {
            zzh();
        } else if (i == 3) {
            zzg();
        } else if (i == 4) {
            zze();
        } else if (i != 5) {
            return false;
        } else {
            mo32996d5(C8223ud.m38298g(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
