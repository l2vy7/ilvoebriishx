package com.appnext.core.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appnext.base.C3117a;
import com.appnext.core.C3198g;
import com.appnext.core.C3211o;
import com.appnext.core.adswatched.C3169a;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.net.HttpRetryException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class AppnextWebView {
    /* access modifiers changed from: private */

    /* renamed from: fr */
    public static AppnextWebView f12444fr;
    /* access modifiers changed from: private */

    /* renamed from: aM */
    public Context f12445aM;
    /* access modifiers changed from: private */

    /* renamed from: av */
    public WebAppInterface f12446av;
    /* access modifiers changed from: private */

    /* renamed from: fs */
    public final HashMap<String, C3256b> f12447fs = new HashMap<>();

    /* renamed from: ft */
    private HashMap<String, WebView> f12448ft;

    private class WebInterface extends WebAppInterface {
        private String auid = "";

        /* renamed from: bk */
        private String f12454bk = "";

        public WebInterface(Context context, String str, String str2) {
            super(context);
            this.f12454bk = str;
            this.auid = str2;
        }

        @JavascriptInterface
        public void destroy(String str) {
            super.destroy(str);
            if (AppnextWebView.f12444fr.f12446av != null) {
                AppnextWebView.f12444fr.f12446av.destroy(str);
            }
        }

        @JavascriptInterface
        public String filterAds(String str) {
            super.filterAds(str);
            return AppnextWebView.f12444fr.f12446av != null ? AppnextWebView.f12444fr.f12446av.filterAds(str) : str;
        }

        @JavascriptInterface
        public void gotoAppWall() {
            super.gotoAppWall();
            if (AppnextWebView.f12444fr.f12446av != null) {
                AppnextWebView.f12444fr.f12446av.gotoAppWall();
            }
        }

        @JavascriptInterface
        public void jsError(String str) {
            super.jsError(str);
            if (AppnextWebView.f12444fr.f12446av != null) {
                AppnextWebView.f12444fr.f12446av.jsError(str);
            }
        }

        @JavascriptInterface
        public String loadAds() {
            super.loadAds();
            return AppnextWebView.f12444fr.f12446av != null ? AppnextWebView.f12444fr.f12446av.loadAds() : "";
        }

        @JavascriptInterface
        public void logSTP(String str, String str2) {
            super.logSTP(str, str2);
            if (AppnextWebView.f12444fr.f12446av != null) {
                AppnextWebView.f12444fr.f12446av.logSTP(str, str2);
            }
        }

        @JavascriptInterface
        public void notifyImpression(String str) {
            super.notifyImpression(str);
            C3211o.m10825az().mo10821a(new Runnable(str, this.f12454bk, this.auid) {
                public final void run() {
                    try {
                        String g = C3198g.m10796g(r5, "b");
                        if (!TextUtils.isEmpty(r3) && !TextUtils.isEmpty(g) && !TextUtils.isEmpty(r4)) {
                            C3169a.m10687o(AppnextWebView.this.f12446av.context).mo10753k(g, r4);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
            if (AppnextWebView.f12444fr.f12446av != null) {
                AppnextWebView.f12444fr.f12446av.notifyImpression(str);
            }
        }

        @JavascriptInterface
        public void openLink(String str) {
            super.openLink(str);
            if (AppnextWebView.f12444fr.f12446av != null) {
                AppnextWebView.f12444fr.f12446av.openLink(str);
            }
        }

        @JavascriptInterface
        public void openResultPage(String str) {
            super.openResultPage(str);
            if (AppnextWebView.f12444fr.f12446av != null) {
                AppnextWebView.f12444fr.f12446av.openResultPage(str);
            }
        }

        @JavascriptInterface
        public void openStore(String str) {
            super.openStore(str);
            if (AppnextWebView.f12444fr.f12446av != null) {
                AppnextWebView.f12444fr.f12446av.openStore(str);
            }
        }

        @JavascriptInterface
        public void play() {
            super.play();
            if (AppnextWebView.f12444fr.f12446av != null) {
                AppnextWebView.f12444fr.f12446av.play();
            }
        }

        @JavascriptInterface
        public void postView(String str) {
            super.postView(str);
            C3211o.m10825az().mo10821a(new Runnable(str, this.f12454bk, this.auid) {
                public final void run() {
                    try {
                        String g = C3198g.m10796g(r5, "b");
                        if (!TextUtils.isEmpty(r3) && !TextUtils.isEmpty(g) && !TextUtils.isEmpty(r4)) {
                            C3169a.m10687o(AppnextWebView.this.f12446av.context).mo10753k(g, r4);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
            if (AppnextWebView.f12444fr.f12446av != null) {
                AppnextWebView.f12444fr.f12446av.postView(str);
            }
        }

        @JavascriptInterface
        public void videoPlayed() {
            super.videoPlayed();
            if (AppnextWebView.f12444fr.f12446av != null) {
                AppnextWebView.f12444fr.f12446av.videoPlayed();
            }
        }
    }

    /* renamed from: com.appnext.core.webview.AppnextWebView$a */
    private class C3255a extends AsyncTask<String, Void, String> {

        /* renamed from: fw */
        C3256b f12457fw;

        public C3255a(C3256b bVar) {
            this.f12457fw = bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final String doInBackground(String... strArr) {
            try {
                C3256b bVar = (C3256b) AppnextWebView.this.f12447fs.get(strArr[0]);
                bVar.f12460fx = C3198g.m10777a(AppnextWebView.this.f12445aM, strArr[0], (HashMap<String, String>) null, 10000);
                AppnextWebView.this.f12447fs.put(strArr[0], bVar);
                return strArr[0];
            } catch (HttpRetryException e) {
                C3117a.m10553a("AppnextWebView$doInBackground", e);
                return "error: " + e.getReason();
            } catch (IOException e2) {
                C3117a.m10553a("AppnextWebView$doInBackground", e2);
                return "error: network problem";
            } catch (Throwable th) {
                C3117a.m10553a("AppnextWebView$doInBackground", th);
                return "error: unknown error";
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            String str = (String) obj;
            super.onPostExecute(str);
            try {
                if (str.startsWith("error:")) {
                    this.f12457fw.f12461m = 0;
                    HashMap a = AppnextWebView.this.f12447fs;
                    C3256b bVar = this.f12457fw;
                    a.put(bVar.f12462v, bVar);
                    AppnextWebView.m10946a(AppnextWebView.this, this.f12457fw, str.substring(7));
                    return;
                }
                this.f12457fw.f12461m = 2;
                HashMap a2 = AppnextWebView.this.f12447fs;
                C3256b bVar2 = this.f12457fw;
                a2.put(bVar2.f12462v, bVar2);
                AppnextWebView.m10950b(AppnextWebView.this, this.f12457fw, str);
            } catch (Throwable th) {
                C3117a.m10553a("AppnextWebView$download", th);
            }
        }
    }

    /* renamed from: com.appnext.core.webview.AppnextWebView$b */
    private class C3256b {

        /* renamed from: ec */
        public ArrayList<C3257c> f12458ec;

        /* renamed from: fx */
        public String f12460fx;

        /* renamed from: m */
        public int f12461m;

        /* renamed from: v */
        public String f12462v;

        private C3256b() {
            this.f12461m = 0;
            this.f12460fx = "";
            this.f12458ec = new ArrayList<>();
        }
    }

    /* renamed from: com.appnext.core.webview.AppnextWebView$c */
    public interface C3257c {
        /* renamed from: d */
        void mo10321d(String str);

        void error(String str);
    }

    private AppnextWebView(Context context) {
        this.f12445aM = context;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: t */
    public static AppnextWebView m10952t(Context context) {
        if (f12444fr == null) {
            AppnextWebView appnextWebView = new AppnextWebView(context);
            f12444fr = appnextWebView;
            appnextWebView.f12448ft = new HashMap<>();
        }
        return f12444fr;
    }

    /* renamed from: H */
    public final WebView mo10881H(String str) {
        WebView webView = this.f12448ft.get(str);
        if (!(webView == null || webView.getParent() == null)) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
        return webView;
    }

    /* renamed from: I */
    public final String mo10882I(String str) {
        C3256b bVar = this.f12447fs.get(str);
        if (bVar == null || bVar.f12461m != 2) {
            return null;
        }
        return bVar.f12460fx;
    }

    /* renamed from: b */
    static /* synthetic */ void m10950b(AppnextWebView appnextWebView, C3256b bVar, String str) {
        synchronized (appnextWebView.f12447fs) {
            Iterator<C3257c> it = bVar.f12458ec.iterator();
            while (it.hasNext()) {
                it.next().mo10321d(str);
            }
            bVar.f12458ec.clear();
        }
    }

    /* renamed from: a */
    public final void mo10884a(WebAppInterface webAppInterface) {
        if (this.f12446av == webAppInterface) {
            this.f12446av = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10885a(java.lang.String r8, com.appnext.core.webview.AppnextWebView.C3257c r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.HashMap<java.lang.String, com.appnext.core.webview.AppnextWebView$b> r0 = r7.f12447fs     // Catch:{ all -> 0x0049 }
            boolean r0 = r0.containsKey(r8)     // Catch:{ all -> 0x0049 }
            r1 = 0
            if (r0 == 0) goto L_0x0013
            java.util.HashMap<java.lang.String, com.appnext.core.webview.AppnextWebView$b> r0 = r7.f12447fs     // Catch:{ all -> 0x0049 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0049 }
            com.appnext.core.webview.AppnextWebView$b r0 = (com.appnext.core.webview.AppnextWebView.C3256b) r0     // Catch:{ all -> 0x0049 }
            goto L_0x001a
        L_0x0013:
            com.appnext.core.webview.AppnextWebView$b r0 = new com.appnext.core.webview.AppnextWebView$b     // Catch:{ all -> 0x0049 }
            r0.<init>()     // Catch:{ all -> 0x0049 }
            r0.f12462v = r8     // Catch:{ all -> 0x0049 }
        L_0x001a:
            int r2 = r0.f12461m     // Catch:{ all -> 0x0049 }
            r3 = 2
            if (r2 != r3) goto L_0x0025
            if (r9 == 0) goto L_0x0047
            r9.mo10321d(r8)     // Catch:{ all -> 0x0049 }
            goto L_0x004f
        L_0x0025:
            if (r2 != 0) goto L_0x003b
            r2 = 1
            r0.f12461m = r2     // Catch:{ all -> 0x0049 }
            com.appnext.core.webview.AppnextWebView$a r4 = new com.appnext.core.webview.AppnextWebView$a     // Catch:{ all -> 0x0049 }
            r4.<init>(r0)     // Catch:{ all -> 0x0049 }
            java.util.concurrent.Executor r5 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch:{ all -> 0x0049 }
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x0049 }
            r6 = 0
            r3[r6] = r8     // Catch:{ all -> 0x0049 }
            r3[r2] = r1     // Catch:{ all -> 0x0049 }
            r4.executeOnExecutor(r5, r3)     // Catch:{ all -> 0x0049 }
        L_0x003b:
            if (r9 == 0) goto L_0x0042
            java.util.ArrayList<com.appnext.core.webview.AppnextWebView$c> r1 = r0.f12458ec     // Catch:{ all -> 0x0049 }
            r1.add(r9)     // Catch:{ all -> 0x0049 }
        L_0x0042:
            java.util.HashMap<java.lang.String, com.appnext.core.webview.AppnextWebView$b> r9 = r7.f12447fs     // Catch:{ all -> 0x0049 }
            r9.put(r8, r0)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r7)
            return
        L_0x0049:
            r8 = move-exception
            java.lang.String r9 = "AppnextWebView$download"
            com.appnext.base.C3117a.m10553a(r9, r8)     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r7)
            return
        L_0x0051:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.webview.AppnextWebView.mo10885a(java.lang.String, com.appnext.core.webview.AppnextWebView$c):void");
    }

    @SuppressLint({"AddJavascriptInterface"})
    /* renamed from: a */
    public final WebView mo10883a(Context context, String str, String str2, String str3, WebAppInterface webAppInterface, C3258a aVar, String str4) {
        String str5;
        try {
            f12444fr.f12446av = webAppInterface;
            WebView webView = this.f12448ft.get(str4);
            if (!(webView == null || webView.getParent() == null)) {
                ((ViewGroup) webView.getParent()).removeView(webView);
            }
            URL url = new URL(str3);
            String str6 = url.getProtocol() + "://" + url.getHost();
            WebView webView2 = new WebView(context.getApplicationContext());
            webView2.getSettings().setJavaScriptEnabled(true);
            webView2.getSettings().setAppCacheEnabled(true);
            webView2.getSettings().setDomStorageEnabled(true);
            webView2.getSettings().setDatabaseEnabled(true);
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                webView2.getSettings().setMixedContentMode(0);
            }
            if (i >= 17) {
                webView2.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            webView2.setWebChromeClient(new WebChromeClient());
            webView2.setWebViewClient(new WebViewClient() {
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
            if (this.f12447fs.containsKey(str3)) {
                if (this.f12447fs.get(str3).f12461m == 2 && !this.f12447fs.get(str3).f12460fx.equals("")) {
                    str5 = "<script>" + this.f12447fs.get(str3).f12460fx + "</script>";
                    webView2.loadDataWithBaseURL(str6, "<html><body>" + str5 + "</body></html>", (String) null, C6540C.UTF8_NAME, (String) null);
                    this.f12448ft.put(str4, webView2);
                    webView2.addJavascriptInterface(new WebInterface(context, str, str2), "Appnext");
                    return webView2;
                }
            }
            if (aVar != null) {
                str5 = "<script>" + aVar.mo10384B() + "</script>";
            } else {
                str5 = "<script src='" + str3 + "'></script>";
            }
            webView2.loadDataWithBaseURL(str6, "<html><body>" + str5 + "</body></html>", (String) null, C6540C.UTF8_NAME, (String) null);
            this.f12448ft.put(str4, webView2);
            webView2.addJavascriptInterface(new WebInterface(context, str, str2), "Appnext");
            return webView2;
        } catch (Throwable th) {
            C3117a.m10553a("AppnextWebView$loadWebview", th);
            return null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m10946a(AppnextWebView appnextWebView, C3256b bVar, String str) {
        synchronized (appnextWebView.f12447fs) {
            Iterator<C3257c> it = bVar.f12458ec.iterator();
            while (it.hasNext()) {
                it.next().error(str);
            }
            bVar.f12458ec.clear();
            appnextWebView.f12447fs.remove(bVar.f12462v);
        }
    }
}
