package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class an3 extends ThreadLocal<Mac> {

    /* renamed from: a */
    final /* synthetic */ bn3 f29698a;

    an3(bn3 bn3) {
        this.f29698a = bn3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Mac initialValue() {
        try {
            Mac a = mm3.f35567f.mo33568a(this.f29698a.f30046b);
            a.init(this.f29698a.f30047c);
            return a;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
