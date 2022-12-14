package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.C4706d0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class DefaultHlsPlaylistTracker implements HlsPlaylistTracker, Loader.Callback<ParsingLoadable<HlsPlaylist>> {
    public static final double DEFAULT_PLAYLIST_STUCK_TARGET_DURATION_COEFFICIENT = 3.5d;
    public static final HlsPlaylistTracker.Factory FACTORY = C6865a.f27552a;
    /* access modifiers changed from: private */
    public final HlsDataSourceFactory dataSourceFactory;
    /* access modifiers changed from: private */
    public MediaSourceEventListener.EventDispatcher eventDispatcher;
    private Loader initialPlaylistLoader;
    private long initialStartTimeUs;
    private boolean isLive;
    private final List<HlsPlaylistTracker.PlaylistEventListener> listeners;
    /* access modifiers changed from: private */
    public final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    /* access modifiers changed from: private */
    public HlsMasterPlaylist masterPlaylist;
    private final HashMap<Uri, MediaPlaylistBundle> playlistBundles;
    /* access modifiers changed from: private */
    public final HlsPlaylistParserFactory playlistParserFactory;
    /* access modifiers changed from: private */
    public Handler playlistRefreshHandler;
    /* access modifiers changed from: private */
    public final double playlistStuckTargetDurationCoefficient;
    private HlsMediaPlaylist primaryMediaPlaylistSnapshot;
    /* access modifiers changed from: private */
    public Uri primaryMediaPlaylistUrl;
    private HlsPlaylistTracker.PrimaryPlaylistListener primaryPlaylistListener;

    private final class MediaPlaylistBundle implements Loader.Callback<ParsingLoadable<HlsPlaylist>> {
        private static final String BLOCK_MSN_PARAM = "_HLS_msn";
        private static final String BLOCK_PART_PARAM = "_HLS_part";
        private static final String SKIP_PARAM = "_HLS_skip";
        private long earliestNextLoadTimeMs;
        /* access modifiers changed from: private */
        public long excludeUntilMs;
        private long lastSnapshotChangeMs;
        private long lastSnapshotLoadMs;
        private boolean loadPending;
        private final DataSource mediaPlaylistDataSource;
        private final Loader mediaPlaylistLoader = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");
        private IOException playlistError;
        private HlsMediaPlaylist playlistSnapshot;
        /* access modifiers changed from: private */
        public final Uri playlistUrl;

        public MediaPlaylistBundle(Uri uri) {
            this.playlistUrl = uri;
            this.mediaPlaylistDataSource = DefaultHlsPlaylistTracker.this.dataSourceFactory.createDataSource(4);
        }

        private boolean excludePlaylist(long j) {
            this.excludeUntilMs = SystemClock.elapsedRealtime() + j;
            return this.playlistUrl.equals(DefaultHlsPlaylistTracker.this.primaryMediaPlaylistUrl) && !DefaultHlsPlaylistTracker.this.maybeSelectNewPrimaryUrl();
        }

        private Uri getMediaPlaylistUriForReload() {
            HlsMediaPlaylist hlsMediaPlaylist = this.playlistSnapshot;
            if (hlsMediaPlaylist != null) {
                HlsMediaPlaylist.ServerControl serverControl = hlsMediaPlaylist.serverControl;
                if (serverControl.skipUntilUs != C6540C.TIME_UNSET || serverControl.canBlockReload) {
                    Uri.Builder buildUpon = this.playlistUrl.buildUpon();
                    HlsMediaPlaylist hlsMediaPlaylist2 = this.playlistSnapshot;
                    if (hlsMediaPlaylist2.serverControl.canBlockReload) {
                        buildUpon.appendQueryParameter(BLOCK_MSN_PARAM, String.valueOf(hlsMediaPlaylist2.mediaSequence + ((long) hlsMediaPlaylist2.segments.size())));
                        HlsMediaPlaylist hlsMediaPlaylist3 = this.playlistSnapshot;
                        if (hlsMediaPlaylist3.partTargetDurationUs != C6540C.TIME_UNSET) {
                            List<HlsMediaPlaylist.Part> list = hlsMediaPlaylist3.trailingParts;
                            int size = list.size();
                            if (!list.isEmpty() && ((HlsMediaPlaylist.Part) C4706d0.m21756c(list)).isPreload) {
                                size--;
                            }
                            buildUpon.appendQueryParameter(BLOCK_PART_PARAM, String.valueOf(size));
                        }
                    }
                    HlsMediaPlaylist.ServerControl serverControl2 = this.playlistSnapshot.serverControl;
                    if (serverControl2.skipUntilUs != C6540C.TIME_UNSET) {
                        buildUpon.appendQueryParameter(SKIP_PARAM, serverControl2.canSkipDateRanges ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.playlistUrl;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$loadPlaylistInternal$0(Uri uri) {
            this.loadPending = false;
            loadPlaylistImmediately(uri);
        }

        private void loadPlaylistImmediately(Uri uri) {
            ParsingLoadable parsingLoadable = new ParsingLoadable(this.mediaPlaylistDataSource, uri, 4, DefaultHlsPlaylistTracker.this.playlistParserFactory.createPlaylistParser(DefaultHlsPlaylistTracker.this.masterPlaylist, this.playlistSnapshot));
            DefaultHlsPlaylistTracker.this.eventDispatcher.loadStarted(new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, this.mediaPlaylistLoader.startLoading(parsingLoadable, this, DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(parsingLoadable.type))), parsingLoadable.type);
        }

        /* access modifiers changed from: private */
        public void loadPlaylistInternal(Uri uri) {
            this.excludeUntilMs = 0;
            if (!this.loadPending && !this.mediaPlaylistLoader.isLoading() && !this.mediaPlaylistLoader.hasFatalError()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < this.earliestNextLoadTimeMs) {
                    this.loadPending = true;
                    DefaultHlsPlaylistTracker.this.playlistRefreshHandler.postDelayed(new C6866b(this, uri), this.earliestNextLoadTimeMs - elapsedRealtime);
                    return;
                }
                loadPlaylistImmediately(uri);
            }
        }

        /* access modifiers changed from: private */
        public void processLoadedPlaylist(HlsMediaPlaylist hlsMediaPlaylist, LoadEventInfo loadEventInfo) {
            HlsMediaPlaylist hlsMediaPlaylist2 = this.playlistSnapshot;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.lastSnapshotLoadMs = elapsedRealtime;
            HlsMediaPlaylist access$1100 = DefaultHlsPlaylistTracker.this.getLatestPlaylistSnapshot(hlsMediaPlaylist2, hlsMediaPlaylist);
            this.playlistSnapshot = access$1100;
            boolean z = true;
            if (access$1100 != hlsMediaPlaylist2) {
                this.playlistError = null;
                this.lastSnapshotChangeMs = elapsedRealtime;
                DefaultHlsPlaylistTracker.this.onPlaylistUpdated(this.playlistUrl, access$1100);
            } else if (!access$1100.hasEndTag) {
                HlsMediaPlaylist hlsMediaPlaylist3 = this.playlistSnapshot;
                if (hlsMediaPlaylist.mediaSequence + ((long) hlsMediaPlaylist.segments.size()) < hlsMediaPlaylist3.mediaSequence) {
                    this.playlistError = new HlsPlaylistTracker.PlaylistResetException(this.playlistUrl);
                    boolean unused = DefaultHlsPlaylistTracker.this.notifyPlaylistError(this.playlistUrl, C6540C.TIME_UNSET);
                } else {
                    double usToMs = (double) C6540C.usToMs(hlsMediaPlaylist3.targetDurationUs);
                    double access$1300 = DefaultHlsPlaylistTracker.this.playlistStuckTargetDurationCoefficient;
                    Double.isNaN(usToMs);
                    if (((double) (elapsedRealtime - this.lastSnapshotChangeMs)) > usToMs * access$1300) {
                        this.playlistError = new HlsPlaylistTracker.PlaylistStuckException(this.playlistUrl);
                        long blacklistDurationMsFor = DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.getBlacklistDurationMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(4), this.playlistError, 1));
                        boolean unused2 = DefaultHlsPlaylistTracker.this.notifyPlaylistError(this.playlistUrl, blacklistDurationMsFor);
                        if (blacklistDurationMsFor != C6540C.TIME_UNSET) {
                            excludePlaylist(blacklistDurationMsFor);
                        }
                    }
                }
            }
            long j = 0;
            HlsMediaPlaylist hlsMediaPlaylist4 = this.playlistSnapshot;
            if (!hlsMediaPlaylist4.serverControl.canBlockReload) {
                if (hlsMediaPlaylist4 != hlsMediaPlaylist2) {
                    j = hlsMediaPlaylist4.targetDurationUs;
                } else {
                    j = hlsMediaPlaylist4.targetDurationUs / 2;
                }
            }
            this.earliestNextLoadTimeMs = elapsedRealtime + C6540C.usToMs(j);
            if (this.playlistSnapshot.partTargetDurationUs == C6540C.TIME_UNSET && !this.playlistUrl.equals(DefaultHlsPlaylistTracker.this.primaryMediaPlaylistUrl)) {
                z = false;
            }
            if (z && !this.playlistSnapshot.hasEndTag) {
                loadPlaylistInternal(getMediaPlaylistUriForReload());
            }
        }

        public HlsMediaPlaylist getPlaylistSnapshot() {
            return this.playlistSnapshot;
        }

        public boolean isSnapshotValid() {
            int i;
            if (this.playlistSnapshot == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000, C6540C.usToMs(this.playlistSnapshot.durationUs));
            HlsMediaPlaylist hlsMediaPlaylist = this.playlistSnapshot;
            if (hlsMediaPlaylist.hasEndTag || (i = hlsMediaPlaylist.playlistType) == 2 || i == 1 || this.lastSnapshotLoadMs + max > elapsedRealtime) {
                return true;
            }
            return false;
        }

        public void loadPlaylist() {
            loadPlaylistInternal(this.playlistUrl);
        }

        public void maybeThrowPlaylistRefreshError() throws IOException {
            this.mediaPlaylistLoader.maybeThrowError();
            IOException iOException = this.playlistError;
            if (iOException != null) {
                throw iOException;
            }
        }

        public void release() {
            this.mediaPlaylistLoader.release();
        }

        public void onLoadCanceled(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, boolean z) {
            ParsingLoadable<HlsPlaylist> parsingLoadable2 = parsingLoadable;
            LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable2.loadTaskId, parsingLoadable2.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
            DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable2.loadTaskId);
            DefaultHlsPlaylistTracker.this.eventDispatcher.loadCanceled(loadEventInfo, 4);
        }

        public void onLoadCompleted(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2) {
            ParsingLoadable<HlsPlaylist> parsingLoadable2 = parsingLoadable;
            HlsPlaylist result = parsingLoadable.getResult();
            LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable2.loadTaskId, parsingLoadable2.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
            if (result instanceof HlsMediaPlaylist) {
                processLoadedPlaylist((HlsMediaPlaylist) result, loadEventInfo);
                DefaultHlsPlaylistTracker.this.eventDispatcher.loadCompleted(loadEventInfo, 4);
            } else {
                this.playlistError = new ParserException("Loaded playlist has unexpected type.");
                DefaultHlsPlaylistTracker.this.eventDispatcher.loadError(loadEventInfo, 4, this.playlistError, true);
            }
            DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable2.loadTaskId);
        }

        public Loader.LoadErrorAction onLoadError(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, IOException iOException, int i) {
            Loader.LoadErrorAction loadErrorAction;
            ParsingLoadable<HlsPlaylist> parsingLoadable2 = parsingLoadable;
            IOException iOException2 = iOException;
            LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable2.loadTaskId, parsingLoadable2.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
            boolean z = iOException2 instanceof HlsPlaylistParser.DeltaUpdateException;
            if ((parsingLoadable.getUri().getQueryParameter(BLOCK_MSN_PARAM) != null) || z) {
                int i2 = Integer.MAX_VALUE;
                if (iOException2 instanceof HttpDataSource.InvalidResponseCodeException) {
                    i2 = ((HttpDataSource.InvalidResponseCodeException) iOException2).responseCode;
                }
                if (z || i2 == 400 || i2 == 503) {
                    this.earliestNextLoadTimeMs = SystemClock.elapsedRealtime();
                    loadPlaylist();
                    ((MediaSourceEventListener.EventDispatcher) Util.castNonNull(DefaultHlsPlaylistTracker.this.eventDispatcher)).loadError(loadEventInfo, parsingLoadable2.type, iOException2, true);
                    return Loader.DONT_RETRY;
                }
            }
            LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(parsingLoadable2.type), iOException2, i);
            long blacklistDurationMsFor = DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.getBlacklistDurationMsFor(loadErrorInfo);
            boolean z2 = blacklistDurationMsFor != C6540C.TIME_UNSET;
            boolean z3 = DefaultHlsPlaylistTracker.this.notifyPlaylistError(this.playlistUrl, blacklistDurationMsFor) || !z2;
            if (z2) {
                z3 |= excludePlaylist(blacklistDurationMsFor);
            }
            if (z3) {
                long retryDelayMsFor = DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.getRetryDelayMsFor(loadErrorInfo);
                if (retryDelayMsFor != C6540C.TIME_UNSET) {
                    loadErrorAction = Loader.createRetryAction(false, retryDelayMsFor);
                } else {
                    loadErrorAction = Loader.DONT_RETRY_FATAL;
                }
            } else {
                loadErrorAction = Loader.DONT_RETRY;
            }
            boolean z4 = !loadErrorAction.isRetry();
            DefaultHlsPlaylistTracker.this.eventDispatcher.loadError(loadEventInfo, parsingLoadable2.type, iOException2, z4);
            if (z4) {
                DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable2.loadTaskId);
            }
            return loadErrorAction;
        }
    }

    public DefaultHlsPlaylistTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy2, HlsPlaylistParserFactory hlsPlaylistParserFactory) {
        this(hlsDataSourceFactory, loadErrorHandlingPolicy2, hlsPlaylistParserFactory, 3.5d);
    }

    private void createBundles(List<Uri> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = list.get(i);
            this.playlistBundles.put(uri, new MediaPlaylistBundle(uri));
        }
    }

    private static HlsMediaPlaylist.Segment getFirstOldOverlappingSegment(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        int i = (int) (hlsMediaPlaylist2.mediaSequence - hlsMediaPlaylist.mediaSequence);
        List<HlsMediaPlaylist.Segment> list = hlsMediaPlaylist.segments;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public HlsMediaPlaylist getLatestPlaylistSnapshot(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        if (!hlsMediaPlaylist2.isNewerThan(hlsMediaPlaylist)) {
            return hlsMediaPlaylist2.hasEndTag ? hlsMediaPlaylist.copyWithEndTag() : hlsMediaPlaylist;
        }
        return hlsMediaPlaylist2.copyWith(getLoadedPlaylistStartTimeUs(hlsMediaPlaylist, hlsMediaPlaylist2), getLoadedPlaylistDiscontinuitySequence(hlsMediaPlaylist, hlsMediaPlaylist2));
    }

    private int getLoadedPlaylistDiscontinuitySequence(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        HlsMediaPlaylist.Segment firstOldOverlappingSegment;
        if (hlsMediaPlaylist2.hasDiscontinuitySequence) {
            return hlsMediaPlaylist2.discontinuitySequence;
        }
        HlsMediaPlaylist hlsMediaPlaylist3 = this.primaryMediaPlaylistSnapshot;
        int i = hlsMediaPlaylist3 != null ? hlsMediaPlaylist3.discontinuitySequence : 0;
        return (hlsMediaPlaylist == null || (firstOldOverlappingSegment = getFirstOldOverlappingSegment(hlsMediaPlaylist, hlsMediaPlaylist2)) == null) ? i : (hlsMediaPlaylist.discontinuitySequence + firstOldOverlappingSegment.relativeDiscontinuitySequence) - hlsMediaPlaylist2.segments.get(0).relativeDiscontinuitySequence;
    }

    private long getLoadedPlaylistStartTimeUs(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        if (hlsMediaPlaylist2.hasProgramDateTime) {
            return hlsMediaPlaylist2.startTimeUs;
        }
        HlsMediaPlaylist hlsMediaPlaylist3 = this.primaryMediaPlaylistSnapshot;
        long j = hlsMediaPlaylist3 != null ? hlsMediaPlaylist3.startTimeUs : 0;
        if (hlsMediaPlaylist == null) {
            return j;
        }
        int size = hlsMediaPlaylist.segments.size();
        HlsMediaPlaylist.Segment firstOldOverlappingSegment = getFirstOldOverlappingSegment(hlsMediaPlaylist, hlsMediaPlaylist2);
        if (firstOldOverlappingSegment != null) {
            return hlsMediaPlaylist.startTimeUs + firstOldOverlappingSegment.relativeStartTimeUs;
        }
        return ((long) size) == hlsMediaPlaylist2.mediaSequence - hlsMediaPlaylist.mediaSequence ? hlsMediaPlaylist.getEndTimeUs() : j;
    }

    private Uri getRequestUriForPrimaryChange(Uri uri) {
        HlsMediaPlaylist.RenditionReport renditionReport;
        HlsMediaPlaylist hlsMediaPlaylist = this.primaryMediaPlaylistSnapshot;
        if (hlsMediaPlaylist == null || !hlsMediaPlaylist.serverControl.canBlockReload || (renditionReport = hlsMediaPlaylist.renditionReports.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(renditionReport.lastMediaSequence));
        int i = renditionReport.lastPartIndex;
        if (i != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return buildUpon.build();
    }

    private boolean isVariantUrl(Uri uri) {
        List<HlsMasterPlaylist.Variant> list = this.masterPlaylist.variants;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(list.get(i).url)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public boolean maybeSelectNewPrimaryUrl() {
        List<HlsMasterPlaylist.Variant> list = this.masterPlaylist.variants;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            MediaPlaylistBundle mediaPlaylistBundle = (MediaPlaylistBundle) Assertions.checkNotNull(this.playlistBundles.get(list.get(i).url));
            if (elapsedRealtime > mediaPlaylistBundle.excludeUntilMs) {
                Uri access$200 = mediaPlaylistBundle.playlistUrl;
                this.primaryMediaPlaylistUrl = access$200;
                mediaPlaylistBundle.loadPlaylistInternal(getRequestUriForPrimaryChange(access$200));
                return true;
            }
        }
        return false;
    }

    private void maybeSetPrimaryUrl(Uri uri) {
        if (!uri.equals(this.primaryMediaPlaylistUrl) && isVariantUrl(uri)) {
            HlsMediaPlaylist hlsMediaPlaylist = this.primaryMediaPlaylistSnapshot;
            if (hlsMediaPlaylist == null || !hlsMediaPlaylist.hasEndTag) {
                this.primaryMediaPlaylistUrl = uri;
                this.playlistBundles.get(uri).loadPlaylistInternal(getRequestUriForPrimaryChange(uri));
            }
        }
    }

    /* access modifiers changed from: private */
    public boolean notifyPlaylistError(Uri uri, long j) {
        int size = this.listeners.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z |= !this.listeners.get(i).onPlaylistError(uri, j);
        }
        return z;
    }

    /* access modifiers changed from: private */
    public void onPlaylistUpdated(Uri uri, HlsMediaPlaylist hlsMediaPlaylist) {
        if (uri.equals(this.primaryMediaPlaylistUrl)) {
            if (this.primaryMediaPlaylistSnapshot == null) {
                this.isLive = !hlsMediaPlaylist.hasEndTag;
                this.initialStartTimeUs = hlsMediaPlaylist.startTimeUs;
            }
            this.primaryMediaPlaylistSnapshot = hlsMediaPlaylist;
            this.primaryPlaylistListener.onPrimaryPlaylistRefreshed(hlsMediaPlaylist);
        }
        int size = this.listeners.size();
        for (int i = 0; i < size; i++) {
            this.listeners.get(i).onPlaylistChanged();
        }
    }

    public void addListener(HlsPlaylistTracker.PlaylistEventListener playlistEventListener) {
        Assertions.checkNotNull(playlistEventListener);
        this.listeners.add(playlistEventListener);
    }

    public long getInitialStartTimeUs() {
        return this.initialStartTimeUs;
    }

    public HlsMasterPlaylist getMasterPlaylist() {
        return this.masterPlaylist;
    }

    public HlsMediaPlaylist getPlaylistSnapshot(Uri uri, boolean z) {
        HlsMediaPlaylist playlistSnapshot = this.playlistBundles.get(uri).getPlaylistSnapshot();
        if (playlistSnapshot != null && z) {
            maybeSetPrimaryUrl(uri);
        }
        return playlistSnapshot;
    }

    public boolean isLive() {
        return this.isLive;
    }

    public boolean isSnapshotValid(Uri uri) {
        return this.playlistBundles.get(uri).isSnapshotValid();
    }

    public void maybeThrowPlaylistRefreshError(Uri uri) throws IOException {
        this.playlistBundles.get(uri).maybeThrowPlaylistRefreshError();
    }

    public void maybeThrowPrimaryPlaylistRefreshError() throws IOException {
        Loader loader = this.initialPlaylistLoader;
        if (loader != null) {
            loader.maybeThrowError();
        }
        Uri uri = this.primaryMediaPlaylistUrl;
        if (uri != null) {
            maybeThrowPlaylistRefreshError(uri);
        }
    }

    public void refreshPlaylist(Uri uri) {
        this.playlistBundles.get(uri).loadPlaylist();
    }

    public void removeListener(HlsPlaylistTracker.PlaylistEventListener playlistEventListener) {
        this.listeners.remove(playlistEventListener);
    }

    public void start(Uri uri, MediaSourceEventListener.EventDispatcher eventDispatcher2, HlsPlaylistTracker.PrimaryPlaylistListener primaryPlaylistListener2) {
        this.playlistRefreshHandler = Util.createHandlerForCurrentLooper();
        this.eventDispatcher = eventDispatcher2;
        this.primaryPlaylistListener = primaryPlaylistListener2;
        ParsingLoadable parsingLoadable = new ParsingLoadable(this.dataSourceFactory.createDataSource(4), uri, 4, this.playlistParserFactory.createPlaylistParser());
        Assertions.checkState(this.initialPlaylistLoader == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.initialPlaylistLoader = loader;
        eventDispatcher2.loadStarted(new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, loader.startLoading(parsingLoadable, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(parsingLoadable.type))), parsingLoadable.type);
    }

    public void stop() {
        this.primaryMediaPlaylistUrl = null;
        this.primaryMediaPlaylistSnapshot = null;
        this.masterPlaylist = null;
        this.initialStartTimeUs = C6540C.TIME_UNSET;
        this.initialPlaylistLoader.release();
        this.initialPlaylistLoader = null;
        for (MediaPlaylistBundle release : this.playlistBundles.values()) {
            release.release();
        }
        this.playlistRefreshHandler.removeCallbacksAndMessages((Object) null);
        this.playlistRefreshHandler = null;
        this.playlistBundles.clear();
    }

    public DefaultHlsPlaylistTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy2, HlsPlaylistParserFactory hlsPlaylistParserFactory, double d) {
        this.dataSourceFactory = hlsDataSourceFactory;
        this.playlistParserFactory = hlsPlaylistParserFactory;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy2;
        this.playlistStuckTargetDurationCoefficient = d;
        this.listeners = new ArrayList();
        this.playlistBundles = new HashMap<>();
        this.initialStartTimeUs = C6540C.TIME_UNSET;
    }

    public void onLoadCanceled(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, boolean z) {
        ParsingLoadable<HlsPlaylist> parsingLoadable2 = parsingLoadable;
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable2.loadTaskId, parsingLoadable2.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable2.loadTaskId);
        this.eventDispatcher.loadCanceled(loadEventInfo, 4);
    }

    public void onLoadCompleted(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2) {
        HlsMasterPlaylist hlsMasterPlaylist;
        ParsingLoadable<HlsPlaylist> parsingLoadable2 = parsingLoadable;
        HlsPlaylist result = parsingLoadable.getResult();
        boolean z = result instanceof HlsMediaPlaylist;
        if (z) {
            hlsMasterPlaylist = HlsMasterPlaylist.createSingleVariantMasterPlaylist(result.baseUri);
        } else {
            hlsMasterPlaylist = (HlsMasterPlaylist) result;
        }
        this.masterPlaylist = hlsMasterPlaylist;
        this.primaryMediaPlaylistUrl = hlsMasterPlaylist.variants.get(0).url;
        createBundles(hlsMasterPlaylist.mediaPlaylistUrls);
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable2.loadTaskId, parsingLoadable2.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
        MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(this.primaryMediaPlaylistUrl);
        if (z) {
            mediaPlaylistBundle.processLoadedPlaylist((HlsMediaPlaylist) result, loadEventInfo);
        } else {
            mediaPlaylistBundle.loadPlaylist();
        }
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable2.loadTaskId);
        this.eventDispatcher.loadCompleted(loadEventInfo, 4);
    }

    public Loader.LoadErrorAction onLoadError(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, IOException iOException, int i) {
        ParsingLoadable<HlsPlaylist> parsingLoadable2 = parsingLoadable;
        IOException iOException2 = iOException;
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable2.loadTaskId, parsingLoadable2.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(parsingLoadable2.type), iOException2, i));
        boolean z = retryDelayMsFor == C6540C.TIME_UNSET;
        this.eventDispatcher.loadError(loadEventInfo, parsingLoadable2.type, iOException2, z);
        if (z) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable2.loadTaskId);
        }
        if (z) {
            return Loader.DONT_RETRY_FATAL;
        }
        return Loader.createRetryAction(false, retryDelayMsFor);
    }
}
