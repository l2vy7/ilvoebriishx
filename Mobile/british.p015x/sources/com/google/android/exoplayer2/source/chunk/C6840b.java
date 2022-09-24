package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.chunk.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6840b implements ChunkExtractor.Factory {

    /* renamed from: a */
    public static final /* synthetic */ C6840b f27531a = new C6840b();

    private /* synthetic */ C6840b() {
    }

    public final ChunkExtractor createProgressiveMediaExtractor(int i, Format format, boolean z, List list, TrackOutput trackOutput) {
        return MediaParserChunkExtractor.lambda$static$0(i, format, z, list, trackOutput);
    }
}
