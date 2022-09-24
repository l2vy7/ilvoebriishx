package com.ironsource.sdk.p293f;

import com.ironsource.mediationsdk.model.C11416b;
import com.ironsource.mediationsdk.model.C11418d;
import com.ironsource.mediationsdk.model.C11419e;
import com.ironsource.mediationsdk.model.C11432q;
import com.ironsource.mediationsdk.utils.C11482a;
import com.ironsource.mediationsdk.utils.C11494j;
import com.ironsource.mediationsdk.utils.C11501o;
import com.ironsource.sdk.p294g.C11703d;

/* renamed from: com.ironsource.sdk.f.a */
public class C11696a {

    /* renamed from: a */
    private C11419e f52346a;

    /* renamed from: b */
    private C11432q f52347b;

    /* renamed from: c */
    private C11501o f52348c;

    /* renamed from: d */
    private boolean f52349d;

    /* renamed from: e */
    private C11703d f52350e;

    /* renamed from: f */
    private C11482a f52351f;

    /* renamed from: g */
    private C11418d f52352g;

    /* renamed from: h */
    private C11494j f52353h;

    /* renamed from: i */
    private C11416b f52354i;

    /* renamed from: com.ironsource.sdk.f.a$a */
    public static class C11697a {

        /* renamed from: a */
        public String f52355a;

        /* renamed from: b */
        public String f52356b;

        /* renamed from: c */
        public String f52357c;

        /* renamed from: a */
        public static C11697a m51805a(C11703d.C11708e eVar) {
            String str;
            C11697a aVar = new C11697a();
            if (eVar == C11703d.C11708e.RewardedVideo) {
                aVar.f52355a = "showRewardedVideo";
                aVar.f52356b = "onShowRewardedVideoSuccess";
                str = "onShowRewardedVideoFail";
            } else if (eVar == C11703d.C11708e.Interstitial) {
                aVar.f52355a = "showInterstitial";
                aVar.f52356b = "onShowInterstitialSuccess";
                str = "onShowInterstitialFail";
            } else {
                if (eVar == C11703d.C11708e.OfferWall) {
                    aVar.f52355a = "showOfferWall";
                    aVar.f52356b = "onShowOfferWallSuccess";
                    str = "onInitOfferWallFail";
                }
                return aVar;
            }
            aVar.f52357c = str;
            return aVar;
        }
    }

    public C11696a() {
        this.f52346a = new C11419e();
    }

    public C11696a(C11419e eVar, C11432q qVar, C11501o oVar, boolean z, C11703d dVar, C11482a aVar, C11418d dVar2, C11494j jVar, C11416b bVar) {
        this.f52346a = eVar;
        this.f52347b = qVar;
        this.f52348c = oVar;
        this.f52349d = z;
        this.f52350e = dVar;
        this.f52351f = aVar;
        this.f52352g = dVar2;
        this.f52353h = jVar;
        this.f52354i = bVar;
    }

    /* renamed from: a */
    public C11419e mo44984a() {
        return this.f52346a;
    }

    /* renamed from: b */
    public C11432q mo44985b() {
        return this.f52347b;
    }

    /* renamed from: c */
    public C11501o mo44986c() {
        return this.f52348c;
    }

    /* renamed from: d */
    public boolean mo44987d() {
        return this.f52349d;
    }

    /* renamed from: e */
    public C11703d mo44988e() {
        return this.f52350e;
    }

    /* renamed from: f */
    public C11482a mo44989f() {
        return this.f52351f;
    }

    /* renamed from: g */
    public C11418d mo44990g() {
        return this.f52352g;
    }

    /* renamed from: h */
    public C11494j mo44991h() {
        return this.f52353h;
    }

    /* renamed from: i */
    public C11416b mo44992i() {
        return this.f52354i;
    }
}
