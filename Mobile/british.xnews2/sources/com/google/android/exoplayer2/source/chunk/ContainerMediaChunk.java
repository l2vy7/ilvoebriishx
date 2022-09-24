package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

public class ContainerMediaChunk extends BaseMediaChunk {
    private final int chunkCount;
    private final ChunkExtractor chunkExtractor;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private long nextLoadPosition;
    private final long sampleOffsetUs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContainerMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, ChunkExtractor chunkExtractor2) {
        super(dataSource, dataSpec, format, i, obj, j, j2, j3, j4, j5);
        this.chunkCount = i2;
        this.sampleOffsetUs = j6;
        this.chunkExtractor = chunkExtractor2;
    }

    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    public long getNextChunkIndex() {
        return this.chunkIndex + ((long) this.chunkCount);
    }

    /* access modifiers changed from: protected */
    public ChunkExtractor.TrackOutputProvider getTrackOutputProvider(BaseMediaChunkOutput baseMediaChunkOutput) {
        return baseMediaChunkOutput;
    }

    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    public final void load() throws IOException {
        DefaultExtractorInput defaultExtractorInput;
        if (this.nextLoadPosition == 0) {
            BaseMediaChunkOutput output = getOutput();
            output.setSampleOffsetUs(this.sampleOffsetUs);
            ChunkExtractor chunkExtractor2 = this.chunkExtractor;
            ChunkExtractor.TrackOutputProvider trackOutputProvider = getTrackOutputProvider(output);
            long j = this.clippedStartTimeUs;
            long j2 = j == C6540C.TIME_UNSET ? -9223372036854775807L : j - this.sampleOffsetUs;
            long j3 = this.clippedEndTimeUs;
            chunkExtractor2.init(trackOutputProvider, j2, j3 == C6540C.TIME_UNSET ? -9223372036854775807L : j3 - this.sampleOffsetUs);
        }
        try {
            DataSpec subrange = this.dataSpec.subrange(this.nextLoadPosition);
            StatsDataSource statsDataSource = this.dataSource;
            defaultExtractorInput = new DefaultExtractorInput(statsDataSource, subrange.position, statsDataSource.open(subrange));
            do {
                if (this.loadCanceled || !this.chunkExtractor.read(defaultExtractorInput)) {
                    break;
                }
                break;
                break;
            } while (!this.chunkExtractor.read(defaultExtractorInput));
            break;
            this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
            Util.closeQuietly((DataSource) this.dataSource);
            this.loadCompleted = !this.loadCanceled;
        } catch (Throwable th) {
            Util.closeQuietly((DataSource) this.dataSource);
            throw th;
        }
    }
}
