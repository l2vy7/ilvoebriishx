package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p199d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class gd0 extends C8152sd implements id0 {
    gd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: J5 */
    public final void mo31203J5(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(20, x);
    }

    /* renamed from: O3 */
    public final void mo31204O3(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(22, x);
    }

    /* renamed from: m0 */
    public final void mo31205m0(C10487a aVar, C10487a aVar2, C10487a aVar3) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38297f(x, aVar2);
        C8223ud.m38297f(x, aVar3);
        mo34695f3(21, x);
    }

    /* renamed from: n */
    public final String mo31206n() throws RemoteException {
        Parcel b2 = mo34694b2(9, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final boolean zzA() throws RemoteException {
        Parcel b2 = mo34694b2(18, mo34697x());
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    public final boolean zzB() throws RemoteException {
        Parcel b2 = mo34694b2(17, mo34697x());
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    public final double zze() throws RemoteException {
        Parcel b2 = mo34694b2(8, mo34697x());
        double readDouble = b2.readDouble();
        b2.recycle();
        return readDouble;
    }

    public final float zzf() throws RemoteException {
        Parcel b2 = mo34694b2(23, mo34697x());
        float readFloat = b2.readFloat();
        b2.recycle();
        return readFloat;
    }

    public final float zzg() throws RemoteException {
        Parcel b2 = mo34694b2(25, mo34697x());
        float readFloat = b2.readFloat();
        b2.recycle();
        return readFloat;
    }

    public final float zzh() throws RemoteException {
        Parcel b2 = mo34694b2(24, mo34697x());
        float readFloat = b2.readFloat();
        b2.recycle();
        return readFloat;
    }

    public final Bundle zzi() throws RemoteException {
        Parcel b2 = mo34694b2(16, mo34697x());
        Bundle bundle = (Bundle) C8223ud.m38292a(b2, Bundle.CREATOR);
        b2.recycle();
        return bundle;
    }

    public final C7774hy zzj() throws RemoteException {
        Parcel b2 = mo34694b2(11, mo34697x());
        C7774hy n6 = C7736gy.m32737n6(b2.readStrongBinder());
        b2.recycle();
        return n6;
    }

    public final i30 zzk() throws RemoteException {
        Parcel b2 = mo34694b2(12, mo34697x());
        i30 n6 = g30.m32343n6(b2.readStrongBinder());
        b2.recycle();
        return n6;
    }

    public final q30 zzl() throws RemoteException {
        Parcel b2 = mo34694b2(5, mo34697x());
        q30 n6 = p30.m35940n6(b2.readStrongBinder());
        b2.recycle();
        return n6;
    }

    public final C10487a zzm() throws RemoteException {
        Parcel b2 = mo34694b2(13, mo34697x());
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    public final C10487a zzn() throws RemoteException {
        Parcel b2 = mo34694b2(14, mo34697x());
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    public final C10487a zzo() throws RemoteException {
        Parcel b2 = mo34694b2(15, mo34697x());
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    public final String zzp() throws RemoteException {
        Parcel b2 = mo34694b2(7, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final String zzq() throws RemoteException {
        Parcel b2 = mo34694b2(4, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final String zzr() throws RemoteException {
        Parcel b2 = mo34694b2(6, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final String zzs() throws RemoteException {
        Parcel b2 = mo34694b2(2, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final String zzt() throws RemoteException {
        Parcel b2 = mo34694b2(10, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final List zzv() throws RemoteException {
        Parcel b2 = mo34694b2(3, mo34697x());
        ArrayList b = C8223ud.m38293b(b2);
        b2.recycle();
        return b;
    }

    public final void zzx() throws RemoteException {
        mo34695f3(19, mo34697x());
    }
}
