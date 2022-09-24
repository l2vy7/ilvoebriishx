package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.no */
/* compiled from: IMASDK */
public final class C4211no {

    /* renamed from: a */
    private final int[] f18093a;

    /* renamed from: b */
    private final int f18094b = 8;

    static {
        new C4211no(new int[]{2});
        new C4211no(new int[]{2, 5, 6});
    }

    public C4211no(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.f18093a = copyOf;
        Arrays.sort(copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4211no) && Arrays.equals(this.f18093a, ((C4211no) obj).f18093a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f18093a) * 31) + 8;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f18093a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(8);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
