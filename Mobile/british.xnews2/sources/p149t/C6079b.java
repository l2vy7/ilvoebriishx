package p149t;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: t.b */
/* compiled from: ArraySet */
public final class C6079b<E> implements Collection<E>, Set<E> {

    /* renamed from: f */
    private static final int[] f25265f = new int[0];

    /* renamed from: g */
    private static final Object[] f25266g = new Object[0];

    /* renamed from: h */
    private static Object[] f25267h;

    /* renamed from: i */
    private static int f25268i;

    /* renamed from: j */
    private static Object[] f25269j;

    /* renamed from: k */
    private static int f25270k;

    /* renamed from: b */
    private int[] f25271b;

    /* renamed from: c */
    Object[] f25272c;

    /* renamed from: d */
    int f25273d;

    /* renamed from: e */
    private C6084f<E, E> f25274e;

    /* renamed from: t.b$a */
    /* compiled from: ArraySet */
    class C6080a extends C6084f<E, E> {
        C6080a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo23265a() {
            C6079b.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo23266b(int i, int i2) {
            return C6079b.this.f25272c[i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Map<E, E> mo23267c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public int mo23268d() {
            return C6079b.this.f25273d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo23269e(Object obj) {
            return C6079b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo23270f(Object obj) {
            return C6079b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo23271g(E e, E e2) {
            C6079b.this.add(e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo23272h(int i) {
            C6079b.this.mo23281h(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public E mo23273i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C6079b() {
        this(0);
    }

    /* renamed from: a */
    private void m26714a(int i) {
        if (i == 8) {
            synchronized (C6079b.class) {
                Object[] objArr = f25269j;
                if (objArr != null) {
                    this.f25272c = objArr;
                    f25269j = (Object[]) objArr[0];
                    this.f25271b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f25270k--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C6079b.class) {
                Object[] objArr2 = f25267h;
                if (objArr2 != null) {
                    this.f25272c = objArr2;
                    f25267h = (Object[]) objArr2[0];
                    this.f25271b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f25268i--;
                    return;
                }
            }
        }
        this.f25271b = new int[i];
        this.f25272c = new Object[i];
    }

    /* renamed from: c */
    private static void m26715c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C6079b.class) {
                if (f25270k < 10) {
                    objArr[0] = f25269j;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f25269j = objArr;
                    f25270k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C6079b.class) {
                if (f25268i < 10) {
                    objArr[0] = f25267h;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f25267h = objArr;
                    f25268i++;
                }
            }
        }
    }

    /* renamed from: e */
    private C6084f<E, E> m26716e() {
        if (this.f25274e == null) {
            this.f25274e = new C6080a();
        }
        return this.f25274e;
    }

    /* renamed from: f */
    private int m26717f(Object obj, int i) {
        int i2 = this.f25273d;
        if (i2 == 0) {
            return -1;
        }
        int a = C6081c.m26731a(this.f25271b, i2, i);
        if (a < 0 || obj.equals(this.f25272c[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f25271b[i3] == i) {
            if (obj.equals(this.f25272c[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f25271b[i4] == i) {
            if (obj.equals(this.f25272c[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: g */
    private int m26718g() {
        int i = this.f25273d;
        if (i == 0) {
            return -1;
        }
        int a = C6081c.m26731a(this.f25271b, i, 0);
        if (a < 0 || this.f25272c[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f25271b[i2] == 0) {
            if (this.f25272c[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f25271b[i3] == 0) {
            if (this.f25272c[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m26718g();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m26717f(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = i2 ^ -1;
        int i4 = this.f25273d;
        int[] iArr = this.f25271b;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f25272c;
            m26714a(i5);
            int[] iArr2 = this.f25271b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f25272c, 0, objArr.length);
            }
            m26715c(iArr, objArr, this.f25273d);
        }
        int i6 = this.f25273d;
        if (i3 < i6) {
            int[] iArr3 = this.f25271b;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f25272c;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f25273d - i3);
        }
        this.f25271b[i3] = i;
        this.f25272c[i3] = e;
        this.f25273d++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo23276b(this.f25273d + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: b */
    public void mo23276b(int i) {
        int[] iArr = this.f25271b;
        if (iArr.length < i) {
            Object[] objArr = this.f25272c;
            m26714a(i);
            int i2 = this.f25273d;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f25271b, 0, i2);
                System.arraycopy(objArr, 0, this.f25272c, 0, this.f25273d);
            }
            m26715c(iArr, objArr, this.f25273d);
        }
    }

    public void clear() {
        int i = this.f25273d;
        if (i != 0) {
            m26715c(this.f25271b, this.f25272c, i);
            this.f25271b = f25265f;
            this.f25272c = f25266g;
            this.f25273d = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f25273d) {
                try {
                    if (!set.contains(mo23283i(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public E mo23281h(int i) {
        E[] eArr = this.f25272c;
        E e = eArr[i];
        int i2 = this.f25273d;
        if (i2 <= 1) {
            m26715c(this.f25271b, eArr, i2);
            this.f25271b = f25265f;
            this.f25272c = f25266g;
            this.f25273d = 0;
        } else {
            int[] iArr = this.f25271b;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.f25273d = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr = this.f25272c;
                    System.arraycopy(objArr, i5, objArr, i, this.f25273d - i);
                }
                this.f25272c[this.f25273d] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                m26714a(i3);
                this.f25273d--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f25271b, 0, i);
                    System.arraycopy(eArr, 0, this.f25272c, 0, i);
                }
                int i6 = this.f25273d;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.f25271b, i, i6 - i);
                    System.arraycopy(eArr, i7, this.f25272c, i, this.f25273d - i);
                }
            }
        }
        return e;
    }

    public int hashCode() {
        int[] iArr = this.f25271b;
        int i = this.f25273d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    /* renamed from: i */
    public E mo23283i(int i) {
        return this.f25272c[i];
    }

    public int indexOf(Object obj) {
        return obj == null ? m26718g() : m26717f(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f25273d <= 0;
    }

    public Iterator<E> iterator() {
        return m26716e().mo23318m().iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo23281h(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f25273d - 1; i >= 0; i--) {
            if (!collection.contains(this.f25272c[i])) {
                mo23281h(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f25273d;
    }

    public Object[] toArray() {
        int i = this.f25273d;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f25272c, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f25273d * 14);
        sb.append('{');
        for (int i = 0; i < this.f25273d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object i2 = mo23283i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C6079b(int i) {
        if (i == 0) {
            this.f25271b = f25265f;
            this.f25272c = f25266g;
        } else {
            m26714a(i);
        }
        this.f25273d = 0;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f25273d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f25273d);
        }
        System.arraycopy(this.f25272c, 0, tArr, 0, this.f25273d);
        int length = tArr.length;
        int i = this.f25273d;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
