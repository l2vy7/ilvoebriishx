package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.wd */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C8294wd extends C8187td implements C8330xd {
    /* renamed from: n6 */
    public static C8330xd m39122n6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof C8330xd ? (C8330xd) queryLocalInterface : new C8260vd(iBinder);
    }
}
