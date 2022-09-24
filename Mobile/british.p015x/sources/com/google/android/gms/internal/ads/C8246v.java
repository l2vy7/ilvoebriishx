package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.v */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8246v {

    /* renamed from: a */
    private final uq2 f40226a = new uq2(8);

    /* renamed from: b */
    private int f40227b;

    /* renamed from: b */
    private final long m38633b(wb4 wb4) throws IOException {
        qb4 qb4 = (qb4) wb4;
        int i = 0;
        qb4.mo33311e(this.f40226a.mo35238h(), 0, 1, false);
        byte b = this.f40226a.mo35238h()[0] & 255;
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
        qb4.mo33311e(this.f40226a.mo35238h(), 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (this.f40226a.mo35238h()[i] & 255) + (i4 << 8);
        }
        this.f40227b += i3 + 1;
        return (long) i4;
    }

    /* renamed from: a */
    public final boolean mo35342a(wb4 wb4) throws IOException {
        long zzc = wb4.zzc();
        long j = 1024;
        if (zzc != -1 && zzc <= 1024) {
            j = zzc;
        }
        int i = (int) j;
        qb4 qb4 = (qb4) wb4;
        qb4.mo33311e(this.f40226a.mo35238h(), 0, 4, false);
        long A = this.f40226a.mo35223A();
        this.f40227b = 4;
        while (A != 440786851) {
            int i2 = this.f40227b + 1;
            this.f40227b = i2;
            if (i2 == i) {
                return false;
            }
            qb4.mo33311e(this.f40226a.mo35238h(), 0, 1, false);
            A = ((A << 8) & -256) | ((long) (this.f40226a.mo35238h()[0] & 255));
        }
        long b = m38633b(wb4);
        long j2 = (long) this.f40227b;
        if (b != Long.MIN_VALUE && (zzc == -1 || j2 + b < zzc)) {
            while (true) {
                long j3 = (long) this.f40227b;
                long j4 = j2 + b;
                if (j3 < j4) {
                    if (m38633b(wb4) == Long.MIN_VALUE) {
                        return false;
                    }
                    long b2 = m38633b(wb4);
                    if (b2 < 0) {
                        return false;
                    }
                    if (b2 != 0) {
                        int i3 = (int) b2;
                        qb4.mo34304j(i3, false);
                        this.f40227b += i3;
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
        }
        return false;
    }
}
