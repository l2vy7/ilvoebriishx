package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.uq3;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class oc3<KeyFormatProtoT extends uq3, KeyProtoT extends uq3> {

    /* renamed from: a */
    final tc3<KeyFormatProtoT, KeyProtoT> f36384a;

    oc3(tc3<KeyFormatProtoT, KeyProtoT> tc3) {
        this.f36384a = tc3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final KeyProtoT mo33866a(eo3 eo3) throws GeneralSecurityException, wp3 {
        KeyFormatProtoT a = this.f36384a.mo30665a(eo3);
        this.f36384a.mo30668e(a);
        return this.f36384a.mo30666c(a);
    }
}
