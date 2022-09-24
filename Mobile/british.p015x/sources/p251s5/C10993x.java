package p251s5;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p132p5.C10874h;
import p132p5.C10878l;

/* renamed from: s5.x */
public abstract class C10993x extends C10874h implements C10992w {
    /* renamed from: b2 */
    public static C10992w m49332b2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof C10992w ? (C10992w) queryLocalInterface : new C10994y(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo43060x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        onLocationChanged((Location) C10878l.m48896a(parcel, Location.CREATOR));
        return true;
    }
}
