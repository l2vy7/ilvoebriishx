package com.appnext.ads.interstitial;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.appnext.C2980R;
import com.appnext.ads.AdsError;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextActivity;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C3148Ad;
import com.appnext.core.C3180d;
import com.appnext.core.C3187f;
import com.appnext.core.C3198g;
import com.appnext.core.C3202i;
import com.appnext.core.C3211o;
import com.appnext.core.C3213q;
import com.appnext.core.SettingsManager;
import com.appnext.core.adswatched.C3169a;
import com.appnext.core.callbacks.OnAdClicked;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.p034a.C3167a;
import com.appnext.core.result.C3249a;
import com.appnext.core.result.C3251c;
import com.appnext.core.result.C3252d;
import com.appnext.core.result.ResultPageActivity;
import com.appnext.core.webview.AppnextWebView;
import com.appnext.core.webview.WebAppInterface;
import com.google.android.exoplayer2.C6540C;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p070e1.C5199b;

public class InterstitialActivity extends AppnextActivity {
    /* access modifiers changed from: private */

    /* renamed from: aA */
    public boolean f12066aA = false;
    /* access modifiers changed from: private */

    /* renamed from: aB */
    public Runnable f12067aB = new Runnable() {
        public final void run() {
            InterstitialActivity.m10462l(InterstitialActivity.this);
        }
    };
    /* access modifiers changed from: private */
    public ArrayList<AppnextAd> ads;

    /* renamed from: am */
    protected WebView f12068am;

    /* renamed from: an */
    private boolean f12069an = false;
    /* access modifiers changed from: private */

    /* renamed from: ao */
    public Interstitial f12070ao;
    /* access modifiers changed from: private */

    /* renamed from: ap */
    public InterstitialAd f12071ap;

    /* renamed from: aq */
    private String f12072aq = "";

    /* renamed from: ar */
    private boolean f12073ar = false;

    /* renamed from: as */
    private int f12074as = 0;
    /* access modifiers changed from: private */

    /* renamed from: at */
    public Handler f12075at;

    /* renamed from: au */
    private C3187f.C3196a f12076au;
    /* access modifiers changed from: private */
    public Boolean autoPlay;

    /* renamed from: av */
    private WebAppInterface f12077av;

    /* renamed from: aw */
    private boolean f12078aw = false;

    /* renamed from: ax */
    private boolean f12079ax = false;
    /* access modifiers changed from: private */

    /* renamed from: ay */
    public String f12080ay;
    /* access modifiers changed from: private */

    /* renamed from: az */
    public String f12081az = "";
    private Boolean canClose;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public AppnextAd f12082j;
    private Boolean mute;

    protected class WebInterface extends WebAppInterface {
        public WebInterface() {
            super(InterstitialActivity.this);
        }

        @JavascriptInterface
        public void destroy(String str) {
            try {
                if (str.equals("c_close")) {
                    boolean unused = InterstitialActivity.this.f12066aA = true;
                    InterstitialActivity.this.runOnUiThread(new Runnable() {
                        public final void run() {
                            try {
                                JSONObject jSONObject = new JSONObject(InterstitialActivity.this.f12071ap.getAdJSON());
                                jSONObject.put("urlApp", jSONObject.getString("urlApp") + "&tem_id=156");
                                InterstitialActivity.m10449b(InterstitialActivity.this, jSONObject.toString());
                            } catch (JSONException unused) {
                                InterstitialActivity interstitialActivity = InterstitialActivity.this;
                                InterstitialActivity.m10449b(interstitialActivity, interstitialActivity.f12071ap.getAdJSON());
                            }
                        }
                    });
                } else if (str.equals("close")) {
                    InterstitialActivity.this.runOnUiThread(new Runnable() {
                        public final void run() {
                            InterstitialActivity.this.m10442a();
                            InterstitialActivity.this.finish();
                        }
                    });
                } else {
                    InterstitialActivity.this.runOnUiThread(new Runnable() {
                        public final void run() {
                            InterstitialActivity.this.onError(AdsError.AD_NOT_READY);
                            InterstitialActivity.this.finish();
                        }
                    });
                }
            } catch (Throwable th) {
                C3117a.m10553a("InterstitialActivity$destroy", th);
            }
        }

        @JavascriptInterface
        public String filterAds(String str) {
            return str;
        }

        @JavascriptInterface
        public void gotoAppWall() {
        }

        @JavascriptInterface
        public void jsError(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    if (str.contains("is not a function") || str.contains("has no method")) {
                        if (InterstitialActivity.m10472v(InterstitialActivity.this) < 5) {
                            InterstitialActivity.this.f12075at.postDelayed(InterstitialActivity.this.f12067aB, 500);
                            return;
                        }
                        InterstitialActivity.this.onError(AppnextError.INTERNAL_ERROR);
                        InterstitialActivity.this.finish();
                        return;
                    }
                }
                InterstitialActivity.this.onError(AppnextError.INTERNAL_ERROR);
                InterstitialActivity.this.finish();
            } catch (Throwable th) {
                C3117a.m10553a("InterstitialActivity$jsError", th);
            }
        }

        @JavascriptInterface
        public String loadAds() {
            return "";
        }

        @JavascriptInterface
        public void logSTP(String str, String str2) {
            try {
                C3198g.m10782a((C3148Ad) InterstitialActivity.this.f12070ao, (AppnextAd) InterstitialActivity.this.f12071ap, str, str2, InterstitialActivity.this.getConfig());
            } catch (Throwable th) {
                C3117a.m10553a("InterstitialActivity$logSTP", th);
            }
        }

        @JavascriptInterface
        public void notifyImpression(String str) {
            super.notifyImpression(str);
            try {
                if (InterstitialActivity.this.f12071ap != null) {
                    InterstitialActivity interstitialActivity = InterstitialActivity.this;
                    C3211o.m10825az().mo10821a(new Runnable(interstitialActivity.f12071ap.getBannerID()) {
                        public final void run() {
                            try {
                                if (!TextUtils.isEmpty(InterstitialActivity.this.placementID) && !TextUtils.isEmpty(r3)) {
                                    C3169a.m10687o(InterstitialActivity.this).mo10753k(r3, InterstitialActivity.this.f12070ao.getAUID());
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    InterstitialActivity.this.f12071ap.setImpressionURL(str);
                    InterstitialActivity.this.handler.postDelayed(new C3059a(str), Long.parseLong(InterstitialActivity.this.getConfig().mo10732y("postpone_impression_sec")) * 1000);
                }
                if (InterstitialActivity.this.autoPlay != null && InterstitialActivity.this.autoPlay.booleanValue()) {
                    play();
                }
            } catch (Throwable th) {
                C3117a.m10553a("InterstitialActivity$notifyImpression", th);
            }
        }

        @JavascriptInterface
        public void openLink(String str) {
            try {
                InterstitialActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Throwable th) {
                C3117a.m10553a("InterstitialActivity$openLink", th);
            }
        }

        @JavascriptInterface
        public void openResultPage(String str) {
            try {
                C3252d.m10942aX().mo10879a(new C3251c() {
                    public final JSONObject getConfigParams() throws JSONException {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("vid", "2.6.5.473");
                        String str = "";
                        jSONObject.put("tid", InterstitialActivity.this.f12070ao == null ? str : InterstitialActivity.this.f12070ao.getTID());
                        if (InterstitialActivity.this.f12070ao != null) {
                            str = InterstitialActivity.this.f12070ao.getAUID();
                        }
                        jSONObject.put("auid", str);
                        jSONObject.put("osid", "100");
                        jSONObject.put("tem_id", "1601");
                        jSONObject.put(TtmlNode.ATTR_ID, getPlacementId());
                        jSONObject.put("cat", InterstitialActivity.this.f12071ap.getCategories());
                        jSONObject.put("lockcat", InterstitialActivity.this.f12071ap.getSpecificCategories());
                        jSONObject.put("pview", InterstitialActivity.this.getConfig().mo10732y("pview"));
                        jSONObject.put("devn", C3198g.m10785au());
                        jSONObject.put("dosv", Build.VERSION.SDK_INT);
                        jSONObject.put("dds", SessionDescription.SUPPORTED_SDP_VERSION);
                        jSONObject.put("ads_type", "banner");
                        jSONObject.put("country", InterstitialActivity.this.f12071ap.getCountry());
                        jSONObject.put("gdpr", C3202i.m10805a((AppnextAd) InterstitialActivity.this.f12071ap, InterstitialActivity.this.getConfig()));
                        return jSONObject;
                    }

                    public final String getPlacementId() {
                        return InterstitialActivity.this.placementID;
                    }

                    public final AppnextAd getSelectedAd() {
                        return InterstitialActivity.this.f12071ap;
                    }

                    /* renamed from: t */
                    public final String mo10353t() {
                        return "160";
                    }

                    /* renamed from: u */
                    public final String mo10354u() {
                        return C3061a.m10493A().mo10780k(InterstitialActivity.this.f12070ao);
                    }

                    /* renamed from: v */
                    public final String mo10355v() {
                        return InterstitialActivity.this.f12080ay;
                    }

                    /* renamed from: w */
                    public final SettingsManager mo10356w() {
                        return InterstitialActivity.this.getConfig();
                    }

                    /* renamed from: x */
                    public final C3148Ad mo10357x() {
                        return InterstitialActivity.this.f12070ao;
                    }

                    /* renamed from: y */
                    public final C3249a mo10358y() {
                        return new C3249a() {
                            public final String getFallbackScript() {
                                return null;
                            }

                            public final String getJSurl() {
                                return "https://cdn.appnext.com/tools/sdk/interstitial/v75/result.min.js";
                            }

                            public final WebViewClient getWebViewClient() {
                                return null;
                            }

                            /* renamed from: z */
                            public final Object mo10362z() {
                                return null;
                            }
                        };
                    }
                });
                Intent intent = new Intent(InterstitialActivity.this, ResultPageActivity.class);
                intent.putExtra("shouldClose", false);
                intent.setFlags(C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
                InterstitialActivity.this.startActivity(intent);
            } catch (Throwable th) {
                C3117a.m10553a("InterstitialActivity$openResultPage", th);
            }
        }

        @JavascriptInterface
        public void openStore(final String str) {
            InterstitialActivity.this.runOnUiThread(new Runnable() {
                public final void run() {
                    InterstitialActivity.m10449b(InterstitialActivity.this, str);
                }
            });
        }

        @JavascriptInterface
        public void play() {
            try {
                String unused = InterstitialActivity.this.placementID;
                InterstitialActivity.this.loadJS("Appnext.Layout.Video.play();");
            } catch (Throwable th) {
                C3117a.m10553a("InterstitialActivity$play", th);
            }
        }

        @JavascriptInterface
        public void postView(String str) {
            if (InterstitialActivity.this.f12071ap != null) {
                C3211o.m10825az().mo10821a(new Runnable(C3198g.m10796g(str, "b")) {
                    public final void run() {
                        try {
                            if (!TextUtils.isEmpty(InterstitialActivity.this.placementID) && !TextUtils.isEmpty(r3)) {
                                C3169a.m10687o(InterstitialActivity.this).mo10753k(r3, InterstitialActivity.this.f12070ao.getAUID());
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
            if (Boolean.parseBoolean(InterstitialActivity.this.ads != null ? "false" : InterstitialActivity.this.m10451c("pview"))) {
                InterstitialActivity.this.handler.postDelayed(new C3060b(str), Long.parseLong(InterstitialActivity.this.getConfig().mo10732y("postpone_vta_sec")) * 1000);
            }
        }

        @JavascriptInterface
        public void videoPlayed() {
        }
    }

    /* renamed from: com.appnext.ads.interstitial.InterstitialActivity$a */
    private class C3059a implements Runnable {

        /* renamed from: aF */
        AppnextAd f12107aF;

        C3059a(String str) {
            try {
                InterstitialAd interstitialAd = new InterstitialAd(InterstitialActivity.this.f12071ap);
                this.f12107aF = interstitialAd;
                InterstitialAd interstitialAd2 = interstitialAd;
                interstitialAd.setImpressionURL(str);
            } catch (Throwable th) {
                C3117a.m10553a("InterstitialActivity$Impression", th);
            }
        }

        public final void run() {
            try {
                if (InterstitialActivity.this.userAction != null) {
                    InterstitialActivity.this.userAction.mo10827d(this.f12107aF);
                    InterstitialActivity interstitialActivity = InterstitialActivity.this;
                    interstitialActivity.m10443a((Context) interstitialActivity, "impression_event");
                }
            } catch (Throwable th) {
                C3117a.m10553a("InterstitialActivity$Impression", th);
            }
        }
    }

    /* renamed from: com.appnext.ads.interstitial.InterstitialActivity$b */
    private class C3060b implements Runnable {

        /* renamed from: aF */
        AppnextAd f12109aF;

        C3060b(String str) {
            try {
                C3061a.m10493A();
                this.f12109aF = (AppnextAd) C3180d.parseAd(str);
            } catch (Throwable th) {
                C3117a.m10553a("InterstitialActivity$PostView", th);
            }
        }

        public final void run() {
            try {
                InterstitialActivity.this.mo10107a(this.f12109aF, (C3187f.C3196a) null);
            } catch (Throwable th) {
                C3117a.m10553a("InterstitialActivity$PostView", th);
            }
        }
    }

    /* renamed from: l */
    static /* synthetic */ void m10462l(InterstitialActivity interstitialActivity) {
        try {
            Handler handler = interstitialActivity.f12075at;
            if (handler != null) {
                handler.removeCallbacks(interstitialActivity.f12067aB);
            }
            interstitialActivity.f12069an = true;
            String string = interstitialActivity.getIntent().getExtras().getString("creative");
            interstitialActivity.f12072aq = string;
            if (string == null || string.equals(Interstitial.TYPE_MANAGED)) {
                interstitialActivity.f12072aq = interstitialActivity.m10451c("creative");
            }
            C3211o.m10825az().mo10821a(new Runnable() {
                public final void run() {
                    InterstitialActivity.this.mo10319r();
                }
            });
            WebView webView = interstitialActivity.f12068am;
            if (webView == null) {
                interstitialActivity.onError(AppnextError.INTERNAL_ERROR);
                interstitialActivity.finish();
                return;
            }
            if (webView.getParent() != null) {
                ((ViewGroup) interstitialActivity.f12068am.getParent()).removeView(interstitialActivity.f12068am);
            }
            interstitialActivity.f12243dc.addView(interstitialActivity.f12068am);
            interstitialActivity.f12068am.getLayoutParams().width = -1;
            interstitialActivity.f12068am.getLayoutParams().height = -1;
        } catch (Throwable th) {
            C3117a.m10553a("InterstitialActivity$pageFinished", th);
        }
    }

    /* access modifiers changed from: private */
    public void loadJS(final String str) {
        runOnUiThread(new Runnable() {
            public final void run() {
                WebView webView = InterstitialActivity.this.f12068am;
                if (webView != null) {
                    try {
                        webView.loadUrl("javascript:(function() { try { " + str + "} catch(err){ Appnext.jsError(err.message); }})()");
                    } catch (Throwable th) {
                        C3117a.m10553a("InterstitialActivity$loadJS", th);
                    }
                }
            }
        });
    }

    /* renamed from: v */
    static /* synthetic */ int m10472v(InterstitialActivity interstitialActivity) {
        int i = interstitialActivity.f12074as;
        interstitialActivity.f12074as = i + 1;
        return i;
    }

    /* access modifiers changed from: protected */
    public final SettingsManager getConfig() {
        return C3063c.m10511C();
    }

    public void onBackPressed() {
        try {
            Boolean bool = this.canClose;
            if (bool != null) {
                if (!bool.booleanValue()) {
                    return;
                }
            } else if (!Boolean.parseBoolean(m10451c("can_close"))) {
                return;
            }
            loadJS("Appnext.Layout.destroy('internal');");
            this.f12073ar = true;
            m10442a();
            finish();
        } catch (Throwable th) {
            C3117a.m10553a("InterstitialActivity$onBackPressed", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        setRequestedOrientation(7);
        super.onCreate(bundle);
        try {
            if (Interstitial.currentAd == null) {
                finish();
                return;
            }
            this.f12070ao = new Interstitial(Interstitial.currentAd);
            if (getRequestedOrientation() == 6) {
                m10443a((Context) this, "loaded_landscape");
            } else {
                m10443a((Context) this, "loaded_portrait");
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f12243dc = relativeLayout;
            setContentView(relativeLayout);
            this.f12243dc.getLayoutParams().width = -1;
            this.f12243dc.getLayoutParams().height = -1;
            this.f12243dc.setBackgroundColor(-1);
            this.placementID = getIntent().getExtras().getString(TtmlNode.ATTR_ID);
            if (getIntent().hasExtra("auto_play")) {
                Boolean valueOf = Boolean.valueOf(getIntent().getBooleanExtra("auto_play", true));
                this.autoPlay = valueOf;
                if (valueOf.booleanValue()) {
                    m10443a((Context) this, "auto_play_on");
                } else {
                    m10443a((Context) this, "auto_play_off");
                }
            }
            if (getIntent().hasExtra("can_close")) {
                this.canClose = Boolean.valueOf(getIntent().getBooleanExtra("can_close", false));
            }
            if (getIntent().hasExtra("mute")) {
                Boolean valueOf2 = Boolean.valueOf(getIntent().getBooleanExtra("mute", true));
                this.mute = valueOf2;
                if (valueOf2.booleanValue()) {
                    m10443a((Context) this, "mute_on");
                } else {
                    m10443a((Context) this, "mute_off");
                }
            }
            if (getIntent().hasExtra("pview")) {
                this.f12241da = getIntent().getStringExtra("pview");
                this.banner = getIntent().getStringExtra("banner");
                this.guid = getIntent().getStringExtra("guid");
            }
            if (getIntent().getSerializableExtra("ads") != null) {
                this.ads = (ArrayList) getIntent().getSerializableExtra("ads");
            }
            this.f12075at = new Handler();
            AppnextWebView.m10952t(this).mo10885a(this.f12070ao.getPageUrl(), new AppnextWebView.C3257c() {
                /* renamed from: d */
                public final void mo10321d(String str) {
                    InterstitialActivity.m10444a(InterstitialActivity.this);
                }

                public final void error(String str) {
                    try {
                        InterstitialActivity.m10444a(InterstitialActivity.this);
                    } catch (Throwable unused) {
                    }
                }
            });
            this.f12076au = new C3187f.C3196a() {
                public final void error(String str) {
                    try {
                        if (InterstitialActivity.this.handler != null) {
                            InterstitialActivity.this.handler.removeCallbacks((Runnable) null);
                        }
                        InterstitialActivity.this.mo10635ar();
                        String unused = InterstitialActivity.this.placementID;
                        new InterstitialAd(InterstitialActivity.this.f12082j).getAppURL();
                    } catch (Throwable unused2) {
                    }
                }

                public final void onMarket(String str) {
                    try {
                        if (InterstitialActivity.this.handler != null) {
                            InterstitialActivity.this.handler.removeCallbacks((Runnable) null);
                        }
                        InterstitialActivity.this.mo10635ar();
                    } catch (Throwable unused) {
                    }
                }
            };
            this.userAction = new C3213q(this, new C3213q.C3217a() {
                /* renamed from: c */
                public final C3148Ad mo10141c() {
                    return InterstitialActivity.this.f12070ao;
                }

                /* renamed from: d */
                public final AppnextAd mo10142d() {
                    return InterstitialActivity.this.f12082j;
                }

                /* renamed from: e */
                public final SettingsManager mo10143e() {
                    return InterstitialActivity.this.getConfig();
                }

                public final void report(String str) {
                }
            });
            C3211o.m10825az().mo10821a(new Runnable() {
                public final void run() {
                    try {
                        InterstitialActivity interstitialActivity = InterstitialActivity.this;
                        String unused = interstitialActivity.f12081az = C3198g.m10787b((Context) interstitialActivity, true);
                    } catch (Throwable unused2) {
                    }
                }
            });
        } catch (Throwable th) {
            C3117a.m10553a("InterstitialActivity$onCreate", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        try {
            C3061a.m10493A().mo10383g(this.f12070ao);
            this.f12070ao.destroy();
            this.f12070ao = null;
            Handler handler = this.f12075at;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
            this.f12075at = null;
            this.f12067aB = null;
            this.f12071ap = null;
            WebView webView = this.f12068am;
            if (webView != null) {
                webView.stopLoading();
                if (this.f12068am.getParent() != null) {
                    ((ViewGroup) this.f12068am.getParent()).removeView(this.f12068am);
                }
                this.f12068am.setWebChromeClient((WebChromeClient) null);
                this.f12068am.setWebViewClient((WebViewClient) null);
                this.f12068am.destroy();
                this.f12068am = null;
            }
            AppnextWebView.m10952t(this).mo10884a(mo10318q());
            this.f12077av = null;
            this.f12076au = null;
        } catch (Throwable th) {
            C3117a.m10553a("InterstitialActivity$onDestroy", th);
        }
    }

    /* access modifiers changed from: protected */
    public final void onError(final String str) {
        try {
            runOnUiThread(new Runnable() {
                public final void run() {
                    if (InterstitialActivity.this.f12070ao != null) {
                        try {
                            OnAdError onAdErrorCallback = InterstitialActivity.this.f12070ao.getOnAdErrorCallback();
                            if (onAdErrorCallback != null) {
                                onAdErrorCallback.adError(str);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
        } catch (Throwable th) {
            C3117a.m10553a("InterstitialActivity$onError", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        try {
            if (!this.f12073ar) {
                WebView webView = this.f12068am;
                if (webView != null) {
                    webView.loadUrl("javascript:(function() { Appnext.Layout.Video.pause();})()");
                }
            }
        } catch (Throwable th) {
            C3117a.m10553a("InterstitialActivity$onPause", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        Boolean bool;
        super.onResume();
        try {
            if (this.f12066aA) {
                m10442a();
                finish();
                return;
            }
            if (this.f12069an && (bool = this.autoPlay) != null && bool.booleanValue()) {
                loadJS("Appnext.Layout.Video.play();");
            }
            try {
                this.f12068am.loadUrl("javascript:(function() { try{Appnext.countToClose();}catch(e){}})()");
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            C3117a.m10553a("InterstitialActivity$onResume", th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public String m10451c(String str) {
        String y = C3063c.m10511C().mo10732y(str);
        return y == null ? "" : y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10108b(AppnextAd appnextAd, C3187f.C3196a aVar) {
        try {
            mo10634a((ViewGroup) this.f12243dc, getResources().getDrawable(C2980R.C2981drawable.apnxt_loader));
            super.mo10108b(appnextAd, aVar);
        } catch (Throwable th) {
            C3117a.m10553a("InterstitialActivity$doClick", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final WebAppInterface mo10318q() {
        if (this.f12077av == null) {
            this.f12077av = new WebInterface();
        }
        return this.f12077av;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0098 A[Catch:{ all -> 0x0140 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6 A[Catch:{ all -> 0x0140 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d4 A[Catch:{ all -> 0x0140 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ec A[Catch:{ all -> 0x0140 }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10319r() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.appnext.ads.interstitial.a r0 = com.appnext.ads.interstitial.C3061a.m10493A()     // Catch:{ all -> 0x0140 }
            com.appnext.ads.interstitial.Interstitial r1 = r8.f12070ao     // Catch:{ all -> 0x0140 }
            java.lang.String r2 = r8.f12072aq     // Catch:{ all -> 0x0140 }
            java.util.ArrayList r0 = r0.mo10381b(r8, r1, r2)     // Catch:{ all -> 0x0140 }
            if (r0 != 0) goto L_0x0019
            r8.finish()     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "No Ads"
            r8.onError(r0)     // Catch:{ all -> 0x0140 }
            monitor-exit(r8)
            return
        L_0x0019:
            com.appnext.ads.interstitial.a r1 = com.appnext.ads.interstitial.C3061a.m10493A()     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = r1.mo10379a(r0)     // Catch:{ all -> 0x0140 }
            if (r1 != 0) goto L_0x002d
            r8.finish()     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "No Ads"
            r8.onError(r0)     // Catch:{ all -> 0x0140 }
            monitor-exit(r8)
            return
        L_0x002d:
            java.lang.String r2 = " "
            java.lang.String r3 = "\\u2028"
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ all -> 0x0140 }
            java.lang.String r2 = " "
            java.lang.String r3 = "\\u2029"
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ all -> 0x0140 }
            r8.f12080ay = r1     // Catch:{ all -> 0x0140 }
            com.appnext.ads.interstitial.InterstitialAd r2 = new com.appnext.ads.interstitial.InterstitialAd     // Catch:{ all -> 0x0140 }
            r3 = 0
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0140 }
            com.appnext.core.AppnextAd r4 = (com.appnext.core.AppnextAd) r4     // Catch:{ all -> 0x0140 }
            r2.<init>(r4)     // Catch:{ all -> 0x0140 }
            r8.f12071ap = r2     // Catch:{ all -> 0x0140 }
            android.content.res.Resources r2 = r8.getResources()     // Catch:{ all -> 0x0140 }
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch:{ all -> 0x0140 }
            int r2 = r2.orientation     // Catch:{ all -> 0x0140 }
            org.json.JSONObject r2 = r8.mo10320s()     // Catch:{ all -> 0x0140 }
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0140 }
            com.appnext.core.AppnextAd r4 = (com.appnext.core.AppnextAd) r4     // Catch:{ all -> 0x0140 }
            java.lang.String r5 = r4.getVideoUrl()     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = ""
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0140 }
            r6 = 1
            if (r5 == 0) goto L_0x0095
            java.lang.String r5 = r4.getVideoUrlHigh()     // Catch:{ all -> 0x0140 }
            java.lang.String r7 = ""
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x0140 }
            if (r5 == 0) goto L_0x0095
            java.lang.String r5 = r4.getVideoUrl30Sec()     // Catch:{ all -> 0x0140 }
            java.lang.String r7 = ""
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x0140 }
            if (r5 == 0) goto L_0x0095
            java.lang.String r4 = r4.getVideoUrlHigh30Sec()     // Catch:{ all -> 0x0140 }
            java.lang.String r5 = ""
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0140 }
            if (r4 != 0) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r4 = 0
            goto L_0x0096
        L_0x0095:
            r4 = 1
        L_0x0096:
            if (r4 == 0) goto L_0x00b6
            java.lang.String r4 = "remote_auto_play"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            r5.<init>()     // Catch:{ all -> 0x0140 }
            java.lang.Boolean r7 = r8.autoPlay     // Catch:{ all -> 0x0140 }
            if (r7 == 0) goto L_0x00aa
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0140 }
            if (r7 == 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r6 = 0
        L_0x00ab:
            r5.append(r6)     // Catch:{ all -> 0x0140 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0140 }
            r2.put(r4, r5)     // Catch:{ all -> 0x0140 }
            goto L_0x00bd
        L_0x00b6:
            java.lang.String r4 = "remote_auto_play"
            java.lang.String r5 = "false"
            r2.put(r4, r5)     // Catch:{ all -> 0x0140 }
        L_0x00bd:
            com.appnext.ads.interstitial.InterstitialAd r4 = new com.appnext.ads.interstitial.InterstitialAd     // Catch:{ all -> 0x0140 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0140 }
            com.appnext.core.AppnextAd r0 = (com.appnext.core.AppnextAd) r0     // Catch:{ all -> 0x0140 }
            r4.<init>(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = r4.getButtonText()     // Catch:{ all -> 0x0140 }
            java.lang.String r3 = ""
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0140 }
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = r4.getAdPackage()     // Catch:{ all -> 0x0140 }
            boolean r0 = com.appnext.core.C3198g.m10789b((android.content.Context) r8, (java.lang.String) r0)     // Catch:{ all -> 0x0140 }
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = "existing_button_text"
            java.lang.String r0 = r8.m10451c((java.lang.String) r0)     // Catch:{ all -> 0x0140 }
            goto L_0x00f0
        L_0x00e5:
            java.lang.String r0 = "new_button_text"
            java.lang.String r0 = r8.m10451c((java.lang.String) r0)     // Catch:{ all -> 0x0140 }
            goto L_0x00f0
        L_0x00ec:
            java.lang.String r0 = r4.getButtonText()     // Catch:{ all -> 0x0140 }
        L_0x00f0:
            java.lang.String r3 = "b_title"
            r2.put(r3, r0)     // Catch:{ all -> 0x0140 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            java.lang.String r3 = "Appnext.setParams("
            r0.<init>(r3)     // Catch:{ all -> 0x0140 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0140 }
            r0.append(r2)     // Catch:{ all -> 0x0140 }
            java.lang.String r2 = ");"
            r0.append(r2)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0140 }
            r8.loadJS(r0)     // Catch:{ all -> 0x0140 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            java.lang.String r2 = "Appnext.loadInterstitial("
            r0.<init>(r2)     // Catch:{ all -> 0x0140 }
            r0.append(r1)     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = ");"
            r0.append(r1)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0140 }
            r8.loadJS(r0)     // Catch:{ all -> 0x0140 }
            com.appnext.ads.interstitial.a r0 = com.appnext.ads.interstitial.C3061a.m10493A()     // Catch:{ all -> 0x0140 }
            com.appnext.ads.interstitial.InterstitialAd r1 = r8.f12071ap     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = r1.getBannerID()     // Catch:{ all -> 0x0140 }
            com.appnext.ads.interstitial.Interstitial r2 = com.appnext.ads.interstitial.Interstitial.currentAd     // Catch:{ all -> 0x0140 }
            r0.mo10236a((java.lang.String) r1, (com.appnext.core.C3148Ad) r2)     // Catch:{ all -> 0x0140 }
            android.os.Handler r0 = r8.handler     // Catch:{ all -> 0x0140 }
            com.appnext.ads.interstitial.InterstitialActivity$4 r1 = new com.appnext.ads.interstitial.InterstitialActivity$4     // Catch:{ all -> 0x0140 }
            r1.<init>()     // Catch:{ all -> 0x0140 }
            r0.post(r1)     // Catch:{ all -> 0x0140 }
            monitor-exit(r8)
            return
        L_0x0140:
            r0 = move-exception
            java.lang.String r1 = "InterstitialActivity$loadAdsData"
            com.appnext.base.C3117a.m10553a(r1, r0)     // Catch:{ all -> 0x0150 }
            r8.finish()     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = "Internal error"
            r8.onError(r0)     // Catch:{ all -> 0x0150 }
            monitor-exit(r8)
            return
        L_0x0150:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.interstitial.InterstitialActivity.mo10319r():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final JSONObject mo10320s() throws JSONException {
        String str;
        try {
            String c = this.f12070ao.getButtonColor().equals("") ? m10451c("button_color") : this.f12070ao.getButtonColor();
            if (c.startsWith("#")) {
                c = c.substring(1);
            }
            if (this.autoPlay == null) {
                this.autoPlay = Boolean.valueOf(Boolean.parseBoolean(m10451c("auto_play")));
            }
            if (this.mute == null) {
                this.mute = Boolean.valueOf(Boolean.parseBoolean(m10451c("mute")));
            }
            JSONObject jSONObject = new JSONObject();
            String str2 = "InterstitialActivity$getAdParams";
            try {
                jSONObject.put(TtmlNode.ATTR_ID, this.placementID);
                jSONObject.put("cat", this.f12070ao.getCategories());
                jSONObject.put("lockcat", this.f12070ao.getSpecificCategories());
                jSONObject.put("pbk", this.f12070ao.getPostback());
                jSONObject.put("b_color", c);
                if (this.ads == null) {
                    jSONObject.put("skip_title", this.f12070ao.getSkipText().equals("") ? m10451c("skip_title") : this.f12070ao.getSkipText());
                    jSONObject.put("pview", this.ads != null ? "false" : m10451c("pview"));
                    jSONObject.put("video_length", m10451c("video_length"));
                    jSONObject.put("min_internet_connection", m10451c("min_internet_connection"));
                    jSONObject.put("min_internet_connection_video", m10451c("min_internet_connection_video"));
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.mute);
                    jSONObject.put("mute", sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.autoPlay);
                    jSONObject.put("auto_play", sb2.toString());
                    jSONObject.put("remove_poster_on_auto_play", m10451c("remove_poster_on_auto_play"));
                    jSONObject.put("show_rating", m10451c("show_rating"));
                    jSONObject.put("show_desc", m10451c("show_desc"));
                    jSONObject.put("creative", this.f12072aq);
                    jSONObject.put("remote_auto_play", true);
                }
                jSONObject.put("stp_flag", m10451c("stp_flag"));
                jSONObject.put("ext", "t");
                jSONObject.put("dct", C3198g.m10795g(this));
                jSONObject.put("did", this.f12081az);
                jSONObject.put("devn", C3198g.m10785au());
                jSONObject.put("dosv", Build.VERSION.SDK_INT);
                jSONObject.put("dds", SessionDescription.SUPPORTED_SDP_VERSION);
                jSONObject.put("urlApp_protection", m10451c("urlApp_protection"));
                jSONObject.put("vid", this.f12070ao.getVID());
                jSONObject.put("tid", this.f12070ao.getTID());
                jSONObject.put("auid", this.f12070ao.getAUID());
                jSONObject.put("osid", "100");
                jSONObject.put("ads_type", IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
                jSONObject.put("country", this.f12071ap.getCountry());
                jSONObject.put("gdpr", C3202i.m10805a((AppnextAd) this.f12071ap, (SettingsManager) C3063c.m10511C()));
                jSONObject.put("lang_settings", new JSONObject(C3167a.m10684q(this).mo10750aF()).toString());
                String language = this.f12070ao.getLanguage();
                if (language == null || language.equals("")) {
                    language = Locale.getDefault().getLanguage().toUpperCase();
                }
                jSONObject.put("lang", language);
                jSONObject.put("tem", new JSONArray(m10451c("S1")).toString());
                jSONObject.put("click_x", m10451c("clickType_A"));
                if (getIntent() != null && getIntent().hasExtra("show_desc")) {
                    jSONObject.put("show_desc", getIntent().getStringExtra("show_desc"));
                }
                try {
                    Bitmap u = C3198g.m10801u(this.f12071ap.getImageURL());
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    u.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    String str3 = "data:image/" + this.f12071ap.getImageURL().substring(this.f12071ap.getImageURL().lastIndexOf(46) + 1) + ";base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                    try {
                        C5199b.C5203d i = C5199b.m23593b(u).mo21401a().mo21399i();
                        if (i != null) {
                            jSONObject.put("icon_color", String.format("#%06X", new Object[]{Integer.valueOf(i.mo21406e() & 16777215)}));
                        } else {
                            jSONObject.put("icon_color", "");
                        }
                        String str4 = str2;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            C3117a.m10553a(str, th);
                            return jSONObject;
                        } catch (Throwable th2) {
                            th = th2;
                            C3117a.m10553a(str, th);
                            return new JSONObject();
                        }
                    }
                    jSONObject.put("icon_src", str3);
                } catch (Throwable th3) {
                    th = th3;
                    str = str2;
                    C3117a.m10553a(str, th);
                    return jSONObject;
                }
                return jSONObject;
            } catch (Throwable th4) {
                th = th4;
                str = str2;
                C3117a.m10553a(str, th);
                return new JSONObject();
            }
        } catch (Throwable th5) {
            th = th5;
            str = "InterstitialActivity$getAdParams";
            C3117a.m10553a(str, th);
            return new JSONObject();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10442a() {
        OnAdClosed onAdClosedCallback;
        try {
            Interstitial interstitial = this.f12070ao;
            if (interstitial != null && (onAdClosedCallback = interstitial.getOnAdClosedCallback()) != null) {
                onAdClosedCallback.onAdClosed();
            }
        } catch (Throwable th) {
            C3117a.m10553a("InterstitialActivity$onClose", th);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m10449b(InterstitialActivity interstitialActivity, String str) {
        OnAdClicked onAdClickedCallback;
        try {
            C3061a.m10493A();
            AppnextAd appnextAd = (AppnextAd) C3180d.parseAd(str);
            if (appnextAd != null) {
                interstitialActivity.f12082j = new InterstitialAd(appnextAd);
                Interstitial interstitial = interstitialActivity.f12070ao;
                if (!(interstitial == null || (onAdClickedCallback = interstitial.getOnAdClickedCallback()) == null)) {
                    onAdClickedCallback.adClicked();
                }
                interstitialActivity.mo10108b(interstitialActivity.f12082j, interstitialActivity.f12076au);
                interstitialActivity.m10443a((Context) interstitialActivity, "click_event");
                String bannerID = interstitialActivity.f12082j.getBannerID();
                InterstitialAd interstitialAd = interstitialActivity.f12071ap;
                if (bannerID.equals(interstitialAd != null ? interstitialAd.getBannerID() : "")) {
                    if (!interstitialActivity.f12078aw) {
                        interstitialActivity.f12078aw = true;
                        interstitialActivity.m10443a((Context) interstitialActivity, "interstitial_main_click");
                    }
                } else if (!interstitialActivity.f12079ax) {
                    interstitialActivity.f12079ax = true;
                    interstitialActivity.m10443a((Context) interstitialActivity, "interstitial_suggested_click");
                }
            }
        } catch (Throwable th) {
            C3117a.m10553a("InterstitialActivity$adClick", th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10443a(Context context, String str) {
        try {
            Interstitial interstitial = this.f12070ao;
            if (interstitial != null) {
                String tid = interstitial.getTID();
                String vid = this.f12070ao.getVID();
                String auid = this.f12070ao.getAUID();
                String placementID = this.f12070ao.getPlacementID();
                String sessionId = this.f12070ao.getSessionId();
                InterstitialAd interstitialAd = this.f12071ap;
                String bannerID = interstitialAd != null ? interstitialAd.getBannerID() : "";
                InterstitialAd interstitialAd2 = this.f12071ap;
                C3198g.m10781a(context, tid, vid, auid, placementID, sessionId, str, "current_interstitial", bannerID, interstitialAd2 != null ? interstitialAd2.getCampaignID() : "");
            }
        } catch (Throwable th) {
            C3117a.m10553a("InterstitialActivity$report", th);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m10444a(InterstitialActivity interstitialActivity) {
        try {
            AppnextWebView t = AppnextWebView.m10952t(interstitialActivity);
            interstitialActivity.f12068am = t.mo10881H(interstitialActivity.ads != null ? "fullscreen" : IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
            WebView a = t.mo10883a(interstitialActivity, interstitialActivity.f12070ao.getPlacementID(), interstitialActivity.f12070ao.getAUID(), interstitialActivity.f12070ao.getPageUrl(), interstitialActivity.mo10318q(), interstitialActivity.f12070ao.getFallback(), interstitialActivity.ads != null ? "fullscreen" : IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
            interstitialActivity.f12068am = a;
            a.setWebViewClient(new WebViewClient() {
                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    InterstitialActivity.this.f12075at.removeCallbacksAndMessages((Object) null);
                    InterstitialActivity.m10462l(InterstitialActivity.this);
                }

                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (str == null) {
                        return false;
                    }
                    if (!str.startsWith("http")) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    webView.loadUrl(str);
                    return true;
                }
            });
            interstitialActivity.f12068am.setWebChromeClient(new WebChromeClient() {
                public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                    consoleMessage.message();
                    if (consoleMessage.message().contains("pause")) {
                        return true;
                    }
                    if (!consoleMessage.message().contains("TypeError") && !consoleMessage.message().contains("has no method") && !consoleMessage.message().contains("is not a function")) {
                        return true;
                    }
                    InterstitialActivity.this.onError(AppnextError.INTERNAL_ERROR);
                    InterstitialActivity.this.finish();
                    return true;
                }
            });
        } catch (Throwable th) {
            C3117a.m10553a("InterstitialActivity$initWebView", th);
            interstitialActivity.onError(AppnextError.INTERNAL_ERROR);
            interstitialActivity.finish();
        }
    }
}
