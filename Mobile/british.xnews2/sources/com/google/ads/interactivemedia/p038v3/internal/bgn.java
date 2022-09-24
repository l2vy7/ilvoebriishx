package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bgn */
/* compiled from: IMASDK */
final class bgn extends bgo {
    bgn() {
    }

    /* renamed from: a */
    public final <T> T mo15081a(Class<T> cls) {
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(valueOf.length() + 16);
        sb.append("Cannot allocate ");
        sb.append(valueOf);
        throw new UnsupportedOperationException(sb.toString());
    }
}
