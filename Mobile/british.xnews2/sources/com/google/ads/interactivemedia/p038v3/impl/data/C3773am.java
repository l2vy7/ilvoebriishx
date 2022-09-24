package com.google.ads.interactivemedia.p038v3.impl.data;

import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.am */
/* compiled from: IMASDK */
final class C3773am extends C3797bj {
    private final long currentTime;
    private final long duration;
    private final String timeUnit;

    C3773am(long j, long j2, String str) {
        this.currentTime = j;
        this.duration = j2;
        Objects.requireNonNull(str, "Null timeUnit");
        this.timeUnit = str;
    }

    public long currentTime() {
        return this.currentTime;
    }

    public long duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3797bj) {
            C3797bj bjVar = (C3797bj) obj;
            return this.currentTime == bjVar.currentTime() && this.duration == bjVar.duration() && this.timeUnit.equals(bjVar.timeUnit());
        }
    }

    public int hashCode() {
        long j = this.currentTime;
        long j2 = this.duration;
        return this.timeUnit.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String timeUnit() {
        return this.timeUnit;
    }

    public String toString() {
        long j = this.currentTime;
        long j2 = this.duration;
        String str = this.timeUnit;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 90);
        sb.append("TimeUpdateData{currentTime=");
        sb.append(j);
        sb.append(", duration=");
        sb.append(j2);
        sb.append(", timeUnit=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
