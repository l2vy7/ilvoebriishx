package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import com.startapp.C12458z0;
import com.startapp.C5011i;
import com.startapp.C5014n9;
import com.startapp.C5015nb;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.C5073c;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import java.io.Serializable;
import java.util.Map;

/* renamed from: com.startapp.sdk.adsbase.Ad */
/* compiled from: Sta */
public abstract class C5041Ad implements Serializable {

    /* renamed from: b */
    public static boolean f22228b = false;
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public transient Context f22229a;
    public ActivityExtra activityExtra;
    public Long adCacheTtl = null;
    private AdInformationOverrides adInfoOverride;
    public boolean belowMinCPM = false;
    public ConsentData consentData;
    public String errorMessage;
    public Serializable extraData = null;
    private Long lastLoadTime = null;
    private NotDisplayedReason notDisplayedReason;
    public AdPreferences.Placement placement;
    private AdState state = AdState.UN_INITIALIZED;
    private AdType type;
    private boolean videoCancelCallBack;

    /* renamed from: com.startapp.sdk.adsbase.Ad$AdState */
    /* compiled from: Sta */
    public enum AdState {
        UN_INITIALIZED,
        PROCESSING,
        READY
    }

    /* renamed from: com.startapp.sdk.adsbase.Ad$AdType */
    /* compiled from: Sta */
    public enum AdType {
        INTERSTITIAL,
        RICH_TEXT,
        VIDEO,
        REWARDED_VIDEO,
        NON_VIDEO,
        VIDEO_NO_VAST
    }

    /* renamed from: com.startapp.sdk.adsbase.Ad$a */
    /* compiled from: Sta */
    public class C5042a implements AdEventListener {

        /* renamed from: a */
        public final /* synthetic */ AdEventListener f22230a;

        public C5042a(AdEventListener adEventListener) {
            this.f22230a = adEventListener;
        }

        public void onFailedToReceiveAd(C5041Ad ad) {
            C5011i.m22894a(C5041Ad.this.f22229a, this.f22230a, ad, false);
            String errorMessage = ad != null ? ad.getErrorMessage() : null;
            String str = "";
            if (errorMessage == null) {
                errorMessage = str;
            } else if (errorMessage.contains("204")) {
                errorMessage = "NO FILL";
            }
            Context context = C5041Ad.this.f22229a;
            StringBuilder a = C12458z0.m53804a("Failed to load ");
            if (ad != null) {
                str = C5015nb.m22907a(ad);
            }
            a.append(str);
            a.append(" ad: ");
            a.append(errorMessage);
            C5015nb.m22915a(context, 6, a.toString(), true);
        }

        public void onReceiveAd(C5041Ad ad) {
            C5041Ad.m23000a(C5041Ad.this, Long.valueOf(System.currentTimeMillis()));
            C5011i.m22895b(C5041Ad.this.f22229a, this.f22230a, ad, false);
            ConsentData consentData = ad.getConsentData();
            if (consentData != null) {
                ComponentLocator.m23305a(C5041Ad.this.f22229a).mo21219f().mo20652a(consentData.mo21072f(), consentData.mo21071e(), consentData.mo21061a(), false, true);
            }
            Context context = C5041Ad.this.f22229a;
            StringBuilder a = C12458z0.m53804a("Loaded ");
            a.append(C5015nb.m22907a(ad));
            a.append(" ad with creative ID - ");
            a.append(ad.getAdId());
            C5015nb.m22915a(context, 4, a.toString(), true);
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.Ad$b */
    /* compiled from: Sta */
    public class C5043b implements C5073c {

        /* renamed from: a */
        public final /* synthetic */ AdPreferences f22232a;

        /* renamed from: b */
        public final /* synthetic */ AdEventListener f22233b;

        public C5043b(AdPreferences adPreferences, AdEventListener adEventListener) {
            this.f22232a = adPreferences;
            this.f22233b = adEventListener;
        }

        /* renamed from: a */
        public void mo20651a(MetaDataRequest.RequestReason requestReason, boolean z) {
            C5041Ad.this.mo20839a(this.f22232a, this.f22233b);
        }

        /* renamed from: a */
        public void mo20650a(MetaDataRequest.RequestReason requestReason) {
            C5041Ad.this.mo20839a(this.f22232a, this.f22233b);
        }
    }

    public C5041Ad(Context context, AdPreferences.Placement placement2) {
        this.f22229a = context;
        this.placement = placement2;
        Map<Activity, Integer> map = C5015nb.f22145a;
        this.adInfoOverride = AdInformationOverrides.m23167a();
    }

    /* renamed from: a */
    public void mo20838a(NotDisplayedReason notDisplayedReason2) {
        this.notDisplayedReason = notDisplayedReason2;
    }

    /* renamed from: a */
    public abstract void mo20839a(AdPreferences adPreferences, AdEventListener adEventListener);

    /* renamed from: b */
    public Long mo20842b() {
        return this.lastLoadTime;
    }

    /* renamed from: c */
    public Long mo20843c() {
        long e = mo20845e();
        Long l = this.adCacheTtl;
        if (l != null) {
            e = Math.min(l.longValue(), e);
        }
        return Long.valueOf(e);
    }

    /* renamed from: d */
    public boolean mo20844d() {
        if (this.lastLoadTime != null && System.currentTimeMillis() - this.lastLoadTime.longValue() > mo20843c().longValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public long mo20845e() {
        return CacheMetaData.f22345a.mo21039a().mo21026a();
    }

    /* renamed from: f */
    public AdPreferences.Placement mo20846f() {
        return this.placement;
    }

    public abstract String getAdId();

    public AdInformationOverrides getAdInfoOverride() {
        return this.adInfoOverride;
    }

    public abstract String getBidToken();

    public final ConsentData getConsentData() {
        return this.consentData;
    }

    public Context getContext() {
        return this.f22229a;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Serializable getExtraData() {
        return this.extraData;
    }

    public NotDisplayedReason getNotDisplayedReason() {
        return this.notDisplayedReason;
    }

    public AdState getState() {
        return this.state;
    }

    public AdType getType() {
        return this.type;
    }

    public boolean isBelowMinCPM() {
        return this.belowMinCPM;
    }

    public boolean isReady() {
        return this.state == AdState.READY && !mo20844d();
    }

    @Deprecated
    public void load() {
        load(new AdPreferences(), (AdEventListener) null);
    }

    public void setActivityExtra(ActivityExtra activityExtra2) {
        this.activityExtra = activityExtra2;
    }

    public void setAdInfoOverride(AdInformationOverrides adInformationOverrides) {
        this.adInfoOverride = adInformationOverrides;
    }

    public void setContext(Context context) {
        this.f22229a = context;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setExtraData(Serializable serializable) {
        this.extraData = serializable;
    }

    public void setState(AdState adState) {
        this.state = adState;
    }

    @Deprecated
    public boolean show() {
        return false;
    }

    /* renamed from: a */
    public static void m23000a(C5041Ad ad, Long l) {
        ad.lastLoadTime = l;
    }

    @Deprecated
    public void load(AdEventListener adEventListener) {
        load(new AdPreferences(), adEventListener);
    }

    /* renamed from: a */
    public boolean mo20841a() {
        return this.videoCancelCallBack;
    }

    @Deprecated
    public void load(AdPreferences adPreferences) {
        load(adPreferences, (AdEventListener) null);
    }

    /* renamed from: a */
    public void mo20840a(boolean z) {
        this.videoCancelCallBack = z;
    }

    @Deprecated
    public void load(AdPreferences adPreferences, AdEventListener adEventListener) {
        load(adPreferences, adEventListener, true);
    }

    public boolean load(AdPreferences adPreferences, AdEventListener adEventListener, boolean z) {
        String str;
        boolean z2;
        C5042a aVar = new C5042a(adEventListener);
        if (!f22228b) {
            SimpleTokenUtils.m23087f(this.f22229a);
            f22228b = true;
        }
        if (this.state != AdState.UN_INITIALIZED) {
            str = "load() was already called.";
            z2 = true;
        } else {
            str = "";
            z2 = false;
        }
        if (!C5015nb.m22938g(this.f22229a)) {
            str = "network not available.";
            z2 = true;
        }
        if (!MetaData.f22407k.mo21188b()) {
            str = "serving ads disabled";
            z2 = true;
        }
        if (z2) {
            setErrorMessage("Ad wasn't loaded: " + str);
            C5011i.m22894a(this.f22229a, aVar, this, false);
            return false;
        }
        setState(AdState.PROCESSING);
        C5043b bVar = new C5043b(adPreferences, aVar);
        if (adPreferences.getType() != null) {
            this.type = adPreferences.getType();
        }
        MetaData.f22407k.mo21185a(this.f22229a, adPreferences, C5014n9.f22141d.f22144c, z, bVar, false);
        return true;
    }
}
