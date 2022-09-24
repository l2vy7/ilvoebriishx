package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class t30 extends C8187td implements u30 {
    public t30() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: n6 */
    public static u30 m37668n6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof u30 ? (u30) queryLocalInterface : new s30(iBinder);
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: m6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28554m6(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            switch(r1) {
                case 1: goto L_0x0089;
                case 2: goto L_0x007a;
                case 3: goto L_0x006b;
                case 4: goto L_0x0064;
                case 5: goto L_0x0056;
                case 6: goto L_0x0047;
                case 7: goto L_0x0038;
                case 8: goto L_0x0015;
                case 9: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            android.os.IBinder r1 = r2.readStrongBinder()
            d5.a r1 = p199d5.C10487a.C10488a.m48193b2(r1)
            r0.mo31335S1(r1)
            r3.writeNoException()
            goto L_0x009b
        L_0x0015:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x001d
            r1 = 0
            goto L_0x0031
        L_0x001d:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IMediaContent"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.n30
            if (r4 == 0) goto L_0x002b
            r1 = r2
            com.google.android.gms.internal.ads.n30 r1 = (com.google.android.gms.internal.ads.n30) r1
            goto L_0x0031
        L_0x002b:
            com.google.android.gms.internal.ads.l30 r2 = new com.google.android.gms.internal.ads.l30
            r2.<init>(r1)
            r1 = r2
        L_0x0031:
            r0.mo31336U2(r1)
            r3.writeNoException()
            goto L_0x009b
        L_0x0038:
            android.os.IBinder r1 = r2.readStrongBinder()
            d5.a r1 = p199d5.C10487a.C10488a.m48193b2(r1)
            r0.mo31333D(r1)
            r3.writeNoException()
            goto L_0x009b
        L_0x0047:
            android.os.IBinder r1 = r2.readStrongBinder()
            d5.a r1 = p199d5.C10487a.C10488a.m48193b2(r1)
            r0.mo31338k0(r1)
            r3.writeNoException()
            goto L_0x009b
        L_0x0056:
            android.os.IBinder r1 = r2.readStrongBinder()
            p199d5.C10487a.C10488a.m48193b2(r1)
            r2.readInt()
            r3.writeNoException()
            goto L_0x009b
        L_0x0064:
            r0.zzc()
            r3.writeNoException()
            goto L_0x009b
        L_0x006b:
            android.os.IBinder r1 = r2.readStrongBinder()
            d5.a r1 = p199d5.C10487a.C10488a.m48193b2(r1)
            r0.mo31334I2(r1)
            r3.writeNoException()
            goto L_0x009b
        L_0x007a:
            java.lang.String r1 = r2.readString()
            d5.a r1 = r0.mo31337a(r1)
            r3.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r3, r1)
            goto L_0x009b
        L_0x0089:
            java.lang.String r1 = r2.readString()
            android.os.IBinder r2 = r2.readStrongBinder()
            d5.a r2 = p199d5.C10487a.C10488a.m48193b2(r2)
            r0.mo31332C2(r1, r2)
            r3.writeNoException()
        L_0x009b:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t30.mo28554m6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
