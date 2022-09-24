package com.appnext.ads.interstitial;

import android.content.Context;
import android.util.Pair;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextAd;
import com.appnext.core.C3148Ad;
import com.appnext.core.C3164a;
import com.appnext.core.C3175b;
import com.appnext.core.C3180d;
import com.appnext.core.C3198g;
import com.appnext.core.C3201h;
import com.appnext.core.SettingsManager;
import com.appnext.core.webview.AppnextWebView;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.appnext.ads.interstitial.a */
public final class C3061a extends C3180d {

    /* renamed from: aJ */
    private static C3061a f12111aJ;

    /* renamed from: aq */
    private String f12112aq;

    private C3061a() {
    }

    /* renamed from: A */
    public static synchronized C3061a m10493A() {
        C3061a aVar;
        synchronized (C3061a.class) {
            if (f12111aJ == null) {
                f12111aJ = new C3061a();
            }
            aVar = f12111aJ;
        }
        return aVar;
    }

    private static boolean hasVideo(AppnextAd appnextAd) {
        return !appnextAd.getVideoUrl().equals("") || !appnextAd.getVideoUrlHigh().equals("") || !appnextAd.getVideoUrl30Sec().equals("") || !appnextAd.getVideoUrlHigh30Sec().equals("");
    }

    /* renamed from: a */
    public final void mo10380a(Context context, C3148Ad ad, String str, C3180d.C3185a aVar, String str2) {
        try {
            this.f12112aq = str2;
            super.mo10769a(context, ad, str, aVar);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10235a(C3148Ad ad, String str, String str2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> void mo10237a(String str, C3148Ad ad, T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final ArrayList<AppnextAd> mo10381b(Context context, C3148Ad ad, String str) {
        ArrayList<?> ads;
        AppnextAd a;
        if (mo10779j(ad) == null || (ads = mo10779j(ad).getAds()) == null || (a = mo10378a(context, (ArrayList<AppnextAd>) ads, str, ad)) == null) {
            return null;
        }
        ads.remove(a);
        ads.add(0, a);
        return ads;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final SettingsManager mo10240c(C3148Ad ad) {
        return C3063c.m10511C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo10382f(C3148Ad ad) {
        return mo10777h(ad) && mo10779j(ad).getAds() != null && mo10779j(ad).getAds().size() > 0 && mo10779j(ad).mo10737am().longValue() + DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS > System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo10383g(C3148Ad ad) {
        if (ad != null) {
            try {
                mo10774ao().remove(new C3175b(ad));
            } catch (Throwable th) {
                C3117a.m10553a("InterstitialAdsManager$CleanContainer", th);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo10233a(Context context, C3148Ad ad, String str, ArrayList<Pair<String, String>> arrayList) {
        Integer num;
        String str2;
        try {
            StringBuilder sb = new StringBuilder("&auid=");
            sb.append(ad != null ? ad.getAUID() : "600");
            sb.append("&vidmin=");
            sb.append(ad == null ? "" : Integer.valueOf(ad.getMinVideoLength()));
            sb.append("&vidmax=");
            if (ad == null) {
                num = "";
            } else {
                num = Integer.valueOf(ad.getMaxVideoLength());
            }
            sb.append(num);
            if (this.f12112aq.equals("static")) {
                str2 = "&creative=0";
            } else {
                str2 = "";
            }
            sb.append(str2);
            return sb.toString();
        } catch (Throwable th) {
            C3117a.m10553a("InterstitialAdsManager$urlSuffix", th);
            return "";
        }
    }

    /* renamed from: b */
    private static boolean m10496b(AppnextAd appnextAd) {
        return !appnextAd.getWideImageURL().equals("");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10234a(Context context, C3148Ad ad, C3164a aVar) throws Exception {
        try {
            AppnextWebView.m10952t(context).mo10885a(((Interstitial) ad).getPageUrl(), (AppnextWebView.C3257c) null);
        } catch (Throwable th) {
            C3117a.m10553a("InterstitialAdsManager$customAdLoad", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10229a(Context context, C3201h hVar) {
        int i;
        try {
            InterstitialAd interstitialAd = new InterstitialAd((AppnextAd) hVar);
            if (!interstitialAd.getCampaignGoal().equals("new") || !C3198g.m10789b(context, interstitialAd.getAdPackage())) {
                i = (!interstitialAd.getCampaignGoal().equals("existing") || C3198g.m10789b(context, interstitialAd.getAdPackage())) ? 0 : 2;
            } else {
                i = 1;
            }
            int a = m10494a(context, (AppnextAd) hVar);
            if (i == 0 && a == 0) {
                return 0;
            }
            return i != 0 ? i : a;
        } catch (Throwable th) {
            C3117a.m10553a("InterstitialAdsManager$adFilter", th);
            return 3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo10379a(ArrayList<AppnextAd> arrayList) {
        return super.mo10379a(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10236a(String str, C3148Ad ad) {
        super.mo10236a(str, ad);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo10378a(Context context, ArrayList<AppnextAd> arrayList, String str, C3148Ad ad) {
        Iterator<AppnextAd> it = arrayList.iterator();
        while (it.hasNext()) {
            AppnextAd next = it.next();
            if (m10495a(next, str, ad)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m10495a(AppnextAd appnextAd, String str, C3148Ad ad) {
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != -892481938) {
                if (hashCode != 112202875) {
                    if (hashCode == 835260319) {
                        if (str.equals(Interstitial.TYPE_MANAGED)) {
                            c = 0;
                        }
                    }
                } else if (str.equals("video")) {
                    c = 1;
                }
            } else if (str.equals("static")) {
                c = 2;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c == 2) {
                        if (m10496b(appnextAd)) {
                            appnextAd.getBannerID();
                            ad.getPlacementID();
                            return true;
                        }
                    }
                } else if (hasVideo(appnextAd)) {
                    appnextAd.getBannerID();
                    ad.getPlacementID();
                    return true;
                }
            } else if (m10496b(appnextAd) || hasVideo(appnextAd)) {
                appnextAd.getBannerID();
                ad.getPlacementID();
                return true;
            }
        } catch (Throwable th) {
            C3117a.m10553a("InterstitialAdsManager$isMatchToCreativeAndNotShown", th);
        }
        return false;
    }

    /* renamed from: a */
    private static int m10494a(Context context, AppnextAd appnextAd) {
        try {
            InterstitialAd interstitialAd = new InterstitialAd(appnextAd);
            if (!interstitialAd.getCptList().equals("")) {
                if (!interstitialAd.getCptList().equals("[]")) {
                    JSONArray jSONArray = new JSONArray(interstitialAd.getCptList());
                    for (int i = 0; i < jSONArray.length(); i++) {
                        if (C3198g.m10789b(context, jSONArray.getString(i))) {
                            return 0;
                        }
                    }
                    return 3;
                }
            }
            return 0;
        } catch (JSONException e) {
            C3117a.m10553a("InterstitialAdsManager$checkCPT", e);
            return 0;
        }
    }
}
