package p114m4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.internal.cast.C8431a0;
import com.google.android.gms.internal.cast.C8661o;
import p198d5.C10487a;

/* renamed from: m4.e0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public abstract class C10750e0 extends C8661o implements C10753f0 {
    public C10750e0() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
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
                mo22555K(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                mo22560q1(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                mo22554A(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5:
                mo22561y(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                zzg(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                mo22559m4(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 8:
                mo22556U3(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), C8431a0.m40676a(parcel));
                parcel2.writeNoException();
                return true;
            case 9:
                mo22558f6(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 10:
                mo22557b0(C10487a.C10488a.m48193b2(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(C7355d.f29215a);
                return true;
            default:
                return false;
        }
    }
}
