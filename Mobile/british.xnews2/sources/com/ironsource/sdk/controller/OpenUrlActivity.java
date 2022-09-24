package com.ironsource.sdk.controller;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ironsource.sdk.p289d.C11675b;
import com.ironsource.sdk.utils.C11756b;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.List;

public class OpenUrlActivity extends Activity {

    /* renamed from: k */
    private static final int f51910k = SDKUtils.generateViewId();

    /* renamed from: l */
    private static final int f51911l = SDKUtils.generateViewId();

    /* renamed from: b */
    private WebView f51912b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C11618w f51913c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ProgressBar f51914d;

    /* renamed from: e */
    private boolean f51915e;

    /* renamed from: f */
    private RelativeLayout f51916f;

    /* renamed from: g */
    private String f51917g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Handler f51918h = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f51919i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Runnable f51920j = new C11549b();

    /* renamed from: com.ironsource.sdk.controller.OpenUrlActivity$a */
    class C11548a implements View.OnSystemUiVisibilityChangeListener {
        C11548a() {
        }

        public final void onSystemUiVisibilityChange(int i) {
            if ((i & 4098) == 0) {
                OpenUrlActivity.this.f51918h.removeCallbacks(OpenUrlActivity.this.f51920j);
                OpenUrlActivity.this.f51918h.postDelayed(OpenUrlActivity.this.f51920j, 500);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.OpenUrlActivity$b */
    class C11549b implements Runnable {
        C11549b() {
        }

        public final void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.f51919i));
        }
    }

    /* renamed from: com.ironsource.sdk.controller.OpenUrlActivity$c */
    class C11550c extends WebViewClient {
        private C11550c() {
        }

        /* synthetic */ C11550c(OpenUrlActivity openUrlActivity, byte b) {
            this();
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f51914d.setVisibility(4);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f51914d.setVisibility(0);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.m51951e("OpenUrlActivity", "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            List<String> b = C11756b.m51963a().mo45072b();
            if (!b.isEmpty()) {
                for (String contains : b) {
                    if (str.contains(contains)) {
                        try {
                            OpenUrlActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            OpenUrlActivity.this.f51913c.mo44786b();
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder();
                            if (e instanceof ActivityNotFoundException) {
                                sb.append("no activity to handle url");
                            } else {
                                sb.append("activity failed to open with unspecified reason");
                            }
                            if (OpenUrlActivity.this.f51913c != null) {
                                C11618w d = OpenUrlActivity.this.f51913c;
                                String sb2 = sb.toString();
                                if (TextUtils.isEmpty(str)) {
                                    str = "unknown url";
                                }
                                d.mo44787b(C11618w.m51601b("failedToStartStoreActivity", C11618w.m51598a("errMsg", TextUtils.isEmpty(sb2) ? "activity failed to open with unspecified reason" : sb2, "url", str, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                            }
                        }
                        OpenUrlActivity.this.finish();
                        return true;
                    }
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public void finish() {
        C11618w wVar;
        if (this.f51915e && (wVar = this.f51913c) != null) {
            wVar.mo44789e("secondaryClose");
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f51912b.stopLoading();
        this.f51912b.clearHistory();
        try {
            this.f51912b.loadUrl(str);
        } catch (Throwable th) {
            Logger.m51951e("OpenUrlActivity", "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    public void onBackPressed() {
        if (this.f51912b.canGoBack()) {
            this.f51912b.goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.m51953i("OpenUrlActivity", "onCreate()");
        try {
            this.f51913c = (C11618w) C11675b.m51709a((Context) this).f52282a.f51962a;
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            Bundle extras = getIntent().getExtras();
            this.f51917g = extras.getString(C11618w.f52117c);
            this.f51915e = extras.getBoolean(C11618w.f52118d);
            boolean booleanExtra = getIntent().getBooleanExtra("immersive", false);
            this.f51919i = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new C11548a());
                runOnUiThread(this.f51920j);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f51916f = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.f51912b;
        if (webView != null) {
            webView.destroy();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f51919i && (i == 25 || i == 24)) {
            this.f51918h.postDelayed(this.f51920j, 500);
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        ViewGroup viewGroup;
        super.onPause();
        C11618w wVar = this.f51913c;
        if (wVar != null) {
            wVar.mo44785a(false, "secondary");
            if (this.f51916f != null && (viewGroup = (ViewGroup) this.f51912b.getParent()) != null) {
                if (viewGroup.findViewById(f51910k) != null) {
                    viewGroup.removeView(this.f51912b);
                }
                if (viewGroup.findViewById(f51911l) != null) {
                    viewGroup.removeView(this.f51914d);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f51912b == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f51912b = webView;
            webView.setId(f51910k);
            this.f51912b.getSettings().setJavaScriptEnabled(true);
            this.f51912b.setWebViewClient(new C11550c(this, (byte) 0));
            loadUrl(this.f51917g);
        }
        if (findViewById(f51910k) == null) {
            this.f51916f.addView(this.f51912b, new RelativeLayout.LayoutParams(-1, -1));
        }
        if (this.f51914d == null) {
            this.f51914d = Build.VERSION.SDK_INT >= 11 ? new ProgressBar(new ContextThemeWrapper(this, 16973939)) : new ProgressBar(this);
            this.f51914d.setId(f51911l);
        }
        if (findViewById(f51911l) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f51914d.setLayoutParams(layoutParams);
            this.f51914d.setVisibility(4);
            this.f51916f.addView(this.f51914d);
        }
        C11618w wVar = this.f51913c;
        if (wVar != null) {
            wVar.mo44785a(true, "secondary");
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f51919i && z) {
            runOnUiThread(this.f51920j);
        }
    }
}
