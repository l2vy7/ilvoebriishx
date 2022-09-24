package british.p015x;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.DownloadManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.C0600b;
import androidx.core.content.FileProvider;
import androidx.drawerlayout.widget.DrawerLayout;
import british.p015x.t_chat;
import com.adcolony.sdk.AdColony;
import com.adcolony.sdk.AdColonyAdSize;
import com.adcolony.sdk.AdColonyAdView;
import com.adcolony.sdk.AdColonyAdViewListener;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyRewardListener;
import com.adcolony.sdk.AdColonyZone;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.ads.interstitial.Interstitial;
import com.appnext.core.AppnextAdCreativeType;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnVideoEnded;
import com.appnext.nativeads.NativeAd;
import com.appnext.nativeads.NativeAdListener;
import com.appnext.nativeads.NativeAdView;
import com.facebook.ads.C3371Ad;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.startapp.sdk.ads.banner.Banner;
import com.startapp.sdk.ads.nativead.NativeAdDetails;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.VideoListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import p001a0.C0008a;
import p064d1.C5141a;
import p273b9.C11188h;
import p313i9.C12788b;
import p313i9.C12789c;
import p318l8.C12831e;
import p338x8.C12957d;
import p338x8.C12960g;

/* renamed from: british.x.config */
public class C1692config extends Application implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: A5 */
    public static final int f7101A5 = Color.parseColor("#212121");

    /* renamed from: B5 */
    public static final int f7102B5 = Color.parseColor("#727272");

    /* renamed from: C5 */
    public static final int f7103C5 = Color.parseColor("#FFFFFF");

    /* renamed from: D5 */
    public static final int f7104D5 = Color.parseColor("#FAFAFA");

    /* renamed from: E5 */
    public static final int f7105E5 = Color.parseColor("#9E9E9E");

    /* renamed from: F5 */
    public static final int f7106F5 = Color.parseColor("#757575");

    /* renamed from: G5 */
    public static final String f7107G5;

    /* renamed from: H5 */
    public static String f7108H5 = "https://imgs1.e-droid.net";

    /* renamed from: I5 */
    public static final String f7109I5;

    /* renamed from: J5 */
    static int f7110J5 = 1;

    /* renamed from: K5 */
    static boolean f7111K5 = false;

    /* renamed from: L5 */
    static int f7112L5 = 0;

    /* renamed from: M5 */
    static Map<Integer, Boolean> f7113M5 = new HashMap();

    /* renamed from: N5 */
    static ArrayList<Integer> f7114N5;

    /* renamed from: O5 */
    static C1730q0[] f7115O5;

    /* renamed from: P5 */
    static int f7116P5 = -1;

    /* renamed from: Q5 */
    static String f7117Q5;

    /* renamed from: R5 */
    static String f7118R5;

    /* renamed from: S5 */
    static boolean f7119S5 = false;

    /* renamed from: T5 */
    static String f7120T5;

    /* renamed from: U5 */
    static String f7121U5;

    /* renamed from: V5 */
    static String f7122V5;

    /* renamed from: W5 */
    static String f7123W5;

    /* renamed from: X5 */
    static String f7124X5;

    /* renamed from: Y5 */
    static String f7125Y5;

    /* renamed from: Z5 */
    static String f7126Z5;

    /* renamed from: a6 */
    static String f7127a6 = "";

    /* renamed from: b6 */
    static String f7128b6 = "";

    /* renamed from: c6 */
    static String f7129c6 = "";

    /* renamed from: d6 */
    static Boolean f7130d6;

    /* renamed from: e6 */
    static Boolean f7131e6;

    /* renamed from: f6 */
    static InterstitialAd f7132f6 = null;

    /* renamed from: g6 */
    static Interstitial f7133g6 = null;

    /* renamed from: h6 */
    static com.facebook.ads.InterstitialAd f7134h6 = null;

    /* renamed from: i6 */
    static StartAppAd f7135i6 = null;

    /* renamed from: j6 */
    static AdColonyInterstitial f7136j6 = null;

    /* renamed from: k6 */
    static int f7137k6 = 0;

    /* renamed from: l6 */
    static int f7138l6 = 0;

    /* renamed from: m6 */
    static int f7139m6 = 0;

    /* renamed from: n6 */
    static int f7140n6 = 0;

    /* renamed from: o6 */
    static boolean f7141o6 = false;

    /* renamed from: p6 */
    static Typeface f7142p6;

    /* renamed from: q6 */
    static Typeface f7143q6;

    /* renamed from: r6 */
    static Typeface f7144r6;

    /* renamed from: A */
    boolean f7145A = false;

    /* renamed from: A0 */
    int f7146A0;

    /* renamed from: A1 */
    String f7147A1;

    /* renamed from: A2 */
    String f7148A2;

    /* renamed from: A3 */
    String f7149A3;

    /* renamed from: A4 */
    boolean f7150A4;

    /* renamed from: B */
    int f7151B = 1;

    /* renamed from: B0 */
    String f7152B0;

    /* renamed from: B1 */
    String f7153B1;

    /* renamed from: B2 */
    int f7154B2;

    /* renamed from: B3 */
    String f7155B3;

    /* renamed from: B4 */
    boolean f7156B4;

    /* renamed from: C */
    int f7157C = 2;

    /* renamed from: C0 */
    boolean f7158C0;

    /* renamed from: C1 */
    String f7159C1;

    /* renamed from: C2 */
    int f7160C2;

    /* renamed from: C3 */
    String f7161C3;

    /* renamed from: C4 */
    boolean f7162C4;

    /* renamed from: D */
    int f7163D = 0;

    /* renamed from: D0 */
    boolean f7164D0;

    /* renamed from: D1 */
    String f7165D1;

    /* renamed from: D2 */
    int f7166D2;

    /* renamed from: D3 */
    String f7167D3;

    /* renamed from: D4 */
    boolean f7168D4;

    /* renamed from: E */
    int f7169E = 0;

    /* renamed from: E0 */
    boolean f7170E0;

    /* renamed from: E1 */
    String f7171E1;

    /* renamed from: E2 */
    int f7172E2;

    /* renamed from: E3 */
    String f7173E3;

    /* renamed from: E4 */
    boolean f7174E4;

    /* renamed from: F */
    int f7175F = 0;

    /* renamed from: F0 */
    boolean f7176F0;

    /* renamed from: F1 */
    String f7177F1;

    /* renamed from: F2 */
    boolean f7178F2;

    /* renamed from: F3 */
    String f7179F3;

    /* renamed from: F4 */
    boolean f7180F4;

    /* renamed from: G */
    int f7181G = 0;

    /* renamed from: G0 */
    boolean f7182G0;

    /* renamed from: G1 */
    String f7183G1;

    /* renamed from: G2 */
    boolean f7184G2;

    /* renamed from: G3 */
    String f7185G3;

    /* renamed from: G4 */
    int f7186G4;

    /* renamed from: H */
    int f7187H = 0;

    /* renamed from: H0 */
    boolean f7188H0;

    /* renamed from: H1 */
    String f7189H1;

    /* renamed from: H2 */
    boolean f7190H2;

    /* renamed from: H3 */
    String f7191H3;

    /* renamed from: H4 */
    boolean f7192H4;

    /* renamed from: I */
    int f7193I = 0;

    /* renamed from: I0 */
    boolean f7194I0;

    /* renamed from: I1 */
    String f7195I1;

    /* renamed from: I2 */
    String f7196I2;

    /* renamed from: I3 */
    String f7197I3;

    /* renamed from: I4 */
    boolean f7198I4;

    /* renamed from: J */
    int f7199J = 0;

    /* renamed from: J0 */
    boolean f7200J0;

    /* renamed from: J1 */
    String f7201J1;

    /* renamed from: J2 */
    String f7202J2;

    /* renamed from: J3 */
    String f7203J3;

    /* renamed from: J4 */
    boolean f7204J4;

    /* renamed from: K */
    int f7205K = 2;

    /* renamed from: K0 */
    boolean f7206K0;

    /* renamed from: K1 */
    int f7207K1;

    /* renamed from: K2 */
    String f7208K2;

    /* renamed from: K3 */
    String f7209K3;

    /* renamed from: K4 */
    String f7210K4;

    /* renamed from: L */
    int f7211L = 0;

    /* renamed from: L0 */
    boolean f7212L0;

    /* renamed from: L1 */
    boolean f7213L1;

    /* renamed from: L2 */
    String f7214L2;

    /* renamed from: L3 */
    String f7215L3;

    /* renamed from: L4 */
    String f7216L4;

    /* renamed from: M */
    int f7217M = 0;

    /* renamed from: M0 */
    String f7218M0;

    /* renamed from: M1 */
    boolean f7219M1;

    /* renamed from: M2 */
    String f7220M2;

    /* renamed from: M3 */
    String f7221M3;

    /* renamed from: M4 */
    String f7222M4;

    /* renamed from: N */
    String f7223N;

    /* renamed from: N0 */
    String f7224N0;

    /* renamed from: N1 */
    boolean f7225N1;

    /* renamed from: N2 */
    String f7226N2;

    /* renamed from: N3 */
    String f7227N3;

    /* renamed from: N4 */
    String f7228N4;

    /* renamed from: O */
    boolean f7229O;

    /* renamed from: O0 */
    String f7230O0;

    /* renamed from: O1 */
    C1855l[] f7231O1;

    /* renamed from: O2 */
    String f7232O2;

    /* renamed from: O3 */
    String f7233O3;

    /* renamed from: O4 */
    String f7234O4;

    /* renamed from: P */
    int f7235P;

    /* renamed from: P0 */
    String f7236P0;

    /* renamed from: P1 */
    C1840i[] f7237P1;

    /* renamed from: P2 */
    String f7238P2;

    /* renamed from: P3 */
    String f7239P3;

    /* renamed from: P4 */
    String f7240P4;

    /* renamed from: Q */
    int f7241Q;

    /* renamed from: Q0 */
    String f7242Q0;

    /* renamed from: Q1 */
    int[] f7243Q1;

    /* renamed from: Q2 */
    String f7244Q2;

    /* renamed from: Q3 */
    String f7245Q3;

    /* renamed from: Q4 */
    String f7246Q4;

    /* renamed from: R */
    String f7247R;

    /* renamed from: R0 */
    String f7248R0;

    /* renamed from: R1 */
    int[] f7249R1;

    /* renamed from: R2 */
    String f7250R2;

    /* renamed from: R3 */
    String f7251R3;

    /* renamed from: R4 */
    boolean f7252R4;

    /* renamed from: S */
    boolean f7253S;

    /* renamed from: S0 */
    String f7254S0;

    /* renamed from: S1 */
    ListView f7255S1;

    /* renamed from: S2 */
    String f7256S2;

    /* renamed from: S3 */
    String f7257S3;

    /* renamed from: S4 */
    boolean f7258S4;

    /* renamed from: T */
    int f7259T;

    /* renamed from: T0 */
    boolean f7260T0;

    /* renamed from: T1 */
    ArrayList<C1719m0> f7261T1;

    /* renamed from: T2 */
    String f7262T2;

    /* renamed from: T3 */
    String f7263T3;

    /* renamed from: T4 */
    String f7264T4;

    /* renamed from: U */
    int f7265U;

    /* renamed from: U0 */
    boolean f7266U0;

    /* renamed from: U1 */
    C1715k0 f7267U1;

    /* renamed from: U2 */
    int f7268U2;

    /* renamed from: U3 */
    String f7269U3;

    /* renamed from: U4 */
    String f7270U4;

    /* renamed from: V */
    String f7271V;

    /* renamed from: V0 */
    boolean f7272V0;

    /* renamed from: V1 */
    boolean f7273V1;

    /* renamed from: V2 */
    String f7274V2;

    /* renamed from: V3 */
    String f7275V3;

    /* renamed from: V4 */
    String f7276V4;

    /* renamed from: W */
    boolean f7277W;

    /* renamed from: W0 */
    boolean f7278W0;

    /* renamed from: W1 */
    boolean f7279W1;

    /* renamed from: W2 */
    int f7280W2;

    /* renamed from: W3 */
    String f7281W3;

    /* renamed from: W4 */
    String f7282W4;

    /* renamed from: X */
    int f7283X;

    /* renamed from: X0 */
    boolean f7284X0;

    /* renamed from: X1 */
    boolean f7285X1;

    /* renamed from: X2 */
    int f7286X2;

    /* renamed from: X3 */
    String f7287X3;

    /* renamed from: X4 */
    int f7288X4;

    /* renamed from: Y */
    int f7289Y;

    /* renamed from: Y0 */
    boolean f7290Y0;

    /* renamed from: Y1 */
    boolean f7291Y1;

    /* renamed from: Y2 */
    String f7292Y2;

    /* renamed from: Y3 */
    String f7293Y3;

    /* renamed from: Y4 */
    int f7294Y4;

    /* renamed from: Z */
    String f7295Z;

    /* renamed from: Z0 */
    boolean f7296Z0;

    /* renamed from: Z1 */
    boolean f7297Z1;

    /* renamed from: Z2 */
    int f7298Z2;

    /* renamed from: Z3 */
    String f7299Z3;

    /* renamed from: Z4 */
    int f7300Z4;

    /* renamed from: a1 */
    String f7301a1;

    /* renamed from: a2 */
    boolean f7302a2;

    /* renamed from: a3 */
    int f7303a3;

    /* renamed from: a4 */
    Context f7304a4;

    /* renamed from: a5 */
    boolean f7305a5;

    /* renamed from: b */
    View f7306b;

    /* renamed from: b1 */
    String f7307b1;

    /* renamed from: b2 */
    boolean f7308b2;

    /* renamed from: b3 */
    String f7309b3;

    /* renamed from: b4 */
    View f7310b4;

    /* renamed from: b5 */
    boolean f7311b5;

    /* renamed from: c */
    int f7312c = -1;

    /* renamed from: c1 */
    String f7313c1;

    /* renamed from: c2 */
    boolean f7314c2;

    /* renamed from: c3 */
    String f7315c3;

    /* renamed from: c4 */
    int f7316c4;

    /* renamed from: c5 */
    boolean f7317c5;

    /* renamed from: d */
    int f7318d = -1;

    /* renamed from: d1 */
    String f7319d1;

    /* renamed from: d2 */
    boolean f7320d2;

    /* renamed from: d3 */
    String f7321d3;

    /* renamed from: d4 */
    int f7322d4;

    /* renamed from: d5 */
    String f7323d5;

    /* renamed from: e */
    boolean f7324e;

    /* renamed from: e1 */
    String f7325e1;

    /* renamed from: e2 */
    boolean f7326e2;

    /* renamed from: e3 */
    String f7327e3;

    /* renamed from: e4 */
    int f7328e4;

    /* renamed from: e5 */
    String f7329e5;

    /* renamed from: f */
    int f7330f;

    /* renamed from: f1 */
    String f7331f1;

    /* renamed from: f2 */
    boolean f7332f2;

    /* renamed from: f3 */
    String f7333f3;

    /* renamed from: f4 */
    int f7334f4;

    /* renamed from: f5 */
    int f7335f5;

    /* renamed from: g */
    int f7336g;

    /* renamed from: g1 */
    String f7337g1;

    /* renamed from: g2 */
    int f7338g2;

    /* renamed from: g3 */
    String f7339g3;

    /* renamed from: g4 */
    int f7340g4;

    /* renamed from: g5 */
    boolean f7341g5;

    /* renamed from: h */
    int f7342h;

    /* renamed from: h1 */
    String f7343h1;

    /* renamed from: h2 */
    int f7344h2;

    /* renamed from: h3 */
    String f7345h3 = "";

    /* renamed from: h4 */
    String f7346h4 = "";

    /* renamed from: h5 */
    boolean f7347h5;

    /* renamed from: i */
    int f7348i;

    /* renamed from: i1 */
    String f7349i1;

    /* renamed from: i2 */
    int f7350i2;

    /* renamed from: i3 */
    String f7351i3 = "";

    /* renamed from: i4 */
    String f7352i4 = "";

    /* renamed from: i5 */
    boolean f7353i5;

    /* renamed from: j */
    int f7354j;

    /* renamed from: j1 */
    String f7355j1;

    /* renamed from: j2 */
    String f7356j2;

    /* renamed from: j3 */
    String f7357j3 = "";

    /* renamed from: j4 */
    String f7358j4;

    /* renamed from: j5 */
    int f7359j5;

    /* renamed from: k */
    int f7360k;

    /* renamed from: k1 */
    String f7361k1;

    /* renamed from: k2 */
    boolean f7362k2;

    /* renamed from: k3 */
    String f7363k3 = "";

    /* renamed from: k4 */
    Boolean f7364k4 = Boolean.FALSE;

    /* renamed from: k5 */
    boolean f7365k5;

    /* renamed from: l */
    int f7366l;

    /* renamed from: l0 */
    boolean f7367l0;

    /* renamed from: l1 */
    String f7368l1;

    /* renamed from: l2 */
    boolean f7369l2;

    /* renamed from: l3 */
    String f7370l3 = "";

    /* renamed from: l4 */
    String f7371l4;

    /* renamed from: l5 */
    boolean f7372l5;

    /* renamed from: m */
    int f7373m;

    /* renamed from: m0 */
    int f7374m0;

    /* renamed from: m1 */
    String f7375m1;

    /* renamed from: m2 */
    boolean f7376m2;

    /* renamed from: m3 */
    String f7377m3 = "";

    /* renamed from: m4 */
    String f7378m4;

    /* renamed from: m5 */
    boolean f7379m5;

    /* renamed from: n */
    int f7380n;

    /* renamed from: n0 */
    int f7381n0;

    /* renamed from: n1 */
    String f7382n1;

    /* renamed from: n2 */
    boolean f7383n2;

    /* renamed from: n3 */
    int f7384n3;

    /* renamed from: n4 */
    String f7385n4;

    /* renamed from: n5 */
    boolean f7386n5;

    /* renamed from: o */
    int f7387o;

    /* renamed from: o0 */
    String f7388o0;

    /* renamed from: o1 */
    String f7389o1;

    /* renamed from: o2 */
    boolean f7390o2;

    /* renamed from: o3 */
    int f7391o3;

    /* renamed from: o4 */
    String f7392o4;

    /* renamed from: o5 */
    int f7393o5;

    /* renamed from: p */
    int f7394p;

    /* renamed from: p0 */
    boolean f7395p0;

    /* renamed from: p1 */
    String f7396p1;

    /* renamed from: p2 */
    boolean f7397p2;

    /* renamed from: p3 */
    int f7398p3;

    /* renamed from: p4 */
    String f7399p4;

    /* renamed from: p5 */
    int f7400p5;

    /* renamed from: q */
    int f7401q;

    /* renamed from: q0 */
    int f7402q0;

    /* renamed from: q1 */
    String f7403q1;

    /* renamed from: q2 */
    int f7404q2;

    /* renamed from: q3 */
    int f7405q3;

    /* renamed from: q4 */
    String f7406q4;

    /* renamed from: q5 */
    boolean f7407q5;

    /* renamed from: r */
    int f7408r;

    /* renamed from: r0 */
    int f7409r0;

    /* renamed from: r1 */
    String f7410r1;

    /* renamed from: r2 */
    int f7411r2;

    /* renamed from: r3 */
    int f7412r3;

    /* renamed from: r4 */
    boolean f7413r4;

    /* renamed from: r5 */
    int f7414r5;

    /* renamed from: s */
    int f7415s;

    /* renamed from: s0 */
    String f7416s0;

    /* renamed from: s1 */
    String f7417s1;

    /* renamed from: s2 */
    int f7418s2;

    /* renamed from: s3 */
    AdSize f7419s3;

    /* renamed from: s4 */
    IronSourceBannerLayout f7420s4;

    /* renamed from: s5 */
    int f7421s5;

    /* renamed from: t */
    int f7422t = -1;

    /* renamed from: t0 */
    boolean f7423t0;

    /* renamed from: t1 */
    String f7424t1;

    /* renamed from: t2 */
    int f7425t2;

    /* renamed from: t3 */
    String f7426t3;

    /* renamed from: t4 */
    int f7427t4;

    /* renamed from: t5 */
    boolean f7428t5;

    /* renamed from: u */
    int f7429u = -1;

    /* renamed from: u0 */
    int f7430u0;

    /* renamed from: u1 */
    String f7431u1;

    /* renamed from: u2 */
    int f7432u2;

    /* renamed from: u3 */
    String f7433u3;

    /* renamed from: u4 */
    int f7434u4;

    /* renamed from: u5 */
    String f7435u5;

    /* renamed from: v */
    int f7436v;

    /* renamed from: v0 */
    int f7437v0;

    /* renamed from: v1 */
    String f7438v1;

    /* renamed from: v2 */
    int f7439v2 = 0;

    /* renamed from: v3 */
    int f7440v3;

    /* renamed from: v4 */
    int f7441v4;

    /* renamed from: v5 */
    String f7442v5;

    /* renamed from: w */
    int f7443w;

    /* renamed from: w0 */
    String f7444w0;

    /* renamed from: w1 */
    String f7445w1;

    /* renamed from: w2 */
    int f7446w2 = 1;

    /* renamed from: w3 */
    int f7447w3;

    /* renamed from: w4 */
    int f7448w4;

    /* renamed from: w5 */
    String f7449w5;

    /* renamed from: x */
    int f7450x;

    /* renamed from: x0 */
    boolean f7451x0;

    /* renamed from: x1 */
    String f7452x1;

    /* renamed from: x2 */
    int f7453x2 = 1;

    /* renamed from: x3 */
    String f7454x3;

    /* renamed from: x4 */
    int f7455x4;

    /* renamed from: x5 */
    boolean f7456x5 = false;

    /* renamed from: y */
    int f7457y;

    /* renamed from: y0 */
    int f7458y0;

    /* renamed from: y1 */
    String f7459y1;

    /* renamed from: y2 */
    int f7460y2 = 1;

    /* renamed from: y3 */
    String f7461y3;

    /* renamed from: y4 */
    int f7462y4;

    /* renamed from: y5 */
    ArrayList<NativeAd> f7463y5;

    /* renamed from: z */
    boolean f7464z = true;

    /* renamed from: z0 */
    int f7465z0;

    /* renamed from: z1 */
    String f7466z1;

    /* renamed from: z2 */
    int f7467z2 = 1;

    /* renamed from: z3 */
    String f7468z3;

    /* renamed from: z4 */
    boolean f7469z4;

    /* renamed from: z5 */
    ArrayList<NativeAdDetails> f7470z5;

    /* renamed from: british.x.config$a */
    class C1693a implements View.OnClickListener {
        C1693a() {
        }

        public void onClick(View view) {
            ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo3246H(8388611);
        }
    }

    /* renamed from: british.x.config$a0 */
    class C1694a0 implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7472a;

        /* renamed from: b */
        final /* synthetic */ String f7473b;

        C1694a0(AlertDialog alertDialog, String str) {
            this.f7472a = alertDialog;
            this.f7473b = str;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7472a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + this.f7473b));
            Button button2 = this.f7472a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + this.f7473b));
        }
    }

    /* renamed from: british.x.config$b */
    class C1695b implements AdapterView.OnItemClickListener {
        C1695b() {
        }

        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            if (view.getTag(R.id.TAG_ESPRIVACY) != null) {
                Context context = view.getContext();
                C1692config config = C1692config.this;
                String str = config.f7368l1;
                new C1721n0(context, str, C1692config.m8189h(config.f7313c1, str)).execute(new String[0]);
                return;
            }
            C1692config config2 = C1692config.this;
            if (config2.f7450x > 0) {
                i--;
            }
            view.setId(config2.f7243Q1[i]);
            view.setTag(R.id.TAG_IDSECC, Integer.valueOf(C1692config.this.f7243Q1[i]));
            ((C1592a) view.getContext()).onClick(view);
        }
    }

    /* renamed from: british.x.config$b0 */
    class C1696b0 implements DialogInterface.OnClickListener {
        C1696b0() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            CheckBox checkBox = (CheckBox) ((AlertDialog) dialogInterface).findViewById(R.id.skip);
            if (checkBox.isChecked()) {
                SharedPreferences.Editor edit = C1692config.this.getSharedPreferences("sh", 0).edit();
                edit.putBoolean("popup_nomas_" + C1692config.this.f7231O1[((Integer) checkBox.getTag()).intValue()].f7964y, true);
                edit.commit();
            }
        }
    }

    /* renamed from: british.x.config$c */
    class C1697c extends InterstitialAdLoadCallback {

        /* renamed from: british.x.config$c$a */
        class C1698a extends FullScreenContentCallback {
            C1698a() {
            }

            public void onAdDismissedFullScreenContent() {
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
            }

            public void onAdShowedFullScreenContent() {
                C1692config.f7132f6 = null;
            }
        }

        C1697c() {
        }

        /* renamed from: a */
        public void onAdLoaded(InterstitialAd interstitialAd) {
            C1692config.f7132f6 = interstitialAd;
            interstitialAd.setFullScreenContentCallback(new C1698a());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            C1692config.f7132f6 = null;
            if (C1692config.f7121U5.equals("")) {
                C1692config.f7137k6 = 0;
                C1692config.f7138l6 = 0;
            }
        }
    }

    /* renamed from: british.x.config$c0 */
    class C1699c0 implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7479a;

        /* renamed from: b */
        final /* synthetic */ String f7480b;

        C1699c0(AlertDialog alertDialog, String str) {
            this.f7479a = alertDialog;
            this.f7480b = str;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7479a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + this.f7480b));
        }
    }

    /* renamed from: british.x.config$d */
    class C1700d implements InterstitialAdListener {
        C1700d() {
        }

        public void onAdClicked(C3371Ad ad) {
        }

        public void onAdLoaded(C3371Ad ad) {
        }

        public void onError(C3371Ad ad, com.facebook.ads.AdError adError) {
            C1692config.f7137k6 = 0;
            C1692config.f7138l6 = 0;
        }

        public void onInterstitialDismissed(C3371Ad ad) {
        }

        public void onInterstitialDisplayed(C3371Ad ad) {
        }

        public void onLoggingImpression(C3371Ad ad) {
        }
    }

    /* renamed from: british.x.config$d0 */
    class C1701d0 extends AdColonyAdViewListener {

        /* renamed from: d */
        final /* synthetic */ C1603c f7483d;

        C1701d0(C1603c cVar) {
            this.f7483d = cVar;
        }

        public void onRequestFilled(AdColonyAdView adColonyAdView) {
            C1692config config = C1692config.this;
            int i = config.f7384n3;
            Integer valueOf = Integer.valueOf(R.id.TAG_ESBANNER);
            if (i == 1) {
                View findViewWithTag = config.f7306b.findViewWithTag(valueOf);
                if (findViewWithTag != null) {
                    ((LinearLayout) C1692config.this.f7306b).removeView(findViewWithTag);
                }
            } else {
                ((LinearLayout) config.f7306b.getRootView().findViewById(R.id.ll_ad)).removeAllViews();
            }
            AdColonyAdView adColonyAdView2 = this.f7483d.f6889d;
            if (adColonyAdView2 != null) {
                adColonyAdView2.destroy();
            }
            this.f7483d.f6889d = adColonyAdView;
            C1692config config2 = C1692config.this;
            if (config2.f7384n3 == 1) {
                adColonyAdView.setTag(valueOf);
                ((LinearLayout) C1692config.this.f7306b).addView(this.f7483d.f6889d);
            } else {
                LinearLayout linearLayout = null;
                try {
                    linearLayout = (LinearLayout) config2.f7306b.getRootView().findViewById(R.id.ll_ad);
                } catch (Exception unused) {
                }
                if (linearLayout != null) {
                    linearLayout.addView(this.f7483d.f6889d);
                    linearLayout.findViewById(R.id.ll_ad).setVisibility(0);
                }
            }
            C1692config.this.f7456x5 = true;
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
        }
    }

    /* renamed from: british.x.config$e */
    class C1702e implements AdEventListener {
        C1702e() {
        }

        public void onFailedToReceiveAd(C5041Ad ad) {
            C1692config.f7137k6 = 0;
            C1692config.f7138l6 = 0;
        }

        public void onReceiveAd(C5041Ad ad) {
        }
    }

    /* renamed from: british.x.config$e0 */
    class C1703e0 implements BannerView.IListener {

        /* renamed from: a */
        final /* synthetic */ C1603c f7486a;

        C1703e0(C1603c cVar) {
            this.f7486a = cVar;
        }

        public void onBannerClick(BannerView bannerView) {
        }

        public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        }

        public void onBannerLeftApplication(BannerView bannerView) {
        }

        public void onBannerLoaded(BannerView bannerView) {
            C1692config config = C1692config.this;
            int i = config.f7384n3;
            Integer valueOf = Integer.valueOf(R.id.TAG_ESBANNER);
            if (i == 1) {
                View findViewWithTag = config.f7306b.findViewWithTag(valueOf);
                if (findViewWithTag != null) {
                    ((LinearLayout) C1692config.this.f7306b).removeView(findViewWithTag);
                }
            } else {
                ((LinearLayout) config.f7306b.getRootView().findViewById(R.id.ll_ad)).removeAllViews();
            }
            this.f7486a.f6890e = bannerView;
            C1692config config2 = C1692config.this;
            if (config2.f7384n3 == 1) {
                bannerView.setTag(valueOf);
                this.f7486a.f6890e.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                ((LinearLayout) C1692config.this.f7306b).addView(this.f7486a.f6890e);
            } else {
                LinearLayout linearLayout = null;
                try {
                    linearLayout = (LinearLayout) config2.f7306b.getRootView().findViewById(R.id.ll_ad);
                } catch (Exception unused) {
                }
                if (linearLayout != null) {
                    linearLayout.addView(this.f7486a.f6890e);
                    linearLayout.findViewById(R.id.ll_ad).setVisibility(0);
                }
            }
            C1692config.this.f7456x5 = true;
        }
    }

    /* renamed from: british.x.config$f */
    class C1704f extends AdColonyInterstitialListener {
        C1704f() {
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
            C1692config.f7136j6 = null;
            C1692config.f7137k6 = 0;
            C1692config.f7138l6 = 0;
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            C1692config.f7136j6 = adColonyInterstitial;
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            C1692config.f7136j6 = null;
            C1692config.f7137k6 = 0;
            C1692config.f7138l6 = 0;
        }
    }

    /* renamed from: british.x.config$f0 */
    class C1705f0 implements BannerListener {
        C1705f0() {
        }

        public void onBannerAdClicked() {
        }

        public void onBannerAdLeftApplication() {
        }

        public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        }

        public void onBannerAdLoaded() {
            C1692config config = C1692config.this;
            int i = config.f7384n3;
            Integer valueOf = Integer.valueOf(R.id.TAG_ESBANNER);
            if (i == 1) {
                View findViewWithTag = config.f7306b.findViewWithTag(valueOf);
                if (findViewWithTag != null) {
                    ((LinearLayout) C1692config.this.f7306b).removeView(findViewWithTag);
                }
            } else {
                ((LinearLayout) config.f7306b.getRootView().findViewById(R.id.ll_ad)).removeAllViews();
            }
            C1692config config2 = C1692config.this;
            if (config2.f7384n3 == 1) {
                config2.f7420s4.setTag(valueOf);
                C1692config config3 = C1692config.this;
                ((LinearLayout) config3.f7306b).addView(config3.f7420s4);
            } else {
                LinearLayout linearLayout = null;
                try {
                    linearLayout = (LinearLayout) config2.f7306b.getRootView().findViewById(R.id.ll_ad);
                } catch (Exception unused) {
                }
                if (linearLayout != null) {
                    linearLayout.addView(C1692config.this.f7420s4);
                    linearLayout.findViewById(R.id.ll_ad).setVisibility(0);
                }
            }
            C1692config.this.f7456x5 = true;
        }

        public void onBannerAdScreenDismissed() {
        }

        public void onBannerAdScreenPresented() {
        }
    }

    /* renamed from: british.x.config$g */
    class C1706g implements OnAdLoaded {
        C1706g() {
        }

        public void adLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
            try {
                C1692config.f7133g6.showAd();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: british.x.config$g0 */
    class C1707g0 extends NativeAdListener {
        C1707g0() {
        }

        public void onAdClicked(NativeAd nativeAd) {
            super.onAdClicked(nativeAd);
            View findViewById = nativeAd.getNativeAdView().findViewById(R.id.ad_pb);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
    }

    /* renamed from: british.x.config$h */
    class C1708h implements OnAdError {
        C1708h() {
        }

        public void adError(String str) {
            C1692config.f7133g6 = null;
        }
    }

    /* renamed from: british.x.config$h0 */
    class C1709h0 implements Runnable {

        /* renamed from: b */
        final /* synthetic */ HorizontalScrollView f7493b;

        C1709h0(HorizontalScrollView horizontalScrollView) {
            this.f7493b = horizontalScrollView;
        }

        public void run() {
            try {
                this.f7493b.setScrollX(C1692config.f7112L5);
                C1692config.f7113M5.put(Integer.valueOf(C1692config.m8182c0(this.f7493b).hashCode()), Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: british.x.config$i */
    class C1710i implements OnAdClosed {
        C1710i() {
        }

        public void onAdClosed() {
            C1692config.f7133g6 = null;
        }
    }

    /* renamed from: british.x.config$i0 */
    class C1711i0 implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: b */
        final /* synthetic */ HorizontalScrollView f7496b;

        C1711i0(HorizontalScrollView horizontalScrollView) {
            this.f7496b = horizontalScrollView;
        }

        public void onScrollChanged() {
            try {
                int hashCode = C1692config.m8182c0(this.f7496b).hashCode();
                if (C1692config.f7113M5.containsKey(Integer.valueOf(hashCode)) && C1692config.f7113M5.get(Integer.valueOf(hashCode)).booleanValue()) {
                    C1692config.f7112L5 = this.f7496b.getScrollX();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: british.x.config$j */
    class C1712j implements IUnityAdsLoadListener {

        /* renamed from: a */
        final /* synthetic */ Context f7498a;

        C1712j(Context context) {
            this.f7498a = context;
        }

        public void onUnityAdsAdLoaded(String str) {
            UnityAds.show((Activity) this.f7498a, C1692config.f7128b6, new UnityAdsShowOptions(), (IUnityAdsShowListener) null);
        }

        public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        }
    }

    /* renamed from: british.x.config$j0 */
    class C1713j0 implements View.OnClickListener {
        C1713j0() {
        }

        public void onClick(View view) {
            ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo3246H(8388611);
        }
    }

    /* renamed from: british.x.config$k */
    class C1714k extends AdListener {
        C1714k() {
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            ArrayList<NativeAd> arrayList;
            if (!C1692config.this.f7309b3.equals("") && (arrayList = C1692config.this.f7463y5) != null && arrayList.size() > 0) {
                try {
                    C1692config config = C1692config.this;
                    if (config.f7384n3 == 1) {
                        View findViewWithTag = config.f7306b.findViewWithTag(Integer.valueOf(R.id.TAG_ESBANNER));
                        if (findViewWithTag != null) {
                            ((LinearLayout) C1692config.this.f7306b).removeView(findViewWithTag);
                        }
                    } else {
                        ((LinearLayout) config.f7306b.getRootView().findViewById(R.id.ll_ad)).removeAllViews();
                    }
                    C1692config config2 = C1692config.this;
                    config2.mo7509j(config2.f7306b.getContext());
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: british.x.config$k0 */
    public class C1715k0 extends ArrayAdapter<C1719m0> {

        /* renamed from: b */
        private List<C1719m0> f7502b;

        /* renamed from: c */
        private Context f7503c;

        public C1715k0(List<C1719m0> list, Context context) {
            super(context, R.layout.drawer_list_item, list);
            this.f7502b = list;
            this.f7503c = context;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C1717l0 l0Var = new C1717l0();
            if (view == null) {
                view = ((LayoutInflater) this.f7503c.getSystemService("layout_inflater")).inflate(R.layout.drawer_list_item, (ViewGroup) null);
                View findViewById = view.findViewById(R.id.marcador);
                l0Var.f7506a = findViewById;
                l0Var.f7507b = (TextView) view.findViewById(R.id.texto);
                l0Var.f7508c = (ImageView) view.findViewById(R.id.img);
                l0Var.f7509d = (ProgressBar) view.findViewById(R.id.pb_img);
                C1692config config = C1692config.this;
                if (config.f7387o == 0) {
                    findViewById.getLayoutParams().width = 1;
                    l0Var.f7506a.setBackgroundColor(0);
                } else if (config.f7312c == 900) {
                    findViewById.setBackgroundColor(0);
                }
                if (!C1692config.this.f7225N1) {
                    l0Var.f7508c.setVisibility(8);
                }
                view.setTag(R.id.TAG_IDHOLDER, l0Var);
            } else {
                l0Var = (C1717l0) view.getTag(R.id.TAG_IDHOLDER);
            }
            C1719m0 m0Var = this.f7502b.get(i);
            if (m0Var.f7514d) {
                view.setTag(R.id.TAG_ESPRIVACY, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            } else {
                view.setTag(R.id.TAG_ESPRIVACY, (Object) null);
            }
            C1692config config2 = C1692config.this;
            int[] iArr = config2.f7243Q1;
            if (i >= iArr.length || config2.f7312c != iArr[i]) {
                l0Var.f7506a.setBackgroundColor(0);
                TextView textView = l0Var.f7507b;
                textView.setTextColor(Color.parseColor("#" + C1692config.this.f7331f1));
            } else {
                if (config2.f7387o > 0) {
                    View view2 = l0Var.f7506a;
                    view2.setBackgroundColor(Color.parseColor("#" + C1692config.this.f7349i1));
                }
                TextView textView2 = l0Var.f7507b;
                textView2.setTextColor(Color.parseColor("#" + C1692config.this.f7337g1));
            }
            l0Var.f7507b.setText(m0Var.f7511a);
            if (C1692config.this.f7225N1) {
                if (m0Var.f7513c) {
                    l0Var.f7509d.setVisibility(0);
                    l0Var.f7508c.setImageDrawable(C1692config.this.getResources().getDrawable(R.drawable.pixel500por1));
                } else {
                    l0Var.f7509d.setVisibility(8);
                    Bitmap bitmap = m0Var.f7512b;
                    if (bitmap != null) {
                        l0Var.f7508c.setImageBitmap(bitmap);
                    } else {
                        l0Var.f7508c.setImageDrawable(C1692config.this.getResources().getDrawable(R.drawable.pixel500por1));
                    }
                }
            }
            return view;
        }
    }

    /* renamed from: british.x.config$l */
    class C1716l implements OnAdLoaded {
        C1716l() {
        }

        public void adLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
            try {
                C1692config.f7133g6.showAd();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: british.x.config$l0 */
    private static class C1717l0 {

        /* renamed from: a */
        public View f7506a;

        /* renamed from: b */
        public TextView f7507b;

        /* renamed from: c */
        public ImageView f7508c;

        /* renamed from: d */
        public ProgressBar f7509d;

        private C1717l0() {
        }
    }

    /* renamed from: british.x.config$m */
    class C1718m implements OnAdError {
        C1718m() {
        }

        public void adError(String str) {
            C1692config.f7133g6 = null;
        }
    }

    /* renamed from: british.x.config$m0 */
    public class C1719m0 {

        /* renamed from: a */
        public String f7511a;

        /* renamed from: b */
        public Bitmap f7512b;

        /* renamed from: c */
        public boolean f7513c;

        /* renamed from: d */
        public boolean f7514d = false;

        public C1719m0() {
        }
    }

    /* renamed from: british.x.config$n */
    class C1720n implements OnAdClosed {
        C1720n() {
        }

        public void onAdClosed() {
            C1692config.f7133g6 = null;
        }
    }

    /* renamed from: british.x.config$n0 */
    public static class C1721n0 extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f7517a;

        /* renamed from: b */
        String f7518b;

        /* renamed from: c */
        String f7519c;

        /* renamed from: d */
        Context f7520d;

        /* renamed from: e */
        ProgressDialog f7521e;

        /* renamed from: british.x.config$n0$a */
        class C1722a implements DialogInterface.OnShowListener {
            C1722a() {
            }

            public void onShow(DialogInterface dialogInterface) {
                C1692config.m8168S0((ProgressBar) C1721n0.this.f7521e.findViewById(16908301), C1721n0.this.f7518b);
            }
        }

        /* renamed from: british.x.config$n0$b */
        class C1723b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f7523a;

            C1723b(AlertDialog alertDialog) {
                this.f7523a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f7523a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + C1721n0.this.f7519c));
            }
        }

        public C1721n0(Context context, String str, String str2) {
            this.f7520d = context;
            this.f7518b = str;
            this.f7519c = str2;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:17|16|20|21|(0)|24) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0094, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0095, code lost:
            r1 = r6;
            r6 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
            r6.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
            r1.disconnect();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0098 */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = british.p015x.C1692config.f7107G5
                r6.append(r0)
                java.lang.String r0 = "privacy.e-droid.net/privacy.php?desde_app=1&ida="
                r6.append(r0)
                r0 = 2261075(0x228053, float:3.168441E-39)
                r6.append(r0)
                java.lang.String r0 = "&idl="
                r6.append(r0)
                java.util.Locale r0 = java.util.Locale.getDefault()
                java.lang.String r0 = r0.getLanguage()
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                r0 = -1
                java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00a8 }
                r1.<init>(r6)     // Catch:{ MalformedURLException -> 0x00a8 }
                r6 = 0
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x0098 }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x0098 }
                r6 = 1
                r1.setDoInput(r6)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r6 = 10000(0x2710, float:1.4013E-41)
                r1.setConnectTimeout(r6)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r1.setReadTimeout(r6)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                java.lang.String r6 = "User-Agent"
                java.lang.String r2 = "Android Vinebre Software"
                r1.setRequestProperty(r6, r2)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                java.io.InputStream r6 = r1.getInputStream()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r3.<init>(r6)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r6.<init>()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            L_0x005c:
                java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                if (r3 == 0) goto L_0x0077
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r4.<init>()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r4.append(r3)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                java.lang.String r3 = "\n"
                r4.append(r3)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r6.append(r3)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                goto L_0x005c
            L_0x0077:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r5.f7517a = r6     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                java.lang.String r2 = "@EURO@"
                java.lang.String r3 = "€"
                java.lang.String r6 = r6.replace(r2, r3)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r5.f7517a = r6     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
                r1.disconnect()
                r6 = 0
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            L_0x0090:
                r6 = move-exception
                goto L_0x00a2
            L_0x0092:
                r6 = r1
                goto L_0x0098
            L_0x0094:
                r0 = move-exception
                r1 = r6
                r6 = r0
                goto L_0x00a2
            L_0x0098:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x0094 }
                if (r6 == 0) goto L_0x00a1
                r6.disconnect()
            L_0x00a1:
                return r0
            L_0x00a2:
                if (r1 == 0) goto L_0x00a7
                r1.disconnect()
            L_0x00a7:
                throw r6
            L_0x00a8:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1692config.C1721n0.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            try {
                this.f7521e.dismiss();
            } catch (Exception unused) {
            }
            if (b.byteValue() != 0) {
                Context context = this.f7520d;
                C1692config.m8148C0(context, context.getString(R.string.error_http_tit), this.f7520d.getString(R.string.error_http), this.f7519c);
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f7520d);
            builder.setMessage(Html.fromHtml(this.f7517a));
            builder.setCancelable(true);
            builder.setPositiveButton(this.f7520d.getString(R.string.cerrar), (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            if (!this.f7519c.equals("")) {
                create.setOnShowListener(new C1723b(create));
            }
            try {
                create.show();
            } catch (Exception unused2) {
            }
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused3) {
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            ProgressDialog progressDialog = new ProgressDialog(this.f7520d);
            this.f7521e = progressDialog;
            progressDialog.setMessage(this.f7520d.getString(R.string.cargando));
            this.f7521e.setIndeterminate(true);
            if (Build.VERSION.SDK_INT > 20 && !this.f7518b.equals("")) {
                this.f7521e.setOnShowListener(new C1722a());
            }
            this.f7521e.show();
        }
    }

    /* renamed from: british.x.config$o */
    class C1724o implements IUnityAdsLoadListener {

        /* renamed from: a */
        final /* synthetic */ Context f7525a;

        C1724o(Context context) {
            this.f7525a = context;
        }

        public void onUnityAdsAdLoaded(String str) {
            UnityAds.show((Activity) this.f7525a, C1692config.f7128b6, new UnityAdsShowOptions(), (IUnityAdsShowListener) null);
        }

        public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        }
    }

    /* renamed from: british.x.config$o0 */
    private class C1725o0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        long f7527a;

        /* renamed from: b */
        String f7528b;

        /* renamed from: c */
        String f7529c;

        /* renamed from: d */
        String f7530d;

        /* renamed from: e */
        int f7531e;

        /* renamed from: f */
        Context f7532f;

        /* renamed from: g */
        ProgressDialog f7533g;

        /* renamed from: h */
        View f7534h;

        /* renamed from: british.x.config$o0$a */
        class C1726a implements DialogInterface.OnShowListener {
            C1726a() {
            }

            public void onShow(DialogInterface dialogInterface) {
                C1692config.m8168S0((ProgressBar) C1725o0.this.f7533g.findViewById(16908301), C1725o0.this.f7530d);
            }
        }

        C1725o0(Context context, long j, String str, int i, String str2, String str3, View view) {
            this.f7532f = context;
            this.f7527a = j;
            this.f7528b = str;
            this.f7531e = i;
            this.f7529c = str2;
            this.f7530d = str3;
            this.f7534h = view;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0091  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                java.lang.String r6 = ""
                java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0094 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0094 }
                r1.<init>()     // Catch:{ MalformedURLException -> 0x0094 }
                java.lang.String r2 = "https://pay.e-droid.net/srv/check_payment.php?idusu="
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x0094 }
                long r2 = r5.f7527a     // Catch:{ MalformedURLException -> 0x0094 }
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x0094 }
                java.lang.String r2 = "&c="
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x0094 }
                java.lang.String r2 = r5.f7528b     // Catch:{ MalformedURLException -> 0x0094 }
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x0094 }
                java.lang.String r2 = "&idsec="
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x0094 }
                int r2 = r5.f7531e     // Catch:{ MalformedURLException -> 0x0094 }
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x0094 }
                java.lang.String r1 = r1.toString()     // Catch:{ MalformedURLException -> 0x0094 }
                r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x0094 }
                r1 = 0
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ Exception -> 0x008f, all -> 0x0088 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x008f, all -> 0x0088 }
                r1 = 1
                r0.setDoInput(r1)     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r1)     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                r1 = 15000(0x3a98, float:2.102E-41)
                r0.setReadTimeout(r1)     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                java.lang.String r1 = "User-Agent"
                java.lang.String r2 = "Android Vinebre Software"
                r0.setRequestProperty(r1, r2)     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                r0.connect()     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                r3.<init>(r1)     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                r1.<init>()     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
            L_0x0060:
                java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                if (r3 == 0) goto L_0x007b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                r4.<init>()     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                r4.append(r3)     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                java.lang.String r3 = "\n"
                r4.append(r3)     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                r1.append(r3)     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                goto L_0x0060
            L_0x007b:
                java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
                r0.disconnect()
                return r6
            L_0x0083:
                r6 = move-exception
                r1 = r0
                goto L_0x0089
            L_0x0086:
                r1 = r0
                goto L_0x008f
            L_0x0088:
                r6 = move-exception
            L_0x0089:
                if (r1 == 0) goto L_0x008e
                r1.disconnect()
            L_0x008e:
                throw r6
            L_0x008f:
                if (r1 == 0) goto L_0x0094
                r1.disconnect()
            L_0x0094:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1692config.C1725o0.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            Long l;
            try {
                this.f7533g.dismiss();
            } catch (Exception unused) {
            }
            if (str.contains("ANDROID:NO")) {
                SharedPreferences sharedPreferences = C1692config.this.getSharedPreferences("sh", 0);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("secc" + this.f7531e + "_comprobacionespago", sharedPreferences.getInt("secc" + this.f7531e + "_comprobacionespago", 0) + 1);
                edit.apply();
                C1692config.this.mo7483J0(this.f7532f, this.f7531e, this.f7529c, this.f7530d);
            } else if (str.contains("ANDROID:YES DURACION:")) {
                int indexOf = str.indexOf("ANDROID:YES DURACION:") + 21;
                int parseInt = Integer.parseInt(str.substring(indexOf, str.indexOf("-", indexOf)));
                SharedPreferences.Editor edit2 = C1692config.this.getSharedPreferences("sh", 0).edit();
                edit2.putInt("secc" + this.f7531e + "_comprobacionespago", 0);
                edit2.putBoolean("secc" + this.f7531e + "_pagada", true);
                if (parseInt == 18000) {
                    l = 2524604400000L;
                } else {
                    l = Long.valueOf(System.currentTimeMillis() + ((long) (parseInt * 60 * 60 * 1000)));
                }
                edit2.putLong("secc" + this.f7531e + "_fhasta", l.longValue());
                edit2.apply();
                ((C1592a) this.f7532f).abrir_secc(this.f7534h);
            } else {
                C1692config.m8148C0(this.f7532f, C1692config.this.getResources().getString(R.string.error_http_tit), C1692config.this.getResources().getString(R.string.error_http), this.f7529c);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            SharedPreferences sharedPreferences = C1692config.this.getSharedPreferences("sh", 0);
            if (sharedPreferences.getInt("secc" + this.f7531e + "_comprobacionespago", 0) > 10) {
                cancel(false);
                C1692config.this.mo7483J0(this.f7532f, this.f7531e, this.f7529c, this.f7530d);
                return;
            }
            ProgressDialog progressDialog = new ProgressDialog(this.f7532f);
            this.f7533g = progressDialog;
            progressDialog.setMessage(C1692config.this.getResources().getString(R.string.comprobando_pago));
            this.f7533g.setIndeterminate(true);
            if (Build.VERSION.SDK_INT > 20 && !this.f7530d.equals("")) {
                this.f7533g.setOnShowListener(new C1726a());
            }
            this.f7533g.show();
        }
    }

    /* renamed from: british.x.config$p */
    class C1727p implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f7537b;

        C1727p(String str) {
            this.f7537b = str;
        }

        public void run() {
            C1692config.this.mo7479E0(1, this.f7537b);
        }
    }

    /* renamed from: british.x.config$p0 */
    public static class C1728p0 extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        String f7539a;

        /* renamed from: b */
        String f7540b;

        C1728p0(String str, String str2) {
            this.f7539a = str;
            this.f7540b = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 20000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(this.f7539a);
                eVar.mo47986B(new C12960g(C12957d.BROWSER_COMPATIBLE));
                String str = this.f7540b;
                if (str != null) {
                    eVar.mo47794K(RtspHeaders.USER_AGENT, str);
                }
                hVar.mo43518a(eVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: british.x.config$q */
    class C1729q implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f7541b;

        C1729q(String str) {
            this.f7541b = str;
        }

        public void run() {
            C1692config.this.mo7479E0(0, this.f7541b);
        }
    }

    /* renamed from: british.x.config$q0 */
    static class C1730q0 {

        /* renamed from: a */
        String f7543a;

        /* renamed from: b */
        int f7544b;

        /* renamed from: c */
        int f7545c;

        /* renamed from: d */
        int f7546d;

        /* renamed from: e */
        String f7547e;

        /* renamed from: f */
        Boolean f7548f;

        /* renamed from: g */
        MenuItem f7549g;

        C1730q0() {
        }
    }

    /* renamed from: british.x.config$r */
    class C1731r implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7550a;

        /* renamed from: b */
        final /* synthetic */ String f7551b;

        C1731r(AlertDialog alertDialog, String str) {
            this.f7550a = alertDialog;
            this.f7551b = str;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7550a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + this.f7551b));
        }
    }

    /* renamed from: british.x.config$r0 */
    public static class C1732r0 extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f7552a;

        /* renamed from: b */
        String f7553b;

        /* renamed from: c */
        long f7554c;

        /* renamed from: d */
        int f7555d;

        /* renamed from: e */
        int f7556e;

        C1732r0(long j, String str, int i, String str2, int i2) {
            this.f7554c = j;
            this.f7552a = str;
            this.f7555d = i;
            this.f7553b = str2;
            this.f7556e = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND);
                C12789c.m54267i(bVar, 60000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/modif_usuchats.php?idusu=" + this.f7554c + "&c=" + this.f7552a + "&idchat=" + this.f7555d + "&campo=" + this.f7553b + "&modo=" + this.f7556e);
                eVar.mo47986B(new C12960g(C12957d.BROWSER_COMPATIBLE));
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
                    return (byte) 1;
                }
                return (byte) 0;
            } catch (Exception unused) {
                return (byte) 0;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            b.byteValue();
        }
    }

    /* renamed from: british.x.config$s */
    class C1733s implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Context f7557b;

        /* renamed from: c */
        final /* synthetic */ String f7558c;

        /* renamed from: d */
        final /* synthetic */ long f7559d;

        /* renamed from: e */
        final /* synthetic */ String f7560e;

        /* renamed from: f */
        final /* synthetic */ SharedPreferences f7561f;

        C1733s(Context context, String str, long j, String str2, SharedPreferences sharedPreferences) {
            this.f7557b = context;
            this.f7558c = str;
            this.f7559d = j;
            this.f7560e = str2;
            this.f7561f = sharedPreferences;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C1692config.m8157K0(Toast.makeText(this.f7557b, C1692config.this.getResources().getString(R.string.enviando), 0));
            C1692config.m8152H(this.f7557b, this.f7558c);
            new t_chat.C2233c0(this.f7558c, this.f7559d, this.f7560e, this.f7557b).execute(new String[0]);
            SharedPreferences.Editor edit = this.f7561f.edit();
            edit.putBoolean("ban_" + this.f7558c, true);
            edit.commit();
            t_chat.m8709S(this.f7557b, this.f7558c);
        }
    }

    /* renamed from: british.x.config$t */
    class C1734t implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7563a;

        /* renamed from: b */
        final /* synthetic */ String f7564b;

        C1734t(AlertDialog alertDialog, String str) {
            this.f7563a = alertDialog;
            this.f7564b = str;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7563a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + this.f7564b));
            Button button2 = this.f7563a.getButton(-2);
            if (button2 != null) {
                button2.setTextColor(Color.parseColor("#" + this.f7564b));
            }
        }
    }

    /* renamed from: british.x.config$u */
    class C1735u implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f7566a;

        /* renamed from: b */
        final /* synthetic */ boolean f7567b;

        /* renamed from: c */
        final /* synthetic */ FragmentActivity_ext_class f7568c;

        /* renamed from: d */
        final /* synthetic */ Activity_ext_class f7569d;

        C1735u(Context context, boolean z, FragmentActivity_ext_class fragmentActivity_ext_class, Activity_ext_class activity_ext_class) {
            this.f7566a = context;
            this.f7567b = z;
            this.f7568c = fragmentActivity_ext_class;
            this.f7569d = activity_ext_class;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            int i = 0;
            while (true) {
                C1730q0[] q0VarArr = C1692config.f7115O5;
                if (i >= q0VarArr.length) {
                    i = -1;
                    break;
                } else if (q0VarArr[i].f7549g.getItemId() == menuItem.getItemId()) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return false;
            }
            C1730q0 q0Var = C1692config.f7115O5[i];
            C1692config.f7116P5 = q0Var.f7549g.getItemId();
            if (q0Var.f7545c > 0) {
                View view = new View(this.f7566a);
                int indexOf = C1692config.f7114N5.indexOf(Integer.valueOf(q0Var.f7545c));
                view.setId(indexOf);
                view.setTag(R.id.TAG_IDSECC, Integer.valueOf(indexOf));
                if (this.f7567b) {
                    String str = C1692config.this.f7251R3;
                    if (str != null && !str.equals("")) {
                        this.f7568c.f6675x = new RewardedVideo((Context) (Activity) this.f7566a, C1692config.this.f7251R3);
                    }
                    String str2 = C1692config.this.f7245Q3;
                    if (str2 != null) {
                        str2.equals("");
                    }
                    String str3 = C1692config.this.f7269U3;
                    if (str3 != null && !str3.equals("")) {
                        this.f7568c.f6676y = new RewardedVideoAd((Activity) this.f7566a, C1692config.this.f7269U3);
                    }
                    String str4 = C1692config.this.f7275V3;
                    if (str4 != null && !str4.equals("")) {
                        this.f7568c.f6677z = new StartAppAd((Activity) this.f7566a);
                    }
                    this.f7568c.f6673v = new ProgressDialog((Activity) this.f7566a);
                    FragmentActivity_ext_class fragmentActivity_ext_class = this.f7568c;
                    fragmentActivity_ext_class.f6672u = view;
                    if (!C1692config.this.mo7494Z0(this.f7566a, view, fragmentActivity_ext_class.f6668q, fragmentActivity_ext_class.f6673v, fragmentActivity_ext_class.f6674w, fragmentActivity_ext_class.f6675x, fragmentActivity_ext_class.f6676y, fragmentActivity_ext_class.f6677z, fragmentActivity_ext_class.f6667A, (View) null)) {
                        ((C1592a) this.f7566a).abrir_secc(view);
                    }
                } else {
                    String str5 = C1692config.this.f7251R3;
                    if (str5 != null && !str5.equals("")) {
                        this.f7569d.f6663i = new RewardedVideo((Context) (Activity) this.f7566a, C1692config.this.f7251R3);
                    }
                    String str6 = C1692config.this.f7245Q3;
                    if (str6 != null) {
                        str6.equals("");
                    }
                    String str7 = C1692config.this.f7269U3;
                    if (str7 != null && !str7.equals("")) {
                        this.f7569d.f6664j = new RewardedVideoAd((Activity) this.f7566a, C1692config.this.f7269U3);
                    }
                    String str8 = C1692config.this.f7275V3;
                    if (str8 != null && !str8.equals("")) {
                        this.f7569d.f6665k = new StartAppAd((Activity) this.f7566a);
                    }
                    this.f7569d.f6661g = new ProgressDialog((Activity) this.f7566a);
                    Activity_ext_class activity_ext_class = this.f7569d;
                    activity_ext_class.f6660f = view;
                    if (!C1692config.this.mo7494Z0(this.f7566a, view, activity_ext_class.f6656b, activity_ext_class.f6661g, activity_ext_class.f6662h, activity_ext_class.f6663i, activity_ext_class.f6664j, activity_ext_class.f6665k, activity_ext_class.f6666l, (View) null)) {
                        ((C1592a) this.f7566a).abrir_secc(view);
                    }
                }
            } else if (!q0Var.f7547e.equals("")) {
                if (!q0Var.f7548f.booleanValue()) {
                    String str9 = q0Var.f7547e;
                    C1845j k0 = C1692config.this.mo7513k0(str9, this.f7566a);
                    Intent intent = k0.f7842a;
                    if (!(intent == null || intent.getAction() == null || !k0.f7842a.getAction().equals("android.intent.action.VIEW"))) {
                        Intent intent2 = new Intent(this.f7566a, t_url.class);
                        intent2.putExtra("url", str9);
                        k0.f7842a = intent2;
                    }
                    if (k0.f7843b) {
                        if (this.f7567b) {
                            this.f7568c.f6669r = true;
                        } else {
                            this.f7569d.f6657c = true;
                        }
                        Intent intent3 = new Intent();
                        intent3.putExtra("finalizar", true);
                        intent3.putExtra("finalizar_app", k0.f7844c);
                        ((Activity) this.f7566a).setResult(-1, intent3);
                    }
                    if (this.f7567b) {
                        if (k0.f7845d) {
                            ((Activity) this.f7566a).startActivityForResult(k0.f7842a, 0);
                        } else {
                            Intent intent4 = k0.f7842a;
                            if (intent4 != null) {
                                if (k0.f7843b) {
                                    this.f7568c.f6671t = false;
                                    if (C1692config.this.f7427t4 != 2) {
                                        intent4.putExtra("es_root", true);
                                    }
                                    try {
                                        ((Activity) this.f7566a).startActivity(k0.f7842a);
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    ((Activity) this.f7566a).startActivityForResult(intent4, 0);
                                }
                            }
                        }
                        FragmentActivity_ext_class fragmentActivity_ext_class2 = this.f7568c;
                        if (fragmentActivity_ext_class2.f6669r && !fragmentActivity_ext_class2.f6670s) {
                            ((Activity) this.f7566a).finish();
                        }
                    } else {
                        if (k0.f7845d) {
                            ((Activity) this.f7566a).startActivityForResult(k0.f7842a, 0);
                        } else {
                            Intent intent5 = k0.f7842a;
                            if (intent5 != null) {
                                if (k0.f7843b) {
                                    this.f7569d.f6659e = false;
                                    if (C1692config.this.f7427t4 != 2) {
                                        intent5.putExtra("es_root", true);
                                    }
                                    try {
                                        ((Activity) this.f7566a).startActivity(k0.f7842a);
                                    } catch (Exception unused2) {
                                    }
                                } else {
                                    ((Activity) this.f7566a).startActivityForResult(intent5, 0);
                                }
                            }
                        }
                        Activity_ext_class activity_ext_class2 = this.f7569d;
                        if (activity_ext_class2.f6657c && !activity_ext_class2.f6658d) {
                            ((Activity) this.f7566a).finish();
                        }
                    }
                } else {
                    C1845j k02 = C1692config.this.mo7513k0(q0Var.f7547e, this.f7566a);
                    if (k02.f7843b) {
                        if (this.f7567b) {
                            this.f7568c.f6669r = true;
                        } else {
                            this.f7569d.f6657c = true;
                        }
                        Intent intent6 = new Intent();
                        intent6.putExtra("finalizar", true);
                        intent6.putExtra("finalizar_app", k02.f7844c);
                        ((Activity) this.f7566a).setResult(-1, intent6);
                    }
                    if (this.f7567b) {
                        if (k02.f7845d) {
                            ((Activity) this.f7566a).startActivityForResult(k02.f7842a, 0);
                        } else {
                            Intent intent7 = k02.f7842a;
                            if (intent7 != null) {
                                if (k02.f7843b) {
                                    this.f7568c.f6671t = false;
                                    if (C1692config.this.f7427t4 != 2) {
                                        intent7.putExtra("es_root", true);
                                    }
                                    try {
                                        ((Activity) this.f7566a).startActivity(k02.f7842a);
                                    } catch (Exception unused3) {
                                    }
                                } else {
                                    ((Activity) this.f7566a).startActivityForResult(intent7, 0);
                                }
                            }
                        }
                        FragmentActivity_ext_class fragmentActivity_ext_class3 = this.f7568c;
                        if (fragmentActivity_ext_class3.f6669r && !fragmentActivity_ext_class3.f6670s) {
                            ((Activity) this.f7566a).finish();
                        }
                    } else {
                        if (k02.f7845d) {
                            ((Activity) this.f7566a).startActivityForResult(k02.f7842a, 0);
                        } else {
                            Intent intent8 = k02.f7842a;
                            if (intent8 != null) {
                                if (k02.f7843b) {
                                    this.f7569d.f6659e = false;
                                    if (C1692config.this.f7427t4 != 2) {
                                        intent8.putExtra("es_root", true);
                                    }
                                    try {
                                        ((Activity) this.f7566a).startActivity(k02.f7842a);
                                    } catch (Exception unused4) {
                                    }
                                } else {
                                    ((Activity) this.f7566a).startActivityForResult(intent8, 0);
                                }
                            }
                        }
                        Activity_ext_class activity_ext_class3 = this.f7569d;
                        if (activity_ext_class3.f6657c && !activity_ext_class3.f6658d) {
                            ((Activity) this.f7566a).finish();
                        }
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: british.x.config$v */
    class C1736v implements com.startapp.sdk.ads.banner.BannerListener {
        C1736v() {
        }

        public void onClick(View view) {
        }

        public void onFailedToReceiveAd(View view) {
        }

        public void onImpression(View view) {
        }

        public void onReceiveAd(View view) {
            C1692config config = C1692config.this;
            View view2 = config.f7306b;
            if (view2 != null) {
                if (config.f7384n3 != 1) {
                    LinearLayout linearLayout = (LinearLayout) view2.getRootView().findViewById(R.id.ll_ad);
                    if (linearLayout.getChildCount() == 0) {
                        linearLayout.addView(view);
                        linearLayout.setVisibility(0);
                    }
                } else if (((LinearLayout) view2).findViewWithTag(Integer.valueOf(R.id.TAG_ESBANNER)) == null) {
                    ((LinearLayout) C1692config.this.f7306b).addView(view);
                }
                C1692config.this.f7456x5 = true;
            }
        }
    }

    /* renamed from: british.x.config$w */
    class C1737w implements Runnable {

        /* renamed from: b */
        final /* synthetic */ HorizontalScrollView f7572b;

        C1737w(HorizontalScrollView horizontalScrollView) {
            this.f7572b = horizontalScrollView;
        }

        public void run() {
            try {
                this.f7572b.setScrollX(C1692config.f7112L5);
            } catch (Exception unused) {
            }
            C1692config.f7113M5.put(Integer.valueOf(C1692config.m8182c0(this.f7572b).hashCode()), Boolean.TRUE);
        }
    }

    /* renamed from: british.x.config$x */
    class C1738x implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ long f7573b;

        /* renamed from: c */
        final /* synthetic */ int f7574c;

        /* renamed from: d */
        final /* synthetic */ SharedPreferences f7575d;

        /* renamed from: e */
        final /* synthetic */ Context f7576e;

        C1738x(long j, int i, SharedPreferences sharedPreferences, Context context) {
            this.f7573b = j;
            this.f7574c = i;
            this.f7575d = sharedPreferences;
            this.f7576e = context;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            boolean z;
            try {
                C1692config.this.getApplicationContext().getPackageManager().getPackageInfo("app.phantom", 0);
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
                z = false;
            }
            if (z) {
                String str = null;
                try {
                    str = URLEncoder.encode("https://pay.e-droid.net/srv/solana_transaction.php?idusu=" + this.f7573b + "&idsec=" + this.f7574c, "utf-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                if (str != null) {
                    SharedPreferences.Editor edit = this.f7575d.edit();
                    edit.putBoolean("secc" + this.f7574c + "_intentado", true);
                    edit.putInt("secc" + this.f7574c + "_comprobacionespago", 0);
                    edit.apply();
                    this.f7576e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("solana:" + str)));
                    return;
                }
                return;
            }
            this.f7576e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=app.phantom")));
        }
    }

    /* renamed from: british.x.config$y */
    class C1739y implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7578a;

        /* renamed from: b */
        final /* synthetic */ String f7579b;

        C1739y(AlertDialog alertDialog, String str) {
            this.f7578a = alertDialog;
            this.f7579b = str;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7578a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + this.f7579b));
            Button button2 = this.f7578a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + this.f7579b));
        }
    }

    /* renamed from: british.x.config$z */
    class C1740z implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ ProgressDialog f7581b;

        /* renamed from: c */
        final /* synthetic */ Integer f7582c;

        /* renamed from: d */
        final /* synthetic */ RewardedVideo f7583d;

        /* renamed from: e */
        final /* synthetic */ Context f7584e;

        /* renamed from: f */
        final /* synthetic */ RewardedAdLoadCallback f7585f;

        /* renamed from: g */
        final /* synthetic */ RewardedVideoAd f7586g;

        /* renamed from: h */
        final /* synthetic */ StartAppAd f7587h;

        /* renamed from: i */
        final /* synthetic */ AdColonyInterstitialListener f7588i;

        /* renamed from: j */
        final /* synthetic */ View f7589j;

        /* renamed from: k */
        final /* synthetic */ View f7590k;

        /* renamed from: british.x.config$z$a */
        class C1741a implements DialogInterface.OnShowListener {
            C1741a() {
            }

            public void onShow(DialogInterface dialogInterface) {
                C1692config.m8168S0((ProgressBar) C1740z.this.f7581b.findViewById(16908301), C1692config.this.f7368l1);
            }
        }

        /* renamed from: british.x.config$z$b */
        class C1742b implements IUnityAdsShowListener {
            C1742b() {
            }

            public void onUnityAdsShowClick(String str) {
            }

            public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                if (unityAdsShowCompletionState.equals(UnityAds.UnityAdsShowCompletionState.COMPLETED)) {
                    C1692config.m8175Y0(C1740z.this.f7584e);
                    C1740z zVar = C1740z.this;
                    ((C1592a) zVar.f7584e).abrir_secc(zVar.f7589j);
                }
            }

            public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
                try {
                    C1740z.this.f7581b.hide();
                } catch (Exception unused) {
                }
                C1740z zVar = C1740z.this;
                ((C1592a) zVar.f7584e).abrir_secc(zVar.f7589j);
            }

            public void onUnityAdsShowStart(String str) {
                try {
                    C1740z.this.f7581b.hide();
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: british.x.config$z$c */
        class C1743c implements IUnityAdsLoadListener {

            /* renamed from: a */
            final /* synthetic */ IUnityAdsShowListener f7594a;

            C1743c(IUnityAdsShowListener iUnityAdsShowListener) {
                this.f7594a = iUnityAdsShowListener;
            }

            public void onUnityAdsAdLoaded(String str) {
                C1740z zVar = C1740z.this;
                UnityAds.show((Activity) zVar.f7584e, C1692config.this.f7287X3, new UnityAdsShowOptions(), this.f7594a);
            }

            public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
                try {
                    C1740z.this.f7581b.hide();
                } catch (Exception unused) {
                }
                C1740z zVar = C1740z.this;
                ((C1592a) zVar.f7584e).abrir_secc(zVar.f7589j);
            }
        }

        C1740z(ProgressDialog progressDialog, Integer num, RewardedVideo rewardedVideo, Context context, RewardedAdLoadCallback rewardedAdLoadCallback, RewardedVideoAd rewardedVideoAd, StartAppAd startAppAd, AdColonyInterstitialListener adColonyInterstitialListener, View view, View view2) {
            this.f7581b = progressDialog;
            this.f7582c = num;
            this.f7583d = rewardedVideo;
            this.f7584e = context;
            this.f7585f = rewardedAdLoadCallback;
            this.f7586g = rewardedVideoAd;
            this.f7587h = startAppAd;
            this.f7588i = adColonyInterstitialListener;
            this.f7589j = view;
            this.f7590k = view2;
        }

        /* renamed from: a */
        public void mo7590a() {
            this.f7581b.setMessage(C1692config.this.getString(R.string.cargando));
            this.f7581b.setIndeterminate(true);
            this.f7581b.setCancelable(false);
            if (Build.VERSION.SDK_INT > 20 && !C1692config.this.f7368l1.equals("")) {
                this.f7581b.setOnShowListener(new C1741a());
            }
            this.f7581b.show();
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f7582c.intValue() == 2) {
                mo7590a();
                this.f7583d.setMute(false);
                this.f7583d.setOnAdLoadedCallback((OnAdLoaded) this.f7584e);
                this.f7583d.setOnAdClosedCallback((OnAdClosed) this.f7584e);
                this.f7583d.setOnAdErrorCallback((OnAdError) this.f7584e);
                this.f7583d.setOnVideoEndedCallback((OnVideoEnded) this.f7584e);
                this.f7583d.loadAd();
            } else if (this.f7582c.intValue() == 1) {
                mo7590a();
                RewardedAd.load(this.f7584e, C1692config.this.f7245Q3, new AdRequest.Builder().build(), this.f7585f);
            } else if (this.f7582c.intValue() == 3) {
                mo7590a();
                RewardedVideoAd rewardedVideoAd = this.f7586g;
                rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener((RewardedVideoAdListener) this.f7584e).build());
            } else if (this.f7582c.intValue() == 4) {
                mo7590a();
                this.f7587h.setVideoListener((VideoListener) this.f7584e);
                this.f7587h.loadAd(StartAppAd.AdMode.REWARDED_VIDEO, (AdEventListener) this.f7584e);
            } else if (this.f7582c.intValue() == 5) {
                mo7590a();
                AdColony.setRewardListener((AdColonyRewardListener) this.f7584e);
                AdColony.requestInterstitial(C1692config.this.f7281W3, this.f7588i);
            } else if (this.f7582c.intValue() != 6) {
                if (this.f7582c.intValue() == 7) {
                    mo7590a();
                    UnityAds.load(C1692config.this.f7287X3, new C1743c(new C1742b()));
                } else if (this.f7582c.intValue() == 8) {
                    C1692config config = C1692config.this;
                    config.f7304a4 = this.f7584e;
                    config.f7310b4 = this.f7590k;
                    IronSource.showRewardedVideo();
                }
            }
        }
    }

    static {
        String str = Build.VERSION.SDK_INT < 22 ? "http://" : "https://";
        f7107G5 = str;
        f7109I5 = str + m8170U();
    }

    /* renamed from: A */
    static int m8146A(Context context, String str, String str2, Intent intent, int i, int i2, String str3, String str4) {
        if (str3.equals((Object) null) || str3.equals("")) {
            str3 = SessionDescription.SUPPORTED_SDP_VERSION;
        }
        if (str4.equals((Object) null) || str4.equals("")) {
            str4 = SessionDescription.SUPPORTED_SDP_VERSION;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("sh", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i3 = sharedPreferences.getInt("id_ultnotif", 0) + 1;
        intent.putExtra("idnotif_marcar", i3);
        edit.putInt("id_ultnotif", i3);
        edit.putBoolean("hatenidonotif", true);
        edit.putLong("notif_" + i3 + "_fcrea", System.currentTimeMillis());
        edit.putString("notif_" + i3 + "_title", str);
        edit.putString("notif_" + i3 + "_text", str2);
        edit.putString("notif_" + i3 + "_intent", intent.toUri(0));
        edit.putInt("notif_" + i3 + "_numnotif", i);
        edit.putBoolean("notif_" + i3 + "_leida", false);
        edit.putInt("notif_" + i3 + "_tipo", i2);
        edit.putString("notif_" + i3 + "_idusu1", str3);
        edit.putString("notif_" + i3 + "_idusu2", str4);
        if (i3 > 100) {
            StringBuilder sb = new StringBuilder();
            sb.append("notif_");
            int i4 = i3 - 100;
            sb.append(i4);
            sb.append("_fcrea");
            edit.remove(sb.toString());
            edit.remove("notif_" + i4 + "_title");
            edit.remove("notif_" + i4 + "_text");
            edit.remove("notif_" + i4 + "_intent");
            edit.remove("notif_" + i4 + "_numnotif");
            edit.remove("notif_" + i4 + "_leida");
            edit.remove("notif_" + i4 + "_tipo");
            edit.remove("notif_" + i4 + "_idusu1");
            edit.remove("notif_" + i4 + "_idusu2");
        }
        edit.commit();
        m8184e(context);
        return i3;
    }

    /* renamed from: C */
    public static Bitmap m8147C(Bitmap bitmap, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        if (i == 1) {
            i = 5;
        } else if (i == 2) {
            i = 10;
        } else if (i == 3) {
            i = 20;
        }
        float f = (float) i;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* renamed from: C0 */
    static void m8148C0(Context context, String str, String str2, String str3) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(true).setPositiveButton(context.getString(R.string.cerrar), (DialogInterface.OnClickListener) null).setMessage(str2);
        if (!str.equals("")) {
            builder.setTitle(str);
        }
        AlertDialog create = builder.create();
        if (!str3.equals("")) {
            create.setOnShowListener(new C1731r(create, str3));
        }
        try {
            create.show();
        } catch (Exception unused) {
        }
        try {
            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused2) {
        }
    }

    /* renamed from: E */
    static int m8149E(Context context, int i) {
        double d = (double) (((float) i) * context.getResources().getDisplayMetrics().density);
        Double.isNaN(d);
        return (int) (d + 0.5d);
    }

    @TargetApi(21)
    /* renamed from: F */
    public static void m8150F(EditText editText, Boolean bool, String str) {
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT >= 21 && str != null && !str.equals("") && !str.equals("#")) {
            if (bool.booleanValue()) {
                str2 = "FFFFFF";
                str3 = "FAFAFA";
            } else {
                str2 = "000000";
                str3 = "212121";
            }
            editText.setTextColor(Color.parseColor("#" + str2));
            int[][] iArr = {new int[]{16842908}, new int[]{-16842908}};
            editText.setBackgroundTintList(new ColorStateList(iArr, new int[]{Color.parseColor("#" + str), Color.parseColor("#" + str3)}));
        }
    }

    /* renamed from: G */
    static void m8151G(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("sh", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i = 0;
        for (int i2 = sharedPreferences.getInt("id_ultnotif", 0); i2 > 0; i2--) {
            edit.remove("notif_" + i2 + "_fcrea");
            edit.remove("notif_" + i2 + "_title");
            edit.remove("notif_" + i2 + "_text");
            edit.remove("notif_" + i2 + "_intent");
            edit.remove("notif_" + i2 + "_numnotif");
            edit.remove("notif_" + i2 + "_leida");
            edit.remove("notif_" + i2 + "_tipo");
            edit.remove("notif_" + i2 + "_idusu1");
            edit.remove("notif_" + i2 + "_idusu2");
            i++;
            if (i > 99) {
                break;
            }
        }
        edit.putInt("id_ultnotif", 0);
        edit.putInt("notif_noleidas", 0);
        edit.commit();
        m8184e(context);
    }

    /* renamed from: H */
    public static void m8152H(Context context, String str) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("sh", 0);
        int i = 0;
        while (!z && i < 100) {
            if (sharedPreferences.getString("privado" + i + "_id", "").equals(str)) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove("privado" + i + "_id");
                edit.commit();
                z = true;
            }
            i++;
        }
    }

    /* renamed from: I */
    static boolean m8153I(String str) {
        if (str.equals("") || str.equals("#")) {
            return true;
        }
        double red = (double) (Color.red(Color.parseColor(str)) * Color.red(Color.parseColor(str)));
        Double.isNaN(red);
        double green = (double) (Color.green(Color.parseColor(str)) * Color.green(Color.parseColor(str)));
        Double.isNaN(green);
        double d = (red * 0.241d) + (green * 0.691d);
        double blue = (double) (Color.blue(Color.parseColor(str)) * Color.blue(Color.parseColor(str)));
        Double.isNaN(blue);
        if (((int) Math.sqrt(d + (blue * 0.068d))) > 130) {
            return true;
        }
        return false;
    }

    /* renamed from: I0 */
    static void m8154I0(Context context) {
        int i;
        SharedPreferences sharedPreferences = context.getSharedPreferences("sh", 0);
        int i2 = sharedPreferences.getInt("ico_notif_ord", 0);
        int i3 = i2 == 1 ? R.id.ico_tv_1 : i2 == 2 ? R.id.ico_tv_2 : i2 == 3 ? R.id.ico_tv_3 : i2 == 4 ? R.id.ico_tv_4 : 0;
        if (i3 > 0) {
            try {
                TextView textView = (TextView) ((Activity) context).findViewById(i3);
                int i4 = sharedPreferences.getInt("notif_noleidas", 0);
                if (i4 > 99) {
                    i4 = 99;
                }
                if (i4 <= 0 || sharedPreferences.getInt("ico_notif_idsec", 0) != 0) {
                    textView.setVisibility(8);
                    return;
                }
                int E = m8149E(context, 3);
                if (i4 < 10) {
                    i = m8149E(context, 8);
                } else {
                    i = m8149E(context, 4);
                }
                textView.setPadding(i, E, i, E);
                textView.setText("" + i4);
                textView.setVisibility(0);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: J */
    static boolean m8155J(int i) {
        double red = (double) (Color.red(i) * Color.red(i));
        Double.isNaN(red);
        double green = (double) (Color.green(i) * Color.green(i));
        Double.isNaN(green);
        double d = (red * 0.241d) + (green * 0.691d);
        double blue = (double) (Color.blue(i) * Color.blue(i));
        Double.isNaN(blue);
        return ((int) Math.sqrt(d + (blue * 0.068d))) > 130;
    }

    /* renamed from: K */
    static boolean m8156K(String str) {
        if (str.equals("") || str.equals("#")) {
            return true;
        }
        double red = (double) (Color.red(Color.parseColor(str)) * Color.red(Color.parseColor(str)));
        Double.isNaN(red);
        double green = (double) (Color.green(Color.parseColor(str)) * Color.green(Color.parseColor(str)));
        Double.isNaN(green);
        double d = (red * 0.241d) + (green * 0.691d);
        double blue = (double) (Color.blue(Color.parseColor(str)) * Color.blue(Color.parseColor(str)));
        Double.isNaN(blue);
        if (((int) Math.sqrt(d + (blue * 0.068d))) > 200) {
            return true;
        }
        return false;
    }

    /* renamed from: K0 */
    static void m8157K0(Toast toast) {
        try {
            ((TextView) ((ViewGroup) toast.getView()).getChildAt(0)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused) {
        }
        toast.show();
    }

    /* renamed from: L */
    static boolean m8158L(String str) {
        if (str.equals("") || str.equals("#")) {
            return true;
        }
        double red = (double) (Color.red(Color.parseColor(str)) * Color.red(Color.parseColor(str)));
        Double.isNaN(red);
        double green = (double) (Color.green(Color.parseColor(str)) * Color.green(Color.parseColor(str)));
        Double.isNaN(green);
        double d = (red * 0.241d) + (green * 0.691d);
        double blue = (double) (Color.blue(Color.parseColor(str)) * Color.blue(Color.parseColor(str)));
        Double.isNaN(blue);
        if (((int) Math.sqrt(d + (blue * 0.068d))) < 60) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r60v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r59v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v93, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v54, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v104, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r59v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v36, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v59, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v107, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r59v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v109, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v64, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v65, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v112, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v51, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v68, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v113, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v69, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v55, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v114, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v72, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v56, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v57, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v116, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v117, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v75, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v118, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v48, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v83, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v76, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v77, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v78, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v119, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r60v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v120, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v85, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v121, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r60v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v122, resolved type: java.lang.Object} */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x06ea, code lost:
        if ((java.lang.System.currentTimeMillis() - r14.longValue()) < java.lang.Long.valueOf((long) (((r0.getInt("notif_int", 0) * 60) * 60) * 1000)).longValue()) goto L_0x06b0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x04fb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x09b2  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x09e7  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0c05  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0c07  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0c0e  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0c1c  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0c3d  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0c42  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0c5b  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0d10  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0d55  */
    /* JADX WARNING: Removed duplicated region for block: B:309:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0400  */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m8159L0(android.content.Context r68, java.lang.String r69) {
        /*
            r8 = r68
            java.lang.String r0 = "sh"
            r1 = 0
            android.content.SharedPreferences r0 = r8.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r3 = "\\\""
            java.lang.String r4 = "\""
            r5 = r69
            java.lang.String r3 = r5.replace(r3, r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L_0x0022
            r4 = 201326592(0xc000000, float:9.8607613E-32)
            r9 = 201326592(0xc000000, float:9.8607613E-32)
            goto L_0x0026
        L_0x0022:
            r4 = 134217728(0x8000000, float:3.85186E-34)
            r9 = 134217728(0x8000000, float:3.85186E-34)
        L_0x0026:
            java.lang.String r4 = "@"
            int r5 = r3.indexOf(r4)
            r6 = 1
            int r5 = r5 + r6
            int r7 = r3.indexOf(r4, r5)
            java.lang.String r5 = r3.substring(r5, r7)
            java.lang.String r7 = "PRIVADO"
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x0040
            goto L_0x0d76
        L_0x0040:
            java.lang.String r7 = "RESP:"
            boolean r10 = r5.startsWith(r7)
            java.lang.String r11 = "COMENT:"
            r13 = 4
            r14 = 6
            r15 = 5
            java.lang.String r6 = "1"
            java.lang.String r1 = "0"
            java.lang.String r12 = ""
            if (r10 == 0) goto L_0x00a9
            java.lang.String[] r3 = r3.split(r4)
            r4 = r3[r13]
            r10 = r3[r15]
            r18 = r3[r14]
            r17 = 7
            r3 = r3[r17]
            r13 = r1
            r22 = r3
            r32 = r4
            r24 = r9
            r50 = r10
            r4 = r12
            r9 = r4
            r10 = r9
            r14 = r10
            r15 = r14
            r21 = r15
            r23 = r21
            r25 = r23
            r26 = r25
            r27 = r26
            r28 = r27
            r29 = r28
            r30 = r29
            r31 = r30
            r33 = r31
            r35 = r33
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r48 = r39
            r49 = r48
            r51 = r49
            r52 = r51
            r53 = r52
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r61 = r59
            r60 = r18
            goto L_0x03ac
        L_0x00a9:
            boolean r10 = r5.startsWith(r11)
            java.lang.String r14 = "-"
            if (r10 == 0) goto L_0x0113
            java.lang.String[] r3 = r3.split(r4)
            r4 = r3[r13]
            r10 = r3[r15]
            r18 = 6
            r13 = r3[r18]
            java.lang.String[] r13 = r13.split(r14)
            r14 = 0
            r20 = r13[r14]
            r21 = 1
            r13 = r13[r21]
            r14 = 7
            r3 = r3[r14]
            r21 = r3
            r32 = r4
            r24 = r9
            r50 = r10
            r4 = r12
            r9 = r4
            r10 = r9
            r14 = r10
            r15 = r14
            r22 = r15
            r23 = r22
            r25 = r23
            r26 = r25
            r27 = r26
            r28 = r27
            r29 = r28
            r30 = r29
            r31 = r30
            r33 = r31
            r35 = r33
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r48 = r39
            r49 = r48
            r51 = r49
            r52 = r51
            r53 = r52
            r54 = r53
            r55 = r54
            r57 = r55
            r58 = r57
            r59 = r58
            r61 = r59
            r56 = r13
            r60 = r20
            r13 = r1
            goto L_0x03ac
        L_0x0113:
            r21 = 1
            int r10 = r3.indexOf(r14)
            int r10 = r10 + 1
            int r13 = r3.indexOf(r14, r10)
            java.lang.String r10 = r3.substring(r10, r13)
            int r13 = r13 + 1
            int r15 = r3.indexOf(r14, r13)
            java.lang.String r13 = r3.substring(r13, r15)
            int r15 = r15 + 1
            r22 = r10
            int r10 = r3.indexOf(r14, r15)
            java.lang.String r15 = r3.substring(r15, r10)
            int r10 = r10 + 1
            r23 = r13
            int r13 = r3.indexOf(r14, r10)
            java.lang.String r10 = r3.substring(r10, r13)
            int r13 = r13 + 1
            r24 = r10
            int r10 = r3.indexOf(r14, r13)
            java.lang.String r13 = r3.substring(r13, r10)
            int r10 = r10 + 1
            r25 = r13
            int r13 = r3.indexOf(r14, r10)
            java.lang.String r10 = r3.substring(r10, r13)
            int r13 = r13 + 1
            r26 = r10
            int r10 = r3.indexOf(r14, r13)
            java.lang.String r13 = r3.substring(r13, r10)
            int r10 = r10 + 1
            r27 = r13
            int r13 = r3.indexOf(r14, r10)
            java.lang.String r10 = r3.substring(r10, r13)
            int r13 = r13 + 1
            r28 = r10
            int r10 = r3.indexOf(r14, r13)
            java.lang.String r13 = r3.substring(r13, r10)
            int r10 = r10 + 1
            r29 = r13
            int r13 = r3.indexOf(r14, r10)
            java.lang.String r10 = r3.substring(r10, r13)
            int r13 = r13 + 1
            r30 = r10
            int r10 = r3.indexOf(r14, r13)
            java.lang.String r13 = r3.substring(r13, r10)
            int r10 = r10 + 1
            r31 = r13
            int r13 = r3.indexOf(r14, r10)
            java.lang.String r10 = r3.substring(r10, r13)
            int r13 = r13 + 1
            r32 = r10
            int r10 = r3.indexOf(r14, r13)
            java.lang.String r13 = r3.substring(r13, r10)
            int r10 = r10 + 1
            r33 = r13
            int r13 = r3.indexOf(r14, r10)
            java.lang.String r10 = r3.substring(r10, r13)
            int r13 = r13 + 1
            r34 = r10
            int r10 = r3.indexOf(r14, r13)
            java.lang.String r13 = r3.substring(r13, r10)
            int r10 = r10 + 1
            r35 = r13
            int r13 = r3.indexOf(r14, r10)
            java.lang.String r10 = r3.substring(r10, r13)
            int r13 = r13 + 1
            r36 = r10
            int r10 = r3.indexOf(r14, r13)
            java.lang.String r13 = r3.substring(r13, r10)
            int r10 = r10 + 1
            r37 = r13
            int r13 = r3.indexOf(r14, r10)
            java.lang.String r10 = r3.substring(r10, r13)
            int r13 = r13 + 1
            int r14 = r3.indexOf(r14, r13)
            java.lang.String r13 = r3.substring(r13, r14)
            int r14 = r3.indexOf(r4)
            int r14 = r14 + 1
            int r14 = r3.indexOf(r4, r14)
            int r14 = r14 + 1
            r21 = r10
            int r10 = r3.indexOf(r4, r14)
            java.lang.String r14 = r3.substring(r14, r10)
            r38 = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r39 = r15
            java.lang.String r15 = "ban_"
            r13.append(r15)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            boolean r13 = r0.contains(r13)
            if (r13 == 0) goto L_0x0229
            return
        L_0x0229:
            r13 = 1
            int r10 = r10 + r13
            int r15 = r3.indexOf(r4, r10)
            java.lang.String r10 = r3.substring(r10, r15)
            int r15 = r15 + r13
            int r13 = r3.indexOf(r4, r15)
            java.lang.String r15 = r3.substring(r15, r13)
            r40 = r10
            java.lang.String r10 = "\\'"
            r41 = r14
            java.lang.String r14 = "'"
            java.lang.String r10 = r15.replace(r10, r14)
            r14 = 1
            int r13 = r13 + r14
            int r15 = r3.indexOf(r4, r13)
            java.lang.String r13 = r3.substring(r13, r15)
            int r15 = r15 + r14
            r42 = r10
            int r10 = r3.indexOf(r4, r15)
            java.lang.String r15 = r3.substring(r15, r10)
            int r10 = r10 + r14
            int r14 = r3.indexOf(r4, r10)
            java.lang.String r10 = r3.substring(r10, r14)
            r43 = 1
            int r14 = r14 + 1
            r44 = r10
            int r10 = r3.indexOf(r4, r14)     // Catch:{ Exception -> 0x0363 }
            java.lang.String r14 = r3.substring(r14, r10)     // Catch:{ Exception -> 0x0363 }
            int r10 = r10 + 1
            r43 = r13
            int r13 = r3.indexOf(r4, r10)     // Catch:{ Exception -> 0x035c }
            java.lang.String r10 = r3.substring(r10, r13)     // Catch:{ Exception -> 0x035c }
            boolean r45 = r10.equals(r6)     // Catch:{ Exception -> 0x0359 }
            if (r45 == 0) goto L_0x02ba
            r45 = 1
            int r13 = r13 + 1
            r46 = r14
            int r14 = r3.indexOf(r4, r13)     // Catch:{ Exception -> 0x035f }
            java.lang.String r13 = r3.substring(r13, r14)     // Catch:{ Exception -> 0x035f }
            int r14 = r14 + 1
            r47 = r13
            int r13 = r3.indexOf(r4, r14)     // Catch:{ Exception -> 0x02b4 }
            java.lang.String r14 = r3.substring(r14, r13)     // Catch:{ Exception -> 0x02b4 }
            int r13 = r13 + 1
            int r4 = r3.indexOf(r4, r13)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r3 = r3.substring(r13, r4)     // Catch:{ Exception -> 0x02b2 }
            r4 = r12
            r45 = r14
            r13 = r47
            r14 = r4
            goto L_0x0316
        L_0x02b2:
            r3 = r12
            goto L_0x02b6
        L_0x02b4:
            r3 = r12
            r14 = r3
        L_0x02b6:
            r13 = r47
            goto L_0x036b
        L_0x02ba:
            r46 = r14
            java.lang.String r14 = "2"
            boolean r14 = r10.equals(r14)     // Catch:{ Exception -> 0x035f }
            if (r14 == 0) goto L_0x02e5
            r14 = 1
            int r13 = r13 + r14
            int r14 = r3.indexOf(r4, r13)     // Catch:{ Exception -> 0x035f }
            java.lang.String r13 = r3.substring(r13, r14)     // Catch:{ Exception -> 0x035f }
            r45 = 1
            int r14 = r14 + 1
            int r4 = r3.indexOf(r4, r14)     // Catch:{ Exception -> 0x02e0 }
            java.lang.String r3 = r3.substring(r14, r4)     // Catch:{ Exception -> 0x02e0 }
            r4 = r12
            r14 = r4
            r45 = r13
            r13 = r14
            goto L_0x0316
        L_0x02e0:
            r3 = r12
            r14 = r13
            r13 = r3
            goto L_0x036b
        L_0x02e5:
            java.lang.String r14 = "3"
            boolean r14 = r10.equals(r14)     // Catch:{ Exception -> 0x035f }
            if (r14 == 0) goto L_0x0310
            r14 = 1
            int r13 = r13 + r14
            int r14 = r3.indexOf(r4, r13)     // Catch:{ Exception -> 0x035f }
            java.lang.String r13 = r3.substring(r13, r14)     // Catch:{ Exception -> 0x035f }
            r45 = 1
            int r14 = r14 + 1
            int r4 = r3.indexOf(r4, r14)     // Catch:{ Exception -> 0x030b }
            java.lang.String r3 = r3.substring(r14, r4)     // Catch:{ Exception -> 0x030b }
            r4 = r3
            r3 = r12
            r45 = r3
            r14 = r13
            r13 = r45
            goto L_0x0316
        L_0x030b:
            r14 = r12
            r3 = r13
            r13 = r14
            goto L_0x036b
        L_0x0310:
            r3 = r12
            r4 = r3
            r13 = r4
            r14 = r13
            r45 = r14
        L_0x0316:
            r50 = r12
            r56 = r50
            r60 = r56
            r57 = r13
            r59 = r14
            r49 = r21
            r55 = r25
            r58 = r27
            r51 = r28
            r53 = r29
            r28 = r30
            r54 = r31
            r25 = r32
            r52 = r33
            r48 = r34
            r33 = r40
            r14 = r41
            r29 = r44
            r61 = r45
            r30 = r3
            r13 = r10
            r21 = r60
            r32 = r15
            r31 = r23
            r27 = r26
            r10 = r43
            r15 = r46
            r23 = r4
            r26 = r24
            r4 = r42
            r24 = r9
            r9 = r22
            r22 = r21
            goto L_0x03ac
        L_0x0359:
            r46 = r14
            goto L_0x035f
        L_0x035c:
            r46 = r14
            r10 = r1
        L_0x035f:
            r3 = r12
            r13 = r3
            r14 = r13
            goto L_0x036b
        L_0x0363:
            r43 = r13
            r10 = r1
            r3 = r12
            r13 = r3
            r14 = r13
            r46 = r14
        L_0x036b:
            r59 = r3
            r50 = r12
            r56 = r50
            r60 = r56
            r57 = r13
            r61 = r14
            r49 = r21
            r55 = r25
            r58 = r27
            r51 = r28
            r53 = r29
            r28 = r30
            r54 = r31
            r25 = r32
            r52 = r33
            r48 = r34
            r33 = r40
            r14 = r41
            r4 = r42
            r29 = r44
            r13 = r10
            r21 = r60
            r30 = r21
            r32 = r15
            r31 = r23
            r27 = r26
            r10 = r43
            r15 = r46
            r23 = r30
            r26 = r24
            r24 = r9
            r9 = r22
            r22 = r23
        L_0x03ac:
            java.lang.String r3 = "COMSELF:"
            boolean r3 = r5.startsWith(r3)
            java.lang.String r8 = "notification"
            r40 = r8
            java.lang.String r8 = "COMSELFV:"
            r41 = r6
            java.lang.String r6 = "privados"
            r42 = r6
            java.lang.String r6 = "avisos"
            r44 = r6
            java.lang.String r6 = " "
            if (r3 != 0) goto L_0x09b2
            boolean r3 = r5.startsWith(r8)
            if (r3 != 0) goto L_0x09b2
            java.lang.String r3 = "COMFAV:"
            boolean r3 = r5.startsWith(r3)
            if (r3 != 0) goto L_0x09b2
            java.lang.String r3 = "FGALFAV:"
            boolean r3 = r5.startsWith(r3)
            if (r3 != 0) goto L_0x09b2
            java.lang.String r3 = "FGALVFAV:"
            boolean r3 = r5.startsWith(r3)
            if (r3 != 0) goto L_0x09b2
            java.lang.String r3 = "FPERFAV:"
            boolean r3 = r5.startsWith(r3)
            if (r3 != 0) goto L_0x09b2
            java.lang.String r3 = "DESCRFAV:"
            boolean r3 = r5.startsWith(r3)
            if (r3 != 0) goto L_0x09b2
            boolean r3 = r5.startsWith(r7)
            if (r3 != 0) goto L_0x09b2
            boolean r3 = r5.startsWith(r11)
            if (r3 != 0) goto L_0x09b2
            java.lang.String r3 = "BEAT:"
            boolean r3 = r5.startsWith(r3)
            if (r3 == 0) goto L_0x0436
            r12 = r68
            r10 = r6
            r15 = r14
            r67 = r24
            r63 = r25
            r64 = r29
            r66 = r30
            r1 = r31
            r65 = r32
            r2 = r40
            r4 = r42
            r6 = r44
            r25 = r49
            r13 = r52
            r16 = r53
            r62 = r54
            r24 = r55
            r17 = r61
            r9 = 0
            r29 = 7
            r14 = r5
            r30 = r28
            r5 = r33
            r28 = r48
            goto L_0x09e0
        L_0x0436:
            boolean r3 = r4.equals(r12)
            if (r3 == 0) goto L_0x0449
            boolean r3 = r15.equals(r12)
            if (r3 == 0) goto L_0x0449
            boolean r3 = r13.equals(r1)
            if (r3 == 0) goto L_0x0449
            return
        L_0x0449:
            boolean r3 = r14.equals(r1)
            r7 = 0
            if (r3 != 0) goto L_0x0477
            boolean r3 = r14.equals(r12)
            if (r3 != 0) goto L_0x0477
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r11 = "idusu"
            r45 = r5
            r46 = r6
            long r5 = r0.getLong(r11, r7)
            r3.append(r5)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            boolean r3 = r14.equals(r3)
            if (r3 == 0) goto L_0x047b
            return
        L_0x0477:
            r45 = r5
            r46 = r6
        L_0x047b:
            boolean r3 = r14.equals(r1)
            if (r3 != 0) goto L_0x0540
            boolean r3 = r14.equals(r12)
            if (r3 != 0) goto L_0x0540
            boolean r3 = r4.equals(r12)
            if (r3 == 0) goto L_0x048f
            r3 = r15
            goto L_0x0490
        L_0x048f:
            r3 = r4
        L_0x0490:
            boolean r5 = r3.equals(r12)
            if (r5 == 0) goto L_0x0498
            r3 = r57
        L_0x0498:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r10)
            java.lang.String r6 = "_idremit_ult"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r0.getString(r5, r12)
            boolean r5 = r5.equals(r14)
            if (r5 == 0) goto L_0x04f6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r10)
            java.lang.String r6 = "_mensaje_ult"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r0.getString(r5, r12)
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x04f6
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            java.lang.String r7 = "_f_ult"
            r11.append(r7)
            java.lang.String r7 = r11.toString()
            r47 = r12
            long r11 = java.lang.System.currentTimeMillis()
            long r7 = r0.getLong(r7, r11)
            long r5 = r5 - r7
            r7 = 30000(0x7530, double:1.4822E-319)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x04f8
            r5 = 1
            goto L_0x04f9
        L_0x04f6:
            r47 = r12
        L_0x04f8:
            r5 = 0
        L_0x04f9:
            if (r5 == 0) goto L_0x04fc
            return
        L_0x04fc:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r10)
            java.lang.String r6 = "_f_ult"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            long r6 = java.lang.System.currentTimeMillis()
            r2.putLong(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r10)
            java.lang.String r6 = "_idremit_ult"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r2.putString(r5, r14)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r10)
            java.lang.String r6 = "_mensaje_ult"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r2.putString(r5, r3)
            r2.commit()
            goto L_0x0542
        L_0x0540:
            r47 = r12
        L_0x0542:
            r3 = r41
            boolean r5 = r9.equals(r3)
            if (r5 == 0) goto L_0x0558
            r6 = 2131821056(0x7f110200, float:1.9274844E38)
            r12 = r68
            r5 = r33
            m8187g(r12, r14, r5)
            r11 = r32
            r7 = 1
            goto L_0x0592
        L_0x0558:
            r6 = 2131821056(0x7f110200, float:1.9274844E38)
            r12 = r68
            r5 = r33
            java.lang.String r7 = "idprivado"
            java.lang.String r7 = r0.getString(r7, r1)
            boolean r7 = r7.equals(r1)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "chat"
            r8.append(r11)
            r11 = r32
            r8.append(r11)
            java.lang.String r6 = "_validado"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r8 = 1
            boolean r6 = r0.getBoolean(r6, r8)
            if (r6 == 0) goto L_0x09b1
            java.lang.String r6 = "pwd_validado"
            boolean r6 = r0.getBoolean(r6, r8)
            if (r6 != 0) goto L_0x0592
            goto L_0x09b1
        L_0x0592:
            if (r7 != 0) goto L_0x0595
            return
        L_0x0595:
            boolean r6 = r9.equals(r1)
            java.lang.String r7 = "activa"
            if (r6 != 0) goto L_0x05bd
            boolean r6 = r9.equals(r3)
            if (r6 == 0) goto L_0x05b7
            r6 = 0
            boolean r8 = r0.getBoolean(r7, r6)
            if (r8 == 0) goto L_0x05b7
            java.lang.String r6 = "idprivado"
            java.lang.String r6 = r0.getString(r6, r1)
            boolean r6 = r6.equals(r14)
            if (r6 == 0) goto L_0x05b7
            goto L_0x05bd
        L_0x05b7:
            r25 = r14
            r8 = r47
            goto L_0x0656
        L_0x05bd:
            java.lang.String r6 = "f2_idfrase"
            r8 = r45
            r2.putString(r6, r8)
            java.lang.String r6 = "f2_id"
            r2.putString(r6, r14)
            java.lang.String r6 = "f2_nombre"
            r2.putString(r6, r5)
            java.lang.String r6 = "f2_privados"
            r8 = r31
            r2.putString(r6, r8)
            java.lang.String r6 = "f2_frase"
            r2.putString(r6, r4)
            java.lang.String r6 = m8200u(r39)
            java.lang.String r8 = "f2_fcrea"
            r2.putString(r8, r6)
            java.lang.String r6 = "f2_b64"
            r2.putString(r6, r15)
            java.lang.String r6 = "f2_tipo"
            r2.putString(r6, r13)
            java.lang.String r6 = "f2_b64_th"
            r8 = r57
            r2.putString(r6, r8)
            java.lang.String r6 = "f2_idvideo"
            r15 = r61
            r2.putString(r6, r15)
            java.lang.String r6 = "f2_formato"
            r8 = r30
            r2.putString(r6, r8)
            java.lang.String r6 = "f2_idtema"
            r2.putString(r6, r10)
            java.lang.String r6 = "f2_vfoto"
            r8 = r29
            r2.putString(r6, r8)
            java.lang.String r6 = "f2_fnac_d"
            r8 = r53
            r2.putString(r6, r8)
            java.lang.String r6 = "f2_fnac_m"
            r8 = r28
            r2.putString(r6, r8)
            java.lang.String r6 = "f2_fnac_a"
            r8 = r54
            r2.putString(r6, r8)
            java.lang.String r6 = "f2_sexo"
            r8 = r25
            r2.putString(r6, r8)
            java.lang.String r6 = "f2_coments"
            r8 = r52
            r2.putString(r6, r8)
            java.lang.String r6 = "f2_ultimas"
            r8 = 0
            r2.putBoolean(r6, r8)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r25 = r14
            long r14 = java.lang.System.currentTimeMillis()
            r6.append(r14)
            r8 = r47
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r14 = "f2_ts"
            r2.putString(r14, r6)
            r2.commit()
        L_0x0656:
            boolean r6 = r9.equals(r1)
            if (r6 == 0) goto L_0x0861
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            r14 = 0
            boolean r6 = r0.getBoolean(r6, r14)
            if (r6 != 0) goto L_0x0861
            r6 = r44
            int r15 = r0.getInt(r6, r14)
            r14 = 2
            if (r15 >= r14) goto L_0x0861
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "s"
            r7.append(r9)
            r7.append(r11)
            java.lang.String r9 = "_tipo"
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r9 = 0
            int r7 = r0.getInt(r7, r9)
            if (r7 == 0) goto L_0x06a1
            r14 = 6
            if (r7 == r14) goto L_0x06a1
            r14 = 7
            if (r7 != r14) goto L_0x069f
            goto L_0x06a1
        L_0x069f:
            r7 = 1
            goto L_0x06a2
        L_0x06a1:
            r7 = 0
        L_0x06a2:
            if (r7 == 0) goto L_0x06ed
            java.lang.String r14 = "notif_int"
            int r14 = r0.getInt(r14, r9)
            r15 = 9999(0x270f, float:1.4012E-41)
            if (r14 != r15) goto L_0x06b2
            r17 = r10
        L_0x06b0:
            r7 = 0
            goto L_0x06ef
        L_0x06b2:
            java.lang.String r14 = "f_ult_notif"
            r17 = r10
            r9 = 0
            long r14 = r0.getLong(r14, r9)
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            long r18 = r14.longValue()
            int r15 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1))
            if (r15 <= 0) goto L_0x06ef
            java.lang.String r9 = "notif_int"
            r10 = 0
            int r9 = r0.getInt(r9, r10)
            int r9 = r9 * 60
            int r9 = r9 * 60
            int r9 = r9 * 1000
            long r9 = (long) r9
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            long r18 = java.lang.System.currentTimeMillis()
            long r14 = r14.longValue()
            long r18 = r18 - r14
            long r9 = r9.longValue()
            int r14 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1))
            if (r14 >= 0) goto L_0x06ef
            goto L_0x06b0
        L_0x06ed:
            r17 = r10
        L_0x06ef:
            if (r7 == 0) goto L_0x0d76
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = "f_ult_notif"
            r2.putLong(r7, r9)
            r2.commit()
            r2 = r40
            java.lang.Object r2 = r12.getSystemService(r2)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            boolean r7 = r4.equals(r8)
            if (r7 != 0) goto L_0x0731
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r10 = r46
            r1.append(r10)
            android.content.res.Resources r5 = r68.getResources()
            r7 = 2131820770(0x7f1100e2, float:1.9274264E38)
            java.lang.String r5 = r5.getString(r7)
            r1.append(r5)
            java.lang.String r5 = ":"
            r1.append(r5)
            java.lang.String r1 = r1.toString()
        L_0x072f:
            r5 = 1
            goto L_0x0791
        L_0x0731:
            r10 = r46
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x0762
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r10)
            android.content.res.Resources r4 = r68.getResources()
            r5 = 2131820785(0x7f1100f1, float:1.9274295E38)
            java.lang.String r4 = r4.getString(r5)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.content.res.Resources r4 = r68.getResources()
            r5 = 2131821056(0x7f110200, float:1.9274844E38)
            java.lang.String r4 = r4.getString(r5)
            goto L_0x072f
        L_0x0762:
            boolean r1 = r13.equals(r3)
            if (r1 == 0) goto L_0x0860
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r10)
            android.content.res.Resources r4 = r68.getResources()
            r5 = 2131820786(0x7f1100f2, float:1.9274297E38)
            java.lang.String r4 = r4.getString(r5)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.content.res.Resources r4 = r68.getResources()
            r5 = 2131821057(0x7f110201, float:1.9274846E38)
            java.lang.String r4 = r4.getString(r5)
            goto L_0x072f
        L_0x0791:
            int r0 = r0.getInt(r6, r5)
            if (r0 != 0) goto L_0x0799
            r0 = 1
            goto L_0x079a
        L_0x0799:
            r0 = 0
        L_0x079a:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r5 < r6) goto L_0x07ae
            a0.i$e r5 = new a0.i$e
            android.app.NotificationChannel r6 = m8206y(r12, r0)
            java.lang.String r6 = r6.getId()
            r5.<init>(r12, r6)
            goto L_0x07b3
        L_0x07ae:
            a0.i$e r5 = new a0.i$e
            r5.<init>(r12)
        L_0x07b3:
            r6 = 2131231398(0x7f0802a6, float:1.8078876E38)
            a0.i$e r6 = r5.mo63B(r6)
            a0.i$e r1 = r6.mo85q(r1)
            a0.i$e r1 = r1.mo84p(r4)
            r4 = 1
            r1.mo78j(r4)
            android.graphics.Bitmap r1 = m8196p0(r68)
            if (r1 == 0) goto L_0x07cf
            r5.mo89v(r1)
        L_0x07cf:
            if (r0 != r4) goto L_0x07d5
            r0 = 5
            r5.mo86r(r0)
        L_0x07d5:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<british.x.preinicio> r1 = british.p015x.preinicio.class
            r0.<init>(r12, r1)
            java.lang.String r1 = "notif_idtema"
            r4 = r17
            r0.putExtra(r1, r4)
            java.lang.String r1 = "notif_idsecc"
            r0.putExtra(r1, r11)
            int r1 = java.lang.Integer.parseInt(r26)
            java.lang.String r4 = "fotos_perfil"
            r0.putExtra(r4, r1)
            int r1 = java.lang.Integer.parseInt(r35)
            java.lang.String r4 = "fnac"
            r0.putExtra(r4, r1)
            int r1 = java.lang.Integer.parseInt(r36)
            java.lang.String r4 = "sexo"
            r0.putExtra(r4, r1)
            int r1 = java.lang.Integer.parseInt(r37)
            java.lang.String r4 = "descr"
            r0.putExtra(r4, r1)
            int r1 = java.lang.Integer.parseInt(r38)
            java.lang.String r4 = "dist"
            r0.putExtra(r4, r1)
            r1 = r55
            boolean r1 = r1.equals(r3)
            r4 = r42
            r0.putExtra(r4, r1)
            r9 = r48
            boolean r1 = r9.equals(r3)
            java.lang.String r4 = "coments"
            r0.putExtra(r4, r1)
            r13 = r49
            boolean r1 = r13.equals(r3)
            java.lang.String r3 = "galeria"
            r0.putExtra(r3, r1)
            int r1 = java.lang.Integer.parseInt(r27)
            java.lang.String r3 = "fotos_chat"
            r0.putExtra(r3, r1)
            java.lang.String r1 = "c1"
            r3 = r58
            r0.putExtra(r1, r3)
            java.lang.String r1 = "c2"
            r3 = r51
            r0.putExtra(r1, r3)
            r8 = r24
            r6 = 1
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r12, r6, r0, r8)
            r5.mo83o(r0)
            android.app.Notification r0 = r5.mo73c()
            r2.notify(r6, r0)
            goto L_0x0d76
        L_0x0860:
            return
        L_0x0861:
            r8 = r24
            r2 = r40
            r4 = r42
            r10 = r46
            r6 = 1
            boolean r11 = r9.equals(r3)
            if (r11 == 0) goto L_0x08ce
            int r11 = r0.getInt(r4, r6)
            if (r11 != r6) goto L_0x08ce
            r6 = 0
            boolean r11 = r0.getBoolean(r7, r6)
            if (r11 == 0) goto L_0x08ce
            java.lang.String r6 = "idprivado"
            java.lang.String r6 = r0.getString(r6, r1)
            r11 = r25
            boolean r6 = r6.equals(r11)
            if (r6 != 0) goto L_0x08d0
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "f_ult_"
            r3.append(r4)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r6 = 0
            long r3 = r0.getLong(r3, r6)
            long r1 = r1 - r3
            r3 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0d76
            java.lang.String r0 = "accion"
            r1 = 0
            android.content.SharedPreferences r0 = r12.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "accion"
            r2 = 1
            r0.putInt(r1, r2)
            java.lang.String r1 = "id_remit"
            r0.putString(r1, r11)
            java.lang.String r1 = "nombre_remit"
            r0.putString(r1, r5)
            r0.commit()
            goto L_0x0d76
        L_0x08ce:
            r11 = r25
        L_0x08d0:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0d76
            r3 = 1
            int r4 = r0.getInt(r4, r3)
            if (r4 != r3) goto L_0x0d76
            r3 = 0
            boolean r3 = r0.getBoolean(r7, r3)
            if (r3 != 0) goto L_0x0d76
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "f_ult_"
            r6.append(r7)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            r13 = 0
            long r6 = r0.getLong(r6, r13)
            long r3 = r3 - r6
            r6 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0d76
            java.lang.Object r0 = r12.getSystemService(r2)
            r9 = r0
            android.app.NotificationManager r9 = (android.app.NotificationManager) r9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r10)
            android.content.res.Resources r2 = r68.getResources()
            r3 = 2131821067(0x7f11020b, float:1.9274867E38)
            java.lang.String r2 = r2.getString(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r0 < r3) goto L_0x0940
            a0.i$e r0 = new a0.i$e
            r3 = 1
            android.app.NotificationChannel r4 = m8206y(r12, r3)
            java.lang.String r3 = r4.getId()
            r0.<init>(r12, r3)
            goto L_0x0945
        L_0x0940:
            a0.i$e r0 = new a0.i$e
            r0.<init>(r12)
        L_0x0945:
            r10 = r0
            r0 = 2131231398(0x7f0802a6, float:1.8078876E38)
            a0.i$e r0 = r10.mo63B(r0)
            android.content.res.Resources r3 = r68.getResources()
            r4 = 2131821085(0x7f11021d, float:1.9274903E38)
            java.lang.String r3 = r3.getString(r4)
            a0.i$e r0 = r0.mo85q(r3)
            a0.i$e r0 = r0.mo84p(r2)
            r3 = 1
            r0.mo78j(r3)
            android.graphics.Bitmap r0 = m8196p0(r68)
            if (r0 == 0) goto L_0x096d
            r10.mo89v(r0)
        L_0x096d:
            r0 = 5
            r10.mo86r(r0)
            android.content.Intent r13 = new android.content.Intent
            java.lang.Class<british.x.preinicio> r0 = british.p015x.preinicio.class
            r13.<init>(r12, r0)
            java.lang.String r0 = "id_remit"
            r13.putExtra(r0, r11)
            java.lang.String r0 = "nombre_remit"
            r13.putExtra(r0, r5)
            r0 = 2
            boolean r0 = m8165R(r12, r0, r11, r1)
            if (r0 != 0) goto L_0x099f
            android.content.res.Resources r0 = r68.getResources()
            r1 = 2131821085(0x7f11021d, float:1.9274903E38)
            java.lang.String r1 = r0.getString(r1)
            r4 = 3
            r5 = 2
            java.lang.String r7 = "0"
            r0 = r68
            r3 = r13
            r6 = r11
            m8146A(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x099f:
            r0 = 3
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r12, r0, r13, r8)
            r10.mo83o(r0)
            r0 = 3
            android.app.Notification r1 = r10.mo73c()
            r9.notify(r0, r1)
            goto L_0x0d76
        L_0x09b1:
            return
        L_0x09b2:
            r12 = r68
            r10 = r6
            r15 = r14
            r67 = r24
            r63 = r25
            r9 = r28
            r64 = r29
            r66 = r30
            r1 = r31
            r65 = r32
            r2 = r40
            r4 = r42
            r6 = r44
            r28 = r48
            r25 = r49
            r13 = r52
            r62 = r54
            r24 = r55
            r17 = r61
            r29 = 7
            r14 = r5
            r5 = r33
            r30 = r9
            r16 = r53
            r9 = 0
        L_0x09e0:
            int r3 = r0.getInt(r6, r9)
            r9 = 2
            if (r3 >= r9) goto L_0x0d76
            java.lang.String r3 = ":"
            java.lang.String[] r3 = r14.split(r3)
            r33 = r13
            r32 = 1
            r13 = r3[r32]
            r3 = r3[r9]
            java.lang.Object r2 = r12.getSystemService(r2)
            r9 = r2
            android.app.NotificationManager r9 = (android.app.NotificationManager) r9
            java.lang.String r2 = "COMFAV:"
            boolean r2 = r14.startsWith(r2)
            if (r2 == 0) goto L_0x0a32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r10)
            android.content.res.Resources r13 = r68.getResources()
            r32 = r3
            r3 = 2131820883(0x7f110153, float:1.9274494E38)
            java.lang.String r3 = r13.getString(r3)
            r2.append(r3)
            r2.append(r10)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r18 = r9
            r3 = r32
            r9 = 1
            r10 = 4
        L_0x0a2f:
            r13 = 5
            goto L_0x0bff
        L_0x0a32:
            r32 = r3
            java.lang.String r2 = "FGALFAV:"
            boolean r2 = r14.startsWith(r2)
            if (r2 == 0) goto L_0x0a69
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r10)
            android.content.res.Resources r3 = r68.getResources()
            r10 = 2131820879(0x7f11014f, float:1.9274485E38)
            java.lang.String r3 = r3.getString(r10)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.content.res.Resources r3 = r68.getResources()
            r10 = 2131821056(0x7f110200, float:1.9274844E38)
            java.lang.String r3 = r3.getString(r10)
            r18 = r9
            r9 = 1
            r10 = 5
            goto L_0x0a2f
        L_0x0a69:
            java.lang.String r2 = "FGALVFAV:"
            boolean r2 = r14.startsWith(r2)
            if (r2 == 0) goto L_0x0a9f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r10)
            android.content.res.Resources r3 = r68.getResources()
            r10 = 2131820880(0x7f110150, float:1.9274487E38)
            java.lang.String r3 = r3.getString(r10)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.content.res.Resources r3 = r68.getResources()
            r10 = 2131821057(0x7f110201, float:1.9274846E38)
            java.lang.String r3 = r3.getString(r10)
            r10 = 10
            r18 = r9
            r9 = 1
            goto L_0x0a2f
        L_0x0a9f:
            java.lang.String r2 = "FPERFAV:"
            boolean r2 = r14.startsWith(r2)
            if (r2 == 0) goto L_0x0ad5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r10)
            android.content.res.Resources r3 = r68.getResources()
            r10 = 2131820887(0x7f110157, float:1.9274502E38)
            java.lang.String r3 = r3.getString(r10)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.content.res.Resources r3 = r68.getResources()
            r10 = 2131821056(0x7f110200, float:1.9274844E38)
            java.lang.String r3 = r3.getString(r10)
            r18 = r9
            r9 = 1
            r10 = 6
            goto L_0x0a2f
        L_0x0ad5:
            java.lang.String r2 = "DESCRFAV:"
            boolean r2 = r14.startsWith(r2)
            if (r2 == 0) goto L_0x0b02
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r10)
            android.content.res.Resources r3 = r68.getResources()
            r10 = 2131820886(0x7f110156, float:1.92745E38)
            java.lang.String r3 = r3.getString(r10)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r18 = r9
            r3 = r32
            r9 = 1
            r10 = 7
            goto L_0x0a2f
        L_0x0b02:
            boolean r2 = r14.startsWith(r8)
            if (r2 == 0) goto L_0x0b31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r10)
            android.content.res.Resources r3 = r68.getResources()
            r10 = 2131820882(0x7f110152, float:1.9274491E38)
            java.lang.String r3 = r3.getString(r10)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 9
            r18 = r9
            r3 = r32
            r9 = 1
            r10 = 9
        L_0x0b2e:
            r13 = 4
            goto L_0x0bff
        L_0x0b31:
            boolean r2 = r14.startsWith(r7)
            if (r2 == 0) goto L_0x0b67
            android.content.res.Resources r2 = r68.getResources()
            r3 = 2131821003(0x7f1101cb, float:1.9274737E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            r3.append(r10)
            android.content.res.Resources r10 = r68.getResources()
            r13 = 2131820884(0x7f110154, float:1.9274496E38)
            java.lang.String r10 = r10.getString(r13)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            r10 = 11
        L_0x0b61:
            r18 = r9
            r9 = 1
            r13 = 6
            goto L_0x0bff
        L_0x0b67:
            boolean r2 = r14.startsWith(r11)
            if (r2 == 0) goto L_0x0b98
            android.content.res.Resources r2 = r68.getResources()
            r3 = 2131821005(0x7f1101cd, float:1.927474E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            r3.append(r10)
            android.content.res.Resources r10 = r68.getResources()
            r13 = 2131820885(0x7f110155, float:1.9274498E38)
            java.lang.String r10 = r10.getString(r13)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            r10 = 12
            goto L_0x0b61
        L_0x0b98:
            java.lang.String r2 = "BEAT:"
            boolean r2 = r14.startsWith(r2)
            if (r2 == 0) goto L_0x0bd7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r10)
            android.content.res.Resources r3 = r68.getResources()
            r13 = 2131820888(0x7f110158, float:1.9274504E38)
            java.lang.String r3 = r3.getString(r13)
            r2.append(r3)
            r2.append(r10)
            r3 = r23
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.content.res.Resources r3 = r68.getResources()
            r10 = 2131821060(0x7f110204, float:1.9274853E38)
            java.lang.String r3 = r3.getString(r10)
            r10 = 13
            r18 = r9
            r9 = 1
            r13 = 7
            goto L_0x0bff
        L_0x0bd7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r10)
            android.content.res.Resources r3 = r68.getResources()
            r10 = 2131820881(0x7f110151, float:1.927449E38)
            java.lang.String r3 = r3.getString(r10)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 8
            r18 = r9
            r3 = r32
            r9 = 1
            r10 = 8
            goto L_0x0b2e
        L_0x0bff:
            int r0 = r0.getInt(r6, r9)
            if (r0 != 0) goto L_0x0c07
            r0 = 1
            goto L_0x0c08
        L_0x0c07:
            r0 = 0
        L_0x0c08:
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            if (r6 < r9) goto L_0x0c1c
            a0.i$e r6 = new a0.i$e
            android.app.NotificationChannel r9 = m8206y(r12, r0)
            java.lang.String r9 = r9.getId()
            r6.<init>(r12, r9)
            goto L_0x0c21
        L_0x0c1c:
            a0.i$e r6 = new a0.i$e
            r6.<init>(r12)
        L_0x0c21:
            r9 = r6
            r6 = 2131231398(0x7f0802a6, float:1.8078876E38)
            a0.i$e r6 = r9.mo63B(r6)
            a0.i$e r6 = r6.mo85q(r2)
            a0.i$e r6 = r6.mo84p(r3)
            r19 = r13
            r13 = 1
            r6.mo78j(r13)
            android.graphics.Bitmap r6 = m8196p0(r68)
            if (r6 == 0) goto L_0x0c40
            r9.mo89v(r6)
        L_0x0c40:
            if (r0 != r13) goto L_0x0c46
            r0 = 5
            r9.mo86r(r0)
        L_0x0c46:
            android.content.Intent r13 = new android.content.Intent
            java.lang.Class<british.x.preinicio> r0 = british.p015x.preinicio.class
            r13.<init>(r12, r0)
            boolean r0 = r14.startsWith(r7)
            if (r0 != 0) goto L_0x0d10
            boolean r0 = r14.startsWith(r11)
            if (r0 == 0) goto L_0x0c5b
            goto L_0x0d10
        L_0x0c5b:
            java.lang.String r0 = "abrir_perfil"
            r13.putExtra(r0, r15)
            r13.putExtra(r4, r1)
            java.lang.String r0 = "nombre"
            r13.putExtra(r0, r5)
            java.lang.String r0 = "coments"
            r1 = r33
            r13.putExtra(r0, r1)
            java.lang.String r0 = "fnac_d"
            r1 = r16
            r13.putExtra(r0, r1)
            java.lang.String r0 = "fnac_m"
            r1 = r30
            r13.putExtra(r0, r1)
            java.lang.String r0 = "fnac_a"
            r1 = r62
            r13.putExtra(r0, r1)
            java.lang.String r0 = "sexo"
            r1 = r63
            r13.putExtra(r0, r1)
            java.lang.String r0 = "vfoto"
            r1 = r64
            r13.putExtra(r0, r1)
            int r0 = java.lang.Integer.parseInt(r35)
            java.lang.String r1 = "p_fnac"
            r13.putExtra(r1, r0)
            int r0 = java.lang.Integer.parseInt(r36)
            java.lang.String r1 = "p_sexo"
            r13.putExtra(r1, r0)
            int r0 = java.lang.Integer.parseInt(r37)
            java.lang.String r1 = "p_descr"
            r13.putExtra(r1, r0)
            int r0 = java.lang.Integer.parseInt(r38)
            java.lang.String r1 = "p_dist"
            r13.putExtra(r1, r0)
            r0 = r28
            r1 = r41
            boolean r0 = r0.equals(r1)
            java.lang.String r4 = "coments_chat"
            r13.putExtra(r4, r0)
            r0 = r25
            boolean r0 = r0.equals(r1)
            java.lang.String r4 = "galeria"
            r13.putExtra(r4, r0)
            r0 = r24
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = "privados_chat"
            r13.putExtra(r1, r0)
            int r0 = java.lang.Integer.parseInt(r26)
            java.lang.String r1 = "fotos_perfil"
            r13.putExtra(r1, r0)
            int r0 = java.lang.Integer.parseInt(r27)
            java.lang.String r1 = "fotos_chat"
            r13.putExtra(r1, r0)
            boolean r0 = r14.startsWith(r8)
            if (r0 == 0) goto L_0x0d00
            java.lang.String r0 = "abrir_perfilv"
            r14 = r17
            r13.putExtra(r0, r14)
            java.lang.String r0 = "abrir_perfilv_formato"
            r1 = r66
            r13.putExtra(r0, r1)
            goto L_0x0d4f
        L_0x0d00:
            java.lang.String r0 = "BEAT:"
            boolean r0 = r14.startsWith(r0)
            if (r0 == 0) goto L_0x0d4f
            java.lang.String r0 = "abrir_game"
            r14 = r59
            r13.putExtra(r0, r14)
            goto L_0x0d4f
        L_0x0d10:
            java.lang.String r0 = "abrir_idsecc"
            r4 = r65
            r13.putExtra(r0, r4)
            boolean r0 = r14.startsWith(r7)
            if (r0 == 0) goto L_0x0d33
            java.lang.String r0 = "abrir_idcat"
            r1 = r50
            r13.putExtra(r0, r1)
            java.lang.String r0 = "abrir_idtema"
            r4 = r60
            r13.putExtra(r0, r4)
            java.lang.String r0 = "idresp_ir"
            r1 = r22
            r13.putExtra(r0, r1)
            goto L_0x0d4f
        L_0x0d33:
            r1 = r50
            r4 = r60
            java.lang.String r0 = "abrir_idcat"
            r13.putExtra(r0, r1)
            java.lang.String r0 = "abrir_idtema"
            r13.putExtra(r0, r4)
            java.lang.String r0 = "abrir_idresp"
            r1 = r56
            r13.putExtra(r0, r1)
            java.lang.String r0 = "idcoment_ir"
            r1 = r21
            r13.putExtra(r0, r1)
        L_0x0d4f:
            boolean r0 = m8165R(r12, r10, r15, r15)
            if (r0 != 0) goto L_0x0d62
            r0 = r68
            r1 = r2
            r2 = r3
            r3 = r13
            r4 = r19
            r5 = r10
            r6 = r15
            r7 = r15
            m8146A(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x0d62:
            r0 = r19
            r4 = r67
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r12, r0, r13, r4)
            r9.mo83o(r1)
            android.app.Notification r1 = r9.mo73c()
            r2 = r18
            r2.notify(r0, r1)
        L_0x0d76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1692config.m8159L0(android.content.Context, java.lang.String):void");
    }

    /* renamed from: N */
    private boolean m8160N() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* renamed from: O */
    private boolean m8161O() {
        String[] strArr = {"/system/app/Superuser.apk", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/data/local/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/sbin/su"};
        int i = 0;
        while (i < 10) {
            try {
                if (new File(strArr[i]).exists()) {
                    return true;
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: O0 */
    static void m8162O0(Context context) {
        C1692config config;
        try {
            config = (C1692config) context.getApplicationContext();
        } catch (Exception unused) {
            config = null;
        }
        if (config != null && !config.f7377m3.equals("")) {
            IronSource.onPause((Activity) context);
        }
    }

    /* renamed from: P */
    private boolean m8163P() {
        Process process = null;
        try {
            Process exec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            if (new BufferedReader(new InputStreamReader(exec.getInputStream())).readLine() != null) {
                exec.destroy();
                return true;
            }
            exec.destroy();
            return false;
        } catch (Throwable unused) {
            if (process != null) {
                process.destroy();
            }
            return false;
        }
    }

    /* renamed from: P0 */
    static void m8164P0(Context context) {
        HorizontalScrollView horizontalScrollView;
        if (f7111K5) {
            ((Activity) context).finish();
        }
        Activity activity = (Activity) context;
        if (activity.findViewById(R.id.ad_pb) != null) {
            activity.findViewById(R.id.ad_pb).setVisibility(8);
        }
        m8154I0(context);
        C1692config config = null;
        try {
            config = (C1692config) context.getApplicationContext();
        } catch (Exception unused) {
        }
        if (!(config == null || config.f7313c1 == null || config.f7427t4 != 0 || config.f7394p != 3 || (horizontalScrollView = (HorizontalScrollView) activity.findViewById(R.id.hsv_menu)) == null)) {
            f7113M5.put(Integer.valueOf(activity.hashCode()), Boolean.FALSE);
            try {
                horizontalScrollView.post(new C1737w(horizontalScrollView));
            } catch (Exception unused2) {
            }
        }
        if (config != null && !config.f7377m3.equals("")) {
            IronSource.onResume(activity);
        }
    }

    /* renamed from: R */
    static boolean m8165R(Context context, int i, String str, String str2) {
        if (str.equals((Object) null) || str.equals("")) {
            str = SessionDescription.SUPPORTED_SDP_VERSION;
        }
        if (str2.equals((Object) null) || str2.equals("")) {
            str2 = SessionDescription.SUPPORTED_SDP_VERSION;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("sh", 0);
        int i2 = 0;
        for (int i3 = sharedPreferences.getInt("id_ultnotif", 0); i3 > 0; i3--) {
            if (!sharedPreferences.getBoolean("notif_" + i3 + "_leida", false)) {
                if (sharedPreferences.getInt("notif_" + i3 + "_tipo", 0) == i) {
                    if (sharedPreferences.getString("notif_" + i3 + "_idusu1", "").equals(str)) {
                        if (sharedPreferences.getString("notif_" + i3 + "_idusu2", "").equals(str2)) {
                            return true;
                        }
                    }
                }
            }
            i2++;
            if (i2 > 99) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: R0 */
    public static boolean m8166R0(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            String[] strArr = null;
            if (packageInfo != null) {
                strArr = packageInfo.requestedPermissions;
            }
            if (strArr == null || strArr.length <= 0) {
                return false;
            }
            List asList = Arrays.asList(strArr);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(asList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).contains("ACCESS_FINE_LOCATION")) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S */
    public static Set<String> m8167S(List<ResolveInfo> list) {
        HashSet hashSet = new HashSet();
        for (ResolveInfo resolveInfo : list) {
            hashSet.add(resolveInfo.activityInfo.packageName);
        }
        return hashSet;
    }

    @TargetApi(21)
    /* renamed from: S0 */
    public static void m8168S0(ProgressBar progressBar, String str) {
        if (Build.VERSION.SDK_INT >= 21 && str != null && !str.equals("") && !str.equals("#")) {
            int[][] iArr = {new int[]{16842910}, new int[]{-16842910}, new int[]{-16842912}, new int[]{16842919}};
            progressBar.setIndeterminateTintList(new ColorStateList(iArr, new int[]{Color.parseColor("#" + str), Color.parseColor("#" + str), Color.parseColor("#" + str), Color.parseColor("#" + str)}));
        }
    }

    /* renamed from: T0 */
    public static Bitmap m8169T0(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmap2, (float) ((bitmap.getWidth() - bitmap2.getWidth()) / 2), (float) ((bitmap.getHeight() - bitmap2.getHeight()) / 2), (Paint) null);
        return createBitmap;
    }

    /* renamed from: U */
    private static String m8170U() {
        return "srv" + (new Random().nextInt(9) + 11) + ".e-droid.net";
    }

    /* renamed from: U0 */
    static float m8171U0(Context context, float f) {
        return f / (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f);
    }

    /* renamed from: V */
    static void m8172V(ImageView imageView) {
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        imageView.animate().alpha(1.0f).setDuration(200);
    }

    /* renamed from: W0 */
    static String m8173W0(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    }

    /* renamed from: X */
    static void m8174X(String str, Context context) {
        String str2;
        if (str != null) {
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
            String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : "image/*";
            try {
                str2 = URLUtil.guessFileName(str, (String) null, mimeTypeFromExtension);
            } catch (Exception unused) {
                str2 = "";
            }
            if (!str2.equals("")) {
                if (str2.indexOf(".") != -1) {
                    String substring = str2.substring(str2.lastIndexOf("."));
                    Random random = new Random();
                    str2 = "img" + (random.nextInt(9000) + 1000) + substring;
                }
                String str3 = str2;
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        ContentResolver contentResolver = context.getContentResolver();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("_display_name", str3);
                        contentValues.put("mime_type", mimeTypeFromExtension);
                        m8204x(new File(str.replace("file://", "")), context.getContentResolver().openOutputStream(contentResolver.insert(MediaStore.Images.Media.getContentUri("external_primary"), contentValues)));
                        m8157K0(Toast.makeText(context, context.getResources().getString(R.string.guardando), 1));
                        return;
                    }
                    File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), str3);
                    m8202w(new File(str.replace("file://", "")), file);
                    ((DownloadManager) context.getSystemService("download")).addCompletedDownload(str3, str3, true, mimeTypeFromExtension, file.getAbsolutePath(), file.length(), true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: Y0 */
    static void m8175Y0(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("sh", 0).edit();
        edit.putLong("fult_rew", System.currentTimeMillis());
        edit.putInt("n_imp", 0);
        edit.putInt("n_imp_chat", 0);
        edit.commit();
        f7137k6 = 0;
        f7138l6 = 0;
    }

    /* renamed from: Z */
    static void m8176Z(Context context) {
        try {
            C1692config config = (C1692config) context.getApplicationContext();
            if (config.f7172E2 == 2) {
                config.mo7498c1();
            }
        } catch (Exception unused) {
        }
    }

    @TargetApi(19)
    /* renamed from: a0 */
    private static String m8178a0(Uri uri, Context context) {
        String str = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            String str2 = DocumentsContract.getDocumentId(uri).split(":")[1];
            String[] strArr = {"_data"};
            Cursor query = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "_id=?", new String[]{str2}, (String) null);
            int columnIndex = query.getColumnIndex(strArr[0]);
            if (query.moveToFirst()) {
                str = query.getString(columnIndex);
            }
            query.close();
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0055 A[SYNTHETIC, Splitter:B:31:0x0055] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005d A[Catch:{ IOException -> 0x0059 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0068 A[SYNTHETIC, Splitter:B:40:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0070 A[Catch:{ IOException -> 0x006c }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m8179a1(android.content.Context r3, android.net.Uri r4, java.lang.String r5) {
        /*
            java.io.File r0 = new java.io.File
            r1 = 0
            java.io.File r2 = r3.getExternalFilesDir(r1)
            r0.<init>(r2, r5)
            java.lang.String r5 = r0.getAbsolutePath()
            r0 = 0
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ IOException -> 0x004e, all -> 0x004b }
            java.io.InputStream r3 = r3.openInputStream(r4)     // Catch:{ IOException -> 0x004e, all -> 0x004b }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0047, all -> 0x0043 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0047, all -> 0x0043 }
            r2.<init>(r5, r0)     // Catch:{ IOException -> 0x0047, all -> 0x0043 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x0047, all -> 0x0043 }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x0041, all -> 0x003f }
            r3.read(r5)     // Catch:{ IOException -> 0x0041, all -> 0x003f }
        L_0x0028:
            r4.write(r5)     // Catch:{ IOException -> 0x0041, all -> 0x003f }
            int r1 = r3.read(r5)     // Catch:{ IOException -> 0x0041, all -> 0x003f }
            r2 = -1
            if (r1 != r2) goto L_0x0028
            r3.close()     // Catch:{ IOException -> 0x0039 }
            r4.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x003d
        L_0x0039:
            r3 = move-exception
            r3.printStackTrace()
        L_0x003d:
            r0 = 1
            goto L_0x0064
        L_0x003f:
            r5 = move-exception
            goto L_0x0045
        L_0x0041:
            r5 = move-exception
            goto L_0x0049
        L_0x0043:
            r5 = move-exception
            r4 = r1
        L_0x0045:
            r1 = r3
            goto L_0x0066
        L_0x0047:
            r5 = move-exception
            r4 = r1
        L_0x0049:
            r1 = r3
            goto L_0x0050
        L_0x004b:
            r5 = move-exception
            r4 = r1
            goto L_0x0066
        L_0x004e:
            r5 = move-exception
            r4 = r1
        L_0x0050:
            r5.printStackTrace()     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x005b
            r1.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005b
        L_0x0059:
            r3 = move-exception
            goto L_0x0061
        L_0x005b:
            if (r4 == 0) goto L_0x0064
            r4.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x0064
        L_0x0061:
            r3.printStackTrace()
        L_0x0064:
            return r0
        L_0x0065:
            r5 = move-exception
        L_0x0066:
            if (r1 == 0) goto L_0x006e
            r1.close()     // Catch:{ IOException -> 0x006c }
            goto L_0x006e
        L_0x006c:
            r3 = move-exception
            goto L_0x0074
        L_0x006e:
            if (r4 == 0) goto L_0x0077
            r4.close()     // Catch:{ IOException -> 0x006c }
            goto L_0x0077
        L_0x0074:
            r3.printStackTrace()
        L_0x0077:
            goto L_0x0079
        L_0x0078:
            throw r5
        L_0x0079:
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1692config.m8179a1(android.content.Context, android.net.Uri, java.lang.String):boolean");
    }

    /* renamed from: b */
    static boolean m8180b(String str) {
        return !str.startsWith("rtsp://") && !str.startsWith("rtmp://") && !str.startsWith("market://") && !str.startsWith("whatsapp://") && !str.startsWith("upi://") && !str.startsWith("http://www.appcreator24.com/open") && !str.startsWith("https://www.appcreator24.com/open") && !str.endsWith(".apk") && !str.endsWith(".m3u") && !str.endsWith(".m3u8") && !str.endsWith(".mp3") && !str.endsWith(".mp4") && !str.endsWith(".3gp");
    }

    /* renamed from: b0 */
    public static String m8181b0(Uri uri, Context context) {
        String a0 = Build.VERSION.SDK_INT >= 19 ? m8178a0(uri, context) : null;
        if (a0 != null) {
            return a0;
        }
        Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, (String) null, (String[]) null, (String) null);
        if (query != null) {
            if (query.moveToFirst()) {
                a0 = query.getString(query.getColumnIndexOrThrow("_data"));
            }
            query.close();
        }
        return a0 == null ? uri.getPath() : a0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public static Activity m8182c0(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* renamed from: d0 */
    public static int m8183d0(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Could not get package name: " + e);
        }
    }

    /* renamed from: e */
    static void m8184e(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("sh", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i = 0;
        int i2 = 0;
        for (int i3 = sharedPreferences.getInt("id_ultnotif", 0); i3 > 0; i3--) {
            if (!sharedPreferences.getBoolean("notif_" + i3 + "_leida", false)) {
                i++;
            }
            i2++;
            if (i2 > 99) {
                break;
            }
        }
        edit.putInt("notif_noleidas", i);
        edit.commit();
    }

    /* renamed from: e0 */
    public static String m8185e0(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* renamed from: f0 */
    public static Bitmap m8186f0(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static void m8187g(Context context, String str, String str2) {
        int i = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("sh", 0);
        boolean z = false;
        int i2 = 0;
        while (!z && i2 < 100) {
            z = sharedPreferences.getString("privado" + i2 + "_id", "").equals(str);
            i2++;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (!z) {
            while (!z && i < 100) {
                if (!sharedPreferences.contains("privado" + i + "_id")) {
                    edit.putString("privado" + i + "_id", str);
                    edit.putString("privado" + i + "_nombre", str2);
                    edit.putLong("privado" + i + "_fultconex", System.currentTimeMillis());
                    z = true;
                }
                i++;
            }
        } else {
            int i3 = i2 - 1;
            edit.putString("privado" + i3 + "_id", str);
            edit.putString("privado" + i3 + "_nombre", str2);
            edit.putLong("privado" + i3 + "_fultconex", System.currentTimeMillis());
        }
        edit.commit();
    }

    /* renamed from: g0 */
    public static Bitmap m8188g0(Bitmap bitmap, int i) {
        int i2;
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                int i3 = 0;
                if (bitmap.getWidth() > bitmap.getHeight()) {
                    i3 = (bitmap.getWidth() / 2) - (min / 2);
                    i2 = 0;
                } else {
                    i2 = (bitmap.getHeight() / 2) - (min / 2);
                }
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, i3, i2, min, min);
                int width = createBitmap.getWidth() + i;
                int height = createBitmap.getHeight() + i;
                Bitmap createBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setShader(bitmapShader);
                Canvas canvas = new Canvas(createBitmap2);
                float f = (width > height ? (float) height : (float) width) / 2.0f;
                canvas.drawCircle((float) (width / 2), (float) (height / 2), f, paint);
                paint.setShader((Shader) null);
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(-12303292);
                paint.setStrokeWidth((float) i);
                canvas.drawCircle((float) (width / 2), (float) (height / 2), f - ((float) (i / 2)), paint);
                return createBitmap2;
            } catch (OutOfMemoryError unused) {
            }
        }
        return null;
    }

    /* renamed from: h */
    static String m8189h(String str, String str2) {
        if (str == null || str2 == null || str.equals("") || str2.equals("") || Build.VERSION.SDK_INT <= 20) {
            return "";
        }
        if (m8156K("#" + str2)) {
            if (m8156K("#" + str)) {
                return "FF000000";
            }
        }
        if (m8158L("#" + str2)) {
            if (m8158L("#" + str)) {
                return "FFFFFFFF";
            }
        }
        return str2;
    }

    @TargetApi(21)
    /* renamed from: i */
    public static void m8190i(Activity activity, String str) {
        if (Build.VERSION.SDK_INT > 20) {
            float[] fArr = new float[3];
            Color.colorToHSV(Color.parseColor("#" + str), fArr);
            fArr[2] = fArr[2] * 0.8f;
            int HSVToColor = Color.HSVToColor(fArr);
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            activity.getWindow().setStatusBarColor(HSVToColor);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01c0 A[Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }] */
    /* renamed from: l1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<british.p015x.C1773e1> m8191l1(java.io.InputStream r16) {
        /*
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            r2 = 1
            r0.setNamespaceAware(r2)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            org.xmlpull.v1.XmlPullParser r3 = r0.newPullParser()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            r4 = 0
            r0 = r16
            r3.setInput(r0, r4)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            int r0 = r3.getEventType()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            java.lang.String r6 = "EEE, dd MMM yyyy HH:mm:ss Z"
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            r5.<init>(r6, r7)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            r6 = 3
            java.text.DateFormat r7 = java.text.SimpleDateFormat.getDateTimeInstance(r6, r6)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            java.text.DateFormat r8 = java.text.SimpleDateFormat.getDateInstance(r6)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            java.util.Calendar r9 = java.util.Calendar.getInstance()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            r11 = -1
            r12 = r4
            r13 = -1
            r14 = 0
        L_0x0035:
            if (r0 == r2) goto L_0x022c
            r10 = 2
            r15 = 4
            if (r0 != 0) goto L_0x003d
            goto L_0x0210
        L_0x003d:
            java.lang.String r2 = "item"
            if (r0 != r10) goto L_0x00ae
            java.lang.String r0 = r3.getName()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r0 == 0) goto L_0x0054
            british.x.e1 r12 = new british.x.e1     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            r12.<init>()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            r13 = 0
            r14 = 0
            goto L_0x0210
        L_0x0054:
            java.lang.String r0 = r3.getName()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            java.lang.String r2 = "title"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r0 == 0) goto L_0x0063
            r13 = 1
            goto L_0x0210
        L_0x0063:
            java.lang.String r0 = r3.getName()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            java.lang.String r2 = "link"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r0 == 0) goto L_0x0072
            r13 = 2
            goto L_0x0210
        L_0x0072:
            java.lang.String r0 = r3.getName()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            java.lang.String r2 = "pubDate"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r0 == 0) goto L_0x0081
            r13 = 3
            goto L_0x0210
        L_0x0081:
            java.lang.String r0 = r3.getName()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            java.lang.String r2 = "description"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r0 == 0) goto L_0x0090
            r13 = 4
            goto L_0x0210
        L_0x0090:
            java.lang.String r0 = r3.getName()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            java.lang.String r2 = "encoded"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r0 == 0) goto L_0x00ab
            java.lang.String r0 = r3.getPrefix()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            java.lang.String r2 = "content"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r0 == 0) goto L_0x00ab
            r13 = 6
            goto L_0x0210
        L_0x00ab:
            r13 = 5
            goto L_0x0210
        L_0x00ae:
            if (r0 != r6) goto L_0x00f9
            java.lang.String r0 = r3.getName()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r0 == 0) goto L_0x00f6
            java.lang.String r0 = r12.f7676e     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r0 == 0) goto L_0x00f1
            java.lang.String r2 = "\\p{Cntrl}"
            java.lang.String r10 = ""
            java.lang.String r0 = r0.replaceAll(r2, r10)     // Catch:{ ParseException -> 0x00eb }
            java.util.Date r0 = r5.parse(r0)     // Catch:{ ParseException -> 0x00eb }
            r9.setTime(r0)     // Catch:{ ParseException -> 0x00eb }
            r2 = 11
            int r2 = r9.get(r2)     // Catch:{ ParseException -> 0x00eb }
            if (r2 != 0) goto L_0x00e4
            r2 = 12
            int r2 = r9.get(r2)     // Catch:{ ParseException -> 0x00eb }
            if (r2 != 0) goto L_0x00e4
            java.lang.String r0 = r8.format(r0)     // Catch:{ ParseException -> 0x00eb }
            r12.f7676e = r0     // Catch:{ ParseException -> 0x00eb }
            goto L_0x00f1
        L_0x00e4:
            java.lang.String r0 = r7.format(r0)     // Catch:{ ParseException -> 0x00eb }
            r12.f7676e = r0     // Catch:{ ParseException -> 0x00eb }
            goto L_0x00f1
        L_0x00eb:
            r0 = move-exception
            r12.f7676e = r4     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            r0.printStackTrace()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
        L_0x00f1:
            r1.add(r12)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            goto L_0x0210
        L_0x00f6:
            r13 = 0
            goto L_0x0210
        L_0x00f9:
            if (r0 != r15) goto L_0x0210
            java.lang.String r0 = r3.getText()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            java.lang.String r0 = r0.trim()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r12 == 0) goto L_0x0210
            switch(r13) {
                case 1: goto L_0x01f5;
                case 2: goto L_0x01e1;
                case 3: goto L_0x01cd;
                case 4: goto L_0x0110;
                case 5: goto L_0x010a;
                case 6: goto L_0x0118;
                default: goto L_0x0108;
            }     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
        L_0x0108:
            goto L_0x0210
        L_0x010a:
            java.lang.String r2 = r12.f7672a     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r2 == 0) goto L_0x0110
            goto L_0x0210
        L_0x0110:
            java.lang.String r2 = r12.f7672a     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r2 == 0) goto L_0x0118
            if (r14 == 0) goto L_0x0118
            goto L_0x0210
        L_0x0118:
            int r2 = r0.length()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r2 == 0) goto L_0x0210
            java.lang.String r2 = ".jpg"
            int r2 = r0.indexOf(r2)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            java.lang.String r10 = ".png"
            int r10 = r0.indexOf(r10)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            r15 = 999999(0xf423f, float:1.401297E-39)
            if (r2 != r11) goto L_0x0132
            r2 = 999999(0xf423f, float:1.401297E-39)
        L_0x0132:
            if (r10 != r11) goto L_0x0137
            r10 = 999999(0xf423f, float:1.401297E-39)
        L_0x0137:
            int r2 = java.lang.Math.min(r2, r10)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r2 == r15) goto L_0x0210
            int r10 = r2 + 1
            java.lang.String r10 = r0.substring(r2, r10)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            r4 = r2
        L_0x0144:
            r6 = 1
            if (r4 <= r6) goto L_0x0169
            java.lang.String r6 = "'"
            boolean r6 = r10.equals(r6)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r6 != 0) goto L_0x0168
            java.lang.String r6 = "\""
            boolean r6 = r10.equals(r6)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r6 != 0) goto L_0x0168
            java.lang.String r6 = "="
            boolean r6 = r10.equals(r6)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r6 != 0) goto L_0x0168
            int r4 = r4 + -1
            int r6 = r4 + 1
            java.lang.String r10 = r0.substring(r4, r6)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            goto L_0x0144
        L_0x0168:
            r6 = 1
        L_0x0169:
            if (r4 <= r6) goto L_0x0210
            int r4 = r4 + 1
            int r2 = r2 + 4
            java.lang.String r4 = r0.substring(r4, r2)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            java.lang.String r10 = "http"
            boolean r10 = r4.startsWith(r10)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r10 == 0) goto L_0x0210
            java.lang.String r10 = "&gt;"
            int r10 = r0.indexOf(r10, r2)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            java.lang.String r6 = ">"
            int r6 = r0.indexOf(r6, r2)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r10 != r11) goto L_0x018c
            r10 = 999999(0xf423f, float:1.401297E-39)
        L_0x018c:
            if (r6 != r11) goto L_0x0191
            r6 = 999999(0xf423f, float:1.401297E-39)
        L_0x0191:
            int r6 = java.lang.Math.min(r10, r6)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r6 == r15) goto L_0x01bd
            java.lang.String r0 = r0.substring(r2, r6)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            java.lang.String r2 = "width=\"1\""
            int r2 = r0.indexOf(r2)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r2 == r11) goto L_0x01ab
            java.lang.String r2 = "height=\"1\""
            int r2 = r0.indexOf(r2)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r2 != r11) goto L_0x01bb
        L_0x01ab:
            java.lang.String r2 = "width='1'"
            int r2 = r0.indexOf(r2)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r2 == r11) goto L_0x01bd
            java.lang.String r2 = "height='1'"
            int r0 = r0.indexOf(r2)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r0 == r11) goto L_0x01bd
        L_0x01bb:
            r6 = 0
            goto L_0x01be
        L_0x01bd:
            r6 = 1
        L_0x01be:
            if (r6 == 0) goto L_0x0210
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r4, r0)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            r12.f7672a = r0     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            r0 = 6
            if (r13 != r0) goto L_0x0210
            r14 = 1
            goto L_0x0210
        L_0x01cd:
            int r2 = r0.length()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r2 == 0) goto L_0x0210
            java.lang.String r2 = r12.f7676e     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r2 == 0) goto L_0x01de
            int r2 = r2.length()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r2 <= 0) goto L_0x01de
            goto L_0x0210
        L_0x01de:
            r12.f7676e = r0     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            goto L_0x0210
        L_0x01e1:
            int r2 = r0.length()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r2 == 0) goto L_0x0210
            java.lang.String r2 = r12.f7677f     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r2 == 0) goto L_0x01f2
            int r2 = r2.length()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r2 <= 0) goto L_0x01f2
            goto L_0x0210
        L_0x01f2:
            r12.f7677f = r0     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            goto L_0x0210
        L_0x01f5:
            int r2 = r0.length()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r2 == 0) goto L_0x0210
            java.lang.String r2 = r12.f7675d     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r2 == 0) goto L_0x0206
            int r2 = r2.length()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            if (r2 <= 0) goto L_0x0206
            goto L_0x0210
        L_0x0206:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            java.lang.String r0 = r0.toString()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            r12.f7675d = r0     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
        L_0x0210:
            int r0 = r3.next()     // Catch:{ MalformedURLException -> 0x0228, IOException -> 0x0223, XmlPullParserException -> 0x021e, ParseException -> 0x0219 }
            r2 = 1
            r4 = 0
            r6 = 3
            goto L_0x0035
        L_0x0219:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x022c
        L_0x021e:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x022c
        L_0x0223:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x022c
        L_0x0228:
            r0 = move-exception
            r0.printStackTrace()
        L_0x022c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1692config.m8191l1(java.io.InputStream):java.util.ArrayList");
    }

    /* renamed from: m */
    static int m8192m(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i4 <= i && i3 <= i2) {
            return 1;
        }
        return Math.round(((float) i4) / ((float) m8193n(i4, i3, i, i2)));
    }

    /* renamed from: n */
    static int m8193n(int i, int i2, int i3, int i4) {
        if (i > i3) {
            i2 = Math.round((float) ((i2 * i3) / i));
            i = i3;
        }
        return i2 > i4 ? Math.round((float) ((i * i4) / i2)) : i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (m8155J(r2) != false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r4 == 2) goto L_0x000a;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m8194o(int r2, float r3, int r4) {
        /*
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L_0x000c
            boolean r4 = m8155J(r2)
            if (r4 == 0) goto L_0x000f
        L_0x000a:
            float r0 = r0 - r3
            goto L_0x0015
        L_0x000c:
            r1 = 1
            if (r4 != r1) goto L_0x0011
        L_0x000f:
            float r0 = r0 + r3
            goto L_0x0015
        L_0x0011:
            r1 = 2
            if (r4 != r1) goto L_0x0015
            goto L_0x000a
        L_0x0015:
            int r3 = android.graphics.Color.alpha(r2)
            int r4 = android.graphics.Color.red(r2)
            float r4 = (float) r4
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            int r1 = android.graphics.Color.green(r2)
            float r1 = (float) r1
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            int r2 = android.graphics.Color.blue(r2)
            float r2 = (float) r2
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            r0 = 255(0xff, float:3.57E-43)
            int r4 = java.lang.Math.min(r4, r0)
            int r1 = java.lang.Math.min(r1, r0)
            int r2 = java.lang.Math.min(r2, r0)
            int r2 = android.graphics.Color.argb(r3, r4, r1, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1692config.m8194o(int, float, int):int");
    }

    /* renamed from: o0 */
    public static boolean m8195o0(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && m8203w0(activeNetworkInfo.getType(), activeNetworkInfo.getSubtype());
    }

    /* renamed from: p0 */
    public static Bitmap m8196p0(Context context) {
        String string = context.getSharedPreferences("sh", 0).getString("i", "");
        if (string.equals("") || string.length() <= 23 || !string.substring(23, 24).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
            return null;
        }
        return BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_launcher);
    }

    @TargetApi(21)
    /* renamed from: q */
    public static void m8197q(CheckBox checkBox, String str) {
        if (Build.VERSION.SDK_INT >= 21 && str != null && !str.equals("") && !str.equals("#")) {
            int[][] iArr = {new int[]{16842908}, new int[]{-16842908}};
            checkBox.setButtonTintList(new ColorStateList(iArr, new int[]{Color.parseColor("#" + str), Color.parseColor("#" + str)}));
        }
    }

    /* renamed from: r */
    public static Intent m8198r(Intent intent, Bundle bundle) {
        intent.putExtra("externo", true);
        intent.putExtra("idchat", bundle.getInt("idchat"));
        intent.putExtra("idtema", bundle.getInt("idtema"));
        intent.putExtra("fotos_perfil", bundle.getInt("fotos_perfil"));
        intent.putExtra("fnac", bundle.getInt("fnac"));
        intent.putExtra("sexo", bundle.getInt("sexo"));
        intent.putExtra("descr", bundle.getInt("descr"));
        intent.putExtra("dist", bundle.getInt("dist"));
        intent.putExtra("privados", bundle.getBoolean("privados"));
        intent.putExtra("coments", bundle.getBoolean("coments"));
        intent.putExtra("galeria", bundle.getBoolean("galeria"));
        intent.putExtra("fotos_chat", bundle.getInt("fotos_chat"));
        intent.putExtra("c1", bundle.getString("c1"));
        intent.putExtra("c2", bundle.getString("c2"));
        return intent;
    }

    /* renamed from: t */
    static void m8199t(Context context) {
        m8157K0(Toast.makeText(context, R.string.confirm_exit, 0));
    }

    /* renamed from: u */
    public static String m8200u(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyHHmm");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));
        try {
            Date parse = simpleDateFormat.parse(str);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("ddMMyyHHmm");
            simpleDateFormat2.setTimeZone(TimeZone.getDefault());
            return simpleDateFormat2.format(parse);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: v */
    public static String m8201v(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyHHmm");
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        try {
            Date parse = simpleDateFormat.parse(str);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("ddMMyyHHmm");
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));
            return simpleDateFormat2.format(parse);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: w */
    public static void m8202w(File file, File file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                fileInputStream.close();
                fileOutputStream.close();
                return;
            }
        }
    }

    /* renamed from: w0 */
    public static boolean m8203w0(int i, int i2) {
        if (i == 1) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        switch (i2) {
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: x */
    public static void m8204x(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                fileInputStream.close();
                outputStream.close();
                return;
            }
        }
    }

    /* renamed from: x0 */
    public static boolean m8205x0(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @TargetApi(26)
    /* renamed from: y */
    public static NotificationChannel m8206y(Context context, int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        NotificationChannel notificationChannel = new NotificationChannel("channel_" + i, "channel " + i, 3);
        if (i == 0) {
            notificationChannel.setSound((Uri) null, (AudioAttributes) null);
        }
        notificationManager.createNotificationChannel(notificationChannel);
        return notificationChannel;
    }

    /* renamed from: y0 */
    static boolean m8207y0(Context context, Uri uri) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE").addFlags(268436480));
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: z0 */
    private static boolean m8208z0(Context context, Uri uri) {
        PackageManager packageManager = context.getPackageManager();
        Set<String> S = m8167S(packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", (String) null)), 0));
        Intent addCategory = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE");
        Set<String> S2 = m8167S(packageManager.queryIntentActivities(addCategory, 0));
        S2.removeAll(S);
        if (S2.isEmpty()) {
            return false;
        }
        addCategory.addFlags(268435456);
        context.startActivity(addCategory);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public C1603c mo7474A0(Context context, boolean z) {
        return mo7476B0(context, z, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public C1845j mo7475B(Integer num, Context context) {
        Intent intent;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        Intent intent5;
        Intent intent6;
        Intent intent7;
        Intent intent8;
        Intent intent9;
        Intent intent10;
        Intent intent11;
        Intent intent12;
        Intent intent13;
        Intent intent14;
        Intent intent15;
        Intent intent16;
        C1845j jVar = new C1845j();
        jVar.f7843b = true;
        jVar.f7844c = false;
        jVar.f7845d = false;
        if (num.intValue() == -1) {
            int i = 0;
            while (true) {
                C1855l[] lVarArr = this.f7231O1;
                if (i >= lVarArr.length) {
                    break;
                } else if (!lVarArr[i].f7848B) {
                    num = Integer.valueOf(i);
                    break;
                } else {
                    i++;
                }
            }
        }
        if (num.intValue() < 9997) {
            C1855l lVar = this.f7231O1[num.intValue()];
            if (!lVar.f7848B) {
                this.f7312c = num.intValue();
            }
            this.f7318d = num.intValue();
            SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("ind_secc_sel", this.f7312c);
            edit.putInt("ind_secc_sel_2", this.f7318d);
            edit.commit();
            boolean z = sharedPreferences.getBoolean("chat" + lVar.f7964y + "_validado", true);
            int i2 = lVar.f7954t;
            if (i2 == 1) {
                if (z) {
                    intent16 = new Intent(context, t_url.class);
                } else {
                    Intent intent17 = new Intent(context, t_chat_contra.class);
                    intent17.putExtra("clase", lVar.f7954t);
                    intent17.putExtra("ind", num);
                    intent16 = intent17;
                }
                intent16.putExtra("url", lVar.f7910e);
                jVar.f7842a = intent16;
                return jVar;
            } else if (i2 == 2) {
                if (z) {
                    intent15 = new Intent(context, t_html.class);
                } else {
                    intent15 = new Intent(context, t_chat_contra.class);
                    intent15.putExtra("clase", lVar.f7954t);
                    intent15.putExtra("ind", num);
                }
                intent15.putExtra("idsecc", num);
                jVar.f7842a = intent15;
                return jVar;
            } else if (i2 == 3) {
                if (z) {
                    intent14 = new Intent(context, t_and.class);
                } else {
                    intent14 = new Intent(context, t_chat_contra.class);
                    intent14.putExtra("clase", lVar.f7954t);
                    intent14.putExtra("ind", num);
                }
                intent14.putExtra("idsecc", num);
                jVar.f7842a = intent14;
                return jVar;
            } else if (i2 == 4) {
                if (z) {
                    return mo7527u0(context);
                }
                Intent intent18 = new Intent(context, t_chat_contra.class);
                intent18.putExtra("clase", lVar.f7954t);
                intent18.putExtra("ind", num);
                jVar.f7842a = intent18;
                return jVar;
            } else if (i2 == 5) {
                if (z) {
                    return mo7528v0(context);
                }
                Intent intent19 = new Intent(context, t_chat_contra.class);
                intent19.putExtra("clase", lVar.f7954t);
                intent19.putExtra("ind", num);
                jVar.f7842a = intent19;
                return jVar;
            } else if (i2 == 6) {
                if (!z) {
                    intent13 = new Intent(context, t_chat_contra.class);
                    intent13.putExtra("clase", lVar.f7954t);
                } else if (lVar.f7868L == 0) {
                    intent13 = new Intent(context, t_video.class);
                } else {
                    intent13 = new Intent(context, t_video_exoplayer.class);
                }
                intent13.putExtra("url", lVar.f7910e);
                intent13.putExtra("ua", lVar.f7925j);
                intent13.putExtra("ind", num);
                jVar.f7842a = intent13;
                return jVar;
            } else if (i2 == 7) {
                if (z) {
                    intent12 = new Intent(context, t_radio.class);
                } else {
                    intent12 = new Intent(context, t_chat_contra.class);
                    intent12.putExtra("clase", lVar.f7954t);
                }
                intent12.putExtra("ind", num);
                jVar.f7842a = intent12;
                return jVar;
            } else if (i2 == 8) {
                if (z) {
                    intent11 = new Intent(context, t_rss.class);
                } else {
                    intent11 = new Intent(context, t_chat_contra.class);
                    intent11.putExtra("clase", lVar.f7954t);
                }
                intent11.putExtra("ind", num);
                jVar.f7842a = intent11;
                return jVar;
            } else if (i2 == 9) {
                Intent intent20 = new Intent(context, t_chat_contra.class);
                intent20.putExtra("ind", num);
                jVar.f7842a = intent20;
                return jVar;
            } else if (i2 == 10) {
                if (lVar.f7863I0 > 0) {
                    if (z) {
                        intent9 = new Intent(context, t_buscchats_lista.class);
                    } else {
                        intent9 = new Intent(context, t_chat_contra.class);
                        intent9.putExtra("clase", lVar.f7954t);
                    }
                    intent9.putExtra("ind", num);
                    intent9.putExtra("idcat", lVar.f7861H0);
                    intent9.putExtra("idsubcat", lVar.f7863I0);
                } else {
                    if (z) {
                        intent10 = new Intent(context, t_buscchats.class);
                    } else {
                        intent10 = new Intent(context, t_chat_contra.class);
                        intent10.putExtra("clase", lVar.f7954t);
                    }
                    intent9.putExtra("ind", num);
                    intent9.putExtra("idcat", lVar.f7861H0);
                }
                jVar.f7842a = intent9;
                return jVar;
            } else if (i2 == 11) {
                if (z) {
                    intent8 = new Intent(context, t_buscusus.class);
                } else {
                    intent8 = new Intent(context, t_chat_contra.class);
                    intent8.putExtra("clase", lVar.f7954t);
                }
                intent8.putExtra("ind", num);
                jVar.f7842a = intent8;
                return jVar;
            } else if (i2 == 12) {
                if (z) {
                    intent7 = new Intent(context, t_submenu.class);
                } else {
                    intent7 = new Intent(context, t_chat_contra.class);
                    intent7.putExtra("clase", lVar.f7954t);
                }
                intent7.putExtra("ind", num);
                jVar.f7842a = intent7;
                return jVar;
            } else if (i2 == 22) {
                if (z) {
                    intent6 = new Intent(context, t_submenu_ultimas.class);
                } else {
                    intent6 = new Intent(context, t_chat_contra.class);
                    intent6.putExtra("clase", lVar.f7954t);
                }
                intent6.putExtra("ind", num);
                jVar.f7842a = intent6;
                return jVar;
            } else if (i2 == 13) {
                if (z) {
                    intent5 = new Intent(context, t_gal.class);
                } else {
                    intent5 = new Intent(context, t_chat_contra.class);
                    intent5.putExtra("clase", lVar.f7954t);
                }
                intent5.putExtra("ind", num);
                jVar.f7842a = intent5;
                return jVar;
            } else if (i2 == 14) {
                if (z) {
                    intent4 = new Intent(context, t_card.class);
                } else {
                    intent4 = new Intent(context, t_chat_contra.class);
                    intent4.putExtra("clase", lVar.f7954t);
                }
                intent4.putExtra("ind", num);
                jVar.f7842a = intent4;
                return jVar;
            } else if (i2 == 16) {
                if (z) {
                    intent3 = new Intent(context, t_buscvideos.class);
                } else {
                    intent3 = new Intent(context, t_chat_contra.class);
                    intent3.putExtra("clase", lVar.f7954t);
                }
                intent3.putExtra("ind", num);
                jVar.f7842a = intent3;
                return jVar;
            } else if (i2 == 19) {
                if (z) {
                    intent2 = new Intent(context, t_vistafb.class);
                } else {
                    intent2 = new Intent(context, t_chat_contra.class);
                    intent2.putExtra("clase", lVar.f7954t);
                }
                intent2.putExtra("ind", num);
                jVar.f7842a = intent2;
                return jVar;
            } else {
                if (i2 == 20) {
                    if (z) {
                        intent = new Intent(context, t_qr.class);
                    } else {
                        intent = new Intent(context, t_chat_contra.class);
                        intent.putExtra("clase", lVar.f7954t);
                    }
                    intent.putExtra("ind", num);
                    jVar.f7842a = intent;
                }
                return jVar;
            }
        } else {
            this.f7318d = 0;
            SharedPreferences.Editor edit2 = getSharedPreferences("sh", 0).edit();
            edit2.putInt("ind_secc_sel", this.f7312c);
            edit2.putInt("ind_secc_sel_2", this.f7318d);
            edit2.commit();
            jVar.f7842a = new Intent(context, t_chat_contra.class);
            return jVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public C1603c mo7476B0(Context context, boolean z, boolean z2) {
        ArrayList<NativeAd> arrayList;
        C1603c cVar = new C1603c();
        cVar.f6886a = null;
        cVar.f6887b = null;
        cVar.f6888c = null;
        cVar.f6889d = null;
        this.f7456x5 = false;
        if (this.f7384n3 != 0 && !z) {
            ArrayList arrayList2 = new ArrayList();
            if (!this.f7315c3.equals("") && !z2) {
                arrayList2.add(1);
            }
            if (!this.f7309b3.equals("") && (arrayList = this.f7463y5) != null && arrayList.size() > 0 && (this.f7315c3.equals("") || !f7141o6)) {
                arrayList2.add(2);
            }
            if (!this.f7333f3.equals("")) {
                arrayList2.add(3);
            }
            if (!this.f7339g3.equals("")) {
                arrayList2.add(4);
            }
            if (!this.f7345h3.equals("") && this.f7384n3 == 2) {
                arrayList2.add(6);
            }
            if (!this.f7351i3.equals("") && UnityAds.isInitialized()) {
                arrayList2.add(7);
            }
            if (!this.f7357j3.equals("")) {
                arrayList2.add(8);
            }
            int intValue = !arrayList2.isEmpty() ? ((Integer) arrayList2.get(new Random().nextInt(((arrayList2.size() - 1) - 0) + 1) + 0)).intValue() : 0;
            if (intValue == 1) {
                cVar.f6886a = new AdView(context);
                AdSize adSize = this.f7419s3;
                if (adSize == AdSize.LARGE_BANNER && getResources().getConfiguration().orientation == 2) {
                    adSize = AdSize.SMART_BANNER;
                }
                cVar.f6886a.setAdSize(adSize);
                cVar.f6886a.setAdUnitId(this.f7315c3);
                if (this.f7384n3 == 1) {
                    cVar.f6886a.setTag(Integer.valueOf(R.id.TAG_ESBANNER));
                    ((LinearLayout) this.f7306b).addView(cVar.f6886a);
                } else {
                    Activity activity = (Activity) context;
                    ((LinearLayout) activity.findViewById(R.id.ll_ad)).addView(cVar.f6886a);
                    ((LinearLayout) activity.findViewById(R.id.ll_ad)).setVisibility(0);
                }
                this.f7456x5 = true;
                cVar.f6886a.setAdListener(new C1714k());
                try {
                    cVar.f6886a.loadAd(new AdRequest.Builder().build());
                } catch (Exception unused) {
                }
            } else if (intValue == 2) {
                mo7509j(context);
            } else if (intValue == 3) {
                if (this.f7419s3 == AdSize.LARGE_BANNER && getResources().getConfiguration().orientation == 1) {
                    cVar.f6887b = new com.facebook.ads.AdView(context, this.f7333f3, com.facebook.ads.AdSize.BANNER_HEIGHT_90);
                } else {
                    cVar.f6887b = new com.facebook.ads.AdView(context, this.f7333f3, com.facebook.ads.AdSize.BANNER_HEIGHT_50);
                }
                if (this.f7384n3 == 1) {
                    cVar.f6887b.setTag(Integer.valueOf(R.id.TAG_ESBANNER));
                    ((LinearLayout) this.f7306b).addView(cVar.f6887b);
                } else {
                    Activity activity2 = (Activity) context;
                    ((LinearLayout) activity2.findViewById(R.id.ll_ad)).setBackgroundColor(-7829368);
                    ((LinearLayout) activity2.findViewById(R.id.ll_ad)).setPadding(0, m8149E(this, 3), 0, 0);
                    ((LinearLayout) activity2.findViewById(R.id.ll_ad)).addView(cVar.f6887b);
                    ((LinearLayout) activity2.findViewById(R.id.ll_ad)).setVisibility(0);
                }
                this.f7456x5 = true;
                cVar.f6887b.loadAd();
            } else if (intValue == 4) {
                Banner banner = new Banner(context, (com.startapp.sdk.ads.banner.BannerListener) new C1736v());
                cVar.f6888c = banner;
                banner.setAdTag(AdPreferences.TYPE_BANNER);
                if (this.f7384n3 == 1) {
                    cVar.f6888c.setTag(Integer.valueOf(R.id.TAG_ESBANNER));
                }
                if (this.f7419s3 == AdSize.LARGE_BANNER && getResources().getConfiguration().orientation == 1) {
                    cVar.f6888c.loadAd(320, 100);
                } else {
                    cVar.f6888c.loadAd(320, 50);
                }
            } else if (intValue == 6) {
                AdColony.requestAdView(this.f7345h3, new C1701d0(cVar), AdColonyAdSize.BANNER);
            } else if (intValue == 7) {
                if (UnityAds.isInitialized()) {
                    C1703e0 e0Var = new C1703e0(cVar);
                    UnityBannerSize unityBannerSize = new UnityBannerSize(320, 50);
                    if (this.f7419s3 == AdSize.LARGE_BANNER && getResources().getConfiguration().orientation == 1) {
                        unityBannerSize = new UnityBannerSize(320, 100);
                    }
                    BannerView bannerView = new BannerView((Activity) context, this.f7351i3, unityBannerSize);
                    cVar.f6890e = bannerView;
                    bannerView.setListener(e0Var);
                    cVar.f6890e.load();
                }
            } else if (intValue == 8) {
                ISBannerSize iSBannerSize = ISBannerSize.BANNER;
                if (this.f7419s3 == AdSize.LARGE_BANNER && getResources().getConfiguration().orientation == 1) {
                    iSBannerSize = ISBannerSize.LARGE;
                }
                IronSourceBannerLayout ironSourceBannerLayout = this.f7420s4;
                if (ironSourceBannerLayout != null) {
                    IronSource.destroyBanner(ironSourceBannerLayout);
                }
                IronSourceBannerLayout createBanner = IronSource.createBanner((Activity) context, iSBannerSize);
                this.f7420s4 = createBanner;
                createBanner.setBannerListener(new C1705f0());
                IronSource.loadBanner(this.f7420s4);
            }
        }
        return cVar;
    }

    /* renamed from: D */
    public Bitmap mo7477D(Uri uri, int i, int i2) throws IOException, OutOfMemoryError {
        InputStream openInputStream = getContentResolver().openInputStream(uri);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(openInputStream, (Rect) null, options);
        openInputStream.close();
        options.inSampleSize = m8192m(options, i, i2);
        InputStream openInputStream2 = getContentResolver().openInputStream(uri);
        options.inJustDecodeBounds = false;
        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream2, (Rect) null, options);
        openInputStream2.close();
        return decodeStream;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[ExcHandler: FileNotFoundException | IOException | OutOfMemoryError (unused java.lang.Throwable), SYNTHETIC, Splitter:B:10:0x0030] */
    /* renamed from: D0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7478D0(android.content.Context r7, android.widget.ImageView r8) {
        /*
            r6 = this;
            java.lang.String r0 = "sh"
            r1 = 0
            android.content.SharedPreferences r0 = r6.getSharedPreferences(r0, r1)
            int r2 = r6.f7146A0
            r3 = 2
            if (r2 == r3) goto L_0x008c
            java.lang.String r2 = "nick"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.getString(r2, r3)
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x008c
            r0 = 1
            java.io.File r2 = r6.mo7516l0(r6, r0)
            boolean r2 = r2.exists()
            if (r2 != 0) goto L_0x0026
            goto L_0x008c
        L_0x0026:
            int r7 = r6.f7146A0
            if (r7 == 0) goto L_0x002c
            if (r7 != r0) goto L_0x00c2
        L_0x002c:
            java.io.File r7 = r6.mo7516l0(r6, r0)
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            r2.<init>()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            r2.inJustDecodeBounds = r0     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            java.lang.String r3 = r7.getPath()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            android.graphics.BitmapFactory.decodeFile(r3, r2)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            int r3 = r2.outWidth     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            int r2 = r2.outHeight     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 > r4) goto L_0x0049
            if (r2 > r4) goto L_0x0049
            r1 = 1
        L_0x0049:
            r5 = 0
            if (r1 != 0) goto L_0x0067
            int r1 = m8193n(r3, r2, r4, r4)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            float r2 = (float) r3     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            float r1 = (float) r1     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            float r2 = r2 / r1
            int r1 = java.lang.Math.round(r2)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            r2.<init>()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            r2.inSampleSize = r1     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            java.lang.String r7 = r7.getPath()     // Catch:{ OutOfMemoryError -> 0x0073, FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFile(r7, r2)     // Catch:{ OutOfMemoryError -> 0x0073, FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            goto L_0x0073
        L_0x0067:
            android.content.ContentResolver r1 = r6.getContentResolver()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            android.net.Uri r7 = android.net.Uri.fromFile(r7)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            android.graphics.Bitmap r5 = android.provider.MediaStore.Images.Media.getBitmap(r1, r7)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
        L_0x0073:
            int r7 = r6.f7146A0     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            if (r7 != 0) goto L_0x007c
            android.graphics.Bitmap r7 = m8188g0(r5, r0)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            goto L_0x0080
        L_0x007c:
            android.graphics.Bitmap r7 = m8147C(r5, r0)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
        L_0x0080:
            r0 = 4
            int r0 = m8149E(r6, r0)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            r8.setPadding(r0, r0, r0, r0)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            r8.setImageBitmap(r7)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00c2 }
            goto L_0x00c2
        L_0x008c:
            boolean r0 = r6.f7451x0
            if (r0 == 0) goto L_0x0096
            java.lang.String r7 = "ico_perfil"
            r6.mo7493Y(r7, r8)
            goto L_0x00c2
        L_0x0096:
            android.app.Activity r7 = (android.app.Activity) r7
            android.content.res.Resources r7 = r7.getResources()
            r0 = 2131231331(0x7f080263, float:1.807874E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r1 = r6.f7375m1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r0 = android.graphics.Color.parseColor(r0)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            r7.setColorFilter(r0, r1)
            r8.setImageDrawable(r7)
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1692config.mo7478D0(android.content.Context, android.widget.ImageView):void");
    }

    /* renamed from: E0 */
    public void mo7479E0(int i, String str) {
        SharedPreferences.Editor edit = getSharedPreferences("sh", 0).edit();
        edit.putString("f2_idfrase", SessionDescription.SUPPORTED_SDP_VERSION);
        edit.putString("f2_id", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        edit.putString("f2_nombre", getResources().getString(R.string.bot));
        edit.putString("f2_privados", SessionDescription.SUPPORTED_SDP_VERSION);
        if (i == 0) {
            edit.putString("f2_frase", getResources().getString(R.string.bot_frase));
            edit.putString("f2_b64", "");
        } else if (i == 1) {
            edit.putString("f2_frase", "");
            edit.putString("f2_b64", "es_ad");
        }
        edit.putString("f2_fcrea", new SimpleDateFormat("ddMMyyHHmm").format(new Date()));
        edit.putString("f2_tipo", SessionDescription.SUPPORTED_SDP_VERSION);
        edit.putString("f2_b64_th", "");
        edit.putString("f2_idvideo", "");
        edit.putString("f2_formato", "");
        edit.putString("f2_idtema", str);
        edit.putString("f2_vfoto", SessionDescription.SUPPORTED_SDP_VERSION);
        edit.putString("f2_fnac_d", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        edit.putString("f2_fnac_m", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        edit.putString("f2_fnac_a", "1977");
        edit.putString("f2_sexo", SessionDescription.SUPPORTED_SDP_VERSION);
        edit.putString("f2_coments", SessionDescription.SUPPORTED_SDP_VERSION);
        edit.putBoolean("f2_ultimas", false);
        edit.putString("f2_ts", System.currentTimeMillis() + "");
        edit.commit();
        if (i == 0) {
            new Handler().postDelayed(new C1727p(str), 1000);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F0 */
    public void mo7480F0(LinearLayout linearLayout, int i, int i2) {
        ArrayList<NativeAdDetails> arrayList;
        ArrayList<NativeAd> arrayList2;
        ArrayList arrayList3 = new ArrayList();
        String str = this.f7426t3;
        if (str != null && !str.equals("") && (arrayList2 = this.f7463y5) != null && arrayList2.size() > 0) {
            arrayList3.add(1);
        }
        String str2 = this.f7433u3;
        if (str2 != null && !str2.equals("") && (arrayList = this.f7470z5) != null && arrayList.size() > 0) {
            arrayList3.add(2);
        }
        int intValue = !arrayList3.isEmpty() ? ((Integer) arrayList3.get(new Random().nextInt(((arrayList3.size() - 1) - 0) + 1) + 0)).intValue() : 0;
        if (intValue == 1) {
            ((RelativeLayout) linearLayout.findViewById(R.id.na_ad)).getLayoutParams().width = i2;
            NativeAd nativeAd = this.f7463y5.get(new Random().nextInt(((this.f7463y5.size() - 1) - 0) + 1) + 0);
            ((TextView) linearLayout.findViewById(R.id.na_install)).setTextColor(i);
            ((TextView) linearLayout.findViewById(R.id.na_install)).setText(getResources().getString(R.string.download) + " app");
            nativeAd.downloadAndDisplayImage(getApplicationContext(), (ImageView) linearLayout.findViewById(R.id.na_media), nativeAd.getWideImageURL());
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(linearLayout.findViewById(R.id.na_view));
            arrayList4.add(linearLayout.findViewById(R.id.na_install));
            nativeAd.registerClickableViews((List<View>) arrayList4);
            nativeAd.setNativeAdView((NativeAdView) linearLayout.findViewById(R.id.na_view));
            linearLayout.findViewById(R.id.na_view).setVisibility(0);
        } else if (intValue == 2) {
            ((RelativeLayout) linearLayout.findViewById(R.id.sa_ad)).getLayoutParams().width = i2;
            NativeAdDetails nativeAdDetails = this.f7470z5.get(new Random().nextInt(((this.f7470z5.size() - 1) - 0) + 1) + 0);
            ((TextView) linearLayout.findViewById(R.id.sa_install)).setTextColor(i);
            ((TextView) linearLayout.findViewById(R.id.sa_install)).setText(getResources().getString(R.string.download) + " app");
            ((ImageView) linearLayout.findViewById(R.id.sa_iv)).setImageBitmap(nativeAdDetails.getImageBitmap());
            nativeAdDetails.registerViewForInteraction(linearLayout);
            linearLayout.findViewById(R.id.sa_ad).setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G0 */
    public void mo7481G0(Context context, Boolean bool) {
        AdColonyInterstitial adColonyInterstitial;
        StartAppAd startAppAd;
        com.facebook.ads.InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        int i = f7137k6;
        if (i == 1 && (interstitialAd2 = f7132f6) != null) {
            interstitialAd2.show((Activity) context);
            f7137k6 = 0;
            f7138l6 = 0;
        } else if (i == 2 || (i == 1 && !f7121U5.equals(""))) {
            if (f7133g6 == null) {
                f7133g6 = new Interstitial(getApplicationContext(), f7123W5);
                if (f7130d6.booleanValue()) {
                    f7133g6.setMute(true);
                }
                if (!f7131e6.booleanValue()) {
                    f7133g6.setAutoPlay(false);
                }
                f7133g6.setBackButtonCanClose(true);
                f7133g6.setSkipText(getResources().getString(R.string.ad_saltar));
                f7133g6.setOnAdLoadedCallback(new C1706g());
                f7133g6.setOnAdErrorCallback(new C1708h());
                f7133g6.setOnAdClosedCallback(new C1710i());
                f7133g6.loadAd();
            }
            f7137k6 = 0;
            f7138l6 = 0;
        } else if (f7137k6 == 3 && (interstitialAd = f7134h6) != null && interstitialAd.isAdLoaded()) {
            f7134h6.show();
            f7137k6 = 0;
            f7138l6 = 0;
        } else if (f7137k6 != 4 || (startAppAd = f7135i6) == null || !startAppAd.isReady()) {
            int i2 = f7137k6;
            if (i2 == 6) {
                Intent intent = new Intent(context, t_url.class);
                intent.putExtra("url", this.f7346h4);
                try {
                    intent.addFlags(C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
                } catch (Exception unused) {
                }
                ((Activity) context).startActivityForResult(intent, 0);
                f7137k6 = 0;
                f7138l6 = 0;
            } else if (i2 == 7) {
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.VIEW");
                intent2.setData(Uri.parse(this.f7352i4));
                intent2.addFlags(268435456);
                ((Activity) context).startActivity(intent2);
                f7137k6 = 0;
                f7138l6 = 0;
            } else if (i2 == 8 && (adColonyInterstitial = f7136j6) != null) {
                try {
                    adColonyInterstitial.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                f7137k6 = 0;
                f7138l6 = 0;
            } else if (i2 == 9 && UnityAds.isInitialized()) {
                UnityAds.load(f7128b6, new C1712j(context));
                f7137k6 = 0;
                f7138l6 = 0;
            } else if (f7137k6 != 10) {
            } else {
                if (!IronSource.isInterstitialReady()) {
                    try {
                        IronSource.loadInterstitial();
                    } catch (Exception unused2) {
                    }
                } else {
                    IronSource.showInterstitial();
                    f7137k6 = 0;
                    f7138l6 = 0;
                }
            }
        } else {
            f7135i6.showAd(f7139m6 == 1 ? "Intersticial normal" : "INTERSTITIAL");
            f7137k6 = 0;
            f7138l6 = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public void mo7482H0(Context context) {
        AdColonyInterstitial adColonyInterstitial;
        StartAppAd startAppAd;
        com.facebook.ads.InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        int i = f7138l6;
        if (i == 1 && (interstitialAd2 = f7132f6) != null) {
            interstitialAd2.show((Activity) context);
            f7137k6 = 0;
            f7138l6 = 0;
        } else if (i == 2 || (i == 1 && !f7121U5.equals(""))) {
            if (f7133g6 == null) {
                f7133g6 = new Interstitial(getApplicationContext(), f7123W5);
                if (f7130d6.booleanValue()) {
                    f7133g6.setMute(true);
                }
                if (!f7131e6.booleanValue()) {
                    f7133g6.setAutoPlay(false);
                }
                f7133g6.setBackButtonCanClose(true);
                f7133g6.setSkipText(getResources().getString(R.string.ad_saltar));
                f7133g6.setOnAdLoadedCallback(new C1716l());
                f7133g6.setOnAdErrorCallback(new C1718m());
                f7133g6.setOnAdClosedCallback(new C1720n());
                f7133g6.loadAd();
            }
            f7137k6 = 0;
            f7138l6 = 0;
        } else if (f7138l6 == 3 && (interstitialAd = f7134h6) != null && interstitialAd.isAdLoaded()) {
            f7134h6.show();
            f7137k6 = 0;
            f7138l6 = 0;
        } else if (f7138l6 != 4 || (startAppAd = f7135i6) == null || !startAppAd.isReady()) {
            int i2 = f7138l6;
            if (i2 == 6) {
                Intent intent = new Intent(context, t_url.class);
                intent.putExtra("url", this.f7346h4);
                try {
                    intent.addFlags(C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
                } catch (Exception unused) {
                }
                ((Activity) context).startActivityForResult(intent, 0);
                f7137k6 = 0;
                f7138l6 = 0;
            } else if (i2 == 7) {
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.VIEW");
                intent2.setData(Uri.parse(this.f7352i4));
                intent2.addFlags(268435456);
                ((Activity) context).startActivity(intent2);
                f7137k6 = 0;
                f7138l6 = 0;
            } else if (i2 == 8 && (adColonyInterstitial = f7136j6) != null) {
                try {
                    adColonyInterstitial.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                f7137k6 = 0;
                f7138l6 = 0;
            } else if (i2 == 9 && UnityAds.isInitialized()) {
                UnityAds.load(f7128b6, new C1724o(context));
                f7137k6 = 0;
                f7138l6 = 0;
            } else if (f7138l6 == 10 && IronSource.isInterstitialReady()) {
                IronSource.showInterstitial();
                f7137k6 = 0;
                f7138l6 = 0;
            }
        } else {
            f7135i6.showAd(f7139m6 == 1 ? "Intersticial chat" : "INTERSTITIAL");
            f7137k6 = 0;
            f7138l6 = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public void mo7483J0(Context context, int i, String str, String str2) {
        String str3;
        String str4;
        String str5;
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        long j = sharedPreferences.getLong("idusu", 0);
        String str6 = this.f7262T2;
        if (str6 == null || str6.equals("")) {
            String str7 = getResources().getString(R.string.wallet_msg_1).replace("@X@", this.f7250R2 + " " + this.f7256S2) + "\n\n" + getResources().getString(R.string.wallet_msg_2);
            int i2 = this.f7268U2;
            if (i2 == 0) {
                str4 = str7.replace("@Y@", getResources().getString(R.string.acceder_unavez));
            } else if (i2 == 18000) {
                str4 = str7.replace("@Y@", getResources().getString(R.string.siempre));
            } else {
                if (i2 == 1) {
                    str5 = "1 " + getResources().getString(R.string.hora);
                } else if (i2 < 25) {
                    str5 = this.f7268U2 + " " + getResources().getString(R.string.horas);
                } else if (i2 < 2161) {
                    str5 = (this.f7268U2 / 24) + " " + getResources().getString(R.string.dias);
                } else if (i2 == 8784) {
                    str5 = "1 " + getResources().getString(R.string.anyo);
                } else if (i2 == 17568) {
                    str5 = "2 " + getResources().getString(R.string.anyos);
                } else {
                    str5 = "";
                }
                if (str5 != "") {
                    str4 = str7.replace("@Y@", str5);
                } else {
                    return;
                }
            }
            str3 = (str4 + "\n\n" + getResources().getString(R.string.wallet_msg_3)) + "\n\n" + getResources().getString(R.string.wallet_msg_4);
        } else {
            str3 = this.f7262T2;
        }
        AlertDialog create = new AlertDialog.Builder(context).setNegativeButton(R.string.cancelar, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.aceptar, new C1738x(j, i, sharedPreferences, context)).setMessage(str3).create();
        if (!str.equals("")) {
            create.setOnShowListener(new C1739y(create, str));
        }
        create.show();
        try {
            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused) {
        }
    }

    /* renamed from: M */
    public boolean mo7484M() {
        return m8160N() || m8161O() || m8163P();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public String mo7485M0(int i) {
        return i == 2 ? "CaviarDreams.ttf" : i == 3 ? "Pacifico.ttf" : i == 4 ? "Sansation-Regular.ttf" : i == 5 ? "Walkway_Bold.ttf" : "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void mo7486N0(Context context, boolean z) {
        FragmentActivity_ext_class fragmentActivity_ext_class;
        Activity_ext_class activity_ext_class;
        int i;
        C1855l[] lVarArr;
        C1855l[] lVarArr2;
        int i2;
        Context context2 = context;
        C1855l lVar = null;
        if (z) {
            activity_ext_class = null;
            fragmentActivity_ext_class = (FragmentActivity_ext_class) context2;
        } else {
            fragmentActivity_ext_class = null;
            activity_ext_class = (Activity_ext_class) context2;
        }
        int i3 = this.f7318d;
        int i4 = 0;
        if (i3 > -1 && (lVarArr = this.f7231O1) != null && i3 < lVarArr.length) {
            int i5 = 0;
            while (true) {
                lVarArr2 = this.f7231O1;
                if (i5 >= lVarArr2.length) {
                    break;
                } else if (lVarArr2[i5].f7954t == 22) {
                    lVar = lVarArr2[i5];
                    break;
                } else {
                    i5++;
                }
            }
            if (!(lVar == null || (i2 = lVarArr2[this.f7318d].f7954t) == 22 || ((i2 == 12 && !lVar.f7918g1) || (i2 == 14 && !lVar.f7921h1)))) {
                String str = this.f7231O1[this.f7318d].f7964y + "";
                SharedPreferences sharedPreferences = context2.getSharedPreferences("sh", 0);
                String[] split = sharedPreferences.getString("seccs_ultimas", "").split(",");
                String str2 = str;
                int i6 = 0;
                while (i6 < split.length && i6 < 7) {
                    if (!split[i6].equals(str)) {
                        str2 = str2 + "," + split[i6];
                    }
                    i6++;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("seccs_ultimas", str2);
                edit.apply();
            }
        }
        if (f7115O5.length > 0) {
            BottomNavigationView bottomNavigationView = (BottomNavigationView) ((Activity) context2).findViewById(R.id.navigation_b);
            if (!f7117Q5.equals("") && !f7118R5.equals("")) {
                bottomNavigationView.setBackgroundColor(Color.parseColor("#" + f7117Q5));
                int parseColor = Color.parseColor("#" + f7118R5);
                StringBuilder sb = new StringBuilder();
                sb.append("#");
                sb.append(f7117Q5);
                ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{16842913}, new int[]{16842910}}, new int[]{m8194o(parseColor, 0.4f, m8153I(sb.toString()) ? 2 : 1), parseColor});
                bottomNavigationView.setItemTextColor(colorStateList);
                bottomNavigationView.setItemIconTintList(colorStateList);
            }
            bottomNavigationView.getMenu().clear();
            int i7 = 0;
            while (i7 < f7115O5.length) {
                Menu menu = bottomNavigationView.getMenu();
                C1730q0[] q0VarArr = f7115O5;
                menu.add(i4, q0VarArr[i7].f7544b, i4, q0VarArr[i7].f7543a);
                if (f7115O5[i7].f7546d > 0) {
                    bottomNavigationView.getMenu().getItem(i7).setIcon(Drawable.createFromPath(context2.getFileStreamPath("ico_mb_it" + f7115O5[i7].f7544b).getAbsolutePath()));
                }
                f7115O5[i7].f7549g = bottomNavigationView.getMenu().getItem(i7);
                MenuItem item = bottomNavigationView.getMenu().getItem(i7);
                C1735u uVar = r0;
                C1735u uVar2 = new C1735u(context, z, fragmentActivity_ext_class, activity_ext_class);
                item.setOnMenuItemClickListener(uVar);
                i7++;
                i4 = 0;
            }
            if (f7116P5 != -1) {
                bottomNavigationView.getMenu().findItem(f7116P5).setChecked(true);
                f7116P5 = -1;
                i = 0;
            } else {
                i = 0;
                bottomNavigationView.getMenu().setGroupCheckable(0, true, false);
                for (int i8 = 0; i8 < bottomNavigationView.getMenu().size(); i8++) {
                    bottomNavigationView.getMenu().getItem(i8).setChecked(false);
                }
                bottomNavigationView.getMenu().setGroupCheckable(0, true, true);
            }
            bottomNavigationView.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo7487Q(int i) {
        if (f7144r6 == null) {
            f7144r6 = Typeface.create(Typeface.MONOSPACE, 0);
            f7143q6 = Typeface.create(Typeface.SERIF, 0);
            f7142p6 = Typeface.create(Typeface.SANS_SERIF, 0);
        }
        mo7496b1(this, "DEFAULT", i);
        mo7496b1(this, "MONOSPACE", i);
        mo7496b1(this, "SERIF", i);
        mo7496b1(this, "SANS_SERIF", i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo7488Q0(Context context, int i, String str, Bundle bundle) {
        if (i != -1 && bundle == null) {
            SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
            C1855l lVar = this.f7231O1[i];
            if (!lVar.f7940o.equals("")) {
                if (!sharedPreferences.getBoolean("popup_nomas_" + lVar.f7964y, false)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
                    if (!lVar.f7937n.equals("")) {
                        builder.setTitle(lVar.f7937n);
                    }
                    if (lVar.f7943p) {
                        View inflate = ((Activity) context).getLayoutInflater().inflate(R.layout.bienvenida, (ViewGroup) null);
                        TextView textView = (TextView) inflate.findViewById(R.id.message);
                        textView.setMovementMethod(new ScrollingMovementMethod());
                        textView.setText(Html.fromHtml(lVar.f7940o));
                        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.skip);
                        if (!str.equals("")) {
                            m8197q(checkBox, str);
                        }
                        checkBox.setChecked(lVar.f7946q);
                        checkBox.setTag(Integer.valueOf(i));
                        builder.setView(inflate);
                    } else {
                        builder.setMessage(Html.fromHtml(lVar.f7940o));
                    }
                    builder.setCancelable(false);
                    if (lVar.f7943p) {
                        builder.setPositiveButton(getString(R.string.aceptar), new C1696b0());
                    } else {
                        builder.setPositiveButton(getString(R.string.aceptar), (DialogInterface.OnClickListener) null);
                    }
                    AlertDialog create = builder.create();
                    if (!str.equals("")) {
                        create.setOnShowListener(new C1699c0(create, str));
                    }
                    try {
                        create.show();
                        if (!lVar.f7943p) {
                            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo7489T(Context context, ImageView imageView, String str) {
        AlertDialog alertDialog;
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        long j = sharedPreferences.getLong("idusu", 0);
        String string = sharedPreferences.getString("cod", "");
        String str2 = (String) imageView.getTag(R.id.idaux1);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (sharedPreferences.getBoolean("ban_" + str2, false)) {
            alertDialog = builder.setPositiveButton(R.string.aceptar, (DialogInterface.OnClickListener) null).setMessage(R.string.usu_yareportado).create();
        } else {
            alertDialog = builder.setNegativeButton(R.string.cancelar, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.aceptar, new C1733s(context, str2, j, string, sharedPreferences)).setMessage(getResources().getString(R.string.confirmar_elimcontent)).create();
        }
        if (!str.equals("")) {
            alertDialog.setOnShowListener(new C1734t(alertDialog, str));
        }
        alertDialog.show();
        try {
            ((TextView) alertDialog.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public void mo7490V0() {
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        String[] split = sharedPreferences.getString("idseccs", "").split(",");
        String string = sharedPreferences.getString("idofics", "");
        String[] strArr = new String[0];
        if (!string.equals("")) {
            strArr = string.split(",");
        }
        mo7529z(split, strArr, (Bundle) null, (Intent) null);
        this.f7312c = sharedPreferences.getInt("ind_secc_sel", 0);
        this.f7318d = sharedPreferences.getInt("ind_secc_sel_2", 0);
        try {
            mo7487Q(Integer.parseInt(sharedPreferences.getString("ft", SessionDescription.SUPPORTED_SDP_VERSION)));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @android.annotation.TargetApi(11)
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7491W(java.lang.String r9, java.lang.String r10, java.lang.String r11, android.content.Context r12) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            boolean r1 = r9.equals(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r9.toLowerCase(r1)
            android.app.DownloadManager$Request r2 = new android.app.DownloadManager$Request     // Catch:{ Exception -> 0x00b9 }
            android.net.Uri r3 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x00b9 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00b9 }
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 10
            r5 = 1
            if (r3 <= r4) goto L_0x0027
            r2.allowScanningByMediaScanner()
            r2.setNotificationVisibility(r5)
        L_0x0027:
            java.lang.String r3 = ".apk"
            java.lang.String r4 = ".mp4"
            java.lang.String r6 = ".mp3"
            if (r10 == 0) goto L_0x0035
            boolean r7 = r10.equals(r0)
            if (r7 == 0) goto L_0x004f
        L_0x0035:
            boolean r7 = r1.endsWith(r6)
            if (r7 == 0) goto L_0x003e
            java.lang.String r10 = "audio/mpeg"
            goto L_0x004f
        L_0x003e:
            boolean r7 = r1.endsWith(r4)
            if (r7 == 0) goto L_0x0047
            java.lang.String r10 = "video/mp4"
            goto L_0x004f
        L_0x0047:
            boolean r7 = r1.endsWith(r3)
            if (r7 == 0) goto L_0x004f
            java.lang.String r10 = "application/vnd.android.package-archive"
        L_0x004f:
            if (r10 == 0) goto L_0x005c
            boolean r7 = r10.equals(r0)
            if (r7 != 0) goto L_0x005c
            r2.setMimeType(r10)     // Catch:{ Exception -> 0x005b }
            goto L_0x005c
        L_0x005b:
        L_0x005c:
            boolean r10 = r11.equals(r0)
            if (r10 == 0) goto L_0x0081
            boolean r10 = r1.endsWith(r6)
            if (r10 != 0) goto L_0x0074
            boolean r10 = r1.endsWith(r4)
            if (r10 != 0) goto L_0x0074
            boolean r10 = r1.endsWith(r3)
            if (r10 == 0) goto L_0x0081
        L_0x0074:
            r10 = 47
            int r10 = r9.lastIndexOf(r10)     // Catch:{ Exception -> 0x0080 }
            int r10 = r10 + r5
            java.lang.String r11 = r9.substring(r10)     // Catch:{ Exception -> 0x0080 }
            goto L_0x0081
        L_0x0080:
        L_0x0081:
            boolean r9 = r11.equals(r0)
            if (r9 != 0) goto L_0x0098
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0098 }
            r10 = 29
            if (r9 < r10) goto L_0x0093
            java.lang.String r9 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch:{ Exception -> 0x0098 }
            r2.setDestinationInExternalPublicDir(r9, r11)     // Catch:{ Exception -> 0x0098 }
            goto L_0x0098
        L_0x0093:
            java.lang.String r9 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch:{ Exception -> 0x0098 }
            r2.setDestinationInExternalFilesDir(r12, r9, r11)     // Catch:{ Exception -> 0x0098 }
        L_0x0098:
            java.lang.String r9 = "download"
            java.lang.Object r9 = r8.getSystemService(r9)     // Catch:{  }
            android.app.DownloadManager r9 = (android.app.DownloadManager) r9     // Catch:{  }
            r9.enqueue(r2)     // Catch:{  }
            android.content.Context r9 = r8.getApplicationContext()     // Catch:{  }
            android.content.res.Resources r10 = r8.getResources()     // Catch:{  }
            r11 = 2131820773(0x7f1100e5, float:1.927427E38)
            java.lang.String r10 = r10.getString(r11)     // Catch:{  }
            android.widget.Toast r9 = android.widget.Toast.makeText(r9, r10, r5)     // Catch:{  }
            r9.show()     // Catch:{  }
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1692config.mo7491W(java.lang.String, java.lang.String, java.lang.String, android.content.Context):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: X0 */
    public void mo7492X0(String str, Typeface typeface) {
        try {
            Field declaredField = Typeface.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set((Object) null, typeface);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public int[] mo7493Y(String str, ImageView imageView) {
        int[] iArr = {0, 0};
        try {
            FileInputStream openFileInput = openFileInput(str);
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileInput.getFD());
            openFileInput.close();
            imageView.setImageBitmap(decodeFileDescriptor);
            iArr[0] = decodeFileDescriptor.getWidth();
            iArr[1] = decodeFileDescriptor.getHeight();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError unused) {
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x025a, code lost:
        if ((java.lang.System.currentTimeMillis() - r0.longValue()) > ((((r3 * 24) * 60) * 60) * 1000)) goto L_0x0220;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x025f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01b3  */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7494Z0(android.content.Context r21, android.view.View r22, java.lang.String r23, android.app.ProgressDialog r24, com.google.android.gms.ads.rewarded.RewardedAdLoadCallback r25, com.appnext.ads.fullscreen.RewardedVideo r26, com.facebook.ads.RewardedVideoAd r27, com.startapp.sdk.adsbase.StartAppAd r28, com.adcolony.sdk.AdColonyInterstitialListener r29, android.view.View r30) {
        /*
            r20 = this;
            r12 = r20
            r5 = r21
            r13 = r23
            java.lang.String r0 = "sh"
            r10 = 0
            android.content.SharedPreferences r0 = r12.getSharedPreferences(r0, r10)
            r1 = 2131361812(0x7f0a0014, float:1.8343387E38)
            r11 = r22
            java.lang.Object r1 = r11.getTag(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r2 = r1.intValue()
            int r3 = r12.f7342h
            int r3 = r3 + 10000
            r4 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r14 = 1
            if (r2 != r3) goto L_0x003f
            int r1 = r12.f7241Q
            if (r1 <= r14) goto L_0x003c
            java.util.ArrayList<java.lang.Integer> r2 = f7114N5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r2.indexOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0100
        L_0x003c:
            r1 = r4
            goto L_0x0100
        L_0x003f:
            int r2 = r1.intValue()
            int r3 = r12.f7348i
            int r3 = r3 + 10000
            if (r2 != r3) goto L_0x005d
            int r1 = r12.f7265U
            if (r1 <= r14) goto L_0x003c
            java.util.ArrayList<java.lang.Integer> r2 = f7114N5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r2.indexOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0100
        L_0x005d:
            int r2 = r1.intValue()
            int r3 = r12.f7366l
            int r3 = r3 + 10000
            if (r2 != r3) goto L_0x007b
            int r1 = r12.f7409r0
            if (r1 <= r14) goto L_0x003c
            java.util.ArrayList<java.lang.Integer> r2 = f7114N5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r2.indexOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0100
        L_0x007b:
            int r2 = r1.intValue()
            int r3 = r12.f7373m
            int r3 = r3 + 10000
            if (r2 != r3) goto L_0x0098
            int r1 = r12.f7437v0
            if (r1 <= r14) goto L_0x003c
            java.util.ArrayList<java.lang.Integer> r2 = f7114N5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r2.indexOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0100
        L_0x0098:
            int r2 = r1.intValue()
            int r3 = r12.f7360k
            int r3 = r3 + 10000
            if (r2 != r3) goto L_0x00be
            int r1 = r12.f7381n0
            if (r1 <= r14) goto L_0x00b5
            java.util.ArrayList<java.lang.Integer> r2 = f7114N5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r2.indexOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0100
        L_0x00b5:
            if (r1 != 0) goto L_0x003c
            int r1 = r12.f7429u
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0100
        L_0x00be:
            int r2 = r1.intValue()
            int r3 = r12.f7354j
            int r3 = r3 + 10000
            if (r2 != r3) goto L_0x00e4
            int r1 = r12.f7289Y
            if (r1 <= r14) goto L_0x00db
            java.util.ArrayList<java.lang.Integer> r2 = f7114N5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r2.indexOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0100
        L_0x00db:
            if (r1 != 0) goto L_0x003c
            int r1 = r12.f7422t
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0100
        L_0x00e4:
            int r2 = r1.intValue()
            int r3 = r12.f7380n
            int r3 = r3 + 10000
            if (r2 != r3) goto L_0x0100
            int r1 = r12.f7465z0
            if (r1 <= r14) goto L_0x003c
            java.util.ArrayList<java.lang.Integer> r2 = f7114N5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r2.indexOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0100:
            java.lang.String r2 = r12.f7250R2
            r3 = 0
            java.lang.String r15 = ""
            if (r2 == 0) goto L_0x01b9
            boolean r2 = r2.equals(r15)
            if (r2 != 0) goto L_0x01b9
            int r2 = r1.intValue()
            if (r2 < 0) goto L_0x01b9
            int r2 = r1.intValue()
            british.x.l[] r6 = r12.f7231O1
            int r7 = r6.length
            if (r2 >= r7) goto L_0x01b9
            int r2 = r1.intValue()
            r2 = r6[r2]
            boolean r2 = r2.f7866K
            if (r2 == 0) goto L_0x01b9
            british.x.l[] r2 = r12.f7231O1
            int r1 = r1.intValue()
            r1 = r2[r1]
            int r6 = r1.f7964y
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "secc"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r7 = "_pagada"
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            boolean r1 = r0.getBoolean(r1, r10)
            if (r1 == 0) goto L_0x0176
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r6)
            java.lang.String r7 = "_fhasta"
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            long r7 = r0.getLong(r1, r3)
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            long r7 = java.lang.System.currentTimeMillis()
            long r16 = r1.longValue()
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x0176
            return r10
        L_0x0176:
            java.lang.String r1 = "idusu"
            long r3 = r0.getLong(r1, r3)
            java.lang.String r1 = "cod"
            java.lang.String r7 = r0.getString(r1, r15)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = "_intentado"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.getBoolean(r1, r10)
            if (r0 == 0) goto L_0x01b3
            british.x.config$o0 r11 = new british.x.config$o0
            java.lang.String r8 = r12.f7368l1
            r0 = r11
            r1 = r20
            r2 = r21
            r5 = r7
            r7 = r23
            r9 = r30
            r0.<init>(r2, r3, r5, r6, r7, r8, r9)
            java.lang.String[] r0 = new java.lang.String[r10]
            r11.execute(r0)
            goto L_0x01b8
        L_0x01b3:
            java.lang.String r0 = r12.f7368l1
            r12.mo7483J0(r5, r6, r13, r0)
        L_0x01b8:
            return r14
        L_0x01b9:
            java.lang.String r2 = r12.f7251R3
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            if (r2 == 0) goto L_0x01c7
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L_0x020e
        L_0x01c7:
            java.lang.String r2 = r12.f7245Q3
            if (r2 == 0) goto L_0x01d1
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L_0x020e
        L_0x01d1:
            java.lang.String r2 = r12.f7269U3
            if (r2 == 0) goto L_0x01db
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L_0x020e
        L_0x01db:
            java.lang.String r2 = r12.f7275V3
            if (r2 == 0) goto L_0x01e5
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L_0x020e
        L_0x01e5:
            java.lang.String r2 = r12.f7281W3
            if (r2 == 0) goto L_0x01ef
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L_0x020e
        L_0x01ef:
            java.lang.String r2 = r12.f7358j4
            if (r2 == 0) goto L_0x01f9
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L_0x020e
        L_0x01f9:
            java.lang.String r2 = r12.f7287X3
            if (r2 == 0) goto L_0x0203
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L_0x020e
        L_0x0203:
            java.lang.String r2 = r12.f7293Y3
            if (r2 == 0) goto L_0x0226
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L_0x020e
            goto L_0x0226
        L_0x020e:
            java.lang.String r2 = "fult_rew"
            long r16 = r0.getLong(r2, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            long r16 = r0.longValue()
            int r2 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0222
        L_0x0220:
            r0 = 1
            goto L_0x025d
        L_0x0222:
            int r2 = r12.f7340g4
            if (r2 != 0) goto L_0x0228
        L_0x0226:
            r0 = 0
            goto L_0x025d
        L_0x0228:
            if (r2 != r14) goto L_0x022b
            goto L_0x0220
        L_0x022b:
            r3 = 30
            if (r2 != r9) goto L_0x0232
            r3 = 1
            goto L_0x0240
        L_0x0232:
            if (r2 != r8) goto L_0x0237
            r3 = 3
            goto L_0x0240
        L_0x0237:
            if (r2 != r7) goto L_0x023c
            r3 = 7
            goto L_0x0240
        L_0x023c:
            if (r2 != r6) goto L_0x0240
            r3 = 15
        L_0x0240:
            long r16 = java.lang.System.currentTimeMillis()
            long r18 = r0.longValue()
            long r16 = r16 - r18
            r18 = 24
            long r3 = r3 * r18
            r18 = 60
            long r3 = r3 * r18
            long r3 = r3 * r18
            r18 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r18
            int r0 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0226
            goto L_0x0220
        L_0x025d:
            if (r0 != 0) goto L_0x0260
            return r10
        L_0x0260:
            int r0 = r1.intValue()
            if (r0 < 0) goto L_0x0406
            int r0 = r1.intValue()
            british.x.l[] r2 = r12.f7231O1
            int r3 = r2.length
            if (r0 >= r3) goto L_0x0406
            int r0 = r1.intValue()
            r0 = r2[r0]
            boolean r0 = r0.f7860H
            if (r0 == 0) goto L_0x0406
            java.lang.String r0 = r12.f7251R3
            if (r0 == 0) goto L_0x0285
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x0285
            r0 = 1
            goto L_0x0286
        L_0x0285:
            r0 = 0
        L_0x0286:
            java.lang.String r1 = r12.f7245Q3
            if (r1 == 0) goto L_0x0292
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x0292
            r1 = 1
            goto L_0x0293
        L_0x0292:
            r1 = 0
        L_0x0293:
            java.lang.String r2 = r12.f7269U3
            if (r2 == 0) goto L_0x029f
            boolean r2 = r2.equals(r15)
            if (r2 != 0) goto L_0x029f
            r2 = 1
            goto L_0x02a0
        L_0x029f:
            r2 = 0
        L_0x02a0:
            java.lang.String r3 = r12.f7275V3
            if (r3 == 0) goto L_0x02ac
            boolean r3 = r3.equals(r15)
            if (r3 != 0) goto L_0x02ac
            r3 = 1
            goto L_0x02ad
        L_0x02ac:
            r3 = 0
        L_0x02ad:
            java.lang.String r4 = r12.f7281W3
            if (r4 == 0) goto L_0x02b9
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x02b9
            r4 = 1
            goto L_0x02ba
        L_0x02b9:
            r4 = 0
        L_0x02ba:
            java.lang.String r10 = r12.f7358j4
            if (r10 == 0) goto L_0x02c6
            boolean r10 = r10.equals(r15)
            if (r10 != 0) goto L_0x02c6
            r10 = 1
            goto L_0x02c7
        L_0x02c6:
            r10 = 0
        L_0x02c7:
            java.lang.String r6 = r12.f7287X3
            if (r6 == 0) goto L_0x02d3
            boolean r6 = r6.equals(r15)
            if (r6 != 0) goto L_0x02d3
            r6 = 1
            goto L_0x02d4
        L_0x02d3:
            r6 = 0
        L_0x02d4:
            java.lang.String r7 = r12.f7293Y3
            if (r7 == 0) goto L_0x02e0
            boolean r7 = r7.equals(r15)
            if (r7 != 0) goto L_0x02e0
            r7 = 1
            goto L_0x02e1
        L_0x02e0:
            r7 = 0
        L_0x02e1:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r1 == 0) goto L_0x02ef
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            r8.add(r9)
        L_0x02ef:
            if (r0 == 0) goto L_0x02ff
            if (r1 == 0) goto L_0x02f7
            boolean r0 = f7141o6
            if (r0 != 0) goto L_0x02ff
        L_0x02f7:
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.add(r0)
        L_0x02ff:
            if (r2 == 0) goto L_0x0309
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.add(r0)
        L_0x0309:
            if (r3 == 0) goto L_0x0313
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.add(r0)
        L_0x0313:
            if (r4 == 0) goto L_0x031d
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.add(r0)
        L_0x031d:
            r0 = 6
            if (r10 == 0) goto L_0x0327
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r8.add(r1)
        L_0x0327:
            if (r6 == 0) goto L_0x0337
            boolean r1 = com.unity3d.ads.UnityAds.isInitialized()
            if (r1 == 0) goto L_0x0337
            r1 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.add(r1)
        L_0x0337:
            if (r7 == 0) goto L_0x0348
            boolean r1 = com.ironsource.mediationsdk.IronSource.isRewardedVideoAvailable()
            if (r1 == 0) goto L_0x0348
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.add(r1)
        L_0x0348:
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x0367
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            int r2 = r8.size()
            int r2 = r2 - r14
            r3 = 0
            int r2 = r2 - r3
            int r2 = r2 + r14
            int r1 = r1.nextInt(r2)
            int r1 = r1 + r3
            java.lang.Object r1 = r8.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x036c
        L_0x0367:
            r3 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
        L_0x036c:
            r3 = r1
            int r1 = r3.intValue()
            if (r1 != r0) goto L_0x0389
            android.content.res.Resources r0 = r20.getResources()
            r1 = 2131821045(0x7f1101f5, float:1.9274822E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = r12.f7263T3
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x039e
            java.lang.String r0 = r12.f7263T3
            goto L_0x039e
        L_0x0389:
            android.content.res.Resources r0 = r20.getResources()
            r1 = 2131821044(0x7f1101f4, float:1.927482E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = r12.f7257S3
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x039e
            java.lang.String r0 = r12.f7257S3
        L_0x039e:
            r10 = r0
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r5)
            r1 = 2131820619(0x7f11004b, float:1.9273958E38)
            r2 = 0
            android.app.AlertDialog$Builder r9 = r0.setNegativeButton(r1, r2)
            r8 = 2131820577(0x7f110021, float:1.9273873E38)
            british.x.config$z r7 = new british.x.config$z
            r0 = r7
            r1 = r20
            r2 = r24
            r4 = r26
            r5 = r21
            r6 = r25
            r14 = r7
            r7 = r27
            r12 = 2131820577(0x7f110021, float:1.9273873E38)
            r8 = r28
            r12 = r9
            r9 = r29
            r13 = r10
            r10 = r30
            r11 = r22
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = 2131820577(0x7f110021, float:1.9273873E38)
            android.app.AlertDialog$Builder r0 = r12.setPositiveButton(r0, r14)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r13)
            android.app.AlertDialog r0 = r0.create()
            r1 = r23
            boolean r2 = r1.equals(r15)
            if (r2 != 0) goto L_0x03f1
            british.x.config$a0 r2 = new british.x.config$a0
            r3 = r20
            r2.<init>(r0, r1)
            r0.setOnShowListener(r2)
            goto L_0x03f3
        L_0x03f1:
            r3 = r20
        L_0x03f3:
            r0.show()
            r1 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x0404 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x0404 }
            android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x0404 }
            r0.setTypeface(r1)     // Catch:{ Exception -> 0x0404 }
        L_0x0404:
            r0 = 1
            return r0
        L_0x0406:
            r3 = r12
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1692config.mo7494Z0(android.content.Context, android.view.View, java.lang.String, android.app.ProgressDialog, com.google.android.gms.ads.rewarded.RewardedAdLoadCallback, com.appnext.ads.fullscreen.RewardedVideo, com.facebook.ads.RewardedVideoAd, com.startapp.sdk.adsbase.StartAppAd, com.adcolony.sdk.AdColonyInterstitialListener, android.view.View):boolean");
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C5141a.m23441l(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b1 */
    public void mo7496b1(Context context, String str, int i) {
        Typeface typeface;
        if (i == 0) {
            typeface = Typeface.defaultFromStyle(0);
        } else if (i == 1) {
            try {
                typeface = Typeface.createFromFile(new File(getFilesDir(), "font"));
            } catch (Exception unused) {
                typeface = Typeface.defaultFromStyle(0);
            }
        } else {
            String M0 = mo7485M0(i);
            if (M0.equals("")) {
                typeface = Typeface.defaultFromStyle(0);
            } else {
                AssetManager assets = context.getAssets();
                typeface = Typeface.createFromAsset(assets, "fonts/" + M0);
            }
        }
        mo7492X0(str, typeface);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|15|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004e */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7497c(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = this;
            android.net.Uri r0 = android.net.Uri.parse(r7)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L_0x000f
            boolean r1 = m8207y0(r6, r0)
            goto L_0x0013
        L_0x000f:
            boolean r1 = m8208z0(r6, r0)
        L_0x0013:
            r2 = 1
            if (r1 == 0) goto L_0x0017
            return r2
        L_0x0017:
            boolean r1 = r5.f7296Z0
            if (r1 == 0) goto L_0x005e
            boolean r1 = m8180b(r7)
            if (r1 == 0) goto L_0x005e
            q.d$a r1 = new q.d$a     // Catch:{ Exception -> 0x005a }
            r1.<init>()     // Catch:{ Exception -> 0x005a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004e }
            r3.<init>()     // Catch:{ Exception -> 0x004e }
            java.lang.String r4 = "#"
            r3.append(r4)     // Catch:{ Exception -> 0x004e }
            java.lang.String r4 = r5.f7313c1     // Catch:{ Exception -> 0x004e }
            r3.append(r4)     // Catch:{ Exception -> 0x004e }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x004e }
            int r3 = android.graphics.Color.parseColor(r3)     // Catch:{ Exception -> 0x004e }
            q.a$a r4 = new q.a$a     // Catch:{ Exception -> 0x004e }
            r4.<init>()     // Catch:{ Exception -> 0x004e }
            q.a$a r3 = r4.mo22900b(r3)     // Catch:{ Exception -> 0x004e }
            q.a r3 = r3.mo22899a()     // Catch:{ Exception -> 0x004e }
            q.d$a r1 = r1.mo22910b(r3)     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            q.d r1 = r1.mo22909a()     // Catch:{ Exception -> 0x005a }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x005a }
            r1.mo22908a(r6, r7)     // Catch:{ Exception -> 0x005a }
            return r2
        L_0x005a:
            r7 = move-exception
            r7.printStackTrace()
        L_0x005e:
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r7.<init>(r1, r0)
            r6.startActivity(r7)     // Catch:{ Exception -> 0x0069 }
            return r2
        L_0x0069:
            r6 = move-exception
            r6.printStackTrace()
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1692config.mo7497c(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: c1 */
    public void mo7498c1() {
        Intent intent = new Intent(this, s_mediaplayer_exo.class);
        intent.putExtra("accion", "stop");
        startService(intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo7499d(Context context, int i) {
        if (i != -1) {
            ((Activity) context).startActivityForResult(mo7475B(Integer.valueOf(i), this).f7842a, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public boolean mo7500d1(Context context, int i) {
        PackageInfo packageInfo;
        String[] strArr;
        Boolean bool = Boolean.FALSE;
        try {
            packageInfo = getPackageManager().getPackageInfo(getPackageName(), 4096);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        if (!(packageInfo == null || (strArr = packageInfo.requestedPermissions) == null)) {
            bool = Boolean.valueOf(Arrays.asList(strArr).contains("android.permission.CAMERA"));
        }
        if (!bool.booleanValue() || C0600b.m3289a(this, "android.permission.CAMERA") == 0) {
            return false;
        }
        C0008a.m34p((Activity) context, new String[]{"android.permission.CAMERA"}, i);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((r2 - r4) % r3.f7447w3) == 0) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: e1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7501e1(android.content.Context r4, android.content.SharedPreferences r5, java.lang.String r6) {
        /*
            r3 = this;
            int r4 = r3.f7440v3
            r0 = 1
            r1 = 0
            if (r4 <= 0) goto L_0x0053
            int r4 = r3.f7447w3
            if (r4 <= 0) goto L_0x0053
            java.lang.String r4 = r3.f7426t3
            java.lang.String r2 = ""
            if (r4 == 0) goto L_0x0020
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0020
            java.util.ArrayList<com.appnext.nativeads.NativeAd> r4 = r3.f7463y5
            if (r4 == 0) goto L_0x0020
            int r4 = r4.size()
            if (r4 > 0) goto L_0x0034
        L_0x0020:
            java.lang.String r4 = r3.f7433u3
            if (r4 == 0) goto L_0x0053
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0053
            java.util.ArrayList<com.startapp.sdk.ads.nativead.NativeAdDetails> r4 = r3.f7470z5
            if (r4 == 0) goto L_0x0053
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0053
        L_0x0034:
            java.lang.String r4 = "n_inchat"
            int r2 = r5.getInt(r4, r1)
            int r2 = r2 + r0
            android.content.SharedPreferences$Editor r5 = r5.edit()
            r5.putInt(r4, r2)
            r5.commit()
            int r4 = r3.f7440v3
            if (r2 != r4) goto L_0x004a
            goto L_0x0054
        L_0x004a:
            if (r2 <= r4) goto L_0x0053
            int r2 = r2 - r4
            int r4 = r3.f7447w3
            int r2 = r2 % r4
            if (r2 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            if (r0 == 0) goto L_0x0065
            android.os.Handler r4 = new android.os.Handler
            r4.<init>()
            british.x.config$q r5 = new british.x.config$q
            r5.<init>(r6)
            r0 = 2000(0x7d0, double:9.88E-321)
            r4.postDelayed(r5, r0)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1692config.mo7501e1(android.content.Context, android.content.SharedPreferences, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo7502f(Context context, RewardedVideo rewardedVideo) {
        if (rewardedVideo == null) {
            return false;
        }
        try {
            rewardedVideo.setOnAdLoadedCallback((OnAdLoaded) context);
            rewardedVideo.setOnAdClosedCallback((OnAdClosed) context);
            rewardedVideo.setOnAdErrorCallback((OnAdError) context);
            rewardedVideo.setOnVideoEndedCallback((OnVideoEnded) context);
            rewardedVideo.loadAd();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f1 */
    public void mo7503f1(Context context, boolean z, boolean z2) {
        mo7504g1(context, z, z2, true);
    }

    /* renamed from: g1 */
    public void mo7504g1(Context context, boolean z, boolean z2, boolean z3) {
        mo7506h1(context, z, z2, true, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public File mo7505h0(Context context, int i) {
        File externalFilesDir = context.getExternalFilesDir((String) null);
        return new File(externalFilesDir, "dt_foto" + i + "_temp.jpg");
    }

    /* renamed from: h1 */
    public void mo7506h1(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        int i2;
        mo7481G0(context, Boolean.valueOf(z3));
        if (f7137k6 <= 0) {
            if (z || z2) {
                int i3 = f7138l6;
                if (i3 != 2) {
                    if (z) {
                        f7137k6 = 1;
                    } else if (z2) {
                        f7137k6 = 3;
                    } else {
                        return;
                    }
                    if (i3 == 0) {
                        mo7521p(context);
                    }
                    SharedPreferences.Editor edit = getSharedPreferences("sh", 0).edit();
                    edit.putInt("n_imp", 0);
                    edit.putInt("n_imp_chat", 0);
                    edit.commit();
                    return;
                }
                return;
            }
            if ((!z4 && this.f7391o3 > 0) || (z4 && this.f7398p3 > 0)) {
                SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
                int i4 = sharedPreferences.getInt("n_imp", 0) + 1;
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putInt("n_imp", i4);
                edit2.commit();
                if ((!z4 && (i2 = this.f7391o3) > 0 && i4 % i2 == 0) || (z4 && (i = this.f7398p3) > 0 && i4 % i == 0)) {
                    edit2.putInt("n_imp_chat", 0);
                    edit2.commit();
                    ArrayList arrayList = new ArrayList();
                    if (!f7124X5.equals("")) {
                        arrayList.add(1);
                    }
                    if (!f7121U5.equals("") && (f7124X5.equals("") || !f7141o6)) {
                        arrayList.add(2);
                    }
                    if (!f7125Y5.equals("")) {
                        arrayList.add(3);
                    }
                    if (!f7126Z5.equals("")) {
                        arrayList.add(4);
                    }
                    if (!this.f7346h4.equals("")) {
                        arrayList.add(6);
                    }
                    if (!this.f7352i4.equals("")) {
                        arrayList.add(7);
                    }
                    if (!f7127a6.equals("")) {
                        arrayList.add(8);
                    }
                    if (!f7128b6.equals("")) {
                        arrayList.add(9);
                    }
                    if (!f7129c6.equals("")) {
                        arrayList.add(10);
                    }
                    if (!arrayList.isEmpty()) {
                        if (arrayList.size() > 1) {
                            int i5 = f7138l6;
                            if (i5 > 0) {
                                f7137k6 = i5;
                            } else {
                                f7137k6 = ((Integer) arrayList.get(new Random().nextInt(((arrayList.size() - 1) - 0) + 1) + 0)).intValue();
                            }
                        } else {
                            f7137k6 = ((Integer) arrayList.get(0)).intValue();
                        }
                        if (f7138l6 == 0) {
                            mo7521p(context);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            f7137k6 = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public File mo7507i0(Context context, String str) {
        return new File(context.getExternalFilesDir((String) null), str);
    }

    /* renamed from: i1 */
    public void mo7508i1(Context context) {
        mo7482H0(context);
        if (f7138l6 <= 0) {
            if (this.f7412r3 > 0) {
                SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
                int i = sharedPreferences.getInt("n_imp_chat", 0) + 1;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("n_imp_chat", i);
                edit.commit();
                if (i % this.f7412r3 == 0) {
                    edit.putInt("n_imp", 0);
                    edit.commit();
                    ArrayList arrayList = new ArrayList();
                    if (!f7124X5.equals("")) {
                        arrayList.add(1);
                    }
                    if (!f7121U5.equals("") && (f7124X5.equals("") || !f7141o6)) {
                        arrayList.add(2);
                    }
                    if (!f7125Y5.equals("")) {
                        arrayList.add(3);
                    }
                    if (!f7126Z5.equals("")) {
                        arrayList.add(4);
                    }
                    if (!this.f7346h4.equals("")) {
                        arrayList.add(6);
                    }
                    if (!this.f7352i4.equals("")) {
                        arrayList.add(7);
                    }
                    if (!f7127a6.equals("")) {
                        arrayList.add(8);
                    }
                    if (!f7128b6.equals("")) {
                        arrayList.add(9);
                    }
                    if (!f7129c6.equals("")) {
                        arrayList.add(10);
                    }
                    if (!arrayList.isEmpty()) {
                        if (arrayList.size() > 1) {
                            int i2 = f7137k6;
                            if (i2 > 0) {
                                f7138l6 = i2;
                            } else {
                                f7138l6 = ((Integer) arrayList.get(new Random().nextInt(((arrayList.size() - 1) - 0) + 1) + 0)).intValue();
                            }
                        } else {
                            f7138l6 = ((Integer) arrayList.get(0)).intValue();
                        }
                        if (f7137k6 == 0) {
                            mo7521p(context);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            f7138l6 = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo7509j(Context context) {
        mo7512k(context, 1, 1, -1, (String) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v80, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Integer} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public british.p015x.C1845j mo7510j0(android.view.View r14, android.content.Context r15) {
        /*
            r13 = this;
            british.x.j r0 = new british.x.j
            r0.<init>()
            r1 = 1
            r0.f7843b = r1
            r2 = 0
            r0.f7844c = r2
            r0.f7845d = r2
            r3 = 2131361805(0x7f0a000d, float:1.8343373E38)
            java.lang.Object r4 = r14.getTag(r3)
            java.lang.String r5 = ""
            r6 = -1
            if (r4 == 0) goto L_0x0024
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            java.lang.Object r14 = r14.getTag(r3)
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x002f
        L_0x0024:
            r3 = 2131361812(0x7f0a0014, float:1.8343387E38)
            java.lang.Object r14 = r14.getTag(r3)
            r4 = r14
            java.lang.Integer r4 = (java.lang.Integer) r4
            r14 = r5
        L_0x002f:
            int r3 = r4.intValue()
            if (r3 < 0) goto L_0x0043
            int r3 = r4.intValue()
            british.x.l[] r7 = r13.f7231O1
            int r7 = r7.length
            if (r3 >= r7) goto L_0x0043
            british.x.j r14 = r13.mo7475B(r4, r15)
            return r14
        L_0x0043:
            int r3 = r4.intValue()
            r7 = 9998(0x270e, float:1.401E-41)
            if (r3 != r7) goto L_0x004e
            r0.f7843b = r1
            return r0
        L_0x004e:
            int r3 = r4.intValue()
            r7 = 2131362302(0x7f0a01fe, float:1.834438E38)
            if (r3 != r7) goto L_0x0065
            android.content.Intent r14 = new android.content.Intent
            java.lang.Class<british.x.t_menu> r3 = british.p015x.t_menu.class
            r14.<init>(r15, r3)
            r0.f7843b = r2
            r0.f7845d = r1
            r0.f7842a = r14
            return r0
        L_0x0065:
            boolean r3 = r14.equals(r5)
            r5 = 0
            r7 = 10000(0x2710, float:1.4013E-41)
            if (r3 == 0) goto L_0x007e
            int r3 = r4.intValue()
            if (r3 <= r7) goto L_0x0108
            int r3 = r4.intValue()
            int[] r8 = r13.f7249R1
            int r8 = r8.length
            int r8 = r8 + r7
            if (r3 > r8) goto L_0x0108
        L_0x007e:
            java.lang.String r3 = "share"
            boolean r8 = r14.equals(r3)
            java.lang.String r9 = "ind_secc_sel_2"
            java.lang.String r10 = "ind_secc_sel"
            java.lang.String r11 = "sh"
            if (r8 != 0) goto L_0x0319
            int r8 = r4.intValue()
            int r12 = r13.f7342h
            int r12 = r12 + r7
            if (r8 != r12) goto L_0x0097
            goto L_0x0319
        L_0x0097:
            java.lang.String r3 = "search"
            boolean r8 = r14.equals(r3)
            if (r8 != 0) goto L_0x02c5
            int r8 = r4.intValue()
            int r12 = r13.f7348i
            int r12 = r12 + r7
            if (r8 != r12) goto L_0x00aa
            goto L_0x02c5
        L_0x00aa:
            java.lang.String r3 = "offices"
            boolean r8 = r14.equals(r3)
            if (r8 != 0) goto L_0x0269
            int r8 = r4.intValue()
            int r12 = r13.f7360k
            int r12 = r12 + r7
            if (r8 != r12) goto L_0x00bd
            goto L_0x0269
        L_0x00bd:
            java.lang.String r3 = "products"
            boolean r8 = r14.equals(r3)
            if (r8 != 0) goto L_0x020d
            int r8 = r4.intValue()
            int r12 = r13.f7354j
            int r12 = r12 + r7
            if (r8 != r12) goto L_0x00d0
            goto L_0x020d
        L_0x00d0:
            java.lang.String r3 = "exit"
            boolean r6 = r14.equals(r3)
            if (r6 != 0) goto L_0x01c5
            int r6 = r4.intValue()
            int r8 = r13.f7366l
            int r8 = r8 + r7
            if (r6 != r8) goto L_0x00e3
            goto L_0x01c5
        L_0x00e3:
            java.lang.String r3 = "notifications"
            boolean r6 = r14.equals(r3)
            if (r6 != 0) goto L_0x0176
            int r6 = r4.intValue()
            int r8 = r13.f7373m
            int r8 = r8 + r7
            if (r6 != r8) goto L_0x00f6
            goto L_0x0176
        L_0x00f6:
            java.lang.String r0 = "profile"
            boolean r3 = r14.equals(r0)
            if (r3 != 0) goto L_0x0109
            int r3 = r4.intValue()
            int r4 = r13.f7380n
            int r4 = r4 + r7
            if (r3 != r4) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            return r5
        L_0x0109:
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L_0x014a
            int r14 = r13.f7465z0
            if (r14 <= 0) goto L_0x014a
            if (r14 != r1) goto L_0x011c
            java.lang.String r14 = r13.f7152B0
            british.x.j r14 = r13.mo7513k0(r14, r15)
            return r14
        L_0x011c:
            android.content.SharedPreferences r14 = r13.getSharedPreferences(r11, r2)
            android.content.SharedPreferences$Editor r14 = r14.edit()
            java.util.ArrayList<java.lang.Integer> r0 = f7114N5
            int r1 = r13.f7465z0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r0 = r0.indexOf(r1)
            r13.f7318d = r0
            r13.f7312c = r0
            r14.putInt(r9, r0)
            int r0 = r13.f7312c
            r14.putInt(r10, r0)
            r14.commit()
            int r14 = r13.f7312c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            british.x.j r14 = r13.mo7475B(r14, r15)
            return r14
        L_0x014a:
            android.content.Intent r14 = new android.content.Intent
            java.lang.Class<british.x.preperfil> r15 = british.p015x.preperfil.class
            r14.<init>(r13, r15)
            java.lang.String r15 = "desde_main"
            r14.putExtra(r15, r1)
            java.lang.String r15 = "desde_main_oblig"
            r14.putExtra(r15, r2)
            java.lang.String r15 = "nocompletar"
            r14.putExtra(r15, r1)
            int r15 = r13.f7427t4
            r0 = 2
            if (r15 == r0) goto L_0x016a
            java.lang.String r15 = "es_root"
            r14.putExtra(r15, r1)
        L_0x016a:
            british.x.j r15 = new british.x.j
            r15.<init>()
            r15.f7843b = r2
            r15.f7845d = r1
            r15.f7842a = r14
            return r15
        L_0x0176:
            boolean r14 = r14.equals(r3)
            if (r14 != 0) goto L_0x01b7
            int r14 = r13.f7437v0
            if (r14 <= 0) goto L_0x01b7
            if (r14 != r1) goto L_0x0189
            java.lang.String r14 = r13.f7444w0
            british.x.j r14 = r13.mo7513k0(r14, r15)
            return r14
        L_0x0189:
            android.content.SharedPreferences r14 = r13.getSharedPreferences(r11, r2)
            android.content.SharedPreferences$Editor r14 = r14.edit()
            java.util.ArrayList<java.lang.Integer> r0 = f7114N5
            int r1 = r13.f7437v0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r0 = r0.indexOf(r1)
            r13.f7318d = r0
            r13.f7312c = r0
            r14.putInt(r9, r0)
            int r0 = r13.f7312c
            r14.putInt(r10, r0)
            r14.commit()
            int r14 = r13.f7312c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            british.x.j r14 = r13.mo7475B(r14, r15)
            return r14
        L_0x01b7:
            android.content.Intent r14 = new android.content.Intent
            java.lang.Class<british.x.notifs> r3 = british.p015x.notifs.class
            r14.<init>(r15, r3)
            r0.f7843b = r2
            r0.f7845d = r1
            r0.f7842a = r14
            return r0
        L_0x01c5:
            boolean r14 = r14.equals(r3)
            if (r14 != 0) goto L_0x0206
            int r14 = r13.f7409r0
            if (r14 <= 0) goto L_0x0206
            if (r14 != r1) goto L_0x01d8
            java.lang.String r14 = r13.f7416s0
            british.x.j r14 = r13.mo7513k0(r14, r15)
            return r14
        L_0x01d8:
            android.content.SharedPreferences r14 = r13.getSharedPreferences(r11, r2)
            android.content.SharedPreferences$Editor r14 = r14.edit()
            java.util.ArrayList<java.lang.Integer> r0 = f7114N5
            int r1 = r13.f7409r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r0 = r0.indexOf(r1)
            r13.f7318d = r0
            r13.f7312c = r0
            r14.putInt(r9, r0)
            int r0 = r13.f7312c
            r14.putInt(r10, r0)
            r14.commit()
            int r14 = r13.f7312c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            british.x.j r14 = r13.mo7475B(r14, r15)
            return r14
        L_0x0206:
            r0.f7843b = r1
            r0.f7844c = r1
            f7111K5 = r1
            return r0
        L_0x020d:
            boolean r14 = r14.equals(r3)
            if (r14 != 0) goto L_0x024e
            int r14 = r13.f7289Y
            if (r14 <= 0) goto L_0x024e
            if (r14 != r1) goto L_0x0220
            java.lang.String r14 = r13.f7295Z
            british.x.j r14 = r13.mo7513k0(r14, r15)
            return r14
        L_0x0220:
            android.content.SharedPreferences r14 = r13.getSharedPreferences(r11, r2)
            android.content.SharedPreferences$Editor r14 = r14.edit()
            java.util.ArrayList<java.lang.Integer> r0 = f7114N5
            int r1 = r13.f7289Y
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r0 = r0.indexOf(r1)
            r13.f7318d = r0
            r13.f7312c = r0
            r14.putInt(r9, r0)
            int r0 = r13.f7312c
            r14.putInt(r10, r0)
            r14.commit()
            int r14 = r13.f7312c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            british.x.j r14 = r13.mo7475B(r14, r15)
            return r14
        L_0x024e:
            int r14 = r13.f7422t
            if (r14 == r6) goto L_0x0264
            android.content.SharedPreferences r14 = r13.getSharedPreferences(r11, r2)
            android.content.SharedPreferences$Editor r14 = r14.edit()
            int r0 = r13.f7422t
            r13.f7312c = r0
            r14.putInt(r10, r0)
            r14.commit()
        L_0x0264:
            british.x.j r14 = r13.mo7528v0(r15)
            return r14
        L_0x0269:
            boolean r14 = r14.equals(r3)
            if (r14 != 0) goto L_0x02aa
            int r14 = r13.f7381n0
            if (r14 <= 0) goto L_0x02aa
            if (r14 != r1) goto L_0x027c
            java.lang.String r14 = r13.f7388o0
            british.x.j r14 = r13.mo7513k0(r14, r15)
            return r14
        L_0x027c:
            android.content.SharedPreferences r14 = r13.getSharedPreferences(r11, r2)
            android.content.SharedPreferences$Editor r14 = r14.edit()
            java.util.ArrayList<java.lang.Integer> r0 = f7114N5
            int r1 = r13.f7381n0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r0 = r0.indexOf(r1)
            r13.f7318d = r0
            r13.f7312c = r0
            r14.putInt(r9, r0)
            int r0 = r13.f7312c
            r14.putInt(r10, r0)
            r14.commit()
            int r14 = r13.f7312c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            british.x.j r14 = r13.mo7475B(r14, r15)
            return r14
        L_0x02aa:
            int r14 = r13.f7429u
            if (r14 == r6) goto L_0x02c0
            android.content.SharedPreferences r14 = r13.getSharedPreferences(r11, r2)
            android.content.SharedPreferences$Editor r14 = r14.edit()
            int r0 = r13.f7429u
            r13.f7312c = r0
            r14.putInt(r10, r0)
            r14.commit()
        L_0x02c0:
            british.x.j r14 = r13.mo7527u0(r15)
            return r14
        L_0x02c5:
            boolean r14 = r14.equals(r3)
            if (r14 != 0) goto L_0x0306
            int r14 = r13.f7265U
            if (r14 <= 0) goto L_0x0306
            if (r14 != r1) goto L_0x02d8
            java.lang.String r14 = r13.f7271V
            british.x.j r14 = r13.mo7513k0(r14, r15)
            return r14
        L_0x02d8:
            android.content.SharedPreferences r14 = r13.getSharedPreferences(r11, r2)
            android.content.SharedPreferences$Editor r14 = r14.edit()
            java.util.ArrayList<java.lang.Integer> r0 = f7114N5
            int r1 = r13.f7265U
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r0 = r0.indexOf(r1)
            r13.f7318d = r0
            r13.f7312c = r0
            r14.putInt(r9, r0)
            int r0 = r13.f7312c
            r14.putInt(r10, r0)
            r14.commit()
            int r14 = r13.f7312c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            british.x.j r14 = r13.mo7475B(r14, r15)
            return r14
        L_0x0306:
            android.app.Activity r15 = (android.app.Activity) r15
            r15.onSearchRequested()
            british.x.j r14 = new british.x.j
            r14.<init>()
            r14.f7842a = r5
            r14.f7843b = r1
            r14.f7844c = r2
            r14.f7845d = r2
            return r14
        L_0x0319:
            boolean r14 = r14.equals(r3)
            if (r14 != 0) goto L_0x035a
            int r14 = r13.f7241Q
            if (r14 <= 0) goto L_0x035a
            if (r14 != r1) goto L_0x032c
            java.lang.String r14 = r13.f7247R
            british.x.j r14 = r13.mo7513k0(r14, r15)
            return r14
        L_0x032c:
            android.content.SharedPreferences r14 = r13.getSharedPreferences(r11, r2)
            android.content.SharedPreferences$Editor r14 = r14.edit()
            java.util.ArrayList<java.lang.Integer> r0 = f7114N5
            int r1 = r13.f7241Q
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r0 = r0.indexOf(r1)
            r13.f7318d = r0
            r13.f7312c = r0
            r14.putInt(r9, r0)
            int r0 = r13.f7312c
            r14.putInt(r10, r0)
            r14.commit()
            int r14 = r13.f7312c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            british.x.j r14 = r13.mo7475B(r14, r15)
            return r14
        L_0x035a:
            android.content.Intent r14 = new android.content.Intent
            java.lang.String r15 = "android.intent.action.SEND"
            r14.<init>(r15)
            java.lang.String r15 = "text/plain"
            r14.setType(r15)
            java.lang.String r15 = r13.f7301a1
            java.lang.String r1 = "android.intent.extra.SUBJECT"
            r14.putExtra(r1, r15)
            java.lang.String r15 = r13.f7307b1
            java.lang.String r1 = "android.intent.extra.TEXT"
            r14.putExtra(r1, r15)
            r15 = 2131820729(0x7f1100b9, float:1.9274181E38)
            java.lang.String r15 = r13.getString(r15)
            android.content.Intent r14 = android.content.Intent.createChooser(r14, r15)
            r0.f7842a = r14
            r0.f7843b = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1692config.mo7510j0(android.view.View, android.content.Context):british.x.j");
    }

    /* renamed from: j1 */
    public int mo7511j1() {
        f7137k6 = 0;
        f7138l6 = 0;
        if (!this.f7208K2.equals("")) {
            return 5;
        }
        if (this.f7405q3 <= 0) {
            return 0;
        }
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        int i = sharedPreferences.getInt("n_impentrada", 0) + 1;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("n_impentrada", i);
        edit.commit();
        if (i % this.f7405q3 != 0 && i != 1) {
            return 0;
        }
        edit.putInt("n_imp", 0);
        edit.putInt("n_imp_chat", 0);
        edit.commit();
        ArrayList arrayList = new ArrayList();
        if (!f7124X5.equals("")) {
            arrayList.add(1);
        }
        if (!f7121U5.equals("") && (f7124X5.equals("") || !f7141o6)) {
            arrayList.add(2);
        }
        if (!f7125Y5.equals("")) {
            arrayList.add(3);
        }
        if (!f7126Z5.equals("")) {
            arrayList.add(4);
        }
        if (!f7127a6.equals("")) {
            arrayList.add(8);
        }
        if (!f7128b6.equals("")) {
            arrayList.add(9);
        }
        if (!f7129c6.equals("")) {
            arrayList.add(10);
        }
        if (arrayList.isEmpty()) {
            return 0;
        }
        if (arrayList.size() > 1) {
            return ((Integer) arrayList.get(new Random().nextInt(((arrayList.size() - 1) - 0) + 1) + 0)).intValue();
        }
        return ((Integer) arrayList.get(0)).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo7512k(Context context, int i, int i2, int i3, String str) {
        mo7515l(context, i, i2, i3, str, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public C1845j mo7513k0(String str, Context context) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String lowerCase = str.toLowerCase();
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf != -1) {
            str2 = lowerCase.substring(lastIndexOf);
        } else {
            str2 = "";
        }
        str2.replace(".", "");
        String[] strArr = {"offices", "share", "search", "products", "exit", "notifications", "profile"};
        int i = 0;
        while (i < 7) {
            String str10 = strArr[i];
            if (!lowerCase.startsWith("action_" + str10)) {
                if (!lowerCase.startsWith("http://action_" + str10)) {
                    i++;
                }
            }
            View view = new View(context);
            view.setTag(R.id.TAG_ACCION, str10);
            return mo7510j0(view, context);
        }
        C1845j jVar = new C1845j();
        jVar.f7843b = false;
        jVar.f7844c = false;
        jVar.f7845d = false;
        if (lowerCase.startsWith("tel:") || lowerCase.startsWith("http://tel:")) {
            if (lowerCase.startsWith("tel:")) {
                str3 = str.substring(4);
            } else {
                str3 = str.substring(11);
            }
            if (str3.endsWith("/")) {
                str3 = str3.substring(0, str3.length() - 1);
            }
            jVar.f7842a = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str3));
            return jVar;
        } else if (lowerCase.startsWith("mailto:") || lowerCase.startsWith("http://mailto:")) {
            if (lowerCase.startsWith("mailto:")) {
                str4 = str.substring(7).trim();
            } else {
                str4 = str.substring(14).trim();
            }
            if (!str4.equals("")) {
                int indexOf = str4.indexOf("?");
                if (indexOf > 0) {
                    int indexOf2 = str4.indexOf("?subject=");
                    if (indexOf2 != -1) {
                        str6 = str4.substring(indexOf2 + 9).trim();
                        int indexOf3 = str6.indexOf("&body=");
                        if (indexOf3 != -1) {
                            str5 = str6.substring(indexOf3 + 6).trim();
                            str6 = str6.substring(0, indexOf3).trim();
                        } else {
                            str5 = "";
                        }
                    } else {
                        str6 = "";
                        str5 = str6;
                    }
                    str4 = str4.substring(0, indexOf).trim();
                } else {
                    str6 = "";
                    str5 = str6;
                }
                if (str4.endsWith("/")) {
                    str4 = str4.substring(0, str4.length() - 1);
                }
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", str4, (String) null));
                if (!str6.equals("")) {
                    try {
                        str6 = URLDecoder.decode(str6, C6540C.UTF8_NAME);
                    } catch (Exception unused) {
                    }
                    intent.putExtra("android.intent.extra.SUBJECT", str6);
                }
                if (!str5.equals("")) {
                    try {
                        str5 = URLDecoder.decode(str5, C6540C.UTF8_NAME);
                    } catch (Exception unused2) {
                    }
                    intent.putExtra("android.intent.extra.TEXT", str5);
                }
                jVar.f7842a = Intent.createChooser(intent, getResources().getString(R.string.enviar_email));
                return jVar;
            }
            jVar.f7842a = new Intent("android.intent.action.SENDTO", Uri.parse(str));
            return jVar;
        } else if (lowerCase.startsWith("smsto:") || lowerCase.startsWith("http://smsto:")) {
            if (lowerCase.startsWith("smsto:")) {
                str7 = str.substring(6).trim();
            } else {
                str7 = str.substring(13).trim();
            }
            if (!str7.equals("")) {
                int indexOf4 = str7.indexOf("?");
                if (indexOf4 > 0) {
                    int indexOf5 = str7.indexOf("?body=");
                    if (indexOf5 != -1) {
                        str8 = str7.substring(indexOf5 + 6).trim();
                    } else {
                        str8 = "";
                    }
                    str7 = str7.substring(0, indexOf4).trim();
                } else {
                    str8 = "";
                }
                if (str7.endsWith("/")) {
                    str7 = str7.substring(0, str7.length() - 1);
                }
                Intent intent2 = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str7));
                if (!str8.equals("")) {
                    try {
                        str8 = URLDecoder.decode(str8, C6540C.UTF8_NAME);
                    } catch (Exception unused3) {
                    }
                    intent2.putExtra("sms_body", str8);
                }
                jVar.f7842a = intent2;
                return jVar;
            }
            jVar.f7842a = new Intent("android.intent.action.SENDTO", Uri.parse(str));
            return jVar;
        } else if (lowerCase.startsWith("vnd.youtube:")) {
            int indexOf6 = str.indexOf("?");
            if (indexOf6 > 0) {
                str9 = str.substring(12, indexOf6);
            } else {
                str9 = str.substring(12);
            }
            String str11 = "https://www.youtube.com/watch?v=" + str9;
            jVar.f7842a = new Intent("android.intent.action.VIEW", Uri.parse(str11));
            if (this.f7296Z0 && m8180b(str11)) {
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
                try {
                    bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", Color.parseColor("#" + this.f7313c1));
                } catch (Exception unused4) {
                }
                jVar.f7842a.putExtras(bundle);
            }
            return jVar;
        } else if (lowerCase.endsWith(".mp3")) {
            Intent intent3 = new Intent("android.intent.action.VIEW");
            intent3.setDataAndType(Uri.parse(str), "audio/*");
            jVar.f7842a = intent3;
            return jVar;
        } else if (lowerCase.endsWith(".mp4") || lowerCase.endsWith(".3gp")) {
            Intent intent4 = new Intent("android.intent.action.VIEW");
            intent4.setDataAndType(Uri.parse(str), "video/*");
            jVar.f7842a = intent4;
            return jVar;
        } else {
            jVar.f7842a = new Intent("android.intent.action.VIEW", Uri.parse(str));
            if (this.f7296Z0 && m8180b(str)) {
                Bundle bundle2 = new Bundle();
                bundle2.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
                try {
                    bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", Color.parseColor("#" + this.f7313c1));
                } catch (Exception unused5) {
                }
                jVar.f7842a.putExtras(bundle2);
            }
            return jVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k1 */
    public void mo7514k1(ImageView imageView, Boolean bool, int i) {
        RelativeLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        if (imageView.getParent() instanceof LinearLayout) {
            if (i == 0) {
                layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            } else {
                layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
            }
            if (bool.booleanValue()) {
                int E = m8149E(this, 10);
                layoutParams3.setMargins(E, E, E, E);
            }
            imageView.setLayoutParams(layoutParams3);
        } else if (imageView.getParent() instanceof FrameLayout) {
            if (i == 0) {
                layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            } else {
                layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            }
            if (bool.booleanValue()) {
                int E2 = m8149E(this, 10);
                layoutParams2.setMargins(E2, E2, E2, E2);
            }
            layoutParams2.gravity = 17;
            imageView.setLayoutParams(layoutParams2);
        } else if (imageView.getParent() instanceof RelativeLayout) {
            if (i == 0) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            }
            if (bool.booleanValue()) {
                int E3 = m8149E(this, 10);
                layoutParams.setMargins(E3, E3, E3, E3);
            }
            layoutParams.addRule(13, -1);
            imageView.setLayoutParams(layoutParams);
        } else {
            return;
        }
        if (i == 2) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else if (i == 3) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0229  */
    @android.annotation.TargetApi(13)
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7515l(android.content.Context r17, int r18, int r19, int r20, java.lang.String r21, boolean r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r21
            java.util.ArrayList<com.appnext.nativeads.NativeAd> r5 = r0.f7463y5
            if (r5 == 0) goto L_0x03ae
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x03ae
            r5 = r1
            android.app.Activity r5 = (android.app.Activity) r5
            android.view.WindowManager r6 = r5.getWindowManager()
            android.view.Display r6 = r6.getDefaultDisplay()
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 13
            if (r7 < r8) goto L_0x0030
            android.graphics.Point r8 = new android.graphics.Point
            r8.<init>()
            r6.getSize(r8)
            int r6 = r8.x
            goto L_0x0034
        L_0x0030:
            int r6 = r6.getWidth()
        L_0x0034:
            r8 = -1
            r9 = 1
            r10 = 0
            r11 = r20
            if (r11 != r8) goto L_0x004e
            java.util.Random r11 = new java.util.Random
            r11.<init>()
            java.util.ArrayList<com.appnext.nativeads.NativeAd> r12 = r0.f7463y5
            int r12 = r12.size()
            int r12 = r12 - r9
            int r12 = r12 - r10
            int r12 = r12 + r9
            int r11 = r11.nextInt(r12)
            int r11 = r11 + r10
        L_0x004e:
            java.lang.String r12 = "layout_inflater"
            java.lang.Object r12 = r0.getSystemService(r12)
            android.view.LayoutInflater r12 = (android.view.LayoutInflater) r12
            r13 = 0
            r14 = 3
            if (r2 != r9) goto L_0x0070
            if (r3 != r14) goto L_0x0066
            r15 = 2131558430(0x7f0d001e, float:1.8742176E38)
            android.view.View r12 = r12.inflate(r15, r13)
            com.appnext.nativeads.NativeAdView r12 = (com.appnext.nativeads.NativeAdView) r12
            goto L_0x0079
        L_0x0066:
            r15 = 2131558428(0x7f0d001c, float:1.8742172E38)
            android.view.View r12 = r12.inflate(r15, r13)
            com.appnext.nativeads.NativeAdView r12 = (com.appnext.nativeads.NativeAdView) r12
            goto L_0x0079
        L_0x0070:
            r15 = 2131558429(0x7f0d001d, float:1.8742174E38)
            android.view.View r12 = r12.inflate(r15, r13)
            com.appnext.nativeads.NativeAdView r12 = (com.appnext.nativeads.NativeAdView) r12
        L_0x0079:
            r13 = 20
            if (r7 <= r13) goto L_0x00c8
            r13 = 2131361901(0x7f0a006d, float:1.8343567E38)
            if (r2 != r9) goto L_0x0090
            if (r3 == r14) goto L_0x00c8
            android.view.View r4 = r12.findViewById(r13)
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            java.lang.String r13 = "757575"
            m8168S0(r4, r13)
            goto L_0x00c8
        L_0x0090:
            if (r4 == 0) goto L_0x00c8
            java.lang.String r15 = ""
            boolean r15 = r4.equals(r15)
            if (r15 != 0) goto L_0x00c8
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r8 = "#"
            r15.append(r8)
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            boolean r4 = m8153I(r4)
            if (r4 == 0) goto L_0x00bd
            android.view.View r4 = r12.findViewById(r13)
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            java.lang.String r8 = "FBFBFB"
            m8168S0(r4, r8)
            goto L_0x00c8
        L_0x00bd:
            android.view.View r4 = r12.findViewById(r13)
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            java.lang.String r8 = "727272"
            m8168S0(r4, r8)
        L_0x00c8:
            java.util.ArrayList<com.appnext.nativeads.NativeAd> r4 = r0.f7463y5
            java.lang.Object r4 = r4.get(r11)
            com.appnext.nativeads.NativeAd r4 = (com.appnext.nativeads.NativeAd) r4
            android.graphics.Typeface r8 = android.graphics.Typeface.defaultFromStyle(r10)
            r11 = 2131361904(0x7f0a0070, float:1.8343574E38)
            android.view.View r11 = r12.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            java.lang.String r13 = r4.getAdTitle()
            r11.setText(r13)
            r13 = 2
            r15 = 2131361895(0x7f0a0067, float:1.8343555E38)
            if (r2 != r9) goto L_0x0220
            r11.setTypeface(r8, r9)
            android.view.View r11 = r12.findViewById(r15)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r11.setTypeface(r8)
            android.view.View r8 = r12.findViewById(r15)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.String r11 = r4.getAdDescription()
            r8.setText(r11)
            r8 = 17
            r11 = 4
            if (r7 < r8) goto L_0x011c
            android.content.res.Resources r7 = r16.getResources()
            r8 = 2131034119(0x7f050007, float:1.7678747E38)
            boolean r7 = r7.getBoolean(r8)
            if (r7 == 0) goto L_0x011c
            android.view.View r7 = r12.findViewById(r15)
            r7.setTextDirection(r11)
        L_0x011c:
            java.lang.String r7 = r4.getStoreRating()
            if (r7 == 0) goto L_0x0227
            int r8 = r7.length()
            if (r8 != r14) goto L_0x0227
            java.lang.String r8 = r7.substring(r10, r9)     // Catch:{ Exception -> 0x0139 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r7 = r7.substring(r13, r14)     // Catch:{ Exception -> 0x013a }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x013a }
            goto L_0x013b
        L_0x0139:
            r8 = 0
        L_0x013a:
            r7 = 0
        L_0x013b:
            if (r7 >= r14) goto L_0x013f
        L_0x013d:
            r7 = 0
            goto L_0x0146
        L_0x013f:
            r15 = 7
            if (r7 <= r15) goto L_0x0145
            int r8 = r8 + 1
            goto L_0x013d
        L_0x0145:
            r7 = 5
        L_0x0146:
            if (r8 <= 0) goto L_0x0227
            r15 = 6
            if (r8 >= r15) goto L_0x0227
            r15 = 2131362815(0x7f0a03ff, float:1.8345421E38)
            android.view.View r15 = r12.findViewById(r15)
            r15.setVisibility(r10)
            r15 = 2131362828(0x7f0a040c, float:1.8345448E38)
            if (r8 <= r9) goto L_0x01ec
            r9 = 2131362818(0x7f0a0402, float:1.8345427E38)
            android.view.View r9 = r12.findViewById(r9)
            r9.setVisibility(r10)
            if (r8 <= r13) goto L_0x01c2
            r9 = 2131362821(0x7f0a0405, float:1.8345433E38)
            android.view.View r9 = r12.findViewById(r9)
            r9.setVisibility(r10)
            if (r8 <= r14) goto L_0x01a2
            r9 = 2131362824(0x7f0a0408, float:1.834544E38)
            android.view.View r9 = r12.findViewById(r9)
            r9.setVisibility(r10)
            if (r8 <= r11) goto L_0x018a
            r7 = 2131362827(0x7f0a040b, float:1.8345446E38)
            android.view.View r7 = r12.findViewById(r7)
            r7.setVisibility(r10)
            goto L_0x0227
        L_0x018a:
            r8 = 5
            if (r7 != r8) goto L_0x0199
            r7 = 2131362829(0x7f0a040d, float:1.834545E38)
            android.view.View r7 = r12.findViewById(r7)
            r7.setVisibility(r10)
            goto L_0x0227
        L_0x0199:
            android.view.View r7 = r12.findViewById(r15)
            r7.setVisibility(r10)
            goto L_0x0227
        L_0x01a2:
            r8 = 5
            if (r7 != r8) goto L_0x01b0
            r7 = 2131362826(0x7f0a040a, float:1.8345444E38)
            android.view.View r7 = r12.findViewById(r7)
            r7.setVisibility(r10)
            goto L_0x01ba
        L_0x01b0:
            r7 = 2131362825(0x7f0a0409, float:1.8345442E38)
            android.view.View r7 = r12.findViewById(r7)
            r7.setVisibility(r10)
        L_0x01ba:
            android.view.View r7 = r12.findViewById(r15)
            r7.setVisibility(r10)
            goto L_0x0227
        L_0x01c2:
            r8 = 5
            if (r7 != r8) goto L_0x01d0
            r7 = 2131362823(0x7f0a0407, float:1.8345437E38)
            android.view.View r7 = r12.findViewById(r7)
            r7.setVisibility(r10)
            goto L_0x01da
        L_0x01d0:
            r7 = 2131362822(0x7f0a0406, float:1.8345435E38)
            android.view.View r7 = r12.findViewById(r7)
            r7.setVisibility(r10)
        L_0x01da:
            r7 = 2131362825(0x7f0a0409, float:1.8345442E38)
            android.view.View r7 = r12.findViewById(r7)
            r7.setVisibility(r10)
            android.view.View r7 = r12.findViewById(r15)
            r7.setVisibility(r10)
            goto L_0x0227
        L_0x01ec:
            r8 = 5
            if (r7 != r8) goto L_0x01fa
            r7 = 2131362820(0x7f0a0404, float:1.8345431E38)
            android.view.View r7 = r12.findViewById(r7)
            r7.setVisibility(r10)
            goto L_0x0204
        L_0x01fa:
            r7 = 2131362819(0x7f0a0403, float:1.834543E38)
            android.view.View r7 = r12.findViewById(r7)
            r7.setVisibility(r10)
        L_0x0204:
            r7 = 2131362822(0x7f0a0406, float:1.8345435E38)
            android.view.View r7 = r12.findViewById(r7)
            r7.setVisibility(r10)
            r7 = 2131362825(0x7f0a0409, float:1.8345442E38)
            android.view.View r7 = r12.findViewById(r7)
            r7.setVisibility(r10)
            android.view.View r7 = r12.findViewById(r15)
            r7.setVisibility(r10)
            goto L_0x0227
        L_0x0220:
            android.graphics.Typeface r7 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x0226 }
            r11.setTypeface(r7)     // Catch:{ Exception -> 0x0226 }
            goto L_0x0227
        L_0x0226:
        L_0x0227:
            if (r22 != 0) goto L_0x0242
            r7 = 2131361897(0x7f0a0069, float:1.834356E38)
            android.view.View r8 = r12.findViewById(r7)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r8.setVisibility(r10)
            android.view.View r7 = r12.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            java.lang.String r8 = r4.getIconURL()
            r4.downloadAndDisplayImage(r1, r7, r8)
        L_0x0242:
            r1 = 1
            if (r2 != r1) goto L_0x0258
            if (r3 != r14) goto L_0x0258
            if (r22 != 0) goto L_0x0258
            r7 = 2131361898(0x7f0a006a, float:1.8343561E38)
            android.view.View r7 = r12.findViewById(r7)
            com.appnext.nativeads.MediaView r7 = (com.appnext.nativeads.MediaView) r7
            r7.setMute(r1)     // Catch:{ Exception -> 0x0255 }
        L_0x0255:
            r4.setMediaView(r7)
        L_0x0258:
            british.x.config$g0 r1 = new british.x.config$g0
            r1.<init>()
            r4.setAdListener(r1)
            r1 = 1
            if (r2 != r1) goto L_0x03ae
            r2 = 2131361922(0x7f0a0082, float:1.834361E38)
            android.view.View r2 = r12.findViewById(r2)
            r7 = 8
            r2.setVisibility(r7)
            r2 = 1056964608(0x3f000000, float:0.5)
            r7 = 2131361908(0x7f0a0074, float:1.8343582E38)
            r8 = 2131362228(0x7f0a01b4, float:1.834423E38)
            if (r3 != r1) goto L_0x0307
            int r3 = r0.f7384n3
            if (r3 != r1) goto L_0x028f
            r1 = 2131361807(0x7f0a000f, float:1.8343377E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.setTag(r1)
            android.view.View r1 = r0.f7306b
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.addView(r12)
            goto L_0x02a4
        L_0x028f:
            r1 = 2131362458(0x7f0a029a, float:1.8344697E38)
            android.view.View r3 = r5.findViewById(r1)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r3.addView(r12)
            android.view.View r1 = r5.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r10)
        L_0x02a4:
            r1 = 1
            r0.f7456x5 = r1
            r3 = 60
            android.content.res.Resources r5 = r16.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.orientation
            if (r5 != r13) goto L_0x02c4
            r3 = 45
            r5 = 2131361895(0x7f0a0067, float:1.8343555E38)
            android.view.View r5 = r12.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5.setMaxLines(r1)
            goto L_0x02da
        L_0x02c4:
            r5 = 2131361895(0x7f0a0067, float:1.8343555E38)
            com.google.android.gms.ads.AdSize r9 = r0.f7419s3
            com.google.android.gms.ads.AdSize r10 = com.google.android.gms.ads.AdSize.LARGE_BANNER
            if (r9 != r10) goto L_0x02da
            r3 = 100
            android.view.View r5 = r12.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r9 = 1098907648(0x41800000, float:16.0)
            r5.setTextSize(r1, r9)
        L_0x02da:
            android.view.ViewGroup$LayoutParams r1 = r12.getLayoutParams()
            r1.width = r6
            android.view.ViewGroup$LayoutParams r1 = r12.getLayoutParams()
            float r3 = (float) r3
            android.content.res.Resources r5 = r16.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r3 = r3 * r5
            float r3 = r3 + r2
            int r2 = (int) r3
            r1.height = r2
            android.view.View r1 = r12.findViewById(r8)
            r4.registerClickableViews((android.view.View) r1)
            android.view.View r1 = r12.findViewById(r7)
            com.appnext.nativeads.NativeAdView r1 = (com.appnext.nativeads.NativeAdView) r1
            r4.setNativeAdView(r1)
            goto L_0x03ae
        L_0x0307:
            r1 = 2131362524(0x7f0a02dc, float:1.8344831E38)
            if (r3 != r13) goto L_0x0360
            r3 = 80
            android.view.View r1 = r5.findViewById(r1)
            r1.setVisibility(r10)
            r1 = 2131363070(0x7f0a04fe, float:1.8345938E38)
            android.view.View r1 = r5.findViewById(r1)
            r1.setVisibility(r10)
            r1 = 2131362525(0x7f0a02dd, float:1.8344833E38)
            android.view.View r9 = r5.findViewById(r1)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r9.removeAllViews()
            android.view.View r1 = r5.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.addView(r12)
            android.view.ViewGroup$LayoutParams r1 = r12.getLayoutParams()
            r1.width = r6
            android.view.ViewGroup$LayoutParams r1 = r12.getLayoutParams()
            float r3 = (float) r3
            android.content.res.Resources r5 = r16.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r3 = r3 * r5
            float r3 = r3 + r2
            int r2 = (int) r3
            r1.height = r2
            android.view.View r1 = r12.findViewById(r8)
            r4.registerClickableViews((android.view.View) r1)
            android.view.View r1 = r12.findViewById(r7)
            com.appnext.nativeads.NativeAdView r1 = (com.appnext.nativeads.NativeAdView) r1
            r4.setNativeAdView(r1)
            goto L_0x03ae
        L_0x0360:
            if (r3 != r14) goto L_0x03ae
            r2 = 2131362545(0x7f0a02f1, float:1.8344874E38)
            android.view.View r2 = r5.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            if (r2 == 0) goto L_0x037d
            int r1 = r2.getChildCount()
            r3 = 1
            int r1 = r1 - r3
            android.view.View r1 = r2.getChildAt(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.addView(r12)
            goto L_0x0397
        L_0x037d:
            android.view.View r2 = r5.findViewById(r1)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.addView(r12)
            android.view.View r1 = r5.findViewById(r1)
            r1.setVisibility(r10)
            r1 = 2131362468(0x7f0a02a4, float:1.8344717E38)
            android.view.View r1 = r5.findViewById(r1)
            r1.setVisibility(r10)
        L_0x0397:
            android.view.ViewGroup$LayoutParams r1 = r12.getLayoutParams()
            r2 = -1
            r1.width = r2
            android.view.View r1 = r12.findViewById(r8)
            r4.registerClickableViews((android.view.View) r1)
            android.view.View r1 = r12.findViewById(r7)
            com.appnext.nativeads.NativeAdView r1 = (com.appnext.nativeads.NativeAdView) r1
            r4.setNativeAdView(r1)
        L_0x03ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1692config.mo7515l(android.content.Context, int, int, int, java.lang.String, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public File mo7516l0(Context context, int i) {
        File filesDir = context.getFilesDir();
        return new File(filesDir, "dt_foto" + i + "_temp.jpg");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public File mo7517m0(Context context, String str) {
        return new File(context.getFilesDir(), str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public File mo7518n0(Context context, int i, boolean z) {
        String str = z ? "_g" : "";
        File filesDir = context.getFilesDir();
        return new File(filesDir, "dt_foto" + i + str + ".jpg");
    }

    public void onCreate() {
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(new C1787f());
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        ListView listView;
        if (this.f7427t4 == 1 && this.f7267U1 != null && str.equals("ico_cargado")) {
            this.f7267U1.notifyDataSetChanged();
        } else if (this.f7427t4 == 1 && (listView = this.f7255S1) != null && listView.getHeaderViewsCount() > 0 && str.equals("slider_v_act")) {
            RelativeLayout relativeLayout = (RelativeLayout) this.f7255S1.findViewById(R.id.ll_drawer);
            ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.iv_drawer);
            try {
                FileInputStream openFileInput = openFileInput("slider_header");
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileInput.getFD());
                openFileInput.close();
                imageView.setImageBitmap(decodeFileDescriptor);
            } catch (Exception | OutOfMemoryError unused) {
            }
            if (this.f7457y > 0) {
                relativeLayout.setLayoutParams(new AbsListView.LayoutParams(-1, this.f7457y));
            }
            relativeLayout.findViewById(R.id.pb_drawer).setVisibility(8);
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.fade);
            imageView.setVisibility(0);
            imageView.startAnimation(loadAnimation);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo7521p(Context context) {
        int i;
        int i2 = f7137k6;
        if (i2 == 1 || (i = f7138l6) == 1) {
            InterstitialAd.load(this, f7124X5, new AdRequest.Builder().build(), new C1697c());
        } else if (i2 != 2 && i != 2) {
            if (i2 == 3 || i == 3) {
                f7134h6 = new com.facebook.ads.InterstitialAd(context, f7125Y5);
                C1700d dVar = new C1700d();
                com.facebook.ads.InterstitialAd interstitialAd = f7134h6;
                interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(dVar).build());
            } else if (i2 == 4 || i == 4) {
                StartAppAd startAppAd = new StartAppAd(getApplicationContext());
                f7135i6 = startAppAd;
                startAppAd.loadAd((AdEventListener) new C1702e());
            } else if (i2 == 8 || i == 8) {
                C1704f fVar = new C1704f();
                f7136j6 = null;
                AdColony.requestInterstitial(f7127a6, fVar);
            } else if (i2 != 9 && i != 9) {
                if (i2 == 10 || i == 10) {
                    IronSource.loadInterstitial();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(13)
    /* renamed from: q0 */
    public int mo7522q0(Context context) {
        return mo7523r0(context, Boolean.TRUE);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0c6f  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0c8b  */
    @android.annotation.TargetApi(13)
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo7523r0(android.content.Context r29, java.lang.Boolean r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            java.lang.String r2 = r0.f7313c1
            if (r2 != 0) goto L_0x000b
            r28.mo7490V0()
        L_0x000b:
            boolean r2 = r0.f7314c2
            if (r2 != 0) goto L_0x001f
            r2 = r1
            android.app.Activity r2 = (android.app.Activity) r2     // Catch:{ Exception -> 0x001e }
            android.view.Window r2 = r2.getWindow()     // Catch:{ Exception -> 0x001e }
            r3 = 128(0x80, float:1.794E-43)
            r4 = 128(0x80, float:1.794E-43)
            r2.setFlags(r3, r4)     // Catch:{ Exception -> 0x001e }
            goto L_0x001f
        L_0x001e:
        L_0x001f:
            boolean r2 = r0.f7320d2
            if (r2 == 0) goto L_0x0033
            r2 = r1
            android.app.Activity r2 = (android.app.Activity) r2     // Catch:{ Exception -> 0x0032 }
            android.view.Window r2 = r2.getWindow()     // Catch:{ Exception -> 0x0032 }
            r3 = 8192(0x2000, float:1.14794E-41)
            r4 = 8192(0x2000, float:1.14794E-41)
            r2.setFlags(r3, r4)     // Catch:{ Exception -> 0x0032 }
            goto L_0x0033
        L_0x0032:
        L_0x0033:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 20
            if (r2 <= r3) goto L_0x0041
            r3 = r1
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.String r4 = r0.f7313c1
            m8190i(r3, r4)
        L_0x0041:
            android.content.res.Resources r3 = r28.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            r4 = 1106771968(0x41f80000, float:31.0)
            float r4 = r4 * r3
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4
            r6 = 1105199104(0x41e00000, float:28.0)
            float r6 = r6 * r3
            float r6 = r6 + r5
            int r6 = (int) r6
            r7 = 1111490560(0x42400000, float:48.0)
            float r7 = r7 * r3
            float r7 = r7 + r5
            int r7 = (int) r7
            r8 = 1124335616(0x43040000, float:132.0)
            float r8 = r8 * r3
            float r8 = r8 + r5
            int r8 = (int) r8
            r9 = r1
            android.app.Activity r9 = (android.app.Activity) r9
            r10 = 2131362124(0x7f0a014c, float:1.834402E38)
            android.view.View r10 = r9.findViewById(r10)
            androidx.drawerlayout.widget.DrawerLayout r10 = (androidx.drawerlayout.widget.DrawerLayout) r10
            int r11 = r0.f7427t4
            r12 = 1
            if (r11 != r12) goto L_0x007c
            boolean r11 = r30.booleanValue()
            if (r11 != 0) goto L_0x0081
        L_0x007c:
            if (r10 == 0) goto L_0x0081
            r10.setDrawerLockMode(r12)
        L_0x0081:
            r10 = 2131362530(0x7f0a02e2, float:1.8344843E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            android.view.WindowManager r11 = r9.getWindowManager()
            android.view.Display r11 = r11.getDefaultDisplay()
            r13 = 13
            if (r2 < r13) goto L_0x00a1
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r11.getSize(r2)
            int r2 = r2.x
            goto L_0x00a5
        L_0x00a1:
            int r2 = r11.getWidth()
        L_0x00a5:
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r29)
            android.graphics.drawable.GradientDrawable r13 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r14 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r15 = 2
            int[] r5 = new int[r15]
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r12 = "#"
            r15.append(r12)
            r17 = r4
            java.lang.String r4 = r0.f7313c1
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            int r4 = android.graphics.Color.parseColor(r4)
            r15 = 0
            r5[r15] = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r12)
            java.lang.String r15 = r0.f7319d1
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            int r4 = android.graphics.Color.parseColor(r4)
            r15 = 1
            r5[r15] = r4
            r13.<init>(r14, r5)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r5 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r14 = 2
            int[] r15 = new int[r14]
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            r18 = r8
            java.lang.String r8 = r0.f7313c1
            r14.append(r8)
            java.lang.String r8 = r14.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r14 = 0
            r15[r14] = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r12)
            java.lang.String r14 = r0.f7319d1
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r14 = 1
            r15[r14] = r8
            r4.<init>(r5, r15)
            int r5 = r0.f7427t4
            if (r5 != r14) goto L_0x0128
            int r2 = r2 - r6
        L_0x0128:
            r6 = 0
            if (r5 != 0) goto L_0x0166
            boolean r5 = r30.booleanValue()
            if (r5 == 0) goto L_0x0166
            r5 = 1140457472(0x43fa0000, float:500.0)
            android.content.res.Resources r8 = r28.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 + r5
            int r5 = (int) r8
            if (r2 >= r5) goto L_0x0166
            r5 = 2131558458(0x7f0d003a, float:1.8742232E38)
            android.view.View r5 = r11.inflate(r5, r6)
            r0.f7306b = r5
            r8 = 2131362013(0x7f0a00dd, float:1.8343795E38)
            android.view.View r5 = r5.findViewById(r8)
            r5.setBackgroundDrawable(r13)
            android.view.View r5 = r0.f7306b
            r8 = 2131362011(0x7f0a00db, float:1.834379E38)
            android.view.View r5 = r5.findViewById(r8)
            r5.setBackgroundDrawable(r4)
            r4 = 1
            goto L_0x0173
        L_0x0166:
            r4 = 2131558457(0x7f0d0039, float:1.874223E38)
            android.view.View r4 = r11.inflate(r4, r6)
            r0.f7306b = r4
            r4.setBackgroundDrawable(r13)
            r4 = 0
        L_0x0173:
            android.view.View r5 = r0.f7306b
            r8 = 0
            r10.addView(r5, r8)
            android.view.View r5 = r0.f7306b
            r8 = 2131362269(0x7f0a01dd, float:1.8344314E38)
            android.view.View r5 = r5.findViewById(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r12)
            java.lang.String r13 = r0.f7343h1
            r8.append(r13)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r5.setBackgroundColor(r8)
            boolean r5 = r30.booleanValue()
            r13 = 3
            if (r5 == 0) goto L_0x05c7
            r5 = 4
            int[] r14 = new int[r5]
            r0.f7249R1 = r14
            int r14 = r0.f7360k
            r19 = 2131362275(0x7f0a01e3, float:1.8344326E38)
            r20 = 2131362279(0x7f0a01e7, float:1.8344334E38)
            r21 = 2131362274(0x7f0a01e2, float:1.8344324E38)
            r22 = 2131362278(0x7f0a01e6, float:1.8344332E38)
            r23 = 2131362273(0x7f0a01e1, float:1.8344322E38)
            r24 = 2131362277(0x7f0a01e5, float:1.834433E38)
            r25 = 2131362272(0x7f0a01e0, float:1.834432E38)
            if (r14 <= 0) goto L_0x0255
            british.x.i[] r15 = r0.f7237P1
            int r15 = r15.length
            if (r15 > 0) goto L_0x01c8
            int r15 = r0.f7381n0
            if (r15 <= 0) goto L_0x0255
        L_0x01c8:
            r15 = 1
            if (r14 != r15) goto L_0x01d2
            r14 = 2131362272(0x7f0a01e0, float:1.834432E38)
            r15 = 2131362277(0x7f0a01e5, float:1.834433E38)
            goto L_0x01f0
        L_0x01d2:
            r15 = 2
            if (r14 != r15) goto L_0x01dc
            r14 = 2131362273(0x7f0a01e1, float:1.8344322E38)
            r15 = 2131362278(0x7f0a01e6, float:1.8344332E38)
            goto L_0x01f0
        L_0x01dc:
            if (r14 != r13) goto L_0x01e5
            r14 = 2131362274(0x7f0a01e2, float:1.8344324E38)
            r15 = 2131362279(0x7f0a01e7, float:1.8344334E38)
            goto L_0x01f0
        L_0x01e5:
            if (r14 != r5) goto L_0x01ee
            r14 = 2131362275(0x7f0a01e3, float:1.8344326E38)
            r15 = 2131362280(0x7f0a01e8, float:1.8344336E38)
            goto L_0x01f0
        L_0x01ee:
            r14 = 0
            r15 = 0
        L_0x01f0:
            android.view.View r26 = r9.findViewById(r14)
            r6 = r26
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            boolean r5 = r0.f7367l0
            if (r5 == 0) goto L_0x0202
            java.lang.String r5 = "ico_ofics"
            r0.mo7493Y(r5, r6)
            goto L_0x022a
        L_0x0202:
            android.content.res.Resources r5 = r9.getResources()
            r13 = 2131231012(0x7f080124, float:1.8078093E38)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            java.lang.String r8 = r0.f7375m1
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            android.graphics.PorterDuff$Mode r13 = android.graphics.PorterDuff.Mode.MULTIPLY
            r5.setColorFilter(r8, r13)
            r6.setImageDrawable(r5)
        L_0x022a:
            int r5 = r0.f7360k
            int r5 = r5 + 10000
            r6.setId(r5)
            int r5 = r0.f7360k
            int r5 = r5 + 10000
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8 = 2131361812(0x7f0a0014, float:1.8343387E38)
            r6.setTag(r8, r5)
            int[] r5 = r0.f7249R1
            int r6 = r0.f7360k
            int r6 = r6 + 10000
            r8 = 0
            r5[r8] = r6
            android.view.View r5 = r9.findViewById(r15)
            r5.setVisibility(r8)
            if (r4 != 0) goto L_0x0252
            int r2 = r2 - r7
        L_0x0252:
            r5 = 1
            r6 = 1
            goto L_0x0259
        L_0x0255:
            r5 = 0
            r6 = 0
            r14 = 0
            r15 = 0
        L_0x0259:
            int r8 = r0.f7342h
            if (r8 <= 0) goto L_0x02ed
            r13 = 1
            if (r8 != r13) goto L_0x0267
            r14 = 2131362272(0x7f0a01e0, float:1.834432E38)
            r15 = 2131362277(0x7f0a01e5, float:1.834433E38)
            goto L_0x0284
        L_0x0267:
            r6 = 2
            if (r8 != r6) goto L_0x0271
            r14 = 2131362273(0x7f0a01e1, float:1.8344322E38)
            r15 = 2131362278(0x7f0a01e6, float:1.8344332E38)
            goto L_0x0284
        L_0x0271:
            r6 = 3
            if (r8 != r6) goto L_0x027b
            r14 = 2131362274(0x7f0a01e2, float:1.8344324E38)
            r15 = 2131362279(0x7f0a01e7, float:1.8344334E38)
            goto L_0x0284
        L_0x027b:
            r6 = 4
            if (r8 != r6) goto L_0x0284
            r14 = 2131362275(0x7f0a01e3, float:1.8344326E38)
            r15 = 2131362280(0x7f0a01e8, float:1.8344336E38)
        L_0x0284:
            android.view.View r6 = r9.findViewById(r14)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            boolean r8 = r0.f7229O
            if (r8 == 0) goto L_0x0296
            java.lang.String r8 = "ico_share"
            r0.mo7493Y(r8, r6)
            r27 = r14
            goto L_0x02c0
        L_0x0296:
            android.content.res.Resources r8 = r9.getResources()
            r13 = 2131230999(0x7f080117, float:1.8078067E38)
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r27 = r14
            java.lang.String r14 = r0.f7375m1
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            int r13 = android.graphics.Color.parseColor(r13)
            android.graphics.PorterDuff$Mode r14 = android.graphics.PorterDuff.Mode.MULTIPLY
            r8.setColorFilter(r13, r14)
            r6.setImageDrawable(r8)
        L_0x02c0:
            int r8 = r0.f7342h
            int r8 = r8 + 10000
            r6.setId(r8)
            int r8 = r0.f7342h
            int r8 = r8 + 10000
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13 = 2131361812(0x7f0a0014, float:1.8343387E38)
            r6.setTag(r13, r8)
            int[] r6 = r0.f7249R1
            int r8 = r0.f7342h
            int r8 = r8 + 10000
            r6[r5] = r8
            int r5 = r5 + 1
            android.view.View r6 = r9.findViewById(r15)
            r8 = 0
            r6.setVisibility(r8)
            if (r4 != 0) goto L_0x02ea
            int r2 = r2 - r7
        L_0x02ea:
            r14 = r27
            r6 = 1
        L_0x02ed:
            int r8 = r0.f7348i
            if (r8 <= 0) goto L_0x0381
            r13 = 1
            if (r8 != r13) goto L_0x02fb
            r14 = 2131362272(0x7f0a01e0, float:1.834432E38)
            r15 = 2131362277(0x7f0a01e5, float:1.834433E38)
            goto L_0x0318
        L_0x02fb:
            r6 = 2
            if (r8 != r6) goto L_0x0305
            r14 = 2131362273(0x7f0a01e1, float:1.8344322E38)
            r15 = 2131362278(0x7f0a01e6, float:1.8344332E38)
            goto L_0x0318
        L_0x0305:
            r6 = 3
            if (r8 != r6) goto L_0x030f
            r14 = 2131362274(0x7f0a01e2, float:1.8344324E38)
            r15 = 2131362279(0x7f0a01e7, float:1.8344334E38)
            goto L_0x0318
        L_0x030f:
            r6 = 4
            if (r8 != r6) goto L_0x0318
            r14 = 2131362275(0x7f0a01e3, float:1.8344326E38)
            r15 = 2131362280(0x7f0a01e8, float:1.8344336E38)
        L_0x0318:
            android.view.View r6 = r9.findViewById(r14)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            boolean r8 = r0.f7253S
            if (r8 == 0) goto L_0x032a
            java.lang.String r8 = "ico_search"
            r0.mo7493Y(r8, r6)
            r27 = r14
            goto L_0x0354
        L_0x032a:
            android.content.res.Resources r8 = r9.getResources()
            r13 = 2131230892(0x7f0800ac, float:1.807785E38)
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r27 = r14
            java.lang.String r14 = r0.f7375m1
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            int r13 = android.graphics.Color.parseColor(r13)
            android.graphics.PorterDuff$Mode r14 = android.graphics.PorterDuff.Mode.MULTIPLY
            r8.setColorFilter(r13, r14)
            r6.setImageDrawable(r8)
        L_0x0354:
            int r8 = r0.f7348i
            int r8 = r8 + 10000
            r6.setId(r8)
            int r8 = r0.f7348i
            int r8 = r8 + 10000
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13 = 2131361812(0x7f0a0014, float:1.8343387E38)
            r6.setTag(r13, r8)
            int[] r6 = r0.f7249R1
            int r8 = r0.f7348i
            int r8 = r8 + 10000
            r6[r5] = r8
            int r5 = r5 + 1
            android.view.View r6 = r9.findViewById(r15)
            r8 = 0
            r6.setVisibility(r8)
            if (r4 != 0) goto L_0x037e
            int r2 = r2 - r7
        L_0x037e:
            r14 = r27
            r6 = 1
        L_0x0381:
            int r8 = r0.f7354j
            if (r8 <= 0) goto L_0x0439
            int r8 = r0.f7289Y
            if (r8 <= 0) goto L_0x038d
            r27 = r6
        L_0x038b:
            r6 = 1
            goto L_0x03a3
        L_0x038d:
            r8 = 0
        L_0x038e:
            british.x.l[] r13 = r0.f7231O1
            r27 = r6
            int r6 = r13.length
            if (r8 >= r6) goto L_0x03a2
            r6 = r13[r8]
            int r6 = r6.f7954t
            r13 = 5
            if (r6 != r13) goto L_0x039d
            goto L_0x038b
        L_0x039d:
            int r8 = r8 + 1
            r6 = r27
            goto L_0x038e
        L_0x03a2:
            r6 = 0
        L_0x03a3:
            if (r6 == 0) goto L_0x043b
            int r6 = r0.f7354j
            r8 = 1
            if (r6 != r8) goto L_0x03b1
            r14 = 2131362272(0x7f0a01e0, float:1.834432E38)
            r15 = 2131362277(0x7f0a01e5, float:1.834433E38)
            goto L_0x03ce
        L_0x03b1:
            r8 = 2
            if (r6 != r8) goto L_0x03bb
            r14 = 2131362273(0x7f0a01e1, float:1.8344322E38)
            r15 = 2131362278(0x7f0a01e6, float:1.8344332E38)
            goto L_0x03ce
        L_0x03bb:
            r8 = 3
            if (r6 != r8) goto L_0x03c5
            r14 = 2131362274(0x7f0a01e2, float:1.8344324E38)
            r15 = 2131362279(0x7f0a01e7, float:1.8344334E38)
            goto L_0x03ce
        L_0x03c5:
            r8 = 4
            if (r6 != r8) goto L_0x03ce
            r14 = 2131362275(0x7f0a01e3, float:1.8344326E38)
            r15 = 2131362280(0x7f0a01e8, float:1.8344336E38)
        L_0x03ce:
            android.view.View r6 = r9.findViewById(r14)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            boolean r8 = r0.f7277W
            if (r8 == 0) goto L_0x03e0
            java.lang.String r8 = "ico_busc"
            r0.mo7493Y(r8, r6)
            r27 = r14
            goto L_0x040a
        L_0x03e0:
            android.content.res.Resources r8 = r9.getResources()
            r13 = 2131230892(0x7f0800ac, float:1.807785E38)
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r27 = r14
            java.lang.String r14 = r0.f7375m1
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            int r13 = android.graphics.Color.parseColor(r13)
            android.graphics.PorterDuff$Mode r14 = android.graphics.PorterDuff.Mode.MULTIPLY
            r8.setColorFilter(r13, r14)
            r6.setImageDrawable(r8)
        L_0x040a:
            int r8 = r0.f7354j
            int r8 = r8 + 10000
            r6.setId(r8)
            int r8 = r0.f7354j
            int r8 = r8 + 10000
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13 = 2131361812(0x7f0a0014, float:1.8343387E38)
            r6.setTag(r13, r8)
            int[] r6 = r0.f7249R1
            int r8 = r0.f7354j
            int r8 = r8 + 10000
            r6[r5] = r8
            int r5 = r5 + 1
            android.view.View r6 = r9.findViewById(r15)
            r8 = 0
            r6.setVisibility(r8)
            if (r4 != 0) goto L_0x0434
            int r2 = r2 - r7
        L_0x0434:
            r14 = r27
            r27 = 1
            goto L_0x043b
        L_0x0439:
            r27 = r6
        L_0x043b:
            int r6 = r0.f7366l
            if (r6 <= 0) goto L_0x04d0
            r8 = 1
            if (r6 != r8) goto L_0x0449
            r14 = 2131362272(0x7f0a01e0, float:1.834432E38)
            r15 = 2131362277(0x7f0a01e5, float:1.834433E38)
            goto L_0x0466
        L_0x0449:
            r8 = 2
            if (r6 != r8) goto L_0x0453
            r14 = 2131362273(0x7f0a01e1, float:1.8344322E38)
            r15 = 2131362278(0x7f0a01e6, float:1.8344332E38)
            goto L_0x0466
        L_0x0453:
            r8 = 3
            if (r6 != r8) goto L_0x045d
            r14 = 2131362274(0x7f0a01e2, float:1.8344324E38)
            r15 = 2131362279(0x7f0a01e7, float:1.8344334E38)
            goto L_0x0466
        L_0x045d:
            r8 = 4
            if (r6 != r8) goto L_0x0466
            r14 = 2131362275(0x7f0a01e3, float:1.8344326E38)
            r15 = 2131362280(0x7f0a01e8, float:1.8344336E38)
        L_0x0466:
            android.view.View r6 = r9.findViewById(r14)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            boolean r8 = r0.f7395p0
            if (r8 == 0) goto L_0x0478
            java.lang.String r8 = "ico_exit"
            r0.mo7493Y(r8, r6)
            r27 = r14
            goto L_0x04a2
        L_0x0478:
            android.content.res.Resources r8 = r9.getResources()
            r13 = 2131231476(0x7f0802f4, float:1.8079034E38)
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r27 = r14
            java.lang.String r14 = r0.f7375m1
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            int r13 = android.graphics.Color.parseColor(r13)
            android.graphics.PorterDuff$Mode r14 = android.graphics.PorterDuff.Mode.MULTIPLY
            r8.setColorFilter(r13, r14)
            r6.setImageDrawable(r8)
        L_0x04a2:
            int r8 = r0.f7366l
            int r8 = r8 + 10000
            r6.setId(r8)
            int r8 = r0.f7366l
            int r8 = r8 + 10000
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13 = 2131361812(0x7f0a0014, float:1.8343387E38)
            r6.setTag(r13, r8)
            int[] r6 = r0.f7249R1
            int r8 = r0.f7366l
            int r8 = r8 + 10000
            r6[r5] = r8
            int r5 = r5 + 1
            android.view.View r6 = r9.findViewById(r15)
            r8 = 0
            r6.setVisibility(r8)
            if (r4 != 0) goto L_0x04cc
            int r2 = r2 - r7
        L_0x04cc:
            r14 = r27
            r27 = 1
        L_0x04d0:
            int r6 = r0.f7373m
            if (r6 <= 0) goto L_0x0568
            r8 = 1
            if (r6 != r8) goto L_0x04de
            r14 = 2131362272(0x7f0a01e0, float:1.834432E38)
            r15 = 2131362277(0x7f0a01e5, float:1.834433E38)
            goto L_0x04fb
        L_0x04de:
            r8 = 2
            if (r6 != r8) goto L_0x04e8
            r14 = 2131362273(0x7f0a01e1, float:1.8344322E38)
            r15 = 2131362278(0x7f0a01e6, float:1.8344332E38)
            goto L_0x04fb
        L_0x04e8:
            r8 = 3
            if (r6 != r8) goto L_0x04f2
            r14 = 2131362274(0x7f0a01e2, float:1.8344324E38)
            r15 = 2131362279(0x7f0a01e7, float:1.8344334E38)
            goto L_0x04fb
        L_0x04f2:
            r8 = 4
            if (r6 != r8) goto L_0x04fb
            r14 = 2131362275(0x7f0a01e3, float:1.8344326E38)
            r15 = 2131362280(0x7f0a01e8, float:1.8344336E38)
        L_0x04fb:
            android.view.View r6 = r9.findViewById(r14)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            boolean r8 = r0.f7423t0
            if (r8 == 0) goto L_0x050d
            java.lang.String r8 = "ico_notif"
            r0.mo7493Y(r8, r6)
            r27 = r14
            goto L_0x0537
        L_0x050d:
            android.content.res.Resources r8 = r9.getResources()
            r13 = 2131231400(0x7f0802a8, float:1.807888E38)
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r27 = r14
            java.lang.String r14 = r0.f7375m1
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            int r13 = android.graphics.Color.parseColor(r13)
            android.graphics.PorterDuff$Mode r14 = android.graphics.PorterDuff.Mode.MULTIPLY
            r8.setColorFilter(r13, r14)
            r6.setImageDrawable(r8)
        L_0x0537:
            int r8 = r0.f7373m
            int r8 = r8 + 10000
            r6.setId(r8)
            int r8 = r0.f7373m
            int r8 = r8 + 10000
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13 = 2131361812(0x7f0a0014, float:1.8343387E38)
            r6.setTag(r13, r8)
            int[] r6 = r0.f7249R1
            int r8 = r0.f7373m
            int r8 = r8 + 10000
            r6[r5] = r8
            int r5 = r5 + 1
            android.view.View r6 = r9.findViewById(r15)
            r8 = 0
            r6.setVisibility(r8)
            m8154I0(r29)
            if (r4 != 0) goto L_0x0564
            int r2 = r2 - r7
        L_0x0564:
            r14 = r27
            r27 = 1
        L_0x0568:
            int r6 = r0.f7380n
            if (r6 <= 0) goto L_0x05c9
            r8 = 1
            if (r6 != r8) goto L_0x0576
            r14 = 2131362272(0x7f0a01e0, float:1.834432E38)
            r15 = 2131362277(0x7f0a01e5, float:1.834433E38)
            goto L_0x0593
        L_0x0576:
            r8 = 2
            if (r6 != r8) goto L_0x0580
            r14 = 2131362273(0x7f0a01e1, float:1.8344322E38)
            r15 = 2131362278(0x7f0a01e6, float:1.8344332E38)
            goto L_0x0593
        L_0x0580:
            r8 = 3
            if (r6 != r8) goto L_0x058a
            r14 = 2131362274(0x7f0a01e2, float:1.8344324E38)
            r15 = 2131362279(0x7f0a01e7, float:1.8344334E38)
            goto L_0x0593
        L_0x058a:
            r8 = 4
            if (r6 != r8) goto L_0x0593
            r14 = 2131362275(0x7f0a01e3, float:1.8344326E38)
            r15 = 2131362280(0x7f0a01e8, float:1.8344336E38)
        L_0x0593:
            android.view.View r6 = r9.findViewById(r14)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0.mo7478D0(r1, r6)
            int r8 = r0.f7380n
            int r8 = r8 + 10000
            r6.setId(r8)
            int r8 = r0.f7380n
            int r8 = r8 + 10000
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13 = 2131361812(0x7f0a0014, float:1.8343387E38)
            r6.setTag(r13, r8)
            int[] r6 = r0.f7249R1
            int r8 = r0.f7380n
            int r8 = r8 + 10000
            r6[r5] = r8
            android.view.View r5 = r9.findViewById(r15)
            r6 = 0
            r5.setVisibility(r6)
            if (r4 != 0) goto L_0x05c4
            int r2 = r2 - r7
        L_0x05c4:
            r27 = 1
            goto L_0x05c9
        L_0x05c7:
            r27 = 0
        L_0x05c9:
            r5 = 2131362286(0x7f0a01ee, float:1.8344348E38)
            android.view.View r5 = r9.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            java.lang.String r6 = "icohome"
            int[] r6 = r0.mo7493Y(r6, r5)
            r8 = 0
            r13 = r6[r8]
            if (r13 != 0) goto L_0x05e5
            r8 = 1
            r13 = r6[r8]
            if (r13 == 0) goto L_0x05e3
            goto L_0x05e5
        L_0x05e3:
            r8 = 0
            goto L_0x05e6
        L_0x05e5:
            r8 = 1
        L_0x05e6:
            boolean r13 = r30.booleanValue()
            r14 = 8
            if (r13 != 0) goto L_0x05fe
            if (r8 != 0) goto L_0x05fc
            android.view.View r1 = r0.f7306b
            r2 = 2131362269(0x7f0a01dd, float:1.8344314E38)
            android.view.View r1 = r1.findViewById(r2)
            r1.setVisibility(r14)
        L_0x05fc:
            r13 = 0
            return r13
        L_0x05fe:
            r13 = 0
            if (r4 != 0) goto L_0x0620
            r15 = r6[r13]
            float r13 = (float) r15
            float r13 = r13 * r3
            r15 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r15
            int r13 = (int) r13
            r16 = 1
            r6 = r6[r16]
            float r6 = (float) r6
            float r6 = r6 * r3
            float r6 = r6 + r15
            int r3 = (int) r6
            if (r3 <= r7) goto L_0x0618
            int r13 = r13 * r7
            int r13 = r13 / r3
        L_0x0618:
            r3 = r18
            int r3 = java.lang.Math.min(r13, r3)
            int r2 = r2 - r3
            goto L_0x0638
        L_0x0620:
            if (r27 != 0) goto L_0x0638
            r3 = 0
            r7 = r6[r3]
            if (r7 != 0) goto L_0x0638
            r3 = 1
            r6 = r6[r3]
            if (r6 != 0) goto L_0x0638
            android.view.View r3 = r0.f7306b
            r6 = 2131362013(0x7f0a00dd, float:1.8343795E38)
            android.view.View r3 = r3.findViewById(r6)
            r3.setVisibility(r14)
        L_0x0638:
            r3 = 0
            r0.f7330f = r3
            int r3 = r0.f7427t4
            if (r3 != 0) goto L_0x09b4
            int r1 = r0.f7394p
            r3 = 3
            if (r1 != r3) goto L_0x0672
            r1 = 2131362270(0x7f0a01de, float:1.8344316E38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.HorizontalScrollView r1 = (android.widget.HorizontalScrollView) r1
            if (r1 == 0) goto L_0x0672
            java.util.Map<java.lang.Integer, java.lang.Boolean> r3 = f7113M5
            int r5 = r9.hashCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r3.put(r5, r7)
            british.x.config$h0 r3 = new british.x.config$h0     // Catch:{ Exception -> 0x0672 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0672 }
            r1.post(r3)     // Catch:{ Exception -> 0x0672 }
            android.view.ViewTreeObserver r3 = r1.getViewTreeObserver()     // Catch:{ Exception -> 0x0672 }
            british.x.config$i0 r5 = new british.x.config$i0     // Catch:{ Exception -> 0x0672 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0672 }
            r3.addOnScrollChangedListener(r5)     // Catch:{ Exception -> 0x0672 }
        L_0x0672:
            r1 = 2131361804(0x7f0a000c, float:1.834337E38)
            android.view.View r1 = r9.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r3 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r3 = -1
        L_0x0681:
            int r7 = r5.intValue()
            british.x.l[] r9 = r0.f7231O1
            int r10 = r9.length
            if (r7 >= r10) goto L_0x06a3
            int r7 = r5.intValue()
            r7 = r9[r7]
            boolean r7 = r7.f7848B
            if (r7 != 0) goto L_0x0698
            int r3 = r5.intValue()
        L_0x0698:
            int r5 = r5.intValue()
            r7 = 1
            int r5 = r5 + r7
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0681
        L_0x06a3:
            r5 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r5 = 0
        L_0x06a9:
            int r9 = r7.intValue()
            r10 = 2131362895(0x7f0a044f, float:1.8345583E38)
            if (r9 > r3) goto L_0x08b3
            british.x.l[] r9 = r0.f7231O1
            int r13 = r7.intValue()
            r9 = r9[r13]
            boolean r9 = r9.f7848B
            if (r9 != 0) goto L_0x08a7
            r9 = 2131558633(0x7f0d00e9, float:1.8742587E38)
            r13 = 0
            android.view.View r9 = r11.inflate(r9, r13)
            int r13 = r7.intValue()
            if (r13 <= 0) goto L_0x06f4
            boolean r13 = r0.f7213L1
            if (r13 == 0) goto L_0x06f4
            android.view.View r13 = r9.findViewById(r10)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r12)
            java.lang.String r6 = r0.f7325e1
            r15.append(r6)
            java.lang.String r6 = r15.toString()
            int r6 = android.graphics.Color.parseColor(r6)
            r13.setBackgroundColor(r6)
            android.view.View r6 = r9.findViewById(r10)
            r13 = 0
            r6.setVisibility(r13)
        L_0x06f4:
            r6 = 2131363157(0x7f0a0555, float:1.8346115E38)
            android.view.View r6 = r9.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            int r13 = r7.intValue()
            int r15 = r0.f7312c
            if (r13 != r15) goto L_0x079e
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            java.lang.String r15 = r0.f7337g1
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            int r13 = android.graphics.Color.parseColor(r13)
            r6.setTextColor(r13)
            int r13 = r0.f7387o
            if (r13 <= 0) goto L_0x0770
            r15 = 3
            if (r13 >= r15) goto L_0x0770
            r15 = 1
            if (r13 != r15) goto L_0x0733
            android.content.res.Resources r13 = r28.getResources()
            r15 = 2131231479(0x7f0802f7, float:1.807904E38)
            android.graphics.drawable.Drawable r13 = r13.getDrawable(r15)
            goto L_0x073e
        L_0x0733:
            android.content.res.Resources r13 = r28.getResources()
            r15 = 2131231478(0x7f0802f6, float:1.8079038E38)
            android.graphics.drawable.Drawable r13 = r13.getDrawable(r15)
        L_0x073e:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r12)
            java.lang.String r10 = r0.f7349i1
            r15.append(r10)
            java.lang.String r10 = r15.toString()
            int r10 = android.graphics.Color.parseColor(r10)
            android.graphics.PorterDuff$Mode r15 = android.graphics.PorterDuff.Mode.MULTIPLY
            r13.setColorFilter(r10, r15)
            r10 = 2131362404(0x7f0a0264, float:1.8344588E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r10.setImageDrawable(r13)
            r10 = 2131362404(0x7f0a0264, float:1.8344588E38)
            android.view.View r10 = r9.findViewById(r10)
            r13 = 0
            r10.setVisibility(r13)
            goto L_0x07b6
        L_0x0770:
            r10 = 3
            if (r13 != r10) goto L_0x07b6
            r10 = 2131362405(0x7f0a0265, float:1.834459E38)
            android.view.View r10 = r9.findViewById(r10)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            java.lang.String r15 = r0.f7349i1
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            int r13 = android.graphics.Color.parseColor(r13)
            r10.setBackgroundColor(r13)
            r10 = 2131362405(0x7f0a0265, float:1.834459E38)
            android.view.View r10 = r9.findViewById(r10)
            r13 = 0
            r10.setVisibility(r13)
            goto L_0x07b6
        L_0x079e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            java.lang.String r13 = r0.f7331f1
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            int r10 = android.graphics.Color.parseColor(r10)
            r6.setTextColor(r10)
        L_0x07b6:
            british.x.l[] r10 = r0.f7231O1
            int r13 = r7.intValue()
            r10 = r10[r13]
            java.lang.String r10 = r10.f7898a
            r6.setText(r10)
            r1.addView(r9)
            int r10 = r0.f7394p
            r13 = 3
            if (r10 == r13) goto L_0x0802
            r10 = 0
            r9.measure(r10, r10)
            int r10 = r7.intValue()
            if (r10 != r3) goto L_0x07d7
            r17 = 0
        L_0x07d7:
            int r10 = r0.f7330f
            if (r10 != 0) goto L_0x0802
        L_0x07db:
            int r10 = r9.getMeasuredWidth()
            int r10 = r10 + r5
            int r10 = r10 + r17
            if (r10 <= r2) goto L_0x0802
            java.lang.CharSequence r10 = r6.getText()
            java.lang.CharSequence r13 = r6.getText()
            int r13 = r13.length()
            r15 = 1
            int r13 = r13 - r15
            r15 = 0
            java.lang.CharSequence r10 = r10.subSequence(r15, r13)
            java.lang.String r10 = r10.toString()
            r6.setText(r10)
            r9.measure(r15, r15)
            goto L_0x07db
        L_0x0802:
            int r10 = r0.f7394p
            r13 = 3
            if (r10 == r13) goto L_0x088e
            int r10 = r9.getMeasuredWidth()
            int r10 = r10 + r5
            int r10 = r10 + r17
            if (r10 <= r2) goto L_0x088e
            r6.setVisibility(r14)
            r2 = 2131362404(0x7f0a0264, float:1.8344588E38)
            android.view.View r2 = r9.findViewById(r2)
            r2.setVisibility(r14)
            r2 = 2131362405(0x7f0a0265, float:1.834459E38)
            android.view.View r2 = r9.findViewById(r2)
            r2.setVisibility(r14)
            r2 = 2131362395(0x7f0a025b, float:1.834457E38)
            android.view.View r2 = r9.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r5 = 2131362302(0x7f0a01fe, float:1.834438E38)
            r2.setId(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 2131361812(0x7f0a0014, float:1.8343387E38)
            r2.setTag(r6, r5)
            int r5 = r0.f7394p
            r6 = 1
            if (r5 != r6) goto L_0x0851
            android.content.res.Resources r5 = r28.getResources()
            r6 = 2131231347(0x7f080273, float:1.8078772E38)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r6)
            goto L_0x086b
        L_0x0851:
            r6 = 2
            if (r5 != r6) goto L_0x0860
            android.content.res.Resources r5 = r28.getResources()
            r6 = 2131231348(0x7f080274, float:1.8078774E38)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r6)
            goto L_0x086b
        L_0x0860:
            android.content.res.Resources r5 = r28.getResources()
            r6 = 2131231344(0x7f080270, float:1.8078766E38)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r6)
        L_0x086b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r12)
            java.lang.String r7 = r0.f7375m1
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            int r6 = android.graphics.Color.parseColor(r6)
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.MULTIPLY
            r5.setColorFilter(r6, r7)
            r2.setImageDrawable(r5)
            r5 = 0
            r2.setVisibility(r5)
            r2 = 1
            goto L_0x08b4
        L_0x088e:
            int r10 = r7.intValue()
            r6.setId(r10)
            r10 = 2131361812(0x7f0a0014, float:1.8343387E38)
            r6.setTag(r10, r7)
            int r6 = r0.f7330f
            r10 = 1
            int r6 = r6 + r10
            r0.f7330f = r6
            int r6 = r9.getMeasuredWidth()
            int r5 = r5 + r6
            goto L_0x08a8
        L_0x08a7:
            r10 = 1
        L_0x08a8:
            int r6 = r7.intValue()
            int r6 = r6 + r10
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            goto L_0x06a9
        L_0x08b3:
            r2 = 0
        L_0x08b4:
            r5 = -1
            if (r3 != r5) goto L_0x08f1
            if (r27 != 0) goto L_0x08f1
            if (r8 != 0) goto L_0x08f1
            if (r4 == 0) goto L_0x08d7
            android.view.View r1 = r0.f7306b
            r2 = 2131362013(0x7f0a00dd, float:1.8343795E38)
            android.view.View r1 = r1.findViewById(r2)
            r1.setVisibility(r14)
            android.view.View r1 = r0.f7306b
            r2 = 2131362011(0x7f0a00db, float:1.834379E38)
            android.view.View r1 = r1.findViewById(r2)
            r1.setVisibility(r14)
            goto L_0x0c4b
        L_0x08d7:
            android.view.View r1 = r0.f7306b
            r2 = 2131362009(0x7f0a00d9, float:1.8343786E38)
            android.view.View r1 = r1.findViewById(r2)
            r1.setVisibility(r14)
            android.view.View r1 = r0.f7306b
            r2 = 2131362269(0x7f0a01dd, float:1.8344314E38)
            android.view.View r1 = r1.findViewById(r2)
            r1.setVisibility(r14)
            goto L_0x0c4b
        L_0x08f1:
            boolean r3 = r0.f7386n5
            if (r3 == 0) goto L_0x0c4b
            if (r2 != 0) goto L_0x0c4b
            r2 = 2131558633(0x7f0d00e9, float:1.8742587E38)
            r3 = 0
            android.view.View r2 = r11.inflate(r2, r3)
            boolean r3 = r0.f7213L1
            if (r3 == 0) goto L_0x092a
            r3 = 2131362895(0x7f0a044f, float:1.8345583E38)
            android.view.View r4 = r2.findViewById(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r12)
            java.lang.String r6 = r0.f7325e1
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int r5 = android.graphics.Color.parseColor(r5)
            r4.setBackgroundColor(r5)
            android.view.View r3 = r2.findViewById(r3)
            r4 = 0
            r3.setVisibility(r4)
        L_0x092a:
            r3 = 2131363157(0x7f0a0555, float:1.8346115E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1.addView(r2)
            r3.setVisibility(r14)
            r1 = 2131362404(0x7f0a0264, float:1.8344588E38)
            android.view.View r1 = r2.findViewById(r1)
            r1.setVisibility(r14)
            r1 = 2131362405(0x7f0a0265, float:1.834459E38)
            android.view.View r1 = r2.findViewById(r1)
            r1.setVisibility(r14)
            r1 = 2131362395(0x7f0a025b, float:1.834457E38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2 = 2131362302(0x7f0a01fe, float:1.834438E38)
            r1.setId(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2131361812(0x7f0a0014, float:1.8343387E38)
            r1.setTag(r3, r2)
            int r2 = r0.f7394p
            r3 = 1
            if (r2 != r3) goto L_0x0977
            android.content.res.Resources r2 = r28.getResources()
            r3 = 2131231347(0x7f080273, float:1.8078772E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            goto L_0x0991
        L_0x0977:
            r3 = 2
            if (r2 != r3) goto L_0x0986
            android.content.res.Resources r2 = r28.getResources()
            r3 = 2131231348(0x7f080274, float:1.8078774E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            goto L_0x0991
        L_0x0986:
            android.content.res.Resources r2 = r28.getResources()
            r3 = 2131231344(0x7f080270, float:1.8078766E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
        L_0x0991:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            java.lang.String r4 = r0.f7375m1
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY
            r2.setColorFilter(r3, r4)
            r1.setImageDrawable(r2)
            r2 = 0
            r1.setVisibility(r2)
            goto L_0x0c4b
        L_0x09b4:
            r2 = 2131362350(0x7f0a022e, float:1.8344478E38)
            r4 = 1
            if (r3 != r4) goto L_0x0bcf
            android.view.View r3 = r9.findViewById(r2)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.content.res.Resources r4 = r9.getResources()
            r6 = 2131231148(0x7f0801ac, float:1.8078369E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r12)
            java.lang.String r7 = r0.f7375m1
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            int r6 = android.graphics.Color.parseColor(r6)
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.MULTIPLY
            r4.setColorFilter(r6, r7)
            r3.setImageDrawable(r4)
            r4 = 0
            r3.setVisibility(r4)
            british.x.config$j0 r6 = new british.x.config$j0
            r6.<init>()
            r3.setOnClickListener(r6)
            british.x.config$a r3 = new british.x.config$a
            r3.<init>()
            r5.setOnClickListener(r3)
            r3 = 2131362434(0x7f0a0282, float:1.8344648E38)
            android.view.View r3 = r9.findViewById(r3)
            android.widget.ListView r3 = (android.widget.ListView) r3
            r0.f7255S1 = r3
            r3.setCacheColorHint(r4)
            android.widget.ListView r3 = r0.f7255S1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r12)
            java.lang.String r5 = r0.f7234O4
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setBackgroundColor(r4)
            int r3 = r0.f7450x
            if (r3 <= 0) goto L_0x0ac9
            android.widget.ListView r3 = r0.f7255S1
            int r3 = r3.getHeaderViewsCount()
            if (r3 != 0) goto L_0x0a45
            android.view.LayoutInflater r3 = r9.getLayoutInflater()
            r4 = 2131558497(0x7f0d0061, float:1.8742311E38)
            r5 = 0
            android.view.View r3 = r3.inflate(r4, r5)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            android.widget.ListView r4 = r0.f7255S1
            r6 = 0
            r4.addHeaderView(r3, r5, r6)
            goto L_0x0a51
        L_0x0a45:
            r6 = 0
            android.widget.ListView r3 = r0.f7255S1
            r4 = 2131362493(0x7f0a02bd, float:1.8344768E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
        L_0x0a51:
            java.lang.String r4 = "sh"
            android.content.SharedPreferences r4 = r0.getSharedPreferences(r4, r6)
            java.lang.String r5 = "slider_v_act"
            int r5 = r4.getInt(r5, r6)
            int r6 = r0.f7450x
            if (r5 != r6) goto L_0x0a9b
            android.view.View r2 = r3.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            java.lang.String r4 = "slider_header"
            java.io.FileInputStream r4 = r0.openFileInput(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x0a7c }
            java.io.FileDescriptor r5 = r4.getFD()     // Catch:{ Exception | OutOfMemoryError -> 0x0a7c }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFileDescriptor(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0a7c }
            r4.close()     // Catch:{ Exception | OutOfMemoryError -> 0x0a7c }
            r2.setImageBitmap(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0a7c }
            goto L_0x0a7d
        L_0x0a7c:
        L_0x0a7d:
            int r4 = r0.f7457y
            if (r4 <= 0) goto L_0x0a8c
            android.widget.AbsListView$LayoutParams r4 = new android.widget.AbsListView$LayoutParams
            int r5 = r0.f7457y
            r6 = -1
            r4.<init>(r6, r5)
            r3.setLayoutParams(r4)
        L_0x0a8c:
            r4 = 2131362742(0x7f0a03b6, float:1.8345273E38)
            android.view.View r3 = r3.findViewById(r4)
            r3.setVisibility(r14)
            r5 = 0
            r2.setVisibility(r5)
            goto L_0x0ac9
        L_0x0a9b:
            r5 = 0
            java.lang.String r6 = "slider_v_act"
            int r4 = r4.getInt(r6, r5)
            int r5 = r0.f7450x
            if (r4 >= r5) goto L_0x0ac9
            r4 = 2131362742(0x7f0a03b6, float:1.8345273E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            int r5 = r0.f7457y
            if (r5 <= 0) goto L_0x0abe
            android.widget.AbsListView$LayoutParams r5 = new android.widget.AbsListView$LayoutParams
            int r6 = r0.f7457y
            r7 = -1
            r5.<init>(r7, r6)
            r3.setLayoutParams(r5)
        L_0x0abe:
            android.view.View r2 = r3.findViewById(r2)
            r2.setVisibility(r14)
            r2 = 0
            r4.setVisibility(r2)
        L_0x0ac9:
            boolean r2 = r0.f7213L1
            if (r2 == 0) goto L_0x0b3f
            r2 = 3
            int[] r2 = new int[r2]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            java.lang.String r4 = r0.f7325e1
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            java.lang.String r4 = r0.f7325e1
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            r4 = 1
            r2[r4] = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            java.lang.String r4 = r0.f7234O4
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            r4 = 2
            r2[r4] = r3
            android.content.res.Resources r3 = r28.getResources()
            r4 = 2131034119(0x7f050007, float:1.7678747E38)
            boolean r3 = r3.getBoolean(r4)
            if (r3 == 0) goto L_0x0b2d
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT
            r3.<init>(r4, r2)
            goto L_0x0b34
        L_0x0b2d:
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            r3.<init>(r4, r2)
        L_0x0b34:
            android.widget.ListView r2 = r0.f7255S1
            r2.setDivider(r3)
            android.widget.ListView r2 = r0.f7255S1
            r3 = 1
            r2.setDividerHeight(r3)
        L_0x0b3f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f7261T1 = r2
            r2 = 0
        L_0x0b47:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            int r2 = r3.intValue()
            british.x.l[] r4 = r0.f7231O1
            int r5 = r4.length
            if (r2 >= r5) goto L_0x0ba1
            int r2 = r3.intValue()
            r2 = r4[r2]
            boolean r2 = r2.f7848B
            if (r2 != 0) goto L_0x0b99
            british.x.config$m0 r2 = new british.x.config$m0
            r2.<init>()
            british.x.l[] r4 = r0.f7231O1
            int r5 = r3.intValue()
            r4 = r4[r5]
            java.lang.String r4 = r4.f7898a
            r2.f7511a = r4
            british.x.l[] r4 = r0.f7231O1
            int r5 = r3.intValue()
            r4 = r4[r5]
            boolean r4 = r4.f7871M0
            if (r4 != 0) goto L_0x0b8d
            british.x.l[] r4 = r0.f7231O1
            int r5 = r3.intValue()
            r4 = r4[r5]
            android.graphics.Bitmap r4 = r4.f7869L0
            r2.f7512b = r4
            r4 = 0
            r2.f7513c = r4
            r4 = 0
            r5 = 1
            goto L_0x0b93
        L_0x0b8d:
            r4 = 0
            r2.f7512b = r4
            r5 = 1
            r2.f7513c = r5
        L_0x0b93:
            java.util.ArrayList<british.x.config$m0> r6 = r0.f7261T1
            r6.add(r2)
            goto L_0x0b9b
        L_0x0b99:
            r4 = 0
            r5 = 1
        L_0x0b9b:
            int r2 = r3.intValue()
            int r2 = r2 + r5
            goto L_0x0b47
        L_0x0ba1:
            boolean r2 = r0.f7386n5
            if (r2 == 0) goto L_0x0bbf
            british.x.config$m0 r2 = new british.x.config$m0
            r2.<init>()
            android.content.res.Resources r3 = r28.getResources()
            r4 = 2131821037(0x7f1101ed, float:1.9274806E38)
            java.lang.String r3 = r3.getString(r4)
            r2.f7511a = r3
            r3 = 1
            r2.f7514d = r3
            java.util.ArrayList<british.x.config$m0> r3 = r0.f7261T1
            r3.add(r2)
        L_0x0bbf:
            british.x.config$k0 r2 = new british.x.config$k0
            java.util.ArrayList<british.x.config$m0> r3 = r0.f7261T1
            r2.<init>(r3, r1)
            r0.f7267U1 = r2
            android.widget.ListView r1 = r0.f7255S1
            r1.setAdapter(r2)
            goto L_0x0c4b
        L_0x0bcf:
            r4 = 2
            if (r3 != r4) goto L_0x0c4b
            java.lang.Class r3 = r9.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.String r4 = "t_menugrid"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0c4b
            android.view.View r2 = r9.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.res.Resources r3 = r28.getResources()
            r4 = 2131034119(0x7f050007, float:1.7678747E38)
            boolean r3 = r3.getBoolean(r4)
            if (r3 == 0) goto L_0x0c01
            android.content.res.Resources r3 = r9.getResources()
            r4 = 2131231141(0x7f0801a5, float:1.8078355E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)
            goto L_0x0c0c
        L_0x0c01:
            android.content.res.Resources r3 = r9.getResources()
            r4 = 2131231140(0x7f0801a4, float:1.8078353E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)
        L_0x0c0c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r12)
            java.lang.String r6 = r0.f7375m1
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            int r4 = android.graphics.Color.parseColor(r4)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY
            r3.setColorFilter(r4, r6)
            r2.setImageDrawable(r3)
            r3 = 9998(0x270e, float:1.401E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2131361812(0x7f0a0014, float:1.8343387E38)
            r2.setTag(r4, r3)
            r3 = 9998(0x270e, float:1.401E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.setTag(r4, r3)
            r3 = 0
            r2.setVisibility(r3)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r2.setOnClickListener(r1)
            r5.setOnClickListener(r1)
            goto L_0x0c4c
        L_0x0c4b:
            r3 = 0
        L_0x0c4c:
            int r1 = r0.f7427t4
            r2 = 1
            if (r1 != r2) goto L_0x0c95
            boolean r1 = r0.f7219M1
            if (r1 == 0) goto L_0x0c95
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            r4 = 2147483647(0x7fffffff, float:NaN)
            java.util.List r1 = r1.getRunningServices(r4)
            java.util.Iterator r1 = r1.iterator()
            r15 = 0
        L_0x0c69:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0c89
            java.lang.Object r3 = r1.next()
            android.app.ActivityManager$RunningServiceInfo r3 = (android.app.ActivityManager.RunningServiceInfo) r3
            java.lang.Class<british.x.s_cargar_icos> r4 = british.p015x.s_cargar_icos.class
            java.lang.String r4 = r4.getName()
            android.content.ComponentName r3 = r3.service
            java.lang.String r3 = r3.getClassName()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0c69
            r15 = 1
            goto L_0x0c69
        L_0x0c89:
            if (r15 != 0) goto L_0x0c95
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<british.x.s_cargar_icos> r2 = british.p015x.s_cargar_icos.class
            r1.<init>(r0, r2)
            r0.startService(r1)
        L_0x0c95:
            int r1 = r0.f7330f
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1692config.mo7523r0(android.content.Context, java.lang.Boolean):int");
    }

    /* renamed from: s */
    public void mo7524s(ListView listView) {
        listView.setOnItemClickListener(new C1695b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public void mo7525s0(Context context, File file) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Uri e = FileProvider.m3280e(context, "british.x.fileprovider", file);
        intent.putExtra("output", e);
        intent.addFlags(1);
        intent.addFlags(2);
        if (Build.VERSION.SDK_INT < 21) {
            for (ResolveInfo resolveInfo : getPackageManager().queryIntentActivities(intent, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE)) {
                grantUriPermission(resolveInfo.activityInfo.packageName, e, 3);
            }
        }
        try {
            ((Activity) context).startActivityForResult(intent, 106);
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public void mo7526t0(Context context, File file) {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        if (file != null) {
            intent.putExtra("output", FileProvider.m3280e(context, "british.x.fileprovider", file));
        }
        intent.putExtra("android.intent.extra.videoQuality", 0);
        intent.putExtra("android.intent.extra.durationLimit", 40);
        intent.putExtra("android.intent.extra.sizeLimit", 111149056);
        intent.putExtra("android.intent.extra.videoQuality", 0);
        intent.putExtra("android.intent.extra.durationLimit", 40);
        intent.putExtra("android.intent.extra.sizeLimit", 111149056);
        try {
            ((Activity) context).startActivityForResult(intent, 108);
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public C1845j mo7527u0(Context context) {
        C1845j jVar = new C1845j();
        boolean z = true;
        jVar.f7843b = true;
        jVar.f7844c = false;
        Intent intent = new Intent(context, t_oficinas.class);
        C1840i[] iVarArr = this.f7237P1;
        if (iVarArr.length == 1) {
            if (iVarArr[0].f7819d.equals("") && this.f7237P1[0].f7822g.equals("") && this.f7237P1[0].f7823h.equals("") && this.f7237P1[0].f7824i.equals("") && this.f7237P1[0].f7825j.equals("") && this.f7237P1[0].f7826k.equals("")) {
                C1840i[] iVarArr2 = this.f7237P1;
                if (iVarArr2[0].f7828m <= 0 && iVarArr2[0].f7833r == 0) {
                    z = false;
                }
            }
            C1840i[] iVarArr3 = this.f7237P1;
            if (!iVarArr3[0].f7840y || !iVarArr3[0].f7817b.equals("") || !this.f7237P1[0].f7818c.equals("") || !this.f7237P1[0].f7821f.equals("") || this.f7237P1[0].f7841z || z) {
                C1840i[] iVarArr4 = this.f7237P1;
                if (iVarArr4[0].f7840y || iVarArr4[0].f7817b.equals("") || !this.f7237P1[0].f7818c.equals("") || !this.f7237P1[0].f7821f.equals("") || this.f7237P1[0].f7841z || z) {
                    C1840i[] iVarArr5 = this.f7237P1;
                    if (iVarArr5[0].f7840y || !iVarArr5[0].f7817b.equals("") || this.f7237P1[0].f7818c.equals("") || !this.f7237P1[0].f7821f.equals("") || this.f7237P1[0].f7841z || z) {
                        C1840i[] iVarArr6 = this.f7237P1;
                        if (!iVarArr6[0].f7840y && iVarArr6[0].f7817b.equals("") && this.f7237P1[0].f7818c.equals("") && !this.f7237P1[0].f7821f.equals("")) {
                            C1840i[] iVarArr7 = this.f7237P1;
                            if (!iVarArr7[0].f7841z && !z) {
                                if (iVarArr7[0].f7815B) {
                                    intent = new Intent("android.intent.action.VIEW");
                                    intent.setData(Uri.parse(this.f7237P1[0].f7821f));
                                    if (this.f7296Z0 && m8180b(this.f7237P1[0].f7821f)) {
                                        Bundle bundle = new Bundle();
                                        bundle.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
                                        try {
                                            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", Color.parseColor("#" + this.f7313c1));
                                        } catch (Exception unused) {
                                        }
                                        intent.putExtras(bundle);
                                    }
                                    jVar.f7843b = false;
                                } else {
                                    intent = new Intent(context, t_url.class);
                                    intent.putExtra("url", this.f7237P1[0].f7821f);
                                }
                            }
                        }
                        C1840i[] iVarArr8 = this.f7237P1;
                        if (!iVarArr8[0].f7840y && iVarArr8[0].f7817b.equals("") && this.f7237P1[0].f7818c.equals("") && this.f7237P1[0].f7821f.equals("") && this.f7237P1[0].f7841z && !z) {
                            intent = new Intent(context, chat.class);
                        }
                    } else {
                        intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + this.f7237P1[0].f7818c));
                        jVar.f7843b = false;
                    }
                } else {
                    intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + this.f7237P1[0].f7817b));
                    jVar.f7843b = false;
                }
            } else {
                intent = new Intent(context, contactar.class);
                intent.putExtra("idofic", this.f7237P1[0].f7827l);
            }
        }
        jVar.f7842a = intent;
        return jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public C1845j mo7528v0(Context context) {
        C1845j jVar = new C1845j();
        int i = 1;
        jVar.f7843b = true;
        jVar.f7844c = false;
        Intent intent = new Intent(context, t_buscador_form.class);
        if (!this.f7158C0 && !this.f7164D0 && !this.f7170E0 && !this.f7176F0 && !this.f7182G0 && !this.f7188H0 && !this.f7194I0) {
            intent = new Intent(context, t_buscador.class);
            if (this.f7218M0.indexOf("TITULO") == -1) {
                i = this.f7218M0.indexOf("PRECIO") != -1 ? 2 : 3;
            }
            intent.putExtra("orden", i);
            intent.putExtra("orden_tipo", this.f7218M0.contains("ASC"));
        }
        jVar.f7842a = intent;
        return jVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x1035, code lost:
        if (r3.equals("") != false) goto L_0x1037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x1091, code lost:
        if (r3.equals("") != false) goto L_0x1037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x1155, code lost:
        if (r3.equals("") != false) goto L_0x1037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:800:0x24ed, code lost:
        if (r1 != -1) goto L_0x24f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:501:0x1169  */
    /* JADX WARNING: Removed duplicated region for block: B:794:0x24b0  */
    /* JADX WARNING: Removed duplicated region for block: B:810:0x2520  */
    /* JADX WARNING: Removed duplicated region for block: B:813:0x253c A[LOOP:13: B:812:0x253a->B:813:0x253c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:816:0x2549  */
    /* JADX WARNING: Removed duplicated region for block: B:817:0x254d  */
    /* JADX WARNING: Removed duplicated region for block: B:821:0x2559  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo7529z(java.lang.String[] r30, java.lang.String[] r31, android.os.Bundle r32, android.content.Intent r33) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = 0
            r0.f7317c5 = r4
            java.lang.String r5 = "sh"
            android.content.SharedPreferences r5 = r0.getSharedPreferences(r5, r4)
            r5.registerOnSharedPreferenceChangeListener(r0)
            java.lang.String r6 = "ico_busc_ord"
            int r6 = r5.getInt(r6, r4)
            r0.f7354j = r6
            java.lang.String r6 = "ico_share_ord"
            int r6 = r5.getInt(r6, r4)
            r0.f7342h = r6
            java.lang.String r6 = "ico_ofics_ord"
            int r6 = r5.getInt(r6, r4)
            r0.f7360k = r6
            java.lang.String r6 = "ico_exit_ord"
            int r6 = r5.getInt(r6, r4)
            r0.f7366l = r6
            java.lang.String r6 = "ico_notif_ord"
            int r6 = r5.getInt(r6, r4)
            r0.f7373m = r6
            java.lang.String r6 = "ic_po"
            int r6 = r5.getInt(r6, r4)
            r0.f7380n = r6
            java.lang.String r6 = "ic_so"
            int r6 = r5.getInt(r6, r4)
            r0.f7348i = r6
            java.lang.String r6 = "io1"
            int r6 = r5.getInt(r6, r4)
            r7 = 1
            if (r6 != r7) goto L_0x0057
            r6 = 1
            goto L_0x0058
        L_0x0057:
            r6 = 0
        L_0x0058:
            r0.f7367l0 = r6
            java.lang.String r6 = "io2"
            int r6 = r5.getInt(r6, r4)
            r0.f7374m0 = r6
            java.lang.String r6 = "io3"
            int r6 = r5.getInt(r6, r4)
            r0.f7381n0 = r6
            java.lang.String r6 = "io4"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7388o0 = r6
            java.lang.String r6 = "ib1"
            int r6 = r5.getInt(r6, r4)
            if (r6 != r7) goto L_0x007e
            r6 = 1
            goto L_0x007f
        L_0x007e:
            r6 = 0
        L_0x007f:
            r0.f7277W = r6
            java.lang.String r6 = "ib2"
            int r6 = r5.getInt(r6, r4)
            r0.f7283X = r6
            java.lang.String r6 = "ib3"
            int r6 = r5.getInt(r6, r4)
            r0.f7289Y = r6
            java.lang.String r6 = "ib4"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7295Z = r6
            java.lang.String r6 = "ie1"
            int r6 = r5.getInt(r6, r4)
            if (r6 != r7) goto L_0x00a3
            r6 = 1
            goto L_0x00a4
        L_0x00a3:
            r6 = 0
        L_0x00a4:
            r0.f7395p0 = r6
            java.lang.String r6 = "ie2"
            int r6 = r5.getInt(r6, r4)
            r0.f7402q0 = r6
            java.lang.String r6 = "ie3"
            int r6 = r5.getInt(r6, r4)
            r0.f7409r0 = r6
            java.lang.String r6 = "ie4"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7416s0 = r6
            java.lang.String r6 = "in1"
            int r6 = r5.getInt(r6, r4)
            if (r6 != r7) goto L_0x00c8
            r6 = 1
            goto L_0x00c9
        L_0x00c8:
            r6 = 0
        L_0x00c9:
            r0.f7423t0 = r6
            java.lang.String r6 = "in2"
            int r6 = r5.getInt(r6, r4)
            r0.f7430u0 = r6
            java.lang.String r6 = "in3"
            int r6 = r5.getInt(r6, r4)
            r0.f7437v0 = r6
            java.lang.String r6 = "in4"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7444w0 = r6
            java.lang.String r6 = "is1"
            int r6 = r5.getInt(r6, r4)
            if (r6 != r7) goto L_0x00ed
            r6 = 1
            goto L_0x00ee
        L_0x00ed:
            r6 = 0
        L_0x00ee:
            r0.f7229O = r6
            java.lang.String r6 = "is2"
            int r6 = r5.getInt(r6, r4)
            r0.f7235P = r6
            java.lang.String r6 = "is3"
            int r6 = r5.getInt(r6, r4)
            r0.f7241Q = r6
            java.lang.String r6 = "is4"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7247R = r6
            java.lang.String r6 = "ir1"
            int r6 = r5.getInt(r6, r4)
            if (r6 != r7) goto L_0x0112
            r6 = 1
            goto L_0x0113
        L_0x0112:
            r6 = 0
        L_0x0113:
            r0.f7253S = r6
            java.lang.String r6 = "ir2"
            int r6 = r5.getInt(r6, r4)
            r0.f7259T = r6
            java.lang.String r6 = "ir3"
            int r6 = r5.getInt(r6, r4)
            r0.f7265U = r6
            java.lang.String r6 = "ir4"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7271V = r6
            java.lang.String r6 = "ip1"
            int r6 = r5.getInt(r6, r4)
            if (r6 != r7) goto L_0x0137
            r6 = 1
            goto L_0x0138
        L_0x0137:
            r6 = 0
        L_0x0138:
            r0.f7451x0 = r6
            java.lang.String r6 = "ip2"
            int r6 = r5.getInt(r6, r4)
            r0.f7458y0 = r6
            java.lang.String r6 = "ip3"
            int r6 = r5.getInt(r6, r4)
            r0.f7465z0 = r6
            java.lang.String r6 = "ip4"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7152B0 = r6
            java.lang.String r6 = "ip5"
            int r6 = r5.getInt(r6, r4)
            r0.f7146A0 = r6
            java.lang.String r6 = "share_subject"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7301a1 = r6
            java.lang.String r6 = "share_text"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7307b1 = r6
            java.lang.String r6 = "our"
            int r6 = r5.getInt(r6, r4)
            f7139m6 = r6
            java.lang.String r6 = "admob_cod"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7315c3 = r6
            java.lang.String r6 = "admob_pos"
            int r6 = r5.getInt(r6, r4)
            r0.f7384n3 = r6
            com.google.android.gms.ads.AdSize r6 = com.google.android.gms.ads.AdSize.SMART_BANNER
            r0.f7419s3 = r6
            f7141o6 = r4
            f7140n6 = r7
            java.lang.String r6 = "i2"
            java.lang.String r6 = r5.getString(r6, r8)
            boolean r9 = r6.equals(r8)
            r10 = 2
            java.lang.String r11 = "1"
            if (r9 != 0) goto L_0x01ad
            java.lang.String r9 = r6.substring(r4, r7)
            boolean r9 = r9.equals(r11)
            f7141o6 = r9
            java.lang.String r6 = r6.substring(r7, r10)
            int r6 = java.lang.Integer.parseInt(r6)
            f7140n6 = r6
        L_0x01ad:
            java.lang.String r6 = "fbb"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7333f3 = r6
            java.lang.String r6 = "fbi"
            java.lang.String r6 = r5.getString(r6, r8)
            f7125Y5 = r6
            java.lang.String r6 = "fbm"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7215L3 = r6
            java.lang.String r6 = "fbp"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7209K3 = r6
            java.lang.String r6 = "fbr"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7269U3 = r6
            java.lang.String r6 = "pfc"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7358j4 = r6
            java.lang.String r6 = "stb"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7339g3 = r6
            java.lang.String r6 = "sti"
            java.lang.String r6 = r5.getString(r6, r8)
            f7126Z5 = r6
            java.lang.String r6 = "stm"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7227N3 = r6
            java.lang.String r6 = "stp"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7221M3 = r6
            java.lang.String r6 = "str"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7275V3 = r6
            java.lang.String r6 = "iiu"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7346h4 = r6
            java.lang.String r6 = "piu"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7352i4 = r6
            java.lang.String r6 = "aai"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7363k3 = r6
            java.lang.String r6 = "abc"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7345h3 = r6
            java.lang.String r6 = "aic"
            java.lang.String r6 = r5.getString(r6, r8)
            f7127a6 = r6
            java.lang.String r6 = "arc"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7281W3 = r6
            java.lang.String r6 = "uai"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7370l3 = r6
            java.lang.String r6 = "ubc"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7351i3 = r6
            java.lang.String r6 = "uic"
            java.lang.String r6 = r5.getString(r6, r8)
            f7128b6 = r6
            java.lang.String r6 = "urc"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7287X3 = r6
            java.lang.String r6 = "iai"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7377m3 = r6
            r0.f7357j3 = r8
            r0.f7233O3 = r8
            r0.f7239P3 = r8
            r0.f7155B3 = r8
            r0.f7185G3 = r8
            f7129c6 = r8
            r0.f7293Y3 = r8
            r0.f7299Z3 = r8
            boolean r6 = r6.equals(r8)
            java.lang.String r9 = "0"
            if (r6 != 0) goto L_0x02f5
            java.lang.String r6 = "ibc"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7357j3 = r6
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0285
            r0.f7357j3 = r8
        L_0x0285:
            java.lang.String r6 = "ipc"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7233O3 = r6
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0295
            r0.f7233O3 = r8
        L_0x0295:
            java.lang.String r6 = "imc"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7239P3 = r6
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x02a5
            r0.f7239P3 = r8
        L_0x02a5:
            java.lang.String r6 = "irc"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7155B3 = r6
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x02b5
            r0.f7155B3 = r8
        L_0x02b5:
            java.lang.String r6 = "iqc"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7185G3 = r6
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x02c5
            r0.f7185G3 = r8
        L_0x02c5:
            java.lang.String r6 = "iic"
            java.lang.String r6 = r5.getString(r6, r8)
            f7129c6 = r6
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x02d5
            f7129c6 = r8
        L_0x02d5:
            java.lang.String r6 = "iwc"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7293Y3 = r6
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x02e5
            r0.f7293Y3 = r8
        L_0x02e5:
            java.lang.String r6 = "icc"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7299Z3 = r6
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x02f5
            r0.f7299Z3 = r8
        L_0x02f5:
            java.lang.String r6 = "a_ra"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7454x3 = r6
            java.lang.String r6 = "n_ra"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7461y3 = r6
            java.lang.String r6 = "f_ra"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7468z3 = r6
            java.lang.String r6 = "st_ra"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7149A3 = r6
            java.lang.String r6 = "a_qr"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7161C3 = r6
            java.lang.String r6 = "n_qr"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7167D3 = r6
            java.lang.String r6 = "f_qr"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7173E3 = r6
            java.lang.String r6 = "st_qr"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7179F3 = r6
            java.lang.String r6 = "n_i_c"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7426t3 = r6
            java.lang.String r6 = "st_i_c"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7433u3 = r6
            java.lang.String r6 = "ic_1"
            int r6 = r5.getInt(r6, r4)
            r0.f7440v3 = r6
            java.lang.String r6 = "ic_v"
            int r6 = r5.getInt(r6, r4)
            r0.f7447w3 = r6
            java.lang.String r6 = "a_p_c"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7321d3 = r6
            java.lang.String r6 = "n_p_c"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7191H3 = r6
            java.lang.String r6 = "upc"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7327e3 = r6
            java.lang.String r6 = "a_m_c"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7197I3 = r6
            java.lang.String r6 = "n_m_c"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7203J3 = r6
            java.lang.String r6 = "a_r_c"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7245Q3 = r6
            java.lang.String r6 = "n_r_c"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7251R3 = r6
            java.lang.String r6 = "r_mo"
            int r6 = r5.getInt(r6, r4)
            r0.f7340g4 = r6
            java.lang.String r6 = "r_ms"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7257S3 = r6
            java.lang.String r6 = "r_pms"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7263T3 = r6
            r0.f7316c4 = r4
            r0.f7322d4 = r4
            java.lang.String r6 = "a_p_s"
            java.lang.String r12 = "0x0"
            java.lang.String r6 = r5.getString(r6, r12)
            java.lang.String r12 = "x"
            java.lang.String[] r6 = r6.split(r12)
            int r12 = r6.length
            if (r12 != r10) goto L_0x03ca
            r12 = r6[r4]
            int r12 = java.lang.Integer.parseInt(r12)
            r0.f7316c4 = r12
            r6 = r6[r7]
            int r6 = java.lang.Integer.parseInt(r6)
            r0.f7322d4 = r6
        L_0x03ca:
            r0.f7328e4 = r4
            r0.f7334f4 = r4
            java.lang.String r6 = "a_m_s"
            java.lang.String r12 = "0x0"
            java.lang.String r6 = r5.getString(r6, r12)
            java.lang.String r12 = "x"
            java.lang.String[] r6 = r6.split(r12)
            int r12 = r6.length
            if (r12 != r10) goto L_0x03ef
            r12 = r6[r4]
            int r12 = java.lang.Integer.parseInt(r12)
            r0.f7328e4 = r12
            r6 = r6[r7]
            int r6 = java.lang.Integer.parseInt(r6)
            r0.f7334f4 = r6
        L_0x03ef:
            boolean r6 = r0.f7413r4
            if (r6 == 0) goto L_0x0413
            java.lang.String r6 = "ca_a"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7385n4 = r6
            java.lang.String r6 = "ca_n"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7392o4 = r6
            java.lang.String r6 = "ca_f"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7399p4 = r6
            java.lang.String r6 = "ca_s"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7406q4 = r6
        L_0x0413:
            java.lang.String r6 = "fca"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7371l4 = r6
            java.lang.String r6 = "fcs"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7378m4 = r6
            java.lang.String r6 = "admob_sma"
            int r6 = r5.getInt(r6, r7)
            if (r6 != 0) goto L_0x0430
            com.google.android.gms.ads.AdSize r6 = com.google.android.gms.ads.AdSize.BANNER
            r0.f7419s3 = r6
            goto L_0x043c
        L_0x0430:
            java.lang.String r6 = "admob_sma"
            int r6 = r5.getInt(r6, r7)
            if (r6 != r10) goto L_0x043c
            com.google.android.gms.ads.AdSize r6 = com.google.android.gms.ads.AdSize.LARGE_BANNER
            r0.f7419s3 = r6
        L_0x043c:
            java.lang.String r6 = "admob_int_cod"
            java.lang.String r6 = r5.getString(r6, r8)
            f7124X5 = r6
            java.lang.String r6 = "tcn"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7424t1 = r6
            java.lang.String r6 = "b_c"
            int r6 = r5.getInt(r6, r7)
            if (r6 != r7) goto L_0x0456
            r6 = 1
            goto L_0x0457
        L_0x0456:
            r6 = 0
        L_0x0457:
            r0.f7279W1 = r6
            java.lang.String r6 = "l_c"
            int r6 = r5.getInt(r6, r7)
            if (r6 != r7) goto L_0x0463
            r6 = 1
            goto L_0x0464
        L_0x0463:
            r6 = 0
        L_0x0464:
            r0.f7273V1 = r6
            java.lang.String r6 = "fp"
            int r6 = r5.getInt(r6, r7)
            if (r6 != r7) goto L_0x0470
            r6 = 1
            goto L_0x0471
        L_0x0470:
            r6 = 0
        L_0x0471:
            r0.f7285X1 = r6
            java.lang.String r6 = "cvm"
            int r6 = r5.getInt(r6, r4)
            r0.f7350i2 = r6
            java.lang.String r6 = "emo"
            int r6 = r5.getInt(r6, r7)
            if (r6 != r7) goto L_0x0485
            r6 = 1
            goto L_0x0486
        L_0x0485:
            r6 = 0
        L_0x0486:
            r0.f7291Y1 = r6
            r0.f7338g2 = r7
            r0.f7297Z1 = r7
            r0.f7302a2 = r4
            r0.f7290Y0 = r4
            r0.f7386n5 = r4
            r0.f7308b2 = r4
            r0.f7324e = r4
            r0.f7464z = r7
            r0.f7151B = r7
            r0.f7314c2 = r4
            r0.f7320d2 = r4
            r0.f7326e2 = r4
            r0.f7332f2 = r4
            r0.f7296Z0 = r4
            java.lang.String r6 = "i"
            java.lang.String r6 = r5.getString(r6, r8)
            boolean r12 = r6.equals(r8)
            r15 = 5
            r14 = 4
            r13 = 3
            if (r12 != 0) goto L_0x0651
            java.lang.String r12 = r6.substring(r4, r7)
            int r12 = java.lang.Integer.parseInt(r12)
            r0.f7338g2 = r12
            java.lang.String r12 = r6.substring(r7, r10)
            boolean r12 = r12.equals(r11)
            r0.f7297Z1 = r12
            java.lang.String r12 = r6.substring(r10, r13)
            boolean r12 = r12.equals(r11)
            r0.f7302a2 = r12
            java.lang.String r12 = r6.substring(r13, r14)
            boolean r12 = r12.equals(r11)
            r0.f7260T0 = r12
            java.lang.String r12 = r6.substring(r14, r15)
            boolean r12 = r12.equals(r11)
            r0.f7266U0 = r12
            r12 = 6
            java.lang.String r14 = r6.substring(r15, r12)
            boolean r14 = r14.equals(r11)
            r0.f7272V0 = r14
            r14 = 7
            java.lang.String r15 = r6.substring(r12, r14)
            boolean r12 = r15.equals(r11)
            r0.f7278W0 = r12
            r12 = 8
            java.lang.String r15 = r6.substring(r14, r12)
            boolean r14 = r15.equals(r11)
            r0.f7284X0 = r14
            r14 = 9
            java.lang.String r15 = r6.substring(r12, r14)
            boolean r12 = r15.equals(r11)
            r0.f7290Y0 = r12
            r12 = 10
            java.lang.String r15 = r6.substring(r14, r12)
            boolean r14 = r15.equals(r11)
            r0.f7386n5 = r14
            int r14 = r6.length()
            if (r14 <= r12) goto L_0x0532
            r14 = 11
            java.lang.String r15 = r6.substring(r12, r14)
            boolean r12 = r15.equals(r11)
            r0.f7324e = r12
            goto L_0x0534
        L_0x0532:
            r14 = 11
        L_0x0534:
            int r12 = r6.length()
            if (r12 <= r14) goto L_0x0547
            r12 = 12
            java.lang.String r15 = r6.substring(r14, r12)
            boolean r14 = r15.equals(r11)
            r0.f7308b2 = r14
            goto L_0x0549
        L_0x0547:
            r12 = 12
        L_0x0549:
            int r14 = r6.length()
            if (r14 <= r12) goto L_0x055b
            r14 = 13
            java.lang.String r14 = r6.substring(r12, r14)
            boolean r12 = r14.equals(r11)
            r0.f7464z = r12
        L_0x055b:
            int r12 = r6.length()
            r14 = 13
            if (r12 <= r14) goto L_0x0571
            r12 = 13
            r14 = 14
            java.lang.String r12 = r6.substring(r12, r14)
            int r12 = java.lang.Integer.parseInt(r12)
            r0.f7151B = r12
        L_0x0571:
            int r12 = r6.length()
            r14 = 14
            if (r12 <= r14) goto L_0x0595
            r12 = 14
            r14 = 15
            java.lang.String r12 = r6.substring(r12, r14)
            boolean r12 = r12.equals(r11)
            r0.f7145A = r12
            r12 = 15
            r14 = 16
            java.lang.String r12 = r6.substring(r12, r14)
            int r12 = java.lang.Integer.parseInt(r12)
            r0.f7157C = r12
        L_0x0595:
            int r12 = r6.length()
            r14 = 16
            if (r12 <= r14) goto L_0x05e3
            r12 = 16
            r14 = 17
            java.lang.String r12 = r6.substring(r12, r14)
            int r12 = java.lang.Integer.parseInt(r12)
            r0.f7439v2 = r12
            r12 = 17
            r14 = 18
            java.lang.String r12 = r6.substring(r12, r14)
            int r12 = java.lang.Integer.parseInt(r12)
            r0.f7446w2 = r12
            r12 = 18
            r14 = 19
            java.lang.String r12 = r6.substring(r12, r14)
            int r12 = java.lang.Integer.parseInt(r12)
            r0.f7453x2 = r12
            r12 = 19
            r14 = 20
            java.lang.String r12 = r6.substring(r12, r14)
            int r12 = java.lang.Integer.parseInt(r12)
            r0.f7460y2 = r12
            r12 = 20
            r14 = 21
            java.lang.String r12 = r6.substring(r12, r14)
            int r12 = java.lang.Integer.parseInt(r12)
            r0.f7467z2 = r12
        L_0x05e3:
            int r12 = r6.length()
            r14 = 21
            if (r12 <= r14) goto L_0x05f9
            r12 = 21
            r14 = 22
            java.lang.String r12 = r6.substring(r12, r14)
            boolean r12 = r12.equals(r11)
            r0.f7314c2 = r12
        L_0x05f9:
            int r12 = r6.length()
            r14 = 24
            if (r12 <= r14) goto L_0x060f
            r12 = 24
            r14 = 25
            java.lang.String r12 = r6.substring(r12, r14)
            boolean r12 = r12.equals(r11)
            r0.f7326e2 = r12
        L_0x060f:
            int r12 = r6.length()
            r14 = 25
            if (r12 <= r14) goto L_0x0625
            r12 = 25
            r14 = 26
            java.lang.String r12 = r6.substring(r12, r14)
            boolean r12 = r12.equals(r11)
            r0.f7332f2 = r12
        L_0x0625:
            int r12 = r6.length()
            r14 = 26
            if (r12 <= r14) goto L_0x063b
            r12 = 26
            r14 = 27
            java.lang.String r12 = r6.substring(r12, r14)
            boolean r12 = r12.equals(r11)
            r0.f7296Z0 = r12
        L_0x063b:
            int r12 = r6.length()
            r14 = 27
            if (r12 <= r14) goto L_0x0651
            r12 = 27
            r14 = 28
            java.lang.String r6 = r6.substring(r12, r14)
            boolean r6 = r6.equals(r11)
            r0.f7320d2 = r6
        L_0x0651:
            java.lang.String r6 = "cb"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7356j2 = r6
            java.lang.String r6 = "fv"
            int r6 = r5.getInt(r6, r4)
            r0.f7163D = r6
            r6 = 1
            r12 = 0
        L_0x0663:
            r14 = 6
            if (r6 >= r14) goto L_0x0686
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "mb_"
            r14.append(r15)
            r14.append(r6)
            java.lang.String r14 = r14.toString()
            java.lang.String r14 = r5.getString(r14, r8)
            boolean r14 = r14.equals(r8)
            if (r14 != 0) goto L_0x0683
            int r12 = r12 + 1
        L_0x0683:
            int r6 = r6 + 1
            goto L_0x0663
        L_0x0686:
            british.x.config$q0[] r6 = new british.p015x.C1692config.C1730q0[r12]
            f7115O5 = r6
            r6 = 1
            r12 = 0
        L_0x068c:
            java.lang.String r14 = "@"
            r15 = 6
            if (r6 >= r15) goto L_0x0726
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r13 = "mb_"
            r15.append(r13)
            r15.append(r6)
            java.lang.String r13 = r15.toString()
            java.lang.String r13 = r5.getString(r13, r8)
            boolean r15 = r13.equals(r8)
            if (r15 != 0) goto L_0x071f
            british.x.config$q0[] r15 = f7115O5
            british.x.config$q0 r18 = new british.x.config$q0
            r18.<init>()
            r15[r12] = r18
            java.lang.String[] r13 = r13.split(r14)
            british.x.config$q0[] r15 = f7115O5
            r15 = r15[r12]
            r18 = r13[r4]
            int r4 = java.lang.Integer.parseInt(r18)
            r15.f7544b = r4
            british.x.config$q0[] r4 = f7115O5
            r4 = r4[r12]
            r15 = r13[r7]
            java.lang.String r7 = "-ARR-"
            java.lang.String r7 = r15.replace(r7, r14)
            r4.f7543a = r7
            r4 = r13[r10]
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L_0x06e9
            british.x.config$q0[] r4 = f7115O5
            r4 = r4[r12]
            r7 = 3
            r15 = r13[r7]
            int r7 = java.lang.Integer.parseInt(r15)
            r4.f7546d = r7
            goto L_0x06f0
        L_0x06e9:
            british.x.config$q0[] r4 = f7115O5
            r4 = r4[r12]
            r7 = 0
            r4.f7546d = r7
        L_0x06f0:
            british.x.config$q0[] r4 = f7115O5
            r4 = r4[r12]
            r7 = 4
            r15 = r13[r7]
            int r7 = java.lang.Integer.parseInt(r15)
            r4.f7545c = r7
            british.x.config$q0[] r4 = f7115O5
            r4 = r4[r12]
            r7 = 5
            r15 = r13[r7]
            java.lang.String r7 = "-ARR-"
            java.lang.String r7 = r15.replace(r7, r14)
            r4.f7547e = r7
            british.x.config$q0[] r4 = f7115O5
            r4 = r4[r12]
            r7 = 6
            r13 = r13[r7]
            boolean r7 = r13.equals(r11)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r4.f7548f = r7
            int r12 = r12 + 1
        L_0x071f:
            int r6 = r6 + 1
            r4 = 0
            r7 = 1
            r13 = 3
            goto L_0x068c
        L_0x0726:
            java.lang.String r4 = "mb_cbg"
            java.lang.String r4 = r5.getString(r4, r8)
            f7117Q5 = r4
            java.lang.String r4 = "mb_cit"
            java.lang.String r4 = r5.getString(r4, r8)
            f7118R5 = r4
            java.lang.String r4 = "vipe"
            r6 = 0
            int r4 = r5.getInt(r4, r6)
            r0.f7169E = r4
            java.lang.String r4 = "vipr"
            int r4 = r5.getInt(r4, r6)
            r0.f7175F = r4
            java.lang.String r4 = "vifo"
            int r4 = r5.getInt(r4, r6)
            r0.f7181G = r4
            java.lang.String r4 = "vivi"
            int r4 = r5.getInt(r4, r6)
            r0.f7187H = r4
            java.lang.String r4 = "viem"
            int r4 = r5.getInt(r4, r6)
            r0.f7193I = r4
            java.lang.String r4 = "vien"
            int r4 = r5.getInt(r4, r6)
            r0.f7199J = r4
            java.lang.String r4 = "mv"
            r7 = 8
            int r4 = r5.getInt(r4, r7)
            r0.f7344h2 = r4
            java.lang.String r4 = "r_p"
            int r4 = r5.getInt(r4, r6)
            r0.f7154B2 = r4
            java.lang.String r4 = "r_t_c"
            int r4 = r5.getInt(r4, r6)
            r7 = 1
            if (r4 != r7) goto L_0x0784
            r4 = 1
            goto L_0x0785
        L_0x0784:
            r4 = 0
        L_0x0785:
            r0.f7190H2 = r4
            java.lang.String r4 = "r_a_s"
            int r4 = r5.getInt(r4, r6)
            r0.f7160C2 = r4
            java.lang.String r4 = "r_s_s"
            int r4 = r5.getInt(r4, r6)
            r0.f7166D2 = r4
            java.lang.String r4 = "r_a_c"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7196I2 = r4
            java.lang.String r4 = "r_s_c"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7202J2 = r4
            java.lang.String r4 = "r_a_b"
            int r4 = r5.getInt(r4, r6)
            r7 = 1
            if (r4 != r7) goto L_0x07b2
            r4 = 1
            goto L_0x07b3
        L_0x07b2:
            r4 = 0
        L_0x07b3:
            r0.f7178F2 = r4
            java.lang.String r4 = "r_s_b"
            int r4 = r5.getInt(r4, r6)
            if (r4 != r7) goto L_0x07bf
            r4 = 1
            goto L_0x07c0
        L_0x07bf:
            r4 = 0
        L_0x07c0:
            r0.f7184G2 = r4
            java.lang.String r4 = "r_a"
            int r4 = r5.getInt(r4, r6)
            r0.f7172E2 = r4
            java.lang.String r4 = "cs_v"
            int r4 = r5.getInt(r4, r6)
            if (r4 != r7) goto L_0x07d4
            r4 = 1
            goto L_0x07d5
        L_0x07d4:
            r4 = 0
        L_0x07d5:
            r0.f7362k2 = r4
            java.lang.String r4 = "cs_r"
            int r4 = r5.getInt(r4, r6)
            if (r4 != r7) goto L_0x07e1
            r4 = 1
            goto L_0x07e2
        L_0x07e1:
            r4 = 0
        L_0x07e2:
            r0.f7369l2 = r4
            java.lang.String r4 = "cs_p"
            int r4 = r5.getInt(r4, r6)
            if (r4 != r7) goto L_0x07ee
            r4 = 1
            goto L_0x07ef
        L_0x07ee:
            r4 = 0
        L_0x07ef:
            r0.f7376m2 = r4
            java.lang.String r4 = "cs_c"
            int r4 = r5.getInt(r4, r6)
            if (r4 != r7) goto L_0x07fb
            r4 = 1
            goto L_0x07fc
        L_0x07fb:
            r4 = 0
        L_0x07fc:
            r0.f7383n2 = r4
            java.lang.String r4 = "cs_g"
            int r4 = r5.getInt(r4, r6)
            if (r4 != r7) goto L_0x0808
            r4 = 1
            goto L_0x0809
        L_0x0808:
            r4 = 0
        L_0x0809:
            r0.f7390o2 = r4
            java.lang.String r4 = "cs_ap"
            int r4 = r5.getInt(r4, r6)
            if (r4 != r7) goto L_0x0815
            r4 = 1
            goto L_0x0816
        L_0x0815:
            r4 = 0
        L_0x0816:
            r0.f7397p2 = r4
            java.lang.String r4 = "cs_fp"
            int r4 = r5.getInt(r4, r6)
            r0.f7404q2 = r4
            java.lang.String r4 = "cs_pf"
            int r4 = r5.getInt(r4, r6)
            r0.f7411r2 = r4
            java.lang.String r4 = "cs_ps"
            int r4 = r5.getInt(r4, r6)
            r0.f7418s2 = r4
            java.lang.String r4 = "cs_pde"
            int r4 = r5.getInt(r4, r6)
            r0.f7425t2 = r4
            java.lang.String r4 = "cs_pdi"
            int r4 = r5.getInt(r4, r6)
            r0.f7432u2 = r4
            java.lang.String r4 = "appnext_cod"
            java.lang.String r4 = r5.getString(r4, r8)
            f7121U5 = r4
            java.lang.String r4 = "appnext_cod_int_e"
            java.lang.String r4 = r5.getString(r4, r8)
            f7122V5 = r4
            java.lang.String r4 = "appnext_cod_int_ia"
            java.lang.String r4 = r5.getString(r4, r8)
            f7123W5 = r4
            java.lang.String r4 = "ap"
            r6 = 1
            int r4 = r5.getInt(r4, r6)
            if (r4 != r6) goto L_0x0863
            r4 = 1
            goto L_0x0864
        L_0x0863:
            r4 = 0
        L_0x0864:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            f7131e6 = r4
            java.lang.String r4 = "mu"
            int r4 = r5.getInt(r4, r6)
            if (r4 != r6) goto L_0x0874
            r4 = 1
            goto L_0x0875
        L_0x0874:
            r4 = 0
        L_0x0875:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            f7130d6 = r4
            java.lang.String r4 = f7121U5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0890
            java.lang.String r4 = f7122V5
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0890
            java.lang.String r4 = f7122V5
            f7121U5 = r4
            goto L_0x08a6
        L_0x0890:
            java.lang.String r4 = f7121U5
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x08a6
            java.lang.String r4 = f7122V5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x08a6
            java.lang.String r4 = f7121U5
            f7122V5 = r4
            f7123W5 = r4
        L_0x08a6:
            java.lang.String r4 = "appnextb_cod"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7309b3 = r4
            r0.f7274V2 = r8
            r4 = 1
            r0.f7286X2 = r4
            r6 = 4
            r0.f7280W2 = r6
            java.lang.String r6 = "apn_v"
            java.lang.String r6 = r5.getString(r6, r8)
            java.lang.String[] r6 = r6.split(r14)
            int r7 = r6.length
            if (r7 <= r10) goto L_0x08d8
            r7 = 0
            r12 = r6[r7]
            r0.f7274V2 = r12
            r7 = r6[r4]
            int r7 = java.lang.Integer.parseInt(r7)
            r0.f7286X2 = r7
            r6 = r6[r10]
            int r6 = java.lang.Integer.parseInt(r6)
            r0.f7280W2 = r6
        L_0x08d8:
            java.lang.String r6 = "apn_vi"
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f7292Y2 = r6
            r0.f7303a3 = r4
            r6 = 4
            r0.f7298Z2 = r6
            java.lang.String r6 = "vi"
            java.lang.String r6 = r5.getString(r6, r8)
            java.lang.String[] r6 = r6.split(r14)
            int r7 = r6.length
            if (r7 <= r4) goto L_0x0903
            r7 = 0
            r12 = r6[r7]
            int r7 = java.lang.Integer.parseInt(r12)
            r0.f7303a3 = r7
            r6 = r6[r4]
            int r4 = java.lang.Integer.parseInt(r6)
            r0.f7298Z2 = r4
        L_0x0903:
            f7120T5 = r8
            android.content.pm.PackageManager r4 = r29.getPackageManager()     // Catch:{ Exception -> 0x091e }
            java.lang.String r6 = r29.getPackageName()     // Catch:{ Exception -> 0x091e }
            r7 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r6, r7)     // Catch:{ Exception -> 0x091e }
            android.os.Bundle r4 = r4.metaData     // Catch:{ Exception -> 0x091e }
            java.lang.String r6 = "com.google.android.gms.ads.APPLICATION_ID"
            java.lang.String r4 = r4.getString(r6, r8)     // Catch:{ Exception -> 0x091e }
            f7120T5 = r4     // Catch:{ Exception -> 0x091e }
            goto L_0x091f
        L_0x091e:
        L_0x091f:
            java.lang.String r4 = f7120T5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0935
            r0.f7315c3 = r8
            f7124X5 = r8
            r0.f7321d3 = r8
            r0.f7454x3 = r8
            r0.f7161C3 = r8
            r0.f7197I3 = r8
            r0.f7245Q3 = r8
        L_0x0935:
            java.lang.String r4 = f7124X5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0977
            java.lang.String r4 = f7121U5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0977
            java.lang.String r4 = f7125Y5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0977
            java.lang.String r4 = f7126Z5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0977
            java.lang.String r4 = f7127a6
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0977
            java.lang.String r4 = f7128b6
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0977
            java.lang.String r4 = r0.f7352i4
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0977
            java.lang.String r4 = f7129c6
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0977
            r4 = 0
            goto L_0x097e
        L_0x0977:
            java.lang.String r4 = "admob_int_v"
            r6 = 0
            int r4 = r5.getInt(r4, r6)
        L_0x097e:
            r0.f7391o3 = r4
            java.lang.String r4 = f7124X5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x09c2
            java.lang.String r4 = f7121U5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x09c2
            java.lang.String r4 = f7125Y5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x09c2
            java.lang.String r4 = f7126Z5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x09c2
            java.lang.String r4 = f7127a6
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x09c2
            java.lang.String r4 = f7128b6
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x09c2
            java.lang.String r4 = r0.f7352i4
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x09c2
            java.lang.String r4 = f7129c6
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x09c2
            r4 = 0
            goto L_0x09c9
        L_0x09c2:
            java.lang.String r4 = "aigi"
            r6 = 0
            int r4 = r5.getInt(r4, r6)
        L_0x09c9:
            r0.f7398p3 = r4
            java.lang.String r4 = f7124X5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0a05
            java.lang.String r4 = f7121U5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0a05
            java.lang.String r4 = f7125Y5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0a05
            java.lang.String r4 = f7126Z5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0a05
            java.lang.String r4 = f7127a6
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0a05
            java.lang.String r4 = f7128b6
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0a05
            java.lang.String r4 = f7129c6
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0a05
            r4 = 0
            goto L_0x0a0c
        L_0x0a05:
            java.lang.String r4 = "admob_inte_v"
            r6 = 0
            int r4 = r5.getInt(r4, r6)
        L_0x0a0c:
            r0.f7405q3 = r4
            java.lang.String r4 = f7124X5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0a51
            java.lang.String r4 = f7121U5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0a51
            java.lang.String r4 = f7125Y5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0a51
            java.lang.String r4 = f7126Z5
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0a51
            java.lang.String r4 = f7127a6
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0a51
            java.lang.String r4 = f7128b6
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0a51
            java.lang.String r4 = r0.f7352i4
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0a51
            java.lang.String r4 = f7129c6
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0a51
            r4 = 0
            r6 = 0
            goto L_0x0a5a
        L_0x0a51:
            java.lang.String r4 = "admob_ch_v"
            r6 = 0
            int r19 = r5.getInt(r4, r6)
            r4 = r19
        L_0x0a5a:
            r0.f7412r3 = r4
            r0.f7208K2 = r8
            java.lang.String r4 = "acad"
            java.lang.String r4 = r5.getString(r4, r8)
            java.lang.String[] r4 = r4.split(r14)
            int r7 = r4.length
            r12 = 6
            if (r7 <= r12) goto L_0x0a8d
            r7 = r4[r6]
            r0.f7208K2 = r7
            r6 = 1
            r7 = r4[r6]
            r0.f7214L2 = r7
            r6 = r4[r10]
            r0.f7220M2 = r6
            r6 = 3
            r7 = r4[r6]
            r0.f7226N2 = r7
            r6 = 4
            r7 = r4[r6]
            r0.f7238P2 = r7
            r6 = 5
            r7 = r4[r6]
            r0.f7244Q2 = r7
            r6 = 6
            r4 = r4[r6]
            r0.f7232O2 = r4
        L_0x0a8d:
            java.lang.String r4 = "tipomenu"
            r6 = 0
            int r4 = r5.getInt(r4, r6)
            r0.f7427t4 = r4
            java.lang.String r4 = "petic_ask_nombre"
            int r4 = r5.getInt(r4, r6)
            r0.f7401q = r4
            java.lang.String r4 = "petic_ask_email"
            int r4 = r5.getInt(r4, r6)
            r0.f7408r = r4
            java.lang.String r4 = "petic_ask_tel"
            int r4 = r5.getInt(r4, r6)
            r0.f7415s = r4
            java.lang.String r4 = "sep_secc"
            int r4 = r5.getInt(r4, r6)
            if (r4 != 0) goto L_0x0ab9
            r0.f7213L1 = r6
            goto L_0x0abc
        L_0x0ab9:
            r4 = 1
            r0.f7213L1 = r4
        L_0x0abc:
            java.lang.String r4 = "t_ind"
            int r4 = r5.getInt(r4, r6)
            r0.f7387o = r4
            java.lang.String r4 = "t_mas"
            int r4 = r5.getInt(r4, r6)
            r0.f7394p = r4
            java.lang.String r4 = "c1"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7313c1 = r4
            java.lang.String r4 = "c2"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7319d1 = r4
            java.lang.String r4 = "c_icos"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7368l1 = r4
            java.lang.String r4 = "c_icos_t"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7375m1 = r4
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0af6
            java.lang.String r4 = r0.f7368l1
            r0.f7375m1 = r4
        L_0x0af6:
            java.lang.String r4 = "c_sep_secc"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7325e1 = r4
            java.lang.String r4 = "c_secc_noactiv"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7331f1 = r4
            java.lang.String r4 = "c_secc_activ"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7337g1 = r4
            java.lang.String r4 = "c_linea"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7343h1 = r4
            java.lang.String r4 = "c_ind"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7349i1 = r4
            java.lang.String r4 = "c1_ofic"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7355j1 = r4
            java.lang.String r4 = "c2_ofic"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7361k1 = r4
            java.lang.String r4 = "c_perofic"
            r6 = 0
            int r4 = r5.getInt(r4, r6)
            r0.f7436v = r4
            java.lang.String r4 = "c_tit_ofic"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7382n1 = r4
            java.lang.String r4 = "c_sep_ofic"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7389o1 = r4
            java.lang.String r4 = "c_ico_sep_ofic"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7396p1 = r4
            java.lang.String r4 = "c_txt_ofic"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7403q1 = r4
            java.lang.String r4 = "c_icos_ofic"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7410r1 = r4
            java.lang.String r4 = "c_ir_ofic"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7417s1 = r4
            java.lang.String r4 = "c1_sp"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7195I1 = r4
            java.lang.String r4 = "c2_sp"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7201J1 = r4
            java.lang.String r4 = "c1_prods"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7431u1 = r4
            java.lang.String r4 = "c2_prods"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7438v1 = r4
            java.lang.String r4 = "c_txt_prods"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7445w1 = r4
            java.lang.String r4 = "c_icos_prods"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7452x1 = r4
            java.lang.String r4 = "c_icos_2_prods"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7459y1 = r4
            java.lang.String r4 = "c_tit_prods"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7466z1 = r4
            java.lang.String r4 = "c_sep_prods"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7147A1 = r4
            java.lang.String r4 = "c_ico_sep_prods"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7153B1 = r4
            java.lang.String r4 = "c1_prods_l"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7159C1 = r4
            java.lang.String r4 = "c2_prods_l"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7165D1 = r4
            java.lang.String r4 = "c_perprod"
            r6 = 0
            int r4 = r5.getInt(r4, r6)
            r0.f7207K1 = r4
            java.lang.String r4 = "c_tit_prods_l"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7171E1 = r4
            java.lang.String r4 = "c_precio_prods_l"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7177F1 = r4
            java.lang.String r4 = "c_antiguedad_prods_l"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7183G1 = r4
            java.lang.String r4 = "c_prods_det"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7189H1 = r4
            r4 = 2000(0x7d0, float:2.803E-42)
            java.lang.String r6 = "splash_w"
            int r4 = r5.getInt(r6, r4)
            r0.f7443w = r4
            java.lang.String r4 = "s_v"
            r6 = 0
            int r4 = r5.getInt(r4, r6)
            r0.f7450x = r4
            java.lang.String r4 = "s_h"
            int r4 = r5.getInt(r4, r6)
            r0.f7457y = r4
            java.lang.String r4 = "bv_txt"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7246Q4 = r4
            java.lang.String r4 = "bv_tit"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7240P4 = r4
            java.lang.String r4 = "bv_nomas_mostrar"
            int r4 = r5.getInt(r4, r6)
            if (r4 != 0) goto L_0x0c27
            r0.f7252R4 = r6
            r4 = 1
            goto L_0x0c2a
        L_0x0c27:
            r4 = 1
            r0.f7252R4 = r4
        L_0x0c2a:
            java.lang.String r7 = "bv_nomas_def"
            int r7 = r5.getInt(r7, r6)
            if (r7 != 0) goto L_0x0c35
            r0.f7258S4 = r6
            goto L_0x0c37
        L_0x0c35:
            r0.f7258S4 = r4
        L_0x0c37:
            r0.f7205K = r4
            r0.f7211L = r6
            r0.f7217M = r10
            java.lang.String r4 = "FF666666"
            r0.f7223N = r4
            java.lang.String r4 = "sp_i"
            java.lang.String r4 = r5.getString(r4, r8)
            int r7 = r4.length()
            r12 = 10
            if (r7 <= r12) goto L_0x0c79
            r7 = 8
            java.lang.String r13 = r4.substring(r6, r7)
            r0.f7223N = r13
            r6 = 9
            java.lang.String r13 = r4.substring(r7, r6)
            int r7 = java.lang.Integer.parseInt(r13)
            r0.f7205K = r7
            java.lang.String r7 = r4.substring(r6, r12)
            int r6 = java.lang.Integer.parseInt(r7)
            r0.f7211L = r6
            r6 = 11
            java.lang.String r4 = r4.substring(r12, r6)
            int r4 = java.lang.Integer.parseInt(r4)
            r0.f7217M = r4
        L_0x0c79:
            r4 = 0
            r0.f7393o5 = r4
            r0.f7407q5 = r4
            r0.f7400p5 = r4
            java.lang.String r4 = "fb_m"
            java.lang.String r4 = r5.getString(r4, r9)     // Catch:{ Exception -> 0x0c87 }
            goto L_0x0c88
        L_0x0c87:
            r4 = r9
        L_0x0c88:
            r6 = 1
            r7 = 0
            java.lang.String r12 = r4.substring(r7, r6)
            int r12 = java.lang.Integer.parseInt(r12)
            r0.f7393o5 = r12
            if (r12 == r6) goto L_0x0c98
            if (r12 != r10) goto L_0x0cb6
        L_0x0c98:
            int r12 = r4.length()
            if (r12 >= r10) goto L_0x0ca1
            r0.f7393o5 = r7
            goto L_0x0cb6
        L_0x0ca1:
            java.lang.String r12 = r4.substring(r6, r10)
            boolean r6 = r12.equals(r11)
            r0.f7407q5 = r6
            r6 = 3
            java.lang.String r4 = r4.substring(r10, r6)
            int r4 = java.lang.Integer.parseInt(r4)
            r0.f7400p5 = r4
        L_0x0cb6:
            java.lang.String r4 = "vcn"
            int r4 = r5.getInt(r4, r7)
            r0.f7414r5 = r4
            java.lang.String r4 = "hcn"
            int r4 = r5.getInt(r4, r7)
            r6 = 1
            if (r4 != r6) goto L_0x0cc9
            r4 = 1
            goto L_0x0cca
        L_0x0cc9:
            r4 = 0
        L_0x0cca:
            r0.f7428t5 = r4
            java.lang.String r4 = "nd_t"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7435u5 = r4
            java.lang.String r4 = "nd_s"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7442v5 = r4
            java.lang.String r4 = "nd_i"
            r6 = 0
            int r4 = r5.getInt(r4, r6)
            r0.f7421s5 = r4
            java.lang.String r4 = "nd_u"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7449w5 = r4
            java.lang.String r4 = "conf_ex"
            int r4 = r5.getInt(r4, r6)
            r6 = 1
            if (r4 != r6) goto L_0x0cf8
            r4 = 1
            goto L_0x0cf9
        L_0x0cf8:
            r4 = 0
        L_0x0cf9:
            r0.f7365k5 = r4
            java.lang.String r4 = "pp"
            int r4 = r5.getInt(r4, r6)
            if (r4 != r6) goto L_0x0d05
            r4 = 1
            goto L_0x0d06
        L_0x0d05:
            r4 = 0
        L_0x0d06:
            r0.f7372l5 = r4
            java.lang.String r4 = "pp2"
            r7 = 0
            int r4 = r5.getInt(r4, r7)
            if (r4 != r6) goto L_0x0d13
            r4 = 1
            goto L_0x0d14
        L_0x0d13:
            r4 = 0
        L_0x0d14:
            r0.f7379m5 = r4
            java.lang.String r4 = "ps"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7250R2 = r4
            java.lang.String r4 = "pd"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7256S2 = r4
            java.lang.String r4 = "pt"
            r6 = 0
            int r4 = r5.getInt(r4, r6)
            r0.f7268U2 = r4
            java.lang.String r4 = "pm"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7262T2 = r4
            java.lang.String r4 = "rt_tit"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7264T4 = r4
            java.lang.String r4 = "rt_txt"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7270U4 = r4
            java.lang.String r4 = "rt_ok"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7276V4 = r4
            java.lang.String r4 = "rt_ko"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7282W4 = r4
            java.lang.String r4 = "rt_1v"
            r6 = 0
            int r4 = r5.getInt(r4, r6)
            r0.f7288X4 = r4
            java.lang.String r4 = "rt_int"
            int r4 = r5.getInt(r4, r6)
            r0.f7294Y4 = r4
            java.lang.String r4 = "rt_t"
            int r4 = r5.getInt(r4, r6)
            r0.f7300Z4 = r4
            java.lang.String r4 = "wv_sc"
            r6 = 1
            int r4 = r5.getInt(r4, r6)
            if (r4 != r6) goto L_0x0d7b
            r4 = 1
            goto L_0x0d7c
        L_0x0d7b:
            r4 = 0
        L_0x0d7c:
            r0.f7305a5 = r4
            java.lang.String r4 = "wv_sc_txt"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7323d5 = r4
            java.lang.String r4 = "wv_c"
            int r4 = r5.getInt(r4, r6)
            if (r4 != r6) goto L_0x0d90
            r4 = 1
            goto L_0x0d91
        L_0x0d90:
            r4 = 0
        L_0x0d91:
            r0.f7311b5 = r4
            java.lang.String r4 = "rss_i"
            r6 = 0
            int r4 = r5.getInt(r4, r6)
            r0.f7335f5 = r4
            java.lang.String r4 = "rss_t"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7329e5 = r4
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0dac
            r0.f7335f5 = r6
        L_0x0dac:
            british.x.alarma_rss r4 = new british.x.alarma_rss
            r4.<init>()
            android.content.Context r7 = r29.getApplicationContext()
            int r12 = r0.f7335f5
            r4.mo7300a(r7, r12)
            java.lang.String r4 = "vfs"
            int r4 = r5.getInt(r4, r6)
            r7 = 1
            if (r4 != r7) goto L_0x0dc5
            r4 = 1
            goto L_0x0dc6
        L_0x0dc5:
            r4 = 0
        L_0x0dc6:
            r0.f7341g5 = r4
            java.lang.String r4 = "vls"
            int r4 = r5.getInt(r4, r6)
            if (r4 != r7) goto L_0x0dd2
            r4 = 1
            goto L_0x0dd3
        L_0x0dd2:
            r4 = 0
        L_0x0dd3:
            r0.f7347h5 = r4
            java.lang.String r4 = "vc"
            int r4 = r5.getInt(r4, r6)
            if (r4 != r7) goto L_0x0ddf
            r4 = 1
            goto L_0x0de0
        L_0x0ddf:
            r4 = 0
        L_0x0de0:
            r0.f7353i5 = r4
            java.lang.String r4 = "vcv"
            int r4 = r5.getInt(r4, r6)
            r0.f7359j5 = r4
            java.lang.String r4 = "divisa"
            java.lang.String r4 = r5.getString(r4, r8)
            java.lang.String r6 = "puntoycoma"
            java.lang.String r7 = ";"
            java.lang.String r4 = r4.replace(r6, r7)
            r0.f7224N0 = r4
            java.lang.String r4 = "busc_campos"
            java.lang.String r4 = r5.getString(r4, r8)
            java.lang.String r6 = ","
            java.lang.String[] r4 = r4.split(r6)
            int r7 = r4.length
            r12 = 4
            if (r7 != r12) goto L_0x0e5b
            r7 = 0
            r12 = r4[r7]
            boolean r7 = r12.equals(r11)
            r0.f7158C0 = r7
            r7 = 1
            r12 = r4[r7]
            boolean r7 = r12.equals(r11)
            r0.f7164D0 = r7
            r7 = r4[r10]
            boolean r7 = r7.equals(r11)
            r0.f7170E0 = r7
            r7 = 3
            r4 = r4[r7]
            boolean r4 = r4.equals(r11)
            r0.f7176F0 = r4
            boolean r4 = r0.f7164D0
            if (r4 == 0) goto L_0x0e5b
            british.x.q r4 = new british.x.q     // Catch:{ Exception -> 0x0e57 }
            android.content.Context r7 = r29.getApplicationContext()     // Catch:{ Exception -> 0x0e57 }
            r4.<init>(r7)     // Catch:{ Exception -> 0x0e57 }
            android.database.sqlite.SQLiteDatabase r4 = r4.getReadableDatabase()     // Catch:{ Exception -> 0x0e57 }
            if (r4 == 0) goto L_0x0e5b
            java.lang.String r7 = "SELECT _id FROM cats LIMIT 1"
            r12 = 0
            android.database.Cursor r7 = r4.rawQuery(r7, r12)     // Catch:{ Exception -> 0x0e57 }
            boolean r12 = r7.moveToFirst()     // Catch:{ Exception -> 0x0e57 }
            if (r12 != 0) goto L_0x0e50
            r12 = 0
            r0.f7164D0 = r12     // Catch:{ Exception -> 0x0e57 }
        L_0x0e50:
            r7.close()     // Catch:{ Exception -> 0x0e57 }
            r4.close()     // Catch:{ Exception -> 0x0e57 }
            goto L_0x0e5b
        L_0x0e57:
            r4 = 0
            r0.f7164D0 = r4
            goto L_0x0e5c
        L_0x0e5b:
            r4 = 0
        L_0x0e5c:
            java.lang.String r7 = "busc_orden"
            java.lang.String r7 = r5.getString(r7, r8)
            java.lang.String[] r7 = r7.split(r6)
            int r12 = r7.length
            r13 = 3
            if (r12 != r13) goto L_0x0e83
            r12 = r7[r4]
            boolean r4 = r12.equals(r11)
            r0.f7182G0 = r4
            r4 = 1
            r12 = r7[r4]
            boolean r4 = r12.equals(r11)
            r0.f7188H0 = r4
            r4 = r7[r10]
            boolean r4 = r4.equals(r11)
            r0.f7194I0 = r4
        L_0x0e83:
            java.lang.String r4 = "busc_def"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7218M0 = r4
            java.lang.String r4 = "prods_tit"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7230O0 = r4
            java.lang.String r4 = "prods_masinfo"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7236P0 = r4
            java.lang.String r4 = "prods_comprar"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7242Q0 = r4
            java.lang.String r4 = "prods_masinfo_mostrar"
            r7 = 1
            int r4 = r5.getInt(r4, r7)
            if (r4 != r7) goto L_0x0eae
            r4 = 1
            goto L_0x0eaf
        L_0x0eae:
            r4 = 0
        L_0x0eaf:
            r0.f7200J0 = r4
            java.lang.String r4 = "prods_linksexternos"
            int r4 = r5.getInt(r4, r7)
            if (r4 != r7) goto L_0x0ebb
            r4 = 1
            goto L_0x0ebc
        L_0x0ebb:
            r4 = 0
        L_0x0ebc:
            r0.f7212L0 = r4
            java.lang.String r4 = "prods_adaptar_ancho"
            int r4 = r5.getInt(r4, r7)
            if (r4 != r7) goto L_0x0ec8
            r4 = 1
            goto L_0x0ec9
        L_0x0ec8:
            r4 = 0
        L_0x0ec9:
            r0.f7206K0 = r4
            java.lang.String r4 = "pp_email"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7248R0 = r4
            java.lang.String r4 = "pp_div"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7254S0 = r4
            java.lang.String r4 = "m_ncols"
            int r4 = r5.getInt(r4, r7)
            r0.f7434u4 = r4
            java.lang.String r4 = "m_padding"
            int r4 = r5.getInt(r4, r10)
            r0.f7441v4 = r4
            java.lang.String r4 = "m_txt_radius"
            r12 = 5
            int r4 = r5.getInt(r4, r12)
            r0.f7448w4 = r4
            java.lang.String r4 = "m_mostrar_icos"
            int r4 = r5.getInt(r4, r7)
            if (r4 != 0) goto L_0x0f00
            r4 = 0
            r0.f7469z4 = r4
            goto L_0x0f03
        L_0x0f00:
            r4 = 0
            r0.f7469z4 = r7
        L_0x0f03:
            java.lang.String r12 = "m_mostrar_txt"
            int r12 = r5.getInt(r12, r7)
            if (r12 != 0) goto L_0x0f0e
            r0.f7150A4 = r4
            goto L_0x0f10
        L_0x0f0e:
            r0.f7150A4 = r7
        L_0x0f10:
            java.lang.String r12 = "m_icos_izq"
            int r12 = r5.getInt(r12, r7)
            if (r12 != 0) goto L_0x0f1b
            r0.f7156B4 = r4
            goto L_0x0f1d
        L_0x0f1b:
            r0.f7156B4 = r7
        L_0x0f1d:
            java.lang.String r12 = "m_anim"
            int r12 = r5.getInt(r12, r7)
            if (r12 != 0) goto L_0x0f28
            r0.f7162C4 = r4
            goto L_0x0f2a
        L_0x0f28:
            r0.f7162C4 = r7
        L_0x0f2a:
            java.lang.String r12 = "m_c"
            int r12 = r5.getInt(r12, r7)
            if (r12 != 0) goto L_0x0f35
            r0.f7168D4 = r4
            goto L_0x0f37
        L_0x0f35:
            r0.f7168D4 = r7
        L_0x0f37:
            java.lang.String r12 = "m_txt_c"
            int r12 = r5.getInt(r12, r7)
            if (r12 != 0) goto L_0x0f42
            r0.f7174E4 = r4
            goto L_0x0f44
        L_0x0f42:
            r0.f7174E4 = r7
        L_0x0f44:
            java.lang.String r12 = "m_txt_b"
            int r12 = r5.getInt(r12, r4)
            if (r12 != r7) goto L_0x0f4e
            r7 = 1
            goto L_0x0f4f
        L_0x0f4e:
            r7 = 0
        L_0x0f4f:
            r0.f7180F4 = r7
            java.lang.String r7 = "m_e"
            int r7 = r5.getInt(r7, r4)
            r0.f7186G4 = r7
            java.lang.String r4 = "m_txt_bg"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7210K4 = r4
            java.lang.String r4 = "m_txt_col"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7216L4 = r4
            java.lang.String r4 = "m_c1"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7222M4 = r4
            java.lang.String r4 = "m_c2"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7228N4 = r4
            java.lang.String r4 = "msl_c"
            java.lang.String r4 = r5.getString(r4, r8)
            r0.f7234O4 = r4
            java.lang.String r4 = "fm"
            r7 = 0
            int r4 = r5.getInt(r4, r7)
            r12 = 1
            if (r4 != r12) goto L_0x0f8d
            r4 = 1
            goto L_0x0f8e
        L_0x0f8d:
            r4 = 0
        L_0x0f8e:
            r0.f7192H4 = r4
            java.lang.String r4 = "act_fm"
            boolean r4 = r5.getBoolean(r4, r7)
            r0.f7198I4 = r4
            java.lang.String r4 = "vf"
            int r4 = r5.getInt(r4, r7)
            r0.f7455x4 = r4
            r0.f7204J4 = r7
            r0.f7462y4 = r7
            java.lang.String r4 = "tm"
            java.lang.String r4 = r5.getString(r4, r8)
            boolean r12 = r4.equals(r8)
            if (r12 != 0) goto L_0x0fc5
            r12 = 1
            java.lang.String r13 = r4.substring(r7, r12)
            boolean r7 = r13.equals(r11)
            r0.f7204J4 = r7
            java.lang.String r4 = r4.substring(r12, r10)
            int r4 = java.lang.Integer.parseInt(r4)
            r0.f7462y4 = r4
        L_0x0fc5:
            int r4 = r1.length
            british.x.l[] r4 = new british.p015x.C1855l[r4]
            r0.f7231O1 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            f7114N5 = r4
            int r4 = r1.length
            int[] r4 = new int[r4]
            r0.f7243Q1 = r4
            java.lang.String r7 = "s"
            if (r3 == 0) goto L_0x0fed
            java.lang.String r12 = "abrir_idsecc"
            java.lang.String r12 = r3.getString(r12)
            if (r12 == 0) goto L_0x0fed
            java.lang.String r12 = "abrir_idsecc"
            java.lang.String r3 = r3.getString(r12)
        L_0x0fe8:
            r4 = 9996(0x270c, float:1.4007E-41)
        L_0x0fea:
            r10 = 0
            goto L_0x115c
        L_0x0fed:
            if (r3 == 0) goto L_0x100a
            java.lang.String r12 = "notif_id"
            java.lang.String r12 = r3.getString(r12)
            if (r12 == 0) goto L_0x100a
            java.lang.String r12 = "notif_tipo"
            java.lang.String r12 = r3.getString(r12)
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L_0x100a
            java.lang.String r12 = "notif_idelem"
            java.lang.String r3 = r3.getString(r12)
            goto L_0x0fe8
        L_0x100a:
            if (r3 == 0) goto L_0x103a
            java.lang.String r12 = "notif_idtema"
            java.lang.String r12 = r3.getString(r12)
            if (r12 == 0) goto L_0x103a
            r12 = 0
        L_0x1015:
            int r13 = r1.length
            if (r12 >= r13) goto L_0x1030
            java.lang.String r13 = "notif_idsecc"
            java.lang.String r13 = r3.getString(r13)
            r15 = r1[r12]
            boolean r13 = r13.equals(r15)
            if (r13 == 0) goto L_0x102d
            java.lang.String r12 = "notif_idsecc"
            java.lang.String r3 = r3.getString(r12)
            goto L_0x1031
        L_0x102d:
            int r12 = r12 + 1
            goto L_0x1015
        L_0x1030:
            r3 = r8
        L_0x1031:
            boolean r12 = r3.equals(r8)
            if (r12 == 0) goto L_0x0fe8
        L_0x1037:
            r4 = 9997(0x270d, float:1.4009E-41)
            goto L_0x0fea
        L_0x103a:
            if (r3 == 0) goto L_0x1094
            java.lang.String r12 = "id_remit"
            java.lang.String r12 = r3.getString(r12)
            if (r12 == 0) goto L_0x1094
            r3 = 0
        L_0x1045:
            int r12 = r1.length
            if (r3 >= r12) goto L_0x108c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            r13 = r1[r3]
            r12.append(r13)
            java.lang.String r13 = "_tipo"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r13 = 0
            int r12 = r5.getInt(r12, r13)
            r13 = 9
            if (r12 != r13) goto L_0x1089
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "chat"
            r12.append(r13)
            r13 = r1[r3]
            r12.append(r13)
            java.lang.String r13 = "_validado"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r13 = 1
            boolean r12 = r5.getBoolean(r12, r13)
            if (r12 == 0) goto L_0x1089
            r3 = r1[r3]
            goto L_0x108d
        L_0x1089:
            int r3 = r3 + 1
            goto L_0x1045
        L_0x108c:
            r3 = r8
        L_0x108d:
            boolean r12 = r3.equals(r8)
            if (r12 == 0) goto L_0x0fe8
            goto L_0x1037
        L_0x1094:
            if (r3 == 0) goto L_0x1159
            java.lang.String r12 = "abrir_perfil"
            java.lang.String r12 = r3.getString(r12)
            if (r12 == 0) goto L_0x1159
            java.lang.String r12 = "abrir_game"
            java.lang.String r3 = r3.getString(r12)
            if (r3 == 0) goto L_0x10a8
            r3 = 1
            goto L_0x10a9
        L_0x10a8:
            r3 = 0
        L_0x10a9:
            r12 = r8
        L_0x10aa:
            r13 = 1
            if (r3 > r13) goto L_0x1150
            r13 = 0
        L_0x10ae:
            int r15 = r1.length
            if (r13 >= r15) goto L_0x1144
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r7)
            r4 = r1[r13]
            r15.append(r4)
            java.lang.String r4 = "_tipo"
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            if (r3 != 0) goto L_0x10fd
            r15 = 9
            if (r4 != r15) goto L_0x10f1
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r10 = "chat"
            r15.append(r10)
            r10 = r1[r13]
            r15.append(r10)
            java.lang.String r10 = "_validado"
            r15.append(r10)
            java.lang.String r10 = r15.toString()
            r15 = 1
            boolean r10 = r5.getBoolean(r10, r15)
            if (r10 != 0) goto L_0x113c
        L_0x10f1:
            r10 = 10
            if (r4 == r10) goto L_0x113c
            r10 = 11
            if (r4 == r10) goto L_0x113c
            r10 = 16
            if (r4 == r10) goto L_0x113c
        L_0x10fd:
            r10 = 1
            if (r3 != r10) goto L_0x113f
            if (r4 != r10) goto L_0x113f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r15 = r1[r13]
            r4.append(r15)
            java.lang.String r15 = "_cl"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            if (r4 != r10) goto L_0x113f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r10 = r1[r13]
            r4.append(r10)
            java.lang.String r10 = "_cp"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r15)
            r10 = 1
            if (r4 != r10) goto L_0x113f
        L_0x113c:
            r12 = r1[r13]
            goto L_0x1144
        L_0x113f:
            int r13 = r13 + 1
            r10 = 2
            goto L_0x10ae
        L_0x1144:
            boolean r4 = r12.equals(r8)
            if (r4 != 0) goto L_0x114b
            goto L_0x1150
        L_0x114b:
            int r3 = r3 + 1
            r10 = 2
            goto L_0x10aa
        L_0x1150:
            r3 = r12
            boolean r4 = r3.equals(r8)
            if (r4 == 0) goto L_0x0fe8
            goto L_0x1037
        L_0x1159:
            r3 = r8
            goto L_0x0fe8
        L_0x115c:
            r0.f7336g = r10
            r0.f7219M1 = r10
            r0.f7225N1 = r10
            r10 = 0
            r12 = 0
        L_0x1164:
            int r13 = r1.length
            java.lang.String r15 = "_ord"
            if (r10 >= r13) goto L_0x2480
            r13 = r1[r10]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r13)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r1 = 0
            int r2 = r5.getInt(r2, r1)
            r1 = 1
            int r2 = r2 - r1
            boolean r1 = r3.equals(r8)
            if (r1 == 0) goto L_0x11b2
            r1 = 9997(0x270d, float:1.4009E-41)
            if (r4 == r1) goto L_0x11b2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r13)
            r20 = r10
            java.lang.String r10 = "_ocu"
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r10 = 0
            int r1 = r5.getInt(r1, r10)
            r10 = 1
            if (r1 == r10) goto L_0x11bb
            int r1 = java.lang.Math.min(r4, r2)
            r4 = r1
            goto L_0x11bb
        L_0x11b2:
            r20 = r10
            boolean r1 = r3.equals(r13)
            if (r1 == 0) goto L_0x11bb
            r4 = r2
        L_0x11bb:
            british.x.l r1 = new british.x.l
            r1.<init>()
            int r10 = java.lang.Integer.parseInt(r13)
            r1.f7964y = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            r10.append(r13)
            r32 = r3
            java.lang.String r3 = "_tipo"
            r10.append(r3)
            java.lang.String r3 = r10.toString()
            r10 = 0
            int r3 = r5.getInt(r3, r10)
            r1.f7954t = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_tit"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7898a = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_de"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7904c = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_k"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            java.lang.String r3 = r3.trim()
            boolean r10 = r3.equals(r8)
            if (r10 != 0) goto L_0x1269
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r1.f7928k = r10
            java.lang.String[] r3 = r3.split(r6)
            int r10 = r3.length
            r21 = r4
            r4 = 0
        L_0x1248:
            if (r4 >= r10) goto L_0x126b
            r22 = r3[r4]
            r23 = r3
            java.lang.String r3 = r22.trim()
            boolean r22 = r3.equals(r8)
            if (r22 != 0) goto L_0x1260
            r22 = r10
            java.util.ArrayList<java.lang.String> r10 = r1.f7928k
            r10.add(r3)
            goto L_0x1262
        L_0x1260:
            r22 = r10
        L_0x1262:
            int r4 = r4 + 1
            r10 = r22
            r3 = r23
            goto L_0x1248
        L_0x1269:
            r21 = r4
        L_0x126b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_i"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "110"
            java.lang.String r3 = r5.getString(r3, r4)
            r22 = r12
            r4 = 1
            r10 = 0
            java.lang.String r12 = r3.substring(r10, r4)
            boolean r4 = r12.equals(r11)
            r1.f7864J = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r13)
            java.lang.String r10 = "_idgo"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r5.getString(r4, r8)
            r1.f7922i = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r13)
            java.lang.String r10 = "_ocu"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            r10 = 0
            int r4 = r5.getInt(r4, r10)
            r12 = 1
            if (r4 != r12) goto L_0x12cc
            r1.f7848B = r12
            goto L_0x12d5
        L_0x12cc:
            r1.f7848B = r10
            int r4 = r0.f7336g
            r1.f7966z = r4
            int r4 = r4 + r12
            r0.f7336g = r4
        L_0x12d5:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r13)
            java.lang.String r10 = "_ptit"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r5.getString(r4, r8)
            r1.f7937n = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r13)
            java.lang.String r10 = "_ptxt"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r5.getString(r4, r8)
            r1.f7940o = r4
            int r4 = r3.length()
            r10 = 1
            if (r4 <= r10) goto L_0x1316
            r4 = 2
            java.lang.String r12 = r3.substring(r10, r4)
            goto L_0x1317
        L_0x1316:
            r12 = r11
        L_0x1317:
            r1.f7943p = r10
            r4 = 0
            r1.f7946q = r4
            boolean r18 = r12.equals(r9)
            if (r18 == 0) goto L_0x1325
            r1.f7943p = r4
            goto L_0x1330
        L_0x1325:
            java.lang.String r4 = "2"
            boolean r4 = r12.equals(r4)
            if (r4 == 0) goto L_0x132f
            r1.f7946q = r10
        L_0x132f:
            r4 = 0
        L_0x1330:
            r1.f7866K = r4
            int r4 = r3.length()
            r10 = 2
            if (r4 <= r10) goto L_0x1344
            r4 = 3
            java.lang.String r3 = r3.substring(r10, r4)
            boolean r3 = r3.equals(r11)
            r1.f7866K = r3
        L_0x1344:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_tp"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r1.f7868L = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_r"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r4 = 1
            if (r3 != r4) goto L_0x137c
            r3 = 1
            goto L_0x137d
        L_0x137c:
            r3 = 0
        L_0x137d:
            r1.f7860H = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_d"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r4 = 1
            if (r3 != r4) goto L_0x139d
            r3 = 1
            goto L_0x139e
        L_0x139d:
            r3 = 0
        L_0x139e:
            r1.f7862I = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_r_m"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r1.f7882S = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_ext"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r1.f7962x = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_adapt"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r10 = 1
            if (r3 != r10) goto L_0x13f3
            r1.f7850C = r10
            goto L_0x13f5
        L_0x13f3:
            r1.f7850C = r4
        L_0x13f5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_stream"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r10 = 1
            if (r3 != r10) goto L_0x1413
            r1.f7852D = r10
            goto L_0x1415
        L_0x1413:
            r1.f7852D = r4
        L_0x1415:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_idfondo"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r1.f7958v = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_vf"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r1.f7960w = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_fondo_modif"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r10 = 1
            if (r3 != r10) goto L_0x1467
            r1.f7876P = r10
            goto L_0x1469
        L_0x1467:
            r1.f7876P = r4
        L_0x1469:
            r1.f7931l = r4
            r1.f7934m = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_tm"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            boolean r10 = r3.equals(r8)
            if (r10 != 0) goto L_0x14a1
            r10 = 1
            java.lang.String r12 = r3.substring(r4, r10)
            boolean r4 = r12.equals(r11)
            r1.f7931l = r4
            r4 = 2
            java.lang.String r3 = r3.substring(r10, r4)
            int r3 = java.lang.Integer.parseInt(r3)
            r1.f7934m = r3
        L_0x14a1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_url"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7910e = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_ua"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7925j = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_html"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7913f = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_pur"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 1
            int r3 = r5.getInt(r3, r4)
            if (r3 != r4) goto L_0x150d
            r1.f7858G = r4
            goto L_0x1510
        L_0x150d:
            r3 = 0
            r1.f7858G = r3
        L_0x1510:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_loa"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            if (r3 != r4) goto L_0x152e
            r1.f7854E = r4
            r3 = 0
            goto L_0x1531
        L_0x152e:
            r3 = 0
            r1.f7854E = r3
        L_0x1531:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r13)
            java.lang.String r10 = "_zoo"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r3)
            r10 = 1
            if (r4 != r10) goto L_0x154f
            r1.f7856F = r10
            goto L_0x1551
        L_0x154f:
            r1.f7856F = r3
        L_0x1551:
            r1.f7870M = r3
            int r3 = r1.f7954t
            if (r3 != r10) goto L_0x1581
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_i1"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            boolean r4 = r3.equals(r8)
            if (r4 != 0) goto L_0x15ae
            r4 = 0
            java.lang.String r3 = r3.substring(r4, r10)
            boolean r3 = r3.equals(r11)
            r1.f7870M = r3
            goto L_0x15ae
        L_0x1581:
            r4 = 2
            if (r3 != r4) goto L_0x15ae
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_i2"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            boolean r4 = r3.equals(r8)
            if (r4 != 0) goto L_0x15ae
            r4 = 1
            r10 = 0
            java.lang.String r3 = r3.substring(r10, r4)
            boolean r3 = r3.equals(r11)
            r1.f7870M = r3
        L_0x15ae:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_c1"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7916g = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_c2"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7919h = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_c_peritem"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r1.f7956u = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_c_tit"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7949r = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_c_fecha"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7952s = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_mostrar_img"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 1
            int r3 = r5.getInt(r3, r4)
            if (r3 != r4) goto L_0x164f
            r1.f7872N = r4
            goto L_0x1652
        L_0x164f:
            r3 = 0
            r1.f7872N = r3
        L_0x1652:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_mostrar_fecha"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            if (r3 != r4) goto L_0x1670
            r1.f7874O = r4
            r3 = 0
            goto L_0x1673
        L_0x1670:
            r3 = 0
            r1.f7874O = r3
        L_0x1673:
            int r4 = r1.f7954t
            r10 = 7
            if (r4 != r10) goto L_0x1692
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r13)
            java.lang.String r10 = "_vin"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r3)
            r1.f7878Q = r4
        L_0x1692:
            int r3 = r1.f7954t
            r4 = 6
            if (r3 == r4) goto L_0x177e
            r4 = 7
            if (r3 != r4) goto L_0x169c
            goto L_0x177e
        L_0x169c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_f_perfil"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r1.f7849B0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_fnac"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r1.f7851C0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_sexo"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r1.f7853D0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_descr"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r1.f7855E0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_dist"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r1.f7857F0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_com"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 1
            int r3 = r5.getInt(r3, r4)
            if (r3 != r4) goto L_0x173c
            r3 = 1
            goto L_0x173d
        L_0x173c:
            r3 = 0
        L_0x173d:
            r1.f7886U = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_gal"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            if (r3 != r4) goto L_0x175b
            r3 = 1
            goto L_0x175c
        L_0x175b:
            r3 = 0
        L_0x175c:
            r1.f7888V = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_priv"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            if (r3 != r4) goto L_0x177a
            r3 = 1
            goto L_0x177b
        L_0x177a:
            r3 = 0
        L_0x177b:
            r1.f7884T = r3
            goto L_0x179e
        L_0x177e:
            int r3 = r0.f7404q2
            r1.f7849B0 = r3
            int r3 = r0.f7411r2
            r1.f7851C0 = r3
            int r3 = r0.f7418s2
            r1.f7853D0 = r3
            int r3 = r0.f7425t2
            r1.f7855E0 = r3
            int r3 = r0.f7432u2
            r1.f7857F0 = r3
            boolean r3 = r0.f7383n2
            r1.f7886U = r3
            boolean r3 = r0.f7390o2
            r1.f7888V = r3
            boolean r3 = r0.f7376m2
            r1.f7884T = r3
        L_0x179e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_fdist"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 1
            int r3 = r5.getInt(r3, r4)
            if (r3 != r4) goto L_0x17bb
            r3 = 1
            goto L_0x17bc
        L_0x17bb:
            r3 = 0
        L_0x17bc:
            r1.f7892X = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_fsexo"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            if (r3 != r4) goto L_0x17da
            r3 = 1
            goto L_0x17db
        L_0x17da:
            r3 = 0
        L_0x17db:
            r1.f7894Y = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_fn"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            if (r3 != r4) goto L_0x17f9
            r3 = 1
            goto L_0x17fa
        L_0x17f9:
            r3 = 0
        L_0x17fa:
            r1.f7896Z = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_fedad1"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            if (r3 != r4) goto L_0x1818
            r3 = 1
            goto L_0x1819
        L_0x1818:
            r3 = 0
        L_0x1819:
            r1.f7899a0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_fedad2"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            if (r3 != r4) goto L_0x1837
            r3 = 1
            goto L_0x1838
        L_0x1837:
            r3 = 0
        L_0x1838:
            r1.f7902b0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_fdist_d"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r1.f7905c0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_fsexo_d"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r1.f7908d0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_fedad1_d"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r1.f7911e0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r10 = "_fedad2_d"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r1.f7914f0 = r3
            int r3 = r1.f7954t
            r4 = 16
            if (r3 != r4) goto L_0x1a89
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_fdist"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 1
            int r3 = r5.getInt(r3, r4)
            if (r3 != r4) goto L_0x18c6
            r3 = 1
            goto L_0x18c7
        L_0x18c6:
            r3 = 0
        L_0x18c7:
            r1.f7935m0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_i16"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "1111110111101"
            java.lang.String r3 = r5.getString(r3, r4)
            r4 = 1
            r10 = 0
            java.lang.String r12 = r3.substring(r10, r4)
            boolean r10 = r12.equals(r11)
            r1.f7923i0 = r10
            r10 = 2
            java.lang.String r12 = r3.substring(r4, r10)
            boolean r4 = r12.equals(r11)
            r1.f7920h0 = r4
            r4 = 3
            java.lang.String r12 = r3.substring(r10, r4)
            boolean r10 = r12.equals(r11)
            r1.f7929k0 = r10
            r10 = 4
            java.lang.String r12 = r3.substring(r4, r10)
            boolean r4 = r12.equals(r11)
            r1.f7926j0 = r4
            r4 = 5
            java.lang.String r12 = r3.substring(r10, r4)
            boolean r10 = r12.equals(r11)
            r1.f7932l0 = r10
            r10 = 6
            java.lang.String r12 = r3.substring(r4, r10)
            int r4 = java.lang.Integer.parseInt(r12)
            r1.f7941o0 = r4
            r12 = 7
            java.lang.String r4 = r3.substring(r10, r12)
            boolean r4 = r4.equals(r11)
            r1.f7938n0 = r4
            r4 = 8
            java.lang.String r17 = r3.substring(r12, r4)
            int r10 = java.lang.Integer.parseInt(r17)
            r1.f7944p0 = r10
            r10 = 9
            java.lang.String r12 = r3.substring(r4, r10)
            boolean r12 = r12.equals(r11)
            r1.f7950r0 = r12
            r12 = 10
            java.lang.String r4 = r3.substring(r10, r12)
            boolean r4 = r4.equals(r11)
            r1.f7953s0 = r4
            r4 = 11
            java.lang.String r10 = r3.substring(r12, r4)
            boolean r10 = r10.equals(r11)
            r1.f7874O = r10
            r10 = 12
            java.lang.String r16 = r3.substring(r4, r10)
            int r4 = java.lang.Integer.parseInt(r16)
            r1.f7947q0 = r4
            r4 = 13
            java.lang.String r3 = r3.substring(r10, r4)
            boolean r3 = r3.equals(r11)
            r1.f7955t0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_t_di"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7967z0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_t_mp"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7959v0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_t_mv"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7957u0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_t_de"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7963x0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_t_fa"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7961w0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_t_ul"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7965y0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_t_pr"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7847A0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_cats"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            java.lang.String[] r3 = r3.split(r14)
            int r4 = r3.length
            british.x.e[] r4 = new british.p015x.C1769e[r4]
            r1.f7917g0 = r4
            r4 = 0
        L_0x1a51:
            int r10 = r3.length
            if (r4 >= r10) goto L_0x1a89
            british.x.e r10 = new british.x.e
            r10.<init>()
            r12 = r3[r4]
            r23 = r3
            java.lang.String r3 = ";"
            java.lang.String[] r3 = r12.split(r3)
            r12 = 0
            r24 = r3[r12]
            int r12 = java.lang.Integer.parseInt(r24)
            r10.f7652a = r12
            r24 = r9
            r12 = 1
            r9 = r3[r12]
            boolean r9 = r9.equals(r11)
            r10.f7654c = r9
            r9 = 2
            r3 = r3[r9]
            r10.f7653b = r3
            british.x.e[] r3 = r1.f7917g0
            r3[r4] = r10
            int r4 = r4 + 1
            r3 = r23
            r9 = r24
            r12 = 10
            goto L_0x1a51
        L_0x1a89:
            r24 = r9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_f_chat"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r1.f7859G0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r9 = "_accext"
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r4 = 1
            if (r3 != r4) goto L_0x1ac3
            r3 = 1
            goto L_0x1ac4
        L_0x1ac3:
            r3 = 0
        L_0x1ac4:
            r1.f7890W = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_cat"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r1.f7861H0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r9 = "_sub"
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r1.f7863I0 = r3
            int r3 = r1.f7954t
            r4 = 14
            if (r3 != r4) goto L_0x1b1c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_v"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r1.f7846A = r3
        L_0x1b1c:
            int r3 = r1.f7954t
            r4 = 1
            if (r3 != r4) goto L_0x1b9b
            java.lang.String r3 = r1.f7910e
            java.lang.String r4 = "games.e-droid.net"
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x1b3f
            java.lang.String r3 = r1.f7910e
            java.lang.String r4 = "quiz.e-droid.net"
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x1b3f
            java.lang.String r3 = r1.f7910e
            java.lang.String r4 = "pixworld.io-desdeac"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x1b9b
        L_0x1b3f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_idg"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7924i1 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_cl"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r4 = 1
            if (r3 != r4) goto L_0x1b77
            r3 = 1
            goto L_0x1b78
        L_0x1b77:
            r3 = 0
        L_0x1b78:
            r1.f7927j1 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_cp"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r4 = 1
            if (r3 != r4) goto L_0x1b98
            r3 = 1
            goto L_0x1b99
        L_0x1b98:
            r3 = 0
        L_0x1b99:
            r1.f7930k1 = r3
        L_0x1b9b:
            int r3 = r1.f7954t
            r4 = 19
            if (r3 != r4) goto L_0x1bc2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_iw"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r4 = 1
            if (r3 != r4) goto L_0x1bbf
            r3 = 1
            goto L_0x1bc0
        L_0x1bbf:
            r3 = 0
        L_0x1bc0:
            r1.f7880R = r3
        L_0x1bc2:
            int r3 = r1.f7954t
            r4 = 13
            if (r3 != r4) goto L_0x1c0a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_st"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r4 = 1
            if (r3 != r4) goto L_0x1be6
            r3 = 1
            goto L_0x1be7
        L_0x1be6:
            r3 = 0
        L_0x1be7:
            r1.f7933l1 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_sta"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r4 = 1
            if (r3 != r4) goto L_0x1c07
            r3 = 1
            goto L_0x1c08
        L_0x1c07:
            r3 = 0
        L_0x1c08:
            r1.f7936m1 = r3
        L_0x1c0a:
            int r3 = r1.f7954t
            r4 = 20
            if (r3 != r4) goto L_0x1c8d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_ad"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r4 = 1
            if (r3 != r4) goto L_0x1c2e
            r3 = 1
            goto L_0x1c2f
        L_0x1c2e:
            r3 = 0
        L_0x1c2f:
            r1.f7942o1 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_mc"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r4 = 1
            if (r3 != r4) goto L_0x1c4f
            r3 = 1
            goto L_0x1c50
        L_0x1c4f:
            r3 = 0
        L_0x1c50:
            r1.f7945p1 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_tv"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r4 = 1
            if (r3 != r4) goto L_0x1c70
            r3 = 1
            goto L_0x1c71
        L_0x1c70:
            r3 = 0
        L_0x1c71:
            r1.f7948q1 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_cv"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7951r1 = r3
        L_0x1c8d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_ncols"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 1
            int r3 = r5.getInt(r3, r4)
            r1.f7883S0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_padding"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 2
            int r3 = r5.getInt(r3, r4)
            r1.f7885T0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_txt_radius"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 5
            int r3 = r5.getInt(r3, r4)
            r1.f7887U0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_mostrar_icos"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 1
            int r3 = r5.getInt(r3, r4)
            if (r3 != 0) goto L_0x1cfd
            r3 = 0
            r1.f7891W0 = r3
            goto L_0x1cff
        L_0x1cfd:
            r1.f7891W0 = r4
        L_0x1cff:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r9 = "_mostrar_txt"
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            if (r3 != 0) goto L_0x1d1d
            r3 = 0
            r1.f7893X0 = r3
            goto L_0x1d1f
        L_0x1d1d:
            r1.f7893X0 = r4
        L_0x1d1f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r9 = "_icos_izq"
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            if (r3 != 0) goto L_0x1d3d
            r3 = 0
            r1.f7895Y0 = r3
            goto L_0x1d3f
        L_0x1d3d:
            r1.f7895Y0 = r4
        L_0x1d3f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r9 = "_anim"
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            if (r3 != 0) goto L_0x1d5d
            r3 = 0
            r1.f7897Z0 = r3
            goto L_0x1d5f
        L_0x1d5d:
            r1.f7897Z0 = r4
        L_0x1d5f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r9 = "_c"
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            if (r3 != 0) goto L_0x1d7d
            r3 = 0
            r1.f7900a1 = r3
            goto L_0x1d7f
        L_0x1d7d:
            r1.f7900a1 = r4
        L_0x1d7f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r9 = "_txt_c"
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            if (r3 != 0) goto L_0x1d9d
            r3 = 0
            r1.f7903b1 = r3
            goto L_0x1da0
        L_0x1d9d:
            r3 = 0
            r1.f7903b1 = r4
        L_0x1da0:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r13)
            java.lang.String r10 = "_txt_b"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            int r9 = r5.getInt(r9, r3)
            if (r9 != r4) goto L_0x1dbc
            r3 = 1
            goto L_0x1dbd
        L_0x1dbc:
            r3 = 0
        L_0x1dbd:
            r1.f7906c1 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_e"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r1.f7889V0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_txt_bg"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7909d1 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_txt_col"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7912e1 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_seccs"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r1.f7915f1 = r3
            int r3 = r1.f7954t
            r4 = 22
            if (r3 != r4) goto L_0x1e63
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_incl"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            boolean r4 = r3.equals(r8)
            if (r4 != 0) goto L_0x1e63
            r4 = 1
            r9 = 0
            java.lang.String r10 = r3.substring(r9, r4)
            boolean r9 = r10.equals(r11)
            r1.f7918g1 = r9
            r9 = 2
            java.lang.String r3 = r3.substring(r4, r9)
            boolean r3 = r3.equals(r11)
            r1.f7921h1 = r3
        L_0x1e63:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_ico_id"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            int r3 = r5.getInt(r3, r4)
            r1.f7875O0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r9 = "_v_ico"
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r1.f7877P0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r9 = "_w_ico"
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r1.f7879Q0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r9 = "_h_ico"
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r1.f7881R0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r9 = "_ico"
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r3 = r5.getInt(r3, r4)
            r9 = 1
            if (r3 != r9) goto L_0x1ef4
            r1.f7871M0 = r9
            r1.f7873N0 = r4
            boolean r3 = r1.f7848B
            if (r3 != 0) goto L_0x1f2a
            r0.f7219M1 = r9
            r0.f7225N1 = r9
            goto L_0x1f2a
        L_0x1ef4:
            r1.f7871M0 = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x1f1e }
            r3.<init>()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x1f1e }
            java.lang.String r4 = "img_s"
            r3.append(r4)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x1f1e }
            r3.append(r13)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x1f1e }
            java.lang.String r4 = "_ico"
            r3.append(r4)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x1f1e }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x1f1e }
            java.io.FileInputStream r3 = r0.openFileInput(r3)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x1f1e }
            java.io.FileDescriptor r4 = r3.getFD()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x1f1e }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeFileDescriptor(r4)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x1f1e }
            r1.f7869L0 = r4     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x1f1e }
            r3.close()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x1f1e }
            goto L_0x1f1f
        L_0x1f1e:
        L_0x1f1f:
            android.graphics.Bitmap r3 = r1.f7869L0
            if (r3 == 0) goto L_0x1f2a
            boolean r3 = r1.f7848B
            if (r3 != 0) goto L_0x1f2a
            r3 = 1
            r0.f7225N1 = r3
        L_0x1f2a:
            int r3 = r1.f7954t
            r9 = 5
            if (r3 != r9) goto L_0x1f32
            r0.f7422t = r2
            goto L_0x1f37
        L_0x1f32:
            r4 = 4
            if (r3 != r4) goto L_0x1f37
            r0.f7429u = r2
        L_0x1f37:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_idtemas"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            boolean r4 = r3.equals(r8)
            if (r4 != 0) goto L_0x1f76
            java.lang.String[] r3 = r3.split(r6)
            int r4 = r3.length
            british.x.o[] r4 = new british.p015x.C1888o[r4]
            r1.f7867K0 = r4
            r4 = 0
        L_0x1f5f:
            int r10 = r3.length
            if (r4 >= r10) goto L_0x1f76
            r10 = r3[r4]
            british.x.o r12 = new british.x.o
            r12.<init>()
            int r10 = java.lang.Integer.parseInt(r10)
            r12.f8022a = r10
            british.x.o[] r10 = r1.f7867K0
            r10[r4] = r12
            int r4 = r4 + 1
            goto L_0x1f5f
        L_0x1f76:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r13)
            java.lang.String r4 = "_iditems"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            boolean r4 = r3.equals(r8)
            if (r4 != 0) goto L_0x244a
            java.lang.String[] r3 = r3.split(r6)
            int r4 = r3.length
            british.x.b[] r4 = new british.p015x.C1598b[r4]
            r1.f7865J0 = r4
            r4 = 0
        L_0x1f9e:
            int r10 = r3.length
            if (r4 >= r10) goto L_0x244a
            r10 = r3[r4]
            british.x.b r12 = new british.x.b
            r12.<init>()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r9 = "it"
            r13.append(r9)
            r13.append(r10)
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            r23 = r3
            r3 = 0
            int r13 = r5.getInt(r13, r3)
            int r3 = java.lang.Integer.parseInt(r10)
            r12.f6856a = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            r25 = r11
            java.lang.String r11 = "_tit1"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r12.f6847C = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_tit1_c"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6860e = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_tit2"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r12.f6848D = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_tit2_c"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6861f = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_txt"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r12.f6849E = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_txt_c"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6862g = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_txt_h"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6881z = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_fcab_id"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6857b = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_fcab_modif"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 1
            int r3 = r5.getInt(r3, r11)
            r12.f6858c = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_fcab_c"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6859d = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_fcab_url"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r12.f6853I = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_fotos_pos"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6863h = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_fotos_c"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6864i = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_fotos_h"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6865j = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_fcab_z"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r11 = 1
            if (r3 != r11) goto L_0x215f
            r3 = 1
            goto L_0x2160
        L_0x215f:
            r3 = 0
        L_0x2160:
            r12.f6845A = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_fotos_z"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 1
            int r3 = r5.getInt(r3, r11)
            if (r3 != r11) goto L_0x217f
            r3 = 1
            goto L_0x2180
        L_0x217f:
            r3 = 0
        L_0x2180:
            r12.f6846B = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_tit1_b"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6866k = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_tit1_i"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6867l = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_tit1_f"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6868m = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_tit1_col"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r12.f6850F = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_tit1_u"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6869n = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_tit1_s"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6870o = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_tit2_b"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6871p = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_tit2_i"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6872q = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_tit2_f"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6873r = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_tit2_col"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r12.f6851G = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_tit2_u"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6874s = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_tit2_s"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6875t = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_txt_b"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6876u = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_txt_i"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6877v = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_txt_f"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6878w = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_txt_col"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            r12.f6852H = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_txt_u"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6879x = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r11 = "_txt_s"
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            r12.f6880y = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r10)
            java.lang.String r9 = "_idfotos"
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r5.getString(r3, r8)
            boolean r9 = r3.equals(r8)
            if (r9 != 0) goto L_0x2423
            java.lang.String[] r3 = r3.split(r6)
            int r9 = r3.length
            r10 = 2
            int[] r11 = new int[r10]
            r18 = 1
            r11[r18] = r10
            r10 = 0
            r11[r10] = r9
            java.lang.Class<int> r9 = int.class
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r9, r11)
            int[][] r9 = (int[][]) r9
            r12.f6854J = r9
            int r9 = r3.length
            java.lang.String[] r9 = new java.lang.String[r9]
            r12.f6855K = r9
            r9 = 0
        L_0x23a2:
            int r10 = r3.length
            if (r9 >= r10) goto L_0x241e
            r10 = r3[r9]
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r26 = r3
            java.lang.String r3 = "it_f"
            r11.append(r3)
            r11.append(r10)
            r11.append(r15)
            java.lang.String r3 = r11.toString()
            r11 = 0
            int r3 = r5.getInt(r3, r11)
            int[][] r11 = r12.f6854J
            r18 = 1
            int r3 = r3 + -1
            r11 = r11[r3]
            int r27 = java.lang.Integer.parseInt(r10)
            r19 = 0
            r11[r19] = r27
            int[][] r11 = r12.f6854J
            r11 = r11[r3]
            r27 = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r28 = r6
            java.lang.String r6 = "it_f"
            r14.append(r6)
            r14.append(r10)
            java.lang.String r6 = "_modif"
            r14.append(r6)
            java.lang.String r6 = r14.toString()
            r14 = 1
            int r6 = r5.getInt(r6, r14)
            r11[r14] = r6
            java.lang.String[] r6 = r12.f6855K
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "it_f"
            r11.append(r14)
            r11.append(r10)
            java.lang.String r10 = "_url"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r10 = r5.getString(r10, r8)
            r6[r3] = r10
            int r9 = r9 + 1
            r3 = r26
            r14 = r27
            r6 = r28
            goto L_0x23a2
        L_0x241e:
            r28 = r6
            r27 = r14
            goto L_0x2437
        L_0x2423:
            r28 = r6
            r27 = r14
            r3 = 2
            int[] r6 = new int[r3]
            r6 = {0, 0} // fill-array
            java.lang.Class<int> r3 = int.class
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r6)
            int[][] r3 = (int[][]) r3
            r12.f6854J = r3
        L_0x2437:
            british.x.b[] r3 = r1.f7865J0
            r6 = 1
            int r13 = r13 - r6
            r3[r13] = r12
            int r4 = r4 + 1
            r3 = r23
            r11 = r25
            r14 = r27
            r6 = r28
            r9 = 5
            goto L_0x1f9e
        L_0x244a:
            r28 = r6
            r25 = r11
            r27 = r14
            british.x.l[] r3 = r0.f7231O1
            r3[r2] = r1
            java.util.ArrayList<java.lang.Integer> r3 = f7114N5
            int r4 = r1.f7964y
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            boolean r1 = r1.f7848B
            if (r1 != 0) goto L_0x246a
            int[] r1 = r0.f7243Q1
            r1[r22] = r2
            int r12 = r22 + 1
            goto L_0x246c
        L_0x246a:
            r12 = r22
        L_0x246c:
            int r10 = r20 + 1
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r21
            r9 = r24
            r11 = r25
            r14 = r27
            r6 = r28
            goto L_0x1164
        L_0x2480:
            r28 = r6
            r22 = r12
            if (r33 == 0) goto L_0x24f3
            java.lang.String r1 = r33.getDataString()
            if (r1 == 0) goto L_0x24f3
            java.lang.String r1 = r33.getDataString()
            java.lang.String r2 = "www.appcreator24.com/open2261075-n6uezi/"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x24f3
            java.lang.String r1 = r33.getDataString()
            java.lang.String r2 = "http://"
            java.lang.String r1 = r1.replace(r2, r8)
            java.lang.String r2 = "https://"
            java.lang.String r1 = r1.replace(r2, r8)
            int r2 = r1.length()
            r3 = 40
            if (r2 <= r3) goto L_0x24f3
            java.lang.String r2 = "/"
            java.lang.String[] r1 = r1.split(r2)
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            r1 = r1[r2]
            r3 = r30
            r2 = 0
        L_0x24be:
            int r6 = r3.length
            if (r2 >= r6) goto L_0x24f3
            british.x.l[] r6 = r0.f7231O1
            r6 = r6[r2]
            java.lang.String r6 = r6.f7922i
            boolean r6 = r6.equalsIgnoreCase(r1)
            if (r6 == 0) goto L_0x24f0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            british.x.l[] r3 = r0.f7231O1
            r2 = r3[r2]
            int r2 = r2.f7964y
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r2 = 0
            int r1 = r5.getInt(r1, r2)
            r2 = 1
            int r1 = r1 - r2
            r2 = -1
            if (r1 == r2) goto L_0x24f3
            goto L_0x24f4
        L_0x24f0:
            int r2 = r2 + 1
            goto L_0x24be
        L_0x24f3:
            r1 = r4
        L_0x24f4:
            if (r33 == 0) goto L_0x2531
            java.lang.String r2 = r33.getDataString()
            if (r2 == 0) goto L_0x2531
            java.lang.String r2 = r33.getDataString()
            java.lang.String r3 = "join-app.net/a2261075-n6uezi/"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x2531
            java.lang.String r2 = r33.getDataString()
            java.lang.String r3 = "http://"
            java.lang.String r2 = r2.replace(r3, r8)
            java.lang.String r3 = "https://"
            java.lang.String r2 = r2.replace(r3, r8)
            int r3 = r2.length()
            r4 = 29
            if (r3 <= r4) goto L_0x2531
            java.lang.String r3 = "/"
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r4 = 1
            int r3 = r3 - r4
            r2 = r2[r3]
            java.lang.String r2 = r2.toUpperCase()
            r0.f7148A2 = r2
        L_0x2531:
            int[] r2 = r0.f7243Q1
            r12 = r22
            int[] r3 = new int[r12]
            r0.f7243Q1 = r3
            r3 = 0
        L_0x253a:
            if (r3 >= r12) goto L_0x2545
            int[] r4 = r0.f7243Q1
            r6 = r2[r3]
            r4[r3] = r6
            int r3 = r3 + 1
            goto L_0x253a
        L_0x2545:
            r2 = 9996(0x270c, float:1.4007E-41)
            if (r1 != r2) goto L_0x254d
            r1 = r31
            r7 = 0
            goto L_0x2550
        L_0x254d:
            r7 = r1
            r1 = r31
        L_0x2550:
            int r2 = r1.length
            british.x.i[] r2 = new british.p015x.C1840i[r2]
            r0.f7237P1 = r2
            r2 = 0
        L_0x2556:
            int r3 = r1.length
            if (r2 >= r3) goto L_0x2820
            r3 = r1[r2]
            british.x.i r4 = new british.x.i
            r4.<init>()
            int r6 = java.lang.Integer.parseInt(r3)
            r4.f7827l = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "o"
            r6.append(r9)
            r6.append(r3)
            java.lang.String r10 = "_tit"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getString(r6, r8)
            r4.f7816a = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r3)
            java.lang.String r10 = "_dir1"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getString(r6, r8)
            r4.f7822g = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r3)
            java.lang.String r10 = "_dir2"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getString(r6, r8)
            r4.f7823h = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r3)
            java.lang.String r10 = "_cp"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getString(r6, r8)
            r4.f7824i = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r3)
            java.lang.String r10 = "_pob"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getString(r6, r8)
            r4.f7825j = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r3)
            java.lang.String r10 = "_prov"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getString(r6, r8)
            r4.f7826k = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r3)
            java.lang.String r10 = "_tel1"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getString(r6, r8)
            r4.f7817b = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r3)
            java.lang.String r10 = "_tel2"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getString(r6, r8)
            r4.f7818c = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r3)
            java.lang.String r10 = "_horario"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getString(r6, r8)
            r4.f7819d = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r3)
            java.lang.String r10 = "_nfotos"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            r10 = 0
            int r6 = r5.getInt(r6, r10)
            r4.f7828m = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r3)
            java.lang.String r11 = "_x"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            int r6 = r5.getInt(r6, r10)
            r4.f7833r = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r3)
            java.lang.String r11 = "_y"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            int r6 = r5.getInt(r6, r10)
            r4.f7834s = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r3)
            java.lang.String r11 = "_z"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            int r6 = r5.getInt(r6, r10)
            r4.f7835t = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r3)
            java.lang.String r10 = "_email"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getString(r6, r8)
            r4.f7820e = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r3)
            java.lang.String r10 = "_t_email"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            r10 = 0
            int r6 = r5.getInt(r6, r10)
            if (r6 != 0) goto L_0x26f3
            r4.f7840y = r10
            goto L_0x26f6
        L_0x26f3:
            r6 = 1
            r4.f7840y = r6
        L_0x26f6:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r3)
            java.lang.String r10 = "_web"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getString(r6, r8)
            r4.f7821f = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r3)
            java.lang.String r10 = "_wp"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            r10 = 1
            int r6 = r5.getInt(r6, r10)
            if (r6 != 0) goto L_0x272f
            r6 = 0
            r4.f7815B = r6
            goto L_0x2732
        L_0x272f:
            r6 = 0
            r4.f7815B = r10
        L_0x2732:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r3)
            java.lang.String r11 = "_chat"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            int r10 = r5.getInt(r10, r6)
            if (r10 != 0) goto L_0x2750
            r4.f7841z = r6
            r6 = 1
            goto L_0x2753
        L_0x2750:
            r6 = 1
            r4.f7841z = r6
        L_0x2753:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r3)
            java.lang.String r11 = "_zoo"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            int r10 = r5.getInt(r10, r6)
            if (r10 != r6) goto L_0x276f
            r6 = 1
            goto L_0x2770
        L_0x276f:
            r6 = 0
        L_0x2770:
            r4.f7814A = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r3)
            java.lang.String r10 = "_idfotos"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r5.getString(r6, r8)
            boolean r10 = r6.equals(r8)
            if (r10 != 0) goto L_0x27f8
            r10 = r28
            java.lang.String[] r6 = r6.split(r10)
            r11 = 0
        L_0x2797:
            int r12 = r6.length
            if (r11 >= r12) goto L_0x27fa
            r12 = r6[r11]
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "o_f"
            r13.append(r14)
            r13.append(r12)
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            r14 = 0
            int r13 = r5.getInt(r13, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = "o_f"
            r14.append(r1)
            r14.append(r12)
            java.lang.String r1 = "_modif"
            r14.append(r1)
            java.lang.String r1 = r14.toString()
            r14 = 1
            boolean r1 = r5.getBoolean(r1, r14)
            int r12 = java.lang.Integer.parseInt(r12)
            if (r13 != r14) goto L_0x27dc
            r4.f7829n = r12
            r4.f7836u = r1
        L_0x27da:
            r14 = 4
            goto L_0x27f3
        L_0x27dc:
            r14 = 2
            if (r13 != r14) goto L_0x27e4
            r4.f7830o = r12
            r4.f7837v = r1
            goto L_0x27da
        L_0x27e4:
            r14 = 3
            if (r13 != r14) goto L_0x27ec
            r4.f7831p = r12
            r4.f7838w = r1
            goto L_0x27da
        L_0x27ec:
            r14 = 4
            if (r13 != r14) goto L_0x27f3
            r4.f7832q = r12
            r4.f7839x = r1
        L_0x27f3:
            int r11 = r11 + 1
            r1 = r31
            goto L_0x2797
        L_0x27f8:
            r10 = r28
        L_0x27fa:
            r14 = 4
            british.x.i[] r1 = r0.f7237P1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r3)
            r6.append(r15)
            java.lang.String r3 = r6.toString()
            r6 = 0
            int r3 = r5.getInt(r3, r6)
            r9 = 1
            int r3 = r3 - r9
            r1[r3] = r4
            int r2 = r2 + 1
            r1 = r31
            r28 = r10
            goto L_0x2556
        L_0x2820:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1692config.mo7529z(java.lang.String[], java.lang.String[], android.os.Bundle, android.content.Intent):int");
    }
}
