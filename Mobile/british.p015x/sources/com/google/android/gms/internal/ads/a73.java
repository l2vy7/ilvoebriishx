package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class a73<E> extends k63<E> implements Set<E> {
    @CheckForNull

    /* renamed from: c */
    private transient p63<E> f20110c;

    a73() {
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static <E> a73<E> m20179D(int i, Object... objArr) {
        if (i == 0) {
            return k83.f20475j;
        }
        if (i != 1) {
            int r = m20181r(i);
            Object[] objArr2 = new Object[r];
            int i2 = r - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                c83.m20255a(obj, i5);
                int hashCode = obj.hashCode();
                int a = h63.m20518a(hashCode);
                while (true) {
                    int i6 = a & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 == null) {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        a++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new p83(obj3);
            } else if (m20181r(i4) < r / 2) {
                return m20179D(i4, objArr);
            } else {
                if (m20180E(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new k83(objArr, i3, objArr2, i2, i4);
            }
        } else {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new p83(obj4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static boolean m20180E(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* renamed from: r */
    static int m20181r(int i) {
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
        b43.m20208e(max < 1073741824, "collection too large");
        return 1073741824;
    }

    /* renamed from: u */
    public static <E> z63<E> m20182u(int i) {
        return new z63<>(i);
    }

    /* renamed from: x */
    public static <E> a73<E> m20184x() {
        return k83.f20475j;
    }

    @SafeVarargs
    /* renamed from: y */
    public static <E> a73<E> m20185y(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        Object[] objArr = new Object[11];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, 5);
        return m20179D(11, objArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo18097A() {
        return false;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a73) && mo18097A() && ((a73) obj).mo18097A() && hashCode() != obj.hashCode()) {
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

    /* renamed from: f */
    public p63<E> mo18099f() {
        p63<E> p63 = this.f20110c;
        if (p63 != null) {
            return p63;
        }
        p63<E> t = mo18103t();
        this.f20110c = t;
        return t;
    }

    /* renamed from: g */
    public abstract s83<E> iterator();

    public int hashCode() {
        return o83.m35587a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public p63<E> mo18103t() {
        return p63.m20821u(toArray());
    }
}
