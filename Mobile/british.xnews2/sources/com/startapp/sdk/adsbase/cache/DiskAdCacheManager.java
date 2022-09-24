package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import android.content.Context;
import com.startapp.C11810c0;
import com.startapp.C11839d0;
import com.startapp.C12104o2;
import com.startapp.C12178s5;
import com.startapp.C12342t5;
import com.startapp.C5011i;
import com.startapp.C5015nb;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.ads.offerWall.offerWallJson.OfferWall3DAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.C5068d;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class DiskAdCacheManager {

    /* compiled from: Sta */
    public static class DiskCacheKey implements Serializable {
        private static final long serialVersionUID = 1;
        public AdPreferences adPreferences;
        private int numberOfLoadedAd;
        public AdPreferences.Placement placement;

        public DiskCacheKey(AdPreferences.Placement placement2, AdPreferences adPreferences2) {
            this.placement = placement2;
            this.adPreferences = adPreferences2;
        }

        /* renamed from: a */
        public int mo46164a() {
            return this.numberOfLoadedAd;
        }

        /* renamed from: a */
        public void mo46165a(int i) {
            this.numberOfLoadedAd = i;
        }
    }

    /* compiled from: Sta */
    public static class DiskCachedAd implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: ad */
        private C5068d f54539ad;
        private String html;

        public DiskCachedAd(C5068d dVar) {
            mo46167a(dVar);
            mo46169c();
        }

        /* renamed from: a */
        public C5068d mo46166a() {
            return this.f54539ad;
        }

        /* renamed from: b */
        public String mo46168b() {
            return this.html;
        }

        /* renamed from: c */
        public final void mo46169c() {
            C5068d dVar = this.f54539ad;
            if (dVar != null && (dVar instanceof HtmlAd)) {
                this.html = ((HtmlAd) dVar).mo20929j();
            }
        }

        /* renamed from: a */
        public final void mo46167a(C5068d dVar) {
            this.f54539ad = dVar;
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.cache.DiskAdCacheManager$a */
    /* compiled from: Sta */
    public interface C12263a {
    }

    /* renamed from: com.startapp.sdk.adsbase.cache.DiskAdCacheManager$b */
    /* compiled from: Sta */
    public interface C12264b {
    }

    /* renamed from: com.startapp.sdk.adsbase.cache.DiskAdCacheManager$c */
    /* compiled from: Sta */
    public interface C12265c {
    }

    /* renamed from: a */
    public static void m53189a(Context context, AdEventListener adEventListener) {
        C5011i.m22894a(context, adEventListener, (C5041Ad) null, true);
    }

    /* renamed from: b */
    public static String m53191b() {
        return "startapp_ads".concat(File.separator).concat("keys");
    }

    /* renamed from: a */
    public static String m53188a() {
        return "startapp_ads".concat(File.separator).concat("interstitials");
    }

    /* renamed from: a */
    public static void m53190a(Context context, DiskCachedAd diskCachedAd, C12263a aVar, AdEventListener adEventListener) {
        C5068d a = diskCachedAd.mo46166a();
        a.setContext(context);
        Map<Activity, Integer> map = C5015nb.f22145a;
        boolean z = true;
        if (a instanceof InterstitialAd) {
            InterstitialAd interstitialAd = (InterstitialAd) a;
            String b = diskCachedAd.mo46168b();
            if (b == null || b.equals("")) {
                m53189a(context, adEventListener);
                return;
            }
            if (AdsCommonMetaData.f22242h.mo20878H()) {
                List<AppPresenceDetails> a2 = C11839d0.m52130a(b, 0);
                ArrayList arrayList = new ArrayList();
                if (C11839d0.m52128a(context, a2, 0, (Set<String>) new HashSet(), (List<AppPresenceDetails>) arrayList).booleanValue()) {
                    new C11810c0(context, arrayList).mo45177a();
                    z = false;
                }
            }
            if (!z) {
                m53189a(context, adEventListener);
                return;
            }
            C5059d dVar = C5059d.f22346h;
            dVar.f22348b.put(interstitialAd.mo20930k(), b);
            ((C12271g) aVar).f54548a.f22368e = interstitialAd;
            ComponentLocator.m23305a(context).f22436b.mo46698b().mo45224a(b, new C12104o2(context, adEventListener, interstitialAd));
        } else if (a instanceof OfferWall3DAd) {
            OfferWall3DAd offerWall3DAd = (OfferWall3DAd) a;
            List<AdDetails> g = offerWall3DAd.mo46103g();
            if (g == null) {
                m53189a(context, adEventListener);
                return;
            }
            if (AdsCommonMetaData.f22242h.mo20878H()) {
                g = C11839d0.m52129a(context, g, 0, (Set<String>) new HashSet(), true);
            }
            if (g.size() > 0) {
                ((C12271g) aVar).f54548a.f22368e = offerWall3DAd;
                C12178s5 a3 = C12342t5.f54758b.mo46637a(offerWall3DAd.mo45939h());
                a3.getClass();
                a3.f54141b = new ArrayList();
                a3.f54142c = "";
                for (AdDetails a4 : g) {
                    a3.mo45747a(a4);
                }
                C5011i.m22895b(context, adEventListener, offerWall3DAd, true);
                return;
            }
            m53189a(context, adEventListener);
        } else {
            m53189a(context, adEventListener);
        }
    }
}
