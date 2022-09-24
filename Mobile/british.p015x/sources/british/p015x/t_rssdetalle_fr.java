package british.p015x;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.C6540C;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

/* renamed from: british.x.t_rssdetalle_fr */
public class t_rssdetalle_fr extends Fragment {

    /* renamed from: m0 */
    C1692config f9821m0;

    /* renamed from: n0 */
    boolean f9822n0 = false;

    /* renamed from: o0 */
    boolean f9823o0 = false;

    /* renamed from: p0 */
    boolean f9824p0 = true;

    /* renamed from: q0 */
    boolean f9825q0 = true;

    /* renamed from: r0 */
    WebView f9826r0;

    /* renamed from: s0 */
    View f9827s0;

    /* renamed from: t0 */
    Bundle f9828t0;

    /* renamed from: u0 */
    FrameLayout f9829u0;

    /* renamed from: v0 */
    LinearLayout f9830v0;

    /* renamed from: w0 */
    WebChromeClient.CustomViewCallback f9831w0;

    /* renamed from: x0 */
    View f9832x0;

    /* renamed from: y0 */
    WebChromeClient f9833y0;

    /* renamed from: british.x.t_rssdetalle_fr$a */
    class C2438a extends WebChromeClient {
        C2438a() {
        }

        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            callback.invoke(str, true, false);
        }

        @TargetApi(11)
        public void onHideCustomView() {
            if (t_rssdetalle_fr.this.mo3443p() != null) {
                if (Build.VERSION.SDK_INT < 16) {
                    t_rssdetalle_fr.this.mo3443p().getWindow().clearFlags(1024);
                } else {
                    t_rssdetalle_fr.this.mo3443p().getWindow().getDecorView().setSystemUiVisibility(0);
                }
                View view = t_rssdetalle_fr.this.f9832x0;
                if (view != null) {
                    view.setVisibility(8);
                    t_rssdetalle_fr t_rssdetalle_fr = t_rssdetalle_fr.this;
                    t_rssdetalle_fr.f9829u0.removeView(t_rssdetalle_fr.f9832x0);
                    t_rssdetalle_fr t_rssdetalle_fr2 = t_rssdetalle_fr.this;
                    t_rssdetalle_fr2.f9832x0 = null;
                    t_rssdetalle_fr2.f9829u0.setVisibility(8);
                    t_rssdetalle_fr.this.f9831w0.onCustomViewHidden();
                    t_rssdetalle_fr.this.f9830v0.setVisibility(0);
                }
            }
        }

        public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        @TargetApi(11)
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            t_rssdetalle_fr t_rssdetalle_fr = t_rssdetalle_fr.this;
            t_rssdetalle_fr.f9831w0 = customViewCallback;
            t_rssdetalle_fr.f9829u0.addView(view);
            t_rssdetalle_fr t_rssdetalle_fr2 = t_rssdetalle_fr.this;
            t_rssdetalle_fr2.f9832x0 = view;
            t_rssdetalle_fr2.f9830v0.setVisibility(8);
            t_rssdetalle_fr.this.f9829u0.setVisibility(0);
            if (Build.VERSION.SDK_INT < 16) {
                t_rssdetalle_fr.this.mo3443p().getWindow().setFlags(1024, 1024);
            } else {
                t_rssdetalle_fr.this.mo3443p().getWindow().getDecorView().setSystemUiVisibility(4);
            }
        }
    }

    /* renamed from: british.x.t_rssdetalle_fr$b */
    class C2439b implements View.OnTouchListener {
        C2439b() {
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

    /* renamed from: british.x.t_rssdetalle_fr$c */
    class C2440c implements DownloadListener {
        C2440c() {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            t_rssdetalle_fr.this.mo3370J1(intent);
        }
    }

    /* renamed from: british.x.t_rssdetalle_fr$d */
    class C2441d extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ ProgressBar f9837a;

        C2441d(ProgressBar progressBar) {
            this.f9837a = progressBar;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f9837a.setVisibility(8);
            if (t_rssdetalle_fr.this.f9825q0) {
                webView.clearHistory();
                t_rssdetalle_fr.this.f9825q0 = false;
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f9837a.setVisibility(0);
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
            String str11 = str;
            String lowerCase = str.toLowerCase();
            String[] strArr = {"doc", "docx", "xls", "xlsx", "ppt", "pptx", "pdf", "pages", "ai", "psd", "tiff", "dxf", "svg", "eps", "ps", "ttf", "otf", "xps", "zip", "rar"};
            int lastIndexOf = str11.lastIndexOf(".");
            if (lastIndexOf != -1) {
                str2 = lowerCase.substring(lastIndexOf);
            } else {
                str2 = "";
            }
            String replace = str2.replace(".", "");
            if (lowerCase.startsWith("tel:") || lowerCase.startsWith("http://tel:")) {
                if (lowerCase.startsWith("tel:")) {
                    str3 = str11.substring(4);
                } else {
                    str3 = str11.substring(11);
                }
                if (str3.endsWith("/")) {
                    str3 = str3.substring(0, str3.length() - 1);
                }
                try {
                    t_rssdetalle_fr.this.mo3370J1(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str3)));
                } catch (Exception unused) {
                }
                return true;
            } else if (lowerCase.startsWith("mailto:") || lowerCase.startsWith("http://mailto:")) {
                if (lowerCase.startsWith("mailto:")) {
                    str4 = str11.substring(7).trim();
                } else {
                    str4 = str11.substring(14).trim();
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
                        intent.putExtra("android.intent.extra.TEXT", str5);
                    }
                    t_rssdetalle_fr t_rssdetalle_fr = t_rssdetalle_fr.this;
                    t_rssdetalle_fr.mo3370J1(Intent.createChooser(intent, t_rssdetalle_fr.mo3380N().getString(R.string.enviar_email)));
                }
                return true;
            } else if (lowerCase.startsWith("smsto:") || lowerCase.startsWith("http://smsto:")) {
                if (lowerCase.startsWith("smsto:")) {
                    str7 = str11.substring(6).trim();
                } else {
                    str7 = str11.substring(13).trim();
                }
                if (!str7.equals("")) {
                    int indexOf4 = str7.indexOf("?");
                    if (indexOf4 > 0) {
                        int indexOf5 = str7.indexOf("?body=");
                        if (indexOf5 != -1) {
                            str8 = str7.substring(indexOf5 + 6).trim();
                        } else {
                            str8 = "";
                        }
                        str7 = str7.substring(0, indexOf4).trim();
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
                        t_rssdetalle_fr.this.mo3370J1(intent2);
                    } catch (Exception unused5) {
                    }
                }
                return true;
            } else if (lowerCase.startsWith("go:") || lowerCase.startsWith("http://go:")) {
                if (lowerCase.startsWith("go:")) {
                    str9 = str11.substring(3);
                } else {
                    str9 = str11.substring(10);
                }
                if (str9.endsWith("/")) {
                    str9 = str9.substring(0, str9.length() - 1);
                }
                try {
                    str9 = URLDecoder.decode(str9, C6540C.UTF8_NAME);
                } catch (Exception unused6) {
                }
                int i = 0;
                while (true) {
                    t_rssdetalle_fr t_rssdetalle_fr2 = t_rssdetalle_fr.this;
                    C1855l[] lVarArr = t_rssdetalle_fr2.f9821m0.f7231O1;
                    if (i >= lVarArr.length) {
                        t_rssdetalle_fr2.f9824p0 = false;
                        return false;
                    } else if (lVarArr[i].f7922i.equalsIgnoreCase(str9)) {
                        t_rssdetalle_fr.this.startActivityForResult(t_rssdetalle_fr.this.f9821m0.mo7475B(Integer.valueOf(i), t_rssdetalle_fr.this.f9827s0.getContext()).f7842a, 0);
                        return true;
                    } else {
                        i++;
                    }
                }
            } else if (lowerCase.startsWith("vnd.youtube:")) {
                int indexOf6 = str11.indexOf("?");
                if (indexOf6 > 0) {
                    str10 = str11.substring(12, indexOf6);
                } else {
                    str10 = str11.substring(12);
                }
                String str12 = "https://www.youtube.com/watch?v=" + str10;
                t_rssdetalle_fr t_rssdetalle_fr3 = t_rssdetalle_fr.this;
                if (t_rssdetalle_fr3.f9823o0) {
                    t_rssdetalle_fr3.f9821m0.mo7497c(t_rssdetalle_fr3.f9827s0.getContext(), str12);
                } else {
                    t_rssdetalle_fr3.f9824p0 = false;
                    t_rssdetalle_fr3.f9826r0.loadUrl(str12);
                }
                return true;
            } else if (lowerCase.endsWith(".mp3")) {
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.setDataAndType(Uri.parse(str), "audio/*");
                webView.getContext().startActivity(intent3);
                return true;
            } else if (lowerCase.endsWith(".mp4") || lowerCase.endsWith(".3gp")) {
                Intent intent4 = new Intent("android.intent.action.VIEW");
                intent4.setDataAndType(Uri.parse(str), "video/*");
                webView.getContext().startActivity(intent4);
                return true;
            } else if (lowerCase.startsWith("upi://")) {
                Intent intent5 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                t_rssdetalle_fr t_rssdetalle_fr4 = t_rssdetalle_fr.this;
                t_rssdetalle_fr4.mo3370J1(Intent.createChooser(intent5, t_rssdetalle_fr4.mo3380N().getString(R.string.selecciona)));
                return true;
            } else if (t_rssdetalle_fr.this.f9823o0 || lowerCase.startsWith("rtsp://") || lowerCase.startsWith("rtmp://") || lowerCase.startsWith("market://") || lowerCase.endsWith(".apk") || lowerCase.startsWith("whatsapp://") || lowerCase.endsWith(".m3u") || lowerCase.endsWith(".m3u8")) {
                t_rssdetalle_fr t_rssdetalle_fr5 = t_rssdetalle_fr.this;
                return t_rssdetalle_fr5.f9821m0.mo7497c(t_rssdetalle_fr5.f9827s0.getContext(), str11);
            } else if (!Arrays.asList(strArr).contains(replace) || lowerCase.contains("docs.google.com")) {
                t_rssdetalle_fr.this.f9824p0 = false;
                return false;
            } else if (!t_rssdetalle_fr.this.f9826r0.getUrl().contains("docs.google.com")) {
                try {
                    str11 = URLEncoder.encode(str11, "utf-8");
                } catch (Exception unused7) {
                }
                t_rssdetalle_fr.this.f9826r0.loadUrl("https://docs.google.com/viewer?embedded=true&url=" + str11);
                t_rssdetalle_fr.this.f9824p0 = false;
                return true;
            } else {
                t_rssdetalle_fr t_rssdetalle_fr6 = t_rssdetalle_fr.this;
                t_rssdetalle_fr6.f9821m0.mo7497c(t_rssdetalle_fr6.f9827s0.getContext(), str11);
                return true;
            }
        }
    }

    @TargetApi(21)
    /* renamed from: P1 */
    private void m8914P1() {
        if (Build.VERSION.SDK_INT > 20) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f9826r0, true);
        }
    }

    /* renamed from: J0 */
    public void mo3369J0() {
        if (this.f9832x0 != null) {
            this.f9833y0.onHideCustomView();
        }
        super.mo3369J0();
        this.f9826r0.onPause();
        if (this.f9822n0 || mo3443p().isFinishing()) {
            try {
                this.f9826r0.loadData("", "text/html", "utf-8");
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: N1 */
    public void mo8942N1(String str) {
        if (this.f9827s0 != null) {
            this.f9824p0 = true;
            this.f9825q0 = true;
            this.f9826r0.loadUrl(str);
        }
    }

    /* renamed from: O0 */
    public void mo3383O0() {
        super.mo3383O0();
        this.f9826r0.onResume();
    }

    /* renamed from: O1 */
    public boolean mo8943O1(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        if (this.f9832x0 != null) {
            this.f9833y0.onHideCustomView();
            return true;
        } else if (this.f9824p0 || !this.f9826r0.canGoBack()) {
            return false;
        } else {
            this.f9826r0.goBack();
            return true;
        }
    }

    /* renamed from: P0 */
    public void mo3385P0(Bundle bundle) {
        super.mo3385P0(bundle);
        WebView webView = this.f9826r0;
        if (webView != null) {
            webView.saveState(bundle);
        }
    }

    /* renamed from: n0 */
    public void mo3435n0(Bundle bundle) {
        super.mo3435n0(bundle);
        if (bundle != null) {
            this.f9826r0.restoreState(bundle);
        } else {
            Bundle bundle2 = this.f9828t0;
            if (!(bundle2 == null || bundle2.getString("url") == null)) {
                this.f9826r0.loadUrl(this.f9828t0.getString("url"));
            }
        }
        this.f9830v0 = (LinearLayout) mo3443p().findViewById(R.id.ll_princ);
        this.f9829u0 = (FrameLayout) mo3443p().findViewById(R.id.target_view);
    }

    /* renamed from: o0 */
    public void mo3438o0(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            mo3443p().setResult(-1, intent);
            mo3443p().finish();
        }
    }

    /* renamed from: x0 */
    public View mo3468x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1692config config = (C1692config) mo3443p().getApplicationContext();
        this.f9821m0 = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        boolean z = false;
        this.f9827s0 = layoutInflater.inflate(R.layout.rssdetalle, viewGroup, false);
        this.f9828t0 = mo3443p().getIntent().getExtras();
        C1692config config2 = this.f9821m0;
        if (config2.f7231O1[config2.f7318d].f7962x == 1) {
            z = true;
        }
        this.f9823o0 = z;
        WebView webView = (WebView) this.f9827s0.findViewById(R.id.webview);
        this.f9826r0 = webView;
        C2438a aVar = new C2438a();
        this.f9833y0 = aVar;
        webView.setWebChromeClient(aVar);
        m8914P1();
        this.f9826r0.getSettings().setBuiltInZoomControls(true);
        this.f9826r0.getSettings().setSupportZoom(true);
        this.f9826r0.getSettings().setDomStorageEnabled(true);
        this.f9826r0.setOnTouchListener(new C2439b());
        this.f9826r0.setDownloadListener(new C2440c());
        C1692config config3 = this.f9821m0;
        if (config3.f7231O1[config3.f7318d].f7850C) {
            this.f9826r0.getSettings().setUseWideViewPort(true);
            this.f9826r0.getSettings().setLoadWithOverviewMode(true);
        }
        ProgressBar progressBar = (ProgressBar) this.f9827s0.findViewById(R.id.pb_url);
        if (Build.VERSION.SDK_INT > 20) {
            C1692config.m8168S0(progressBar, this.f9821m0.f7368l1);
        }
        this.f9826r0.setWebViewClient(new C2441d(progressBar));
        this.f9826r0.getSettings().setJavaScriptEnabled(true);
        this.f9826r0.getSettings().setPluginState(WebSettings.PluginState.ON);
        WebSettings settings = this.f9826r0.getSettings();
        settings.setUserAgentString(this.f9826r0.getSettings().getUserAgentString() + " Vinebre");
        return this.f9827s0;
    }
}
