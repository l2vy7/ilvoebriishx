package com.google.ads.interactivemedia.p039v3.internal;

import java.util.HashMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.gw */
/* compiled from: IMASDK */
public final class C4030gw extends C3998fr<Integer, Object> {

    /* renamed from: a */
    public Long f17342a;

    /* renamed from: b */
    public Boolean f17343b;

    /* renamed from: c */
    public Boolean f17344c;

    public C4030gw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Object> mo15857a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f17342a);
        hashMap.put(1, this.f17343b);
        hashMap.put(2, this.f17344c);
        return hashMap;
    }

    public C4030gw(String str) {
        HashMap b = C3998fr.m17206b(str);
        if (b != null) {
            this.f17342a = (Long) b.get(0);
            this.f17343b = (Boolean) b.get(1);
            this.f17344c = (Boolean) b.get(2);
        }
    }
}
