package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p199d5.C10487a;

/* renamed from: com.google.android.gms.internal.ads.ax */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C7519ax extends C8187td implements C7554bx {
    public C7519ax() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                C8136rw zzd = zzd(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), (zzbfi) C8223ud.m38292a(parcel, zzbfi.CREATOR), parcel.readString(), sc0.m37373n6(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzd);
                return true;
            case 2:
                C8136rw zze = zze(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), (zzbfi) C8223ud.m38292a(parcel, zzbfi.CREATOR), parcel.readString(), sc0.m37373n6(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zze);
                return true;
            case 3:
                C7993nw zzb = zzb(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), parcel.readString(), sc0.m37373n6(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzb);
                return true;
            case 4:
                C10487a.C10488a.m48193b2(parcel.readStrongBinder());
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, (IInterface) null);
                return true;
            case 5:
                u30 zzh = zzh(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzh);
                return true;
            case 6:
                nj0 zzm = zzm(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), sc0.m37373n6(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzm);
                return true;
            case 7:
                C10487a.C10488a.m48193b2(parcel.readStrongBinder());
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, (IInterface) null);
                return true;
            case 8:
                yg0 zzl = zzl(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzl);
                return true;
            case 9:
                C7846jx zzg = zzg(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzg);
                return true;
            case 10:
                C8136rw zzf = zzf(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), (zzbfi) C8223ud.m38292a(parcel, zzbfi.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzf);
                return true;
            case 11:
                a40 zzi = zzi(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), C10487a.C10488a.m48193b2(parcel.readStrongBinder()), C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzi);
                return true;
            case 12:
                bk0 zzn = zzn(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), parcel.readString(), sc0.m37373n6(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzn);
                return true;
            case 13:
                C8136rw zzc = zzc(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), (zzbfi) C8223ud.m38292a(parcel, zzbfi.CREATOR), parcel.readString(), sc0.m37373n6(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzc);
                return true;
            case 14:
                wm0 zzo = zzo(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), sc0.m37373n6(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzo);
                return true;
            case 15:
                mg0 zzk = zzk(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), sc0.m37373n6(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzk);
                return true;
            case 16:
                d80 zzj = zzj(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), sc0.m37373n6(parcel.readStrongBinder()), parcel.readInt(), z70.m40189n6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzj);
                return true;
            default:
                return false;
        }
    }
}
