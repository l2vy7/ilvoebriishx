package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;

/* renamed from: com.google.android.gms.internal.ads.lw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7919lw extends C8152sd implements C7993nw {
    C7919lw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* renamed from: H3 */
    public final void mo32037H3(c50 c50, zzbfi zzbfi) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, c50);
        C8223ud.m38295d(x, zzbfi);
        mo34695f3(8, x);
    }

    /* renamed from: N5 */
    public final void mo32038N5(C7624dw dwVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, dwVar);
        mo34695f3(2, x);
    }

    /* renamed from: P2 */
    public final void mo32039P2(f50 f50) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, f50);
        mo34695f3(10, x);
    }

    /* renamed from: Y5 */
    public final void mo32044Y5(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, adManagerAdViewOptions);
        mo34695f3(15, x);
    }

    /* renamed from: r2 */
    public final void mo32047r2(String str, y40 y40, v40 v40) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        C8223ud.m38297f(x, y40);
        C8223ud.m38297f(x, v40);
        mo34695f3(5, x);
    }

    /* renamed from: y2 */
    public final void mo32048y2(zzbnw zzbnw) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbnw);
        mo34695f3(6, x);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C7882kw zze() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo34697x()
            r1 = 1
            android.os.Parcel r0 = r4.mo34694b2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C7882kw
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.kw r1 = (com.google.android.gms.internal.ads.C7882kw) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.iw r2 = new com.google.android.gms.internal.ads.iw
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7919lw.zze():com.google.android.gms.internal.ads.kw");
    }
}
