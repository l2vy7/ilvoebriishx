package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class uc0 extends C8152sd implements wc0 {
    uc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* renamed from: C0 */
    public final void mo34905C0(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(21, x);
    }

    /* renamed from: H4 */
    public final void mo34906H4(C10487a aVar, b90 b90, List<zzbtx> list) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38297f(x, b90);
        x.writeTypedList(list);
        mo34695f3(31, x);
    }

    /* renamed from: R0 */
    public final void mo34908R0(C10487a aVar, zzbfi zzbfi, zzbfd zzbfd, String str, String str2, zc0 zc0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38295d(x, zzbfi);
        C8223ud.m38295d(x, zzbfd);
        x.writeString(str);
        x.writeString(str2);
        C8223ud.m38297f(x, zc0);
        mo34695f3(6, x);
    }

    /* renamed from: R5 */
    public final void mo34909R5(C10487a aVar, zzbfd zzbfd, String str, zc0 zc0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38295d(x, zzbfd);
        x.writeString(str);
        C8223ud.m38297f(x, zc0);
        mo34695f3(32, x);
    }

    /* renamed from: S3 */
    public final void mo34910S3(boolean z) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38294c(x, z);
        mo34695f3(25, x);
    }

    /* renamed from: X1 */
    public final void mo34911X1(C10487a aVar, zzbfi zzbfi, zzbfd zzbfd, String str, String str2, zc0 zc0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38295d(x, zzbfi);
        C8223ud.m38295d(x, zzbfd);
        x.writeString(str);
        x.writeString(str2);
        C8223ud.m38297f(x, zc0);
        mo34695f3(35, x);
    }

    /* renamed from: e6 */
    public final void mo34912e6(C10487a aVar, zzbfd zzbfd, String str, String str2, zc0 zc0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38295d(x, zzbfd);
        x.writeString(str);
        x.writeString(str2);
        C8223ud.m38297f(x, zc0);
        mo34695f3(7, x);
    }

    /* renamed from: f */
    public final void mo34913f() throws RemoteException {
        mo34695f3(8, mo34697x());
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.fd0 mo34914h() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo34697x()
            r1 = 16
            android.os.Parcel r0 = r4.mo34694b2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.fd0
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.fd0 r1 = (com.google.android.gms.internal.ads.fd0) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.fd0 r2 = new com.google.android.gms.internal.ads.fd0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uc0.mo34914h():com.google.android.gms.internal.ads.fd0");
    }

    /* renamed from: h3 */
    public final void mo34915h3(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(37, x);
    }

    /* renamed from: l4 */
    public final void mo34916l4(zzbfd zzbfd, String str) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbfd);
        x.writeString(str);
        mo34695f3(11, x);
    }

    /* renamed from: l6 */
    public final void mo34917l6(C10487a aVar, zzbfd zzbfd, String str, uj0 uj0, String str2) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38295d(x, zzbfd);
        x.writeString((String) null);
        C8223ud.m38297f(x, uj0);
        x.writeString(str2);
        mo34695f3(10, x);
    }

    /* renamed from: m2 */
    public final void mo34918m2(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(30, x);
    }

    /* renamed from: o4 */
    public final void mo34919o4(C10487a aVar, zzbfd zzbfd, String str, String str2, zc0 zc0, zzbnw zzbnw, List<String> list) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38295d(x, zzbfd);
        x.writeString(str);
        x.writeString(str2);
        C8223ud.m38297f(x, zc0);
        C8223ud.m38295d(x, zzbnw);
        x.writeStringList(list);
        mo34695f3(14, x);
    }

    /* renamed from: p3 */
    public final void mo34920p3(C10487a aVar, zzbfd zzbfd, String str, zc0 zc0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38295d(x, zzbfd);
        x.writeString(str);
        C8223ud.m38297f(x, zc0);
        mo34695f3(28, x);
    }

    /* renamed from: q */
    public final void mo34922q() throws RemoteException {
        mo34695f3(4, mo34697x());
    }

    /* renamed from: t4 */
    public final void mo34924t4(C10487a aVar, uj0 uj0, List<String> list) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38297f(x, uj0);
        x.writeStringList(list);
        mo34695f3(23, x);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.ed0 mo34925u() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo34697x()
            r1 = 15
            android.os.Parcel r0 = r4.mo34694b2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.ed0
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.ed0 r1 = (com.google.android.gms.internal.ads.ed0) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.ed0 r2 = new com.google.android.gms.internal.ads.ed0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uc0.mo34925u():com.google.android.gms.internal.ads.ed0");
    }

    public final void zzE() throws RemoteException {
        mo34695f3(9, mo34697x());
    }

    public final void zzJ() throws RemoteException {
        mo34695f3(12, mo34697x());
    }

    public final boolean zzK() throws RemoteException {
        Parcel b2 = mo34694b2(22, mo34697x());
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    public final boolean zzL() throws RemoteException {
        Parcel b2 = mo34694b2(13, mo34697x());
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    public final C7774hy zzh() throws RemoteException {
        Parcel b2 = mo34694b2(26, mo34697x());
        C7774hy n6 = C7736gy.m32737n6(b2.readStrongBinder());
        b2.recycle();
        return n6;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.cd0 zzj() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo34697x()
            r1 = 36
            android.os.Parcel r0 = r4.mo34694b2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.cd0
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.cd0 r1 = (com.google.android.gms.internal.ads.cd0) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.ad0 r2 = new com.google.android.gms.internal.ads.ad0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uc0.zzj():com.google.android.gms.internal.ads.cd0");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.id0 zzk() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo34697x()
            r1 = 27
            android.os.Parcel r0 = r4.mo34694b2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.id0
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.id0 r1 = (com.google.android.gms.internal.ads.id0) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.gd0 r2 = new com.google.android.gms.internal.ads.gd0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uc0.zzk():com.google.android.gms.internal.ads.id0");
    }

    public final zzcab zzl() throws RemoteException {
        Parcel b2 = mo34694b2(33, mo34697x());
        zzcab zzcab = (zzcab) C8223ud.m38292a(b2, zzcab.CREATOR);
        b2.recycle();
        return zzcab;
    }

    public final zzcab zzm() throws RemoteException {
        Parcel b2 = mo34694b2(34, mo34697x());
        zzcab zzcab = (zzcab) C8223ud.m38292a(b2, zzcab.CREATOR);
        b2.recycle();
        return zzcab;
    }

    public final C10487a zzn() throws RemoteException {
        Parcel b2 = mo34694b2(2, mo34697x());
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    public final void zzo() throws RemoteException {
        mo34695f3(5, mo34697x());
    }
}
