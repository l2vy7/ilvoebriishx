package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class kk0 extends C8152sd {
    kk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    /* renamed from: n6 */
    public final void mo33103n6(yj0 yj0, String str, String str2) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, yj0);
        x.writeString(str);
        x.writeString(str2);
        mo34695f3(2, x);
    }
}
