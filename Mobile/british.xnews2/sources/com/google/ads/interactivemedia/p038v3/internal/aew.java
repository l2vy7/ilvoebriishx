package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aew */
/* compiled from: IMASDK */
public final class aew {

    /* renamed from: a */
    public final long f14478a;

    /* renamed from: b */
    public final long f14479b;

    /* renamed from: c */
    private final String f14480c;

    /* renamed from: d */
    private int f14481d;

    public aew(String str, long j, long j2) {
        this.f14480c = str == null ? "" : str;
        this.f14478a = j;
        this.f14479b = j2;
    }

    /* renamed from: a */
    public final Uri mo13580a(String str) {
        return arh.m14605l(str, this.f14480c);
    }

    /* renamed from: b */
    public final String mo13581b(String str) {
        return arh.m14606m(str, this.f14480c);
    }

    /* renamed from: c */
    public final aew mo13582c(aew aew, String str) {
        String b = mo13581b(str);
        if (aew != null && b.equals(aew.mo13581b(str))) {
            long j = this.f14479b;
            long j2 = -1;
            if (j != -1) {
                long j3 = this.f14478a;
                if (j3 + j == aew.f14478a) {
                    long j4 = aew.f14479b;
                    if (j4 != -1) {
                        j2 = j + j4;
                    }
                    return new aew(b, j3, j2);
                }
            }
            long j5 = aew.f14479b;
            if (j5 != -1) {
                long j6 = aew.f14478a;
                if (j6 + j5 == this.f14478a) {
                    if (j != -1) {
                        j2 = j5 + j;
                    }
                    return new aew(b, j6, j2);
                }
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aew.class == obj.getClass()) {
            aew aew = (aew) obj;
            return this.f14478a == aew.f14478a && this.f14479b == aew.f14479b && this.f14480c.equals(aew.f14480c);
        }
    }

    public final int hashCode() {
        int i = this.f14481d;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((int) this.f14478a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f14479b)) * 31) + this.f14480c.hashCode();
        this.f14481d = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str = this.f14480c;
        long j = this.f14478a;
        long j2 = this.f14479b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 81);
        sb.append("RangedUri(referenceUri=");
        sb.append(str);
        sb.append(", start=");
        sb.append(j);
        sb.append(", length=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}
