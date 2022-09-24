package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n82<AdT> implements ha3<ur2, AdT> {

    /* renamed from: a */
    private final dw2 f35940a;

    /* renamed from: b */
    private final oa1 f35941b;

    /* renamed from: c */
    private final px2 f35942c;

    /* renamed from: d */
    private final sx2 f35943d;

    /* renamed from: e */
    private final Executor f35944e;

    /* renamed from: f */
    private final ScheduledExecutorService f35945f;

    /* renamed from: g */
    private final r61<AdT> f35946g;

    /* renamed from: h */
    private final i82 f35947h;

    /* renamed from: i */
    private final w42 f35948i;

    public n82(dw2 dw2, i82 i82, oa1 oa1, px2 px2, sx2 sx2, r61<AdT> r61, Executor executor, ScheduledExecutorService scheduledExecutorService, w42 w42) {
        this.f35940a = dw2;
        this.f35947h = i82;
        this.f35941b = oa1;
        this.f35942c = px2;
        this.f35943d = sx2;
        this.f35946g = r61;
        this.f35944e = executor;
        this.f35945f = scheduledExecutorService;
        this.f35948i = w42;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ mb3 mo33669a(ur2 ur2, ir2 ir2, r42 r42, Throwable th) throws Exception {
        i82 i82 = this.f35947h;
        mb3 o = bb3.m30655o(r42.mo31510b(ur2, ir2), (long) ir2.f33452O, TimeUnit.MILLISECONDS, this.f35945f);
        i82.mo32569e(ur2, ir2, o, this.f35942c);
        return o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.mb3 zza(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.ur2 r9 = (com.google.android.gms.internal.ads.ur2) r9
            com.google.android.gms.internal.ads.tr2 r0 = r9.f39937b
            com.google.android.gms.internal.ads.lr2 r0 = r0.f39519b
            int r0 = r0.f35218e
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 300(0x12c, float:4.2E-43)
            if (r0 == 0) goto L_0x0044
            if (r0 < r1) goto L_0x0027
            if (r0 >= r2) goto L_0x0027
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f36995U3
            com.google.android.gms.internal.ads.n00 r3 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r0 = r3.mo18570b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "No fill."
            goto L_0x0046
        L_0x0027:
            if (r0 < r2) goto L_0x0030
            r3 = 400(0x190, float:5.6E-43)
            if (r0 >= r3) goto L_0x0030
            java.lang.String r0 = "No location header to follow redirect or too many redirects."
            goto L_0x0046
        L_0x0030:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 46
            r3.<init>(r4)
            java.lang.String r4 = "Received error HTTP response code: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x0046
        L_0x0044:
            java.lang.String r0 = "No ad config."
        L_0x0046:
            com.google.android.gms.internal.ads.tr2 r3 = r9.f39937b
            com.google.android.gms.internal.ads.lr2 r3 = r3.f39519b
            com.google.android.gms.internal.ads.kr2 r3 = r3.f35222i
            if (r3 == 0) goto L_0x0052
            java.lang.String r0 = r3.mo33167a()
        L_0x0052:
            com.google.android.gms.internal.ads.w42 r3 = r8.f35948i
            com.google.android.gms.internal.ads.tr2 r4 = r9.f39937b
            com.google.android.gms.internal.ads.lr2 r4 = r4.f39519b
            r3.mo35556e(r4)
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.p00.f37073d6
            com.google.android.gms.internal.ads.n00 r4 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r3 = r4.mo18570b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 3
            if (r3 == 0) goto L_0x0085
            com.google.android.gms.internal.ads.tr2 r3 = r9.f39937b
            com.google.android.gms.internal.ads.lr2 r3 = r3.f39519b
            int r3 = r3.f35218e
            if (r3 == 0) goto L_0x0085
            if (r3 < r1) goto L_0x007a
            if (r3 < r2) goto L_0x0085
        L_0x007a:
            com.google.android.gms.internal.ads.l82 r9 = new com.google.android.gms.internal.ads.l82
            r9.<init>(r4, r0)
            com.google.android.gms.internal.ads.mb3 r9 = com.google.android.gms.internal.ads.bb3.m30648h(r9)
            goto L_0x017f
        L_0x0085:
            com.google.android.gms.internal.ads.dw2 r1 = r8.f35940a
            com.google.android.gms.internal.ads.wv2 r2 = com.google.android.gms.internal.ads.wv2.RENDER_CONFIG_INIT
            com.google.android.gms.internal.ads.l82 r3 = new com.google.android.gms.internal.ads.l82
            r3.<init>(r4, r0)
            com.google.android.gms.internal.ads.mb3 r0 = com.google.android.gms.internal.ads.bb3.m30648h(r3)
            com.google.android.gms.internal.ads.tv2 r0 = com.google.android.gms.internal.ads.mv2.m34932c(r0, r2, r1)
            com.google.android.gms.internal.ads.hv2 r0 = r0.mo35042a()
            com.google.android.gms.internal.ads.oa1 r1 = r8.f35941b
            com.google.android.gms.internal.ads.a21 r2 = new com.google.android.gms.internal.ads.a21
            com.google.android.gms.internal.ads.sx2 r3 = r8.f35943d
            com.google.android.gms.internal.ads.px2 r4 = r8.f35942c
            r2.<init>(r9, r3, r4)
            java.util.concurrent.Executor r3 = r8.f35944e
            r1.mo30921s0(r2, r3)
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.p00.f37082e6
            com.google.android.gms.internal.ads.n00 r2 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r1 = r2.mo18570b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0106
            com.google.android.gms.internal.ads.tr2 r1 = r9.f39937b
            java.util.List<com.google.android.gms.internal.ads.ir2> r1 = r1.f39518a
            java.util.Iterator r1 = r1.iterator()
        L_0x00c4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0106
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.ir2 r2 = (com.google.android.gms.internal.ads.ir2) r2
            com.google.android.gms.internal.ads.w42 r3 = r8.f35948i
            r3.mo35554c(r2)
            java.util.List<java.lang.String> r3 = r2.f33464a
            java.util.Iterator r3 = r3.iterator()
        L_0x00db:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00f8
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.internal.ads.r61<AdT> r5 = r8.f35946g
            int r6 = r2.f33466b
            com.google.android.gms.internal.ads.r42 r4 = r5.mo33709b(r6, r4)
            if (r4 == 0) goto L_0x00db
            boolean r4 = r4.mo31509a(r9, r2)
            if (r4 == 0) goto L_0x00db
            goto L_0x00c4
        L_0x00f8:
            com.google.android.gms.internal.ads.w42 r3 = r8.f35948i
            r4 = 0
            r6 = 1
            r7 = 0
            com.google.android.gms.internal.ads.zzbew r6 = com.google.android.gms.internal.ads.us2.m38446d(r6, r7, r7)
            r3.mo35555d(r2, r4, r6)
            goto L_0x00c4
        L_0x0106:
            com.google.android.gms.internal.ads.tr2 r1 = r9.f39937b
            java.util.List<com.google.android.gms.internal.ads.ir2> r1 = r1.f39518a
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x010f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x017e
            java.lang.Object r3 = r1.next()
            com.google.android.gms.internal.ads.ir2 r3 = (com.google.android.gms.internal.ads.ir2) r3
            java.util.List<java.lang.String> r4 = r3.f33464a
            java.util.Iterator r4 = r4.iterator()
        L_0x0121:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x017b
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.r61<AdT> r6 = r8.f35946g
            int r7 = r3.f33466b
            com.google.android.gms.internal.ads.r42 r6 = r6.mo33709b(r7, r5)
            if (r6 == 0) goto L_0x0121
            boolean r7 = r6.mo31509a(r9, r3)
            if (r7 == 0) goto L_0x0121
            com.google.android.gms.internal.ads.dw2 r4 = r8.f35940a
            com.google.android.gms.internal.ads.wv2 r7 = com.google.android.gms.internal.ads.wv2.RENDER_CONFIG_WATERFALL
            com.google.android.gms.internal.ads.tv2 r0 = r4.mo35307b(r7, r0)
            java.lang.String r4 = java.lang.String.valueOf(r5)
            int r4 = r4.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r4 = r4 + 26
            r7.<init>(r4)
            java.lang.String r4 = "render-config-"
            r7.append(r4)
            r7.append(r2)
            java.lang.String r4 = "-"
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = r7.toString()
            com.google.android.gms.internal.ads.tv2 r0 = r0.mo35049h(r4)
            com.google.android.gms.internal.ads.m82 r4 = new com.google.android.gms.internal.ads.m82
            r4.<init>(r8, r9, r3, r6)
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.google.android.gms.internal.ads.tv2 r0 = r0.mo35044c(r3, r4)
            com.google.android.gms.internal.ads.hv2 r0 = r0.mo35042a()
        L_0x017b:
            int r2 = r2 + 1
            goto L_0x010f
        L_0x017e:
            r9 = r0
        L_0x017f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n82.zza(java.lang.Object):com.google.android.gms.internal.ads.mb3");
    }
}
