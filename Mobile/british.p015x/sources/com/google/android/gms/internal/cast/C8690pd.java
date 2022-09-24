package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.cast.pd */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8690pd<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c */
    private static final C8690pd f43907c;

    /* renamed from: b */
    private boolean f43908b = true;

    static {
        C8690pd pdVar = new C8690pd();
        f43907c = pdVar;
        pdVar.f43908b = false;
    }

    private C8690pd() {
    }

    /* renamed from: h */
    private static int m41214h(Object obj) {
        if (obj instanceof byte[]) {
            return C8443ad.m40695g((byte[]) obj);
        }
        if (!(obj instanceof C8736sc)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    private final void m41215i() {
        if (!this.f43908b) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final void mo36655b(C8690pd<K, V> pdVar) {
        m41215i();
        if (!pdVar.isEmpty()) {
            putAll(pdVar);
        }
    }

    /* renamed from: c */
    public final C8690pd<K, V> mo36656c() {
        return isEmpty() ? new C8690pd<>() : new C8690pd<>(this);
    }

    public final void clear() {
        m41215i();
        super.clear();
    }

    /* renamed from: d */
    public final void mo36658d() {
        this.f43908b = false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo36661g() {
        return this.f43908b;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m41214h(entry.getValue()) ^ m41214h(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m41215i();
        C8443ad.m40689a(k);
        C8443ad.m40689a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m41215i();
        for (Object next : map.keySet()) {
            C8443ad.m40689a(next);
            C8443ad.m40689a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m41215i();
        return super.remove(obj);
    }

    private C8690pd(Map<K, V> map) {
        super(map);
    }
}
