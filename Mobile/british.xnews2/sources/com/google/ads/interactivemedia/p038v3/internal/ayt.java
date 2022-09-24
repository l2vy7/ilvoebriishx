package com.google.ads.interactivemedia.p038v3.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ayt */
/* compiled from: IMASDK */
public final class ayt implements aws {

    /* renamed from: a */
    private static final byte[] f15908a = new byte[0];

    /* renamed from: b */
    private final bcc f15909b;

    /* renamed from: c */
    private final aws f15910c;

    public ayt(bcc bcc, aws aws) {
        this.f15909b = bcc;
        this.f15910c = aws;
    }

    /* renamed from: a */
    public final byte[] mo14715a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] aV = axt.m15147e(this.f15909b).mo15165aV();
        byte[] a = this.f15910c.mo14715a(aV, f15908a);
        byte[] a2 = ((aws) axt.m15149g(this.f15909b.mo14892a(), aV, aws.class)).mo14715a(bArr, bArr2);
        int length = a.length;
        return ByteBuffer.allocate(length + 4 + a2.length).putInt(length).put(a).put(a2).array();
    }
}
