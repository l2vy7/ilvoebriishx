package com.google.android.exoplayer2.p040ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.C6808p0;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.DefaultControlDispatcher;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.PlaybackPreparer;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p040ui.TimeBar;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.RepeatModeUtil;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p010b0.C1523f;

/* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView */
public class StyledPlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private static final int SETTINGS_AUDIO_TRACK_SELECTION_POSITION = 1;
    private static final int SETTINGS_PLAYBACK_SPEED_POSITION = 0;
    private long[] adGroupTimesMs;
    /* access modifiers changed from: private */
    public View audioTrackButton;
    /* access modifiers changed from: private */
    public TrackSelectionAdapter audioTrackSelectionAdapter;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final ComponentListener componentListener;
    /* access modifiers changed from: private */
    public ControlDispatcher controlDispatcher;
    /* access modifiers changed from: private */
    public StyledPlayerControlViewLayoutManager controlViewLayoutManager;
    private long currentWindowOffset;
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    /* access modifiers changed from: private */
    public final View fastForwardButton;
    private final TextView fastForwardButtonTextView;
    private long fastForwardMs;
    /* access modifiers changed from: private */
    public final StringBuilder formatBuilder;
    /* access modifiers changed from: private */
    public final Formatter formatter;
    private ImageView fullScreenButton;
    private final String fullScreenEnterContentDescription;
    private final Drawable fullScreenEnterDrawable;
    private final String fullScreenExitContentDescription;
    private final Drawable fullScreenExitDrawable;
    private boolean isAttachedToWindow;
    private boolean isFullScreen;
    private ImageView minimalFullScreenButton;
    private boolean multiWindowTimeBar;
    /* access modifiers changed from: private */
    public boolean needToHideBars;
    /* access modifiers changed from: private */
    public final View nextButton;
    private OnFullScreenModeChangedListener onFullScreenModeChangedListener;
    private final Timeline.Period period;
    /* access modifiers changed from: private */
    public final View playPauseButton;
    private PlaybackPreparer playbackPreparer;
    /* access modifiers changed from: private */
    public PlaybackSpeedAdapter playbackSpeedAdapter;
    /* access modifiers changed from: private */
    public View playbackSpeedButton;
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
    private Resources resources;
    /* access modifiers changed from: private */
    public final View rewindButton;
    private final TextView rewindButtonTextView;
    private long rewindMs;
    /* access modifiers changed from: private */
    public boolean scrubbing;
    /* access modifiers changed from: private */
    public SettingsAdapter settingsAdapter;
    /* access modifiers changed from: private */
    public View settingsButton;
    private RecyclerView settingsView;
    /* access modifiers changed from: private */
    public PopupWindow settingsWindow;
    private int settingsWindowMargin;
    private boolean showMultiWindowTimeBar;
    private int showTimeoutMs;
    /* access modifiers changed from: private */
    public final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;
    /* access modifiers changed from: private */
    public ImageView subtitleButton;
    /* access modifiers changed from: private */
    public final Drawable subtitleOffButtonDrawable;
    /* access modifiers changed from: private */
    public final String subtitleOffContentDescription;
    /* access modifiers changed from: private */
    public final Drawable subtitleOnButtonDrawable;
    /* access modifiers changed from: private */
    public final String subtitleOnContentDescription;
    /* access modifiers changed from: private */
    public TrackSelectionAdapter textTrackSelectionAdapter;
    private final TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private TrackNameProvider trackNameProvider;
    /* access modifiers changed from: private */
    public DefaultTrackSelector trackSelector;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<VisibilityListener> visibilityListeners;
    private final View vrButton;
    private final Timeline.Window window;

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$AudioTrackSelectionAdapter */
    private final class AudioTrackSelectionAdapter extends TrackSelectionAdapter {
        private AudioTrackSelectionAdapter() {
            super();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolderAtZeroPosition$0(View view) {
            if (StyledPlayerControlView.this.trackSelector != null) {
                DefaultTrackSelector.ParametersBuilder buildUpon = StyledPlayerControlView.this.trackSelector.getParameters().buildUpon();
                for (int i = 0; i < this.rendererIndices.size(); i++) {
                    buildUpon = buildUpon.clearSelectionOverrides(this.rendererIndices.get(i).intValue());
                }
                ((DefaultTrackSelector) Assertions.checkNotNull(StyledPlayerControlView.this.trackSelector)).setParameters(buildUpon);
            }
            StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, StyledPlayerControlView.this.getResources().getString(C6934R.string.exo_track_selection_auto));
            StyledPlayerControlView.this.settingsWindow.dismiss();
        }

        public void init(List<Integer> list, List<TrackInfo> list2, MappingTrackSelector.MappedTrackInfo mappedTrackInfo) {
            boolean z;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    z = false;
                    break;
                }
                int intValue = list.get(i2).intValue();
                TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(intValue);
                if (StyledPlayerControlView.this.trackSelector != null && StyledPlayerControlView.this.trackSelector.getParameters().hasSelectionOverride(intValue, trackGroups)) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (!list2.isEmpty()) {
                if (z) {
                    while (true) {
                        if (i >= list2.size()) {
                            break;
                        }
                        TrackInfo trackInfo = list2.get(i);
                        if (trackInfo.selected) {
                            StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, trackInfo.trackName);
                            break;
                        }
                        i++;
                    }
                } else {
                    StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, StyledPlayerControlView.this.getResources().getString(C6934R.string.exo_track_selection_auto));
                }
            } else {
                StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, StyledPlayerControlView.this.getResources().getString(C6934R.string.exo_track_selection_none));
            }
            this.rendererIndices = list;
            this.tracks = list2;
            this.mappedTrackInfo = mappedTrackInfo;
        }

        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder) {
            boolean z;
            subSettingViewHolder.textView.setText(C6934R.string.exo_track_selection_auto);
            DefaultTrackSelector.Parameters parameters = ((DefaultTrackSelector) Assertions.checkNotNull(StyledPlayerControlView.this.trackSelector)).getParameters();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= this.rendererIndices.size()) {
                    z = false;
                    break;
                }
                int intValue = this.rendererIndices.get(i2).intValue();
                if (parameters.hasSelectionOverride(intValue, ((MappingTrackSelector.MappedTrackInfo) Assertions.checkNotNull(this.mappedTrackInfo)).getTrackGroups(intValue))) {
                    z = true;
                    break;
                }
                i2++;
            }
            View view = subSettingViewHolder.checkView;
            if (z) {
                i = 4;
            }
            view.setVisibility(i);
            subSettingViewHolder.itemView.setOnClickListener(new C6972n(this));
        }

        public void onTrackSelection(String str) {
            StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, str);
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$ComponentListener */
    private final class ComponentListener implements Player.EventListener, TimeBar.OnScrubListener, View.OnClickListener, PopupWindow.OnDismissListener {
        private ComponentListener() {
        }

        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            C6808p0.m28583a(this, commands);
        }

        public void onClick(View view) {
            Player access$800 = StyledPlayerControlView.this.player;
            if (access$800 != null) {
                StyledPlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
                if (StyledPlayerControlView.this.nextButton == view) {
                    StyledPlayerControlView.this.controlDispatcher.dispatchNext(access$800);
                } else if (StyledPlayerControlView.this.previousButton == view) {
                    StyledPlayerControlView.this.controlDispatcher.dispatchPrevious(access$800);
                } else if (StyledPlayerControlView.this.fastForwardButton == view) {
                    if (access$800.getPlaybackState() != 4) {
                        StyledPlayerControlView.this.controlDispatcher.dispatchFastForward(access$800);
                    }
                } else if (StyledPlayerControlView.this.rewindButton == view) {
                    StyledPlayerControlView.this.controlDispatcher.dispatchRewind(access$800);
                } else if (StyledPlayerControlView.this.playPauseButton == view) {
                    StyledPlayerControlView.this.dispatchPlayPause(access$800);
                } else if (StyledPlayerControlView.this.repeatToggleButton == view) {
                    StyledPlayerControlView.this.controlDispatcher.dispatchSetRepeatMode(access$800, RepeatModeUtil.getNextRepeatMode(access$800.getRepeatMode(), StyledPlayerControlView.this.repeatToggleModes));
                } else if (StyledPlayerControlView.this.shuffleButton == view) {
                    StyledPlayerControlView.this.controlDispatcher.dispatchSetShuffleModeEnabled(access$800, !access$800.getShuffleModeEnabled());
                } else if (StyledPlayerControlView.this.settingsButton == view) {
                    StyledPlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                    StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                    styledPlayerControlView.displaySettingsWindow(styledPlayerControlView.settingsAdapter);
                } else if (StyledPlayerControlView.this.playbackSpeedButton == view) {
                    StyledPlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                    StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                    styledPlayerControlView2.displaySettingsWindow(styledPlayerControlView2.playbackSpeedAdapter);
                } else if (StyledPlayerControlView.this.audioTrackButton == view) {
                    StyledPlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                    StyledPlayerControlView styledPlayerControlView3 = StyledPlayerControlView.this;
                    styledPlayerControlView3.displaySettingsWindow(styledPlayerControlView3.audioTrackSelectionAdapter);
                } else if (StyledPlayerControlView.this.subtitleButton == view) {
                    StyledPlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                    StyledPlayerControlView styledPlayerControlView4 = StyledPlayerControlView.this;
                    styledPlayerControlView4.displaySettingsWindow(styledPlayerControlView4.textTrackSelectionAdapter);
                }
            }
        }

        public void onDismiss() {
            if (StyledPlayerControlView.this.needToHideBars) {
                StyledPlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            }
        }

        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(5, 6)) {
                StyledPlayerControlView.this.updatePlayPauseButton();
            }
            if (events.containsAny(5, 6, 8)) {
                StyledPlayerControlView.this.updateProgress();
            }
            if (events.contains(9)) {
                StyledPlayerControlView.this.updateRepeatModeButton();
            }
            if (events.contains(10)) {
                StyledPlayerControlView.this.updateShuffleButton();
            }
            if (events.containsAny(9, 10, 12, 0)) {
                StyledPlayerControlView.this.updateNavigation();
            }
            if (events.containsAny(12, 0)) {
                StyledPlayerControlView.this.updateTimeline();
            }
            if (events.contains(13)) {
                StyledPlayerControlView.this.updatePlaybackSpeedList();
            }
            if (events.contains(2)) {
                StyledPlayerControlView.this.updateTrackLists();
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
            if (StyledPlayerControlView.this.positionView != null) {
                StyledPlayerControlView.this.positionView.setText(Util.getStringForTime(StyledPlayerControlView.this.formatBuilder, StyledPlayerControlView.this.formatter, j));
            }
        }

        public void onScrubStart(TimeBar timeBar, long j) {
            boolean unused = StyledPlayerControlView.this.scrubbing = true;
            if (StyledPlayerControlView.this.positionView != null) {
                StyledPlayerControlView.this.positionView.setText(Util.getStringForTime(StyledPlayerControlView.this.formatBuilder, StyledPlayerControlView.this.formatter, j));
            }
            StyledPlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
        }

        public void onScrubStop(TimeBar timeBar, long j, boolean z) {
            boolean unused = StyledPlayerControlView.this.scrubbing = false;
            if (!z && StyledPlayerControlView.this.player != null) {
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.seekToTimeBarPosition(styledPlayerControlView.player, j);
            }
            StyledPlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
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

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$OnFullScreenModeChangedListener */
    public interface OnFullScreenModeChangedListener {
        void onFullScreenModeChanged(boolean z);
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$PlaybackSpeedAdapter */
    private final class PlaybackSpeedAdapter extends RecyclerView.C1092h<SubSettingViewHolder> {
        private final String[] playbackSpeedTexts;
        private final int[] playbackSpeedsMultBy100;
        private int selectedIndex;

        public PlaybackSpeedAdapter(String[] strArr, int[] iArr) {
            this.playbackSpeedTexts = strArr;
            this.playbackSpeedsMultBy100 = iArr;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$0(int i, View view) {
            if (i != this.selectedIndex) {
                StyledPlayerControlView.this.setPlaybackSpeed(((float) this.playbackSpeedsMultBy100[i]) / 100.0f);
            }
            StyledPlayerControlView.this.settingsWindow.dismiss();
        }

        public int getItemCount() {
            return this.playbackSpeedTexts.length;
        }

        public String getSelectedText() {
            return this.playbackSpeedTexts[this.selectedIndex];
        }

        public void updateSelectedIndex(float f) {
            int round = Math.round(f * 100.0f);
            int i = 0;
            int i2 = 0;
            int i3 = Integer.MAX_VALUE;
            while (true) {
                int[] iArr = this.playbackSpeedsMultBy100;
                if (i < iArr.length) {
                    int abs = Math.abs(round - iArr[i]);
                    if (abs < i3) {
                        i2 = i;
                        i3 = abs;
                    }
                    i++;
                } else {
                    this.selectedIndex = i2;
                    return;
                }
            }
        }

        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
            String[] strArr = this.playbackSpeedTexts;
            if (i < strArr.length) {
                subSettingViewHolder.textView.setText(strArr[i]);
            }
            subSettingViewHolder.checkView.setVisibility(i == this.selectedIndex ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new C6973o(this, i));
        }

        public SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(C6934R.layout.exo_styled_sub_settings_list_item, (ViewGroup) null));
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$ProgressUpdateListener */
    public interface ProgressUpdateListener {
        void onProgressUpdate(long j, long j2);
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingViewHolder */
    private final class SettingViewHolder extends RecyclerView.C1087c0 {
        /* access modifiers changed from: private */
        public final ImageView iconView;
        /* access modifiers changed from: private */
        public final TextView mainTextView;
        /* access modifiers changed from: private */
        public final TextView subTextView;

        public SettingViewHolder(View view) {
            super(view);
            this.mainTextView = (TextView) view.findViewById(C6934R.C6936id.exo_main_text);
            this.subTextView = (TextView) view.findViewById(C6934R.C6936id.exo_sub_text);
            this.iconView = (ImageView) view.findViewById(C6934R.C6936id.exo_icon);
            view.setOnClickListener(new C6974p(this));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view) {
            StyledPlayerControlView.this.onSettingViewClicked(getAdapterPosition());
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingsAdapter */
    private class SettingsAdapter extends RecyclerView.C1092h<SettingViewHolder> {
        private final Drawable[] iconIds;
        private final String[] mainTexts;
        private final String[] subTexts;

        public SettingsAdapter(String[] strArr, Drawable[] drawableArr) {
            this.mainTexts = strArr;
            this.subTexts = new String[strArr.length];
            this.iconIds = drawableArr;
        }

        public int getItemCount() {
            return this.mainTexts.length;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public void setSubTextAtPosition(int i, String str) {
            this.subTexts[i] = str;
        }

        public void onBindViewHolder(SettingViewHolder settingViewHolder, int i) {
            settingViewHolder.mainTextView.setText(this.mainTexts[i]);
            if (this.subTexts[i] == null) {
                settingViewHolder.subTextView.setVisibility(8);
            } else {
                settingViewHolder.subTextView.setText(this.subTexts[i]);
            }
            if (this.iconIds[i] == null) {
                settingViewHolder.iconView.setVisibility(8);
            } else {
                settingViewHolder.iconView.setImageDrawable(this.iconIds[i]);
            }
        }

        public SettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SettingViewHolder(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(C6934R.layout.exo_styled_settings_list_item, (ViewGroup) null));
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$SubSettingViewHolder */
    private static class SubSettingViewHolder extends RecyclerView.C1087c0 {
        public final View checkView;
        public final TextView textView;

        public SubSettingViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(C6934R.C6936id.exo_text);
            this.checkView = view.findViewById(C6934R.C6936id.exo_check);
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$TextTrackSelectionAdapter */
    private final class TextTrackSelectionAdapter extends TrackSelectionAdapter {
        private TextTrackSelectionAdapter() {
            super();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolderAtZeroPosition$0(View view) {
            if (StyledPlayerControlView.this.trackSelector != null) {
                DefaultTrackSelector.ParametersBuilder buildUpon = StyledPlayerControlView.this.trackSelector.getParameters().buildUpon();
                for (int i = 0; i < this.rendererIndices.size(); i++) {
                    int intValue = this.rendererIndices.get(i).intValue();
                    buildUpon = buildUpon.clearSelectionOverrides(intValue).setRendererDisabled(intValue, true);
                }
                ((DefaultTrackSelector) Assertions.checkNotNull(StyledPlayerControlView.this.trackSelector)).setParameters(buildUpon);
                StyledPlayerControlView.this.settingsWindow.dismiss();
            }
        }

        public void init(List<Integer> list, List<TrackInfo> list2, MappingTrackSelector.MappedTrackInfo mappedTrackInfo) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= list2.size()) {
                    break;
                } else if (list2.get(i).selected) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (StyledPlayerControlView.this.subtitleButton != null) {
                ImageView access$3600 = StyledPlayerControlView.this.subtitleButton;
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                access$3600.setImageDrawable(z ? styledPlayerControlView.subtitleOnButtonDrawable : styledPlayerControlView.subtitleOffButtonDrawable);
                StyledPlayerControlView.this.subtitleButton.setContentDescription(z ? StyledPlayerControlView.this.subtitleOnContentDescription : StyledPlayerControlView.this.subtitleOffContentDescription);
            }
            this.rendererIndices = list;
            this.tracks = list2;
            this.mappedTrackInfo = mappedTrackInfo;
        }

        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder) {
            boolean z;
            subSettingViewHolder.textView.setText(C6934R.string.exo_track_selection_none);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= this.tracks.size()) {
                    z = true;
                    break;
                } else if (this.tracks.get(i2).selected) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            View view = subSettingViewHolder.checkView;
            if (!z) {
                i = 4;
            }
            view.setVisibility(i);
            subSettingViewHolder.itemView.setOnClickListener(new C6975q(this));
        }

        public void onTrackSelection(String str) {
        }

        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
            super.onBindViewHolder(subSettingViewHolder, i);
            if (i > 0) {
                subSettingViewHolder.checkView.setVisibility(this.tracks.get(i + -1).selected ? 0 : 4);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackInfo */
    private static final class TrackInfo {
        public final int groupIndex;
        public final int rendererIndex;
        public final boolean selected;
        public final int trackIndex;
        public final String trackName;

        public TrackInfo(int i, int i2, int i3, String str, boolean z) {
            this.rendererIndex = i;
            this.groupIndex = i2;
            this.trackIndex = i3;
            this.trackName = str;
            this.selected = z;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackSelectionAdapter */
    private abstract class TrackSelectionAdapter extends RecyclerView.C1092h<SubSettingViewHolder> {
        protected MappingTrackSelector.MappedTrackInfo mappedTrackInfo = null;
        protected List<Integer> rendererIndices = new ArrayList();
        protected List<TrackInfo> tracks = new ArrayList();

        public TrackSelectionAdapter() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$0(TrackInfo trackInfo, View view) {
            if (this.mappedTrackInfo != null && StyledPlayerControlView.this.trackSelector != null) {
                DefaultTrackSelector.ParametersBuilder buildUpon = StyledPlayerControlView.this.trackSelector.getParameters().buildUpon();
                for (int i = 0; i < this.rendererIndices.size(); i++) {
                    int intValue = this.rendererIndices.get(i).intValue();
                    if (intValue == trackInfo.rendererIndex) {
                        buildUpon = buildUpon.setSelectionOverride(intValue, ((MappingTrackSelector.MappedTrackInfo) Assertions.checkNotNull(this.mappedTrackInfo)).getTrackGroups(intValue), new DefaultTrackSelector.SelectionOverride(trackInfo.groupIndex, trackInfo.trackIndex)).setRendererDisabled(intValue, false);
                    } else {
                        buildUpon = buildUpon.clearSelectionOverrides(intValue).setRendererDisabled(intValue, true);
                    }
                }
                ((DefaultTrackSelector) Assertions.checkNotNull(StyledPlayerControlView.this.trackSelector)).setParameters(buildUpon);
                onTrackSelection(trackInfo.trackName);
                StyledPlayerControlView.this.settingsWindow.dismiss();
            }
        }

        public void clear() {
            this.tracks = Collections.emptyList();
            this.mappedTrackInfo = null;
        }

        public int getItemCount() {
            if (this.tracks.isEmpty()) {
                return 0;
            }
            return this.tracks.size() + 1;
        }

        public abstract void init(List<Integer> list, List<TrackInfo> list2, MappingTrackSelector.MappedTrackInfo mappedTrackInfo2);

        public abstract void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder);

        public abstract void onTrackSelection(String str);

        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
            if (StyledPlayerControlView.this.trackSelector != null && this.mappedTrackInfo != null) {
                if (i == 0) {
                    onBindViewHolderAtZeroPosition(subSettingViewHolder);
                    return;
                }
                boolean z = true;
                TrackInfo trackInfo = this.tracks.get(i - 1);
                int i2 = 0;
                if (!((DefaultTrackSelector) Assertions.checkNotNull(StyledPlayerControlView.this.trackSelector)).getParameters().hasSelectionOverride(trackInfo.rendererIndex, this.mappedTrackInfo.getTrackGroups(trackInfo.rendererIndex)) || !trackInfo.selected) {
                    z = false;
                }
                subSettingViewHolder.textView.setText(trackInfo.trackName);
                View view = subSettingViewHolder.checkView;
                if (!z) {
                    i2 = 4;
                }
                view.setVisibility(i2);
                subSettingViewHolder.itemView.setOnClickListener(new C6976s(this, trackInfo));
            }
        }

        public SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(C6934R.layout.exo_styled_sub_settings_list_item, (ViewGroup) null));
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$VisibilityListener */
    public interface VisibilityListener {
        void onVisibilityChange(int i);
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.ui");
    }

    public StyledPlayerControlView(Context context) {
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

    private void dispatchPause(Player player2) {
        this.controlDispatcher.dispatchSetPlayWhenReady(player2, false);
    }

    private void dispatchPlay(Player player2) {
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

    /* access modifiers changed from: private */
    public void dispatchPlayPause(Player player2) {
        int playbackState = player2.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !player2.getPlayWhenReady()) {
            dispatchPlay(player2);
        } else {
            dispatchPause(player2);
        }
    }

    /* access modifiers changed from: private */
    public void displaySettingsWindow(RecyclerView.C1092h<?> hVar) {
        this.settingsView.setAdapter(hVar);
        updateSettingsWindowSize();
        this.needToHideBars = false;
        this.settingsWindow.dismiss();
        this.needToHideBars = true;
        this.settingsWindow.showAsDropDown(this, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin);
    }

    private void gatherTrackInfosForAdapter(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int i, List<TrackInfo> list) {
        int i2 = i;
        TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i);
        TrackSelection trackSelection = ((Player) Assertions.checkNotNull(this.player)).getCurrentTrackSelections().get(i2);
        for (int i3 = 0; i3 < trackGroups.length; i3++) {
            TrackGroup trackGroup = trackGroups.get(i3);
            for (int i4 = 0; i4 < trackGroup.length; i4++) {
                Format format = trackGroup.getFormat(i4);
                if (mappedTrackInfo.getTrackSupport(i2, i3, i4) == 4) {
                    boolean z = (trackSelection == null || trackSelection.indexOf(format) == -1) ? false : true;
                    list.add(new TrackInfo(i, i3, i4, this.trackNameProvider.getTrackName(format), z));
                } else {
                    List<TrackInfo> list2 = list;
                }
            }
            MappingTrackSelector.MappedTrackInfo mappedTrackInfo2 = mappedTrackInfo;
            List<TrackInfo> list3 = list;
        }
    }

    private void initTrackSelectionAdapter() {
        DefaultTrackSelector defaultTrackSelector;
        MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo;
        this.textTrackSelectionAdapter.clear();
        this.audioTrackSelectionAdapter.clear();
        if (this.player != null && (defaultTrackSelector = this.trackSelector) != null && (currentMappedTrackInfo = defaultTrackSelector.getCurrentMappedTrackInfo()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (int i = 0; i < currentMappedTrackInfo.getRendererCount(); i++) {
                if (currentMappedTrackInfo.getRendererType(i) == 3 && this.controlViewLayoutManager.getShowButton(this.subtitleButton)) {
                    gatherTrackInfosForAdapter(currentMappedTrackInfo, i, arrayList);
                    arrayList3.add(Integer.valueOf(i));
                } else if (currentMappedTrackInfo.getRendererType(i) == 1) {
                    gatherTrackInfosForAdapter(currentMappedTrackInfo, i, arrayList2);
                    arrayList4.add(Integer.valueOf(i));
                }
            }
            this.textTrackSelectionAdapter.init(arrayList3, arrayList, currentMappedTrackInfo);
            this.audioTrackSelectionAdapter.init(arrayList4, arrayList2, currentMappedTrackInfo);
        }
    }

    private static void initializeFullScreenButton(View view, View.OnClickListener onClickListener) {
        if (view != null) {
            view.setVisibility(8);
            view.setOnClickListener(onClickListener);
        }
    }

    @SuppressLint({"InlinedApi"})
    private static boolean isHandledMediaKey(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* access modifiers changed from: private */
    public void onFullScreenButtonClicked(View view) {
        if (this.onFullScreenModeChangedListener != null) {
            boolean z = !this.isFullScreen;
            this.isFullScreen = z;
            updateFullScreenButtonForState(this.fullScreenButton, z);
            updateFullScreenButtonForState(this.minimalFullScreenButton, this.isFullScreen);
            OnFullScreenModeChangedListener onFullScreenModeChangedListener2 = this.onFullScreenModeChangedListener;
            if (onFullScreenModeChangedListener2 != null) {
                onFullScreenModeChangedListener2.onFullScreenModeChanged(this.isFullScreen);
            }
        }
    }

    /* access modifiers changed from: private */
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        if (!(i3 - i == i7 - i5 && i9 == i10) && this.settingsWindow.isShowing()) {
            updateSettingsWindowSize();
            this.settingsWindow.update(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin, -1, -1);
        }
    }

    /* access modifiers changed from: private */
    public void onSettingViewClicked(int i) {
        if (i == 0) {
            displaySettingsWindow(this.playbackSpeedAdapter);
        } else if (i == 1) {
            displaySettingsWindow(this.audioTrackSelectionAdapter);
        } else {
            this.settingsWindow.dismiss();
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

    /* access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        Player player2 = this.player;
        if (player2 != null) {
            this.controlDispatcher.dispatchSetPlaybackParameters(player2, player2.getPlaybackParameters().withSpeed(f));
        }
    }

    private boolean shouldShowPauseButton() {
        Player player2 = this.player;
        if (player2 == null || player2.getPlaybackState() == 4 || this.player.getPlaybackState() == 1 || !this.player.getPlayWhenReady()) {
            return false;
        }
        return true;
    }

    private void updateButton(boolean z, View view) {
        if (view != null) {
            view.setEnabled(z);
            view.setAlpha(z ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
        }
    }

    private void updateFastForwardButton() {
        ControlDispatcher controlDispatcher2 = this.controlDispatcher;
        if (controlDispatcher2 instanceof DefaultControlDispatcher) {
            this.fastForwardMs = ((DefaultControlDispatcher) controlDispatcher2).getFastForwardIncrementMs();
        }
        int i = (int) (this.fastForwardMs / 1000);
        TextView textView = this.fastForwardButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
        View view = this.fastForwardButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(C6934R.plurals.exo_controls_fastforward_by_amount_description, i, new Object[]{Integer.valueOf(i)}));
        }
    }

    private void updateFullScreenButtonForState(ImageView imageView, boolean z) {
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(this.fullScreenExitDrawable);
                imageView.setContentDescription(this.fullScreenExitContentDescription);
                return;
            }
            imageView.setImageDrawable(this.fullScreenEnterDrawable);
            imageView.setContentDescription(this.fullScreenEnterContentDescription);
        }
    }

    private static void updateFullScreenButtonVisibility(View view, boolean z) {
        if (view != null) {
            if (z) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateNavigation() {
        /*
            r8 = this;
            boolean r0 = r8.isVisible()
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r8.isAttachedToWindow
            if (r0 != 0) goto L_0x000c
            goto L_0x00a1
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
            r1 = r5
            goto L_0x007c
        L_0x0078:
            r0 = 0
            r3 = 0
            r4 = 0
            r6 = 0
        L_0x007c:
            if (r1 == 0) goto L_0x0081
            r8.updateRewindButton()
        L_0x0081:
            if (r6 == 0) goto L_0x0086
            r8.updateFastForwardButton()
        L_0x0086:
            android.view.View r2 = r8.previousButton
            r8.updateButton(r4, r2)
            android.view.View r2 = r8.rewindButton
            r8.updateButton(r1, r2)
            android.view.View r1 = r8.fastForwardButton
            r8.updateButton(r6, r1)
            android.view.View r1 = r8.nextButton
            r8.updateButton(r0, r1)
            com.google.android.exoplayer2.ui.TimeBar r0 = r8.timeBar
            if (r0 == 0) goto L_0x00a1
            r0.setEnabled(r3)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p040ui.StyledPlayerControlView.updateNavigation():void");
    }

    /* access modifiers changed from: private */
    public void updatePlayPauseButton() {
        if (isVisible() && this.isAttachedToWindow && this.playPauseButton != null) {
            if (shouldShowPauseButton()) {
                ((ImageView) this.playPauseButton).setImageDrawable(this.resources.getDrawable(C6934R.C6935drawable.exo_styled_controls_pause));
                this.playPauseButton.setContentDescription(this.resources.getString(C6934R.string.exo_controls_pause_description));
                return;
            }
            ((ImageView) this.playPauseButton).setImageDrawable(this.resources.getDrawable(C6934R.C6935drawable.exo_styled_controls_play));
            this.playPauseButton.setContentDescription(this.resources.getString(C6934R.string.exo_controls_play_description));
        }
    }

    /* access modifiers changed from: private */
    public void updatePlaybackSpeedList() {
        Player player2 = this.player;
        if (player2 != null) {
            this.playbackSpeedAdapter.updateSelectedIndex(player2.getPlaybackParameters().speed);
            this.settingsAdapter.setSubTextAtPosition(0, this.playbackSpeedAdapter.getSelectedText());
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
                updateButton(false, imageView);
                return;
            }
            Player player2 = this.player;
            if (player2 == null) {
                updateButton(false, imageView);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, imageView);
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
        }
    }

    private void updateRewindButton() {
        ControlDispatcher controlDispatcher2 = this.controlDispatcher;
        if (controlDispatcher2 instanceof DefaultControlDispatcher) {
            this.rewindMs = ((DefaultControlDispatcher) controlDispatcher2).getRewindIncrementMs();
        }
        int i = (int) (this.rewindMs / 1000);
        TextView textView = this.rewindButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
        View view = this.rewindButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(C6934R.plurals.exo_controls_rewind_by_amount_description, i, new Object[]{Integer.valueOf(i)}));
        }
    }

    private void updateSettingsWindowSize() {
        this.settingsView.measure(0, 0);
        this.settingsWindow.setWidth(Math.min(this.settingsView.getMeasuredWidth(), getWidth() - (this.settingsWindowMargin * 2)));
        this.settingsWindow.setHeight(Math.min(getHeight() - (this.settingsWindowMargin * 2), this.settingsView.getMeasuredHeight()));
    }

    /* access modifiers changed from: private */
    public void updateShuffleButton() {
        ImageView imageView;
        String str;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            Player player2 = this.player;
            if (!this.controlViewLayoutManager.getShowButton(imageView)) {
                updateButton(false, this.shuffleButton);
            } else if (player2 == null) {
                updateButton(false, this.shuffleButton);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
            } else {
                updateButton(true, this.shuffleButton);
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

    /* access modifiers changed from: private */
    public void updateTrackLists() {
        initTrackSelectionAdapter();
        updateButton(this.textTrackSelectionAdapter.getItemCount() > 0, this.subtitleButton);
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

    public Player getPlayer() {
        return this.player;
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public boolean getShowShuffleButton() {
        return this.controlViewLayoutManager.getShowButton(this.shuffleButton);
    }

    public boolean getShowSubtitleButton() {
        return this.controlViewLayoutManager.getShowButton(this.subtitleButton);
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public boolean getShowVrButton() {
        return this.controlViewLayoutManager.getShowButton(this.vrButton);
    }

    public void hide() {
        this.controlViewLayoutManager.hide();
    }

    public void hideImmediately() {
        this.controlViewLayoutManager.hideImmediately();
    }

    public boolean isAnimationEnabled() {
        return this.controlViewLayoutManager.isAnimationEnabled();
    }

    public boolean isFullyVisible() {
        return this.controlViewLayoutManager.isFullyVisible();
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    public void notifyOnVisibilityChange() {
        Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
        while (it.hasNext()) {
            it.next().onVisibilityChange(getVisibility());
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.controlViewLayoutManager.onAttachedToWindow();
        this.isAttachedToWindow = true;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
        updateAll();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.controlViewLayoutManager.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        this.controlViewLayoutManager.removeHideCallbacks();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.controlViewLayoutManager.onLayout(z, i, i2, i3, i4);
    }

    public void removeVisibilityListener(VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    /* access modifiers changed from: package-private */
    public void requestPlayPauseFocus() {
        View view = this.playPauseButton;
        if (view != null) {
            view.requestFocus();
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.controlViewLayoutManager.setAnimationEnabled(z);
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

    public void setOnFullScreenModeChangedListener(OnFullScreenModeChangedListener onFullScreenModeChangedListener2) {
        this.onFullScreenModeChangedListener = onFullScreenModeChangedListener2;
        boolean z = true;
        updateFullScreenButtonVisibility(this.fullScreenButton, onFullScreenModeChangedListener2 != null);
        ImageView imageView = this.minimalFullScreenButton;
        if (onFullScreenModeChangedListener2 == null) {
            z = false;
        }
        updateFullScreenButtonVisibility(imageView, z);
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
            if (player2 instanceof ExoPlayer) {
                TrackSelector trackSelector2 = ((ExoPlayer) player2).getTrackSelector();
                if (trackSelector2 instanceof DefaultTrackSelector) {
                    this.trackSelector = (DefaultTrackSelector) trackSelector2;
                }
            } else {
                this.trackSelector = null;
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
        boolean z = false;
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
        StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager = this.controlViewLayoutManager;
        ImageView imageView = this.repeatToggleButton;
        if (i != 0) {
            z = true;
        }
        styledPlayerControlViewLayoutManager.setShowButton(imageView, z);
        updateRepeatModeButton();
    }

    public void setShowFastForwardButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.fastForwardButton, z);
        updateNavigation();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.showMultiWindowTimeBar = z;
        updateTimeline();
    }

    public void setShowNextButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.nextButton, z);
        updateNavigation();
    }

    public void setShowPreviousButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.previousButton, z);
        updateNavigation();
    }

    public void setShowRewindButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.rewindButton, z);
        updateNavigation();
    }

    public void setShowShuffleButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.shuffleButton, z);
        updateShuffleButton();
    }

    public void setShowSubtitleButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.subtitleButton, z);
    }

    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs = i;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
    }

    public void setShowVrButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.vrButton, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.timeBarMinUpdateIntervalMs = Util.constrainValue(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.vrButton;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            updateButton(onClickListener != null, this.vrButton);
        }
    }

    public void show() {
        this.controlViewLayoutManager.show();
    }

    /* access modifiers changed from: package-private */
    public void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTrackLists();
        updatePlaybackSpeedList();
        updateTimeline();
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i) {
        return typedArray.getInt(C6934R.styleable.StyledPlayerControlView_repeat_toggle_modes, i);
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StyledPlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        ComponentListener componentListener2;
        boolean z10;
        AttributeSet attributeSet3 = attributeSet2;
        int i2 = C6934R.layout.exo_styled_player_control_view;
        this.rewindMs = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
        this.fastForwardMs = 15000;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        if (attributeSet3 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet3, C6934R.styleable.StyledPlayerControlView, 0, 0);
            try {
                this.rewindMs = (long) obtainStyledAttributes.getInt(C6934R.styleable.StyledPlayerControlView_rewind_increment, (int) this.rewindMs);
                this.fastForwardMs = (long) obtainStyledAttributes.getInt(C6934R.styleable.StyledPlayerControlView_fastforward_increment, (int) this.fastForwardMs);
                i2 = obtainStyledAttributes.getResourceId(C6934R.styleable.StyledPlayerControlView_controller_layout_id, i2);
                this.showTimeoutMs = obtainStyledAttributes.getInt(C6934R.styleable.StyledPlayerControlView_show_timeout, this.showTimeoutMs);
                this.repeatToggleModes = getRepeatToggleModes(obtainStyledAttributes, this.repeatToggleModes);
                boolean z11 = obtainStyledAttributes.getBoolean(C6934R.styleable.StyledPlayerControlView_show_rewind_button, true);
                boolean z12 = obtainStyledAttributes.getBoolean(C6934R.styleable.StyledPlayerControlView_show_fastforward_button, true);
                boolean z13 = obtainStyledAttributes.getBoolean(C6934R.styleable.StyledPlayerControlView_show_previous_button, true);
                boolean z14 = obtainStyledAttributes.getBoolean(C6934R.styleable.StyledPlayerControlView_show_next_button, true);
                boolean z15 = obtainStyledAttributes.getBoolean(C6934R.styleable.StyledPlayerControlView_show_shuffle_button, false);
                boolean z16 = obtainStyledAttributes.getBoolean(C6934R.styleable.StyledPlayerControlView_show_subtitle_button, false);
                boolean z17 = obtainStyledAttributes.getBoolean(C6934R.styleable.StyledPlayerControlView_show_vr_button, false);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(C6934R.styleable.StyledPlayerControlView_time_bar_min_update_interval, this.timeBarMinUpdateIntervalMs));
                boolean z18 = obtainStyledAttributes.getBoolean(C6934R.styleable.StyledPlayerControlView_animation_enabled, true);
                obtainStyledAttributes.recycle();
                z2 = z15;
                z = z16;
                z6 = z11;
                z5 = z12;
                boolean z19 = z17;
                z4 = z13;
                z8 = z18;
                z3 = z14;
                z7 = z19;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z8 = true;
            z7 = false;
            z6 = true;
            z5 = true;
            z4 = true;
            z3 = true;
            z2 = false;
            z = false;
        }
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        ComponentListener componentListener3 = new ComponentListener();
        this.componentListener = componentListener3;
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
        boolean z20 = z6;
        this.controlDispatcher = new DefaultControlDispatcher(this.fastForwardMs, this.rewindMs);
        this.updateProgressAction = new C6971m(this);
        this.durationView = (TextView) findViewById(C6934R.C6936id.exo_duration);
        this.positionView = (TextView) findViewById(C6934R.C6936id.exo_position);
        ImageView imageView = (ImageView) findViewById(C6934R.C6936id.exo_subtitle);
        this.subtitleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener3);
        }
        ImageView imageView2 = (ImageView) findViewById(C6934R.C6936id.exo_fullscreen);
        this.fullScreenButton = imageView2;
        initializeFullScreenButton(imageView2, new C6969k(this));
        ImageView imageView3 = (ImageView) findViewById(C6934R.C6936id.exo_minimal_fullscreen);
        this.minimalFullScreenButton = imageView3;
        initializeFullScreenButton(imageView3, new C6969k(this));
        View findViewById = findViewById(C6934R.C6936id.exo_settings);
        this.settingsButton = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(componentListener3);
        }
        View findViewById2 = findViewById(C6934R.C6936id.exo_playback_speed);
        this.playbackSpeedButton = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(componentListener3);
        }
        View findViewById3 = findViewById(C6934R.C6936id.exo_audio_track);
        this.audioTrackButton = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(componentListener3);
        }
        int i3 = C6934R.C6936id.exo_progress;
        TimeBar timeBar2 = (TimeBar) findViewById(i3);
        View findViewById4 = findViewById(C6934R.C6936id.exo_progress_placeholder);
        if (timeBar2 != null) {
            this.timeBar = timeBar2;
            componentListener2 = componentListener3;
            z9 = z8;
            z10 = z7;
        } else if (findViewById4 != null) {
            DefaultTimeBar defaultTimeBar = r2;
            componentListener2 = componentListener3;
            z9 = z8;
            z10 = z7;
            DefaultTimeBar defaultTimeBar2 = new DefaultTimeBar(context, (AttributeSet) null, 0, attributeSet2, C6934R.style.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(i3);
            defaultTimeBar.setLayoutParams(findViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById4.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById4);
            viewGroup.removeView(findViewById4);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.timeBar = defaultTimeBar;
        } else {
            componentListener2 = componentListener3;
            z9 = z8;
            z10 = z7;
            this.timeBar = null;
        }
        TimeBar timeBar3 = this.timeBar;
        ComponentListener componentListener4 = componentListener2;
        if (timeBar3 != null) {
            timeBar3.addListener(componentListener4);
        }
        View findViewById5 = findViewById(C6934R.C6936id.exo_play_pause);
        this.playPauseButton = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(componentListener4);
        }
        View findViewById6 = findViewById(C6934R.C6936id.exo_prev);
        this.previousButton = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(componentListener4);
        }
        View findViewById7 = findViewById(C6934R.C6936id.exo_next);
        this.nextButton = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(componentListener4);
        }
        Typeface f = C1523f.m7887f(context, C6934R.font.roboto_medium_numbers);
        View findViewById8 = findViewById(C6934R.C6936id.exo_rew);
        TextView textView = findViewById8 == null ? (TextView) findViewById(C6934R.C6936id.exo_rew_with_amount) : null;
        this.rewindButtonTextView = textView;
        if (textView != null) {
            textView.setTypeface(f);
        }
        findViewById8 = findViewById8 == null ? textView : findViewById8;
        this.rewindButton = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(componentListener4);
        }
        View findViewById9 = findViewById(C6934R.C6936id.exo_ffwd);
        TextView textView2 = findViewById9 == null ? (TextView) findViewById(C6934R.C6936id.exo_ffwd_with_amount) : null;
        this.fastForwardButtonTextView = textView2;
        if (textView2 != null) {
            textView2.setTypeface(f);
        }
        findViewById9 = findViewById9 == null ? textView2 : findViewById9;
        this.fastForwardButton = findViewById9;
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(componentListener4);
        }
        ImageView imageView4 = (ImageView) findViewById(C6934R.C6936id.exo_repeat_toggle);
        this.repeatToggleButton = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(componentListener4);
        }
        ImageView imageView5 = (ImageView) findViewById(C6934R.C6936id.exo_shuffle);
        this.shuffleButton = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(componentListener4);
        }
        Resources resources2 = context.getResources();
        this.resources = resources2;
        this.buttonAlphaEnabled = ((float) resources2.getInteger(C6934R.integer.exo_media_button_opacity_percentage_enabled)) / 100.0f;
        this.buttonAlphaDisabled = ((float) this.resources.getInteger(C6934R.integer.exo_media_button_opacity_percentage_disabled)) / 100.0f;
        View findViewById10 = findViewById(C6934R.C6936id.exo_vr);
        this.vrButton = findViewById10;
        if (findViewById10 != null) {
            updateButton(false, findViewById10);
        }
        StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager = new StyledPlayerControlViewLayoutManager(this);
        this.controlViewLayoutManager = styledPlayerControlViewLayoutManager;
        styledPlayerControlViewLayoutManager.setAnimationEnabled(z9);
        this.settingsAdapter = new SettingsAdapter(new String[]{this.resources.getString(C6934R.string.exo_controls_playback_speed), this.resources.getString(C6934R.string.exo_track_selection_title_audio)}, new Drawable[]{this.resources.getDrawable(C6934R.C6935drawable.exo_styled_controls_speed), this.resources.getDrawable(C6934R.C6935drawable.exo_styled_controls_audiotrack)});
        this.settingsWindowMargin = this.resources.getDimensionPixelSize(C6934R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(C6934R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.settingsView = recyclerView;
        recyclerView.setAdapter(this.settingsAdapter);
        this.settingsView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow(this.settingsView, -2, -2, true);
        this.settingsWindow = popupWindow;
        if (Util.SDK_INT < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        this.settingsWindow.setOnDismissListener(componentListener4);
        this.needToHideBars = true;
        this.trackNameProvider = new DefaultTrackNameProvider(getResources());
        this.subtitleOnButtonDrawable = this.resources.getDrawable(C6934R.C6935drawable.exo_styled_controls_subtitle_on);
        this.subtitleOffButtonDrawable = this.resources.getDrawable(C6934R.C6935drawable.exo_styled_controls_subtitle_off);
        this.subtitleOnContentDescription = this.resources.getString(C6934R.string.exo_controls_cc_enabled_description);
        this.subtitleOffContentDescription = this.resources.getString(C6934R.string.exo_controls_cc_disabled_description);
        this.textTrackSelectionAdapter = new TextTrackSelectionAdapter();
        this.audioTrackSelectionAdapter = new AudioTrackSelectionAdapter();
        this.playbackSpeedAdapter = new PlaybackSpeedAdapter(this.resources.getStringArray(C6934R.array.exo_playback_speeds), this.resources.getIntArray(C6934R.array.exo_speed_multiplied_by_100));
        this.fullScreenExitDrawable = this.resources.getDrawable(C6934R.C6935drawable.exo_styled_controls_fullscreen_exit);
        this.fullScreenEnterDrawable = this.resources.getDrawable(C6934R.C6935drawable.exo_styled_controls_fullscreen_enter);
        this.repeatOffButtonDrawable = this.resources.getDrawable(C6934R.C6935drawable.exo_styled_controls_repeat_off);
        this.repeatOneButtonDrawable = this.resources.getDrawable(C6934R.C6935drawable.exo_styled_controls_repeat_one);
        this.repeatAllButtonDrawable = this.resources.getDrawable(C6934R.C6935drawable.exo_styled_controls_repeat_all);
        this.shuffleOnButtonDrawable = this.resources.getDrawable(C6934R.C6935drawable.exo_styled_controls_shuffle_on);
        this.shuffleOffButtonDrawable = this.resources.getDrawable(C6934R.C6935drawable.exo_styled_controls_shuffle_off);
        this.fullScreenExitContentDescription = this.resources.getString(C6934R.string.exo_controls_fullscreen_exit_description);
        this.fullScreenEnterContentDescription = this.resources.getString(C6934R.string.exo_controls_fullscreen_enter_description);
        this.repeatOffButtonContentDescription = this.resources.getString(C6934R.string.exo_controls_repeat_off_description);
        this.repeatOneButtonContentDescription = this.resources.getString(C6934R.string.exo_controls_repeat_one_description);
        this.repeatAllButtonContentDescription = this.resources.getString(C6934R.string.exo_controls_repeat_all_description);
        this.shuffleOnContentDescription = this.resources.getString(C6934R.string.exo_controls_shuffle_on_description);
        this.shuffleOffContentDescription = this.resources.getString(C6934R.string.exo_controls_shuffle_off_description);
        this.controlViewLayoutManager.setShowButton((ViewGroup) findViewById(C6934R.C6936id.exo_bottom_bar), true);
        this.controlViewLayoutManager.setShowButton(this.fastForwardButton, z5);
        this.controlViewLayoutManager.setShowButton(this.rewindButton, z20);
        this.controlViewLayoutManager.setShowButton(this.previousButton, z4);
        this.controlViewLayoutManager.setShowButton(this.nextButton, z3);
        this.controlViewLayoutManager.setShowButton(this.shuffleButton, z2);
        this.controlViewLayoutManager.setShowButton(this.subtitleButton, z);
        this.controlViewLayoutManager.setShowButton(this.vrButton, z10);
        this.controlViewLayoutManager.setShowButton(this.repeatToggleButton, this.repeatToggleModes != 0);
        addOnLayoutChangeListener(new C6970l(this));
    }
}
