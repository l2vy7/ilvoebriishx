package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class it1 {

    /* renamed from: a */
    private final ft1 f33519a;

    /* renamed from: b */
    private final AtomicReference<tc0> f33520b = new AtomicReference<>();

    it1(ft1 ft1) {
        this.f33519a = ft1;
    }

    /* renamed from: e */
    private final tc0 m33431e() throws RemoteException {
        tc0 tc0 = this.f33520b.get();
        if (tc0 != null) {
            return tc0;
        }
        co0.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    /* renamed from: a */
    public final te0 mo32763a(String str) throws RemoteException {
        te0 z = m33431e().mo34311z(str);
        this.f33519a.mo18340d(str, z);
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(r6) != false) goto L_0x004f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.rs2 mo32764b(java.lang.String r6, org.json.JSONObject r7) throws com.google.android.gms.internal.ads.gs2 {
        /*
            r5 = this;
            java.lang.String r0 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            com.google.android.gms.internal.ads.rs2 r1 = new com.google.android.gms.internal.ads.rs2     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x0017
            com.google.android.gms.internal.ads.td0 r7 = new com.google.android.gms.internal.ads.td0     // Catch:{ all -> 0x0083 }
            com.google.ads.mediation.admob.AdMobAdapter r0 = new com.google.ads.mediation.admob.AdMobAdapter     // Catch:{ all -> 0x0083 }
            r0.<init>()     // Catch:{ all -> 0x0083 }
            r7.<init>((com.google.android.gms.ads.mediation.MediationAdapter) r0)     // Catch:{ all -> 0x0083 }
            goto L_0x007a
        L_0x0017:
            java.lang.String r2 = "com.google.ads.mediation.AdUrlAdapter"
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.td0 r7 = new com.google.android.gms.internal.ads.td0     // Catch:{ all -> 0x0083 }
            com.google.ads.mediation.AdUrlAdapter r0 = new com.google.ads.mediation.AdUrlAdapter     // Catch:{ all -> 0x0083 }
            r0.<init>()     // Catch:{ all -> 0x0083 }
            r7.<init>((com.google.android.gms.ads.mediation.MediationAdapter) r0)     // Catch:{ all -> 0x0083 }
            goto L_0x007a
        L_0x002a:
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobCustomTabsAdapter"
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x003d
            com.google.android.gms.internal.ads.td0 r7 = new com.google.android.gms.internal.ads.td0     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.zzcaf r0 = new com.google.android.gms.internal.ads.zzcaf     // Catch:{ all -> 0x0083 }
            r0.<init>()     // Catch:{ all -> 0x0083 }
            r7.<init>((com.google.android.gms.ads.mediation.MediationAdapter) r0)     // Catch:{ all -> 0x0083 }
            goto L_0x007a
        L_0x003d:
            com.google.android.gms.internal.ads.tc0 r2 = r5.m33431e()     // Catch:{ all -> 0x0083 }
            boolean r3 = r0.equals(r6)     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            if (r3 != 0) goto L_0x004f
            boolean r3 = r4.equals(r6)     // Catch:{ all -> 0x0083 }
            if (r3 == 0) goto L_0x0076
        L_0x004f:
            java.lang.String r3 = "class_name"
            java.lang.String r7 = r7.getString(r3)     // Catch:{ JSONException -> 0x0070 }
            boolean r3 = r2.mo34309c(r7)     // Catch:{ JSONException -> 0x0070 }
            if (r3 == 0) goto L_0x0060
            com.google.android.gms.internal.ads.wc0 r7 = r2.mo34307a(r4)     // Catch:{ JSONException -> 0x0070 }
            goto L_0x007a
        L_0x0060:
            boolean r3 = r2.mo34308b(r7)     // Catch:{ JSONException -> 0x0070 }
            if (r3 == 0) goto L_0x006b
            com.google.android.gms.internal.ads.wc0 r7 = r2.mo34307a(r7)     // Catch:{ JSONException -> 0x0070 }
            goto L_0x007a
        L_0x006b:
            com.google.android.gms.internal.ads.wc0 r7 = r2.mo34307a(r0)     // Catch:{ JSONException -> 0x0070 }
            goto L_0x007a
        L_0x0070:
            r7 = move-exception
            java.lang.String r0 = "Invalid custom event."
            com.google.android.gms.internal.ads.co0.zzh(r0, r7)     // Catch:{ all -> 0x0083 }
        L_0x0076:
            com.google.android.gms.internal.ads.wc0 r7 = r2.mo34307a(r6)     // Catch:{ all -> 0x0083 }
        L_0x007a:
            r1.<init>(r7)     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.ft1 r7 = r5.f33519a
            r7.mo18339c(r6, r1)
            return r1
        L_0x0083:
            r6 = move-exception
            com.google.android.gms.internal.ads.gs2 r7 = new com.google.android.gms.internal.ads.gs2
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.it1.mo32764b(java.lang.String, org.json.JSONObject):com.google.android.gms.internal.ads.rs2");
    }

    /* renamed from: c */
    public final void mo32765c(tc0 tc0) {
        this.f33520b.compareAndSet((Object) null, tc0);
    }

    /* renamed from: d */
    public final boolean mo32766d() {
        return this.f33520b.get() != null;
    }
}
