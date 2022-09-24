package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xc4 {

    /* renamed from: c */
    public static final xc4 f41130c = new xc4(0, 0);

    /* renamed from: a */
    public final long f41131a;

    /* renamed from: b */
    public final long f41132b;

    public xc4(long j, long j2) {
        this.f41131a = j;
        this.f41132b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xc4.class == obj.getClass()) {
            xc4 xc4 = (xc4) obj;
            return this.f41131a == xc4.f41131a && this.f41132b == xc4.f41132b;
        }
    }

    public final int hashCode() {
        return (((int) this.f41131a) * 31) + ((int) this.f41132b);
    }

    public final String toString() {
        long j = this.f41131a;
        long j2 = this.f41132b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j);
        sb.append(", position=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
