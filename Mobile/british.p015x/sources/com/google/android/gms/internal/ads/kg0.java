package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p199d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class kg0 extends C8152sd implements mg0 {
    kg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    /* renamed from: i0 */
    public final void mo33079i0(Intent intent) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, intent);
        mo34695f3(1, x);
    }

    /* renamed from: l0 */
    public final void mo33080l0(C10487a aVar, String str, String str2) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        x.writeString(str);
        x.writeString(str2);
        mo34695f3(2, x);
    }

    public final void zzf() throws RemoteException {
        mo34695f3(3, mo34697x());
    }
}
