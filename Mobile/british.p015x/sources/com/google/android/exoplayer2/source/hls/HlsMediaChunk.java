package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.hls.HlsChunkSource;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.C4766t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p149s6.C10995b;

final class HlsMediaChunk extends MediaChunk {
    public static final String PRIV_TIMESTAMP_FRAME_OWNER = "com.apple.streaming.transportStreamTimestamp";
    private static final AtomicInteger uidSource = new AtomicInteger();
    public final int discontinuitySequenceNumber;
    private final DrmInitData drmInitData;
    private HlsMediaChunkExtractor extractor;
    private final HlsExtractorFactory extractorFactory;
    private boolean extractorInvalidated;
    private final boolean hasGapTag;
    private final Id3Decoder id3Decoder;
    private boolean initDataLoadRequired;
    private final DataSource initDataSource;
    private final DataSpec initDataSpec;
    private final boolean initSegmentEncrypted;
    private final boolean isMasterTimestampSource;
    private boolean isPublished;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private final boolean mediaSegmentEncrypted;
    private final List<Format> muxedCaptionFormats;
    private int nextLoadPosition;
    private HlsSampleStreamWrapper output;
    public final int partIndex;
    public final Uri playlistUrl;
    private final HlsMediaChunkExtractor previousExtractor;
    private C4766t<Integer> sampleQueueFirstSampleIndices;
    private final ParsableByteArray scratchId3Data;
    public final boolean shouldSpliceIn;
    private final TimestampAdjuster timestampAdjuster;
    public final int uid;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private HlsMediaChunk(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, DataSpec dataSpec, Format format, boolean z, DataSource dataSource2, DataSpec dataSpec2, boolean z2, Uri uri, List<Format> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, TimestampAdjuster timestampAdjuster2, DrmInitData drmInitData2, HlsMediaChunkExtractor hlsMediaChunkExtractor, Id3Decoder id3Decoder2, ParsableByteArray parsableByteArray, boolean z6) {
        super(dataSource, dataSpec, format, i, obj, j, j2, j3);
        DataSpec dataSpec3 = dataSpec2;
        this.mediaSegmentEncrypted = z;
        this.partIndex = i2;
        this.isPublished = z3;
        this.discontinuitySequenceNumber = i3;
        this.initDataSpec = dataSpec3;
        this.initDataSource = dataSource2;
        this.initDataLoadRequired = dataSpec3 != null;
        this.initSegmentEncrypted = z2;
        this.playlistUrl = uri;
        this.isMasterTimestampSource = z5;
        this.timestampAdjuster = timestampAdjuster2;
        this.hasGapTag = z4;
        this.extractorFactory = hlsExtractorFactory;
        this.muxedCaptionFormats = list;
        this.drmInitData = drmInitData2;
        this.previousExtractor = hlsMediaChunkExtractor;
        this.id3Decoder = id3Decoder2;
        this.scratchId3Data = parsableByteArray;
        this.shouldSpliceIn = z6;
        this.sampleQueueFirstSampleIndices = C4766t.m21978E();
        this.uid = uidSource.getAndIncrement();
    }

    private static DataSource buildDataSource(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return dataSource;
        }
        Assertions.checkNotNull(bArr2);
        return new Aes128DataSource(dataSource, bArr, bArr2);
    }

    public static HlsMediaChunk createInstance(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, Format format, long j, HlsMediaPlaylist hlsMediaPlaylist, HlsChunkSource.SegmentBaseHolder segmentBaseHolder, Uri uri, List<Format> list, int i, Object obj, boolean z, TimestampAdjusterProvider timestampAdjusterProvider, HlsMediaChunk hlsMediaChunk, byte[] bArr, byte[] bArr2) {
        boolean z2;
        boolean z3;
        DataSpec dataSpec;
        DataSource dataSource2;
        boolean z4;
        ParsableByteArray parsableByteArray;
        Id3Decoder id3Decoder2;
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        int i2;
        HlsMediaChunkExtractor hlsMediaChunkExtractor2;
        DataSource dataSource3 = dataSource;
        HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        HlsChunkSource.SegmentBaseHolder segmentBaseHolder2 = segmentBaseHolder;
        HlsMediaChunk hlsMediaChunk2 = hlsMediaChunk;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder2.segmentBase;
        DataSpec build = new DataSpec.Builder().setUri(UriUtil.resolveToUri(hlsMediaPlaylist2.baseUri, segmentBase.url)).setPosition(segmentBase.byteRangeOffset).setLength(segmentBase.byteRangeLength).setFlags(segmentBaseHolder2.isPreload ? 8 : 0).build();
        boolean z5 = bArr3 != null;
        DataSource buildDataSource = buildDataSource(dataSource3, bArr3, z5 ? getEncryptionIvArray((String) Assertions.checkNotNull(segmentBase.encryptionIV)) : null);
        HlsMediaPlaylist.Segment segment = segmentBase.initializationSegment;
        if (segment != null) {
            boolean z6 = bArr4 != null;
            byte[] encryptionIvArray = z6 ? getEncryptionIvArray((String) Assertions.checkNotNull(segment.encryptionIV)) : null;
            z2 = z5;
            dataSpec = new DataSpec(UriUtil.resolveToUri(hlsMediaPlaylist2.baseUri, segment.url), segment.byteRangeOffset, segment.byteRangeLength);
            dataSource2 = buildDataSource(dataSource3, bArr4, encryptionIvArray);
            z3 = z6;
        } else {
            z2 = z5;
            dataSource2 = null;
            dataSpec = null;
            z3 = false;
        }
        long j2 = j + segmentBase.relativeStartTimeUs;
        long j3 = j2 + segmentBase.durationUs;
        int i3 = hlsMediaPlaylist2.discontinuitySequence + segmentBase.relativeDiscontinuitySequence;
        if (hlsMediaChunk2 != null) {
            boolean z7 = uri.equals(hlsMediaChunk2.playlistUrl) && hlsMediaChunk2.loadCompleted;
            Id3Decoder id3Decoder3 = hlsMediaChunk2.id3Decoder;
            ParsableByteArray parsableByteArray2 = hlsMediaChunk2.scratchId3Data;
            int i4 = i3;
            boolean z8 = !(z7 || (isIndependent(segmentBaseHolder2, hlsMediaPlaylist2) && j2 >= hlsMediaChunk2.endTimeUs));
            if (!z7 || hlsMediaChunk2.extractorInvalidated) {
                i2 = i4;
            } else {
                i2 = i4;
                if (hlsMediaChunk2.discontinuitySequenceNumber == i2) {
                    hlsMediaChunkExtractor2 = hlsMediaChunk2.extractor;
                    z4 = z8;
                    hlsMediaChunkExtractor = hlsMediaChunkExtractor2;
                    id3Decoder2 = id3Decoder3;
                    parsableByteArray = parsableByteArray2;
                }
            }
            hlsMediaChunkExtractor2 = null;
            z4 = z8;
            hlsMediaChunkExtractor = hlsMediaChunkExtractor2;
            id3Decoder2 = id3Decoder3;
            parsableByteArray = parsableByteArray2;
        } else {
            Uri uri2 = uri;
            i2 = i3;
            id3Decoder2 = new Id3Decoder();
            parsableByteArray = new ParsableByteArray(10);
            hlsMediaChunkExtractor = null;
            z4 = false;
        }
        return new HlsMediaChunk(hlsExtractorFactory, buildDataSource, build, format, z2, dataSource2, dataSpec, z3, uri, list, i, obj, j2, j3, segmentBaseHolder2.mediaSequence, segmentBaseHolder2.partIndex, !segmentBaseHolder2.isPreload, i2, segmentBase.hasGapTag, z, timestampAdjusterProvider.getAdjuster(i2), segmentBase.drmInitData, hlsMediaChunkExtractor, id3Decoder2, parsableByteArray, z4);
    }

    @RequiresNonNull({"output"})
    private void feedDataToExtractor(DataSource dataSource, DataSpec dataSpec, boolean z) throws IOException {
        DataSpec dataSpec2;
        DefaultExtractorInput prepareExtraction;
        long position;
        long j;
        boolean z2 = false;
        if (z) {
            if (this.nextLoadPosition != 0) {
                z2 = true;
            }
            dataSpec2 = dataSpec;
        } else {
            dataSpec2 = dataSpec.subrange((long) this.nextLoadPosition);
        }
        try {
            prepareExtraction = prepareExtraction(dataSource, dataSpec2);
            if (z2) {
                prepareExtraction.skipFully(this.nextLoadPosition);
            }
            do {
                if (this.loadCanceled || !this.extractor.read(prepareExtraction)) {
                    break;
                }
                break;
                break;
            } while (!this.extractor.read(prepareExtraction));
            break;
            position = prepareExtraction.getPosition();
            j = dataSpec.position;
        } catch (EOFException e) {
            if ((this.trackFormat.roleFlags & 16384) != 0) {
                this.extractor.onTruncatedSegmentParsed();
                position = prepareExtraction.getPosition();
                j = dataSpec.position;
            } else {
                throw e;
            }
        } catch (Throwable th) {
            Util.closeQuietly(dataSource);
            throw th;
        }
        this.nextLoadPosition = (int) (position - j);
        Util.closeQuietly(dataSource);
    }

    private static byte[] getEncryptionIvArray(String str) {
        if (C10995b.m49338e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean isIndependent(HlsChunkSource.SegmentBaseHolder segmentBaseHolder, HlsMediaPlaylist hlsMediaPlaylist) {
        HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder.segmentBase;
        if (segmentBase instanceof HlsMediaPlaylist.Part) {
            return ((HlsMediaPlaylist.Part) segmentBase).isIndependent || (segmentBaseHolder.partIndex == 0 && hlsMediaPlaylist.hasIndependentSegments);
        }
        return hlsMediaPlaylist.hasIndependentSegments;
    }

    @RequiresNonNull({"output"})
    private void loadMedia() throws IOException {
        try {
            this.timestampAdjuster.sharedInitializeOrWait(this.isMasterTimestampSource, this.startTimeUs);
            feedDataToExtractor(this.dataSource, this.dataSpec, this.mediaSegmentEncrypted);
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    @RequiresNonNull({"output"})
    private void maybeLoadInitData() throws IOException {
        if (this.initDataLoadRequired) {
            Assertions.checkNotNull(this.initDataSource);
            Assertions.checkNotNull(this.initDataSpec);
            feedDataToExtractor(this.initDataSource, this.initDataSpec, this.initSegmentEncrypted);
            this.nextLoadPosition = 0;
            this.initDataLoadRequired = false;
        }
    }

    private long peekId3PrivTimestamp(ExtractorInput extractorInput) throws IOException {
        extractorInput.resetPeekPosition();
        try {
            this.scratchId3Data.reset(10);
            extractorInput.peekFully(this.scratchId3Data.getData(), 0, 10);
            if (this.scratchId3Data.readUnsignedInt24() != 4801587) {
                return C6540C.TIME_UNSET;
            }
            this.scratchId3Data.skipBytes(3);
            int readSynchSafeInt = this.scratchId3Data.readSynchSafeInt();
            int i = readSynchSafeInt + 10;
            if (i > this.scratchId3Data.capacity()) {
                byte[] data = this.scratchId3Data.getData();
                this.scratchId3Data.reset(i);
                System.arraycopy(data, 0, this.scratchId3Data.getData(), 0, 10);
            }
            extractorInput.peekFully(this.scratchId3Data.getData(), 10, readSynchSafeInt);
            Metadata decode = this.id3Decoder.decode(this.scratchId3Data.getData(), readSynchSafeInt);
            if (decode == null) {
                return C6540C.TIME_UNSET;
            }
            int length = decode.length();
            for (int i2 = 0; i2 < length; i2++) {
                Metadata.Entry entry = decode.get(i2);
                if (entry instanceof PrivFrame) {
                    PrivFrame privFrame = (PrivFrame) entry;
                    if (PRIV_TIMESTAMP_FRAME_OWNER.equals(privFrame.owner)) {
                        System.arraycopy(privFrame.privateData, 0, this.scratchId3Data.getData(), 0, 8);
                        this.scratchId3Data.setPosition(0);
                        this.scratchId3Data.setLimit(8);
                        return this.scratchId3Data.readLong() & 8589934591L;
                    }
                }
            }
            return C6540C.TIME_UNSET;
        } catch (EOFException unused) {
        }
    }

    @RequiresNonNull({"output"})
    @EnsuresNonNull({"extractor"})
    private DefaultExtractorInput prepareExtraction(DataSource dataSource, DataSpec dataSpec) throws IOException {
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        long j;
        DataSpec dataSpec2 = dataSpec;
        DataSource dataSource2 = dataSource;
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource2, dataSpec2.position, dataSource.open(dataSpec));
        if (this.extractor == null) {
            long peekId3PrivTimestamp = peekId3PrivTimestamp(defaultExtractorInput);
            defaultExtractorInput.resetPeekPosition();
            HlsMediaChunkExtractor hlsMediaChunkExtractor2 = this.previousExtractor;
            if (hlsMediaChunkExtractor2 != null) {
                hlsMediaChunkExtractor = hlsMediaChunkExtractor2.recreate();
            } else {
                hlsMediaChunkExtractor = this.extractorFactory.createExtractor(dataSpec2.uri, this.trackFormat, this.muxedCaptionFormats, this.timestampAdjuster, dataSource.getResponseHeaders(), defaultExtractorInput);
            }
            this.extractor = hlsMediaChunkExtractor;
            if (hlsMediaChunkExtractor.isPackedAudioExtractor()) {
                HlsSampleStreamWrapper hlsSampleStreamWrapper = this.output;
                if (peekId3PrivTimestamp != C6540C.TIME_UNSET) {
                    j = this.timestampAdjuster.adjustTsTimestamp(peekId3PrivTimestamp);
                } else {
                    j = this.startTimeUs;
                }
                hlsSampleStreamWrapper.setSampleOffsetUs(j);
            } else {
                this.output.setSampleOffsetUs(0);
            }
            this.output.onNewExtractor();
            this.extractor.init(this.output);
        }
        this.output.setDrmInitData(this.drmInitData);
        return defaultExtractorInput;
    }

    public void cancelLoad() {
        this.loadCanceled = true;
    }

    public int getFirstSampleIndex(int i) {
        Assertions.checkState(!this.shouldSpliceIn);
        if (i >= this.sampleQueueFirstSampleIndices.size()) {
            return 0;
        }
        return this.sampleQueueFirstSampleIndices.get(i).intValue();
    }

    public void init(HlsSampleStreamWrapper hlsSampleStreamWrapper, C4766t<Integer> tVar) {
        this.output = hlsSampleStreamWrapper;
        this.sampleQueueFirstSampleIndices = tVar;
    }

    public void invalidateExtractor() {
        this.extractorInvalidated = true;
    }

    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    public boolean isPublished() {
        return this.isPublished;
    }

    public void load() throws IOException {
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        Assertions.checkNotNull(this.output);
        if (this.extractor == null && (hlsMediaChunkExtractor = this.previousExtractor) != null && hlsMediaChunkExtractor.isReusable()) {
            this.extractor = this.previousExtractor;
            this.initDataLoadRequired = false;
        }
        maybeLoadInitData();
        if (!this.loadCanceled) {
            if (!this.hasGapTag) {
                loadMedia();
            }
            this.loadCompleted = !this.loadCanceled;
        }
    }

    public void publish() {
        this.isPublished = true;
    }
}
