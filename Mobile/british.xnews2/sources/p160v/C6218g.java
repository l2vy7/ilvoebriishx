package p160v;

/* renamed from: v.g */
/* compiled from: Pools */
class C6218g<T> implements C6217f<T> {

    /* renamed from: a */
    private final Object[] f25615a;

    /* renamed from: b */
    private int f25616b;

    C6218g(int i) {
        if (i > 0) {
            this.f25615a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public boolean mo23715a(T t) {
        int i = this.f25616b;
        Object[] objArr = this.f25615a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f25616b = i + 1;
        return true;
    }

    public T acquire() {
        int i = this.f25616b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f25615a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f25616b = i - 1;
        return t;
    }

    /* renamed from: b */
    public void mo23717b(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f25616b;
            Object[] objArr = this.f25615a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f25616b = i3 + 1;
            }
        }
    }
}
