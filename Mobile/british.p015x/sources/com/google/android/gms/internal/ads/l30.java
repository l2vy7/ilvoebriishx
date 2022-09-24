package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p199d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class l30 extends C8152sd implements n30 {
    l30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    public final float zze() throws RemoteException {
        Parcel b2 = mo34694b2(2, mo34697x());
        float readFloat = b2.readFloat();
        b2.recycle();
        return readFloat;
    }

    public final float zzf() throws RemoteException {
        Parcel b2 = mo34694b2(6, mo34697x());
        float readFloat = b2.readFloat();
        b2.recycle();
        return readFloat;
    }

    public final float zzg() throws RemoteException {
        Parcel b2 = mo34694b2(5, mo34697x());
        float readFloat = b2.readFloat();
        b2.recycle();
        return readFloat;
    }

    public final C7774hy zzh() throws RemoteException {
        Parcel b2 = mo34694b2(7, mo34697x());
        C7774hy n6 = C7736gy.m32737n6(b2.readStrongBinder());
        b2.recycle();
        return n6;
    }

    public final C10487a zzi() throws RemoteException {
        Parcel b2 = mo34694b2(4, mo34697x());
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    public final void zzj(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(3, x);
    }

    public final boolean zzk() throws RemoteException {
        Parcel b2 = mo34694b2(8, mo34697x());
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }
}
