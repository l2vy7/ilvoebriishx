package com.appnext.core;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appnext.base.C3117a;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.text.cea.Cea608Decoder;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.appnext.core.f */
public class C3187f {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: dm */
    private static C3187f f12318dm;
    /* access modifiers changed from: private */
    public Context context;
    /* access modifiers changed from: private */

    /* renamed from: df */
    public WebView f12319df;
    /* access modifiers changed from: private */

    /* renamed from: dg */
    public WebView f12320dg;
    /* access modifiers changed from: private */

    /* renamed from: dh */
    public C3196a f12321dh;

    /* renamed from: di */
    private Runnable f12322di;

    /* renamed from: dj */
    private List f12323dj;
    /* access modifiers changed from: private */

    /* renamed from: dk */
    public final ArrayList<C3197b> f12324dk = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: dl */
    public int f12325dl;
    private Handler handler;

    /* renamed from: com.appnext.core.f$a */
    public interface C3196a {
        void error(String str);

        void onMarket(String str);
    }

    /* renamed from: com.appnext.core.f$b */
    private class C3197b {

        /* renamed from: du */
        String f12343du;

        /* renamed from: dv */
        String f12344dv;

        /* renamed from: dw */
        C3196a f12345dw;

        /* renamed from: dx */
        String f12346dx;

        /* renamed from: dy */
        long f12347dy;

        /* renamed from: v */
        String f12348v;

        C3197b(String str, String str2, String str3, String str4, C3196a aVar, long j) {
            this.f12343du = str;
            this.f12344dv = str2;
            this.f12348v = str3;
            this.f12345dw = aVar;
            this.f12346dx = str4;
            this.f12347dy = j;
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private C3187f(Context context2) {
        try {
            this.context = context2.getApplicationContext();
            this.handler = new Handler(Looper.getMainLooper());
            this.f12325dl = 0;
            this.f12321dh = new C3196a() {
                public final void error(String str) {
                    C3187f.this.f12325dl = 0;
                    if (C3187f.this.f12324dk.size() != 0) {
                        C3196a aVar = ((C3197b) C3187f.this.f12324dk.get(0)).f12345dw;
                        if (aVar != null) {
                            aVar.error(str);
                        }
                        C3187f.this.m10755as();
                    }
                }

                public final void onMarket(String str) {
                    try {
                        C3187f.this.f12325dl = 0;
                        if (C3187f.this.f12324dk.size() != 0) {
                            C3196a aVar = ((C3197b) C3187f.this.f12324dk.get(0)).f12345dw;
                            if (aVar != null) {
                                aVar.onMarket(str);
                            }
                            String str2 = "";
                            if (C3187f.this.f12324dk != null && !C3187f.this.f12324dk.isEmpty()) {
                                str2 = "https://admin.appnext.com/tools/navtac.html?bid=" + ((C3197b) C3187f.this.f12324dk.get(0)).f12346dx + "&guid=" + C3198g.m10794f("admin.appnext.com", "applink") + "&url=" + URLEncoder.encode(str, C6540C.UTF8_NAME);
                            }
                            if (C3187f.this.f12320dg == null) {
                                WebView unused = C3187f.this.f12320dg = new WebView(C3187f.this.context);
                                C3187f.this.f12320dg.getSettings().setJavaScriptEnabled(true);
                                C3187f.this.f12320dg.getSettings().setDomStorageEnabled(true);
                                if (Build.VERSION.SDK_INT >= 21) {
                                    C3187f.this.f12320dg.getSettings().setMixedContentMode(0);
                                }
                                C3187f.this.f12320dg.setWebViewClient(new WebViewClient() {
                                    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                                        if (Build.VERSION.SDK_INT < 26 || renderProcessGoneDetail.didCrash()) {
                                            return false;
                                        }
                                        if (C3187f.this.f12320dg == null) {
                                            return true;
                                        }
                                        C3187f.this.f12320dg.destroy();
                                        WebView unused = C3187f.this.f12320dg = null;
                                        return true;
                                    }

                                    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                                        if (str == null) {
                                            return false;
                                        }
                                        try {
                                            if (str.contains("about:blank")) {
                                                return false;
                                            }
                                            webView.loadUrl(str);
                                            return true;
                                        } catch (Throwable th) {
                                            C3117a.m10553a("AppnextCK$AppnextCK", th);
                                            return false;
                                        }
                                    }
                                });
                            }
                            C3187f.this.f12320dg.loadUrl("about:blank");
                            C3187f.this.f12320dg.loadUrl(str2);
                            C3187f.this.m10756at();
                            C3187f.this.m10755as();
                        }
                    } catch (UnsupportedEncodingException e) {
                        C3117a.m10553a("AppnextCK$AppnextCK", e);
                        C3187f.this.m10755as();
                    } catch (Throwable th) {
                        C3117a.m10553a("AppnextCK$AppnextCK", th);
                    }
                }
            };
            this.f12322di = new Runnable() {
                public final void run() {
                    if (!(C3187f.this.f12321dh == null || C3187f.this.f12319df == null)) {
                        C3187f.this.f12321dh.error(C3187f.this.f12319df.getUrl());
                        C3187f.this.f12319df.stopLoading();
                    }
                    C3187f.this.m10755as();
                }
            };
        } catch (Throwable th) {
            C3117a.m10553a("AppnextCK$AppnextCK", th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public void m10755as() {
        try {
            this.f12325dl = 0;
            if (this.f12324dk.size() != 0) {
                String str = this.f12324dk.get(0).f12348v;
                this.f12324dk.get(0).f12345dw = null;
                this.f12324dk.remove(0);
                this.f12324dk.size();
                mo10787a((String) null, (String) null, (String) null, (String) null, (C3196a) null);
            }
        } catch (Throwable th) {
            C3117a.m10553a("AppnextCK$loadNext", th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: at */
    public void m10756at() {
        Handler handler2 = this.handler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r7.startsWith("https://play.google.com/store") != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0097 A[Catch:{ all -> 0x0074, all -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openMarket(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "com.android.vending"
            java.lang.String r1 = "market://"
            boolean r1 = r7.startsWith(r1)     // Catch:{ all -> 0x009b }
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            java.lang.String r3 = "android.intent.action.VIEW"
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = "https://play.google.com/store"
            boolean r1 = r7.startsWith(r1)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x007b
        L_0x0016:
            boolean r1 = r6.m10766s(r0)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x007b
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0074 }
            android.net.Uri r4 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x0074 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0074 }
            android.content.Context r3 = r6.context     // Catch:{ all -> 0x0074 }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ all -> 0x0074 }
            r4 = 0
            java.util.List r3 = r3.queryIntentActivities(r1, r4)     // Catch:{ all -> 0x0074 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0074 }
        L_0x0034:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0074 }
            if (r4 == 0) goto L_0x0093
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0074 }
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4     // Catch:{ all -> 0x0074 }
            android.content.pm.ActivityInfo r5 = r4.activityInfo     // Catch:{ all -> 0x0074 }
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo     // Catch:{ all -> 0x0074 }
            java.lang.String r5 = r5.packageName     // Catch:{ all -> 0x0074 }
            boolean r5 = r5.equals(r0)     // Catch:{ all -> 0x0074 }
            if (r5 == 0) goto L_0x0034
            android.content.pm.ActivityInfo r0 = r4.activityInfo     // Catch:{ all -> 0x0074 }
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch:{ all -> 0x0074 }
            android.content.pm.ApplicationInfo r4 = r0.applicationInfo     // Catch:{ all -> 0x0074 }
            java.lang.String r4 = r4.packageName     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = r0.name     // Catch:{ all -> 0x0074 }
            r3.<init>(r4, r0)     // Catch:{ all -> 0x0074 }
            r1.addFlags(r2)     // Catch:{ all -> 0x0074 }
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1.addFlags(r0)     // Catch:{ all -> 0x0074 }
            r0 = 131072(0x20000, float:1.83671E-40)
            r1.addFlags(r0)     // Catch:{ all -> 0x0074 }
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1.addFlags(r0)     // Catch:{ all -> 0x0074 }
            r1.setComponent(r3)     // Catch:{ all -> 0x0074 }
            android.content.Context r0 = r6.context     // Catch:{ all -> 0x0074 }
            r0.startActivity(r1)     // Catch:{ all -> 0x0074 }
            goto L_0x0093
        L_0x0074:
            r0 = move-exception
            java.lang.String r1 = "AppnextCK$openMarketOnGooglePlay"
            com.appnext.base.C3117a.m10553a(r1, r0)     // Catch:{ all -> 0x009b }
            goto L_0x0093
        L_0x007b:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x008d }
            android.net.Uri r1 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x008d }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x008d }
            r0.setFlags(r2)     // Catch:{ all -> 0x008d }
            android.content.Context r1 = r6.context     // Catch:{ all -> 0x008d }
            r1.startActivity(r0)     // Catch:{ all -> 0x008d }
            goto L_0x0093
        L_0x008d:
            r0 = move-exception
            java.lang.String r1 = "AppnextCK$openMarketOnStore"
            com.appnext.base.C3117a.m10553a(r1, r0)     // Catch:{ all -> 0x009b }
        L_0x0093:
            com.appnext.core.f$a r0 = r6.f12321dh     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x009a
            r0.onMarket(r7)     // Catch:{ all -> 0x009b }
        L_0x009a:
            return
        L_0x009b:
            r0 = move-exception
            java.lang.String r1 = "AppnextCK$openMarket"
            com.appnext.base.C3117a.m10553a(r1, r0)
            com.appnext.core.f$a r0 = r6.f12321dh
            if (r0 == 0) goto L_0x00a8
            r0.error(r7)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C3187f.openMarket(java.lang.String):void");
    }

    /* renamed from: s */
    private boolean m10766s(String str) {
        try {
            this.context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static Intent m10767t(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return intent;
    }

    /* renamed from: f */
    public static C3187f m10764f(Context context2) {
        if (f12318dm == null) {
            synchronized (C3187f.class) {
                if (f12318dm == null) {
                    f12318dm = new C3187f(context2);
                }
            }
        }
        return f12318dm;
    }

    /* renamed from: d */
    public final void mo10789d(final AppnextAd appnextAd) {
        C3211o.m10825az().mo10821a(new Runnable() {
            public final void run() {
                try {
                    C3198g.m10776a(C3187f.this.context, appnextAd.getImpressionURL(), (HashMap<String, String>) null);
                } catch (Throwable th) {
                    C3117a.m10553a("AppnextCK$adImpression", th);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo10787a(String str, String str2, String str3, String str4, C3196a aVar) {
        mo10788a(str, str2, str3, str4, aVar, Cea608Decoder.MIN_DATA_CHANNEL_TIMEOUT_MS);
    }

    /* renamed from: a */
    public final void mo10788a(String str, String str2, String str3, String str4, C3196a aVar, long j) {
        String str5 = str3;
        try {
            if (this.context != null) {
                if (str5 != null) {
                    Iterator<C3197b> it = this.f12324dk.iterator();
                    while (it.hasNext()) {
                        C3197b next = it.next();
                        if (!TextUtils.isEmpty(next.f12348v) && next.f12348v.equals(str5)) {
                            return;
                        }
                    }
                    if (str5.endsWith("&ox=0")) {
                        this.f12324dk.add(new C3197b(str, str2, str3, str4, aVar, j));
                    } else {
                        this.f12325dl = 0;
                        if (this.f12324dk.size() > 0 && !this.f12324dk.get(0).f12348v.endsWith("&ox=0")) {
                            String str6 = this.f12324dk.get(0).f12348v;
                            this.f12324dk.get(0).f12345dw = null;
                            this.f12324dk.remove(0);
                            this.f12324dk.size();
                        }
                        this.f12324dk.add(0, new C3197b(str, str2, str3, str4, aVar, j));
                    }
                }
                if (this.f12324dk.size() > 0 && this.f12325dl != 1) {
                    this.f12325dl = 1;
                    String str7 = this.f12324dk.get(0).f12346dx;
                    String str8 = this.f12324dk.get(0).f12348v;
                    m10752a(this.f12324dk.get(0));
                }
            }
        } catch (Throwable th) {
            C3117a.m10553a("AppnextCK$load", th);
        }
    }

    /* renamed from: a */
    public final void mo10786a(String str, C3196a aVar) {
        if (!TextUtils.isEmpty(str)) {
            openMarket(str);
        } else if (aVar != null) {
            aVar.error(str);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: a */
    private void m10752a(final C3197b bVar) {
        try {
            if (!TextUtils.isEmpty(bVar.f12344dv)) {
                openMarket(bVar.f12344dv);
                C3211o.m10825az().mo10821a(new Runnable() {
                    public final void run() {
                        try {
                            C3198g.m10776a(C3187f.this.context, bVar.f12343du, (HashMap<String, String>) null);
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            }
            m10756at();
            if (this.f12319df == null) {
                WebView webView = new WebView(this.context);
                this.f12319df = webView;
                webView.getSettings().setJavaScriptEnabled(true);
                this.f12319df.getSettings().setDomStorageEnabled(true);
                if (Build.VERSION.SDK_INT >= 21) {
                    this.f12319df.getSettings().setMixedContentMode(0);
                }
                this.f12319df.setWebViewClient(new WebViewClient() {
                    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                        if (Build.VERSION.SDK_INT < 26 || renderProcessGoneDetail.didCrash()) {
                            return false;
                        }
                        if (C3187f.this.f12319df == null) {
                            return true;
                        }
                        C3187f.this.f12319df.destroy();
                        WebView unused = C3187f.this.f12319df = null;
                        return true;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:38:0x00dd A[Catch:{ all -> 0x00fe }] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r7, java.lang.String r8) {
                        /*
                            r6 = this;
                            java.lang.String r0 = "browser_fallback_url"
                            java.lang.String r1 = "market_referrer"
                            r2 = 0
                            if (r8 != 0) goto L_0x0008
                            return r2
                        L_0x0008:
                            java.lang.String r3 = "https://play.google.com/store/apps/"
                            boolean r4 = r8.startsWith(r3)
                            if (r4 == 0) goto L_0x0016
                            java.lang.String r4 = "market://"
                            java.lang.String r8 = r8.replace(r3, r4)
                        L_0x0016:
                            java.lang.String r3 = "about:blank"
                            boolean r3 = r8.contains(r3)
                            if (r3 == 0) goto L_0x001f
                            return r2
                        L_0x001f:
                            java.lang.String r3 = "http://"
                            boolean r3 = r8.startsWith(r3)
                            r4 = 1
                            if (r3 != 0) goto L_0x0143
                            java.lang.String r3 = "https://"
                            boolean r3 = r8.startsWith(r3)
                            if (r3 != 0) goto L_0x0143
                            java.lang.String r3 = "intent://"
                            boolean r3 = r8.startsWith(r3)
                            if (r3 == 0) goto L_0x00ff
                            android.content.Intent r7 = android.content.Intent.parseUri(r8, r4)     // Catch:{ all -> 0x00fe }
                            com.appnext.core.f r3 = com.appnext.core.C3187f.this     // Catch:{ all -> 0x00fe }
                            android.content.Context r3 = r3.context     // Catch:{ all -> 0x00fe }
                            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ all -> 0x00fe }
                            r5 = 65536(0x10000, float:9.18355E-41)
                            android.content.pm.ResolveInfo r3 = r3.resolveActivity(r7, r5)     // Catch:{ all -> 0x00fe }
                            if (r3 == 0) goto L_0x006d
                            com.appnext.core.f r8 = com.appnext.core.C3187f.this     // Catch:{ all -> 0x00fe }
                            r8.m10756at()     // Catch:{ all -> 0x00fe }
                            com.appnext.core.f r8 = com.appnext.core.C3187f.this     // Catch:{ all -> 0x00fe }
                            com.appnext.core.f$a r8 = r8.f12321dh     // Catch:{ all -> 0x00fe }
                            if (r8 == 0) goto L_0x006c
                            com.appnext.core.f r8 = com.appnext.core.C3187f.this     // Catch:{ all -> 0x00fe }
                            com.appnext.core.f$a r8 = r8.f12321dh     // Catch:{ all -> 0x00fe }
                            android.net.Uri r7 = r7.getData()     // Catch:{ all -> 0x00fe }
                            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00fe }
                            r8.onMarket(r7)     // Catch:{ all -> 0x00fe }
                        L_0x006c:
                            return r4
                        L_0x006d:
                            android.os.Bundle r3 = r7.getExtras()     // Catch:{ all -> 0x00fe }
                            java.lang.String r5 = ""
                            if (r3 == 0) goto L_0x0096
                            android.os.Bundle r3 = r7.getExtras()     // Catch:{ all -> 0x00fe }
                            boolean r3 = r3.containsKey(r0)     // Catch:{ all -> 0x00fe }
                            if (r3 == 0) goto L_0x0096
                            android.os.Bundle r3 = r7.getExtras()     // Catch:{ all -> 0x00fe }
                            java.lang.String r3 = r3.getString(r0)     // Catch:{ all -> 0x00fe }
                            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x00fe }
                            if (r3 != 0) goto L_0x0096
                            android.os.Bundle r7 = r7.getExtras()     // Catch:{ all -> 0x00fe }
                            java.lang.String r7 = r7.getString(r0)     // Catch:{ all -> 0x00fe }
                            goto L_0x00d0
                        L_0x0096:
                            android.os.Bundle r0 = r7.getExtras()     // Catch:{ all -> 0x00fe }
                            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x00fe }
                            if (r0 == 0) goto L_0x00e7
                            android.os.Bundle r0 = r7.getExtras()     // Catch:{ all -> 0x00fe }
                            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x00fe }
                            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x00fe }
                            if (r0 != 0) goto L_0x00e7
                            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fe }
                            java.lang.String r0 = "market://details?id="
                            r8.<init>(r0)     // Catch:{ all -> 0x00fe }
                            java.lang.String r0 = r7.getPackage()     // Catch:{ all -> 0x00fe }
                            r8.append(r0)     // Catch:{ all -> 0x00fe }
                            java.lang.String r0 = "&referrer="
                            r8.append(r0)     // Catch:{ all -> 0x00fe }
                            android.os.Bundle r7 = r7.getExtras()     // Catch:{ all -> 0x00fe }
                            java.lang.String r7 = r7.getString(r1)     // Catch:{ all -> 0x00fe }
                            r8.append(r7)     // Catch:{ all -> 0x00fe }
                            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x00fe }
                        L_0x00d0:
                            com.appnext.core.f r8 = com.appnext.core.C3187f.this     // Catch:{ all -> 0x00fe }
                            r8.m10756at()     // Catch:{ all -> 0x00fe }
                            com.appnext.core.f r8 = com.appnext.core.C3187f.this     // Catch:{ all -> 0x00fe }
                            com.appnext.core.f$a r8 = r8.f12321dh     // Catch:{ all -> 0x00fe }
                            if (r8 == 0) goto L_0x00e6
                            com.appnext.core.f r8 = com.appnext.core.C3187f.this     // Catch:{ all -> 0x00fe }
                            com.appnext.core.f$a r8 = r8.f12321dh     // Catch:{ all -> 0x00fe }
                            r8.onMarket(r7)     // Catch:{ all -> 0x00fe }
                        L_0x00e6:
                            return r4
                        L_0x00e7:
                            com.appnext.core.f r7 = com.appnext.core.C3187f.this     // Catch:{ all -> 0x00fe }
                            r7.m10756at()     // Catch:{ all -> 0x00fe }
                            com.appnext.core.f r7 = com.appnext.core.C3187f.this     // Catch:{ all -> 0x00fe }
                            com.appnext.core.f$a r7 = r7.f12321dh     // Catch:{ all -> 0x00fe }
                            if (r7 == 0) goto L_0x00fd
                            com.appnext.core.f r7 = com.appnext.core.C3187f.this     // Catch:{ all -> 0x00fe }
                            com.appnext.core.f$a r7 = r7.f12321dh     // Catch:{ all -> 0x00fe }
                            r7.error(r8)     // Catch:{ all -> 0x00fe }
                        L_0x00fd:
                            return r4
                        L_0x00fe:
                            return r2
                        L_0x00ff:
                            android.content.Intent r0 = new android.content.Intent
                            java.lang.String r1 = "android.intent.action.VIEW"
                            r0.<init>(r1)
                            android.net.Uri r1 = android.net.Uri.parse(r8)
                            r0.setData(r1)
                            com.appnext.core.f r1 = com.appnext.core.C3187f.this     // Catch:{ all -> 0x0142 }
                            android.content.Context r1 = r1.context     // Catch:{ all -> 0x0142 }
                            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x0142 }
                            java.util.List r0 = r1.queryIntentActivities(r0, r2)     // Catch:{ all -> 0x0142 }
                            if (r0 == 0) goto L_0x013f
                            int r0 = r0.size()     // Catch:{ all -> 0x0142 }
                            if (r0 <= 0) goto L_0x013f
                            com.appnext.core.f r7 = com.appnext.core.C3187f.this     // Catch:{ all -> 0x0142 }
                            r7.m10756at()     // Catch:{ all -> 0x0142 }
                            com.appnext.core.f r7 = com.appnext.core.C3187f.this     // Catch:{ all -> 0x0142 }
                            r7.openMarket(r8)     // Catch:{ all -> 0x0142 }
                            com.appnext.core.f r7 = com.appnext.core.C3187f.this     // Catch:{ all -> 0x0142 }
                            com.appnext.core.f$a r7 = r7.f12321dh     // Catch:{ all -> 0x0142 }
                            if (r7 == 0) goto L_0x013e
                            com.appnext.core.f r7 = com.appnext.core.C3187f.this     // Catch:{ all -> 0x0142 }
                            com.appnext.core.f$a r7 = r7.f12321dh     // Catch:{ all -> 0x0142 }
                            r7.onMarket(r8)     // Catch:{ all -> 0x0142 }
                        L_0x013e:
                            return r4
                        L_0x013f:
                            r7.loadUrl(r8)     // Catch:{ all -> 0x0142 }
                        L_0x0142:
                            return r2
                        L_0x0143:
                            com.appnext.core.f r0 = com.appnext.core.C3187f.this
                            android.content.Intent r1 = com.appnext.core.C3187f.m10767t(r8)
                            r2 = 0
                            android.content.Intent r1 = r1.setComponent(r2)
                            android.content.Intent r0 = r0.mo10785a((android.content.Intent) r1)
                            if (r0 == 0) goto L_0x0179
                            com.appnext.core.f r7 = com.appnext.core.C3187f.this
                            r7.m10756at()
                            com.appnext.core.f r7 = com.appnext.core.C3187f.this
                            com.appnext.core.f$a r7 = r7.f12321dh
                            if (r7 == 0) goto L_0x016a
                            com.appnext.core.f r7 = com.appnext.core.C3187f.this
                            com.appnext.core.f$a r7 = r7.f12321dh
                            r7.onMarket(r8)
                        L_0x016a:
                            r7 = 268435456(0x10000000, float:2.5243549E-29)
                            r0.addFlags(r7)
                            com.appnext.core.f r7 = com.appnext.core.C3187f.this
                            android.content.Context r7 = r7.context
                            r7.startActivity(r0)
                            return r4
                        L_0x0179:
                            r7.loadUrl(r8)
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C3187f.C31924.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
                    }
                });
            }
            this.f12319df.stopLoading();
            this.f12319df.loadUrl("about:blank");
            this.f12323dj = m10751a(this.context, m10767t(bVar.f12348v).setComponent((ComponentName) null));
            this.f12319df.loadUrl(bVar.f12348v);
            this.handler.postDelayed(this.f12322di, bVar.f12348v.endsWith("&ox=0") ? 15000 : bVar.f12347dy);
        } catch (Throwable th) {
            C3117a.m10553a("AppnextCK$load1", th);
            C3196a aVar = this.f12321dh;
            if (aVar != null) {
                aVar.error(bVar.f12348v);
            }
            m10755as();
        }
    }

    /* renamed from: a */
    private static List m10751a(Context context2, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context2.getPackageManager().queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            arrayList.add(new ComponentName(activityInfo.packageName, activityInfo.name));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Intent mo10785a(Intent intent) {
        List<ComponentName> a = m10751a(this.context, intent);
        new HashSet();
        for (ComponentName componentName : a) {
            if (!this.f12323dj.contains(componentName)) {
                Intent intent2 = new Intent();
                intent2.setComponent(componentName);
                return intent2;
            }
        }
        return null;
    }
}
