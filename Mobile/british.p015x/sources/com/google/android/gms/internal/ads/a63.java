package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class a63<T> extends d83<T> implements Serializable {

    /* renamed from: b */
    final Comparator<T> f20109b;

    a63(Comparator<T> comparator) {
        Objects.requireNonNull(comparator);
        this.f20109b = comparator;
    }

    public final int compare(T t, T t2) {
        return this.f20109b.compare(t, t2);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a63) {
            return this.f20109b.equals(((a63) obj).f20109b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20109b.hashCode();
    }

    public final String toString() {
        return this.f20109b.toString();
    }
}
