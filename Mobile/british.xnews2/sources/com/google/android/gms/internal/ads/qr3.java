package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class qr3 {

    /* renamed from: a */
    private static final Class<?> f38266a;

    /* renamed from: b */
    private static final gs3<?, ?> f38267b = m36616C(false);

    /* renamed from: c */
    private static final gs3<?, ?> f38268c = m36616C(true);

    /* renamed from: d */
    private static final gs3<?, ?> f38269d = new is3();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f38266a = cls;
    }

    /* renamed from: A */
    static int m36614A(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (ro3.m37151a(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m36615B(int i, List<Long> list, so3 so3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            so3.mo34754k(i, list, z);
        }
    }

    /* renamed from: C */
    private static gs3<?, ?> m36616C(boolean z) {
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
            return (gs3) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    static int m36617D(List<?> list) {
        return list.size();
    }

    /* renamed from: E */
    static int m36618E(int i, List<eo3> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = size * ro3.m37150D(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            D += ro3.m37155x(list.get(i2));
        }
        return D;
    }

    /* renamed from: F */
    static int m36619F(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m36620G(list) + (size * ro3.m37150D(i));
    }

    /* renamed from: G */
    static int m36620G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lp3) {
            lp3 lp3 = (lp3) list;
            i = 0;
            while (i2 < size) {
                i += ro3.m37157z(lp3.mo33378f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + ro3.m37157z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    static int m36621H(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (ro3.m37151a(i << 3) + 4);
    }

    /* renamed from: I */
    static int m36622I(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    static int m36623J(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (ro3.m37151a(i << 3) + 8);
    }

    /* renamed from: K */
    static int m36624K(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    static int m36625L(int i, List<uq3> list, or3 or3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ro3.m37156y(i, list.get(i3), or3);
        }
        return i2;
    }

    /* renamed from: M */
    static int m36626M(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m36627N(list) + (size * ro3.m37150D(i));
    }

    /* renamed from: N */
    static int m36627N(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lp3) {
            lp3 lp3 = (lp3) list;
            i = 0;
            while (i2 < size) {
                i += ro3.m37157z(lp3.mo33378f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + ro3.m37157z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m36628O(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m36629P(list) + (list.size() * ro3.m37150D(i));
    }

    /* renamed from: P */
    static int m36629P(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof jq3) {
            jq3 jq3 = (jq3) list;
            i = 0;
            while (i2 < size) {
                i += ro3.m37152b(jq3.mo32931f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + ro3.m37152b(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    static int m36630Q(int i, Object obj, or3 or3) {
        if (!(obj instanceof aq3)) {
            return ro3.m37151a(i << 3) + ro3.m37148B((uq3) obj, or3);
        }
        int a = ro3.m37151a(i << 3);
        int a2 = ((aq3) obj).mo30470a();
        return a + ro3.m37151a(a2) + a2;
    }

    /* renamed from: R */
    static int m36631R(int i, List<?> list, or3 or3) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = ro3.m37150D(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof aq3) {
                i2 = ro3.m37147A((aq3) obj);
            } else {
                i2 = ro3.m37148B((uq3) obj, or3);
            }
            D += i2;
        }
        return D;
    }

    /* renamed from: S */
    static int m36632S(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m36633T(list) + (size * ro3.m37150D(i));
    }

    /* renamed from: T */
    static int m36633T(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lp3) {
            lp3 lp3 = (lp3) list;
            i = 0;
            while (i2 < size) {
                int f = lp3.mo33378f(i2);
                i += ro3.m37151a((f >> 31) ^ (f + f));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + ro3.m37151a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    static int m36634U(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m36635V(list) + (size * ro3.m37150D(i));
    }

    /* renamed from: V */
    static int m36635V(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof jq3) {
            jq3 jq3 = (jq3) list;
            i = 0;
            while (i2 < size) {
                long f = jq3.mo32931f(i2);
                i += ro3.m37152b((f >> 63) ^ (f + f));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + ro3.m37152b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    static int m36636W(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int D = ro3.m37150D(i) * size;
        if (list instanceof cq3) {
            cq3 cq3 = (cq3) list;
            while (i4 < size) {
                Object zzf = cq3.zzf(i4);
                if (zzf instanceof eo3) {
                    i3 = ro3.m37155x((eo3) zzf);
                } else {
                    i3 = ro3.m37149C((String) zzf);
                }
                D += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof eo3) {
                    i2 = ro3.m37155x((eo3) obj);
                } else {
                    i2 = ro3.m37149C((String) obj);
                }
                D += i2;
                i4++;
            }
        }
        return D;
    }

    /* renamed from: X */
    static int m36637X(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m36638Y(list) + (size * ro3.m37150D(i));
    }

    /* renamed from: Y */
    static int m36638Y(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lp3) {
            lp3 lp3 = (lp3) list;
            i = 0;
            while (i2 < size) {
                i += ro3.m37151a(lp3.mo33378f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + ro3.m37151a(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    static int m36639Z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m36641a0(list) + (size * ro3.m37150D(i));
    }

    /* renamed from: a */
    public static gs3<?, ?> m36640a() {
        return f38268c;
    }

    /* renamed from: a0 */
    static int m36641a0(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof jq3) {
            jq3 jq3 = (jq3) list;
            i = 0;
            while (i2 < size) {
                i += ro3.m37152b(jq3.mo32931f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + ro3.m37152b(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static gs3<?, ?> m36642b() {
        return f38269d;
    }

    /* renamed from: b0 */
    public static gs3<?, ?> m36643b0() {
        return f38267b;
    }

    /* renamed from: c */
    static <UT, UB> UB m36644c(int i, List<Integer> list, op3 op3, UB ub, gs3<UT, UB> gs3) {
        if (op3 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (op3.mo30325m(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m36645d(i, intValue, ub, gs3);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!op3.mo30325m(intValue2)) {
                    ub = m36645d(i, intValue2, ub, gs3);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: d */
    static <UT, UB> UB m36645d(int i, int i2, UB ub, gs3<UT, UB> gs3) {
        if (ub == null) {
            ub = gs3.mo32270f();
        }
        gs3.mo32276l(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: e */
    static <T, FT extends bp3<FT>> void m36646e(xo3<FT> xo3, T t, T t2) {
        xo3.mo35775a(t2);
        throw null;
    }

    /* renamed from: f */
    static <T, UT, UB> void m36647f(gs3<UT, UB> gs3, T t, T t2) {
        gs3.mo32279o(t, gs3.mo32269e(gs3.mo32268d(t), gs3.mo32268d(t2)));
    }

    /* renamed from: g */
    public static void m36648g(Class<?> cls) {
        Class<?> cls2;
        if (!kp3.class.isAssignableFrom(cls) && (cls2 = f38266a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    static boolean m36649h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: i */
    static <T> void m36650i(pq3 pq3, T t, T t2, long j) {
        qs3.m36704D(t, j, pq3.m36172c(qs3.m36724p(t, j), qs3.m36724p(t2, j)));
    }

    /* renamed from: j */
    public static void m36651j(int i, List<Boolean> list, so3 so3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            so3.mo34756n(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m36652k(int i, List<eo3> list, so3 so3) throws IOException {
        if (list != null && !list.isEmpty()) {
            so3.mo34758p(i, list);
        }
    }

    /* renamed from: l */
    public static void m36653l(int i, List<Double> list, so3 so3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            so3.mo34760r(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m36654m(int i, List<Integer> list, so3 so3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            so3.mo34763u(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m36655n(int i, List<Integer> list, so3 so3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            so3.mo34765w(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m36656o(int i, List<Long> list, so3 so3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            so3.mo34767y(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m36657p(int i, List<Float> list, so3 so3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            so3.mo34733A(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m36658q(int i, List<?> list, so3 so3, or3 or3) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                so3.mo34734B(i, list.get(i2), or3);
            }
        }
    }

    /* renamed from: r */
    public static void m36659r(int i, List<Integer> list, so3 so3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            so3.mo34736D(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m36660s(int i, List<Long> list, so3 so3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            so3.mo34738F(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m36661t(int i, List<?> list, so3 so3, or3 or3) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                so3.mo34739G(i, list.get(i2), or3);
            }
        }
    }

    /* renamed from: u */
    public static void m36662u(int i, List<Integer> list, so3 so3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            so3.mo34741I(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m36663v(int i, List<Long> list, so3 so3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            so3.mo34743K(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m36664w(int i, List<Integer> list, so3 so3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            so3.mo34745b(i, list, z);
        }
    }

    /* renamed from: x */
    public static void m36665x(int i, List<Long> list, so3 so3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            so3.mo34747d(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m36666y(int i, List<String> list, so3 so3) throws IOException {
        if (list != null && !list.isEmpty()) {
            so3.mo34750g(i, list);
        }
    }

    /* renamed from: z */
    public static void m36667z(int i, List<Integer> list, so3 so3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            so3.mo34752i(i, list, z);
        }
    }
}
