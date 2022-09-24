package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acu */
/* compiled from: IMASDK */
public abstract class acu extends adl {

    /* renamed from: a */
    public final long f14205a;

    /* renamed from: b */
    public final long f14206b;

    /* renamed from: m */
    private acw f14207m;

    /* renamed from: n */
    private int[] f14208n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public acu(ajg ajg, ajk ajk, C4120ke keVar, int i, long j, long j2, long j3, long j4, long j5) {
        super(ajg, ajk, keVar, i, j, j2, j5);
        this.f14205a = j3;
        this.f14206b = j4;
    }

    /* renamed from: a */
    public final void mo13464a(acw acw) {
        this.f14207m = acw;
        this.f14208n = acw.mo13470a();
    }

    /* renamed from: d */
    public final int mo13465d(int i) {
        return ((int[]) aup.m14889t(this.f14208n))[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final acw mo13466e() {
        acw acw = this.f14207m;
        aup.m14889t(acw);
        return acw;
    }
}
