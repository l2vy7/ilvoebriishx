package p244q4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C8430a;
import com.google.android.gms.internal.cast.C8431a0;

/* renamed from: q4.h */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10934h extends C8430a {
    C10934h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastService");
    }

    /* renamed from: n6 */
    public final void mo43220n6(C10926d dVar, String[] strArr) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40681f(x, dVar);
        x.writeStringArray(strArr);
        mo36364m6(5, x);
    }

    /* renamed from: o6 */
    public final void mo43221o6(C10926d dVar, String[] strArr) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40681f(x, dVar);
        x.writeStringArray(strArr);
        mo36364m6(6, x);
    }

    /* renamed from: p6 */
    public final void mo43222p6(C10926d dVar, String[] strArr) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40681f(x, dVar);
        x.writeStringArray(strArr);
        mo36364m6(7, x);
    }
}
