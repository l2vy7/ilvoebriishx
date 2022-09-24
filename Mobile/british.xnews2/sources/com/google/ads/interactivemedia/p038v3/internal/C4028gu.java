package com.google.ads.interactivemedia.p038v3.internal;

import java.util.HashMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.gu */
/* compiled from: IMASDK */
public final class C4028gu extends C3998fr<Integer, Long> {

    /* renamed from: a */
    public long f17340a = -1;

    /* renamed from: b */
    public long f17341b = -1;

    public C4028gu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo15857a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.f17340a));
        hashMap.put(1, Long.valueOf(this.f17341b));
        return hashMap;
    }

    public C4028gu(String str) {
        HashMap b = C3998fr.m17206b(str);
        if (b != null) {
            this.f17340a = ((Long) b.get(0)).longValue();
            this.f17341b = ((Long) b.get(1)).longValue();
        }
    }
}
