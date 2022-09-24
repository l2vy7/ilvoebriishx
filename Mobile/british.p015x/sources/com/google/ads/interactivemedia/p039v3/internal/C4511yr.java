package com.google.ads.interactivemedia.p039v3.internal;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yr */
/* compiled from: IMASDK */
public final class C4511yr extends C4508yo {
    /* renamed from: c */
    public static final C4510yq m19609c(alw alw) {
        String I = alw.mo13940I();
        aup.m14890u(I);
        String I2 = alw.mo13940I();
        aup.m14890u(I2);
        return new C4510yq(I, I2, alw.mo13963u(), alw.mo13963u(), Arrays.copyOfRange(alw.mo13952j(), alw.mo13950h(), alw.mo13948f()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C4507yn mo16841b(ByteBuffer byteBuffer) {
        return new C4507yn(m19609c(new alw(byteBuffer.array(), byteBuffer.limit())));
    }
}
