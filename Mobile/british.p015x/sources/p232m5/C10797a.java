package p232m5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: m5.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C10797a implements IInterface {

    /* renamed from: b */
    private final IBinder f49528b;

    /* renamed from: c */
    private final String f49529c;

    protected C10797a(IBinder iBinder, String str) {
        this.f49528b = iBinder;
        this.f49529c = str;
    }

    public final IBinder asBinder() {
        return this.f49528b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public final Parcel mo42967b2() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f49529c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final Parcel mo42968x(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f49528b.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
