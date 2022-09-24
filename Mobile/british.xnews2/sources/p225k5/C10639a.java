package p225k5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: k5.a */
public class C10639a implements IInterface {

    /* renamed from: b */
    private final IBinder f49213b;

    /* renamed from: c */
    private final String f49214c;

    protected C10639a(IBinder iBinder, String str) {
        this.f49213b = iBinder;
        this.f49214c = str;
    }

    public IBinder asBinder() {
        return this.f49213b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public final void mo42752b2(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f49213b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final Parcel mo42753x() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f49214c);
        return obtain;
    }
}
