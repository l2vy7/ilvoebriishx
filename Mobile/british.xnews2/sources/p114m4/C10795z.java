package p114m4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C8430a;
import com.google.android.gms.internal.cast.C8431a0;
import p198d5.C10487a;

/* renamed from: m4.z */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C10795z extends C8430a implements C10742b0 {
    C10795z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    /* renamed from: O5 */
    public final void mo42906O5(int i) throws RemoteException {
        Parcel x = mo36365x();
        x.writeInt(i);
        mo36363f3(13, x);
    }

    /* renamed from: i5 */
    public final void mo42907i5(int i) throws RemoteException {
        Parcel x = mo36365x();
        x.writeInt(i);
        mo36363f3(12, x);
    }

    /* renamed from: j4 */
    public final void mo42908j4(int i) throws RemoteException {
        Parcel x = mo36365x();
        x.writeInt(i);
        mo36363f3(15, x);
    }

    public final C10487a zze() throws RemoteException {
        Parcel b2 = mo36362b2(1, mo36365x());
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    public final boolean zzh() throws RemoteException {
        Parcel b2 = mo36362b2(5, mo36365x());
        boolean a = C8431a0.m40676a(b2);
        b2.recycle();
        return a;
    }

    public final boolean zzi() throws RemoteException {
        Parcel b2 = mo36362b2(6, mo36365x());
        boolean a = C8431a0.m40676a(b2);
        b2.recycle();
        return a;
    }

    public final boolean zzl() throws RemoteException {
        Parcel b2 = mo36362b2(9, mo36365x());
        boolean a = C8431a0.m40676a(b2);
        b2.recycle();
        return a;
    }
}
