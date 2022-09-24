package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class vc0 extends C8187td implements wc0 {
    public vc0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r12v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r12v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r14v8, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v6, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r12v11, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: m6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28554m6(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) throws android.os.RemoteException {
        /*
            r10 = this;
            r14 = 0
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            r1 = 0
            switch(r11) {
                case 1: goto L_0x0341;
                case 2: goto L_0x0336;
                case 3: goto L_0x0303;
                case 4: goto L_0x02fb;
                case 5: goto L_0x02f3;
                case 6: goto L_0x02ae;
                case 7: goto L_0x0272;
                case 8: goto L_0x026a;
                case 9: goto L_0x0262;
                case 10: goto L_0x0238;
                case 11: goto L_0x0224;
                case 12: goto L_0x021c;
                case 13: goto L_0x0210;
                case 14: goto L_0x01c7;
                case 15: goto L_0x01bf;
                case 16: goto L_0x01b7;
                case 17: goto L_0x01ab;
                case 18: goto L_0x019f;
                case 19: goto L_0x0193;
                case 20: goto L_0x017b;
                case 21: goto L_0x016b;
                case 22: goto L_0x0163;
                case 23: goto L_0x0147;
                case 24: goto L_0x013b;
                case 25: goto L_0x012f;
                case 26: goto L_0x0123;
                case 27: goto L_0x0117;
                case 28: goto L_0x00e3;
                case 29: goto L_0x0007;
                case 30: goto L_0x00d3;
                case 31: goto L_0x00b5;
                case 32: goto L_0x0081;
                case 33: goto L_0x0075;
                case 34: goto L_0x0069;
                case 35: goto L_0x0024;
                case 36: goto L_0x0018;
                case 37: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return r14
        L_0x0008:
            android.os.IBinder r11 = r12.readStrongBinder()
            d5.a r11 = p199d5.C10487a.C10488a.m48193b2(r11)
            r10.mo34915h3(r11)
            r13.writeNoException()
            goto L_0x0380
        L_0x0018:
            com.google.android.gms.internal.ads.cd0 r11 = r10.zzj()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r13, r11)
            goto L_0x0380
        L_0x0024:
            android.os.IBinder r11 = r12.readStrongBinder()
            d5.a r3 = p199d5.C10487a.C10488a.m48193b2(r11)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfi> r11 = com.google.android.gms.internal.ads.zzbfi.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C8223ud.m38292a(r12, r11)
            r4 = r11
            com.google.android.gms.internal.ads.zzbfi r4 = (com.google.android.gms.internal.ads.zzbfi) r4
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfd> r11 = com.google.android.gms.internal.ads.zzbfd.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C8223ud.m38292a(r12, r11)
            r5 = r11
            com.google.android.gms.internal.ads.zzbfd r5 = (com.google.android.gms.internal.ads.zzbfd) r5
            java.lang.String r6 = r12.readString()
            java.lang.String r7 = r12.readString()
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 != 0) goto L_0x004e
        L_0x004c:
            r8 = r1
            goto L_0x0060
        L_0x004e:
            android.os.IInterface r12 = r11.queryLocalInterface(r0)
            boolean r14 = r12 instanceof com.google.android.gms.internal.ads.zc0
            if (r14 == 0) goto L_0x005a
            r1 = r12
            com.google.android.gms.internal.ads.zc0 r1 = (com.google.android.gms.internal.ads.zc0) r1
            goto L_0x004c
        L_0x005a:
            com.google.android.gms.internal.ads.xc0 r1 = new com.google.android.gms.internal.ads.xc0
            r1.<init>(r11)
            goto L_0x004c
        L_0x0060:
            r2 = r10
            r2.mo34911X1(r3, r4, r5, r6, r7, r8)
            r13.writeNoException()
            goto L_0x0380
        L_0x0069:
            com.google.android.gms.internal.ads.zzcab r11 = r10.zzm()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38296e(r13, r11)
            goto L_0x0380
        L_0x0075:
            com.google.android.gms.internal.ads.zzcab r11 = r10.zzl()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38296e(r13, r11)
            goto L_0x0380
        L_0x0081:
            android.os.IBinder r11 = r12.readStrongBinder()
            d5.a r11 = p199d5.C10487a.C10488a.m48193b2(r11)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfd> r14 = com.google.android.gms.internal.ads.zzbfd.CREATOR
            android.os.Parcelable r14 = com.google.android.gms.internal.ads.C8223ud.m38292a(r12, r14)
            com.google.android.gms.internal.ads.zzbfd r14 = (com.google.android.gms.internal.ads.zzbfd) r14
            java.lang.String r2 = r12.readString()
            android.os.IBinder r12 = r12.readStrongBinder()
            if (r12 != 0) goto L_0x009c
            goto L_0x00ad
        L_0x009c:
            android.os.IInterface r0 = r12.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zc0
            if (r1 == 0) goto L_0x00a8
            r1 = r0
            com.google.android.gms.internal.ads.zc0 r1 = (com.google.android.gms.internal.ads.zc0) r1
            goto L_0x00ad
        L_0x00a8:
            com.google.android.gms.internal.ads.xc0 r1 = new com.google.android.gms.internal.ads.xc0
            r1.<init>(r12)
        L_0x00ad:
            r10.mo34909R5(r11, r14, r2, r1)
            r13.writeNoException()
            goto L_0x0380
        L_0x00b5:
            android.os.IBinder r11 = r12.readStrongBinder()
            d5.a r11 = p199d5.C10487a.C10488a.m48193b2(r11)
            android.os.IBinder r14 = r12.readStrongBinder()
            com.google.android.gms.internal.ads.b90 r14 = com.google.android.gms.internal.ads.a90.m30260n6(r14)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbtx> r0 = com.google.android.gms.internal.ads.zzbtx.CREATOR
            java.util.ArrayList r12 = r12.createTypedArrayList(r0)
            r10.mo34906H4(r11, r14, r12)
            r13.writeNoException()
            goto L_0x0380
        L_0x00d3:
            android.os.IBinder r11 = r12.readStrongBinder()
            d5.a r11 = p199d5.C10487a.C10488a.m48193b2(r11)
            r10.mo34918m2(r11)
            r13.writeNoException()
            goto L_0x0380
        L_0x00e3:
            android.os.IBinder r11 = r12.readStrongBinder()
            d5.a r11 = p199d5.C10487a.C10488a.m48193b2(r11)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfd> r14 = com.google.android.gms.internal.ads.zzbfd.CREATOR
            android.os.Parcelable r14 = com.google.android.gms.internal.ads.C8223ud.m38292a(r12, r14)
            com.google.android.gms.internal.ads.zzbfd r14 = (com.google.android.gms.internal.ads.zzbfd) r14
            java.lang.String r2 = r12.readString()
            android.os.IBinder r12 = r12.readStrongBinder()
            if (r12 != 0) goto L_0x00fe
            goto L_0x010f
        L_0x00fe:
            android.os.IInterface r0 = r12.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zc0
            if (r1 == 0) goto L_0x010a
            r1 = r0
            com.google.android.gms.internal.ads.zc0 r1 = (com.google.android.gms.internal.ads.zc0) r1
            goto L_0x010f
        L_0x010a:
            com.google.android.gms.internal.ads.xc0 r1 = new com.google.android.gms.internal.ads.xc0
            r1.<init>(r12)
        L_0x010f:
            r10.mo34920p3(r11, r14, r2, r1)
            r13.writeNoException()
            goto L_0x0380
        L_0x0117:
            com.google.android.gms.internal.ads.id0 r11 = r10.zzk()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r13, r11)
            goto L_0x0380
        L_0x0123:
            com.google.android.gms.internal.ads.hy r11 = r10.zzh()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r13, r11)
            goto L_0x0380
        L_0x012f:
            boolean r11 = com.google.android.gms.internal.ads.C8223ud.m38298g(r12)
            r10.mo34910S3(r11)
            r13.writeNoException()
            goto L_0x0380
        L_0x013b:
            com.google.android.gms.internal.ads.l40 r11 = r10.zzi()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r13, r11)
            goto L_0x0380
        L_0x0147:
            android.os.IBinder r11 = r12.readStrongBinder()
            d5.a r11 = p199d5.C10487a.C10488a.m48193b2(r11)
            android.os.IBinder r14 = r12.readStrongBinder()
            com.google.android.gms.internal.ads.uj0 r14 = com.google.android.gms.internal.ads.tj0.m37867n6(r14)
            java.util.ArrayList r12 = r12.createStringArrayList()
            r10.mo34924t4(r11, r14, r12)
            r13.writeNoException()
            goto L_0x0380
        L_0x0163:
            r13.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38294c(r13, r14)
            goto L_0x0380
        L_0x016b:
            android.os.IBinder r11 = r12.readStrongBinder()
            d5.a r11 = p199d5.C10487a.C10488a.m48193b2(r11)
            r10.mo34905C0(r11)
            r13.writeNoException()
            goto L_0x0380
        L_0x017b:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfd> r11 = com.google.android.gms.internal.ads.zzbfd.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C8223ud.m38292a(r12, r11)
            com.google.android.gms.internal.ads.zzbfd r11 = (com.google.android.gms.internal.ads.zzbfd) r11
            java.lang.String r14 = r12.readString()
            java.lang.String r12 = r12.readString()
            r10.mo34907J4(r11, r14, r12)
            r13.writeNoException()
            goto L_0x0380
        L_0x0193:
            android.os.Bundle r11 = r10.zzg()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38296e(r13, r11)
            goto L_0x0380
        L_0x019f:
            android.os.Bundle r11 = r10.zzf()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38296e(r13, r11)
            goto L_0x0380
        L_0x01ab:
            android.os.Bundle r11 = r10.zze()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38296e(r13, r11)
            goto L_0x0380
        L_0x01b7:
            r13.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r13, r1)
            goto L_0x0380
        L_0x01bf:
            r13.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r13, r1)
            goto L_0x0380
        L_0x01c7:
            android.os.IBinder r11 = r12.readStrongBinder()
            d5.a r3 = p199d5.C10487a.C10488a.m48193b2(r11)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfd> r11 = com.google.android.gms.internal.ads.zzbfd.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C8223ud.m38292a(r12, r11)
            r4 = r11
            com.google.android.gms.internal.ads.zzbfd r4 = (com.google.android.gms.internal.ads.zzbfd) r4
            java.lang.String r5 = r12.readString()
            java.lang.String r6 = r12.readString()
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 != 0) goto L_0x01e8
        L_0x01e6:
            r7 = r1
            goto L_0x01fa
        L_0x01e8:
            android.os.IInterface r14 = r11.queryLocalInterface(r0)
            boolean r0 = r14 instanceof com.google.android.gms.internal.ads.zc0
            if (r0 == 0) goto L_0x01f4
            r1 = r14
            com.google.android.gms.internal.ads.zc0 r1 = (com.google.android.gms.internal.ads.zc0) r1
            goto L_0x01e6
        L_0x01f4:
            com.google.android.gms.internal.ads.xc0 r1 = new com.google.android.gms.internal.ads.xc0
            r1.<init>(r11)
            goto L_0x01e6
        L_0x01fa:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbnw> r11 = com.google.android.gms.internal.ads.zzbnw.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C8223ud.m38292a(r12, r11)
            r8 = r11
            com.google.android.gms.internal.ads.zzbnw r8 = (com.google.android.gms.internal.ads.zzbnw) r8
            java.util.ArrayList r9 = r12.createStringArrayList()
            r2 = r10
            r2.mo34919o4(r3, r4, r5, r6, r7, r8, r9)
            r13.writeNoException()
            goto L_0x0380
        L_0x0210:
            boolean r11 = r10.zzL()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38294c(r13, r11)
            goto L_0x0380
        L_0x021c:
            r10.zzJ()
            r13.writeNoException()
            goto L_0x0380
        L_0x0224:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfd> r11 = com.google.android.gms.internal.ads.zzbfd.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C8223ud.m38292a(r12, r11)
            com.google.android.gms.internal.ads.zzbfd r11 = (com.google.android.gms.internal.ads.zzbfd) r11
            java.lang.String r12 = r12.readString()
            r10.mo34916l4(r11, r12)
            r13.writeNoException()
            goto L_0x0380
        L_0x0238:
            android.os.IBinder r11 = r12.readStrongBinder()
            d5.a r1 = p199d5.C10487a.C10488a.m48193b2(r11)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfd> r11 = com.google.android.gms.internal.ads.zzbfd.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C8223ud.m38292a(r12, r11)
            r2 = r11
            com.google.android.gms.internal.ads.zzbfd r2 = (com.google.android.gms.internal.ads.zzbfd) r2
            java.lang.String r3 = r12.readString()
            android.os.IBinder r11 = r12.readStrongBinder()
            com.google.android.gms.internal.ads.uj0 r4 = com.google.android.gms.internal.ads.tj0.m37867n6(r11)
            java.lang.String r5 = r12.readString()
            r0 = r10
            r0.mo34917l6(r1, r2, r3, r4, r5)
            r13.writeNoException()
            goto L_0x0380
        L_0x0262:
            r10.zzE()
            r13.writeNoException()
            goto L_0x0380
        L_0x026a:
            r10.mo34913f()
            r13.writeNoException()
            goto L_0x0380
        L_0x0272:
            android.os.IBinder r11 = r12.readStrongBinder()
            d5.a r3 = p199d5.C10487a.C10488a.m48193b2(r11)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfd> r11 = com.google.android.gms.internal.ads.zzbfd.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C8223ud.m38292a(r12, r11)
            r4 = r11
            com.google.android.gms.internal.ads.zzbfd r4 = (com.google.android.gms.internal.ads.zzbfd) r4
            java.lang.String r5 = r12.readString()
            java.lang.String r6 = r12.readString()
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 != 0) goto L_0x0293
        L_0x0291:
            r7 = r1
            goto L_0x02a5
        L_0x0293:
            android.os.IInterface r12 = r11.queryLocalInterface(r0)
            boolean r14 = r12 instanceof com.google.android.gms.internal.ads.zc0
            if (r14 == 0) goto L_0x029f
            r1 = r12
            com.google.android.gms.internal.ads.zc0 r1 = (com.google.android.gms.internal.ads.zc0) r1
            goto L_0x0291
        L_0x029f:
            com.google.android.gms.internal.ads.xc0 r1 = new com.google.android.gms.internal.ads.xc0
            r1.<init>(r11)
            goto L_0x0291
        L_0x02a5:
            r2 = r10
            r2.mo34912e6(r3, r4, r5, r6, r7)
            r13.writeNoException()
            goto L_0x0380
        L_0x02ae:
            android.os.IBinder r11 = r12.readStrongBinder()
            d5.a r3 = p199d5.C10487a.C10488a.m48193b2(r11)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfi> r11 = com.google.android.gms.internal.ads.zzbfi.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C8223ud.m38292a(r12, r11)
            r4 = r11
            com.google.android.gms.internal.ads.zzbfi r4 = (com.google.android.gms.internal.ads.zzbfi) r4
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfd> r11 = com.google.android.gms.internal.ads.zzbfd.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C8223ud.m38292a(r12, r11)
            r5 = r11
            com.google.android.gms.internal.ads.zzbfd r5 = (com.google.android.gms.internal.ads.zzbfd) r5
            java.lang.String r6 = r12.readString()
            java.lang.String r7 = r12.readString()
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 != 0) goto L_0x02d8
        L_0x02d6:
            r8 = r1
            goto L_0x02ea
        L_0x02d8:
            android.os.IInterface r12 = r11.queryLocalInterface(r0)
            boolean r14 = r12 instanceof com.google.android.gms.internal.ads.zc0
            if (r14 == 0) goto L_0x02e4
            r1 = r12
            com.google.android.gms.internal.ads.zc0 r1 = (com.google.android.gms.internal.ads.zc0) r1
            goto L_0x02d6
        L_0x02e4:
            com.google.android.gms.internal.ads.xc0 r1 = new com.google.android.gms.internal.ads.xc0
            r1.<init>(r11)
            goto L_0x02d6
        L_0x02ea:
            r2 = r10
            r2.mo34908R0(r3, r4, r5, r6, r7, r8)
            r13.writeNoException()
            goto L_0x0380
        L_0x02f3:
            r10.zzo()
            r13.writeNoException()
            goto L_0x0380
        L_0x02fb:
            r10.mo34922q()
            r13.writeNoException()
            goto L_0x0380
        L_0x0303:
            android.os.IBinder r11 = r12.readStrongBinder()
            d5.a r11 = p199d5.C10487a.C10488a.m48193b2(r11)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfd> r14 = com.google.android.gms.internal.ads.zzbfd.CREATOR
            android.os.Parcelable r14 = com.google.android.gms.internal.ads.C8223ud.m38292a(r12, r14)
            com.google.android.gms.internal.ads.zzbfd r14 = (com.google.android.gms.internal.ads.zzbfd) r14
            java.lang.String r2 = r12.readString()
            android.os.IBinder r12 = r12.readStrongBinder()
            if (r12 != 0) goto L_0x031e
            goto L_0x032f
        L_0x031e:
            android.os.IInterface r0 = r12.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zc0
            if (r1 == 0) goto L_0x032a
            r1 = r0
            com.google.android.gms.internal.ads.zc0 r1 = (com.google.android.gms.internal.ads.zc0) r1
            goto L_0x032f
        L_0x032a:
            com.google.android.gms.internal.ads.xc0 r1 = new com.google.android.gms.internal.ads.xc0
            r1.<init>(r12)
        L_0x032f:
            r10.mo34921p4(r11, r14, r2, r1)
            r13.writeNoException()
            goto L_0x0380
        L_0x0336:
            d5.a r11 = r10.zzn()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C8223ud.m38297f(r13, r11)
            goto L_0x0380
        L_0x0341:
            android.os.IBinder r11 = r12.readStrongBinder()
            d5.a r3 = p199d5.C10487a.C10488a.m48193b2(r11)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfi> r11 = com.google.android.gms.internal.ads.zzbfi.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C8223ud.m38292a(r12, r11)
            r4 = r11
            com.google.android.gms.internal.ads.zzbfi r4 = (com.google.android.gms.internal.ads.zzbfi) r4
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfd> r11 = com.google.android.gms.internal.ads.zzbfd.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C8223ud.m38292a(r12, r11)
            r5 = r11
            com.google.android.gms.internal.ads.zzbfd r5 = (com.google.android.gms.internal.ads.zzbfd) r5
            java.lang.String r6 = r12.readString()
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 != 0) goto L_0x0367
        L_0x0365:
            r7 = r1
            goto L_0x0379
        L_0x0367:
            android.os.IInterface r12 = r11.queryLocalInterface(r0)
            boolean r14 = r12 instanceof com.google.android.gms.internal.ads.zc0
            if (r14 == 0) goto L_0x0373
            r1 = r12
            com.google.android.gms.internal.ads.zc0 r1 = (com.google.android.gms.internal.ads.zc0) r1
            goto L_0x0365
        L_0x0373:
            com.google.android.gms.internal.ads.xc0 r1 = new com.google.android.gms.internal.ads.xc0
            r1.<init>(r11)
            goto L_0x0365
        L_0x0379:
            r2 = r10
            r2.mo34923r5(r3, r4, r5, r6, r7)
            r13.writeNoException()
        L_0x0380:
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vc0.mo28554m6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
