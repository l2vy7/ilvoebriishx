package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class tj0 extends C8187td implements uj0 {
    public tj0() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: n6 */
    public static uj0 m37867n6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof uj0 ? (uj0) queryLocalInterface : new sj0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzl(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                break;
            case 2:
                mo33502b0(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                mo33504v(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                break;
            case 4:
                zzj(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                break;
            case 5:
                mo33503g0(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                break;
            case 6:
                mo33506y(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                break;
            case 7:
                mo33505w0(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), (zzces) C8223ud.m38292a(parcel, zzces.CREATOR));
                break;
            case 8:
                zze(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                break;
            case 9:
                zzg(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                zzh(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                break;
            case 11:
                mo33501A5(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                break;
            case 12:
                Bundle bundle = (Bundle) C8223ud.m38292a(parcel, Bundle.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
