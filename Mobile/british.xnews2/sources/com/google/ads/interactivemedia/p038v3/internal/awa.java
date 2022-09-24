package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Collection;

/* renamed from: com.google.ads.interactivemedia.v3.internal.awa */
/* compiled from: IMASDK */
public final class awa {
    /* renamed from: a */
    public static int[] m14989a(Collection<? extends Number> collection) {
        if (!(collection instanceof avz)) {
            Object[] array = collection.toArray();
            int length = array.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                Object obj = array[i];
                ars.m14627g(obj);
                iArr[i] = ((Number) obj).intValue();
            }
            return iArr;
        }
        avz avz = (avz) collection;
        throw null;
    }

    /* renamed from: b */
    public static int m14990b(int i, int i2) {
        return Math.min(Math.max(i, i2), 1073741823);
    }

    /* renamed from: c */
    public static int m14991c(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return !z ? -1 : 1;
    }

    /* renamed from: d */
    public static boolean m14992d(Object[] objArr, Object obj) {
        int i;
        if (objArr != null) {
            if (obj == null) {
                i = 0;
                while (true) {
                    if (i >= objArr.length) {
                        break;
                    } else if (objArr[i] == null) {
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= objArr.length) {
                        break;
                    } else if (obj.equals(objArr[i2])) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (i != -1) {
                return true;
            }
        }
        return false;
    }
}
