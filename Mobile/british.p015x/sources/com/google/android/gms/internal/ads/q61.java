package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q61<AdT> implements r61<AdT> {

    /* renamed from: a */
    private final Map<String, r42<AdT>> f37880a;

    q61(Map<String, r42<AdT>> map) {
        this.f37880a = map;
    }

    /* renamed from: b */
    public final r42<AdT> mo33709b(int i, String str) {
        return this.f37880a.get(str);
    }
}
