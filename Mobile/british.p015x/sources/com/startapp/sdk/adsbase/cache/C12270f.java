package com.startapp.sdk.adsbase.cache;

import com.startapp.C5011i;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.C5065h;

/* renamed from: com.startapp.sdk.adsbase.cache.f */
/* compiled from: Sta */
public class C12270f implements AdEventListener {

    /* renamed from: a */
    public final /* synthetic */ C5065h.C5066a f54545a;

    /* renamed from: b */
    public final /* synthetic */ boolean f54546b;

    /* renamed from: c */
    public final /* synthetic */ C5065h f54547c;

    public C12270f(C5065h hVar, C5065h.C5066a aVar, boolean z) {
        this.f54547c = hVar;
        this.f54545a = aVar;
        this.f54546b = z;
    }

    public void onFailedToReceiveAd(C5041Ad ad) {
        C5065h hVar = this.f54547c;
        hVar.f22368e = null;
        hVar.mo21057a(this.f54546b);
    }

    public void onReceiveAd(C5041Ad ad) {
        C5011i.m22895b(this.f54547c.f22365b, this.f54545a, ad, true);
    }
}
