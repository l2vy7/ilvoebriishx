package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p199d5.C10487a;

/* renamed from: com.google.android.gms.internal.ads.vd */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8260vd extends C8152sd implements C8330xd {
    C8260vd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    /* renamed from: L */
    public final void mo35406L(byte[] bArr) throws RemoteException {
        Parcel x = mo34697x();
        x.writeByteArray(bArr);
        mo34695f3(5, x);
    }

    /* renamed from: U */
    public final void mo35407U(int[] iArr) throws RemoteException {
        Parcel x = mo34697x();
        x.writeIntArray((int[]) null);
        mo34695f3(4, x);
    }

    /* renamed from: k */
    public final void mo35408k(int i) throws RemoteException {
        Parcel x = mo34697x();
        x.writeInt(i);
        mo34695f3(7, x);
    }

    /* renamed from: o */
    public final void mo35409o(int i) throws RemoteException {
        Parcel x = mo34697x();
        x.writeInt(0);
        mo34695f3(6, x);
    }

    /* renamed from: z0 */
    public final void mo35410z0(C10487a aVar, String str) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        x.writeString("GMA_SDK");
        mo34695f3(2, x);
    }

    public final void zzf() throws RemoteException {
        mo34695f3(3, mo34697x());
    }
}
