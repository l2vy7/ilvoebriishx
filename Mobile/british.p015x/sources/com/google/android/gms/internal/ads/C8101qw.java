package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.qw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C8101qw extends C8187td implements C8136rw {
    public C8101qw() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static C8136rw zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof C8136rw ? (C8136rw) queryLocalInterface : new C8065pw(iBinder);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: com.google.android.gms.internal.ads.cx} */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2, types: [com.google.android.gms.internal.ads.dw] */
    /* JADX WARNING: type inference failed for: r5v7, types: [com.google.android.gms.internal.ads.yw] */
    /* JADX WARNING: type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.aw] */
    /* JADX WARNING: type inference failed for: r5v22, types: [com.google.android.gms.internal.ads.vw] */
    /* JADX WARNING: type inference failed for: r5v27, types: [com.google.android.gms.internal.ads.by] */
    /* JADX WARNING: type inference failed for: r5v32, types: [com.google.android.gms.internal.ads.hw] */
    /* JADX WARNING: type inference failed for: r5v37, types: [com.google.android.gms.internal.ads.fx] */
    /* JADX WARNING: type inference failed for: r5v42 */
    /* JADX WARNING: type inference failed for: r5v43 */
    /* JADX WARNING: type inference failed for: r5v44 */
    /* JADX WARNING: type inference failed for: r5v45 */
    /* JADX WARNING: type inference failed for: r5v46 */
    /* JADX WARNING: type inference failed for: r5v47 */
    /* JADX WARNING: type inference failed for: r5v48 */
    /* JADX WARNING: type inference failed for: r5v49 */
    /* JADX WARNING: type inference failed for: r5v50 */
    /* JADX WARNING: type inference failed for: r5v51 */
    /* JADX WARNING: type inference failed for: r5v52 */
    /* JADX WARNING: type inference failed for: r5v53 */
    /* JADX WARNING: type inference failed for: r5v54 */
    /* JADX WARNING: type inference failed for: r5v55 */
    /* JADX WARNING: type inference failed for: r5v56 */
    /* JADX WARNING: type inference failed for: r5v57 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28554m6(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r5 = 0
            switch(r2) {
                case 1: goto L_0x02af;
                case 2: goto L_0x02a8;
                case 3: goto L_0x029d;
                case 4: goto L_0x028a;
                case 5: goto L_0x0283;
                case 6: goto L_0x027c;
                case 7: goto L_0x025b;
                case 8: goto L_0x023a;
                case 9: goto L_0x0232;
                case 10: goto L_0x022d;
                case 11: goto L_0x0225;
                case 12: goto L_0x0219;
                case 13: goto L_0x0209;
                case 14: goto L_0x01f9;
                case 15: goto L_0x01e5;
                case 16: goto L_0x0004;
                case 17: goto L_0x0004;
                case 18: goto L_0x01d9;
                case 19: goto L_0x01c9;
                case 20: goto L_0x01a7;
                case 21: goto L_0x0185;
                case 22: goto L_0x0179;
                case 23: goto L_0x016d;
                case 24: goto L_0x015d;
                case 25: goto L_0x0151;
                case 26: goto L_0x0145;
                case 27: goto L_0x0004;
                case 28: goto L_0x0004;
                case 29: goto L_0x0135;
                case 30: goto L_0x0125;
                case 31: goto L_0x0119;
                case 32: goto L_0x010d;
                case 33: goto L_0x0101;
                case 34: goto L_0x00f5;
                case 35: goto L_0x00e9;
                case 36: goto L_0x00c7;
                case 37: goto L_0x00bb;
                case 38: goto L_0x00af;
                case 39: goto L_0x009f;
                case 40: goto L_0x008f;
                case 41: goto L_0x0083;
                case 42: goto L_0x0061;
                case 43: goto L_0x0038;
                case 44: goto L_0x0028;
                case 45: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r2 = 0
            return r2
        L_0x0006:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x000d
            goto L_0x0020
        L_0x000d:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IFullScreenContentCallback"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C7699fx
            if (r5 == 0) goto L_0x001b
            r5 = r3
            com.google.android.gms.internal.ads.fx r5 = (com.google.android.gms.internal.ads.C7699fx) r5
            goto L_0x0020
        L_0x001b:
            com.google.android.gms.internal.ads.dx r5 = new com.google.android.gms.internal.ads.dx
            r5.<init>(r2)
        L_0x0020:
            r1.zzJ(r5)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0028:
            android.os.IBinder r2 = r3.readStrongBinder()
            d5.a r2 = p199d5.C10487a.C10488a.m48193b2(r2)
            r1.zzW(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0038:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfd> r2 = com.google.android.gms.internal.ads.zzbfd.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C8223ud.m38292a(r3, r2)
            com.google.android.gms.internal.ads.zzbfd r2 = (com.google.android.gms.internal.ads.zzbfd) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x0047
            goto L_0x0059
        L_0x0047:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.IAdLoadCallback"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.C7772hw
            if (r0 == 0) goto L_0x0054
            com.google.android.gms.internal.ads.hw r5 = (com.google.android.gms.internal.ads.C7772hw) r5
            goto L_0x0059
        L_0x0054:
            com.google.android.gms.internal.ads.ew r5 = new com.google.android.gms.internal.ads.ew
            r5.<init>(r3)
        L_0x0059:
            r1.zzy(r2, r5)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0061:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0068
            goto L_0x007b
        L_0x0068:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IOnPaidEventListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C7555by
            if (r5 == 0) goto L_0x0076
            r5 = r3
            com.google.android.gms.internal.ads.by r5 = (com.google.android.gms.internal.ads.C7555by) r5
            goto L_0x007b
        L_0x0076:
            com.google.android.gms.internal.ads.zx r5 = new com.google.android.gms.internal.ads.zx
            r5.<init>(r2)
        L_0x007b:
            r1.zzP(r5)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0083:
            com.google.android.gms.internal.ads.ey r2 = r1.zzk()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r4, r2)
            goto L_0x02b9
        L_0x008f:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.ep r2 = com.google.android.gms.internal.ads.C7617dp.m31530n6(r2)
            r1.zzH(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x009f:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfo> r2 = com.google.android.gms.internal.ads.zzbfo.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C8223ud.m38292a(r3, r2)
            com.google.android.gms.internal.ads.zzbfo r2 = (com.google.android.gms.internal.ads.zzbfo) r2
            r1.zzI(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x00af:
            java.lang.String r2 = r3.readString()
            r1.zzR(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x00bb:
            android.os.Bundle r2 = r1.zzd()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38296e(r4, r2)
            goto L_0x02b9
        L_0x00c7:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x00ce
            goto L_0x00e1
        L_0x00ce:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdMetadataListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C8279vw
            if (r5 == 0) goto L_0x00dc
            r5 = r3
            com.google.android.gms.internal.ads.vw r5 = (com.google.android.gms.internal.ads.C8279vw) r5
            goto L_0x00e1
        L_0x00dc:
            com.google.android.gms.internal.ads.tw r5 = new com.google.android.gms.internal.ads.tw
            r5.<init>(r2)
        L_0x00e1:
            r1.zzE(r5)
            r4.writeNoException()
            goto L_0x02b9
        L_0x00e9:
            java.lang.String r2 = r1.zzt()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x02b9
        L_0x00f5:
            boolean r2 = com.google.android.gms.internal.ads.C8223ud.m38298g(r3)
            r1.zzL(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0101:
            com.google.android.gms.internal.ads.dw r2 = r1.zzi()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r4, r2)
            goto L_0x02b9
        L_0x010d:
            com.google.android.gms.internal.ads.yw r2 = r1.zzj()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r4, r2)
            goto L_0x02b9
        L_0x0119:
            java.lang.String r2 = r1.zzr()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x02b9
        L_0x0125:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbjd> r2 = com.google.android.gms.internal.ads.zzbjd.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C8223ud.m38292a(r3, r2)
            com.google.android.gms.internal.ads.zzbjd r2 = (com.google.android.gms.internal.ads.zzbjd) r2
            r1.zzK(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0135:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbkq> r2 = com.google.android.gms.internal.ads.zzbkq.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C8223ud.m38292a(r3, r2)
            com.google.android.gms.internal.ads.zzbkq r2 = (com.google.android.gms.internal.ads.zzbkq) r2
            r1.zzU(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0145:
            com.google.android.gms.internal.ads.hy r2 = r1.zzl()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r4, r2)
            goto L_0x02b9
        L_0x0151:
            java.lang.String r2 = r3.readString()
            r1.zzT(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x015d:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.qj0 r2 = com.google.android.gms.internal.ads.pj0.m36109n6(r2)
            r1.zzS(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x016d:
            boolean r2 = r1.zzY()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38294c(r4, r2)
            goto L_0x02b9
        L_0x0179:
            boolean r2 = com.google.android.gms.internal.ads.C8223ud.m38298g(r3)
            r1.zzN(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0185:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x018c
            goto L_0x019f
        L_0x018c:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C7590cx
            if (r5 == 0) goto L_0x019a
            r5 = r3
            com.google.android.gms.internal.ads.cx r5 = (com.google.android.gms.internal.ads.C7590cx) r5
            goto L_0x019f
        L_0x019a:
            com.google.android.gms.internal.ads.cx r5 = new com.google.android.gms.internal.ads.cx
            r5.<init>(r2)
        L_0x019f:
            r1.zzab(r5)
            r4.writeNoException()
            goto L_0x02b9
        L_0x01a7:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x01ae
            goto L_0x01c1
        L_0x01ae:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdClickListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C7518aw
            if (r5 == 0) goto L_0x01bc
            r5 = r3
            com.google.android.gms.internal.ads.aw r5 = (com.google.android.gms.internal.ads.C7518aw) r5
            goto L_0x01c1
        L_0x01bc:
            com.google.android.gms.internal.ads.yv r5 = new com.google.android.gms.internal.ads.yv
            r5.<init>(r2)
        L_0x01c1:
            r1.zzC(r5)
            r4.writeNoException()
            goto L_0x02b9
        L_0x01c9:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.l10 r2 = com.google.android.gms.internal.ads.k10.m33819n6(r2)
            r1.zzO(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x01d9:
            java.lang.String r2 = r1.zzs()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x02b9
        L_0x01e5:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.lh0 r2 = com.google.android.gms.internal.ads.kh0.m33954n6(r2)
            java.lang.String r3 = r3.readString()
            r1.zzQ(r2, r3)
            r4.writeNoException()
            goto L_0x02b9
        L_0x01f9:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.ih0 r2 = com.google.android.gms.internal.ads.hh0.m32871n6(r2)
            r1.zzM(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0209:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfi> r2 = com.google.android.gms.internal.ads.zzbfi.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C8223ud.m38292a(r3, r2)
            com.google.android.gms.internal.ads.zzbfi r2 = (com.google.android.gms.internal.ads.zzbfi) r2
            r1.zzF(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0219:
            com.google.android.gms.internal.ads.zzbfi r2 = r1.zzg()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38296e(r4, r2)
            goto L_0x02b9
        L_0x0225:
            r1.zzA()
            r4.writeNoException()
            goto L_0x02b9
        L_0x022d:
            r4.writeNoException()
            goto L_0x02b9
        L_0x0232:
            r1.zzX()
            r4.writeNoException()
            goto L_0x02b9
        L_0x023a:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0241
            goto L_0x0254
        L_0x0241:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C8385yw
            if (r5 == 0) goto L_0x024f
            r5 = r3
            com.google.android.gms.internal.ads.yw r5 = (com.google.android.gms.internal.ads.C8385yw) r5
            goto L_0x0254
        L_0x024f:
            com.google.android.gms.internal.ads.ww r5 = new com.google.android.gms.internal.ads.ww
            r5.<init>(r2)
        L_0x0254:
            r1.zzG(r5)
            r4.writeNoException()
            goto L_0x02b9
        L_0x025b:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0262
            goto L_0x0275
        L_0x0262:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C7624dw
            if (r5 == 0) goto L_0x0270
            r5 = r3
            com.google.android.gms.internal.ads.dw r5 = (com.google.android.gms.internal.ads.C7624dw) r5
            goto L_0x0275
        L_0x0270:
            com.google.android.gms.internal.ads.bw r5 = new com.google.android.gms.internal.ads.bw
            r5.<init>(r2)
        L_0x0275:
            r1.zzD(r5)
            r4.writeNoException()
            goto L_0x02b9
        L_0x027c:
            r1.zzB()
            r4.writeNoException()
            goto L_0x02b9
        L_0x0283:
            r1.zzz()
            r4.writeNoException()
            goto L_0x02b9
        L_0x028a:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfd> r2 = com.google.android.gms.internal.ads.zzbfd.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C8223ud.m38292a(r3, r2)
            com.google.android.gms.internal.ads.zzbfd r2 = (com.google.android.gms.internal.ads.zzbfd) r2
            boolean r2 = r1.zzaa(r2)
            r4.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38294c(r4, r2)
            goto L_0x02b9
        L_0x029d:
            boolean r2 = r1.zzZ()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38294c(r4, r2)
            goto L_0x02b9
        L_0x02a8:
            r1.zzx()
            r4.writeNoException()
            goto L_0x02b9
        L_0x02af:
            d5.a r2 = r1.zzn()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r4, r2)
        L_0x02b9:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8101qw.mo28554m6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
