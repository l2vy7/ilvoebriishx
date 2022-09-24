package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.mh */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7941mh {

    /* renamed from: a */
    private final C7544bm f35515a = new C7544bm(8);

    /* renamed from: b */
    private int f35516b;

    /* renamed from: b */
    private final long m34788b(C8121rg rgVar) throws IOException, InterruptedException {
        int i = 0;
        rgVar.mo34537g(this.f35515a.f30037a, 0, 1, false);
        byte b = this.f35515a.f30037a[0] & 255;
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
        rgVar.mo34537g(this.f35515a.f30037a, 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (this.f35515a.f30037a[i] & 255) + (i4 << 8);
        }
        this.f35516b += i3 + 1;
        return (long) i4;
    }

    /* renamed from: a */
    public final boolean mo33542a(C8121rg rgVar) throws IOException, InterruptedException {
        long c = rgVar.mo34533c();
        long j = 1024;
        if (c != -1 && c <= 1024) {
            j = c;
        }
        int i = (int) j;
        rgVar.mo34537g(this.f35515a.f30037a, 0, 4, false);
        long m = this.f35515a.mo30716m();
        this.f35516b = 4;
        while (m != 440786851) {
            int i2 = this.f35516b + 1;
            this.f35516b = i2;
            if (i2 == i) {
                return false;
            }
            rgVar.mo34537g(this.f35515a.f30037a, 0, 1, false);
            m = ((m << 8) & -256) | ((long) (this.f35515a.f30037a[0] & 255));
        }
        long b = m34788b(rgVar);
        long j2 = (long) this.f35516b;
        if (b != Long.MIN_VALUE && (c == -1 || j2 + b < c)) {
            while (true) {
                long j3 = (long) this.f35516b;
                long j4 = j2 + b;
                if (j3 < j4) {
                    if (m34788b(rgVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long b2 = m34788b(rgVar);
                    if (b2 < 0) {
                        return false;
                    }
                    if (b2 != 0) {
                        rgVar.mo34536f((int) b2, false);
                        this.f35516b = (int) (((long) this.f35516b) + b2);
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
        }
        return false;
    }
}
