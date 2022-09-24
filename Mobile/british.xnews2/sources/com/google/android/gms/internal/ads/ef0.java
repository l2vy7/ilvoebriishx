package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.ads.zza;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p198d5.C10487a;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class ef0 extends se0 {

    /* renamed from: b */
    private final RtbAdapter f31343b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public MediationInterstitialAd f31344c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public MediationRewardedAd f31345d;

    /* renamed from: e */
    private String f31346e = "";

    public ef0(RtbAdapter rtbAdapter) {
        this.f31343b = rtbAdapter;
    }

    /* renamed from: q6 */
    private final Bundle m31804q6(zzbfd zzbfd) {
        Bundle bundle;
        Bundle bundle2 = zzbfd.f42952n;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.f31343b.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    /* renamed from: r6 */
    private static final Bundle m31805r6(String str) throws RemoteException {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Server parameters: ".concat(valueOf);
        } else {
            str2 = new String("Server parameters: ");
        }
        co0.zzj(str2);
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            co0.zzh("", e);
            throw new RemoteException();
        }
    }

    /* renamed from: s6 */
    private static final boolean m31806s6(zzbfd zzbfd) {
        if (zzbfd.f42945g) {
            return true;
        }
        C8241uv.m38463b();
        return vn0.m38854m();
    }

    /* renamed from: t6 */
    private static final String m31807t6(String str, zzbfd zzbfd) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzbfd.f42960v;
        }
    }

    /* renamed from: L0 */
    public final void mo31552L0(String str, String str2, zzbfd zzbfd, C10487a aVar, he0 he0, zc0 zc0, zzbfi zzbfi) throws RemoteException {
        zzbfd zzbfd2 = zzbfd;
        zzbfi zzbfi2 = zzbfi;
        try {
            ye0 ye0 = new ye0(this, he0, zc0);
            RtbAdapter rtbAdapter = this.f31343b;
            Bundle r6 = m31805r6(str2);
            Bundle q6 = m31804q6(zzbfd2);
            boolean s6 = m31806s6(zzbfd);
            Location location = zzbfd2.f42950l;
            int i = zzbfd2.f42946h;
            int i2 = zzbfd2.f42959u;
            String t6 = m31807t6(str2, zzbfd);
            AdSize zzc = zza.zzc(zzbfi2.f42968f, zzbfi2.f42965c, zzbfi2.f42964b);
            String str3 = this.f31346e;
            MediationBannerAdConfiguration mediationBannerAdConfiguration = r5;
            MediationBannerAdConfiguration mediationBannerAdConfiguration2 = new MediationBannerAdConfiguration((Context) C10489b.m48194f3(aVar), str, r6, q6, s6, location, i, i2, t6, zzc, str3);
            rtbAdapter.loadRtbBannerAd(mediationBannerAdConfiguration, ye0);
        } catch (Throwable th) {
            co0.zzh("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: M4 */
    public final void mo31553M4(String str, String str2, zzbfd zzbfd, C10487a aVar, ne0 ne0, zc0 zc0, zzbnw zzbnw) throws RemoteException {
        zzbfd zzbfd2 = zzbfd;
        try {
            bf0 bf0 = new bf0(this, ne0, zc0);
            RtbAdapter rtbAdapter = this.f31343b;
            MediationNativeAdConfiguration mediationNativeAdConfiguration = r4;
            MediationNativeAdConfiguration mediationNativeAdConfiguration2 = new MediationNativeAdConfiguration((Context) C10489b.m48194f3(aVar), str, m31805r6(str2), m31804q6(zzbfd2), m31806s6(zzbfd), zzbfd2.f42950l, zzbfd2.f42946h, zzbfd2.f42959u, m31807t6(str2, zzbfd), this.f31346e, zzbnw);
            rtbAdapter.loadRtbNativeAd(mediationNativeAdConfiguration, bf0);
        } catch (Throwable th) {
            co0.zzh("Adapter failed to render native ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: N1 */
    public final void mo31554N1(String str, String str2, zzbfd zzbfd, C10487a aVar, ne0 ne0, zc0 zc0) throws RemoteException {
        mo31553M4(str, str2, zzbfd, aVar, ne0, zc0, (zzbnw) null);
    }

    /* renamed from: Q1 */
    public final void mo31555Q1(String str, String str2, zzbfd zzbfd, C10487a aVar, ke0 ke0, zc0 zc0) throws RemoteException {
        zzbfd zzbfd2 = zzbfd;
        try {
            this.f31343b.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) C10489b.m48194f3(aVar), str, m31805r6(str2), m31804q6(zzbfd2), m31806s6(zzbfd), zzbfd2.f42950l, zzbfd2.f42946h, zzbfd2.f42959u, m31807t6(str2, zzbfd), this.f31346e), new af0(this, ke0, zc0));
        } catch (Throwable th) {
            co0.zzh("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: Q2 */
    public final void mo31556Q2(String str, String str2, zzbfd zzbfd, C10487a aVar, qe0 qe0, zc0 zc0) throws RemoteException {
        zzbfd zzbfd2 = zzbfd;
        try {
            this.f31343b.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) C10489b.m48194f3(aVar), str, m31805r6(str2), m31804q6(zzbfd2), m31806s6(zzbfd), zzbfd2.f42950l, zzbfd2.f42946h, zzbfd2.f42959u, m31807t6(str2, zzbfd), this.f31346e), new df0(this, qe0, zc0));
        } catch (Throwable th) {
            co0.zzh("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: R */
    public final boolean mo31557R(C10487a aVar) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.f31345d;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) C10489b.m48194f3(aVar));
            return true;
        } catch (Throwable th) {
            co0.zzh("", th);
            return true;
        }
    }

    /* renamed from: W */
    public final boolean mo31558W(C10487a aVar) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.f31344c;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) C10489b.m48194f3(aVar));
            return true;
        } catch (Throwable th) {
            co0.zzh("", th);
            return true;
        }
    }

    /* renamed from: h2 */
    public final void mo31559h2(String str, String str2, zzbfd zzbfd, C10487a aVar, qe0 qe0, zc0 zc0) throws RemoteException {
        zzbfd zzbfd2 = zzbfd;
        try {
            this.f31343b.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) C10489b.m48194f3(aVar), str, m31805r6(str2), m31804q6(zzbfd2), m31806s6(zzbfd), zzbfd2.f42950l, zzbfd2.f42946h, zzbfd2.f42959u, m31807t6(str2, zzbfd), this.f31346e), new df0(this, qe0, zc0));
        } catch (Throwable th) {
            co0.zzh("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: j */
    public final void mo31560j(String str) {
        this.f31346e = str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: u2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31561u2(p198d5.C10487a r8, java.lang.String r9, android.os.Bundle r10, android.os.Bundle r11, com.google.android.gms.internal.ads.zzbfi r12, com.google.android.gms.internal.ads.we0 r13) throws android.os.RemoteException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.cf0 r0 = new com.google.android.gms.internal.ads.cf0     // Catch:{ all -> 0x008c }
            r0.<init>(r7, r13)     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r13 = r7.f31343b     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.mediation.MediationConfiguration r1 = new com.google.android.gms.ads.mediation.MediationConfiguration     // Catch:{ all -> 0x008c }
            int r2 = r9.hashCode()     // Catch:{ all -> 0x008c }
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1396342996: goto L_0x003d;
                case -1052618729: goto L_0x0033;
                case -239580146: goto L_0x0029;
                case 604727084: goto L_0x001f;
                case 1911491517: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0047
        L_0x0015:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 3
            goto L_0x0048
        L_0x001f:
            java.lang.String r2 = "interstitial"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 1
            goto L_0x0048
        L_0x0029:
            java.lang.String r2 = "rewarded"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 2
            goto L_0x0048
        L_0x0033:
            java.lang.String r2 = "native"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 4
            goto L_0x0048
        L_0x003d:
            java.lang.String r2 = "banner"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 0
            goto L_0x0048
        L_0x0047:
            r9 = -1
        L_0x0048:
            if (r9 == 0) goto L_0x0066
            if (r9 == r6) goto L_0x0063
            if (r9 == r5) goto L_0x0060
            if (r9 == r4) goto L_0x005d
            if (r9 != r3) goto L_0x0055
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.NATIVE     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0055:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x008c }
            java.lang.String r9 = "Internal Error"
            r8.<init>(r9)     // Catch:{ all -> 0x008c }
            throw r8     // Catch:{ all -> 0x008c }
        L_0x005d:
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0060:
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.REWARDED     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0063:
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.INTERSTITIAL     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0066:
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.BANNER     // Catch:{ all -> 0x008c }
        L_0x0068:
            r1.<init>(r9, r11)     // Catch:{ all -> 0x008c }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x008c }
            r9.<init>()     // Catch:{ all -> 0x008c }
            r9.add(r1)     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.mediation.rtb.RtbSignalData r11 = new com.google.android.gms.ads.mediation.rtb.RtbSignalData     // Catch:{ all -> 0x008c }
            java.lang.Object r8 = p198d5.C10489b.m48194f3(r8)     // Catch:{ all -> 0x008c }
            android.content.Context r8 = (android.content.Context) r8     // Catch:{ all -> 0x008c }
            int r1 = r12.f42968f     // Catch:{ all -> 0x008c }
            int r2 = r12.f42965c     // Catch:{ all -> 0x008c }
            java.lang.String r12 = r12.f42964b     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.AdSize r12 = com.google.android.gms.ads.zza.zzc(r1, r2, r12)     // Catch:{ all -> 0x008c }
            r11.<init>(r8, r9, r10, r12)     // Catch:{ all -> 0x008c }
            r13.collectSignals(r11, r0)     // Catch:{ all -> 0x008c }
            return
        L_0x008c:
            r8 = move-exception
            java.lang.String r9 = "Error generating signals for RTB"
            com.google.android.gms.internal.ads.co0.zzh(r9, r8)
            android.os.RemoteException r8 = new android.os.RemoteException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ef0.mo31561u2(d5.a, java.lang.String, android.os.Bundle, android.os.Bundle, com.google.android.gms.internal.ads.zzbfi, com.google.android.gms.internal.ads.we0):void");
    }

    /* renamed from: z1 */
    public final void mo31562z1(String str, String str2, zzbfd zzbfd, C10487a aVar, he0 he0, zc0 zc0, zzbfi zzbfi) throws RemoteException {
        zzbfd zzbfd2 = zzbfd;
        zzbfi zzbfi2 = zzbfi;
        try {
            ze0 ze0 = new ze0(this, he0, zc0);
            RtbAdapter rtbAdapter = this.f31343b;
            Bundle r6 = m31805r6(str2);
            Bundle q6 = m31804q6(zzbfd2);
            boolean s6 = m31806s6(zzbfd);
            Location location = zzbfd2.f42950l;
            int i = zzbfd2.f42946h;
            int i2 = zzbfd2.f42959u;
            String t6 = m31807t6(str2, zzbfd);
            AdSize zzc = zza.zzc(zzbfi2.f42968f, zzbfi2.f42965c, zzbfi2.f42964b);
            String str3 = this.f31346e;
            MediationBannerAdConfiguration mediationBannerAdConfiguration = r5;
            MediationBannerAdConfiguration mediationBannerAdConfiguration2 = new MediationBannerAdConfiguration((Context) C10489b.m48194f3(aVar), str, r6, q6, s6, location, i, i2, t6, zzc, str3);
            rtbAdapter.loadRtbInterscrollerAd(mediationBannerAdConfiguration, ze0);
        } catch (Throwable th) {
            co0.zzh("Adapter failed to render interscroller ad.", th);
            throw new RemoteException();
        }
    }

    public final C7774hy zze() {
        RtbAdapter rtbAdapter = this.f31343b;
        if (rtbAdapter instanceof zzb) {
            try {
                return ((zzb) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                co0.zzh("", th);
            }
        }
        return null;
    }

    public final zzcab zzf() throws RemoteException {
        return zzcab.m21323C0(this.f31343b.getVersionInfo());
    }

    public final zzcab zzg() throws RemoteException {
        return zzcab.m21323C0(this.f31343b.getSDKVersionInfo());
    }
}
