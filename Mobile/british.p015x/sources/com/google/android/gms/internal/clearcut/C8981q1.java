package com.google.android.gms.internal.clearcut;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.q1 */
final class C8981q1<K> implements Map.Entry<K, Object> {

    /* renamed from: b */
    private Map.Entry<K, C8967o1> f44721b;

    private C8981q1(Map.Entry<K, C8967o1> entry) {
        this.f44721b = entry;
    }

    /* renamed from: a */
    public final C8967o1 mo37117a() {
        return this.f44721b.getValue();
    }

    public final K getKey() {
        return this.f44721b.getKey();
    }

    public final Object getValue() {
        if (this.f44721b.getValue() == null) {
            return null;
        }
        return C8967o1.m42154e();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C8942l2) {
            return this.f44721b.getValue().mo37145c((C8942l2) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
