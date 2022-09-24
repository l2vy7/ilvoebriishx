package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.j1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public final class C9201j1 extends C9276o0 implements C9216k1 {
    C9201j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: u0 */
    public final void mo37659u0(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel x = mo37767x();
        x.writeString(str);
        x.writeString(str2);
        C9307q0.m43505d(x, bundle);
        x.writeLong(j);
        mo37766f3(1, x);
    }

    public final int zzd() throws RemoteException {
        Parcel b2 = mo37765b2(2, mo37767x());
        int readInt = b2.readInt();
        b2.recycle();
        return readInt;
    }
}
