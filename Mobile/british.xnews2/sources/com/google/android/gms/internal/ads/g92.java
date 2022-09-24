package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class g92 implements gk1 {

    /* renamed from: a */
    private final Context f32192a;

    /* renamed from: b */
    private final vs1 f32193b;

    /* renamed from: c */
    private final bs2 f32194c;

    /* renamed from: d */
    private final zzcjf f32195d;

    /* renamed from: e */
    private final ir2 f32196e;

    /* renamed from: f */
    private final mb3<zr1> f32197f;

    /* renamed from: g */
    private final xt0 f32198g;

    /* renamed from: h */
    private final h70 f32199h;

    /* renamed from: i */
    private final boolean f32200i;

    g92(Context context, vs1 vs1, bs2 bs2, zzcjf zzcjf, ir2 ir2, mb3<zr1> mb3, xt0 xt0, h70 h70, boolean z) {
        this.f32192a = context;
        this.f32193b = vs1;
        this.f32194c = bs2;
        this.f32195d = zzcjf;
        this.f32196e = ir2;
        this.f32197f = mb3;
        this.f32198g = xt0;
        this.f32199h = h70;
        this.f32200i = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32020a(boolean r22, android.content.Context r23, com.google.android.gms.internal.ads.ab1 r24) {
        /*
            r21 = this;
            r1 = r21
            com.google.android.gms.internal.ads.mb3<com.google.android.gms.internal.ads.zr1> r0 = r1.f32197f
            java.lang.Object r0 = com.google.android.gms.internal.ads.bb3.m30657q(r0)
            com.google.android.gms.internal.ads.zr1 r0 = (com.google.android.gms.internal.ads.zr1) r0
            com.google.android.gms.internal.ads.ir2 r2 = r1.f32196e     // Catch:{ ju0 -> 0x00fe }
            com.google.android.gms.internal.ads.xt0 r3 = r1.f32198g     // Catch:{ ju0 -> 0x00fe }
            boolean r3 = r3.mo18737X()     // Catch:{ ju0 -> 0x00fe }
            r4 = 1
            if (r3 != 0) goto L_0x0019
            com.google.android.gms.internal.ads.xt0 r2 = r1.f32198g     // Catch:{ ju0 -> 0x00fe }
        L_0x0017:
            r11 = r2
            goto L_0x007e
        L_0x0019:
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.p00.f36840B0     // Catch:{ ju0 -> 0x00fe }
            com.google.android.gms.internal.ads.n00 r5 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ ju0 -> 0x00fe }
            java.lang.Object r3 = r5.mo18570b(r3)     // Catch:{ ju0 -> 0x00fe }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ ju0 -> 0x00fe }
            boolean r3 = r3.booleanValue()     // Catch:{ ju0 -> 0x00fe }
            if (r3 != 0) goto L_0x002e
            com.google.android.gms.internal.ads.xt0 r2 = r1.f32198g     // Catch:{ ju0 -> 0x00fe }
            goto L_0x0017
        L_0x002e:
            com.google.android.gms.internal.ads.vs1 r3 = r1.f32193b     // Catch:{ ju0 -> 0x00fe }
            com.google.android.gms.internal.ads.bs2 r5 = r1.f32194c     // Catch:{ ju0 -> 0x00fe }
            com.google.android.gms.internal.ads.zzbfi r5 = r5.f30088e     // Catch:{ ju0 -> 0x00fe }
            r6 = 0
            com.google.android.gms.internal.ads.xt0 r3 = r3.mo35491a(r5, r6, r6)     // Catch:{ ju0 -> 0x00fe }
            com.google.android.gms.internal.ads.pi1 r5 = r0.mo32499i()     // Catch:{ ju0 -> 0x00fe }
            com.google.android.gms.internal.ads.v70.m38737b(r3, r5)     // Catch:{ ju0 -> 0x00fe }
            com.google.android.gms.internal.ads.zs1 r5 = new com.google.android.gms.internal.ads.zs1     // Catch:{ ju0 -> 0x00fe }
            r5.<init>()     // Catch:{ ju0 -> 0x00fe }
            android.content.Context r7 = r1.f32192a     // Catch:{ ju0 -> 0x00fe }
            r8 = r3
            android.view.View r8 = (android.view.View) r8     // Catch:{ ju0 -> 0x00fe }
            r5.mo36129a(r7, r8)     // Catch:{ ju0 -> 0x00fe }
            com.google.android.gms.internal.ads.us1 r7 = r0.mo32502l()     // Catch:{ ju0 -> 0x00fe }
            boolean r8 = r1.f32200i     // Catch:{ ju0 -> 0x00fe }
            if (r8 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.h70 r8 = r1.f32199h     // Catch:{ ju0 -> 0x00fe }
            goto L_0x0059
        L_0x0058:
            r8 = r6
        L_0x0059:
            r7.mo35267i(r3, r4, r8)     // Catch:{ ju0 -> 0x00fe }
            com.google.android.gms.internal.ads.mv0 r7 = r3.mo18793u0()     // Catch:{ ju0 -> 0x00fe }
            com.google.android.gms.internal.ads.e92 r8 = new com.google.android.gms.internal.ads.e92     // Catch:{ ju0 -> 0x00fe }
            r8.<init>(r5, r3)     // Catch:{ ju0 -> 0x00fe }
            r7.mo18251F0(r8)     // Catch:{ ju0 -> 0x00fe }
            com.google.android.gms.internal.ads.mv0 r5 = r3.mo18793u0()     // Catch:{ ju0 -> 0x00fe }
            com.google.android.gms.internal.ads.f92 r7 = new com.google.android.gms.internal.ads.f92     // Catch:{ ju0 -> 0x00fe }
            r7.<init>(r3)     // Catch:{ ju0 -> 0x00fe }
            r5.mo18248D0(r7)     // Catch:{ ju0 -> 0x00fe }
            com.google.android.gms.internal.ads.nr2 r2 = r2.f33494t     // Catch:{ ju0 -> 0x00fe }
            java.lang.String r5 = r2.f36096b     // Catch:{ ju0 -> 0x00fe }
            java.lang.String r2 = r2.f36095a     // Catch:{ ju0 -> 0x00fe }
            r3.mo18744d0(r5, r2, r6)     // Catch:{ ju0 -> 0x00fe }
            r11 = r3
        L_0x007e:
            r11.mo18755i0(r4)
            com.google.android.gms.ads.internal.zzj r2 = new com.google.android.gms.ads.internal.zzj
            boolean r3 = r1.f32200i
            r5 = 0
            if (r3 == 0) goto L_0x0090
            com.google.android.gms.internal.ads.h70 r3 = r1.f32199h
            boolean r3 = r3.mo32359e(r5)
            r13 = r3
            goto L_0x0091
        L_0x0090:
            r13 = 0
        L_0x0091:
            com.google.android.gms.ads.internal.zzt.zzp()
            android.content.Context r3 = r1.f32192a
            boolean r14 = com.google.android.gms.ads.internal.util.zzt.zzM(r3)
            boolean r3 = r1.f32200i
            if (r3 == 0) goto L_0x00a6
            com.google.android.gms.internal.ads.h70 r3 = r1.f32199h
            boolean r3 = r3.mo32358d()
            r15 = r3
            goto L_0x00a7
        L_0x00a6:
            r15 = 0
        L_0x00a7:
            boolean r3 = r1.f32200i
            if (r3 == 0) goto L_0x00b4
            com.google.android.gms.internal.ads.h70 r3 = r1.f32199h
            float r3 = r3.mo32355a()
            r16 = r3
            goto L_0x00b7
        L_0x00b4:
            r3 = 0
            r16 = 0
        L_0x00b7:
            com.google.android.gms.internal.ads.ir2 r3 = r1.f32196e
            r17 = -1
            boolean r5 = r3.f33449L
            boolean r3 = r3.f33450M
            r12 = r2
            r18 = r22
            r19 = r5
            r20 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            if (r24 == 0) goto L_0x00ce
            r24.mo30336E0()
        L_0x00ce:
            com.google.android.gms.ads.internal.zzt.zzj()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.uj1 r9 = r0.mo32500j()
            com.google.android.gms.internal.ads.ir2 r0 = r1.f32196e
            int r12 = r0.f33451N
            com.google.android.gms.internal.ads.zzcjf r13 = r1.f32195d
            java.lang.String r14 = r0.f33440C
            com.google.android.gms.internal.ads.nr2 r0 = r0.f33494t
            r8 = 0
            r10 = 0
            java.lang.String r5 = r0.f36096b
            java.lang.String r0 = r0.f36095a
            com.google.android.gms.internal.ads.bs2 r6 = r1.f32194c
            java.lang.String r6 = r6.f30089f
            r7 = r3
            r15 = r2
            r16 = r5
            r17 = r0
            r18 = r6
            r19 = r24
            r7.<init>((com.google.android.gms.internal.ads.C7659eu) r8, (com.google.android.gms.ads.internal.overlay.zzo) r9, (com.google.android.gms.ads.internal.overlay.zzw) r10, (com.google.android.gms.internal.ads.xt0) r11, (int) r12, (com.google.android.gms.internal.ads.zzcjf) r13, (java.lang.String) r14, (com.google.android.gms.ads.internal.zzj) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (com.google.android.gms.internal.ads.ab1) r19)
            r0 = r23
            com.google.android.gms.ads.internal.overlay.zzm.zza(r0, r3, r4)
            return
        L_0x00fe:
            r0 = move-exception
            java.lang.String r2 = ""
            com.google.android.gms.internal.ads.co0.zzh(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g92.mo32020a(boolean, android.content.Context, com.google.android.gms.internal.ads.ab1):void");
    }
}
