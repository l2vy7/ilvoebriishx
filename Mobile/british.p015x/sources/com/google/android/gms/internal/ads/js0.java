package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class js0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f34027b;

    /* renamed from: c */
    final /* synthetic */ String f34028c;

    /* renamed from: d */
    final /* synthetic */ int f34029d;

    /* renamed from: e */
    final /* synthetic */ ms0 f34030e;

    js0(ms0 ms0, String str, String str2, int i) {
        this.f34030e = ms0;
        this.f34027b = str;
        this.f34028c = str2;
        this.f34029d = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f34027b);
        hashMap.put("cachedSrc", this.f34028c);
        hashMap.put("totalBytes", Integer.toString(this.f34029d));
        ms0.m20699f(this.f34030e, "onPrecacheEvent", hashMap);
    }
}
