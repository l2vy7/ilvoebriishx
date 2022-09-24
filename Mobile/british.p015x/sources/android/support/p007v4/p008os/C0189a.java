package android.support.p007v4.p008os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.os.a */
/* compiled from: IResultReceiver */
public interface C0189a extends IInterface {

    /* renamed from: android.support.v4.os.a$a */
    /* compiled from: IResultReceiver */
    public static abstract class C0190a extends Binder implements C0189a {

        /* renamed from: android.support.v4.os.a$a$a */
        /* compiled from: IResultReceiver */
        private static class C0191a implements C0189a {

            /* renamed from: c */
            public static C0189a f489c;

            /* renamed from: b */
            private IBinder f490b;

            C0191a(IBinder iBinder) {
                this.f490b = iBinder;
            }

            public IBinder asBinder() {
                return this.f490b;
            }

            /* renamed from: h6 */
            public void mo634h6(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f490b.transact(1, obtain, (Parcel) null, 1) || C0190a.m890b2() == null) {
                        obtain.recycle();
                    } else {
                        C0190a.m890b2().mo634h6(i, bundle);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0190a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: b2 */
        public static C0189a m890b2() {
            return C0191a.f489c;
        }

        /* renamed from: x */
        public static C0189a m891x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0189a)) {
                return new C0191a(iBinder);
            }
            return (C0189a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                mo634h6(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    /* renamed from: h6 */
    void mo634h6(int i, Bundle bundle) throws RemoteException;
}
