package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abe */
final /* synthetic */ class abe implements Runnable {

    /* renamed from: a */
    private final abj f14003a;

    /* renamed from: b */
    private final abk f14004b;

    /* renamed from: c */
    private final aas f14005c;

    /* renamed from: d */
    private final aax f14006d;

    /* renamed from: e */
    private final /* synthetic */ int f14007e = 0;

    abe(abj abj, abk abk, aas aas, aax aax) {
        this.f14003a = abj;
        this.f14004b = abk;
        this.f14005c = aas;
        this.f14006d = aax;
    }

    abe(abj abj, abk abk, aas aas, aax aax, byte[] bArr) {
        this.f14003a = abj;
        this.f14004b = abk;
        this.f14005c = aas;
        this.f14006d = aax;
    }

    abe(abj abj, abk abk, aas aas, aax aax, char[] cArr) {
        this.f14003a = abj;
        this.f14004b = abk;
        this.f14005c = aas;
        this.f14006d = aax;
    }

    public final void run() {
        int i = this.f14007e;
        if (i == 0) {
            abj abj = this.f14003a;
            this.f14004b.mo13250b(abj.f14023a, abj.f14024b, this.f14005c, this.f14006d);
        } else if (i != 1) {
            abj abj2 = this.f14003a;
            this.f14004b.mo13246ae(abj2.f14023a, abj2.f14024b, this.f14005c, this.f14006d);
        } else {
            abj abj3 = this.f14003a;
            this.f14004b.mo13245a(abj3.f14023a, abj3.f14024b, this.f14005c, this.f14006d);
        }
    }
}
