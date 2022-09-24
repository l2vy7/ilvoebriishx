package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p149s6.C6073k;

/* renamed from: com.google.common.collect.s0 */
/* compiled from: RegularImmutableMap */
final class C4761s0<K, V> extends C4776v<K, V> {

    /* renamed from: i */
    static final C4776v<Object, Object> f21510i = new C4761s0((int[]) null, new Object[0], 0);

    /* renamed from: f */
    private final transient int[] f21511f;

    /* renamed from: g */
    final transient Object[] f21512g;

    /* renamed from: h */
    private final transient int f21513h;

    /* renamed from: com.google.common.collect.s0$b */
    /* compiled from: RegularImmutableMap */
    static final class C4762b<K> extends C4789y<K> {

        /* renamed from: d */
        private final transient C4776v<K, ?> f21514d;

        /* renamed from: e */
        private final transient C4766t<K> f21515e;

        C4762b(C4776v<K, ?> vVar, C4766t<K> tVar) {
            this.f21514d = vVar;
            this.f21515e = tVar;
        }

        /* renamed from: c */
        public C4766t<K> mo19839c() {
            return this.f21515e;
        }

        public boolean contains(@NullableDecl Object obj) {
            return this.f21514d.get(obj) != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo19459e(Object[] objArr, int i) {
            return mo19839c().mo19459e(objArr, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo19462q() {
            return true;
        }

        /* renamed from: r */
        public C10388e1<K> iterator() {
            return mo19839c().iterator();
        }

        public int size() {
            return this.f21514d.size();
        }
    }

    /* renamed from: com.google.common.collect.s0$a */
    /* compiled from: RegularImmutableMap */
    static class C4763a<K, V> extends C4789y<Map.Entry<K, V>> {

        /* renamed from: d */
        private final transient C4776v<K, V> f21516d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final transient Object[] f21517e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final transient int f21518f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final transient int f21519g;

        /* renamed from: com.google.common.collect.s0$a$a */
        /* compiled from: RegularImmutableMap */
        class C4764a extends C4766t<Map.Entry<K, V>> {
            C4764a() {
            }

            /* renamed from: N */
            public Map.Entry<K, V> get(int i) {
                C6073k.m26686i(i, C4763a.this.f21519g);
                int i2 = i * 2;
                return new AbstractMap.SimpleImmutableEntry(C4763a.this.f21517e[C4763a.this.f21518f + i2], C4763a.this.f21517e[i2 + (C4763a.this.f21518f ^ 1)]);
            }

            /* renamed from: q */
            public boolean mo19462q() {
                return true;
            }

            public int size() {
                return C4763a.this.f21519g;
            }
        }

        C4763a(C4776v<K, V> vVar, Object[] objArr, int i, int i2) {
            this.f21516d = vVar;
            this.f21517e = objArr;
            this.f21518f = i;
            this.f21519g = i2;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f21516d.get(key))) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo19459e(Object[] objArr, int i) {
            return mo19839c().mo19459e(objArr, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo19462q() {
            return true;
        }

        /* renamed from: r */
        public C10388e1<Map.Entry<K, V>> iterator() {
            return mo19839c().iterator();
        }

        public int size() {
            return this.f21519g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public C4766t<Map.Entry<K, V>> mo19466y() {
            return new C4764a();
        }
    }

    /* renamed from: com.google.common.collect.s0$c */
    /* compiled from: RegularImmutableMap */
    static final class C4765c extends C4766t<Object> {

        /* renamed from: d */
        private final transient Object[] f21521d;

        /* renamed from: e */
        private final transient int f21522e;

        /* renamed from: f */
        private final transient int f21523f;

        C4765c(Object[] objArr, int i, int i2) {
            this.f21521d = objArr;
            this.f21522e = i;
            this.f21523f = i2;
        }

        public Object get(int i) {
            C6073k.m26686i(i, this.f21523f);
            return this.f21521d[(i * 2) + this.f21522e];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo19462q() {
            return true;
        }

        public int size() {
            return this.f21523f;
        }
    }

    private C4761s0(int[] iArr, Object[] objArr, int i) {
        this.f21511f = iArr;
        this.f21512g = objArr;
        this.f21513h = i;
    }

    /* renamed from: r */
    static <K, V> C4761s0<K, V> m21957r(int i, Object[] objArr) {
        if (i == 0) {
            return (C4761s0) f21510i;
        }
        if (i == 1) {
            C10393j.m47929a(objArr[0], objArr[1]);
            return new C4761s0<>((int[]) null, objArr, 1);
        }
        C6073k.m26690m(i, objArr.length >> 1);
        return new C4761s0<>(m21958s(objArr, i, C4789y.m22102t(i), 0), objArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int[] m21958s(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r0 = 1
            if (r11 != r0) goto L_0x000e
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            com.google.common.collect.C10393j.m47929a(r11, r10)
            r10 = 0
            return r10
        L_0x000e:
            int r1 = r12 + -1
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L_0x0017:
            if (r3 >= r11) goto L_0x0077
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            com.google.common.collect.C10393j.m47929a(r6, r4)
            int r7 = r6.hashCode()
            int r7 = com.google.common.collect.C4756q.m21944b(r7)
        L_0x002f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L_0x0039
            r12[r7] = r5
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0039:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x0044
            int r7 = r7 + 1
            goto L_0x002f
        L_0x0044:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Multiple entries with same key: "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r1 = " and "
            r12.append(r1)
            r1 = r10[r8]
            r12.append(r1)
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x0077:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C4761s0.m21958s(java.lang.Object[], int, int, int):int[]");
    }

    /* renamed from: t */
    static Object m21959t(@NullableDecl int[] iArr, @NullableDecl Object[] objArr, int i, int i2, @NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj)) {
                return objArr[i2 ^ 1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int b = C4756q.m21944b(obj.hashCode());
            while (true) {
                int i3 = b & length;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    return null;
                }
                if (objArr[i4].equals(obj)) {
                    return objArr[i4 ^ 1];
                }
                b = i3 + 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C4789y<Map.Entry<K, V>> mo19852g() {
        return new C4763a(this, this.f21512g, 0, this.f21513h);
    }

    @NullableDecl
    public V get(@NullableDecl Object obj) {
        return m21959t(this.f21511f, this.f21512g, this.f21513h, 0, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C4789y<K> mo19854h() {
        return new C4762b(this, new C4765c(this.f21512g, 0, this.f21513h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C4757r<V> mo19855i() {
        return new C4765c(this.f21512g, 1, this.f21513h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo19856m() {
        return false;
    }

    public int size() {
        return this.f21513h;
    }
}
