package com.startapp.sdk.ads.nativead;

import android.content.Context;
import com.startapp.C12458z0;
import com.startapp.C5002c;
import com.startapp.C5003d;
import com.startapp.C5011i;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Sta */
public class StartAppNativeAd extends C5041Ad {
    private static final long serialVersionUID = 1;
    private C12205b adEventDelegate;
    public boolean isLoading = false;
    private List<NativeAdDetails> listNativeAds = new ArrayList();
    private NativeAd nativeAd;
    private NativeAdPreferences preferences;

    /* compiled from: Sta */
    public enum CampaignAction {
        LAUNCH_APP,
        OPEN_MARKET
    }

    /* renamed from: com.startapp.sdk.ads.nativead.StartAppNativeAd$a */
    /* compiled from: Sta */
    public class C12204a implements Runnable {

        /* renamed from: a */
        public int f54267a;

        /* renamed from: b */
        public final /* synthetic */ int f54268b;

        public C12204a(int i) {
            this.f54268b = i;
        }

        public void run() {
            int i = this.f54267a + 1;
            this.f54267a = i;
            if (i == this.f54268b) {
                StartAppNativeAd.this.mo45932i();
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.nativead.StartAppNativeAd$b */
    /* compiled from: Sta */
    public class C12205b implements AdEventListener {

        /* renamed from: a */
        public AdEventListener f54270a;

        public C12205b(AdEventListener adEventListener) {
            this.f54270a = adEventListener;
        }

        public void onFailedToReceiveAd(C5041Ad ad) {
            if (ad != null) {
                StartAppNativeAd.this.setErrorMessage(ad.getErrorMessage());
            }
            AdEventListener adEventListener = this.f54270a;
            if (adEventListener != null) {
                StartAppNativeAd startAppNativeAd = StartAppNativeAd.this;
                C5011i.m22894a(startAppNativeAd.f22229a, adEventListener, startAppNativeAd, false);
                this.f54270a = null;
            }
            StartAppNativeAd.this.isLoading = false;
        }

        public void onReceiveAd(C5041Ad ad) {
            StartAppNativeAd.this.mo45931h();
        }
    }

    public StartAppNativeAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_NATIVE);
    }

    public static String getPrivacyImageUrl() {
        return AdInformationMetaData.f54504a.mo46123c();
    }

    public static String getPrivacyURL() {
        if (AdInformationMetaData.f54504a.mo46122b() == null) {
            return "";
        }
        String b = AdInformationMetaData.f54504a.mo46122b();
        if (b.contains("http://") || b.contains("https://")) {
            return AdInformationMetaData.f54504a.mo46122b();
        }
        StringBuilder a = C12458z0.m53804a("https://");
        a.append(AdInformationMetaData.f54504a.mo46122b());
        return a.toString();
    }

    /* renamed from: a */
    public void mo20839a(AdPreferences adPreferences, AdEventListener adEventListener) {
    }

    /* renamed from: g */
    public final AdDetails mo45927g() {
        NativeAdDetails nativeAdDetails;
        if (this.listNativeAds.size() <= 0 || (nativeAdDetails = this.listNativeAds.get(0)) == null) {
            return null;
        }
        return nativeAdDetails.f22201a;
    }

    public String getAdId() {
        AdDetails g = mo45927g();
        if (g != null) {
            return g.mo46244a();
        }
        return null;
    }

    public String getBidToken() {
        AdDetails g = mo45927g();
        if (g != null) {
            return g.mo46247d();
        }
        return null;
    }

    public ArrayList<NativeAdDetails> getNativeAds() {
        return getNativeAds((String) null);
    }

    public int getNumberOfAds() {
        return this.listNativeAds.size();
    }

    /* renamed from: h */
    public void mo45931h() {
        List<AdDetails> g;
        int size;
        NativeAd nativeAd2 = this.nativeAd;
        if (nativeAd2 == null || (g = nativeAd2.mo46103g()) == null || (size = g.size()) <= 0) {
            mo45932i();
            return;
        }
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new NativeAdDetails(g.get(i)));
        }
        this.listNativeAds = arrayList;
        NativeAdPreferences nativeAdPreferences = this.preferences;
        if (nativeAdPreferences == null || !nativeAdPreferences.isAutoBitmapDownload()) {
            mo45932i();
            return;
        }
        C12204a aVar = new C12204a(size);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((NativeAdDetails) it.next()).loadImages(this.f22229a, aVar);
        }
    }

    /* renamed from: i */
    public final void mo45932i() {
        this.isLoading = false;
        setErrorMessage((String) null);
        C12205b bVar = this.adEventDelegate;
        if (bVar != null) {
            C5011i.m22895b(this.f22229a, bVar.f54270a, this, false);
        }
    }

    public boolean isBelowMinCPM() {
        return this.nativeAd.isBelowMinCPM();
    }

    public boolean loadAd() {
        return loadAd(new NativeAdPreferences(), (AdEventListener) null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n===== StartAppNativeAd =====\n");
        for (int i = 0; i < getNumberOfAds(); i++) {
            sb.append(this.listNativeAds.get(i));
        }
        sb.append("===== End StartAppNativeAd =====");
        return sb.toString();
    }

    public ArrayList<NativeAdDetails> getNativeAds(String str) {
        ArrayList<NativeAdDetails> arrayList = new ArrayList<>();
        AdRulesResult a = AdaptMetaData.f54531a.mo46145a().mo21019a(AdPreferences.Placement.INAPP_NATIVE, str);
        if (a.mo21025b()) {
            for (NativeAdDetails next : this.listNativeAds) {
                next.f22206f = str;
                arrayList.add(next);
            }
            C5003d.f22119d.mo20659a(new C5002c(AdPreferences.Placement.INAPP_NATIVE, str));
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (NativeAdDetails nativeAdDetails : this.listNativeAds) {
                arrayList2.add(nativeAdDetails.f22201a);
            }
            C5055a.m23154a(C5055a.m23160a((List<AdDetails>) arrayList2), str, 0, a.mo21024a());
        }
        return arrayList;
    }

    public boolean loadAd(AdEventListener adEventListener) {
        return loadAd(new NativeAdPreferences(), adEventListener);
    }

    public boolean loadAd(NativeAdPreferences nativeAdPreferences) {
        return loadAd(nativeAdPreferences, (AdEventListener) null);
    }

    public boolean loadAd(NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        this.adEventDelegate = new C12205b(adEventListener);
        this.preferences = nativeAdPreferences;
        if (this.isLoading) {
            setErrorMessage("Ad is currently being loaded");
            return false;
        }
        this.isLoading = true;
        NativeAd nativeAd2 = new NativeAd(this.f22229a, nativeAdPreferences);
        this.nativeAd = nativeAd2;
        return nativeAd2.load(nativeAdPreferences, this.adEventDelegate, true);
    }
}
