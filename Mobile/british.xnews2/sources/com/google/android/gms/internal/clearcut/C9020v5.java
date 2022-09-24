package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.clearcut.zze;

/* renamed from: com.google.android.gms.internal.clearcut.v5 */
public final class C9020v5 extends C8846a implements C9013u5 {
    C9020v5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    /* renamed from: L1 */
    public final void mo37189L1(C8999s5 s5Var, zze zze) throws RemoteException {
        Parcel x = mo36798x();
        C9036y0.m42500b(x, s5Var);
        C9036y0.m42501c(x, zze);
        mo36797b2(1, x);
    }
}
