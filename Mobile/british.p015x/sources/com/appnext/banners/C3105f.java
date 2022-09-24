package com.appnext.banners;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextAd;
import com.appnext.core.C3148Ad;
import com.appnext.core.C3187f;
import com.appnext.core.C3198g;
import com.appnext.core.C3202i;
import com.appnext.core.C3211o;
import com.appnext.core.SettingsManager;
import com.appnext.core.p034a.C3167a;
import com.appnext.core.webview.AppnextWebView;
import com.google.android.exoplayer2.C6540C;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.p289c.C11539d;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appnext.banners.f */
public class C3105f extends C3076a {
    /* access modifiers changed from: private */
    public String adsid = "";
    /* access modifiers changed from: private */
    public boolean clicked = false;
    /* access modifiers changed from: private */
    public Handler handler = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public Handler refreshHandler = new Handler(Looper.getMainLooper());
    private BannerAdData selectedAd = null;
    /* access modifiers changed from: private */
    public ArrayList<String> shown = new ArrayList<>();
    protected WebView webView;

    /* renamed from: com.appnext.banners.f$a */
    public class C3112a {
        public C3112a() {
        }

        @JavascriptInterface
        public void destroy(String str) {
        }

        @JavascriptInterface
        public void jsError(String str) {
        }

        @JavascriptInterface
        public void logSTP(String str, String str2) {
            C3198g.m10782a((C3148Ad) C3105f.this.getBannerAd(), (AppnextAd) C3105f.this.getSelectedAd(), str, str2, (SettingsManager) C3103d.m10544I());
        }

        @JavascriptInterface
        public void openLink(String str) {
            if (!C3105f.this.isDestroyed()) {
                C3105f.this.openLink(str);
            }
        }

        @JavascriptInterface
        public void openStore(String str) {
            if (C3105f.this.handler != null) {
                C3105f.this.handler.removeCallbacksAndMessages((Object) null);
                if (!C3105f.this.isDestroyed()) {
                    C3105f.this.handler.post(new Runnable() {
                        public final void run() {
                            try {
                                if (!C3105f.this.getSelectedAd().getWebview().equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                                    C3105f.this.click();
                                    return;
                                }
                                char c = 65535;
                                if (C3105f.this.getSelectedAd().getRevenueType().equals("cpi")) {
                                    C3103d I = C3103d.m10544I();
                                    String lowerCase = I.mo10732y(C3105f.this.getBannerSize().toString() + "_cpiActiveFlow").toLowerCase();
                                    C3105f.this.getBannerSize().toString();
                                    switch (lowerCase.hashCode()) {
                                        case 97:
                                            if (lowerCase.equals("a")) {
                                                c = 0;
                                                break;
                                            }
                                            break;
                                        case 98:
                                            if (lowerCase.equals("b")) {
                                                c = 1;
                                                break;
                                            }
                                            break;
                                        case 99:
                                            if (lowerCase.equals("c")) {
                                                c = 2;
                                                break;
                                            }
                                            break;
                                        case 100:
                                            if (lowerCase.equals(C11539d.f51879a)) {
                                                c = 3;
                                                break;
                                            }
                                            break;
                                    }
                                    if (c != 0) {
                                        if (c == 1) {
                                            boolean unused = C3105f.this.clicked = true;
                                        } else if (c == 2) {
                                            C3105f.this.openResultPage(false);
                                            return;
                                        }
                                        C3105f.this.click();
                                        return;
                                    }
                                    C3105f.this.openResultPage(true);
                                    return;
                                }
                                C3103d I2 = C3103d.m10544I();
                                String lowerCase2 = I2.mo10732y(C3105f.this.getBannerSize().toString() + "_cpcActiveFlow").toLowerCase();
                                C3105f.this.getBannerSize().toString();
                                int hashCode = lowerCase2.hashCode();
                                if (hashCode != 97) {
                                    if (hashCode == 98) {
                                        if (lowerCase2.equals("b")) {
                                            c = 1;
                                        }
                                    }
                                } else if (lowerCase2.equals("a")) {
                                    c = 0;
                                }
                                if (c != 0) {
                                    C3105f.this.click();
                                    return;
                                }
                                boolean unused2 = C3105f.this.clicked = true;
                                C3105f.this.click();
                            } catch (Throwable unused3) {
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.appnext.banners.f$b */
    public class C3114b extends WebViewClient {
        public C3114b() {
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                C3105f.this.pageFinished();
            } catch (Throwable th) {
                C3117a.m10553a("JSBannerAdapter$JSWebViewClient", th);
            }
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26 || renderProcessGoneDetail.didCrash()) {
                return false;
            }
            if (webView == null) {
                return true;
            }
            webView.destroy();
            return true;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str == null) {
                return false;
            }
            try {
                if (str.startsWith("http")) {
                    webView.loadUrl(str);
                    return true;
                }
            } catch (Throwable th) {
                C3117a.m10553a("JSBannerAdapter$JSWebViewClient", th);
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    private void activateAutoRefresh() {
        int i;
        C3103d I = C3103d.m10544I();
        try {
            i = Integer.parseInt(I.mo10732y(getBannerSize().toString().toLowerCase() + "_ar"));
        } catch (Throwable unused) {
            i = 10;
        }
        if (Boolean.parseBoolean(I.mo10732y("_arFlag")) && i > 0) {
            this.refreshHandler.postDelayed(new Runnable() {
                public final void run() {
                    try {
                        C3101b H = C3101b.m10528H();
                        C3105f fVar = C3105f.this;
                        AppnextAd a = H.mo10503a(fVar.context, (C3148Ad) fVar.getBannerAd(), (ArrayList<?>) C3105f.this.getAds(), C3105f.this.getAdRequest().getCreativeType(), (ArrayList<String>) C3105f.this.shown);
                        if (a != null) {
                            C3105f.this.setSelectedAd(new BannerAdData(a));
                            if (Boolean.parseBoolean(C3103d.m10544I().mo10732y("impOne"))) {
                                C3105f.this.setReportedImpression(false);
                                C3105f.this.impression();
                            } else if (Boolean.parseBoolean(C3103d.m10544I().mo10732y("pview"))) {
                                C3105f.this.refreshHandler.postDelayed(new Runnable() {
                                    public final void run() {
                                        C3105f.this.getUserAction().mo10822a(C3105f.this.getSelectedAd(), C3105f.this.getSelectedAd().getImpressionURL(), (C3187f.C3196a) null);
                                    }
                                }, (long) (Integer.parseInt(C3103d.m10544I().mo10732y("postpone_vta_sec")) * 1000));
                            }
                            C3105f.this.pageFinished();
                        }
                    } catch (Throwable th) {
                        C3117a.m10553a("JSBannerAdapter$activateAutoRefresh", th);
                    }
                }
            }, (long) (i * 1000));
        }
    }

    /* access modifiers changed from: private */
    public boolean isDestroyed() {
        return getBannerAd() == null;
    }

    /* access modifiers changed from: private */
    public void openResultPage(boolean z) {
        Intent intent = new Intent(this.context, BannerActivity.class);
        intent.putExtra(IronSourceConstants.EVENTS_PLACEMENT_NAME, getBannerAd().getPlacementID());
        intent.putExtra("postback", getBannerAd().getPostback());
        intent.putExtra("category", getBannerAd().getCategories());
        intent.putExtra("clicked", getSelectedAd().getBannerID());
        intent.putExtra("selected", getSelectedAd());
        intent.putExtra("size", getBannerSize().toString());
        intent.putExtra("shouldClose", z);
        intent.setFlags(C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
        this.context.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public void pageFinished() {
        if (!isDestroyed()) {
            C3211o.m10825az().mo10821a(new Runnable() {
                public final void run() {
                    try {
                        C3105f fVar = C3105f.this;
                        String unused = fVar.adsid = C3198g.m10787b(fVar.context, false);
                        C3105f.this.handler.removeCallbacksAndMessages((Object) null);
                        C3105f.this.handler.post(new Runnable() {
                            public final void run() {
                                try {
                                    C3105f.this.loadJS("javascript:(function() { try { Appnext.Layout.destroy('internal'); } catch(err){ Appnext.jsError(err.message); }})()");
                                    C3105f fVar = C3105f.this;
                                    fVar.loadJS("javascript:(function() { try { Appnext.setParams(" + C3105f.this.getConfigParams().toString() + "); } catch(err){ Appnext.jsError(err.message); }})()");
                                    C3105f fVar2 = C3105f.this;
                                    fVar2.loadJS("javascript:(function() { try { Appnext.loadBanner(" + new JSONObject(C3105f.this.getSelectedAd().getAdJSON()).toString() + ",'" + C3105f.this.getBannerSize().toString() + "'); } catch(err){ Appnext.jsError(err.message); }})()");
                                    C3105f.this.shown.add(C3105f.this.getSelectedAd().getBannerID());
                                } catch (Throwable unused) {
                                }
                            }
                        });
                    } catch (Throwable th) {
                        C3117a.m10553a("JSBannerAdapter$pageFinished", th);
                    }
                }
            });
        }
    }

    public void destroy() {
        super.destroy();
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        WebView webView = C3105f.this.webView;
                        if (webView != null) {
                            ViewGroup viewGroup = (ViewGroup) webView.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(C3105f.this.webView);
                            }
                            C3105f.this.webView.destroyDrawingCache();
                            C3105f.this.webView.destroy();
                        }
                    } catch (Throwable th) {
                        C3117a.m10553a("JSBannerAdapter$destroy", th);
                    }
                }
            });
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages((Object) null);
            }
            Handler handler3 = this.refreshHandler;
            if (handler3 != null) {
                handler3.removeCallbacksAndMessages((Object) null);
            }
        } catch (Throwable th) {
            C3117a.m10553a("JSBannerAdapter$destroy", th);
        }
    }

    /* access modifiers changed from: protected */
    public JSONObject getConfigParams() throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("vid", "2.6.5.473");
        jSONObject.put("tid", getBannerAd() == null ? "" : getBannerAd().getTID());
        if (getBannerAd() == null) {
            str = "";
        } else {
            str = getBannerAd().getAUID();
        }
        jSONObject.put("auid", str);
        jSONObject.put("osid", "100");
        jSONObject.put("tem_id", getBannerAd().getTemId(getSelectedAd()));
        jSONObject.put(TtmlNode.ATTR_ID, getPlacementId());
        jSONObject.put("b_title", getButtonText(getSelectedAd()));
        jSONObject.put("creative", getCreativeType(getSelectedAd()) == 0 ? "video" : "static");
        jSONObject.put("cat", getSelectedAd().getCategories());
        jSONObject.put("lockcat", getSelectedAd().getSpecificCategories());
        jSONObject.put("pview", C3103d.m10544I().mo10732y("pview"));
        jSONObject.put("video_length", getAdRequest().getVideoLength());
        StringBuilder sb = new StringBuilder();
        sb.append(getAdRequest().isMute());
        jSONObject.put("mute", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getAdRequest().isAutoPlay());
        jSONObject.put("auto_play", sb2.toString());
        jSONObject.put("remove_poster_on_auto_play", C3103d.m10544I().mo10732y("remove_poster_on_auto_play"));
        jSONObject.put("remote_auto_play", true);
        jSONObject.put("did", this.adsid);
        jSONObject.put("devn", C3198g.m10785au());
        jSONObject.put("dosv", Build.VERSION.SDK_INT);
        jSONObject.put("dds", SessionDescription.SUPPORTED_SDP_VERSION);
        jSONObject.put("ads_type", "banner");
        jSONObject.put("country", getSelectedAd().getCountry());
        jSONObject.put("gdpr", C3202i.m10805a((AppnextAd) getSelectedAd(), (SettingsManager) C3103d.m10544I()));
        jSONObject.put("lang_settings", new JSONObject(C3167a.m10684q(this.context).mo10750aF()).toString());
        String language = getLanguage();
        if (language == null || language.equals("")) {
            language = Locale.getDefault().getLanguage().toUpperCase();
        }
        jSONObject.put("lang", language);
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    public String getFallbackScript() {
        return new C3102c().mo10384B();
    }

    /* access modifiers changed from: protected */
    public String getJSurl() {
        return "https://cdn.appnext.com/tools/sdk/banner/2.4.3/banner.min.js";
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        try {
            if (getBannerSize().toString().equals(BannerSize.BANNER.toString())) {
                return C3073R.layout.apnxt_banner;
            }
            if (getBannerSize().toString().equals(BannerSize.LARGE_BANNER.toString())) {
                return C3073R.layout.apnxt_large_banner;
            }
            if (getBannerSize().toString().equals(BannerSize.MEDIUM_RECTANGLE.toString())) {
                return C3073R.layout.apnxt_medium_rectangle;
            }
            return C3073R.layout.apnxt_banner;
        } catch (Throwable th) {
            C3117a.m10553a("JSBannerAdapter$getLayout", th);
        }
    }

    /* access modifiers changed from: protected */
    public BannerAdData getSelectedAd() {
        try {
            if (this.selectedAd == null || (super.getSelectedAd() != null && !super.getSelectedAd().getBannerID().equals(this.selectedAd.getBannerID()))) {
                BannerAdData bannerAdData = new BannerAdData(super.getSelectedAd());
                this.selectedAd = bannerAdData;
                bannerAdData.setImpressionURL(this.selectedAd.getImpressionURL() + "&tem_id=" + getBannerAd().getTemId(this.selectedAd));
                BannerAdData bannerAdData2 = this.selectedAd;
                bannerAdData2.setAppURL(this.selectedAd.getAppURL() + "&tem_id=" + getBannerAd().getTemId(this.selectedAd));
            }
        } catch (Throwable th) {
            C3117a.m10553a("JSBannerAdapter$getSelectedAd", th);
        }
        return this.selectedAd;
    }

    /* access modifiers changed from: protected */
    public String getTargetJSurl() {
        return "https://cdn.appnext.com/tools/sdk/banner/2.4.3/result.min.js";
    }

    /* access modifiers changed from: protected */
    public C3112a getWebInterface() {
        return new C3112a();
    }

    /* access modifiers changed from: protected */
    public WebViewClient getWebViewClient() {
        return new C3114b();
    }

    public void impression() {
        try {
            boolean isReportedImpression = isReportedImpression();
            super.impression();
            if (isReportedImpression != isReportedImpression()) {
                activateAutoRefresh();
            }
        } catch (Throwable th) {
            C3117a.m10553a("JSBannerAdapter$impression", th);
        }
    }

    /* access modifiers changed from: protected */
    public void inflateView(int i, AppnextAd appnextAd) {
        try {
            if (this.webView != null) {
                this.rootView.removeAllViews();
                this.webView.destroyDrawingCache();
                this.webView.destroy();
            }
            View inflate = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(getLayout(), this.rootView, false);
            WebView webView2 = new WebView(this.context.getApplicationContext());
            this.webView = webView2;
            ((ViewGroup) inflate).addView(webView2);
            this.webView.getLayoutParams().height = -1;
            this.webView.getLayoutParams().width = -1;
            this.webView.getSettings().setJavaScriptEnabled(true);
            this.webView.getSettings().setAppCacheEnabled(true);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                this.webView.getSettings().setMixedContentMode(0);
            }
            if (i2 >= 17) {
                this.webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            this.webView.setWebChromeClient(new WebChromeClient() {
                public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                    consoleMessage.messageLevel().name();
                    consoleMessage.lineNumber();
                    consoleMessage.message();
                    consoleMessage.sourceId();
                    consoleMessage.lineNumber();
                    return true;
                }
            });
            this.webView.setWebViewClient(getWebViewClient());
            loadWebview(getJSurl());
            AppnextWebView.m10952t(this.context).mo10885a(getTargetJSurl(), (AppnextWebView.C3257c) null);
            this.webView.addJavascriptInterface(getWebInterface(), "Appnext");
            this.rootView.addView(inflate);
        } catch (Throwable th) {
            C3117a.m10553a("JSBannerAdapter$inflateView", th);
        }
    }

    /* access modifiers changed from: protected */
    public void loadJS(String str) {
        try {
            WebView webView2 = this.webView;
            if (webView2 != null) {
                webView2.loadUrl(str);
            }
        } catch (Throwable th) {
            C3117a.m10553a("JSBannerAdapter$loadJS", th);
        }
    }

    /* access modifiers changed from: protected */
    public void loadWebview(String str) {
        try {
            URL url = new URL(str);
            this.webView.setBackgroundColor(0);
            this.webView.loadDataWithBaseURL(url.getProtocol() + "://" + url.getHost(), "<html ValidateRequest=\"false\" ><body><script src='https://cdn.appnext.com/tools/sdk/banner/2.4.0/banner.min.js'></script></body></html>", (String) null, C6540C.UTF8_NAME, (String) null);
        } catch (Throwable th) {
            C3117a.m10553a("JSBannerAdapter$loadWebview", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        if (i == 0) {
            try {
                if (this.clicked) {
                    this.clicked = false;
                    openResultPage(false);
                }
            } catch (Throwable th) {
                C3117a.m10553a("JSBannerAdapter$onWindowVisibilityChanged", th);
            }
        }
    }
}
