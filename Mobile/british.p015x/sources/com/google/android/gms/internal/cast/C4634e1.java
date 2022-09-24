package com.google.android.gms.internal.cast;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.cast.e1 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C4634e1<K> extends C4633a1<K> {

    /* renamed from: d */
    private final transient C4648z0<K, ?> f21180d;

    /* renamed from: e */
    private final transient C4647y0<K> f21181e;

    C4634e1(C4648z0<K, ?> z0Var, C4647y0<K> y0Var) {
        this.f21180d = z0Var;
        this.f21181e = y0Var;
    }

    public final boolean contains(@NullableDecl Object obj) {
        return false;
    }

    /* renamed from: g */
    public final C4647y0<K> mo19100g() {
        return this.f21181e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo19104h(Object[] objArr, int i) {
        return this.f21181e.mo19104h(objArr, 0);
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return this.f21181e.listIterator(0);
    }

    public final int size() {
        return 0;
    }
}
