package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.r2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8107r2 {

    /* renamed from: e */
    private static final byte[] f38502e = {0, 0, 1};

    /* renamed from: a */
    private boolean f38503a;

    /* renamed from: b */
    public int f38504b;

    /* renamed from: c */
    public int f38505c;

    /* renamed from: d */
    public byte[] f38506d = new byte[128];

    public C8107r2(int i) {
    }

    /* renamed from: a */
    public final void mo34495a(byte[] bArr, int i, int i2) {
        if (this.f38503a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f38506d;
            int length = bArr2.length;
            int i4 = this.f38504b + i3;
            if (length < i4) {
                this.f38506d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f38506d, this.f38504b, i3);
            this.f38504b += i3;
        }
    }

    /* renamed from: b */
    public final void mo34496b() {
        this.f38503a = false;
        this.f38504b = 0;
        this.f38505c = 0;
    }

    /* renamed from: c */
    public final boolean mo34497c(int i, int i2) {
        if (this.f38503a) {
            int i3 = this.f38504b - i2;
            this.f38504b = i3;
            if (this.f38505c == 0 && i == 181) {
                this.f38505c = i3;
            } else {
                this.f38503a = false;
                return true;
            }
        } else if (i == 179) {
            this.f38503a = true;
        }
        mo34495a(f38502e, 0, 3);
        return false;
    }
}
