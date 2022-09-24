package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.p9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public final class C9300p9 extends LinkedHashMap {

    /* renamed from: c */
    private static final C9300p9 f45363c;

    /* renamed from: b */
    private boolean f45364b = true;

    static {
        C9300p9 p9Var = new C9300p9();
        f45363c = p9Var;
        p9Var.f45364b = false;
    }

    private C9300p9() {
    }

    /* renamed from: b */
    public static C9300p9 m43489b() {
        return f45363c;
    }

    /* renamed from: i */
    private static int m43490i(Object obj) {
        if (obj instanceof byte[]) {
            return C9453z8.m43971b((byte[]) obj);
        }
        return obj.hashCode();
    }

    /* renamed from: l */
    private final void m43491l() {
        if (!this.f45364b) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final C9300p9 mo37929c() {
        return isEmpty() ? new C9300p9() : new C9300p9(this);
    }

    public final void clear() {
        m43491l();
        super.clear();
    }

    /* renamed from: d */
    public final void mo37931d() {
        this.f45364b = false;
    }

    public final Set entrySet() {
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
    public final void mo37934g(C9300p9 p9Var) {
        m43491l();
        if (!p9Var.isEmpty()) {
            putAll(p9Var);
        }
    }

    /* renamed from: h */
    public final boolean mo37935h() {
        return this.f45364b;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m43490i(entry.getValue()) ^ m43490i(entry.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        m43491l();
        C9453z8.m43974e(obj);
        C9453z8.m43974e(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        m43491l();
        for (Object next : map.keySet()) {
            C9453z8.m43974e(next);
            C9453z8.m43974e(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        m43491l();
        return super.remove(obj);
    }

    private C9300p9(Map map) {
        super(map);
    }
}
