package com.google.ads.interactivemedia.p038v3.internal;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bga */
/* compiled from: IMASDK */
public final class bga extends Number {

    /* renamed from: a */
    private final String f16272a;

    public bga(String str) {
        this.f16272a = str;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f16272a);
    }

    public final double doubleValue() {
        return Double.parseDouble(this.f16272a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bga)) {
            return false;
        }
        String str = this.f16272a;
        String str2 = ((bga) obj).f16272a;
        return str == str2 || str.equals(str2);
    }

    public final float floatValue() {
        return Float.parseFloat(this.f16272a);
    }

    public final int hashCode() {
        return this.f16272a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f16272a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f16272a).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f16272a     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f16272a     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r1 = (int) r0
            return r1
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f16272a
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.bga.intValue():int");
    }

    public final long longValue() {
        try {
            return Long.parseLong(this.f16272a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f16272a).longValue();
        }
    }

    public final String toString() {
        return this.f16272a;
    }
}
