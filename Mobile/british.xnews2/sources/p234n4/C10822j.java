package p234n4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.internal.cast.C8661o;

/* renamed from: n4.j */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public abstract class C10822j extends C8661o implements C10823k {
    public C10822j() {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo29574x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo42984T1(parcel.readLong(), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(C7355d.f29215a);
        }
        return true;
    }
}
