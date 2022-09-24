package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amq */
/* compiled from: IMASDK */
public final class amq {

    /* renamed from: a */
    public final String f15323a;

    private amq(String str) {
        this.f15323a = str;
    }

    /* renamed from: a */
    public static amq m14259a(alw alw) {
        String str;
        alw.mo13954l(2);
        int o = alw.mo13957o();
        int i = o >> 1;
        int o2 = (alw.mo13957o() >> 3) | ((o & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = o2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str.length() + 24 + str2.length());
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(str2);
        sb.append(o2);
        return new amq(sb.toString());
    }
}
