package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.adcolony.sdk.C2978z;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;

@TargetApi(14)
/* renamed from: com.adcolony.sdk.t0 */
class C2921t0 extends TextureView implements MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f11774A;

    /* renamed from: B */
    private boolean f11775B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f11776C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f11777D;

    /* renamed from: E */
    private boolean f11778E;

    /* renamed from: F */
    private String f11779F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public String f11780G;

    /* renamed from: H */
    private FileInputStream f11781H;

    /* renamed from: I */
    private C2714c0 f11782I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C2701c f11783J;

    /* renamed from: K */
    private Surface f11784K;

    /* renamed from: L */
    private SurfaceTexture f11785L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public RectF f11786M = new RectF();
    /* access modifiers changed from: private */

    /* renamed from: N */
    public C2931j f11787N;

    /* renamed from: O */
    private ProgressBar f11788O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public MediaPlayer f11789P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public JSONObject f11790Q = C2976x.m10319b();

    /* renamed from: R */
    private ExecutorService f11791R = Executors.newSingleThreadExecutor();
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C2714c0 f11792S;

    /* renamed from: a */
    private float f11793a;

    /* renamed from: b */
    private float f11794b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public float f11795c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f11796d;

    /* renamed from: e */
    private float f11797e;

    /* renamed from: f */
    private float f11798f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f11799g;

    /* renamed from: h */
    private boolean f11800h = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Paint f11801i = new Paint();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Paint f11802j = new Paint(1);

    /* renamed from: k */
    private int f11803k;

    /* renamed from: l */
    private int f11804l;

    /* renamed from: m */
    private int f11805m;

    /* renamed from: n */
    private int f11806n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f11807o;

    /* renamed from: p */
    private int f11808p;

    /* renamed from: q */
    private int f11809q;

    /* renamed from: r */
    private int f11810r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public double f11811s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public double f11812t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public long f11813u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f11814v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f11815w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f11816x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f11817y;

    /* renamed from: z */
    private boolean f11818z;

    /* renamed from: com.adcolony.sdk.t0$a */
    class C2922a implements C2750e0 {
        C2922a() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2921t0.this.m10100a(c0Var)) {
                C2921t0.this.mo9994i();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.t0$b */
    class C2923b implements C2750e0 {
        C2923b() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2921t0.this.m10100a(c0Var)) {
                C2921t0.this.m10110c(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.t0$c */
    class C2924c implements C2750e0 {
        C2924c() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2921t0.this.m10100a(c0Var)) {
                C2921t0.this.m10113d(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.t0$d */
    class C2925d implements C2750e0 {
        C2925d() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2921t0.this.m10100a(c0Var)) {
                C2921t0.this.mo9993h();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.t0$e */
    class C2926e implements C2750e0 {
        C2926e() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2921t0.this.m10100a(c0Var)) {
                boolean unused = C2921t0.this.m10106b(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.t0$f */
    class C2927f implements C2750e0 {
        C2927f() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            if (C2921t0.this.m10100a(c0Var)) {
                boolean unused = C2921t0.this.m10117e(c0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.t0$g */
    class C2928g implements Runnable {
        C2928g() {
        }

        public void run() {
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (C2921t0.this.f11792S != null) {
                JSONObject b = C2976x.m10319b();
                C2976x.m10323b(b, TtmlNode.ATTR_ID, C2921t0.this.f11807o);
                C2976x.m10313a(b, "ad_session_id", C2921t0.this.f11780G);
                C2976x.m10325b(b, "success", true);
                C2921t0.this.f11792S.mo9607a(b).mo9612d();
                C2714c0 unused = C2921t0.this.f11792S = null;
            }
        }
    }

    /* renamed from: com.adcolony.sdk.t0$h */
    class C2929h implements Runnable {
        C2929h() {
        }

        public void run() {
            long unused = C2921t0.this.f11813u = 0;
            while (!C2921t0.this.f11814v && !C2921t0.this.f11817y && C2684a.m9410d()) {
                Context b = C2684a.m9407b();
                if (!C2921t0.this.f11814v && !C2921t0.this.f11774A && b != null && (b instanceof Activity)) {
                    if (C2921t0.this.f11789P.isPlaying()) {
                        if (C2921t0.this.f11813u == 0 && C2684a.f10586d) {
                            long unused2 = C2921t0.this.f11813u = System.currentTimeMillis();
                        }
                        boolean unused3 = C2921t0.this.f11816x = true;
                        C2921t0 t0Var = C2921t0.this;
                        double currentPosition = (double) t0Var.f11789P.getCurrentPosition();
                        Double.isNaN(currentPosition);
                        double unused4 = t0Var.f11811s = currentPosition / 1000.0d;
                        C2921t0 t0Var2 = C2921t0.this;
                        double duration = (double) t0Var2.f11789P.getDuration();
                        Double.isNaN(duration);
                        double unused5 = t0Var2.f11812t = duration / 1000.0d;
                        if (System.currentTimeMillis() - C2921t0.this.f11813u > 1000 && !C2921t0.this.f11777D && C2684a.f10586d) {
                            if (C2921t0.this.f11811s == 0.0d) {
                                new C2978z.C2979a().mo10088a("getCurrentPosition() not working, firing ").mo10088a("AdSession.on_error").mo10090a(C2978z.f11950j);
                                C2921t0.this.m10121g();
                            } else {
                                boolean unused6 = C2921t0.this.f11777D = true;
                            }
                        }
                        if (C2921t0.this.f11776C) {
                            C2921t0.this.mo9991e();
                        }
                    }
                    if (C2921t0.this.f11816x && !C2921t0.this.f11814v && !C2921t0.this.f11817y) {
                        C2976x.m10323b(C2921t0.this.f11790Q, TtmlNode.ATTR_ID, C2921t0.this.f11807o);
                        C2976x.m10323b(C2921t0.this.f11790Q, "container_id", C2921t0.this.f11783J.mo9573c());
                        C2976x.m10313a(C2921t0.this.f11790Q, "ad_session_id", C2921t0.this.f11780G);
                        C2976x.m10312a(C2921t0.this.f11790Q, "elapsed", C2921t0.this.f11811s);
                        C2976x.m10312a(C2921t0.this.f11790Q, IronSourceConstants.EVENTS_DURATION, C2921t0.this.f11812t);
                        new C2714c0("VideoView.on_progress", C2921t0.this.f11783J.mo9591k(), C2921t0.this.f11790Q).mo9612d();
                    }
                    if (C2921t0.this.f11815w || ((Activity) b).isFinishing()) {
                        boolean unused7 = C2921t0.this.f11815w = false;
                        C2921t0.this.mo9995j();
                        return;
                    }
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException unused8) {
                        C2921t0.this.m10121g();
                        new C2978z.C2979a().mo10088a("InterruptedException in ADCVideoView's update thread.").mo10090a(C2978z.f11949i);
                    }
                } else {
                    return;
                }
            }
            if (C2921t0.this.f11815w) {
                C2921t0.this.mo9995j();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.t0$i */
    class C2930i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f11827a;

        C2930i(Context context) {
            this.f11827a = context;
        }

        public void run() {
            C2931j unused = C2921t0.this.f11787N = new C2931j(this.f11827a);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (C2921t0.this.f11795c * 4.0f), (int) (C2921t0.this.f11795c * 4.0f));
            layoutParams.setMargins(0, C2921t0.this.f11783J.mo9569b() - ((int) (C2921t0.this.f11795c * 4.0f)), 0, 0);
            layoutParams.gravity = 0;
            C2921t0.this.f11783J.addView(C2921t0.this.f11787N, layoutParams);
        }
    }

    /* renamed from: com.adcolony.sdk.t0$j */
    private class C2931j extends View {
        C2931j(Context context) {
            super(context);
            setWillNotDraw(false);
            try {
                Class<?> cls = getClass();
                cls.getMethod("setLayerType", new Class[]{Integer.TYPE, Paint.class}).invoke(this, new Object[]{1, null});
            } catch (Exception unused) {
            }
        }

        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawArc(C2921t0.this.f11786M, 270.0f, C2921t0.this.f11796d, false, C2921t0.this.f11801i);
            float centerX = C2921t0.this.f11786M.centerX();
            double centerY = (double) C2921t0.this.f11786M.centerY();
            double d = (double) C2921t0.this.f11802j.getFontMetrics().bottom;
            Double.isNaN(d);
            Double.isNaN(centerY);
            canvas.drawText("" + C2921t0.this.f11799g, centerX, (float) (centerY + (d * 1.35d)), C2921t0.this.f11802j);
            invalidate();
        }
    }

    private C2921t0(Context context) {
        super(context);
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f11814v = true;
        this.f11811s = this.f11812t;
        C2976x.m10323b(this.f11790Q, TtmlNode.ATTR_ID, this.f11807o);
        C2976x.m10323b(this.f11790Q, "container_id", this.f11783J.mo9573c());
        C2976x.m10313a(this.f11790Q, "ad_session_id", this.f11780G);
        C2976x.m10312a(this.f11790Q, "elapsed", this.f11811s);
        C2976x.m10312a(this.f11790Q, IronSourceConstants.EVENTS_DURATION, this.f11812t);
        new C2714c0("VideoView.on_progress", this.f11783J.mo9591k(), this.f11790Q).mo9612d();
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        m10121g();
        C2978z.C2979a aVar = new C2978z.C2979a();
        aVar.mo10088a("MediaPlayer error: " + i + "," + i2).mo10090a(C2978z.f11949i);
        return true;
    }

    public void onMeasure(int i, int i2) {
        m10127l();
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.f11818z = true;
        if (this.f11778E) {
            this.f11783J.removeView(this.f11788O);
        }
        if (this.f11775B) {
            this.f11808p = mediaPlayer.getVideoWidth();
            this.f11809q = mediaPlayer.getVideoHeight();
            m10127l();
            new C2978z.C2979a().mo10088a("MediaPlayer getVideoWidth = ").mo10086a(mediaPlayer.getVideoWidth()).mo10090a(C2978z.f11946f);
            new C2978z.C2979a().mo10088a("MediaPlayer getVideoHeight = ").mo10086a(mediaPlayer.getVideoHeight()).mo10090a(C2978z.f11946f);
        }
        JSONObject b = C2976x.m10319b();
        C2976x.m10323b(b, TtmlNode.ATTR_ID, this.f11807o);
        C2976x.m10323b(b, "container_id", this.f11783J.mo9573c());
        C2976x.m10313a(b, "ad_session_id", this.f11780G);
        new C2714c0("VideoView.on_ready", this.f11783J.mo9591k(), b).mo9612d();
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        ExecutorService executorService = this.f11791R;
        if (executorService != null && !executorService.isShutdown()) {
            try {
                this.f11791R.submit(new C2928g());
            } catch (RejectedExecutionException unused) {
                m10121g();
            }
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (surfaceTexture == null || this.f11774A) {
            new C2978z.C2979a().mo10088a("Null texture provided by system's onSurfaceTextureAvailable or ").mo10088a("MediaPlayer has been destroyed.").mo10090a(C2978z.f11950j);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        this.f11784K = surface;
        try {
            this.f11789P.setSurface(surface);
        } catch (IllegalStateException unused) {
            new C2978z.C2979a().mo10088a("IllegalStateException thrown when calling MediaPlayer.setSurface()").mo10090a(C2978z.f11949i);
            m10121g();
        }
        this.f11785L = surfaceTexture;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f11785L = surfaceTexture;
        if (!this.f11774A) {
            return false;
        }
        surfaceTexture.release();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f11785L = surfaceTexture;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f11785L = surfaceTexture;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        C2794i c = C2684a.m9409c();
        C2715d b = c.mo9708b();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        JSONObject b2 = C2976x.m10319b();
        C2976x.m10323b(b2, "view_id", this.f11807o);
        C2976x.m10313a(b2, "ad_session_id", this.f11780G);
        C2976x.m10323b(b2, "container_x", this.f11803k + x);
        C2976x.m10323b(b2, "container_y", this.f11804l + y);
        C2976x.m10323b(b2, "view_x", x);
        C2976x.m10323b(b2, "view_y", y);
        C2976x.m10323b(b2, TtmlNode.ATTR_ID, this.f11783J.mo9573c());
        if (action == 0) {
            new C2714c0("AdContainer.on_touch_began", this.f11783J.mo9591k(), b2).mo9612d();
        } else if (action == 1) {
            if (!this.f11783J.mo9598p()) {
                c.mo9699a(b.mo9621b().get(this.f11780G));
            }
            new C2714c0("AdContainer.on_touch_ended", this.f11783J.mo9591k(), b2).mo9612d();
        } else if (action == 2) {
            new C2714c0("AdContainer.on_touch_moved", this.f11783J.mo9591k(), b2).mo9612d();
        } else if (action == 3) {
            new C2714c0("AdContainer.on_touch_cancelled", this.f11783J.mo9591k(), b2).mo9612d();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            C2976x.m10323b(b2, "container_x", ((int) motionEvent2.getX(action2)) + this.f11803k);
            C2976x.m10323b(b2, "container_y", ((int) motionEvent2.getY(action2)) + this.f11804l);
            C2976x.m10323b(b2, "view_x", (int) motionEvent2.getX(action2));
            C2976x.m10323b(b2, "view_y", (int) motionEvent2.getY(action2));
            new C2714c0("AdContainer.on_touch_began", this.f11783J.mo9591k(), b2).mo9612d();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & 65280) >> 8;
            C2976x.m10323b(b2, "container_x", ((int) motionEvent2.getX(action3)) + this.f11803k);
            C2976x.m10323b(b2, "container_y", ((int) motionEvent2.getY(action3)) + this.f11804l);
            C2976x.m10323b(b2, "view_x", (int) motionEvent2.getX(action3));
            C2976x.m10323b(b2, "view_y", (int) motionEvent2.getY(action3));
            if (!this.f11783J.mo9598p()) {
                c.mo9699a(b.mo9621b().get(this.f11780G));
            }
            new C2714c0("AdContainer.on_touch_ended", this.f11783J.mo9591k(), b2).mo9612d();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m10121g() {
        JSONObject b = C2976x.m10319b();
        C2976x.m10313a(b, TtmlNode.ATTR_ID, this.f11780G);
        new C2714c0("AdSession.on_error", this.f11783J.mo9591k(), b).mo9612d();
        this.f11814v = true;
    }

    /* renamed from: l */
    private void m10127l() {
        double d = (double) this.f11805m;
        double d2 = (double) this.f11808p;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) this.f11806n;
        double d5 = (double) this.f11809q;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double min = Math.min(d3, d4 / d5);
        double d6 = (double) this.f11808p;
        Double.isNaN(d6);
        int i = (int) (d6 * min);
        double d7 = (double) this.f11809q;
        Double.isNaN(d7);
        int i2 = (int) (d7 * min);
        new C2978z.C2979a().mo10088a("setMeasuredDimension to ").mo10086a(i).mo10088a(" by ").mo10086a(i2).mo10090a(C2978z.f11946f);
        setMeasuredDimension(i, i2);
        if (this.f11775B) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            layoutParams.gravity = 17;
            layoutParams.setMargins(0, 0, 0, 0);
            setLayoutParams(layoutParams);
        }
    }

    /* renamed from: m */
    private void m10130m() {
        try {
            this.f11791R.submit(new C2929h());
        } catch (RejectedExecutionException unused) {
            m10121g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo9993h() {
        if (!this.f11818z) {
            new C2978z.C2979a().mo10088a("ADCVideoView pause() called while MediaPlayer is not prepared.").mo10090a(C2978z.f11948h);
            return false;
        } else if (!this.f11816x) {
            return false;
        } else {
            this.f11810r = this.f11789P.getCurrentPosition();
            this.f11812t = (double) this.f11789P.getDuration();
            this.f11789P.pause();
            this.f11817y = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo9994i() {
        if (!this.f11818z) {
            return false;
        }
        if (!this.f11817y && C2684a.f10586d) {
            this.f11789P.start();
            m10130m();
        } else if (!this.f11814v && C2684a.f10586d) {
            this.f11789P.start();
            this.f11817y = false;
            if (!this.f11791R.isShutdown()) {
                m10130m();
            }
            C2931j jVar = this.f11787N;
            if (jVar != null) {
                jVar.invalidate();
            }
        }
        setWillNotDraw(false);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo9995j() {
        new C2978z.C2979a().mo10088a("MediaPlayer stopped and released.").mo10090a(C2978z.f11946f);
        try {
            if (!this.f11814v && this.f11818z && this.f11789P.isPlaying()) {
                this.f11789P.stop();
            }
        } catch (IllegalStateException unused) {
            new C2978z.C2979a().mo10088a("Caught IllegalStateException when calling stop on MediaPlayer").mo10090a(C2978z.f11948h);
        }
        ProgressBar progressBar = this.f11788O;
        if (progressBar != null) {
            this.f11783J.removeView(progressBar);
        }
        this.f11814v = true;
        this.f11818z = false;
        this.f11789P.release();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo9996k() {
        this.f11815w = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9990d() {
        Context b;
        JSONObject b2 = this.f11782I.mo9608b();
        this.f11780G = C2976x.m10337i(b2, "ad_session_id");
        this.f11803k = C2976x.m10332e(b2, "x");
        this.f11804l = C2976x.m10332e(b2, "y");
        this.f11805m = C2976x.m10332e(b2, "width");
        this.f11806n = C2976x.m10332e(b2, "height");
        this.f11776C = C2976x.m10329c(b2, "enable_timer");
        this.f11778E = C2976x.m10329c(b2, "enable_progress");
        this.f11779F = C2976x.m10337i(b2, "filepath");
        this.f11808p = C2976x.m10332e(b2, "video_width");
        this.f11809q = C2976x.m10332e(b2, "video_height");
        this.f11798f = C2684a.m9409c().mo9723j().mo9861n();
        new C2978z.C2979a().mo10088a("Original video dimensions = ").mo10086a(this.f11808p).mo10088a("x").mo10086a(this.f11809q).mo10090a(C2978z.f11944d);
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f11805m, this.f11806n);
        layoutParams.setMargins(this.f11803k, this.f11804l, 0, 0);
        layoutParams.gravity = 0;
        this.f11783J.addView(this, layoutParams);
        if (this.f11778E && (b = C2684a.m9407b()) != null) {
            ProgressBar progressBar = new ProgressBar(b);
            this.f11788O = progressBar;
            C2701c cVar = this.f11783J;
            int i = (int) (this.f11798f * 100.0f);
            cVar.addView(progressBar, new FrameLayout.LayoutParams(i, i, 17));
        }
        this.f11789P = new MediaPlayer();
        this.f11818z = false;
        try {
            if (!this.f11779F.startsWith("http")) {
                FileInputStream fileInputStream = new FileInputStream(this.f11779F);
                this.f11781H = fileInputStream;
                this.f11789P.setDataSource(fileInputStream.getFD());
            } else {
                this.f11775B = true;
                this.f11789P.setDataSource(this.f11779F);
            }
            this.f11789P.setOnErrorListener(this);
            this.f11789P.setOnPreparedListener(this);
            this.f11789P.setOnCompletionListener(this);
            this.f11789P.prepareAsync();
        } catch (IOException e) {
            new C2978z.C2979a().mo10088a("Failed to create/prepare MediaPlayer: ").mo10088a(e.toString()).mo10090a(C2978z.f11949i);
            m10121g();
        }
        this.f11783J.mo9587i().add(C2684a.m9401a("VideoView.play", (C2750e0) new C2922a(), true));
        this.f11783J.mo9587i().add(C2684a.m9401a("VideoView.set_bounds", (C2750e0) new C2923b(), true));
        this.f11783J.mo9587i().add(C2684a.m9401a("VideoView.set_visible", (C2750e0) new C2924c(), true));
        this.f11783J.mo9587i().add(C2684a.m9401a("VideoView.pause", (C2750e0) new C2925d(), true));
        this.f11783J.mo9587i().add(C2684a.m9401a("VideoView.seek_to_time", (C2750e0) new C2926e(), true));
        this.f11783J.mo9587i().add(C2684a.m9401a("VideoView.set_volume", (C2750e0) new C2927f(), true));
        this.f11783J.mo9589j().add("VideoView.play");
        this.f11783J.mo9589j().add("VideoView.set_bounds");
        this.f11783J.mo9589j().add("VideoView.set_visible");
        this.f11783J.mo9589j().add("VideoView.pause");
        this.f11783J.mo9589j().add("VideoView.seek_to_time");
        this.f11783J.mo9589j().add("VideoView.set_volume");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9991e() {
        if (this.f11800h) {
            this.f11797e = (float) (360.0d / this.f11812t);
            this.f11802j.setColor(-3355444);
            this.f11802j.setShadowLayer((float) ((int) (this.f11798f * 2.0f)), 0.0f, 0.0f, -16777216);
            this.f11802j.setTextAlign(Paint.Align.CENTER);
            this.f11802j.setLinearText(true);
            this.f11802j.setTextSize(this.f11798f * 12.0f);
            this.f11801i.setStyle(Paint.Style.STROKE);
            float f = this.f11798f * 2.0f;
            if (f > 6.0f) {
                f = 6.0f;
            }
            if (f < 4.0f) {
                f = 4.0f;
            }
            this.f11801i.setStrokeWidth(f);
            this.f11801i.setShadowLayer((float) ((int) (this.f11798f * 3.0f)), 0.0f, 0.0f, -16777216);
            this.f11801i.setColor(-3355444);
            Rect rect = new Rect();
            this.f11802j.getTextBounds("0123456789", 0, 9, rect);
            this.f11795c = (float) rect.height();
            Context b = C2684a.m9407b();
            if (b != null) {
                C2916s0.m10063a((Runnable) new C2930i(b));
            }
            this.f11800h = false;
        }
        this.f11799g = (int) (this.f11812t - this.f11811s);
        float f2 = this.f11795c;
        float f3 = (float) ((int) f2);
        this.f11793a = f3;
        float f4 = (float) ((int) (3.0f * f2));
        this.f11794b = f4;
        float f5 = f2 / 2.0f;
        float f6 = f2 * 2.0f;
        this.f11786M.set(f3 - f5, f4 - f6, f3 + f6, f4 + f5);
        double d = (double) this.f11797e;
        Double.isNaN(d);
        this.f11796d = (float) (d * (this.f11812t - this.f11811s));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo9992f() {
        return this.f11814v;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m10110c(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        this.f11803k = C2976x.m10332e(b, "x");
        this.f11804l = C2976x.m10332e(b, "y");
        this.f11805m = C2976x.m10332e(b, "width");
        this.f11806n = C2976x.m10332e(b, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f11803k, this.f11804l, 0, 0);
        layoutParams.width = this.f11805m;
        layoutParams.height = this.f11806n;
        setLayoutParams(layoutParams);
        if (this.f11776C && this.f11787N != null) {
            int i = (int) (this.f11795c * 4.0f);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
            layoutParams2.setMargins(0, this.f11783J.mo9569b() - ((int) (this.f11795c * 4.0f)), 0, 0);
            layoutParams2.gravity = 0;
            this.f11787N.setLayoutParams(layoutParams2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m10106b(C2714c0 c0Var) {
        if (!this.f11818z) {
            return false;
        }
        if (this.f11814v) {
            this.f11814v = false;
        }
        this.f11792S = c0Var;
        int e = C2976x.m10332e(c0Var.mo9608b(), "time");
        int duration = this.f11789P.getDuration() / 1000;
        this.f11789P.setOnSeekCompleteListener(this);
        this.f11789P.seekTo(e * 1000);
        if (duration == e) {
            this.f11814v = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9987a() {
        if (this.f11785L != null) {
            this.f11774A = true;
        }
        this.f11791R.shutdown();
    }

    C2921t0(Context context, C2714c0 c0Var, int i, C2701c cVar) {
        super(context);
        this.f11783J = cVar;
        this.f11782I = c0Var;
        this.f11807o = i;
        setSurfaceTextureListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m10100a(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        return C2976x.m10332e(b, TtmlNode.ATTR_ID) == this.f11807o && C2976x.m10332e(b, "container_id") == this.f11783J.mo9573c() && C2976x.m10337i(b, "ad_session_id").equals(this.f11783J.mo9563a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public MediaPlayer mo9988b() {
        return this.f11789P;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo9989c() {
        return this.f11789P != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m10117e(C2714c0 c0Var) {
        boolean z = false;
        if (!this.f11818z) {
            return false;
        }
        float d = (float) C2976x.m10330d(c0Var.mo9608b(), "volume");
        AdColonyInterstitial f = C2684a.m9409c().mo9719f();
        if (f != null) {
            if (((double) d) <= 0.0d) {
                z = true;
            }
            f.mo9467b(z);
        }
        this.f11789P.setVolume(d, d);
        JSONObject b = C2976x.m10319b();
        C2976x.m10325b(b, "success", true);
        c0Var.mo9607a(b).mo9612d();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m10113d(C2714c0 c0Var) {
        C2931j jVar;
        C2931j jVar2;
        if (C2976x.m10329c(c0Var.mo9608b(), "visible")) {
            setVisibility(0);
            if (this.f11776C && (jVar2 = this.f11787N) != null) {
                jVar2.setVisibility(0);
                return;
            }
            return;
        }
        setVisibility(4);
        if (this.f11776C && (jVar = this.f11787N) != null) {
            jVar.setVisibility(4);
        }
    }
}
