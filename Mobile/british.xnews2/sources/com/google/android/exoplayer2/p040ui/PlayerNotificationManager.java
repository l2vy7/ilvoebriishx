package com.google.android.exoplayer2.p040ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p007v4.media.session.MediaSessionCompat;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.C6808p0;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.DefaultControlDispatcher;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.PlaybackPreparer;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NotificationUtil;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p001a0.C0026i;
import p001a0.C0038l;
import p002a1.C0050a;

/* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager */
public class PlayerNotificationManager {
    private static final String ACTION_DISMISS = "com.google.android.exoplayer.dismiss";
    public static final String ACTION_FAST_FORWARD = "com.google.android.exoplayer.ffwd";
    public static final String ACTION_NEXT = "com.google.android.exoplayer.next";
    public static final String ACTION_PAUSE = "com.google.android.exoplayer.pause";
    public static final String ACTION_PLAY = "com.google.android.exoplayer.play";
    public static final String ACTION_PREVIOUS = "com.google.android.exoplayer.prev";
    public static final String ACTION_REWIND = "com.google.android.exoplayer.rewind";
    public static final String ACTION_STOP = "com.google.android.exoplayer.stop";
    public static final String EXTRA_INSTANCE_ID = "INSTANCE_ID";
    private static final int MSG_START_OR_UPDATE_NOTIFICATION = 0;
    private static final int MSG_UPDATE_NOTIFICATION_BITMAP = 1;
    private static int instanceIdCounter;
    private int badgeIconType;
    private C0026i.C0034e builder;
    private List<C0026i.C0027a> builderActions;
    private final String channelId;
    private int color;
    private boolean colorized;
    private final Context context;
    /* access modifiers changed from: private */
    public ControlDispatcher controlDispatcher;
    private int currentNotificationTag;
    /* access modifiers changed from: private */
    public final CustomActionReceiver customActionReceiver;
    /* access modifiers changed from: private */
    public final Map<String, C0026i.C0027a> customActions;
    private int defaults;
    private final PendingIntent dismissPendingIntent;
    private String groupKey;
    /* access modifiers changed from: private */
    public final int instanceId;
    private final IntentFilter intentFilter;
    /* access modifiers changed from: private */
    public boolean isNotificationStarted;
    private final Handler mainHandler;
    private final MediaDescriptionAdapter mediaDescriptionAdapter;
    private MediaSessionCompat.Token mediaSessionToken;
    private final NotificationBroadcastReceiver notificationBroadcastReceiver;
    private final int notificationId;
    private final NotificationListener notificationListener;
    private final C0038l notificationManager;
    private final Map<String, C0026i.C0027a> playbackActions;
    /* access modifiers changed from: private */
    public PlaybackPreparer playbackPreparer;
    /* access modifiers changed from: private */
    public Player player;
    private final Player.EventListener playerListener;
    private int priority;
    private int smallIconResourceId;
    private boolean useChronometer;
    private boolean useNextAction;
    private boolean useNextActionInCompactView;
    private boolean usePlayPauseActions;
    private boolean usePreviousAction;
    private boolean usePreviousActionInCompactView;
    private boolean useStopAction;
    private int visibility;
    private final Timeline.Window window;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$Priority */
    public @interface Priority {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$Visibility */
    public @interface Visibility {
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$BitmapCallback */
    public final class BitmapCallback {
        private final int notificationTag;

        public void onBitmap(Bitmap bitmap) {
            if (bitmap != null) {
                PlayerNotificationManager.this.postUpdateNotificationBitmap(bitmap, this.notificationTag);
            }
        }

        private BitmapCallback(int i) {
            this.notificationTag = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$Builder */
    public static class Builder {
        private int channelDescriptionResourceId;
        private final String channelId;
        private int channelImportance;
        private int channelNameResourceId;
        private final Context context;
        private CustomActionReceiver customActionReceiver;
        private int fastForwardActionIconResourceId;
        private String groupKey;
        private final MediaDescriptionAdapter mediaDescriptionAdapter;
        private int nextActionIconResourceId;
        private final int notificationId;
        private NotificationListener notificationListener;
        private int pauseActionIconResourceId;
        private int playActionIconResourceId;
        private int previousActionIconResourceId;
        private int rewindActionIconResourceId;
        private int smallIconResourceId;
        private int stopActionIconResourceId;

        public Builder(Context context2, int i, String str, MediaDescriptionAdapter mediaDescriptionAdapter2) {
            Assertions.checkArgument(i > 0);
            this.context = context2;
            this.notificationId = i;
            this.channelId = str;
            this.mediaDescriptionAdapter = mediaDescriptionAdapter2;
            this.channelImportance = 2;
            this.smallIconResourceId = C6934R.C6935drawable.exo_notification_small_icon;
            this.playActionIconResourceId = C6934R.C6935drawable.exo_notification_play;
            this.pauseActionIconResourceId = C6934R.C6935drawable.exo_notification_pause;
            this.stopActionIconResourceId = C6934R.C6935drawable.exo_notification_stop;
            this.rewindActionIconResourceId = C6934R.C6935drawable.exo_notification_rewind;
            this.fastForwardActionIconResourceId = C6934R.C6935drawable.exo_notification_fastforward;
            this.previousActionIconResourceId = C6934R.C6935drawable.exo_notification_previous;
            this.nextActionIconResourceId = C6934R.C6935drawable.exo_notification_next;
        }

        public PlayerNotificationManager build() {
            int i = this.channelNameResourceId;
            if (i != 0) {
                NotificationUtil.createNotificationChannel(this.context, this.channelId, i, this.channelDescriptionResourceId, this.channelImportance);
            }
            return new PlayerNotificationManager(this.context, this.channelId, this.notificationId, this.mediaDescriptionAdapter, this.notificationListener, this.customActionReceiver, this.smallIconResourceId, this.playActionIconResourceId, this.pauseActionIconResourceId, this.stopActionIconResourceId, this.rewindActionIconResourceId, this.fastForwardActionIconResourceId, this.previousActionIconResourceId, this.nextActionIconResourceId, this.groupKey);
        }

        public Builder setChannelDescriptionResourceId(int i) {
            this.channelDescriptionResourceId = i;
            return this;
        }

        public Builder setChannelImportance(int i) {
            this.channelImportance = i;
            return this;
        }

        public Builder setChannelNameResourceId(int i) {
            this.channelNameResourceId = i;
            return this;
        }

        public Builder setCustomActionReceiver(CustomActionReceiver customActionReceiver2) {
            this.customActionReceiver = customActionReceiver2;
            return this;
        }

        public Builder setFastForwardActionIconResourceId(int i) {
            this.fastForwardActionIconResourceId = i;
            return this;
        }

        public Builder setGroup(String str) {
            this.groupKey = str;
            return this;
        }

        public Builder setNextActionIconResourceId(int i) {
            this.nextActionIconResourceId = i;
            return this;
        }

        public Builder setNotificationListener(NotificationListener notificationListener2) {
            this.notificationListener = notificationListener2;
            return this;
        }

        public Builder setPauseActionIconResourceId(int i) {
            this.pauseActionIconResourceId = i;
            return this;
        }

        public Builder setPlayActionIconResourceId(int i) {
            this.playActionIconResourceId = i;
            return this;
        }

        public Builder setPreviousActionIconResourceId(int i) {
            this.previousActionIconResourceId = i;
            return this;
        }

        public Builder setRewindActionIconResourceId(int i) {
            this.rewindActionIconResourceId = i;
            return this;
        }

        public Builder setSmallIconResourceId(int i) {
            this.smallIconResourceId = i;
            return this;
        }

        public Builder setStopActionIconResourceId(int i) {
            this.stopActionIconResourceId = i;
            return this;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$CustomActionReceiver */
    public interface CustomActionReceiver {
        Map<String, C0026i.C0027a> createCustomActions(Context context, int i);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String str, Intent intent);
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$MediaDescriptionAdapter */
    public interface MediaDescriptionAdapter {
        PendingIntent createCurrentContentIntent(Player player);

        CharSequence getCurrentContentText(Player player);

        CharSequence getCurrentContentTitle(Player player);

        Bitmap getCurrentLargeIcon(Player player, BitmapCallback bitmapCallback);

        CharSequence getCurrentSubText(Player player);
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$NotificationBroadcastReceiver */
    private class NotificationBroadcastReceiver extends BroadcastReceiver {
        private NotificationBroadcastReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            Player access$600 = PlayerNotificationManager.this.player;
            if (access$600 != null && PlayerNotificationManager.this.isNotificationStarted && intent.getIntExtra(PlayerNotificationManager.EXTRA_INSTANCE_ID, PlayerNotificationManager.this.instanceId) == PlayerNotificationManager.this.instanceId) {
                String action = intent.getAction();
                if (PlayerNotificationManager.ACTION_PLAY.equals(action)) {
                    if (access$600.getPlaybackState() == 1) {
                        if (PlayerNotificationManager.this.playbackPreparer != null) {
                            PlayerNotificationManager.this.playbackPreparer.preparePlayback();
                        } else {
                            PlayerNotificationManager.this.controlDispatcher.dispatchPrepare(access$600);
                        }
                    } else if (access$600.getPlaybackState() == 4) {
                        PlayerNotificationManager.this.controlDispatcher.dispatchSeekTo(access$600, access$600.getCurrentWindowIndex(), C6540C.TIME_UNSET);
                    }
                    PlayerNotificationManager.this.controlDispatcher.dispatchSetPlayWhenReady(access$600, true);
                } else if (PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchSetPlayWhenReady(access$600, false);
                } else if (PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchPrevious(access$600);
                } else if (PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchRewind(access$600);
                } else if (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action)) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchFastForward(access$600);
                } else if (PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchNext(access$600);
                } else if (PlayerNotificationManager.ACTION_STOP.equals(action)) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchStop(access$600, true);
                } else if (PlayerNotificationManager.ACTION_DISMISS.equals(action)) {
                    PlayerNotificationManager.this.stopNotification(true);
                } else if (action != null && PlayerNotificationManager.this.customActionReceiver != null && PlayerNotificationManager.this.customActions.containsKey(action)) {
                    PlayerNotificationManager.this.customActionReceiver.onCustomAction(access$600, action, intent);
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$NotificationListener */
    public interface NotificationListener {
        void onNotificationCancelled(int i, boolean z);

        void onNotificationPosted(int i, Notification notification, boolean z);
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$PlayerListener */
    private class PlayerListener implements Player.EventListener {
        private PlayerListener() {
        }

        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            C6808p0.m28583a(this, commands);
        }

        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(5, 6, 8, 0, 13, 12, 9, 10)) {
                PlayerNotificationManager.this.postStartOrUpdateNotification();
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

    private static PendingIntent createBroadcastIntent(String str, Context context2, int i) {
        Intent intent = new Intent(str).setPackage(context2.getPackageName());
        intent.putExtra(EXTRA_INSTANCE_ID, i);
        return PendingIntent.getBroadcast(context2, i, intent, 134217728);
    }

    private static Map<String, C0026i.C0027a> createPlaybackActions(Context context2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION_PLAY, new C0026i.C0027a(i2, (CharSequence) context2.getString(C6934R.string.exo_controls_play_description), createBroadcastIntent(ACTION_PLAY, context2, i)));
        hashMap.put(ACTION_PAUSE, new C0026i.C0027a(i3, (CharSequence) context2.getString(C6934R.string.exo_controls_pause_description), createBroadcastIntent(ACTION_PAUSE, context2, i)));
        hashMap.put(ACTION_STOP, new C0026i.C0027a(i4, (CharSequence) context2.getString(C6934R.string.exo_controls_stop_description), createBroadcastIntent(ACTION_STOP, context2, i)));
        hashMap.put(ACTION_REWIND, new C0026i.C0027a(i5, (CharSequence) context2.getString(C6934R.string.exo_controls_rewind_description), createBroadcastIntent(ACTION_REWIND, context2, i)));
        hashMap.put(ACTION_FAST_FORWARD, new C0026i.C0027a(i6, (CharSequence) context2.getString(C6934R.string.exo_controls_fastforward_description), createBroadcastIntent(ACTION_FAST_FORWARD, context2, i)));
        hashMap.put(ACTION_PREVIOUS, new C0026i.C0027a(i7, (CharSequence) context2.getString(C6934R.string.exo_controls_previous_description), createBroadcastIntent(ACTION_PREVIOUS, context2, i)));
        hashMap.put(ACTION_NEXT, new C0026i.C0027a(i8, (CharSequence) context2.getString(C6934R.string.exo_controls_next_description), createBroadcastIntent(ACTION_NEXT, context2, i)));
        return hashMap;
    }

    @Deprecated
    public static PlayerNotificationManager createWithNotificationChannel(Context context2, String str, int i, int i2, MediaDescriptionAdapter mediaDescriptionAdapter2) {
        return createWithNotificationChannel(context2, str, i, 0, i2, mediaDescriptionAdapter2);
    }

    /* access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            Player player2 = this.player;
            if (player2 != null) {
                startOrUpdateNotification(player2, (Bitmap) null);
            }
        } else if (i != 1) {
            return false;
        } else {
            Player player3 = this.player;
            if (player3 != null && this.isNotificationStarted && this.currentNotificationTag == message.arg1) {
                startOrUpdateNotification(player3, (Bitmap) message.obj);
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void postStartOrUpdateNotification() {
        if (!this.mainHandler.hasMessages(0)) {
            this.mainHandler.sendEmptyMessage(0);
        }
    }

    /* access modifiers changed from: private */
    public void postUpdateNotificationBitmap(Bitmap bitmap, int i) {
        this.mainHandler.obtainMessage(1, i, -1, bitmap).sendToTarget();
    }

    private static void setLargeIcon(C0026i.C0034e eVar, Bitmap bitmap) {
        eVar.mo89v(bitmap);
    }

    private boolean shouldShowPauseButton(Player player2) {
        if (player2.getPlaybackState() == 4 || player2.getPlaybackState() == 1 || !player2.getPlayWhenReady()) {
            return false;
        }
        return true;
    }

    private void startOrUpdateNotification(Player player2, Bitmap bitmap) {
        boolean ongoing = getOngoing(player2);
        C0026i.C0034e createNotification = createNotification(player2, this.builder, ongoing, bitmap);
        this.builder = createNotification;
        boolean z = false;
        if (createNotification == null) {
            stopNotification(false);
            return;
        }
        Notification c = createNotification.mo73c();
        this.notificationManager.mo106f(this.notificationId, c);
        if (!this.isNotificationStarted) {
            this.context.registerReceiver(this.notificationBroadcastReceiver, this.intentFilter);
        }
        NotificationListener notificationListener2 = this.notificationListener;
        if (notificationListener2 != null) {
            int i = this.notificationId;
            if (ongoing || !this.isNotificationStarted) {
                z = true;
            }
            notificationListener2.onNotificationPosted(i, c, z);
        }
        this.isNotificationStarted = true;
    }

    /* access modifiers changed from: private */
    public void stopNotification(boolean z) {
        if (this.isNotificationStarted) {
            this.isNotificationStarted = false;
            this.mainHandler.removeMessages(0);
            this.notificationManager.mo104b(this.notificationId);
            this.context.unregisterReceiver(this.notificationBroadcastReceiver);
            NotificationListener notificationListener2 = this.notificationListener;
            if (notificationListener2 != null) {
                notificationListener2.onNotificationCancelled(this.notificationId, z);
            }
        }
    }

    /* access modifiers changed from: protected */
    public C0026i.C0034e createNotification(Player player2, C0026i.C0034e eVar, boolean z, Bitmap bitmap) {
        C0026i.C0027a aVar;
        if (player2.getPlaybackState() != 1 || !player2.getCurrentTimeline().isEmpty()) {
            List<String> actions = getActions(player2);
            ArrayList arrayList = new ArrayList(actions.size());
            for (int i = 0; i < actions.size(); i++) {
                String str = actions.get(i);
                if (this.playbackActions.containsKey(str)) {
                    aVar = this.playbackActions.get(str);
                } else {
                    aVar = this.customActions.get(str);
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            if (eVar == null || !arrayList.equals(this.builderActions)) {
                eVar = new C0026i.C0034e(this.context, this.channelId);
                this.builderActions = arrayList;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    eVar.mo72b((C0026i.C0027a) arrayList.get(i2));
                }
            }
            C0050a aVar2 = new C0050a();
            MediaSessionCompat.Token token = this.mediaSessionToken;
            if (token != null) {
                aVar2.mo146t(token);
            }
            aVar2.mo147u(getActionIndicesForCompactView(actions, player2));
            aVar2.mo148v(!z);
            aVar2.mo145s(this.dismissPendingIntent);
            eVar.mo65D(aVar2);
            eVar.mo87s(this.dismissPendingIntent);
            eVar.mo79k(this.badgeIconType).mo91x(z).mo81m(this.color).mo82n(this.colorized).mo63B(this.smallIconResourceId).mo69H(this.visibility).mo92y(this.priority).mo86r(this.defaults);
            if (Util.SDK_INT < 21 || !this.useChronometer || !player2.isPlaying() || player2.isPlayingAd() || player2.isCurrentWindowDynamic() || player2.getPlaybackParameters().speed != 1.0f) {
                eVar.mo62A(false).mo68G(false);
            } else {
                eVar.mo70I(System.currentTimeMillis() - player2.getContentPosition()).mo62A(true).mo68G(true);
            }
            eVar.mo85q(this.mediaDescriptionAdapter.getCurrentContentTitle(player2));
            eVar.mo84p(this.mediaDescriptionAdapter.getCurrentContentText(player2));
            eVar.mo66E(this.mediaDescriptionAdapter.getCurrentSubText(player2));
            if (bitmap == null) {
                MediaDescriptionAdapter mediaDescriptionAdapter2 = this.mediaDescriptionAdapter;
                int i3 = this.currentNotificationTag + 1;
                this.currentNotificationTag = i3;
                bitmap = mediaDescriptionAdapter2.getCurrentLargeIcon(player2, new BitmapCallback(i3));
            }
            setLargeIcon(eVar, bitmap);
            eVar.mo83o(this.mediaDescriptionAdapter.createCurrentContentIntent(player2));
            String str2 = this.groupKey;
            if (str2 != null) {
                eVar.mo88u(str2);
            }
            return eVar;
        }
        this.builderActions = null;
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] getActionIndicesForCompactView(java.util.List<java.lang.String> r7, com.google.android.exoplayer2.Player r8) {
        /*
            r6 = this;
            java.lang.String r0 = "com.google.android.exoplayer.pause"
            int r0 = r7.indexOf(r0)
            java.lang.String r1 = "com.google.android.exoplayer.play"
            int r1 = r7.indexOf(r1)
            boolean r2 = r6.usePreviousActionInCompactView
            r3 = -1
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "com.google.android.exoplayer.prev"
            int r2 = r7.indexOf(r2)
            goto L_0x0019
        L_0x0018:
            r2 = -1
        L_0x0019:
            boolean r4 = r6.useNextActionInCompactView
            if (r4 == 0) goto L_0x0024
            java.lang.String r4 = "com.google.android.exoplayer.next"
            int r7 = r7.indexOf(r4)
            goto L_0x0025
        L_0x0024:
            r7 = -1
        L_0x0025:
            r4 = 3
            int[] r4 = new int[r4]
            r5 = 0
            if (r2 == r3) goto L_0x002e
            r4[r5] = r2
            r5 = 1
        L_0x002e:
            boolean r8 = r6.shouldShowPauseButton(r8)
            if (r0 == r3) goto L_0x003c
            if (r8 == 0) goto L_0x003c
            int r8 = r5 + 1
            r4[r5] = r0
        L_0x003a:
            r5 = r8
            goto L_0x0045
        L_0x003c:
            if (r1 == r3) goto L_0x0045
            if (r8 != 0) goto L_0x0045
            int r8 = r5 + 1
            r4[r5] = r1
            goto L_0x003a
        L_0x0045:
            if (r7 == r3) goto L_0x004c
            int r8 = r5 + 1
            r4[r5] = r7
            r5 = r8
        L_0x004c:
            int[] r7 = java.util.Arrays.copyOf(r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p040ui.PlayerNotificationManager.getActionIndicesForCompactView(java.util.List, com.google.android.exoplayer2.Player):int[]");
    }

    /* access modifiers changed from: protected */
    public List<String> getActions(Player player2) {
        boolean z;
        boolean z2;
        boolean z3;
        Timeline currentTimeline = player2.getCurrentTimeline();
        boolean z4 = false;
        if (currentTimeline.isEmpty() || player2.isPlayingAd()) {
            z3 = false;
            z2 = false;
            z = false;
        } else {
            boolean isCommandAvailable = player2.isCommandAvailable(4);
            currentTimeline.getWindow(player2.getCurrentWindowIndex(), this.window);
            boolean z5 = isCommandAvailable || !this.window.isLive() || player2.isCommandAvailable(6);
            z = isCommandAvailable && this.controlDispatcher.isRewindEnabled();
            z2 = isCommandAvailable && this.controlDispatcher.isFastForwardEnabled();
            if ((this.window.isLive() && this.window.isDynamic) || player2.isCommandAvailable(5)) {
                z4 = true;
            }
            z3 = z4;
            z4 = z5;
        }
        ArrayList arrayList = new ArrayList();
        if (this.usePreviousAction && z4) {
            arrayList.add(ACTION_PREVIOUS);
        }
        if (z) {
            arrayList.add(ACTION_REWIND);
        }
        if (this.usePlayPauseActions) {
            if (shouldShowPauseButton(player2)) {
                arrayList.add(ACTION_PAUSE);
            } else {
                arrayList.add(ACTION_PLAY);
            }
        }
        if (z2) {
            arrayList.add(ACTION_FAST_FORWARD);
        }
        if (this.useNextAction && z3) {
            arrayList.add(ACTION_NEXT);
        }
        CustomActionReceiver customActionReceiver2 = this.customActionReceiver;
        if (customActionReceiver2 != null) {
            arrayList.addAll(customActionReceiver2.getCustomActions(player2));
        }
        if (this.useStopAction) {
            arrayList.add(ACTION_STOP);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public boolean getOngoing(Player player2) {
        int playbackState = player2.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && player2.getPlayWhenReady();
    }

    public void invalidate() {
        if (this.isNotificationStarted) {
            postStartOrUpdateNotification();
        }
    }

    public final void setBadgeIconType(int i) {
        if (this.badgeIconType != i) {
            if (i == 0 || i == 1 || i == 2) {
                this.badgeIconType = i;
                invalidate();
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public final void setColor(int i) {
        if (this.color != i) {
            this.color = i;
            invalidate();
        }
    }

    public final void setColorized(boolean z) {
        if (this.colorized != z) {
            this.colorized = z;
            invalidate();
        }
    }

    public final void setControlDispatcher(ControlDispatcher controlDispatcher2) {
        if (this.controlDispatcher != controlDispatcher2) {
            this.controlDispatcher = controlDispatcher2;
            invalidate();
        }
    }

    public final void setDefaults(int i) {
        if (this.defaults != i) {
            this.defaults = i;
            invalidate();
        }
    }

    @Deprecated
    public final void setFastForwardIncrementMs(long j) {
        ControlDispatcher controlDispatcher2 = this.controlDispatcher;
        if (controlDispatcher2 instanceof DefaultControlDispatcher) {
            ((DefaultControlDispatcher) controlDispatcher2).setFastForwardIncrementMs(j);
            invalidate();
        }
    }

    public final void setMediaSessionToken(MediaSessionCompat.Token token) {
        if (!Util.areEqual(this.mediaSessionToken, token)) {
            this.mediaSessionToken = token;
            invalidate();
        }
    }

    @Deprecated
    public void setPlaybackPreparer(PlaybackPreparer playbackPreparer2) {
        this.playbackPreparer = playbackPreparer2;
    }

    public final void setPlayer(Player player2) {
        boolean z = true;
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        if (!(player2 == null || player2.getApplicationLooper() == Looper.getMainLooper())) {
            z = false;
        }
        Assertions.checkArgument(z);
        Player player3 = this.player;
        if (player3 != player2) {
            if (player3 != null) {
                player3.removeListener(this.playerListener);
                if (player2 == null) {
                    stopNotification(false);
                }
            }
            this.player = player2;
            if (player2 != null) {
                player2.addListener(this.playerListener);
                postStartOrUpdateNotification();
            }
        }
    }

    public final void setPriority(int i) {
        if (this.priority != i) {
            if (i == -2 || i == -1 || i == 0 || i == 1 || i == 2) {
                this.priority = i;
                invalidate();
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    @Deprecated
    public final void setRewindIncrementMs(long j) {
        ControlDispatcher controlDispatcher2 = this.controlDispatcher;
        if (controlDispatcher2 instanceof DefaultControlDispatcher) {
            ((DefaultControlDispatcher) controlDispatcher2).setRewindIncrementMs(j);
            invalidate();
        }
    }

    public final void setSmallIcon(int i) {
        if (this.smallIconResourceId != i) {
            this.smallIconResourceId = i;
            invalidate();
        }
    }

    public final void setUseChronometer(boolean z) {
        if (this.useChronometer != z) {
            this.useChronometer = z;
            invalidate();
        }
    }

    @Deprecated
    public final void setUseNavigationActions(boolean z) {
        setUseNextAction(z);
        setUsePreviousAction(z);
    }

    @Deprecated
    public final void setUseNavigationActionsInCompactView(boolean z) {
        setUseNextActionInCompactView(z);
        setUsePreviousActionInCompactView(z);
    }

    public void setUseNextAction(boolean z) {
        if (this.useNextAction != z) {
            this.useNextAction = z;
            invalidate();
        }
    }

    public void setUseNextActionInCompactView(boolean z) {
        if (this.useNextActionInCompactView != z) {
            this.useNextActionInCompactView = z;
            invalidate();
        }
    }

    public final void setUsePlayPauseActions(boolean z) {
        if (this.usePlayPauseActions != z) {
            this.usePlayPauseActions = z;
            invalidate();
        }
    }

    public void setUsePreviousAction(boolean z) {
        if (this.usePreviousAction != z) {
            this.usePreviousAction = z;
            invalidate();
        }
    }

    public void setUsePreviousActionInCompactView(boolean z) {
        if (this.usePreviousActionInCompactView != z) {
            this.usePreviousActionInCompactView = z;
            invalidate();
        }
    }

    public final void setUseStopAction(boolean z) {
        if (this.useStopAction != z) {
            this.useStopAction = z;
            invalidate();
        }
    }

    public final void setVisibility(int i) {
        if (this.visibility != i) {
            if (i == -1 || i == 0 || i == 1) {
                this.visibility = i;
                invalidate();
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Deprecated
    public PlayerNotificationManager(Context context2, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter2) {
        this(context2, str, i, mediaDescriptionAdapter2, (NotificationListener) null, (CustomActionReceiver) null);
    }

    @Deprecated
    public static PlayerNotificationManager createWithNotificationChannel(Context context2, String str, int i, int i2, int i3, MediaDescriptionAdapter mediaDescriptionAdapter2) {
        NotificationUtil.createNotificationChannel(context2, str, i, i2, 2);
        return new PlayerNotificationManager(context2, str, i3, mediaDescriptionAdapter2);
    }

    @Deprecated
    public PlayerNotificationManager(Context context2, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter2, NotificationListener notificationListener2) {
        this(context2, str, i, mediaDescriptionAdapter2, notificationListener2, (CustomActionReceiver) null);
    }

    @Deprecated
    public PlayerNotificationManager(Context context2, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter2, CustomActionReceiver customActionReceiver2) {
        this(context2, str, i, mediaDescriptionAdapter2, (NotificationListener) null, customActionReceiver2);
    }

    @Deprecated
    public static PlayerNotificationManager createWithNotificationChannel(Context context2, String str, int i, int i2, MediaDescriptionAdapter mediaDescriptionAdapter2, NotificationListener notificationListener2) {
        return createWithNotificationChannel(context2, str, i, 0, i2, mediaDescriptionAdapter2, notificationListener2);
    }

    @Deprecated
    public PlayerNotificationManager(Context context2, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter2, NotificationListener notificationListener2, CustomActionReceiver customActionReceiver2) {
        this(context2, str, i, mediaDescriptionAdapter2, notificationListener2, customActionReceiver2, C6934R.C6935drawable.exo_notification_small_icon, C6934R.C6935drawable.exo_notification_play, C6934R.C6935drawable.exo_notification_pause, C6934R.C6935drawable.exo_notification_stop, C6934R.C6935drawable.exo_notification_rewind, C6934R.C6935drawable.exo_notification_fastforward, C6934R.C6935drawable.exo_notification_previous, C6934R.C6935drawable.exo_notification_next, (String) null);
    }

    @Deprecated
    public static PlayerNotificationManager createWithNotificationChannel(Context context2, String str, int i, int i2, int i3, MediaDescriptionAdapter mediaDescriptionAdapter2, NotificationListener notificationListener2) {
        NotificationUtil.createNotificationChannel(context2, str, i, i2, 2);
        return new PlayerNotificationManager(context2, str, i3, mediaDescriptionAdapter2, notificationListener2);
    }

    private PlayerNotificationManager(Context context2, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter2, NotificationListener notificationListener2, CustomActionReceiver customActionReceiver2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str2) {
        Map<String, C0026i.C0027a> map;
        CustomActionReceiver customActionReceiver3 = customActionReceiver2;
        Context applicationContext = context2.getApplicationContext();
        this.context = applicationContext;
        this.channelId = str;
        this.notificationId = i;
        this.mediaDescriptionAdapter = mediaDescriptionAdapter2;
        this.notificationListener = notificationListener2;
        this.customActionReceiver = customActionReceiver3;
        this.smallIconResourceId = i2;
        this.groupKey = str2;
        this.controlDispatcher = new DefaultControlDispatcher();
        this.window = new Timeline.Window();
        int i10 = instanceIdCounter;
        instanceIdCounter = i10 + 1;
        this.instanceId = i10;
        this.mainHandler = Util.createHandler(Looper.getMainLooper(), new C6960f(this));
        this.notificationManager = C0038l.m149d(applicationContext);
        this.playerListener = new PlayerListener();
        this.notificationBroadcastReceiver = new NotificationBroadcastReceiver();
        this.intentFilter = new IntentFilter();
        this.usePreviousAction = true;
        this.useNextAction = true;
        this.usePlayPauseActions = true;
        this.colorized = true;
        this.useChronometer = true;
        this.color = 0;
        this.defaults = 0;
        this.priority = -1;
        this.badgeIconType = 1;
        this.visibility = 1;
        Map<String, C0026i.C0027a> createPlaybackActions = createPlaybackActions(applicationContext, i10, i3, i4, i5, i6, i7, i8, i9);
        this.playbackActions = createPlaybackActions;
        for (String addAction : createPlaybackActions.keySet()) {
            this.intentFilter.addAction(addAction);
        }
        if (customActionReceiver3 != null) {
            map = customActionReceiver3.createCustomActions(applicationContext, this.instanceId);
        } else {
            map = Collections.emptyMap();
        }
        this.customActions = map;
        for (String addAction2 : map.keySet()) {
            this.intentFilter.addAction(addAction2);
        }
        this.dismissPendingIntent = createBroadcastIntent(ACTION_DISMISS, applicationContext, this.instanceId);
        this.intentFilter.addAction(ACTION_DISMISS);
    }
}
