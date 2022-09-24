package com.startapp;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.startapp.y3 */
/* compiled from: Sta */
public interface C12443y3 extends IInterface {

    /* renamed from: com.startapp.y3$a */
    /* compiled from: Sta */
    public static abstract class C12444a extends Binder implements C12443y3 {

        /* renamed from: a */
        public static final /* synthetic */ int f55152a = 0;

        /* renamed from: com.startapp.y3$a$a */
        /* compiled from: Sta */
        public static class C12445a implements C12443y3 {

            /* renamed from: a */
            public IBinder f55153a;

            public C12445a(IBinder iBinder) {
                this.f55153a = iBinder;
            }

            /* renamed from: a */
            public Bundle mo46831a(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.f55153a.transact(1, obtain, obtain2, 0)) {
                        int i = C12444a.f55152a;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f55153a;
            }
        }
    }

    /* renamed from: a */
    Bundle mo46831a(Bundle bundle) throws RemoteException;
}
