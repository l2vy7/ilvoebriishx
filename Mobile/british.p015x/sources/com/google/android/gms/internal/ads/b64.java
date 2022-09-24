package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class b64 {

    /* renamed from: a */
    public final int f29914a;

    /* renamed from: b */
    public final boolean f29915b;

    public b64(int i, boolean z) {
        this.f29914a = i;
        this.f29915b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b64.class == obj.getClass()) {
            b64 b64 = (b64) obj;
            return this.f29914a == b64.f29914a && this.f29915b == b64.f29915b;
        }
    }

    public final int hashCode() {
        return (this.f29914a * 31) + (this.f29915b ? 1 : 0);
    }
}
