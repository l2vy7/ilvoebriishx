package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class l53<K, V> implements p73<K, V> {
    @CheckForNull

    /* renamed from: b */
    private transient Set<K> f20524b;
    @CheckForNull

    /* renamed from: c */
    private transient Collection<V> f20525c;
    @CheckForNull

    /* renamed from: d */
    private transient Map<K, Collection<V>> f20526d;

    l53() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Collection<V> mo18410b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Iterator<V> mo18411c() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract Map<K, Collection<V>> mo18504d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract Set<K> mo18505e();

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p73)) {
            return false;
        }
        return zzs().equals(((p73) obj).zzs());
    }

    /* renamed from: f */
    public final Set<K> mo18507f() {
        Set<K> set = this.f20524b;
        if (set != null) {
            return set;
        }
        Set<K> e = mo18505e();
        this.f20524b = e;
        return e;
    }

    /* renamed from: g */
    public boolean mo18508g(@CheckForNull Object obj) {
        for (Collection contains : zzs().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return zzs().hashCode();
    }

    public final String toString() {
        return zzs().toString();
    }

    public Collection<V> zzr() {
        Collection<V> collection = this.f20525c;
        if (collection != null) {
            return collection;
        }
        Collection<V> b = mo18410b();
        this.f20525c = b;
        return b;
    }

    public Map<K, Collection<V>> zzs() {
        Map<K, Collection<V>> map = this.f20526d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> d = mo18504d();
        this.f20526d = d;
        return d;
    }
}
