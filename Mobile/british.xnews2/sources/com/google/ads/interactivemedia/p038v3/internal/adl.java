package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.adl */
/* compiled from: IMASDK */
public abstract class adl extends ada {

    /* renamed from: l */
    public final long f14289l;

    public adl(ajg ajg, ajk ajk, C4120ke keVar, int i, long j, long j2, long j3) {
        super(ajg, ajk, 1, keVar, i, j, j2);
        aup.m14890u(keVar);
        this.f14289l = j3;
    }

    /* renamed from: i */
    public long mo13502i() {
        long j = this.f14289l;
        if (j != -1) {
            return j + 1;
        }
        return -1;
    }

    /* renamed from: j */
    public abstract boolean mo13503j();
}
