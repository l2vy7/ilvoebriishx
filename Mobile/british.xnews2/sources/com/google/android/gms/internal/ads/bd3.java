package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bd3<P> {

    /* renamed from: a */
    private final P f29971a;

    /* renamed from: b */
    private final byte[] f29972b;

    /* renamed from: c */
    private final int f29973c;

    /* renamed from: d */
    private final int f29974d;

    bd3(P p, byte[] bArr, int i, int i2, int i3) {
        this.f29971a = p;
        this.f29972b = Arrays.copyOf(bArr, bArr.length);
        this.f29973c = i;
        this.f29974d = i2;
    }

    /* renamed from: a */
    public final P mo30657a() {
        return this.f29971a;
    }

    /* renamed from: b */
    public final byte[] mo30658b() {
        byte[] bArr = this.f29972b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: c */
    public final int mo30659c() {
        return this.f29973c;
    }

    /* renamed from: d */
    public final int mo30660d() {
        return this.f29974d;
    }
}
