package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class o73 {
    @CheckForNull
    /* renamed from: a */
    static <V> V m20765a(Map<?, V> map, @CheckForNull Object obj) {
        Objects.requireNonNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }
}
