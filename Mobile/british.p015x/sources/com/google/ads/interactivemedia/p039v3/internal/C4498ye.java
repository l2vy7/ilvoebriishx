package com.google.ads.interactivemedia.p039v3.internal;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.google.android.exoplayer2.util.MimeTypes;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ye */
/* compiled from: IMASDK */
final class C4498ye implements C4497yd {
    private C4498ye() {
    }

    /* synthetic */ C4498ye(byte[] bArr) {
    }

    /* renamed from: a */
    public final int mo16806a() {
        return MediaCodecList.getCodecCount();
    }

    /* renamed from: b */
    public final MediaCodecInfo mo16807b(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    /* renamed from: c */
    public final boolean mo16808c() {
        return false;
    }

    /* renamed from: d */
    public final boolean mo16809d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2);
    }

    /* renamed from: e */
    public final boolean mo16810e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }
}
