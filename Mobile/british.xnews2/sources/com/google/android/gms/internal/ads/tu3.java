package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tu3<T> implements iv3, ou3 {

    /* renamed from: c */
    private static final Object f39539c = new Object();

    /* renamed from: a */
    private volatile iv3<T> f39540a;

    /* renamed from: b */
    private volatile Object f39541b = f39539c;

    private tu3(iv3<T> iv3) {
        this.f39540a = iv3;
    }

    /* renamed from: a */
    public static <P extends iv3<T>, T> ou3<T> m38016a(P p) {
        if (p instanceof ou3) {
            return (ou3) p;
        }
        Objects.requireNonNull(p);
        return new tu3(p);
    }

    /* renamed from: b */
    public static <P extends iv3<T>, T> iv3<T> m38017b(P p) {
        Objects.requireNonNull(p);
        if (p instanceof tu3) {
            return p;
        }
        return new tu3(p);
    }

    public final T zzb() {
        T t = this.f39541b;
        T t2 = f39539c;
        if (t == t2) {
            synchronized (this) {
                t = this.f39541b;
                if (t == t2) {
                    t = this.f39540a.zzb();
                    T t3 = this.f39541b;
                    if (t3 != t2) {
                        if (t3 != t) {
                            String valueOf = String.valueOf(t3);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f39541b = t;
                    this.f39540a = null;
                }
            }
        }
        return t;
    }
}
