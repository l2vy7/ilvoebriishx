package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class z00 extends a10 {
    z00() {
    }

    /* renamed from: b */
    private static final String m40113b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < str.length() && str.charAt(i2) == ',') {
            i2++;
        }
        while (length > 0) {
            int i3 = length - 1;
            if (str.charAt(i3) != ',') {
                break;
            }
            length = i3;
        }
        if (length < i2) {
            return null;
        }
        if (i2 != 0) {
            i = i2;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    /* renamed from: a */
    public final String mo30285a(String str, String str2) {
        String b = m40113b(str);
        String b2 = m40113b(str2);
        if (TextUtils.isEmpty(b)) {
            return b2;
        }
        if (TextUtils.isEmpty(b2)) {
            return b;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 1 + String.valueOf(b2).length());
        sb.append(b);
        sb.append(",");
        sb.append(b2);
        return sb.toString();
    }
}
