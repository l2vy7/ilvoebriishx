package com.ironsource.mediationsdk.adunit.p277b;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.adunit.b.a */
public final class C11309a extends C11316f {
    public C11309a(C11312d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo44064a() {
        mo44087a(C11310b.SESSION_CAPPED);
    }

    /* renamed from: a */
    public final void mo44065a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        mo44088b(C11310b.SHOW_AD, hashMap);
    }

    /* renamed from: a */
    public final void mo44066a(String str, int i, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str2);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, str3);
        }
        mo44088b(C11310b.SHOW_AD_FAILED, hashMap);
    }

    /* renamed from: a */
    public final void mo44067a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        }
        mo44088b(C11310b.AD_CLOSED, hashMap);
    }

    /* renamed from: a */
    public final void mo44068a(String str, String str2, int i, long j, String str3, long j2, Map<String, Object> map, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_NAME, str2);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_TRANS_ID, str3);
        if (j2 != 0) {
            hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j2));
        }
        hashMap.putAll(map);
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        mo44089c(C11310b.AD_REWARDED, hashMap, j);
    }

    /* renamed from: a */
    public final void mo44069a(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_STATUS, z ? "true" : "false");
        mo44088b(C11310b.SHOW_AD_CHANCE, hashMap);
    }

    /* renamed from: b */
    public final void mo44070b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        mo44088b(C11310b.SHOW_AD_SUCCESS, hashMap);
    }

    /* renamed from: c */
    public final void mo44071c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        mo44088b(C11310b.AD_OPENED, hashMap);
    }

    /* renamed from: d */
    public final void mo44072d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        mo44088b(C11310b.AD_CLICKED, hashMap);
    }

    /* renamed from: e */
    public final void mo44073e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        mo44088b(C11310b.AD_STARTED, hashMap);
    }

    /* renamed from: f */
    public final void mo44074f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        mo44088b(C11310b.AD_ENDED, hashMap);
    }

    /* renamed from: g */
    public final void mo44075g(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        mo44088b(C11310b.AD_VISIBLE, hashMap);
    }

    /* renamed from: h */
    public final void mo44076h(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        mo44088b(C11310b.PLACEMENT_CAPPED, hashMap);
    }
}
