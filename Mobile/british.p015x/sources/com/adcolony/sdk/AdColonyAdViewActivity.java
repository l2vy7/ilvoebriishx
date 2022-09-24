package com.adcolony.sdk;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;

public class AdColonyAdViewActivity extends C2688b {

    /* renamed from: m */
    AdColonyAdView f10531m;

    public AdColonyAdViewActivity() {
        AdColonyAdView adColonyAdView;
        if (!C2684a.m9411e()) {
            adColonyAdView = null;
        } else {
            adColonyAdView = C2684a.m9409c().mo9720g();
        }
        this.f10531m = adColonyAdView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9391b() {
        ViewParent parent = this.f10598a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f10598a);
        }
        this.f10531m.mo9365a();
        C2684a.m9409c().mo9699a((AdColonyAdView) null);
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9392c() {
        this.f10531m.mo9366b();
    }

    public void onBackPressed() {
        mo9391b();
    }

    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        AdColonyAdView adColonyAdView;
        if (!C2684a.m9411e() || (adColonyAdView = this.f10531m) == null) {
            C2684a.m9409c().mo9699a((AdColonyAdView) null);
            finish();
            return;
        }
        this.f10600c = adColonyAdView.getOrientation();
        super.onCreate(bundle);
        this.f10531m.mo9366b();
        AdColonyAdViewListener listener = this.f10531m.getListener();
        if (listener != null) {
            listener.onOpened(this.f10531m);
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
