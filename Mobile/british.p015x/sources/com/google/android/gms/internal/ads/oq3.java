package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class oq3<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c */
    private static final oq3 f36579c;

    /* renamed from: b */
    private boolean f36580b = true;

    static {
        oq3 oq3 = new oq3();
        f36579c = oq3;
        oq3.f36580b = false;
    }

    private oq3() {
    }

    /* renamed from: b */
    public static <K, V> oq3<K, V> m35797b() {
        return f36579c;
    }

    /* renamed from: i */
    private static int m35798i(Object obj) {
        if (obj instanceof byte[]) {
            return up3.m38376b((byte[]) obj);
        }
        if (!(obj instanceof C7950mp3)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: l */
    private final void m35799l() {
        if (!this.f36580b) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final oq3<K, V> mo33983c() {
        return isEmpty() ? new oq3<>() : new oq3<>(this);
    }

    public final void clear() {
        m35799l();
        super.clear();
    }

    /* renamed from: d */
    public final void mo33985d() {
        this.f36580b = false;
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
    public final void mo33988g(oq3<K, V> oq3) {
        m35799l();
        if (!oq3.isEmpty()) {
            putAll(oq3);
        }
    }

    /* renamed from: h */
    public final boolean mo33989h() {
        return this.f36580b;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m35798i(entry.getValue()) ^ m35798i(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m35799l();
        up3.m38379e(k);
        up3.m38379e(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m35799l();
        for (Object next : map.keySet()) {
            up3.m38379e(next);
            up3.m38379e(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m35799l();
        return super.remove(obj);
    }

    private oq3(Map<K, V> map) {
        super(map);
    }
}
