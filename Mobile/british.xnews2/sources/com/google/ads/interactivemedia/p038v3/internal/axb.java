package com.google.ads.interactivemedia.p038v3.internal;

import com.google.ads.interactivemedia.p038v3.internal.bln;
import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.axb */
/* compiled from: IMASDK */
public abstract class axb<KeyFormatProtoT extends bln, KeyT> {

    /* renamed from: a */
    private final Class<KeyFormatProtoT> f15866a;

    public axb(Class<KeyFormatProtoT> cls) {
        this.f15866a = cls;
    }

    /* renamed from: a */
    public final Class<KeyFormatProtoT> mo14728a() {
        return this.f15866a;
    }

    /* renamed from: b */
    public abstract void mo14729b(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    /* renamed from: c */
    public abstract KeyFormatProtoT mo14730c(bjq bjq) throws bkt;

    /* renamed from: d */
    public abstract KeyT mo14731d(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
}
