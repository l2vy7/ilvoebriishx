package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class uc4 {

    /* renamed from: a */
    public final xc4 f39824a;

    /* renamed from: b */
    public final xc4 f39825b;

    public uc4(xc4 xc4, xc4 xc42) {
        this.f39824a = xc4;
        this.f39825b = xc42;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uc4.class == obj.getClass()) {
            uc4 uc4 = (uc4) obj;
            return this.f39824a.equals(uc4.f39824a) && this.f39825b.equals(uc4.f39825b);
        }
    }

    public final int hashCode() {
        return (this.f39824a.hashCode() * 31) + this.f39825b.hashCode();
    }

    public final String toString() {
        String obj = this.f39824a.toString();
        String concat = this.f39824a.equals(this.f39825b) ? "" : ", ".concat(this.f39825b.toString());
        StringBuilder sb = new StringBuilder(obj.length() + 2 + concat.length());
        sb.append("[");
        sb.append(obj);
        sb.append(concat);
        sb.append("]");
        return sb.toString();
    }
}
