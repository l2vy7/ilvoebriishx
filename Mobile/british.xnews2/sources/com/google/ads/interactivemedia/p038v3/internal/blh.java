package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.blh */
/* compiled from: IMASDK */
public final class blh<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b */
    private static final blh f16634b;

    /* renamed from: a */
    private boolean f16635a = true;

    static {
        blh blh = new blh();
        f16634b = blh;
        blh.mo15436d();
    }

    private blh() {
    }

    /* renamed from: a */
    public static <K, V> blh<K, V> m16397a() {
        return f16634b;
    }

    /* renamed from: f */
    private static int m16398f(Object obj) {
        if (obj instanceof byte[]) {
            return bkr.m16342e((byte[]) obj);
        }
        if (!(obj instanceof bkn)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    private final void m16399g() {
        if (!this.f16635a) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final void mo15433b(blh<K, V> blh) {
        m16399g();
        if (!blh.isEmpty()) {
            putAll(blh);
        }
    }

    /* renamed from: c */
    public final blh<K, V> mo15434c() {
        return isEmpty() ? new blh<>() : new blh<>(this);
    }

    public final void clear() {
        m16399g();
        super.clear();
    }

    /* renamed from: d */
    public final void mo15436d() {
        this.f16635a = false;
    }

    /* renamed from: e */
    public final boolean mo15437e() {
        return this.f16635a;
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

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m16398f(entry.getValue()) ^ m16398f(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m16399g();
        bkr.m16346i(k);
        bkr.m16346i(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m16399g();
        for (Object next : map.keySet()) {
            bkr.m16346i(next);
            bkr.m16346i(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m16399g();
        return super.remove(obj);
    }

    private blh(Map<K, V> map) {
        super(map);
    }
}
