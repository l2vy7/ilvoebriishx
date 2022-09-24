package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.clearcut.zzc;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: com.google.android.gms.internal.clearcut.t5 */
public abstract class C9006t5 extends C9035y implements C8999s5 {
    public C9006t5() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo37170x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo37116y4((Status) C9036y0.m42499a(parcel, Status.CREATOR));
                return true;
            case 2:
                mo37153b5((Status) C9036y0.m42499a(parcel, Status.CREATOR));
                return true;
            case 3:
                mo37148M0((Status) C9036y0.m42499a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 4:
                mo37149P5((Status) C9036y0.m42499a(parcel, Status.CREATOR));
                return true;
            case 5:
                mo37152X5((Status) C9036y0.m42499a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 6:
                mo37151X3((Status) C9036y0.m42499a(parcel, Status.CREATOR), (zze[]) parcel.createTypedArray(zze.CREATOR));
                return true;
            case 7:
                mo37155g1((DataHolder) C9036y0.m42499a(parcel, DataHolder.CREATOR));
                return true;
            case 8:
                mo37154e4((Status) C9036y0.m42499a(parcel, Status.CREATOR), (zzc) C9036y0.m42499a(parcel, zzc.CREATOR));
                return true;
            case 9:
                mo37150T5((Status) C9036y0.m42499a(parcel, Status.CREATOR), (zzc) C9036y0.m42499a(parcel, zzc.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
