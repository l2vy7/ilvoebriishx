package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;
import p199d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class pv0 extends C8187td implements qv0 {
    public pv0() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo32605i((Bundle) C8223ud.m38292a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle e = mo32602e((Bundle) C8223ud.m38292a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C8223ud.m38296e(parcel2, e);
                return true;
            case 3:
                mo32596F4(parcel.readString(), parcel.readString(), (Bundle) C8223ud.m38292a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                mo32601c5(parcel.readString(), parcel.readString(), C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                Map p5 = mo32606p5(parcel.readString(), parcel.readString(), C8223ud.m38298g(parcel));
                parcel2.writeNoException();
                parcel2.writeMap(p5);
                return true;
            case 6:
                int a = mo32600a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            case 7:
                zzq((Bundle) C8223ud.m38292a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                mo32597G5(parcel.readString(), parcel.readString(), (Bundle) C8223ud.m38292a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                List f4 = mo32603f4(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(f4);
                return true;
            case 10:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 11:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 12:
                long zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeLong(zzc);
                return true;
            case 13:
                mo32595B(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                mo32598J2(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                mo32604g3(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 17:
                String zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 18:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 19:
                mo32599X((Bundle) C8223ud.m38292a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
