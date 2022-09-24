package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.nh */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7979nh {

    /* renamed from: d */
    private static final long[] f36012d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f36013a = new byte[8];

    /* renamed from: b */
    private int f36014b;

    /* renamed from: c */
    private int f36015c;

    /* renamed from: b */
    public static int m35156b(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = ((f36012d[i2] & ((long) i)) > 0 ? 1 : ((f36012d[i2] & ((long) i)) == 0 ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static long m35157c(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f36012d[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: a */
    public final int mo33698a() {
        return this.f36015c;
    }

    /* renamed from: d */
    public final void mo33699d() {
        this.f36014b = 0;
        this.f36015c = 0;
    }

    /* renamed from: e */
    public final long mo33700e(C8121rg rgVar, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.f36014b == 0) {
            if (!rgVar.mo34538h(this.f36013a, 0, 1, z)) {
                return -1;
            }
            int b = m35156b(this.f36013a[0] & 255);
            this.f36015c = b;
            if (b != -1) {
                this.f36014b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f36015c;
        if (i2 > i) {
            this.f36014b = 0;
            return -2;
        }
        if (i2 != 1) {
            rgVar.mo34538h(this.f36013a, 1, i2 - 1, false);
        }
        this.f36014b = 0;
        return m35157c(this.f36013a, this.f36015c, z2);
    }
}
