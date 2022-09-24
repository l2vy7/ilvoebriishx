package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class u43 extends n73 {

    /* renamed from: d */
    final transient Map f20914d;

    /* renamed from: e */
    final /* synthetic */ i53 f20915e;

    u43(i53 i53, Map map) {
        this.f20915e = i53;
        this.f20914d = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Set<Map.Entry> mo18575b() {
        return new s43(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map.Entry mo18870c(Map.Entry entry) {
        Object key = entry.getKey();
        return new l63(key, this.f20915e.mo18414j(key, (Collection) entry.getValue()));
    }

    public final void clear() {
        if (this.f20914d == this.f20915e.f20386e) {
            this.f20915e.zzp();
        } else {
            e73.m20400b(new t43(this));
        }
    }

    public final boolean containsKey(@CheckForNull Object obj) {
        Map map = this.f20914d;
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.f20914d.equals(obj);
    }

    @CheckForNull
    public final /* bridge */ /* synthetic */ Object get(@CheckForNull Object obj) {
        Collection collection = (Collection) o73.m20765a(this.f20914d, obj);
        if (collection == null) {
            return null;
        }
        return this.f20915e.mo18414j(obj, collection);
    }

    public final int hashCode() {
        return this.f20914d.hashCode();
    }

    public Set keySet() {
        return this.f20915e.mo18507f();
    }

    @CheckForNull
    public final /* bridge */ /* synthetic */ Object remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.f20914d.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection h = this.f20915e.mo18412h();
        h.addAll(collection);
        i53 i53 = this.f20915e;
        i53.f20387f = i53.f20387f - collection.size();
        collection.clear();
        return h;
    }

    public final int size() {
        return this.f20914d.size();
    }

    public final String toString() {
        return this.f20914d.toString();
    }
}
