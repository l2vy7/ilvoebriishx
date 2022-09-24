package com.google.ads.interactivemedia.p038v3.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aou */
/* compiled from: IMASDK */
public abstract class aou extends C4071ij implements aov {
    /* renamed from: b */
    public static aov m14479b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.signalsdk.ISignalSdkService");
        if (queryLocalInterface instanceof aov) {
            return (aov) queryLocalInterface;
        }
        return new aot(iBinder);
    }
}
