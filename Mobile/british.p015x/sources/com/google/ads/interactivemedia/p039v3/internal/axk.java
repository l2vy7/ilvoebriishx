package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.axk */
/* compiled from: IMASDK */
final class axk implements Comparable<axk> {

    /* renamed from: a */
    private final byte[] f15877a;

    /* synthetic */ axk(byte[] bArr) {
        this.f15877a = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        axk axk = (axk) obj;
        int length = this.f15877a.length;
        int length2 = axk.f15877a.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f15877a;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = axk.f15877a[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof axk)) {
            return false;
        }
        return Arrays.equals(this.f15877a, ((axk) obj).f15877a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15877a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(r2 + r2);
        for (byte b : this.f15877a) {
            byte b2 = b & 255;
            sb.append("0123456789abcdef".charAt(b2 >> 4));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        return sb.toString();
    }
}
