package com.google.android.exoplayer2.source.hls;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30;
import com.google.android.exoplayer2.source.mediaparser.MediaParserUtil;
import com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.FileTypes;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.common.collect.C4766t;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class MediaParserHlsMediaChunkExtractor implements HlsMediaChunkExtractor {
    public static final HlsExtractorFactory FACTORY = C6863e.f27551a;
    private final Format format;
    private final InputReaderAdapterV30 inputReaderAdapter = new InputReaderAdapterV30();
    private final MediaParser mediaParser;
    private final C4766t<MediaFormat> muxedCaptionMediaFormats;
    private final OutputConsumerAdapterV30 outputConsumerAdapter;
    private final boolean overrideInBandCaptionDeclarations;
    private int pendingSkipBytes;

    private static final class PeekingInputReader implements MediaParser.SeekableInputReader {
        private final ExtractorInput extractorInput;
        /* access modifiers changed from: private */
        public int totalPeekedBytes;

        public long getLength() {
            return this.extractorInput.getLength();
        }

        public long getPosition() {
            return this.extractorInput.getPeekPosition();
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int peek = this.extractorInput.peek(bArr, i, i2);
            this.totalPeekedBytes += peek;
            return peek;
        }

        public void seekToPosition(long j) {
            throw new UnsupportedOperationException();
        }

        private PeekingInputReader(ExtractorInput extractorInput2) {
            this.extractorInput = extractorInput2;
        }
    }

    public MediaParserHlsMediaChunkExtractor(MediaParser mediaParser2, OutputConsumerAdapterV30 outputConsumerAdapterV30, Format format2, boolean z, C4766t<MediaFormat> tVar, int i) {
        this.mediaParser = mediaParser2;
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        this.overrideInBandCaptionDeclarations = z;
        this.muxedCaptionMediaFormats = tVar;
        this.format = format2;
        this.pendingSkipBytes = i;
    }

    @SuppressLint({"WrongConstant"})
    private static MediaParser createMediaParserInstance(MediaParser.OutputConsumer outputConsumer, Format format2, boolean z, C4766t<MediaFormat> tVar, String... strArr) {
        MediaParser mediaParser2;
        if (strArr.length == 1) {
            mediaParser2 = MediaParser.createByName(strArr[0], outputConsumer);
        } else {
            mediaParser2 = MediaParser.create(outputConsumer, strArr);
        }
        mediaParser2.setParameter(MediaParserUtil.PARAMETER_EXPOSE_CAPTION_FORMATS, tVar);
        mediaParser2.setParameter(MediaParserUtil.PARAMETER_OVERRIDE_IN_BAND_CAPTION_DECLARATIONS, Boolean.valueOf(z));
        Boolean bool = Boolean.TRUE;
        mediaParser2.setParameter(MediaParserUtil.PARAMETER_IN_BAND_CRYPTO_INFO, bool);
        mediaParser2.setParameter(MediaParserUtil.PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE, bool);
        mediaParser2.setParameter(MediaParserUtil.PARAMETER_IGNORE_TIMESTAMP_OFFSET, bool);
        mediaParser2.setParameter("android.media.mediaparser.ts.ignoreSpliceInfoStream", bool);
        mediaParser2.setParameter("android.media.mediaparser.ts.mode", "hls");
        String str = format2.codecs;
        if (!TextUtils.isEmpty(str)) {
            if (!MimeTypes.AUDIO_AAC.equals(MimeTypes.getAudioMediaMimeType(str))) {
                mediaParser2.setParameter("android.media.mediaparser.ts.ignoreAacStream", bool);
            }
            if (!MimeTypes.VIDEO_H264.equals(MimeTypes.getVideoMediaMimeType(str))) {
                mediaParser2.setParameter("android.media.mediaparser.ts.ignoreAvcStream", bool);
            }
        }
        return mediaParser2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ HlsMediaChunkExtractor lambda$static$0(Uri uri, Format format2, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput) throws IOException {
        Format format3 = format2;
        List list2 = list;
        TimestampAdjuster timestampAdjuster2 = timestampAdjuster;
        if (FileTypes.inferFileTypeFromMimeType(format3.sampleMimeType) == 13) {
            return new BundledHlsMediaChunkExtractor(new WebvttExtractor(format3.language, timestampAdjuster), format2, timestampAdjuster);
        }
        boolean z = list2 != null;
        C4766t.C4768a v = C4766t.m21986v();
        if (list2 != null) {
            for (int i = 0; i < list.size(); i++) {
                v.mo19883e(MediaParserUtil.toCaptionsMediaFormat((Format) list.get(i)));
            }
        } else {
            v.mo19883e(MediaParserUtil.toCaptionsMediaFormat(new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_CEA608).build()));
        }
        C4766t f = v.mo19884f();
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = new OutputConsumerAdapterV30();
        if (list2 == null) {
            list2 = C4766t.m21978E();
        }
        outputConsumerAdapterV30.setMuxedCaptionFormats(list2);
        outputConsumerAdapterV30.setTimestampAdjuster(timestampAdjuster);
        MediaParser createMediaParserInstance = createMediaParserInstance(outputConsumerAdapterV30, format2, z, f, "android.media.mediaparser.FragmentedMp4Parser", "android.media.mediaparser.Ac3Parser", "android.media.mediaparser.Ac4Parser", "android.media.mediaparser.AdtsParser", "android.media.mediaparser.Mp3Parser", "android.media.mediaparser.TsParser");
        PeekingInputReader peekingInputReader = new PeekingInputReader(extractorInput);
        createMediaParserInstance.advance(peekingInputReader);
        outputConsumerAdapterV30.setSelectedParserName(createMediaParserInstance.getParserName());
        return new MediaParserHlsMediaChunkExtractor(createMediaParserInstance, outputConsumerAdapterV30, format2, z, f, peekingInputReader.totalPeekedBytes);
    }

    public void init(ExtractorOutput extractorOutput) {
        this.outputConsumerAdapter.setExtractorOutput(extractorOutput);
    }

    public boolean isPackedAudioExtractor() {
        String parserName = this.mediaParser.getParserName();
        return "android.media.mediaparser.Ac3Parser".equals(parserName) || "android.media.mediaparser.Ac4Parser".equals(parserName) || "android.media.mediaparser.AdtsParser".equals(parserName) || "android.media.mediaparser.Mp3Parser".equals(parserName);
    }

    public boolean isReusable() {
        String parserName = this.mediaParser.getParserName();
        return "android.media.mediaparser.FragmentedMp4Parser".equals(parserName) || "android.media.mediaparser.TsParser".equals(parserName);
    }

    public void onTruncatedSegmentParsed() {
        this.mediaParser.seek(MediaParser.SeekPoint.START);
    }

    public boolean read(ExtractorInput extractorInput) throws IOException {
        extractorInput.skipFully(this.pendingSkipBytes);
        this.pendingSkipBytes = 0;
        this.inputReaderAdapter.setDataReader(extractorInput, extractorInput.getLength());
        return this.mediaParser.advance(this.inputReaderAdapter);
    }

    public HlsMediaChunkExtractor recreate() {
        Assertions.checkState(!isReusable());
        return new MediaParserHlsMediaChunkExtractor(createMediaParserInstance(this.outputConsumerAdapter, this.format, this.overrideInBandCaptionDeclarations, this.muxedCaptionMediaFormats, this.mediaParser.getParserName()), this.outputConsumerAdapter, this.format, this.overrideInBandCaptionDeclarations, this.muxedCaptionMediaFormats, 0);
    }
}
