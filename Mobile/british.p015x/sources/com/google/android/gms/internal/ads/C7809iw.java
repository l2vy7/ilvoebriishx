package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.iw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7809iw extends C8152sd implements C7882kw {
    C7809iw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* renamed from: i4 */
    public final void mo31966i4(zzbfd zzbfd) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbfd);
        mo34695f3(1, x);
    }

    /* renamed from: y0 */
    public final void mo31967y0(zzbfd zzbfd, int i) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbfd);
        x.writeInt(i);
        mo34695f3(5, x);
    }

    public final boolean zzi() throws RemoteException {
        Parcel b2 = mo34694b2(3, mo34697x());
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }
}
