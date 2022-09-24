package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class rc0 extends C8152sd implements tc0 {
    rc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.wc0 mo34307a(java.lang.String r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo34697x()
            r0.writeString(r4)
            r4 = 1
            android.os.Parcel r4 = r3.mo34694b2(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.wc0
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.wc0 r0 = (com.google.android.gms.internal.ads.wc0) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.uc0 r1 = new com.google.android.gms.internal.ads.uc0
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rc0.mo34307a(java.lang.String):com.google.android.gms.internal.ads.wc0");
    }

    /* renamed from: b */
    public final boolean mo34308b(String str) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        Parcel b2 = mo34694b2(4, x);
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    /* renamed from: c */
    public final boolean mo34309c(String str) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        Parcel b2 = mo34694b2(2, x);
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    /* renamed from: z */
    public final te0 mo34311z(String str) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        Parcel b2 = mo34694b2(3, x);
        te0 n6 = se0.m37392n6(b2.readStrongBinder());
        b2.recycle();
        return n6;
    }
}
