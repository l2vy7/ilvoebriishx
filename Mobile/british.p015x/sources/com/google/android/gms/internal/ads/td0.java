package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.ads.zza;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class td0 extends vc0 {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f39387b;

    /* renamed from: c */
    private vd0 f39388c;

    /* renamed from: d */
    private uj0 f39389d;

    /* renamed from: e */
    private C10487a f39390e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public View f39391f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public MediationInterstitialAd f39392g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public UnifiedNativeAdMapper f39393h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public MediationRewardedAd f39394i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public MediationInterscrollerAd f39395j;

    /* renamed from: k */
    private final String f39396k = "";

    public td0(Adapter adapter) {
        this.f39387b = adapter;
    }

    /* renamed from: q6 */
    private final Bundle m37789q6(zzbfd zzbfd) {
        Bundle bundle;
        Bundle bundle2 = zzbfd.f42952n;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.f39387b.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    /* renamed from: r6 */
    private final Bundle m37790r6(String str, zzbfd zzbfd, String str2) throws RemoteException {
        String str3;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str3 = "Server parameters: ".concat(valueOf);
        } else {
            str3 = new String("Server parameters: ");
        }
        co0.zze(str3);
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f39387b instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzbfd != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzbfd.f42946h);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            co0.zzh("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: s6 */
    private static final boolean m37791s6(zzbfd zzbfd) {
        if (zzbfd.f42945g) {
            return true;
        }
        C8241uv.m38463b();
        return vn0.m38854m();
    }

    /* renamed from: t6 */
    private static final String m37792t6(String str, zzbfd zzbfd) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzbfd.f42960v;
        }
    }

    /* renamed from: C0 */
    public final void mo34905C0(C10487a aVar) throws RemoteException {
        Context context = (Context) C10489b.m48194f3(aVar);
        Object obj = this.f39387b;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: H4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34906H4(p199d5.C10487a r9, com.google.android.gms.internal.ads.b90 r10, java.util.List<com.google.android.gms.internal.ads.zzbtx> r11) throws android.os.RemoteException {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f39387b
            boolean r0 = r0 instanceof com.google.android.gms.ads.mediation.Adapter
            if (r0 == 0) goto L_0x0096
            com.google.android.gms.internal.ads.od0 r0 = new com.google.android.gms.internal.ads.od0
            r0.<init>(r8, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0014:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0088
            java.lang.Object r1 = r11.next()
            com.google.android.gms.internal.ads.zzbtx r1 = (com.google.android.gms.internal.ads.zzbtx) r1
            java.lang.String r2 = r1.f43016b
            int r3 = r2.hashCode()
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r3) {
                case -1396342996: goto L_0x0056;
                case -1052618729: goto L_0x004c;
                case -239580146: goto L_0x0042;
                case 604727084: goto L_0x0038;
                case 1911491517: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0060
        L_0x002e:
            java.lang.String r3 = "rewarded_interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 3
            goto L_0x0061
        L_0x0038:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 1
            goto L_0x0061
        L_0x0042:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 2
            goto L_0x0061
        L_0x004c:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 4
            goto L_0x0061
        L_0x0056:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 0
            goto L_0x0061
        L_0x0060:
            r2 = -1
        L_0x0061:
            if (r2 == 0) goto L_0x0079
            if (r2 == r7) goto L_0x0076
            if (r2 == r6) goto L_0x0073
            if (r2 == r5) goto L_0x0070
            if (r2 == r4) goto L_0x006d
            r2 = 0
            goto L_0x007b
        L_0x006d:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.NATIVE
            goto L_0x007b
        L_0x0070:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL
            goto L_0x007b
        L_0x0073:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.REWARDED
            goto L_0x007b
        L_0x0076:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.INTERSTITIAL
            goto L_0x007b
        L_0x0079:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.BANNER
        L_0x007b:
            if (r2 == 0) goto L_0x0014
            com.google.android.gms.ads.mediation.MediationConfiguration r3 = new com.google.android.gms.ads.mediation.MediationConfiguration
            android.os.Bundle r1 = r1.f43017c
            r3.<init>(r2, r1)
            r10.add(r3)
            goto L_0x0014
        L_0x0088:
            java.lang.Object r11 = r8.f39387b
            com.google.android.gms.ads.mediation.Adapter r11 = (com.google.android.gms.ads.mediation.Adapter) r11
            java.lang.Object r9 = p199d5.C10489b.m48194f3(r9)
            android.content.Context r9 = (android.content.Context) r9
            r11.initialize(r9, r0, r10)
            return
        L_0x0096:
            android.os.RemoteException r9 = new android.os.RemoteException
            r9.<init>()
            goto L_0x009d
        L_0x009c:
            throw r9
        L_0x009d:
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.td0.mo34906H4(d5.a, com.google.android.gms.internal.ads.b90, java.util.List):void");
    }

    /* renamed from: J4 */
    public final void mo34907J4(zzbfd zzbfd, String str, String str2) throws RemoteException {
        Object obj = this.f39387b;
        if (obj instanceof Adapter) {
            mo34920p3(this.f39390e, zzbfd, str, new wd0((Adapter) obj, this.f39389d));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f39387b.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        co0.zzj(sb.toString());
        throw new RemoteException();
    }

    /* renamed from: R0 */
    public final void mo34908R0(C10487a aVar, zzbfi zzbfi, zzbfd zzbfd, String str, String str2, zc0 zc0) throws RemoteException {
        AdSize adSize;
        Date date;
        zzbfi zzbfi2 = zzbfi;
        zzbfd zzbfd2 = zzbfd;
        String str3 = str;
        String str4 = str2;
        zc0 zc02 = zc0;
        Object obj = this.f39387b;
        if ((obj instanceof MediationBannerAdapter) || (obj instanceof Adapter)) {
            co0.zze("Requesting banner ad from adapter.");
            if (zzbfi2.f42977o) {
                adSize = zza.zzd(zzbfi2.f42968f, zzbfi2.f42965c);
            } else {
                adSize = zza.zzc(zzbfi2.f42968f, zzbfi2.f42965c, zzbfi2.f42964b);
            }
            AdSize adSize2 = adSize;
            Object obj2 = this.f39387b;
            if (obj2 instanceof MediationBannerAdapter) {
                try {
                    MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                    List<String> list = zzbfd2.f42944f;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = zzbfd2.f42941c;
                    if (j == -1) {
                        date = null;
                    } else {
                        date = new Date(j);
                    }
                    ld0 ld0 = new ld0(date, zzbfd2.f42943e, hashSet, zzbfd2.f42950l, m37791s6(zzbfd), zzbfd2.f42946h, zzbfd2.f42957s, zzbfd2.f42959u, m37792t6(str3, zzbfd2));
                    Bundle bundle = zzbfd2.f42952n;
                    mediationBannerAdapter.requestBannerAd((Context) C10489b.m48194f3(aVar), new vd0(zc02), m37790r6(str3, zzbfd2, str4), adSize2, ld0, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                } catch (Throwable th) {
                    co0.zzh("", th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    pd0 pd0 = new pd0(this, zc02);
                    Bundle r6 = m37790r6(str3, zzbfd2, str4);
                    Bundle q6 = m37789q6(zzbfd2);
                    boolean s6 = m37791s6(zzbfd);
                    Location location = zzbfd2.f42950l;
                    int i = zzbfd2.f42946h;
                    int i2 = zzbfd2.f42959u;
                    String t6 = m37792t6(str3, zzbfd2);
                    String str5 = this.f39396k;
                    MediationBannerAdConfiguration mediationBannerAdConfiguration = r2;
                    MediationBannerAdConfiguration mediationBannerAdConfiguration2 = new MediationBannerAdConfiguration((Context) C10489b.m48194f3(aVar), "", r6, q6, s6, location, i, i2, t6, adSize2, str5);
                    ((Adapter) obj2).loadBannerAd(mediationBannerAdConfiguration, pd0);
                } catch (Throwable th2) {
                    co0.zzh("", th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f39387b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            co0.zzj(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: R5 */
    public final void mo34909R5(C10487a aVar, zzbfd zzbfd, String str, zc0 zc0) throws RemoteException {
        zzbfd zzbfd2 = zzbfd;
        String str2 = str;
        if (this.f39387b instanceof Adapter) {
            co0.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                sd0 sd0 = new sd0(this, zc0);
                Bundle r6 = m37790r6(str2, zzbfd2, (String) null);
                Bundle q6 = m37789q6(zzbfd2);
                boolean s6 = m37791s6(zzbfd);
                Location location = zzbfd2.f42950l;
                int i = zzbfd2.f42946h;
                int i2 = zzbfd2.f42959u;
                String t6 = m37792t6(str2, zzbfd2);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration = r5;
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = new MediationRewardedAdConfiguration((Context) C10489b.m48194f3(aVar), "", r6, q6, s6, location, i, i2, t6, "");
                ((Adapter) this.f39387b).loadRewardedInterstitialAd(mediationRewardedAdConfiguration, sd0);
            } catch (Exception e) {
                co0.zzh("", e);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.f39387b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            co0.zzj(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: S3 */
    public final void mo34910S3(boolean z) throws RemoteException {
        Object obj = this.f39387b;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
            } catch (Throwable th) {
                co0.zzh("", th);
            }
        } else {
            String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
            String canonicalName2 = this.f39387b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            co0.zze(sb.toString());
        }
    }

    /* renamed from: X1 */
    public final void mo34911X1(C10487a aVar, zzbfi zzbfi, zzbfd zzbfd, String str, String str2, zc0 zc0) throws RemoteException {
        zzbfi zzbfi2 = zzbfi;
        zzbfd zzbfd2 = zzbfd;
        String str3 = str;
        if (this.f39387b instanceof Adapter) {
            co0.zze("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.f39387b;
                nd0 nd0 = new nd0(this, zc0, adapter);
                Bundle r6 = m37790r6(str3, zzbfd2, str2);
                Bundle q6 = m37789q6(zzbfd2);
                boolean s6 = m37791s6(zzbfd);
                Location location = zzbfd2.f42950l;
                int i = zzbfd2.f42946h;
                int i2 = zzbfd2.f42959u;
                String t6 = m37792t6(str3, zzbfd2);
                AdSize zze = zza.zze(zzbfi2.f42968f, zzbfi2.f42965c);
                MediationBannerAdConfiguration mediationBannerAdConfiguration = r6;
                MediationBannerAdConfiguration mediationBannerAdConfiguration2 = new MediationBannerAdConfiguration((Context) C10489b.m48194f3(aVar), "", r6, q6, s6, location, i, i2, t6, zze, "");
                adapter.loadInterscrollerAd(mediationBannerAdConfiguration, nd0);
            } catch (Exception e) {
                co0.zzh("", e);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.f39387b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            co0.zzj(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: e6 */
    public final void mo34912e6(C10487a aVar, zzbfd zzbfd, String str, String str2, zc0 zc0) throws RemoteException {
        Date date;
        zzbfd zzbfd2 = zzbfd;
        String str3 = str;
        String str4 = str2;
        zc0 zc02 = zc0;
        Object obj = this.f39387b;
        if ((obj instanceof MediationInterstitialAdapter) || (obj instanceof Adapter)) {
            co0.zze("Requesting interstitial ad from adapter.");
            Object obj2 = this.f39387b;
            if (obj2 instanceof MediationInterstitialAdapter) {
                try {
                    MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                    List<String> list = zzbfd2.f42944f;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = zzbfd2.f42941c;
                    if (j == -1) {
                        date = null;
                    } else {
                        date = new Date(j);
                    }
                    ld0 ld0 = new ld0(date, zzbfd2.f42943e, hashSet, zzbfd2.f42950l, m37791s6(zzbfd), zzbfd2.f42946h, zzbfd2.f42957s, zzbfd2.f42959u, m37792t6(str3, zzbfd2));
                    Bundle bundle = zzbfd2.f42952n;
                    mediationInterstitialAdapter.requestInterstitialAd((Context) C10489b.m48194f3(aVar), new vd0(zc02), m37790r6(str3, zzbfd2, str4), ld0, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
                } catch (Throwable th) {
                    co0.zzh("", th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) C10489b.m48194f3(aVar), "", m37790r6(str3, zzbfd2, str4), m37789q6(zzbfd2), m37791s6(zzbfd), zzbfd2.f42950l, zzbfd2.f42946h, zzbfd2.f42959u, m37792t6(str3, zzbfd2), this.f39396k), new qd0(this, zc02));
                } catch (Throwable th2) {
                    co0.zzh("", th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f39387b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            co0.zzj(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: f */
    public final void mo34913f() throws RemoteException {
        Object obj = this.f39387b;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                co0.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: h */
    public final fd0 mo34914h() {
        return null;
    }

    /* renamed from: h3 */
    public final void mo34915h3(C10487a aVar) throws RemoteException {
        Object obj = this.f39387b;
        if (!(obj instanceof Adapter) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f39387b.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            co0.zzj(sb.toString());
            throw new RemoteException();
        } else if (obj instanceof MediationInterstitialAdapter) {
            mo34922q();
        } else {
            co0.zze("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.f39392g;
            if (mediationInterstitialAd != null) {
                mediationInterstitialAd.showAd((Context) C10489b.m48194f3(aVar));
            } else {
                co0.zzg("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
    }

    /* renamed from: l4 */
    public final void mo34916l4(zzbfd zzbfd, String str) throws RemoteException {
        mo34907J4(zzbfd, str, (String) null);
    }

    /* renamed from: l6 */
    public final void mo34917l6(C10487a aVar, zzbfd zzbfd, String str, uj0 uj0, String str2) throws RemoteException {
        Object obj = this.f39387b;
        if (obj instanceof Adapter) {
            this.f39390e = aVar;
            this.f39389d = uj0;
            uj0.zzl(C10489b.m48195m6(obj));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f39387b.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        co0.zzj(sb.toString());
        throw new RemoteException();
    }

    /* renamed from: m2 */
    public final void mo34918m2(C10487a aVar) throws RemoteException {
        if (this.f39387b instanceof Adapter) {
            co0.zze("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.f39394i;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) C10489b.m48194f3(aVar));
            } else {
                co0.zzg("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.f39387b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            co0.zzj(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: o4 */
    public final void mo34919o4(C10487a aVar, zzbfd zzbfd, String str, String str2, zc0 zc0, zzbnw zzbnw, List<String> list) throws RemoteException {
        Date date;
        zzbfd zzbfd2 = zzbfd;
        String str3 = str;
        String str4 = str2;
        zc0 zc02 = zc0;
        Object obj = this.f39387b;
        if ((obj instanceof MediationNativeAdapter) || (obj instanceof Adapter)) {
            co0.zze("Requesting native ad from adapter.");
            Object obj2 = this.f39387b;
            if (obj2 instanceof MediationNativeAdapter) {
                try {
                    MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                    List<String> list2 = zzbfd2.f42944f;
                    HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                    long j = zzbfd2.f42941c;
                    if (j == -1) {
                        date = null;
                    } else {
                        date = new Date(j);
                    }
                    xd0 xd0 = new xd0(date, zzbfd2.f42943e, hashSet, zzbfd2.f42950l, m37791s6(zzbfd), zzbfd2.f42946h, zzbnw, list, zzbfd2.f42957s, zzbfd2.f42959u, m37792t6(str3, zzbfd2));
                    Bundle bundle = zzbfd2.f42952n;
                    Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                    this.f39388c = new vd0(zc02);
                    mediationNativeAdapter.requestNativeAd((Context) C10489b.m48194f3(aVar), this.f39388c, m37790r6(str3, zzbfd2, str4), xd0, bundle2);
                } catch (Throwable th) {
                    co0.zzh("", th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadNativeAd(new MediationNativeAdConfiguration((Context) C10489b.m48194f3(aVar), "", m37790r6(str3, zzbfd2, str4), m37789q6(zzbfd2), m37791s6(zzbfd), zzbfd2.f42950l, zzbfd2.f42946h, zzbfd2.f42959u, m37792t6(str3, zzbfd2), this.f39396k, zzbnw), new rd0(this, zc02));
                } catch (Throwable th2) {
                    co0.zzh("", th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f39387b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            co0.zzj(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: p3 */
    public final void mo34920p3(C10487a aVar, zzbfd zzbfd, String str, zc0 zc0) throws RemoteException {
        zzbfd zzbfd2 = zzbfd;
        String str2 = str;
        if (this.f39387b instanceof Adapter) {
            co0.zze("Requesting rewarded ad from adapter.");
            try {
                sd0 sd0 = new sd0(this, zc0);
                Bundle r6 = m37790r6(str2, zzbfd2, (String) null);
                Bundle q6 = m37789q6(zzbfd2);
                boolean s6 = m37791s6(zzbfd);
                Location location = zzbfd2.f42950l;
                int i = zzbfd2.f42946h;
                int i2 = zzbfd2.f42959u;
                String t6 = m37792t6(str2, zzbfd2);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration = r5;
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = new MediationRewardedAdConfiguration((Context) C10489b.m48194f3(aVar), "", r6, q6, s6, location, i, i2, t6, "");
                ((Adapter) this.f39387b).loadRewardedAd(mediationRewardedAdConfiguration, sd0);
            } catch (Exception e) {
                co0.zzh("", e);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.f39387b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            co0.zzj(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: p4 */
    public final void mo34921p4(C10487a aVar, zzbfd zzbfd, String str, zc0 zc0) throws RemoteException {
        mo34912e6(aVar, zzbfd, str, (String) null, zc0);
    }

    /* renamed from: q */
    public final void mo34922q() throws RemoteException {
        if (this.f39387b instanceof MediationInterstitialAdapter) {
            co0.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f39387b).showInterstitial();
            } catch (Throwable th) {
                co0.zzh("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f39387b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            co0.zzj(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: r5 */
    public final void mo34923r5(C10487a aVar, zzbfi zzbfi, zzbfd zzbfd, String str, zc0 zc0) throws RemoteException {
        mo34908R0(aVar, zzbfi, zzbfd, str, (String) null, zc0);
    }

    /* renamed from: t4 */
    public final void mo34924t4(C10487a aVar, uj0 uj0, List<String> list) throws RemoteException {
        co0.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    /* renamed from: u */
    public final ed0 mo34925u() {
        return null;
    }

    public final void zzE() throws RemoteException {
        Object obj = this.f39387b;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                co0.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    public final void zzJ() throws RemoteException {
        if (this.f39387b instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.f39394i;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) C10489b.m48194f3(this.f39390e));
            } else {
                co0.zzg("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.f39387b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            co0.zzj(sb.toString());
            throw new RemoteException();
        }
    }

    public final boolean zzK() {
        return false;
    }

    public final boolean zzL() throws RemoteException {
        if (this.f39387b instanceof Adapter) {
            return this.f39389d != null;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f39387b.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        co0.zzj(sb.toString());
        throw new RemoteException();
    }

    public final Bundle zze() {
        Object obj = this.f39387b;
        if (obj instanceof zzcqk) {
            return ((zzcqk) obj).zza();
        }
        String canonicalName = zzcqk.class.getCanonicalName();
        String canonicalName2 = this.f39387b.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        co0.zzj(sb.toString());
        return new Bundle();
    }

    public final Bundle zzf() {
        Object obj = this.f39387b;
        if (obj instanceof zzcql) {
            return ((zzcql) obj).getInterstitialAdapterInfo();
        }
        String canonicalName = zzcql.class.getCanonicalName();
        String canonicalName2 = this.f39387b.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        co0.zzj(sb.toString());
        return new Bundle();
    }

    public final Bundle zzg() {
        return new Bundle();
    }

    public final C7774hy zzh() {
        Object obj = this.f39387b;
        if (obj instanceof zzb) {
            try {
                return ((zzb) obj).getVideoController();
            } catch (Throwable th) {
                co0.zzh("", th);
            }
        }
        return null;
    }

    public final l40 zzi() {
        vd0 vd0 = this.f39388c;
        if (vd0 == null) {
            return null;
        }
        NativeCustomTemplateAd a = vd0.mo35412a();
        if (a instanceof m40) {
            return ((m40) a).mo33467a();
        }
        return null;
    }

    public final cd0 zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.f39395j;
        if (mediationInterscrollerAd != null) {
            return new ud0(mediationInterscrollerAd);
        }
        return null;
    }

    public final id0 zzk() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        UnifiedNativeAdMapper b;
        Object obj = this.f39387b;
        if (obj instanceof MediationNativeAdapter) {
            vd0 vd0 = this.f39388c;
            if (vd0 == null || (b = vd0.mo35413b()) == null) {
                return null;
            }
            return new de0(b);
        } else if (!(obj instanceof Adapter) || (unifiedNativeAdMapper = this.f39393h) == null) {
            return null;
        } else {
            return new de0(unifiedNativeAdMapper);
        }
    }

    public final zzcab zzl() {
        Object obj = this.f39387b;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzcab.m21323C0(((Adapter) obj).getVersionInfo());
    }

    public final zzcab zzm() {
        Object obj = this.f39387b;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzcab.m21323C0(((Adapter) obj).getSDKVersionInfo());
    }

    public final C10487a zzn() throws RemoteException {
        Object obj = this.f39387b;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return C10489b.m48195m6(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                co0.zzh("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            return C10489b.m48195m6(this.f39391f);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f39387b.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            co0.zzj(sb.toString());
            throw new RemoteException();
        }
    }

    public final void zzo() throws RemoteException {
        Object obj = this.f39387b;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                co0.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    public td0(MediationAdapter mediationAdapter) {
        this.f39387b = mediationAdapter;
    }
}
