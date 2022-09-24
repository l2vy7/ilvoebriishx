package p150t;

/* renamed from: t.h */
/* compiled from: SparseArrayCompat */
public class C6091h<E> implements Cloneable {

    /* renamed from: f */
    private static final Object f25314f = new Object();

    /* renamed from: b */
    private boolean f25315b;

    /* renamed from: c */
    private int[] f25316c;

    /* renamed from: d */
    private Object[] f25317d;

    /* renamed from: e */
    private int f25318e;

    public C6091h() {
        this(10);
    }

    /* renamed from: d */
    private void m26792d() {
        int i = this.f25318e;
        int[] iArr = this.f25316c;
        Object[] objArr = this.f25317d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f25314f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f25315b = false;
        this.f25318e = i2;
    }

    /* renamed from: a */
    public void mo23399a(int i, E e) {
        int i2 = this.f25318e;
        if (i2 == 0 || i > this.f25316c[i2 - 1]) {
            if (this.f25315b && i2 >= this.f25316c.length) {
                m26792d();
            }
            int i3 = this.f25318e;
            if (i3 >= this.f25316c.length) {
                int e2 = C6081c.m26735e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.f25316c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f25317d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f25316c = iArr;
                this.f25317d = objArr;
            }
            this.f25316c[i3] = i;
            this.f25317d[i3] = e;
            this.f25318e = i3 + 1;
            return;
        }
        mo23407l(i, e);
    }

    /* renamed from: b */
    public void mo23400b() {
        int i = this.f25318e;
        Object[] objArr = this.f25317d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f25318e = 0;
        this.f25315b = false;
    }

    /* renamed from: c */
    public C6091h<E> clone() {
        try {
            C6091h<E> hVar = (C6091h) super.clone();
            hVar.f25316c = (int[]) this.f25316c.clone();
            hVar.f25317d = (Object[]) this.f25317d.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: g */
    public E mo23403g(int i) {
        return mo23404h(i, (Object) null);
    }

    /* renamed from: h */
    public E mo23404h(int i, E e) {
        int a = C6081c.m26731a(this.f25316c, this.f25318e, i);
        if (a >= 0) {
            E[] eArr = this.f25317d;
            if (eArr[a] != f25314f) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: i */
    public int mo23405i(E e) {
        if (this.f25315b) {
            m26792d();
        }
        for (int i = 0; i < this.f25318e; i++) {
            if (this.f25317d[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public int mo23406k(int i) {
        if (this.f25315b) {
            m26792d();
        }
        return this.f25316c[i];
    }

    /* renamed from: l */
    public void mo23407l(int i, E e) {
        int a = C6081c.m26731a(this.f25316c, this.f25318e, i);
        if (a >= 0) {
            this.f25317d[a] = e;
            return;
        }
        int i2 = a ^ -1;
        int i3 = this.f25318e;
        if (i2 < i3) {
            Object[] objArr = this.f25317d;
            if (objArr[i2] == f25314f) {
                this.f25316c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f25315b && i3 >= this.f25316c.length) {
            m26792d();
            i2 = C6081c.m26731a(this.f25316c, this.f25318e, i) ^ -1;
        }
        int i4 = this.f25318e;
        if (i4 >= this.f25316c.length) {
            int e2 = C6081c.m26735e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.f25316c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f25317d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f25316c = iArr;
            this.f25317d = objArr2;
        }
        int i5 = this.f25318e;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f25316c;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f25317d;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f25318e - i2);
        }
        this.f25316c[i2] = i;
        this.f25317d[i2] = e;
        this.f25318e++;
    }

    /* renamed from: m */
    public int mo23408m() {
        if (this.f25315b) {
            m26792d();
        }
        return this.f25318e;
    }

    /* renamed from: n */
    public E mo23409n(int i) {
        if (this.f25315b) {
            m26792d();
        }
        return this.f25317d[i];
    }

    public String toString() {
        if (mo23408m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f25318e * 28);
        sb.append('{');
        for (int i = 0; i < this.f25318e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo23406k(i));
            sb.append('=');
            Object n = mo23409n(i);
            if (n != this) {
                sb.append(n);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C6091h(int i) {
        this.f25315b = false;
        if (i == 0) {
            this.f25316c = C6081c.f25276a;
            this.f25317d = C6081c.f25278c;
            return;
        }
        int e = C6081c.m26735e(i);
        this.f25316c = new int[e];
        this.f25317d = new Object[e];
    }
}
