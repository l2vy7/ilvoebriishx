package p228l5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: l5.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C10713a implements IInterface {

    /* renamed from: b */
    private final IBinder f49340b;

    /* renamed from: c */
    private final String f49341c;

    protected C10713a(IBinder iBinder, String str) {
        this.f49340b = iBinder;
        this.f49341c = str;
    }

    public final IBinder asBinder() {
        return this.f49340b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public final Parcel mo42867b2(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f49340b.transact(2, parcel, parcel, 0);
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
    public final void mo42868f3(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f49340b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final void mo42869m6(int i, Parcel parcel) throws RemoteException {
        try {
            this.f49340b.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final Parcel mo42870x() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f49341c);
        return obtain;
    }
}
