package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
/* renamed from: com.google.android.gms.internal.ads.yi */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8371yi implements C8265vi {

    /* renamed from: a */
    private final int f41874a;

    /* renamed from: b */
    private MediaCodecInfo[] f41875b;

    public C8371yi(boolean z) {
        this.f41874a = z ? 1 : 0;
    }

    /* renamed from: b */
    private final void m39939b() {
        if (this.f41875b == null) {
            this.f41875b = new MediaCodecList(this.f41874a).getCodecInfos();
        }
    }

    /* renamed from: a */
    public final boolean mo35428a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public final int zza() {
        m39939b();
        return this.f41875b.length;
    }

    public final MediaCodecInfo zzb(int i) {
        m39939b();
        return this.f41875b[i];
    }

    public final boolean zzd() {
        return true;
    }
}
