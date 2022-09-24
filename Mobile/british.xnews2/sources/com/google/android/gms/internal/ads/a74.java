package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class a74 {

    /* renamed from: a */
    public final long f29551a;

    /* renamed from: b */
    public final long f29552b;

    public a74(long j, long j2) {
        this.f29551a = j;
        this.f29552b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a74)) {
            return false;
        }
        a74 a74 = (a74) obj;
        return this.f29551a == a74.f29551a && this.f29552b == a74.f29552b;
    }

    public final int hashCode() {
        return (((int) this.f29551a) * 31) + ((int) this.f29552b);
    }
}
