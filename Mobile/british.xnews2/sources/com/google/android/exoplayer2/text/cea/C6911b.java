package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.decoder.OutputBuffer;
import com.google.android.exoplayer2.text.cea.CeaDecoder;

/* renamed from: com.google.android.exoplayer2.text.cea.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6911b implements OutputBuffer.Owner {

    /* renamed from: a */
    public final /* synthetic */ CeaDecoder f27604a;

    public /* synthetic */ C6911b(CeaDecoder ceaDecoder) {
        this.f27604a = ceaDecoder;
    }

    public final void releaseOutputBuffer(OutputBuffer outputBuffer) {
        this.f27604a.releaseOutputBuffer((CeaDecoder.CeaOutputBuffer) outputBuffer);
    }
}
