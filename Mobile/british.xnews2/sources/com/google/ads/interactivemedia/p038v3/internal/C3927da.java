package com.google.ads.interactivemedia.p038v3.internal;

import com.google.ads.interactivemedia.p038v3.api.AdsRequest;
import com.google.ads.interactivemedia.p038v3.api.player.ContentProgressProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.da */
/* compiled from: IMASDK */
public final class C3927da implements AdsRequest {

    /* renamed from: a */
    private String f16883a;

    /* renamed from: b */
    private Map<String, String> f16884b;

    /* renamed from: c */
    private String f16885c;

    /* renamed from: d */
    private ContentProgressProvider f16886d;

    /* renamed from: e */
    private C3923cx f16887e = C3923cx.UNKNOWN;

    /* renamed from: f */
    private C3925cz f16888f = C3925cz.UNKNOWN;

    /* renamed from: g */
    private C3924cy f16889g = C3924cy.UNKNOWN;

    /* renamed from: h */
    private Float f16890h;

    /* renamed from: i */
    private List<String> f16891i;

    /* renamed from: j */
    private String f16892j;

    /* renamed from: k */
    private String f16893k;

    /* renamed from: l */
    private Float f16894l;

    /* renamed from: m */
    private Float f16895m;

    /* renamed from: n */
    private transient Object f16896n;

    /* renamed from: a */
    public final C3923cx mo15646a() {
        return this.f16887e;
    }

    /* renamed from: b */
    public final C3925cz mo15647b() {
        return this.f16888f;
    }

    /* renamed from: c */
    public final C3924cy mo15648c() {
        return this.f16889g;
    }

    /* renamed from: d */
    public final Float mo15649d() {
        return this.f16890h;
    }

    /* renamed from: e */
    public final List<String> mo15650e() {
        return this.f16891i;
    }

    /* renamed from: f */
    public final String mo15651f() {
        return this.f16892j;
    }

    /* renamed from: g */
    public final String mo15652g() {
        return this.f16893k;
    }

    public final String getAdTagUrl() {
        return this.f16883a;
    }

    public final String getAdsResponse() {
        return this.f16885c;
    }

    public final ContentProgressProvider getContentProgressProvider() {
        return this.f16886d;
    }

    public final String getExtraParameter(String str) {
        Map<String, String> map = this.f16884b;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final Map<String, String> getExtraParameters() {
        return this.f16884b;
    }

    public final Object getUserRequestContext() {
        return this.f16896n;
    }

    /* renamed from: h */
    public final Float mo15653h() {
        return this.f16894l;
    }

    /* renamed from: i */
    public final Float mo15654i() {
        return this.f16895m;
    }

    public final void setAdTagUrl(String str) {
        this.f16883a = str;
    }

    public final void setAdWillAutoPlay(boolean z) {
        this.f16887e = z ? C3923cx.AUTO : C3923cx.CLICK;
    }

    public final void setAdWillPlayMuted(boolean z) {
        this.f16888f = z ? C3925cz.MUTED : C3925cz.UNMUTED;
    }

    public final void setAdsResponse(String str) {
        this.f16885c = str;
    }

    public final void setContentDuration(float f) {
        this.f16890h = Float.valueOf(f);
    }

    public final void setContentKeywords(List<String> list) {
        this.f16891i = list;
    }

    public final void setContentProgressProvider(ContentProgressProvider contentProgressProvider) {
        this.f16886d = contentProgressProvider;
    }

    public final void setContentTitle(String str) {
        this.f16892j = str;
    }

    public final void setContentUrl(String str) {
        this.f16893k = str;
    }

    public final void setContinuousPlayback(boolean z) {
        this.f16889g = z ? C3924cy.ON : C3924cy.OFF;
    }

    public final void setExtraParameter(String str, String str2) {
        if (this.f16884b == null) {
            this.f16884b = new HashMap();
        }
        this.f16884b.put(str, str2);
    }

    public final void setLiveStreamPrefetchSeconds(float f) {
        this.f16895m = Float.valueOf(f);
    }

    public final void setUserRequestContext(Object obj) {
        this.f16896n = obj;
    }

    public final void setVastLoadTimeout(float f) {
        this.f16894l = Float.valueOf(f);
    }
}
