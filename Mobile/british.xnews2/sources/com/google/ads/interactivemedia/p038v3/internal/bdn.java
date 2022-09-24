package com.google.ads.interactivemedia.p038v3.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bdn */
/* compiled from: IMASDK */
public final class bdn implements aws {

    /* renamed from: a */
    private final bds f16174a;

    /* renamed from: b */
    private final axh f16175b;

    public bdn(bds bds, axh axh) {
        this.f16174a = bds;
        this.f16175b = axh;
    }

    /* renamed from: a */
    public final byte[] mo14715a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] a = this.f16174a.mo14932a(bArr);
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return awr.m15065b(a, this.f16175b.mo14747a(awr.m15065b(bArr2, a, copyOf)));
    }
}
