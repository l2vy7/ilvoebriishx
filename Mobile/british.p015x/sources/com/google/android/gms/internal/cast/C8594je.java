package com.google.android.gms.internal.cast;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.cast.je */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8594je {

    /* renamed from: a */
    private static final Class<?> f43628a;

    /* renamed from: b */
    private static final C8783ve<?, ?> f43629b = m41085z(false);

    /* renamed from: c */
    private static final C8783ve<?, ?> f43630c = m41085z(true);

    /* renamed from: d */
    private static final C8783ve<?, ?> f43631d = new C8815xe();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f43628a = cls;
    }

    /* renamed from: A */
    public static void m41034A(Class<?> cls) {
        Class<?> cls2;
        if (!C8705qc.class.isAssignableFrom(cls) && (cls2 = f43628a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: B */
    static int m41035B(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8610kd) {
            C8610kd kdVar = (C8610kd) list;
            i = 0;
            while (i2 < size) {
                i += C8509ec.m40798B(kdVar.mo36576f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8509ec.m40798B(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: C */
    static int m41036C(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m41035B(list) + (list.size() * C8509ec.m40806y(i));
    }

    /* renamed from: D */
    static int m41037D(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8610kd) {
            C8610kd kdVar = (C8610kd) list;
            i = 0;
            while (i2 < size) {
                i += C8509ec.m40798B(kdVar.mo36576f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8509ec.m40798B(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: E */
    static int m41038E(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m41037D(list) + (size * C8509ec.m40806y(i));
    }

    /* renamed from: F */
    static int m41039F(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8610kd) {
            C8610kd kdVar = (C8610kd) list;
            i = 0;
            while (i2 < size) {
                long f = kdVar.mo36576f(i2);
                i += C8509ec.m40798B((f >> 63) ^ (f + f));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + C8509ec.m40798B((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: G */
    static int m41040G(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m41039F(list) + (size * C8509ec.m40806y(i));
    }

    /* renamed from: H */
    static int m41041H(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8720rc) {
            C8720rc rcVar = (C8720rc) list;
            i = 0;
            while (i2 < size) {
                i += C8509ec.m40807z(rcVar.mo36701f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8509ec.m40807z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: I */
    static int m41042I(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m41041H(list) + (size * C8509ec.m40806y(i));
    }

    /* renamed from: J */
    static int m41043J(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8720rc) {
            C8720rc rcVar = (C8720rc) list;
            i = 0;
            while (i2 < size) {
                i += C8509ec.m40807z(rcVar.mo36701f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8509ec.m40807z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: K */
    static int m41044K(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m41043J(list) + (size * C8509ec.m40806y(i));
    }

    /* renamed from: L */
    static int m41045L(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8720rc) {
            C8720rc rcVar = (C8720rc) list;
            i = 0;
            while (i2 < size) {
                i += C8509ec.m40797A(rcVar.mo36701f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8509ec.m40797A(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: M */
    static int m41046M(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m41045L(list) + (size * C8509ec.m40806y(i));
    }

    /* renamed from: N */
    static int m41047N(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8720rc) {
            C8720rc rcVar = (C8720rc) list;
            i = 0;
            while (i2 < size) {
                int f = rcVar.mo36701f(i2);
                i += C8509ec.m40797A((f >> 31) ^ (f + f));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + C8509ec.m40797A((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m41048O(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m41047N(list) + (size * C8509ec.m40806y(i));
    }

    /* renamed from: P */
    static int m41049P(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: Q */
    static int m41050Q(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C8509ec.m40797A(i << 3) + 4);
    }

    /* renamed from: R */
    static int m41051R(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: S */
    static int m41052S(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C8509ec.m40797A(i << 3) + 8);
    }

    /* renamed from: T */
    static int m41053T(List<?> list) {
        return list.size();
    }

    /* renamed from: U */
    static int m41054U(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C8509ec.m40797A(i << 3) + 1);
    }

    /* renamed from: V */
    static int m41055V(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int y = C8509ec.m40806y(i) * size;
        if (list instanceof C8527fd) {
            C8527fd fdVar = (C8527fd) list;
            while (i4 < size) {
                Object l = fdVar.mo36387l(i4);
                if (l instanceof C8796wb) {
                    i3 = C8509ec.m40801a((C8796wb) l);
                } else {
                    i3 = C8509ec.m40799C((String) l);
                }
                y += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C8796wb) {
                    i2 = C8509ec.m40801a((C8796wb) obj);
                } else {
                    i2 = C8509ec.m40799C((String) obj);
                }
                y += i2;
                i4++;
            }
        }
        return y;
    }

    /* renamed from: W */
    static int m41056W(int i, Object obj, C8561he heVar) {
        if (!(obj instanceof C8494dd)) {
            return C8509ec.m40797A(i << 3) + C8509ec.m40802b((C8782vd) obj, heVar);
        }
        int A = C8509ec.m40797A(i << 3);
        int a = ((C8494dd) obj).mo36430a();
        return A + C8509ec.m40797A(a) + a;
    }

    /* renamed from: X */
    static int m41057X(int i, List<?> list, C8561he heVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = C8509ec.m40806y(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C8494dd) {
                i2 = C8509ec.m40800D((C8494dd) obj);
            } else {
                i2 = C8509ec.m40802b((C8782vd) obj, heVar);
            }
            y += i2;
        }
        return y;
    }

    /* renamed from: Y */
    static int m41058Y(int i, List<C8796wb> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = size * C8509ec.m40806y(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            y += C8509ec.m40801a(list.get(i2));
        }
        return y;
    }

    /* renamed from: Z */
    static int m41059Z(int i, List<C8782vd> list, C8561he heVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C8509ec.m40803e(i, list.get(i3), heVar);
        }
        return i2;
    }

    /* renamed from: a */
    public static C8783ve<?, ?> m41060a() {
        return f43629b;
    }

    /* renamed from: b */
    public static C8783ve<?, ?> m41061b() {
        return f43630c;
    }

    /* renamed from: c */
    public static C8783ve<?, ?> m41062c() {
        return f43631d;
    }

    /* renamed from: d */
    static boolean m41063d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: e */
    static <T, FT extends C8609kc<FT>> void m41064e(C8559hc<FT> hcVar, T t, T t2) {
        hcVar.mo36549b(t2);
        throw null;
    }

    /* renamed from: f */
    static <T, UT, UB> void m41065f(C8783ve<UT, UB> veVar, T t, T t2) {
        veVar.mo36747a(t, veVar.mo36750d(veVar.mo36748b(t), veVar.mo36748b(t2)));
    }

    /* renamed from: g */
    static <T> void m41066g(C8706qd qdVar, T t, T t2, long j) {
        C8690pd pdVar = (C8690pd) C8545gf.m40965s(t, j);
        C8690pd pdVar2 = (C8690pd) C8545gf.m40965s(t2, j);
        if (!pdVar2.isEmpty()) {
            if (!pdVar.mo36661g()) {
                pdVar = pdVar.mo36656c();
            }
            pdVar.mo36655b(pdVar2);
        }
        C8545gf.m40966t(t, j, pdVar);
    }

    /* renamed from: h */
    public static void m41067h(int i, List<Double> list, C8526fc fcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            fcVar.mo36497I(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m41068i(int i, List<Float> list, C8526fc fcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            fcVar.mo36496H(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m41069j(int i, List<Long> list, C8526fc fcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            fcVar.mo36493E(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m41070k(int i, List<Long> list, C8526fc fcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            fcVar.mo36494F(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m41071l(int i, List<Long> list, C8526fc fcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            fcVar.mo36506i(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m41072m(int i, List<Long> list, C8526fc fcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            fcVar.mo36495G(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m41073n(int i, List<Long> list, C8526fc fcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            fcVar.mo36504g(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m41074o(int i, List<Integer> list, C8526fc fcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            fcVar.mo36491C(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m41075p(int i, List<Integer> list, C8526fc fcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            fcVar.mo36502e(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m41076q(int i, List<Integer> list, C8526fc fcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            fcVar.mo36505h(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m41077r(int i, List<Integer> list, C8526fc fcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            fcVar.mo36492D(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m41078s(int i, List<Integer> list, C8526fc fcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            fcVar.mo36503f(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m41079t(int i, List<Integer> list, C8526fc fcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            fcVar.mo36498a(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m41080u(int i, List<Boolean> list, C8526fc fcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            fcVar.mo36499b(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m41081v(int i, List<String> list, C8526fc fcVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            fcVar.mo36500c(i, list);
        }
    }

    /* renamed from: w */
    public static void m41082w(int i, List<C8796wb> list, C8526fc fcVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            fcVar.mo36501d(i, list);
        }
    }

    /* renamed from: x */
    public static void m41083x(int i, List<?> list, C8526fc fcVar, C8561he heVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                fcVar.mo36489A(i, list.get(i2), heVar);
            }
        }
    }

    /* renamed from: y */
    public static void m41084y(int i, List<?> list, C8526fc fcVar, C8561he heVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                fcVar.mo36490B(i, list.get(i2), heVar);
            }
        }
    }

    /* renamed from: z */
    private static C8783ve<?, ?> m41085z(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C8783ve) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }
}
