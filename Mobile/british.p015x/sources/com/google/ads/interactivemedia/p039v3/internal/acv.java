package com.google.ads.interactivemedia.p039v3.internal;

import java.util.NoSuchElementException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acv */
/* compiled from: IMASDK */
public abstract class acv implements adn {

    /* renamed from: b */
    private final long f14209b;

    /* renamed from: c */
    private final long f14210c;

    /* renamed from: d */
    private long f14211d;

    public acv(long j, long j2) {
        this.f14209b = j;
        this.f14210c = j2;
        this.f14211d = j - 1;
    }

    /* renamed from: a */
    public final boolean mo13467a() {
        long j = this.f14211d + 1;
        this.f14211d = j;
        return j <= this.f14210c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo13468b() {
        long j = this.f14211d;
        if (j < this.f14209b || j > this.f14210c) {
            throw new NoSuchElementException();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final long mo13469c() {
        return this.f14211d;
    }
}
