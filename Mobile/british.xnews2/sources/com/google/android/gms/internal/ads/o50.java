package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class o50 extends C8187td implements p50 {
    public o50() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: m6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28554m6(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            switch(r1) {
                case 2: goto L_0x0188;
                case 3: goto L_0x017d;
                case 4: goto L_0x0172;
                case 5: goto L_0x0167;
                case 6: goto L_0x015c;
                case 7: goto L_0x0151;
                case 8: goto L_0x0146;
                case 9: goto L_0x013b;
                case 10: goto L_0x0130;
                case 11: goto L_0x0125;
                case 12: goto L_0x0119;
                case 13: goto L_0x0111;
                case 14: goto L_0x0105;
                case 15: goto L_0x00f5;
                case 16: goto L_0x00e1;
                case 17: goto L_0x00d1;
                case 18: goto L_0x00c5;
                case 19: goto L_0x00b9;
                case 20: goto L_0x00ad;
                case 21: goto L_0x0089;
                case 22: goto L_0x0081;
                case 23: goto L_0x0075;
                case 24: goto L_0x0069;
                case 25: goto L_0x0059;
                case 26: goto L_0x0049;
                case 27: goto L_0x0041;
                case 28: goto L_0x0039;
                case 29: goto L_0x002d;
                case 30: goto L_0x0021;
                case 31: goto L_0x0015;
                case 32: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.by r1 = com.google.android.gms.internal.ads.C7520ay.m30548n6(r1)
            r0.mo33637k4(r1)
            r3.writeNoException()
            goto L_0x0192
        L_0x0015:
            com.google.android.gms.internal.ads.ey r1 = r0.zzg()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r3, r1)
            goto L_0x0192
        L_0x0021:
            boolean r1 = r0.mo33639q()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38294c(r3, r1)
            goto L_0x0192
        L_0x002d:
            com.google.android.gms.internal.ads.n30 r1 = r0.zzj()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r3, r1)
            goto L_0x0192
        L_0x0039:
            r0.zzA()
            r3.writeNoException()
            goto L_0x0192
        L_0x0041:
            r0.zzC()
            r3.writeNoException()
            goto L_0x0192
        L_0x0049:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.nx r1 = com.google.android.gms.internal.ads.C7958mx.m34946n6(r1)
            r0.mo33635W2(r1)
            r3.writeNoException()
            goto L_0x0192
        L_0x0059:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.rx r1 = com.google.android.gms.internal.ads.C8102qx.m36773n6(r1)
            r0.mo33640q5(r1)
            r3.writeNoException()
            goto L_0x0192
        L_0x0069:
            boolean r1 = r0.mo33642t()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38294c(r3, r1)
            goto L_0x0192
        L_0x0075:
            java.util.List r1 = r0.zzv()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x0192
        L_0x0081:
            r0.mo33641r()
            r3.writeNoException()
            goto L_0x0192
        L_0x0089:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0091
            r1 = 0
            goto L_0x00a5
        L_0x0091:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.m50
            if (r4 == 0) goto L_0x009f
            r1 = r2
            com.google.android.gms.internal.ads.m50 r1 = (com.google.android.gms.internal.ads.m50) r1
            goto L_0x00a5
        L_0x009f:
            com.google.android.gms.internal.ads.k50 r2 = new com.google.android.gms.internal.ads.k50
            r2.<init>(r1)
            r1 = r2
        L_0x00a5:
            r0.mo33636b4(r1)
            r3.writeNoException()
            goto L_0x0192
        L_0x00ad:
            android.os.Bundle r1 = r0.zzf()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38296e(r3, r1)
            goto L_0x0192
        L_0x00b9:
            d5.a r1 = r0.zzl()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r3, r1)
            goto L_0x0192
        L_0x00c5:
            d5.a r1 = r0.zzm()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r3, r1)
            goto L_0x0192
        L_0x00d1:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C8223ud.m38292a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.mo33633S2(r1)
            r3.writeNoException()
            goto L_0x0192
        L_0x00e1:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C8223ud.m38292a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            boolean r1 = r0.mo33632K4(r1)
            r3.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38294c(r3, r1)
            goto L_0x0192
        L_0x00f5:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C8223ud.m38292a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.mo33634V5(r1)
            r3.writeNoException()
            goto L_0x0192
        L_0x0105:
            com.google.android.gms.internal.ads.i30 r1 = r0.zzi()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r3, r1)
            goto L_0x0192
        L_0x0111:
            r0.zzx()
            r3.writeNoException()
            goto L_0x0192
        L_0x0119:
            java.lang.String r1 = r0.zzr()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0192
        L_0x0125:
            com.google.android.gms.internal.ads.hy r1 = r0.zzh()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r3, r1)
            goto L_0x0192
        L_0x0130:
            java.lang.String r1 = r0.zzs()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0192
        L_0x013b:
            java.lang.String r1 = r0.zzt()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0192
        L_0x0146:
            double r1 = r0.zze()
            r3.writeNoException()
            r3.writeDouble(r1)
            goto L_0x0192
        L_0x0151:
            java.lang.String r1 = r0.zzn()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0192
        L_0x015c:
            java.lang.String r1 = r0.zzp()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0192
        L_0x0167:
            com.google.android.gms.internal.ads.q30 r1 = r0.zzk()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r3, r1)
            goto L_0x0192
        L_0x0172:
            java.lang.String r1 = r0.zzo()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0192
        L_0x017d:
            java.util.List r1 = r0.mo33638n()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x0192
        L_0x0188:
            java.lang.String r1 = r0.zzq()
            r3.writeNoException()
            r3.writeString(r1)
        L_0x0192:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o50.mo28554m6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
