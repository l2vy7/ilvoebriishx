package com.startapp;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: com.startapp.m9 */
/* compiled from: Sta */
public class C12051m9 {

    /* renamed from: a */
    private static final String f53281a = "m9";

    /* renamed from: a */
    public static String m52597a(String str) {
        String str2;
        try {
            str2 = InetAddress.getByName(str).getCanonicalHostName();
        } catch (UnknownHostException e) {
            C12356u2.m53524b(e);
            str2 = null;
        }
        if (str2 != null && !str2.equals(str) && str2.contains("cloudfront")) {
            String[] split = str2.split("\\.");
            if (split.length > 0) {
                return m52598b(split[1]);
            }
        }
        return "";
    }

    /* renamed from: b */
    public static String m52598b(String str) {
        return (str == null || str.length() <= 2) ? "" : str.substring(0, 3);
    }
}
