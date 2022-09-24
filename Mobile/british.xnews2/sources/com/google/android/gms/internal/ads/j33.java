package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class j33 extends i33 {

    /* renamed from: a */
    private final char f33739a;

    j33(char c) {
        this.f33739a = c;
    }

    /* renamed from: a */
    public final boolean mo32820a(char c) {
        return c == this.f33739a;
    }

    public final String toString() {
        int i = this.f33739a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(copyValueOf);
        sb.append("')");
        return sb.toString();
    }
}
