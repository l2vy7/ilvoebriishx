package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bfy */
/* compiled from: IMASDK */
public final class bfy {

    /* renamed from: a */
    private static final int f16268a;

    static {
        String property = System.getProperty("java.version");
        int i = 1;
        try {
            String[] split = property.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt != 1) {
                i = parseInt;
            } else if (split.length > 1) {
                i = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (i == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < property.length(); i2++) {
                    char charAt = property.charAt(i2);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb.append(charAt);
                }
                i = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i = -1;
            }
        }
        if (i == -1) {
            i = 6;
        }
        f16268a = i;
    }

    /* renamed from: a */
    public static int m15841a() {
        return f16268a;
    }

    /* renamed from: b */
    public static boolean m15842b() {
        return f16268a >= 9;
    }
}
