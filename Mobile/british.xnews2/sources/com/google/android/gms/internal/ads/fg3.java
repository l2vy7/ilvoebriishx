package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class fg3 implements zc3 {

    /* renamed from: a */
    private final ed3<zc3> f31757a;

    /* renamed from: b */
    private final byte[] f31758b = {0};

    /* synthetic */ fg3(ed3 ed3, eg3 eg3) {
        this.f31757a = ed3;
    }

    /* renamed from: a */
    public final byte[] mo30971a(byte[] bArr) throws GeneralSecurityException {
        if (this.f31757a.mo31548b().mo30660d() == 4) {
            return zl3.m40379b(this.f31757a.mo31548b().mo30658b(), this.f31757a.mo31548b().mo30657a().mo30971a(zl3.m40379b(bArr, this.f31758b)));
        }
        return zl3.m40379b(this.f31757a.mo31548b().mo30658b(), this.f31757a.mo31548b().mo30657a().mo30971a(bArr));
    }
}
