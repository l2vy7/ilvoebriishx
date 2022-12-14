package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;

public final class StartOffsetExtractorOutput implements ExtractorOutput {
    private final ExtractorOutput extractorOutput;
    /* access modifiers changed from: private */
    public final long startOffset;

    public StartOffsetExtractorOutput(long j, ExtractorOutput extractorOutput2) {
        this.startOffset = j;
        this.extractorOutput = extractorOutput2;
    }

    public void endTracks() {
        this.extractorOutput.endTracks();
    }

    public void seekMap(final SeekMap seekMap) {
        this.extractorOutput.seekMap(new SeekMap() {
            public long getDurationUs() {
                return seekMap.getDurationUs();
            }

            public SeekMap.SeekPoints getSeekPoints(long j) {
                SeekMap.SeekPoints seekPoints = seekMap.getSeekPoints(j);
                SeekPoint seekPoint = seekPoints.first;
                SeekPoint seekPoint2 = new SeekPoint(seekPoint.timeUs, seekPoint.position + StartOffsetExtractorOutput.this.startOffset);
                SeekPoint seekPoint3 = seekPoints.second;
                return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(seekPoint3.timeUs, seekPoint3.position + StartOffsetExtractorOutput.this.startOffset));
            }

            public boolean isSeekable() {
                return seekMap.isSeekable();
            }
        });
    }

    public TrackOutput track(int i, int i2) {
        return this.extractorOutput.track(i, i2);
    }
}
