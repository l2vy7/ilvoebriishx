package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afq */
/* compiled from: IMASDK */
final class afq extends adj {

    /* renamed from: a */
    private byte[] f14533a;

    public afq(ajg ajg, ajk ajk, C4120ke keVar, int i, byte[] bArr) {
        super(ajg, ajk, keVar, i, bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo13505d(byte[] bArr, int i) {
        this.f14533a = Arrays.copyOf(bArr, i);
    }

    /* renamed from: e */
    public final byte[] mo13612e() {
        return this.f14533a;
    }
}
