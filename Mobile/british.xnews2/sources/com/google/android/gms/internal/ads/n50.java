package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class n50 extends C8152sd implements p50 {
    n50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* renamed from: K4 */
    public final boolean mo33632K4(Bundle bundle) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, bundle);
        Parcel b2 = mo34694b2(16, x);
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    /* renamed from: S2 */
    public final void mo33633S2(Bundle bundle) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, bundle);
        mo34695f3(17, x);
    }

    /* renamed from: V5 */
    public final void mo33634V5(Bundle bundle) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, bundle);
        mo34695f3(15, x);
    }

    /* renamed from: W2 */
    public final void mo33635W2(C7994nx nxVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, nxVar);
        mo34695f3(26, x);
    }

    /* renamed from: b4 */
    public final void mo33636b4(m50 m50) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, m50);
        mo34695f3(21, x);
    }

    /* renamed from: k4 */
    public final void mo33637k4(C7555by byVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, byVar);
        mo34695f3(32, x);
    }

    /* renamed from: n */
    public final List mo33638n() throws RemoteException {
        Parcel b2 = mo34694b2(3, mo34697x());
        ArrayList b = C8223ud.m38293b(b2);
        b2.recycle();
        return b;
    }

    /* renamed from: q */
    public final boolean mo33639q() throws RemoteException {
        Parcel b2 = mo34694b2(30, mo34697x());
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    /* renamed from: q5 */
    public final void mo33640q5(C8137rx rxVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, rxVar);
        mo34695f3(25, x);
    }

    /* renamed from: r */
    public final void mo33641r() throws RemoteException {
        mo34695f3(22, mo34697x());
    }

    /* renamed from: t */
    public final boolean mo33642t() throws RemoteException {
        Parcel b2 = mo34694b2(24, mo34697x());
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    public final void zzA() throws RemoteException {
        mo34695f3(28, mo34697x());
    }

    public final void zzC() throws RemoteException {
        mo34695f3(27, mo34697x());
    }

    public final double zze() throws RemoteException {
        Parcel b2 = mo34694b2(8, mo34697x());
        double readDouble = b2.readDouble();
        b2.recycle();
        return readDouble;
    }

    public final Bundle zzf() throws RemoteException {
        Parcel b2 = mo34694b2(20, mo34697x());
        Bundle bundle = (Bundle) C8223ud.m38292a(b2, Bundle.CREATOR);
        b2.recycle();
        return bundle;
    }

    public final C7663ey zzg() throws RemoteException {
        Parcel b2 = mo34694b2(31, mo34697x());
        C7663ey n6 = C7626dy.m31644n6(b2.readStrongBinder());
        b2.recycle();
        return n6;
    }

    public final C7774hy zzh() throws RemoteException {
        Parcel b2 = mo34694b2(11, mo34697x());
        C7774hy n6 = C7736gy.m32737n6(b2.readStrongBinder());
        b2.recycle();
        return n6;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.i30 zzi() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo34697x()
            r1 = 14
            android.os.Parcel r0 = r4.mo34694b2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IAttributionInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.i30
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.i30 r1 = (com.google.android.gms.internal.ads.i30) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.f30 r2 = new com.google.android.gms.internal.ads.f30
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n50.zzi():com.google.android.gms.internal.ads.i30");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.n30 zzj() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo34697x()
            r1 = 29
            android.os.Parcel r0 = r4.mo34694b2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IMediaContent"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.n30
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.n30 r1 = (com.google.android.gms.internal.ads.n30) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.l30 r2 = new com.google.android.gms.internal.ads.l30
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n50.zzj():com.google.android.gms.internal.ads.n30");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.q30 zzk() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo34697x()
            r1 = 5
            android.os.Parcel r0 = r4.mo34694b2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.q30
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.q30 r1 = (com.google.android.gms.internal.ads.q30) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.o30 r2 = new com.google.android.gms.internal.ads.o30
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n50.zzk():com.google.android.gms.internal.ads.q30");
    }

    public final C10487a zzl() throws RemoteException {
        Parcel b2 = mo34694b2(19, mo34697x());
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    public final C10487a zzm() throws RemoteException {
        Parcel b2 = mo34694b2(18, mo34697x());
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    public final String zzn() throws RemoteException {
        Parcel b2 = mo34694b2(7, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final String zzo() throws RemoteException {
        Parcel b2 = mo34694b2(4, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final String zzp() throws RemoteException {
        Parcel b2 = mo34694b2(6, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final String zzq() throws RemoteException {
        Parcel b2 = mo34694b2(2, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final String zzr() throws RemoteException {
        Parcel b2 = mo34694b2(12, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final String zzs() throws RemoteException {
        Parcel b2 = mo34694b2(10, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final String zzt() throws RemoteException {
        Parcel b2 = mo34694b2(9, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final List zzv() throws RemoteException {
        Parcel b2 = mo34694b2(23, mo34697x());
        ArrayList b = C8223ud.m38293b(b2);
        b2.recycle();
        return b;
    }

    public final void zzx() throws RemoteException {
        mo34695f3(13, mo34697x());
    }
}
