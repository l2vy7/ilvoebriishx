package com.google.ads.interactivemedia.p039v3.internal;

import com.google.ads.interactivemedia.p039v3.api.StreamRequest;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ez */
/* compiled from: IMASDK */
public final class C3979ez implements StreamRequest {

    /* renamed from: a */
    private String f17022a;

    /* renamed from: b */
    private String f17023b;

    /* renamed from: c */
    private String f17024c;

    /* renamed from: d */
    private String f17025d;

    /* renamed from: e */
    private String f17026e;

    /* renamed from: f */
    private String f17027f;

    /* renamed from: g */
    private Map<String, String> f17028g;

    /* renamed from: h */
    private String f17029h;

    /* renamed from: i */
    private String f17030i;

    /* renamed from: j */
    private String f17031j;

    /* renamed from: k */
    private String f17032k;

    /* renamed from: l */
    private StreamRequest.StreamFormat f17033l;

    /* renamed from: m */
    private Boolean f17034m;

    /* renamed from: n */
    private transient Object f17035n;

    /* renamed from: a */
    public final void mo15758a(String str) {
        this.f17022a = str;
    }

    /* renamed from: b */
    public final void mo15759b(String str) {
        this.f17024c = str;
    }

    /* renamed from: c */
    public final void mo15760c(String str) {
        this.f17025d = str;
    }

    /* renamed from: d */
    public final void mo15761d(String str) {
        this.f17026e = str;
    }

    /* renamed from: e */
    public final void mo15762e(String str) {
        this.f17027f = str;
    }

    /* renamed from: f */
    public final void mo15763f(String str) {
        this.f17023b = str;
    }

    public final Map<String, String> getAdTagParameters() {
        return this.f17028g;
    }

    public final String getApiKey() {
        return this.f17023b;
    }

    public final String getAssetKey() {
        return this.f17022a;
    }

    public final String getAuthToken() {
        return this.f17031j;
    }

    public final String getContentSourceId() {
        return this.f17024c;
    }

    public final String getContentUrl() {
        return this.f17030i;
    }

    public final String getCustomAssetKey() {
        return this.f17027f;
    }

    public final StreamRequest.StreamFormat getFormat() {
        return this.f17033l;
    }

    public final String getManifestSuffix() {
        return this.f17029h;
    }

    public final String getNetworkCode() {
        return this.f17026e;
    }

    public final String getStreamActivityMonitorId() {
        return this.f17032k;
    }

    public final Boolean getUseQAStreamBaseUrl() {
        return this.f17034m;
    }

    public final Object getUserRequestContext() {
        return this.f17035n;
    }

    public final String getVideoId() {
        return this.f17025d;
    }

    public final void setAdTagParameters(Map<String, String> map) {
        this.f17028g = map;
    }

    public final void setAuthToken(String str) {
        this.f17031j = str;
    }

    public final void setContentUrl(String str) {
        this.f17030i = str;
    }

    public final void setFormat(StreamRequest.StreamFormat streamFormat) {
        this.f17033l = streamFormat;
    }

    public final void setManifestSuffix(String str) {
        this.f17029h = str;
    }

    public final void setStreamActivityMonitorId(String str) {
        this.f17032k = str;
    }

    public final void setUseQAStreamBaseUrl(Boolean bool) {
        this.f17034m = bool;
    }

    public final void setUserRequestContext(Object obj) {
        this.f17035n = obj;
    }
}
