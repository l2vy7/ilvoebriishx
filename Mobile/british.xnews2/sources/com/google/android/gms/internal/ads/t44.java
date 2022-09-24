package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class t44 implements yd1 {

    /* renamed from: a */
    private final yd1 f39268a;

    /* renamed from: b */
    private final int f39269b;

    /* renamed from: c */
    private final s44 f39270c;

    /* renamed from: d */
    private final byte[] f39271d;

    /* renamed from: e */
    private int f39272e;

    public t44(yd1 yd1, int i, s44 s44) {
        nu1.m20745d(i > 0);
        this.f39268a = yd1;
        this.f39269b = i;
        this.f39270c = s44;
        this.f39271d = new byte[1];
        this.f39272e = i;
    }

    /* renamed from: b */
    public final int mo30477b(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f39272e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.f39268a.mo30477b(this.f39271d, 0, 1) != -1) {
                int i5 = (this.f39271d[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int b = this.f39268a.mo30477b(bArr2, i4, i6);
                        if (b != -1) {
                            i4 += b;
                            i6 -= b;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.f39270c.mo34660a(new uq2(bArr2, i5));
                    }
                }
                i3 = this.f39269b;
                this.f39272e = i3;
            }
            return -1;
        }
        int b2 = this.f39268a.mo30477b(bArr, i, Math.min(i3, i2));
        if (b2 != -1) {
            this.f39272e -= b2;
        }
        return b2;
    }

    /* renamed from: h */
    public final void mo30796h(mt1 mt1) {
        Objects.requireNonNull(mt1);
        this.f39268a.mo30796h(mt1);
    }

    /* renamed from: i */
    public final long mo30478i(ci1 ci1) {
        throw new UnsupportedOperationException();
    }

    public final Map<String, List<String>> zza() {
        return this.f39268a.zza();
    }

    public final Uri zzi() {
        return this.f39268a.zzi();
    }

    public final void zzj() {
        throw new UnsupportedOperationException();
    }
}
