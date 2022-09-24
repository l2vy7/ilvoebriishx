package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class hs0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f32820b;

    /* renamed from: c */
    final /* synthetic */ String f32821c;

    /* renamed from: d */
    final /* synthetic */ long f32822d;

    /* renamed from: e */
    final /* synthetic */ long f32823e;

    /* renamed from: f */
    final /* synthetic */ long f32824f;

    /* renamed from: g */
    final /* synthetic */ long f32825g;

    /* renamed from: h */
    final /* synthetic */ long f32826h;

    /* renamed from: i */
    final /* synthetic */ boolean f32827i;

    /* renamed from: j */
    final /* synthetic */ int f32828j;

    /* renamed from: k */
    final /* synthetic */ int f32829k;

    /* renamed from: l */
    final /* synthetic */ ms0 f32830l;

    hs0(ms0 ms0, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.f32830l = ms0;
        this.f32820b = str;
        this.f32821c = str2;
        this.f32822d = j;
        this.f32823e = j2;
        this.f32824f = j3;
        this.f32825g = j4;
        this.f32826h = j5;
        this.f32827i = z;
        this.f32828j = i;
        this.f32829k = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f32820b);
        hashMap.put("cachedSrc", this.f32821c);
        hashMap.put("bufferedDuration", Long.toString(this.f32822d));
        hashMap.put("totalDuration", Long.toString(this.f32823e));
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37194r1)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f32824f));
            hashMap.put("qoeCachedBytes", Long.toString(this.f32825g));
            hashMap.put("totalBytes", Long.toString(this.f32826h));
            hashMap.put("reportTime", Long.toString(zzt.zzA().currentTimeMillis()));
        }
        hashMap.put("cacheReady", true != this.f32827i ? SessionDescription.SUPPORTED_SDP_VERSION : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        hashMap.put("playerCount", Integer.toString(this.f32828j));
        hashMap.put("playerPreparedCount", Integer.toString(this.f32829k));
        ms0.m20699f(this.f32830l, "onPrecacheEvent", hashMap);
    }
}
