package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class re3 implements gc3 {

    /* renamed from: c */
    private static final byte[] f38642c = new byte[0];

    /* renamed from: a */
    private final dk3 f38643a;

    /* renamed from: b */
    private final gc3 f38644b;

    public re3(dk3 dk3, gc3 gc3) {
        this.f38643a = dk3;
        this.f38644b = gc3;
    }

    /* renamed from: a */
    public final byte[] mo31329a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] g = od3.m35634d(this.f38643a).mo33365g();
        byte[] a = this.f38644b.mo31329a(g, f38642c);
        byte[] a2 = ((gc3) od3.m35638h(this.f38643a.mo31287J(), g, gc3.class)).mo31329a(bArr, bArr2);
        int length = a.length;
        return ByteBuffer.allocate(length + 4 + a2.length).putInt(length).put(a).put(a2).array();
    }
}
