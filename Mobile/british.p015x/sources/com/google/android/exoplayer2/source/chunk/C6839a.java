package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.chunk.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6839a implements ChunkExtractor.Factory {

    /* renamed from: a */
    public static final /* synthetic */ C6839a f27530a = new C6839a();

    private /* synthetic */ C6839a() {
    }

    public final ChunkExtractor createProgressiveMediaExtractor(int i, Format format, boolean z, List list, TrackOutput trackOutput) {
        return BundledChunkExtractor.lambda$static$0(i, format, z, list, trackOutput);
    }
}
