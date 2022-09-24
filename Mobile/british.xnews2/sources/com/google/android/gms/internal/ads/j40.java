package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class j40 extends C8152sd implements l40 {
    j40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: P */
    public final void mo32832P(String str) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        mo34695f3(5, x);
    }

    /* renamed from: W */
    public final boolean mo32833W(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        Parcel b2 = mo34694b2(10, x);
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.q30 mo32834c(java.lang.String r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo34697x()
            r0.writeString(r4)
            r4 = 2
            android.os.Parcel r4 = r3.mo34694b2(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.q30
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.q30 r0 = (com.google.android.gms.internal.ads.q30) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.o30 r1 = new com.google.android.gms.internal.ads.o30
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j40.mo32834c(java.lang.String):com.google.android.gms.internal.ads.q30");
    }

    /* renamed from: f0 */
    public final String mo32835f0(String str) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        Parcel b2 = mo34694b2(1, x);
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    /* renamed from: g0 */
    public final void mo32836g0(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(14, x);
    }

    public final C7774hy zze() throws RemoteException {
        Parcel b2 = mo34694b2(7, mo34697x());
        C7774hy n6 = C7736gy.m32737n6(b2.readStrongBinder());
        b2.recycle();
        return n6;
    }

    public final C10487a zzg() throws RemoteException {
        Parcel b2 = mo34694b2(9, mo34697x());
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    public final String zzh() throws RemoteException {
        Parcel b2 = mo34694b2(4, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final List<String> zzj() throws RemoteException {
        Parcel b2 = mo34694b2(3, mo34697x());
        ArrayList<String> createStringArrayList = b2.createStringArrayList();
        b2.recycle();
        return createStringArrayList;
    }

    public final void zzk() throws RemoteException {
        mo34695f3(8, mo34697x());
    }

    public final void zzl() throws RemoteException {
        mo34695f3(15, mo34697x());
    }

    public final void zzn() throws RemoteException {
        mo34695f3(6, mo34697x());
    }

    public final boolean zzp() throws RemoteException {
        Parcel b2 = mo34694b2(12, mo34697x());
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    public final boolean zzr() throws RemoteException {
        Parcel b2 = mo34694b2(13, mo34697x());
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }
}
