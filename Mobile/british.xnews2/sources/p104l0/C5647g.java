package p104l0;

/* renamed from: l0.g */
/* compiled from: Pools */
public class C5647g<T> extends C5646f<T> {

    /* renamed from: c */
    private final Object f24214c = new Object();

    public C5647g(int i) {
        super(i);
    }

    /* renamed from: a */
    public boolean mo7110a(T t) {
        boolean a;
        synchronized (this.f24214c) {
            a = super.mo7110a(t);
        }
        return a;
    }

    public T acquire() {
        T acquire;
        synchronized (this.f24214c) {
            acquire = super.acquire();
        }
        return acquire;
    }
}
