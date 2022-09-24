package com.google.ads.interactivemedia.p039v3.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.apw */
/* compiled from: IMASDK */
public final class apw extends C4070ii implements apy {
    apw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IClearcut");
    }

    /* renamed from: e */
    public final void mo14200e() throws RemoteException {
        mo15921c(3, mo15918a());
    }

    /* renamed from: f */
    public final void mo14201f(byte[] bArr) throws RemoteException {
        Parcel a = mo15918a();
        a.writeByteArray(bArr);
        mo15921c(5, a);
    }

    /* renamed from: g */
    public final void mo14202g(int i) throws RemoteException {
        Parcel a = mo15918a();
        a.writeInt(i);
        mo15921c(6, a);
    }

    /* renamed from: h */
    public final void mo14203h(int i) throws RemoteException {
        Parcel a = mo15918a();
        a.writeInt(i);
        mo15921c(7, a);
    }

    /* renamed from: i */
    public final void mo14204i(C3847api api) throws RemoteException {
        Parcel a = mo15918a();
        C4072ik.m17382e(a, api);
        a.writeString("ADSHIELD");
        a.writeString((String) null);
        mo15921c(8, a);
    }

    /* renamed from: j */
    public final void mo14205j() throws RemoteException {
        Parcel a = mo15918a();
        a.writeIntArray((int[]) null);
        mo15921c(4, a);
    }
}
