package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.uq3;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class tc3<KeyFormatProtoT extends uq3, KeyT> {

    /* renamed from: a */
    private final Class<KeyFormatProtoT> f39385a;

    public tc3(Class<KeyFormatProtoT> cls) {
        this.f39385a = cls;
    }

    /* renamed from: a */
    public abstract KeyFormatProtoT mo30665a(eo3 eo3) throws wp3;

    /* renamed from: b */
    public final Class<KeyFormatProtoT> mo34902b() {
        return this.f39385a;
    }

    /* renamed from: c */
    public abstract KeyT mo30666c(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    /* renamed from: d */
    public Map<String, sc3<KeyFormatProtoT>> mo30667d() throws GeneralSecurityException {
        return Collections.emptyMap();
    }

    /* renamed from: e */
    public abstract void mo30668e(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
}
