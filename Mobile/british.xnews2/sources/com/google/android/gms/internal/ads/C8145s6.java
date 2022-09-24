package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.android.gms.internal.ads.s6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8145s6 {
    /* renamed from: a */
    public static long m37329a(String str) {
        try {
            return m37332d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if (SessionDescription.SUPPORTED_SDP_VERSION.equals(str) || "-1".equals(str)) {
                C7745h6.m32821d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0;
            }
            C7745h6.m32820c(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    /* renamed from: b */
    public static C7597d5 m37330b(C8074q5 q5Var) {
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        long j5;
        C8074q5 q5Var2 = q5Var;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = q5Var2.f37864c;
        if (map == null) {
            return null;
        }
        String str = map.get(RtspHeaders.DATE);
        long a = str != null ? m37329a(str) : 0;
        String str2 = map.get(RtspHeaders.CACHE_CONTROL);
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j = 0;
        }
        String str3 = map.get(RtspHeaders.EXPIRES);
        long a2 = str3 != null ? m37329a(str3) : 0;
        String str4 = map.get("Last-Modified");
        long a3 = str4 != null ? m37329a(str4) : 0;
        String str5 = map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j);
                j5 = (j * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (a <= 0 || a2 < a) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (a2 - a);
                j3 = j4;
            }
        }
        C7597d5 d5Var = new C7597d5();
        d5Var.f30636a = q5Var2.f37863b;
        d5Var.f30637b = str5;
        d5Var.f30641f = j4;
        d5Var.f30640e = j3;
        d5Var.f30638c = a;
        d5Var.f30639d = a3;
        d5Var.f30642g = map;
        d5Var.f30643h = q5Var2.f37865d;
        return d5Var;
    }

    /* renamed from: c */
    static String m37331c(long j) {
        return m37332d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    /* renamed from: d */
    private static SimpleDateFormat m37332d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
