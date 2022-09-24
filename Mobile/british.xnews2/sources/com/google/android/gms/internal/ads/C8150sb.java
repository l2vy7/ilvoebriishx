package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.sb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8150sb extends C7823j9<Integer, Object> {

    /* renamed from: b */
    public Long f38938b;

    /* renamed from: c */
    public Boolean f38939c;

    /* renamed from: d */
    public Boolean f38940d;

    public C8150sb(String str) {
        HashMap a = C7823j9.m33575a(str);
        if (a != null) {
            this.f38938b = (Long) a.get(0);
            this.f38939c = (Boolean) a.get(1);
            this.f38940d = (Boolean) a.get(2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap<Integer, Object> mo30652b() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f38938b);
        hashMap.put(1, this.f38939c);
        hashMap.put(2, this.f38940d);
        return hashMap;
    }
}
