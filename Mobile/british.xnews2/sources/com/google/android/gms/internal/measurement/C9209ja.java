package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ja */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9209ja {

    /* renamed from: a */
    private static final Class f45107a;

    /* renamed from: b */
    private static final C9410wa f45108b = m43088C(false);

    /* renamed from: c */
    private static final C9410wa f45109c = m43088C(true);

    /* renamed from: d */
    private static final C9410wa f45110d = new C9440ya();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f45107a = cls;
    }

    /* renamed from: A */
    static int m43086A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C9452z7.m43944a(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m43087B(int i, List list, C9069a8 a8Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            a8Var.mo37339k(i, list, z);
        }
    }

    /* renamed from: C */
    private static C9410wa m43088C(boolean z) {
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
            return (C9410wa) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    static int m43089D(List list) {
        return list.size();
    }

    /* renamed from: E */
    static int m43090E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = size * C9452z7.m43943D(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            D += C9452z7.m43948x((C9329r7) list.get(i2));
        }
        return D;
    }

    /* renamed from: F */
    static int m43091F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m43092G(list) + (size * C9452z7.m43943D(i));
    }

    /* renamed from: G */
    static int m43092G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9346s8) {
            C9346s8 s8Var = (C9346s8) list;
            i = 0;
            while (i2 < size) {
                i += C9452z7.m43950z(s8Var.mo38025f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9452z7.m43950z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    static int m43093H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C9452z7.m43944a(i << 3) + 4);
    }

    /* renamed from: I */
    static int m43094I(List list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    static int m43095J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C9452z7.m43944a(i << 3) + 8);
    }

    /* renamed from: K */
    static int m43096K(List list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    static int m43097L(int i, List list, C9179ha haVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C9452z7.m43949y(i, (C9409w9) list.get(i3), haVar);
        }
        return i2;
    }

    /* renamed from: M */
    static int m43098M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m43099N(list) + (size * C9452z7.m43943D(i));
    }

    /* renamed from: N */
    static int m43099N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9346s8) {
            C9346s8 s8Var = (C9346s8) list;
            i = 0;
            while (i2 < size) {
                i += C9452z7.m43950z(s8Var.mo38025f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9452z7.m43950z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m43100O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m43101P(list) + (list.size() * C9452z7.m43943D(i));
    }

    /* renamed from: P */
    static int m43101P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9223k9) {
            C9223k9 k9Var = (C9223k9) list;
            i = 0;
            while (i2 < size) {
                i += C9452z7.m43945b(k9Var.mo37689m(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9452z7.m43945b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    static int m43102Q(int i, Object obj, C9179ha haVar) {
        if (!(obj instanceof C9117d9)) {
            return C9452z7.m43944a(i << 3) + C9452z7.m43941B((C9409w9) obj, haVar);
        }
        int a = C9452z7.m43944a(i << 3);
        int a2 = ((C9117d9) obj).mo37503a();
        return a + C9452z7.m43944a(a2) + a2;
    }

    /* renamed from: R */
    static int m43103R(int i, List list, C9179ha haVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = C9452z7.m43943D(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C9117d9) {
                i2 = C9452z7.m43940A((C9117d9) obj);
            } else {
                i2 = C9452z7.m43941B((C9409w9) obj, haVar);
            }
            D += i2;
        }
        return D;
    }

    /* renamed from: S */
    static int m43104S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m43105T(list) + (size * C9452z7.m43943D(i));
    }

    /* renamed from: T */
    static int m43105T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9346s8) {
            C9346s8 s8Var = (C9346s8) list;
            i = 0;
            while (i2 < size) {
                int f = s8Var.mo38025f(i2);
                i += C9452z7.m43944a((f >> 31) ^ (f + f));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + C9452z7.m43944a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    static int m43106U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m43107V(list) + (size * C9452z7.m43943D(i));
    }

    /* renamed from: V */
    static int m43107V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9223k9) {
            C9223k9 k9Var = (C9223k9) list;
            i = 0;
            while (i2 < size) {
                long m = k9Var.mo37689m(i2);
                i += C9452z7.m43945b((m >> 63) ^ (m + m));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + C9452z7.m43945b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    static int m43108W(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int D = C9452z7.m43943D(i) * size;
        if (list instanceof C9148f9) {
            C9148f9 f9Var = (C9148f9) list;
            while (i4 < size) {
                Object zzf = f9Var.zzf(i4);
                if (zzf instanceof C9329r7) {
                    i3 = C9452z7.m43948x((C9329r7) zzf);
                } else {
                    i3 = C9452z7.m43942C((String) zzf);
                }
                D += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C9329r7) {
                    i2 = C9452z7.m43948x((C9329r7) obj);
                } else {
                    i2 = C9452z7.m43942C((String) obj);
                }
                D += i2;
                i4++;
            }
        }
        return D;
    }

    /* renamed from: X */
    static int m43109X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m43110Y(list) + (size * C9452z7.m43943D(i));
    }

    /* renamed from: Y */
    static int m43110Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9346s8) {
            C9346s8 s8Var = (C9346s8) list;
            i = 0;
            while (i2 < size) {
                i += C9452z7.m43944a(s8Var.mo38025f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9452z7.m43944a(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    static int m43111Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m43113a0(list) + (size * C9452z7.m43943D(i));
    }

    /* renamed from: a */
    public static C9410wa m43112a() {
        return f45109c;
    }

    /* renamed from: a0 */
    static int m43113a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9223k9) {
            C9223k9 k9Var = (C9223k9) list;
            i = 0;
            while (i2 < size) {
                i += C9452z7.m43945b(k9Var.mo37689m(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9452z7.m43945b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C9410wa m43114b() {
        return f45110d;
    }

    /* renamed from: b0 */
    public static C9410wa m43115b0() {
        return f45108b;
    }

    /* renamed from: c */
    static Object m43116c(int i, List list, C9393v8 v8Var, Object obj, C9410wa waVar) {
        if (v8Var == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (v8Var.mo37520m(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = m43117d(i, intValue, obj, waVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!v8Var.mo37520m(intValue2)) {
                    obj = m43117d(i, intValue2, obj, waVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: d */
    static Object m43117d(int i, int i2, Object obj, C9410wa waVar) {
        if (obj == null) {
            obj = waVar.mo38126e();
        }
        waVar.mo38127f(obj, i, (long) i2);
        return obj;
    }

    /* renamed from: e */
    static void m43118e(C9147f8 f8Var, Object obj, Object obj2) {
        f8Var.mo37561a(obj2);
        throw null;
    }

    /* renamed from: f */
    static void m43119f(C9410wa waVar, Object obj, Object obj2) {
        waVar.mo38129h(obj, waVar.mo38125d(waVar.mo38124c(obj), waVar.mo38124c(obj2)));
    }

    /* renamed from: g */
    public static void m43120g(Class cls) {
        Class cls2;
        if (!C9330r8.class.isAssignableFrom(cls) && (cls2 = f45107a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    static boolean m43121h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: i */
    static void m43122i(C9315q9 q9Var, Object obj, Object obj2, long j) {
        C9165gb.m42968x(obj, j, C9315q9.m43514b(C9165gb.m42955k(obj, j), C9165gb.m42955k(obj2, j)));
    }

    /* renamed from: j */
    public static void m43123j(int i, List list, C9069a8 a8Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            a8Var.mo37341n(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m43124k(int i, List list, C9069a8 a8Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            a8Var.mo37343p(i, list);
        }
    }

    /* renamed from: l */
    public static void m43125l(int i, List list, C9069a8 a8Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            a8Var.mo37345r(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m43126m(int i, List list, C9069a8 a8Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            a8Var.mo37348u(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m43127n(int i, List list, C9069a8 a8Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            a8Var.mo37350w(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m43128o(int i, List list, C9069a8 a8Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            a8Var.mo37352y(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m43129p(int i, List list, C9069a8 a8Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            a8Var.mo37318A(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m43130q(int i, List list, C9069a8 a8Var, C9179ha haVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                a8Var.mo37319B(i, list.get(i2), haVar);
            }
        }
    }

    /* renamed from: r */
    public static void m43131r(int i, List list, C9069a8 a8Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            a8Var.mo37321D(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m43132s(int i, List list, C9069a8 a8Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            a8Var.mo37323F(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m43133t(int i, List list, C9069a8 a8Var, C9179ha haVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                a8Var.mo37324G(i, list.get(i2), haVar);
            }
        }
    }

    /* renamed from: u */
    public static void m43134u(int i, List list, C9069a8 a8Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            a8Var.mo37326I(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m43135v(int i, List list, C9069a8 a8Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            a8Var.mo37328K(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m43136w(int i, List list, C9069a8 a8Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            a8Var.mo37330b(i, list, z);
        }
    }

    /* renamed from: x */
    public static void m43137x(int i, List list, C9069a8 a8Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            a8Var.mo37332d(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m43138y(int i, List list, C9069a8 a8Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            a8Var.mo37335g(i, list);
        }
    }

    /* renamed from: z */
    public static void m43139z(int i, List list, C9069a8 a8Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            a8Var.mo37337i(i, list, z);
        }
    }
}
