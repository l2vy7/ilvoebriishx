package com.google.ads.interactivemedia.p038v3.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ih */
/* compiled from: IMASDK */
public final class C4069ih<T> {

    /* renamed from: a */
    private final Map<String, AtomicReference<T>> f17427a = new HashMap();

    /* renamed from: a */
    public final AtomicReference<T> mo15917a(String str) {
        synchronized (this) {
            if (!this.f17427a.containsKey(str)) {
                this.f17427a.put(str, new AtomicReference());
            }
        }
        return this.f17427a.get(str);
    }
}
