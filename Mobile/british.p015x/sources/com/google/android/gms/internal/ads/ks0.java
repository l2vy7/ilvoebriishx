package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ks0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f34461b;

    /* renamed from: c */
    final /* synthetic */ String f34462c;

    /* renamed from: d */
    final /* synthetic */ long f34463d;

    /* renamed from: e */
    final /* synthetic */ ms0 f34464e;

    ks0(ms0 ms0, String str, String str2, long j) {
        this.f34464e = ms0;
        this.f34461b = str;
        this.f34462c = str2;
        this.f34463d = j;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f34461b);
        hashMap.put("cachedSrc", this.f34462c);
        hashMap.put("totalDuration", Long.toString(this.f34463d));
        ms0.m20699f(this.f34464e, "onPrecacheEvent", hashMap);
    }
}
