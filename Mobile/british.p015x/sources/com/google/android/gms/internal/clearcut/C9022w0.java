package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C9043z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.w0 */
final class C9022w0<FieldDescriptorType extends C9043z0<FieldDescriptorType>> {

    /* renamed from: d */
    private static final C9022w0 f44771d = new C9022w0(true);

    /* renamed from: a */
    private final C8898f3<FieldDescriptorType, Object> f44772a = C8898f3.m41791g(16);

    /* renamed from: b */
    private boolean f44773b;

    /* renamed from: c */
    private boolean f44774c = false;

    private C9022w0() {
    }

    private C9022w0(boolean z) {
        mo37217t();
    }

    /* renamed from: f */
    static int m42430f(C8930j4 j4Var, int i, Object obj) {
        int B0 = C8947m0.m41928B0(i);
        if (j4Var == C8930j4.GROUP) {
            C8910h1.m41840i((C8942l2) obj);
            B0 <<= 1;
        }
        return B0 + m42436o(j4Var, obj);
    }

    /* renamed from: g */
    private final Object m42431g(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f44772a.get(fielddescriptortype);
        return obj instanceof C8967o1 ? C8967o1.m42154e() : obj;
    }

    /* renamed from: i */
    private final void m42432i(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo36912g()) {
            m42433j(fielddescriptortype.mo36914r(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m42433j(fielddescriptortype.mo36914r(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C8967o1) {
            this.f44774c = true;
        }
        this.f44772a.put(fielddescriptortype, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if ((r3 instanceof com.google.android.gms.internal.clearcut.C8917i1) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.clearcut.C8967o1) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m42433j(com.google.android.gms.internal.clearcut.C8930j4 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.clearcut.C8910h1.m41832a(r3)
            int[] r0 = com.google.android.gms.internal.clearcut.C9029x0.f44790a
            com.google.android.gms.internal.clearcut.o4 r2 = r2.mo36982d()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0041;
                case 2: goto L_0x003e;
                case 3: goto L_0x003b;
                case 4: goto L_0x0038;
                case 5: goto L_0x0035;
                case 6: goto L_0x0032;
                case 7: goto L_0x0029;
                case 8: goto L_0x0020;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0044
        L_0x0015:
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.C8942l2
            if (r2 != 0) goto L_0x0043
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.C8967o1
            if (r2 == 0) goto L_0x001e
            goto L_0x0043
        L_0x001e:
            r0 = 0
            goto L_0x0043
        L_0x0020:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0043
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.C8917i1
            if (r2 == 0) goto L_0x001e
            goto L_0x0043
        L_0x0029:
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.C8847a0
            if (r2 != 0) goto L_0x0043
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x001e
            goto L_0x0043
        L_0x0032:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0043
        L_0x0035:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0043
        L_0x0038:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0043
        L_0x003b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0043
        L_0x003e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0043
        L_0x0041:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0043:
            r1 = r0
        L_0x0044:
            if (r1 == 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L_0x0050
        L_0x004f:
            throw r2
        L_0x0050:
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C9022w0.m42433j(com.google.android.gms.internal.clearcut.j4, java.lang.Object):void");
    }

    /* renamed from: k */
    public static <T extends C9043z0<T>> C9022w0<T> m42434k() {
        return f44771d;
    }

    /* renamed from: n */
    private static int m42435n(C9043z0<?> z0Var, Object obj) {
        C8930j4 r = z0Var.mo36914r();
        int zzc = z0Var.zzc();
        if (!z0Var.mo36912g()) {
            return m42430f(r, zzc, obj);
        }
        int i = 0;
        List<Object> list = (List) obj;
        if (z0Var.mo36916v()) {
            for (Object o : list) {
                i += m42436o(r, o);
            }
            return C8947m0.m41928B0(zzc) + i + C8947m0.m41940J0(i);
        }
        for (Object f : list) {
            i += m42430f(r, zzc, f);
        }
        return i;
    }

    /* renamed from: o */
    private static int m42436o(C8930j4 j4Var, Object obj) {
        switch (C9029x0.f44791b[j4Var.ordinal()]) {
            case 1:
                return C8947m0.m41972w(((Double) obj).doubleValue());
            case 2:
                return C8947m0.m41974x(((Float) obj).floatValue());
            case 3:
                return C8947m0.m41955e0(((Long) obj).longValue());
            case 4:
                return C8947m0.m41958h0(((Long) obj).longValue());
            case 5:
                return C8947m0.m41930C0(((Integer) obj).intValue());
            case 6:
                return C8947m0.m41964p0(((Long) obj).longValue());
            case 7:
                return C8947m0.m41936F0(((Integer) obj).intValue());
            case 8:
                return C8947m0.m41935F(((Boolean) obj).booleanValue());
            case 9:
                return C8947m0.m41950Z((C8942l2) obj);
            case 10:
                return obj instanceof C8967o1 ? C8947m0.m41954e((C8967o1) obj) : C8947m0.m41945R((C8942l2) obj);
            case 11:
                return obj instanceof C8847a0 ? C8947m0.m41931D((C8847a0) obj) : C8947m0.m41965q0((String) obj);
            case 12:
                return obj instanceof C8847a0 ? C8947m0.m41931D((C8847a0) obj) : C8947m0.m41951a0((byte[]) obj);
            case 13:
                return C8947m0.m41932D0(((Integer) obj).intValue());
            case 14:
                return C8947m0.m41937G0(((Integer) obj).intValue());
            case 15:
                return C8947m0.m41967s0(((Long) obj).longValue());
            case 16:
                return C8947m0.m41934E0(((Integer) obj).intValue());
            case 17:
                return C8947m0.m41961l0(((Long) obj).longValue());
            case 18:
                return obj instanceof C8917i1 ? C8947m0.m41938H0(((C8917i1) obj).zzc()) : C8947m0.m41938H0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: p */
    private static boolean m42437p(Map.Entry<FieldDescriptorType, Object> entry) {
        C9043z0 z0Var = (C9043z0) entry.getKey();
        if (z0Var.mo36911f() == C8970o4.MESSAGE) {
            boolean g = z0Var.mo36912g();
            Object value = entry.getValue();
            if (g) {
                for (C8942l2 isInitialized : (List) value) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else if (value instanceof C8942l2) {
                if (!((C8942l2) value).isInitialized()) {
                    return false;
                }
            } else if (value instanceof C8967o1) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: q */
    private final void m42438q(Map.Entry<FieldDescriptorType, Object> entry) {
        C9043z0 z0Var = (C9043z0) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C8967o1) {
            value = C8967o1.m42154e();
        }
        if (z0Var.mo36912g()) {
            Object g = m42431g(z0Var);
            if (g == null) {
                g = new ArrayList();
            }
            for (Object s : (List) value) {
                ((List) g).add(m42440s(s));
            }
            this.f44772a.put(z0Var, g);
        } else if (z0Var.mo36911f() == C8970o4.MESSAGE) {
            Object g2 = m42431g(z0Var);
            if (g2 == null) {
                this.f44772a.put(z0Var, m42440s(value));
            } else {
                this.f44772a.put(z0Var, g2 instanceof C8989r2 ? z0Var.mo36913l0((C8989r2) g2, (C8989r2) value) : z0Var.mo36915t(((C8942l2) g2).mo36892b(), (C8942l2) value).mo36903f());
            }
        } else {
            this.f44772a.put(z0Var, m42440s(value));
        }
    }

    /* renamed from: r */
    private static int m42439r(Map.Entry<FieldDescriptorType, Object> entry) {
        C9043z0 z0Var = (C9043z0) entry.getKey();
        Object value = entry.getValue();
        if (z0Var.mo36911f() != C8970o4.MESSAGE || z0Var.mo36912g() || z0Var.mo36916v()) {
            return m42435n(z0Var, value);
        }
        boolean z = value instanceof C8967o1;
        int zzc = ((C9043z0) entry.getKey()).zzc();
        return z ? C8947m0.m41926A(zzc, (C8967o1) value) : C8947m0.m41949Y(zzc, (C8942l2) value);
    }

    /* renamed from: s */
    private static Object m42440s(Object obj) {
        if (obj instanceof C8989r2) {
            return ((C8989r2) obj).mo37134z();
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
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> mo37206a() {
        return this.f44774c ? new C8988r1(this.f44772a.mo36940p().iterator()) : this.f44772a.mo36940p().iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo37207b() {
        return this.f44772a.isEmpty();
    }

    /* renamed from: c */
    public final boolean mo37208c() {
        return this.f44773b;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C9022w0 w0Var = new C9022w0();
        for (int i = 0; i < this.f44772a.mo36938n(); i++) {
            Map.Entry<FieldDescriptorType, Object> h = this.f44772a.mo36936h(i);
            w0Var.m42432i((C9043z0) h.getKey(), h.getValue());
        }
        for (Map.Entry next : this.f44772a.mo36939o()) {
            w0Var.m42432i((C9043z0) next.getKey(), next.getValue());
        }
        w0Var.f44774c = this.f44774c;
        return w0Var;
    }

    /* renamed from: d */
    public final boolean mo37210d() {
        for (int i = 0; i < this.f44772a.mo36938n(); i++) {
            if (!m42437p(this.f44772a.mo36936h(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> p : this.f44772a.mo36939o()) {
            if (!m42437p(p)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> mo37211e() {
        return this.f44774c ? new C8988r1(this.f44772a.entrySet().iterator()) : this.f44772a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9022w0)) {
            return false;
        }
        return this.f44772a.equals(((C9022w0) obj).f44772a);
    }

    /* renamed from: h */
    public final void mo37213h(C9022w0<FieldDescriptorType> w0Var) {
        for (int i = 0; i < w0Var.f44772a.mo36938n(); i++) {
            m42438q(w0Var.f44772a.mo36936h(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> q : w0Var.f44772a.mo36939o()) {
            m42438q(q);
        }
    }

    public final int hashCode() {
        return this.f44772a.hashCode();
    }

    /* renamed from: l */
    public final int mo37215l() {
        int i = 0;
        for (int i2 = 0; i2 < this.f44772a.mo36938n(); i2++) {
            Map.Entry<FieldDescriptorType, Object> h = this.f44772a.mo36936h(i2);
            i += m42435n((C9043z0) h.getKey(), h.getValue());
        }
        for (Map.Entry next : this.f44772a.mo36939o()) {
            i += m42435n((C9043z0) next.getKey(), next.getValue());
        }
        return i;
    }

    /* renamed from: m */
    public final int mo37216m() {
        int i = 0;
        for (int i2 = 0; i2 < this.f44772a.mo36938n(); i2++) {
            i += m42439r(this.f44772a.mo36936h(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> r : this.f44772a.mo36939o()) {
            i += m42439r(r);
        }
        return i;
    }

    /* renamed from: t */
    public final void mo37217t() {
        if (!this.f44773b) {
            this.f44772a.mo36943s();
            this.f44773b = true;
        }
    }
}
