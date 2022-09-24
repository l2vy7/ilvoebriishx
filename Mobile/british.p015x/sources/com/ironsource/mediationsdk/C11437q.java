package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.C11502v;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C11415a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.C11442b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.q */
public final class C11437q extends C11502v implements BannerSmashListener {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C11442b f51455m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f51456n;

    /* renamed from: o */
    private String f51457o;

    /* renamed from: p */
    private String f51458p;

    /* renamed from: q */
    private JSONObject f51459q;

    /* renamed from: com.ironsource.mediationsdk.q$a */
    class C11438a extends TimerTask {
        C11438a() {
        }

        public final void run() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("load timed out state=" + C11437q.this.mo44580g());
            if (C11437q.this.mo44577d(C11502v.C11503a.LOAD_IN_PROGRESS, C11502v.C11503a.NOT_LOADED)) {
                C11437q.this.f51455m.mo44457a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "load timed out"), C11437q.this, false, new Date().getTime() - C11437q.this.f51456n);
            }
        }
    }

    public C11437q(String str, String str2, NetworkSettings networkSettings, C11442b bVar, int i, AbstractAdapter abstractAdapter) {
        super(new C11415a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f51455m = bVar;
        this.f51754f = i;
        this.f51457o = str;
        this.f51458p = str2;
        this.f51459q = networkSettings.getBannerSettings();
        this.f51749a.initBannerForBidding(str, str2, this.f51751c, this);
    }

    /* renamed from: a */
    public final void mo44464a() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        if (this.f51749a == null) {
            ironLog.error("destroyBanner() mAdapter == null");
            return;
        }
        C11502v.C11503a aVar = C11502v.C11503a.LOADED;
        C11502v.C11503a aVar2 = C11502v.C11503a.NOT_LOADED;
        if (mo44577d(aVar, aVar2) || mo44577d(C11502v.C11503a.LOAD_IN_PROGRESS, aVar2)) {
            mo44581h();
            this.f51749a.destroyBanner(this.f51750b.f51346a.getBannerSettings());
            return;
        }
        ironLog.error("cannot destroy banner not loaded");
    }

    /* renamed from: a */
    public final void mo44465a(IronSourceBannerLayout ironSourceBannerLayout, String str, String str2, JSONObject jSONObject, List<String> list) {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("loadBanner state=" + mo44580g());
        C11502v.C11503a aVar = C11502v.C11503a.NOT_LOADED;
        C11502v.C11503a[] aVarArr = {aVar, C11502v.C11503a.LOADED};
        C11502v.C11503a aVar2 = C11502v.C11503a.LOAD_IN_PROGRESS;
        C11502v.C11503a a = mo44570a(aVarArr, aVar2);
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            ironLog.error("loadBanner - bannerLayout is null or destroyed");
            this.f51455m.mo44457a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"), this, false, new Date().getTime() - this.f51456n);
        } else if (str == null) {
            ironLog.error("loadBanner - serverData is null");
            this.f51455m.mo44457a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_SERVER_DATA, "serverData==null"), this, false, new Date().getTime() - this.f51456n);
        } else if (this.f51749a == null) {
            ironLog.error("loadBanner - mAdapter is null");
            this.f51455m.mo44457a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "adapter==null"), this, false, new Date().getTime() - this.f51456n);
        } else if (a == aVar) {
            this.f51456n = new Date().getTime();
            ironLog.verbose("start timer");
            mo44575c(new C11438a());
            this.f51755g = str2;
            this.f51756h = jSONObject;
            this.f51757i = list;
            this.f51749a.initBannerForBidding(this.f51457o, this.f51458p, this.f51459q, this);
            this.f51749a.loadBannerForBidding(ironSourceBannerLayout, this.f51459q, this, str);
        } else {
            if (a != aVar2) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, "load while show");
            }
            this.f51455m.mo44457a(ironSourceError, this, false, new Date().getTime() - this.f51456n);
        }
    }

    /* renamed from: b */
    public final String mo44466b() {
        return this.f51750b.f51346a.isMultipleInstances() ? this.f51750b.f51346a.getProviderTypeForReflection() : this.f51750b.f51346a.getProviderName();
    }

    /* renamed from: c */
    public final Map<String, Object> mo44467c() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f51749a;
            String str = "";
            hashMap.put("providerAdapterVersion", abstractAdapter != null ? abstractAdapter.getVersion() : str);
            AbstractAdapter abstractAdapter2 = this.f51749a;
            if (abstractAdapter2 != null) {
                str = abstractAdapter2.getCoreSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
            hashMap.put("spId", this.f51750b.f51346a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f51750b.f51346a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            hashMap.put("instanceType", 2);
            if (!TextUtils.isEmpty(this.f51755g)) {
                hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f51755g);
            }
            JSONObject jSONObject = this.f51756h;
            if (jSONObject != null && jSONObject.length() > 0) {
                hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f51756h);
            }
            if (!TextUtils.isEmpty(this.f51758j)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f51758j);
            }
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + mo44576d() + ")", e);
        }
        return hashMap;
    }

    public final void onBannerAdClicked() {
        C11442b bVar = this.f51455m;
        if (bVar != null) {
            bVar.mo44458a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        C11442b bVar = this.f51455m;
        if (bVar != null) {
            bVar.mo44462d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("");
        C11502v.C11503a aVar = C11502v.C11503a.LOAD_IN_PROGRESS;
        C11502v.C11503a aVar2 = C11502v.C11503a.NOT_LOADED;
        if (mo44577d(aVar, aVar2)) {
            mo44581h();
            boolean z = ironSourceError.getErrorCode() == 606;
            if (this.f51455m != null) {
                this.f51455m.mo44457a(ironSourceError, this, z, new Date().getTime() - this.f51456n);
            }
            mo44573b(aVar2);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("");
        if (mo44577d(C11502v.C11503a.LOAD_IN_PROGRESS, C11502v.C11503a.LOADED)) {
            C11442b bVar = this.f51455m;
            if (bVar != null) {
                bVar.mo44459a(this, view, layoutParams);
            }
            mo44581h();
        }
    }

    public final void onBannerAdScreenDismissed() {
        C11442b bVar = this.f51455m;
        if (bVar != null) {
            bVar.mo44460b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        C11442b bVar = this.f51455m;
        if (bVar != null) {
            bVar.mo44461c(this);
        }
    }

    public final void onBannerAdShown() {
        C11442b bVar = this.f51455m;
        if (bVar != null) {
            bVar.mo44463e(this);
            this.f51455m.mo44461c(this);
        }
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("");
    }

    public final void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose("");
    }
}
