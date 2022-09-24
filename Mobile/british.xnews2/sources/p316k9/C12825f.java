package p316k9;

/* renamed from: k9.f */
/* compiled from: LangUtils */
public final class C12825f {
    /* renamed from: a */
    public static boolean m54377a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public static boolean m54378b(Object[] objArr, Object[] objArr2) {
        if (objArr == null) {
            return objArr2 == null;
        }
        if (objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < objArr.length; i++) {
            if (!m54377a(objArr[i], objArr2[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static int m54379c(int i, int i2) {
        return (i * 37) + i2;
    }

    /* renamed from: d */
    public static int m54380d(int i, Object obj) {
        return m54379c(i, obj != null ? obj.hashCode() : 0);
    }

    /* renamed from: e */
    public static int m54381e(int i, boolean z) {
        return m54379c(i, z ? 1 : 0);
    }
}
