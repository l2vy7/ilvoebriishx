package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajj */
/* compiled from: IMASDK */
public final class ajj {

    /* renamed from: a */
    private Uri f15049a;

    /* renamed from: b */
    private int f15050b = 1;

    /* renamed from: c */
    private byte[] f15051c;

    /* renamed from: d */
    private Map<String, String> f15052d = Collections.emptyMap();

    /* renamed from: e */
    private long f15053e;

    /* renamed from: f */
    private long f15054f = -1;

    /* renamed from: g */
    private int f15055g;

    /* renamed from: a */
    public final ajk mo13806a() {
        aup.m14892w(this.f15049a, "The uri must be set.");
        return new ajk(this.f15049a, this.f15050b, this.f15051c, this.f15052d, this.f15053e, this.f15054f, this.f15055g, (byte[]) null);
    }

    /* renamed from: b */
    public final void mo13807b(int i) {
        this.f15055g = i;
    }

    /* renamed from: c */
    public final void mo13808c(Map<String, String> map) {
        this.f15052d = map;
    }

    /* renamed from: d */
    public final void mo13809d(long j) {
        this.f15054f = j;
    }

    /* renamed from: e */
    public final void mo13810e(long j) {
        this.f15053e = j;
    }

    /* renamed from: f */
    public final void mo13811f(Uri uri) {
        this.f15049a = uri;
    }
}
