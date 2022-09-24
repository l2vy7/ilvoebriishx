package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class u64 {

    /* renamed from: a */
    private final Random f39796a;

    /* renamed from: b */
    private final int[] f39797b;

    /* renamed from: c */
    private final int[] f39798c;

    public u64(int i) {
        this(0, new Random());
    }

    /* renamed from: a */
    public final int mo35131a() {
        int[] iArr = this.f39797b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo35132b() {
        int[] iArr = this.f39797b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo35133c() {
        return this.f39797b.length;
    }

    /* renamed from: d */
    public final int mo35134d(int i) {
        int i2 = this.f39798c[i] + 1;
        int[] iArr = this.f39797b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    /* renamed from: e */
    public final int mo35135e(int i) {
        int i2 = this.f39798c[i] - 1;
        if (i2 >= 0) {
            return this.f39797b[i2];
        }
        return -1;
    }

    /* renamed from: f */
    public final u64 mo35136f() {
        return new u64(0, new Random(this.f39796a.nextLong()));
    }

    /* renamed from: g */
    public final u64 mo35137g(int i, int i2) {
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            iArr[i4] = this.f39796a.nextInt(this.f39797b.length + 1);
            int i5 = i4 + 1;
            int nextInt = this.f39796a.nextInt(i5);
            iArr2[i4] = iArr2[nextInt];
            iArr2[nextInt] = i4;
            i4 = i5;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[(this.f39797b.length + i2)];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr4 = this.f39797b;
            if (i3 >= iArr4.length + i2) {
                return new u64(iArr3, new Random(this.f39796a.nextLong()));
            }
            if (i6 >= i2 || i7 != iArr[i6]) {
                int i8 = i7 + 1;
                int i9 = iArr4[i7];
                iArr3[i3] = i9;
                if (i9 >= 0) {
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

    /* renamed from: h */
    public final u64 mo35138h(int i, int i2) {
        int[] iArr = new int[(this.f39797b.length - i2)];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.f39797b;
            if (i3 >= iArr2.length) {
                return new u64(iArr, new Random(this.f39796a.nextLong()));
            }
            int i5 = iArr2[i3];
            if (i5 < 0 || i5 >= i2) {
                int i6 = i3 - i4;
                if (i5 >= 0) {
                    i5 -= i2;
                }
                iArr[i6] = i5;
            } else {
                i4++;
            }
            i3++;
        }
    }

    private u64(int i, Random random) {
        this(new int[0], random);
    }

    private u64(int[] iArr, Random random) {
        this.f39797b = iArr;
        this.f39796a = random;
        this.f39798c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f39798c[iArr[i]] = i;
        }
    }
}
