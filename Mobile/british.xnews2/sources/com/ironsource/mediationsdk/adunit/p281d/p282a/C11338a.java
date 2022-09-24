package com.ironsource.mediationsdk.adunit.p281d.p282a;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.p278c.p279a.C11321a;
import com.ironsource.mediationsdk.adunit.p281d.C11337a;
import com.ironsource.mediationsdk.adunit.p281d.p282a.C11340c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C11415a;
import com.ironsource.mediationsdk.model.Placement;

/* renamed from: com.ironsource.mediationsdk.adunit.d.a.a */
public abstract class C11338a<Listener extends C11321a> extends C11340c<Listener> implements AdapterAdInteractionListener {

    /* renamed from: n */
    private BaseAdInteractionAdapter<?, AdapterAdInteractionListener> f50895n;

    public C11338a(C11337a aVar, BaseAdInteractionAdapter<?, ?> baseAdInteractionAdapter, C11415a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
        this.f50895n = baseAdInteractionAdapter;
    }

    /* renamed from: a */
    public final void mo44152a(Placement placement) {
        int i;
        IronLog.INTERNAL.verbose(mo44158c("placementName = " + placement.getPlacementName()));
        try {
            this.f50902f = placement;
            this.f50900d.f50815d.mo44065a(mo44171q());
            this.f50895n.showAd(this.f50906j, this);
        } catch (Throwable th) {
            String str = "showAd - exception = " + th.getLocalizedMessage();
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error(mo44158c(str));
            this.f50900d.f50816e.mo44111l(str);
            IronSource.AD_UNIT ad_unit = this.f50897a.f50886a;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                i = IronSourceError.ERROR_IS_SHOW_EXCEPTION;
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                i = 1038;
            } else {
                ironLog.warning("ad unit not supported - " + ad_unit);
                i = IronSourceError.ERROR_CODE_GENERIC;
            }
            onAdShowFailed(i, str);
        }
    }

    /* renamed from: a */
    public final void mo44153a(boolean z) {
        this.f50900d.f50815d.mo44069a(z);
    }

    /* renamed from: a */
    public final boolean mo44154a() {
        if (this.f50906j != null) {
            try {
                return mo44164h() ? this.f50901e == C11340c.C11341a.LOADED && this.f50895n.isAdAvailable(this.f50906j) : this.f50895n.isAdAvailable(this.f50906j);
            } catch (Throwable th) {
                String str = "isReadyToShow - exception = " + th.getLocalizedMessage();
                IronLog.INTERNAL.error(mo44158c(str));
                this.f50900d.f50816e.mo44111l(str);
            }
        }
        return false;
    }

    public void onAdClosed() {
        String str;
        String str2 = "";
        IronLog.INTERNAL.verbose(mo44158c(str2));
        mo44156b(C11340c.C11341a.NONE);
        if (this.f50897a.f50886a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            String c = ((C11321a) this.f50898b).mo44122c();
            StringBuilder sb = new StringBuilder("otherInstanceAvailable = ");
            if (c.length() > 0) {
                str = "true|" + c;
            } else {
                str = "false";
            }
            sb.append(str);
            str2 = sb.toString();
        }
        this.f50900d.f50815d.mo44067a(mo44171q(), str2);
        ((C11321a) this.f50898b).mo44123c(this);
    }

    public void onAdEnded() {
        IronLog.INTERNAL.verbose(mo44158c(""));
        this.f50900d.f50815d.mo44074f(mo44171q());
        ((C11321a) this.f50898b).mo44125e(this);
    }

    public void onAdOpened() {
        IronLog.INTERNAL.verbose(mo44158c(""));
        mo44156b(C11340c.C11341a.SHOWING);
        this.f50900d.f50815d.mo44071c(mo44171q());
        ((C11321a) this.f50898b).mo44120b((C11338a<?>) this);
    }

    public void onAdShowFailed(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44158c("error = " + i + ", " + str));
        this.f50900d.f50815d.mo44066a(mo44171q(), i, str, "");
        ((C11321a) this.f50898b).mo44118a(new IronSourceError(i, str), (C11338a<?>) this);
    }

    public void onAdShowSuccess() {
        IronLog.INTERNAL.verbose(mo44158c(""));
        this.f50900d.f50815d.mo44070b(mo44171q());
        ((C11321a) this.f50898b).mo44116a((C11338a<?>) this);
    }

    public void onAdStarted() {
        IronLog.INTERNAL.verbose(mo44158c(""));
        this.f50900d.f50815d.mo44073e(mo44171q());
        ((C11321a) this.f50898b).mo44124d(this);
    }

    public void onAdVisible() {
        IronLog.INTERNAL.verbose(mo44158c(""));
        this.f50900d.f50815d.mo44075g(mo44171q());
    }
}
