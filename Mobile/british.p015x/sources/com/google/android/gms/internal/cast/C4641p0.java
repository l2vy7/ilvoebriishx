package com.google.android.gms.internal.cast;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.cast.p0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C4641p0<T> extends C4638m0<T> {

    /* renamed from: b */
    private final T f21188b;

    C4641p0(T t) {
        this.f21188b = t;
    }

    /* renamed from: a */
    public final T mo19112a() {
        return this.f21188b;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof C4641p0) {
            return this.f21188b.equals(((C4641p0) obj).f21188b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21188b.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21188b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
