package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import p006a5.C6493p;
import p111m0.C5723u;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class eu0 extends WebViewClient implements mv0 {

    /* renamed from: D */
    public static final /* synthetic */ int f20290D = 0;

    /* renamed from: A */
    private boolean f20291A;

    /* renamed from: B */
    private final HashSet<String> f20292B;

    /* renamed from: C */
    private View.OnAttachStateChangeListener f20293C;

    /* renamed from: b */
    private final xt0 f20294b;

    /* renamed from: c */
    private final C7728gq f20295c;

    /* renamed from: d */
    private final HashMap<String, List<e70<? super xt0>>> f20296d = new HashMap<>();

    /* renamed from: e */
    private final Object f20297e = new Object();

    /* renamed from: f */
    private C7659eu f20298f;

    /* renamed from: g */
    private zzo f20299g;

    /* renamed from: h */
    private kv0 f20300h;

    /* renamed from: i */
    private lv0 f20301i;

    /* renamed from: j */
    private d60 f20302j;

    /* renamed from: k */
    private f60 f20303k;

    /* renamed from: l */
    private gi1 f20304l;

    /* renamed from: m */
    private boolean f20305m;

    /* renamed from: n */
    private boolean f20306n;
    @GuardedBy("lock")

    /* renamed from: o */
    private boolean f20307o;
    @GuardedBy("lock")

    /* renamed from: p */
    private boolean f20308p;
    @GuardedBy("lock")

    /* renamed from: q */
    private boolean f20309q;

    /* renamed from: r */
    private zzw f20310r;

    /* renamed from: s */
    private uf0 f20311s;

    /* renamed from: t */
    private zzb f20312t;

    /* renamed from: u */
    private pf0 f20313u;

    /* renamed from: v */
    protected hl0 f20314v;

    /* renamed from: w */
    private sx2 f20315w;

    /* renamed from: x */
    private boolean f20316x;

    /* renamed from: y */
    private boolean f20317y;

    /* renamed from: z */
    private int f20318z;

    public eu0(xt0 xt0, C7728gq gqVar, boolean z) {
        uf0 uf0 = new uf0(xt0, xt0.mo18782q(), new C8387yz(xt0.getContext()));
        this.f20295c = gqVar;
        this.f20294b = xt0;
        this.f20307o = z;
        this.f20311s = uf0;
        this.f20313u = null;
        this.f20292B = new HashSet<>(Arrays.asList(((String) C8311wv.m39277c().mo18570b(p00.f37053b4)).split(",")));
    }

    /* renamed from: C */
    private static final boolean m20404C(boolean z, xt0 xt0) {
        return z && !xt0.mo18765m().mo34013i() && !xt0.mo18734U().equals("interstitial_mb");
    }

    /* renamed from: n */
    private static WebResourceResponse m20407n() {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37250y0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* renamed from: r */
    private final WebResourceResponse m20408r(String str, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection;
        String str2;
        String str3;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry next : map.entrySet()) {
                        openConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        zzt.zzp().zzk(this.f20294b.getContext(), this.f20294b.zzp().f43036b, false, httpURLConnection, false, 60000);
                        bo0 bo0 = new bo0((String) null);
                        bo0.mo30738c(httpURLConnection, (byte[]) null);
                        int responseCode = httpURLConnection.getResponseCode();
                        bo0.mo30740e(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            zzt.zzp();
                            WebResourceResponse zzT = com.google.android.gms.ads.internal.util.zzt.zzT(httpURLConnection);
                        } else {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (headerField == null) {
                                throw new IOException("Missing Location header in redirect");
                            } else if (headerField.startsWith("tel:")) {
                                TrafficStats.clearThreadStatsTag();
                                return null;
                            } else {
                                URL url2 = new URL(url, headerField);
                                String protocol = url2.getProtocol();
                                if (protocol == null) {
                                    co0.zzj("Protocol is null");
                                    WebResourceResponse n = m20407n();
                                    TrafficStats.clearThreadStatsTag();
                                    return n;
                                } else if (protocol.equals("http") || protocol.equals("https")) {
                                    if (headerField.length() != 0) {
                                        str2 = "Redirecting to ".concat(headerField);
                                    } else {
                                        str2 = new String("Redirecting to ");
                                    }
                                    co0.zze(str2);
                                    httpURLConnection.disconnect();
                                    url = url2;
                                } else {
                                    if (protocol.length() != 0) {
                                        str3 = "Unsupported scheme: ".concat(protocol);
                                    } else {
                                        str3 = new String("Unsupported scheme: ");
                                    }
                                    co0.zzj(str3);
                                    return m20407n();
                                }
                            }
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            zzt.zzp();
            WebResourceResponse zzT2 = com.google.android.gms.ads.internal.util.zzt.zzT(httpURLConnection);
            TrafficStats.clearThreadStatsTag();
            return zzT2;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m20409w(Map<String, String> map, List<e70<? super xt0>> list, String str) {
        String str2;
        if (zze.zzc()) {
            if (str.length() != 0) {
                str2 = "Received GMSG: ".concat(str);
            } else {
                str2 = new String("Received GMSG: ");
            }
            zze.zza(str2);
            for (String next : map.keySet()) {
                String str3 = map.get(next);
                StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(next);
                sb.append(": ");
                sb.append(str3);
                zze.zza(sb.toString());
            }
        }
        for (e70<? super xt0> a : list) {
            a.mo18854a(this.f20294b, map);
        }
    }

    /* renamed from: x */
    private final void m20410x() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f20293C;
        if (onAttachStateChangeListener != null) {
            ((View) this.f20294b).removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m20411z(View view, hl0 hl0, int i) {
        if (hl0.zzi() && i > 0) {
            hl0.mo18142b(view);
            if (hl0.zzi()) {
                com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new zt0(this, view, hl0, i), 100);
            }
        }
    }

    /* renamed from: A0 */
    public final void mo18246A0(boolean z) {
        synchronized (this.f20297e) {
            this.f20308p = true;
        }
    }

    /* renamed from: B0 */
    public final void mo18247B0(boolean z, int i, String str, String str2, boolean z2) {
        C7659eu euVar;
        du0 du0;
        gi1 gi1;
        boolean S = this.f20294b.mo18732S();
        boolean C = m20404C(S, this.f20294b);
        boolean z3 = true;
        if (!C && z2) {
            z3 = false;
        }
        if (C) {
            euVar = null;
        } else {
            euVar = this.f20298f;
        }
        if (S) {
            du0 = null;
        } else {
            du0 = new du0(this.f20294b, this.f20299g);
        }
        d60 d60 = this.f20302j;
        f60 f60 = this.f20303k;
        zzw zzw = this.f20310r;
        xt0 xt0 = this.f20294b;
        zzcjf zzp = xt0.zzp();
        if (z3) {
            gi1 = null;
        } else {
            gi1 = this.f20304l;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(euVar, (zzo) du0, d60, f60, zzw, xt0, z, i, str, str2, zzp, gi1);
        mo18277s0(adOverlayInfoParcel);
    }

    /* renamed from: D0 */
    public final void mo18248D0(lv0 lv0) {
        this.f20301i = lv0;
    }

    /* renamed from: E */
    public final void mo18249E(C7659eu euVar, d60 d60, zzo zzo, f60 f60, zzw zzw, boolean z, h70 h70, zzb zzb, wf0 wf0, hl0 hl0, f42 f42, sx2 sx2, nv1 nv1, nw2 nw2, f70 f70, gi1 gi1) {
        d60 d602 = d60;
        f60 f602 = f60;
        h70 h702 = h70;
        wf0 wf02 = wf0;
        hl0 hl02 = hl0;
        f42 f422 = f42;
        sx2 sx22 = sx2;
        f70 f702 = f70;
        gi1 gi12 = gi1;
        zzb zzb2 = zzb == null ? new zzb(this.f20294b.getContext(), hl02, (zzcde) null) : zzb;
        this.f20313u = new pf0(this.f20294b, wf02);
        this.f20314v = hl02;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36872F0)).booleanValue()) {
            mo18250E0("/adMetadata", new c60(d602));
        }
        if (f602 != null) {
            mo18250E0("/appEvent", new e60(f602));
        }
        mo18250E0("/backButton", d70.f30663j);
        mo18250E0("/refresh", d70.f30664k);
        mo18250E0("/canOpenApp", d70.f30655b);
        mo18250E0("/canOpenURLs", d70.f30654a);
        mo18250E0("/canOpenIntents", d70.f30656c);
        mo18250E0("/close", d70.f30657d);
        mo18250E0("/customClose", d70.f30658e);
        mo18250E0("/instrument", d70.f30667n);
        mo18250E0("/delayPageLoaded", d70.f30669p);
        mo18250E0("/delayPageClosed", d70.f30670q);
        mo18250E0("/getLocationInfo", d70.f30671r);
        mo18250E0("/log", d70.f30660g);
        mo18250E0("/mraid", new m70(zzb2, this.f20313u, wf02));
        uf0 uf0 = this.f20311s;
        if (uf0 != null) {
            mo18250E0("/mraidLoaded", uf0);
        }
        q70 q70 = r4;
        q70 q702 = new q70(zzb2, this.f20313u, f42, nv1, nw2);
        mo18250E0("/open", q70);
        mo18250E0("/precache", new ns0());
        mo18250E0("/touch", d70.f30662i);
        mo18250E0("/video", d70.f30665l);
        mo18250E0("/videoMeta", d70.f30666m);
        if (f422 == null || sx22 == null) {
            mo18250E0("/click", d70.m31258a(gi1));
            mo18250E0("/httpTrack", d70.f30659f);
        } else {
            mo18250E0("/click", new hs2(gi12, sx22, f422));
            mo18250E0("/httpTrack", new is2(sx22, f422));
        }
        if (zzt.zzn().mo18501z(this.f20294b.getContext())) {
            mo18250E0("/logScionEvent", new k70(this.f20294b.getContext()));
        }
        if (h702 != null) {
            mo18250E0("/setInterstitialProperties", new g70(h702, (byte[]) null));
        }
        if (f702 != null) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36838A6)).booleanValue()) {
                mo18250E0("/inspectorNetworkExtras", f702);
            }
        }
        this.f20298f = euVar;
        this.f20299g = zzo;
        this.f20302j = d602;
        this.f20303k = f602;
        this.f20310r = zzw;
        this.f20312t = zzb2;
        this.f20304l = gi12;
        this.f20305m = z;
        this.f20315w = sx22;
    }

    /* renamed from: E0 */
    public final void mo18250E0(String str, e70<? super xt0> e70) {
        synchronized (this.f20297e) {
            List list = this.f20296d.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f20296d.put(str, list);
            }
            list.add(e70);
        }
    }

    /* renamed from: F0 */
    public final void mo18251F0(kv0 kv0) {
        this.f20300h = kv0;
    }

    /* renamed from: G */
    public final ViewTreeObserver.OnGlobalLayoutListener mo18252G() {
        synchronized (this.f20297e) {
        }
        return null;
    }

    /* renamed from: G0 */
    public final void mo18253G0() {
        hl0 hl0 = this.f20314v;
        if (hl0 != null) {
            hl0.zze();
            this.f20314v = null;
        }
        m20410x();
        synchronized (this.f20297e) {
            this.f20296d.clear();
            this.f20298f = null;
            this.f20299g = null;
            this.f20300h = null;
            this.f20301i = null;
            this.f20302j = null;
            this.f20303k = null;
            this.f20305m = false;
            this.f20307o = false;
            this.f20308p = false;
            this.f20310r = null;
            this.f20312t = null;
            this.f20311s = null;
            pf0 pf0 = this.f20313u;
            if (pf0 != null) {
                pf0.mo34116h(true);
                this.f20313u = null;
            }
            this.f20315w = null;
        }
    }

    /* renamed from: I */
    public final ViewTreeObserver.OnScrollChangedListener mo18254I() {
        synchronized (this.f20297e) {
        }
        return null;
    }

    /* renamed from: J */
    public final void mo18255J(boolean z) {
        synchronized (this.f20297e) {
            this.f20309q = z;
        }
    }

    /* renamed from: K */
    public final void mo18256K(int i, int i2, boolean z) {
        uf0 uf0 = this.f20311s;
        if (uf0 != null) {
            uf0.mo35187h(i, i2);
        }
        pf0 pf0 = this.f20313u;
        if (pf0 != null) {
            pf0.mo34118j(i, i2, false);
        }
    }

    /* renamed from: L */
    public final void mo18257L(int i, int i2) {
        pf0 pf0 = this.f20313u;
        if (pf0 != null) {
            pf0.mo34119k(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final WebResourceResponse mo18258M(String str, Map<String, String> map) {
        zzbah b;
        try {
            if (f20.f31577a.mo34648e().booleanValue()) {
                if (this.f20315w != null && "oda".equals(Uri.parse(str).getScheme())) {
                    this.f20315w.mo34829b(str);
                    return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
                }
            }
            String c = mm0.m34822c(str, this.f20294b.getContext(), this.f20291A);
            if (!c.equals(str)) {
                return m20408r(c, map);
            }
            zzbak C0 = zzbak.m40638C0(Uri.parse(str));
            if (C0 != null && (b = zzt.zzc().mo34375b(C0)) != null && b.mo36231G0()) {
                return new WebResourceResponse("", "", b.mo36229E0());
            }
            if (!bo0.m30771l() || !b20.f29869b.mo34648e().booleanValue()) {
                return null;
            }
            return m20408r(str, map);
        } catch (Exception | NoClassDefFoundError e) {
            zzt.zzo().mo18592s(e, "AdWebViewClient.interceptRequest");
            return m20407n();
        }
    }

    /* renamed from: Z */
    public final void mo18259Z() {
        if (this.f20300h != null && ((this.f20316x && this.f20318z <= 0) || this.f20317y || this.f20306n)) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37194r1)).booleanValue() && this.f20294b.zzo() != null) {
                w00.m39004a(this.f20294b.zzo().mo18174a(), this.f20294b.zzn(), "awfllc");
            }
            kv0 kv0 = this.f20300h;
            boolean z = false;
            if (!this.f20317y && !this.f20306n) {
                z = true;
            }
            kv0.zza(z);
            this.f20300h = null;
        }
        this.f20294b.mo18733T();
    }

    /* renamed from: a */
    public final void mo18260a(boolean z) {
        this.f20305m = false;
    }

    /* renamed from: c */
    public final void mo18261c(String str, e70<? super xt0> e70) {
        synchronized (this.f20297e) {
            List list = this.f20296d.get(str);
            if (list != null) {
                list.remove(e70);
            }
        }
    }

    /* renamed from: d */
    public final void mo18262d(String str, C6493p<e70<? super xt0>> pVar) {
        synchronized (this.f20297e) {
            List<e70> list = this.f20296d.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (e70 e70 : list) {
                    if (pVar.apply(e70)) {
                        arrayList.add(e70);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    /* renamed from: e0 */
    public final void mo18263e0(boolean z) {
        this.f20291A = z;
    }

    /* renamed from: f */
    public final void mo18264f() {
        synchronized (this.f20297e) {
            this.f20305m = false;
            this.f20307o = true;
            po0.f37726e.execute(new yt0(this));
        }
    }

    /* renamed from: g */
    public final boolean mo18265g() {
        boolean z;
        synchronized (this.f20297e) {
            z = this.f20309q;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final /* synthetic */ void mo18266h0() {
        this.f20294b.mo18751g0();
        zzl h = this.f20294b.mo18752h();
        if (h != null) {
            h.zzx();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final /* synthetic */ void mo18267j0(View view, hl0 hl0, int i) {
        m20411z(view, hl0, i - 1);
    }

    /* renamed from: l */
    public final boolean mo18268l() {
        boolean z;
        synchronized (this.f20297e) {
            z = this.f20308p;
        }
        return z;
    }

    /* renamed from: m0 */
    public final void mo18269m0(Uri uri) {
        String str;
        String path = uri.getPath();
        List list = this.f20296d.get(path);
        if (path == null || list == null) {
            zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37108h5)).booleanValue() && zzt.zzo().mo18581f() != null) {
                po0.f37722a.execute(new au0((path == null || path.length() < 2) ? "null" : path.substring(1)));
                return;
            }
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37044a4)).booleanValue() && this.f20292B.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) C8311wv.m39277c().mo18570b(p00.f37062c4)).intValue()) {
                if (path.length() != 0) {
                    str = "Parsing gmsg query params on BG thread: ".concat(path);
                } else {
                    str = new String("Parsing gmsg query params on BG thread: ");
                }
                zze.zza(str);
                bb3.m30658r(zzt.zzp().zzb(uri), new cu0(this, list, path, uri), po0.f37726e);
                return;
            }
        }
        zzt.zzp();
        m20409w(com.google.android.gms.ads.internal.util.zzt.zzS(uri), list, path);
    }

    /* renamed from: n0 */
    public final void mo18270n0(zzc zzc, boolean z) {
        gi1 gi1;
        boolean S = this.f20294b.mo18732S();
        boolean C = m20404C(S, this.f20294b);
        boolean z2 = true;
        if (!C && z) {
            z2 = false;
        }
        C7659eu euVar = C ? null : this.f20298f;
        zzo zzo = S ? null : this.f20299g;
        zzw zzw = this.f20310r;
        zzcjf zzp = this.f20294b.zzp();
        xt0 xt0 = this.f20294b;
        if (z2) {
            gi1 = null;
        } else {
            gi1 = this.f20304l;
        }
        mo18277s0(new AdOverlayInfoParcel(zzc, euVar, zzo, zzw, zzp, xt0, gi1));
    }

    /* renamed from: o0 */
    public final void mo18271o0(zzbv zzbv, f42 f42, nv1 nv1, nw2 nw2, String str, String str2, int i) {
        xt0 xt0 = this.f20294b;
        mo18277s0(new AdOverlayInfoParcel(xt0, xt0.zzp(), zzbv, f42, nv1, nw2, str, str2, i));
    }

    public final void onAdClicked() {
        C7659eu euVar = this.f20298f;
        if (euVar != null) {
            euVar.onAdClicked();
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Loading resource: ".concat(valueOf);
        } else {
            str2 = new String("Loading resource: ");
        }
        zze.zza(str2);
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            mo18269m0(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1.zza();
        r0.f20301i = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        mo18259Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.f20316x = true;
        r1 = r0.f20301i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.f20297e
            monitor-enter(r1)
            com.google.android.gms.internal.ads.xt0 r2 = r0.f20294b     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.mo18783q0()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.ads.internal.util.zze.zza(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.internal.ads.xt0 r2 = r0.f20294b     // Catch:{ all -> 0x0029 }
            r2.mo18711A()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r1 = 1
            r0.f20316x = r1
            com.google.android.gms.internal.ads.lv0 r1 = r0.f20301i
            if (r1 == 0) goto L_0x0025
            r1.zza()
            r1 = 0
            r0.f20301i = r1
        L_0x0025:
            r0.mo18259Z()
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eu0.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f20306n = true;
    }

    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f20294b.mo18799y0(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    /* renamed from: p0 */
    public final void mo18276p0(boolean z, int i, boolean z2) {
        gi1 gi1;
        boolean C = m20404C(this.f20294b.mo18732S(), this.f20294b);
        boolean z3 = true;
        if (!C && z2) {
            z3 = false;
        }
        C7659eu euVar = C ? null : this.f20298f;
        zzo zzo = this.f20299g;
        zzw zzw = this.f20310r;
        xt0 xt0 = this.f20294b;
        zzcjf zzp = xt0.zzp();
        if (z3) {
            gi1 = null;
        } else {
            gi1 = this.f20304l;
        }
        mo18277s0(new AdOverlayInfoParcel(euVar, zzo, zzw, xt0, z, i, zzp, gi1));
    }

    /* renamed from: s0 */
    public final void mo18277s0(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzc;
        pf0 pf0 = this.f20313u;
        boolean l = pf0 != null ? pf0.mo34120l() : false;
        zzt.zzj();
        zzm.zza(this.f20294b.getContext(), adOverlayInfoParcel, !l);
        hl0 hl0 = this.f20314v;
        if (hl0 != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzc = adOverlayInfoParcel.zza) != null) {
                str = zzc.zzb;
            }
            hl0.mo18145w(str);
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo18258M(str, Collections.emptyMap());
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case TsExtractor.TS_STREAM_TYPE_AC3 /*129*/:
                    case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /*130*/:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "AdWebView shouldOverrideUrlLoading: ".concat(valueOf);
        } else {
            str2 = new String("AdWebView shouldOverrideUrlLoading: ");
        }
        zze.zza(str2);
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.f20305m && webView == this.f20294b.zzI()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    C7659eu euVar = this.f20298f;
                    if (euVar != null) {
                        euVar.onAdClicked();
                        hl0 hl0 = this.f20314v;
                        if (hl0 != null) {
                            hl0.mo18145w(str);
                        }
                        this.f20298f = null;
                    }
                    gi1 gi1 = this.f20304l;
                    if (gi1 != null) {
                        gi1.zzq();
                        this.f20304l = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f20294b.zzI().willNotDraw()) {
                try {
                    C7497ab zzK = this.f20294b.zzK();
                    if (zzK != null && zzK.mo30334f(parse)) {
                        Context context = this.f20294b.getContext();
                        xt0 xt0 = this.f20294b;
                        parse = zzK.mo30329a(parse, context, (View) xt0, xt0.zzk());
                    }
                } catch (C7533bb unused) {
                    String valueOf2 = String.valueOf(str);
                    co0.zzj(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                zzb zzb = this.f20312t;
                if (zzb == null || zzb.zzc()) {
                    mo18270n0(new zzc("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (zzu) null), true);
                } else {
                    this.f20312t.zzb(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                co0.zzj(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        } else {
            mo18269m0(parse);
        }
        return true;
    }

    /* renamed from: z0 */
    public final void mo18281z0(boolean z, int i, String str, boolean z2) {
        C7659eu euVar;
        du0 du0;
        gi1 gi1;
        boolean S = this.f20294b.mo18732S();
        boolean C = m20404C(S, this.f20294b);
        boolean z3 = true;
        if (!C && z2) {
            z3 = false;
        }
        if (C) {
            euVar = null;
        } else {
            euVar = this.f20298f;
        }
        if (S) {
            du0 = null;
        } else {
            du0 = new du0(this.f20294b, this.f20299g);
        }
        d60 d60 = this.f20302j;
        f60 f60 = this.f20303k;
        zzw zzw = this.f20310r;
        xt0 xt0 = this.f20294b;
        zzcjf zzp = xt0.zzp();
        if (z3) {
            gi1 = null;
        } else {
            gi1 = this.f20304l;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(euVar, du0, d60, f60, zzw, xt0, z, i, str, zzp, gi1);
        mo18277s0(adOverlayInfoParcel);
    }

    public final boolean zzJ() {
        boolean z;
        synchronized (this.f20297e) {
            z = this.f20307o;
        }
        return z;
    }

    public final zzb zzd() {
        return this.f20312t;
    }

    public final void zzj() {
        C7728gq gqVar = this.f20295c;
        if (gqVar != null) {
            gqVar.mo32217c(10005);
        }
        this.f20317y = true;
        mo18259Z();
        this.f20294b.destroy();
    }

    public final void zzk() {
        synchronized (this.f20297e) {
        }
        this.f20318z++;
        mo18259Z();
    }

    public final void zzl() {
        this.f20318z--;
        mo18259Z();
    }

    public final void zzp() {
        hl0 hl0 = this.f20314v;
        if (hl0 != null) {
            WebView zzI = this.f20294b.zzI();
            if (C5723u.m25293S(zzI)) {
                m20411z(zzI, hl0, 10);
                return;
            }
            m20410x();
            bu0 bu0 = new bu0(this, hl0);
            this.f20293C = bu0;
            ((View) this.f20294b).addOnAttachStateChangeListener(bu0);
        }
    }

    public final void zzq() {
        gi1 gi1 = this.f20304l;
        if (gi1 != null) {
            gi1.zzq();
        }
    }
}
