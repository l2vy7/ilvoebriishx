package com.google.ads.interactivemedia.p039v3.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bdv */
/* compiled from: IMASDK */
final class bdv extends ThreadLocal<Mac> {

    /* renamed from: a */
    final /* synthetic */ bdw f16191a;

    bdv(bdw bdw) {
        this.f16191a = bdw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Mac initialValue() {
        try {
            Mac a = bdo.f16177b.mo14949a(this.f16191a.f16193b);
            a.init(this.f16191a.f16194c);
            return a;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
