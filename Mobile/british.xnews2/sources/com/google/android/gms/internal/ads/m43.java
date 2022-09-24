package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class m43 {
    @CheckForNull
    /* renamed from: a */
    public static String m20694a(@CheckForNull String str) {
        if (a43.m20177b(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public static String m20695b(@CheckForNull String str, @CheckForNull Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        String str3;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String sb2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    if (sb2.length() != 0) {
                        str3 = "Exception during lenientFormat for ".concat(sb2);
                    } else {
                        str3 = new String("Exception during lenientFormat for ");
                    }
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", str3, e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 9 + name2.length());
                    sb3.append("<");
                    sb3.append(sb2);
                    sb3.append(" threw ");
                    sb3.append(name2);
                    sb3.append(">");
                    str2 = sb3.toString();
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        StringBuilder sb4 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                sb4.append(str, i3, str.length());
            } else {
                sb4.append(str, i3, indexOf);
                sb4.append(objArr[i]);
                int i4 = i + 1;
                i3 = indexOf + 2;
                i = i4;
            }
        }
        sb4.append(str, i3, str.length());
        if (i < length2) {
            sb4.append(" [");
            sb4.append(objArr[i]);
            for (int i5 = i + 1; i5 < objArr.length; i5++) {
                sb4.append(", ");
                sb4.append(objArr[i5]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    /* renamed from: c */
    public static String m20696c(@CheckForNull String str) {
        return a43.m20176a(str);
    }

    /* renamed from: d */
    public static boolean m20697d(@CheckForNull String str) {
        return a43.m20177b(str);
    }
}
