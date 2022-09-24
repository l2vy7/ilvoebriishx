package com.google.ads.interactivemedia.p038v3.impl.data;

import com.google.ads.interactivemedia.p038v3.internal.ark;

@ark(mo14242a = C3826z.class)
/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bc */
/* compiled from: IMASDK */
public abstract class C3790bc {
    public static C3790bc create(C3789bb bbVar, String str, String str2, String str3, String str4, int i, int i2) {
        return new C3826z(bbVar, str, str2, str4, str3, i, i2);
    }

    public abstract int connectionTimeoutMs();

    public abstract String content();

    /* renamed from: id */
    public abstract String mo13111id();

    public abstract int readTimeoutMs();

    public abstract C3789bb requestType();

    public abstract String url();

    public abstract String userAgent();
}
