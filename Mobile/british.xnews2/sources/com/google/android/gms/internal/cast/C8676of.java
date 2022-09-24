package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.cast.of */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8676of extends C8430a implements C8692pf {
    C8676of(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    /* renamed from: G4 */
    public final void mo36646G4(String str, Bundle bundle, int i) throws RemoteException {
        Parcel x = mo36365x();
        x.writeString(str);
        C8431a0.m40679d(x, bundle);
        x.writeInt(i);
        mo36363f3(6, x);
    }

    /* renamed from: I3 */
    public final void mo36647I3(String str, Bundle bundle) throws RemoteException {
        Parcel x = mo36365x();
        x.writeString(str);
        C8431a0.m40679d(x, bundle);
        mo36363f3(1, x);
    }

    /* renamed from: b3 */
    public final void mo36648b3(String str, Bundle bundle) throws RemoteException {
        Parcel x = mo36365x();
        x.writeString(str);
        C8431a0.m40679d(x, bundle);
        mo36363f3(2, x);
    }

    /* renamed from: r1 */
    public final void mo36649r1(String str, Bundle bundle) throws RemoteException {
        Parcel x = mo36365x();
        x.writeString(str);
        C8431a0.m40679d(x, bundle);
        mo36363f3(4, x);
    }

    /* renamed from: t2 */
    public final void mo36650t2(String str, Bundle bundle) throws RemoteException {
        Parcel x = mo36365x();
        x.writeString(str);
        C8431a0.m40679d(x, bundle);
        mo36363f3(3, x);
    }
}
