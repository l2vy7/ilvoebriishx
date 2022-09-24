package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class n73<K, V> extends AbstractMap<K, V> {
    @CheckForNull

    /* renamed from: b */
    private transient Set<Map.Entry<K, V>> f20559b;
    @CheckForNull

    /* renamed from: c */
    private transient Collection<V> f20560c;

    n73() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Set<Map.Entry<K, V>> mo18575b();

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f20559b;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> b = mo18575b();
        this.f20559b = b;
        return b;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f20560c;
        if (collection != null) {
            return collection;
        }
        m73 m73 = new m73(this);
        this.f20560c = m73;
        return m73;
    }
}
