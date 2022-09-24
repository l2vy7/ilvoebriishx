package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ru */
/* compiled from: IMASDK */
public final class C4325ru {

    /* renamed from: a */
    public static final C4325ru f18538a = new C4325ru(0, 0);

    /* renamed from: b */
    public final long f18539b;

    /* renamed from: c */
    public final long f18540c;

    public C4325ru(long j, long j2) {
        this.f18539b = j;
        this.f18540c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4325ru.class == obj.getClass()) {
            C4325ru ruVar = (C4325ru) obj;
            return this.f18539b == ruVar.f18539b && this.f18540c == ruVar.f18540c;
        }
    }

    public final int hashCode() {
        return (((int) this.f18539b) * 31) + ((int) this.f18540c);
    }

    public final String toString() {
        long j = this.f18539b;
        long j2 = this.f18540c;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j);
        sb.append(", position=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
