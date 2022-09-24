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
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import british.xnews2.t_chat;
import com.adcolony.sdk.AdColonyAdView;
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
import com.facebook.ads.AdError;
import com.facebook.ads.AdView;
import com.facebook.ads.C3371Ad;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.VideoListener;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import p272b9.C11188h;
import p307g8.C12725i;
import p312i9.C12788b;
import p312i9.C12789c;
import p316k9.C12823d;
import p317l8.C12831e;
import p337x8.C12957d;
import p337x8.C12960g;
import p339y8.C12978b;
import p339y8.C12981e;
import p339y8.C12982f;

public class profile extends Activity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    String f8244A;

    /* renamed from: A0 */
    TextView f8245A0;

    /* renamed from: B */
    String f8246B;

    /* renamed from: B0 */
    TextView f8247B0;

    /* renamed from: C */
    String f8248C;

    /* renamed from: C0 */
    TextView f8249C0;

    /* renamed from: D */
    ArrayList<C1988e0> f8250D = new ArrayList<>();

    /* renamed from: D0 */
    boolean f8251D0 = false;

    /* renamed from: E */
    ArrayList<C1990f0> f8252E = new ArrayList<>();

    /* renamed from: E0 */
    boolean f8253E0;

    /* renamed from: F */
    C1692config f8254F;

    /* renamed from: F0 */
    boolean f8255F0;

    /* renamed from: G */
    File f8256G;

    /* renamed from: G0 */
    boolean f8257G0;

    /* renamed from: H */
    ImageView f8258H;

    /* renamed from: H0 */
    boolean f8259H0;

    /* renamed from: I */
    ImageView f8260I;

    /* renamed from: I0 */
    boolean f8261I0 = false;

    /* renamed from: J */
    ImageView f8262J;

    /* renamed from: J0 */
    boolean f8263J0;

    /* renamed from: K */
    ImageView f8264K;

    /* renamed from: K0 */
    C1603c f8265K0;

    /* renamed from: L */
    ImageView f8266L;

    /* renamed from: L0 */
    Bundle f8267L0;

    /* renamed from: M */
    ImageView f8268M;

    /* renamed from: M0 */
    Bitmap f8269M0;

    /* renamed from: N */
    ImageView f8270N;

    /* renamed from: N0 */
    C2000k0 f8271N0;

    /* renamed from: O */
    ImageView f8272O;

    /* renamed from: O0 */
    C1998j0 f8273O0;

    /* renamed from: P */
    ImageView f8274P;

    /* renamed from: P0 */
    C2006n0 f8275P0;

    /* renamed from: Q */
    ImageView f8276Q;

    /* renamed from: Q0 */
    C2032v0 f8277Q0;

    /* renamed from: R */
    ProgressBar f8278R;

    /* renamed from: R0 */
    C2012q0 f8279R0;

    /* renamed from: S */
    ProgressBar f8280S;

    /* renamed from: S0 */
    boolean f8281S0 = false;

    /* renamed from: T */
    ProgressBar f8282T;

    /* renamed from: T0 */
    ProgressDialog f8283T0;

    /* renamed from: U */
    ProgressBar f8284U;
    /* access modifiers changed from: private */

    /* renamed from: U0 */
    public ArrayList<C1789f0> f8285U0 = new ArrayList<>();

    /* renamed from: V */
    ProgressBar f8286V;
    /* access modifiers changed from: private */

    /* renamed from: V0 */
    public C1770e0 f8287V0;

    /* renamed from: W */
    ProgressBar f8288W;

    /* renamed from: W0 */
    C2002l0 f8289W0;

    /* renamed from: X */
    ProgressBar f8290X;

    /* renamed from: X0 */
    AlertDialog.Builder f8291X0;

    /* renamed from: Y */
    ProgressBar f8292Y;

    /* renamed from: Y0 */
    View f8293Y0;

    /* renamed from: Z */
    ProgressBar f8294Z;

    /* renamed from: Z0 */
    ListView f8295Z0;

    /* renamed from: a1 */
    SharedPreferences f8296a1;

    /* renamed from: l0 */
    TextView f8297l0;

    /* renamed from: m */
    long f8298m;

    /* renamed from: m0 */
    LinearLayout f8299m0;

    /* renamed from: n */
    long f8300n;

    /* renamed from: n0 */
    LinearLayout f8301n0;

    /* renamed from: o */
    int f8302o;

    /* renamed from: o0 */
    LinearLayout f8303o0;

    /* renamed from: p */
    int f8304p;

    /* renamed from: p0 */
    LinearLayout f8305p0;

    /* renamed from: q */
    int f8306q;

    /* renamed from: q0 */
    LinearLayout f8307q0;

    /* renamed from: r */
    int f8308r;

    /* renamed from: r0 */
    LinearLayout f8309r0;

    /* renamed from: s */
    int f8310s = -1;

    /* renamed from: s0 */
    LinearLayout f8311s0;

    /* renamed from: t */
    int f8312t = 0;

    /* renamed from: t0 */
    LinearLayout f8313t0;

    /* renamed from: u */
    int f8314u = 0;

    /* renamed from: u0 */
    LinearLayout f8315u0;

    /* renamed from: v */
    int f8316v = 0;

    /* renamed from: v0 */
    TextView f8317v0;

    /* renamed from: w */
    String f8318w;

    /* renamed from: w0 */
    TextView f8319w0;

    /* renamed from: x */
    String f8320x;

    /* renamed from: x0 */
    TextView f8321x0;

    /* renamed from: y */
    String f8322y;

    /* renamed from: y0 */
    TextView f8323y0;

    /* renamed from: z */
    String f8324z;

    /* renamed from: z0 */
    TextView f8325z0;

    /* renamed from: british.xnews2.profile$a */
    class C1979a implements DialogInterface.OnClickListener {
        C1979a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: british.xnews2.profile$a0 */
    class C1980a0 implements NativeAdListener {

        /* renamed from: b */
        final /* synthetic */ NativeBannerAd f8327b;

        C1980a0(NativeBannerAd nativeBannerAd) {
            this.f8327b = nativeBannerAd;
        }

        public void onAdClicked(C3371Ad ad) {
        }

        public void onAdLoaded(C3371Ad ad) {
            NativeAdViewAttributes backgroundColor = new NativeAdViewAttributes().setTypeface(Typeface.MONOSPACE).setBackgroundColor(C1692config.f7104D5);
            String str = profile.this.f8246B;
            if (str != null && !str.equals("")) {
                int o = C1692config.m8194o(Color.parseColor("#" + profile.this.f8246B), 0.2f, 0);
                backgroundColor.setBackgroundColor(o);
                if (C1692config.m8155J(o)) {
                    backgroundColor.setTitleTextColor(-16777216);
                    backgroundColor.setDescriptionTextColor(-16777216);
                } else {
                    backgroundColor.setTitleTextColor(-1);
                    backgroundColor.setDescriptionTextColor(-1);
                }
            }
            String str2 = profile.this.f6656b;
            if (str2 != null && !str2.equals("")) {
                backgroundColor.setButtonColor(Color.parseColor("#" + profile.this.f6656b));
                if (C1692config.m8153I("#" + profile.this.f6656b)) {
                    backgroundColor.setButtonTextColor(-16777216);
                } else {
                    backgroundColor.setButtonTextColor(-1);
                }
            }
            View render = NativeBannerAdView.render(profile.this, this.f8327b, NativeBannerAdView.Type.HEIGHT_100, backgroundColor);
            LinearLayout linearLayout = (LinearLayout) profile.this.findViewById(R.id.ll_nat);
            try {
                if (profile.this.f8259H0) {
                    linearLayout.setBackgroundColor(-16777216);
                } else {
                    linearLayout.setBackgroundColor(-1);
                }
                int E = C1692config.m8149E(profile.this.getApplicationContext(), 1);
                linearLayout.setPadding(E, E, E, E);
            } catch (Exception e) {
                e.printStackTrace();
            }
            linearLayout.setVisibility(0);
            ((LinearLayout) profile.this.findViewById(R.id.ll_nat_ad)).removeAllViews();
            ((LinearLayout) profile.this.findViewById(R.id.ll_nat_ad)).addView(render);
        }

        public void onError(C3371Ad ad, AdError adError) {
        }

        public void onLoggingImpression(C3371Ad ad) {
        }

        public void onMediaDownloaded(C3371Ad ad) {
        }
    }

    /* renamed from: british.xnews2.profile$b */
    class C1981b implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8329a;

        C1981b(AlertDialog alertDialog) {
            this.f8329a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8329a.getButton(-2);
            button.setTextColor(Color.parseColor("#" + profile.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.profile$b0 */
    class C1982b0 implements BannerListener {
        C1982b0() {
        }

        public void onClick(View view) {
        }

        public void onFailedToReceiveAd(View view) {
        }

        public void onImpression(View view) {
        }

        public void onReceiveAd(View view) {
            LinearLayout linearLayout = (LinearLayout) profile.this.findViewById(R.id.ll_nat);
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                LinearLayout linearLayout2 = (LinearLayout) profile.this.findViewById(R.id.ll_nat_ad);
                if (linearLayout2 != null) {
                    linearLayout2.removeAllViews();
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (Build.VERSION.SDK_INT >= 17) {
                        layoutParams.addRule(20);
                    } else {
                        layoutParams.addRule(9);
                    }
                    linearLayout2.addView(view, layoutParams);
                }
            }
        }
    }

    /* renamed from: british.xnews2.profile$c */
    class C1983c extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8332a;

        /* renamed from: b */
        final /* synthetic */ ProgressBar f8333b;

        C1983c(AlertDialog alertDialog, ProgressBar progressBar) {
            this.f8332a = alertDialog;
            this.f8333b = progressBar;
        }

        public void onPageFinished(WebView webView, String str) {
            if (str.startsWith(C1692config.f7107G5 + "games-scores.e-droid.net")) {
                this.f8333b.setVisibility(8);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.String r6 = ""
                java.lang.String r0 = "http://jugar/"
                boolean r0 = r7.startsWith(r0)
                r1 = 1
                if (r0 != 0) goto L_0x0013
                java.lang.String r0 = "https://jugar/"
                boolean r0 = r7.startsWith(r0)
                if (r0 == 0) goto L_0x0078
            L_0x0013:
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x001e }
                java.lang.String r0 = "id"
                java.lang.String r7 = r7.getQueryParameter(r0)     // Catch:{ Exception -> 0x001e }
                goto L_0x001f
            L_0x001e:
                r7 = r6
            L_0x001f:
                boolean r6 = r7.equals(r6)
                if (r6 != 0) goto L_0x0078
                r6 = 0
                r0 = 0
                r2 = 0
            L_0x0028:
                british.xnews2.profile r3 = british.xnews2.profile.this
                british.xnews2.config r3 = r3.f8254F
                british.xnews2.l[] r3 = r3.f7231O1
                int r4 = r3.length
                if (r0 >= r4) goto L_0x0051
                if (r2 != 0) goto L_0x0051
                r2 = r3[r0]
                int r3 = r2.f7954t
                if (r3 != r1) goto L_0x004d
                java.lang.String r3 = r2.f7910e
                java.lang.String r4 = "games.e-droid.net"
                boolean r3 = r3.contains(r4)
                if (r3 == 0) goto L_0x004d
                java.lang.String r2 = r2.f7924i1
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x004d
                r2 = 1
                goto L_0x004e
            L_0x004d:
                r2 = 0
            L_0x004e:
                int r0 = r0 + 1
                goto L_0x0028
            L_0x0051:
                if (r2 == 0) goto L_0x0078
                int r0 = r0 + -1
                android.view.View r6 = new android.view.View
                british.xnews2.profile r7 = british.xnews2.profile.this
                r6.<init>(r7)
                r7 = 2131361812(0x7f0a0014, float:1.8343387E38)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r6.setTag(r7, r0)
                r7 = 2131362979(0x7f0a04a3, float:1.8345754E38)
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r6.setTag(r7, r0)
                android.app.AlertDialog r7 = r5.f8332a
                r7.dismiss()
                british.xnews2.profile r7 = british.xnews2.profile.this     // Catch:{ Exception -> 0x0078 }
                r7.abrir_secc(r6)     // Catch:{ Exception -> 0x0078 }
            L_0x0078:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.profile.C1983c.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    /* renamed from: british.xnews2.profile$c0 */
    class C1984c0 implements BannerView.IListener {
        C1984c0() {
        }

        public void onBannerClick(BannerView bannerView) {
        }

        public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        }

        public void onBannerLeftApplication(BannerView bannerView) {
        }

        public void onBannerLoaded(BannerView bannerView) {
            ((LinearLayout) profile.this.findViewById(R.id.ll_nat)).setVisibility(0);
            ((LinearLayout) profile.this.findViewById(R.id.ll_nat_ad)).removeAllViews();
            ((LinearLayout) profile.this.findViewById(R.id.ll_nat_ad)).addView(bannerView);
        }
    }

    /* renamed from: british.xnews2.profile$d */
    class C1985d implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8336a;

        C1985d(AlertDialog alertDialog) {
            this.f8336a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8336a.getButton(-2);
            button.setTextColor(Color.parseColor("#" + profile.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.profile$d0 */
    class C1986d0 implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8338a;

        C1986d0(AlertDialog alertDialog) {
            this.f8338a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8338a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + profile.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.profile$e */
    class C1987e implements DialogInterface.OnClickListener {
        C1987e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: british.xnews2.profile$e0 */
    private class C1988e0 {

        /* renamed from: a */
        public String f8341a;

        /* renamed from: b */
        public String f8342b;

        /* renamed from: c */
        public String f8343c;

        /* renamed from: d */
        public String f8344d;

        /* renamed from: e */
        public boolean f8345e;

        private C1988e0() {
            this.f8345e = false;
        }
    }

    /* renamed from: british.xnews2.profile$f */
    class C1989f implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8347a;

        C1989f(AlertDialog alertDialog) {
            this.f8347a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8347a.getButton(-2);
            button.setTextColor(Color.parseColor("#" + profile.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.profile$f0 */
    private class C1990f0 {

        /* renamed from: a */
        public String f8349a;

        /* renamed from: b */
        public String f8350b;

        /* renamed from: c */
        public String f8351c;

        /* renamed from: d */
        public String f8352d;

        /* renamed from: e */
        public String f8353e;

        /* renamed from: f */
        public boolean f8354f;

        private C1990f0() {
            this.f8354f = false;
        }
    }

    /* renamed from: british.xnews2.profile$g */
    class C1991g implements AdapterView.OnItemClickListener {
        C1991g() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C1789f0 f0Var = (C1789f0) profile.this.f8285U0.get(i);
            if (f0Var.f7709c) {
                C2002l0 l0Var = profile.this.f8289W0;
                if (l0Var == null || l0Var.getStatus() != AsyncTask.Status.RUNNING) {
                    profile.this.f8289W0 = new C2002l0();
                    profile.this.f8289W0.execute(new String[0]);
                    return;
                }
                return;
            }
            String str = f0Var.f7712f;
            if (!str.equals(profile.this.f8300n + "")) {
                String str2 = f0Var.f7712f;
                if (!str2.equals(profile.this.f8320x + "")) {
                    Intent intent = new Intent(profile.this, profile.class);
                    intent.putExtra(TtmlNode.ATTR_ID, f0Var.f7712f);
                    intent.putExtra("privados", f0Var.f7714h);
                    intent.putExtra("nombre", f0Var.f7711e);
                    intent.putExtra("coments", f0Var.f7716j);
                    intent.putExtra("fnac_d", f0Var.f7717k);
                    intent.putExtra("fnac_m", f0Var.f7718l);
                    intent.putExtra("fnac_a", f0Var.f7719m);
                    intent.putExtra("sexo", f0Var.f7715i);
                    intent.putExtra("vfoto", f0Var.f7713g);
                    if (profile.this.f8267L0.containsKey("desdepriv")) {
                        intent.putExtra("desdepriv", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    }
                    intent.putExtra("p_fnac", profile.this.f8267L0.getInt("p_fnac"));
                    intent.putExtra("p_sexo", profile.this.f8267L0.getInt("p_sexo"));
                    intent.putExtra("p_descr", profile.this.f8267L0.getInt("p_descr"));
                    intent.putExtra("p_dist", profile.this.f8267L0.getInt("p_dist"));
                    intent.putExtra("coments_chat", profile.this.f8267L0.getBoolean("coments_chat"));
                    intent.putExtra("galeria", profile.this.f8267L0.getBoolean("galeria"));
                    intent.putExtra("privados_chat", profile.this.f8267L0.getBoolean("privados_chat"));
                    intent.putExtra("fotos_perfil", profile.this.f8302o);
                    intent.putExtra("fotos_chat", profile.this.f8267L0.getInt("fotos_chat"));
                    profile.this.startActivityForResult(intent, 0);
                }
            }
        }
    }

    /* renamed from: british.xnews2.profile$g0 */
    private class C1992g0 extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f8357a;

        C1992g0(Boolean bool) {
            this.f8357a = bool.booleanValue() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : SessionDescription.SUPPORTED_SDP_VERSION;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0095  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x009b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008e }
                r0.<init>()     // Catch:{ Exception -> 0x008e }
                java.lang.String r1 = british.xnews2.C1692config.f7109I5     // Catch:{ Exception -> 0x008e }
                r0.append(r1)     // Catch:{ Exception -> 0x008e }
                java.lang.String r1 = "/srv/favorito_usu.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x008e }
                british.xnews2.profile r1 = british.xnews2.profile.this     // Catch:{ Exception -> 0x008e }
                long r1 = r1.f8300n     // Catch:{ Exception -> 0x008e }
                r0.append(r1)     // Catch:{ Exception -> 0x008e }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x008e }
                british.xnews2.profile r1 = british.xnews2.profile.this     // Catch:{ Exception -> 0x008e }
                java.lang.String r1 = r1.f8318w     // Catch:{ Exception -> 0x008e }
                r0.append(r1)     // Catch:{ Exception -> 0x008e }
                java.lang.String r1 = "&idusu_pro="
                r0.append(r1)     // Catch:{ Exception -> 0x008e }
                british.xnews2.profile r1 = british.xnews2.profile.this     // Catch:{ Exception -> 0x008e }
                java.lang.String r1 = r1.f8320x     // Catch:{ Exception -> 0x008e }
                r0.append(r1)     // Catch:{ Exception -> 0x008e }
                java.lang.String r1 = "&modo="
                r0.append(r1)     // Catch:{ Exception -> 0x008e }
                java.lang.String r1 = r5.f8357a     // Catch:{ Exception -> 0x008e }
                r0.append(r1)     // Catch:{ Exception -> 0x008e }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x008e }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x008e }
                r1.<init>(r0)     // Catch:{ Exception -> 0x008e }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x008e }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x008e }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r1)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                r0.setReadTimeout(r1)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                java.lang.String r1 = "User-Agent"
                java.lang.String r2 = "Android Vinebre Software"
                r0.setRequestProperty(r1, r2)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                r3.<init>(r1)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
            L_0x0069:
                java.lang.String r1 = r2.readLine()     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                if (r1 == 0) goto L_0x007d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                r3.<init>()     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                r3.append(r1)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                java.lang.String r1 = "\n"
                r3.append(r1)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                goto L_0x0069
            L_0x007d:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
                r0.disconnect()
                return r6
            L_0x0085:
                r6 = move-exception
                goto L_0x0099
            L_0x0087:
                r6 = r0
                goto L_0x008e
            L_0x0089:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x0099
            L_0x008e:
                r0 = 2
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x0089 }
                if (r6 == 0) goto L_0x0098
                r6.disconnect()
            L_0x0098:
                return r0
            L_0x0099:
                if (r0 == 0) goto L_0x009e
                r0.disconnect()
            L_0x009e:
                goto L_0x00a0
            L_0x009f:
                throw r6
            L_0x00a0:
                goto L_0x009f
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.profile.C1992g0.doInBackground(java.lang.String[]):java.lang.Byte");
        }
    }

    /* renamed from: british.xnews2.profile$h */
    class C1993h implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8359a;

        C1993h(AlertDialog alertDialog) {
            this.f8359a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8359a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + profile.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.profile$h0 */
    private class C1994h0 extends AsyncTask<String, Void, String> {
        private C1994h0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00a0  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009c }
                r0.<init>()     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = british.xnews2.C1692config.f7109I5     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = "/srv/coments_profile.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                british.xnews2.profile r1 = british.xnews2.profile.this     // Catch:{ Exception -> 0x009c }
                long r1 = r1.f8300n     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                british.xnews2.profile r1 = british.xnews2.profile.this     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = r1.f8318w     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = "&idusu_pro="
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                british.xnews2.profile r1 = british.xnews2.profile.this     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = r1.f8320x     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = "&idc="
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                british.xnews2.profile r1 = british.xnews2.profile.this     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = r1.f8324z     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x009c }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x009c }
                r1.<init>(r0)     // Catch:{ Exception -> 0x009c }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x009c }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x009c }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r2.<init>(r6)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r6.<init>()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            L_0x0070:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                if (r2 == 0) goto L_0x008b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r3.<init>()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r3.append(r2)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r6.append(r2)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                goto L_0x0070
            L_0x008b:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r0.disconnect()
                return r6
            L_0x0093:
                r6 = move-exception
                goto L_0x00a4
            L_0x0095:
                r6 = r0
                goto L_0x009c
            L_0x0097:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x00a4
            L_0x009c:
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x00a3
                r6.disconnect()
            L_0x00a3:
                return r0
            L_0x00a4:
                if (r0 == 0) goto L_0x00a9
                r0.disconnect()
            L_0x00a9:
                goto L_0x00ab
            L_0x00aa:
                throw r6
            L_0x00ab:
                goto L_0x00aa
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.profile.C1994h0.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            String str2 = str;
            try {
                profile.this.findViewById(R.id.pb_mascoments).setVisibility(8);
                profile.this.findViewById(R.id.pb_mascoments_inv).setVisibility(8);
            } catch (Exception unused) {
            }
            if (str2.contains("ANDROID:OK DATOS:")) {
                int indexOf = str2.indexOf("DATOS:") + 6;
                String[] split = str2.substring(indexOf, str2.indexOf(";", indexOf)).split(",");
                int i = 0;
                while (!split[i].equals("S") && !split[i].equals("N")) {
                    String[] split2 = split[i].split("-");
                    String replace = split2[1].replace("@X@", "-").replace("@Y@", ",");
                    profile profile = profile.this;
                    Boolean bool = Boolean.FALSE;
                    profile.mo7967j(bool, bool, split2[0], split2[3], split2[4], split2[2], replace, split2[5], split2[6], split2[7], split2[8], split2[9], split2[10], split2[11]);
                    i++;
                }
                C2000k0 k0Var = profile.this.f8271N0;
                if (k0Var == null || k0Var.getStatus() != AsyncTask.Status.RUNNING) {
                    profile profile2 = profile.this;
                    profile2.f8271N0 = new C2000k0();
                    profile.this.f8271N0.execute(new String[0]);
                }
                if (split[i].equals("S")) {
                    profile.this.findViewById(R.id.fl_mascoments).setVisibility(0);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            profile.this.findViewById(R.id.fl_mascoments).setVisibility(8);
            profile profile = profile.this;
            if (profile.f8257G0) {
                profile.findViewById(R.id.pb_mascoments_inv).setVisibility(0);
            } else {
                profile.findViewById(R.id.pb_mascoments).setVisibility(0);
            }
        }
    }

    /* renamed from: british.xnews2.profile$i */
    class C1995i implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ View f8362b;

        /* renamed from: c */
        final /* synthetic */ String f8363c;

        C1995i(View view, String str) {
            this.f8362b = view;
            this.f8363c = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f8362b.setVisibility(8);
            int indexOfChild = ((LinearLayout) this.f8362b.getParent()).indexOfChild(this.f8362b);
            SharedPreferences.Editor edit = profile.this.f8296a1.edit();
            while (indexOfChild < 4) {
                SharedPreferences sharedPreferences = profile.this.f8296a1;
                StringBuilder sb = new StringBuilder();
                sb.append("idcom");
                int i2 = indexOfChild + 1;
                sb.append(i2);
                sb.append("_");
                sb.append(profile.this.f8320x);
                edit.putString("idcom" + indexOfChild + "_" + profile.this.f8320x, sharedPreferences.getString(sb.toString(), ""));
                edit.putString("com" + indexOfChild + "_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_" + profile.this.f8320x, ""));
                edit.putString("com" + indexOfChild + "_fcrea_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_fcrea_" + profile.this.f8320x, ""));
                edit.putString("com" + indexOfChild + "_idusucrea_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_idusucrea_" + profile.this.f8320x, ""));
                edit.putString("com" + indexOfChild + "_nombre_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_nombre_" + profile.this.f8320x, ""));
                edit.putString("com" + indexOfChild + "_vfoto_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_vfoto_" + profile.this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                edit.putString("com" + indexOfChild + "_privados_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_privados_" + profile.this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                edit.putString("com" + indexOfChild + "_fnacd_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_fnacd_" + profile.this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                edit.putString("com" + indexOfChild + "_fnacm_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_fnacm_" + profile.this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                edit.putString("com" + indexOfChild + "_fnaca_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_fnaca_" + profile.this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                edit.putString("com" + indexOfChild + "_sexo_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_sexo_" + profile.this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                edit.putString("com" + indexOfChild + "_coments_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_coments_" + profile.this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                indexOfChild = i2;
            }
            edit.commit();
            new C2010p0(this.f8363c).execute(new String[0]);
        }
    }

    /* renamed from: british.xnews2.profile$i0 */
    private class C1996i0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        boolean f8365a;

        private C1996i0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00bb  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                boolean r6 = r5.f8365a
                java.lang.String r0 = ""
                if (r6 != 0) goto L_0x0007
                return r0
            L_0x0007:
                r6 = 0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                r1.<init>()     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.lang.String r2 = british.xnews2.C1692config.f7109I5     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                r1.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.lang.String r2 = "/srv/fotos_profile.php?idusu="
                r1.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                british.xnews2.profile r2 = british.xnews2.profile.this     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                long r2 = r2.f8300n     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                r1.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.lang.String r2 = "&c="
                r1.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                british.xnews2.profile r2 = british.xnews2.profile.this     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.lang.String r2 = r2.f8318w     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                r1.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.lang.String r2 = "&idusu_pro="
                r1.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                british.xnews2.profile r2 = british.xnews2.profile.this     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.lang.String r2 = r2.f8320x     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                r1.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.lang.String r2 = "&idf="
                r1.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                british.xnews2.profile r2 = british.xnews2.profile.this     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                int r3 = r2.f8304p     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                r4 = 1
                if (r3 <= 0) goto L_0x004e
                java.util.ArrayList<british.xnews2.profile$e0> r2 = r2.f8250D     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                int r3 = r3 - r4
                java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                british.xnews2.profile$e0 r2 = (british.xnews2.profile.C1988e0) r2     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.lang.String r2 = r2.f8341a     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                goto L_0x0053
            L_0x004e:
                r2 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
            L_0x0053:
                r1.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                r2.<init>(r1)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.net.URLConnection r1 = r2.openConnection()     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                r1.setDoInput(r4)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r6 = 10000(0x2710, float:1.4013E-41)
                r1.setConnectTimeout(r6)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r1.setReadTimeout(r6)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.lang.String r6 = "User-Agent"
                java.lang.String r2 = "Android Vinebre Software"
                r1.setRequestProperty(r6, r2)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.io.InputStream r6 = r1.getInputStream()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r3.<init>(r6)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r2.<init>(r3)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r6.<init>()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
            L_0x008a:
                java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                if (r3 == 0) goto L_0x00a5
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r4.<init>()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r4.append(r3)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.lang.String r3 = "\n"
                r4.append(r3)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r6.append(r3)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                goto L_0x008a
            L_0x00a5:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r1.disconnect()
                return r6
            L_0x00ad:
                r0 = move-exception
                r6 = r1
                goto L_0x00b3
            L_0x00b0:
                r6 = r1
                goto L_0x00b9
            L_0x00b2:
                r0 = move-exception
            L_0x00b3:
                if (r6 == 0) goto L_0x00b8
                r6.disconnect()
            L_0x00b8:
                throw r0
            L_0x00b9:
                if (r6 == 0) goto L_0x00be
                r6.disconnect()
            L_0x00be:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.profile.C1996i0.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (profile.this.findViewById(R.id.pb_masfotos_inv) != null) {
                profile.this.findViewById(R.id.pb_masfotos_inv).setVisibility(4);
                profile.this.findViewById(R.id.pb_masfotos).setVisibility(4);
            }
            if (str.contains("ANDROID:OK DATOS:")) {
                int indexOf = str.indexOf("DATOS:") + 6;
                String[] split = str.substring(indexOf, str.indexOf(";", indexOf)).split(",");
                int i = 0;
                while (!split[i].equals("S") && !split[i].equals("N")) {
                    String[] split2 = split[i].split("-");
                    C1988e0 e0Var = new C1988e0();
                    e0Var.f8341a = split2[0];
                    e0Var.f8343c = split2[1];
                    e0Var.f8342b = split2[2];
                    e0Var.f8344d = split2[3];
                    profile.this.f8250D.add(e0Var);
                    i++;
                }
                if (split[i].equals("N")) {
                    profile.this.f8253E0 = true;
                }
                profile.this.mo7971n();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            profile.this.findViewById(R.id.fl_masfotos).setVisibility(4);
            profile.this.findViewById(R.id.fl_menosfotos).setVisibility(4);
            this.f8365a = true;
            int size = profile.this.f8250D.size();
            profile profile = profile.this;
            if (size > profile.f8304p) {
                profile.mo7971n();
                this.f8365a = false;
            } else if (profile.f8257G0) {
                profile.findViewById(R.id.pb_masfotos_inv).setVisibility(0);
            } else {
                profile.findViewById(R.id.pb_masfotos).setVisibility(0);
            }
        }
    }

    /* renamed from: british.xnews2.profile$j */
    class C1997j implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8367a;

        C1997j(AlertDialog alertDialog) {
            this.f8367a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8367a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + profile.this.f6656b));
            Button button2 = this.f8367a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + profile.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.profile$j0 */
    private class C1998j0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        ProgressBar f8369a;

        /* renamed from: b */
        String f8370b;

        /* renamed from: c */
        ImageView f8371c;

        /* renamed from: d */
        Bitmap f8372d;

        private C1998j0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r5) {
            /*
                r4 = this;
                java.lang.String r5 = "0"
                android.widget.ImageView r0 = r4.f8371c
                if (r0 != 0) goto L_0x0009
                java.lang.String r5 = "-1"
                return r5
            L_0x0009:
                r1 = 2131362292(0x7f0a01f4, float:1.834436E38)
                java.lang.Object r0 = r0.getTag(r1)
                java.lang.String r0 = (java.lang.String) r0
                r4.f8370b = r0
                java.net.URL r0 = new java.net.URL     // Catch:{  }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
                r1.<init>()     // Catch:{  }
                java.lang.String r2 = british.xnews2.C1692config.f7108H5     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "/srv/imgs/ususgal/"
                r1.append(r2)     // Catch:{  }
                british.xnews2.profile r2 = british.xnews2.profile.this     // Catch:{  }
                java.lang.String r2 = r2.f8320x     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "_"
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f8370b     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "_p.jpg"
                r1.append(r2)     // Catch:{  }
                java.lang.String r1 = r1.toString()     // Catch:{  }
                r0.<init>(r1)     // Catch:{  }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{  }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{  }
                r1 = 1
                r0.setDoInput(r1)     // Catch:{  }
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r1)     // Catch:{  }
                r1 = 20000(0x4e20, float:2.8026E-41)
                r0.setReadTimeout(r1)     // Catch:{  }
                r0.connect()     // Catch:{  }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{  }
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ MalformedURLException -> 0x009a }
                r4.f8372d = r2     // Catch:{ MalformedURLException -> 0x009a }
                r1.close()     // Catch:{  }
                r0.disconnect()     // Catch:{  }
                java.io.File r0 = new java.io.File     // Catch:{  }
                british.xnews2.profile r1 = british.xnews2.profile.this     // Catch:{  }
                java.io.File r1 = r1.f8256G     // Catch:{  }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{  }
                r2.<init>()     // Catch:{  }
                java.lang.String r3 = "fperfilgal_"
                r2.append(r3)     // Catch:{  }
                java.lang.String r3 = r4.f8370b     // Catch:{  }
                r2.append(r3)     // Catch:{  }
                java.lang.String r3 = ".jpg"
                r2.append(r3)     // Catch:{  }
                java.lang.String r2 = r2.toString()     // Catch:{  }
                r0.<init>(r1, r2)     // Catch:{  }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{  }
                r1.<init>(r0)     // Catch:{  }
                android.graphics.Bitmap r0 = r4.f8372d     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{  }
                r3 = 70
                r0.compress(r2, r3, r1)     // Catch:{  }
                java.lang.String r5 = "1"
            L_0x009a:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.profile.C1998j0.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (this.f8371c != null && !str.equals("-1") && ((String) this.f8371c.getTag(R.id.idaux1)).equals(this.f8370b)) {
                ProgressBar progressBar = this.f8369a;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                this.f8371c.setTag(R.id.idaux2, "S");
                if (str == IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) {
                    this.f8371c.setImageBitmap(this.f8372d);
                }
                new C1998j0().execute(new String[0]);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (profile.this.f8260I.getVisibility() == 0 && profile.this.f8260I.getTag(R.id.idaux2).equals("N")) {
                profile profile = profile.this;
                this.f8371c = profile.f8260I;
                this.f8369a = profile.f8278R;
            } else if (profile.this.f8262J.getVisibility() == 0 && profile.this.f8262J.getTag(R.id.idaux2).equals("N")) {
                profile profile2 = profile.this;
                this.f8371c = profile2.f8262J;
                this.f8369a = profile2.f8280S;
            } else if (profile.this.f8264K.getVisibility() == 0 && profile.this.f8264K.getTag(R.id.idaux2).equals("N")) {
                profile profile3 = profile.this;
                this.f8371c = profile3.f8264K;
                this.f8369a = profile3.f8282T;
            } else if (profile.this.f8266L.getVisibility() == 0 && profile.this.f8266L.getTag(R.id.idaux2).equals("N")) {
                profile profile4 = profile.this;
                this.f8371c = profile4.f8266L;
                this.f8369a = profile4.f8284U;
            }
        }
    }

    /* renamed from: british.xnews2.profile$k */
    class C1999k extends AdColonyInterstitialListener {
        C1999k() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            profile profile = profile.this;
            if (profile.f8281S0) {
                profile.abrir_secc(profile.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            profile.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            profile.this.f6661g.cancel();
            profile profile = profile.this;
            profile.abrir_secc(profile.f6660f);
        }
    }

    /* renamed from: british.xnews2.profile$k0 */
    private class C2000k0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f8375a;

        /* renamed from: b */
        String f8376b;

        /* renamed from: c */
        Bitmap f8377c;

        private C2000k0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r5) {
            /*
                r4 = this;
                java.lang.String r5 = "0"
                java.lang.String r0 = r4.f8375a
                if (r0 != 0) goto L_0x0009
                java.lang.String r5 = "-1"
                return r5
            L_0x0009:
                java.net.URL r0 = new java.net.URL     // Catch:{  }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
                r1.<init>()     // Catch:{  }
                java.lang.String r2 = british.xnews2.C1692config.f7108H5     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "/srv/imgs/usus/"
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f8375a     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "_1_p.jpg?v="
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f8376b     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r1 = r1.toString()     // Catch:{  }
                r0.<init>(r1)     // Catch:{  }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{  }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{  }
                r1 = 1
                r0.setDoInput(r1)     // Catch:{  }
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r1)     // Catch:{  }
                r1 = 20000(0x4e20, float:2.8026E-41)
                r0.setReadTimeout(r1)     // Catch:{  }
                r0.connect()     // Catch:{  }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{  }
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ MalformedURLException -> 0x0088 }
                r4.f8377c = r2     // Catch:{ MalformedURLException -> 0x0088 }
                r1.close()     // Catch:{  }
                r0.disconnect()     // Catch:{  }
                java.io.File r0 = new java.io.File     // Catch:{  }
                british.xnews2.profile r1 = british.xnews2.profile.this     // Catch:{  }
                java.io.File r1 = r1.f8256G     // Catch:{  }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{  }
                r2.<init>()     // Catch:{  }
                java.lang.String r3 = "fperfil_"
                r2.append(r3)     // Catch:{  }
                java.lang.String r3 = r4.f8375a     // Catch:{  }
                r2.append(r3)     // Catch:{  }
                java.lang.String r3 = ".jpg"
                r2.append(r3)     // Catch:{  }
                java.lang.String r2 = r2.toString()     // Catch:{  }
                r0.<init>(r1, r2)     // Catch:{  }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{  }
                r1.<init>(r0)     // Catch:{  }
                android.graphics.Bitmap r0 = r4.f8377c     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{  }
                r3 = 70
                r0.compress(r2, r3, r1)     // Catch:{  }
                java.lang.String r5 = "1"
            L_0x0088:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.profile.C2000k0.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (profile.this.f8299m0 != null && this.f8375a != null && !str.equals("-1")) {
                if (str == IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) {
                    SharedPreferences.Editor edit = profile.this.f8296a1.edit();
                    edit.putString("fperfil_" + this.f8375a, this.f8376b);
                    edit.commit();
                }
                int childCount = profile.this.f8299m0.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    String str2 = (String) profile.this.f8299m0.getChildAt(i).findViewById(R.id.iv_usucoment).getTag(R.id.idaux1);
                    if (str2 != null && str2.equals(this.f8375a)) {
                        profile.this.f8299m0.getChildAt(i).findViewById(R.id.iv_usucoment).setTag(R.id.idaux2, this.f8376b);
                        if (str == IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) {
                            ((ImageView) profile.this.f8299m0.getChildAt(i).findViewById(R.id.iv_usucoment)).setImageBitmap(this.f8377c);
                        }
                    }
                }
                new C2000k0().execute(new String[0]);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            for (int i = 0; i < profile.this.f8299m0.getChildCount(); i++) {
                LinearLayout linearLayout = (LinearLayout) profile.this.f8299m0.getChildAt(i);
                String str = (String) linearLayout.findViewById(R.id.iv_usucoment).getTag(R.id.idaux1);
                String str2 = (String) linearLayout.findViewById(R.id.iv_usucoment).getTag(R.id.idaux2);
                this.f8376b = str2;
                if (str2 != null && !str2.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                    String str3 = this.f8376b;
                    SharedPreferences sharedPreferences = profile.this.f8296a1;
                    if (!str3.equals(sharedPreferences.getString("fperfil_" + str, SessionDescription.SUPPORTED_SDP_VERSION))) {
                        this.f8375a = str;
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: british.xnews2.profile$l */
    class C2001l implements DialogInterface.OnClickListener {
        C2001l() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            profile.this.startActivityForResult(intent, 2);
        }
    }

    /* renamed from: british.xnews2.profile$l0 */
    private class C2002l0 extends AsyncTask<String, Void, String> {
        private C2002l0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00a0  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009c }
                r0.<init>()     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = british.xnews2.C1692config.f7109I5     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = "/srv/likes.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                british.xnews2.profile r1 = british.xnews2.profile.this     // Catch:{ Exception -> 0x009c }
                long r1 = r1.f8300n     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                british.xnews2.profile r1 = british.xnews2.profile.this     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = r1.f8318w     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = "&idusu_pro="
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                british.xnews2.profile r1 = british.xnews2.profile.this     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = r1.f8320x     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r1 = "&n="
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                british.xnews2.profile r1 = british.xnews2.profile.this     // Catch:{ Exception -> 0x009c }
                int r1 = r1.f8312t     // Catch:{ Exception -> 0x009c }
                r0.append(r1)     // Catch:{ Exception -> 0x009c }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x009c }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x009c }
                r1.<init>(r0)     // Catch:{ Exception -> 0x009c }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x009c }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x009c }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r2.<init>(r6)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r6.<init>()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            L_0x0070:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                if (r2 == 0) goto L_0x008b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r3.<init>()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r3.append(r2)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r6.append(r2)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                goto L_0x0070
            L_0x008b:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
                r0.disconnect()
                return r6
            L_0x0093:
                r6 = move-exception
                goto L_0x00a4
            L_0x0095:
                r6 = r0
                goto L_0x009c
            L_0x0097:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x00a4
            L_0x009c:
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x00a3
                r6.disconnect()
            L_0x00a3:
                return r0
            L_0x00a4:
                if (r0 == 0) goto L_0x00a9
                r0.disconnect()
            L_0x00a9:
                goto L_0x00ab
            L_0x00aa:
                throw r6
            L_0x00ab:
                goto L_0x00aa
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.profile.C2002l0.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            boolean z;
            try {
                profile.this.f8293Y0.findViewById(R.id.likes_pb).setVisibility(8);
            } catch (Exception unused) {
            }
            if (str.contains("ANDROID:OK DATOS:")) {
                int indexOf = str.indexOf("DATOS:") + 6;
                String[] split = str.substring(indexOf, str.indexOf(";", indexOf)).split(",");
                if (profile.this.f8285U0.size() == 0) {
                    if (profile.this.f8261I0) {
                        C1789f0 f0Var = new C1789f0();
                        f0Var.f7712f = profile.this.f8300n + "";
                        f0Var.f7711e = profile.this.getResources().getString(R.string.tu);
                        profile profile = profile.this;
                        f0Var.f7708b = profile.f8254F.mo7516l0(profile, 1).exists();
                        profile.this.f8285U0.add(f0Var);
                    }
                } else if (((C1789f0) profile.this.f8285U0.get(profile.this.f8285U0.size() - 1)).f7709c) {
                    profile.this.f8285U0.remove(profile.this.f8285U0.size() - 1);
                }
                int i = 0;
                while (!split[i].equals("S") && !split[i].equals("N")) {
                    String[] split2 = split[i].split("-");
                    int i2 = 0;
                    while (true) {
                        if (i2 >= profile.this.f8285U0.size()) {
                            z = false;
                            break;
                        } else if (((C1789f0) profile.this.f8285U0.get(i2)).f7712f.equals(split2[0])) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z) {
                        C1789f0 f0Var2 = new C1789f0();
                        f0Var2.f7712f = split2[0];
                        f0Var2.f7711e = split2[1].replace("@X@", ",").replace("@Y@", "-");
                        String str2 = split2[2];
                        f0Var2.f7713g = str2;
                        if (!str2.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                            f0Var2.f7708b = true;
                        }
                        f0Var2.f7714h = split2[3];
                        f0Var2.f7717k = split2[4];
                        f0Var2.f7718l = split2[5];
                        f0Var2.f7719m = split2[6];
                        f0Var2.f7715i = split2[7];
                        f0Var2.f7716j = split2[8];
                        f0Var2.f7710d = split2[9].equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                        profile.this.f8285U0.add(f0Var2);
                        profile.this.f8312t++;
                    }
                    i++;
                }
                if (split[i].equals("S")) {
                    C1789f0 f0Var3 = new C1789f0();
                    f0Var3.f7709c = true;
                    profile.this.f8285U0.add(f0Var3);
                }
                profile.this.f8287V0.notifyDataSetChanged();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            profile.this.f8293Y0.findViewById(R.id.likes_pb).setVisibility(0);
        }
    }

    /* renamed from: british.xnews2.profile$m */
    class C2003m implements DialogInterface.OnClickListener {
        C2003m() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            profile profile = profile.this;
            if (!profile.f8254F.mo7500d1(profile, 107)) {
                profile.this.f8298m = System.currentTimeMillis();
                profile profile2 = profile.this;
                C1692config config = profile2.f8254F;
                config.mo7525s0(profile2, config.mo7507i0(profile2, "fperfilgal_temp"));
            }
        }
    }

    /* renamed from: british.xnews2.profile$m0 */
    private class C2004m0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        boolean f8382a;

        private C2004m0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00bb  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                boolean r6 = r5.f8382a
                java.lang.String r0 = ""
                if (r6 != 0) goto L_0x0007
                return r0
            L_0x0007:
                r6 = 0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                r1.<init>()     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.lang.String r2 = british.xnews2.C1692config.f7109I5     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                r1.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.lang.String r2 = "/srv/videos_profile.php?idusu="
                r1.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                british.xnews2.profile r2 = british.xnews2.profile.this     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                long r2 = r2.f8300n     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                r1.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.lang.String r2 = "&c="
                r1.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                british.xnews2.profile r2 = british.xnews2.profile.this     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.lang.String r2 = r2.f8318w     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                r1.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.lang.String r2 = "&idusu_pro="
                r1.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                british.xnews2.profile r2 = british.xnews2.profile.this     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.lang.String r2 = r2.f8320x     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                r1.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.lang.String r2 = "&idv="
                r1.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                british.xnews2.profile r2 = british.xnews2.profile.this     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                int r3 = r2.f8306q     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                r4 = 1
                if (r3 <= 0) goto L_0x004e
                java.util.ArrayList<british.xnews2.profile$f0> r2 = r2.f8252E     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                int r3 = r3 - r4
                java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                british.xnews2.profile$f0 r2 = (british.xnews2.profile.C1990f0) r2     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.lang.String r2 = r2.f8349a     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                goto L_0x0053
            L_0x004e:
                r2 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
            L_0x0053:
                r1.append(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                r2.<init>(r1)     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.net.URLConnection r1 = r2.openConnection()     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x00b9, all -> 0x00b2 }
                r1.setDoInput(r4)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r6 = 10000(0x2710, float:1.4013E-41)
                r1.setConnectTimeout(r6)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r1.setReadTimeout(r6)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.lang.String r6 = "User-Agent"
                java.lang.String r2 = "Android Vinebre Software"
                r1.setRequestProperty(r6, r2)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.io.InputStream r6 = r1.getInputStream()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r3.<init>(r6)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r2.<init>(r3)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r6.<init>()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
            L_0x008a:
                java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                if (r3 == 0) goto L_0x00a5
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r4.<init>()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r4.append(r3)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.lang.String r3 = "\n"
                r4.append(r3)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r6.append(r3)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                goto L_0x008a
            L_0x00a5:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r1.disconnect()
                return r6
            L_0x00ad:
                r0 = move-exception
                r6 = r1
                goto L_0x00b3
            L_0x00b0:
                r6 = r1
                goto L_0x00b9
            L_0x00b2:
                r0 = move-exception
            L_0x00b3:
                if (r6 == 0) goto L_0x00b8
                r6.disconnect()
            L_0x00b8:
                throw r0
            L_0x00b9:
                if (r6 == 0) goto L_0x00be
                r6.disconnect()
            L_0x00be:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.profile.C2004m0.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (profile.this.findViewById(R.id.pb_masvideos_inv) != null) {
                profile.this.findViewById(R.id.pb_masvideos_inv).setVisibility(4);
                profile.this.findViewById(R.id.pb_masvideos).setVisibility(4);
            }
            if (str.contains("ANDROID:OK DATOS:")) {
                int indexOf = str.indexOf("DATOS:") + 6;
                String[] split = str.substring(indexOf, str.indexOf(";", indexOf)).split(",");
                int i = 0;
                while (!split[i].equals("S") && !split[i].equals("N")) {
                    String[] split2 = split[i].split("-");
                    C1990f0 f0Var = new C1990f0();
                    f0Var.f8349a = split2[0];
                    f0Var.f8350b = split2[1];
                    f0Var.f8352d = split2[2];
                    f0Var.f8351c = split2[3];
                    f0Var.f8353e = split2[4];
                    profile.this.f8252E.add(f0Var);
                    i++;
                }
                if (split[i].equals("N")) {
                    profile.this.f8255F0 = true;
                }
                profile.this.mo7987r();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            profile.this.findViewById(R.id.fl_masvideos).setVisibility(4);
            profile.this.findViewById(R.id.fl_menosvideos).setVisibility(4);
            this.f8382a = true;
            int size = profile.this.f8252E.size();
            profile profile = profile.this;
            if (size > profile.f8306q) {
                profile.mo7987r();
                this.f8382a = false;
            } else if (profile.f8257G0) {
                profile.findViewById(R.id.pb_masvideos_inv).setVisibility(0);
            } else {
                profile.findViewById(R.id.pb_masvideos).setVisibility(0);
            }
        }
    }

    /* renamed from: british.xnews2.profile$n */
    class C2005n implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8384a;

        C2005n(AlertDialog alertDialog) {
            this.f8384a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8384a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + profile.this.f6656b));
            Button button2 = this.f8384a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + profile.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.profile$n0 */
    private class C2006n0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        ProgressBar f8386a;

        /* renamed from: b */
        String f8387b;

        /* renamed from: c */
        ImageView f8388c;

        /* renamed from: d */
        Bitmap f8389d;

        private C2006n0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r5) {
            /*
                r4 = this;
                java.lang.String r5 = "0"
                android.widget.ImageView r0 = r4.f8388c
                if (r0 != 0) goto L_0x0009
                java.lang.String r5 = "-1"
                return r5
            L_0x0009:
                r1 = 2131362292(0x7f0a01f4, float:1.834436E38)
                java.lang.Object r0 = r0.getTag(r1)
                java.lang.String r0 = (java.lang.String) r0
                r4.f8387b = r0
                java.net.URL r0 = new java.net.URL     // Catch:{  }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
                r1.<init>()     // Catch:{  }
                java.lang.String r2 = british.xnews2.C1692config.f7108H5     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "/srv/imgs/videos_pro/v"
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f8387b     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "_"
                r1.append(r2)     // Catch:{  }
                british.xnews2.profile r2 = british.xnews2.profile.this     // Catch:{  }
                java.lang.String r2 = r2.f8320x     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "_th.jpg"
                r1.append(r2)     // Catch:{  }
                java.lang.String r1 = r1.toString()     // Catch:{  }
                r0.<init>(r1)     // Catch:{  }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{  }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{  }
                r1 = 1
                r0.setDoInput(r1)     // Catch:{  }
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r1)     // Catch:{  }
                r1 = 20000(0x4e20, float:2.8026E-41)
                r0.setReadTimeout(r1)     // Catch:{  }
                r0.connect()     // Catch:{  }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{  }
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ MalformedURLException -> 0x009a }
                r4.f8389d = r2     // Catch:{ MalformedURLException -> 0x009a }
                r1.close()     // Catch:{  }
                r0.disconnect()     // Catch:{  }
                java.io.File r0 = new java.io.File     // Catch:{  }
                british.xnews2.profile r1 = british.xnews2.profile.this     // Catch:{  }
                java.io.File r1 = r1.f8256G     // Catch:{  }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{  }
                r2.<init>()     // Catch:{  }
                java.lang.String r3 = "fperfilgalv_"
                r2.append(r3)     // Catch:{  }
                java.lang.String r3 = r4.f8387b     // Catch:{  }
                r2.append(r3)     // Catch:{  }
                java.lang.String r3 = ".jpg"
                r2.append(r3)     // Catch:{  }
                java.lang.String r2 = r2.toString()     // Catch:{  }
                r0.<init>(r1, r2)     // Catch:{  }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{  }
                r1.<init>(r0)     // Catch:{  }
                android.graphics.Bitmap r0 = r4.f8389d     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{  }
                r3 = 70
                r0.compress(r2, r3, r1)     // Catch:{  }
                java.lang.String r5 = "1"
            L_0x009a:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.profile.C2006n0.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (this.f8388c != null && !str.equals("-1") && ((String) this.f8388c.getTag(R.id.idaux1)).equals(this.f8387b)) {
                ProgressBar progressBar = this.f8386a;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                this.f8388c.setTag(R.id.idaux2, "S");
                if (str == IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) {
                    Bitmap T0 = C1692config.m8169T0(this.f8389d, BitmapFactory.decodeResource(profile.this.getResources(), R.drawable.play_ppp));
                    this.f8389d = T0;
                    this.f8388c.setImageBitmap(T0);
                }
                new C2006n0().execute(new String[0]);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (profile.this.f8268M.getVisibility() == 0 && profile.this.f8268M.getTag(R.id.idaux2).equals("N")) {
                profile profile = profile.this;
                this.f8388c = profile.f8268M;
                this.f8386a = profile.f8286V;
            } else if (profile.this.f8270N.getVisibility() == 0 && profile.this.f8270N.getTag(R.id.idaux2).equals("N")) {
                profile profile2 = profile.this;
                this.f8388c = profile2.f8270N;
                this.f8386a = profile2.f8288W;
            } else if (profile.this.f8272O.getVisibility() == 0 && profile.this.f8272O.getTag(R.id.idaux2).equals("N")) {
                profile profile3 = profile.this;
                this.f8388c = profile3.f8272O;
                this.f8386a = profile3.f8290X;
            } else if (profile.this.f8274P.getVisibility() == 0 && profile.this.f8274P.getTag(R.id.idaux2).equals("N")) {
                profile profile4 = profile.this;
                this.f8388c = profile4.f8274P;
                this.f8386a = profile4.f8292Y;
            }
        }
    }

    /* renamed from: british.xnews2.profile$o */
    class C2007o implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8391a;

        C2007o(AlertDialog alertDialog) {
            this.f8391a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8391a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + profile.this.f6656b));
            Button button2 = this.f8391a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + profile.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.profile$o0 */
    private class C2008o0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f8393a;

        private C2008o0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0178  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x017e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r8) {
            /*
                r7 = this;
                british.xnews2.profile r8 = british.xnews2.profile.this
                android.content.SharedPreferences r8 = r8.f8296a1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "idcom0_"
                r0.append(r1)
                british.xnews2.profile r1 = british.xnews2.profile.this
                java.lang.String r1 = r1.f8320x
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = ""
                java.lang.String r8 = r8.getString(r0, r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                java.lang.String r8 = ","
                r0.append(r8)
                british.xnews2.profile r2 = british.xnews2.profile.this
                android.content.SharedPreferences r2 = r2.f8296a1
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "idcom1_"
                r3.append(r4)
                british.xnews2.profile r4 = british.xnews2.profile.this
                java.lang.String r4 = r4.f8320x
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r2 = r2.getString(r3, r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r8)
                british.xnews2.profile r0 = british.xnews2.profile.this
                android.content.SharedPreferences r0 = r0.f8296a1
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "idcom2_"
                r3.append(r4)
                british.xnews2.profile r4 = british.xnews2.profile.this
                java.lang.String r4 = r4.f8320x
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r0 = r0.getString(r3, r1)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r8)
                british.xnews2.profile r8 = british.xnews2.profile.this
                android.content.SharedPreferences r8 = r8.f8296a1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "idcom3_"
                r0.append(r3)
                british.xnews2.profile r3 = british.xnews2.profile.this
                java.lang.String r3 = r3.f8320x
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r8 = r8.getString(r0, r1)
                r2.append(r8)
                java.lang.String r8 = r2.toString()
                r0 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                r2.<init>()     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.lang.String r3 = british.xnews2.C1692config.f7109I5     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                r2.append(r3)     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.lang.String r3 = "/srv/obtener_profile.php?idusu="
                r2.append(r3)     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                british.xnews2.profile r3 = british.xnews2.profile.this     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                long r3 = r3.f8300n     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                r2.append(r3)     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.lang.String r3 = "&c="
                r2.append(r3)     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                british.xnews2.profile r3 = british.xnews2.profile.this     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.lang.String r3 = r3.f8318w     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                r2.append(r3)     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.lang.String r3 = "&idusu_pro="
                r2.append(r3)     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                british.xnews2.profile r3 = british.xnews2.profile.this     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.lang.String r3 = r3.f8320x     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                r2.append(r3)     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.lang.String r3 = "&vdescr="
                r2.append(r3)     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                british.xnews2.profile r3 = british.xnews2.profile.this     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                android.content.SharedPreferences r3 = r3.f8296a1     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                r4.<init>()     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.lang.String r5 = "vdescr_"
                r4.append(r5)     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                british.xnews2.profile r5 = british.xnews2.profile.this     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.lang.String r5 = r5.f8320x     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                r4.append(r5)     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.lang.String r5 = "0"
                java.lang.String r3 = r3.getString(r4, r5)     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                r2.append(r3)     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.lang.String r3 = "&idcoments="
                r2.append(r3)     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                r2.append(r8)     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.lang.String r8 = "&condist="
                r2.append(r8)     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.lang.String r8 = r7.f8393a     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                r2.append(r8)     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                r2.<init>(r8)     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.net.URLConnection r8 = r2.openConnection()     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ Exception -> 0x017c, all -> 0x0172 }
                r0 = 1
                r8.setDoInput(r0)     // Catch:{ Exception -> 0x0170, all -> 0x016e }
                r0 = 10000(0x2710, float:1.4013E-41)
                r8.setConnectTimeout(r0)     // Catch:{ Exception -> 0x0170, all -> 0x016e }
                r8.setReadTimeout(r0)     // Catch:{ Exception -> 0x0170, all -> 0x016e }
                java.lang.String r0 = "User-Agent"
                java.lang.String r2 = "Android Vinebre Software"
                r8.setRequestProperty(r0, r2)     // Catch:{ Exception -> 0x0170, all -> 0x016e }
                java.io.InputStream r0 = r8.getInputStream()     // Catch:{ Exception -> 0x0170, all -> 0x016e }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0170, all -> 0x016e }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0170, all -> 0x016e }
                r3.<init>(r0)     // Catch:{ Exception -> 0x0170, all -> 0x016e }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0170, all -> 0x016e }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0170, all -> 0x016e }
                r0.<init>()     // Catch:{ Exception -> 0x0170, all -> 0x016e }
            L_0x014b:
                java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x0170, all -> 0x016e }
                if (r3 == 0) goto L_0x0166
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0170, all -> 0x016e }
                r4.<init>()     // Catch:{ Exception -> 0x0170, all -> 0x016e }
                r4.append(r3)     // Catch:{ Exception -> 0x0170, all -> 0x016e }
                java.lang.String r3 = "\n"
                r4.append(r3)     // Catch:{ Exception -> 0x0170, all -> 0x016e }
                java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0170, all -> 0x016e }
                r0.append(r3)     // Catch:{ Exception -> 0x0170, all -> 0x016e }
                goto L_0x014b
            L_0x0166:
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0170, all -> 0x016e }
                r8.disconnect()
                return r0
            L_0x016e:
                r0 = move-exception
                goto L_0x0176
            L_0x0170:
                r0 = r8
                goto L_0x017c
            L_0x0172:
                r8 = move-exception
                r6 = r0
                r0 = r8
                r8 = r6
            L_0x0176:
                if (r8 == 0) goto L_0x017b
                r8.disconnect()
            L_0x017b:
                throw r0
            L_0x017c:
                if (r0 == 0) goto L_0x0181
                r0.disconnect()
            L_0x0181:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.profile.C2008o0.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            String str2;
            String str3;
            String str4;
            int i;
            String str5;
            String str6;
            String str7;
            String str8;
            int i2;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            String str21;
            String str22;
            String str23;
            String str24;
            String str25;
            String str26;
            boolean z;
            String str27 = str;
            try {
                profile.this.findViewById(R.id.pb_masfotos_inv).setVisibility(4);
                profile.this.findViewById(R.id.pb_masfotos).setVisibility(4);
                profile.this.findViewById(R.id.pb_masvideos_inv).setVisibility(4);
                profile.this.findViewById(R.id.pb_masvideos).setVisibility(4);
                profile.this.findViewById(R.id.pb_mascoments_inv).setVisibility(8);
                profile.this.findViewById(R.id.pb_mascoments).setVisibility(8);
            } catch (Exception unused) {
            }
            if (str27.contains("ANDROID:OK DATOSUSU:")) {
                SharedPreferences.Editor edit = profile.this.f8296a1.edit();
                int indexOf = str27.indexOf("DATOSUSU:") + 9;
                String str28 = ";";
                int indexOf2 = str27.indexOf(str28, indexOf);
                if (this.f8393a.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    String substring = str27.substring(indexOf, indexOf2);
                    if (substring.equals("-1")) {
                        profile.this.f8244A = null;
                    } else {
                        profile.this.f8244A = substring;
                    }
                    profile.this.mo7972o();
                }
                int i3 = 1;
                int i4 = indexOf2 + 1;
                int indexOf3 = str27.indexOf(str28, i4);
                String str29 = ",";
                String str30 = "";
                if (profile.this.f8267L0.getInt("p_descr") > 0) {
                    String substring2 = str27.substring(i4, indexOf3);
                    if (!substring2.equals(str30)) {
                        int indexOf4 = substring2.indexOf(str29);
                        String substring3 = substring2.substring(0, indexOf4);
                        String replace = substring2.substring(indexOf4 + 1).replace("@X@", str29);
                        edit.putString("vdescr_" + profile.this.f8320x, substring3);
                        edit.putString("descr_" + profile.this.f8320x, replace);
                        edit.commit();
                        profile.this.f8297l0.setText(replace);
                        profile.this.f8297l0.setVisibility(0);
                    }
                }
                profile profile = profile.this;
                int i5 = profile.f8302o;
                String str31 = SessionDescription.SUPPORTED_SDP_VERSION;
                if (i5 == 0 || profile.f8322y.equals(str31)) {
                    profile.this.mo7988s();
                }
                int i6 = indexOf3 + 1;
                int indexOf5 = str27.indexOf(str28, i6);
                String str32 = "S";
                String str33 = "_";
                if (profile.this.f8267L0.getBoolean("galeria")) {
                    String[] split = str27.substring(i6, indexOf5).split(str29);
                    int i7 = 0;
                    for (int i8 = 4; i7 < i8; i8 = 4) {
                        edit.remove("idf" + i7 + str33 + profile.this.f8320x);
                        edit.remove("f" + i7 + "_fcrea_" + profile.this.f8320x);
                        edit.remove("f" + i7 + "_nlikes_" + profile.this.f8320x);
                        edit.remove("f" + i7 + "_liked_" + profile.this.f8320x);
                        i7++;
                    }
                    int i9 = 0;
                    while (!split[i9].equals(str32) && !split[i9].equals("N")) {
                        String[] split2 = split[i9].split("-");
                        String str34 = str30;
                        edit.putString("idf" + i9 + str33 + profile.this.f8320x, split2[0]);
                        edit.putString("f" + i9 + "_fcrea_" + profile.this.f8320x, split2[1]);
                        edit.putString("f" + i9 + "_nlikes_" + profile.this.f8320x, split2[2]);
                        edit.putString("f" + i9 + "_liked_" + profile.this.f8320x, split2[3]);
                        C1988e0 e0Var = new C1988e0();
                        e0Var.f8341a = split2[0];
                        e0Var.f8343c = split2[1];
                        e0Var.f8342b = split2[2];
                        e0Var.f8344d = split2[3];
                        profile.this.f8250D.add(e0Var);
                        i9++;
                        str31 = str31;
                        str30 = str34;
                    }
                    str2 = str30;
                    str3 = str31;
                    edit.commit();
                    profile.this.mo7970m();
                    profile profile2 = profile.this;
                    profile2.f8260I.setOnClickListener(profile2);
                    profile profile3 = profile.this;
                    profile3.f8262J.setOnClickListener(profile3);
                    profile profile4 = profile.this;
                    profile4.f8264K.setOnClickListener(profile4);
                    profile profile5 = profile.this;
                    profile5.f8266L.setOnClickListener(profile5);
                    profile profile6 = profile.this;
                    profile6.f8273O0 = new C1998j0();
                    profile.this.f8273O0.execute(new String[0]);
                    if (split[i9].equals(str32)) {
                        profile.this.findViewById(R.id.fl_masfotos).setVisibility(0);
                        i3 = 1;
                    } else {
                        i3 = 1;
                        profile.this.f8253E0 = true;
                    }
                } else {
                    str2 = str30;
                    str3 = str31;
                }
                int i10 = indexOf5 + i3;
                int indexOf6 = str27.indexOf(str28, i10);
                if (!profile.this.f8267L0.getString("coments").equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) || !profile.this.f8267L0.getBoolean("coments_chat")) {
                    i = indexOf6;
                    str5 = str28;
                    str7 = str33;
                    str4 = str29;
                    str8 = str32;
                    str6 = str2;
                } else {
                    String[] split3 = str27.substring(i10, indexOf6).split(str29);
                    int i11 = 0;
                    while (true) {
                        str9 = "_fnacm_";
                        str10 = "_fnacd_";
                        str11 = "_privados_";
                        str12 = "_vfoto_";
                        str13 = "_idusucrea_";
                        str5 = str28;
                        i = indexOf6;
                        str14 = "_copia";
                        str4 = str29;
                        str15 = str32;
                        if (i11 >= 4) {
                            break;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("idcom");
                        sb.append(i11);
                        sb.append(str33);
                        String[] strArr = split3;
                        sb.append(profile.this.f8320x);
                        sb.append(str14);
                        String str35 = str9;
                        String str36 = str2;
                        edit.putString(sb.toString(), profile.this.f8296a1.getString("idcom" + i11 + str33 + profile.this.f8320x, str36));
                        SharedPreferences sharedPreferences = profile.this.f8296a1;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("com");
                        sb2.append(i11);
                        sb2.append(str33);
                        String str37 = str33;
                        sb2.append(profile.this.f8320x);
                        edit.putString("com" + i11 + str33 + profile.this.f8320x + str14, sharedPreferences.getString(sb2.toString(), str36));
                        edit.putString("com" + i11 + "_fcrea_" + profile.this.f8320x + str14, profile.this.f8296a1.getString("com" + i11 + "_fcrea_" + profile.this.f8320x, str36));
                        edit.putString("com" + i11 + str13 + profile.this.f8320x + str14, profile.this.f8296a1.getString("com" + i11 + str13 + profile.this.f8320x, str36));
                        edit.putString("com" + i11 + "_nombre_" + profile.this.f8320x + str14, profile.this.f8296a1.getString("com" + i11 + "_nombre_" + profile.this.f8320x, str36));
                        String str38 = str3;
                        edit.putString("com" + i11 + str12 + profile.this.f8320x + str14, profile.this.f8296a1.getString("com" + i11 + str12 + profile.this.f8320x, str38));
                        SharedPreferences sharedPreferences2 = profile.this.f8296a1;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("com");
                        sb3.append(i11);
                        sb3.append(str11);
                        String str39 = str36;
                        sb3.append(profile.this.f8320x);
                        edit.putString("com" + i11 + str11 + profile.this.f8320x + str14, sharedPreferences2.getString(sb3.toString(), str38));
                        edit.putString("com" + i11 + str10 + profile.this.f8320x + str14, profile.this.f8296a1.getString("com" + i11 + str10 + profile.this.f8320x, str38));
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("com");
                        sb4.append(i11);
                        String str40 = str35;
                        sb4.append(str40);
                        sb4.append(profile.this.f8320x);
                        sb4.append(str14);
                        edit.putString(sb4.toString(), profile.this.f8296a1.getString("com" + i11 + str40 + profile.this.f8320x, str38));
                        edit.putString("com" + i11 + "_fnaca_" + profile.this.f8320x + str14, profile.this.f8296a1.getString("com" + i11 + "_fnaca_" + profile.this.f8320x, str38));
                        edit.putString("com" + i11 + "_sexo_" + profile.this.f8320x + str14, profile.this.f8296a1.getString("com" + i11 + "_sexo_" + profile.this.f8320x, str38));
                        edit.putString("com" + i11 + "_coments_" + profile.this.f8320x + str14, profile.this.f8296a1.getString("com" + i11 + "_coments_" + profile.this.f8320x, str38));
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("idcom");
                        sb5.append(i11);
                        String str41 = str37;
                        sb5.append(str41);
                        sb5.append(profile.this.f8320x);
                        edit.remove(sb5.toString());
                        edit.remove("com" + i11 + str41 + profile.this.f8320x);
                        edit.remove("com" + i11 + "_fcrea_" + profile.this.f8320x);
                        edit.remove("com" + i11 + str13 + profile.this.f8320x);
                        edit.remove("com" + i11 + "_nombre_" + profile.this.f8320x);
                        edit.remove("com" + i11 + str12 + profile.this.f8320x);
                        edit.remove("com" + i11 + str11 + profile.this.f8320x);
                        edit.remove("com" + i11 + str10 + profile.this.f8320x);
                        edit.remove("com" + i11 + str35 + profile.this.f8320x);
                        edit.remove("com" + i11 + "_fnaca_" + profile.this.f8320x);
                        edit.remove("com" + i11 + "_sexo_" + profile.this.f8320x);
                        edit.remove("com" + i11 + "_coments_" + profile.this.f8320x);
                        i11++;
                        String str42 = str;
                        str33 = str41;
                        str2 = str39;
                        str28 = str5;
                        indexOf6 = i;
                        str29 = str4;
                        split3 = strArr;
                        str3 = str38;
                        str32 = str15;
                    }
                    String[] strArr2 = split3;
                    String str43 = "idcom";
                    String str44 = str33;
                    String str45 = str3;
                    String str46 = str2;
                    edit.commit();
                    int i12 = 0;
                    while (true) {
                        String str47 = str45;
                        String str48 = str15;
                        if (strArr2[i12].equals(str48)) {
                            str7 = str44;
                            str15 = str48;
                            break;
                        }
                        str15 = str48;
                        if (strArr2[i12].equals("N")) {
                            str7 = str44;
                            break;
                        }
                        String[] split4 = strArr2[i12].split("-");
                        String str49 = str14;
                        if (split4.length > 1) {
                            edit.putString(str43 + i12 + str44 + profile.this.f8320x, split4[0]);
                            edit.putString("com" + i12 + str44 + profile.this.f8320x, split4[1].replace("@X@", "-").replace("@Y@", str4));
                            edit.putString("com" + i12 + "_fcrea_" + profile.this.f8320x, split4[2]);
                            edit.putString("com" + i12 + str13 + profile.this.f8320x, split4[3]);
                            edit.putString("com" + i12 + "_nombre_" + profile.this.f8320x, split4[4]);
                            edit.putString("com" + i12 + str12 + profile.this.f8320x, split4[5]);
                            edit.putString("com" + i12 + str11 + profile.this.f8320x, split4[6]);
                            edit.putString("com" + i12 + str10 + profile.this.f8320x, split4[7]);
                            edit.putString("com" + i12 + str9 + profile.this.f8320x, split4[8]);
                            edit.putString("com" + i12 + "_fnaca_" + profile.this.f8320x, split4[9]);
                            edit.putString("com" + i12 + "_sexo_" + profile.this.f8320x, split4[10]);
                            edit.putString("com" + i12 + "_coments_" + profile.this.f8320x, split4[11]);
                            str21 = str43;
                            str17 = str9;
                            str25 = str44;
                            str16 = str10;
                            str24 = str49;
                            str18 = str11;
                            str23 = str46;
                            str20 = str13;
                            String str50 = str47;
                            str19 = str12;
                            str22 = str50;
                        } else {
                            String str51 = str43;
                            String str52 = str44;
                            String str53 = str4;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= 5) {
                                    str4 = str53;
                                    str21 = str51;
                                    str17 = str9;
                                    str25 = str52;
                                    str16 = str10;
                                    str24 = str49;
                                    str18 = str11;
                                    str23 = str46;
                                    str26 = str12;
                                    z = false;
                                    break;
                                }
                                SharedPreferences sharedPreferences3 = profile.this.f8296a1;
                                StringBuilder sb6 = new StringBuilder();
                                str4 = str53;
                                str21 = str51;
                                sb6.append(str21);
                                sb6.append(i13);
                                str17 = str9;
                                str25 = str52;
                                sb6.append(str25);
                                str16 = str10;
                                sb6.append(profile.this.f8320x);
                                str24 = str49;
                                sb6.append(str24);
                                str18 = str11;
                                str23 = str46;
                                str26 = str12;
                                if (sharedPreferences3.getString(sb6.toString(), str23).equals(split4[0])) {
                                    z = true;
                                    break;
                                }
                                i13++;
                                str12 = str26;
                                str46 = str23;
                                str11 = str18;
                                str49 = str24;
                                str10 = str16;
                                str52 = str25;
                                str9 = str17;
                                str51 = str21;
                                str53 = str4;
                            }
                            if (z) {
                                edit.putString(str21 + i12 + str25 + profile.this.f8320x, profile.this.f8296a1.getString(str21 + i13 + str25 + profile.this.f8320x + str24, str23));
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append("com");
                                sb7.append(i12);
                                sb7.append(str25);
                                sb7.append(profile.this.f8320x);
                                edit.putString(sb7.toString(), profile.this.f8296a1.getString("com" + i13 + str25 + profile.this.f8320x + str24, str23));
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append("com");
                                sb8.append(i12);
                                sb8.append("_fcrea_");
                                sb8.append(profile.this.f8320x);
                                edit.putString(sb8.toString(), profile.this.f8296a1.getString("com" + i13 + "_fcrea_" + profile.this.f8320x + str24, str23));
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append("com");
                                sb9.append(i12);
                                sb9.append(str13);
                                sb9.append(profile.this.f8320x);
                                edit.putString(sb9.toString(), profile.this.f8296a1.getString("com" + i13 + str13 + profile.this.f8320x + str24, str23));
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append("com");
                                sb10.append(i12);
                                sb10.append("_nombre_");
                                sb10.append(profile.this.f8320x);
                                edit.putString(sb10.toString(), profile.this.f8296a1.getString("com" + i13 + "_nombre_" + profile.this.f8320x + str24, str23));
                                StringBuilder sb11 = new StringBuilder();
                                sb11.append("com");
                                sb11.append(i12);
                                String str54 = str26;
                                sb11.append(str54);
                                sb11.append(profile.this.f8320x);
                                String sb12 = sb11.toString();
                                SharedPreferences sharedPreferences4 = profile.this.f8296a1;
                                StringBuilder sb13 = new StringBuilder();
                                sb13.append("com");
                                sb13.append(i13);
                                sb13.append(str54);
                                str20 = str13;
                                sb13.append(profile.this.f8320x);
                                sb13.append(str24);
                                String sb14 = sb13.toString();
                                str22 = str47;
                                edit.putString(sb12, sharedPreferences4.getString(sb14, str22));
                                StringBuilder sb15 = new StringBuilder();
                                sb15.append("com");
                                sb15.append(i12);
                                String str55 = str18;
                                sb15.append(str55);
                                sb15.append(profile.this.f8320x);
                                str19 = str54;
                                edit.putString(sb15.toString(), profile.this.f8296a1.getString("com" + i13 + str55 + profile.this.f8320x + str24, str22));
                                StringBuilder sb16 = new StringBuilder();
                                sb16.append("com");
                                sb16.append(i12);
                                String str56 = str16;
                                sb16.append(str56);
                                sb16.append(profile.this.f8320x);
                                edit.putString(sb16.toString(), profile.this.f8296a1.getString("com" + i13 + str56 + profile.this.f8320x + str24, str22));
                                StringBuilder sb17 = new StringBuilder();
                                sb17.append("com");
                                sb17.append(i12);
                                String str57 = str17;
                                sb17.append(str57);
                                sb17.append(profile.this.f8320x);
                                edit.putString(sb17.toString(), profile.this.f8296a1.getString("com" + i13 + str57 + profile.this.f8320x + str24, str22));
                                StringBuilder sb18 = new StringBuilder();
                                sb18.append("com");
                                sb18.append(i12);
                                sb18.append("_fnaca_");
                                sb18.append(profile.this.f8320x);
                                edit.putString(sb18.toString(), profile.this.f8296a1.getString("com" + i13 + "_fnaca_" + profile.this.f8320x + str24, str22));
                                StringBuilder sb19 = new StringBuilder();
                                sb19.append("com");
                                sb19.append(i12);
                                sb19.append("_sexo_");
                                sb19.append(profile.this.f8320x);
                                edit.putString(sb19.toString(), profile.this.f8296a1.getString("com" + i13 + "_sexo_" + profile.this.f8320x + str24, str22));
                                StringBuilder sb20 = new StringBuilder();
                                sb20.append("com");
                                sb20.append(i12);
                                sb20.append("_coments_");
                                sb20.append(profile.this.f8320x);
                                edit.putString(sb20.toString(), profile.this.f8296a1.getString("com" + i13 + "_coments_" + profile.this.f8320x + str24, str22));
                            } else {
                                str22 = str47;
                                str19 = str26;
                                str20 = str13;
                            }
                        }
                        i12++;
                        str44 = str25;
                        str14 = str24;
                        str43 = str21;
                        str13 = str20;
                        str9 = str17;
                        str10 = str16;
                        str46 = str23;
                        str45 = str22;
                        str12 = str19;
                        str11 = str18;
                    }
                    str6 = str46;
                    edit.commit();
                    profile.this.mo7968k(false);
                    new C2000k0().execute(new String[0]);
                    str8 = str15;
                    if (strArr2[i12].equals(str8)) {
                        profile.this.findViewById(R.id.fl_mascoments).setVisibility(0);
                    }
                }
                int i14 = i + 1;
                String str58 = str;
                String str59 = str5;
                int indexOf7 = str58.indexOf(str59, i14);
                profile.this.mo7965f(str58.substring(i14, indexOf7).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
                int i15 = indexOf7 + 1;
                int indexOf8 = str58.indexOf(str59, i15);
                if (!profile.this.f8320x.equals(profile.this.f8300n + str6) && str58.substring(i15, indexOf8).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    profile.this.findViewById(R.id.iv_conectado).setVisibility(0);
                }
                int i16 = indexOf8 + 1;
                int indexOf9 = str58.indexOf(str59, i16);
                try {
                    profile.this.f8314u = Integer.parseInt(str58.substring(i16, indexOf9));
                    if (!profile.this.f8320x.equals(profile.this.f8300n + str6)) {
                        ((TextView) profile.this.findViewById(R.id.tv_likes_n)).setText(profile.this.f8314u + str6);
                        profile.this.findViewById(R.id.tv_likes_n).setVisibility(0);
                    } else {
                        ((TextView) profile.this.findViewById(R.id.tv_likes_self)).setText(profile.this.f8314u + str6);
                        profile.this.findViewById(R.id.tv_likes_self).setVisibility(0);
                    }
                } catch (Exception unused2) {
                }
                int i17 = indexOf9 + 1;
                int indexOf10 = str58.indexOf(str59, i17);
                if (profile.this.f8254F.f7302a2) {
                    String[] split5 = str58.substring(i17, indexOf10).split(str4);
                    for (int i18 = 0; i18 < 4; i18++) {
                        edit.remove("idv" + i18 + str7 + profile.this.f8320x);
                        edit.remove("v" + i18 + "_formato_" + profile.this.f8320x);
                        edit.remove("v" + i18 + "_fcrea_" + profile.this.f8320x);
                        edit.remove("v" + i18 + "_nlikes_" + profile.this.f8320x);
                        edit.remove("v" + i18 + "_liked_" + profile.this.f8320x);
                    }
                    int i19 = 0;
                    while (!split5[i19].equals(str8) && !split5[i19].equals("N")) {
                        String[] split6 = split5[i19].split("-");
                        edit.putString("idv" + i19 + str7 + profile.this.f8320x, split6[0]);
                        edit.putString("v" + i19 + "_formato_" + profile.this.f8320x, split6[1]);
                        edit.putString("v" + i19 + "_fcrea_" + profile.this.f8320x, split6[2]);
                        edit.putString("v" + i19 + "_nlikes_" + profile.this.f8320x, split6[3]);
                        edit.putString("v" + i19 + "_liked_" + profile.this.f8320x, split6[4]);
                        C1990f0 f0Var = new C1990f0();
                        f0Var.f8349a = split6[0];
                        f0Var.f8350b = split6[1];
                        f0Var.f8352d = split6[2];
                        f0Var.f8351c = split6[3];
                        f0Var.f8353e = split6[4];
                        profile.this.f8252E.add(f0Var);
                        i19++;
                    }
                    edit.commit();
                    profile.this.mo7986q();
                    profile profile7 = profile.this;
                    profile7.f8268M.setOnClickListener(profile7);
                    profile profile8 = profile.this;
                    profile8.f8270N.setOnClickListener(profile8);
                    profile profile9 = profile.this;
                    profile9.f8272O.setOnClickListener(profile9);
                    profile profile10 = profile.this;
                    profile10.f8274P.setOnClickListener(profile10);
                    profile profile11 = profile.this;
                    profile11.f8275P0 = new C2006n0();
                    profile.this.f8275P0.execute(new String[0]);
                    if (split5[i19].equals(str8)) {
                        profile.this.findViewById(R.id.fl_masvideos).setVisibility(0);
                        i2 = 1;
                    } else {
                        i2 = 1;
                        profile.this.f8255F0 = true;
                    }
                    profile.this.f8316v = Integer.parseInt(split5[i19 + i2]);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            this.f8393a = SessionDescription.SUPPORTED_SDP_VERSION;
            if (profile.this.f8267L0.getInt("p_dist") > 0 && !profile.this.f8267L0.containsKey("dist")) {
                this.f8393a = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            }
            profile profile = profile.this;
            if (profile.f8257G0) {
                profile.findViewById(R.id.pb_masfotos_inv).setVisibility(0);
                profile.this.findViewById(R.id.pb_masvideos_inv).setVisibility(0);
                profile.this.findViewById(R.id.pb_mascoments_inv).setVisibility(0);
                return;
            }
            profile.findViewById(R.id.pb_masfotos).setVisibility(0);
            profile.this.findViewById(R.id.pb_masvideos).setVisibility(0);
            profile.this.findViewById(R.id.pb_mascoments).setVisibility(0);
        }
    }

    /* renamed from: british.xnews2.profile$p */
    class C2009p implements DialogInterface.OnClickListener {
        C2009p() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("video/*");
            profile.this.startActivityForResult(intent, 4);
        }
    }

    /* renamed from: british.xnews2.profile$p0 */
    private class C2010p0 extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f8396a;

        C2010p0(String str) {
            this.f8396a = str;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
                r0.<init>()     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = british.xnews2.C1692config.f7109I5     // Catch:{ Exception -> 0x0082 }
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = "/srv/eliminar_coment.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                british.xnews2.profile r1 = british.xnews2.profile.this     // Catch:{ Exception -> 0x0082 }
                long r1 = r1.f8300n     // Catch:{ Exception -> 0x0082 }
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                british.xnews2.profile r1 = british.xnews2.profile.this     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = r1.f8318w     // Catch:{ Exception -> 0x0082 }
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = "&idc="
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r1 = r5.f8396a     // Catch:{ Exception -> 0x0082 }
                r0.append(r1)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0082 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0082 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0082 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x0082 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x0082 }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r1)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r0.setReadTimeout(r1)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                java.lang.String r1 = "User-Agent"
                java.lang.String r2 = "Android Vinebre Software"
                r0.setRequestProperty(r1, r2)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r3.<init>(r1)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
            L_0x005d:
                java.lang.String r1 = r2.readLine()     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                if (r1 == 0) goto L_0x0071
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r3.<init>()     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r3.append(r1)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                java.lang.String r1 = "\n"
                r3.append(r1)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                goto L_0x005d
            L_0x0071:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
                r0.disconnect()
                return r6
            L_0x0079:
                r6 = move-exception
                goto L_0x008d
            L_0x007b:
                r6 = r0
                goto L_0x0082
            L_0x007d:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x008d
            L_0x0082:
                r0 = 2
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x007d }
                if (r6 == 0) goto L_0x008c
                r6.disconnect()
            L_0x008c:
                return r0
            L_0x008d:
                if (r0 == 0) goto L_0x0092
                r0.disconnect()
            L_0x0092:
                goto L_0x0094
            L_0x0093:
                throw r6
            L_0x0094:
                goto L_0x0093
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.profile.C2010p0.doInBackground(java.lang.String[]):java.lang.Byte");
        }
    }

    /* renamed from: british.xnews2.profile$q */
    class C2011q implements DialogInterface.OnClickListener {
        C2011q() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            profile profile = profile.this;
            if (!profile.f8254F.mo7500d1(profile, 109)) {
                profile profile2 = profile.this;
                C1692config config = profile2.f8254F;
                config.mo7526t0(profile2, config.mo7507i0(profile2, "dt_foto98_temp.mp4"));
            }
        }
    }

    /* renamed from: british.xnews2.profile$q0 */
    private class C2012q0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f8399a;

        /* renamed from: british.xnews2.profile$q0$a */
        class C2013a implements Runnable {
            C2013a() {
            }

            public void run() {
                try {
                    ((ScrollView) profile.this.findViewById(R.id.sc_pro)).smoothScrollTo(0, profile.this.findViewById(R.id.tv_coments).getTop());
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: british.xnews2.profile$q0$b */
        class C2014b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f8402a;

            C2014b(AlertDialog alertDialog) {
                this.f8402a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f8402a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + profile.this.f6656b));
            }
        }

        /* renamed from: british.xnews2.profile$q0$c */
        class C2015c implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f8404a;

            C2015c(AlertDialog alertDialog) {
                this.f8404a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f8404a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + profile.this.f6656b));
            }
        }

        public C2012q0(String str) {
            this.f8399a = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 20000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/enviar_coment.php?idusu=" + profile.this.f8300n + "&c=" + profile.this.f8318w + "&idusu_pro=" + profile.this.f8320x);
                C12960g gVar = new C12960g(C12957d.BROWSER_COMPATIBLE);
                gVar.mo48144c("m", new C12982f(URLEncoder.encode(this.f8399a, C6540C.UTF8_NAME)));
                eVar.mo47986B(gVar);
                eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo43518a(eVar).mo47805b().mo43577k(), C6540C.UTF8_NAME));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return sb.toString();
                    }
                    sb.append(readLine);
                }
            } catch (Exception unused) {
                return "ANDROID:KO";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            String str2 = str;
            AlertDialog.Builder builder = new AlertDialog.Builder(profile.this);
            try {
                profile.this.f8294Z.setVisibility(8);
                profile profile = profile.this;
                if (profile.f8257G0 || Build.VERSION.SDK_INT <= 12) {
                    ((TextView) profile.findViewById(R.id.et_coment_self)).setTextColor(-16777216);
                } else {
                    ((TextView) profile.findViewById(R.id.et_coment_self)).setTextColor(-1);
                }
            } catch (Exception unused) {
            }
            if (str2.indexOf("ANDROID:OK ID:") != -1) {
                int indexOf = str2.indexOf("ANDROID:OK ID:") + 14;
                String substring = str2.substring(indexOf, str2.indexOf("-", indexOf));
                ((EditText) profile.this.findViewById(R.id.et_coment_self)).setText("");
                String v = C1692config.m8201v(new SimpleDateFormat("ddMMyyHHmm").format(new Date()));
                profile.this.mo7967j(Boolean.FALSE, Boolean.TRUE, substring, profile.this.f8300n + "", profile.this.getResources().getString(R.string.tu), v, this.f8399a, SessionDescription.SUPPORTED_SDP_VERSION, "", "", "", "", "", "");
                SharedPreferences.Editor edit = profile.this.f8296a1.edit();
                for (int i = 3; i > 0; i += -1) {
                    SharedPreferences sharedPreferences = profile.this.f8296a1;
                    StringBuilder sb = new StringBuilder();
                    sb.append("idcom");
                    int i2 = i - 1;
                    sb.append(i2);
                    sb.append("_");
                    sb.append(profile.this.f8320x);
                    edit.putString("idcom" + i + "_" + profile.this.f8320x, sharedPreferences.getString(sb.toString(), ""));
                    edit.putString("com" + i + "_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_" + profile.this.f8320x, ""));
                    edit.putString("com" + i + "_fcrea_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_fcrea_" + profile.this.f8320x, ""));
                    edit.putString("com" + i + "_idusucrea_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_idusucrea_" + profile.this.f8320x, ""));
                    edit.putString("com" + i + "_nombre_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_nombre_" + profile.this.f8320x, ""));
                    edit.putString("com" + i + "_vfoto_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_vfoto_" + profile.this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit.putString("com" + i + "_privados_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_privados_" + profile.this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit.putString("com" + i + "_fnacd_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_fnacd_" + profile.this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit.putString("com" + i + "_fnacm_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_fnacm_" + profile.this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit.putString("com" + i + "_fnaca_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_fnaca_" + profile.this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit.putString("com" + i + "_sexo_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_sexo_" + profile.this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit.putString("com" + i + "_coments_" + profile.this.f8320x, profile.this.f8296a1.getString("com" + i2 + "_coments_" + profile.this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                }
                edit.putString("idcom0_" + profile.this.f8320x, substring);
                edit.putString("com0_" + profile.this.f8320x, this.f8399a);
                edit.putString("com0_fcrea_" + profile.this.f8320x, v);
                edit.putString("com0_idusucrea_" + profile.this.f8320x, profile.this.f8300n + "");
                edit.putString("com0_nombre_" + profile.this.f8320x, profile.this.getResources().getString(R.string.tu));
                edit.putString("com0_vfoto_" + profile.this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION);
                edit.commit();
                try {
                    profile.this.findViewById(R.id.sc_pro).post(new C2013a());
                } catch (Exception unused2) {
                }
            } else if (str2.indexOf("ANDROID:KO MOTIVO:NOADMITE") != -1) {
                AlertDialog create = builder.setCancelable(false).setPositiveButton(profile.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.noadmitecoments).create();
                if (!profile.this.f6656b.equals("")) {
                    create.setOnShowListener(new C2014b(create));
                }
                create.show();
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else {
                AlertDialog create2 = builder.setCancelable(false).setPositiveButton(profile.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.error_http).create();
                if (!profile.this.f6656b.equals("")) {
                    create2.setOnShowListener(new C2015c(create2));
                }
                try {
                    create2.show();
                } catch (Exception unused3) {
                }
                ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            }
        }
    }

    /* renamed from: british.xnews2.profile$r */
    class C2016r implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8406a;

        C2016r(AlertDialog alertDialog) {
            this.f8406a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8406a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + profile.this.f6656b));
            Button button2 = this.f8406a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + profile.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.profile$r0 */
    private class C2017r0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        ProgressDialog f8408a;

        /* renamed from: british.xnews2.profile$r0$a */
        class C2018a implements DialogInterface.OnShowListener {
            C2018a() {
            }

            public void onShow(DialogInterface dialogInterface) {
                C1692config.m8168S0((ProgressBar) C2017r0.this.f8408a.findViewById(16908301), profile.this.f6656b);
            }
        }

        /* renamed from: british.xnews2.profile$r0$b */
        class C2019b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f8411a;

            C2019b(AlertDialog alertDialog) {
                this.f8411a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f8411a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + profile.this.f6656b));
            }
        }

        private C2017r0() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            Bitmap bitmap;
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 60000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/guardar_fotogal.php?idusu=" + profile.this.f8300n + "&c=" + profile.this.f8296a1.getString("cod", ""));
                C12960g gVar = new C12960g(C12957d.BROWSER_COMPATIBLE);
                profile profile = profile.this;
                File i0 = profile.f8254F.mo7507i0(profile, "fperfilgal_temp");
                BitmapFactory.Options options = new BitmapFactory.Options();
                boolean z = true;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(i0.getPath(), options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                if (i > 600 || i2 > 600) {
                    z = false;
                }
                if (!z) {
                    C1692config config = profile.this.f8254F;
                    int round = Math.round(((float) i) / ((float) C1692config.m8193n(i, i2, IronSourceError.ERROR_BN_LOAD_AFTER_INIT_FAILED, IronSourceError.ERROR_BN_LOAD_AFTER_INIT_FAILED)));
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = round;
                    bitmap = BitmapFactory.decodeFile(i0.getPath(), options2);
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(profile.this.getContentResolver(), Uri.fromFile(i0));
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
                gVar.mo48144c("foto1", new C12978b(byteArrayOutputStream.toByteArray(), "temporal.jpg"));
                eVar.mo47986B(gVar);
                eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo43518a(eVar).mo47805b().mo43577k(), C6540C.UTF8_NAME));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                if (sb.indexOf("ANDROID:OK") != -1) {
                    return sb.toString();
                }
                return "";
            } catch (Exception | OutOfMemoryError unused) {
                return "";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            boolean z;
            int i;
            int indexOf;
            ProgressDialog progressDialog = this.f8408a;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f8408a.cancel();
            }
            int indexOf2 = str.indexOf("ANDROID:OK ID:");
            if (indexOf2 == -1 || (indexOf = str.indexOf("-", i)) == -1) {
                z = false;
            } else {
                C1988e0 e0Var = new C1988e0();
                e0Var.f8341a = str.substring((i = indexOf2 + 14), indexOf);
                e0Var.f8343c = DateFormat.format("ddMMyyHHmm", new Date()).toString();
                e0Var.f8342b = SessionDescription.SUPPORTED_SDP_VERSION;
                e0Var.f8344d = SessionDescription.SUPPORTED_SDP_VERSION;
                profile.this.f8250D.add(0, e0Var);
                profile profile = profile.this;
                profile.f8304p = 0;
                try {
                    C1692config.m8202w(profile.f8254F.mo7507i0(profile, "fperfilgal_temp"), new File(profile.this.f8256G, "fperfilgal_" + e0Var.f8341a + ".jpg"));
                    profile profile2 = profile.this;
                    C1692config.m8202w(profile2.f8254F.mo7507i0(profile2, "fperfilgal_temp"), new File(profile.this.f8256G, "fperfilgal_" + e0Var.f8341a + "_g.jpg"));
                } catch (Exception unused) {
                }
                profile.this.mo7971n();
                SharedPreferences.Editor edit = profile.this.f8296a1.edit();
                for (int i2 = 3; i2 > 0; i2 += -1) {
                    SharedPreferences sharedPreferences = profile.this.f8296a1;
                    StringBuilder sb = new StringBuilder();
                    sb.append("idf");
                    int i3 = i2 - 1;
                    sb.append(i3);
                    sb.append("_");
                    sb.append(profile.this.f8320x);
                    edit.putString("idf" + i2 + "_" + profile.this.f8320x, sharedPreferences.getString(sb.toString(), ""));
                    edit.putString("f" + i2 + "_fcrea_" + profile.this.f8320x, profile.this.f8296a1.getString("f" + i3 + "_fcrea_" + profile.this.f8320x, ""));
                    edit.putString("f" + i2 + "_nlikes_" + profile.this.f8320x, profile.this.f8296a1.getString("f" + i3 + "_nlikes_" + profile.this.f8320x, ""));
                    edit.putString("f" + i2 + "_liked_" + profile.this.f8320x, profile.this.f8296a1.getString("f" + i3 + "_liked_" + profile.this.f8320x, ""));
                }
                edit.putString("idf0_" + profile.this.f8320x, e0Var.f8341a);
                edit.putString("f0_fcrea_" + profile.this.f8320x, e0Var.f8343c);
                edit.putString("f0_nlikes_" + profile.this.f8320x, e0Var.f8342b);
                edit.putString("f0_liked_" + profile.this.f8320x, e0Var.f8344d);
                edit.commit();
                z = true;
            }
            if (!z) {
                AlertDialog create = new AlertDialog.Builder(profile.this).setCancelable(false).setPositiveButton(profile.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.error_http).create();
                if (!profile.this.f6656b.equals("")) {
                    create.setOnShowListener(new C2019b(create));
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused2) {
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            ProgressDialog progressDialog = new ProgressDialog(profile.this);
            this.f8408a = progressDialog;
            progressDialog.setMessage(profile.this.getString(R.string.subiendo));
            this.f8408a.setIndeterminate(true);
            if (Build.VERSION.SDK_INT > 20 && !profile.this.f6656b.equals("")) {
                this.f8408a.setOnShowListener(new C2018a());
            }
            this.f8408a.show();
        }
    }

    /* renamed from: british.xnews2.profile$s */
    class C2020s implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ String f8413b;

        C2020s(String str) {
            this.f8413b = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            profile.this.mo7964d(this.f8413b);
        }
    }

    /* renamed from: british.xnews2.profile$s0 */
    private class C2021s0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f8415a;

        /* renamed from: b */
        String f8416b;

        /* renamed from: c */
        String f8417c;

        /* renamed from: british.xnews2.profile$s0$a */
        class C2022a implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f8419a;

            C2022a(AlertDialog alertDialog) {
                this.f8419a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f8419a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + profile.this.f6656b));
            }
        }

        public C2021s0(int i, String str, String str2) {
            this.f8415a = i;
            this.f8416b = str;
            this.f8417c = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            Bitmap bitmap;
            String str = "";
            C11188h hVar = new C11188h();
            C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/guardar_videogal.php");
            C12960g gVar = new C12960g();
            profile profile = profile.this;
            try {
                bitmap = MediaStore.Images.Media.getBitmap(profile.this.getContentResolver(), Uri.fromFile(profile.f8254F.mo7516l0(profile, this.f8415a)));
            } catch (IOException e) {
                e.printStackTrace();
                bitmap = null;
            }
            if (bitmap == null) {
                return "KO";
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            gVar.mo48144c("thumb", new C12978b(byteArrayOutputStream.toByteArray(), "temporal.jpg"));
            try {
                gVar.mo48144c("idusu", new C12982f(profile.this.f8300n + str));
                gVar.mo48144c("c", new C12982f(profile.this.f8318w));
                gVar.mo48144c("idvideo", new C12982f(this.f8416b));
                gVar.mo48144c("formato", new C12982f(this.f8417c));
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
            eVar.mo47986B(gVar);
            eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
            try {
                C12725i b = hVar.mo43518a(eVar).mo47805b();
                str = C12823d.m54372d(b);
                if (b != null) {
                    try {
                        b.mo43578s();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            hVar.mo43519b().shutdown();
            return str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            int i;
            int indexOf;
            try {
                profile.this.f8283T0.cancel();
            } catch (Exception unused) {
            }
            int indexOf2 = str.indexOf("ANDROID:OK ID:");
            boolean z = true;
            if (indexOf2 == -1 || (indexOf = str.indexOf("-", i)) == -1) {
                z = false;
            } else {
                C1990f0 f0Var = new C1990f0();
                f0Var.f8349a = str.substring((i = indexOf2 + 14), indexOf);
                f0Var.f8350b = this.f8417c;
                f0Var.f8352d = DateFormat.format("ddMMyyHHmm", new Date()).toString();
                f0Var.f8351c = SessionDescription.SUPPORTED_SDP_VERSION;
                f0Var.f8353e = SessionDescription.SUPPORTED_SDP_VERSION;
                profile.this.f8252E.add(0, f0Var);
                profile profile = profile.this;
                profile.f8316v++;
                profile.f8306q = 0;
                try {
                    C1692config.m8202w(profile.f8254F.mo7516l0(profile, this.f8415a), new File(profile.this.f8256G, "fperfilgalv_" + f0Var.f8349a + ".jpg"));
                } catch (Exception unused2) {
                }
                profile.this.mo7987r();
                SharedPreferences.Editor edit = profile.this.f8296a1.edit();
                for (int i2 = 3; i2 > 0; i2 += -1) {
                    SharedPreferences sharedPreferences = profile.this.f8296a1;
                    StringBuilder sb = new StringBuilder();
                    sb.append("idv");
                    int i3 = i2 - 1;
                    sb.append(i3);
                    sb.append("_");
                    sb.append(profile.this.f8320x);
                    edit.putString("idv" + i2 + "_" + profile.this.f8320x, sharedPreferences.getString(sb.toString(), ""));
                    edit.putString("v" + i2 + "_formato_" + profile.this.f8320x, profile.this.f8296a1.getString("v" + i3 + "_formato_" + profile.this.f8320x, ""));
                    edit.putString("v" + i2 + "_fcrea_" + profile.this.f8320x, profile.this.f8296a1.getString("v" + i3 + "_fcrea_" + profile.this.f8320x, ""));
                    edit.putString("v" + i2 + "_nlikes_" + profile.this.f8320x, profile.this.f8296a1.getString("v" + i3 + "_nlikes_" + profile.this.f8320x, ""));
                    edit.putString("v" + i2 + "_liked_" + profile.this.f8320x, profile.this.f8296a1.getString("v" + i3 + "_liked_" + profile.this.f8320x, ""));
                }
                edit.putString("idv0_" + profile.this.f8320x, f0Var.f8349a);
                edit.putString("v0_formato_" + profile.this.f8320x, f0Var.f8350b);
                edit.putString("v0_fcrea_" + profile.this.f8320x, f0Var.f8352d);
                edit.putString("v0_nlikes_" + profile.this.f8320x, f0Var.f8351c);
                edit.putString("v0_liked_" + profile.this.f8320x, f0Var.f8353e);
                edit.commit();
            }
            if (!z) {
                AlertDialog create = new AlertDialog.Builder(profile.this).setCancelable(false).setPositiveButton(profile.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.error_http).create();
                if (!profile.this.f6656b.equals("")) {
                    create.setOnShowListener(new C2022a(create));
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused3) {
                }
            }
        }
    }

    /* renamed from: british.xnews2.profile$t */
    class C2023t implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8421a;

        C2023t(AlertDialog alertDialog) {
            this.f8421a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8421a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + profile.this.f6656b));
            Button button2 = this.f8421a.getButton(-2);
            if (button2 != null) {
                button2.setTextColor(Color.parseColor("#" + profile.this.f6656b));
            }
        }
    }

    /* renamed from: british.xnews2.profile$t0 */
    private class C2024t0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f8423a;

        /* renamed from: b */
        int f8424b;

        /* renamed from: british.xnews2.profile$t0$a */
        class C2025a implements DialogInterface.OnShowListener {
            C2025a() {
            }

            public void onShow(DialogInterface dialogInterface) {
                C1692config.m8168S0((ProgressBar) profile.this.f8283T0.findViewById(16908301), profile.this.f6656b);
            }
        }

        public C2024t0(int i, String str) {
            this.f8423a = str;
            this.f8424b = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            String str = "";
            C11188h hVar = new C11188h();
            C12831e eVar = new C12831e(C1692config.f7107G5 + "video-upload.e-droid.net/upload.php?pro=1");
            C12981e eVar2 = new C12981e(new File(this.f8423a));
            C12960g gVar = new C12960g();
            gVar.mo48144c("videoFile", eVar2);
            try {
                gVar.mo48144c("idusu", new C12982f(profile.this.f8300n + str));
                gVar.mo48144c("idapp", new C12982f("2260177"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            eVar.mo47986B(gVar);
            eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
            try {
                C12725i b = hVar.mo43518a(eVar).mo47805b();
                if (b != null) {
                    str = C12823d.m54372d(b);
                }
                if (b != null) {
                    try {
                        b.mo43578s();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            hVar.mo43519b().shutdown();
            return str;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00ac A[SYNTHETIC, Splitter:B:25:0x00ac] */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.String r11) {
            /*
                r10 = this;
                java.lang.String r0 = "ANDROID:OK:-"
                int r0 = r11.indexOf(r0)
                r1 = -1
                r2 = 1
                r3 = 0
                if (r0 == r1) goto L_0x00a9
                int r0 = r0 + 12
                int r4 = r0 + 1
                java.lang.String r5 = "-"
                int r4 = r11.indexOf(r5, r4)
                java.lang.String r0 = r11.substring(r0, r4)
                int r4 = r4 + r2
                int r5 = r11.indexOf(r5, r4)
                java.lang.String r11 = r11.substring(r4, r5)
                java.lang.String r4 = "1"
                boolean r4 = r11.equals(r4)
                if (r4 == 0) goto L_0x002d
                java.lang.String r4 = "mp4"
                goto L_0x0045
            L_0x002d:
                java.lang.String r4 = "2"
                boolean r4 = r11.equals(r4)
                if (r4 == 0) goto L_0x0038
                java.lang.String r4 = "3gp"
                goto L_0x0045
            L_0x0038:
                java.lang.String r4 = "3"
                boolean r4 = r11.equals(r4)
                if (r4 == 0) goto L_0x0043
                java.lang.String r4 = "webm"
                goto L_0x0045
            L_0x0043:
                java.lang.String r4 = ""
            L_0x0045:
                boolean r5 = r4.isEmpty()
                if (r5 != 0) goto L_0x00a9
                java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0096 }
                java.lang.String r6 = r10.f8423a     // Catch:{ Exception -> 0x0096 }
                r5.<init>(r6)     // Catch:{ Exception -> 0x0096 }
                british.xnews2.profile r6 = british.xnews2.profile.this     // Catch:{ Exception -> 0x0096 }
                british.xnews2.config r7 = r6.f8254F     // Catch:{ Exception -> 0x0096 }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0096 }
                r8.<init>()     // Catch:{ Exception -> 0x0096 }
                java.lang.String r9 = "vp"
                r8.append(r9)     // Catch:{ Exception -> 0x0096 }
                r8.append(r0)     // Catch:{ Exception -> 0x0096 }
                java.lang.String r9 = "."
                r8.append(r9)     // Catch:{ Exception -> 0x0096 }
                r8.append(r4)     // Catch:{ Exception -> 0x0096 }
                java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x0096 }
                java.io.File r4 = r7.mo7517m0(r6, r4)     // Catch:{ Exception -> 0x0096 }
                java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x0096 }
                java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0096 }
                r6.<init>(r4)     // Catch:{ Exception -> 0x0096 }
                r7 = 1024(0x400, float:1.435E-42)
                byte[] r7 = new byte[r7]     // Catch:{ Exception -> 0x0096 }
            L_0x0080:
                int r8 = r5.read(r7)     // Catch:{ Exception -> 0x0096 }
                if (r8 == r1) goto L_0x008a
                r6.write(r7, r3, r8)     // Catch:{ Exception -> 0x0096 }
                goto L_0x0080
            L_0x008a:
                r5.close()     // Catch:{ Exception -> 0x0096 }
                r6.flush()     // Catch:{ Exception -> 0x0096 }
                r6.close()     // Catch:{ Exception -> 0x0096 }
                r10.f8423a = r4     // Catch:{ Exception -> 0x0096 }
                goto L_0x009a
            L_0x0096:
                r1 = move-exception
                r1.printStackTrace()
            L_0x009a:
                british.xnews2.profile$s0 r1 = new british.xnews2.profile$s0
                british.xnews2.profile r4 = british.xnews2.profile.this
                int r5 = r10.f8424b
                r1.<init>(r5, r0, r11)
                java.lang.String[] r11 = new java.lang.String[r3]
                r1.execute(r11)
                goto L_0x00aa
            L_0x00a9:
                r2 = 0
            L_0x00aa:
                if (r2 != 0) goto L_0x00b3
                british.xnews2.profile r11 = british.xnews2.profile.this     // Catch:{ Exception -> 0x00b3 }
                android.app.ProgressDialog r11 = r11.f8283T0     // Catch:{ Exception -> 0x00b3 }
                r11.dismiss()     // Catch:{ Exception -> 0x00b3 }
            L_0x00b3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.profile.C2024t0.onPostExecute(java.lang.String):void");
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            profile.this.f8283T0 = new ProgressDialog(profile.this);
            profile profile = profile.this;
            profile.f8283T0.setMessage(profile.getString(R.string.subiendo));
            profile.this.f8283T0.setIndeterminate(true);
            if (Build.VERSION.SDK_INT > 20 && !profile.this.f6656b.equals("")) {
                profile.this.f8283T0.setOnShowListener(new C2025a());
            }
            profile.this.f8283T0.show();
        }
    }

    /* renamed from: british.xnews2.profile$u */
    class C2026u extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f8427a;

        /* renamed from: british.xnews2.profile$u$a */
        class C2027a extends FullScreenContentCallback {
            C2027a() {
            }

            public void onAdDismissedFullScreenContent() {
                profile profile = profile.this;
                if (profile.f8281S0) {
                    profile.abrir_secc(profile.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                profile profile = profile.this;
                profile.abrir_secc(profile.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.profile$u$b */
        class C2028b implements OnUserEarnedRewardListener {
            C2028b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2026u uVar = C2026u.this;
                profile.this.f8281S0 = true;
                C1692config.m8175Y0(uVar.f8427a);
            }
        }

        C2026u(Context context) {
            this.f8427a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            profile.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2027a());
            rewardedAd.show((Activity) this.f8427a, new C2028b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            profile profile = profile.this;
            if (!profile.f8254F.mo7502f(this.f8427a, profile.f6663i)) {
                profile.this.f6661g.cancel();
                profile profile2 = profile.this;
                profile2.abrir_secc(profile2.f6660f);
            }
        }
    }

    /* renamed from: british.xnews2.profile$u0 */
    private class C2029u0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f8431a;

        /* renamed from: b */
        Bitmap f8432b;

        /* renamed from: british.xnews2.profile$u0$a */
        class C2030a implements View.OnClickListener {
            C2030a() {
            }

            public void onClick(View view) {
                Intent intent = new Intent(profile.this, fotoperfil.class);
                File file = profile.this.f8256G;
                File file2 = new File(file, "fperfil_" + profile.this.f8320x + "_g.jpg");
                StringBuilder sb = new StringBuilder();
                sb.append("file://");
                sb.append(file2.getAbsolutePath());
                intent.putExtra("url", sb.toString());
                intent.putExtra("idusu_profile", profile.this.f8320x);
                profile.this.startActivityForResult(intent, 0);
            }
        }

        private C2029u0() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r5) {
            /*
                r4 = this;
                java.lang.String r5 = r4.f8431a
                java.lang.String r0 = "0"
                if (r5 != 0) goto L_0x0007
                return r0
            L_0x0007:
                java.net.URL r5 = new java.net.URL     // Catch:{  }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
                r1.<init>()     // Catch:{  }
                java.lang.String r2 = british.xnews2.C1692config.f7108H5     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "/srv/imgs/usus/"
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f8431a     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "_1.jpg?v="
                r1.append(r2)     // Catch:{  }
                british.xnews2.profile r2 = british.xnews2.profile.this     // Catch:{  }
                java.lang.String r2 = r2.f8322y     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r1 = r1.toString()     // Catch:{  }
                r5.<init>(r1)     // Catch:{  }
                java.net.URLConnection r5 = r5.openConnection()     // Catch:{  }
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{  }
                r1 = 1
                r5.setDoInput(r1)     // Catch:{  }
                r1 = 10000(0x2710, float:1.4013E-41)
                r5.setConnectTimeout(r1)     // Catch:{  }
                r1 = 20000(0x4e20, float:2.8026E-41)
                r5.setReadTimeout(r1)     // Catch:{  }
                r5.connect()     // Catch:{  }
                java.io.InputStream r1 = r5.getInputStream()     // Catch:{  }
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ MalformedURLException -> 0x0089 }
                r4.f8432b = r2     // Catch:{ MalformedURLException -> 0x0089 }
                r1.close()     // Catch:{  }
                r5.disconnect()     // Catch:{  }
                java.io.File r5 = new java.io.File     // Catch:{  }
                british.xnews2.profile r1 = british.xnews2.profile.this     // Catch:{  }
                java.io.File r1 = r1.f8256G     // Catch:{  }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{  }
                r2.<init>()     // Catch:{  }
                java.lang.String r3 = "fperfil_"
                r2.append(r3)     // Catch:{  }
                java.lang.String r3 = r4.f8431a     // Catch:{  }
                r2.append(r3)     // Catch:{  }
                java.lang.String r3 = "_g.jpg"
                r2.append(r3)     // Catch:{  }
                java.lang.String r2 = r2.toString()     // Catch:{  }
                r5.<init>(r1, r2)     // Catch:{  }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{  }
                r1.<init>(r5)     // Catch:{  }
                android.graphics.Bitmap r5 = r4.f8432b     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{  }
                r3 = 100
                r5.compress(r2, r3, r1)     // Catch:{  }
                java.lang.String r5 = "1"
                return r5
            L_0x0089:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.profile.C2029u0.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                SharedPreferences.Editor edit = profile.this.f8296a1.edit();
                edit.putString("fperfil_" + this.f8431a + "_g", profile.this.f8322y);
                edit.commit();
            }
            profile.this.findViewById(R.id.pb_foto).setVisibility(8);
            profile.this.findViewById(R.id.pb_foto_inv).setVisibility(8);
            if (str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                profile.this.f8258H.setImageBitmap(this.f8432b);
                profile.this.f8258H.setOnClickListener(new C2030a());
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            this.f8431a = profile.this.f8320x;
        }
    }

    /* renamed from: british.xnews2.profile$v */
    class C2031v implements SearchManager.OnCancelListener {
        C2031v() {
        }

        public void onCancel() {
            profile profile = profile.this;
            profile.f6657c = false;
            profile.setResult(0);
        }
    }

    /* renamed from: british.xnews2.profile$v0 */
    private class C2032v0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f8436a;

        /* renamed from: b */
        int f8437b;

        /* renamed from: c */
        Bitmap f8438c;

        public C2032v0(String str, int i) {
            this.f8436a = str;
            this.f8437b = i;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r5) {
            /*
                r4 = this;
                java.lang.String r5 = "0"
                java.net.URL r0 = new java.net.URL     // Catch:{  }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
                r1.<init>()     // Catch:{  }
                java.lang.String r2 = british.xnews2.C1692config.f7108H5     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "/srv/imgs/ususgal/"
                r1.append(r2)     // Catch:{  }
                british.xnews2.profile r2 = british.xnews2.profile.this     // Catch:{  }
                java.lang.String r2 = r2.f8320x     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = "_"
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = r4.f8436a     // Catch:{  }
                r1.append(r2)     // Catch:{  }
                java.lang.String r2 = ".jpg"
                r1.append(r2)     // Catch:{  }
                java.lang.String r1 = r1.toString()     // Catch:{  }
                r0.<init>(r1)     // Catch:{  }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{  }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{  }
                r1 = 1
                r0.setDoInput(r1)     // Catch:{  }
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r1)     // Catch:{  }
                r1 = 60000(0xea60, float:8.4078E-41)
                r0.setReadTimeout(r1)     // Catch:{  }
                r0.connect()     // Catch:{  }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{  }
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ MalformedURLException -> 0x0088 }
                r4.f8438c = r2     // Catch:{ MalformedURLException -> 0x0088 }
                r1.close()     // Catch:{  }
                r0.disconnect()     // Catch:{  }
                british.xnews2.profile r0 = british.xnews2.profile.this     // Catch:{  }
                british.xnews2.config r1 = r0.f8254F     // Catch:{  }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{  }
                r2.<init>()     // Catch:{  }
                java.lang.String r3 = "fperfilgal_"
                r2.append(r3)     // Catch:{  }
                java.lang.String r3 = r4.f8436a     // Catch:{  }
                r2.append(r3)     // Catch:{  }
                java.lang.String r3 = "_g.jpg"
                r2.append(r3)     // Catch:{  }
                java.lang.String r2 = r2.toString()     // Catch:{  }
                java.io.File r0 = r1.mo7517m0(r0, r2)     // Catch:{  }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{  }
                r1.<init>(r0)     // Catch:{  }
                android.graphics.Bitmap r0 = r4.f8438c     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{  }
                r3 = 100
                r0.compress(r2, r3, r1)     // Catch:{  }
                java.lang.String r5 = "1"
            L_0x0088:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.profile.C2032v0.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            try {
                profile.this.findViewById(R.id.pb_1).setVisibility(8);
                profile.this.findViewById(R.id.pb_1_inv).setVisibility(8);
                profile.this.findViewById(R.id.pb_2).setVisibility(8);
                profile.this.findViewById(R.id.pb_2_inv).setVisibility(8);
                profile.this.findViewById(R.id.pb_3).setVisibility(8);
                profile.this.findViewById(R.id.pb_3_inv).setVisibility(8);
                profile.this.findViewById(R.id.pb_4).setVisibility(8);
                profile.this.findViewById(R.id.pb_4_inv).setVisibility(8);
            } catch (Exception unused) {
            }
            if (str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                Intent intent = new Intent(profile.this, fotogal.class);
                StringBuilder sb = new StringBuilder();
                sb.append("file://");
                profile profile = profile.this;
                C1692config config = profile.f8254F;
                sb.append(config.mo7517m0(profile, "fperfilgal_" + this.f8436a + "_g.jpg").getAbsolutePath());
                intent.putExtra("url", sb.toString());
                intent.putExtra("nlikes", profile.this.f8250D.get(this.f8437b).f8342b);
                intent.putExtra("liked", profile.this.f8250D.get(this.f8437b).f8344d);
                intent.putExtra("fcrea", profile.this.f8250D.get(this.f8437b).f8343c);
                intent.putExtra("idf", this.f8436a);
                intent.putExtra("indf", this.f8437b);
                intent.putExtra("idusu_profile", profile.this.f8320x);
                intent.putExtra("p_fnac", profile.this.f8267L0.getInt("p_fnac"));
                intent.putExtra("p_sexo", profile.this.f8267L0.getInt("p_sexo"));
                intent.putExtra("p_descr", profile.this.f8267L0.getInt("p_descr"));
                intent.putExtra("p_dist", profile.this.f8267L0.getInt("p_dist"));
                intent.putExtra("coments_chat", profile.this.f8267L0.getBoolean("coments_chat"));
                intent.putExtra("galeria", profile.this.f8267L0.getBoolean("galeria"));
                intent.putExtra("privados_chat", profile.this.f8267L0.getBoolean("privados_chat"));
                intent.putExtra("fotos_perfil", profile.this.f8302o);
                intent.putExtra("fotos_chat", profile.this.f8267L0.getInt("fotos_chat"));
                profile.this.startActivityForResult(intent, 0);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            int i;
            int i2;
            int i3 = this.f8437b % 4;
            if (i3 == 0) {
                i2 = R.id.pb_1;
                i = R.id.pb_1_inv;
            } else if (i3 == 1) {
                i2 = R.id.pb_2;
                i = R.id.pb_2_inv;
            } else if (i3 == 2) {
                i2 = R.id.pb_3;
                i = R.id.pb_3_inv;
            } else if (i3 == 3) {
                i2 = R.id.pb_4;
                i = R.id.pb_4_inv;
            } else {
                return;
            }
            profile profile = profile.this;
            if (profile.f8257G0) {
                profile.findViewById(i).setVisibility(0);
            } else {
                profile.findViewById(i2).setVisibility(0);
            }
        }
    }

    /* renamed from: british.xnews2.profile$w */
    class C2033w implements AdDisplayListener {
        C2033w() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            profile profile = profile.this;
            if (profile.f8281S0) {
                profile.abrir_secc(profile.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.xnews2.profile$x */
    class C2034x implements SearchManager.OnDismissListener {
        C2034x() {
        }

        public void onDismiss() {
            profile.this.f6658d = false;
        }
    }

    /* renamed from: british.xnews2.profile$y */
    class C2035y implements View.OnClickListener {
        C2035y() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(profile.this, fotoperfil.class);
            StringBuilder sb = new StringBuilder();
            sb.append("file://");
            profile profile = profile.this;
            sb.append(profile.f8254F.mo7516l0(profile, 1).getAbsolutePath());
            intent.putExtra("url", sb.toString());
            intent.putExtra("idusu_profile", profile.this.f8320x);
            profile.this.startActivityForResult(intent, 0);
        }
    }

    /* renamed from: british.xnews2.profile$z */
    class C2036z implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ String f8443b;

        C2036z(String str) {
            this.f8443b = str;
        }

        public void onClick(View view) {
            File file = new File(profile.this.f8256G, this.f8443b);
            Intent intent = new Intent(profile.this, fotoperfil.class);
            intent.putExtra("url", "file://" + file.getAbsolutePath());
            intent.putExtra("idusu_profile", profile.this.f8320x);
            profile.this.startActivityForResult(intent, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r4 = r11.f8254F.f7463y5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0159  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8474e() {
        /*
            r11 = this;
            java.lang.String r0 = r11.f8320x
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r2 = r11.f8300n
            r1.append(r2)
            java.lang.String r2 = ""
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.equals(r1)
            r1 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0072
            british.xnews2.config r0 = r11.f8254F
            java.lang.String r0 = r0.f7321d3
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0033
            british.xnews2.config r0 = r11.f8254F
            int r4 = r0.f7316c4
            if (r4 == 0) goto L_0x0033
            int r0 = r0.f7322d4
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            british.xnews2.config r4 = r11.f8254F
            java.lang.String r4 = r4.f7191H3
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x004c
            british.xnews2.config r4 = r11.f8254F
            java.util.ArrayList<com.appnext.nativeads.NativeAd> r4 = r4.f7463y5
            if (r4 == 0) goto L_0x004c
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x004c
            r4 = 1
            goto L_0x004d
        L_0x004c:
            r4 = 0
        L_0x004d:
            british.xnews2.config r5 = r11.f8254F
            java.lang.String r5 = r5.f7209K3
            boolean r5 = r5.equals(r2)
            r5 = r5 ^ r1
            british.xnews2.config r6 = r11.f8254F
            java.lang.String r6 = r6.f7221M3
            boolean r6 = r6.equals(r2)
            r6 = r6 ^ r1
            british.xnews2.config r7 = r11.f8254F
            java.lang.String r7 = r7.f7233O3
            boolean r7 = r7.equals(r2)
            r7 = r7 ^ r1
            british.xnews2.config r8 = r11.f8254F
            java.lang.String r8 = r8.f7327e3
            boolean r2 = r8.equals(r2)
            r2 = r2 ^ r1
            goto L_0x0078
        L_0x0072:
            r0 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0078:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r0 == 0) goto L_0x0086
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r8.add(r0)
        L_0x0086:
            r0 = 2
            if (r4 == 0) goto L_0x0090
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r8.add(r4)
        L_0x0090:
            r4 = 3
            if (r5 == 0) goto L_0x009a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r8.add(r5)
        L_0x009a:
            r5 = 4
            if (r6 == 0) goto L_0x00a4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r8.add(r6)
        L_0x00a4:
            r6 = 5
            if (r7 == 0) goto L_0x00ae
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8.add(r7)
        L_0x00ae:
            r7 = 6
            if (r2 == 0) goto L_0x00be
            boolean r2 = com.unity3d.ads.UnityAds.isInitialized()
            if (r2 == 0) goto L_0x00be
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r8.add(r2)
        L_0x00be:
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x00e0
            java.util.Random r2 = new java.util.Random
            r2.<init>()
            int r9 = r8.size()
            int r9 = r9 - r1
            int r9 = r9 - r3
            int r9 = r9 + r1
            int r2 = r2.nextInt(r9)
            int r2 = r2 + r3
            java.lang.Object r2 = r8.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x00e1
        L_0x00e0:
            r2 = 0
        L_0x00e1:
            if (r2 != r1) goto L_0x00e9
            r0 = 0
        L_0x00e4:
            r2 = 0
        L_0x00e5:
            r4 = 0
        L_0x00e6:
            r5 = 0
        L_0x00e7:
            r6 = 0
            goto L_0x010b
        L_0x00e9:
            if (r2 != r0) goto L_0x00ee
            r0 = 1
            r1 = 0
            goto L_0x00e4
        L_0x00ee:
            if (r2 != r4) goto L_0x00f4
            r0 = 0
            r1 = 0
            r2 = 1
            goto L_0x00e5
        L_0x00f4:
            if (r2 != r5) goto L_0x00fb
            r0 = 0
            r1 = 0
            r2 = 0
            r4 = 1
            goto L_0x00e6
        L_0x00fb:
            if (r2 != r6) goto L_0x0103
            r0 = 0
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 1
            goto L_0x00e7
        L_0x0103:
            r0 = 0
            r1 = 0
            if (r2 != r7) goto L_0x00e4
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 1
        L_0x010b:
            r7 = 2131362524(0x7f0a02dc, float:1.8344831E38)
            r8 = 2131362525(0x7f0a02dd, float:1.8344833E38)
            r9 = 8
            r10 = 2131363070(0x7f0a04fe, float:1.8345938E38)
            if (r1 == 0) goto L_0x0159
            com.google.android.gms.ads.AdView r0 = new com.google.android.gms.ads.AdView
            r0.<init>(r11)
            com.google.android.gms.ads.AdSize r1 = com.google.android.gms.ads.AdSize.LARGE_BANNER
            r0.setAdSize(r1)
            british.xnews2.config r1 = r11.f8254F
            java.lang.String r1 = r1.f7321d3
            r0.setAdUnitId(r1)
            android.view.View r1 = r11.findViewById(r10)
            r1.setVisibility(r9)
            android.view.View r1 = r11.findViewById(r7)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r3)
            android.view.View r1 = r11.findViewById(r8)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.removeAllViews()
            android.view.View r1 = r11.findViewById(r8)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.addView(r0)
            com.google.android.gms.ads.AdRequest$Builder r1 = new com.google.android.gms.ads.AdRequest$Builder
            r1.<init>()
            com.google.android.gms.ads.AdRequest r1 = r1.build()
            r0.loadAd(r1)
            goto L_0x0241
        L_0x0159:
            if (r0 == 0) goto L_0x018b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r1 = r11.f8246B
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = british.xnews2.C1692config.m8153I(r0)
            if (r0 == 0) goto L_0x017f
            android.view.View r0 = r11.findViewById(r10)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = british.xnews2.C1692config.f7101A5
            r0.setTextColor(r1)
        L_0x017f:
            british.xnews2.config r2 = r11.f8254F
            r4 = 1
            r5 = 2
            r6 = -1
            r7 = 0
            r3 = r11
            r2.mo7512k(r3, r4, r5, r6, r7)
            goto L_0x0241
        L_0x018b:
            if (r2 == 0) goto L_0x01b3
            com.facebook.ads.NativeBannerAd r0 = new com.facebook.ads.NativeBannerAd
            british.xnews2.config r1 = r11.f8254F
            java.lang.String r1 = r1.f7209K3
            r0.<init>((android.content.Context) r11, (java.lang.String) r1)
            android.view.View r1 = r11.findViewById(r10)
            r1.setVisibility(r9)
            british.xnews2.profile$a0 r1 = new british.xnews2.profile$a0
            r1.<init>(r0)
            com.facebook.ads.NativeAdBase$NativeAdLoadConfigBuilder r2 = r0.buildLoadAdConfig()
            com.facebook.ads.NativeAdBase$NativeAdLoadConfigBuilder r1 = r2.withAdListener(r1)
            com.facebook.ads.NativeAdBase$NativeLoadAdConfig r1 = r1.build()
            r0.loadAd(r1)
            goto L_0x0241
        L_0x01b3:
            r0 = 50
            r1 = 320(0x140, float:4.48E-43)
            if (r4 == 0) goto L_0x01d3
            com.startapp.sdk.ads.banner.Banner r2 = new com.startapp.sdk.ads.banner.Banner
            british.xnews2.profile$b0 r3 = new british.xnews2.profile$b0
            r3.<init>()
            r2.<init>((android.app.Activity) r11, (com.startapp.sdk.ads.banner.BannerListener) r3)
            java.lang.String r3 = "BANNER PROFILE"
            r2.setAdTag(r3)
            android.view.View r3 = r11.findViewById(r10)
            r3.setVisibility(r9)
            r2.loadAd(r1, r0)
            goto L_0x0241
        L_0x01d3:
            if (r5 == 0) goto L_0x0216
            british.xnews2.config r0 = r11.f8254F
            com.ironsource.mediationsdk.IronSourceBannerLayout r0 = r0.f7420s4
            if (r0 == 0) goto L_0x01de
            com.ironsource.mediationsdk.IronSource.destroyBanner(r0)
        L_0x01de:
            british.xnews2.config r0 = r11.f8254F
            com.ironsource.mediationsdk.ISBannerSize r1 = com.ironsource.mediationsdk.ISBannerSize.BANNER
            com.ironsource.mediationsdk.IronSourceBannerLayout r1 = com.ironsource.mediationsdk.IronSource.createBanner(r11, r1)
            r0.f7420s4 = r1
            android.view.View r0 = r11.findViewById(r10)
            r0.setVisibility(r9)
            android.view.View r0 = r11.findViewById(r7)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setVisibility(r3)
            android.view.View r0 = r11.findViewById(r8)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.removeAllViews()
            android.view.View r0 = r11.findViewById(r8)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            british.xnews2.config r1 = r11.f8254F
            com.ironsource.mediationsdk.IronSourceBannerLayout r1 = r1.f7420s4
            r0.addView(r1)
            british.xnews2.config r0 = r11.f8254F
            com.ironsource.mediationsdk.IronSourceBannerLayout r0 = r0.f7420s4
            com.ironsource.mediationsdk.IronSource.loadBanner(r0)
            goto L_0x0241
        L_0x0216:
            if (r6 == 0) goto L_0x0239
            android.view.View r2 = r11.findViewById(r10)
            r2.setVisibility(r9)
            british.xnews2.profile$c0 r2 = new british.xnews2.profile$c0
            r2.<init>()
            com.unity3d.services.banners.UnityBannerSize r3 = new com.unity3d.services.banners.UnityBannerSize
            r3.<init>(r1, r0)
            com.unity3d.services.banners.BannerView r0 = new com.unity3d.services.banners.BannerView
            british.xnews2.config r1 = r11.f8254F
            java.lang.String r1 = r1.f7327e3
            r0.<init>(r11, r1, r3)
            r0.setListener(r2)
            r0.load()
            goto L_0x0241
        L_0x0239:
            british.xnews2.config r0 = r11.f8254F
            british.xnews2.c r0 = r0.mo7474A0(r11, r3)
            r11.f8265K0 = r0
        L_0x0241:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.profile.m8474e():void");
    }

    /* renamed from: g */
    private void m8475g(Context context) {
        this.f6662h = new C2026u(context);
    }

    /* renamed from: h */
    private void m8476h(boolean z) {
        String trim = ((TextView) findViewById(R.id.et_coment_self)).getText().toString().replace("@", "").trim();
        if (!trim.equals("")) {
            if (z && this.f8308r < 600) {
                ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(((TextView) findViewById(R.id.c_mensaje)).getWindowToken(), 0);
            }
            ((TextView) findViewById(R.id.et_coment_self)).setTextColor(-7829368);
            this.f8294Z.setVisibility(0);
            C2012q0 q0Var = this.f8279R0;
            if (q0Var == null || q0Var.getStatus() != AsyncTask.Status.RUNNING) {
                SharedPreferences sharedPreferences = this.f8296a1;
                if (!sharedPreferences.contains("usufav_" + this.f8320x)) {
                    SharedPreferences sharedPreferences2 = this.f8296a1;
                    if (!sharedPreferences2.contains("usufav_noactivar_" + this.f8320x)) {
                        mo7965f(true);
                    }
                }
                C2012q0 q0Var2 = new C2012q0(trim);
                this.f8279R0 = q0Var2;
                q0Var2.execute(new String[0]);
            }
        }
    }

    public void abrir_secc(View view) {
        Intent intent;
        C1845j j0 = this.f8254F.mo7510j0(view, this);
        try {
            String str = this.f8320x;
            if (str.equals(this.f8300n + "") && (intent = j0.f7842a) != null && intent.getComponent().getClassName().endsWith(".preperfil")) {
                return;
            }
        } catch (Exception unused) {
        }
        if (view.getTag(R.id.tag_jugar) != null) {
            Bundle bundle = this.f8267L0;
            if (bundle == null || !bundle.containsKey("desde_game_2")) {
                j0.f7843b = false;
            } else {
                j0.f7843b = true;
            }
            Intent intent2 = j0.f7842a;
            if (intent2 != null) {
                intent2.putExtra("game_idusu_ref", this.f8320x);
            }
        }
        if (j0.f7843b) {
            this.f6657c = true;
            Intent intent3 = new Intent();
            intent3.putExtra("finalizar", true);
            intent3.putExtra("finalizar_app", j0.f7844c);
            setResult(-1, intent3);
        }
        if (j0.f7845d) {
            startActivityForResult(j0.f7842a, 0);
        } else {
            Intent intent4 = j0.f7842a;
            if (intent4 != null) {
                if (j0.f7843b && this.f8254F.f7427t4 != 2) {
                    intent4.putExtra("es_root", true);
                }
                if (this.f6657c) {
                    this.f6659e = false;
                }
                startActivityForResult(j0.f7842a, 0);
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

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7963c(String str) {
        if (str != null) {
            AlertDialog create = new AlertDialog.Builder(this).setNegativeButton(R.string.cancelar, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.aceptar, new C2020s(str)).setMessage(R.string.confirmar_elimusu).create();
            if (!this.f6656b.equals("")) {
                create.setOnShowListener(new C2023t(create));
            }
            create.show();
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo7964d(String str) {
        C1692config.m8157K0(Toast.makeText(this, getResources().getString(R.string.enviando), 0));
        C1692config.m8152H(this, str);
        new t_chat.C2233c0(str, this.f8300n, this.f8318w, this).execute(new String[0]);
        SharedPreferences.Editor edit = this.f8296a1.edit();
        edit.putBoolean("ban_" + str, true);
        edit.commit();
        Intent intent = new Intent();
        intent.putExtra("idusu_ban", str);
        setResult(-1, intent);
        if (str.equals(this.f8320x)) {
            finish();
            return;
        }
        for (int i = 0; i < this.f8299m0.getChildCount(); i++) {
            LinearLayout linearLayout = (LinearLayout) this.f8299m0.getChildAt(i);
            String str2 = (String) linearLayout.findViewById(R.id.iv_usucoment).getTag(R.id.idaux1);
            if (str2 != null && str2.equals(str)) {
                linearLayout.setVisibility(8);
                SharedPreferences.Editor edit2 = this.f8296a1.edit();
                int i2 = i;
                while (i2 < 4) {
                    SharedPreferences sharedPreferences = this.f8296a1;
                    StringBuilder sb = new StringBuilder();
                    sb.append("idcom");
                    int i3 = i2 + 1;
                    sb.append(i3);
                    sb.append("_");
                    sb.append(this.f8320x);
                    edit2.putString("idcom" + i2 + "_" + this.f8320x, sharedPreferences.getString(sb.toString(), ""));
                    edit2.putString("com" + i2 + "_" + this.f8320x, this.f8296a1.getString("com" + i3 + "_" + this.f8320x, ""));
                    edit2.putString("com" + i2 + "_fcrea_" + this.f8320x, this.f8296a1.getString("com" + i3 + "_fcrea_" + this.f8320x, ""));
                    edit2.putString("com" + i2 + "_idusucrea_" + this.f8320x, this.f8296a1.getString("com" + i3 + "_idusucrea_" + this.f8320x, ""));
                    edit2.putString("com" + i2 + "_nombre_" + this.f8320x, this.f8296a1.getString("com" + i3 + "_nombre_" + this.f8320x, ""));
                    edit2.putString("com" + i2 + "_vfoto_" + this.f8320x, this.f8296a1.getString("com" + i3 + "_vfoto_" + this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit2.putString("com" + i2 + "_privados_" + this.f8320x, this.f8296a1.getString("com" + i3 + "_privados_" + this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit2.putString("com" + i2 + "_fnacd_" + this.f8320x, this.f8296a1.getString("com" + i3 + "_fnacd_" + this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit2.putString("com" + i2 + "_fnacm_" + this.f8320x, this.f8296a1.getString("com" + i3 + "_fnacm_" + this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit2.putString("com" + i2 + "_fnaca_" + this.f8320x, this.f8296a1.getString("com" + i3 + "_fnaca_" + this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit2.putString("com" + i2 + "_sexo_" + this.f8320x, this.f8296a1.getString("com" + i3 + "_sexo_" + this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                    edit2.putString("com" + i2 + "_coments_" + this.f8320x, this.f8296a1.getString("com" + i3 + "_coments_" + this.f8320x, SessionDescription.SUPPORTED_SDP_VERSION));
                    i2 = i3;
                }
                edit2.commit();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo7965f(boolean z) {
        if (!this.f8320x.equals(this.f8300n + "")) {
            SharedPreferences.Editor edit = this.f8296a1.edit();
            if (z) {
                edit.putBoolean("usufav_" + this.f8320x, true);
                if (!this.f8261I0) {
                    this.f8314u++;
                }
                this.f8261I0 = true;
                if (this.f8257G0) {
                    this.f8276Q.setImageDrawable(getResources().getDrawable(R.drawable.favorito_activ_n));
                } else {
                    this.f8276Q.setImageDrawable(getResources().getDrawable(R.drawable.favorito_activ_b));
                }
                if (this.f8285U0.size() > 0) {
                    if (!this.f8285U0.get(0).f7712f.equals(this.f8300n + "")) {
                        C1789f0 f0Var = new C1789f0();
                        f0Var.f7712f = this.f8300n + "";
                        f0Var.f7711e = getResources().getString(R.string.tu);
                        f0Var.f7708b = this.f8254F.mo7516l0(this, 1).exists();
                        this.f8285U0.add(0, f0Var);
                        this.f8287V0.notifyDataSetChanged();
                    }
                }
            } else {
                edit.remove("usufav_" + this.f8320x);
                if (this.f8261I0) {
                    this.f8314u--;
                }
                if (this.f8314u < 0) {
                    this.f8314u = 0;
                }
                this.f8261I0 = false;
                if (this.f8257G0) {
                    this.f8276Q.setImageDrawable(getResources().getDrawable(R.drawable.favorito_noactiv_n));
                } else {
                    this.f8276Q.setImageDrawable(getResources().getDrawable(R.drawable.favorito_noactiv_b));
                }
                if (this.f8285U0.size() > 0) {
                    if (this.f8285U0.get(0).f7712f.equals(this.f8300n + "")) {
                        this.f8285U0.remove(0);
                        this.f8287V0.notifyDataSetChanged();
                    }
                }
            }
            edit.commit();
            ((TextView) findViewById(R.id.tv_likes_n)).setText(this.f8314u + "");
            Intent intent = new Intent();
            intent.putExtra("accion_usu_fav_id", this.f8320x);
            intent.putExtra("accion_usu_fav_accion", z);
            setResult(-1, intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo7966i() {
        int q0 = this.f8254F.mo7522q0(this);
        int i = this.f8254F.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f8295Z0 = listView;
            this.f8254F.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f8254F.f7231O1;
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
            int[] iArr = this.f8254F.f7249R1;
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
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00b0, code lost:
        if (r6.equals(r7.toString()) != false) goto L_0x00b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02cb  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7967j(java.lang.Boolean r18, java.lang.Boolean r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r25
            java.lang.String r5 = "layout_inflater"
            java.lang.Object r5 = r0.getSystemService(r5)
            android.view.LayoutInflater r5 = (android.view.LayoutInflater) r5
            r6 = 2131558474(0x7f0d004a, float:1.8742265E38)
            r7 = 0
            android.view.View r5 = r5.inflate(r6, r7)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r6 = 2131362294(0x7f0a01f6, float:1.8344365E38)
            r5.setTag(r6, r1)
            r7 = 2131362420(0x7f0a0274, float:1.834462E38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r8 = 2131363150(0x7f0a054e, float:1.83461E38)
            android.view.View r8 = r5.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131363112(0x7f0a0528, float:1.8346024E38)
            android.view.View r9 = r5.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 2131363096(0x7f0a0518, float:1.8345991E38)
            android.view.View r10 = r5.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r11 = 2131362352(0x7f0a0230, float:1.8344482E38)
            android.view.View r11 = r5.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r12 = 2131362406(0x7f0a0266, float:1.8344592E38)
            android.view.View r12 = r5.findViewById(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            boolean r13 = r0.f8257G0
            if (r13 == 0) goto L_0x006a
            int r13 = british.xnews2.C1692config.f7101A5
            r8.setTextColor(r13)
            int r14 = british.xnews2.C1692config.f7106F5
            r9.setTextColor(r14)
            r10.setTextColor(r13)
            goto L_0x0076
        L_0x006a:
            r13 = -1
            r8.setTextColor(r13)
            int r14 = british.xnews2.C1692config.f7105E5
            r9.setTextColor(r14)
            r10.setTextColor(r13)
        L_0x0076:
            boolean r13 = r18.booleanValue()
            r14 = 0
            java.lang.String r15 = ""
            if (r13 != 0) goto L_0x00cd
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r16 = r7
            long r6 = r0.f8300n
            r13.append(r6)
            r13.append(r15)
            java.lang.String r6 = r13.toString()
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L_0x00b3
            java.lang.String r6 = r0.f8320x
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r13 = r5
            long r4 = r0.f8300n
            r7.append(r4)
            r7.append(r15)
            java.lang.String r4 = r7.toString()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x00d0
            goto L_0x00b4
        L_0x00b3:
            r13 = r5
        L_0x00b4:
            boolean r4 = r0.f8257G0
            if (r4 == 0) goto L_0x00c6
            android.content.res.Resources r4 = r17.getResources()
            r5 = 2131231006(0x7f08011e, float:1.807808E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
            r11.setImageDrawable(r4)
        L_0x00c6:
            r11.setOnClickListener(r0)
            r11.setVisibility(r14)
            goto L_0x00e8
        L_0x00cd:
            r13 = r5
            r16 = r7
        L_0x00d0:
            boolean r4 = r0.f8257G0
            if (r4 == 0) goto L_0x00e2
            android.content.res.Resources r4 = r17.getResources()
            r5 = 2131231506(0x7f080312, float:1.8079095E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
            r12.setImageDrawable(r4)
        L_0x00e2:
            r12.setOnClickListener(r0)
            r12.setVisibility(r14)
        L_0x00e8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            long r5 = r0.f8300n
            r4.append(r5)
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x010e
            android.content.res.Resources r4 = r17.getResources()
            r5 = 2131821091(0x7f110223, float:1.9274915E38)
            java.lang.String r4 = r4.getString(r5)
            r8.setText(r4)
            goto L_0x0111
        L_0x010e:
            r8.setText(r3)
        L_0x0111:
            java.lang.String r4 = british.xnews2.C1692config.m8200u(r23)
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.lang.String r6 = "ddMMyyHHmm"
            r5.<init>(r6)
            r6 = 1
            java.text.DateFormat r7 = android.text.format.DateFormat.getDateFormat(r17)     // Catch:{ Exception -> 0x018d }
            java.text.DateFormat r8 = android.text.format.DateFormat.getTimeFormat(r17)     // Catch:{ Exception -> 0x018d }
            java.util.Date r4 = r5.parse(r4)     // Catch:{ Exception -> 0x018d }
            java.util.Calendar r5 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x018d }
            java.util.Calendar r11 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x018d }
            r11.setTime(r4)     // Catch:{ Exception -> 0x018d }
            int r12 = r11.get(r6)     // Catch:{ Exception -> 0x018d }
            int r14 = r5.get(r6)     // Catch:{ Exception -> 0x018d }
            java.lang.String r6 = " "
            if (r12 != r14) goto L_0x0170
            r12 = 6
            int r11 = r11.get(r12)     // Catch:{ Exception -> 0x018d }
            int r5 = r5.get(r12)     // Catch:{ Exception -> 0x018d }
            if (r11 != r5) goto L_0x0170
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018d }
            r5.<init>()     // Catch:{ Exception -> 0x018d }
            android.content.res.Resources r7 = r17.getResources()     // Catch:{ Exception -> 0x018d }
            r11 = 2131820893(0x7f11015d, float:1.9274514E38)
            java.lang.String r7 = r7.getString(r11)     // Catch:{ Exception -> 0x018d }
            r5.append(r7)     // Catch:{ Exception -> 0x018d }
            r5.append(r6)     // Catch:{ Exception -> 0x018d }
            java.lang.String r4 = r8.format(r4)     // Catch:{ Exception -> 0x018d }
            r5.append(r4)     // Catch:{ Exception -> 0x018d }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x018d }
            r9.setText(r4)     // Catch:{ Exception -> 0x018d }
            goto L_0x018d
        L_0x0170:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018d }
            r5.<init>()     // Catch:{ Exception -> 0x018d }
            java.lang.String r7 = r7.format(r4)     // Catch:{ Exception -> 0x018d }
            r5.append(r7)     // Catch:{ Exception -> 0x018d }
            r5.append(r6)     // Catch:{ Exception -> 0x018d }
            java.lang.String r4 = r8.format(r4)     // Catch:{ Exception -> 0x018d }
            r5.append(r4)     // Catch:{ Exception -> 0x018d }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x018d }
            r9.setText(r4)     // Catch:{ Exception -> 0x018d }
        L_0x018d:
            r4 = r24
            r10.setText(r4)
            r4 = 2131362292(0x7f0a01f4, float:1.834436E38)
            r7 = r16
            r7.setTag(r4, r2)
            int r5 = r0.f8302o
            if (r5 <= 0) goto L_0x0253
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            long r8 = r0.f8300n
            r5.append(r8)
            r5.append(r15)
            java.lang.String r5 = r5.toString()
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x01c6
            java.lang.String r5 = "0"
            r6 = 2131362294(0x7f0a01f6, float:1.8344365E38)
            r7.setTag(r6, r5)
            android.graphics.Bitmap r5 = r0.f8269M0
            r7.setImageBitmap(r5)
            r5 = r25
            goto L_0x025a
        L_0x01c6:
            r5 = r25
            r6 = 2131362294(0x7f0a01f6, float:1.8344365E38)
            r7.setTag(r6, r5)
            java.io.File r6 = new java.io.File     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            java.io.File r8 = r0.f8256G     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            r9.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            java.lang.String r10 = "fperfil_"
            r9.append(r10)     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            r9.append(r2)     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            java.lang.String r10 = ".jpg"
            r9.append(r10)     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            r6.<init>(r8, r9)     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            r8.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            r9 = 1
            r8.inJustDecodeBounds = r9     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            java.lang.String r10 = r6.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            android.graphics.BitmapFactory.decodeFile(r10, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            android.content.res.Resources r10 = r17.getResources()     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            float r10 = r10.density     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            r11 = 1111490560(0x42400000, float:48.0)
            float r10 = r10 * r11
            r12 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 + r12
            int r10 = (int) r10     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            android.content.res.Resources r14 = r17.getResources()     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            float r14 = r14.density     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            float r14 = r14 * r11
            float r14 = r14 + r12
            int r11 = (int) r14     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            int r12 = r8.outWidth     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            int r8 = r8.outHeight     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            if (r12 > r10) goto L_0x0223
            if (r8 > r11) goto L_0x0223
            goto L_0x0224
        L_0x0223:
            r9 = 0
        L_0x0224:
            if (r9 != 0) goto L_0x0241
            int r8 = british.xnews2.C1692config.m8193n(r12, r8, r10, r11)     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            float r9 = (float) r12     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            float r8 = (float) r8     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            float r9 = r9 / r8
            int r8 = java.lang.Math.round(r9)     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            android.graphics.BitmapFactory$Options r9 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            r9.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            r9.inSampleSize = r8     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            java.lang.String r6 = r6.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeFile(r6, r9)     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            goto L_0x024d
        L_0x0241:
            android.content.ContentResolver r8 = r17.getContentResolver()     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            android.net.Uri r6 = android.net.Uri.fromFile(r6)     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            android.graphics.Bitmap r6 = android.provider.MediaStore.Images.Media.getBitmap(r8, r6)     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
        L_0x024d:
            r7.setImageBitmap(r6)     // Catch:{ Exception | OutOfMemoryError -> 0x0251 }
            goto L_0x025a
        L_0x0251:
            goto L_0x025a
        L_0x0253:
            r5 = r25
            r6 = 8
            r7.setVisibility(r6)
        L_0x025a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            long r7 = r0.f8300n
            r6.append(r7)
            r6.append(r15)
            java.lang.String r6 = r6.toString()
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L_0x02bd
            java.lang.String r6 = "ESCOMENT"
            r7 = r13
            r7.setTag(r4, r6)
            r4 = 2131362294(0x7f0a01f6, float:1.8344365E38)
            r7.setTag(r4, r2)
            r2 = 2131362295(0x7f0a01f7, float:1.8344367E38)
            r7.setTag(r2, r3)
            r2 = 2131362296(0x7f0a01f8, float:1.8344369E38)
            r7.setTag(r2, r5)
            r2 = 2131362297(0x7f0a01f9, float:1.834437E38)
            r3 = r26
            r7.setTag(r2, r3)
            r2 = 2131362298(0x7f0a01fa, float:1.8344373E38)
            r3 = r27
            r7.setTag(r2, r3)
            r2 = 2131362299(0x7f0a01fb, float:1.8344375E38)
            r3 = r28
            r7.setTag(r2, r3)
            r2 = 2131362300(0x7f0a01fc, float:1.8344377E38)
            r3 = r29
            r7.setTag(r2, r3)
            r2 = 2131362301(0x7f0a01fd, float:1.8344379E38)
            r3 = r30
            r7.setTag(r2, r3)
            r2 = 2131362293(0x7f0a01f5, float:1.8344362E38)
            r3 = r31
            r7.setTag(r2, r3)
            r7.setOnClickListener(r0)
            goto L_0x02be
        L_0x02bd:
            r7 = r13
        L_0x02be:
            boolean r2 = r19.booleanValue()
            if (r2 == 0) goto L_0x02cb
            android.widget.LinearLayout r2 = r0.f8299m0
            r3 = 0
            r2.addView(r7, r3)
            goto L_0x02d0
        L_0x02cb:
            android.widget.LinearLayout r2 = r0.f8299m0
            r2.addView(r7)
        L_0x02d0:
            r0.f8324z = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.profile.mo7967j(java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo7968k(boolean z) {
        int i;
        this.f8299m0.removeAllViews();
        boolean z2 = false;
        int i2 = 0;
        while (i2 < 4) {
            SharedPreferences sharedPreferences = this.f8296a1;
            if (!sharedPreferences.getString("idcom" + i2 + "_" + this.f8320x, "").equals("")) {
                SharedPreferences sharedPreferences2 = this.f8296a1;
                String string = sharedPreferences2.getString("com" + i2 + "_idusucrea_" + this.f8320x, "");
                if (!string.equals("")) {
                    SharedPreferences sharedPreferences3 = this.f8296a1;
                    if (sharedPreferences3.getBoolean("ban_" + string, z2)) {
                        i = i2;
                        i2 = i + 1;
                        z2 = false;
                    }
                }
                Boolean valueOf = Boolean.valueOf(z);
                Boolean bool = Boolean.FALSE;
                SharedPreferences sharedPreferences4 = this.f8296a1;
                String string2 = sharedPreferences4.getString("idcom" + i2 + "_" + this.f8320x, "");
                SharedPreferences sharedPreferences5 = this.f8296a1;
                String string3 = sharedPreferences5.getString("com" + i2 + "_idusucrea_" + this.f8320x, "");
                SharedPreferences sharedPreferences6 = this.f8296a1;
                String string4 = sharedPreferences6.getString("com" + i2 + "_nombre_" + this.f8320x, "");
                SharedPreferences sharedPreferences7 = this.f8296a1;
                String string5 = sharedPreferences7.getString("com" + i2 + "_fcrea_" + this.f8320x, "");
                SharedPreferences sharedPreferences8 = this.f8296a1;
                String string6 = sharedPreferences8.getString("com" + i2 + "_" + this.f8320x, "");
                SharedPreferences sharedPreferences9 = this.f8296a1;
                String string7 = sharedPreferences9.getString("com" + i2 + "_vfoto_" + this.f8320x, "");
                SharedPreferences sharedPreferences10 = this.f8296a1;
                String string8 = sharedPreferences10.getString("com" + i2 + "_privados_" + this.f8320x, "");
                SharedPreferences sharedPreferences11 = this.f8296a1;
                String string9 = sharedPreferences11.getString("com" + i2 + "_fnacd_" + this.f8320x, "");
                SharedPreferences sharedPreferences12 = this.f8296a1;
                String string10 = sharedPreferences12.getString("com" + i2 + "_fnacm_" + this.f8320x, "");
                SharedPreferences sharedPreferences13 = this.f8296a1;
                String string11 = sharedPreferences13.getString("com" + i2 + "_fnaca_" + this.f8320x, "");
                SharedPreferences sharedPreferences14 = this.f8296a1;
                String string12 = sharedPreferences14.getString("com" + i2 + "_sexo_" + this.f8320x, "");
                SharedPreferences sharedPreferences15 = this.f8296a1;
                i = i2;
                mo7967j(valueOf, bool, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, sharedPreferences15.getString("com" + i2 + "_coments_" + this.f8320x, ""));
                i2 = i + 1;
                z2 = false;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo7969l(int i, boolean z) {
        ProgressBar progressBar;
        TextView textView;
        LinearLayout linearLayout;
        ImageView imageView;
        String str;
        String str2;
        Bitmap bitmap;
        int i2 = i % 4;
        boolean z2 = true;
        if (i2 == 0) {
            imageView = this.f8260I;
            linearLayout = this.f8301n0;
            textView = this.f8317v0;
            progressBar = this.f8278R;
        } else if (i2 == 1) {
            imageView = this.f8262J;
            linearLayout = this.f8303o0;
            textView = this.f8319w0;
            progressBar = this.f8280S;
        } else if (i2 == 2) {
            imageView = this.f8264K;
            linearLayout = this.f8305p0;
            textView = this.f8321x0;
            progressBar = this.f8282T;
        } else if (i2 == 3) {
            imageView = this.f8266L;
            linearLayout = this.f8307q0;
            textView = this.f8323y0;
            progressBar = this.f8284U;
        } else {
            return;
        }
        Boolean bool = Boolean.FALSE;
        if (z) {
            str = this.f8250D.get(i).f8341a;
            String str3 = this.f8250D.get(i).f8342b;
            str2 = str3;
            bool = Boolean.valueOf(this.f8250D.get(i).f8345e);
        } else {
            SharedPreferences sharedPreferences = this.f8296a1;
            str = sharedPreferences.getString("idf" + i + "_" + this.f8320x, "");
            SharedPreferences sharedPreferences2 = this.f8296a1;
            str2 = sharedPreferences2.getString("f" + i + "_nlikes_" + this.f8320x, "");
        }
        progressBar.setVisibility(8);
        imageView.setTag(R.id.idaux1, str);
        imageView.setTag(R.id.idaux2, "N");
        imageView.setTag(R.id.idaux3, i + "");
        if (bool.booleanValue()) {
            imageView.setImageDrawable((Drawable) null);
            imageView.setTag(R.id.idaux2, "S");
            linearLayout.setVisibility(8);
        } else {
            if (str2.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                linearLayout.setVisibility(8);
            } else {
                textView.setText(str2);
                linearLayout.setVisibility(0);
            }
            try {
                File file = this.f8256G;
                File file2 = new File(file, "fperfilgal_" + str + ".jpg");
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file2.getPath(), options);
                int i3 = (int) ((getResources().getDisplayMetrics().density * 48.0f) + 0.5f);
                int i4 = (int) ((getResources().getDisplayMetrics().density * 48.0f) + 0.5f);
                int i5 = options.outWidth;
                int i6 = options.outHeight;
                if (i5 > i3 || i6 > i4) {
                    z2 = false;
                }
                if (!z2) {
                    int round = Math.round(((float) i5) / ((float) C1692config.m8193n(i5, i6, i3, i4)));
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = round;
                    bitmap = BitmapFactory.decodeFile(file2.getPath(), options2);
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), Uri.fromFile(file2));
                }
                imageView.setImageBitmap(bitmap);
                imageView.setTag(R.id.idaux2, "S");
            } catch (Exception unused) {
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.sinfoto_chat));
                progressBar.setVisibility(0);
            } catch (OutOfMemoryError unused2) {
            }
        }
        imageView.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo7970m() {
        this.f8260I.setVisibility(8);
        this.f8262J.setVisibility(8);
        this.f8264K.setVisibility(8);
        this.f8266L.setVisibility(8);
        this.f8278R.setVisibility(8);
        this.f8280S.setVisibility(8);
        this.f8282T.setVisibility(8);
        this.f8284U.setVisibility(8);
        this.f8301n0.setVisibility(8);
        this.f8303o0.setVisibility(8);
        this.f8305p0.setVisibility(8);
        this.f8307q0.setVisibility(8);
        int i = 0;
        boolean z = false;
        while (i < 4) {
            SharedPreferences sharedPreferences = this.f8296a1;
            if (sharedPreferences.getString("idf" + i + "_" + this.f8320x, "").equals("")) {
                break;
            }
            mo7969l(i, false);
            i++;
            z = true;
        }
        if (!z) {
            String str = this.f8320x;
            if (!str.equals(this.f8300n + "")) {
                findViewById(R.id.tl_fotos).setVisibility(8);
                return;
            }
        }
        findViewById(R.id.tl_fotos).setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo7971n() {
        this.f8260I.setVisibility(8);
        this.f8262J.setVisibility(8);
        this.f8264K.setVisibility(8);
        this.f8266L.setVisibility(8);
        this.f8278R.setVisibility(8);
        this.f8280S.setVisibility(8);
        this.f8282T.setVisibility(8);
        this.f8284U.setVisibility(8);
        this.f8301n0.setVisibility(8);
        this.f8303o0.setVisibility(8);
        this.f8305p0.setVisibility(8);
        this.f8307q0.setVisibility(8);
        int i = 0;
        while (i < 4 && this.f8304p + i <= this.f8250D.size() - 1) {
            mo7969l(this.f8304p + i, true);
            i++;
        }
        if (this.f8250D.isEmpty()) {
            String str = this.f8320x;
            if (!str.equals(this.f8300n + "")) {
                findViewById(R.id.tl_fotos).setVisibility(8);
                C1998j0 j0Var = new C1998j0();
                this.f8273O0 = j0Var;
                j0Var.execute(new String[0]);
            }
        }
        if (this.f8304p + i <= this.f8250D.size() - 1 || !this.f8253E0) {
            findViewById(R.id.fl_masfotos).setVisibility(0);
        } else {
            findViewById(R.id.fl_masfotos).setVisibility(4);
        }
        if (this.f8304p > 0) {
            findViewById(R.id.fl_menosfotos).setVisibility(0);
        } else {
            findViewById(R.id.fl_menosfotos).setVisibility(4);
        }
        findViewById(R.id.tl_fotos).setVisibility(0);
        C1998j0 j0Var2 = new C1998j0();
        this.f8273O0 = j0Var2;
        j0Var2.execute(new String[0]);
    }

    /* renamed from: o */
    public void mo7972o() {
        String str;
        String str2;
        if (this.f8310s != -1) {
            str = this.f8310s + getResources().getString(R.string.anyos_abrev);
        } else {
            str = "";
        }
        if (this.f8244A != null) {
            String country = Locale.getDefault().getCountry();
            long parseLong = Long.parseLong(this.f8244A);
            if (country.equals("US") || country.equals("GB") || country.equals("MM")) {
                if (parseLong > 1600) {
                    parseLong = (long) Math.round((float) (parseLong / 1600));
                    str2 = "mi.";
                } else {
                    double d = (double) parseLong;
                    Double.isNaN(d);
                    parseLong = Math.round(d * 1.09d);
                    str2 = "yd.";
                }
            } else if (parseLong > 999) {
                parseLong = (long) Math.round((float) (parseLong / 1000));
                str2 = "km.";
            } else {
                str2 = "m.";
            }
            if (!str.isEmpty()) {
                str = str + ", ";
            }
            str = str + parseLong + str2;
        }
        if (!str.isEmpty()) {
            ((TextView) findViewById(R.id.tv_subtit)).setText(str);
            ((TextView) findViewById(R.id.tv_subtit)).setVisibility(0);
            return;
        }
        ((TextView) findViewById(R.id.tv_subtit)).setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:91|92|93|(1:97)|98|99|100|101|102|250) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x0293 */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[ExcHandler: OutOfMemoryError (unused java.lang.OutOfMemoryError), SYNTHETIC, Splitter:B:64:0x01bf] */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[ExcHandler: OutOfMemoryError (unused java.lang.OutOfMemoryError), SYNTHETIC, Splitter:B:83:0x0217] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r22, int r23, android.content.Intent r24) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r24
            r3 = -1
            r4 = r23
            if (r4 != r3) goto L_0x072e
            r4 = 108(0x6c, float:1.51E-43)
            java.lang.String r5 = "dt_foto98_temp."
            r6 = 100
            java.lang.String r7 = ""
            r8 = 0
            if (r0 != r4) goto L_0x006c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r2 = "mp4"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            british.xnews2.config r2 = r1.f8254F
            java.io.File r0 = r2.mo7507i0(r1, r0)
            java.lang.String r0 = r0.getAbsolutePath()
            if (r0 == 0) goto L_0x072e
            boolean r2 = r0.equals(r7)
            if (r2 != 0) goto L_0x072e
            boolean r2 = r1.mo7989t(r0)
            if (r2 != 0) goto L_0x0040
            return
        L_0x0040:
            british.xnews2.config r2 = r1.f8254F
            java.io.File r2 = r2.mo7516l0(r1, r6)
            boolean r2 = r2.exists()
            if (r2 == 0) goto L_0x004f
            int r6 = r6 + 1
            goto L_0x0040
        L_0x004f:
            british.xnews2.config r2 = r1.f8254F
            r3 = 99
            java.io.File r2 = r2.mo7516l0(r1, r3)
            british.xnews2.config r3 = r1.f8254F
            java.io.File r3 = r3.mo7516l0(r1, r6)
            r2.renameTo(r3)
            british.xnews2.profile$t0 r2 = new british.xnews2.profile$t0
            r2.<init>(r6, r0)
            java.lang.String[] r0 = new java.lang.String[r8]
            r2.execute(r0)
            goto L_0x072e
        L_0x006c:
            r4 = 4
            r9 = 1
            if (r0 != r4) goto L_0x00e2
            android.net.Uri r0 = r24.getData()
            android.content.Context r2 = r21.getApplicationContext()
            java.lang.String r2 = british.xnews2.C1692config.m8181b0(r0, r2)
            java.lang.String r3 = "."
            int r3 = r2.lastIndexOf(r3)
            int r3 = r3 + r9
            java.lang.String r2 = r2.substring(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            boolean r0 = british.xnews2.C1692config.m8179a1(r1, r0, r2)
            if (r0 != 0) goto L_0x009d
            return
        L_0x009d:
            british.xnews2.config r0 = r1.f8254F
            java.io.File r0 = r0.mo7507i0(r1, r2)
            java.lang.String r0 = r0.getAbsolutePath()
            if (r0 == 0) goto L_0x072e
            boolean r2 = r0.equals(r7)
            if (r2 != 0) goto L_0x072e
            boolean r2 = r1.mo7989t(r0)
            if (r2 != 0) goto L_0x00b6
            return
        L_0x00b6:
            british.xnews2.config r2 = r1.f8254F
            java.io.File r2 = r2.mo7516l0(r1, r6)
            boolean r2 = r2.exists()
            if (r2 == 0) goto L_0x00c5
            int r6 = r6 + 1
            goto L_0x00b6
        L_0x00c5:
            british.xnews2.config r2 = r1.f8254F
            r3 = 99
            java.io.File r2 = r2.mo7516l0(r1, r3)
            british.xnews2.config r3 = r1.f8254F
            java.io.File r3 = r3.mo7516l0(r1, r6)
            r2.renameTo(r3)
            british.xnews2.profile$t0 r2 = new british.xnews2.profile$t0
            r2.<init>(r6, r0)
            java.lang.String[] r0 = new java.lang.String[r8]
            r2.execute(r0)
            goto L_0x072e
        L_0x00e2:
            r4 = 106(0x6a, float:1.49E-43)
            r5 = 600(0x258, float:8.41E-43)
            java.lang.String r12 = "fperfilgal_temp"
            if (r0 != r4) goto L_0x0233
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0151 }
            british.xnews2.config r2 = r1.f8254F     // Catch:{ Exception -> 0x0151 }
            java.io.File r2 = r2.mo7507i0(r1, r12)     // Catch:{ Exception -> 0x0151 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x0151 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0151 }
            long r13 = r0.length()     // Catch:{ Exception -> 0x0151 }
            android.content.Context r0 = r21.getApplicationContext()     // Catch:{ Exception -> 0x0151 }
            android.content.ContentResolver r15 = r0.getContentResolver()     // Catch:{ Exception -> 0x0151 }
            android.net.Uri r16 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0151 }
            java.lang.String r0 = "orientation"
            java.lang.String r2 = "_size"
            java.lang.String[] r17 = new java.lang.String[]{r0, r2}     // Catch:{ Exception -> 0x0151 }
            java.lang.String r18 = "date_added>=?"
            java.lang.String[] r0 = new java.lang.String[r9]     // Catch:{ Exception -> 0x0151 }
            long r10 = r1.f8298m     // Catch:{ Exception -> 0x0151 }
            r19 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r19
            r19 = 1
            long r10 = r10 - r19
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x0151 }
            r0[r8] = r2     // Catch:{ Exception -> 0x0151 }
            java.lang.String r20 = "date_added desc"
            r19 = r0
            android.database.Cursor r0 = r15.query(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0151 }
            if (r0 == 0) goto L_0x014e
            long r10 = r1.f8298m     // Catch:{ Exception -> 0x0151 }
            r15 = 0
            int r2 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r2 == 0) goto L_0x014e
            int r2 = r0.getCount()     // Catch:{ Exception -> 0x0151 }
            if (r2 == 0) goto L_0x014e
        L_0x013b:
            boolean r2 = r0.moveToNext()     // Catch:{ Exception -> 0x0151 }
            if (r2 == 0) goto L_0x014e
            long r10 = r0.getLong(r9)     // Catch:{ Exception -> 0x0151 }
            int r2 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x013b
            int r0 = r0.getInt(r8)     // Catch:{ Exception -> 0x0151 }
            goto L_0x014f
        L_0x014e:
            r0 = -1
        L_0x014f:
            r2 = r0
            goto L_0x0156
        L_0x0151:
            r0 = move-exception
            r0.printStackTrace()
            r2 = -1
        L_0x0156:
            if (r2 != r3) goto L_0x0172
            android.media.ExifInterface r0 = new android.media.ExifInterface     // Catch:{ IOException -> 0x016e }
            british.xnews2.config r7 = r1.f8254F     // Catch:{ IOException -> 0x016e }
            java.io.File r7 = r7.mo7507i0(r1, r12)     // Catch:{ IOException -> 0x016e }
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ IOException -> 0x016e }
            r0.<init>(r7)     // Catch:{ IOException -> 0x016e }
            java.lang.String r7 = "Orientation"
            int r2 = r0.getAttributeInt(r7, r3)     // Catch:{ IOException -> 0x016e }
            goto L_0x0172
        L_0x016e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0172:
            british.xnews2.config r0 = r1.f8254F     // Catch:{ Exception -> 0x01cc }
            java.io.File r0 = r0.mo7507i0(r1, r12)     // Catch:{ Exception -> 0x01cc }
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x01cc }
            r7.<init>()     // Catch:{ Exception -> 0x01cc }
            r7.inJustDecodeBounds = r9     // Catch:{ Exception -> 0x01cc }
            java.lang.String r10 = r0.getPath()     // Catch:{ Exception -> 0x01cc }
            android.graphics.BitmapFactory.decodeFile(r10, r7)     // Catch:{ Exception -> 0x01cc }
            int r10 = r7.outWidth     // Catch:{ Exception -> 0x01cc }
            int r7 = r7.outHeight     // Catch:{ Exception -> 0x01cc }
            if (r10 > r5) goto L_0x018f
            if (r7 > r5) goto L_0x018f
            goto L_0x0190
        L_0x018f:
            r9 = 0
        L_0x0190:
            if (r9 != 0) goto L_0x01ad
            int r5 = british.xnews2.C1692config.m8193n(r10, r7, r5, r5)     // Catch:{ Exception -> 0x01cc }
            float r7 = (float) r10     // Catch:{ Exception -> 0x01cc }
            float r5 = (float) r5     // Catch:{ Exception -> 0x01cc }
            float r7 = r7 / r5
            int r5 = java.lang.Math.round(r7)     // Catch:{ Exception -> 0x01cc }
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x01cc }
            r7.<init>()     // Catch:{ Exception -> 0x01cc }
            r7.inSampleSize = r5     // Catch:{ Exception -> 0x01cc }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x01cc }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0, r7)     // Catch:{ Exception -> 0x01cc }
            goto L_0x01b9
        L_0x01ad:
            android.content.ContentResolver r5 = r21.getContentResolver()     // Catch:{ Exception -> 0x01cc }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ Exception -> 0x01cc }
            android.graphics.Bitmap r0 = android.provider.MediaStore.Images.Media.getBitmap(r5, r0)     // Catch:{ Exception -> 0x01cc }
        L_0x01b9:
            british.xnews2.config r5 = r1.f8254F     // Catch:{ Exception -> 0x01cc }
            java.io.File r5 = r5.mo7507i0(r1, r12)     // Catch:{ Exception -> 0x01cc }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ OutOfMemoryError -> 0x01ca, OutOfMemoryError -> 0x01ca }
            r7.<init>(r5)     // Catch:{ OutOfMemoryError -> 0x01ca, OutOfMemoryError -> 0x01ca }
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ OutOfMemoryError -> 0x01ca, OutOfMemoryError -> 0x01ca }
            r0.compress(r5, r6, r7)     // Catch:{ OutOfMemoryError -> 0x01ca, OutOfMemoryError -> 0x01ca }
            goto L_0x01d0
        L_0x01ca:
            goto L_0x01d0
        L_0x01cc:
            r0 = move-exception
            r0.printStackTrace()
        L_0x01d0:
            if (r2 == r3) goto L_0x0226
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r3 = 3
            if (r2 != r3) goto L_0x01dd
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x01eb
        L_0x01dd:
            r3 = 8
            if (r2 != r3) goto L_0x01e4
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x01eb
        L_0x01e4:
            r3 = 6
            if (r2 != r3) goto L_0x01ea
            r2 = 90
            goto L_0x01eb
        L_0x01ea:
            r2 = 0
        L_0x01eb:
            if (r2 <= 0) goto L_0x0226
            british.xnews2.config r3 = r1.f8254F     // Catch:{ Exception -> 0x0222 }
            java.io.File r3 = r3.mo7507i0(r1, r12)     // Catch:{ Exception -> 0x0222 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0222 }
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeFile(r3)     // Catch:{ Exception -> 0x0222 }
            float r2 = (float) r2     // Catch:{ Exception -> 0x0222 }
            r0.postRotate(r2)     // Catch:{ Exception -> 0x0222 }
            r14 = 0
            r15 = 0
            int r16 = r13.getWidth()     // Catch:{ Exception -> 0x0222 }
            int r17 = r13.getHeight()     // Catch:{ Exception -> 0x0222 }
            r19 = 1
            r18 = r0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0222 }
            british.xnews2.config r2 = r1.f8254F     // Catch:{ Exception -> 0x0222 }
            java.io.File r2 = r2.mo7507i0(r1, r12)     // Catch:{ Exception -> 0x0222 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ OutOfMemoryError -> 0x0226, OutOfMemoryError -> 0x0226 }
            r3.<init>(r2)     // Catch:{ OutOfMemoryError -> 0x0226, OutOfMemoryError -> 0x0226 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ OutOfMemoryError -> 0x0226, OutOfMemoryError -> 0x0226 }
            r0.compress(r2, r6, r3)     // Catch:{ OutOfMemoryError -> 0x0226, OutOfMemoryError -> 0x0226 }
            goto L_0x0226
        L_0x0222:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0226:
            british.xnews2.profile$r0 r0 = new british.xnews2.profile$r0
            r2 = 0
            r0.<init>()
            java.lang.String[] r2 = new java.lang.String[r8]
            r0.execute(r2)
            goto L_0x072e
        L_0x0233:
            r10 = 2
            if (r0 != r10) goto L_0x02a3
            android.net.Uri r0 = r24.getData()
            java.lang.String r2 = "orientation"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            android.content.ContentResolver r13 = r21.getContentResolver()     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            r16 = 0
            r17 = 0
            r18 = 0
            r14 = r0
            r15 = r2
            android.database.Cursor r7 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            if (r7 == 0) goto L_0x0262
            boolean r9 = r7.moveToFirst()     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            if (r9 == 0) goto L_0x0262
            r2 = r2[r8]     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            int r2 = r7.getColumnIndex(r2)     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            int r3 = r7.getInt(r2)     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
        L_0x0262:
            android.graphics.Matrix r2 = new android.graphics.Matrix     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            r2.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            float r3 = (float) r3     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            r2.postRotate(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            british.xnews2.config r3 = r1.f8254F     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            android.graphics.Bitmap r13 = r3.mo7477D(r0, r5, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            r14 = 0
            r15 = 0
            int r16 = r13.getWidth()     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            int r17 = r13.getHeight()     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            r19 = 1
            r18 = r2
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            british.xnews2.config r2 = r1.f8254F     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            java.io.File r2 = r2.mo7507i0(r1, r12)     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception | OutOfMemoryError -> 0x0293 }
            r3.<init>(r2)     // Catch:{ Exception | OutOfMemoryError -> 0x0293 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception | OutOfMemoryError -> 0x0293 }
            r0.compress(r2, r6, r3)     // Catch:{ Exception | OutOfMemoryError -> 0x0293 }
        L_0x0293:
            r0.recycle()     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            british.xnews2.profile$r0 r0 = new british.xnews2.profile$r0     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            r4 = 0
            r0.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            java.lang.String[] r2 = new java.lang.String[r8]     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            r0.execute(r2)     // Catch:{ Exception | OutOfMemoryError -> 0x072e }
            goto L_0x072e
        L_0x02a3:
            r4 = 0
            if (r2 == 0) goto L_0x02e4
            java.lang.String r0 = "accion_usu_fav_id"
            boolean r5 = r2.hasExtra(r0)
            if (r5 == 0) goto L_0x02e4
            r3 = 0
        L_0x02af:
            java.util.ArrayList<british.xnews2.f0> r4 = r1.f8285U0
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x072e
            java.util.ArrayList<british.xnews2.f0> r4 = r1.f8285U0
            java.lang.Object r4 = r4.get(r3)
            british.xnews2.f0 r4 = (british.xnews2.C1789f0) r4
            java.lang.String r4 = r4.f7712f
            java.lang.String r5 = r2.getStringExtra(r0)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x02e1
            java.util.ArrayList<british.xnews2.f0> r0 = r1.f8285U0
            java.lang.Object r0 = r0.get(r3)
            british.xnews2.f0 r0 = (british.xnews2.C1789f0) r0
            java.lang.String r3 = "accion_usu_fav_accion"
            boolean r2 = r2.getBooleanExtra(r3, r8)
            r0.f7710d = r2
            british.xnews2.e0 r0 = r1.f8287V0
            r0.notifyDataSetChanged()
            return
        L_0x02e1:
            int r3 = r3 + 1
            goto L_0x02af
        L_0x02e4:
            java.lang.String r0 = "idf"
            if (r2 == 0) goto L_0x0373
            java.lang.String r5 = "nlikes"
            boolean r6 = r2.hasExtra(r5)
            if (r6 == 0) goto L_0x0373
            r3 = 0
        L_0x02f1:
            java.util.ArrayList<british.xnews2.profile$e0> r6 = r1.f8250D
            int r6 = r6.size()
            if (r3 >= r6) goto L_0x033c
            java.util.ArrayList<british.xnews2.profile$e0> r6 = r1.f8250D
            java.lang.Object r6 = r6.get(r3)
            british.xnews2.profile$e0 r6 = (british.xnews2.profile.C1988e0) r6
            java.lang.String r6 = r6.f8341a
            android.os.Bundle r7 = r24.getExtras()
            java.lang.String r7 = r7.getString(r0)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0339
            java.util.ArrayList<british.xnews2.profile$e0> r0 = r1.f8250D
            java.lang.Object r0 = r0.get(r3)
            british.xnews2.profile$e0 r0 = (british.xnews2.profile.C1988e0) r0
            android.os.Bundle r6 = r24.getExtras()
            java.lang.String r6 = r6.getString(r5)
            r0.f8342b = r6
            java.util.ArrayList<british.xnews2.profile$e0> r0 = r1.f8250D
            java.lang.Object r0 = r0.get(r3)
            british.xnews2.profile$e0 r0 = (british.xnews2.profile.C1988e0) r0
            android.os.Bundle r6 = r24.getExtras()
            java.lang.String r7 = "liked"
            java.lang.String r6 = r6.getString(r7)
            r0.f8344d = r6
            r0 = 1
            goto L_0x033d
        L_0x0339:
            int r3 = r3 + 1
            goto L_0x02f1
        L_0x033c:
            r0 = 0
        L_0x033d:
            if (r0 == 0) goto L_0x072e
            int r0 = r1.f8304p
            int r3 = r3 - r0
            if (r3 != 0) goto L_0x0349
            android.widget.LinearLayout r11 = r1.f8301n0
            android.widget.TextView r0 = r1.f8317v0
            goto L_0x0361
        L_0x0349:
            if (r3 != r9) goto L_0x0350
            android.widget.LinearLayout r11 = r1.f8303o0
            android.widget.TextView r0 = r1.f8319w0
            goto L_0x0361
        L_0x0350:
            if (r3 != r10) goto L_0x0357
            android.widget.LinearLayout r11 = r1.f8305p0
            android.widget.TextView r0 = r1.f8321x0
            goto L_0x0361
        L_0x0357:
            r6 = 3
            if (r3 != r6) goto L_0x035f
            android.widget.LinearLayout r11 = r1.f8307q0
            android.widget.TextView r0 = r1.f8323y0
            goto L_0x0361
        L_0x035f:
            r0 = r4
            r11 = r0
        L_0x0361:
            if (r11 == 0) goto L_0x072e
            android.os.Bundle r2 = r24.getExtras()
            java.lang.String r2 = r2.getString(r5)
            r0.setText(r2)
            r11.setVisibility(r8)
            goto L_0x072e
        L_0x0373:
            if (r2 == 0) goto L_0x0384
            java.lang.String r5 = "elim_fotoperfil"
            boolean r5 = r2.hasExtra(r5)
            if (r5 == 0) goto L_0x0384
            java.lang.String r0 = r1.f8320x
            r1.mo7964d(r0)
            goto L_0x072e
        L_0x0384:
            java.lang.String r5 = "_liked_"
            java.lang.String r6 = "_nlikes_"
            java.lang.String r11 = "_fcrea_"
            java.lang.String r12 = "_"
            if (r2 == 0) goto L_0x04f4
            java.lang.String r13 = "elim_foto"
            boolean r13 = r2.hasExtra(r13)
            if (r13 == 0) goto L_0x04f4
            java.lang.String r4 = "elim_foto"
            java.lang.String r4 = r2.getStringExtra(r4)
            java.lang.String r8 = "indf"
            int r2 = r2.getIntExtra(r8, r3)
            boolean r8 = r4.equals(r7)
            if (r8 != 0) goto L_0x072e
            if (r2 == r3) goto L_0x072e
            java.io.File r3 = new java.io.File
            java.io.File r8 = r1.f8256G
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "fperfilgal_"
            r10.append(r13)
            r10.append(r4)
            java.lang.String r13 = ".jpg"
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            r3.<init>(r8, r10)
            boolean r8 = r3.exists()
            if (r8 == 0) goto L_0x03d0
            r3.delete()
        L_0x03d0:
            java.io.File r3 = new java.io.File
            java.io.File r8 = r1.f8256G
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "fperfilgal_"
            r10.append(r13)
            r10.append(r4)
            java.lang.String r4 = "_g.jpg"
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            r3.<init>(r8, r4)
            boolean r4 = r3.exists()
            if (r4 == 0) goto L_0x03f6
            r3.delete()
        L_0x03f6:
            java.util.ArrayList<british.xnews2.profile$e0> r3 = r1.f8250D
            java.lang.Object r3 = r3.get(r2)
            british.xnews2.profile$e0 r3 = (british.xnews2.profile.C1988e0) r3
            r3.f8345e = r9
            r1.mo7969l(r2, r9)
            android.content.SharedPreferences r3 = r1.f8296a1
            android.content.SharedPreferences$Editor r3 = r3.edit()
        L_0x0409:
            r4 = 3
            if (r2 > r4) goto L_0x04ef
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r2)
            r4.append(r12)
            java.lang.String r8 = r1.f8320x
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            android.content.SharedPreferences r8 = r1.f8296a1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            int r10 = r2 + 1
            r9.append(r10)
            r9.append(r12)
            java.lang.String r13 = r1.f8320x
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            java.lang.String r8 = r8.getString(r9, r7)
            r3.putString(r4, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "f"
            r4.append(r8)
            r4.append(r2)
            r4.append(r11)
            java.lang.String r9 = r1.f8320x
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            android.content.SharedPreferences r9 = r1.f8296a1
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            r13.append(r10)
            r13.append(r11)
            java.lang.String r14 = r1.f8320x
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.String r9 = r9.getString(r13, r7)
            r3.putString(r4, r9)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            r4.append(r2)
            r4.append(r6)
            java.lang.String r9 = r1.f8320x
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            android.content.SharedPreferences r9 = r1.f8296a1
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            r13.append(r10)
            r13.append(r6)
            java.lang.String r14 = r1.f8320x
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.String r9 = r9.getString(r13, r7)
            r3.putString(r4, r9)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            r4.append(r2)
            r4.append(r5)
            java.lang.String r2 = r1.f8320x
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.content.SharedPreferences r4 = r1.f8296a1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r9.append(r10)
            r9.append(r5)
            java.lang.String r8 = r1.f8320x
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r4 = r4.getString(r8, r7)
            r3.putString(r2, r4)
            r2 = r10
            goto L_0x0409
        L_0x04ef:
            r3.commit()
            goto L_0x072e
        L_0x04f4:
            java.lang.String r0 = "idv"
            if (r2 == 0) goto L_0x0583
            java.lang.String r13 = "nlikesv"
            boolean r14 = r2.hasExtra(r13)
            if (r14 == 0) goto L_0x0583
            r3 = 0
        L_0x0501:
            java.util.ArrayList<british.xnews2.profile$f0> r5 = r1.f8252E
            int r5 = r5.size()
            if (r3 >= r5) goto L_0x054c
            java.util.ArrayList<british.xnews2.profile$f0> r5 = r1.f8252E
            java.lang.Object r5 = r5.get(r3)
            british.xnews2.profile$f0 r5 = (british.xnews2.profile.C1990f0) r5
            java.lang.String r5 = r5.f8349a
            android.os.Bundle r6 = r24.getExtras()
            java.lang.String r6 = r6.getString(r0)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0549
            java.util.ArrayList<british.xnews2.profile$f0> r0 = r1.f8252E
            java.lang.Object r0 = r0.get(r3)
            british.xnews2.profile$f0 r0 = (british.xnews2.profile.C1990f0) r0
            android.os.Bundle r5 = r24.getExtras()
            java.lang.String r5 = r5.getString(r13)
            r0.f8351c = r5
            java.util.ArrayList<british.xnews2.profile$f0> r0 = r1.f8252E
            java.lang.Object r0 = r0.get(r3)
            british.xnews2.profile$f0 r0 = (british.xnews2.profile.C1990f0) r0
            android.os.Bundle r5 = r24.getExtras()
            java.lang.String r6 = "liked"
            java.lang.String r5 = r5.getString(r6)
            r0.f8353e = r5
            r0 = 1
            goto L_0x054d
        L_0x0549:
            int r3 = r3 + 1
            goto L_0x0501
        L_0x054c:
            r0 = 0
        L_0x054d:
            if (r0 == 0) goto L_0x072e
            int r0 = r1.f8306q
            int r3 = r3 - r0
            if (r3 != 0) goto L_0x0559
            android.widget.LinearLayout r11 = r1.f8309r0
            android.widget.TextView r0 = r1.f8325z0
            goto L_0x0571
        L_0x0559:
            if (r3 != r9) goto L_0x0560
            android.widget.LinearLayout r11 = r1.f8311s0
            android.widget.TextView r0 = r1.f8245A0
            goto L_0x0571
        L_0x0560:
            if (r3 != r10) goto L_0x0567
            android.widget.LinearLayout r11 = r1.f8313t0
            android.widget.TextView r0 = r1.f8247B0
            goto L_0x0571
        L_0x0567:
            r5 = 3
            if (r3 != r5) goto L_0x056f
            android.widget.LinearLayout r11 = r1.f8315u0
            android.widget.TextView r0 = r1.f8249C0
            goto L_0x0571
        L_0x056f:
            r0 = r4
            r11 = r0
        L_0x0571:
            if (r11 == 0) goto L_0x072e
            android.os.Bundle r2 = r24.getExtras()
            java.lang.String r2 = r2.getString(r13)
            r0.setText(r2)
            r11.setVisibility(r8)
            goto L_0x072e
        L_0x0583:
            if (r2 == 0) goto L_0x0704
            java.lang.String r4 = "elim_video"
            boolean r4 = r2.hasExtra(r4)
            if (r4 == 0) goto L_0x0704
            java.lang.String r4 = "elim_video"
            java.lang.String r4 = r2.getStringExtra(r4)
            java.lang.String r8 = "indv"
            int r2 = r2.getIntExtra(r8, r3)
            boolean r8 = r4.equals(r7)
            if (r8 != 0) goto L_0x072e
            if (r2 == r3) goto L_0x072e
            java.io.File r3 = new java.io.File
            java.io.File r8 = r1.f8256G
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "fperfilgalv_"
            r10.append(r13)
            r10.append(r4)
            java.lang.String r4 = ".jpg"
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            r3.<init>(r8, r4)
            boolean r4 = r3.exists()
            if (r4 == 0) goto L_0x05c7
            r3.delete()
        L_0x05c7:
            java.util.ArrayList<british.xnews2.profile$f0> r3 = r1.f8252E
            java.lang.Object r3 = r3.get(r2)
            british.xnews2.profile$f0 r3 = (british.xnews2.profile.C1990f0) r3
            r3.f8354f = r9
            int r3 = r1.f8316v
            int r3 = r3 - r9
            r1.f8316v = r3
            r1.mo7985p(r2, r9)
            android.content.SharedPreferences r3 = r1.f8296a1
            android.content.SharedPreferences$Editor r3 = r3.edit()
            r4 = 3
        L_0x05e0:
            if (r2 > r4) goto L_0x0700
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r2)
            r8.append(r12)
            java.lang.String r9 = r1.f8320x
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.content.SharedPreferences r9 = r1.f8296a1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            int r13 = r2 + 1
            r10.append(r13)
            r10.append(r12)
            java.lang.String r14 = r1.f8320x
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            java.lang.String r9 = r9.getString(r10, r7)
            r3.putString(r8, r9)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "v"
            r8.append(r9)
            r8.append(r2)
            java.lang.String r10 = "_formato_"
            r8.append(r10)
            java.lang.String r10 = r1.f8320x
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            android.content.SharedPreferences r10 = r1.f8296a1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r9)
            r14.append(r13)
            java.lang.String r15 = "_formato_"
            r14.append(r15)
            java.lang.String r15 = r1.f8320x
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            java.lang.String r10 = r10.getString(r14, r7)
            r3.putString(r8, r10)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            r8.append(r2)
            r8.append(r11)
            java.lang.String r10 = r1.f8320x
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            android.content.SharedPreferences r10 = r1.f8296a1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r9)
            r14.append(r13)
            r14.append(r11)
            java.lang.String r15 = r1.f8320x
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            java.lang.String r10 = r10.getString(r14, r7)
            r3.putString(r8, r10)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            r8.append(r2)
            r8.append(r6)
            java.lang.String r10 = r1.f8320x
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            android.content.SharedPreferences r10 = r1.f8296a1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r9)
            r14.append(r13)
            r14.append(r6)
            java.lang.String r15 = r1.f8320x
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            java.lang.String r10 = r10.getString(r14, r7)
            r3.putString(r8, r10)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            r8.append(r2)
            r8.append(r5)
            java.lang.String r2 = r1.f8320x
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            android.content.SharedPreferences r8 = r1.f8296a1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r13)
            r10.append(r5)
            java.lang.String r9 = r1.f8320x
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r8 = r8.getString(r9, r7)
            r3.putString(r2, r8)
            r2 = r13
            goto L_0x05e0
        L_0x0700:
            r3.commit()
            goto L_0x072e
        L_0x0704:
            if (r2 == 0) goto L_0x072e
            java.lang.String r0 = "finalizar"
            boolean r0 = r2.hasExtra(r0)
            if (r0 == 0) goto L_0x072e
            android.os.Bundle r0 = r24.getExtras()
            java.lang.String r4 = "finalizar"
            boolean r0 = r0.getBoolean(r4)
            if (r0 == 0) goto L_0x072e
            android.os.Bundle r0 = r24.getExtras()
            java.lang.String r4 = "finalizar_app"
            boolean r0 = r0.getBoolean(r4)
            if (r0 != 0) goto L_0x0728
            r1.f6659e = r8
        L_0x0728:
            r1.setResult(r3, r2)
            r21.finish()
        L_0x072e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.profile.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onAdClicked(C3371Ad ad) {
    }

    public void onAdClosed() {
        if (this.f8281S0) {
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
    }

    public void onBackPressed() {
        if (!this.f6659e || this.f8251D0 || !this.f8254F.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f8251D0 = true;
        C1692config.m8199t(this);
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
        String str9;
        View findViewById;
        View view2 = view;
        if (view.getId() == R.id.fl_trophy) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            if (C1692config.m8205x0(this)) {
                View inflate = getLayoutInflater().inflate(R.layout.webview_progressbar, (ViewGroup) null);
                WebView webView = (WebView) inflate.findViewById(R.id.webview_wp);
                webView.getSettings().setUserAgentString("Android Vinebre Software");
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setPluginState(WebSettings.PluginState.ON);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.pb_wp);
                if (Build.VERSION.SDK_INT > 20) {
                    C1692config.m8168S0(progressBar, this.f6656b);
                }
                builder.setNegativeButton(R.string.cerrar, new C1979a());
                AlertDialog create = builder.create();
                if (!this.f6656b.equals("")) {
                    create.setOnShowListener(new C1981b(create));
                }
                webView.setWebViewClient(new C1983c(create, progressBar));
                create.setView(inflate);
                if (!this.f6656b.equals("")) {
                    create.setOnShowListener(new C1985d(create));
                }
                create.show();
                webView.loadUrl(C1692config.f7107G5 + "games-scores.e-droid.net/srv/game_comparison.php?c1=" + this.f8246B + "&c2=" + this.f8248C + "&fp=" + this.f8302o + "&idusu=" + this.f8300n + "&c=" + this.f8318w + "&idusu_2=" + this.f8320x);
                return;
            }
            builder.setMessage(getResources().getString(R.string.wv_sinconex));
            builder.setNegativeButton(R.string.cerrar, new C1987e());
            AlertDialog create2 = builder.create();
            if (!this.f6656b.equals("")) {
                create2.setOnShowListener(new C1989f(create2));
            }
            create2.show();
        } else if (view.getId() == R.id.iv_ban) {
            mo7963c(this.f8320x);
        } else if (view.getId() == R.id.tv_likes_n || view.getId() == R.id.tv_likes_self) {
            if (this.f8314u != 0) {
                this.f8291X0 = new AlertDialog.Builder(this);
                View inflate2 = getLayoutInflater().inflate(R.layout.likes_list, (ViewGroup) null);
                this.f8293Y0 = inflate2;
                if (Build.VERSION.SDK_INT > 20) {
                    C1692config.m8168S0((ProgressBar) inflate2.findViewById(R.id.likes_pb), this.f6656b);
                }
                this.f8291X0.setView(this.f8293Y0);
                this.f8291X0.setCancelable(true);
                ListView listView = (ListView) this.f8293Y0.findViewById(R.id.lv);
                listView.setCacheColorHint(0);
                C1770e0 e0Var = new C1770e0(this, R.layout.likes_item, this.f8285U0, this.f8300n);
                this.f8287V0 = e0Var;
                listView.setAdapter(e0Var);
                listView.setOnItemClickListener(new C1991g());
                this.f8291X0.show();
                if (this.f8285U0.size() == 0) {
                    C2002l0 l0Var = this.f8289W0;
                    if (l0Var == null || l0Var.getStatus() != AsyncTask.Status.RUNNING) {
                        C2002l0 l0Var2 = new C2002l0();
                        this.f8289W0 = l0Var2;
                        l0Var2.execute(new String[0]);
                    }
                }
            }
        } else if (view.getId() == R.id.iv_favorito) {
            if (this.f8296a1.contains("usufav_" + this.f8320x)) {
                mo7965f(false);
                SharedPreferences.Editor edit = this.f8296a1.edit();
                edit.putBoolean("usufav_noactivar_" + this.f8320x, true);
                edit.commit();
                new C1992g0(Boolean.FALSE).execute(new String[0]);
                return;
            }
            mo7965f(true);
            new C1992g0(Boolean.TRUE).execute(new String[0]);
            if (!this.f8296a1.contains("usufav_msgmostrado")) {
                SharedPreferences.Editor edit2 = this.f8296a1.edit();
                edit2.putBoolean("usufav_msgmostrado", true);
                edit2.commit();
                AlertDialog create3 = new AlertDialog.Builder(this).setCancelable(false).setPositiveButton(R.string.aceptar, (DialogInterface.OnClickListener) null).setMessage(R.string.favorito_activar).create();
                if (!this.f6656b.equals("")) {
                    create3.setOnShowListener(new C1993h(create3));
                }
                create3.show();
                try {
                    ((TextView) create3.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused) {
                }
            }
        } else if (view.getId() == R.id.iv_privado) {
            Intent intent = new Intent(this, t_chat.class);
            intent.putExtra("empezar_privado", true);
            intent.putExtra("externo", true);
            intent.putExtra("id_remit", this.f8320x);
            intent.putExtra("nombre_remit", this.f8267L0.getString("nombre"));
            intent.putExtra("idchat", 0);
            intent.putExtra("idtema", 0);
            intent.putExtra("fotos_perfil", this.f8267L0.getInt("fotos_perfil"));
            intent.putExtra("fotos_chat", this.f8267L0.getInt("fotos_chat"));
            intent.putExtra("fnac", this.f8267L0.getInt("p_fnac"));
            intent.putExtra("sexo", this.f8267L0.getInt("p_sexo"));
            intent.putExtra("descr", this.f8267L0.getInt("p_descr"));
            intent.putExtra("dist", this.f8267L0.getInt("p_dist"));
            intent.putExtra("privados", this.f8267L0.getBoolean("privados_chat"));
            intent.putExtra("coments", this.f8267L0.getBoolean("coments_chat"));
            intent.putExtra("galeria", this.f8267L0.getBoolean("galeria"));
            C1692config config = this.f8254F;
            intent.putExtra("c1", config.f7231O1[config.f7318d].f7916g);
            C1692config config2 = this.f8254F;
            intent.putExtra("c2", config2.f7231O1[config2.f7318d].f7919h);
            startActivityForResult(intent, 0);
        } else {
            String str10 = "fotos_chat";
            if (view.getId() == R.id.iv_enviarcoment) {
                m8476h(false);
            } else if (view.getId() == R.id.iv_elimcoment) {
                View view3 = (View) view.getParent().getParent();
                String str11 = (String) view3.getTag(R.id.idaux2);
                if (str11 != null) {
                    AlertDialog create4 = new AlertDialog.Builder(this).setNegativeButton(R.string.no, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.si, new C1995i(view3, str11)).setMessage(R.string.confirmar_elimcoment).create();
                    if (!this.f6656b.equals("")) {
                        create4.setOnShowListener(new C1997j(create4));
                    }
                    create4.show();
                    ((TextView) create4.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                }
            } else if (view.getId() == R.id.iv_spamcoment) {
                View view4 = (View) view.getParent().getParent();
                if (view4 != null && (findViewById = view4.findViewById(R.id.iv_usucoment)) != null) {
                    mo7963c((String) findViewById.getTag(R.id.idaux1));
                }
            } else if (view.getId() == R.id.iv_mascoments) {
                new C1994h0().execute(new String[0]);
            } else if (view.getId() == R.id.iv_masfotos) {
                this.f8304p += 4;
                new C1996i0().execute(new String[0]);
            } else if (view.getId() == R.id.iv_menosfotos) {
                this.f8304p -= 4;
                new C1996i0().execute(new String[0]);
            } else if (view.getId() == R.id.iv_masvideos) {
                this.f8306q += 4;
                new C2004m0().execute(new String[0]);
            } else if (view.getId() == R.id.iv_menosvideos) {
                this.f8306q -= 4;
                new C2004m0().execute(new String[0]);
            } else if (view.getId() == R.id.iv_f1_v || view.getId() == R.id.iv_f2_v || view.getId() == R.id.iv_f3_v || view.getId() == R.id.iv_f4_v) {
                View view5 = view;
                String str12 = str10;
                String str13 = (String) view5.getTag(R.id.idaux1);
                int parseInt = Integer.parseInt((String) view5.getTag(R.id.idaux3));
                if (str13 != null && !this.f8252E.get(parseInt).f8354f) {
                    C1990f0 f0Var = this.f8252E.get(parseInt);
                    Intent intent2 = new Intent(this, t_video_pro.class);
                    if (f0Var.f8350b.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                        str = "mp4";
                    } else if (f0Var.f8350b.equals("2")) {
                        str = "3gp";
                    } else if (f0Var.f8350b.equals("3")) {
                        str = "webm";
                    } else {
                        return;
                    }
                    intent2.putExtra("url", "https://video.e-droid.net/files_pro/v" + f0Var.f8349a + "_" + this.f8320x + "." + str);
                    intent2.putExtra("ind", this.f8254F.f7318d);
                    intent2.putExtra("nlikes", this.f8252E.get(parseInt).f8351c);
                    intent2.putExtra("liked", this.f8252E.get(parseInt).f8353e);
                    intent2.putExtra("idv", f0Var.f8349a);
                    intent2.putExtra("indv", parseInt);
                    intent2.putExtra("idusu_profile", this.f8320x);
                    intent2.putExtra("coments", this.f8267L0.getString("coments"));
                    intent2.putExtra("p_fnac", this.f8267L0.getInt("p_fnac"));
                    intent2.putExtra("p_sexo", this.f8267L0.getInt("p_sexo"));
                    intent2.putExtra("p_descr", this.f8267L0.getInt("p_descr"));
                    intent2.putExtra("p_dist", this.f8267L0.getInt("p_dist"));
                    intent2.putExtra("coments_chat", this.f8267L0.getBoolean("coments_chat"));
                    intent2.putExtra("galeria", this.f8267L0.getBoolean("galeria"));
                    intent2.putExtra("privados_chat", this.f8267L0.getBoolean("privados_chat"));
                    intent2.putExtra("fotos_perfil", this.f8302o);
                    String str14 = str12;
                    intent2.putExtra(str14, this.f8267L0.getInt(str14));
                    startActivityForResult(intent2, 0);
                }
            } else if (view.getId() == R.id.iv_f1 || view.getId() == R.id.iv_f2 || view.getId() == R.id.iv_f3 || view.getId() == R.id.iv_f4) {
                View view6 = view;
                String str15 = str10;
                String str16 = (String) view6.getTag(R.id.idaux1);
                int parseInt2 = Integer.parseInt((String) view6.getTag(R.id.idaux3));
                if (str16 != null && !this.f8250D.get(parseInt2).f8345e) {
                    File m0 = this.f8254F.mo7517m0(this, "fperfilgal_" + str16 + "_g.jpg");
                    if (m0.exists()) {
                        Intent intent3 = new Intent(this, fotogal.class);
                        intent3.putExtra("url", "file://" + m0.getAbsolutePath());
                        intent3.putExtra("nlikes", this.f8250D.get(parseInt2).f8342b);
                        intent3.putExtra("liked", this.f8250D.get(parseInt2).f8344d);
                        intent3.putExtra("fcrea", this.f8250D.get(parseInt2).f8343c);
                        intent3.putExtra("idf", str16);
                        intent3.putExtra("indf", parseInt2);
                        intent3.putExtra("idusu_profile", this.f8320x);
                        intent3.putExtra("p_fnac", this.f8267L0.getInt("p_fnac"));
                        intent3.putExtra("p_sexo", this.f8267L0.getInt("p_sexo"));
                        intent3.putExtra("p_descr", this.f8267L0.getInt("p_descr"));
                        intent3.putExtra("p_dist", this.f8267L0.getInt("p_dist"));
                        intent3.putExtra("coments_chat", this.f8267L0.getBoolean("coments_chat"));
                        intent3.putExtra("galeria", this.f8267L0.getBoolean("galeria"));
                        intent3.putExtra("privados_chat", this.f8267L0.getBoolean("privados_chat"));
                        intent3.putExtra("fotos_perfil", this.f8302o);
                        intent3.putExtra(str15, this.f8267L0.getInt(str15));
                        startActivityForResult(intent3, 0);
                        return;
                    }
                    C2032v0 v0Var = this.f8277Q0;
                    if (v0Var == null || v0Var.getStatus() != AsyncTask.Status.RUNNING) {
                        C2032v0 v0Var2 = new C2032v0(str16, parseInt2);
                        this.f8277Q0 = v0Var2;
                        v0Var2.execute(new String[0]);
                    }
                }
            } else if (view.getId() == R.id.btnfotos) {
                AlertDialog create5 = new AlertDialog.Builder(this).setCancelable(true).setPositiveButton(getString(R.string.tomardecamara), new C2003m()).setNegativeButton(getString(R.string.tomardesd), new C2001l()).setMessage(R.string.tomarfoto).create();
                if (!this.f6656b.equals("")) {
                    create5.setOnShowListener(new C2005n(create5));
                }
                create5.show();
                ((TextView) create5.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (view.getId() != R.id.btnvideos) {
                View view7 = view;
                String str17 = str10;
                if (view7.getTag(R.id.idaux1) == null || !view7.getTag(R.id.idaux1).equals("ESCOMENT")) {
                    String str18 = this.f8254F.f7251R3;
                    if ((str18 == null || str18.equals("")) && (((str2 = this.f8254F.f7281W3) == null || str2.equals("")) && (((str3 = this.f8254F.f7250R2) == null || str3.equals("")) && (((str4 = this.f8254F.f7245Q3) == null || str4.equals("")) && (((str5 = this.f8254F.f7269U3) == null || str5.equals("")) && (((str6 = this.f8254F.f7275V3) == null || str6.equals("")) && (((str7 = this.f8254F.f7358j4) == null || str7.equals("")) && (((str8 = this.f8254F.f7287X3) == null || str8.equals("")) && ((str9 = this.f8254F.f7293Y3) == null || str9.equals("")))))))))) {
                        View view8 = view7;
                        abrir_secc(view);
                        return;
                    }
                    String str19 = this.f8254F.f7251R3;
                    if (str19 != null && !str19.equals("")) {
                        this.f6663i = new RewardedVideo((Context) this, this.f8254F.f7251R3);
                    }
                    String str20 = this.f8254F.f7245Q3;
                    if (str20 != null) {
                        str20.equals("");
                    }
                    String str21 = this.f8254F.f7269U3;
                    if (str21 != null && !str21.equals("")) {
                        this.f6664j = new RewardedVideoAd(this, this.f8254F.f7269U3);
                    }
                    String str22 = this.f8254F.f7275V3;
                    if (str22 != null && !str22.equals("")) {
                        this.f6665k = new StartAppAd(this);
                    }
                    ProgressDialog progressDialog = new ProgressDialog(this);
                    this.f6661g = progressDialog;
                    this.f6660f = view7;
                    View view9 = view7;
                    if (!this.f8254F.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
                        abrir_secc(view);
                        return;
                    }
                    return;
                }
                Intent intent4 = new Intent(this, profile.class);
                intent4.putExtra(TtmlNode.ATTR_ID, (String) view7.getTag(R.id.idaux2));
                intent4.putExtra("privados", (String) view7.getTag(R.id.idaux5));
                intent4.putExtra("nombre", (String) view7.getTag(R.id.idaux3));
                intent4.putExtra("coments", (String) view7.getTag(R.id.idaux10));
                intent4.putExtra("fnac_d", (String) view7.getTag(R.id.idaux6));
                intent4.putExtra("fnac_m", (String) view7.getTag(R.id.idaux7));
                intent4.putExtra("fnac_a", (String) view7.getTag(R.id.idaux8));
                intent4.putExtra("sexo", (String) view7.getTag(R.id.idaux9));
                intent4.putExtra("vfoto", (String) view7.getTag(R.id.idaux4));
                if (this.f8267L0.containsKey("desdepriv")) {
                    intent4.putExtra("desdepriv", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                }
                intent4.putExtra("p_fnac", this.f8267L0.getInt("p_fnac"));
                intent4.putExtra("p_sexo", this.f8267L0.getInt("p_sexo"));
                intent4.putExtra("p_descr", this.f8267L0.getInt("p_descr"));
                intent4.putExtra("p_dist", this.f8267L0.getInt("p_dist"));
                intent4.putExtra("coments_chat", this.f8267L0.getBoolean("coments_chat"));
                intent4.putExtra("galeria", this.f8267L0.getBoolean("galeria"));
                intent4.putExtra("privados_chat", this.f8267L0.getBoolean("privados_chat"));
                intent4.putExtra("fotos_perfil", this.f8302o);
                String str23 = str17;
                intent4.putExtra(str23, this.f8267L0.getInt(str23));
                startActivityForResult(intent4, 0);
            } else if (this.f8316v >= this.f8254F.f7344h2) {
                AlertDialog create6 = new AlertDialog.Builder(this).setCancelable(true).setPositiveButton(getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.demasiados_videos).create();
                if (!this.f6656b.equals("")) {
                    create6.setOnShowListener(new C2007o(create6));
                }
                create6.show();
                ((TextView) create6.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else {
                AlertDialog create7 = new AlertDialog.Builder(this).setCancelable(true).setPositiveButton(getString(R.string.tomardecamara), new C2011q()).setNegativeButton(getString(R.string.selvideo), new C2009p()).setMessage(R.string.enviarvideo).create();
                if (!this.f6656b.equals("")) {
                    create7.setOnShowListener(new C2016r(create7));
                }
                create7.show();
                ((TextView) create7.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo7966i();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f8265K0;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f8265K0;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        m8474e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:253:0x0e08  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0eed  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0f0d  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0fe1  */
    @android.annotation.TargetApi(13)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.content.Context r2 = r17.getApplicationContext()
            british.xnews2.config r2 = (british.xnews2.C1692config) r2
            r0.f8254F = r2
            java.lang.String r3 = r2.f7313c1
            if (r3 != 0) goto L_0x0013
            r2.mo7490V0()
        L_0x0013:
            r0.m8475g(r0)
            british.xnews2.profile$k r2 = new british.xnews2.profile$k
            r2.<init>()
            r0.f6666l = r2
            android.content.Intent r2 = r17.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            r0.f8267L0 = r2
            java.lang.String r3 = "desde_main"
            r4 = 0
            boolean r2 = r2.getBoolean(r3, r4)
            if (r2 == 0) goto L_0x003b
            british.xnews2.config r2 = r0.f8254F
            java.lang.String r3 = r2.f7313c1
            r0.f8246B = r3
            java.lang.String r2 = r2.f7319d1
            r0.f8248C = r2
            goto L_0x004d
        L_0x003b:
            british.xnews2.config r2 = r0.f8254F
            british.xnews2.l[] r3 = r2.f7231O1
            int r2 = r2.f7318d
            r5 = r3[r2]
            java.lang.String r5 = r5.f7916g
            r0.f8246B = r5
            r2 = r3[r2]
            java.lang.String r2 = r2.f7919h
            r0.f8248C = r2
        L_0x004d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#"
            r2.append(r3)
            java.lang.String r5 = r0.f8246B
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            boolean r2 = british.xnews2.C1692config.m8153I(r2)
            r0.f8257G0 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r5 = r0.f8248C
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            boolean r2 = british.xnews2.C1692config.m8153I(r2)
            r0.f8259H0 = r2
            java.lang.String r2 = r0.f8246B
            british.xnews2.config r5 = r0.f8254F
            java.lang.String r5 = r5.f7368l1
            java.lang.String r2 = british.xnews2.C1692config.m8189h(r2, r5)
            r0.f6656b = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 12
            if (r2 <= r5) goto L_0x0099
            boolean r6 = r0.f8257G0
            if (r6 != 0) goto L_0x0099
            r6 = 2131886906(0x7f12033a, float:1.9408404E38)
            r0.setTheme(r6)
        L_0x0099:
            java.lang.String r6 = "es_root"
            r7 = 1
            if (r1 != 0) goto L_0x00b6
            android.os.Bundle r8 = r0.f8267L0
            if (r8 == 0) goto L_0x00b2
            boolean r8 = r8.containsKey(r6)
            if (r8 == 0) goto L_0x00b2
            android.os.Bundle r8 = r0.f8267L0
            boolean r6 = r8.getBoolean(r6, r4)
            if (r6 == 0) goto L_0x00b2
            r6 = 1
            goto L_0x00b3
        L_0x00b2:
            r6 = 0
        L_0x00b3:
            r0.f6659e = r6
            goto L_0x00c7
        L_0x00b6:
            boolean r8 = r1.containsKey(r6)
            if (r8 == 0) goto L_0x00c4
            boolean r6 = r1.getBoolean(r6, r4)
            if (r6 == 0) goto L_0x00c4
            r6 = 1
            goto L_0x00c5
        L_0x00c4:
            r6 = 0
        L_0x00c5:
            r0.f6659e = r6
        L_0x00c7:
            super.onCreate(r18)
            r1 = 2131558624(0x7f0d00e0, float:1.874257E38)
            r0.setContentView(r1)
            r17.mo7966i()
            british.xnews2.config r1 = r0.f8254F
            r1.mo7486N0(r0, r4)
            java.lang.String r1 = "search"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.app.SearchManager r1 = (android.app.SearchManager) r1
            british.xnews2.profile$v r6 = new british.xnews2.profile$v
            r6.<init>()
            r1.setOnCancelListener(r6)
            british.xnews2.profile$x r6 = new british.xnews2.profile$x
            r6.<init>()
            r1.setOnDismissListener(r6)
            british.xnews2.config r1 = r0.f8254F
            android.os.Bundle r6 = r0.f8267L0
            if (r6 == 0) goto L_0x0100
            java.lang.String r8 = "ad_entrar"
            boolean r6 = r6.containsKey(r8)
            if (r6 == 0) goto L_0x0100
            r6 = 1
            goto L_0x0101
        L_0x0100:
            r6 = 0
        L_0x0101:
            android.os.Bundle r8 = r0.f8267L0
            if (r8 == 0) goto L_0x010f
            java.lang.String r9 = "fb_entrar"
            boolean r8 = r8.containsKey(r9)
            if (r8 == 0) goto L_0x010f
            r8 = 1
            goto L_0x0110
        L_0x010f:
            r8 = 0
        L_0x0110:
            r1.mo7503f1(r0, r6, r8)
            java.lang.String r1 = "sh"
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r4)
            r0.f8296a1 = r1
            r8 = 0
            java.lang.String r6 = "idusu"
            long r8 = r1.getLong(r6, r8)
            r0.f8300n = r8
            android.content.SharedPreferences r1 = r0.f8296a1
            java.lang.String r6 = "cod"
            java.lang.String r8 = ""
            java.lang.String r1 = r1.getString(r6, r8)
            r0.f8318w = r1
            android.os.Bundle r1 = r0.f8267L0
            java.lang.String r6 = "id"
            java.lang.String r1 = r1.getString(r6)
            r0.f8320x = r1
            java.io.File r1 = r17.getFilesDir()
            r0.f8256G = r1
            r17.m8474e()
            java.lang.String r1 = r0.f8246B
            boolean r1 = r1.equals(r8)
            r6 = 2
            if (r1 != 0) goto L_0x018e
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r10 = new int[r6]
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            java.lang.String r12 = r0.f8246B
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            int r11 = android.graphics.Color.parseColor(r11)
            r10[r4] = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            java.lang.String r12 = r0.f8248C
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            int r11 = android.graphics.Color.parseColor(r11)
            r10[r7] = r11
            r1.<init>(r9, r10)
            r9 = 2131362530(0x7f0a02e2, float:1.8344843E38)
            android.view.View r9 = r0.findViewById(r9)
            r9.setBackgroundDrawable(r1)
        L_0x018e:
            android.view.WindowManager r1 = r17.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            r9 = 13
            if (r2 < r9) goto L_0x01a7
            android.graphics.Point r9 = new android.graphics.Point
            r9.<init>()
            r1.getSize(r9)
            int r1 = r9.y
            r0.f8308r = r1
            goto L_0x01ad
        L_0x01a7:
            int r1 = r1.getHeight()
            r0.f8308r = r1
        L_0x01ad:
            r1 = 2131362734(0x7f0a03ae, float:1.8345257E38)
            r9 = 2131362746(0x7f0a03ba, float:1.8345281E38)
            r10 = 2131362743(0x7f0a03b7, float:1.8345275E38)
            r11 = 20
            if (r2 <= r11) goto L_0x0301
            android.view.View r2 = r0.findViewById(r10)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            android.view.View r2 = r0.findViewById(r9)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362755(0x7f0a03c3, float:1.83453E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362756(0x7f0a03c4, float:1.8345302E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362753(0x7f0a03c1, float:1.8345295E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362754(0x7f0a03c2, float:1.8345298E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            android.view.View r2 = r0.findViewById(r1)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362735(0x7f0a03af, float:1.8345259E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362719(0x7f0a039f, float:1.8345227E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362720(0x7f0a03a0, float:1.8345229E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362721(0x7f0a03a1, float:1.834523E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362722(0x7f0a03a2, float:1.8345233E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362723(0x7f0a03a3, float:1.8345235E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362724(0x7f0a03a4, float:1.8345237E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362725(0x7f0a03a5, float:1.8345239E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362726(0x7f0a03a6, float:1.834524E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362771(0x7f0a03d3, float:1.8345332E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362772(0x7f0a03d4, float:1.8345334E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362773(0x7f0a03d5, float:1.8345336E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362774(0x7f0a03d6, float:1.8345338E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362775(0x7f0a03d7, float:1.834534E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362776(0x7f0a03d8, float:1.8345342E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362777(0x7f0a03d9, float:1.8345344E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
            r2 = 2131362778(0x7f0a03da, float:1.8345346E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r12 = r0.f6656b
            british.xnews2.C1692config.m8168S0(r2, r12)
        L_0x0301:
            r0.f8263J0 = r4
            java.lang.String r2 = r0.f8320x
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            long r13 = r0.f8300n
            r12.append(r13)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L_0x0348
            r2 = 0
        L_0x031d:
            british.xnews2.config r12 = r0.f8254F
            british.xnews2.l[] r12 = r12.f7231O1
            int r13 = r12.length
            if (r2 >= r13) goto L_0x0348
            boolean r13 = r0.f8263J0
            if (r13 != 0) goto L_0x0348
            r12 = r12[r2]
            int r13 = r12.f7954t
            if (r13 != r7) goto L_0x0342
            java.lang.String r13 = r12.f7910e
            java.lang.String r14 = "games.e-droid.net"
            boolean r13 = r13.contains(r14)
            if (r13 == 0) goto L_0x0342
            boolean r13 = r12.f7927j1
            if (r13 == 0) goto L_0x0342
            boolean r12 = r12.f7930k1
            if (r12 == 0) goto L_0x0342
            r12 = 1
            goto L_0x0343
        L_0x0342:
            r12 = 0
        L_0x0343:
            r0.f8263J0 = r12
            int r2 = r2 + 1
            goto L_0x031d
        L_0x0348:
            r2 = 2131363169(0x7f0a0561, float:1.834614E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.os.Bundle r12 = r0.f8267L0
            java.lang.String r13 = "nombre"
            java.lang.String r12 = r12.getString(r13)
            r2.setText(r12)
            r2 = 2131362735(0x7f0a03af, float:1.8345259E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            r0.f8294Z = r2
            boolean r2 = r0.f8257G0
            if (r2 != 0) goto L_0x0377
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 <= r5) goto L_0x0377
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f8294Z = r1
        L_0x0377:
            android.os.Bundle r1 = r0.f8267L0
            java.lang.String r2 = "fnac_d"
            java.lang.String r1 = r1.getString(r2)
            int r1 = java.lang.Integer.parseInt(r1)
            android.os.Bundle r2 = r0.f8267L0
            java.lang.String r12 = "fnac_m"
            java.lang.String r2 = r2.getString(r12)
            int r2 = java.lang.Integer.parseInt(r2)
            android.os.Bundle r12 = r0.f8267L0
            java.lang.String r13 = "fnac_a"
            java.lang.String r12 = r12.getString(r13)
            int r12 = java.lang.Integer.parseInt(r12)
            android.os.Bundle r13 = r0.f8267L0
            java.lang.String r14 = "p_fnac"
            int r13 = r13.getInt(r14)
            if (r13 <= 0) goto L_0x03e7
            if (r1 <= 0) goto L_0x03e7
            if (r2 <= 0) goto L_0x03e7
            if (r12 <= 0) goto L_0x03e7
            java.util.Calendar r13 = java.util.Calendar.getInstance()
            int r2 = r2 - r7
            r13.set(r12, r2, r1)
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            int r2 = r1.get(r7)
            int r12 = r13.get(r7)
            int r2 = r2 - r12
            r0.f8310s = r2
            int r2 = r13.get(r6)
            int r12 = r1.get(r6)
            if (r2 > r12) goto L_0x03e2
            int r2 = r13.get(r6)
            int r12 = r1.get(r6)
            if (r2 != r12) goto L_0x03e7
            r2 = 5
            int r2 = r13.get(r2)
            r12 = 5
            int r1 = r1.get(r12)
            if (r2 <= r1) goto L_0x03e7
        L_0x03e2:
            int r1 = r0.f8310s
            int r1 = r1 - r7
            r0.f8310s = r1
        L_0x03e7:
            android.os.Bundle r1 = r0.f8267L0
            java.lang.String r2 = "p_dist"
            int r1 = r1.getInt(r2)
            if (r1 <= 0) goto L_0x040f
            android.os.Bundle r1 = r0.f8267L0
            java.lang.String r2 = "dist"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x040f
            android.os.Bundle r1 = r0.f8267L0
            java.lang.String r1 = r1.getString(r2)
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x040f
            android.os.Bundle r1 = r0.f8267L0
            java.lang.String r1 = r1.getString(r2)
            r0.f8244A = r1
        L_0x040f:
            java.lang.String r1 = r0.f8320x
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r12 = r0.f8300n
            r2.append(r12)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0446
            android.os.Bundle r1 = r0.f8267L0
            java.lang.String r2 = "conectado"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x0446
            android.os.Bundle r1 = r0.f8267L0
            java.lang.String r2 = "conectado"
            boolean r1 = r1.getBoolean(r2)
            if (r1 == 0) goto L_0x0446
            r1 = 2131362349(0x7f0a022d, float:1.8344476E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
        L_0x0446:
            r17.mo7972o()
            r1 = 2131362100(0x7f0a0134, float:1.8343971E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f8297l0 = r1
            android.os.Bundle r1 = r0.f8267L0
            java.lang.String r2 = "p_descr"
            int r1 = r1.getInt(r2)
            if (r1 <= 0) goto L_0x04a0
            android.content.SharedPreferences r1 = r0.f8296a1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r12 = "descr_"
            r2.append(r12)
            java.lang.String r12 = r0.f8320x
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = r1.getString(r2, r8)
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x04a0
            android.widget.TextView r1 = r0.f8297l0
            android.content.SharedPreferences r2 = r0.f8296a1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "descr_"
            r12.append(r13)
            java.lang.String r13 = r0.f8320x
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.String r2 = r2.getString(r12, r8)
            r1.setText(r2)
            android.widget.TextView r1 = r0.f8297l0
            r1.setVisibility(r4)
        L_0x04a0:
            android.os.Bundle r1 = r0.f8267L0
            java.lang.String r2 = "vfoto"
            java.lang.String r1 = r1.getString(r2)
            r0.f8322y = r1
            android.os.Bundle r1 = r0.f8267L0
            java.lang.String r2 = "fotos_perfil"
            int r1 = r1.getInt(r2)
            r0.f8302o = r1
            r1 = 2131362419(0x7f0a0273, float:1.8344618E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f8258H = r1
            int r1 = r0.f8302o
            r2 = 1056964608(0x3f000000, float:0.5)
            r12 = 8
            if (r1 == 0) goto L_0x05eb
            java.lang.String r1 = r0.f8322y
            java.lang.String r13 = "0"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x04d3
            goto L_0x05eb
        L_0x04d3:
            java.lang.String r1 = r0.f8320x
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            long r14 = r0.f8300n
            r13.append(r14)
            r13.append(r8)
            java.lang.String r13 = r13.toString()
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0512
            android.widget.ImageView r1 = r0.f8258H     // Catch:{ Exception | OutOfMemoryError -> 0x050f }
            android.content.ContentResolver r9 = r17.getContentResolver()     // Catch:{ Exception | OutOfMemoryError -> 0x050f }
            british.xnews2.config r10 = r0.f8254F     // Catch:{ Exception | OutOfMemoryError -> 0x050f }
            java.io.File r10 = r10.mo7516l0(r0, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x050f }
            android.net.Uri r10 = android.net.Uri.fromFile(r10)     // Catch:{ Exception | OutOfMemoryError -> 0x050f }
            android.graphics.Bitmap r9 = android.provider.MediaStore.Images.Media.getBitmap(r9, r10)     // Catch:{ Exception | OutOfMemoryError -> 0x050f }
            r1.setImageBitmap(r9)     // Catch:{ Exception | OutOfMemoryError -> 0x050f }
            android.widget.ImageView r1 = r0.f8258H     // Catch:{ Exception | OutOfMemoryError -> 0x050f }
            british.xnews2.profile$y r9 = new british.xnews2.profile$y     // Catch:{ Exception | OutOfMemoryError -> 0x050f }
            r9.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x050f }
            r1.setOnClickListener(r9)     // Catch:{ Exception | OutOfMemoryError -> 0x050f }
            goto L_0x05f3
        L_0x050f:
            goto L_0x05f3
        L_0x0512:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r13 = "fperfil_"
            r1.append(r13)
            java.lang.String r13 = r0.f8320x
            r1.append(r13)
            java.lang.String r13 = "_g.jpg"
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            java.io.File r13 = new java.io.File     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            java.io.File r14 = r0.f8256G     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            r13.<init>(r14, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            android.graphics.BitmapFactory$Options r14 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            r14.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            r14.inJustDecodeBounds = r7     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            java.lang.String r15 = r13.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            android.graphics.BitmapFactory.decodeFile(r15, r14)     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            r15 = 1142292480(0x44160000, float:600.0)
            android.content.res.Resources r16 = r17.getResources()     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            android.util.DisplayMetrics r6 = r16.getDisplayMetrics()     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            float r6 = r6.density     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            float r6 = r6 * r15
            float r6 = r6 + r2
            int r6 = (int) r6     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            r15 = 1142292480(0x44160000, float:600.0)
            android.content.res.Resources r16 = r17.getResources()     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            android.util.DisplayMetrics r5 = r16.getDisplayMetrics()     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            float r5 = r5.density     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            float r5 = r5 * r15
            float r5 = r5 + r2
            int r5 = (int) r5     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            int r15 = r14.outWidth     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            int r14 = r14.outHeight     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            if (r15 > r6) goto L_0x056a
            if (r14 > r5) goto L_0x056a
            r16 = 1
            goto L_0x056c
        L_0x056a:
            r16 = 0
        L_0x056c:
            if (r16 != 0) goto L_0x0589
            int r5 = british.xnews2.C1692config.m8193n(r15, r14, r6, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            float r6 = (float) r15     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            float r5 = (float) r5     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            float r6 = r6 / r5
            int r5 = java.lang.Math.round(r6)     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            r6.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            r6.inSampleSize = r5     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            java.lang.String r5 = r13.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFile(r5, r6)     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            goto L_0x0595
        L_0x0589:
            android.content.ContentResolver r5 = r17.getContentResolver()     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            android.net.Uri r6 = android.net.Uri.fromFile(r13)     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            android.graphics.Bitmap r5 = android.provider.MediaStore.Images.Media.getBitmap(r5, r6)     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
        L_0x0595:
            android.widget.ImageView r6 = r0.f8258H     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            r6.setImageBitmap(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            android.widget.ImageView r5 = r0.f8258H     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            british.xnews2.profile$z r6 = new british.xnews2.profile$z     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            r6.<init>(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            r5.setOnClickListener(r6)     // Catch:{ Exception | OutOfMemoryError -> 0x05a5 }
            goto L_0x05a6
        L_0x05a5:
        L_0x05a6:
            android.content.SharedPreferences r1 = r0.f8296a1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "fperfil_"
            r5.append(r6)
            java.lang.String r6 = r0.f8320x
            r5.append(r6)
            java.lang.String r6 = "_g"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = r1.getString(r5, r8)
            java.lang.String r5 = r0.f8322y
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x05f3
            boolean r1 = r0.f8257G0
            if (r1 == 0) goto L_0x05d8
            android.view.View r1 = r0.findViewById(r9)
            r1.setVisibility(r4)
            goto L_0x05df
        L_0x05d8:
            android.view.View r1 = r0.findViewById(r10)
            r1.setVisibility(r4)
        L_0x05df:
            british.xnews2.profile$u0 r1 = new british.xnews2.profile$u0
            r5 = 0
            r1.<init>()
            java.lang.String[] r5 = new java.lang.String[r4]
            r1.execute(r5)
            goto L_0x05f3
        L_0x05eb:
            android.widget.ImageView r1 = r0.f8258H
            r1.setVisibility(r12)
            r17.mo7988s()
        L_0x05f3:
            int r1 = r0.f8302o
            if (r1 <= 0) goto L_0x0649
            british.xnews2.config r1 = r0.f8254F
            java.io.File r1 = r1.mo7516l0(r0, r7)
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            r5.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            r5.inJustDecodeBounds = r7     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            java.lang.String r6 = r1.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            android.graphics.BitmapFactory.decodeFile(r6, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            int r6 = r5.outWidth     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            r9 = 75
            r10 = 100
            int r5 = r5.outHeight     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            if (r6 > r9) goto L_0x0619
            if (r5 > r10) goto L_0x0619
            r13 = 1
            goto L_0x061a
        L_0x0619:
            r13 = 0
        L_0x061a:
            if (r13 != 0) goto L_0x0639
            int r5 = british.xnews2.C1692config.m8193n(r6, r5, r9, r10)     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            float r6 = (float) r6     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            float r5 = (float) r5     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            float r6 = r6 / r5
            int r5 = java.lang.Math.round(r6)     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            r6.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            r6.inSampleSize = r5     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            java.lang.String r1 = r1.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r1, r6)     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            r0.f8269M0 = r1     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            goto L_0x0649
        L_0x0639:
            android.content.ContentResolver r5 = r17.getContentResolver()     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            android.net.Uri r1 = android.net.Uri.fromFile(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            android.graphics.Bitmap r1 = android.provider.MediaStore.Images.Media.getBitmap(r5, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            r0.f8269M0 = r1     // Catch:{ Exception | OutOfMemoryError -> 0x0648 }
            goto L_0x0649
        L_0x0648:
        L_0x0649:
            r1 = 2131362481(0x7f0a02b1, float:1.8344744E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f8299m0 = r1
            android.os.Bundle r1 = r0.f8267L0
            java.lang.String r5 = "coments"
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r5 = "1"
            boolean r1 = r1.equals(r5)
            r5 = -1
            if (r1 == 0) goto L_0x079c
            android.os.Bundle r1 = r0.f8267L0
            java.lang.String r6 = "coments_chat"
            boolean r1 = r1.getBoolean(r6)
            if (r1 == 0) goto L_0x079c
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            boolean r6 = r0.f8257G0
            if (r6 != 0) goto L_0x0676
            r1 = -1
        L_0x0676:
            r6 = 2131363097(0x7f0a0519, float:1.8345993E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setTextColor(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r9 = r0.f6656b
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            boolean r6 = british.xnews2.C1692config.m8153I(r6)
            if (r6 == 0) goto L_0x06a4
            r6 = 2131362357(0x7f0a0235, float:1.8344492E38)
            android.view.View r6 = r0.findViewById(r6)
            r6.setVisibility(r4)
            goto L_0x06ae
        L_0x06a4:
            r6 = 2131362356(0x7f0a0234, float:1.834449E38)
            android.view.View r6 = r0.findViewById(r6)
            r6.setVisibility(r4)
        L_0x06ae:
            android.content.res.Resources r6 = r17.getResources()
            r9 = 2131230871(0x7f080097, float:1.8077807E38)
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r9)
            java.lang.String r9 = r0.f6656b
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x06db
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            java.lang.String r10 = r0.f6656b
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            int r9 = android.graphics.Color.parseColor(r9)
            android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.MULTIPLY
            r6.setColorFilter(r9, r10)
        L_0x06db:
            r9 = 2131362358(0x7f0a0236, float:1.8344494E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r9.setImageDrawable(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r9 = r0.f6656b
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            boolean r6 = british.xnews2.C1692config.m8153I(r6)
            if (r6 == 0) goto L_0x0709
            r6 = 2131362382(0x7f0a024e, float:1.8344543E38)
            android.view.View r6 = r0.findViewById(r6)
            r6.setVisibility(r4)
            goto L_0x0713
        L_0x0709:
            r6 = 2131362381(0x7f0a024d, float:1.834454E38)
            android.view.View r6 = r0.findViewById(r6)
            r6.setVisibility(r4)
        L_0x0713:
            android.content.res.Resources r6 = r17.getResources()
            r9 = 2131231345(0x7f080271, float:1.8078768E38)
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r9)
            java.lang.String r9 = r0.f6656b
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x0740
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            java.lang.String r10 = r0.f6656b
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            int r9 = android.graphics.Color.parseColor(r9)
            android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.MULTIPLY
            r6.setColorFilter(r9, r10)
        L_0x0740:
            r9 = 2131362380(0x7f0a024c, float:1.8344539E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r9.setImageDrawable(r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 <= r11) goto L_0x0766
            r1 = 2131362144(0x7f0a0160, float:1.834406E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            boolean r6 = r0.f8257G0
            r6 = r6 ^ r7
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r9 = r0.f6656b
            british.xnews2.C1692config.m8150F(r1, r6, r9)
            goto L_0x0776
        L_0x0766:
            r9 = 12
            if (r6 <= r9) goto L_0x0776
            r6 = 2131362144(0x7f0a0160, float:1.834406E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.EditText r6 = (android.widget.EditText) r6
            r6.setTextColor(r1)
        L_0x0776:
            r1 = 2131362358(0x7f0a0236, float:1.8344494E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
            r1 = 2131362380(0x7f0a024c, float:1.8344539E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
            r1 = 2131362421(0x7f0a0275, float:1.8344622E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.graphics.Bitmap r6 = r0.f8269M0
            r1.setImageBitmap(r6)
            r0.mo7968k(r7)
            goto L_0x07b5
        L_0x079c:
            r1 = 2131363097(0x7f0a0519, float:1.8345993E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r12)
            r1 = 2131362849(0x7f0a0421, float:1.834549E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r12)
            android.widget.LinearLayout r1 = r0.f8299m0
            r1.setVisibility(r12)
        L_0x07b5:
            r0.f8304p = r4
            r0.f8253E0 = r4
            r1 = 2131362359(0x7f0a0237, float:1.8344496E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f8260I = r1
            r1 = 2131362361(0x7f0a0239, float:1.83445E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f8262J = r1
            r1 = 2131362363(0x7f0a023b, float:1.8344504E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f8264K = r1
            r1 = 2131362365(0x7f0a023d, float:1.8344509E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f8266L = r1
            r1 = 2131362512(0x7f0a02d0, float:1.8344807E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f8301n0 = r1
            r1 = 2131362514(0x7f0a02d2, float:1.834481E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f8303o0 = r1
            r1 = 2131362516(0x7f0a02d4, float:1.8344815E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f8305p0 = r1
            r1 = 2131362518(0x7f0a02d6, float:1.8344819E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f8307q0 = r1
            r1 = 2131363128(0x7f0a0538, float:1.8346056E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f8317v0 = r1
            r1 = 2131363130(0x7f0a053a, float:1.834606E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f8319w0 = r1
            r1 = 2131363132(0x7f0a053c, float:1.8346064E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f8321x0 = r1
            r1 = 2131363134(0x7f0a053e, float:1.8346068E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f8323y0 = r1
            boolean r1 = r0.f8257G0
            r6 = 2131363032(0x7f0a04d8, float:1.8345861E38)
            if (r1 == 0) goto L_0x08a6
            r1 = 2131362720(0x7f0a03a0, float:1.8345229E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f8278R = r1
            r1 = 2131362722(0x7f0a03a2, float:1.8345233E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f8280S = r1
            r1 = 2131362724(0x7f0a03a4, float:1.8345237E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f8282T = r1
            r1 = 2131362726(0x7f0a03a6, float:1.834524E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f8284U = r1
            r1 = 2131362844(0x7f0a041c, float:1.834548E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r7 = "#FFEEEEEE"
            int r7 = android.graphics.Color.parseColor(r7)
            r1.setBackgroundColor(r7)
            r1 = 2131363124(0x7f0a0534, float:1.8346048E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r7 = british.xnews2.C1692config.f7101A5
            r1.setTextColor(r7)
            r1 = 2131363173(0x7f0a0565, float:1.8346147E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setTextColor(r7)
            android.view.View r1 = r0.findViewById(r6)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            int r7 = british.xnews2.C1692config.f7104D5
            r1.setBackgroundColor(r7)
            goto L_0x0901
        L_0x08a6:
            r1 = 2131362719(0x7f0a039f, float:1.8345227E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f8278R = r1
            r1 = 2131362721(0x7f0a03a1, float:1.834523E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f8280S = r1
            r1 = 2131362723(0x7f0a03a3, float:1.8345235E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f8282T = r1
            r1 = 2131362725(0x7f0a03a5, float:1.8345239E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f8284U = r1
            r1 = 2131362844(0x7f0a041c, float:1.834548E38)
            android.view.View r1 = r0.findViewById(r1)
            int r7 = british.xnews2.C1692config.f7106F5
            r1.setBackgroundColor(r7)
            r1 = 2131363124(0x7f0a0534, float:1.8346048E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setTextColor(r5)
            r1 = 2131363173(0x7f0a0565, float:1.8346147E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setTextColor(r5)
            android.view.View r1 = r0.findViewById(r6)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            int r7 = british.xnews2.C1692config.f7101A5
            r1.setBackgroundColor(r7)
        L_0x0901:
            android.os.Bundle r1 = r0.f8267L0
            java.lang.String r7 = "galeria"
            boolean r1 = r1.getBoolean(r7)
            if (r1 == 0) goto L_0x0a64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r6 = r0.f6656b
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            boolean r1 = british.xnews2.C1692config.m8153I(r1)
            if (r1 == 0) goto L_0x0937
            r1 = 2131362385(0x7f0a0251, float:1.834455E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
            r1 = 2131362391(0x7f0a0257, float:1.8344561E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
            goto L_0x094b
        L_0x0937:
            r1 = 2131362384(0x7f0a0250, float:1.8344547E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
            r1 = 2131362390(0x7f0a0256, float:1.834456E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
        L_0x094b:
            android.content.res.Resources r1 = r17.getResources()
            r6 = 2131231484(0x7f0802fc, float:1.807905E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r6)
            java.lang.String r6 = r0.f6656b
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0978
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r7 = r0.f6656b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            int r6 = android.graphics.Color.parseColor(r6)
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.setColorFilter(r6, r7)
        L_0x0978:
            r6 = 2131362383(0x7f0a024f, float:1.8344545E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r6.setImageDrawable(r1)
            r1 = 2131362383(0x7f0a024f, float:1.8344545E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
            android.content.res.Resources r1 = r17.getResources()
            r6 = 2131230808(0x7f080058, float:1.807768E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r6)
            java.lang.String r6 = r0.f6656b
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x09bb
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r7 = r0.f6656b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            int r6 = android.graphics.Color.parseColor(r6)
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.setColorFilter(r6, r7)
        L_0x09bb:
            r6 = 2131362389(0x7f0a0255, float:1.8344557E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r6.setImageDrawable(r1)
            r1 = 2131362389(0x7f0a0255, float:1.8344557E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
            r17.mo7970m()
            java.lang.String r1 = r0.f8320x
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            long r9 = r0.f8300n
            r6.append(r9)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0a6b
            r1 = 2131361969(0x7f0a00b1, float:1.8343705E38)
            android.view.View r6 = r0.findViewById(r1)
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.content.res.Resources r7 = r17.getResources()
            r9 = 2131820587(0x7f11002b, float:1.9273893E38)
            java.lang.String r7 = r7.getString(r9)
            java.lang.String r7 = r7.toUpperCase()
            r6.setText(r7)
            java.lang.String r6 = r0.f6656b
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0a2e
            android.view.View r6 = r0.findViewById(r1)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r9 = r0.f6656b
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            r6.setBackgroundColor(r7)
        L_0x0a2e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r7 = r0.f6656b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            boolean r6 = british.xnews2.C1692config.m8153I(r6)
            if (r6 == 0) goto L_0x0a48
            int r6 = british.xnews2.C1692config.f7101A5
            goto L_0x0a49
        L_0x0a48:
            r6 = -1
        L_0x0a49:
            android.view.View r7 = r0.findViewById(r1)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r7.setTextColor(r6)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
            r1 = 2131362466(0x7f0a02a2, float:1.8344713E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
            goto L_0x0a6b
        L_0x0a64:
            android.view.View r1 = r0.findViewById(r6)
            r1.setVisibility(r12)
        L_0x0a6b:
            r0.f8306q = r4
            r0.f8255F0 = r4
            r1 = 2131362360(0x7f0a0238, float:1.8344498E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f8268M = r1
            r1 = 2131362362(0x7f0a023a, float:1.8344502E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f8270N = r1
            r1 = 2131362364(0x7f0a023c, float:1.8344506E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f8272O = r1
            r1 = 2131362366(0x7f0a023e, float:1.834451E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f8274P = r1
            r1 = 2131362513(0x7f0a02d1, float:1.8344809E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f8309r0 = r1
            r1 = 2131362515(0x7f0a02d3, float:1.8344813E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f8311s0 = r1
            r1 = 2131362517(0x7f0a02d5, float:1.8344817E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f8313t0 = r1
            r1 = 2131362519(0x7f0a02d7, float:1.834482E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f8315u0 = r1
            r1 = 2131363129(0x7f0a0539, float:1.8346058E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f8325z0 = r1
            r1 = 2131363131(0x7f0a053b, float:1.8346062E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f8245A0 = r1
            r1 = 2131363133(0x7f0a053d, float:1.8346066E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f8247B0 = r1
            r1 = 2131363135(0x7f0a053f, float:1.834607E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f8249C0 = r1
            boolean r1 = r0.f8257G0
            r6 = 2131363034(0x7f0a04da, float:1.8345865E38)
            if (r1 == 0) goto L_0x0b50
            r1 = 2131362772(0x7f0a03d4, float:1.8345334E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f8286V = r1
            r1 = 2131362774(0x7f0a03d6, float:1.8345338E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f8288W = r1
            r1 = 2131362776(0x7f0a03d8, float:1.8345342E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f8290X = r1
            r1 = 2131362778(0x7f0a03da, float:1.8345346E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f8292Y = r1
            r1 = 2131362845(0x7f0a041d, float:1.8345482E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r7 = "#FFEEEEEE"
            int r7 = android.graphics.Color.parseColor(r7)
            r1.setBackgroundColor(r7)
            r1 = 2131363177(0x7f0a0569, float:1.8346155E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r7 = british.xnews2.C1692config.f7101A5
            r1.setTextColor(r7)
            android.view.View r1 = r0.findViewById(r6)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            int r7 = british.xnews2.C1692config.f7104D5
            r1.setBackgroundColor(r7)
            goto L_0x0b9f
        L_0x0b50:
            r1 = 2131362771(0x7f0a03d3, float:1.8345332E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f8286V = r1
            r1 = 2131362773(0x7f0a03d5, float:1.8345336E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f8288W = r1
            r1 = 2131362775(0x7f0a03d7, float:1.834534E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f8290X = r1
            r1 = 2131362777(0x7f0a03d9, float:1.8345344E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f8292Y = r1
            r1 = 2131362845(0x7f0a041d, float:1.8345482E38)
            android.view.View r1 = r0.findViewById(r1)
            int r7 = british.xnews2.C1692config.f7106F5
            r1.setBackgroundColor(r7)
            r1 = 2131363177(0x7f0a0569, float:1.8346155E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setTextColor(r5)
            android.view.View r1 = r0.findViewById(r6)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            int r7 = british.xnews2.C1692config.f7101A5
            r1.setBackgroundColor(r7)
        L_0x0b9f:
            british.xnews2.config r1 = r0.f8254F
            boolean r1 = r1.f7302a2
            if (r1 == 0) goto L_0x0cfc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r6 = r0.f6656b
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            boolean r1 = british.xnews2.C1692config.m8153I(r1)
            if (r1 == 0) goto L_0x0bd1
            r1 = 2131362388(0x7f0a0254, float:1.8344555E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
            r1 = 2131362394(0x7f0a025a, float:1.8344567E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
            goto L_0x0be5
        L_0x0bd1:
            r1 = 2131362387(0x7f0a0253, float:1.8344553E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
            r1 = 2131362393(0x7f0a0259, float:1.8344565E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
        L_0x0be5:
            android.content.res.Resources r1 = r17.getResources()
            r6 = 2131231484(0x7f0802fc, float:1.807905E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r6)
            java.lang.String r6 = r0.f6656b
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0c12
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r7 = r0.f6656b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            int r6 = android.graphics.Color.parseColor(r6)
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.setColorFilter(r6, r7)
        L_0x0c12:
            r6 = 2131362386(0x7f0a0252, float:1.8344551E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r6.setImageDrawable(r1)
            r1 = 2131362386(0x7f0a0252, float:1.8344551E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
            android.content.res.Resources r1 = r17.getResources()
            r6 = 2131230808(0x7f080058, float:1.807768E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r6)
            java.lang.String r6 = r0.f6656b
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0c55
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r7 = r0.f6656b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            int r6 = android.graphics.Color.parseColor(r6)
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.setColorFilter(r6, r7)
        L_0x0c55:
            r6 = 2131362392(0x7f0a0258, float:1.8344563E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r6.setImageDrawable(r1)
            r1 = 2131362392(0x7f0a0258, float:1.8344563E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
            r17.mo7986q()
            java.lang.String r1 = r0.f8320x
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            long r9 = r0.f8300n
            r6.append(r9)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0d03
            r1 = 2131361978(0x7f0a00ba, float:1.8343724E38)
            android.view.View r6 = r0.findViewById(r1)
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.content.res.Resources r7 = r17.getResources()
            r9 = 2131820587(0x7f11002b, float:1.9273893E38)
            java.lang.String r7 = r7.getString(r9)
            java.lang.String r7 = r7.toUpperCase()
            r6.setText(r7)
            java.lang.String r6 = r0.f6656b
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0cc8
            android.view.View r6 = r0.findViewById(r1)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r9 = r0.f6656b
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            r6.setBackgroundColor(r7)
        L_0x0cc8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r7 = r0.f6656b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            boolean r6 = british.xnews2.C1692config.m8153I(r6)
            if (r6 == 0) goto L_0x0ce1
            int r5 = british.xnews2.C1692config.f7101A5
        L_0x0ce1:
            android.view.View r6 = r0.findViewById(r1)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setTextColor(r5)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
            r1 = 2131362467(0x7f0a02a3, float:1.8344715E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
            goto L_0x0d03
        L_0x0cfc:
            android.view.View r1 = r0.findViewById(r6)
            r1.setVisibility(r12)
        L_0x0d03:
            java.lang.String r1 = r0.f8320x
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            long r6 = r0.f8300n
            r5.append(r6)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0d27
            r1 = 2131362328(0x7f0a0218, float:1.8344433E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r12)
            goto L_0x0d31
        L_0x0d27:
            r1 = 2131362328(0x7f0a0218, float:1.8344433E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
        L_0x0d31:
            android.os.Bundle r1 = r0.f8267L0
            java.lang.String r5 = "privados_chat"
            boolean r1 = r1.getBoolean(r5)
            r5 = 2131362401(0x7f0a0261, float:1.8344582E38)
            if (r1 == 0) goto L_0x0ddb
            android.os.Bundle r1 = r0.f8267L0
            java.lang.String r6 = "privados"
            java.lang.String r1 = r1.getString(r6)
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0ddb
            java.lang.String r1 = r0.f8320x
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            long r9 = r0.f8300n
            r6.append(r9)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0ddb
            android.os.Bundle r1 = r0.f8267L0
            java.lang.String r6 = "desdepriv"
            boolean r1 = r1.containsKey(r6)
            if (r1 != 0) goto L_0x0ddb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r6 = r0.f6656b
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            boolean r1 = british.xnews2.C1692config.m8153I(r1)
            if (r1 == 0) goto L_0x0d93
            r1 = 2131362331(0x7f0a021b, float:1.834444E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
            goto L_0x0d9d
        L_0x0d93:
            r1 = 2131362330(0x7f0a021a, float:1.8344438E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
        L_0x0d9d:
            android.content.res.Resources r1 = r17.getResources()
            r6 = 2131231136(0x7f0801a0, float:1.8078344E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r6)
            java.lang.String r6 = r0.f6656b
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0dca
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r7 = r0.f6656b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            int r6 = android.graphics.Color.parseColor(r6)
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.setColorFilter(r6, r7)
        L_0x0dca:
            android.view.View r6 = r0.findViewById(r5)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r6.setImageDrawable(r1)
            android.view.View r1 = r0.findViewById(r5)
            r1.setOnClickListener(r0)
            goto L_0x0de2
        L_0x0ddb:
            android.view.View r1 = r0.findViewById(r5)
            r1.setVisibility(r12)
        L_0x0de2:
            r1 = 2131363137(0x7f0a0541, float:1.8346074E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r6 = 2131363138(0x7f0a0542, float:1.8346076E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131362367(0x7f0a023f, float:1.8344513E38)
            android.view.View r7 = r0.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0.f8276Q = r7
            boolean r7 = r0.f8263J0
            r9 = 1116471296(0x428c0000, float:70.0)
            r10 = 2131362241(0x7f0a01c1, float:1.8344257E38)
            if (r7 == 0) goto L_0x0eed
            android.view.View r7 = r0.findViewById(r5)
            int r7 = r7.getVisibility()
            if (r7 != r12) goto L_0x0e6d
            android.view.View r7 = r0.findViewById(r10)
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r7 = (android.widget.RelativeLayout.LayoutParams) r7
            r11 = 1092616192(0x41200000, float:10.0)
            android.content.res.Resources r13 = r17.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r13 = r13 * r11
            float r13 = r13 + r2
            int r11 = (int) r13
            r7.rightMargin = r11
            android.view.View r11 = r0.findViewById(r10)
            r11.setLayoutParams(r7)
            android.widget.ImageView r7 = r0.f8276Q
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r7 = (android.widget.RelativeLayout.LayoutParams) r7
            android.content.res.Resources r11 = r17.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r9
            float r11 = r11 + r2
            int r11 = (int) r11
            r7.rightMargin = r11
            android.widget.ImageView r11 = r0.f8276Q
            r11.setLayoutParams(r7)
            android.view.ViewGroup$LayoutParams r7 = r1.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r7 = (android.widget.RelativeLayout.LayoutParams) r7
            r11 = 1124204544(0x43020000, float:130.0)
            android.content.res.Resources r13 = r17.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r13 = r13 * r11
            float r13 = r13 + r2
            int r11 = (int) r13
            r7.rightMargin = r11
            r1.setLayoutParams(r7)
        L_0x0e6d:
            android.content.res.Resources r7 = r17.getResources()
            r11 = 2131230866(0x7f080092, float:1.8077797E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r11)
            java.lang.String r11 = r0.f6656b
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L_0x0e9a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            java.lang.String r13 = r0.f6656b
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            int r11 = android.graphics.Color.parseColor(r11)
            android.graphics.PorterDuff$Mode r13 = android.graphics.PorterDuff.Mode.MULTIPLY
            r7.setColorFilter(r11, r13)
        L_0x0e9a:
            r11 = 2131362413(0x7f0a026d, float:1.8344606E38)
            android.view.View r11 = r0.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r11.setImageDrawable(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r11 = r0.f6656b
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            boolean r7 = british.xnews2.C1692config.m8153I(r7)
            if (r7 == 0) goto L_0x0ec8
            r7 = 2131362414(0x7f0a026e, float:1.8344608E38)
            android.view.View r7 = r0.findViewById(r7)
            r7.setVisibility(r4)
            goto L_0x0ed2
        L_0x0ec8:
            r7 = 2131362412(0x7f0a026c, float:1.8344604E38)
            android.view.View r7 = r0.findViewById(r7)
            r7.setVisibility(r4)
        L_0x0ed2:
            android.view.View r7 = r0.findViewById(r10)
            r7.setOnClickListener(r0)
            android.os.Bundle r7 = r0.f8267L0
            if (r7 == 0) goto L_0x0ef4
            java.lang.String r11 = "abrir_game"
            boolean r7 = r7.containsKey(r11)
            if (r7 == 0) goto L_0x0ef4
            android.view.View r7 = r0.findViewById(r10)
            r7.performClick()
            goto L_0x0ef4
        L_0x0eed:
            android.view.View r7 = r0.findViewById(r10)
            r7.setVisibility(r12)
        L_0x0ef4:
            java.lang.String r7 = r0.f8320x
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            long r13 = r0.f8300n
            r10.append(r13)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x0fe1
            boolean r6 = r0.f8263J0
            if (r6 != 0) goto L_0x0f8c
            android.view.View r5 = r0.findViewById(r5)
            int r5 = r5.getVisibility()
            if (r5 != r12) goto L_0x0f54
            android.widget.ImageView r5 = r0.f8276Q
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r5 = (android.widget.RelativeLayout.LayoutParams) r5
            r6 = 1092616192(0x41200000, float:10.0)
            android.content.res.Resources r7 = r17.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            float r7 = r7 + r2
            int r6 = (int) r7
            r5.rightMargin = r6
            android.widget.ImageView r6 = r0.f8276Q
            r6.setLayoutParams(r5)
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r5 = (android.widget.RelativeLayout.LayoutParams) r5
            android.content.res.Resources r6 = r17.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r9
            float r6 = r6 + r2
            int r2 = (int) r6
            r5.rightMargin = r2
            r1.setLayoutParams(r5)
            goto L_0x0f8c
        L_0x0f54:
            android.widget.ImageView r5 = r0.f8276Q
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r5 = (android.widget.RelativeLayout.LayoutParams) r5
            android.content.res.Resources r6 = r17.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r9
            float r6 = r6 + r2
            int r6 = (int) r6
            r5.rightMargin = r6
            android.widget.ImageView r6 = r0.f8276Q
            r6.setLayoutParams(r5)
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r5 = (android.widget.RelativeLayout.LayoutParams) r5
            r6 = 1124204544(0x43020000, float:130.0)
            android.content.res.Resources r7 = r17.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            float r7 = r7 + r2
            int r2 = (int) r7
            r5.rightMargin = r2
            r1.setLayoutParams(r5)
        L_0x0f8c:
            android.content.res.Resources r2 = r17.getResources()
            r5 = 2131231338(0x7f08026a, float:1.8078754E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r5)
            java.lang.String r5 = r0.f6656b
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x0fb9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r6 = r0.f6656b
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int r5 = android.graphics.Color.parseColor(r5)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY
            r2.setColorFilter(r5, r6)
        L_0x0fb9:
            r1.setBackgroundDrawable(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = r0.f6656b
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r2 = british.xnews2.C1692config.m8153I(r2)
            if (r2 == 0) goto L_0x0fd8
            int r2 = british.xnews2.C1692config.f7101A5
            r1.setTextColor(r2)
        L_0x0fd8:
            r1.setOnClickListener(r0)
            android.widget.ImageView r1 = r0.f8276Q
            r1.setOnClickListener(r0)
            goto L_0x1035
        L_0x0fe1:
            android.content.res.Resources r1 = r17.getResources()
            r2 = 2131231341(0x7f08026d, float:1.807876E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            java.lang.String r2 = r0.f6656b
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x100e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r5 = r0.f6656b
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            int r2 = android.graphics.Color.parseColor(r2)
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.setColorFilter(r2, r5)
        L_0x100e:
            r6.setBackgroundDrawable(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r0.f6656b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r1 = british.xnews2.C1692config.m8153I(r1)
            if (r1 == 0) goto L_0x102d
            int r1 = british.xnews2.C1692config.f7101A5
            r6.setTextColor(r1)
        L_0x102d:
            r6.setOnClickListener(r0)
            android.widget.ImageView r1 = r0.f8276Q
            r1.setVisibility(r12)
        L_0x1035:
            android.view.Window r1 = r17.getWindow()
            r2 = 2
            r1.setSoftInputMode(r2)
            british.xnews2.profile$o0 r1 = new british.xnews2.profile$o0
            r2 = 0
            r1.<init>()
            java.lang.String[] r2 = new java.lang.String[r4]
            r1.execute(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.profile.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f8254F.f7384n3 == 0 || (cVar3 = this.f8265K0) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f8254F.f7384n3 == 0 || (cVar2 = this.f8265K0) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f8254F.f7384n3 == 0 || (cVar = this.f8265K0) == null || (adColonyAdView = cVar.f6889d) == null)) {
            adColonyAdView.destroy();
        }
        if ((this.f6659e && isFinishing()) || C1692config.f7111K5) {
            C1692config.m8176Z(this);
        }
        super.onDestroy();
    }

    public void onError(C3371Ad ad, AdError adError) {
        this.f6661g.cancel();
        abrir_secc(this.f6660f);
    }

    public void onFailedToReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        abrir_secc(this.f6660f);
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f8254F.f7384n3 == 0 || (cVar = this.f8265K0) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2033w());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 107 && i != 109) {
            return;
        }
        if (iArr == null || iArr.length <= 0 || !strArr[0].equals("android.permission.CAMERA") || iArr[0] != 0) {
            C1692config.m8148C0(this, "", getResources().getString(R.string.permisos), this.f6656b);
        } else if (i == 107) {
            this.f8298m = System.currentTimeMillis();
            C1692config config = this.f8254F;
            config.mo7525s0(this, config.mo7507i0(this, "fperfilgal_temp"));
        } else {
            C1692config config2 = this.f8254F;
            config2.mo7526t0(this, config2.mo7507i0(this, "dt_foto98_temp.mp4"));
        }
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        SharedPreferences sharedPreferences = this.f8296a1;
        mo7965f(sharedPreferences.contains("usufav_" + this.f8320x));
        if (this.f8254F.f7384n3 != 0 && (cVar = this.f8265K0) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f8281S0 = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f8281S0) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f8281S0 = true;
        C1692config.m8175Y0(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("es_root", this.f6659e);
    }

    public boolean onSearchRequested() {
        this.f6657c = true;
        this.f6658d = true;
        return super.onSearchRequested();
    }

    public void onStop() {
        super.onStop();
        if (this.f6657c && !this.f6658d) {
            finish();
        }
    }

    public void onVideoCompleted() {
        this.f8281S0 = true;
        C1692config.m8175Y0(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo7985p(int i, boolean z) {
        ProgressBar progressBar;
        TextView textView;
        LinearLayout linearLayout;
        ImageView imageView;
        String str;
        String str2;
        Bitmap bitmap;
        int i2 = i % 4;
        boolean z2 = true;
        if (i2 == 0) {
            imageView = this.f8268M;
            linearLayout = this.f8309r0;
            textView = this.f8325z0;
            progressBar = this.f8286V;
        } else if (i2 == 1) {
            imageView = this.f8270N;
            linearLayout = this.f8311s0;
            textView = this.f8245A0;
            progressBar = this.f8288W;
        } else if (i2 == 2) {
            imageView = this.f8272O;
            linearLayout = this.f8313t0;
            textView = this.f8247B0;
            progressBar = this.f8290X;
        } else if (i2 == 3) {
            imageView = this.f8274P;
            linearLayout = this.f8315u0;
            textView = this.f8249C0;
            progressBar = this.f8292Y;
        } else {
            return;
        }
        Boolean bool = Boolean.FALSE;
        if (z) {
            str = this.f8252E.get(i).f8349a;
            String str3 = this.f8252E.get(i).f8351c;
            str2 = str3;
            bool = Boolean.valueOf(this.f8252E.get(i).f8354f);
        } else {
            SharedPreferences sharedPreferences = this.f8296a1;
            str = sharedPreferences.getString("idv" + i + "_" + this.f8320x, "");
            SharedPreferences sharedPreferences2 = this.f8296a1;
            str2 = sharedPreferences2.getString("v" + i + "_nlikes_" + this.f8320x, "");
        }
        progressBar.setVisibility(8);
        imageView.setTag(R.id.idaux1, str);
        imageView.setTag(R.id.idaux2, "N");
        imageView.setTag(R.id.idaux3, i + "");
        if (bool.booleanValue()) {
            imageView.setImageDrawable((Drawable) null);
            imageView.setTag(R.id.idaux2, "S");
            linearLayout.setVisibility(8);
        } else {
            if (str2.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                linearLayout.setVisibility(8);
            } else {
                textView.setText(str2);
                linearLayout.setVisibility(0);
            }
            try {
                File file = this.f8256G;
                File file2 = new File(file, "fperfilgalv_" + str + ".jpg");
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file2.getPath(), options);
                int i3 = (int) ((getResources().getDisplayMetrics().density * 48.0f) + 0.5f);
                int i4 = (int) ((getResources().getDisplayMetrics().density * 48.0f) + 0.5f);
                int i5 = options.outWidth;
                int i6 = options.outHeight;
                if (i5 > i3 || i6 > i4) {
                    z2 = false;
                }
                if (!z2) {
                    int round = Math.round(((float) i5) / ((float) C1692config.m8193n(i5, i6, i3, i4)));
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = round;
                    bitmap = BitmapFactory.decodeFile(file2.getPath(), options2);
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), Uri.fromFile(file2));
                }
                imageView.setImageBitmap(C1692config.m8169T0(bitmap, BitmapFactory.decodeResource(getResources(), R.drawable.play_ppp)));
                imageView.setTag(R.id.idaux2, "S");
            } catch (Exception unused) {
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.sinfoto_chat));
                progressBar.setVisibility(0);
            } catch (OutOfMemoryError unused2) {
            }
        }
        imageView.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo7986q() {
        this.f8268M.setVisibility(8);
        this.f8270N.setVisibility(8);
        this.f8272O.setVisibility(8);
        this.f8274P.setVisibility(8);
        this.f8286V.setVisibility(8);
        this.f8288W.setVisibility(8);
        this.f8290X.setVisibility(8);
        this.f8292Y.setVisibility(8);
        this.f8309r0.setVisibility(8);
        this.f8311s0.setVisibility(8);
        this.f8313t0.setVisibility(8);
        this.f8315u0.setVisibility(8);
        int i = 0;
        boolean z = false;
        while (i < 4) {
            SharedPreferences sharedPreferences = this.f8296a1;
            if (sharedPreferences.getString("idv" + i + "_" + this.f8320x, "").equals("")) {
                break;
            }
            mo7985p(i, false);
            i++;
            z = true;
        }
        if (!z) {
            String str = this.f8320x;
            if (!str.equals(this.f8300n + "")) {
                findViewById(R.id.tl_videos).setVisibility(8);
                return;
            }
        }
        findViewById(R.id.tl_videos).setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo7987r() {
        this.f8268M.setVisibility(8);
        this.f8270N.setVisibility(8);
        this.f8272O.setVisibility(8);
        this.f8274P.setVisibility(8);
        this.f8286V.setVisibility(8);
        this.f8288W.setVisibility(8);
        this.f8290X.setVisibility(8);
        this.f8292Y.setVisibility(8);
        this.f8309r0.setVisibility(8);
        this.f8311s0.setVisibility(8);
        this.f8313t0.setVisibility(8);
        this.f8315u0.setVisibility(8);
        int i = 0;
        while (i < 4 && this.f8306q + i <= this.f8252E.size() - 1) {
            mo7985p(this.f8306q + i, true);
            i++;
        }
        if (this.f8252E.isEmpty()) {
            String str = this.f8320x;
            if (!str.equals(this.f8300n + "")) {
                findViewById(R.id.tl_videos).setVisibility(8);
                C2006n0 n0Var = new C2006n0();
                this.f8275P0 = n0Var;
                n0Var.execute(new String[0]);
            }
        }
        if (this.f8306q + i <= this.f8252E.size() - 1 || !this.f8255F0) {
            findViewById(R.id.fl_masvideos).setVisibility(0);
        } else {
            findViewById(R.id.fl_masvideos).setVisibility(4);
        }
        if (this.f8306q > 0) {
            findViewById(R.id.fl_menosvideos).setVisibility(0);
        } else {
            findViewById(R.id.fl_menosvideos).setVisibility(4);
        }
        findViewById(R.id.tl_videos).setVisibility(0);
        C2006n0 n0Var2 = new C2006n0();
        this.f8275P0 = n0Var2;
        n0Var2.execute(new String[0]);
    }

    /* renamed from: s */
    public void mo7988s() {
        if (((TextView) findViewById(R.id.tv_subtit)).getVisibility() == 8) {
            findViewById(R.id.v_aux1).setVisibility(0);
        } else {
            findViewById(R.id.v_aux1).setVisibility(8);
        }
        if (((TextView) findViewById(R.id.descr)).getVisibility() == 8) {
            findViewById(R.id.v_aux2).setVisibility(0);
        } else {
            findViewById(R.id.v_aux2).setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo7989t(String str) {
        Bitmap bitmap;
        File file = new File(str);
        boolean z = false;
        if (file.length() == 0) {
            return false;
        }
        if (file.length() > 111149056) {
            AlertDialog create = new AlertDialog.Builder(this).setCancelable(false).setPositiveButton(getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.vidlargo).create();
            if (!this.f6656b.equals("")) {
                create.setOnShowListener(new C1986d0(create));
            }
            create.show();
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
            return false;
        }
        Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, 3);
        try {
            createVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(this.f8254F.mo7516l0(this, 99)));
        } catch (Exception unused2) {
        }
        try {
            File l0 = this.f8254F.mo7516l0(this, 99);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(l0.getPath(), options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            if (i <= 800 && i2 <= 800) {
                z = true;
            }
            if (!z) {
                int round = Math.round(((float) i) / ((float) C1692config.m8193n(i, i2, 800, 800)));
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = round;
                bitmap = BitmapFactory.decodeFile(l0.getPath(), options2);
            } else {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), Uri.fromFile(l0));
            }
            bitmap.compress(Bitmap.CompressFormat.JPEG, 75, new FileOutputStream(this.f8254F.mo7516l0(this, 99)));
        } catch (Exception unused3) {
        }
        return true;
    }

    public void videoEnded() {
        this.f8281S0 = true;
        C1692config.m8175Y0(this);
    }
}
