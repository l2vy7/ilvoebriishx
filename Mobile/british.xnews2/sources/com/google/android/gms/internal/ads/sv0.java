package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class sv0 extends C8187td implements tv0 {
    /* renamed from: n6 */
    public static tv0 m37574n6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return queryLocalInterface instanceof tv0 ? (tv0) queryLocalInterface : new rv0(iBinder);
    }
}
