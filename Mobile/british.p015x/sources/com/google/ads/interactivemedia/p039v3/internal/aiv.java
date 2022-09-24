package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aiv */
final /* synthetic */ class aiv implements Runnable {

    /* renamed from: a */
    private final aiw f15020a;

    /* renamed from: b */
    private final int f15021b;

    /* renamed from: c */
    private final long f15022c;

    /* renamed from: d */
    private final long f15023d;

    aiv(aiw aiw, int i, long j, long j2) {
        this.f15020a = aiw;
        this.f15021b = i;
        this.f15022c = j;
        this.f15023d = j2;
    }

    public final void run() {
        aiw aiw = this.f15020a;
        aiw.f15025b.mo13792V(this.f15021b, this.f15022c, this.f15023d);
    }
}
