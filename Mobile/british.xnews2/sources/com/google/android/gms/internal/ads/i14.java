package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i14 {

    /* renamed from: a */
    private final g04[] f33029a;

    /* renamed from: b */
    private final x14 f33030b;

    /* renamed from: c */
    private final z14 f33031c;

    public i14(g04... g04Arr) {
        x14 x14 = new x14();
        z14 z14 = new z14();
        g04[] g04Arr2 = new g04[2];
        this.f33029a = g04Arr2;
        System.arraycopy(g04Arr, 0, g04Arr2, 0, 0);
        this.f33030b = x14;
        this.f33031c = z14;
        g04Arr2[0] = x14;
        g04Arr2[1] = z14;
    }

    /* renamed from: a */
    public final long mo32521a(long j) {
        return this.f33031c.mo35989c(j);
    }

    /* renamed from: b */
    public final long mo32522b() {
        return this.f33030b.mo35707i();
    }

    /* renamed from: c */
    public final h20 mo32523c(h20 h20) {
        this.f33031c.mo35991e(h20.f32590a);
        this.f33031c.mo35990d(h20.f32591b);
        return h20;
    }

    /* renamed from: d */
    public final boolean mo32524d(boolean z) {
        this.f33030b.mo35708j(z);
        return z;
    }

    /* renamed from: e */
    public final g04[] mo32525e() {
        return this.f33029a;
    }
}
