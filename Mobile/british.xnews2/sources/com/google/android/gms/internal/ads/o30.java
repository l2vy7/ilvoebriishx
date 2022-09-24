package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class o30 extends C8152sd implements q30 {
    o30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public final double zzb() throws RemoteException {
        Parcel b2 = mo34694b2(3, mo34697x());
        double readDouble = b2.readDouble();
        b2.recycle();
        return readDouble;
    }

    public final int zzc() throws RemoteException {
        Parcel b2 = mo34694b2(5, mo34697x());
        int readInt = b2.readInt();
        b2.recycle();
        return readInt;
    }

    public final int zzd() throws RemoteException {
        Parcel b2 = mo34694b2(4, mo34697x());
        int readInt = b2.readInt();
        b2.recycle();
        return readInt;
    }

    public final Uri zze() throws RemoteException {
        Parcel b2 = mo34694b2(2, mo34697x());
        Uri uri = (Uri) C8223ud.m38292a(b2, Uri.CREATOR);
        b2.recycle();
        return uri;
    }

    public final C10487a zzf() throws RemoteException {
        Parcel b2 = mo34694b2(1, mo34697x());
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }
}
