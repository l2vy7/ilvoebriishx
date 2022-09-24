package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.google.android.exoplayer2.util.MimeTypes;

/* renamed from: com.google.android.gms.internal.ads.xi */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8335xi implements C8265vi {
    /* synthetic */ C8335xi(C8299wi wiVar) {
    }

    /* renamed from: a */
    public final boolean mo35428a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return MimeTypes.VIDEO_H264.equals(str);
    }

    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    public final MediaCodecInfo zzb(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public final boolean zzd() {
        return false;
    }
}
