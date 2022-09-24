package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aul */
/* compiled from: IMASDK */
public abstract class aul<E> extends att<E> implements Set<E> {

    /* renamed from: a */
    private transient atz<E> f15765a;

    aul() {
    }

    /* renamed from: h */
    public static <E> aul<E> m14860h(E e) {
        return new avs(e);
    }

    /* renamed from: i */
    static int m14861i(int i) {
        double d;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
                d = (double) highestOneBit;
                Double.isNaN(d);
            } while (d * 0.7d < ((double) max));
            return highestOneBit;
        }
        ars.m14622b(max < 1073741824, "collection too large");
        return 1073741824;
    }

    /* renamed from: j */
    public static <E> aul<E> m14862j(Collection<? extends E> collection) {
        if ((collection instanceof aul) && !(collection instanceof SortedSet)) {
            aul<E> aul = (aul) collection;
            if (!aul.mo14504f()) {
                return aul;
            }
        }
        Object[] array = collection.toArray();
        return m14864n(array.length, array);
    }

    /* renamed from: k */
    public static <E> aul<E> m14863k(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return avm.f15803a;
        }
        if (length != 1) {
            return m14864n(length, (Object[]) eArr.clone());
        }
        return m14860h(eArr[0]);
    }

    /* renamed from: n */
    private static <E> aul<E> m14864n(int i, Object... objArr) {
        if (i == 0) {
            return avm.f15803a;
        }
        if (i == 1) {
            return m14860h(objArr[0]);
        }
        int i2 = m14861i(i);
        Object[] objArr2 = new Object[i2];
        int i3 = i2 - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[i6];
            avr.m14966h(obj, i6);
            int hashCode = obj.hashCode();
            int c = aup.m14872c(hashCode);
            while (true) {
                int i7 = c & i3;
                Object obj2 = objArr2[i7];
                if (obj2 == null) {
                    objArr[i5] = obj;
                    objArr2[i7] = obj;
                    i4 += hashCode;
                    i5++;
                    break;
                } else if (obj2.equals(obj)) {
                    break;
                } else {
                    c++;
                }
            }
        }
        Arrays.fill(objArr, i5, i, (Object) null);
        if (i5 == 1) {
            return new avs(objArr[0], i4);
        }
        if (m14861i(i5) < i2 / 2) {
            return m14864n(i5, objArr);
        }
        int length = objArr.length;
        if (i5 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new avm(objArr, i4, objArr2, i3, i5);
    }

    /* renamed from: a */
    public abstract avu<E> iterator();

    /* renamed from: e */
    public atz<E> mo14503e() {
        atz<E> atz = this.f15765a;
        if (atz != null) {
            return atz;
        }
        atz<E> m = mo14573m();
        this.f15765a = m;
        return m;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof aul) && mo14572l() && ((aul) obj).mo14572l() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() != set.size() || !containsAll(set)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return avr.m14961c(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo14572l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public atz<E> mo14573m() {
        return atz.m14813o(toArray());
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new auk(toArray());
    }
}
