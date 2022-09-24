package com.ironsource.sdk.p288c;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.ironsource.sdk.C11515a;
import com.ironsource.sdk.p286a.C11516a;
import com.ironsource.sdk.p286a.C11520d;
import com.ironsource.sdk.p286a.C11522f;
import com.ironsource.sdk.p287b.C11525a;
import com.ironsource.sdk.p287b.C11526b;
import com.ironsource.sdk.p287b.C11528c;
import com.ironsource.sdk.p288c.C11541e;
import com.ironsource.sdk.utils.C11759d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.c.c */
public class C11535c implements C11541e {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String f51863g = "c";

    /* renamed from: a */
    public final String f51864a;

    /* renamed from: b */
    private final String f51865b;

    /* renamed from: c */
    public C11526b f51866c;

    /* renamed from: d */
    public C11515a f51867d;

    /* renamed from: e */
    public Activity f51868e;
    /* access modifiers changed from: package-private */

    /* renamed from: f */
    public WebView f51869f;

    /* renamed from: com.ironsource.sdk.c.c$a */
    class C11537a implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f51874b;

        /* renamed from: c */
        private /* synthetic */ String f51875c;

        C11537a(String str, String str2) {
            this.f51874b = str;
            this.f51875c = str2;
        }

        public final void run() {
            Logger.m51953i(C11535c.f51863g, "performCleanup");
            try {
                if (C11535c.this.f51869f != null) {
                    C11535c.this.f51869f.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C11535c.this.f51864a);
                if (C11535c.this.f51866c != null) {
                    C11535c.this.f51866c.mo44611a(this.f51874b, jSONObject);
                    C11526b h = C11535c.this.f51866c;
                    h.f51835b = null;
                    h.f51836c = null;
                    C11526b.f51834a = null;
                }
                C11526b unused = C11535c.this.f51866c = null;
                Activity unused2 = C11535c.this.f51868e = null;
            } catch (Exception e) {
                String e2 = C11535c.f51863g;
                Log.e(e2, "performCleanup | could not destroy ISNAdView webView ID: " + C11535c.this.f51864a);
                C11520d.m51360a(C11522f.f51817p, (Map<String, Object>) new C11516a().mo44598a("callfailreason", e.getMessage()).f51793a);
                C11535c.this.mo44632b(this.f51875c, e.getMessage());
            }
        }
    }

    /* renamed from: com.ironsource.sdk.c.c$b */
    class C11538b implements C11541e.C11542a {

        /* renamed from: a */
        private /* synthetic */ String f51877a;

        C11538b(String str) {
            this.f51877a = str;
        }

        /* renamed from: a */
        public final void mo44636a(String str) {
            String e = C11535c.f51863g;
            Logger.m51953i(e, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            C11535c.this.mo44632b(this.f51877a, str);
        }

        /* renamed from: b */
        public final void mo44637b(String str) {
            String e = C11535c.f51863g;
            Logger.m51953i(e, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) C11535c.this.f51869f.getParent()).removeView(C11535c.this.f51869f);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            C11535c.this.m51400i();
        }
    }

    public C11535c(C11525a aVar, Activity activity, String str, C11515a aVar2) {
        this.f51868e = activity;
        C11526b bVar = new C11526b();
        this.f51866c = bVar;
        bVar.f51838e = str;
        this.f51865b = IronSourceStorageUtils.getNetworkStorageDir(activity.getApplicationContext());
        this.f51864a = str;
        this.f51866c.f51835b = aVar;
        this.f51867d = aVar2;
    }

    /* renamed from: d */
    static /* synthetic */ void m51395d(C11535c cVar, String str) {
        Logger.m51953i(f51863g, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(cVar.f51868e);
        cVar.f51869f = webView;
        webView.addJavascriptInterface(new C11534b(cVar), "containerMsgHandler");
        cVar.f51869f.setWebViewClient(new C11528c(new C11538b(str)));
        C11759d.m51981a(cVar.f51869f);
        cVar.f51866c.f51837d = cVar.f51869f;
    }

    /* renamed from: g */
    static /* synthetic */ String m51398g(C11535c cVar, String str) {
        if (!str.startsWith(".")) {
            return str;
        }
        StringBuilder sb = new StringBuilder("file://");
        sb.append(cVar.f51865b);
        String substring = str.substring(str.indexOf("/") + 1);
        sb.append(substring.substring(substring.indexOf("/")));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public synchronized void m51400i() {
        mo44622a("", "");
    }

    /* renamed from: a */
    public final WebView mo44621a() {
        return this.f51869f;
    }

    /* renamed from: a */
    public final synchronized void mo44622a(String str, String str2) {
        Activity activity = this.f51868e;
        if (activity != null) {
            activity.runOnUiThread(new C11537a(str, str2));
        }
    }

    /* renamed from: a */
    public final void mo44623a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            mo44632b(str3, "action parameter empty");
            return;
        }
        String str4 = f51863g;
        Logger.m51953i(str4, "trying to perform WebView Action: " + str);
        try {
            if (str.equals("onPause")) {
                this.f51869f.onPause();
            } else if (str.equals("onResume")) {
                this.f51869f.onResume();
            } else {
                mo44632b(str3, "action not supported");
                return;
            }
            this.f51866c.mo44607a(str2);
        } catch (Exception unused) {
            mo44632b(str3, "failed to perform action");
        }
    }

    /* renamed from: a */
    public final void mo44624a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f51866c.mo44612b(str);
        } catch (Exception e) {
            String str3 = f51863g;
            Logger.m51953i(str3, "sendHandleGetViewVisibility fail with reason: " + e.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo44632b(String str, String str2) {
        C11526b bVar = this.f51866c;
        if (bVar != null) {
            bVar.mo44609a(str, str2);
        }
    }

    /* renamed from: b */
    public final void mo44625b(JSONObject jSONObject, String str, String str2) {
        try {
            this.f51866c.mo44610a(jSONObject.getString("params"), str, str2);
        } catch (Exception e) {
            String str3 = f51863g;
            Logger.m51953i(str3, "sendMessageToAd fail message: " + e.getMessage());
            throw e;
        }
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        C11526b bVar = this.f51866c;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("method");
            if (TextUtils.isEmpty(optString) || !bVar.mo44613c(optString)) {
                bVar.mo44611a("containerSendMessage", jSONObject);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                bVar.mo44610a(bVar.mo44606a(jSONObject).toString(), (String) null, (String) null);
            }
        } catch (JSONException e) {
            String str2 = bVar.f51839f;
            Log.e(str2, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            e.printStackTrace();
        }
    }
}
