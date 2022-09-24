package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p199d5.C10487a;

/* renamed from: com.google.android.gms.internal.ads.gx */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7735gx extends C8152sd implements C7846jx {
    C7735gx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* renamed from: M3 */
    public final void mo31973M3(String str, C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString((String) null);
        C8223ud.m38297f(x, aVar);
        mo34695f3(6, x);
    }

    /* renamed from: R1 */
    public final void mo31974R1(C10487a aVar, String str) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        x.writeString(str);
        mo34695f3(5, x);
    }

    /* renamed from: a0 */
    public final void mo31975a0(boolean z) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38294c(x, z);
        mo34695f3(4, x);
    }

    /* renamed from: c2 */
    public final void mo31977c2(e90 e90) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, e90);
        mo34695f3(12, x);
    }

    /* renamed from: g5 */
    public final void mo31978g5(C4627vx vxVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, vxVar);
        mo34695f3(16, x);
    }

    /* renamed from: j5 */
    public final void mo31979j5(tc0 tc0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, tc0);
        mo34695f3(11, x);
    }

    /* renamed from: t0 */
    public final void mo31981t0(zzbkk zzbkk) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbkk);
        mo34695f3(14, x);
    }

    /* renamed from: w */
    public final void mo31982w(String str) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        mo34695f3(10, x);
    }

    /* renamed from: w5 */
    public final void mo31983w5(float f) throws RemoteException {
        Parcel x = mo34697x();
        x.writeFloat(f);
        mo34695f3(2, x);
    }

    public final float zze() throws RemoteException {
        Parcel b2 = mo34694b2(7, mo34697x());
        float readFloat = b2.readFloat();
        b2.recycle();
        return readFloat;
    }

    public final String zzf() throws RemoteException {
        Parcel b2 = mo34694b2(9, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final List<zzbtn> zzg() throws RemoteException {
        Parcel b2 = mo34694b2(13, mo34697x());
        ArrayList<zzbtn> createTypedArrayList = b2.createTypedArrayList(zzbtn.CREATOR);
        b2.recycle();
        return createTypedArrayList;
    }

    public final void zzi() throws RemoteException {
        mo34695f3(15, mo34697x());
    }

    public final void zzj() throws RemoteException {
        mo34695f3(1, mo34697x());
    }

    public final boolean zzt() throws RemoteException {
        Parcel b2 = mo34694b2(8, mo34697x());
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }
}
