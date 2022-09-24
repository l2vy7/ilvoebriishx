package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.source.ProgressiveMediaExtractor;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;

/* renamed from: com.google.android.exoplayer2.source.r */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6877r implements ProgressiveMediaExtractor.Factory {

    /* renamed from: a */
    public final /* synthetic */ ExtractorsFactory f27577a;

    public /* synthetic */ C6877r(ExtractorsFactory extractorsFactory) {
        this.f27577a = extractorsFactory;
    }

    public final ProgressiveMediaExtractor createProgressiveMediaExtractor() {
        return ProgressiveMediaSource.Factory.lambda$new$0(this.f27577a);
    }
}
