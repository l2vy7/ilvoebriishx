package p149t;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: t.g */
/* compiled from: SimpleArrayMap */
public class C6090g<K, V> {

    /* renamed from: e */
    static Object[] f25307e;

    /* renamed from: f */
    static int f25308f;

    /* renamed from: g */
    static Object[] f25309g;

    /* renamed from: h */
    static int f25310h;

    /* renamed from: b */
    int[] f25311b;

    /* renamed from: c */
    Object[] f25312c;

    /* renamed from: d */
    int f25313d;

    public C6090g() {
        this.f25311b = C6081c.f25276a;
        this.f25312c = C6081c.f25278c;
        this.f25313d = 0;
    }

    /* renamed from: b */
    private void m26779b(int i) {
        Class<C6090g> cls = C6090g.class;
        if (i == 8) {
            synchronized (cls) {
                Object[] objArr = f25309g;
                if (objArr != null) {
                    this.f25312c = objArr;
                    f25309g = (Object[]) objArr[0];
                    this.f25311b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f25310h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                Object[] objArr2 = f25307e;
                if (objArr2 != null) {
                    this.f25312c = objArr2;
                    f25307e = (Object[]) objArr2[0];
                    this.f25311b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f25308f--;
                    return;
                }
            }
        }
        this.f25311b = new int[i];
        this.f25312c = new Object[(i << 1)];
    }

    /* renamed from: c */
    private static int m26780c(int[] iArr, int i, int i2) {
        try {
            return C6081c.m26731a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    private static void m26781e(int[] iArr, Object[] objArr, int i) {
        Class<C6090g> cls = C6090g.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f25310h < 10) {
                    objArr[0] = f25309g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f25309g = objArr;
                    f25310h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f25308f < 10) {
                    objArr[0] = f25307e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f25307e = objArr;
                    f25308f++;
                }
            }
        }
    }

    public void clear() {
        int i = this.f25313d;
        if (i > 0) {
            int[] iArr = this.f25311b;
            Object[] objArr = this.f25312c;
            this.f25311b = C6081c.f25276a;
            this.f25312c = C6081c.f25278c;
            this.f25313d = 0;
            m26781e(iArr, objArr, i);
        }
        if (this.f25313d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo23384g(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo23388i(obj) >= 0;
    }

    /* renamed from: d */
    public void mo23381d(int i) {
        int i2 = this.f25313d;
        int[] iArr = this.f25311b;
        if (iArr.length < i) {
            Object[] objArr = this.f25312c;
            m26779b(i);
            if (this.f25313d > 0) {
                System.arraycopy(iArr, 0, this.f25311b, 0, i2);
                System.arraycopy(objArr, 0, this.f25312c, 0, i2 << 1);
            }
            m26781e(iArr, objArr, i2);
        }
        if (this.f25313d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6090g) {
            C6090g gVar = (C6090g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f25313d) {
                try {
                    Object j = mo23390j(i);
                    Object o = mo23391o(i);
                    Object obj2 = gVar.get(j);
                    if (o == null) {
                        if (obj2 != null || !gVar.containsKey(j)) {
                            return false;
                        }
                    } else if (!o.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f25313d) {
                try {
                    Object j2 = mo23390j(i2);
                    Object o2 = mo23391o(i2);
                    Object obj3 = map.get(j2);
                    if (o2 == null) {
                        if (obj3 != null || !map.containsKey(j2)) {
                            return false;
                        }
                    } else if (!o2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo23383f(Object obj, int i) {
        int i2 = this.f25313d;
        if (i2 == 0) {
            return -1;
        }
        int c = m26780c(this.f25311b, i2, i);
        if (c < 0 || obj.equals(this.f25312c[c << 1])) {
            return c;
        }
        int i3 = c + 1;
        while (i3 < i2 && this.f25311b[i3] == i) {
            if (obj.equals(this.f25312c[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = c - 1;
        while (i4 >= 0 && this.f25311b[i4] == i) {
            if (obj.equals(this.f25312c[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: g */
    public int mo23384g(Object obj) {
        return obj == null ? mo23387h() : mo23383f(obj, obj.hashCode());
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int g = mo23384g(obj);
        return g >= 0 ? this.f25312c[(g << 1) + 1] : v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo23387h() {
        int i = this.f25313d;
        if (i == 0) {
            return -1;
        }
        int c = m26780c(this.f25311b, i, 0);
        if (c < 0 || this.f25312c[c << 1] == null) {
            return c;
        }
        int i2 = c + 1;
        while (i2 < i && this.f25311b[i2] == 0) {
            if (this.f25312c[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = c - 1;
        while (i3 >= 0 && this.f25311b[i3] == 0) {
            if (this.f25312c[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public int hashCode() {
        int[] iArr = this.f25311b;
        Object[] objArr = this.f25312c;
        int i = this.f25313d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo23388i(Object obj) {
        int i = this.f25313d * 2;
        Object[] objArr = this.f25312c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f25313d <= 0;
    }

    /* renamed from: j */
    public K mo23390j(int i) {
        return this.f25312c[i << 1];
    }

    /* renamed from: l */
    public void mo158l(C6090g<? extends K, ? extends V> gVar) {
        int i = gVar.f25313d;
        mo23381d(this.f25313d + i);
        if (this.f25313d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gVar.mo23390j(i2), gVar.mo23391o(i2));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f25311b, 0, this.f25311b, 0, i);
            System.arraycopy(gVar.f25312c, 0, this.f25312c, 0, i << 1);
            this.f25313d = i;
        }
    }

    /* renamed from: m */
    public V mo159m(int i) {
        V[] vArr = this.f25312c;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f25313d;
        int i4 = 0;
        if (i3 <= 1) {
            m26781e(this.f25311b, vArr, i3);
            this.f25311b = C6081c.f25276a;
            this.f25312c = C6081c.f25278c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f25311b;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr = this.f25312c;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f25312c;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m26779b(i6);
                if (i3 == this.f25313d) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f25311b, 0, i);
                        System.arraycopy(vArr, 0, this.f25312c, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f25311b, i, i11);
                        System.arraycopy(vArr, i10 << 1, this.f25312c, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f25313d) {
            this.f25313d = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: n */
    public V mo160n(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f25312c;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: o */
    public V mo23391o(int i) {
        return this.f25312c[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f25313d;
        if (k == null) {
            i2 = mo23387h();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo23383f(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f25312c;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        int[] iArr = this.f25311b;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f25312c;
            m26779b(i6);
            if (i3 == this.f25313d) {
                int[] iArr2 = this.f25311b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f25312c, 0, objArr.length);
                }
                m26781e(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f25311b;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f25312c;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f25313d - i5) << 1);
        }
        int i8 = this.f25313d;
        if (i3 == i8) {
            int[] iArr4 = this.f25311b;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f25312c;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f25313d = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int g = mo23384g(obj);
        if (g >= 0) {
            return mo159m(g);
        }
        return null;
    }

    public V replace(K k, V v) {
        int g = mo23384g(k);
        if (g >= 0) {
            return mo160n(g, v);
        }
        return null;
    }

    public int size() {
        return this.f25313d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f25313d * 28);
        sb.append('{');
        for (int i = 0; i < this.f25313d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object j = mo23390j(i);
            if (j != this) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object o = mo23391o(i);
            if (o != this) {
                sb.append(o);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int g = mo23384g(obj);
        if (g < 0) {
            return false;
        }
        Object o = mo23391o(g);
        if (obj2 != o && (obj2 == null || !obj2.equals(o))) {
            return false;
        }
        mo159m(g);
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        int g = mo23384g(k);
        if (g < 0) {
            return false;
        }
        V o = mo23391o(g);
        if (o != v && (v == null || !v.equals(o))) {
            return false;
        }
        mo160n(g, v2);
        return true;
    }

    public C6090g(int i) {
        if (i == 0) {
            this.f25311b = C6081c.f25276a;
            this.f25312c = C6081c.f25278c;
        } else {
            m26779b(i);
        }
        this.f25313d = 0;
    }

    public C6090g(C6090g<K, V> gVar) {
        this();
        if (gVar != null) {
            mo158l(gVar);
        }
    }
}
