package com.google.android.exoplayer2.transformer;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

interface SampleTransformer {
    void transformSample(DecoderInputBuffer decoderInputBuffer);
}
