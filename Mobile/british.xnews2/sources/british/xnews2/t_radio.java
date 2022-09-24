package british.xnews2;

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
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.adcolony.sdk.AdColonyAdView;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyReward;
import com.adcolony.sdk.AdColonyRewardListener;
import com.adcolony.sdk.AdColonyZone;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.banners.BannerAdRequest;
import com.appnext.banners.BannerSize;
import com.appnext.banners.BannerView;
import com.appnext.core.AppnextAdCreativeType;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnVideoEnded;
import com.facebook.ads.C3371Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p039ts.TsExtractor;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.ads.banner.Mrec;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.VideoListener;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p272b9.C11188h;
import p312i9.C12788b;
import p312i9.C12789c;
import p317l8.C12831e;
import p337x8.C12957d;
import p337x8.C12960g;
import p339y8.C12982f;

public class t_radio extends Activity_ext_class implements C1592a, View.OnKeyListener, View.OnClickListener, MediaController.MediaPlayerControl, SharedPreferences.OnSharedPreferenceChangeListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    ListView f9691A;

    /* renamed from: A0 */
    HashMap<String, String> f9692A0;

    /* renamed from: B */
    int f9693B;

    /* renamed from: B0 */
    Bitmap f9694B0;

    /* renamed from: C */
    boolean f9695C = false;

    /* renamed from: C0 */
    C2425m f9696C0;

    /* renamed from: D */
    boolean f9697D = false;

    /* renamed from: D0 */
    C2426n f9698D0;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public MediaController f9699E;

    /* renamed from: E0 */
    File f9700E0;

    /* renamed from: F */
    boolean f9701F;

    /* renamed from: F0 */
    private int f9702F0;

    /* renamed from: G */
    boolean f9703G;

    /* renamed from: G0 */
    private int f9704G0;

    /* renamed from: H */
    boolean f9705H;

    /* renamed from: H0 */
    private int f9706H0;

    /* renamed from: I */
    boolean f9707I;

    /* renamed from: I0 */
    List<String> f9708I0 = new ArrayList();

    /* renamed from: J */
    boolean f9709J;

    /* renamed from: K */
    boolean f9710K;

    /* renamed from: L */
    boolean f9711L;

    /* renamed from: M */
    boolean f9712M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public long f9713N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public int f9714O;

    /* renamed from: P */
    private int f9715P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public int f9716Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public int f9717R;

    /* renamed from: S */
    private int f9718S;

    /* renamed from: T */
    private int f9719T;

    /* renamed from: U */
    private int f9720U;

    /* renamed from: V */
    private int f9721V;

    /* renamed from: W */
    private int f9722W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public int f9723X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public String f9724Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public String f9725Z;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public String f9726l0;

    /* renamed from: m */
    C1692config f9727m;

    /* renamed from: m0 */
    boolean f9728m0 = false;

    /* renamed from: n */
    Bundle f9729n;

    /* renamed from: n0 */
    int f9730n0;

    /* renamed from: o */
    C1603c f9731o;

    /* renamed from: o0 */
    int f9732o0;

    /* renamed from: p */
    boolean f9733p = false;

    /* renamed from: p0 */
    int f9734p0;

    /* renamed from: q */
    boolean f9735q;

    /* renamed from: q0 */
    int f9736q0;

    /* renamed from: r */
    int f9737r;

    /* renamed from: r0 */
    int f9738r0;

    /* renamed from: s */
    TextView f9739s;

    /* renamed from: s0 */
    int f9740s0;

    /* renamed from: t */
    TextView f9741t;

    /* renamed from: t0 */
    int f9742t0;

    /* renamed from: u */
    BannerView f9743u;

    /* renamed from: u0 */
    LinearLayout f9744u0;

    /* renamed from: v */
    AdView f9745v;

    /* renamed from: v0 */
    ProgressBar f9746v0;

    /* renamed from: w */
    com.facebook.ads.AdView f9747w;

    /* renamed from: w0 */
    String f9748w0;

    /* renamed from: x */
    SharedPreferences f9749x;

    /* renamed from: x0 */
    String f9750x0;

    /* renamed from: y */
    SharedPreferences f9751y;

    /* renamed from: y0 */
    HashMap<String, Bitmap> f9752y0;

    /* renamed from: z */
    SharedPreferences f9753z;

    /* renamed from: z0 */
    HashMap<String, String> f9754z0;

    /* renamed from: british.xnews2.t_radio$a */
    class C2407a implements AdDisplayListener {
        C2407a() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_radio t_radio = t_radio.this;
            if (t_radio.f9733p) {
                t_radio.abrir_secc(t_radio.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.xnews2.t_radio$b */
    class C2408b extends AdColonyInterstitialListener {
        C2408b() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_radio t_radio = t_radio.this;
            if (t_radio.f9733p) {
                t_radio.abrir_secc(t_radio.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_radio.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_radio.this.f6661g.cancel();
            t_radio t_radio = t_radio.this;
            t_radio.abrir_secc(t_radio.f6660f);
        }
    }

    /* renamed from: british.xnews2.t_radio$c */
    class C2409c implements SearchManager.OnCancelListener {
        C2409c() {
        }

        public void onCancel() {
            t_radio t_radio = t_radio.this;
            t_radio.f6657c = false;
            t_radio.setResult(0);
        }
    }

    /* renamed from: british.xnews2.t_radio$d */
    class C2410d implements SearchManager.OnDismissListener {
        C2410d() {
        }

        public void onDismiss() {
            t_radio.this.f6658d = false;
        }
    }

    /* renamed from: british.xnews2.t_radio$e */
    class C2411e implements DrawerLayout.C0635d {
        C2411e() {
        }

        /* renamed from: a */
        public void mo3315a(View view) {
            t_radio.this.findViewById(R.id.ll_ad_rad).setVisibility(8);
            if (t_radio.this.f9699E != null) {
                t_radio.this.f9699E.hide();
            }
        }

        /* renamed from: b */
        public void mo3316b(View view) {
            t_radio t_radio = t_radio.this;
            if (t_radio.f9735q && t_radio.findViewById(R.id.sv_chat).getVisibility() == 8) {
                t_radio.this.findViewById(R.id.ll_ad_rad).setVisibility(0);
            }
            if (t_radio.this.f9699E != null) {
                t_radio.this.f9699E.show(0);
            }
        }

        /* renamed from: c */
        public void mo3317c(int i) {
        }

        /* renamed from: d */
        public void mo3318d(View view, float f) {
        }
    }

    /* renamed from: british.xnews2.t_radio$f */
    class C2412f implements View.OnClickListener {
        C2412f() {
        }

        public void onClick(View view) {
            if (t_radio.this.f9699E != null) {
                t_radio.this.f9699E.show(0);
            }
        }
    }

    /* renamed from: british.xnews2.t_radio$g */
    class C2413g implements View.OnClickListener {
        C2413g() {
        }

        public void onClick(View view) {
            t_radio.this.m8881o();
        }
    }

    /* renamed from: british.xnews2.t_radio$h */
    class C2414h implements View.OnClickListener {
        C2414h() {
        }

        public void onClick(View view) {
            C1603c cVar;
            t_radio t_radio = t_radio.this;
            if (!t_radio.f9712M) {
                Intent intent = new Intent(t_radio.this, chat_perfil.class);
                t_radio t_radio2 = t_radio.this;
                intent.putExtra("idsecc", t_radio2.f9727m.f7231O1[t_radio2.f9693B].f7964y);
                intent.putExtra("desde_radio", true);
                boolean z = t_radio.this.f6659e;
                if (z) {
                    intent.putExtra("es_root", z);
                }
                t_radio t_radio3 = t_radio.this;
                t_radio3.f6659e = false;
                t_radio3.f6657c = true;
                t_radio3.startActivityForResult(intent, 0);
            } else if (t_radio.findViewById(R.id.sv_chat).getVisibility() == 0) {
                t_radio.this.m8881o();
            } else {
                if (t_radio.this.f9699E != null) {
                    t_radio.this.f9699E.hide();
                }
                t_radio.this.findViewById(R.id.sv_chat).setVisibility(0);
                t_radio t_radio4 = t_radio.this;
                if (t_radio4.f9735q) {
                    t_radio4.findViewById(R.id.ll_ad_rad).setVisibility(8);
                } else if (!t_radio4.f9727m.f7279W1 && (cVar = t_radio4.f9731o) != null && cVar.f6886a != null) {
                    t_radio4.m8884t();
                }
            }
        }
    }

    /* renamed from: british.xnews2.t_radio$i */
    class C2415i implements Runnable {

        /* renamed from: b */
        final /* synthetic */ SharedPreferences f9763b;

        /* renamed from: british.xnews2.t_radio$i$a */
        class C2416a implements View.OnClickListener {
            C2416a() {
            }

            public void onClick(View view) {
                t_radio t_radio = t_radio.this;
                t_radio.f9727m.mo7489T(t_radio, (ImageView) view, t_radio.f6656b);
            }
        }

        /* renamed from: british.xnews2.t_radio$i$b */
        class C2417b implements Runnable {
            C2417b() {
            }

            public void run() {
                ((ScrollView) t_radio.this.findViewById(R.id.sv_chat)).fullScroll(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            }
        }

        C2415i(SharedPreferences sharedPreferences) {
            this.f9763b = sharedPreferences;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:236:0x072e, code lost:
            if (r0 == 4) goto L_0x07a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:244:0x074b, code lost:
            if (r0 == 4) goto L_0x077d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:256:0x077b, code lost:
            if (r0 == 4) goto L_0x077d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:257:0x077d, code lost:
            r11 = british.xnews2.R.drawable.bubble4_flip;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:267:0x079f, code lost:
            if (r0 == 4) goto L_0x07a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:268:0x07a1, code lost:
            r11 = british.xnews2.R.drawable.bubble4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0032, code lost:
            if (r2.equals(british.xnews2.t_radio.m8872f(r1.f9764c) + "") == false) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x004e, code lost:
            if (r1.f9763b.getString("f2_id", "").equals(r1.f9763b.getString("f2_idusu_prev", "")) != false) goto L_0x0050;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0050, code lost:
            r0 = java.lang.Boolean.TRUE;
         */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x04ce  */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x04d7  */
        /* JADX WARNING: Removed duplicated region for block: B:152:0x04f7  */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x0509  */
        /* JADX WARNING: Removed duplicated region for block: B:197:0x0618  */
        /* JADX WARNING: Removed duplicated region for block: B:198:0x0627  */
        /* JADX WARNING: Removed duplicated region for block: B:202:0x0656  */
        /* JADX WARNING: Removed duplicated region for block: B:221:0x06d6  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00b2  */
        /* JADX WARNING: Removed duplicated region for block: B:272:0x07c9  */
        /* JADX WARNING: Removed duplicated region for block: B:279:0x07f5  */
        /* JADX WARNING: Removed duplicated region for block: B:287:0x080b  */
        /* JADX WARNING: Removed duplicated region for block: B:300:0x086b  */
        /* JADX WARNING: Removed duplicated region for block: B:304:0x0887  */
        /* JADX WARNING: Removed duplicated region for block: B:309:0x08b6  */
        /* JADX WARNING: Removed duplicated region for block: B:310:0x08be  */
        /* JADX WARNING: Removed duplicated region for block: B:315:0x08ec  */
        /* JADX WARNING: Removed duplicated region for block: B:316:0x08fb  */
        /* JADX WARNING: Removed duplicated region for block: B:321:0x092f  */
        /* JADX WARNING: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0100  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x013f  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x01df  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x01e6  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x01f1  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0264  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x026b  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0278  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x02a7  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x02d6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r1 = r22
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                android.content.SharedPreferences r2 = r1.f9763b
                java.lang.String r3 = "f2_ultimas"
                r4 = 0
                boolean r2 = r2.getBoolean(r3, r4)
                java.lang.String r5 = "f2_id"
                java.lang.String r6 = ""
                if (r2 != 0) goto L_0x0034
                android.content.SharedPreferences r2 = r1.f9763b
                java.lang.String r2 = r2.getString(r5, r6)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                british.xnews2.t_radio r8 = british.xnews2.t_radio.this
                java.lang.String r8 = r8.f9724Y
                r7.append(r8)
                r7.append(r6)
                java.lang.String r7 = r7.toString()
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x0050
            L_0x0034:
                android.content.SharedPreferences r2 = r1.f9763b
                boolean r2 = r2.getBoolean(r3, r4)
                if (r2 == 0) goto L_0x0052
                android.content.SharedPreferences r2 = r1.f9763b
                java.lang.String r2 = r2.getString(r5, r6)
                android.content.SharedPreferences r7 = r1.f9763b
                java.lang.String r8 = "f2_idusu_prev"
                java.lang.String r7 = r7.getString(r8, r6)
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x0052
            L_0x0050:
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
            L_0x0052:
                android.content.SharedPreferences r2 = r1.f9763b
                boolean r2 = r2.getBoolean(r3, r4)
                if (r2 != 0) goto L_0x0065
                british.xnews2.t_radio r2 = british.xnews2.t_radio.this
                android.content.SharedPreferences r7 = r1.f9763b
                java.lang.String r7 = r7.getString(r5, r6)
                r2.f9724Y = r7
            L_0x0065:
                android.content.SharedPreferences r2 = r1.f9763b
                java.lang.String r2 = r2.getString(r5, r6)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                british.xnews2.t_radio r8 = british.xnews2.t_radio.this
                long r8 = r8.f9713N
                r7.append(r8)
                r7.append(r6)
                java.lang.String r7 = r7.toString()
                boolean r2 = r2.equals(r7)
                r7 = 1
                if (r2 == 0) goto L_0x00a3
                android.content.SharedPreferences r2 = r1.f9763b
                boolean r2 = r2.getBoolean(r3, r4)
                if (r2 == 0) goto L_0x009a
                android.content.SharedPreferences r2 = r1.f9763b
                java.lang.String r8 = "f2_mateixusu_hastafinal"
                boolean r2 = r2.getBoolean(r8, r4)
                if (r2 == 0) goto L_0x00a1
                goto L_0x00a0
            L_0x009a:
                british.xnews2.t_radio r2 = british.xnews2.t_radio.this
                boolean r2 = r2.f9728m0
                if (r2 != 0) goto L_0x00a1
            L_0x00a0:
                goto L_0x00a7
            L_0x00a1:
                r2 = 1
                goto L_0x00a8
            L_0x00a3:
                british.xnews2.t_radio r2 = british.xnews2.t_radio.this
                r2.f9728m0 = r7
            L_0x00a7:
                r2 = 0
            L_0x00a8:
                android.content.SharedPreferences r8 = r1.f9763b
                boolean r8 = r8.getBoolean(r3, r4)
                java.lang.String r9 = "f2_fcrea"
                if (r8 == 0) goto L_0x00d9
                android.content.SharedPreferences r8 = r1.f9763b
                java.lang.String r8 = r8.getString(r9, r6)
                boolean r10 = r8.equals(r6)
                if (r10 != 0) goto L_0x00d9
                r10 = 6
                java.lang.String r8 = r8.substring(r4, r10)
                british.xnews2.t_radio r10 = british.xnews2.t_radio.this
                java.lang.String r10 = r10.f9725Z
                boolean r10 = r8.equals(r10)
                if (r10 != 0) goto L_0x00d9
                british.xnews2.t_radio r10 = british.xnews2.t_radio.this
                r10.mo8888s()
                british.xnews2.t_radio r10 = british.xnews2.t_radio.this
                r10.f9725Z = r8
            L_0x00d9:
                british.xnews2.t_radio r8 = british.xnews2.t_radio.this
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
                british.xnews2.t_radio r11 = british.xnews2.t_radio.this
                int r11 = r11.f9738r0
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
                british.xnews2.t_radio r10 = british.xnews2.t_radio.this
                int r11 = r10.f9740s0
                int r10 = r10.f9742t0
                r8.setPadding(r11, r10, r11, r4)
                british.xnews2.t_radio r10 = british.xnews2.t_radio.this
                british.xnews2.config r10 = r10.f9727m
                boolean r10 = r10.f7332f2
                if (r10 == 0) goto L_0x01b0
                android.content.SharedPreferences r10 = r1.f9763b
                java.lang.String r10 = r10.getString(r5, r6)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                british.xnews2.t_radio r13 = british.xnews2.t_radio.this
                long r12 = r13.f9713N
                r11.append(r12)
                r11.append(r6)
                java.lang.String r11 = r11.toString()
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L_0x01b0
                boolean r10 = r0.booleanValue()
                if (r10 != 0) goto L_0x01b0
                british.xnews2.t_radio r10 = british.xnews2.t_radio.this
                boolean r10 = r10.f9710K
                r11 = 2131362328(0x7f0a0218, float:1.8344433E38)
                if (r10 == 0) goto L_0x018d
                android.view.View r10 = r8.findViewById(r11)
                android.widget.ImageView r10 = (android.widget.ImageView) r10
                int r12 = british.xnews2.C1692config.f7101A5
                android.graphics.PorterDuff$Mode r13 = android.graphics.PorterDuff.Mode.MULTIPLY
                r10.setColorFilter(r12, r13)
            L_0x018d:
                android.view.View r10 = r8.findViewById(r11)
                r10.setVisibility(r4)
                android.view.View r10 = r8.findViewById(r11)
                r12 = 2131362292(0x7f0a01f4, float:1.834436E38)
                android.content.SharedPreferences r13 = r1.f9763b
                java.lang.String r13 = r13.getString(r5, r6)
                r10.setTag(r12, r13)
                android.view.View r10 = r8.findViewById(r11)
                british.xnews2.t_radio$i$a r11 = new british.xnews2.t_radio$i$a
                r11.<init>()
                r10.setOnClickListener(r11)
            L_0x01b0:
                british.xnews2.t_radio r10 = british.xnews2.t_radio.this
                int r10 = r10.f9734p0
                if (r10 == 0) goto L_0x01c7
                boolean r10 = r0.booleanValue()
                if (r10 != 0) goto L_0x01c7
                android.view.View r10 = r8.findViewById(r15)
                british.xnews2.t_radio r11 = british.xnews2.t_radio.this
                int r11 = r11.f9734p0
                r10.setMinimumWidth(r11)
            L_0x01c7:
                int r10 = android.os.Build.VERSION.SDK_INT
                r11 = 17
                r12 = 2131034119(0x7f050007, float:1.7678747E38)
                r13 = 3
                if (r10 < r11) goto L_0x01ed
                if (r2 == 0) goto L_0x01ed
                british.xnews2.t_radio r11 = british.xnews2.t_radio.this
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
                british.xnews2.t_radio r11 = british.xnews2.t_radio.this
                java.lang.String r11 = r11.f6656b
                british.xnews2.C1692config.m8168S0(r10, r11)
                r10 = 2131362746(0x7f0a03ba, float:1.8345281E38)
                android.view.View r10 = r8.findViewById(r10)
                android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
                british.xnews2.t_radio r11 = british.xnews2.t_radio.this
                java.lang.String r11 = r11.f6656b
                british.xnews2.C1692config.m8168S0(r10, r11)
                r10 = 2131362744(0x7f0a03b8, float:1.8345277E38)
                android.view.View r10 = r8.findViewById(r10)
                android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
                british.xnews2.t_radio r11 = british.xnews2.t_radio.this
                java.lang.String r11 = r11.f6656b
                british.xnews2.C1692config.m8168S0(r10, r11)
                r10 = 2131362745(0x7f0a03b9, float:1.834528E38)
                android.view.View r10 = r8.findViewById(r10)
                android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
                british.xnews2.t_radio r11 = british.xnews2.t_radio.this
                java.lang.String r11 = r11.f6656b
                british.xnews2.C1692config.m8168S0(r10, r11)
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
                british.xnews2.t_radio r12 = british.xnews2.t_radio.this
                java.lang.String r12 = r12.f9748w0
                java.lang.String r4 = "FFFFFFFF"
                boolean r4 = r12.equals(r4)
                if (r4 == 0) goto L_0x026b
                british.xnews2.t_radio r4 = british.xnews2.t_radio.this
                java.lang.String r4 = r4.f9750x0
                java.lang.String r12 = "FFFFFFFF"
                boolean r4 = r4.equals(r12)
                if (r4 == 0) goto L_0x026b
                java.lang.String r4 = "#EEEEEE"
                int r4 = android.graphics.Color.parseColor(r4)
                goto L_0x026c
            L_0x026b:
                r4 = -1
            L_0x026c:
                java.lang.String r12 = "#555555"
                int r12 = android.graphics.Color.parseColor(r12)
                british.xnews2.t_radio r7 = british.xnews2.t_radio.this
                boolean r7 = r7.f9710K
                if (r7 != 0) goto L_0x027e
                java.lang.String r7 = "#999999"
                int r12 = android.graphics.Color.parseColor(r7)
            L_0x027e:
                r11.setTextColor(r12)
                r13.setTextColor(r12)
                android.content.SharedPreferences r7 = r1.f9763b
                java.lang.String r7 = r7.getString(r5, r6)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                british.xnews2.t_radio r15 = british.xnews2.t_radio.this
                long r14 = r15.f9713N
                r12.append(r14)
                r12.append(r6)
                java.lang.String r12 = r12.toString()
                boolean r7 = r7.equals(r12)
                java.lang.String r14 = "1"
                if (r7 == 0) goto L_0x02d6
                british.xnews2.t_radio r7 = british.xnews2.t_radio.this
                boolean r15 = r7.f9710K
                if (r15 != 0) goto L_0x02af
                r15 = -1
                goto L_0x02b1
            L_0x02af:
                r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            L_0x02b1:
                android.content.res.Resources r7 = r7.getResources()
                r12 = 2131821091(0x7f110223, float:1.9274915E38)
                java.lang.String r7 = r7.getString(r12)
                r11.setText(r7)
                british.xnews2.t_radio r7 = british.xnews2.t_radio.this
                int r7 = r7.f9717R
                if (r7 <= 0) goto L_0x02d0
                british.xnews2.t_radio r7 = british.xnews2.t_radio.this
                android.graphics.Bitmap r7 = r7.f9694B0
                if (r7 == 0) goto L_0x02d0
                r10.setImageBitmap(r7)
            L_0x02d0:
                r18 = r3
                r19 = r5
                goto L_0x06cd
            L_0x02d6:
                android.content.SharedPreferences r7 = r1.f9763b
                java.lang.String r12 = "f2_nombre"
                java.lang.String r7 = r7.getString(r12, r6)
                java.lang.String r7 = r7.trim()
                r11.setText(r7)
                r7 = 2131362292(0x7f0a01f4, float:1.834436E38)
                android.content.SharedPreferences r11 = r1.f9763b
                java.lang.String r12 = "0"
                java.lang.String r11 = r11.getString(r5, r12)
                r8.setTag(r7, r11)
                r7 = 2131362294(0x7f0a01f6, float:1.8344365E38)
                android.content.SharedPreferences r11 = r1.f9763b
                java.lang.String r15 = "f2_privados"
                java.lang.String r11 = r11.getString(r15, r14)
                r8.setTag(r7, r11)
                r7 = 2131362295(0x7f0a01f7, float:1.8344367E38)
                android.content.SharedPreferences r11 = r1.f9763b
                java.lang.String r15 = "f2_nombre"
                java.lang.String r11 = r11.getString(r15, r6)
                r8.setTag(r7, r11)
                r7 = 2131362296(0x7f0a01f8, float:1.8344369E38)
                android.content.SharedPreferences r11 = r1.f9763b
                java.lang.String r15 = "f2_coments"
                java.lang.String r11 = r11.getString(r15, r14)
                r8.setTag(r7, r11)
                r7 = 2131362297(0x7f0a01f9, float:1.834437E38)
                android.content.SharedPreferences r11 = r1.f9763b
                java.lang.String r15 = "f2_fnac_d"
                java.lang.String r11 = r11.getString(r15, r12)
                r8.setTag(r7, r11)
                r7 = 2131362298(0x7f0a01fa, float:1.8344373E38)
                android.content.SharedPreferences r11 = r1.f9763b
                java.lang.String r15 = "f2_fnac_m"
                java.lang.String r11 = r11.getString(r15, r12)
                r8.setTag(r7, r11)
                r7 = 2131362299(0x7f0a01fb, float:1.8344375E38)
                android.content.SharedPreferences r11 = r1.f9763b
                java.lang.String r15 = "f2_fnac_a"
                java.lang.String r11 = r11.getString(r15, r12)
                r8.setTag(r7, r11)
                r7 = 2131362300(0x7f0a01fc, float:1.8344377E38)
                android.content.SharedPreferences r11 = r1.f9763b
                java.lang.String r15 = "f2_sexo"
                java.lang.String r11 = r11.getString(r15, r12)
                r8.setTag(r7, r11)
                r7 = 2131362301(0x7f0a01fd, float:1.8344379E38)
                android.content.SharedPreferences r11 = r1.f9763b
                java.lang.String r15 = "f2_vfoto"
                java.lang.String r11 = r11.getString(r15, r12)
                r8.setTag(r7, r11)
                british.xnews2.t_radio r7 = british.xnews2.t_radio.this
                british.xnews2.config r7 = r7.f9727m
                boolean r7 = r7.f7397p2
                if (r7 == 0) goto L_0x038f
                android.content.SharedPreferences r7 = r1.f9763b
                java.lang.String r7 = r7.getString(r5, r6)
                boolean r7 = r7.equals(r14)
                if (r7 != 0) goto L_0x038f
                r7 = 2131362233(0x7f0a01b9, float:1.834424E38)
                android.view.View r11 = r8.findViewById(r7)
                british.xnews2.t_radio r7 = british.xnews2.t_radio.this
                r11.setOnClickListener(r7)
                r7 = 2131362505(0x7f0a02c9, float:1.8344792E38)
                android.view.View r11 = r8.findViewById(r7)
                british.xnews2.t_radio r7 = british.xnews2.t_radio.this
                r11.setOnClickListener(r7)
            L_0x038f:
                android.content.SharedPreferences r7 = r1.f9763b
                java.lang.String r7 = r7.getString(r5, r6)
                int r11 = r7.length()
                r15 = 1
                int r11 = r11 - r15
                int r15 = r7.length()
                java.lang.String r11 = r7.substring(r11, r15)
                boolean r15 = r7.equals(r14)
                if (r15 == 0) goto L_0x03aa
                r11 = r12
            L_0x03aa:
                british.xnews2.t_radio r15 = british.xnews2.t_radio.this
                boolean r15 = r15.f9710K
                if (r15 == 0) goto L_0x0447
                boolean r15 = r11.equals(r12)
                if (r15 != 0) goto L_0x0439
                java.lang.String r15 = "5"
                boolean r15 = r11.equals(r15)
                if (r15 == 0) goto L_0x03c0
                goto L_0x0439
            L_0x03c0:
                boolean r15 = r11.equals(r14)
                if (r15 != 0) goto L_0x042b
                java.lang.String r15 = "6"
                boolean r15 = r11.equals(r15)
                if (r15 == 0) goto L_0x03cf
                goto L_0x042b
            L_0x03cf:
                java.lang.String r15 = "2"
                boolean r15 = r11.equals(r15)
                if (r15 != 0) goto L_0x041d
                java.lang.String r15 = "7"
                boolean r15 = r11.equals(r15)
                if (r15 == 0) goto L_0x03e0
                goto L_0x041d
            L_0x03e0:
                java.lang.String r15 = "3"
                boolean r15 = r11.equals(r15)
                if (r15 != 0) goto L_0x040f
                java.lang.String r15 = "8"
                boolean r15 = r11.equals(r15)
                if (r15 == 0) goto L_0x03f1
                goto L_0x040f
            L_0x03f1:
                java.lang.String r15 = "4"
                boolean r15 = r11.equals(r15)
                if (r15 != 0) goto L_0x0401
                java.lang.String r15 = "9"
                boolean r11 = r11.equals(r15)
                if (r11 == 0) goto L_0x0499
            L_0x0401:
                java.lang.String r4 = "#FFCC0000"
                int r4 = android.graphics.Color.parseColor(r4)
                java.lang.String r11 = "#FFFFDFDF"
                int r11 = android.graphics.Color.parseColor(r11)
                goto L_0x04c4
            L_0x040f:
                java.lang.String r4 = "#FF9E5400"
                int r4 = android.graphics.Color.parseColor(r4)
                java.lang.String r11 = "#FFFFF0DF"
                int r11 = android.graphics.Color.parseColor(r11)
                goto L_0x04c4
            L_0x041d:
                java.lang.String r4 = "#FF3D5C00"
                int r4 = android.graphics.Color.parseColor(r4)
                java.lang.String r11 = "#FFF4FFDF"
                int r11 = android.graphics.Color.parseColor(r11)
                goto L_0x04c4
            L_0x042b:
                java.lang.String r4 = "#FF9933CC"
                int r4 = android.graphics.Color.parseColor(r4)
                java.lang.String r11 = "#FFF2E6F9"
                int r11 = android.graphics.Color.parseColor(r11)
                goto L_0x04c4
            L_0x0439:
                java.lang.String r4 = "#FF00698C"
                int r4 = android.graphics.Color.parseColor(r4)
                java.lang.String r11 = "#FFDFF8FF"
                int r11 = android.graphics.Color.parseColor(r11)
                goto L_0x04c4
            L_0x0447:
                boolean r15 = r11.equals(r12)
                if (r15 != 0) goto L_0x04b9
                java.lang.String r15 = "5"
                boolean r15 = r11.equals(r15)
                if (r15 == 0) goto L_0x0457
                goto L_0x04b9
            L_0x0457:
                boolean r15 = r11.equals(r14)
                if (r15 != 0) goto L_0x04b2
                java.lang.String r15 = "6"
                boolean r15 = r11.equals(r15)
                if (r15 == 0) goto L_0x0466
                goto L_0x04b2
            L_0x0466:
                java.lang.String r15 = "2"
                boolean r15 = r11.equals(r15)
                if (r15 != 0) goto L_0x04ab
                java.lang.String r15 = "7"
                boolean r15 = r11.equals(r15)
                if (r15 == 0) goto L_0x0477
                goto L_0x04ab
            L_0x0477:
                java.lang.String r15 = "3"
                boolean r15 = r11.equals(r15)
                if (r15 != 0) goto L_0x04a4
                java.lang.String r15 = "8"
                boolean r15 = r11.equals(r15)
                if (r15 == 0) goto L_0x0488
                goto L_0x04a4
            L_0x0488:
                java.lang.String r15 = "4"
                boolean r15 = r11.equals(r15)
                if (r15 != 0) goto L_0x049d
                java.lang.String r15 = "9"
                boolean r11 = r11.equals(r15)
                if (r11 == 0) goto L_0x0499
                goto L_0x049d
            L_0x0499:
                r11 = r4
                r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                goto L_0x04c4
            L_0x049d:
                java.lang.String r11 = "#FF33FFFF"
                int r11 = android.graphics.Color.parseColor(r11)
                goto L_0x04bf
            L_0x04a4:
                java.lang.String r11 = "#FF87BFFF"
                int r11 = android.graphics.Color.parseColor(r11)
                goto L_0x04bf
            L_0x04ab:
                java.lang.String r11 = "#FFC9ADFF"
                int r11 = android.graphics.Color.parseColor(r11)
                goto L_0x04bf
            L_0x04b2:
                java.lang.String r11 = "#FF66CC33"
                int r11 = android.graphics.Color.parseColor(r11)
                goto L_0x04bf
            L_0x04b9:
                java.lang.String r11 = "#FFFF6633"
                int r11 = android.graphics.Color.parseColor(r11)
            L_0x04bf:
                r21 = r11
                r11 = r4
                r4 = r21
            L_0x04c4:
                british.xnews2.t_radio r15 = british.xnews2.t_radio.this
                r16 = r4
                british.xnews2.config r4 = r15.f9727m
                boolean r4 = r4.f7297Z1
                if (r4 != 0) goto L_0x04d7
                boolean r4 = r15.f9710K
                if (r4 == 0) goto L_0x04d5
                r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                goto L_0x04d9
            L_0x04d5:
                r15 = -1
                goto L_0x04d9
            L_0x04d7:
                r15 = r16
            L_0x04d9:
                android.content.SharedPreferences r4 = r1.f9763b
                r16 = r11
                java.lang.String r11 = "f2_vfoto"
                java.lang.String r4 = r4.getString(r11, r12)
                british.xnews2.t_radio r11 = british.xnews2.t_radio.this
                int r11 = r11.f9717R
                if (r11 <= 0) goto L_0x0509
                android.content.SharedPreferences r11 = r1.f9763b
                java.lang.String r11 = r11.getString(r5, r6)
                boolean r11 = r11.equals(r14)
                if (r11 == 0) goto L_0x0509
                british.xnews2.t_radio r4 = british.xnews2.t_radio.this
                android.content.res.Resources r4 = r4.getResources()
                r7 = 2131230865(0x7f080091, float:1.8077795E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r7)
                r10.setImageDrawable(r4)
                goto L_0x06c3
            L_0x0509:
                british.xnews2.t_radio r11 = british.xnews2.t_radio.this
                int r11 = r11.f9717R
                if (r11 <= 0) goto L_0x0540
                boolean r11 = r4.equals(r12)
                if (r11 == 0) goto L_0x0540
                british.xnews2.t_radio r4 = british.xnews2.t_radio.this
                boolean r7 = r4.f9710K
                if (r7 == 0) goto L_0x052c
                android.content.res.Resources r4 = r4.getResources()
                r7 = 2131231487(0x7f0802ff, float:1.8079056E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r7)
                r10.setImageDrawable(r4)
                goto L_0x053a
            L_0x052c:
                android.content.res.Resources r4 = r4.getResources()
                r7 = 2131231485(0x7f0802fd, float:1.8079052E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r7)
                r10.setImageDrawable(r4)
            L_0x053a:
                r4 = 0
                r10.setVisibility(r4)
                goto L_0x06c3
            L_0x0540:
                british.xnews2.t_radio r11 = british.xnews2.t_radio.this
                int r11 = r11.f9717R
                if (r11 <= 0) goto L_0x06c3
                boolean r11 = r4.equals(r12)
                if (r11 != 0) goto L_0x06c3
                british.xnews2.t_radio r11 = british.xnews2.t_radio.this
                java.util.HashMap<java.lang.String, android.graphics.Bitmap> r11 = r11.f9752y0
                java.lang.Object r11 = r11.get(r7)
                android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
                if (r11 == 0) goto L_0x0565
                r10.setImageBitmap(r11)
                r18 = r3
                r19 = r5
                r17 = r15
                goto L_0x0639
            L_0x0565:
                java.io.File r11 = new java.io.File     // Catch:{ Exception -> 0x060c }
                british.xnews2.t_radio r12 = british.xnews2.t_radio.this     // Catch:{ Exception -> 0x060c }
                java.io.File r12 = r12.f9700E0     // Catch:{ Exception -> 0x060c }
                r17 = r15
                java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0607 }
                r15.<init>()     // Catch:{ Exception -> 0x0607 }
                r18 = r3
                java.lang.String r3 = "fperfil_"
                r15.append(r3)     // Catch:{ Exception -> 0x0609 }
                r15.append(r7)     // Catch:{ Exception -> 0x0609 }
                java.lang.String r3 = ".jpg"
                r15.append(r3)     // Catch:{ Exception -> 0x0609 }
                java.lang.String r3 = r15.toString()     // Catch:{ Exception -> 0x0609 }
                r11.<init>(r12, r3)     // Catch:{ Exception -> 0x0609 }
                android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0609 }
                r3.<init>()     // Catch:{ Exception -> 0x0609 }
                r12 = 1
                r3.inJustDecodeBounds = r12     // Catch:{ Exception -> 0x0609 }
                java.lang.String r12 = r11.getPath()     // Catch:{ Exception -> 0x0609 }
                android.graphics.BitmapFactory.decodeFile(r12, r3)     // Catch:{ Exception -> 0x0609 }
                r12 = 1111490560(0x42400000, float:48.0)
                british.xnews2.t_radio r15 = british.xnews2.t_radio.this     // Catch:{ Exception -> 0x0609 }
                android.content.res.Resources r15 = r15.getResources()     // Catch:{ Exception -> 0x0609 }
                android.util.DisplayMetrics r15 = r15.getDisplayMetrics()     // Catch:{ Exception -> 0x0609 }
                float r15 = r15.density     // Catch:{ Exception -> 0x0609 }
                float r15 = r15 * r12
                r12 = 1056964608(0x3f000000, float:0.5)
                float r15 = r15 + r12
                int r12 = (int) r15     // Catch:{ Exception -> 0x0609 }
                british.xnews2.t_radio r15 = british.xnews2.t_radio.this     // Catch:{ Exception -> 0x0609 }
                android.content.res.Resources r15 = r15.getResources()     // Catch:{ Exception -> 0x0609 }
                android.util.DisplayMetrics r15 = r15.getDisplayMetrics()     // Catch:{ Exception -> 0x0609 }
                float r15 = r15.density     // Catch:{ Exception -> 0x0609 }
                r19 = 1111490560(0x42400000, float:48.0)
                float r15 = r15 * r19
                r19 = 1056964608(0x3f000000, float:0.5)
                float r15 = r15 + r19
                int r15 = (int) r15
                r19 = r5
                int r5 = r3.outWidth     // Catch:{ Exception -> 0x0605 }
                int r3 = r3.outHeight     // Catch:{ Exception -> 0x0605 }
                if (r5 > r12) goto L_0x05cd
                if (r3 > r15) goto L_0x05cd
                r20 = 1
                goto L_0x05cf
            L_0x05cd:
                r20 = 0
            L_0x05cf:
                if (r20 != 0) goto L_0x05ec
                int r3 = british.xnews2.C1692config.m8193n(r5, r3, r12, r15)     // Catch:{ Exception -> 0x0605 }
                float r5 = (float) r5     // Catch:{ Exception -> 0x0605 }
                float r3 = (float) r3     // Catch:{ Exception -> 0x0605 }
                float r5 = r5 / r3
                int r3 = java.lang.Math.round(r5)     // Catch:{ Exception -> 0x0605 }
                android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0605 }
                r5.<init>()     // Catch:{ Exception -> 0x0605 }
                r5.inSampleSize = r3     // Catch:{ Exception -> 0x0605 }
                java.lang.String r3 = r11.getPath()     // Catch:{ Exception -> 0x0605 }
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r3, r5)     // Catch:{ Exception -> 0x0605 }
                goto L_0x05fa
            L_0x05ec:
                british.xnews2.t_radio r3 = british.xnews2.t_radio.this     // Catch:{ Exception -> 0x0605 }
                android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ Exception -> 0x0605 }
                android.net.Uri r5 = android.net.Uri.fromFile(r11)     // Catch:{ Exception -> 0x0605 }
                android.graphics.Bitmap r3 = android.provider.MediaStore.Images.Media.getBitmap(r3, r5)     // Catch:{ Exception -> 0x0605 }
            L_0x05fa:
                r10.setImageBitmap(r3)     // Catch:{ Exception -> 0x0605 }
                british.xnews2.t_radio r5 = british.xnews2.t_radio.this     // Catch:{ Exception -> 0x0605 }
                java.util.HashMap<java.lang.String, android.graphics.Bitmap> r5 = r5.f9752y0     // Catch:{ Exception -> 0x0605 }
                r5.put(r7, r3)     // Catch:{ Exception -> 0x0605 }
                goto L_0x0639
            L_0x0605:
                goto L_0x0612
            L_0x0607:
                r18 = r3
            L_0x0609:
                r19 = r5
                goto L_0x0612
            L_0x060c:
                r18 = r3
                r19 = r5
                r17 = r15
            L_0x0612:
                british.xnews2.t_radio r3 = british.xnews2.t_radio.this
                boolean r5 = r3.f9710K
                if (r5 == 0) goto L_0x0627
                android.content.res.Resources r3 = r3.getResources()
                r5 = 2131231487(0x7f0802ff, float:1.8079056E38)
                android.graphics.drawable.Drawable r3 = r3.getDrawable(r5)
                r10.setImageDrawable(r3)
                goto L_0x0635
            L_0x0627:
                android.content.res.Resources r3 = r3.getResources()
                r5 = 2131231485(0x7f0802fd, float:1.8079052E38)
                android.graphics.drawable.Drawable r3 = r3.getDrawable(r5)
                r10.setImageDrawable(r3)
            L_0x0635:
                r3 = 0
                r10.setVisibility(r3)
            L_0x0639:
                android.content.SharedPreferences r3 = r1.f9763b
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r11 = "fperfil_"
                r5.append(r11)
                r5.append(r7)
                java.lang.String r5 = r5.toString()
                java.lang.String r3 = r3.getString(r5, r6)
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L_0x06c9
                british.xnews2.t_radio r3 = british.xnews2.t_radio.this
                boolean r3 = r3.f9707I
                if (r3 == 0) goto L_0x0668
                r3 = 2131362746(0x7f0a03ba, float:1.8345281E38)
                android.view.View r3 = r8.findViewById(r3)
                r5 = 0
                r3.setVisibility(r5)
                goto L_0x0673
            L_0x0668:
                r5 = 0
                r3 = 2131362743(0x7f0a03b7, float:1.8345275E38)
                android.view.View r3 = r8.findViewById(r3)
                r3.setVisibility(r5)
            L_0x0673:
                british.xnews2.t_radio r3 = british.xnews2.t_radio.this
                java.util.HashMap<java.lang.String, java.lang.String> r3 = r3.f9754z0
                boolean r3 = r3.containsKey(r7)
                if (r3 != 0) goto L_0x06c9
                british.xnews2.t_radio r3 = british.xnews2.t_radio.this
                java.util.HashMap<java.lang.String, java.lang.String> r3 = r3.f9692A0
                boolean r3 = r3.containsKey(r7)
                if (r3 == 0) goto L_0x0697
                british.xnews2.t_radio r3 = british.xnews2.t_radio.this
                java.util.HashMap<java.lang.String, java.lang.String> r3 = r3.f9692A0
                java.lang.Object r3 = r3.get(r7)
                java.lang.String r3 = (java.lang.String) r3
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L_0x06c9
            L_0x0697:
                british.xnews2.t_radio r3 = british.xnews2.t_radio.this
                java.util.HashMap<java.lang.String, java.lang.String> r3 = r3.f9754z0
                r3.put(r7, r4)
                british.xnews2.t_radio r3 = british.xnews2.t_radio.this
                british.xnews2.t_radio$n r3 = r3.f9698D0
                if (r3 == 0) goto L_0x06ac
                android.os.AsyncTask$Status r3 = r3.getStatus()
                android.os.AsyncTask$Status r4 = android.os.AsyncTask.Status.RUNNING
                if (r3 == r4) goto L_0x06c9
            L_0x06ac:
                british.xnews2.t_radio r3 = british.xnews2.t_radio.this
                british.xnews2.t_radio$n r4 = new british.xnews2.t_radio$n
                british.xnews2.t_radio r5 = british.xnews2.t_radio.this
                r7 = 0
                r4.<init>()
                r3.f9698D0 = r4
                british.xnews2.t_radio r3 = british.xnews2.t_radio.this
                british.xnews2.t_radio$n r3 = r3.f9698D0
                r4 = 0
                java.lang.String[] r5 = new java.lang.String[r4]
                r3.execute(r5)
                goto L_0x06c9
            L_0x06c3:
                r18 = r3
                r19 = r5
                r17 = r15
            L_0x06c9:
                r4 = r16
                r15 = r17
            L_0x06cd:
                british.xnews2.t_radio r3 = british.xnews2.t_radio.this
                british.xnews2.config r3 = r3.f9727m
                int r5 = r3.f7338g2
                r7 = 2
                if (r5 <= 0) goto L_0x07bd
                java.lang.String r3 = r3.f7356j2
                boolean r3 = r3.equals(r6)
                if (r3 != 0) goto L_0x06f9
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "#"
                r3.append(r4)
                british.xnews2.t_radio r4 = british.xnews2.t_radio.this
                british.xnews2.config r4 = r4.f9727m
                java.lang.String r4 = r4.f7356j2
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                int r4 = android.graphics.Color.parseColor(r3)
            L_0x06f9:
                int r3 = android.os.Build.VERSION.SDK_INT
                r5 = 17
                r11 = 2131230891(0x7f0800ab, float:1.8077848E38)
                if (r3 < r5) goto L_0x074e
                if (r2 == 0) goto L_0x074e
                british.xnews2.t_radio r2 = british.xnews2.t_radio.this
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131034119(0x7f050007, float:1.7678747E38)
                boolean r2 = r2.getBoolean(r3)
                if (r2 == 0) goto L_0x0732
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x071b
                goto L_0x07a4
            L_0x071b:
                r11 = 2131230883(0x7f0800a3, float:1.8077831E38)
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                british.xnews2.config r0 = r0.f9727m
                int r0 = r0.f7338g2
                if (r0 != r7) goto L_0x0728
                goto L_0x0793
            L_0x0728:
                r2 = 3
                if (r0 != r2) goto L_0x072d
                goto L_0x079a
            L_0x072d:
                r2 = 4
                if (r0 != r2) goto L_0x07a4
                goto L_0x07a1
            L_0x0732:
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x073a
                goto L_0x07a4
            L_0x073a:
                r11 = 2131230890(0x7f0800aa, float:1.8077846E38)
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                british.xnews2.config r0 = r0.f9727m
                int r0 = r0.f7338g2
                if (r0 != r7) goto L_0x0746
                goto L_0x076f
            L_0x0746:
                r2 = 3
                if (r0 != r2) goto L_0x074a
                goto L_0x0776
            L_0x074a:
                r2 = 4
                if (r0 != r2) goto L_0x07a4
                goto L_0x077d
            L_0x074e:
                british.xnews2.t_radio r2 = british.xnews2.t_radio.this
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131034119(0x7f050007, float:1.7678747E38)
                boolean r2 = r2.getBoolean(r3)
                if (r2 == 0) goto L_0x0781
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x0764
                goto L_0x07a4
            L_0x0764:
                r11 = 2131230890(0x7f0800aa, float:1.8077846E38)
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                british.xnews2.config r0 = r0.f9727m
                int r0 = r0.f7338g2
                if (r0 != r7) goto L_0x0773
            L_0x076f:
                r11 = 2131230885(0x7f0800a5, float:1.8077835E38)
                goto L_0x07a4
            L_0x0773:
                r2 = 3
                if (r0 != r2) goto L_0x077a
            L_0x0776:
                r11 = 2131230887(0x7f0800a7, float:1.807784E38)
                goto L_0x07a4
            L_0x077a:
                r2 = 4
                if (r0 != r2) goto L_0x07a4
            L_0x077d:
                r11 = 2131230889(0x7f0800a9, float:1.8077844E38)
                goto L_0x07a4
            L_0x0781:
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x0788
                goto L_0x07a4
            L_0x0788:
                r11 = 2131230883(0x7f0800a3, float:1.8077831E38)
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                british.xnews2.config r0 = r0.f9727m
                int r0 = r0.f7338g2
                if (r0 != r7) goto L_0x0797
            L_0x0793:
                r11 = 2131230884(0x7f0800a4, float:1.8077833E38)
                goto L_0x07a4
            L_0x0797:
                r2 = 3
                if (r0 != r2) goto L_0x079e
            L_0x079a:
                r11 = 2131230886(0x7f0800a6, float:1.8077837E38)
                goto L_0x07a4
            L_0x079e:
                r2 = 4
                if (r0 != r2) goto L_0x07a4
            L_0x07a1:
                r11 = 2131230888(0x7f0800a8, float:1.8077841E38)
            L_0x07a4:
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                android.content.res.Resources r0 = r0.getResources()
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r11)
                android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
                r0.setColorFilter(r4, r2)
                r2 = 2131362505(0x7f0a02c9, float:1.8344792E38)
                android.view.View r2 = r8.findViewById(r2)
                r2.setBackgroundDrawable(r0)
            L_0x07bd:
                android.content.SharedPreferences r0 = r1.f9763b
                java.lang.String r0 = r0.getString(r9, r6)
                boolean r2 = r0.equals(r6)
                if (r2 != 0) goto L_0x07ed
                r2 = 6
                r3 = 10
                java.lang.String r0 = r0.substring(r2, r3)
                java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
                java.lang.String r3 = "HHmm"
                r2.<init>(r3)
                java.util.Date r0 = r2.parse(r0)     // Catch:{ Exception -> 0x07e9 }
                british.xnews2.t_radio r2 = british.xnews2.t_radio.this     // Catch:{ Exception -> 0x07e9 }
                java.text.DateFormat r2 = android.text.format.DateFormat.getTimeFormat(r2)     // Catch:{ Exception -> 0x07e9 }
                java.lang.String r0 = r2.format(r0)     // Catch:{ Exception -> 0x07e9 }
                r13.setText(r0)     // Catch:{ Exception -> 0x07e9 }
                goto L_0x07ed
            L_0x07e9:
                r0 = move-exception
                r0.printStackTrace()
            L_0x07ed:
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                int r0 = r0.f9717R
                if (r0 <= 0) goto L_0x080b
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                british.xnews2.config r2 = r0.f9727m
                boolean r2 = r2.f7297Z1
                if (r2 == 0) goto L_0x07ff
                r12 = r15
                goto L_0x0807
            L_0x07ff:
                boolean r0 = r0.f9707I
                if (r0 == 0) goto L_0x0806
                r12 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                goto L_0x0807
            L_0x0806:
                r12 = -1
            L_0x0807:
                r10.setBackgroundColor(r12)
                goto L_0x0849
            L_0x080b:
                r2 = 8
                r10.setVisibility(r2)
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                british.xnews2.config r3 = r0.f9727m
                int r4 = r3.f7338g2
                if (r4 <= 0) goto L_0x0823
                r4 = 2131362233(0x7f0a01b9, float:1.834424E38)
                android.view.View r0 = r8.findViewById(r4)
                r0.setVisibility(r2)
                goto L_0x0849
            L_0x0823:
                boolean r2 = r3.f7297Z1
                if (r2 == 0) goto L_0x082c
                r12 = r15
                r2 = 2131363190(0x7f0a0576, float:1.8346182E38)
                goto L_0x083a
            L_0x082c:
                boolean r0 = r0.f9707I
                if (r0 == 0) goto L_0x0836
                r2 = 2131363190(0x7f0a0576, float:1.8346182E38)
                r12 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                goto L_0x083a
            L_0x0836:
                r2 = 2131363190(0x7f0a0576, float:1.8346182E38)
                r12 = -1
            L_0x083a:
                android.view.View r0 = r8.findViewById(r2)
                r0.setBackgroundColor(r12)
                android.view.View r0 = r8.findViewById(r2)
                r2 = 0
                r0.setVisibility(r2)
            L_0x0849:
                r0 = 2131363120(0x7f0a0530, float:1.834604E38)
                android.view.View r0 = r8.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                android.content.SharedPreferences r2 = r1.f9763b
                java.lang.String r3 = "f2_frase"
                java.lang.String r2 = r2.getString(r3, r6)
                android.content.SharedPreferences r3 = r1.f9763b
                java.lang.String r4 = "f2_tipo"
                java.lang.String r3 = r3.getString(r4, r6)
                r3.equals(r14)
                boolean r3 = r2.equals(r6)
                if (r3 != 0) goto L_0x0887
                british.xnews2.t_radio r3 = british.xnews2.t_radio.this
                java.lang.CharSequence r2 = british.xnews2.t_chat.m8702G(r3, r2)
                british.xnews2.t_radio r3 = british.xnews2.t_radio.this
                british.xnews2.config r3 = r3.f9727m
                boolean r3 = r3.f7273V1
                if (r3 == 0) goto L_0x0880
                r3 = 1
                r0.setAutoLinkMask(r3)
                r0.setLinkTextColor(r15)
            L_0x0880:
                r0.setText(r2)
                r0.setTextColor(r15)
                goto L_0x08a0
            L_0x0887:
                android.content.SharedPreferences r0 = r1.f9763b
                java.lang.String r2 = "f2_b64"
                java.lang.String r0 = r0.getString(r2, r6)
                java.lang.String r2 = "es_ad"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x08a0
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                british.xnews2.config r2 = r0.f9727m
                int r0 = r0.f9736q0
                r2.mo7480F0(r8, r15, r0)
            L_0x08a0:
                android.content.SharedPreferences r0 = r1.f9763b
                r2 = r19
                java.lang.String r0 = r0.getString(r2, r6)
                r8.setTag(r0)
                android.content.SharedPreferences r0 = r1.f9763b
                r2 = r18
                r3 = 0
                boolean r0 = r0.getBoolean(r2, r3)
                if (r0 == 0) goto L_0x08be
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                android.widget.LinearLayout r0 = r0.f9744u0
                r0.addView(r8, r3)
                goto L_0x08d9
            L_0x08be:
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                android.widget.LinearLayout r0 = r0.f9744u0
                r0.addView(r8)
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                android.widget.LinearLayout r0 = r0.f9744u0
                int r0 = r0.getChildCount()
                r2 = 200(0xc8, float:2.8E-43)
                if (r0 <= r2) goto L_0x08d9
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                android.widget.LinearLayout r0 = r0.f9744u0
                r2 = 0
                r0.removeViewAt(r2)
            L_0x08d9:
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                int r2 = r0.f9723X
                r3 = 1
                int r2 = r2 + r3
                r0.f9723X = r2
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                int r0 = r0.f9723X
                if (r0 != r3) goto L_0x08fb
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                r2 = 2131363221(0x7f0a0595, float:1.8346245E38)
                android.view.View r0 = r0.findViewById(r2)
                r2 = 8
                r0.setVisibility(r2)
                goto L_0x0911
            L_0x08fb:
                r2 = 8
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                int r0 = r0.f9723X
                if (r0 != r7) goto L_0x0911
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                r3 = 2131363222(0x7f0a0596, float:1.8346247E38)
                android.view.View r0 = r0.findViewById(r3)
                r0.setVisibility(r2)
            L_0x0911:
                british.xnews2.t_radio r0 = british.xnews2.t_radio.this
                r2 = 2131362951(0x7f0a0487, float:1.8345697E38)
                android.view.View r0 = r0.findViewById(r2)
                android.widget.ScrollView r0 = (android.widget.ScrollView) r0
                british.xnews2.t_radio r2 = british.xnews2.t_radio.this
                android.widget.LinearLayout r2 = r2.f9744u0
                int r2 = r2.getMeasuredHeight()
                int r3 = r0.getScrollY()
                int r4 = r0.getHeight()
                int r3 = r3 + r4
                if (r2 > r3) goto L_0x0937
                british.xnews2.t_radio$i$b r2 = new british.xnews2.t_radio$i$b
                r2.<init>()
                r0.post(r2)
            L_0x0937:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_radio.C2415i.run():void");
        }
    }

    /* renamed from: british.xnews2.t_radio$j */
    class C2418j extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f9767a;

        /* renamed from: british.xnews2.t_radio$j$a */
        class C2419a extends FullScreenContentCallback {
            C2419a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_radio t_radio = t_radio.this;
                if (t_radio.f9733p) {
                    t_radio.abrir_secc(t_radio.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_radio t_radio = t_radio.this;
                t_radio.abrir_secc(t_radio.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.t_radio$j$b */
        class C2420b implements OnUserEarnedRewardListener {
            C2420b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2418j jVar = C2418j.this;
                t_radio.this.f9733p = true;
                C1692config.m8175Y0(jVar.f9767a);
            }
        }

        C2418j(Context context) {
            this.f9767a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_radio.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2419a());
            rewardedAd.show((Activity) this.f9767a, new C2420b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_radio t_radio = t_radio.this;
            if (!t_radio.f9727m.mo7502f(this.f9767a, t_radio.f6663i)) {
                t_radio.this.f6661g.cancel();
                t_radio t_radio2 = t_radio.this;
                t_radio2.abrir_secc(t_radio2.f6660f);
            }
        }
    }

    /* renamed from: british.xnews2.t_radio$k */
    private class C2421k extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        private String f9771a;

        /* renamed from: b */
        private String f9772b;

        /* renamed from: c */
        private int f9773c;

        /* renamed from: british.xnews2.t_radio$k$a */
        class C2422a implements DialogInterface.OnClickListener {
            C2422a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: british.xnews2.t_radio$k$b */
        class C2423b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f9776a;

            C2423b(AlertDialog alertDialog) {
                this.f9776a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f9776a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + t_radio.this.f6656b));
                Button button2 = this.f9776a.getButton(-2);
                button2.setTextColor(Color.parseColor("#" + t_radio.this.f6656b));
            }
        }

        public C2421k(String str, String str2, int i) {
            this.f9771a = str;
            this.f9772b = str2;
            this.f9773c = i;
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
                java.lang.String r1 = british.xnews2.C1692config.f7109I5     // Catch:{ Exception -> 0x00af }
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                java.lang.String r1 = "/srv/ultimas_frases.php?ver=1&idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                british.xnews2.t_radio r1 = british.xnews2.t_radio.this     // Catch:{ Exception -> 0x00af }
                long r1 = r1.f9713N     // Catch:{ Exception -> 0x00af }
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                british.xnews2.t_radio r1 = british.xnews2.t_radio.this     // Catch:{ Exception -> 0x00af }
                java.lang.String r1 = r1.f9726l0     // Catch:{ Exception -> 0x00af }
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                java.lang.String r1 = "&idtema="
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                british.xnews2.t_radio r1 = british.xnews2.t_radio.this     // Catch:{ Exception -> 0x00af }
                int r1 = r1.f9714O     // Catch:{ Exception -> 0x00af }
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                java.lang.String r1 = "&idf="
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                int r1 = r5.f9773c     // Catch:{ Exception -> 0x00af }
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                java.lang.String r1 = "&idprivado_finalizar=0&idconversante="
                r0.append(r1)     // Catch:{ Exception -> 0x00af }
                java.lang.String r1 = r5.f9772b     // Catch:{ Exception -> 0x00af }
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
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_radio.C2421k.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            String str2;
            boolean z;
            int i;
            String str3;
            String str4 = str;
            if (this.f9773c != -1) {
                if (str4.indexOf("ANDROID:OK") != -1 || str4.indexOf("ANDROID:KO") != -1 || str4.indexOf("ANDROID:PERFILKO") != -1) {
                    if (str4.indexOf("ANDROID:PERFILKO") != -1) {
                        AlertDialog create = new AlertDialog.Builder(t_radio.this).setPositiveButton(R.string.aceptar, new C2422a()).setMessage(R.string.perfil_desactivado).create();
                        if (!t_radio.this.f6656b.equals("")) {
                            create.setOnShowListener(new C2423b(create));
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
                            t_radio.this.f9716Q = Integer.parseInt(substring);
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
                                    sb.append(t_radio.this.f9713N);
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
                                        SharedPreferences.Editor edit = t_radio.this.f9749x.edit();
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
                                        edit.putString("f2_idtema", t_radio.this.f9714O + "");
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
                                SharedPreferences.Editor edit2 = t_radio.this.f9749x.edit();
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
                                edit2.putString("f2_idtema", t_radio.this.f9714O + "");
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
                            t_radio.this.mo8888s();
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }
    }

    /* renamed from: british.xnews2.t_radio$l */
    private class C2424l extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f9778a;

        /* renamed from: b */
        String f9779b;

        /* renamed from: c */
        String f9780c;

        private C2424l() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0086, code lost:
            return (byte) -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x008b, code lost:
            return (byte) -1;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x007d */
        /* JADX WARNING: Removed duplicated region for block: B:13:? A[ExcHandler: OutOfMemoryError (unused java.lang.OutOfMemoryError), SYNTHETIC, Splitter:B:3:0x004a] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r0 = 0
                r1 = r6[r0]
                r5.f9778a = r1
                r1 = 1
                r2 = r6[r1]
                r5.f9779b = r2
                r2 = 2
                r6 = r6[r2]
                r5.f9780c = r6
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = british.xnews2.C1692config.f7108H5
                r6.append(r2)
                java.lang.String r2 = "/srv/imgs/radio/"
                r6.append(r2)
                java.lang.String r2 = r5.f9778a
                r6.append(r2)
                java.lang.String r2 = "_fondo.png?v="
                r6.append(r2)
                java.lang.String r2 = r5.f9780c
                r6.append(r2)
                java.lang.String r6 = r6.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "fondo_"
                r2.append(r3)
                java.lang.String r3 = r5.f9778a
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = -1
                java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x008c }
                r4.<init>(r6)     // Catch:{ MalformedURLException -> 0x008c }
                java.net.URLConnection r6 = r4.openConnection()     // Catch:{ IOException -> 0x0087, OutOfMemoryError -> 0x0082 }
                java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x0087, OutOfMemoryError -> 0x0082 }
                r6.setDoInput(r1)     // Catch:{ IOException -> 0x0087, OutOfMemoryError -> 0x0082 }
                r1 = 5000(0x1388, float:7.006E-42)
                r6.setConnectTimeout(r1)     // Catch:{ IOException -> 0x0087, OutOfMemoryError -> 0x0082 }
                r1 = 7000(0x1b58, float:9.809E-42)
                r6.setReadTimeout(r1)     // Catch:{ IOException -> 0x0087, OutOfMemoryError -> 0x0082 }
                r6.connect()     // Catch:{ IOException -> 0x0087, OutOfMemoryError -> 0x0082 }
                java.io.InputStream r6 = r6.getInputStream()     // Catch:{ IOException -> 0x0087, OutOfMemoryError -> 0x0082 }
                android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6)     // Catch:{ IOException -> 0x0087, OutOfMemoryError -> 0x0082 }
                british.xnews2.t_radio r1 = british.xnews2.t_radio.this     // Catch:{ Exception -> 0x007d, OutOfMemoryError -> 0x0082 }
                java.io.FileOutputStream r1 = r1.openFileOutput(r2, r0)     // Catch:{ Exception -> 0x007d, OutOfMemoryError -> 0x0082 }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x007d, OutOfMemoryError -> 0x0082 }
                r4 = 100
                r6.compress(r2, r4, r1)     // Catch:{ Exception -> 0x007d, OutOfMemoryError -> 0x0082 }
                r1.close()     // Catch:{ Exception -> 0x007d, OutOfMemoryError -> 0x0082 }
                java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
                return r6
            L_0x007d:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r3)     // Catch:{ IOException -> 0x0087, OutOfMemoryError -> 0x0082 }
                return r6
            L_0x0082:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r3)
                return r6
            L_0x0087:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r3)
                return r6
            L_0x008c:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r3)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_radio.C2424l.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            if (b.byteValue() == 0) {
                try {
                    t_radio t_radio = t_radio.this;
                    t_radio t_radio2 = t_radio.this;
                    Boolean valueOf = Boolean.valueOf(t_radio2.f9727m.f7231O1[t_radio2.f9693B].f7931l);
                    t_radio t_radio3 = t_radio.this;
                    t_radio.f9727m.mo7514k1((ImageView) t_radio.findViewById(R.id.iv_fondo), valueOf, t_radio3.f9727m.f7231O1[t_radio3.f9693B].f7934m);
                    ((ImageView) t_radio.this.findViewById(R.id.iv_fondo)).setVisibility(8);
                    C1692config config = t_radio.this.f9727m;
                    config.mo7493Y("fondo_" + this.f9778a, (ImageView) t_radio.this.findViewById(R.id.iv_fondo));
                    C1692config.m8172V((ImageView) t_radio.this.findViewById(R.id.iv_fondo));
                } catch (Exception unused) {
                }
                SharedPreferences.Editor edit = t_radio.this.f9749x.edit();
                edit.putInt("s" + this.f9778a + "_fondo_modif", 0);
                edit.commit();
                t_radio.this.f9727m.f7231O1[Integer.parseInt(this.f9779b)].f7876P = false;
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }
    }

    /* renamed from: british.xnews2.t_radio$m */
    private class C2425m extends AsyncTask<String, Void, String> {
        private C2425m() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            Iterator<String> it = t_radio.this.f9708I0.iterator();
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
                    gVar.mo48144c("idapp", new C12982f("2260177"));
                    gVar.mo48144c("idusu", new C12982f(t_radio.this.f9713N + ""));
                    gVar.mo48144c("c", new C12982f(t_radio.this.f9726l0));
                    gVar.mo48144c("idtema", new C12982f(t_radio.this.f9714O + ""));
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
            if (str.equals("OK") && t_radio.this.f9708I0.size() > 0) {
                t_radio t_radio = t_radio.this;
                t_radio.f9696C0 = new C2425m();
                t_radio.this.f9696C0.execute(new String[0]);
            }
        }
    }

    /* renamed from: british.xnews2.t_radio$n */
    private class C2426n extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f9783a;

        /* renamed from: b */
        String f9784b;

        /* renamed from: c */
        Bitmap f9785c;

        private C2426n() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r5) {
            /*
                r4 = this;
                java.lang.String r5 = r4.f9783a
                java.lang.String r0 = "0"
                if (r5 == 0) goto L_0x008c
                java.lang.String r5 = r4.f9784b
                if (r5 != 0) goto L_0x000c
                goto L_0x008c
            L_0x000c:
                java.net.URL r5 = new java.net.URL     // Catch:{  }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
                r1.<init>()     // Catch:{  }
                java.lang.String r2 = british.xnews2.C1692config.f7108H5     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "/srv/imgs/usus/"
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f9783a     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "_1_p.jpg?v="
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f9784b     // Catch:{  }
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
                r4.f9785c = r2     // Catch:{ MalformedURLException -> 0x008c }
                r1.close()     // Catch:{ MalformedURLException -> 0x008c }
                r5.disconnect()     // Catch:{ MalformedURLException -> 0x008c }
                java.io.File r5 = new java.io.File     // Catch:{ MalformedURLException -> 0x008c }
                british.xnews2.t_radio r1 = british.xnews2.t_radio.this     // Catch:{ MalformedURLException -> 0x008c }
                java.io.File r1 = r1.f9700E0     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x008c }
                r2.<init>()     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.String r3 = "fperfil_"
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.String r3 = r4.f9783a     // Catch:{ MalformedURLException -> 0x008c }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.String r3 = ".jpg"
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x008c }
                java.lang.String r2 = r2.toString()     // Catch:{ MalformedURLException -> 0x008c }
                r5.<init>(r1, r2)     // Catch:{ MalformedURLException -> 0x008c }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{  }
                r1.<init>(r5)     // Catch:{  }
                android.graphics.Bitmap r5 = r4.f9785c     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{  }
                r3 = 70
                r5.compress(r2, r3, r1)     // Catch:{  }
                java.lang.String r5 = "1"
                return r5
            L_0x008c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_radio.C2426n.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            HashMap<String, Bitmap> hashMap = t_radio.this.f9752y0;
            if (hashMap != null) {
                if (str == IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) {
                    hashMap.put(this.f9783a, this.f9785c);
                    SharedPreferences.Editor edit = t_radio.this.f9749x.edit();
                    edit.putString("fperfil_" + this.f9783a, t_radio.this.f9692A0.get(this.f9783a));
                    edit.commit();
                }
                int childCount = t_radio.this.f9744u0.getChildCount();
                int i = 0;
                while (i < childCount) {
                    try {
                        String str2 = (String) t_radio.this.f9744u0.getChildAt(i).getTag();
                        if (str2 != null && str2.equals(this.f9783a)) {
                            t_radio.this.f9744u0.getChildAt(i).findViewById(R.id.pb_foto).setVisibility(8);
                            t_radio.this.f9744u0.getChildAt(i).findViewById(R.id.pb_foto_inv).setVisibility(8);
                            if (str == IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) {
                                ((ImageView) t_radio.this.f9744u0.getChildAt(i).findViewById(R.id.iv_avatar_f)).setImageBitmap(this.f9785c);
                            }
                        }
                        i++;
                    } catch (Exception unused) {
                    }
                }
                if (!t_radio.this.f9754z0.equals("")) {
                    t_radio t_radio = t_radio.this;
                    t_radio.f9698D0 = new C2426n();
                    t_radio.this.f9698D0.execute(new String[0]);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (t_radio.this.f9754z0.equals("")) {
                cancel(false);
                return;
            }
            try {
                this.f9783a = (String) t_radio.this.f9754z0.keySet().toArray()[0];
            } catch (Exception unused) {
                cancel(false);
            }
            String str = this.f9783a;
            if (str != null) {
                this.f9784b = t_radio.this.f9754z0.get(str);
                t_radio t_radio = t_radio.this;
                HashMap<String, String> hashMap = t_radio.f9692A0;
                String str2 = this.f9783a;
                hashMap.put(str2, t_radio.f9754z0.get(str2));
                t_radio.this.f9754z0.remove(this.f9783a);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m8881o() {
        C1603c cVar;
        try {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(((TextView) findViewById(R.id.c_mensaje)).getWindowToken(), 0);
        } catch (Exception unused) {
        }
        findViewById(R.id.sv_chat).setVisibility(8);
        MediaController mediaController = this.f9699E;
        if (mediaController != null) {
            mediaController.show(0);
        }
        if (this.f9735q) {
            findViewById(R.id.ll_ad_rad).setVisibility(0);
        } else if (!this.f9727m.f7279W1 && (cVar = this.f9731o) != null && cVar.f6886a != null) {
            if (((LinearLayout) findViewById(R.id.ll_ad)).getChildCount() > 0) {
                findViewById(R.id.ll_ad).setVisibility(0);
            }
            View findViewWithTag = findViewById(R.id.ll_princ).findViewWithTag(Integer.valueOf(R.id.TAG_ESBANNER));
            if (findViewWithTag != null) {
                findViewWithTag.setVisibility(0);
            }
        }
    }

    /* renamed from: p */
    private void m8882p(Context context) {
        this.f6662h = new C2418j(context);
    }

    /* renamed from: q */
    private void m8883q(boolean z) {
        String trim = ((TextView) findViewById(R.id.c_mensaje)).getText().toString().replace("@", "").trim();
        if (!trim.equals("")) {
            if (z && this.f9715P < 600) {
                ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(((TextView) findViewById(R.id.c_mensaje)).getWindowToken(), 0);
            }
            ((EditText) findViewById(R.id.c_mensaje)).setText("");
            SharedPreferences.Editor edit = this.f9749x.edit();
            edit.putString("f2_id", this.f9713N + "");
            edit.putString("f2_frase", trim);
            edit.putString("f2_fcrea", new SimpleDateFormat("ddMMyyHHmm").format(new Date()));
            edit.putString("f2_b64", "");
            edit.putString("f2_idfrase", SessionDescription.SUPPORTED_SDP_VERSION);
            edit.putString("f2_idtema", this.f9714O + "");
            edit.putString("f2_vfoto", SessionDescription.SUPPORTED_SDP_VERSION);
            edit.putBoolean("f2_ultimas", false);
            edit.putString("f2_ts", System.currentTimeMillis() + "");
            edit.commit();
            this.f9727m.mo7508i1(this);
            C1692config config = this.f9727m;
            SharedPreferences sharedPreferences = this.f9749x;
            config.mo7501e1(this, sharedPreferences, this.f9714O + "");
            this.f9708I0.add(trim);
            C2425m mVar = this.f9696C0;
            if (mVar == null || mVar.getStatus() != AsyncTask.Status.RUNNING) {
                C2425m mVar2 = new C2425m();
                this.f9696C0 = mVar2;
                mVar2.execute(new String[0]);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m8884t() {
        if (((LinearLayout) findViewById(R.id.ll_ad)).getChildCount() > 0) {
            findViewById(R.id.ll_ad).setVisibility(8);
        }
        View findViewWithTag = findViewById(R.id.ll_princ).findViewWithTag(Integer.valueOf(R.id.TAG_ESBANNER));
        if (findViewWithTag != null) {
            findViewWithTag.setVisibility(8);
        }
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f9727m.mo7510j0(view, this);
        if (j0.f7843b) {
            this.f6657c = true;
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
                    this.f6659e = false;
                    if (this.f9727m.f7427t4 != 2) {
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
        if (this.f6657c && !this.f6658d) {
            finish();
        }
    }

    public void adError(String str) {
        this.f6661g.cancel();
        abrir_secc(this.f6660f);
    }

    public void adLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
        this.f6661g.cancel();
        this.f6663i.showAd();
    }

    public boolean canPause() {
        return true;
    }

    public boolean canSeekBackward() {
        return true;
    }

    public boolean canSeekForward() {
        return true;
    }

    public int getAudioSessionId() {
        return 0;
    }

    public int getBufferPercentage() {
        try {
            if (getDuration() > 0) {
                return (getCurrentPosition() * 100) / getDuration();
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public int getCurrentPosition() {
        return this.f9751y.getInt("position", 0);
    }

    public int getDuration() {
        return this.f9751y.getInt(IronSourceConstants.EVENTS_DURATION, -1);
    }

    public boolean isPlaying() {
        return this.f9751y.getBoolean("isPlaying", false);
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
                this.f6659e = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    public void onAdClicked(C3371Ad ad) {
    }

    public void onAdClosed() {
        if (this.f9733p) {
            abrir_secc(this.f6660f);
        }
    }

    public void onAdLoaded(C3371Ad ad) {
        this.f6661g.cancel();
        this.f6664j.show();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
        try {
            this.f9699E.show(0);
        } catch (Exception unused) {
        }
    }

    public void onBackPressed() {
        if (findViewById(R.id.sv_chat).getVisibility() == 0) {
            m8881o();
        } else if (!this.f6659e || this.f9697D || !this.f9727m.f7365k5) {
            super.onBackPressed();
        } else {
            this.f9697D = true;
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
            m8883q(false);
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
            intent.putExtra("p_fnac", this.f9719T);
            intent.putExtra("p_sexo", this.f9720U);
            intent.putExtra("p_descr", this.f9721V);
            intent.putExtra("p_dist", this.f9722W);
            intent.putExtra("coments_chat", this.f9703G);
            intent.putExtra("galeria", this.f9705H);
            intent.putExtra("privados_chat", this.f9701F);
            intent.putExtra("fotos_perfil", this.f9717R);
            intent.putExtra("fotos_chat", this.f9718S);
            startActivityForResult(intent, 0);
        } else {
            String str9 = this.f9727m.f7251R3;
            if ((str9 == null || str9.equals("")) && (((str = this.f9727m.f7281W3) == null || str.equals("")) && (((str2 = this.f9727m.f7250R2) == null || str2.equals("")) && (((str3 = this.f9727m.f7245Q3) == null || str3.equals("")) && (((str4 = this.f9727m.f7269U3) == null || str4.equals("")) && (((str5 = this.f9727m.f7275V3) == null || str5.equals("")) && (((str6 = this.f9727m.f7358j4) == null || str6.equals("")) && (((str7 = this.f9727m.f7287X3) == null || str7.equals("")) && ((str8 = this.f9727m.f7293Y3) == null || str8.equals("")))))))))) {
                abrir_secc(view);
                return;
            }
            String str10 = this.f9727m.f7251R3;
            if (str10 != null && !str10.equals("")) {
                this.f6663i = new RewardedVideo((Context) this, this.f9727m.f7251R3);
            }
            String str11 = this.f9727m.f7245Q3;
            if (str11 != null) {
                str11.equals("");
            }
            String str12 = this.f9727m.f7269U3;
            if (str12 != null && !str12.equals("")) {
                this.f6664j = new RewardedVideoAd(this, this.f9727m.f7269U3);
            }
            String str13 = this.f9727m.f7275V3;
            if (str13 != null && !str13.equals("")) {
                this.f6665k = new StartAppAd(this);
            }
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f6661g = progressDialog;
            this.f6660f = view;
            if (!this.f9727m.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
                abrir_secc(view);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C1603c cVar;
        com.facebook.ads.AdView adView;
        AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo8887r();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar2 = this.f9731o;
        if (!(cVar2 == null || (adView2 = cVar2.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar3 = this.f9731o;
        if (!(cVar3 == null || (adView = cVar3.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        if (this.f9735q) {
            mo8891u();
        } else {
            this.f9731o = this.f9727m.mo7474A0(this, false);
        }
        if (findViewById(R.id.sv_chat).getVisibility() != 0) {
            return;
        }
        if (this.f9735q) {
            findViewById(R.id.ll_ad_rad).setVisibility(8);
        } else if (!this.f9727m.f7279W1 && (cVar = this.f9731o) != null && cVar.f6886a != null) {
            m8884t();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:198:0x05d2, code lost:
        if (r0.f9749x.getInt("fnac_a", 0) != 0) goto L_0x05d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x05e0, code lost:
        if (r0.f9749x.getInt("sexo", r14) == 0) goto L_0x05b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05f0, code lost:
        if (r0.f9749x.getString("descr", "").equals("") != false) goto L_0x05b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x04a2 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            android.content.Context r2 = r18.getApplicationContext()
            british.xnews2.config r2 = (british.xnews2.C1692config) r2
            r0.f9727m = r2
            java.lang.String r3 = r2.f7313c1
            if (r3 != 0) goto L_0x0013
            r2.mo7490V0()
        L_0x0013:
            r0.m8882p(r0)
            british.xnews2.t_radio$b r2 = new british.xnews2.t_radio$b
            r2.<init>()
            r0.f6666l = r2
            android.content.Intent r2 = r18.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            r0.f9729n = r2
            java.lang.String r3 = "es_root"
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x0043
            if (r2 == 0) goto L_0x003f
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x003f
            android.os.Bundle r2 = r0.f9729n
            boolean r2 = r2.getBoolean(r3, r5)
            if (r2 == 0) goto L_0x003f
            r2 = 1
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            r0.f6659e = r2
            goto L_0x0054
        L_0x0043:
            boolean r2 = r1.containsKey(r3)
            if (r2 == 0) goto L_0x0051
            boolean r2 = r1.getBoolean(r3, r5)
            if (r2 == 0) goto L_0x0051
            r2 = 1
            goto L_0x0052
        L_0x0051:
            r2 = 0
        L_0x0052:
            r0.f6659e = r2
        L_0x0054:
            android.content.Intent r2 = r18.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            r0.f9729n = r2
            java.lang.String r3 = "ind"
            int r2 = r2.getInt(r3)
            r0.f9693B = r2
            java.lang.String r2 = "sh"
            android.content.SharedPreferences r2 = r0.getSharedPreferences(r2, r5)
            r0.f9749x = r2
            british.xnews2.config r3 = r0.f9727m
            int r3 = r3.f7163D
            if (r3 <= 0) goto L_0x0077
            r2.registerOnSharedPreferenceChangeListener(r0)
        L_0x0077:
            british.xnews2.config r2 = r0.f9727m
            british.xnews2.l[] r3 = r2.f7231O1
            int r6 = r0.f9693B
            r3 = r3[r6]
            java.lang.String r3 = r3.f7916g
            java.lang.String r2 = r2.f7368l1
            java.lang.String r2 = british.xnews2.C1692config.m8189h(r3, r2)
            r0.f6656b = r2
            super.onCreate(r19)
            r2 = 2131558674(0x7f0d0112, float:1.874267E38)
            r0.setContentView(r2)
            r18.mo8887r()
            british.xnews2.config r2 = r0.f9727m
            r2.mo7486N0(r0, r5)
            java.lang.String r2 = "search"
            java.lang.Object r2 = r0.getSystemService(r2)
            android.app.SearchManager r2 = (android.app.SearchManager) r2
            british.xnews2.t_radio$c r3 = new british.xnews2.t_radio$c
            r3.<init>()
            r2.setOnCancelListener(r3)
            british.xnews2.t_radio$d r3 = new british.xnews2.t_radio$d
            r3.<init>()
            r2.setOnDismissListener(r3)
            british.xnews2.config r2 = r0.f9727m
            int r2 = r2.f7427t4
            if (r2 != r4) goto L_0x00c9
            r2 = 2131362124(0x7f0a014c, float:1.834402E38)
            android.view.View r2 = r0.findViewById(r2)
            androidx.drawerlayout.widget.DrawerLayout r2 = (androidx.drawerlayout.widget.DrawerLayout) r2
            british.xnews2.t_radio$e r3 = new british.xnews2.t_radio$e
            r3.<init>()
            r2.mo3255a(r3)
        L_0x00c9:
            british.xnews2.config r2 = r0.f9727m
            android.os.Bundle r3 = r0.f9729n
            if (r3 == 0) goto L_0x00d9
            java.lang.String r6 = "ad_entrar"
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x00d9
            r3 = 1
            goto L_0x00da
        L_0x00d9:
            r3 = 0
        L_0x00da:
            android.os.Bundle r6 = r0.f9729n
            if (r6 == 0) goto L_0x00e8
            java.lang.String r7 = "fb_entrar"
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L_0x00e8
            r6 = 1
            goto L_0x00e9
        L_0x00e8:
            r6 = 0
        L_0x00e9:
            r2.mo7503f1(r0, r3, r6)
            british.xnews2.config r2 = r0.f9727m
            java.lang.String r3 = r2.f7454x3
            java.lang.String r6 = ""
            if (r3 != r6) goto L_0x0107
            java.lang.String r3 = r2.f7461y3
            if (r3 != r6) goto L_0x0107
            java.lang.String r3 = r2.f7468z3
            if (r3 != r6) goto L_0x0107
            java.lang.String r3 = r2.f7149A3
            if (r3 != r6) goto L_0x0107
            java.lang.String r3 = r2.f7155B3
            if (r3 == r6) goto L_0x0105
            goto L_0x0107
        L_0x0105:
            r3 = 0
            goto L_0x0108
        L_0x0107:
            r3 = 1
        L_0x0108:
            r0.f9735q = r3
            if (r3 == 0) goto L_0x0110
            r18.mo8891u()
            goto L_0x0116
        L_0x0110:
            british.xnews2.c r2 = r2.mo7474A0(r0, r5)
            r0.f9731o = r2
        L_0x0116:
            british.xnews2.config r2 = r0.f9727m
            int r3 = r2.f7318d
            java.lang.String r7 = r0.f6656b
            r2.mo7488Q0(r0, r3, r7, r1)
            british.xnews2.config r1 = r0.f9727m
            british.xnews2.l[] r1 = r1.f7231O1
            int r2 = r0.f9693B
            r1 = r1[r2]
            java.lang.String r1 = r1.f7916g
            boolean r1 = r1.equals(r6)
            java.lang.String r2 = "#"
            r3 = 2
            if (r1 != 0) goto L_0x0183
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r7 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r8 = new int[r3]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            british.xnews2.config r10 = r0.f9727m
            british.xnews2.l[] r10 = r10.f7231O1
            int r11 = r0.f9693B
            r10 = r10[r11]
            java.lang.String r10 = r10.f7916g
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            int r9 = android.graphics.Color.parseColor(r9)
            r8[r5] = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            british.xnews2.config r10 = r0.f9727m
            british.xnews2.l[] r10 = r10.f7231O1
            int r11 = r0.f9693B
            r10 = r10[r11]
            java.lang.String r10 = r10.f7919h
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            int r9 = android.graphics.Color.parseColor(r9)
            r8[r4] = r9
            r1.<init>(r7, r8)
            r7 = 2131362530(0x7f0a02e2, float:1.8344843E38)
            android.view.View r7 = r0.findViewById(r7)
            r7.setBackgroundDrawable(r1)
        L_0x0183:
            boolean r1 = r0.f9735q
            r7 = 3
            if (r1 != 0) goto L_0x0272
            british.xnews2.config r1 = r0.f9727m
            british.xnews2.l[] r8 = r1.f7231O1
            int r9 = r0.f9693B
            r10 = r8[r9]
            int r10 = r10.f7958v
            r11 = 2131362370(0x7f0a0242, float:1.8344519E38)
            if (r10 <= 0) goto L_0x023e
            r8 = r8[r9]
            boolean r8 = r8.f7876P
            if (r8 != 0) goto L_0x01e9
            android.view.View r8 = r0.findViewById(r11)     // Catch:{ Exception -> 0x01e6 }
            android.widget.ImageView r8 = (android.widget.ImageView) r8     // Catch:{ Exception -> 0x01e6 }
            british.xnews2.config r9 = r0.f9727m     // Catch:{ Exception -> 0x01e6 }
            british.xnews2.l[] r9 = r9.f7231O1     // Catch:{ Exception -> 0x01e6 }
            int r10 = r0.f9693B     // Catch:{ Exception -> 0x01e6 }
            r9 = r9[r10]     // Catch:{ Exception -> 0x01e6 }
            boolean r9 = r9.f7931l     // Catch:{ Exception -> 0x01e6 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x01e6 }
            british.xnews2.config r10 = r0.f9727m     // Catch:{ Exception -> 0x01e6 }
            british.xnews2.l[] r10 = r10.f7231O1     // Catch:{ Exception -> 0x01e6 }
            int r12 = r0.f9693B     // Catch:{ Exception -> 0x01e6 }
            r10 = r10[r12]     // Catch:{ Exception -> 0x01e6 }
            int r10 = r10.f7934m     // Catch:{ Exception -> 0x01e6 }
            r1.mo7514k1(r8, r9, r10)     // Catch:{ Exception -> 0x01e6 }
            british.xnews2.config r1 = r0.f9727m     // Catch:{ Exception -> 0x01e6 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e6 }
            r8.<init>()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r9 = "fondo_"
            r8.append(r9)     // Catch:{ Exception -> 0x01e6 }
            british.xnews2.config r9 = r0.f9727m     // Catch:{ Exception -> 0x01e6 }
            british.xnews2.l[] r9 = r9.f7231O1     // Catch:{ Exception -> 0x01e6 }
            int r10 = r0.f9693B     // Catch:{ Exception -> 0x01e6 }
            r9 = r9[r10]     // Catch:{ Exception -> 0x01e6 }
            int r9 = r9.f7958v     // Catch:{ Exception -> 0x01e6 }
            r8.append(r9)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01e6 }
            android.view.View r9 = r0.findViewById(r11)     // Catch:{ Exception -> 0x01e6 }
            android.widget.ImageView r9 = (android.widget.ImageView) r9     // Catch:{ Exception -> 0x01e6 }
            r1.mo7493Y(r8, r9)     // Catch:{ Exception -> 0x01e6 }
            goto L_0x0272
        L_0x01e6:
            goto L_0x0272
        L_0x01e9:
            british.xnews2.t_radio$l r1 = new british.xnews2.t_radio$l
            r8 = 0
            r1.<init>()
            java.lang.String[] r8 = new java.lang.String[r7]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            british.xnews2.config r10 = r0.f9727m
            british.xnews2.l[] r10 = r10.f7231O1
            int r11 = r0.f9693B
            r10 = r10[r11]
            int r10 = r10.f7958v
            r9.append(r10)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            r8[r5] = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = r0.f9693B
            r9.append(r10)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            r8[r4] = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            british.xnews2.config r10 = r0.f9727m
            british.xnews2.l[] r10 = r10.f7231O1
            int r11 = r0.f9693B
            r10 = r10[r11]
            int r10 = r10.f7960w
            r9.append(r10)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            r8[r3] = r9
            r1.execute(r8)
            goto L_0x0272
        L_0x023e:
            int r1 = r1.f7163D
            if (r1 <= 0) goto L_0x0272
            android.content.SharedPreferences r1 = r0.f9749x
            java.lang.String r8 = "fondo_v_act"
            int r1 = r1.getInt(r8, r5)
            british.xnews2.config r8 = r0.f9727m
            int r9 = r8.f7163D
            if (r1 != r9) goto L_0x0272
            android.view.View r1 = r0.findViewById(r11)     // Catch:{ Exception -> 0x01e6 }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ Exception -> 0x01e6 }
            british.xnews2.config r9 = r0.f9727m     // Catch:{ Exception -> 0x01e6 }
            boolean r9 = r9.f7145A     // Catch:{ Exception -> 0x01e6 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x01e6 }
            british.xnews2.config r10 = r0.f9727m     // Catch:{ Exception -> 0x01e6 }
            int r10 = r10.f7157C     // Catch:{ Exception -> 0x01e6 }
            r8.mo7514k1(r1, r9, r10)     // Catch:{ Exception -> 0x01e6 }
            british.xnews2.config r1 = r0.f9727m     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r8 = "fondo"
            android.view.View r9 = r0.findViewById(r11)     // Catch:{ Exception -> 0x01e6 }
            android.widget.ImageView r9 = (android.widget.ImageView) r9     // Catch:{ Exception -> 0x01e6 }
            r1.mo7493Y(r8, r9)     // Catch:{ Exception -> 0x01e6 }
        L_0x0272:
            java.lang.String r1 = "sh_mp"
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r5)
            r0.f9751y = r1
            java.lang.String r1 = "sh_mc"
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r5)
            r0.f9753z = r1
            british.xnews2.config r1 = r0.f9727m
            british.xnews2.l[] r1 = r1.f7231O1
            int r8 = r0.f9693B
            r9 = r1[r8]
            boolean r9 = r9.f7852D
            r0.f9695C = r9
            r0.f9737r = r5
            boolean r9 = r0.f9735q
            if (r9 != 0) goto L_0x029a
            r1 = r1[r8]
            int r1 = r1.f7882S
            r0.f9737r = r1
        L_0x029a:
            int r1 = r0.f9737r
            r8 = 14
            r9 = 4
            r10 = 10
            r11 = 1056964608(0x3f000000, float:0.5)
            r12 = 20
            r13 = 12
            if (r1 <= 0) goto L_0x04cc
            r1 = 2131363072(0x7f0a0500, float:1.8345942E38)
            android.view.View r14 = r0.findViewById(r1)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0.f9739s = r14
            r14 = 2131363163(0x7f0a055b, float:1.8346127E38)
            android.view.View r15 = r0.findViewById(r14)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r0.f9741t = r15
            android.content.SharedPreferences r15 = r0.f9753z
            r15.registerOnSharedPreferenceChangeListener(r0)
            android.content.SharedPreferences r15 = r0.f9753z
            android.content.SharedPreferences$Editor r15 = r15.edit()
            java.lang.String r14 = "t_radio_artist"
            r15.remove(r14)
            java.lang.String r14 = "t_radio_song"
            r15.remove(r14)
            r15.commit()
            british.xnews2.config r14 = r0.f9727m
            boolean r14 = r14.f7178F2
            if (r14 == 0) goto L_0x02e6
            android.widget.TextView r14 = r0.f9739s
            android.graphics.Typeface r15 = r14.getTypeface()
            r14.setTypeface(r15, r4)
        L_0x02e6:
            british.xnews2.config r14 = r0.f9727m
            boolean r14 = r14.f7184G2
            if (r14 == 0) goto L_0x02f5
            android.widget.TextView r14 = r0.f9741t
            android.graphics.Typeface r15 = r14.getTypeface()
            r14.setTypeface(r15, r4)
        L_0x02f5:
            british.xnews2.config r14 = r0.f9727m
            int r14 = r14.f7160C2
            if (r14 == 0) goto L_0x0301
            android.widget.TextView r15 = r0.f9739s
            float r14 = (float) r14
            r15.setTextSize(r3, r14)
        L_0x0301:
            british.xnews2.config r14 = r0.f9727m
            int r14 = r14.f7166D2
            if (r14 == 0) goto L_0x030d
            android.widget.TextView r15 = r0.f9741t
            float r14 = (float) r14
            r15.setTextSize(r3, r14)
        L_0x030d:
            r14 = 2131362509(0x7f0a02cd, float:1.83448E38)
            android.view.View r14 = r0.findViewById(r14)
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            android.widget.RelativeLayout$LayoutParams r15 = new android.widget.RelativeLayout$LayoutParams
            r5 = -2
            r1 = -2
            r15.<init>(r5, r1)
            r1 = 1092616192(0x41200000, float:10.0)
            android.content.res.Resources r5 = r18.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r1
            float r5 = r5 + r11
            int r1 = (int) r5
            r15.setMargins(r1, r1, r1, r1)
            british.xnews2.config r1 = r0.f9727m
            int r1 = r1.f7154B2
            if (r1 != r4) goto L_0x0341
            r15.addRule(r10)
            r15.addRule(r8)
            r14.setLayoutParams(r15)
            goto L_0x03d7
        L_0x0341:
            r5 = 21
            r11 = 11
            r4 = 17
            if (r1 != r3) goto L_0x035c
            r15.addRule(r10)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r4) goto L_0x0354
            r15.addRule(r5)
            goto L_0x0357
        L_0x0354:
            r15.addRule(r11)
        L_0x0357:
            r14.setLayoutParams(r15)
            goto L_0x03d7
        L_0x035c:
            if (r1 != r7) goto L_0x0373
            r1 = 15
            r15.addRule(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r4) goto L_0x036b
            r15.addRule(r5)
            goto L_0x036e
        L_0x036b:
            r15.addRule(r11)
        L_0x036e:
            r14.setLayoutParams(r15)
            goto L_0x03d7
        L_0x0373:
            if (r1 != r9) goto L_0x0387
            r15.addRule(r13)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r4) goto L_0x0380
            r15.addRule(r5)
            goto L_0x0383
        L_0x0380:
            r15.addRule(r11)
        L_0x0383:
            r14.setLayoutParams(r15)
            goto L_0x03d7
        L_0x0387:
            r5 = 5
            if (r1 != r5) goto L_0x0394
            r15.addRule(r13)
            r15.addRule(r8)
            r14.setLayoutParams(r15)
            goto L_0x03d7
        L_0x0394:
            r5 = 6
            r11 = 9
            if (r1 != r5) goto L_0x03ab
            r15.addRule(r13)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r4) goto L_0x03a4
            r15.addRule(r12)
            goto L_0x03a7
        L_0x03a4:
            r15.addRule(r11)
        L_0x03a7:
            r14.setLayoutParams(r15)
            goto L_0x03d7
        L_0x03ab:
            r5 = 7
            if (r1 != r5) goto L_0x03c2
            r1 = 15
            r15.addRule(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r4) goto L_0x03bb
            r15.addRule(r12)
            goto L_0x03be
        L_0x03bb:
            r15.addRule(r11)
        L_0x03be:
            r14.setLayoutParams(r15)
            goto L_0x03d7
        L_0x03c2:
            r5 = 8
            if (r1 != r5) goto L_0x03d7
            r15.addRule(r10)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r4) goto L_0x03d1
            r15.addRule(r12)
            goto L_0x03d4
        L_0x03d1:
            r15.addRule(r11)
        L_0x03d4:
            r14.setLayoutParams(r15)
        L_0x03d7:
            british.xnews2.config r1 = r0.f9727m
            boolean r1 = r1.f7190H2
            if (r1 == 0) goto L_0x03e1
            r1 = 1
            r14.setGravity(r1)
        L_0x03e1:
            british.xnews2.config r1 = r0.f9727m
            java.lang.String r1 = r1.f7196I2
            boolean r4 = r1.equals(r6)
            if (r4 == 0) goto L_0x0423
            british.xnews2.config r1 = r0.f9727m
            british.xnews2.l[] r1 = r1.f7231O1
            int r4 = r0.f9693B
            r1 = r1[r4]
            java.lang.String r1 = r1.f7916g
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0420
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            british.xnews2.config r4 = r0.f9727m
            british.xnews2.l[] r4 = r4.f7231O1
            int r5 = r0.f9693B
            r4 = r4[r5]
            java.lang.String r4 = r4.f7916g
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            boolean r1 = british.xnews2.C1692config.m8153I(r1)
            if (r1 == 0) goto L_0x041d
            int r1 = british.xnews2.C1692config.f7101A5
            goto L_0x0436
        L_0x041d:
            int r1 = british.xnews2.C1692config.f7103C5
            goto L_0x0436
        L_0x0420:
            r1 = 0
            r4 = 0
            goto L_0x0438
        L_0x0423:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            int r1 = android.graphics.Color.parseColor(r1)
        L_0x0436:
            r4 = r1
            r1 = 1
        L_0x0438:
            if (r1 == 0) goto L_0x043f
            android.widget.TextView r1 = r0.f9739s
            r1.setTextColor(r4)
        L_0x043f:
            british.xnews2.config r1 = r0.f9727m
            java.lang.String r1 = r1.f7202J2
            boolean r4 = r1.equals(r6)
            if (r4 == 0) goto L_0x0481
            british.xnews2.config r1 = r0.f9727m
            british.xnews2.l[] r1 = r1.f7231O1
            int r4 = r0.f9693B
            r1 = r1[r4]
            java.lang.String r1 = r1.f7916g
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x047e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            british.xnews2.config r4 = r0.f9727m
            british.xnews2.l[] r4 = r4.f7231O1
            int r5 = r0.f9693B
            r4 = r4[r5]
            java.lang.String r4 = r4.f7916g
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            boolean r1 = british.xnews2.C1692config.m8153I(r1)
            if (r1 == 0) goto L_0x047b
            int r1 = british.xnews2.C1692config.f7102B5
            goto L_0x0494
        L_0x047b:
            int r1 = british.xnews2.C1692config.f7104D5
            goto L_0x0494
        L_0x047e:
            r1 = 0
            r4 = 0
            goto L_0x0496
        L_0x0481:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            int r1 = android.graphics.Color.parseColor(r1)
        L_0x0494:
            r4 = r1
            r1 = 1
        L_0x0496:
            if (r1 == 0) goto L_0x049d
            android.widget.TextView r1 = r0.f9741t
            r1.setTextColor(r4)
        L_0x049d:
            int r1 = r0.f9737r
            r4 = 1
            if (r1 == r4) goto L_0x04a7
            if (r1 != r3) goto L_0x04a5
            goto L_0x04a7
        L_0x04a5:
            r5 = 0
            goto L_0x04b2
        L_0x04a7:
            r1 = 2131363072(0x7f0a0500, float:1.8345942E38)
            android.view.View r1 = r0.findViewById(r1)
            r5 = 0
            r1.setVisibility(r5)
        L_0x04b2:
            int r1 = r0.f9737r
            if (r1 == r4) goto L_0x04b8
            if (r1 != r7) goto L_0x04c2
        L_0x04b8:
            r1 = 2131363163(0x7f0a055b, float:1.8346127E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r5)
        L_0x04c2:
            r1 = 2131362509(0x7f0a02cd, float:1.83448E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r5)
        L_0x04cc:
            boolean r1 = r0.f9695C
            if (r1 == 0) goto L_0x04d8
            android.widget.MediaController r1 = new android.widget.MediaController
            r1.<init>(r0, r5)
            r0.f9699E = r1
            goto L_0x04df
        L_0x04d8:
            android.widget.MediaController r1 = new android.widget.MediaController
            r1.<init>(r0)
            r0.f9699E = r1
        L_0x04df:
            android.widget.MediaController r1 = r0.f9699E
            r1.setMediaPlayer(r0)
            android.widget.MediaController r1 = r0.f9699E
            r4 = 2131362850(0x7f0a0422, float:1.8345492E38)
            android.view.View r4 = r0.findViewById(r4)
            r1.setAnchorView(r4)
            r1 = 2131362850(0x7f0a0422, float:1.8345492E38)
            android.view.View r1 = r0.findViewById(r1)
            british.xnews2.t_radio$f r4 = new british.xnews2.t_radio$f
            r4.<init>()
            r1.setOnClickListener(r4)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<british.xnews2.s_mediaplayer_exo> r4 = british.xnews2.s_mediaplayer_exo.class
            r1.<init>(r0, r4)
            british.xnews2.config r4 = r0.f9727m
            british.xnews2.l[] r4 = r4.f7231O1
            int r5 = r0.f9693B
            r4 = r4[r5]
            java.lang.String r4 = r4.f7910e
            java.lang.String r5 = "url"
            r1.putExtra(r5, r4)
            british.xnews2.config r4 = r0.f9727m
            british.xnews2.l[] r4 = r4.f7231O1
            int r5 = r0.f9693B
            r4 = r4[r5]
            java.lang.String r4 = r4.f7925j
            java.lang.String r5 = "ua"
            r1.putExtra(r5, r4)
            java.lang.String r4 = "accion"
            java.lang.String r5 = "iniciar"
            r1.putExtra(r4, r5)
            british.xnews2.config r4 = r0.f9727m
            british.xnews2.l[] r4 = r4.f7231O1
            int r5 = r0.f9693B
            r4 = r4[r5]
            int r4 = r4.f7964y
            java.lang.String r5 = "idsecc"
            r1.putExtra(r5, r4)
            int r4 = r0.f9737r
            java.lang.String r5 = "radio_mostrar"
            r1.putExtra(r5, r4)
            british.xnews2.config r4 = r0.f9727m
            british.xnews2.l[] r4 = r4.f7231O1
            int r5 = r0.f9693B
            r4 = r4[r5]
            java.lang.String r4 = r4.f7898a
            java.lang.String r5 = "secc_tit"
            r1.putExtra(r5, r4)
            boolean r4 = r0.f9695C
            java.lang.String r5 = "esStream"
            r1.putExtra(r5, r4)
            r0.startService(r1)
            british.xnews2.config r1 = r0.f9727m
            boolean r4 = r1.f7369l2
            r0.f9711L = r4
            british.xnews2.l[] r5 = r1.f7231O1
            int r11 = r0.f9693B
            r14 = r5[r11]
            java.lang.String r14 = r14.f7916g
            r0.f9748w0 = r14
            r5 = r5[r11]
            java.lang.String r5 = r5.f7919h
            r0.f9750x0 = r5
            if (r4 == 0) goto L_0x097e
            r4 = 1
            r0.f9712M = r4
            int r4 = r1.f7411r2
            int r5 = r1.f7418s2
            int r11 = r1.f7425t2
            int r1 = r1.f7404q2
            r0.f9717R = r1
            android.content.SharedPreferences r1 = r0.f9749x
            java.lang.String r14 = "nick"
            java.lang.String r1 = r1.getString(r14, r6)
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x05f6
            british.xnews2.config r1 = r0.f9727m
            int r1 = r1.f7393o5
            if (r1 != r7) goto L_0x059f
            android.content.SharedPreferences r1 = r0.f9749x
            java.lang.String r14 = "email_confirmado"
            r15 = 0
            boolean r1 = r1.getBoolean(r14, r15)
            if (r1 != 0) goto L_0x059f
            goto L_0x05f6
        L_0x059f:
            int r1 = r0.f9717R
            if (r1 != r3) goto L_0x05b3
            british.xnews2.config r1 = r0.f9727m
            r14 = 1
            java.io.File r1 = r1.mo7516l0(r0, r14)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x05b1
            goto L_0x05b3
        L_0x05b1:
            r1 = 0
            goto L_0x05f3
        L_0x05b3:
            if (r4 != r3) goto L_0x05d5
            android.content.SharedPreferences r1 = r0.f9749x
            java.lang.String r4 = "fnac_d"
            r14 = 0
            int r1 = r1.getInt(r4, r14)
            if (r1 == 0) goto L_0x05b1
            android.content.SharedPreferences r1 = r0.f9749x
            java.lang.String r4 = "fnac_m"
            int r1 = r1.getInt(r4, r14)
            if (r1 == 0) goto L_0x05b1
            android.content.SharedPreferences r1 = r0.f9749x
            java.lang.String r4 = "fnac_a"
            int r1 = r1.getInt(r4, r14)
            if (r1 == 0) goto L_0x05b1
            goto L_0x05d6
        L_0x05d5:
            r14 = 0
        L_0x05d6:
            if (r5 != r3) goto L_0x05e2
            android.content.SharedPreferences r1 = r0.f9749x
            java.lang.String r4 = "sexo"
            int r1 = r1.getInt(r4, r14)
            if (r1 == 0) goto L_0x05b1
        L_0x05e2:
            if (r11 != r3) goto L_0x05f9
            android.content.SharedPreferences r1 = r0.f9749x
            java.lang.String r4 = "descr"
            java.lang.String r1 = r1.getString(r4, r6)
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x05f9
            goto L_0x05b1
        L_0x05f3:
            r0.f9712M = r1
            goto L_0x05f9
        L_0x05f6:
            r1 = 0
            r0.f9712M = r1
        L_0x05f9:
            android.view.WindowManager r1 = r18.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 13
            if (r4 < r5) goto L_0x0614
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>()
            r1.getSize(r4)
            int r1 = r4.y
            r0.f9715P = r1
            goto L_0x061a
        L_0x0614:
            int r1 = r1.getHeight()
            r0.f9715P = r1
        L_0x061a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            british.xnews2.config r4 = r0.f9727m
            british.xnews2.l[] r4 = r4.f7231O1
            int r5 = r0.f9693B
            r4 = r4[r5]
            java.lang.String r4 = r4.f7916g
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            boolean r1 = british.xnews2.C1692config.m8153I(r1)
            r0.f9707I = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            british.xnews2.config r4 = r0.f9727m
            british.xnews2.l[] r4 = r4.f7231O1
            int r5 = r0.f9693B
            r4 = r4[r5]
            java.lang.String r4 = r4.f7919h
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            boolean r1 = british.xnews2.C1692config.m8153I(r1)
            r0.f9709J = r1
            british.xnews2.config r1 = r0.f9727m
            int r4 = r1.f7338g2
            if (r4 <= 0) goto L_0x0683
            r4 = 1
            r0.f9710K = r4
            java.lang.String r1 = r1.f7356j2
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0687
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            british.xnews2.config r4 = r0.f9727m
            java.lang.String r4 = r4.f7356j2
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            boolean r1 = british.xnews2.C1692config.m8153I(r1)
            r0.f9710K = r1
            goto L_0x0687
        L_0x0683:
            boolean r1 = r0.f9707I
            r0.f9710K = r1
        L_0x0687:
            british.xnews2.config r1 = r0.f9727m     // Catch:{ Exception -> 0x0699 }
            british.xnews2.l[] r1 = r1.f7231O1     // Catch:{ Exception -> 0x0699 }
            int r4 = r0.f9693B     // Catch:{ Exception -> 0x0699 }
            r1 = r1[r4]     // Catch:{ Exception -> 0x0699 }
            british.xnews2.o[] r1 = r1.f7867K0     // Catch:{ Exception -> 0x0699 }
            r4 = 0
            r1 = r1[r4]     // Catch:{ Exception -> 0x0699 }
            int r1 = r1.f8022a     // Catch:{ Exception -> 0x0699 }
            r0.f9714O = r1     // Catch:{ Exception -> 0x0699 }
            goto L_0x069c
        L_0x0699:
            r1 = 0
            r0.f9714O = r1
        L_0x069c:
            british.xnews2.config r1 = r0.f9727m
            int r4 = r1.f7404q2
            r0.f9717R = r4
            boolean r4 = r1.f7376m2
            r0.f9701F = r4
            boolean r4 = r1.f7383n2
            r0.f9703G = r4
            boolean r4 = r1.f7390o2
            r0.f9705H = r4
            int r4 = r1.f7411r2
            r0.f9719T = r4
            int r4 = r1.f7418s2
            r0.f9720U = r4
            int r4 = r1.f7432u2
            r0.f9722W = r4
            int r1 = r1.f7425t2
            r0.f9721V = r1
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.WindowManager r4 = r18.getWindowManager()
            android.view.Display r4 = r4.getDefaultDisplay()
            r4.getMetrics(r1)
            int r4 = r1.widthPixels
            r0.f9730n0 = r4
            int r1 = r1.heightPixels
            r0.f9732o0 = r1
            android.content.res.Resources r1 = r18.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            if (r1 != r3) goto L_0x06e4
            int r4 = r0.f9732o0
        L_0x06e4:
            int r1 = r4 / 2
            double r14 = (double) r1
            r16 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            java.lang.Double.isNaN(r14)
            double r14 = r14 * r16
            int r1 = (int) r14
            r0.f9734p0 = r1
            double r4 = (double) r4
            r14 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r14
            int r1 = (int) r4
            r0.f9736q0 = r1
            int r1 = r0.f9717R
            if (r1 <= 0) goto L_0x0716
            r1 = 50
            int r1 = british.xnews2.C1692config.m8149E(r0, r1)
            int r4 = r0.f9734p0
            int r4 = r4 - r1
            r0.f9734p0 = r4
            int r4 = r0.f9736q0
            int r4 = r4 - r1
            r0.f9736q0 = r4
        L_0x0716:
            int r1 = british.xnews2.C1692config.m8149E(r0, r9)
            r0.f9738r0 = r1
            british.xnews2.config r1 = r0.f9727m
            int r1 = r1.f7338g2
            r4 = 1
            if (r1 != r4) goto L_0x072a
            int r1 = british.xnews2.C1692config.m8149E(r0, r8)
            r0.f9738r0 = r1
            goto L_0x0745
        L_0x072a:
            if (r1 != r3) goto L_0x0734
            r1 = 5
            int r1 = british.xnews2.C1692config.m8149E(r0, r1)
            r0.f9738r0 = r1
            goto L_0x0745
        L_0x0734:
            if (r1 != r7) goto L_0x073d
            int r1 = british.xnews2.C1692config.m8149E(r0, r13)
            r0.f9738r0 = r1
            goto L_0x0745
        L_0x073d:
            if (r1 != r9) goto L_0x0745
            int r1 = british.xnews2.C1692config.m8149E(r0, r9)
            r0.f9738r0 = r1
        L_0x0745:
            int r1 = british.xnews2.C1692config.m8149E(r0, r7)
            r0.f9740s0 = r1
            int r1 = british.xnews2.C1692config.m8149E(r0, r10)
            r0.f9742t0 = r1
            british.xnews2.config r1 = r0.f9727m
            boolean r1 = r1.f7291Y1
            r3 = 2131361965(0x7f0a00ad, float:1.8343697E38)
            if (r1 != 0) goto L_0x0763
            android.view.View r1 = r0.findViewById(r3)
            r4 = 8
            r1.setVisibility(r4)
        L_0x0763:
            r1 = 1120403456(0x42c80000, float:100.0)
            android.content.res.Resources r4 = r18.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r1
            int r4 = (int) r4
            r0.f9702F0 = r4
            r4 = 1077936128(0x40400000, float:3.0)
            android.content.res.Resources r5 = r18.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r4
            float r5 = r5 + r1
            int r4 = (int) r5
            r0.f9704G0 = r4
            r4 = 1077936128(0x40400000, float:3.0)
            android.content.res.Resources r5 = r18.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r4
            float r5 = r5 + r1
            int r1 = (int) r5
            r0.f9706H0 = r1
            java.io.File r1 = r18.getFilesDir()
            r0.f9700E0 = r1
            r1 = 0
            r0.f9723X = r1
            r0.f9725Z = r6
            r0.f9724Y = r6
            r0.f9728m0 = r1
            android.content.SharedPreferences r1 = r0.f9749x
            r4 = 0
            java.lang.String r7 = "idusu"
            long r4 = r1.getLong(r7, r4)
            r0.f9713N = r4
            android.content.SharedPreferences r1 = r0.f9749x
            java.lang.String r4 = "cod"
            java.lang.String r1 = r1.getString(r4, r6)
            r0.f9726l0 = r1
            r1 = 2131362546(0x7f0a02f2, float:1.8344876E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f9744u0 = r1
            r1 = 2131362735(0x7f0a03af, float:1.8345259E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f9746v0 = r1
            java.lang.String r1 = r0.f9748w0
            boolean r1 = r1.equals(r6)
            r4 = 2131362001(0x7f0a00d1, float:1.834377E38)
            if (r1 != 0) goto L_0x0899
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 <= r12) goto L_0x07f9
            android.view.View r5 = r0.findViewById(r4)
            android.widget.EditText r5 = (android.widget.EditText) r5
            boolean r7 = r0.f9707I
            r8 = 1
            r7 = r7 ^ r8
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = r0.f6656b
            british.xnews2.C1692config.m8150F(r5, r7, r8)
            goto L_0x0804
        L_0x07f9:
            android.view.View r5 = r0.findViewById(r4)
            android.widget.EditText r5 = (android.widget.EditText) r5
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.setTextColor(r7)
        L_0x0804:
            boolean r5 = r0.f9709J
            if (r5 != 0) goto L_0x0829
            android.view.View r5 = r0.findViewById(r3)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.content.res.Resources r7 = r18.getResources()
            r8 = 2131231011(0x7f080123, float:1.807809E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r8)
            r5.setImageDrawable(r7)
            if (r1 <= r13) goto L_0x0829
            r5 = 2131362734(0x7f0a03ae, float:1.8345257E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.ProgressBar r5 = (android.widget.ProgressBar) r5
            r0.f9746v0 = r5
        L_0x0829:
            if (r1 <= r12) goto L_0x0832
            android.widget.ProgressBar r1 = r0.f9746v0
            java.lang.String r5 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r1, r5)
        L_0x0832:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r5 = r0.f6656b
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            boolean r1 = british.xnews2.C1692config.m8153I(r1)
            if (r1 == 0) goto L_0x0855
            r1 = 2131362331(0x7f0a021b, float:1.834444E38)
            android.view.View r1 = r0.findViewById(r1)
            r5 = 0
            r1.setVisibility(r5)
            goto L_0x0860
        L_0x0855:
            r5 = 0
            r1 = 2131362330(0x7f0a021a, float:1.8344438E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r5)
        L_0x0860:
            android.content.res.Resources r1 = r18.getResources()
            r5 = 2131230871(0x7f080097, float:1.8077807E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r5)
            java.lang.String r5 = r0.f6656b
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x088d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = r0.f6656b
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            int r2 = android.graphics.Color.parseColor(r2)
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.setColorFilter(r2, r5)
        L_0x088d:
            r2 = 2131361966(0x7f0a00ae, float:1.83437E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r2.setImageDrawable(r1)
        L_0x0899:
            android.view.View r1 = r0.findViewById(r3)
            r1.setOnClickListener(r0)
            r1 = 2131361966(0x7f0a00ae, float:1.83437E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
            android.view.View r1 = r0.findViewById(r4)
            r1.setOnKeyListener(r0)
            r1 = 2131362846(0x7f0a041e, float:1.8345484E38)
            android.view.View r1 = r0.findViewById(r1)
            british.xnews2.t_radio$g r2 = new british.xnews2.t_radio$g
            r2.<init>()
            r1.setOnClickListener(r2)
            r1 = 2131361960(0x7f0a00a8, float:1.8343687E38)
            android.view.View r1 = r0.findViewById(r1)
            british.xnews2.t_radio$h r2 = new british.xnews2.t_radio$h
            r2.<init>()
            r1.setOnClickListener(r2)
            r1 = 2131361960(0x7f0a00a8, float:1.8343687E38)
            android.view.View r1 = r0.findViewById(r1)
            r2 = 0
            r1.setVisibility(r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f9752y0 = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f9754z0 = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f9692A0 = r1
            r1 = 0
            r0.f9694B0 = r1
            boolean r1 = r0.f9710K     // Catch:{ OutOfMemoryError -> 0x0912 }
            if (r1 == 0) goto L_0x0904
            android.content.res.Resources r1 = r18.getResources()     // Catch:{ OutOfMemoryError -> 0x0912 }
            r2 = 2131231487(0x7f0802ff, float:1.8079056E38)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResource(r1, r2)     // Catch:{ OutOfMemoryError -> 0x0912 }
            r0.f9694B0 = r1     // Catch:{ OutOfMemoryError -> 0x0912 }
            goto L_0x0913
        L_0x0904:
            android.content.res.Resources r1 = r18.getResources()     // Catch:{ OutOfMemoryError -> 0x0912 }
            r2 = 2131231485(0x7f0802fd, float:1.8079052E38)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResource(r1, r2)     // Catch:{ OutOfMemoryError -> 0x0912 }
            r0.f9694B0 = r1     // Catch:{ OutOfMemoryError -> 0x0912 }
            goto L_0x0913
        L_0x0912:
        L_0x0913:
            int r1 = r0.f9717R
            if (r1 <= 0) goto L_0x0967
            british.xnews2.config r1 = r0.f9727m
            r2 = 1
            java.io.File r1 = r1.mo7516l0(r0, r2)
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0967 }
            r3.<init>()     // Catch:{ Exception -> 0x0967 }
            r3.inJustDecodeBounds = r2     // Catch:{ Exception -> 0x0967 }
            java.lang.String r4 = r1.getPath()     // Catch:{ Exception -> 0x0967 }
            android.graphics.BitmapFactory.decodeFile(r4, r3)     // Catch:{ Exception -> 0x0967 }
            int r4 = r3.outWidth     // Catch:{ Exception -> 0x0967 }
            r5 = 75
            r6 = 100
            int r3 = r3.outHeight     // Catch:{ Exception -> 0x0967 }
            if (r4 > r5) goto L_0x0939
            if (r3 > r6) goto L_0x0939
            goto L_0x093a
        L_0x0939:
            r2 = 0
        L_0x093a:
            if (r2 != 0) goto L_0x0959
            int r2 = british.xnews2.C1692config.m8193n(r4, r3, r5, r6)     // Catch:{ Exception -> 0x0967 }
            float r3 = (float) r4     // Catch:{ Exception -> 0x0967 }
            float r2 = (float) r2     // Catch:{ Exception -> 0x0967 }
            float r3 = r3 / r2
            int r2 = java.lang.Math.round(r3)     // Catch:{ Exception -> 0x0967 }
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0967 }
            r3.<init>()     // Catch:{ Exception -> 0x0967 }
            r3.inSampleSize = r2     // Catch:{ Exception -> 0x0967 }
            java.lang.String r1 = r1.getPath()     // Catch:{ Exception -> 0x0967 }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r1, r3)     // Catch:{ Exception -> 0x0967 }
            r0.f9694B0 = r1     // Catch:{ Exception -> 0x0967 }
            goto L_0x0967
        L_0x0959:
            android.content.ContentResolver r2 = r18.getContentResolver()     // Catch:{ Exception -> 0x0967 }
            android.net.Uri r1 = android.net.Uri.fromFile(r1)     // Catch:{ Exception -> 0x0967 }
            android.graphics.Bitmap r1 = android.provider.MediaStore.Images.Media.getBitmap(r2, r1)     // Catch:{ Exception -> 0x0967 }
            r0.f9694B0 = r1     // Catch:{ Exception -> 0x0967 }
        L_0x0967:
            r1 = 0
            r0.f9716Q = r1
            boolean r2 = r0.f9712M
            if (r2 == 0) goto L_0x097e
            british.xnews2.t_radio$k r2 = new british.xnews2.t_radio$k
            int r3 = r0.f9716Q
            java.lang.String r4 = "0"
            java.lang.String r5 = "0"
            r2.<init>(r4, r5, r3)
            java.lang.String[] r1 = new java.lang.String[r1]
            r2.execute(r1)
        L_0x097e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_radio.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        com.facebook.ads.AdView adView;
        C1603c cVar3;
        AdView adView2;
        if (!(this.f9727m.f7384n3 == 0 || (cVar3 = this.f9731o) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f9727m.f7384n3 == 0 || (cVar2 = this.f9731o) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f9727m.f7384n3 == 0 || (cVar = this.f9731o) == null || (adColonyAdView = cVar.f6889d) == null)) {
            adColonyAdView.destroy();
        }
        AdView adView3 = this.f9745v;
        if (adView3 != null) {
            adView3.destroy();
        }
        BannerView bannerView = this.f9743u;
        if (bannerView != null) {
            bannerView.destroy();
        }
        com.facebook.ads.AdView adView4 = this.f9747w;
        if (adView4 != null) {
            adView4.destroy();
        }
        IronSourceBannerLayout ironSourceBannerLayout = this.f9727m.f7420s4;
        if (ironSourceBannerLayout != null) {
            IronSource.destroyBanner(ironSourceBannerLayout);
        }
        if ((this.f6659e && isFinishing()) || C1692config.f7111K5) {
            C1692config.m8176Z(this);
        }
        super.onDestroy();
    }

    public void onError(C3371Ad ad, com.facebook.ads.AdError adError) {
        this.f6661g.cancel();
        abrir_secc(this.f6660f);
    }

    public void onFailedToReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        abrir_secc(this.f6660f);
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 66) {
            return false;
        }
        m8883q(true);
        return true;
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        AdView adView;
        if (this.f6657c || isFinishing()) {
            C1692config config = this.f9727m;
            if (config.f7172E2 == 1) {
                try {
                    config.mo7498c1();
                } catch (Exception unused) {
                }
            }
        }
        if (!(this.f9727m.f7384n3 == 0 || (cVar = this.f9731o) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
        this.f9753z.unregisterOnSharedPreferenceChangeListener(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2407a());
    }

    public void onResume() {
        SharedPreferences sharedPreferences;
        C1603c cVar;
        AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (!(this.f9727m.f7384n3 == 0 || (cVar = this.f9731o) == null || (adView = cVar.f6886a) == null)) {
            adView.resume();
        }
        if (!(this.f9737r <= 0 || this.f9739s == null || this.f9741t == null || (sharedPreferences = this.f9753z) == null)) {
            String string = sharedPreferences.getString("t_radio_artist", "");
            if (string.contains("Ã") || string.contains("Â")) {
                try {
                    string = new String(string.getBytes(C6540C.ISO88591_NAME), C6540C.UTF8_NAME);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            this.f9739s.setText(string);
            String string2 = this.f9753z.getString("t_radio_song", "");
            if (string2.contains("Ã") || string2.contains("Â")) {
                try {
                    string2 = new String(string2.getBytes(C6540C.ISO88591_NAME), C6540C.UTF8_NAME);
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                }
            }
            this.f9741t.setText(string2);
        }
        this.f9753z.registerOnSharedPreferenceChangeListener(this);
        if (this.f9711L && this.f9712M) {
            this.f9749x.registerOnSharedPreferenceChangeListener(this);
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f9733p = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f9733p) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f9733p = true;
        C1692config.m8175Y0(this);
    }

    public boolean onSearchRequested() {
        this.f6657c = true;
        this.f6658d = true;
        return super.onSearchRequested();
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:46:0x0110=Splitter:B:46:0x0110, B:33:0x00e3=Splitter:B:33:0x00e3} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSharedPreferenceChanged(android.content.SharedPreferences r8, java.lang.String r9) {
        /*
            r7 = this;
            if (r9 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = "f2_idfrase"
            boolean r0 = r8.contains(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = "f2_ts"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0126
            android.content.SharedPreferences r9 = r7.f9749x
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "ban_"
            r0.append(r2)
            java.lang.String r2 = "f2_id"
            java.lang.String r2 = r8.getString(r2, r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r9 = r9.contains(r0)
            if (r9 != 0) goto L_0x0126
            java.lang.String r9 = "f2_idtema"
            java.lang.String r0 = "0"
            java.lang.String r9 = r8.getString(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r7.f9714O
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0126
            boolean r9 = r7.f9711L
            if (r9 == 0) goto L_0x0126
            boolean r9 = r7.f9712M
            if (r9 == 0) goto L_0x0126
            british.xnews2.t_radio$i r9 = new british.xnews2.t_radio$i
            r9.<init>(r8)
            r7.runOnUiThread(r9)
            goto L_0x0126
        L_0x0065:
            java.lang.String r0 = "fondo_v_act"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x00b4
            british.xnews2.config r8 = r7.f9727m
            british.xnews2.l[] r9 = r8.f7231O1
            int r0 = r7.f9693B
            r9 = r9[r0]
            int r9 = r9.f7958v
            if (r9 != 0) goto L_0x0126
            r9 = 2131362370(0x7f0a0242, float:1.8344519E38)
            android.view.View r0 = r7.findViewById(r9)     // Catch:{ Exception -> 0x0126 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x0126 }
            british.xnews2.config r1 = r7.f9727m     // Catch:{ Exception -> 0x0126 }
            boolean r1 = r1.f7145A     // Catch:{ Exception -> 0x0126 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0126 }
            british.xnews2.config r2 = r7.f9727m     // Catch:{ Exception -> 0x0126 }
            int r2 = r2.f7157C     // Catch:{ Exception -> 0x0126 }
            r8.mo7514k1(r0, r1, r2)     // Catch:{ Exception -> 0x0126 }
            android.view.View r8 = r7.findViewById(r9)     // Catch:{ Exception -> 0x0126 }
            android.widget.ImageView r8 = (android.widget.ImageView) r8     // Catch:{ Exception -> 0x0126 }
            r0 = 8
            r8.setVisibility(r0)     // Catch:{ Exception -> 0x0126 }
            british.xnews2.config r8 = r7.f9727m     // Catch:{ Exception -> 0x0126 }
            java.lang.String r0 = "fondo"
            android.view.View r1 = r7.findViewById(r9)     // Catch:{ Exception -> 0x0126 }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ Exception -> 0x0126 }
            r8.mo7493Y(r0, r1)     // Catch:{ Exception -> 0x0126 }
            android.view.View r8 = r7.findViewById(r9)     // Catch:{ Exception -> 0x0126 }
            android.widget.ImageView r8 = (android.widget.ImageView) r8     // Catch:{ Exception -> 0x0126 }
            british.xnews2.C1692config.m8172V(r8)     // Catch:{ Exception -> 0x0126 }
            goto L_0x0126
        L_0x00b4:
            java.lang.String r0 = "t_radio_artist"
            boolean r2 = r9.equals(r0)
            java.lang.String r3 = "UTF-8"
            java.lang.String r4 = "ISO-8859-1"
            java.lang.String r5 = "Â"
            java.lang.String r6 = "Ã"
            if (r2 == 0) goto L_0x00e9
            java.lang.String r8 = r8.getString(r0, r1)
            boolean r9 = r8.contains(r6)
            if (r9 != 0) goto L_0x00d4
            boolean r9 = r8.contains(r5)
            if (r9 == 0) goto L_0x00e3
        L_0x00d4:
            java.lang.String r9 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00df }
            byte[] r0 = r8.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x00df }
            r9.<init>(r0, r3)     // Catch:{ UnsupportedEncodingException -> 0x00df }
            r8 = r9
            goto L_0x00e3
        L_0x00df:
            r9 = move-exception
            r9.printStackTrace()
        L_0x00e3:
            android.widget.TextView r9 = r7.f9739s     // Catch:{ Exception -> 0x0126 }
            r9.setText(r8)     // Catch:{ Exception -> 0x0126 }
            goto L_0x0126
        L_0x00e9:
            java.lang.String r0 = "t_radio_song"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0116
            java.lang.String r8 = r8.getString(r0, r1)
            boolean r9 = r8.contains(r6)
            if (r9 != 0) goto L_0x0101
            boolean r9 = r8.contains(r5)
            if (r9 == 0) goto L_0x0110
        L_0x0101:
            java.lang.String r9 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x010c }
            byte[] r0 = r8.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x010c }
            r9.<init>(r0, r3)     // Catch:{ UnsupportedEncodingException -> 0x010c }
            r8 = r9
            goto L_0x0110
        L_0x010c:
            r9 = move-exception
            r9.printStackTrace()
        L_0x0110:
            android.widget.TextView r9 = r7.f9741t     // Catch:{ Exception -> 0x0126 }
            r9.setText(r8)     // Catch:{ Exception -> 0x0126 }
            goto L_0x0126
        L_0x0116:
            android.widget.MediaController r8 = r7.f9699E
            if (r8 == 0) goto L_0x0126
            boolean r8 = r8.isShowing()
            if (r8 == 0) goto L_0x0126
            android.widget.MediaController r8 = r7.f9699E
            r9 = 0
            r8.show(r9)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_radio.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }

    public void onStop() {
        super.onStop();
        if (this.f6657c && !this.f6658d) {
            finish();
        }
    }

    public void onVideoCompleted() {
        this.f9733p = true;
        C1692config.m8175Y0(this);
    }

    public void pause() {
        Intent intent = new Intent(this, s_mediaplayer_exo.class);
        intent.putExtra("url", this.f9727m.f7231O1[this.f9693B].f7910e);
        intent.putExtra("ua", this.f9727m.f7231O1[this.f9693B].f7925j);
        intent.putExtra("accion", "pause");
        intent.putExtra("idsecc", this.f9727m.f7231O1[this.f9693B].f7964y);
        intent.putExtra("radio_mostrar", this.f9737r);
        intent.putExtra("secc_tit", this.f9727m.f7231O1[this.f9693B].f7898a);
        intent.putExtra("esStream", this.f9695C);
        startService(intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo8887r() {
        int q0 = this.f9727m.mo7522q0(this);
        int i = this.f9727m.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f9691A = listView;
            this.f9727m.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f9727m.f7231O1;
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
            int[] iArr = this.f9727m.f7249R1;
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
    /* renamed from: s */
    public void mo8888s() {
        boolean z;
        if (!this.f9725Z.equals("")) {
            Date date = null;
            try {
                date = new SimpleDateFormat("ddMMyy").parse(this.f9725Z);
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
                z = false;
            }
            if (z) {
                TextView textView = new TextView(this);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                int i = this.f9706H0;
                layoutParams.setMargins(0, i * 4, 0, i * 2);
                textView.setLayoutParams(layoutParams);
                int i2 = this.f9704G0;
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
                this.f9744u0.addView(textView, 0);
            }
        }
    }

    public void seekTo(int i) {
        Intent intent = new Intent(this, s_mediaplayer_exo.class);
        intent.putExtra("url", this.f9727m.f7231O1[this.f9693B].f7910e);
        intent.putExtra("ua", this.f9727m.f7231O1[this.f9693B].f7925j);
        intent.putExtra("accion", "seekto");
        intent.putExtra("valor", i);
        intent.putExtra("idsecc", this.f9727m.f7231O1[this.f9693B].f7964y);
        intent.putExtra("secc_tit", this.f9727m.f7231O1[this.f9693B].f7898a);
        intent.putExtra("esStream", this.f9695C);
        intent.putExtra("radio_mostrar", this.f9737r);
        startService(intent);
    }

    public void start() {
        Intent intent = new Intent(this, s_mediaplayer_exo.class);
        intent.putExtra("url", this.f9727m.f7231O1[this.f9693B].f7910e);
        intent.putExtra("ua", this.f9727m.f7231O1[this.f9693B].f7925j);
        intent.putExtra("accion", "play");
        intent.putExtra("idsecc", this.f9727m.f7231O1[this.f9693B].f7964y);
        intent.putExtra("radio_mostrar", this.f9737r);
        intent.putExtra("secc_tit", this.f9727m.f7231O1[this.f9693B].f7898a);
        intent.putExtra("esStream", this.f9695C);
        startService(intent);
    }

    /* renamed from: u */
    public void mo8891u() {
        ArrayList arrayList = new ArrayList();
        if (!this.f9727m.f7454x3.equals("")) {
            arrayList.add(1);
        }
        if (!this.f9727m.f7461y3.equals("")) {
            arrayList.add(2);
        }
        if (!this.f9727m.f7468z3.equals("") && getResources().getConfiguration().orientation == 1) {
            arrayList.add(3);
        }
        if (!this.f9727m.f7149A3.equals("")) {
            arrayList.add(4);
        }
        if (!this.f9727m.f7155B3.equals("")) {
            arrayList.add(5);
        }
        if (!arrayList.isEmpty()) {
            int intValue = ((Integer) arrayList.get(new Random().nextInt(((arrayList.size() - 1) - 0) + 1) + 0)).intValue();
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_ad_rad);
            linearLayout.removeAllViews();
            if (intValue == 1) {
                this.f9745v = new AdView(this);
                if (getResources().getConfiguration().orientation == 2) {
                    this.f9745v.setAdSize(AdSize.LARGE_BANNER);
                } else {
                    this.f9745v.setAdSize(AdSize.MEDIUM_RECTANGLE);
                }
                this.f9745v.setAdUnitId(this.f9727m.f7454x3);
                linearLayout.addView(this.f9745v);
                if (!((DrawerLayout) findViewById(R.id.drawer_layout)).mo3241A(8388611)) {
                    linearLayout.setVisibility(0);
                }
                this.f9745v.loadAd(new AdRequest.Builder().build());
            } else if (intValue == 2) {
                BannerView bannerView = new BannerView(this);
                this.f9743u = bannerView;
                bannerView.setPlacementId(this.f9727m.f7461y3);
                if (getResources().getConfiguration().orientation == 2) {
                    this.f9743u.setBannerSize(BannerSize.LARGE_BANNER);
                } else {
                    this.f9743u.setBannerSize(BannerSize.MEDIUM_RECTANGLE);
                }
                linearLayout.addView(this.f9743u);
                if (!((DrawerLayout) findViewById(R.id.drawer_layout)).mo3241A(8388611)) {
                    linearLayout.setVisibility(0);
                }
                BannerAdRequest bannerAdRequest = new BannerAdRequest();
                bannerAdRequest.setMute(false).setCreativeType("static");
                this.f9743u.loadAd(bannerAdRequest);
            } else if (intValue == 3) {
                com.facebook.ads.AdView adView = new com.facebook.ads.AdView((Context) this, this.f9727m.f7468z3, com.facebook.ads.AdSize.RECTANGLE_HEIGHT_250);
                this.f9747w = adView;
                linearLayout.addView(adView);
                if (!((DrawerLayout) findViewById(R.id.drawer_layout)).mo3241A(8388611)) {
                    linearLayout.setVisibility(0);
                }
                this.f9747w.loadAd();
            } else if (intValue == 4) {
                Mrec mrec = new Mrec((Activity) this);
                mrec.setAdTag("AUDIO SECTION");
                linearLayout.addView(mrec);
                if (!((DrawerLayout) findViewById(R.id.drawer_layout)).mo3241A(8388611)) {
                    linearLayout.setVisibility(0);
                }
            } else if (intValue == 5) {
                IronSourceBannerLayout ironSourceBannerLayout = this.f9727m.f7420s4;
                if (ironSourceBannerLayout != null) {
                    IronSource.destroyBanner(ironSourceBannerLayout);
                }
                this.f9727m.f7420s4 = IronSource.createBanner(this, ISBannerSize.RECTANGLE);
                linearLayout.addView(this.f9727m.f7420s4);
                if (!((DrawerLayout) findViewById(R.id.drawer_layout)).mo3241A(8388611)) {
                    linearLayout.setVisibility(0);
                }
                IronSource.loadBanner(this.f9727m.f7420s4);
            }
        }
    }

    public void videoEnded() {
        this.f9733p = true;
        C1692config.m8175Y0(this);
    }
}
