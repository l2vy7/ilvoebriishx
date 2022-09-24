package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;

/* renamed from: com.google.android.exoplayer2.mediacodec.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6743g implements MediaCodecUtil.ScoreProvider {

    /* renamed from: a */
    public final /* synthetic */ Format f27460a;

    public /* synthetic */ C6743g(Format format) {
        this.f27460a = format;
    }

    public final int getScore(Object obj) {
        return MediaCodecUtil.lambda$getDecoderInfosSortedByFormatSupport$0(this.f27460a, (MediaCodecInfo) obj);
    }
}
