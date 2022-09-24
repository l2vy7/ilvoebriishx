package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class fs0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f31867b;

    /* renamed from: c */
    final /* synthetic */ String f31868c;

    /* renamed from: d */
    final /* synthetic */ int f31869d;

    /* renamed from: e */
    final /* synthetic */ int f31870e;

    /* renamed from: f */
    final /* synthetic */ ms0 f31871f;

    fs0(ms0 ms0, String str, String str2, int i, int i2, boolean z) {
        this.f31871f = ms0;
        this.f31867b = str;
        this.f31868c = str2;
        this.f31869d = i;
        this.f31870e = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f31867b);
        hashMap.put("cachedSrc", this.f31868c);
        hashMap.put("bytesLoaded", Integer.toString(this.f31869d));
        hashMap.put("totalBytes", Integer.toString(this.f31870e));
        hashMap.put("cacheReady", SessionDescription.SUPPORTED_SDP_VERSION);
        ms0.m20699f(this.f31871f, "onPrecacheEvent", hashMap);
    }
}
