package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.g1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public final class C9156g1 extends C9276o0 implements C9186i1 {
    C9156g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* renamed from: e */
    public final void mo37383e(Bundle bundle) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43505d(x, bundle);
        mo37766f3(1, x);
    }
}
