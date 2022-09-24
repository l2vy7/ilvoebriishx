package com.ironsource.mediationsdk.adunit.p277b;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.b.h */
public final class C11318h extends C11316f {
    public C11318h(C11312d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo44092a(long j, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        mo44088b(C11310b.LOAD_AD_NO_FILL, hashMap);
    }

    /* renamed from: a */
    public final void mo44093a(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        mo44088b(C11310b.LOAD_AD_FAILED, hashMap);
    }

    /* renamed from: a */
    public final void mo44094a(long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (z) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.valueOf(z));
        }
        mo44088b(C11310b.LOAD_AD_SUCCESS, hashMap);
    }

    /* renamed from: a */
    public final void mo44095a(boolean z) {
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.valueOf(z));
        }
        mo44088b(C11310b.LOAD_AD, hashMap);
    }

    /* renamed from: a */
    public final void mo44096a(boolean z, long j, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (z2) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS));
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired");
        }
        mo44088b(z ? C11310b.AD_AVAILABILITY_CHANGED_TRUE : C11310b.AD_AVAILABILITY_CHANGED_FALSE, hashMap);
    }

    /* renamed from: b */
    public final void mo44097b(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        mo44088b(C11310b.LOAD_AD_FAILED_WITH_REASON, hashMap);
    }
}
