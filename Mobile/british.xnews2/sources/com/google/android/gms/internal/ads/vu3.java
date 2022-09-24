package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vu3<T> implements uu3, ou3 {

    /* renamed from: b */
    private static final vu3<Object> f40556b = new vu3<>((Object) null);

    /* renamed from: a */
    private final T f40557a;

    private vu3(T t) {
        this.f40557a = t;
    }

    /* renamed from: a */
    public static <T> uu3<T> m38959a(T t) {
        cv3.m31155a(t, "instance cannot be null");
        return new vu3(t);
    }

    /* renamed from: b */
    public static <T> uu3<T> m38960b(T t) {
        return t == null ? f40556b : new vu3(t);
    }

    public final T zzb() {
        return this.f40557a;
    }
}
