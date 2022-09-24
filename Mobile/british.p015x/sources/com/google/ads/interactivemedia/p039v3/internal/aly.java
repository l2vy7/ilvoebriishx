package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Comparator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aly */
final /* synthetic */ class aly implements Comparator {

    /* renamed from: a */
    static final Comparator f15256a = new aly();

    /* renamed from: b */
    static final Comparator f15257b = new aly((byte[]) null);

    /* renamed from: c */
    private final /* synthetic */ int f15258c = 0;

    private aly() {
    }

    private aly(byte[] bArr) {
    }

    public final int compare(Object obj, Object obj2) {
        if (this.f15258c != 0) {
            return ((alz) obj).f15259a - ((alz) obj2).f15259a;
        }
        return Float.compare(((alz) obj).f15261c, ((alz) obj2).f15261c);
    }
}
