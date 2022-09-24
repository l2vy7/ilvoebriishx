package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class ux2 extends C8152sd implements wx2 {
    ux2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    /* renamed from: C1 */
    public final C10487a mo35328C1(String str, C10487a aVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        C8223ud.m38297f(x, aVar);
        x.writeString("");
        x.writeString("javascript");
        x.writeString(str4);
        x.writeString(str5);
        x.writeString(str6);
        x.writeString(str7);
        x.writeString(str8);
        Parcel b2 = mo34694b2(10, x);
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    /* renamed from: F3 */
    public final void mo35329F3(C10487a aVar, C10487a aVar2) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38297f(x, aVar2);
        mo34695f3(5, x);
    }

    /* renamed from: G */
    public final void mo35330G(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(4, x);
    }

    /* renamed from: p1 */
    public final C10487a mo35331p1(String str, C10487a aVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        C8223ud.m38297f(x, aVar);
        x.writeString("");
        x.writeString("javascript");
        x.writeString(str4);
        x.writeString("Google");
        x.writeString(str6);
        x.writeString(str7);
        x.writeString(str8);
        Parcel b2 = mo34694b2(11, x);
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    /* renamed from: v */
    public final void mo35332v(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(7, x);
    }

    public final String zzg() throws RemoteException {
        Parcel b2 = mo34694b2(6, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final void zzh(C10487a aVar, C10487a aVar2) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38297f(x, aVar2);
        mo34695f3(8, x);
    }

    public final boolean zzl(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        Parcel b2 = mo34694b2(2, x);
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }
}
