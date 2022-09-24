package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import p231m5.C10798b;
import p231m5.C10799c;

/* renamed from: com.google.android.gms.common.internal.o0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public abstract class C7415o0 extends C10798b implements C7402k {
    public C7415o0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo30147x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo30133t3(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C10799c.m48738a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            mo30132k2(parcel.readInt(), (Bundle) C10799c.m48738a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo30131J3(parcel.readInt(), parcel.readStrongBinder(), (zzj) C10799c.m48738a(parcel, zzj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
