package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atr */
/* compiled from: IMASDK */
public final class atr<K, V> extends AbstractMap<K, V> implements Serializable, ass {

    /* renamed from: a */
    transient K[] f15718a;

    /* renamed from: b */
    transient V[] f15719b;

    /* renamed from: c */
    transient int f15720c;

    /* renamed from: d */
    transient int f15721d;

    /* renamed from: e */
    private transient int[] f15722e;

    /* renamed from: f */
    private transient int[] f15723f;

    /* renamed from: g */
    private transient int[] f15724g;

    /* renamed from: h */
    private transient int[] f15725h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public transient int f15726i;

    /* renamed from: j */
    private transient int f15727j;

    /* renamed from: k */
    private transient int[] f15728k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public transient int[] f15729l;

    /* renamed from: m */
    private transient Set<K> f15730m;

    /* renamed from: n */
    private transient Set<V> f15731n;

    /* renamed from: o */
    private transient Set<Map.Entry<K, V>> f15732o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public transient ass<V, K> f15733p;

    private atr() {
        mo14473a(2);
    }

    /* renamed from: A */
    private final void m14760A(int i, int i2, int i3) {
        int i4;
        int i5;
        ars.m14621a(i != -1);
        m14776y(i, i2);
        m14777z(i, i3);
        m14773v(this.f15728k[i], this.f15729l[i]);
        int i6 = this.f15720c - 1;
        if (i6 != i) {
            int i7 = this.f15728k[i6];
            int i8 = this.f15729l[i6];
            m14773v(i7, i);
            m14773v(i, i8);
            K[] kArr = this.f15718a;
            K k = kArr[i6];
            V[] vArr = this.f15719b;
            V v = vArr[i6];
            kArr[i] = k;
            vArr[i] = v;
            int u = m14772u(aup.m14873d(k));
            int[] iArr = this.f15722e;
            int i9 = iArr[u];
            if (i9 == i6) {
                iArr[u] = i;
            } else {
                int i10 = this.f15724g[i9];
                while (true) {
                    int i11 = i9;
                    i9 = i10;
                    i5 = i11;
                    if (i9 == i6) {
                        break;
                    }
                    i10 = this.f15724g[i9];
                }
                this.f15724g[i5] = i;
            }
            int[] iArr2 = this.f15724g;
            iArr2[i] = iArr2[i6];
            iArr2[i6] = -1;
            int u2 = m14772u(aup.m14873d(v));
            int[] iArr3 = this.f15723f;
            int i12 = iArr3[u2];
            if (i12 == i6) {
                iArr3[u2] = i;
            } else {
                int i13 = this.f15725h[i12];
                while (true) {
                    int i14 = i12;
                    i12 = i13;
                    i4 = i14;
                    if (i12 == i6) {
                        break;
                    }
                    i13 = this.f15725h[i12];
                }
                this.f15725h[i4] = i;
            }
            int[] iArr4 = this.f15725h;
            iArr4[i] = iArr4[i6];
            iArr4[i6] = -1;
        }
        K[] kArr2 = this.f15718a;
        int i15 = this.f15720c - 1;
        kArr2[i15] = null;
        this.f15719b[i15] = null;
        this.f15720c = i15;
        this.f15721d++;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m14761B(int i, K k) {
        ars.m14621a(i != -1);
        int c = mo14475c(k, aup.m14873d(k));
        int i2 = this.f15727j;
        if (c == -1) {
            if (i2 == i) {
                i2 = this.f15728k[i];
            } else if (i2 == this.f15720c) {
                i2 = c;
            }
            if (i == -2) {
                c = this.f15729l[-2];
            } else if (this.f15720c != -2) {
                c = -2;
            }
            m14773v(this.f15728k[i], this.f15729l[i]);
            m14776y(i, aup.m14873d(this.f15718a[i]));
            this.f15718a[i] = k;
            m14774w(i, aup.m14873d(k));
            m14773v(i2, i);
            m14773v(i, c);
            return;
        }
        String valueOf = String.valueOf(k);
        StringBuilder sb = new StringBuilder(valueOf.length() + 28);
        sb.append("Key already present in map: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m14762C(int i, V v) {
        ars.m14621a(i != -1);
        int d = aup.m14873d(v);
        if (mo14480e(v, d) == -1) {
            m14777z(i, aup.m14873d(this.f15719b[i]));
            this.f15719b[i] = v;
            m14775x(i, d);
            return;
        }
        String valueOf = String.valueOf(v);
        StringBuilder sb = new StringBuilder(valueOf.length() + 30);
        sb.append("Value already present in map: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: p */
    public static <K, V> atr<K, V> m14768p() {
        return new atr<>();
    }

    /* renamed from: r */
    private static int[] m14769r(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        mo14473a(16);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* renamed from: s */
    private static int[] m14770s(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    /* renamed from: t */
    private final void m14771t(int i) {
        int length = this.f15724g.length;
        if (length < i) {
            int a = ats.m14789a(length, i);
            this.f15718a = Arrays.copyOf(this.f15718a, a);
            this.f15719b = Arrays.copyOf(this.f15719b, a);
            this.f15724g = m14770s(this.f15724g, a);
            this.f15725h = m14770s(this.f15725h, a);
            this.f15728k = m14770s(this.f15728k, a);
            this.f15729l = m14770s(this.f15729l, a);
        }
        if (this.f15722e.length < i) {
            int e = aup.m14874e(i);
            this.f15722e = m14769r(e);
            this.f15723f = m14769r(e);
            for (int i2 = 0; i2 < this.f15720c; i2++) {
                int u = m14772u(aup.m14873d(this.f15718a[i2]));
                int[] iArr = this.f15724g;
                int[] iArr2 = this.f15722e;
                iArr[i2] = iArr2[u];
                iArr2[u] = i2;
                int u2 = m14772u(aup.m14873d(this.f15719b[i2]));
                int[] iArr3 = this.f15725h;
                int[] iArr4 = this.f15723f;
                iArr3[i2] = iArr4[u2];
                iArr4[u2] = i2;
            }
        }
    }

    /* renamed from: u */
    private final int m14772u(int i) {
        return i & (this.f15722e.length - 1);
    }

    /* renamed from: v */
    private final void m14773v(int i, int i2) {
        if (i == -2) {
            this.f15726i = i2;
        } else {
            this.f15729l[i] = i2;
        }
        if (i2 == -2) {
            this.f15727j = i;
        } else {
            this.f15728k[i2] = i;
        }
    }

    /* renamed from: w */
    private final void m14774w(int i, int i2) {
        ars.m14621a(i != -1);
        int u = m14772u(i2);
        int[] iArr = this.f15724g;
        int[] iArr2 = this.f15722e;
        iArr[i] = iArr2[u];
        iArr2[u] = i;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f15720c);
        for (Map.Entry entry : entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* renamed from: x */
    private final void m14775x(int i, int i2) {
        ars.m14621a(i != -1);
        int u = m14772u(i2);
        int[] iArr = this.f15725h;
        int[] iArr2 = this.f15723f;
        iArr[i] = iArr2[u];
        iArr2[u] = i;
    }

    /* renamed from: y */
    private final void m14776y(int i, int i2) {
        ars.m14621a(i != -1);
        int u = m14772u(i2);
        int[] iArr = this.f15722e;
        int i3 = iArr[u];
        if (i3 == i) {
            int[] iArr2 = this.f15724g;
            iArr[u] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.f15724g[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            int i6 = i5;
            if (i3 == -1) {
                String valueOf = String.valueOf(this.f15718a[i]);
                StringBuilder sb = new StringBuilder(valueOf.length() + 32);
                sb.append("Expected to find entry with key ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            } else if (i3 == i) {
                int[] iArr3 = this.f15724g;
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                i4 = this.f15724g[i3];
            }
        }
    }

    /* renamed from: z */
    private final void m14777z(int i, int i2) {
        ars.m14621a(i != -1);
        int u = m14772u(i2);
        int[] iArr = this.f15723f;
        int i3 = iArr[u];
        if (i3 == i) {
            int[] iArr2 = this.f15725h;
            iArr[u] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.f15725h[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            int i6 = i5;
            if (i3 == -1) {
                String valueOf = String.valueOf(this.f15719b[i]);
                StringBuilder sb = new StringBuilder(valueOf.length() + 34);
                sb.append("Expected to find entry with value ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            } else if (i3 == i) {
                int[] iArr3 = this.f15725h;
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                i4 = this.f15725h[i3];
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14473a(int i) {
        aup.m14884o(i, "expectedSize");
        int e = aup.m14874e(i);
        this.f15720c = 0;
        this.f15718a = new Object[i];
        this.f15719b = new Object[i];
        this.f15722e = m14769r(e);
        this.f15723f = m14769r(e);
        this.f15724g = m14769r(i);
        this.f15725h = m14769r(i);
        this.f15726i = -2;
        this.f15727j = -2;
        this.f15728k = m14769r(i);
        this.f15729l = m14769r(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo14474b(Object obj) {
        return mo14475c(obj, aup.m14873d(obj));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo14475c(Object obj, int i) {
        return mo14482f(obj, i, this.f15722e, this.f15724g, this.f15718a);
    }

    public final void clear() {
        Arrays.fill(this.f15718a, 0, this.f15720c, (Object) null);
        Arrays.fill(this.f15719b, 0, this.f15720c, (Object) null);
        Arrays.fill(this.f15722e, -1);
        Arrays.fill(this.f15723f, -1);
        Arrays.fill(this.f15724g, 0, this.f15720c, -1);
        Arrays.fill(this.f15725h, 0, this.f15720c, -1);
        Arrays.fill(this.f15728k, 0, this.f15720c, -1);
        Arrays.fill(this.f15729l, 0, this.f15720c, -1);
        this.f15720c = 0;
        this.f15726i = -2;
        this.f15727j = -2;
        this.f15721d++;
    }

    public final boolean containsKey(Object obj) {
        return mo14474b(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        return mo14479d(obj) != -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo14479d(Object obj) {
        return mo14480e(obj, aup.m14873d(obj));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo14480e(Object obj, int i) {
        return mo14482f(obj, i, this.f15723f, this.f15725h, this.f15719b);
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f15732o;
        if (set != null) {
            return set;
        }
        atk atk = new atk(this);
        this.f15732o = atk;
        return atk;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo14482f(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[m14772u(i)];
        while (i2 != -1) {
            if (arq.m14618b(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo14483g(int i, int i2) {
        m14760A(i, i2, aup.m14873d(this.f15719b[i]));
    }

    public final V get(Object obj) {
        int b = mo14474b(obj);
        if (b == -1) {
            return null;
        }
        return this.f15719b[b];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo14485h(int i, int i2) {
        m14760A(i, aup.m14873d(this.f15718a[i]), i2);
    }

    /* renamed from: i */
    public final Set<V> values() {
        Set<V> set = this.f15731n;
        if (set != null) {
            return set;
        }
        ato ato = new ato(this);
        this.f15731n = ato;
        return ato;
    }

    /* renamed from: j */
    public final ass<V, K> mo14487j() {
        ass<V, K> ass = this.f15733p;
        if (ass != null) {
            return ass;
        }
        atl atl = new atl(this);
        this.f15733p = atl;
        return atl;
    }

    public final Set<K> keySet() {
        Set<K> set = this.f15730m;
        if (set != null) {
            return set;
        }
        atn atn = new atn(this);
        this.f15730m = atn;
        return atn;
    }

    public final V put(K k, V v) {
        int d = aup.m14873d(k);
        int c = mo14475c(k, d);
        if (c != -1) {
            V v2 = this.f15719b[c];
            if (arq.m14618b(v2, v)) {
                return v;
            }
            m14762C(c, v);
            return v2;
        }
        int d2 = aup.m14873d(v);
        ars.m14623c(mo14480e(v, d2) == -1, "Value already present: %s", v);
        m14771t(this.f15720c + 1);
        K[] kArr = this.f15718a;
        int i = this.f15720c;
        kArr[i] = k;
        this.f15719b[i] = v;
        m14774w(i, d);
        m14775x(this.f15720c, d2);
        m14773v(this.f15727j, this.f15720c);
        m14773v(this.f15720c, -2);
        this.f15720c++;
        this.f15721d++;
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final K mo14490q(V v, K k) {
        int i;
        int d = aup.m14873d(v);
        int e = mo14480e(v, d);
        if (e != -1) {
            K k2 = this.f15718a[e];
            if (arq.m14618b(k2, k)) {
                return k;
            }
            m14761B(e, k);
            return k2;
        }
        int i2 = this.f15727j;
        int d2 = aup.m14873d(k);
        ars.m14623c(mo14475c(k, d2) == -1, "Key already present: %s", k);
        m14771t(this.f15720c + 1);
        K[] kArr = this.f15718a;
        int i3 = this.f15720c;
        kArr[i3] = k;
        this.f15719b[i3] = v;
        m14774w(i3, d2);
        m14775x(this.f15720c, d);
        if (i2 == -2) {
            i = this.f15726i;
        } else {
            i = this.f15729l[i2];
        }
        m14773v(i2, this.f15720c);
        m14773v(this.f15720c, i);
        this.f15720c++;
        this.f15721d++;
        return null;
    }

    public final V remove(Object obj) {
        int d = aup.m14873d(obj);
        int c = mo14475c(obj, d);
        if (c == -1) {
            return null;
        }
        V v = this.f15719b[c];
        mo14483g(c, d);
        return v;
    }

    public final int size() {
        return this.f15720c;
    }
}
