package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jq1 {

    /* renamed from: a */
    private final Map<String, String> f33982a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f33983b;

    /* renamed from: a */
    public final synchronized Map<String, String> mo32928a() {
        if (this.f33983b == null) {
            this.f33983b = Collections.unmodifiableMap(new HashMap(this.f33982a));
        }
        return this.f33983b;
    }
}
