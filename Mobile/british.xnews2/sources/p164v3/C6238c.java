package p164v3;

/* renamed from: v3.c */
/* compiled from: InstanceFactory */
public final class C6238c<T> implements C6237b<T> {

    /* renamed from: b */
    private static final C6238c<Object> f25682b = new C6238c<>((Object) null);

    /* renamed from: a */
    private final T f25683a;

    private C6238c(T t) {
        this.f25683a = t;
    }

    /* renamed from: a */
    public static <T> C6237b<T> m27330a(T t) {
        return new C6238c(C6239d.m27333c(t, "instance cannot be null"));
    }

    public T get() {
        return this.f25683a;
    }
}
