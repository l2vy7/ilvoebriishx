package com.ironsource.mediationsdk.adunit.p278b;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.b.e */
public final class C11315e extends C11316f {
    public C11315e(C11312d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo44082a() {
        mo44087a(C11310b.AUCTION_REQUEST);
    }

    /* renamed from: a */
    public final void mo44083a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        mo44088b(C11310b.AUCTION_SUCCESS, hashMap);
    }

    /* renamed from: a */
    public final void mo44084a(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        mo44088b(C11310b.AUCTION_FAILED, hashMap);
    }

    /* renamed from: a */
    public final void mo44085a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        mo44088b(C11310b.AUCTION_REQUEST_WATERFALL, hashMap);
    }

    /* renamed from: b */
    public final void mo44086b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        mo44088b(C11310b.AUCTION_RESULT_WATERFALL, hashMap);
    }
}
