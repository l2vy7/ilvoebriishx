package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aea */
/* compiled from: IMASDK */
final class aea implements akb<akl<Long>> {

    /* renamed from: a */
    final /* synthetic */ aec f14350a;

    /* renamed from: b */
    private final /* synthetic */ int f14351b = 0;

    /* synthetic */ aea(aec aec) {
        this.f14350a = aec;
    }

    /* synthetic */ aea(aec aec, byte[] bArr) {
        this.f14350a = aec;
    }

    /* renamed from: v */
    public final /* bridge */ /* synthetic */ akc mo13373v(ake ake, long j, long j2, IOException iOException, int i) {
        if (this.f14351b != 0) {
            return this.f14350a.mo13521B((akl) ake, j, j2, iOException, i);
        }
        return this.f14350a.mo13523D((akl) ake, j, j2, iOException);
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo13374w(ake ake, long j, long j2, boolean z) {
        if (this.f14351b != 0) {
            this.f14350a.mo13524E((akl) ake, j, j2);
            return;
        }
        this.f14350a.mo13524E((akl) ake, j, j2);
    }

    /* renamed from: x */
    public final /* bridge */ /* synthetic */ void mo13375x(ake ake, long j, long j2) {
        if (this.f14351b != 0) {
            this.f14350a.mo13520A((akl) ake, j, j2);
            return;
        }
        this.f14350a.mo13522C((akl) ake, j, j2);
    }
}
