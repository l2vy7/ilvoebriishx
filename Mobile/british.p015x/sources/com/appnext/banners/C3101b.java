package com.appnext.banners;

import android.content.Context;
import android.util.Pair;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextAd;
import com.appnext.core.C3148Ad;
import com.appnext.core.C3164a;
import com.appnext.core.C3180d;
import com.appnext.core.C3198g;
import com.appnext.core.C3201h;
import com.appnext.core.SettingsManager;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.appnext.banners.b */
final class C3101b extends C3180d {

    /* renamed from: bC */
    private static C3101b f12180bC;

    /* renamed from: r */
    private final int f12181r = 50;

    private C3101b() {
    }

    /* renamed from: H */
    public static synchronized C3101b m10528H() {
        C3101b bVar;
        synchronized (C3101b.class) {
            if (f12180bC == null) {
                f12180bC = new C3101b();
            }
            bVar = f12180bC;
        }
        return bVar;
    }

    /* renamed from: b */
    static boolean m10531b(AppnextAd appnextAd) {
        try {
            return !appnextAd.getWideImageURL().equals("");
        } catch (Throwable th) {
            C3117a.m10553a("BannerAdsManager$hasWideImage", th);
            return false;
        }
    }

    static boolean hasVideo(AppnextAd appnextAd) {
        try {
            return !appnextAd.getVideoUrl().equals("") || !appnextAd.getVideoUrlHigh().equals("") || !appnextAd.getVideoUrl30Sec().equals("") || !appnextAd.getVideoUrlHigh30Sec().equals("");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo10233a(Context context, C3148Ad ad, String str, ArrayList<Pair<String, String>> arrayList) {
        StringBuilder sb = new StringBuilder("&auid=");
        sb.append(ad != null ? ad.getAUID() : "1000");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10234a(Context context, C3148Ad ad, C3164a aVar) {
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
    /* renamed from: c */
    public final SettingsManager mo10240c(C3148Ad ad) {
        return C3103d.m10544I();
    }

    /* renamed from: e */
    public final ArrayList<AppnextAd> mo10505e(C3148Ad ad) {
        return mo10779j(ad).getAds();
    }

    /* renamed from: a */
    public final void mo10504a(Context context, C3148Ad ad, String str, C3180d.C3185a aVar, BannerAdRequest bannerAdRequest) {
        ((BannerAd) ad).setAdRequest(new BannerAdRequest(bannerAdRequest));
        super.mo10769a(context, ad, str, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10229a(Context context, C3201h hVar) {
        try {
            BannerAdData bannerAdData = new BannerAdData((AppnextAd) hVar);
            int a = m10529a(context, bannerAdData);
            if (a != 0) {
                return a;
            }
            if (bannerAdData.getCampaignGoal().equals("new") && C3198g.m10789b(context, bannerAdData.getAdPackage())) {
                return 2;
            }
            if (!bannerAdData.getCampaignGoal().equals("existing") || C3198g.m10789b(context, bannerAdData.getAdPackage())) {
                return 0;
            }
            return 1;
        } catch (Throwable th) {
            C3117a.m10553a("BannerAdsManager$radFilter", th);
            return 1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo10503a(Context context, C3148Ad ad, ArrayList<?> arrayList, String str, ArrayList<String> arrayList2) {
        if (arrayList == null) {
            return null;
        }
        Iterator<?> it = arrayList.iterator();
        while (it.hasNext()) {
            AppnextAd appnextAd = (AppnextAd) it.next();
            try {
                if (m10530a(ad, appnextAd, str)) {
                    appnextAd.getBannerID();
                    ad.getPlacementID();
                    if (!arrayList2.contains(appnextAd.getBannerID())) {
                        return appnextAd;
                    }
                } else {
                    continue;
                }
            } catch (Throwable th) {
                C3117a.m10553a("BannerAdsManager$getFirst", th);
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo10502a(Context context, C3148Ad ad, ArrayList<?> arrayList, String str) {
        return mo10503a(context, ad, arrayList, str, (ArrayList<String>) new ArrayList());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo10501a(Context context, C3148Ad ad, String str) {
        ArrayList<?> ads;
        try {
            if (mo10779j(ad) == null || (ads = mo10779j(ad).getAds()) == null) {
                return null;
            }
            return mo10502a(context, ad, ads, str);
        } catch (Throwable th) {
            C3117a.m10553a("BannerAdsManager$getFirst", th);
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m10530a(C3148Ad ad, AppnextAd appnextAd, String str) {
        try {
            if (ad instanceof MediumRectangleAd) {
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -892481938) {
                    if (hashCode != 96673) {
                        if (hashCode == 112202875) {
                            if (str.equals("video")) {
                                c = 2;
                            }
                        }
                    } else if (str.equals("all")) {
                        c = 0;
                    }
                } else if (str.equals("static")) {
                    c = 1;
                }
                if (c == 0) {
                    return m10531b(appnextAd) || hasVideo(appnextAd);
                }
                if (c == 1) {
                    return m10531b(appnextAd);
                }
                if (c != 2) {
                    return false;
                }
                return hasVideo(appnextAd);
            }
        } catch (Throwable th) {
            C3117a.m10553a("BannerAdsManager$checkCreative", th);
            return false;
        }
    }

    /* renamed from: a */
    private static int m10529a(Context context, BannerAdData bannerAdData) {
        try {
            if (!bannerAdData.getCptList().equals("") && !bannerAdData.getCptList().equals("[]")) {
                JSONArray jSONArray = new JSONArray(bannerAdData.getCptList());
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (C3198g.m10789b(context, jSONArray.getString(i))) {
                        return 0;
                    }
                }
                return 3;
            }
        } catch (JSONException e) {
            C3117a.m10553a("BannerAdsManager$checkCreative", e);
        } catch (Throwable th) {
            C3117a.m10553a("BannerAdsManager$checkCreative", th);
            return 3;
        }
        return 0;
    }
}
