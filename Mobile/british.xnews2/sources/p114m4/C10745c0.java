package p114m4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C8430a;
import com.google.android.gms.internal.cast.C8431a0;
import p198d5.C10487a;

/* renamed from: m4.c0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C10745c0 extends C8430a implements C10747d0 {
    C10745c0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    /* renamed from: X0 */
    public final void mo42913X0(boolean z, boolean z2) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40677b(x, true);
        C8431a0.m40677b(x, z2);
        mo36363f3(6, x);
    }

    /* renamed from: i6 */
    public final void mo42914i6(C10753f0 f0Var) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40681f(x, f0Var);
        mo36363f3(3, x);
    }

    /* renamed from: m5 */
    public final void mo42915m5(C10753f0 f0Var) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40681f(x, f0Var);
        mo36363f3(2, x);
    }

    public final C10487a zze() throws RemoteException {
        Parcel b2 = mo36362b2(1, mo36365x());
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    public final C10487a zzk() throws RemoteException {
        Parcel b2 = mo36362b2(7, mo36365x());
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }
}
