package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class re0 extends C8152sd implements te0 {
    re0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: L0 */
    public final void mo31552L0(String str, String str2, zzbfd zzbfd, C10487a aVar, he0 he0, zc0 zc0, zzbfi zzbfi) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        x.writeString(str2);
        C8223ud.m38295d(x, zzbfd);
        C8223ud.m38297f(x, aVar);
        C8223ud.m38297f(x, he0);
        C8223ud.m38297f(x, zc0);
        C8223ud.m38295d(x, zzbfi);
        mo34695f3(13, x);
    }

    /* renamed from: M4 */
    public final void mo31553M4(String str, String str2, zzbfd zzbfd, C10487a aVar, ne0 ne0, zc0 zc0, zzbnw zzbnw) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        x.writeString(str2);
        C8223ud.m38295d(x, zzbfd);
        C8223ud.m38297f(x, aVar);
        C8223ud.m38297f(x, ne0);
        C8223ud.m38297f(x, zc0);
        C8223ud.m38295d(x, zzbnw);
        mo34695f3(22, x);
    }

    /* renamed from: N1 */
    public final void mo31554N1(String str, String str2, zzbfd zzbfd, C10487a aVar, ne0 ne0, zc0 zc0) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        x.writeString(str2);
        C8223ud.m38295d(x, zzbfd);
        C8223ud.m38297f(x, aVar);
        C8223ud.m38297f(x, ne0);
        C8223ud.m38297f(x, zc0);
        mo34695f3(18, x);
    }

    /* renamed from: Q1 */
    public final void mo31555Q1(String str, String str2, zzbfd zzbfd, C10487a aVar, ke0 ke0, zc0 zc0) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        x.writeString(str2);
        C8223ud.m38295d(x, zzbfd);
        C8223ud.m38297f(x, aVar);
        C8223ud.m38297f(x, ke0);
        C8223ud.m38297f(x, zc0);
        mo34695f3(14, x);
    }

    /* renamed from: Q2 */
    public final void mo31556Q2(String str, String str2, zzbfd zzbfd, C10487a aVar, qe0 qe0, zc0 zc0) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        x.writeString(str2);
        C8223ud.m38295d(x, zzbfd);
        C8223ud.m38297f(x, aVar);
        C8223ud.m38297f(x, qe0);
        C8223ud.m38297f(x, zc0);
        mo34695f3(20, x);
    }

    /* renamed from: R */
    public final boolean mo31557R(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        Parcel b2 = mo34694b2(17, x);
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    /* renamed from: W */
    public final boolean mo31558W(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        Parcel b2 = mo34694b2(15, x);
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    /* renamed from: h2 */
    public final void mo31559h2(String str, String str2, zzbfd zzbfd, C10487a aVar, qe0 qe0, zc0 zc0) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        x.writeString(str2);
        C8223ud.m38295d(x, zzbfd);
        C8223ud.m38297f(x, aVar);
        C8223ud.m38297f(x, qe0);
        C8223ud.m38297f(x, zc0);
        mo34695f3(16, x);
    }

    /* renamed from: j */
    public final void mo31560j(String str) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        mo34695f3(19, x);
    }

    /* renamed from: u2 */
    public final void mo31561u2(C10487a aVar, String str, Bundle bundle, Bundle bundle2, zzbfi zzbfi, we0 we0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        x.writeString(str);
        C8223ud.m38295d(x, bundle);
        C8223ud.m38295d(x, bundle2);
        C8223ud.m38295d(x, zzbfi);
        C8223ud.m38297f(x, we0);
        mo34695f3(1, x);
    }

    /* renamed from: z1 */
    public final void mo31562z1(String str, String str2, zzbfd zzbfd, C10487a aVar, he0 he0, zc0 zc0, zzbfi zzbfi) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        x.writeString(str2);
        C8223ud.m38295d(x, zzbfd);
        C8223ud.m38297f(x, aVar);
        C8223ud.m38297f(x, he0);
        C8223ud.m38297f(x, zc0);
        C8223ud.m38295d(x, zzbfi);
        mo34695f3(21, x);
    }

    public final C7774hy zze() throws RemoteException {
        Parcel b2 = mo34694b2(5, mo34697x());
        C7774hy n6 = C7736gy.m32737n6(b2.readStrongBinder());
        b2.recycle();
        return n6;
    }

    public final zzcab zzf() throws RemoteException {
        Parcel b2 = mo34694b2(2, mo34697x());
        zzcab zzcab = (zzcab) C8223ud.m38292a(b2, zzcab.CREATOR);
        b2.recycle();
        return zzcab;
    }

    public final zzcab zzg() throws RemoteException {
        Parcel b2 = mo34694b2(3, mo34697x());
        zzcab zzcab = (zzcab) C8223ud.m38292a(b2, zzcab.CREATOR);
        b2.recycle();
        return zzcab;
    }
}
