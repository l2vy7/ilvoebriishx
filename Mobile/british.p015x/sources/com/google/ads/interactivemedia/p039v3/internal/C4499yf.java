package com.google.ads.interactivemedia.p039v3.internal;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yf */
/* compiled from: IMASDK */
final class C4499yf implements C4497yd {

    /* renamed from: a */
    private final int f19678a;

    /* renamed from: b */
    private MediaCodecInfo[] f19679b;

    public C4499yf(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.f19678a = i;
    }

    /* renamed from: f */
    private final void m19569f() {
        if (this.f19679b == null) {
            this.f19679b = new MediaCodecList(this.f19678a).getCodecInfos();
        }
    }

    /* renamed from: a */
    public final int mo16806a() {
        m19569f();
        return this.f19679b.length;
    }

    /* renamed from: b */
    public final MediaCodecInfo mo16807b(int i) {
        m19569f();
        return this.f19679b[i];
    }

    /* renamed from: c */
    public final boolean mo16808c() {
        return true;
    }

    /* renamed from: d */
    public final boolean mo16809d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    /* renamed from: e */
    public final boolean mo16810e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }
}
