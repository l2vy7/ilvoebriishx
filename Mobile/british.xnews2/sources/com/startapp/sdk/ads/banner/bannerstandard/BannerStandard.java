package com.startapp.sdk.ads.banner.bannerstandard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
import com.startapp.C11868d9;
import com.startapp.C11882e4;
import com.startapp.C11902f6;
import com.startapp.C11938h5;
import com.startapp.C11939h6;
import com.startapp.C11970ib;
import com.startapp.C12010k6;
import com.startapp.C12011k7;
import com.startapp.C12029l6;
import com.startapp.C12047m6;
import com.startapp.C12064n0;
import com.startapp.C12102o0;
import com.startapp.C12108o6;
import com.startapp.C12119p0;
import com.startapp.C12127p6;
import com.startapp.C12146q9;
import com.startapp.C12336t0;
import com.startapp.C12339t2;
import com.startapp.C12437y;
import com.startapp.C12458z0;
import com.startapp.C12477zc;
import com.startapp.C5004d4;
import com.startapp.C5015nb;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerInterface;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.bannerstandard.CloseableLayout;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: Sta */
public class BannerStandard extends BannerBase implements AdEventListener, BannerInterface {

    /* renamed from: S */
    public static final /* synthetic */ int f22167S = 0;

    /* renamed from: A */
    public AdPreferences f22168A;

    /* renamed from: B */
    public final C12119p0 f22169B;

    /* renamed from: C */
    public BannerListener f22170C;

    /* renamed from: D */
    public boolean f22171D;

    /* renamed from: E */
    public AdInformationObject f22172E;

    /* renamed from: F */
    public RelativeLayout f22173F;

    /* renamed from: G */
    public RelativeLayout f22174G;

    /* renamed from: H */
    public CloseableLayout f22175H;

    /* renamed from: I */
    public C11868d9 f22176I;

    /* renamed from: J */
    public C12011k7 f22177J;

    /* renamed from: K */
    public C12477zc f22178K;

    /* renamed from: L */
    public C12477zc f22179L;

    /* renamed from: M */
    public MraidBannerController f22180M;

    /* renamed from: N */
    public MraidBannerController f22181N;

    /* renamed from: O */
    public ViewGroup f22182O;

    /* renamed from: P */
    public final C11868d9.C11869a f22183P;

    /* renamed from: Q */
    public final Runnable f22184Q;

    /* renamed from: R */
    public final Runnable f22185R;

    /* renamed from: r */
    public BannerStandardAd f22186r;

    /* renamed from: s */
    public boolean f22187s;

    /* renamed from: t */
    public boolean f22188t;
    public WebView twoPartWebView;

    /* renamed from: u */
    public boolean f22189u;

    /* renamed from: v */
    public boolean f22190v;

    /* renamed from: w */
    public boolean f22191w;
    public WebView webView;

    /* renamed from: x */
    public final Handler f22192x;

    /* renamed from: y */
    public long f22193y;

    /* renamed from: z */
    public BannerOptions f22194z;

    /* compiled from: Sta */
    public class MraidBannerController extends C12336t0 {
        private WebView activeWebView;
        /* access modifiers changed from: private */
        public MraidState mraidState = MraidState.LOADING;
        private boolean mraidVisibility = false;
        /* access modifiers changed from: private */
        public C12029l6 nativeFeatureManager;
        private C12047m6 orientationProperties;
        private C12108o6 resizeProperties;

        /* compiled from: Sta */
        public class BannerWebViewClient extends C12127p6 {
            public BannerWebViewClient(C11902f6 f6Var) {
                super(f6Var);
            }

            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (MraidBannerController.this.mraidState == MraidState.LOADING) {
                    C5015nb.m22916a(webView, true, "mraid.setPlacementType", "inline");
                    C12010k6.m52531a(BannerStandard.this.getContext(), webView, MraidBannerController.this.nativeFeatureManager);
                    MraidBannerController.this.updateDisplayMetrics(webView);
                    MraidState unused = MraidBannerController.this.mraidState = MraidState.DEFAULT;
                    C11939h6.m52394a(MraidBannerController.this.mraidState, webView);
                    C5015nb.m22916a(webView, true, "mraid.fireReadyEvent", new Object[0]);
                }
                BannerStandard bannerStandard = BannerStandard.this;
                bannerStandard.mo20733p();
                if (MetaData.f22407k.mo21175Q()) {
                    try {
                        bannerStandard.mo20728b(webView);
                    } catch (Throwable th) {
                        C5004d4.m22887a(th);
                    }
                }
            }
        }

        public MraidBannerController(WebView webView, C12336t0.C12337a aVar) {
            super(aVar);
            this.activeWebView = webView;
            webView.setWebViewClient(new BannerWebViewClient(this));
            this.nativeFeatureManager = new C12029l6(BannerStandard.this.getContext());
            this.orientationProperties = new C12047m6();
        }

        /* access modifiers changed from: private */
        public void fireViewableChangeEvent(boolean z) {
            if (this.mraidVisibility != z) {
                this.mraidVisibility = z;
                C5015nb.m22916a(this.activeWebView, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(z));
            }
        }

        /* access modifiers changed from: private */
        public void updateDisplayMetrics(WebView webView) {
            Context context = BannerStandard.this.getContext();
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                BannerStandard.this.getLocationOnScreen(iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                C11939h6.m52396b(context, i, i2, webView);
                Point point = BannerStandard.this.f22169B.f53990a;
                C11939h6.m52395b(context, i3, i4, point.x, point.y, webView);
                C11939h6.m52391a(context, i, i2, webView);
                Point point2 = BannerStandard.this.f22169B.f53990a;
                C11939h6.m52390a(context, i3, i4, point2.x, point2.y, webView);
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
        }

        public void close() {
            BannerStandard.m22959a(BannerStandard.this);
        }

        public void expand(String str) {
            BannerStandard bannerStandard = BannerStandard.this;
            int i = BannerStandard.f22167S;
            bannerStandard.mo20687b();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            boolean z = str != null && !TextUtils.isEmpty(str);
            if (z) {
                bannerStandard.f22188t = false;
                if (bannerStandard.twoPartWebView == null) {
                    bannerStandard.twoPartWebView = ComponentLocator.m23305a(bannerStandard.getContext()).mo21236w().mo45309b();
                }
                bannerStandard.f22181N = new MraidBannerController(bannerStandard.twoPartWebView, new C12336t0.C12337a() {
                    public boolean onClickEvent(String str) {
                        if (!BannerStandard.this.f22188t) {
                            C5004d4 d4Var = new C5004d4(C11882e4.f52886e);
                            d4Var.f22126d = "fake_click";
                            d4Var.f22129g = C5055a.m23143a(str, (String) null);
                            StringBuilder a = C12458z0.m53804a("jsTag=");
                            a.append(BannerStandard.this.f22189u);
                            d4Var.f22127e = a.toString();
                            d4Var.mo20661a();
                        }
                        BannerStandard bannerStandard = BannerStandard.this;
                        if ((!bannerStandard.f22189u || bannerStandard.f22188t) && str != null) {
                            return BannerStandard.m22961a(bannerStandard, str);
                        }
                        return false;
                    }
                });
                bannerStandard.f22179L = new C12477zc(bannerStandard.twoPartWebView, BannerMetaData.f54159b.mo45773a(), new C12477zc.C12479b() {
                    public boolean onUpdate(boolean z) {
                        BannerStandard.this.f22180M.fireViewableChangeEvent(z);
                        BannerStandard.this.f22181N.fireViewableChangeEvent(z);
                        return BannerStandard.this.f22186r.mo20937r();
                    }
                });
                bannerStandard.twoPartWebView.setId(159868226);
                bannerStandard.mo20724a(bannerStandard.twoPartWebView);
                bannerStandard.twoPartWebView.loadUrl(str);
            }
            if (bannerStandard.f22180M.getState() == MraidState.DEFAULT) {
                if (z) {
                    bannerStandard.f22175H.addView(bannerStandard.twoPartWebView, layoutParams);
                } else {
                    RelativeLayout relativeLayout = bannerStandard.f22174G;
                    if (relativeLayout != null) {
                        relativeLayout.removeView(bannerStandard.webView);
                        bannerStandard.f22174G.setVisibility(4);
                    }
                    bannerStandard.f22175H.addView(bannerStandard.webView, layoutParams);
                }
                if (bannerStandard.f22182O == null) {
                    bannerStandard.f22182O = bannerStandard.mo20736s();
                }
                bannerStandard.f22182O.addView(bannerStandard.f22175H, new FrameLayout.LayoutParams(-1, -1));
            } else if (bannerStandard.f22180M.getState() == MraidState.RESIZED && z) {
                bannerStandard.f22175H.removeView(bannerStandard.webView);
                RelativeLayout relativeLayout2 = bannerStandard.f22174G;
                if (relativeLayout2 != null) {
                    relativeLayout2.addView(bannerStandard.webView, layoutParams);
                    bannerStandard.f22174G.setVisibility(4);
                }
                bannerStandard.f22175H.addView(bannerStandard.twoPartWebView, layoutParams);
            }
            bannerStandard.f22175H.setLayoutParams(layoutParams);
            bannerStandard.f22180M.setState(MraidState.EXPANDED);
        }

        public C12108o6 getResizeProperties() {
            return this.resizeProperties;
        }

        public MraidState getState() {
            return this.mraidState;
        }

        public boolean isFeatureSupported(String str) {
            return this.nativeFeatureManager.f53250b.contains(str);
        }

        public void resize() {
            BannerStandard bannerStandard = BannerStandard.this;
            C12108o6 resizeProperties2 = bannerStandard.f22180M.getResizeProperties();
            if (resizeProperties2 == null) {
                C11939h6.m52392a(bannerStandard.webView, "requires: setResizeProperties first", "resize");
                return;
            }
            bannerStandard.mo20687b();
            if (bannerStandard.f22180M.getState() != MraidState.LOADING && bannerStandard.f22180M.getState() != MraidState.HIDDEN) {
                if (bannerStandard.f22180M.getState() == MraidState.EXPANDED) {
                    C11939h6.m52392a(bannerStandard.webView, "Not allowed to resize from an already expanded ad", "resize");
                    return;
                }
                int i = resizeProperties2.f53956a;
                int i2 = resizeProperties2.f53957b;
                int i3 = resizeProperties2.f53958c;
                int i4 = resizeProperties2.f53959d;
                int[] iArr = new int[2];
                bannerStandard.webView.getLocationOnScreen(iArr);
                Context context = bannerStandard.getContext();
                int b = C11970ib.m52473b(context, iArr[0]) + i3;
                int round = Math.round(((float) iArr[1]) / context.getResources().getDisplayMetrics().density) + i4;
                Rect rect = new Rect(b, round, i + b, i2 + round);
                ViewGroup s = bannerStandard.mo20736s();
                int round2 = Math.round(((float) s.getWidth()) / context.getResources().getDisplayMetrics().density);
                int round3 = Math.round(((float) s.getHeight()) / context.getResources().getDisplayMetrics().density);
                int[] iArr2 = new int[2];
                s.getLocationOnScreen(iArr2);
                int round4 = Math.round(((float) iArr2[0]) / context.getResources().getDisplayMetrics().density);
                int round5 = Math.round(((float) iArr2[1]) / context.getResources().getDisplayMetrics().density);
                if (!resizeProperties2.f53961f) {
                    if (rect.width() > round2 || rect.height() > round3) {
                        C11939h6.m52392a(bannerStandard.webView, "Not enough room for the ad", "resize");
                        return;
                    }
                    rect.offsetTo(Math.max(round4, Math.min(rect.left, (round4 + round2) - rect.width())), Math.max(round5, Math.min(rect.top, (round5 + round3) - rect.height())));
                }
                Rect rect2 = new Rect();
                try {
                    CloseableLayout.ClosePosition a = CloseableLayout.ClosePosition.m52902a(resizeProperties2.f53960e, CloseableLayout.ClosePosition.TOP_RIGHT);
                    int i5 = bannerStandard.f22175H.f54210e;
                    Gravity.apply(a.mo45866a(), i5, i5, rect, rect2);
                    if (!new Rect(round4, round5, round2 + round4, round3 + round5).contains(rect2)) {
                        C11939h6.m52392a(bannerStandard.webView, "The close region to appear within the max allowed size", "resize");
                    } else if (!rect.contains(rect2)) {
                        C11939h6.m52392a(bannerStandard.webView, "The close region to appear within the max allowed size", "resize");
                    } else {
                        bannerStandard.f22175H.setCloseVisible(false);
                        bannerStandard.f22175H.setClosePosition(a);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
                        layoutParams.leftMargin = rect.left - round4;
                        layoutParams.topMargin = rect.top - round5;
                        if (bannerStandard.f22180M.getState() == MraidState.DEFAULT) {
                            RelativeLayout relativeLayout = bannerStandard.f22174G;
                            if (relativeLayout != null) {
                                relativeLayout.removeView(bannerStandard.webView);
                                bannerStandard.f22174G.setVisibility(4);
                            }
                            bannerStandard.f22175H.addView(bannerStandard.webView, new FrameLayout.LayoutParams(-1, -1));
                            if (bannerStandard.f22182O == null) {
                                bannerStandard.f22182O = bannerStandard.mo20736s();
                            }
                            bannerStandard.f22182O.addView(bannerStandard.f22175H, layoutParams);
                        } else if (bannerStandard.f22180M.getState() == MraidState.RESIZED) {
                            bannerStandard.f22175H.setLayoutParams(layoutParams);
                        }
                        bannerStandard.f22175H.setClosePosition(a);
                        bannerStandard.f22180M.setState(MraidState.RESIZED);
                    }
                } catch (Exception e) {
                    C11939h6.m52392a(bannerStandard.webView, e.getMessage(), "resize");
                }
            }
        }

        public void setExpandProperties(Map<String, String> map) {
            String str = map.get("useCustomClose");
            if (str != null) {
                BannerStandard.m22960a(BannerStandard.this, Boolean.parseBoolean(str));
            }
        }

        public void setOrientationProperties(Map<String, String> map) {
            boolean parseBoolean = Boolean.parseBoolean(map.get("allowOrientationChange"));
            String str = map.get("forceOrientation");
            C12047m6 m6Var = this.orientationProperties;
            if (m6Var.f53276a != parseBoolean || m6Var.f53277b != C12047m6.m52593a(str)) {
                C12047m6 m6Var2 = this.orientationProperties;
                m6Var2.f53276a = parseBoolean;
                m6Var2.f53277b = C12047m6.m52593a(str);
                applyOrientationProperties((Activity) BannerStandard.this.getContext(), this.orientationProperties);
            }
        }

        public void setResizeProperties(Map<String, String> map) {
            boolean z;
            try {
                int parseInt = Integer.parseInt(map.get("width"));
                int parseInt2 = Integer.parseInt(map.get("height"));
                int parseInt3 = Integer.parseInt(map.get("offsetX"));
                int parseInt4 = Integer.parseInt(map.get("offsetY"));
                String str = map.get("allowOffscreen");
                String str2 = map.get("customClosePosition");
                if (str != null) {
                    if (!Boolean.parseBoolean(str)) {
                        z = false;
                        this.resizeProperties = new C12108o6(parseInt, parseInt2, parseInt3, parseInt4, str2, z);
                    }
                }
                z = true;
                this.resizeProperties = new C12108o6(parseInt, parseInt2, parseInt3, parseInt4, str2, z);
            } catch (Exception unused) {
                C11939h6.m52392a(this.activeWebView, "wrong format", "setResizeProperties");
            }
        }

        public void setState(MraidState mraidState2) {
            this.mraidState = mraidState2;
            C11939h6.m52394a(mraidState2, this.activeWebView);
        }

        public void useCustomClose(String str) {
            BannerStandard.m22960a(BannerStandard.this, Boolean.parseBoolean(str));
        }
    }

    public BannerStandard(Activity activity) {
        this((Context) activity);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e5 A[Catch:{ all -> 0x010d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m22961a(com.startapp.sdk.ads.banner.bannerstandard.BannerStandard r18, java.lang.String r19) {
        /*
            r0 = r18
            r2 = r19
            r18.getClass()
            r1 = 0
            java.lang.String r3 = com.startapp.sdk.adsbase.C5055a.m23143a((java.lang.String) r2, (java.lang.String) r1)
            android.content.Context r4 = r18.getContext()
            com.startapp.sdk.ads.banner.BannerListener r5 = r0.f22170C
            com.startapp.C12064n0.m52613a(r4, r5, r0, r3)
            com.startapp.d9 r3 = r0.f22176I
            if (r3 == 0) goto L_0x001c
            r3.mo45303a(r1, r1)
        L_0x001c:
            com.startapp.zc r3 = r0.f22178K
            if (r3 == 0) goto L_0x0023
            r3.mo46867a()
        L_0x0023:
            com.startapp.zc r3 = r0.f22179L
            if (r3 == 0) goto L_0x002a
            r3.mo46867a()
        L_0x002a:
            r18.mo20733p()
            android.content.Context r3 = r18.getContext()
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r4 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.INAPP_BANNER
            boolean r3 = com.startapp.sdk.adsbase.C5055a.m23158a((android.content.Context) r3, (com.startapp.sdk.adsbase.model.AdPreferences.Placement) r4)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r4 = r0.f22186r
            java.lang.String[] r4 = r4.mo20934o()
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r5 = r0.f22186r
            java.lang.String[] r5 = r5.mo20932m()
            boolean r6 = r0.f22189u
            java.lang.String r7 = "adId: "
            r14 = 1
            r15 = 0
            if (r6 != 0) goto L_0x0112
            java.lang.String r6 = "index="
            boolean r6 = r2.contains(r6)
            if (r6 == 0) goto L_0x0112
            int r6 = com.startapp.sdk.adsbase.C5055a.m23137a((java.lang.String) r19)     // Catch:{ all -> 0x010d }
            if (r6 >= 0) goto L_0x0080
            com.startapp.d4 r1 = new com.startapp.d4     // Catch:{ all -> 0x010d }
            com.startapp.e4 r2 = com.startapp.C11882e4.f52886e     // Catch:{ all -> 0x010d }
            r1.<init>((com.startapp.C11882e4) r2)     // Catch:{ all -> 0x010d }
            java.lang.String r2 = "Wrong index extracted from URL"
            r1.f22126d = r2     // Catch:{ all -> 0x010d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x010d }
            r2.<init>()     // Catch:{ all -> 0x010d }
            r2.append(r7)     // Catch:{ all -> 0x010d }
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r0 = r0.f22186r     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r0.getAdId()     // Catch:{ all -> 0x010d }
            r2.append(r0)     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x010d }
            r1.f22127e = r0     // Catch:{ all -> 0x010d }
            r1.mo20661a()     // Catch:{ all -> 0x010d }
            goto L_0x0136
        L_0x0080:
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r7 = r0.f22186r     // Catch:{ all -> 0x010d }
            r7.getClass()     // Catch:{ all -> 0x010d }
            if (r6 < 0) goto L_0x0090
            boolean[] r7 = r7.smartRedirect     // Catch:{ all -> 0x010d }
            int r8 = r7.length     // Catch:{ all -> 0x010d }
            if (r6 < r8) goto L_0x008d
            goto L_0x0090
        L_0x008d:
            boolean r7 = r7[r6]     // Catch:{ all -> 0x010d }
            goto L_0x0091
        L_0x0090:
            r7 = 0
        L_0x0091:
            if (r7 == 0) goto L_0x00de
            if (r3 != 0) goto L_0x00de
            android.content.Context r3 = r18.getContext()     // Catch:{ all -> 0x010d }
            int r7 = r4.length     // Catch:{ all -> 0x010d }
            if (r6 >= r7) goto L_0x00a3
            java.lang.String[] r7 = new java.lang.String[r14]     // Catch:{ all -> 0x010d }
            r4 = r4[r6]     // Catch:{ all -> 0x010d }
            r7[r15] = r4     // Catch:{ all -> 0x010d }
            goto L_0x00a4
        L_0x00a3:
            r7 = r1
        L_0x00a4:
            int r4 = r5.length     // Catch:{ all -> 0x010d }
            if (r6 >= r4) goto L_0x00a9
            r1 = r5[r6]     // Catch:{ all -> 0x010d }
        L_0x00a9:
            r4 = r1
            com.startapp.sdk.adsbase.commontracking.TrackingParams r5 = new com.startapp.sdk.adsbase.commontracking.TrackingParams     // Catch:{ all -> 0x010d }
            java.lang.String r1 = r0.f22157j     // Catch:{ all -> 0x010d }
            r5.<init>(r1)     // Catch:{ all -> 0x010d }
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.f22242h     // Catch:{ all -> 0x010d }
            long r8 = r1.mo20913z()     // Catch:{ all -> 0x010d }
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.f22242h     // Catch:{ all -> 0x010d }
            long r10 = r1.mo20912y()     // Catch:{ all -> 0x010d }
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r0.f22186r     // Catch:{ all -> 0x010d }
            boolean r12 = r1.mo20922a((int) r6)     // Catch:{ all -> 0x010d }
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r0.f22186r     // Catch:{ all -> 0x010d }
            java.lang.Boolean r13 = r1.mo20923b((int) r6)     // Catch:{ all -> 0x010d }
            r16 = 0
            r17 = 0
            r1 = r3
            r2 = r19
            r3 = r7
            r6 = r8
            r8 = r10
            r10 = r12
            r11 = r13
            r12 = r16
            r13 = r17
            com.startapp.sdk.adsbase.C5055a.m23150a(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13)     // Catch:{ all -> 0x010d }
            goto L_0x01c7
        L_0x00de:
            android.content.Context r5 = r18.getContext()     // Catch:{ all -> 0x010d }
            int r7 = r4.length     // Catch:{ all -> 0x010d }
            if (r6 >= r7) goto L_0x00eb
            java.lang.String[] r1 = new java.lang.String[r14]     // Catch:{ all -> 0x010d }
            r4 = r4[r6]     // Catch:{ all -> 0x010d }
            r1[r15] = r4     // Catch:{ all -> 0x010d }
        L_0x00eb:
            r4 = r1
            com.startapp.sdk.adsbase.commontracking.TrackingParams r7 = new com.startapp.sdk.adsbase.commontracking.TrackingParams     // Catch:{ all -> 0x010d }
            java.lang.String r1 = r0.f22157j     // Catch:{ all -> 0x010d }
            r7.<init>(r1)     // Catch:{ all -> 0x010d }
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r0.f22186r     // Catch:{ all -> 0x010d }
            boolean r1 = r1.mo20922a((int) r6)     // Catch:{ all -> 0x010d }
            if (r1 == 0) goto L_0x00ff
            if (r3 != 0) goto L_0x00ff
            r6 = 1
            goto L_0x0100
        L_0x00ff:
            r6 = 0
        L_0x0100:
            r8 = 0
            r1 = r5
            r2 = r19
            r3 = r4
            r4 = r7
            r5 = r6
            r6 = r8
            com.startapp.sdk.adsbase.C5055a.m23149a((android.content.Context) r1, (java.lang.String) r2, (java.lang.String[]) r3, (com.startapp.sdk.adsbase.commontracking.TrackingParams) r4, (boolean) r5, (boolean) r6)     // Catch:{ all -> 0x010d }
            goto L_0x01c7
        L_0x010d:
            r0 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
            goto L_0x0136
        L_0x0112:
            int r1 = r4.length
            if (r1 >= r14) goto L_0x0139
            com.startapp.d4 r1 = new com.startapp.d4
            com.startapp.e4 r2 = com.startapp.C11882e4.f52886e
            r1.<init>((com.startapp.C11882e4) r2)
            java.lang.String r2 = "No tracking URLs"
            r1.f22126d = r2
            java.lang.StringBuilder r2 = com.startapp.C12458z0.m53804a(r7)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r0 = r0.f22186r
            java.lang.String r0 = r0.getAdId()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.f22127e = r0
            r1.mo20661a()
        L_0x0136:
            r14 = 0
            goto L_0x01cf
        L_0x0139:
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r0.f22186r
            r1.getClass()
            boolean[] r1 = r1.smartRedirect
            int r6 = r1.length
            if (r6 > 0) goto L_0x0145
            r1 = 0
            goto L_0x0147
        L_0x0145:
            boolean r1 = r1[r15]
        L_0x0147:
            if (r1 == 0) goto L_0x01a3
            if (r3 != 0) goto L_0x01a3
            int r1 = r5.length
            if (r1 >= r14) goto L_0x0170
            com.startapp.d4 r1 = new com.startapp.d4
            com.startapp.e4 r2 = com.startapp.C11882e4.f52886e
            r1.<init>((com.startapp.C11882e4) r2)
            java.lang.String r2 = "No package names"
            r1.f22126d = r2
            java.lang.StringBuilder r2 = com.startapp.C12458z0.m53804a(r7)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r0 = r0.f22186r
            java.lang.String r0 = r0.getAdId()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.f22127e = r0
            r1.mo20661a()
            goto L_0x0136
        L_0x0170:
            android.content.Context r1 = r18.getContext()
            java.lang.String[] r3 = new java.lang.String[r14]
            r4 = r4[r15]
            r3[r15] = r4
            r4 = r5[r15]
            com.startapp.sdk.adsbase.commontracking.TrackingParams r5 = new com.startapp.sdk.adsbase.commontracking.TrackingParams
            java.lang.String r6 = r0.f22157j
            r5.<init>(r6)
            com.startapp.sdk.adsbase.AdsCommonMetaData r6 = com.startapp.sdk.adsbase.AdsCommonMetaData.f22242h
            long r6 = r6.mo20913z()
            com.startapp.sdk.adsbase.AdsCommonMetaData r8 = com.startapp.sdk.adsbase.AdsCommonMetaData.f22242h
            long r8 = r8.mo20912y()
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r10 = r0.f22186r
            boolean r10 = r10.mo20922a((int) r15)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r11 = r0.f22186r
            java.lang.Boolean r11 = r11.mo20923b((int) r15)
            r12 = 0
            r13 = 0
            r2 = r19
            com.startapp.sdk.adsbase.C5055a.m23150a(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13)
            goto L_0x01c7
        L_0x01a3:
            android.content.Context r1 = r18.getContext()
            java.lang.String[] r5 = new java.lang.String[r14]
            r4 = r4[r15]
            r5[r15] = r4
            com.startapp.sdk.adsbase.commontracking.TrackingParams r4 = new com.startapp.sdk.adsbase.commontracking.TrackingParams
            java.lang.String r6 = r0.f22157j
            r4.<init>(r6)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r6 = r0.f22186r
            boolean r6 = r6.mo20922a((int) r15)
            if (r6 == 0) goto L_0x01bf
            if (r3 != 0) goto L_0x01bf
            r15 = 1
        L_0x01bf:
            r6 = 0
            r2 = r19
            r3 = r5
            r5 = r15
            com.startapp.sdk.adsbase.C5055a.m23149a((android.content.Context) r1, (java.lang.String) r2, (java.lang.String[]) r3, (com.startapp.sdk.adsbase.commontracking.TrackingParams) r4, (boolean) r5, (boolean) r6)
        L_0x01c7:
            android.webkit.WebView r1 = r0.webView
            r1.stopLoading()
            r0.setClicked(r14)
        L_0x01cf:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.m22961a(com.startapp.sdk.ads.banner.bannerstandard.BannerStandard, java.lang.String):boolean");
    }

    /* renamed from: b */
    public final void mo20727b(Point point, int i) {
        if (point.x <= 0) {
            point.x = i;
        }
    }

    /* renamed from: c */
    public int mo20688c() {
        return Math.max(this.f22194z.mo45788i() - ((int) this.f22193y), 0);
    }

    /* renamed from: d */
    public int mo20689d() {
        return this.f22156i;
    }

    /* renamed from: e */
    public String mo20690e() {
        return "StartApp Banner";
    }

    /* renamed from: f */
    public int mo20691f() {
        return this.f22194z.mo45788i();
    }

    /* renamed from: g */
    public View mo20692g() {
        RelativeLayout relativeLayout = this.f22174G;
        return relativeLayout != null ? relativeLayout : this;
    }

    public String getBidToken() {
        BannerStandardAd bannerStandardAd = this.f22186r;
        if (bannerStandardAd != null) {
            return bannerStandardAd.getBidToken();
        }
        return null;
    }

    public int getHeightInDp() {
        return 50;
    }

    public int getWidthInDp() {
        return 300;
    }

    public void hideBanner() {
        this.f22191w = false;
        C5055a.m23152a(this.f22185R);
    }

    /* renamed from: i */
    public void mo20699i() {
        int i;
        try {
            Context context = getContext();
            CloseableLayout closeableLayout = new CloseableLayout(context);
            this.f22175H = closeableLayout;
            closeableLayout.setOnCloseListener(new CloseableLayout.C12197a() {
                public void onClose() {
                    BannerStandard.m22959a(BannerStandard.this);
                }
            });
            WebView b = ComponentLocator.m23305a(context).mo21236w().mo45309b();
            this.webView = b;
            this.f22180M = new MraidBannerController(b, new C12336t0.C12337a() {
                public boolean onClickEvent(String str) {
                    if (!BannerStandard.this.f22188t) {
                        C5004d4 d4Var = new C5004d4(C11882e4.f52886e);
                        d4Var.f22126d = "fake_click";
                        d4Var.f22129g = C5055a.m23143a(str, (String) null);
                        StringBuilder a = C12458z0.m53804a("jsTag=");
                        a.append(BannerStandard.this.f22189u);
                        d4Var.f22127e = a.toString();
                        d4Var.mo20661a();
                    }
                    BannerStandard bannerStandard = BannerStandard.this;
                    if ((!bannerStandard.f22189u || bannerStandard.f22188t) && str != null) {
                        return BannerStandard.m22961a(bannerStandard, str);
                    }
                    return false;
                }
            });
            this.f22194z = new BannerOptions();
            if (this.f22186r == null) {
                BannerStandardAd bannerStandardAd = this.f22186r;
                if (bannerStandardAd == null) {
                    i = 0;
                } else {
                    i = bannerStandardAd.mo45852v();
                }
                this.f22186r = new BannerStandardAd(context, i);
            }
            if (this.f22168A == null) {
                this.f22168A = new AdPreferences();
            }
            if (getId() == -1) {
                setId(this.f22156i);
            }
            this.webView.setId(159868225);
            mo20724a(this.webView);
            this.f22194z = BannerMetaData.f54159b.mo45774b();
            mo20686a(this.f22168A);
            setMinimumWidth(C11970ib.m52467a(getContext(), this.f22169B.f53990a.x));
            setMinimumHeight(C11970ib.m52467a(getContext(), this.f22169B.f53990a.y));
            WebView webView2 = this.webView;
            Context context2 = getContext();
            C50328 r4 = new Runnable() {
                public void run() {
                }
            };
            TrackingParams trackingParams = new TrackingParams(this.f22157j);
            boolean a = this.f22186r.mo20922a(0);
            C11938h5 h5Var = new C11938h5(context2, r4, trackingParams);
            h5Var.f53035b = a;
            webView2.addJavascriptInterface(h5Var, "startappwall");
            this.f22174G = new RelativeLayout(getContext());
            mo20723a((View) this.webView);
            C5055a.m23152a(this.f22185R);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            addView(this.f22174G, layoutParams);
            if (this.f22190v) {
                getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        ViewTreeObserver viewTreeObserver = BannerStandard.this.getViewTreeObserver();
                        int i = C12437y.f55146a;
                        if (Build.VERSION.SDK_INT >= 16) {
                            viewTreeObserver.removeOnGlobalLayoutListener(this);
                        } else {
                            viewTreeObserver.removeGlobalOnLayoutListener(this);
                        }
                        BannerStandard bannerStandard = BannerStandard.this;
                        if (!bannerStandard.f22187s) {
                            bannerStandard.mo20703k();
                        }
                    }
                });
            }
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            hideBanner();
            mo20725a("BannerStandard.init - webview failed");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0013  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20704l() {
        /*
            r4 = this;
            com.startapp.k7 r0 = r4.f22177J
            r1 = 0
            r4.f22177J = r1
            if (r0 == 0) goto L_0x0010
            r0.mo45499a()     // Catch:{ all -> 0x000c }
            r0 = 1
            goto L_0x0011
        L_0x000c:
            r0 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == 0) goto L_0x0027
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandard$10 r1 = new com.startapp.sdk.ads.banner.bannerstandard.BannerStandard$10
            r1.<init>()
            r2 = 4000(0xfa0, double:1.9763E-320)
            r0.postDelayed(r1, r2)
            goto L_0x002a
        L_0x0027:
            r4.mo20738u()
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.mo20704l():void");
    }

    public void loadHtml() {
        String j;
        BannerStandardAd bannerStandardAd = this.f22186r;
        if (bannerStandardAd != null && (j = bannerStandardAd.mo20929j()) != null) {
            String str = this.f22157j;
            if (str != null && str.length() > 0) {
                j = j.replaceAll("startapp_adtag_placeholder", this.f22157j);
            }
            this.f22192x.postDelayed(new Runnable() {
                public void run() {
                    BannerStandard bannerStandard = BannerStandard.this;
                    int i = BannerStandard.f22167S;
                    bannerStandard.mo20702j();
                }
            }, (long) this.f22194z.mo45788i());
            this.f22193y = System.currentTimeMillis();
            getContext();
            C5015nb.m22921a(this.webView, j);
        }
    }

    /* renamed from: m */
    public void mo20707m() {
        C11868d9 d9Var = this.f22176I;
        if (d9Var != null && d9Var.f52867i.get()) {
            super.mo20707m();
        }
    }

    /* renamed from: n */
    public final void mo20730n() {
        if (this.f22172E == null && this.f22173F == null) {
            this.f22173F = new RelativeLayout(getContext());
            AdInformationObject adInformationObject = new AdInformationObject(getContext(), AdInformationObject.Size.SMALL, AdPreferences.Placement.INAPP_BANNER, this.f22186r.getAdInfoOverride(), this.f22186r.getConsentData());
            this.f22172E = adInformationObject;
            adInformationObject.mo46126a(this.f22173F);
        }
        try {
            ViewGroup viewGroup = (ViewGroup) this.f22173F.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f22173F);
            }
        } catch (Exception unused) {
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.webView.addView(this.f22173F, layoutParams);
    }

    /* renamed from: o */
    public final void mo20731o() {
        BannerStandardAd bannerStandardAd = this.f22186r;
        if (bannerStandardAd != null && bannerStandardAd.mo20937r()) {
            this.f22178K = new C12477zc(this.webView, BannerMetaData.f54159b.mo45773a(), new C12477zc.C12479b() {
                public boolean onUpdate(boolean z) {
                    BannerStandard.this.f22180M.fireViewableChangeEvent(z);
                    return BannerStandard.this.f22186r.mo20937r();
                }
            });
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        WebView webView2 = this.webView;
        if (webView2 != null) {
            C12437y.m53785b(webView2);
        }
        WebView webView3 = this.twoPartWebView;
        if (webView3 != null) {
            C12437y.m53785b(webView3);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WebView webView2 = this.webView;
        if (webView2 != null) {
            C12437y.m53778a(webView2);
        }
        WebView webView3 = this.twoPartWebView;
        if (webView3 != null) {
            C12437y.m53778a(webView3);
        }
        C11868d9 d9Var = this.f22176I;
        if (d9Var != null) {
            d9Var.mo45303a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
        }
        C12477zc zcVar = this.f22178K;
        if (zcVar != null) {
            zcVar.mo46867a();
        }
        C12477zc zcVar2 = this.f22179L;
        if (zcVar2 != null) {
            zcVar2.mo46867a();
        }
        mo20733p();
        C12011k7 k7Var = this.f22177J;
        this.f22177J = null;
        if (k7Var != null) {
            try {
                k7Var.mo45499a();
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
        }
        WebView webView4 = this.webView;
        Map<Activity, Integer> map = C5015nb.f22145a;
        new Handler(Looper.getMainLooper()).postAtTime((Runnable) null, webView4, SystemClock.uptimeMillis() + 1000);
    }

    public void onFailedToReceiveAd(C5041Ad ad) {
        if (ad != null) {
            mo20725a(ad.getErrorMessage());
        }
    }

    public void onReceiveAd(C5041Ad ad) {
        String str;
        this.f22188t = false;
        removeView(this.f22173F);
        BannerStandardAd bannerStandardAd = this.f22186r;
        if (bannerStandardAd == null || bannerStandardAd.mo20929j() == null || this.f22186r.mo20929j().compareTo("") == 0) {
            mo20725a("No Banner received");
            return;
        }
        this.f22189u = "true".equals(C5015nb.m22910a(this.f22186r.mo20929j(), "@jsTag@", "@jsTag@"));
        loadHtml();
        try {
            if (mo20726a(Integer.parseInt(C5015nb.m22910a(this.f22186r.mo20929j(), "@width@", "@width@")), Integer.parseInt(C5015nb.m22910a(this.f22186r.mo20929j(), "@height@", "@height@")))) {
                this.f22187s = true;
                mo20730n();
                mo20737t();
                mo20682a();
                mo20731o();
                if (this.f22191w) {
                    C5055a.m23152a(this.f22184Q);
                }
                if (this.f22170C != null && !this.f22171D) {
                    this.f22171D = true;
                    Context context = getContext();
                    BannerListener bannerListener = this.f22170C;
                    BannerStandardAd bannerStandardAd2 = this.f22186r;
                    bannerStandardAd2.getClass();
                    String[] strArr = bannerStandardAd2.trackingUrls;
                    if (strArr.length <= 0) {
                        str = null;
                    } else {
                        str = strArr[0];
                    }
                    C12064n0.m52615c(context, bannerListener, this, C5055a.m23143a(str, (String) null));
                    return;
                }
                return;
            }
            mo20725a("Banner cannot be displayed (not enough room)");
        } catch (NumberFormatException unused) {
            mo20725a("Error Casting width & height from HTML");
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            mo20725a(th.getMessage());
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        double ceil = Math.ceil((double) (((float) i) / displayMetrics.density));
        double ceil2 = Math.ceil((double) (((float) i2) / displayMetrics.density));
        Point point = this.f22169B.f53990a;
        if (ceil < ((double) point.x) || ceil2 < ((double) point.y)) {
            C5055a.m23152a(this.f22185R);
        } else if (this.f22191w && this.f22187s) {
            C5055a.m23152a(this.f22184Q);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            WebView webView2 = this.webView;
            if (webView2 != null) {
                C12437y.m53785b(webView2);
            }
            WebView webView3 = this.twoPartWebView;
            if (webView3 != null) {
                C12437y.m53785b(webView3);
                return;
            }
            return;
        }
        WebView webView4 = this.webView;
        if (webView4 != null) {
            C12437y.m53778a(webView4);
        }
        WebView webView5 = this.twoPartWebView;
        if (webView5 != null) {
            C12437y.m53778a(webView5);
        }
    }

    /* renamed from: p */
    public final void mo20733p() {
        this.f22192x.removeCallbacksAndMessages((Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[SYNTHETIC, Splitter:B:32:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c7 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f6 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0111 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0093 A[EDGE_INSN: B:56:0x0093->B:30:0x0093 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f4 A[EDGE_INSN: B:57:0x00f4->B:48:0x00f4 ?: BREAK  , SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Point mo20734q() {
        /*
            r8 = this;
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            r2 = 1
            if (r1 == 0) goto L_0x0025
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.width
            if (r1 <= 0) goto L_0x0025
            android.content.Context r1 = r8.getContext()
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            int r3 = r3.width
            int r3 = r3 + r2
            int r1 = com.startapp.C11970ib.m52473b(r1, r3)
            r0.x = r1
        L_0x0025:
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            if (r1 == 0) goto L_0x0044
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.height
            if (r1 <= 0) goto L_0x0044
            android.content.Context r1 = r8.getContext()
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            int r3 = r3.height
            int r3 = r3 + r2
            int r1 = com.startapp.C11970ib.m52473b(r1, r3)
            r0.y = r1
        L_0x0044:
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            if (r1 == 0) goto L_0x005f
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.width
            if (r1 <= 0) goto L_0x005f
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.height
            if (r1 <= 0) goto L_0x005f
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r8.f22186r
            r1.mo45849b(r2)
        L_0x005f:
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            if (r1 == 0) goto L_0x0075
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.width
            if (r1 <= 0) goto L_0x0075
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.height
            if (r1 > 0) goto L_0x0163
        L_0x0075:
            android.content.Context r1 = r8.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            android.view.ViewParent r2 = r8.getParent()     // Catch:{ all -> 0x0144 }
            boolean r2 = r2 instanceof android.view.View     // Catch:{ all -> 0x0144 }
            if (r2 == 0) goto L_0x0092
            android.view.ViewParent r2 = r8.getParent()     // Catch:{ all -> 0x0144 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x0144 }
            r3 = r2
            r2 = r8
            goto L_0x0094
        L_0x0092:
            r2 = r8
        L_0x0093:
            r3 = 0
        L_0x0094:
            if (r3 == 0) goto L_0x00f4
            int r4 = r3.getMeasuredWidth()     // Catch:{ all -> 0x00ef }
            if (r4 <= 0) goto L_0x00a2
            int r4 = r3.getMeasuredHeight()     // Catch:{ all -> 0x00ef }
            if (r4 > 0) goto L_0x00f4
        L_0x00a2:
            int r4 = r3.getMeasuredWidth()     // Catch:{ all -> 0x00ef }
            if (r4 <= 0) goto L_0x00c1
            android.content.Context r4 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r5 = r3.getMeasuredWidth()     // Catch:{ all -> 0x00ef }
            int r6 = r3.getPaddingLeft()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r6 = r3.getPaddingRight()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r4 = com.startapp.C11970ib.m52473b(r4, r5)     // Catch:{ all -> 0x00ef }
            r2.mo20727b(r0, r4)     // Catch:{ all -> 0x00ef }
        L_0x00c1:
            int r4 = r3.getMeasuredHeight()     // Catch:{ all -> 0x00ef }
            if (r4 <= 0) goto L_0x00e0
            android.content.Context r4 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r5 = r3.getMeasuredHeight()     // Catch:{ all -> 0x00ef }
            int r6 = r3.getPaddingBottom()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r6 = r3.getPaddingTop()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r4 = com.startapp.C11970ib.m52473b(r4, r5)     // Catch:{ all -> 0x00ef }
            r2.mo20722a((android.graphics.Point) r0, (int) r4)     // Catch:{ all -> 0x00ef }
        L_0x00e0:
            android.view.ViewParent r4 = r3.getParent()     // Catch:{ all -> 0x00ef }
            boolean r4 = r4 instanceof android.view.View     // Catch:{ all -> 0x00ef }
            if (r4 == 0) goto L_0x0093
            android.view.ViewParent r3 = r3.getParent()     // Catch:{ all -> 0x00ef }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x00ef }
            goto L_0x0094
        L_0x00ef:
            r3 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
            goto L_0x0146
        L_0x00f4:
            if (r3 != 0) goto L_0x0111
            android.content.Context r3 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r4 = r1.widthPixels     // Catch:{ all -> 0x00ef }
            int r3 = com.startapp.C11970ib.m52473b(r3, r4)     // Catch:{ all -> 0x00ef }
            r2.mo20727b(r0, r3)     // Catch:{ all -> 0x00ef }
            android.content.Context r3 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r4 = r1.heightPixels     // Catch:{ all -> 0x00ef }
            int r3 = com.startapp.C11970ib.m52473b(r3, r4)     // Catch:{ all -> 0x00ef }
            r2.mo20722a((android.graphics.Point) r0, (int) r3)     // Catch:{ all -> 0x00ef }
            goto L_0x0163
        L_0x0111:
            android.content.Context r4 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r5 = r3.getMeasuredWidth()     // Catch:{ all -> 0x00ef }
            int r6 = r3.getPaddingLeft()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r6 = r3.getPaddingRight()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r4 = com.startapp.C11970ib.m52473b(r4, r5)     // Catch:{ all -> 0x00ef }
            r2.mo20727b(r0, r4)     // Catch:{ all -> 0x00ef }
            android.content.Context r4 = r2.getContext()     // Catch:{ all -> 0x00ef }
            int r5 = r3.getMeasuredHeight()     // Catch:{ all -> 0x00ef }
            int r6 = r3.getPaddingBottom()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r6
            int r3 = r3.getPaddingTop()     // Catch:{ all -> 0x00ef }
            int r5 = r5 - r3
            int r3 = com.startapp.C11970ib.m52473b(r4, r5)     // Catch:{ all -> 0x00ef }
            r2.mo20722a((android.graphics.Point) r0, (int) r3)     // Catch:{ all -> 0x00ef }
            goto L_0x0163
        L_0x0144:
            r2 = move-exception
            r3 = r8
        L_0x0146:
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r2)
            android.content.Context r2 = r3.getContext()
            int r4 = r1.widthPixels
            int r2 = com.startapp.C11970ib.m52473b(r2, r4)
            r3.mo20727b(r0, r2)
            android.content.Context r2 = r3.getContext()
            int r1 = r1.heightPixels
            int r1 = com.startapp.C11970ib.m52473b(r2, r1)
            r3.mo20722a((android.graphics.Point) r0, (int) r1)
        L_0x0163:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.mo20734q():android.graphics.Point");
    }

    /* renamed from: r */
    public int mo20735r() {
        return 0;
    }

    /* renamed from: s */
    public final ViewGroup mo20736s() {
        View view;
        View rootView;
        ViewGroup viewGroup = this.f22182O;
        if (viewGroup != null) {
            return viewGroup;
        }
        Context context = getContext();
        RelativeLayout relativeLayout = this.f22174G;
        View view2 = null;
        if (!(context instanceof Activity)) {
            view = null;
        } else {
            view = ((Activity) context).getWindow().getDecorView().findViewById(16908290);
        }
        if (!(relativeLayout == null || (rootView = relativeLayout.getRootView()) == null || (view2 = rootView.findViewById(16908290)) != null)) {
            view2 = rootView;
        }
        if (view == null) {
            view = view2;
        }
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return this.f22174G;
    }

    public void setAdTag(String str) {
        this.f22157j = str;
    }

    public void setBannerListener(BannerListener bannerListener) {
        this.f22170C = bannerListener;
    }

    public void showBanner() {
        try {
            ComponentLocator.m23305a(getContext()).mo21231r().mo21248a(2048);
        } catch (Throwable unused) {
        }
        this.f22191w = true;
        C5055a.m23152a(this.f22184Q);
    }

    /* renamed from: t */
    public void mo20737t() {
        long j;
        Context context = getContext();
        String[] strArr = this.f22186r.trackingUrls;
        TrackingParams trackingParams = new TrackingParams(this.f22157j);
        if (this.f22186r.mo20927h() != null) {
            j = TimeUnit.SECONDS.toMillis(this.f22186r.mo20927h().longValue());
        } else {
            j = TimeUnit.SECONDS.toMillis(MetaData.f22407k.mo21203o());
        }
        C11868d9 d9Var = new C11868d9(context, strArr, trackingParams, j);
        this.f22176I = d9Var;
        d9Var.f52868j = new WeakReference<>(this.f22183P);
        mo20685a(this.f22176I);
    }

    /* renamed from: u */
    public final void mo20738u() {
        if (this.f22168A == null) {
            this.f22168A = new AdPreferences();
        }
        if (this.f22186r != null) {
            Point point = this.f22153f;
            if (point == null) {
                point = mo20734q();
            }
            this.f22186r.mo20919a(point.x, point.y);
            this.f22186r.setState(C5041Ad.AdState.UN_INITIALIZED);
            this.f22186r.mo45850c(mo20735r());
            this.f22186r.load(this.f22168A, this);
        }
    }

    public BannerStandard(Activity activity, AdPreferences adPreferences) {
        this((Context) activity, adPreferences);
    }

    public BannerStandard(Activity activity, BannerListener bannerListener) {
        this((Context) activity, bannerListener);
    }

    /* renamed from: b */
    public final void mo20728b(WebView webView2) {
        C12011k7 k7Var = this.f22177J;
        if (k7Var == null) {
            k7Var = new C12011k7(webView2);
            this.f22177J = k7Var;
        }
        if (k7Var.mo45503c()) {
            try {
                RelativeLayout relativeLayout = this.f22173F;
                if (relativeLayout != null) {
                    k7Var.mo45501a(relativeLayout, FriendlyObstructionPurpose.OTHER, (String) null);
                }
                CloseableLayout closeableLayout = this.f22175H;
                if (closeableLayout != null) {
                    k7Var.mo45501a(closeableLayout, FriendlyObstructionPurpose.CLOSE_AD, (String) null);
                }
            } catch (RuntimeException unused) {
            }
            k7Var.mo45500a(webView2);
            k7Var.mo45505e();
            k7Var.mo45504d();
            k7Var.mo45502b();
        }
    }

    public BannerStandard(Activity activity, AdPreferences adPreferences, BannerListener bannerListener) {
        this((Context) activity, adPreferences, bannerListener);
    }

    public BannerStandard(Activity activity, boolean z) {
        this((Context) activity, z);
    }

    public BannerStandard(Activity activity, boolean z, AdPreferences adPreferences) {
        this((Context) activity, z, adPreferences);
    }

    public BannerStandard(Activity activity, AttributeSet attributeSet) {
        this((Context) activity, attributeSet);
    }

    public BannerStandard(Activity activity, AttributeSet attributeSet, int i) {
        this((Context) activity, attributeSet, i);
    }

    @Deprecated
    public BannerStandard(Context context) {
        this(context, true, (AdPreferences) null);
    }

    @Deprecated
    public BannerStandard(Context context, AdPreferences adPreferences) {
        this(context, true, adPreferences);
    }

    @Deprecated
    public BannerStandard(Context context, BannerListener bannerListener) {
        this(context, true, (AdPreferences) null);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public BannerStandard(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        this(context, true, adPreferences);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public BannerStandard(Context context, boolean z) {
        this(context, z, (AdPreferences) null);
    }

    public BannerStandard(Context context, boolean z, AdPreferences adPreferences) {
        this(context, z, adPreferences, (BannerStandardAd) null);
    }

    public BannerStandard(Context context, boolean z, AdPreferences adPreferences, BannerStandardAd bannerStandardAd) {
        super(context);
        this.f22187s = false;
        this.f22188t = true;
        this.f22189u = false;
        this.f22190v = true;
        this.f22191w = true;
        this.f22192x = new Handler(Looper.getMainLooper());
        this.f22169B = new C12119p0(getWidthInDp(), getHeightInDp());
        this.f22171D = false;
        this.f22172E = null;
        this.f22173F = null;
        this.f22183P = new C11868d9.C11869a() {
            public void onSent(String str) {
                BannerStandard bannerStandard = BannerStandard.this;
                Context context = bannerStandard.getContext();
                BannerListener bannerListener = bannerStandard.f22170C;
                C12102o0 o0Var = null;
                C12339t2.m53496a("onImpression", bannerListener != null, str, (String) null);
                if (bannerListener != null) {
                    o0Var = new C12102o0(bannerListener, bannerStandard, context);
                }
                C5055a.m23152a((Runnable) o0Var);
                bannerStandard.f22193y = System.currentTimeMillis() - bannerStandard.f22193y;
                bannerStandard.mo20707m();
            }
        };
        this.f22184Q = new Runnable() {
            public void run() {
                BannerStandard bannerStandard = BannerStandard.this;
                RelativeLayout relativeLayout = bannerStandard.f22174G;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                }
                if (bannerStandard.f22186r != null) {
                    C12146q9 s = ComponentLocator.m23305a(bannerStandard.getContext()).mo21232s();
                    AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
                    int r = bannerStandard.mo20735r();
                    String adId = bannerStandard.f22186r.getAdId();
                    s.getClass();
                    if (adId != null) {
                        s.f54069a.put(new C12146q9.C12147a(placement, r), adId);
                    }
                }
            }
        };
        this.f22185R = new Runnable() {
            public void run() {
                RelativeLayout relativeLayout = BannerStandard.this.f22174G;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(4);
                }
            }
        };
        try {
            this.f22190v = z;
            this.f22168A = adPreferences;
            this.f22186r = bannerStandardAd;
            mo20697h();
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }

    @Deprecated
    public BannerStandard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public BannerStandard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22187s = false;
        this.f22188t = true;
        this.f22189u = false;
        this.f22190v = true;
        this.f22191w = true;
        this.f22192x = new Handler(Looper.getMainLooper());
        this.f22169B = new C12119p0(getWidthInDp(), getHeightInDp());
        this.f22171D = false;
        this.f22172E = null;
        this.f22173F = null;
        this.f22183P = new C11868d9.C11869a() {
            public void onSent(String str) {
                BannerStandard bannerStandard = BannerStandard.this;
                Context context = bannerStandard.getContext();
                BannerListener bannerListener = bannerStandard.f22170C;
                C12102o0 o0Var = null;
                C12339t2.m53496a("onImpression", bannerListener != null, str, (String) null);
                if (bannerListener != null) {
                    o0Var = new C12102o0(bannerListener, bannerStandard, context);
                }
                C5055a.m23152a((Runnable) o0Var);
                bannerStandard.f22193y = System.currentTimeMillis() - bannerStandard.f22193y;
                bannerStandard.mo20707m();
            }
        };
        this.f22184Q = new Runnable() {
            public void run() {
                BannerStandard bannerStandard = BannerStandard.this;
                RelativeLayout relativeLayout = bannerStandard.f22174G;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                }
                if (bannerStandard.f22186r != null) {
                    C12146q9 s = ComponentLocator.m23305a(bannerStandard.getContext()).mo21232s();
                    AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
                    int r = bannerStandard.mo20735r();
                    String adId = bannerStandard.f22186r.getAdId();
                    s.getClass();
                    if (adId != null) {
                        s.f54069a.put(new C12146q9.C12147a(placement, r), adId);
                    }
                }
            }
        };
        this.f22185R = new Runnable() {
            public void run() {
                RelativeLayout relativeLayout = BannerStandard.this.f22174G;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(4);
                }
            }
        };
        try {
            mo20697h();
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }

    /* renamed from: a */
    public final void mo20724a(WebView webView2) {
        webView2.setBackgroundColor(0);
        webView2.setHorizontalScrollBarEnabled(false);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.setVerticalScrollBarEnabled(false);
        webView2.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                BannerStandard.this.f22188t = true;
                if (motionEvent.getAction() == 2) {
                    return true;
                }
                return false;
            }
        });
        webView2.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                return true;
            }
        });
        webView2.setLongClickable(false);
    }

    /* renamed from: a */
    public final void mo20723a(View view) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C11970ib.m52467a(getContext(), this.f22169B.f53990a.x), C11970ib.m52467a(getContext(), this.f22169B.f53990a.y));
        layoutParams.addRule(13);
        this.f22174G.addView(view, layoutParams);
    }

    /* renamed from: a */
    public final void mo20722a(Point point, int i) {
        if (point.y <= 0) {
            point.y = i;
        }
    }

    /* renamed from: a */
    public final void mo20725a(String str) {
        setErrorMessage(str);
        if (this.f22170C != null && !this.f22171D) {
            this.f22171D = true;
            C12064n0.m52614b(getContext(), this.f22170C, this, (String) null);
        }
    }

    /* renamed from: a */
    public final boolean mo20726a(int i, int i2) {
        Point q = mo20734q();
        if (q.x < i || q.y < i2) {
            Point point = new Point(0, 0);
            ViewGroup.LayoutParams layoutParams = this.webView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(point.x, point.y);
            } else {
                layoutParams.width = point.x;
                layoutParams.height = point.y;
            }
            this.webView.setLayoutParams(layoutParams);
            return false;
        }
        Point point2 = this.f22169B.f53990a;
        point2.x = i;
        point2.y = i2;
        int a = C11970ib.m52467a(getContext(), this.f22169B.f53990a.x);
        int a2 = C11970ib.m52467a(getContext(), this.f22169B.f53990a.y);
        this.f22174G.setMinimumWidth(a);
        this.f22174G.setMinimumHeight(a2);
        ViewGroup.LayoutParams layoutParams2 = this.webView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new RelativeLayout.LayoutParams(a, a2);
        } else {
            layoutParams2.width = a;
            layoutParams2.height = a2;
        }
        this.webView.setLayoutParams(layoutParams2);
        return true;
    }

    /* renamed from: a */
    public void mo20683a(int i) {
        this.f22156i = i;
    }

    /* renamed from: a */
    public static void m22960a(BannerStandard bannerStandard, boolean z) {
        if (z != (!bannerStandard.f22175H.f54208c.isVisible())) {
            bannerStandard.f22175H.setCloseVisible(!z);
        }
    }

    /* renamed from: a */
    public static void m22959a(BannerStandard bannerStandard) {
        MraidState mraidState;
        if (bannerStandard.f22180M.getState() != MraidState.LOADING && bannerStandard.f22180M.getState() != (mraidState = MraidState.HIDDEN)) {
            if (bannerStandard.f22180M.getState() == MraidState.RESIZED || bannerStandard.f22180M.getState() == MraidState.EXPANDED) {
                if (bannerStandard.f22181N != null) {
                    bannerStandard.f22175H.removeView(bannerStandard.twoPartWebView);
                    bannerStandard.f22179L.mo46867a();
                    bannerStandard.f22179L = null;
                    bannerStandard.f22181N = null;
                    bannerStandard.twoPartWebView.stopLoading();
                    bannerStandard.twoPartWebView = null;
                } else {
                    bannerStandard.f22175H.removeView(bannerStandard.webView);
                    bannerStandard.mo20723a((View) bannerStandard.webView);
                    C5055a.m23152a(bannerStandard.f22184Q);
                }
                CloseableLayout closeableLayout = bannerStandard.f22175H;
                if (!(closeableLayout == null || closeableLayout.getParent() == null || !(closeableLayout.getParent() instanceof ViewGroup))) {
                    ((ViewGroup) closeableLayout.getParent()).removeView(closeableLayout);
                }
                bannerStandard.f22180M.setState(MraidState.DEFAULT);
            } else if (bannerStandard.f22180M.getState() == MraidState.DEFAULT) {
                C5055a.m23152a(bannerStandard.f22185R);
                bannerStandard.f22180M.setState(mraidState);
            }
            bannerStandard.mo20707m();
        }
    }
}
