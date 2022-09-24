package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.C6540C;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzaf;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p006a5.C6493p;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nu0 extends FrameLayout implements xt0 {

    /* renamed from: b */
    private final xt0 f36135b;

    /* renamed from: c */
    private final aq0 f36136c;

    /* renamed from: d */
    private final AtomicBoolean f36137d = new AtomicBoolean();

    public nu0(xt0 xt0) {
        super(xt0.getContext());
        this.f36135b = xt0;
        this.f36136c = new aq0(xt0.mo18782q(), this, this);
        addView((View) xt0);
    }

    /* renamed from: A */
    public final void mo18711A() {
        this.f36136c.mo30467d();
        this.f36135b.mo18711A();
    }

    /* renamed from: B */
    public final void mo18712B(zzl zzl) {
        this.f36135b.mo18712B(zzl);
    }

    /* renamed from: C */
    public final void mo18713C(boolean z) {
        this.f36135b.mo18713C(false);
    }

    /* renamed from: C0 */
    public final void mo18714C0(d30 d30) {
        this.f36135b.mo18714C0(d30);
    }

    /* renamed from: D */
    public final boolean mo18715D() {
        return this.f36135b.mo18715D();
    }

    /* renamed from: E0 */
    public final void mo18317E0(String str, JSONObject jSONObject) {
        ((ru0) this.f36135b).mo18325g(str, jSONObject.toString());
    }

    /* renamed from: F */
    public final void mo18716F() {
        TextView textView = new TextView(getContext());
        zzt.zzp();
        textView.setText(com.google.android.gms.ads.internal.util.zzt.zzD());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    /* renamed from: H */
    public final void mo18717H(boolean z) {
        this.f36135b.mo18717H(z);
    }

    /* renamed from: I */
    public final void mo18719I(int i) {
        this.f36135b.mo18719I(i);
    }

    /* renamed from: M */
    public final void mo18722M(int i) {
        this.f36136c.mo30469f(i);
    }

    /* renamed from: N */
    public final void mo18724N(int i) {
        this.f36135b.mo18724N(i);
    }

    /* renamed from: O */
    public final void mo18726O(String str, e70<? super xt0> e70) {
        this.f36135b.mo18726O(str, e70);
    }

    /* renamed from: P */
    public final void mo18728P(String str, e70<? super xt0> e70) {
        this.f36135b.mo18728P(str, e70);
    }

    /* renamed from: Q */
    public final void mo18730Q(boolean z, int i, String str, boolean z2) {
        this.f36135b.mo18730Q(z, i, str, z2);
    }

    /* renamed from: R */
    public final void mo18731R(int i) {
        this.f36135b.mo18731R(i);
    }

    /* renamed from: S */
    public final boolean mo18732S() {
        return this.f36135b.mo18732S();
    }

    /* renamed from: T */
    public final void mo18733T() {
        this.f36135b.mo18733T();
    }

    /* renamed from: U */
    public final String mo18734U() {
        return this.f36135b.mo18734U();
    }

    /* renamed from: V */
    public final void mo18735V(boolean z) {
        this.f36135b.mo18735V(z);
    }

    /* renamed from: W */
    public final void mo18736W(b30 b30) {
        this.f36135b.mo18736W(b30);
    }

    /* renamed from: X */
    public final boolean mo18737X() {
        return this.f36137d.get();
    }

    /* renamed from: Y */
    public final void mo18738Y(boolean z) {
        this.f36135b.mo18738Y(z);
    }

    /* renamed from: Z */
    public final void mo18321Z(String str, Map<String, ?> map) {
        this.f36135b.mo18321Z(str, map);
    }

    /* renamed from: a */
    public final void mo18322a(String str, JSONObject jSONObject) {
        this.f36135b.mo18322a(str, jSONObject);
    }

    /* renamed from: a0 */
    public final void mo18739a0() {
        setBackgroundColor(0);
        this.f36135b.setBackgroundColor(0);
    }

    /* renamed from: b */
    public final ir2 mo18740b() {
        return this.f36135b.mo18740b();
    }

    /* renamed from: b0 */
    public final void mo18741b0(C10487a aVar) {
        this.f36135b.mo18741b0(aVar);
    }

    /* renamed from: c0 */
    public final void mo18742c0(zzl zzl) {
        this.f36135b.mo18742c0(zzl);
    }

    public final boolean canGoBack() {
        return this.f36135b.canGoBack();
    }

    /* renamed from: d */
    public final void mo18743d() {
        this.f36135b.mo18743d();
    }

    /* renamed from: d0 */
    public final void mo18744d0(String str, String str2, String str3) {
        this.f36135b.mo18744d0(str, str2, (String) null);
    }

    public final void destroy() {
        C10487a l0 = mo18761l0();
        if (l0 != null) {
            d33 d33 = com.google.android.gms.ads.internal.util.zzt.zza;
            d33.post(new mu0(l0));
            xt0 xt0 = this.f36135b;
            xt0.getClass();
            d33.postDelayed(new lu0(xt0), (long) ((Integer) C8311wv.m39277c().mo18570b(p00.f36851C3)).intValue());
            return;
        }
        this.f36135b.destroy();
    }

    /* renamed from: e */
    public final boolean mo18746e() {
        return this.f36135b.mo18746e();
    }

    /* renamed from: e0 */
    public final void mo18747e0(int i) {
        this.f36135b.mo18747e0(i);
    }

    /* renamed from: f0 */
    public final void mo18749f0(String str, C6493p<e70<? super xt0>> pVar) {
        this.f36135b.mo18749f0(str, pVar);
    }

    /* renamed from: g */
    public final void mo18325g(String str, String str2) {
        this.f36135b.mo18325g("window.inspectorInfo", str2);
    }

    /* renamed from: g0 */
    public final void mo18751g0() {
        this.f36135b.mo18751g0();
    }

    public final void goBack() {
        this.f36135b.goBack();
    }

    /* renamed from: h */
    public final zzl mo18752h() {
        return this.f36135b.mo18752h();
    }

    /* renamed from: h0 */
    public final void mo18753h0(zzbv zzbv, f42 f42, nv1 nv1, nw2 nw2, String str, String str2, int i) {
        this.f36135b.mo18753h0(zzbv, f42, nv1, nw2, str, str2, i);
    }

    /* renamed from: i */
    public final zzl mo18754i() {
        return this.f36135b.mo18754i();
    }

    /* renamed from: i0 */
    public final void mo18755i0(boolean z) {
        this.f36135b.mo18755i0(z);
    }

    /* renamed from: j */
    public final boolean mo18756j() {
        return this.f36135b.mo18756j();
    }

    /* renamed from: j0 */
    public final void mo18757j0(zzc zzc, boolean z) {
        this.f36135b.mo18757j0(zzc, z);
    }

    /* renamed from: k */
    public final void mo18758k(uu0 uu0) {
        this.f36135b.mo18758k(uu0);
    }

    /* renamed from: k0 */
    public final void mo18759k0(ov0 ov0) {
        this.f36135b.mo18759k0(ov0);
    }

    /* renamed from: l */
    public final ms0 mo18760l(String str) {
        return this.f36135b.mo18760l(str);
    }

    /* renamed from: l0 */
    public final C10487a mo18761l0() {
        return this.f36135b.mo18761l0();
    }

    public final void loadData(String str, String str2, String str3) {
        this.f36135b.loadData(str, "text/html", str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f36135b.loadDataWithBaseURL(str, str2, "text/html", C6540C.UTF8_NAME, (String) null);
    }

    public final void loadUrl(String str) {
        this.f36135b.loadUrl(str);
    }

    /* renamed from: m */
    public final ov0 mo18765m() {
        return this.f36135b.mo18765m();
    }

    /* renamed from: n */
    public final String mo18766n() {
        return this.f36135b.mo18766n();
    }

    /* renamed from: n0 */
    public final void mo18767n0(C7689fn fnVar) {
        this.f36135b.mo18767n0(fnVar);
    }

    /* renamed from: o */
    public final void mo18768o(String str, ms0 ms0) {
        this.f36135b.mo18768o(str, ms0);
    }

    /* renamed from: o0 */
    public final void mo18769o0(boolean z, long j) {
        this.f36135b.mo18769o0(z, j);
    }

    public final void onAdClicked() {
        xt0 xt0 = this.f36135b;
        if (xt0 != null) {
            xt0.onAdClicked();
        }
    }

    public final void onPause() {
        this.f36136c.mo30468e();
        this.f36135b.onPause();
    }

    public final void onResume() {
        this.f36135b.onResume();
    }

    /* renamed from: p */
    public final lr2 mo18780p() {
        return this.f36135b.mo18780p();
    }

    /* renamed from: p0 */
    public final void mo18781p0(boolean z, int i, boolean z2) {
        this.f36135b.mo18781p0(z, i, z2);
    }

    /* renamed from: q */
    public final Context mo18782q() {
        return this.f36135b.mo18782q();
    }

    /* renamed from: q0 */
    public final boolean mo18783q0() {
        return this.f36135b.mo18783q0();
    }

    /* renamed from: r */
    public final void mo18784r() {
        this.f36135b.mo18784r();
    }

    /* renamed from: r0 */
    public final void mo18785r0(int i) {
        this.f36135b.mo18785r0(i);
    }

    /* renamed from: s */
    public final void mo18786s(boolean z) {
        this.f36135b.mo18786s(z);
    }

    /* renamed from: s0 */
    public final aq0 mo18787s0() {
        return this.f36136c;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f36135b.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f36135b.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f36135b.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f36135b.setWebViewClient(webViewClient);
    }

    /* renamed from: t */
    public final View mo18790t() {
        return this;
    }

    /* renamed from: t0 */
    public final mb3<String> mo18791t0() {
        return this.f36135b.mo18791t0();
    }

    /* renamed from: u */
    public final d30 mo18792u() {
        return this.f36135b.mo18792u();
    }

    /* renamed from: u0 */
    public final mv0 mo18793u0() {
        return ((ru0) this.f36135b).mo18718H0();
    }

    /* renamed from: v */
    public final void mo18794v(ir2 ir2, lr2 lr2) {
        this.f36135b.mo18794v(ir2, lr2);
    }

    /* renamed from: v0 */
    public final void mo18795v0(Context context) {
        this.f36135b.mo18795v0(context);
    }

    /* renamed from: w0 */
    public final void mo18796w0() {
        xt0 xt0 = this.f36135b;
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzt.zzr().zze()));
        hashMap.put("app_volume", String.valueOf(zzt.zzr().zza()));
        ru0 ru0 = (ru0) xt0;
        hashMap.put("device_volume", String.valueOf(zzaf.zzb(ru0.getContext())));
        ru0.mo18321Z("volume", hashMap);
    }

    /* renamed from: x0 */
    public final void mo18797x0(boolean z) {
        this.f36135b.mo18797x0(z);
    }

    /* renamed from: y */
    public final void mo18798y(C8271vo voVar) {
        this.f36135b.mo18798y(voVar);
    }

    /* renamed from: y0 */
    public final boolean mo18799y0(boolean z, int i) {
        if (!this.f36137d.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36832A0)).booleanValue()) {
            return false;
        }
        if (this.f36135b.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f36135b.getParent()).removeView((View) this.f36135b);
        }
        this.f36135b.mo18799y0(z, i);
        return true;
    }

    /* renamed from: z0 */
    public final void mo18800z0(boolean z, int i, String str, String str2, boolean z2) {
        this.f36135b.mo18800z0(z, i, str, str2, z2);
    }

    public final WebView zzI() {
        return (WebView) this.f36135b;
    }

    public final WebViewClient zzJ() {
        return this.f36135b.zzJ();
    }

    public final C7497ab zzK() {
        return this.f36135b.zzK();
    }

    public final C8271vo zzL() {
        return this.f36135b.zzL();
    }

    public final void zzX() {
        this.f36135b.zzX();
    }

    public final void zzZ() {
        this.f36135b.zzZ();
    }

    public final void zza(String str) {
        ((ru0) this.f36135b).mo18723M0(str);
    }

    public final void zzbv() {
        this.f36135b.zzbv();
    }

    public final void zzbw() {
        this.f36135b.zzbw();
    }

    public final int zzf() {
        return this.f36135b.zzf();
    }

    public final int zzg() {
        return this.f36135b.zzg();
    }

    public final int zzh() {
        return this.f36135b.zzh();
    }

    public final int zzi() {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37236w2)).booleanValue()) {
            return this.f36135b.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    public final int zzj() {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37236w2)).booleanValue()) {
            return this.f36135b.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    public final Activity zzk() {
        return this.f36135b.zzk();
    }

    public final zza zzm() {
        return this.f36135b.zzm();
    }

    public final b10 zzn() {
        return this.f36135b.zzn();
    }

    public final c10 zzo() {
        return this.f36135b.zzo();
    }

    public final zzcjf zzp() {
        return this.f36135b.zzp();
    }

    public final void zzq() {
        xt0 xt0 = this.f36135b;
        if (xt0 != null) {
            xt0.zzq();
        }
    }

    public final uu0 zzs() {
        return this.f36135b.zzs();
    }

    public final String zzt() {
        return this.f36135b.zzt();
    }
}
