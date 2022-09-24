package british.xnews2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import java.io.IOException;
import java.util.HashMap;

public class FullscreenVideoView extends RelativeLayout implements SurfaceHolder.Callback, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnInfoListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: b */
    C1692config f6712b;

    /* renamed from: c */
    protected Context f6713c;

    /* renamed from: d */
    protected MediaPlayer f6714d;

    /* renamed from: e */
    protected SurfaceHolder f6715e;

    /* renamed from: f */
    protected SurfaceView f6716f;

    /* renamed from: g */
    protected boolean f6717g;

    /* renamed from: h */
    protected boolean f6718h;

    /* renamed from: i */
    protected boolean f6719i;

    /* renamed from: j */
    protected C1574d f6720j;

    /* renamed from: k */
    protected C1574d f6721k;

    /* renamed from: l */
    protected View f6722l;

    /* renamed from: m */
    protected ViewGroup f6723m;

    /* renamed from: n */
    protected ViewGroup.LayoutParams f6724n;

    /* renamed from: o */
    protected boolean f6725o;

    /* renamed from: p */
    protected boolean f6726p;

    /* renamed from: q */
    protected int f6727q;

    /* renamed from: r */
    protected int f6728r;

    /* renamed from: s */
    protected MediaPlayer.OnErrorListener f6729s;

    /* renamed from: t */
    protected MediaPlayer.OnPreparedListener f6730t;

    /* renamed from: u */
    protected Uri f6731u;

    /* renamed from: british.xnews2.FullscreenVideoView$a */
    class C1571a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ boolean f6732b;

        C1571a(boolean z) {
            this.f6732b = z;
        }

        public void run() {
            if (this.f6732b) {
                FullscreenVideoView fullscreenVideoView = FullscreenVideoView.this;
                if (fullscreenVideoView.f6714d != null) {
                    fullscreenVideoView.mo7124l();
                }
            }
        }
    }

    /* renamed from: british.xnews2.FullscreenVideoView$b */
    class C1572b implements Runnable {
        C1572b() {
        }

        public void run() {
            View view = (View) FullscreenVideoView.this.getParent();
            if (view != null) {
                FullscreenVideoView fullscreenVideoView = FullscreenVideoView.this;
                float f = ((float) fullscreenVideoView.f6727q) / ((float) fullscreenVideoView.f6728r);
                int width = view.getWidth();
                int height = view.getHeight();
                float f2 = (float) width;
                float f3 = (float) height;
                if (f > f2 / f3) {
                    height = (int) (f2 / f);
                } else {
                    width = (int) (f * f3);
                }
                ViewGroup.LayoutParams layoutParams = FullscreenVideoView.this.f6716f.getLayoutParams();
                layoutParams.width = width;
                layoutParams.height = height;
                FullscreenVideoView.this.f6716f.setLayoutParams(layoutParams);
                try {
                    ((LinearLayout) FullscreenVideoView.this.findViewById(R.id.ll_btns)).setLayoutParams(layoutParams);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: british.xnews2.FullscreenVideoView$c */
    static /* synthetic */ class C1573c {

        /* renamed from: a */
        static final /* synthetic */ int[] f6735a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                british.xnews2.FullscreenVideoView$d[] r0 = british.xnews2.FullscreenVideoView.C1574d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6735a = r0
                british.xnews2.FullscreenVideoView$d r1 = british.xnews2.FullscreenVideoView.C1574d.STARTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6735a     // Catch:{ NoSuchFieldError -> 0x001d }
                british.xnews2.FullscreenVideoView$d r1 = british.xnews2.FullscreenVideoView.C1574d.PLAYBACKCOMPLETED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6735a     // Catch:{ NoSuchFieldError -> 0x0028 }
                british.xnews2.FullscreenVideoView$d r1 = british.xnews2.FullscreenVideoView.C1574d.PREPARED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.FullscreenVideoView.C1573c.<clinit>():void");
        }
    }

    /* renamed from: british.xnews2.FullscreenVideoView$d */
    public enum C1574d {
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

    public FullscreenVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6713c = context;
        mo7119a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7119a() {
        if (!isInEditMode()) {
            this.f6712b = (C1692config) this.f6713c.getApplicationContext();
            this.f6726p = true;
            this.f6720j = C1574d.IDLE;
            this.f6725o = false;
            setBackgroundColor(-16777216);
            mo7120b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7120b() {
        this.f6714d = new MediaPlayer();
        this.f6716f = new SurfaceView(this.f6713c);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f6716f.setLayoutParams(layoutParams);
        addView(this.f6716f);
        SurfaceHolder holder = this.f6716f.getHolder();
        this.f6715e = holder;
        holder.setType(3);
        this.f6715e.addCallback(this);
        if (this.f6722l == null) {
            this.f6722l = new ProgressBar(this.f6713c);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        this.f6722l.setLayoutParams(layoutParams2);
        if (Build.VERSION.SDK_INT > 20) {
            C1692config.m8168S0((ProgressBar) this.f6722l, this.f6712b.f7368l1);
        }
        addView(this.f6722l);
    }

    /* renamed from: c */
    public boolean mo7169c() {
        return this.f6725o;
    }

    /* renamed from: d */
    public boolean mo7170d() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f6714d;
        if (mediaPlayer != null) {
            return mediaPlayer.isPlaying();
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* renamed from: e */
    public void mo7121e() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f6714d;
        if (mediaPlayer != null) {
            this.f6720j = C1574d.PAUSED;
            mediaPlayer.pause();
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo7171f() throws IllegalStateException {
        mo7178m();
        this.f6717g = false;
        this.f6728r = -1;
        this.f6727q = -1;
        this.f6714d.setOnPreparedListener(this);
        this.f6714d.setOnErrorListener(this);
        this.f6714d.setOnSeekCompleteListener(this);
        this.f6714d.setOnInfoListener(this);
        this.f6714d.setOnVideoSizeChangedListener(this);
        this.f6714d.setAudioStreamType(3);
        this.f6720j = C1574d.PREPARING;
        this.f6714d.prepareAsync();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo7122g() {
        SurfaceHolder surfaceHolder = this.f6715e;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this);
            this.f6715e = null;
        }
        MediaPlayer mediaPlayer = this.f6714d;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f6714d = null;
        }
        SurfaceView surfaceView = this.f6716f;
        if (surfaceView != null) {
            removeView(surfaceView);
        }
        View view = this.f6722l;
        if (view != null) {
            removeView(view);
        }
    }

    public int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.f6714d;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    public synchronized C1574d getCurrentState() {
        return this.f6720j;
    }

    public int getDuration() {
        MediaPlayer mediaPlayer = this.f6714d;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* renamed from: h */
    public void mo7123h() {
        if (this.f6714d != null) {
            this.f6720j = C1574d.IDLE;
            mo7122g();
            mo7120b();
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* renamed from: i */
    public void mo7175i() {
        if (this.f6728r != -1 && this.f6727q != -1 && this.f6716f != null) {
            new Handler(Looper.getMainLooper()).post(new C1572b());
        }
    }

    /* renamed from: j */
    public void mo7176j(int i) throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f6714d;
        if (mediaPlayer == null) {
            throw new RuntimeException("Media Player is not initialized");
        } else if (mediaPlayer.getDuration() > -1 && i <= this.f6714d.getDuration()) {
            this.f6721k = this.f6720j;
            mo7121e();
            this.f6714d.seekTo(i);
            mo7178m();
        }
    }

    /* renamed from: k */
    public void mo7177k(Uri uri, String str) throws IOException, IllegalStateException, SecurityException, IllegalArgumentException, RuntimeException {
        if (this.f6714d == null) {
            throw new RuntimeException("Media Player is not initialized");
        } else if (this.f6720j == C1574d.IDLE) {
            if (str == null || str.isEmpty()) {
                this.f6714d.setDataSource(this.f6713c, uri);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(RtspHeaders.USER_AGENT, str);
                this.f6714d.setDataSource(this.f6713c, uri, hashMap);
            }
            this.f6731u = uri;
            this.f6720j = C1574d.INITIALIZED;
            mo7171f();
        } else {
            throw new IllegalStateException("FullscreenVideoView Invalid State: " + this.f6720j);
        }
    }

    /* renamed from: l */
    public void mo7124l() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f6714d;
        if (mediaPlayer != null) {
            C1574d dVar = this.f6720j;
            this.f6720j = C1574d.STARTED;
            mediaPlayer.setOnCompletionListener(this);
            this.f6714d.start();
            if (dVar == C1574d.PREPARED) {
                ((C1692config) this.f6713c.getApplicationContext()).mo7504g1(this.f6713c, false, false, false);
                return;
            }
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo7178m() {
        View view = this.f6722l;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo7179n() {
        View view = this.f6722l;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo7125o() {
        if (this.f6718h && this.f6717g) {
            MediaPlayer mediaPlayer = this.f6714d;
            if (mediaPlayer != null) {
                this.f6727q = mediaPlayer.getVideoWidth();
                this.f6728r = this.f6714d.getVideoHeight();
            }
            mo7175i();
            mo7179n();
            this.f6720j = C1574d.PREPARED;
            if (this.f6726p) {
                mo7124l();
            }
            MediaPlayer.OnPreparedListener onPreparedListener = this.f6730t;
            if (onPreparedListener != null) {
                onPreparedListener.onPrepared(this.f6714d);
            }
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2 = this.f6714d;
        if (mediaPlayer2 != null && this.f6720j != C1574d.ERROR) {
            if (!mediaPlayer2.isLooping()) {
                this.f6720j = C1574d.PLAYBACKCOMPLETED;
            } else {
                mo7124l();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f6719i) {
            MediaPlayer mediaPlayer = this.f6714d;
            if (mediaPlayer != null) {
                mediaPlayer.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
                this.f6714d.setOnErrorListener((MediaPlayer.OnErrorListener) null);
                this.f6714d.setOnSeekCompleteListener((MediaPlayer.OnSeekCompleteListener) null);
                this.f6714d.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
                this.f6714d.setOnInfoListener((MediaPlayer.OnInfoListener) null);
                if (this.f6714d.isPlaying()) {
                    this.f6714d.stop();
                }
                this.f6714d.release();
                this.f6714d = null;
            }
            this.f6717g = false;
            this.f6718h = false;
            this.f6720j = C1574d.END;
        }
        this.f6719i = false;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        mo7179n();
        this.f6720j = C1574d.ERROR;
        MediaPlayer.OnErrorListener onErrorListener = this.f6729s;
        if (onErrorListener != null) {
            return onErrorListener.onError(mediaPlayer, i, i2);
        }
        return false;
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        return false;
    }

    public synchronized void onPrepared(MediaPlayer mediaPlayer) {
        this.f6717g = true;
        mo7125o();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        return super.onSaveInstanceState();
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        mo7179n();
        C1574d dVar = this.f6721k;
        if (dVar != null) {
            int i = C1573c.f6735a[dVar.ordinal()];
            if (i == 1) {
                mo7124l();
            } else if (i == 2) {
                this.f6720j = C1574d.PLAYBACKCOMPLETED;
            } else if (i == 3) {
                this.f6720j = C1574d.PREPARED;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo7175i();
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.f6727q == 0 && this.f6728r == 0) {
            this.f6727q = i;
            this.f6728r = i2;
            mo7175i();
        }
    }

    @TargetApi(16)
    public void setFullscreen(boolean z) throws RuntimeException {
        int i;
        if (this.f6714d == null) {
            throw new RuntimeException("Media Player is not initialized");
        } else if (this.f6720j != C1574d.ERROR) {
            int i2 = Build.VERSION.SDK_INT;
            boolean z2 = true;
            if (!(i2 >= 16 ? ViewConfiguration.get(getContext()).hasPermanentMenuKey() : true)) {
                View decorView = ((Activity) getContext()).getWindow().getDecorView();
                if (z) {
                    i = 1798;
                    if (i2 > 18) {
                        i = 5894;
                    }
                } else {
                    i = 0;
                }
                decorView.setSystemUiVisibility(i);
            } else if (z) {
                ((Activity) getContext()).getWindow().setFlags(1024, 1024);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(1024);
            }
            if (this.f6725o != z) {
                this.f6725o = z;
                boolean isPlaying = this.f6714d.isPlaying();
                if (isPlaying) {
                    mo7121e();
                }
                if (this.f6725o) {
                    View findViewById = getRootView().findViewById(16908290);
                    ViewParent parent = getParent();
                    if (parent instanceof ViewGroup) {
                        if (this.f6723m == null) {
                            this.f6723m = (ViewGroup) parent;
                        }
                        this.f6719i = true;
                        this.f6724n = getLayoutParams();
                        this.f6723m.removeView(this);
                    }
                    if (findViewById instanceof ViewGroup) {
                        ((ViewGroup) findViewById).addView(this);
                    }
                } else {
                    ViewParent parent2 = getParent();
                    if (parent2 instanceof ViewGroup) {
                        ViewGroup viewGroup = this.f6723m;
                        if (viewGroup == null || viewGroup.getParent() == null) {
                            z2 = false;
                        } else {
                            this.f6719i = true;
                        }
                        ((ViewGroup) parent2).removeView(this);
                        if (z2) {
                            this.f6723m.addView(this);
                            setLayoutParams(this.f6724n);
                        }
                    }
                }
                mo7175i();
                new Handler(Looper.getMainLooper()).post(new C1571a(isPlaying));
            }
        }
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        if (this.f6714d != null) {
            this.f6729s = onErrorListener;
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        if (this.f6714d != null) {
            this.f6730t = onPreparedListener;
            return;
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        mo7175i();
    }

    public synchronized void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f6714d.setDisplay(this.f6715e);
        if (!this.f6718h) {
            this.f6718h = true;
            C1574d dVar = this.f6720j;
            if (!(dVar == C1574d.PREPARED || dVar == C1574d.PAUSED || dVar == C1574d.STARTED || dVar == C1574d.PLAYBACKCOMPLETED)) {
                mo7125o();
            }
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        MediaPlayer mediaPlayer = this.f6714d;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f6714d.pause();
        }
        this.f6718h = false;
    }

    public FullscreenVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6713c = context;
        mo7119a();
    }
}
