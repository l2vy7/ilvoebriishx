package p000a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: a.b */
/* compiled from: ICustomTabsService */
public interface C0003b extends IInterface {

    /* renamed from: a.b$a */
    /* compiled from: ICustomTabsService */
    public static abstract class C0004a extends Binder implements C0003b {

        /* renamed from: a.b$a$a */
        /* compiled from: ICustomTabsService */
        private static class C0005a implements C0003b {

            /* renamed from: c */
            public static C0003b f2c;

            /* renamed from: b */
            private IBinder f3b;

            C0005a(IBinder iBinder) {
                this.f3b = iBinder;
            }

            public IBinder asBinder() {
                return this.f3b;
            }

            /* renamed from: c3 */
            public boolean mo12c3(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j);
                    boolean z = false;
                    if (!this.f3b.transact(2, obtain, obtain2, 0) && C0004a.m25b2() != null) {
                        return C0004a.m25b2().mo12c3(j);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m3 */
            public boolean mo15m3(C0000a aVar, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f3b.transact(10, obtain, obtain2, 0) && C0004a.m25b2() != null) {
                        return C0004a.m25b2().mo15m3(aVar, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: v2 */
            public boolean mo19v2(C0000a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = false;
                    if (!this.f3b.transact(3, obtain, obtain2, 0) && C0004a.m25b2() != null) {
                        return C0004a.m25b2().mo19v2(aVar);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0004a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsService");
        }

        /* renamed from: b2 */
        public static C0003b m25b2() {
            return C0005a.f2c;
        }

        /* renamed from: x */
        public static C0003b m26x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0003b)) {
                return new C0005a(iBinder);
            }
            return (C0003b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: android.net.Uri} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r0v1 */
        /* JADX WARNING: type inference failed for: r0v34 */
        /* JADX WARNING: type inference failed for: r0v35 */
        /* JADX WARNING: type inference failed for: r0v36 */
        /* JADX WARNING: type inference failed for: r0v37 */
        /* JADX WARNING: type inference failed for: r0v38 */
        /* JADX WARNING: type inference failed for: r0v39 */
        /* JADX WARNING: type inference failed for: r0v40 */
        /* JADX WARNING: type inference failed for: r0v41 */
        /* JADX WARNING: type inference failed for: r0v42 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.customtabs.ICustomTabsService"
                if (r5 == r0) goto L_0x01dd
                r0 = 0
                switch(r5) {
                    case 2: goto L_0x01cb;
                    case 3: goto L_0x01b5;
                    case 4: goto L_0x017b;
                    case 5: goto L_0x0150;
                    case 6: goto L_0x012b;
                    case 7: goto L_0x0106;
                    case 8: goto L_0x00dd;
                    case 9: goto L_0x00a4;
                    case 10: goto L_0x007f;
                    case 11: goto L_0x004a;
                    case 12: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0011:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                a.a r5 = p000a.C0000a.C0001a.m7x(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x002b
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x002c
            L_0x002b:
                r8 = r0
            L_0x002c:
                int r2 = r6.readInt()
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x003f
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x003f:
                boolean r5 = r4.mo20y5(r5, r8, r2, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x004a:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                a.a r5 = p000a.C0000a.C0001a.m7x(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0064
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x0065
            L_0x0064:
                r8 = r0
            L_0x0065:
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0074
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0074:
                boolean r5 = r4.mo18u5(r5, r8, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x007f:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                a.a r5 = p000a.C0000a.C0001a.m7x(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0099
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0099:
                boolean r5 = r4.mo15m3(r5, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x00a4:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                a.a r5 = p000a.C0000a.C0001a.m7x(r5)
                int r8 = r6.readInt()
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x00c2
                android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r6)
                android.net.Uri r2 = (android.net.Uri) r2
                goto L_0x00c3
            L_0x00c2:
                r2 = r0
            L_0x00c3:
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x00d2
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x00d2:
                boolean r5 = r4.mo14g6(r5, r8, r2, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x00dd:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                a.a r5 = p000a.C0000a.C0001a.m7x(r5)
                java.lang.String r8 = r6.readString()
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x00fb
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x00fb:
                int r5 = r4.mo11a5(r5, r8, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0106:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                a.a r5 = p000a.C0000a.C0001a.m7x(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0120
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.net.Uri r0 = (android.net.Uri) r0
            L_0x0120:
                boolean r5 = r4.mo10F0(r5, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x012b:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                a.a r5 = p000a.C0000a.C0001a.m7x(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0145
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0145:
                boolean r5 = r4.mo13c6(r5, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0150:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0166
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0166:
                android.os.Bundle r5 = r4.mo16o2(r5, r0)
                r7.writeNoException()
                if (r5 == 0) goto L_0x0176
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x017a
            L_0x0176:
                r5 = 0
                r7.writeInt(r5)
            L_0x017a:
                return r1
            L_0x017b:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                a.a r5 = p000a.C0000a.C0001a.m7x(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0195
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x0196
            L_0x0195:
                r8 = r0
            L_0x0196:
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x01a4
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x01a4:
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.util.ArrayList r6 = r6.createTypedArrayList(r2)
                boolean r5 = r4.mo17s4(r5, r8, r0, r6)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x01b5:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                a.a r5 = p000a.C0000a.C0001a.m7x(r5)
                boolean r5 = r4.mo19v2(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x01cb:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                boolean r5 = r4.mo12c3(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x01dd:
                r7.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.C0003b.C0004a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: F0 */
    boolean mo10F0(C0000a aVar, Uri uri) throws RemoteException;

    /* renamed from: a5 */
    int mo11a5(C0000a aVar, String str, Bundle bundle) throws RemoteException;

    /* renamed from: c3 */
    boolean mo12c3(long j) throws RemoteException;

    /* renamed from: c6 */
    boolean mo13c6(C0000a aVar, Bundle bundle) throws RemoteException;

    /* renamed from: g6 */
    boolean mo14g6(C0000a aVar, int i, Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: m3 */
    boolean mo15m3(C0000a aVar, Bundle bundle) throws RemoteException;

    /* renamed from: o2 */
    Bundle mo16o2(String str, Bundle bundle) throws RemoteException;

    /* renamed from: s4 */
    boolean mo17s4(C0000a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    /* renamed from: u5 */
    boolean mo18u5(C0000a aVar, Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: v2 */
    boolean mo19v2(C0000a aVar) throws RemoteException;

    /* renamed from: y5 */
    boolean mo20y5(C0000a aVar, Uri uri, int i, Bundle bundle) throws RemoteException;
}
