package com.appnext.banners;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.appnext.banners.C3105f;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextAd;
import com.appnext.core.C3148Ad;
import com.appnext.core.C3180d;
import com.appnext.core.C3187f;
import com.appnext.core.C3198g;
import com.appnext.core.C3211o;
import com.appnext.core.C3213q;
import com.appnext.core.SettingsManager;
import com.appnext.core.result.C3250b;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public class BannerActivity extends Activity {

    /* renamed from: aA */
    boolean f12116aA;
    BannerAd bannerAd;

    /* renamed from: bh */
    BannerAdData f12117bh;

    /* renamed from: bi */
    String f12118bi;

    /* renamed from: bj */
    String f12119bj;

    /* renamed from: bk */
    String f12120bk;

    /* renamed from: bl */
    String f12121bl;

    /* renamed from: bm */
    String f12122bm;

    /* renamed from: bn */
    C3104e f12123bn;

    /* renamed from: bo */
    Banner f12124bo;
    BannerAdData selectedAd;
    C3213q userAction;

    private class Banner extends BannerView {
        public Banner(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public C3104e getBannerAdapter() {
            return BannerActivity.this.f12123bn;
        }
    }

    /* renamed from: com.appnext.banners.BannerActivity$a */
    private class C3065a extends C3105f {

        /* renamed from: com.appnext.banners.BannerActivity$a$a */
        public class C3066a extends WebViewClient {
            public C3066a() {
            }

            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                C3211o.m10825az().mo10821a(new Runnable() {
                    public final void run() {
                        final String b = C3198g.m10787b(C3065a.this.context, false);
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public final void run() {
                                try {
                                    C3065a aVar = C3065a.this;
                                    aVar.loadJS("javascript:(function() { try { Appnext.setParams(" + C3065a.this.getConfigParams().put("did", b).toString() + "); } catch(err){ Appnext.jsError(err.message); }})()");
                                } catch (Throwable unused) {
                                }
                                C3065a aVar2 = C3065a.this;
                                aVar2.loadJS("javascript:(function() { try { Appnext.load(" + C3065a.this.getSelectedAd().getAdJSON() + "," + BannerActivity.this.f12122bm + "," + BannerActivity.this.f12118bi + "); } catch(err){ Appnext.jsError(err.message); }})()");
                            }
                        });
                    }
                });
            }

            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str == null) {
                    return false;
                }
                try {
                    if (str.startsWith("http")) {
                        webView.loadUrl(str);
                        return true;
                    }
                } catch (Throwable th) {
                    C3117a.m10553a("BWebViewClient$shouldOverrideUrlLoading", th);
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }

        /* renamed from: com.appnext.banners.BannerActivity$a$b */
        public class C3069b extends C3105f.C3112a {
            public C3069b() {
                super();
            }

            @JavascriptInterface
            public final void adClicked(String str, int i) {
                BannerActivity bannerActivity = BannerActivity.this;
                C3101b.m10528H();
                bannerActivity.f12117bh = new BannerAdData((AppnextAd) C3180d.parseAd(str));
                BannerActivity bannerActivity2 = BannerActivity.this;
                C3213q qVar = bannerActivity2.userAction;
                BannerAdData bannerAdData = bannerActivity2.f12117bh;
                qVar.mo10823a(bannerAdData, BannerActivity.this.f12117bh.getAppURL() + "&tem_id=" + C3065a.this.getBannerAd().getTemId(C3065a.this.getSelectedAd()) + IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, C3065a.this.getPlacementId(), new C3187f.C3196a() {
                    public final void error(String str) {
                    }

                    public final void onMarket(String str) {
                        BannerActivity bannerActivity = BannerActivity.this;
                        if (bannerActivity.f12116aA) {
                            bannerActivity.finish();
                        }
                    }
                });
            }

            @JavascriptInterface
            public final void impression(String str) {
                C3101b.m10528H();
                BannerActivity.this.userAction.mo10827d((AppnextAd) C3180d.parseAd(str));
            }

            @JavascriptInterface
            public final void openLink(String str) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.addFlags(268435456);
                BannerActivity.this.startActivity(intent);
            }

            @JavascriptInterface
            public final void postView(String str) {
                C3101b.m10528H();
                BannerAdData bannerAdData = new BannerAdData((AppnextAd) C3180d.parseAd(str));
                C3213q qVar = BannerActivity.this.userAction;
                qVar.mo10822a(bannerAdData, bannerAdData.getImpressionURL() + "&tem_id=" + C3065a.this.getBannerAd().getTemId(C3065a.this.getSelectedAd()) + IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, (C3187f.C3196a) null);
            }
        }

        private C3065a() {
        }

        /* access modifiers changed from: protected */
        public final BannerAdRequest getAdRequest() {
            return new BannerAdRequest();
        }

        /* access modifiers changed from: protected */
        public final BannerAd getBannerAd() {
            return BannerActivity.this.bannerAd;
        }

        /* access modifiers changed from: protected */
        public final String getFallbackScript() {
            return new C3250b().mo10384B();
        }

        /* access modifiers changed from: protected */
        public final String getJSurl() {
            return "https://cdn.appnext.com/tools/sdk/banner/2.4.3/result.min.js";
        }

        /* access modifiers changed from: protected */
        public final int getLayout() {
            return C3073R.layout.apnxt_full_screen;
        }

        /* access modifiers changed from: protected */
        public final BannerAdData getSelectedAd() {
            return BannerActivity.this.selectedAd;
        }

        /* access modifiers changed from: protected */
        public final C3105f.C3112a getWebInterface() {
            return new C3069b();
        }

        /* access modifiers changed from: protected */
        public final WebViewClient getWebViewClient() {
            return new C3066a();
        }

        public final void loadAd(BannerAdRequest bannerAdRequest) {
            inflateView(0, (AppnextAd) null);
        }
    }

    /* renamed from: h */
    private static BannerSize m10516h(String str) {
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != -1966536496) {
                if (hashCode != -96588539) {
                    if (hashCode == 1951953708) {
                        if (str.equals(AdPreferences.TYPE_BANNER)) {
                            c = 0;
                        }
                    }
                } else if (str.equals("MEDIUM_RECTANGLE")) {
                    c = 2;
                }
            } else if (str.equals("LARGE_BANNER")) {
                c = 1;
            }
            if (c == 0) {
                return BannerSize.BANNER;
            }
            if (c == 1) {
                return BannerSize.LARGE_BANNER;
            }
            if (c != 2) {
                return BannerSize.BANNER;
            }
            return BannerSize.MEDIUM_RECTANGLE;
        } catch (Throwable th) {
            C3117a.m10553a("BannerActivity$getSize", th);
            return BannerSize.BANNER;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C3148Ad mo10385b(String str, String str2) {
        char c = 65535;
        try {
            int hashCode = str2.hashCode();
            if (hashCode != -1966536496) {
                if (hashCode != -96588539) {
                    if (hashCode == 1951953708) {
                        if (str2.equals(AdPreferences.TYPE_BANNER)) {
                            c = 0;
                        }
                    }
                } else if (str2.equals("MEDIUM_RECTANGLE")) {
                    c = 2;
                }
            } else if (str2.equals("LARGE_BANNER")) {
                c = 1;
            }
            if (c == 0) {
                return new SmallBannerAd(this, str);
            }
            if (c == 1) {
                return new LargeBannerAd(this, str);
            }
            if (c != 2) {
                return new SmallBannerAd(this, str);
            }
            return new MediumRectangleAd(this, str);
        } catch (Throwable th) {
            C3117a.m10553a("BannerActivity$createAd", th);
            return new SmallBannerAd(this, str);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            super.onCreate(bundle);
            this.f12123bn = new C3065a();
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            setContentView(linearLayout);
            this.userAction = new C3213q(this, new C3213q.C3217a() {
                /* renamed from: c */
                public final C3148Ad mo10141c() {
                    return BannerActivity.this.bannerAd;
                }

                /* renamed from: d */
                public final AppnextAd mo10142d() {
                    return BannerActivity.this.f12117bh;
                }

                /* renamed from: e */
                public final SettingsManager mo10143e() {
                    return C3103d.m10544I();
                }

                public final void report(String str) {
                }
            });
            Bundle extras = getIntent().getExtras();
            this.f12120bk = extras.getString(IronSourceConstants.EVENTS_PLACEMENT_NAME);
            String string = extras.getString("size");
            this.f12121bl = string;
            BannerAd bannerAd2 = (BannerAd) mo10385b(this.f12120bk, string);
            this.bannerAd = bannerAd2;
            bannerAd2.setPostback(extras.getString("postback"));
            this.bannerAd.setCategories(extras.getString("category"));
            this.f12119bj = extras.getString("clicked");
            this.f12116aA = extras.getBoolean("shouldClose", false);
            this.selectedAd = (BannerAdData) extras.getSerializable("selected");
            this.f12118bi = C3101b.m10528H().mo10780k(this.bannerAd);
            ArrayList<AppnextAd> e = C3101b.m10528H().mo10505e(this.bannerAd);
            JSONArray jSONArray = new JSONArray();
            if (e != null) {
                Iterator<AppnextAd> it = e.iterator();
                while (it.hasNext()) {
                    jSONArray.put(new JSONObject(new BannerAdData(it.next()).getAdJSON()));
                }
            }
            this.f12122bm = new JSONObject().put("apps", jSONArray).toString();
            Banner banner = new Banner(this);
            this.f12124bo = banner;
            linearLayout.addView(banner);
            this.f12124bo.getLayoutParams().height = -1;
            this.f12124bo.getLayoutParams().width = -1;
            this.f12124bo.setPlacementId(this.f12120bk);
            this.f12124bo.setBannerSize(m10516h(this.f12121bl));
            this.f12124bo.loadAd((BannerAdRequest) null);
        } catch (Throwable th) {
            C3117a.m10553a("BannerActivity$onCreate", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        try {
            C3213q qVar = this.userAction;
            if (qVar != null) {
                qVar.destroy();
            }
        } catch (Throwable th) {
            C3117a.m10553a("BannerActivity$onDestroy", th);
        }
        try {
            BannerAd bannerAd2 = this.bannerAd;
            if (bannerAd2 != null) {
                bannerAd2.destroy();
            }
        } catch (Throwable th2) {
            C3117a.m10553a("BannerActivity$onDestroy", th2);
        }
        try {
            Banner banner = this.f12124bo;
            if (banner != null) {
                banner.destroy();
            }
        } catch (Throwable th3) {
            C3117a.m10553a("BannerActivity$onDestroy", th3);
        }
    }
}
