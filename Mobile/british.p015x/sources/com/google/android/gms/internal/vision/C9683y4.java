package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.y4 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9683y4 {

    /* renamed from: a */
    private static final Class<?> f46012a = m44845C();

    /* renamed from: b */
    private static final C9588o5<?, ?> f46013b = m44851I(false);

    /* renamed from: c */
    private static final C9588o5<?, ?> f46014c = m44851I(true);

    /* renamed from: d */
    private static final C9588o5<?, ?> f46015d = new C9604q5();

    /* renamed from: A */
    public static C9588o5<?, ?> m44843A() {
        return f46014c;
    }

    /* renamed from: B */
    public static C9588o5<?, ?> m44844B() {
        return f46015d;
    }

    /* renamed from: C */
    private static Class<?> m44845C() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    private static Class<?> m44846D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    public static void m44847E(int i, List<Integer> list, C9540i6 i6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i6Var.mo38371u(i, list, z);
        }
    }

    /* renamed from: F */
    public static void m44848F(int i, List<Integer> list, C9540i6 i6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i6Var.mo38363m(i, list, z);
        }
    }

    /* renamed from: G */
    public static void m44849G(int i, List<Integer> list, C9540i6 i6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i6Var.mo38365o(i, list, z);
        }
    }

    /* renamed from: H */
    public static void m44850H(int i, List<Integer> list, C9540i6 i6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i6Var.mo38358h(i, list, z);
        }
    }

    /* renamed from: I */
    private static C9588o5<?, ?> m44851I(boolean z) {
        try {
            Class<?> D = m44846D();
            if (D == null) {
                return null;
            }
            return (C9588o5) D.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: J */
    public static void m44852J(int i, List<Boolean> list, C9540i6 i6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i6Var.mo38354d(i, list, z);
        }
    }

    /* renamed from: K */
    static int m44853K(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m44856N(list) + (list.size() * C9482c2.m44061H(i));
    }

    /* renamed from: L */
    static int m44854L(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m44858P(list) + (size * C9482c2.m44061H(i));
    }

    /* renamed from: M */
    static int m44855M(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m44860R(list) + (size * C9482c2.m44061H(i));
    }

    /* renamed from: N */
    static int m44856N(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9635u3) {
            C9635u3 u3Var = (C9635u3) list;
            i = 0;
            while (i2 < size) {
                i += C9482c2.m44103y0(u3Var.mo38594f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9482c2.m44103y0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m44857O(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m44862T(list) + (size * C9482c2.m44061H(i));
    }

    /* renamed from: P */
    static int m44858P(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9635u3) {
            C9635u3 u3Var = (C9635u3) list;
            i = 0;
            while (i2 < size) {
                i += C9482c2.m44105z0(u3Var.mo38594f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9482c2.m44105z0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    static int m44859Q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m44864V(list) + (size * C9482c2.m44061H(i));
    }

    /* renamed from: R */
    static int m44860R(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9635u3) {
            C9635u3 u3Var = (C9635u3) list;
            i = 0;
            while (i2 < size) {
                i += C9482c2.m44057B0(u3Var.mo38594f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9482c2.m44057B0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: S */
    static int m44861S(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m44866X(list) + (size * C9482c2.m44061H(i));
    }

    /* renamed from: T */
    static int m44862T(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9673x2) {
            C9673x2 x2Var = (C9673x2) list;
            i = 0;
            while (i2 < size) {
                i += C9482c2.m44067N(x2Var.mo38640f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9482c2.m44067N(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    static int m44863U(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m44868Z(list) + (size * C9482c2.m44061H(i));
    }

    /* renamed from: V */
    static int m44864V(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9673x2) {
            C9673x2 x2Var = (C9673x2) list;
            i = 0;
            while (i2 < size) {
                i += C9482c2.m44062I(x2Var.mo38640f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9482c2.m44062I(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    static int m44865W(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C9482c2.m44091q0(i, 0);
    }

    /* renamed from: X */
    static int m44866X(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9673x2) {
            C9673x2 x2Var = (C9673x2) list;
            i = 0;
            while (i2 < size) {
                i += C9482c2.m44063J(x2Var.mo38640f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9482c2.m44063J(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Y */
    static int m44867Y(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C9482c2.m44081c0(i, 0);
    }

    /* renamed from: Z */
    static int m44868Z(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9673x2) {
            C9673x2 x2Var = (C9673x2) list;
            i = 0;
            while (i2 < size) {
                i += C9482c2.m44064K(x2Var.mo38640f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9482c2.m44064K(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    static <UT, UB> UB m44869a(int i, int i2, UB ub, C9588o5<UT, UB> o5Var) {
        if (ub == null) {
            ub = o5Var.mo38537j();
        }
        o5Var.mo38528a(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: a0 */
    static int m44870a0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C9482c2.m44102y(i, true);
    }

    /* renamed from: b */
    static <UT, UB> UB m44871b(int i, List<Integer> list, C9474b3 b3Var, UB ub, C9588o5<UT, UB> o5Var) {
        if (b3Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (b3Var.mo38239k(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m44869a(i, intValue, ub, o5Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!b3Var.mo38239k(intValue2)) {
                    ub = m44869a(i, intValue2, ub, o5Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: b0 */
    static int m44872b0(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: c */
    public static void m44873c(int i, List<String> list, C9540i6 i6Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            i6Var.mo38337A(i, list);
        }
    }

    /* renamed from: c0 */
    static int m44874c0(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: d */
    public static void m44875d(int i, List<?> list, C9540i6 i6Var, C9664w4 w4Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            i6Var.mo38343G(i, list, w4Var);
        }
    }

    /* renamed from: d0 */
    static int m44876d0(List<?> list) {
        return list.size();
    }

    /* renamed from: e */
    public static void m44877e(int i, List<Double> list, C9540i6 i6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i6Var.mo38373w(i, list, z);
        }
    }

    /* renamed from: f */
    static <T, FT extends C9569m2<FT>> void m44878f(C9528h2<FT> h2Var, T t, T t2) {
        C9553k2<FT> e = h2Var.mo38417e(t2);
        if (!e.f45719a.isEmpty()) {
            h2Var.mo38418f(t).mo38476g(e);
        }
    }

    /* renamed from: g */
    static <T> void m44879g(C9690z3 z3Var, T t, T t2, long j) {
        C9652v5.m44684f(t, j, z3Var.mo38302b(C9652v5.m44670G(t, j), C9652v5.m44670G(t2, j)));
    }

    /* renamed from: h */
    static <T, UT, UB> void m44880h(C9588o5<UT, UB> o5Var, T t, T t2) {
        o5Var.mo38533f(t, o5Var.mo38535h(o5Var.mo38539l(t), o5Var.mo38539l(t2)));
    }

    /* renamed from: i */
    public static void m44881i(int i, List<C9552k1> list, C9540i6 i6Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            i6Var.mo38374x(i, list);
        }
    }

    /* renamed from: j */
    public static void m44882j(int i, List<?> list, C9540i6 i6Var, C9664w4 w4Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            i6Var.mo38345I(i, list, w4Var);
        }
    }

    /* renamed from: k */
    public static void m44883k(int i, List<Float> list, C9540i6 i6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i6Var.mo38376z(i, list, z);
        }
    }

    /* renamed from: l */
    static int m44884l(int i, Object obj, C9664w4 w4Var) {
        if (obj instanceof C9554k3) {
            return C9482c2.m44080c(i, (C9554k3) obj);
        }
        return C9482c2.m44100w(i, (C9522g4) obj, w4Var);
    }

    /* renamed from: m */
    static int m44885m(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int H = C9482c2.m44061H(i) * size;
        if (list instanceof C9570m3) {
            C9570m3 m3Var = (C9570m3) list;
            while (i4 < size) {
                Object b0 = m3Var.mo38503b0(i4);
                if (b0 instanceof C9552k1) {
                    i3 = C9482c2.m44104z((C9552k1) b0);
                } else {
                    i3 = C9482c2.m44058C0((String) b0);
                }
                H += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C9552k1) {
                    i2 = C9482c2.m44104z((C9552k1) obj);
                } else {
                    i2 = C9482c2.m44058C0((String) obj);
                }
                H += i2;
                i4++;
            }
        }
        return H;
    }

    /* renamed from: n */
    static int m44886n(int i, List<?> list, C9664w4 w4Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int H = C9482c2.m44061H(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C9554k3) {
                i2 = C9482c2.m44082d((C9554k3) obj);
            } else {
                i2 = C9482c2.m44083e((C9522g4) obj, w4Var);
            }
            H += i2;
        }
        return H;
    }

    /* renamed from: o */
    public static void m44887o(int i, List<Long> list, C9540i6 i6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i6Var.mo38361k(i, list, z);
        }
    }

    /* renamed from: p */
    static int m44888p(int i, List<C9552k1> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int H = size * C9482c2.m44061H(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            H += C9482c2.m44104z(list.get(i2));
        }
        return H;
    }

    /* renamed from: q */
    static int m44889q(int i, List<C9522g4> list, C9664w4 w4Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C9482c2.m44071R(i, list.get(i3), w4Var);
        }
        return i2;
    }

    /* renamed from: r */
    public static void m44890r(int i, List<Long> list, C9540i6 i6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i6Var.mo38370t(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m44891s(int i, List<Long> list, C9540i6 i6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i6Var.mo38369s(i, list, z);
        }
    }

    /* renamed from: t */
    static boolean m44892t(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: u */
    public static void m44893u(int i, List<Long> list, C9540i6 i6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i6Var.mo38368r(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m44894v(int i, List<Long> list, C9540i6 i6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i6Var.mo38362l(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m44895w(Class<?> cls) {
        Class<?> cls2;
        if (!C9643v2.class.isAssignableFrom(cls) && (cls2 = f46012a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: x */
    public static void m44896x(int i, List<Integer> list, C9540i6 i6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i6Var.mo38357g(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m44897y(int i, List<Integer> list, C9540i6 i6Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i6Var.mo38364n(i, list, z);
        }
    }

    /* renamed from: z */
    public static C9588o5<?, ?> m44898z() {
        return f46013b;
    }
}
