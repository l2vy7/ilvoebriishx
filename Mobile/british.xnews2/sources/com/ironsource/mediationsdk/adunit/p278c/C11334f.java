package com.ironsource.mediationsdk.adunit.p278c;

import com.ironsource.mediationsdk.C11270X;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.p278c.p279a.C11323c;
import com.ironsource.mediationsdk.adunit.p281d.p282a.C11339b;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Set;

/* renamed from: com.ironsource.mediationsdk.adunit.c.f */
public abstract class C11334f<Smash extends C11339b<?>> extends C11329d<Smash, BaseAdInteractionAdapter<?, AdapterAdRewardListener>> implements C11323c {
    public C11334f(C11320a aVar, Set<ImpressionDataListener> set) {
        super(aVar, set);
    }

    /* renamed from: a */
    public final void mo44126a(C11339b<?> bVar, Placement placement) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo44143d(bVar.mo44166l()));
        C11324b bVar2 = this.f50873u;
        if (bVar2.f50840a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C11270X.m50368a().mo43942a(placement);
            return;
        }
        ironLog.warning("ad unit not supported - " + bVar2.f50840a);
    }
}
