package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahb */
/* compiled from: IMASDK */
public class ahb implements Comparable<Long> {

    /* renamed from: c */
    public final String f14778c;

    /* renamed from: d */
    public final aha f14779d;

    /* renamed from: e */
    public final long f14780e;

    /* renamed from: f */
    public final int f14781f;

    /* renamed from: g */
    public final long f14782g;

    /* renamed from: h */
    public final C4276pz f14783h;

    /* renamed from: i */
    public final String f14784i;

    /* renamed from: j */
    public final String f14785j;

    /* renamed from: k */
    public final long f14786k;

    /* renamed from: l */
    public final long f14787l;

    /* renamed from: m */
    public final boolean f14788m;

    /* synthetic */ ahb(String str, aha aha, long j, int i, long j2, C4276pz pzVar, String str2, String str3, long j3, long j4, boolean z) {
        this.f14778c = str;
        this.f14779d = aha;
        this.f14780e = j;
        this.f14781f = i;
        this.f14782g = j2;
        this.f14783h = pzVar;
        this.f14784i = str2;
        this.f14785j = str3;
        this.f14786k = j3;
        this.f14787l = j4;
        this.f14788m = z;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Long l = (Long) obj;
        if (this.f14782g > l.longValue()) {
            return 1;
        }
        return this.f14782g >= l.longValue() ? 0 : -1;
    }
}
