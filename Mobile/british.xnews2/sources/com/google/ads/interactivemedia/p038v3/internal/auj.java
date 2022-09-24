package com.google.ads.interactivemedia.p038v3.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.auj */
/* compiled from: IMASDK */
public class auj<K, V> extends asr<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    final transient aue<K, ? extends att<V>> f15762b;

    /* renamed from: c */
    final transient int f15763c;

    auj(aue<K, ? extends att<V>> aue, int i) {
        this.f15762b = aue;
        this.f15763c = i;
    }

    /* renamed from: f */
    public final int mo14372f() {
        throw null;
    }

    @Deprecated
    /* renamed from: g */
    public final void mo14373g() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Set<K> mo14375i() {
        throw new AssertionError("unreachable");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ Collection mo14377k() {
        return new aui(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final Map<K, Collection<V>> mo14379m() {
        throw new AssertionError("should never be called");
    }

    @Deprecated
    /* renamed from: u */
    public final void mo14381u(K k, V v) {
        throw null;
    }

    /* renamed from: v */
    public final boolean mo14395v(Object obj) {
        return obj != null && super.mo14395v(obj);
    }

    /* renamed from: x */
    public final /* bridge */ /* synthetic */ Collection mo14397x() {
        throw null;
    }

    /* renamed from: y */
    public final /* bridge */ /* synthetic */ Map mo14398y() {
        return this.f15762b;
    }
}
