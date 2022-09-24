package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.x */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8316x {

    /* renamed from: d */
    private static final long[] f40971d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f40972a = new byte[8];

    /* renamed from: b */
    private int f40973b;

    /* renamed from: c */
    private int f40974c;

    /* renamed from: b */
    public static int m39314b(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = ((f40971d[i2] & ((long) i)) > 0 ? 1 : ((f40971d[i2] & ((long) i)) == 0 ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static long m39315c(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f40971d[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: a */
    public final int mo35700a() {
        return this.f40974c;
    }

    /* renamed from: d */
    public final long mo35701d(wb4 wb4, boolean z, boolean z2, int i) throws IOException {
        if (this.f40973b == 0) {
            if (!wb4.mo33310d(this.f40972a, 0, 1, z)) {
                return -1;
            }
            int b = m39314b(this.f40972a[0] & 255);
            this.f40974c = b;
            if (b != -1) {
                this.f40973b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f40974c;
        if (i2 > i) {
            this.f40973b = 0;
            return -2;
        }
        if (i2 != 1) {
            ((qb4) wb4).mo33310d(this.f40972a, 1, i2 - 1, false);
        }
        this.f40973b = 0;
        return m39315c(this.f40972a, this.f40974c, z2);
    }

    /* renamed from: e */
    public final void mo35702e() {
        this.f40973b = 0;
        this.f40974c = 0;
    }
}
