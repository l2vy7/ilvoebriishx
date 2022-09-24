package p214h5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: h5.a */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public class C10570a implements IInterface {

    /* renamed from: b */
    private final IBinder f49125b;

    /* renamed from: c */
    private final String f49126c = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected C10570a(IBinder iBinder, String str) {
        this.f49125b = iBinder;
    }

    public final IBinder asBinder() {
        return this.f49125b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public final Parcel mo42691b2(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f49125b.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final Parcel mo42692x() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f49126c);
        return obtain;
    }
}
