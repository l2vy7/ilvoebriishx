package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.gb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7714gb extends C7823j9<Integer, Long> {

    /* renamed from: b */
    public long f32214b = -1;

    /* renamed from: c */
    public long f32215c = -1;

    public C7714gb(String str) {
        HashMap a = C7823j9.m33575a(str);
        if (a != null) {
            this.f32214b = ((Long) a.get(0)).longValue();
            this.f32215c = ((Long) a.get(1)).longValue();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap<Integer, Long> mo30652b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.f32214b));
        hashMap.put(1, Long.valueOf(this.f32215c));
        return hashMap;
    }
}
