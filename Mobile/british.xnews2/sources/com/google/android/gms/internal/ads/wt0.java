package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;

@TargetApi(11)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wt0 extends WebChromeClient {

    /* renamed from: a */
    private final xt0 f40899a;

    public wt0(xt0 xt0) {
        this.f40899a = xt0;
    }

    /* renamed from: b */
    private static final Context m39258b(WebView webView) {
        if (!(webView instanceof xt0)) {
            return webView.getContext();
        }
        xt0 xt0 = (xt0) webView;
        Activity zzk = xt0.zzk();
        if (zzk != null) {
            return zzk;
        }
        return xt0.getContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo35671a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzb zzd;
        try {
            xt0 xt0 = this.f40899a;
            if (xt0 == null || xt0.mo18793u0() == null || this.f40899a.mo18793u0().zzd() == null || (zzd = this.f40899a.mo18793u0().zzd()) == null || zzd.zzc()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    builder.setView(linearLayout).setPositiveButton(17039370, new ut0(jsPromptResult, editText)).setNegativeButton(17039360, new tt0(jsPromptResult)).setOnCancelListener(new st0(jsPromptResult)).create().show();
                } else {
                    builder.setMessage(str3).setPositiveButton(17039370, new rt0(jsResult)).setNegativeButton(17039360, new qt0(jsResult)).setOnCancelListener(new pt0(jsResult)).create().show();
                }
                return true;
            }
            StringBuilder sb = new StringBuilder(str.length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            zzd.zzb(sb.toString());
            return false;
        } catch (WindowManager.BadTokenException e) {
            co0.zzk("Fail to display Dialog.", e);
        }
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof xt0)) {
            co0.zzj("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        zzl h = ((xt0) webView).mo18752h();
        if (h == null) {
            co0.zzj("Tried to close an AdWebView not associated with an overlay.");
        } else {
            h.zzb();
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = vt0.f40548a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            co0.zzg(sb2);
        } else if (i == 2) {
            co0.zzj(sb2);
        } else if (i == 3 || i == 4) {
            co0.zzi(sb2);
        } else if (i != 5) {
            co0.zzi(sb2);
        } else {
            co0.zze(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f40899a.zzJ() != null) {
            webView2.setWebViewClient(this.f40899a.zzJ());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = CacheDataSink.DEFAULT_FRAGMENT_SIZE - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(j + Math.min(131072, j4), 1048576);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            zzt.zzp();
            if (!com.google.android.gms.ads.internal.util.zzt.zzF(this.f40899a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzt.zzp();
                if (!com.google.android.gms.ads.internal.util.zzt.zzF(this.f40899a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        zzl h = this.f40899a.mo18752h();
        if (h == null) {
            co0.zzj("Could not get ad overlay when hiding custom view.");
        } else {
            h.zzf();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return mo35671a(m39258b(webView), "alert", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return mo35671a(m39258b(webView), "onBeforeUnload", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return mo35671a(m39258b(webView), "confirm", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return mo35671a(m39258b(webView), "prompt", str, str2, str3, (JsResult) null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = j + 131072;
        if (CacheDataSink.DEFAULT_FRAGMENT_SIZE - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        zzl h = this.f40899a.mo18752h();
        if (h == null) {
            co0.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        h.zzA(view, customViewCallback);
        h.zzy(i);
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
