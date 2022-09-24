package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.xx */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C8349xx extends C8187td implements C8386yx {
    public C8349xx() {
        super("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    /* renamed from: n6 */
    public static C8386yx m39628n6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        return queryLocalInterface instanceof C8386yx ? (C8386yx) queryLocalInterface : new C8313wx(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zze();
        parcel2.writeNoException();
        return true;
    }
}
