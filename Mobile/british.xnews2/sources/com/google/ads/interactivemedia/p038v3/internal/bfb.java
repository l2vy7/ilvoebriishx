package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bfb */
/* compiled from: IMASDK */
public final class bfb extends bey {

    /* renamed from: a */
    private final bgi<String, bey> f16232a = new bgi<>();

    /* renamed from: a */
    public final void mo14989a(String str, bey bey) {
        this.f16232a.put(str, bey);
    }

    /* renamed from: b */
    public final Set<Map.Entry<String, bey>> mo14990b() {
        return this.f16232a.entrySet();
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof bfb) && ((bfb) obj).f16232a.equals(this.f16232a))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16232a.hashCode();
    }
}
