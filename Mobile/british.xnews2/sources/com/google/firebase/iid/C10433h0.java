package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.firebase.iid.h0 */
public final class C10433h0 implements C10431g0 {

    /* renamed from: b */
    private final IBinder f48875b;

    C10433h0(IBinder iBinder) {
        this.f48875b = iBinder;
    }

    public final IBinder asBinder() {
        return this.f48875b;
    }

    /* renamed from: h1 */
    public final void mo41882h1(Message message) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.f48875b.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
