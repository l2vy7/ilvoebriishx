package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;
import java.util.Random;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ack */
/* compiled from: IMASDK */
public final class ack {

    /* renamed from: a */
    private final Random f14167a;

    /* renamed from: b */
    private final int[] f14168b;

    /* renamed from: c */
    private final int[] f14169c;

    public ack() {
        this(new Random());
    }

    /* renamed from: a */
    public final int mo13429a() {
        return this.f14168b.length;
    }

    /* renamed from: b */
    public final int mo13430b(int i) {
        int i2 = this.f14169c[i] + 1;
        int[] iArr = this.f14168b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo13431c(int i) {
        int i2 = this.f14169c[i] - 1;
        if (i2 >= 0) {
            return this.f14168b[i2];
        }
        return -1;
    }

    /* renamed from: d */
    public final int mo13432d() {
        int[] iArr = this.f14168b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    /* renamed from: e */
    public final int mo13433e() {
        int[] iArr = this.f14168b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    /* renamed from: f */
    public final ack mo13434f(int i, int i2) {
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            iArr[i4] = this.f14167a.nextInt(this.f14168b.length + 1);
            int i5 = i4 + 1;
            int nextInt = this.f14167a.nextInt(i5);
            iArr2[i4] = iArr2[nextInt];
            iArr2[nextInt] = i4 + i;
            i4 = i5;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[(this.f14168b.length + i2)];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr4 = this.f14168b;
            if (i3 >= iArr4.length + i2) {
                return new ack(iArr3, new Random(this.f14167a.nextLong()));
            }
            if (i6 >= i2 || i7 != iArr[i6]) {
                int i8 = i7 + 1;
                int i9 = iArr4[i7];
                iArr3[i3] = i9;
                if (i9 >= i) {
                    iArr3[i3] = i9 + i2;
                }
                i7 = i8;
            } else {
                iArr3[i3] = iArr2[i6];
                i6++;
            }
            i3++;
        }
    }

    /* renamed from: g */
    public final ack mo13435g(int i, int i2) {
        int i3 = i2 - i;
        int[] iArr = new int[(this.f14168b.length - i3)];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = this.f14168b;
            if (i4 >= iArr2.length) {
                return new ack(iArr, new Random(this.f14167a.nextLong()));
            }
            int i6 = iArr2[i4];
            if (i6 < i || i6 >= i2) {
                int i7 = i4 - i5;
                if (i6 >= i) {
                    i6 -= i3;
                }
                iArr[i7] = i6;
            } else {
                i5++;
            }
            i4++;
        }
    }

    /* renamed from: h */
    public final ack mo13436h() {
        return new ack(new Random(this.f14167a.nextLong()));
    }

    private ack(Random random) {
        this(new int[0], random);
    }

    private ack(int[] iArr, Random random) {
        this.f14168b = iArr;
        this.f14167a = random;
        this.f14169c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f14169c[iArr[i]] = i;
        }
    }
}
