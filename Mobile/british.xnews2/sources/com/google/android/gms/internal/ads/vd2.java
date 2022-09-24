package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vd2 implements zi2<xd2> {

    /* renamed from: a */
    private final nb3 f40394a;

    /* renamed from: b */
    private final it1 f40395b;

    /* renamed from: c */
    private final tx1 f40396c;

    /* renamed from: d */
    private final yd2 f40397d;

    public vd2(nb3 nb3, it1 it1, tx1 tx1, yd2 yd2) {
        this.f40394a = nb3;
        this.f40395b = it1;
        this.f40396c = tx1;
        this.f40397d = yd2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:3|4|5|6|7|(1:9)|10|11|(1:13)|14|15|21|19|1) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x004d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x005c */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053 A[Catch:{ gs2 -> 0x005c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.xd2 mo35414a() throws java.lang.Exception {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.h00<java.lang.String> r0 = com.google.android.gms.internal.ads.p00.f37059c1
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r0 = r1.mo18570b(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ";"
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.it1 r3 = r7.f40395b     // Catch:{ gs2 -> 0x0060 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ gs2 -> 0x0060 }
            r4.<init>()     // Catch:{ gs2 -> 0x0060 }
            com.google.android.gms.internal.ads.rs2 r3 = r3.mo32764b(r2, r4)     // Catch:{ gs2 -> 0x0060 }
            r3.mo34597a()     // Catch:{ gs2 -> 0x0060 }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ gs2 -> 0x0060 }
            r4.<init>()     // Catch:{ gs2 -> 0x0060 }
            com.google.android.gms.internal.ads.zzcab r5 = r3.mo34605i()     // Catch:{ gs2 -> 0x004d }
            if (r5 == 0) goto L_0x004d
            java.lang.String r6 = "sdk_version"
            java.lang.String r5 = r5.toString()     // Catch:{ gs2 -> 0x004d }
            r4.putString(r6, r5)     // Catch:{ gs2 -> 0x004d }
        L_0x004d:
            com.google.android.gms.internal.ads.zzcab r3 = r3.mo34604h()     // Catch:{ gs2 -> 0x005c }
            if (r3 == 0) goto L_0x005c
            java.lang.String r5 = "adapter_version"
            java.lang.String r3 = r3.toString()     // Catch:{ gs2 -> 0x005c }
            r4.putString(r5, r3)     // Catch:{ gs2 -> 0x005c }
        L_0x005c:
            r1.putBundle(r2, r4)     // Catch:{ gs2 -> 0x0060 }
            goto L_0x001f
        L_0x0060:
            goto L_0x001f
        L_0x0062:
            com.google.android.gms.internal.ads.xd2 r0 = new com.google.android.gms.internal.ads.xd2
            r2 = 0
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vd2.mo35414a():com.google.android.gms.internal.ads.xd2");
    }

    public final mb3<xd2> zzb() {
        if (m43.m20697d((String) C8311wv.m39277c().mo18570b(p00.f37059c1)) || this.f40397d.mo35912b() || !this.f40396c.mo35067s()) {
            return bb3.m30649i(new xd2(new Bundle(), (wd2) null));
        }
        this.f40397d.mo35911a(true);
        return this.f40394a.mo33675b(new ud2(this));
    }
}
