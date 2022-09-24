package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C11502v;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C11415a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.C11443c;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.s */
public final class C11439s extends C11502v implements InterstitialSmashListener {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C11443c f51461m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f51462n;

    /* renamed from: com.ironsource.mediationsdk.s$a */
    class C11440a extends TimerTask {
        C11440a() {
        }

        public final void run() {
            C11439s sVar = C11439s.this;
            sVar.m51125n("load timed out state=" + C11439s.this.mo44580g());
            if (C11439s.this.mo44577d(C11502v.C11503a.LOAD_IN_PROGRESS, C11502v.C11503a.NOT_LOADED)) {
                C11439s.this.f51461m.mo44324a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_TIMED_OUT, "load timed out"), C11439s.this, new Date().getTime() - C11439s.this.f51462n);
            }
        }
    }

    public C11439s(String str, String str2, NetworkSettings networkSettings, C11443c cVar, int i, AbstractAdapter abstractAdapter) {
        super(new C11415a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f51461m = cVar;
        this.f51754f = i;
        this.f51749a.initInterstitial(str, str2, this.f51751c, this);
    }

    /* renamed from: m */
    private void m51124m(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyInterstitialSmash " + this.f51750b.f51346a.getProviderName() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m51125n(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyInterstitialSmash " + this.f51750b.f51346a.getProviderName() + " : " + str, 0);
    }

    /* renamed from: a */
    public final void mo44469a() {
        m51125n("showInterstitial state=" + mo44580g());
        if (mo44577d(C11502v.C11503a.LOADED, C11502v.C11503a.SHOW_IN_PROGRESS)) {
            this.f51749a.showInterstitial(this.f51751c, this);
            return;
        }
        this.f51461m.mo44323a(new IronSourceError(IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    /* renamed from: a */
    public final void mo44470a(String str, String str2, JSONObject jSONObject, List<String> list) {
        IronSourceError ironSourceError;
        m51125n("loadInterstitial state=" + mo44580g());
        C11502v.C11503a aVar = C11502v.C11503a.NOT_LOADED;
        C11502v.C11503a aVar2 = C11502v.C11503a.LOADED;
        C11502v.C11503a aVar3 = C11502v.C11503a.LOAD_IN_PROGRESS;
        C11502v.C11503a a = mo44570a(new C11502v.C11503a[]{aVar, aVar2}, aVar3);
        if (a == aVar || a == aVar2) {
            this.f51462n = new Date().getTime();
            m51125n("start timer");
            mo44575c(new C11440a());
            if (mo44582i()) {
                this.f51755g = str2;
                this.f51756h = jSONObject;
                this.f51757i = list;
                this.f51749a.loadInterstitialForBidding(this.f51751c, this, str);
                return;
            }
            this.f51749a.loadInterstitial(this.f51751c, this);
        } else if (a == aVar3) {
            this.f51461m.mo44324a(ironSourceError, this, 0);
        } else {
            ironSourceError = new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "cannot load because show is in progress");
            this.f51461m.mo44324a(ironSourceError, this, 0);
        }
    }

    /* renamed from: b */
    public final boolean mo44471b() {
        return this.f51749a.isInterstitialReady(this.f51751c);
    }

    public final void onInterstitialAdClicked() {
        m51124m("onInterstitialAdClicked");
        this.f51461m.mo44329c(this);
    }

    public final void onInterstitialAdClosed() {
        mo44573b(C11502v.C11503a.NOT_LOADED);
        m51124m("onInterstitialAdClosed");
        this.f51461m.mo44328b(this);
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        m51124m("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + mo44580g());
        mo44581h();
        if (mo44577d(C11502v.C11503a.LOAD_IN_PROGRESS, C11502v.C11503a.NOT_LOADED)) {
            this.f51461m.mo44324a(ironSourceError, this, new Date().getTime() - this.f51462n);
        }
    }

    public final void onInterstitialAdOpened() {
        m51124m("onInterstitialAdOpened");
        this.f51461m.mo44325a(this);
    }

    public final void onInterstitialAdReady() {
        m51124m("onInterstitialAdReady state=" + mo44580g());
        mo44581h();
        if (mo44577d(C11502v.C11503a.LOAD_IN_PROGRESS, C11502v.C11503a.LOADED)) {
            this.f51461m.mo44326a(this, new Date().getTime() - this.f51462n);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        mo44573b(C11502v.C11503a.NOT_LOADED);
        m51124m("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f51461m.mo44323a(ironSourceError, this);
    }

    public final void onInterstitialAdShowSucceeded() {
    }

    public final void onInterstitialAdVisible() {
        m51124m("onInterstitialAdVisible");
        this.f51461m.mo44330d(this);
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    public final void onInterstitialInitSuccess() {
    }
}
