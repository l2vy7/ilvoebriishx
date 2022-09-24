package com.google.ads.interactivemedia.p038v3.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aps */
/* compiled from: IMASDK */
public final class aps extends C4070ii implements apt {
    aps(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* renamed from: e */
    public final apq mo14195e(C3848app app) throws RemoteException {
        Parcel a = mo15918a();
        C4072ik.m17381d(a, app);
        Parcel b = mo15920b(1, a);
        apq apq = (apq) C4072ik.m17380c(b, apq.CREATOR);
        b.recycle();
        return apq;
    }
}
