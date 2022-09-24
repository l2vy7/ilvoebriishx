package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C11502v;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.C11444d;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.u */
public final class C11480u extends C11502v implements RewardedVideoSmashListener {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C11444d f51521m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f51522n;

    /* renamed from: com.ironsource.mediationsdk.u$c */
    class C11481c extends TimerTask {
        C11481c() {
        }

        public final void run() {
            C11480u uVar = C11480u.this;
            uVar.m51209n("load timed out state=" + C11480u.this.mo44580g());
            if (C11480u.this.mo44577d(C11502v.C11503a.LOAD_IN_PROGRESS, C11502v.C11503a.NOT_LOADED)) {
                C11480u.this.f51521m.mo44345a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_TIMED_OUT, "load timed out"), C11480u.this, new Date().getTime() - C11480u.this.f51522n);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C11480u(java.lang.String r4, java.lang.String r5, com.ironsource.mediationsdk.model.NetworkSettings r6, com.ironsource.mediationsdk.sdk.C11444d r7, int r8, com.ironsource.mediationsdk.AbstractAdapter r9) {
        /*
            r3 = this;
            com.ironsource.mediationsdk.model.a r0 = new com.ironsource.mediationsdk.model.a
            org.json.JSONObject r1 = r6.getInterstitialSettings()
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO
            r0.<init>(r6, r1, r2)
            r3.<init>(r0, r9)
            com.ironsource.mediationsdk.model.a r0 = new com.ironsource.mediationsdk.model.a
            org.json.JSONObject r1 = r6.getRewardedVideoSettings()
            r0.<init>(r6, r1, r2)
            r3.f51750b = r0
            org.json.JSONObject r6 = r0.f51347b
            r3.f51751c = r6
            r3.f51749a = r9
            r3.f51521m = r7
            r3.f51754f = r8
            r9.initRewardedVideoForDemandOnly(r4, r5, r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11480u.<init>(java.lang.String, java.lang.String, com.ironsource.mediationsdk.model.NetworkSettings, com.ironsource.mediationsdk.sdk.d, int, com.ironsource.mediationsdk.AbstractAdapter):void");
    }

    /* renamed from: m */
    private void m51208m(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyRewardedVideoSmash " + this.f51750b.f51346a.getProviderName() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m51209n(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyRewardedVideoSmash " + this.f51750b.f51346a.getProviderName() + " : " + str, 0);
    }

    /* renamed from: a */
    public final void mo44534a() {
        m51209n("showRewardedVideo state=" + mo44580g());
        if (mo44577d(C11502v.C11503a.LOADED, C11502v.C11503a.SHOW_IN_PROGRESS)) {
            this.f51749a.showRewardedVideo(this.f51751c, this);
            return;
        }
        this.f51521m.mo44344a(new IronSourceError(IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    /* renamed from: a */
    public final void mo44535a(String str, String str2, JSONObject jSONObject, List<String> list) {
        IronSourceError ironSourceError;
        m51209n("loadRewardedVideo state=" + mo44580g());
        C11502v.C11503a aVar = C11502v.C11503a.NOT_LOADED;
        C11502v.C11503a aVar2 = C11502v.C11503a.LOADED;
        C11502v.C11503a aVar3 = C11502v.C11503a.LOAD_IN_PROGRESS;
        C11502v.C11503a a = mo44570a(new C11502v.C11503a[]{aVar, aVar2}, aVar3);
        if (a == aVar || a == aVar2) {
            this.f51522n = new Date().getTime();
            m51209n("start timer");
            mo44575c(new C11481c());
            if (mo44582i()) {
                this.f51755g = str2;
                this.f51756h = jSONObject;
                this.f51757i = list;
                this.f51749a.loadRewardedVideoForDemandOnlyForBidding(this.f51751c, this, str);
                return;
            }
            this.f51749a.loadRewardedVideoForDemandOnly(this.f51751c, this);
        } else if (a == aVar3) {
            this.f51521m.mo44345a(ironSourceError, this, 0);
        } else {
            ironSourceError = new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, "cannot load because show is in progress");
            this.f51521m.mo44345a(ironSourceError, this, 0);
        }
    }

    /* renamed from: b */
    public final boolean mo44536b() {
        return this.f51749a.isRewardedVideoAvailable(this.f51751c);
    }

    public final void onRewardedVideoAdClicked() {
        m51208m("onRewardedVideoAdClicked");
        this.f51521m.mo44350c(this);
    }

    public final void onRewardedVideoAdClosed() {
        mo44573b(C11502v.C11503a.NOT_LOADED);
        m51208m("onRewardedVideoAdClosed");
        this.f51521m.mo44349b(this);
    }

    public final void onRewardedVideoAdEnded() {
    }

    public final void onRewardedVideoAdOpened() {
        m51208m("onRewardedVideoAdOpened");
        this.f51521m.mo44346a(this);
    }

    public final void onRewardedVideoAdRewarded() {
        m51208m("onRewardedVideoAdRewarded");
        this.f51521m.mo44352e(this);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        mo44573b(C11502v.C11503a.NOT_LOADED);
        m51208m("onRewardedVideoAdClosed error=" + ironSourceError);
        this.f51521m.mo44344a(ironSourceError, this);
    }

    public final void onRewardedVideoAdStarted() {
    }

    public final void onRewardedVideoAdVisible() {
        m51208m("onRewardedVideoAdVisible");
        this.f51521m.mo44351d(this);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    public final void onRewardedVideoInitSuccess() {
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        m51208m("onRewardedVideoLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + mo44580g());
        mo44581h();
        if (mo44577d(C11502v.C11503a.LOAD_IN_PROGRESS, C11502v.C11503a.NOT_LOADED)) {
            this.f51521m.mo44345a(ironSourceError, this, new Date().getTime() - this.f51522n);
        }
    }

    public final void onRewardedVideoLoadSuccess() {
        m51208m("onRewardedVideoLoadSuccess state=" + mo44580g());
        mo44581h();
        if (mo44577d(C11502v.C11503a.LOAD_IN_PROGRESS, C11502v.C11503a.LOADED)) {
            this.f51521m.mo44347a(this, new Date().getTime() - this.f51522n);
        }
    }
}
