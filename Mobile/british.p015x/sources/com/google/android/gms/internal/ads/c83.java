package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class c83 {
    /* renamed from: a */
    static Object m20255a(@CheckForNull Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: b */
    static Object[] m20256b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m20255a(objArr[i2], i2);
        }
        return objArr;
    }
}
