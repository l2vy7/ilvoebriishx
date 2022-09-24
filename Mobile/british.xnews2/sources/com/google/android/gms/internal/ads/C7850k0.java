package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class C7850k0 {

    /* renamed from: a */
    public final int f34088a;

    public C7850k0(int i) {
        this.f34088a = i;
    }

    /* renamed from: a */
    public static int m33804a(int i) {
        return (i >> 24) & 255;
    }

    /* renamed from: b */
    public static String m33805b(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return m33805b(this.f34088a);
    }
}
