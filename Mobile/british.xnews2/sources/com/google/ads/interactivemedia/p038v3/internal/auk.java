package com.google.ads.interactivemedia.p038v3.internal;

import java.io.Serializable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.auk */
/* compiled from: IMASDK */
final class auk implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Object[] f15764a;

    auk(Object[] objArr) {
        this.f15764a = objArr;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return aul.m14863k(this.f15764a);
    }
}
