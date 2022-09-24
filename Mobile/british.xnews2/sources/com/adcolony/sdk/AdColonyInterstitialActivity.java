package com.adcolony.sdk;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import org.json.JSONArray;
import org.json.JSONObject;

public class AdColonyInterstitialActivity extends C2688b {

    /* renamed from: m */
    AdColonyInterstitial f10558m;

    /* renamed from: n */
    private C2787h f10559n;

    public AdColonyInterstitialActivity() {
        AdColonyInterstitial adColonyInterstitial;
        if (!C2684a.m9411e()) {
            adColonyInterstitial = null;
        } else {
            adColonyInterstitial = C2684a.m9409c().mo9719f();
        }
        this.f10558m = adColonyInterstitial;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9484a(C2714c0 c0Var) {
        AdColonyInterstitial adColonyInterstitial;
        super.mo9484a(c0Var);
        C2715d b = C2684a.m9409c().mo9708b();
        JSONObject g = C2976x.m10335g(c0Var.mo9608b(), "v4iap");
        JSONArray b2 = C2976x.m10318b(g, "product_ids");
        if (!(g == null || (adColonyInterstitial = this.f10558m) == null || adColonyInterstitial.getListener() == null || b2.length() <= 0)) {
            this.f10558m.getListener().onIAPEvent(this.f10558m, C2976x.m10331d(b2, 0), C2976x.m10332e(g, "engagement_type"));
        }
        b.mo9615a(this.f10598a);
        if (this.f10558m != null) {
            b.mo9613a().remove(this.f10558m.mo9465b());
        }
        AdColonyInterstitial adColonyInterstitial2 = this.f10558m;
        if (!(adColonyInterstitial2 == null || adColonyInterstitial2.getListener() == null)) {
            this.f10558m.getListener().onClosed(this.f10558m);
            this.f10558m.mo9460a((C2701c) null);
            this.f10558m.setListener((AdColonyInterstitialListener) null);
            this.f10558m = null;
        }
        C2787h hVar = this.f10559n;
        if (hVar != null) {
            hVar.mo9667a();
            this.f10559n = null;
        }
    }

    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        int i;
        AdColonyInterstitial adColonyInterstitial;
        AdColonyInterstitial adColonyInterstitial2 = this.f10558m;
        if (adColonyInterstitial2 == null) {
            i = -1;
        } else {
            i = adColonyInterstitial2.mo9475g();
        }
        this.f10600c = i;
        super.onCreate(bundle);
        if (C2684a.m9411e() && (adColonyInterstitial = this.f10558m) != null) {
            C2829j0 f = adColonyInterstitial.mo9474f();
            if (f != null) {
                f.mo9775a(this.f10598a);
            }
            this.f10559n = new C2787h(new Handler(Looper.getMainLooper()), this.f10558m);
            if (this.f10558m.getListener() != null) {
                this.f10558m.getListener().onOpened(this.f10558m);
            }
        }
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    public /* bridge */ /* synthetic */ void onResume() {
        super.onResume();
    }

    public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
