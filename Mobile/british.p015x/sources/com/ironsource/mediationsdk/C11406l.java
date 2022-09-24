package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.C11441a;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.l */
public final class C11406l implements BannerSmashListener {

    /* renamed from: a */
    public AbstractAdapter f51290a;

    /* renamed from: b */
    public NetworkSettings f51291b;

    /* renamed from: c */
    private Timer f51292c;

    /* renamed from: d */
    private long f51293d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11407a f51294e = C11407a.NO_INIT;

    /* renamed from: f */
    public int f51295f;
    /* access modifiers changed from: package-private */

    /* renamed from: g */
    public C11441a f51296g;

    /* renamed from: h */
    boolean f51297h;

    /* renamed from: i */
    IronSourceBannerLayout f51298i;

    /* renamed from: com.ironsource.mediationsdk.l$a */
    public enum C11407a {
        NO_INIT,
        INIT_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    /* renamed from: com.ironsource.mediationsdk.l$b */
    class C11408b extends TimerTask {
        C11408b() {
        }

        public final void run() {
            C11441a g;
            IronSourceError ironSourceError;
            cancel();
            if (C11406l.this.f51294e == C11407a.INIT_IN_PROGRESS) {
                C11406l.this.mo44355b(C11407a.NO_INIT);
                C11406l.this.mo44356e("init timed out");
                g = C11406l.this.f51296g;
                ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
            } else if (C11406l.this.f51294e == C11407a.LOAD_IN_PROGRESS) {
                C11406l.this.mo44355b(C11407a.LOAD_FAILED);
                C11406l.this.mo44356e("load timed out");
                g = C11406l.this.f51296g;
                ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "Timed out");
            } else if (C11406l.this.f51294e == C11407a.LOADED) {
                C11406l.this.mo44355b(C11407a.LOAD_FAILED);
                C11406l.this.mo44356e("reload timed out");
                C11406l.this.f51296g.mo44338b(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, "Timed out"), C11406l.this, false);
                return;
            } else {
                return;
            }
            g.mo44336a(ironSourceError, C11406l.this, false);
        }
    }

    C11406l(C11441a aVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, long j, int i) {
        this.f51295f = i;
        this.f51296g = aVar;
        this.f51290a = abstractAdapter;
        this.f51291b = networkSettings;
        this.f51293d = j;
        abstractAdapter.addBannerListener(this);
    }

    /* renamed from: f */
    private void m51054f(String str, String str2) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, str + " Banner exception: " + mo44353a() + " | " + str2, 3);
    }

    /* renamed from: i */
    private void m51056i() {
        if (this.f51290a != null) {
            try {
                String str = C11232E.m50103a().f50431u;
                if (!TextUtils.isEmpty(str)) {
                    this.f51290a.setMediationSegment(str);
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    this.f51290a.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
                }
            } catch (Exception e) {
                mo44356e(":setCustomParams():" + e.toString());
            }
        }
    }

    /* renamed from: j */
    private void m51057j() {
        try {
            Timer timer = this.f51292c;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            m51054f("stopLoadTimer", e.getLocalizedMessage());
        } finally {
            this.f51292c = null;
        }
    }

    /* renamed from: a */
    public final String mo44353a() {
        return this.f51291b.isMultipleInstances() ? this.f51291b.getProviderTypeForReflection() : this.f51291b.getProviderName();
    }

    /* renamed from: a */
    public final void mo44354a(IronSourceBannerLayout ironSourceBannerLayout, String str, String str2) {
        mo44356e("loadBanner");
        this.f51297h = false;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            mo44356e("loadBanner - bannerLayout is null or destroyed");
            this.f51296g.mo44336a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"), this, false);
        } else if (this.f51290a == null) {
            mo44356e("loadBanner - mAdapter is null");
            this.f51296g.mo44336a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "adapter==null"), this, false);
        } else {
            this.f51298i = ironSourceBannerLayout;
            mo44357h();
            if (this.f51294e == C11407a.NO_INIT) {
                mo44355b(C11407a.INIT_IN_PROGRESS);
                m51056i();
                this.f51290a.initBanners(str, str2, this.f51291b.getBannerSettings(), this);
                return;
            }
            mo44355b(C11407a.LOAD_IN_PROGRESS);
            this.f51290a.loadBanner(ironSourceBannerLayout, this.f51291b.getBannerSettings(), this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo44355b(C11407a aVar) {
        this.f51294e = aVar;
        mo44356e("state=" + aVar.name());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo44356e(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
        logger.log(ironSourceTag, "BannerSmash " + mo44353a() + " " + str, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo44357h() {
        try {
            m51057j();
            Timer timer = new Timer();
            this.f51292c = timer;
            timer.schedule(new C11408b(), this.f51293d);
        } catch (Exception e) {
            m51054f("startLoadTimer", e.getLocalizedMessage());
        }
    }

    public final void onBannerAdClicked() {
        C11441a aVar = this.f51296g;
        if (aVar != null) {
            aVar.mo44333a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        C11441a aVar = this.f51296g;
        if (aVar != null) {
            aVar.mo44340d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        mo44356e("onBannerAdLoadFailed()");
        m51057j();
        boolean z = ironSourceError.getErrorCode() == 606;
        C11407a aVar = this.f51294e;
        if (aVar == C11407a.LOAD_IN_PROGRESS) {
            mo44355b(C11407a.LOAD_FAILED);
            this.f51296g.mo44336a(ironSourceError, this, z);
        } else if (aVar == C11407a.LOADED) {
            this.f51296g.mo44338b(ironSourceError, this, z);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        mo44356e("onBannerAdLoaded()");
        m51057j();
        C11407a aVar = this.f51294e;
        if (aVar == C11407a.LOAD_IN_PROGRESS) {
            mo44355b(C11407a.LOADED);
            this.f51296g.mo44334a(this, view, layoutParams);
        } else if (aVar == C11407a.LOADED) {
            this.f51296g.mo44335a(this, view, layoutParams, this.f51290a.shouldBindBannerViewOnReload());
        }
    }

    public final void onBannerAdScreenDismissed() {
        C11441a aVar = this.f51296g;
        if (aVar != null) {
            aVar.mo44337b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        C11441a aVar = this.f51296g;
        if (aVar != null) {
            aVar.mo44339c(this);
        }
    }

    public final void onBannerAdShown() {
        C11441a aVar = this.f51296g;
        if (aVar != null) {
            aVar.mo44341e(this);
        }
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        m51057j();
        if (this.f51294e == C11407a.INIT_IN_PROGRESS) {
            this.f51296g.mo44336a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, "Banner init failed"), this, false);
            mo44355b(C11407a.NO_INIT);
        }
    }

    public final void onBannerInitSuccess() {
        m51057j();
        if (this.f51294e == C11407a.INIT_IN_PROGRESS) {
            IronSourceBannerLayout ironSourceBannerLayout = this.f51298i;
            if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
                this.f51296g.mo44336a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, this.f51298i == null ? "banner is null" : "banner is destroyed"), this, false);
                return;
            }
            mo44357h();
            mo44355b(C11407a.LOAD_IN_PROGRESS);
            this.f51290a.loadBanner(this.f51298i, this.f51291b.getBannerSettings(), this);
        }
    }
}
