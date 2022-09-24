package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.te */
/* compiled from: IMASDK */
final class C4363te {

    /* renamed from: a */
    private final alw f18792a = new alw(8);

    /* renamed from: b */
    private int f18793b;

    /* renamed from: b */
    private final long m18949b(C4307rc rcVar) throws IOException {
        int i = 0;
        rcVar.mo16600g(this.f18792a.mo13952j(), 0, 1);
        byte b = this.f18792a.mo13952j()[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (i2 ^ -1);
        rcVar.mo16600g(this.f18792a.mo13952j(), 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f18792a.mo13952j()[i] & 255) + (i4 << 8);
        }
        this.f18793b += i3 + 1;
        return (long) i4;
    }

    /* renamed from: a */
    public final boolean mo16652a(C4307rc rcVar) throws IOException {
        long m = rcVar.mo16606m();
        long j = 1024;
        if (m != -1 && m <= 1024) {
            j = m;
        }
        int i = (int) j;
        rcVar.mo16600g(this.f18792a.mo13952j(), 0, 4);
        long u = this.f18792a.mo13963u();
        this.f18793b = 4;
        while (u != 440786851) {
            int i2 = this.f18793b + 1;
            this.f18793b = i2;
            if (i2 == i) {
                return false;
            }
            rcVar.mo16600g(this.f18792a.mo13952j(), 0, 1);
            u = ((u << 8) & -256) | ((long) (this.f18792a.mo13952j()[0] & 255));
        }
        long b = m18949b(rcVar);
        long j2 = (long) this.f18793b;
        if (b != Long.MIN_VALUE && (m == -1 || j2 + b < m)) {
            while (true) {
                long j3 = (long) this.f18793b;
                long j4 = j2 + b;
                if (j3 < j4) {
                    if (m18949b(rcVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long b2 = m18949b(rcVar);
                    if (b2 < 0) {
                        return false;
                    }
                    if (b2 != 0) {
                        int i3 = (int) b2;
                        rcVar.mo16602i(i3);
                        this.f18793b += i3;
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
        }
        return false;
    }
}
