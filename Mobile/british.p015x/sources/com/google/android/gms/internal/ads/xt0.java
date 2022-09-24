package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import javax.annotation.ParametersAreNonnullByDefault;
import p006a5.C6493p;
import p199d5.C10487a;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public interface xt0 extends C7659eu, gi1, ot0, t90, vu0, zu0, ga0, C7763hn, dv0, zzl, gv0, hv0, mq0, iv0 {
    /* renamed from: A */
    void mo18711A();

    /* renamed from: B */
    void mo18712B(com.google.android.gms.ads.internal.overlay.zzl zzl);

    /* renamed from: C0 */
    void mo18714C0(d30 d30);

    /* renamed from: D */
    boolean mo18715D();

    /* renamed from: F */
    void mo18716F();

    /* renamed from: H */
    void mo18717H(boolean z);

    /* renamed from: O */
    void mo18726O(String str, e70<? super xt0> e70);

    /* renamed from: P */
    void mo18728P(String str, e70<? super xt0> e70);

    /* renamed from: R */
    void mo18731R(int i);

    /* renamed from: S */
    boolean mo18732S();

    /* renamed from: T */
    void mo18733T();

    /* renamed from: U */
    String mo18734U();

    /* renamed from: V */
    void mo18735V(boolean z);

    /* renamed from: W */
    void mo18736W(b30 b30);

    /* renamed from: X */
    boolean mo18737X();

    /* renamed from: Y */
    void mo18738Y(boolean z);

    /* renamed from: a0 */
    void mo18739a0();

    /* renamed from: b */
    ir2 mo18740b();

    /* renamed from: b0 */
    void mo18741b0(C10487a aVar);

    /* renamed from: c0 */
    void mo18742c0(com.google.android.gms.ads.internal.overlay.zzl zzl);

    boolean canGoBack();

    /* renamed from: d0 */
    void mo18744d0(String str, String str2, String str3);

    void destroy();

    /* renamed from: e */
    boolean mo18746e();

    /* renamed from: f0 */
    void mo18749f0(String str, C6493p<e70<? super xt0>> pVar);

    /* renamed from: g0 */
    void mo18751g0();

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    /* renamed from: h */
    com.google.android.gms.ads.internal.overlay.zzl mo18752h();

    /* renamed from: i */
    com.google.android.gms.ads.internal.overlay.zzl mo18754i();

    /* renamed from: i0 */
    void mo18755i0(boolean z);

    /* renamed from: j */
    boolean mo18756j();

    /* renamed from: k */
    void mo18758k(uu0 uu0);

    /* renamed from: k0 */
    void mo18759k0(ov0 ov0);

    /* renamed from: l0 */
    C10487a mo18761l0();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    /* renamed from: m */
    ov0 mo18765m();

    void measure(int i, int i2);

    /* renamed from: o */
    void mo18768o(String str, ms0 ms0);

    void onPause();

    void onResume();

    /* renamed from: p */
    lr2 mo18780p();

    /* renamed from: q */
    Context mo18782q();

    /* renamed from: q0 */
    boolean mo18783q0();

    /* renamed from: r0 */
    void mo18785r0(int i);

    /* renamed from: s */
    void mo18786s(boolean z);

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    /* renamed from: t */
    View mo18790t();

    /* renamed from: t0 */
    mb3<String> mo18791t0();

    /* renamed from: u */
    d30 mo18792u();

    /* renamed from: u0 */
    mv0 mo18793u0();

    /* renamed from: v */
    void mo18794v(ir2 ir2, lr2 lr2);

    /* renamed from: v0 */
    void mo18795v0(Context context);

    /* renamed from: w0 */
    void mo18796w0();

    /* renamed from: x0 */
    void mo18797x0(boolean z);

    /* renamed from: y */
    void mo18798y(C8271vo voVar);

    /* renamed from: y0 */
    boolean mo18799y0(boolean z, int i);

    WebView zzI();

    WebViewClient zzJ();

    C7497ab zzK();

    C8271vo zzL();

    void zzX();

    void zzZ();

    Activity zzk();

    zza zzm();

    c10 zzo();

    zzcjf zzp();

    uu0 zzs();
}
