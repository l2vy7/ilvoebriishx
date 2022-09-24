package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.axj */
/* compiled from: IMASDK */
public final class axj<P> {

    /* renamed from: a */
    private final P f15873a;

    /* renamed from: b */
    private final byte[] f15874b;

    /* renamed from: c */
    private final bcb f15875c;

    /* renamed from: d */
    private final bcr f15876d;

    axj(P p, byte[] bArr, bcb bcb, bcr bcr) {
        this.f15873a = p;
        this.f15874b = Arrays.copyOf(bArr, bArr.length);
        this.f15875c = bcb;
        this.f15876d = bcr;
    }

    /* renamed from: a */
    public final P mo14748a() {
        return this.f15873a;
    }

    /* renamed from: b */
    public final bcb mo14749b() {
        return this.f15875c;
    }

    /* renamed from: c */
    public final bcr mo14750c() {
        return this.f15876d;
    }

    /* renamed from: d */
    public final byte[] mo14751d() {
        byte[] bArr = this.f15874b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
