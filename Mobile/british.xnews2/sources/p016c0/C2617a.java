package p016c0;

import android.graphics.Color;

/* renamed from: c0.a */
/* compiled from: ColorUtils */
public final class C2617a {

    /* renamed from: a */
    private static final ThreadLocal<double[]> f10357a = new ThreadLocal<>();

    /* renamed from: a */
    public static void m9107a(int i, int i2, int i3, float[] fArr) {
        float f;
        float f2;
        float f3 = ((float) i) / 255.0f;
        float f4 = ((float) i2) / 255.0f;
        float f5 = ((float) i3) / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            f2 = 0.0f;
        } else {
            f = max == f3 ? ((f4 - f5) / f6) % 6.0f : max == f4 ? ((f5 - f3) / f6) + 2.0f : 4.0f + ((f3 - f4) / f6);
            f2 = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        fArr[0] = m9117k(f8, 0.0f, 360.0f);
        fArr[1] = m9117k(f2, 0.0f, 1.0f);
        fArr[2] = m9117k(f7, 0.0f, 1.0f);
    }

    /* renamed from: b */
    public static void m9108b(int i, int i2, int i3, double[] dArr) {
        double d;
        double d2;
        double d3;
        double[] dArr2 = dArr;
        if (dArr2.length == 3) {
            double d4 = (double) i;
            Double.isNaN(d4);
            double d5 = d4 / 255.0d;
            if (d5 < 0.04045d) {
                d = d5 / 12.92d;
            } else {
                d = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            }
            double d6 = (double) i2;
            Double.isNaN(d6);
            double d7 = d6 / 255.0d;
            if (d7 < 0.04045d) {
                d2 = d7 / 12.92d;
            } else {
                d2 = Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
            }
            double d8 = (double) i3;
            Double.isNaN(d8);
            double d9 = d8 / 255.0d;
            if (d9 < 0.04045d) {
                d3 = d9 / 12.92d;
            } else {
                d3 = Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
            }
            dArr2[0] = ((0.4124d * d) + (0.3576d * d2) + (0.1805d * d3)) * 100.0d;
            dArr2[1] = ((0.2126d * d) + (0.7152d * d2) + (0.0722d * d3)) * 100.0d;
            dArr2[2] = ((d * 0.0193d) + (d2 * 0.1192d) + (d3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    /* renamed from: c */
    public static double m9109c(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = m9115i(i, i2);
            }
            double d = m9110d(i) + 0.05d;
            double d2 = m9110d(i2) + 0.05d;
            return Math.max(d, d2) / Math.min(d, d2);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    /* renamed from: d */
    public static double m9110d(int i) {
        double[] l = m9118l();
        m9113g(i, l);
        return l[1] / 100.0d;
    }

    /* renamed from: e */
    public static int m9111e(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = (double) f;
            if (m9109c(m9119m(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (m9109c(m9119m(i, i6), i2) < d) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    /* renamed from: f */
    public static void m9112f(int i, float[] fArr) {
        m9107a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    /* renamed from: g */
    public static void m9113g(int i, double[] dArr) {
        m9108b(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* renamed from: h */
    private static int m9114h(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* renamed from: i */
    public static int m9115i(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int h = m9114h(alpha2, alpha);
        return Color.argb(h, m9116j(Color.red(i), alpha2, Color.red(i2), alpha, h), m9116j(Color.green(i), alpha2, Color.green(i2), alpha, h), m9116j(Color.blue(i), alpha2, Color.blue(i2), alpha, h));
    }

    /* renamed from: j */
    private static int m9116j(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: k */
    private static float m9117k(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: l */
    private static double[] m9118l() {
        ThreadLocal<double[]> threadLocal = f10357a;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    /* renamed from: m */
    public static int m9119m(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
