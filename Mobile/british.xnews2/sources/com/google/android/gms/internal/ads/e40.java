package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class e40 extends C8187td implements f40 {
    public e40() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                C10487a zzh = zzh();
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzh);
                return true;
            case 3:
                String zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzo = zzo();
                parcel2.writeNoException();
                parcel2.writeList(zzo);
                return true;
            case 5:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 6:
                q30 zzf = zzf();
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzf);
                return true;
            case 7:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 8:
                double zzb = zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(zzb);
                return true;
            case 9:
                String zzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzn);
                return true;
            case 10:
                String zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(zzm);
                return true;
            case 11:
                Bundle zzc = zzc();
                parcel2.writeNoException();
                C8223ud.m38296e(parcel2, zzc);
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                C7774hy zzd = zzd();
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzd);
                return true;
            case 14:
                zzq((Bundle) C8223ud.m38292a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                boolean T = mo31723T((Bundle) C8223ud.m38292a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C8223ud.m38294c(parcel2, T);
                return true;
            case 16:
                mo31724X((Bundle) C8223ud.m38292a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                i30 zze = zze();
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zze);
                return true;
            case 18:
                C10487a zzg = zzg();
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzg);
                return true;
            case 19:
                String zzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            default:
                return false;
        }
    }
}
