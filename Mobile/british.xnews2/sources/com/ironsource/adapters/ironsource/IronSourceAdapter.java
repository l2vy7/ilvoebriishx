package com.ironsource.adapters.ironsource;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.ironsource.adapters.supersonicads.SupersonicConfig;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C11232E;
import com.ironsource.mediationsdk.C11377f;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.C11447g;
import com.ironsource.mediationsdk.sdk.C11473k;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.C11499n;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.C11515a;
import com.ironsource.sdk.C11524b;
import com.ironsource.sdk.C11531c;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.p287b.C11526b;
import com.ironsource.sdk.p288c.C11532a;
import com.ironsource.sdk.p288c.C11535c;
import com.ironsource.sdk.p293g.C11709e;
import com.ironsource.sdk.p296j.C11727d;
import com.ironsource.sdk.p296j.C11728e;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class IronSourceAdapter extends AbstractAdapter implements ContextProvider.C4951a, C11473k, C11728e {
    private static final int IS_LOAD_EXCEPTION = 1000;
    private static final int IS_SHOW_EXCEPTION = 1001;
    private static final int RV_LOAD_EXCEPTION = 1002;
    private static final int RV_SHOW_EXCEPTION = 1003;
    private static final String VERSION = "7.1.12.2";
    private static AtomicBoolean mDidInitSdk = new AtomicBoolean(false);
    private static String mediationSegment;
    private final String ADM_KEY = "adm";
    private final String CUSTOM_SEGMENT = "custom_Segment";
    private final String DEMAND_SOURCE_NAME = "demandSourceName";
    private final String DYNAMIC_CONTROLLER_CONFIG = "controllerConfig";
    private final String DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
    private final String DYNAMIC_CONTROLLER_URL = "controllerUrl";
    private final String IN_APP_BIDDING_KEY = "inAppBidding";
    private final String IN_APP_BIDDING_VALUE = "true";
    private final String LWS_SUPPORT_STATE = "isSupportedLWS";
    private final String OW_CLIENT_SIDE_CALLBACKS = "useClientSideCallbacks";
    private final String OW_PLACEMENT_ID = "placementId";
    private final String SDK_PLUGIN_TYPE = "SDKPluginType";
    private final String SESSION_ID = "sessionid";
    C11532a mBannerAdContainer = null;
    final ConcurrentHashMap<String, BannerSmashListener> mDemandSourceToBNSmash = new ConcurrentHashMap<>();
    ConcurrentHashMap<String, C11524b> mDemandSourceToISAd = new ConcurrentHashMap<>();
    ConcurrentHashMap<String, InterstitialSmashListener> mDemandSourceToISSmash = new ConcurrentHashMap<>();
    ConcurrentHashMap<String, C11524b> mDemandSourceToRvAd = new ConcurrentHashMap<>();
    ConcurrentHashMap<String, RewardedVideoSmashListener> mDemandSourceToRvSmash = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */
    public C11447g mOfferwallListener;

    private IronSourceAdapter(String str) {
        super(str);
        mediationSegment = null;
        ContextProvider.getInstance().registerLifeCycleListener(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (r8 != false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ironsource.sdk.C11515a convertBannerSize(android.app.Activity r7, com.ironsource.mediationsdk.ISBannerSize r8) {
        /*
            r6 = this;
            java.lang.String r0 = r8.getDescription()
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -387072689: goto L_0x003c;
                case 72205083: goto L_0x0031;
                case 79011241: goto L_0x0026;
                case 1951953708: goto L_0x001b;
                case 1999208305: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0046
        L_0x0010:
            java.lang.String r1 = "CUSTOM"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0019
            goto L_0x0046
        L_0x0019:
            r2 = 4
            goto L_0x0046
        L_0x001b:
            java.lang.String r1 = "BANNER"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0024
            goto L_0x0046
        L_0x0024:
            r2 = 3
            goto L_0x0046
        L_0x0026:
            java.lang.String r1 = "SMART"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x002f
            goto L_0x0046
        L_0x002f:
            r2 = 2
            goto L_0x0046
        L_0x0031:
            java.lang.String r1 = "LARGE"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x003a
            goto L_0x0046
        L_0x003a:
            r2 = 1
            goto L_0x0046
        L_0x003c:
            java.lang.String r1 = "RECTANGLE"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r2 = 0
        L_0x0046:
            r1 = 0
            r3 = 90
            r4 = 50
            r5 = 320(0x140, float:4.48E-43)
            switch(r2) {
                case 0: goto L_0x006c;
                case 1: goto L_0x0070;
                case 2: goto L_0x005f;
                case 3: goto L_0x005c;
                case 4: goto L_0x0051;
                default: goto L_0x0050;
            }
        L_0x0050:
            return r1
        L_0x0051:
            int r8 = r8.getHeight()
            if (r8 == r4) goto L_0x005a
            if (r8 == r3) goto L_0x005a
            return r1
        L_0x005a:
            r3 = r8
            goto L_0x0070
        L_0x005c:
            r3 = 50
            goto L_0x0070
        L_0x005f:
            boolean r8 = com.ironsource.mediationsdk.AdapterUtils.isLargeScreen(r7)
            if (r8 == 0) goto L_0x0069
            r1 = 728(0x2d8, float:1.02E-42)
            r5 = 728(0x2d8, float:1.02E-42)
        L_0x0069:
            if (r8 == 0) goto L_0x005c
            goto L_0x0070
        L_0x006c:
            r5 = 300(0x12c, float:4.2E-43)
            r3 = 250(0xfa, float:3.5E-43)
        L_0x0070:
            int r8 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r7, r5)
            int r7 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r7, r3)
            com.ironsource.sdk.a r1 = new com.ironsource.sdk.a
            r1.<init>(r8, r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adapters.ironsource.IronSourceAdapter.convertBannerSize(android.app.Activity, com.ironsource.mediationsdk.ISBannerSize):com.ironsource.sdk.a");
    }

    private C11524b createBannerAdInstance(String str, C11515a aVar) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("creating banner ad instance for " + str);
        C11531c cVar = new C11531c(str, new IronSourceBannerListener(this, this.mDemandSourceToBNSmash.get(str), str));
        cVar.f51853d = getInitParams();
        cVar.f51851b = true;
        cVar.f51852c = aVar;
        return cVar.mo44620a();
    }

    private C11524b getAdInstance(String str, boolean z, boolean z2, boolean z3) {
        C11531c cVar;
        C11524b bVar = (z3 ? this.mDemandSourceToRvAd : this.mDemandSourceToISAd).get(str);
        if (bVar == null) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("creating ad instance for " + str + " isDemandOnlyForRv=" + z + " isBidder=" + z2 + " isRewarded=" + z3);
            if (z3) {
                IronSourceRewardedVideoListener ironSourceRewardedVideoListener = new IronSourceRewardedVideoListener(this.mDemandSourceToRvSmash.get(str), str, z);
                cVar.f51853d = getInitParams();
                cVar.f51850a = true;
            } else {
                cVar = new C11531c(str, new IronSourceInterstitialListener(this.mDemandSourceToISSmash.get(str), str));
                cVar.f51853d = getInitParams();
            }
            if (z2) {
                cVar.f51851b = true;
            }
            bVar = cVar.mo44620a();
            (z3 ? this.mDemandSourceToRvAd : this.mDemandSourceToISAd).put(str, bVar);
        }
        return bVar;
    }

    private String getDemandSourceName(JSONObject jSONObject) {
        return !TextUtils.isEmpty(jSONObject.optString("demandSourceName")) ? jSONObject.optString("demandSourceName") : getProviderName();
    }

    private HashMap<String, String> getInitParams() {
        HashMap<String, String> hashMap = new HashMap<>();
        String pluginType = getPluginType();
        if (!TextUtils.isEmpty(pluginType)) {
            hashMap.put("SDKPluginType", pluginType);
        }
        if (!TextUtils.isEmpty(mediationSegment)) {
            hashMap.put("custom_Segment", mediationSegment);
        }
        if (!TextUtils.isEmpty(C11232E.m50103a().f50426p)) {
            hashMap.put("sessionid", C11232E.m50103a().f50426p);
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public HashMap<String, String> getOfferwallExtraParams() {
        HashMap<String, String> initParams = getInitParams();
        initParams.put("useClientSideCallbacks", String.valueOf(SupersonicConfig.getConfigObj().getClientSideCallbacks()));
        Map<String, String> offerwallCustomParams = SupersonicConfig.getConfigObj().getOfferwallCustomParams();
        if (offerwallCustomParams != null && !offerwallCustomParams.isEmpty()) {
            initParams.putAll(offerwallCustomParams);
        }
        return initParams;
    }

    private void initInterstitialInternal(String str, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str2) {
        initSDK(str, jSONObject);
        this.mDemandSourceToISSmash.put(str2, interstitialSmashListener);
        interstitialSmashListener.onInterstitialInitSuccess();
    }

    private void initRewardedVideoInternal(String str, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str2) {
        initSDK(str, jSONObject);
        this.mDemandSourceToRvSmash.put(str2, rewardedVideoSmashListener);
    }

    private void initSDK(String str, JSONObject jSONObject) {
        if (mDidInitSdk.compareAndSet(false, true)) {
            String mediationUserId = IronSourceUtils.getMediationUserId();
            int optInt = jSONObject.optInt("debugMode", 0);
            if (isAdaptersDebugEnabled()) {
                optInt = 3;
            }
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("setting debug mode to " + optInt);
            SDKUtils.setDebugMode(optInt);
            SDKUtils.setControllerUrl(jSONObject.optString("controllerUrl"));
            ironLog.verbose("IronSourceNetwork setting controller url to  " + jSONObject.optString("controllerUrl"));
            SDKUtils.setControllerConfig(jSONObject.optString("controllerConfig"));
            ironLog.verbose("IronSourceNetwork setting controller config to  " + jSONObject.optString("controllerConfig"));
            HashMap<String, String> initParams = getInitParams();
            String str2 = C11232E.m50103a().f50417j;
            ironLog.verbose("with appKey=" + str2 + " userId=" + mediationUserId + " parameters " + initParams);
            IronSourceNetwork.setInitListener(new C11727d() {
                public void onFail(C11709e eVar) {
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.verbose("OnNetworkSDKInitListener fail - code:" + eVar.f52426b + " message:" + eVar.f52425a);
                }

                public void onSuccess() {
                    IronLog.ADAPTER_API.verbose("OnNetworkSDKInitListener success");
                }
            });
            IronSourceNetwork.initSDK(ContextProvider.getInstance().getApplicationContext(), str2, mediationUserId, initParams);
        }
    }

    private boolean isValidMetaData(String str, String str2) {
        if (str.equals("do_not_sell")) {
            return MetaDataUtils.isValidCCPAMetaData(str, str2);
        }
        return true;
    }

    private void loadAdInternal(String str, String str2, boolean z, boolean z2, boolean z3) {
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            C11377f.m50856a();
            hashMap.put("adm", C11377f.m50860c(str2));
            C11377f.m50856a();
            hashMap.putAll(C11377f.m50859b(str2));
        }
        C11524b adInstance = getAdInstance(str, z, z2, z3);
        printInstanceExtraParams(hashMap);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("demandSourceName=" + adInstance.f51828c);
        IronSourceNetwork.loadAd(ContextProvider.getInstance().getCurrentActiveActivity(), adInstance, hashMap);
    }

    private void printInstanceExtraParams(Map<String, String> map) {
        if (map != null && map.size() > 0) {
            IronLog.ADAPTER_API.verbose("instance extra params:");
            for (String next : map.keySet()) {
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose(next + "=" + map.get(next));
            }
        }
    }

    private void showAdInternal(C11524b bVar, int i) {
        int b = C11499n.m51312a().mo44568b(i);
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, String.valueOf(b));
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("demandSourceName=" + bVar.f51828c + " showParams=" + hashMap);
        IronSourceNetwork.showAd(bVar, hashMap);
    }

    public static IronSourceAdapter startAdapter(String str) {
        return new IronSourceAdapter(str);
    }

    public void destroyBanner(JSONObject jSONObject) {
        C11526b bVar;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose(demandSourceName + ": destroyBanner()");
        C11532a aVar = this.mBannerAdContainer;
        if (aVar != null) {
            try {
                C11535c cVar = aVar.f51856a;
                if (cVar == null || (bVar = cVar.f51866c) == null) {
                    throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
                }
                bVar.mo44611a("destroyBanner", new JSONObject().put("adViewId", aVar.f51856a.f51864a).put("isBNAutoRemove", false).put("isBannerDisplay", aVar.f51857b));
                this.mBannerAdContainer = null;
            } catch (Exception e) {
                IronLog ironLog2 = IronLog.ADAPTER_API;
                ironLog2.verbose("destroyBanner failed: " + e.getMessage());
            }
        }
    }

    public void earlyInit(String str, String str2, JSONObject jSONObject) {
        if (C11232E.m50103a().f50417j != null) {
            IronSourceUtils.sendAutomationLog(getDemandSourceName(jSONObject) + ": earlyInit");
            initSDK(C11232E.m50103a().f50417j, jSONObject);
            return;
        }
        IronLog.ADAPTER_API.error("Appkey is null for early init");
    }

    public void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose(demandSourceName);
        try {
            loadAdInternal(demandSourceName, (String) null, false, false, true);
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e.getMessage());
            RewardedVideoSmashListener rewardedVideoSmashListener2 = this.mDemandSourceToRvSmash.get(demandSourceName);
            if (rewardedVideoSmashListener2 != null) {
                IronLog ironLog2 = IronLog.ADAPTER_API;
                ironLog2.error("exception " + e.getMessage());
                rewardedVideoSmashListener2.onRewardedVideoLoadFailed(new IronSourceError(1002, e.getMessage()));
                rewardedVideoSmashListener2.onRewardedVideoAvailabilityChanged(false);
            }
        }
    }

    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> getBiddingData() {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("");
        HashMap hashMap = new HashMap();
        String token = IronSourceNetwork.getToken(ContextProvider.getInstance().getApplicationContext());
        if (token != null) {
            hashMap.put("token", token);
        } else {
            ironLog.error("bidding token is null");
            hashMap.put("token", "");
        }
        return hashMap;
    }

    public String getCoreSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    public LoadWhileShowSupportState getLoadWhileShowSupportState(JSONObject jSONObject) {
        LoadWhileShowSupportState loadWhileShowSupportState = this.mLWSSupportState;
        return (jSONObject == null || !jSONObject.optBoolean("isSupportedLWS")) ? loadWhileShowSupportState : LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    public void getOfferwallCredits() {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose(getProviderName() + " getOfferwallCredits");
        try {
            IronSourceNetwork.getOfferWallCredits(this);
        } catch (Exception e) {
            IronLog ironLog2 = IronLog.ADAPTER_API;
            ironLog2.error("exception " + e.getMessage());
        }
    }

    public JSONObject getPlayerBiddingData() {
        JSONObject jSONObject;
        IronLog.ADAPTER_API.verbose("");
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject = IronSourceNetwork.getRawToken(ContextProvider.getInstance().getApplicationContext());
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("getRawToken exception: " + e.getLocalizedMessage());
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject;
        }
        IronLog.ADAPTER_API.error("Player's bidding token is null");
        return jSONObject2;
    }

    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    public String getVersion() {
        return "7.1.12.2";
    }

    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initRewardedVideoInternal(str, jSONObject, rewardedVideoSmashListener, demandSourceName);
        fetchRewardedVideoForAutomaticLoad(jSONObject, rewardedVideoSmashListener);
    }

    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("demandSourceName: " + demandSourceName);
        initSDK(str, jSONObject);
        this.mDemandSourceToBNSmash.put(demandSourceName, bannerSmashListener);
        bannerSmashListener.onBannerInitSuccess();
    }

    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    public void initOfferwall(String str, String str2, JSONObject jSONObject) {
        initSDK(str, jSONObject);
        IronLog.ADAPTER_API.verbose(":initOfferwall");
        postOnUIThread(new Runnable() {
            public void run() {
                try {
                    IronSourceNetwork.initOfferWall(IronSourceAdapter.this.getOfferwallExtraParams(), IronSourceAdapter.this);
                } catch (Exception e) {
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.error(IronSourceAdapter.this.getProviderName() + ":initOfferwall " + e);
                    C11447g access$100 = IronSourceAdapter.this.mOfferwallListener;
                    access$100.mo44236a(false, ErrorBuilder.buildInitFailedError("Adapter initialization failure - " + IronSourceAdapter.this.getProviderName() + " - " + e.getMessage(), IronSourceConstants.OFFERWALL_AD_UNIT));
                }
            }
        });
    }

    public void initRewardedVideoForDemandOnly(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initRewardedVideoInternal(str, jSONObject, rewardedVideoSmashListener, demandSourceName);
    }

    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initRewardedVideoInternal(str, jSONObject, rewardedVideoSmashListener, demandSourceName);
        rewardedVideoSmashListener.onRewardedVideoInitSuccess();
    }

    public boolean isInterstitialReady(JSONObject jSONObject) {
        C11524b bVar = this.mDemandSourceToISAd.get(getDemandSourceName(jSONObject));
        return bVar != null && IronSourceNetwork.isAdAvailableForInstance(bVar);
    }

    public boolean isOfferwallAvailable() {
        return true;
    }

    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        C11524b bVar = this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject));
        return bVar != null && IronSourceNetwork.isAdAvailableForInstance(bVar);
    }

    public void loadBannerForBidding(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("demandSourceName: " + demandSourceName);
        try {
            C11515a convertBannerSize = convertBannerSize(ContextProvider.getInstance().getCurrentActiveActivity(), ironSourceBannerLayout.getSize());
            if (convertBannerSize == null) {
                bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
                return;
            }
            HashMap hashMap = new HashMap();
            if (str != null) {
                C11377f.m50856a();
                hashMap.put("adm", C11377f.m50860c(str));
                C11377f.m50856a();
                hashMap.putAll(C11377f.m50859b(str));
                printInstanceExtraParams(hashMap);
            }
            IronSourceNetwork.loadAd(ContextProvider.getInstance().getCurrentActiveActivity(), createBannerAdInstance(demandSourceName, convertBannerSize), hashMap);
        } catch (Exception e) {
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - " + e.getMessage()));
        }
    }

    public void loadInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), (String) null, false, false, false);
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e.getMessage());
            interstitialSmashListener.onInterstitialAdLoadFailed(new IronSourceError(1000, e.getMessage()));
        }
    }

    public void loadInterstitialForBidding(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), str, false, true, false);
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("for bidding exception " + e.getMessage());
            interstitialSmashListener.onInterstitialAdLoadFailed(new IronSourceError(1000, e.getMessage()));
        }
    }

    public void loadRewardedVideoForBidding(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), str, false, true, true);
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new IronSourceError(1002, e.getMessage()));
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        }
    }

    public void loadRewardedVideoForDemandOnly(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), (String) null, true, false, true);
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new IronSourceError(1002, e.getMessage()));
        }
    }

    public void loadRewardedVideoForDemandOnlyForBidding(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), str, true, true, true);
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new IronSourceError(1002, e.getMessage()));
        }
    }

    public void onGetOWCreditsFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.onGetOfferwallCreditsFailed(ErrorBuilder.buildGenericError(str));
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
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("onOWShowSuccess(placementId:" + str + ")");
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
        IronLog.ADAPTER_API.verbose("IronSourceNetwork.onPause");
        IronSourceNetwork.onPause(activity);
    }

    public void onResume(Activity activity) {
        IronLog.ADAPTER_API.verbose("IronSourceNetwork.onResume");
        IronSourceNetwork.onResume(activity);
    }

    public void reloadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.warning("unsupported method");
    }

    public void setConsent(boolean z) {
        IronLog ironLog = IronLog.ADAPTER_API;
        StringBuilder sb = new StringBuilder("(");
        sb.append(z ? "true" : "false");
        sb.append(")");
        ironLog.verbose(sb.toString());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("consent", z ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : SessionDescription.SUPPORTED_SDP_VERSION);
            IronSourceNetwork.updateMetadata(jSONObject);
        } catch (JSONException e) {
            IronLog ironLog2 = IronLog.ADAPTER_API;
            ironLog2.error("exception " + e.getMessage());
        }
    }

    public void setInternalOfferwallListener(C11447g gVar) {
        this.mOfferwallListener = gVar;
    }

    public void setMediationSegment(String str) {
        mediationSegment = str;
    }

    public void setMetaData(String str, String str2) {
        if (!mDidInitSdk.get()) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("key=" + str + ", value=" + str2);
            if (!isValidMetaData(str, str2)) {
                ironLog.verbose("MetaData not valid");
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

    public boolean shouldBindBannerViewOnReload() {
        return true;
    }

    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            showAdInternal(this.mDemandSourceToISAd.get(getDemandSourceName(jSONObject)), 2);
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e.getMessage());
            interstitialSmashListener.onInterstitialAdShowFailed(new IronSourceError(1001, e.getMessage()));
        }
    }

    public void showOfferwall(String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose(getProviderName() + " showOfferWall");
        try {
            HashMap<String, String> offerwallExtraParams = getOfferwallExtraParams();
            offerwallExtraParams.put("placementId", str);
            IronSourceNetwork.showOfferWall(ContextProvider.getInstance().getCurrentActiveActivity(), offerwallExtraParams);
        } catch (Exception e) {
            IronLog ironLog2 = IronLog.ADAPTER_API;
            ironLog2.error("exception " + e.getMessage());
        }
    }

    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            showAdInternal(this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject)), 1);
        } catch (Exception e) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(new IronSourceError(1003, e.getMessage()));
        }
    }
}
