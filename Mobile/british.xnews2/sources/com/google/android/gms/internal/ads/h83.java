package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class h83<K> extends a73<K> {

    /* renamed from: d */
    private final transient t63<K, ?> f20375d;

    /* renamed from: e */
    private final transient p63<K> f20376e;

    h83(t63<K, ?> t63, p63<K> p63) {
        this.f20375d = t63;
        this.f20376e = p63;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo18346a(Object[] objArr, int i) {
        return this.f20376e.mo18346a(objArr, i);
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f20375d.get(obj) != null;
    }

    /* renamed from: f */
    public final p63<K> mo18099f() {
        return this.f20376e;
    }

    /* renamed from: g */
    public final s83<K> mo18100g() {
        return this.f20376e.listIterator(0);
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f20376e.listIterator(0);
    }

    public final int size() {
        return this.f20375d.size();
    }
}
