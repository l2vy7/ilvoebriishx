package p259w4;

import android.os.Parcel;
import android.os.RemoteException;
import p228l5.C10714b;

/* renamed from: w4.k */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C11077k extends C10714b implements C11078l {
    public C11077k() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public final boolean mo42872b2(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo43349M2(parcel.readInt());
        return true;
    }
}
