package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.C11347b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C11415a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.R */
public final class C11254R extends C11261V implements InterstitialSmashListener {
    /* access modifiers changed from: package-private */

    /* renamed from: h */
    public C11255a f50551h = C11254R.C11255a.NO_INIT;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C11253Q f50552i;

    /* renamed from: j */
    private Timer f50553j;

    /* renamed from: k */
    private int f50554k;

    /* renamed from: l */
    private String f50555l;

    /* renamed from: m */
    private String f50556m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f50557n;

    /* renamed from: o */
    private final Object f50558o = new Object();

    /* renamed from: com.ironsource.mediationsdk.R$a */
    public enum C11255a {
        NO_INIT,
        INIT_IN_PROGRESS,
        INIT_SUCCESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED
    }

    /* renamed from: com.ironsource.mediationsdk.R$b */
    class C11256b extends TimerTask {
        C11256b() {
        }

        public final void run() {
            C11254R r = C11254R.this;
            r.m50305y("timed out state=" + C11254R.this.f50551h.name() + " isBidder=" + C11254R.this.mo43923h());
            if (C11254R.this.f50551h != C11254R.C11255a.INIT_IN_PROGRESS || !C11254R.this.mo43923h()) {
                C11254R.this.m50299s(C11254R.C11255a.LOAD_FAILED);
                C11254R.this.f50552i.mo43889a(ErrorBuilder.buildLoadFailedError("timed out"), C11254R.this, new Date().getTime() - C11254R.this.f50557n);
                return;
            }
            C11254R.this.m50299s(C11254R.C11255a.NO_INIT);
        }
    }

    public C11254R(String str, String str2, NetworkSettings networkSettings, C11253Q q, int i, AbstractAdapter abstractAdapter) {
        super(new C11415a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f50555l = str;
        this.f50556m = str2;
        this.f50552i = q;
        this.f50553j = null;
        this.f50554k = i;
        this.f50598a.addInterstitialListener(this);
    }

    /* renamed from: A */
    private void m50295A() {
        try {
            String str = C11232E.m50103a().f50431u;
            if (!TextUtils.isEmpty(str)) {
                this.f50598a.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f50598a.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
            }
        } catch (Exception e) {
            m50305y("setCustomParams() " + e.getMessage());
        }
    }

    /* renamed from: B */
    private void m50296B() {
        synchronized (this.f50558o) {
            Timer timer = this.f50553j;
            if (timer != null) {
                timer.cancel();
                this.f50553j = null;
            }
        }
    }

    /* renamed from: C */
    private void m50297C() {
        synchronized (this.f50558o) {
            m50305y("start timer");
            m50296B();
            Timer timer = new Timer();
            this.f50553j = timer;
            timer.schedule(new C11256b(), (long) (this.f50554k * 1000));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m50299s(C11255a aVar) {
        m50305y("current state=" + this.f50551h + ", new state=" + aVar);
        this.f50551h = aVar;
    }

    /* renamed from: x */
    private void m50304x(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "ProgIsSmash " + mo43926k() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m50305y(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + mo43926k() + " : " + str, 0);
    }

    /* renamed from: z */
    private void m50306z(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + mo43926k() + " : " + str, 3);
    }

    /* renamed from: a */
    public final Map<String, Object> mo43896a() {
        try {
            if (mo43923h()) {
                return this.f50598a.getInterstitialBiddingData(this.f50601d);
            }
            return null;
        } catch (Throwable th) {
            m50306z("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo43897a(String str) {
        try {
            this.f50557n = new Date().getTime();
            m50305y("loadInterstitial");
            this.f50600c = false;
            if (mo43923h()) {
                m50297C();
                m50299s(C11254R.C11255a.LOAD_IN_PROGRESS);
                this.f50598a.loadInterstitialForBidding(this.f50601d, this, str);
            } else if (this.f50551h == C11254R.C11255a.NO_INIT) {
                m50297C();
                m50299s(C11254R.C11255a.INIT_IN_PROGRESS);
                m50295A();
                this.f50598a.initInterstitial(this.f50555l, this.f50556m, this.f50601d, this);
            } else {
                m50297C();
                m50299s(C11254R.C11255a.LOAD_IN_PROGRESS);
                this.f50598a.loadInterstitial(this.f50601d, this);
            }
        } catch (Throwable th) {
            m50306z("loadInterstitial exception: " + th.getLocalizedMessage());
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo43898b() {
        m50305y("initForBidding()");
        m50299s(C11254R.C11255a.INIT_IN_PROGRESS);
        m50295A();
        try {
            this.f50598a.initInterstitialForBidding(this.f50555l, this.f50556m, this.f50601d, this);
        } catch (Throwable th) {
            m50306z(mo43926k() + "loadInterstitial exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* renamed from: c */
    public final void mo43899c() {
        try {
            this.f50598a.showInterstitial(this.f50601d, this);
        } catch (Throwable th) {
            m50306z(mo43926k() + "showInterstitial exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            this.f50552i.mo43888a(new IronSourceError(IronSourceError.ERROR_IS_SHOW_EXCEPTION, th.getLocalizedMessage()), this);
        }
    }

    /* renamed from: f */
    public final void mo43900f() {
        this.f50598a.setMediationState(C11347b.C11348a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
    }

    /* renamed from: g */
    public final boolean mo43901g() {
        try {
            return this.f50598a.isInterstitialReady(this.f50601d);
        } catch (Throwable th) {
            m50306z("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return false;
        }
    }

    public final void onInterstitialAdClicked() {
        m50304x("onInterstitialAdClicked");
        this.f50552i.mo43893d(this);
    }

    public final void onInterstitialAdClosed() {
        m50304x("onInterstitialAdClosed");
        this.f50552i.mo43890b(this);
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        m50304x("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + this.f50551h.name());
        m50296B();
        if (this.f50551h == C11254R.C11255a.LOAD_IN_PROGRESS) {
            m50299s(C11254R.C11255a.LOAD_FAILED);
            this.f50552i.mo43889a(ironSourceError, this, new Date().getTime() - this.f50557n);
        }
    }

    public final void onInterstitialAdOpened() {
        m50304x("onInterstitialAdOpened");
        this.f50552i.mo43886a(this);
    }

    public final void onInterstitialAdReady() {
        m50304x("onInterstitialAdReady state=" + this.f50551h.name());
        m50296B();
        if (this.f50551h == C11254R.C11255a.LOAD_IN_PROGRESS) {
            m50299s(C11254R.C11255a.LOADED);
            this.f50552i.mo43887a(this, new Date().getTime() - this.f50557n);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        m50304x("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f50552i.mo43888a(ironSourceError, this);
    }

    public final void onInterstitialAdShowSucceeded() {
        m50304x("onInterstitialAdShowSucceeded");
        this.f50552i.mo43892c(this);
    }

    public final void onInterstitialAdVisible() {
        m50304x("onInterstitialAdVisible");
        this.f50552i.mo43894e(this);
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        m50304x("onInterstitialInitFailed error" + ironSourceError.getErrorMessage() + " state=" + this.f50551h.name());
        if (this.f50551h == C11254R.C11255a.INIT_IN_PROGRESS) {
            m50296B();
            m50299s(C11254R.C11255a.NO_INIT);
            this.f50552i.mo43891b(ironSourceError, this);
            if (!mo43923h()) {
                this.f50552i.mo43889a(ironSourceError, this, new Date().getTime() - this.f50557n);
            }
        }
    }

    public final void onInterstitialInitSuccess() {
        m50304x("onInterstitialInitSuccess state=" + this.f50551h.name());
        if (this.f50551h == C11254R.C11255a.INIT_IN_PROGRESS) {
            m50296B();
            if (mo43923h()) {
                m50299s(C11254R.C11255a.INIT_SUCCESS);
            } else {
                m50299s(C11254R.C11255a.LOAD_IN_PROGRESS);
                m50297C();
                try {
                    this.f50598a.loadInterstitial(this.f50601d, this);
                } catch (Throwable th) {
                    m50306z("onInterstitialInitSuccess exception: " + th.getLocalizedMessage());
                    th.printStackTrace();
                }
            }
            this.f50552i.mo43895f(this);
        }
    }
}
