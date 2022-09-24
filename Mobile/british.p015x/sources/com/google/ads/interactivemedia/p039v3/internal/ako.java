package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ako */
/* compiled from: IMASDK */
public final class ako implements ajg {

    /* renamed from: a */
    private final ajg f15164a;

    /* renamed from: b */
    private long f15165b;

    /* renamed from: c */
    private Uri f15166c = Uri.EMPTY;

    /* renamed from: d */
    private Map<String, List<String>> f15167d = Collections.emptyMap();

    public ako(ajg ajg) {
        aup.m14890u(ajg);
        this.f15164a = ajg;
    }

    /* renamed from: a */
    public final int mo13294a(byte[] bArr, int i, int i2) throws IOException {
        int a = this.f15164a.mo13294a(bArr, i, i2);
        if (a != -1) {
            this.f15165b += (long) a;
        }
        return a;
    }

    /* renamed from: b */
    public final void mo13295b(akp akp) {
        aup.m14890u(akp);
        this.f15164a.mo13295b(akp);
    }

    /* renamed from: c */
    public final long mo13296c(ajk ajk) throws IOException {
        this.f15166c = ajk.f15056a;
        this.f15167d = Collections.emptyMap();
        long c = this.f15164a.mo13296c(ajk);
        Uri d = mo13297d();
        aup.m14890u(d);
        this.f15166c = d;
        this.f15167d = mo13298e();
        return c;
    }

    /* renamed from: d */
    public final Uri mo13297d() {
        return this.f15164a.mo13297d();
    }

    /* renamed from: e */
    public final Map<String, List<String>> mo13298e() {
        return this.f15164a.mo13298e();
    }

    /* renamed from: f */
    public final void mo13299f() throws IOException {
        this.f15164a.mo13299f();
    }

    /* renamed from: g */
    public final void mo13853g() {
        this.f15165b = 0;
    }

    /* renamed from: h */
    public final long mo13854h() {
        return this.f15165b;
    }

    /* renamed from: i */
    public final Uri mo13855i() {
        return this.f15166c;
    }

    /* renamed from: j */
    public final Map<String, List<String>> mo13856j() {
        return this.f15167d;
    }
}
