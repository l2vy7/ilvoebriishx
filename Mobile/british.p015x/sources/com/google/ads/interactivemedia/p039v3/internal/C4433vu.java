package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vu */
/* compiled from: IMASDK */
final class C4433vu {

    /* renamed from: d */
    private static final byte[] f19255d = {0, 0, 1};

    /* renamed from: a */
    public int f19256a;

    /* renamed from: b */
    public int f19257b;

    /* renamed from: c */
    public byte[] f19258c = new byte[128];

    /* renamed from: e */
    private boolean f19259e;

    /* renamed from: a */
    public final void mo16714a() {
        this.f19259e = false;
        this.f19256a = 0;
        this.f19257b = 0;
    }

    /* renamed from: b */
    public final boolean mo16715b(int i, int i2) {
        if (this.f19259e) {
            int i3 = this.f19256a - i2;
            this.f19256a = i3;
            if (this.f19257b == 0 && i == 181) {
                this.f19257b = i3;
            } else {
                this.f19259e = false;
                return true;
            }
        } else if (i == 179) {
            this.f19259e = true;
        }
        mo16716c(f19255d, 0, 3);
        return false;
    }

    /* renamed from: c */
    public final void mo16716c(byte[] bArr, int i, int i2) {
        if (this.f19259e) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f19258c;
            int length = bArr2.length;
            int i4 = this.f19256a + i3;
            if (length < i4) {
                this.f19258c = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f19258c, this.f19256a, i3);
            this.f19256a += i3;
        }
    }
}
