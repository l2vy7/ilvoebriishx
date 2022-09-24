package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9569m2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.k2 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9553k2<T extends C9569m2<T>> {

    /* renamed from: d */
    private static final C9553k2 f45718d = new C9553k2(true);

    /* renamed from: a */
    final C9675x4<T, Object> f45719a;

    /* renamed from: b */
    private boolean f45720b;

    /* renamed from: c */
    private boolean f45721c;

    private C9553k2() {
        this.f45719a = C9675x4.m44810i(16);
    }

    /* renamed from: e */
    static int m44417e(C9488c6 c6Var, int i, Object obj) {
        int H = C9482c2.m44061H(i);
        if (c6Var == C9488c6.GROUP) {
            C9662w2.m44753g((C9522g4) obj);
            H <<= 1;
        }
        return H + m44419j(c6Var, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r3 instanceof com.google.android.gms.internal.vision.C9689z2) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r3 instanceof com.google.android.gms.internal.vision.C9521g3) == false) goto L_0x0014;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m44418i(com.google.android.gms.internal.vision.C9488c6 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.vision.C9662w2.m44747a(r3)
            int[] r0 = com.google.android.gms.internal.vision.C9577n2.f45746a
            com.google.android.gms.internal.vision.j6 r2 = r2.mo38310d()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001f;
                case 9: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r0 = 0
            goto L_0x0042
        L_0x0016:
            boolean r2 = r3 instanceof com.google.android.gms.internal.vision.C9522g4
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.vision.C9521g3
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x001f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.vision.C9689z2
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.vision.C9552k1
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L_0x004e
        L_0x004d:
            throw r2
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9553k2.m44418i(com.google.android.gms.internal.vision.c6, java.lang.Object):void");
    }

    /* renamed from: j */
    private static int m44419j(C9488c6 c6Var, Object obj) {
        switch (C9577n2.f45747b[c6Var.ordinal()]) {
            case 1:
                return C9482c2.m44092r(((Double) obj).doubleValue());
            case 2:
                return C9482c2.m44099v0(((Float) obj).floatValue());
            case 3:
                return C9482c2.m44103y0(((Long) obj).longValue());
            case 4:
                return C9482c2.m44105z0(((Long) obj).longValue());
            case 5:
                return C9482c2.m44062I(((Integer) obj).intValue());
            case 6:
                return C9482c2.m44059D0(((Long) obj).longValue());
            case 7:
                return C9482c2.m44065L(((Integer) obj).intValue());
            case 8:
                return C9482c2.m44086k0(((Boolean) obj).booleanValue());
            case 9:
                return C9482c2.m44075X((C9522g4) obj);
            case 10:
                if (obj instanceof C9521g3) {
                    return C9482c2.m44082d((C9521g3) obj);
                }
                return C9482c2.m44072S((C9522g4) obj);
            case 11:
                if (obj instanceof C9552k1) {
                    return C9482c2.m44104z((C9552k1) obj);
                }
                return C9482c2.m44058C0((String) obj);
            case 12:
                if (obj instanceof C9552k1) {
                    return C9482c2.m44104z((C9552k1) obj);
                }
                return C9482c2.m44079b0((byte[]) obj);
            case 13:
                return C9482c2.m44063J(((Integer) obj).intValue());
            case 14:
                return C9482c2.m44066M(((Integer) obj).intValue());
            case 15:
                return C9482c2.m44060E0(((Long) obj).longValue());
            case 16:
                return C9482c2.m44064K(((Integer) obj).intValue());
            case 17:
                return C9482c2.m44057B0(((Long) obj).longValue());
            case 18:
                if (obj instanceof C9689z2) {
                    return C9482c2.m44067N(((C9689z2) obj).mo38237e());
                }
                return C9482c2.m44067N(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: l */
    private static <T extends C9569m2<T>> boolean m44420l(Map.Entry<T, Object> entry) {
        C9569m2 m2Var = (C9569m2) entry.getKey();
        if (m2Var.mo38500m0() == C9548j6.MESSAGE) {
            if (m2Var.mo38494Q()) {
                for (C9522g4 isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C9522g4) {
                    if (!((C9522g4) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof C9521g3) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: m */
    public static int m44421m(C9569m2<?> m2Var, Object obj) {
        C9488c6 e0 = m2Var.mo38497e0();
        int e = m2Var.mo38496e();
        if (!m2Var.mo38494Q()) {
            return m44417e(e0, e, obj);
        }
        int i = 0;
        if (m2Var.mo38495X()) {
            for (Object j : (List) obj) {
                i += m44419j(e0, j);
            }
            return C9482c2.m44061H(e) + i + C9482c2.m44069P(i);
        }
        for (Object e2 : (List) obj) {
            i += m44417e(e0, e, e2);
        }
        return i;
    }

    /* renamed from: n */
    private final void m44422n(Map.Entry<T, Object> entry) {
        Object obj;
        C9569m2 m2Var = (C9569m2) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C9521g3) {
            C9521g3 g3Var = (C9521g3) value;
            value = C9521g3.m44271e();
        }
        if (m2Var.mo38494Q()) {
            Object f = mo38475f(m2Var);
            if (f == null) {
                f = new ArrayList();
            }
            for (Object s : (List) value) {
                ((List) f).add(m44425s(s));
            }
            this.f45719a.put(m2Var, f);
        } else if (m2Var.mo38500m0() == C9548j6.MESSAGE) {
            Object f2 = mo38475f(m2Var);
            if (f2 == null) {
                this.f45719a.put(m2Var, m44425s(value));
                return;
            }
            if (f2 instanceof C9555k4) {
                obj = m2Var.mo38499i0((C9555k4) f2, (C9555k4) value);
            } else {
                obj = m2Var.mo38498h(((C9522g4) f2).mo38403c(), (C9522g4) value).mo38389A();
            }
            this.f45719a.put(m2Var, obj);
        } else {
            this.f45719a.put(m2Var, m44425s(value));
        }
    }

    /* renamed from: o */
    private static int m44423o(Map.Entry<T, Object> entry) {
        C9569m2 m2Var = (C9569m2) entry.getKey();
        Object value = entry.getValue();
        if (m2Var.mo38500m0() != C9548j6.MESSAGE || m2Var.mo38494Q() || m2Var.mo38495X()) {
            return m44421m(m2Var, value);
        }
        if (value instanceof C9521g3) {
            return C9482c2.m44097u(((C9569m2) entry.getKey()).mo38496e(), (C9521g3) value);
        }
        return C9482c2.m44098v(((C9569m2) entry.getKey()).mo38496e(), (C9522g4) value);
    }

    /* renamed from: q */
    public static <T extends C9569m2<T>> C9553k2<T> m44424q() {
        return f45718d;
    }

    /* renamed from: s */
    private static Object m44425s(Object obj) {
        if (obj instanceof C9555k4) {
            return ((C9555k4) obj).mo38258u();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Iterator<Map.Entry<T, Object>> mo38469a() {
        if (this.f45721c) {
            return new C9562l3(this.f45719a.mo38660q().iterator());
        }
        return this.f45719a.mo38660q().iterator();
    }

    /* renamed from: b */
    public final boolean mo38470b() {
        return this.f45720b;
    }

    /* renamed from: c */
    public final boolean mo38471c() {
        for (int i = 0; i < this.f45719a.mo38657o(); i++) {
            if (!m44420l(this.f45719a.mo38656j(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> l : this.f45719a.mo38658p()) {
            if (!m44420l(l)) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C9553k2 k2Var = new C9553k2();
        for (int i = 0; i < this.f45719a.mo38657o(); i++) {
            Map.Entry<T, Object> j = this.f45719a.mo38656j(i);
            k2Var.mo38477h((C9569m2) j.getKey(), j.getValue());
        }
        for (Map.Entry next : this.f45719a.mo38658p()) {
            k2Var.mo38477h((C9569m2) next.getKey(), next.getValue());
        }
        k2Var.f45721c = this.f45721c;
        return k2Var;
    }

    /* renamed from: d */
    public final Iterator<Map.Entry<T, Object>> mo38473d() {
        if (this.f45721c) {
            return new C9562l3(this.f45719a.entrySet().iterator());
        }
        return this.f45719a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9553k2)) {
            return false;
        }
        return this.f45719a.equals(((C9553k2) obj).f45719a);
    }

    /* renamed from: f */
    public final Object mo38475f(T t) {
        Object obj = this.f45719a.get(t);
        if (!(obj instanceof C9521g3)) {
            return obj;
        }
        C9521g3 g3Var = (C9521g3) obj;
        return C9521g3.m44271e();
    }

    /* renamed from: g */
    public final void mo38476g(C9553k2<T> k2Var) {
        for (int i = 0; i < k2Var.f45719a.mo38657o(); i++) {
            m44422n(k2Var.f45719a.mo38656j(i));
        }
        for (Map.Entry<T, Object> n : k2Var.f45719a.mo38658p()) {
            m44422n(n);
        }
    }

    /* renamed from: h */
    public final void mo38477h(T t, Object obj) {
        if (!t.mo38494Q()) {
            m44418i(t.mo38497e0(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m44418i(t.mo38497e0(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C9521g3) {
            this.f45721c = true;
        }
        this.f45719a.put(t, obj);
    }

    public final int hashCode() {
        return this.f45719a.hashCode();
    }

    /* renamed from: k */
    public final void mo38479k(T t, Object obj) {
        List list;
        if (t.mo38494Q()) {
            m44418i(t.mo38497e0(), obj);
            Object f = mo38475f(t);
            if (f == null) {
                list = new ArrayList();
                this.f45719a.put(t, list);
            } else {
                list = (List) f;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: p */
    public final void mo38480p() {
        if (!this.f45720b) {
            this.f45719a.mo38251n();
            this.f45720b = true;
        }
    }

    /* renamed from: r */
    public final int mo38481r() {
        int i = 0;
        for (int i2 = 0; i2 < this.f45719a.mo38657o(); i2++) {
            i += m44423o(this.f45719a.mo38656j(i2));
        }
        for (Map.Entry<T, Object> o : this.f45719a.mo38658p()) {
            i += m44423o(o);
        }
        return i;
    }

    private C9553k2(boolean z) {
        this(C9675x4.m44810i(0));
        mo38480p();
    }

    private C9553k2(C9675x4<T, Object> x4Var) {
        this.f45719a = x4Var;
        mo38480p();
    }
}
