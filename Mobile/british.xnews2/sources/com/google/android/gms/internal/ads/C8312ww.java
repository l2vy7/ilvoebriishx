package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ww */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8312ww extends C8152sd implements C8385yw {
    C8312ww(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: Y */
    public final void mo35445Y(String str, String str2) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        x.writeString(str2);
        mo34695f3(1, x);
    }
}
