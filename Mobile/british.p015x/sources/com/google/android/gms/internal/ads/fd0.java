package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p199d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class fd0 extends C8152sd {
    fd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* renamed from: n6 */
    public final C7774hy mo31803n6() throws RemoteException {
        Parcel b2 = mo34694b2(16, mo34697x());
        C7774hy n6 = C7736gy.m32737n6(b2.readStrongBinder());
        b2.recycle();
        return n6;
    }

    /* renamed from: o6 */
    public final i30 mo31804o6() throws RemoteException {
        Parcel b2 = mo34694b2(19, mo34697x());
        i30 n6 = g30.m32343n6(b2.readStrongBinder());
        b2.recycle();
        return n6;
    }

    /* renamed from: p6 */
    public final q30 mo31805p6() throws RemoteException {
        Parcel b2 = mo34694b2(5, mo34697x());
        q30 n6 = p30.m35940n6(b2.readStrongBinder());
        b2.recycle();
        return n6;
    }

    /* renamed from: q6 */
    public final C10487a mo31806q6() throws RemoteException {
        Parcel b2 = mo34694b2(20, mo34697x());
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    /* renamed from: r6 */
    public final List mo31807r6() throws RemoteException {
        Parcel b2 = mo34694b2(3, mo34697x());
        ArrayList b = C8223ud.m38293b(b2);
        b2.recycle();
        return b;
    }

    /* renamed from: s6 */
    public final void mo31808s6(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(9, x);
    }

    /* renamed from: t6 */
    public final void mo31809t6(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(10, x);
    }

    /* renamed from: u6 */
    public final void mo31810u6(C10487a aVar, C10487a aVar2, C10487a aVar3) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38297f(x, aVar2);
        C8223ud.m38297f(x, aVar3);
        mo34695f3(22, x);
    }

    /* renamed from: v6 */
    public final void mo31811v6(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(14, x);
    }

    /* renamed from: w6 */
    public final boolean mo31812w6() throws RemoteException {
        Parcel b2 = mo34694b2(12, mo34697x());
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    /* renamed from: x6 */
    public final boolean mo31813x6() throws RemoteException {
        Parcel b2 = mo34694b2(11, mo34697x());
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    public final Bundle zze() throws RemoteException {
        Parcel b2 = mo34694b2(13, mo34697x());
        Bundle bundle = (Bundle) C8223ud.m38292a(b2, Bundle.CREATOR);
        b2.recycle();
        return bundle;
    }

    public final C10487a zzi() throws RemoteException {
        Parcel b2 = mo34694b2(15, mo34697x());
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    public final C10487a zzk() throws RemoteException {
        Parcel b2 = mo34694b2(21, mo34697x());
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    public final String zzl() throws RemoteException {
        Parcel b2 = mo34694b2(7, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final String zzm() throws RemoteException {
        Parcel b2 = mo34694b2(4, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final String zzn() throws RemoteException {
        Parcel b2 = mo34694b2(6, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final String zzo() throws RemoteException {
        Parcel b2 = mo34694b2(2, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final void zzr() throws RemoteException {
        mo34695f3(8, mo34697x());
    }
}
