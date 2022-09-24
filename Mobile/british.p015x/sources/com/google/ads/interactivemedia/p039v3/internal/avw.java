package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.avw */
/* compiled from: IMASDK */
public final class avw {
    static {
        Math.log(2.0d);
    }

    /* renamed from: a */
    public static boolean m14980a(double d) {
        if (Math.copySign(1.0d - d, 1.0d) <= 0.1d || d == 1.0d || (Double.isNaN(1.0d) && Double.isNaN(d))) {
            return true;
        }
        return false;
    }
}
