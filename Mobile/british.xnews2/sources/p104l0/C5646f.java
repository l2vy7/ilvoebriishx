package p104l0;

/* renamed from: l0.f */
/* compiled from: Pools */
public class C5646f<T> implements C5645e<T> {

    /* renamed from: a */
    private final Object[] f24212a;

    /* renamed from: b */
    private int f24213b;

    public C5646f(int i) {
        if (i > 0) {
            this.f24212a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: b */
    private boolean m24959b(T t) {
        for (int i = 0; i < this.f24213b; i++) {
            if (this.f24212a[i] == t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo7110a(T t) {
        if (!m24959b(t)) {
            int i = this.f24213b;
            Object[] objArr = this.f24212a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f24213b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public T acquire() {
        int i = this.f24213b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f24212a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f24213b = i - 1;
        return t;
    }
}
