package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p199d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class vm0 extends C8187td implements wm0 {
    public vm0() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static wm0 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof wm0 ? (wm0) queryLocalInterface : new um0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        tm0 tm0 = null;
        switch (i) {
            case 1:
                C10487a b2 = C10487a.C10488a.m48193b2(parcel.readStrongBinder());
                zzchx zzchx = (zzchx) C8223ud.m38292a(parcel, zzchx.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    tm0 = queryLocalInterface instanceof tm0 ? (tm0) queryLocalInterface : new rm0(readStrongBinder);
                }
                zze(b2, zzchx, tm0);
                parcel2.writeNoException();
                return true;
            case 2:
                zzh(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                C10487a.C10488a.m48193b2(parcel.readStrongBinder());
                C10487a.C10488a.m48193b2(parcel.readStrongBinder());
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, (IInterface) null);
                return true;
            case 4:
                C10487a.C10488a.m48193b2(parcel.readStrongBinder());
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, (IInterface) null);
                return true;
            case 5:
                zzj(parcel.createTypedArrayList(Uri.CREATOR), C10487a.C10488a.m48193b2(parcel.readStrongBinder()), nh0.m35161n6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                zzi(parcel.createTypedArrayList(Uri.CREATOR), C10487a.C10488a.m48193b2(parcel.readStrongBinder()), nh0.m35161n6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                zzf((zzcco) C8223ud.m38292a(parcel, zzcco.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zzg(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
