package com.ironsource.mediationsdk.sdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.p277a.C11308a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p276a.C11292d;
import com.ironsource.mediationsdk.p276a.C11296h;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.sdk.j */
public final class C11450j implements InterstitialListener, RewardedVideoListener, SegmentListener, C11447g {

    /* renamed from: a */
    public RewardedVideoListener f51466a;

    /* renamed from: b */
    public InterstitialListener f51467b;

    /* renamed from: c */
    public OfferwallListener f51468c;

    /* renamed from: d */
    public SegmentListener f51469d;

    /* renamed from: e */
    public InterstitialPlacement f51470e = null;

    /* renamed from: f */
    public String f51471f = null;

    /* renamed from: g */
    private C11472v f51472g;

    /* renamed from: h */
    private long f51473h;

    /* renamed from: com.ironsource.mediationsdk.sdk.j$a */
    class C11451a implements Runnable {

        /* renamed from: b */
        private /* synthetic */ IronSourceError f51474b;

        C11451a(IronSourceError ironSourceError) {
            this.f51474b = ironSourceError;
        }

        public final void run() {
            C11450j.this.f51468c.onOfferwallShowFailed(this.f51474b);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$b */
    class C11452b implements Runnable {

        /* renamed from: b */
        private /* synthetic */ IronSourceError f51476b;

        C11452b(IronSourceError ironSourceError) {
            this.f51476b = ironSourceError;
        }

        public final void run() {
            C11450j.this.f51468c.onGetOfferwallCreditsFailed(this.f51476b);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$c */
    class C11453c implements Runnable {
        C11453c() {
        }

        public final void run() {
            C11450j.this.f51466a.onRewardedVideoAdOpened();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$d */
    class C11454d implements Runnable {
        C11454d() {
        }

        public final void run() {
            C11450j.this.f51468c.onOfferwallClosed();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$e */
    class C11455e implements Runnable {

        /* renamed from: b */
        private /* synthetic */ boolean f51480b;

        C11455e(boolean z) {
            this.f51480b = z;
        }

        public final void run() {
            C11450j.this.f51468c.onOfferwallAvailable(this.f51480b);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$f */
    class C11456f implements Runnable {
        C11456f() {
        }

        public final void run() {
            C11450j.this.f51466a.onRewardedVideoAdClosed();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$g */
    class C11457g implements Runnable {

        /* renamed from: b */
        private /* synthetic */ boolean f51483b;

        C11457g(boolean z) {
            this.f51483b = z;
        }

        public final void run() {
            C11450j.this.f51466a.onRewardedVideoAvailabilityChanged(this.f51483b);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$h */
    class C11458h implements Runnable {
        C11458h() {
        }

        public final void run() {
            C11450j.this.f51466a.onRewardedVideoAdStarted();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$i */
    class C11459i implements Runnable {
        C11459i() {
        }

        public final void run() {
            C11450j.this.f51466a.onRewardedVideoAdEnded();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$j */
    class C11460j implements Runnable {

        /* renamed from: b */
        private /* synthetic */ Placement f51487b;

        C11460j(Placement placement) {
            this.f51487b = placement;
        }

        public final void run() {
            C11450j.this.f51466a.onRewardedVideoAdRewarded(this.f51487b);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$k */
    class C11461k implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f51489b;

        C11461k(String str) {
            this.f51489b = str;
        }

        public final void run() {
            if (!TextUtils.isEmpty(this.f51489b)) {
                C11450j.this.f51469d.onSegmentReceived(this.f51489b);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$l */
    class C11462l implements Runnable {

        /* renamed from: b */
        private /* synthetic */ Placement f51491b;

        C11462l(Placement placement) {
            this.f51491b = placement;
        }

        public final void run() {
            C11450j.this.f51466a.onRewardedVideoAdClicked(this.f51491b);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$m */
    class C11463m implements Runnable {

        /* renamed from: b */
        private /* synthetic */ IronSourceError f51493b;

        C11463m(IronSourceError ironSourceError) {
            this.f51493b = ironSourceError;
        }

        public final void run() {
            C11450j.this.f51466a.onRewardedVideoAdShowFailed(this.f51493b);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$n */
    class C11464n implements Runnable {
        C11464n() {
        }

        public final void run() {
            C11450j.this.f51467b.onInterstitialAdReady();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$o */
    class C11465o implements Runnable {

        /* renamed from: b */
        private /* synthetic */ IronSourceError f51496b;

        C11465o(IronSourceError ironSourceError) {
            this.f51496b = ironSourceError;
        }

        public final void run() {
            C11450j.this.f51467b.onInterstitialAdLoadFailed(this.f51496b);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$p */
    class C11466p implements Runnable {
        C11466p() {
        }

        public final void run() {
            C11450j.this.f51467b.onInterstitialAdOpened();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$q */
    class C11467q implements Runnable {
        C11467q() {
        }

        public final void run() {
            C11450j.this.f51467b.onInterstitialAdShowSucceeded();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$r */
    class C11468r implements Runnable {

        /* renamed from: b */
        private /* synthetic */ IronSourceError f51500b;

        C11468r(IronSourceError ironSourceError) {
            this.f51500b = ironSourceError;
        }

        public final void run() {
            C11450j.this.f51467b.onInterstitialAdShowFailed(this.f51500b);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$s */
    class C11469s implements Runnable {
        C11469s() {
        }

        public final void run() {
            C11450j.this.f51467b.onInterstitialAdClicked();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$t */
    class C11470t implements Runnable {
        C11470t() {
        }

        public final void run() {
            C11450j.this.f51467b.onInterstitialAdClosed();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$u */
    class C11471u implements Runnable {
        C11471u() {
        }

        public final void run() {
            C11450j.this.f51468c.onOfferwallOpened();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.j$v */
    class C11472v extends Thread {

        /* renamed from: b */
        Handler f51505b;

        private C11472v() {
        }

        /* synthetic */ C11472v(C11450j jVar, byte b) {
            this();
        }

        public final void run() {
            Looper.prepare();
            this.f51505b = new Handler();
            Looper.loop();
        }
    }

    public C11450j() {
        C11472v vVar = new C11472v(this, (byte) 0);
        this.f51472g = vVar;
        vVar.start();
        this.f51473h = new Date().getTime();
    }

    /* renamed from: b */
    private void m51177b(Runnable runnable) {
        Handler handler;
        C11472v vVar = this.f51472g;
        if (vVar != null && (handler = vVar.f51505b) != null) {
            handler.post(runnable);
        }
    }

    /* renamed from: c */
    private boolean m51178c(Object obj) {
        return (obj == null || this.f51472g == null) ? false : true;
    }

    /* renamed from: a */
    public final void mo44500a(IronSourceError ironSourceError, Map<String, Object> map) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "onRewardedVideoAdShowFailed(" + ironSourceError.toString() + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage());
            if (!TextUtils.isEmpty(this.f51471f)) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f51471f);
            }
            if (map != null) {
                for (String next : map.keySet()) {
                    mediationAdditionalData.put(next, map.get(next));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C11296h.m50466e().mo43979b(new C11308a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, mediationAdditionalData));
        if (m51178c(this.f51466a)) {
            m51177b(new C11463m(ironSourceError));
        }
    }

    /* renamed from: a */
    public final void mo44236a(boolean z, IronSourceError ironSourceError) {
        String str = "onOfferwallAvailable(isAvailable: " + z + ")";
        if (ironSourceError != null) {
            str = str + ", error: " + ironSourceError.getErrorMessage();
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_STATUS, String.valueOf(z));
            if (ironSourceError != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C11296h.m50466e().mo43979b(new C11308a(IronSourceConstants.OFFERWALL_AVAILABLE, mediationAdditionalData));
        if (m51178c(this.f51468c)) {
            m51177b(new C11455e(z));
        }
    }

    /* renamed from: a */
    public final void mo44501a(boolean z, Map<String, Object> map) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAvailabilityChanged(available:" + z + ")", 1);
        long time = new Date().getTime() - this.f51473h;
        this.f51473h = new Date().getTime();
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, time);
            if (map != null) {
                for (String next : map.keySet()) {
                    mediationAdditionalData.put(next, map.get(next));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C11296h.m50466e().mo43979b(new C11308a(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, mediationAdditionalData));
        if (m51178c(this.f51466a)) {
            m51177b(new C11457g(z));
        }
    }

    public final void onGetOfferwallCreditsFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        if (m51178c(this.f51468c)) {
            m51177b(new C11452b(ironSourceError));
        }
    }

    public final void onInterstitialAdClicked() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked()", 1);
        if (m51178c(this.f51467b)) {
            m51177b(new C11469s());
        }
    }

    public final void onInterstitialAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed()", 1);
        if (m51178c(this.f51467b)) {
            m51177b(new C11470t());
        }
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onInterstitialAdLoadFailed(" + ironSourceError + ")", 1);
        if (m51178c(this.f51467b)) {
            m51177b(new C11465o(ironSourceError));
        }
    }

    public final void onInterstitialAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened()", 1);
        if (m51178c(this.f51467b)) {
            m51177b(new C11466p());
        }
    }

    public final void onInterstitialAdReady() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady()", 1);
        if (m51178c(this.f51467b)) {
            m51177b(new C11464n());
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            InterstitialPlacement interstitialPlacement = this.f51470e;
            if (interstitialPlacement != null && !TextUtils.isEmpty(interstitialPlacement.getPlacementName())) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f51470e.getPlacementName());
            }
            if (ironSourceError.getErrorMessage() != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C11292d.m50446e().mo43979b(new C11308a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, mediationAdditionalData));
        if (m51178c(this.f51467b)) {
            m51177b(new C11468r(ironSourceError));
        }
    }

    public final void onInterstitialAdShowSucceeded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
        if (m51178c(this.f51467b)) {
            m51177b(new C11467q());
        }
    }

    public final boolean onOfferwallAdCredited(int i, int i2, boolean z) {
        OfferwallListener offerwallListener = this.f51468c;
        boolean onOfferwallAdCredited = offerwallListener != null ? offerwallListener.onOfferwallAdCredited(i, i2, z) : false;
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onOfferwallAdCredited(credits:" + i + ", totalCredits:" + i2 + ", totalCreditsFlag:" + z + "):" + onOfferwallAdCredited, 1);
        return onOfferwallAdCredited;
    }

    public final void onOfferwallAvailable(boolean z) {
        mo44236a(z, (IronSourceError) null);
    }

    public final void onOfferwallClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallClosed()", 1);
        if (m51178c(this.f51468c)) {
            m51177b(new C11454d());
        }
    }

    public final void onOfferwallOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallOpened()", 1);
        if (m51178c(this.f51468c)) {
            m51177b(new C11471u());
        }
    }

    public final void onOfferwallShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        if (m51178c(this.f51468c)) {
            m51177b(new C11451a(ironSourceError));
        }
    }

    public final void onRewardedVideoAdClicked(Placement placement) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAdClicked(" + placement.getPlacementName() + ")", 1);
        if (m51178c(this.f51466a)) {
            m51177b(new C11462l(placement));
        }
    }

    public final void onRewardedVideoAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed()", 1);
        if (m51178c(this.f51466a)) {
            m51177b(new C11456f());
        }
    }

    public final void onRewardedVideoAdEnded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdEnded()", 1);
        if (m51178c(this.f51466a)) {
            m51177b(new C11459i());
        }
    }

    public final void onRewardedVideoAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened()", 1);
        if (m51178c(this.f51466a)) {
            m51177b(new C11453c());
        }
    }

    public final void onRewardedVideoAdRewarded(Placement placement) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAdRewarded(" + placement.toString() + ")", 1);
        if (m51178c(this.f51466a)) {
            m51177b(new C11460j(placement));
        }
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        mo44500a(ironSourceError, (Map<String, Object>) null);
    }

    public final void onRewardedVideoAdStarted() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdStarted()", 1);
        if (m51178c(this.f51466a)) {
            m51177b(new C11458h());
        }
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        mo44501a(z, (Map<String, Object>) null);
    }

    public final void onSegmentReceived(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onSegmentReceived(" + str + ")", 1);
        if (m51178c(this.f51469d)) {
            m51177b(new C11461k(str));
        }
    }
}
