package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.cast.f0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public abstract class C8514f0 extends C8661o implements C8531g0 {
    public C8514f0() {
        super("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo29574x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzb(parcel.readInt());
        return true;
    }
}
