package com.google.android.gms.cast;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.cast.l */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C7173l {

    /* renamed from: a */
    private final Map<String, String> f28839a = new HashMap();

    /* renamed from: b */
    private final Map<String, String> f28840b = new HashMap();

    /* renamed from: c */
    private final Map<String, Integer> f28841c = new HashMap();

    /* renamed from: a */
    public final C7173l mo29636a(String str, String str2, int i) {
        this.f28839a.put(str, str2);
        this.f28840b.put(str2, str);
        this.f28841c.put(str, Integer.valueOf(i));
        return this;
    }

    /* renamed from: b */
    public final String mo29637b(String str) {
        return this.f28839a.get(str);
    }

    /* renamed from: c */
    public final String mo29638c(String str) {
        return this.f28840b.get(str);
    }

    /* renamed from: d */
    public final int mo29639d(String str) {
        Integer num = this.f28841c.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
