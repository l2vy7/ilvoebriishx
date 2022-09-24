package british.p015x;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.adcolony.sdk.AdColonyAdView;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyReward;
import com.adcolony.sdk.AdColonyRewardListener;
import com.adcolony.sdk.AdColonyZone;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.core.AppnextAdCreativeType;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnVideoEnded;
import com.facebook.ads.AdView;
import com.facebook.ads.C3371Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.VideoListener;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* renamed from: british.x.t_mapa_web */
public class t_mapa_web extends Activity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: m */
    C1692config f9542m;

    /* renamed from: n */
    WebView f9543n;

    /* renamed from: o */
    C1603c f9544o;

    /* renamed from: p */
    boolean f9545p = false;

    /* renamed from: q */
    ListView f9546q;

    /* renamed from: british.x.t_mapa_web$a */
    class C2355a extends AdColonyInterstitialListener {
        C2355a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_mapa_web t_mapa_web = t_mapa_web.this;
            if (t_mapa_web.f9545p) {
                t_mapa_web.abrir_secc(t_mapa_web.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_mapa_web.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_mapa_web.this.f6661g.cancel();
            t_mapa_web t_mapa_web = t_mapa_web.this;
            t_mapa_web.abrir_secc(t_mapa_web.f6660f);
        }
    }

    /* renamed from: british.x.t_mapa_web$b */
    class C2356b implements SearchManager.OnCancelListener {
        C2356b() {
        }

        public void onCancel() {
            t_mapa_web t_mapa_web = t_mapa_web.this;
            t_mapa_web.f6657c = false;
            t_mapa_web.setResult(0);
        }
    }

    /* renamed from: british.x.t_mapa_web$c */
    class C2357c implements SearchManager.OnDismissListener {
        C2357c() {
        }

        public void onDismiss() {
            t_mapa_web.this.f6658d = false;
        }
    }

    /* renamed from: british.x.t_mapa_web$d */
    class C2358d extends WebChromeClient {
        C2358d() {
        }

        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            callback.invoke(str, true, false);
        }
    }

    /* renamed from: british.x.t_mapa_web$e */
    class C2359e extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ ProgressBar f9551a;

        C2359e(ProgressBar progressBar) {
            this.f9551a = progressBar;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f9551a.setVisibility(8);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f9551a.setVisibility(0);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.toLowerCase().startsWith("intent://")) {
                try {
                    Intent parseUri = Intent.parseUri(str, 1);
                    parseUri.addCategory("android.intent.category.BROWSABLE");
                    parseUri.setComponent((ComponentName) null);
                    parseUri.setSelector((Intent) null);
                    t_mapa_web.this.startActivity(parseUri);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }
    }

    /* renamed from: british.x.t_mapa_web$f */
    class C2360f extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f9553a;

        /* renamed from: british.x.t_mapa_web$f$a */
        class C2361a extends FullScreenContentCallback {
            C2361a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_mapa_web t_mapa_web = t_mapa_web.this;
                if (t_mapa_web.f9545p) {
                    t_mapa_web.abrir_secc(t_mapa_web.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_mapa_web t_mapa_web = t_mapa_web.this;
                t_mapa_web.abrir_secc(t_mapa_web.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.x.t_mapa_web$f$b */
        class C2362b implements OnUserEarnedRewardListener {
            C2362b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2360f fVar = C2360f.this;
                t_mapa_web.this.f9545p = true;
                C1692config.m8175Y0(fVar.f9553a);
            }
        }

        C2360f(Context context) {
            this.f9553a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_mapa_web.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2361a());
            rewardedAd.show((Activity) this.f9553a, new C2362b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_mapa_web t_mapa_web = t_mapa_web.this;
            if (!t_mapa_web.f9542m.mo7502f(this.f9553a, t_mapa_web.f6663i)) {
                t_mapa_web.this.f6661g.cancel();
                t_mapa_web t_mapa_web2 = t_mapa_web.this;
                t_mapa_web2.abrir_secc(t_mapa_web2.f6660f);
            }
        }
    }

    /* renamed from: british.x.t_mapa_web$g */
    class C2363g implements AdDisplayListener {
        C2363g() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_mapa_web t_mapa_web = t_mapa_web.this;
            if (t_mapa_web.f9545p) {
                t_mapa_web.abrir_secc(t_mapa_web.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: a */
    private void m8839a(Context context) {
        this.f6662h = new C2360f(context);
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f9542m.mo7510j0(view, this);
        if (j0.f7843b) {
            this.f6657c = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", j0.f7844c);
            setResult(-1, intent);
        }
        if (j0.f7845d) {
            startActivityForResult(j0.f7842a, 0);
        } else {
            Intent intent2 = j0.f7842a;
            if (intent2 != null) {
                if (j0.f7843b) {
                    this.f6659e = false;
                    if (this.f9542m.f7427t4 != 2) {
                        intent2.putExtra("es_root", true);
                    }
                    try {
                        startActivity(j0.f7842a);
                    } catch (Exception unused) {
                    }
                } else {
                    startActivityForResult(intent2, 0);
                }
            }
        }
        if (this.f6657c && !this.f6658d) {
            finish();
        }
    }

    public void adError(String str) {
        this.f6661g.cancel();
        abrir_secc(this.f6660f);
    }

    public void adLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
        this.f6661g.cancel();
        this.f6663i.showAd();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8765b() {
        int q0 = this.f9542m.mo7522q0(this);
        int i = this.f9542m.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f9546q = listView;
            this.f9542m.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f9542m.f7231O1;
                if (i3 >= lVarArr.length) {
                    break;
                }
                if (!lVarArr[i3].f7848B) {
                    findViewById(i3).setOnClickListener(this);
                    i4++;
                    if (i4 == q0) {
                        break;
                    }
                }
                i3++;
            }
            if (findViewById(R.id.idaux9999) != null && findViewById(R.id.idaux9999).getVisibility() == 0) {
                findViewById(R.id.idaux9999).setOnClickListener(this);
            }
        }
        while (true) {
            int[] iArr = this.f9542m.f7249R1;
            if (i2 < iArr.length) {
                if (iArr[i2] > 0) {
                    findViewById(iArr[i2]).setOnClickListener(this);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            setResult(-1, intent);
            finish();
        }
    }

    public void onAdClicked(C3371Ad ad) {
    }

    public void onAdClosed() {
        if (this.f9545p) {
            abrir_secc(this.f6660f);
        }
    }

    public void onAdLoaded(C3371Ad ad) {
        this.f6661g.cancel();
        this.f6664j.show();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onClick(View view) {
        String str = this.f9542m.f7251R3;
        if (str != null && !str.equals("")) {
            this.f6663i = new RewardedVideo((Context) this, this.f9542m.f7251R3);
        }
        String str2 = this.f9542m.f7245Q3;
        if (str2 != null) {
            str2.equals("");
        }
        String str3 = this.f9542m.f7269U3;
        if (str3 != null && !str3.equals("")) {
            this.f6664j = new RewardedVideoAd(this, this.f9542m.f7269U3);
        }
        String str4 = this.f9542m.f7275V3;
        if (str4 != null && !str4.equals("")) {
            this.f6665k = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6661g = progressDialog;
        this.f6660f = view;
        if (!this.f9542m.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
            abrir_secc(view);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo8765b();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f9544o;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f9544o;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f9544o = this.f9542m.mo7474A0(this, false);
    }

    public void onCreate(Bundle bundle) {
        C1692config config = (C1692config) getApplicationContext();
        this.f9542m = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8839a(this);
        this.f6666l = new C2355a();
        try {
            C1692config config2 = this.f9542m;
            this.f6656b = C1692config.m8189h(config2.f7231O1[config2.f7318d].f7916g, config2.f7368l1);
        } catch (Exception unused) {
            this.f6656b = "";
        }
        super.onCreate(bundle);
        setContentView(R.layout.t_mapa_web);
        mo8765b();
        this.f9542m.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C2356b());
        searchManager.setOnDismissListener(new C2357c());
        this.f9542m.mo7503f1(this, false, false);
        this.f9544o = this.f9542m.mo7474A0(this, false);
        WebView webView = (WebView) findViewById(R.id.webview);
        this.f9543n = webView;
        webView.setWebChromeClient(new C2358d());
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.pb_url);
        if (Build.VERSION.SDK_INT > 20) {
            C1692config.m8168S0(progressBar, this.f9542m.f7368l1);
        }
        this.f9543n.setWebViewClient(new C2359e(progressBar));
        this.f9543n.getSettings().setJavaScriptEnabled(true);
        this.f9543n.getSettings().setPluginState(WebSettings.PluginState.ON);
        if (bundle == null) {
            this.f9543n.loadUrl("https://www.google.com/maps/search/?api=1&query=" + (((float) getIntent().getIntExtra("x", 0)) / 1000000.0f) + "," + (((float) getIntent().getIntExtra("y", 0)) / 1000000.0f));
        }
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f9542m.f7384n3 == 0 || (cVar3 = this.f9544o) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f9542m.f7384n3 == 0 || (cVar2 = this.f9544o) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f9542m.f7384n3 == 0 || (cVar = this.f9544o) == null || (adColonyAdView = cVar.f6889d) == null)) {
            adColonyAdView.destroy();
        }
        super.onDestroy();
    }

    public void onError(C3371Ad ad, com.facebook.ads.AdError adError) {
        this.f6661g.cancel();
        abrir_secc(this.f6660f);
    }

    public void onFailedToReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        abrir_secc(this.f6660f);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f9543n.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f9543n.goBack();
        return true;
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f9542m.f7384n3 == 0 || (cVar = this.f9544o) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2363g());
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f9543n.restoreState(bundle);
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f9542m.f7384n3 != 0 && (cVar = this.f9544o) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f9545p = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f9545p) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f9545p = true;
        C1692config.m8175Y0(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f9543n.saveState(bundle);
    }

    public boolean onSearchRequested() {
        this.f6657c = true;
        this.f6658d = true;
        return super.onSearchRequested();
    }

    public void onStop() {
        super.onStop();
        if (this.f6657c && !this.f6658d) {
            finish();
        }
    }

    public void onVideoCompleted() {
        this.f9545p = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f9545p = true;
        C1692config.m8175Y0(this);
    }
}
