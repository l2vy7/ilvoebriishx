package british.p015x;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.mediarouter.app.MediaRouteButton;
import british.p015x.C1692config;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyReward;
import com.adcolony.sdk.AdColonyRewardListener;
import com.adcolony.sdk.AdColonyZone;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.core.AppnextAdCreativeType;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnVideoEnded;
import com.facebook.ads.AdView;
import com.facebook.ads.C3371Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.exoplayer2.C6540C;
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
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.p041ui.PlayerControlView;
import com.google.android.exoplayer2.p041ui.PlayerView;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.C7020a;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.cast.framework.media.C4580e;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.VideoListener;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p115m4.C10739a;
import p115m4.C10775p;
import p115m4.C10777q;
import p115m4.C10779r;
import p115m4.C5758b;
import p115m4.C5759d;
import p273b9.C11188h;
import p313i9.C12788b;
import p313i9.C12789c;
import p318l8.C12831e;
import p338x8.C12957d;
import p338x8.C12960g;
import p340y8.C12982f;

/* renamed from: british.x.t_video_exoplayer */
public class t_video_exoplayer extends FragmentActivity_ext_class implements C1592a, View.OnKeyListener, View.OnClickListener, SharedPreferences.OnSharedPreferenceChangeListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public String f10079A0;

    /* renamed from: B */
    C1692config f10080B;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public String f10081B0;

    /* renamed from: C */
    Bundle f10082C;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public String f10083C0;

    /* renamed from: D */
    C1603c f10084D;

    /* renamed from: D0 */
    boolean f10085D0 = false;

    /* renamed from: E */
    boolean f10086E = false;

    /* renamed from: E0 */
    int f10087E0;

    /* renamed from: F */
    String f10088F;

    /* renamed from: F0 */
    int f10089F0;

    /* renamed from: G */
    ListView f10090G;

    /* renamed from: G0 */
    int f10091G0;

    /* renamed from: H */
    boolean f10092H = false;

    /* renamed from: H0 */
    int f10093H0;

    /* renamed from: I */
    boolean f10094I = false;

    /* renamed from: I0 */
    int f10095I0;

    /* renamed from: J */
    SimpleExoPlayer f10096J;

    /* renamed from: J0 */
    int f10097J0;

    /* renamed from: K */
    PlayerView f10098K;

    /* renamed from: K0 */
    int f10099K0;

    /* renamed from: L */
    ImaAdsLoader f10100L;

    /* renamed from: L0 */
    LinearLayout f10101L0;

    /* renamed from: M */
    int f10102M;

    /* renamed from: M0 */
    ProgressBar f10103M0;

    /* renamed from: N */
    Boolean f10104N = Boolean.FALSE;

    /* renamed from: N0 */
    String f10105N0;

    /* renamed from: O */
    FrameLayout f10106O;

    /* renamed from: O0 */
    String f10107O0;

    /* renamed from: P */
    int f10108P = -1;

    /* renamed from: P0 */
    HashMap<String, Bitmap> f10109P0;

    /* renamed from: Q */
    Uri f10110Q;

    /* renamed from: Q0 */
    HashMap<String, String> f10111Q0;

    /* renamed from: R */
    public boolean f10112R = false;

    /* renamed from: R0 */
    HashMap<String, String> f10113R0;

    /* renamed from: S */
    public boolean f10114S = false;

    /* renamed from: S0 */
    Bitmap f10115S0;

    /* renamed from: T */
    public String f10116T = "";

    /* renamed from: T0 */
    C2540v f10117T0;

    /* renamed from: U */
    public String f10118U = "";

    /* renamed from: U0 */
    C2541w f10119U0;

    /* renamed from: V */
    SharedPreferences f10120V;

    /* renamed from: V0 */
    File f10121V0;

    /* renamed from: W */
    boolean f10122W;

    /* renamed from: W0 */
    private int f10123W0;

    /* renamed from: X */
    boolean f10124X;

    /* renamed from: X0 */
    private int f10125X0;

    /* renamed from: Y */
    boolean f10126Y;

    /* renamed from: Y0 */
    private int f10127Y0;

    /* renamed from: Z */
    boolean f10128Z;

    /* renamed from: Z0 */
    List<String> f10129Z0 = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: a1 */
    public C5759d f10130a1;
    /* access modifiers changed from: private */

    /* renamed from: b1 */
    public C10777q f10131b1;

    /* renamed from: c1 */
    private final C10779r f10132c1 = new C2533s();

    /* renamed from: l0 */
    boolean f10133l0;

    /* renamed from: m0 */
    boolean f10134m0;

    /* renamed from: n0 */
    boolean f10135n0;

    /* renamed from: o0 */
    boolean f10136o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public long f10137p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public int f10138q0;

    /* renamed from: r0 */
    private int f10139r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public int f10140s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public int f10141t0;

    /* renamed from: u0 */
    private int f10142u0;

    /* renamed from: v0 */
    private int f10143v0;

    /* renamed from: w0 */
    private int f10144w0;

    /* renamed from: x0 */
    private int f10145x0;

    /* renamed from: y0 */
    private int f10146y0;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public int f10147z0;

    /* renamed from: british.x.t_video_exoplayer$a */
    class C2511a implements View.OnClickListener {
        C2511a() {
        }

        public void onClick(View view) {
            C1603c cVar;
            t_video_exoplayer t_video_exoplayer = t_video_exoplayer.this;
            if (!t_video_exoplayer.f10136o0) {
                Intent intent = new Intent(t_video_exoplayer.this, chat_perfil.class);
                t_video_exoplayer t_video_exoplayer2 = t_video_exoplayer.this;
                intent.putExtra("idsecc", t_video_exoplayer2.f10080B.f7231O1[t_video_exoplayer2.f10102M].f7964y);
                intent.putExtra("desde_video", true);
                boolean z = t_video_exoplayer.this.f6671t;
                if (z) {
                    intent.putExtra("es_root", z);
                }
                t_video_exoplayer t_video_exoplayer3 = t_video_exoplayer.this;
                t_video_exoplayer3.f6671t = false;
                t_video_exoplayer3.f6669r = true;
                t_video_exoplayer3.startActivityForResult(intent, 0);
            } else if (t_video_exoplayer.findViewById(R.id.sv_chat).getVisibility() == 0) {
                t_video_exoplayer.this.m9023W();
            } else {
                t_video_exoplayer.this.f10098K.setControllerAutoShow(false);
                t_video_exoplayer.this.f10098K.hideController();
                t_video_exoplayer.this.findViewById(R.id.sv_chat).setVisibility(0);
                t_video_exoplayer t_video_exoplayer4 = t_video_exoplayer.this;
                if (!t_video_exoplayer4.f10080B.f7279W1 && (cVar = t_video_exoplayer4.f10084D) != null && cVar.f6886a != null) {
                    t_video_exoplayer4.m9030f0();
                }
            }
        }
    }

    /* renamed from: british.x.t_video_exoplayer$b */
    class C2512b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ SharedPreferences f10149b;

        /* renamed from: british.x.t_video_exoplayer$b$a */
        class C2513a implements View.OnClickListener {
            C2513a() {
            }

            public void onClick(View view) {
                t_video_exoplayer t_video_exoplayer = t_video_exoplayer.this;
                t_video_exoplayer.f10080B.mo7489T(t_video_exoplayer, (ImageView) view, t_video_exoplayer.f6668q);
            }
        }

        /* renamed from: british.x.t_video_exoplayer$b$b */
        class C2514b implements Runnable {
            C2514b() {
            }

            public void run() {
                ((ScrollView) t_video_exoplayer.this.findViewById(R.id.sv_chat)).fullScroll(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            }
        }

        C2512b(SharedPreferences sharedPreferences) {
            this.f10149b = sharedPreferences;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:234:0x079e, code lost:
            if (r0 == 4) goto L_0x0811;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x07bb, code lost:
            if (r0 == 4) goto L_0x07ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:254:0x07eb, code lost:
            if (r0 == 4) goto L_0x07ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:255:0x07ed, code lost:
            r5 = british.p015x.R.drawable.bubble4_flip;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:265:0x080f, code lost:
            if (r0 == 4) goto L_0x0811;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:266:0x0811, code lost:
            r5 = british.p015x.R.drawable.bubble4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0032, code lost:
            if (r2.equals(british.p015x.t_video_exoplayer.m9008H(r1.f10150c) + "") == false) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x004e, code lost:
            if (r1.f10149b.getString("f2_id", "").equals(r1.f10149b.getString("f2_idusu_prev", "")) != false) goto L_0x0050;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0050, code lost:
            r0 = java.lang.Boolean.TRUE;
         */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x0540  */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x0565  */
        /* JADX WARNING: Removed duplicated region for block: B:151:0x0577  */
        /* JADX WARNING: Removed duplicated region for block: B:195:0x0686  */
        /* JADX WARNING: Removed duplicated region for block: B:196:0x0695  */
        /* JADX WARNING: Removed duplicated region for block: B:200:0x06c4  */
        /* JADX WARNING: Removed duplicated region for block: B:219:0x0744  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00b2  */
        /* JADX WARNING: Removed duplicated region for block: B:270:0x0839  */
        /* JADX WARNING: Removed duplicated region for block: B:277:0x0867  */
        /* JADX WARNING: Removed duplicated region for block: B:285:0x087d  */
        /* JADX WARNING: Removed duplicated region for block: B:299:0x08d8  */
        /* JADX WARNING: Removed duplicated region for block: B:303:0x08f4  */
        /* JADX WARNING: Removed duplicated region for block: B:308:0x0923  */
        /* JADX WARNING: Removed duplicated region for block: B:309:0x092b  */
        /* JADX WARNING: Removed duplicated region for block: B:314:0x0959  */
        /* JADX WARNING: Removed duplicated region for block: B:315:0x0968  */
        /* JADX WARNING: Removed duplicated region for block: B:320:0x099c  */
        /* JADX WARNING: Removed duplicated region for block: B:322:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0100  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x013f  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x01df  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x01e6  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x01f1  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x029c  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x02cd  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x02fc  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r23 = this;
                r1 = r23
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                android.content.SharedPreferences r2 = r1.f10149b
                java.lang.String r3 = "f2_ultimas"
                r4 = 0
                boolean r2 = r2.getBoolean(r3, r4)
                java.lang.String r5 = "f2_id"
                java.lang.String r6 = ""
                if (r2 != 0) goto L_0x0034
                android.content.SharedPreferences r2 = r1.f10149b
                java.lang.String r2 = r2.getString(r5, r6)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                british.x.t_video_exoplayer r8 = british.p015x.t_video_exoplayer.this
                java.lang.String r8 = r8.f10079A0
                r7.append(r8)
                r7.append(r6)
                java.lang.String r7 = r7.toString()
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x0050
            L_0x0034:
                android.content.SharedPreferences r2 = r1.f10149b
                boolean r2 = r2.getBoolean(r3, r4)
                if (r2 == 0) goto L_0x0052
                android.content.SharedPreferences r2 = r1.f10149b
                java.lang.String r2 = r2.getString(r5, r6)
                android.content.SharedPreferences r7 = r1.f10149b
                java.lang.String r8 = "f2_idusu_prev"
                java.lang.String r7 = r7.getString(r8, r6)
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x0052
            L_0x0050:
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
            L_0x0052:
                android.content.SharedPreferences r2 = r1.f10149b
                boolean r2 = r2.getBoolean(r3, r4)
                if (r2 != 0) goto L_0x0065
                british.x.t_video_exoplayer r2 = british.p015x.t_video_exoplayer.this
                android.content.SharedPreferences r7 = r1.f10149b
                java.lang.String r7 = r7.getString(r5, r6)
                r2.f10079A0 = r7
            L_0x0065:
                android.content.SharedPreferences r2 = r1.f10149b
                java.lang.String r2 = r2.getString(r5, r6)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                british.x.t_video_exoplayer r8 = british.p015x.t_video_exoplayer.this
                long r8 = r8.f10137p0
                r7.append(r8)
                r7.append(r6)
                java.lang.String r7 = r7.toString()
                boolean r2 = r2.equals(r7)
                r7 = 1
                if (r2 == 0) goto L_0x00a3
                android.content.SharedPreferences r2 = r1.f10149b
                boolean r2 = r2.getBoolean(r3, r4)
                if (r2 == 0) goto L_0x009a
                android.content.SharedPreferences r2 = r1.f10149b
                java.lang.String r8 = "f2_mateixusu_hastafinal"
                boolean r2 = r2.getBoolean(r8, r4)
                if (r2 == 0) goto L_0x00a1
                goto L_0x00a0
            L_0x009a:
                british.x.t_video_exoplayer r2 = british.p015x.t_video_exoplayer.this
                boolean r2 = r2.f10085D0
                if (r2 != 0) goto L_0x00a1
            L_0x00a0:
                goto L_0x00a7
            L_0x00a1:
                r2 = 1
                goto L_0x00a8
            L_0x00a3:
                british.x.t_video_exoplayer r2 = british.p015x.t_video_exoplayer.this
                r2.f10085D0 = r7
            L_0x00a7:
                r2 = 0
            L_0x00a8:
                android.content.SharedPreferences r8 = r1.f10149b
                boolean r8 = r8.getBoolean(r3, r4)
                java.lang.String r9 = "f2_fcrea"
                if (r8 == 0) goto L_0x00d9
                android.content.SharedPreferences r8 = r1.f10149b
                java.lang.String r8 = r8.getString(r9, r6)
                boolean r10 = r8.equals(r6)
                if (r10 != 0) goto L_0x00d9
                r10 = 6
                java.lang.String r8 = r8.substring(r4, r10)
                british.x.t_video_exoplayer r10 = british.p015x.t_video_exoplayer.this
                java.lang.String r10 = r10.f10081B0
                boolean r10 = r8.equals(r10)
                if (r10 != 0) goto L_0x00d9
                british.x.t_video_exoplayer r10 = british.p015x.t_video_exoplayer.this
                r10.mo9107e0()
                british.x.t_video_exoplayer r10 = british.p015x.t_video_exoplayer.this
                r10.f10081B0 = r8
            L_0x00d9:
                british.x.t_video_exoplayer r8 = british.p015x.t_video_exoplayer.this
                java.lang.String r10 = "layout_inflater"
                java.lang.Object r8 = r8.getSystemService(r10)
                android.view.LayoutInflater r8 = (android.view.LayoutInflater) r8
                r10 = 2131558520(0x7f0d0078, float:1.8742358E38)
                r11 = 0
                android.view.View r8 = r8.inflate(r10, r11)
                android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
                boolean r10 = r0.booleanValue()
                r12 = 2131362327(0x7f0a0217, float:1.8344431E38)
                r13 = 2131363190(0x7f0a0576, float:1.8346182E38)
                r14 = 2131362233(0x7f0a01b9, float:1.834424E38)
                r15 = 2131362505(0x7f0a02c9, float:1.8344792E38)
                r11 = 4
                if (r10 == 0) goto L_0x013f
                android.view.View r10 = r8.findViewById(r14)
                r10.setVisibility(r11)
                android.view.View r10 = r8.findViewById(r13)
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                r10.height = r7
                android.view.View r10 = r8.findViewById(r12)
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                r10.height = r7
                android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
                r13 = -2
                r11 = -2
                r10.<init>(r13, r11)
                british.x.t_video_exoplayer r11 = british.p015x.t_video_exoplayer.this
                int r11 = r11.f10095I0
                r10.setMargins(r11, r4, r11, r4)
                android.view.View r11 = r8.findViewById(r15)
                android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
                r11.setLayoutParams(r10)
                r10 = 2131362503(0x7f0a02c7, float:1.8344788E38)
                android.view.View r10 = r8.findViewById(r10)
                r11 = 8
                r10.setVisibility(r11)
                goto L_0x01b0
            L_0x013f:
                british.x.t_video_exoplayer r10 = british.p015x.t_video_exoplayer.this
                int r11 = r10.f10097J0
                int r10 = r10.f10099K0
                r8.setPadding(r11, r10, r11, r4)
                british.x.t_video_exoplayer r10 = british.p015x.t_video_exoplayer.this
                british.x.config r10 = r10.f10080B
                boolean r10 = r10.f7332f2
                if (r10 == 0) goto L_0x01b0
                android.content.SharedPreferences r10 = r1.f10149b
                java.lang.String r10 = r10.getString(r5, r6)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                british.x.t_video_exoplayer r13 = british.p015x.t_video_exoplayer.this
                long r12 = r13.f10137p0
                r11.append(r12)
                r11.append(r6)
                java.lang.String r11 = r11.toString()
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L_0x01b0
                boolean r10 = r0.booleanValue()
                if (r10 != 0) goto L_0x01b0
                british.x.t_video_exoplayer r10 = british.p015x.t_video_exoplayer.this
                boolean r10 = r10.f10134m0
                r11 = 2131362328(0x7f0a0218, float:1.8344433E38)
                if (r10 == 0) goto L_0x018d
                android.view.View r10 = r8.findViewById(r11)
                android.widget.ImageView r10 = (android.widget.ImageView) r10
                int r12 = british.p015x.C1692config.f7101A5
                android.graphics.PorterDuff$Mode r13 = android.graphics.PorterDuff.Mode.MULTIPLY
                r10.setColorFilter(r12, r13)
            L_0x018d:
                android.view.View r10 = r8.findViewById(r11)
                r10.setVisibility(r4)
                android.view.View r10 = r8.findViewById(r11)
                r12 = 2131362292(0x7f0a01f4, float:1.834436E38)
                android.content.SharedPreferences r13 = r1.f10149b
                java.lang.String r13 = r13.getString(r5, r6)
                r10.setTag(r12, r13)
                android.view.View r10 = r8.findViewById(r11)
                british.x.t_video_exoplayer$b$a r11 = new british.x.t_video_exoplayer$b$a
                r11.<init>()
                r10.setOnClickListener(r11)
            L_0x01b0:
                british.x.t_video_exoplayer r10 = british.p015x.t_video_exoplayer.this
                int r10 = r10.f10091G0
                if (r10 == 0) goto L_0x01c7
                boolean r10 = r0.booleanValue()
                if (r10 != 0) goto L_0x01c7
                android.view.View r10 = r8.findViewById(r15)
                british.x.t_video_exoplayer r11 = british.p015x.t_video_exoplayer.this
                int r11 = r11.f10091G0
                r10.setMinimumWidth(r11)
            L_0x01c7:
                int r10 = android.os.Build.VERSION.SDK_INT
                r11 = 17
                r12 = 2131034119(0x7f050007, float:1.7678747E38)
                r13 = 3
                if (r10 < r11) goto L_0x01ed
                if (r2 == 0) goto L_0x01ed
                british.x.t_video_exoplayer r11 = british.p015x.t_video_exoplayer.this
                android.content.res.Resources r11 = r11.getResources()
                boolean r11 = r11.getBoolean(r12)
                if (r11 == 0) goto L_0x01e6
                r8.setGravity(r13)
                r8.setLayoutDirection(r4)
                goto L_0x01ed
            L_0x01e6:
                r11 = 5
                r8.setGravity(r11)
                r8.setLayoutDirection(r7)
            L_0x01ed:
                r11 = 20
                if (r10 <= r11) goto L_0x0231
                r10 = 2131362743(0x7f0a03b7, float:1.8345275E38)
                android.view.View r10 = r8.findViewById(r10)
                android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
                british.x.t_video_exoplayer r11 = british.p015x.t_video_exoplayer.this
                java.lang.String r11 = r11.f6668q
                british.p015x.C1692config.m8168S0(r10, r11)
                r10 = 2131362746(0x7f0a03ba, float:1.8345281E38)
                android.view.View r10 = r8.findViewById(r10)
                android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
                british.x.t_video_exoplayer r11 = british.p015x.t_video_exoplayer.this
                java.lang.String r11 = r11.f6668q
                british.p015x.C1692config.m8168S0(r10, r11)
                r10 = 2131362744(0x7f0a03b8, float:1.8345277E38)
                android.view.View r10 = r8.findViewById(r10)
                android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
                british.x.t_video_exoplayer r11 = british.p015x.t_video_exoplayer.this
                java.lang.String r11 = r11.f6668q
                british.p015x.C1692config.m8168S0(r10, r11)
                r10 = 2131362745(0x7f0a03b9, float:1.834528E38)
                android.view.View r10 = r8.findViewById(r10)
                android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
                british.x.t_video_exoplayer r11 = british.p015x.t_video_exoplayer.this
                java.lang.String r11 = r11.f6668q
                british.p015x.C1692config.m8168S0(r10, r11)
            L_0x0231:
                r10 = 2131362327(0x7f0a0217, float:1.8344431E38)
                android.view.View r10 = r8.findViewById(r10)
                android.widget.ImageView r10 = (android.widget.ImageView) r10
                r11 = 2131363149(0x7f0a054d, float:1.8346099E38)
                android.view.View r11 = r8.findViewById(r11)
                android.widget.TextView r11 = (android.widget.TextView) r11
                r13 = 2131363113(0x7f0a0529, float:1.8346026E38)
                android.view.View r13 = r8.findViewById(r13)
                android.widget.TextView r13 = (android.widget.TextView) r13
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r4 = "#C0"
                r12.append(r4)
                java.lang.String r7 = "FFFFFF"
                r12.append(r7)
                java.lang.String r7 = r12.toString()
                int r7 = android.graphics.Color.parseColor(r7)
                british.x.t_video_exoplayer r12 = british.p015x.t_video_exoplayer.this
                java.lang.String r12 = r12.f10105N0
                java.lang.String r15 = "FFFFFFFF"
                boolean r12 = r12.equals(r15)
                if (r12 == 0) goto L_0x0290
                british.x.t_video_exoplayer r12 = british.p015x.t_video_exoplayer.this
                java.lang.String r12 = r12.f10107O0
                java.lang.String r15 = "FFFFFFFF"
                boolean r12 = r12.equals(r15)
                if (r12 == 0) goto L_0x0290
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r4)
                java.lang.String r12 = "EEEEEE"
                r7.append(r12)
                java.lang.String r7 = r7.toString()
                int r7 = android.graphics.Color.parseColor(r7)
            L_0x0290:
                java.lang.String r12 = "#555555"
                int r12 = android.graphics.Color.parseColor(r12)
                british.x.t_video_exoplayer r15 = british.p015x.t_video_exoplayer.this
                boolean r15 = r15.f10134m0
                if (r15 != 0) goto L_0x02a2
                java.lang.String r12 = "#999999"
                int r12 = android.graphics.Color.parseColor(r12)
            L_0x02a2:
                r11.setTextColor(r12)
                r13.setTextColor(r12)
                android.content.SharedPreferences r12 = r1.f10149b
                java.lang.String r12 = r12.getString(r5, r6)
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                british.x.t_video_exoplayer r14 = british.p015x.t_video_exoplayer.this
                r16 = r13
                long r13 = r14.f10137p0
                r15.append(r13)
                r15.append(r6)
                java.lang.String r13 = r15.toString()
                boolean r12 = r12.equals(r13)
                java.lang.String r15 = "1"
                if (r12 == 0) goto L_0x02fc
                british.x.t_video_exoplayer r12 = british.p015x.t_video_exoplayer.this
                boolean r13 = r12.f10134m0
                if (r13 != 0) goto L_0x02d5
                r13 = -1
                goto L_0x02d7
            L_0x02d5:
                r13 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            L_0x02d7:
                android.content.res.Resources r12 = r12.getResources()
                r14 = 2131821091(0x7f110223, float:1.9274915E38)
                java.lang.String r12 = r12.getString(r14)
                r11.setText(r12)
                british.x.t_video_exoplayer r11 = british.p015x.t_video_exoplayer.this
                int r11 = r11.f10141t0
                if (r11 <= 0) goto L_0x02f6
                british.x.t_video_exoplayer r11 = british.p015x.t_video_exoplayer.this
                android.graphics.Bitmap r11 = r11.f10115S0
                if (r11 == 0) goto L_0x02f6
                r10.setImageBitmap(r11)
            L_0x02f6:
                r19 = r3
                r20 = r5
                goto L_0x073b
            L_0x02fc:
                android.content.SharedPreferences r12 = r1.f10149b
                java.lang.String r13 = "f2_nombre"
                java.lang.String r12 = r12.getString(r13, r6)
                java.lang.String r12 = r12.trim()
                r11.setText(r12)
                r11 = 2131362292(0x7f0a01f4, float:1.834436E38)
                android.content.SharedPreferences r12 = r1.f10149b
                java.lang.String r13 = "0"
                java.lang.String r12 = r12.getString(r5, r13)
                r8.setTag(r11, r12)
                r11 = 2131362294(0x7f0a01f6, float:1.8344365E38)
                android.content.SharedPreferences r12 = r1.f10149b
                java.lang.String r14 = "f2_privados"
                java.lang.String r12 = r12.getString(r14, r15)
                r8.setTag(r11, r12)
                r11 = 2131362295(0x7f0a01f7, float:1.8344367E38)
                android.content.SharedPreferences r12 = r1.f10149b
                java.lang.String r14 = "f2_nombre"
                java.lang.String r12 = r12.getString(r14, r6)
                r8.setTag(r11, r12)
                r11 = 2131362296(0x7f0a01f8, float:1.8344369E38)
                android.content.SharedPreferences r12 = r1.f10149b
                java.lang.String r14 = "f2_coments"
                java.lang.String r12 = r12.getString(r14, r15)
                r8.setTag(r11, r12)
                r11 = 2131362297(0x7f0a01f9, float:1.834437E38)
                android.content.SharedPreferences r12 = r1.f10149b
                java.lang.String r14 = "f2_fnac_d"
                java.lang.String r12 = r12.getString(r14, r13)
                r8.setTag(r11, r12)
                r11 = 2131362298(0x7f0a01fa, float:1.8344373E38)
                android.content.SharedPreferences r12 = r1.f10149b
                java.lang.String r14 = "f2_fnac_m"
                java.lang.String r12 = r12.getString(r14, r13)
                r8.setTag(r11, r12)
                r11 = 2131362299(0x7f0a01fb, float:1.8344375E38)
                android.content.SharedPreferences r12 = r1.f10149b
                java.lang.String r14 = "f2_fnac_a"
                java.lang.String r12 = r12.getString(r14, r13)
                r8.setTag(r11, r12)
                r11 = 2131362300(0x7f0a01fc, float:1.8344377E38)
                android.content.SharedPreferences r12 = r1.f10149b
                java.lang.String r14 = "f2_sexo"
                java.lang.String r12 = r12.getString(r14, r13)
                r8.setTag(r11, r12)
                r11 = 2131362301(0x7f0a01fd, float:1.8344379E38)
                android.content.SharedPreferences r12 = r1.f10149b
                java.lang.String r14 = "f2_vfoto"
                java.lang.String r12 = r12.getString(r14, r13)
                r8.setTag(r11, r12)
                british.x.t_video_exoplayer r11 = british.p015x.t_video_exoplayer.this
                british.x.config r11 = r11.f10080B
                boolean r11 = r11.f7397p2
                if (r11 == 0) goto L_0x03b5
                android.content.SharedPreferences r11 = r1.f10149b
                java.lang.String r11 = r11.getString(r5, r6)
                boolean r11 = r11.equals(r15)
                if (r11 != 0) goto L_0x03b5
                r11 = 2131362233(0x7f0a01b9, float:1.834424E38)
                android.view.View r12 = r8.findViewById(r11)
                british.x.t_video_exoplayer r11 = british.p015x.t_video_exoplayer.this
                r12.setOnClickListener(r11)
                r11 = 2131362505(0x7f0a02c9, float:1.8344792E38)
                android.view.View r12 = r8.findViewById(r11)
                british.x.t_video_exoplayer r11 = british.p015x.t_video_exoplayer.this
                r12.setOnClickListener(r11)
            L_0x03b5:
                android.content.SharedPreferences r11 = r1.f10149b
                java.lang.String r11 = r11.getString(r5, r6)
                int r12 = r11.length()
                r14 = 1
                int r12 = r12 - r14
                int r14 = r11.length()
                java.lang.String r12 = r11.substring(r12, r14)
                boolean r14 = r11.equals(r15)
                if (r14 == 0) goto L_0x03d0
                r12 = r13
            L_0x03d0:
                british.x.t_video_exoplayer r14 = british.p015x.t_video_exoplayer.this
                boolean r14 = r14.f10134m0
                if (r14 == 0) goto L_0x04b9
                boolean r14 = r12.equals(r13)
                if (r14 != 0) goto L_0x049c
                java.lang.String r14 = "5"
                boolean r14 = r12.equals(r14)
                if (r14 == 0) goto L_0x03e6
                goto L_0x049c
            L_0x03e6:
                boolean r14 = r12.equals(r15)
                if (r14 != 0) goto L_0x047f
                java.lang.String r14 = "6"
                boolean r14 = r12.equals(r14)
                if (r14 == 0) goto L_0x03f6
                goto L_0x047f
            L_0x03f6:
                java.lang.String r14 = "2"
                boolean r14 = r12.equals(r14)
                if (r14 != 0) goto L_0x0462
                java.lang.String r14 = "7"
                boolean r14 = r12.equals(r14)
                if (r14 == 0) goto L_0x0407
                goto L_0x0462
            L_0x0407:
                java.lang.String r14 = "3"
                boolean r14 = r12.equals(r14)
                if (r14 != 0) goto L_0x0445
                java.lang.String r14 = "8"
                boolean r14 = r12.equals(r14)
                if (r14 == 0) goto L_0x0418
                goto L_0x0445
            L_0x0418:
                java.lang.String r14 = "4"
                boolean r14 = r12.equals(r14)
                if (r14 != 0) goto L_0x0428
                java.lang.String r14 = "9"
                boolean r12 = r12.equals(r14)
                if (r12 == 0) goto L_0x050b
            L_0x0428:
                java.lang.String r7 = "#FFCC0000"
                int r7 = android.graphics.Color.parseColor(r7)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r4)
                java.lang.String r14 = "FFDFDF"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                int r12 = android.graphics.Color.parseColor(r12)
                goto L_0x0536
            L_0x0445:
                java.lang.String r7 = "#FF9E5400"
                int r7 = android.graphics.Color.parseColor(r7)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r4)
                java.lang.String r14 = "FFF0DF"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                int r12 = android.graphics.Color.parseColor(r12)
                goto L_0x0536
            L_0x0462:
                java.lang.String r7 = "#FF3D5C00"
                int r7 = android.graphics.Color.parseColor(r7)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r4)
                java.lang.String r14 = "F4FFDF"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                int r12 = android.graphics.Color.parseColor(r12)
                goto L_0x0536
            L_0x047f:
                java.lang.String r7 = "#FF9933CC"
                int r7 = android.graphics.Color.parseColor(r7)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r4)
                java.lang.String r14 = "F2E6F9"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                int r12 = android.graphics.Color.parseColor(r12)
                goto L_0x0536
            L_0x049c:
                java.lang.String r7 = "#FF00698C"
                int r7 = android.graphics.Color.parseColor(r7)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r4)
                java.lang.String r14 = "DFF8FF"
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                int r12 = android.graphics.Color.parseColor(r12)
                goto L_0x0536
            L_0x04b9:
                boolean r14 = r12.equals(r13)
                if (r14 != 0) goto L_0x052b
                java.lang.String r14 = "5"
                boolean r14 = r12.equals(r14)
                if (r14 == 0) goto L_0x04c9
                goto L_0x052b
            L_0x04c9:
                boolean r14 = r12.equals(r15)
                if (r14 != 0) goto L_0x0524
                java.lang.String r14 = "6"
                boolean r14 = r12.equals(r14)
                if (r14 == 0) goto L_0x04d8
                goto L_0x0524
            L_0x04d8:
                java.lang.String r14 = "2"
                boolean r14 = r12.equals(r14)
                if (r14 != 0) goto L_0x051d
                java.lang.String r14 = "7"
                boolean r14 = r12.equals(r14)
                if (r14 == 0) goto L_0x04e9
                goto L_0x051d
            L_0x04e9:
                java.lang.String r14 = "3"
                boolean r14 = r12.equals(r14)
                if (r14 != 0) goto L_0x0516
                java.lang.String r14 = "8"
                boolean r14 = r12.equals(r14)
                if (r14 == 0) goto L_0x04fa
                goto L_0x0516
            L_0x04fa:
                java.lang.String r14 = "4"
                boolean r14 = r12.equals(r14)
                if (r14 != 0) goto L_0x050f
                java.lang.String r14 = "9"
                boolean r12 = r12.equals(r14)
                if (r12 == 0) goto L_0x050b
                goto L_0x050f
            L_0x050b:
                r12 = r7
                r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                goto L_0x0536
            L_0x050f:
                java.lang.String r12 = "#FF33FFFF"
                int r12 = android.graphics.Color.parseColor(r12)
                goto L_0x0531
            L_0x0516:
                java.lang.String r12 = "#FF87BFFF"
                int r12 = android.graphics.Color.parseColor(r12)
                goto L_0x0531
            L_0x051d:
                java.lang.String r12 = "#FFC9ADFF"
                int r12 = android.graphics.Color.parseColor(r12)
                goto L_0x0531
            L_0x0524:
                java.lang.String r12 = "#FF66CC33"
                int r12 = android.graphics.Color.parseColor(r12)
                goto L_0x0531
            L_0x052b:
                java.lang.String r12 = "#FFFF6633"
                int r12 = android.graphics.Color.parseColor(r12)
            L_0x0531:
                r22 = r12
                r12 = r7
                r7 = r22
            L_0x0536:
                british.x.t_video_exoplayer r14 = british.p015x.t_video_exoplayer.this
                r17 = r7
                british.x.config r7 = r14.f10080B
                boolean r7 = r7.f7297Z1
                if (r7 != 0) goto L_0x0549
                boolean r7 = r14.f10134m0
                if (r7 == 0) goto L_0x0547
                r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                goto L_0x0549
            L_0x0547:
                r17 = -1
            L_0x0549:
                android.content.SharedPreferences r7 = r1.f10149b
                java.lang.String r14 = "f2_vfoto"
                java.lang.String r7 = r7.getString(r14, r13)
                british.x.t_video_exoplayer r14 = british.p015x.t_video_exoplayer.this
                int r14 = r14.f10141t0
                if (r14 <= 0) goto L_0x0577
                android.content.SharedPreferences r14 = r1.f10149b
                java.lang.String r14 = r14.getString(r5, r6)
                boolean r14 = r14.equals(r15)
                if (r14 == 0) goto L_0x0577
                british.x.t_video_exoplayer r7 = british.p015x.t_video_exoplayer.this
                android.content.res.Resources r7 = r7.getResources()
                r11 = 2131230865(0x7f080091, float:1.8077795E38)
                android.graphics.drawable.Drawable r7 = r7.getDrawable(r11)
                r10.setImageDrawable(r7)
                goto L_0x0731
            L_0x0577:
                british.x.t_video_exoplayer r14 = british.p015x.t_video_exoplayer.this
                int r14 = r14.f10141t0
                if (r14 <= 0) goto L_0x05ae
                boolean r14 = r7.equals(r13)
                if (r14 == 0) goto L_0x05ae
                british.x.t_video_exoplayer r7 = british.p015x.t_video_exoplayer.this
                boolean r11 = r7.f10134m0
                if (r11 == 0) goto L_0x059a
                android.content.res.Resources r7 = r7.getResources()
                r11 = 2131231487(0x7f0802ff, float:1.8079056E38)
                android.graphics.drawable.Drawable r7 = r7.getDrawable(r11)
                r10.setImageDrawable(r7)
                goto L_0x05a8
            L_0x059a:
                android.content.res.Resources r7 = r7.getResources()
                r11 = 2131231485(0x7f0802fd, float:1.8079052E38)
                android.graphics.drawable.Drawable r7 = r7.getDrawable(r11)
                r10.setImageDrawable(r7)
            L_0x05a8:
                r7 = 0
                r10.setVisibility(r7)
                goto L_0x0731
            L_0x05ae:
                british.x.t_video_exoplayer r14 = british.p015x.t_video_exoplayer.this
                int r14 = r14.f10141t0
                if (r14 <= 0) goto L_0x0731
                boolean r13 = r7.equals(r13)
                if (r13 != 0) goto L_0x0731
                british.x.t_video_exoplayer r13 = british.p015x.t_video_exoplayer.this
                java.util.HashMap<java.lang.String, android.graphics.Bitmap> r13 = r13.f10109P0
                java.lang.Object r13 = r13.get(r11)
                android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
                if (r13 == 0) goto L_0x05d3
                r10.setImageBitmap(r13)
                r19 = r3
                r20 = r5
                r18 = r12
                goto L_0x06a7
            L_0x05d3:
                java.io.File r13 = new java.io.File     // Catch:{ Exception -> 0x067a }
                british.x.t_video_exoplayer r14 = british.p015x.t_video_exoplayer.this     // Catch:{ Exception -> 0x067a }
                java.io.File r14 = r14.f10121V0     // Catch:{ Exception -> 0x067a }
                r18 = r12
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0675 }
                r12.<init>()     // Catch:{ Exception -> 0x0675 }
                r19 = r3
                java.lang.String r3 = "fperfil_"
                r12.append(r3)     // Catch:{ Exception -> 0x0677 }
                r12.append(r11)     // Catch:{ Exception -> 0x0677 }
                java.lang.String r3 = ".jpg"
                r12.append(r3)     // Catch:{ Exception -> 0x0677 }
                java.lang.String r3 = r12.toString()     // Catch:{ Exception -> 0x0677 }
                r13.<init>(r14, r3)     // Catch:{ Exception -> 0x0677 }
                android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0677 }
                r3.<init>()     // Catch:{ Exception -> 0x0677 }
                r12 = 1
                r3.inJustDecodeBounds = r12     // Catch:{ Exception -> 0x0677 }
                java.lang.String r12 = r13.getPath()     // Catch:{ Exception -> 0x0677 }
                android.graphics.BitmapFactory.decodeFile(r12, r3)     // Catch:{ Exception -> 0x0677 }
                r12 = 1111490560(0x42400000, float:48.0)
                british.x.t_video_exoplayer r14 = british.p015x.t_video_exoplayer.this     // Catch:{ Exception -> 0x0677 }
                android.content.res.Resources r14 = r14.getResources()     // Catch:{ Exception -> 0x0677 }
                android.util.DisplayMetrics r14 = r14.getDisplayMetrics()     // Catch:{ Exception -> 0x0677 }
                float r14 = r14.density     // Catch:{ Exception -> 0x0677 }
                float r14 = r14 * r12
                r12 = 1056964608(0x3f000000, float:0.5)
                float r14 = r14 + r12
                int r12 = (int) r14     // Catch:{ Exception -> 0x0677 }
                british.x.t_video_exoplayer r14 = british.p015x.t_video_exoplayer.this     // Catch:{ Exception -> 0x0677 }
                android.content.res.Resources r14 = r14.getResources()     // Catch:{ Exception -> 0x0677 }
                android.util.DisplayMetrics r14 = r14.getDisplayMetrics()     // Catch:{ Exception -> 0x0677 }
                float r14 = r14.density     // Catch:{ Exception -> 0x0677 }
                r20 = 1111490560(0x42400000, float:48.0)
                float r14 = r14 * r20
                r20 = 1056964608(0x3f000000, float:0.5)
                float r14 = r14 + r20
                int r14 = (int) r14
                r20 = r5
                int r5 = r3.outWidth     // Catch:{ Exception -> 0x0673 }
                int r3 = r3.outHeight     // Catch:{ Exception -> 0x0673 }
                if (r5 > r12) goto L_0x063b
                if (r3 > r14) goto L_0x063b
                r21 = 1
                goto L_0x063d
            L_0x063b:
                r21 = 0
            L_0x063d:
                if (r21 != 0) goto L_0x065a
                int r3 = british.p015x.C1692config.m8193n(r5, r3, r12, r14)     // Catch:{ Exception -> 0x0673 }
                float r5 = (float) r5     // Catch:{ Exception -> 0x0673 }
                float r3 = (float) r3     // Catch:{ Exception -> 0x0673 }
                float r5 = r5 / r3
                int r3 = java.lang.Math.round(r5)     // Catch:{ Exception -> 0x0673 }
                android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0673 }
                r5.<init>()     // Catch:{ Exception -> 0x0673 }
                r5.inSampleSize = r3     // Catch:{ Exception -> 0x0673 }
                java.lang.String r3 = r13.getPath()     // Catch:{ Exception -> 0x0673 }
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r3, r5)     // Catch:{ Exception -> 0x0673 }
                goto L_0x0668
            L_0x065a:
                british.x.t_video_exoplayer r3 = british.p015x.t_video_exoplayer.this     // Catch:{ Exception -> 0x0673 }
                android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ Exception -> 0x0673 }
                android.net.Uri r5 = android.net.Uri.fromFile(r13)     // Catch:{ Exception -> 0x0673 }
                android.graphics.Bitmap r3 = android.provider.MediaStore.Images.Media.getBitmap(r3, r5)     // Catch:{ Exception -> 0x0673 }
            L_0x0668:
                r10.setImageBitmap(r3)     // Catch:{ Exception -> 0x0673 }
                british.x.t_video_exoplayer r5 = british.p015x.t_video_exoplayer.this     // Catch:{ Exception -> 0x0673 }
                java.util.HashMap<java.lang.String, android.graphics.Bitmap> r5 = r5.f10109P0     // Catch:{ Exception -> 0x0673 }
                r5.put(r11, r3)     // Catch:{ Exception -> 0x0673 }
                goto L_0x06a7
            L_0x0673:
                goto L_0x0680
            L_0x0675:
                r19 = r3
            L_0x0677:
                r20 = r5
                goto L_0x0680
            L_0x067a:
                r19 = r3
                r20 = r5
                r18 = r12
            L_0x0680:
                british.x.t_video_exoplayer r3 = british.p015x.t_video_exoplayer.this
                boolean r5 = r3.f10134m0
                if (r5 == 0) goto L_0x0695
                android.content.res.Resources r3 = r3.getResources()
                r5 = 2131231487(0x7f0802ff, float:1.8079056E38)
                android.graphics.drawable.Drawable r3 = r3.getDrawable(r5)
                r10.setImageDrawable(r3)
                goto L_0x06a3
            L_0x0695:
                android.content.res.Resources r3 = r3.getResources()
                r5 = 2131231485(0x7f0802fd, float:1.8079052E38)
                android.graphics.drawable.Drawable r3 = r3.getDrawable(r5)
                r10.setImageDrawable(r3)
            L_0x06a3:
                r3 = 0
                r10.setVisibility(r3)
            L_0x06a7:
                android.content.SharedPreferences r3 = r1.f10149b
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r12 = "fperfil_"
                r5.append(r12)
                r5.append(r11)
                java.lang.String r5 = r5.toString()
                java.lang.String r3 = r3.getString(r5, r6)
                boolean r3 = r3.equals(r7)
                if (r3 != 0) goto L_0x0737
                british.x.t_video_exoplayer r3 = british.p015x.t_video_exoplayer.this
                boolean r3 = r3.f10128Z
                if (r3 == 0) goto L_0x06d6
                r3 = 2131362746(0x7f0a03ba, float:1.8345281E38)
                android.view.View r3 = r8.findViewById(r3)
                r5 = 0
                r3.setVisibility(r5)
                goto L_0x06e1
            L_0x06d6:
                r5 = 0
                r3 = 2131362743(0x7f0a03b7, float:1.8345275E38)
                android.view.View r3 = r8.findViewById(r3)
                r3.setVisibility(r5)
            L_0x06e1:
                british.x.t_video_exoplayer r3 = british.p015x.t_video_exoplayer.this
                java.util.HashMap<java.lang.String, java.lang.String> r3 = r3.f10111Q0
                boolean r3 = r3.containsKey(r11)
                if (r3 != 0) goto L_0x0737
                british.x.t_video_exoplayer r3 = british.p015x.t_video_exoplayer.this
                java.util.HashMap<java.lang.String, java.lang.String> r3 = r3.f10113R0
                boolean r3 = r3.containsKey(r11)
                if (r3 == 0) goto L_0x0705
                british.x.t_video_exoplayer r3 = british.p015x.t_video_exoplayer.this
                java.util.HashMap<java.lang.String, java.lang.String> r3 = r3.f10113R0
                java.lang.Object r3 = r3.get(r11)
                java.lang.String r3 = (java.lang.String) r3
                boolean r3 = r3.equals(r7)
                if (r3 != 0) goto L_0x0737
            L_0x0705:
                british.x.t_video_exoplayer r3 = british.p015x.t_video_exoplayer.this
                java.util.HashMap<java.lang.String, java.lang.String> r3 = r3.f10111Q0
                r3.put(r11, r7)
                british.x.t_video_exoplayer r3 = british.p015x.t_video_exoplayer.this
                british.x.t_video_exoplayer$w r3 = r3.f10119U0
                if (r3 == 0) goto L_0x071a
                android.os.AsyncTask$Status r3 = r3.getStatus()
                android.os.AsyncTask$Status r5 = android.os.AsyncTask.Status.RUNNING
                if (r3 == r5) goto L_0x0737
            L_0x071a:
                british.x.t_video_exoplayer r3 = british.p015x.t_video_exoplayer.this
                british.x.t_video_exoplayer$w r5 = new british.x.t_video_exoplayer$w
                british.x.t_video_exoplayer r7 = british.p015x.t_video_exoplayer.this
                r11 = 0
                r5.<init>()
                r3.f10119U0 = r5
                british.x.t_video_exoplayer r3 = british.p015x.t_video_exoplayer.this
                british.x.t_video_exoplayer$w r3 = r3.f10119U0
                r5 = 0
                java.lang.String[] r7 = new java.lang.String[r5]
                r3.execute(r7)
                goto L_0x0737
            L_0x0731:
                r19 = r3
                r20 = r5
                r18 = r12
            L_0x0737:
                r13 = r17
                r7 = r18
            L_0x073b:
                british.x.t_video_exoplayer r3 = british.p015x.t_video_exoplayer.this
                british.x.config r3 = r3.f10080B
                int r5 = r3.f7338g2
                r11 = 2
                if (r5 <= 0) goto L_0x082d
                java.lang.String r3 = r3.f7356j2
                boolean r3 = r3.equals(r6)
                if (r3 != 0) goto L_0x0769
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r4)
                british.x.t_video_exoplayer r4 = british.p015x.t_video_exoplayer.this
                british.x.config r4 = r4.f10080B
                java.lang.String r4 = r4.f7356j2
                java.lang.String r4 = r4.substring(r11)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                int r7 = android.graphics.Color.parseColor(r3)
            L_0x0769:
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 17
                r5 = 2131230891(0x7f0800ab, float:1.8077848E38)
                if (r3 < r4) goto L_0x07be
                if (r2 == 0) goto L_0x07be
                british.x.t_video_exoplayer r2 = british.p015x.t_video_exoplayer.this
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131034119(0x7f050007, float:1.7678747E38)
                boolean r2 = r2.getBoolean(r3)
                if (r2 == 0) goto L_0x07a2
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x078b
                goto L_0x0814
            L_0x078b:
                r5 = 2131230883(0x7f0800a3, float:1.8077831E38)
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                british.x.config r0 = r0.f10080B
                int r0 = r0.f7338g2
                if (r0 != r11) goto L_0x0798
                goto L_0x0803
            L_0x0798:
                r2 = 3
                if (r0 != r2) goto L_0x079d
                goto L_0x080a
            L_0x079d:
                r2 = 4
                if (r0 != r2) goto L_0x0814
                goto L_0x0811
            L_0x07a2:
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x07aa
                goto L_0x0814
            L_0x07aa:
                r5 = 2131230890(0x7f0800aa, float:1.8077846E38)
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                british.x.config r0 = r0.f10080B
                int r0 = r0.f7338g2
                if (r0 != r11) goto L_0x07b6
                goto L_0x07df
            L_0x07b6:
                r2 = 3
                if (r0 != r2) goto L_0x07ba
                goto L_0x07e6
            L_0x07ba:
                r2 = 4
                if (r0 != r2) goto L_0x0814
                goto L_0x07ed
            L_0x07be:
                british.x.t_video_exoplayer r2 = british.p015x.t_video_exoplayer.this
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131034119(0x7f050007, float:1.7678747E38)
                boolean r2 = r2.getBoolean(r3)
                if (r2 == 0) goto L_0x07f1
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x07d4
                goto L_0x0814
            L_0x07d4:
                r5 = 2131230890(0x7f0800aa, float:1.8077846E38)
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                british.x.config r0 = r0.f10080B
                int r0 = r0.f7338g2
                if (r0 != r11) goto L_0x07e3
            L_0x07df:
                r5 = 2131230885(0x7f0800a5, float:1.8077835E38)
                goto L_0x0814
            L_0x07e3:
                r2 = 3
                if (r0 != r2) goto L_0x07ea
            L_0x07e6:
                r5 = 2131230887(0x7f0800a7, float:1.807784E38)
                goto L_0x0814
            L_0x07ea:
                r2 = 4
                if (r0 != r2) goto L_0x0814
            L_0x07ed:
                r5 = 2131230889(0x7f0800a9, float:1.8077844E38)
                goto L_0x0814
            L_0x07f1:
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x07f8
                goto L_0x0814
            L_0x07f8:
                r5 = 2131230883(0x7f0800a3, float:1.8077831E38)
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                british.x.config r0 = r0.f10080B
                int r0 = r0.f7338g2
                if (r0 != r11) goto L_0x0807
            L_0x0803:
                r5 = 2131230884(0x7f0800a4, float:1.8077833E38)
                goto L_0x0814
            L_0x0807:
                r2 = 3
                if (r0 != r2) goto L_0x080e
            L_0x080a:
                r5 = 2131230886(0x7f0800a6, float:1.8077837E38)
                goto L_0x0814
            L_0x080e:
                r2 = 4
                if (r0 != r2) goto L_0x0814
            L_0x0811:
                r5 = 2131230888(0x7f0800a8, float:1.8077841E38)
            L_0x0814:
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                android.content.res.Resources r0 = r0.getResources()
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r5)
                android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
                r0.setColorFilter(r7, r2)
                r2 = 2131362505(0x7f0a02c9, float:1.8344792E38)
                android.view.View r2 = r8.findViewById(r2)
                r2.setBackgroundDrawable(r0)
            L_0x082d:
                android.content.SharedPreferences r0 = r1.f10149b
                java.lang.String r0 = r0.getString(r9, r6)
                boolean r2 = r0.equals(r6)
                if (r2 != 0) goto L_0x085f
                r2 = 6
                r3 = 10
                java.lang.String r0 = r0.substring(r2, r3)
                java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
                java.lang.String r3 = "HHmm"
                r2.<init>(r3)
                java.util.Date r0 = r2.parse(r0)     // Catch:{ Exception -> 0x085b }
                british.x.t_video_exoplayer r2 = british.p015x.t_video_exoplayer.this     // Catch:{ Exception -> 0x085b }
                java.text.DateFormat r2 = android.text.format.DateFormat.getTimeFormat(r2)     // Catch:{ Exception -> 0x085b }
                java.lang.String r0 = r2.format(r0)     // Catch:{ Exception -> 0x085b }
                r2 = r16
                r2.setText(r0)     // Catch:{ Exception -> 0x085b }
                goto L_0x085f
            L_0x085b:
                r0 = move-exception
                r0.printStackTrace()
            L_0x085f:
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                int r0 = r0.f10141t0
                if (r0 <= 0) goto L_0x087d
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                british.x.config r2 = r0.f10080B
                boolean r2 = r2.f7297Z1
                if (r2 == 0) goto L_0x0871
                r0 = r13
                goto L_0x0879
            L_0x0871:
                boolean r0 = r0.f10128Z
                if (r0 == 0) goto L_0x0878
                r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                goto L_0x0879
            L_0x0878:
                r0 = -1
            L_0x0879:
                r10.setBackgroundColor(r0)
                goto L_0x08b6
            L_0x087d:
                r2 = 8
                r10.setVisibility(r2)
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                british.x.config r3 = r0.f10080B
                int r4 = r3.f7338g2
                if (r4 <= 0) goto L_0x0895
                r4 = 2131362233(0x7f0a01b9, float:1.834424E38)
                android.view.View r0 = r8.findViewById(r4)
                r0.setVisibility(r2)
                goto L_0x08b6
            L_0x0895:
                boolean r2 = r3.f7297Z1
                if (r2 == 0) goto L_0x089e
                r0 = r13
            L_0x089a:
                r2 = 2131363190(0x7f0a0576, float:1.8346182E38)
                goto L_0x08a7
            L_0x089e:
                boolean r0 = r0.f10128Z
                if (r0 == 0) goto L_0x08a5
                r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                goto L_0x089a
            L_0x08a5:
                r0 = -1
                goto L_0x089a
            L_0x08a7:
                android.view.View r3 = r8.findViewById(r2)
                r3.setBackgroundColor(r0)
                android.view.View r0 = r8.findViewById(r2)
                r2 = 0
                r0.setVisibility(r2)
            L_0x08b6:
                r0 = 2131363120(0x7f0a0530, float:1.834604E38)
                android.view.View r0 = r8.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                android.content.SharedPreferences r2 = r1.f10149b
                java.lang.String r3 = "f2_frase"
                java.lang.String r2 = r2.getString(r3, r6)
                android.content.SharedPreferences r3 = r1.f10149b
                java.lang.String r4 = "f2_tipo"
                java.lang.String r3 = r3.getString(r4, r6)
                r3.equals(r15)
                boolean r3 = r2.equals(r6)
                if (r3 != 0) goto L_0x08f4
                british.x.t_video_exoplayer r3 = british.p015x.t_video_exoplayer.this
                java.lang.CharSequence r2 = british.p015x.t_chat.m8702G(r3, r2)
                british.x.t_video_exoplayer r3 = british.p015x.t_video_exoplayer.this
                british.x.config r3 = r3.f10080B
                boolean r3 = r3.f7273V1
                if (r3 == 0) goto L_0x08ed
                r3 = 1
                r0.setAutoLinkMask(r3)
                r0.setLinkTextColor(r13)
            L_0x08ed:
                r0.setText(r2)
                r0.setTextColor(r13)
                goto L_0x090d
            L_0x08f4:
                android.content.SharedPreferences r0 = r1.f10149b
                java.lang.String r2 = "f2_b64"
                java.lang.String r0 = r0.getString(r2, r6)
                java.lang.String r2 = "es_ad"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x090d
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                british.x.config r2 = r0.f10080B
                int r0 = r0.f10093H0
                r2.mo7480F0(r8, r13, r0)
            L_0x090d:
                android.content.SharedPreferences r0 = r1.f10149b
                r2 = r20
                java.lang.String r0 = r0.getString(r2, r6)
                r8.setTag(r0)
                android.content.SharedPreferences r0 = r1.f10149b
                r2 = r19
                r3 = 0
                boolean r0 = r0.getBoolean(r2, r3)
                if (r0 == 0) goto L_0x092b
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                android.widget.LinearLayout r0 = r0.f10101L0
                r0.addView(r8, r3)
                goto L_0x0946
            L_0x092b:
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                android.widget.LinearLayout r0 = r0.f10101L0
                r0.addView(r8)
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                android.widget.LinearLayout r0 = r0.f10101L0
                int r0 = r0.getChildCount()
                r2 = 200(0xc8, float:2.8E-43)
                if (r0 <= r2) goto L_0x0946
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                android.widget.LinearLayout r0 = r0.f10101L0
                r2 = 0
                r0.removeViewAt(r2)
            L_0x0946:
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                int r2 = r0.f10147z0
                r3 = 1
                int r2 = r2 + r3
                r0.f10147z0 = r2
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                int r0 = r0.f10147z0
                if (r0 != r3) goto L_0x0968
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                r2 = 2131363221(0x7f0a0595, float:1.8346245E38)
                android.view.View r0 = r0.findViewById(r2)
                r2 = 8
                r0.setVisibility(r2)
                goto L_0x097e
            L_0x0968:
                r2 = 8
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                int r0 = r0.f10147z0
                if (r0 != r11) goto L_0x097e
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                r3 = 2131363222(0x7f0a0596, float:1.8346247E38)
                android.view.View r0 = r0.findViewById(r3)
                r0.setVisibility(r2)
            L_0x097e:
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                r2 = 2131362951(0x7f0a0487, float:1.8345697E38)
                android.view.View r0 = r0.findViewById(r2)
                android.widget.ScrollView r0 = (android.widget.ScrollView) r0
                british.x.t_video_exoplayer r2 = british.p015x.t_video_exoplayer.this
                android.widget.LinearLayout r2 = r2.f10101L0
                int r2 = r2.getMeasuredHeight()
                int r3 = r0.getScrollY()
                int r4 = r0.getHeight()
                int r3 = r3 + r4
                if (r2 > r3) goto L_0x09a4
                british.x.t_video_exoplayer$b$b r2 = new british.x.t_video_exoplayer$b$b
                r2.<init>()
                r0.post(r2)
            L_0x09a4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_video_exoplayer.C2512b.run():void");
        }
    }

    /* renamed from: british.x.t_video_exoplayer$c */
    class C2515c implements View.OnClickListener {
        C2515c() {
        }

        public void onClick(View view) {
            if (!t_video_exoplayer.this.f10104N.booleanValue()) {
                t_video_exoplayer.this.m9031g0();
            } else {
                t_video_exoplayer.this.m9024X();
            }
        }
    }

    /* renamed from: british.x.t_video_exoplayer$d */
    class C2516d implements View.OnClickListener {
        C2516d() {
        }

        public void onClick(View view) {
            ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo3246H(8388611);
        }
    }

    /* renamed from: british.x.t_video_exoplayer$e */
    class C2517e implements View.OnClickListener {
        C2517e() {
        }

        public void onClick(View view) {
            ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo3246H(8388611);
        }
    }

    /* renamed from: british.x.t_video_exoplayer$f */
    class C2518f implements Runnable {
        C2518f() {
        }

        public void run() {
            try {
                ViewGroup.LayoutParams layoutParams = t_video_exoplayer.this.findViewById(R.id.ll_btns).getLayoutParams();
                layoutParams.width = t_video_exoplayer.this.f10098K.getVideoSurfaceView().getWidth();
                layoutParams.height = t_video_exoplayer.this.f10098K.getVideoSurfaceView().getHeight();
                ((LinearLayout) t_video_exoplayer.this.findViewById(R.id.ll_btns)).setLayoutParams(layoutParams);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: british.x.t_video_exoplayer$g */
    class C2519g extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f10157a;

        /* renamed from: british.x.t_video_exoplayer$g$a */
        class C2520a extends FullScreenContentCallback {
            C2520a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_video_exoplayer t_video_exoplayer = t_video_exoplayer.this;
                if (t_video_exoplayer.f10086E) {
                    t_video_exoplayer.abrir_secc(t_video_exoplayer.f6672u);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_video_exoplayer t_video_exoplayer = t_video_exoplayer.this;
                t_video_exoplayer.abrir_secc(t_video_exoplayer.f6672u);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.x.t_video_exoplayer$g$b */
        class C2521b implements OnUserEarnedRewardListener {
            C2521b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2519g gVar = C2519g.this;
                t_video_exoplayer.this.f10086E = true;
                C1692config.m8175Y0(gVar.f10157a);
            }
        }

        C2519g(Context context) {
            this.f10157a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_video_exoplayer.this.f6673v.cancel();
            rewardedAd.setFullScreenContentCallback(new C2520a());
            rewardedAd.show((Activity) this.f10157a, new C2521b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_video_exoplayer t_video_exoplayer = t_video_exoplayer.this;
            if (!t_video_exoplayer.f10080B.mo7502f(this.f10157a, t_video_exoplayer.f6675x)) {
                t_video_exoplayer.this.f6673v.cancel();
                t_video_exoplayer t_video_exoplayer2 = t_video_exoplayer.this;
                t_video_exoplayer2.abrir_secc(t_video_exoplayer2.f6672u);
            }
        }
    }

    /* renamed from: british.x.t_video_exoplayer$h */
    class C2522h implements AdDisplayListener {
        C2522h() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_video_exoplayer t_video_exoplayer = t_video_exoplayer.this;
            if (t_video_exoplayer.f10086E) {
                t_video_exoplayer.abrir_secc(t_video_exoplayer.f6672u);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.x.t_video_exoplayer$i */
    class C2523i extends AdColonyInterstitialListener {
        C2523i() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_video_exoplayer t_video_exoplayer = t_video_exoplayer.this;
            if (t_video_exoplayer.f10086E) {
                t_video_exoplayer.abrir_secc(t_video_exoplayer.f6672u);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_video_exoplayer.this.f6673v.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_video_exoplayer.this.f6673v.cancel();
            t_video_exoplayer t_video_exoplayer = t_video_exoplayer.this;
            t_video_exoplayer.abrir_secc(t_video_exoplayer.f6672u);
        }
    }

    /* renamed from: british.x.t_video_exoplayer$j */
    class C2524j implements SearchManager.OnCancelListener {
        C2524j() {
        }

        public void onCancel() {
            t_video_exoplayer t_video_exoplayer = t_video_exoplayer.this;
            t_video_exoplayer.f6669r = false;
            t_video_exoplayer.setResult(0);
        }
    }

    /* renamed from: british.x.t_video_exoplayer$k */
    class C2525k implements SearchManager.OnDismissListener {
        C2525k() {
        }

        public void onDismiss() {
            t_video_exoplayer.this.f6670s = false;
        }
    }

    /* renamed from: british.x.t_video_exoplayer$l */
    class C2526l implements View.OnClickListener {
        C2526l() {
        }

        public void onClick(View view) {
            ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo3246H(8388611);
        }
    }

    /* renamed from: british.x.t_video_exoplayer$m */
    class C2527m implements View.OnClickListener {
        C2527m() {
        }

        public void onClick(View view) {
            ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo3246H(8388611);
        }
    }

    /* renamed from: british.x.t_video_exoplayer$n */
    class C2528n implements View.OnTouchListener {
        C2528n() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            t_video_exoplayer t_video_exoplayer = t_video_exoplayer.this;
            if (!t_video_exoplayer.f10112R) {
                return false;
            }
            String str = t_video_exoplayer.f10118U;
            if (str == null || str.equals("")) {
                return true;
            }
            t_video_exoplayer.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(t_video_exoplayer.this.f10118U)));
            return true;
        }
    }

    /* renamed from: british.x.t_video_exoplayer$o */
    class C2529o implements View.OnClickListener {
        C2529o() {
        }

        public void onClick(View view) {
            String str;
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(t_video_exoplayer.this.f10110Q.toString());
            String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : "video/*";
            try {
                str = URLUtil.guessFileName(t_video_exoplayer.this.f10110Q.toString(), (String) null, mimeTypeFromExtension);
            } catch (Exception unused) {
                str = "";
            }
            t_video_exoplayer t_video_exoplayer = t_video_exoplayer.this;
            t_video_exoplayer.f10080B.mo7491W(t_video_exoplayer.f10110Q.toString(), mimeTypeFromExtension, str, t_video_exoplayer.this);
        }
    }

    /* renamed from: british.x.t_video_exoplayer$p */
    class C2530p extends C2532r {
        C2530p() {
            super();
        }

        public void onPlaybackStateChanged(int i) {
            if (t_video_exoplayer.this.f10096J.isPlaying() || (t_video_exoplayer.this.f10096J.getPlayWhenReady() && i == 3)) {
                t_video_exoplayer.this.findViewById(R.id.pb_video).setVisibility(8);
                t_video_exoplayer t_video_exoplayer = t_video_exoplayer.this;
                if (t_video_exoplayer.f10112R) {
                    try {
                        ViewGroup.LayoutParams layoutParams = t_video_exoplayer.findViewById(R.id.ll_btns).getLayoutParams();
                        layoutParams.width = t_video_exoplayer.this.f10098K.getVideoSurfaceView().getWidth();
                        layoutParams.height = t_video_exoplayer.this.f10098K.getVideoSurfaceView().getHeight();
                        ((LinearLayout) t_video_exoplayer.this.findViewById(R.id.ll_btns)).setLayoutParams(layoutParams);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    t_video_exoplayer.this.findViewById(R.id.ll_btns).setVisibility(0);
                    new C1692config.C1728p0(t_video_exoplayer.this.f10116T, (String) null).execute(new String[0]);
                }
            }
        }
    }

    /* renamed from: british.x.t_video_exoplayer$q */
    class C2531q implements View.OnClickListener {
        C2531q() {
        }

        public void onClick(View view) {
            t_video_exoplayer.this.m9023W();
        }
    }

    /* renamed from: british.x.t_video_exoplayer$r */
    private class C2532r implements Player.Listener, Player.EventListener {
        private C2532r() {
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

        public /* synthetic */ void onLoadingChanged(boolean z) {
            C6808p0.m28587e(this, z);
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

        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            C6808p0.m28591i(this, playbackParameters);
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

        public /* synthetic */ void onRenderedFirstFrame() {
            C7020a.m28755a(this);
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

        public /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i) {
            C6808p0.m28603u(this, timeline, obj, i);
        }

        public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            C6808p0.m28604v(this, trackGroupArray, trackSelectionArray);
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

    /* renamed from: british.x.t_video_exoplayer$s */
    private class C2533s implements C10779r {

        /* renamed from: british.x.t_video_exoplayer$s$a */
        class C2534a implements C4580e.C4582b {

            /* renamed from: a */
            final /* synthetic */ C4580e f10173a;

            C2534a(C4580e eVar) {
                this.f10173a = eVar;
            }

            /* renamed from: c */
            public void mo9079c() {
            }

            /* renamed from: d */
            public void mo9080d() {
            }

            /* renamed from: e */
            public void mo9081e() {
            }

            /* renamed from: f */
            public void mo9082f() {
            }

            /* renamed from: g */
            public void mo9083g() {
                t_video_exoplayer.this.startActivity(new Intent(t_video_exoplayer.this, ExpandedControlsActivity.class));
                this.f10173a.mo17821F(this);
            }

            /* renamed from: l */
            public void mo9084l() {
            }
        }

        private C2533s() {
        }

        /* renamed from: a */
        public void mo9070a(C10775p pVar) {
        }

        /* renamed from: b */
        public void mo9071b(C10775p pVar, int i) {
        }

        /* renamed from: h */
        public void mo9072h(C10775p pVar, int i) {
        }

        /* renamed from: i */
        public void mo9073i(C10775p pVar, boolean z) {
            t_video_exoplayer.this.invalidateOptionsMenu();
        }

        /* renamed from: j */
        public void mo9074j(C10775p pVar, int i) {
        }

        /* renamed from: k */
        public void mo9075k(C10775p pVar) {
        }

        /* renamed from: m */
        public void mo9076m(C10775p pVar, String str) {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(3:4|(1:6)(1:7)|8)|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x00e8 */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9077n(p115m4.C10775p r5, java.lang.String r6) {
            /*
                r4 = this;
                british.x.t_video_exoplayer r5 = british.p015x.t_video_exoplayer.this
                r5.invalidateOptionsMenu()
                british.x.t_video_exoplayer r5 = british.p015x.t_video_exoplayer.this
                android.os.Bundle r5 = r5.f10082C
                java.lang.String r6 = "url"
                java.lang.String r5 = r5.getString(r6)
                com.google.android.gms.cast.MediaMetadata r6 = new com.google.android.gms.cast.MediaMetadata
                r0 = 1
                r6.<init>(r0)
                british.x.t_video_exoplayer r1 = british.p015x.t_video_exoplayer.this
                british.x.config r2 = r1.f10080B
                british.x.l[] r2 = r2.f7231O1
                int r1 = r1.f10102M
                r1 = r2[r1]
                java.lang.String r1 = r1.f7898a
                java.lang.String r2 = "com.google.android.gms.cast.metadata.TITLE"
                r6.mo29283J0(r2, r1)
                british.x.t_video_exoplayer r1 = british.p015x.t_video_exoplayer.this
                british.x.config r2 = r1.f10080B
                british.x.l[] r2 = r2.f7231O1
                int r1 = r1.f10102M
                r3 = r2[r1]
                boolean r3 = r3.f7871M0
                if (r3 != 0) goto L_0x00aa
                r3 = r2[r1]
                android.graphics.Bitmap r3 = r3.f7869L0
                if (r3 == 0) goto L_0x00aa
                r1 = r2[r1]
                int r1 = r1.f7875O0
                if (r1 != 0) goto L_0x0077
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = british.p015x.C1692config.f7108H5
                r1.append(r2)
                java.lang.String r2 = "/srv/imgs/seccs/"
                r1.append(r2)
                british.x.t_video_exoplayer r2 = british.p015x.t_video_exoplayer.this
                british.x.config r3 = r2.f10080B
                british.x.l[] r3 = r3.f7231O1
                int r2 = r2.f10102M
                r2 = r3[r2]
                int r2 = r2.f7964y
                r1.append(r2)
                java.lang.String r2 = "_ico.png?v="
                r1.append(r2)
                british.x.t_video_exoplayer r2 = british.p015x.t_video_exoplayer.this
                british.x.config r3 = r2.f10080B
                british.x.l[] r3 = r3.f7231O1
                int r2 = r2.f10102M
                r2 = r3[r2]
                int r2 = r2.f7877P0
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                goto L_0x009e
            L_0x0077:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = british.p015x.C1692config.f7108H5
                r1.append(r2)
                java.lang.String r2 = "/android-app-creator/icos_secc/"
                r1.append(r2)
                british.x.t_video_exoplayer r2 = british.p015x.t_video_exoplayer.this
                british.x.config r3 = r2.f10080B
                british.x.l[] r3 = r3.f7231O1
                int r2 = r2.f10102M
                r2 = r3[r2]
                int r2 = r2.f7875O0
                r1.append(r2)
                java.lang.String r2 = ".png"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
            L_0x009e:
                android.net.Uri r1 = android.net.Uri.parse(r1)
                com.google.android.gms.common.images.WebImage r2 = new com.google.android.gms.common.images.WebImage
                r2.<init>((android.net.Uri) r1)
                r6.mo29276C0(r2)
            L_0x00aa:
                com.google.android.gms.cast.MediaInfo$a r1 = new com.google.android.gms.cast.MediaInfo$a
                r1.<init>(r5)
                r5 = 0
                com.google.android.gms.cast.MediaInfo$a r1 = r1.mo29242d(r5)
                java.lang.String r2 = "video/*"
                com.google.android.gms.cast.MediaInfo$a r1 = r1.mo29240b(r2)
                com.google.android.gms.cast.MediaInfo$a r6 = r1.mo29241c(r6)
                com.google.android.gms.cast.MediaInfo r6 = r6.mo29239a()
                british.x.t_video_exoplayer r1 = british.p015x.t_video_exoplayer.this     // Catch:{ Exception -> 0x00eb }
                m4.q r2 = r1.f10131b1     // Catch:{ Exception -> 0x00eb }
                m4.d r2 = r2.mo42953d()     // Catch:{ Exception -> 0x00eb }
                r1.f10130a1 = r2     // Catch:{ Exception -> 0x00eb }
                british.x.t_video_exoplayer r1 = british.p015x.t_video_exoplayer.this     // Catch:{ Exception -> 0x00eb }
                m4.d r1 = r1.f10130a1     // Catch:{ Exception -> 0x00eb }
                com.google.android.gms.cast.framework.media.e r1 = r1.mo22550q()     // Catch:{ Exception -> 0x00eb }
                british.x.t_video_exoplayer$s$a r2 = new british.x.t_video_exoplayer$s$a     // Catch:{ Exception -> 0x00eb }
                r2.<init>(r1)     // Catch:{ Exception -> 0x00eb }
                r1.mo17837b(r2)     // Catch:{ Exception -> 0x00eb }
                british.x.t_video_exoplayer r2 = british.p015x.t_video_exoplayer.this     // Catch:{ Exception -> 0x00e8 }
                com.google.android.exoplayer2.SimpleExoPlayer r2 = r2.f10096J     // Catch:{ Exception -> 0x00e8 }
                r2.setPlayWhenReady(r5)     // Catch:{ Exception -> 0x00e8 }
            L_0x00e8:
                r1.mo17858w(r6, r0)     // Catch:{ Exception -> 0x00eb }
            L_0x00eb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_video_exoplayer.C2533s.mo9077n(m4.p, java.lang.String):void");
        }

        /* renamed from: o */
        public void mo9078o(C10775p pVar, int i) {
        }
    }

    /* renamed from: british.x.t_video_exoplayer$t */
    private class C2535t extends AsyncTask<String, Void, String> {

        /* renamed from: british.x.t_video_exoplayer$t$a */
        class C2536a implements View.OnClickListener {
            C2536a() {
            }

            public void onClick(View view) {
                t_video_exoplayer.this.findViewById(R.id.ll_btns).setVisibility(8);
                t_video_exoplayer.this.m9025Y();
            }
        }

        private C2535t() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0080  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007c }
                r0.<init>()     // Catch:{ Exception -> 0x007c }
                java.lang.String r1 = "https://global.appnext.com/offerWallApi.aspx?id="
                r0.append(r1)     // Catch:{ Exception -> 0x007c }
                british.x.t_video_exoplayer r1 = british.p015x.t_video_exoplayer.this     // Catch:{ Exception -> 0x007c }
                british.x.config r1 = r1.f10080B     // Catch:{ Exception -> 0x007c }
                java.lang.String r1 = r1.f7274V2     // Catch:{ Exception -> 0x007c }
                r0.append(r1)     // Catch:{ Exception -> 0x007c }
                java.lang.String r1 = "&type=vast&vast_ver=3.0&duration=all&packageId="
                r0.append(r1)     // Catch:{ Exception -> 0x007c }
                british.x.t_video_exoplayer r1 = british.p015x.t_video_exoplayer.this     // Catch:{ Exception -> 0x007c }
                java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x007c }
                r0.append(r1)     // Catch:{ Exception -> 0x007c }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x007c }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x007c }
                r1.<init>(r0)     // Catch:{ Exception -> 0x007c }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x007c }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x007c }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                r2.<init>(r6)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                r6.<init>()     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            L_0x0050:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                if (r2 == 0) goto L_0x006b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                r3.<init>()     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                r3.append(r2)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                r6.append(r2)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                goto L_0x0050
            L_0x006b:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
                r0.disconnect()
                return r6
            L_0x0073:
                r6 = move-exception
                goto L_0x0084
            L_0x0075:
                r6 = r0
                goto L_0x007c
            L_0x0077:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x0084
            L_0x007c:
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x0083
                r6.disconnect()
            L_0x0083:
                return r0
            L_0x0084:
                if (r0 == 0) goto L_0x0089
                r0.disconnect()
            L_0x0089:
                goto L_0x008b
            L_0x008a:
                throw r6
            L_0x008b:
                goto L_0x008a
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_video_exoplayer.C2535t.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x008b  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.String r7) {
            /*
                r6 = this;
                java.lang.String r0 = "<Ad id="
                boolean r0 = r7.contains(r0)
                r1 = 1
                if (r0 == 0) goto L_0x0055
                java.lang.String r0 = "<Impression><![CDATA["
                int r0 = r7.indexOf(r0)
                r2 = -1
                if (r0 == r2) goto L_0x0055
                int r0 = r0 + 21
                java.lang.String r3 = "]"
                int r4 = r7.indexOf(r3, r0)
                british.x.t_video_exoplayer r5 = british.p015x.t_video_exoplayer.this
                java.lang.String r0 = r7.substring(r0, r4)
                r5.f10116T = r0
                java.lang.String r0 = "<ClickThrough><![CDATA["
                int r0 = r7.indexOf(r0)
                if (r0 == r2) goto L_0x0055
                int r0 = r0 + 23
                int r4 = r7.indexOf(r3, r0)
                british.x.t_video_exoplayer r5 = british.p015x.t_video_exoplayer.this
                java.lang.String r0 = r7.substring(r0, r4)
                r5.f10118U = r0
                java.lang.String r0 = "width=\"320\" height=\"180\""
                int r0 = r7.indexOf(r0)
                if (r0 == r2) goto L_0x0055
                java.lang.String r4 = "><![CDATA["
                int r0 = r7.indexOf(r4, r0)
                if (r0 == r2) goto L_0x0055
                int r0 = r0 + 10
                int r2 = r7.indexOf(r3, r0)
                java.lang.String r7 = r7.substring(r0, r2)
                r0 = r7
                r7 = 1
                goto L_0x0058
            L_0x0055:
                r7 = 0
                java.lang.String r0 = ""
            L_0x0058:
                if (r7 == 0) goto L_0x008b
                android.net.Uri r7 = android.net.Uri.parse(r0)
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                r2 = 2131361958(0x7f0a00a6, float:1.8343683E38)
                android.view.View r0 = r0.findViewById(r2)
                british.x.t_video_exoplayer$t$a r2 = new british.x.t_video_exoplayer$t$a
                r2.<init>()
                r0.setOnClickListener(r2)
                com.google.android.exoplayer2.MediaItem r7 = com.google.android.exoplayer2.MediaItem.fromUri((android.net.Uri) r7)
                if (r7 == 0) goto L_0x0090
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                com.google.android.exoplayer2.SimpleExoPlayer r0 = r0.f10096J
                r0.setPlayWhenReady(r1)
                british.x.t_video_exoplayer r0 = british.p015x.t_video_exoplayer.this
                com.google.android.exoplayer2.SimpleExoPlayer r0 = r0.f10096J
                r0.setMediaItem(r7)
                british.x.t_video_exoplayer r7 = british.p015x.t_video_exoplayer.this
                com.google.android.exoplayer2.SimpleExoPlayer r7 = r7.f10096J
                r7.prepare()
                goto L_0x0090
            L_0x008b:
                british.x.t_video_exoplayer r7 = british.p015x.t_video_exoplayer.this
                r7.m9025Y()
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_video_exoplayer.C2535t.onPostExecute(java.lang.String):void");
        }
    }

    /* renamed from: british.x.t_video_exoplayer$u */
    private class C2537u extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        private String f10177a;

        /* renamed from: b */
        private String f10178b;

        /* renamed from: c */
        private int f10179c;

        /* renamed from: british.x.t_video_exoplayer$u$a */
        class C2538a implements DialogInterface.OnClickListener {
            C2538a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: british.x.t_video_exoplayer$u$b */
        class C2539b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f10182a;

            C2539b(AlertDialog alertDialog) {
                this.f10182a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f10182a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + t_video_exoplayer.this.f6668q));
                Button button2 = this.f10182a.getButton(-2);
                button2.setTextColor(Color.parseColor("#" + t_video_exoplayer.this.f6668q));
            }
        }

        public C2537u(String str, String str2, int i) {
            this.f10177a = str;
            this.f10178b = str2;
            this.f10179c = i;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00b3  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00af }
                r0.<init>()     // Catch:{ Exception -> 0x00af }
                java.lang.String r1 = british.p015x.C1692config.f7109I5     // Catch:{ Exception -> 0x00af }
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                java.lang.String r1 = "/srv/ultimas_frases.php?ver=1&idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                british.x.t_video_exoplayer r1 = british.p015x.t_video_exoplayer.this     // Catch:{ Exception -> 0x00af }
                long r1 = r1.f10137p0     // Catch:{ Exception -> 0x00af }
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                british.x.t_video_exoplayer r1 = british.p015x.t_video_exoplayer.this     // Catch:{ Exception -> 0x00af }
                java.lang.String r1 = r1.f10083C0     // Catch:{ Exception -> 0x00af }
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                java.lang.String r1 = "&idtema="
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                british.x.t_video_exoplayer r1 = british.p015x.t_video_exoplayer.this     // Catch:{ Exception -> 0x00af }
                int r1 = r1.f10138q0     // Catch:{ Exception -> 0x00af }
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                java.lang.String r1 = "&idf="
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                int r1 = r5.f10179c     // Catch:{ Exception -> 0x00af }
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                java.lang.String r1 = "&idprivado_finalizar=0&idconversante="
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                java.lang.String r1 = r5.f10178b     // Catch:{ Exception -> 0x00af }
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                java.lang.String r1 = "&externo=0"
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00af }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00af }
                r1.<init>(r0)     // Catch:{ Exception -> 0x00af }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x00af }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x00af }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                r2.<init>(r6)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                r6.<init>()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
            L_0x0083:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                if (r2 == 0) goto L_0x009e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                r3.<init>()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                r3.append(r2)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                r6.append(r2)     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                goto L_0x0083
            L_0x009e:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00a8, all -> 0x00a6 }
                r0.disconnect()
                return r6
            L_0x00a6:
                r6 = move-exception
                goto L_0x00b7
            L_0x00a8:
                r6 = r0
                goto L_0x00af
            L_0x00aa:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x00b7
            L_0x00af:
                java.lang.String r0 = "ANDROID:KO"
                if (r6 == 0) goto L_0x00b6
                r6.disconnect()
            L_0x00b6:
                return r0
            L_0x00b7:
                if (r0 == 0) goto L_0x00bc
                r0.disconnect()
            L_0x00bc:
                goto L_0x00be
            L_0x00bd:
                throw r6
            L_0x00be:
                goto L_0x00bd
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_video_exoplayer.C2537u.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            String str2;
            boolean z;
            int i;
            String str3;
            String str4 = str;
            if (this.f10179c != -1) {
                if (str4.indexOf("ANDROID:OK") != -1 || str4.indexOf("ANDROID:KO") != -1 || str4.indexOf("ANDROID:PERFILKO") != -1) {
                    if (str4.indexOf("ANDROID:PERFILKO") != -1) {
                        AlertDialog create = new AlertDialog.Builder(t_video_exoplayer.this).setPositiveButton(R.string.aceptar, new C2538a()).setMessage(R.string.perfil_desactivado).create();
                        if (!t_video_exoplayer.this.f6668q.equals("")) {
                            create.setOnShowListener(new C2539b(create));
                        }
                        create.show();
                        try {
                            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                        } catch (Exception unused) {
                        }
                    } else if (str4.indexOf("ANDROID:OK") != -1) {
                        int indexOf = str4.indexOf("@XYY53@");
                        String str5 = "";
                        String str6 = str5;
                        boolean z2 = false;
                        for (int i2 = -1; indexOf != i2; i2 = -1) {
                            int indexOf2 = str4.indexOf("@", indexOf + 1) + 1;
                            int indexOf3 = str4.indexOf("@", indexOf2);
                            String substring = str4.substring(indexOf2, indexOf3);
                            t_video_exoplayer.this.f10140s0 = Integer.parseInt(substring);
                            int i3 = indexOf3 + 1;
                            int indexOf4 = str4.indexOf("@", i3);
                            String substring2 = str4.substring(i3, indexOf4);
                            int i4 = indexOf4 + 1;
                            int indexOf5 = str4.indexOf("@", i4);
                            String substring3 = str4.substring(i4, indexOf5);
                            int i5 = indexOf5 + 1;
                            int indexOf6 = str4.indexOf("@", i5);
                            String substring4 = str4.substring(i5, indexOf6);
                            int i6 = indexOf6 + 1;
                            int indexOf7 = str4.indexOf("@", i6);
                            String substring5 = str4.substring(i6, indexOf7);
                            int i7 = indexOf7 + 1;
                            String str7 = substring5;
                            int indexOf8 = str4.indexOf("@", i7);
                            String substring6 = str4.substring(i7, indexOf8);
                            int i8 = indexOf8 + 1;
                            String str8 = substring6;
                            int indexOf9 = str4.indexOf("@", i8);
                            String substring7 = str4.substring(i8, indexOf9);
                            int i9 = indexOf9 + 1;
                            String str9 = substring7;
                            int indexOf10 = str4.indexOf("@", i9);
                            String substring8 = str4.substring(i9, indexOf10);
                            int i10 = indexOf10 + 1;
                            String str10 = substring8;
                            int indexOf11 = str4.indexOf("@", i10);
                            String substring9 = str4.substring(i10, indexOf11);
                            int i11 = indexOf11 + 1;
                            String str11 = substring9;
                            int indexOf12 = str4.indexOf("@", i11);
                            String substring10 = str4.substring(i11, indexOf12);
                            int i12 = indexOf12 + 1;
                            String str12 = substring10;
                            int indexOf13 = str4.indexOf("@", i12);
                            String substring11 = str4.substring(i12, indexOf13);
                            int i13 = indexOf13 + 1;
                            String str13 = substring11;
                            int indexOf14 = str4.indexOf("@", i13);
                            String substring12 = str4.substring(i13, indexOf14);
                            int i14 = indexOf14 + 1;
                            int indexOf15 = str4.indexOf("@", i14);
                            String substring13 = str4.substring(i14, indexOf15);
                            if (str5.equals("") || substring4.equals("") || !str5.equals(substring4) || str6.equals("") || substring2.equals("") || !str6.equals(substring2)) {
                                int indexOf16 = str4.indexOf("@XYY53@", indexOf15);
                                if (indexOf16 != -1) {
                                    int indexOf17 = str4.indexOf("@", str4.indexOf("@", indexOf16 + 1) + 1) + 1;
                                    str2 = str4.substring(indexOf17, str4.indexOf("@", indexOf17));
                                } else {
                                    str2 = "";
                                }
                                if (z2 || str4.indexOf("ZXRT4@1@") != -1) {
                                    z = z2;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    z = z2;
                                    sb.append(t_video_exoplayer.this.f10137p0);
                                    sb.append("");
                                    if (substring2.equals(sb.toString())) {
                                        int i15 = indexOf15;
                                        while (true) {
                                            int indexOf18 = str4.indexOf("@XYY53@", i15);
                                            if (indexOf18 != -1) {
                                                int indexOf19 = str4.indexOf("@", str4.indexOf("@", indexOf18 + 1) + 1) + 1;
                                                i = str4.indexOf("@", indexOf19);
                                                str3 = str4.substring(indexOf19, i);
                                            } else {
                                                i = i15;
                                                str3 = "";
                                            }
                                            if (str3.equals("")) {
                                                z2 = true;
                                                break;
                                            } else if (!str3.equals(substring2)) {
                                                z2 = false;
                                                break;
                                            } else {
                                                i15 = i;
                                            }
                                        }
                                        SharedPreferences.Editor edit = t_video_exoplayer.this.f10120V.edit();
                                        edit.putString("f2_idfrase", substring);
                                        edit.putString("f2_id", substring2);
                                        edit.putString("f2_idusu_prev", str2);
                                        edit.putBoolean("f2_mateixusu_hastafinal", z2);
                                        edit.putString("f2_nombre", substring3);
                                        edit.putString("f2_privados", str8);
                                        edit.putString("f2_frase", substring4);
                                        edit.putString("f2_fcrea", C1692config.m8200u(str9));
                                        edit.putString("f2_b64", "");
                                        edit.putString("f2_tipo", substring13);
                                        edit.putString("f2_b64_th", "");
                                        edit.putString("f2_idvideo", "");
                                        edit.putString("f2_formato", "");
                                        edit.putString("f2_idtema", t_video_exoplayer.this.f10138q0 + "");
                                        edit.putString("f2_vfoto", str7);
                                        edit.putString("f2_fnac_d", str10);
                                        edit.putString("f2_fnac_m", str11);
                                        edit.putString("f2_fnac_a", str12);
                                        edit.putString("f2_sexo", str13);
                                        edit.putString("f2_coments", substring12);
                                        edit.putBoolean("f2_ultimas", true);
                                        edit.putString("f2_ts", System.currentTimeMillis() + "");
                                        edit.commit();
                                        str6 = substring2;
                                        str5 = substring4;
                                    }
                                }
                                z2 = z;
                                SharedPreferences.Editor edit2 = t_video_exoplayer.this.f10120V.edit();
                                edit2.putString("f2_idfrase", substring);
                                edit2.putString("f2_id", substring2);
                                edit2.putString("f2_idusu_prev", str2);
                                edit2.putBoolean("f2_mateixusu_hastafinal", z2);
                                edit2.putString("f2_nombre", substring3);
                                edit2.putString("f2_privados", str8);
                                edit2.putString("f2_frase", substring4);
                                edit2.putString("f2_fcrea", C1692config.m8200u(str9));
                                edit2.putString("f2_b64", "");
                                edit2.putString("f2_tipo", substring13);
                                edit2.putString("f2_b64_th", "");
                                edit2.putString("f2_idvideo", "");
                                edit2.putString("f2_formato", "");
                                edit2.putString("f2_idtema", t_video_exoplayer.this.f10138q0 + "");
                                edit2.putString("f2_vfoto", str7);
                                edit2.putString("f2_fnac_d", str10);
                                edit2.putString("f2_fnac_m", str11);
                                edit2.putString("f2_fnac_a", str12);
                                edit2.putString("f2_sexo", str13);
                                edit2.putString("f2_coments", substring12);
                                edit2.putBoolean("f2_ultimas", true);
                                edit2.putString("f2_ts", System.currentTimeMillis() + "");
                                edit2.commit();
                                str6 = substring2;
                                str5 = substring4;
                            }
                            indexOf = str4.indexOf("@XYY53@", indexOf15);
                        }
                        if (str4.indexOf("ZXRT4@1@") == -1) {
                            t_video_exoplayer.this.mo9107e0();
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }
    }

    /* renamed from: british.x.t_video_exoplayer$v */
    private class C2540v extends AsyncTask<String, Void, String> {
        private C2540v() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            Iterator<String> it = t_video_exoplayer.this.f10129Z0.iterator();
            while (it.hasNext()) {
                try {
                    it.remove();
                    C12788b bVar = new C12788b();
                    C12789c.m54266h(bVar, 10000);
                    C12789c.m54267i(bVar, 20000);
                    C11188h hVar = new C11188h(bVar);
                    C12831e eVar = new C12831e(C1692config.f7107G5 + "gcm.e-droid.net/enviar_mensaje.php");
                    C12960g gVar = new C12960g(C12957d.BROWSER_COMPATIBLE);
                    gVar.mo48144c("v", new C12982f("4"));
                    gVar.mo48144c("idapp", new C12982f("2261075"));
                    gVar.mo48144c("idusu", new C12982f(t_video_exoplayer.this.f10137p0 + ""));
                    gVar.mo48144c("c", new C12982f(t_video_exoplayer.this.f10083C0));
                    gVar.mo48144c("idtema", new C12982f(t_video_exoplayer.this.f10138q0 + ""));
                    gVar.mo48144c("idusudest", new C12982f(SessionDescription.SUPPORTED_SDP_VERSION));
                    gVar.mo48144c("externo", new C12982f(SessionDescription.SUPPORTED_SDP_VERSION));
                    gVar.mo48144c("m", new C12982f(URLEncoder.encode(it.next(), C6540C.UTF8_NAME)));
                    eVar.mo47986B(gVar);
                    eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo43518a(eVar).mo47805b().mo43577k(), C6540C.UTF8_NAME));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                        }
                    }
                } catch (Exception unused) {
                    return "KO";
                }
            }
            return "OK";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (str.equals("OK") && t_video_exoplayer.this.f10129Z0.size() > 0) {
                t_video_exoplayer t_video_exoplayer = t_video_exoplayer.this;
                t_video_exoplayer.f10117T0 = new C2540v();
                t_video_exoplayer.this.f10117T0.execute(new String[0]);
            }
        }
    }

    /* renamed from: british.x.t_video_exoplayer$w */
    private class C2541w extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f10185a;

        /* renamed from: b */
        String f10186b;

        /* renamed from: c */
        Bitmap f10187c;

        private C2541w() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r5) {
            /*
                r4 = this;
                java.lang.String r5 = r4.f10185a
                java.lang.String r0 = "0"
                if (r5 == 0) goto L_0x008c
                java.lang.String r5 = r4.f10186b
                if (r5 != 0) goto L_0x000c
                goto L_0x008c
            L_0x000c:
                java.net.URL r5 = new java.net.URL     // Catch:{  }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
                r1.<init>()     // Catch:{  }
                java.lang.String r2 = british.p015x.C1692config.f7108H5     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "/srv/imgs/usus/"
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f10185a     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "_1_p.jpg?v="
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f10186b     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r1 = r1.toString()     // Catch:{  }
                r5.<init>(r1)     // Catch:{  }
                java.net.URLConnection r5 = r5.openConnection()     // Catch:{ MalformedURLException -> 0x008c }
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ MalformedURLException -> 0x008c }
                r1 = 1
                r5.setDoInput(r1)     // Catch:{ MalformedURLException -> 0x008c }
                r1 = 10000(0x2710, float:1.4013E-41)
                r5.setConnectTimeout(r1)     // Catch:{ MalformedURLException -> 0x008c }
                r1 = 20000(0x4e20, float:2.8026E-41)
                r5.setReadTimeout(r1)     // Catch:{ MalformedURLException -> 0x008c }
                r5.connect()     // Catch:{ MalformedURLException -> 0x008c }
                java.io.InputStream r1 = r5.getInputStream()     // Catch:{ MalformedURLException -> 0x008c }
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ MalformedURLException -> 0x008c }
                r4.f10187c = r2     // Catch:{ MalformedURLException -> 0x008c }
                r1.close()     // Catch:{ MalformedURLException -> 0x008c }
                r5.disconnect()     // Catch:{ MalformedURLException -> 0x008c }
                java.io.File r5 = new java.io.File     // Catch:{ MalformedURLException -> 0x008c }
                british.x.t_video_exoplayer r1 = british.p015x.t_video_exoplayer.this     // Catch:{ MalformedURLException -> 0x008c }
                java.io.File r1 = r1.f10121V0     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x008c }
                r2.<init>()     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.String r3 = "fperfil_"
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.String r3 = r4.f10185a     // Catch:{ MalformedURLException -> 0x008c }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.String r3 = ".jpg"
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.String r2 = r2.toString()     // Catch:{ MalformedURLException -> 0x008c }
                r5.<init>(r1, r2)     // Catch:{ MalformedURLException -> 0x008c }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{  }
                r1.<init>(r5)     // Catch:{  }
                android.graphics.Bitmap r5 = r4.f10187c     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{  }
                r3 = 70
                r5.compress(r2, r3, r1)     // Catch:{  }
                java.lang.String r5 = "1"
                return r5
            L_0x008c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_video_exoplayer.C2541w.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            HashMap<String, Bitmap> hashMap = t_video_exoplayer.this.f10109P0;
            if (hashMap != null) {
                if (str == IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) {
                    hashMap.put(this.f10185a, this.f10187c);
                    SharedPreferences.Editor edit = t_video_exoplayer.this.f10120V.edit();
                    edit.putString("fperfil_" + this.f10185a, t_video_exoplayer.this.f10113R0.get(this.f10185a));
                    edit.commit();
                }
                int childCount = t_video_exoplayer.this.f10101L0.getChildCount();
                int i = 0;
                while (i < childCount) {
                    try {
                        String str2 = (String) t_video_exoplayer.this.f10101L0.getChildAt(i).getTag();
                        if (str2 != null && str2.equals(this.f10185a)) {
                            t_video_exoplayer.this.f10101L0.getChildAt(i).findViewById(R.id.pb_foto).setVisibility(8);
                            t_video_exoplayer.this.f10101L0.getChildAt(i).findViewById(R.id.pb_foto_inv).setVisibility(8);
                            if (str == IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) {
                                ((ImageView) t_video_exoplayer.this.f10101L0.getChildAt(i).findViewById(R.id.iv_avatar_f)).setImageBitmap(this.f10187c);
                            }
                        }
                        i++;
                    } catch (Exception unused) {
                    }
                }
                if (!t_video_exoplayer.this.f10111Q0.equals("")) {
                    t_video_exoplayer t_video_exoplayer = t_video_exoplayer.this;
                    t_video_exoplayer.f10119U0 = new C2541w();
                    t_video_exoplayer.this.f10119U0.execute(new String[0]);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (t_video_exoplayer.this.f10111Q0.equals("")) {
                cancel(false);
                return;
            }
            try {
                this.f10185a = (String) t_video_exoplayer.this.f10111Q0.keySet().toArray()[0];
            } catch (Exception unused) {
                cancel(false);
            }
            String str = this.f10185a;
            if (str != null) {
                this.f10186b = t_video_exoplayer.this.f10111Q0.get(str);
                t_video_exoplayer t_video_exoplayer = t_video_exoplayer.this;
                HashMap<String, String> hashMap = t_video_exoplayer.f10113R0;
                String str2 = this.f10185a;
                hashMap.put(str2, t_video_exoplayer.f10111Q0.get(str2));
                t_video_exoplayer.this.f10111Q0.remove(this.f10185a);
            }
        }
    }

    /* renamed from: V */
    private void m9022V(boolean z) {
        int i = 0;
        if (z) {
            findViewById(R.id.btn_verchat).setVisibility(8);
            findViewById(R.id.ll_ad).setVisibility(8);
            findViewById(R.id.navigation_b).setVisibility(8);
            ((ViewGroup) findViewById(R.id.ll_princ)).getChildAt(0).setVisibility(8);
            ((PlayerControlView) this.f10098K.findViewById(R.id.exo_controller)).hide();
        } else {
            if (this.f10135n0) {
                findViewById(R.id.btn_verchat).setVisibility(0);
            }
            if (C1692config.f7115O5.length > 0) {
                findViewById(R.id.navigation_b).setVisibility(0);
            }
            if (this.f10108P != -1) {
                findViewById(R.id.ll_ad).setVisibility(this.f10108P);
            }
            if (this.f10080B.f7427t4 != 3) {
                ((ViewGroup) findViewById(R.id.ll_princ)).getChildAt(0).setVisibility(0);
            }
            ((PlayerControlView) this.f10098K.findViewById(R.id.exo_controller)).show();
        }
        boolean z2 = true;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 16) {
            z2 = ViewConfiguration.get(this).hasPermanentMenuKey();
        }
        if (!z2) {
            if (z) {
                i = 1798;
                if (i2 > 18) {
                    i = 5894;
                }
            }
            getWindow().getDecorView().setSystemUiVisibility(i);
        } else if (z) {
            getWindow().setFlags(1024, 1024);
        } else {
            getWindow().clearFlags(1024);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m9023W() {
        C1603c cVar;
        try {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(((TextView) findViewById(R.id.c_mensaje)).getWindowToken(), 0);
        } catch (Exception unused) {
        }
        findViewById(R.id.sv_chat).setVisibility(8);
        this.f10098K.setControllerAutoShow(true);
        if (!this.f10080B.f7279W1 && (cVar = this.f10084D) != null && cVar.f6886a != null) {
            if (((LinearLayout) findViewById(R.id.ll_ad)).getChildCount() > 0) {
                findViewById(R.id.ll_ad).setVisibility(0);
            }
            View findViewWithTag = findViewById(R.id.ll_princ).findViewWithTag(Integer.valueOf(R.id.TAG_ESBANNER));
            if (findViewWithTag != null) {
                findViewWithTag.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m9024X() {
        if (!this.f10112R && this.f10104N.booleanValue()) {
            Boolean bool = Boolean.FALSE;
            this.f10104N = bool;
            m9022V(bool.booleanValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m9025Y() {
        MediaItem mediaItem;
        this.f10112R = false;
        this.f10098K.setControllerAutoShow(true);
        this.f10110Q = Uri.parse(this.f10082C.getString("url"));
        if (this.f10080B.f7347h5) {
            setRequestedOrientation(0);
        }
        if (this.f10080B.f7341g5) {
            m9031g0();
        }
        findViewById(R.id.pb_video).setVisibility(0);
        if (this.f10114S) {
            Uri uri = null;
            try {
                uri = Uri.parse(URLDecoder.decode(this.f10080B.f7292Y2, C6540C.UTF8_NAME));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            mediaItem = new MediaItem.Builder().setUri(this.f10110Q).setAdTagUri(uri).build();
        } else {
            mediaItem = MediaItem.fromUri(this.f10110Q);
        }
        if (mediaItem != null) {
            this.f10096J.setPlayWhenReady(true);
            this.f10096J.setMediaItem(mediaItem);
            this.f10096J.prepare();
        }
    }

    /* renamed from: Z */
    private void m9026Z(Context context) {
        this.f6674w = new C2519g(context);
    }

    /* renamed from: a0 */
    private void m9027a0(boolean z) {
        String trim = ((TextView) findViewById(R.id.c_mensaje)).getText().toString().replace("@", "").trim();
        if (!trim.equals("")) {
            if (z && this.f10139r0 < 600) {
                ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(((TextView) findViewById(R.id.c_mensaje)).getWindowToken(), 0);
            }
            ((EditText) findViewById(R.id.c_mensaje)).setText("");
            SharedPreferences.Editor edit = this.f10120V.edit();
            edit.putString("f2_id", this.f10137p0 + "");
            edit.putString("f2_frase", trim);
            edit.putString("f2_fcrea", new SimpleDateFormat("ddMMyyHHmm").format(new Date()));
            edit.putString("f2_b64", "");
            edit.putString("f2_idfrase", SessionDescription.SUPPORTED_SDP_VERSION);
            edit.putString("f2_idtema", this.f10138q0 + "");
            edit.putString("f2_vfoto", SessionDescription.SUPPORTED_SDP_VERSION);
            edit.putBoolean("f2_ultimas", false);
            edit.putString("f2_ts", System.currentTimeMillis() + "");
            edit.commit();
            this.f10080B.mo7508i1(this);
            C1692config config = this.f10080B;
            SharedPreferences sharedPreferences = this.f10120V;
            config.mo7501e1(this, sharedPreferences, this.f10138q0 + "");
            this.f10129Z0.add(trim);
            C2540v vVar = this.f10117T0;
            if (vVar == null || vVar.getStatus() != AsyncTask.Status.RUNNING) {
                C2540v vVar2 = new C2540v();
                this.f10117T0 = vVar2;
                vVar2.execute(new String[0]);
            }
        }
    }

    /* renamed from: c0 */
    private void m9028c0() {
        FrameLayout frameLayout = (FrameLayout) ((PlayerControlView) this.f10098K.findViewById(R.id.exo_controller)).findViewById(R.id.exo_fullscreen_button);
        this.f10106O = frameLayout;
        frameLayout.setOnClickListener(new C2515c());
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ AdsLoader m9029d0(MediaItem.AdsConfiguration adsConfiguration) {
        return this.f10100L;
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m9030f0() {
        if (((LinearLayout) findViewById(R.id.ll_ad)).getChildCount() > 0) {
            findViewById(R.id.ll_ad).setVisibility(8);
        }
        View findViewWithTag = findViewById(R.id.ll_princ).findViewWithTag(Integer.valueOf(R.id.TAG_ESBANNER));
        if (findViewWithTag != null) {
            findViewWithTag.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m9031g0() {
        if (!this.f10112R && !this.f10104N.booleanValue()) {
            Boolean bool = Boolean.TRUE;
            this.f10104N = bool;
            m9022V(bool.booleanValue());
        }
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f10080B.mo7510j0(view, this);
        if (j0.f7843b) {
            this.f6669r = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", j0.f7844c);
            setResult(-1, intent);
        }
        if (j0.f7845d) {
            startActivityForResult(j0.f7842a, 0);
        } else {
            Intent intent2 = j0.f7842a;
            if (intent2 != null) {
                if (j0.f7843b) {
                    this.f6671t = false;
                    if (this.f10080B.f7427t4 != 2) {
                        intent2.putExtra("es_root", true);
                    }
                    try {
                        startActivity(j0.f7842a);
                    } catch (Exception unused) {
                    }
                } else {
                    startActivityForResult(intent2, 0);
                }
            }
        }
        if (this.f6669r && !this.f6670s) {
            finish();
        }
    }

    public void adError(String str) {
        this.f6673v.cancel();
        abrir_secc(this.f6672u);
    }

    public void adLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
        this.f6673v.cancel();
        this.f6675x.showAd();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void mo9106b0() {
        int q0 = this.f10080B.mo7522q0(this);
        int i = this.f10080B.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f10090G = listView;
            this.f10080B.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f10080B.f7231O1;
                if (i3 >= lVarArr.length) {
                    break;
                }
                if (!lVarArr[i3].f7848B) {
                    findViewById(i3).setOnClickListener(this);
                    i4++;
                    if (i4 == q0) {
                        break;
                    }
                }
                i3++;
            }
            if (findViewById(R.id.idaux9999) != null && findViewById(R.id.idaux9999).getVisibility() == 0) {
                findViewById(R.id.idaux9999).setOnClickListener(this);
            }
        }
        while (true) {
            int[] iArr = this.f10080B.f7249R1;
            if (i2 < iArr.length) {
                if (iArr[i2] > 0) {
                    findViewById(iArr[i2]).setOnClickListener(this);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void mo9107e0() {
        boolean z;
        if (!this.f10081B0.equals("")) {
            Date date = null;
            try {
                date = new SimpleDateFormat("ddMMyy").parse(this.f10081B0);
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
                z = false;
            }
            if (z) {
                TextView textView = new TextView(this);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                int i = this.f10127Y0;
                layoutParams.setMargins(0, i * 4, 0, i * 2);
                textView.setLayoutParams(layoutParams);
                int i2 = this.f10125X0;
                textView.setPadding(i2 * 2, i2, i2, i2);
                textView.setBackgroundColor(Color.parseColor("#CCEEEEEE"));
                textView.setTextSize(1, 13.0f);
                textView.setTypeface(Typeface.DEFAULT, 2);
                textView.setTextColor(-12303292);
                Calendar instance = Calendar.getInstance();
                Calendar instance2 = Calendar.getInstance();
                instance2.setTime(date);
                if (instance2.get(1) == instance.get(1) && instance2.get(6) == instance.get(6)) {
                    textView.setText(getResources().getString(R.string.hoy));
                } else {
                    textView.setText(DateFormat.getDateFormat(this).format(date));
                }
                this.f10101L0.addView(textView, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return;
        }
        if (intent == null || !intent.hasExtra("finalizar")) {
            if (intent != null && intent.hasExtra("idusu_ban")) {
                t_chat.m8709S(this, intent.getStringExtra("idusu_ban"));
            }
        } else if (intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f6671t = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    public void onAdClicked(C3371Ad ad) {
    }

    public void onAdClosed() {
        if (this.f10086E) {
            abrir_secc(this.f6672u);
        }
    }

    public void onAdLoaded(C3371Ad ad) {
        this.f6673v.cancel();
        this.f6676y.show();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onBackPressed() {
        if (findViewById(R.id.sv_chat).getVisibility() == 0) {
            m9023W();
        } else if (!this.f6671t || this.f10094I || !this.f10080B.f7365k5) {
            super.onBackPressed();
        } else {
            this.f10094I = true;
            C1692config.m8199t(this);
        }
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (view.getId() == R.id.btnemotic) {
            new C1824g((EditText) findViewById(R.id.c_mensaje), this).show();
        } else if (view.getId() == R.id.btnenv) {
            m9027a0(false);
        } else if ((view.getId() == R.id.ll_frase_txt || view.getId() == R.id.fl_frase) && ((View) view.getParent()).getTag(R.id.idaux1) != null && !((View) view.getParent()).getTag(R.id.idaux1).equals(SessionDescription.SUPPORTED_SDP_VERSION) && !((View) view.getParent()).getTag(R.id.idaux1).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
            View view2 = (View) view.getParent();
            Intent intent = new Intent(this, profile.class);
            intent.putExtra(TtmlNode.ATTR_ID, (String) view2.getTag(R.id.idaux1));
            intent.putExtra("privados", (String) view2.getTag(R.id.idaux2));
            intent.putExtra("nombre", (String) view2.getTag(R.id.idaux3));
            intent.putExtra("coments", (String) view2.getTag(R.id.idaux4));
            intent.putExtra("fnac_d", (String) view2.getTag(R.id.idaux5));
            intent.putExtra("fnac_m", (String) view2.getTag(R.id.idaux6));
            intent.putExtra("fnac_a", (String) view2.getTag(R.id.idaux7));
            intent.putExtra("sexo", (String) view2.getTag(R.id.idaux8));
            intent.putExtra("vfoto", (String) view2.getTag(R.id.idaux9));
            intent.putExtra("p_fnac", this.f10143v0);
            intent.putExtra("p_sexo", this.f10144w0);
            intent.putExtra("p_descr", this.f10145x0);
            intent.putExtra("p_dist", this.f10146y0);
            intent.putExtra("coments_chat", this.f10124X);
            intent.putExtra("galeria", this.f10126Y);
            intent.putExtra("privados_chat", this.f10122W);
            intent.putExtra("fotos_perfil", this.f10141t0);
            intent.putExtra("fotos_chat", this.f10142u0);
            startActivityForResult(intent, 0);
        } else {
            String str9 = this.f10080B.f7251R3;
            if ((str9 == null || str9.equals("")) && (((str = this.f10080B.f7281W3) == null || str.equals("")) && (((str2 = this.f10080B.f7250R2) == null || str2.equals("")) && (((str3 = this.f10080B.f7245Q3) == null || str3.equals("")) && (((str4 = this.f10080B.f7269U3) == null || str4.equals("")) && (((str5 = this.f10080B.f7275V3) == null || str5.equals("")) && (((str6 = this.f10080B.f7358j4) == null || str6.equals("")) && (((str7 = this.f10080B.f7287X3) == null || str7.equals("")) && ((str8 = this.f10080B.f7293Y3) == null || str8.equals("")))))))))) {
                abrir_secc(view);
                return;
            }
            String str10 = this.f10080B.f7251R3;
            if (str10 != null && !str10.equals("")) {
                this.f6675x = new RewardedVideo((Context) this, this.f10080B.f7251R3);
            }
            String str11 = this.f10080B.f7245Q3;
            if (str11 != null) {
                str11.equals("");
            }
            String str12 = this.f10080B.f7269U3;
            if (str12 != null && !str12.equals("")) {
                this.f6676y = new RewardedVideoAd(this, this.f10080B.f7269U3);
            }
            String str13 = this.f10080B.f7275V3;
            if (str13 != null && !str13.equals("")) {
                this.f6677z = new StartAppAd(this);
            }
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f6673v = progressDialog;
            this.f6672u = view;
            if (!this.f10080B.mo7494Z0(this, view, this.f6668q, progressDialog, this.f6674w, this.f6675x, this.f6676y, this.f6677z, this.f6667A, view)) {
                abrir_secc(view);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C1603c cVar;
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo9106b0();
        if (this.f10080B.f7427t4 == 1) {
            ((ImageView) findViewById(R.id.iv_drawer)).setOnClickListener(new C2516d());
            ((ImageView) findViewById(R.id.icohome)).setOnClickListener(new C2517e());
        }
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar2 = this.f10084D;
        if (!(cVar2 == null || (adView2 = cVar2.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar3 = this.f10084D;
        if (!(cVar3 == null || (adView = cVar3.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f10084D = this.f10080B.mo7474A0(this, false);
        if (findViewById(R.id.sv_chat).getVisibility() == 0 && !this.f10080B.f7279W1 && (cVar = this.f10084D) != null && cVar.f6886a != null) {
            m9030f0();
        }
        if (this.f10104N.booleanValue()) {
            findViewById(R.id.ll_ad).setVisibility(8);
            findViewById(R.id.navigation_b).setVisibility(8);
            ((ViewGroup) findViewById(R.id.ll_princ)).getChildAt(0).setVisibility(8);
        }
        if (this.f10112R) {
            new Handler().postDelayed(new C2518f(), 200);
        }
    }

    @TargetApi(14)
    public void onCreate(Bundle bundle) {
        DefaultMediaSourceFactory defaultMediaSourceFactory;
        C1692config config;
        int i;
        C1692config config2;
        int i2;
        Bundle bundle2 = bundle;
        C1692config config3 = (C1692config) getApplicationContext();
        this.f10080B = config3;
        if (config3.f7313c1 == null) {
            config3.mo7490V0();
        }
        setTheme(2131886558);
        m9026Z(this);
        this.f6667A = new C2523i();
        Bundle extras = getIntent().getExtras();
        this.f10082C = extras;
        boolean z = true;
        if (bundle2 == null) {
            this.f6671t = extras != null && extras.containsKey("es_root") && this.f10082C.getBoolean("es_root", false);
        } else {
            this.f6671t = bundle2.containsKey("es_root") && bundle2.getBoolean("es_root", false);
        }
        Bundle extras2 = getIntent().getExtras();
        this.f10082C = extras2;
        int i3 = extras2.getInt("ind");
        this.f10102M = i3;
        C1692config config4 = this.f10080B;
        this.f6668q = C1692config.m8189h(config4.f7231O1[i3].f7916g, config4.f7368l1);
        super.onCreate(bundle);
        setContentView((int) R.layout.t_video_exoplayer);
        mo9106b0();
        this.f10080B.mo7486N0(this, true);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C2524j());
        searchManager.setOnDismissListener(new C2525k());
        if (this.f10080B.f7427t4 == 1) {
            ((ImageView) findViewById(R.id.iv_drawer)).setOnClickListener(new C2526l());
            ((ImageView) findViewById(R.id.icohome)).setOnClickListener(new C2527m());
        }
        C1692config config5 = this.f10080B;
        Bundle bundle3 = this.f10082C;
        boolean z2 = bundle3 != null && bundle3.containsKey("ad_entrar");
        Bundle bundle4 = this.f10082C;
        config5.mo7503f1(this, z2, bundle4 != null && bundle4.containsKey("fb_entrar"));
        this.f10084D = this.f10080B.mo7474A0(this, false);
        C1692config config6 = this.f10080B;
        config6.mo7488Q0(this, config6.f7318d, this.f6668q, bundle2);
        if (!this.f10080B.f7231O1[this.f10102M].f7916g.equals("")) {
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#" + this.f10080B.f7231O1[this.f10102M].f7916g), Color.parseColor("#" + this.f10080B.f7231O1[this.f10102M].f7919h)}));
        }
        this.f10092H = this.f10080B.f7231O1[this.f10102M].f7852D;
        String string = this.f10082C.getString("ua");
        this.f10088F = string;
        if (string.equals("")) {
            this.f10088F = Util.getUserAgent(this, "british.x");
        }
        if (Build.VERSION.SDK_INT > 20) {
            C1692config.m8168S0((ProgressBar) findViewById(R.id.pb_video), this.f6668q);
        }
        this.f10098K = (PlayerView) findViewById(R.id.vv);
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f10120V = sharedPreferences;
        int i4 = sharedPreferences.getInt("appnext_video_n", 0) + 1;
        SharedPreferences.Editor edit = this.f10120V.edit();
        edit.putInt("appnext_video_n", i4);
        edit.commit();
        if (!this.f10080B.f7292Y2.equals("") && i4 >= (i2 = config2.f7303a3) && (i4 - i2) % (config2 = this.f10080B).f7298Z2 == 0) {
            this.f10114S = true;
        }
        if (this.f10114S) {
            this.f10100L = new ImaAdsLoader.Builder(this).build();
        }
        DefaultDataSourceFactory defaultDataSourceFactory = new DefaultDataSourceFactory((Context) this, this.f10088F);
        if (this.f10114S) {
            defaultMediaSourceFactory = new DefaultMediaSourceFactory((DataSource.Factory) defaultDataSourceFactory).setAdsLoaderProvider(new C1596a3(this)).setAdViewProvider(this.f10098K);
        } else {
            defaultMediaSourceFactory = new DefaultMediaSourceFactory((DataSource.Factory) defaultDataSourceFactory);
        }
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector((Context) this);
        defaultTrackSelector.setParameters(defaultTrackSelector.buildUponParameters().setMaxVideoSizeSd());
        SimpleExoPlayer build = new SimpleExoPlayer.Builder(this).setTrackSelector(defaultTrackSelector).setMediaSourceFactory(defaultMediaSourceFactory).build();
        this.f10096J = build;
        this.f10098K.setPlayer(build);
        if (this.f10114S) {
            this.f10100L.setPlayer(this.f10096J);
        }
        this.f10098K.setControllerAutoShow(false);
        this.f10098K.hideController();
        this.f10098K.setOnTouchListener(new C2528n());
        if (this.f10092H) {
            this.f10098K.findViewById(R.id.exo_position).setVisibility(4);
            this.f10098K.findViewById(R.id.exo_progress).setVisibility(4);
            this.f10098K.findViewById(R.id.exo_duration).setVisibility(4);
        }
        m9028c0();
        if (this.f10080B.f7353i5) {
            findViewById(R.id.exo_cast_button).setVisibility(0);
            try {
                this.f10131b1 = C5758b.m25464e(this).mo22535c();
                C10739a.m48621b(getApplicationContext(), (MediaRouteButton) findViewById(R.id.vcv_img_cast));
            } catch (Exception unused) {
            }
        }
        if (this.f10080B.f7231O1[this.f10102M].f7862I) {
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.exo_download_button);
            frameLayout.setOnClickListener(new C2529o());
            frameLayout.setVisibility(0);
        }
        this.f10096J.addListener((Player.Listener) new C2530p());
        if (this.f10080B.f7274V2.equals("") || i4 < (i = config.f7286X2) || (i4 - i) % (config = this.f10080B).f7280W2 != 0) {
            m9025Y();
        } else {
            this.f10112R = true;
            new C2535t().execute(new String[0]);
        }
        C1692config config7 = this.f10080B;
        boolean z3 = config7.f7362k2;
        this.f10135n0 = z3;
        C1855l[] lVarArr = config7.f7231O1;
        int i5 = this.f10102M;
        this.f10105N0 = lVarArr[i5].f7916g;
        this.f10107O0 = lVarArr[i5].f7919h;
        if (z3) {
            this.f10136o0 = true;
            int i6 = config7.f7411r2;
            int i7 = config7.f7418s2;
            int i8 = config7.f7425t2;
            this.f10141t0 = config7.f7404q2;
            if (this.f10120V.getString("nick", "").equals("") || (this.f10080B.f7393o5 == 3 && !this.f10120V.getBoolean("email_confirmado", false))) {
                this.f10136o0 = false;
            } else if ((this.f10141t0 == 2 && !this.f10080B.mo7516l0(this, 1).exists()) || ((i6 == 2 && (this.f10120V.getInt("fnac_d", 0) == 0 || this.f10120V.getInt("fnac_m", 0) == 0 || this.f10120V.getInt("fnac_a", 0) == 0)) || ((i7 == 2 && this.f10120V.getInt("sexo", 0) == 0) || (i8 == 2 && this.f10120V.getString("descr", "").equals(""))))) {
                this.f10136o0 = false;
            }
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            if (Build.VERSION.SDK_INT >= 13) {
                Point point = new Point();
                defaultDisplay.getSize(point);
                this.f10139r0 = point.y;
            } else {
                this.f10139r0 = defaultDisplay.getHeight();
            }
            this.f10128Z = C1692config.m8153I("#" + this.f10080B.f7231O1[this.f10102M].f7916g);
            this.f10133l0 = C1692config.m8153I("#" + this.f10080B.f7231O1[this.f10102M].f7919h);
            C1692config config8 = this.f10080B;
            if (config8.f7338g2 > 0) {
                this.f10134m0 = true;
                if (!config8.f7356j2.equals("")) {
                    this.f10134m0 = C1692config.m8153I("#" + this.f10080B.f7356j2);
                }
            } else {
                this.f10134m0 = this.f10128Z;
            }
            try {
                this.f10138q0 = this.f10080B.f7231O1[this.f10102M].f7867K0[0].f8022a;
            } catch (Exception unused2) {
                this.f10138q0 = 0;
            }
            C1692config config9 = this.f10080B;
            this.f10141t0 = config9.f7404q2;
            this.f10122W = config9.f7376m2;
            this.f10124X = config9.f7383n2;
            this.f10126Y = config9.f7390o2;
            this.f10143v0 = config9.f7411r2;
            this.f10144w0 = config9.f7418s2;
            this.f10146y0 = config9.f7432u2;
            this.f10145x0 = config9.f7425t2;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i9 = displayMetrics.widthPixels;
            this.f10087E0 = i9;
            this.f10089F0 = displayMetrics.heightPixels;
            if (getResources().getConfiguration().orientation == 2) {
                i9 = this.f10089F0;
            }
            double d = (double) (i9 / 2);
            Double.isNaN(d);
            this.f10091G0 = (int) (d * 1.1d);
            double d2 = (double) i9;
            Double.isNaN(d2);
            this.f10093H0 = (int) (d2 * 0.8d);
            if (this.f10141t0 > 0) {
                int E = C1692config.m8149E(this, 50);
                this.f10091G0 -= E;
                this.f10093H0 -= E;
            }
            this.f10095I0 = C1692config.m8149E(this, 4);
            int i10 = this.f10080B.f7338g2;
            if (i10 == 1) {
                this.f10095I0 = C1692config.m8149E(this, 14);
            } else if (i10 == 2) {
                this.f10095I0 = C1692config.m8149E(this, 5);
            } else if (i10 == 3) {
                this.f10095I0 = C1692config.m8149E(this, 12);
            } else if (i10 == 4) {
                this.f10095I0 = C1692config.m8149E(this, 4);
            }
            this.f10097J0 = C1692config.m8149E(this, 3);
            this.f10099K0 = C1692config.m8149E(this, 10);
            if (!this.f10080B.f7291Y1) {
                findViewById(R.id.btnemotic).setVisibility(8);
            }
            this.f10123W0 = (int) ((getResources().getDisplayMetrics().density * 100.0f) + 0.5f);
            this.f10125X0 = (int) ((getResources().getDisplayMetrics().density * 3.0f) + 0.5f);
            this.f10127Y0 = (int) ((getResources().getDisplayMetrics().density * 3.0f) + 0.5f);
            this.f10121V0 = getFilesDir();
            this.f10147z0 = 0;
            this.f10081B0 = "";
            this.f10079A0 = "";
            this.f10085D0 = false;
            SharedPreferences sharedPreferences2 = getSharedPreferences("sh", 0);
            this.f10120V = sharedPreferences2;
            this.f10137p0 = sharedPreferences2.getLong("idusu", 0);
            this.f10083C0 = this.f10120V.getString("cod", "");
            this.f10101L0 = (LinearLayout) findViewById(R.id.llchat);
            this.f10103M0 = (ProgressBar) findViewById(R.id.pb_chat_env_inv);
            if (!this.f10105N0.equals("")) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 > 20) {
                    C1692config.m8150F((EditText) findViewById(R.id.c_mensaje), Boolean.valueOf(!this.f10128Z), this.f6668q);
                } else {
                    ((EditText) findViewById(R.id.c_mensaje)).setTextColor(-1);
                }
                if (!this.f10133l0) {
                    ((ImageView) findViewById(R.id.btnemotic)).setImageDrawable(getResources().getDrawable(R.drawable.emoticono_sel_light));
                    if (i11 > 12) {
                        this.f10103M0 = (ProgressBar) findViewById(R.id.pb_chat_env);
                    }
                }
                if (i11 > 20) {
                    C1692config.m8168S0(this.f10103M0, this.f6668q);
                }
                if (C1692config.m8153I("#" + this.f6668q)) {
                    findViewById(R.id.iv_btn_fondo_n).setVisibility(0);
                } else {
                    findViewById(R.id.iv_btn_fondo_b).setVisibility(0);
                }
                Drawable drawable = getResources().getDrawable(R.drawable.btn_enviar);
                if (!this.f6668q.equals("")) {
                    drawable.setColorFilter(Color.parseColor("#" + this.f6668q), PorterDuff.Mode.MULTIPLY);
                }
                ((ImageView) findViewById(R.id.btnenv)).setImageDrawable(drawable);
            }
            findViewById(R.id.btnemotic).setOnClickListener(this);
            findViewById(R.id.btnenv).setOnClickListener(this);
            findViewById(R.id.c_mensaje).setOnKeyListener(this);
            findViewById(R.id.rl_chat).setOnClickListener(new C2531q());
            findViewById(R.id.btn_verchat).setOnClickListener(new C2511a());
            findViewById(R.id.btn_verchat).setVisibility(0);
            this.f10109P0 = new HashMap<>();
            this.f10111Q0 = new HashMap<>();
            this.f10113R0 = new HashMap<>();
            this.f10115S0 = null;
            try {
                if (this.f10134m0) {
                    this.f10115S0 = BitmapFactory.decodeResource(getResources(), R.drawable.sinfoto_light);
                } else {
                    this.f10115S0 = BitmapFactory.decodeResource(getResources(), R.drawable.sinfoto);
                }
            } catch (OutOfMemoryError unused3) {
            }
            if (this.f10141t0 > 0) {
                File l0 = this.f10080B.mo7516l0(this, 1);
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(l0.getPath(), options);
                    int i12 = options.outWidth;
                    int i13 = options.outHeight;
                    if (i12 > 75 || i13 > 100) {
                        z = false;
                    }
                    if (!z) {
                        int round = Math.round(((float) i12) / ((float) C1692config.m8193n(i12, i13, 75, 100)));
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = round;
                        this.f10115S0 = BitmapFactory.decodeFile(l0.getPath(), options2);
                    } else {
                        this.f10115S0 = MediaStore.Images.Media.getBitmap(getContentResolver(), Uri.fromFile(l0));
                    }
                } catch (Exception unused4) {
                }
            }
            this.f10140s0 = 0;
            if (this.f10136o0) {
                new C2537u(SessionDescription.SUPPORTED_SDP_VERSION, SessionDescription.SUPPORTED_SDP_VERSION, this.f10140s0).execute(new String[0]);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(1:6)|7|(1:13)|14|(1:20)|21|22|23|24|26|(2:30|31)|33|(1:39)|40|41) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r2 = this;
            british.x.config r0 = r2.f10080B
            int r0 = r0.f7384n3
            if (r0 == 0) goto L_0x0011
            british.x.c r0 = r2.f10084D
            if (r0 == 0) goto L_0x0011
            com.google.android.gms.ads.AdView r0 = r0.f6886a
            if (r0 == 0) goto L_0x0011
            r0.destroy()
        L_0x0011:
            british.x.config r0 = r2.f10080B
            int r0 = r0.f7384n3
            if (r0 == 0) goto L_0x0022
            british.x.c r0 = r2.f10084D
            if (r0 == 0) goto L_0x0022
            com.facebook.ads.AdView r0 = r0.f6887b
            if (r0 == 0) goto L_0x0022
            r0.destroy()
        L_0x0022:
            british.x.config r0 = r2.f10080B
            int r0 = r0.f7384n3
            if (r0 == 0) goto L_0x0033
            british.x.c r0 = r2.f10084D
            if (r0 == 0) goto L_0x0033
            com.adcolony.sdk.AdColonyAdView r0 = r0.f6889d
            if (r0 == 0) goto L_0x0033
            r0.destroy()
        L_0x0033:
            com.google.android.exoplayer2.ext.ima.ImaAdsLoader r0 = r2.f10100L     // Catch:{ Exception -> 0x0039 }
            r1 = 0
            r0.setPlayer(r1)     // Catch:{ Exception -> 0x0039 }
        L_0x0039:
            com.google.android.exoplayer2.SimpleExoPlayer r0 = r2.f10096J     // Catch:{ Exception -> 0x003f }
            r0.release()     // Catch:{ Exception -> 0x003f }
            goto L_0x0040
        L_0x003f:
        L_0x0040:
            boolean r0 = r2.f10135n0
            if (r0 == 0) goto L_0x004f
            boolean r0 = r2.f10136o0
            if (r0 == 0) goto L_0x004f
            android.content.SharedPreferences r0 = r2.f10120V     // Catch:{ Exception -> 0x004e }
            r0.unregisterOnSharedPreferenceChangeListener(r2)     // Catch:{ Exception -> 0x004e }
            goto L_0x004f
        L_0x004e:
        L_0x004f:
            boolean r0 = r2.f6671t
            if (r0 == 0) goto L_0x0059
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x005d
        L_0x0059:
            boolean r0 = british.p015x.C1692config.f7111K5
            if (r0 == 0) goto L_0x0060
        L_0x005d:
            british.p015x.C1692config.m8176Z(r2)
        L_0x0060:
            super.onDestroy()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_video_exoplayer.onDestroy():void");
    }

    public void onError(C3371Ad ad, com.facebook.ads.AdError adError) {
        this.f6673v.cancel();
        abrir_secc(this.f6672u);
    }

    public void onFailedToReceiveAd(C5041Ad ad) {
        this.f6673v.cancel();
        abrir_secc(this.f6672u);
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 66) {
            return false;
        }
        m9027a0(true);
        return true;
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f10080B.f7384n3 == 0 || (cVar = this.f10084D) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
        try {
            this.f10096J.setPlayWhenReady(false);
        } catch (Exception unused) {
        }
        if (this.f10080B.f7353i5) {
            try {
                C10777q qVar = this.f10131b1;
                if (qVar != null) {
                    qVar.mo42955f(this.f10132c1);
                }
                this.f10130a1 = null;
            } catch (Exception unused2) {
            }
        }
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6673v.cancel();
        this.f6677z.showAd("REWARDED VIDEO", new C2522h());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        C10777q qVar;
        try {
            if (this.f10080B.f7353i5 && (qVar = this.f10131b1) != null) {
                this.f10130a1 = qVar.mo42953d();
                this.f10131b1.mo42950a(this.f10132c1);
            }
        } catch (Exception unused) {
        }
        super.onResume();
        C1692config.m8164P0(this);
        C5759d dVar = this.f10130a1;
        if (dVar == null || !dVar.mo42943c()) {
            try {
                this.f10096J.setPlayWhenReady(true);
            } catch (Exception unused2) {
            }
        }
        if (!(this.f10080B.f7384n3 == 0 || (cVar = this.f10084D) == null || (adView = cVar.f6886a) == null)) {
            adView.resume();
        }
        if (this.f10108P == -1) {
            this.f10108P = findViewById(R.id.ll_ad).getVisibility();
            if (this.f10080B.f7341g5) {
                m9031g0();
            }
        }
        if (this.f10135n0 && this.f10136o0) {
            this.f10120V.registerOnSharedPreferenceChangeListener(this);
        }
        SimpleExoPlayer simpleExoPlayer = this.f10096J;
        if (simpleExoPlayer == null) {
            return;
        }
        if (simpleExoPlayer.isPlaying() || (this.f10096J.getPlayWhenReady() && this.f10096J.getPlaybackState() == 3)) {
            findViewById(R.id.pb_video).setVisibility(8);
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f10086E = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f10086E) {
            abrir_secc(this.f6672u);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f10086E = true;
        C1692config.m8175Y0(this);
    }

    public boolean onSearchRequested() {
        this.f6669r = true;
        this.f6670s = true;
        return super.onSearchRequested();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (sharedPreferences.contains("f2_idfrase") && str.equals("f2_ts")) {
            SharedPreferences sharedPreferences2 = this.f10120V;
            if (!sharedPreferences2.contains("ban_" + sharedPreferences.getString("f2_id", ""))) {
                String string = sharedPreferences.getString("f2_idtema", SessionDescription.SUPPORTED_SDP_VERSION);
                if (string.equals(this.f10138q0 + "")) {
                    runOnUiThread(new C2512b(sharedPreferences));
                }
            }
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f6669r && !this.f6670s) {
            finish();
        }
    }

    public void onVideoCompleted() {
        this.f10086E = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f10086E = true;
        C1692config.m8175Y0(this);
    }
}
