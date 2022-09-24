package british.xnews2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import java.io.IOException;
import java.util.HashMap;

public class FullscreenVideoView_pro extends RelativeLayout implements SurfaceHolder.Callback, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnInfoListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: b */
    protected Context f6747b;

    /* renamed from: c */
    protected MediaPlayer f6748c;

    /* renamed from: d */
    protected SurfaceHolder f6749d;

    /* renamed from: e */
    protected SurfaceView f6750e;

    /* renamed from: f */
    protected boolean f6751f;

    /* renamed from: g */
    protected boolean f6752g;

    /* renamed from: h */
    protected boolean f6753h;

    /* renamed from: i */
    protected C1578d f6754i;

    /* renamed from: j */
    protected C1578d f6755j;

    /* renamed from: k */
    protected View f6756k;

    /* renamed from: l */
    protected ViewGroup f6757l;

    /* renamed from: m */
    protected ViewGroup.LayoutParams f6758m;

    /* renamed from: n */
    protected boolean f6759n;

    /* renamed from: o */
    protected boolean f6760o;

    /* renamed from: p */
    protected boolean f6761p;

    /* renamed from: q */
    protected boolean f6762q;

    /* renamed from: r */
    protected int f6763r;

    /* renamed from: s */
    protected int f6764s;

    /* renamed from: t */
    protected MediaPlayer.OnErrorListener f6765t;

    /* renamed from: u */
    protected MediaPlayer.OnPreparedListener f6766u;

    /* renamed from: v */
    protected Uri f6767v;

    /* renamed from: british.xnews2.FullscreenVideoView_pro$a */
    class C1575a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ boolean f6768b;

        C1575a(boolean z) {
            this.f6768b = z;
        }

        public void run() {
            FullscreenVideoView_pro fullscreenVideoView_pro = FullscreenVideoView_pro.this;
            if (fullscreenVideoView_pro.f6748c == null) {
                return;
            }
            if (this.f6768b) {
                fullscreenVideoView_pro.mo7149l();
                return;
            }
            try {
                fullscreenVideoView_pro.mo7202j(fullscreenVideoView_pro.getCurrentPosition());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: british.xnews2.FullscreenVideoView_pro$b */
    class C1576b implements Runnable {
        C1576b() {
        }

        public void run() {
            int i;
            int i2;
            View rootView = FullscreenVideoView_pro.this.getRootView();
            if (rootView != null) {
                Display defaultDisplay = ((WindowManager) FullscreenVideoView_pro.this.f6747b.getSystemService("window")).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                int i3 = point.x;
                int i4 = point.y;
                float f = ((float) i3) / ((float) i4);
                FullscreenVideoView_pro fullscreenVideoView_pro = FullscreenVideoView_pro.this;
                if (fullscreenVideoView_pro.f6764s == -1 || fullscreenVideoView_pro.f6763r == -1) {
                    fullscreenVideoView_pro.f6763r = 30000;
                    fullscreenVideoView_pro.f6764s = MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
                }
                int i5 = fullscreenVideoView_pro.f6763r;
                int i6 = fullscreenVideoView_pro.f6764s;
                boolean z = true;
                boolean z2 = ((float) i5) / ((float) i6) > 1.0f;
                if (f <= 1.0f) {
                    z = false;
                }
                if (fullscreenVideoView_pro.f6759n) {
                    if (!z) {
                        if (z2) {
                            i = (i6 * i3) / i5;
                            i2 = i3;
                        }
                    } else if (!z2) {
                        i2 = (i5 * i4) / i6;
                        i = i4;
                    }
                    i2 = i3;
                    i = i4;
                } else {
                    int E = C1692config.m8149E(fullscreenVideoView_pro.f6747b, 43);
                    if (FullscreenVideoView_pro.this.f6760o) {
                        i = rootView.findViewById(R.id.ll_todo).getHeight() / 2;
                    } else {
                        int height = rootView.findViewById(R.id.ll_todo).getHeight() - E;
                        if (FullscreenVideoView_pro.this.f6761p) {
                            height -= rootView.findViewById(R.id.ll_descr).getHeight();
                        }
                        i = height;
                    }
                    if (z2) {
                        FullscreenVideoView_pro fullscreenVideoView_pro2 = FullscreenVideoView_pro.this;
                        int i7 = fullscreenVideoView_pro2.f6764s;
                        int i8 = fullscreenVideoView_pro2.f6763r;
                        int i9 = (i7 * i3) / i8;
                        if (i9 > i) {
                            i2 = (i8 * i) / i7;
                        } else {
                            i2 = i3;
                            i = i9;
                        }
                    } else {
                        FullscreenVideoView_pro fullscreenVideoView_pro3 = FullscreenVideoView_pro.this;
                        i2 = (fullscreenVideoView_pro3.f6763r * i) / fullscreenVideoView_pro3.f6764s;
                    }
                }
                SurfaceView surfaceView = FullscreenVideoView_pro.this.f6750e;
                if (surfaceView != null) {
                    ViewGroup.LayoutParams layoutParams = surfaceView.getLayoutParams();
                    layoutParams.width = i2;
                    layoutParams.height = i;
                    FullscreenVideoView_pro.this.f6750e.setLayoutParams(layoutParams);
                    try {
                        ((LinearLayout) FullscreenVideoView_pro.this.findViewById(R.id.ll_btns)).setLayoutParams(layoutParams);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = FullscreenVideoView_pro.this.getLayoutParams();
                layoutParams2.width = i3;
                FullscreenVideoView_pro fullscreenVideoView_pro4 = FullscreenVideoView_pro.this;
                if (fullscreenVideoView_pro4.f6759n) {
                    layoutParams2.height = i4;
                } else {
                    layoutParams2.height = i;
                }
                fullscreenVideoView_pro4.setLayoutParams(layoutParams2);
            }
        }
    }

    /* renamed from: british.xnews2.FullscreenVideoView_pro$c */
    static /* synthetic */ class C1577c {

        /* renamed from: a */
        static final /* synthetic */ int[] f6771a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                british.xnews2.FullscreenVideoView_pro$d[] r0 = british.xnews2.FullscreenVideoView_pro.C1578d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6771a = r0
                british.xnews2.FullscreenVideoView_pro$d r1 = british.xnews2.FullscreenVideoView_pro.C1578d.STARTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6771a     // Catch:{ NoSuchFieldError -> 0x001d }
                british.xnews2.FullscreenVideoView_pro$d r1 = british.xnews2.FullscreenVideoView_pro.C1578d.PLAYBACKCOMPLETED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6771a     // Catch:{ NoSuchFieldError -> 0x0028 }
                british.xnews2.FullscreenVideoView_pro$d r1 = british.xnews2.FullscreenVideoView_pro.C1578d.PREPARED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.FullscreenVideoView_pro.C1577c.<clinit>():void");
        }
    }

    /* renamed from: british.xnews2.FullscreenVideoView_pro$d */
    public enum C1578d {
        IDLE,
        INITIALIZED,
        PREPARED,
        PREPARING,
        STARTED,
        STOPPED,
        PAUSED,
        PLAYBACKCOMPLETED,
        ERROR,
        END
    }

    public FullscreenVideoView_pro(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6747b = context;
        mo7144a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7144a() {
        if (!isInEditMode()) {
            this.f6762q = true;
            this.f6754i = C1578d.IDLE;
            this.f6759n = false;
            setBackgroundColor(-16777216);
            mo7145b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7145b() {
        this.f6748c = new MediaPlayer();
        this.f6750e = new SurfaceView(this.f6747b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f6750e.setLayoutParams(layoutParams);
        addView(this.f6750e);
        SurfaceHolder holder = this.f6750e.getHolder();
        this.f6749d = holder;
        holder.setType(3);
        this.f6749d.addCallback(this);
        if (this.f6756k == null) {
            this.f6756k = new ProgressBar(this.f6747b);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        this.f6756k.setLayoutParams(layoutParams2);
        addView(this.f6756k);
    }

    /* renamed from: c */
    public boolean mo7195c() {
        return this.f6759n;
    }

    /* renamed from: d */
    public boolean mo7196d() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f6748c;
        if (mediaPlayer != null) {
            return mediaPlayer.isPlaying();
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* renamed from: e */
    public void mo7146e() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f6748c;
        if (mediaPlayer != null) {
            this.f6754i = C1578d.PAUSED;
            mediaPlayer.pause();
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo7197f() throws IllegalStateException {
        mo7204m();
        this.f6751f = false;
        this.f6764s = -1;
        this.f6763r = -1;
        this.f6748c.setOnPreparedListener(this);
        this.f6748c.setOnErrorListener(this);
        this.f6748c.setOnSeekCompleteListener(this);
        this.f6748c.setOnInfoListener(this);
        this.f6748c.setOnVideoSizeChangedListener(this);
        this.f6748c.setAudioStreamType(3);
        this.f6754i = C1578d.PREPARING;
        this.f6748c.prepareAsync();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo7147g() {
        SurfaceHolder surfaceHolder = this.f6749d;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this);
            this.f6749d = null;
        }
        MediaPlayer mediaPlayer = this.f6748c;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f6748c = null;
        }
        SurfaceView surfaceView = this.f6750e;
        if (surfaceView != null) {
            removeView(surfaceView);
        }
        View view = this.f6756k;
        if (view != null) {
            removeView(view);
        }
    }

    public int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.f6748c;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    public synchronized C1578d getCurrentState() {
        return this.f6754i;
    }

    public int getDuration() {
        MediaPlayer mediaPlayer = this.f6748c;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* renamed from: h */
    public void mo7148h() {
        if (this.f6748c != null) {
            this.f6754i = C1578d.IDLE;
            mo7147g();
            mo7145b();
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* renamed from: i */
    public void mo7201i() {
        if (this.f6764s != 0 && this.f6763r != 0) {
            new Handler(Looper.getMainLooper()).post(new C1576b());
        }
    }

    /* renamed from: j */
    public void mo7202j(int i) throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f6748c;
        if (mediaPlayer == null) {
            throw new RuntimeException("Media Player is not initialized");
        } else if (mediaPlayer.getDuration() > -1 && i <= this.f6748c.getDuration()) {
            this.f6755j = this.f6754i;
            mo7146e();
            this.f6748c.seekTo(i);
            mo7204m();
        }
    }

    /* renamed from: k */
    public void mo7203k(Uri uri, String str) throws IOException, IllegalStateException, SecurityException, IllegalArgumentException, RuntimeException {
        if (this.f6748c == null) {
            throw new RuntimeException("Media Player is not initialized");
        } else if (this.f6754i == C1578d.IDLE) {
            if (str == null || str.isEmpty()) {
                this.f6748c.setDataSource(this.f6747b, uri);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(RtspHeaders.USER_AGENT, str);
                this.f6748c.setDataSource(this.f6747b, uri, hashMap);
            }
            this.f6767v = uri;
            this.f6754i = C1578d.INITIALIZED;
            mo7197f();
        } else {
            throw new IllegalStateException("FullscreenVideoView Invalid State: " + this.f6754i);
        }
    }

    /* renamed from: l */
    public void mo7149l() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f6748c;
        if (mediaPlayer != null) {
            C1578d dVar = this.f6754i;
            this.f6754i = C1578d.STARTED;
            mediaPlayer.setOnCompletionListener(this);
            this.f6748c.start();
            if (dVar == C1578d.PREPARED) {
                ((C1692config) this.f6747b.getApplicationContext()).mo7504g1(this.f6747b, false, false, false);
                return;
            }
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo7204m() {
        View view = this.f6756k;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo7205n() {
        View view = this.f6756k;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo7150o() {
        if (this.f6752g && this.f6751f) {
            MediaPlayer mediaPlayer = this.f6748c;
            if (mediaPlayer != null) {
                this.f6763r = mediaPlayer.getVideoWidth();
                this.f6764s = this.f6748c.getVideoHeight();
            }
            mo7201i();
            mo7205n();
            this.f6754i = C1578d.PREPARED;
            if (this.f6762q) {
                mo7149l();
            }
            MediaPlayer.OnPreparedListener onPreparedListener = this.f6766u;
            if (onPreparedListener != null) {
                onPreparedListener.onPrepared(this.f6748c);
            }
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2 = this.f6748c;
        if (mediaPlayer2 != null && this.f6754i != C1578d.ERROR) {
            if (!mediaPlayer2.isLooping()) {
                this.f6754i = C1578d.PLAYBACKCOMPLETED;
            } else {
                mo7149l();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f6753h) {
            MediaPlayer mediaPlayer = this.f6748c;
            if (mediaPlayer != null) {
                mediaPlayer.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
                this.f6748c.setOnErrorListener((MediaPlayer.OnErrorListener) null);
                this.f6748c.setOnSeekCompleteListener((MediaPlayer.OnSeekCompleteListener) null);
                this.f6748c.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
                this.f6748c.setOnInfoListener((MediaPlayer.OnInfoListener) null);
                if (this.f6748c.isPlaying()) {
                    this.f6748c.stop();
                }
                this.f6748c.release();
                this.f6748c = null;
            }
            this.f6751f = false;
            this.f6752g = false;
            this.f6754i = C1578d.END;
        }
        this.f6753h = false;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        mo7205n();
        this.f6754i = C1578d.ERROR;
        MediaPlayer.OnErrorListener onErrorListener = this.f6765t;
        if (onErrorListener != null) {
            return onErrorListener.onError(mediaPlayer, i, i2);
        }
        return false;
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        return false;
    }

    public synchronized void onPrepared(MediaPlayer mediaPlayer) {
        this.f6751f = true;
        mo7150o();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        return super.onSaveInstanceState();
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        mo7205n();
        C1578d dVar = this.f6755j;
        if (dVar != null) {
            int i = C1577c.f6771a[dVar.ordinal()];
            if (i == 1) {
                mo7149l();
            } else if (i == 2) {
                this.f6754i = C1578d.PLAYBACKCOMPLETED;
            } else if (i == 3) {
                this.f6754i = C1578d.PREPARED;
            }
        }
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.f6763r == 0 && this.f6764s == 0) {
            this.f6763r = i;
            this.f6764s = i2;
            mo7201i();
        }
    }

    @TargetApi(16)
    public void setFullscreen(boolean z) throws RuntimeException {
        if (this.f6748c == null) {
            throw new RuntimeException("Media Player is not initialized");
        } else if (this.f6754i != C1578d.ERROR) {
            boolean z2 = true;
            if (!(Build.VERSION.SDK_INT >= 16 ? ViewConfiguration.get(getContext()).hasPermanentMenuKey() : true)) {
                ((Activity) getContext()).getWindow().getDecorView().setSystemUiVisibility(z ? 4 : 0);
            } else if (z) {
                ((Activity) getContext()).getWindow().setFlags(1024, 1024);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(1024);
            }
            this.f6759n = z;
            boolean isPlaying = this.f6748c.isPlaying();
            if (isPlaying) {
                mo7146e();
            }
            if (this.f6759n) {
                View findViewById = getRootView().findViewById(16908290);
                ViewParent parent = getParent();
                if (parent instanceof ViewGroup) {
                    if (this.f6757l == null) {
                        this.f6757l = (ViewGroup) parent;
                    }
                    this.f6753h = true;
                    this.f6758m = getLayoutParams();
                    this.f6757l.removeView(this);
                }
                if (findViewById instanceof ViewGroup) {
                    ((ViewGroup) findViewById).addView(this);
                    setClickable(true);
                }
            } else {
                ViewParent parent2 = getParent();
                if (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = this.f6757l;
                    if (viewGroup == null || viewGroup.getParent() == null) {
                        z2 = false;
                    } else {
                        this.f6753h = true;
                    }
                    ((ViewGroup) parent2).removeView(this);
                    if (z2) {
                        this.f6757l.addView(this, 0);
                        setLayoutParams(this.f6758m);
                    }
                }
            }
            mo7201i();
            new Handler(Looper.getMainLooper()).post(new C1575a(isPlaying));
        }
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        if (this.f6748c != null) {
            this.f6765t = onErrorListener;
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        if (this.f6748c != null) {
            this.f6766u = onPreparedListener;
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        mo7201i();
    }

    public synchronized void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f6748c.setDisplay(this.f6749d);
        if (!this.f6752g) {
            this.f6752g = true;
            C1578d dVar = this.f6754i;
            if (!(dVar == C1578d.PREPARED || dVar == C1578d.PAUSED || dVar == C1578d.STARTED || dVar == C1578d.PLAYBACKCOMPLETED)) {
                mo7150o();
            }
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        MediaPlayer mediaPlayer = this.f6748c;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f6748c.pause();
        }
        this.f6752g = false;
    }

    public FullscreenVideoView_pro(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6747b = context;
        mo7144a();
    }
}
