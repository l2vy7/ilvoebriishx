package british.p015x;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.exoplayer2.C6808p0;
import com.google.android.exoplayer2.C6810q0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.C6628b;
import com.google.android.exoplayer2.device.C6651b;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.video.C7020a;
import com.google.android.exoplayer2.video.VideoSize;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import p001a0.C0026i;

/* renamed from: british.x.s_mediaplayer_exo */
public class s_mediaplayer_exo extends Service implements MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener, AudioManager.OnAudioFocusChangeListener {

    /* renamed from: w */
    protected static final Handler f8489w = new Handler();

    /* renamed from: x */
    protected static final Handler f8490x = new Handler();

    /* renamed from: y */
    protected static final Handler f8491y = new Handler();

    /* renamed from: z */
    protected static final Handler f8492z = new Handler();

    /* renamed from: b */
    SimpleExoPlayer f8493b;

    /* renamed from: c */
    private AudioManager f8494c;

    /* renamed from: d */
    SharedPreferences f8495d;

    /* renamed from: e */
    SharedPreferences f8496e;

    /* renamed from: f */
    SharedPreferences.Editor f8497f;

    /* renamed from: g */
    SharedPreferences.Editor f8498g;

    /* renamed from: h */
    WifiManager.WifiLock f8499h;

    /* renamed from: i */
    boolean f8500i = true;

    /* renamed from: j */
    boolean f8501j = false;

    /* renamed from: k */
    String f8502k;

    /* renamed from: l */
    String f8503l;

    /* renamed from: m */
    String f8504m = "";

    /* renamed from: n */
    int f8505n = 0;

    /* renamed from: o */
    int f8506o = 0;

    /* renamed from: p */
    C1835h f8507p;

    /* renamed from: q */
    Timer f8508q;

    /* renamed from: r */
    Boolean f8509r = Boolean.FALSE;

    /* renamed from: s */
    protected Runnable f8510s = new C2053a();

    /* renamed from: t */
    protected Runnable f8511t = new C2054b();

    /* renamed from: u */
    protected Runnable f8512u = new C2055c();

    /* renamed from: v */
    protected Runnable f8513v = new C2057e();

    /* renamed from: british.x.s_mediaplayer_exo$a */
    class C2053a implements Runnable {
        C2053a() {
        }

        public void run() {
            s_mediaplayer_exo.this.m8539q();
            s_mediaplayer_exo.f8489w.postDelayed(this, 200);
        }
    }

    /* renamed from: british.x.s_mediaplayer_exo$b */
    class C2054b implements Runnable {
        C2054b() {
        }

        public void run() {
            s_mediaplayer_exo.this.m8540r();
        }
    }

    /* renamed from: british.x.s_mediaplayer_exo$c */
    class C2055c implements Runnable {
        C2055c() {
        }

        public void run() {
            s_mediaplayer_exo s_mediaplayer_exo = s_mediaplayer_exo.this;
            if (s_mediaplayer_exo.f8501j) {
                s_mediaplayer_exo.startForeground(4, s_mediaplayer_exo.m8532g(s_mediaplayer_exo.f8504m));
            }
        }
    }

    /* renamed from: british.x.s_mediaplayer_exo$d */
    class C2056d extends TimerTask {
        C2056d() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: java.lang.Object} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.lang.String r0 = ""
                british.x.s_mediaplayer_exo r1 = british.p015x.s_mediaplayer_exo.this
                boolean r2 = r1.f8500i
                if (r2 == 0) goto L_0x00d9
                boolean r2 = r1.f8501j
                if (r2 == 0) goto L_0x00d9
                int r2 = r1.f8506o
                if (r2 <= 0) goto L_0x00d9
                r2 = 0
                r3 = 1
                british.x.h r4 = new british.x.h     // Catch:{ MalformedURLException -> 0x0049 }
                java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0049 }
                british.x.s_mediaplayer_exo r6 = british.p015x.s_mediaplayer_exo.this     // Catch:{ MalformedURLException -> 0x0049 }
                java.lang.String r6 = r6.f8502k     // Catch:{ MalformedURLException -> 0x0049 }
                r5.<init>(r6)     // Catch:{ MalformedURLException -> 0x0049 }
                r4.<init>(r5)     // Catch:{ MalformedURLException -> 0x0049 }
                r1.f8507p = r4     // Catch:{ MalformedURLException -> 0x0049 }
                british.x.s_mediaplayer_exo r1 = british.p015x.s_mediaplayer_exo.this     // Catch:{ IOException -> 0x003e, StringIndexOutOfBoundsException -> 0x0037 }
                british.x.h r1 = r1.f8507p     // Catch:{ IOException -> 0x003e, StringIndexOutOfBoundsException -> 0x0037 }
                java.lang.String r1 = r1.mo7738a()     // Catch:{ IOException -> 0x003e, StringIndexOutOfBoundsException -> 0x0037 }
                british.x.s_mediaplayer_exo r4 = british.p015x.s_mediaplayer_exo.this     // Catch:{ IOException -> 0x0035, StringIndexOutOfBoundsException -> 0x0033 }
                british.x.h r4 = r4.f8507p     // Catch:{ IOException -> 0x0035, StringIndexOutOfBoundsException -> 0x0033 }
                java.lang.String r2 = r4.mo7740c()     // Catch:{ IOException -> 0x0035, StringIndexOutOfBoundsException -> 0x0033 }
                goto L_0x0044
            L_0x0033:
                r4 = move-exception
                goto L_0x0039
            L_0x0035:
                r4 = move-exception
                goto L_0x0040
            L_0x0037:
                r4 = move-exception
                r1 = r0
            L_0x0039:
                r4.printStackTrace()     // Catch:{ MalformedURLException -> 0x0047 }
            L_0x003c:
                r2 = r0
                goto L_0x0044
            L_0x003e:
                r4 = move-exception
                r1 = r0
            L_0x0040:
                r4.printStackTrace()     // Catch:{ MalformedURLException -> 0x0047 }
                goto L_0x003c
            L_0x0044:
                r4 = r2
                r2 = 1
                goto L_0x004f
            L_0x0047:
                r4 = move-exception
                goto L_0x004b
            L_0x0049:
                r4 = move-exception
                r1 = r0
            L_0x004b:
                r4.printStackTrace()
                r4 = r0
            L_0x004f:
                if (r2 == 0) goto L_0x00d9
                british.x.s_mediaplayer_exo r2 = british.p015x.s_mediaplayer_exo.this
                com.google.android.exoplayer2.SimpleExoPlayer r5 = r2.f8493b
                if (r5 == 0) goto L_0x00d9
                boolean r2 = r2.m8534i()
                if (r2 == 0) goto L_0x00d9
                british.x.s_mediaplayer_exo r2 = british.p015x.s_mediaplayer_exo.this
                android.content.SharedPreferences$Editor r2 = r2.f8498g
                java.lang.String r5 = "t_radio_artist"
                r2.putString(r5, r1)
                british.x.s_mediaplayer_exo r2 = british.p015x.s_mediaplayer_exo.this
                android.content.SharedPreferences$Editor r2 = r2.f8498g
                java.lang.String r5 = "t_radio_song"
                r2.putString(r5, r4)
                british.x.s_mediaplayer_exo r2 = british.p015x.s_mediaplayer_exo.this
                android.content.SharedPreferences$Editor r2 = r2.f8498g
                r2.commit()
                british.x.s_mediaplayer_exo r2 = british.p015x.s_mediaplayer_exo.this
                int r2 = r2.f8506o
                if (r2 != r3) goto L_0x00a9
                boolean r2 = r1.equals(r0)
                if (r2 != 0) goto L_0x0099
                boolean r2 = r4.equals(r0)
                if (r2 != 0) goto L_0x0099
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                java.lang.String r1 = " - "
                r2.append(r1)
                java.lang.String r1 = r2.toString()
            L_0x0099:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                r2.append(r4)
                java.lang.String r1 = r2.toString()
                goto L_0x00b3
            L_0x00a9:
                r3 = 2
                if (r2 != r3) goto L_0x00ad
                goto L_0x00b3
            L_0x00ad:
                r1 = 3
                if (r2 != r1) goto L_0x00b2
                r1 = r4
                goto L_0x00b3
            L_0x00b2:
                r1 = r0
            L_0x00b3:
                java.lang.String r1 = r1.trim()
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x00c1
                british.x.s_mediaplayer_exo r0 = british.p015x.s_mediaplayer_exo.this
                java.lang.String r1 = r0.f8503l
            L_0x00c1:
                british.x.s_mediaplayer_exo r0 = british.p015x.s_mediaplayer_exo.this
                java.lang.String r2 = "notification"
                java.lang.Object r0 = r0.getSystemService(r2)
                android.app.NotificationManager r0 = (android.app.NotificationManager) r0
                british.x.s_mediaplayer_exo r2 = british.p015x.s_mediaplayer_exo.this
                boolean r3 = r2.f8501j
                if (r3 == 0) goto L_0x00d9
                r3 = 4
                android.app.Notification r1 = r2.m8532g(r1)
                r0.notify(r3, r1)
            L_0x00d9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.s_mediaplayer_exo.C2056d.run():void");
        }
    }

    /* renamed from: british.x.s_mediaplayer_exo$e */
    class C2057e implements Runnable {
        C2057e() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r2 = this;
                british.x.s_mediaplayer_exo r0 = british.p015x.s_mediaplayer_exo.this
                r0.m8540r()
                british.x.s_mediaplayer_exo r0 = british.p015x.s_mediaplayer_exo.this     // Catch:{ Exception -> 0x000c }
                com.google.android.exoplayer2.SimpleExoPlayer r0 = r0.f8493b     // Catch:{ Exception -> 0x000c }
                r0.release()     // Catch:{ Exception -> 0x000c }
            L_0x000c:
                british.x.s_mediaplayer_exo r0 = british.p015x.s_mediaplayer_exo.this     // Catch:{ Exception -> 0x0011 }
                r1 = 0
                r0.f8493b = r1     // Catch:{ Exception -> 0x0011 }
            L_0x0011:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.s_mediaplayer_exo.C2057e.run():void");
        }
    }

    /* renamed from: british.x.s_mediaplayer_exo$f */
    class C2058f extends C2059g {
        C2058f() {
            super();
        }

        public void onLoadingChanged(boolean z) {
        }

        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        public void onPlaybackStateChanged(int i) {
            if (i == 3 && s_mediaplayer_exo.this.m8534i()) {
                s_mediaplayer_exo.f8490x.postDelayed(s_mediaplayer_exo.this.f8511t, 200);
                s_mediaplayer_exo.this.m8536m();
            }
        }

        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        }

        public void onPositionDiscontinuity(int i) {
        }

        public void onRepeatModeChanged(int i) {
        }

        public void onSeekProcessed() {
        }

        public void onShuffleModeEnabledChanged(boolean z) {
        }

        public void onTimelineChanged(Timeline timeline, Object obj, int i) {
        }

        public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        }
    }

    /* renamed from: british.x.s_mediaplayer_exo$g */
    private class C2059g implements Player.Listener, Player.EventListener {
        private C2059g() {
        }

        public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            C6628b.m28486a(this, audioAttributes);
        }

        public /* synthetic */ void onAudioSessionIdChanged(int i) {
            C6628b.m28487b(this, i);
        }

        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            C6808p0.m28583a(this, commands);
        }

        public /* synthetic */ void onCues(List list) {
            C6810q0.m28605a(this, list);
        }

        public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            C6651b.m28507a(this, deviceInfo);
        }

        public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            C6651b.m28508b(this, i, z);
        }

        public /* synthetic */ void onEvents(Player player, Player.Events events) {
            C6808p0.m28584b(this, player, events);
        }

        public /* synthetic */ void onIsLoadingChanged(boolean z) {
            C6808p0.m28585c(this, z);
        }

        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            C6808p0.m28586d(this, z);
        }

        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
            C6808p0.m28588f(this, mediaItem, i);
        }

        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            C6808p0.m28589g(this, mediaMetadata);
        }

        public /* synthetic */ void onMetadata(Metadata metadata) {
            C6810q0.m28606b(this, metadata);
        }

        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            C6808p0.m28590h(this, z, i);
        }

        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            C6808p0.m28593k(this, i);
        }

        public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            C6808p0.m28595m(this, z, i);
        }

        public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            C6808p0.m28597o(this, positionInfo, positionInfo2, i);
        }

        public /* synthetic */ void onRenderedFirstFrame() {
            C7020a.m28755a(this);
        }

        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            C6628b.m28488c(this, z);
        }

        public /* synthetic */ void onStaticMetadataChanged(List list) {
            C6808p0.m28601s(this, list);
        }

        public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            C7020a.m28756b(this, i, i2);
        }

        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
            C6808p0.m28602t(this, timeline, i);
        }

        public /* synthetic */ void onVideoSizeChanged(int i, int i2, int i3, float f) {
            C7020a.m28757c(this, i, i2, i3, f);
        }

        public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            C7020a.m28758d(this, videoSize);
        }

        public /* synthetic */ void onVolumeChanged(float f) {
            C6628b.m28489d(this, f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public Notification m8532g(String str) {
        String str2;
        C0026i.C0034e eVar;
        Intent intent = new Intent(getApplicationContext(), preinicio.class);
        if (Build.VERSION.SDK_INT >= 11) {
            intent.setFlags(268468224);
        }
        if (this.f8505n != 0) {
            intent.putExtra("notif_id", SessionDescription.SUPPORTED_SDP_VERSION);
            intent.putExtra("notif_tipo", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            intent.putExtra("notif_idelem", this.f8505n + "");
        }
        try {
            str2 = mo8111n(this);
        } catch (Exception unused) {
            str2 = "";
        }
        if (str2.equals("")) {
            str2 = "Playing";
        }
        int i = 134217728;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            i = 201326592;
        }
        PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), 0, intent, i);
        if (i2 >= 26) {
            eVar = new C0026i.C0034e(this, C1692config.m8206y(this, 0).getId());
        } else {
            eVar = new C0026i.C0034e(this);
        }
        Intent intent2 = new Intent(this, s_mediaplayer_exo.class);
        intent2.putExtra("accion", "pause");
        intent2.putExtra("desde_notif", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        intent2.putExtra("idsecc", this.f8505n);
        C0026i.C0027a a = new C0026i.C0027a.C0028a(R.drawable.pause, "Pause", PendingIntent.getService(this, 999995, intent2, i)).mo55a();
        Intent intent3 = new Intent(this, s_mediaplayer_exo.class);
        intent3.putExtra("accion", "play");
        intent3.putExtra("desde_notif", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        intent3.putExtra("idsecc", this.f8505n);
        C0026i.C0027a a2 = new C0026i.C0027a.C0028a(R.drawable.play_audio, "Play", PendingIntent.getService(this, 999996, intent3, i)).mo55a();
        Intent intent4 = new Intent(this, s_mediaplayer_exo.class);
        intent4.putExtra("accion", "stop");
        intent4.putExtra("desde_notif", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        intent4.putExtra("idsecc", this.f8505n);
        C0026i.C0027a a3 = new C0026i.C0027a.C0028a(R.drawable.cerrar_cruz, "Stop", PendingIntent.getService(this, 999997, intent4, i)).mo55a();
        eVar.mo67F(str2).mo85q(str2).mo84p(str).mo63B(R.drawable.play).mo83o(activity).mo91x(true);
        Bitmap p0 = C1692config.m8196p0(this);
        if (p0 != null) {
            eVar.mo89v(p0);
        }
        C1692config config = (C1692config) getApplicationContext();
        int i3 = this.f8505n;
        if (i3 > 0 && config != null) {
            C1855l lVar = config.f7231O1[C1692config.f7114N5.indexOf(Integer.valueOf(i3))];
            if (lVar.f7878Q > 0) {
                SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
                int i4 = lVar.f7878Q;
                if (i4 != sharedPreferences.getInt("v_img_notif_act_" + this.f8505n, 0)) {
                    mo8109j(lVar);
                } else {
                    try {
                        FileInputStream openFileInput = openFileInput("img_notif_" + this.f8505n);
                        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileInput.getFD());
                        openFileInput.close();
                        eVar.mo65D(new C0026i.C0029b().mo59n(decodeFileDescriptor).mo58m((Bitmap) null));
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        if (this.f8493b == null || !m8534i()) {
            eVar.mo72b(a2);
        } else {
            eVar.mo72b(a);
        }
        eVar.mo72b(a3);
        Notification c = eVar.mo73c();
        this.f8504m = str;
        return c;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(1:7)|8|9) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8533h(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            com.google.android.exoplayer2.SimpleExoPlayer r0 = r3.f8493b
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r3.f8502k     // Catch:{ Exception -> 0x0013 }
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x0013 }
            if (r0 == 0) goto L_0x0013
            boolean r0 = r3.m8534i()     // Catch:{ Exception -> 0x0013 }
            if (r0 == 0) goto L_0x0013
            return
        L_0x0013:
            com.google.android.exoplayer2.SimpleExoPlayer r0 = r3.f8493b     // Catch:{ Exception -> 0x0018 }
            r0.release()     // Catch:{ Exception -> 0x0018 }
        L_0x0018:
            r3.f8502k = r4
            com.google.android.exoplayer2.upstream.DefaultDataSourceFactory r0 = new com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
            r0.<init>((android.content.Context) r3, (java.lang.String) r5)
            com.google.android.exoplayer2.source.DefaultMediaSourceFactory r5 = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory
            r5.<init>((com.google.android.exoplayer2.upstream.DataSource.Factory) r0)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector
            r0.<init>((android.content.Context) r3)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.buildUponParameters()
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r1.setMaxVideoSizeSd()
            r0.setParameters((com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder) r1)
            com.google.android.exoplayer2.SimpleExoPlayer$Builder r1 = new com.google.android.exoplayer2.SimpleExoPlayer$Builder
            r1.<init>(r3)
            com.google.android.exoplayer2.SimpleExoPlayer$Builder r0 = r1.setTrackSelector(r0)
            com.google.android.exoplayer2.SimpleExoPlayer$Builder r5 = r0.setMediaSourceFactory(r5)
            com.google.android.exoplayer2.SimpleExoPlayer r5 = r5.build()
            r3.f8493b = r5
            r0 = 0
            r5.setThrowsWhenUsingWrongThread(r0)
            android.os.Handler r5 = f8490x     // Catch:{ Exception -> 0x0055 }
            java.lang.Runnable r0 = r3.f8511t     // Catch:{ Exception -> 0x0055 }
            r1 = 200(0xc8, double:9.9E-322)
            r5.postDelayed(r0, r1)     // Catch:{ Exception -> 0x0055 }
            goto L_0x0056
        L_0x0055:
        L_0x0056:
            com.google.android.exoplayer2.SimpleExoPlayer r5 = r3.f8493b
            british.x.s_mediaplayer_exo$f r0 = new british.x.s_mediaplayer_exo$f
            r0.<init>()
            r5.addListener((com.google.android.exoplayer2.Player.Listener) r0)
            android.net.Uri r4 = android.net.Uri.parse(r4)
            com.google.android.exoplayer2.MediaItem r4 = com.google.android.exoplayer2.MediaItem.fromUri((android.net.Uri) r4)
            if (r4 == 0) goto L_0x007a
            com.google.android.exoplayer2.SimpleExoPlayer r5 = r3.f8493b
            r0 = 1
            r5.setPlayWhenReady(r0)
            com.google.android.exoplayer2.SimpleExoPlayer r5 = r3.f8493b
            r5.setMediaItem(r4)
            com.google.android.exoplayer2.SimpleExoPlayer r4 = r3.f8493b
            r4.prepare()
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.s_mediaplayer_exo.m8533h(java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public boolean m8534i() {
        return this.f8493b.getPlayWhenReady() && this.f8493b.getPlaybackState() == 3;
    }

    /* renamed from: l */
    private void m8535l() {
        try {
            this.f8499h.release();
        } catch (Exception unused) {
        }
        stopForeground(true);
        this.f8501j = false;
        this.f8494c.abandonAudioFocus(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m8536m() {
        this.f8494c.requestAudioFocus(this, 3, 1);
        startForeground(4, m8532g(this.f8503l));
        this.f8501j = true;
        try {
            this.f8499h.acquire();
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: o */
    private void m8537o() {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) getSystemService("connectivity")).getNetworkInfo(1);
        } catch (Exception unused) {
            networkInfo = null;
        }
        int i = (networkInfo == null || !networkInfo.isConnected()) ? 10000 : 5000;
        Timer timer = new Timer();
        this.f8508q = timer;
        timer.schedule(new C2056d(), 0, (long) i);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|5|6|7|8|9|10) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0020 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m8539q() {
        /*
            r5 = this;
            android.content.SharedPreferences$Editor r0 = r5.f8497f
            if (r0 == 0) goto L_0x0034
            com.google.android.exoplayer2.SimpleExoPlayer r1 = r5.f8493b
            if (r1 == 0) goto L_0x002c
            java.lang.String r2 = "position"
            long r3 = r1.getCurrentPosition()     // Catch:{ Exception -> 0x0012 }
            int r1 = (int) r3     // Catch:{ Exception -> 0x0012 }
            r0.putInt(r2, r1)     // Catch:{ Exception -> 0x0012 }
        L_0x0012:
            android.content.SharedPreferences$Editor r0 = r5.f8497f     // Catch:{ Exception -> 0x0020 }
            java.lang.String r1 = "duration"
            com.google.android.exoplayer2.SimpleExoPlayer r2 = r5.f8493b     // Catch:{ Exception -> 0x0020 }
            long r2 = r2.getDuration()     // Catch:{ Exception -> 0x0020 }
            int r3 = (int) r2     // Catch:{ Exception -> 0x0020 }
            r0.putInt(r1, r3)     // Catch:{ Exception -> 0x0020 }
        L_0x0020:
            android.content.SharedPreferences$Editor r0 = r5.f8497f     // Catch:{ Exception -> 0x002f }
            java.lang.String r1 = "isPlaying"
            boolean r2 = r5.m8534i()     // Catch:{ Exception -> 0x002f }
            r0.putBoolean(r1, r2)     // Catch:{ Exception -> 0x002f }
            goto L_0x002f
        L_0x002c:
            r0.clear()     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            android.content.SharedPreferences$Editor r0 = r5.f8497f     // Catch:{ Exception -> 0x0034 }
            r0.commit()     // Catch:{ Exception -> 0x0034 }
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.s_mediaplayer_exo.m8539q():void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:19|20|21|22|23|24|25|26|27|29|(1:31)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x003f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0046 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0051  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m8540r() {
        /*
            r6 = this;
            android.content.SharedPreferences$Editor r0 = r6.f8498g
            r1 = 1
            java.lang.String r2 = "act_mc"
            if (r0 == 0) goto L_0x0014
            r0.clear()
            android.content.SharedPreferences$Editor r0 = r6.f8498g
            r0.putBoolean(r2, r1)
            android.content.SharedPreferences$Editor r0 = r6.f8498g
            r0.commit()
        L_0x0014:
            com.google.android.exoplayer2.SimpleExoPlayer r0 = r6.f8493b
            r3 = 0
            if (r0 == 0) goto L_0x001e
            boolean r0 = r6.m8534i()     // Catch:{ Exception -> 0x001e }
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            com.google.android.exoplayer2.SimpleExoPlayer r4 = r6.f8493b
            if (r4 == 0) goto L_0x0061
            if (r0 == 0) goto L_0x0061
            boolean r0 = r6.f8501j
            if (r0 != 0) goto L_0x0061
            r4.stop()     // Catch:{ Exception -> 0x002d }
            goto L_0x002e
        L_0x002d:
        L_0x002e:
            android.content.SharedPreferences$Editor r0 = r6.f8497f
            if (r0 == 0) goto L_0x005e
            java.lang.String r4 = "position"
            r0.putInt(r4, r3)     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            android.content.SharedPreferences$Editor r0 = r6.f8497f     // Catch:{ Exception -> 0x003f }
            java.lang.String r4 = "duration"
            r5 = -1
            r0.putInt(r4, r5)     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            android.content.SharedPreferences$Editor r0 = r6.f8497f     // Catch:{ Exception -> 0x0046 }
            java.lang.String r4 = "isPlaying"
            r0.putBoolean(r4, r3)     // Catch:{ Exception -> 0x0046 }
        L_0x0046:
            android.content.SharedPreferences$Editor r0 = r6.f8497f     // Catch:{ Exception -> 0x004c }
            r0.commit()     // Catch:{ Exception -> 0x004c }
            goto L_0x004d
        L_0x004c:
        L_0x004d:
            android.content.SharedPreferences$Editor r0 = r6.f8498g
            if (r0 == 0) goto L_0x005e
            r0.clear()
            android.content.SharedPreferences$Editor r0 = r6.f8498g
            r0.putBoolean(r2, r1)
            android.content.SharedPreferences$Editor r0 = r6.f8498g
            r0.commit()
        L_0x005e:
            r6.stopSelf()
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.s_mediaplayer_exo.m8540r():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo8109j(C1855l lVar) {
        if (!this.f8509r.booleanValue()) {
            new Thread(new C1826g1(this, lVar)).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void m8538p(C1855l lVar) {
        this.f8509r = Boolean.TRUE;
        Bitmap f0 = C1692config.m8186f0(C1692config.f7108H5 + "/srv/imgs/radio/n" + lVar.f7964y + ".png?v=" + lVar.f7878Q);
        if (f0 != null) {
            try {
                FileOutputStream openFileOutput = openFileOutput("img_notif_" + lVar.f7964y, 0);
                f0.compress(Bitmap.CompressFormat.PNG, 100, openFileOutput);
                openFileOutput.close();
                SharedPreferences.Editor edit = getSharedPreferences("sh", 0).edit();
                edit.putInt("v_img_notif_act_" + lVar.f7964y, lVar.f7878Q).commit();
                if (this.f8501j) {
                    startForeground(4, m8532g(this.f8504m));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f8509r = Boolean.FALSE;
    }

    /* renamed from: n */
    public String mo8111n(Context context) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "");
    }

    public void onAudioFocusChange(int i) {
        if (i <= 0) {
            SimpleExoPlayer simpleExoPlayer = this.f8493b;
            if (simpleExoPlayer != null) {
                try {
                    simpleExoPlayer.setVolume(0.0f);
                } catch (Exception unused) {
                }
            }
        } else {
            SimpleExoPlayer simpleExoPlayer2 = this.f8493b;
            if (simpleExoPlayer2 != null) {
                simpleExoPlayer2.setVolume(1.0f);
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        m8535l();
    }

    public void onCreate() {
        this.f8495d = getSharedPreferences("sh_mp", 0);
        this.f8496e = getSharedPreferences("sh_mc", 0);
        this.f8497f = this.f8495d.edit();
        this.f8498g = this.f8496e.edit();
        this.f8494c = (AudioManager) getSystemService("audio");
        if (Build.VERSION.SDK_INT >= 12) {
            this.f8499h = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(3, "acwifilock");
        } else {
            this.f8499h = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(1, "acwifilock");
        }
        this.f8499h.setReferenceCounted(false);
        f8489w.postDelayed(this.f8510s, 200);
        m8537o();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|5|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0007 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r2 = this;
            android.os.Handler r0 = f8489w     // Catch:{ Exception -> 0x0007 }
            java.lang.Runnable r1 = r2.f8510s     // Catch:{ Exception -> 0x0007 }
            r0.removeCallbacks(r1)     // Catch:{ Exception -> 0x0007 }
        L_0x0007:
            android.net.wifi.WifiManager$WifiLock r0 = r2.f8499h     // Catch:{ Exception -> 0x000c }
            r0.release()     // Catch:{ Exception -> 0x000c }
        L_0x000c:
            com.google.android.exoplayer2.SimpleExoPlayer r0 = r2.f8493b     // Catch:{ Exception -> 0x0011 }
            r0.release()     // Catch:{ Exception -> 0x0011 }
        L_0x0011:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.s_mediaplayer_exo.onDestroy():void");
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        m8535l();
        return true;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            stopSelf();
        } else {
            String stringExtra = intent.getStringExtra("accion");
            String stringExtra2 = intent.getStringExtra("url");
            String stringExtra3 = intent.getStringExtra("ua");
            this.f8505n = intent.getIntExtra("idsecc", 0);
            this.f8506o = intent.getIntExtra("radio_mostrar", 0);
            this.f8503l = intent.getStringExtra("secc_tit");
            this.f8500i = intent.getBooleanExtra("esStream", true);
            if (stringExtra.equals("iniciar")) {
                m8533h(stringExtra2, stringExtra3);
            } else if (stringExtra.equals("play")) {
                if (!intent.hasExtra("desde_notif")) {
                    SimpleExoPlayer simpleExoPlayer = this.f8493b;
                    if (simpleExoPlayer == null) {
                        m8533h(stringExtra2, stringExtra3);
                    } else {
                        try {
                            simpleExoPlayer.setPlayWhenReady(true);
                            m8536m();
                        } catch (Exception unused) {
                        }
                        f8490x.postDelayed(this.f8511t, 200);
                    }
                } else {
                    SimpleExoPlayer simpleExoPlayer2 = this.f8493b;
                    if (simpleExoPlayer2 != null) {
                        try {
                            simpleExoPlayer2.setPlayWhenReady(true);
                        } catch (Exception unused2) {
                        }
                        f8490x.postDelayed(this.f8511t, 200);
                        f8491y.postDelayed(this.f8512u, 200);
                    }
                }
            } else if (stringExtra.equals("pause")) {
                try {
                    this.f8493b.setPlayWhenReady(false);
                } catch (Exception unused3) {
                }
                if (!intent.hasExtra("desde_notif")) {
                    if (this.f8500i) {
                        f8492z.postDelayed(this.f8513v, 200);
                    } else {
                        f8490x.postDelayed(this.f8511t, 200);
                    }
                    m8535l();
                } else {
                    f8491y.postDelayed(this.f8512u, 200);
                    f8490x.postDelayed(this.f8511t, 200);
                }
            } else if (stringExtra.equals("stop")) {
                try {
                    this.f8493b.stop();
                } catch (Exception unused4) {
                }
                if (this.f8500i) {
                    f8492z.postDelayed(this.f8513v, 200);
                } else {
                    f8490x.postDelayed(this.f8511t, 200);
                }
                m8535l();
            } else if (stringExtra.equals("seekto")) {
                try {
                    this.f8493b.seekTo((long) intent.getIntExtra("valor", 0));
                } catch (Exception unused5) {
                }
                f8490x.postDelayed(this.f8511t, 200);
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
