package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.vision.a4 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9466a4<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c */
    private static final C9466a4 f45590c;

    /* renamed from: b */
    private boolean f45591b = true;

    static {
        C9466a4 a4Var = new C9466a4();
        f45590c = a4Var;
        a4Var.f45591b = false;
    }

    private C9466a4() {
    }

    /* renamed from: g */
    public static <K, V> C9466a4<K, V> m44031g() {
        return f45590c;
    }

    /* renamed from: i */
    private final void m44032i() {
        if (!this.f45591b) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: l */
    private static int m44033l(Object obj) {
        if (obj instanceof byte[]) {
            return C9662w2.m44748b((byte[]) obj);
        }
        if (!(obj instanceof C9689z2)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final boolean mo38240b() {
        return this.f45591b;
    }

    /* renamed from: c */
    public final void mo38241c(C9466a4<K, V> a4Var) {
        m44032i();
        if (!a4Var.isEmpty()) {
            putAll(a4Var);
        }
    }

    public final void clear() {
        m44032i();
        super.clear();
    }

    /* renamed from: d */
    public final void mo38243d() {
        this.f45591b = false;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9466a4.equals(java.lang.Object):boolean");
    }

    /* renamed from: h */
    public final C9466a4<K, V> mo38246h() {
        return isEmpty() ? new C9466a4<>() : new C9466a4<>(this);
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m44033l(entry.getValue()) ^ m44033l(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m44032i();
        C9662w2.m44747a(k);
        C9662w2.m44747a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m44032i();
        for (Object next : map.keySet()) {
            C9662w2.m44747a(next);
            C9662w2.m44747a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m44032i();
        return super.remove(obj);
    }

    private C9466a4(Map<K, V> map) {
        super(map);
    }
}
