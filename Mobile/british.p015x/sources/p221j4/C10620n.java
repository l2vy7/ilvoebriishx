package p221j4;

import android.os.Parcel;
import android.os.RemoteException;
import p226k5.C10640b;

/* renamed from: j4.n */
public abstract class C10620n extends C10640b implements C10619m {
    public C10620n() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo42740x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzj();
        } else if (i != 2) {
            return false;
        } else {
            zzk();
        }
        return true;
    }
}
