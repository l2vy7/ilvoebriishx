package p142r3;

import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: r3.c */
/* compiled from: Event */
public abstract class C5997c<T> {
    /* renamed from: d */
    public static <T> C5997c<T> m26429d(int i, T t) {
        return new C5995a(Integer.valueOf(i), t, C5998d.DEFAULT);
    }

    /* renamed from: e */
    public static <T> C5997c<T> m26430e(int i, T t) {
        return new C5995a(Integer.valueOf(i), t, C5998d.VERY_LOW);
    }

    /* renamed from: a */
    public abstract Integer mo23089a();

    /* renamed from: b */
    public abstract T mo23090b();

    /* renamed from: c */
    public abstract C5998d mo23091c();
}
