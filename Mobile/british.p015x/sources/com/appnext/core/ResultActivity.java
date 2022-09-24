package com.appnext.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.appnext.base.C3117a;
import com.google.android.exoplayer2.C6540C;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ResultActivity extends Activity {

    /* renamed from: dX */
    private Intent f12259dX;
    /* access modifiers changed from: private */
    public WebView webView;

    /* renamed from: b */
    static /* synthetic */ void m10655b(ResultActivity resultActivity, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        resultActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static Intent m10656t(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return intent;
    }

    public final boolean hasNewResolver(Intent intent) {
        if (this.f12259dX == null) {
            return intent != null;
        }
        if (intent == null) {
            return false;
        }
        List<ComponentName> a = m10654a((Context) this, intent);
        HashSet hashSet = new HashSet();
        hashSet.addAll(m10654a((Context) this, this.f12259dX));
        for (ComponentName contains : a) {
            if (!hashSet.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    public void onBackPressed() {
        try {
            WebView webView2 = this.webView;
            if (webView2 == null || !webView2.canGoBack()) {
                super.onBackPressed();
            } else {
                this.webView.goBack();
            }
        } catch (Throwable th) {
            C3117a.m10553a("ResultActivity$onBackPressed", th);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onCreate(Bundle bundle) {
        Intent selector;
        requestWindowFeature(1);
        super.onCreate(bundle);
        try {
            LinearLayout linearLayout = new LinearLayout(this);
            setContentView(linearLayout);
            linearLayout.setOrientation(1);
            WebView webView2 = new WebView(getApplicationContext());
            this.webView = webView2;
            webView2.getSettings().setTextZoom(100);
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
            if (i >= 19) {
                this.webView.setLayerType(2, (Paint) null);
            } else {
                this.webView.setLayerType(1, (Paint) null);
            }
            this.webView.setWebViewClient(new WebViewClient() {
                public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    if (Build.VERSION.SDK_INT < 26 || renderProcessGoneDetail.didCrash()) {
                        return false;
                    }
                    if (ResultActivity.this.webView == null) {
                        return true;
                    }
                    ResultActivity.this.webView.destroy();
                    WebView unused = ResultActivity.this.webView = null;
                    return true;
                }

                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    String str2;
                    if (str == null) {
                        return false;
                    }
                    try {
                        if (str.startsWith("http")) {
                            ResultActivity resultActivity = ResultActivity.this;
                            if (resultActivity.hasNewResolver(ResultActivity.m10656t(str).setComponent((ComponentName) null))) {
                                ResultActivity.m10655b(ResultActivity.this, str);
                            } else {
                                webView.loadUrl(str);
                            }
                            return true;
                        } else if (str.startsWith("intent://")) {
                            Intent parseUri = Intent.parseUri(str, 1);
                            if (ResultActivity.this.getPackageManager().resolveActivity(parseUri, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE) != null) {
                                ResultActivity.m10655b(ResultActivity.this, parseUri.getData().toString());
                                return true;
                            }
                            if (parseUri.getExtras() != null) {
                                if (parseUri.getExtras().containsKey("browser_fallback_url") && !parseUri.getExtras().getString("browser_fallback_url").equals("")) {
                                    str2 = parseUri.getExtras().getString("browser_fallback_url");
                                    ResultActivity.m10655b(ResultActivity.this, str2);
                                    return true;
                                }
                            }
                            if (parseUri.getExtras().containsKey("market_referrer") && !parseUri.getExtras().getString("market_referrer").equals("")) {
                                str2 = "market://details?id=" + parseUri.getPackage() + "&referrer=" + parseUri.getExtras().getString("market_referrer");
                                ResultActivity.m10655b(ResultActivity.this, str2);
                            }
                            return true;
                        } else {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(str));
                            try {
                                if (ResultActivity.this.getPackageManager().queryIntentActivities(intent, 0).size() <= 0) {
                                    return false;
                                }
                                ResultActivity.m10655b(ResultActivity.this, str);
                                return true;
                            } catch (Throwable th) {
                                C3117a.m10553a("ResultActivity$onCreate", th);
                                return false;
                            }
                        }
                    } catch (Throwable th2) {
                        C3117a.m10553a("ResultActivity$onCreate", th2);
                        return false;
                    }
                }
            });
            linearLayout.addView(this.webView);
            this.webView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
            ((LinearLayout.LayoutParams) this.webView.getLayoutParams()).weight = 1.0f;
            String string = getIntent().getExtras().getString("url");
            getIntent().getExtras().getString("title");
            Intent component = new Intent(m10656t(string)).setComponent((ComponentName) null);
            this.f12259dX = component;
            if (i >= 15 && (selector = component.getSelector()) != null) {
                selector.setComponent((ComponentName) null);
            }
            this.webView.loadUrl(string);
        } catch (Throwable th) {
            C3117a.m10553a("ResultActivity$onCreate", th);
            finish();
        }
    }

    /* renamed from: a */
    private static List m10654a(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            arrayList.add(new ComponentName(activityInfo.packageName, activityInfo.name));
        }
        return arrayList;
    }
}
