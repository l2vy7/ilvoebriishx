package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class s30 extends C8152sd implements u30 {
    s30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: A */
    public final void mo31331A(C10487a aVar, int i) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        x.writeInt(i);
        mo34695f3(5, x);
    }

    /* renamed from: C2 */
    public final void mo31332C2(String str, C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        C8223ud.m38297f(x, aVar);
        mo34695f3(1, x);
    }

    /* renamed from: D */
    public final void mo31333D(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(7, x);
    }

    /* renamed from: I2 */
    public final void mo31334I2(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(3, x);
    }

    /* renamed from: S1 */
    public final void mo31335S1(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(9, x);
    }

    /* renamed from: U2 */
    public final void mo31336U2(n30 n30) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, n30);
        mo34695f3(8, x);
    }

    /* renamed from: a */
    public final C10487a mo31337a(String str) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        Parcel b2 = mo34694b2(2, x);
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    /* renamed from: k0 */
    public final void mo31338k0(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(6, x);
    }

    public final void zzc() throws RemoteException {
        mo34695f3(4, mo34697x());
    }
}
