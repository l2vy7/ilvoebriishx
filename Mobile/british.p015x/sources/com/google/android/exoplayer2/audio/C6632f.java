package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;

/* renamed from: com.google.android.exoplayer2.audio.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6632f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f27347b;

    /* renamed from: c */
    public final /* synthetic */ Format f27348c;

    /* renamed from: d */
    public final /* synthetic */ DecoderReuseEvaluation f27349d;

    public /* synthetic */ C6632f(AudioRendererEventListener.EventDispatcher eventDispatcher, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        this.f27347b = eventDispatcher;
        this.f27348c = format;
        this.f27349d = decoderReuseEvaluation;
    }

    public final void run() {
        this.f27347b.lambda$inputFormatChanged$2(this.f27348c, this.f27349d);
    }
}
