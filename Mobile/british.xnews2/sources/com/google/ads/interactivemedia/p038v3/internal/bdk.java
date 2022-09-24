package com.google.ads.interactivemedia.p038v3.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bdk */
/* compiled from: IMASDK */
public final class bdk implements awx {

    /* renamed from: a */
    private static final byte[] f16165a = new byte[0];

    /* renamed from: b */
    private final bdm f16166b;

    /* renamed from: c */
    private final String f16167c;

    /* renamed from: d */
    private final byte[] f16168d;

    /* renamed from: e */
    private final bdi f16169e;

    /* renamed from: f */
    private final int f16170f;

    public bdk(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, bdi bdi) throws GeneralSecurityException {
        bdt.m15735b(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f16166b = new bdm(eCPublicKey);
        this.f16168d = bArr;
        this.f16167c = str;
        this.f16170f = i;
        this.f16169e = bdi;
    }

    /* renamed from: a */
    public final byte[] mo14719a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        bdl a = this.f16166b.mo14948a(this.f16167c, this.f16168d, bArr2, this.f16169e.mo14779a(), this.f16170f);
        byte[] a2 = this.f16169e.mo14780b(a.mo14947b()).mo14781a(bArr, f16165a);
        byte[] a3 = a.mo14946a();
        return ByteBuffer.allocate(a3.length + a2.length).put(a3).put(a2).array();
    }
}
