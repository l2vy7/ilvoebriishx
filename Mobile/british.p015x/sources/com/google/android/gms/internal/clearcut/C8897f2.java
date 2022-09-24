package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.clearcut.f2 */
public final class C8897f2<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c */
    private static final C8897f2 f44532c;

    /* renamed from: b */
    private boolean f44533b = true;

    static {
        C8897f2 f2Var = new C8897f2();
        f44532c = f2Var;
        f2Var.f44533b = false;
    }

    private C8897f2() {
    }

    private C8897f2(Map<K, V> map) {
        super(map);
    }

    /* renamed from: d */
    public static <K, V> C8897f2<K, V> m41781d() {
        return f44532c;
    }

    /* renamed from: h */
    private final void m41782h() {
        if (!this.f44533b) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: i */
    private static int m41783i(Object obj) {
        if (obj instanceof byte[]) {
            return C8910h1.m41833b((byte[]) obj);
        }
        if (!(obj instanceof C8917i1)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final boolean mo36918b() {
        return this.f44533b;
    }

    /* renamed from: c */
    public final void mo36919c(C8897f2<K, V> f2Var) {
        m41782h();
        if (!f2Var.isEmpty()) {
            putAll(f2Var);
        }
    }

    public final void clear() {
        m41782h();
        super.clear();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = 0
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = 1
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C8897f2.equals(java.lang.Object):boolean");
    }

    /* renamed from: g */
    public final C8897f2<K, V> mo36923g() {
        return isEmpty() ? new C8897f2<>() : new C8897f2<>(this);
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m41783i(entry.getValue()) ^ m41783i(entry.getKey());
        }
        return i;
    }

    /* renamed from: l */
    public final void mo36925l() {
        this.f44533b = false;
    }

    public final V put(K k, V v) {
        m41782h();
        C8910h1.m41832a(k);
        C8910h1.m41832a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m41782h();
        for (Object next : map.keySet()) {
            C8910h1.m41832a(next);
            C8910h1.m41832a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m41782h();
        return super.remove(obj);
    }
}
