package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yl */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8374yl {
    /* renamed from: a */
    public static boolean m39950a(String str) {
        return "audio".equals(m39952c(str));
    }

    /* renamed from: b */
    public static boolean m39951b(String str) {
        return "video".equals(m39952c(str));
    }

    /* renamed from: c */
    private static String m39952c(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        if (str.length() != 0) {
            str2 = "Invalid mime type: ".concat(str);
        } else {
            str2 = new String("Invalid mime type: ");
        }
        throw new IllegalArgumentException(str2);
    }
}
