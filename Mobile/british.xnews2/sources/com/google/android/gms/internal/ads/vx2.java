package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class vx2 extends C8187td implements wx2 {
    /* renamed from: n6 */
    public static wx2 m38980n6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        return queryLocalInterface instanceof wx2 ? (wx2) queryLocalInterface : new ux2(iBinder);
    }
}
