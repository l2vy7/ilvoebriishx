package p115m4;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: m4.i1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public interface C10763i1 extends IInterface {
    /* renamed from: A0 */
    void mo42926A0(boolean z, int i) throws RemoteException;

    /* renamed from: I */
    void mo42927I(Bundle bundle) throws RemoteException;

    /* renamed from: j1 */
    void mo42928j1(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) throws RemoteException;

    /* renamed from: j2 */
    void mo42929j2(ConnectionResult connectionResult) throws RemoteException;

    /* renamed from: o */
    void mo42930o(int i) throws RemoteException;

    void zzf(int i) throws RemoteException;
}
