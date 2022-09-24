package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.fz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C7701fz extends C7845jw {

    /* renamed from: b */
    final /* synthetic */ C7737gz f32049b;

    /* synthetic */ C7701fz(C7737gz gzVar, C7664ez ezVar) {
        this.f32049b = gzVar;
    }

    /* renamed from: i4 */
    public final void mo31966i4(zzbfd zzbfd) throws RemoteException {
        mo31967y0(zzbfd, 1);
    }

    /* renamed from: y0 */
    public final void mo31967y0(zzbfd zzbfd, int i) throws RemoteException {
        co0.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        vn0.f40472b.post(new C7627dz(this));
    }

    public final String zze() throws RemoteException {
        return null;
    }

    public final String zzf() throws RemoteException {
        return null;
    }

    public final boolean zzi() throws RemoteException {
        return false;
    }
}
