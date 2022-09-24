package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p199d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class hd0 extends C8187td implements id0 {
    public hd0() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: n6 */
    public static id0 m32858n6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof id0 ? (id0) queryLocalInterface : new gd0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 3:
                List zzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(zzv);
                return true;
            case 4:
                String zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 5:
                q30 zzl = zzl();
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzl);
                return true;
            case 6:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 7:
                String zzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzp);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                String n = mo31206n();
                parcel2.writeNoException();
                parcel2.writeString(n);
                return true;
            case 10:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 11:
                C7774hy zzj = zzj();
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzj);
                return true;
            case 12:
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, (IInterface) null);
                return true;
            case 13:
                C10487a zzm = zzm();
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzm);
                return true;
            case 14:
                C10487a zzn = zzn();
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzn);
                return true;
            case 15:
                C10487a zzo = zzo();
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzo);
                return true;
            case 16:
                Bundle zzi = zzi();
                parcel2.writeNoException();
                C8223ud.m38296e(parcel2, zzi);
                return true;
            case 17:
                boolean zzB = zzB();
                parcel2.writeNoException();
                C8223ud.m38294c(parcel2, zzB);
                return true;
            case 18:
                boolean zzA = zzA();
                parcel2.writeNoException();
                C8223ud.m38294c(parcel2, zzA);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                mo31203J5(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 21:
                mo31205m0(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), C10487a.C10488a.m48193b2(parcel.readStrongBinder()), C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                mo31204O3(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 23:
                float zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 24:
                float zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(zzh);
                return true;
            case 25:
                float zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            default:
                return false;
        }
    }
}
