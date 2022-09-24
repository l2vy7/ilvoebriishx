package p243q4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.zza;
import com.google.android.gms.cast.internal.zzy;
import com.google.android.gms.internal.cast.C8431a0;
import com.google.android.gms.internal.cast.C8661o;

/* renamed from: q4.f */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public abstract class C10930f extends C8661o implements C10932g {
    public C10930f() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo29574x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzb(parcel.readInt());
                return true;
            case 2:
                mo42845v5((ApplicationMetadata) C8431a0.m40678c(parcel, ApplicationMetadata.CREATOR), parcel.readString(), parcel.readString(), C8431a0.m40676a(parcel));
                return true;
            case 3:
                zzf(parcel.readInt());
                return true;
            case 4:
                mo42840f1(parcel.readString(), parcel.readDouble(), C8431a0.m40676a(parcel));
                return true;
            case 5:
                mo42835E(parcel.readString(), parcel.readString());
                return true;
            case 6:
                mo42838U0(parcel.readString(), parcel.createByteArray());
                return true;
            case 7:
                mo42843p(parcel.readInt());
                return true;
            case 8:
                mo42841k(parcel.readInt());
                return true;
            case 9:
                mo42842o(parcel.readInt());
                return true;
            case 10:
                mo42834D5(parcel.readString(), parcel.readLong(), parcel.readInt());
                return true;
            case 11:
                mo42846x1(parcel.readString(), parcel.readLong());
                return true;
            case 12:
                mo42839a2((zza) C8431a0.m40678c(parcel, zza.CREATOR));
                return true;
            case 13:
                mo42836H1((zzy) C8431a0.m40678c(parcel, zzy.CREATOR));
                return true;
            case 14:
                mo42837M(parcel.readInt());
                return true;
            case 15:
                mo42844s(parcel.readInt());
                return true;
            default:
                return false;
        }
    }
}
