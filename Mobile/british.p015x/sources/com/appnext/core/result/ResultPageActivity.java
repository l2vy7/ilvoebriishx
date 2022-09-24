package com.appnext.core.result;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextAd;
import com.appnext.core.C3148Ad;
import com.appnext.core.C3187f;
import com.appnext.core.C3198g;
import com.appnext.core.C3201h;
import com.appnext.core.C3207k;
import com.appnext.core.C3211o;
import com.appnext.core.C3213q;
import com.appnext.core.SettingsManager;
import com.appnext.core.webview.AppnextWebView;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.net.URL;
import org.json.JSONObject;

public class ResultPageActivity extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: aA */
    public boolean f12427aA;
    /* access modifiers changed from: private */

    /* renamed from: ay */
    public String f12428ay;
    /* access modifiers changed from: private */

    /* renamed from: cA */
    public String f12429cA;
    /* access modifiers changed from: private */

    /* renamed from: fg */
    public AppnextAd f12430fg;
    /* access modifiers changed from: private */

    /* renamed from: fh */
    public String f12431fh;

    /* renamed from: fi */
    private C3249a f12432fi;
    /* access modifiers changed from: private */

    /* renamed from: fj */
    public C3251c f12433fj;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public AppnextAd f12434j;
    /* access modifiers changed from: private */
    public String placementID;
    /* access modifiers changed from: private */
    public C3213q userAction;
    private WebView webView;

    private class CustomAd extends AppnextAd {
        CustomAd(AppnextAd appnextAd) {
            super(appnextAd);
        }

        /* access modifiers changed from: protected */
        public String getAdJSON() {
            return super.getAdJSON();
        }

        public String getAppURL() {
            return super.getAppURL();
        }

        /* access modifiers changed from: protected */
        public String getImpressionURL() {
            return super.getImpressionURL();
        }

        /* access modifiers changed from: protected */
        public void setAdJSON(String str) {
            super.setAdJSON(str);
        }

        /* access modifiers changed from: protected */
        public void setStoreRating(String str) {
            super.setStoreRating(str);
        }
    }

    /* renamed from: com.appnext.core.result.ResultPageActivity$a */
    public class C3244a extends WebViewClient {
        public C3244a() {
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                C3211o.m10825az().mo10821a(new Runnable() {
                    public final void run() {
                        final String b = C3198g.m10787b((Context) ResultPageActivity.this, false);
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public final void run() {
                                try {
                                    ResultPageActivity resultPageActivity = ResultPageActivity.this;
                                    resultPageActivity.loadJS("Appnext.setParams(" + C3252d.m10942aX().mo10880aY().getConfigParams().put("did", b).toString() + ");");
                                } catch (Throwable unused) {
                                }
                                ResultPageActivity resultPageActivity2 = ResultPageActivity.this;
                                StringBuilder sb = new StringBuilder("Appnext.load(");
                                ResultPageActivity resultPageActivity3 = ResultPageActivity.this;
                                sb.append(resultPageActivity3.m10923f(resultPageActivity3.f12430fg).getAdJSON());
                                sb.append(",");
                                sb.append(ResultPageActivity.this.f12428ay);
                                sb.append(",");
                                sb.append(ResultPageActivity.this.f12429cA);
                                sb.append(");");
                                resultPageActivity2.loadJS(sb.toString());
                            }
                        });
                    }
                });
            } catch (Throwable th) {
                C3117a.m10553a("WebInterface$onPageFinished", th);
            }
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
    }

    /* renamed from: com.appnext.core.result.ResultPageActivity$b */
    public class C3247b {
        public C3247b() {
        }

        @JavascriptInterface
        public final void adClicked(String str, int i) {
            try {
                ResultPageActivity resultPageActivity = ResultPageActivity.this;
                AppnextAd unused = resultPageActivity.f12434j = (AppnextAd) resultPageActivity.parseAd(str);
                if (ResultPageActivity.this.userAction != null) {
                    C3213q d = ResultPageActivity.this.userAction;
                    AppnextAd b = ResultPageActivity.this.f12434j;
                    StringBuilder sb = new StringBuilder();
                    ResultPageActivity resultPageActivity2 = ResultPageActivity.this;
                    sb.append(resultPageActivity2.m10923f(resultPageActivity2.f12434j).getAppURL());
                    sb.append("&tem_id=");
                    sb.append(ResultPageActivity.this.f12431fh);
                    sb.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    d.mo10823a(b, sb.toString(), ResultPageActivity.this.placementID, new C3187f.C3196a() {
                        public final void error(String str) {
                        }

                        public final void onMarket(String str) {
                            if (ResultPageActivity.this.f12427aA) {
                                ResultPageActivity.this.finish();
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                C3117a.m10553a("WebInterface$adClicked", th);
            }
        }

        @JavascriptInterface
        public final void impression(String str) {
            try {
                ResultPageActivity.this.userAction.mo10827d((AppnextAd) ResultPageActivity.this.parseAd(str));
            } catch (Throwable th) {
                C3117a.m10553a("WebInterface$impression", th);
            }
        }

        @JavascriptInterface
        public final void openLink(String str) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.addFlags(268435456);
                ResultPageActivity.this.startActivity(intent);
            } catch (Throwable th) {
                C3117a.m10553a("WebInterface$openLink", th);
            }
        }

        @JavascriptInterface
        public final void postView(String str) {
            try {
                AppnextAd appnextAd = (AppnextAd) ResultPageActivity.this.parseAd(str);
                C3213q d = ResultPageActivity.this.userAction;
                d.mo10822a(appnextAd, ResultPageActivity.this.m10923f(appnextAd).getImpressionURL() + "&tem_id=" + ResultPageActivity.this.f12431fh + IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, (C3187f.C3196a) null);
            } catch (Throwable th) {
                C3117a.m10553a("WebInterface$postView", th);
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ String m10920c(ResultPageActivity resultPageActivity) {
        C3249a aVar = resultPageActivity.f12432fi;
        if (aVar == null || aVar.getFallbackScript() == null) {
            return new C3250b().mo10384B();
        }
        return resultPageActivity.f12432fi.getFallbackScript();
    }

    private WebViewClient getWebViewClient() {
        try {
            C3249a aVar = this.f12432fi;
            if (aVar == null || aVar.getWebViewClient() == null) {
                return new C3244a();
            }
            return this.f12432fi.getWebViewClient();
        } catch (Throwable unused) {
            return new C3244a();
        }
    }

    /* access modifiers changed from: protected */
    public final void loadJS(String str) {
        try {
            WebView webView2 = this.webView;
            if (webView2 != null) {
                webView2.loadUrl("javascript:(function() { try { " + str + " } catch(err){ Appnext.jsError(err.message); }})()");
            }
        } catch (Throwable th) {
            C3117a.m10553a("ResultPageActivity$loadJS", th);
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"AddJavascriptInterface", "SetJavaScriptEnabled"})
    public void onCreate(Bundle bundle) {
        final String str;
        Object obj;
        requestWindowFeature(1);
        super.onCreate(bundle);
        try {
            C3251c aY = C3252d.m10942aX().mo10880aY();
            this.f12433fj = aY;
            this.placementID = aY.getPlacementId();
            this.f12431fh = this.f12433fj.mo10353t();
            this.f12427aA = getIntent().getExtras().getBoolean("shouldClose");
            this.f12430fg = this.f12433fj.getSelectedAd();
            this.f12429cA = this.f12433fj.mo10354u();
            this.f12428ay = this.f12433fj.mo10355v();
            this.userAction = new C3213q(this, new C3213q.C3217a() {
                /* renamed from: c */
                public final C3148Ad mo10141c() {
                    return ResultPageActivity.this.f12433fj.mo10357x();
                }

                /* renamed from: d */
                public final AppnextAd mo10142d() {
                    return ResultPageActivity.this.f12434j;
                }

                /* renamed from: e */
                public final SettingsManager mo10143e() {
                    return ResultPageActivity.this.f12433fj.mo10356w();
                }

                public final void report(String str) {
                }
            });
            this.f12432fi = this.f12433fj.mo10358y();
            try {
                RelativeLayout relativeLayout = new RelativeLayout(this);
                setContentView(relativeLayout);
                relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                WebView webView2 = new WebView(getApplicationContext());
                this.webView = webView2;
                relativeLayout.addView(webView2);
                this.webView.getLayoutParams().height = -1;
                this.webView.getLayoutParams().width = -1;
                this.webView.getSettings().setJavaScriptEnabled(true);
                this.webView.getSettings().setAppCacheEnabled(true);
                this.webView.getSettings().setDomStorageEnabled(true);
                this.webView.getSettings().setDatabaseEnabled(true);
                int i = Build.VERSION.SDK_INT;
                if (i >= 21) {
                    this.webView.getSettings().setMixedContentMode(0);
                }
                if (i >= 17) {
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
                C3249a aVar = this.f12432fi;
                if (aVar != null) {
                    aVar.getJSurl();
                    str = this.f12432fi.getJSurl();
                } else {
                    str = "https://cdn.appnext.com/tools/sdk/banner/2.4.3/result.min.js";
                }
                AppnextWebView.m10952t(this).mo10885a(str, new AppnextWebView.C3257c() {
                    /* renamed from: d */
                    public final void mo10321d(String str) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public final void run() {
                                try {
                                    C32413 r0 = C32413.this;
                                    ResultPageActivity resultPageActivity = ResultPageActivity.this;
                                    resultPageActivity.mo10866p(str, AppnextWebView.m10952t(resultPageActivity).mo10882I(str));
                                } catch (Throwable th) {
                                    C3117a.m10553a("ResultPageActivity$loaded", th);
                                }
                            }
                        });
                    }

                    public final void error(String str) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public final void run() {
                                C32413 r0 = C32413.this;
                                ResultPageActivity resultPageActivity = ResultPageActivity.this;
                                resultPageActivity.mo10866p(str, ResultPageActivity.m10920c(resultPageActivity));
                            }
                        });
                    }
                });
                WebView webView3 = this.webView;
                C3249a aVar2 = this.f12432fi;
                if (aVar2 == null || aVar2.mo10362z() == null) {
                    obj = new C3247b();
                } else {
                    obj = this.f12432fi.mo10362z();
                }
                webView3.addJavascriptInterface(obj, "Appnext");
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            C3117a.m10553a("ResultPageActivity$onCreate", th);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        try {
            WebView webView2 = this.webView;
            if (webView2 != null) {
                webView2.destroy();
                this.webView = null;
            }
        } catch (Throwable th) {
            C3117a.m10553a("ResultPageActivity$onDestroy", th);
        }
        try {
            this.userAction.destroy();
        } catch (Throwable th2) {
            C3117a.m10553a("ResultPageActivity$onDestroy", th2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo10866p(String str, String str2) {
        try {
            URL url = new URL(str);
            this.webView.loadDataWithBaseURL(url.getProtocol() + "://" + url.getHost(), "<html><body><script>" + str2 + "</script></body></html>", (String) null, C6540C.UTF8_NAME, (String) null);
        } catch (Throwable th) {
            C3117a.m10553a("ResultPageActivity$loadWebview", th);
        }
    }

    public C3201h parseAd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            AppnextAd appnextAd = (AppnextAd) C3207k.m10814a((Class<?>) AppnextAd.class, jSONObject);
            if (appnextAd != null) {
                m10923f(appnextAd).setAdJSON(jSONObject.toString());
                if (TextUtils.isEmpty(appnextAd.getStoreRating())) {
                    m10923f(appnextAd).setStoreRating(SessionDescription.SUPPORTED_SDP_VERSION);
                }
            }
            return appnextAd;
        } catch (Throwable th) {
            C3117a.m10553a("ResultPageActivity$parseAd", th);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public CustomAd m10923f(AppnextAd appnextAd) {
        return new CustomAd(appnextAd);
    }
}
