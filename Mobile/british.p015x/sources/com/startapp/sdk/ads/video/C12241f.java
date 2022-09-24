package com.startapp.sdk.ads.video;

import android.content.Context;
import com.startapp.C5126w2;
import com.startapp.sdk.ads.video.C12245j;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;

/* renamed from: com.startapp.sdk.ads.video.f */
/* compiled from: Sta */
public class C12241f implements C12245j.C12247b {

    /* renamed from: a */
    public final /* synthetic */ C12245j.C12247b f54404a;

    /* renamed from: b */
    public final /* synthetic */ CachedVideoAd f54405b;

    /* renamed from: c */
    public final /* synthetic */ Context f54406c;

    /* renamed from: d */
    public final /* synthetic */ C12243h f54407d;

    public C12241f(C12243h hVar, C12245j.C12247b bVar, CachedVideoAd cachedVideoAd, Context context) {
        this.f54407d = hVar;
        this.f54404a = bVar;
        this.f54405b = cachedVideoAd;
        this.f54406c = context;
    }

    /* renamed from: a */
    public void mo46032a(String str) {
        C12245j.C12247b bVar = this.f54404a;
        if (bVar != null) {
            bVar.mo46032a(str);
        }
        if (str != null) {
            this.f54405b.mo46160a(System.currentTimeMillis());
            this.f54405b.mo46161a(str);
            C12243h hVar = this.f54407d;
            Context context = this.f54406c;
            CachedVideoAd cachedVideoAd = this.f54405b;
            hVar.f54409a.remove(cachedVideoAd);
            hVar.mo46037a(AdsCommonMetaData.f22242h.mo20877G().mo20993b() - 1);
            hVar.f54409a.add(cachedVideoAd);
            C5126w2.m23394b(context, "CachedAds", hVar.f54409a);
        }
    }
}
