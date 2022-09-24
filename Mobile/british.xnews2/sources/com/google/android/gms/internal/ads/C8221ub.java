package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ub */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8221ub extends C7823j9<Integer, Long> {

    /* renamed from: b */
    public Long f39816b;

    /* renamed from: c */
    public Long f39817c;

    public C8221ub(String str) {
        HashMap a = C7823j9.m33575a(str);
        if (a != null) {
            this.f39816b = (Long) a.get(0);
            this.f39817c = (Long) a.get(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap<Integer, Long> mo30652b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f39816b);
        hashMap.put(1, this.f39817c);
        return hashMap;
    }
}
