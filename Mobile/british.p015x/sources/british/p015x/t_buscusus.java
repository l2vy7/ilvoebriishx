package british.p015x;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
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
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
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
import com.facebook.ads.AdView;
import com.facebook.ads.C3371Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.VideoListener;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: british.x.t_buscusus */
public class t_buscusus extends Activity_ext_class implements C1592a, View.OnClickListener, SharedPreferences.OnSharedPreferenceChangeListener, AdapterView.OnItemClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    boolean f8720A = false;

    /* renamed from: B */
    boolean f8721B;

    /* renamed from: C */
    boolean f8722C;

    /* renamed from: D */
    boolean f8723D;

    /* renamed from: E */
    boolean f8724E;

    /* renamed from: F */
    boolean f8725F;

    /* renamed from: G */
    boolean f8726G;

    /* renamed from: H */
    int f8727H;

    /* renamed from: I */
    int f8728I;

    /* renamed from: J */
    int f8729J;

    /* renamed from: K */
    int f8730K;

    /* renamed from: L */
    int f8731L;

    /* renamed from: M */
    int f8732M;

    /* renamed from: N */
    String f8733N;

    /* renamed from: O */
    String f8734O;

    /* renamed from: P */
    String f8735P;

    /* renamed from: Q */
    Bitmap f8736Q;

    /* renamed from: R */
    ArrayList<C2136h> f8737R;

    /* renamed from: S */
    GridView f8738S;

    /* renamed from: T */
    C2134g f8739T;

    /* renamed from: U */
    C2138j f8740U;

    /* renamed from: V */
    C2137i f8741V;

    /* renamed from: W */
    Dialog f8742W;

    /* renamed from: X */
    File f8743X;

    /* renamed from: Y */
    TextView f8744Y;

    /* renamed from: Z */
    TextView f8745Z;

    /* renamed from: l0 */
    TextView f8746l0;

    /* renamed from: m */
    long f8747m;

    /* renamed from: m0 */
    TextView f8748m0;

    /* renamed from: n */
    int f8749n;

    /* renamed from: n0 */
    TextView f8750n0;

    /* renamed from: o */
    int f8751o;

    /* renamed from: o0 */
    C1603c f8752o0;

    /* renamed from: p */
    int f8753p;

    /* renamed from: p0 */
    boolean f8754p0 = false;

    /* renamed from: q */
    int f8755q;

    /* renamed from: q0 */
    Bundle f8756q0;

    /* renamed from: r */
    int f8757r;

    /* renamed from: r0 */
    ListView f8758r0;

    /* renamed from: s */
    int f8759s;

    /* renamed from: s0 */
    SharedPreferences f8760s0;

    /* renamed from: t */
    C1692config f8761t;

    /* renamed from: u */
    boolean f8762u = false;

    /* renamed from: v */
    boolean f8763v = false;

    /* renamed from: w */
    boolean f8764w;

    /* renamed from: x */
    boolean f8765x;

    /* renamed from: y */
    boolean f8766y;

    /* renamed from: z */
    boolean f8767z;

    /* renamed from: british.x.t_buscusus$a */
    class C2126a extends AdColonyInterstitialListener {
        C2126a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_buscusus t_buscusus = t_buscusus.this;
            if (t_buscusus.f8754p0) {
                t_buscusus.abrir_secc(t_buscusus.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_buscusus.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_buscusus.this.f6661g.cancel();
            t_buscusus t_buscusus = t_buscusus.this;
            t_buscusus.abrir_secc(t_buscusus.f6660f);
        }
    }

    /* renamed from: british.x.t_buscusus$b */
    class C2127b implements SearchManager.OnCancelListener {
        C2127b() {
        }

        public void onCancel() {
            t_buscusus t_buscusus = t_buscusus.this;
            t_buscusus.f6657c = false;
            t_buscusus.setResult(0);
        }
    }

    /* renamed from: british.x.t_buscusus$c */
    class C2128c implements SearchManager.OnDismissListener {
        C2128c() {
        }

        public void onDismiss() {
            t_buscusus.this.f6658d = false;
        }
    }

    /* renamed from: british.x.t_buscusus$d */
    class C2129d implements View.OnClickListener {
        C2129d() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00d4  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00fe  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x014e  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0198  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r11) {
            /*
                r10 = this;
                british.x.t_buscusus r11 = british.p015x.t_buscusus.this
                android.content.SharedPreferences r11 = r11.f8760s0
                android.content.SharedPreferences$Editor r11 = r11.edit()
                british.x.t_buscusus r0 = british.p015x.t_buscusus.this
                boolean r1 = r0.f8723D
                r2 = 5
                r3 = 3
                r4 = 1
                r5 = 2
                r6 = 0
                if (r1 == 0) goto L_0x0082
                android.app.Dialog r0 = r0.f8742W
                r1 = 2131362914(0x7f0a0462, float:1.8345622E38)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.Spinner r0 = (android.widget.Spinner) r0
                int r0 = r0.getSelectedItemPosition()
                r1 = 10
                if (r0 != r5) goto L_0x0028
                r1 = 1
                goto L_0x0054
            L_0x0028:
                if (r0 != r3) goto L_0x002c
                r1 = 2
                goto L_0x0054
            L_0x002c:
                r7 = 4
                if (r0 != r7) goto L_0x0031
                r1 = 5
                goto L_0x0054
            L_0x0031:
                if (r0 != r2) goto L_0x0034
                goto L_0x0054
            L_0x0034:
                r7 = 6
                if (r0 != r7) goto L_0x003a
                r1 = 20
                goto L_0x0054
            L_0x003a:
                r7 = 7
                if (r0 != r7) goto L_0x0040
                r1 = 50
                goto L_0x0054
            L_0x0040:
                r7 = 8
                if (r0 != r7) goto L_0x0047
                r1 = 100
                goto L_0x0054
            L_0x0047:
                r7 = 9
                if (r0 != r7) goto L_0x004e
                r1 = 200(0xc8, float:2.8E-43)
                goto L_0x0054
            L_0x004e:
                if (r0 != r1) goto L_0x0053
                r1 = 500(0x1f4, float:7.0E-43)
                goto L_0x0054
            L_0x0053:
                r1 = 0
            L_0x0054:
                british.x.t_buscusus r0 = british.p015x.t_buscusus.this
                int r7 = r0.f8728I
                if (r7 == r1) goto L_0x0082
                r0.f8728I = r1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "fdist_v_"
                r0.append(r1)
                british.x.t_buscusus r1 = british.p015x.t_buscusus.this
                british.x.config r7 = r1.f8761t
                british.x.l[] r7 = r7.f7231O1
                int r1 = r1.f8749n
                r1 = r7[r1]
                int r1 = r1.f7964y
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                british.x.t_buscusus r1 = british.p015x.t_buscusus.this
                int r1 = r1.f8728I
                r11.putInt(r0, r1)
                r0 = 1
                goto L_0x0083
            L_0x0082:
                r0 = 0
            L_0x0083:
                british.x.t_buscusus r1 = british.p015x.t_buscusus.this
                boolean r7 = r1.f8721B
                if (r7 == 0) goto L_0x00ce
                android.app.Dialog r1 = r1.f8742W
                r7 = 2131362917(0x7f0a0465, float:1.8345628E38)
                android.view.View r1 = r1.findViewById(r7)
                android.widget.Spinner r1 = (android.widget.Spinner) r1
                int r1 = r1.getSelectedItemPosition()
                if (r1 != r5) goto L_0x009c
                r1 = 1
                goto L_0x00a1
            L_0x009c:
                if (r1 != r3) goto L_0x00a0
                r1 = 2
                goto L_0x00a1
            L_0x00a0:
                r1 = 0
            L_0x00a1:
                british.x.t_buscusus r7 = british.p015x.t_buscusus.this
                int r8 = r7.f8727H
                if (r8 == r1) goto L_0x00ce
                r7.f8727H = r1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "fsexo_v_"
                r0.append(r1)
                british.x.t_buscusus r1 = british.p015x.t_buscusus.this
                british.x.config r7 = r1.f8761t
                british.x.l[] r7 = r7.f7231O1
                int r1 = r1.f8749n
                r1 = r7[r1]
                int r1 = r1.f7964y
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                british.x.t_buscusus r1 = british.p015x.t_buscusus.this
                int r1 = r1.f8727H
                r11.putInt(r0, r1)
                r0 = 1
            L_0x00ce:
                british.x.t_buscusus r1 = british.p015x.t_buscusus.this
                boolean r7 = r1.f8722C
                if (r7 == 0) goto L_0x00f6
                android.app.Dialog r1 = r1.f8742W
                r7 = 2131363146(0x7f0a054a, float:1.8346093E38)
                android.view.View r1 = r1.findViewById(r7)
                android.widget.EditText r1 = (android.widget.EditText) r1
                android.text.Editable r1 = r1.getText()
                java.lang.String r1 = r1.toString()
                british.x.t_buscusus r7 = british.p015x.t_buscusus.this
                java.lang.String r7 = r7.f8733N
                boolean r7 = r7.equals(r1)
                if (r7 != 0) goto L_0x00f6
                british.x.t_buscusus r0 = british.p015x.t_buscusus.this
                r0.f8733N = r1
                r0 = 1
            L_0x00f6:
                british.x.t_buscusus r1 = british.p015x.t_buscusus.this
                boolean r7 = r1.f8724E
                r8 = 18
                if (r7 == 0) goto L_0x0148
                android.app.Dialog r1 = r1.f8742W
                r7 = 2131362915(0x7f0a0463, float:1.8345624E38)
                android.view.View r1 = r1.findViewById(r7)
                android.widget.Spinner r1 = (android.widget.Spinner) r1
                int r1 = r1.getSelectedItemPosition()
                if (r1 != r5) goto L_0x0112
                r1 = 18
                goto L_0x011b
            L_0x0112:
                if (r1 <= r5) goto L_0x011a
                int r1 = r1 - r3
                int r1 = r1 * 5
                int r1 = r1 + 25
                goto L_0x011b
            L_0x011a:
                r1 = 0
            L_0x011b:
                british.x.t_buscusus r7 = british.p015x.t_buscusus.this
                int r9 = r7.f8729J
                if (r9 == r1) goto L_0x0148
                r7.f8729J = r1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "fedad1_v_"
                r0.append(r1)
                british.x.t_buscusus r1 = british.p015x.t_buscusus.this
                british.x.config r7 = r1.f8761t
                british.x.l[] r7 = r7.f7231O1
                int r1 = r1.f8749n
                r1 = r7[r1]
                int r1 = r1.f7964y
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                british.x.t_buscusus r1 = british.p015x.t_buscusus.this
                int r1 = r1.f8729J
                r11.putInt(r0, r1)
                r0 = 1
            L_0x0148:
                british.x.t_buscusus r1 = british.p015x.t_buscusus.this
                boolean r7 = r1.f8725F
                if (r7 == 0) goto L_0x0196
                android.app.Dialog r1 = r1.f8742W
                r7 = 2131362916(0x7f0a0464, float:1.8345626E38)
                android.view.View r1 = r1.findViewById(r7)
                android.widget.Spinner r1 = (android.widget.Spinner) r1
                int r1 = r1.getSelectedItemPosition()
                if (r1 != r5) goto L_0x0160
                goto L_0x0169
            L_0x0160:
                if (r1 <= r5) goto L_0x0168
                int r1 = r1 - r3
                int r1 = r1 * 5
                int r8 = r1 + 25
                goto L_0x0169
            L_0x0168:
                r8 = 0
            L_0x0169:
                british.x.t_buscusus r1 = british.p015x.t_buscusus.this
                int r2 = r1.f8730K
                if (r2 == r8) goto L_0x0196
                r1.f8730K = r8
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "fedad2_v_"
                r0.append(r1)
                british.x.t_buscusus r1 = british.p015x.t_buscusus.this
                british.x.config r2 = r1.f8761t
                british.x.l[] r2 = r2.f7231O1
                int r1 = r1.f8749n
                r1 = r2[r1]
                int r1 = r1.f7964y
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                british.x.t_buscusus r1 = british.p015x.t_buscusus.this
                int r1 = r1.f8730K
                r11.putInt(r0, r1)
                r0 = 1
            L_0x0196:
                if (r0 == 0) goto L_0x01cf
                r11.commit()
                british.x.t_buscusus r11 = british.p015x.t_buscusus.this
                r11.mo8277d()
                british.x.t_buscusus r11 = british.p015x.t_buscusus.this
                java.util.ArrayList<british.x.t_buscusus$h> r11 = r11.f8737R
                r11.clear()
                british.x.t_buscusus r11 = british.p015x.t_buscusus.this
                r11.f8764w = r6
                british.x.t_buscusus$g r11 = r11.f8739T
                r11.notifyDataSetChanged()
                british.x.t_buscusus r11 = british.p015x.t_buscusus.this
                r11.f8720A = r6
                british.x.t_buscusus$j r11 = r11.f8740U
                if (r11 == 0) goto L_0x01bb
                r11.cancel(r4)
            L_0x01bb:
                british.x.t_buscusus r11 = british.p015x.t_buscusus.this
                british.x.t_buscusus$j r0 = new british.x.t_buscusus$j
                british.x.t_buscusus r1 = british.p015x.t_buscusus.this
                r0.<init>(r6)
                r11.f8740U = r0
                british.x.t_buscusus r11 = british.p015x.t_buscusus.this
                british.x.t_buscusus$j r11 = r11.f8740U
                java.lang.String[] r0 = new java.lang.String[r6]
                r11.execute(r0)
            L_0x01cf:
                british.x.t_buscusus r11 = british.p015x.t_buscusus.this
                android.app.Dialog r11 = r11.f8742W
                r11.dismiss()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_buscusus.C2129d.onClick(android.view.View):void");
        }
    }

    /* renamed from: british.x.t_buscusus$e */
    class C2130e extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f8772a;

        /* renamed from: british.x.t_buscusus$e$a */
        class C2131a extends FullScreenContentCallback {
            C2131a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_buscusus t_buscusus = t_buscusus.this;
                if (t_buscusus.f8754p0) {
                    t_buscusus.abrir_secc(t_buscusus.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_buscusus t_buscusus = t_buscusus.this;
                t_buscusus.abrir_secc(t_buscusus.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.x.t_buscusus$e$b */
        class C2132b implements OnUserEarnedRewardListener {
            C2132b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2130e eVar = C2130e.this;
                t_buscusus.this.f8754p0 = true;
                C1692config.m8175Y0(eVar.f8772a);
            }
        }

        C2130e(Context context) {
            this.f8772a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_buscusus.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2131a());
            rewardedAd.show((Activity) this.f8772a, new C2132b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_buscusus t_buscusus = t_buscusus.this;
            if (!t_buscusus.f8761t.mo7502f(this.f8772a, t_buscusus.f6663i)) {
                t_buscusus.this.f6661g.cancel();
                t_buscusus t_buscusus2 = t_buscusus.this;
                t_buscusus2.abrir_secc(t_buscusus2.f6660f);
            }
        }
    }

    /* renamed from: british.x.t_buscusus$f */
    class C2133f implements AdDisplayListener {
        C2133f() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_buscusus t_buscusus = t_buscusus.this;
            if (t_buscusus.f8754p0) {
                t_buscusus.abrir_secc(t_buscusus.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.x.t_buscusus$g */
    public class C2134g extends ArrayAdapter<C2136h> {

        /* renamed from: b */
        private Context f8777b;

        /* renamed from: c */
        private int f8778c;

        /* renamed from: d */
        private ArrayList<C2136h> f8779d = new ArrayList<>();

        /* renamed from: british.x.t_buscusus$g$a */
        class C2135a {

            /* renamed from: a */
            TextView f8781a;

            /* renamed from: b */
            TextView f8782b;

            /* renamed from: c */
            ImageView f8783c;

            /* renamed from: d */
            ProgressBar f8784d;

            /* renamed from: e */
            ProgressBar f8785e;

            /* renamed from: f */
            LinearLayout f8786f;

            /* renamed from: g */
            LinearLayout f8787g;

            /* renamed from: h */
            LinearLayout f8788h;

            /* renamed from: i */
            LinearLayout f8789i;

            C2135a() {
            }
        }

        public C2134g(Context context, int i, ArrayList<C2136h> arrayList) {
            super(context, i, arrayList);
            this.f8778c = i;
            this.f8777b = context;
            this.f8779d = arrayList;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:80:0x02a3, code lost:
            if (r12.f8793c.equals(r11.f8780e.f8760s0.getString("fperfil_" + r12.f8791a, com.google.android.exoplayer2.source.rtsp.SessionDescription.SUPPORTED_SDP_VERSION)) == false) goto L_0x02a8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x02ab  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x02c3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
            /*
                r11 = this;
                british.x.t_buscusus r0 = british.p015x.t_buscusus.this
                boolean r1 = r0.f8764w
                r2 = 0
                if (r1 != 0) goto L_0x003a
                java.util.ArrayList<british.x.t_buscusus$h> r0 = r0.f8737R
                int r0 = r0.size()
                int r0 = r0 - r12
                r1 = 10
                if (r0 >= r1) goto L_0x003a
                british.x.t_buscusus r0 = british.p015x.t_buscusus.this
                british.x.t_buscusus$j r0 = r0.f8740U
                if (r0 == 0) goto L_0x0020
                android.os.AsyncTask$Status r0 = r0.getStatus()
                android.os.AsyncTask$Status r1 = android.os.AsyncTask.Status.RUNNING
                if (r0 == r1) goto L_0x003a
            L_0x0020:
                british.x.t_buscusus r0 = british.p015x.t_buscusus.this
                british.x.t_buscusus$j r1 = new british.x.t_buscusus$j
                british.x.t_buscusus r3 = british.p015x.t_buscusus.this
                java.util.ArrayList<british.x.t_buscusus$h> r4 = r3.f8737R
                int r4 = r4.size()
                r1.<init>(r4)
                r0.f8740U = r1
                british.x.t_buscusus r0 = british.p015x.t_buscusus.this
                british.x.t_buscusus$j r0 = r0.f8740U
                java.lang.String[] r1 = new java.lang.String[r2]
                r0.execute(r1)
            L_0x003a:
                british.x.t_buscusus r0 = british.p015x.t_buscusus.this
                int r1 = r0.f8759s
                r3 = 0
                if (r1 <= 0) goto L_0x0065
                boolean r1 = r0.f8720A
                if (r1 == 0) goto L_0x0065
                british.x.t_buscusus$i r0 = r0.f8741V
                if (r0 == 0) goto L_0x0051
                android.os.AsyncTask$Status r0 = r0.getStatus()
                android.os.AsyncTask$Status r1 = android.os.AsyncTask.Status.RUNNING
                if (r0 == r1) goto L_0x0065
            L_0x0051:
                british.x.t_buscusus r0 = british.p015x.t_buscusus.this
                british.x.t_buscusus$i r1 = new british.x.t_buscusus$i
                british.x.t_buscusus r4 = british.p015x.t_buscusus.this
                r1.<init>()
                r0.f8741V = r1
                british.x.t_buscusus r0 = british.p015x.t_buscusus.this
                british.x.t_buscusus$i r0 = r0.f8741V
                java.lang.String[] r1 = new java.lang.String[r2]
                r0.execute(r1)
            L_0x0065:
                if (r13 != 0) goto L_0x00f9
                android.content.Context r13 = r11.f8777b
                android.app.Activity r13 = (android.app.Activity) r13
                android.view.LayoutInflater r13 = r13.getLayoutInflater()
                int r0 = r11.f8778c
                android.view.View r13 = r13.inflate(r0, r14, r2)
                british.x.t_buscusus$g$a r14 = new british.x.t_buscusus$g$a
                r14.<init>()
                r0 = 2131363175(0x7f0a0567, float:1.8346151E38)
                android.view.View r0 = r13.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r14.f8781a = r0
                r0 = 2131363176(0x7f0a0568, float:1.8346153E38)
                android.view.View r0 = r13.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r14.f8782b = r0
                r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
                android.view.View r0 = r13.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r14.f8783c = r0
                r0 = 2131362743(0x7f0a03b7, float:1.8345275E38)
                android.view.View r0 = r13.findViewById(r0)
                android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
                r14.f8784d = r0
                r0 = 2131362746(0x7f0a03ba, float:1.8345281E38)
                android.view.View r0 = r13.findViewById(r0)
                android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
                r14.f8785e = r0
                r0 = 2131362542(0x7f0a02ee, float:1.8344868E38)
                android.view.View r0 = r13.findViewById(r0)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                r14.f8786f = r0
                r0 = 2131362499(0x7f0a02c3, float:1.834478E38)
                android.view.View r0 = r13.findViewById(r0)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                r14.f8787g = r0
                r0 = 2131362498(0x7f0a02c2, float:1.8344778E38)
                android.view.View r0 = r13.findViewById(r0)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                r14.f8788h = r0
                r0 = 2131362482(0x7f0a02b2, float:1.8344746E38)
                android.view.View r0 = r13.findViewById(r0)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                r14.f8789i = r0
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 20
                if (r0 <= r1) goto L_0x00f5
                android.widget.ProgressBar r0 = r14.f8784d
                british.x.t_buscusus r1 = british.p015x.t_buscusus.this
                java.lang.String r1 = r1.f6656b
                british.p015x.C1692config.m8168S0(r0, r1)
                android.widget.ProgressBar r0 = r14.f8785e
                british.x.t_buscusus r1 = british.p015x.t_buscusus.this
                java.lang.String r1 = r1.f6656b
                british.p015x.C1692config.m8168S0(r0, r1)
            L_0x00f5:
                r13.setTag(r14)
                goto L_0x00ff
            L_0x00f9:
                java.lang.Object r14 = r13.getTag()
                british.x.t_buscusus$g$a r14 = (british.p015x.t_buscusus.C2134g.C2135a) r14
            L_0x00ff:
                java.util.ArrayList<british.x.t_buscusus$h> r0 = r11.f8779d
                java.lang.Object r12 = r0.get(r12)
                british.x.t_buscusus$h r12 = (british.p015x.t_buscusus.C2136h) r12
                java.lang.String r0 = r12.f8791a
                java.lang.String r1 = "-1"
                boolean r0 = r0.equals(r1)
                java.lang.String r1 = ""
                r4 = 8
                if (r0 == 0) goto L_0x0154
                android.widget.TextView r12 = r14.f8781a
                r12.setText(r1)
                android.widget.TextView r12 = r14.f8782b
                r12.setText(r1)
                android.widget.ImageView r12 = r14.f8783c
                r12.setImageBitmap(r3)
                android.widget.ProgressBar r12 = r14.f8784d
                r12.setVisibility(r4)
                android.widget.ProgressBar r12 = r14.f8785e
                r12.setVisibility(r4)
                british.x.t_buscusus r12 = british.p015x.t_buscusus.this
                boolean r12 = r12.f8726G
                if (r12 == 0) goto L_0x013a
                android.widget.ProgressBar r12 = r14.f8785e
                r12.setVisibility(r2)
                goto L_0x013f
            L_0x013a:
                android.widget.ProgressBar r12 = r14.f8784d
                r12.setVisibility(r2)
            L_0x013f:
                android.widget.LinearLayout r12 = r14.f8786f
                r12.setVisibility(r4)
                android.widget.LinearLayout r12 = r14.f8787g
                r12.setVisibility(r4)
                android.widget.LinearLayout r12 = r14.f8788h
                r12.setVisibility(r4)
                android.widget.LinearLayout r12 = r14.f8789i
                r12.setVisibility(r4)
                return r13
            L_0x0154:
                british.x.t_buscusus r0 = british.p015x.t_buscusus.this
                int r5 = r0.f8759s
                if (r5 != 0) goto L_0x0163
                android.widget.LinearLayout r5 = r14.f8786f
                int r6 = r0.f8731L
                int r0 = r0.f8732M
                r5.setPadding(r6, r0, r6, r0)
            L_0x0163:
                android.widget.LinearLayout r0 = r14.f8786f
                r0.setVisibility(r2)
                boolean r0 = r12.f8805o
                if (r0 == 0) goto L_0x0177
                android.widget.LinearLayout r0 = r14.f8788h
                r0.setVisibility(r4)
                android.widget.LinearLayout r0 = r14.f8787g
                r0.setVisibility(r2)
                goto L_0x0181
            L_0x0177:
                android.widget.LinearLayout r0 = r14.f8787g
                r0.setVisibility(r4)
                android.widget.LinearLayout r0 = r14.f8788h
                r0.setVisibility(r4)
            L_0x0181:
                boolean r0 = r12.f8806p
                if (r0 == 0) goto L_0x018b
                android.widget.LinearLayout r0 = r14.f8789i
                r0.setVisibility(r2)
                goto L_0x0190
            L_0x018b:
                android.widget.LinearLayout r0 = r14.f8789i
                r0.setVisibility(r4)
            L_0x0190:
                android.widget.TextView r0 = r14.f8781a
                java.lang.String r5 = r12.f8792b
                r0.setText(r5)
                british.x.t_buscusus r0 = british.p015x.t_buscusus.this
                int r5 = r0.f8751o
                r6 = 1
                if (r5 > 0) goto L_0x01a2
                int r0 = r0.f8757r
                if (r0 != r6) goto L_0x0260
            L_0x01a2:
                if (r5 <= 0) goto L_0x01ca
                int r0 = r12.f8801k
                if (r0 <= 0) goto L_0x01ca
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                int r5 = r12.f8801k
                r0.append(r5)
                british.x.t_buscusus r5 = british.p015x.t_buscusus.this
                android.content.res.Resources r5 = r5.getResources()
                r7 = 2131820590(0x7f11002e, float:1.92739E38)
                java.lang.String r5 = r5.getString(r7)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                goto L_0x01cb
            L_0x01ca:
                r0 = r1
            L_0x01cb:
                british.x.t_buscusus r5 = british.p015x.t_buscusus.this
                int r5 = r5.f8757r
                if (r5 != r6) goto L_0x0256
                java.lang.String r5 = r12.f8800j
                boolean r5 = r5.equals(r1)
                if (r5 != 0) goto L_0x0256
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L_0x01f0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.String r0 = r1.toString()
            L_0x01f0:
                java.lang.String r1 = r12.f8800j
                int r1 = java.lang.Integer.parseInt(r1)
                int r1 = r1 / 1000
                british.x.t_buscusus r5 = british.p015x.t_buscusus.this
                java.lang.String r5 = r5.f8735P
                java.lang.String r7 = "US"
                boolean r5 = r5.equals(r7)
                if (r5 != 0) goto L_0x0220
                british.x.t_buscusus r5 = british.p015x.t_buscusus.this
                java.lang.String r5 = r5.f8735P
                java.lang.String r7 = "GB"
                boolean r5 = r5.equals(r7)
                if (r5 != 0) goto L_0x0220
                british.x.t_buscusus r5 = british.p015x.t_buscusus.this
                java.lang.String r5 = r5.f8735P
                java.lang.String r7 = "MM"
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L_0x021d
                goto L_0x0220
            L_0x021d:
                java.lang.String r5 = "km."
                goto L_0x022d
            L_0x0220:
                double r7 = (double) r1
                r9 = 4609884578576439706(0x3ff999999999999a, double:1.6)
                java.lang.Double.isNaN(r7)
                double r7 = r7 / r9
                int r1 = (int) r7
                java.lang.String r5 = "mi."
            L_0x022d:
                if (r1 != 0) goto L_0x0244
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = "<1"
                r1.append(r0)
                r1.append(r5)
                java.lang.String r0 = r1.toString()
                goto L_0x0256
            L_0x0244:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r0)
                r7.append(r1)
                r7.append(r5)
                java.lang.String r0 = r7.toString()
            L_0x0256:
                android.widget.TextView r1 = r14.f8782b
                r1.setText(r0)
                android.widget.TextView r0 = r14.f8782b
                r0.setVisibility(r2)
            L_0x0260:
                android.widget.ProgressBar r0 = r14.f8784d
                r0.setVisibility(r4)
                android.widget.ProgressBar r0 = r14.f8785e
                r0.setVisibility(r4)
                british.x.t_buscusus r0 = british.p015x.t_buscusus.this
                int r0 = r0.f8759s
                if (r0 <= 0) goto L_0x032c
                boolean r0 = r12.f8803m
                java.lang.String r1 = "fperfil_"
                java.lang.String r4 = "0"
                if (r0 != 0) goto L_0x02a8
                boolean r0 = r12.f8802l
                if (r0 == 0) goto L_0x02a6
                java.lang.String r0 = r12.f8793c
                boolean r0 = r0.equals(r4)
                if (r0 != 0) goto L_0x02a6
                java.lang.String r0 = r12.f8793c
                british.x.t_buscusus r5 = british.p015x.t_buscusus.this
                android.content.SharedPreferences r5 = r5.f8760s0
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r1)
                java.lang.String r8 = r12.f8791a
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                java.lang.String r5 = r5.getString(r7, r4)
                boolean r0 = r0.equals(r5)
                if (r0 != 0) goto L_0x02a6
                goto L_0x02a8
            L_0x02a6:
                r0 = 0
                goto L_0x02a9
            L_0x02a8:
                r0 = 1
            L_0x02a9:
                if (r0 == 0) goto L_0x02c3
                android.widget.ImageView r12 = r14.f8783c
                r12.setImageBitmap(r3)
                british.x.t_buscusus r12 = british.p015x.t_buscusus.this
                boolean r12 = r12.f8726G
                if (r12 == 0) goto L_0x02bd
                android.widget.ProgressBar r12 = r14.f8785e
                r12.setVisibility(r2)
                goto L_0x0331
            L_0x02bd:
                android.widget.ProgressBar r12 = r14.f8784d
                r12.setVisibility(r2)
                goto L_0x0331
            L_0x02c3:
                british.x.t_buscusus r0 = british.p015x.t_buscusus.this
                british.x.config r2 = r0.f8761t
                british.x.l[] r2 = r2.f7231O1
                int r0 = r0.f8749n
                r0 = r2[r0]
                int r0 = r0.f7849B0
                if (r0 <= 0) goto L_0x0317
                java.lang.String r0 = r12.f8793c
                boolean r0 = r0.equals(r4)
                if (r0 != 0) goto L_0x0317
                java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0312 }
                british.x.t_buscusus r2 = british.p015x.t_buscusus.this     // Catch:{ Exception -> 0x0312 }
                java.io.File r2 = r2.f8743X     // Catch:{ Exception -> 0x0312 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0312 }
                r3.<init>()     // Catch:{ Exception -> 0x0312 }
                r3.append(r1)     // Catch:{ Exception -> 0x0312 }
                java.lang.String r1 = r12.f8791a     // Catch:{ Exception -> 0x0312 }
                r3.append(r1)     // Catch:{ Exception -> 0x0312 }
                java.lang.String r1 = ".jpg"
                r3.append(r1)     // Catch:{ Exception -> 0x0312 }
                java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0312 }
                r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0312 }
                boolean r1 = r0.exists()     // Catch:{ Exception -> 0x0312 }
                if (r1 == 0) goto L_0x030d
                british.x.t_buscusus r1 = british.p015x.t_buscusus.this     // Catch:{ Exception -> 0x0312 }
                android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ Exception -> 0x0312 }
                android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ Exception -> 0x0312 }
                android.graphics.Bitmap r0 = android.provider.MediaStore.Images.Media.getBitmap(r1, r0)     // Catch:{ Exception -> 0x0312 }
                goto L_0x031b
            L_0x030d:
                british.x.t_buscusus r0 = british.p015x.t_buscusus.this     // Catch:{ Exception -> 0x0312 }
                android.graphics.Bitmap r0 = r0.f8736Q     // Catch:{ Exception -> 0x0312 }
                goto L_0x031b
            L_0x0312:
                british.x.t_buscusus r0 = british.p015x.t_buscusus.this
                android.graphics.Bitmap r0 = r0.f8736Q
                goto L_0x031b
            L_0x0317:
                british.x.t_buscusus r0 = british.p015x.t_buscusus.this
                android.graphics.Bitmap r0 = r0.f8736Q
            L_0x031b:
                android.widget.ImageView r1 = r14.f8783c
                r1.setImageBitmap(r0)
                boolean r0 = r12.f8804n
                if (r0 != 0) goto L_0x0331
                r12.f8804n = r6
                android.widget.ImageView r12 = r14.f8783c
                british.p015x.C1692config.m8172V(r12)
                goto L_0x0331
            L_0x032c:
                android.widget.ImageView r12 = r14.f8783c
                r12.setVisibility(r4)
            L_0x0331:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_buscusus.C2134g.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: british.x.t_buscusus$h */
    private class C2136h {

        /* renamed from: a */
        String f8791a;

        /* renamed from: b */
        String f8792b;

        /* renamed from: c */
        String f8793c;

        /* renamed from: d */
        String f8794d;

        /* renamed from: e */
        String f8795e;

        /* renamed from: f */
        String f8796f;

        /* renamed from: g */
        String f8797g;

        /* renamed from: h */
        String f8798h;

        /* renamed from: i */
        String f8799i;

        /* renamed from: j */
        String f8800j;

        /* renamed from: k */
        int f8801k;

        /* renamed from: l */
        boolean f8802l;

        /* renamed from: m */
        boolean f8803m;

        /* renamed from: n */
        boolean f8804n;

        /* renamed from: o */
        boolean f8805o;

        /* renamed from: p */
        boolean f8806p;

        private C2136h() {
            this.f8802l = true;
            this.f8803m = false;
            this.f8804n = false;
            this.f8805o = false;
            this.f8806p = false;
        }
    }

    /* renamed from: british.x.t_buscusus$i */
    private class C2137i extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f8808a;

        /* renamed from: b */
        String f8809b;

        /* renamed from: c */
        Bitmap f8810c;

        /* renamed from: d */
        int f8811d;

        private C2137i() {
            this.f8811d = -1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            if (this.f8808a == null) {
                return "-1";
            }
            try {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(C1692config.f7108H5 + "/srv/imgs/usus/" + this.f8808a + "_1_p.jpg?v=" + this.f8809b).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    this.f8810c = BitmapFactory.decodeStream(inputStream);
                    inputStream.close();
                    httpURLConnection.disconnect();
                    File file = t_buscusus.this.f8743X;
                    try {
                        this.f8810c.compress(Bitmap.CompressFormat.JPEG, 70, new FileOutputStream(new File(file, "fperfil_" + this.f8808a + ".jpg")));
                        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return SessionDescription.SUPPORTED_SDP_VERSION;
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return SessionDescription.SUPPORTED_SDP_VERSION;
                }
            } catch (MalformedURLException unused) {
                return SessionDescription.SUPPORTED_SDP_VERSION;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            ArrayList<C2136h> arrayList;
            int i = this.f8811d;
            if (!(i == -1 || (arrayList = t_buscusus.this.f8737R) == null)) {
                try {
                    arrayList.get(i).f8803m = false;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            if (this.f8808a != null && !str.equals("-1")) {
                if (str == IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) {
                    SharedPreferences.Editor edit = t_buscusus.this.f8760s0.edit();
                    edit.putString("fperfil_" + this.f8808a, this.f8809b);
                    edit.commit();
                }
                t_buscusus.this.f8739T.notifyDataSetChanged();
                new C2137i().execute(new String[0]);
            } else if (!str.equals("-1")) {
                t_buscusus.this.f8739T.notifyDataSetChanged();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            int firstVisiblePosition = t_buscusus.this.f8738S.getFirstVisiblePosition();
            while (firstVisiblePosition <= Math.max(t_buscusus.this.f8738S.getLastVisiblePosition(), 30) && (r1 = t_buscusus.this.f8737R) != null && firstVisiblePosition < r1.size()) {
                if (t_buscusus.this.f8737R.get(firstVisiblePosition).f8802l && !t_buscusus.this.f8737R.get(firstVisiblePosition).f8793c.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                    String str = t_buscusus.this.f8737R.get(firstVisiblePosition).f8793c;
                    SharedPreferences sharedPreferences = t_buscusus.this.f8760s0;
                    if (!str.equals(sharedPreferences.getString("fperfil_" + t_buscusus.this.f8737R.get(firstVisiblePosition).f8791a, SessionDescription.SUPPORTED_SDP_VERSION))) {
                        this.f8808a = t_buscusus.this.f8737R.get(firstVisiblePosition).f8791a + "";
                        this.f8809b = t_buscusus.this.f8737R.get(firstVisiblePosition).f8793c;
                        t_buscusus.this.f8737R.get(firstVisiblePosition).f8803m = true;
                        t_buscusus.this.f8737R.get(firstVisiblePosition).f8802l = false;
                        this.f8811d = firstVisiblePosition;
                        return;
                    }
                }
                firstVisiblePosition++;
            }
        }
    }

    /* renamed from: british.x.t_buscusus$j */
    private class C2138j extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f8813a;

        /* renamed from: british.x.t_buscusus$j$a */
        class C2139a implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f8815a;

            C2139a(AlertDialog alertDialog) {
                this.f8815a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f8815a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + t_buscusus.this.f6656b));
            }
        }

        C2138j(int i) {
            this.f8813a = i;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0139  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                british.x.t_buscusus r7 = british.p015x.t_buscusus.this
                java.lang.String r7 = r7.f8735P
                java.lang.String r0 = "US"
                boolean r7 = r7.equals(r0)
                if (r7 != 0) goto L_0x0028
                british.x.t_buscusus r7 = british.p015x.t_buscusus.this
                java.lang.String r7 = r7.f8735P
                java.lang.String r0 = "GB"
                boolean r7 = r7.equals(r0)
                if (r7 != 0) goto L_0x0028
                british.x.t_buscusus r7 = british.p015x.t_buscusus.this
                java.lang.String r7 = r7.f8735P
                java.lang.String r0 = "MM"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x0025
                goto L_0x0028
            L_0x0025:
                java.lang.String r7 = "km"
                goto L_0x002a
            L_0x0028:
                java.lang.String r7 = "mi"
            L_0x002a:
                r0 = 0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0135 }
                r1.<init>()     // Catch:{ Exception -> 0x0135 }
                java.lang.String r2 = british.p015x.C1692config.f7109I5     // Catch:{ Exception -> 0x0135 }
                r1.append(r2)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r2 = "/srv/obtener_usus.php?idusu="
                r1.append(r2)     // Catch:{ Exception -> 0x0135 }
                british.x.t_buscusus r2 = british.p015x.t_buscusus.this     // Catch:{ Exception -> 0x0135 }
                long r2 = r2.f8747m     // Catch:{ Exception -> 0x0135 }
                r1.append(r2)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r2 = "&c="
                r1.append(r2)     // Catch:{ Exception -> 0x0135 }
                british.x.t_buscusus r2 = british.p015x.t_buscusus.this     // Catch:{ Exception -> 0x0135 }
                java.lang.String r2 = r2.f8734O     // Catch:{ Exception -> 0x0135 }
                r1.append(r2)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r2 = "&ind_ini="
                r1.append(r2)     // Catch:{ Exception -> 0x0135 }
                int r2 = r6.f8813a     // Catch:{ Exception -> 0x0135 }
                r1.append(r2)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r2 = "&accext="
                r1.append(r2)     // Catch:{ Exception -> 0x0135 }
                british.x.t_buscusus r2 = british.p015x.t_buscusus.this     // Catch:{ Exception -> 0x0135 }
                british.x.config r3 = r2.f8761t     // Catch:{ Exception -> 0x0135 }
                british.x.l[] r3 = r3.f7231O1     // Catch:{ Exception -> 0x0135 }
                int r2 = r2.f8749n     // Catch:{ Exception -> 0x0135 }
                r2 = r3[r2]     // Catch:{ Exception -> 0x0135 }
                boolean r2 = r2.f7890W     // Catch:{ Exception -> 0x0135 }
                r3 = 1
                if (r2 == 0) goto L_0x006d
                r2 = 1
                goto L_0x006e
            L_0x006d:
                r2 = 0
            L_0x006e:
                r1.append(r2)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r2 = "&idsec="
                r1.append(r2)     // Catch:{ Exception -> 0x0135 }
                british.x.t_buscusus r2 = british.p015x.t_buscusus.this     // Catch:{ Exception -> 0x0135 }
                british.x.config r4 = r2.f8761t     // Catch:{ Exception -> 0x0135 }
                british.x.l[] r4 = r4.f7231O1     // Catch:{ Exception -> 0x0135 }
                int r2 = r2.f8749n     // Catch:{ Exception -> 0x0135 }
                r2 = r4[r2]     // Catch:{ Exception -> 0x0135 }
                int r2 = r2.f7964y     // Catch:{ Exception -> 0x0135 }
                r1.append(r2)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0135 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0135 }
                r2.<init>()     // Catch:{ Exception -> 0x0135 }
                r2.append(r1)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r1 = "&fdist_v="
                r2.append(r1)     // Catch:{ Exception -> 0x0135 }
                british.x.t_buscusus r1 = british.p015x.t_buscusus.this     // Catch:{ Exception -> 0x0135 }
                int r1 = r1.f8728I     // Catch:{ Exception -> 0x0135 }
                r2.append(r1)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r1 = "&fdist_u="
                r2.append(r1)     // Catch:{ Exception -> 0x0135 }
                r2.append(r7)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r7 = "&fsexo_v="
                r2.append(r7)     // Catch:{ Exception -> 0x0135 }
                british.x.t_buscusus r7 = british.p015x.t_buscusus.this     // Catch:{ Exception -> 0x0135 }
                int r7 = r7.f8727H     // Catch:{ Exception -> 0x0135 }
                r2.append(r7)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r7 = "&fedad1_v="
                r2.append(r7)     // Catch:{ Exception -> 0x0135 }
                british.x.t_buscusus r7 = british.p015x.t_buscusus.this     // Catch:{ Exception -> 0x0135 }
                int r7 = r7.f8729J     // Catch:{ Exception -> 0x0135 }
                r2.append(r7)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r7 = "&fedad2_v="
                r2.append(r7)     // Catch:{ Exception -> 0x0135 }
                british.x.t_buscusus r7 = british.p015x.t_buscusus.this     // Catch:{ Exception -> 0x0135 }
                int r7 = r7.f8730K     // Catch:{ Exception -> 0x0135 }
                r2.append(r7)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r7 = "&fnick_v="
                r2.append(r7)     // Catch:{ Exception -> 0x0135 }
                british.x.t_buscusus r7 = british.p015x.t_buscusus.this     // Catch:{ Exception -> 0x0135 }
                java.lang.String r7 = r7.f8733N     // Catch:{ Exception -> 0x0135 }
                r2.append(r7)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r7 = r2.toString()     // Catch:{ Exception -> 0x0135 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0135 }
                r1.<init>(r7)     // Catch:{ Exception -> 0x0135 }
                java.net.URLConnection r7 = r1.openConnection()     // Catch:{ Exception -> 0x0135 }
                java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ Exception -> 0x0135 }
                r7.setDoInput(r3)     // Catch:{ Exception -> 0x012e, all -> 0x012c }
                r0 = 10000(0x2710, float:1.4013E-41)
                r7.setConnectTimeout(r0)     // Catch:{ Exception -> 0x012e, all -> 0x012c }
                r7.setReadTimeout(r0)     // Catch:{ Exception -> 0x012e, all -> 0x012c }
                java.lang.String r0 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r7.setRequestProperty(r0, r1)     // Catch:{ Exception -> 0x012e, all -> 0x012c }
                java.io.InputStream r0 = r7.getInputStream()     // Catch:{ Exception -> 0x012e, all -> 0x012c }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x012e, all -> 0x012c }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x012e, all -> 0x012c }
                r2.<init>(r0)     // Catch:{ Exception -> 0x012e, all -> 0x012c }
                r1.<init>(r2)     // Catch:{ Exception -> 0x012e, all -> 0x012c }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012e, all -> 0x012c }
                r0.<init>()     // Catch:{ Exception -> 0x012e, all -> 0x012c }
            L_0x0109:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x012e, all -> 0x012c }
                if (r2 == 0) goto L_0x0124
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012e, all -> 0x012c }
                r3.<init>()     // Catch:{ Exception -> 0x012e, all -> 0x012c }
                r3.append(r2)     // Catch:{ Exception -> 0x012e, all -> 0x012c }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x012e, all -> 0x012c }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x012e, all -> 0x012c }
                r0.append(r2)     // Catch:{ Exception -> 0x012e, all -> 0x012c }
                goto L_0x0109
            L_0x0124:
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x012e, all -> 0x012c }
                r7.disconnect()
                return r0
            L_0x012c:
                r0 = move-exception
                goto L_0x013d
            L_0x012e:
                r0 = r7
                goto L_0x0135
            L_0x0130:
                r7 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
                goto L_0x013d
            L_0x0135:
                java.lang.String r7 = ""
                if (r0 == 0) goto L_0x013c
                r0.disconnect()
            L_0x013c:
                return r7
            L_0x013d:
                if (r7 == 0) goto L_0x0142
                r7.disconnect()
            L_0x0142:
                goto L_0x0144
            L_0x0143:
                throw r0
            L_0x0144:
                goto L_0x0143
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_buscusus.C2138j.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            String str2;
            C2137i iVar;
            int i;
            String str3 = str;
            ArrayList<C2136h> arrayList = t_buscusus.this.f8737R;
            if (arrayList != null && arrayList.get(arrayList.size() - 1).f8791a.equals("-1")) {
                ArrayList<C2136h> arrayList2 = t_buscusus.this.f8737R;
                arrayList2.remove(arrayList2.size() - 1);
                t_buscusus.this.f8739T.notifyDataSetChanged();
            }
            if (str3.contains("ANDROID:OK DATOS:")) {
                char c = 6;
                String[] split = str3.substring(str3.indexOf("DATOS:") + 6).split(";");
                SharedPreferences.Editor edit = t_buscusus.this.f8760s0.edit();
                char c2 = 0;
                int i2 = 0;
                while (true) {
                    str2 = "";
                    if (split[i2].equals("S") || split[i2].equals("N")) {
                        edit.commit();
                    } else {
                        String[] split2 = split[i2].split("@");
                        C2136h hVar = new C2136h();
                        hVar.f8791a = split2[c2];
                        hVar.f8792b = split2[1];
                        hVar.f8793c = split2[2];
                        hVar.f8794d = split2[3];
                        String str4 = split2[4];
                        hVar.f8796f = str4;
                        hVar.f8797g = split2[5];
                        hVar.f8798h = split2[c];
                        if (str4.equals(SessionDescription.SUPPORTED_SDP_VERSION) || hVar.f8797g.equals(SessionDescription.SUPPORTED_SDP_VERSION) || hVar.f8798h.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                            i = 0;
                        } else {
                            Calendar instance = Calendar.getInstance();
                            instance.set(Integer.parseInt(hVar.f8798h), Integer.parseInt(hVar.f8797g) - 1, Integer.parseInt(hVar.f8796f));
                            Calendar instance2 = Calendar.getInstance();
                            i = instance2.get(1) - instance.get(1);
                            if (instance.get(2) > instance2.get(2) || (instance.get(2) == instance2.get(2) && instance.get(5) > instance2.get(5))) {
                                i--;
                            }
                        }
                        hVar.f8801k = i;
                        hVar.f8799i = split2[7];
                        hVar.f8795e = split2[8];
                        if (!split2[9].equals("-1")) {
                            str2 = split2[9];
                        }
                        hVar.f8800j = str2;
                        boolean equals = split2[10].equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                        hVar.f8805o = equals;
                        if (equals) {
                            edit.putBoolean("usufav_" + hVar.f8791a, true);
                        } else {
                            edit.remove("usufav_" + hVar.f8791a);
                        }
                        hVar.f8806p = split2[11].equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                        t_buscusus.this.f8737R.add(hVar);
                        i2++;
                        c = 6;
                        c2 = 0;
                    }
                }
                edit.commit();
                if (split[i2].equals("N")) {
                    t_buscusus.this.f8764w = true;
                }
                t_buscusus.this.f8739T.notifyDataSetChanged();
                if (i2 > 0 && ((iVar = t_buscusus.this.f8741V) == null || iVar.getStatus() != AsyncTask.Status.RUNNING)) {
                    t_buscusus t_buscusus = t_buscusus.this;
                    t_buscusus.f8741V = new C2137i();
                    t_buscusus.this.f8741V.execute(new String[0]);
                    t_buscusus.this.f8720A = true;
                }
                if (t_buscusus.this.f8737R.isEmpty()) {
                    AlertDialog create = new AlertDialog.Builder(t_buscusus.this).setPositiveButton(R.string.aceptar, (DialogInterface.OnClickListener) null).setMessage(R.string.sin_usus).create();
                    if (!t_buscusus.this.f6656b.equals(str2)) {
                        create.setOnShowListener(new C2139a(create));
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
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (!t_buscusus.this.f8737R.isEmpty()) {
                ArrayList<C2136h> arrayList = t_buscusus.this.f8737R;
                if (arrayList.get(arrayList.size() - 1).f8791a.equals("-1")) {
                    return;
                }
            }
            C2136h hVar = new C2136h();
            hVar.f8791a = "-1";
            hVar.f8793c = SessionDescription.SUPPORTED_SDP_VERSION;
            t_buscusus.this.f8737R.add(hVar);
            t_buscusus.this.f8739T.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    private void m8611b(Context context) {
        this.f6662h = new C2130e(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Dialog mo8275a() {
        Dialog dialog = new Dialog(this);
        if (getResources().getConfiguration().orientation == 2) {
            dialog.setContentView(R.layout.filtros_h);
        } else {
            dialog.setContentView(R.layout.filtros);
        }
        dialog.setTitle(getResources().getString(R.string.selecciona));
        TextView textView = (TextView) dialog.findViewById(R.id.btn_aceptar);
        textView.setOnClickListener(new C2129d());
        if (Build.VERSION.SDK_INT > 20) {
            textView.setTextColor(Color.parseColor("#" + this.f6656b));
        }
        if (this.f8724E) {
            Spinner spinner = (Spinner) dialog.findViewById(R.id.sp_edad1);
            ArrayList arrayList = new ArrayList();
            arrayList.add(getResources().getString(R.string.edad_min));
            arrayList.add(getResources().getString(R.string.todo));
            arrayList.add(">18" + getResources().getString(R.string.anyos_abrev));
            int i = 25;
            int i2 = -1;
            for (int i3 = 76; i < i3; i3 = 76) {
                arrayList.add(">" + i + getResources().getString(R.string.anyos_abrev));
                if (this.f8729J == i) {
                    i2 = arrayList.size() - 1;
                }
                i += 5;
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, arrayList);
            arrayAdapter.setDropDownViewResource(17367049);
            spinner.setAdapter(arrayAdapter);
            if (i2 != -1) {
                spinner.setSelection(i2);
            } else if (this.f8729J == 18) {
                spinner.setSelection(2);
            } else {
                spinner.setSelection(0);
            }
            spinner.setVisibility(0);
        }
        if (this.f8725F) {
            Spinner spinner2 = (Spinner) dialog.findViewById(R.id.sp_edad2);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(getResources().getString(R.string.edad_max));
            arrayList2.add(getResources().getString(R.string.todo));
            arrayList2.add("<18" + getResources().getString(R.string.anyos_abrev));
            int i4 = -1;
            for (int i5 = 25; i5 < 76; i5 += 5) {
                arrayList2.add("<" + i5 + getResources().getString(R.string.anyos_abrev));
                if (this.f8730K == i5) {
                    i4 = arrayList2.size() - 1;
                }
            }
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, 17367048, arrayList2);
            arrayAdapter2.setDropDownViewResource(17367049);
            spinner2.setAdapter(arrayAdapter2);
            if (i4 != -1) {
                spinner2.setSelection(i4);
            } else if (this.f8730K == 18) {
                spinner2.setSelection(2);
            } else {
                spinner2.setSelection(0);
            }
            spinner2.setVisibility(0);
        }
        if (this.f8721B) {
            Spinner spinner3 = (Spinner) dialog.findViewById(R.id.sp_sexo);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(getResources().getString(R.string.petic_sexo));
            arrayList3.add(getResources().getString(R.string.todo));
            arrayList3.add(getResources().getString(R.string.hombres));
            arrayList3.add(getResources().getString(R.string.mujeres));
            ArrayAdapter arrayAdapter3 = new ArrayAdapter(this, 17367048, arrayList3);
            arrayAdapter3.setDropDownViewResource(17367049);
            spinner3.setAdapter(arrayAdapter3);
            int i6 = this.f8727H;
            if (i6 == 1) {
                spinner3.setSelection(2);
            } else if (i6 == 2) {
                spinner3.setSelection(3);
            } else {
                spinner3.setSelection(0);
            }
            spinner3.setVisibility(0);
        }
        if (this.f8722C) {
            dialog.findViewById(R.id.tv_nick).setVisibility(0);
        }
        if (this.f8723D) {
            Spinner spinner4 = (Spinner) dialog.findViewById(R.id.sp_dist);
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(getResources().getString(R.string.dist));
            arrayList4.add(getResources().getString(R.string.todo));
            String str = (this.f8735P.equals("US") || this.f8735P.equals("GB") || this.f8735P.equals("MM")) ? "mi." : "km.";
            arrayList4.add("<1" + str);
            arrayList4.add("<2" + str);
            arrayList4.add("<5" + str);
            arrayList4.add("<10" + str);
            arrayList4.add("<20" + str);
            arrayList4.add("<50" + str);
            arrayList4.add("<100" + str);
            arrayList4.add("<200" + str);
            arrayList4.add("<500" + str);
            ArrayAdapter arrayAdapter4 = new ArrayAdapter(this, 17367048, arrayList4);
            arrayAdapter4.setDropDownViewResource(17367049);
            spinner4.setAdapter(arrayAdapter4);
            int i7 = this.f8728I;
            if (i7 == 1) {
                spinner4.setSelection(2);
            } else if (i7 == 2) {
                spinner4.setSelection(3);
            } else if (i7 == 5) {
                spinner4.setSelection(4);
            } else if (i7 == 10) {
                spinner4.setSelection(5);
            } else if (i7 == 20) {
                spinner4.setSelection(6);
            } else if (i7 == 50) {
                spinner4.setSelection(7);
            } else if (i7 == 100) {
                spinner4.setSelection(8);
            } else if (i7 == 200) {
                spinner4.setSelection(9);
            } else if (i7 == 500) {
                spinner4.setSelection(10);
            } else {
                spinner4.setSelection(0);
            }
            spinner4.setVisibility(0);
        }
        return dialog;
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f8761t.mo7510j0(view, this);
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
                    if (this.f8761t.f7427t4 != 2) {
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

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8276c() {
        int q0 = this.f8761t.mo7522q0(this);
        int i = this.f8761t.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f8758r0 = listView;
            this.f8761t.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f8761t.f7231O1;
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
            int[] iArr = this.f8761t.f7249R1;
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
    /* renamed from: d */
    public void mo8277d() {
        boolean z;
        int i;
        int i2;
        if (this.f8721B || this.f8723D || this.f8724E || this.f8725F || this.f8722C) {
            findViewById(R.id.ll_filtros).setOnClickListener(this);
            findViewById(R.id.ll_filtros).setVisibility(0);
            boolean z2 = true;
            if (!this.f8721B || (i2 = this.f8727H) == 0) {
                this.f8744Y.setVisibility(8);
                z = false;
            } else {
                if (i2 == 1) {
                    this.f8744Y.setText(getResources().getString(R.string.hombres));
                } else {
                    this.f8744Y.setText(getResources().getString(R.string.mujeres));
                }
                this.f8744Y.setVisibility(0);
                z = true;
            }
            if (!this.f8722C || this.f8733N.equals("")) {
                this.f8745Z.setVisibility(8);
            } else {
                this.f8745Z.setText(this.f8733N);
                this.f8745Z.setVisibility(0);
                z = true;
            }
            if (!this.f8723D || (i = this.f8728I) == 0) {
                this.f8746l0.setVisibility(8);
            } else {
                long j = (long) i;
                String str = (this.f8735P.equals("US") || this.f8735P.equals("GB") || this.f8735P.equals("MM")) ? "mi." : "km.";
                TextView textView = this.f8746l0;
                textView.setText(j + " " + str);
                this.f8746l0.setVisibility(0);
                z = true;
            }
            if (!this.f8724E || this.f8729J == 0) {
                this.f8748m0.setVisibility(8);
            } else {
                TextView textView2 = this.f8748m0;
                textView2.setText(">" + this.f8729J + getResources().getString(R.string.anyos_abrev));
                this.f8748m0.setVisibility(0);
                z = true;
            }
            if (!this.f8725F || this.f8730K == 0) {
                this.f8750n0.setVisibility(8);
                z2 = z;
            } else {
                TextView textView3 = this.f8750n0;
                textView3.setText("<" + this.f8730K + getResources().getString(R.string.anyos_abrev));
                this.f8750n0.setVisibility(0);
            }
            if (z2) {
                findViewById(R.id.tv_filtrar).setVisibility(8);
            } else {
                findViewById(R.id.tv_filtrar).setVisibility(0);
            }
        } else {
            findViewById(R.id.ll_filtros).setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z = false;
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f6659e = false;
            }
            setResult(-1, intent);
            finish();
            z = true;
        }
        if (!z && this.f8762u) {
            finish();
        }
    }

    public void onAdClicked(C3371Ad ad) {
    }

    public void onAdClosed() {
        if (this.f8754p0) {
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
        if (!this.f6659e || this.f8763v || !this.f8761t.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f8763v = true;
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
        if (view.getId() == R.id.ll_filtros) {
            this.f8742W.show();
        } else if (view.getId() == R.id.btnperfil) {
            Intent intent = new Intent(this, preperfil.class);
            intent.putExtra("idsecc", this.f8761t.f7231O1[this.f8749n].f7964y);
            intent.putExtra("nocompletar", true);
            intent.putExtra("desde_buscusus", true);
            startActivityForResult(intent, 0);
        } else {
            String str9 = this.f8761t.f7251R3;
            if ((str9 == null || str9.equals("")) && (((str = this.f8761t.f7281W3) == null || str.equals("")) && (((str2 = this.f8761t.f7250R2) == null || str2.equals("")) && (((str3 = this.f8761t.f7245Q3) == null || str3.equals("")) && (((str4 = this.f8761t.f7269U3) == null || str4.equals("")) && (((str5 = this.f8761t.f7275V3) == null || str5.equals("")) && (((str6 = this.f8761t.f7358j4) == null || str6.equals("")) && (((str7 = this.f8761t.f7287X3) == null || str7.equals("")) && ((str8 = this.f8761t.f7293Y3) == null || str8.equals("")))))))))) {
                abrir_secc(view);
                return;
            }
            String str10 = this.f8761t.f7251R3;
            if (str10 != null && !str10.equals("")) {
                this.f6663i = new RewardedVideo((Context) this, this.f8761t.f7251R3);
            }
            String str11 = this.f8761t.f7245Q3;
            if (str11 != null) {
                str11.equals("");
            }
            String str12 = this.f8761t.f7269U3;
            if (str12 != null && !str12.equals("")) {
                this.f6664j = new RewardedVideoAd(this, this.f8761t.f7269U3);
            }
            String str13 = this.f8761t.f7275V3;
            if (str13 != null && !str13.equals("")) {
                this.f6665k = new StartAppAd(this);
            }
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f6661g = progressDialog;
            this.f6660f = view;
            if (!this.f8761t.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
                abrir_secc(view);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo8276c();
        this.f8742W.dismiss();
        this.f8742W = mo8275a();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f8752o0;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f8752o0;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f8752o0 = this.f8761t.mo7474A0(this, false);
    }

    public void onCreate(Bundle bundle) {
        C1692config config = (C1692config) getApplicationContext();
        this.f8761t = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8611b(this);
        this.f6666l = new C2126a();
        C1692config config2 = this.f8761t;
        C1855l[] lVarArr = config2.f7231O1;
        int i = config2.f7318d;
        String str = lVarArr[i].f7916g;
        String str2 = lVarArr[i].f7919h;
        this.f8726G = C1692config.m8153I("#" + str);
        this.f6656b = C1692config.m8189h(str, this.f8761t.f7368l1);
        if (Build.VERSION.SDK_INT > 12 && !this.f8726G) {
            setTheme(R.style.holonolight);
        }
        Bundle extras = getIntent().getExtras();
        this.f8756q0 = extras;
        if (bundle == null) {
            this.f6659e = extras != null && extras.containsKey("es_root") && this.f8756q0.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f8749n = this.f8761t.f7318d;
        this.f8743X = getFilesDir();
        super.onCreate(bundle);
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f8760s0 = sharedPreferences;
        this.f8747m = sharedPreferences.getLong("idusu", 0);
        this.f8734O = this.f8760s0.getString("cod", "");
        float f = getResources().getDisplayMetrics().density;
        this.f8731L = (int) ((5.0f * f) + 0.5f);
        this.f8732M = (int) ((f * 15.0f) + 0.5f);
        this.f8735P = Locale.getDefault().getCountry();
        C1855l[] lVarArr2 = this.f8761t.f7231O1;
        int i2 = this.f8749n;
        this.f8751o = lVarArr2[i2].f7851C0;
        this.f8753p = lVarArr2[i2].f7853D0;
        this.f8755q = lVarArr2[i2].f7855E0;
        this.f8757r = lVarArr2[i2].f7857F0;
        this.f8765x = lVarArr2[i2].f7886U;
        this.f8766y = lVarArr2[i2].f7888V;
        this.f8767z = lVarArr2[i2].f7884T;
        this.f8759s = lVarArr2[i2].f7849B0;
        this.f8721B = lVarArr2[i2].f7894Y;
        this.f8722C = lVarArr2[i2].f7896Z;
        boolean z = lVarArr2[i2].f7892X;
        this.f8723D = z;
        this.f8724E = lVarArr2[i2].f7899a0;
        this.f8725F = lVarArr2[i2].f7902b0;
        this.f8727H = lVarArr2[i2].f7908d0;
        this.f8733N = "";
        this.f8728I = lVarArr2[i2].f7905c0;
        this.f8729J = lVarArr2[i2].f7911e0;
        this.f8730K = lVarArr2[i2].f7914f0;
        if (z) {
            SharedPreferences sharedPreferences2 = this.f8760s0;
            this.f8728I = sharedPreferences2.getInt("fdist_v_" + this.f8761t.f7231O1[this.f8749n].f7964y, this.f8728I);
        }
        if (this.f8721B) {
            SharedPreferences sharedPreferences3 = this.f8760s0;
            this.f8727H = sharedPreferences3.getInt("fsexo_v_" + this.f8761t.f7231O1[this.f8749n].f7964y, this.f8727H);
        }
        if (this.f8724E) {
            SharedPreferences sharedPreferences4 = this.f8760s0;
            this.f8729J = sharedPreferences4.getInt("fedad1_v_" + this.f8761t.f7231O1[this.f8749n].f7964y, this.f8729J);
        }
        if (this.f8725F) {
            SharedPreferences sharedPreferences5 = this.f8760s0;
            this.f8730K = sharedPreferences5.getInt("fedad2_v_" + this.f8761t.f7231O1[this.f8749n].f7964y, this.f8730K);
        }
        if (this.f8760s0.getString("nick", "").equals("") || (this.f8761t.f7393o5 == 3 && !this.f8760s0.getBoolean("email_confirmado", false))) {
            Intent intent = new Intent(this, chat_perfil.class);
            intent.putExtra("idsecc", this.f8761t.f7231O1[this.f8749n].f7964y);
            intent.putExtra("desde_buscusus", true);
            boolean z2 = this.f6659e;
            if (z2) {
                intent.putExtra("es_root", z2);
            }
            this.f6659e = false;
            this.f8762u = true;
            startActivityForResult(intent, 0);
        } else if ((this.f8759s == 2 && !this.f8761t.mo7516l0(this, 1).exists()) || ((this.f8751o == 2 && (this.f8760s0.getInt("fnac_d", 0) == 0 || this.f8760s0.getInt("fnac_m", 0) == 0 || this.f8760s0.getInt("fnac_a", 0) == 0)) || ((this.f8753p == 2 && this.f8760s0.getInt("sexo", 0) == 0) || (this.f8755q == 2 && this.f8760s0.getString("descr", "").equals(""))))) {
            Intent intent2 = new Intent(this, preperfil.class);
            intent2.putExtra("idsecc", this.f8761t.f7231O1[this.f8749n].f7964y);
            intent2.putExtra("desde_buscusus", true);
            boolean z3 = this.f6659e;
            if (z3) {
                intent2.putExtra("es_root", z3);
            }
            this.f6659e = false;
            this.f8762u = true;
            startActivityForResult(intent2, 0);
        }
        if (!this.f8762u) {
            setContentView(R.layout.t_buscusus);
            mo8276c();
            this.f8761t.mo7486N0(this, false);
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new C2127b());
            searchManager.setOnDismissListener(new C2128c());
            C1692config config3 = this.f8761t;
            Bundle bundle2 = this.f8756q0;
            boolean z4 = bundle2 != null && bundle2.containsKey("ad_entrar");
            Bundle bundle3 = this.f8756q0;
            config3.mo7503f1(this, z4, bundle3 != null && bundle3.containsKey("fb_entrar"));
            this.f8752o0 = this.f8761t.mo7474A0(this, false);
            C1692config config4 = this.f8761t;
            config4.mo7488Q0(this, config4.f7318d, this.f6656b, bundle);
            if (!str.equals("")) {
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + str), Color.parseColor("#" + str2)}));
            }
            if (this.f8761t.f7163D > 0) {
                this.f8760s0.registerOnSharedPreferenceChangeListener(this);
            }
            if (this.f8761t.f7163D > 0) {
                int i3 = this.f8760s0.getInt("fondo_v_act", 0);
                C1692config config5 = this.f8761t;
                if (i3 == config5.f7163D) {
                    try {
                        config5.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f8761t.f7145A), this.f8761t.f7157C);
                        this.f8761t.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
                    } catch (Exception unused) {
                    }
                }
            }
            if (this.f8726G) {
                this.f8736Q = BitmapFactory.decodeResource(getResources(), R.drawable.sinfoto_light);
            } else {
                this.f8736Q = BitmapFactory.decodeResource(getResources(), R.drawable.sinfoto);
            }
            ImageView imageView = (ImageView) findViewById(R.id.btnperfil);
            if (this.f8761t.f7169E > 0) {
                int i4 = this.f8760s0.getInt("v_ico_perfil_act", 0);
                C1692config config6 = this.f8761t;
                if (i4 == config6.f7169E) {
                    try {
                        config6.mo7493Y("ico_perfil", imageView);
                    } catch (Exception unused2) {
                    }
                }
            }
            imageView.setOnClickListener(this);
            imageView.setVisibility(0);
            this.f8744Y = (TextView) findViewById(R.id.tv_fsexo);
            this.f8745Z = (TextView) findViewById(R.id.tv_fnick);
            this.f8746l0 = (TextView) findViewById(R.id.tv_fdist);
            this.f8748m0 = (TextView) findViewById(R.id.tv_fedad1);
            this.f8750n0 = (TextView) findViewById(R.id.tv_fedad2);
            mo8277d();
            this.f8737R = new ArrayList<>();
            this.f8764w = false;
            this.f8738S = (GridView) findViewById(R.id.grid);
            C2134g gVar = new C2134g(this, R.layout.t_buscusus_row, this.f8737R);
            this.f8739T = gVar;
            this.f8738S.setAdapter(gVar);
            this.f8738S.setOnItemClickListener(this);
            this.f8742W = mo8275a();
            this.f8720A = false;
            C2138j jVar = new C2138j(0);
            this.f8740U = jVar;
            jVar.execute(new String[0]);
        }
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f8761t.f7384n3 == 0 || (cVar3 = this.f8752o0) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f8761t.f7384n3 == 0 || (cVar2 = this.f8752o0) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f8761t.f7384n3 == 0 || (cVar = this.f8752o0) == null || (adColonyAdView = cVar.f6889d) == null)) {
            adColonyAdView.destroy();
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

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C2136h hVar = this.f8737R.get(i);
        if (!hVar.f8791a.equals("-1")) {
            Intent intent = new Intent(this, profile.class);
            intent.putExtra(TtmlNode.ATTR_ID, hVar.f8791a);
            intent.putExtra("privados", hVar.f8794d);
            intent.putExtra("nombre", hVar.f8792b);
            intent.putExtra("coments", hVar.f8795e);
            intent.putExtra("fnac_d", hVar.f8796f);
            intent.putExtra("fnac_m", hVar.f8797g);
            intent.putExtra("fnac_a", hVar.f8798h);
            intent.putExtra("sexo", hVar.f8799i);
            intent.putExtra("vfoto", hVar.f8793c);
            intent.putExtra("dist", hVar.f8800j);
            intent.putExtra("p_fnac", this.f8751o);
            intent.putExtra("p_sexo", this.f8753p);
            intent.putExtra("p_descr", this.f8755q);
            intent.putExtra("p_dist", this.f8757r);
            intent.putExtra("coments_chat", this.f8765x);
            intent.putExtra("galeria", this.f8766y);
            intent.putExtra("privados_chat", this.f8767z);
            intent.putExtra("fotos_perfil", this.f8759s);
            intent.putExtra("fotos_chat", 1);
            intent.putExtra("conectado", hVar.f8806p);
            startActivityForResult(intent, 0);
        }
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f8761t.f7384n3 == 0 || (cVar = this.f8752o0) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2133f());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        C2134g gVar = this.f8739T;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
        if (this.f8761t.f7384n3 != 0 && (cVar = this.f8752o0) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f8754p0 = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f8754p0) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f8754p0 = true;
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

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals("fondo_v_act")) {
            try {
                this.f8761t.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f8761t.f7145A), this.f8761t.f7157C);
                ((ImageView) findViewById(R.id.iv_fondo)).setVisibility(8);
                this.f8761t.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
                C1692config.m8172V((ImageView) findViewById(R.id.iv_fondo));
            } catch (Exception unused) {
            }
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f6657c && !this.f6658d) {
            finish();
        }
    }

    public void onVideoCompleted() {
        this.f8754p0 = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f8754p0 = true;
        C1692config.m8175Y0(this);
    }
}
