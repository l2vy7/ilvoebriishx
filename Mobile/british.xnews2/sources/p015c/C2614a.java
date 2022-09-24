package p015c;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: c.a */
/* compiled from: INotificationSideChannel */
public interface C2614a extends IInterface {

    /* renamed from: c.a$a */
    /* compiled from: INotificationSideChannel */
    public static abstract class C2615a extends Binder implements C2614a {

        /* renamed from: c.a$a$a */
        /* compiled from: INotificationSideChannel */
        private static class C2616a implements C2614a {

            /* renamed from: c */
            public static C2614a f10355c;

            /* renamed from: b */
            private IBinder f10356b;

            C2616a(IBinder iBinder) {
                this.f10356b = iBinder;
            }

            /* renamed from: L5 */
            public void mo3096L5(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f10356b.transact(1, obtain, (Parcel) null, 1) || C2615a.m9102b2() == null) {
                        obtain.recycle();
                    } else {
                        C2615a.m9102b2().mo3096L5(str, i, str2, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: V3 */
            public void mo3097V3(String str, int i, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (this.f10356b.transact(2, obtain, (Parcel) null, 1) || C2615a.m9102b2() == null) {
                        obtain.recycle();
                    } else {
                        C2615a.m9102b2().mo3097V3(str, i, str2);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: Y1 */
            public void mo3098Y1(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    if (this.f10356b.transact(3, obtain, (Parcel) null, 1) || C2615a.m9102b2() == null) {
                        obtain.recycle();
                    } else {
                        C2615a.m9102b2().mo3098Y1(str);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f10356b;
            }
        }

        public C2615a() {
            attachInterface(this, "android.support.v4.app.INotificationSideChannel");
        }

        /* renamed from: b2 */
        public static C2614a m9102b2() {
            return C2616a.f10355c;
        }

        /* renamed from: x */
        public static C2614a m9103x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C2614a)) {
                return new C2616a(iBinder);
            }
            return (C2614a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                mo3096L5(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                mo3097V3(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                mo3098Y1(parcel.readString());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.app.INotificationSideChannel");
                return true;
            }
        }
    }

    /* renamed from: L5 */
    void mo3096L5(String str, int i, String str2, Notification notification) throws RemoteException;

    /* renamed from: V3 */
    void mo3097V3(String str, int i, String str2) throws RemoteException;

    /* renamed from: Y1 */
    void mo3098Y1(String str) throws RemoteException;
}
