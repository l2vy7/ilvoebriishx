package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class is0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f33502b;

    /* renamed from: c */
    final /* synthetic */ String f33503c;

    /* renamed from: d */
    final /* synthetic */ int f33504d;

    /* renamed from: e */
    final /* synthetic */ int f33505e;

    /* renamed from: f */
    final /* synthetic */ long f33506f;

    /* renamed from: g */
    final /* synthetic */ long f33507g;

    /* renamed from: h */
    final /* synthetic */ boolean f33508h;

    /* renamed from: i */
    final /* synthetic */ int f33509i;

    /* renamed from: j */
    final /* synthetic */ int f33510j;

    /* renamed from: k */
    final /* synthetic */ ms0 f33511k;

    is0(ms0 ms0, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.f33511k = ms0;
        this.f33502b = str;
        this.f33503c = str2;
        this.f33504d = i;
        this.f33505e = i2;
        this.f33506f = j;
        this.f33507g = j2;
        this.f33508h = z;
        this.f33509i = i3;
        this.f33510j = i4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f33502b);
        hashMap.put("cachedSrc", this.f33503c);
        hashMap.put("bytesLoaded", Integer.toString(this.f33504d));
        hashMap.put("totalBytes", Integer.toString(this.f33505e));
        hashMap.put("bufferedDuration", Long.toString(this.f33506f));
        hashMap.put("totalDuration", Long.toString(this.f33507g));
        hashMap.put("cacheReady", true != this.f33508h ? SessionDescription.SUPPORTED_SDP_VERSION : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        hashMap.put("playerCount", Integer.toString(this.f33509i));
        hashMap.put("playerPreparedCount", Integer.toString(this.f33510j));
        ms0.m20699f(this.f33511k, "onPrecacheEvent", hashMap);
    }
}
