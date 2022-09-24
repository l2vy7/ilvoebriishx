package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class p83<E> extends a73<E> {

    /* renamed from: d */
    final transient E f20649d;

    p83(E e) {
        Objects.requireNonNull(e);
        this.f20649d = e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo18346a(Object[] objArr, int i) {
        objArr[i] = this.f20649d;
        return i + 1;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f20649d.equals(obj);
    }

    /* renamed from: f */
    public final p63<E> mo18099f() {
        return p63.m20815D(this.f20649d);
    }

    /* renamed from: g */
    public final s83<E> mo18100g() {
        return new b73(this.f20649d);
    }

    public final int hashCode() {
        return this.f20649d.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new b73(this.f20649d);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f20649d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
