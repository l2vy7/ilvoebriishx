package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class k40 extends C8187td implements l40 {
    public k40() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: n6 */
    public static l40 m33836n6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof l40 ? (l40) queryLocalInterface : new j40(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String f0 = mo32835f0(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(f0);
                return true;
            case 2:
                q30 c = mo32834c(parcel.readString());
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, c);
                return true;
            case 3:
                List<String> zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeStringList(zzj);
                return true;
            case 4:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 5:
                mo32832P(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                zzn();
                parcel2.writeNoException();
                return true;
            case 7:
                C7774hy zze = zze();
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zze);
                return true;
            case 8:
                zzk();
                parcel2.writeNoException();
                return true;
            case 9:
                C10487a zzg = zzg();
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, zzg);
                return true;
            case 10:
                boolean W = mo32833W(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                C8223ud.m38294c(parcel2, W);
                return true;
            case 11:
                parcel2.writeNoException();
                C8223ud.m38297f(parcel2, (IInterface) null);
                return true;
            case 12:
                boolean zzp = zzp();
                parcel2.writeNoException();
                C8223ud.m38294c(parcel2, zzp);
                return true;
            case 13:
                boolean zzr = zzr();
                parcel2.writeNoException();
                C8223ud.m38294c(parcel2, zzr);
                return true;
            case 14:
                mo32836g0(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                zzl();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
