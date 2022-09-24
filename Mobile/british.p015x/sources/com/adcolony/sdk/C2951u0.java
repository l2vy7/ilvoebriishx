package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.adcolony.sdk.C2978z;
import com.google.ads.interactivemedia.p039v3.impl.data.C3791bd;
import com.google.android.exoplayer2.C6540C;
import com.iab.omid.library.adcolony.ScriptInjector;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;

@SuppressLint({"SetJavaScriptEnabled"})
/* renamed from: com.adcolony.sdk.u0 */
class C2951u0 extends WebView implements C2784f0 {

    /* renamed from: O */
    static boolean f11859O = false;

    /* renamed from: A */
    private boolean f11860A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f11861B;

    /* renamed from: C */
    private boolean f11862C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f11863D;

    /* renamed from: E */
    private boolean f11864E;

    /* renamed from: F */
    private boolean f11865F;

    /* renamed from: G */
    private boolean f11866G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public JSONArray f11867H = C2976x.m10301a();
    /* access modifiers changed from: private */

    /* renamed from: I */
    public JSONObject f11868I = C2976x.m10319b();

    /* renamed from: J */
    private JSONObject f11869J = C2976x.m10319b();
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C2701c f11870K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C2714c0 f11871L;

    /* renamed from: M */
    private ImageView f11872M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final Object f11873N = new Object();

    /* renamed from: a */
    private String f11874a;

    /* renamed from: b */
    private String f11875b;

    /* renamed from: c */
    private String f11876c = "";

    /* renamed from: d */
    private String f11877d = "";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f11878e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f11879f = "";

    /* renamed from: g */
    private String f11880g = "";

    /* renamed from: h */
    private String f11881h = "";
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f11882i = "";

    /* renamed from: j */
    private String f11883j = "";
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f11884k = "";
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f11885l;

    /* renamed from: m */
    private int f11886m;

    /* renamed from: n */
    private int f11887n;

    /* renamed from: o */
    private int f11888o;

    /* renamed from: p */
    private int f11889p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f11890q;

    /* renamed from: r */
    private int f11891r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f11892s;

    /* renamed from: t */
    private int f11893t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f11894u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f11895v;

    /* renamed from: w */
    private int f11896w;

    /* renamed from: x */
    private int f11897x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f11898y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f11899z;

    /* renamed from: com.adcolony.sdk.u0$a */
    class C2952a extends C2966k {
        C2952a() {
            super(C2951u0.this, (C2952a) null);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            C2951u0.this.m10199a(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest.getUrl().toString().endsWith("mraid.js")) {
                try {
                    return new WebResourceResponse("text/javascript", C6540C.UTF8_NAME, new ByteArrayInputStream(C2951u0.this.f11879f.getBytes(C6540C.UTF8_NAME)));
                } catch (UnsupportedEncodingException unused) {
                    new C2978z.C2979a().mo10088a("UTF-8 not supported.").mo10090a(C2978z.f11950j);
                }
            }
            return null;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri uri;
            if (!C2951u0.this.f11861B || !webResourceRequest.isForMainFrame()) {
                return false;
            }
            String k = C2951u0.this.mo10040k();
            if (k == null) {
                uri = webResourceRequest.getUrl();
            } else {
                uri = Uri.parse(k);
            }
            C2916s0.m10061a(new Intent("android.intent.action.VIEW", uri));
            JSONObject b = C2976x.m10319b();
            C2976x.m10313a(b, "url", uri.toString());
            C2976x.m10313a(b, "ad_session_id", C2951u0.this.f11878e);
            new C2714c0("WebView.redirect_detected", C2951u0.this.f11870K.mo9591k(), b).mo9612d();
            C2871q0 z = C2684a.m9409c().mo9739z();
            z.mo9926a(C2951u0.this.f11878e);
            z.mo9928c(C2951u0.this.f11878e);
            return true;
        }
    }

    /* renamed from: com.adcolony.sdk.u0$b */
    class C2953b extends C2966k {
        C2953b() {
            super(C2951u0.this, (C2952a) null);
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest.getUrl().toString().endsWith("mraid.js")) {
                try {
                    return new WebResourceResponse("text/javascript", C6540C.UTF8_NAME, new ByteArrayInputStream(C2951u0.this.f11879f.getBytes(C6540C.UTF8_NAME)));
                } catch (UnsupportedEncodingException unused) {
                    new C2978z.C2979a().mo10088a("UTF-8 not supported.").mo10090a(C2978z.f11950j);
                }
            }
            return null;
        }
    }

    /* renamed from: com.adcolony.sdk.u0$c */
    class C2954c implements C2750e0 {

        /* renamed from: com.adcolony.sdk.u0$c$a */
        class C2955a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f11903a;

            C2955a(C2714c0 c0Var) {
                this.f11903a = c0Var;
            }

            public void run() {
                C2951u0.this.mo10032b(this.f11903a);
            }
        }

        C2954c() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2951u0.this.mo10035c(c0Var)) {
                C2916s0.m10063a((Runnable) new C2955a(c0Var));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u0$d */
    class C2956d implements C2750e0 {

        /* renamed from: com.adcolony.sdk.u0$d$a */
        class C2957a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f11906a;

            C2957a(C2714c0 c0Var) {
                this.f11906a = c0Var;
            }

            public void run() {
                C2951u0.this.mo10027a(this.f11906a);
            }
        }

        C2956d() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2951u0.this.mo10035c(c0Var)) {
                C2916s0.m10063a((Runnable) new C2957a(c0Var));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u0$e */
    class C2958e implements C2750e0 {

        /* renamed from: com.adcolony.sdk.u0$e$a */
        class C2959a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f11909a;

            C2959a(C2714c0 c0Var) {
                this.f11909a = c0Var;
            }

            public void run() {
                C2951u0.this.mo10033b(C2976x.m10337i(this.f11909a.mo9608b(), "custom_js"));
            }
        }

        C2958e() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2951u0.this.mo10035c(c0Var)) {
                C2916s0.m10063a((Runnable) new C2959a(c0Var));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u0$f */
    class C2960f implements C2750e0 {

        /* renamed from: com.adcolony.sdk.u0$f$a */
        class C2961a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f11912a;

            C2961a(C2714c0 c0Var) {
                this.f11912a = c0Var;
            }

            public void run() {
                C2951u0.this.m10209b(C2976x.m10329c(this.f11912a.mo9608b(), "transparent"));
            }
        }

        C2960f() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2951u0.this.mo10035c(c0Var)) {
                C2916s0.m10063a((Runnable) new C2961a(c0Var));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u0$g */
    class C2962g implements View.OnClickListener {
        C2962g() {
        }

        public void onClick(View view) {
            C2916s0.m10061a(new Intent("android.intent.action.VIEW", Uri.parse(C2951u0.this.f11882i)));
            C2684a.m9409c().mo9739z().mo9928c(C2951u0.this.f11878e);
        }
    }

    /* renamed from: com.adcolony.sdk.u0$h */
    class C2963h implements Runnable {
        C2963h() {
        }

        public void run() {
            String str = "";
            synchronized (C2951u0.this.f11873N) {
                if (C2951u0.this.f11867H.length() > 0) {
                    if (C2951u0.this.f11898y) {
                        str = C2951u0.this.f11867H.toString();
                    }
                    JSONArray unused = C2951u0.this.f11867H = C2976x.m10301a();
                }
            }
            if (C2951u0.this.f11898y) {
                C2951u0 u0Var = C2951u0.this;
                u0Var.mo10033b("NativeLayer.dispatch_messages(ADC3_update(" + str + "), '" + C2951u0.this.f11884k + "');");
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u0$i */
    private class C2964i {
        private C2964i() {
        }

        @JavascriptInterface
        public void dispatch_messages(String str, String str2) {
            if (str2.equals(C2951u0.this.f11884k)) {
                C2951u0.this.m10202a(str);
            }
        }

        @JavascriptInterface
        public void enable_reverse_messaging(String str) {
            if (str.equals(C2951u0.this.f11884k)) {
                boolean unused = C2951u0.this.f11863D = true;
            }
        }

        @JavascriptInterface
        public String pull_messages(String str) {
            if (!str.equals(C2951u0.this.f11884k)) {
                return "[]";
            }
            String str2 = "[]";
            synchronized (C2951u0.this.f11873N) {
                if (C2951u0.this.f11867H.length() > 0) {
                    if (C2951u0.this.f11898y) {
                        str2 = C2951u0.this.f11867H.toString();
                    }
                    JSONArray unused = C2951u0.this.f11867H = C2976x.m10301a();
                }
            }
            return str2;
        }

        @JavascriptInterface
        public void push_messages(String str, String str2) {
            if (str2.equals(C2951u0.this.f11884k)) {
                C2951u0.this.m10202a(str);
            }
        }

        /* synthetic */ C2964i(C2951u0 u0Var, C2952a aVar) {
            this();
        }
    }

    /* renamed from: com.adcolony.sdk.u0$j */
    private class C2965j extends WebChromeClient {
        private C2965j() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            AdColonyInterstitial adColonyInterstitial;
            String str;
            ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
            C2715d b = C2684a.m9409c().mo9708b();
            String message = consoleMessage.message();
            boolean z = false;
            boolean z2 = message.contains("Viewport target-densitydpi is not supported.") || message.contains("Viewport argument key \"shrink-to-fit\" not recognized and ignored");
            boolean z3 = messageLevel == ConsoleMessage.MessageLevel.ERROR;
            if (messageLevel == ConsoleMessage.MessageLevel.WARNING) {
                z = true;
            }
            if (message.contains("ADC3_update is not defined") || message.contains("NativeLayer.dispatch_messages is not a function")) {
                C2951u0 u0Var = C2951u0.this;
                u0Var.m10203a(u0Var.f11871L.mo9608b(), "Unable to communicate with AdColony. Please ensure that you have added an exception for our Javascript interface in your ProGuard configuration and that you do not have a faulty proxy enabled on your device.");
            }
            if (!z2 && (z || z3)) {
                if (C2951u0.this.f11878e == null) {
                    adColonyInterstitial = null;
                } else {
                    adColonyInterstitial = b.mo9613a().get(C2951u0.this.f11878e);
                }
                if (adColonyInterstitial == null) {
                    str = C3791bd.UNKNOWN_CONTENT_TYPE;
                } else {
                    str = adColonyInterstitial.mo9457a();
                }
                C2978z.C2979a aVar = new C2978z.C2979a();
                aVar.mo10088a("onConsoleMessage: " + message + " with ad id: " + str).mo10090a(z3 ? C2978z.f11950j : C2978z.f11948h);
            }
            return true;
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        /* synthetic */ C2965j(C2951u0 u0Var, C2952a aVar) {
            this();
        }
    }

    /* renamed from: com.adcolony.sdk.u0$k */
    private class C2966k extends WebViewClient {
        private C2966k() {
        }

        public void onPageFinished(WebView webView, String str) {
            int i;
            JSONObject b = C2976x.m10319b();
            C2976x.m10323b(b, TtmlNode.ATTR_ID, C2951u0.this.f11885l);
            C2976x.m10313a(b, "url", str);
            if (C2951u0.this.f11870K == null) {
                new C2714c0("WebView.on_load", C2951u0.this.f11894u, b).mo9612d();
            } else {
                C2976x.m10313a(b, "ad_session_id", C2951u0.this.f11878e);
                C2976x.m10323b(b, "container_id", C2951u0.this.f11870K.mo9573c());
                new C2714c0("WebView.on_load", C2951u0.this.f11870K.mo9591k(), b).mo9612d();
            }
            if ((C2951u0.this.f11898y || C2951u0.this.f11899z) && !C2951u0.this.f11861B) {
                if (C2951u0.this.f11895v > 0) {
                    i = C2951u0.this.f11895v;
                } else {
                    i = C2951u0.this.f11894u;
                }
                if (C2951u0.this.f11895v > 0) {
                    float n = C2684a.m9409c().mo9723j().mo9861n();
                    C2976x.m10323b(C2951u0.this.f11868I, "app_orientation", C2916s0.m10079d(C2916s0.m10082e()));
                    C2976x.m10323b(C2951u0.this.f11868I, "x", C2916s0.m10051a((View) C2951u0.this));
                    C2976x.m10323b(C2951u0.this.f11868I, "y", C2916s0.m10067b((View) C2951u0.this));
                    C2976x.m10323b(C2951u0.this.f11868I, "width", (int) (((float) C2951u0.this.f11890q) / n));
                    C2976x.m10323b(C2951u0.this.f11868I, "height", (int) (((float) C2951u0.this.f11892s) / n));
                    C2976x.m10313a(C2951u0.this.f11868I, "ad_session_id", C2951u0.this.f11878e);
                }
                String unused = C2951u0.this.f11884k = C2916s0.m10055a();
                JSONObject a = C2976x.m10307a(C2976x.m10319b(), C2951u0.this.f11868I);
                C2976x.m10313a(a, "message_key", C2951u0.this.f11884k);
                C2951u0 u0Var = C2951u0.this;
                u0Var.mo10033b("ADC3_init(" + i + "," + a.toString() + ");");
                boolean unused2 = C2951u0.this.f11861B = true;
            }
            if (!C2951u0.this.f11899z) {
                return;
            }
            if (C2951u0.this.f11894u != 1 || C2951u0.this.f11895v > 0) {
                JSONObject b2 = C2976x.m10319b();
                C2976x.m10325b(b2, "success", true);
                C2976x.m10323b(b2, TtmlNode.ATTR_ID, C2951u0.this.f11894u);
                C2951u0.this.f11871L.mo9607a(b2).mo9612d();
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            boolean unused = C2951u0.this.f11861B = false;
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (Build.VERSION.SDK_INT < 23) {
                C2951u0.this.m10199a(i, str, str2);
            }
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (!renderProcessGoneDetail.didCrash()) {
                return true;
            }
            C2951u0.this.m10203a(C2976x.m10319b(), "An error occurred while rendering the ad. Ad closing.");
            return true;
        }

        @TargetApi(11)
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (Build.VERSION.SDK_INT < 21 && str.endsWith("mraid.js")) {
                try {
                    return new WebResourceResponse("text/javascript", C6540C.UTF8_NAME, new ByteArrayInputStream(C2951u0.this.f11879f.getBytes(C6540C.UTF8_NAME)));
                } catch (UnsupportedEncodingException unused) {
                    new C2978z.C2979a().mo10088a("UTF-8 not supported.").mo10090a(C2978z.f11950j);
                }
            }
            return null;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!C2951u0.this.f11861B) {
                return false;
            }
            String k = C2951u0.this.mo10040k();
            if (k != null) {
                str = k;
            }
            C2916s0.m10061a(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            C2871q0 z = C2684a.m9409c().mo9739z();
            z.mo9926a(C2951u0.this.f11878e);
            z.mo9928c(C2951u0.this.f11878e);
            JSONObject b = C2976x.m10319b();
            C2976x.m10313a(b, "url", str);
            C2976x.m10313a(b, "ad_session_id", C2951u0.this.f11878e);
            new C2714c0("WebView.redirect_detected", C2951u0.this.f11870K.mo9591k(), b).mo9612d();
            return true;
        }

        /* synthetic */ C2966k(C2951u0 u0Var, C2952a aVar) {
            this();
        }
    }

    private C2951u0(Context context) {
        super(context);
    }

    /* renamed from: A */
    private boolean m10194A() {
        return m10229t() != null;
    }

    /* renamed from: t */
    private AdColonyInterstitial m10229t() {
        if (this.f11878e == null) {
            return null;
        }
        return C2684a.m9409c().mo9708b().mo9613a().get(this.f11878e);
    }

    /* renamed from: w */
    private boolean m10230w() {
        return m10220j() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo10024B() {
        String str;
        if (this.f11860A) {
            try {
                if (this.f11883j.equals("")) {
                    FileInputStream fileInputStream = new FileInputStream(this.f11875b);
                    StringBuilder sb = new StringBuilder(fileInputStream.available());
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr, 0, 1024);
                        if (read < 0) {
                            break;
                        }
                        sb.append(new String(bArr, 0, read));
                    }
                    if (this.f11875b.contains(".html")) {
                        str = sb.toString();
                    } else {
                        str = "<html><script>" + sb.toString() + "</script></html>";
                    }
                } else {
                    str = this.f11883j.replaceFirst("script\\s*src\\s*=\\s*\"mraid.js\"", "script src=\"file://" + this.f11880g + "\"");
                }
                String i = C2976x.m10337i(C2976x.m10335g(this.f11871L.mo9608b(), "info"), TtmlNode.TAG_METADATA);
                loadDataWithBaseURL(this.f11874a.equals("") ? this.f11877d : this.f11874a, m10197a(str, C2976x.m10337i(C2976x.m10320b(i), "iab_filepath")).replaceFirst("var\\s*ADC_DEVICE_INFO\\s*=\\s*null\\s*;", Matcher.quoteReplacement("var ADC_DEVICE_INFO = " + i + ";")), "text/html", (String) null, (String) null);
            } catch (IOException e) {
                m10205a((Exception) e);
            } catch (IllegalArgumentException e2) {
                m10205a((Exception) e2);
            } catch (IndexOutOfBoundsException e3) {
                m10205a((Exception) e3);
            }
        } else if (!this.f11874a.startsWith("http") && !this.f11874a.startsWith("file")) {
            loadDataWithBaseURL(this.f11877d, this.f11874a, "text/html", (String) null, (String) null);
        } else if (this.f11874a.contains(".html") || !this.f11874a.startsWith("file")) {
            loadUrl(this.f11874a);
        } else {
            loadDataWithBaseURL(this.f11874a, "<html><script src=\"" + this.f11874a + "\"></script></html>", "text/html", (String) null, (String) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo10025C() {
        if (this.f11872M != null) {
            int s = C2684a.m9409c().mo9723j().mo9866s();
            int r = C2684a.m9409c().mo9723j().mo9865r();
            boolean z = this.f11866G;
            if (z) {
                s = this.f11886m + this.f11890q;
            }
            if (z) {
                r = this.f11888o + this.f11892s;
            }
            float n = C2684a.m9409c().mo9723j().mo9861n();
            int i = (int) (((float) this.f11896w) * n);
            int i2 = (int) (((float) this.f11897x) * n);
            this.f11872M.setLayoutParams(new AbsoluteLayout.LayoutParams(i, i2, s - i, r - i2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo10026D() {
        C2916s0.m10063a((Runnable) new C2963h());
    }

    /* renamed from: b */
    public void mo9661b() {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AdColonyAdView j;
        if (motionEvent.getAction() == 1 && (j = m10220j()) != null && !j.getUserInteraction()) {
            JSONObject b = C2976x.m10319b();
            C2976x.m10313a(b, "ad_session_id", this.f11878e);
            new C2714c0("WebView.on_first_click", 1, b).mo9612d();
            j.setUserInteraction(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo10048r() {
        return this.f11887n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo10049s() {
        return this.f11889p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo10050u() {
        mo10031a(false, (C2714c0) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo10051v() {
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f11890q, this.f11892s);
        layoutParams.setMargins(this.f11886m, this.f11888o, 0, 0);
        layoutParams.gravity = 0;
        this.f11870K.addView(this, layoutParams);
        if (!this.f11881h.equals("") && !this.f11882i.equals("")) {
            m10217g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo10052x() {
        return this.f11862C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo10053y() {
        return this.f11860A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo10054z() {
        return this.f11864E;
    }

    /* renamed from: g */
    private void m10217g() {
        Context b = C2684a.m9407b();
        if (b != null && this.f11870K != null && !this.f11865F) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            ImageView imageView = new ImageView(b);
            this.f11872M = imageView;
            imageView.setImageURI(Uri.fromFile(new File(this.f11881h)));
            this.f11872M.setBackground(gradientDrawable);
            this.f11872M.setOnClickListener(new C2962g());
            mo10025C();
            addView(this.f11872M);
        }
    }

    /* renamed from: j */
    private AdColonyAdView m10220j() {
        if (this.f11878e == null) {
            return null;
        }
        return C2684a.m9409c().mo9708b().mo9621b().get(this.f11878e);
    }

    /* renamed from: d */
    public int mo9663d() {
        return this.f11894u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo10036e() {
        ImageView imageView = this.f11872M;
        if (imageView != null) {
            this.f11870K.mo9566a((View) imageView, FriendlyObstructionPurpose.OTHER);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo10037f() {
        this.f11870K.mo9587i().add(C2684a.m9401a("WebView.set_visible", (C2750e0) new C2954c(), true));
        this.f11870K.mo9587i().add(C2684a.m9401a("WebView.set_bounds", (C2750e0) new C2956d(), true));
        this.f11870K.mo9587i().add(C2684a.m9401a("WebView.execute_js", (C2750e0) new C2958e(), true));
        this.f11870K.mo9587i().add(C2684a.m9401a("WebView.set_transparent", (C2750e0) new C2960f(), true));
        this.f11870K.mo9589j().add("WebView.set_visible");
        this.f11870K.mo9589j().add("WebView.set_bounds");
        this.f11870K.mo9589j().add("WebView.execute_js");
        this.f11870K.mo9589j().add("WebView.set_transparent");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo10038h() {
        C2684a.m9409c().mo9708b().mo9616a(this, this.f11878e, this.f11870K);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C2966k mo10039i() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return new C2952a();
        }
        if (i >= 21) {
            return new C2953b();
        }
        return new C2966k(this, (C2952a) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public String mo10040k() {
        return mo10034c((String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo10041l() {
        return this.f11892s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo10042m() {
        return this.f11890q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo10043n() {
        return this.f11886m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo10044o() {
        return this.f11888o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo10046p() {
        return this.f11893t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo10047q() {
        return this.f11891r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo10035c(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        return C2976x.m10332e(b, TtmlNode.ATTR_ID) == this.f11885l && C2976x.m10332e(b, "container_id") == this.f11870K.mo9573c() && C2976x.m10337i(b, "ad_session_id").equals(this.f11870K.mo9563a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10033b(String str) {
        if (this.f11862C) {
            new C2978z.C2979a().mo10088a("Ignoring call to execute_js as WebView has been destroyed.").mo10090a(C2978z.f11944d);
        } else if (Build.VERSION.SDK_INT >= 19) {
            try {
                evaluateJavascript(str, (ValueCallback) null);
            } catch (IllegalStateException unused) {
                new C2978z.C2979a().mo10088a("Device reporting incorrect OS version, evaluateJavascript ").mo10088a("is not available. Disabling AdColony.").mo10090a(C2978z.f11949i);
                AdColony.disable();
            }
        } else {
            loadUrl("javascript:" + str);
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"AddJavascriptInterface"})
    /* renamed from: a */
    public void mo10031a(boolean z, C2714c0 c0Var) {
        String str;
        this.f11899z = z;
        C2714c0 c0Var2 = this.f11871L;
        if (c0Var2 != null) {
            c0Var = c0Var2;
        }
        this.f11871L = c0Var;
        JSONObject b = c0Var.mo9608b();
        this.f11860A = C2976x.m10329c(b, "is_display_module");
        setFocusable(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            WebView.setWebContentsDebuggingEnabled(false);
        }
        if (z) {
            this.f11898y = true;
            String i2 = C2976x.m10337i(b, "filepath");
            this.f11883j = C2976x.m10337i(b, "interstitial_html");
            this.f11880g = C2976x.m10337i(b, "mraid_filepath");
            this.f11877d = C2976x.m10337i(b, "base_url");
            this.f11869J = C2976x.m10335g(b, "iab");
            this.f11868I = C2976x.m10335g(b, "info");
            this.f11878e = C2976x.m10337i(b, "ad_session_id");
            this.f11875b = i2;
            if (f11859O && this.f11894u == 1) {
                this.f11875b = "android_asset/ADCController.js";
            }
            if (this.f11883j.equals("")) {
                str = "file:///" + this.f11875b;
            } else {
                str = "";
            }
            this.f11874a = str;
        }
        setWebChromeClient(new C2965j(this, (C2952a) null));
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setGeolocationEnabled(true);
        settings.setUseWideViewPort(true);
        if (i >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        if (i >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
            settings.setAllowFileAccess(true);
        }
        addJavascriptInterface(new C2964i(this, (C2952a) null), "NativeLayer");
        setWebViewClient(mo10039i());
        mo10024B();
        if (!z) {
            mo10037f();
            mo10051v();
        }
        if (z || this.f11898y) {
            C2684a.m9409c().mo9729p().mo9644a((C2784f0) this);
        }
        if (!this.f11876c.equals("")) {
            mo10033b(this.f11876c);
        }
    }

    /* renamed from: c */
    public int mo9662c() {
        return this.f11895v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo10034c(String str) {
        String c = (!m10194A() || m10229t() == null) ? str : m10229t().mo9468c();
        return ((c == null || c.equals(str)) && m10230w() && m10220j() != null) ? m10220j().getClickOverride() : c;
    }

    C2951u0(Context context, C2714c0 c0Var, int i, int i2, C2701c cVar) {
        super(context);
        this.f11871L = c0Var;
        mo10028a(c0Var, i, i2, cVar);
        mo10050u();
    }

    /* renamed from: b */
    private void m10208b(Exception exc) {
        new C2978z.C2979a().mo10088a(exc.getClass().toString()).mo10088a(" during metadata injection w/ metadata = ").mo10088a(C2976x.m10337i(this.f11868I, TtmlNode.TAG_METADATA)).mo10090a(C2978z.f11950j);
        JSONObject b = C2976x.m10319b();
        C2976x.m10313a(b, TtmlNode.ATTR_ID, this.f11878e);
        new C2714c0("AdSession.on_error", this.f11870K.mo9591k(), b).mo9612d();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10209b(boolean z) {
        setBackgroundColor(z ? 0 : -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10032b(C2714c0 c0Var) {
        if (C2976x.m10329c(c0Var.mo9608b(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
        if (this.f11899z) {
            JSONObject b = C2976x.m10319b();
            C2976x.m10325b(b, "success", true);
            C2976x.m10323b(b, TtmlNode.ATTR_ID, this.f11894u);
            c0Var.mo9607a(b).mo9612d();
        }
    }

    C2951u0(Context context, int i, boolean z) {
        super(context);
        this.f11894u = i;
        this.f11860A = z;
    }

    /* renamed from: a */
    private String m10197a(String str, String str2) {
        C2829j0 j0Var;
        C2715d b = C2684a.m9409c().mo9708b();
        AdColonyInterstitial t = m10229t();
        AdColonyAdViewListener adColonyAdViewListener = b.mo9623c().get(this.f11878e);
        if (t != null && this.f11869J.length() > 0 && !C2976x.m10337i(this.f11869J, "ad_type").equals("video")) {
            t.mo9462a(this.f11869J);
        } else if (adColonyAdViewListener != null && this.f11869J.length() > 0) {
            adColonyAdViewListener.mo9402a(new C2829j0(this.f11869J, this.f11878e));
        }
        if (t == null) {
            j0Var = null;
        } else {
            j0Var = t.mo9474f();
        }
        if (j0Var == null && adColonyAdViewListener != null) {
            j0Var = adColonyAdViewListener.mo9404b();
        }
        if (j0Var != null && j0Var.mo9780d() == 2) {
            this.f11864E = true;
            if (!str2.equals("")) {
                try {
                    return ScriptInjector.injectScriptContentIntoHtml(C2684a.m9409c().mo9726m().mo10011a(str2, false).toString(), str);
                } catch (IOException e) {
                    m10205a((Exception) e);
                }
            }
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10202a(String str) {
        JSONArray a = C2976x.m10302a(str);
        for (int i = 0; i < a.length(); i++) {
            C2684a.m9409c().mo9729p().mo9648a(C2976x.m10321b(a, i));
        }
    }

    /* renamed from: a */
    private boolean m10205a(Exception exc) {
        AdColonyInterstitialListener listener;
        new C2978z.C2979a().mo10088a(exc.getClass().toString()).mo10088a(" during metadata injection w/ metadata = ").mo10088a(C2976x.m10337i(this.f11868I, TtmlNode.TAG_METADATA)).mo10090a(C2978z.f11950j);
        AdColonyInterstitial remove = C2684a.m9409c().mo9708b().mo9613a().remove(C2976x.m10337i(this.f11868I, "ad_session_id"));
        if (remove == null || (listener = remove.getListener()) == null) {
            return false;
        }
        listener.onExpiring(remove);
        remove.mo9463a(true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10029a(C2714c0 c0Var, int i, C2701c cVar) {
        mo10028a(c0Var, i, -1, cVar);
        mo10051v();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10028a(C2714c0 c0Var, int i, int i2, C2701c cVar) {
        JSONObject b = c0Var.mo9608b();
        String i3 = C2976x.m10337i(b, "url");
        this.f11874a = i3;
        if (i3.equals("")) {
            this.f11874a = C2976x.m10337i(b, "data");
        }
        this.f11877d = C2976x.m10337i(b, "base_url");
        this.f11876c = C2976x.m10337i(b, "custom_js");
        this.f11878e = C2976x.m10337i(b, "ad_session_id");
        this.f11868I = C2976x.m10335g(b, "info");
        this.f11880g = C2976x.m10337i(b, "mraid_filepath");
        this.f11895v = C2976x.m10329c(b, "use_mraid_module") ? C2684a.m9409c().mo9729p().mo9652d() : this.f11895v;
        this.f11881h = C2976x.m10337i(b, "ad_choices_filepath");
        this.f11882i = C2976x.m10337i(b, "ad_choices_url");
        this.f11865F = C2976x.m10329c(b, "disable_ad_choices");
        this.f11866G = C2976x.m10329c(b, "ad_choices_snap_to_webview");
        this.f11896w = C2976x.m10332e(b, "ad_choices_width");
        this.f11897x = C2976x.m10332e(b, "ad_choices_height");
        if (this.f11869J.length() == 0) {
            this.f11869J = C2976x.m10335g(b, "iab");
        }
        boolean z = false;
        if (!this.f11860A && !this.f11880g.equals("")) {
            if (this.f11895v > 0) {
                this.f11874a = m10197a(this.f11874a.replaceFirst("script\\s*src\\s*=\\s*\"mraid.js\"", "script src=\"file://" + this.f11880g + "\""), C2976x.m10337i(C2976x.m10335g(this.f11868I, "device_info"), "iab_filepath"));
            } else {
                try {
                    this.f11879f = C2684a.m9409c().mo9726m().mo10011a(this.f11880g, false).toString();
                    this.f11879f = this.f11879f.replaceFirst("bridge.os_name\\s*=\\s*\"\"\\s*;", "bridge.os_name = \"\";\nvar ADC_DEVICE_INFO = " + this.f11868I.toString() + ";\n");
                } catch (IOException e) {
                    m10208b((Exception) e);
                } catch (IllegalArgumentException e2) {
                    m10208b((Exception) e2);
                } catch (IndexOutOfBoundsException e3) {
                    m10208b((Exception) e3);
                }
            }
        }
        this.f11885l = i;
        this.f11870K = cVar;
        if (i2 >= 0) {
            this.f11894u = i2;
        } else {
            mo10037f();
        }
        this.f11890q = C2976x.m10332e(b, "width");
        this.f11892s = C2976x.m10332e(b, "height");
        this.f11886m = C2976x.m10332e(b, "x");
        int e4 = C2976x.m10332e(b, "y");
        this.f11888o = e4;
        this.f11891r = this.f11890q;
        this.f11893t = this.f11892s;
        this.f11889p = e4;
        this.f11887n = this.f11886m;
        if (C2976x.m10329c(b, "enable_messages") || this.f11899z) {
            z = true;
        }
        this.f11898y = z;
        mo10038h();
    }

    /* renamed from: a */
    public void mo9660a(JSONObject jSONObject) {
        synchronized (this.f11873N) {
            this.f11867H.put(jSONObject);
        }
    }

    /* renamed from: a */
    public void mo9659a() {
        if (C2684a.m9410d() && this.f11861B && !this.f11863D) {
            mo10026D();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10203a(JSONObject jSONObject, String str) {
        Context b = C2684a.m9407b();
        if (b != null && (b instanceof C2688b)) {
            C2684a.m9409c().mo9708b().mo9614a(b, jSONObject, str);
        } else if (this.f11894u == 1) {
            new C2978z.C2979a().mo10088a("Unable to communicate with controller, disabling AdColony.").mo10090a(C2978z.f11949i);
            AdColony.disable();
        } else if (this.f11895v > 0) {
            this.f11898y = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10199a(int i, String str, String str2) {
        if (this.f11870K != null) {
            JSONObject b = C2976x.m10319b();
            C2976x.m10323b(b, TtmlNode.ATTR_ID, this.f11885l);
            C2976x.m10313a(b, "ad_session_id", this.f11878e);
            C2976x.m10323b(b, "container_id", this.f11870K.mo9573c());
            C2976x.m10323b(b, "code", i);
            C2976x.m10313a(b, "error", str);
            C2976x.m10313a(b, "url", str2);
            new C2714c0("WebView.on_error", this.f11870K.mo9591k(), b).mo9612d();
        }
        new C2978z.C2979a().mo10088a("onReceivedError: ").mo10088a(str).mo10090a(C2978z.f11950j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10027a(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        this.f11886m = C2976x.m10332e(b, "x");
        this.f11888o = C2976x.m10332e(b, "y");
        this.f11890q = C2976x.m10332e(b, "width");
        this.f11892s = C2976x.m10332e(b, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f11886m, this.f11888o, 0, 0);
        layoutParams.width = this.f11890q;
        layoutParams.height = this.f11892s;
        setLayoutParams(layoutParams);
        if (this.f11899z) {
            JSONObject b2 = C2976x.m10319b();
            C2976x.m10325b(b2, "success", true);
            C2976x.m10323b(b2, TtmlNode.ATTR_ID, this.f11894u);
            c0Var.mo9607a(b2).mo9612d();
        }
        mo10025C();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10030a(boolean z) {
        this.f11862C = z;
    }
}
