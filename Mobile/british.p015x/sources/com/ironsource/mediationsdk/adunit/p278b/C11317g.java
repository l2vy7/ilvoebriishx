package com.ironsource.mediationsdk.adunit.p278b;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.b.g */
public final class C11317g extends C11316f {
    public C11317g(C11312d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo44090a() {
        mo44087a(C11310b.INIT_STARTED);
    }

    /* renamed from: a */
    public final void mo44091a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        mo44088b(C11310b.INIT_ENDED, hashMap);
    }
}
