package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class w10 {

    /* renamed from: a */
    public static final s10<Boolean> f40654a = t10.m37637f("gads:consent:gmscore:dsid:enabled", true);

    /* renamed from: b */
    public static final s10<Boolean> f40655b = t10.m37637f("gads:consent:gmscore:lat:enabled", true);

    /* renamed from: c */
    public static final s10<String> f40656c = new t10("gads:consent:gmscore:backend_url", "https://adservice.google.com/getconfig/pubvendors", 4);

    /* renamed from: d */
    public static final s10<Long> f40657d = new t10("gads:consent:gmscore:time_out", Long.valueOf(ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS), 2);

    /* renamed from: e */
    public static final s10<Boolean> f40658e = t10.m37637f("gads:consent:gmscore:enabled", true);
}
