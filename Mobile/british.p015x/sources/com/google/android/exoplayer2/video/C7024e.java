package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

/* renamed from: com.google.android.exoplayer2.video.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7024e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f27688b;

    /* renamed from: c */
    public final /* synthetic */ Format f27689c;

    /* renamed from: d */
    public final /* synthetic */ DecoderReuseEvaluation f27690d;

    public /* synthetic */ C7024e(VideoRendererEventListener.EventDispatcher eventDispatcher, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        this.f27688b = eventDispatcher;
        this.f27689c = format;
        this.f27690d = decoderReuseEvaluation;
    }

    public final void run() {
        this.f27688b.lambda$inputFormatChanged$2(this.f27689c, this.f27690d);
    }
}
