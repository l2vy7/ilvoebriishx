package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ah */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7503ah {

    /* renamed from: a */
    public final int f29638a = 1;

    /* renamed from: b */
    public final byte[] f29639b;

    public C7503ah(int i, byte[] bArr) {
        this.f29639b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C7503ah.class == obj.getClass() && Arrays.equals(this.f29639b, ((C7503ah) obj).f29639b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f29639b) + 31;
    }
}
