package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.internal.ads.C4617ou;
import com.google.android.gms.internal.ads.C7497ab;
import com.google.android.gms.internal.ads.C7533bb;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.bb3;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.dg1;
import com.google.android.gms.internal.ads.ir1;
import com.google.android.gms.internal.ads.mb3;
import com.google.android.gms.internal.ads.mv1;
import com.google.android.gms.internal.ads.mw2;
import com.google.android.gms.internal.ads.nb3;
import com.google.android.gms.internal.ads.nv1;
import com.google.android.gms.internal.ads.nw2;
import com.google.android.gms.internal.ads.oh0;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.sa3;
import com.google.android.gms.internal.ads.ss2;
import com.google.android.gms.internal.ads.sx2;
import com.google.android.gms.internal.ads.tm0;
import com.google.android.gms.internal.ads.uv0;
import com.google.android.gms.internal.ads.vm0;
import com.google.android.gms.internal.ads.w91;
import com.google.android.gms.internal.ads.zr2;
import com.google.android.gms.internal.ads.zzbfd;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzcco;
import com.google.android.gms.internal.ads.zzchx;
import com.google.android.gms.internal.ads.zzcjf;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p198d5.C10487a;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzv extends vm0 {

    /* renamed from: A */
    protected static final List<String> f28085A = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));

    /* renamed from: B */
    protected static final List<String> f28086B = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion"}));

    /* renamed from: C */
    protected static final List<String> f28087C = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));

    /* renamed from: z */
    protected static final List<String> f28088z = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click"}));
    public static final /* synthetic */ int zze = 0;

    /* renamed from: b */
    private final uv0 f28089b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f28090c;

    /* renamed from: d */
    private final C7497ab f28091d;

    /* renamed from: e */
    private final ss2<ir1> f28092e;

    /* renamed from: f */
    private final nb3 f28093f;

    /* renamed from: g */
    private final ScheduledExecutorService f28094g;

    /* renamed from: h */
    private zzcco f28095h;

    /* renamed from: i */
    private Point f28096i = new Point();

    /* renamed from: j */
    private Point f28097j = new Point();

    /* renamed from: k */
    private final Set<WebView> f28098k = Collections.newSetFromMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final zzb f28099l;

    /* renamed from: m */
    private final nv1 f28100m;

    /* renamed from: n */
    private final nw2 f28101n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final sx2 f28102o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final boolean f28103p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final boolean f28104q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final boolean f28105r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final boolean f28106s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final String f28107t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final String f28108u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final AtomicInteger f28109v = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final zzcjf f28110w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public String f28111x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final String f28112y;

    public zzv(uv0 uv0, Context context, C7497ab abVar, ss2<ir1> ss2, nb3 nb3, ScheduledExecutorService scheduledExecutorService, nv1 nv1, nw2 nw2, sx2 sx2, zzcjf zzcjf) {
        this.f28089b = uv0;
        this.f28090c = context;
        this.f28091d = abVar;
        this.f28092e = ss2;
        this.f28093f = nb3;
        this.f28094g = scheduledExecutorService;
        this.f28099l = uv0.mo35299u();
        this.f28100m = nv1;
        this.f28101n = nw2;
        this.f28102o = sx2;
        this.f28110w = zzcjf;
        this.f28103p = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37255y5)).booleanValue();
        this.f28104q = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37247x5)).booleanValue();
        this.f28105r = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37263z5)).booleanValue();
        this.f28106s = ((Boolean) C8311wv.m39277c().mo18570b(p00.f36845B5)).booleanValue();
        this.f28107t = (String) C8311wv.m39277c().mo18570b(p00.f36837A5);
        this.f28108u = (String) C8311wv.m39277c().mo18570b(p00.f36853C5);
        this.f28112y = (String) C8311wv.m39277c().mo18570b(p00.f36861D5);
    }

    /* renamed from: O6 */
    static /* bridge */ /* synthetic */ void m28891O6(zzv zzv, String str, String str2, String str3) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37207s5)).booleanValue()) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37190q6)).booleanValue()) {
                nw2 nw2 = zzv.f28101n;
                mw2 b = mw2.m34936b(str);
                b.mo33603a(str2, str3);
                nw2.mo31048a(b);
                return;
            }
            mv1 a = zzv.f28100m.mo33772a();
            a.mo33597b("action", str);
            a.mo33597b(str2, str3);
            a.mo33601f();
        }
    }

    /* renamed from: r6 */
    static boolean m28896r6(Uri uri) {
        return m28901w6(uri, f28086B, f28087C);
    }

    /* renamed from: s6 */
    static final /* synthetic */ Uri m28897s6(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? m28902x6(uri, "nas", str) : uri;
    }

    /* renamed from: t6 */
    static final /* synthetic */ ArrayList m28898t6(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!m28896r6(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(m28902x6(uri, "nas", str));
            }
        }
        return arrayList;
    }

    /* renamed from: u6 */
    private final zzg m28899u6(Context context, String str, String str2, zzbfi zzbfi, zzbfd zzbfd) {
        zzf v = this.f28089b.mo35300v();
        w91 w91 = new w91();
        w91.mo35591c(context);
        zr2 zr2 = new zr2();
        if (str == null) {
            str = "adUnitId";
        }
        zr2.mo36103H(str);
        if (zzbfd == null) {
            zzbfd = new C4617ou().mo18612a();
        }
        zr2.mo36114d(zzbfd);
        if (zzbfi == null) {
            zzbfi = new zzbfi();
        }
        zr2.mo36102G(zzbfi);
        w91.mo35594f(zr2.mo36116f());
        v.zza(w91.mo35595g());
        zzx zzx = new zzx();
        zzx.zza(str2);
        v.zzb(new zzz(zzx, (zzy) null));
        new dg1();
        return v.zzc();
    }

    /* renamed from: v6 */
    private final mb3<String> m28900v6(String str) {
        ir1[] ir1Arr = new ir1[1];
        mb3<O> n = bb3.m30654n(this.f28092e.mo34783a(), new zzn(this, ir1Arr, str), this.f28093f);
        n.zzc(new zzo(this, ir1Arr), this.f28093f);
        return bb3.m30646f(bb3.m30653m((sa3) bb3.m30655o(sa3.m37369D(n), (long) ((Integer) C8311wv.m39277c().mo18570b(p00.f36877F5)).intValue(), TimeUnit.MILLISECONDS, this.f28094g), zzk.zza, this.f28093f), Exception.class, zzj.zza, this.f28093f);
    }

    /* renamed from: w6 */
    private static boolean m28901w6(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (!(host == null || path == null)) {
            for (String contains : list) {
                if (path.contains(contains)) {
                    for (String endsWith : list2) {
                        if (host.endsWith(endsWith)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: x6 */
    public static final Uri m28902x6(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f21089c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzK() {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzcco r0 = r1.f28095h
            if (r0 == 0) goto L_0x0010
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r0 = r0.f21089c
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzK():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A6 */
    public final /* synthetic */ Uri mo28906A6(Uri uri, C10487a aVar) throws Exception {
        try {
            uri = this.f28091d.mo30329a(uri, this.f28090c, (View) C10489b.m48194f3(aVar), (Activity) null);
        } catch (C7533bb e) {
            co0.zzk("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E6 */
    public final /* synthetic */ mb3 mo28907E6(ir1[] ir1Arr, String str, ir1 ir1) throws Exception {
        ir1Arr[0] = ir1;
        Context context = this.f28090c;
        zzcco zzcco = this.f28095h;
        Map<String, WeakReference<View>> map = zzcco.f21089c;
        JSONObject zzd = zzcb.zzd(context, map, map, zzcco.f21088b);
        JSONObject zzg = zzcb.zzg(this.f28090c, this.f28095h.f21088b);
        JSONObject zzf = zzcb.zzf(this.f28095h.f21088b);
        JSONObject zze2 = zzcb.zze(this.f28090c, this.f28095h.f21088b);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd);
        jSONObject.put("ad_view_signal", zzg);
        jSONObject.put("scroll_view_signal", zzf);
        jSONObject.put("lock_screen_signal", zze2);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", zzcb.zzc((String) null, this.f28090c, this.f28097j, this.f28096i));
        }
        return ir1.mo32753d(str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F6 */
    public final /* synthetic */ mb3 mo28908F6(Uri uri) throws Exception {
        return bb3.m30653m(m28900v6("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzh(this, uri), this.f28093f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G6 */
    public final /* synthetic */ mb3 mo28909G6(ArrayList arrayList) throws Exception {
        return bb3.m30653m(m28900v6("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzi(this, arrayList), this.f28093f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L6 */
    public final /* synthetic */ ArrayList mo28910L6(List list, C10487a aVar) throws Exception {
        String zzh = this.f28091d.mo30331c() != null ? this.f28091d.mo30331c().zzh(this.f28090c, (View) C10489b.m48194f3(aVar), (Activity) null) : "";
        if (!TextUtils.isEmpty(zzh)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!m28896r6(uri)) {
                    co0.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                    arrayList.add(uri);
                } else {
                    arrayList.add(m28902x6(uri, "ms", zzh));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P6 */
    public final /* synthetic */ void mo28911P6(ir1[] ir1Arr) {
        ir1 ir1 = ir1Arr[0];
        if (ir1 != null) {
            this.f28092e.mo34784b(bb3.m30649i(ir1));
        }
    }

    public final void zze(C10487a aVar, zzchx zzchx, tm0 tm0) {
        Context context = (Context) C10489b.m48194f3(aVar);
        this.f28090c = context;
        bb3.m30658r(m28899u6(context, zzchx.f21162b, zzchx.f21163c, zzchx.f21164d, zzchx.f21165e).zza(), new zzr(this, tm0), this.f28089b.mo35285d());
    }

    public final void zzf(zzcco zzcco) {
        this.f28095h = zzcco;
        this.f28092e.mo34785c(1);
    }

    @SuppressLint({"AddJavascriptInterface"})
    public final void zzg(C10487a aVar) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36982S6)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 21) {
                co0.zzj("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
                return;
            }
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36990T6)).booleanValue()) {
                bb3.m30658r(m28899u6(this.f28090c, (String) null, AdFormat.BANNER.name(), (zzbfi) null, (zzbfd) null).zza(), new zzu(this), this.f28089b.mo35285d());
            }
            WebView webView = (WebView) C10489b.m48194f3(aVar);
            if (webView == null) {
                co0.zzg("The webView cannot be null.");
            } else if (this.f28098k.contains(webView)) {
                co0.zzi("This webview has already been registered.");
            } else {
                this.f28098k.add(webView);
                webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.f28091d), "gmaSdk");
            }
        }
    }

    public final void zzh(C10487a aVar) {
        View view;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36869E5)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) C10489b.m48194f3(aVar);
            zzcco zzcco = this.f28095h;
            if (zzcco == null) {
                view = null;
            } else {
                view = zzcco.f21088b;
            }
            this.f28096i = zzcb.zza(motionEvent, view);
            if (motionEvent.getAction() == 0) {
                this.f28097j = this.f28096i;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.f28096i;
            obtain.setLocation((float) point.x, (float) point.y);
            this.f28091d.mo30332d(obtain);
            obtain.recycle();
        }
    }

    public final void zzi(List<Uri> list, C10487a aVar, oh0 oh0) {
        try {
            if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36869E5)).booleanValue()) {
                oh0.mo33543b("The updating URL feature is not enabled.");
            } else if (list.size() != 1) {
                oh0.mo33543b("There should be only 1 click URL.");
            } else {
                Uri uri = list.get(0);
                if (!m28901w6(uri, f28088z, f28085A)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    co0.zzj(sb.toString());
                    oh0.mo33544y1(list);
                    return;
                }
                mb3 b = this.f28093f.mo33675b(new zzp(this, uri, aVar));
                if (zzK()) {
                    b = bb3.m30654n(b, new zzl(this), this.f28093f);
                } else {
                    co0.zzi("Asset view map is empty.");
                }
                bb3.m30658r(b, new zzt(this, oh0), this.f28089b.mo35285d());
            }
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final void zzj(List<Uri> list, C10487a aVar, oh0 oh0) {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36869E5)).booleanValue()) {
            try {
                oh0.mo33543b("The updating URL feature is not enabled.");
            } catch (RemoteException e) {
                co0.zzh("", e);
            }
        } else {
            mb3 b = this.f28093f.mo33675b(new zzq(this, list, aVar));
            if (zzK()) {
                b = bb3.m30654n(b, new zzm(this), this.f28093f);
            } else {
                co0.zzi("Asset view map is empty.");
            }
            bb3.m30658r(b, new zzs(this, oh0), this.f28089b.mo35285d());
        }
    }
}
