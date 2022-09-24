package com.startapp.sdk.ads.video;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.startio.adsession.media.InteractionType;
import com.iab.omid.library.startio.adsession.media.Position;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.C11772a5;
import com.startapp.C11780a6;
import com.startapp.C11882e4;
import com.startapp.C11938h5;
import com.startapp.C11970ib;
import com.startapp.C11971ic;
import com.startapp.C11972id;
import com.startapp.C11973ie;
import com.startapp.C11974j;
import com.startapp.C11998jc;
import com.startapp.C12000je;
import com.startapp.C12011k7;
import com.startapp.C12035lc;
import com.startapp.C12060mc;
import com.startapp.C12078nc;
import com.startapp.C12115oc;
import com.startapp.C12117oe;
import com.startapp.C12133pc;
import com.startapp.C12150qc;
import com.startapp.C12169rc;
import com.startapp.C12186sc;
import com.startapp.C12350tc;
import com.startapp.C12376uc;
import com.startapp.C12377ud;
import com.startapp.C12396vb;
import com.startapp.C12397vc;
import com.startapp.C12417wc;
import com.startapp.C12419x;
import com.startapp.C12437y;
import com.startapp.C12458z0;
import com.startapp.C5004d4;
import com.startapp.C5009h0;
import com.startapp.C5015nb;
import com.startapp.C5116u5;
import com.startapp.sdk.ads.video.C12237d;
import com.startapp.sdk.ads.video.player.C12254a;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;
import com.startapp.sdk.ads.video.tracking.AbsoluteTrackingLink;
import com.startapp.sdk.ads.video.tracking.ActionTrackingLink;
import com.startapp.sdk.ads.video.tracking.FractionTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoClickedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoProgressTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class VideoMode extends C11772a5 {

    /* renamed from: K */
    public VideoPlayerInterface f54325K;

    /* renamed from: L */
    public VideoView f54326L;

    /* renamed from: M */
    public RelativeLayout f54327M;

    /* renamed from: N */
    public RelativeLayout f54328N;

    /* renamed from: O */
    public ProgressBar f54329O;

    /* renamed from: P */
    public boolean f54330P = false;

    /* renamed from: Q */
    public int f54331Q = 0;

    /* renamed from: R */
    public int f54332R = 0;

    /* renamed from: S */
    public int f54333S = 0;

    /* renamed from: T */
    public boolean f54334T;

    /* renamed from: U */
    public boolean f54335U = false;

    /* renamed from: V */
    public boolean f54336V = false;

    /* renamed from: W */
    public boolean f54337W = false;

    /* renamed from: X */
    public boolean f54338X = false;

    /* renamed from: Y */
    public HashMap<Integer, Boolean> f54339Y = new HashMap<>();

    /* renamed from: Z */
    public HashMap<Integer, Boolean> f54340Z = new HashMap<>();

    /* renamed from: a0 */
    public int f54341a0 = 1;

    /* renamed from: b0 */
    public boolean f54342b0 = false;

    /* renamed from: c0 */
    public boolean f54343c0 = false;

    /* renamed from: d0 */
    public int f54344d0 = 0;

    /* renamed from: e0 */
    public boolean f54345e0 = false;

    /* renamed from: f0 */
    public boolean f54346f0 = false;

    /* renamed from: g0 */
    public boolean f54347g0 = false;

    /* renamed from: h0 */
    public boolean f54348h0 = false;

    /* renamed from: i0 */
    public int f54349i0 = 0;

    /* renamed from: j0 */
    public int f54350j0;

    /* renamed from: k0 */
    public String f54351k0 = null;

    /* renamed from: l0 */
    public Handler f54352l0 = new Handler();

    /* renamed from: m0 */
    public Handler f54353m0 = new Handler();

    /* renamed from: n0 */
    public Handler f54354n0 = new Handler();

    /* renamed from: o0 */
    public Handler f54355o0 = new Handler();

    /* renamed from: p0 */
    public final Map<Integer, List<FractionTrackingLink>> f54356p0 = new HashMap();

    /* renamed from: q0 */
    public final Map<Integer, List<AbsoluteTrackingLink>> f54357q0 = new HashMap();

    /* renamed from: r0 */
    public long f54358r0;

    /* renamed from: s0 */
    public long f54359s0;

    /* renamed from: t0 */
    public boolean f54360t0 = false;

    /* renamed from: u0 */
    public final BroadcastReceiver f54361u0 = new C12227d();

    /* renamed from: v0 */
    public final Runnable f54362v0 = new C12228e();

    /* compiled from: Sta */
    public enum HtmlMode {
        POST_ROLL
    }

    /* compiled from: Sta */
    public enum VideoFinishedReason {
        COMPLETE,
        CLICKED,
        SKIPPED
    }

    /* renamed from: com.startapp.sdk.ads.video.VideoMode$a */
    /* compiled from: Sta */
    public class C12223a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f54369a;

        /* renamed from: b */
        public final /* synthetic */ Handler f54370b;

        public C12223a(int i, Handler handler) {
            this.f54369a = i;
            this.f54370b = handler;
        }

        public void run() {
            VideoMode videoMode;
            C12011k7 k7Var;
            VideoMode videoMode2 = VideoMode.this;
            if (videoMode2.f54325K != null) {
                videoMode2.mo46003P();
                int i = this.f54369a;
                if (i > 0 && (k7Var = videoMode.f52558H) != null) {
                    float f = (float) i;
                    float f2 = (videoMode = VideoMode.this).f54330P ? 0.0f : 1.0f;
                    C11780a6 a6Var = k7Var.f53202c;
                    if (a6Var != null) {
                        if (f > 0.0f) {
                            a6Var.mo45134a(f2);
                            C12000je.m52518a(a6Var.f52572a);
                            JSONObject jSONObject = new JSONObject();
                            C12377ud.m53546a(jSONObject, IronSourceConstants.EVENTS_DURATION, Float.valueOf(f));
                            C12377ud.m53546a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
                            C12377ud.m53546a(jSONObject, "deviceVolume", Float.valueOf(C12117oe.m52725a().f53985a));
                            C11973ie.f53134a.mo45463a(a6Var.f52572a.f53128e.mo20421c(), TtmlNode.START, jSONObject);
                        } else {
                            throw new IllegalArgumentException("Invalid Media duration");
                        }
                    }
                }
                VideoMode videoMode3 = VideoMode.this;
                videoMode3.f54337W = true;
                videoMode3.mo46005R();
                this.f54370b.post(VideoMode.this.f54362v0);
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.VideoMode$b */
    /* compiled from: Sta */
    public class C12224b implements Runnable {
        public C12224b() {
        }

        public void run() {
            try {
                VideoPlayerInterface videoPlayerInterface = VideoMode.this.f54325K;
                if (videoPlayerInterface == null) {
                    return;
                }
                if (((NativeVideoPlayer) videoPlayerInterface).f54422g.getCurrentPosition() > 0) {
                    VideoMode.this.mo46017f(0);
                    VideoMode.this.mo46016e(0);
                    VideoMode videoMode = VideoMode.this;
                    if (videoMode.f52555E == 0) {
                        videoMode.mo45997J();
                        C5116u5.m23368a((Context) VideoMode.this.f52600b).mo21244a(new Intent("com.startapp.android.ShowDisplayBroadcastListener").putExtra("dParam", VideoMode.this.mo45145a()));
                        return;
                    }
                    return;
                }
                VideoMode videoMode2 = VideoMode.this;
                if (!videoMode2.f54338X) {
                    videoMode2.f54352l0.postDelayed(this, 100);
                }
            } catch (Throwable th) {
                C5004d4.m22887a(th);
                VideoMode.this.mo45101b();
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.VideoMode$c */
    /* compiled from: Sta */
    public class C12225c implements Runnable {

        /* renamed from: com.startapp.sdk.ads.video.VideoMode$c$a */
        /* compiled from: Sta */
        public class C12226a implements Runnable {
            public C12226a() {
            }

            public void run() {
                try {
                    VideoMode.this.mo46005R();
                    VideoMode.this.getClass();
                    VideoMode videoMode = VideoMode.this;
                    videoMode.mo46009a(new VideoPlayerInterface.C12253e(VideoPlayerInterface.VideoPlayerErrorType.BUFFERING_TIMEOUT, "Buffering timeout reached", videoMode.f54331Q));
                } catch (Throwable th) {
                    C5004d4.m22887a(th);
                }
            }
        }

        public C12225c() {
        }

        public void run() {
            C11780a6 a6Var;
            try {
                VideoMode.this.f54329O.setVisibility(0);
                C12011k7 k7Var = VideoMode.this.f52558H;
                if (!(k7Var == null || (a6Var = k7Var.f53202c) == null)) {
                    C12000je.m52518a(a6Var.f52572a);
                    C11973ie.f53134a.mo45463a(a6Var.f52572a.f53128e.mo20421c(), "bufferStart", (JSONObject) null);
                }
                VideoMode.this.f54355o0.postDelayed(new C12226a(), AdsCommonMetaData.f22242h.mo20877G().mo20994c());
            } catch (Throwable th) {
                VideoMode.this.mo46005R();
                C5004d4.m22887a(th);
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.VideoMode$d */
    /* compiled from: Sta */
    public class C12227d extends BroadcastReceiver {
        public C12227d() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!VideoMode.this.f54361u0.isInitialStickyBroadcast()) {
                VideoMode videoMode = VideoMode.this;
                if (videoMode.f54330P != videoMode.mo45995H()) {
                    VideoMode videoMode2 = VideoMode.this;
                    videoMode2.f54330P = !videoMode2.f54330P;
                    videoMode2.mo45999L();
                    VideoMode videoMode3 = VideoMode.this;
                    videoMode3.mo46010a(videoMode3.f54330P);
                }
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.VideoMode$e */
    /* compiled from: Sta */
    public class C12228e implements Runnable {
        public C12228e() {
        }

        public void run() {
            VideoMode.this.mo45989B();
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.VideoMode$f */
    /* compiled from: Sta */
    public class C12229f extends C11772a5.C11779g {
        public C12229f() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            VideoMode.this.mo45111j();
            VideoMode.this.mo45125w();
        }
    }

    /* renamed from: A */
    public final void mo45988A() {
        String e = mo46019y().mo45973e();
        if (e != null) {
            this.f52561v.setWebViewClient(new C12229f());
            C5015nb.m22921a(this.f52561v, e);
            return;
        }
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.f54325K != null);
        C5015nb.m22916a(this.f52561v, true, "videoApi.setReplayEnabled", objArr);
        C5015nb.m22916a(this.f52561v, true, "videoApi.setMode", HtmlMode.POST_ROLL + "_" + mo46019y().mo45974f());
        C5015nb.m22916a(this.f52561v, true, "videoApi.setCloseable", Boolean.TRUE);
    }

    /* renamed from: B */
    public void mo45989B() {
        if (this.f54337W) {
            mo46013b((View) this.f54326L);
            if (!mo45996I()) {
                C5015nb.m22916a(this.f52561v, true, "videoApi.setClickableVideo", Boolean.valueOf(mo46019y().mo45979k()));
                C5015nb.m22916a(this.f52561v, true, "videoApi.setMode", "PLAYER");
                Object[] objArr = new Object[1];
                objArr[0] = Boolean.valueOf(mo46019y().mo45980l() || this.f54343c0);
                C5015nb.m22916a(this.f52561v, true, "videoApi.setCloseable", objArr);
                C5015nb.m22916a(this.f52561v, true, "videoApi.setSkippable", Boolean.valueOf(mo45994G()));
            }
        }
    }

    /* renamed from: C */
    public final void mo45990C() {
        FractionTrackingLink[] c = mo46019y().mo45976h().mo46057c();
        if (c != null) {
            for (FractionTrackingLink fractionTrackingLink : c) {
                List list = this.f54356p0.get(Integer.valueOf(fractionTrackingLink.mo46050e()));
                if (list == null) {
                    list = new ArrayList();
                    this.f54356p0.put(Integer.valueOf(fractionTrackingLink.mo46050e()), list);
                }
                list.add(fractionTrackingLink);
            }
        }
        AbsoluteTrackingLink[] a = mo46019y().mo45976h().mo46053a();
        if (a != null) {
            for (AbsoluteTrackingLink absoluteTrackingLink : a) {
                List list2 = this.f54357q0.get(Integer.valueOf(absoluteTrackingLink.mo46047e()));
                if (list2 == null) {
                    list2 = new ArrayList();
                    this.f54357q0.put(Integer.valueOf(absoluteTrackingLink.mo46047e()), list2);
                }
                list2.add(absoluteTrackingLink);
            }
        }
    }

    /* renamed from: D */
    public boolean mo45991D() {
        if (!this.f54345e0) {
            if (!mo45992E() || !this.f54335U) {
                return false;
            }
            return true;
        } else if (this.f54344d0 < AdsCommonMetaData.f22242h.mo20877G().mo21002i() || !mo45992E() || !this.f54335U) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: E */
    public boolean mo45992E() {
        VideoPlayerInterface videoPlayerInterface = this.f54325K;
        if (videoPlayerInterface != null) {
            if (((NativeVideoPlayer) videoPlayerInterface).f54421f != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public boolean mo45993F() {
        ProgressBar progressBar = this.f54329O;
        return progressBar != null && progressBar.isShown();
    }

    /* renamed from: G */
    public final boolean mo45994G() {
        return this.f52555E > 0 || mo46019y().mo45981m() || this.f54342b0;
    }

    /* renamed from: H */
    public boolean mo45995H() {
        AudioManager audioManager = (AudioManager) this.f52600b.getSystemService("audio");
        if (audioManager == null || (audioManager.getRingerMode() != 0 && audioManager.getRingerMode() != 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public boolean mo45996I() {
        return this.f54331Q == -1;
    }

    /* renamed from: J */
    public void mo45997J() {
        this.f52552B.mo45304b();
        mo46011a(mo46019y().mo45976h().mo46058d(), new VideoTrackingParams(this.f52614p, 0, this.f52555E, this.f54351k0), 0, AdSDKNotificationListener.IMPRESSION_EVENT);
        mo46011a(mo46019y().mo45976h().mo46056b(), new VideoTrackingParams(this.f52614p, 0, this.f52555E, this.f54351k0), 0, "creativeView");
        C12011k7 k7Var = this.f52558H;
        if (k7Var != null) {
            k7Var.mo45502b();
        }
    }

    /* renamed from: K */
    public final void mo45998K() {
        C5015nb.m22916a(this.f52561v, true, "videoApi.setSkipTimer", Long.valueOf(mo46014c(this.f54331Q + 50)));
    }

    /* renamed from: L */
    public void mo45999L() {
        VideoPlayerInterface videoPlayerInterface = this.f54325K;
        if (videoPlayerInterface != null) {
            try {
                boolean z = this.f54330P;
                MediaPlayer mediaPlayer = ((NativeVideoPlayer) videoPlayerInterface).f54421f;
                if (mediaPlayer != null) {
                    if (z) {
                        mediaPlayer.setVolume(0.0f, 0.0f);
                    } else {
                        mediaPlayer.setVolume(1.0f, 1.0f);
                    }
                }
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
        }
        Object[] objArr = new Object[1];
        objArr[0] = this.f54330P ? "OFF" : "ON";
        C5015nb.m22916a(this.f52561v, true, "videoApi.setSound", objArr);
    }

    /* renamed from: M */
    public void mo46000M() {
        if (this.f54325K != null) {
            boolean p = AdsCommonMetaData.f22242h.mo20877G().mo21009p();
            String c = mo46019y().mo45971c();
            if (c != null) {
                VideoPlayerInterface videoPlayerInterface = this.f54325K;
                if (videoPlayerInterface != null) {
                    ((NativeVideoPlayer) videoPlayerInterface).mo46041a(c);
                }
                if (p && c.endsWith(".temp")) {
                    this.f54345e0 = true;
                    this.f54348h0 = true;
                    this.f54344d0 = AdsCommonMetaData.f22242h.mo20877G().mo21002i();
                }
            } else if (p) {
                String i = mo46019y().mo45977i();
                C12237d dVar = C12237d.C12239b.f54399a;
                if (i != null && i.equals(dVar.f54398c)) {
                    dVar.f54396a = false;
                }
                VideoPlayerInterface videoPlayerInterface2 = this.f54325K;
                if (videoPlayerInterface2 != null) {
                    ((NativeVideoPlayer) videoPlayerInterface2).mo46041a(i);
                }
                this.f54345e0 = true;
                mo46002O();
            } else {
                mo46008a(VideoFinishedReason.SKIPPED);
            }
            if (this.f54351k0 == null) {
                this.f54351k0 = this.f54345e0 ? "2" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            }
        }
    }

    /* renamed from: N */
    public int mo46001N() {
        int i;
        VideoPlayerInterface videoPlayerInterface = this.f54325K;
        if (videoPlayerInterface == null) {
            i = 0;
        } else if (((NativeVideoPlayer) videoPlayerInterface).f54422g.getCurrentPosition() != ((NativeVideoPlayer) this.f54325K).f54422g.getDuration() || mo45996I()) {
            i = ((NativeVideoPlayer) this.f54325K).f54422g.getDuration() - ((NativeVideoPlayer) this.f54325K).f54422g.getCurrentPosition();
        } else {
            i = ((NativeVideoPlayer) this.f54325K).f54422g.getDuration();
        }
        int i2 = i / 1000;
        if (i2 > 0 && i % 1000 < 100) {
            i2--;
        }
        C5015nb.m22916a(this.f52561v, true, "videoApi.setVideoRemainingTimer", Integer.valueOf(i2));
        return i;
    }

    /* renamed from: O */
    public void mo46002O() {
        if (!mo45993F()) {
            this.f54355o0.postDelayed(new C12225c(), AdsCommonMetaData.f22242h.mo20877G().mo20999g());
        }
    }

    /* renamed from: P */
    public void mo46003P() {
        VideoPlayerInterface videoPlayerInterface = this.f54325K;
        if (videoPlayerInterface != null) {
            ((NativeVideoPlayer) videoPlayerInterface).f54422g.start();
            this.f52561v.setBackgroundColor(33554431);
            mo45096a((View) null);
        }
    }

    /* renamed from: Q */
    public void mo46004Q() {
        this.f54347g0 = true;
        VideoPlayerInterface videoPlayerInterface = this.f54325K;
        int i = 0;
        C5015nb.m22916a(this.f52561v, true, "videoApi.setVideoDuration", Integer.valueOf(videoPlayerInterface != null ? ((NativeVideoPlayer) videoPlayerInterface).f54422g.getDuration() / 1000 : 0));
        mo46001N();
        mo45998K();
        C5015nb.m22916a(this.f52561v, true, "videoApi.setVideoCurrentPosition", Integer.valueOf(this.f54331Q / 1000));
        if (mo45996I()) {
            VideoPlayerInterface videoPlayerInterface2 = this.f54325K;
            if (videoPlayerInterface2 != null) {
                ((NativeVideoPlayer) videoPlayerInterface2).f54422g.pause();
                return;
            }
            return;
        }
        VideoPlayerInterface videoPlayerInterface3 = this.f54325K;
        int duration = videoPlayerInterface3 != null ? ((NativeVideoPlayer) videoPlayerInterface3).f54422g.getDuration() : 0;
        Handler handler = new Handler();
        C12223a aVar = new C12223a(duration, handler);
        long currentTimeMillis = System.currentTimeMillis() - this.f54358r0;
        long j = 0;
        if (this.f54331Q == 0 && this.f52555E == 0 && currentTimeMillis < 500) {
            j = Math.max(200, 500 - currentTimeMillis);
        }
        handler.postDelayed(aVar, j);
        if (this.f54331Q == 0) {
            this.f54352l0.postDelayed(new C12224b(), 100);
        }
        VideoPlayerInterface videoPlayerInterface4 = this.f54325K;
        if (videoPlayerInterface4 != null) {
            i = ((NativeVideoPlayer) videoPlayerInterface4).f54422g.getDuration();
        }
        this.f54333S = i;
        for (Integer intValue : this.f54356p0.keySet()) {
            int intValue2 = intValue.intValue();
            mo46007a(mo46015d(intValue2), this.f54352l0, new C12078nc(this, intValue2));
        }
        for (Integer intValue3 : this.f54357q0.keySet()) {
            int intValue4 = intValue3.intValue();
            mo46007a(intValue4, this.f54352l0, new C12115oc(this, intValue4));
        }
        if (!this.f54345e0) {
            mo46007a(mo46015d(AdsCommonMetaData.f22242h.mo20877G().mo21004k()), this.f54354n0, new C12133pc(this));
        }
        this.f54353m0.post(new C12035lc(this));
        mo45998K();
        this.f54353m0.post(new C12060mc(this));
        this.f52601c.f54507b.setVisibility(4);
        mo45999L();
    }

    /* renamed from: R */
    public void mo46005R() {
        C11780a6 a6Var;
        this.f54355o0.removeCallbacksAndMessages((Object) null);
        if (mo45993F()) {
            this.f54329O.setVisibility(8);
            C12011k7 k7Var = this.f52558H;
            if (k7Var != null && (a6Var = k7Var.f53202c) != null) {
                C12000je.m52518a(a6Var.f52572a);
                C11973ie.f53134a.mo45463a(a6Var.f52572a.f53128e.mo20421c(), "bufferFinish", (JSONObject) null);
            }
        }
    }

    /* renamed from: S */
    public void mo46006S() {
        if (mo45993F()) {
            mo46005R();
        }
        mo46008a(VideoFinishedReason.SKIPPED);
        mo46011a(mo46019y().mo45976h().mo46070p(), new VideoTrackingParams(this.f52614p, mo46012b(this.f54332R), this.f52555E, this.f54351k0), this.f54332R, "skipped");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050 A[Catch:{ all -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo45095a(android.os.Bundle r4) {
        /*
            r3 = this;
            java.lang.String r0 = "currentPosition"
            super.mo45095a((android.os.Bundle) r4)
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x008b }
            r3.f54358r0 = r1     // Catch:{ all -> 0x008b }
            r1 = 100
            com.startapp.sdk.adsbase.AdsCommonMetaData r2 = com.startapp.sdk.adsbase.AdsCommonMetaData.f22242h     // Catch:{ all -> 0x008b }
            com.startapp.sdk.adsbase.VideoConfig r2 = r2.mo20877G()     // Catch:{ all -> 0x008b }
            int r2 = r2.mo21000h()     // Catch:{ all -> 0x008b }
            int r1 = r1 / r2
            r3.f54350j0 = r1     // Catch:{ all -> 0x008b }
            r3.mo46020z()     // Catch:{ all -> 0x008b }
            r3.mo45990C()     // Catch:{ all -> 0x008b }
            boolean r1 = r3.mo45995H()     // Catch:{ all -> 0x008b }
            if (r1 != 0) goto L_0x0045
            com.startapp.sdk.ads.video.VideoAdDetails r1 = r3.mo46019y()     // Catch:{ all -> 0x008b }
            boolean r1 = r1.mo45982n()     // Catch:{ all -> 0x008b }
            if (r1 != 0) goto L_0x0045
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.f22242h     // Catch:{ all -> 0x008b }
            com.startapp.sdk.adsbase.VideoConfig r1 = r1.mo20877G()     // Catch:{ all -> 0x008b }
            java.lang.String r1 = r1.mo21005l()     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "muted"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r1 = 0
            goto L_0x0046
        L_0x0045:
            r1 = 1
        L_0x0046:
            r3.f54330P = r1     // Catch:{ all -> 0x008b }
            if (r4 == 0) goto L_0x0095
            boolean r1 = r4.containsKey(r0)     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x0095
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x008b }
            r3.f54331Q = r0     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "latestPosition"
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x008b }
            r3.f54332R = r0     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "fractionProgressImpressionsSent"
            java.io.Serializable r0 = r4.getSerializable(r0)     // Catch:{ all -> 0x008b }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x008b }
            r3.f54339Y = r0     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "absoluteProgressImpressionsSent"
            java.io.Serializable r0 = r4.getSerializable(r0)     // Catch:{ all -> 0x008b }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x008b }
            r3.f54340Z = r0     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "isMuted"
            boolean r0 = r4.getBoolean(r0)     // Catch:{ all -> 0x008b }
            r3.f54330P = r0     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "shouldSetBg"
            boolean r0 = r4.getBoolean(r0)     // Catch:{ all -> 0x008b }
            r3.f54334T = r0     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "pauseNum"
            int r4 = r4.getInt(r0)     // Catch:{ all -> 0x008b }
            r3.f54341a0 = r4     // Catch:{ all -> 0x008b }
            goto L_0x0095
        L_0x008b:
            r4 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r4)
            r3.mo46018x()
            r3.mo45101b()
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.VideoMode.mo45095a(android.os.Bundle):void");
    }

    /* renamed from: b */
    public void mo45103b(WebView webView) {
        this.f52553C = false;
        webView.setOnTouchListener(new C11772a5.C11776d());
        C12437y.m53779a(webView, (Paint) null);
    }

    /* renamed from: c */
    public long mo46014c(int i) {
        if (this.f54342b0 || this.f52555E > 0) {
            return 0;
        }
        long g = mo46019y().mo45975g() - ((long) i);
        if (g <= 0) {
            return 0;
        }
        return (g / 1000) + 1;
    }

    /* renamed from: d */
    public int mo46015d(int i) {
        return (this.f54333S * i) / 100;
    }

    /* renamed from: e */
    public void mo45108e() {
        C11780a6 a6Var;
        if (!mo45996I() && !this.f52600b.isFinishing() && !this.f54343c0 && !this.f54342b0) {
            VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
            VideoPlayerInterface videoPlayerInterface = this.f54325K;
            if (videoPlayerInterface != null) {
                int currentPosition = ((NativeVideoPlayer) videoPlayerInterface).f54422g.getCurrentPosition();
                this.f54331Q = currentPosition;
                this.f54332R = currentPosition;
                ((NativeVideoPlayer) this.f54325K).f54422g.pause();
                C12011k7 k7Var = this.f52558H;
                if (!(k7Var == null || (a6Var = k7Var.f53202c) == null)) {
                    C12000je.m52518a(a6Var.f52572a);
                    C11973ie.f53134a.mo45463a(a6Var.f52572a.f53128e.mo20421c(), "pause", (JSONObject) null);
                }
            }
            mo46011a(mo46019y().mo45976h().mo46064j(), new VideoPausedTrackingParams(this.f52614p, mo46012b(this.f54332R), this.f52555E, this.f54341a0, pauseOrigin, this.f54351k0), this.f54332R, "paused");
        }
        VideoPlayerInterface videoPlayerInterface2 = this.f54325K;
        if (videoPlayerInterface2 != null) {
            NativeVideoPlayer nativeVideoPlayer = (NativeVideoPlayer) videoPlayerInterface2;
            if (nativeVideoPlayer.f54421f != null) {
                nativeVideoPlayer.f54421f = null;
            }
            C12237d.C12239b.f54399a.f54397b = null;
            this.f54325K = null;
        }
        this.f54352l0.removeCallbacksAndMessages((Object) null);
        this.f54353m0.removeCallbacksAndMessages((Object) null);
        this.f54354n0.removeCallbacksAndMessages((Object) null);
        mo46005R();
        this.f54334T = true;
        if (this.f54360t0) {
            this.f52600b.unregisterReceiver(this.f54361u0);
            this.f54360t0 = false;
        }
        super.mo45108e();
    }

    /* renamed from: f */
    public void mo45109f() {
        C11780a6 a6Var;
        super.mo45109f();
        this.f52600b.registerReceiver(this.f54361u0, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.f54360t0 = true;
        if (!this.f52600b.isFinishing()) {
            if (this.f54326L == null) {
                Context a = C5009h0.m22892a(this.f52600b);
                if (a == null) {
                    a = this.f52600b;
                }
                this.f54359s0 = SystemClock.uptimeMillis();
                this.f54328N = (RelativeLayout) this.f52600b.findViewById(1475346432);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                VideoView videoView = new VideoView(a);
                this.f54326L = videoView;
                videoView.setId(100);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(13);
                ProgressBar progressBar = new ProgressBar(a, (AttributeSet) null, 16843399);
                this.f54329O = progressBar;
                progressBar.setVisibility(4);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.addRule(14);
                layoutParams3.addRule(15);
                RelativeLayout relativeLayout = new RelativeLayout(a);
                this.f54327M = relativeLayout;
                relativeLayout.setId(1475346436);
                this.f52600b.setContentView(this.f54327M);
                this.f54327M.addView(this.f54326L, layoutParams2);
                this.f54327M.addView(this.f54328N, layoutParams);
                this.f54327M.addView(this.f54329O, layoutParams3);
                if (AdsConstants.f54496g.booleanValue()) {
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams4.addRule(12);
                    layoutParams4.addRule(14);
                    RelativeLayout relativeLayout2 = this.f54327M;
                    TextView textView = new TextView(a);
                    textView.setBackgroundColor(-16777216);
                    int i = C12437y.f55146a;
                    if (Build.VERSION.SDK_INT >= 11) {
                        textView.setAlpha(0.5f);
                    }
                    textView.setTextColor(-7829368);
                    textView.setSingleLine(false);
                    textView.setText("url=" + mo46019y().mo45977i());
                    relativeLayout2.addView(textView, layoutParams4);
                }
                this.f52601c.f54507b.setVisibility(4);
            }
            if (this.f54325K == null) {
                this.f54325K = new NativeVideoPlayer(this.f54326L);
            }
            this.f54336V = false;
            this.f54327M.setBackgroundColor(-16777216);
            mo46000M();
            if (mo45996I()) {
                this.f52601c.f54507b.setVisibility(0);
                this.f54326L.setVisibility(4);
            } else {
                int i2 = this.f54331Q;
                if (i2 != 0) {
                    ((NativeVideoPlayer) this.f54325K).f54422g.seekTo(i2);
                    VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
                    C12011k7 k7Var = this.f52558H;
                    if (!(k7Var == null || (a6Var = k7Var.f53202c) == null)) {
                        C12000je.m52518a(a6Var.f52572a);
                        C11973ie.f53134a.mo45463a(a6Var.f52572a.f53128e.mo20421c(), "resume", (JSONObject) null);
                    }
                    mo46011a(mo46019y().mo45976h().mo46068n(), new VideoPausedTrackingParams(this.f52614p, mo46012b(this.f54332R), this.f52555E, this.f54341a0, pauseOrigin, this.f54351k0), this.f54332R, "resumed");
                    this.f54341a0++;
                }
            }
            VideoPlayerInterface videoPlayerInterface = this.f54325K;
            C12254a aVar = (C12254a) videoPlayerInterface;
            aVar.f54440b = new C12350tc(this);
            aVar.f54442d = new C12244i(this);
            C12376uc ucVar = new C12376uc(this);
            aVar.f54441c = new C12397vc(this);
            videoPlayerInterface.getClass();
            VideoPlayerInterface videoPlayerInterface2 = this.f54325K;
            ((C12254a) videoPlayerInterface2).f54443e = ucVar;
            videoPlayerInterface2.getClass();
            VideoView videoView2 = this.f54326L;
            C12417wc wcVar = new C12417wc(this);
            int i3 = C12437y.f55146a;
            if (Build.VERSION.SDK_INT >= 11) {
                videoView2.addOnLayoutChangeListener(new C12419x(wcVar));
            }
        }
    }

    /* renamed from: h */
    public void mo45151h() {
        if (!this.f54338X) {
            C5116u5.m23368a((Context) this.f52600b).mo21244a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
        }
    }

    /* renamed from: i */
    public void mo45110i() {
        if (this.f54338X) {
            return;
        }
        if (mo45996I() || this.f54326L == null) {
            mo46011a(mo46019y().mo45976h().mo46066l(), new VideoTrackingParams(this.f52614p, mo46012b(this.f54332R), this.f52555E, this.f54351k0), this.f54332R, "postrollClosed");
            super.mo45110i();
            return;
        }
        VideoPlayerInterface videoPlayerInterface = this.f54325K;
        int currentPosition = videoPlayerInterface != null ? ((NativeVideoPlayer) videoPlayerInterface).f54422g.getCurrentPosition() : 0;
        mo46011a(mo46019y().mo45976h().mo46063i(), new VideoTrackingParams(this.f52614p, mo46012b(currentPosition), this.f52555E, this.f54351k0), currentPosition, "closed");
    }

    /* renamed from: k */
    public long mo45112k() {
        return (SystemClock.uptimeMillis() - this.f54359s0) / 1000;
    }

    /* renamed from: l */
    public C11938h5 mo45113l() {
        Activity activity = this.f52600b;
        Runnable runnable = this.f52559I;
        return new C11998jc(activity, runnable, runnable, new C12186sc(this), new C12169rc(this), new C12150qc(this), new TrackingParams(this.f52614p), mo45148a(0));
    }

    /* renamed from: m */
    public long mo45114m() {
        Long l = this.f52615q;
        if (l != null) {
            return TimeUnit.SECONDS.toMillis(l.longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.f22407k.mo21204p());
    }

    /* renamed from: n */
    public TrackingParams mo45115n() {
        return new VideoTrackingParams(this.f52614p, 0, this.f52555E, this.f54351k0);
    }

    public void onClick(View view) {
        this.f52559I.run();
    }

    /* renamed from: p */
    public boolean mo45118p() {
        return this.f52610l.getType() == C5041Ad.AdType.REWARDED_VIDEO;
    }

    /* renamed from: q */
    public void mo45119q() {
    }

    /* renamed from: r */
    public void mo45120r() {
        this.f54335U = true;
        if (this.f54336V && mo45992E()) {
            mo45989B();
        } else if (mo45996I()) {
            mo46013b((View) this.f52561v);
        }
        if (mo45991D()) {
            mo46004Q();
        }
        if (mo45996I()) {
            mo45988A();
        }
    }

    /* renamed from: s */
    public boolean mo45121s() {
        return false;
    }

    /* renamed from: t */
    public void mo45122t() {
        mo46011a(mo46019y().mo45976h().mo46069o(), new VideoTrackingParams(this.f52614p, AdsCommonMetaData.f22242h.mo20877G().mo21004k(), this.f52555E, this.f54351k0), mo46015d(AdsCommonMetaData.f22242h.mo20877G().mo21004k()), "rewarded");
    }

    /* renamed from: x */
    public final void mo46018x() {
        Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
        intent.putExtra("showFailedReason", NotDisplayedReason.VIDEO_ERROR);
        C5116u5.m23368a((Context) this.f52600b).mo21244a(intent);
        this.f54338X = true;
    }

    /* renamed from: y */
    public VideoAdDetails mo46019y() {
        return ((VideoEnabledAd) this.f52610l).mo45987w();
    }

    /* renamed from: z */
    public final void mo46020z() {
        if (!this.f52606h.equals("back")) {
            return;
        }
        if (AdsCommonMetaData.f22242h.mo20877G().mo20992a().equals(VideoConfig.BackMode.BOTH)) {
            this.f54342b0 = true;
            this.f54343c0 = true;
        } else if (AdsCommonMetaData.f22242h.mo20877G().mo20992a().equals(VideoConfig.BackMode.SKIP)) {
            this.f54342b0 = true;
            this.f54343c0 = false;
        } else if (AdsCommonMetaData.f22242h.mo20877G().mo20992a().equals(VideoConfig.BackMode.CLOSE)) {
            this.f54342b0 = false;
            this.f54343c0 = true;
        } else if (AdsCommonMetaData.f22242h.mo20877G().mo20992a().equals(VideoConfig.BackMode.DISABLED)) {
            this.f54342b0 = false;
            this.f54343c0 = false;
        } else {
            this.f54342b0 = false;
            this.f54343c0 = false;
        }
    }

    /* renamed from: b */
    public final void mo46013b(View view) {
        C5015nb.m22916a(this.f52561v, true, "videoApi.setVideoFrame", Integer.valueOf(C11970ib.m52473b(this.f52600b, view.getLeft())), Integer.valueOf(C11970ib.m52473b(this.f52600b, view.getTop())), Integer.valueOf(C11970ib.m52473b(this.f52600b, view.getWidth())), Integer.valueOf(C11970ib.m52473b(this.f52600b, view.getHeight())));
    }

    /* renamed from: c */
    public boolean mo45106c() {
        if (mo45996I()) {
            mo45110i();
            return false;
        }
        VideoPlayerInterface videoPlayerInterface = this.f54325K;
        if (videoPlayerInterface == null) {
            return false;
        }
        long c = mo46014c(((NativeVideoPlayer) videoPlayerInterface).f54422g.getCurrentPosition() + 50);
        if (mo45994G() && c == 0) {
            mo46006S();
            return true;
        } else if (!mo46019y().mo45980l() && !this.f54343c0) {
            return true;
        } else {
            mo45110i();
            return false;
        }
    }

    /* renamed from: b */
    public void mo45102b(Bundle bundle) {
        super.mo45102b(bundle);
        bundle.putInt("currentPosition", this.f54331Q);
        bundle.putInt("latestPosition", this.f54332R);
        bundle.putSerializable("fractionProgressImpressionsSent", this.f54339Y);
        bundle.putSerializable("absoluteProgressImpressionsSent", this.f54340Z);
        bundle.putBoolean("isMuted", this.f54330P);
        bundle.putBoolean("shouldSetBg", this.f54334T);
        bundle.putInt("pauseNum", this.f54341a0);
    }

    /* renamed from: a */
    public void mo45096a(View view) {
        VideoAdDetails y;
        C12396vb vbVar;
        if (MetaData.f22407k.mo21175Q() && (y = mo46019y()) != null) {
            C12011k7 k7Var = new C12011k7(this.f52561v.getContext(), y.mo45966a(), true);
            this.f52558H = k7Var;
            if (k7Var.mo45503c()) {
                try {
                    AdInformationView adInformationView = this.f52601c.f54507b;
                    if (adInformationView != null) {
                        this.f52558H.mo45501a(adInformationView, FriendlyObstructionPurpose.OTHER, (String) null);
                    }
                    if (view != null) {
                        this.f52558H.mo45501a(view, FriendlyObstructionPurpose.CLOSE_AD, (String) null);
                    }
                    this.f52558H.mo45501a(this.f52561v, FriendlyObstructionPurpose.VIDEO_CONTROLS, (String) null);
                    this.f52558H.mo45501a(this.f54328N, FriendlyObstructionPurpose.OTHER, (String) null);
                } catch (RuntimeException unused) {
                }
                this.f52558H.mo45500a(this.f54326L);
                this.f52558H.mo45505e();
                C12011k7 k7Var2 = this.f52558H;
                boolean G = mo45994G();
                long g = mo46019y().mo45981m() ? mo46019y().mo45975g() : 0;
                if (k7Var2.f53201b != null && k7Var2.f53204e.compareAndSet(false, true)) {
                    if (G) {
                        vbVar = new C12396vb(true, Float.valueOf((float) g), true, Position.STANDALONE);
                    } else {
                        vbVar = new C12396vb(false, (Float) null, true, Position.STANDALONE);
                    }
                    C11974j jVar = k7Var2.f53201b;
                    jVar.getClass();
                    C12000je.m52518a(jVar.f53135a);
                    C12000je.m52522c(jVar.f53135a);
                    C11972id idVar = jVar.f53135a;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("skippable", vbVar.f54931a);
                        if (vbVar.f54931a) {
                            jSONObject.put("skipOffset", vbVar.f54932b);
                        }
                        jSONObject.put("autoPlay", vbVar.f54933c);
                        jSONObject.put("position", vbVar.f54934d);
                    } catch (JSONException e) {
                        Log.e("OMIDLIB", "VastProperties: JSON error", e);
                    }
                    if (!idVar.f53133j) {
                        C11973ie.f53134a.mo45464a(idVar.f53128e.mo20421c(), "publishLoadedEvent", jSONObject);
                        idVar.f53133j = true;
                        return;
                    }
                    throw new IllegalStateException("Loaded event can only be sent once");
                }
            }
        }
    }

    /* renamed from: b */
    public void mo45101b() {
        super.mo45101b();
        if (this.f54348h0) {
            String c = mo46019y().mo45971c();
            if (c != null && c.endsWith(".temp")) {
                new File(c).delete();
            }
        }
    }

    /* renamed from: b */
    public final int mo46012b(int i) {
        int i2 = this.f54333S;
        if (i2 > 0) {
            return (i * 100) / i2;
        }
        return 0;
    }

    /* renamed from: e */
    public void mo46016e(int i) {
        List list;
        if (this.f54340Z.get(Integer.valueOf(i)) == null) {
            if (this.f54357q0.containsKey(Integer.valueOf(i)) && (list = this.f54357q0.get(Integer.valueOf(i))) != null) {
                mo46011a((VideoTrackingLink[]) list.toArray(new AbsoluteTrackingLink[0]), new VideoProgressTrackingParams(this.f52614p, i, this.f52555E, this.f54351k0), i, "absolute");
            }
            this.f54340Z.put(Integer.valueOf(i), Boolean.TRUE);
        }
    }

    /* renamed from: a */
    public void mo46008a(VideoFinishedReason videoFinishedReason) {
        C12011k7 k7Var;
        C11780a6 a6Var;
        C12011k7 k7Var2;
        C11780a6 a6Var2;
        if (!(videoFinishedReason != VideoFinishedReason.COMPLETE || (k7Var2 = this.f52558H) == null || (a6Var2 = k7Var2.f53202c) == null)) {
            C12000je.m52518a(a6Var2.f52572a);
            C11973ie.f53134a.mo45463a(a6Var2.f52572a.f53128e.mo20421c(), "complete", (JSONObject) null);
        }
        VideoFinishedReason videoFinishedReason2 = VideoFinishedReason.SKIPPED;
        if (!(videoFinishedReason != videoFinishedReason2 || (k7Var = this.f52558H) == null || (a6Var = k7Var.f53202c) == null)) {
            C12000je.m52518a(a6Var.f52572a);
            C11973ie.f53134a.mo45463a(a6Var.f52572a.f53128e.mo20421c(), "skipped", (JSONObject) null);
        }
        if (videoFinishedReason == videoFinishedReason2 || videoFinishedReason == VideoFinishedReason.CLICKED) {
            this.f54352l0.removeCallbacksAndMessages((Object) null);
            this.f54354n0.removeCallbacksAndMessages((Object) null);
            VideoPlayerInterface videoPlayerInterface = this.f54325K;
            if (videoPlayerInterface != null) {
                this.f54332R = ((NativeVideoPlayer) videoPlayerInterface).f54422g.getCurrentPosition();
                ((NativeVideoPlayer) this.f54325K).f54422g.pause();
            }
        } else {
            this.f54332R = this.f54333S;
            mo45123u();
        }
        this.f54353m0.removeCallbacksAndMessages((Object) null);
        this.f54339Y.clear();
        this.f54340Z.clear();
        if (videoFinishedReason == VideoFinishedReason.CLICKED) {
            this.f54331Q = -1;
            return;
        }
        if (mo46019y().mo45978j()) {
            mo45988A();
            this.f52601c.f54507b.setVisibility(0);
        } else {
            mo45101b();
        }
        this.f54331Q = -1;
        if (mo46019y().mo45978j()) {
            mo46011a(mo46019y().mo45976h().mo46067m(), new VideoTrackingParams(this.f52614p, mo46012b(this.f54332R), this.f52555E, this.f54351k0), this.f54332R, "postrollImression");
        }
    }

    /* renamed from: f */
    public void mo46017f(int i) {
        C11780a6 a6Var;
        if (this.f54339Y.get(Integer.valueOf(i)) == null) {
            if (this.f54356p0.containsKey(Integer.valueOf(i))) {
                List list = this.f54356p0.get(Integer.valueOf(i));
                if (list != null) {
                    mo46011a((VideoTrackingLink[]) list.toArray(new FractionTrackingLink[0]), new VideoProgressTrackingParams(this.f52614p, i, this.f52555E, this.f54351k0), (this.f54333S * i) / 100, "fraction");
                }
                C12011k7 k7Var = this.f52558H;
                if (k7Var != null) {
                    if (i == 25) {
                        C11780a6 a6Var2 = k7Var.f53202c;
                        if (a6Var2 != null) {
                            C12000je.m52518a(a6Var2.f52572a);
                            C11973ie.f53134a.mo45463a(a6Var2.f52572a.f53128e.mo20421c(), "firstQuartile", (JSONObject) null);
                        }
                    } else if (i == 50) {
                        C11780a6 a6Var3 = k7Var.f53202c;
                        if (a6Var3 != null) {
                            C12000je.m52518a(a6Var3.f52572a);
                            C11973ie.f53134a.mo45463a(a6Var3.f52572a.f53128e.mo20421c(), "midpoint", (JSONObject) null);
                        }
                    } else if (i == 75 && (a6Var = k7Var.f53202c) != null) {
                        C12000je.m52518a(a6Var.f52572a);
                        C11973ie.f53134a.mo45463a(a6Var.f52572a.f53128e.mo20421c(), "thirdQuartile", (JSONObject) null);
                    }
                }
            }
            this.f54339Y.put(Integer.valueOf(i), Boolean.TRUE);
        }
    }

    /* renamed from: a */
    public final void mo46007a(int i, Handler handler, Runnable runnable) {
        int i2 = this.f54331Q;
        if (i2 < i) {
            handler.postDelayed(runnable, (long) (i - i2));
        }
    }

    /* renamed from: a */
    public void mo46009a(VideoPlayerInterface.C12253e eVar) {
        VASTErrorCodes vASTErrorCodes;
        int i;
        VideoPlayerInterface videoPlayerInterface;
        C5004d4 d4Var = new C5004d4(C11882e4.f52886e);
        StringBuilder a = C12458z0.m53804a("Video player error: ");
        a.append(eVar.f54436a);
        d4Var.f22126d = a.toString();
        d4Var.f22127e = eVar.f54437b;
        d4Var.f22129g = mo45145a();
        d4Var.mo20661a();
        int ordinal = eVar.f54436a.ordinal();
        boolean z = true;
        if (ordinal == 1) {
            vASTErrorCodes = VASTErrorCodes.GeneralLinearError;
        } else if (ordinal == 2) {
            vASTErrorCodes = VASTErrorCodes.TimeoutMediaFileURI;
        } else if (ordinal != 3) {
            vASTErrorCodes = VASTErrorCodes.UndefinedError;
        } else {
            vASTErrorCodes = VASTErrorCodes.MediaFileDisplayError;
        }
        C11971ic icVar = new C11971ic(mo46019y().mo45976h().mo46059e(), new VideoTrackingParams(this.f52614p, mo46012b(this.f54332R), this.f52555E, this.f54351k0), mo46019y().mo45977i(), this.f54332R);
        icVar.f53122f = vASTErrorCodes;
        icVar.f53121e = "error";
        VideoUtil.m53052a((Context) this.f52600b, icVar.mo45456a());
        if (!this.f54345e0 || (videoPlayerInterface = this.f54325K) == null) {
            i = this.f54331Q;
        } else {
            i = ((NativeVideoPlayer) videoPlayerInterface).f54422g.getCurrentPosition();
        }
        if (i == 0) {
            C5055a.m23151a((Context) this.f52600b, this.f52607i, this.f52614p, this.f52555E, "VIDEO_ERROR", (JSONObject) null);
            if (!this.f54345e0) {
                VideoUtil.m53053b(this.f52600b);
            } else if (!eVar.f54436a.equals(VideoPlayerInterface.VideoPlayerErrorType.BUFFERING_TIMEOUT)) {
                VideoUtil.m53053b(this.f52600b);
            }
        }
        if (this.f52610l.getType() != C5041Ad.AdType.REWARDED_VIDEO) {
            z = false;
        }
        if ((!z || this.f52554D) && mo46019y().mo45978j()) {
            mo46008a(VideoFinishedReason.SKIPPED);
            return;
        }
        mo46018x();
        mo45101b();
    }

    /* renamed from: a */
    public boolean mo45100a(String str, boolean z) {
        String str2;
        ActionTrackingLink[] actionTrackingLinkArr;
        boolean I = mo45996I();
        if (I) {
            str2 = mo46019y().mo45972d();
        } else {
            str2 = mo46019y().mo45970b();
        }
        if (!TextUtils.isEmpty(str2)) {
            z = true;
            str = str2;
        }
        if (!I) {
            mo46008a(VideoFinishedReason.CLICKED);
        }
        if (I) {
            actionTrackingLinkArr = mo46019y().mo45976h().mo46065k();
        } else {
            actionTrackingLinkArr = mo46019y().mo45976h().mo46062h();
        }
        mo46011a(actionTrackingLinkArr, new VideoClickedTrackingParams(this.f52614p, mo46012b(this.f54332R), this.f52555E, I, this.f54351k0), this.f54332R, "clicked");
        C12011k7 k7Var = this.f52558H;
        if (k7Var != null) {
            InteractionType interactionType = InteractionType.CLICK;
            C11780a6 a6Var = k7Var.f53202c;
            if (a6Var != null) {
                C12000je.m52518a(a6Var.f52572a);
                JSONObject jSONObject = new JSONObject();
                C12377ud.m53546a(jSONObject, "interactionType", interactionType);
                C11973ie.f53134a.mo45463a(a6Var.f52572a.f53128e.mo20421c(), "adUserInteraction", jSONObject);
            }
        }
        return super.mo45100a(str, z);
    }

    /* renamed from: a */
    public void mo46010a(boolean z) {
        ActionTrackingLink[] actionTrackingLinkArr;
        if (this.f54325K != null) {
            if (z) {
                actionTrackingLinkArr = mo46019y().mo45976h().mo46060f();
            } else {
                actionTrackingLinkArr = mo46019y().mo45976h().mo46061g();
            }
            mo46011a(actionTrackingLinkArr, new VideoTrackingParams(this.f52614p, mo46012b(((NativeVideoPlayer) this.f54325K).f54422g.getCurrentPosition()), this.f52555E, this.f54351k0), ((NativeVideoPlayer) this.f54325K).f54422g.getCurrentPosition(), "sound");
            C12011k7 k7Var = this.f52558H;
            if (k7Var != null) {
                float f = z ? 0.0f : 1.0f;
                C11780a6 a6Var = k7Var.f53202c;
                if (a6Var != null) {
                    a6Var.mo45134a(f);
                    C12000je.m52518a(a6Var.f52572a);
                    JSONObject jSONObject = new JSONObject();
                    C12377ud.m53546a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
                    C12377ud.m53546a(jSONObject, "deviceVolume", Float.valueOf(C12117oe.m52725a().f53985a));
                    C11973ie.f53134a.mo45463a(a6Var.f52572a.f53128e.mo20421c(), "volumeChange", jSONObject);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo46011a(VideoTrackingLink[] videoTrackingLinkArr, VideoTrackingParams videoTrackingParams, int i, String str) {
        C11971ic icVar = new C11971ic(videoTrackingLinkArr, videoTrackingParams, mo46019y().mo45977i(), i);
        icVar.f53121e = str;
        VideoUtil.m53052a((Context) this.f52600b, icVar.mo45456a());
    }
}
