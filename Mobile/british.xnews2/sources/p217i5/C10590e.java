package p217i5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;

/* renamed from: i5.e */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public abstract class C10590e extends C10587b implements C10591f {
    public C10590e() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo42706x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo42707L3((Status) C10588c.m48332a(parcel, Status.CREATOR), (zzc) C10588c.m48332a(parcel, zzc.CREATOR));
        return true;
    }
}
