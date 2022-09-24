package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class y34 implements v34 {

    /* renamed from: a */
    private final int f20995a;

    /* renamed from: b */
    private MediaCodecInfo[] f20996b;

    public y34(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.f20995a = i;
    }

    @EnsuresNonNull({"mediaCodecInfos"})
    /* renamed from: c */
    private final void m21174c() {
        if (this.f20996b == null) {
            this.f20996b = new MediaCodecList(this.f20995a).getCodecInfos();
        }
    }

    /* renamed from: a */
    public final boolean mo18974a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    /* renamed from: b */
    public final boolean mo18975b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public final int zza() {
        m21174c();
        return this.f20996b.length;
    }

    public final MediaCodecInfo zzb(int i) {
        m21174c();
        return this.f20996b[i];
    }

    public final boolean zze() {
        return true;
    }
}
