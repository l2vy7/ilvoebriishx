package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sb4 {

    /* renamed from: a */
    public final String f38944a;

    private sb4(int i, int i2, String str) {
        this.f38944a = str;
    }

    /* renamed from: a */
    public static sb4 m37371a(uq2 uq2) {
        String str;
        uq2.mo35237g(2);
        int s = uq2.mo35249s();
        int i = s >> 1;
        int s2 = (uq2.mo35249s() >> 3) | ((s & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = s2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str.length() + 24 + str2.length());
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(str2);
        sb.append(s2);
        return new sb4(i, s2, sb.toString());
    }
}
