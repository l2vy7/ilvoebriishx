package p218i5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: i5.a */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public class C10586a implements IInterface {

    /* renamed from: b */
    private final IBinder f49132b;

    /* renamed from: c */
    private final String f49133c = "com.google.android.gms.appset.internal.IAppSetService";

    protected C10586a(IBinder iBinder, String str) {
        this.f49132b = iBinder;
    }

    public final IBinder asBinder() {
        return this.f49132b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public final void mo42702b2(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f49132b.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final Parcel mo42703x() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f49133c);
        return obtain;
    }
}
