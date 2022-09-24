package p149t;

/* renamed from: t.d */
/* compiled from: LongSparseArray */
public class C6082d<E> implements Cloneable {

    /* renamed from: f */
    private static final Object f25279f = new Object();

    /* renamed from: b */
    private boolean f25280b;

    /* renamed from: c */
    private long[] f25281c;

    /* renamed from: d */
    private Object[] f25282d;

    /* renamed from: e */
    private int f25283e;

    public C6082d() {
        this(10);
    }

    /* renamed from: d */
    private void m26737d() {
        int i = this.f25283e;
        long[] jArr = this.f25281c;
        Object[] objArr = this.f25282d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f25279f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f25280b = false;
        this.f25283e = i2;
    }

    /* renamed from: a */
    public void mo23294a(long j, E e) {
        int i = this.f25283e;
        if (i == 0 || j > this.f25281c[i - 1]) {
            if (this.f25280b && i >= this.f25281c.length) {
                m26737d();
            }
            int i2 = this.f25283e;
            if (i2 >= this.f25281c.length) {
                int f = C6081c.m26736f(i2 + 1);
                long[] jArr = new long[f];
                Object[] objArr = new Object[f];
                long[] jArr2 = this.f25281c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f25282d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f25281c = jArr;
                this.f25282d = objArr;
            }
            this.f25281c[i2] = j;
            this.f25282d[i2] = e;
            this.f25283e = i2 + 1;
            return;
        }
        mo23302l(j, e);
    }

    /* renamed from: b */
    public void mo23295b() {
        int i = this.f25283e;
        Object[] objArr = this.f25282d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f25283e = 0;
        this.f25280b = false;
    }

    /* renamed from: c */
    public C6082d<E> clone() {
        try {
            C6082d<E> dVar = (C6082d) super.clone();
            dVar.f25281c = (long[]) this.f25281c.clone();
            dVar.f25282d = (Object[]) this.f25282d.clone();
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: g */
    public E mo23298g(long j) {
        return mo23299h(j, (Object) null);
    }

    /* renamed from: h */
    public E mo23299h(long j, E e) {
        int b = C6081c.m26732b(this.f25281c, this.f25283e, j);
        if (b >= 0) {
            E[] eArr = this.f25282d;
            if (eArr[b] != f25279f) {
                return eArr[b];
            }
        }
        return e;
    }

    /* renamed from: i */
    public int mo23300i(long j) {
        if (this.f25280b) {
            m26737d();
        }
        return C6081c.m26732b(this.f25281c, this.f25283e, j);
    }

    /* renamed from: k */
    public long mo23301k(int i) {
        if (this.f25280b) {
            m26737d();
        }
        return this.f25281c[i];
    }

    /* renamed from: l */
    public void mo23302l(long j, E e) {
        int b = C6081c.m26732b(this.f25281c, this.f25283e, j);
        if (b >= 0) {
            this.f25282d[b] = e;
            return;
        }
        int i = b ^ -1;
        int i2 = this.f25283e;
        if (i < i2) {
            Object[] objArr = this.f25282d;
            if (objArr[i] == f25279f) {
                this.f25281c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f25280b && i2 >= this.f25281c.length) {
            m26737d();
            i = C6081c.m26732b(this.f25281c, this.f25283e, j) ^ -1;
        }
        int i3 = this.f25283e;
        if (i3 >= this.f25281c.length) {
            int f = C6081c.m26736f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.f25281c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f25282d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f25281c = jArr;
            this.f25282d = objArr2;
        }
        int i4 = this.f25283e;
        if (i4 - i != 0) {
            long[] jArr3 = this.f25281c;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f25282d;
            System.arraycopy(objArr4, i, objArr4, i5, this.f25283e - i);
        }
        this.f25281c[i] = j;
        this.f25282d[i] = e;
        this.f25283e++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f25282d;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23303m(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f25281c
            int r1 = r2.f25283e
            int r3 = p149t.C6081c.m26732b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f25282d
            r0 = r4[r3]
            java.lang.Object r1 = f25279f
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f25280b = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p149t.C6082d.mo23303m(long):void");
    }

    /* renamed from: n */
    public void mo23304n(int i) {
        Object[] objArr = this.f25282d;
        Object obj = objArr[i];
        Object obj2 = f25279f;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f25280b = true;
        }
    }

    /* renamed from: o */
    public int mo23305o() {
        if (this.f25280b) {
            m26737d();
        }
        return this.f25283e;
    }

    /* renamed from: p */
    public E mo23306p(int i) {
        if (this.f25280b) {
            m26737d();
        }
        return this.f25282d[i];
    }

    public String toString() {
        if (mo23305o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f25283e * 28);
        sb.append('{');
        for (int i = 0; i < this.f25283e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo23301k(i));
            sb.append('=');
            Object p = mo23306p(i);
            if (p != this) {
                sb.append(p);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C6082d(int i) {
        this.f25280b = false;
        if (i == 0) {
            this.f25281c = C6081c.f25277b;
            this.f25282d = C6081c.f25278c;
            return;
        }
        int f = C6081c.m26736f(i);
        this.f25281c = new long[f];
        this.f25282d = new Object[f];
    }
}
