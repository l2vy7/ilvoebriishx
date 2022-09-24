package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.rs */
/* compiled from: IMASDK */
public final class C4323rs implements C4324rt, C4370tl {

    /* renamed from: a */
    private final long f18536a;

    /* renamed from: b */
    private final C4322rr f18537b;

    public C4323rs(long j) {
        this(j, 0);
    }

    /* renamed from: a */
    public final boolean mo16580a() {
        return false;
    }

    /* renamed from: b */
    public final C4322rr mo16581b(long j) {
        return this.f18537b;
    }

    /* renamed from: c */
    public final long mo16582c() {
        return this.f18536a;
    }

    /* renamed from: d */
    public long mo16621d(long j) {
        return 0;
    }

    /* renamed from: e */
    public long mo16622e() {
        return -1;
    }

    public C4323rs(long j, long j2) {
        C4325ru ruVar;
        this.f18536a = j;
        if (j2 == 0) {
            ruVar = C4325ru.f18538a;
        } else {
            ruVar = new C4325ru(0, j2);
        }
        this.f18537b = new C4322rr(ruVar, ruVar);
    }

    public C4323rs() {
        this(C6540C.TIME_UNSET);
    }
}
