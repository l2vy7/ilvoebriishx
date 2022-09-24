package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.cast.h1 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8548h1 {
    /* renamed from: a */
    static int m40981a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
