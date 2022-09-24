package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C7957mw extends C8187td implements C7993nw {
    public C7957mw() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.google.android.gms.internal.ads.cx} */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.dw] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28554m6(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            r4 = 0
            switch(r1) {
                case 1: goto L_0x00f9;
                case 2: goto L_0x00d8;
                case 3: goto L_0x00c9;
                case 4: goto L_0x00ba;
                case 5: goto L_0x009f;
                case 6: goto L_0x0090;
                case 7: goto L_0x006e;
                case 8: goto L_0x0056;
                case 9: goto L_0x0046;
                case 10: goto L_0x0036;
                case 11: goto L_0x0004;
                case 12: goto L_0x0004;
                case 13: goto L_0x0026;
                case 14: goto L_0x0016;
                case 15: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            return r1
        L_0x0006:
            android.os.Parcelable$Creator<com.google.android.gms.ads.formats.AdManagerAdViewOptions> r1 = com.google.android.gms.ads.formats.AdManagerAdViewOptions.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C8223ud.m38292a(r2, r1)
            com.google.android.gms.ads.formats.AdManagerAdViewOptions r1 = (com.google.android.gms.ads.formats.AdManagerAdViewOptions) r1
            r0.mo32044Y5(r1)
            r3.writeNoException()
            goto L_0x0103
        L_0x0016:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.r90 r1 = com.google.android.gms.internal.ads.q90.m36391n6(r1)
            r0.mo32042U1(r1)
            r3.writeNoException()
            goto L_0x0103
        L_0x0026:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbtz> r1 = com.google.android.gms.internal.ads.zzbtz.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C8223ud.m38292a(r2, r1)
            com.google.android.gms.internal.ads.zzbtz r1 = (com.google.android.gms.internal.ads.zzbtz) r1
            r0.mo32045a1(r1)
            r3.writeNoException()
            goto L_0x0103
        L_0x0036:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.f50 r1 = com.google.android.gms.internal.ads.e50.m31709n6(r1)
            r0.mo32039P2(r1)
            r3.writeNoException()
            goto L_0x0103
        L_0x0046:
            android.os.Parcelable$Creator<com.google.android.gms.ads.formats.PublisherAdViewOptions> r1 = com.google.android.gms.ads.formats.PublisherAdViewOptions.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C8223ud.m38292a(r2, r1)
            com.google.android.gms.ads.formats.PublisherAdViewOptions r1 = (com.google.android.gms.ads.formats.PublisherAdViewOptions) r1
            r0.mo32043U5(r1)
            r3.writeNoException()
            goto L_0x0103
        L_0x0056:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.c50 r1 = com.google.android.gms.internal.ads.b50.m30601n6(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfi> r4 = com.google.android.gms.internal.ads.zzbfi.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C8223ud.m38292a(r2, r4)
            com.google.android.gms.internal.ads.zzbfi r2 = (com.google.android.gms.internal.ads.zzbfi) r2
            r0.mo32037H3(r1, r2)
            r3.writeNoException()
            goto L_0x0103
        L_0x006e:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0075
            goto L_0x0088
        L_0x0075:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C7590cx
            if (r4 == 0) goto L_0x0083
            r4 = r2
            com.google.android.gms.internal.ads.cx r4 = (com.google.android.gms.internal.ads.C7590cx) r4
            goto L_0x0088
        L_0x0083:
            com.google.android.gms.internal.ads.cx r4 = new com.google.android.gms.internal.ads.cx
            r4.<init>(r1)
        L_0x0088:
            r0.mo32041S5(r4)
            r3.writeNoException()
            goto L_0x0103
        L_0x0090:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbnw> r1 = com.google.android.gms.internal.ads.zzbnw.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C8223ud.m38292a(r2, r1)
            com.google.android.gms.internal.ads.zzbnw r1 = (com.google.android.gms.internal.ads.zzbnw) r1
            r0.mo32048y2(r1)
            r3.writeNoException()
            goto L_0x0103
        L_0x009f:
            java.lang.String r1 = r2.readString()
            android.os.IBinder r4 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.y40 r4 = com.google.android.gms.internal.ads.x40.m39358n6(r4)
            android.os.IBinder r2 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.v40 r2 = com.google.android.gms.internal.ads.u40.m38135n6(r2)
            r0.mo32047r2(r1, r4, r2)
            r3.writeNoException()
            goto L_0x0103
        L_0x00ba:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.s40 r1 = com.google.android.gms.internal.ads.r40.m36917n6(r1)
            r0.mo32040R2(r1)
            r3.writeNoException()
            goto L_0x0103
        L_0x00c9:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.p40 r1 = com.google.android.gms.internal.ads.o40.m35562n6(r1)
            r0.mo32046d6(r1)
            r3.writeNoException()
            goto L_0x0103
        L_0x00d8:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x00df
            goto L_0x00f2
        L_0x00df:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C7624dw
            if (r4 == 0) goto L_0x00ed
            r4 = r2
            com.google.android.gms.internal.ads.dw r4 = (com.google.android.gms.internal.ads.C7624dw) r4
            goto L_0x00f2
        L_0x00ed:
            com.google.android.gms.internal.ads.bw r4 = new com.google.android.gms.internal.ads.bw
            r4.<init>(r1)
        L_0x00f2:
            r0.mo32038N5(r4)
            r3.writeNoException()
            goto L_0x0103
        L_0x00f9:
            com.google.android.gms.internal.ads.kw r1 = r0.zze()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r3, r1)
        L_0x0103:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7957mw.mo28554m6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
