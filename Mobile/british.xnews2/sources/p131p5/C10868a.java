package p131p5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: p5.a */
public class C10868a implements IInterface {

    /* renamed from: b */
    private final IBinder f49657b;

    /* renamed from: c */
    private final String f49658c;

    protected C10868a(IBinder iBinder, String str) {
        this.f49657b = iBinder;
        this.f49658c = str;
    }

    public IBinder asBinder() {
        return this.f49657b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public final Parcel mo43049b2(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f49657b.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f3 */
    public final void mo43050f3(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f49657b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final Parcel mo43051x() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f49658c);
        return obtain;
    }
}
