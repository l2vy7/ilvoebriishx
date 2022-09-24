package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class m83<T> extends d83<T> implements Serializable {

    /* renamed from: b */
    final d83<? super T> f20546b;

    m83(d83<? super T> d83) {
        this.f20546b = d83;
    }

    /* renamed from: a */
    public final <S extends T> d83<S> mo18552a() {
        return this.f20546b;
    }

    public final int compare(T t, T t2) {
        return this.f20546b.compare(t2, t);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m83) {
            return this.f20546b.equals(((m83) obj).f20546b);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f20546b.hashCode();
    }

    public final String toString() {
        return this.f20546b.toString().concat(".reverse()");
    }
}
