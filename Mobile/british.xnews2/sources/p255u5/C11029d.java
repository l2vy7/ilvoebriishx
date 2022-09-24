package p255u5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C9292p0;
import com.google.android.gms.internal.measurement.C9307q0;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzks;
import com.google.android.gms.measurement.internal.zzp;
import java.util.List;

/* renamed from: u5.d */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public abstract class C11029d extends C9292p0 implements C11030e {
    public C11029d() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo37519x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo38849t5((zzau) C9307q0.m43502a(parcel, zzau.CREATOR), (zzp) C9307q0.m43502a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                mo38834J1((zzks) C9307q0.m43502a(parcel, zzks.CREATOR), (zzp) C9307q0.m43502a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                mo38832H2((zzp) C9307q0.m43502a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                mo38831G0((zzau) C9307q0.m43502a(parcel, zzau.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo38843e3((zzp) C9307q0.m43502a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List Y4 = mo38842Y4((zzp) C9307q0.m43502a(parcel, zzp.CREATOR), C9307q0.m43507f(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(Y4);
                return true;
            case 9:
                byte[] Q5 = mo38839Q5((zzau) C9307q0.m43502a(parcel, zzau.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(Q5);
                return true;
            case 10:
                mo38830E3(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String t1 = mo38848t1((zzp) C9307q0.m43502a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(t1);
                return true;
            case 12:
                mo38833I0((zzab) C9307q0.m43502a(parcel, zzab.CREATOR), (zzp) C9307q0.m43502a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                mo38838P1((zzab) C9307q0.m43502a(parcel, zzab.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List N3 = mo38836N3(parcel.readString(), parcel.readString(), C9307q0.m43507f(parcel), (zzp) C9307q0.m43502a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(N3);
                return true;
            case 15:
                List P0 = mo38837P0(parcel.readString(), parcel.readString(), parcel.readString(), C9307q0.m43507f(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(P0);
                return true;
            case 16:
                List L2 = mo38835L2(parcel.readString(), parcel.readString(), (zzp) C9307q0.m43502a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(L2);
                return true;
            case 17:
                List V1 = mo38840V1(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(V1);
                return true;
            case 18:
                mo38841Y0((zzp) C9307q0.m43502a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                mo38850x0((Bundle) C9307q0.m43502a(parcel, Bundle.CREATOR), (zzp) C9307q0.m43502a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                mo38829C3((zzp) C9307q0.m43502a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
