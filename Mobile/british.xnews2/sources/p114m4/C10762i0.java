package p114m4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.internal.cast.C8431a0;
import com.google.android.gms.internal.cast.C8661o;
import p198d5.C10487a;

/* renamed from: m4.i0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public abstract class C10762i0 extends C8661o implements C10765j0 {
    public C10762i0() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo29574x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                C10487a zzb = zzb();
                parcel2.writeNoException();
                C8431a0.m40681f(parcel2, zzb);
                return true;
            case 2:
                mo42937e((Bundle) C8431a0.m40678c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
                mo42939s1((Bundle) C8431a0.m40678c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                mo42938e0(C8431a0.m40676a(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                long zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeLong(zzi);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(C7355d.f29215a);
                return true;
            case 7:
                mo42940z3((Bundle) C8431a0.m40678c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                mo42936I((Bundle) C8431a0.m40678c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                mo42935H5((Bundle) C8431a0.m40678c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
