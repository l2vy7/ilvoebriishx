package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class o32 implements xa3<Bundle> {

    /* renamed from: a */
    final /* synthetic */ boolean f36265a;

    /* renamed from: b */
    final /* synthetic */ p32 f36266b;

    o32(p32 p32, boolean z) {
        this.f36266b = p32;
        this.f36265a = z;
    }

    public final void zza(Throwable th) {
        co0.zzg("Failed to get signals bundle");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r8) {
        /*
            r7 = this;
            android.os.Bundle r8 = (android.os.Bundle) r8
            com.google.android.gms.internal.ads.p32 r0 = r7.f36266b
            com.google.android.gms.ads.internal.util.zzg r0 = r0.f37321f
            boolean r0 = r0.zzL()
            if (r0 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r0 = "ad_types"
            java.lang.Object r0 = r8.get(r0)
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L_0x001c
            java.util.List r0 = (java.util.List) r0
            goto L_0x0026
        L_0x001c:
            boolean r1 = r0 instanceof java.lang.String[]
            if (r1 == 0) goto L_0x004c
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
        L_0x0026:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0033:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x0033
            java.lang.String r2 = (java.lang.String) r2
            r1.add(r2)
            goto L_0x0033
        L_0x0047:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L_0x0050
        L_0x004c:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x0050:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0059:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b3
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1396342996: goto L_0x008e;
                case -1052618729: goto L_0x0084;
                case -239580146: goto L_0x007a;
                case 604727084: goto L_0x0070;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0098
        L_0x0070:
            java.lang.String r2 = "interstitial"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0098
            r1 = 1
            goto L_0x0099
        L_0x007a:
            java.lang.String r2 = "rewarded"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0098
            r1 = 3
            goto L_0x0099
        L_0x0084:
            java.lang.String r2 = "native"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0098
            r1 = 2
            goto L_0x0099
        L_0x008e:
            java.lang.String r2 = "banner"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0098
            r1 = 0
            goto L_0x0099
        L_0x0098:
            r1 = -1
        L_0x0099:
            if (r1 == 0) goto L_0x00ad
            if (r1 == r6) goto L_0x00aa
            if (r1 == r5) goto L_0x00a7
            if (r1 == r3) goto L_0x00a4
            com.google.android.gms.internal.ads.dr r1 = com.google.android.gms.internal.ads.C7619dr.AD_FORMAT_TYPE_UNSPECIFIED
            goto L_0x00af
        L_0x00a4:
            com.google.android.gms.internal.ads.dr r1 = com.google.android.gms.internal.ads.C7619dr.REWARD_BASED_VIDEO_AD
            goto L_0x00af
        L_0x00a7:
            com.google.android.gms.internal.ads.dr r1 = com.google.android.gms.internal.ads.C7619dr.NATIVE_APP_INSTALL
            goto L_0x00af
        L_0x00aa:
            com.google.android.gms.internal.ads.dr r1 = com.google.android.gms.internal.ads.C7619dr.INTERSTITIAL
            goto L_0x00af
        L_0x00ad:
            com.google.android.gms.internal.ads.dr r1 = com.google.android.gms.internal.ads.C7619dr.f30953d
        L_0x00af:
            r4.add(r1)
            goto L_0x0059
        L_0x00b3:
            com.google.android.gms.internal.ads.p32 r0 = r7.f36266b
            com.google.android.gms.internal.ads.us r6 = com.google.android.gms.internal.ads.p32.f37315h.get(com.google.android.gms.internal.ads.ms2.m34887a(com.google.android.gms.internal.ads.ms2.m34887a(r8, "device"), "network").getInt("active_network_state", -1), com.google.android.gms.internal.ads.C8238us.UNSPECIFIED)
            com.google.android.gms.internal.ads.p32 r0 = r7.f36266b
            com.google.android.gms.internal.ads.ls r5 = com.google.android.gms.internal.ads.p32.m35942a(r0, r8)
            com.google.android.gms.internal.ads.p32 r8 = r7.f36266b
            com.google.android.gms.internal.ads.e32 r8 = r8.f37320e
            boolean r3 = r7.f36265a
            com.google.android.gms.internal.ads.n32 r0 = new com.google.android.gms.internal.ads.n32
            r1 = r0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r8.mo31464a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o32.zzb(java.lang.Object):void");
    }
}
