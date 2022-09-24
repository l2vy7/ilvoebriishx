package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.zv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C8420zv extends C8187td implements C7518aw {
    public C8420zv() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
