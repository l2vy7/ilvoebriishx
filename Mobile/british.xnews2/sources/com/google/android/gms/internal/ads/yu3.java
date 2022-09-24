package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yu3<K, V> extends qu3<K, V, V> {

    /* renamed from: b */
    private static final iv3<Map<Object, Object>> f42008b = vu3.m38959a(Collections.emptyMap());

    /* synthetic */ yu3(Map map, wu3 wu3) {
        super(map);
    }

    /* renamed from: b */
    public static <K, V> xu3<K, V> m40028b(int i) {
        return new xu3<>(i, (wu3) null);
    }

    /* renamed from: c */
    public final Map<K, V> zzb() {
        LinkedHashMap b = ru3.m37251b(mo34418a().size());
        for (Map.Entry entry : mo34418a().entrySet()) {
            b.put(entry.getKey(), ((iv3) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(b);
    }
}
