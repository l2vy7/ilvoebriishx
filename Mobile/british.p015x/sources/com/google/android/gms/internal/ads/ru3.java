package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ru3 {
    /* renamed from: a */
    static <T> HashSet<T> m37250a(int i) {
        return new HashSet<>(m37253d(i));
    }

    /* renamed from: b */
    public static <K, V> LinkedHashMap<K, V> m37251b(int i) {
        return new LinkedHashMap<>(m37253d(i));
    }

    /* renamed from: c */
    public static <T> List<T> m37252c(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }

    /* renamed from: d */
    private static int m37253d(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
