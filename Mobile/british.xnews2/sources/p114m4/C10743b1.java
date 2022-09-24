package p114m4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.internal.cast.C8431a0;
import com.google.android.gms.internal.cast.C8661o;

/* renamed from: m4.b1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public abstract class C10743b1 extends C8661o implements C10746c1 {
    public C10743b1() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo29574x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo42920g(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
        } else if (i == 2) {
            mo42918I5(parcel.readString(), (LaunchOptions) C8431a0.m40678c(parcel, LaunchOptions.CREATOR));
            parcel2.writeNoException();
        } else if (i == 3) {
            mo42919a3(parcel.readString());
            parcel2.writeNoException();
        } else if (i == 4) {
            mo42921l(parcel.readInt());
            parcel2.writeNoException();
        } else if (i != 5) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(C7355d.f29215a);
        }
        return true;
    }
}
