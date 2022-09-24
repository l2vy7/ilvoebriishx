package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.d1 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8482d1<K, V> extends C4633a1<Map.Entry<K, V>> {

    /* renamed from: d */
    private final transient C4648z0<K, V> f43390d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final transient Object[] f43391e;

    C8482d1(C4648z0<K, V> z0Var, Object[] objArr, int i, int i2) {
        this.f43390d = z0Var;
        this.f43391e = objArr;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals((Object) null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo19104h(Object[] objArr, int i) {
        return mo19100g().mo19104h(objArr, 0);
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return mo19100g().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final C4647y0<Map.Entry<K, V>> mo19102j() {
        return new C8465c1(this);
    }

    public final int size() {
        return 0;
    }
}
