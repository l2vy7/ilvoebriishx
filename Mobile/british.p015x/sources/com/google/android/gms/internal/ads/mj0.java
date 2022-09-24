package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class mj0 extends C8187td implements nj0 {
    public mj0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.google.android.gms.internal.ads.lj0} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.qj0] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28554m6(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
        /*
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L_0x0127
            r0 = 2
            if (r3 == r0) goto L_0x0120
            r0 = 3
            r1 = 0
            if (r3 == r0) goto L_0x00ff
            r0 = 34
            if (r3 == r0) goto L_0x00f4
            switch(r3) {
                case 5: goto L_0x00e9;
                case 6: goto L_0x00e2;
                case 7: goto L_0x00db;
                case 8: goto L_0x00d4;
                case 9: goto L_0x00c5;
                case 10: goto L_0x00b5;
                case 11: goto L_0x00a5;
                case 12: goto L_0x0099;
                case 13: goto L_0x008d;
                case 14: goto L_0x007d;
                case 15: goto L_0x0071;
                case 16: goto L_0x004f;
                case 17: goto L_0x0047;
                case 18: goto L_0x0037;
                case 19: goto L_0x002b;
                case 20: goto L_0x001f;
                case 21: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            r3 = 0
            return r3
        L_0x0013:
            com.google.android.gms.internal.ads.ey r3 = r2.zzc()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r5, r3)
            goto L_0x0135
        L_0x001f:
            boolean r3 = r2.zzt()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38294c(r5, r3)
            goto L_0x0135
        L_0x002b:
            java.lang.String r3 = r4.readString()
            r2.mo31903P(r3)
            r5.writeNoException()
            goto L_0x0135
        L_0x0037:
            android.os.IBinder r3 = r4.readStrongBinder()
            d5.a r3 = p199d5.C10487a.C10488a.m48193b2(r3)
            r2.mo31904R(r3)
            r5.writeNoException()
            goto L_0x0135
        L_0x0047:
            r4.readString()
            r5.writeNoException()
            goto L_0x0135
        L_0x004f:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0056
            goto L_0x0069
        L_0x0056:
            java.lang.String r4 = "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.lj0
            if (r0 == 0) goto L_0x0064
            r1 = r4
            com.google.android.gms.internal.ads.lj0 r1 = (com.google.android.gms.internal.ads.lj0) r1
            goto L_0x0069
        L_0x0064:
            com.google.android.gms.internal.ads.lj0 r1 = new com.google.android.gms.internal.ads.lj0
            r1.<init>(r3)
        L_0x0069:
            r2.mo31905g2(r1)
            r5.writeNoException()
            goto L_0x0135
        L_0x0071:
            android.os.Bundle r3 = r2.zzb()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38296e(r5, r3)
            goto L_0x0135
        L_0x007d:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.vw r3 = com.google.android.gms.internal.ads.C8242uw.m38504n6(r3)
            r2.mo31908q3(r3)
            r5.writeNoException()
            goto L_0x0135
        L_0x008d:
            java.lang.String r3 = r4.readString()
            r2.mo31906j(r3)
            r5.writeNoException()
            goto L_0x0135
        L_0x0099:
            java.lang.String r3 = r2.zzd()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x0135
        L_0x00a5:
            android.os.IBinder r3 = r4.readStrongBinder()
            d5.a r3 = p199d5.C10487a.C10488a.m48193b2(r3)
            r2.mo31910y(r3)
            r5.writeNoException()
            goto L_0x0135
        L_0x00b5:
            android.os.IBinder r3 = r4.readStrongBinder()
            d5.a r3 = p199d5.C10487a.C10488a.m48193b2(r3)
            r2.mo31901G(r3)
            r5.writeNoException()
            goto L_0x0135
        L_0x00c5:
            android.os.IBinder r3 = r4.readStrongBinder()
            d5.a r3 = p199d5.C10487a.C10488a.m48193b2(r3)
            r2.mo31909v(r3)
            r5.writeNoException()
            goto L_0x0135
        L_0x00d4:
            r2.zze()
            r5.writeNoException()
            goto L_0x0135
        L_0x00db:
            r2.zzj()
            r5.writeNoException()
            goto L_0x0135
        L_0x00e2:
            r2.zzh()
            r5.writeNoException()
            goto L_0x0135
        L_0x00e9:
            boolean r3 = r2.zzs()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38294c(r5, r3)
            goto L_0x0135
        L_0x00f4:
            boolean r3 = com.google.android.gms.internal.ads.C8223ud.m38298g(r4)
            r2.mo31902K1(r3)
            r5.writeNoException()
            goto L_0x0135
        L_0x00ff:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0106
            goto L_0x0119
        L_0x0106:
            java.lang.String r4 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.qj0
            if (r0 == 0) goto L_0x0114
            r1 = r4
            com.google.android.gms.internal.ads.qj0 r1 = (com.google.android.gms.internal.ads.qj0) r1
            goto L_0x0119
        L_0x0114:
            com.google.android.gms.internal.ads.oj0 r1 = new com.google.android.gms.internal.ads.oj0
            r1.<init>(r3)
        L_0x0119:
            r2.mo31907o3(r1)
            r5.writeNoException()
            goto L_0x0135
        L_0x0120:
            r2.zzq()
            r5.writeNoException()
            goto L_0x0135
        L_0x0127:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzcen> r3 = com.google.android.gms.internal.ads.zzcen.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.C8223ud.m38292a(r4, r3)
            com.google.android.gms.internal.ads.zzcen r3 = (com.google.android.gms.internal.ads.zzcen) r3
            r2.mo31900B2(r3)
            r5.writeNoException()
        L_0x0135:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mj0.mo28554m6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
