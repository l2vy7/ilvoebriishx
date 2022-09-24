package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zc4 {

    /* renamed from: a */
    public final int f42424a;

    /* renamed from: b */
    public final byte[] f42425b;

    /* renamed from: c */
    public final int f42426c;

    /* renamed from: d */
    public final int f42427d;

    public zc4(int i, byte[] bArr, int i2, int i3) {
        this.f42424a = i;
        this.f42425b = bArr;
        this.f42426c = i2;
        this.f42427d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zc4.class == obj.getClass()) {
            zc4 zc4 = (zc4) obj;
            return this.f42424a == zc4.f42424a && this.f42426c == zc4.f42426c && this.f42427d == zc4.f42427d && Arrays.equals(this.f42425b, zc4.f42425b);
        }
    }

    public final int hashCode() {
        return (((((this.f42424a * 31) + Arrays.hashCode(this.f42425b)) * 31) + this.f42426c) * 31) + this.f42427d;
    }
}
