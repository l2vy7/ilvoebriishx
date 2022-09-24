package com.ironsource.mediationsdk;

import com.appnext.core.AppnextError;
import com.ironsource.mediationsdk.C11347b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.C11449i;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.C */
public final class C11228C extends C11347b implements InterstitialSmashListener {

    /* renamed from: A */
    private int f50364A;

    /* renamed from: x */
    JSONObject f50365x;
    /* access modifiers changed from: package-private */

    /* renamed from: y */
    public C11449i f50366y;
    /* access modifiers changed from: package-private */

    /* renamed from: z */
    public long f50367z;

    /* renamed from: com.ironsource.mediationsdk.C$a */
    class C11229a extends TimerTask {
        C11229a() {
        }

        public final void run() {
            cancel();
            C11228C c = C11228C.this;
            if (c.f50929a == C11347b.C11348a.INIT_PENDING && c.f50366y != null) {
                C11228C.this.mo44177a(C11347b.C11348a.INIT_FAILED);
                C11228C.this.f50366y.mo44014a(ErrorBuilder.buildInitFailedError(AppnextError.TIMEOUT, IronSourceConstants.INTERSTITIAL_AD_UNIT), C11228C.this);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.C$b */
    class C11230b extends TimerTask {
        C11230b() {
        }

        public final void run() {
            cancel();
            C11228C c = C11228C.this;
            if (c.f50929a == C11347b.C11348a.LOAD_PENDING && c.f50366y != null) {
                C11228C.this.mo44177a(C11347b.C11348a.NOT_AVAILABLE);
                C11228C.this.f50366y.mo44015a(ErrorBuilder.buildLoadFailedError(AppnextError.TIMEOUT), C11228C.this, new Date().getTime() - C11228C.this.f50367z);
            }
        }
    }

    C11228C(NetworkSettings networkSettings, int i) {
        super(networkSettings);
        JSONObject interstitialSettings = networkSettings.getInterstitialSettings();
        this.f50365x = interstitialSettings;
        this.f50943o = interstitialSettings.optInt("maxAdsPerIteration", 99);
        this.f50944p = this.f50365x.optInt("maxAdsPerSession", 99);
        this.f50941m = this.f50365x.optInt("maxAdsPerDay", 99);
        this.f50936h = networkSettings.isMultipleInstances();
        this.f50934f = networkSettings.getSubProviderId();
        this.f50364A = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo43722i() {
        this.f50938j = 0;
        mo44177a(C11347b.C11348a.INITIATED);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo43723k() {
        return IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE;
    }

    public final void onInterstitialAdClicked() {
        C11449i iVar = this.f50366y;
        if (iVar != null) {
            iVar.mo44023e(this);
        }
    }

    public final void onInterstitialAdClosed() {
        C11449i iVar = this.f50366y;
        if (iVar != null) {
            iVar.mo44020c(this);
        }
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        mo44184h();
        if (this.f50929a == C11347b.C11348a.LOAD_PENDING && this.f50366y != null) {
            this.f50366y.mo44015a(ironSourceError, this, new Date().getTime() - this.f50367z);
        }
    }

    public final void onInterstitialAdOpened() {
        C11449i iVar = this.f50366y;
        if (iVar != null) {
            iVar.mo44017b(this);
        }
    }

    public final void onInterstitialAdReady() {
        mo44184h();
        if (this.f50929a == C11347b.C11348a.LOAD_PENDING && this.f50366y != null) {
            this.f50366y.mo44013a(this, new Date().getTime() - this.f50367z);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        C11449i iVar = this.f50366y;
        if (iVar != null) {
            iVar.mo44018b(ironSourceError, this);
        }
    }

    public final void onInterstitialAdShowSucceeded() {
        C11449i iVar = this.f50366y;
        if (iVar != null) {
            iVar.mo44022d(this);
        }
    }

    public final void onInterstitialAdVisible() {
        C11449i iVar = this.f50366y;
        if (iVar != null) {
            iVar.mo44025f(this);
        }
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        mo44183g();
        if (this.f50929a == C11347b.C11348a.INIT_PENDING) {
            mo44177a(C11347b.C11348a.INIT_FAILED);
            C11449i iVar = this.f50366y;
            if (iVar != null) {
                iVar.mo44014a(ironSourceError, this);
            }
        }
    }

    public final void onInterstitialInitSuccess() {
        mo44183g();
        if (this.f50929a == C11347b.C11348a.INIT_PENDING) {
            mo44177a(C11347b.C11348a.INITIATED);
            C11449i iVar = this.f50366y;
            if (iVar != null) {
                iVar.mo44012a(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo43734p() {
        try {
            mo44183g();
            Timer timer = new Timer();
            this.f50939k = timer;
            timer.schedule(new C11229a(), (long) (this.f50364A * 1000));
        } catch (Exception e) {
            mo44178b("startInitTimer", e.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo43735q() {
        try {
            mo44184h();
            Timer timer = new Timer();
            this.f50940l = timer;
            timer.schedule(new C11230b(), (long) (this.f50364A * 1000));
        } catch (Exception e) {
            mo44178b("startLoadTimer", e.getLocalizedMessage());
        }
    }
}
