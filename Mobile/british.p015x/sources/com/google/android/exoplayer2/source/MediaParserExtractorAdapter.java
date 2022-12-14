package com.google.android.exoplayer2.source;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import android.net.Uri;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.source.ProgressiveMediaExtractor;
import com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30;
import com.google.android.exoplayer2.source.mediaparser.MediaParserUtil;
import com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30;
import com.google.android.exoplayer2.upstream.DataReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class MediaParserExtractorAdapter implements ProgressiveMediaExtractor {
    public static final ProgressiveMediaExtractor.Factory FACTORY = C6836c.f27528a;
    private final InputReaderAdapterV30 inputReaderAdapter = new InputReaderAdapterV30();
    private final MediaParser mediaParser;
    private final OutputConsumerAdapterV30 outputConsumerAdapter;
    private String parserName;

    @SuppressLint({"WrongConstant"})
    public MediaParserExtractorAdapter() {
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = new OutputConsumerAdapterV30();
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        MediaParser create = MediaParser.create(outputConsumerAdapterV30, new String[0]);
        this.mediaParser = create;
        Boolean bool = Boolean.TRUE;
        create.setParameter(MediaParserUtil.PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE, bool);
        create.setParameter(MediaParserUtil.PARAMETER_IN_BAND_CRYPTO_INFO, bool);
        create.setParameter(MediaParserUtil.PARAMETER_INCLUDE_SUPPLEMENTAL_DATA, bool);
        this.parserName = "android.media.mediaparser.UNKNOWN";
    }

    public void disableSeekingOnMp3Streams() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.parserName)) {
            this.outputConsumerAdapter.disableSeeking();
        }
    }

    public long getCurrentInputPosition() {
        return this.inputReaderAdapter.getPosition();
    }

    public void init(DataReader dataReader, Uri uri, Map<String, List<String>> map, long j, long j2, ExtractorOutput extractorOutput) throws IOException {
        this.outputConsumerAdapter.setExtractorOutput(extractorOutput);
        this.inputReaderAdapter.setDataReader(dataReader, j2);
        this.inputReaderAdapter.setCurrentPosition(j);
        String parserName2 = this.mediaParser.getParserName();
        if ("android.media.mediaparser.UNKNOWN".equals(parserName2)) {
            this.mediaParser.advance(this.inputReaderAdapter);
            String parserName3 = this.mediaParser.getParserName();
            this.parserName = parserName3;
            this.outputConsumerAdapter.setSelectedParserName(parserName3);
        } else if (!parserName2.equals(this.parserName)) {
            String parserName4 = this.mediaParser.getParserName();
            this.parserName = parserName4;
            this.outputConsumerAdapter.setSelectedParserName(parserName4);
        }
    }

    public int read(PositionHolder positionHolder) throws IOException {
        boolean advance = this.mediaParser.advance(this.inputReaderAdapter);
        long andResetSeekPosition = this.inputReaderAdapter.getAndResetSeekPosition();
        positionHolder.position = andResetSeekPosition;
        if (!advance) {
            return -1;
        }
        return andResetSeekPosition != -1 ? 1 : 0;
    }

    public void release() {
        this.mediaParser.release();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.media.MediaParser$SeekPoint} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void seek(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30 r0 = r4.inputReaderAdapter
            r0.setCurrentPosition(r5)
            com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30 r0 = r4.outputConsumerAdapter
            android.util.Pair r7 = r0.getSeekPoints(r7)
            android.media.MediaParser r8 = r4.mediaParser
            java.lang.Object r0 = r7.second
            r1 = r0
            android.media.MediaParser$SeekPoint r1 = (android.media.MediaParser.SeekPoint) r1
            long r1 = r1.position
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x001b
            android.media.MediaParser$SeekPoint r0 = (android.media.MediaParser.SeekPoint) r0
            goto L_0x0020
        L_0x001b:
            java.lang.Object r5 = r7.first
            r0 = r5
            android.media.MediaParser$SeekPoint r0 = (android.media.MediaParser.SeekPoint) r0
        L_0x0020:
            r8.seek(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.MediaParserExtractorAdapter.seek(long, long):void");
    }
}
