package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.decoder.OutputBuffer;

/* renamed from: com.google.android.exoplayer2.text.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6908a implements OutputBuffer.Owner {

    /* renamed from: a */
    public final /* synthetic */ SimpleSubtitleDecoder f27602a;

    public /* synthetic */ C6908a(SimpleSubtitleDecoder simpleSubtitleDecoder) {
        this.f27602a = simpleSubtitleDecoder;
    }

    public final void releaseOutputBuffer(OutputBuffer outputBuffer) {
        this.f27602a.releaseOutputBuffer((SubtitleOutputBuffer) outputBuffer);
    }
}
