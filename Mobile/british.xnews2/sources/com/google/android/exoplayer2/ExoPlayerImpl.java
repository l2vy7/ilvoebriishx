package com.google.android.exoplayer2;

import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerImplInternal;
import com.google.android.exoplayer2.MediaSourceList;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.collect.C4766t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

final class ExoPlayerImpl extends BasePlayer implements ExoPlayer {
    private static final String TAG = "ExoPlayerImpl";
    private final AnalyticsCollector analyticsCollector;
    private final Looper applicationLooper;
    private final CopyOnWriteArraySet<ExoPlayer.AudioOffloadListener> audioOffloadListeners;
    private Player.Commands availableCommands;
    private final BandwidthMeter bandwidthMeter;
    private final Clock clock;
    final TrackSelectorResult emptyTrackSelectorResult;
    private boolean foregroundMode;
    private final ExoPlayerImplInternal internalPlayer;
    private final ListenerSet<Player.EventListener> listeners;
    private int maskingPeriodIndex;
    private int maskingWindowIndex;
    private long maskingWindowPositionMs;
    private MediaMetadata mediaMetadata;
    private final MediaSourceFactory mediaSourceFactory;
    private final List<MediaSourceHolderSnapshot> mediaSourceHolderSnapshots;
    private boolean pauseAtEndOfMediaItems;
    private boolean pendingDiscontinuity;
    private int pendingDiscontinuityReason;
    private int pendingOperationAcks;
    private int pendingPlayWhenReadyChangeReason;
    private final Timeline.Period period;
    final Player.Commands permanentAvailableCommands;
    private PlaybackInfo playbackInfo;
    private final HandlerWrapper playbackInfoUpdateHandler;
    private final ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private final Renderer[] renderers;
    private int repeatMode;
    private SeekParameters seekParameters;
    private boolean shuffleModeEnabled;
    private ShuffleOrder shuffleOrder;
    private final TrackSelector trackSelector;
    private final boolean useLazyPreparation;

    private static final class MediaSourceHolderSnapshot implements MediaSourceInfoHolder {
        /* access modifiers changed from: private */
        public Timeline timeline;
        private final Object uid;

        public MediaSourceHolderSnapshot(Object obj, Timeline timeline2) {
            this.uid = obj;
            this.timeline = timeline2;
        }

        public Timeline getTimeline() {
            return this.timeline;
        }

        public Object getUid() {
            return this.uid;
        }
    }

    /* JADX WARNING: type inference failed for: r33v0, types: [com.google.android.exoplayer2.Player] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @android.annotation.SuppressLint({"HandlerLeak"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExoPlayerImpl(com.google.android.exoplayer2.Renderer[] r19, com.google.android.exoplayer2.trackselection.TrackSelector r20, com.google.android.exoplayer2.source.MediaSourceFactory r21, com.google.android.exoplayer2.LoadControl r22, com.google.android.exoplayer2.upstream.BandwidthMeter r23, com.google.android.exoplayer2.analytics.AnalyticsCollector r24, boolean r25, com.google.android.exoplayer2.SeekParameters r26, com.google.android.exoplayer2.LivePlaybackSpeedControl r27, long r28, boolean r30, com.google.android.exoplayer2.util.Clock r31, android.os.Looper r32, com.google.android.exoplayer2.Player r33, com.google.android.exoplayer2.Player.Commands r34) {
        /*
            r18 = this;
            r0 = r18
            r2 = r19
            r6 = r23
            r9 = r24
            r15 = r31
            r14 = r32
            r18.<init>()
            int r1 = java.lang.System.identityHashCode(r18)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.DEVICE_DEBUG_INFO
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            int r4 = r4 + 30
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Init "
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = " ["
            r5.append(r1)
            java.lang.String r1 = "ExoPlayerLib/2.14.0"
            r5.append(r1)
            java.lang.String r1 = "] ["
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = "]"
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r3 = "ExoPlayerImpl"
            com.google.android.exoplayer2.util.Log.m19795i(r3, r1)
            int r1 = r2.length
            r3 = 0
            if (r1 <= 0) goto L_0x005f
            r1 = 1
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r19)
            com.google.android.exoplayer2.Renderer[] r1 = (com.google.android.exoplayer2.Renderer[]) r1
            r0.renderers = r1
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r20)
            com.google.android.exoplayer2.trackselection.TrackSelector r1 = (com.google.android.exoplayer2.trackselection.TrackSelector) r1
            r0.trackSelector = r1
            r1 = r21
            r0.mediaSourceFactory = r1
            r0.bandwidthMeter = r6
            r0.analyticsCollector = r9
            r1 = r25
            r0.useLazyPreparation = r1
            r10 = r26
            r0.seekParameters = r10
            r12 = r30
            r0.pauseAtEndOfMediaItems = r12
            r0.applicationLooper = r14
            r0.clock = r15
            r0.repeatMode = r3
            if (r33 == 0) goto L_0x0092
            r1 = r33
            goto L_0x0093
        L_0x0092:
            r1 = r0
        L_0x0093:
            com.google.android.exoplayer2.util.ListenerSet r4 = new com.google.android.exoplayer2.util.ListenerSet
            com.google.android.exoplayer2.t r5 = new com.google.android.exoplayer2.t
            r5.<init>(r1)
            r4.<init>(r14, r15, r5)
            r0.listeners = r4
            java.util.concurrent.CopyOnWriteArraySet r4 = new java.util.concurrent.CopyOnWriteArraySet
            r4.<init>()
            r0.audioOffloadListeners = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.mediaSourceHolderSnapshots = r4
            com.google.android.exoplayer2.source.ShuffleOrder$DefaultShuffleOrder r4 = new com.google.android.exoplayer2.source.ShuffleOrder$DefaultShuffleOrder
            r4.<init>(r3)
            r0.shuffleOrder = r4
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r4 = new com.google.android.exoplayer2.trackselection.TrackSelectorResult
            int r3 = r2.length
            com.google.android.exoplayer2.RendererConfiguration[] r3 = new com.google.android.exoplayer2.RendererConfiguration[r3]
            int r5 = r2.length
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r5 = new com.google.android.exoplayer2.trackselection.ExoTrackSelection[r5]
            r7 = 0
            r4.<init>(r3, r5, r7)
            r0.emptyTrackSelectorResult = r4
            com.google.android.exoplayer2.Timeline$Period r3 = new com.google.android.exoplayer2.Timeline$Period
            r3.<init>()
            r0.period = r3
            com.google.android.exoplayer2.Player$Commands$Builder r3 = new com.google.android.exoplayer2.Player$Commands$Builder
            r3.<init>()
            r5 = 9
            int[] r5 = new int[r5]
            r5 = {1, 2, 8, 9, 10, 11, 12, 13, 14} // fill-array
            com.google.android.exoplayer2.Player$Commands$Builder r3 = r3.addAll((int[]) r5)
            r5 = r34
            com.google.android.exoplayer2.Player$Commands$Builder r3 = r3.addAll((com.google.android.exoplayer2.Player.Commands) r5)
            com.google.android.exoplayer2.Player$Commands r3 = r3.build()
            r0.permanentAvailableCommands = r3
            com.google.android.exoplayer2.Player$Commands$Builder r5 = new com.google.android.exoplayer2.Player$Commands$Builder
            r5.<init>()
            com.google.android.exoplayer2.Player$Commands$Builder r3 = r5.addAll((com.google.android.exoplayer2.Player.Commands) r3)
            r5 = 3
            com.google.android.exoplayer2.Player$Commands$Builder r3 = r3.add(r5)
            r5 = 7
            com.google.android.exoplayer2.Player$Commands$Builder r3 = r3.add(r5)
            com.google.android.exoplayer2.Player$Commands r3 = r3.build()
            r0.availableCommands = r3
            com.google.android.exoplayer2.MediaMetadata r3 = com.google.android.exoplayer2.MediaMetadata.EMPTY
            r0.mediaMetadata = r3
            r3 = -1
            r0.maskingWindowIndex = r3
            com.google.android.exoplayer2.util.HandlerWrapper r3 = r15.createHandler(r14, r7)
            r0.playbackInfoUpdateHandler = r3
            com.google.android.exoplayer2.f r13 = new com.google.android.exoplayer2.f
            r13.<init>(r0)
            r0.playbackInfoUpdateListener = r13
            com.google.android.exoplayer2.PlaybackInfo r3 = com.google.android.exoplayer2.PlaybackInfo.createDummy(r4)
            r0.playbackInfo = r3
            if (r9 == 0) goto L_0x0128
            r9.setPlayer(r1, r14)
            r0.addListener((com.google.android.exoplayer2.Player.Listener) r9)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r14)
            r6.addEventListener(r1, r9)
        L_0x0128:
            com.google.android.exoplayer2.ExoPlayerImplInternal r11 = new com.google.android.exoplayer2.ExoPlayerImplInternal
            r1 = r11
            int r7 = r0.repeatMode
            boolean r8 = r0.shuffleModeEnabled
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r23
            r9 = r24
            r10 = r26
            r0 = r11
            r11 = r27
            r17 = r13
            r12 = r28
            r14 = r30
            r15 = r32
            r16 = r31
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17)
            r1 = r0
            r0 = r18
            r0.internalPlayer = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlayerImpl.<init>(com.google.android.exoplayer2.Renderer[], com.google.android.exoplayer2.trackselection.TrackSelector, com.google.android.exoplayer2.source.MediaSourceFactory, com.google.android.exoplayer2.LoadControl, com.google.android.exoplayer2.upstream.BandwidthMeter, com.google.android.exoplayer2.analytics.AnalyticsCollector, boolean, com.google.android.exoplayer2.SeekParameters, com.google.android.exoplayer2.LivePlaybackSpeedControl, long, boolean, com.google.android.exoplayer2.util.Clock, android.os.Looper, com.google.android.exoplayer2.Player, com.google.android.exoplayer2.Player$Commands):void");
    }

    private List<MediaSourceList.MediaSourceHolder> addMediaSourceHolders(int i, List<MediaSource> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            MediaSourceList.MediaSourceHolder mediaSourceHolder = new MediaSourceList.MediaSourceHolder(list.get(i2), this.useLazyPreparation);
            arrayList.add(mediaSourceHolder);
            this.mediaSourceHolderSnapshots.add(i2 + i, new MediaSourceHolderSnapshot(mediaSourceHolder.uid, mediaSourceHolder.mediaSource.getTimeline()));
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndInsert(i, arrayList.size());
        return arrayList;
    }

    private Timeline createMaskingTimeline() {
        return new PlaylistTimeline(this.mediaSourceHolderSnapshots, this.shuffleOrder);
    }

    private List<MediaSource> createMediaSources(List<MediaItem> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.mediaSourceFactory.createMediaSource(list.get(i)));
        }
        return arrayList;
    }

    private Pair<Boolean, Integer> evaluateMediaItemTransitionReason(PlaybackInfo playbackInfo2, PlaybackInfo playbackInfo3, boolean z, int i, boolean z2) {
        Timeline timeline = playbackInfo3.timeline;
        Timeline timeline2 = playbackInfo2.timeline;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i2 = 3;
        if (timeline2.isEmpty() != timeline.isEmpty()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (!timeline.getWindow(timeline.getPeriodByUid(playbackInfo3.periodId.periodUid, this.period).windowIndex, this.window).uid.equals(timeline2.getWindow(timeline2.getPeriodByUid(playbackInfo2.periodId.periodUid, this.period).windowIndex, this.window).uid)) {
            if (z && i == 0) {
                i2 = 1;
            } else if (z && i == 1) {
                i2 = 2;
            } else if (!z2) {
                throw new IllegalStateException();
            }
            return new Pair<>(Boolean.TRUE, Integer.valueOf(i2));
        } else if (!z || i != 0 || playbackInfo3.periodId.windowSequenceNumber >= playbackInfo2.periodId.windowSequenceNumber) {
            return new Pair<>(Boolean.FALSE, -1);
        } else {
            return new Pair<>(Boolean.TRUE, 0);
        }
    }

    private long getCurrentPositionUsInternal(PlaybackInfo playbackInfo2) {
        if (playbackInfo2.timeline.isEmpty()) {
            return C6540C.msToUs(this.maskingWindowPositionMs);
        }
        if (playbackInfo2.periodId.isAd()) {
            return playbackInfo2.positionUs;
        }
        return periodPositionUsToWindowPositionUs(playbackInfo2.timeline, playbackInfo2.periodId, playbackInfo2.positionUs);
    }

    private int getCurrentWindowIndexInternal() {
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingWindowIndex;
        }
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        return playbackInfo2.timeline.getPeriodByUid(playbackInfo2.periodId.periodUid, this.period).windowIndex;
    }

    private Pair<Object, Long> getPeriodPositionAfterTimelineChanged(Timeline timeline, Timeline timeline2) {
        long contentPosition = getContentPosition();
        int i = -1;
        if (timeline.isEmpty() || timeline2.isEmpty()) {
            boolean z = !timeline.isEmpty() && timeline2.isEmpty();
            if (!z) {
                i = getCurrentWindowIndexInternal();
            }
            if (z) {
                contentPosition = -9223372036854775807L;
            }
            return getPeriodPositionOrMaskWindowPosition(timeline2, i, contentPosition);
        }
        Pair<Object, Long> periodPosition = timeline.getPeriodPosition(this.window, this.period, getCurrentWindowIndex(), C6540C.msToUs(contentPosition));
        Object obj = ((Pair) Util.castNonNull(periodPosition)).first;
        if (timeline2.getIndexOfPeriod(obj) != -1) {
            return periodPosition;
        }
        Object resolveSubsequentPeriod = ExoPlayerImplInternal.resolveSubsequentPeriod(this.window, this.period, this.repeatMode, this.shuffleModeEnabled, obj, timeline, timeline2);
        if (resolveSubsequentPeriod == null) {
            return getPeriodPositionOrMaskWindowPosition(timeline2, -1, C6540C.TIME_UNSET);
        }
        timeline2.getPeriodByUid(resolveSubsequentPeriod, this.period);
        int i2 = this.period.windowIndex;
        return getPeriodPositionOrMaskWindowPosition(timeline2, i2, timeline2.getWindow(i2, this.window).getDefaultPositionMs());
    }

    private Pair<Object, Long> getPeriodPositionOrMaskWindowPosition(Timeline timeline, int i, long j) {
        if (timeline.isEmpty()) {
            this.maskingWindowIndex = i;
            if (j == C6540C.TIME_UNSET) {
                j = 0;
            }
            this.maskingWindowPositionMs = j;
            this.maskingPeriodIndex = 0;
            return null;
        }
        if (i == -1 || i >= timeline.getWindowCount()) {
            i = timeline.getFirstWindowIndex(this.shuffleModeEnabled);
            j = timeline.getWindow(i, this.window).getDefaultPositionMs();
        }
        return timeline.getPeriodPosition(this.window, this.period, i, C6540C.msToUs(j));
    }

    private Player.PositionInfo getPositionInfo(long j) {
        int i;
        Object obj;
        int currentWindowIndex = getCurrentWindowIndex();
        Object obj2 = null;
        if (!this.playbackInfo.timeline.isEmpty()) {
            PlaybackInfo playbackInfo2 = this.playbackInfo;
            Object obj3 = playbackInfo2.periodId.periodUid;
            playbackInfo2.timeline.getPeriodByUid(obj3, this.period);
            i = this.playbackInfo.timeline.getIndexOfPeriod(obj3);
            obj = obj3;
            obj2 = this.playbackInfo.timeline.getWindow(currentWindowIndex, this.window).uid;
        } else {
            obj = null;
            i = -1;
        }
        long usToMs = C6540C.usToMs(j);
        long usToMs2 = this.playbackInfo.periodId.isAd() ? C6540C.usToMs(getRequestedContentPositionUs(this.playbackInfo)) : usToMs;
        MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
        return new Player.PositionInfo(obj2, currentWindowIndex, obj, i, usToMs, usToMs2, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
    }

    private Player.PositionInfo getPreviousPositionInfo(int i, PlaybackInfo playbackInfo2, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        long j;
        long j2;
        PlaybackInfo playbackInfo3 = playbackInfo2;
        Timeline.Period period2 = new Timeline.Period();
        if (!playbackInfo3.timeline.isEmpty()) {
            Object obj3 = playbackInfo3.periodId.periodUid;
            playbackInfo3.timeline.getPeriodByUid(obj3, period2);
            int i5 = period2.windowIndex;
            i4 = i5;
            obj = obj3;
            i3 = playbackInfo3.timeline.getIndexOfPeriod(obj3);
            obj2 = playbackInfo3.timeline.getWindow(i5, this.window).uid;
        } else {
            i4 = i2;
            obj2 = null;
            obj = null;
            i3 = -1;
        }
        if (i == 0) {
            j = period2.positionInWindowUs + period2.durationUs;
            if (playbackInfo3.periodId.isAd()) {
                MediaSource.MediaPeriodId mediaPeriodId = playbackInfo3.periodId;
                j = period2.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
                j2 = getRequestedContentPositionUs(playbackInfo2);
            } else {
                if (playbackInfo3.periodId.nextAdGroupIndex != -1 && this.playbackInfo.periodId.isAd()) {
                    j = getRequestedContentPositionUs(this.playbackInfo);
                }
                j2 = j;
            }
        } else if (playbackInfo3.periodId.isAd()) {
            j = playbackInfo3.positionUs;
            j2 = getRequestedContentPositionUs(playbackInfo2);
        } else {
            j2 = period2.positionInWindowUs + playbackInfo3.positionUs;
            j = j2;
        }
        long usToMs = C6540C.usToMs(j);
        long usToMs2 = C6540C.usToMs(j2);
        MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo3.periodId;
        return new Player.PositionInfo(obj2, i4, obj, i3, usToMs, usToMs2, mediaPeriodId2.adGroupIndex, mediaPeriodId2.adIndexInAdGroup);
    }

    private static long getRequestedContentPositionUs(PlaybackInfo playbackInfo2) {
        Timeline.Window window = new Timeline.Window();
        Timeline.Period period2 = new Timeline.Period();
        playbackInfo2.timeline.getPeriodByUid(playbackInfo2.periodId.periodUid, period2);
        if (playbackInfo2.requestedContentPositionUs == C6540C.TIME_UNSET) {
            return playbackInfo2.timeline.getWindow(period2.windowIndex, window).getDefaultPositionUs();
        }
        return period2.getPositionInWindowUs() + playbackInfo2.requestedContentPositionUs;
    }

    /* access modifiers changed from: private */
    /* renamed from: handlePlaybackInfo */
    public void lambda$new$1(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        long j;
        boolean z;
        long j2;
        int i = this.pendingOperationAcks - playbackInfoUpdate.operationAcks;
        this.pendingOperationAcks = i;
        boolean z2 = true;
        if (playbackInfoUpdate.positionDiscontinuity) {
            this.pendingDiscontinuityReason = playbackInfoUpdate.discontinuityReason;
            this.pendingDiscontinuity = true;
        }
        if (playbackInfoUpdate.hasPlayWhenReadyChangeReason) {
            this.pendingPlayWhenReadyChangeReason = playbackInfoUpdate.playWhenReadyChangeReason;
        }
        if (i == 0) {
            Timeline timeline = playbackInfoUpdate.playbackInfo.timeline;
            if (!this.playbackInfo.timeline.isEmpty() && timeline.isEmpty()) {
                this.maskingWindowIndex = -1;
                this.maskingWindowPositionMs = 0;
                this.maskingPeriodIndex = 0;
            }
            if (!timeline.isEmpty()) {
                List<Timeline> childTimelines = ((PlaylistTimeline) timeline).getChildTimelines();
                Assertions.checkState(childTimelines.size() == this.mediaSourceHolderSnapshots.size());
                for (int i2 = 0; i2 < childTimelines.size(); i2++) {
                    Timeline unused = this.mediaSourceHolderSnapshots.get(i2).timeline = childTimelines.get(i2);
                }
            }
            if (this.pendingDiscontinuity) {
                if (playbackInfoUpdate.playbackInfo.periodId.equals(this.playbackInfo.periodId) && playbackInfoUpdate.playbackInfo.discontinuityStartPositionUs == this.playbackInfo.positionUs) {
                    z2 = false;
                }
                if (z2) {
                    if (timeline.isEmpty() || playbackInfoUpdate.playbackInfo.periodId.isAd()) {
                        j2 = playbackInfoUpdate.playbackInfo.discontinuityStartPositionUs;
                    } else {
                        PlaybackInfo playbackInfo2 = playbackInfoUpdate.playbackInfo;
                        j2 = periodPositionUsToWindowPositionUs(timeline, playbackInfo2.periodId, playbackInfo2.discontinuityStartPositionUs);
                    }
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                }
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.pendingDiscontinuity = false;
            updatePlaybackInfo(playbackInfoUpdate.playbackInfo, 1, this.pendingPlayWhenReadyChangeReason, false, z, this.pendingDiscontinuityReason, j, -1);
        }
    }

    private static boolean isPlaying(PlaybackInfo playbackInfo2) {
        return playbackInfo2.playbackState == 3 && playbackInfo2.playWhenReady && playbackInfo2.playbackSuppressionReason == 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        this.playbackInfoUpdateHandler.post(new C6929u(this, playbackInfoUpdate));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onMetadata$6(Player.EventListener eventListener) {
        eventListener.onMediaMetadataChanged(this.mediaMetadata);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$updateAvailableCommands$21(Player.EventListener eventListener) {
        eventListener.onAvailableCommandsChanged(this.availableCommands);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$14(PlaybackInfo playbackInfo2, Player.EventListener eventListener) {
        eventListener.onLoadingChanged(playbackInfo2.isLoading);
        eventListener.onIsLoadingChanged(playbackInfo2.isLoading);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$7(PlaybackInfo playbackInfo2, int i, Player.EventListener eventListener) {
        Object obj;
        if (playbackInfo2.timeline.getWindowCount() == 1) {
            obj = playbackInfo2.timeline.getWindow(0, new Timeline.Window()).manifest;
        } else {
            obj = null;
        }
        eventListener.onTimelineChanged(playbackInfo2.timeline, obj, i);
        eventListener.onTimelineChanged(playbackInfo2.timeline, i);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$8(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, Player.EventListener eventListener) {
        eventListener.onPositionDiscontinuity(i);
        eventListener.onPositionDiscontinuity(positionInfo, positionInfo2, i);
    }

    private PlaybackInfo maskTimelineAndPosition(PlaybackInfo playbackInfo2, Timeline timeline, Pair<Object, Long> pair) {
        long j;
        Timeline timeline2 = timeline;
        Pair<Object, Long> pair2 = pair;
        Assertions.checkArgument(timeline.isEmpty() || pair2 != null);
        Timeline timeline3 = playbackInfo2.timeline;
        PlaybackInfo copyWithTimeline = playbackInfo2.copyWithTimeline(timeline);
        if (timeline.isEmpty()) {
            MediaSource.MediaPeriodId dummyPeriodForEmptyTimeline = PlaybackInfo.getDummyPeriodForEmptyTimeline();
            long msToUs = C6540C.msToUs(this.maskingWindowPositionMs);
            PlaybackInfo copyWithLoadingMediaPeriodId = copyWithTimeline.copyWithNewPosition(dummyPeriodForEmptyTimeline, msToUs, msToUs, msToUs, 0, TrackGroupArray.EMPTY, this.emptyTrackSelectorResult, C4766t.m21978E()).copyWithLoadingMediaPeriodId(dummyPeriodForEmptyTimeline);
            copyWithLoadingMediaPeriodId.bufferedPositionUs = copyWithLoadingMediaPeriodId.positionUs;
            return copyWithLoadingMediaPeriodId;
        }
        Object obj = copyWithTimeline.periodId.periodUid;
        boolean z = !obj.equals(((Pair) Util.castNonNull(pair)).first);
        MediaSource.MediaPeriodId mediaPeriodId = z ? new MediaSource.MediaPeriodId(pair2.first) : copyWithTimeline.periodId;
        long longValue = ((Long) pair2.second).longValue();
        long msToUs2 = C6540C.msToUs(getContentPosition());
        if (!timeline3.isEmpty()) {
            msToUs2 -= timeline3.getPeriodByUid(obj, this.period).getPositionInWindowUs();
        }
        if (z || longValue < msToUs2) {
            MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodId;
            Assertions.checkState(!mediaPeriodId2.isAd());
            MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodId2;
            PlaybackInfo copyWithLoadingMediaPeriodId2 = copyWithTimeline.copyWithNewPosition(mediaPeriodId3, longValue, longValue, longValue, 0, z ? TrackGroupArray.EMPTY : copyWithTimeline.trackGroups, z ? this.emptyTrackSelectorResult : copyWithTimeline.trackSelectorResult, z ? C4766t.m21978E() : copyWithTimeline.staticMetadata).copyWithLoadingMediaPeriodId(mediaPeriodId3);
            copyWithLoadingMediaPeriodId2.bufferedPositionUs = longValue;
            return copyWithLoadingMediaPeriodId2;
        }
        if (longValue == msToUs2) {
            int indexOfPeriod = timeline2.getIndexOfPeriod(copyWithTimeline.loadingMediaPeriodId.periodUid);
            if (indexOfPeriod == -1 || timeline2.getPeriod(indexOfPeriod, this.period).windowIndex != timeline2.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex) {
                timeline2.getPeriodByUid(mediaPeriodId.periodUid, this.period);
                if (mediaPeriodId.isAd()) {
                    j = this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
                } else {
                    j = this.period.durationUs;
                }
                copyWithTimeline = copyWithTimeline.copyWithNewPosition(mediaPeriodId, copyWithTimeline.positionUs, copyWithTimeline.positionUs, copyWithTimeline.discontinuityStartPositionUs, j - copyWithTimeline.positionUs, copyWithTimeline.trackGroups, copyWithTimeline.trackSelectorResult, copyWithTimeline.staticMetadata).copyWithLoadingMediaPeriodId(mediaPeriodId);
                copyWithTimeline.bufferedPositionUs = j;
            }
        } else {
            MediaSource.MediaPeriodId mediaPeriodId4 = mediaPeriodId;
            Assertions.checkState(!mediaPeriodId4.isAd());
            long max = Math.max(0, copyWithTimeline.totalBufferedDurationUs - (longValue - msToUs2));
            long j2 = copyWithTimeline.bufferedPositionUs;
            if (copyWithTimeline.loadingMediaPeriodId.equals(copyWithTimeline.periodId)) {
                j2 = longValue + max;
            }
            copyWithTimeline = copyWithTimeline.copyWithNewPosition(mediaPeriodId4, longValue, longValue, longValue, max, copyWithTimeline.trackGroups, copyWithTimeline.trackSelectorResult, copyWithTimeline.staticMetadata);
            copyWithTimeline.bufferedPositionUs = j2;
        }
        return copyWithTimeline;
    }

    private long periodPositionUsToWindowPositionUs(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return j + this.period.getPositionInWindowUs();
    }

    private PlaybackInfo removeMediaItemsInternal(int i, int i2) {
        boolean z = false;
        Assertions.checkArgument(i >= 0 && i2 >= i && i2 <= this.mediaSourceHolderSnapshots.size());
        int currentWindowIndex = getCurrentWindowIndex();
        Timeline currentTimeline = getCurrentTimeline();
        int size = this.mediaSourceHolderSnapshots.size();
        this.pendingOperationAcks++;
        removeMediaSourceHolders(i, i2);
        Timeline createMaskingTimeline = createMaskingTimeline();
        PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, createMaskingTimeline, getPeriodPositionAfterTimelineChanged(currentTimeline, createMaskingTimeline));
        int i3 = maskTimelineAndPosition.playbackState;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && currentWindowIndex >= maskTimelineAndPosition.timeline.getWindowCount()) {
            z = true;
        }
        if (z) {
            maskTimelineAndPosition = maskTimelineAndPosition.copyWithPlaybackState(4);
        }
        this.internalPlayer.removeMediaSources(i, i2, this.shuffleOrder);
        return maskTimelineAndPosition;
    }

    private void removeMediaSourceHolders(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.mediaSourceHolderSnapshots.remove(i3);
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndRemove(i, i2);
    }

    private void setMediaSourcesInternal(List<MediaSource> list, int i, long j, boolean z) {
        int i2;
        long j2;
        int i3 = i;
        int currentWindowIndexInternal = getCurrentWindowIndexInternal();
        long currentPosition = getCurrentPosition();
        boolean z2 = true;
        this.pendingOperationAcks++;
        if (!this.mediaSourceHolderSnapshots.isEmpty()) {
            removeMediaSourceHolders(0, this.mediaSourceHolderSnapshots.size());
        }
        List<MediaSourceList.MediaSourceHolder> addMediaSourceHolders = addMediaSourceHolders(0, list);
        Timeline createMaskingTimeline = createMaskingTimeline();
        if (createMaskingTimeline.isEmpty() || i3 < createMaskingTimeline.getWindowCount()) {
            long j3 = j;
            if (z) {
                int firstWindowIndex = createMaskingTimeline.getFirstWindowIndex(this.shuffleModeEnabled);
                j2 = C6540C.TIME_UNSET;
                i2 = firstWindowIndex;
            } else if (i3 == -1) {
                i2 = currentWindowIndexInternal;
                j2 = currentPosition;
            } else {
                i2 = i3;
                j2 = j3;
            }
            PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, createMaskingTimeline, getPeriodPositionOrMaskWindowPosition(createMaskingTimeline, i2, j2));
            int i4 = maskTimelineAndPosition.playbackState;
            if (!(i2 == -1 || i4 == 1)) {
                i4 = (createMaskingTimeline.isEmpty() || i2 >= createMaskingTimeline.getWindowCount()) ? 4 : 2;
            }
            PlaybackInfo copyWithPlaybackState = maskTimelineAndPosition.copyWithPlaybackState(i4);
            this.internalPlayer.setMediaSources(addMediaSourceHolders, i2, C6540C.msToUs(j2), this.shuffleOrder);
            if (this.playbackInfo.periodId.periodUid.equals(copyWithPlaybackState.periodId.periodUid) || this.playbackInfo.timeline.isEmpty()) {
                z2 = false;
            }
            updatePlaybackInfo(copyWithPlaybackState, 0, 1, false, z2, 4, getCurrentPositionUsInternal(copyWithPlaybackState), -1);
            return;
        }
        throw new IllegalSeekPositionException(createMaskingTimeline, i3, j);
    }

    private void updateAvailableCommands() {
        Player.Commands commands = this.availableCommands;
        Player.Commands availableCommands2 = getAvailableCommands(this.permanentAvailableCommands);
        this.availableCommands = availableCommands2;
        if (!availableCommands2.equals(commands)) {
            this.listeners.queueEvent(14, new C7037w(this));
        }
    }

    private void updatePlaybackInfo(PlaybackInfo playbackInfo2, int i, int i2, boolean z, boolean z2, int i3, long j, int i4) {
        PlaybackInfo playbackInfo3 = playbackInfo2;
        int i5 = i3;
        PlaybackInfo playbackInfo4 = this.playbackInfo;
        this.playbackInfo = playbackInfo3;
        Pair<Boolean, Integer> evaluateMediaItemTransitionReason = evaluateMediaItemTransitionReason(playbackInfo2, playbackInfo4, z2, i3, !playbackInfo4.timeline.equals(playbackInfo3.timeline));
        boolean booleanValue = ((Boolean) evaluateMediaItemTransitionReason.first).booleanValue();
        int intValue = ((Integer) evaluateMediaItemTransitionReason.second).intValue();
        MediaMetadata mediaMetadata2 = this.mediaMetadata;
        MediaItem mediaItem = null;
        if (booleanValue) {
            if (!playbackInfo3.timeline.isEmpty()) {
                mediaItem = playbackInfo3.timeline.getWindow(playbackInfo3.timeline.getPeriodByUid(playbackInfo3.periodId.periodUid, this.period).windowIndex, this.window).mediaItem;
            }
            this.mediaMetadata = mediaItem != null ? mediaItem.mediaMetadata : MediaMetadata.EMPTY;
        }
        if (!playbackInfo4.staticMetadata.equals(playbackInfo3.staticMetadata)) {
            mediaMetadata2 = mediaMetadata2.buildUpon().populateFromMetadata(playbackInfo3.staticMetadata).build();
        }
        boolean z3 = !mediaMetadata2.equals(this.mediaMetadata);
        this.mediaMetadata = mediaMetadata2;
        if (!playbackInfo4.timeline.equals(playbackInfo3.timeline)) {
            this.listeners.queueEvent(0, new C6729l(playbackInfo2, i));
        }
        if (z2) {
            this.listeners.queueEvent(12, new C7016v(i5, getPreviousPositionInfo(i5, playbackInfo4, i4), getPositionInfo(j)));
        }
        if (booleanValue) {
            this.listeners.queueEvent(1, new C7041y(mediaItem, intValue));
        }
        ExoPlaybackException exoPlaybackException = playbackInfo4.playbackError;
        ExoPlaybackException exoPlaybackException2 = playbackInfo3.playbackError;
        if (!(exoPlaybackException == exoPlaybackException2 || exoPlaybackException2 == null)) {
            this.listeners.queueEvent(11, new C6555a0(playbackInfo2));
        }
        TrackSelectorResult trackSelectorResult = playbackInfo4.trackSelectorResult;
        TrackSelectorResult trackSelectorResult2 = playbackInfo3.trackSelectorResult;
        if (trackSelectorResult != trackSelectorResult2) {
            this.trackSelector.onSelectionActivated(trackSelectorResult2.info);
            this.listeners.queueEvent(2, new C6780n(playbackInfo2, new TrackSelectionArray(playbackInfo3.trackSelectorResult.selections)));
        }
        if (!playbackInfo4.staticMetadata.equals(playbackInfo3.staticMetadata)) {
            this.listeners.queueEvent(3, new C6642b0(playbackInfo2));
        }
        if (z3) {
            this.listeners.queueEvent(15, new C7043z(this.mediaMetadata));
        }
        if (playbackInfo4.isLoading != playbackInfo3.isLoading) {
            this.listeners.queueEvent(4, new C6719g(playbackInfo2));
        }
        if (!(playbackInfo4.playbackState == playbackInfo3.playbackState && playbackInfo4.playWhenReady == playbackInfo3.playWhenReady)) {
            this.listeners.queueEvent(-1, new C6721h(playbackInfo2));
        }
        if (playbackInfo4.playbackState != playbackInfo3.playbackState) {
            this.listeners.queueEvent(5, new C6723i(playbackInfo2));
        }
        if (playbackInfo4.playWhenReady != playbackInfo3.playWhenReady) {
            this.listeners.queueEvent(6, new C6731m(playbackInfo2, i2));
        }
        if (playbackInfo4.playbackSuppressionReason != playbackInfo3.playbackSuppressionReason) {
            this.listeners.queueEvent(7, new C6727k(playbackInfo2));
        }
        if (isPlaying(playbackInfo4) != isPlaying(playbackInfo2)) {
            this.listeners.queueEvent(8, new C6643c0(playbackInfo2));
        }
        if (!playbackInfo4.playbackParameters.equals(playbackInfo3.playbackParameters)) {
            this.listeners.queueEvent(13, new C6725j(playbackInfo2));
        }
        if (z) {
            this.listeners.queueEvent(-1, C6812s.f27505a);
        }
        updateAvailableCommands();
        this.listeners.flushEvents();
        if (playbackInfo4.offloadSchedulingEnabled != playbackInfo3.offloadSchedulingEnabled) {
            Iterator<ExoPlayer.AudioOffloadListener> it = this.audioOffloadListeners.iterator();
            while (it.hasNext()) {
                it.next().onExperimentalOffloadSchedulingEnabledChanged(playbackInfo3.offloadSchedulingEnabled);
            }
        }
        if (playbackInfo4.sleepingForOffload != playbackInfo3.sleepingForOffload) {
            Iterator<ExoPlayer.AudioOffloadListener> it2 = this.audioOffloadListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onExperimentalSleepingForOffloadChanged(playbackInfo3.sleepingForOffload);
            }
        }
    }

    public void addAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
        this.audioOffloadListeners.add(audioOffloadListener);
    }

    public void addListener(Player.Listener listener) {
        addListener((Player.EventListener) listener);
    }

    public void addMediaItems(int i, List<MediaItem> list) {
        addMediaSources(Math.min(i, this.mediaSourceHolderSnapshots.size()), createMediaSources(list));
    }

    public void addMediaSource(MediaSource mediaSource) {
        addMediaSources(Collections.singletonList(mediaSource));
    }

    public void addMediaSources(List<MediaSource> list) {
        addMediaSources(this.mediaSourceHolderSnapshots.size(), list);
    }

    public void clearVideoSurface() {
    }

    public void clearVideoSurface(Surface surface) {
    }

    public void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
    }

    public void clearVideoSurfaceView(SurfaceView surfaceView) {
    }

    public void clearVideoTextureView(TextureView textureView) {
    }

    public PlayerMessage createMessage(PlayerMessage.Target target) {
        return new PlayerMessage(this.internalPlayer, target, this.playbackInfo.timeline, getCurrentWindowIndex(), this.clock, this.internalPlayer.getPlaybackLooper());
    }

    public void decreaseDeviceVolume() {
    }

    public boolean experimentalIsSleepingForOffload() {
        return this.playbackInfo.sleepingForOffload;
    }

    public void experimentalSetForegroundModeTimeoutMs(long j) {
        this.internalPlayer.experimentalSetForegroundModeTimeoutMs(j);
    }

    public void experimentalSetOffloadSchedulingEnabled(boolean z) {
        this.internalPlayer.experimentalSetOffloadSchedulingEnabled(z);
    }

    public Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    public AudioAttributes getAudioAttributes() {
        return AudioAttributes.DEFAULT;
    }

    public ExoPlayer.AudioComponent getAudioComponent() {
        return null;
    }

    public Player.Commands getAvailableCommands() {
        return this.availableCommands;
    }

    public long getBufferedPosition() {
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        if (playbackInfo2.loadingMediaPeriodId.equals(playbackInfo2.periodId)) {
            return C6540C.usToMs(this.playbackInfo.bufferedPositionUs);
        }
        return getDuration();
    }

    public Clock getClock() {
        return this.clock;
    }

    public long getContentBufferedPosition() {
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingWindowPositionMs;
        }
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        if (playbackInfo2.loadingMediaPeriodId.windowSequenceNumber != playbackInfo2.periodId.windowSequenceNumber) {
            return playbackInfo2.timeline.getWindow(getCurrentWindowIndex(), this.window).getDurationMs();
        }
        long j = playbackInfo2.bufferedPositionUs;
        if (this.playbackInfo.loadingMediaPeriodId.isAd()) {
            PlaybackInfo playbackInfo3 = this.playbackInfo;
            Timeline.Period periodByUid = playbackInfo3.timeline.getPeriodByUid(playbackInfo3.loadingMediaPeriodId.periodUid, this.period);
            long adGroupTimeUs = periodByUid.getAdGroupTimeUs(this.playbackInfo.loadingMediaPeriodId.adGroupIndex);
            j = adGroupTimeUs == Long.MIN_VALUE ? periodByUid.durationUs : adGroupTimeUs;
        }
        PlaybackInfo playbackInfo4 = this.playbackInfo;
        return C6540C.usToMs(periodPositionUsToWindowPositionUs(playbackInfo4.timeline, playbackInfo4.loadingMediaPeriodId, j));
    }

    public long getContentPosition() {
        if (!isPlayingAd()) {
            return getCurrentPosition();
        }
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        playbackInfo2.timeline.getPeriodByUid(playbackInfo2.periodId.periodUid, this.period);
        PlaybackInfo playbackInfo3 = this.playbackInfo;
        if (playbackInfo3.requestedContentPositionUs == C6540C.TIME_UNSET) {
            return playbackInfo3.timeline.getWindow(getCurrentWindowIndex(), this.window).getDefaultPositionMs();
        }
        return this.period.getPositionInWindowMs() + C6540C.usToMs(this.playbackInfo.requestedContentPositionUs);
    }

    public int getCurrentAdGroupIndex() {
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adGroupIndex;
        }
        return -1;
    }

    public int getCurrentAdIndexInAdGroup() {
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adIndexInAdGroup;
        }
        return -1;
    }

    public int getCurrentPeriodIndex() {
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingPeriodIndex;
        }
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        return playbackInfo2.timeline.getIndexOfPeriod(playbackInfo2.periodId.periodUid);
    }

    public long getCurrentPosition() {
        return C6540C.usToMs(getCurrentPositionUsInternal(this.playbackInfo));
    }

    public List<Metadata> getCurrentStaticMetadata() {
        return this.playbackInfo.staticMetadata;
    }

    public Timeline getCurrentTimeline() {
        return this.playbackInfo.timeline;
    }

    public TrackGroupArray getCurrentTrackGroups() {
        return this.playbackInfo.trackGroups;
    }

    public TrackSelectionArray getCurrentTrackSelections() {
        return new TrackSelectionArray(this.playbackInfo.trackSelectorResult.selections);
    }

    public int getCurrentWindowIndex() {
        int currentWindowIndexInternal = getCurrentWindowIndexInternal();
        if (currentWindowIndexInternal == -1) {
            return 0;
        }
        return currentWindowIndexInternal;
    }

    public ExoPlayer.DeviceComponent getDeviceComponent() {
        return null;
    }

    public DeviceInfo getDeviceInfo() {
        return DeviceInfo.UNKNOWN;
    }

    public int getDeviceVolume() {
        return 0;
    }

    public long getDuration() {
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo2.periodId;
        playbackInfo2.timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return C6540C.usToMs(this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup));
    }

    public MediaMetadata getMediaMetadata() {
        return this.mediaMetadata;
    }

    public ExoPlayer.MetadataComponent getMetadataComponent() {
        return null;
    }

    public boolean getPauseAtEndOfMediaItems() {
        return this.pauseAtEndOfMediaItems;
    }

    public boolean getPlayWhenReady() {
        return this.playbackInfo.playWhenReady;
    }

    public Looper getPlaybackLooper() {
        return this.internalPlayer.getPlaybackLooper();
    }

    public PlaybackParameters getPlaybackParameters() {
        return this.playbackInfo.playbackParameters;
    }

    public int getPlaybackState() {
        return this.playbackInfo.playbackState;
    }

    public int getPlaybackSuppressionReason() {
        return this.playbackInfo.playbackSuppressionReason;
    }

    public ExoPlaybackException getPlayerError() {
        return this.playbackInfo.playbackError;
    }

    public int getRendererCount() {
        return this.renderers.length;
    }

    public int getRendererType(int i) {
        return this.renderers[i].getTrackType();
    }

    public int getRepeatMode() {
        return this.repeatMode;
    }

    public SeekParameters getSeekParameters() {
        return this.seekParameters;
    }

    public boolean getShuffleModeEnabled() {
        return this.shuffleModeEnabled;
    }

    public ExoPlayer.TextComponent getTextComponent() {
        return null;
    }

    public long getTotalBufferedDuration() {
        return C6540C.usToMs(this.playbackInfo.totalBufferedDurationUs);
    }

    public TrackSelector getTrackSelector() {
        return this.trackSelector;
    }

    public ExoPlayer.VideoComponent getVideoComponent() {
        return null;
    }

    public VideoSize getVideoSize() {
        return VideoSize.UNKNOWN;
    }

    public float getVolume() {
        return 1.0f;
    }

    public void increaseDeviceVolume() {
    }

    public boolean isDeviceMuted() {
        return false;
    }

    public boolean isLoading() {
        return this.playbackInfo.isLoading;
    }

    public boolean isPlayingAd() {
        return this.playbackInfo.periodId.isAd();
    }

    public void moveMediaItems(int i, int i2, int i3) {
        Assertions.checkArgument(i >= 0 && i <= i2 && i2 <= this.mediaSourceHolderSnapshots.size() && i3 >= 0);
        Timeline currentTimeline = getCurrentTimeline();
        this.pendingOperationAcks++;
        int min = Math.min(i3, this.mediaSourceHolderSnapshots.size() - (i2 - i));
        Util.moveItems(this.mediaSourceHolderSnapshots, i, i2, min);
        Timeline createMaskingTimeline = createMaskingTimeline();
        PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, createMaskingTimeline, getPeriodPositionAfterTimelineChanged(currentTimeline, createMaskingTimeline));
        this.internalPlayer.moveMediaSources(i, i2, min, this.shuffleOrder);
        updatePlaybackInfo(maskTimelineAndPosition, 0, 1, false, false, 5, C6540C.TIME_UNSET, -1);
    }

    public void onMetadata(Metadata metadata) {
        MediaMetadata build = this.mediaMetadata.buildUpon().populateFromMetadata(metadata).build();
        if (!build.equals(this.mediaMetadata)) {
            this.mediaMetadata = build;
            this.listeners.sendEvent(15, new C7039x(this));
        }
    }

    public void prepare() {
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        if (playbackInfo2.playbackState == 1) {
            PlaybackInfo copyWithPlaybackError = playbackInfo2.copyWithPlaybackError((ExoPlaybackException) null);
            PlaybackInfo copyWithPlaybackState = copyWithPlaybackError.copyWithPlaybackState(copyWithPlaybackError.timeline.isEmpty() ? 4 : 2);
            this.pendingOperationAcks++;
            this.internalPlayer.prepare();
            updatePlaybackInfo(copyWithPlaybackState, 1, 1, false, false, 5, C6540C.TIME_UNSET, -1);
        }
    }

    public void release() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = Util.DEVICE_DEBUG_INFO;
        String registeredModules = ExoPlayerLibraryInfo.registeredModules();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 36 + String.valueOf(str).length() + String.valueOf(registeredModules).length());
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [");
        sb.append(ExoPlayerLibraryInfo.VERSION_SLASHY);
        sb.append("] [");
        sb.append(str);
        sb.append("] [");
        sb.append(registeredModules);
        sb.append("]");
        Log.m19795i(TAG, sb.toString());
        if (!this.internalPlayer.release()) {
            this.listeners.sendEvent(11, C6807p.f27502a);
        }
        this.listeners.release();
        this.playbackInfoUpdateHandler.removeCallbacksAndMessages((Object) null);
        AnalyticsCollector analyticsCollector2 = this.analyticsCollector;
        if (analyticsCollector2 != null) {
            this.bandwidthMeter.removeEventListener(analyticsCollector2);
        }
        PlaybackInfo copyWithPlaybackState = this.playbackInfo.copyWithPlaybackState(1);
        this.playbackInfo = copyWithPlaybackState;
        PlaybackInfo copyWithLoadingMediaPeriodId = copyWithPlaybackState.copyWithLoadingMediaPeriodId(copyWithPlaybackState.periodId);
        this.playbackInfo = copyWithLoadingMediaPeriodId;
        copyWithLoadingMediaPeriodId.bufferedPositionUs = copyWithLoadingMediaPeriodId.positionUs;
        this.playbackInfo.totalBufferedDurationUs = 0;
    }

    public void removeAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
        this.audioOffloadListeners.remove(audioOffloadListener);
    }

    public void removeListener(Player.Listener listener) {
        removeListener((Player.EventListener) listener);
    }

    public void removeMediaItems(int i, int i2) {
        PlaybackInfo removeMediaItemsInternal = removeMediaItemsInternal(i, Math.min(i2, this.mediaSourceHolderSnapshots.size()));
        updatePlaybackInfo(removeMediaItemsInternal, 0, 1, false, !removeMediaItemsInternal.periodId.periodUid.equals(this.playbackInfo.periodId.periodUid), 4, getCurrentPositionUsInternal(removeMediaItemsInternal), -1);
    }

    @Deprecated
    public void retry() {
        prepare();
    }

    public void seekTo(int i, long j) {
        int i2 = i;
        long j2 = j;
        Timeline timeline = this.playbackInfo.timeline;
        if (i2 < 0 || (!timeline.isEmpty() && i2 >= timeline.getWindowCount())) {
            throw new IllegalSeekPositionException(timeline, i, j2);
        }
        int i3 = 1;
        this.pendingOperationAcks++;
        if (isPlayingAd()) {
            Log.m19797w(TAG, "seekTo ignored because an ad is playing");
            ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate = new ExoPlayerImplInternal.PlaybackInfoUpdate(this.playbackInfo);
            playbackInfoUpdate.incrementPendingOperationAcks(1);
            this.playbackInfoUpdateListener.onPlaybackInfoUpdate(playbackInfoUpdate);
            return;
        }
        if (getPlaybackState() != 1) {
            i3 = 2;
        }
        int currentWindowIndex = getCurrentWindowIndex();
        PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo.copyWithPlaybackState(i3), timeline, getPeriodPositionOrMaskWindowPosition(timeline, i, j2));
        this.internalPlayer.seekTo(timeline, i, C6540C.msToUs(j));
        updatePlaybackInfo(maskTimelineAndPosition, 0, 1, true, true, 1, getCurrentPositionUsInternal(maskTimelineAndPosition), currentWindowIndex);
    }

    public void setDeviceMuted(boolean z) {
    }

    public void setDeviceVolume(int i) {
    }

    public void setForegroundMode(boolean z) {
        if (this.foregroundMode != z) {
            this.foregroundMode = z;
            if (!this.internalPlayer.setForegroundMode(z)) {
                stop(false, ExoPlaybackException.createForRenderer(new ExoTimeoutException(2)));
            }
        }
    }

    public void setMediaItems(List<MediaItem> list, boolean z) {
        setMediaSources(createMediaSources(list), z);
    }

    public void setMediaSource(MediaSource mediaSource) {
        setMediaSources(Collections.singletonList(mediaSource));
    }

    public void setMediaSources(List<MediaSource> list) {
        setMediaSources(list, true);
    }

    public void setPauseAtEndOfMediaItems(boolean z) {
        if (this.pauseAtEndOfMediaItems != z) {
            this.pauseAtEndOfMediaItems = z;
            this.internalPlayer.setPauseAtEndOfWindow(z);
        }
    }

    public void setPlayWhenReady(boolean z) {
        setPlayWhenReady(z, 0, 1);
    }

    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        if (playbackParameters == null) {
            playbackParameters = PlaybackParameters.DEFAULT;
        }
        if (!this.playbackInfo.playbackParameters.equals(playbackParameters)) {
            PlaybackInfo copyWithPlaybackParameters = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
            this.pendingOperationAcks++;
            this.internalPlayer.setPlaybackParameters(playbackParameters);
            updatePlaybackInfo(copyWithPlaybackParameters, 0, 1, false, false, 5, C6540C.TIME_UNSET, -1);
        }
    }

    public void setRepeatMode(int i) {
        if (this.repeatMode != i) {
            this.repeatMode = i;
            this.internalPlayer.setRepeatMode(i);
            this.listeners.queueEvent(9, new C6809q(i));
            updateAvailableCommands();
            this.listeners.flushEvents();
        }
    }

    public void setSeekParameters(SeekParameters seekParameters2) {
        if (seekParameters2 == null) {
            seekParameters2 = SeekParameters.DEFAULT;
        }
        if (!this.seekParameters.equals(seekParameters2)) {
            this.seekParameters = seekParameters2;
            this.internalPlayer.setSeekParameters(seekParameters2);
        }
    }

    public void setShuffleModeEnabled(boolean z) {
        if (this.shuffleModeEnabled != z) {
            this.shuffleModeEnabled = z;
            this.internalPlayer.setShuffleModeEnabled(z);
            this.listeners.queueEvent(10, new C6782o(z));
            updateAvailableCommands();
            this.listeners.flushEvents();
        }
    }

    public void setShuffleOrder(ShuffleOrder shuffleOrder2) {
        Timeline createMaskingTimeline = createMaskingTimeline();
        PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, createMaskingTimeline, getPeriodPositionOrMaskWindowPosition(createMaskingTimeline, getCurrentWindowIndex(), getCurrentPosition()));
        this.pendingOperationAcks++;
        this.shuffleOrder = shuffleOrder2;
        this.internalPlayer.setShuffleOrder(shuffleOrder2);
        updatePlaybackInfo(maskTimelineAndPosition, 0, 1, false, false, 5, C6540C.TIME_UNSET, -1);
    }

    public void setVideoSurface(Surface surface) {
    }

    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
    }

    public void setVideoSurfaceView(SurfaceView surfaceView) {
    }

    public void setVideoTextureView(TextureView textureView) {
    }

    public void setVolume(float f) {
    }

    public void stop(boolean z) {
        stop(z, (ExoPlaybackException) null);
    }

    public void addListener(Player.EventListener eventListener) {
        this.listeners.add(eventListener);
    }

    public void addMediaSource(int i, MediaSource mediaSource) {
        addMediaSources(i, Collections.singletonList(mediaSource));
    }

    public void addMediaSources(int i, List<MediaSource> list) {
        Assertions.checkArgument(i >= 0);
        Timeline currentTimeline = getCurrentTimeline();
        this.pendingOperationAcks++;
        List<MediaSourceList.MediaSourceHolder> addMediaSourceHolders = addMediaSourceHolders(i, list);
        Timeline createMaskingTimeline = createMaskingTimeline();
        PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, createMaskingTimeline, getPeriodPositionAfterTimelineChanged(currentTimeline, createMaskingTimeline));
        this.internalPlayer.addMediaSources(i, addMediaSourceHolders, this.shuffleOrder);
        updatePlaybackInfo(maskTimelineAndPosition, 0, 1, false, false, 5, C6540C.TIME_UNSET, -1);
    }

    public C4766t<Cue> getCurrentCues() {
        return C4766t.m21978E();
    }

    public void removeListener(Player.EventListener eventListener) {
        this.listeners.remove(eventListener);
    }

    public void setMediaItems(List<MediaItem> list, int i, long j) {
        setMediaSources(createMediaSources(list), i, j);
    }

    public void setMediaSource(MediaSource mediaSource, long j) {
        setMediaSources(Collections.singletonList(mediaSource), 0, j);
    }

    public void setMediaSources(List<MediaSource> list, boolean z) {
        setMediaSourcesInternal(list, -1, C6540C.TIME_UNSET, z);
    }

    public void setPlayWhenReady(boolean z, int i, int i2) {
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        if (playbackInfo2.playWhenReady != z || playbackInfo2.playbackSuppressionReason != i) {
            this.pendingOperationAcks++;
            PlaybackInfo copyWithPlayWhenReady = playbackInfo2.copyWithPlayWhenReady(z, i);
            this.internalPlayer.setPlayWhenReady(z, i);
            updatePlaybackInfo(copyWithPlayWhenReady, 0, i2, false, false, 5, C6540C.TIME_UNSET, -1);
        }
    }

    public void stop(boolean z, ExoPlaybackException exoPlaybackException) {
        PlaybackInfo playbackInfo2;
        if (z) {
            playbackInfo2 = removeMediaItemsInternal(0, this.mediaSourceHolderSnapshots.size()).copyWithPlaybackError((ExoPlaybackException) null);
        } else {
            PlaybackInfo playbackInfo3 = this.playbackInfo;
            playbackInfo2 = playbackInfo3.copyWithLoadingMediaPeriodId(playbackInfo3.periodId);
            playbackInfo2.bufferedPositionUs = playbackInfo2.positionUs;
            playbackInfo2.totalBufferedDurationUs = 0;
        }
        PlaybackInfo copyWithPlaybackState = playbackInfo2.copyWithPlaybackState(1);
        if (exoPlaybackException != null) {
            copyWithPlaybackState = copyWithPlaybackState.copyWithPlaybackError(exoPlaybackException);
        }
        PlaybackInfo playbackInfo4 = copyWithPlaybackState;
        this.pendingOperationAcks++;
        this.internalPlayer.stop();
        updatePlaybackInfo(playbackInfo4, 0, 1, false, playbackInfo4.timeline.isEmpty() && !this.playbackInfo.timeline.isEmpty(), 4, getCurrentPositionUsInternal(playbackInfo4), -1);
    }

    public void setMediaSources(List<MediaSource> list, int i, long j) {
        setMediaSourcesInternal(list, i, j, false);
    }

    public void setMediaSource(MediaSource mediaSource, boolean z) {
        setMediaSources(Collections.singletonList(mediaSource), z);
    }

    @Deprecated
    public void prepare(MediaSource mediaSource) {
        setMediaSource(mediaSource);
        prepare();
    }

    @Deprecated
    public void prepare(MediaSource mediaSource, boolean z, boolean z2) {
        setMediaSource(mediaSource, z);
        prepare();
    }
}
