package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zj0 extends C8152sd implements bk0 {
    zj0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* renamed from: D2 */
    public final void mo30684D2(zzbfd zzbfd, jk0 jk0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbfd);
        C8223ud.m38297f(x, jk0);
        mo34695f3(14, x);
    }

    /* renamed from: G1 */
    public final void mo30685G1(zzbfd zzbfd, jk0 jk0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbfd);
        C8223ud.m38297f(x, jk0);
        mo34695f3(1, x);
    }

    /* renamed from: Q */
    public final void mo30686Q(boolean z) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38294c(x, z);
        mo34695f3(15, x);
    }

    /* renamed from: W0 */
    public final void mo30687W0(zzcfn zzcfn) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzcfn);
        mo34695f3(7, x);
    }

    /* renamed from: Y2 */
    public final void mo30688Y2(fk0 fk0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, fk0);
        mo34695f3(2, x);
    }

    /* renamed from: f5 */
    public final void mo30689f5(C8386yx yxVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, yxVar);
        mo34695f3(8, x);
    }

    /* renamed from: j3 */
    public final void mo30690j3(C7555by byVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, byVar);
        mo34695f3(13, x);
    }

    /* renamed from: p0 */
    public final void mo30692p0(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(5, x);
    }

    public final Bundle zzb() throws RemoteException {
        Parcel b2 = mo34694b2(9, mo34697x());
        Bundle bundle = (Bundle) C8223ud.m38292a(b2, Bundle.CREATOR);
        b2.recycle();
        return bundle;
    }

    public final C7663ey zzc() throws RemoteException {
        Parcel b2 = mo34694b2(12, mo34697x());
        C7663ey n6 = C7626dy.m31644n6(b2.readStrongBinder());
        b2.recycle();
        return n6;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.yj0 zzd() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo34697x()
            r1 = 11
            android.os.Parcel r0 = r4.mo34694b2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.rewarded.client.IRewardItem"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.yj0
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.yj0 r1 = (com.google.android.gms.internal.ads.yj0) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.wj0 r2 = new com.google.android.gms.internal.ads.wj0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zj0.zzd():com.google.android.gms.internal.ads.yj0");
    }
}
