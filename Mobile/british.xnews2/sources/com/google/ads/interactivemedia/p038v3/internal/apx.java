package com.google.ads.interactivemedia.p038v3.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.ads.interactivemedia.v3.internal.apx */
/* compiled from: IMASDK */
public abstract class apx extends C4071ij implements apy {
    /* renamed from: b */
    public static apy m14521b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IClearcut");
        if (queryLocalInterface instanceof apy) {
            return (apy) queryLocalInterface;
        }
        return new apw(iBinder);
    }
}
