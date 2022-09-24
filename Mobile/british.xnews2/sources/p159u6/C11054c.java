package p159u6;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p148s6.C6073k;

/* renamed from: u6.c */
/* compiled from: Ints */
public final class C11054c {

    /* renamed from: u6.c$a */
    /* compiled from: Ints */
    private static class C6208a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: b */
        final int[] f25568b;

        /* renamed from: c */
        final int f25569c;

        /* renamed from: d */
        final int f25570d;

        C6208a(int[] iArr, int i, int i2) {
            this.f25568b = iArr;
            this.f25569c = i;
            this.f25570d = i2;
        }

        /* renamed from: a */
        public Integer get(int i) {
            C6073k.m26686i(i, size());
            return Integer.valueOf(this.f25568b[this.f25569c + i]);
        }

        /* renamed from: b */
        public Integer set(int i, Integer num) {
            C6073k.m26686i(i, size());
            int[] iArr = this.f25568b;
            int i2 = this.f25569c;
            int i3 = iArr[i2 + i];
            iArr[i2 + i] = ((Integer) C6073k.m26688k(num)).intValue();
            return Integer.valueOf(i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int[] mo23638c() {
            return Arrays.copyOfRange(this.f25568b, this.f25569c, this.f25570d);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Integer) && C11054c.m49463g(this.f25568b, ((Integer) obj).intValue(), this.f25569c, this.f25570d) != -1;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6208a)) {
                return super.equals(obj);
            }
            C6208a aVar = (C6208a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f25568b[this.f25569c + i] != aVar.f25568b[aVar.f25569c + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.f25569c; i2 < this.f25570d; i2++) {
                i = (i * 31) + C11054c.m49461e(this.f25568b[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            int a;
            if (!(obj instanceof Integer) || (a = C11054c.m49463g(this.f25568b, ((Integer) obj).intValue(), this.f25569c, this.f25570d)) < 0) {
                return -1;
            }
            return a - this.f25569c;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b;
            if (!(obj instanceof Integer) || (b = C11054c.m49464h(this.f25568b, ((Integer) obj).intValue(), this.f25569c, this.f25570d)) < 0) {
                return -1;
            }
            return b - this.f25569c;
        }

        public int size() {
            return this.f25570d - this.f25569c;
        }

        public List<Integer> subList(int i, int i2) {
            C6073k.m26692o(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.f25568b;
            int i3 = this.f25569c;
            return new C6208a(iArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f25568b[this.f25569c]);
            int i = this.f25569c;
            while (true) {
                i++;
                if (i < this.f25570d) {
                    sb.append(", ");
                    sb.append(this.f25568b[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    /* renamed from: c */
    public static int m49459c(long j) {
        int i = (int) j;
        C6073k.m26683f(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    /* renamed from: d */
    public static int m49460d(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: e */
    public static int m49461e(int i) {
        return i;
    }

    /* renamed from: f */
    public static int m49462f(int[] iArr, int i) {
        return m49463g(iArr, i, 0, iArr.length);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static int m49463g(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static int m49464h(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: i */
    public static int[] m49465i(Collection<? extends Number> collection) {
        if (collection instanceof C6208a) {
            return ((C6208a) collection).mo23638c();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) C6073k.m26688k(array[i])).intValue();
        }
        return iArr;
    }
}
