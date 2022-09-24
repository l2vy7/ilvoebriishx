package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class y63<K, V> extends m53<K, V> implements Serializable {

    /* renamed from: e */
    final transient t63<K, ? extends k63<V>> f21017e;

    /* renamed from: f */
    final transient int f21018f;

    y63(t63<K, ? extends k63<V>> t63, int i) {
        this.f21017e = t63;
        this.f21018f = i;
    }

    @Deprecated
    /* renamed from: a */
    public final boolean mo18409a(K k, V v) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Collection mo18410b() {
        return new w63(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map<K, Collection<V>> mo18504d() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Set<K> mo18505e() {
        throw new AssertionError("unreachable");
    }

    /* renamed from: g */
    public final boolean mo18508g(@CheckForNull Object obj) {
        return obj != null && super.mo18508g(obj);
    }

    public final int zze() {
        throw null;
    }

    @Deprecated
    public final void zzp() {
        throw null;
    }

    public final /* bridge */ /* synthetic */ Collection zzr() {
        throw null;
    }

    public final /* synthetic */ Map zzs() {
        return this.f21017e;
    }
}
