package com.startapp;

import android.net.LinkProperties;
import android.net.NetworkCapabilities;

/* renamed from: com.startapp.z */
/* compiled from: Sta */
public class C12457z {
    /* renamed from: a */
    public static String m53801a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities != null) {
            try {
                return m53802a(networkCapabilities.toString(), "Capabilities:").replaceAll("&", ",").toLowerCase();
            } catch (Throwable th) {
                C12356u2.m53522a(th);
            }
        }
        return "";
    }

    /* renamed from: b */
    public static int m53803b(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities != null) {
            try {
                return Integer.parseInt(m53802a(networkCapabilities.toString(), "Specifier:").replaceAll("<", "").replaceAll(">", ""));
            } catch (Throwable th) {
                C12356u2.m53522a(th);
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String m53800a(LinkProperties linkProperties) {
        if (linkProperties == null) {
            return "";
        }
        try {
            String a = m53802a(linkProperties.toString().replaceAll("\\[ ", "\\[").replaceAll(" \\]", "\\]"), "PcscfAddresses:");
            if (a.isEmpty()) {
                return "";
            }
            String replace = a.replace("[", "").replace("]", "");
            if (replace.lastIndexOf(",") == replace.length() - 1) {
                replace = replace.substring(0, replace.length() - 1);
            }
            return replace;
        } catch (Throwable th) {
            C12356u2.m53522a(th);
            return "";
        }
    }

    /* renamed from: a */
    private static String m53802a(String str, String str2) throws Exception {
        String substring = str.substring(str.indexOf(str2));
        String replaceAll = substring.replaceAll(str2 + " ", "");
        return replaceAll.substring(0, replaceAll.contains(" ") ? replaceAll.indexOf(" ") : replaceAll.length() - 1);
    }
}
