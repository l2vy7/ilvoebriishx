package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.kd */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7863kd<T> {

    /* renamed from: a */
    private final Map<String, AtomicReference<T>> f34253a = new HashMap();

    /* renamed from: a */
    public final AtomicReference<T> mo33067a(String str) {
        synchronized (this) {
            if (!this.f34253a.containsKey(str)) {
                this.f34253a.put(str, new AtomicReference());
            }
        }
        return this.f34253a.get(str);
    }
}
