package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.ProgressiveMediaExtractor;

/* renamed from: com.google.android.exoplayer2.source.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6836c implements ProgressiveMediaExtractor.Factory {

    /* renamed from: a */
    public static final /* synthetic */ C6836c f27528a = new C6836c();

    private /* synthetic */ C6836c() {
    }

    public final ProgressiveMediaExtractor createProgressiveMediaExtractor() {
        return new MediaParserExtractorAdapter();
    }
}
