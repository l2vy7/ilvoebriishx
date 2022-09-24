package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ll */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7908ll {

    /* renamed from: a */
    private final Map<String, String> f35127a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f35128b;

    /* renamed from: a */
    public final synchronized Map<String, String> mo33351a() {
        if (this.f35128b == null) {
            this.f35128b = Collections.unmodifiableMap(new HashMap(this.f35127a));
        }
        return this.f35128b;
    }
}
