package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bma */
/* compiled from: IMASDK */
final class bma {

    /* renamed from: a */
    private static final Class<?> f16676a;

    /* renamed from: b */
    private static final bmm<?, ?> f16677b = m16600ab(false);

    /* renamed from: c */
    private static final bmm<?, ?> f16678c = m16600ab(true);

    /* renamed from: d */
    private static final bmm<?, ?> f16679d = new bmm<>((byte[]) null);

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f16676a = cls;
    }

    /* renamed from: A */
    static int m16572A(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: B */
    static int m16573B(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: C */
    static int m16574C(List<?> list) {
        return list.size();
    }

    /* renamed from: D */
    static int m16575D(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int I = bjw.m16181I(i) * size;
        if (list instanceof bky) {
            bky bky = (bky) list;
            while (i4 < size) {
                Object g = bky.mo15414g(i4);
                if (g instanceof bjq) {
                    i3 = bjw.m16189Q((bjq) g);
                } else {
                    i3 = bjw.m16187O((String) g);
                }
                I += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof bjq) {
                    i2 = bjw.m16189Q((bjq) obj);
                } else {
                    i2 = bjw.m16187O((String) obj);
                }
                I += i2;
                i4++;
            }
        }
        return I;
    }

    /* renamed from: E */
    static int m16576E(int i, Object obj, bly bly) {
        if (obj instanceof bkw) {
            return bjw.m16180H(i, (bkw) obj);
        }
        return bjw.m16181I(i) + bjw.m16190R((bln) obj, bly);
    }

    /* renamed from: F */
    static int m16577F(int i, List<?> list, bly bly) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int I = bjw.m16181I(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof bkw) {
                i2 = bjw.m16188P((bkw) obj);
            } else {
                i2 = bjw.m16190R((bln) obj, bly);
            }
            I += i2;
        }
        return I;
    }

    /* renamed from: G */
    static int m16578G(int i, List<bjq> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int I = size * bjw.m16181I(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            I += bjw.m16189Q(list.get(i2));
        }
        return I;
    }

    /* renamed from: H */
    static int m16579H(int i, List<bln> list, bly bly) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += bjw.m16194Y(i, list.get(i3), bly);
        }
        return i2;
    }

    /* renamed from: I */
    public static bmm<?, ?> m16580I() {
        return f16677b;
    }

    /* renamed from: J */
    public static bmm<?, ?> m16581J() {
        return f16678c;
    }

    /* renamed from: K */
    public static bmm<?, ?> m16582K() {
        return f16679d;
    }

    /* renamed from: L */
    static boolean m16583L(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: M */
    static <T, UT, UB> void m16584M(bmm<UT, UB> bmm, T t, T t2) {
        bmm.mo15506f(t, bmm.m16659o(bmm.mo15505e(t), bmm.mo15505e(t2)));
    }

    /* renamed from: N */
    static <UT, UB> UB m16585N(int i, List<Integer> list, bko bko, UB ub, bmm<UT, UB> bmm) {
        if (bko == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (bko.mo15404a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m16586O(i, intValue, ub, bmm);
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
                if (!bko.mo15404a(intValue2)) {
                    ub = m16586O(i, intValue2, ub, bmm);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: O */
    static <UT, UB> UB m16586O(int i, int i2, UB ub, bmm<UT, UB> bmm) {
        if (ub == null) {
            ub = bmn.m16672b();
        }
        ((bmn) ub).mo15514i(bnd.m16789c(i, 0), Long.valueOf((long) i2));
        return ub;
    }

    /* renamed from: P */
    static <T> void m16587P(bli bli, T t, T t2, long j) {
        bmv.m16741o(t, j, bli.m16409f(bmv.m16740n(t, j), bmv.m16740n(t2, j)));
    }

    /* renamed from: Q */
    static int m16588Q(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * bjw.m16197au(i);
    }

    /* renamed from: R */
    static int m16589R(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m16622w(list) + (size * bjw.m16181I(i));
    }

    /* renamed from: S */
    static int m16590S(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * bjw.m16199aw(i);
    }

    /* renamed from: T */
    static int m16591T(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * bjw.m16200ax(i);
    }

    /* renamed from: U */
    static int m16592U(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m16623x(list) + (size * bjw.m16181I(i));
    }

    /* renamed from: V */
    static int m16593V(int i, List<Long> list) {
        if (list.size() == 0) {
            return 0;
        }
        return m16619t(list) + (list.size() * bjw.m16181I(i));
    }

    /* renamed from: W */
    static int m16594W(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m16625z(list) + (size * bjw.m16181I(i));
    }

    /* renamed from: X */
    static int m16595X(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m16621v(list) + (size * bjw.m16181I(i));
    }

    /* renamed from: Y */
    static int m16596Y(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m16624y(list) + (size * bjw.m16181I(i));
    }

    /* renamed from: Z */
    static int m16597Z(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m16620u(list) + (size * bjw.m16181I(i));
    }

    /* renamed from: a */
    public static void m16598a(Class<?> cls) {
        Class<?> cls2;
        if (!bkl.class.isAssignableFrom(cls) && (cls2 = f16676a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: aa */
    static <T, FT extends bkd<FT>> void m16599aa(bmw bmw, T t) {
        bmw.m16761j(t);
        throw null;
    }

    /* renamed from: ab */
    private static bmm<?, ?> m16600ab(boolean z) {
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
            return (bmm) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public static void m16601b(int i, List<Double> list, bne bne, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bne.mo15322B(i, list, z);
        }
    }

    /* renamed from: c */
    public static void m16602c(int i, List<Float> list, bne bne, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bne.mo15321A(i, list, z);
        }
    }

    /* renamed from: d */
    public static void m16603d(int i, List<Long> list, bne bne, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bne.mo15355x(i, list, z);
        }
    }

    /* renamed from: e */
    public static void m16604e(int i, List<Long> list, bne bne, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bne.mo15356y(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m16605f(int i, List<Long> list, bne bne, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bne.mo15331K(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m16606g(int i, List<Long> list, bne bne, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bne.mo15357z(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m16607h(int i, List<Long> list, bne bne, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bne.mo15329I(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m16608i(int i, List<Integer> list, bne bne, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bne.mo15353v(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m16609j(int i, List<Integer> list, bne bne, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bne.mo15327G(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m16610k(int i, List<Integer> list, bne bne, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bne.mo15330J(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m16611l(int i, List<Integer> list, bne bne, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bne.mo15354w(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m16612m(int i, List<Integer> list, bne bne, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bne.mo15328H(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m16613n(int i, List<Integer> list, bne bne, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bne.mo15323C(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m16614o(int i, List<Boolean> list, bne bne, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bne.mo15324D(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m16615p(int i, List<String> list, bne bne) throws IOException {
        if (list != null && !list.isEmpty()) {
            bne.mo15325E(i, list);
        }
    }

    /* renamed from: q */
    public static void m16616q(int i, List<bjq> list, bne bne) throws IOException {
        if (list != null && !list.isEmpty()) {
            bne.mo15326F(i, list);
        }
    }

    /* renamed from: r */
    public static void m16617r(int i, List<?> list, bne bne, bly bly) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((bjx) bne).mo15349r(i, list.get(i2), bly);
            }
        }
    }

    /* renamed from: s */
    public static void m16618s(int i, List<?> list, bne bne, bly bly) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((bjx) bne).mo15350s(i, list.get(i2), bly);
            }
        }
    }

    /* renamed from: t */
    static int m16619t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof blc) {
            blc blc = (blc) list;
            i = 0;
            while (i2 < size) {
                i += bjw.m16185M(blc.mo15424d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + bjw.m16185M(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    static int m16620u(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof blc) {
            blc blc = (blc) list;
            i = 0;
            while (i2 < size) {
                i += bjw.m16185M(blc.mo15424d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + bjw.m16185M(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: v */
    static int m16621v(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof blc) {
            blc blc = (blc) list;
            i = 0;
            while (i2 < size) {
                i += bjw.m16186N(blc.mo15424d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + bjw.m16186N(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: w */
    static int m16622w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bkm) {
            bkm bkm = (bkm) list;
            i = 0;
            while (i2 < size) {
                i += bjw.m16182J(bkm.mo15398f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + bjw.m16182J(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    static int m16623x(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bkm) {
            bkm bkm = (bkm) list;
            i = 0;
            while (i2 < size) {
                i += bjw.m16182J(bkm.mo15398f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + bjw.m16182J(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: y */
    static int m16624y(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bkm) {
            bkm bkm = (bkm) list;
            i = 0;
            while (i2 < size) {
                i += bjw.m16183K(bkm.mo15398f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + bjw.m16183K(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    static int m16625z(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bkm) {
            bkm bkm = (bkm) list;
            i = 0;
            while (i2 < size) {
                i += bjw.m16184L(bkm.mo15398f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + bjw.m16184L(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }
}
