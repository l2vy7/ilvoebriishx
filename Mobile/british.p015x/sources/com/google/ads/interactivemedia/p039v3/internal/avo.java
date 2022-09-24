package com.google.ads.interactivemedia.p039v3.internal;

import java.io.Serializable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.avo */
/* compiled from: IMASDK */
final class avo<T> extends avf<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final avf<? super T> f15810a;

    avo(avf<? super T> avf) {
        this.f15810a = avf;
    }

    /* renamed from: a */
    public final <S extends T> avf<S> mo14605a() {
        return this.f15810a;
    }

    public final int compare(T t, T t2) {
        return this.f15810a.compare(t2, t);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avo) {
            return this.f15810a.equals(((avo) obj).f15810a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f15810a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15810a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
