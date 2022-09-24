package com.google.android.gms.internal.vision;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.i3 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9537i3<K> implements Map.Entry<K, Object> {

    /* renamed from: b */
    private Map.Entry<K, C9521g3> f45675b;

    private C9537i3(Map.Entry<K, C9521g3> entry) {
        this.f45675b = entry;
    }

    /* renamed from: a */
    public final C9521g3 mo38421a() {
        return this.f45675b.getValue();
    }

    public final K getKey() {
        return this.f45675b.getKey();
    }

    public final Object getValue() {
        if (this.f45675b.getValue() == null) {
            return null;
        }
        return C9521g3.m44271e();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C9522g4) {
            return this.f45675b.getValue().mo38484d((C9522g4) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
