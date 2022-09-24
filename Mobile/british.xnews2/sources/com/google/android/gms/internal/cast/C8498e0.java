package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.cast.e0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8498e0 extends C8430a {
    C8498e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
    }

    /* renamed from: n6 */
    public final void mo36455n6(C8481d0 d0Var) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40681f(x, d0Var);
        mo36364m6(6, x);
    }

    public final void zze() throws RemoteException {
        mo36364m6(3, mo36365x());
    }
}
