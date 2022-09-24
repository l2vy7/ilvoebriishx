package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import com.startapp.C11882e4;
import com.startapp.C5004d4;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import com.startapp.C5126w2;
import com.startapp.sdk.adsbase.adrules.AdRules;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class AdsCommonMetaData implements Serializable {

    /* renamed from: a */
    public static transient Object f22235a = new Object();

    /* renamed from: b */
    public static final Integer f22236b = 18;

    /* renamed from: c */
    public static final Integer f22237c = -1;

    /* renamed from: d */
    public static final Set<String> f22238d = new HashSet(Arrays.asList(new String[]{"BOLD"}));

    /* renamed from: e */
    public static final Integer f22239e = -16777216;

    /* renamed from: f */
    public static final Integer f22240f = -14803426;

    /* renamed from: g */
    public static final Integer f22241g = -1;

    /* renamed from: h */
    public static AdsCommonMetaData f22242h = new AdsCommonMetaData();
    private static final long serialVersionUID = -4342481322424952690L;
    private String acMetadataUpdateVersion = "4.10.2";
    @C5010hb(complex = true)
    private AdRules adRules = new AdRules();
    private boolean appPresence = true;
    private boolean autoInterstitialEnabled = true;
    private Integer backgroundGradientBottom = -14606047;
    private Integer backgroundGradientTop = -14606047;
    private int defaultActivitiesBetweenAds = 1;
    private int defaultSecondsBetweenAds = 0;
    private boolean disableInAppStore = false;
    private boolean disableReturnAd = false;
    private boolean disableSplashAd = false;
    private boolean disableTwoClicks = false;
    private boolean enableForceExternalBrowser = false;
    private boolean enableSmartRedirect = true;
    private boolean enforceForeground = false;
    private Long explicitLoadIntervalMillis;
    private int forceExternalBrowserDaysInterval = 7;
    private Integer fullpageOfferWallProbability = 100;
    private Integer fullpageOverlayProbability = 0;
    private Integer homeProbability3D = 80;
    private Integer itemDescriptionTextColor = MetaDataStyle.f54663e;
    @C5010hb(type = HashSet.class)
    private Set<String> itemDescriptionTextDecoration = MetaDataStyle.f54664f;
    private Integer itemDescriptionTextSize = MetaDataStyle.f54662d;
    private Integer itemGradientBottom = -8750199;
    private Integer itemGradientTop = -14014151;
    private Integer itemTitleTextColor = MetaDataStyle.f54660b;
    @C5010hb(type = HashSet.class)
    private Set<String> itemTitleTextDecoration = MetaDataStyle.f54661c;
    private Integer itemTitleTextSize = MetaDataStyle.f54659a;
    private Integer maxAds = 10;
    private Integer poweredByBackgroundColor = f22240f;
    private Integer poweredByTextColor = f22241g;
    private Integer probability3D = 0;
    private long returnAdMinBackgroundTime = 300;
    private long smartRedirectLoadedTimeout = 1000;
    private int smartRedirectTimeout = 5;
    @C5010hb(type = HashMap.class, value = MetaDataStyle.class)
    private HashMap<String, MetaDataStyle> templates = new HashMap<>();
    private Integer titleBackgroundColor = -14803426;
    private String titleContent = "Recommended for you";
    private Integer titleLineColor = f22239e;
    private Integer titleTextColor = f22237c;
    @C5010hb(type = HashSet.class)
    private Set<String> titleTextDecoration = f22238d;
    private Integer titleTextSize = f22236b;
    @C5010hb(complex = true)
    private VideoConfig video = new VideoConfig();

    /* renamed from: a */
    public static void m23012a(Context context) {
        AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) C5126w2.m23386a(context, "StartappAdsMetadata", AdsCommonMetaData.class);
        AdsCommonMetaData adsCommonMetaData2 = new AdsCommonMetaData();
        if (adsCommonMetaData != null) {
            boolean b = C5015nb.m22930b(adsCommonMetaData, adsCommonMetaData2);
            if (!(!"4.10.2".equals(adsCommonMetaData.acMetadataUpdateVersion)) && b) {
                C5004d4 d4Var = new C5004d4(C11882e4.f52886e);
                d4Var.f22126d = "metadata_null";
                d4Var.mo20661a();
            }
            AdRules adRules2 = adsCommonMetaData.adRules;
            adRules2.getClass();
            adRules2.f22338a = new HashSet();
            f22242h = adsCommonMetaData;
            return;
        }
        f22242h = adsCommonMetaData2;
    }

    /* renamed from: k */
    public static AdsCommonMetaData m23014k() {
        return f22242h;
    }

    /* renamed from: A */
    public Integer mo20871A() {
        return this.titleBackgroundColor;
    }

    /* renamed from: B */
    public String mo20872B() {
        return this.titleContent;
    }

    /* renamed from: C */
    public Integer mo20873C() {
        return this.titleLineColor;
    }

    /* renamed from: D */
    public Integer mo20874D() {
        return this.titleTextColor;
    }

    /* renamed from: E */
    public Set<String> mo20875E() {
        return this.titleTextDecoration;
    }

    /* renamed from: F */
    public Integer mo20876F() {
        return this.titleTextSize;
    }

    /* renamed from: G */
    public VideoConfig mo20877G() {
        return this.video;
    }

    /* renamed from: H */
    public boolean mo20878H() {
        return this.appPresence;
    }

    /* renamed from: I */
    public boolean mo20879I() {
        return this.autoInterstitialEnabled;
    }

    /* renamed from: J */
    public boolean mo20880J() {
        return this.disableInAppStore;
    }

    /* renamed from: K */
    public boolean mo20881K() {
        return this.disableReturnAd;
    }

    /* renamed from: L */
    public boolean mo20882L() {
        return this.disableSplashAd;
    }

    /* renamed from: M */
    public boolean mo20883M() {
        return this.disableTwoClicks;
    }

    /* renamed from: N */
    public boolean mo20884N() {
        return this.enableSmartRedirect;
    }

    /* renamed from: O */
    public boolean mo20885O() {
        return this.enforceForeground;
    }

    /* renamed from: b */
    public AdRules mo20888b() {
        return this.adRules;
    }

    /* renamed from: c */
    public int mo20889c() {
        return this.backgroundGradientBottom.intValue();
    }

    /* renamed from: d */
    public int mo20890d() {
        return this.backgroundGradientTop.intValue();
    }

    /* renamed from: e */
    public int mo20891e() {
        return this.forceExternalBrowserDaysInterval;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) obj;
        if (this.returnAdMinBackgroundTime != adsCommonMetaData.returnAdMinBackgroundTime || this.disableReturnAd != adsCommonMetaData.disableReturnAd || this.disableSplashAd != adsCommonMetaData.disableSplashAd || this.smartRedirectTimeout != adsCommonMetaData.smartRedirectTimeout || this.smartRedirectLoadedTimeout != adsCommonMetaData.smartRedirectLoadedTimeout || this.enableSmartRedirect != adsCommonMetaData.enableSmartRedirect || this.autoInterstitialEnabled != adsCommonMetaData.autoInterstitialEnabled || this.defaultActivitiesBetweenAds != adsCommonMetaData.defaultActivitiesBetweenAds || this.defaultSecondsBetweenAds != adsCommonMetaData.defaultSecondsBetweenAds || this.disableTwoClicks != adsCommonMetaData.disableTwoClicks || this.appPresence != adsCommonMetaData.appPresence || this.disableInAppStore != adsCommonMetaData.disableInAppStore || this.forceExternalBrowserDaysInterval != adsCommonMetaData.forceExternalBrowserDaysInterval || this.enableForceExternalBrowser != adsCommonMetaData.enableForceExternalBrowser || this.enforceForeground != adsCommonMetaData.enforceForeground || !C5015nb.m22922a(this.acMetadataUpdateVersion, adsCommonMetaData.acMetadataUpdateVersion) || !C5015nb.m22922a(this.probability3D, adsCommonMetaData.probability3D) || !C5015nb.m22922a(this.homeProbability3D, adsCommonMetaData.homeProbability3D) || !C5015nb.m22922a(this.fullpageOfferWallProbability, adsCommonMetaData.fullpageOfferWallProbability) || !C5015nb.m22922a(this.fullpageOverlayProbability, adsCommonMetaData.fullpageOverlayProbability) || !C5015nb.m22922a(this.backgroundGradientTop, adsCommonMetaData.backgroundGradientTop) || !C5015nb.m22922a(this.backgroundGradientBottom, adsCommonMetaData.backgroundGradientBottom) || !C5015nb.m22922a(this.maxAds, adsCommonMetaData.maxAds) || !C5015nb.m22922a(this.explicitLoadIntervalMillis, adsCommonMetaData.explicitLoadIntervalMillis) || !C5015nb.m22922a(this.titleBackgroundColor, adsCommonMetaData.titleBackgroundColor) || !C5015nb.m22922a(this.titleContent, adsCommonMetaData.titleContent) || !C5015nb.m22922a(this.titleTextSize, adsCommonMetaData.titleTextSize) || !C5015nb.m22922a(this.titleTextColor, adsCommonMetaData.titleTextColor) || !C5015nb.m22922a(this.titleTextDecoration, adsCommonMetaData.titleTextDecoration) || !C5015nb.m22922a(this.titleLineColor, adsCommonMetaData.titleLineColor) || !C5015nb.m22922a(this.itemGradientTop, adsCommonMetaData.itemGradientTop) || !C5015nb.m22922a(this.itemGradientBottom, adsCommonMetaData.itemGradientBottom) || !C5015nb.m22922a(this.itemTitleTextSize, adsCommonMetaData.itemTitleTextSize) || !C5015nb.m22922a(this.itemTitleTextColor, adsCommonMetaData.itemTitleTextColor) || !C5015nb.m22922a(this.itemTitleTextDecoration, adsCommonMetaData.itemTitleTextDecoration) || !C5015nb.m22922a(this.itemDescriptionTextSize, adsCommonMetaData.itemDescriptionTextSize) || !C5015nb.m22922a(this.itemDescriptionTextColor, adsCommonMetaData.itemDescriptionTextColor) || !C5015nb.m22922a(this.itemDescriptionTextDecoration, adsCommonMetaData.itemDescriptionTextDecoration) || !C5015nb.m22922a(this.templates, adsCommonMetaData.templates) || !C5015nb.m22922a(this.adRules, adsCommonMetaData.adRules) || !C5015nb.m22922a(this.poweredByBackgroundColor, adsCommonMetaData.poweredByBackgroundColor) || !C5015nb.m22922a(this.poweredByTextColor, adsCommonMetaData.poweredByTextColor) || !C5015nb.m22922a(this.video, adsCommonMetaData.video)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int mo20893f() {
        return this.defaultActivitiesBetweenAds;
    }

    /* renamed from: g */
    public int mo20894g() {
        return this.defaultSecondsBetweenAds;
    }

    /* renamed from: h */
    public Long mo20895h() {
        return this.explicitLoadIntervalMillis;
    }

    public int hashCode() {
        Object[] objArr = {this.acMetadataUpdateVersion, this.probability3D, this.homeProbability3D, this.fullpageOfferWallProbability, this.fullpageOverlayProbability, this.backgroundGradientTop, this.backgroundGradientBottom, this.maxAds, this.explicitLoadIntervalMillis, this.titleBackgroundColor, this.titleContent, this.titleTextSize, this.titleTextColor, this.titleTextDecoration, this.titleLineColor, this.itemGradientTop, this.itemGradientBottom, this.itemTitleTextSize, this.itemTitleTextColor, this.itemTitleTextDecoration, this.itemDescriptionTextSize, this.itemDescriptionTextColor, this.itemDescriptionTextDecoration, this.templates, this.adRules, this.poweredByBackgroundColor, this.poweredByTextColor, Long.valueOf(this.returnAdMinBackgroundTime), Boolean.valueOf(this.disableReturnAd), Boolean.valueOf(this.disableSplashAd), Integer.valueOf(this.smartRedirectTimeout), Long.valueOf(this.smartRedirectLoadedTimeout), Boolean.valueOf(this.enableSmartRedirect), Boolean.valueOf(this.autoInterstitialEnabled), Integer.valueOf(this.defaultActivitiesBetweenAds), Integer.valueOf(this.defaultSecondsBetweenAds), Boolean.valueOf(this.disableTwoClicks), Boolean.valueOf(this.appPresence), Boolean.valueOf(this.disableInAppStore), this.video, Integer.valueOf(this.forceExternalBrowserDaysInterval), Boolean.valueOf(this.enableForceExternalBrowser), Boolean.valueOf(this.enforceForeground)};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: i */
    public int mo20897i() {
        return this.fullpageOfferWallProbability.intValue();
    }

    /* renamed from: j */
    public int mo20898j() {
        return this.fullpageOverlayProbability.intValue();
    }

    /* renamed from: l */
    public Integer mo20899l() {
        return this.itemDescriptionTextColor;
    }

    /* renamed from: m */
    public Set<String> mo20900m() {
        return this.itemDescriptionTextDecoration;
    }

    /* renamed from: n */
    public Integer mo20901n() {
        return this.itemDescriptionTextSize;
    }

    /* renamed from: o */
    public int mo20902o() {
        return this.itemGradientBottom.intValue();
    }

    /* renamed from: p */
    public int mo20903p() {
        return this.itemGradientTop.intValue();
    }

    /* renamed from: q */
    public Integer mo20904q() {
        return this.itemTitleTextColor;
    }

    /* renamed from: r */
    public Set<String> mo20905r() {
        return this.itemTitleTextDecoration;
    }

    /* renamed from: s */
    public Integer mo20906s() {
        return this.itemTitleTextSize;
    }

    /* renamed from: t */
    public int mo20907t() {
        return this.maxAds.intValue();
    }

    /* renamed from: u */
    public Integer mo20908u() {
        return this.poweredByBackgroundColor;
    }

    /* renamed from: v */
    public Integer mo20909v() {
        return this.poweredByTextColor;
    }

    /* renamed from: w */
    public int mo20910w() {
        return this.probability3D.intValue();
    }

    /* renamed from: x */
    public long mo20911x() {
        return TimeUnit.SECONDS.toMillis(this.returnAdMinBackgroundTime);
    }

    /* renamed from: y */
    public long mo20912y() {
        return this.smartRedirectLoadedTimeout;
    }

    /* renamed from: z */
    public long mo20913z() {
        return TimeUnit.SECONDS.toMillis((long) this.smartRedirectTimeout);
    }

    /* renamed from: a */
    public MetaDataStyle mo20886a(String str) {
        return this.templates.get(str);
    }

    /* renamed from: a */
    public boolean mo20887a() {
        return this.enableForceExternalBrowser;
    }

    /* renamed from: a */
    public static void m23013a(Context context, AdsCommonMetaData adsCommonMetaData) {
        synchronized (f22235a) {
            adsCommonMetaData.acMetadataUpdateVersion = "4.10.2";
            f22242h = adsCommonMetaData;
            C5126w2.m23389a(context, "StartappAdsMetadata", (Serializable) adsCommonMetaData);
        }
    }
}
