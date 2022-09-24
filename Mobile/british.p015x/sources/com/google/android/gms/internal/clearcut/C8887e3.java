package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.e3 */
final class C8887e3 {

    /* renamed from: a */
    private static final Class<?> f44505a = m41688C();

    /* renamed from: b */
    private static final C9011u3<?, ?> f44506b = m41739w(false);

    /* renamed from: c */
    private static final C9011u3<?, ?> f44507c = m41739w(true);

    /* renamed from: d */
    private static final C9011u3<?, ?> f44508d = new C9025w3();

    /* renamed from: A */
    public static C9011u3<?, ?> m41686A() {
        return f44507c;
    }

    /* renamed from: B */
    public static C9011u3<?, ?> m41687B() {
        return f44508d;
    }

    /* renamed from: C */
    private static Class<?> m41688C() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    private static Class<?> m41689D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    static int m41690E(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8903g1) {
            C8903g1 g1Var = (C8903g1) list;
            i = 0;
            while (i2 < size) {
                i += C8947m0.m41930C0(g1Var.mo36949f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8947m0.m41930C0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: F */
    public static void m41691F(int i, List<Long> list, C8977p4 p4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            p4Var.mo37085s(i, list, z);
        }
    }

    /* renamed from: G */
    static int m41692G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8903g1) {
            C8903g1 g1Var = (C8903g1) list;
            i = 0;
            while (i2 < size) {
                i += C8947m0.m41932D0(g1Var.mo36949f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8947m0.m41932D0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static void m41693H(int i, List<Long> list, C8977p4 p4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            p4Var.mo37084r(i, list, z);
        }
    }

    /* renamed from: I */
    public static void m41694I(Class<?> cls) {
        Class<?> cls2;
        if (!C8891f1.class.isAssignableFrom(cls) && (cls2 = f44505a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: J */
    static int m41695J(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8903g1) {
            C8903g1 g1Var = (C8903g1) list;
            i = 0;
            while (i2 < size) {
                i += C8947m0.m41934E0(g1Var.mo36949f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8947m0.m41934E0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: K */
    public static void m41696K(int i, List<Long> list, C8977p4 p4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            p4Var.mo37078l(i, list, z);
        }
    }

    /* renamed from: L */
    static int m41697L(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: M */
    public static void m41698M(int i, List<Integer> list, C8977p4 p4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            p4Var.mo37073g(i, list, z);
        }
    }

    /* renamed from: N */
    static int m41699N(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: O */
    public static void m41700O(int i, List<Integer> list, C8977p4 p4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            p4Var.mo37080n(i, list, z);
        }
    }

    /* renamed from: P */
    static int m41701P(List<?> list) {
        return list.size();
    }

    /* renamed from: Q */
    public static void m41702Q(int i, List<Integer> list, C8977p4 p4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            p4Var.mo37087u(i, list, z);
        }
    }

    /* renamed from: R */
    public static void m41703R(int i, List<Integer> list, C8977p4 p4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            p4Var.mo37079m(i, list, z);
        }
    }

    /* renamed from: S */
    public static void m41704S(int i, List<Integer> list, C8977p4 p4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            p4Var.mo37081o(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m41705T(int i, List<Integer> list, C8977p4 p4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            p4Var.mo37074h(i, list, z);
        }
    }

    /* renamed from: U */
    public static void m41706U(int i, List<Boolean> list, C8977p4 p4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            p4Var.mo37071d(i, list, z);
        }
    }

    /* renamed from: V */
    static int m41707V(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m41712a(list) + (list.size() * C8947m0.m41928B0(i));
    }

    /* renamed from: W */
    static int m41708W(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m41726j(list) + (size * C8947m0.m41928B0(i));
    }

    /* renamed from: X */
    static int m41709X(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m41733q(list) + (size * C8947m0.m41928B0(i));
    }

    /* renamed from: Y */
    static int m41710Y(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m41738v(list) + (size * C8947m0.m41928B0(i));
    }

    /* renamed from: Z */
    static int m41711Z(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m41690E(list) + (size * C8947m0.m41928B0(i));
    }

    /* renamed from: a */
    static int m41712a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9044z1) {
            C9044z1 z1Var = (C9044z1) list;
            i = 0;
            while (i2 < size) {
                i += C8947m0.m41955e0(z1Var.mo37244f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8947m0.m41955e0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a0 */
    static int m41713a0(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m41692G(list) + (size * C8947m0.m41928B0(i));
    }

    /* renamed from: b */
    private static <UT, UB> UB m41714b(int i, int i2, UB ub, C9011u3<UT, UB> u3Var) {
        if (ub == null) {
            ub = u3Var.mo37176f();
        }
        u3Var.mo37171a(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: b0 */
    static int m41715b0(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m41695J(list) + (size * C8947m0.m41928B0(i));
    }

    /* renamed from: c */
    static <UT, UB> UB m41716c(int i, List<Integer> list, C8927j1<?> j1Var, UB ub, C9011u3<UT, UB> u3Var) {
        if (j1Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (j1Var.zzb(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m41714b(i, intValue, ub, u3Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (j1Var.zzb(intValue2) == null) {
                    ub = m41714b(i, intValue2, ub, u3Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: c0 */
    static int m41717c0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C8947m0.m41968t0(i, 0);
    }

    /* renamed from: d */
    public static void m41718d(int i, List<String> list, C8977p4 p4Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            p4Var.mo37053A(i, list);
        }
    }

    /* renamed from: d0 */
    static int m41719d0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C8947m0.m41960k0(i, 0);
    }

    /* renamed from: e */
    public static void m41720e(int i, List<?> list, C8977p4 p4Var, C8870c3 c3Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            p4Var.mo37056D(i, list, c3Var);
        }
    }

    /* renamed from: e0 */
    static int m41721e0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C8947m0.m41944Q(i, true);
    }

    /* renamed from: f */
    public static void m41722f(int i, List<Double> list, C8977p4 p4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            p4Var.mo37089w(i, list, z);
        }
    }

    /* renamed from: g */
    static <T, FT extends C9043z0<FT>> void m41723g(C8994s0<FT> s0Var, T t, T t2) {
        C9022w0<FT> b = s0Var.mo37138b(t2);
        if (!b.mo37207b()) {
            s0Var.mo37141e(t).mo37213h(b);
        }
    }

    /* renamed from: h */
    static <T> void m41724h(C8904g2 g2Var, T t, T t2, long j) {
        C8859b4.m41569i(t, j, g2Var.mo36963i(C8859b4.m41552M(t, j), C8859b4.m41552M(t2, j)));
    }

    /* renamed from: i */
    static <T, UT, UB> void m41725i(C9011u3<UT, UB> u3Var, T t, T t2) {
        u3Var.mo37177g(t, u3Var.mo37179i(u3Var.mo37181k(t), u3Var.mo37181k(t2)));
    }

    /* renamed from: j */
    static int m41726j(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9044z1) {
            C9044z1 z1Var = (C9044z1) list;
            i = 0;
            while (i2 < size) {
                i += C8947m0.m41958h0(z1Var.mo37244f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8947m0.m41958h0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: k */
    public static void m41727k(int i, List<C8847a0> list, C8977p4 p4Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            p4Var.mo37090x(i, list);
        }
    }

    /* renamed from: l */
    public static void m41728l(int i, List<?> list, C8977p4 p4Var, C8870c3 c3Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            p4Var.mo37054B(i, list, c3Var);
        }
    }

    /* renamed from: m */
    public static void m41729m(int i, List<Float> list, C8977p4 p4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            p4Var.mo37092z(i, list, z);
        }
    }

    /* renamed from: n */
    static int m41730n(int i, Object obj, C8870c3 c3Var) {
        return obj instanceof C8995s1 ? C8947m0.m41952d(i, (C8995s1) obj) : C8947m0.m41927B(i, (C8942l2) obj, c3Var);
    }

    /* renamed from: o */
    static int m41731o(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int B0 = C8947m0.m41928B0(i) * size;
        if (list instanceof C9009u1) {
            C9009u1 u1Var = (C9009u1) list;
            while (i2 < size) {
                Object u0 = u1Var.mo37169u0(i2);
                B0 += u0 instanceof C8847a0 ? C8947m0.m41931D((C8847a0) u0) : C8947m0.m41965q0((String) u0);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                B0 += obj instanceof C8847a0 ? C8947m0.m41931D((C8847a0) obj) : C8947m0.m41965q0((String) obj);
                i2++;
            }
        }
        return B0;
    }

    /* renamed from: p */
    static int m41732p(int i, List<?> list, C8870c3 c3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B0 = C8947m0.m41928B0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            B0 += obj instanceof C8995s1 ? C8947m0.m41954e((C8995s1) obj) : C8947m0.m41933E((C8942l2) obj, c3Var);
        }
        return B0;
    }

    /* renamed from: q */
    static int m41733q(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9044z1) {
            C9044z1 z1Var = (C9044z1) list;
            i = 0;
            while (i2 < size) {
                i += C8947m0.m41961l0(z1Var.mo37244f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8947m0.m41961l0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: r */
    public static void m41734r(int i, List<Long> list, C8977p4 p4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            p4Var.mo37077k(i, list, z);
        }
    }

    /* renamed from: s */
    public static boolean m41735s(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = (long) i3;
        return ((((long) i2) - ((long) i)) + 1) + 9 <= ((2 * j) + 3) + ((j + 3) * 3);
    }

    /* renamed from: t */
    static int m41736t(int i, List<C8847a0> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B0 = size * C8947m0.m41928B0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            B0 += C8947m0.m41931D(list.get(i2));
        }
        return B0;
    }

    /* renamed from: u */
    static int m41737u(int i, List<C8942l2> list, C8870c3 c3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C8947m0.m41943P(i, list.get(i3), c3Var);
        }
        return i2;
    }

    /* renamed from: v */
    static int m41738v(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8903g1) {
            C8903g1 g1Var = (C8903g1) list;
            i = 0;
            while (i2 < size) {
                i += C8947m0.m41938H0(g1Var.mo36949f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8947m0.m41938H0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: w */
    private static C9011u3<?, ?> m41739w(boolean z) {
        try {
            Class<?> D = m41689D();
            if (D == null) {
                return null;
            }
            return (C9011u3) D.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: x */
    public static void m41740x(int i, List<Long> list, C8977p4 p4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            p4Var.mo37086t(i, list, z);
        }
    }

    /* renamed from: y */
    static boolean m41741y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: z */
    public static C9011u3<?, ?> m41742z() {
        return f44506b;
    }
}
