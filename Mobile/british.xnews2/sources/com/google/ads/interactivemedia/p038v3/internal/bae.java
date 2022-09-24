package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bae */
/* compiled from: IMASDK */
final class bae implements axh {

    /* renamed from: a */
    private final axl<axh> f15944a;

    /* renamed from: b */
    private final byte[] f15945b = {0};

    /* synthetic */ bae(axl axl) {
        this.f15944a = axl;
    }

    /* renamed from: a */
    public final byte[] mo14747a(byte[] bArr) throws GeneralSecurityException {
        if (this.f15944a.mo14756a().mo14750c().equals(bcr.LEGACY)) {
            return awr.m15065b(this.f15944a.mo14756a().mo14751d(), this.f15944a.mo14756a().mo14748a().mo14747a(awr.m15065b(bArr, this.f15945b)));
        }
        return awr.m15065b(this.f15944a.mo14756a().mo14751d(), this.f15944a.mo14756a().mo14748a().mo14747a(bArr));
    }
}
