package p244q4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C8431a0;
import com.google.android.gms.internal.cast.C8661o;

/* renamed from: q4.c */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public abstract class C10924c extends C8661o implements C10926d {
    public C10924c() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo29574x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo43205q4((Bundle) C8431a0.m40678c(parcel, Bundle.CREATOR));
        return true;
    }
}
