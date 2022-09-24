package p259w4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p228l5.C10713a;
import p228l5.C10715c;

/* renamed from: w4.m */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C11079m extends C10713a {
    C11079m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    /* renamed from: n6 */
    public final void mo43352n6(C11078l lVar) throws RemoteException {
        Parcel x = mo42870x();
        C10715c.m48549d(x, lVar);
        mo42869m6(1, x);
    }
}
