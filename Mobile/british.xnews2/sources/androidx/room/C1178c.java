package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: androidx.room.c */
/* compiled from: IMultiInstanceInvalidationCallback */
public interface C1178c extends IInterface {

    /* renamed from: androidx.room.c$a */
    /* compiled from: IMultiInstanceInvalidationCallback */
    public static abstract class C1179a extends Binder implements C1178c {

        /* renamed from: androidx.room.c$a$a */
        /* compiled from: IMultiInstanceInvalidationCallback */
        private static class C1180a implements C1178c {

            /* renamed from: b */
            private IBinder f5433b;

            C1180a(IBinder iBinder) {
                this.f5433b = iBinder;
            }

            public IBinder asBinder() {
                return this.f5433b;
            }

            /* renamed from: n1 */
            public void mo5859n1(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f5433b.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C1179a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: x */
        public static C1178c m6555x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C1178c)) {
                return new C1180a(iBinder);
            }
            return (C1178c) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                mo5859n1(parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
        }
    }

    /* renamed from: n1 */
    void mo5859n1(String[] strArr) throws RemoteException;
}
