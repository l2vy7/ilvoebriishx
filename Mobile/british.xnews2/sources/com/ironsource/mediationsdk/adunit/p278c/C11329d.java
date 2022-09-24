package com.ironsource.mediationsdk.adunit.p278c;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C11220A;
import com.ironsource.mediationsdk.C11270X;
import com.ironsource.mediationsdk.C11389h;
import com.ironsource.mediationsdk.C11392i;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.p278c.C11330e;
import com.ironsource.mediationsdk.adunit.p278c.p279a.C11321a;
import com.ironsource.mediationsdk.adunit.p278c.p280b.C11325a;
import com.ironsource.mediationsdk.adunit.p281d.p282a.C11338a;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p275a.C11291c;
import com.ironsource.mediationsdk.utils.C11484c;
import com.ironsource.mediationsdk.utils.C11499n;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.ironsource.mediationsdk.adunit.c.d */
public abstract class C11329d<Smash extends C11338a<?>, Adapter extends BaseAdInteractionAdapter<?, ? extends AdapterAdInteractionListener>> extends C11330e<Smash, Adapter> implements C11321a {
    public C11329d(C11320a aVar, Set<ImpressionDataListener> set) {
        super(aVar, set);
    }

    /* renamed from: F */
    private void m50607F(IronSourceError ironSourceError, String str) {
        this.f50871s.f50815d.mo44066a(mo44149t(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.f50869q.mo44133b();
        this.f50873u.mo44129c(ironSourceError);
        if (this.f50867o.f50838h.mo44131b()) {
            mo44147l(false, false);
        }
    }

    /* renamed from: a */
    public final void mo44116a(C11338a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44143d(aVar.mo44166l()));
        C11324b bVar = this.f50873u;
        IronSource.AD_UNIT ad_unit = bVar.f50840a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            C11220A.m50068a().mo43693e();
        } else if (ad_unit != IronSource.AD_UNIT.REWARDED_VIDEO) {
            ironLog.warning("ad unit not supported - " + bVar.f50840a);
        }
    }

    /* renamed from: a */
    public final void mo44118a(IronSourceError ironSourceError, C11338a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44143d(aVar.mo44166l() + " - error = " + ironSourceError));
        this.f50855c.put(aVar.mo43926k(), C11392i.C11393a.ISAuctionPerformanceFailedToShow);
        mo44146h(C11330e.C11331a.READY_TO_LOAD);
        m50607F(ironSourceError, "");
    }

    /* renamed from: a */
    public final void mo44136a(Placement placement) {
        C11338a aVar;
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44143d("state = " + this.f50868p));
        synchronized (this.f50874v) {
            this.f50862j = placement;
            this.f50871s.f50815d.mo44065a(mo44149t());
            C11330e.C11331a aVar2 = this.f50868p;
            C11330e.C11331a aVar3 = C11330e.C11331a.SHOWING;
            int i = IronSourceError.ERROR_CODE_GENERIC;
            aVar = null;
            if (aVar2 == aVar3) {
                IronSource.AD_UNIT ad_unit = this.f50867o.f50831a;
                if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                    i = 1036;
                } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i = 1022;
                } else {
                    ironLog.warning("ad unit not supported - " + ad_unit);
                }
                ironSourceError = new IronSourceError(i, "can't show ad while an ad is already showing");
            } else if (aVar2 != C11330e.C11331a.READY_TO_SHOW) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while no ads are available");
            } else if (placement == null) {
                IronSource.AD_UNIT ad_unit2 = this.f50867o.f50831a;
                if (ad_unit2 == IronSource.AD_UNIT.INTERSTITIAL) {
                    i = 1020;
                } else if (ad_unit2 == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i = 1021;
                } else {
                    ironLog.warning("ad unit not supported - " + ad_unit2);
                }
                ironSourceError = new IronSourceError(i, "empty default placement");
            } else if (C11484c.m51236a(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName(), this.f50867o.f50831a)) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, "placement " + placement.getPlacementName() + " is capped");
            } else {
                ironSourceError = null;
            }
            if (ironSourceError != null) {
                IronLog.API.error(mo44143d(ironSourceError.getErrorMessage()));
                m50607F(ironSourceError, "");
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                Iterator<Smash> it = this.f50853a.mo44172a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C11338a aVar4 = (C11338a) it.next();
                    if (aVar4.mo44154a()) {
                        mo44146h(C11330e.C11331a.SHOWING);
                        aVar4.mo44153a(true);
                        aVar = aVar4;
                        break;
                    }
                    if (aVar4.mo44163g() != null) {
                        stringBuffer.append(aVar4.mo43926k() + ":" + aVar4.mo44163g() + ",");
                    }
                    aVar4.mo44153a(false);
                    IronLog.INTERNAL.verbose(mo44143d(aVar4.mo44166l() + " - not ready to show"));
                }
                if (aVar == null) {
                    m50607F(ErrorBuilder.buildNoAdsToShowError(this.f50867o.f50831a.toString()), stringBuffer.toString());
                }
            }
        }
        if (aVar != null) {
            Placement placement2 = this.f50862j;
            if (this.f50867o.f50838h.mo44131b()) {
                this.f50870r.mo44583a();
            }
            aVar.mo44152a(placement2);
        }
    }

    /* renamed from: b */
    public final void mo44120b(C11338a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44143d(aVar.mo44166l()));
        this.f50853a.mo44174a(aVar);
        this.f50864l.mo44563a(aVar);
        if (this.f50864l.mo44565b(aVar)) {
            ironLog.verbose(mo44143d(aVar.mo43926k() + " was session capped"));
            aVar.mo44162f();
            IronSourceUtils.sendAutomationLog(aVar.mo43926k() + " was session capped");
        }
        C11484c.m51240b(ContextProvider.getInstance().getApplicationContext(), mo44149t(), this.f50867o.f50831a);
        if (C11484c.m51236a(ContextProvider.getInstance().getApplicationContext(), mo44149t(), this.f50867o.f50831a)) {
            ironLog.verbose(mo44143d("placement " + mo44149t() + " is capped"));
            this.f50871s.f50815d.mo44076h(mo44149t());
        }
        C11324b bVar = this.f50873u;
        IronSource.AD_UNIT ad_unit = bVar.f50840a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            C11220A.m50068a().mo43691c();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C11270X.m50368a().mo43948c();
        } else {
            ironLog.warning("ad unit not supported - " + bVar.f50840a);
        }
        if (this.f50867o.f50838h.mo44131b()) {
            mo44147l(false, false);
        }
        C11499n.m51312a().mo44567a(this.f50867o.f50831a);
        if (this.f50867o.mo44115a()) {
            C11291c cVar = this.f50854b.get(aVar.mo43926k());
            if (cVar != null) {
                C11389h.m50959a(cVar, aVar.mo44165i(), this.f50861i, mo44149t());
                this.f50855c.put(aVar.mo43926k(), C11392i.C11393a.ISAuctionPerformanceShowedSuccessfully);
                mo44145g(cVar, mo44149t());
            } else {
                String k = aVar.mo43926k();
                String str = "showing instance missing from waterfall - " + k;
                ironLog.verbose(mo44143d(str));
                this.f50871s.f50816e.mo44099a(1011, str, k);
            }
        }
        C11327c cVar2 = this.f50869q;
        C11325a aVar2 = cVar2.f50849a;
        if (aVar2.f50841a == C11325a.C11326a.AUTOMATIC_LOAD_WHILE_SHOW) {
            cVar2.mo44134b(aVar2.f50842b);
        }
    }

    /* renamed from: b */
    public final boolean mo44137b() {
        if (!mo44148s()) {
            return false;
        }
        if (this.f50863k && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        Iterator<Smash> it = this.f50853a.mo44172a().iterator();
        while (it.hasNext()) {
            if (((C11338a) it.next()).mo44154a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final String mo44122c() {
        StringBuilder sb = new StringBuilder();
        if (this.f50868p == C11330e.C11331a.READY_TO_SHOW) {
            Iterator<Smash> it = this.f50853a.mo44172a().iterator();
            while (it.hasNext()) {
                C11338a aVar = (C11338a) it.next();
                if (aVar.mo44160d()) {
                    sb.append(aVar.mo43926k() + ";");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo44123c(C11338a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44143d(aVar.mo44166l()));
        if (this.f50868p == C11330e.C11331a.SHOWING) {
            mo44146h(C11330e.C11331a.READY_TO_LOAD);
        }
        C11327c cVar = this.f50869q;
        C11325a aVar2 = cVar.f50849a;
        if (aVar2.f50841a == C11325a.C11326a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            cVar.mo44134b(aVar2.f50842b);
        }
        C11324b bVar = this.f50873u;
        IronSource.AD_UNIT ad_unit = bVar.f50840a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            C11220A.m50068a().mo43692d();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C11270X.m50368a().mo43949d();
        } else {
            ironLog.warning("ad unit not supported - " + bVar.f50840a);
        }
    }

    /* renamed from: d */
    public final void mo44124d(C11338a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44143d(aVar.mo44166l()));
        C11324b bVar = this.f50873u;
        if (bVar.f50840a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C11270X.m50368a().mo43950e();
            return;
        }
        ironLog.warning("ad unit not supported - " + bVar.f50840a);
    }

    /* renamed from: e */
    public final void mo44125e(C11338a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44143d(aVar.mo44166l()));
        C11324b bVar = this.f50873u;
        if (bVar.f50840a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C11270X.m50368a().mo43951f();
            return;
        }
        ironLog.warning("ad unit not supported - " + bVar.f50840a);
    }
}
