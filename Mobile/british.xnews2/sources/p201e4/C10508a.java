package p201e4;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: e4.a */
/* compiled from: IGetInstallReferrerService */
public interface C10508a extends IInterface {

    /* renamed from: e4.a$a */
    /* compiled from: IGetInstallReferrerService */
    public static abstract class C10509a extends Binder implements C10508a {

        /* renamed from: e4.a$a$a */
        /* compiled from: IGetInstallReferrerService */
        private static class C10510a implements C10508a {

            /* renamed from: b */
            private IBinder f49033b;

            C10510a(IBinder iBinder) {
                this.f49033b = iBinder;
            }

            /* renamed from: N2 */
            public Bundle mo42646N2(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f49033b.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f49033b;
            }
        }

        /* renamed from: x */
        public static C10508a m48240x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C10508a)) {
                return new C10510a(iBinder);
            }
            return (C10508a) queryLocalInterface;
        }
    }

    /* renamed from: N2 */
    Bundle mo42646N2(Bundle bundle) throws RemoteException;
}
