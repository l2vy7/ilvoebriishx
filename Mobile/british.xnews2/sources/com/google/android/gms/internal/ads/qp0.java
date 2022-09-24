package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qp0 extends sp0 implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: v */
    private static final Map<Integer, String> f38221v;

    /* renamed from: d */
    private final mq0 f38222d;

    /* renamed from: e */
    private final nq0 f38223e;

    /* renamed from: f */
    private final boolean f38224f;

    /* renamed from: g */
    private int f38225g = 0;

    /* renamed from: h */
    private int f38226h = 0;

    /* renamed from: i */
    private MediaPlayer f38227i;

    /* renamed from: j */
    private Uri f38228j;

    /* renamed from: k */
    private int f38229k;

    /* renamed from: l */
    private int f38230l;

    /* renamed from: m */
    private int f38231m;

    /* renamed from: n */
    private int f38232n;

    /* renamed from: o */
    private int f38233o;

    /* renamed from: p */
    private kq0 f38234p;

    /* renamed from: q */
    private final boolean f38235q;

    /* renamed from: r */
    private int f38236r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public rp0 f38237s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f38238t = false;

    /* renamed from: u */
    private Integer f38239u = null;

    static {
        HashMap hashMap = new HashMap();
        f38221v = hashMap;
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            hashMap.put(-1004, "MEDIA_ERROR_IO");
            hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
            hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
            hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (i >= 19) {
            hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public qp0(Context context, mq0 mq0, boolean z, boolean z2, lq0 lq0, nq0 nq0) {
        super(context);
        setSurfaceTextureListener(this);
        this.f38222d = mq0;
        this.f38223e = nq0;
        this.f38235q = z;
        this.f38224f = z2;
        nq0.mo33729a(this);
    }

    /* renamed from: B */
    private final void m36575B() {
        zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f38228j != null && surfaceTexture != null) {
            m36577D(false);
            try {
                zzt.zzk();
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f38227i = mediaPlayer;
                mediaPlayer.setOnBufferingUpdateListener(this);
                this.f38227i.setOnCompletionListener(this);
                this.f38227i.setOnErrorListener(this);
                this.f38227i.setOnInfoListener(this);
                this.f38227i.setOnPreparedListener(this);
                this.f38227i.setOnVideoSizeChangedListener(this);
                this.f38231m = 0;
                if (this.f38235q) {
                    kq0 kq0 = new kq0(getContext());
                    this.f38234p = kq0;
                    kq0.mo33153c(surfaceTexture, getWidth(), getHeight());
                    this.f38234p.start();
                    SurfaceTexture a = this.f38234p.mo33151a();
                    if (a != null) {
                        surfaceTexture = a;
                    } else {
                        this.f38234p.mo33154d();
                        this.f38234p = null;
                    }
                }
                this.f38227i.setDataSource(getContext(), this.f38228j);
                zzt.zzl();
                this.f38227i.setSurface(new Surface(surfaceTexture));
                this.f38227i.setAudioStreamType(3);
                this.f38227i.setScreenOnWhilePlaying(true);
                this.f38227i.prepareAsync();
                m36578E(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                co0.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f38228j)), e);
                onError(this.f38227i, 1, 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034 A[LOOP:0: B:10:0x0034->B:15:0x004f, LOOP_START] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m36576C() {
        /*
            r8 = this;
            boolean r0 = r8.f38224f
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8.m36580G()
            if (r0 == 0) goto L_0x0059
            android.media.MediaPlayer r0 = r8.f38227i
            int r0 = r0.getCurrentPosition()
            if (r0 <= 0) goto L_0x0059
            int r0 = r8.f38226h
            r1 = 3
            if (r0 == r1) goto L_0x0059
            java.lang.String r0 = "AdMediaPlayerView nudging MediaPlayer"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            r0 = 0
            r8.m36579F(r0)
            android.media.MediaPlayer r0 = r8.f38227i
            r0.start()
            android.media.MediaPlayer r0 = r8.f38227i
            int r0 = r0.getCurrentPosition()
            a5.e r1 = com.google.android.gms.ads.internal.zzt.zzA()
            long r1 = r1.currentTimeMillis()
        L_0x0034:
            boolean r3 = r8.m36580G()
            if (r3 == 0) goto L_0x0051
            android.media.MediaPlayer r3 = r8.f38227i
            int r3 = r3.getCurrentPosition()
            if (r3 != r0) goto L_0x0051
            a5.e r3 = com.google.android.gms.ads.internal.zzt.zzA()
            long r3 = r3.currentTimeMillis()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0034
        L_0x0051:
            android.media.MediaPlayer r0 = r8.f38227i
            r0.pause()
            r8.zzn()
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qp0.m36576C():void");
    }

    /* renamed from: D */
    private final void m36577D(boolean z) {
        zze.zza("AdMediaPlayerView release");
        kq0 kq0 = this.f38234p;
        if (kq0 != null) {
            kq0.mo33154d();
            this.f38234p = null;
        }
        MediaPlayer mediaPlayer = this.f38227i;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f38227i.release();
            this.f38227i = null;
            m36578E(0);
            if (z) {
                this.f38226h = 0;
            }
        }
    }

    /* renamed from: E */
    private final void m36578E(int i) {
        if (i == 3) {
            this.f38223e.mo33731c();
            this.f39025c.mo34397b();
        } else if (this.f38225g == 3) {
            this.f38223e.mo33733e();
            this.f39025c.mo34398c();
        }
        this.f38225g = i;
    }

    /* renamed from: F */
    private final void m36579F(float f) {
        MediaPlayer mediaPlayer = this.f38227i;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            co0.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f38225g;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m36580G() {
        /*
            r2 = this;
            android.media.MediaPlayer r0 = r2.f38227i
            if (r0 == 0) goto L_0x000f
            int r0 = r2.f38225g
            r1 = -1
            if (r0 == r1) goto L_0x000f
            if (r0 == 0) goto L_0x000f
            r1 = 1
            if (r0 == r1) goto L_0x000f
            return r1
        L_0x000f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qp0.m36580G():boolean");
    }

    /* renamed from: J */
    static /* bridge */ /* synthetic */ void m36583J(qp0 qp0, MediaPlayer mediaPlayer) {
        MediaPlayer.TrackInfo[] trackInfo;
        MediaFormat format;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37194r1)).booleanValue() && qp0.f38222d != null && mediaPlayer != null && Build.VERSION.SDK_INT >= 19 && (trackInfo = mediaPlayer.getTrackInfo()) != null) {
            HashMap hashMap = new HashMap();
            for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                if (trackInfo2 != null) {
                    int trackType = trackInfo2.getTrackType();
                    if (trackType == 1) {
                        MediaFormat format2 = trackInfo2.getFormat();
                        if (format2 != null) {
                            if (format2.containsKey("frame-rate")) {
                                try {
                                    hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                } catch (ClassCastException unused) {
                                    hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                }
                            }
                            if (format2.containsKey("bitrate")) {
                                Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                qp0.f38239u = valueOf;
                                hashMap.put("bitRate", String.valueOf(valueOf));
                            }
                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                int integer = format2.getInteger("width");
                                int integer2 = format2.getInteger("height");
                                StringBuilder sb = new StringBuilder(23);
                                sb.append(integer);
                                sb.append("x");
                                sb.append(integer2);
                                hashMap.put("resolution", sb.toString());
                            }
                            if (format2.containsKey("mime")) {
                                hashMap.put("videoMime", format2.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                hashMap.put("videoCodec", format2.getString("codecs-string"));
                            }
                        }
                    } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                        if (format.containsKey("mime")) {
                            hashMap.put("audioMime", format.getString("mime"));
                        }
                        if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                            hashMap.put("audioCodec", format.getString("codecs-string"));
                        }
                    }
                }
            }
            if (!hashMap.isEmpty()) {
                qp0.f38222d.mo18321Z("onMetadataEvent", hashMap);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo34379a(int i) {
        rp0 rp0 = this.f38237s;
        if (rp0 != null) {
            rp0.onWindowVisibilityChanged(i);
        }
    }

    /* renamed from: h */
    public final int mo31372h() {
        if (m36580G()) {
            return this.f38227i.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: i */
    public final int mo31373i() {
        if (Build.VERSION.SDK_INT < 26 || !m36580G()) {
            return -1;
        }
        return this.f38227i.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    /* renamed from: j */
    public final int mo31374j() {
        if (m36580G()) {
            return this.f38227i.getDuration();
        }
        return -1;
    }

    /* renamed from: k */
    public final int mo31375k() {
        MediaPlayer mediaPlayer = this.f38227i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    /* renamed from: l */
    public final int mo31376l() {
        MediaPlayer mediaPlayer = this.f38227i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    /* renamed from: m */
    public final long mo31377m() {
        return 0;
    }

    /* renamed from: n */
    public final long mo31378n() {
        if (this.f38239u != null) {
            return (mo31379o() * ((long) this.f38231m)) / 100;
        }
        return -1;
    }

    /* renamed from: o */
    public final long mo31379o() {
        if (this.f38239u != null) {
            return ((long) mo31374j()) * ((long) this.f38239u.intValue());
        }
        return -1;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f38231m = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView completion");
        m36578E(5);
        this.f38226h = 5;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new jp0(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map<Integer, String> map = f38221v;
        String str = map.get(Integer.valueOf(i));
        String str2 = map.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        co0.zzj(sb.toString());
        m36578E(-1);
        this.f38226h = -1;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new kp0(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map<Integer, String> map = f38221v;
        String str = map.get(Integer.valueOf(i));
        String str2 = map.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zze.zza(sb.toString());
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        if (r1 > r6) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f38229k
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.f38230l
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.f38229k
            if (r2 <= 0) goto L_0x007e
            int r2 = r5.f38230l
            if (r2 <= 0) goto L_0x007e
            com.google.android.gms.internal.ads.kq0 r2 = r5.f38234p
            if (r2 != 0) goto L_0x007e
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0043
            if (r1 != r2) goto L_0x0041
            int r0 = r5.f38229k
            int r1 = r0 * r7
            int r2 = r5.f38230l
            int r3 = r6 * r2
            if (r1 >= r3) goto L_0x003c
            int r0 = r1 / r2
        L_0x003a:
            r1 = r7
            goto L_0x007e
        L_0x003c:
            if (r1 <= r3) goto L_0x0063
            int r1 = r3 / r0
            goto L_0x0054
        L_0x0041:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x0043:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x0056
            int r0 = r5.f38230l
            int r0 = r0 * r6
            int r2 = r5.f38229k
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0053
            if (r0 <= r7) goto L_0x0053
            goto L_0x0063
        L_0x0053:
            r1 = r0
        L_0x0054:
            r0 = r6
            goto L_0x007e
        L_0x0056:
            if (r1 != r2) goto L_0x0067
            int r1 = r5.f38229k
            int r1 = r1 * r7
            int r2 = r5.f38230l
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0065
            if (r1 <= r6) goto L_0x0065
        L_0x0063:
            r0 = r6
            goto L_0x003a
        L_0x0065:
            r0 = r1
            goto L_0x003a
        L_0x0067:
            int r2 = r5.f38229k
            int r4 = r5.f38230l
            if (r1 != r3) goto L_0x0073
            if (r4 <= r7) goto L_0x0073
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L_0x0075
        L_0x0073:
            r1 = r2
            r7 = r4
        L_0x0075:
            if (r0 != r3) goto L_0x0065
            if (r1 <= r6) goto L_0x0065
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L_0x0054
        L_0x007e:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.kq0 r6 = r5.f38234p
            if (r6 == 0) goto L_0x0088
            r6.mo33152b(r0, r1)
        L_0x0088:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 16
            if (r6 != r7) goto L_0x00a1
            int r6 = r5.f38232n
            if (r6 <= 0) goto L_0x0094
            if (r6 != r0) goto L_0x009a
        L_0x0094:
            int r6 = r5.f38233o
            if (r6 <= 0) goto L_0x009d
            if (r6 == r1) goto L_0x009d
        L_0x009a:
            r5.m36576C()
        L_0x009d:
            r5.f38232n = r0
            r5.f38233o = r1
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qp0.onMeasure(int, int):void");
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView prepared");
        m36578E(2);
        this.f38223e.mo33730b();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new ip0(this, mediaPlayer));
        this.f38229k = mediaPlayer.getVideoWidth();
        this.f38230l = mediaPlayer.getVideoHeight();
        int i = this.f38236r;
        if (i != 0) {
            mo31389s(i);
        }
        m36576C();
        int i2 = this.f38229k;
        int i3 = this.f38230l;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        co0.zzi(sb.toString());
        if (this.f38226h == 3) {
            mo31388r();
        }
        zzn();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zze.zza("AdMediaPlayerView surface created");
        m36575B();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new lp0(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f38227i;
        if (mediaPlayer != null && this.f38236r == 0) {
            this.f38236r = mediaPlayer.getCurrentPosition();
        }
        kq0 kq0 = this.f38234p;
        if (kq0 != null) {
            kq0.mo33154d();
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new np0(this));
        m36577D(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zze.zza("AdMediaPlayerView surface changed");
        int i3 = this.f38226h;
        boolean z = false;
        if (this.f38229k == i && this.f38230l == i2) {
            z = true;
        }
        if (this.f38227i != null && i3 == 3 && z) {
            int i4 = this.f38236r;
            if (i4 != 0) {
                mo31389s(i4);
            }
            mo31388r();
        }
        kq0 kq0 = this.f38234p;
        if (kq0 != null) {
            kq0.mo33152b(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new mp0(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f38223e.mo33734f(this);
        this.f39024b.mo32218a(surfaceTexture, this.f38237s);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        zze.zza(sb.toString());
        this.f38229k = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f38230l = videoHeight;
        if (this.f38229k != 0 && videoHeight != 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zzt.zza.post(new hp0(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: p */
    public final String mo31386p() {
        String str = true != this.f38235q ? "" : " spherical";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    /* renamed from: q */
    public final void mo31387q() {
        zze.zza("AdMediaPlayerView pause");
        if (m36580G() && this.f38227i.isPlaying()) {
            this.f38227i.pause();
            m36578E(4);
            com.google.android.gms.ads.internal.util.zzt.zza.post(new pp0(this));
        }
        this.f38226h = 4;
    }

    /* renamed from: r */
    public final void mo31388r() {
        zze.zza("AdMediaPlayerView play");
        if (m36580G()) {
            this.f38227i.start();
            m36578E(3);
            this.f39024b.mo32219b();
            com.google.android.gms.ads.internal.util.zzt.zza.post(new op0(this));
        }
        this.f38226h = 3;
    }

    /* renamed from: s */
    public final void mo31389s(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        zze.zza(sb.toString());
        if (m36580G()) {
            this.f38227i.seekTo(i);
            this.f38236r = 0;
            return;
        }
        this.f38236r = i;
    }

    /* renamed from: t */
    public final void mo31390t(rp0 rp0) {
        this.f38237s = rp0;
    }

    public final String toString() {
        String name = qp0.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    /* renamed from: u */
    public final void mo31391u(String str) {
        Uri parse = Uri.parse(str);
        zzbak C0 = zzbak.m40638C0(parse);
        if (C0 == null || C0.f42923b != null) {
            if (C0 != null) {
                parse = Uri.parse(C0.f42923b);
            }
            this.f38228j = parse;
            this.f38236r = 0;
            m36575B();
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: v */
    public final void mo31392v() {
        zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f38227i;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f38227i.release();
            this.f38227i = null;
            m36578E(0);
            this.f38226h = 0;
        }
        this.f38223e.mo33732d();
    }

    /* renamed from: w */
    public final void mo31393w(float f, float f2) {
        kq0 kq0 = this.f38234p;
        if (kq0 != null) {
            kq0.mo33155e(f, f2);
        }
    }

    public final void zzn() {
        m36579F(this.f39025c.mo34396a());
    }
}
