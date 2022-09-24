package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.anh */
final /* synthetic */ class anh implements Runnable {

    /* renamed from: a */
    private final ann f15432a;

    /* renamed from: b */
    private final long f15433b;

    /* renamed from: c */
    private final int f15434c;

    /* renamed from: d */
    private final /* synthetic */ int f15435d = 1;

    anh(ann ann, int i, long j) {
        this.f15432a = ann;
        this.f15434c = i;
        this.f15433b = j;
    }

    anh(ann ann, long j, int i) {
        this.f15432a = ann;
        this.f15433b = j;
        this.f15434c = i;
    }

    public final void run() {
        if (this.f15435d != 0) {
            this.f15432a.mo14113q(this.f15434c, this.f15433b);
        } else {
            this.f15432a.mo14112p(this.f15433b, this.f15434c);
        }
    }
}
