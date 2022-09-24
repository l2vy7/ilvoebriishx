package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class e73 {
    @CheckForNull
    /* renamed from: a */
    static <T> T m20399a(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    /* renamed from: b */
    static void m20400b(Iterator<?> it) {
        Objects.requireNonNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
