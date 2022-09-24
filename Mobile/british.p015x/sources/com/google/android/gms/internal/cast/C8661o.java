package com.google.android.gms.internal.cast;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.cast.o */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class C8661o extends Binder implements IInterface {
    protected C8661o(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo29574x(i, parcel, parcel2, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public boolean mo29574x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }
}
