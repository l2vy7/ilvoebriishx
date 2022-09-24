package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import com.adcolony.sdk.C2978z;
import org.json.JSONObject;

public class AdColonyInterstitial {
    public static final int ADCOLONY_IAP_ENGAGEMENT_END_CARD = 0;
    public static final int ADCOLONY_IAP_ENGAGEMENT_OVERLAY = 1;

    /* renamed from: a */
    private AdColonyInterstitialListener f10545a;

    /* renamed from: b */
    private C2701c f10546b;

    /* renamed from: c */
    private AdColonyAdOptions f10547c;

    /* renamed from: d */
    private C2829j0 f10548d;

    /* renamed from: e */
    private int f10549e;

    /* renamed from: f */
    private String f10550f;

    /* renamed from: g */
    private String f10551g;

    /* renamed from: h */
    private String f10552h;

    /* renamed from: i */
    private String f10553i;

    /* renamed from: j */
    private String f10554j;

    /* renamed from: k */
    private boolean f10555k;

    /* renamed from: l */
    private boolean f10556l;

    /* renamed from: m */
    private boolean f10557m;

    AdColonyInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener, String str2) {
        this.f10545a = adColonyInterstitialListener;
        this.f10553i = str2;
        this.f10550f = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9464a(AdColonyZone adColonyZone) {
        if (adColonyZone != null) {
            if (adColonyZone.getPlayFrequency() <= 1) {
                return false;
            }
            if (adColonyZone.mo9518a() == 0) {
                adColonyZone.mo9520b(adColonyZone.getPlayFrequency() - 1);
                return false;
            }
            adColonyZone.mo9520b(adColonyZone.mo9518a() - 1);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo9465b() {
        return this.f10550f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9469c(String str) {
        this.f10552h = str;
    }

    public boolean cancel() {
        if (this.f10546b == null) {
            return false;
        }
        Context b = C2684a.m9407b();
        if (b != null && !(b instanceof AdColonyInterstitialActivity)) {
            return false;
        }
        JSONObject b2 = C2976x.m10319b();
        C2976x.m10313a(b2, TtmlNode.ATTR_ID, this.f10546b.mo9563a());
        new C2714c0("AdSession.on_request_close", this.f10546b.mo9591k(), b2).mo9612d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C2701c mo9471d() {
        return this.f10546b;
    }

    public boolean destroy() {
        C2684a.m9409c().mo9708b().mo9613a().remove(this.f10550f);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo9473e() {
        String str = this.f10552h;
        return str == null ? "" : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C2829j0 mo9474f() {
        return this.f10548d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo9475g() {
        return this.f10549e;
    }

    public AdColonyInterstitialListener getListener() {
        return this.f10545a;
    }

    public String getZoneID() {
        return this.f10553i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo9478h() {
        return this.f10548d != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo9479i() {
        return this.f10557m;
    }

    public boolean isExpired() {
        return this.f10555k || this.f10556l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo9481j() {
        Context b = C2684a.m9407b();
        if (b == null || !C2684a.m9411e()) {
            return false;
        }
        C2684a.m9409c().mo9718e(true);
        C2684a.m9409c().mo9704a(this.f10546b);
        C2684a.m9409c().mo9702a(this);
        C2916s0.m10061a(new Intent(b, AdColonyInterstitialActivity.class));
        this.f10556l = true;
        return true;
    }

    public void setListener(AdColonyInterstitialListener adColonyInterstitialListener) {
        this.f10545a = adColonyInterstitialListener;
    }

    public boolean show() {
        boolean z = false;
        if (!C2684a.m9411e()) {
            return false;
        }
        C2794i c = C2684a.m9409c();
        JSONObject b = C2976x.m10319b();
        C2976x.m10313a(b, "zone_id", this.f10553i);
        C2976x.m10323b(b, SessionDescription.ATTR_TYPE, 0);
        C2976x.m10313a(b, TtmlNode.ATTR_ID, this.f10550f);
        if (this.f10556l) {
            C2976x.m10323b(b, "request_fail_reason", 24);
            new C2978z.C2979a().mo10088a("This ad object has already been shown. Please request a new ad ").mo10088a("via AdColony.requestInterstitial.").mo10090a(C2978z.f11947g);
        } else if (this.f10555k) {
            C2976x.m10323b(b, "request_fail_reason", 17);
            new C2978z.C2979a().mo10088a("This ad object has expired. Please request a new ad via AdColony").mo10088a(".requestInterstitial.").mo10090a(C2978z.f11947g);
        } else if (c.mo9697H()) {
            C2976x.m10323b(b, "request_fail_reason", 23);
            new C2978z.C2979a().mo10088a("Can not show ad while an interstitial is already active.").mo10090a(C2978z.f11947g);
        } else if (mo9464a(c.mo9691B().get(this.f10553i))) {
            C2976x.m10323b(b, "request_fail_reason", 11);
        } else {
            z = true;
        }
        AdColonyAdOptions adColonyAdOptions = this.f10547c;
        if (adColonyAdOptions != null) {
            C2976x.m10325b(b, "pre_popup", adColonyAdOptions.f10502a);
            C2976x.m10325b(b, "post_popup", this.f10547c.f10503b);
        }
        AdColonyZone adColonyZone = c.mo9691B().get(this.f10553i);
        if (adColonyZone != null && adColonyZone.isRewarded() && c.mo9735v() == null) {
            new C2978z.C2979a().mo10088a("Rewarded ad: show() called with no reward listener set.").mo10090a(C2978z.f11947g);
        }
        new C2714c0("AdSession.launch_ad_unit", 1, b).mo9612d();
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9467b(boolean z) {
        this.f10557m = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo9468c() {
        return this.f10554j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9466b(String str) {
        this.f10554j = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9462a(JSONObject jSONObject) {
        if (jSONObject.length() > 0) {
            this.f10548d = new C2829j0(jSONObject, this.f10550f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9460a(C2701c cVar) {
        this.f10546b = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9463a(boolean z) {
        this.f10555k = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9459a(AdColonyAdOptions adColonyAdOptions) {
        this.f10547c = adColonyAdOptions;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9458a(int i) {
        this.f10549e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo9457a() {
        String str = this.f10551g;
        return str == null ? "" : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9461a(String str) {
        this.f10551g = str;
    }
}
