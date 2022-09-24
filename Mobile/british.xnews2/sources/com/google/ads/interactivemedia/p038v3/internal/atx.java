package com.google.ads.interactivemedia.p038v3.internal;

import java.io.Serializable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atx */
/* compiled from: IMASDK */
final class atx implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Object[] f15741a;

    atx(Object[] objArr) {
        this.f15741a = objArr;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return atz.m14812n(this.f15741a);
    }
}
