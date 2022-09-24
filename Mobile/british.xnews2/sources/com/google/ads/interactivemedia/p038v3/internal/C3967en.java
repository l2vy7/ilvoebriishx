package com.google.ads.interactivemedia.p038v3.internal;

import com.google.ads.interactivemedia.p038v3.impl.data.C3791bd;

/* renamed from: com.google.ads.interactivemedia.v3.internal.en */
/* compiled from: IMASDK */
final class C3967en implements awf<C3791bd> {

    /* renamed from: a */
    final /* synthetic */ String f16998a;

    /* renamed from: b */
    final /* synthetic */ C3971er f16999b;

    C3967en(C3971er erVar, String str) {
        this.f16999b = erVar;
        this.f16998a = str;
    }

    /* renamed from: a */
    public final void mo14697a(Throwable th) {
        C4257pg.m18527f("Failure to make Native-layer network request", th);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14698b(Object obj) {
        this.f16999b.f17003b.mo15717o(new C3949dw(C3947du.nativeXhr, C3948dv.nativeResponse, this.f16998a, (C3791bd) obj));
    }
}
