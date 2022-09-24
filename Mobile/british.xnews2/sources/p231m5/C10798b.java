package p231m5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: m5.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C10798b extends Binder implements IInterface {
    protected C10798b(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo30147x(i, parcel, parcel2, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public boolean mo30147x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        return false;
    }
}
