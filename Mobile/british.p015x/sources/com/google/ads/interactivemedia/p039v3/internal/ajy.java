package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajy */
/* compiled from: IMASDK */
public final class ajy {

    /* renamed from: a */
    private final Map<String, String> f15125a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f15126b;

    /* renamed from: a */
    public final synchronized Map<String, String> mo13831a() {
        if (this.f15126b == null) {
            this.f15126b = Collections.unmodifiableMap(new HashMap(this.f15125a));
        }
        return this.f15126b;
    }
}
