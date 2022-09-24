package com.google.ads.interactivemedia.p039v3.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aot */
/* compiled from: IMASDK */
public final class aot extends C4070ii implements aov {
    aot(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.signalsdk.ISignalSdkService");
    }

    /* renamed from: e */
    public final void mo14163e(aow aow, aos aos) throws RemoteException {
        Parcel a = mo15918a();
        C4072ik.m17381d(a, aow);
        C4072ik.m17382e(a, aos);
        mo15922d(a);
    }
}
