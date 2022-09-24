package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.fy */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7700fy extends C8152sd implements C7774hy {
    C7700fy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: F */
    public final void mo18394F(boolean z) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38294c(x, z);
        mo34695f3(3, x);
    }

    /* renamed from: i3 */
    public final void mo18395i3(C7921ly lyVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, lyVar);
        mo34695f3(8, x);
    }

    public final float zze() throws RemoteException {
        throw null;
    }

    public final float zzf() throws RemoteException {
        throw null;
    }

    public final float zzg() throws RemoteException {
        throw null;
    }

    public final int zzh() throws RemoteException {
        Parcel b2 = mo34694b2(5, mo34697x());
        int readInt = b2.readInt();
        b2.recycle();
        return readInt;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C7921ly zzi() throws android.os.RemoteException {
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
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C7921ly
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.ly r1 = (com.google.android.gms.internal.ads.C7921ly) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.jy r2 = new com.google.android.gms.internal.ads.jy
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7700fy.zzi():com.google.android.gms.internal.ads.ly");
    }

    public final void zzk() throws RemoteException {
        mo34695f3(2, mo34697x());
    }

    public final void zzl() throws RemoteException {
        mo34695f3(1, mo34697x());
    }

    public final void zzn() throws RemoteException {
        mo34695f3(13, mo34697x());
    }

    public final boolean zzo() throws RemoteException {
        Parcel b2 = mo34694b2(12, mo34697x());
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    public final boolean zzp() throws RemoteException {
        Parcel b2 = mo34694b2(10, mo34697x());
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    public final boolean zzq() throws RemoteException {
        Parcel b2 = mo34694b2(4, mo34697x());
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }
}
