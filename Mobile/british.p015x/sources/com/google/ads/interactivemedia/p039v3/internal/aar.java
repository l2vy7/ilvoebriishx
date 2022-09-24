package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aar */
/* compiled from: IMASDK */
final class aar implements ajg {

    /* renamed from: a */
    private final ajg f13960a;

    /* renamed from: b */
    private final int f13961b;

    /* renamed from: c */
    private final aaq f13962c;

    /* renamed from: d */
    private final byte[] f13963d;

    /* renamed from: e */
    private int f13964e;

    public aar(ajg ajg, int i, aaq aaq) {
        aup.m14885p(i > 0);
        this.f13960a = ajg;
        this.f13961b = i;
        this.f13962c = aaq;
        this.f13963d = new byte[1];
        this.f13964e = i;
    }

    /* renamed from: a */
    public final int mo13294a(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f13964e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.f13960a.mo13294a(this.f13963d, 0, 1) != -1) {
                int i5 = (this.f13963d[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int a = this.f13960a.mo13294a(bArr2, i4, i6);
                        if (a != -1) {
                            i4 += a;
                            i6 -= a;
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
                        this.f13962c.mo13293a(new alw(bArr2, i5));
                    }
                }
                i3 = this.f13961b;
                this.f13964e = i3;
            }
            return -1;
        }
        int a2 = this.f13960a.mo13294a(bArr, i, Math.min(i3, i2));
        if (a2 != -1) {
            this.f13964e -= a2;
        }
        return a2;
    }

    /* renamed from: b */
    public final void mo13295b(akp akp) {
        aup.m14890u(akp);
        this.f13960a.mo13295b(akp);
    }

    /* renamed from: c */
    public final long mo13296c(ajk ajk) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final Uri mo13297d() {
        return this.f13960a.mo13297d();
    }

    /* renamed from: e */
    public final Map<String, List<String>> mo13298e() {
        return this.f13960a.mo13298e();
    }

    /* renamed from: f */
    public final void mo13299f() {
        throw new UnsupportedOperationException();
    }
}
