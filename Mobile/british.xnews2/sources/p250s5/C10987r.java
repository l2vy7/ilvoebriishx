package p250s5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p131p5.C10874h;

/* renamed from: s5.r */
public class C10987r extends C10874h implements C10986q {
    /* renamed from: b2 */
    public static C10986q m49326b2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return queryLocalInterface instanceof C10986q ? (C10986q) queryLocalInterface : new C10988s(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo43060x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw new NoSuchMethodError();
    }
}
