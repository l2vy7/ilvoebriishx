package com.ironsource.mediationsdk.adunit.p278c;

import com.ironsource.mediationsdk.C11220A;
import com.ironsource.mediationsdk.C11270X;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.mediationsdk.adunit.c.b */
final class C11324b {

    /* renamed from: a */
    IronSource.AD_UNIT f50840a;

    public C11324b(IronSource.AD_UNIT ad_unit) {
        this.f50840a = ad_unit;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44127a(IronSourceError ironSourceError) {
        IronSource.AD_UNIT ad_unit = this.f50840a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            C11220A.m50068a().mo43687a(ironSourceError);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C11270X.m50368a().mo43941a(ironSourceError);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + this.f50840a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo44128b(boolean z) {
        if (this.f50840a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C11270X.m50368a().mo43944a(z);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + this.f50840a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo44129c(IronSourceError ironSourceError) {
        IronSource.AD_UNIT ad_unit = this.f50840a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            C11220A.m50068a().mo43690b(ironSourceError);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C11270X.m50368a().mo43946b(ironSourceError);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + this.f50840a);
        }
    }
}
