package com.google.ads.interactivemedia.p038v3.impl.data;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.s */
/* compiled from: IMASDK */
final class C3819s extends C3781au {
    private final double end;
    private final boolean played;
    private final double start;

    C3819s(double d, double d2, boolean z) {
        this.start = d;
        this.end = d2;
        this.played = z;
    }

    public double end() {
        return this.end;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3781au) {
            C3781au auVar = (C3781au) obj;
            return Double.doubleToLongBits(this.start) == Double.doubleToLongBits(auVar.start()) && Double.doubleToLongBits(this.end) == Double.doubleToLongBits(auVar.end()) && this.played == auVar.played();
        }
    }

    public int hashCode() {
        return (true != this.played ? 1237 : 1231) ^ ((((((int) ((Double.doubleToLongBits(this.start) >>> 32) ^ Double.doubleToLongBits(this.start))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.end) >>> 32) ^ Double.doubleToLongBits(this.end)))) * 1000003);
    }

    public boolean played() {
        return this.played;
    }

    public double start() {
        return this.start;
    }

    public String toString() {
        double d = this.start;
        double d2 = this.end;
        boolean z = this.played;
        StringBuilder sb = new StringBuilder(88);
        sb.append("CuePointData{start=");
        sb.append(d);
        sb.append(", end=");
        sb.append(d2);
        sb.append(", played=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
