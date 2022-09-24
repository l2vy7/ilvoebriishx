package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.internal.dd */
/* compiled from: IMASDK */
final class C3930dd extends C3981fa {
    private final String TXXX;

    C3930dd(String str) {
        Objects.requireNonNull(str, "Null TXXX");
        this.TXXX = str;
    }

    /* access modifiers changed from: package-private */
    public String TXXX() {
        return this.TXXX;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3981fa) {
            return this.TXXX.equals(((C3981fa) obj).TXXX());
        }
        return false;
    }

    public int hashCode() {
        return this.TXXX.hashCode() ^ 1000003;
    }

    public String toString() {
        String str = this.TXXX;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
        sb.append("TimedMetadataWithKeys{TXXX=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
