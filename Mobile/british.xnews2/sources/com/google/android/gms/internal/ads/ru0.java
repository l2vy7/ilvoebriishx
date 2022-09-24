package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zzcm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;
import p006a5.C6492o;
import p006a5.C6493p;
import p198d5.C10487a;

@SuppressLint({"ViewConstructor"})
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ru0 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, xt0 {

    /* renamed from: m0 */
    public static final /* synthetic */ int f20701m0 = 0;
    @GuardedBy("this")

    /* renamed from: A */
    private boolean f20702A;
    @GuardedBy("this")

    /* renamed from: B */
    private boolean f20703B;
    @GuardedBy("this")

    /* renamed from: C */
    private d30 f20704C;
    @GuardedBy("this")

    /* renamed from: D */
    private b30 f20705D;
    @GuardedBy("this")

    /* renamed from: E */
    private C8271vo f20706E;
    @GuardedBy("this")

    /* renamed from: F */
    private int f20707F;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: G */
    public int f20708G;

    /* renamed from: H */
    private b10 f20709H;

    /* renamed from: I */
    private final b10 f20710I;

    /* renamed from: J */
    private b10 f20711J;

    /* renamed from: K */
    private final c10 f20712K;

    /* renamed from: L */
    private int f20713L;

    /* renamed from: M */
    private int f20714M;

    /* renamed from: N */
    private int f20715N;
    @GuardedBy("this")

    /* renamed from: O */
    private zzl f20716O;
    @GuardedBy("this")

    /* renamed from: P */
    private boolean f20717P;

    /* renamed from: Q */
    private final zzcm f20718Q;

    /* renamed from: R */
    private int f20719R = -1;

    /* renamed from: S */
    private int f20720S = -1;

    /* renamed from: T */
    private int f20721T = -1;

    /* renamed from: U */
    private int f20722U = -1;

    /* renamed from: V */
    private Map<String, ms0> f20723V;

    /* renamed from: W */
    private final WindowManager f20724W;

    /* renamed from: b */
    private final nv0 f20725b;

    /* renamed from: c */
    private final C7497ab f20726c;

    /* renamed from: d */
    private final p10 f20727d;

    /* renamed from: e */
    private final zzcjf f20728e;

    /* renamed from: f */
    private com.google.android.gms.ads.internal.zzl f20729f;

    /* renamed from: g */
    private final zza f20730g;

    /* renamed from: h */
    private final DisplayMetrics f20731h;

    /* renamed from: i */
    private final float f20732i;

    /* renamed from: j */
    private ir2 f20733j;

    /* renamed from: k */
    private lr2 f20734k;

    /* renamed from: l */
    private boolean f20735l = false;

    /* renamed from: l0 */
    private final C7728gq f20736l0;

    /* renamed from: m */
    private boolean f20737m = false;

    /* renamed from: n */
    private eu0 f20738n;
    @GuardedBy("this")

    /* renamed from: o */
    private zzl f20739o;
    @GuardedBy("this")

    /* renamed from: p */
    private C10487a f20740p;
    @GuardedBy("this")

    /* renamed from: q */
    private ov0 f20741q;
    @GuardedBy("this")

    /* renamed from: r */
    private final String f20742r;
    @GuardedBy("this")

    /* renamed from: s */
    private boolean f20743s;
    @GuardedBy("this")

    /* renamed from: t */
    private boolean f20744t;
    @GuardedBy("this")

    /* renamed from: u */
    private boolean f20745u;
    @GuardedBy("this")

    /* renamed from: v */
    private boolean f20746v;
    @GuardedBy("this")

    /* renamed from: w */
    private Boolean f20747w;
    @GuardedBy("this")

    /* renamed from: x */
    private boolean f20748x = true;
    @GuardedBy("this")

    /* renamed from: y */
    private final String f20749y = "";
    @GuardedBy("this")

    /* renamed from: z */
    private uu0 f20750z;

    protected ru0(nv0 nv0, ov0 ov0, String str, boolean z, boolean z2, C7497ab abVar, p10 p10, zzcjf zzcjf, e10 e10, com.google.android.gms.ads.internal.zzl zzl, zza zza, C7728gq gqVar, ir2 ir2, lr2 lr2) {
        super(nv0);
        lr2 lr22;
        this.f20725b = nv0;
        this.f20741q = ov0;
        this.f20742r = str;
        this.f20745u = z;
        this.f20726c = abVar;
        this.f20727d = p10;
        this.f20728e = zzcjf;
        this.f20729f = zzl;
        this.f20730g = zza;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f20724W = windowManager;
        zzt.zzp();
        DisplayMetrics zzy = com.google.android.gms.ads.internal.util.zzt.zzy(windowManager);
        this.f20731h = zzy;
        this.f20732i = zzy.density;
        this.f20736l0 = gqVar;
        this.f20733j = ir2;
        this.f20734k = lr2;
        this.f20718Q = new zzcm(nv0.mo33767a(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            co0.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(zzt.zzp().zzd(nv0, zzcjf.f43036b));
        zzt.zzq().zzf(getContext(), settings);
        setDownloadListener(this);
        m20913Q0();
        if (C6492o.m28281d()) {
            addJavascriptInterface(new yu0(this, new wu0(this), (wu0) null), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        m20921Y0();
        c10 c10 = new c10(new e10(true, "make_wv", this.f20742r));
        this.f20712K = c10;
        c10.mo18174a().mo18242c((e10) null);
        if (!(!((Boolean) C8311wv.m39277c().mo18570b(p00.f37194r1)).booleanValue() || (lr22 = this.f20734k) == null || lr22.f35215b == null)) {
            c10.mo18174a().mo18243d("gqi", this.f20734k.f35215b);
        }
        c10.mo18174a();
        b10 f = e10.m20393f();
        this.f20710I = f;
        c10.mo18175b("native:view_create", f);
        this.f20711J = null;
        this.f20709H = null;
        zzt.zzq().zze(nv0);
        zzt.zzo().mo18589p();
    }

    /* renamed from: Q0 */
    private final synchronized void m20913Q0() {
        ir2 ir2 = this.f20733j;
        if (ir2 != null) {
            if (ir2.f33485k0) {
                co0.zze("Disabling hardware acceleration on an overlay.");
                m20915S0();
                return;
            }
        }
        if (!this.f20745u) {
            if (!this.f20741q.mo34013i()) {
                if (Build.VERSION.SDK_INT < 18) {
                    co0.zze("Disabling hardware acceleration on an AdView.");
                    m20915S0();
                    return;
                }
                co0.zze("Enabling hardware acceleration on an AdView.");
                m20917U0();
                return;
            }
        }
        co0.zze("Enabling hardware acceleration on an overlay.");
        m20917U0();
    }

    /* renamed from: R0 */
    private final synchronized void m20914R0() {
        if (!this.f20717P) {
            this.f20717P = true;
            zzt.zzo().mo18588o();
        }
    }

    /* renamed from: S0 */
    private final synchronized void m20915S0() {
        if (!this.f20746v) {
            setLayerType(1, (Paint) null);
        }
        this.f20746v = true;
    }

    /* renamed from: T0 */
    private final void m20916T0(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? SessionDescription.SUPPORTED_SDP_VERSION : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        mo18321Z("onAdVisibilityChanged", hashMap);
    }

    /* renamed from: U0 */
    private final synchronized void m20917U0() {
        if (this.f20746v) {
            setLayerType(0, (Paint) null);
        }
        this.f20746v = false;
    }

    /* renamed from: V0 */
    private final synchronized void m20918V0(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            zzt.zzo().mo18592s(th, "AdWebViewImpl.loadUrlUnsafe");
            co0.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    /* renamed from: W0 */
    private final void m20919W0() {
        w00.m39004a(this.f20712K.mo18174a(), this.f20710I, "aeh2");
    }

    /* renamed from: X0 */
    private final synchronized void m20920X0() {
        Map<String, ms0> map = this.f20723V;
        if (map != null) {
            for (ms0 release : map.values()) {
                release.release();
            }
        }
        this.f20723V = null;
    }

    /* renamed from: Y0 */
    private final void m20921Y0() {
        c10 c10 = this.f20712K;
        if (c10 != null) {
            e10 a = c10.mo18174a();
            u00 f = zzt.zzo().mo18581f();
            if (f != null) {
                f.mo18869f(a);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        mo18727O0(java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001a */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m20922Z0() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.nn0 r0 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ all -> 0x0023 }
            java.lang.Boolean r0 = r0.mo18585k()     // Catch:{ all -> 0x0023 }
            r2.f20747w = r0     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "(function(){})()"
            r1 = 0
            r2.evaluateJavascript(r0, r1)     // Catch:{ IllegalStateException -> 0x001a }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IllegalStateException -> 0x001a }
            r2.mo18727O0(r0)     // Catch:{ IllegalStateException -> 0x001a }
            monitor-exit(r2)
            return
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0023 }
            r2.mo18727O0(r0)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ru0.m20922Z0():void");
    }

    /* renamed from: A */
    public final synchronized void mo18711A() {
        zze.zza("Destroying WebView!");
        m20914R0();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new qu0(this));
    }

    /* renamed from: B */
    public final synchronized void mo18712B(zzl zzl) {
        this.f20739o = zzl;
    }

    /* renamed from: C */
    public final void mo18713C(boolean z) {
        this.f20738n.mo18260a(false);
    }

    /* renamed from: C0 */
    public final synchronized void mo18714C0(d30 d30) {
        this.f20704C = d30;
    }

    /* renamed from: D */
    public final synchronized boolean mo18715D() {
        return this.f20748x;
    }

    /* renamed from: E0 */
    public final void mo18317E0(String str, JSONObject jSONObject) {
        mo18325g(str, jSONObject.toString());
    }

    /* renamed from: F */
    public final void mo18716F() {
        throw null;
    }

    /* renamed from: H */
    public final synchronized void mo18717H(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        zzl zzl = this.f20739o;
        if (zzl != null) {
            zzl.zzz(z);
        }
    }

    /* renamed from: H0 */
    public final eu0 mo18718H0() {
        return this.f20738n;
    }

    /* renamed from: I */
    public final synchronized void mo18719I(int i) {
        this.f20713L = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I0 */
    public final synchronized Boolean mo18720I0() {
        return this.f20747w;
    }

    /* access modifiers changed from: protected */
    @TargetApi(19)
    /* renamed from: L0 */
    public final synchronized void mo18721L0(String str, ValueCallback<String> valueCallback) {
        if (!mo18783q0()) {
            evaluateJavascript(str, (ValueCallback<String>) null);
        } else {
            co0.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: M */
    public final void mo18722M(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public final void mo18723M0(String str) {
        if (C6492o.m28283f()) {
            if (mo18720I0() == null) {
                m20922Z0();
            }
            if (mo18720I0().booleanValue()) {
                mo18721L0(str, (ValueCallback<String>) null);
            } else {
                mo18725N0(str.length() != 0 ? "javascript:".concat(str) : new String("javascript:"));
            }
        } else {
            mo18725N0(str.length() != 0 ? "javascript:".concat(str) : new String("javascript:"));
        }
    }

    /* renamed from: N */
    public final void mo18724N(int i) {
        this.f20714M = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public final synchronized void mo18725N0(String str) {
        if (!mo18783q0()) {
            loadUrl(str);
        } else {
            co0.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: O */
    public final void mo18726O(String str, e70<? super xt0> e70) {
        eu0 eu0 = this.f20738n;
        if (eu0 != null) {
            eu0.mo18250E0(str, e70);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public final void mo18727O0(Boolean bool) {
        synchronized (this) {
            this.f20747w = bool;
        }
        zzt.zzo().mo18593t(bool);
    }

    /* renamed from: P */
    public final void mo18728P(String str, e70<? super xt0> e70) {
        eu0 eu0 = this.f20738n;
        if (eu0 != null) {
            eu0.mo18261c(str, e70);
        }
    }

    /* renamed from: P0 */
    public final boolean mo18729P0() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f20738n.zzJ() && !this.f20738n.mo18268l()) {
            return false;
        }
        C8241uv.m38463b();
        DisplayMetrics displayMetrics = this.f20731h;
        int q = vn0.m38858q(displayMetrics, displayMetrics.widthPixels);
        C8241uv.m38463b();
        DisplayMetrics displayMetrics2 = this.f20731h;
        int q2 = vn0.m38858q(displayMetrics2, displayMetrics2.heightPixels);
        Activity a = this.f20725b.mo33767a();
        if (a == null || a.getWindow() == null) {
            i2 = q;
            i = q2;
        } else {
            zzt.zzp();
            int[] zzU = com.google.android.gms.ads.internal.util.zzt.zzU(a);
            C8241uv.m38463b();
            int q3 = vn0.m38858q(this.f20731h, zzU[0]);
            C8241uv.m38463b();
            i = vn0.m38858q(this.f20731h, zzU[1]);
            i2 = q3;
        }
        int i3 = this.f20720S;
        if (i3 == q && this.f20719R == q2 && this.f20721T == i2 && this.f20722U == i) {
            return false;
        }
        if (!(i3 == q && this.f20719R == q2)) {
            z = true;
        }
        this.f20720S = q;
        this.f20719R = q2;
        this.f20721T = i2;
        this.f20722U = i;
        new vf0(this, "").mo35421e(q, q2, i2, i, this.f20731h.density, this.f20724W.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: Q */
    public final void mo18730Q(boolean z, int i, String str, boolean z2) {
        this.f20738n.mo18281z0(z, i, str, z2);
    }

    /* renamed from: R */
    public final synchronized void mo18731R(int i) {
        zzl zzl = this.f20739o;
        if (zzl != null) {
            zzl.zzy(i);
        }
    }

    /* renamed from: S */
    public final synchronized boolean mo18732S() {
        return this.f20745u;
    }

    /* renamed from: T */
    public final void mo18733T() {
        if (this.f20711J == null) {
            this.f20712K.mo18174a();
            b10 f = e10.m20393f();
            this.f20711J = f;
            this.f20712K.mo18175b("native:view_load", f);
        }
    }

    /* renamed from: U */
    public final synchronized String mo18734U() {
        return this.f20742r;
    }

    /* renamed from: V */
    public final synchronized void mo18735V(boolean z) {
        this.f20748x = z;
    }

    /* renamed from: W */
    public final synchronized void mo18736W(b30 b30) {
        this.f20705D = b30;
    }

    /* renamed from: X */
    public final boolean mo18737X() {
        return false;
    }

    /* renamed from: Y */
    public final void mo18738Y(boolean z) {
        this.f20738n.mo18263e0(z);
    }

    /* renamed from: Z */
    public final void mo18321Z(String str, Map<String, ?> map) {
        try {
            mo18322a(str, zzt.zzp().zzf(map));
        } catch (JSONException unused) {
            co0.zzj("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: a */
    public final void mo18322a(String str, JSONObject jSONObject) {
        String str2;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        if (sb2.length() != 0) {
            str2 = "Dispatching AFMA event: ".concat(sb2);
        } else {
            str2 = new String("Dispatching AFMA event: ");
        }
        co0.zze(str2);
        mo18723M0(sb.toString());
    }

    /* renamed from: a0 */
    public final void mo18739a0() {
        setBackgroundColor(0);
    }

    /* renamed from: b */
    public final ir2 mo18740b() {
        return this.f20733j;
    }

    /* renamed from: b0 */
    public final synchronized void mo18741b0(C10487a aVar) {
        this.f20740p = aVar;
    }

    /* renamed from: c0 */
    public final synchronized void mo18742c0(zzl zzl) {
        this.f20716O = zzl;
    }

    /* renamed from: d */
    public final synchronized void mo18743d() {
        b30 b30 = this.f20705D;
        if (b30 != null) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new fq1((hq1) b30));
        }
    }

    /* renamed from: d0 */
    public final synchronized void mo18744d0(String str, String str2, String str3) {
        String str4;
        if (!mo18783q0()) {
            String[] strArr = new String[1];
            String str5 = (String) C8311wv.m39277c().mo18570b(p00.f36911K);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(MediationMetaData.KEY_VERSION, str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                co0.zzk("Unable to build MRAID_ENV", e);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, ev0.m31942a(str2, strArr), "text/html", C6540C.UTF8_NAME, (String) null);
            return;
        }
        co0.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    public final synchronized void destroy() {
        m20921Y0();
        this.f20718Q.zza();
        zzl zzl = this.f20739o;
        if (zzl != null) {
            zzl.zzb();
            this.f20739o.zzl();
            this.f20739o = null;
        }
        this.f20740p = null;
        this.f20738n.mo18253G0();
        this.f20706E = null;
        this.f20729f = null;
        setOnClickListener((View.OnClickListener) null);
        setOnTouchListener((View.OnTouchListener) null);
        if (!this.f20744t) {
            zzt.zzy().mo31660e(this);
            m20920X0();
            this.f20744t = true;
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37164n7)).booleanValue()) {
                zze.zza("Initiating WebView self destruct sequence in 3...");
                zze.zza("Loading blank page in WebView, 2...");
                m20918V0("about:blank");
                return;
            }
            zze.zza("Destroying the WebView immediately...");
            mo18711A();
        }
    }

    /* renamed from: e */
    public final synchronized boolean mo18746e() {
        return this.f20707F > 0;
    }

    /* renamed from: e0 */
    public final void mo18747e0(int i) {
        this.f20715N = i;
    }

    @TargetApi(19)
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (mo18783q0()) {
            co0.zzl("#004 The webview is destroyed. Ignoring action.", (Throwable) null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue((Object) null);
                return;
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    /* renamed from: f0 */
    public final void mo18749f0(String str, C6493p<e70<? super xt0>> pVar) {
        eu0 eu0 = this.f20738n;
        if (eu0 != null) {
            eu0.mo18262d(str, pVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.f20744t) {
                    this.f20738n.mo18253G0();
                    zzt.zzy().mo31660e(this);
                    m20920X0();
                    m20914R0();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: g */
    public final void mo18325g(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        mo18723M0(sb.toString());
    }

    /* renamed from: g0 */
    public final void mo18751g0() {
        this.f20718Q.zzb();
    }

    /* renamed from: h */
    public final synchronized zzl mo18752h() {
        return this.f20739o;
    }

    /* renamed from: h0 */
    public final void mo18753h0(zzbv zzbv, f42 f42, nv1 nv1, nw2 nw2, String str, String str2, int i) {
        this.f20738n.mo18271o0(zzbv, f42, nv1, nw2, str, str2, i);
    }

    /* renamed from: i */
    public final synchronized zzl mo18754i() {
        return this.f20716O;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return;
     */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo18755i0(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f20745u     // Catch:{ all -> 0x003a }
            r2.f20745u = r3     // Catch:{ all -> 0x003a }
            r2.m20913Q0()     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x0038
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f36919L     // Catch:{ all -> 0x003a }
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x003a }
            java.lang.Object r0 = r1.mo18570b(r0)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.ov0 r0 = r2.f20741q     // Catch:{ all -> 0x003a }
            boolean r0 = r0.mo34013i()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0038
        L_0x0024:
            com.google.android.gms.internal.ads.vf0 r0 = new com.google.android.gms.internal.ads.vf0     // Catch:{ all -> 0x003a }
            java.lang.String r1 = ""
            r0.<init>(r2, r1)     // Catch:{ all -> 0x003a }
            r1 = 1
            if (r1 == r3) goto L_0x0031
            java.lang.String r3 = "default"
            goto L_0x0033
        L_0x0031:
            java.lang.String r3 = "expanded"
        L_0x0033:
            r0.mo35423g(r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
            return
        L_0x0038:
            monitor-exit(r2)
            return
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ru0.mo18755i0(boolean):void");
    }

    /* renamed from: j */
    public final synchronized boolean mo18756j() {
        return this.f20743s;
    }

    /* renamed from: j0 */
    public final void mo18757j0(zzc zzc, boolean z) {
        this.f20738n.mo18270n0(zzc, z);
    }

    /* renamed from: k */
    public final synchronized void mo18758k(uu0 uu0) {
        if (this.f20750z != null) {
            co0.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f20750z = uu0;
        }
    }

    /* renamed from: k0 */
    public final synchronized void mo18759k0(ov0 ov0) {
        this.f20741q = ov0;
        requestLayout();
    }

    /* renamed from: l */
    public final synchronized ms0 mo18760l(String str) {
        Map<String, ms0> map = this.f20723V;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: l0 */
    public final synchronized C10487a mo18761l0() {
        return this.f20740p;
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!mo18783q0()) {
            super.loadData(str, str2, str3);
        } else {
            co0.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo18783q0()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            co0.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!mo18783q0()) {
            try {
                super.loadUrl(str);
            } catch (Throwable th) {
                zzt.zzo().mo18592s(th, "AdWebViewImpl.loadUrl");
                co0.zzk("Could not call loadUrl. ", th);
            }
        } else {
            co0.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: m */
    public final synchronized ov0 mo18765m() {
        return this.f20741q;
    }

    /* renamed from: n */
    public final synchronized String mo18766n() {
        return this.f20749y;
    }

    /* renamed from: n0 */
    public final void mo18767n0(C7689fn fnVar) {
        boolean z;
        synchronized (this) {
            z = fnVar.f31824j;
            this.f20702A = z;
        }
        m20916T0(z);
    }

    /* renamed from: o */
    public final synchronized void mo18768o(String str, ms0 ms0) {
        if (this.f20723V == null) {
            this.f20723V = new HashMap();
        }
        this.f20723V.put(str, ms0);
    }

    /* renamed from: o0 */
    public final void mo18769o0(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? SessionDescription.SUPPORTED_SDP_VERSION : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.toString(j));
        mo18321Z("onCacheAccessComplete", hashMap);
    }

    public final void onAdClicked() {
        eu0 eu0 = this.f20738n;
        if (eu0 != null) {
            eu0.onAdClicked();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo18783q0()) {
            this.f20718Q.zzc();
        }
        boolean z = this.f20702A;
        eu0 eu0 = this.f20738n;
        if (eu0 != null && eu0.mo18268l()) {
            if (!this.f20703B) {
                this.f20738n.mo18252G();
                this.f20738n.mo18254I();
                this.f20703B = true;
            }
            mo18729P0();
            z = true;
        }
        m20916T0(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        eu0 eu0;
        synchronized (this) {
            if (!mo18783q0()) {
                this.f20718Q.zzd();
            }
            super.onDetachedFromWindow();
            if (this.f20703B && (eu0 = this.f20738n) != null && eu0.mo18268l() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.f20738n.mo18252G();
                this.f20738n.mo18254I();
                this.f20703B = false;
            }
        }
        m20916T0(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzQ(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            co0.zze(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!mo18783q0()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean P0 = mo18729P0();
        zzl h = mo18752h();
        if (h != null && P0) {
            h.zzm();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01c7 A[SYNTHETIC, Splitter:B:116:0x01c7] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x013f  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:66:0x00e0=Splitter:B:66:0x00e0, B:126:0x01e8=Splitter:B:126:0x01e8} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.mo18783q0()     // Catch:{ all -> 0x01ed }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r8.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x000d:
            boolean r0 = r8.isInEditMode()     // Catch:{ all -> 0x01ed }
            if (r0 != 0) goto L_0x01e8
            boolean r0 = r8.f20745u     // Catch:{ all -> 0x01ed }
            if (r0 != 0) goto L_0x01e8
            com.google.android.gms.internal.ads.ov0 r0 = r8.f20741q     // Catch:{ all -> 0x01ed }
            boolean r0 = r0.mo34010f()     // Catch:{ all -> 0x01ed }
            if (r0 == 0) goto L_0x0021
            goto L_0x01e8
        L_0x0021:
            com.google.android.gms.internal.ads.ov0 r0 = r8.f20741q     // Catch:{ all -> 0x01ed }
            boolean r0 = r0.mo34012h()     // Catch:{ all -> 0x01ed }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.ov0 r0 = r8.f20741q     // Catch:{ all -> 0x01ed }
            boolean r0 = r0.mo34014j()     // Catch:{ all -> 0x01ed }
            if (r0 == 0) goto L_0x0095
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f37228v2     // Catch:{ all -> 0x01ed }
            com.google.android.gms.internal.ads.n00 r2 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x01ed }
            java.lang.Object r0 = r2.mo18570b(r0)     // Catch:{ all -> 0x01ed }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01ed }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01ed }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.uu0 r0 = r8.zzs()     // Catch:{ all -> 0x01ed }
            r2 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.zze()     // Catch:{ all -> 0x01ed }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0063
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x0063:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ed }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01ed }
            float r2 = (float) r10     // Catch:{ all -> 0x01ed }
            float r2 = r2 * r0
            int r2 = (int) r2     // Catch:{ all -> 0x01ed }
            float r3 = (float) r9     // Catch:{ all -> 0x01ed }
            float r3 = r3 / r0
            int r3 = (int) r3     // Catch:{ all -> 0x01ed }
            if (r10 != 0) goto L_0x007e
            if (r3 == 0) goto L_0x007d
            float r10 = (float) r3     // Catch:{ all -> 0x01ed }
            float r10 = r10 * r0
            int r2 = (int) r10     // Catch:{ all -> 0x01ed }
            r1 = r9
            r10 = r3
            goto L_0x0088
        L_0x007d:
            r10 = 0
        L_0x007e:
            if (r9 != 0) goto L_0x0087
            if (r2 == 0) goto L_0x0088
            float r9 = (float) r2     // Catch:{ all -> 0x01ed }
            float r9 = r9 / r0
            int r3 = (int) r9     // Catch:{ all -> 0x01ed }
            r1 = r2
            goto L_0x0088
        L_0x0087:
            r1 = r9
        L_0x0088:
            int r9 = java.lang.Math.min(r2, r1)     // Catch:{ all -> 0x01ed }
            int r10 = java.lang.Math.min(r3, r10)     // Catch:{ all -> 0x01ed }
            r8.setMeasuredDimension(r9, r10)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x0095:
            com.google.android.gms.internal.ads.ov0 r0 = r8.f20741q     // Catch:{ all -> 0x01ed }
            boolean r0 = r0.mo34011g()     // Catch:{ all -> 0x01ed }
            if (r0 == 0) goto L_0x00e5
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f37260z2     // Catch:{ all -> 0x01ed }
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x01ed }
            java.lang.Object r0 = r1.mo18570b(r0)     // Catch:{ all -> 0x01ed }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01ed }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01ed }
            if (r0 != 0) goto L_0x00e0
            boolean r0 = p006a5.C6492o.m28281d()     // Catch:{ all -> 0x01ed }
            if (r0 != 0) goto L_0x00b6
            goto L_0x00e0
        L_0x00b6:
            com.google.android.gms.internal.ads.pu0 r0 = new com.google.android.gms.internal.ads.pu0     // Catch:{ all -> 0x01ed }
            r0.<init>(r8)     // Catch:{ all -> 0x01ed }
            java.lang.String r1 = "/contentHeight"
            r8.mo18726O(r1, r0)     // Catch:{ all -> 0x01ed }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r8.mo18723M0(r0)     // Catch:{ all -> 0x01ed }
            android.util.DisplayMetrics r0 = r8.f20731h     // Catch:{ all -> 0x01ed }
            float r0 = r0.density     // Catch:{ all -> 0x01ed }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ed }
            int r1 = r8.f20708G     // Catch:{ all -> 0x01ed }
            r2 = -1
            if (r1 == r2) goto L_0x00d7
            float r10 = (float) r1     // Catch:{ all -> 0x01ed }
            float r10 = r10 * r0
            int r10 = (int) r10     // Catch:{ all -> 0x01ed }
            goto L_0x00db
        L_0x00d7:
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01ed }
        L_0x00db:
            r8.setMeasuredDimension(r9, r10)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x00e0:
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x00e5:
            com.google.android.gms.internal.ads.ov0 r0 = r8.f20741q     // Catch:{ all -> 0x01ed }
            boolean r0 = r0.mo34013i()     // Catch:{ all -> 0x01ed }
            if (r0 == 0) goto L_0x00f8
            android.util.DisplayMetrics r9 = r8.f20731h     // Catch:{ all -> 0x01ed }
            int r10 = r9.widthPixels     // Catch:{ all -> 0x01ed }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01ed }
            r8.setMeasuredDimension(r10, r9)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x00f8:
            int r0 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01ed }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ed }
            int r2 = android.view.View.MeasureSpec.getMode(r10)     // Catch:{ all -> 0x01ed }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01ed }
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r5) goto L_0x0118
            if (r0 != r4) goto L_0x0114
            goto L_0x0118
        L_0x0114:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0119
        L_0x0118:
            r0 = r9
        L_0x0119:
            if (r2 == r5) goto L_0x011d
            if (r2 != r4) goto L_0x011e
        L_0x011d:
            r3 = r10
        L_0x011e:
            com.google.android.gms.internal.ads.ov0 r2 = r8.f20741q     // Catch:{ all -> 0x01ed }
            int r4 = r2.f36607c     // Catch:{ all -> 0x01ed }
            r5 = 1
            if (r4 > r0) goto L_0x012c
            int r2 = r2.f36606b     // Catch:{ all -> 0x01ed }
            if (r2 <= r3) goto L_0x012a
            goto L_0x012c
        L_0x012a:
            r2 = 0
            goto L_0x012d
        L_0x012c:
            r2 = 1
        L_0x012d:
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.p00.f36971R3     // Catch:{ all -> 0x01ed }
            com.google.android.gms.internal.ads.n00 r6 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x01ed }
            java.lang.Object r4 = r6.mo18570b(r4)     // Catch:{ all -> 0x01ed }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01ed }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01ed }
            if (r4 == 0) goto L_0x015e
            com.google.android.gms.internal.ads.ov0 r4 = r8.f20741q     // Catch:{ all -> 0x01ed }
            int r6 = r4.f36607c     // Catch:{ all -> 0x01ed }
            float r7 = r8.f20732i     // Catch:{ all -> 0x01ed }
            float r6 = (float) r6     // Catch:{ all -> 0x01ed }
            float r6 = r6 / r7
            float r0 = (float) r0     // Catch:{ all -> 0x01ed }
            float r0 = r0 / r7
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0159
            int r0 = r4.f36606b     // Catch:{ all -> 0x01ed }
            float r0 = (float) r0     // Catch:{ all -> 0x01ed }
            float r0 = r0 / r7
            float r3 = (float) r3     // Catch:{ all -> 0x01ed }
            float r3 = r3 / r7
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0159
            r0 = 1
            goto L_0x015a
        L_0x0159:
            r0 = 0
        L_0x015a:
            if (r5 == r2) goto L_0x015d
            goto L_0x015e
        L_0x015d:
            r2 = r0
        L_0x015e:
            r0 = 8
            if (r2 == 0) goto L_0x01c7
            com.google.android.gms.internal.ads.ov0 r2 = r8.f20741q     // Catch:{ all -> 0x01ed }
            int r3 = r2.f36607c     // Catch:{ all -> 0x01ed }
            float r4 = r8.f20732i     // Catch:{ all -> 0x01ed }
            int r2 = r2.f36606b     // Catch:{ all -> 0x01ed }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ed }
            r7 = 103(0x67, float:1.44E-43)
            r6.<init>(r7)     // Catch:{ all -> 0x01ed }
            java.lang.String r7 = "Not enough space to show ad. Needs "
            r6.append(r7)     // Catch:{ all -> 0x01ed }
            float r3 = (float) r3     // Catch:{ all -> 0x01ed }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01ed }
            r6.append(r3)     // Catch:{ all -> 0x01ed }
            java.lang.String r3 = "x"
            r6.append(r3)     // Catch:{ all -> 0x01ed }
            float r2 = (float) r2     // Catch:{ all -> 0x01ed }
            float r2 = r2 / r4
            int r2 = (int) r2     // Catch:{ all -> 0x01ed }
            r6.append(r2)     // Catch:{ all -> 0x01ed }
            java.lang.String r2 = " dp, but only has "
            r6.append(r2)     // Catch:{ all -> 0x01ed }
            float r9 = (float) r9     // Catch:{ all -> 0x01ed }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01ed }
            r6.append(r9)     // Catch:{ all -> 0x01ed }
            java.lang.String r9 = "x"
            r6.append(r9)     // Catch:{ all -> 0x01ed }
            float r9 = (float) r10     // Catch:{ all -> 0x01ed }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01ed }
            r6.append(r9)     // Catch:{ all -> 0x01ed }
            java.lang.String r9 = " dp."
            r6.append(r9)     // Catch:{ all -> 0x01ed }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x01ed }
            com.google.android.gms.internal.ads.co0.zzj(r9)     // Catch:{ all -> 0x01ed }
            int r9 = r8.getVisibility()     // Catch:{ all -> 0x01ed }
            if (r9 == r0) goto L_0x01b3
            r9 = 4
            r8.setVisibility(r9)     // Catch:{ all -> 0x01ed }
        L_0x01b3:
            r8.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01ed }
            boolean r9 = r8.f20735l     // Catch:{ all -> 0x01ed }
            if (r9 != 0) goto L_0x01c5
            com.google.android.gms.internal.ads.gq r9 = r8.f20736l0     // Catch:{ all -> 0x01ed }
            r10 = 10001(0x2711, float:1.4014E-41)
            r9.mo32217c(r10)     // Catch:{ all -> 0x01ed }
            r8.f20735l = r5     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x01c5:
            monitor-exit(r8)
            return
        L_0x01c7:
            int r9 = r8.getVisibility()     // Catch:{ all -> 0x01ed }
            if (r9 == r0) goto L_0x01d0
            r8.setVisibility(r1)     // Catch:{ all -> 0x01ed }
        L_0x01d0:
            boolean r9 = r8.f20737m     // Catch:{ all -> 0x01ed }
            if (r9 != 0) goto L_0x01dd
            com.google.android.gms.internal.ads.gq r9 = r8.f20736l0     // Catch:{ all -> 0x01ed }
            r10 = 10002(0x2712, float:1.4016E-41)
            r9.mo32217c(r10)     // Catch:{ all -> 0x01ed }
            r8.f20737m = r5     // Catch:{ all -> 0x01ed }
        L_0x01dd:
            com.google.android.gms.internal.ads.ov0 r9 = r8.f20741q     // Catch:{ all -> 0x01ed }
            int r10 = r9.f36607c     // Catch:{ all -> 0x01ed }
            int r9 = r9.f36606b     // Catch:{ all -> 0x01ed }
            r8.setMeasuredDimension(r10, r9)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x01e8:
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x01ed:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ru0.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!mo18783q0()) {
            try {
                super.onPause();
            } catch (Exception e) {
                co0.zzh("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!mo18783q0()) {
            try {
                super.onResume();
            } catch (Exception e) {
                co0.zzh("Could not resume webview.", e);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f20738n.mo18268l() || this.f20738n.mo18265g()) {
            C7497ab abVar = this.f20726c;
            if (abVar != null) {
                abVar.mo30332d(motionEvent);
            }
            p10 p10 = this.f20727d;
            if (p10 != null) {
                p10.mo34036b(motionEvent);
            }
        } else {
            synchronized (this) {
                d30 d30 = this.f20704C;
                if (d30 != null) {
                    d30.mo31092a(motionEvent);
                }
            }
        }
        if (mo18783q0()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final lr2 mo18780p() {
        return this.f20734k;
    }

    /* renamed from: p0 */
    public final void mo18781p0(boolean z, int i, boolean z2) {
        this.f20738n.mo18276p0(z, i, z2);
    }

    /* renamed from: q */
    public final Context mo18782q() {
        return this.f20725b.mo33768b();
    }

    /* renamed from: q0 */
    public final synchronized boolean mo18783q0() {
        return this.f20744t;
    }

    /* renamed from: r */
    public final void mo18784r() {
        zzl h = mo18752h();
        if (h != null) {
            h.zzd();
        }
    }

    /* renamed from: r0 */
    public final void mo18785r0(int i) {
        if (i == 0) {
            w00.m39004a(this.f20712K.mo18174a(), this.f20710I, "aebb2");
        }
        m20919W0();
        this.f20712K.mo18174a();
        this.f20712K.mo18174a().mo18243d("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put(MediationMetaData.KEY_VERSION, this.f20728e.f43036b);
        mo18321Z("onhide", hashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        return;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo18786s(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f20707F     // Catch:{ all -> 0x0017 }
            r1 = 1
            if (r1 == r3) goto L_0x0007
            r1 = -1
        L_0x0007:
            int r0 = r0 + r1
            r2.f20707F = r0     // Catch:{ all -> 0x0017 }
            if (r0 > 0) goto L_0x0015
            com.google.android.gms.ads.internal.overlay.zzl r3 = r2.f20739o     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0015
            r3.zzC()     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return
        L_0x0015:
            monitor-exit(r2)
            return
        L_0x0017:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ru0.mo18786s(boolean):void");
    }

    /* renamed from: s0 */
    public final aq0 mo18787s0() {
        return null;
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof eu0) {
            this.f20738n = (eu0) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!mo18783q0()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                co0.zzh("Could not stop loading webview.", e);
            }
        }
    }

    /* renamed from: t */
    public final View mo18790t() {
        return this;
    }

    /* renamed from: t0 */
    public final mb3<String> mo18791t0() {
        p10 p10 = this.f20727d;
        if (p10 == null) {
            return bb3.m30649i(null);
        }
        return p10.mo34035a();
    }

    /* renamed from: u */
    public final synchronized d30 mo18792u() {
        return this.f20704C;
    }

    /* renamed from: u0 */
    public final /* synthetic */ mv0 mo18793u0() {
        return this.f20738n;
    }

    /* renamed from: v */
    public final void mo18794v(ir2 ir2, lr2 lr2) {
        this.f20733j = ir2;
        this.f20734k = lr2;
    }

    /* renamed from: v0 */
    public final void mo18795v0(Context context) {
        this.f20725b.setBaseContext(context);
        this.f20718Q.zze(this.f20725b.mo33767a());
    }

    /* renamed from: w0 */
    public final void mo18796w0() {
        throw null;
    }

    /* renamed from: x0 */
    public final synchronized void mo18797x0(boolean z) {
        zzl zzl = this.f20739o;
        if (zzl != null) {
            zzl.zzw(this.f20738n.zzJ(), z);
        } else {
            this.f20743s = z;
        }
    }

    /* renamed from: y */
    public final synchronized void mo18798y(C8271vo voVar) {
        this.f20706E = voVar;
    }

    /* renamed from: y0 */
    public final boolean mo18799y0(boolean z, int i) {
        destroy();
        this.f20736l0.mo32216b(new ou0(z, i));
        this.f20736l0.mo32217c(10003);
        return true;
    }

    /* renamed from: z0 */
    public final void mo18800z0(boolean z, int i, String str, String str2, boolean z2) {
        this.f20738n.mo18247B0(z, i, str, str2, z2);
    }

    public final WebView zzI() {
        return this;
    }

    public final WebViewClient zzJ() {
        return this.f20738n;
    }

    public final C7497ab zzK() {
        return this.f20726c;
    }

    public final synchronized C8271vo zzL() {
        return this.f20706E;
    }

    public final void zzX() {
        m20919W0();
        HashMap hashMap = new HashMap(1);
        hashMap.put(MediationMetaData.KEY_VERSION, this.f20728e.f43036b);
        mo18321Z("onhide", hashMap);
    }

    public final void zzZ() {
        if (this.f20709H == null) {
            w00.m39004a(this.f20712K.mo18174a(), this.f20710I, "aes2");
            this.f20712K.mo18174a();
            b10 f = e10.m20393f();
            this.f20709H = f;
            this.f20712K.mo18175b("native:view_show", f);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(MediationMetaData.KEY_VERSION, this.f20728e.f43036b);
        mo18321Z("onshow", hashMap);
    }

    public final void zza(String str) {
        throw null;
    }

    public final synchronized void zzbv() {
        com.google.android.gms.ads.internal.zzl zzl = this.f20729f;
        if (zzl != null) {
            zzl.zzbv();
        }
    }

    public final synchronized void zzbw() {
        com.google.android.gms.ads.internal.zzl zzl = this.f20729f;
        if (zzl != null) {
            zzl.zzbw();
        }
    }

    public final int zzf() {
        return this.f20715N;
    }

    public final int zzg() {
        return this.f20714M;
    }

    public final synchronized int zzh() {
        return this.f20713L;
    }

    public final int zzi() {
        return getMeasuredHeight();
    }

    public final int zzj() {
        return getMeasuredWidth();
    }

    public final Activity zzk() {
        return this.f20725b.mo33767a();
    }

    public final zza zzm() {
        return this.f20730g;
    }

    public final b10 zzn() {
        return this.f20710I;
    }

    public final c10 zzo() {
        return this.f20712K;
    }

    public final zzcjf zzp() {
        return this.f20728e;
    }

    public final void zzq() {
        eu0 eu0 = this.f20738n;
        if (eu0 != null) {
            eu0.zzq();
        }
    }

    public final synchronized uu0 zzs() {
        return this.f20750z;
    }

    public final synchronized String zzt() {
        lr2 lr2 = this.f20734k;
        if (lr2 == null) {
            return null;
        }
        return lr2.f35215b;
    }
}
