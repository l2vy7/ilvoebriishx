package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class sj0 extends C8152sd implements uj0 {
    sj0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: A5 */
    public final void mo33501A5(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(11, x);
    }

    /* renamed from: g0 */
    public final void mo33503g0(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(5, x);
    }

    /* renamed from: v */
    public final void mo33504v(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(3, x);
    }

    /* renamed from: w0 */
    public final void mo33505w0(C10487a aVar, zzces zzces) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38295d(x, zzces);
        mo34695f3(7, x);
    }

    /* renamed from: y */
    public final void mo33506y(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(6, x);
    }

    public final void zze(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(8, x);
    }

    public final void zzg(C10487a aVar, int i) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        x.writeInt(i);
        mo34695f3(9, x);
    }

    public final void zzj(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(4, x);
    }

    public final void zzl(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(1, x);
    }
}
