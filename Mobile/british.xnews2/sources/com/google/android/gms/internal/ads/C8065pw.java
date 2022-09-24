package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* renamed from: com.google.android.gms.internal.ads.pw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8065pw extends C8152sd implements C8136rw {
    C8065pw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final void zzA() throws RemoteException {
        mo34695f3(11, mo34697x());
    }

    public final void zzB() throws RemoteException {
        mo34695f3(6, mo34697x());
    }

    public final void zzC(C7518aw awVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, awVar);
        mo34695f3(20, x);
    }

    public final void zzD(C7624dw dwVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, dwVar);
        mo34695f3(7, x);
    }

    public final void zzF(zzbfi zzbfi) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbfi);
        mo34695f3(13, x);
    }

    public final void zzG(C8385yw ywVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, ywVar);
        mo34695f3(8, x);
    }

    public final void zzH(C7654ep epVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, epVar);
        mo34695f3(40, x);
    }

    public final void zzI(zzbfo zzbfo) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbfo);
        mo34695f3(39, x);
    }

    public final void zzJ(C7699fx fxVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, fxVar);
        mo34695f3(45, x);
    }

    public final void zzL(boolean z) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38294c(x, z);
        mo34695f3(34, x);
    }

    public final void zzN(boolean z) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38294c(x, z);
        mo34695f3(22, x);
    }

    public final void zzP(C7555by byVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, byVar);
        mo34695f3(42, x);
    }

    public final void zzU(zzbkq zzbkq) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbkq);
        mo34695f3(29, x);
    }

    public final void zzW(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(44, x);
    }

    public final boolean zzY() throws RemoteException {
        Parcel b2 = mo34694b2(23, mo34697x());
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    public final boolean zzaa(zzbfd zzbfd) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbfd);
        Parcel b2 = mo34694b2(4, x);
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    public final zzbfi zzg() throws RemoteException {
        Parcel b2 = mo34694b2(12, mo34697x());
        zzbfi zzbfi = (zzbfi) C8223ud.m38292a(b2, zzbfi.CREATOR);
        b2.recycle();
        return zzbfi;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C7624dw zzi() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo34697x()
            r1 = 33
            android.os.Parcel r0 = r4.mo34694b2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C7624dw
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.dw r1 = (com.google.android.gms.internal.ads.C7624dw) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.bw r2 = new com.google.android.gms.internal.ads.bw
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8065pw.zzi():com.google.android.gms.internal.ads.dw");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C8385yw zzj() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo34697x()
            r1 = 32
            android.os.Parcel r0 = r4.mo34694b2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C8385yw
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.yw r1 = (com.google.android.gms.internal.ads.C8385yw) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.ww r2 = new com.google.android.gms.internal.ads.ww
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8065pw.zzj():com.google.android.gms.internal.ads.yw");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C7663ey zzk() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo34697x()
            r1 = 41
            android.os.Parcel r0 = r4.mo34694b2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C7663ey
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.ey r1 = (com.google.android.gms.internal.ads.C7663ey) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.cy r2 = new com.google.android.gms.internal.ads.cy
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8065pw.zzk():com.google.android.gms.internal.ads.ey");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C7774hy zzl() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo34697x()
            r1 = 26
            android.os.Parcel r0 = r4.mo34694b2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoController"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C7774hy
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.hy r1 = (com.google.android.gms.internal.ads.C7774hy) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.fy r2 = new com.google.android.gms.internal.ads.fy
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8065pw.zzl():com.google.android.gms.internal.ads.hy");
    }

    public final C10487a zzn() throws RemoteException {
        Parcel b2 = mo34694b2(1, mo34697x());
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    public final String zzr() throws RemoteException {
        Parcel b2 = mo34694b2(31, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final void zzx() throws RemoteException {
        mo34695f3(2, mo34697x());
    }

    public final void zzy(zzbfd zzbfd, C7772hw hwVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbfd);
        C8223ud.m38297f(x, hwVar);
        mo34695f3(43, x);
    }

    public final void zzz() throws RemoteException {
        mo34695f3(5, mo34697x());
    }
}
