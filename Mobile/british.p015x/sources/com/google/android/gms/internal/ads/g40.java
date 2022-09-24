package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p199d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class g40 extends C8187td implements h40 {
    public g40() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                C10487a zzg = zzg();
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzg);
                return true;
            case 3:
                String zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeList(zzm);
                return true;
            case 5:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 6:
                q30 zze = zze();
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zze);
                return true;
            case 7:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 8:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 9:
                Bundle zzb = zzb();
                parcel2.writeNoException();
                C8223ud.m38296e(parcel2, zzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                C7774hy zzc = zzc();
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzc);
                return true;
            case 12:
                mo32330M1((Bundle) C8223ud.m38292a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzq = zzq((Bundle) C8223ud.m38292a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C8223ud.m38294c(parcel2, zzq);
                return true;
            case 14:
                mo32331i((Bundle) C8223ud.m38292a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                i30 zzd = zzd();
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzd);
                return true;
            case 16:
                C10487a zzf = zzf();
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzf);
                return true;
            case 17:
                String zzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            default:
                return false;
        }
    }
}
