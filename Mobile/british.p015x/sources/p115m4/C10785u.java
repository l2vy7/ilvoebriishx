package p115m4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C8430a;
import p199d5.C10487a;

/* renamed from: m4.u */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C10785u extends C8430a implements C10787v {
    C10785u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }

    public final C10487a zze() throws RemoteException {
        Parcel b2 = mo36362b2(5, mo36365x());
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }
}
