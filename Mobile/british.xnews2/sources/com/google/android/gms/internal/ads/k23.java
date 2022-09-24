package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class k23 extends C8152sd implements m23 {
    k23(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    /* renamed from: L */
    public final void mo33017L(byte[] bArr) throws RemoteException {
        Parcel x = mo34697x();
        x.writeByteArray(bArr);
        mo34695f3(5, x);
    }

    /* renamed from: U */
    public final void mo33018U(int[] iArr) throws RemoteException {
        Parcel x = mo34697x();
        x.writeIntArray((int[]) null);
        mo34695f3(4, x);
    }

    /* renamed from: Z4 */
    public final void mo33019Z4(C10487a aVar, String str, String str2) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        x.writeString(str);
        x.writeString((String) null);
        mo34695f3(8, x);
    }

    /* renamed from: k */
    public final void mo33020k(int i) throws RemoteException {
        Parcel x = mo34697x();
        x.writeInt(i);
        mo34695f3(7, x);
    }

    /* renamed from: o */
    public final void mo33021o(int i) throws RemoteException {
        Parcel x = mo34697x();
        x.writeInt(i);
        mo34695f3(6, x);
    }

    public final void zzf() throws RemoteException {
        mo34695f3(3, mo34697x());
    }
}
