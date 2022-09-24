package p226k6;

/* renamed from: k6.a */
/* compiled from: MathUtils */
public final class C10648a {
    /* renamed from: a */
    public static float m48413a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: b */
    public static float m48414b(float f, float f2, float f3, float f4, float f5, float f6) {
        return m48417e(m48413a(f, f2, f3, f4), m48413a(f, f2, f5, f4), m48413a(f, f2, f5, f6), m48413a(f, f2, f3, f6));
    }

    /* renamed from: c */
    public static boolean m48415c(float f, float f2, float f3) {
        return f + f3 >= f2;
    }

    /* renamed from: d */
    public static float m48416d(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: e */
    private static float m48417e(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
