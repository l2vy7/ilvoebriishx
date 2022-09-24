package com.ironsource.adapters.supersonicads;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C11232E;
import com.ironsource.mediationsdk.C11347b;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.C11447g;
import com.ironsource.mediationsdk.sdk.C11473k;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.C11499n;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.C11695f;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.SSAFactory;
import com.ironsource.sdk.p293g.C11699a;
import com.ironsource.sdk.p296j.C11726c;
import com.ironsource.sdk.p296j.C11728e;
import com.ironsource.sdk.p296j.C11729f;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

class SupersonicAdsAdapter extends AbstractAdapter implements ContextProvider.C4951a, C11473k, C11726c, C11728e, C11729f {
    private static final String VERSION = "7.1.12.2";
    /* access modifiers changed from: private */
    public static AtomicBoolean mDidInitSdk = new AtomicBoolean(false);
    private static AtomicBoolean mDidSetInitParams = new AtomicBoolean(false);
    private final String AD_VISIBLE_EVENT_NAME = "impressions";
    private final String APPLICATION_PRIVATE_KEY = "privateKey";
    private final String CAMPAIGN_ID = "campaignId";
    private final String CLIENT_SIDE_CALLBACKS = "useClientSideCallbacks";
    private final String CUSTOM_PARAM_PREFIX = ContentMetadata.KEY_CUSTOM_PREFIX;
    private final String CUSTOM_SEGMENT = "custom_Segment";
    private final String DYNAMIC_CONTROLLER_CONFIG = "controllerConfig";
    private final String DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
    private final String DYNAMIC_CONTROLLER_URL = "controllerUrl";
    private final String ITEM_COUNT = "itemCount";
    private final String ITEM_NAME = "itemName";
    private final String ITEM_SIGNATURE = "itemSignature";
    private final String LANGUAGE = "language";
    private final String MAX_VIDEO_LENGTH = "maxVideoLength";
    private final String OW_PLACEMENT_ID = "placementId";
    private final String SDK_PLUGIN_TYPE = "SDKPluginType";
    private final String SESSION_ID = "sessionid";
    private final String SUPERSONIC_ADS = IronSourceConstants.SUPERSONIC_CONFIG_NAME;
    private final String TIMESTAMP = "timestamp";
    private AtomicBoolean isRVInitiated;
    /* access modifiers changed from: private */
    public boolean mConsent;
    /* access modifiers changed from: private */
    public boolean mDidSetConsent;
    private boolean mIsAlreadyShowing;
    private boolean mIsRVAvailable = false;
    private String mMediationSegment;
    /* access modifiers changed from: private */
    public C11447g mOfferwallListener;
    /* access modifiers changed from: private */
    public C11695f mSSAPublisher;

    private SupersonicAdsAdapter(String str) {
        super(str);
        IronLog.INTERNAL.verbose("");
        this.isRVInitiated = new AtomicBoolean(false);
        ContextProvider.getInstance().registerLifeCycleListener(this);
        this.mIsAlreadyShowing = false;
    }

    private void addItemNameCountSignature(HashMap<String, String> hashMap, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("itemName");
            int optInt = jSONObject.optInt("itemCount", -1);
            String optString2 = jSONObject.optString("privateKey");
            boolean z = true;
            boolean z2 = false;
            if (TextUtils.isEmpty(optString)) {
                z = false;
            } else {
                hashMap.put("itemName", optString);
            }
            if (TextUtils.isEmpty(optString2)) {
                z = false;
            }
            if (optInt != -1) {
                hashMap.put("itemCount", String.valueOf(optInt));
                z2 = z;
            }
            if (z2) {
                int currentTimestamp = IronSourceUtils.getCurrentTimestamp();
                hashMap.put("timestamp", String.valueOf(currentTimestamp));
                hashMap.put("itemSignature", createItemSig(currentTimestamp, optString, optInt, optString2));
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error(" addItemNameCountSignature" + e);
        }
    }

    /* access modifiers changed from: private */
    public void applyConsent(boolean z) {
        if (this.mSSAPublisher != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("gdprConsentStatus", String.valueOf(z));
                jSONObject.put("demandSourceName", getProviderName());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.mSSAPublisher.mo44950a(jSONObject);
        }
    }

    private String createItemSig(int i, String str, int i2, String str2) {
        return IronSourceUtils.getMD5(i + str + i2 + str2);
    }

    private String createMinimumOfferCommissionSig(double d, String str) {
        return IronSourceUtils.getMD5(d + str);
    }

    private String createUserCreationDateSig(String str, String str2, String str3) {
        return IronSourceUtils.getMD5(str + str2 + str3);
    }

    public static String getAdapterSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    private HashMap<String, String> getGenenralExtraParams() {
        HashMap<String, String> hashMap = new HashMap<>();
        String pluginType = getPluginType();
        if (!TextUtils.isEmpty(pluginType)) {
            hashMap.put("SDKPluginType", pluginType);
        }
        return hashMap;
    }

    private HashMap<String, String> getInitParams() {
        HashMap<String, String> hashMap = new HashMap<>();
        String pluginType = getPluginType();
        if (!TextUtils.isEmpty(pluginType)) {
            hashMap.put("SDKPluginType", pluginType);
        }
        if (!TextUtils.isEmpty(this.mMediationSegment)) {
            hashMap.put("custom_Segment", this.mMediationSegment);
        }
        if (!TextUtils.isEmpty(C11232E.m50103a().f50426p)) {
            hashMap.put("sessionid", C11232E.m50103a().f50426p);
        }
        return hashMap;
    }

    public static IntegrationData getIntegrationData(Activity activity) {
        IntegrationData integrationData = new IntegrationData(IronSourceConstants.SUPERSONIC_CONFIG_NAME, "7.1.12.2");
        integrationData.activities = new String[]{"com.ironsource.sdk.controller.ControllerActivity", "com.ironsource.sdk.controller.InterstitialActivity", "com.ironsource.sdk.controller.OpenUrlActivity"};
        integrationData.providers = new String[]{"com.ironsource.lifecycle.IronsourceLifecycleProvider"};
        return integrationData;
    }

    /* access modifiers changed from: private */
    public HashMap<String, String> getInterstitialExtraParams() {
        return getGenenralExtraParams();
    }

    /* access modifiers changed from: private */
    public HashMap<String, String> getOfferwallExtraParams(JSONObject jSONObject) {
        HashMap<String, String> genenralExtraParams = getGenenralExtraParams();
        String optString = jSONObject.optString("language");
        if (!TextUtils.isEmpty(optString)) {
            genenralExtraParams.put("language", optString);
        }
        genenralExtraParams.put("useClientSideCallbacks", String.valueOf(SupersonicConfig.getConfigObj().getClientSideCallbacks()));
        Map<String, String> offerwallCustomParams = SupersonicConfig.getConfigObj().getOfferwallCustomParams();
        if (offerwallCustomParams != null && !offerwallCustomParams.isEmpty()) {
            genenralExtraParams.putAll(offerwallCustomParams);
        }
        addItemNameCountSignature(genenralExtraParams, jSONObject);
        return genenralExtraParams;
    }

    /* access modifiers changed from: private */
    public HashMap<String, String> getRewardedVideoExtraParams(JSONObject jSONObject) {
        HashMap<String, String> genenralExtraParams = getGenenralExtraParams();
        String optString = jSONObject.optString("language");
        if (!TextUtils.isEmpty(optString)) {
            genenralExtraParams.put("language", optString);
        }
        String optString2 = jSONObject.optString("maxVideoLength");
        if (!TextUtils.isEmpty(optString2)) {
            genenralExtraParams.put("maxVideoLength", optString2);
        }
        String optString3 = jSONObject.optString("campaignId");
        if (!TextUtils.isEmpty(optString3)) {
            genenralExtraParams.put("campaignId", optString3);
        }
        if (!TextUtils.isEmpty(this.mMediationSegment)) {
            genenralExtraParams.put("custom_Segment", this.mMediationSegment);
        }
        addItemNameCountSignature(genenralExtraParams, jSONObject);
        Map<String, String> rewardedVideoCustomParams = SupersonicConfig.getConfigObj().getRewardedVideoCustomParams();
        if (rewardedVideoCustomParams != null && !rewardedVideoCustomParams.isEmpty()) {
            genenralExtraParams.putAll(rewardedVideoCustomParams);
        }
        return genenralExtraParams;
    }

    private boolean isValidMetaData(String str, String str2) {
        if (str.equals("do_not_sell")) {
            return MetaDataUtils.isValidCCPAMetaData(str, str2);
        }
        return true;
    }

    private void setParamsBeforeInit(JSONObject jSONObject) {
        if (mDidSetInitParams.compareAndSet(false, true)) {
            SDKUtils.setControllerUrl(jSONObject.optString("controllerUrl"));
            int optInt = jSONObject.optInt("debugMode", 0);
            if (isAdaptersDebugEnabled()) {
                optInt = 3;
            }
            SDKUtils.setDebugMode(optInt);
            SDKUtils.setControllerConfig(jSONObject.optString("controllerConfig", ""));
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + "setting controller url to  " + jSONObject.optString("controllerUrl"));
            ironLog.verbose(getProviderName() + "setting controller config to  " + jSONObject.optString("controllerConfig"));
            ironLog.verbose(getProviderName() + "setting debug mode to " + optInt);
        }
    }

    public static SupersonicAdsAdapter startAdapter(String str) {
        return new SupersonicAdsAdapter(str);
    }

    public void earlyInit(String str, String str2, JSONObject jSONObject) {
        IronSourceUtils.sendAutomationLog(getProviderName() + ": earlyInit");
        if (mDidInitSdk.compareAndSet(false, true)) {
            SDKUtils.setDebugMode(isAdaptersDebugEnabled() ? 3 : jSONObject.optInt("debugMode", 0));
            SDKUtils.setControllerUrl(jSONObject.optString("controllerUrl"));
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + " IronSourceNetwork setting controller url to  " + jSONObject.optString("controllerUrl"));
            SDKUtils.setControllerConfig(jSONObject.optString("controllerConfig", ""));
            ironLog.verbose(getProviderName() + " IronSourceNetwork setting controller config to  " + jSONObject.optString("controllerConfig"));
            HashMap<String, String> initParams = getInitParams();
            IronSourceNetwork.initSDK(ContextProvider.getInstance().getCurrentActiveActivity(), C11232E.m50103a().f50417j, str2, initParams);
            ironLog.verbose("initSDK with appKey=" + C11232E.m50103a().f50417j + " userId=" + str2 + " parameters " + initParams);
        }
    }

    public void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose(getProviderName());
        Iterator<RewardedVideoSmashListener> it = this.mAllRewardedVideoSmashes.iterator();
        while (it.hasNext()) {
            RewardedVideoSmashListener next = it.next();
            if (next != null) {
                next.onRewardedVideoAvailabilityChanged(this.mIsRVAvailable);
            }
        }
    }

    public String getCoreSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    public void getOfferwallCredits() {
        if (this.mSSAPublisher != null) {
            C11232E.m50103a();
            String str = C11232E.m50103a().f50419k;
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + " mSSAPublisher.getOfferWallCredits userId=" + str);
            this.mSSAPublisher.mo44945a(C11232E.m50103a().f50417j, str, (C11728e) this);
            return;
        }
        IronLog.INTERNAL.error("Please call init before calling getOfferwallCredits");
    }

    public String getVersion() {
        return "7.1.12.2";
    }

    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        setParamsBeforeInit(jSONObject);
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    String mediationUserId = IronSourceUtils.getMediationUserId();
                    C11695f unused = SupersonicAdsAdapter.this.mSSAPublisher = SSAFactory.getPublisherInstance(ContextProvider.getInstance().getCurrentActiveActivity());
                    HashMap access$600 = SupersonicAdsAdapter.this.getInterstitialExtraParams();
                    if (SupersonicAdsAdapter.this.mDidSetConsent) {
                        SupersonicAdsAdapter supersonicAdsAdapter = SupersonicAdsAdapter.this;
                        supersonicAdsAdapter.applyConsent(supersonicAdsAdapter.mConsent);
                    }
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.verbose(SupersonicAdsAdapter.this.getProviderName() + " mSSAPublisher.initInterstitial userId=" + mediationUserId);
                    SupersonicAdsAdapter.this.mSSAPublisher.mo44946a(C11232E.m50103a().f50417j, mediationUserId, SupersonicAdsAdapter.this.getProviderName(), (Map<String, String>) access$600, (C11726c) SupersonicAdsAdapter.this);
                    SupersonicAdsAdapter.mDidInitSdk.set(true);
                } catch (Exception e) {
                    e.printStackTrace();
                    SupersonicAdsAdapter.this.onInterstitialInitFailed(e.getMessage());
                }
            }
        });
    }

    public void initOfferwall(String str, final String str2, final JSONObject jSONObject) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose(getProviderName() + " userId=" + str2);
        setParamsBeforeInit(jSONObject);
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    HashMap access$700 = SupersonicAdsAdapter.this.getOfferwallExtraParams(jSONObject);
                    C11695f unused = SupersonicAdsAdapter.this.mSSAPublisher = SSAFactory.getPublisherInstance(ContextProvider.getInstance().getCurrentActiveActivity());
                    if (SupersonicAdsAdapter.this.mDidSetConsent) {
                        SupersonicAdsAdapter supersonicAdsAdapter = SupersonicAdsAdapter.this;
                        supersonicAdsAdapter.applyConsent(supersonicAdsAdapter.mConsent);
                    }
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.verbose(SupersonicAdsAdapter.this.getProviderName() + " mSSAPublisher.initOfferWall");
                    SupersonicAdsAdapter.this.mSSAPublisher.mo44948a(C11232E.m50103a().f50417j, str2, access$700, SupersonicAdsAdapter.this);
                    SupersonicAdsAdapter.mDidInitSdk.set(true);
                } catch (Exception e) {
                    e.printStackTrace();
                    IronLog ironLog2 = IronLog.ADAPTER_API;
                    ironLog2.error(SupersonicAdsAdapter.this.getProviderName() + ":initOfferwall(userId:" + str2 + ")" + e);
                    C11447g access$800 = SupersonicAdsAdapter.this.mOfferwallListener;
                    StringBuilder sb = new StringBuilder("Adapter initialization failure - ");
                    sb.append(SupersonicAdsAdapter.this.getProviderName());
                    sb.append(" - ");
                    sb.append(e.getMessage());
                    access$800.mo44236a(false, ErrorBuilder.buildInitFailedError(sb.toString(), IronSourceConstants.OFFERWALL_AD_UNIT));
                }
            }
        });
    }

    public void initRewardedVideo(String str, String str2, final JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        if (this.isRVInitiated.compareAndSet(false, true)) {
            setParamsBeforeInit(jSONObject);
            postOnUIThread(new Runnable() {
                public void run() {
                    try {
                        String mediationUserId = IronSourceUtils.getMediationUserId();
                        C11695f unused = SupersonicAdsAdapter.this.mSSAPublisher = SSAFactory.getPublisherInstance(ContextProvider.getInstance().getCurrentActiveActivity());
                        HashMap access$100 = SupersonicAdsAdapter.this.getRewardedVideoExtraParams(jSONObject);
                        if (SupersonicAdsAdapter.this.mDidSetConsent) {
                            SupersonicAdsAdapter supersonicAdsAdapter = SupersonicAdsAdapter.this;
                            supersonicAdsAdapter.applyConsent(supersonicAdsAdapter.mConsent);
                        }
                        IronLog ironLog = IronLog.ADAPTER_API;
                        ironLog.verbose(SupersonicAdsAdapter.this.getProviderName() + " mSSAPublisher.initRewardedVideo userId=" + mediationUserId);
                        SupersonicAdsAdapter.this.mSSAPublisher.mo44947a(C11232E.m50103a().f50417j, mediationUserId, SupersonicAdsAdapter.this.getProviderName(), (Map<String, String>) access$100, (C11729f) SupersonicAdsAdapter.this);
                        SupersonicAdsAdapter.mDidInitSdk.set(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                        SupersonicAdsAdapter.this.onRVInitFail("initRewardedVideo");
                    }
                }
            });
            return;
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose(getProviderName() + " adapter already initiated");
        fetchRewardedVideoForAutomaticLoad(jSONObject, rewardedVideoSmashListener);
    }

    public boolean isInterstitialReady(JSONObject jSONObject) {
        C11695f fVar = this.mSSAPublisher;
        return fVar != null && fVar.mo44952a(getProviderName());
    }

    public boolean isOfferwallAvailable() {
        return true;
    }

    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        return this.mIsRVAvailable;
    }

    public void loadInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        if (this.mSSAPublisher != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("demandSourceName", getProviderName());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + " mSSAPublisher.loadInterstitial");
            this.mSSAPublisher.mo44963c(jSONObject2);
            return;
        }
        IronLog.INTERNAL.error("Please call initInterstitial before calling loadInterstitial");
        Iterator<InterstitialSmashListener> it = this.mAllInterstitialSmashes.iterator();
        while (it.hasNext()) {
            InterstitialSmashListener next = it.next();
            if (next != null) {
                next.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError("Load was called before Init"));
            }
        }
    }

    public void onGetOWCreditsFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.onGetOfferwallCreditsFailed(ErrorBuilder.buildGenericError(str));
        }
    }

    public void onInterstitialAdRewarded(String str, int i) {
    }

    public void onInterstitialClick() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        InterstitialSmashListener interstitialSmashListener = this.mActiveInterstitialSmash;
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdClicked();
        }
    }

    public void onInterstitialClose() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        InterstitialSmashListener interstitialSmashListener = this.mActiveInterstitialSmash;
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdClosed();
        }
    }

    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        InterstitialSmashListener interstitialSmashListener;
        if (jSONObject != null) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(getProviderName() + " " + str + " extData: " + jSONObject.toString());
            if (!TextUtils.isEmpty(str) && "impressions".equals(str) && (interstitialSmashListener = this.mActiveInterstitialSmash) != null) {
                interstitialSmashListener.onInterstitialAdVisible();
            }
        }
    }

    public void onInterstitialInitFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        Iterator<InterstitialSmashListener> it = this.mAllInterstitialSmashes.iterator();
        while (it.hasNext()) {
            InterstitialSmashListener next = it.next();
            if (next != null) {
                next.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
        }
    }

    public void onInterstitialInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        Iterator<InterstitialSmashListener> it = this.mAllInterstitialSmashes.iterator();
        while (it.hasNext()) {
            InterstitialSmashListener next = it.next();
            if (next != null) {
                next.onInterstitialInitSuccess();
            }
        }
    }

    public void onInterstitialLoadFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        Iterator<InterstitialSmashListener> it = this.mAllInterstitialSmashes.iterator();
        while (it.hasNext()) {
            InterstitialSmashListener next = it.next();
            if (next != null) {
                next.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError(str));
            }
        }
    }

    public void onInterstitialLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        Iterator<InterstitialSmashListener> it = this.mAllInterstitialSmashes.iterator();
        while (it.hasNext()) {
            InterstitialSmashListener next = it.next();
            if (next != null) {
                next.onInterstitialAdReady();
            }
        }
    }

    public void onInterstitialOpen() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        InterstitialSmashListener interstitialSmashListener = this.mActiveInterstitialSmash;
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdOpened();
        }
    }

    public void onInterstitialShowFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        InterstitialSmashListener interstitialSmashListener = this.mActiveInterstitialSmash;
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, str));
        }
    }

    public void onInterstitialShowSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        InterstitialSmashListener interstitialSmashListener = this.mActiveInterstitialSmash;
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdShowSucceeded();
        }
    }

    public void onOWAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        C11447g gVar = this.mOfferwallListener;
        if (gVar != null) {
            gVar.onOfferwallClosed();
        }
    }

    public boolean onOWAdCredited(int i, int i2, boolean z) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        C11447g gVar = this.mOfferwallListener;
        return gVar != null && gVar.onOfferwallAdCredited(i, i2, z);
    }

    public void onOWShowFail(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.onOfferwallShowFailed(ErrorBuilder.buildGenericError(str));
        }
    }

    public void onOWShowSuccess(String str) {
        if (TextUtils.isEmpty(str)) {
            IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        } else {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(getProviderName() + ":onOWShowSuccess(placementId:" + str + ")");
        }
        C11447g gVar = this.mOfferwallListener;
        if (gVar != null) {
            gVar.onOfferwallOpened();
        }
    }

    public void onOfferwallEventNotificationReceived(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        }
    }

    public void onOfferwallInitFail(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.mo44236a(false, ErrorBuilder.buildGenericError(str));
        }
    }

    public void onOfferwallInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        C11447g gVar = this.mOfferwallListener;
        if (gVar != null) {
            gVar.onOfferwallAvailable(true);
        }
    }

    public void onPause(Activity activity) {
        if (this.mSSAPublisher != null) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + " mSSAPublisher.onPause");
            this.mSSAPublisher.mo44953b(activity);
        }
    }

    public void onRVAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mActiveRewardedVideoSmash;
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdClicked();
        }
    }

    public void onRVAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mActiveRewardedVideoSmash;
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdClosed();
        }
    }

    public void onRVAdCredited(int i) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mActiveRewardedVideoSmash;
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdRewarded();
        }
    }

    public void onRVAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mActiveRewardedVideoSmash;
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdOpened();
        }
    }

    public void onRVEventNotificationReceived(String str, JSONObject jSONObject) {
        RewardedVideoSmashListener rewardedVideoSmashListener;
        if (jSONObject != null) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(getProviderName() + " " + str + " extData: " + jSONObject.toString());
        }
        if (!TextUtils.isEmpty(str) && "impressions".equals(str) && (rewardedVideoSmashListener = this.mActiveRewardedVideoSmash) != null) {
            rewardedVideoSmashListener.onRewardedVideoAdVisible();
        }
    }

    public void onRVInitFail(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        Iterator<RewardedVideoSmashListener> it = this.mAllRewardedVideoSmashes.iterator();
        while (it.hasNext()) {
            RewardedVideoSmashListener next = it.next();
            if (next != null) {
                next.onRewardedVideoAvailabilityChanged(false);
            }
        }
    }

    public void onRVInitSuccess(C11699a aVar) {
        int i;
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        boolean z = false;
        try {
            i = Integer.parseInt(aVar.f52366b);
        } catch (NumberFormatException e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("parseInt()" + e);
            i = 0;
        }
        if (i > 0) {
            z = true;
        }
        this.mIsRVAvailable = z;
        Iterator<RewardedVideoSmashListener> it = this.mAllRewardedVideoSmashes.iterator();
        while (it.hasNext()) {
            RewardedVideoSmashListener next = it.next();
            if (next != null) {
                next.onRewardedVideoAvailabilityChanged(z);
            }
        }
    }

    public void onRVNoMoreOffers() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        this.mIsRVAvailable = false;
        Iterator<RewardedVideoSmashListener> it = this.mAllRewardedVideoSmashes.iterator();
        while (it.hasNext()) {
            RewardedVideoSmashListener next = it.next();
            if (next != null) {
                next.onRewardedVideoAvailabilityChanged(false);
            }
        }
    }

    public void onRVShowFail(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mActiveRewardedVideoSmash;
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, str));
        }
    }

    public void onResume(Activity activity) {
        if (this.mSSAPublisher != null) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + " mSSAPublisher.onResume");
            this.mSSAPublisher.mo44959c(activity);
        }
    }

    public void setConsent(boolean z) {
        IronLog ironLog = IronLog.ADAPTER_API;
        StringBuilder sb = new StringBuilder();
        sb.append(getProviderName());
        sb.append(": setConsent (");
        sb.append(z ? "true" : "false");
        sb.append(")");
        ironLog.verbose(sb.toString());
        this.mDidSetConsent = true;
        this.mConsent = z;
        applyConsent(z);
    }

    public void setInternalOfferwallListener(C11447g gVar) {
        this.mOfferwallListener = gVar;
    }

    public void setMediationSegment(String str) {
        this.mMediationSegment = str;
    }

    public void setMediationState(C11347b.C11348a aVar, String str) {
        if (this.mSSAPublisher != null) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + ": setMediationState(" + str + " , " + getProviderName() + " , " + aVar.f50963l + ")");
            this.mSSAPublisher.mo44944a(str, getProviderName(), aVar.f50963l);
        }
    }

    public void setMetaData(String str, String str2) {
        if (!mDidInitSdk.get()) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("key=" + str + ", value=" + str2);
            if (!isValidMetaData(str, str2)) {
                ironLog.verbose("not valid");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, str2);
                IronSourceNetwork.updateMetadata(jSONObject);
            } catch (JSONException e) {
                IronLog ironLog2 = IronLog.ADAPTER_API;
                ironLog2.error("error - " + e);
                e.printStackTrace();
            }
        }
    }

    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        this.mActiveInterstitialSmash = interstitialSmashListener;
        if (this.mSSAPublisher != null) {
            int b = C11499n.m51312a().mo44568b(2);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("demandSourceName", getProviderName());
                jSONObject2.put(IronSourceConstants.KEY_SESSION_DEPTH, b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + " mSSAPublisher.showInterstitial");
            this.mSSAPublisher.mo44967d(jSONObject2);
            return;
        }
        IronLog.INTERNAL.error("Please call loadInterstitialForBidding before calling showInterstitial");
        InterstitialSmashListener interstitialSmashListener2 = this.mActiveInterstitialSmash;
        if (interstitialSmashListener2 != null) {
            interstitialSmashListener2.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
    }

    public void showOfferwall(String str, JSONObject jSONObject) {
        HashMap<String, String> offerwallExtraParams = getOfferwallExtraParams(jSONObject);
        if (offerwallExtraParams != null) {
            offerwallExtraParams.put("placementId", str);
        }
        if (this.mSSAPublisher != null) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + " mSSAPublisher.showOfferWall");
            this.mSSAPublisher.mo44934a(ContextProvider.getInstance().getCurrentActiveActivity(), offerwallExtraParams);
            return;
        }
        IronLog.INTERNAL.error("Please call init before calling showOfferwall");
    }

    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        this.mActiveRewardedVideoSmash = rewardedVideoSmashListener;
        if (this.mSSAPublisher != null) {
            int b = C11499n.m51312a().mo44568b(1);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("demandSourceName", getProviderName());
                jSONObject2.put(IronSourceConstants.KEY_SESSION_DEPTH, b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + " mSSAPublisher.showRewardedVideo");
            this.mSSAPublisher.mo44958b(jSONObject2);
            return;
        }
        this.mIsRVAvailable = false;
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        Iterator<RewardedVideoSmashListener> it = this.mAllRewardedVideoSmashes.iterator();
        while (it.hasNext()) {
            RewardedVideoSmashListener next = it.next();
            if (next != null) {
                next.onRewardedVideoAvailabilityChanged(false);
            }
        }
    }
}
