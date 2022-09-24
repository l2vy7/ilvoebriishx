package com.google.android.gms.internal.cast;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.cast.m0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public abstract class C4638m0<T> implements Serializable {
    C4638m0() {
    }

    /* renamed from: b */
    public static <T> C4638m0<T> m21334b(@NullableDecl T t) {
        return t == null ? C4636j0.f21184b : new C4641p0(t);
    }

    @NullableDecl
    /* renamed from: a */
    public abstract T mo19112a();
}
