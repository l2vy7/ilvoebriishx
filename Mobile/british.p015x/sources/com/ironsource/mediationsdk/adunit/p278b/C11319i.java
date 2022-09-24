package com.ironsource.mediationsdk.adunit.p278b;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.b.i */
public final class C11319i extends C11316f {
    public C11319i(C11312d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo44098a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo44088b(C11310b.TROUBLESHOOT_LOAD_FAILED, hashMap);
    }

    /* renamed from: a */
    public final void mo44099a(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        mo44088b(C11310b.TROUBLESHOOT_NOTIFICATION_ERROR, hashMap);
    }

    /* renamed from: a */
    public final void mo44100a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo44088b(C11310b.TROUBLESHOOT_NETWORK_ADAPTER_NOT_AVAILABLE, hashMap);
    }

    /* renamed from: b */
    public final void mo44101b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo44088b(C11310b.TROUBLESHOOT_AD_ADAPTER_NOT_AVAILABLE, hashMap);
    }

    /* renamed from: c */
    public final void mo44102c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo44088b(C11310b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, hashMap);
    }

    /* renamed from: d */
    public final void mo44103d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo44088b(C11310b.TROUBLESHOOT_BIDDING_DATA_MISSING, hashMap);
    }

    /* renamed from: e */
    public final void mo44104e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo44088b(C11310b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, hashMap);
    }

    /* renamed from: f */
    public final void mo44105f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo44088b(C11310b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, hashMap);
    }

    /* renamed from: g */
    public final void mo44106g(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo44088b(C11310b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, hashMap);
    }

    /* renamed from: h */
    public final void mo44107h(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo44088b(C11310b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, hashMap);
    }

    /* renamed from: i */
    public final void mo44108i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo44088b(C11310b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, hashMap);
    }

    /* renamed from: j */
    public final void mo44109j(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo44088b(C11310b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, hashMap);
    }

    /* renamed from: k */
    public final void mo44110k(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo44088b(C11310b.TROUBLESHOOT_UNEXPECTED_TIMEOUT, hashMap);
    }

    /* renamed from: l */
    public final void mo44111l(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo44088b(C11310b.TROUBLESHOOT_INTERNAL_ERROR, hashMap);
    }

    /* renamed from: m */
    public final void mo44112m(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo44088b(C11310b.TROUBLESHOOT_ADAPTER_BRIDGE_INTERNAL_ERROR, hashMap);
    }

    /* renamed from: n */
    public final void mo44113n(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo44088b(C11310b.TROUBLESHOOTING_WATERFALL_OVERHEAD, hashMap);
    }
}
