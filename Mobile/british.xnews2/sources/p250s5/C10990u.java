package p250s5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import p131p5.C10874h;
import p131p5.C10878l;

/* renamed from: s5.u */
public abstract class C10990u extends C10874h implements C10989t {
    /* renamed from: b2 */
    public static C10989t m49330b2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof C10989t ? (C10989t) queryLocalInterface : new C10991v(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo43060x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo37277B4((LocationResult) C10878l.m48896a(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo37278u3((LocationAvailability) C10878l.m48896a(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
