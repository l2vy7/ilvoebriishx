package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.C5059d;

/* renamed from: com.startapp.sdk.adsbase.cache.c */
/* compiled from: Sta */
public class C12268c implements C5059d.C5060d {

    /* renamed from: a */
    public final /* synthetic */ C5059d.C5064e f54543a;

    public C12268c(C5059d dVar, C5059d.C5064e eVar) {
        this.f54543a = eVar;
    }

    /* renamed from: a */
    public void mo20975a(C5041Ad ad, CacheKey cacheKey, boolean z) {
        AdEventListener adEventListener = this.f54543a.f22363d;
        if (adEventListener == null) {
            return;
        }
        if (!z || ad == null) {
            adEventListener.onFailedToReceiveAd(ad);
        } else {
            adEventListener.onReceiveAd(ad);
        }
    }
}
