package p244q4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.zzbl;
import com.google.android.gms.internal.cast.C8430a;
import com.google.android.gms.internal.cast.C8431a0;

/* renamed from: q4.e */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10928e extends C8430a {
    C10928e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    /* renamed from: B */
    public final void mo43206B(String str) throws RemoteException {
        Parcel x = mo36365x();
        x.writeString(str);
        mo36364m6(11, x);
    }

    /* renamed from: P */
    public final void mo43207P(String str) throws RemoteException {
        Parcel x = mo36365x();
        x.writeString(str);
        mo36364m6(12, x);
    }

    /* renamed from: n6 */
    public final void mo43208n6(String str) throws RemoteException {
        Parcel x = mo36365x();
        x.writeString(str);
        mo36364m6(5, x);
    }

    /* renamed from: o6 */
    public final void mo43209o6(boolean z, double d, boolean z2) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40677b(x, z);
        x.writeDouble(d);
        C8431a0.m40677b(x, z2);
        mo36364m6(8, x);
    }

    /* renamed from: p6 */
    public final void mo43210p6(String str, String str2, long j) throws RemoteException {
        Parcel x = mo36365x();
        x.writeString(str);
        x.writeString(str2);
        x.writeLong(j);
        mo36364m6(9, x);
    }

    /* renamed from: q6 */
    public final void mo43211q6(String str, LaunchOptions launchOptions) throws RemoteException {
        Parcel x = mo36365x();
        x.writeString(str);
        C8431a0.m40679d(x, launchOptions);
        mo36364m6(13, x);
    }

    /* renamed from: r6 */
    public final void mo43212r6(String str, String str2, zzbl zzbl) throws RemoteException {
        Parcel x = mo36365x();
        x.writeString(str);
        x.writeString(str2);
        C8431a0.m40679d(x, zzbl);
        mo36364m6(14, x);
    }

    /* renamed from: s6 */
    public final void mo43213s6(C10932g gVar) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40681f(x, gVar);
        mo36364m6(18, x);
    }

    public final void zze() throws RemoteException {
        mo36364m6(1, mo36365x());
    }

    public final void zzp() throws RemoteException {
        mo36364m6(17, mo36365x());
    }

    public final void zzr() throws RemoteException {
        mo36364m6(19, mo36365x());
    }
}
