package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.dc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7604dc extends C7823j9<Integer, Long> {

    /* renamed from: b */
    public Long f30707b;

    /* renamed from: c */
    public Long f30708c;

    /* renamed from: d */
    public Long f30709d;

    /* renamed from: e */
    public Long f30710e;

    public C7604dc(String str) {
        HashMap a = C7823j9.m33575a(str);
        if (a != null) {
            this.f30707b = (Long) a.get(0);
            this.f30708c = (Long) a.get(1);
            this.f30709d = (Long) a.get(2);
            this.f30710e = (Long) a.get(3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap<Integer, Long> mo30652b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f30707b);
        hashMap.put(1, this.f30708c);
        hashMap.put(2, this.f30709d);
        hashMap.put(3, this.f30710e);
        return hashMap;
    }
}
