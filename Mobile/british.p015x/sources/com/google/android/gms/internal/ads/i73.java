package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i73 {
    /* renamed from: a */
    public static <E> ArrayList<E> m33107a(int i) {
        n53.m35069a(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    /* renamed from: b */
    public static <F, T> List<T> m33108b(List<F> list, p33<? super F, ? extends T> p33) {
        return new h73(list, p33);
    }
}
