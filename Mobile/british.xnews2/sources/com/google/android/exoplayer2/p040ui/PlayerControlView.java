package com.google.android.exoplayer2.p040ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.C6808p0;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.DefaultControlDispatcher;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.PlaybackPreparer;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p040ui.TimeBar;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.RepeatModeUtil;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.exoplayer2.ui.PlayerControlView */
public class PlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private long[] adGroupTimesMs;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final ComponentListener componentListener;
    /* access modifiers changed from: private */
    public ControlDispatcher controlDispatcher;
    private long currentWindowOffset;
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    /* access modifiers changed from: private */
    public final View fastForwardButton;
    /* access modifiers changed from: private */
    public final StringBuilder formatBuilder;
    /* access modifiers changed from: private */
    public final Formatter formatter;
    private final Runnable hideAction;
    private long hideAtMs;
    private boolean isAttachedToWindow;
    private boolean multiWindowTimeBar;
    /* access modifiers changed from: private */
    public final View nextButton;
    /* access modifiers changed from: private */
    public final View pauseButton;
    private final Timeline.Period period;
    /* access modifiers changed from: private */
    public final View playButton;
    private PlaybackPreparer playbackPreparer;
    private boolean[] playedAdGroups;
    /* access modifiers changed from: private */
    public Player player;
    /* access modifiers changed from: private */
    public final TextView positionView;
    /* access modifiers changed from: private */
    public final View previousButton;
    private ProgressUpdateListener progressUpdateListener;
    private final String repeatAllButtonContentDescription;
    private final Drawable repeatAllButtonDrawable;
    private final String repeatOffButtonContentDescription;
    private final Drawable repeatOffButtonDrawable;
    private final String repeatOneButtonContentDescription;
    private final Drawable repeatOneButtonDrawable;
    /* access modifiers changed from: private */
    public final ImageView repeatToggleButton;
    /* access modifiers changed from: private */
    public int repeatToggleModes;
    /* access modifiers changed from: private */
    public final View rewindButton;
    /* access modifiers changed from: private */
    public boolean scrubbing;
    private boolean showFastForwardButton;
    private boolean showMultiWindowTimeBar;
    private boolean showNextButton;
    private boolean showPreviousButton;
    private boolean showRewindButton;
    private boolean showShuffleButton;
    private int showTimeoutMs;
    /* access modifiers changed from: private */
    public final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;
    private final TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<VisibilityListener> visibilityListeners;
    private final View vrButton;
    private final Timeline.Window window;

    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$ComponentListener */
    private final class ComponentListener implements Player.EventListener, TimeBar.OnScrubListener, View.OnClickListener {
        private ComponentListener() {
        }

        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            C6808p0.m28583a(this, commands);
        }

        public void onClick(View view) {
            Player access$500 = PlayerControlView.this.player;
            if (access$500 != null) {
                if (PlayerControlView.this.nextButton == view) {
                    PlayerControlView.this.controlDispatcher.dispatchNext(access$500);
                } else if (PlayerControlView.this.previousButton == view) {
                    PlayerControlView.this.controlDispatcher.dispatchPrevious(access$500);
                } else if (PlayerControlView.this.fastForwardButton == view) {
                    if (access$500.getPlaybackState() != 4) {
                        PlayerControlView.this.controlDispatcher.dispatchFastForward(access$500);
                    }
                } else if (PlayerControlView.this.rewindButton == view) {
                    PlayerControlView.this.controlDispatcher.dispatchRewind(access$500);
                } else if (PlayerControlView.this.playButton == view) {
                    PlayerControlView.this.dispatchPlay(access$500);
                } else if (PlayerControlView.this.pauseButton == view) {
                    PlayerControlView.this.dispatchPause(access$500);
                } else if (PlayerControlView.this.repeatToggleButton == view) {
                    PlayerControlView.this.controlDispatcher.dispatchSetRepeatMode(access$500, RepeatModeUtil.getNextRepeatMode(access$500.getRepeatMode(), PlayerControlView.this.repeatToggleModes));
                } else if (PlayerControlView.this.shuffleButton == view) {
                    PlayerControlView.this.controlDispatcher.dispatchSetShuffleModeEnabled(access$500, !access$500.getShuffleModeEnabled());
                }
            }
        }

        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(5, 6)) {
                PlayerControlView.this.updatePlayPauseButton();
            }
            if (events.containsAny(5, 6, 8)) {
                PlayerControlView.this.updateProgress();
            }
            if (events.contains(9)) {
                PlayerControlView.this.updateRepeatModeButton();
            }
            if (events.contains(10)) {
                PlayerControlView.this.updateShuffleButton();
            }
            if (events.containsAny(9, 10, 12, 0)) {
                PlayerControlView.this.updateNavigation();
            }
            if (events.containsAny(12, 0)) {
                PlayerControlView.this.updateTimeline();
            }
        }

        public /* synthetic */ void onIsLoadingChanged(boolean z) {
            C6808p0.m28585c(this, z);
        }

        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            C6808p0.m28586d(this, z);
        }

        public /* synthetic */ void onLoadingChanged(boolean z) {
            C6808p0.m28587e(this, z);
        }

        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
            C6808p0.m28588f(this, mediaItem, i);
        }

        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            C6808p0.m28589g(this, mediaMetadata);
        }

        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            C6808p0.m28590h(this, z, i);
        }

        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            C6808p0.m28591i(this, playbackParameters);
        }

        public /* synthetic */ void onPlaybackStateChanged(int i) {
            C6808p0.m28592j(this, i);
        }

        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            C6808p0.m28593k(this, i);
        }

        public /* synthetic */ void onPlayerError(ExoPlaybackException exoPlaybackException) {
            C6808p0.m28594l(this, exoPlaybackException);
        }

        public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            C6808p0.m28595m(this, z, i);
        }

        public /* synthetic */ void onPositionDiscontinuity(int i) {
            C6808p0.m28596n(this, i);
        }

        public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            C6808p0.m28597o(this, positionInfo, positionInfo2, i);
        }

        public /* synthetic */ void onRepeatModeChanged(int i) {
            C6808p0.m28598p(this, i);
        }

        public void onScrubMove(TimeBar timeBar, long j) {
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(Util.getStringForTime(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j));
            }
        }

        public void onScrubStart(TimeBar timeBar, long j) {
            boolean unused = PlayerControlView.this.scrubbing = true;
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(Util.getStringForTime(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j));
            }
        }

        public void onScrubStop(TimeBar timeBar, long j, boolean z) {
            boolean unused = PlayerControlView.this.scrubbing = false;
            if (!z && PlayerControlView.this.player != null) {
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.seekToTimeBarPosition(playerControlView.player, j);
            }
        }

        public /* synthetic */ void onSeekProcessed() {
            C6808p0.m28599q(this);
        }

        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            C6808p0.m28600r(this, z);
        }

        public /* synthetic */ void onStaticMetadataChanged(List list) {
            C6808p0.m28601s(this, list);
        }

        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
            C6808p0.m28602t(this, timeline, i);
        }

        public /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i) {
            C6808p0.m28603u(this, timeline, obj, i);
        }

        public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            C6808p0.m28604v(this, trackGroupArray, trackSelectionArray);
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$ProgressUpdateListener */
    public interface ProgressUpdateListener {
        void onProgressUpdate(long j, long j2);
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$VisibilityListener */
    public interface VisibilityListener {
        void onVisibilityChange(int i);
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.ui");
    }

    public PlayerControlView(Context context) {
        this(context, (AttributeSet) null);
    }

    private static boolean canShowMultiWindowTimeBar(Timeline timeline, Timeline.Window window2) {
        if (timeline.getWindowCount() > 100) {
            return false;
        }
        int windowCount = timeline.getWindowCount();
        for (int i = 0; i < windowCount; i++) {
            if (timeline.getWindow(i, window2).durationUs == C6540C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void dispatchPause(Player player2) {
        this.controlDispatcher.dispatchSetPlayWhenReady(player2, false);
    }

    /* access modifiers changed from: private */
    public void dispatchPlay(Player player2) {
        int playbackState = player2.getPlaybackState();
        if (playbackState == 1) {
            PlaybackPreparer playbackPreparer2 = this.playbackPreparer;
            if (playbackPreparer2 != null) {
                playbackPreparer2.preparePlayback();
            } else {
                this.controlDispatcher.dispatchPrepare(player2);
            }
        } else if (playbackState == 4) {
            seekTo(player2, player2.getCurrentWindowIndex(), C6540C.TIME_UNSET);
        }
        this.controlDispatcher.dispatchSetPlayWhenReady(player2, true);
    }

    private void dispatchPlayPause(Player player2) {
        int playbackState = player2.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !player2.getPlayWhenReady()) {
            dispatchPlay(player2);
        } else {
            dispatchPause(player2);
        }
    }

    private void hideAfterTimeout() {
        removeCallbacks(this.hideAction);
        if (this.showTimeoutMs > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i = this.showTimeoutMs;
            this.hideAtMs = uptimeMillis + ((long) i);
            if (this.isAttachedToWindow) {
                postDelayed(this.hideAction, (long) i);
                return;
            }
            return;
        }
        this.hideAtMs = C6540C.TIME_UNSET;
    }

    @SuppressLint({"InlinedApi"})
    private static boolean isHandledMediaKey(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    private void requestPlayPauseFocus() {
        View view;
        View view2;
        boolean shouldShowPauseButton = shouldShowPauseButton();
        if (!shouldShowPauseButton && (view2 = this.playButton) != null) {
            view2.requestFocus();
        } else if (shouldShowPauseButton && (view = this.pauseButton) != null) {
            view.requestFocus();
        }
    }

    private boolean seekTo(Player player2, int i, long j) {
        return this.controlDispatcher.dispatchSeekTo(player2, i, j);
    }

    /* access modifiers changed from: private */
    public void seekToTimeBarPosition(Player player2, long j) {
        int i;
        Timeline currentTimeline = player2.getCurrentTimeline();
        if (this.multiWindowTimeBar && !currentTimeline.isEmpty()) {
            int windowCount = currentTimeline.getWindowCount();
            i = 0;
            while (true) {
                long durationMs = currentTimeline.getWindow(i, this.window).getDurationMs();
                if (j < durationMs) {
                    break;
                } else if (i == windowCount - 1) {
                    j = durationMs;
                    break;
                } else {
                    j -= durationMs;
                    i++;
                }
            }
        } else {
            i = player2.getCurrentWindowIndex();
        }
        if (!seekTo(player2, i, j)) {
            updateProgress();
        }
    }

    private boolean shouldShowPauseButton() {
        Player player2 = this.player;
        if (player2 == null || player2.getPlaybackState() == 4 || this.player.getPlaybackState() == 1 || !this.player.getPlayWhenReady()) {
            return false;
        }
        return true;
    }

    private void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTimeline();
    }

    private void updateButton(boolean z, boolean z2, View view) {
        if (view != null) {
            view.setEnabled(z2);
            view.setAlpha(z2 ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateNavigation() {
        /*
            r8 = this;
            boolean r0 = r8.isVisible()
            if (r0 == 0) goto L_0x009f
            boolean r0 = r8.isAttachedToWindow
            if (r0 != 0) goto L_0x000c
            goto L_0x009f
        L_0x000c:
            com.google.android.exoplayer2.Player r0 = r8.player
            r1 = 0
            if (r0 == 0) goto L_0x0078
            com.google.android.exoplayer2.Timeline r2 = r0.getCurrentTimeline()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0078
            boolean r3 = r0.isPlayingAd()
            if (r3 != 0) goto L_0x0078
            r3 = 4
            boolean r3 = r0.isCommandAvailable(r3)
            int r4 = r0.getCurrentWindowIndex()
            com.google.android.exoplayer2.Timeline$Window r5 = r8.window
            r2.getWindow(r4, r5)
            r2 = 1
            if (r3 != 0) goto L_0x0044
            com.google.android.exoplayer2.Timeline$Window r4 = r8.window
            boolean r4 = r4.isLive()
            if (r4 == 0) goto L_0x0044
            r4 = 6
            boolean r4 = r0.isCommandAvailable(r4)
            if (r4 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r4 = 0
            goto L_0x0045
        L_0x0044:
            r4 = 1
        L_0x0045:
            if (r3 == 0) goto L_0x0051
            com.google.android.exoplayer2.ControlDispatcher r5 = r8.controlDispatcher
            boolean r5 = r5.isRewindEnabled()
            if (r5 == 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            if (r3 == 0) goto L_0x005e
            com.google.android.exoplayer2.ControlDispatcher r6 = r8.controlDispatcher
            boolean r6 = r6.isFastForwardEnabled()
            if (r6 == 0) goto L_0x005e
            r6 = 1
            goto L_0x005f
        L_0x005e:
            r6 = 0
        L_0x005f:
            com.google.android.exoplayer2.Timeline$Window r7 = r8.window
            boolean r7 = r7.isLive()
            if (r7 == 0) goto L_0x006d
            com.google.android.exoplayer2.Timeline$Window r7 = r8.window
            boolean r7 = r7.isDynamic
            if (r7 != 0) goto L_0x0074
        L_0x006d:
            r7 = 5
            boolean r0 = r0.isCommandAvailable(r7)
            if (r0 == 0) goto L_0x0075
        L_0x0074:
            r1 = 1
        L_0x0075:
            r0 = r1
            r1 = r4
            goto L_0x007c
        L_0x0078:
            r0 = 0
            r3 = 0
            r5 = 0
            r6 = 0
        L_0x007c:
            boolean r2 = r8.showPreviousButton
            android.view.View r4 = r8.previousButton
            r8.updateButton(r2, r1, r4)
            boolean r1 = r8.showRewindButton
            android.view.View r2 = r8.rewindButton
            r8.updateButton(r1, r5, r2)
            boolean r1 = r8.showFastForwardButton
            android.view.View r2 = r8.fastForwardButton
            r8.updateButton(r1, r6, r2)
            boolean r1 = r8.showNextButton
            android.view.View r2 = r8.nextButton
            r8.updateButton(r1, r0, r2)
            com.google.android.exoplayer2.ui.TimeBar r0 = r8.timeBar
            if (r0 == 0) goto L_0x009f
            r0.setEnabled(r3)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p040ui.PlayerControlView.updateNavigation():void");
    }

    /* access modifiers changed from: private */
    public void updatePlayPauseButton() {
        boolean z;
        if (isVisible() && this.isAttachedToWindow) {
            boolean shouldShowPauseButton = shouldShowPauseButton();
            View view = this.playButton;
            int i = 8;
            boolean z2 = true;
            if (view != null) {
                z = (shouldShowPauseButton && view.isFocused()) | false;
                this.playButton.setVisibility(shouldShowPauseButton ? 8 : 0);
            } else {
                z = false;
            }
            View view2 = this.pauseButton;
            if (view2 != null) {
                if (shouldShowPauseButton || !view2.isFocused()) {
                    z2 = false;
                }
                z |= z2;
                View view3 = this.pauseButton;
                if (shouldShowPauseButton) {
                    i = 0;
                }
                view3.setVisibility(i);
            }
            if (z) {
                requestPlayPauseFocus();
            }
        }
    }

    /* access modifiers changed from: private */
    public void updateProgress() {
        long j;
        int i;
        if (isVisible() && this.isAttachedToWindow) {
            Player player2 = this.player;
            long j2 = 0;
            if (player2 != null) {
                j2 = this.currentWindowOffset + player2.getContentPosition();
                j = this.currentWindowOffset + player2.getContentBufferedPosition();
            } else {
                j = 0;
            }
            TextView textView = this.positionView;
            if (textView != null && !this.scrubbing) {
                textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, j2));
            }
            TimeBar timeBar2 = this.timeBar;
            if (timeBar2 != null) {
                timeBar2.setPosition(j2);
                this.timeBar.setBufferedPosition(j);
            }
            ProgressUpdateListener progressUpdateListener2 = this.progressUpdateListener;
            if (progressUpdateListener2 != null) {
                progressUpdateListener2.onProgressUpdate(j2, j);
            }
            removeCallbacks(this.updateProgressAction);
            if (player2 == null) {
                i = 1;
            } else {
                i = player2.getPlaybackState();
            }
            long j3 = 1000;
            if (player2 != null && player2.isPlaying()) {
                TimeBar timeBar3 = this.timeBar;
                long min = Math.min(timeBar3 != null ? timeBar3.getPreferredUpdateDelay() : 1000, 1000 - (j2 % 1000));
                float f = player2.getPlaybackParameters().speed;
                if (f > 0.0f) {
                    j3 = (long) (((float) min) / f);
                }
                postDelayed(this.updateProgressAction, Util.constrainValue(j3, (long) this.timeBarMinUpdateIntervalMs, 1000));
            } else if (i != 4 && i != 1) {
                postDelayed(this.updateProgressAction, 1000);
            }
        }
    }

    /* access modifiers changed from: private */
    public void updateRepeatModeButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(false, false, imageView);
                return;
            }
            Player player2 = this.player;
            if (player2 == null) {
                updateButton(true, false, imageView);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, true, imageView);
            int repeatMode = player2.getRepeatMode();
            if (repeatMode == 0) {
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
            } else if (repeatMode == 1) {
                this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
            } else if (repeatMode == 2) {
                this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
            }
            this.repeatToggleButton.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void updateShuffleButton() {
        ImageView imageView;
        String str;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            Player player2 = this.player;
            if (!this.showShuffleButton) {
                updateButton(false, false, imageView);
            } else if (player2 == null) {
                updateButton(true, false, imageView);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
            } else {
                updateButton(true, true, imageView);
                this.shuffleButton.setImageDrawable(player2.getShuffleModeEnabled() ? this.shuffleOnButtonDrawable : this.shuffleOffButtonDrawable);
                ImageView imageView2 = this.shuffleButton;
                if (player2.getShuffleModeEnabled()) {
                    str = this.shuffleOnContentDescription;
                } else {
                    str = this.shuffleOffContentDescription;
                }
                imageView2.setContentDescription(str);
            }
        }
    }

    /* access modifiers changed from: private */
    public void updateTimeline() {
        int i;
        Timeline.Window window2;
        Player player2 = this.player;
        if (player2 != null) {
            boolean z = true;
            this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player2.getCurrentTimeline(), this.window);
            long j = 0;
            this.currentWindowOffset = 0;
            Timeline currentTimeline = player2.getCurrentTimeline();
            if (!currentTimeline.isEmpty()) {
                int currentWindowIndex = player2.getCurrentWindowIndex();
                boolean z2 = this.multiWindowTimeBar;
                int i2 = z2 ? 0 : currentWindowIndex;
                int windowCount = z2 ? currentTimeline.getWindowCount() - 1 : currentWindowIndex;
                long j2 = 0;
                i = 0;
                while (true) {
                    if (i2 > windowCount) {
                        break;
                    }
                    if (i2 == currentWindowIndex) {
                        this.currentWindowOffset = C6540C.usToMs(j2);
                    }
                    currentTimeline.getWindow(i2, this.window);
                    Timeline.Window window3 = this.window;
                    if (window3.durationUs == C6540C.TIME_UNSET) {
                        Assertions.checkState(this.multiWindowTimeBar ^ z);
                        break;
                    }
                    int i3 = window3.firstPeriodIndex;
                    while (true) {
                        window2 = this.window;
                        if (i3 > window2.lastPeriodIndex) {
                            break;
                        }
                        currentTimeline.getPeriod(i3, this.period);
                        int adGroupCount = this.period.getAdGroupCount();
                        for (int i4 = 0; i4 < adGroupCount; i4++) {
                            long adGroupTimeUs = this.period.getAdGroupTimeUs(i4);
                            if (adGroupTimeUs == Long.MIN_VALUE) {
                                long j3 = this.period.durationUs;
                                if (j3 == C6540C.TIME_UNSET) {
                                } else {
                                    adGroupTimeUs = j3;
                                }
                            }
                            long positionInWindowUs = adGroupTimeUs + this.period.getPositionInWindowUs();
                            if (positionInWindowUs >= 0) {
                                long[] jArr = this.adGroupTimesMs;
                                if (i == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.adGroupTimesMs = Arrays.copyOf(jArr, length);
                                    this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, length);
                                }
                                this.adGroupTimesMs[i] = C6540C.usToMs(j2 + positionInWindowUs);
                                this.playedAdGroups[i] = this.period.hasPlayedAdGroup(i4);
                                i++;
                            }
                        }
                        i3++;
                    }
                    j2 += window2.durationUs;
                    i2++;
                    z = true;
                }
                j = j2;
            } else {
                i = 0;
            }
            long usToMs = C6540C.usToMs(j);
            TextView textView = this.durationView;
            if (textView != null) {
                textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, usToMs));
            }
            TimeBar timeBar2 = this.timeBar;
            if (timeBar2 != null) {
                timeBar2.setDuration(usToMs);
                int length2 = this.extraAdGroupTimesMs.length;
                int i5 = i + length2;
                long[] jArr2 = this.adGroupTimesMs;
                if (i5 > jArr2.length) {
                    this.adGroupTimesMs = Arrays.copyOf(jArr2, i5);
                    this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i5);
                }
                System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i, length2);
                System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i, length2);
                this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i5);
            }
            updateProgress();
        }
    }

    public void addVisibilityListener(VisibilityListener visibilityListener) {
        Assertions.checkNotNull(visibilityListener);
        this.visibilityListeners.add(visibilityListener);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player2 = this.player;
        if (player2 == null || !isHandledMediaKey(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (player2.getPlaybackState() == 4) {
                return true;
            }
            this.controlDispatcher.dispatchFastForward(player2);
            return true;
        } else if (keyCode == 89) {
            this.controlDispatcher.dispatchRewind(player2);
            return true;
        } else if (keyEvent.getRepeatCount() != 0) {
            return true;
        } else {
            if (keyCode == 79 || keyCode == 85) {
                dispatchPlayPause(player2);
                return true;
            } else if (keyCode == 87) {
                this.controlDispatcher.dispatchNext(player2);
                return true;
            } else if (keyCode == 88) {
                this.controlDispatcher.dispatchPrevious(player2);
                return true;
            } else if (keyCode == 126) {
                dispatchPlay(player2);
                return true;
            } else if (keyCode != 127) {
                return true;
            } else {
                dispatchPause(player2);
                return true;
            }
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.hideAction);
        } else if (motionEvent.getAction() == 1) {
            hideAfterTimeout();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Player getPlayer() {
        return this.player;
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public boolean getShowShuffleButton() {
        return this.showShuffleButton;
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public boolean getShowVrButton() {
        View view = this.vrButton;
        return view != null && view.getVisibility() == 0;
    }

    public void hide() {
        if (isVisible()) {
            setVisibility(8);
            Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            removeCallbacks(this.updateProgressAction);
            removeCallbacks(this.hideAction);
            this.hideAtMs = C6540C.TIME_UNSET;
        }
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        long j = this.hideAtMs;
        if (j != C6540C.TIME_UNSET) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                hide();
            } else {
                postDelayed(this.hideAction, uptimeMillis);
            }
        } else if (isVisible()) {
            hideAfterTimeout();
        }
        updateAll();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        removeCallbacks(this.hideAction);
    }

    public void removeVisibilityListener(VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    public void setControlDispatcher(ControlDispatcher controlDispatcher2) {
        if (this.controlDispatcher != controlDispatcher2) {
            this.controlDispatcher = controlDispatcher2;
            updateNavigation();
        }
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        boolean z = false;
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) Assertions.checkNotNull(zArr);
            if (jArr.length == zArr2.length) {
                z = true;
            }
            Assertions.checkArgument(z);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr2;
        }
        updateTimeline();
    }

    @Deprecated
    public void setFastForwardIncrementMs(int i) {
        ControlDispatcher controlDispatcher2 = this.controlDispatcher;
        if (controlDispatcher2 instanceof DefaultControlDispatcher) {
            ((DefaultControlDispatcher) controlDispatcher2).setFastForwardIncrementMs((long) i);
            updateNavigation();
        }
    }

    @Deprecated
    public void setPlaybackPreparer(PlaybackPreparer playbackPreparer2) {
        this.playbackPreparer = playbackPreparer2;
    }

    public void setPlayer(Player player2) {
        boolean z = true;
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        if (!(player2 == null || player2.getApplicationLooper() == Looper.getMainLooper())) {
            z = false;
        }
        Assertions.checkArgument(z);
        Player player3 = this.player;
        if (player3 != player2) {
            if (player3 != null) {
                player3.removeListener((Player.EventListener) this.componentListener);
            }
            this.player = player2;
            if (player2 != null) {
                player2.addListener((Player.EventListener) this.componentListener);
            }
            updateAll();
        }
    }

    public void setProgressUpdateListener(ProgressUpdateListener progressUpdateListener2) {
        this.progressUpdateListener = progressUpdateListener2;
    }

    public void setRepeatToggleModes(int i) {
        this.repeatToggleModes = i;
        Player player2 = this.player;
        if (player2 != null) {
            int repeatMode = player2.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.controlDispatcher.dispatchSetRepeatMode(this.player, 0);
            } else if (i == 1 && repeatMode == 2) {
                this.controlDispatcher.dispatchSetRepeatMode(this.player, 1);
            } else if (i == 2 && repeatMode == 1) {
                this.controlDispatcher.dispatchSetRepeatMode(this.player, 2);
            }
        }
        updateRepeatModeButton();
    }

    @Deprecated
    public void setRewindIncrementMs(int i) {
        ControlDispatcher controlDispatcher2 = this.controlDispatcher;
        if (controlDispatcher2 instanceof DefaultControlDispatcher) {
            ((DefaultControlDispatcher) controlDispatcher2).setRewindIncrementMs((long) i);
            updateNavigation();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        this.showFastForwardButton = z;
        updateNavigation();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.showMultiWindowTimeBar = z;
        updateTimeline();
    }

    public void setShowNextButton(boolean z) {
        this.showNextButton = z;
        updateNavigation();
    }

    public void setShowPreviousButton(boolean z) {
        this.showPreviousButton = z;
        updateNavigation();
    }

    public void setShowRewindButton(boolean z) {
        this.showRewindButton = z;
        updateNavigation();
    }

    public void setShowShuffleButton(boolean z) {
        this.showShuffleButton = z;
        updateShuffleButton();
    }

    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs = i;
        if (isVisible()) {
            hideAfterTimeout();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.vrButton;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.timeBarMinUpdateIntervalMs = Util.constrainValue(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.vrButton;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            updateButton(getShowVrButton(), onClickListener != null, this.vrButton);
        }
    }

    public void show() {
        if (!isVisible()) {
            setVisibility(0);
            Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            updateAll();
            requestPlayPauseFocus();
        }
        hideAfterTimeout();
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i) {
        return typedArray.getInt(C6934R.styleable.PlayerControlView_repeat_toggle_modes, i);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int i2 = C6934R.layout.exo_player_control_view;
        int i3 = 5000;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        this.hideAtMs = C6540C.TIME_UNSET;
        this.showRewindButton = true;
        this.showFastForwardButton = true;
        this.showPreviousButton = true;
        this.showNextButton = true;
        this.showShuffleButton = false;
        int i4 = DefaultControlDispatcher.DEFAULT_FAST_FORWARD_MS;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C6934R.styleable.PlayerControlView, 0, 0);
            try {
                i3 = obtainStyledAttributes.getInt(C6934R.styleable.PlayerControlView_rewind_increment, 5000);
                i4 = obtainStyledAttributes.getInt(C6934R.styleable.PlayerControlView_fastforward_increment, DefaultControlDispatcher.DEFAULT_FAST_FORWARD_MS);
                this.showTimeoutMs = obtainStyledAttributes.getInt(C6934R.styleable.PlayerControlView_show_timeout, this.showTimeoutMs);
                i2 = obtainStyledAttributes.getResourceId(C6934R.styleable.PlayerControlView_controller_layout_id, i2);
                this.repeatToggleModes = getRepeatToggleModes(obtainStyledAttributes, this.repeatToggleModes);
                this.showRewindButton = obtainStyledAttributes.getBoolean(C6934R.styleable.PlayerControlView_show_rewind_button, this.showRewindButton);
                this.showFastForwardButton = obtainStyledAttributes.getBoolean(C6934R.styleable.PlayerControlView_show_fastforward_button, this.showFastForwardButton);
                this.showPreviousButton = obtainStyledAttributes.getBoolean(C6934R.styleable.PlayerControlView_show_previous_button, this.showPreviousButton);
                this.showNextButton = obtainStyledAttributes.getBoolean(C6934R.styleable.PlayerControlView_show_next_button, this.showNextButton);
                this.showShuffleButton = obtainStyledAttributes.getBoolean(C6934R.styleable.PlayerControlView_show_shuffle_button, this.showShuffleButton);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(C6934R.styleable.PlayerControlView_time_bar_min_update_interval, this.timeBarMinUpdateIntervalMs));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.visibilityListeners = new CopyOnWriteArrayList<>();
        this.period = new Timeline.Period();
        this.window = new Timeline.Window();
        StringBuilder sb = new StringBuilder();
        this.formatBuilder = sb;
        this.formatter = new Formatter(sb, Locale.getDefault());
        this.adGroupTimesMs = new long[0];
        this.playedAdGroups = new boolean[0];
        this.extraAdGroupTimesMs = new long[0];
        this.extraPlayedAdGroups = new boolean[0];
        ComponentListener componentListener2 = new ComponentListener();
        this.componentListener = componentListener2;
        this.controlDispatcher = new DefaultControlDispatcher((long) i4, (long) i3);
        this.updateProgressAction = new C6958e(this);
        this.hideAction = new C6956d(this);
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        int i5 = C6934R.C6936id.exo_progress;
        TimeBar timeBar2 = (TimeBar) findViewById(i5);
        View findViewById = findViewById(C6934R.C6936id.exo_progress_placeholder);
        if (timeBar2 != null) {
            this.timeBar = timeBar2;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, (AttributeSet) null, 0, attributeSet2);
            defaultTimeBar.setId(i5);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.timeBar = defaultTimeBar;
        } else {
            this.timeBar = null;
        }
        this.durationView = (TextView) findViewById(C6934R.C6936id.exo_duration);
        this.positionView = (TextView) findViewById(C6934R.C6936id.exo_position);
        TimeBar timeBar3 = this.timeBar;
        if (timeBar3 != null) {
            timeBar3.addListener(componentListener2);
        }
        View findViewById2 = findViewById(C6934R.C6936id.exo_play);
        this.playButton = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(componentListener2);
        }
        View findViewById3 = findViewById(C6934R.C6936id.exo_pause);
        this.pauseButton = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(componentListener2);
        }
        View findViewById4 = findViewById(C6934R.C6936id.exo_prev);
        this.previousButton = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(componentListener2);
        }
        View findViewById5 = findViewById(C6934R.C6936id.exo_next);
        this.nextButton = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(componentListener2);
        }
        View findViewById6 = findViewById(C6934R.C6936id.exo_rew);
        this.rewindButton = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(componentListener2);
        }
        View findViewById7 = findViewById(C6934R.C6936id.exo_ffwd);
        this.fastForwardButton = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(componentListener2);
        }
        ImageView imageView = (ImageView) findViewById(C6934R.C6936id.exo_repeat_toggle);
        this.repeatToggleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener2);
        }
        ImageView imageView2 = (ImageView) findViewById(C6934R.C6936id.exo_shuffle);
        this.shuffleButton = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(componentListener2);
        }
        View findViewById8 = findViewById(C6934R.C6936id.exo_vr);
        this.vrButton = findViewById8;
        setShowVrButton(false);
        updateButton(false, false, findViewById8);
        Resources resources = context.getResources();
        this.buttonAlphaEnabled = ((float) resources.getInteger(C6934R.integer.exo_media_button_opacity_percentage_enabled)) / 100.0f;
        this.buttonAlphaDisabled = ((float) resources.getInteger(C6934R.integer.exo_media_button_opacity_percentage_disabled)) / 100.0f;
        this.repeatOffButtonDrawable = resources.getDrawable(C6934R.C6935drawable.exo_controls_repeat_off);
        this.repeatOneButtonDrawable = resources.getDrawable(C6934R.C6935drawable.exo_controls_repeat_one);
        this.repeatAllButtonDrawable = resources.getDrawable(C6934R.C6935drawable.exo_controls_repeat_all);
        this.shuffleOnButtonDrawable = resources.getDrawable(C6934R.C6935drawable.exo_controls_shuffle_on);
        this.shuffleOffButtonDrawable = resources.getDrawable(C6934R.C6935drawable.exo_controls_shuffle_off);
        this.repeatOffButtonContentDescription = resources.getString(C6934R.string.exo_controls_repeat_off_description);
        this.repeatOneButtonContentDescription = resources.getString(C6934R.string.exo_controls_repeat_one_description);
        this.repeatAllButtonContentDescription = resources.getString(C6934R.string.exo_controls_repeat_all_description);
        this.shuffleOnContentDescription = resources.getString(C6934R.string.exo_controls_shuffle_on_description);
        this.shuffleOffContentDescription = resources.getString(C6934R.string.exo_controls_shuffle_off_description);
    }
}
