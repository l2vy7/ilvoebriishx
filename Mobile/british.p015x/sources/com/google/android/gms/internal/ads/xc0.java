package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class xc0 extends C8152sd implements zc0 {
    xc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: A2 */
    public final void mo34063A2(zzces zzces) throws RemoteException {
        throw null;
    }

    /* renamed from: B */
    public final void mo34064B(String str) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        mo34695f3(21, x);
    }

    /* renamed from: N */
    public final void mo34065N(zzbew zzbew) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbew);
        mo34695f3(24, x);
    }

    /* renamed from: P4 */
    public final void mo34066P4(String str, String str2) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        x.writeString(str2);
        mo34695f3(9, x);
    }

    /* renamed from: Q4 */
    public final void mo34067Q4(yj0 yj0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, yj0);
        mo34695f3(16, x);
    }

    /* renamed from: T0 */
    public final void mo34068T0(int i, String str) throws RemoteException {
        Parcel x = mo34697x();
        x.writeInt(i);
        x.writeString(str);
        mo34695f3(22, x);
    }

    /* renamed from: V */
    public final void mo34069V(int i) throws RemoteException {
        throw null;
    }

    /* renamed from: d */
    public final void mo34070d() throws RemoteException {
        mo34695f3(13, mo34697x());
    }

    /* renamed from: e5 */
    public final void mo34071e5(zzbew zzbew) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbew);
        mo34695f3(23, x);
    }

    /* renamed from: k */
    public final void mo34073k(int i) throws RemoteException {
        Parcel x = mo34697x();
        x.writeInt(i);
        mo34695f3(3, x);
    }

    /* renamed from: n */
    public final void mo34074n() throws RemoteException {
        mo34695f3(18, mo34697x());
    }

    /* renamed from: r */
    public final void mo34076r() throws RemoteException {
        mo34695f3(15, mo34697x());
    }

    /* renamed from: w1 */
    public final void mo34077w1(l40 l40, String str) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, l40);
        x.writeString(str);
        mo34695f3(10, x);
    }

    public final void zze() throws RemoteException {
        mo34695f3(1, mo34697x());
    }

    public final void zzf() throws RemoteException {
        mo34695f3(2, mo34697x());
    }

    public final void zzm() throws RemoteException {
        mo34695f3(8, mo34697x());
    }

    public final void zzn() throws RemoteException {
        mo34695f3(4, mo34697x());
    }

    public final void zzo() throws RemoteException {
        mo34695f3(6, mo34697x());
    }

    public final void zzp() throws RemoteException {
        mo34695f3(5, mo34697x());
    }

    public final void zzv() throws RemoteException {
        mo34695f3(11, mo34697x());
    }

    public final void zzx() throws RemoteException {
        mo34695f3(20, mo34697x());
    }
}
