package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class li0 extends C8152sd implements ni0 {
    li0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* renamed from: X2 */
    public final void mo31078X2(zzcdq zzcdq, ri0 ri0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzcdq);
        C8223ud.m38297f(x, ri0);
        mo34695f3(4, x);
    }

    /* renamed from: d1 */
    public final void mo31079d1(zzcdq zzcdq, ri0 ri0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzcdq);
        C8223ud.m38297f(x, ri0);
        mo34695f3(6, x);
    }

    /* renamed from: h0 */
    public final void mo31080h0(zzcdq zzcdq, ri0 ri0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzcdq);
        C8223ud.m38297f(x, ri0);
        mo34695f3(5, x);
    }

    /* renamed from: n0 */
    public final void mo31081n0(String str, ri0 ri0) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        C8223ud.m38297f(x, ri0);
        mo34695f3(7, x);
    }
}
