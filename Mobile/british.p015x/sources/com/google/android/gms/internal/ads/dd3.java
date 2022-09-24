package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class dd3 implements Comparable<dd3> {

    /* renamed from: b */
    private final byte[] f30722b;

    /* synthetic */ dd3(byte[] bArr, cd3 cd3) {
        this.f30722b = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        dd3 dd3 = (dd3) obj;
        int length = this.f30722b.length;
        int length2 = dd3.f30722b.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f30722b;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = dd3.f30722b[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dd3)) {
            return false;
        }
        return Arrays.equals(this.f30722b, ((dd3) obj).f30722b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f30722b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(r2 + r2);
        for (byte b : this.f30722b) {
            byte b2 = b & 255;
            sb.append("0123456789abcdef".charAt(b2 >> 4));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        return sb.toString();
    }
}
