package com.ironsource.adapters.facebook;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class FacebookAdapter extends AbstractAdapter implements INetworkInitCallbackListener {
    public static int BN_FAILED_TO_RELOAD_ERROR_CODE = 103;
    private static final String GitHash = "3f62a6f15";
    private static final String MEDIATION_SERVICE_NAME = "ironSource";
    private static final String VERSION = "4.3.34";
    protected static HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();
    protected static AtomicBoolean mDidCallInit = new AtomicBoolean(false);
    protected static Boolean mDidInitSuccess = null;
    protected static EnumSet<CacheFlag> mInterstitialFacebookFlags = EnumSet.allOf(CacheFlag.class);
    protected final String ALL_PLACEMENT_IDS = "placementIds";
    protected final String FACEBOOK_BN_CACHE_FLAG = "facebook_bn_cacheflag";
    protected final String FACEBOOK_IS_CACHE_FLAG = "facebook_is_cacheflag";
    protected final String FACEBOOK_RV_CACHE_FLAG = "facebook_rv_cacheflag";
    protected final String PLACEMENT_ID = "placementId";
    protected ConcurrentHashMap<String, AdView> mBNPlacementToAdMap = new ConcurrentHashMap<>();
    protected ConcurrentHashMap<String, BannerSmashListener> mBNPlacementToListenerMap = new ConcurrentHashMap<>();
    protected boolean mDidCallClosed;
    protected ConcurrentHashMap<String, InterstitialAd> mISPlacementToAdMap = new ConcurrentHashMap<>();
    protected ConcurrentHashMap<String, FacebookInterstitialAdListener> mISPlacementToFBListener = new ConcurrentHashMap<>();
    protected ConcurrentHashMap<String, InterstitialSmashListener> mISPlacementToListenerMap = new ConcurrentHashMap<>();
    protected ConcurrentHashMap<String, Boolean> mInterstitialAdsAvailability = new ConcurrentHashMap<>();
    protected ConcurrentHashMap<String, Boolean> mInterstitialPlacementIdShowCalled = new ConcurrentHashMap<>();
    protected ConcurrentHashMap<String, RewardedVideoAd> mRVPlacementToAdMap = new ConcurrentHashMap<>();
    protected ConcurrentHashMap<String, FacebookRewardedVideoAdListener> mRVPlacementToFBListener = new ConcurrentHashMap<>();
    protected ConcurrentHashMap<String, RewardedVideoSmashListener> mRVPlacementToListenerMap = new ConcurrentHashMap<>();
    protected ConcurrentHashMap<String, Boolean> mRewardedVideoPlacementIdShowCalled = new ConcurrentHashMap<>();
    protected CopyOnWriteArraySet<String> mRewardedVideoPlacementsForInitCallbacks = new CopyOnWriteArraySet<>();
    protected ConcurrentHashMap<String, Boolean> mRvAdsAvailability = new ConcurrentHashMap<>();

    private FacebookAdapter(String str) {
        super(str);
        AdSettings.setMediationService(getMediationServiceName());
        this.mDidCallClosed = false;
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    /* access modifiers changed from: private */
    public FrameLayout.LayoutParams calcLayoutParams(ISBannerSize iSBannerSize, Activity activity) {
        int i;
        if (iSBannerSize.getDescription().equals("RECTANGLE")) {
            i = 300;
        } else {
            i = (!iSBannerSize.getDescription().equals("SMART") || !AdapterUtils.isLargeScreen(activity)) ? 320 : 728;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(activity, i), -2);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    private AdSize calculateBannerSize(ISBannerSize iSBannerSize, boolean z) {
        String description = iSBannerSize.getDescription();
        description.hashCode();
        char c = 65535;
        switch (description.hashCode()) {
            case -387072689:
                if (description.equals("RECTANGLE")) {
                    c = 0;
                    break;
                }
                break;
            case 72205083:
                if (description.equals("LARGE")) {
                    c = 1;
                    break;
                }
                break;
            case 79011241:
                if (description.equals("SMART")) {
                    c = 2;
                    break;
                }
                break;
            case 1951953708:
                if (description.equals(AdPreferences.TYPE_BANNER)) {
                    c = 3;
                    break;
                }
                break;
            case 1999208305:
                if (description.equals("CUSTOM")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return AdSize.RECTANGLE_HEIGHT_250;
            case 1:
                return AdSize.BANNER_HEIGHT_90;
            case 2:
                return z ? AdSize.BANNER_HEIGHT_90 : AdSize.BANNER_HEIGHT_50;
            case 3:
                return AdSize.BANNER_HEIGHT_50;
            case 4:
                if (iSBannerSize.getHeight() == 50) {
                    return AdSize.BANNER_HEIGHT_50;
                }
                if (iSBannerSize.getHeight() == 90) {
                    return AdSize.BANNER_HEIGHT_90;
                }
                if (iSBannerSize.getHeight() == 250) {
                    return AdSize.RECTANGLE_HEIGHT_250;
                }
                return null;
            default:
                return null;
        }
    }

    public static String getAdapterSDKVersion() {
        return BuildConfig.VERSION_NAME;
    }

    private Map<String, Object> getBiddingData() {
        Boolean bool = mDidInitSuccess;
        if (bool == null || !bool.booleanValue()) {
            IronLog.INTERNAL.verbose("returning null as token since init failed");
            return null;
        }
        String bidderToken = BidderTokenProvider.getBidderToken(ContextProvider.getInstance().getApplicationContext());
        if (TextUtils.isEmpty(bidderToken)) {
            bidderToken = "";
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("token = " + bidderToken);
        HashMap hashMap = new HashMap();
        hashMap.put("token", bidderToken);
        return hashMap;
    }

    private EnumSet<CacheFlag> getFacebookAllCacheFlags() {
        IronLog.ADAPTER_API.verbose("");
        return EnumSet.allOf(CacheFlag.class);
    }

    private CacheFlag getFacebookCacheFlag(String str) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("value = " + str);
        return CacheFlag.valueOf(str.toUpperCase(Locale.ENGLISH));
    }

    public static IntegrationData getIntegrationData(Activity activity) {
        IntegrationData integrationData = new IntegrationData("Facebook", "4.3.34");
        integrationData.activities = new String[]{"com.facebook.ads.AudienceNetworkActivity"};
        return integrationData;
    }

    private String getMediationServiceName() {
        String format = String.format("%s_%s:%s", new Object[]{"ironSource", "7.1.13", "4.3.34"});
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("mediationServiceName = " + format);
        return format;
    }

    private void initBannersInternal(JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String optString = jSONObject.optString("placementId");
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("placement is empty");
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing placementId", IronSourceConstants.BANNER_AD_UNIT));
            return;
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placement = " + optString);
        this.mBNPlacementToListenerMap.put(optString, bannerSmashListener);
        initSdk(jSONObject);
        Boolean bool = mDidInitSuccess;
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            bannerSmashListener.onBannerInitSuccess();
        } else {
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("init failed", IronSourceConstants.BANNER_AD_UNIT));
        }
    }

    private void initSdk(JSONObject jSONObject) {
        if (mDidCallInit.compareAndSet(false, true)) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("");
            if (AudienceNetworkAds.isInitialized(ContextProvider.getInstance().getApplicationContext())) {
                ironLog.verbose("SDK is already initialized");
                mDidInitSuccess = Boolean.TRUE;
                return;
            }
            initCallbackListeners.add(this);
            FacebookInitListener facebookInitListener = new FacebookInitListener(this);
            String optString = jSONObject.optString("placementIds");
            if (TextUtils.isEmpty(optString)) {
                ironLog.verbose("Initialize Facebook without placement ids");
                AudienceNetworkAds.buildInitSettings(ContextProvider.getInstance().getApplicationContext()).withInitListener(facebookInitListener).initialize();
                return;
            }
            List asList = Arrays.asList(optString.split(","));
            ironLog.verbose("Initialize Facebook with placement ids = " + asList.toString());
            AudienceNetworkAds.buildInitSettings(ContextProvider.getInstance().getApplicationContext()).withInitListener(facebookInitListener).withPlacementIds(asList).initialize();
        } else if (mDidInitSuccess == null) {
            initCallbackListeners.add(this);
        }
    }

    private void loadBannerInternal(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
        final String optString = jSONObject.optString("placementId");
        if (ironSourceBannerLayout == null) {
            IronLog.INTERNAL.error("banner is null");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("banner layout is null"));
        } else if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("placement is empty");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("FacebookAdapter loadBanner placementId is empty"));
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("placementId = " + optString);
            final AdSize calculateBannerSize = calculateBannerSize(ironSourceBannerLayout.getSize(), AdapterUtils.isLargeScreen(ironSourceBannerLayout.getActivity()));
            if (calculateBannerSize == null) {
                IronLog.INTERNAL.error("adSize is null");
                bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize("Facebook"));
                return;
            }
            final IronSourceBannerLayout ironSourceBannerLayout2 = ironSourceBannerLayout;
            final BannerSmashListener bannerSmashListener2 = bannerSmashListener;
            final String str2 = str;
            postOnUIThread(new Runnable() {
                public void run() {
                    try {
                        AdView adView = new AdView((Context) ironSourceBannerLayout2.getActivity(), optString, calculateBannerSize);
                        FacebookBannerAdListener facebookBannerAdListener = new FacebookBannerAdListener(FacebookAdapter.this, bannerSmashListener2, optString, FacebookAdapter.this.calcLayoutParams(ironSourceBannerLayout2.getSize(), ironSourceBannerLayout2.getActivity()));
                        AdView.AdViewLoadConfigBuilder buildLoadAdConfig = adView.buildLoadAdConfig();
                        buildLoadAdConfig.withAdListener(facebookBannerAdListener);
                        String str = str2;
                        if (str != null) {
                            buildLoadAdConfig.withBid(str);
                        }
                        FacebookAdapter.this.mBNPlacementToAdMap.put(optString, adView);
                        adView.loadAd(buildLoadAdConfig.build());
                    } catch (Exception e) {
                        bannerSmashListener2.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("FacebookAdapter loadBanner exception " + e.getMessage()));
                    }
                }
            });
        }
    }

    private void loadInterstitialInternal(final InterstitialSmashListener interstitialSmashListener, JSONObject jSONObject, final String str) {
        final String optString = jSONObject.optString("placementId");
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("placement is empty");
            interstitialSmashListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError("Empty placementId"));
            return;
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.mInterstitialPlacementIdShowCalled;
        Boolean bool = Boolean.FALSE;
        concurrentHashMap.put(optString, bool);
        this.mInterstitialAdsAvailability.put(optString, bool);
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    if (FacebookAdapter.this.mISPlacementToAdMap.containsKey(optString)) {
                        IronLog ironLog = IronLog.ADAPTER_API;
                        ironLog.verbose("destroying old placement = " + optString);
                        FacebookAdapter.this.mISPlacementToAdMap.get(optString).destroy();
                        FacebookAdapter.this.mISPlacementToAdMap.remove(optString);
                    }
                    InterstitialAd interstitialAd = new InterstitialAd(ContextProvider.getInstance().getApplicationContext(), optString);
                    InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig = interstitialAd.buildLoadAdConfig();
                    buildLoadAdConfig.withCacheFlags(FacebookAdapter.mInterstitialFacebookFlags);
                    buildLoadAdConfig.withAdListener(FacebookAdapter.this.mISPlacementToFBListener.get(optString));
                    String str = str;
                    if (str != null) {
                        buildLoadAdConfig.withBid(str);
                    }
                    IronLog ironLog2 = IronLog.ADAPTER_API;
                    ironLog2.verbose("loading placement = " + optString + " with facebook flags = " + FacebookAdapter.mInterstitialFacebookFlags.toString());
                    interstitialAd.loadAd(buildLoadAdConfig.build());
                    FacebookAdapter.this.mISPlacementToAdMap.put(optString, interstitialAd);
                } catch (Exception e) {
                    interstitialSmashListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError(e.getLocalizedMessage()));
                }
            }
        });
    }

    private void loadRewardedVideo(final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            IronLog.INTERNAL.error("placement is empty");
            return;
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placement = " + str);
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.mRvAdsAvailability;
        Boolean bool = Boolean.FALSE;
        concurrentHashMap.put(str, bool);
        this.mRewardedVideoPlacementIdShowCalled.put(str, bool);
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    if (FacebookAdapter.this.mRVPlacementToAdMap.containsKey(str)) {
                        IronLog ironLog = IronLog.ADAPTER_API;
                        ironLog.verbose("destroying old placement = " + str);
                        FacebookAdapter.this.mRVPlacementToAdMap.get(str).destroy();
                        FacebookAdapter.this.mRVPlacementToAdMap.remove(str);
                    }
                    RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(ContextProvider.getInstance().getApplicationContext(), str);
                    RewardedVideoAd.RewardedVideoAdLoadConfigBuilder buildLoadAdConfig = rewardedVideoAd.buildLoadAdConfig();
                    buildLoadAdConfig.withAdListener(FacebookAdapter.this.mRVPlacementToFBListener.get(str));
                    String str = str2;
                    if (str != null) {
                        buildLoadAdConfig.withBid(str);
                    }
                    if (!TextUtils.isEmpty(FacebookAdapter.this.getDynamicUserId())) {
                        buildLoadAdConfig.withRewardData(new RewardData(FacebookAdapter.this.getDynamicUserId(), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
                    }
                    rewardedVideoAd.loadAd(buildLoadAdConfig.build());
                    FacebookAdapter.this.mRVPlacementToAdMap.put(str, rewardedVideoAd);
                } catch (Exception unused) {
                    if (FacebookAdapter.this.mRVPlacementToListenerMap.containsKey(str)) {
                        FacebookAdapter.this.mRVPlacementToListenerMap.get(str).onRewardedVideoAvailabilityChanged(false);
                    }
                }
            }
        });
    }

    public static FacebookAdapter startAdapter(String str) {
        return new FacebookAdapter(str);
    }

    public void destroyBanner(final JSONObject jSONObject) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + jSONObject.optString("placementId"));
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    String optString = jSONObject.optString("placementId");
                    if (FacebookAdapter.this.mBNPlacementToAdMap.containsKey(optString)) {
                        IronLog ironLog = IronLog.ADAPTER_API;
                        ironLog.verbose("destroying old placement = " + optString);
                        FacebookAdapter.this.mBNPlacementToAdMap.get(optString).destroy();
                        FacebookAdapter.this.mBNPlacementToAdMap.remove(optString);
                    }
                } catch (Exception e) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.error("destroyBanner failed with an exception = " + e);
                }
            }
        });
    }

    public void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        loadRewardedVideo(jSONObject.optString("placementId"), (String) null);
    }

    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    public String getCoreSDKVersion() {
        return getAdapterSDKVersion();
    }

    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    public String getVersion() {
        return "4.3.34";
    }

    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("");
        String optString = jSONObject.optString("placementId");
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("placement is empty");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        ironLog.verbose("placement = " + optString);
        this.mRVPlacementToFBListener.put(optString, new FacebookRewardedVideoAdListener(this, rewardedVideoSmashListener, optString));
        this.mRVPlacementToListenerMap.put(optString, rewardedVideoSmashListener);
        initSdk(jSONObject);
        if (mDidInitSuccess != null) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.verbose("mDidInitSuccess = " + mDidInitSuccess);
            if (mDidInitSuccess.booleanValue()) {
                loadRewardedVideo(optString, (String) null);
            } else {
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }
        }
    }

    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        initBannersInternal(jSONObject, bannerSmashListener);
    }

    public void initBanners(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        initBannersInternal(jSONObject, bannerSmashListener);
    }

    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("");
        String optString = jSONObject.optString("placementId");
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("placement is empty");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params: placementId", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            return;
        }
        ironLog.verbose("placement = " + optString);
        FacebookInterstitialAdListener facebookInterstitialAdListener = new FacebookInterstitialAdListener(this, interstitialSmashListener, optString);
        this.mISPlacementToListenerMap.put(optString, interstitialSmashListener);
        this.mISPlacementToFBListener.put(optString, facebookInterstitialAdListener);
        initSdk(jSONObject);
        Boolean bool = mDidInitSuccess;
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            interstitialSmashListener.onInterstitialInitSuccess();
        } else {
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("init failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
    }

    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        initInterstitial(str, str2, jSONObject, interstitialSmashListener);
    }

    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("");
        String optString = jSONObject.optString("placementId");
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("placement is empty");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing placementId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        ironLog.verbose("placement = " + optString);
        this.mRVPlacementToFBListener.put(optString, new FacebookRewardedVideoAdListener(this, rewardedVideoSmashListener, optString));
        this.mRVPlacementToListenerMap.put(optString, rewardedVideoSmashListener);
        this.mRewardedVideoPlacementsForInitCallbacks.add(optString);
        initSdk(jSONObject);
        if (mDidInitSuccess != null) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.verbose("mDidInitSuccess = " + mDidInitSuccess);
            if (mDidInitSuccess.booleanValue()) {
                rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            } else {
                rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("FAN Sdk failed to initiate", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
        }
    }

    public boolean isInterstitialReady(JSONObject jSONObject) {
        String optString = jSONObject.optString("placementId");
        return this.mInterstitialAdsAvailability.containsKey(optString) && this.mInterstitialAdsAvailability.get(optString).booleanValue();
    }

    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        String optString = jSONObject.optString("placementId");
        return this.mRvAdsAvailability.containsKey(optString) && this.mRvAdsAvailability.get(optString).booleanValue();
    }

    public void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        loadBannerInternal(ironSourceBannerLayout, jSONObject, bannerSmashListener, (String) null);
    }

    public void loadBannerForBidding(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
        IronLog.ADAPTER_API.verbose("");
        loadBannerInternal(ironSourceBannerLayout, jSONObject, bannerSmashListener, str);
    }

    public void loadInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        loadInterstitialInternal(interstitialSmashListener, jSONObject, (String) null);
    }

    public void loadInterstitialForBidding(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str) {
        IronLog.ADAPTER_API.verbose("");
        loadInterstitialInternal(interstitialSmashListener, jSONObject, str);
    }

    public void loadRewardedVideoForBidding(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        IronLog.ADAPTER_API.verbose("");
        loadRewardedVideo(jSONObject.optString("placementId"), str);
    }

    public void onNetworkInitCallbackFailed(String str) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("error: " + str);
        for (BannerSmashListener onBannerInitFailed : this.mBNPlacementToListenerMap.values()) {
            onBannerInitFailed.onBannerInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.BANNER_AD_UNIT));
        }
        for (InterstitialSmashListener onInterstitialInitFailed : this.mISPlacementToListenerMap.values()) {
            onInterstitialInitFailed.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
        for (String next : this.mRVPlacementToListenerMap.keySet()) {
            if (this.mRewardedVideoPlacementsForInitCallbacks.contains(next)) {
                this.mRVPlacementToListenerMap.get(next).onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                this.mRVPlacementToListenerMap.get(next).onRewardedVideoAvailabilityChanged(false);
            }
        }
    }

    public void onNetworkInitCallbackLoadSuccess(String str) {
    }

    public void onNetworkInitCallbackSuccess() {
        IronLog.ADAPTER_API.verbose("");
        for (BannerSmashListener onBannerInitSuccess : this.mBNPlacementToListenerMap.values()) {
            onBannerInitSuccess.onBannerInitSuccess();
        }
        for (InterstitialSmashListener onInterstitialInitSuccess : this.mISPlacementToListenerMap.values()) {
            onInterstitialInitSuccess.onInterstitialInitSuccess();
        }
        for (String next : this.mRVPlacementToListenerMap.keySet()) {
            if (this.mRewardedVideoPlacementsForInitCallbacks.contains(next)) {
                this.mRVPlacementToListenerMap.get(next).onRewardedVideoInitSuccess();
            } else {
                loadRewardedVideo(next, (String) null);
            }
        }
    }

    public void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + ad_unit);
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            for (RewardedVideoAd destroy : this.mRVPlacementToAdMap.values()) {
                destroy.destroy();
            }
            this.mRVPlacementToAdMap.clear();
            this.mRVPlacementToFBListener.clear();
            this.mRVPlacementToListenerMap.clear();
            this.mRvAdsAvailability.clear();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            for (InterstitialAd destroy2 : this.mISPlacementToAdMap.values()) {
                destroy2.destroy();
            }
            this.mISPlacementToAdMap.clear();
            this.mISPlacementToFBListener.clear();
            this.mISPlacementToListenerMap.clear();
            this.mInterstitialAdsAvailability.clear();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            for (AdView destroy3 : this.mBNPlacementToAdMap.values()) {
                destroy3.destroy();
            }
            this.mBNPlacementToAdMap.clear();
            this.mBNPlacementToListenerMap.clear();
        }
    }

    public void reloadBanner(IronSourceBannerLayout ironSourceBannerLayout, final JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + jSONObject.optString("placementId"));
        postOnUIThread(new Runnable() {
            public void run() {
                String optString = jSONObject.optString("placementId");
                if (FacebookAdapter.this.mBNPlacementToAdMap.containsKey(optString)) {
                    FacebookAdapter.this.mBNPlacementToAdMap.get(optString).loadAd();
                } else if (FacebookAdapter.this.mBNPlacementToListenerMap.containsKey(optString)) {
                    int i = FacebookAdapter.BN_FAILED_TO_RELOAD_ERROR_CODE;
                    FacebookAdapter.this.mBNPlacementToListenerMap.get(optString).onBannerAdLoadFailed(new IronSourceError(i, FacebookAdapter.this.getProviderName() + "reloadBanner missing banner " + optString));
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void setMetaData(String str, List<String> list) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("key = " + str + ", values = " + list);
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        lowerCase.hashCode();
        if (lowerCase.equals("facebook_is_cacheflag")) {
            mInterstitialFacebookFlags.clear();
            try {
                for (String facebookCacheFlag : list) {
                    CacheFlag facebookCacheFlag2 = getFacebookCacheFlag(facebookCacheFlag);
                    IronLog ironLog2 = IronLog.ADAPTER_API;
                    ironLog2.verbose("flag = " + facebookCacheFlag2.name());
                    mInterstitialFacebookFlags.add(facebookCacheFlag2);
                }
            } catch (Exception unused) {
                IronLog.INTERNAL.error("flag is unknown or all, set all as default");
                mInterstitialFacebookFlags = getFacebookAllCacheFlags();
            }
        }
    }

    public void showInterstitial(JSONObject jSONObject, final InterstitialSmashListener interstitialSmashListener) {
        final String optString = jSONObject.optString("placementId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        this.mInterstitialAdsAvailability.put(optString, Boolean.FALSE);
        postOnUIThread(new Runnable() {
            public void run() {
                String str;
                try {
                    InterstitialAd interstitialAd = FacebookAdapter.this.mISPlacementToAdMap.get(optString);
                    if (interstitialAd == null || !interstitialAd.isAdLoaded() || interstitialAd.isAdInvalidated()) {
                        if (interstitialAd != null) {
                            str = "interstitialAd.isAdInvalidated() = " + interstitialAd.isAdInvalidated();
                        } else {
                            str = "no ads to show";
                        }
                        IronSourceError buildShowFailedError = ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, str);
                        IronLog.INTERNAL.error("error = " + buildShowFailedError.getErrorMessage());
                        interstitialSmashListener.onInterstitialAdShowFailed(buildShowFailedError);
                        return;
                    }
                    FacebookAdapter.this.mInterstitialPlacementIdShowCalled.put(optString, Boolean.TRUE);
                    interstitialAd.show();
                } catch (Exception e) {
                    IronLog.INTERNAL.error("ex.getMessage() = " + e.getMessage());
                    interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, e.getMessage()));
                }
            }
        });
    }

    public void showRewardedVideo(JSONObject jSONObject, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("");
        final String optString = jSONObject.optString("placementId");
        ironLog.verbose("placementId = " + optString);
        this.mRvAdsAvailability.put(optString, Boolean.FALSE);
        postOnUIThread(new Runnable() {
            public void run() {
                String str;
                try {
                    RewardedVideoAd rewardedVideoAd = FacebookAdapter.this.mRVPlacementToAdMap.get(optString);
                    if (rewardedVideoAd == null || !rewardedVideoAd.isAdLoaded() || rewardedVideoAd.isAdInvalidated()) {
                        if (rewardedVideoAd != null) {
                            str = "videoAd.isAdInvalidated() = " + rewardedVideoAd.isAdInvalidated();
                        } else {
                            str = "no ads to show";
                        }
                        IronSourceError buildShowFailedError = ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str);
                        IronLog.INTERNAL.error("error = " + buildShowFailedError.getErrorMessage());
                        rewardedVideoSmashListener.onRewardedVideoAdShowFailed(buildShowFailedError);
                        rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
                    }
                    FacebookAdapter.this.mRewardedVideoPlacementIdShowCalled.put(optString, Boolean.TRUE);
                    rewardedVideoAd.show();
                    rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
                } catch (Exception e) {
                    IronLog.INTERNAL.error("ex.getMessage() = " + e.getMessage());
                    rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, e.getMessage()));
                }
            }
        });
    }
}
