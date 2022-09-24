package com.google.ads.interactivemedia.p039v3.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aph */
/* compiled from: IMASDK */
public class aph extends C4071ij implements C3847api {
    public aph() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    /* renamed from: b */
    public static C3847api m14498b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof C3847api) {
            return (C3847api) queryLocalInterface;
        }
        return new apg(iBinder);
    }
}
