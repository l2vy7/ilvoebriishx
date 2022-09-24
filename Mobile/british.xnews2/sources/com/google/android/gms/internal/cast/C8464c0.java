package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.cast.c0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public abstract class C8464c0 extends C8661o implements C8481d0 {
    public C8464c0() {
        super("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo29574x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo36420g4(parcel.readInt(), parcel.readInt(), (Surface) C8431a0.m40678c(parcel, Surface.CREATOR));
        } else if (i == 2) {
            mo36421s(parcel.readInt());
        } else if (i == 3) {
            zzf();
        } else if (i == 4) {
            zzc();
        } else if (i != 5) {
            return false;
        } else {
            mo36419C(C8431a0.m40676a(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
