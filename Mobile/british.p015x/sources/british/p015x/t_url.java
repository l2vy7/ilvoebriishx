package british.p015x;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
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
import android.webkit.PermissionRequest;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import androidx.core.content.C0600b;
import androidx.core.content.FileProvider;
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
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p001a0.C0008a;

/* renamed from: british.x.t_url */
public class t_url extends Activity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    long f9913A;

    /* renamed from: B */
    int f9914B = 0;

    /* renamed from: C */
    int f9915C = -1;

    /* renamed from: D */
    String f9916D;

    /* renamed from: E */
    boolean f9917E = true;

    /* renamed from: F */
    boolean f9918F;

    /* renamed from: G */
    WebView f9919G;

    /* renamed from: H */
    GeolocationPermissions.Callback f9920H;

    /* renamed from: I */
    String f9921I;

    /* renamed from: J */
    String f9922J;

    /* renamed from: K */
    C1603c f9923K;

    /* renamed from: L */
    boolean f9924L = false;

    /* renamed from: M */
    PermissionRequest f9925M;

    /* renamed from: N */
    AlertDialog.Builder f9926N;

    /* renamed from: O */
    String f9927O;

    /* renamed from: P */
    String f9928P;

    /* renamed from: Q */
    String[] f9929Q = {"doc", "docx", "xls", "xlsx", "ppt", "pptx", "pdf", "pages", "ai", "psd", "tiff", "dxf", "svg", "eps", "ps", "ttf", "otf", "xps", "zip", "rar"};

    /* renamed from: R */
    EditText f9930R;

    /* renamed from: S */
    EditText f9931S;

    /* renamed from: T */
    HttpAuthHandler f9932T;

    /* renamed from: U */
    private ValueCallback<Uri> f9933U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public ValueCallback<Uri[]> f9934V;

    /* renamed from: W */
    ListView f9935W;

    /* renamed from: X */
    SwipeRefreshLayout f9936X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public FrameLayout f9937Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public LinearLayout f9938Z;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public WebChromeClient.CustomViewCallback f9939l0;

    /* renamed from: m */
    C1692config f9940m;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public View f9941m0;

    /* renamed from: n */
    Bundle f9942n;

    /* renamed from: n0 */
    private WebChromeClient f9943n0;

    /* renamed from: o */
    boolean f9944o = true;

    /* renamed from: p */
    boolean f9945p = false;

    /* renamed from: q */
    boolean f9946q = true;

    /* renamed from: r */
    boolean f9947r = false;

    /* renamed from: s */
    boolean f9948s = false;

    /* renamed from: t */
    boolean f9949t = false;

    /* renamed from: u */
    boolean f9950u = false;

    /* renamed from: v */
    boolean f9951v = false;

    /* renamed from: w */
    boolean f9952w = false;

    /* renamed from: x */
    boolean f9953x = false;

    /* renamed from: y */
    boolean f9954y = false;

    /* renamed from: z */
    boolean f9955z = false;

    /* renamed from: british.x.t_url$a */
    class C2462a extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f9956a;

        /* renamed from: british.x.t_url$a$a */
        class C2463a extends FullScreenContentCallback {
            C2463a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_url t_url = t_url.this;
                if (t_url.f9924L) {
                    t_url.abrir_secc(t_url.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_url t_url = t_url.this;
                t_url.abrir_secc(t_url.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.x.t_url$a$b */
        class C2464b implements OnUserEarnedRewardListener {
            C2464b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2462a aVar = C2462a.this;
                t_url.this.f9924L = true;
                C1692config.m8175Y0(aVar.f9956a);
            }
        }

        C2462a(Context context) {
            this.f9956a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_url.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2463a());
            rewardedAd.show((Activity) this.f9956a, new C2464b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_url t_url = t_url.this;
            if (!t_url.f9940m.mo7502f(this.f9956a, t_url.f6663i)) {
                t_url.this.f6661g.cancel();
                t_url t_url2 = t_url.this;
                t_url2.abrir_secc(t_url2.f6660f);
            }
        }
    }

    /* renamed from: british.x.t_url$b */
    class C2465b implements AdDisplayListener {
        C2465b() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_url t_url = t_url.this;
            if (t_url.f9924L) {
                t_url.abrir_secc(t_url.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.x.t_url$c */
    class C2466c extends AdColonyInterstitialListener {
        C2466c() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_url t_url = t_url.this;
            if (t_url.f9924L) {
                t_url.abrir_secc(t_url.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_url.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_url.this.f6661g.cancel();
            t_url t_url = t_url.this;
            t_url.abrir_secc(t_url.f6660f);
        }
    }

    /* renamed from: british.x.t_url$d */
    class C2467d implements SearchManager.OnCancelListener {
        C2467d() {
        }

        public void onCancel() {
            t_url t_url = t_url.this;
            t_url.f6657c = false;
            t_url.setResult(0);
        }
    }

    /* renamed from: british.x.t_url$e */
    class C2468e implements SearchManager.OnDismissListener {
        C2468e() {
        }

        public void onDismiss() {
            t_url.this.f6658d = false;
        }
    }

    /* renamed from: british.x.t_url$f */
    class C2469f implements View.OnClickListener {
        C2469f() {
        }

        public void onClick(View view) {
            t_url t_url = t_url.this;
            t_url.f6659e = false;
            t_url.finish();
        }
    }

    /* renamed from: british.x.t_url$g */
    class C2470g implements SwipeRefreshLayout.C1237j {
        C2470g() {
        }

        /* renamed from: a */
        public void mo6090a() {
            t_url.this.f9919G.reload();
        }
    }

    /* renamed from: british.x.t_url$h */
    class C2471h extends WebChromeClient {

        /* renamed from: british.x.t_url$h$a */
        class C2472a extends WebViewClient {
            C2472a() {
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                t_url t_url = t_url.this;
                t_url.f9940m.mo7497c(t_url, str);
                return true;
            }
        }

        C2471h() {
        }

        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(t_url.this);
            webView2.setWebViewClient(new C2472a());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (!C1692config.m8166R0(t_url.this)) {
                return;
            }
            if (C0600b.m3289a(t_url.this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                t_url t_url = t_url.this;
                t_url.f9921I = str;
                t_url.f9920H = callback;
                C0008a.m34p(t_url, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 103);
                return;
            }
            callback.invoke(str, true, false);
        }

        public void onHideCustomView() {
            t_url.this.getWindow().clearFlags(1024);
            if (t_url.this.f9941m0 != null) {
                t_url.this.f9941m0.setVisibility(8);
                t_url.this.f9937Y.removeView(t_url.this.f9941m0);
                t_url.this.f9941m0 = null;
                t_url.this.f9937Y.setVisibility(8);
                t_url.this.f9939l0.onCustomViewHidden();
                t_url.this.f9938Z.setVisibility(0);
            }
        }

        public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        @TargetApi(21)
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            PackageInfo packageInfo;
            Boolean bool;
            boolean z;
            String[] strArr;
            PermissionRequest permissionRequest2 = permissionRequest;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Boolean bool2 = Boolean.FALSE;
            try {
                packageInfo = t_url.this.getPackageManager().getPackageInfo(t_url.this.getPackageName(), 4096);
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                packageInfo = null;
            }
            if (packageInfo == null || (strArr = packageInfo.requestedPermissions) == null) {
                bool = bool2;
            } else {
                List asList = Arrays.asList(strArr);
                Boolean bool3 = (!asList.contains("android.permission.RECORD_AUDIO") || !asList.contains("android.permission.MODIFY_AUDIO_SETTINGS")) ? bool2 : Boolean.TRUE;
                if (asList.contains("android.permission.CAMERA")) {
                    bool2 = Boolean.TRUE;
                }
                bool = bool2;
                bool2 = bool3;
            }
            for (String str : permissionRequest.getResources()) {
                if (str.contains("AUDIO_CAPTURE") && bool2.booleanValue()) {
                    boolean z2 = true;
                    if (C0600b.m3289a(t_url.this, "android.permission.RECORD_AUDIO") != 0) {
                        arrayList2.add("android.permission.RECORD_AUDIO");
                        z = true;
                    } else {
                        z = false;
                    }
                    if (C0600b.m3289a(t_url.this, "android.permission.MODIFY_AUDIO_SETTINGS") != 0) {
                        arrayList2.add("android.permission.MODIFY_AUDIO_SETTINGS");
                    } else {
                        z2 = z;
                    }
                    if (!z2) {
                        arrayList.add(str);
                    }
                } else if (str.contains("VIDEO_CAPTURE") && bool.booleanValue()) {
                    if (C0600b.m3289a(t_url.this, "android.permission.CAMERA") != 0) {
                        arrayList2.add("android.permission.CAMERA");
                    } else {
                        arrayList.add(str);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                t_url t_url = t_url.this;
                t_url.f9925M = permissionRequest2;
                C0008a.m34p(t_url, (String[]) arrayList2.toArray(new String[arrayList2.size()]), 105);
            } else if (!arrayList.isEmpty()) {
                try {
                    permissionRequest2.grant((String[]) arrayList.toArray(new String[arrayList.size()]));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                try {
                    permissionRequest.deny();
                } catch (Exception unused) {
                }
            }
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            t_url.this.f9939l0 = customViewCallback;
            t_url.this.f9937Y.addView(view);
            t_url.this.f9941m0 = view;
            t_url.this.f9938Z.setVisibility(8);
            t_url.this.f9937Y.setVisibility(0);
            t_url.this.getWindow().setFlags(1024, 1024);
        }

        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (t_url.this.f9934V != null) {
                t_url.this.f9934V.onReceiveValue((Object) null);
            }
            t_url.this.f9934V = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            t_url t_url = t_url.this;
            t_url.startActivityForResult(Intent.createChooser(intent, t_url.getResources().getString(R.string.selecciona)), 10);
            return true;
        }
    }

    /* renamed from: british.x.t_url$i */
    class C2473i implements View.OnTouchListener {
        C2473i() {
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

    /* renamed from: british.x.t_url$j */
    class C2474j implements DownloadListener {
        C2474j() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0077 A[SYNTHETIC, Splitter:B:27:0x0077] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onDownloadStart(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, long r7) {
            /*
                r2 = this;
                british.x.t_url r4 = british.p015x.t_url.this
                boolean r4 = r4.f9918F
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
                british.x.t_url r3 = british.p015x.t_url.this
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
                british.x.t_url r4 = british.p015x.t_url.this
                british.x.config r5 = r4.f9940m
                r5.mo7491W(r3, r6, r7, r4)
            L_0x0082:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_url.C2474j.onDownloadStart(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void");
        }
    }

    /* renamed from: british.x.t_url$k */
    class C2475k extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ ProgressBar f9970a;

        /* renamed from: british.x.t_url$k$a */
        class C2476a implements DialogInterface.OnClickListener {
            C2476a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                t_url t_url = t_url.this;
                t_url.f9927O = t_url.f9930R.getText().toString();
                t_url t_url2 = t_url.this;
                t_url2.f9928P = t_url2.f9931S.getText().toString();
                t_url t_url3 = t_url.this;
                t_url3.f9932T.proceed(t_url3.f9927O, t_url3.f9928P);
            }
        }

        /* renamed from: british.x.t_url$k$b */
        class C2477b implements DialogInterface.OnClickListener {
            C2477b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                t_url.this.f9932T.cancel();
            }
        }

        /* renamed from: british.x.t_url$k$c */
        class C2478c implements DialogInterface.OnCancelListener {
            C2478c() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                t_url.this.f9932T.cancel();
            }
        }

        /* renamed from: british.x.t_url$k$d */
        class C2479d implements DialogInterface.OnClickListener {
            C2479d() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        /* renamed from: british.x.t_url$k$e */
        class C2480e implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f9976a;

            C2480e(AlertDialog alertDialog) {
                this.f9976a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                this.f9976a.getButton(-2).setTextColor(C1692config.f7101A5);
            }
        }

        /* renamed from: british.x.t_url$k$f */
        class C2481f extends WebViewClient {

            /* renamed from: a */
            final /* synthetic */ ProgressBar f9978a;

            C2481f(ProgressBar progressBar) {
                this.f9978a = progressBar;
            }

            public void onPageFinished(WebView webView, String str) {
                if (str.startsWith(C1692config.f7107G5 + "games-scores.e-droid.net")) {
                    this.f9978a.setVisibility(8);
                }
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (!str.startsWith("http://perfilajeno/") && !str.startsWith("https://perfilajeno/")) {
                    return false;
                }
                Intent k = t_url.this.mo9004k(str);
                if (t_url.this.f9952w) {
                    k.putExtra("desde_game_2", true);
                }
                t_url.this.startActivityForResult(k, 0);
                return true;
            }
        }

        /* renamed from: british.x.t_url$k$g */
        class C2482g implements DialogInterface.OnClickListener {
            C2482g() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        /* renamed from: british.x.t_url$k$h */
        class C2483h implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f9981a;

            C2483h(AlertDialog alertDialog) {
                this.f9981a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                this.f9981a.getButton(-2).setTextColor(C1692config.f7101A5);
            }
        }

        C2475k(ProgressBar progressBar) {
            this.f9970a = progressBar;
        }

        public void onPageFinished(WebView webView, String str) {
            this.f9970a.setVisibility(8);
            t_url.this.f9936X.setRefreshing(false);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            boolean z;
            boolean z2;
            t_url t_url = t_url.this;
            if (!t_url.f6657c && !t_url.isFinishing() && !t_url.this.f9942n.getString("url").contains("youtube.com") && !t_url.this.f9942n.getString("url").contains("youtu.be")) {
                t_url t_url2 = t_url.this;
                if (t_url2.f9917E) {
                    Bundle bundle = t_url2.f9942n;
                    z = true;
                    z2 = bundle != null && bundle.containsKey("ad_entrar");
                    Bundle bundle2 = t_url.this.f9942n;
                    if (bundle2 == null || !bundle2.containsKey("fb_entrar")) {
                        z = false;
                    }
                    t_url.this.f9917E = false;
                } else {
                    z2 = false;
                    z = false;
                }
                t_url t_url3 = t_url.this;
                if (!t_url3.f9954y && !t_url3.f9952w) {
                    t_url3.f9940m.mo7504g1(t_url3, z2, z, false);
                }
            }
            t_url t_url4 = t_url.this;
            if (t_url4.f9946q && !t_url4.f9936X.mo6049h()) {
                this.f9970a.setVisibility(0);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (!C1692config.m8205x0(t_url.this)) {
                if (!t_url.this.f9940m.f7323d5.equals("")) {
                    String str3 = t_url.this.f9940m.f7323d5;
                    if (!str3.toLowerCase(Locale.getDefault()).contains("<html")) {
                        str3 = "<html><head><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"></head><body>" + str3 + "</body></html>";
                    }
                    t_url.this.f9919G.loadData(str3, "text/html; charset=utf-8", "utf-8");
                } else {
                    t_url.this.f9919G.loadData("<html><head><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"></head><body>" + t_url.this.getResources().getString(R.string.wv_sinconex) + "</body></html>", "text/html; charset=utf-8", "utf-8");
                }
                t_url.this.f9919G.clearHistory();
                t_url.this.f9949t = true;
            }
        }

        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            t_url t_url = t_url.this;
            t_url.f9932T = httpAuthHandler;
            t_url.f9926N = new AlertDialog.Builder(t_url.this);
            t_url t_url2 = t_url.this;
            t_url2.f9926N.setTitle(t_url2.getResources().getString(R.string.chat_acceso));
            View inflate = t_url.this.getLayoutInflater().inflate(R.layout.usucontra, (ViewGroup) null);
            t_url.this.f9930R = (EditText) inflate.findViewById(R.id.et_usu);
            t_url.this.f9931S = (EditText) inflate.findViewById(R.id.et_contra);
            t_url.this.f9926N.setView(inflate);
            t_url.this.f9926N.setCancelable(true);
            t_url t_url3 = t_url.this;
            t_url3.f9926N.setPositiveButton(t_url3.getString(R.string.aceptar), new C2476a());
            t_url t_url4 = t_url.this;
            t_url4.f9926N.setNegativeButton(t_url4.getString(R.string.cancelar), new C2477b());
            t_url.this.f9926N.setOnCancelListener(new C2478c());
            t_url.this.f9926N.create().show();
        }

        /* JADX WARNING: Removed duplicated region for block: B:177:0x0450  */
        /* JADX WARNING: Removed duplicated region for block: B:179:0x045b A[SYNTHETIC, Splitter:B:179:0x045b] */
        /* JADX WARNING: Removed duplicated region for block: B:183:0x0461 A[SYNTHETIC, Splitter:B:183:0x0461] */
        /* JADX WARNING: Removed duplicated region for block: B:206:0x04ba  */
        /* JADX WARNING: Removed duplicated region for block: B:248:0x0554  */
        /* JADX WARNING: Removed duplicated region for block: B:269:0x05f6  */
        /* JADX WARNING: Removed duplicated region for block: B:386:0x0600 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r19, java.lang.String r20) {
            /*
                r18 = this;
                r0 = r18
                r1 = r20
                british.x.t_url r2 = british.p015x.t_url.this
                boolean r3 = r2.f9954y
                java.lang.String r4 = "android.intent.action.VIEW"
                r5 = 0
                r6 = 1
                if (r3 == 0) goto L_0x003a
                java.lang.String r2 = "http://wallkit.instal.com"
                boolean r2 = r1.startsWith(r2)
                if (r2 != 0) goto L_0x0039
                java.lang.String r2 = "https://wallkit.instal.com"
                boolean r2 = r1.startsWith(r2)
                if (r2 == 0) goto L_0x001f
                goto L_0x0039
            L_0x001f:
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                r2.setAction(r4)
                android.net.Uri r1 = android.net.Uri.parse(r20)
                r2.setData(r1)
                r1 = 268435456(0x10000000, float:2.5243549E-29)
                r2.addFlags(r1)
                british.x.t_url r1 = british.p015x.t_url.this
                r1.startActivity(r2)
                return r6
            L_0x0039:
                return r5
            L_0x003a:
                boolean r2 = r2.f9952w
                if (r2 == 0) goto L_0x0056
                java.lang.String r2 = "https://showad"
                boolean r2 = r1.startsWith(r2)
                if (r2 == 0) goto L_0x0056
                british.x.t_url r8 = british.p015x.t_url.this
                british.x.config r7 = r8.f9940m
                int r1 = r7.f7398p3
                if (r1 <= 0) goto L_0x0055
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 1
                r7.mo7506h1(r8, r9, r10, r11, r12)
            L_0x0055:
                return r6
            L_0x0056:
                british.x.t_url r2 = british.p015x.t_url.this
                boolean r3 = r2.f9952w
                r7 = 0
                if (r3 != 0) goto L_0x0061
                boolean r2 = r2.f9950u
                if (r2 == 0) goto L_0x01da
            L_0x0061:
                if (r3 == 0) goto L_0x006b
                java.lang.String r2 = "https://moregames"
                boolean r2 = r1.startsWith(r2)
                if (r2 != 0) goto L_0x0079
            L_0x006b:
                british.x.t_url r2 = british.p015x.t_url.this
                boolean r2 = r2.f9950u
                if (r2 == 0) goto L_0x01da
                java.lang.String r2 = "https://quiz_tableclasif"
                boolean r2 = r1.startsWith(r2)
                if (r2 == 0) goto L_0x01da
            L_0x0079:
                android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
                british.x.t_url r2 = british.p015x.t_url.this
                r1.<init>(r2)
                british.x.t_url r2 = british.p015x.t_url.this
                boolean r2 = british.p015x.C1692config.m8205x0(r2)
                r3 = 2131820671(0x7f11007f, float:1.9274064E38)
                if (r2 == 0) goto L_0x0199
                british.x.t_url r2 = british.p015x.t_url.this
                british.x.config r4 = r2.f9940m
                british.x.l[] r5 = r4.f7231O1
                int r4 = r4.f7318d
                r4 = r5[r4]
                boolean r4 = r4.f7930k1
                if (r4 == 0) goto L_0x0199
                android.view.LayoutInflater r2 = r2.getLayoutInflater()
                r4 = 2131558701(0x7f0d012d, float:1.8742725E38)
                android.view.View r2 = r2.inflate(r4, r7)
                r4 = 2131363248(0x7f0a05b0, float:1.83463E38)
                android.view.View r4 = r2.findViewById(r4)
                android.webkit.WebView r4 = (android.webkit.WebView) r4
                android.webkit.WebSettings r5 = r4.getSettings()
                java.lang.String r7 = "Android Vinebre Software"
                r5.setUserAgentString(r7)
                android.webkit.WebSettings r5 = r4.getSettings()
                r5.setJavaScriptEnabled(r6)
                android.webkit.WebSettings r5 = r4.getSettings()
                android.webkit.WebSettings$PluginState r7 = android.webkit.WebSettings.PluginState.ON
                r5.setPluginState(r7)
                android.webkit.WebSettings r5 = r4.getSettings()
                r5.setUseWideViewPort(r6)
                android.webkit.WebSettings r5 = r4.getSettings()
                r5.setLoadWithOverviewMode(r6)
                r5 = 2131362781(0x7f0a03dd, float:1.8345352E38)
                android.view.View r5 = r2.findViewById(r5)
                android.widget.ProgressBar r5 = (android.widget.ProgressBar) r5
                int r7 = android.os.Build.VERSION.SDK_INT
                r8 = 20
                if (r7 <= r8) goto L_0x00ec
                british.x.t_url r7 = british.p015x.t_url.this
                british.x.config r7 = r7.f9940m
                java.lang.String r7 = r7.f7368l1
                british.p015x.C1692config.m8168S0(r5, r7)
            L_0x00ec:
                british.x.t_url$k$d r7 = new british.x.t_url$k$d
                r7.<init>()
                r1.setNegativeButton(r3, r7)
                android.app.AlertDialog r1 = r1.create()
                british.x.t_url$k$e r3 = new british.x.t_url$k$e
                r3.<init>(r1)
                r1.setOnShowListener(r3)
                british.x.t_url$k$f r3 = new british.x.t_url$k$f
                r3.<init>(r5)
                r4.setWebViewClient(r3)
                r1.setView(r2)
                r1.show()
                british.x.t_url r1 = british.p015x.t_url.this
                boolean r1 = r1.f9952w
                java.lang.String r2 = "&c="
                java.lang.String r3 = "&idusu="
                if (r1 == 0) goto L_0x015f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r5 = british.p015x.C1692config.f7107G5
                r1.append(r5)
                java.lang.String r5 = "games-scores.e-droid.net/srv/game_leaderboard.php?ids="
                r1.append(r5)
                british.x.t_url r5 = british.p015x.t_url.this
                british.x.config r5 = r5.f9940m
                british.x.l[] r7 = r5.f7231O1
                int r5 = r5.f7318d
                r5 = r7[r5]
                int r5 = r5.f7964y
                r1.append(r5)
                r1.append(r3)
                british.x.t_url r3 = british.p015x.t_url.this
                long r7 = r3.f9913A
                r1.append(r7)
                r1.append(r2)
                british.x.t_url r2 = british.p015x.t_url.this
                java.lang.String r2 = r2.f9916D
                r1.append(r2)
                java.lang.String r2 = "&idgame="
                r1.append(r2)
                british.x.t_url r2 = british.p015x.t_url.this
                java.lang.String r2 = r2.f9922J
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r4.loadUrl(r1)
                goto L_0x01d9
            L_0x015f:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r5 = british.p015x.C1692config.f7107G5
                r1.append(r5)
                java.lang.String r5 = "games-scores.e-droid.net/srv/quiz_leaderboard.php?idq="
                r1.append(r5)
                british.x.t_url r5 = british.p015x.t_url.this
                british.x.config r5 = r5.f9940m
                british.x.l[] r7 = r5.f7231O1
                int r5 = r5.f7318d
                r5 = r7[r5]
                int r5 = r5.f7964y
                r1.append(r5)
                r1.append(r3)
                british.x.t_url r3 = british.p015x.t_url.this
                long r7 = r3.f9913A
                r1.append(r7)
                r1.append(r2)
                british.x.t_url r2 = british.p015x.t_url.this
                java.lang.String r2 = r2.f9916D
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r4.loadUrl(r1)
                goto L_0x01d9
            L_0x0199:
                british.x.t_url r2 = british.p015x.t_url.this
                boolean r2 = british.p015x.C1692config.m8205x0(r2)
                if (r2 == 0) goto L_0x01b2
                british.x.t_url r2 = british.p015x.t_url.this
                android.content.res.Resources r2 = r2.getResources()
                r4 = 2131821063(0x7f110207, float:1.9274859E38)
                java.lang.String r2 = r2.getString(r4)
                r1.setMessage(r2)
                goto L_0x01c2
            L_0x01b2:
                british.x.t_url r2 = british.p015x.t_url.this
                android.content.res.Resources r2 = r2.getResources()
                r4 = 2131821108(0x7f110234, float:1.927495E38)
                java.lang.String r2 = r2.getString(r4)
                r1.setMessage(r2)
            L_0x01c2:
                british.x.t_url$k$g r2 = new british.x.t_url$k$g
                r2.<init>()
                r1.setNegativeButton(r3, r2)
                android.app.AlertDialog r1 = r1.create()
                british.x.t_url$k$h r2 = new british.x.t_url$k$h
                r2.<init>(r1)
                r1.setOnShowListener(r2)
                r1.show()
            L_0x01d9:
                return r6
            L_0x01da:
                java.lang.String r2 = r20.toLowerCase()
                java.lang.String r3 = "."
                int r8 = r1.lastIndexOf(r3)
                r9 = -1
                java.lang.String r10 = ""
                if (r8 == r9) goto L_0x01ee
                java.lang.String r8 = r2.substring(r8)
                goto L_0x01ef
            L_0x01ee:
                r8 = r10
            L_0x01ef:
                java.lang.String r3 = r8.replace(r3, r10)
                java.lang.String r8 = "http://perfilajeno/"
                boolean r8 = r2.startsWith(r8)
                if (r8 != 0) goto L_0x0815
                java.lang.String r8 = "https://perfilajeno/"
                boolean r8 = r2.startsWith(r8)
                if (r8 == 0) goto L_0x0205
                goto L_0x0815
            L_0x0205:
                java.lang.String r8 = "http://perfilpropio/?desdeforo"
                boolean r8 = r2.startsWith(r8)
                if (r8 != 0) goto L_0x07eb
                java.lang.String r8 = "https://perfilpropio/?desdeforo"
                boolean r8 = r2.startsWith(r8)
                if (r8 == 0) goto L_0x0217
                goto L_0x07eb
            L_0x0217:
                java.lang.String r8 = "https://closethis"
                boolean r8 = r2.startsWith(r8)
                if (r8 == 0) goto L_0x0225
                british.x.t_url r1 = british.p015x.t_url.this
                r1.finish()
                return r6
            L_0x0225:
                java.lang.String r8 = "tel:"
                boolean r11 = r2.startsWith(r8)
                java.lang.String r12 = "/"
                if (r11 != 0) goto L_0x07aa
                java.lang.String r11 = "http://tel:"
                boolean r11 = r2.startsWith(r11)
                if (r11 == 0) goto L_0x0239
                goto L_0x07aa
            L_0x0239:
                java.lang.String r8 = "mailto:"
                boolean r11 = r2.startsWith(r8)
                java.lang.String r13 = "android.intent.action.SENDTO"
                java.lang.String r14 = "?"
                java.lang.String r15 = "UTF-8"
                if (r11 != 0) goto L_0x06fb
                java.lang.String r11 = "http://mailto:"
                boolean r11 = r2.startsWith(r11)
                if (r11 == 0) goto L_0x0251
                goto L_0x06fb
            L_0x0251:
                java.lang.String r8 = "smsto:"
                boolean r11 = r2.startsWith(r8)
                if (r11 != 0) goto L_0x067c
                java.lang.String r11 = "http://smsto:"
                boolean r11 = r2.startsWith(r11)
                if (r11 == 0) goto L_0x0263
                goto L_0x067c
            L_0x0263:
                java.lang.String r8 = "action_"
                boolean r8 = r2.startsWith(r8)
                java.lang.String r11 = "es_root"
                if (r8 != 0) goto L_0x0617
                java.lang.String r8 = "http://action_"
                boolean r8 = r2.startsWith(r8)
                if (r8 == 0) goto L_0x0277
                goto L_0x0617
            L_0x0277:
                java.lang.String r8 = "intent://"
                boolean r8 = r2.startsWith(r8)
                if (r8 != 0) goto L_0x0601
                java.lang.String r8 = "wvc-x-callback://"
                boolean r8 = r2.startsWith(r8)
                if (r8 == 0) goto L_0x0289
                goto L_0x0601
            L_0x0289:
                java.lang.String r7 = "go:"
                boolean r8 = r2.startsWith(r7)
                java.lang.String r9 = "http://go:"
                r13 = 12
                if (r8 != 0) goto L_0x041d
                boolean r8 = r2.startsWith(r9)
                if (r8 != 0) goto L_0x041d
                java.lang.String r8 = "goid:"
                boolean r8 = r2.startsWith(r8)
                if (r8 != 0) goto L_0x041d
                java.lang.String r8 = "http://goid:"
                boolean r8 = r2.startsWith(r8)
                if (r8 == 0) goto L_0x02ad
                goto L_0x041d
            L_0x02ad:
                java.lang.String r7 = "vnd.youtube:"
                boolean r7 = r2.startsWith(r7)
                if (r7 == 0) goto L_0x02e7
                int r2 = r1.indexOf(r14)
                if (r2 <= 0) goto L_0x02c0
                java.lang.String r1 = r1.substring(r13, r2)
                goto L_0x02c4
            L_0x02c0:
                java.lang.String r1 = r1.substring(r13)
            L_0x02c4:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "https://www.youtube.com/watch?v="
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                british.x.t_url r2 = british.p015x.t_url.this
                int r3 = r2.f9914B
                if (r3 != r6) goto L_0x02e1
                british.x.config r3 = r2.f9940m
                r3.mo7497c(r2, r1)
                goto L_0x02e6
            L_0x02e1:
                android.webkit.WebView r2 = r2.f9919G
                r2.loadUrl(r1)
            L_0x02e6:
                return r6
            L_0x02e7:
                british.x.t_url r7 = british.p015x.t_url.this
                boolean r7 = r7.f9918F
                if (r7 == 0) goto L_0x0305
                java.lang.String r7 = ".mp3"
                boolean r7 = r2.endsWith(r7)
                if (r7 != 0) goto L_0x02fd
                java.lang.String r7 = ".mp4"
                boolean r7 = r2.endsWith(r7)
                if (r7 == 0) goto L_0x0305
            L_0x02fd:
                british.x.t_url r2 = british.p015x.t_url.this
                british.x.config r3 = r2.f9940m
                r3.mo7491W(r1, r10, r10, r2)
                return r6
            L_0x0305:
                british.x.t_url r7 = british.p015x.t_url.this
                boolean r7 = r7.f9918F
                if (r7 != 0) goto L_0x0329
                java.lang.String r7 = ".mp3"
                boolean r7 = r2.endsWith(r7)
                if (r7 == 0) goto L_0x0329
                android.content.Intent r2 = new android.content.Intent
                r2.<init>(r4)
                android.net.Uri r1 = android.net.Uri.parse(r20)
                java.lang.String r3 = "audio/*"
                r2.setDataAndType(r1, r3)
                android.content.Context r1 = r19.getContext()
                r1.startActivity(r2)
                return r6
            L_0x0329:
                british.x.t_url r7 = british.p015x.t_url.this
                boolean r7 = r7.f9918F
                if (r7 != 0) goto L_0x0355
                java.lang.String r7 = ".mp4"
                boolean r7 = r2.endsWith(r7)
                if (r7 != 0) goto L_0x033f
                java.lang.String r7 = ".3gp"
                boolean r7 = r2.endsWith(r7)
                if (r7 == 0) goto L_0x0355
            L_0x033f:
                android.content.Intent r2 = new android.content.Intent
                r2.<init>(r4)
                android.net.Uri r1 = android.net.Uri.parse(r20)
                java.lang.String r3 = "video/*"
                r2.setDataAndType(r1, r3)
                android.content.Context r1 = r19.getContext()
                r1.startActivity(r2)
                return r6
            L_0x0355:
                java.lang.String r7 = "upi://"
                boolean r7 = r2.startsWith(r7)
                if (r7 == 0) goto L_0x037b
                android.net.Uri r1 = android.net.Uri.parse(r20)
                android.content.Intent r2 = new android.content.Intent
                r2.<init>(r4, r1)
                british.x.t_url r1 = british.p015x.t_url.this
                android.content.res.Resources r3 = r1.getResources()
                r4 = 2131821054(0x7f1101fe, float:1.927484E38)
                java.lang.String r3 = r3.getString(r4)
                android.content.Intent r2 = android.content.Intent.createChooser(r2, r3)
                r1.startActivity(r2)
                return r6
            L_0x037b:
                british.x.t_url r4 = british.p015x.t_url.this
                int r4 = r4.f9914B
                if (r4 == r6) goto L_0x0414
                java.lang.String r4 = "rtsp://"
                boolean r4 = r2.startsWith(r4)
                if (r4 != 0) goto L_0x0414
                java.lang.String r4 = "rtmp://"
                boolean r4 = r2.startsWith(r4)
                if (r4 != 0) goto L_0x0414
                java.lang.String r4 = "market://"
                boolean r4 = r2.startsWith(r4)
                if (r4 != 0) goto L_0x0414
                java.lang.String r4 = "whatsapp://"
                boolean r4 = r2.startsWith(r4)
                if (r4 != 0) goto L_0x0414
                java.lang.String r4 = ".m3u"
                boolean r4 = r2.endsWith(r4)
                if (r4 != 0) goto L_0x0414
                java.lang.String r4 = ".m3u8"
                boolean r4 = r2.endsWith(r4)
                if (r4 != 0) goto L_0x0414
                java.lang.String r4 = "http://www.appcreator24.com/open"
                boolean r4 = r2.startsWith(r4)
                if (r4 != 0) goto L_0x0414
                java.lang.String r4 = "https://www.appcreator24.com/open"
                boolean r4 = r2.startsWith(r4)
                if (r4 == 0) goto L_0x03c2
                goto L_0x0414
            L_0x03c2:
                british.x.t_url r4 = british.p015x.t_url.this
                boolean r7 = r4.f9918F
                if (r7 != 0) goto L_0x0413
                java.lang.String[] r4 = r4.f9929Q
                java.util.List r4 = java.util.Arrays.asList(r4)
                boolean r3 = r4.contains(r3)
                if (r3 == 0) goto L_0x0413
                java.lang.String r3 = "docs.google.com"
                boolean r2 = r2.contains(r3)
                if (r2 != 0) goto L_0x0413
                british.x.t_url r2 = british.p015x.t_url.this
                android.webkit.WebView r2 = r2.f9919G
                java.lang.String r2 = r2.getUrl()
                java.lang.String r3 = "docs.google.com"
                boolean r2 = r2.contains(r3)
                if (r2 != 0) goto L_0x040b
                java.lang.String r2 = "utf-8"
                java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch:{ Exception -> 0x03f2 }
            L_0x03f2:
                british.x.t_url r2 = british.p015x.t_url.this
                android.webkit.WebView r2 = r2.f9919G
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "https://docs.google.com/viewer?embedded=true&url="
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.loadUrl(r1)
                return r6
            L_0x040b:
                british.x.t_url r2 = british.p015x.t_url.this
                british.x.config r3 = r2.f9940m
                r3.mo7497c(r2, r1)
                return r6
            L_0x0413:
                return r5
            L_0x0414:
                british.x.t_url r2 = british.p015x.t_url.this
                british.x.config r3 = r2.f9940m
                boolean r1 = r3.mo7497c(r2, r1)
                return r1
            L_0x041d:
                boolean r3 = r2.startsWith(r7)
                if (r3 == 0) goto L_0x042a
                r2 = 3
                java.lang.String r1 = r1.substring(r2)
            L_0x0428:
                r2 = 0
                goto L_0x044a
            L_0x042a:
                boolean r3 = r2.startsWith(r9)
                if (r3 == 0) goto L_0x0437
                r2 = 10
                java.lang.String r1 = r1.substring(r2)
                goto L_0x0428
            L_0x0437:
                java.lang.String r3 = "goid:"
                boolean r2 = r2.startsWith(r3)
                if (r2 == 0) goto L_0x0445
                r2 = 5
                java.lang.String r1 = r1.substring(r2)
                goto L_0x0449
            L_0x0445:
                java.lang.String r1 = r1.substring(r13)
            L_0x0449:
                r2 = 1
            L_0x044a:
                boolean r3 = r1.endsWith(r12)
                if (r3 == 0) goto L_0x0459
                int r3 = r1.length()
                int r3 = r3 - r6
                java.lang.String r1 = r1.substring(r5, r3)
            L_0x0459:
                if (r2 != 0) goto L_0x0461
                java.lang.String r1 = java.net.URLDecoder.decode(r1, r15)     // Catch:{ Exception -> 0x045f }
            L_0x045f:
                r3 = 0
                goto L_0x04b0
            L_0x0461:
                int r3 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x0466 }
                goto L_0x0467
            L_0x0466:
                r3 = 0
            L_0x0467:
                if (r3 != 0) goto L_0x04b0
                british.x.t_url r1 = british.p015x.t_url.this
                r1.f6657c = r6
                boolean r1 = r1.f6659e
                if (r1 == 0) goto L_0x04a8
                r1 = 0
                r2 = 0
            L_0x0473:
                if (r1 != 0) goto L_0x0489
                british.x.t_url r3 = british.p015x.t_url.this
                british.x.config r3 = r3.f9940m
                british.x.l[] r3 = r3.f7231O1
                int r4 = r3.length
                if (r2 >= r4) goto L_0x0489
                r3 = r3[r2]
                boolean r3 = r3.f7848B
                if (r3 != 0) goto L_0x0486
                r1 = 1
                goto L_0x0473
            L_0x0486:
                int r2 = r2 + 1
                goto L_0x0473
            L_0x0489:
                if (r1 != 0) goto L_0x048c
                r2 = 0
            L_0x048c:
                british.x.t_url r1 = british.p015x.t_url.this
                british.x.config r1 = r1.f9940m
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                british.x.t_url r3 = british.p015x.t_url.this
                british.x.j r1 = r1.mo7475B(r2, r3)
                android.content.Intent r2 = r1.f7842a
                r2.putExtra(r11, r6)
                british.x.t_url r2 = british.p015x.t_url.this
                r2.f6659e = r5
                android.content.Intent r1 = r1.f7842a
                r2.startActivity(r1)
            L_0x04a8:
                british.x.t_url r1 = british.p015x.t_url.this
                r1.f6659e = r5
                r1.finish()
                return r6
            L_0x04b0:
                r4 = 0
            L_0x04b1:
                british.x.t_url r7 = british.p015x.t_url.this
                british.x.config r7 = r7.f9940m
                british.x.l[] r7 = r7.f7231O1
                int r8 = r7.length
                if (r4 >= r8) goto L_0x0600
                if (r2 != 0) goto L_0x04c6
                r7 = r7[r4]
                java.lang.String r7 = r7.f7922i
                boolean r7 = r7.equalsIgnoreCase(r1)
                if (r7 != 0) goto L_0x04d4
            L_0x04c6:
                if (r2 == 0) goto L_0x05fc
                british.x.t_url r7 = british.p015x.t_url.this
                british.x.config r7 = r7.f9940m
                british.x.l[] r7 = r7.f7231O1
                r7 = r7[r4]
                int r7 = r7.f7964y
                if (r7 != r3) goto L_0x05fc
            L_0x04d4:
                british.x.t_url r1 = british.p015x.t_url.this
                british.x.config r1 = r1.f9940m
                java.lang.String r1 = r1.f7251R3
                if (r1 == 0) goto L_0x04e2
                boolean r1 = r1.equals(r10)
                if (r1 == 0) goto L_0x0554
            L_0x04e2:
                british.x.t_url r1 = british.p015x.t_url.this
                british.x.config r1 = r1.f9940m
                java.lang.String r1 = r1.f7281W3
                if (r1 == 0) goto L_0x04f0
                boolean r1 = r1.equals(r10)
                if (r1 == 0) goto L_0x0554
            L_0x04f0:
                british.x.t_url r1 = british.p015x.t_url.this
                british.x.config r1 = r1.f9940m
                java.lang.String r1 = r1.f7250R2
                if (r1 == 0) goto L_0x04fe
                boolean r1 = r1.equals(r10)
                if (r1 == 0) goto L_0x0554
            L_0x04fe:
                british.x.t_url r1 = british.p015x.t_url.this
                british.x.config r1 = r1.f9940m
                java.lang.String r1 = r1.f7245Q3
                if (r1 == 0) goto L_0x050c
                boolean r1 = r1.equals(r10)
                if (r1 == 0) goto L_0x0554
            L_0x050c:
                british.x.t_url r1 = british.p015x.t_url.this
                british.x.config r1 = r1.f9940m
                java.lang.String r1 = r1.f7269U3
                if (r1 == 0) goto L_0x051a
                boolean r1 = r1.equals(r10)
                if (r1 == 0) goto L_0x0554
            L_0x051a:
                british.x.t_url r1 = british.p015x.t_url.this
                british.x.config r1 = r1.f9940m
                java.lang.String r1 = r1.f7275V3
                if (r1 == 0) goto L_0x0528
                boolean r1 = r1.equals(r10)
                if (r1 == 0) goto L_0x0554
            L_0x0528:
                british.x.t_url r1 = british.p015x.t_url.this
                british.x.config r1 = r1.f9940m
                java.lang.String r1 = r1.f7358j4
                if (r1 == 0) goto L_0x0536
                boolean r1 = r1.equals(r10)
                if (r1 == 0) goto L_0x0554
            L_0x0536:
                british.x.t_url r1 = british.p015x.t_url.this
                british.x.config r1 = r1.f9940m
                java.lang.String r1 = r1.f7287X3
                if (r1 == 0) goto L_0x0544
                boolean r1 = r1.equals(r10)
                if (r1 == 0) goto L_0x0554
            L_0x0544:
                british.x.t_url r1 = british.p015x.t_url.this
                british.x.config r1 = r1.f9940m
                java.lang.String r1 = r1.f7293Y3
                if (r1 == 0) goto L_0x05f6
                boolean r1 = r1.equals(r10)
                if (r1 == 0) goto L_0x0554
                goto L_0x05f6
            L_0x0554:
                british.x.t_url r1 = british.p015x.t_url.this
                british.x.config r1 = r1.f9940m
                java.lang.String r1 = r1.f7251R3
                if (r1 == 0) goto L_0x0571
                boolean r1 = r1.equals(r10)
                if (r1 != 0) goto L_0x0571
                british.x.t_url r1 = british.p015x.t_url.this
                com.appnext.ads.fullscreen.RewardedVideo r3 = new com.appnext.ads.fullscreen.RewardedVideo
                british.x.t_url r5 = british.p015x.t_url.this
                british.x.config r7 = r5.f9940m
                java.lang.String r7 = r7.f7251R3
                r3.<init>((android.content.Context) r5, (java.lang.String) r7)
                r1.f6663i = r3
            L_0x0571:
                british.x.t_url r1 = british.p015x.t_url.this
                british.x.config r1 = r1.f9940m
                java.lang.String r1 = r1.f7245Q3
                if (r1 == 0) goto L_0x057c
                r1.equals(r10)
            L_0x057c:
                british.x.t_url r1 = british.p015x.t_url.this
                british.x.config r1 = r1.f9940m
                java.lang.String r1 = r1.f7269U3
                if (r1 == 0) goto L_0x0597
                boolean r1 = r1.equals(r10)
                if (r1 != 0) goto L_0x0597
                british.x.t_url r1 = british.p015x.t_url.this
                com.facebook.ads.RewardedVideoAd r3 = new com.facebook.ads.RewardedVideoAd
                british.x.config r5 = r1.f9940m
                java.lang.String r5 = r5.f7269U3
                r3.<init>(r1, r5)
                r1.f6664j = r3
            L_0x0597:
                british.x.t_url r1 = british.p015x.t_url.this
                british.x.config r1 = r1.f9940m
                java.lang.String r1 = r1.f7275V3
                if (r1 == 0) goto L_0x05ae
                boolean r1 = r1.equals(r10)
                if (r1 != 0) goto L_0x05ae
                british.x.t_url r1 = british.p015x.t_url.this
                com.startapp.sdk.adsbase.StartAppAd r3 = new com.startapp.sdk.adsbase.StartAppAd
                r3.<init>(r1)
                r1.f6665k = r3
            L_0x05ae:
                british.x.t_url r1 = british.p015x.t_url.this
                android.app.ProgressDialog r3 = new android.app.ProgressDialog
                british.x.t_url r5 = british.p015x.t_url.this
                r3.<init>(r5)
                r1.f6661g = r3
                android.view.View r9 = new android.view.View
                british.x.t_url r1 = british.p015x.t_url.this
                r9.<init>(r1)
                r9.setId(r4)
                r1 = 2131361812(0x7f0a0014, float:1.8343387E38)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r9.setTag(r1, r3)
                british.x.t_url r8 = british.p015x.t_url.this
                r1 = 0
                r8.f6660f = r1
                r8.f9915C = r4
                r8.f9955z = r2
                british.x.config r7 = r8.f9940m
                java.lang.String r10 = r8.f6656b
                android.app.ProgressDialog r11 = r8.f6661g
                com.google.android.gms.ads.rewarded.RewardedAdLoadCallback r12 = r8.f6662h
                com.appnext.ads.fullscreen.RewardedVideo r13 = r8.f6663i
                com.facebook.ads.RewardedVideoAd r14 = r8.f6664j
                com.startapp.sdk.adsbase.StartAppAd r15 = r8.f6665k
                com.adcolony.sdk.AdColonyInterstitialListener r3 = r8.f6666l
                r16 = r3
                r17 = r1
                boolean r1 = r7.mo7494Z0(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                if (r1 != 0) goto L_0x05fb
                british.x.t_url r1 = british.p015x.t_url.this
                r1.mo9003i(r4, r2)
                goto L_0x05fb
            L_0x05f6:
                british.x.t_url r1 = british.p015x.t_url.this
                r1.mo9003i(r4, r2)
            L_0x05fb:
                return r6
            L_0x05fc:
                int r4 = r4 + 1
                goto L_0x04b1
            L_0x0600:
                return r5
            L_0x0601:
                android.content.Intent r1 = android.content.Intent.parseUri(r1, r6)     // Catch:{ Exception -> 0x0616 }
                java.lang.String r2 = "android.intent.category.BROWSABLE"
                r1.addCategory(r2)     // Catch:{ Exception -> 0x0616 }
                r1.setComponent(r7)     // Catch:{ Exception -> 0x0616 }
                r1.setSelector(r7)     // Catch:{ Exception -> 0x0616 }
                british.x.t_url r2 = british.p015x.t_url.this     // Catch:{ Exception -> 0x0616 }
                r2.startActivity(r1)     // Catch:{ Exception -> 0x0616 }
                return r6
            L_0x0616:
                return r5
            L_0x0617:
                british.x.t_url r1 = british.p015x.t_url.this
                british.x.config r3 = r1.f9940m
                british.x.j r1 = r3.mo7513k0(r2, r1)
                boolean r2 = r1.f7843b
                if (r2 == 0) goto L_0x063d
                british.x.t_url r2 = british.p015x.t_url.this
                r2.f6657c = r6
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                java.lang.String r3 = "finalizar"
                r2.putExtra(r3, r6)
                boolean r3 = r1.f7844c
                java.lang.String r4 = "finalizar_app"
                r2.putExtra(r4, r3)
                british.x.t_url r3 = british.p015x.t_url.this
                r3.setResult(r9, r2)
            L_0x063d:
                boolean r2 = r1.f7845d
                if (r2 == 0) goto L_0x0649
                british.x.t_url r2 = british.p015x.t_url.this
                android.content.Intent r1 = r1.f7842a
                r2.startActivityForResult(r1, r5)
                goto L_0x066e
            L_0x0649:
                android.content.Intent r2 = r1.f7842a
                if (r2 == 0) goto L_0x066e
                boolean r3 = r1.f7843b
                if (r3 == 0) goto L_0x0669
                british.x.t_url r3 = british.p015x.t_url.this
                r3.f6659e = r5
                british.x.config r3 = r3.f9940m
                int r3 = r3.f7427t4
                r4 = 2
                if (r3 == r4) goto L_0x065f
                r2.putExtra(r11, r6)
            L_0x065f:
                british.x.t_url r2 = british.p015x.t_url.this     // Catch:{ Exception -> 0x0667 }
                android.content.Intent r1 = r1.f7842a     // Catch:{ Exception -> 0x0667 }
                r2.startActivity(r1)     // Catch:{ Exception -> 0x0667 }
                goto L_0x066e
            L_0x0667:
                goto L_0x066e
            L_0x0669:
                british.x.t_url r1 = british.p015x.t_url.this     // Catch:{ Exception -> 0x0667 }
                r1.startActivityForResult(r2, r5)     // Catch:{ Exception -> 0x0667 }
            L_0x066e:
                british.x.t_url r1 = british.p015x.t_url.this
                boolean r2 = r1.f6657c
                if (r2 == 0) goto L_0x067b
                boolean r2 = r1.f6658d
                if (r2 != 0) goto L_0x067b
                r1.finish()
            L_0x067b:
                return r6
            L_0x067c:
                boolean r2 = r2.startsWith(r8)
                r3 = 6
                if (r2 == 0) goto L_0x068c
                java.lang.String r1 = r1.substring(r3)
                java.lang.String r1 = r1.trim()
                goto L_0x0696
            L_0x068c:
                r2 = 13
                java.lang.String r1 = r1.substring(r2)
                java.lang.String r1 = r1.trim()
            L_0x0696:
                boolean r2 = r1.equals(r10)
                if (r2 != 0) goto L_0x06fa
                int r2 = r1.indexOf(r14)
                if (r2 <= 0) goto L_0x06be
                java.lang.String r4 = "?body="
                int r4 = r1.indexOf(r4)
                if (r4 == r9) goto L_0x06b4
                int r4 = r4 + r3
                java.lang.String r3 = r1.substring(r4)
                java.lang.String r3 = r3.trim()
                goto L_0x06b5
            L_0x06b4:
                r3 = r10
            L_0x06b5:
                java.lang.String r1 = r1.substring(r5, r2)
                java.lang.String r1 = r1.trim()
                goto L_0x06bf
            L_0x06be:
                r3 = r10
            L_0x06bf:
                boolean r2 = r1.endsWith(r12)
                if (r2 == 0) goto L_0x06ce
                int r2 = r1.length()
                int r2 = r2 - r6
                java.lang.String r1 = r1.substring(r5, r2)
            L_0x06ce:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r8)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                android.net.Uri r1 = android.net.Uri.parse(r1)
                android.content.Intent r2 = new android.content.Intent
                r2.<init>(r13, r1)
                boolean r1 = r3.equals(r10)
                if (r1 != 0) goto L_0x06f5
                java.lang.String r3 = java.net.URLDecoder.decode(r3, r15)     // Catch:{ Exception -> 0x06f0 }
            L_0x06f0:
                java.lang.String r1 = "sms_body"
                r2.putExtra(r1, r3)
            L_0x06f5:
                british.x.t_url r1 = british.p015x.t_url.this     // Catch:{ Exception -> 0x06fa }
                r1.startActivity(r2)     // Catch:{ Exception -> 0x06fa }
            L_0x06fa:
                return r6
            L_0x06fb:
                boolean r2 = r2.startsWith(r8)
                if (r2 == 0) goto L_0x070b
                r2 = 7
                java.lang.String r1 = r1.substring(r2)
                java.lang.String r1 = r1.trim()
                goto L_0x0715
            L_0x070b:
                r2 = 14
                java.lang.String r1 = r1.substring(r2)
                java.lang.String r1 = r1.trim()
            L_0x0715:
                boolean r2 = r1.equals(r10)
                if (r2 != 0) goto L_0x07a9
                int r2 = r1.indexOf(r14)
                if (r2 <= 0) goto L_0x075b
                java.lang.String r3 = "?subject="
                int r3 = r1.indexOf(r3)
                if (r3 == r9) goto L_0x0750
                int r3 = r3 + 9
                java.lang.String r3 = r1.substring(r3)
                java.lang.String r3 = r3.trim()
                java.lang.String r4 = "&body="
                int r4 = r3.indexOf(r4)
                if (r4 == r9) goto L_0x074e
                int r8 = r4 + 6
                java.lang.String r8 = r3.substring(r8)
                java.lang.String r8 = r8.trim()
                java.lang.String r3 = r3.substring(r5, r4)
                java.lang.String r3 = r3.trim()
                goto L_0x0752
            L_0x074e:
                r8 = r10
                goto L_0x0752
            L_0x0750:
                r3 = r10
                r8 = r3
            L_0x0752:
                java.lang.String r1 = r1.substring(r5, r2)
                java.lang.String r1 = r1.trim()
                goto L_0x075d
            L_0x075b:
                r3 = r10
                r8 = r3
            L_0x075d:
                boolean r2 = r1.endsWith(r12)
                if (r2 == 0) goto L_0x076c
                int r2 = r1.length()
                int r2 = r2 - r6
                java.lang.String r1 = r1.substring(r5, r2)
            L_0x076c:
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r4 = "mailto"
                android.net.Uri r1 = android.net.Uri.fromParts(r4, r1, r7)
                r2.<init>(r13, r1)
                boolean r1 = r3.equals(r10)
                if (r1 != 0) goto L_0x0786
                java.lang.String r3 = java.net.URLDecoder.decode(r3, r15)     // Catch:{ Exception -> 0x0781 }
            L_0x0781:
                java.lang.String r1 = "android.intent.extra.SUBJECT"
                r2.putExtra(r1, r3)
            L_0x0786:
                boolean r1 = r8.equals(r10)
                if (r1 != 0) goto L_0x0795
                java.lang.String r8 = java.net.URLDecoder.decode(r8, r15)     // Catch:{ Exception -> 0x0790 }
            L_0x0790:
                java.lang.String r1 = "android.intent.extra.TEXT"
                r2.putExtra(r1, r8)
            L_0x0795:
                british.x.t_url r1 = british.p015x.t_url.this
                android.content.res.Resources r3 = r1.getResources()
                r4 = 2131820782(0x7f1100ee, float:1.9274289E38)
                java.lang.String r3 = r3.getString(r4)
                android.content.Intent r2 = android.content.Intent.createChooser(r2, r3)
                r1.startActivity(r2)
            L_0x07a9:
                return r6
            L_0x07aa:
                boolean r2 = r2.startsWith(r8)
                if (r2 == 0) goto L_0x07b6
                r2 = 4
                java.lang.String r1 = r1.substring(r2)
                goto L_0x07bc
            L_0x07b6:
                r2 = 11
                java.lang.String r1 = r1.substring(r2)
            L_0x07bc:
                boolean r2 = r1.endsWith(r12)
                if (r2 == 0) goto L_0x07cb
                int r2 = r1.length()
                int r2 = r2 - r6
                java.lang.String r1 = r1.substring(r5, r2)
            L_0x07cb:
                android.content.Intent r2 = new android.content.Intent
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r8)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                android.net.Uri r1 = android.net.Uri.parse(r1)
                java.lang.String r3 = "android.intent.action.DIAL"
                r2.<init>(r3, r1)
                british.x.t_url r1 = british.p015x.t_url.this     // Catch:{ Exception -> 0x07ea }
                r1.startActivity(r2)     // Catch:{ Exception -> 0x07ea }
            L_0x07ea:
                return r6
            L_0x07eb:
                android.content.Intent r1 = new android.content.Intent
                british.x.t_url r2 = british.p015x.t_url.this
                java.lang.Class<british.x.preperfil> r3 = british.p015x.preperfil.class
                r1.<init>(r2, r3)
                british.x.t_url r2 = british.p015x.t_url.this
                british.x.config r2 = r2.f9940m
                british.x.l[] r3 = r2.f7231O1
                int r2 = r2.f7318d
                r2 = r3[r2]
                int r2 = r2.f7964y
                java.lang.String r3 = "idsecc"
                r1.putExtra(r3, r2)
                java.lang.String r2 = "nocompletar"
                r1.putExtra(r2, r6)
                java.lang.String r2 = "desde_foro"
                r1.putExtra(r2, r6)
                british.x.t_url r2 = british.p015x.t_url.this
                r2.startActivityForResult(r1, r5)
                return r6
            L_0x0815:
                british.x.t_url r2 = british.p015x.t_url.this
                android.content.Intent r1 = r2.mo9004k(r1)
                british.x.t_url r2 = british.p015x.t_url.this
                r2.startActivityForResult(r1, r5)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_url.C2475k.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    public t_url() {
    }

    /* renamed from: j */
    private void m8947j(Context context) {
        this.f6662h = new C2462a(context);
    }

    @TargetApi(21)
    /* renamed from: m */
    private void m8948m() {
        if (Build.VERSION.SDK_INT > 20 && this.f9919G != null) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f9919G, true);
        }
    }

    public void abrir_secc(View view) {
        if (view == null) {
            int i = this.f9915C;
            if (i != -1) {
                mo9003i(i, this.f9955z);
                return;
            }
            return;
        }
        C1845j j0 = this.f9940m.mo7510j0(view, this);
        if (j0.f7843b) {
            this.f6657c = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", j0.f7844c);
            setResult(-1, intent);
        }
        if (j0.f7845d) {
            if (this.f9919G.getUrl() != null && (this.f9919G.getUrl().toLowerCase().contains("youtube.com") || this.f9919G.getUrl().toLowerCase().contains("youtu.be"))) {
                this.f9919G.reload();
            }
            startActivityForResult(j0.f7842a, 0);
        } else {
            Intent intent2 = j0.f7842a;
            if (intent2 != null) {
                if (j0.f7843b) {
                    this.f6659e = false;
                    if (this.f9940m.f7427t4 != 2) {
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
    /* renamed from: i */
    public void mo9003i(int i, boolean z) {
        C1845j B = this.f9940m.mo7475B(Integer.valueOf(i), this);
        if (z) {
            this.f6657c = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", false);
            setResult(-1, intent);
            Intent intent2 = B.f7842a;
            if (intent2 != null) {
                if (this.f9940m.f7427t4 != 2) {
                    intent2.putExtra("es_root", true);
                }
                this.f6659e = false;
                startActivity(B.f7842a);
            }
            finish();
            return;
        }
        startActivityForResult(B.f7842a, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Intent mo9004k(String str) {
        Uri parse = Uri.parse(str);
        Intent intent = new Intent(this, profile.class);
        intent.putExtra(TtmlNode.ATTR_ID, parse.getQueryParameter(TtmlNode.ATTR_ID));
        intent.putExtra("privados", parse.getQueryParameter("privados"));
        intent.putExtra("nombre", parse.getQueryParameter("nombre"));
        intent.putExtra("coments", parse.getQueryParameter("coments"));
        intent.putExtra("fnac_d", parse.getQueryParameter("fnac_d"));
        intent.putExtra("fnac_m", parse.getQueryParameter("fnac_m"));
        intent.putExtra("fnac_a", parse.getQueryParameter("fnac_a"));
        intent.putExtra("sexo", parse.getQueryParameter("sexo"));
        intent.putExtra("vfoto", parse.getQueryParameter("vfoto"));
        if (this.f9942n.containsKey("desdepriv")) {
            intent.putExtra("desdepriv", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        C1692config config = this.f9940m;
        intent.putExtra("p_fnac", config.f7231O1[config.f7318d].f7851C0);
        C1692config config2 = this.f9940m;
        intent.putExtra("p_sexo", config2.f7231O1[config2.f7318d].f7853D0);
        C1692config config3 = this.f9940m;
        intent.putExtra("p_descr", config3.f7231O1[config3.f7318d].f7855E0);
        C1692config config4 = this.f9940m;
        intent.putExtra("p_dist", config4.f7231O1[config4.f7318d].f7857F0);
        C1692config config5 = this.f9940m;
        intent.putExtra("coments_chat", config5.f7231O1[config5.f7318d].f7886U);
        C1692config config6 = this.f9940m;
        intent.putExtra("galeria", config6.f7231O1[config6.f7318d].f7888V);
        C1692config config7 = this.f9940m;
        intent.putExtra("privados_chat", config7.f7231O1[config7.f7318d].f7884T);
        C1692config config8 = this.f9940m;
        intent.putExtra("fotos_perfil", config8.f7231O1[config8.f7318d].f7849B0);
        intent.putExtra("fotos_chat", 1);
        return intent;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo9005l() {
        int q0 = this.f9940m.mo7522q0(this);
        int i = this.f9940m.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f9935W = listView;
            this.f9940m.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f9940m.f7231O1;
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
            int[] iArr = this.f9940m.f7249R1;
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
        String dataString;
        if (i == 10) {
            ValueCallback<Uri> valueCallback = this.f9933U;
            if (valueCallback != null || this.f9934V != null) {
                if (valueCallback != null) {
                    this.f9933U.onReceiveValue((intent == null || i2 != -1) ? null : intent.getData());
                    this.f9933U = null;
                } else if (this.f9934V != null) {
                    this.f9934V.onReceiveValue((intent == null || (dataString = intent.getDataString()) == null) ? null : new Uri[]{Uri.parse(dataString)});
                    this.f9934V = null;
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
        if (this.f9924L) {
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
        String str9 = this.f9940m.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f9940m.f7281W3) == null || str.equals("")) && (((str2 = this.f9940m.f7250R2) == null || str2.equals("")) && (((str3 = this.f9940m.f7245Q3) == null || str3.equals("")) && (((str4 = this.f9940m.f7269U3) == null || str4.equals("")) && (((str5 = this.f9940m.f7275V3) == null || str5.equals("")) && (((str6 = this.f9940m.f7358j4) == null || str6.equals("")) && (((str7 = this.f9940m.f7287X3) == null || str7.equals("")) && ((str8 = this.f9940m.f7293Y3) == null || str8.equals("")))))))))) {
            abrir_secc(view);
            return;
        }
        String str10 = this.f9940m.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6663i = new RewardedVideo((Context) this, this.f9940m.f7251R3);
        }
        String str11 = this.f9940m.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f9940m.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6664j = new RewardedVideoAd(this, this.f9940m.f7269U3);
        }
        String str13 = this.f9940m.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6665k = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6661g = progressDialog;
        this.f6660f = view;
        this.f9915C = -1;
        this.f9955z = false;
        if (!this.f9940m.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
            abrir_secc(view);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        boolean z = false;
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo9005l();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f9923K;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f9923K;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        if (!this.f9954y) {
            C1692config config = this.f9940m;
            boolean z2 = this.f9942n.getString("url").contains("youtube.com") || this.f9942n.getString("url").contains("youtu.be");
            if (this.f9952w || this.f9953x) {
                z = true;
            }
            this.f9923K = config.mo7476B0(this, z2, z);
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        boolean z;
        Uri e;
        int itemId = menuItem.getItemId();
        String str = "";
        if (itemId == R.id.compartir) {
            if (this.f9942n.getString("url").startsWith("file://")) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeFile = BitmapFactory.decodeFile(this.f9942n.getString("url").replace("file://", str), options);
                try {
                    File file = new File(getCacheDir(), "images");
                    file.mkdirs();
                    FileOutputStream fileOutputStream = new FileOutputStream(file + "/temporal.png");
                    decodeFile.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                    z = true;
                } catch (IOException e2) {
                    z = false;
                    e2.printStackTrace();
                }
                if (z && (e = FileProvider.m3280e(this, "british.x.fileprovider", new File(new File(getCacheDir(), "images"), "temporal.png"))) != null) {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.addFlags(1);
                    intent.setType(getContentResolver().getType(e));
                    intent.putExtra("android.intent.extra.STREAM", e);
                    startActivity(Intent.createChooser(intent, getResources().getString(R.string.compartir)));
                }
            } else {
                String str2 = this.f9919G.getHitTestResult().getExtra().toString();
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", str2);
                startActivity(Intent.createChooser(intent2, getResources().getString(R.string.compartir)));
            }
            return true;
        } else if (itemId != R.id.guardar) {
            return super.onContextItemSelected(menuItem);
        } else {
            if (this.f9942n.getString("url").startsWith("file://")) {
                C1692config.m8174X(this.f9942n.getString("url"), this);
            } else {
                WebView.HitTestResult hitTestResult = this.f9919G.getHitTestResult();
                String str3 = hitTestResult.getExtra().toString();
                if (str3 != null) {
                    String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(hitTestResult.getExtra().toString());
                    String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : "image/*";
                    try {
                        str = URLUtil.guessFileName(str3, (String) null, mimeTypeFromExtension);
                    } catch (Exception unused) {
                    }
                    this.f9940m.mo7491W(str3, mimeTypeFromExtension, str, this);
                }
            }
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0227, code lost:
        if (r6.getInt("fnac_a", 0) != 0) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0234, code lost:
        if (r6.getInt("sexo", r9) == 0) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0242, code lost:
        if (r6.getString("descr", "").equals("") != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
        if (r1.f9942n.getBoolean("nocompletar", false) != false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c0, code lost:
        if (r6[r5].f7910e.equals(r1.f9942n.getString("url")) != false) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02cb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x053c  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x055e  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x05a7  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x05df  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0673  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x06f8  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x072b  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0734  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0785  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x07a7  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x07d1  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x07dc  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x083a  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x086d  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x08c2  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x08ff  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x091c  */
    /* JADX WARNING: Removed duplicated region for block: B:344:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x019b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            android.content.Context r0 = r21.getApplicationContext()
            british.x.config r0 = (british.p015x.C1692config) r0
            r1.f9940m = r0
            java.lang.String r3 = r0.f7313c1
            if (r3 != 0) goto L_0x0013
            r0.mo7490V0()
        L_0x0013:
            r1.m8947j(r1)
            british.x.t_url$c r0 = new british.x.t_url$c
            r0.<init>()
            r1.f6666l = r0
            android.content.Intent r0 = r21.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            r1.f9942n = r0
            if (r0 != 0) goto L_0x0030
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.f9942n = r0
        L_0x0030:
            java.lang.String r0 = "es_root"
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x004e
            android.os.Bundle r5 = r1.f9942n
            if (r5 == 0) goto L_0x004a
            boolean r5 = r5.containsKey(r0)
            if (r5 == 0) goto L_0x004a
            android.os.Bundle r5 = r1.f9942n
            boolean r5 = r5.getBoolean(r0, r4)
            if (r5 == 0) goto L_0x004a
            r5 = 1
            goto L_0x004b
        L_0x004a:
            r5 = 0
        L_0x004b:
            r1.f6659e = r5
            goto L_0x005f
        L_0x004e:
            boolean r5 = r2.containsKey(r0)
            if (r5 == 0) goto L_0x005c
            boolean r5 = r2.getBoolean(r0, r4)
            if (r5 == 0) goto L_0x005c
            r5 = 1
            goto L_0x005d
        L_0x005c:
            r5 = 0
        L_0x005d:
            r1.f6659e = r5
        L_0x005f:
            british.x.config r5 = r1.f9940m
            int r6 = r5.f7318d
            java.lang.String r7 = "file://"
            r8 = -1
            java.lang.String r9 = "url"
            if (r6 == r8) goto L_0x00c5
            british.x.l[] r10 = r5.f7231O1
            r6 = r10[r6]
            java.lang.String r6 = r6.f7916g
            java.lang.String r5 = r5.f7368l1
            java.lang.String r5 = british.p015x.C1692config.m8189h(r6, r5)
            r1.f6656b = r5
            android.os.Bundle r5 = r1.f9942n
            boolean r5 = r5.containsKey(r9)
            if (r5 != 0) goto L_0x009a
            android.os.Bundle r5 = r1.f9942n
            british.x.config r6 = r1.f9940m
            british.x.l[] r10 = r6.f7231O1
            int r6 = r6.f7318d
            r6 = r10[r6]
            java.lang.String r6 = r6.f7910e
            r5.putString(r9, r6)
            android.os.Bundle r5 = r1.f9942n
            java.lang.String r6 = "nocompletar"
            boolean r5 = r5.getBoolean(r6, r4)
            if (r5 == 0) goto L_0x00c3
            goto L_0x00cf
        L_0x009a:
            android.os.Bundle r5 = r1.f9942n
            java.lang.String r5 = r5.getString(r9)
            boolean r5 = r5.startsWith(r7)
            if (r5 != 0) goto L_0x00cf
            british.x.config r5 = r1.f9940m
            british.x.l[] r6 = r5.f7231O1
            int r5 = r5.f7318d
            r10 = r6[r5]
            int r10 = r10.f7954t
            if (r10 != r3) goto L_0x00cf
            r5 = r6[r5]
            java.lang.String r5 = r5.f7910e
            android.os.Bundle r6 = r1.f9942n
            java.lang.String r6 = r6.getString(r9)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x00c3
            goto L_0x00cf
        L_0x00c3:
            r5 = 1
            goto L_0x00d0
        L_0x00c5:
            java.lang.String r6 = r5.f7313c1
            java.lang.String r5 = r5.f7368l1
            java.lang.String r5 = british.p015x.C1692config.m8189h(r6, r5)
            r1.f6656b = r5
        L_0x00cf:
            r5 = 0
        L_0x00d0:
            super.onCreate(r22)
            int r6 = android.os.Build.VERSION.SDK_INT
            r10 = 22
            if (r6 >= r10) goto L_0x00f8
            android.os.Bundle r6 = r1.f9942n
            java.lang.String r6 = r6.getString(r9)
            java.lang.String r10 = "e-droid.net"
            boolean r6 = r6.contains(r10)
            if (r6 == 0) goto L_0x00f8
            android.os.Bundle r6 = r1.f9942n
            java.lang.String r10 = r6.getString(r9)
            java.lang.String r11 = "https://"
            java.lang.String r12 = "http://"
            java.lang.String r10 = r10.replace(r11, r12)
            r6.putString(r9, r10)
        L_0x00f8:
            android.os.Bundle r6 = r1.f9942n
            java.lang.String r6 = r6.getString(r9)
            java.lang.String r10 = "forum.e-droid.net"
            boolean r6 = r6.contains(r10)
            java.lang.String r10 = "pixworld.io-desdeac"
            if (r6 == 0) goto L_0x010b
            r1.f9951v = r3
            goto L_0x014c
        L_0x010b:
            android.os.Bundle r6 = r1.f9942n
            java.lang.String r6 = r6.getString(r9)
            java.lang.String r11 = "quiz.e-droid.net"
            boolean r6 = r6.contains(r11)
            if (r6 == 0) goto L_0x011c
            r1.f9950u = r3
            goto L_0x014c
        L_0x011c:
            android.os.Bundle r6 = r1.f9942n
            java.lang.String r6 = r6.getString(r9)
            java.lang.String r11 = "games.e-droid.net"
            boolean r6 = r6.contains(r11)
            if (r6 == 0) goto L_0x012d
            r1.f9952w = r3
            goto L_0x014c
        L_0x012d:
            android.os.Bundle r6 = r1.f9942n
            java.lang.String r6 = r6.getString(r9)
            boolean r6 = r6.contains(r10)
            if (r6 == 0) goto L_0x013c
            r1.f9953x = r3
            goto L_0x014c
        L_0x013c:
            android.os.Bundle r6 = r1.f9942n
            java.lang.String r6 = r6.getString(r9)
            java.lang.String r11 = "instal.com"
            boolean r6 = r6.contains(r11)
            if (r6 == 0) goto L_0x014c
            r1.f9954y = r3
        L_0x014c:
            boolean r6 = r1.f9951v
            java.lang.String r11 = "nick"
            java.lang.String r12 = "sh"
            r13 = 0
            java.lang.String r3 = ""
            if (r6 != 0) goto L_0x019b
            boolean r6 = r1.f9952w
            if (r6 == 0) goto L_0x016a
            british.x.config r6 = r1.f9940m
            int r15 = r6.f7318d
            if (r15 == r8) goto L_0x016a
            british.x.l[] r6 = r6.f7231O1
            r6 = r6[r15]
            boolean r6 = r6.f7927j1
            if (r6 != 0) goto L_0x019b
        L_0x016a:
            boolean r6 = r1.f9953x
            if (r6 == 0) goto L_0x017c
            british.x.config r6 = r1.f9940m
            int r15 = r6.f7318d
            if (r15 == r8) goto L_0x017c
            british.x.l[] r6 = r6.f7231O1
            r6 = r6[r15]
            boolean r6 = r6.f7927j1
            if (r6 != 0) goto L_0x019b
        L_0x017c:
            boolean r6 = r1.f9950u
            if (r6 == 0) goto L_0x018f
            british.x.config r6 = r1.f9940m
            int r15 = r6.f7318d
            if (r15 == r8) goto L_0x018f
            british.x.l[] r6 = r6.f7231O1
            r6 = r6[r15]
            boolean r6 = r6.f7927j1
            if (r6 == 0) goto L_0x018f
            goto L_0x019b
        L_0x018f:
            r18 = r5
            r17 = r7
            r16 = r9
            r19 = r10
            r20 = r11
            goto L_0x02cc
        L_0x019b:
            android.content.SharedPreferences r6 = r1.getSharedPreferences(r12, r4)
            java.lang.String r15 = "idusu"
            r16 = r9
            long r8 = r6.getLong(r15, r13)
            r1.f9913A = r8
            java.lang.String r8 = "cod"
            java.lang.String r8 = r6.getString(r8, r3)
            r1.f9916D = r8
            boolean r8 = r1.f9953x
            if (r8 == 0) goto L_0x01ba
            r8 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            goto L_0x01d0
        L_0x01ba:
            british.x.config r8 = r1.f9940m
            british.x.l[] r9 = r8.f7231O1
            int r8 = r8.f7318d
            r15 = r9[r8]
            int r15 = r15.f7851C0
            r13 = r9[r8]
            int r13 = r13.f7853D0
            r14 = r9[r8]
            int r14 = r14.f7855E0
            r8 = r9[r8]
            int r8 = r8.f7849B0
        L_0x01d0:
            java.lang.String r9 = r6.getString(r11, r3)
            boolean r9 = r9.equals(r3)
            java.lang.String r4 = "desde_px"
            r17 = r7
            java.lang.String r7 = "desde_quiz"
            java.lang.String r2 = "desde_game"
            r18 = r5
            java.lang.String r5 = "desde_foro"
            r19 = r10
            java.lang.String r10 = "idsecc"
            if (r9 != 0) goto L_0x0285
            british.x.config r9 = r1.f9940m
            int r9 = r9.f7393o5
            r20 = r11
            r11 = 3
            if (r9 != r11) goto L_0x01fe
            java.lang.String r9 = "email_confirmado"
            r11 = 0
            boolean r9 = r6.getBoolean(r9, r11)
            if (r9 != 0) goto L_0x01fe
            goto L_0x0287
        L_0x01fe:
            r9 = 2
            if (r8 != r9) goto L_0x020e
            british.x.config r8 = r1.f9940m
            r11 = 1
            java.io.File r8 = r8.mo7516l0(r1, r11)
            boolean r8 = r8.exists()
            if (r8 == 0) goto L_0x0244
        L_0x020e:
            if (r15 != r9) goto L_0x022a
            java.lang.String r8 = "fnac_d"
            r9 = 0
            int r8 = r6.getInt(r8, r9)
            if (r8 == 0) goto L_0x0244
            java.lang.String r8 = "fnac_m"
            int r8 = r6.getInt(r8, r9)
            if (r8 == 0) goto L_0x0244
            java.lang.String r8 = "fnac_a"
            int r8 = r6.getInt(r8, r9)
            if (r8 == 0) goto L_0x0244
            goto L_0x022b
        L_0x022a:
            r9 = 0
        L_0x022b:
            r8 = 2
            if (r13 != r8) goto L_0x0236
            java.lang.String r11 = "sexo"
            int r11 = r6.getInt(r11, r9)
            if (r11 == 0) goto L_0x0244
        L_0x0236:
            if (r14 != r8) goto L_0x02c7
            java.lang.String r8 = "descr"
            java.lang.String r6 = r6.getString(r8, r3)
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x02c7
        L_0x0244:
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<british.x.preperfil> r8 = british.p015x.preperfil.class
            r6.<init>(r1, r8)
            british.x.config r8 = r1.f9940m
            british.x.l[] r9 = r8.f7231O1
            int r8 = r8.f7318d
            r8 = r9[r8]
            int r8 = r8.f7964y
            r6.putExtra(r10, r8)
            boolean r8 = r1.f9951v
            if (r8 == 0) goto L_0x0261
            r8 = 1
            r6.putExtra(r5, r8)
            goto L_0x0275
        L_0x0261:
            r8 = 1
            boolean r5 = r1.f9952w
            if (r5 == 0) goto L_0x026a
            r6.putExtra(r2, r8)
            goto L_0x0275
        L_0x026a:
            boolean r2 = r1.f9953x
            if (r2 == 0) goto L_0x0272
            r6.putExtra(r4, r8)
            goto L_0x0275
        L_0x0272:
            r6.putExtra(r7, r8)
        L_0x0275:
            boolean r2 = r1.f6659e
            if (r2 == 0) goto L_0x027c
            r6.putExtra(r0, r2)
        L_0x027c:
            r2 = 0
            r1.f6659e = r2
            r1.f6657c = r8
            r1.startActivityForResult(r6, r2)
            goto L_0x02c7
        L_0x0285:
            r20 = r11
        L_0x0287:
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<british.x.chat_perfil> r8 = british.p015x.chat_perfil.class
            r6.<init>(r1, r8)
            british.x.config r8 = r1.f9940m
            british.x.l[] r9 = r8.f7231O1
            int r8 = r8.f7318d
            r8 = r9[r8]
            int r8 = r8.f7964y
            r6.putExtra(r10, r8)
            boolean r8 = r1.f9951v
            if (r8 == 0) goto L_0x02a4
            r8 = 1
            r6.putExtra(r5, r8)
            goto L_0x02b8
        L_0x02a4:
            r8 = 1
            boolean r5 = r1.f9952w
            if (r5 == 0) goto L_0x02ad
            r6.putExtra(r2, r8)
            goto L_0x02b8
        L_0x02ad:
            boolean r2 = r1.f9953x
            if (r2 == 0) goto L_0x02b5
            r6.putExtra(r4, r8)
            goto L_0x02b8
        L_0x02b5:
            r6.putExtra(r7, r8)
        L_0x02b8:
            boolean r2 = r1.f6659e
            if (r2 == 0) goto L_0x02bf
            r6.putExtra(r0, r2)
        L_0x02bf:
            r2 = 0
            r1.f6659e = r2
            r1.f6657c = r8
            r1.startActivityForResult(r6, r2)
        L_0x02c7:
            boolean r0 = r1.f6657c
            if (r0 == 0) goto L_0x02cc
            return
        L_0x02cc:
            boolean r0 = r1.f9951v
            if (r0 == 0) goto L_0x03c0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.os.Bundle r2 = r1.f9942n
            r4 = r16
            java.lang.String r2 = r2.getString(r4)
            r0.append(r2)
            java.lang.String r2 = "&idusu="
            r0.append(r2)
            long r5 = r1.f9913A
            r0.append(r5)
            java.lang.String r2 = "&c="
            r0.append(r2)
            java.lang.String r2 = r1.f9916D
            r0.append(r2)
            java.lang.String r2 = "&idpais="
            r0.append(r2)
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r2 = r2.getCountry()
            r0.append(r2)
            java.lang.String r2 = "&idl="
            r0.append(r2)
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r2 = r2.getLanguage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.os.Bundle r2 = r1.f9942n
            java.lang.String r5 = "abrir_idtema"
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L_0x03b9
            java.lang.String r2 = "/cats.php"
            java.lang.String r6 = "/tema.php"
            java.lang.String r0 = r0.replace(r2, r6)
            java.lang.String r2 = "/temas.php"
            java.lang.String r0 = r0.replace(r2, r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "&idc="
            r2.append(r0)
            android.os.Bundle r0 = r1.f9942n
            java.lang.String r6 = "abrir_idcat"
            java.lang.String r0 = r0.getString(r6)
            r2.append(r0)
            java.lang.String r0 = "&idt="
            r2.append(r0)
            android.os.Bundle r0 = r1.f9942n
            java.lang.String r0 = r0.getString(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.os.Bundle r2 = r1.f9942n
            java.lang.String r5 = "abrir_idresp"
            boolean r2 = r2.containsKey(r5)
            java.lang.String r6 = "&idr_ir="
            if (r2 == 0) goto L_0x038f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r6)
            android.os.Bundle r0 = r1.f9942n
            java.lang.String r0 = r0.getString(r5)
            r2.append(r0)
            java.lang.String r0 = "#coment"
            r2.append(r0)
            android.os.Bundle r0 = r1.f9942n
            java.lang.String r5 = "idcoment_ir"
            java.lang.String r0 = r0.getString(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x03b9
        L_0x038f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r6)
            android.os.Bundle r0 = r1.f9942n
            java.lang.String r5 = "idresp_ir"
            java.lang.String r0 = r0.getString(r5)
            r2.append(r0)
            java.lang.String r0 = "#resp"
            r2.append(r0)
            android.os.Bundle r0 = r1.f9942n
            java.lang.String r5 = "idresp_ir"
            java.lang.String r0 = r0.getString(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x03b9:
            android.os.Bundle r2 = r1.f9942n
            r2.putString(r4, r0)
            goto L_0x04db
        L_0x03c0:
            r4 = r16
            boolean r0 = r1.f9952w
            if (r0 == 0) goto L_0x044b
            java.lang.String r0 = r1.f9916D
            if (r0 != 0) goto L_0x03d0
            r5 = 0
            r1.f9913A = r5
            r1.f9916D = r3
        L_0x03d0:
            java.lang.String r0 = r1.f9916D
            boolean r2 = r0.equals(r3)
            if (r2 != 0) goto L_0x0400
            android.os.Bundle r2 = r1.f9942n
            if (r2 == 0) goto L_0x0400
            java.lang.String r5 = "game_idusu_ref"
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L_0x0400
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "-"
            r2.append(r0)
            android.os.Bundle r0 = r1.f9942n
            java.lang.String r5 = "game_idusu_ref"
            java.lang.String r0 = r0.getString(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x0400:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.os.Bundle r5 = r1.f9942n
            java.lang.String r5 = r5.getString(r4)
            r2.append(r5)
            java.lang.String r5 = "&userid="
            r2.append(r5)
            long r5 = r1.f9913A
            r2.append(r5)
            java.lang.String r5 = "&param1="
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "&ads=1"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.os.Bundle r2 = r1.f9942n
            r2.putString(r4, r0)
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0448 }
            java.lang.String r2 = "gameid"
            java.lang.String r0 = r0.getQueryParameter(r2)     // Catch:{ Exception -> 0x0448 }
            r1.f9922J = r0     // Catch:{ Exception -> 0x0448 }
            goto L_0x04db
        L_0x0448:
            goto L_0x04db
        L_0x044b:
            boolean r0 = r1.f9953x
            if (r0 == 0) goto L_0x04db
            java.lang.String r0 = r1.f9916D
            if (r0 != 0) goto L_0x045a
            r5 = 0
            r1.f9913A = r5
            r1.f9916D = r3
            goto L_0x0470
        L_0x045a:
            r2 = 0
            android.content.SharedPreferences r0 = r1.getSharedPreferences(r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x046c }
            r2 = r20
            java.lang.String r0 = r0.getString(r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x046c }
            java.lang.String r2 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r2)     // Catch:{ UnsupportedEncodingException -> 0x046c }
            goto L_0x0471
        L_0x046c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0470:
            r0 = r3
        L_0x0471:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.os.Bundle r5 = r1.f9942n
            java.lang.String r5 = r5.getString(r4)
            java.lang.String r6 = "pixworld.io"
            r7 = r19
            java.lang.String r5 = r5.replace(r7, r6)
            r2.append(r5)
            java.lang.String r5 = "?ac_ida="
            r2.append(r5)
            r5 = 2261075(0x228053, float:3.168441E-39)
            r2.append(r5)
            java.lang.String r5 = "&ac_idsec="
            r2.append(r5)
            british.x.config r5 = r1.f9940m
            british.x.l[] r6 = r5.f7231O1
            int r5 = r5.f7318d
            r5 = r6[r5]
            int r5 = r5.f7964y
            r2.append(r5)
            java.lang.String r5 = "&ac_idm="
            r2.append(r5)
            british.x.config r5 = r1.f9940m
            british.x.l[] r6 = r5.f7231O1
            int r5 = r5.f7318d
            r5 = r6[r5]
            java.lang.String r5 = r5.f7924i1
            r2.append(r5)
            java.lang.String r5 = "&ac_idu="
            r2.append(r5)
            long r5 = r1.f9913A
            r2.append(r5)
            java.lang.String r5 = "&ac_cod="
            r2.append(r5)
            java.lang.String r5 = r1.f9916D
            r2.append(r5)
            java.lang.String r5 = "&ac_ni="
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.os.Bundle r2 = r1.f9942n
            r2.putString(r4, r0)
        L_0x04db:
            r0 = 2131558678(0x7f0d0116, float:1.8742679E38)
            r1.setContentView(r0)
            r21.mo9005l()
            british.x.config r0 = r1.f9940m
            r2 = 0
            r0.mo7486N0(r1, r2)
            java.lang.String r0 = "search"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.app.SearchManager r0 = (android.app.SearchManager) r0
            british.x.t_url$d r2 = new british.x.t_url$d
            r2.<init>()
            r0.setOnCancelListener(r2)
            british.x.t_url$e r2 = new british.x.t_url$e
            r2.<init>()
            r0.setOnDismissListener(r2)
            boolean r0 = r1.f9954y
            if (r0 != 0) goto L_0x053a
            british.x.config r0 = r1.f9940m
            android.os.Bundle r2 = r1.f9942n
            java.lang.String r2 = r2.getString(r4)
            java.lang.String r5 = "youtube.com"
            boolean r2 = r2.contains(r5)
            if (r2 != 0) goto L_0x0527
            android.os.Bundle r2 = r1.f9942n
            java.lang.String r2 = r2.getString(r4)
            java.lang.String r5 = "youtu.be"
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto L_0x0525
            goto L_0x0527
        L_0x0525:
            r2 = 0
            goto L_0x0528
        L_0x0527:
            r2 = 1
        L_0x0528:
            boolean r5 = r1.f9952w
            if (r5 != 0) goto L_0x0533
            boolean r5 = r1.f9953x
            if (r5 == 0) goto L_0x0531
            goto L_0x0533
        L_0x0531:
            r5 = 0
            goto L_0x0534
        L_0x0533:
            r5 = 1
        L_0x0534:
            british.x.c r0 = r0.mo7476B0(r1, r2, r5)
            r1.f9923K = r0
        L_0x053a:
            if (r18 == 0) goto L_0x0548
            british.x.config r0 = r1.f9940m
            int r2 = r0.f7318d
            java.lang.String r5 = r1.f6656b
            r6 = r22
            r0.mo7488Q0(r1, r2, r5, r6)
            goto L_0x054a
        L_0x0548:
            r6 = r22
        L_0x054a:
            android.os.Bundle r0 = r1.f9942n
            java.lang.String r2 = "linksexternos"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x057d
            android.os.Bundle r0 = r1.f9942n
            java.lang.String r2 = "adaptar_ancho"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x057d
            android.os.Bundle r0 = r1.f9942n
            java.lang.String r2 = "linksexternos"
            boolean r0 = r0.getBoolean(r2)
            if (r0 == 0) goto L_0x056d
            r2 = 1
            r1.f9914B = r2
            r2 = 0
            goto L_0x0570
        L_0x056d:
            r2 = 0
            r1.f9914B = r2
        L_0x0570:
            android.os.Bundle r0 = r1.f9942n
            java.lang.String r5 = "adaptar_ancho"
            boolean r0 = r0.getBoolean(r5)
            r1.f9944o = r0
            r1.f9918F = r2
            goto L_0x05a0
        L_0x057d:
            british.x.config r0 = r1.f9940m
            int r2 = r0.f7318d
            r5 = -1
            if (r2 == r5) goto L_0x0599
            british.x.l[] r0 = r0.f7231O1
            r5 = r0[r2]
            int r5 = r5.f7962x
            r1.f9914B = r5
            r5 = r0[r2]
            boolean r5 = r5.f7850C
            r1.f9944o = r5
            r0 = r0[r2]
            boolean r0 = r0.f7862I
            r1.f9918F = r0
            goto L_0x05a0
        L_0x0599:
            r2 = 0
            r1.f9914B = r2
            r1.f9944o = r2
            r1.f9918F = r2
        L_0x05a0:
            british.x.config r0 = r1.f9940m
            int r2 = r0.f7318d
            r5 = -1
            if (r2 == r5) goto L_0x05bc
            british.x.l[] r0 = r0.f7231O1
            r5 = r0[r2]
            boolean r5 = r5.f7854E
            r1.f9946q = r5
            r5 = r0[r2]
            boolean r5 = r5.f7856F
            r1.f9947r = r5
            r0 = r0[r2]
            boolean r0 = r0.f7870M
            r1.f9948s = r0
            goto L_0x05c4
        L_0x05bc:
            r2 = 1
            r1.f9946q = r2
            r1.f9947r = r2
            r2 = 0
            r1.f9948s = r2
        L_0x05c4:
            r0 = 2131363247(0x7f0a05af, float:1.8346297E38)
            android.view.View r0 = r1.findViewById(r0)
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            r1.f9919G = r0
            android.os.Bundle r0 = r1.f9942n
            java.lang.String r0 = r0.getString(r4)
            r2 = r17
            boolean r0 = r0.startsWith(r2)
            java.lang.String r2 = "#"
            if (r0 == 0) goto L_0x0673
            android.webkit.WebView r0 = r1.f9919G
            android.webkit.WebSettings r0 = r0.getSettings()
            r5 = 1
            r0.setAllowFileAccess(r5)
            r7 = 0
            r1.f9946q = r7
            r1.f9947r = r5
            r1.f9948s = r7
            r1.f9944o = r5
            r1.f9944o = r5
            android.os.Bundle r0 = r1.f9942n
            java.lang.String r5 = "bg1"
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L_0x060f
            android.os.Bundle r0 = r1.f9942n
            java.lang.String r5 = "bg1"
            java.lang.String r0 = r0.getString(r5)
            android.os.Bundle r5 = r1.f9942n
            java.lang.String r7 = "bg2"
            java.lang.String r5 = r5.getString(r7)
            goto L_0x0624
        L_0x060f:
            british.x.config r0 = r1.f9940m
            int r5 = r0.f7318d
            r7 = -1
            if (r5 == r7) goto L_0x0622
            british.x.l[] r0 = r0.f7231O1
            r7 = r0[r5]
            java.lang.String r7 = r7.f7916g
            r0 = r0[r5]
            java.lang.String r5 = r0.f7919h
            r0 = r7
            goto L_0x0624
        L_0x0622:
            r0 = r3
            r5 = r0
        L_0x0624:
            boolean r7 = r0.equals(r3)
            if (r7 != 0) goto L_0x0671
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r8 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r9 = 2
            int[] r10 = new int[r9]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            int r0 = android.graphics.Color.parseColor(r0)
            r9 = 0
            r10[r9] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            int r0 = android.graphics.Color.parseColor(r0)
            r5 = 1
            r10[r5] = r0
            r7.<init>(r8, r10)
            r0 = 2131362530(0x7f0a02e2, float:1.8344843E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setBackgroundDrawable(r7)
            android.webkit.WebView r0 = r1.f9919G
            r5 = 0
            r0.setBackgroundColor(r5)
            goto L_0x06d0
        L_0x0671:
            r5 = 0
            goto L_0x06d0
        L_0x0673:
            r5 = 0
            boolean r0 = r1.f9950u
            if (r0 == 0) goto L_0x0683
            r1.f9946q = r5
            r1.f9947r = r5
            r1.f9948s = r5
            r1.f9944o = r5
            r1.f9918F = r5
            goto L_0x06d0
        L_0x0683:
            boolean r0 = r1.f9951v
            if (r0 == 0) goto L_0x0692
            r1.f9946q = r5
            r1.f9947r = r5
            r1.f9948s = r5
            r1.f9944o = r5
            r1.f9918F = r5
            goto L_0x06d0
        L_0x0692:
            boolean r0 = r1.f9952w
            if (r0 != 0) goto L_0x06c4
            boolean r0 = r1.f9953x
            if (r0 == 0) goto L_0x069b
            goto L_0x06c4
        L_0x069b:
            boolean r0 = r1.f9954y
            if (r0 == 0) goto L_0x06d0
            r0 = 2131362339(0x7f0a0223, float:1.8344456E38)
            android.view.View r0 = r1.findViewById(r0)
            british.x.t_url$f r5 = new british.x.t_url$f
            r5.<init>()
            r0.setOnClickListener(r5)
            r0 = 2131362339(0x7f0a0223, float:1.8344456E38)
            android.view.View r0 = r1.findViewById(r0)
            r5 = 0
            r0.setVisibility(r5)
            r1.f9946q = r5
            r1.f9947r = r5
            r1.f9948s = r5
            r1.f9944o = r5
            r1.f9918F = r5
            goto L_0x06d0
        L_0x06c4:
            r5 = 0
            r7 = 1
            r1.f9946q = r7
            r1.f9947r = r5
            r1.f9948s = r5
            r1.f9944o = r5
            r1.f9918F = r5
        L_0x06d0:
            boolean r0 = r1.f9950u
            if (r0 != 0) goto L_0x06e9
            boolean r0 = r1.f9951v
            if (r0 != 0) goto L_0x06e9
            boolean r0 = r1.f9952w
            if (r0 != 0) goto L_0x06e9
            boolean r0 = r1.f9953x
            if (r0 != 0) goto L_0x06e9
            boolean r0 = r1.f9954y
            if (r0 != 0) goto L_0x06e9
            android.webkit.WebView r0 = r1.f9919G
            r1.registerForContextMenu(r0)
        L_0x06e9:
            r0 = 2131362931(0x7f0a0473, float:1.8345657E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r0
            r1.f9936X = r0
            boolean r5 = r1.f9948s
            if (r5 == 0) goto L_0x072b
            int r5 = android.os.Build.VERSION.SDK_INT
            r7 = 20
            if (r5 <= r7) goto L_0x071f
            r5 = 1
            int[] r7 = new int[r5]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            british.x.config r2 = r1.f9940m
            java.lang.String r2 = r2.f7368l1
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            int r2 = android.graphics.Color.parseColor(r2)
            r5 = 0
            r7[r5] = r2
            r0.setColorSchemeColors(r7)
            goto L_0x0720
        L_0x071f:
            r5 = 0
        L_0x0720:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r1.f9936X
            british.x.t_url$g r2 = new british.x.t_url$g
            r2.<init>()
            r0.setOnRefreshListener(r2)
            goto L_0x072f
        L_0x072b:
            r5 = 0
            r0.setEnabled(r5)
        L_0x072f:
            int r0 = r1.f9914B
            r2 = 2
            if (r0 != r2) goto L_0x073e
            android.webkit.WebView r0 = r1.f9919G
            android.webkit.WebSettings r0 = r0.getSettings()
            r2 = 1
            r0.setSupportMultipleWindows(r2)
        L_0x073e:
            android.webkit.WebView r0 = r1.f9919G
            british.x.t_url$h r2 = new british.x.t_url$h
            r2.<init>()
            r1.f9943n0 = r2
            r0.setWebChromeClient(r2)
            r21.m8948m()
            android.webkit.WebView r0 = r1.f9919G
            android.webkit.WebSettings r0 = r0.getSettings()
            boolean r2 = r1.f9947r
            r0.setBuiltInZoomControls(r2)
            android.webkit.WebView r0 = r1.f9919G
            android.webkit.WebSettings r0 = r0.getSettings()
            boolean r2 = r1.f9947r
            r0.setSupportZoom(r2)
            android.webkit.WebView r0 = r1.f9919G
            android.webkit.WebSettings r0 = r0.getSettings()
            r2 = 1
            r0.setDomStorageEnabled(r2)
            android.webkit.WebView r0 = r1.f9919G
            british.x.t_url$i r2 = new british.x.t_url$i
            r2.<init>()
            r0.setOnTouchListener(r2)
            android.webkit.WebView r0 = r1.f9919G
            british.x.t_url$j r2 = new british.x.t_url$j
            r2.<init>()
            r0.setDownloadListener(r2)
            boolean r0 = r1.f9944o
            if (r0 == 0) goto L_0x0798
            android.webkit.WebView r0 = r1.f9919G
            android.webkit.WebSettings r0 = r0.getSettings()
            r2 = 1
            r0.setUseWideViewPort(r2)
            android.webkit.WebView r0 = r1.f9919G
            android.webkit.WebSettings r0 = r0.getSettings()
            r0.setLoadWithOverviewMode(r2)
        L_0x0798:
            r0 = 2131362770(0x7f0a03d2, float:1.834533E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 20
            if (r2 <= r5) goto L_0x07ae
            british.x.config r5 = r1.f9940m
            java.lang.String r5 = r5.f7368l1
            british.p015x.C1692config.m8168S0(r0, r5)
        L_0x07ae:
            android.webkit.WebView r5 = r1.f9919G
            british.x.t_url$k r7 = new british.x.t_url$k
            r7.<init>(r0)
            r5.setWebViewClient(r7)
            android.webkit.WebView r0 = r1.f9919G
            android.webkit.WebSettings r0 = r0.getSettings()
            r5 = 1
            r0.setJavaScriptEnabled(r5)
            android.webkit.WebView r0 = r1.f9919G
            android.webkit.WebSettings r0 = r0.getSettings()
            android.webkit.WebSettings$PluginState r5 = android.webkit.WebSettings.PluginState.ON
            r0.setPluginState(r5)
            r0 = 17
            if (r2 < r0) goto L_0x07dc
            android.webkit.WebView r0 = r1.f9919G
            android.webkit.WebSettings r0 = r0.getSettings()
            r2 = 0
            r0.setMediaPlaybackRequiresUserGesture(r2)
            goto L_0x07dd
        L_0x07dc:
            r2 = 0
        L_0x07dd:
            british.x.config r0 = r1.f9940m
            boolean r5 = r0.f7311b5
            if (r5 == 0) goto L_0x07f7
            boolean r5 = r1.f9950u
            if (r5 != 0) goto L_0x07f7
            boolean r5 = r1.f9951v
            if (r5 != 0) goto L_0x07f7
            boolean r5 = r1.f9952w
            if (r5 != 0) goto L_0x07f7
            boolean r5 = r1.f9953x
            if (r5 != 0) goto L_0x07f7
            boolean r5 = r1.f9954y
            if (r5 == 0) goto L_0x080b
        L_0x07f7:
            boolean r0 = r0.f7317c5
            if (r0 != 0) goto L_0x080b
            boolean r0 = british.p015x.C1692config.m8205x0(r21)
            if (r0 == 0) goto L_0x080b
            android.webkit.WebView r0 = r1.f9919G
            r5 = 1
            r0.clearCache(r5)
            british.x.config r0 = r1.f9940m
            r0.f7317c5 = r5
        L_0x080b:
            android.webkit.WebView r0 = r1.f9919G
            android.webkit.WebSettings r0 = r0.getSettings()
            android.content.Context r5 = r21.getApplicationContext()
            java.io.File r5 = r5.getCacheDir()
            java.lang.String r5 = r5.getAbsolutePath()
            r0.setAppCachePath(r5)
            android.webkit.WebView r0 = r1.f9919G
            android.webkit.WebSettings r0 = r0.getSettings()
            r5 = 1
            r0.setAppCacheEnabled(r5)
            android.webkit.WebView r0 = r1.f9919G
            android.webkit.WebSettings r0 = r0.getSettings()
            r5 = -1
            r0.setCacheMode(r5)
            boolean r0 = british.p015x.C1692config.m8205x0(r21)
            if (r0 != 0) goto L_0x0869
            british.x.config r0 = r1.f9940m
            boolean r0 = r0.f7305a5
            if (r0 == 0) goto L_0x085f
            boolean r0 = r1.f9950u
            if (r0 != 0) goto L_0x085f
            boolean r0 = r1.f9951v
            if (r0 != 0) goto L_0x085f
            boolean r0 = r1.f9952w
            if (r0 != 0) goto L_0x085f
            boolean r0 = r1.f9953x
            if (r0 != 0) goto L_0x085f
            boolean r0 = r1.f9954y
            if (r0 != 0) goto L_0x085f
            android.webkit.WebView r0 = r1.f9919G
            android.webkit.WebSettings r0 = r0.getSettings()
            r5 = 1
            r0.setCacheMode(r5)
            goto L_0x0869
        L_0x085f:
            android.webkit.WebView r0 = r1.f9919G
            android.webkit.WebSettings r0 = r0.getSettings()
            r5 = 2
            r0.setCacheMode(r5)
        L_0x0869:
            boolean r0 = r1.f9954y
            if (r0 != 0) goto L_0x08c0
            british.x.config r0 = r1.f9940m
            int r5 = r0.f7318d
            r7 = -1
            if (r5 == r7) goto L_0x088b
            british.x.l[] r0 = r0.f7231O1
            r0 = r0[r5]
            java.lang.String r0 = r0.f7925j
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x088b
            british.x.config r0 = r1.f9940m
            british.x.l[] r5 = r0.f7231O1
            int r0 = r0.f7318d
            r0 = r5[r0]
            java.lang.String r0 = r0.f7925j
            goto L_0x088c
        L_0x088b:
            r0 = r3
        L_0x088c:
            boolean r5 = r0.equals(r3)
            if (r5 == 0) goto L_0x08b7
            android.webkit.WebView r0 = r1.f9919G
            android.webkit.WebSettings r0 = r0.getSettings()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            android.webkit.WebView r7 = r1.f9919G
            android.webkit.WebSettings r7 = r7.getSettings()
            java.lang.String r7 = r7.getUserAgentString()
            r5.append(r7)
            java.lang.String r7 = " Vinebre"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r0.setUserAgentString(r5)
            goto L_0x08c0
        L_0x08b7:
            android.webkit.WebView r5 = r1.f9919G
            android.webkit.WebSettings r5 = r5.getSettings()
            r5.setUserAgentString(r0)
        L_0x08c0:
            if (r6 != 0) goto L_0x0959
            android.os.Bundle r0 = r1.f9942n
            java.lang.String r0 = r0.getString(r4)
            int r4 = r1.f9914B
            r5 = 1
            if (r4 == r5) goto L_0x08fc
            java.lang.String r4 = r0.toLowerCase()
            java.lang.String r6 = "."
            int r6 = r4.lastIndexOf(r6)
            r7 = -1
            if (r6 == r7) goto L_0x08df
            java.lang.String r6 = r4.substring(r6)
            goto L_0x08e0
        L_0x08df:
            r6 = r3
        L_0x08e0:
            java.lang.String r7 = "."
            java.lang.String r3 = r6.replace(r7, r3)
            java.lang.String[] r6 = r1.f9929Q
            java.util.List r6 = java.util.Arrays.asList(r6)
            boolean r3 = r6.contains(r3)
            if (r3 == 0) goto L_0x08fc
            java.lang.String r3 = "docs.google.com"
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L_0x08fc
            r3 = 1
            goto L_0x08fd
        L_0x08fc:
            r3 = 0
        L_0x08fd:
            if (r3 == 0) goto L_0x091c
            java.lang.String r2 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r2)     // Catch:{ Exception -> 0x0905 }
        L_0x0905:
            android.webkit.WebView r2 = r1.f9919G
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "https://docs.google.com/viewer?embedded=true&url="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.loadUrl(r0)
            goto L_0x0943
        L_0x091c:
            boolean r2 = r1.f9954y
            if (r2 == 0) goto L_0x093e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x093e }
            r2.<init>()     // Catch:{ Exception -> 0x093e }
            r2.append(r0)     // Catch:{ Exception -> 0x093e }
            java.lang.String r3 = "&android_id="
            r2.append(r3)     // Catch:{ Exception -> 0x093e }
            android.content.ContentResolver r3 = r21.getContentResolver()     // Catch:{ Exception -> 0x093e }
            java.lang.String r4 = "android_id"
            java.lang.String r3 = android.provider.Settings.Secure.getString(r3, r4)     // Catch:{ Exception -> 0x093e }
            r2.append(r3)     // Catch:{ Exception -> 0x093e }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x093e }
        L_0x093e:
            android.webkit.WebView r2 = r1.f9919G
            r2.loadUrl(r0)
        L_0x0943:
            r0 = 2131362530(0x7f0a02e2, float:1.8344843E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.f9938Z = r0
            r0 = 2131362993(0x7f0a04b1, float:1.8345782E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.f9937Y = r0
        L_0x0959:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_url.onCreate(android.os.Bundle):void");
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        getMenuInflater().inflate(R.menu.m3, contextMenu);
        WebView.HitTestResult hitTestResult = this.f9919G.getHitTestResult();
        if (!this.f9918F || !(hitTestResult.getType() == 5 || hitTestResult.getType() == 8)) {
            contextMenu.removeItem(R.id.guardar);
        } else {
            MenuItem findItem = contextMenu.findItem(R.id.guardar);
            String str = findItem.getTitle() + "";
            findItem.setTitle(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        }
        if (!this.f9918F || !(hitTestResult.getType() == 5 || hitTestResult.getType() == 8)) {
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
        if (!(this.f9940m.f7384n3 == 0 || (cVar3 = this.f9923K) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f9940m.f7384n3 == 0 || (cVar2 = this.f9923K) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f9940m.f7384n3 == 0 || (cVar = this.f9923K) == null || (adColonyAdView = cVar.f6889d) == null)) {
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
            if (this.f9941m0 != null) {
                this.f9945p = false;
                this.f9943n0.onHideCustomView();
                return true;
            } else if (!this.f9919G.canGoBack() || this.f9949t) {
                boolean z = this.f6659e;
                if (z && !this.f9945p && this.f9940m.f7365k5) {
                    this.f9945p = true;
                    C1692config.m8199t(this);
                    return true;
                } else if (z && this.f9919G.getUrl() != null && (this.f9919G.getUrl().toLowerCase().contains("youtube.com") || this.f9919G.getUrl().toLowerCase().contains("youtu.be"))) {
                    startActivity(new Intent(this, finalizar.class));
                    finish();
                    return true;
                }
            } else {
                if (this.f9951v) {
                    try {
                        this.f9945p = false;
                        String url = this.f9919G.getUrl();
                        WebBackForwardList copyBackForwardList = this.f9919G.copyBackForwardList();
                        String url2 = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - 1).getUrl();
                        if (!url2.contains("tema_nuevo.php")) {
                            if (!url2.contains("resp_nueva.php")) {
                                if (!url2.contains("coment_nuevo.php")) {
                                    this.f9919G.goBack();
                                }
                            }
                        }
                        int i2 = 1;
                        while (true) {
                            if (!url2.contains("tema_nuevo.php") && !url2.contains("resp_nueva.php")) {
                                if (!url2.contains("coment_nuevo.php")) {
                                    if (!url.contains("tema_nuevo.php") && !url.contains("resp_nueva.php") && !url.contains("coment_nuevo.php")) {
                                        int i3 = i2 + 1;
                                        if (copyBackForwardList.getCurrentIndex() - i3 >= 0) {
                                            i2 = i3;
                                        }
                                    }
                                    url2 = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - i2).getUrl();
                                    if (!url2.contains("tema_nuevo.php") && !url2.contains("resp_nueva.php") && !url2.contains("coment_nuevo.php")) {
                                        break;
                                    }
                                }
                            }
                            i2++;
                            url2 = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - i2).getUrl();
                        }
                        this.f9919G.goBackOrForward(-i2);
                    } catch (Exception unused) {
                        this.f9945p = false;
                        this.f9919G.goBack();
                    }
                } else {
                    this.f9945p = false;
                    this.f9919G.goBack();
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
        if (!(this.f9940m.f7384n3 == 0 || (cVar = this.f9923K) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        if (this.f9941m0 != null) {
            this.f9943n0.onHideCustomView();
        }
        super.onPause();
        C1692config.m8162O0(this);
        WebView webView = this.f9919G;
        if (webView != null) {
            webView.onPause();
            if (this.f6657c || isFinishing()) {
                try {
                    this.f9919G.loadData("", "text/html", "utf-8");
                } catch (Exception unused) {
                }
            }
        }
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2465b());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 103) {
            if (i == 105 && this.f9925M != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : this.f9925M.getResources()) {
                    if (str.contains("AUDIO_CAPTURE") && C0600b.m3289a(this, "android.permission.RECORD_AUDIO") == 0 && C0600b.m3289a(this, "android.permission.MODIFY_AUDIO_SETTINGS") == 0) {
                        arrayList.add(str);
                    }
                    if (str.contains("VIDEO_CAPTURE") && C0600b.m3289a(this, "android.permission.CAMERA") == 0) {
                        arrayList.add(str);
                    }
                }
                if (!arrayList.isEmpty()) {
                    try {
                        this.f9925M.grant((String[]) arrayList.toArray(new String[0]));
                    } catch (Exception unused) {
                    }
                } else {
                    this.f9925M.deny();
                }
            }
        } else if (C1692config.m8166R0(this) && iArr.length > 0 && strArr[0].equals("android.permission.ACCESS_FINE_LOCATION") && iArr[0] == 0) {
            this.f9920H.invoke(this.f9921I, true, false);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        WebView webView = this.f9919G;
        if (webView != null) {
            webView.restoreState(bundle);
        }
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (!(this.f9940m.f7384n3 == 0 || (cVar = this.f9923K) == null || (adView = cVar.f6886a) == null)) {
            adView.resume();
        }
        WebView webView = this.f9919G;
        if (webView != null) {
            webView.onResume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f9924L = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f9924L) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f9924L = true;
        C1692config.m8175Y0(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        WebView webView = this.f9919G;
        if (webView != null) {
            webView.saveState(bundle);
        }
    }

    public boolean onSearchRequested() {
        this.f6657c = true;
        this.f6658d = true;
        return super.onSearchRequested();
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
        if (this.f6657c && !this.f6658d) {
            finish();
        }
    }

    public void onVideoCompleted() {
        this.f9924L = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f9924L = true;
        C1692config.m8175Y0(this);
    }
}
