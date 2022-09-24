package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.s0 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public abstract class C9338s0 extends C9292p0 implements C9354t0 {
    /* renamed from: b2 */
    public static C9354t0 m43595b2(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof C9354t0 ? (C9354t0) queryLocalInterface : new C9322r0(iBinder);
    }
}
