package british.xnews2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.Html;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsResult;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import androidx.core.content.C0600b;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
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
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
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
import java.io.File;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import p001a0.C0008a;

public class t_html extends Activity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    String f9488A;

    /* renamed from: B */
    C1603c f9489B;

    /* renamed from: C */
    boolean f9490C = false;

    /* renamed from: D */
    int f9491D;

    /* renamed from: E */
    String f9492E;

    /* renamed from: F */
    private ValueCallback<Uri> f9493F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public ValueCallback<Uri[]> f9494G;

    /* renamed from: H */
    AlertDialog.Builder f9495H;

    /* renamed from: I */
    String f9496I;

    /* renamed from: J */
    String f9497J;

    /* renamed from: K */
    EditText f9498K;

    /* renamed from: L */
    EditText f9499L;

    /* renamed from: M */
    HttpAuthHandler f9500M;

    /* renamed from: N */
    ListView f9501N;

    /* renamed from: O */
    SwipeRefreshLayout f9502O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public FrameLayout f9503P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public LinearLayout f9504Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public WebChromeClient.CustomViewCallback f9505R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public View f9506S;

    /* renamed from: T */
    private WebChromeClient f9507T;

    /* renamed from: m */
    C1692config f9508m;

    /* renamed from: n */
    boolean f9509n = false;

    /* renamed from: o */
    boolean f9510o = false;

    /* renamed from: p */
    boolean f9511p = true;

    /* renamed from: q */
    boolean f9512q = false;

    /* renamed from: r */
    boolean f9513r = false;

    /* renamed from: s */
    boolean f9514s = false;

    /* renamed from: t */
    int f9515t = 0;

    /* renamed from: u */
    int f9516u = -1;

    /* renamed from: v */
    boolean f9517v = true;

    /* renamed from: w */
    boolean f9518w;

    /* renamed from: x */
    WebView f9519x;

    /* renamed from: y */
    Bundle f9520y;

    /* renamed from: z */
    GeolocationPermissions.Callback f9521z;

    /* renamed from: british.xnews2.t_html$a */
    class C2338a implements AdDisplayListener {
        C2338a() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_html t_html = t_html.this;
            if (t_html.f9490C) {
                t_html.abrir_secc(t_html.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.xnews2.t_html$b */
    class C2339b extends AdColonyInterstitialListener {
        C2339b() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_html t_html = t_html.this;
            if (t_html.f9490C) {
                t_html.abrir_secc(t_html.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_html.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_html.this.f6661g.cancel();
            t_html t_html = t_html.this;
            t_html.abrir_secc(t_html.f6660f);
        }
    }

    /* renamed from: british.xnews2.t_html$c */
    class C2340c implements SearchManager.OnCancelListener {
        C2340c() {
        }

        public void onCancel() {
            t_html t_html = t_html.this;
            t_html.f6657c = false;
            t_html.setResult(0);
        }
    }

    /* renamed from: british.xnews2.t_html$d */
    class C2341d implements SearchManager.OnDismissListener {
        C2341d() {
        }

        public void onDismiss() {
            t_html.this.f6658d = false;
        }
    }

    /* renamed from: british.xnews2.t_html$e */
    class C2342e implements SwipeRefreshLayout.C1237j {
        C2342e() {
        }

        /* renamed from: a */
        public void mo6090a() {
            t_html.this.f9519x.reload();
        }
    }

    /* renamed from: british.xnews2.t_html$f */
    class C2343f extends WebChromeClient {

        /* renamed from: british.xnews2.t_html$f$a */
        class C2344a extends WebViewClient {
            C2344a() {
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                t_html t_html = t_html.this;
                t_html.f9508m.mo7497c(t_html, str);
                return true;
            }
        }

        C2343f() {
        }

        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(t_html.this);
            webView2.setWebViewClient(new C2344a());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (!C1692config.m8166R0(t_html.this)) {
                return;
            }
            if (C0600b.m3289a(t_html.this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                t_html t_html = t_html.this;
                t_html.f9488A = str;
                t_html.f9521z = callback;
                C0008a.m34p(t_html, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 103);
                return;
            }
            callback.invoke(str, true, false);
        }

        @TargetApi(11)
        public void onHideCustomView() {
            if (Build.VERSION.SDK_INT < 16) {
                t_html.this.getWindow().clearFlags(1024);
            } else {
                t_html.this.getWindow().getDecorView().setSystemUiVisibility(0);
            }
            if (t_html.this.f9506S != null) {
                t_html.this.f9506S.setVisibility(8);
                t_html.this.f9503P.removeView(t_html.this.f9506S);
                t_html.this.f9506S = null;
                t_html.this.f9503P.setVisibility(8);
                t_html.this.f9505R.onCustomViewHidden();
                t_html.this.f9504Q.setVisibility(0);
            }
        }

        public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        @TargetApi(11)
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            t_html.this.f9505R = customViewCallback;
            t_html.this.f9503P.addView(view);
            t_html.this.f9506S = view;
            t_html.this.f9504Q.setVisibility(8);
            t_html.this.f9503P.setVisibility(0);
            if (Build.VERSION.SDK_INT < 16) {
                t_html.this.getWindow().setFlags(1024, 1024);
            } else {
                t_html.this.getWindow().getDecorView().setSystemUiVisibility(4);
            }
        }

        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (t_html.this.f9494G != null) {
                t_html.this.f9494G.onReceiveValue((Object) null);
            }
            t_html.this.f9494G = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            t_html t_html = t_html.this;
            t_html.startActivityForResult(Intent.createChooser(intent, t_html.getResources().getString(R.string.selecciona)), 10);
            return true;
        }
    }

    /* renamed from: british.xnews2.t_html$g */
    class C2345g implements View.OnTouchListener {
        C2345g() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if ((action != 0 && action != 1) || view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    /* renamed from: british.xnews2.t_html$h */
    class C2346h implements DownloadListener {
        C2346h() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0077 A[SYNTHETIC, Splitter:B:27:0x0077] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onDownloadStart(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, long r7) {
            /*
                r2 = this;
                british.xnews2.t_html r4 = british.xnews2.t_html.this
                boolean r4 = r4.f9518w
                if (r4 != 0) goto L_0x0023
                java.lang.String r4 = ".apk"
                boolean r4 = r3.endsWith(r4)
                if (r4 == 0) goto L_0x000f
                goto L_0x0023
            L_0x000f:
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r5 = "android.intent.action.VIEW"
                r4.<init>(r5)
                android.net.Uri r3 = android.net.Uri.parse(r3)
                r4.setData(r3)
                british.xnews2.t_html r3 = british.xnews2.t_html.this
                r3.startActivity(r4)
                goto L_0x0082
            L_0x0023:
                java.lang.String r4 = ""
                if (r5 == 0) goto L_0x0070
                java.lang.String r7 = "filename="
                boolean r7 = r5.contains(r7)
                if (r7 == 0) goto L_0x0070
                java.lang.String r7 = "(?i)^.*filename=\"?([^\"]+)\"?.*$"
                java.lang.String r8 = "$1"
                java.lang.String r7 = r5.replaceFirst(r7, r8)
                java.lang.String r8 = "UTF-8"
                java.lang.String r7 = r7.replace(r8, r4)
                java.lang.String r8 = "."
                boolean r0 = r7.contains(r8)
                if (r0 == 0) goto L_0x0070
                int r0 = r7.lastIndexOf(r8)
                r1 = -1
                if (r0 == r1) goto L_0x0051
                java.lang.String r0 = r7.substring(r0)
                goto L_0x0052
            L_0x0051:
                r0 = r4
            L_0x0052:
                java.lang.String r8 = r0.replace(r8, r4)
                if (r8 == 0) goto L_0x0071
                boolean r0 = r8.equals(r4)
                if (r0 != 0) goto L_0x0071
                android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
                java.lang.String r8 = r0.getMimeTypeFromExtension(r8)
                if (r8 == 0) goto L_0x0071
                boolean r0 = r8.equals(r4)
                if (r0 != 0) goto L_0x0071
                r6 = r8
                goto L_0x0071
            L_0x0070:
                r7 = r4
            L_0x0071:
                boolean r4 = r7.equals(r4)
                if (r4 == 0) goto L_0x007b
                java.lang.String r7 = android.webkit.URLUtil.guessFileName(r3, r5, r6)     // Catch:{ Exception -> 0x007b }
            L_0x007b:
                british.xnews2.t_html r4 = british.xnews2.t_html.this
                british.xnews2.config r5 = r4.f9508m
                r5.mo7491W(r3, r6, r7, r4)
            L_0x0082:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_html.C2346h.onDownloadStart(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void");
        }
    }

    /* renamed from: british.xnews2.t_html$i */
    class C2347i extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ ProgressBar f9531a;

        /* renamed from: british.xnews2.t_html$i$a */
        class C2348a implements DialogInterface.OnClickListener {
            C2348a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                t_html t_html = t_html.this;
                t_html.f9496I = t_html.f9498K.getText().toString();
                t_html t_html2 = t_html.this;
                t_html2.f9497J = t_html2.f9499L.getText().toString();
                t_html t_html3 = t_html.this;
                t_html3.f9500M.proceed(t_html3.f9496I, t_html3.f9497J);
            }
        }

        /* renamed from: british.xnews2.t_html$i$b */
        class C2349b implements DialogInterface.OnClickListener {
            C2349b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                t_html.this.f9500M.cancel();
            }
        }

        /* renamed from: british.xnews2.t_html$i$c */
        class C2350c implements DialogInterface.OnCancelListener {
            C2350c() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                t_html.this.f9500M.cancel();
            }
        }

        C2347i(ProgressBar progressBar) {
            this.f9531a = progressBar;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f9531a.setVisibility(8);
            t_html.this.f9502O.setRefreshing(false);
            t_html t_html = t_html.this;
            if (t_html.f9509n) {
                t_html.f9509n = false;
                t_html.f9519x.clearHistory();
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            boolean z;
            boolean z2;
            t_html t_html = t_html.this;
            if (!t_html.f6657c && !t_html.isFinishing() && !t_html.this.f9492E.contains("youtube.com") && !t_html.this.f9492E.contains("youtu.be")) {
                t_html t_html2 = t_html.this;
                if (t_html2.f9517v) {
                    Bundle bundle = t_html2.f9520y;
                    z = true;
                    z2 = bundle != null && bundle.containsKey("ad_entrar");
                    Bundle bundle2 = t_html.this.f9520y;
                    if (bundle2 == null || !bundle2.containsKey("fb_entrar")) {
                        z = false;
                    }
                    t_html.this.f9517v = false;
                } else {
                    z2 = false;
                    z = false;
                }
                t_html t_html3 = t_html.this;
                t_html3.f9508m.mo7504g1(t_html3, z2, z, false);
            }
            t_html t_html4 = t_html.this;
            if (t_html4.f9511p && !t_html4.f9502O.mo6049h()) {
                this.f9531a.setVisibility(0);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (!C1692config.m8205x0(t_html.this)) {
                if (!t_html.this.f9508m.f7323d5.equals("")) {
                    String str3 = t_html.this.f9508m.f7323d5;
                    if (!str3.toLowerCase(Locale.getDefault()).contains("<html")) {
                        str3 = "<html><head><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"></head><body>" + str3 + "</body></html>";
                    }
                    t_html.this.f9519x.loadData(str3, "text/html; charset=utf-8", "utf-8");
                } else {
                    t_html.this.f9519x.loadData("<html><head><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"></head><body>" + t_html.this.getResources().getString(R.string.wv_sinconex) + "</body></html>", "text/html; charset=utf-8", "utf-8");
                }
                t_html.this.f9519x.clearHistory();
                t_html.this.f9514s = true;
            }
        }

        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            t_html t_html = t_html.this;
            t_html.f9500M = httpAuthHandler;
            t_html.f9495H = new AlertDialog.Builder(t_html.this);
            t_html t_html2 = t_html.this;
            t_html2.f9495H.setTitle(t_html2.getResources().getString(R.string.chat_acceso));
            View inflate = t_html.this.getLayoutInflater().inflate(R.layout.usucontra, (ViewGroup) null);
            t_html.this.f9498K = (EditText) inflate.findViewById(R.id.et_usu);
            t_html.this.f9499L = (EditText) inflate.findViewById(R.id.et_contra);
            t_html.this.f9495H.setView(inflate);
            t_html.this.f9495H.setCancelable(true);
            t_html t_html3 = t_html.this;
            t_html3.f9495H.setPositiveButton(t_html3.getString(R.string.aceptar), new C2348a());
            t_html t_html4 = t_html.this;
            t_html4.f9495H.setNegativeButton(t_html4.getString(R.string.cancelar), new C2349b());
            t_html.this.f9495H.setOnCancelListener(new C2350c());
            t_html.this.f9495H.create().show();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19 = str;
            String lowerCase = str.toLowerCase();
            String[] strArr = {"doc", "docx", "xls", "xlsx", "ppt", "pptx", "pdf", "pages", "ai", "psd", "tiff", "dxf", "svg", "eps", "ps", "ttf", "otf", "xps", "zip", "rar"};
            int lastIndexOf = str19.lastIndexOf(".");
            if (lastIndexOf != -1) {
                str2 = lowerCase.substring(lastIndexOf);
            } else {
                str2 = "";
            }
            String replace = str2.replace(".", "");
            int i = 0;
            if (lowerCase.startsWith("tel:") || lowerCase.startsWith("http://tel:")) {
                if (lowerCase.startsWith("tel:")) {
                    str3 = str19.substring(4);
                } else {
                    str3 = str19.substring(11);
                }
                if (str3.endsWith("/")) {
                    str3 = str3.substring(0, str3.length() - 1);
                }
                try {
                    t_html.this.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str3)));
                } catch (Exception unused) {
                }
                return true;
            } else if (lowerCase.startsWith("mailto:") || lowerCase.startsWith("http://mailto:")) {
                if (lowerCase.startsWith("mailto:")) {
                    str4 = str19.substring(7).trim();
                } else {
                    str4 = str19.substring(14).trim();
                }
                if (!str4.equals("")) {
                    int indexOf = str4.indexOf("?");
                    if (indexOf > 0) {
                        int indexOf2 = str4.indexOf("?subject=");
                        if (indexOf2 != -1) {
                            str6 = str4.substring(indexOf2 + 9).trim();
                            int indexOf3 = str6.indexOf("&body=");
                            if (indexOf3 != -1) {
                                str5 = str6.substring(indexOf3 + 6).trim();
                                str6 = str6.substring(0, indexOf3).trim();
                            } else {
                                str5 = "";
                            }
                        } else {
                            str6 = "";
                            str5 = str6;
                        }
                        str4 = str4.substring(0, indexOf).trim();
                        if (str5.equals("")) {
                            try {
                                String[] split = Uri.parse(str).getQuery().split("&");
                                int length = split.length;
                                int i2 = 0;
                                while (i2 < length) {
                                    String str20 = split[i2];
                                    int indexOf4 = str20.indexOf("=");
                                    String decode = URLDecoder.decode(str20.substring(i, indexOf4), C6540C.UTF8_NAME);
                                    String decode2 = URLDecoder.decode(str20.substring(indexOf4 + 1), C6540C.UTF8_NAME);
                                    if (!decode.equalsIgnoreCase("subject")) {
                                        str5 = str5 + "<b>" + decode + "</b>: " + decode2 + "<br>";
                                    }
                                    i2++;
                                    i = 0;
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        str6 = "";
                        str5 = str6;
                    }
                    if (str4.endsWith("/")) {
                        str4 = str4.substring(0, str4.length() - 1);
                    }
                    Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", str4, (String) null));
                    if (!str6.equals("")) {
                        try {
                            str6 = URLDecoder.decode(str6, C6540C.UTF8_NAME);
                        } catch (Exception unused2) {
                        }
                        intent.putExtra("android.intent.extra.SUBJECT", str6);
                    }
                    if (!str5.equals("")) {
                        try {
                            str5 = URLDecoder.decode(str5, C6540C.UTF8_NAME);
                        } catch (Exception unused3) {
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("<p>" + str5 + "</p>");
                        intent.putExtra("android.intent.extra.TEXT", Html.fromHtml(sb.toString()));
                    }
                    t_html t_html = t_html.this;
                    t_html.startActivity(Intent.createChooser(intent, t_html.getResources().getString(R.string.enviar_email)));
                }
                return true;
            } else if (lowerCase.startsWith("smsto:") || lowerCase.startsWith("http://smsto:")) {
                if (lowerCase.startsWith("smsto:")) {
                    str7 = str19.substring(6).trim();
                } else {
                    str7 = str19.substring(13).trim();
                }
                if (!str7.equals("")) {
                    int indexOf5 = str7.indexOf("?");
                    if (indexOf5 > 0) {
                        int indexOf6 = str7.indexOf("?body=");
                        if (indexOf6 != -1) {
                            str8 = str7.substring(indexOf6 + 6).trim();
                        } else {
                            str8 = "";
                        }
                        str7 = str7.substring(0, indexOf5).trim();
                    } else {
                        str8 = "";
                    }
                    if (str7.endsWith("/")) {
                        str7 = str7.substring(0, str7.length() - 1);
                    }
                    Intent intent2 = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str7));
                    if (!str8.equals("")) {
                        try {
                            str8 = URLDecoder.decode(str8, C6540C.UTF8_NAME);
                        } catch (Exception unused4) {
                        }
                        intent2.putExtra("sms_body", str8);
                    }
                    try {
                        t_html.this.startActivity(intent2);
                    } catch (Exception unused5) {
                    }
                }
                return true;
            } else if (lowerCase.startsWith("action_") || lowerCase.startsWith("http://action_")) {
                t_html t_html2 = t_html.this;
                C1845j k0 = t_html2.f9508m.mo7513k0(lowerCase, t_html2);
                if (k0.f7843b) {
                    t_html.this.f6657c = true;
                    Intent intent3 = new Intent();
                    intent3.putExtra("finalizar", true);
                    intent3.putExtra("finalizar_app", k0.f7844c);
                    t_html.this.setResult(-1, intent3);
                }
                if (k0.f7845d) {
                    t_html.this.startActivityForResult(k0.f7842a, 0);
                } else {
                    Intent intent4 = k0.f7842a;
                    if (intent4 != null) {
                        if (k0.f7843b) {
                            t_html t_html3 = t_html.this;
                            t_html3.f6659e = false;
                            if (t_html3.f9508m.f7427t4 != 2) {
                                intent4.putExtra("es_root", true);
                            }
                            try {
                                t_html.this.startActivity(k0.f7842a);
                            } catch (Exception unused6) {
                            }
                        } else {
                            t_html.this.startActivityForResult(intent4, 0);
                        }
                    }
                }
                t_html t_html4 = t_html.this;
                if (t_html4.f6657c && !t_html4.f6658d) {
                    t_html4.finish();
                }
                return true;
            } else if (lowerCase.startsWith("intent://") || lowerCase.startsWith("wvc-x-callback://")) {
                try {
                    Intent parseUri = Intent.parseUri(str19, 1);
                    parseUri.addCategory("android.intent.category.BROWSABLE");
                    parseUri.setComponent((ComponentName) null);
                    parseUri.setSelector((Intent) null);
                    t_html.this.startActivity(parseUri);
                    return true;
                } catch (Exception unused7) {
                    return false;
                }
            } else if (lowerCase.startsWith("go:") || lowerCase.startsWith("http://go:")) {
                if (lowerCase.startsWith("go:")) {
                    str9 = str19.substring(3);
                } else {
                    str9 = str19.substring(10);
                }
                if (str9.endsWith("/")) {
                    str9 = str9.substring(0, str9.length() - 1);
                }
                try {
                    str9 = URLDecoder.decode(str9, C6540C.UTF8_NAME);
                } catch (Exception unused8) {
                }
                int i3 = 0;
                while (true) {
                    C1855l[] lVarArr = t_html.this.f9508m.f7231O1;
                    if (i3 >= lVarArr.length) {
                        return false;
                    }
                    if (lVarArr[i3].f7922i.equalsIgnoreCase(str9)) {
                        String str21 = t_html.this.f9508m.f7251R3;
                        if ((str21 == null || str21.equals("")) && (((str10 = t_html.this.f9508m.f7281W3) == null || str10.equals("")) && (((str11 = t_html.this.f9508m.f7250R2) == null || str11.equals("")) && (((str12 = t_html.this.f9508m.f7245Q3) == null || str12.equals("")) && (((str13 = t_html.this.f9508m.f7269U3) == null || str13.equals("")) && (((str14 = t_html.this.f9508m.f7275V3) == null || str14.equals("")) && (((str15 = t_html.this.f9508m.f7358j4) == null || str15.equals("")) && (((str16 = t_html.this.f9508m.f7287X3) == null || str16.equals("")) && ((str17 = t_html.this.f9508m.f7293Y3) == null || str17.equals("")))))))))) {
                            t_html t_html5 = t_html.this;
                            t_html5.f9508m.mo7499d(t_html5, i3);
                        } else {
                            String str22 = t_html.this.f9508m.f7251R3;
                            if (str22 != null && !str22.equals("")) {
                                t_html t_html6 = t_html.this;
                                t_html t_html7 = t_html.this;
                                t_html6.f6663i = new RewardedVideo((Context) t_html7, t_html7.f9508m.f7251R3);
                            }
                            String str23 = t_html.this.f9508m.f7245Q3;
                            if (str23 != null) {
                                str23.equals("");
                            }
                            String str24 = t_html.this.f9508m.f7269U3;
                            if (str24 != null && !str24.equals("")) {
                                t_html t_html8 = t_html.this;
                                t_html8.f6664j = new RewardedVideoAd(t_html8, t_html8.f9508m.f7269U3);
                            }
                            String str25 = t_html.this.f9508m.f7275V3;
                            if (str25 != null && !str25.equals("")) {
                                t_html t_html9 = t_html.this;
                                t_html9.f6665k = new StartAppAd(t_html9);
                            }
                            t_html.this.f6661g = new ProgressDialog(t_html.this);
                            View view = new View(t_html.this);
                            view.setId(i3);
                            view.setTag(R.id.TAG_IDSECC, Integer.valueOf(i3));
                            t_html t_html10 = t_html.this;
                            t_html10.f6660f = null;
                            t_html10.f9516u = i3;
                            if (!t_html10.f9508m.mo7494Z0(t_html10, view, t_html10.f6656b, t_html10.f6661g, t_html10.f6662h, t_html10.f6663i, t_html10.f6664j, t_html10.f6665k, t_html10.f6666l, (View) null)) {
                                t_html t_html11 = t_html.this;
                                t_html11.f9508m.mo7499d(t_html11, i3);
                            }
                        }
                        return true;
                    }
                    i3++;
                }
            } else if (lowerCase.startsWith("vnd.youtube:")) {
                int indexOf7 = str19.indexOf("?");
                if (indexOf7 > 0) {
                    str18 = str19.substring(12, indexOf7);
                } else {
                    str18 = str19.substring(12);
                }
                String str26 = "https://www.youtube.com/watch?v=" + str18;
                t_html t_html12 = t_html.this;
                if (t_html12.f9515t == 1) {
                    t_html12.f9508m.mo7497c(t_html12, str26);
                } else {
                    t_html12.f9519x.loadUrl(str26);
                }
                return true;
            } else if (t_html.this.f9518w && (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".mp4"))) {
                t_html t_html13 = t_html.this;
                t_html13.f9508m.mo7491W(str19, "", "", t_html13);
                return true;
            } else if (!t_html.this.f9518w && lowerCase.endsWith(".mp3")) {
                Intent intent5 = new Intent("android.intent.action.VIEW");
                intent5.setDataAndType(Uri.parse(str), "audio/*");
                webView.getContext().startActivity(intent5);
                return true;
            } else if (!t_html.this.f9518w && (lowerCase.endsWith(".mp4") || lowerCase.endsWith(".3gp"))) {
                Intent intent6 = new Intent("android.intent.action.VIEW");
                intent6.setDataAndType(Uri.parse(str), "video/*");
                webView.getContext().startActivity(intent6);
                return true;
            } else if (lowerCase.startsWith("upi://")) {
                Intent intent7 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                t_html t_html14 = t_html.this;
                t_html14.startActivity(Intent.createChooser(intent7, t_html14.getResources().getString(R.string.selecciona)));
                return true;
            } else if (t_html.this.f9515t == 1 || lowerCase.startsWith("rtsp://") || lowerCase.startsWith("rtmp://") || lowerCase.startsWith("market://") || lowerCase.startsWith("whatsapp://") || lowerCase.endsWith(".m3u") || lowerCase.endsWith(".m3u8") || lowerCase.startsWith("http://www.appcreator24.com/open") || lowerCase.startsWith("https://www.appcreator24.com/open")) {
                t_html t_html15 = t_html.this;
                return t_html15.f9508m.mo7497c(t_html15, str19);
            } else if (t_html.this.f9518w || !Arrays.asList(strArr).contains(replace) || lowerCase.contains("docs.google.com")) {
                return false;
            } else {
                if (!t_html.this.f9519x.getUrl().contains("docs.google.com")) {
                    try {
                        str19 = URLEncoder.encode(str19, "utf-8");
                    } catch (Exception unused9) {
                    }
                    t_html.this.f9519x.loadUrl("https://docs.google.com/viewer?embedded=true&url=" + str19);
                    return true;
                }
                t_html t_html16 = t_html.this;
                t_html16.f9508m.mo7497c(t_html16, str19);
                return true;
            }
        }
    }

    /* renamed from: british.xnews2.t_html$j */
    class C2351j extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f9536a;

        /* renamed from: british.xnews2.t_html$j$a */
        class C2352a extends FullScreenContentCallback {
            C2352a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_html t_html = t_html.this;
                if (t_html.f9490C) {
                    t_html.abrir_secc(t_html.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_html t_html = t_html.this;
                t_html.abrir_secc(t_html.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.t_html$j$b */
        class C2353b implements OnUserEarnedRewardListener {
            C2353b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2351j jVar = C2351j.this;
                t_html.this.f9490C = true;
                C1692config.m8175Y0(jVar.f9536a);
            }
        }

        C2351j(Context context) {
            this.f9536a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_html.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2352a());
            rewardedAd.show((Activity) this.f9536a, new C2353b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_html t_html = t_html.this;
            if (!t_html.f9508m.mo7502f(this.f9536a, t_html.f6663i)) {
                t_html.this.f6661g.cancel();
                t_html t_html2 = t_html.this;
                t_html2.abrir_secc(t_html2.f6660f);
            }
        }
    }

    /* renamed from: british.xnews2.t_html$k */
    private class C2354k extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f9540a;

        public C2354k(String str) {
            this.f9540a = str;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0099  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095 }
                r0.<init>()     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = british.xnews2.C1692config.f7107G5     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "html.e-droid.net/html/get_html.php?ida="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                r1 = 2260177(0x227cd1, float:3.167183E-39)
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "&ids="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                british.xnews2.t_html r1 = british.xnews2.t_html.this     // Catch:{ Exception -> 0x0095 }
                british.xnews2.config r2 = r1.f9508m     // Catch:{ Exception -> 0x0095 }
                british.xnews2.l[] r2 = r2.f7231O1     // Catch:{ Exception -> 0x0095 }
                int r1 = r1.f9491D     // Catch:{ Exception -> 0x0095 }
                r1 = r2[r1]     // Catch:{ Exception -> 0x0095 }
                int r1 = r1.f7964y     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "&fum="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = r5.f9540a     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0095 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0095 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0095 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x0095 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x0095 }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r2.<init>(r6)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r1.<init>(r2)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r6.<init>()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
            L_0x0069:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                if (r2 == 0) goto L_0x0084
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r3.<init>()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r3.append(r2)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r6.append(r2)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                goto L_0x0069
            L_0x0084:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r0.disconnect()
                return r6
            L_0x008c:
                r6 = move-exception
                goto L_0x009d
            L_0x008e:
                r6 = r0
                goto L_0x0095
            L_0x0090:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x009d
            L_0x0095:
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x009c
                r6.disconnect()
            L_0x009c:
                return r0
            L_0x009d:
                if (r0 == 0) goto L_0x00a2
                r0.disconnect()
            L_0x00a2:
                goto L_0x00a4
            L_0x00a3:
                throw r6
            L_0x00a4:
                goto L_0x00a3
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_html.C2354k.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            String str2;
            t_html t_html = t_html.this;
            if (t_html.f9511p) {
                try {
                    t_html.findViewById(R.id.pb_url).setVisibility(0);
                } catch (Exception unused) {
                }
            }
            int indexOf = str.indexOf("[");
            if (indexOf != -1) {
                str2 = str.substring(indexOf + 1);
            } else {
                str2 = "";
            }
            String replace = str2.replace("]", "").replace("@MNQ@", "<");
            t_html.this.f9492E = replace;
            if (!replace.equals("")) {
                t_html t_html2 = t_html.this;
                t_html2.f9508m.f7231O1[t_html2.f9491D].f7913f = replace;
                SharedPreferences.Editor edit = t_html2.getSharedPreferences("sh", 0).edit();
                StringBuilder sb = new StringBuilder();
                sb.append("s");
                t_html t_html3 = t_html.this;
                sb.append(t_html3.f9508m.f7231O1[t_html3.f9491D].f7964y);
                sb.append("_html");
                edit.putString(sb.toString(), replace);
                edit.commit();
            }
            t_html.this.mo8724k((Bundle) null);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            t_html t_html = t_html.this;
            if (t_html.f9511p) {
                try {
                    t_html.findViewById(R.id.pb_url).setVisibility(0);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: i */
    private void m8831i(Context context) {
        this.f6662h = new C2351j(context);
    }

    @TargetApi(21)
    /* renamed from: l */
    private void m8832l() {
        if (Build.VERSION.SDK_INT > 20) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f9519x, true);
        }
    }

    public void abrir_secc(View view) {
        if (view == null) {
            int i = this.f9516u;
            if (i != -1) {
                this.f9508m.mo7499d(this, i);
                return;
            }
            return;
        }
        C1845j j0 = this.f9508m.mo7510j0(view, this);
        if (j0.f7843b) {
            this.f6657c = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", j0.f7844c);
            setResult(-1, intent);
        }
        if (j0.f7845d) {
            if (this.f9519x.getUrl() != null && (this.f9519x.getUrl().toLowerCase().contains("youtube.com") || this.f9519x.getUrl().toLowerCase().contains("youtu.be"))) {
                this.f9519x.reload();
            }
            startActivityForResult(j0.f7842a, 0);
        } else {
            Intent intent2 = j0.f7842a;
            if (intent2 != null) {
                if (j0.f7843b) {
                    this.f6659e = false;
                    if (this.f9508m.f7427t4 != 2) {
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
    /* renamed from: j */
    public void mo8723j() {
        int q0 = this.f9508m.mo7522q0(this);
        int i = this.f9508m.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f9501N = listView;
            this.f9508m.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f9508m.f7231O1;
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
            int[] iArr = this.f9508m.f7249R1;
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

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo8724k(Bundle bundle) {
        String str;
        String str2;
        registerForContextMenu(this.f9519x);
        this.f9489B = this.f9508m.mo7474A0(this, this.f9492E.contains("youtube.com") || this.f9492E.contains("youtu.be"));
        C1692config config = this.f9508m;
        config.mo7488Q0(this, config.f7318d, this.f6656b, bundle);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.srl);
        this.f9502O = swipeRefreshLayout;
        if (this.f9513r) {
            if (Build.VERSION.SDK_INT > 20) {
                swipeRefreshLayout.setColorSchemeColors(Color.parseColor("#" + this.f9508m.f7368l1));
            }
            this.f9502O.setOnRefreshListener(new C2342e());
        } else {
            swipeRefreshLayout.setEnabled(false);
        }
        if (this.f9515t == 2) {
            this.f9519x.getSettings().setSupportMultipleWindows(true);
        }
        WebView webView = this.f9519x;
        C2343f fVar = new C2343f();
        this.f9507T = fVar;
        webView.setWebChromeClient(fVar);
        m8832l();
        this.f9519x.getSettings().setBuiltInZoomControls(this.f9512q);
        this.f9519x.getSettings().setSupportZoom(this.f9512q);
        this.f9519x.getSettings().setDomStorageEnabled(true);
        this.f9519x.setOnTouchListener(new C2345g());
        this.f9519x.setDownloadListener(new C2346h());
        C1692config config2 = this.f9508m;
        int i = config2.f7318d;
        if (i != -1 && config2.f7231O1[i].f7850C) {
            this.f9519x.getSettings().setUseWideViewPort(true);
            this.f9519x.getSettings().setLoadWithOverviewMode(true);
        }
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.pb_url);
        if (Build.VERSION.SDK_INT > 20) {
            C1692config.m8168S0(progressBar, this.f9508m.f7368l1);
        }
        this.f9519x.setWebViewClient(new C2347i(progressBar));
        this.f9519x.getSettings().setJavaScriptEnabled(true);
        this.f9519x.getSettings().setPluginState(WebSettings.PluginState.ON);
        C1692config config3 = this.f9508m;
        if (!config3.f7311b5 && !config3.f7317c5 && C1692config.m8205x0(this)) {
            this.f9519x.clearCache(true);
            this.f9508m.f7317c5 = true;
        }
        this.f9519x.getSettings().setAppCachePath(getApplicationContext().getCacheDir().getAbsolutePath());
        this.f9519x.getSettings().setAppCacheEnabled(true);
        this.f9519x.getSettings().setCacheMode(-1);
        if (!C1692config.m8205x0(this)) {
            if (this.f9508m.f7305a5) {
                this.f9519x.getSettings().setCacheMode(1);
            } else {
                this.f9519x.getSettings().setCacheMode(2);
            }
        }
        C1692config config4 = this.f9508m;
        int i2 = config4.f7318d;
        if (i2 == -1 || config4.f7231O1[i2].f7925j.equals("")) {
            str = "";
        } else {
            C1692config config5 = this.f9508m;
            str = config5.f7231O1[config5.f7318d].f7925j;
        }
        if (str.equals("")) {
            this.f9519x.getSettings().setUserAgentString(this.f9519x.getSettings().getUserAgentString() + " Vinebre");
        } else {
            this.f9519x.getSettings().setUserAgentString(str);
        }
        if (bundle == null) {
            String string = getSharedPreferences("sh", 0).getString("ft", SessionDescription.SUPPORTED_SDP_VERSION);
            if (!this.f9508m.f7231O1[this.f9491D].f7858G && !string.equals(SessionDescription.SUPPORTED_SDP_VERSION) && !string.equals("")) {
                this.f9519x.getSettings().setAllowFileAccess(true);
                if (!string.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    str2 = "file:///android_asset/fonts/" + this.f9508m.mo7485M0(Integer.parseInt(string));
                } else if (new File(getFilesDir(), "font").exists()) {
                    str2 = "file://" + getFilesDir().getAbsolutePath() + "/font";
                } else {
                    str2 = "";
                }
                if (!str2.equals("")) {
                    this.f9492E = this.f9492E.replaceFirst(Pattern.quote("</head>"), "<style type=\"text/css\">@font-face {font-family: fontAC;src: url(\"" + str2 + "\")} body,input,textarea,select{font-family: fontAC;}</style></head>");
                }
            }
            this.f9519x.loadDataWithBaseURL("http://localhost/", this.f9492E.replace("@CCORCH@", "]"), "text/html", "utf-8", (String) null);
            this.f9504Q = (LinearLayout) findViewById(R.id.ll_princ);
            this.f9503P = (FrameLayout) findViewById(R.id.target_view);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        String dataString;
        if (i == 10) {
            ValueCallback<Uri> valueCallback = this.f9493F;
            if (valueCallback != null || this.f9494G != null) {
                if (valueCallback != null) {
                    this.f9493F.onReceiveValue((intent == null || i2 != -1) ? null : intent.getData());
                    this.f9493F = null;
                } else if (this.f9494G != null) {
                    this.f9494G.onReceiveValue((intent == null || (dataString = intent.getDataString()) == null) ? null : new Uri[]{Uri.parse(dataString)});
                    this.f9494G = null;
                }
            }
        } else if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f6659e = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    public void onAdClicked(C3371Ad ad) {
    }

    public void onAdClosed() {
        if (this.f9490C) {
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
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9 = this.f9508m.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f9508m.f7281W3) == null || str.equals("")) && (((str2 = this.f9508m.f7250R2) == null || str2.equals("")) && (((str3 = this.f9508m.f7245Q3) == null || str3.equals("")) && (((str4 = this.f9508m.f7269U3) == null || str4.equals("")) && (((str5 = this.f9508m.f7275V3) == null || str5.equals("")) && (((str6 = this.f9508m.f7358j4) == null || str6.equals("")) && (((str7 = this.f9508m.f7287X3) == null || str7.equals("")) && ((str8 = this.f9508m.f7293Y3) == null || str8.equals("")))))))))) {
            abrir_secc(view);
            return;
        }
        String str10 = this.f9508m.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6663i = new RewardedVideo((Context) this, this.f9508m.f7251R3);
        }
        String str11 = this.f9508m.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f9508m.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6664j = new RewardedVideoAd(this, this.f9508m.f7269U3);
        }
        String str13 = this.f9508m.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6665k = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6661g = progressDialog;
        this.f6660f = view;
        this.f9516u = -1;
        if (!this.f9508m.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
            abrir_secc(view);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        boolean z = false;
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo8723j();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f9489B;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f9489B;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        C1692config config = this.f9508m;
        if (this.f9492E.contains("youtube.com") || this.f9492E.contains("youtu.be")) {
            z = true;
        }
        this.f9489B = config.mo7474A0(this, z);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        String str;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.compartir) {
            String str2 = this.f9519x.getHitTestResult().getExtra().toString();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str2);
            startActivity(Intent.createChooser(intent, getResources().getString(R.string.compartir)));
            return true;
        } else if (itemId != R.id.guardar) {
            return super.onContextItemSelected(menuItem);
        } else {
            WebView.HitTestResult hitTestResult = this.f9519x.getHitTestResult();
            String str3 = hitTestResult.getExtra().toString();
            if (str3 != null) {
                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(hitTestResult.getExtra().toString());
                String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : "image/*";
                try {
                    str = URLUtil.guessFileName(str3, (String) null, mimeTypeFromExtension);
                } catch (Exception unused) {
                    str = "";
                }
                this.f9508m.mo7491W(str3, mimeTypeFromExtension, str, this);
            }
            return true;
        }
    }

    public void onCreate(Bundle bundle) {
        C1692config config = (C1692config) getApplicationContext();
        this.f9508m = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8831i(this);
        this.f6666l = new C2339b();
        Bundle extras = getIntent().getExtras();
        this.f9520y = extras;
        int i = extras.getInt("idsecc");
        this.f9491D = i;
        C1692config config2 = this.f9508m;
        this.f6656b = C1692config.m8189h(config2.f7231O1[i].f7916g, config2.f7368l1);
        super.onCreate(bundle);
        setContentView(R.layout.t_url);
        if (bundle == null) {
            Bundle bundle2 = this.f9520y;
            this.f6659e = bundle2 != null && bundle2.containsKey("es_root") && this.f9520y.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        mo8723j();
        this.f9508m.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C2340c());
        searchManager.setOnDismissListener(new C2341d());
        this.f9519x = (WebView) findViewById(R.id.webview);
        C1692config config3 = this.f9508m;
        C1855l[] lVarArr = config3.f7231O1;
        String str = lVarArr[this.f9491D].f7913f;
        this.f9492E = str;
        int i2 = config3.f7318d;
        if (i2 != -1) {
            this.f9515t = lVarArr[i2].f7962x;
            this.f9511p = lVarArr[i2].f7854E;
            this.f9512q = lVarArr[i2].f7856F;
            this.f9513r = lVarArr[i2].f7870M;
            this.f9518w = lVarArr[i2].f7862I;
        } else {
            this.f9515t = 0;
            this.f9511p = true;
            this.f9512q = true;
            this.f9513r = false;
            this.f9518w = false;
        }
        if (!str.startsWith("GET_") || this.f9492E.length() <= 4) {
            mo8724k(bundle);
            return;
        }
        String[] split = this.f9492E.split("_");
        if (split.length == 2) {
            new C2354k(split[1]).execute(new String[0]);
        } else {
            mo8724k(bundle);
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        getMenuInflater().inflate(R.menu.m3, contextMenu);
        WebView.HitTestResult hitTestResult = this.f9519x.getHitTestResult();
        if (!this.f9518w || !(hitTestResult.getType() == 5 || hitTestResult.getType() == 8)) {
            contextMenu.removeItem(R.id.guardar);
        } else {
            MenuItem findItem = contextMenu.findItem(R.id.guardar);
            String str = findItem.getTitle() + "";
            findItem.setTitle(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        }
        if (!this.f9518w || !(hitTestResult.getType() == 5 || hitTestResult.getType() == 8)) {
            contextMenu.removeItem(R.id.compartir);
        }
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f9508m.f7384n3 == 0 || (cVar3 = this.f9489B) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f9508m.f7384n3 == 0 || (cVar2 = this.f9489B) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f9508m.f7384n3 == 0 || (cVar = this.f9489B) == null || (adColonyAdView = cVar.f6889d) == null)) {
            adColonyAdView.destroy();
        }
        if ((this.f6659e && isFinishing()) || C1692config.f7111K5) {
            C1692config.m8176Z(this);
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
        if (i == 4) {
            if (this.f9506S != null) {
                this.f9510o = false;
                this.f9507T.onHideCustomView();
                return true;
            } else if (!this.f9519x.canGoBack() || this.f9514s) {
                boolean z = this.f6659e;
                if (z && !this.f9510o && this.f9508m.f7365k5) {
                    this.f9510o = true;
                    C1692config.m8199t(this);
                    return true;
                } else if (z && this.f9519x.getUrl() != null && (this.f9519x.getUrl().toLowerCase(Locale.getDefault()).contains("youtube.com") || this.f9519x.getUrl().toLowerCase(Locale.getDefault()).contains("youtu.be"))) {
                    startActivity(new Intent(this, finalizar.class));
                    finish();
                    return true;
                }
            } else {
                this.f9510o = false;
                WebBackForwardList copyBackForwardList = this.f9519x.copyBackForwardList();
                String url = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - 1).getUrl();
                if (url.equals("about:blank") || url.equals("data:text/html;charset=utf-8;base64,")) {
                    this.f9509n = true;
                    this.f9519x.clearHistory();
                    this.f9519x.loadDataWithBaseURL("http://localhost/", this.f9492E.replace("@CCORCH@", "]"), "text/html", "utf-8", (String) null);
                    this.f9519x.clearHistory();
                } else {
                    this.f9519x.goBack();
                }
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f9508m.f7384n3 == 0 || (cVar = this.f9489B) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        if (this.f9506S != null) {
            this.f9507T.onHideCustomView();
        }
        super.onPause();
        C1692config.m8162O0(this);
        this.f9519x.onPause();
        if (this.f6657c || isFinishing()) {
            try {
                this.f9519x.loadData("", "text/html", "utf-8");
            } catch (Exception unused) {
            }
        }
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2338a());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 103 && C1692config.m8166R0(this) && iArr.length > 0 && strArr[0].equals("android.permission.ACCESS_FINE_LOCATION") && iArr[0] == 0) {
            this.f9521z.invoke(this.f9488A, true, false);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f9519x.restoreState(bundle);
        if (this.f9519x.copyBackForwardList().getCurrentIndex() == 0) {
            this.f9519x.loadDataWithBaseURL("http://localhost/", this.f9492E.replace("@CCORCH@", "]"), "text/html", "utf-8", (String) null);
        }
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (!(this.f9508m.f7384n3 == 0 || (cVar = this.f9489B) == null || (adView = cVar.f6886a) == null)) {
            adView.resume();
        }
        WebView webView = this.f9519x;
        if (webView != null) {
            webView.onResume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f9490C = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f9490C) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f9490C = true;
        C1692config.m8175Y0(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f9519x.saveState(bundle);
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
        this.f9490C = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f9490C = true;
        C1692config.m8175Y0(this);
    }
}
