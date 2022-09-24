package com.google.android.gms.common.images;

/* renamed from: com.google.android.gms.common.images.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7364a {

    /* renamed from: a */
    private final int f29254a;

    /* renamed from: b */
    private final int f29255b;

    public C7364a(int i, int i2) {
        this.f29254a = i;
        this.f29255b = i2;
    }

    /* renamed from: a */
    public int mo30005a() {
        return this.f29255b;
    }

    /* renamed from: b */
    public int mo30006b() {
        return this.f29254a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7364a) {
            C7364a aVar = (C7364a) obj;
            return this.f29254a == aVar.f29254a && this.f29255b == aVar.f29255b;
        }
    }

    public int hashCode() {
        int i = this.f29255b;
        int i2 = this.f29254a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        int i = this.f29254a;
        int i2 = this.f29255b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}
