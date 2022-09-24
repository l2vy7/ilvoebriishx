package com.ironsource.mediationsdk.adunit.p281d.p282a;

import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.mediationsdk.C11232E;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.p278c.p279a.C11323c;
import com.ironsource.mediationsdk.adunit.p281d.C11337a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.C11415a;
import com.ironsource.mediationsdk.utils.C11490f;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.d.a.b */
public class C11339b<Listener extends C11323c> extends C11338a<Listener> implements AdapterAdRewardListener {

    /* renamed from: o */
    private C11490f f50896o;

    public C11339b(C11337a aVar, BaseAdInteractionAdapter<?, AdapterAdRewardListener> baseAdInteractionAdapter, C11415a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
    }

    public void onAdClosed() {
        this.f50896o = new C11490f();
        super.onAdClosed();
    }

    public void onAdOpened() {
        this.f50896o = null;
        super.onAdOpened();
    }

    public void onAdRewarded() {
        if (this.f50902f != null) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(mo44158c("placement name = " + mo44171q()));
            HashMap hashMap = new HashMap();
            if (C11232E.m50103a().f50424n != null) {
                for (String next : C11232E.m50103a().f50424n.keySet()) {
                    hashMap.put(ContentMetadata.KEY_CUSTOM_PREFIX + next, C11232E.m50103a().f50424n.get(next));
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f50900d.f50815d.mo44068a(mo44171q(), this.f50902f.getRewardName(), this.f50902f.getRewardAmount(), currentTimeMillis, IronSourceUtils.getTransId(currentTimeMillis, mo43926k()), C11490f.m51271a(this.f50896o), hashMap, C11232E.m50103a().f50423m);
            ((C11323c) this.f50898b).mo44126a((C11339b<?>) this, this.f50902f);
            return;
        }
        this.f50900d.f50816e.mo44111l("mCurrentPlacement is null");
    }
}
