package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.common.internal.p0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C7418p0 implements C7405l {

    /* renamed from: b */
    private final IBinder f29356b;

    C7418p0(IBinder iBinder) {
        this.f29356b = iBinder;
    }

    /* renamed from: B1 */
    public final void mo30136B1(C7402k kVar, GetServiceRequest getServiceRequest) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                C7394h1.m30008a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f29356b.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f29356b;
    }
}
