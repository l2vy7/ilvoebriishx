package p115m4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.cast.C8430a;
import com.google.android.gms.internal.cast.C8431a0;

/* renamed from: m4.g1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C10757g1 extends C8430a implements C10763i1 {
    C10757g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    /* renamed from: A0 */
    public final void mo42926A0(boolean z, int i) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40677b(x, z);
        x.writeInt(0);
        mo36363f3(6, x);
    }

    /* renamed from: I */
    public final void mo42927I(Bundle bundle) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40679d(x, (Parcelable) null);
        mo36363f3(1, x);
    }

    /* renamed from: j1 */
    public final void mo42928j1(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40679d(x, applicationMetadata);
        x.writeString(str);
        x.writeString(str2);
        C8431a0.m40677b(x, z);
        mo36363f3(4, x);
    }

    /* renamed from: j2 */
    public final void mo42929j2(ConnectionResult connectionResult) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40679d(x, connectionResult);
        mo36363f3(3, x);
    }

    /* renamed from: o */
    public final void mo42930o(int i) throws RemoteException {
        Parcel x = mo36365x();
        x.writeInt(i);
        mo36363f3(5, x);
    }

    public final void zzf(int i) throws RemoteException {
        Parcel x = mo36365x();
        x.writeInt(i);
        mo36363f3(2, x);
    }
}
