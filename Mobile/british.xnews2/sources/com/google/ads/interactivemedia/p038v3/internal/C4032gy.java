package com.google.ads.interactivemedia.p038v3.internal;

import java.util.HashMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.gy */
/* compiled from: IMASDK */
public final class C4032gy extends C3998fr<Integer, Long> {

    /* renamed from: a */
    public Long f17346a;

    /* renamed from: b */
    public Long f17347b;

    public C4032gy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo15857a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f17346a);
        hashMap.put(1, this.f17347b);
        return hashMap;
    }

    public C4032gy(String str) {
        HashMap b = C3998fr.m17206b(str);
        if (b != null) {
            this.f17346a = (Long) b.get(0);
            this.f17347b = (Long) b.get(1);
        }
    }
}
