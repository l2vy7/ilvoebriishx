package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lw1 implements kd1, C7659eu, ma1, hb1, ib1, cc1, pa1, C8366yd, ew2 {

    /* renamed from: b */
    private final List<Object> f20542b;

    /* renamed from: c */
    private final zv1 f20543c;

    /* renamed from: d */
    private long f20544d;

    public lw1(zv1 zv1, uv0 uv0) {
        this.f20543c = zv1;
        this.f20542b = Collections.singletonList(uv0);
    }

    /* renamed from: I */
    private final void m20680I(Class<?> cls, String str, Object... objArr) {
        zv1 zv1 = this.f20543c;
        List<Object> list = this.f20542b;
        String simpleName = cls.getSimpleName();
        zv1.mo36136a(list, simpleName.length() != 0 ? "Event-".concat(simpleName) : new String("Event-"), str, objArr);
    }

    /* renamed from: C */
    public final void mo18537C(Context context) {
        m20680I(ib1.class, "onDestroy", context);
    }

    /* renamed from: G */
    public final void mo18433G(ur2 ur2) {
    }

    @ParametersAreNonnullByDefault
    /* renamed from: a */
    public final void mo18123a(kj0 kj0, String str, String str2) {
        m20680I(ma1.class, "onRewarded", kj0, str, str2);
    }

    /* renamed from: c */
    public final void mo18538c(Context context) {
        m20680I(ib1.class, "onPause", context);
    }

    /* renamed from: d */
    public final void mo18436d(zzbew zzbew) {
        m20680I(pa1.class, "onAdFailedToLoad", Integer.valueOf(zzbew.f42935b), zzbew.f42936c, zzbew.f42937d);
    }

    /* renamed from: g */
    public final void mo18539g(wv2 wv2, String str) {
        m20680I(vv2.class, "onTaskStarted", str);
    }

    /* renamed from: h0 */
    public final void mo18437h0(zzcdq zzcdq) {
        this.f20544d = zzt.zzA().elapsedRealtime();
        m20680I(kd1.class, "onAdRequest", new Object[0]);
    }

    /* renamed from: l */
    public final void mo18540l(wv2 wv2, String str, Throwable th) {
        m20680I(vv2.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    /* renamed from: n */
    public final void mo18541n(wv2 wv2, String str) {
        m20680I(vv2.class, "onTaskSucceeded", str);
    }

    public final void onAdClicked() {
        m20680I(C7659eu.class, "onAdClicked", new Object[0]);
    }

    /* renamed from: r */
    public final void mo18126r(String str, String str2) {
        m20680I(C8366yd.class, "onAppEvent", str, str2);
    }

    /* renamed from: w */
    public final void mo18127w() {
        m20680I(ma1.class, "onRewardedVideoCompleted", new Object[0]);
    }

    /* renamed from: x */
    public final void mo18542x(Context context) {
        m20680I(ib1.class, "onResume", context);
    }

    /* renamed from: z */
    public final void mo18543z(wv2 wv2, String str) {
        m20680I(vv2.class, "onTaskCreated", str);
    }

    public final void zzj() {
        m20680I(ma1.class, "onAdClosed", new Object[0]);
    }

    public final void zzl() {
        m20680I(hb1.class, "onAdImpression", new Object[0]);
    }

    public final void zzm() {
        m20680I(ma1.class, "onAdLeftApplication", new Object[0]);
    }

    public final void zzn() {
        long elapsedRealtime = zzt.zzA().elapsedRealtime();
        long j = this.f20544d;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(elapsedRealtime - j);
        zze.zza(sb.toString());
        m20680I(cc1.class, "onAdLoaded", new Object[0]);
    }

    public final void zzo() {
        m20680I(ma1.class, "onAdOpened", new Object[0]);
    }

    public final void zzr() {
        m20680I(ma1.class, "onRewardedVideoStarted", new Object[0]);
    }
}
