package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class h50 extends C8187td implements i50 {
    public h50() {
        super("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    /* renamed from: n6 */
    public static i50 m32815n6(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return queryLocalInterface instanceof i50 ? (i50) queryLocalInterface : new g50(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        boolean O = mo32009O(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
        parcel2.writeNoException();
        C8223ud.m38294c(parcel2, O);
        return true;
    }
}
