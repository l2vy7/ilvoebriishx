package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* renamed from: com.google.android.gms.internal.ads.zo */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8413zo extends C8152sd implements C7546bp {
    C8413zo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    /* renamed from: N4 */
    public final void mo30754N4(C7555by byVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, byVar);
        mo34695f3(7, x);
    }

    /* renamed from: e0 */
    public final void mo30755e0(boolean z) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38294c(x, z);
        mo34695f3(6, x);
    }

    /* renamed from: m1 */
    public final void mo30757m1(C10487a aVar, C7875kp kpVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38297f(x, kpVar);
        mo34695f3(4, x);
    }

    public final C7663ey zzf() throws RemoteException {
        Parcel b2 = mo34694b2(5, mo34697x());
        C7663ey n6 = C7626dy.m31644n6(b2.readStrongBinder());
        b2.recycle();
        return n6;
    }
}
