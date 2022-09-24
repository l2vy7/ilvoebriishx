package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.source.ProgressiveMediaExtractor;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;

/* renamed from: com.google.android.exoplayer2.source.s */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6897s implements ProgressiveMediaExtractor.Factory {

    /* renamed from: a */
    public final /* synthetic */ ExtractorsFactory f27596a;

    public /* synthetic */ C6897s(ExtractorsFactory extractorsFactory) {
        this.f27596a = extractorsFactory;
    }

    public final ProgressiveMediaExtractor createProgressiveMediaExtractor() {
        return ProgressiveMediaSource.Factory.lambda$setExtractorsFactory$1(this.f27596a);
    }
}
