package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.BundledChunkExtractor;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.chunk.ChunkHolder;
import com.google.android.exoplayer2.source.chunk.ContainerMediaChunk;
import com.google.android.exoplayer2.source.chunk.InitializationChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.SingleSampleMediaChunk;
import com.google.android.exoplayer2.source.dash.DashChunkSource;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DefaultDashChunkSource implements DashChunkSource {
    private final int[] adaptationSetIndices;
    private final DataSource dataSource;
    private final long elapsedRealtimeOffsetMs;
    private IOException fatalError;
    private DashManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final int maxSegmentsPerLoad;
    private boolean missingLastSegment;
    private int periodIndex;
    private final PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler;
    protected final RepresentationHolder[] representationHolders;
    private ExoTrackSelection trackSelection;
    private final int trackType;

    public static final class Factory implements DashChunkSource.Factory {
        private final ChunkExtractor.Factory chunkExtractorFactory;
        private final DataSource.Factory dataSourceFactory;
        private final int maxSegmentsPerLoad;

        public Factory(DataSource.Factory factory) {
            this(factory, 1);
        }

        public DashChunkSource createDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, int i, int[] iArr, ExoTrackSelection exoTrackSelection, int i2, long j, boolean z, List<Format> list, PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, TransferListener transferListener) {
            TransferListener transferListener2 = transferListener;
            DataSource createDataSource = this.dataSourceFactory.createDataSource();
            if (transferListener2 != null) {
                createDataSource.addTransferListener(transferListener2);
            }
            return new DefaultDashChunkSource(this.chunkExtractorFactory, loaderErrorThrower, dashManifest, i, iArr, exoTrackSelection, i2, createDataSource, j, this.maxSegmentsPerLoad, z, list, playerTrackEmsgHandler);
        }

        public Factory(DataSource.Factory factory, int i) {
            this(BundledChunkExtractor.FACTORY, factory, i);
        }

        public Factory(ChunkExtractor.Factory factory, DataSource.Factory factory2, int i) {
            this.chunkExtractorFactory = factory;
            this.dataSourceFactory = factory2;
            this.maxSegmentsPerLoad = i;
        }
    }

    protected static final class RepresentationHolder {
        final ChunkExtractor chunkExtractor;
        /* access modifiers changed from: private */
        public final long periodDurationUs;
        public final Representation representation;
        public final DashSegmentIndex segmentIndex;
        private final long segmentNumShift;

        RepresentationHolder(long j, Representation representation2, ChunkExtractor chunkExtractor2, long j2, DashSegmentIndex dashSegmentIndex) {
            this.periodDurationUs = j;
            this.representation = representation2;
            this.segmentNumShift = j2;
            this.chunkExtractor = chunkExtractor2;
            this.segmentIndex = dashSegmentIndex;
        }

        /* access modifiers changed from: package-private */
        public RepresentationHolder copyWithNewRepresentation(long j, Representation representation2) throws BehindLiveWindowException {
            long j2;
            long j3;
            long j4 = j;
            DashSegmentIndex index = this.representation.getIndex();
            DashSegmentIndex index2 = representation2.getIndex();
            if (index == null) {
                return new RepresentationHolder(j, representation2, this.chunkExtractor, this.segmentNumShift, index);
            } else if (!index.isExplicit()) {
                return new RepresentationHolder(j, representation2, this.chunkExtractor, this.segmentNumShift, index2);
            } else {
                long segmentCount = index.getSegmentCount(j4);
                if (segmentCount == 0) {
                    return new RepresentationHolder(j, representation2, this.chunkExtractor, this.segmentNumShift, index2);
                }
                long firstSegmentNum = index.getFirstSegmentNum();
                long timeUs = index.getTimeUs(firstSegmentNum);
                long j5 = (segmentCount + firstSegmentNum) - 1;
                long timeUs2 = index.getTimeUs(j5) + index.getDurationUs(j5, j4);
                long firstSegmentNum2 = index2.getFirstSegmentNum();
                long j6 = firstSegmentNum;
                long timeUs3 = index2.getTimeUs(firstSegmentNum2);
                long j7 = this.segmentNumShift;
                if (timeUs2 == timeUs3) {
                    j2 = j7 + ((j5 + 1) - firstSegmentNum2);
                    long j8 = j;
                } else if (timeUs2 >= timeUs3) {
                    if (timeUs3 < timeUs) {
                        j3 = j7 - (index2.getSegmentNum(timeUs, j) - j6);
                    } else {
                        j3 = j7 + (index.getSegmentNum(timeUs3, j) - firstSegmentNum2);
                    }
                    j2 = j3;
                } else {
                    throw new BehindLiveWindowException();
                }
                return new RepresentationHolder(j, representation2, this.chunkExtractor, j2, index2);
            }
        }

        /* access modifiers changed from: package-private */
        public RepresentationHolder copyWithNewSegmentIndex(DashSegmentIndex dashSegmentIndex) {
            return new RepresentationHolder(this.periodDurationUs, this.representation, this.chunkExtractor, this.segmentNumShift, dashSegmentIndex);
        }

        public long getFirstAvailableSegmentNum(long j) {
            return this.segmentIndex.getFirstAvailableSegmentNum(this.periodDurationUs, j) + this.segmentNumShift;
        }

        public long getFirstSegmentNum() {
            return this.segmentIndex.getFirstSegmentNum() + this.segmentNumShift;
        }

        public long getLastAvailableSegmentNum(long j) {
            return (getFirstAvailableSegmentNum(j) + this.segmentIndex.getAvailableSegmentCount(this.periodDurationUs, j)) - 1;
        }

        public long getSegmentCount() {
            return this.segmentIndex.getSegmentCount(this.periodDurationUs);
        }

        public long getSegmentEndTimeUs(long j) {
            return getSegmentStartTimeUs(j) + this.segmentIndex.getDurationUs(j - this.segmentNumShift, this.periodDurationUs);
        }

        public long getSegmentNum(long j) {
            return this.segmentIndex.getSegmentNum(j, this.periodDurationUs) + this.segmentNumShift;
        }

        public long getSegmentStartTimeUs(long j) {
            return this.segmentIndex.getTimeUs(j - this.segmentNumShift);
        }

        public RangedUri getSegmentUrl(long j) {
            return this.segmentIndex.getSegmentUrl(j - this.segmentNumShift);
        }

        public boolean isSegmentAvailableAtFullNetworkSpeed(long j, long j2) {
            if (!this.segmentIndex.isExplicit() && j2 != C6540C.TIME_UNSET && getSegmentEndTimeUs(j) > j2) {
                return false;
            }
            return true;
        }
    }

    protected static final class RepresentationSegmentIterator extends BaseMediaChunkIterator {
        private final long nowPeriodTimeUs;
        private final RepresentationHolder representationHolder;

        public RepresentationSegmentIterator(RepresentationHolder representationHolder2, long j, long j2, long j3) {
            super(j, j2);
            this.representationHolder = representationHolder2;
            this.nowPeriodTimeUs = j3;
        }

        public long getChunkEndTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentEndTimeUs(getCurrentIndex());
        }

        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentStartTimeUs(getCurrentIndex());
        }

        public DataSpec getDataSpec() {
            checkInBounds();
            long currentIndex = getCurrentIndex();
            return DashUtil.buildDataSpec(this.representationHolder.representation, this.representationHolder.getSegmentUrl(currentIndex), this.representationHolder.isSegmentAvailableAtFullNetworkSpeed(currentIndex, this.nowPeriodTimeUs) ? 0 : 8);
        }
    }

    public DefaultDashChunkSource(ChunkExtractor.Factory factory, LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, int i, int[] iArr, ExoTrackSelection exoTrackSelection, int i2, DataSource dataSource2, long j, int i3, boolean z, List<Format> list, PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler2) {
        ExoTrackSelection exoTrackSelection2 = exoTrackSelection;
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.manifest = dashManifest;
        this.adaptationSetIndices = iArr;
        this.trackSelection = exoTrackSelection2;
        this.trackType = i2;
        this.dataSource = dataSource2;
        this.periodIndex = i;
        this.elapsedRealtimeOffsetMs = j;
        this.maxSegmentsPerLoad = i3;
        this.playerTrackEmsgHandler = playerTrackEmsgHandler2;
        long periodDurationUs = dashManifest.getPeriodDurationUs(i);
        ArrayList<Representation> representations = getRepresentations();
        this.representationHolders = new RepresentationHolder[exoTrackSelection.length()];
        int i4 = 0;
        while (i4 < this.representationHolders.length) {
            Representation representation = representations.get(exoTrackSelection2.getIndexInTrackGroup(i4));
            RepresentationHolder[] representationHolderArr = this.representationHolders;
            int i5 = i4;
            representationHolderArr[i5] = new RepresentationHolder(periodDurationUs, representation, BundledChunkExtractor.FACTORY.createProgressiveMediaExtractor(i2, representation.format, z, list, playerTrackEmsgHandler2), 0, representation.getIndex());
            i4 = i5 + 1;
            representations = representations;
        }
    }

    private long getAvailableLiveDurationUs(long j, long j2) {
        if (!this.manifest.dynamic) {
            return C6540C.TIME_UNSET;
        }
        return Math.max(0, Math.min(getNowPeriodTimeUs(j), this.representationHolders[0].getSegmentEndTimeUs(this.representationHolders[0].getLastAvailableSegmentNum(j))) - j2);
    }

    private long getNowPeriodTimeUs(long j) {
        DashManifest dashManifest = this.manifest;
        long j2 = dashManifest.availabilityStartTimeMs;
        if (j2 == C6540C.TIME_UNSET) {
            return C6540C.TIME_UNSET;
        }
        return j - C6540C.msToUs(j2 + dashManifest.getPeriod(this.periodIndex).startMs);
    }

    private ArrayList<Representation> getRepresentations() {
        List<AdaptationSet> list = this.manifest.getPeriod(this.periodIndex).adaptationSets;
        ArrayList<Representation> arrayList = new ArrayList<>();
        for (int i : this.adaptationSetIndices) {
            arrayList.addAll(list.get(i).representations);
        }
        return arrayList;
    }

    private long getSegmentNum(RepresentationHolder representationHolder, MediaChunk mediaChunk, long j, long j2, long j3) {
        if (mediaChunk != null) {
            return mediaChunk.getNextChunkIndex();
        }
        return Util.constrainValue(representationHolder.getSegmentNum(j), j2, j3);
    }

    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        long j2 = j;
        for (RepresentationHolder representationHolder : this.representationHolders) {
            if (representationHolder.segmentIndex != null) {
                long segmentNum = representationHolder.getSegmentNum(j2);
                long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(segmentNum);
                long segmentCount = representationHolder.getSegmentCount();
                return seekParameters.resolveSeekPositionUs(j, segmentStartTimeUs, (segmentStartTimeUs >= j2 || (segmentCount != -1 && segmentNum >= (representationHolder.getFirstSegmentNum() + segmentCount) - 1)) ? segmentStartTimeUs : representationHolder.getSegmentStartTimeUs(segmentNum + 1));
            }
        }
        return j2;
    }

    public void getNextChunk(long j, long j2, List<? extends MediaChunk> list, ChunkHolder chunkHolder) {
        MediaChunk mediaChunk;
        int i;
        MediaChunkIterator[] mediaChunkIteratorArr;
        int i2;
        long j3;
        DefaultDashChunkSource defaultDashChunkSource = this;
        long j4 = j;
        ChunkHolder chunkHolder2 = chunkHolder;
        if (defaultDashChunkSource.fatalError == null) {
            long j5 = j2 - j4;
            long msToUs = C6540C.msToUs(defaultDashChunkSource.manifest.availabilityStartTimeMs) + C6540C.msToUs(defaultDashChunkSource.manifest.getPeriod(defaultDashChunkSource.periodIndex).startMs) + j2;
            PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler2 = defaultDashChunkSource.playerTrackEmsgHandler;
            if (playerTrackEmsgHandler2 == null || !playerTrackEmsgHandler2.maybeRefreshManifestBeforeLoadingNextChunk(msToUs)) {
                long msToUs2 = C6540C.msToUs(Util.getNowUnixTimeMs(defaultDashChunkSource.elapsedRealtimeOffsetMs));
                long nowPeriodTimeUs = defaultDashChunkSource.getNowPeriodTimeUs(msToUs2);
                if (list.isEmpty()) {
                    List<? extends MediaChunk> list2 = list;
                    mediaChunk = null;
                } else {
                    mediaChunk = (MediaChunk) list.get(list.size() - 1);
                }
                int length = defaultDashChunkSource.trackSelection.length();
                MediaChunkIterator[] mediaChunkIteratorArr2 = new MediaChunkIterator[length];
                int i3 = 0;
                while (i3 < length) {
                    RepresentationHolder representationHolder = defaultDashChunkSource.representationHolders[i3];
                    if (representationHolder.segmentIndex == null) {
                        mediaChunkIteratorArr2[i3] = MediaChunkIterator.EMPTY;
                        i2 = i3;
                        i = length;
                        mediaChunkIteratorArr = mediaChunkIteratorArr2;
                        j3 = msToUs2;
                    } else {
                        long firstAvailableSegmentNum = representationHolder.getFirstAvailableSegmentNum(msToUs2);
                        long lastAvailableSegmentNum = representationHolder.getLastAvailableSegmentNum(msToUs2);
                        RepresentationHolder representationHolder2 = representationHolder;
                        i2 = i3;
                        i = length;
                        mediaChunkIteratorArr = mediaChunkIteratorArr2;
                        j3 = msToUs2;
                        long segmentNum = getSegmentNum(representationHolder, mediaChunk, j2, firstAvailableSegmentNum, lastAvailableSegmentNum);
                        if (segmentNum < firstAvailableSegmentNum) {
                            mediaChunkIteratorArr[i2] = MediaChunkIterator.EMPTY;
                        } else {
                            mediaChunkIteratorArr[i2] = new RepresentationSegmentIterator(representationHolder2, segmentNum, lastAvailableSegmentNum, nowPeriodTimeUs);
                        }
                    }
                    i3 = i2 + 1;
                    List<? extends MediaChunk> list3 = list;
                    msToUs2 = j3;
                    mediaChunkIteratorArr2 = mediaChunkIteratorArr;
                    length = i;
                    defaultDashChunkSource = this;
                }
                long availableLiveDurationUs = defaultDashChunkSource.getAvailableLiveDurationUs(msToUs2, j4);
                long j6 = msToUs2;
                defaultDashChunkSource.trackSelection.updateSelectedTrack(j, j5, availableLiveDurationUs, list, mediaChunkIteratorArr2);
                RepresentationHolder representationHolder3 = defaultDashChunkSource.representationHolders[defaultDashChunkSource.trackSelection.getSelectedIndex()];
                ChunkExtractor chunkExtractor = representationHolder3.chunkExtractor;
                if (chunkExtractor != null) {
                    Representation representation = representationHolder3.representation;
                    RangedUri initializationUri = chunkExtractor.getSampleFormats() == null ? representation.getInitializationUri() : null;
                    RangedUri indexUri = representationHolder3.segmentIndex == null ? representation.getIndexUri() : null;
                    if (!(initializationUri == null && indexUri == null)) {
                        chunkHolder2.chunk = newInitializationChunk(representationHolder3, defaultDashChunkSource.dataSource, defaultDashChunkSource.trackSelection.getSelectedFormat(), defaultDashChunkSource.trackSelection.getSelectionReason(), defaultDashChunkSource.trackSelection.getSelectionData(), initializationUri, indexUri);
                        return;
                    }
                }
                long access$000 = representationHolder3.periodDurationUs;
                long j7 = C6540C.TIME_UNSET;
                boolean z = access$000 != C6540C.TIME_UNSET;
                if (representationHolder3.getSegmentCount() == 0) {
                    chunkHolder2.endOfStream = z;
                    return;
                }
                long firstAvailableSegmentNum2 = representationHolder3.getFirstAvailableSegmentNum(j6);
                long lastAvailableSegmentNum2 = representationHolder3.getLastAvailableSegmentNum(j6);
                boolean z2 = z;
                long segmentNum2 = getSegmentNum(representationHolder3, mediaChunk, j2, firstAvailableSegmentNum2, lastAvailableSegmentNum2);
                if (segmentNum2 < firstAvailableSegmentNum2) {
                    defaultDashChunkSource.fatalError = new BehindLiveWindowException();
                } else if (segmentNum2 > lastAvailableSegmentNum2 || (defaultDashChunkSource.missingLastSegment && segmentNum2 >= lastAvailableSegmentNum2)) {
                    chunkHolder.endOfStream = z2;
                } else if (!z2 || representationHolder3.getSegmentStartTimeUs(segmentNum2) < access$000) {
                    ChunkHolder chunkHolder3 = chunkHolder;
                    int min = (int) Math.min((long) defaultDashChunkSource.maxSegmentsPerLoad, (lastAvailableSegmentNum2 - segmentNum2) + 1);
                    if (access$000 != C6540C.TIME_UNSET) {
                        while (min > 1 && representationHolder3.getSegmentStartTimeUs((((long) min) + segmentNum2) - 1) >= access$000) {
                            min--;
                        }
                    }
                    int i4 = min;
                    if (list.isEmpty()) {
                        j7 = j2;
                    }
                    chunkHolder3.chunk = newMediaChunk(representationHolder3, defaultDashChunkSource.dataSource, defaultDashChunkSource.trackType, defaultDashChunkSource.trackSelection.getSelectedFormat(), defaultDashChunkSource.trackSelection.getSelectionReason(), defaultDashChunkSource.trackSelection.getSelectionData(), segmentNum2, i4, j7, nowPeriodTimeUs);
                } else {
                    chunkHolder.endOfStream = true;
                }
            }
        }
    }

    public int getPreferredQueueSize(long j, List<? extends MediaChunk> list) {
        if (this.fatalError != null || this.trackSelection.length() < 2) {
            return list.size();
        }
        return this.trackSelection.evaluateQueueSize(j, list);
    }

    public void maybeThrowError() throws IOException {
        IOException iOException = this.fatalError;
        if (iOException == null) {
            this.manifestLoaderErrorThrower.maybeThrowError();
            return;
        }
        throw iOException;
    }

    /* access modifiers changed from: protected */
    public Chunk newInitializationChunk(RepresentationHolder representationHolder, DataSource dataSource2, Format format, int i, Object obj, RangedUri rangedUri, RangedUri rangedUri2) {
        Representation representation = representationHolder.representation;
        if (rangedUri == null || (rangedUri2 = rangedUri.attemptMerge(rangedUri2, representation.baseUrl)) != null) {
            rangedUri = rangedUri2;
        }
        return new InitializationChunk(dataSource2, DashUtil.buildDataSpec(representation, rangedUri, 0), format, i, obj, representationHolder.chunkExtractor);
    }

    /* access modifiers changed from: protected */
    public Chunk newMediaChunk(RepresentationHolder representationHolder, DataSource dataSource2, int i, Format format, int i2, Object obj, long j, int i3, long j2, long j3) {
        RepresentationHolder representationHolder2 = representationHolder;
        long j4 = j;
        long j5 = j3;
        Representation representation = representationHolder2.representation;
        long segmentStartTimeUs = representationHolder2.getSegmentStartTimeUs(j4);
        RangedUri segmentUrl = representationHolder2.getSegmentUrl(j4);
        String str = representation.baseUrl;
        if (representationHolder2.chunkExtractor == null) {
            return new SingleSampleMediaChunk(dataSource2, DashUtil.buildDataSpec(representation, segmentUrl, representationHolder2.isSegmentAvailableAtFullNetworkSpeed(j4, j5) ? 0 : 8), format, i2, obj, segmentStartTimeUs, representationHolder2.getSegmentEndTimeUs(j4), j, i, format);
        }
        int i4 = 1;
        int i5 = i3;
        int i6 = 1;
        while (i4 < i5) {
            RangedUri attemptMerge = segmentUrl.attemptMerge(representationHolder2.getSegmentUrl(((long) i4) + j4), str);
            if (attemptMerge == null) {
                break;
            }
            i6++;
            i4++;
            segmentUrl = attemptMerge;
        }
        long j6 = (((long) i6) + j4) - 1;
        long segmentEndTimeUs = representationHolder2.getSegmentEndTimeUs(j6);
        long access$000 = representationHolder.periodDurationUs;
        return new ContainerMediaChunk(dataSource2, DashUtil.buildDataSpec(representation, segmentUrl, representationHolder2.isSegmentAvailableAtFullNetworkSpeed(j6, j5) ? 0 : 8), format, i2, obj, segmentStartTimeUs, segmentEndTimeUs, j2, (access$000 == C6540C.TIME_UNSET || access$000 > segmentEndTimeUs) ? -9223372036854775807L : access$000, j, i6, -representation.presentationTimeOffsetUs, representationHolder2.chunkExtractor);
    }

    public void onChunkLoadCompleted(Chunk chunk) {
        ChunkIndex chunkIndex;
        if (chunk instanceof InitializationChunk) {
            int indexOf = this.trackSelection.indexOf(((InitializationChunk) chunk).trackFormat);
            RepresentationHolder representationHolder = this.representationHolders[indexOf];
            if (representationHolder.segmentIndex == null && (chunkIndex = representationHolder.chunkExtractor.getChunkIndex()) != null) {
                this.representationHolders[indexOf] = representationHolder.copyWithNewSegmentIndex(new DashWrappingSegmentIndex(chunkIndex, representationHolder.representation.presentationTimeOffsetUs));
            }
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler2 = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler2 != null) {
            playerTrackEmsgHandler2.onChunkLoadCompleted(chunk);
        }
    }

    public boolean onChunkLoadError(Chunk chunk, boolean z, Exception exc, long j) {
        if (!z) {
            return false;
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler2 = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler2 != null && playerTrackEmsgHandler2.onChunkLoadError(chunk)) {
            return true;
        }
        if (!this.manifest.dynamic && (chunk instanceof MediaChunk) && (exc instanceof HttpDataSource.InvalidResponseCodeException) && ((HttpDataSource.InvalidResponseCodeException) exc).responseCode == 404) {
            RepresentationHolder representationHolder = this.representationHolders[this.trackSelection.indexOf(chunk.trackFormat)];
            long segmentCount = representationHolder.getSegmentCount();
            if (!(segmentCount == -1 || segmentCount == 0)) {
                if (((MediaChunk) chunk).getNextChunkIndex() > (representationHolder.getFirstSegmentNum() + segmentCount) - 1) {
                    this.missingLastSegment = true;
                    return true;
                }
            }
        }
        if (j == C6540C.TIME_UNSET) {
            return false;
        }
        ExoTrackSelection exoTrackSelection = this.trackSelection;
        if (exoTrackSelection.blacklist(exoTrackSelection.indexOf(chunk.trackFormat), j)) {
            return true;
        }
        return false;
    }

    public void release() {
        for (RepresentationHolder representationHolder : this.representationHolders) {
            ChunkExtractor chunkExtractor = representationHolder.chunkExtractor;
            if (chunkExtractor != null) {
                chunkExtractor.release();
            }
        }
    }

    public boolean shouldCancelLoad(long j, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.fatalError != null) {
            return false;
        }
        return this.trackSelection.shouldCancelChunkLoad(j, chunk, list);
    }

    public void updateManifest(DashManifest dashManifest, int i) {
        try {
            this.manifest = dashManifest;
            this.periodIndex = i;
            long periodDurationUs = dashManifest.getPeriodDurationUs(i);
            ArrayList<Representation> representations = getRepresentations();
            for (int i2 = 0; i2 < this.representationHolders.length; i2++) {
                RepresentationHolder[] representationHolderArr = this.representationHolders;
                representationHolderArr[i2] = representationHolderArr[i2].copyWithNewRepresentation(periodDurationUs, representations.get(this.trackSelection.getIndexInTrackGroup(i2)));
            }
        } catch (BehindLiveWindowException e) {
            this.fatalError = e;
        }
    }

    public void updateTrackSelection(ExoTrackSelection exoTrackSelection) {
        this.trackSelection = exoTrackSelection;
    }
}
