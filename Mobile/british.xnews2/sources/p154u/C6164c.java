package p154u;

import android.util.Log;
import java.util.Arrays;

/* renamed from: u.c */
/* compiled from: Easing */
public class C6164c {

    /* renamed from: b */
    static C6164c f25469b = new C6164c();

    /* renamed from: c */
    public static String[] f25470c = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a */
    String f25471a = "identity";

    /* renamed from: u.c$a */
    /* compiled from: Easing */
    static class C6165a extends C6164c {

        /* renamed from: h */
        private static double f25472h = 0.01d;

        /* renamed from: i */
        private static double f25473i = 1.0E-4d;

        /* renamed from: d */
        double f25474d;

        /* renamed from: e */
        double f25475e;

        /* renamed from: f */
        double f25476f;

        /* renamed from: g */
        double f25477g;

        C6165a(String str) {
            this.f25471a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f25474d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.f25475e = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.f25476f = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.f25477g = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        /* renamed from: d */
        private double m27056d(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f25474d * d2 * d3 * d) + (this.f25476f * d3 * d * d) + (d * d * d);
        }

        /* renamed from: e */
        private double m27057e(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f25475e * d2 * d3 * d) + (this.f25477g * d3 * d * d) + (d * d * d);
        }

        /* renamed from: a */
        public double mo23559a(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f25472h) {
                d2 *= 0.5d;
                d3 = m27056d(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = m27056d(d4);
            double d6 = d3 + d2;
            double d7 = m27056d(d6);
            double e = m27057e(d4);
            return (((m27057e(d6) - e) * (d - d5)) / (d7 - d5)) + e;
        }

        /* renamed from: b */
        public double mo23560b(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f25473i) {
                d2 *= 0.5d;
                d3 = m27056d(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (m27057e(d5) - m27057e(d4)) / (m27056d(d5) - m27056d(d4));
        }
    }

    /* renamed from: c */
    public static C6164c m27053c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C6165a(str);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c = 1;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 2;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C6165a("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new C6165a("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new C6165a("cubic(1, 1, 0, 0)");
            case 3:
                return new C6165a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                Log.e("ConstraintSet", "transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f25470c));
                return f25469b;
        }
    }

    /* renamed from: a */
    public double mo23559a(double d) {
        return d;
    }

    /* renamed from: b */
    public double mo23560b(double d) {
        return 1.0d;
    }

    public String toString() {
        return this.f25471a;
    }
}
