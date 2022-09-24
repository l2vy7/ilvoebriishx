package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C11243M;
import com.ironsource.mediationsdk.C11362c0;
import com.ironsource.mediationsdk.adunit.p278c.C11335g;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.model.C11425k;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p285c.C11360a;
import com.ironsource.mediationsdk.p285c.C11361b;
import com.ironsource.mediationsdk.sdk.C11446f;
import com.ironsource.mediationsdk.sdk.C11450j;
import com.ironsource.mediationsdk.sdk.C11473k;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.OfferwallListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.C11484c;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class IronSource {
    public static final String DataSource_MOPUB = "MoPub";

    public enum AD_UNIT {
        REWARDED_VIDEO("rewardedVideo"),
        INTERSTITIAL(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE),
        OFFERWALL("offerwall"),
        BANNER("banner");
        

        /* renamed from: b */
        private String f22094b;

        private AD_UNIT(String str) {
            this.f22094b = str;
        }

        public final String toString() {
            return this.f22094b;
        }
    }

    public static void addImpressionDataListener(ImpressionDataListener impressionDataListener) {
        C11232E a = C11232E.m50103a();
        if (C11360a.m50765a(impressionDataListener, "addImpressionDataListener - listener is null")) {
            C11361b.m50766a().mo44207a(impressionDataListener);
            C11507y yVar = a.f50389Q;
            if (yVar != null) {
                yVar.mo44586a(impressionDataListener);
            }
            C11373e0 e0Var = a.f50390R;
            if (e0Var != null) {
                e0Var.mo44448a(impressionDataListener);
            }
            C11335g gVar = a.f50392T;
            if (gVar != null) {
                gVar.f50872t.add(impressionDataListener);
            }
            C11243M m = a.f50391S;
            if (m != null) {
                m.mo44448a(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void clearRewardedVideoServerParameters() {
        C11232E.m50103a().f50424n = null;
    }

    public static IronSourceBannerLayout createBanner(Activity activity, ISBannerSize iSBannerSize) {
        C11232E a = C11232E.m50103a();
        IronSourceLoggerManager ironSourceLoggerManager = a.f50415i;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            a.f50415i.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new IronSourceBannerLayout(activity, iSBannerSize);
    }

    public static void destroyBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        C11243M m;
        C11232E a = C11232E.m50103a();
        a.f50415i.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (!a.f50404c0 || (m = a.f50391S) == null) {
                C11402k kVar = a.f50413h;
                if (kVar != null) {
                    kVar.mo44331a(ironSourceBannerLayout);
                    return;
                }
                C11436p pVar = a.f50418j0;
                if (pVar != null) {
                    pVar.mo44456a(ironSourceBannerLayout);
                    return;
                }
                return;
            }
            IronLog.INTERNAL.verbose("");
            C11243M.C11245b bVar = new C11243M.C11245b(ironSourceBannerLayout);
            if (ironSourceBannerLayout != null) {
                if (!ironSourceBannerLayout.isDestroyed()) {
                    bVar.mo43866a();
                    return;
                }
            }
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            bVar.mo43867a(String.format("can't destroy banner - %s", objArr));
        } catch (Throwable th) {
            a.f50415i.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    public static String getAdvertiserId(Context context) {
        C11232E.m50103a();
        return C11232E.m50104a(context);
    }

    public static synchronized String getISDemandOnlyBiddingData() {
        String l;
        synchronized (IronSource.class) {
            l = C11232E.m50103a().mo43777l();
        }
        return l;
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        String iSDemandOnlyBiddingData;
        synchronized (IronSource.class) {
            iSDemandOnlyBiddingData = getISDemandOnlyBiddingData();
        }
        return iSDemandOnlyBiddingData;
    }

    public static InterstitialPlacement getInterstitialPlacementInfo(String str) {
        return C11232E.m50103a().mo43773k(str);
    }

    public static void getOfferwallCredits() {
        C11232E a = C11232E.m50103a();
        a.f50415i.log(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", 1);
        try {
            C11473k kVar = a.f50411g.f51063b;
            if (kVar != null) {
                kVar.getOfferwallCredits();
            }
        } catch (Throwable th) {
            a.f50415i.logException(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", th);
        }
    }

    public static Placement getRewardedVideoPlacementInfo(String str) {
        return C11232E.m50103a().mo43776l(str);
    }

    public static void init(Activity activity, String str) {
        init(activity, str, (AD_UNIT[]) null);
    }

    public static void init(Activity activity, String str, AD_UNIT... ad_unitArr) {
        C11232E.m50103a().mo43752a(activity, str, false, (C11446f) null, ad_unitArr);
    }

    @Deprecated
    public static void initISDemandOnly(Activity activity, String str, AD_UNIT... ad_unitArr) {
        C11232E.m50103a().mo43751a((Context) activity, str, (C11446f) null, ad_unitArr);
    }

    public static void initISDemandOnly(Context context, String str, AD_UNIT... ad_unitArr) {
        C11232E.m50103a().mo43751a(context, str, (C11446f) null, ad_unitArr);
    }

    public static boolean isBannerPlacementCapped(String str) {
        return C11232E.m50103a().mo43747K(str);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return C11232E.m50103a().mo43770i(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return C11232E.m50103a().mo43768g(str);
    }

    public static boolean isInterstitialPlacementCapped(String str) {
        return C11232E.m50103a().mo43746I(str);
    }

    public static boolean isInterstitialReady() {
        return C11232E.m50103a().mo43767g();
    }

    public static boolean isOfferwallAvailable() {
        return C11232E.m50103a().mo43772j();
    }

    public static boolean isRewardedVideoAvailable() {
        return C11232E.m50103a().mo43760c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = com.ironsource.mediationsdk.C11232E.C11234b.f50438b[r1 - 1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isRewardedVideoPlacementCapped(java.lang.String r7) {
        /*
            com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.C11232E.m50103a()
            int r1 = r0.mo43748L(r7)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001c
            int[] r5 = com.ironsource.mediationsdk.C11232E.C11234b.f50438b
            int r1 = r1 - r4
            r1 = r5[r1]
            if (r1 == r4) goto L_0x001a
            if (r1 == r2) goto L_0x001a
            r5 = 3
            if (r1 == r5) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            if (r1 == 0) goto L_0x003f
            boolean r5 = r0.f50379G
            boolean r6 = r0.f50395W
            int r0 = r0.f50406d0
            org.json.JSONObject r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r5, r6, r0)
            if (r7 == 0) goto L_0x003a
            java.lang.Object[][] r5 = new java.lang.Object[r4][]
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r6 = "placement"
            r2[r3] = r6
            r2[r4] = r7
            r5[r3] = r2
            com.ironsource.mediationsdk.C11232E.m50127u(r0, r5)
        L_0x003a:
            r7 = 1110(0x456, float:1.555E-42)
            com.ironsource.mediationsdk.C11232E.m50121m(r7, r0)
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.IronSource.isRewardedVideoPlacementCapped(java.lang.String):boolean");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        C11232E.m50103a().mo43753a(ironSourceBannerLayout, "");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        C11232E.m50103a().mo43753a(ironSourceBannerLayout, str);
    }

    public static void loadISDemandOnlyBannerWithAdm(Activity activity, IronSourceBannerLayout ironSourceBannerLayout, String str, String str2) {
        C11232E.m50103a().mo43749a(activity, ironSourceBannerLayout, str, str2);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        C11232E.m50103a().mo43762d(activity, str, (String) null);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitial(String str) {
        C11232E.m50103a().mo43762d((Activity) null, str, (String) null);
    }

    public static void loadISDemandOnlyInterstitialWithAdm(Activity activity, String str, String str2) {
        C11232E.m50103a().mo43759c(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitialWithAdm(String str, String str2) {
        C11232E.m50103a().mo43759c((Activity) null, str, str2);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        C11232E.m50103a().mo43757b(activity, str, (String) null);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideo(String str) {
        C11232E.m50103a().mo43757b((Activity) null, str, (String) null);
    }

    public static void loadISDemandOnlyRewardedVideoWithAdm(Activity activity, String str, String str2) {
        C11232E.m50103a().mo43750a(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideoWithAdm(String str, String str2) {
        C11232E.m50103a().mo43750a((Activity) null, str, str2);
    }

    public static void loadInterstitial() {
        C11232E a = C11232E.m50103a();
        IronSourceLoggerManager ironSourceLoggerManager = a.f50415i;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadInterstitial()", 1);
        try {
            if (a.f50380H) {
                a.f50415i.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                C11434o.m51097a().mo44452a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else if (!a.f50383K) {
                a.f50415i.log(ironSourceTag, "init() must be called before loadInterstitial()", 3);
                C11434o.m51097a().mo44452a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else {
                C11362c0.C11366c b = C11362c0.m50779a().mo44215b();
                if (b == C11362c0.C11366c.INIT_FAILED) {
                    a.f50415i.log(ironSourceTag, "init() had failed", 3);
                    C11434o.m51097a().mo44452a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else if (b == C11362c0.C11366c.INIT_IN_PROGRESS) {
                    if (C11362c0.m50779a().mo44218c()) {
                        a.f50415i.log(ironSourceTag, "init() had failed", 3);
                        C11434o.m51097a().mo44452a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    }
                    a.f50402b0 = true;
                } else if (!a.mo43743F()) {
                    a.f50415i.log(ironSourceTag, "No interstitial configurations found", 3);
                    C11434o.m51097a().mo44452a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else if (!a.f50398Z) {
                    a.f50409f.mo44019c();
                } else {
                    if (a.f50400a0) {
                        C11335g gVar = a.f50392T;
                        if (gVar != null) {
                            gVar.mo44144e();
                            return;
                        }
                    } else {
                        C11373e0 e0Var = a.f50390R;
                        if (e0Var != null) {
                            e0Var.mo44249d();
                            return;
                        }
                    }
                    a.f50402b0 = true;
                }
            }
        } catch (Throwable th) {
            a.f50415i.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            C11434o.m51097a().mo44452a(AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, th.getMessage()));
        }
    }

    public static void onPause(Activity activity) {
        C11232E a = C11232E.m50103a();
        try {
            a.f50415i.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th) {
            a.f50415i.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    public static void onResume(Activity activity) {
        C11232E a = C11232E.m50103a();
        try {
            a.f50415i.log(IronSourceLogger.IronSourceTag.API, "onResume()", 1);
            ContextProvider.getInstance().onResume(activity);
        } catch (Throwable th) {
            a.f50415i.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th);
        }
    }

    public static void removeImpressionDataListener(ImpressionDataListener impressionDataListener) {
        C11232E a = C11232E.m50103a();
        if (C11360a.m50765a(impressionDataListener, "removeImpressionDataListener - listener is null")) {
            C11361b.m50766a().mo44210b(impressionDataListener);
            C11507y yVar = a.f50389Q;
            if (yVar != null) {
                yVar.mo44588b(impressionDataListener);
            }
            C11373e0 e0Var = a.f50390R;
            if (e0Var != null) {
                e0Var.mo44450b(impressionDataListener);
            }
            C11335g gVar = a.f50392T;
            if (gVar != null) {
                gVar.f50872t.remove(impressionDataListener);
            }
            C11243M m = a.f50391S;
            if (m != null) {
                m.mo44450b(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("remove impression data listener from " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void removeInterstitialListener() {
        C11232E a = C11232E.m50103a();
        a.f50415i.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        a.f50421l.f51467b = null;
    }

    public static void removeOfferwallListener() {
        C11232E a = C11232E.m50103a();
        a.f50415i.log(IronSourceLogger.IronSourceTag.API, "removeOfferwallListener()", 1);
        a.f50421l.f51468c = null;
    }

    public static void removeRewardedVideoListener() {
        C11232E a = C11232E.m50103a();
        a.f50415i.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        a.f50421l.f51466a = null;
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        C11232E a = C11232E.m50103a();
        if (C11360a.m50765a(jSONObject, "setAdRevenueData - impressionData is null") && C11360a.m50765a(str, "setAdRevenueData - dataSource is null")) {
            a.f50420k0.mo44315a(str, jSONObject);
        }
    }

    public static void setAdaptersDebug(boolean z) {
        C11232E.m50103a();
        C11232E.m50106a(z);
    }

    public static void setConsent(boolean z) {
        C11232E.m50103a().mo43758b(z);
    }

    public static boolean setDynamicUserId(String str) {
        return C11232E.m50103a().mo43761c(str);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        C11232E.m50103a();
        C11232E.m50105a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        C11232E.m50103a();
        C11232E.m50124q(iSDemandOnlyRewardedVideoListener);
    }

    @Deprecated
    public static void setImpressionDataListener(ImpressionDataListener impressionDataListener) {
        C11232E a = C11232E.m50103a();
        IronLog.API.info("removing all impression data listeners");
        C11361b.m50766a().mo44211c();
        C11507y yVar = a.f50389Q;
        if (yVar != null) {
            yVar.mo44587b();
        }
        C11373e0 e0Var = a.f50390R;
        if (e0Var != null) {
            e0Var.mo44449b();
        }
        C11335g gVar = a.f50392T;
        if (gVar != null) {
            gVar.f50872t.clear();
        }
        C11243M m = a.f50391S;
        if (m != null) {
            m.mo44449b();
        }
        addImpressionDataListener(impressionDataListener);
    }

    public static void setInterstitialListener(InterstitialListener interstitialListener) {
        C11232E a = C11232E.m50103a();
        a.f50415i.log(IronSourceLogger.IronSourceTag.API, interstitialListener == null ? "setInterstitialListener(ISListener:null)" : "setInterstitialListener(ISListener)", 1);
        a.f50421l.f51467b = interstitialListener;
        C11220A.m50068a().mo43688a(interstitialListener);
        C11434o.m51097a().f51443c = interstitialListener;
    }

    public static void setLogListener(LogListener logListener) {
        C11232E a = C11232E.m50103a();
        if (logListener == null) {
            a.f50415i.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
            return;
        }
        a.f50427q.f51317c = logListener;
        IronSourceLoggerManager ironSourceLoggerManager = a.f50415i;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
    }

    public static void setMediationSegment(String str) {
        C11232E a = C11232E.m50103a();
        try {
            IronSourceLoggerManager ironSourceLoggerManager = a.f50415i;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, a.f50399a + ":setMediationSegment(segment:" + str + ")", 1);
            C11484c cVar = new C11484c();
            C11232E.m50125r(str, cVar);
            if (cVar.mo44542a()) {
                a.f50431u = str;
            } else {
                IronSourceLoggerManager.getLogger().log(ironSourceTag, cVar.mo44543b().toString(), 2);
            }
        } catch (Exception e) {
            a.f50415i.logException(IronSourceLogger.IronSourceTag.API, a.f50399a + ":setMediationSegment(segment:" + str + ")", e);
        }
    }

    public static void setMediationType(String str) {
        C11232E.m50103a().mo43763d(str);
    }

    public static void setMetaData(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        C11232E.m50103a().mo43755a(str, (List<String>) arrayList);
    }

    public static void setMetaData(String str, List<String> list) {
        C11232E.m50103a().mo43755a(str, list);
    }

    public static void setOfferwallListener(OfferwallListener offerwallListener) {
        C11232E a = C11232E.m50103a();
        a.f50415i.log(IronSourceLogger.IronSourceTag.API, offerwallListener == null ? "setOfferwallListener(OWListener:null)" : "setOfferwallListener(OWListener)", 1);
        a.f50421l.f51468c = offerwallListener;
    }

    public static void setRewardedVideoListener(RewardedVideoListener rewardedVideoListener) {
        C11232E a = C11232E.m50103a();
        a.f50415i.log(IronSourceLogger.IronSourceTag.API, rewardedVideoListener == null ? "setRewardedVideoListener(RVListener:null)" : "setRewardedVideoListener(RVListener)", 1);
        a.f50421l.f51466a = rewardedVideoListener;
        C11270X.m50368a().mo43943a(rewardedVideoListener);
    }

    public static void setRewardedVideoServerParameters(Map<String, String> map) {
        C11232E a = C11232E.m50103a();
        if (map != null) {
            try {
                if (map.size() != 0) {
                    a.f50415i.log(IronSourceLogger.IronSourceTag.API, a.f50399a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                    a.f50424n = new HashMap(map);
                }
            } catch (Exception e) {
                IronSourceLoggerManager ironSourceLoggerManager = a.f50415i;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.logException(ironSourceTag, a.f50399a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e);
            }
        }
    }

    public static void setSegment(IronSourceSegment ironSourceSegment) {
        C11232E a = C11232E.m50103a();
        if (C11362c0.m50779a().mo44215b() == C11362c0.C11366c.INIT_IN_PROGRESS || C11362c0.m50779a().mo44215b() == C11362c0.C11366c.INITIATED) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Segments must be set prior to Init. Setting a segment after the init will be ignored", 0);
        } else {
            a.f50376D = ironSourceSegment;
        }
    }

    public static void setSegmentListener(SegmentListener segmentListener) {
        C11232E a = C11232E.m50103a();
        C11450j jVar = a.f50421l;
        if (jVar != null) {
            jVar.f51469d = segmentListener;
            C11362c0.m50779a().f51029w = a.f50421l;
        }
    }

    public static void setUserId(String str) {
        C11232E.m50103a().mo43779s(str, true);
    }

    public static void shouldTrackNetworkState(Context context, boolean z) {
        C11232E a = C11232E.m50103a();
        a.f50435y = context;
        a.f50436z = Boolean.valueOf(z);
        if (!a.f50398Z) {
            C11299a0 a0Var = a.f50409f;
            if (a0Var != null) {
                a0Var.mo44027o(context, z);
            }
        } else if (a.f50400a0) {
            C11335g gVar = a.f50392T;
            if (gVar != null) {
                gVar.mo44141b(z);
            }
        } else {
            C11373e0 e0Var = a.f50390R;
            if (e0Var != null) {
                e0Var.mo44248a(z);
            }
        }
        if (a.f50395W) {
            C11507y yVar = a.f50389Q;
            if (yVar != null) {
                yVar.mo44197a(context, z);
                return;
            }
            return;
        }
        C11387g0 g0Var = a.f50407e;
        if (g0Var != null) {
            g0Var.mo44283m(context, z);
        }
    }

    public static void showISDemandOnlyInterstitial(String str) {
        C11232E a = C11232E.m50103a();
        IronSourceLoggerManager ironSourceLoggerManager = a.f50415i;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyInterstitial() instanceId=" + str, 1);
        try {
            if (!a.f50380H) {
                a.f50415i.log(ironSourceTag, "Interstitial was initialized in mediation mode. Use showInterstitial instead", 3);
                return;
            }
            C11401j0 j0Var = a.f50414h0;
            if (j0Var == null) {
                a.f50415i.log(ironSourceTag, "Interstitial video was not initiated", 3);
                C11508z.m51348a().mo44590b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial video was not initiated"));
            } else if (!j0Var.f51262a.containsKey(str)) {
                C11401j0.m50997c(2500, str);
                C11508z.m51348a().mo44590b(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else {
                C11439s sVar = j0Var.f51262a.get(str);
                j0Var.mo44322a((int) IronSourceConstants.IS_INSTANCE_SHOW, sVar);
                sVar.mo44469a();
            }
        } catch (Exception e) {
            a.f50415i.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyInterstitial", e);
            C11508z.m51348a().mo44590b(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        C11232E.m50103a().mo43766f(str);
    }

    public static void showInterstitial() {
        C11232E a = C11232E.m50103a();
        IronSourceLoggerManager ironSourceLoggerManager = a.f50415i;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showInterstitial()", 1);
        try {
            if (a.f50380H) {
                a.f50415i.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                a.f50421l.onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"));
            } else if (!a.mo43743F()) {
                a.f50421l.onInterstitialAdShowFailed(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else {
                InterstitialPlacement E = a.mo43742E();
                if (E != null) {
                    a.mo43769h(E.getPlacementName());
                } else {
                    a.f50421l.onInterstitialAdShowFailed(new IronSourceError(1020, "showInterstitial error: empty default placement in response"));
                }
            }
        } catch (Exception e) {
            a.f50415i.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e);
            a.f50421l.onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e.getMessage()));
        }
    }

    public static void showInterstitial(String str) {
        C11232E.m50103a().mo43769h(str);
    }

    public static void showOfferwall() {
        C11232E a = C11232E.m50103a();
        try {
            a.f50415i.log(IronSourceLogger.IronSourceTag.API, "showOfferwall()", 1);
            if (!a.mo43744G()) {
                a.f50421l.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            C11425k a2 = a.f50430t.f51666c.f51379c.mo44434a();
            if (a2 != null) {
                a.mo43771j(a2.f51397b);
            }
        } catch (Exception e) {
            a.f50415i.logException(IronSourceLogger.IronSourceTag.API, "showOfferwall()", e);
            a.f50421l.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    public static void showOfferwall(String str) {
        C11232E.m50103a().mo43771j(str);
    }

    public static void showRewardedVideo() {
        C11232E a = C11232E.m50103a();
        if (!a.mo43741D()) {
            a.f50421l.onRewardedVideoAdShowFailed(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            a.f50415i.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        Placement z = a.mo43781z();
        if (z == null) {
            a.f50415i.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
            a.f50421l.onRewardedVideoAdShowFailed(new IronSourceError(1021, "showRewardedVideo error: empty default placement in response"));
            return;
        }
        a.mo43764e(z.getPlacementName());
    }

    public static void showRewardedVideo(String str) {
        C11232E.m50103a().mo43764e(str);
    }
}
