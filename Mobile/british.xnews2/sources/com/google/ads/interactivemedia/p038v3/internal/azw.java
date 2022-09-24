package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.azw */
/* compiled from: IMASDK */
public final class azw {

    /* renamed from: a */
    private final aws f15934a;

    /* renamed from: b */
    private final awv f15935b;

    public azw(aws aws) {
        this.f15934a = aws;
        this.f15935b = null;
    }

    public azw(awv awv) {
        this.f15934a = null;
        this.f15935b = awv;
    }

    /* renamed from: a */
    public final byte[] mo14781a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        aws aws = this.f15934a;
        if (aws != null) {
            return aws.mo14715a(bArr, bArr2);
        }
        return this.f15935b.mo14718a(bArr, bArr2);
    }
}
