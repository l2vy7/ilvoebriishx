package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class o83 {
    /* renamed from: a */
    static int m35587a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* renamed from: b */
    static boolean m35588b(Set<?> set, Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof a83) {
            collection = ((a83) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m35589c(set, collection.iterator());
        }
        Iterator<?> it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    static boolean m35589c(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
