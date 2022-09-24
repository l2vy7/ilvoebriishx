package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lm3 implements gc3 {

    /* renamed from: a */
    private final wm3 f35137a;

    /* renamed from: b */
    private final zc3 f35138b;

    public lm3(wm3 wm3, zc3 zc3, int i) {
        this.f35137a = wm3;
        this.f35138b = zc3;
    }

    /* renamed from: a */
    public final byte[] mo31329a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] a = this.f35137a.mo30730a(bArr);
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(0).array(), 8);
        return zl3.m40379b(a, this.f35138b.mo30971a(zl3.m40379b(bArr2, a, copyOf)));
    }
}
