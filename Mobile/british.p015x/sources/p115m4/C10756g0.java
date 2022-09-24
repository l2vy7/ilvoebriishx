package p115m4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.internal.cast.C8431a0;
import com.google.android.gms.internal.cast.C8661o;
import p199d5.C10487a;

/* renamed from: m4.g0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public abstract class C10756g0 extends C8661o implements C10759h0 {
    public C10756g0() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo29574x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C10487a a = mo42932a(parcel.readString());
            parcel2.writeNoException();
            C8431a0.m40681f(parcel2, a);
        } else if (i == 2) {
            boolean zzc = zzc();
            parcel2.writeNoException();
            C8431a0.m40677b(parcel2, zzc);
        } else if (i == 3) {
            String zzd = zzd();
            parcel2.writeNoException();
            parcel2.writeString(zzd);
        } else if (i != 4) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(C7355d.f29215a);
        }
        return true;
    }
}
