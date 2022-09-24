package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class f41 extends o61 {

    /* renamed from: i */
    private final xt0 f31616i;

    /* renamed from: j */
    private final int f31617j;

    /* renamed from: k */
    private final Context f31618k;

    /* renamed from: l */
    private final m31 f31619l;

    /* renamed from: m */
    private final gk1 f31620m;

    /* renamed from: n */
    private final ab1 f31621n;

    /* renamed from: o */
    private boolean f31622o = false;

    f41(n61 n61, Context context, xt0 xt0, int i, m31 m31, gk1 gk1, ab1 ab1) {
        super(n61);
        this.f31616i = xt0;
        this.f31618k = context;
        this.f31617j = i;
        this.f31619l = m31;
        this.f31620m = gk1;
        this.f31621n = ab1;
    }

    /* renamed from: a */
    public final void mo31310a() {
        super.mo31310a();
        xt0 xt0 = this.f31616i;
        if (xt0 != null) {
            xt0.destroy();
        }
    }

    /* renamed from: h */
    public final int mo31741h() {
        return this.f31617j;
    }

    /* renamed from: i */
    public final void mo31742i(C8271vo voVar) {
        xt0 xt0 = this.f31616i;
        if (xt0 != null) {
            xt0.mo18798y(voVar);
        }
    }

    /* JADX WARNING: type inference failed for: r4v10, types: [android.content.Context] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31743j(android.app.Activity r4, com.google.android.gms.internal.ads.C7875kp r5, boolean r6) throws android.os.RemoteException {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0004
            android.content.Context r4 = r3.f31618k
        L_0x0004:
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f37218u0
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r0 = r1.mo18570b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0058
            com.google.android.gms.ads.internal.zzt.zzp()
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzK(r4)
            if (r0 == 0) goto L_0x0058
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.co0.zzj(r5)
            com.google.android.gms.internal.ads.ab1 r5 = r3.f31621n
            r5.zzb()
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.p00.f37226v0
            com.google.android.gms.internal.ads.n00 r6 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r5 = r6.mo18570b(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x00ae
            com.google.android.gms.internal.ads.v03 r5 = new com.google.android.gms.internal.ads.v03
            android.content.Context r4 = r4.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzbz r6 = com.google.android.gms.ads.internal.zzt.zzt()
            android.os.Looper r6 = r6.zzb()
            r5.<init>(r4, r6)
            com.google.android.gms.internal.ads.ur2 r4 = r3.f36293a
            com.google.android.gms.internal.ads.tr2 r4 = r4.f39937b
            com.google.android.gms.internal.ads.lr2 r4 = r4.f39519b
            java.lang.String r4 = r4.f35215b
            r5.mo35344a(r4)
            return
        L_0x0058:
            boolean r0 = r3.f31622o
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = "App open interstitial ad is already visible."
            com.google.android.gms.internal.ads.co0.zzj(r0)
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f37119i7
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r0 = r1.mo18570b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.ab1 r0 = r3.f31621n
            r1 = 10
            r2 = 0
            com.google.android.gms.internal.ads.zzbew r1 = com.google.android.gms.internal.ads.us2.m38446d(r1, r2, r2)
            r0.mo30337d(r1)
        L_0x007f:
            boolean r0 = r3.f31622o
            if (r0 != 0) goto L_0x00ae
            com.google.android.gms.internal.ads.gk1 r0 = r3.f31620m     // Catch:{ fk1 -> 0x008e }
            com.google.android.gms.internal.ads.ab1 r1 = r3.f31621n     // Catch:{ fk1 -> 0x008e }
            r0.mo32020a(r6, r4, r1)     // Catch:{ fk1 -> 0x008e }
            r4 = 1
            r3.f31622o = r4
            return
        L_0x008e:
            r4 = move-exception
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.p00.f37119i7
            com.google.android.gms.internal.ads.n00 r0 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r6 = r0.mo18570b(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00a7
            com.google.android.gms.internal.ads.ab1 r5 = r3.f31621n
            r5.mo30338j0(r4)
            return
        L_0x00a7:
            com.google.android.gms.internal.ads.zzbew r4 = com.google.android.gms.internal.ads.us2.m38443a(r4)
            r5.mo32205J(r4)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f41.mo31743j(android.app.Activity, com.google.android.gms.internal.ads.kp, boolean):void");
    }

    /* renamed from: k */
    public final void mo31744k(long j, int i) {
        this.f31619l.mo33465a(j, i);
    }
}
