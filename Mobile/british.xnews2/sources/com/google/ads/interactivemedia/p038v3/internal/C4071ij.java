package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ij */
/* compiled from: IMASDK */
public class C4071ij extends Binder implements IInterface {
    protected C4071ij(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo14139a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        return false;
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
        return mo14139a(i, parcel, parcel2);
    }
}
