package com.google.android.gms.internal.ads;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* renamed from: com.google.android.gms.internal.ads.x4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8321x4 extends C8357y4 {

    /* renamed from: c */
    private final byte[] f41021c;

    public C8321x4(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f41021c = bArr;
    }

    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f41021c;
    }
}
