package com.google.android.gms.internal.cast;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.cast.g1 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C4635g1<K, V> extends C4648z0<K, V> {

    /* renamed from: f */
    static final C4648z0<Object, Object> f21182f = new C4635g1((Object) null, new Object[0], 0);

    /* renamed from: e */
    final transient Object[] f21183e;

    private C4635g1(Object obj, Object[] objArr, int i) {
        this.f21183e = objArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C4633a1<Map.Entry<K, V>> mo19107d() {
        return new C8482d1(this, this.f21183e, 0, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C4633a1<K> mo19108e() {
        return new C4634e1(this, new C8515f1(this.f21183e, 0, 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C4645u0<V> mo19109g() {
        return new C8515f1(this.f21183e, 1, 0);
    }

    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        return null;
    }

    public final int size() {
        return 0;
    }
}
