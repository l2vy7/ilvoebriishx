package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gm3 implements lc3 {

    /* renamed from: f */
    private static final byte[] f32364f = new byte[0];

    /* renamed from: a */
    private final jm3 f32365a;

    /* renamed from: b */
    private final String f32366b;

    /* renamed from: c */
    private final byte[] f32367c;

    /* renamed from: d */
    private final em3 f32368d;

    /* renamed from: e */
    private final int f32369e;

    public gm3(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, em3 em3) throws GeneralSecurityException {
        km3.m33988c(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f32365a = new jm3(eCPublicKey);
        this.f32367c = bArr;
        this.f32366b = str;
        this.f32369e = i;
        this.f32368d = em3;
    }

    /* renamed from: a */
    public final byte[] mo32167a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        im3 a = this.f32365a.mo32907a(this.f32366b, this.f32367c, bArr2, this.f32368d.zza(), this.f32369e);
        byte[] a2 = this.f32368d.mo31604a(a.mo32701b()).mo35614a(bArr, f32364f);
        byte[] a3 = a.mo32700a();
        return ByteBuffer.allocate(a3.length + a2.length).put(a3).put(a2).array();
    }
}
