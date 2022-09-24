package com.google.ads.interactivemedia.p039v3.internal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahr */
/* compiled from: IMASDK */
public final class ahr {

    /* renamed from: a */
    private static final Pattern f14871a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static void m13719a(alw alw) throws C4144lb {
        int h = alw.mo13950h();
        if (!m13720b(alw)) {
            alw.mo13951i(h);
            String valueOf = String.valueOf(alw.mo13941J());
            throw new C4144lb(valueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(valueOf) : new String("Expected WEBVTT. Got "));
        }
    }

    /* renamed from: b */
    public static boolean m13720b(alw alw) {
        String J = alw.mo13941J();
        return J != null && J.startsWith("WEBVTT");
    }

    /* renamed from: c */
    public static long m13721c(String str) throws NumberFormatException {
        String[] A = amm.m14184A(str, "\\.");
        long j = 0;
        for (String parseLong : amm.m14256z(A[0], ":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (A.length == 2) {
            j2 += Long.parseLong(A[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: d */
    public static Matcher m13722d(alw alw) {
        String J;
        while (true) {
            String J2 = alw.mo13941J();
            if (J2 == null) {
                return null;
            }
            if (f14871a.matcher(J2).matches()) {
                do {
                    J = alw.mo13941J();
                    if (J == null) {
                        break;
                    }
                } while (J.isEmpty());
            } else {
                Matcher matcher = ahq.f14870a.matcher(J2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }
}
