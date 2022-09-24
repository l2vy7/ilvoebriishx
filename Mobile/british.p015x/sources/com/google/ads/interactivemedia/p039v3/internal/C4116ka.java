package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Build;
import java.util.HashSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ka */
/* compiled from: IMASDK */
public final class C4116ka {

    /* renamed from: a */
    private static final HashSet<String> f17632a = new HashSet<>();

    /* renamed from: b */
    private static String f17633b = "goog.exo.core";

    static {
        new StringBuilder(String.valueOf(Build.VERSION.RELEASE).length() + 57);
    }

    /* renamed from: a */
    public static synchronized String m17668a() {
        String str;
        synchronized (C4116ka.class) {
            str = f17633b;
        }
        return str;
    }

    /* renamed from: b */
    public static synchronized void m17669b(String str) {
        synchronized (C4116ka.class) {
            if (f17632a.add(str)) {
                String str2 = f17633b;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                f17633b = sb.toString();
            }
        }
    }
}
