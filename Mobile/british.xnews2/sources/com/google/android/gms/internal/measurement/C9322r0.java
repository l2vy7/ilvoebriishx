package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.r0 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9322r0 extends C9276o0 implements C9354t0 {
    C9322r0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: e */
    public final Bundle mo37968e(Bundle bundle) throws RemoteException {
        Parcel x = mo37767x();
        C9307q0.m43505d(x, bundle);
        Parcel b2 = mo37765b2(1, x);
        Bundle bundle2 = (Bundle) C9307q0.m43502a(b2, Bundle.CREATOR);
        b2.recycle();
        return bundle2;
    }
}
