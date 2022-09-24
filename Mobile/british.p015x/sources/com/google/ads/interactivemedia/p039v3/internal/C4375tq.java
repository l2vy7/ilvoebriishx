package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.tq */
/* compiled from: IMASDK */
class C4375tq {

    /* renamed from: d */
    public final int f18836d;

    public C4375tq(int i) {
        this.f18836d = i;
    }

    /* renamed from: e */
    public static int m19003e(int i) {
        return (i >> 24) & 255;
    }

    /* renamed from: f */
    public static int m19004f(int i) {
        return i & 16777215;
    }

    /* renamed from: g */
    public static String m19005g(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return m19005g(this.f18836d);
    }
}
