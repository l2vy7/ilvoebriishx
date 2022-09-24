package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import com.ironsource.environment.C4952a;
import com.ironsource.environment.C4961c;
import com.ironsource.environment.C4979h;
import com.ironsource.mediationsdk.C11412m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.p056c.C4946a;
import com.ironsource.sdk.controller.C11558f;
import com.ironsource.sdk.controller.C11585i;
import com.ironsource.sdk.controller.C11589k;
import com.ironsource.sdk.controller.C11591l;
import com.ironsource.sdk.controller.C11609q;
import com.ironsource.sdk.controller.C11611r;
import com.ironsource.sdk.controller.C11615u;
import com.ironsource.sdk.p287a.C11516a;
import com.ironsource.sdk.p287a.C11517b;
import com.ironsource.sdk.p287a.C11520d;
import com.ironsource.sdk.p287a.C11522f;
import com.ironsource.sdk.p289c.C11532a;
import com.ironsource.sdk.p289c.C11539d;
import com.ironsource.sdk.p289c.C11541e;
import com.ironsource.sdk.p291e.p292a.C11693a;
import com.ironsource.sdk.p293f.C11696a;
import com.ironsource.sdk.p294g.C11699a;
import com.ironsource.sdk.p294g.C11700b;
import com.ironsource.sdk.p294g.C11702c;
import com.ironsource.sdk.p294g.C11703d;
import com.ironsource.sdk.p294g.C11709e;
import com.ironsource.sdk.p294g.C11710f;
import com.ironsource.sdk.p295h.C11711a;
import com.ironsource.sdk.p295h.C11712b;
import com.ironsource.sdk.p295h.C11715c;
import com.ironsource.sdk.p297j.C11728e;
import com.ironsource.sdk.p297j.C11730g;
import com.ironsource.sdk.p297j.p298a.C11721a;
import com.ironsource.sdk.p297j.p298a.C11722b;
import com.ironsource.sdk.p297j.p298a.C11723c;
import com.ironsource.sdk.p297j.p298a.C11724d;
import com.ironsource.sdk.p299k.C11732b;
import com.ironsource.sdk.p299k.C11736c;
import com.ironsource.sdk.service.C11746a;
import com.ironsource.sdk.service.C11748c;
import com.ironsource.sdk.service.C11749d;
import com.ironsource.sdk.service.Connectivity.C11741b;
import com.ironsource.sdk.utils.C11755a;
import com.ironsource.sdk.utils.C11756b;
import com.ironsource.sdk.utils.C11759d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.w */
public class C11618w extends WebView implements DownloadListener, C11593m, C11736c {

    /* renamed from: b */
    public static String f52116b = "is_store";

    /* renamed from: c */
    public static String f52117c = "external_url";

    /* renamed from: d */
    public static String f52118d = "secondary_web_view";

    /* renamed from: m0 */
    private static int f52119m0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public static String f52120n0 = "success";
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public static String f52121o0 = "fail";
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C11724d f52122A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C11723c f52123B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C11728e f52124C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C11722b f52125D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public Boolean f52126E = null;
    /* access modifiers changed from: package-private */

    /* renamed from: F */
    public String f52127F;
    /* access modifiers changed from: package-private */

    /* renamed from: G */
    public C11558f f52128G;
    /* access modifiers changed from: package-private */

    /* renamed from: H */
    public C11617v f52129H;
    /* access modifiers changed from: package-private */

    /* renamed from: I */
    public C11700b f52130I;

    /* renamed from: J */
    private Object f52131J = new Object();

    /* renamed from: K */
    private Handler f52132K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public boolean f52133L = false;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C11588j f52134M;
    /* access modifiers changed from: package-private */

    /* renamed from: N */
    public C11609q f52135N;
    /* access modifiers changed from: package-private */

    /* renamed from: O */
    public C11611r f52136O;
    /* access modifiers changed from: package-private */

    /* renamed from: P */
    public C11615u f52137P;
    /* access modifiers changed from: package-private */

    /* renamed from: Q */
    public C11589k f52138Q;
    /* access modifiers changed from: package-private */

    /* renamed from: R */
    public C11551a f52139R;
    /* access modifiers changed from: package-private */

    /* renamed from: S */
    public C11591l f52140S;

    /* renamed from: T */
    C11672x f52141T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C11557e f52142U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public C11741b f52143V;

    /* renamed from: W */
    C11555c f52144W;
    /* access modifiers changed from: package-private */

    /* renamed from: e */
    public String f52145e;

    /* renamed from: f */
    public CountDownTimer f52146f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f52147g = IronSourceConstants.IRONSOURCE_CONFIG_NAME;

    /* renamed from: h */
    private final String f52148h = "We're sorry, some error occurred. we will investigate it";
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f52149i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f52150j;

    /* renamed from: k */
    private Map<String, String> f52151k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C11732b f52152l;
    /* access modifiers changed from: package-private */

    /* renamed from: l0 */
    public C11730g f52153l0;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f52154m;
    /* access modifiers changed from: package-private */

    /* renamed from: n */
    public C11665s f52155n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f52156o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public CountDownTimer f52157p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f52158q = 50;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f52159r = 50;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f52160s = "top-right";

    /* renamed from: t */
    C11664r f52161t;
    /* access modifiers changed from: package-private */

    /* renamed from: u */
    public View f52162u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public FrameLayout f52163v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public WebChromeClient.CustomViewCallback f52164w;
    /* access modifiers changed from: package-private */

    /* renamed from: x */
    public FrameLayout f52165x;
    /* access modifiers changed from: package-private */

    /* renamed from: y */
    public C11653g f52166y;

    /* renamed from: z */
    String f52167z;

    /* renamed from: com.ironsource.sdk.controller.w$a */
    class C11619a implements C11667u {
        C11619a() {
        }

        /* renamed from: a */
        public final void mo44797a(String str, C11703d.C11708e eVar, C11702c cVar) {
            C11618w.m51566A(C11618w.this, str, eVar, cVar);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$b */
    class C11620b implements C11667u {
        C11620b() {
        }

        /* renamed from: a */
        public final void mo44797a(String str, C11703d.C11708e eVar, C11702c cVar) {
            C11618w.m51566A(C11618w.this, str, eVar, cVar);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$c */
    class C11621c implements C11667u {
        C11621c() {
        }

        /* renamed from: a */
        public final void mo44797a(String str, C11703d.C11708e eVar, C11702c cVar) {
            C11618w.m51566A(C11618w.this, str, eVar, cVar);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$d */
    public class C11622d {

        /* renamed from: com.ironsource.sdk.controller.w$d$a */
        public class C11623a {
            public C11623a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final void mo44866a(boolean z, String str, C11710f fVar) {
                fVar.mo45017a(z ? C11618w.f52120n0 : C11618w.f52121o0, str);
                C11618w.m51568B(C11618w.this, fVar.toString(), z, (String) null, (String) null);
            }

            /* renamed from: a */
            public final void mo44867a(boolean z, String str, JSONObject jSONObject) {
                String str2;
                if (z) {
                    try {
                        str2 = C11618w.f52120n0;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        e.getMessage();
                        return;
                    }
                } else {
                    str2 = C11618w.f52121o0;
                }
                jSONObject.put(str2, str);
                C11618w.m51568B(C11618w.this, jSONObject.toString(), z, (String) null, (String) null);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$a0 */
        class C11624a0 implements Runnable {
            C11624a0() {
            }

            public final void run() {
                Log.d(C11618w.this.f52145e, "onOfferWallInitSuccess()");
                C11618w.this.f52124C.onOfferwallInitSuccess();
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$b */
        class C11625b implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52174b;

            C11625b(String str) {
                this.f52174b = str;
            }

            public final void run() {
                C11618w.this.f52123B.mo44961c(this.f52174b);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$b0 */
        class C11626b0 implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52176b;

            C11626b0(String str) {
                this.f52176b = str;
            }

            public final void run() {
                String str = this.f52176b;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String M = C11618w.this.f52145e;
                Log.d(M, "onOfferWallInitFail(message:" + str + ")");
                C11618w.this.f52124C.onOfferwallInitFail(str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$c */
        class C11627c implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52178b;

            /* renamed from: c */
            private /* synthetic */ String f52179c;

            C11627c(String str, String str2) {
                this.f52178b = str;
                this.f52179c = str2;
            }

            public final void run() {
                String str = this.f52178b;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                C11618w.this.f52123B.mo44957b(this.f52179c, str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$d */
        class C11628d implements Runnable {
            C11628d() {
            }

            public final void run() {
                C11618w.this.mo44791i();
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$e */
        class C11629e implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52182b;

            /* renamed from: c */
            private /* synthetic */ String f52183c;

            C11629e(String str, String str2) {
                this.f52182b = str;
                this.f52183c = str2;
            }

            public final void run() {
                String str = this.f52182b;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                C11618w.this.f52123B.mo44962c(this.f52183c, str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$f */
        class C11630f implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52185b;

            C11630f(String str) {
                this.f52185b = str;
            }

            public final void run() {
                Log.d(C11618w.this.f52145e, "onBannerInitSuccess()");
                C11618w.this.f52125D.mo44937a(C11703d.C11708e.Banner, this.f52185b, (C11699a) null);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$g */
        class C11631g implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52187b;

            /* renamed from: c */
            private /* synthetic */ String f52188c;

            C11631g(String str, String str2) {
                this.f52187b = str;
                this.f52188c = str2;
            }

            public final void run() {
                String str = this.f52187b;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String M = C11618w.this.f52145e;
                Log.d(M, "onBannerInitFail(message:" + str + ")");
                C11618w.this.f52125D.mo44938a(C11703d.C11708e.Banner, this.f52188c, str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$h */
        class C11632h implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52190b;

            /* renamed from: c */
            private /* synthetic */ C11532a f52191c;

            C11632h(String str, C11532a aVar) {
                this.f52190b = str;
                this.f52191c = aVar;
            }

            public final void run() {
                Log.d(C11618w.this.f52145e, "onBannerLoadSuccess()");
                C11618w.this.f52125D.mo44942a(this.f52190b, this.f52191c);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$i */
        class C11633i implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52193b;

            /* renamed from: c */
            private /* synthetic */ String f52194c;

            C11633i(String str, String str2) {
                this.f52193b = str;
                this.f52194c = str2;
            }

            public final void run() {
                Log.d(C11618w.this.f52145e, "onLoadBannerFail()");
                String str = this.f52193b;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                C11618w.this.f52125D.mo44966d(this.f52194c, str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$j */
        class C11634j implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52196b;

            C11634j(String str) {
                this.f52196b = str;
            }

            public final void run() {
                String str = this.f52196b;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                C11618w.this.f52124C.onGetOWCreditsFailed(str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$k */
        class C11635k implements Runnable {

            /* renamed from: b */
            private /* synthetic */ C11703d.C11708e f52198b;

            /* renamed from: c */
            private /* synthetic */ String f52199c;

            /* renamed from: d */
            private /* synthetic */ String f52200d;

            /* renamed from: e */
            private /* synthetic */ JSONObject f52201e;

            C11635k(C11703d.C11708e eVar, String str, String str2, JSONObject jSONObject) {
                this.f52198b = eVar;
                this.f52199c = str;
                this.f52200d = str2;
                this.f52201e = jSONObject;
            }

            public final void run() {
                C11703d.C11708e eVar = this.f52198b;
                if (eVar == C11703d.C11708e.Interstitial || eVar == C11703d.C11708e.RewardedVideo || eVar == C11703d.C11708e.Banner) {
                    C11721a r = C11618w.this.m51581L(eVar);
                    if (r != null) {
                        r.mo44939a(this.f52198b, this.f52199c, this.f52200d, this.f52201e);
                    }
                } else if (eVar == C11703d.C11708e.OfferWall) {
                    C11618w.this.f52124C.onOfferwallEventNotificationReceived(this.f52200d, this.f52201e);
                }
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$l */
        class C11636l implements Runnable {
            C11636l() {
            }

            public final void run() {
                C11618w.this.mo44792j();
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$m */
        class C11637m implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52204b;

            C11637m(String str) {
                this.f52204b = str;
            }

            public final void run() {
                try {
                    String M = C11618w.this.f52145e;
                    Logger.m51953i(M, "omidAPI(" + this.f52204b + ")");
                    C11710f fVar = new C11710f(this.f52204b);
                    C11609q h = C11618w.this.f52135N;
                    String fVar2 = fVar.toString();
                    C11623a aVar = new C11623a();
                    WebView g = C11618w.m51611g(C11618w.this);
                    JSONObject jSONObject = new JSONObject(fVar2);
                    C11609q.C11610a aVar2 = new C11609q.C11610a((byte) 0);
                    aVar2.f52093a = jSONObject.optString("omidFunction");
                    aVar2.f52094b = jSONObject.optJSONObject("omidParams");
                    aVar2.f52095c = jSONObject.optString("success");
                    aVar2.f52096d = jSONObject.optString("fail");
                    C11710f fVar3 = new C11710f();
                    try {
                        String str = aVar2.f52093a;
                        char c = 65535;
                        switch (str.hashCode()) {
                            case -1655974669:
                                if (str.equals("activate")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case -984459207:
                                if (str.equals("getOmidData")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case 70701699:
                                if (str.equals("finishSession")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 1208109646:
                                if (str.equals("impressionOccurred")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 1850541012:
                                if (str.equals("startSession")) {
                                    c = 1;
                                    break;
                                }
                                break;
                        }
                        if (c != 0) {
                            if (c == 1) {
                                C11693a.m51776a(aVar2.f52094b, g);
                            } else if (c == 2) {
                                C11693a.m51777b();
                            } else if (c == 3) {
                                C11693a.m51775a(aVar2.f52094b);
                            } else if (c != 4) {
                                throw new IllegalArgumentException(String.format("%s | unsupported OMID API", new Object[]{aVar2.f52093a}));
                            }
                            aVar.mo44866a(true, aVar2.f52095c, fVar3);
                        }
                        C11693a.m51774a(h.f52092a);
                        fVar3 = C11693a.m51773a();
                        aVar.mo44866a(true, aVar2.f52095c, fVar3);
                    } catch (Exception e) {
                        fVar3.mo45017a("errMsg", e.getMessage());
                        String str2 = C11609q.f52091b;
                        Logger.m51953i(str2, "OMIDJSAdapter " + aVar2.f52093a + " Exception: " + e.getMessage());
                        aVar.mo44866a(false, aVar2.f52096d, fVar3);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    String M2 = C11618w.this.f52145e;
                    Logger.m51953i(M2, "omidAPI failed with exception " + e2.getMessage());
                }
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$n */
        class C11638n implements Runnable {
            C11638n() {
            }

            public final void run() {
                C11618w.this.removeJavascriptInterface("GenerateTokenForMessaging");
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$o */
        class C11639o implements Runnable {
            C11639o() {
            }

            public final void run() {
                if (Build.VERSION.SDK_INT >= 21) {
                    C11618w.this.getSettings().setMixedContentMode(0);
                }
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$p */
        class C11640p implements Runnable {

            /* renamed from: b */
            private /* synthetic */ C11699a f52208b;

            /* renamed from: c */
            private /* synthetic */ String f52209c;

            C11640p(C11699a aVar, String str) {
                this.f52208b = aVar;
                this.f52209c = str;
            }

            public final void run() {
                if (Integer.parseInt(this.f52208b.f52366b) > 0) {
                    Log.d(C11618w.this.f52145e, "onRVInitSuccess()");
                    C11618w.this.f52122A.mo44937a(C11703d.C11708e.RewardedVideo, this.f52209c, this.f52208b);
                    return;
                }
                C11618w.this.f52122A.mo44955b(this.f52209c);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$q */
        class C11641q implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52211b;

            /* renamed from: c */
            private /* synthetic */ String f52212c;

            /* renamed from: d */
            private /* synthetic */ int f52213d;

            /* renamed from: e */
            private /* synthetic */ boolean f52214e;

            /* renamed from: f */
            private /* synthetic */ int f52215f;

            /* renamed from: g */
            private /* synthetic */ boolean f52216g;

            /* renamed from: h */
            private /* synthetic */ String f52217h;

            /* renamed from: i */
            private /* synthetic */ String f52218i;

            C11641q(String str, String str2, int i, boolean z, int i2, boolean z2, String str3, String str4) {
                this.f52211b = str;
                this.f52212c = str2;
                this.f52213d = i;
                this.f52214e = z;
                this.f52215f = i2;
                this.f52216g = z2;
                this.f52217h = str3;
                this.f52218i = str4;
            }

            public final void run() {
                if (this.f52211b.equalsIgnoreCase(C11703d.C11708e.RewardedVideo.toString())) {
                    C11618w.this.f52122A.mo44941a(this.f52212c, this.f52213d);
                } else if (this.f52211b.equalsIgnoreCase(C11703d.C11708e.OfferWall.toString()) && this.f52214e && C11618w.this.f52124C.onOWAdCredited(this.f52213d, this.f52215f, this.f52216g) && !TextUtils.isEmpty(this.f52217h)) {
                    if (C11756b.m51963a().mo45071a(this.f52217h, C11618w.this.f52149i, C11618w.this.f52150j)) {
                        C11618w.m51568B(C11618w.this, this.f52218i, true, (String) null, (String) null);
                    } else {
                        C11618w.m51568B(C11618w.this, this.f52218i, false, "Time Stamp could not be stored", (String) null);
                    }
                }
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$r */
        class C11642r implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52220b;

            /* renamed from: c */
            private /* synthetic */ int f52221c;

            C11642r(String str, int i) {
                this.f52220b = str;
                this.f52221c = i;
            }

            public final void run() {
                C11618w.this.f52123B.mo44956b(this.f52220b, this.f52221c);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$s */
        class C11643s implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52223b;

            /* renamed from: c */
            private /* synthetic */ String f52224c;

            C11643s(String str, String str2) {
                this.f52223b = str;
                this.f52224c = str2;
            }

            public final void run() {
                String str = this.f52223b;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String M = C11618w.this.f52145e;
                Log.d(M, "onRVInitFail(message:" + str + ")");
                C11618w.this.f52122A.mo44938a(C11703d.C11708e.RewardedVideo, this.f52224c, str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$t */
        class C11644t implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52226b;

            /* renamed from: c */
            private /* synthetic */ String f52227c;

            C11644t(String str, String str2) {
                this.f52226b = str;
                this.f52227c = str2;
            }

            public final void run() {
                String str = this.f52226b;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String M = C11618w.this.f52145e;
                Log.d(M, "onRVShowFail(message:" + this.f52226b + ")");
                C11618w.this.f52122A.mo44943a(this.f52227c, str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$u */
        class C11645u implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52229b;

            C11645u(String str) {
                this.f52229b = str;
            }

            public final void run() {
                C11618w.this.f52124C.onOWShowSuccess(this.f52229b);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$v */
        class C11646v implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52231b;

            C11646v(String str) {
                this.f52231b = str;
            }

            public final void run() {
                String str = this.f52231b;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                C11618w.this.f52124C.onOWShowFail(str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$w */
        class C11647w implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52233b;

            C11647w(String str) {
                this.f52233b = str;
            }

            public final void run() {
                Log.d(C11618w.this.f52145e, "onInterstitialInitSuccess()");
                C11618w.this.f52123B.mo44937a(C11703d.C11708e.Interstitial, this.f52233b, (C11699a) null);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$x */
        class C11648x implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52235b;

            /* renamed from: c */
            private /* synthetic */ String f52236c;

            C11648x(String str, String str2) {
                this.f52235b = str;
                this.f52236c = str2;
            }

            public final void run() {
                String str = this.f52235b;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String M = C11618w.this.f52145e;
                Log.d(M, "onInterstitialInitFail(message:" + str + ")");
                C11618w.this.f52123B.mo44938a(C11703d.C11708e.Interstitial, this.f52236c, str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$y */
        class C11649y implements Runnable {

            /* renamed from: b */
            private /* synthetic */ C11721a f52238b;

            /* renamed from: c */
            private /* synthetic */ C11703d.C11708e f52239c;

            /* renamed from: d */
            private /* synthetic */ String f52240d;

            C11649y(C11721a aVar, C11703d.C11708e eVar, String str) {
                this.f52238b = aVar;
                this.f52239c = eVar;
                this.f52240d = str;
            }

            public final void run() {
                this.f52238b.mo44954b(this.f52239c, this.f52240d);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.w$d$z */
        class C11650z implements Runnable {

            /* renamed from: b */
            private /* synthetic */ String f52242b;

            C11650z(String str) {
                this.f52242b = str;
            }

            public final void run() {
                C11618w.this.f52123B.mo44960c(C11703d.C11708e.Interstitial, this.f52242b);
                C11618w.this.f52123B.mo44965d(this.f52242b);
            }
        }

        public C11622d() {
        }

        /* renamed from: a */
        private void m51691a(String str, boolean z) {
            C11702c a = C11618w.this.f52134M.mo44754a(C11703d.C11708e.Interstitial, str);
            if (a != null) {
                a.f52391f = z;
            }
        }

        /* renamed from: b */
        private void m51692b(JSONObject jSONObject) {
            try {
                FeaturesManager instance = FeaturesManager.getInstance();
                if (!instance.mo44666a().isEmpty()) {
                    jSONObject.put("nativeFeatures", new JSONArray(instance.mo44666a()));
                }
            } catch (Exception e) {
                C11520d.m51360a(C11522f.f51815n, (Map<String, Object>) new C11516a().mo44598a("callfailreason", e.getMessage()).f51793a);
                Logger.m51949d(C11618w.this.f52145e, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        /* renamed from: c */
        private void m51693c(JSONObject jSONObject, String str) {
            if (m51694d(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException unused) {
                    Logger.m51949d(C11618w.this.f52145e, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        /* renamed from: d */
        private static boolean m51694d(String str) {
            if (TextUtils.isEmpty(str) || str.contains("-1")) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return !jSONObject.getString("testerABGroup").isEmpty() && !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: e */
        private void m51695e(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", C11618w.this.f52128G.mo44702g());
            } catch (Exception unused) {
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "adClicked(" + str + ")");
            C11710f fVar = new C11710f(str);
            String d = fVar.mo45022d("productType");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                C11703d.C11708e a0 = C11618w.m51616i0(d);
                C11721a r = C11618w.this.m51581L(a0);
                if (a0 != null && r != null) {
                    C11618w.this.mo44780D(new C11649y(r, a0, fetchDemandSourceId));
                }
            }
        }

        @JavascriptInterface
        public void adCredited(String str) {
            String str2;
            boolean z;
            boolean z2;
            C11702c a;
            Log.d(C11618w.this.f52147g, "adCredited(" + str + ")");
            C11710f fVar = new C11710f(str);
            String d = fVar.mo45022d("credits");
            boolean z3 = false;
            int parseInt = d != null ? Integer.parseInt(d) : 0;
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            String d2 = fVar.mo45022d("productType");
            if (TextUtils.isEmpty(d2)) {
                Log.d(C11618w.this.f52147g, "adCredited | product type is missing");
            }
            C11703d.C11708e eVar = C11703d.C11708e.Interstitial;
            if (!eVar.toString().equalsIgnoreCase(d2)) {
                String d3 = fVar.mo45022d("total");
                int parseInt2 = d3 != null ? Integer.parseInt(d3) : 0;
                if (!C11703d.C11708e.OfferWall.toString().equalsIgnoreCase(d2)) {
                    str2 = null;
                    z2 = false;
                    z = false;
                } else if (fVar.mo45020b(InAppPurchaseMetaData.KEY_SIGNATURE) || fVar.mo45020b("timestamp") || fVar.mo45020b("totalCreditsFlag")) {
                    C11618w.m51568B(C11618w.this, str, false, "One of the keys are missing: signature/timestamp/totalCreditsFlag", (String) null);
                    return;
                } else {
                    if (fVar.mo45022d(InAppPurchaseMetaData.KEY_SIGNATURE).equalsIgnoreCase(SDKUtils.getMD5(d3 + C11618w.this.f52149i + C11618w.this.f52150j))) {
                        z3 = true;
                    } else {
                        C11618w.m51568B(C11618w.this, str, false, "Controller signature is not equal to SDK signature", (String) null);
                    }
                    boolean e = fVar.mo45023e("totalCreditsFlag");
                    str2 = fVar.mo45022d("timestamp");
                    z = e;
                    z2 = z3;
                }
                if (C11618w.this.mo44781I(d2)) {
                    C11618w.this.mo44780D(new C11641q(d2, fetchDemandSourceId, parseInt, z2, parseInt2, z, str2, str));
                }
            } else if (C11618w.this.mo44781I(eVar.toString()) && (a = C11618w.this.f52134M.mo44754a(eVar, fetchDemandSourceId)) != null) {
                Map<String, String> map = a.f52389d;
                if (map != null && map.containsKey("rewarded")) {
                    z3 = Boolean.parseBoolean(a.f52389d.get("rewarded"));
                }
                if (z3) {
                    C11618w.this.mo44780D(new C11642r(fetchDemandSourceId, parseInt));
                }
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "adUnitsReady(" + str + ")");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C11710f(str));
            C11699a aVar = new C11699a(str);
            if (!aVar.f52367c) {
                C11618w.m51568B(C11618w.this, str, false, "Num Of Ad Units Do Not Exist", (String) null);
                return;
            }
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            String str2 = aVar.f52365a;
            if (C11703d.C11708e.RewardedVideo.toString().equalsIgnoreCase(str2) && C11618w.this.mo44781I(str2)) {
                C11618w.this.mo44780D(new C11640p(aVar, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                String M = C11618w.this.f52145e;
                Logger.m51953i(M, "adViewAPI(" + str + ")");
                C11618w.this.f52139R.mo44685a(new C11710f(str).toString(), new C11623a());
            } catch (Exception e) {
                e.printStackTrace();
                String M2 = C11618w.this.f52145e;
                Logger.m51953i(M2, "adViewAPI failed with exception " + e.getMessage());
            }
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.m51951e(C11618w.this.f52145e, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            C11703d.C11708e a0;
            Map<String, C11702c> c;
            C11702c remove;
            try {
                String M = C11618w.this.f52145e;
                Logger.m51953i(M, "cleanAdInstance(" + str + ")");
                C11710f fVar = new C11710f(str);
                String d = fVar.mo45022d("productType");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                if (!TextUtils.isEmpty(fetchDemandSourceId) && (a0 = C11618w.m51616i0(d)) != null) {
                    C11588j F0 = C11618w.this.f52134M;
                    if (!TextUtils.isEmpty(fetchDemandSourceId) && (c = F0.mo44758c(a0)) != null && (remove = c.remove(fetchDemandSourceId)) != null) {
                        remove.f52392g = null;
                        Map<String, String> map = remove.f52389d;
                        if (map != null) {
                            map.clear();
                        }
                        remove.f52389d = null;
                    }
                }
            } catch (Exception e) {
                C11618w.m51568B(C11618w.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                C11756b a = C11756b.m51963a();
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) a.f52501a.getAll().keySet().toArray(new String[0]);
                SharedPreferences.Editor edit = a.f52501a.edit();
                for (String str2 : strArr) {
                    if (C11756b.m51965b(str2)) {
                        arrayList.add(str2);
                        edit.remove(str2);
                    }
                }
                edit.apply();
                C11710f fVar = new C11710f(str);
                if (!arrayList.isEmpty()) {
                    fVar.mo45017a("removedAdsLastUpdateTime", arrayList.toString());
                }
                C11618w.m51568B(C11618w.this, fVar.toString(), true, (String) null, (String) null);
            } catch (Exception e) {
                C11618w.m51568B(C11618w.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            try {
                String M = C11618w.this.f52145e;
                Logger.m51953i(M, "deleteFile(" + str + ")");
                C11710f fVar = new C11710f(str);
                String d = fVar.mo45022d("file");
                String d2 = fVar.mo45022d("path");
                if (d2 != null) {
                    if (!TextUtils.isEmpty(d)) {
                        C11715c cVar = new C11715c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C11618w.this.f52127F, d2), d);
                        if (!cVar.exists()) {
                            C11618w.m51568B(C11618w.this, str, false, "File not exist", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                            return;
                        }
                        C11618w.m51568B(C11618w.this, str, IronSourceStorageUtils.deleteFile(cVar), (String) null, (String) null);
                        return;
                    }
                }
                C11618w.m51568B(C11618w.this, str, false, "Missing parameters for file", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            } catch (Exception e) {
                C11618w.m51568B(C11618w.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            try {
                String M = C11618w.this.f52145e;
                Logger.m51953i(M, "deleteFolder(" + str + ")");
                String d = new C11710f(str).mo45022d("path");
                if (d == null) {
                    C11618w.m51568B(C11618w.this, str, false, "Missing parameters for file", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    return;
                }
                C11715c cVar = new C11715c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C11618w.this.f52127F, d));
                if (!cVar.exists()) {
                    C11618w.m51568B(C11618w.this, str, false, "Folder not exist", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    return;
                }
                C11618w.m51568B(C11618w.this, str, IronSourceStorageUtils.deleteFolder(cVar.getPath()), (String) null, (String) null);
            } catch (Exception e) {
                C11618w.m51568B(C11618w.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                String M = C11618w.this.f52145e;
                Logger.m51953i(M, "deviceDataAPI(" + str + ")");
                C11710f fVar = new C11710f(str);
                C11589k j = C11618w.this.f52138Q;
                String fVar2 = fVar.toString();
                C11623a aVar = new C11623a();
                JSONObject jSONObject = new JSONObject(fVar2);
                C11589k.C11590a aVar2 = new C11589k.C11590a((byte) 0);
                aVar2.f52043a = jSONObject.optString("deviceDataFunction");
                aVar2.f52044b = jSONObject.optJSONObject("deviceDataParams");
                aVar2.f52045c = jSONObject.optString("success");
                aVar2.f52046d = jSONObject.optString("fail");
                if ("getDeviceData".equals(aVar2.f52043a)) {
                    String str2 = aVar2.f52045c;
                    C11710f fVar3 = new C11710f();
                    fVar3.mo45017a(SDKUtils.encodeString("sdCardAvailable"), SDKUtils.encodeString(String.valueOf(C4979h.m22795d())));
                    fVar3.mo45017a(SDKUtils.encodeString("totalDeviceRAM"), SDKUtils.encodeString(String.valueOf(C4979h.m22797e(j.f52042a))));
                    fVar3.mo45017a(SDKUtils.encodeString("isCharging"), SDKUtils.encodeString(String.valueOf(C4979h.m22801f(j.f52042a))));
                    fVar3.mo45017a(SDKUtils.encodeString("chargingType"), SDKUtils.encodeString(String.valueOf(C4979h.m22802g(j.f52042a))));
                    fVar3.mo45017a(SDKUtils.encodeString("airplaneMode"), SDKUtils.encodeString(String.valueOf(C4979h.m22805h(j.f52042a))));
                    fVar3.mo45017a(SDKUtils.encodeString("stayOnWhenPluggedIn"), SDKUtils.encodeString(String.valueOf(C4979h.m22807i(j.f52042a))));
                    aVar.mo44866a(true, str2, fVar3);
                    return;
                }
                String str3 = C11589k.f52041b;
                Logger.m51953i(str3, "unhandled API request " + fVar2);
            } catch (Exception e) {
                e.printStackTrace();
                String M2 = C11618w.this.f52145e;
                Logger.m51953i(M2, "deviceDataAPI failed with exception " + e.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            int i;
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "displayWebView(" + str + ")");
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            C11710f fVar = new C11710f(str);
            boolean booleanValue = ((Boolean) fVar.mo45021c("display")).booleanValue();
            String d = fVar.mo45022d("productType");
            boolean e = fVar.mo45023e("standaloneView");
            String d2 = fVar.mo45022d("adViewId");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            boolean e2 = fVar.mo45023e("ctrWVPauseResume");
            if (booleanValue) {
                boolean unused = C11618w.this.f52133L = fVar.mo45023e("immersive");
                boolean e3 = fVar.mo45023e("activityThemeTranslucent");
                C11618w wVar = C11618w.this;
                C11653g gVar = wVar.f52166y;
                C11653g gVar2 = C11653g.Display;
                if (gVar != gVar2) {
                    wVar.f52166y = gVar2;
                    String M2 = wVar.f52145e;
                    Logger.m51953i(M2, "State: " + C11618w.this.f52166y);
                    Activity a = C11618w.this.f52144W.mo44689a();
                    String str2 = C11618w.this.f52167z;
                    int l = C4979h.m22813l(a);
                    if (e) {
                        C11585i iVar = new C11585i(a);
                        iVar.addView(C11618w.this.f52165x);
                        C11618w wVar2 = C11618w.this;
                        iVar.f52035c = wVar2;
                        wVar2.f52153l0 = iVar;
                        wVar2.requestFocus();
                        Activity a2 = iVar.f52035c.f52144W.mo44689a();
                        iVar.f52034b = a2;
                        if (((a2.getWindow().getAttributes().flags & 1024) != 0) || (i = iVar.mo44748a()) <= 0) {
                            i = 0;
                        }
                        int c = iVar.mo44749c();
                        try {
                            Context context = iVar.f52034b;
                            if (context != null) {
                                int p = C4979h.m22820p(context);
                                if (p == 1) {
                                    iVar.setPadding(0, i, 0, c);
                                } else if (p == 2) {
                                    iVar.setPadding(0, i, c, 0);
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        ((Activity) iVar.f52034b).runOnUiThread(new C11585i.C11586a());
                        return;
                    }
                    Intent intent = e3 ? new Intent(a, InterstitialActivity.class) : new Intent(a, ControllerActivity.class);
                    C11703d.C11708e eVar = C11703d.C11708e.RewardedVideo;
                    if (eVar.toString().equalsIgnoreCase(d)) {
                        if (MimeTypes.BASE_TYPE_APPLICATION.equals(str2)) {
                            str2 = SDKUtils.translateRequestedOrientation(C4979h.m22817n(a));
                        }
                        intent.putExtra("productType", eVar.toString());
                        C11618w.this.f52130I.f52375e = eVar.ordinal();
                        C11618w.this.f52130I.f52373c = fetchDemandSourceId;
                        if (C11618w.this.mo44781I(eVar.toString())) {
                            C11618w.this.f52122A.mo44960c(eVar, fetchDemandSourceId);
                        }
                    } else {
                        C11703d.C11708e eVar2 = C11703d.C11708e.OfferWall;
                        if (eVar2.toString().equalsIgnoreCase(d)) {
                            intent.putExtra("productType", eVar2.toString());
                            C11618w.this.f52130I.f52375e = eVar2.ordinal();
                        } else {
                            C11703d.C11708e eVar3 = C11703d.C11708e.Interstitial;
                            if (eVar3.toString().equalsIgnoreCase(d)) {
                                if (MimeTypes.BASE_TYPE_APPLICATION.equals(str2)) {
                                    str2 = SDKUtils.translateRequestedOrientation(C4979h.m22817n(a));
                                }
                                intent.putExtra("productType", eVar3.toString());
                            }
                        }
                    }
                    if (d2 != null) {
                        intent.putExtra("adViewId", d2);
                    }
                    intent.putExtra("ctrWVPauseResume", e2);
                    intent.setFlags(536870912);
                    intent.putExtra("immersive", C11618w.this.f52133L);
                    intent.putExtra("orientation_set_flag", str2);
                    intent.putExtra("rotation_set_flag", l);
                    C11618w wVar3 = C11618w.this;
                    C11665s unused3 = wVar3.f52155n = new C11665s(C11618w.m51616i0(d), fetchDemandSourceId);
                    a.startActivity(intent);
                    return;
                }
                String M3 = wVar.f52145e;
                Logger.m51953i(M3, "State: " + C11618w.this.f52166y);
                return;
            }
            C11618w wVar4 = C11618w.this;
            wVar4.f52166y = C11653g.Gone;
            wVar4.mo44793j0();
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            JSONObject d;
            try {
                String M = C11618w.this.f52145e;
                Logger.m51953i(M, "fileSystemAPI(" + str + ")");
                C11591l y0 = C11618w.this.f52140S;
                JSONObject jSONObject = new JSONObject(str);
                C11623a aVar = new C11623a();
                C11594n nVar = new C11594n(jSONObject);
                C11595o oVar = new C11595o(aVar);
                try {
                    String str2 = nVar.f52052a;
                    JSONObject jSONObject2 = nVar.f52053b;
                    char c = 65535;
                    boolean z = false;
                    switch (str2.hashCode()) {
                        case -2073025383:
                            if (str2.equals("saveFile")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1137024519:
                            if (str2.equals("deleteFolder")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -318115535:
                            if (str2.equals("getTotalSizeOfFiles")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 537556755:
                            if (str2.equals("updateAttributesOfFile")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1764172231:
                            if (str2.equals("deleteFile")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1953259713:
                            if (str2.equals("getFiles")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c != 0) {
                        if (c == 1) {
                            C11715c a = C11591l.m51509a(jSONObject2, y0.f52047a);
                            C11712b bVar = y0.f52048b;
                            if (a.exists()) {
                                if (a.delete()) {
                                    bVar.f52432d.mo45029a(a.getName());
                                } else {
                                    throw new Exception("Failed to delete file");
                                }
                            }
                            d = C11591l.m51512d(nVar, a.mo45026a());
                        } else if (c == 2) {
                            C11715c e = C11591l.m51513e(jSONObject2, y0.f52047a);
                            C11712b bVar2 = y0.f52048b;
                            if (e.exists()) {
                                ArrayList<C11715c> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(e);
                                if (IronSourceStorageUtils.deleteFolderContentRecursive(e) && e.delete()) {
                                    z = true;
                                }
                                if (z) {
                                    bVar2.f52432d.mo45030a(filesInFolderRecursive);
                                } else {
                                    throw new Exception("Failed to delete folder");
                                }
                            }
                            d = C11591l.m51512d(nVar, e.mo45026a());
                        } else if (c == 3) {
                            C11715c e2 = C11591l.m51513e(jSONObject2, y0.f52047a);
                            C11712b bVar3 = y0.f52048b;
                            if (e2.exists()) {
                                d = C11591l.m51512d(nVar, IronSourceStorageUtils.buildFilesMapOfDirectory(e2, bVar3.f52432d.mo45028a()));
                            } else {
                                throw new Exception("Folder does not exist");
                            }
                        } else if (c == 4) {
                            C11715c e3 = C11591l.m51513e(jSONObject2, y0.f52047a);
                            if (e3.exists()) {
                                d = C11591l.m51510b(nVar, IronSourceStorageUtils.getTotalSizeOfDir(e3));
                            } else {
                                throw new Exception("Folder does not exist");
                            }
                        } else if (c == 5) {
                            C11715c a2 = C11591l.m51509a(jSONObject2, y0.f52047a);
                            JSONObject optJSONObject = jSONObject2.optJSONObject("attributesToUpdate");
                            C11712b bVar4 = y0.f52048b;
                            if (optJSONObject == null) {
                                throw new Exception("Missing attributes to update");
                            } else if (!a2.exists()) {
                                throw new Exception("File does not exist");
                            } else if (bVar4.f52432d.mo45031b(a2.getName(), optJSONObject)) {
                                oVar.mo44762a(nVar, C11591l.m51512d(nVar, a2.mo45026a()));
                                return;
                            } else {
                                throw new Exception("Failed to update attribute");
                            }
                        } else {
                            return;
                        }
                        oVar.mo44762a(nVar, d);
                        return;
                    }
                    C11715c a3 = C11591l.m51509a(jSONObject2, y0.f52047a);
                    String optString = jSONObject2.optString("fileUrl");
                    C11591l.C11592a aVar2 = new C11591l.C11592a(oVar, nVar);
                    C11712b bVar5 = y0.f52048b;
                    if (TextUtils.isEmpty(optString)) {
                        throw new Exception("Missing params for file");
                    } else if (C4979h.m22784a(bVar5.f52430b.f52442b) <= 0) {
                        throw new Exception("no_disk_space");
                    } else if (!SDKUtils.isExternalStorageAvailable()) {
                        throw new Exception("sotrage_unavailable");
                    } else if (C4952a.C49531.m22724b(bVar5.f52429a)) {
                        C11711a aVar3 = bVar5.f52431c;
                        String path = a3.getPath();
                        C11712b.C117131 r7 = new C11736c(aVar2) {

                            /* renamed from: b */
                            private /* synthetic */ C11736c f52433b;

                            /* renamed from: com.ironsource.sdk.h.b$1$a */
                            class C11714a extends JSONObject {
                                C11714a(
/*
Method generation error in method: com.ironsource.sdk.h.b.1.a.<init>(com.ironsource.sdk.h.b$1):void, dex: classes3.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.h.b.1.a.<init>(com.ironsource.sdk.h.b$1):void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                
*/
                            }

                            /* renamed from: a */
                            public final void mo44759a(
/*
Method generation error in method: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c):void, dex: classes3.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c):void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/

                            /* renamed from: a */
                            public final void mo44760a(
/*
Method generation error in method: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, dex: classes3.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        };
                        if (path != null) {
                            aVar3.f52428a.put(path, r7);
                        }
                        if (a3.exists()) {
                            Message message = new Message();
                            message.obj = a3;
                            message.what = 1015;
                            bVar5.f52431c.handleMessage(message);
                            return;
                        }
                        bVar5.f52430b.mo45037a(a3, optString, bVar5.f52431c);
                    } else {
                        throw new Exception("no_network_connection");
                    }
                } catch (Exception e4) {
                    oVar.mo44763b(nVar, C11591l.m51511c(nVar, e4.getMessage()));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                String M2 = C11618w.this.f52145e;
                Logger.m51953i(M2, "fileSystemAPI failed with exception " + e5.getMessage());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0059, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x005d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getApplicationInfo(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.C11618w.this
                java.lang.String r0 = r0.f52145e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getApplicationInfo("
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.m51953i(r0, r1)
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.C11618w.this
                java.lang.String r0 = new com.ironsource.sdk.p294g.C11710f(r5).mo45022d(com.ironsource.sdk.controller.C11618w.f52120n0)
                com.ironsource.sdk.controller.w r1 = com.ironsource.sdk.controller.C11618w.this
                java.lang.String r1 = new com.ironsource.sdk.p294g.C11710f(r5).mo45022d(com.ironsource.sdk.controller.C11618w.f52121o0)
                com.ironsource.sdk.g.f r2 = new com.ironsource.sdk.g.f
                r2.<init>(r5)
                java.lang.String r5 = "productType"
                java.lang.String r5 = r2.mo45022d(r5)
                java.lang.String r2 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId((com.ironsource.sdk.p294g.C11710f) r2)
                com.ironsource.sdk.controller.w r3 = com.ironsource.sdk.controller.C11618w.this
                java.lang.Object[] r5 = r3.m51593X(r5, r2)
                r2 = 0
                r2 = r5[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r5 = r5[r3]
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x0055
                boolean r5 = android.text.TextUtils.isEmpty(r1)
                if (r5 != 0) goto L_0x005c
                r0 = r1
                goto L_0x005d
            L_0x0055:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x005c
                goto L_0x005d
            L_0x005c:
                r0 = 0
            L_0x005d:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x0072
                com.ironsource.sdk.controller.w r5 = com.ironsource.sdk.controller.C11618w.this
                java.lang.String r1 = "onGetApplicationInfoSuccess"
                java.lang.String r3 = "onGetApplicationInfoFail"
                java.lang.String r5 = com.ironsource.sdk.controller.C11618w.m51644x(r0, r2, r1, r3)
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.C11618w.this
                r0.mo44787b((java.lang.String) r5)
            L_0x0072:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C11618w.C11622d.getApplicationInfo(java.lang.String):void");
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            C11618w wVar;
            String str2;
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "getCachedFilesMap(" + str + ")");
            String N = new C11710f(str).mo45022d(C11618w.f52120n0);
            if (!TextUtils.isEmpty(N)) {
                C11710f fVar = new C11710f(str);
                if (!fVar.mo45019a("path")) {
                    wVar = C11618w.this;
                    str2 = "path key does not exist";
                } else {
                    String str3 = (String) fVar.mo45021c("path");
                    if (!IronSourceStorageUtils.isPathExist(C11618w.this.f52127F, str3)) {
                        wVar = C11618w.this;
                        str2 = "path file does not exist on disk";
                    } else {
                        C11618w.this.mo44787b(C11618w.m51644x(N, IronSourceStorageUtils.getCachedFilesMap(C11618w.this.f52127F, str3), "onGetCachedFilesMapSuccess", "onGetCachedFilesMapFail"));
                        return;
                    }
                }
                C11618w.m51568B(wVar, str, false, str2, (String) null);
            }
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String str2;
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "getConnectivityInfo(" + str + ")");
            C11710f fVar = new C11710f(str);
            String d = fVar.mo45022d(C11618w.f52120n0);
            String d2 = fVar.mo45022d(C11618w.f52121o0);
            JSONObject jSONObject = new JSONObject();
            if (C11618w.this.f52143V != null) {
                C11741b s0 = C11618w.this.f52143V;
                jSONObject = s0.f52462a.mo45045c(C11618w.this.getContext());
            }
            if (jSONObject.length() > 0) {
                str2 = C11618w.m51601b(d, jSONObject.toString());
            } else {
                str2 = C11618w.m51601b(d2, C11618w.m51598a("errMsg", "failed to retrieve connection info", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false));
            }
            C11618w.this.mo44787b(str2);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "getControllerConfig(" + str + ")");
            String d = new C11710f(str).mo45022d(C11618w.f52120n0);
            if (!TextUtils.isEmpty(d)) {
                JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
                m51692b(controllerConfigAsJSONObject);
                m51693c(controllerConfigAsJSONObject, SDKUtils.getTesterParameters());
                m51695e(controllerConfigAsJSONObject);
                C11618w.this.mo44787b(C11618w.m51601b(d, controllerConfigAsJSONObject.toString()));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0080 A[Catch:{ Exception -> 0x008c }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getDemandSourceState(java.lang.String r9) {
            /*
                r8 = this;
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.C11618w.this
                java.lang.String r0 = r0.f52145e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getMediationState("
                r1.<init>(r2)
                r1.append(r9)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.m51953i(r0, r1)
                com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
                r0.<init>(r9)
                java.lang.String r1 = "demandSourceName"
                java.lang.String r2 = r0.mo45022d(r1)
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId((com.ironsource.sdk.p294g.C11710f) r0)
                java.lang.String r4 = "productType"
                java.lang.String r0 = r0.mo45022d(r4)
                if (r0 == 0) goto L_0x009a
                if (r2 == 0) goto L_0x009a
                r5 = 0
                com.ironsource.sdk.g.d$e r6 = com.ironsource.sdk.utils.SDKUtils.getProductType(r0)     // Catch:{ Exception -> 0x008c }
                if (r6 == 0) goto L_0x009a
                com.ironsource.sdk.controller.w r7 = com.ironsource.sdk.controller.C11618w.this     // Catch:{ Exception -> 0x008c }
                com.ironsource.sdk.controller.j r7 = r7.f52134M     // Catch:{ Exception -> 0x008c }
                com.ironsource.sdk.g.c r6 = r7.mo44754a(r6, r3)     // Catch:{ Exception -> 0x008c }
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x008c }
                r7.<init>()     // Catch:{ Exception -> 0x008c }
                r7.put(r4, r0)     // Catch:{ Exception -> 0x008c }
                r7.put(r1, r2)     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = "demandSourceId"
                r7.put(r0, r3)     // Catch:{ Exception -> 0x008c }
                if (r6 == 0) goto L_0x0070
                int r0 = r6.f52388c     // Catch:{ Exception -> 0x008c }
                r1 = -1
                if (r0 != r1) goto L_0x005f
                r0 = 1
                goto L_0x0060
            L_0x005f:
                r0 = 0
            L_0x0060:
                if (r0 != 0) goto L_0x0070
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.C11618w.this     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = new com.ironsource.sdk.p294g.C11710f(r9).mo45022d(com.ironsource.sdk.controller.C11618w.f52120n0)     // Catch:{ Exception -> 0x008c }
                java.lang.String r1 = "state"
                int r2 = r6.f52388c     // Catch:{ Exception -> 0x008c }
                r7.put(r1, r2)     // Catch:{ Exception -> 0x008c }
                goto L_0x0076
            L_0x0070:
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.C11618w.this     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = new com.ironsource.sdk.p294g.C11710f(r9).mo45022d(com.ironsource.sdk.controller.C11618w.f52121o0)     // Catch:{ Exception -> 0x008c }
            L_0x0076:
                java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x008c }
                boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x008c }
                if (r2 != 0) goto L_0x009a
                com.ironsource.sdk.controller.w r2 = com.ironsource.sdk.controller.C11618w.this     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = com.ironsource.sdk.controller.C11618w.m51601b(r0, r1)     // Catch:{ Exception -> 0x008c }
                com.ironsource.sdk.controller.w r1 = com.ironsource.sdk.controller.C11618w.this     // Catch:{ Exception -> 0x008c }
                r1.mo44787b((java.lang.String) r0)     // Catch:{ Exception -> 0x008c }
                goto L_0x009a
            L_0x008c:
                r0 = move-exception
                com.ironsource.sdk.controller.w r1 = com.ironsource.sdk.controller.C11618w.this
                java.lang.String r2 = r0.getMessage()
                r3 = 0
                com.ironsource.sdk.controller.C11618w.m51568B(r1, r9, r5, r2, r3)
                r0.printStackTrace()
            L_0x009a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C11618w.C11622d.getDemandSourceState(java.lang.String):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x004e, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0052;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getDeviceStatus(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.C11618w.this
                java.lang.String r0 = r0.f52145e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getDeviceStatus("
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.m51953i(r0, r1)
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.C11618w.this
                java.lang.String r0 = new com.ironsource.sdk.p294g.C11710f(r5).mo45022d(com.ironsource.sdk.controller.C11618w.f52120n0)
                com.ironsource.sdk.controller.w r1 = com.ironsource.sdk.controller.C11618w.this
                java.lang.String r5 = new com.ironsource.sdk.p294g.C11710f(r5).mo45022d(com.ironsource.sdk.controller.C11618w.f52121o0)
                com.ironsource.sdk.controller.w r1 = com.ironsource.sdk.controller.C11618w.this
                android.content.Context r2 = r1.getContext()
                java.lang.Object[] r1 = r1.m51592W(r2)
                r2 = 0
                r2 = r1[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r1 = r1[r3]
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x004a
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L_0x0051
                r0 = r5
                goto L_0x0052
            L_0x004a:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x0051
                goto L_0x0052
            L_0x0051:
                r0 = 0
            L_0x0052:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x0067
                com.ironsource.sdk.controller.w r5 = com.ironsource.sdk.controller.C11618w.this
                java.lang.String r1 = "onGetDeviceStatusSuccess"
                java.lang.String r3 = "onGetDeviceStatusFail"
                java.lang.String r5 = com.ironsource.sdk.controller.C11618w.m51644x(r0, r2, r1, r3)
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.C11618w.this
                r0.mo44787b((java.lang.String) r5)
            L_0x0067:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C11618w.C11622d.getDeviceStatus(java.lang.String):void");
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "getDeviceVolume(" + str + ")");
            try {
                C11755a.m51959a(C11618w.this.f52144W.mo44689a());
                float b = C11755a.m51961b(C11618w.this.f52144W.mo44689a());
                C11710f fVar = new C11710f(str);
                fVar.mo45017a("deviceVolume", String.valueOf(b));
                C11618w.m51568B(C11618w.this, fVar.toString(), true, (String) null, (String) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            Activity a = C11618w.this.f52144W.mo44689a();
            if (a != null) {
                String N = new C11710f(str).mo45022d(C11618w.f52120n0);
                String jSONObject = SDKUtils.getOrientation(a).toString();
                if (!TextUtils.isEmpty(N)) {
                    C11618w.this.mo44787b(C11618w.m51644x(N, jSONObject, "onGetOrientationSuccess", "onGetOrientationFail"));
                }
            }
        }

        @JavascriptInterface
        public void getUserData(String str) {
            String str2 = str;
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "getUserData(" + str2 + ")");
            C11710f fVar = new C11710f(str2);
            if (!fVar.mo45019a("key")) {
                C11618w.m51568B(C11618w.this, str2, false, "key does not exist", (String) null);
                return;
            }
            String N = new C11710f(str2).mo45022d(C11618w.f52120n0);
            String d = fVar.mo45022d("key");
            String string = C11756b.m51963a().f52501a.getString(d, (String) null);
            if (string == null) {
                string = "{}";
            }
            C11618w.this.mo44787b(C11618w.m51601b(N, C11618w.m51598a(d, string, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                String M = C11618w.this.f52145e;
                Logger.m51953i(M, "iabTokenAPI(" + str + ")");
                C11710f fVar = new C11710f(str);
                C11615u x0 = C11618w.this.f52137P;
                String fVar2 = fVar.toString();
                C11623a aVar = new C11623a();
                JSONObject jSONObject = new JSONObject(fVar2);
                C11615u.C11616a aVar2 = new C11615u.C11616a((byte) 0);
                aVar2.f52112a = jSONObject.optString("functionName");
                aVar2.f52113b = jSONObject.optJSONObject("functionParams");
                aVar2.f52114c = jSONObject.optString("success");
                aVar2.f52115d = jSONObject.optString("fail");
                if ("updateToken".equals(aVar2.f52112a)) {
                    JSONObject jSONObject2 = aVar2.f52113b;
                    C11710f fVar3 = new C11710f();
                    try {
                        C11748c cVar = x0.f52109c;
                        C11412m.m51069a("ctgp", jSONObject2);
                        x0.f52108b.mo45062a(jSONObject2);
                        aVar.mo44866a(true, aVar2.f52114c, fVar3);
                    } catch (Exception e) {
                        e.printStackTrace();
                        String str2 = C11615u.f52106f;
                        Logger.m51953i(str2, "updateToken exception " + e.getMessage());
                        aVar.mo44866a(false, aVar2.f52115d, fVar3);
                    }
                } else if ("getToken".equals(aVar2.f52112a)) {
                    try {
                        aVar.mo44867a(true, aVar2.f52114c, SDKUtils.getControllerConfigAsJSONObject().optBoolean("oneToken") ? x0.mo44778a() : x0.f52108b.mo45063b(x0.f52110d));
                    } catch (Exception e2) {
                        String str3 = aVar2.f52115d;
                        String message = e2.getMessage();
                        C11710f fVar4 = new C11710f();
                        fVar4.mo45017a(C11618w.f52121o0, str3);
                        fVar4.mo45017a("data", message);
                        C11618w.m51568B(C11618w.this, fVar4.toString(), false, (String) null, (String) null);
                    }
                } else {
                    String str4 = C11615u.f52106f;
                    Logger.m51953i(str4, "unhandled API request " + fVar2);
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                String M2 = C11618w.this.f52145e;
                Logger.m51953i(M2, "iabTokenAPI failed with exception " + e3.getMessage());
            }
        }

        @JavascriptInterface
        public void initController(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "initController(" + str + ")");
            C11710f fVar = new C11710f(str);
            CountDownTimer countDownTimer = C11618w.this.f52146f;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                C11618w.this.f52146f = null;
            }
            if (fVar.mo45019a("stage")) {
                String d = fVar.mo45022d("stage");
                if ("ready".equalsIgnoreCase(d)) {
                    boolean unused = C11618w.this.f52154m = true;
                    C11618w.this.f52142U.mo44695b();
                } else if ("loaded".equalsIgnoreCase(d)) {
                    C11618w.this.f52142U.mo44693a();
                } else if ("failed".equalsIgnoreCase(d)) {
                    String d2 = fVar.mo45022d("errMsg");
                    C11557e h0 = C11618w.this.f52142U;
                    h0.mo44694a("controller js failed to initialize : " + d2);
                } else {
                    Logger.m51953i(C11618w.this.f52145e, "No STAGE mentioned! should not get here!");
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            C11618w.this.mo44780D(new C11637m(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onAdWindowsClosed(" + str + ")");
            C11618w.this.f52130I.f52375e = -1;
            C11618w.this.f52130I.f52373c = null;
            C11665s unused = C11618w.this.f52155n = null;
            C11710f fVar = new C11710f(str);
            String d = fVar.mo45022d("productType");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C11703d.C11708e a0 = C11618w.m51616i0(d);
            String G0 = C11618w.this.f52147g;
            Log.d(G0, "onAdClosed() with type " + a0);
            if (C11618w.this.mo44781I(d)) {
                C11618w.this.mo44779C(a0, fetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onGetApplicationInfoFail(" + str + ")");
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            C11618w.m51590U(C11618w.this, "onGetApplicationInfoFail", str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onGetApplicationInfoSuccess(" + str + ")");
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            C11618w.m51590U(C11618w.this, "onGetApplicationInfoSuccess", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onGetCachedFilesMapFail(" + str + ")");
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            C11618w.m51590U(C11618w.this, "onGetCachedFilesMapFail", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onGetCachedFilesMapSuccess(" + str + ")");
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            C11618w.m51590U(C11618w.this, "onGetCachedFilesMapSuccess", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onGetDeviceStatusFail(" + str + ")");
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            C11618w.m51590U(C11618w.this, "onGetDeviceStatusFail", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onGetDeviceStatusSuccess(" + str + ")");
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            C11618w.m51590U(C11618w.this, "onGetDeviceStatusSuccess", str);
        }

        @JavascriptInterface
        public void onGetUserCreditsFail(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onGetUserCreditsFail(" + str + ")");
            String d = new C11710f(str).mo45022d("errMsg");
            if (C11618w.this.mo44781I(C11703d.C11708e.OfferWall.toString())) {
                C11618w.this.mo44780D(new C11634j(d));
            }
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            C11618w.m51590U(C11618w.this, "onGetUserCreditsFail", str);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onInitBannerFail(" + str + ")");
            C11710f fVar = new C11710f(str);
            String d = fVar.mo45022d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m51953i(C11618w.this.f52145e, "onInitBannerFail failed with no demand source");
                return;
            }
            C11588j F0 = C11618w.this.f52134M;
            C11703d.C11708e eVar = C11703d.C11708e.Banner;
            C11702c a = F0.mo44754a(eVar, fetchDemandSourceId);
            if (a != null) {
                a.mo45000a(3);
            }
            if (C11618w.this.mo44781I(eVar.toString())) {
                C11618w.this.mo44780D(new C11631g(d, fetchDemandSourceId));
            }
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            C11618w.m51590U(C11618w.this, "onInitBannerFail", str);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.m51953i(C11618w.this.f52145e, "onInitBannerSuccess()");
            C11618w.m51590U(C11618w.this, "onInitBannerSuccess", "true");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C11710f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m51953i(C11618w.this.f52145e, "onInitBannerSuccess failed with no demand source");
            } else if (C11618w.this.mo44781I(C11703d.C11708e.Banner.toString())) {
                C11618w.this.mo44780D(new C11630f(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onInitInterstitialFail(" + str + ")");
            C11710f fVar = new C11710f(str);
            String d = fVar.mo45022d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m51953i(C11618w.this.f52145e, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            C11588j F0 = C11618w.this.f52134M;
            C11703d.C11708e eVar = C11703d.C11708e.Interstitial;
            C11702c a = F0.mo44754a(eVar, fetchDemandSourceId);
            if (a != null) {
                a.mo45000a(3);
            }
            if (C11618w.this.mo44781I(eVar.toString())) {
                C11618w.this.mo44780D(new C11648x(d, fetchDemandSourceId));
            }
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            C11618w.m51590U(C11618w.this, "onInitInterstitialFail", str);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.m51953i(C11618w.this.f52145e, "onInitInterstitialSuccess()");
            C11618w.m51590U(C11618w.this, "onInitInterstitialSuccess", "true");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C11710f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m51953i(C11618w.this.f52145e, "onInitInterstitialSuccess failed with no demand source");
            } else if (C11618w.this.mo44781I(C11703d.C11708e.Interstitial.toString())) {
                C11618w.this.mo44780D(new C11647w(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitOfferWallFail(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onInitOfferWallFail(" + str + ")");
            C11618w.this.f52130I.f52379i = false;
            String d = new C11710f(str).mo45022d("errMsg");
            if (C11618w.this.f52130I.f52378h) {
                C11618w.this.f52130I.f52378h = false;
                if (C11618w.this.mo44781I(C11703d.C11708e.OfferWall.toString())) {
                    C11618w.this.mo44780D(new C11626b0(d));
                }
            }
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            C11618w.m51590U(C11618w.this, "onInitOfferWallFail", str);
        }

        @JavascriptInterface
        public void onInitOfferWallSuccess(String str) {
            C11618w.m51590U(C11618w.this, "onInitOfferWallSuccess", "true");
            C11618w.this.f52130I.f52379i = true;
            if (C11618w.this.f52130I.f52378h) {
                C11618w.this.f52130I.f52378h = false;
                if (C11618w.this.mo44781I(C11703d.C11708e.OfferWall.toString())) {
                    C11618w.this.mo44780D(new C11624a0());
                }
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onInitRewardedVideoFail(" + str + ")");
            C11710f fVar = new C11710f(str);
            String d = fVar.mo45022d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C11588j F0 = C11618w.this.f52134M;
            C11703d.C11708e eVar = C11703d.C11708e.RewardedVideo;
            C11702c a = F0.mo44754a(eVar, fetchDemandSourceId);
            if (a != null) {
                a.mo45000a(3);
            }
            if (C11618w.this.mo44781I(eVar.toString())) {
                C11618w.this.mo44780D(new C11643s(d, fetchDemandSourceId));
            }
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            C11618w.m51590U(C11618w.this, "onInitRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.m51953i(C11618w.this.f52145e, "onLoadBannerFail()");
            C11710f fVar = new C11710f(str);
            String d = fVar.mo45022d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId) && C11618w.this.mo44781I(C11703d.C11708e.Banner.toString())) {
                C11618w.this.mo44780D(new C11633i(d, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.m51953i(C11618w.this.f52145e, "onLoadBannerSuccess()");
            C11710f fVar = new C11710f(str);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            String d = fVar.mo45022d("adViewId");
            C11541e eVar = null;
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            C11539d a = C11539d.m51410a();
            if (!d.isEmpty() && a.f51881b.containsKey(d)) {
                eVar = a.f51881b.get(d);
            }
            if (eVar == null) {
                C11722b e = C11618w.this.f52125D;
                e.mo44966d(fetchDemandSourceId, "not found view for the current adViewId= " + d);
            } else if (eVar instanceof C11532a) {
                C11532a aVar = (C11532a) eVar;
                if (C11618w.this.mo44781I(C11703d.C11708e.Banner.toString())) {
                    C11618w.this.mo44780D(new C11632h(fetchDemandSourceId, aVar));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onLoadInterstitialFail(" + str + ")");
            C11710f fVar = new C11710f(str);
            String d = fVar.mo45022d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                m51691a(fetchDemandSourceId, false);
                if (C11618w.this.mo44781I(C11703d.C11708e.Interstitial.toString())) {
                    C11618w.this.mo44780D(new C11627c(d, fetchDemandSourceId));
                }
                C11618w.m51590U(C11618w.this, "onLoadInterstitialFail", "true");
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onLoadInterstitialSuccess(" + str + ")");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C11710f(str));
            m51691a(fetchDemandSourceId, true);
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            if (C11618w.this.mo44781I(C11703d.C11708e.Interstitial.toString())) {
                C11618w.this.mo44780D(new C11625b(fetchDemandSourceId));
            }
            C11618w.m51590U(C11618w.this, "onLoadInterstitialSuccess", "true");
        }

        @JavascriptInterface
        public void onOfferWallGeneric(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onOfferWallGeneric(" + str + ")");
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onShowInterstitialFail(" + str + ")");
            C11710f fVar = new C11710f(str);
            String d = fVar.mo45022d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                m51691a(fetchDemandSourceId, false);
                if (C11618w.this.mo44781I(C11703d.C11708e.Interstitial.toString())) {
                    C11618w.this.mo44780D(new C11629e(d, fetchDemandSourceId));
                }
                C11618w.m51590U(C11618w.this, "onShowInterstitialFail", str);
            }
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onShowInterstitialSuccess(" + str + ")");
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C11710f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m51953i(C11618w.this.f52145e, "onShowInterstitialSuccess called with no demand");
                return;
            }
            C11700b B0 = C11618w.this.f52130I;
            C11703d.C11708e eVar = C11703d.C11708e.Interstitial;
            B0.f52375e = eVar.ordinal();
            C11618w.this.f52130I.f52373c = fetchDemandSourceId;
            if (C11618w.this.mo44781I(eVar.toString())) {
                C11618w.this.mo44780D(new C11650z(fetchDemandSourceId));
                C11618w.m51590U(C11618w.this, "onShowInterstitialSuccess", str);
            }
            m51691a(fetchDemandSourceId, false);
        }

        @JavascriptInterface
        public void onShowOfferWallFail(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onShowOfferWallFail(" + str + ")");
            String d = new C11710f(str).mo45022d("errMsg");
            if (C11618w.this.mo44781I(C11703d.C11708e.OfferWall.toString())) {
                C11618w.this.mo44780D(new C11646v(d));
            }
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            C11618w.m51590U(C11618w.this, "onShowOfferWallFail", str);
        }

        @JavascriptInterface
        public void onShowOfferWallSuccess(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onShowOfferWallSuccess(" + str + ")");
            C11700b B0 = C11618w.this.f52130I;
            C11703d.C11708e eVar = C11703d.C11708e.OfferWall;
            B0.f52375e = eVar.ordinal();
            String valueFromJsonObject = SDKUtils.getValueFromJsonObject(str, "placementId");
            if (C11618w.this.mo44781I(eVar.toString())) {
                C11618w.this.mo44780D(new C11645u(valueFromJsonObject));
            }
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            C11618w.m51590U(C11618w.this, "onShowOfferWallSuccess", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onShowRewardedVideoFail(" + str + ")");
            C11710f fVar = new C11710f(str);
            String d = fVar.mo45022d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (C11618w.this.mo44781I(C11703d.C11708e.RewardedVideo.toString())) {
                C11618w.this.mo44780D(new C11644t(d, fetchDemandSourceId));
            }
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            C11618w.m51590U(C11618w.this, "onShowRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onShowRewardedVideoSuccess(" + str + ")");
            C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
            C11618w.m51590U(C11618w.this, "onShowRewardedVideoSuccess", str);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            String M = C11618w.this.f52145e;
            Log.d(M, "onVideoStatusChanged(" + str + ")");
            C11710f fVar = new C11710f(str);
            String d = fVar.mo45022d("productType");
            if (C11618w.this.f52129H != null && !TextUtils.isEmpty(d)) {
                String d2 = fVar.mo45022d(IronSourceConstants.EVENTS_STATUS);
                if ("started".equalsIgnoreCase(d2)) {
                    C11618w.this.f52129H.onVideoStarted();
                } else if ("paused".equalsIgnoreCase(d2)) {
                    C11618w.this.f52129H.onVideoPaused();
                } else if ("playing".equalsIgnoreCase(d2)) {
                    C11618w.this.f52129H.onVideoResumed();
                } else if ("ended".equalsIgnoreCase(d2)) {
                    C11618w.this.f52129H.onVideoEnded();
                } else if ("stopped".equalsIgnoreCase(d2)) {
                    C11618w.this.f52129H.onVideoStopped();
                } else {
                    String M2 = C11618w.this.f52145e;
                    Logger.m51953i(M2, "onVideoStatusChanged: unknown status: " + d2);
                }
            }
        }

        @JavascriptInterface
        public void openUrl(String str) {
            Class<OpenUrlActivity> cls = OpenUrlActivity.class;
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "openUrl(" + str + ")");
            C11710f fVar = new C11710f(str);
            String d = fVar.mo45022d("url");
            String d2 = fVar.mo45022d("method");
            String d3 = fVar.mo45022d("package_name");
            Activity a = C11618w.this.f52144W.mo44689a();
            try {
                String lowerCase = d2.toLowerCase();
                char c = 65535;
                int hashCode = lowerCase.hashCode();
                if (hashCode != -1455867212) {
                    if (hashCode != 109770977) {
                        if (hashCode == 1224424441) {
                            if (lowerCase.equals("webview")) {
                                c = 1;
                            }
                        }
                    } else if (lowerCase.equals("store")) {
                        c = 2;
                    }
                } else if (lowerCase.equals("external_browser")) {
                    c = 0;
                }
                if (c == 0) {
                    C4952a.C49531.m22721a(a, d, d3);
                } else if (c == 1) {
                    Intent intent = new Intent(a, cls);
                    intent.putExtra(C11618w.f52117c, d);
                    intent.putExtra(C11618w.f52118d, true);
                    intent.putExtra("immersive", C11618w.this.f52133L);
                    a.startActivity(intent);
                } else if (c == 2) {
                    Intent intent2 = new Intent(a, cls);
                    intent2.putExtra(C11618w.f52117c, d);
                    intent2.putExtra(C11618w.f52116b, true);
                    intent2.putExtra(C11618w.f52118d, true);
                    a.startActivity(intent2);
                }
            } catch (Exception e) {
                C11618w.m51568B(C11618w.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            C11618w.this.mo44780D(new C11628d());
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            C11710f fVar;
            String str2;
            try {
                String M = C11618w.this.f52145e;
                Logger.m51953i(M, "permissionsAPI(" + str + ")");
                C11710f fVar2 = new C11710f(str);
                C11611r i = C11618w.this.f52136O;
                String fVar3 = fVar2.toString();
                C11623a aVar = new C11623a();
                JSONObject jSONObject = new JSONObject(fVar3);
                C11611r.C11612a aVar2 = new C11611r.C11612a((byte) 0);
                aVar2.f52099a = jSONObject.optString("functionName");
                aVar2.f52100b = jSONObject.optJSONObject("functionParams");
                aVar2.f52101c = jSONObject.optString("success");
                aVar2.f52102d = jSONObject.optString("fail");
                if ("getPermissions".equals(aVar2.f52099a)) {
                    JSONObject jSONObject2 = aVar2.f52100b;
                    fVar = new C11710f();
                    try {
                        fVar.mo45018a("permissions", C4961c.m22740a(i.f52098a, jSONObject2.getJSONArray("permissions")));
                        aVar.mo44866a(true, aVar2.f52101c, fVar);
                    } catch (Exception e) {
                        e.printStackTrace();
                        String str3 = C11611r.f52097b;
                        Logger.m51953i(str3, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e.getMessage());
                        fVar.mo45017a("errMsg", e.getMessage());
                        str2 = aVar2.f52102d;
                        aVar.mo44866a(false, str2, fVar);
                    }
                } else if ("isPermissionGranted".equals(aVar2.f52099a)) {
                    JSONObject jSONObject3 = aVar2.f52100b;
                    fVar = new C11710f();
                    try {
                        String string = jSONObject3.getString("permission");
                        fVar.mo45017a("permission", string);
                        if (C4961c.m22741a(i.f52098a, string)) {
                            fVar.mo45017a(IronSourceConstants.EVENTS_STATUS, String.valueOf(C4961c.m22743b(i.f52098a, string)));
                            aVar.mo44866a(true, aVar2.f52101c, fVar);
                            return;
                        }
                        fVar.mo45017a(IronSourceConstants.EVENTS_STATUS, "unhandledPermission");
                        aVar.mo44866a(false, aVar2.f52102d, fVar);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        fVar.mo45017a("errMsg", e2.getMessage());
                        str2 = aVar2.f52102d;
                        aVar.mo44866a(false, str2, fVar);
                    }
                } else {
                    String str4 = C11611r.f52097b;
                    Logger.m51953i(str4, "PermissionsJSAdapter unhandled API request " + fVar3);
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                String M2 = C11618w.this.f52145e;
                Logger.m51953i(M2, "permissionsAPI failed with exception " + e3.getMessage());
            }
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            String str2 = str;
            try {
                String M = C11618w.this.f52145e;
                Logger.m51953i(M, "postAdEventNotification(" + str2 + ")");
                C11710f fVar = new C11710f(str2);
                String d = fVar.mo45022d("eventName");
                if (TextUtils.isEmpty(d)) {
                    C11618w.m51568B(C11618w.this, str2, false, "eventName does not exist", (String) null);
                    return;
                }
                String d2 = fVar.mo45022d("dsName");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                String str3 = !TextUtils.isEmpty(fetchDemandSourceId) ? fetchDemandSourceId : d2;
                JSONObject jSONObject = (JSONObject) fVar.mo45021c("extData");
                String d3 = fVar.mo45022d("productType");
                C11703d.C11708e a0 = C11618w.m51616i0(d3);
                if (C11618w.this.mo44781I(d3)) {
                    String N = new C11710f(str2).mo45022d(C11618w.f52120n0);
                    if (!TextUtils.isEmpty(N)) {
                        C11618w.this.mo44787b(C11618w.m51644x(N, C11618w.m51598a("productType", d3, "eventName", d, "demandSourceName", d2, "demandSourceId", str3, (String) null, false), "postAdEventNotificationSuccess", "postAdEventNotificationFail"));
                    }
                    C11618w.this.mo44780D(new C11635k(a0, str3, d, jSONObject));
                    return;
                }
                C11618w.m51568B(C11618w.this, str2, false, "productType does not exist", (String) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "removeCloseEventHandler(" + str + ")");
            if (C11618w.this.f52157p != null) {
                C11618w.this.f52157p.cancel();
            }
            boolean unused = C11618w.this.f52156o = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            C11618w.this.mo44780D(new C11638n());
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            C11618w.this.mo44780D(new C11636l());
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                String M = C11618w.this.f52145e;
                Logger.m51953i(M, "saveFile(" + str + ")");
                C11710f fVar = new C11710f(str);
                String d = fVar.mo45022d("path");
                String d2 = fVar.mo45022d("file");
                if (TextUtils.isEmpty(d2)) {
                    C11618w.m51568B(C11618w.this, str, false, "Missing parameters for file", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    return;
                }
                C11715c cVar = new C11715c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C11618w.this.f52127F, d), SDKUtils.getFileName(d2));
                if (C4979h.m22784a(C11618w.this.f52127F) <= 0) {
                    C11618w.m51568B(C11618w.this, str, false, "no_disk_space", (String) null);
                } else if (!SDKUtils.isExternalStorageAvailable()) {
                    C11618w.m51568B(C11618w.this, str, false, "sotrage_unavailable", (String) null);
                } else if (cVar.exists()) {
                    C11618w.m51568B(C11618w.this, str, false, "file_already_exist", (String) null);
                } else if (!C4952a.C49531.m22724b(C11618w.this.getContext())) {
                    C11618w.m51568B(C11618w.this, str, false, "no_network_connection", (String) null);
                } else {
                    C11618w.m51568B(C11618w.this, str, true, (String) null, (String) null);
                    C11732b v0 = C11618w.this.f52152l;
                    v0.mo45037a(cVar, d2, v0.f52441a);
                }
            } catch (Exception e) {
                C11618w.m51568B(C11618w.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "setBackButtonState(" + str + ")");
            String d = new C11710f(str).mo45022d("state");
            SharedPreferences.Editor edit = C11756b.m51963a().f52501a.edit();
            edit.putString("back_button_state", d);
            edit.apply();
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "setForceClose(" + str + ")");
            C11710f fVar = new C11710f(str);
            String d = fVar.mo45022d("width");
            String d2 = fVar.mo45022d("height");
            int unused = C11618w.this.f52158q = Integer.parseInt(d);
            int unused2 = C11618w.this.f52159r = Integer.parseInt(d2);
            String unused3 = C11618w.this.f52160s = fVar.mo45022d("position");
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "setMixedContentAlwaysAllow(" + str + ")");
            C11618w.this.mo44780D(new C11639o());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "setOrientation(" + str + ")");
            String d = new C11710f(str).mo45022d(AdUnitActivity.EXTRA_ORIENTATION);
            C11618w wVar = C11618w.this;
            wVar.f52167z = d;
            if (wVar.f52153l0 != null) {
                C11618w.this.f52153l0.onOrientationChanged(d, C4979h.m22813l(C11618w.this.getContext()));
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "setStoreSearchKeys(" + str + ")");
            SharedPreferences.Editor edit = C11756b.m51963a().f52501a.edit();
            edit.putString("search_keys", str);
            edit.apply();
        }

        @JavascriptInterface
        public void setUserData(String str) {
            String str2 = str;
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "setUserData(" + str2 + ")");
            C11710f fVar = new C11710f(str2);
            if (!fVar.mo45019a("key")) {
                C11618w.m51568B(C11618w.this, str2, false, "key does not exist", (String) null);
            } else if (!fVar.mo45019a("value")) {
                C11618w.m51568B(C11618w.this, str2, false, "value does not exist", (String) null);
            } else {
                String d = fVar.mo45022d("key");
                String d2 = fVar.mo45022d("value");
                SharedPreferences.Editor edit = C11756b.m51963a().f52501a.edit();
                edit.putString(d, d2);
                if (edit.commit()) {
                    C11618w.this.mo44787b(C11618w.m51601b(new C11710f(str2).mo45022d(C11618w.f52120n0), C11618w.m51598a(d, d2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                    return;
                }
                C11618w.m51568B(C11618w.this, str2, false, "SetUserData failed writing to shared preferences", (String) null);
            }
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "setWebviewBackgroundColor(" + str + ")");
            C11618w.m51610f0(C11618w.this, str);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$e */
    class C11651e implements C11667u {
        C11651e() {
        }

        /* renamed from: a */
        public final void mo44797a(String str, C11703d.C11708e eVar, C11702c cVar) {
            C11618w.m51566A(C11618w.this, str, eVar, cVar);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$f */
    class C11652f implements C11667u {
        C11652f() {
        }

        /* renamed from: a */
        public final void mo44797a(String str, C11703d.C11708e eVar, C11702c cVar) {
            C11618w.m51566A(C11618w.this, str, eVar, cVar);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$g */
    public enum C11653g {
        Display,
        Gone
    }

    /* renamed from: com.ironsource.sdk.controller.w$h */
    class C11654h implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11703d.C11708e f52249b;

        /* renamed from: c */
        private /* synthetic */ C11702c f52250c;

        /* renamed from: d */
        private /* synthetic */ String f52251d;

        C11654h(C11703d.C11708e eVar, C11702c cVar, String str) {
            this.f52249b = eVar;
            this.f52250c = cVar;
            this.f52251d = str;
        }

        public final void run() {
            C11703d.C11708e eVar = C11703d.C11708e.RewardedVideo;
            C11703d.C11708e eVar2 = this.f52249b;
            if (eVar == eVar2 || C11703d.C11708e.Interstitial == eVar2 || C11703d.C11708e.Banner == eVar2) {
                C11702c cVar = this.f52250c;
                if (cVar != null && !TextUtils.isEmpty(cVar.f52387b)) {
                    C11721a r = C11618w.this.m51581L(this.f52249b);
                    String M = C11618w.this.f52145e;
                    Log.d(M, "onAdProductInitFailed (message:" + this.f52251d + ")(" + this.f52249b + ")");
                    if (r != null) {
                        r.mo44938a(this.f52249b, this.f52250c.f52387b, this.f52251d);
                    }
                }
            } else if (C11703d.C11708e.OfferWall == eVar2) {
                C11618w.this.f52124C.onOfferwallInitFail(this.f52251d);
            } else if (C11703d.C11708e.OfferWallCredits == eVar2) {
                C11618w.this.f52124C.onGetOWCreditsFailed(this.f52251d);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$i */
    class C11655i extends C11741b {
        C11655i(JSONObject jSONObject, Context context) {
            super(jSONObject, context);
        }

        /* renamed from: a */
        public final void mo44896a() {
            if (C11618w.this.f52154m) {
                C11618w.this.mo44788d("none");
            }
        }

        /* renamed from: a */
        public final void mo44897a(String str) {
            if (C11618w.this.f52154m) {
                C11618w.this.mo44788d(str);
            }
        }

        /* renamed from: a */
        public final void mo44898a(String str, JSONObject jSONObject) {
            if (jSONObject != null && C11618w.this.f52154m) {
                try {
                    jSONObject.put("connectionType", str);
                    C11618w wVar = C11618w.this;
                    String str2 = wVar.f52145e;
                    Logger.m51953i(str2, "device connection info changed: " + jSONObject.toString());
                    wVar.mo44787b(C11618w.m51601b("connectionInfoChanged", C11618w.m51598a("connectionInfo", jSONObject.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$j */
    class C11656j implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f52254b;

        /* renamed from: c */
        private /* synthetic */ StringBuilder f52255c;

        C11656j(String str, StringBuilder sb) {
            this.f52254b = str;
            this.f52255c = sb;
        }

        public final void run() {
            C11618w wVar;
            Boolean bool;
            Logger.m51953i(C11618w.this.f52145e, this.f52254b);
            try {
                if (C11618w.this.f52126E != null) {
                    if (C11618w.this.f52126E.booleanValue()) {
                        C11618w.this.evaluateJavascript(this.f52255c.toString(), (ValueCallback) null);
                        return;
                    } else {
                        C11618w.this.loadUrl(this.f52254b);
                        return;
                    }
                } else if (Build.VERSION.SDK_INT >= 19) {
                    C11618w.this.evaluateJavascript(this.f52255c.toString(), (ValueCallback) null);
                    Boolean unused = C11618w.this.f52126E = Boolean.TRUE;
                    return;
                } else {
                    C11618w.this.loadUrl(this.f52254b);
                    Boolean unused2 = C11618w.this.f52126E = Boolean.FALSE;
                    return;
                }
            } catch (NoSuchMethodError e) {
                String M = C11618w.this.f52145e;
                Logger.m51951e(M, "evaluateJavascrip NoSuchMethodError: SDK version=" + Build.VERSION.SDK_INT + " " + e);
                C11618w.this.loadUrl(this.f52254b);
                wVar = C11618w.this;
                bool = Boolean.FALSE;
            } catch (Throwable th) {
                String M2 = C11618w.this.f52145e;
                Logger.m51951e(M2, "injectJavascript: " + th.toString());
                return;
            }
            Boolean unused3 = wVar.f52126E = bool;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$k */
    class C11657k implements Runnable {
        C11657k() {
        }

        public final void run() {
            C11618w.this.mo44782a(1);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$l */
    class C11658l implements Runnable {
        C11658l() {
        }

        public final void run() {
            C11618w.this.mo44782a(1);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$m */
    class C11659m implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11709e f52259b;

        C11659m(C11709e eVar) {
            this.f52259b = eVar;
        }

        public final void run() {
            C11557e h0 = C11618w.this.f52142U;
            h0.mo44694a("controller html - failed to download - " + this.f52259b.f52425a);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$n */
    class C11660n implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f52261b;

        /* renamed from: c */
        private /* synthetic */ String f52262c;

        C11660n(String str, String str2) {
            this.f52261b = str;
            this.f52262c = str2;
        }

        public final void run() {
            if (C11618w.m51596a() == C11703d.C11707d.MODE_3.f52417d) {
                Activity a = C11618w.this.f52144W.mo44689a();
                Toast.makeText(a, this.f52261b + " : " + this.f52262c, 1).show();
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$o */
    class C11661o implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11703d.C11708e f52264b;

        /* renamed from: c */
        private /* synthetic */ String f52265c;

        C11661o(C11703d.C11708e eVar, String str) {
            this.f52264b = eVar;
            this.f52265c = str;
        }

        public final void run() {
            C11703d.C11708e eVar = this.f52264b;
            if (eVar == C11703d.C11708e.RewardedVideo || eVar == C11703d.C11708e.Interstitial) {
                C11721a r = C11618w.this.m51581L(eVar);
                if (r != null) {
                    r.mo44936a(this.f52264b, this.f52265c);
                }
            } else if (eVar == C11703d.C11708e.OfferWall) {
                C11618w.this.f52124C.onOWAdClosed();
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$p */
    class C11662p implements C11672x {
        C11662p() {
        }

        /* renamed from: a */
        public final void mo44905a(String str, JSONObject jSONObject) {
            C11618w.this.mo44787b(C11618w.m51601b(str, jSONObject.toString()));
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$q */
    class C11663q extends CountDownTimer {

        /* renamed from: a */
        private /* synthetic */ int f52268a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11663q(long j, long j2, int i) {
            super(50000, 1000);
            this.f52268a = i;
        }

        public final void onFinish() {
            Logger.m51953i(C11618w.this.f52145e, "Loading Controller Timer Finish");
            int i = this.f52268a;
            if (i == 3) {
                C11618w.this.f52142U.mo44694a("controller html - failed to load into web-view");
            } else {
                C11618w.this.mo44782a(i + 1);
            }
        }

        public final void onTick(long j) {
            String M = C11618w.this.f52145e;
            Logger.m51953i(M, "Loading Controller Timer Tick " + j);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$r */
    class C11664r extends WebChromeClient {
        private C11664r() {
        }

        /* synthetic */ C11664r(C11618w wVar, byte b) {
            this();
        }

        public final View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(C11618w.this.f52144W.mo44689a());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.m51953i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new C11666t(C11618w.this, (byte) 0));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.m51953i("onCreateWindow", "onCreateWindow");
            return true;
        }

        public final void onHideCustomView() {
            Logger.m51953i("Test", "onHideCustomView");
            if (C11618w.this.f52162u != null) {
                C11618w.this.f52162u.setVisibility(8);
                C11618w.this.f52163v.removeView(C11618w.this.f52162u);
                View unused = C11618w.this.f52162u = null;
                C11618w.this.f52163v.setVisibility(8);
                C11618w.this.f52164w.onCustomViewHidden();
                C11618w.this.setVisibility(0);
            }
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.m51953i("Test", "onShowCustomView");
            C11618w.this.setVisibility(8);
            if (C11618w.this.f52162u != null) {
                Logger.m51953i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.m51953i("Test", "mCustomView == null");
            C11618w.this.f52163v.addView(view);
            View unused = C11618w.this.f52162u = view;
            WebChromeClient.CustomViewCallback unused2 = C11618w.this.f52164w = customViewCallback;
            C11618w.this.f52163v.setVisibility(0);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$s */
    static class C11665s {

        /* renamed from: a */
        C11703d.C11708e f52271a;

        /* renamed from: b */
        String f52272b;

        public C11665s(C11703d.C11708e eVar, String str) {
            this.f52271a = eVar;
            this.f52272b = str;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$t */
    class C11666t extends WebViewClient {
        private C11666t() {
        }

        /* synthetic */ C11666t(C11618w wVar, byte b) {
            this();
        }

        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String M = C11618w.this.f52145e;
            Logger.m51951e(M, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Activity a = C11618w.this.f52144W.mo44689a();
            Intent intent = new Intent(a, OpenUrlActivity.class);
            intent.putExtra(C11618w.f52117c, str);
            intent.putExtra(C11618w.f52118d, false);
            a.startActivity(intent);
            return true;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$u */
    interface C11667u {
        /* renamed from: a */
        void mo44797a(String str, C11703d.C11708e eVar, C11702c cVar);
    }

    /* renamed from: com.ironsource.sdk.controller.w$v */
    static class C11668v {

        /* renamed from: a */
        String f52274a;

        /* renamed from: b */
        String f52275b;

        C11668v() {
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$w */
    class C11669w implements View.OnTouchListener {

        /* renamed from: com.ironsource.sdk.controller.w$w$a */
        class C11670a extends CountDownTimer {
            C11670a(long j, long j2) {
                super(SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, 500);
            }

            public final void onFinish() {
                Logger.m51953i(C11618w.this.f52145e, "Close Event Timer Finish");
                if (C11618w.this.f52156o) {
                    boolean unused = C11618w.this.f52156o = false;
                } else {
                    C11618w.this.mo44789e("forceClose");
                }
            }

            public final void onTick(long j) {
                String M = C11618w.this.f52145e;
                Logger.m51953i(M, "Close Event Timer Tick " + j);
            }
        }

        private C11669w() {
        }

        /* synthetic */ C11669w(C11618w wVar, byte b) {
            this();
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                String M = C11618w.this.f52145e;
                StringBuilder sb = new StringBuilder("X:");
                int i = (int) x;
                sb.append(i);
                sb.append(" Y:");
                int i2 = (int) y;
                sb.append(i2);
                Logger.m51953i(M, sb.toString());
                int m = C4979h.m22815m();
                int n = C4979h.m22816n();
                String M2 = C11618w.this.f52145e;
                Logger.m51953i(M2, "Width:" + m + " Height:" + n);
                int dpToPx = SDKUtils.dpToPx((long) C11618w.this.f52158q);
                int dpToPx2 = SDKUtils.dpToPx((long) C11618w.this.f52159r);
                if ("top-right".equalsIgnoreCase(C11618w.this.f52160s)) {
                    i = m - i;
                } else if (!"top-left".equalsIgnoreCase(C11618w.this.f52160s)) {
                    if ("bottom-right".equalsIgnoreCase(C11618w.this.f52160s)) {
                        i = m - i;
                    } else if (!"bottom-left".equalsIgnoreCase(C11618w.this.f52160s)) {
                        i = 0;
                        i2 = 0;
                    }
                    i2 = n - i2;
                }
                if (i <= dpToPx && i2 <= dpToPx2) {
                    boolean unused = C11618w.this.f52156o = false;
                    if (C11618w.this.f52157p != null) {
                        C11618w.this.f52157p.cancel();
                    }
                    CountDownTimer unused2 = C11618w.this.f52157p = new C11670a(SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, 500).start();
                }
            }
            return false;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$x */
    class C11671x extends WebViewClient {
        private C11671x() {
        }

        /* synthetic */ C11671x(C11618w wVar, byte b) {
            this();
        }

        public final void onPageFinished(WebView webView, String str) {
            Logger.m51953i("onPageFinished", str);
            if (str.contains(IronSourceConstants.EVENTS_AD_UNIT) || str.contains("index.html")) {
                C11618w.this.mo44787b(C11618w.m51608e0("pageFinished"));
            }
            super.onPageFinished(webView, str);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.m51953i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.m51953i("onReceivedError", str2 + " " + str);
            if (str2.contains("mobileController.html") && C11618w.this.f52142U != null) {
                C11557e h0 = C11618w.this.f52142U;
                h0.mo44694a("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i + ")");
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String M = C11618w.this.f52145e;
            Log.e(M, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            if (C11618w.this.f52142U != null) {
                C11618w.this.f52142U.mo44696b(str);
            }
            C11618w wVar = C11618w.this;
            if (wVar.f52155n == null) {
                return true;
            }
            wVar.mo44793j0();
            C11665s sVar = wVar.f52155n;
            C11703d.C11708e eVar = sVar.f52271a;
            String str2 = sVar.f52272b;
            if (!wVar.mo44781I(eVar.toString())) {
                return true;
            }
            wVar.mo44779C(eVar, str2);
            return true;
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z;
            Logger.m51953i("shouldInterceptRequest", str);
            try {
                z = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException unused) {
                z = false;
            }
            if (z) {
                String str2 = "file://" + C11618w.this.f52127F + File.separator + "mraid.js";
                try {
                    new FileInputStream(new File(str2));
                    return new WebResourceResponse("text/javascript", C6540C.UTF8_NAME, C11671x.class.getResourceAsStream(str2));
                } catch (FileNotFoundException unused2) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.m51953i("shouldOverrideUrlLoading", str);
            try {
                if (C11618w.this.mo44790f(str)) {
                    C11618w.this.mo44786b();
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public C11618w(Context context, C11588j jVar, C11555c cVar, C11557e eVar) {
        super(context);
        String simpleName = C11618w.class.getSimpleName();
        this.f52145e = simpleName;
        Logger.m51953i(simpleName, "C'tor");
        this.f52144W = cVar;
        this.f52142U = eVar;
        this.f52127F = IronSourceStorageUtils.getNetworkStorageDir(context);
        this.f52134M = jVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f52165x = new FrameLayout(context);
        this.f52163v = new FrameLayout(context);
        this.f52163v.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f52163v.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(this);
        this.f52165x.addView(this.f52163v, layoutParams);
        this.f52165x.addView(frameLayout);
        this.f52130I = new C11700b();
        C11732b a = C11732b.m51882a(this.f52127F);
        this.f52152l = a;
        a.f52441a.f52439a = this;
        this.f52128G = new C11558f(SDKUtils.getNetworkConfiguration(), this.f52127F, SDKUtils.getControllerUrl(), this.f52152l);
        this.f52161t = new C11664r(this, (byte) 0);
        setWebViewClient(new C11671x(this, (byte) 0));
        setWebChromeClient(this.f52161t);
        C11759d.m51981a(this);
        WebSettings settings = getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath("/data/data/org.itri.html5webview/databases/");
        settings.setDomStorageEnabled(true);
        try {
            int i = Build.VERSION.SDK_INT;
            if (i > 11) {
                settings.setDisplayZoomControls(false);
            }
            if (i >= 17) {
                settings.setMediaPlaybackRequiresUserGesture(false);
            }
        } catch (Throwable th) {
            String str = this.f52145e;
            Logger.m51951e(str, "setWebSettings - " + th.toString());
        }
        C11614t tVar = new C11614t(UUID.randomUUID().toString());
        addJavascriptInterface(new C11584h(new C11556d(new C11622d()), tVar), "Android");
        addJavascriptInterface(new C11613s(tVar), "GenerateTokenForMessaging");
        setDownloadListener(this);
        setOnTouchListener(new C11669w(this, (byte) 0));
        this.f52132K = new Handler(Looper.getMainLooper());
        this.f52143V = new C11655i(SDKUtils.getControllerConfigAsJSONObject(), context);
        mo44703a(context);
        f52119m0 = FeaturesManager.getInstance().getDebugMode();
    }

    /* renamed from: A */
    static /* synthetic */ void m51566A(C11618w wVar, String str, C11703d.C11708e eVar, C11702c cVar) {
        if (wVar.mo44781I(eVar.toString())) {
            wVar.mo44780D(new C11654h(eVar, cVar, str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m51568B(com.ironsource.sdk.controller.C11618w r3, java.lang.String r4, boolean r5, java.lang.String r6, java.lang.String r7) {
        /*
            com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
            r0.<init>(r4)
            java.lang.String r1 = f52120n0
            java.lang.String r1 = r0.mo45022d(r1)
            java.lang.String r2 = f52121o0
            java.lang.String r0 = r0.mo45022d(r2)
            if (r5 == 0) goto L_0x001a
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x0022
            goto L_0x0023
        L_0x001a:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x0022
            r1 = r0
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x005c
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L_0x0040
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x003f }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x003f }
            java.lang.String r0 = "errMsg"
            org.json.JSONObject r5 = r5.put(r0, r6)     // Catch:{ JSONException -> 0x003f }
            java.lang.String r4 = r5.toString()     // Catch:{ JSONException -> 0x003f }
            goto L_0x0040
        L_0x003f:
        L_0x0040:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L_0x0055
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0055 }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r6 = "errCode"
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r4 = r5.toString()     // Catch:{ JSONException -> 0x0055 }
        L_0x0055:
            java.lang.String r4 = m51601b(r1, r4)
            r3.mo44787b((java.lang.String) r4)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C11618w.m51568B(com.ironsource.sdk.controller.w, java.lang.String, boolean, java.lang.String, java.lang.String):void");
    }

    /* renamed from: E */
    private void m51572E(String str, String str2, C11703d.C11708e eVar, C11702c cVar, C11667u uVar) {
        String str3;
        String str4;
        String str5;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            uVar.mo44797a("User id or Application key are missing", eVar, cVar);
            return;
        }
        C11668v vVar = new C11668v();
        C11703d.C11708e eVar2 = C11703d.C11708e.RewardedVideo;
        if (eVar == eVar2 || eVar == C11703d.C11708e.Interstitial || eVar == C11703d.C11708e.OfferWall || eVar == C11703d.C11708e.Banner) {
            HashMap hashMap = new HashMap();
            hashMap.put("applicationKey", this.f52149i);
            hashMap.put("applicationUserId", this.f52150j);
            if (cVar != null) {
                Map<String, String> map = cVar.f52389d;
                if (map != null) {
                    hashMap.putAll(map);
                    C11746a aVar = C11746a.f52469a;
                    hashMap.put("loadStartTime", String.valueOf(C11746a.m51914a(cVar.f52387b)));
                }
                hashMap.put("demandSourceName", cVar.f52386a);
                hashMap.put("demandSourceId", cVar.f52387b);
            }
            Map<String, String> y = m51646y(eVar);
            if (y != null) {
                hashMap.putAll(y);
            }
            String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
            C11696a.C11697a aVar2 = new C11696a.C11697a();
            if (eVar == eVar2) {
                aVar2.f52355a = "initRewardedVideo";
                aVar2.f52356b = "onInitRewardedVideoSuccess";
                str5 = "onInitRewardedVideoFail";
            } else if (eVar == C11703d.C11708e.Interstitial) {
                aVar2.f52355a = "initInterstitial";
                aVar2.f52356b = "onInitInterstitialSuccess";
                str5 = "onInitInterstitialFail";
            } else if (eVar == C11703d.C11708e.OfferWall) {
                aVar2.f52355a = "initOfferWall";
                aVar2.f52356b = "onInitOfferWallSuccess";
                str5 = "onInitOfferWallFail";
            } else {
                if (eVar == C11703d.C11708e.Banner) {
                    aVar2.f52355a = "initBanner";
                    aVar2.f52356b = "onInitBannerSuccess";
                    str5 = "onInitBannerFail";
                }
                str4 = m51644x(aVar2.f52355a, flatMapToJsonAsString, aVar2.f52356b, aVar2.f52357c);
                str3 = aVar2.f52355a;
            }
            aVar2.f52357c = str5;
            str4 = m51644x(aVar2.f52355a, flatMapToJsonAsString, aVar2.f52356b, aVar2.f52357c);
            str3 = aVar2.f52355a;
        } else {
            if (eVar == C11703d.C11708e.OfferWallCredits) {
                str3 = "getUserCredits";
                str4 = m51644x(str3, m51598a("productType", "OfferWall", "applicationKey", this.f52149i, "applicationUserId", this.f52150j, (String) null, (String) null, (String) null, false), "null", "onGetUserCreditsFail");
            }
            mo44787b(vVar.f52275b);
        }
        vVar.f52274a = str3;
        vVar.f52275b = str4;
        mo44787b(vVar.f52275b);
    }

    /* renamed from: F */
    private void m51574F(String str, String str2, String str3) {
        try {
            mo44787b(m51601b("assetCachedFailed", m51598a("file", str, "path", m51623m0(str2), "errMsg", str3, (String) null, (String) null, (String) null, false)));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public C11721a m51581L(C11703d.C11708e eVar) {
        if (eVar == C11703d.C11708e.Interstitial) {
            return this.f52123B;
        }
        if (eVar == C11703d.C11708e.RewardedVideo) {
            return this.f52122A;
        }
        if (eVar == C11703d.C11708e.Banner) {
            return this.f52125D;
        }
        return null;
    }

    /* renamed from: O */
    private void m51584O(JSONObject jSONObject) {
        if (jSONObject.optBoolean("inspectWebview")) {
            m51637t0();
        }
    }

    /* renamed from: T */
    private String m51589T(JSONObject jSONObject) {
        C11755a a = C11755a.m51959a(getContext());
        StringBuilder sb = new StringBuilder();
        String a2 = C11755a.m51960a();
        if (!TextUtils.isEmpty(a2)) {
            sb.append("SDKVersion=");
            sb.append(a2);
            sb.append("&");
        }
        String str = a.f52496c;
        if (!TextUtils.isEmpty(str)) {
            sb.append("deviceOs=");
            sb.append(str);
        }
        Uri parse = Uri.parse(SDKUtils.getControllerUrl());
        if (parse != null) {
            String str2 = parse.getScheme() + ":";
            String host = parse.getHost();
            int port = parse.getPort();
            if (port != -1) {
                host = host + ":" + port;
            }
            sb.append("&protocol");
            sb.append("=");
            sb.append(str2);
            sb.append("&domain");
            sb.append("=");
            sb.append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String jSONObject2 = new JSONObject(jSONObject, new String[]{"isSecured", "applicationKey"}).toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        sb.append("&controllerConfig");
                        sb.append("=");
                        sb.append(jSONObject2);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            sb.append("&debug");
            sb.append("=");
            sb.append(f52119m0);
        }
        return sb.toString();
    }

    /* renamed from: U */
    static /* synthetic */ void m51590U(C11618w wVar, String str, String str2) {
        String d = new C11710f(str2).mo45022d("errMsg");
        if (!TextUtils.isEmpty(d)) {
            wVar.mo44780D(new C11660n(str, d));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public Object[] m51592W(Context context) {
        boolean z;
        C11755a a = C11755a.m51959a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appOrientation", "none");
            jSONObject.put("deviceOrientation", SDKUtils.translateDeviceOrientation(C4979h.m22820p(context)));
            String str = a.f52494a;
            if (str != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(str));
            }
            String str2 = a.f52495b;
            if (str2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(str2));
                z = false;
            } else {
                z = true;
            }
            try {
                SDKUtils.loadGoogleAdvertiserInfo(context);
                String advertiserId = SDKUtils.getAdvertiserId();
                Boolean valueOf = Boolean.valueOf(SDKUtils.isLimitAdTrackingEnabled());
                if (!TextUtils.isEmpty(advertiserId)) {
                    Logger.m51953i(this.f52145e, "add AID and LAT");
                    jSONObject.put("isLimitAdTrackingEnabled", valueOf);
                    jSONObject.put("deviceIds" + "[AID" + "]", SDKUtils.encodeString(advertiserId));
                }
                String str3 = a.f52496c;
                if (str3 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOs"), SDKUtils.encodeString(str3));
                } else {
                    z = true;
                }
                String str4 = a.f52497d;
                if (str4 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOSVersion"), str4.replaceAll("[^0-9/.]", ""));
                } else {
                    z = true;
                }
                String str5 = a.f52497d;
                if (str5 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOSVersionFull"), SDKUtils.encodeString(str5));
                }
                String valueOf2 = String.valueOf(a.f52498e);
                if (valueOf2 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceApiLevel"), valueOf2);
                } else {
                    z = true;
                }
                jSONObject.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(C11755a.m51960a()));
                String str6 = a.f52499f;
                if (str6 != null && str6.length() > 0) {
                    jSONObject.put(SDKUtils.encodeString("mobileCarrier"), SDKUtils.encodeString(a.f52499f));
                }
                String a2 = C4946a.m22688a(context);
                if (!a2.equals("none")) {
                    jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(a2));
                } else {
                    z = true;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    jSONObject.put(SDKUtils.encodeString("hasVPN"), C4946a.m22693c(context));
                }
                String language = context.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase()));
                }
                if (SDKUtils.isExternalStorageAvailable()) {
                    jSONObject.put(SDKUtils.encodeString("diskFreeSize"), SDKUtils.encodeString(String.valueOf(C4979h.m22784a(this.f52127F))));
                } else {
                    z = true;
                }
                String valueOf3 = String.valueOf(C4979h.m22815m());
                if (!TextUtils.isEmpty(valueOf3)) {
                    jSONObject.put(SDKUtils.encodeString("deviceScreenSize") + "[" + SDKUtils.encodeString("width") + "]", SDKUtils.encodeString(valueOf3));
                } else {
                    z = true;
                }
                String valueOf4 = String.valueOf(C4979h.m22816n());
                jSONObject.put(SDKUtils.encodeString("deviceScreenSize") + "[" + SDKUtils.encodeString("height") + "]", SDKUtils.encodeString(valueOf4));
                String packageName = getContext().getPackageName();
                if (!TextUtils.isEmpty(packageName)) {
                    jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(packageName));
                }
                String valueOf5 = String.valueOf(C4979h.m22818o());
                if (!TextUtils.isEmpty(valueOf5)) {
                    jSONObject.put(SDKUtils.encodeString("deviceScreenScale"), SDKUtils.encodeString(valueOf5));
                }
                String valueOf6 = String.valueOf(C4979h.m22809j());
                if (!TextUtils.isEmpty(valueOf6)) {
                    jSONObject.put(SDKUtils.encodeString("unLocked"), SDKUtils.encodeString(valueOf6));
                }
                C11755a.m51959a(context);
                jSONObject.put(SDKUtils.encodeString("deviceVolume"), (double) C11755a.m51961b(context));
                jSONObject.put(SDKUtils.encodeString("batteryLevel"), C4979h.m22831w(context));
                jSONObject.put(SDKUtils.encodeString("mcc"), C4952a.C49531.m22727c(context));
                jSONObject.put(SDKUtils.encodeString("mnc"), C4952a.C49531.m22730d(context));
                jSONObject.put(SDKUtils.encodeString("phoneType"), C4952a.C49531.m22733f(context));
                jSONObject.put(SDKUtils.encodeString("simOperator"), SDKUtils.encodeString(C4952a.C49531.m22732e(context)));
                jSONObject.put(SDKUtils.encodeString("lastUpdateTime"), C4961c.m22742b(context));
                jSONObject.put(SDKUtils.encodeString("firstInstallTime"), C4961c.m22739a(context));
                jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(C4961c.m22744c(context)));
                String d = C4961c.m22746d(context);
                if (!TextUtils.isEmpty(d)) {
                    jSONObject.put(SDKUtils.encodeString("installerPackageName"), SDKUtils.encodeString(d));
                }
                jSONObject.put(SDKUtils.encodeString("gpi"), C11749d.m51928a(getContext()));
                jSONObject.put(SDKUtils.encodeString("screenBrightness"), C4979h.m22780A(context));
            } catch (JSONException e) {
                e = e;
                e.printStackTrace();
                return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
            }
        } catch (JSONException e2) {
            e = e2;
            z = false;
            e.printStackTrace();
            return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public Object[] m51593X(String str, String str2) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = null;
        if (!TextUtils.isEmpty(str)) {
            C11703d.C11708e i0 = m51616i0(str);
            if (i0 == C11703d.C11708e.OfferWall) {
                map = this.f52151k;
            } else {
                C11702c a = this.f52134M.mo44754a(i0, str2);
                if (a != null) {
                    Map<String, String> map2 = a.f52389d;
                    map2.put("demandSourceName", a.f52386a);
                    map2.put("demandSourceId", a.f52387b);
                    map = map2;
                }
            }
            try {
                jSONObject.put("productType", str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            z = false;
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(this.f52150j)) {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationUserId"), SDKUtils.encodeString(this.f52150j));
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(this.f52149i)) {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationKey"), SDKUtils.encodeString(this.f52149i));
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        } else {
            z = true;
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                if (((String) next.getKey()).equalsIgnoreCase("sdkWebViewCache")) {
                    if (((String) next.getValue()).equalsIgnoreCase(SessionDescription.SUPPORTED_SDP_VERSION)) {
                        getSettings().setCacheMode(2);
                    } else {
                        getSettings().setCacheMode(-1);
                    }
                }
                try {
                    jSONObject.put(SDKUtils.encodeString((String) next.getKey()), SDKUtils.encodeString((String) next.getValue()));
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    /* renamed from: a */
    public static int m51596a() {
        return f52119m0;
    }

    /* renamed from: a */
    public static String m51598a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public static String m51601b(String str, String str2) {
        return "SSA_CORE.SDKController.runFunction('" + str + "?parameters=" + str2 + "');";
    }

    /* renamed from: e0 */
    static String m51608e0(String str) {
        return "SSA_CORE.SDKController.runFunction('" + str + "');";
    }

    /* renamed from: f0 */
    static /* synthetic */ void m51610f0(C11618w wVar, String str) {
        C11710f fVar = new C11710f(str);
        String d = fVar.mo45022d(TtmlNode.ATTR_TTS_COLOR);
        String d2 = fVar.mo45022d("adViewId");
        int parseColor = !"transparent".equalsIgnoreCase(d) ? Color.parseColor(d) : 0;
        if (d2 != null) {
            WebView a = C11539d.m51410a().mo44638a(d2);
            if (a != null) {
                a.setBackgroundColor(parseColor);
                return;
            }
            return;
        }
        wVar.setBackgroundColor(parseColor);
    }

    /* renamed from: g */
    static /* synthetic */ WebView m51611g(C11618w wVar) {
        return wVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public static C11703d.C11708e m51616i0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C11703d.C11708e eVar = C11703d.C11708e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C11703d.C11708e eVar2 = C11703d.C11708e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        C11703d.C11708e eVar3 = C11703d.C11708e.OfferWall;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        C11703d.C11708e eVar4 = C11703d.C11708e.Banner;
        if (str.equalsIgnoreCase(eVar4.toString())) {
            return eVar4;
        }
        return null;
    }

    /* renamed from: m0 */
    private String m51623m0(String str) {
        String str2 = this.f52127F + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: t0 */
    private static void m51637t0() {
        if (Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    /* renamed from: w */
    private String m51642w(C11703d.C11708e eVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.toString(jSONObject.optInt(IronSourceConstants.KEY_SESSION_DEPTH)));
        String optString = jSONObject.optString("demandSourceName");
        String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        C11702c a = this.f52134M.mo44754a(eVar, fetchDemandSourceId);
        if (a != null) {
            Map<String, String> map = a.f52389d;
            if (map != null) {
                hashMap.putAll(map);
            }
            if (!TextUtils.isEmpty(optString)) {
                hashMap.put("demandSourceName", optString);
            }
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                hashMap.put("demandSourceId", fetchDemandSourceId);
            }
        }
        Map<String, String> y = m51646y(eVar);
        if (y != null) {
            hashMap.putAll(y);
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        C11696a.C11697a a2 = C11696a.C11697a.m51805a(eVar);
        return m51644x(a2.f52355a, flatMapToJsonAsString, a2.f52356b, a2.f52357c);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static String m51644x(String str, String str2, String str3, String str4) {
        return "SSA_CORE.SDKController.runFunction('" + str + "?parameters=" + str2 + "','" + str3 + "','" + str4 + "');";
    }

    /* renamed from: y */
    private Map<String, String> m51646y(C11703d.C11708e eVar) {
        if (eVar == C11703d.C11708e.OfferWall) {
            return this.f52151k;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo44779C(C11703d.C11708e eVar, String str) {
        mo44780D(new C11661o(eVar, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final void mo44780D(Runnable runnable) {
        Handler handler = this.f52132K;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo44781I(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            Logger.m51949d(this.f52145e, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(C11703d.C11708e.Interstitial.toString()) ? !str.equalsIgnoreCase(C11703d.C11708e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(C11703d.C11708e.Banner.toString()) ? (str.equalsIgnoreCase(C11703d.C11708e.OfferWall.toString()) || str.equalsIgnoreCase(C11703d.C11708e.OfferWallCredits.toString())) && this.f52124C != null : this.f52125D != null : this.f52122A != null : this.f52123B != null) {
            z = true;
        }
        if (!z) {
            String str2 = this.f52145e;
            Logger.m51949d(str2, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z;
    }

    /* renamed from: a */
    public final void mo44782a(int i) {
        String str;
        String str2;
        try {
            loadUrl("about:blank");
        } catch (Throwable th) {
            Logger.m51951e(this.f52145e, "WebViewController:: load: " + th.toString());
        }
        StringBuilder sb = new StringBuilder("file://");
        sb.append(this.f52127F);
        String str3 = File.separator;
        sb.append(str3);
        sb.append("mobileController.html");
        String sb2 = sb.toString();
        if (new File(this.f52127F + str3 + "mobileController.html").exists()) {
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            m51584O(controllerConfigAsJSONObject);
            String T = m51589T(controllerConfigAsJSONObject);
            Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
            if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
                T = String.format("%s&sessionid=%s", new Object[]{T, initSDKParams.get("sessionid")});
            }
            String str4 = sb2 + "?" + T;
            this.f52146f = new C11663q(50000, 1000, i).start();
            try {
                loadUrl(str4);
            } catch (Throwable th2) {
                Logger.m51951e(this.f52145e, "WebViewController:: load: " + th2.toString());
            }
            str = this.f52145e;
            str2 = "load(): " + str4;
        } else {
            str = this.f52145e;
            str2 = "load(): Mobile Controller HTML Does not exist";
        }
        Logger.m51953i(str, str2);
    }

    /* renamed from: a */
    public final void mo44703a(Context context) {
        C11741b bVar = this.f52143V;
        if (bVar != null) {
            bVar.mo45047a(context);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0045;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44783a(com.ironsource.sdk.p294g.C11700b r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f52131J
            monitor-enter(r0)
            boolean r1 = r11.f52374d     // Catch:{ all -> 0x013e }
            if (r1 == 0) goto L_0x013a
            boolean r1 = r10.f52154m     // Catch:{ all -> 0x013e }
            if (r1 == 0) goto L_0x013a
            java.lang.String r1 = r10.f52145e     // Catch:{ all -> 0x013e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            java.lang.String r3 = "restoreState(state:"
            r2.<init>(r3)     // Catch:{ all -> 0x013e }
            r2.append(r11)     // Catch:{ all -> 0x013e }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x013e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x013e }
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x013e }
            int r1 = r11.f52375e     // Catch:{ all -> 0x013e }
            r2 = -1
            if (r1 == r2) goto L_0x0083
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.p294g.C11703d.C11708e.RewardedVideo     // Catch:{ all -> 0x013e }
            int r4 = r3.ordinal()     // Catch:{ all -> 0x013e }
            if (r1 != r4) goto L_0x0049
            java.lang.String r1 = r10.f52145e     // Catch:{ all -> 0x013e }
            java.lang.String r4 = "onRVAdClosed()"
            android.util.Log.d(r1, r4)     // Catch:{ all -> 0x013e }
            java.lang.String r1 = r11.f52373c     // Catch:{ all -> 0x013e }
            com.ironsource.sdk.j.a.a r4 = r10.m51581L(r3)     // Catch:{ all -> 0x013e }
            if (r4 == 0) goto L_0x007d
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x013e }
            if (r5 != 0) goto L_0x007d
        L_0x0045:
            r4.mo44936a(r3, r1)     // Catch:{ all -> 0x013e }
            goto L_0x007d
        L_0x0049:
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.p294g.C11703d.C11708e.Interstitial     // Catch:{ all -> 0x013e }
            int r4 = r3.ordinal()     // Catch:{ all -> 0x013e }
            if (r1 != r4) goto L_0x0067
            java.lang.String r1 = r10.f52145e     // Catch:{ all -> 0x013e }
            java.lang.String r4 = "onInterstitialAdClosed()"
            android.util.Log.d(r1, r4)     // Catch:{ all -> 0x013e }
            java.lang.String r1 = r11.f52373c     // Catch:{ all -> 0x013e }
            com.ironsource.sdk.j.a.a r4 = r10.m51581L(r3)     // Catch:{ all -> 0x013e }
            if (r4 == 0) goto L_0x007d
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x013e }
            if (r5 != 0) goto L_0x007d
            goto L_0x0045
        L_0x0067:
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.p294g.C11703d.C11708e.OfferWall     // Catch:{ all -> 0x013e }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x013e }
            if (r1 != r3) goto L_0x007d
            java.lang.String r1 = r10.f52145e     // Catch:{ all -> 0x013e }
            java.lang.String r3 = "onOWAdClosed()"
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x013e }
            com.ironsource.sdk.j.e r1 = r10.f52124C     // Catch:{ all -> 0x013e }
            if (r1 == 0) goto L_0x007d
            r1.onOWAdClosed()     // Catch:{ all -> 0x013e }
        L_0x007d:
            r11.f52375e = r2     // Catch:{ all -> 0x013e }
            r1 = 0
            r11.f52373c = r1     // Catch:{ all -> 0x013e }
            goto L_0x008a
        L_0x0083:
            java.lang.String r1 = r10.f52145e     // Catch:{ all -> 0x013e }
            java.lang.String r2 = "No ad was opened"
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x013e }
        L_0x008a:
            java.lang.String r1 = r11.f52376f     // Catch:{ all -> 0x013e }
            java.lang.String r2 = r11.f52377g     // Catch:{ all -> 0x013e }
            com.ironsource.sdk.controller.j r3 = r10.f52134M     // Catch:{ all -> 0x013e }
            com.ironsource.sdk.g.d$e r4 = com.ironsource.sdk.p294g.C11703d.C11708e.Interstitial     // Catch:{ all -> 0x013e }
            java.util.Collection r3 = r3.mo44757b(r4)     // Catch:{ all -> 0x013e }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x013e }
        L_0x009a:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x013e }
            r5 = 2
            if (r4 == 0) goto L_0x00db
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x013e }
            com.ironsource.sdk.g.c r4 = (com.ironsource.sdk.p294g.C11702c) r4     // Catch:{ all -> 0x013e }
            int r6 = r4.f52390e     // Catch:{ all -> 0x013e }
            if (r6 != r5) goto L_0x009a
            java.lang.String r5 = r10.f52145e     // Catch:{ all -> 0x013e }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            java.lang.String r7 = "initInterstitial(appKey:"
            r6.<init>(r7)     // Catch:{ all -> 0x013e }
            r6.append(r1)     // Catch:{ all -> 0x013e }
            java.lang.String r7 = ", userId:"
            r6.append(r7)     // Catch:{ all -> 0x013e }
            r6.append(r2)     // Catch:{ all -> 0x013e }
            java.lang.String r7 = ", demandSource:"
            r6.append(r7)     // Catch:{ all -> 0x013e }
            java.lang.String r7 = r4.f52386a     // Catch:{ all -> 0x013e }
            r6.append(r7)     // Catch:{ all -> 0x013e }
            java.lang.String r7 = ")"
            r6.append(r7)     // Catch:{ all -> 0x013e }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x013e }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x013e }
            com.ironsource.sdk.j.a.c r5 = r10.f52123B     // Catch:{ all -> 0x013e }
            r10.mo44709a((java.lang.String) r1, (java.lang.String) r2, (com.ironsource.sdk.p294g.C11702c) r4, (com.ironsource.sdk.p297j.p298a.C11723c) r5)     // Catch:{ all -> 0x013e }
            goto L_0x009a
        L_0x00db:
            java.lang.String r1 = r11.f52371a     // Catch:{ all -> 0x013e }
            java.lang.String r2 = r11.f52372b     // Catch:{ all -> 0x013e }
            com.ironsource.sdk.controller.j r3 = r10.f52134M     // Catch:{ all -> 0x013e }
            com.ironsource.sdk.g.d$e r4 = com.ironsource.sdk.p294g.C11703d.C11708e.RewardedVideo     // Catch:{ all -> 0x013e }
            java.util.Collection r3 = r3.mo44757b(r4)     // Catch:{ all -> 0x013e }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x013e }
        L_0x00eb:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x013e }
            if (r4 == 0) goto L_0x0137
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x013e }
            com.ironsource.sdk.g.c r4 = (com.ironsource.sdk.p294g.C11702c) r4     // Catch:{ all -> 0x013e }
            int r6 = r4.f52390e     // Catch:{ all -> 0x013e }
            if (r6 != r5) goto L_0x00eb
            java.lang.String r6 = r4.f52386a     // Catch:{ all -> 0x013e }
            java.lang.String r7 = r10.f52145e     // Catch:{ all -> 0x013e }
            java.lang.String r8 = "onRVNoMoreOffers()"
            android.util.Log.d(r7, r8)     // Catch:{ all -> 0x013e }
            com.ironsource.sdk.j.a.d r7 = r10.f52122A     // Catch:{ all -> 0x013e }
            r7.mo44955b(r6)     // Catch:{ all -> 0x013e }
            java.lang.String r7 = r10.f52145e     // Catch:{ all -> 0x013e }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            java.lang.String r9 = "initRewardedVideo(appKey:"
            r8.<init>(r9)     // Catch:{ all -> 0x013e }
            r8.append(r1)     // Catch:{ all -> 0x013e }
            java.lang.String r9 = ", userId:"
            r8.append(r9)     // Catch:{ all -> 0x013e }
            r8.append(r2)     // Catch:{ all -> 0x013e }
            java.lang.String r9 = ", demandSource:"
            r8.append(r9)     // Catch:{ all -> 0x013e }
            r8.append(r6)     // Catch:{ all -> 0x013e }
            java.lang.String r6 = ")"
            r8.append(r6)     // Catch:{ all -> 0x013e }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x013e }
            android.util.Log.d(r7, r6)     // Catch:{ all -> 0x013e }
            com.ironsource.sdk.j.a.d r6 = r10.f52122A     // Catch:{ all -> 0x013e }
            r10.mo44710a((java.lang.String) r1, (java.lang.String) r2, (com.ironsource.sdk.p294g.C11702c) r4, (com.ironsource.sdk.p297j.p298a.C11724d) r6)     // Catch:{ all -> 0x013e }
            goto L_0x00eb
        L_0x0137:
            r1 = 0
            r11.f52374d = r1     // Catch:{ all -> 0x013e }
        L_0x013a:
            r10.f52130I = r11     // Catch:{ all -> 0x013e }
            monitor-exit(r0)     // Catch:{ all -> 0x013e }
            return
        L_0x013e:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x013e }
            goto L_0x0142
        L_0x0141:
            throw r11
        L_0x0142:
            goto L_0x0141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C11618w.mo44783a(com.ironsource.sdk.g.b):void");
    }

    /* renamed from: a */
    public final void mo44704a(C11702c cVar, Map<String, String> map, C11722b bVar) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.mo44999a()});
        if (map != null) {
            mo44787b(m51644x("loadBanner", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadBannerSuccess", "onLoadBannerFail"));
        }
    }

    /* renamed from: a */
    public final void mo44705a(C11702c cVar, Map<String, String> map, C11723c cVar2) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.mo44999a()});
        this.f52130I.mo44993a(cVar.f52387b, true);
        mo44787b(m51644x("loadInterstitial", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    /* renamed from: a */
    public final void mo44759a(C11715c cVar) {
        if (cVar.getName().contains("mobileController.html")) {
            C11558f fVar = this.f52128G;
            C11657k kVar = new C11657k();
            if (!fVar.mo44698c()) {
                if (fVar.f51942c == C11558f.C11559a.f51948b) {
                    fVar.mo44700e();
                }
                C11558f.C11560b bVar = C11558f.C11560b.CONTROLLER_FROM_SERVER;
                fVar.f51943d = bVar;
                fVar.mo44697a(bVar);
                kVar.run();
                return;
            }
            return;
        }
        String name = cVar.getName();
        String parent = cVar.getParent();
        try {
            mo44787b(m51601b("assetCached", m51598a("file", name, "path", m51623m0(parent), (String) null, (String) null, (String) null, (String) null, (String) null, false)));
        } catch (Exception e) {
            m51574F(name, parent, e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo44760a(C11715c cVar, C11709e eVar) {
        if (cVar.getName().contains("mobileController.html")) {
            C11558f fVar = this.f52128G;
            C11658l lVar = new C11658l();
            C11659m mVar = new C11659m(eVar);
            if (fVar.mo44698c()) {
                return;
            }
            if (fVar.f51942c != C11558f.C11559a.f51948b || !fVar.mo44701f()) {
                C11516a a = new C11516a().mo44598a("generalmessage", Integer.valueOf(fVar.f51941b));
                if (fVar.f51940a > 0) {
                    a.mo44598a("timingvalue", Long.valueOf(System.currentTimeMillis() - fVar.f51940a));
                }
                C11520d.m51360a(C11522f.f51822u, (Map<String, Object>) a.f51793a);
                mVar.run();
                return;
            }
            C11558f.C11560b bVar = C11558f.C11560b.FALLBACK_CONTROLLER_RECOVERY;
            fVar.f51943d = bVar;
            fVar.mo44697a(bVar);
            lVar.run();
            return;
        }
        m51574F(cVar.getName(), cVar.getParent(), eVar.f52425a);
    }

    /* renamed from: a */
    public final void mo44707a(String str, C11723c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceName", str);
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        this.f52130I.mo44993a(str, true);
        mo44787b(m51644x("loadInterstitial", flatMapToJsonAsString, "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    /* renamed from: a */
    public final void mo44784a(String str, String str2) {
        mo44787b(m51601b("onNativeLifeCycleEvent", m51598a("lifeCycleEvent", str2, "productType", str, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    /* renamed from: a */
    public final void mo44708a(String str, String str2, C11702c cVar, C11722b bVar) {
        this.f52149i = str;
        this.f52150j = str2;
        this.f52125D = bVar;
        m51572E(str, str2, C11703d.C11708e.Banner, cVar, new C11652f());
    }

    /* renamed from: a */
    public final void mo44709a(String str, String str2, C11702c cVar, C11723c cVar2) {
        this.f52149i = str;
        this.f52150j = str2;
        this.f52123B = cVar2;
        C11700b bVar = this.f52130I;
        bVar.f52376f = str;
        bVar.f52377g = str2;
        m51572E(str, str2, C11703d.C11708e.Interstitial, cVar, new C11620b());
    }

    /* renamed from: a */
    public final void mo44710a(String str, String str2, C11702c cVar, C11724d dVar) {
        this.f52149i = str;
        this.f52150j = str2;
        this.f52122A = dVar;
        C11700b bVar = this.f52130I;
        bVar.f52371a = str;
        bVar.f52372b = str2;
        m51572E(str, str2, C11703d.C11708e.RewardedVideo, cVar, new C11619a());
    }

    /* renamed from: a */
    public final void mo44711a(String str, String str2, C11728e eVar) {
        this.f52149i = str;
        this.f52150j = str2;
        this.f52124C = eVar;
        m51572E(str, str2, C11703d.C11708e.OfferWallCredits, (C11702c) null, new C11651e());
    }

    /* renamed from: a */
    public final void mo44712a(String str, String str2, Map<String, String> map, C11728e eVar) {
        this.f52149i = str;
        this.f52150j = str2;
        this.f52151k = map;
        this.f52124C = eVar;
        C11700b bVar = this.f52130I;
        bVar.f52380j = map;
        bVar.f52378h = true;
        m51572E(str, str2, C11703d.C11708e.OfferWall, (C11702c) null, new C11621c());
    }

    /* renamed from: a */
    public final void mo44713a(Map<String, String> map, C11728e eVar) {
        this.f52151k = map;
        mo44787b("SSA_CORE.SDKController.runFunction('" + "showOfferWall" + "','" + "onShowOfferWallSuccess" + "','" + "onShowOfferWallFail" + "');");
    }

    /* renamed from: a */
    public final void mo44714a(JSONObject jSONObject) {
        mo44787b(m51601b("updateConsentInfo", jSONObject != null ? jSONObject.toString() : null));
    }

    /* renamed from: a */
    public final void mo44715a(JSONObject jSONObject, C11723c cVar) {
        mo44787b(m51642w(C11703d.C11708e.Interstitial, jSONObject));
    }

    /* renamed from: a */
    public final void mo44716a(JSONObject jSONObject, C11724d dVar) {
        mo44787b(m51642w(C11703d.C11708e.RewardedVideo, jSONObject));
    }

    /* renamed from: a */
    public final void mo44785a(boolean z, String str) {
        mo44787b(m51601b("viewableChange", m51598a("webview", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "isViewable", z)));
    }

    /* renamed from: b */
    public final void mo44786b() {
        mo44787b(m51608e0("interceptedUrlToStore"));
    }

    /* renamed from: b */
    public final void mo44717b(Context context) {
        C11741b bVar = this.f52143V;
        if (bVar != null) {
            bVar.mo45048b(context);
        }
    }

    /* renamed from: b */
    public final void mo44718b(C11702c cVar, Map<String, String> map, C11723c cVar2) {
        mo44787b(m51642w(C11703d.C11708e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, cVar.mo44999a()}))));
    }

    /* renamed from: b */
    public void mo44787b(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = "console.log(\"JS exeption: \" + JSON.stringify(e));";
            if (f52119m0 != C11703d.C11707d.MODE_0.f52417d && (f52119m0 < C11703d.C11707d.MODE_1.f52417d || f52119m0 > C11703d.C11707d.MODE_3.f52417d)) {
                str2 = "empty";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("try{");
            sb.append(str);
            sb.append("}catch(e){");
            sb.append(str2);
            sb.append("}");
            mo44780D(new C11656j("javascript:" + sb.toString(), sb));
        }
    }

    /* renamed from: c */
    public final C11703d.C11706c mo44719c() {
        return C11703d.C11706c.Web;
    }

    /* renamed from: c */
    public final boolean mo44720c(String str) {
        C11702c a = this.f52134M.mo44754a(C11703d.C11708e.Interstitial, str);
        return a != null && a.f52391f;
    }

    /* renamed from: d */
    public final void mo44721d() {
        mo44787b(m51644x("destroyBanner", "", "onDestroyBannersSuccess", "onDestroyBannersFail"));
    }

    /* renamed from: d */
    public final void mo44788d(String str) {
        String str2 = this.f52145e;
        Logger.m51953i(str2, "device status changed, connection type " + str);
        C11517b.m51354a(str);
        mo44787b(m51601b("deviceStatusChanged", m51598a("connectionType", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    public void destroy() {
        super.destroy();
        C11732b bVar = this.f52152l;
        if (bVar != null) {
            bVar.mo45035a();
        }
        C11741b bVar2 = this.f52143V;
        if (bVar2 != null) {
            bVar2.f52462a.mo45042a();
        }
        CountDownTimer countDownTimer = this.f52146f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f52132K = null;
    }

    /* renamed from: e */
    public final void mo44723e() {
        mo44787b(m51608e0("enterForeground"));
    }

    /* renamed from: e */
    public final void mo44789e(String str) {
        if (str.equals("forceClose")) {
            mo44793j0();
        }
        mo44787b(m51601b("engageEnd", m51598a("action", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    /* renamed from: f */
    public final void mo44724f() {
        mo44787b(m51608e0("enterBackground"));
    }

    /* renamed from: f */
    public final boolean mo44790f(String str) {
        List<String> b = C11756b.m51963a().mo45072b();
        try {
            if (b.isEmpty()) {
                return false;
            }
            for (String contains : b) {
                if (str.contains(contains)) {
                    C4952a.C49531.m22721a(this.f52144W.mo44689a(), str, (String) null);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: g */
    public final void mo44725g() {
        mo44783a(this.f52130I);
    }

    /* renamed from: i */
    public final void mo44791i() {
        try {
            onPause();
        } catch (Throwable th) {
            String str = this.f52145e;
            Logger.m51953i(str, "WebViewController: onPause() - " + th);
        }
    }

    /* renamed from: j */
    public final void mo44792j() {
        try {
            onResume();
        } catch (Throwable th) {
            String str = this.f52145e;
            Logger.m51953i(str, "WebViewController: onResume() - " + th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void mo44793j0() {
        C11730g gVar = this.f52153l0;
        if (gVar != null) {
            gVar.onCloseRequested();
        }
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        String str5 = this.f52145e;
        Logger.m51953i(str5, str + " " + str4);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C11730g gVar;
        if (i != 4 || (gVar = this.f52153l0) == null || !gVar.onBackButtonPressed()) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public WebBackForwardList saveState(Bundle bundle) {
        return super.saveState(bundle);
    }
}
