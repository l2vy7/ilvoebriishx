package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class yc0 extends C8187td implements zc0 {
    public yc0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: n6 */
    public static zc0 m39852n6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof zc0 ? (zc0) queryLocalInterface : new xc0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                mo34073k(parcel.readInt());
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof dd0) {
                        dd0 dd0 = (dd0) queryLocalInterface;
                        break;
                    }
                }
                break;
            case 8:
                zzm();
                break;
            case 9:
                mo34066P4(parcel.readString(), parcel.readString());
                break;
            case 10:
                k40.m33836n6(parcel.readStrongBinder());
                parcel.readString();
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                break;
            case 13:
                mo34070d();
                break;
            case 14:
                mo34063A2((zzces) C8223ud.m38292a(parcel, zzces.CREATOR));
                break;
            case 15:
                mo34076r();
                break;
            case 16:
                mo34067Q4(xj0.m39486n6(parcel.readStrongBinder()));
                break;
            case 17:
                mo34069V(parcel.readInt());
                break;
            case 18:
                mo34074n();
                break;
            case 19:
                Bundle bundle = (Bundle) C8223ud.m38292a(parcel, Bundle.CREATOR);
                break;
            case 20:
                zzx();
                break;
            case 21:
                mo34064B(parcel.readString());
                break;
            case 22:
                mo34068T0(parcel.readInt(), parcel.readString());
                break;
            case 23:
                mo34071e5((zzbew) C8223ud.m38292a(parcel, zzbew.CREATOR));
                break;
            case 24:
                mo34065N((zzbew) C8223ud.m38292a(parcel, zzbew.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
