package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class ak0 extends C8187td implements bk0 {
    public ak0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* renamed from: n6 */
    public static bk0 m30365n6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof bk0 ? (bk0) queryLocalInterface : new zj0(iBinder);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.gms.internal.ads.kk0} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.jk0] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.fk0] */
    /* JADX WARNING: type inference failed for: r0v14, types: [com.google.android.gms.internal.ads.jk0] */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28554m6(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            java.lang.String r5 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback"
            r0 = 0
            switch(r2) {
                case 1: goto L_0x010c;
                case 2: goto L_0x00eb;
                case 3: goto L_0x00e0;
                case 4: goto L_0x00d5;
                case 5: goto L_0x00c6;
                case 6: goto L_0x00a4;
                case 7: goto L_0x0094;
                case 8: goto L_0x0084;
                case 9: goto L_0x0078;
                case 10: goto L_0x0064;
                case 11: goto L_0x0058;
                case 12: goto L_0x004c;
                case 13: goto L_0x003c;
                case 14: goto L_0x0014;
                case 15: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r2 = 0
            return r2
        L_0x0008:
            boolean r2 = com.google.android.gms.internal.ads.C8223ud.m38298g(r3)
            r1.mo30686Q(r2)
            r4.writeNoException()
            goto L_0x0132
        L_0x0014:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfd> r2 = com.google.android.gms.internal.ads.zzbfd.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C8223ud.m38292a(r3, r2)
            com.google.android.gms.internal.ads.zzbfd r2 = (com.google.android.gms.internal.ads.zzbfd) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x0023
            goto L_0x0034
        L_0x0023:
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.jk0
            if (r0 == 0) goto L_0x002f
            r0 = r5
            com.google.android.gms.internal.ads.jk0 r0 = (com.google.android.gms.internal.ads.jk0) r0
            goto L_0x0034
        L_0x002f:
            com.google.android.gms.internal.ads.hk0 r0 = new com.google.android.gms.internal.ads.hk0
            r0.<init>(r3)
        L_0x0034:
            r1.mo30684D2(r2, r0)
            r4.writeNoException()
            goto L_0x0132
        L_0x003c:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.by r2 = com.google.android.gms.internal.ads.C7520ay.m30548n6(r2)
            r1.mo30690j3(r2)
            r4.writeNoException()
            goto L_0x0132
        L_0x004c:
            com.google.android.gms.internal.ads.ey r2 = r1.zzc()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r4, r2)
            goto L_0x0132
        L_0x0058:
            com.google.android.gms.internal.ads.yj0 r2 = r1.zzd()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r4, r2)
            goto L_0x0132
        L_0x0064:
            android.os.IBinder r2 = r3.readStrongBinder()
            d5.a r2 = p199d5.C10487a.C10488a.m48193b2(r2)
            boolean r3 = com.google.android.gms.internal.ads.C8223ud.m38298g(r3)
            r1.mo30691l3(r2, r3)
            r4.writeNoException()
            goto L_0x0132
        L_0x0078:
            android.os.Bundle r2 = r1.zzb()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38296e(r4, r2)
            goto L_0x0132
        L_0x0084:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.yx r2 = com.google.android.gms.internal.ads.C8349xx.m39628n6(r2)
            r1.mo30689f5(r2)
            r4.writeNoException()
            goto L_0x0132
        L_0x0094:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzcfn> r2 = com.google.android.gms.internal.ads.zzcfn.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C8223ud.m38292a(r3, r2)
            com.google.android.gms.internal.ads.zzcfn r2 = (com.google.android.gms.internal.ads.zzcfn) r2
            r1.mo30687W0(r2)
            r4.writeNoException()
            goto L_0x0132
        L_0x00a4:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x00ab
            goto L_0x00be
        L_0x00ab:
            java.lang.String r3 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.kk0
            if (r5 == 0) goto L_0x00b9
            r0 = r3
            com.google.android.gms.internal.ads.kk0 r0 = (com.google.android.gms.internal.ads.kk0) r0
            goto L_0x00be
        L_0x00b9:
            com.google.android.gms.internal.ads.kk0 r0 = new com.google.android.gms.internal.ads.kk0
            r0.<init>(r2)
        L_0x00be:
            r1.mo30693w2(r0)
            r4.writeNoException()
            goto L_0x0132
        L_0x00c6:
            android.os.IBinder r2 = r3.readStrongBinder()
            d5.a r2 = p199d5.C10487a.C10488a.m48193b2(r2)
            r1.mo30692p0(r2)
            r4.writeNoException()
            goto L_0x0132
        L_0x00d5:
            java.lang.String r2 = r1.zze()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x0132
        L_0x00e0:
            boolean r2 = r1.zzo()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38294c(r4, r2)
            goto L_0x0132
        L_0x00eb:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x00f2
            goto L_0x0105
        L_0x00f2:
            java.lang.String r3 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.fk0
            if (r5 == 0) goto L_0x0100
            r0 = r3
            com.google.android.gms.internal.ads.fk0 r0 = (com.google.android.gms.internal.ads.fk0) r0
            goto L_0x0105
        L_0x0100:
            com.google.android.gms.internal.ads.dk0 r0 = new com.google.android.gms.internal.ads.dk0
            r0.<init>(r2)
        L_0x0105:
            r1.mo30688Y2(r0)
            r4.writeNoException()
            goto L_0x0132
        L_0x010c:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfd> r2 = com.google.android.gms.internal.ads.zzbfd.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C8223ud.m38292a(r3, r2)
            com.google.android.gms.internal.ads.zzbfd r2 = (com.google.android.gms.internal.ads.zzbfd) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x011b
            goto L_0x012c
        L_0x011b:
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.jk0
            if (r0 == 0) goto L_0x0127
            r0 = r5
            com.google.android.gms.internal.ads.jk0 r0 = (com.google.android.gms.internal.ads.jk0) r0
            goto L_0x012c
        L_0x0127:
            com.google.android.gms.internal.ads.hk0 r0 = new com.google.android.gms.internal.ads.hk0
            r0.<init>(r3)
        L_0x012c:
            r1.mo30685G1(r2, r0)
            r4.writeNoException()
        L_0x0132:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ak0.mo28554m6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
