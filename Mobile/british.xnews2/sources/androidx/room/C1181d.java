package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.C1178c;

/* renamed from: androidx.room.d */
/* compiled from: IMultiInstanceInvalidationService */
public interface C1181d extends IInterface {

    /* renamed from: androidx.room.d$a */
    /* compiled from: IMultiInstanceInvalidationService */
    public static abstract class C1182a extends Binder implements C1181d {

        /* renamed from: androidx.room.d$a$a */
        /* compiled from: IMultiInstanceInvalidationService */
        private static class C1183a implements C1181d {

            /* renamed from: b */
            private IBinder f5434b;

            C1183a(IBinder iBinder) {
                this.f5434b = iBinder;
            }

            /* renamed from: B5 */
            public void mo5844B5(int i, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.f5434b.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: W5 */
            public void mo5845W5(C1178c cVar, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    obtain.writeInt(i);
                    this.f5434b.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5434b;
            }

            /* renamed from: d2 */
            public int mo5846d2(C1178c cVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f5434b.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1182a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        /* renamed from: x */
        public static C1181d m6560x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C1181d)) {
                return new C1183a(iBinder);
            }
            return (C1181d) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int d2 = mo5846d2(C1178c.C1179a.m6555x(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(d2);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo5845W5(C1178c.C1179a.m6555x(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo5844B5(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
        }
    }

    /* renamed from: B5 */
    void mo5844B5(int i, String[] strArr) throws RemoteException;

    /* renamed from: W5 */
    void mo5845W5(C1178c cVar, int i) throws RemoteException;

    /* renamed from: d2 */
    int mo5846d2(C1178c cVar, String str) throws RemoteException;
}
