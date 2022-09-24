package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.tf */
/* compiled from: IMASDK */
final class C4364tf {

    /* renamed from: a */
    private static final long[] f18794a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: b */
    private final byte[] f18795b = new byte[8];

    /* renamed from: c */
    private int f18796c;

    /* renamed from: d */
    private int f18797d;

    /* renamed from: d */
    public static int m18951d(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = ((f18794a[i2] & ((long) i)) > 0 ? 1 : ((f18794a[i2] & ((long) i)) == 0 ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static long m18952e(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f18794a[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: a */
    public final void mo16653a() {
        this.f18796c = 0;
        this.f18797d = 0;
    }

    /* renamed from: b */
    public final long mo16654b(C4307rc rcVar, boolean z, boolean z2, int i) throws IOException {
        if (this.f18796c == 0) {
            if (!rcVar.mo16595b(this.f18795b, 0, 1, z)) {
                return -1;
            }
            int d = m18951d(this.f18795b[0] & 255);
            this.f18797d = d;
            if (d != -1) {
                this.f18796c = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f18797d;
        if (i2 > i) {
            this.f18796c = 0;
            return -2;
        }
        if (i2 != 1) {
            rcVar.mo16596c(this.f18795b, 1, i2 - 1);
        }
        this.f18796c = 0;
        return m18952e(this.f18795b, this.f18797d, z2);
    }

    /* renamed from: c */
    public final int mo16655c() {
        return this.f18797d;
    }
}
