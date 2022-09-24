package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.zzb;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bo1 {

    /* renamed from: a */
    private final vs1 f30056a;

    /* renamed from: b */
    private final ir1 f30057b;

    /* renamed from: c */
    private ViewTreeObserver.OnScrollChangedListener f30058c = null;

    public bo1(vs1 vs1, ir1 ir1) {
        this.f30056a = vs1;
        this.f30057b = ir1;
    }

    /* renamed from: f */
    private static final int m30785f(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        C8241uv.m38463b();
        return vn0.m38860s(context, i);
    }

    /* renamed from: a */
    public final View mo30744a(View view, WindowManager windowManager) throws ju0 {
        xt0 a = this.f30056a.mo35491a(zzbfi.m40643E0(), (ir2) null, (lr2) null);
        View view2 = (View) a;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        a.mo18726O("/sendMessageToSdk", new wn1(this));
        a.mo18726O("/hideValidatorOverlay", new yn1(this, windowManager, view));
        a.mo18726O("/open", new q70((zzb) null, (pf0) null, (f42) null, (nv1) null, (nw2) null));
        this.f30057b.mo32759j(new WeakReference(a), "/loadNativeAdPolicyViolations", new xn1(this, view, windowManager));
        this.f30057b.mo32759j(new WeakReference(a), "/showValidatorOverlay", zn1.f42531a);
        return (View) a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo30745b(xt0 xt0, Map map) {
        this.f30057b.mo32756g("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo30746c(WindowManager windowManager, View view, xt0 xt0, Map map) {
        co0.zze("Hide native ad policy validator overlay.");
        xt0.mo18790t().setVisibility(8);
        if (xt0.mo18790t().getWindowToken() != null) {
            windowManager.removeView(xt0.mo18790t());
        }
        xt0.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f30058c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.f30058c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo30747d(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put(TtmlNode.ATTR_ID, (String) map.get(TtmlNode.ATTR_ID));
        this.f30057b.mo32756g("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo30748e(View view, WindowManager windowManager, xt0 xt0, Map map) {
        int i;
        xt0.mo18793u0().mo18251F0(new ao1(this, map));
        if (map != null) {
            Context context = view.getContext();
            int f = m30785f(context, (String) map.get("validator_width"), ((Integer) C8311wv.m39277c().mo18570b(p00.f36973R5)).intValue());
            int f2 = m30785f(context, (String) map.get("validator_height"), ((Integer) C8311wv.m39277c().mo18570b(p00.f36981S5)).intValue());
            int f3 = m30785f(context, (String) map.get("validator_x"), 0);
            int f4 = m30785f(context, (String) map.get("validator_y"), 0);
            xt0.mo18759k0(ov0.m35841b(f, f2));
            try {
                xt0.zzI().getSettings().setUseWideViewPort(((Boolean) C8311wv.m39277c().mo18570b(p00.f36989T5)).booleanValue());
                xt0.zzI().getSettings().setLoadWithOverviewMode(((Boolean) C8311wv.m39277c().mo18570b(p00.f36997U5)).booleanValue());
            } catch (NullPointerException unused) {
            }
            WindowManager.LayoutParams zzb = zzcb.zzb();
            zzb.x = f3;
            zzb.y = f4;
            windowManager.updateViewLayout(xt0.mo18790t(), zzb);
            String str = (String) map.get(AdUnitActivity.EXTRA_ORIENTATION);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(str) || "2".equals(str)) {
                    i = rect.bottom;
                } else {
                    i = rect.top;
                }
                this.f30058c = new vn1(view, xt0, str, zzb, i - f4, windowManager);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(this.f30058c);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                xt0.loadUrl(str2);
            }
        }
    }
}
