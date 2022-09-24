package british.xnews2;

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
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
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
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.audio.AacUtil;
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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import p272b9.C11188h;
import p307g8.C12725i;
import p316k9.C12823d;
import p317l8.C12831e;
import p337x8.C12960g;
import p339y8.C12978b;
import p339y8.C12981e;
import p339y8.C12982f;

public class t_buscvideos extends Activity_ext_class implements C1592a, View.OnClickListener, SharedPreferences.OnSharedPreferenceChangeListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    boolean f8912A = false;

    /* renamed from: B */
    boolean f8913B = false;

    /* renamed from: C */
    boolean f8914C;

    /* renamed from: D */
    boolean f8915D;

    /* renamed from: E */
    boolean f8916E;

    /* renamed from: F */
    boolean f8917F;

    /* renamed from: G */
    boolean f8918G;

    /* renamed from: H */
    int[] f8919H = new int[20];

    /* renamed from: I */
    int f8920I;

    /* renamed from: J */
    int f8921J;

    /* renamed from: K */
    int f8922K;

    /* renamed from: L */
    int f8923L;

    /* renamed from: M */
    int f8924M;

    /* renamed from: N */
    Bitmap f8925N;

    /* renamed from: O */
    ArrayList<C2196q> f8926O;

    /* renamed from: P */
    ArrayList<Long> f8927P;

    /* renamed from: Q */
    C2198s f8928Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public ArrayList<C2586u> f8929R = null;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public ArrayList<C2586u> f8930S = null;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public ArrayList<Integer> f8931T = null;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public Runnable f8932U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public boolean f8933V = false;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f8934W = false;

    /* renamed from: X */
    private RecyclerView f8935X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public RecyclerView.C1092h f8936Y;

    /* renamed from: Z */
    private RecyclerView.C1104p f8937Z;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public Thread f8938l0;

    /* renamed from: m */
    File f8939m;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public C2197r f8940m0;

    /* renamed from: n */
    long f8941n;

    /* renamed from: n0 */
    C1603c f8942n0;

    /* renamed from: o */
    int f8943o;

    /* renamed from: o0 */
    Bundle f8944o0;

    /* renamed from: p */
    int f8945p;

    /* renamed from: p0 */
    TextView f8946p0;

    /* renamed from: q */
    int f8947q;

    /* renamed from: q0 */
    TextView f8948q0;

    /* renamed from: r */
    int f8949r;

    /* renamed from: r0 */
    Dialog f8950r0;

    /* renamed from: s */
    int f8951s;

    /* renamed from: s0 */
    Dialog f8952s0;

    /* renamed from: t */
    int f8953t;

    /* renamed from: t0 */
    ProgressDialog f8954t0;

    /* renamed from: u */
    int f8955u;

    /* renamed from: u0 */
    ListView f8956u0;

    /* renamed from: v */
    String f8957v;

    /* renamed from: v0 */
    SharedPreferences f8958v0;

    /* renamed from: w */
    String f8959w;

    /* renamed from: w0 */
    boolean f8960w0 = false;

    /* renamed from: x */
    String f8961x;

    /* renamed from: x0 */
    private Runnable f8962x0 = new C2179d();

    /* renamed from: y */
    String f8963y;

    /* renamed from: z */
    C1692config f8964z;

    /* renamed from: british.xnews2.t_buscvideos$a */
    class C2174a implements View.OnClickListener {
        C2174a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x00af  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x005a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r8) {
            /*
                r7 = this;
                british.xnews2.t_buscvideos r8 = british.xnews2.t_buscvideos.this
                android.content.SharedPreferences r8 = r8.f8958v0
                android.content.SharedPreferences$Editor r8 = r8.edit()
                british.xnews2.t_buscvideos r0 = british.xnews2.t_buscvideos.this
                boolean r1 = r0.f8914C
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0053
                android.app.Dialog r0 = r0.f8950r0
                r1 = 2131362918(0x7f0a0466, float:1.834563E38)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.Spinner r0 = (android.widget.Spinner) r0
                int r0 = r0.getSelectedItemPosition()
                british.xnews2.t_buscvideos r1 = british.xnews2.t_buscvideos.this
                int r4 = r1.f8920I
                int[] r5 = r1.f8919H
                r6 = r5[r0]
                if (r4 == r6) goto L_0x0053
                r0 = r5[r0]
                r1.f8920I = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ftipo_v_"
                r0.append(r1)
                british.xnews2.t_buscvideos r1 = british.xnews2.t_buscvideos.this
                british.xnews2.config r4 = r1.f8964z
                british.xnews2.l[] r4 = r4.f7231O1
                int r1 = r1.f8943o
                r1 = r4[r1]
                int r1 = r1.f7964y
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                british.xnews2.t_buscvideos r1 = british.xnews2.t_buscvideos.this
                int r1 = r1.f8920I
                r8.putInt(r0, r1)
                r0 = 1
                goto L_0x0054
            L_0x0053:
                r0 = 0
            L_0x0054:
                british.xnews2.t_buscvideos r1 = british.xnews2.t_buscvideos.this
                boolean r4 = r1.f8915D
                if (r4 == 0) goto L_0x00ac
                android.app.Dialog r1 = r1.f8950r0
                r4 = 2131362913(0x7f0a0461, float:1.834562E38)
                android.view.View r1 = r1.findViewById(r4)
                android.widget.Spinner r1 = (android.widget.Spinner) r1
                int r1 = r1.getSelectedItemPosition()
                if (r1 <= 0) goto L_0x007d
                british.xnews2.t_buscvideos r2 = british.xnews2.t_buscvideos.this
                british.xnews2.config r4 = r2.f8964z
                british.xnews2.l[] r4 = r4.f7231O1
                int r2 = r2.f8943o
                r2 = r4[r2]
                british.xnews2.e[] r2 = r2.f7917g0
                int r4 = r1 + -1
                r2 = r2[r4]
                int r2 = r2.f7652a
            L_0x007d:
                british.xnews2.t_buscvideos r4 = british.xnews2.t_buscvideos.this
                int r5 = r4.f8921J
                if (r5 == r2) goto L_0x00ac
                r4.f8921J = r2
                r4.f8922K = r1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "fcat_v_"
                r0.append(r1)
                british.xnews2.t_buscvideos r1 = british.xnews2.t_buscvideos.this
                british.xnews2.config r2 = r1.f8964z
                british.xnews2.l[] r2 = r2.f7231O1
                int r1 = r1.f8943o
                r1 = r2[r1]
                int r1 = r1.f7964y
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                british.xnews2.t_buscvideos r1 = british.xnews2.t_buscvideos.this
                int r1 = r1.f8921J
                r8.putInt(r0, r1)
                goto L_0x00ad
            L_0x00ac:
                r3 = r0
            L_0x00ad:
                if (r3 == 0) goto L_0x00bc
                r8.commit()
                british.xnews2.t_buscvideos r8 = british.xnews2.t_buscvideos.this
                r8.mo8397u()
                british.xnews2.t_buscvideos r8 = british.xnews2.t_buscvideos.this
                r8.mo8380n()
            L_0x00bc:
                british.xnews2.t_buscvideos r8 = british.xnews2.t_buscvideos.this
                android.app.Dialog r8 = r8.f8950r0
                r8.dismiss()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_buscvideos.C2174a.onClick(android.view.View):void");
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$b */
    class C2175b implements View.OnClickListener {
        C2175b() {
        }

        public void onClick(View view) {
            t_buscvideos.this.f8952s0.dismiss();
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$c */
    class C2176c implements View.OnClickListener {

        /* renamed from: british.xnews2.t_buscvideos$c$a */
        class C2177a implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f8968a;

            C2177a(AlertDialog alertDialog) {
                this.f8968a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f8968a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + t_buscvideos.this.f6656b));
            }
        }

        /* renamed from: british.xnews2.t_buscvideos$c$b */
        class C2178b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f8970a;

            C2178b(AlertDialog alertDialog) {
                this.f8970a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f8970a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + t_buscvideos.this.f6656b));
            }
        }

        C2176c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ec A[SYNTHETIC, Splitter:B:37:0x00ec] */
        /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r12) {
            /*
                r11 = this;
                android.app.AlertDialog$Builder r12 = new android.app.AlertDialog$Builder
                british.xnews2.t_buscvideos r0 = british.xnews2.t_buscvideos.this
                r12.<init>(r0)
                r0 = 0
                android.app.AlertDialog$Builder r1 = r12.setCancelable(r0)
                british.xnews2.t_buscvideos r2 = british.xnews2.t_buscvideos.this
                r3 = 2131820577(0x7f110021, float:1.9273873E38)
                java.lang.String r2 = r2.getString(r3)
                r3 = 0
                r1.setPositiveButton(r2, r3)
                british.xnews2.t_buscvideos r1 = british.xnews2.t_buscvideos.this
                android.app.Dialog r1 = r1.f8952s0
                r2 = 2131362913(0x7f0a0461, float:1.834562E38)
                android.view.View r1 = r1.findViewById(r2)
                android.widget.Spinner r1 = (android.widget.Spinner) r1
                int r1 = r1.getSelectedItemPosition()
                r2 = 16908299(0x102000b, float:2.387726E-38)
                java.lang.String r3 = ""
                r4 = 1
                if (r1 != 0) goto L_0x005f
                r1 = 2131820852(0x7f110134, float:1.927443E38)
                r12.setMessage(r1)
                android.app.AlertDialog r1 = r12.create()
                british.xnews2.t_buscvideos r4 = british.xnews2.t_buscvideos.this
                java.lang.String r4 = r4.f6656b
                boolean r4 = r4.equals(r3)
                if (r4 != 0) goto L_0x004e
                british.xnews2.t_buscvideos$c$a r4 = new british.xnews2.t_buscvideos$c$a
                r4.<init>(r1)
                r1.setOnShowListener(r4)
            L_0x004e:
                r1.show()
                android.view.View r1 = r1.findViewById(r2)     // Catch:{ Exception -> 0x005c }
                android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x005c }
                android.graphics.Typeface r4 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x005c }
                r1.setTypeface(r4)     // Catch:{ Exception -> 0x005c }
            L_0x005c:
                r1 = 0
                r4 = 0
                goto L_0x008e
            L_0x005f:
                r5 = 0
                r6 = 1
            L_0x0061:
                british.xnews2.t_buscvideos r7 = british.xnews2.t_buscvideos.this
                british.xnews2.config r8 = r7.f8964z
                british.xnews2.l[] r9 = r8.f7231O1
                int r7 = r7.f8943o
                r10 = r9[r7]
                british.xnews2.e[] r10 = r10.f7917g0
                int r10 = r10.length
                if (r5 >= r10) goto L_0x0086
                r10 = r9[r7]
                british.xnews2.e[] r10 = r10.f7917g0
                r10 = r10[r5]
                boolean r10 = r10.f7654c
                if (r10 == 0) goto L_0x007e
                boolean r8 = r8.f7324e
                if (r8 == 0) goto L_0x0083
            L_0x007e:
                if (r1 != r6) goto L_0x0081
                goto L_0x0086
            L_0x0081:
                int r6 = r6 + 1
            L_0x0083:
                int r5 = r5 + 1
                goto L_0x0061
            L_0x0086:
                r1 = r9[r7]
                british.xnews2.e[] r1 = r1.f7917g0
                r1 = r1[r5]
                int r1 = r1.f7652a
            L_0x008e:
                if (r4 == 0) goto L_0x00e9
                british.xnews2.t_buscvideos r5 = british.xnews2.t_buscvideos.this
                british.xnews2.config r6 = r5.f8964z
                british.xnews2.l[] r6 = r6.f7231O1
                int r7 = r5.f8943o
                r6 = r6[r7]
                boolean r6 = r6.f7950r0
                if (r6 == 0) goto L_0x00e9
                android.app.Dialog r5 = r5.f8952s0
                r6 = 2131363099(0x7f0a051b, float:1.8345997E38)
                android.view.View r5 = r5.findViewById(r6)
                android.widget.EditText r5 = (android.widget.EditText) r5
                android.text.Editable r5 = r5.getText()
                java.lang.String r5 = r5.toString()
                java.lang.String r5 = r5.trim()
                boolean r6 = r5.isEmpty()
                if (r6 == 0) goto L_0x00e6
                r4 = 2131820853(0x7f110135, float:1.9274433E38)
                r12.setMessage(r4)
                android.app.AlertDialog r12 = r12.create()
                british.xnews2.t_buscvideos r4 = british.xnews2.t_buscvideos.this
                java.lang.String r4 = r4.f6656b
                boolean r3 = r4.equals(r3)
                if (r3 != 0) goto L_0x00d7
                british.xnews2.t_buscvideos$c$b r3 = new british.xnews2.t_buscvideos$c$b
                r3.<init>(r12)
                r12.setOnShowListener(r3)
            L_0x00d7:
                r12.show()
                android.view.View r12 = r12.findViewById(r2)     // Catch:{ Exception -> 0x00e7 }
                android.widget.TextView r12 = (android.widget.TextView) r12     // Catch:{ Exception -> 0x00e7 }
                android.graphics.Typeface r2 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x00e7 }
                r12.setTypeface(r2)     // Catch:{ Exception -> 0x00e7 }
                goto L_0x00e7
            L_0x00e6:
                r0 = r4
            L_0x00e7:
                r3 = r5
                goto L_0x00ea
            L_0x00e9:
                r0 = r4
            L_0x00ea:
                if (r0 == 0) goto L_0x00f8
                british.xnews2.t_buscvideos r12 = british.xnews2.t_buscvideos.this     // Catch:{ Exception -> 0x00f3 }
                android.app.Dialog r12 = r12.f8952s0     // Catch:{ Exception -> 0x00f3 }
                r12.dismiss()     // Catch:{ Exception -> 0x00f3 }
            L_0x00f3:
                british.xnews2.t_buscvideos r12 = british.xnews2.t_buscvideos.this
                r12.m8664q(r1, r3)
            L_0x00f8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_buscvideos.C2176c.onClick(android.view.View):void");
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$d */
    class C2179d implements Runnable {

        /* renamed from: british.xnews2.t_buscvideos$d$a */
        class C2180a implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f8973a;

            C2180a(AlertDialog alertDialog) {
                this.f8973a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f8973a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + t_buscvideos.this.f6656b));
            }
        }

        C2179d() {
        }

        public void run() {
            String str;
            try {
                t_buscvideos.this.findViewById(R.id.pb_videos).setVisibility(8);
            } catch (Exception unused) {
            }
            if (t_buscvideos.this.f8930S != null && t_buscvideos.this.f8930S.size() > 0) {
                for (int i = 0; i < t_buscvideos.this.f8930S.size(); i++) {
                    if (t_buscvideos.this.f8931T.indexOf(Integer.valueOf(((C2586u) t_buscvideos.this.f8930S.get(i)).f10311m)) == -1) {
                        t_buscvideos.this.f8929R.add((C2586u) t_buscvideos.this.f8930S.get(i));
                        t_buscvideos.this.f8931T.add(Integer.valueOf(((C2586u) t_buscvideos.this.f8930S.get(i)).f10311m));
                    }
                }
            }
            t_buscvideos.this.f8936Y.notifyDataSetChanged();
            if (t_buscvideos.this.f8929R != null && t_buscvideos.this.f8929R.size() == 0) {
                if (!t_buscvideos.this.f8934W) {
                    str = t_buscvideos.this.getResources().getString(R.string.error_http);
                } else {
                    str = t_buscvideos.this.getResources().getString(R.string.lista_vacia_videos);
                }
                AlertDialog create = new AlertDialog.Builder(t_buscvideos.this).setCancelable(true).setPositiveButton(t_buscvideos.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(str).create();
                if (!t_buscvideos.this.f6656b.equals("")) {
                    create.setOnShowListener(new C2180a(create));
                }
                try {
                    create.show();
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused2) {
                }
            }
            if (t_buscvideos.this.f8929R != null && t_buscvideos.this.f8929R.size() > 0) {
                t_buscvideos.this.f8940m0 = new C2197r();
                t_buscvideos.this.f8940m0.execute(new String[0]);
            }
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$e */
    class C2181e extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f8975a;

        /* renamed from: british.xnews2.t_buscvideos$e$a */
        class C2182a extends FullScreenContentCallback {
            C2182a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_buscvideos t_buscvideos = t_buscvideos.this;
                if (t_buscvideos.f8960w0) {
                    t_buscvideos.abrir_secc(t_buscvideos.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_buscvideos t_buscvideos = t_buscvideos.this;
                t_buscvideos.abrir_secc(t_buscvideos.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.t_buscvideos$e$b */
        class C2183b implements OnUserEarnedRewardListener {
            C2183b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2181e eVar = C2181e.this;
                t_buscvideos.this.f8960w0 = true;
                C1692config.m8175Y0(eVar.f8975a);
            }
        }

        C2181e(Context context) {
            this.f8975a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_buscvideos.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2182a());
            rewardedAd.show((Activity) this.f8975a, new C2183b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_buscvideos t_buscvideos = t_buscvideos.this;
            if (!t_buscvideos.f8964z.mo7502f(this.f8975a, t_buscvideos.f6663i)) {
                t_buscvideos.this.f6661g.cancel();
                t_buscvideos t_buscvideos2 = t_buscvideos.this;
                t_buscvideos2.abrir_secc(t_buscvideos2.f6660f);
            }
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$f */
    class C2184f implements AdDisplayListener {
        C2184f() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_buscvideos t_buscvideos = t_buscvideos.this;
            if (t_buscvideos.f8960w0) {
                t_buscvideos.abrir_secc(t_buscvideos.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$g */
    class C2185g extends AdColonyInterstitialListener {
        C2185g() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_buscvideos t_buscvideos = t_buscvideos.this;
            if (t_buscvideos.f8960w0) {
                t_buscvideos.abrir_secc(t_buscvideos.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_buscvideos.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_buscvideos.this.f6661g.cancel();
            t_buscvideos t_buscvideos = t_buscvideos.this;
            t_buscvideos.abrir_secc(t_buscvideos.f6660f);
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$h */
    class C2186h implements SearchManager.OnCancelListener {
        C2186h() {
        }

        public void onCancel() {
            t_buscvideos t_buscvideos = t_buscvideos.this;
            t_buscvideos.f6657c = false;
            t_buscvideos.setResult(0);
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$i */
    class C2187i implements SearchManager.OnDismissListener {
        C2187i() {
        }

        public void onDismiss() {
            t_buscvideos.this.f6658d = false;
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$j */
    class C2188j implements View.OnClickListener {
        C2188j() {
        }

        public void onClick(View view) {
            t_buscvideos t_buscvideos = t_buscvideos.this;
            t_buscvideos.f6657c = true;
            t_buscvideos.finish();
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$k */
    class C2189k implements Runnable {
        C2189k() {
        }

        public void run() {
            t_buscvideos.this.m8666s();
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$l */
    class C2190l implements DialogInterface.OnClickListener {
        C2190l() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("video/*");
            t_buscvideos.this.startActivityForResult(intent, 4);
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$m */
    class C2191m implements DialogInterface.OnClickListener {
        C2191m() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            t_buscvideos t_buscvideos = t_buscvideos.this;
            if (!t_buscvideos.f8964z.mo7500d1(t_buscvideos, 109)) {
                t_buscvideos t_buscvideos2 = t_buscvideos.this;
                C1692config config = t_buscvideos2.f8964z;
                config.mo7526t0(t_buscvideos2, config.mo7507i0(t_buscvideos2, "dt_foto98_temp.mp4"));
            }
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$n */
    class C2192n implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8987a;

        C2192n(AlertDialog alertDialog) {
            this.f8987a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8987a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + t_buscvideos.this.f6656b));
            Button button2 = this.f8987a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + t_buscvideos.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$o */
    class C2193o implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f8989a;

        C2193o(AlertDialog alertDialog) {
            this.f8989a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f8989a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + t_buscvideos.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$p */
    public class C2194p extends RecyclerView.C1092h<C2195a> {

        /* renamed from: a */
        private ArrayList<C2586u> f8991a;

        /* renamed from: british.xnews2.t_buscvideos$p$a */
        public class C2195a extends RecyclerView.C1087c0 {

            /* renamed from: a */
            public TextView f8993a;

            /* renamed from: b */
            public TextView f8994b;

            /* renamed from: c */
            public TextView f8995c;

            /* renamed from: d */
            public TextView f8996d;

            /* renamed from: e */
            public TextView f8997e;

            /* renamed from: f */
            public TextView f8998f;

            /* renamed from: g */
            public TextView f8999g;

            /* renamed from: h */
            public ImageView f9000h;

            /* renamed from: i */
            public ImageView f9001i;

            /* renamed from: j */
            public ImageView f9002j;

            /* renamed from: k */
            public LinearLayout f9003k;

            /* renamed from: l */
            public LinearLayout f9004l;

            /* renamed from: m */
            public LinearLayout f9005m;

            public C2195a(View view) {
                super(view);
                this.f9003k = (LinearLayout) view.findViewById(R.id.fila);
                this.f8993a = (TextView) view.findViewById(R.id.videoDescr);
                this.f8994b = (TextView) view.findViewById(R.id.videoName);
                this.f8995c = (TextView) view.findViewById(R.id.videoDate);
                t_buscvideos t_buscvideos = t_buscvideos.this;
                if (!t_buscvideos.f8964z.f7231O1[t_buscvideos.f8943o].f7950r0) {
                    this.f8993a.setVisibility(8);
                }
                t_buscvideos t_buscvideos2 = t_buscvideos.this;
                if (!t_buscvideos2.f8964z.f7231O1[t_buscvideos2.f8943o].f7953s0) {
                    this.f8994b.setVisibility(8);
                }
                t_buscvideos t_buscvideos3 = t_buscvideos.this;
                if (!t_buscvideos3.f8964z.f7231O1[t_buscvideos3.f8943o].f7874O) {
                    this.f8995c.setVisibility(8);
                }
                this.f8996d = (TextView) view.findViewById(R.id.videoDist);
                this.f8997e = (TextView) view.findViewById(R.id.videoEstado);
                this.f9004l = (LinearLayout) view.findViewById(R.id.ll_videoLikes);
                this.f9005m = (LinearLayout) view.findViewById(R.id.ll_videoVistos);
                this.f8998f = (TextView) view.findViewById(R.id.videoLikes);
                this.f8999g = (TextView) view.findViewById(R.id.videoVistos);
                ImageView imageView = (ImageView) view.findViewById(R.id.videoThumb);
                this.f9000h = imageView;
                t_buscvideos t_buscvideos4 = t_buscvideos.this;
                if (t_buscvideos4.f8964z.f7231O1[t_buscvideos4.f8943o].f7947q0 == 1) {
                    imageView.getLayoutParams().height = t_buscvideos.this.f8924M;
                }
                this.f9001i = (ImageView) view.findViewById(R.id.videoPlay);
                this.f9002j = (ImageView) view.findViewById(R.id.videoUser);
            }
        }

        public C2194p(ArrayList<C2586u> arrayList) {
            this.f8991a = arrayList;
        }

        /* renamed from: a */
        public void onBindViewHolder(C2195a aVar, int i) {
            String str;
            String str2;
            C2586u uVar = this.f8991a.get(i);
            t_buscvideos t_buscvideos = t_buscvideos.this;
            if (t_buscvideos.f8964z.f7231O1[t_buscvideos.f8943o].f7950r0) {
                if (uVar.f10299a.equals("")) {
                    aVar.f8993a.setVisibility(8);
                } else {
                    aVar.f8993a.setText(uVar.f10299a);
                    aVar.f8993a.setVisibility(0);
                }
            }
            long j = uVar.f10310l;
            t_buscvideos t_buscvideos2 = t_buscvideos.this;
            if (j == t_buscvideos2.f8941n) {
                aVar.f8994b.setText(t_buscvideos2.getString(R.string.tu));
            } else {
                aVar.f8994b.setText(uVar.f10300b);
            }
            aVar.f8995c.setText(uVar.f10301c);
            t_buscvideos t_buscvideos3 = t_buscvideos.this;
            if (t_buscvideos3.f8920I != 5 || !t_buscvideos3.f8957v.equals("")) {
                aVar.f8996d.setVisibility(8);
            } else {
                int i2 = uVar.f10315q;
                if (t_buscvideos.this.f8961x.equals("US") || t_buscvideos.this.f8961x.equals("GB") || t_buscvideos.this.f8961x.equals("MM")) {
                    double d = (double) i2;
                    Double.isNaN(d);
                    i2 = (int) (d / 1.6d);
                    str2 = "mi.";
                } else {
                    str2 = "km.";
                }
                if (i2 == 0) {
                    TextView textView = aVar.f8996d;
                    textView.setText("<1" + str2);
                } else {
                    TextView textView2 = aVar.f8996d;
                    textView2.setText(i2 + str2);
                }
                aVar.f8996d.setVisibility(0);
            }
            if (t_buscvideos.this.f8920I != 2) {
                aVar.f9004l.setVisibility(8);
            } else {
                TextView textView3 = aVar.f8998f;
                textView3.setText(uVar.f10313o + "");
                aVar.f9004l.setVisibility(0);
            }
            if (t_buscvideos.this.f8920I != 3) {
                aVar.f9005m.setVisibility(8);
            } else {
                TextView textView4 = aVar.f8999g;
                textView4.setText(uVar.f10314p + "");
                aVar.f9005m.setVisibility(0);
            }
            if (t_buscvideos.this.f8920I != 7) {
                aVar.f8997e.setVisibility(8);
            } else {
                GradientDrawable gradientDrawable = (GradientDrawable) aVar.f8997e.getBackground();
                int i3 = uVar.f10316r;
                if (i3 == 0) {
                    aVar.f8997e.setText(t_buscvideos.this.getString(R.string.pendiente));
                    str = t_buscvideos.this.f8916E ? "#EF6C00" : "#FF9800";
                } else if (i3 == 1) {
                    aVar.f8997e.setText(t_buscvideos.this.getString(R.string.aprobado));
                    str = t_buscvideos.this.f8916E ? "#1B5E20" : "#81C784";
                } else if (i3 == 2) {
                    aVar.f8997e.setText(t_buscvideos.this.getString(R.string.rechazado));
                    str = t_buscvideos.this.f8916E ? "#B71C1C" : "#E53935";
                } else {
                    aVar.f8997e.setText("");
                    str = "";
                }
                if (!str.equals("")) {
                    aVar.f8997e.setTextColor(Color.parseColor(str));
                    gradientDrawable.setStroke(t_buscvideos.this.f8955u, Color.parseColor(str));
                }
                aVar.f8997e.setVisibility(0);
            }
            File file = t_buscvideos.this.f8939m;
            File file2 = new File(file, "fbuscvideo_" + uVar.f10311m + ".jpg");
            if (!file2.exists()) {
                aVar.f9001i.setVisibility(8);
                if (uVar.f10317s) {
                    aVar.f9000h.setImageDrawable((Drawable) null);
                } else {
                    t_buscvideos t_buscvideos4 = t_buscvideos.this;
                    if (t_buscvideos4.f8964z.f7231O1[t_buscvideos4.f8943o].f7947q0 == 0) {
                        aVar.f9000h.setImageDrawable(t_buscvideos4.getResources().getDrawable(R.drawable.cargando));
                    } else {
                        aVar.f9000h.setImageDrawable(t_buscvideos4.getResources().getDrawable(R.drawable.cargando_2));
                    }
                }
            } else {
                aVar.f9001i.setVisibility(0);
                try {
                    if (!uVar.f10319u) {
                        aVar.f9000h.setVisibility(4);
                    }
                    aVar.f9000h.setImageBitmap(MediaStore.Images.Media.getBitmap(t_buscvideos.this.getContentResolver(), Uri.fromFile(file2)));
                    if (!uVar.f10319u) {
                        uVar.f10319u = true;
                        C1692config.m8172V(aVar.f9000h);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (OutOfMemoryError e2) {
                    e2.printStackTrace();
                }
            }
            t_buscvideos t_buscvideos5 = t_buscvideos.this;
            if (t_buscvideos5.f8953t > 0 && t_buscvideos5.f8964z.f7231O1[t_buscvideos5.f8943o].f7953s0) {
                int indexOf = t_buscvideos5.f8927P.indexOf(Long.valueOf(uVar.f10310l));
                if (indexOf != -1) {
                    Bitmap bitmap = t_buscvideos.this.f8926O.get(indexOf).f9010d;
                    if (bitmap == null) {
                        aVar.f9002j.setImageBitmap(t_buscvideos.this.f8925N);
                    } else {
                        aVar.f9002j.setImageBitmap(bitmap);
                    }
                } else {
                    aVar.f9002j.setImageBitmap(t_buscvideos.this.f8925N);
                }
            }
            aVar.f9003k.setTag(Integer.valueOf(i));
            if (t_buscvideos.this.f8933V && i == t_buscvideos.this.f8929R.size() - 1) {
                if (t_buscvideos.this.f8938l0 == null || !t_buscvideos.this.f8938l0.isAlive()) {
                    t_buscvideos.this.findViewById(R.id.pb_videos).setVisibility(0);
                    t_buscvideos.this.f8938l0 = new Thread((ThreadGroup) null, t_buscvideos.this.f8932U, "buscandoelems");
                    t_buscvideos.this.f8938l0.start();
                }
            }
        }

        /* renamed from: b */
        public C2195a onCreateViewHolder(ViewGroup viewGroup, int i) {
            Drawable drawable;
            Drawable drawable2;
            t_buscvideos t_buscvideos = t_buscvideos.this;
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(t_buscvideos.f8964z.f7231O1[t_buscvideos.f8943o].f7947q0 == 1 ? R.layout.buscvideos_item_2 : R.layout.buscvideos_item, viewGroup, false);
            t_buscvideos t_buscvideos2 = t_buscvideos.this;
            if (t_buscvideos2.f8916E) {
                drawable = t_buscvideos2.getResources().getDrawable(R.drawable.like_black);
                drawable2 = t_buscvideos.this.getResources().getDrawable(R.drawable.eye_black);
                View findViewById = inflate.findViewById(R.id.videoDescrSep);
                int i2 = C1692config.f7101A5;
                findViewById.setBackgroundColor(i2);
                ((TextView) inflate.findViewById(R.id.videoDescr)).setTextColor(i2);
                int i3 = C1692config.f7102B5;
                ((TextView) inflate.findViewById(R.id.videoName)).setTextColor(i3);
                ((TextView) inflate.findViewById(R.id.videoDate)).setTextColor(i3);
                ((TextView) inflate.findViewById(R.id.videoDist)).setTextColor(i3);
                ((TextView) inflate.findViewById(R.id.videoEstado)).setTextColor(i3);
                ((TextView) inflate.findViewById(R.id.videoLikes)).setTextColor(i3);
                ((TextView) inflate.findViewById(R.id.videoVistos)).setTextColor(i3);
            } else {
                drawable = t_buscvideos2.getResources().getDrawable(R.drawable.like);
                drawable2 = t_buscvideos.this.getResources().getDrawable(R.drawable.eye);
                View findViewById2 = inflate.findViewById(R.id.videoDescrSep);
                int i4 = C1692config.f7103C5;
                findViewById2.setBackgroundColor(i4);
                ((TextView) inflate.findViewById(R.id.videoDescr)).setTextColor(i4);
                int i5 = C1692config.f7104D5;
                ((TextView) inflate.findViewById(R.id.videoName)).setTextColor(i5);
                ((TextView) inflate.findViewById(R.id.videoDate)).setTextColor(i5);
                ((TextView) inflate.findViewById(R.id.videoDist)).setTextColor(i5);
                ((TextView) inflate.findViewById(R.id.videoEstado)).setTextColor(i5);
                ((TextView) inflate.findViewById(R.id.videoLikes)).setTextColor(i5);
                ((TextView) inflate.findViewById(R.id.videoVistos)).setTextColor(i5);
            }
            ((ImageView) inflate.findViewById(R.id.iv_videoLikes)).setImageDrawable(drawable);
            ((ImageView) inflate.findViewById(R.id.iv_videoVistos)).setImageDrawable(drawable2);
            t_buscvideos t_buscvideos3 = t_buscvideos.this;
            if (!t_buscvideos3.f8964z.f7231O1[t_buscvideos3.f8943o].f7950r0) {
                inflate.findViewById(R.id.videoDescrSep).setVisibility(8);
            }
            t_buscvideos t_buscvideos4 = t_buscvideos.this;
            if (t_buscvideos4.f8953t == 0 || !t_buscvideos4.f8964z.f7231O1[t_buscvideos4.f8943o].f7953s0) {
                inflate.findViewById(R.id.videoUser).setVisibility(8);
            }
            inflate.setOnClickListener(t_buscvideos.this);
            return new C2195a(inflate);
        }

        public int getItemCount() {
            return this.f8991a.size();
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$q */
    private class C2196q {

        /* renamed from: a */
        String f9007a;

        /* renamed from: b */
        String f9008b;

        /* renamed from: c */
        boolean f9009c;

        /* renamed from: d */
        Bitmap f9010d;

        private C2196q() {
            this.f9009c = true;
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$r */
    private class C2197r extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        long f9012a;

        /* renamed from: b */
        int f9013b;

        /* renamed from: c */
        int f9014c;

        /* renamed from: d */
        int f9015d;

        /* renamed from: e */
        Bitmap f9016e;

        private C2197r() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            URL url;
            try {
                url = new URL(C1692config.f7108H5 + "/srv/imgs/videos_busc/v" + this.f9015d + "_" + this.f9012a + "_th.jpg?ida=" + 2260177);
            } catch (MalformedURLException unused) {
                url = null;
            } catch (Exception unused2) {
                return "ANDROID:KO";
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND);
                httpURLConnection.connect();
                InputStream inputStream = httpURLConnection.getInputStream();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream, (Rect) null, options);
                inputStream.close();
                httpURLConnection.disconnect();
                int round = Math.round(TypedValue.applyDimension(1, 200.0f, t_buscvideos.this.getResources().getDisplayMetrics()));
                options.inSampleSize = C1692config.m8192m(options, round, round);
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
                httpURLConnection2.setDoInput(true);
                httpURLConnection2.setConnectTimeout(5000);
                httpURLConnection2.setReadTimeout(AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND);
                httpURLConnection2.connect();
                InputStream inputStream2 = httpURLConnection2.getInputStream();
                options.inJustDecodeBounds = false;
                this.f9016e = BitmapFactory.decodeStream(inputStream2, (Rect) null, options);
                inputStream2.close();
                return "ANDROID:OK";
            } catch (Exception unused3) {
                return "ANDROID:KO";
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0051 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.String r4) {
            /*
                r3 = this;
                int r0 = r3.f9013b     // Catch:{ Exception -> 0x0070 }
                r1 = 1
                if (r0 != r1) goto L_0x0015
                british.xnews2.t_buscvideos r0 = british.xnews2.t_buscvideos.this     // Catch:{ Exception -> 0x0070 }
                java.util.ArrayList r0 = r0.f8929R     // Catch:{ Exception -> 0x0070 }
                int r2 = r3.f9014c     // Catch:{ Exception -> 0x0070 }
                java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0070 }
                british.xnews2.u r0 = (british.xnews2.C2586u) r0     // Catch:{ Exception -> 0x0070 }
                r0.f10317s = r1     // Catch:{ Exception -> 0x0070 }
            L_0x0015:
                java.lang.String r0 = "ANDROID:OK"
                int r4 = r4.indexOf(r0)     // Catch:{ Exception -> 0x0070 }
                r0 = -1
                if (r4 == r0) goto L_0x0051
                int r4 = r3.f9013b     // Catch:{ Exception -> 0x0070 }
                if (r4 != r1) goto L_0x0051
                java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0070 }
                british.xnews2.t_buscvideos r0 = british.xnews2.t_buscvideos.this     // Catch:{ Exception -> 0x0070 }
                java.io.File r0 = r0.f8939m     // Catch:{ Exception -> 0x0070 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0070 }
                r1.<init>()     // Catch:{ Exception -> 0x0070 }
                java.lang.String r2 = "fbuscvideo_"
                r1.append(r2)     // Catch:{ Exception -> 0x0070 }
                int r2 = r3.f9015d     // Catch:{ Exception -> 0x0070 }
                r1.append(r2)     // Catch:{ Exception -> 0x0070 }
                java.lang.String r2 = ".jpg"
                r1.append(r2)     // Catch:{ Exception -> 0x0070 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0070 }
                r4.<init>(r0, r1)     // Catch:{ Exception -> 0x0070 }
                java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0051 }
                r0.<init>(r4)     // Catch:{ Exception -> 0x0051 }
                android.graphics.Bitmap r4 = r3.f9016e     // Catch:{ Exception -> 0x0051 }
                android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0051 }
                r2 = 70
                r4.compress(r1, r2, r0)     // Catch:{ Exception -> 0x0051 }
            L_0x0051:
                british.xnews2.t_buscvideos r4 = british.xnews2.t_buscvideos.this     // Catch:{ Exception -> 0x0070 }
                androidx.recyclerview.widget.RecyclerView$h r4 = r4.f8936Y     // Catch:{ Exception -> 0x0070 }
                r4.notifyDataSetChanged()     // Catch:{ Exception -> 0x0070 }
                british.xnews2.t_buscvideos r4 = british.xnews2.t_buscvideos.this     // Catch:{ Exception -> 0x0070 }
                british.xnews2.t_buscvideos$r r0 = new british.xnews2.t_buscvideos$r     // Catch:{ Exception -> 0x0070 }
                r0.<init>()     // Catch:{ Exception -> 0x0070 }
                r4.f8940m0 = r0     // Catch:{ Exception -> 0x0070 }
                british.xnews2.t_buscvideos r4 = british.xnews2.t_buscvideos.this     // Catch:{ Exception -> 0x0070 }
                british.xnews2.t_buscvideos$r r4 = r4.f8940m0     // Catch:{ Exception -> 0x0070 }
                r0 = 0
                java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0070 }
                r4.execute(r0)     // Catch:{ Exception -> 0x0070 }
            L_0x0070:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_buscvideos.C2197r.onPostExecute(java.lang.String):void");
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= t_buscvideos.this.f8929R.size()) {
                    break;
                }
                C2586u uVar = (C2586u) t_buscvideos.this.f8929R.get(i);
                if (!uVar.f10317s && uVar.f10312n != 0) {
                    this.f9013b = 1;
                    this.f9014c = i;
                    this.f9015d = uVar.f10311m;
                    this.f9012a = uVar.f10310l;
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                cancel(true);
            }
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$s */
    private class C2198s extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f9018a;

        /* renamed from: b */
        String f9019b;

        /* renamed from: c */
        Bitmap f9020c;

        /* renamed from: d */
        int f9021d;

        private C2198s() {
            this.f9021d = -1;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                java.lang.String r7 = "0"
                java.lang.String r0 = r6.f9018a
                if (r0 != 0) goto L_0x0009
                java.lang.String r7 = "-1"
                return r7
            L_0x0009:
                java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00a8 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x00a8 }
                r1.<init>()     // Catch:{ MalformedURLException -> 0x00a8 }
                java.lang.String r2 = british.xnews2.C1692config.f7108H5     // Catch:{ MalformedURLException -> 0x00a8 }
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x00a8 }
                java.lang.String r2 = "/srv/imgs/usus/"
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x00a8 }
                java.lang.String r2 = r6.f9018a     // Catch:{ MalformedURLException -> 0x00a8 }
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x00a8 }
                java.lang.String r2 = "_1_p.jpg?v="
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x00a8 }
                java.lang.String r2 = r6.f9019b     // Catch:{ MalformedURLException -> 0x00a8 }
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x00a8 }
                java.lang.String r1 = r1.toString()     // Catch:{ MalformedURLException -> 0x00a8 }
                r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x00a8 }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{  }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{  }
                r1 = 1
                r0.setDoInput(r1)     // Catch:{  }
                r2 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r2)     // Catch:{  }
                r2 = 20000(0x4e20, float:2.8026E-41)
                r0.setReadTimeout(r2)     // Catch:{  }
                r0.connect()     // Catch:{  }
                java.io.InputStream r2 = r0.getInputStream()     // Catch:{  }
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{  }
                r6.f9020c = r3     // Catch:{  }
                r2.close()     // Catch:{  }
                r0.disconnect()     // Catch:{  }
                java.io.File r0 = new java.io.File     // Catch:{  }
                british.xnews2.t_buscvideos r2 = british.xnews2.t_buscvideos.this     // Catch:{  }
                java.io.File r2 = r2.f8939m     // Catch:{  }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{  }
                r3.<init>()     // Catch:{  }
                java.lang.String r4 = "fperfil_"
                r3.append(r4)     // Catch:{  }
                java.lang.String r4 = r6.f9018a     // Catch:{  }
                r3.append(r4)     // Catch:{  }
                java.lang.String r4 = ".jpg"
                r3.append(r4)     // Catch:{  }
                java.lang.String r3 = r3.toString()     // Catch:{  }
                r0.<init>(r2, r3)     // Catch:{  }
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{  }
                r2.<init>(r0)     // Catch:{  }
                android.graphics.Bitmap r3 = r6.f9020c     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{  }
                r5 = 70
                r3.compress(r4, r5, r2)     // Catch:{  }
                british.xnews2.t_buscvideos r2 = british.xnews2.t_buscvideos.this     // Catch:{  }
                java.util.ArrayList<british.xnews2.t_buscvideos$q> r2 = r2.f8926O     // Catch:{  }
                int r3 = r6.f9021d     // Catch:{  }
                java.lang.Object r2 = r2.get(r3)     // Catch:{  }
                british.xnews2.t_buscvideos$q r2 = (british.xnews2.t_buscvideos.C2196q) r2     // Catch:{  }
                british.xnews2.t_buscvideos r3 = british.xnews2.t_buscvideos.this     // Catch:{  }
                android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{  }
                android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{  }
                android.graphics.Bitmap r0 = android.provider.MediaStore.Images.Media.getBitmap(r3, r0)     // Catch:{  }
                android.graphics.Bitmap r0 = british.xnews2.C1692config.m8188g0(r0, r1)     // Catch:{  }
                r2.f9010d = r0     // Catch:{  }
                java.lang.String r7 = "1"
            L_0x00a8:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_buscvideos.C2198s.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (this.f9018a != null && !str.equals("-1")) {
                if (str == IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) {
                    SharedPreferences.Editor edit = t_buscvideos.this.f8958v0.edit();
                    edit.putString("fperfil_" + this.f9018a, this.f9019b);
                    edit.commit();
                }
                t_buscvideos.this.f8936Y.notifyDataSetChanged();
                new C2198s().execute(new String[0]);
            } else if (!str.equals("-1")) {
                t_buscvideos.this.f8936Y.notifyDataSetChanged();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            int i = 0;
            while (i <= t_buscvideos.this.f8926O.size() && (r2 = t_buscvideos.this.f8926O) != null && i < r2.size()) {
                if (t_buscvideos.this.f8926O.get(i).f9009c && !t_buscvideos.this.f8926O.get(i).f9008b.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                    String str = t_buscvideos.this.f8926O.get(i).f9008b;
                    SharedPreferences sharedPreferences = t_buscvideos.this.f8958v0;
                    if (!str.equals(sharedPreferences.getString("fperfil_" + t_buscvideos.this.f8926O.get(i).f9007a, SessionDescription.SUPPORTED_SDP_VERSION))) {
                        this.f9018a = t_buscvideos.this.f8926O.get(i).f9007a + "";
                        this.f9019b = t_buscvideos.this.f8926O.get(i).f9008b;
                        t_buscvideos.this.f8926O.get(i).f9009c = false;
                        this.f9021d = i;
                        return;
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$t */
    private class C2199t extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f9023a;

        /* renamed from: b */
        int f9024b;

        /* renamed from: c */
        String f9025c;

        /* renamed from: d */
        String f9026d;

        /* renamed from: e */
        String f9027e;

        /* renamed from: f */
        String f9028f;

        /* renamed from: british.xnews2.t_buscvideos$t$a */
        class C2200a implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f9030a;

            C2200a(AlertDialog alertDialog) {
                this.f9030a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f9030a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + t_buscvideos.this.f6656b));
            }
        }

        public C2199t(int i, String str, String str2, int i2, String str3, String str4) {
            this.f9023a = i;
            this.f9025c = str;
            this.f9026d = str2;
            this.f9024b = i2;
            this.f9027e = str3;
            this.f9028f = str4;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            Bitmap bitmap;
            String str = "";
            C11188h hVar = new C11188h();
            C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/guardar_videobusc.php");
            C12960g gVar = new C12960g();
            t_buscvideos t_buscvideos = t_buscvideos.this;
            try {
                bitmap = MediaStore.Images.Media.getBitmap(t_buscvideos.this.getContentResolver(), Uri.fromFile(t_buscvideos.f8964z.mo7516l0(t_buscvideos, this.f9023a)));
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
                gVar.mo48144c("idusu", new C12982f(t_buscvideos.this.f8941n + str));
                gVar.mo48144c("c", new C12982f(t_buscvideos.this.f8959w));
                gVar.mo48144c("idvideo", new C12982f(this.f9025c));
                gVar.mo48144c("formato", new C12982f(this.f9026d));
                gVar.mo48144c("idcat", new C12982f(this.f9024b + str));
                gVar.mo48144c("descr", new C12982f(URLEncoder.encode(this.f9027e, C6540C.UTF8_NAME)));
                String str2 = this.f9028f;
                if (str2 != null) {
                    gVar.mo48144c("loc", new C12982f(str2));
                }
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
            try {
                t_buscvideos.this.f8954t0.cancel();
            } catch (Exception unused) {
            }
            boolean z = str.indexOf("ANDROID:OK ID:") != -1;
            int i = R.string.error_http;
            if (z) {
                t_buscvideos t_buscvideos = t_buscvideos.this;
                C1855l[] lVarArr = t_buscvideos.f8964z.f7231O1;
                int i2 = t_buscvideos.f8943o;
                int i3 = lVarArr[i2].f7938n0 ? R.string.req_aprob_video : R.string.video_publicado;
                int i4 = t_buscvideos.f8921J;
                if ((i4 == 0 || i4 == this.f9024b) && (!lVarArr[i2].f7938n0 || t_buscvideos.f8920I == 7)) {
                    t_buscvideos.mo8380n();
                }
                i = i3;
            }
            AlertDialog create = new AlertDialog.Builder(t_buscvideos.this).setCancelable(false).setPositiveButton(t_buscvideos.this.getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(i).create();
            if (!t_buscvideos.this.f6656b.equals("")) {
                create.setOnShowListener(new C2200a(create));
            }
            create.show();
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: british.xnews2.t_buscvideos$u */
    private class C2201u extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f9032a;

        /* renamed from: b */
        String f9033b;

        /* renamed from: c */
        String f9034c;

        /* renamed from: d */
        int f9035d;

        /* renamed from: e */
        int f9036e;

        /* renamed from: british.xnews2.t_buscvideos$u$a */
        class C2202a implements DialogInterface.OnShowListener {
            C2202a() {
            }

            public void onShow(DialogInterface dialogInterface) {
                C1692config.m8168S0((ProgressBar) t_buscvideos.this.f8954t0.findViewById(16908301), t_buscvideos.this.f6656b);
            }
        }

        public C2201u(int i, String str, int i2, String str2, String str3) {
            this.f9032a = str;
            this.f9035d = i;
            this.f9036e = i2;
            this.f9033b = str2;
            this.f9034c = str3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            String str = "";
            C11188h hVar = new C11188h();
            C12831e eVar = new C12831e(C1692config.f7107G5 + "video-upload.e-droid.net/upload.php?busc=1&ida=" + 2260177);
            C12981e eVar2 = new C12981e(new File(this.f9032a));
            C12960g gVar = new C12960g();
            gVar.mo48144c("videoFile", eVar2);
            try {
                gVar.mo48144c("idusu", new C12982f(t_buscvideos.this.f8941n + str));
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
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00b3 A[SYNTHETIC, Splitter:B:25:0x00b3] */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.String r15) {
            /*
                r14 = this;
                java.lang.String r0 = "ANDROID:OK:-"
                int r0 = r15.indexOf(r0)
                r1 = -1
                r2 = 1
                r3 = 0
                if (r0 == r1) goto L_0x00b0
                int r0 = r0 + 12
                int r4 = r0 + 1
                java.lang.String r5 = "-"
                int r4 = r15.indexOf(r5, r4)
                java.lang.String r9 = r15.substring(r0, r4)
                int r4 = r4 + r2
                int r0 = r15.indexOf(r5, r4)
                java.lang.String r10 = r15.substring(r4, r0)
                java.lang.String r15 = "1"
                boolean r15 = r10.equals(r15)
                if (r15 == 0) goto L_0x002d
                java.lang.String r15 = "mp4"
                goto L_0x0045
            L_0x002d:
                java.lang.String r15 = "2"
                boolean r15 = r10.equals(r15)
                if (r15 == 0) goto L_0x0038
                java.lang.String r15 = "3gp"
                goto L_0x0045
            L_0x0038:
                java.lang.String r15 = "3"
                boolean r15 = r10.equals(r15)
                if (r15 == 0) goto L_0x0043
                java.lang.String r15 = "webm"
                goto L_0x0045
            L_0x0043:
                java.lang.String r15 = ""
            L_0x0045:
                boolean r0 = r15.isEmpty()
                if (r0 != 0) goto L_0x00b0
                java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0096 }
                java.lang.String r4 = r14.f9032a     // Catch:{ Exception -> 0x0096 }
                r0.<init>(r4)     // Catch:{ Exception -> 0x0096 }
                british.xnews2.t_buscvideos r4 = british.xnews2.t_buscvideos.this     // Catch:{ Exception -> 0x0096 }
                british.xnews2.config r5 = r4.f8964z     // Catch:{ Exception -> 0x0096 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0096 }
                r6.<init>()     // Catch:{ Exception -> 0x0096 }
                java.lang.String r7 = "vb"
                r6.append(r7)     // Catch:{ Exception -> 0x0096 }
                r6.append(r9)     // Catch:{ Exception -> 0x0096 }
                java.lang.String r7 = "."
                r6.append(r7)     // Catch:{ Exception -> 0x0096 }
                r6.append(r15)     // Catch:{ Exception -> 0x0096 }
                java.lang.String r15 = r6.toString()     // Catch:{ Exception -> 0x0096 }
                java.io.File r15 = r5.mo7517m0(r4, r15)     // Catch:{ Exception -> 0x0096 }
                java.lang.String r15 = r15.getAbsolutePath()     // Catch:{ Exception -> 0x0096 }
                java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0096 }
                r4.<init>(r15)     // Catch:{ Exception -> 0x0096 }
                r5 = 1024(0x400, float:1.435E-42)
                byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x0096 }
            L_0x0080:
                int r6 = r0.read(r5)     // Catch:{ Exception -> 0x0096 }
                if (r6 == r1) goto L_0x008a
                r4.write(r5, r3, r6)     // Catch:{ Exception -> 0x0096 }
                goto L_0x0080
            L_0x008a:
                r0.close()     // Catch:{ Exception -> 0x0096 }
                r4.flush()     // Catch:{ Exception -> 0x0096 }
                r4.close()     // Catch:{ Exception -> 0x0096 }
                r14.f9032a = r15     // Catch:{ Exception -> 0x0096 }
                goto L_0x009a
            L_0x0096:
                r15 = move-exception
                r15.printStackTrace()
            L_0x009a:
                british.xnews2.t_buscvideos$t r15 = new british.xnews2.t_buscvideos$t
                british.xnews2.t_buscvideos r7 = british.xnews2.t_buscvideos.this
                int r8 = r14.f9035d
                int r11 = r14.f9036e
                java.lang.String r12 = r14.f9033b
                java.lang.String r13 = r14.f9034c
                r6 = r15
                r6.<init>(r8, r9, r10, r11, r12, r13)
                java.lang.String[] r0 = new java.lang.String[r3]
                r15.execute(r0)
                goto L_0x00b1
            L_0x00b0:
                r2 = 0
            L_0x00b1:
                if (r2 != 0) goto L_0x00ba
                british.xnews2.t_buscvideos r15 = british.xnews2.t_buscvideos.this     // Catch:{ Exception -> 0x00ba }
                android.app.ProgressDialog r15 = r15.f8954t0     // Catch:{ Exception -> 0x00ba }
                r15.dismiss()     // Catch:{ Exception -> 0x00ba }
            L_0x00ba:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_buscvideos.C2201u.onPostExecute(java.lang.String):void");
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            t_buscvideos.this.f8954t0 = new ProgressDialog(t_buscvideos.this);
            t_buscvideos t_buscvideos = t_buscvideos.this;
            t_buscvideos.f8954t0.setMessage(t_buscvideos.getString(R.string.subiendo));
            t_buscvideos.this.f8954t0.setIndeterminate(true);
            if (Build.VERSION.SDK_INT > 20 && !t_buscvideos.this.f6656b.equals("")) {
                t_buscvideos.this.f8954t0.setOnShowListener(new C2202a());
            }
            t_buscvideos.this.f8954t0.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m8664q(int i, String str) {
        int i2 = 100;
        while (this.f8964z.mo7516l0(this, i2).exists()) {
            i2++;
        }
        this.f8964z.mo7516l0(this, 99).renameTo(this.f8964z.mo7516l0(this, i2));
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(this, Uri.parse(this.f8963y));
            new C2201u(i2, this.f8963y, i, str, mediaMetadataRetriever.extractMetadata(23)).execute(new String[0]);
        } catch (Exception unused) {
        }
    }

    /* renamed from: r */
    private void m8665r(Context context) {
        this.f6662h = new C2181e(context);
    }

    /* JADX WARNING: type inference failed for: r0v39, types: [java.net.URLConnection] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x03a8  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m8666s() {
        /*
            r33 = this;
            r1 = r33
            java.lang.String r2 = ""
            r4 = 1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            r0.<init>()     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            java.lang.String r5 = british.xnews2.C1692config.f7109I5     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            r0.append(r5)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            java.lang.String r5 = "/srv/obtener_buscvideos.php?idusu="
            r0.append(r5)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            long r5 = r1.f8941n     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            r0.append(r5)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            java.lang.String r5 = "&c="
            r0.append(r5)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            java.lang.String r5 = r1.f8959w     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            r0.append(r5)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            java.lang.String r5 = "&idsec="
            r0.append(r5)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            int r5 = r1.f8945p     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            r0.append(r5)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            java.lang.String r5 = "&tipo="
            r0.append(r5)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            int r5 = r1.f8920I     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            r0.append(r5)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            java.lang.String r5 = "&idcat="
            r0.append(r5)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            int r5 = r1.f8921J     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            r0.append(r5)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            java.lang.String r5 = "&idusuv="
            r0.append(r5)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            java.lang.String r5 = r1.f8957v     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            r0.append(r5)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            java.lang.String r5 = "&fila="
            r0.append(r5)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            java.util.ArrayList<british.xnews2.u> r5 = r1.f8929R     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            r0.append(r5)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            java.net.URL r5 = new java.net.URL     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            java.net.URLConnection r0 = r5.openConnection()     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            r5 = r0
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            r5.setDoInput(r4)     // Catch:{ Exception -> 0x00b2 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r5.setConnectTimeout(r0)     // Catch:{ Exception -> 0x00b2 }
            r5.setReadTimeout(r0)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r0 = "User-Agent"
            java.lang.String r6 = "Android Vinebre Software"
            r5.setRequestProperty(r0, r6)     // Catch:{ Exception -> 0x00b2 }
            java.io.InputStream r0 = r5.getInputStream()     // Catch:{ Exception -> 0x00b2 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00b2 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00b2 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x00b2 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x00b2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b2 }
            r0.<init>()     // Catch:{ Exception -> 0x00b2 }
        L_0x008e:
            java.lang.String r7 = r6.readLine()     // Catch:{ Exception -> 0x00b2 }
            if (r7 == 0) goto L_0x00a9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b2 }
            r8.<init>()     // Catch:{ Exception -> 0x00b2 }
            r8.append(r7)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r7 = "\n"
            r8.append(r7)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x00b2 }
            r0.append(r7)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x008e
        L_0x00a9:
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00b2 }
            r5.disconnect()
            r5 = r0
            goto L_0x00c3
        L_0x00b2:
            r0 = move-exception
            goto L_0x00ba
        L_0x00b4:
            r0 = move-exception
            r3 = 0
            goto L_0x03a6
        L_0x00b8:
            r0 = move-exception
            r5 = 0
        L_0x00ba:
            r0.printStackTrace()     // Catch:{ all -> 0x03a4 }
            if (r5 == 0) goto L_0x00c2
            r5.disconnect()
        L_0x00c2:
            r5 = r2
        L_0x00c3:
            java.lang.String r0 = "ANDROID:OK RESULT:"
            int r0 = r5.indexOf(r0)
            r6 = 0
            r1.f8934W = r6
            r7 = -1
            if (r0 == r7) goto L_0x039e
            android.content.SharedPreferences r8 = r1.f8958v0
            android.content.SharedPreferences$Editor r8 = r8.edit()
            r1.f8934W = r4
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r1.f8930S = r9
            java.lang.String r9 = "ANDROID:OK RESULT:0"
            int r9 = r5.indexOf(r9)
            if (r9 == r7) goto L_0x00e9
            r1.f8933V = r6
            goto L_0x00f3
        L_0x00e9:
            java.lang.String r9 = "ANDROID:OK RESULT:1"
            int r9 = r5.indexOf(r9)
            if (r9 == r7) goto L_0x00f3
            r1.f8933V = r4
        L_0x00f3:
            java.lang.String r9 = "@y@"
            int r0 = r5.indexOf(r9, r0)
            r10 = 0
        L_0x00fa:
            if (r0 == r7) goto L_0x037b
            int r0 = r0 + 3
            java.lang.String r11 = ";"
            int r12 = r5.indexOf(r11, r0)
            java.lang.String r0 = r5.substring(r0, r12)
            int r13 = java.lang.Integer.parseInt(r0)
            int r12 = r12 + r4
            int r0 = r5.indexOf(r11, r12)
            java.lang.String r12 = r5.substring(r12, r0)
            long r14 = java.lang.Long.parseLong(r12)
            int r0 = r0 + r4
            int r12 = r5.indexOf(r11, r0)
            java.lang.String r0 = r5.substring(r0, r12)
            int r12 = r12 + r4
            int r6 = r5.indexOf(r11, r12)
            java.lang.String r12 = r5.substring(r12, r6)
            int r6 = r6 + r4
            int r3 = r5.indexOf(r11, r6)
            java.lang.String r6 = r5.substring(r6, r3)
            int r3 = r3 + r4
            int r7 = r5.indexOf(r11, r3)
            java.lang.String r3 = r5.substring(r3, r7)
            int r7 = r7 + r4
            int r4 = r5.indexOf(r11, r7)
            java.lang.String r7 = r5.substring(r7, r4)
            int r7 = java.lang.Integer.parseInt(r7)
            r16 = 1
            int r4 = r4 + 1
            r17 = r10
            int r10 = r5.indexOf(r11, r4)
            java.lang.String r4 = r5.substring(r4, r10)
            int r4 = java.lang.Integer.parseInt(r4)
            int r10 = r10 + 1
            r18 = r8
            int r8 = r5.indexOf(r11, r10)
            java.lang.String r10 = r5.substring(r10, r8)
            r19 = r9
            java.lang.String r9 = "1"
            boolean r9 = r10.equals(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            int r8 = r8 + 1
            int r10 = r5.indexOf(r11, r8)
            java.lang.String r8 = r5.substring(r8, r10)
            int r8 = java.lang.Integer.parseInt(r8)
            int r10 = r10 + 1
            r20 = r8
            int r8 = r5.indexOf(r11, r10)
            java.lang.String r10 = r5.substring(r10, r8)
            int r10 = java.lang.Integer.parseInt(r10)
            int r8 = r8 + 1
            r21 = r10
            int r10 = r5.indexOf(r11, r8)
            java.lang.String r8 = r5.substring(r8, r10)
            int r10 = r10 + 1
            r22 = r9
            int r9 = r5.indexOf(r11, r10)
            java.lang.String r10 = r5.substring(r10, r9)
            int r9 = r9 + 1
            r23 = r10
            int r10 = r5.indexOf(r11, r9)
            java.lang.String r9 = r5.substring(r9, r10)
            int r10 = r10 + 1
            r24 = r9
            int r9 = r5.indexOf(r11, r10)
            java.lang.String r10 = r5.substring(r10, r9)
            int r9 = r9 + 1
            r25 = r10
            int r10 = r5.indexOf(r11, r9)
            java.lang.String r9 = r5.substring(r9, r10)
            int r10 = r10 + 1
            r26 = r9
            int r9 = r5.indexOf(r11, r10)
            java.lang.String r10 = r5.substring(r10, r9)
            int r9 = r9 + 1
            r27 = r10
            int r10 = r5.indexOf(r11, r9)
            java.lang.String r9 = r5.substring(r9, r10)
            int r10 = r10 + 1
            int r11 = r5.indexOf(r11, r10)
            java.lang.String r10 = r5.substring(r10, r11)
            r28 = r5
            java.util.ArrayList<java.lang.Long> r5 = r1.f8927P
            r29 = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r14)
            int r5 = r5.indexOf(r11)
            java.lang.String r11 = ".jpg"
            r30 = r10
            r10 = -1
            if (r5 != r10) goto L_0x0271
            java.util.ArrayList<java.lang.Long> r5 = r1.f8927P
            java.lang.Long r10 = java.lang.Long.valueOf(r14)
            r5.add(r10)
            british.xnews2.t_buscvideos$q r5 = new british.xnews2.t_buscvideos$q
            r10 = 0
            r5.<init>()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r14)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r5.f9007a = r10
            r5.f9008b = r8
            int r8 = java.lang.Integer.parseInt(r8)
            if (r8 <= 0) goto L_0x0266
            java.io.File r8 = new java.io.File
            java.io.File r10 = r1.f8939m
            r31 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r32 = r9
            java.lang.String r9 = "fperfil_"
            r2.append(r9)
            r2.append(r14)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r8.<init>(r10, r2)
            boolean r2 = r8.exists()
            if (r2 == 0) goto L_0x026a
            android.content.ContentResolver r2 = r33.getContentResolver()     // Catch:{ Exception -> 0x026a }
            android.net.Uri r8 = android.net.Uri.fromFile(r8)     // Catch:{ Exception -> 0x026a }
            android.graphics.Bitmap r2 = android.provider.MediaStore.Images.Media.getBitmap(r2, r8)     // Catch:{ Exception -> 0x026a }
            r8 = 1
            android.graphics.Bitmap r2 = british.xnews2.C1692config.m8188g0(r2, r8)     // Catch:{ Exception -> 0x026a }
            r5.f9010d = r2     // Catch:{ Exception -> 0x026a }
            goto L_0x026a
        L_0x0266:
            r31 = r2
            r32 = r9
        L_0x026a:
            java.util.ArrayList<british.xnews2.t_buscvideos$q> r2 = r1.f8926O
            r2.add(r5)
            r10 = 1
            goto L_0x0277
        L_0x0271:
            r31 = r2
            r32 = r9
            r10 = r17
        L_0x0277:
            british.xnews2.u r2 = new british.xnews2.u
            r2.<init>()
            r2.f10311m = r13
            r2.f10310l = r14
            r2.f10299a = r0
            r2.f10300b = r12
            java.lang.String r5 = british.xnews2.C1692config.m8200u(r6)
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r6 = "ddMMyy"
            r0.<init>(r6)
            r6 = 6
            r8 = 0
            java.lang.String r9 = r5.substring(r8, r6)     // Catch:{ Exception -> 0x029b }
            java.util.Date r0 = r0.parse(r9)     // Catch:{ Exception -> 0x029b }
            r8 = 1
            goto L_0x02a1
        L_0x029b:
            r0 = move-exception
            r0.printStackTrace()
            r0 = 0
            r8 = 0
        L_0x02a1:
            if (r8 == 0) goto L_0x0309
            java.util.Calendar r8 = java.util.Calendar.getInstance()
            java.util.Calendar r9 = java.util.Calendar.getInstance()
            r9.setTime(r0)
            r12 = 1
            int r14 = r9.get(r12)
            int r15 = r8.get(r12)
            if (r14 != r15) goto L_0x02cf
            int r9 = r9.get(r6)
            int r8 = r8.get(r6)
            if (r9 != r8) goto L_0x02cf
            android.content.res.Resources r0 = r33.getResources()
            r8 = 2131820893(0x7f11015d, float:1.9274514E38)
            java.lang.String r0 = r0.getString(r8)
            goto L_0x02d7
        L_0x02cf:
            java.text.DateFormat r8 = android.text.format.DateFormat.getDateFormat(r33)
            java.lang.String r0 = r8.format(r0)
        L_0x02d7:
            r8 = 10
            java.lang.String r5 = r5.substring(r6, r8)
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            java.lang.String r8 = "HHmm"
            r6.<init>(r8)
            java.util.Date r5 = r6.parse(r5)     // Catch:{ Exception -> 0x0305 }
            java.text.DateFormat r6 = android.text.format.DateFormat.getTimeFormat(r33)     // Catch:{ Exception -> 0x0305 }
            java.lang.String r5 = r6.format(r5)     // Catch:{ Exception -> 0x0305 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0305 }
            r6.<init>()     // Catch:{ Exception -> 0x0305 }
            r6.append(r0)     // Catch:{ Exception -> 0x0305 }
            java.lang.String r0 = " "
            r6.append(r0)     // Catch:{ Exception -> 0x0305 }
            r6.append(r5)     // Catch:{ Exception -> 0x0305 }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x0305 }
            goto L_0x030b
        L_0x0305:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0309:
            r0 = r31
        L_0x030b:
            r2.f10301c = r0
            r2.f10302d = r3
            r2.f10313o = r7
            r2.f10314p = r4
            boolean r0 = r22.booleanValue()
            r2.f10318t = r0
            r3 = r20
            r2.f10315q = r3
            r3 = r21
            r2.f10316r = r3
            r3 = 1
            r2.f10312n = r3
            java.io.File r0 = new java.io.File
            java.io.File r4 = r1.f8939m
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "fbuscvideo_"
            r5.append(r6)
            r5.append(r13)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r0.<init>(r4, r5)
            boolean r0 = r0.exists()
            r2.f10317s = r0
            r4 = r23
            r2.f10303e = r4
            r4 = r24
            r2.f10304f = r4
            r4 = r25
            r2.f10305g = r4
            r4 = r26
            r2.f10306h = r4
            r4 = r27
            r2.f10307i = r4
            r4 = r32
            r2.f10308j = r4
            r4 = r30
            r2.f10309k = r4
            java.util.ArrayList<british.xnews2.u> r0 = r1.f8930S
            r0.add(r2)
            r5 = r19
            r2 = r28
            r4 = r29
            int r0 = r2.indexOf(r5, r4)
            r9 = r5
            r8 = r18
            r4 = 1
            r6 = 0
            r7 = -1
            r5 = r2
            r2 = r31
            goto L_0x00fa
        L_0x037b:
            r18 = r8
            r17 = r10
            r18.commit()
            if (r17 == 0) goto L_0x039e
            british.xnews2.t_buscvideos$s r0 = r1.f8928Q
            if (r0 == 0) goto L_0x0390
            android.os.AsyncTask$Status r0 = r0.getStatus()
            android.os.AsyncTask$Status r2 = android.os.AsyncTask.Status.RUNNING
            if (r0 == r2) goto L_0x039e
        L_0x0390:
            british.xnews2.t_buscvideos$s r0 = new british.xnews2.t_buscvideos$s
            r2 = 0
            r0.<init>()
            r1.f8928Q = r0
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            r0.execute(r2)
        L_0x039e:
            java.lang.Runnable r0 = r1.f8962x0
            r1.runOnUiThread(r0)
            return
        L_0x03a4:
            r0 = move-exception
            r3 = r5
        L_0x03a6:
            if (r3 == 0) goto L_0x03ab
            r3.disconnect()
        L_0x03ab:
            goto L_0x03ad
        L_0x03ac:
            throw r0
        L_0x03ad:
            goto L_0x03ac
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_buscvideos.m8666s():void");
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f8964z.mo7510j0(view, this);
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
                    if (this.f8964z.f7427t4 != 2) {
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
    /* renamed from: n */
    public void mo8380n() {
        Thread thread = this.f8938l0;
        if (thread != null) {
            try {
                thread.interrupt();
            } catch (Exception unused) {
            }
        }
        this.f8933V = false;
        this.f8934W = false;
        ArrayList<C2586u> arrayList = this.f8929R;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<C2586u> arrayList2 = this.f8930S;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ArrayList<Integer> arrayList3 = this.f8931T;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
        this.f8936Y.notifyDataSetChanged();
        findViewById(R.id.pb_videos).setVisibility(0);
        Thread thread2 = new Thread((ThreadGroup) null, this.f8932U, "buscandoelems");
        this.f8938l0 = thread2;
        thread2.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public Dialog mo8381o() {
        int i;
        int i2;
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.buscvideos_filtros);
        dialog.setTitle(getResources().getString(R.string.selecciona));
        TextView textView = (TextView) dialog.findViewById(R.id.btn_aceptar);
        textView.setOnClickListener(new C2174a());
        if (Build.VERSION.SDK_INT > 20) {
            textView.setTextColor(Color.parseColor("#" + this.f6656b));
        }
        if (this.f8914C) {
            Spinner spinner = (Spinner) dialog.findViewById(R.id.sp_tipo);
            ArrayList arrayList = new ArrayList();
            C1855l[] lVarArr = this.f8964z.f7231O1;
            int i3 = this.f8943o;
            if (lVarArr[i3].f7932l0) {
                String str = lVarArr[i3].f7965y0;
                if (str.equals("")) {
                    str = getString(R.string.tipo_ultimos);
                }
                arrayList.add(str);
                this.f8919H[0] = 1;
                i2 = this.f8920I == 1 ? arrayList.size() - 1 : 0;
                i = 1;
            } else {
                i2 = 0;
                i = 0;
            }
            C1855l[] lVarArr2 = this.f8964z.f7231O1;
            int i4 = this.f8943o;
            if (lVarArr2[i4].f7923i0) {
                String str2 = lVarArr2[i4].f7959v0;
                if (str2.equals("")) {
                    str2 = getString(R.string.tipo_maspuntuados);
                }
                arrayList.add(str2);
                this.f8919H[i] = 2;
                i++;
                if (this.f8920I == 2) {
                    i2 = arrayList.size() - 1;
                }
            }
            C1855l[] lVarArr3 = this.f8964z.f7231O1;
            int i5 = this.f8943o;
            if (lVarArr3[i5].f7920h0) {
                String str3 = lVarArr3[i5].f7957u0;
                if (str3.equals("")) {
                    str3 = getString(R.string.tipo_masvistos);
                }
                arrayList.add(str3);
                this.f8919H[i] = 3;
                i++;
                if (this.f8920I == 3) {
                    i2 = arrayList.size() - 1;
                }
            }
            C1855l[] lVarArr4 = this.f8964z.f7231O1;
            int i6 = this.f8943o;
            if (lVarArr4[i6].f7929k0) {
                String str4 = lVarArr4[i6].f7963x0;
                if (str4.equals("")) {
                    str4 = getString(R.string.tipo_destacados);
                }
                arrayList.add(str4);
                this.f8919H[i] = 4;
                i++;
                if (this.f8920I == 4) {
                    i2 = arrayList.size() - 1;
                }
            }
            C1855l[] lVarArr5 = this.f8964z.f7231O1;
            int i7 = this.f8943o;
            if (lVarArr5[i7].f7935m0) {
                String str5 = lVarArr5[i7].f7967z0;
                if (str5.equals("")) {
                    str5 = getString(R.string.tipo_dist);
                }
                arrayList.add(str5);
                this.f8919H[i] = 5;
                i++;
                if (this.f8920I == 5) {
                    i2 = arrayList.size() - 1;
                }
            }
            C1855l[] lVarArr6 = this.f8964z.f7231O1;
            int i8 = this.f8943o;
            if (lVarArr6[i8].f7926j0) {
                String str6 = lVarArr6[i8].f7961w0;
                if (str6.equals("")) {
                    str6 = getString(R.string.tipo_fav);
                }
                arrayList.add(str6);
                this.f8919H[i] = 6;
                i++;
                if (this.f8920I == 6) {
                    i2 = arrayList.size() - 1;
                }
            }
            if (!this.f8917F) {
                String str7 = this.f8964z.f7231O1[this.f8943o].f7847A0;
                if (str7.equals("")) {
                    str7 = getString(R.string.tipo_propios);
                }
                arrayList.add(str7);
                this.f8919H[i] = 7;
                if (this.f8920I == 7) {
                    i2 = arrayList.size() - 1;
                }
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, arrayList);
            arrayAdapter.setDropDownViewResource(17367049);
            spinner.setAdapter(arrayAdapter);
            spinner.setSelection(i2);
            spinner.setVisibility(0);
        }
        if (this.f8915D) {
            Spinner spinner2 = (Spinner) dialog.findViewById(R.id.sp_cat);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(getString(R.string.todo));
            int i9 = 0;
            int i10 = 0;
            while (true) {
                C1855l[] lVarArr7 = this.f8964z.f7231O1;
                int i11 = this.f8943o;
                if (i9 >= lVarArr7[i11].f7917g0.length) {
                    break;
                }
                arrayList2.add(lVarArr7[i11].f7917g0[i9].f7653b);
                if (this.f8921J == this.f8964z.f7231O1[this.f8943o].f7917g0[i9].f7652a) {
                    i10 = arrayList2.size() - 1;
                }
                i9++;
            }
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, 17367048, arrayList2);
            arrayAdapter2.setDropDownViewResource(17367049);
            spinner2.setAdapter(arrayAdapter2);
            spinner2.setSelection(i10);
            spinner2.setVisibility(0);
        }
        return dialog;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r7 != r2) goto L_0x01a0
            r7 = 108(0x6c, float:1.51E-43)
            java.lang.String r3 = ""
            if (r6 == r7) goto L_0x011c
            r4 = 4
            if (r6 != r4) goto L_0x0010
            goto L_0x011c
        L_0x0010:
            if (r8 == 0) goto L_0x003a
            java.lang.String r6 = "finalizar"
            boolean r7 = r8.hasExtra(r6)
            if (r7 == 0) goto L_0x003a
            android.os.Bundle r7 = r8.getExtras()
            boolean r6 = r7.getBoolean(r6)
            if (r6 == 0) goto L_0x01a0
            android.os.Bundle r6 = r8.getExtras()
            java.lang.String r7 = "finalizar_app"
            boolean r6 = r6.getBoolean(r7)
            if (r6 != 0) goto L_0x0032
            r5.f6659e = r1
        L_0x0032:
            r5.setResult(r2, r8)
            r5.finish()
            goto L_0x01a1
        L_0x003a:
            if (r8 == 0) goto L_0x009b
            java.lang.String r6 = "elim_video"
            boolean r7 = r8.hasExtra(r6)
            if (r7 == 0) goto L_0x009b
            java.util.ArrayList<java.lang.Integer> r7 = r5.f8931T
            android.os.Bundle r0 = r8.getExtras()
            java.lang.String r0 = r0.getString(r6)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r7 = r7.indexOf(r0)
            if (r7 == r2) goto L_0x01a0
            java.util.ArrayList<java.lang.Integer> r0 = r5.f8931T
            r0.remove(r7)
            java.util.ArrayList<british.xnews2.u> r0 = r5.f8929R
            r0.remove(r7)
            java.io.File r7 = new java.io.File
            java.io.File r0 = r5.f8939m
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "fbuscvideo_"
            r2.append(r3)
            android.os.Bundle r8 = r8.getExtras()
            java.lang.String r6 = r8.getString(r6)
            r2.append(r6)
            java.lang.String r6 = ".jpg"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r7.<init>(r0, r6)
            boolean r6 = r7.exists()
            if (r6 == 0) goto L_0x0094
            r7.delete()
        L_0x0094:
            androidx.recyclerview.widget.RecyclerView$h r6 = r5.f8936Y
            r6.notifyDataSetChanged()
            goto L_0x01a0
        L_0x009b:
            if (r8 == 0) goto L_0x01a0
            java.lang.String r6 = "nlikesv"
            boolean r7 = r8.hasExtra(r6)
            if (r7 == 0) goto L_0x01a0
            java.util.ArrayList<java.lang.Integer> r7 = r5.f8931T
            android.os.Bundle r0 = r8.getExtras()
            java.lang.String r4 = "idv"
            java.lang.String r0 = r0.getString(r4)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r7 = r7.indexOf(r0)
            if (r7 == r2) goto L_0x00f4
            java.util.ArrayList<british.xnews2.u> r0 = r5.f8929R
            java.lang.Object r0 = r0.get(r7)
            british.xnews2.u r0 = (british.xnews2.C2586u) r0
            android.os.Bundle r2 = r8.getExtras()
            java.lang.String r6 = r2.getString(r6)
            int r6 = java.lang.Integer.parseInt(r6)
            r0.f10313o = r6
            java.util.ArrayList<british.xnews2.u> r6 = r5.f8929R
            java.lang.Object r6 = r6.get(r7)
            british.xnews2.u r6 = (british.xnews2.C2586u) r6
            android.os.Bundle r7 = r8.getExtras()
            java.lang.String r0 = "liked"
            java.lang.String r7 = r7.getString(r0)
            java.lang.String r0 = "1"
            boolean r7 = r7.equals(r0)
            r6.f10318t = r7
            androidx.recyclerview.widget.RecyclerView$h r6 = r5.f8936Y
            r6.notifyDataSetChanged()
        L_0x00f4:
            java.lang.String r6 = "idusu_abrir"
            java.lang.String r6 = r8.getStringExtra(r6)
            boolean r7 = r6.equals(r3)
            if (r7 != 0) goto L_0x01a0
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<british.xnews2.t_buscvideos> r0 = british.xnews2.t_buscvideos.class
            r7.<init>(r5, r0)
            java.lang.String r0 = "idusuv"
            r7.putExtra(r0, r6)
            java.lang.String r6 = "nombreusu_abrir"
            java.lang.String r6 = r8.getStringExtra(r6)
            java.lang.String r8 = "nombreusu"
            r7.putExtra(r8, r6)
            r5.startActivityForResult(r7, r1)
            goto L_0x01a0
        L_0x011c:
            java.lang.String r2 = "dt_foto98_temp."
            if (r6 != r7) goto L_0x013c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r7 = "mp4"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            british.xnews2.config r7 = r5.f8964z
            java.io.File r6 = r7.mo7507i0(r5, r6)
            java.lang.String r6 = r6.getAbsolutePath()
            goto L_0x0173
        L_0x013c:
            android.net.Uri r6 = r8.getData()
            android.content.Context r7 = r5.getApplicationContext()
            java.lang.String r7 = british.xnews2.C1692config.m8181b0(r6, r7)
            java.lang.String r8 = "."
            int r8 = r7.lastIndexOf(r8)
            int r8 = r8 + r0
            java.lang.String r7 = r7.substring(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            boolean r6 = british.xnews2.C1692config.m8179a1(r5, r6, r7)
            if (r6 != 0) goto L_0x0169
            return
        L_0x0169:
            british.xnews2.config r6 = r5.f8964z
            java.io.File r6 = r6.mo7507i0(r5, r7)
            java.lang.String r6 = r6.getAbsolutePath()
        L_0x0173:
            if (r6 == 0) goto L_0x01a0
            boolean r7 = r6.equals(r3)
            if (r7 != 0) goto L_0x01a0
            boolean r7 = r5.mo8398v(r6)
            if (r7 != 0) goto L_0x0182
            return
        L_0x0182:
            r5.f8963y = r6
            british.xnews2.config r6 = r5.f8964z
            british.xnews2.l[] r6 = r6.f7231O1
            int r7 = r5.f8943o
            r6 = r6[r7]
            boolean r6 = r6.f7950r0
            if (r6 != 0) goto L_0x019b
            boolean r6 = r5.f8918G
            if (r6 == 0) goto L_0x0195
            goto L_0x019b
        L_0x0195:
            int r6 = r5.f8923L
            r5.m8664q(r6, r3)
            goto L_0x01a0
        L_0x019b:
            android.app.Dialog r6 = r5.f8952s0
            r6.show()
        L_0x01a0:
            r0 = 0
        L_0x01a1:
            if (r0 != 0) goto L_0x01aa
            boolean r6 = r5.f8912A
            if (r6 == 0) goto L_0x01aa
            r5.finish()
        L_0x01aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_buscvideos.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onAdClicked(C3371Ad ad) {
    }

    public void onAdClosed() {
        if (this.f8960w0) {
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
        if (!this.f6659e || this.f8913B || !this.f8964z.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f8913B = true;
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
        if (view.getId() == R.id.ll_filtros) {
            this.f8950r0.show();
        } else if (view.getId() == R.id.btnperfil) {
            Intent intent = new Intent(this, preperfil.class);
            intent.putExtra("idsecc", this.f8964z.f7231O1[this.f8943o].f7964y);
            intent.putExtra("nocompletar", true);
            intent.putExtra("desde_buscvideos", true);
            startActivityForResult(intent, 0);
        } else {
            String str10 = "";
            if (view.getId() == R.id.btncrearvid) {
                AlertDialog create = new AlertDialog.Builder(this).setCancelable(true).setPositiveButton(getString(R.string.tomardecamara), new C2191m()).setNegativeButton(getString(R.string.selvideo), new C2190l()).setMessage(R.string.enviarvideo).create();
                if (!this.f6656b.equals(str10)) {
                    create.setOnShowListener(new C2192n(create));
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused) {
                }
            } else if (view.getId() == R.id.fila) {
                int g0 = this.f8935X.mo5131g0(view);
                if (g0 < this.f8929R.size() && g0 != -1) {
                    C2586u uVar = this.f8929R.get(g0);
                    Intent intent2 = new Intent(this, t_buscvideo.class);
                    String str11 = uVar.f10302d;
                    String str12 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    if (str11.equals(str12)) {
                        str9 = "mp4";
                    } else if (uVar.f10302d.equals("2")) {
                        str9 = "3gp";
                    } else if (uVar.f10302d.equals("3")) {
                        str9 = "webm";
                    } else {
                        return;
                    }
                    intent2.putExtra("url", "https://video.e-droid.net/files_busc/v" + uVar.f10311m + "_" + uVar.f10310l + "." + str9 + "?ida=" + 2260177);
                    intent2.putExtra("ind", this.f8943o);
                    StringBuilder sb = new StringBuilder();
                    sb.append(uVar.f10313o);
                    sb.append(str10);
                    intent2.putExtra("nlikes", sb.toString());
                    if (!uVar.f10318t) {
                        str12 = SessionDescription.SUPPORTED_SDP_VERSION;
                    }
                    intent2.putExtra("liked", str12);
                    intent2.putExtra("idv", uVar.f10311m + str10);
                    intent2.putExtra("indv", g0);
                    intent2.putExtra("idusuv", uVar.f10310l + str10);
                    intent2.putExtra("desde_videosdeusu", this.f8957v.equals(str10) ^ true);
                    C1855l[] lVarArr = this.f8964z.f7231O1;
                    int i = this.f8943o;
                    String str13 = lVarArr[i].f7950r0 ? uVar.f10299a : str10;
                    String str14 = lVarArr[i].f7953s0 ? uVar.f10300b : str10;
                    if (lVarArr[i].f7874O) {
                        str10 = uVar.f10301c;
                    }
                    intent2.putExtra("descr", str13);
                    intent2.putExtra("nombre", str14);
                    intent2.putExtra("fcrea", str10);
                    intent2.putExtra("coments", uVar.f10303e);
                    intent2.putExtra("fnac_d", uVar.f10304f);
                    intent2.putExtra("fnac_m", uVar.f10305g);
                    intent2.putExtra("fnac_a", uVar.f10306h);
                    intent2.putExtra("sexo", uVar.f10307i);
                    intent2.putExtra("privados", uVar.f10308j);
                    intent2.putExtra("nvideos", uVar.f10309k);
                    int indexOf = this.f8927P.indexOf(Long.valueOf(uVar.f10310l));
                    if (indexOf != -1) {
                        intent2.putExtra("vfoto", this.f8926O.get(indexOf).f9008b);
                    } else {
                        intent2.putExtra("vfoto", SessionDescription.SUPPORTED_SDP_VERSION);
                    }
                    startActivityForResult(intent2, 0);
                }
            } else {
                String str15 = this.f8964z.f7251R3;
                if ((str15 == null || str15.equals(str10)) && (((str = this.f8964z.f7281W3) == null || str.equals(str10)) && (((str2 = this.f8964z.f7250R2) == null || str2.equals(str10)) && (((str3 = this.f8964z.f7245Q3) == null || str3.equals(str10)) && (((str4 = this.f8964z.f7269U3) == null || str4.equals(str10)) && (((str5 = this.f8964z.f7275V3) == null || str5.equals(str10)) && (((str6 = this.f8964z.f7358j4) == null || str6.equals(str10)) && (((str7 = this.f8964z.f7287X3) == null || str7.equals(str10)) && ((str8 = this.f8964z.f7293Y3) == null || str8.equals(str10)))))))))) {
                    abrir_secc(view);
                    return;
                }
                String str16 = this.f8964z.f7251R3;
                if (str16 != null && !str16.equals(str10)) {
                    this.f6663i = new RewardedVideo((Context) this, this.f8964z.f7251R3);
                }
                String str17 = this.f8964z.f7245Q3;
                if (str17 != null) {
                    str17.equals(str10);
                }
                String str18 = this.f8964z.f7269U3;
                if (str18 != null && !str18.equals(str10)) {
                    this.f6664j = new RewardedVideoAd(this, this.f8964z.f7269U3);
                }
                String str19 = this.f8964z.f7275V3;
                if (str19 != null && !str19.equals(str10)) {
                    this.f6665k = new StartAppAd(this);
                }
                ProgressDialog progressDialog = new ProgressDialog(this);
                this.f6661g = progressDialog;
                this.f6660f = view;
                if (!this.f8964z.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
                    abrir_secc(view);
                }
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo8396t();
        this.f8950r0.dismiss();
        this.f8950r0 = mo8381o();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f8942n0;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f8942n0;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f8942n0 = this.f8964z.mo7474A0(this, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x019b, code lost:
        if (r0.f8958v0.getBoolean("email_confirmado", false) == false) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01ce, code lost:
        if (r0.f8958v0.getInt("fnac_a", 0) != 0) goto L_0x01d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0246 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0247  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            android.content.Context r2 = r20.getApplicationContext()
            british.xnews2.config r2 = (british.xnews2.C1692config) r2
            r0.f8964z = r2
            java.lang.String r3 = r2.f7313c1
            if (r3 != 0) goto L_0x0013
            r2.mo7490V0()
        L_0x0013:
            r0.m8665r(r0)
            british.xnews2.t_buscvideos$g r2 = new british.xnews2.t_buscvideos$g
            r2.<init>()
            r0.f6666l = r2
            android.content.Intent r2 = r20.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            r0.f8944o0 = r2
            java.lang.String r3 = "es_root"
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x0043
            if (r2 == 0) goto L_0x003f
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x003f
            android.os.Bundle r2 = r0.f8944o0
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
            british.xnews2.config r2 = r0.f8964z
            int r6 = r2.f7318d
            r0.f8943o = r6
            british.xnews2.l[] r2 = r2.f7231O1
            r7 = r2[r6]
            int r7 = r7.f7964y
            r0.f8945p = r7
            r7 = r2[r6]
            java.lang.String r7 = r7.f7916g
            r2 = r2[r6]
            java.lang.String r2 = r2.f7919h
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "#"
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            boolean r6 = british.xnews2.C1692config.m8153I(r6)
            r0.f8916E = r6
            british.xnews2.config r6 = r0.f8964z
            java.lang.String r6 = r6.f7368l1
            java.lang.String r6 = british.xnews2.C1692config.m8189h(r7, r6)
            r0.f6656b = r6
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 12
            if (r6 <= r9) goto L_0x009b
            boolean r6 = r0.f8916E
            if (r6 != 0) goto L_0x009b
            r6 = 2131886906(0x7f12033a, float:1.9408404E38)
            r0.setTheme(r6)
        L_0x009b:
            super.onCreate(r21)
            java.lang.String r6 = "sh"
            android.content.SharedPreferences r9 = r0.getSharedPreferences(r6, r5)
            r0.f8958v0 = r9
            java.lang.String r10 = "idusu"
            r11 = 0
            long r13 = r9.getLong(r10, r11)
            r0.f8941n = r13
            android.content.SharedPreferences r9 = r0.f8958v0
            java.lang.String r13 = "cod"
            java.lang.String r14 = ""
            java.lang.String r9 = r9.getString(r13, r14)
            r0.f8959w = r9
            int r9 = british.xnews2.C1692config.m8149E(r0, r4)
            r0.f8955u = r9
            android.os.Bundle r9 = r0.f8944o0
            java.lang.String r13 = "idusuv"
            java.lang.String r9 = r9.getString(r13, r14)
            r0.f8957v = r9
            android.content.SharedPreferences r9 = r0.f8958v0
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r11 = "ftipo_v_"
            r15.append(r11)
            british.xnews2.config r11 = r0.f8964z
            british.xnews2.l[] r11 = r11.f7231O1
            int r12 = r0.f8943o
            r11 = r11[r12]
            int r11 = r11.f7964y
            r15.append(r11)
            java.lang.String r11 = r15.toString()
            british.xnews2.config r12 = r0.f8964z
            british.xnews2.l[] r12 = r12.f7231O1
            int r15 = r0.f8943o
            r12 = r12[r15]
            int r12 = r12.f7941o0
            int r9 = r9.getInt(r11, r12)
            r0.f8920I = r9
            android.content.SharedPreferences r9 = r0.f8958v0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "fcat_v_"
            r11.append(r12)
            british.xnews2.config r12 = r0.f8964z
            british.xnews2.l[] r12 = r12.f7231O1
            int r15 = r0.f8943o
            r12 = r12[r15]
            int r12 = r12.f7964y
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            int r9 = r9.getInt(r11, r5)
            r0.f8921J = r9
            r0.f8922K = r5
            r9 = 0
        L_0x011f:
            british.xnews2.config r11 = r0.f8964z
            british.xnews2.l[] r11 = r11.f7231O1
            int r12 = r0.f8943o
            r15 = r11[r12]
            british.xnews2.e[] r15 = r15.f7917g0
            int r15 = r15.length
            if (r9 >= r15) goto L_0x013f
            int r15 = r0.f8921J
            r11 = r11[r12]
            british.xnews2.e[] r11 = r11.f7917g0
            r11 = r11[r9]
            int r11 = r11.f7652a
            if (r15 != r11) goto L_0x013c
            int r9 = r9 + r4
            r0.f8922K = r9
            goto L_0x013f
        L_0x013c:
            int r9 = r9 + 1
            goto L_0x011f
        L_0x013f:
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r9 = r9.getCountry()
            r0.f8961x = r9
            british.xnews2.config r9 = r0.f8964z
            british.xnews2.l[] r9 = r9.f7231O1
            int r11 = r0.f8943o
            r12 = r9[r11]
            int r12 = r12.f7851C0
            r0.f8947q = r12
            r12 = r9[r11]
            int r12 = r12.f7853D0
            r0.f8949r = r12
            r12 = r9[r11]
            int r12 = r12.f7855E0
            r0.f8951s = r12
            r9 = r9[r11]
            int r9 = r9.f7849B0
            r0.f8953t = r9
            android.content.SharedPreferences r9 = r0.f8958v0
            java.lang.String r11 = "nick"
            java.lang.String r9 = r9.getString(r11, r14)
            boolean r9 = r9.equals(r14)
            java.lang.String r11 = "fnac_a"
            java.lang.String r12 = "descr"
            java.lang.String r15 = "fnac_m"
            java.lang.String r4 = "sexo"
            java.lang.String r5 = "fnac_d"
            r16 = r13
            java.lang.String r13 = "desde_buscvideos"
            r17 = r10
            java.lang.String r10 = "idsecc"
            r18 = r6
            if (r9 != 0) goto L_0x0219
            british.xnews2.config r9 = r0.f8964z
            int r9 = r9.f7393o5
            r6 = 3
            if (r9 != r6) goto L_0x019f
            android.content.SharedPreferences r6 = r0.f8958v0
            java.lang.String r9 = "email_confirmado"
            r19 = r2
            r2 = 0
            boolean r6 = r6.getBoolean(r9, r2)
            if (r6 != 0) goto L_0x01a1
            goto L_0x021b
        L_0x019f:
            r19 = r2
        L_0x01a1:
            int r2 = r0.f8953t
            r6 = 2
            if (r2 != r6) goto L_0x01b3
            british.xnews2.config r2 = r0.f8964z
            r9 = 1
            java.io.File r2 = r2.mo7516l0(r0, r9)
            boolean r2 = r2.exists()
            if (r2 == 0) goto L_0x01ef
        L_0x01b3:
            int r2 = r0.f8947q
            if (r2 != r6) goto L_0x01d1
            android.content.SharedPreferences r2 = r0.f8958v0
            r6 = 0
            int r2 = r2.getInt(r5, r6)
            if (r2 == 0) goto L_0x01ef
            android.content.SharedPreferences r2 = r0.f8958v0
            int r2 = r2.getInt(r15, r6)
            if (r2 == 0) goto L_0x01ef
            android.content.SharedPreferences r2 = r0.f8958v0
            int r2 = r2.getInt(r11, r6)
            if (r2 == 0) goto L_0x01ef
            goto L_0x01d2
        L_0x01d1:
            r6 = 0
        L_0x01d2:
            int r2 = r0.f8949r
            r9 = 2
            if (r2 != r9) goto L_0x01df
            android.content.SharedPreferences r2 = r0.f8958v0
            int r2 = r2.getInt(r4, r6)
            if (r2 == 0) goto L_0x01ef
        L_0x01df:
            int r2 = r0.f8951s
            if (r2 != r9) goto L_0x0217
            android.content.SharedPreferences r2 = r0.f8958v0
            java.lang.String r2 = r2.getString(r12, r14)
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x0217
        L_0x01ef:
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<british.xnews2.preperfil> r6 = british.xnews2.preperfil.class
            r2.<init>(r0, r6)
            british.xnews2.config r6 = r0.f8964z
            british.xnews2.l[] r6 = r6.f7231O1
            int r9 = r0.f8943o
            r6 = r6[r9]
            int r6 = r6.f7964y
            r2.putExtra(r10, r6)
            r6 = 1
            r2.putExtra(r13, r6)
            boolean r9 = r0.f6659e
            if (r9 == 0) goto L_0x020e
            r2.putExtra(r3, r9)
        L_0x020e:
            r3 = 0
            r0.f6659e = r3
            r0.f8912A = r6
            r0.startActivityForResult(r2, r3)
            goto L_0x0242
        L_0x0217:
            r3 = 0
            goto L_0x0242
        L_0x0219:
            r19 = r2
        L_0x021b:
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<british.xnews2.chat_perfil> r6 = british.xnews2.chat_perfil.class
            r2.<init>(r0, r6)
            british.xnews2.config r6 = r0.f8964z
            british.xnews2.l[] r6 = r6.f7231O1
            int r9 = r0.f8943o
            r6 = r6[r9]
            int r6 = r6.f7964y
            r2.putExtra(r10, r6)
            r6 = 1
            r2.putExtra(r13, r6)
            boolean r9 = r0.f6659e
            if (r9 == 0) goto L_0x023a
            r2.putExtra(r3, r9)
        L_0x023a:
            r3 = 0
            r0.f6659e = r3
            r0.f8912A = r6
            r0.startActivityForResult(r2, r3)
        L_0x0242:
            boolean r2 = r0.f8912A
            if (r2 == 0) goto L_0x0247
            return
        L_0x0247:
            r2 = 2131558649(0x7f0d00f9, float:1.874262E38)
            r0.setContentView(r2)
            r20.mo8396t()
            british.xnews2.config r2 = r0.f8964z
            r2.mo7486N0(r0, r3)
            java.lang.String r2 = "search"
            java.lang.Object r2 = r0.getSystemService(r2)
            android.app.SearchManager r2 = (android.app.SearchManager) r2
            british.xnews2.t_buscvideos$h r3 = new british.xnews2.t_buscvideos$h
            r3.<init>()
            r2.setOnCancelListener(r3)
            british.xnews2.t_buscvideos$i r3 = new british.xnews2.t_buscvideos$i
            r3.<init>()
            r2.setOnDismissListener(r3)
            android.os.Bundle r2 = r0.f8944o0
            java.lang.String r3 = "abrir_buscvideo"
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L_0x029a
            british.xnews2.config r2 = r0.f8964z
            android.os.Bundle r6 = r0.f8944o0
            if (r6 == 0) goto L_0x0287
            java.lang.String r9 = "ad_entrar"
            boolean r6 = r6.containsKey(r9)
            if (r6 == 0) goto L_0x0287
            r6 = 1
            goto L_0x0288
        L_0x0287:
            r6 = 0
        L_0x0288:
            android.os.Bundle r9 = r0.f8944o0
            if (r9 == 0) goto L_0x0296
            java.lang.String r10 = "fb_entrar"
            boolean r9 = r9.containsKey(r10)
            if (r9 == 0) goto L_0x0296
            r9 = 1
            goto L_0x0297
        L_0x0296:
            r9 = 0
        L_0x0297:
            r2.mo7503f1(r0, r6, r9)
        L_0x029a:
            british.xnews2.config r2 = r0.f8964z
            r6 = 0
            british.xnews2.c r2 = r2.mo7474A0(r0, r6)
            r0.f8942n0 = r2
            british.xnews2.config r2 = r0.f8964z
            int r6 = r2.f7318d
            java.lang.String r9 = r0.f6656b
            r2.mo7488Q0(r0, r6, r9, r1)
            boolean r1 = r7.equals(r14)
            if (r1 != 0) goto L_0x02f4
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r6 = 2
            int[] r9 = new int[r6]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            int r6 = android.graphics.Color.parseColor(r6)
            r7 = 0
            r9[r7] = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            r7 = r19
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            int r6 = android.graphics.Color.parseColor(r6)
            r7 = 1
            r9[r7] = r6
            r1.<init>(r2, r9)
            r2 = 2131362530(0x7f0a02e2, float:1.8344843E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setBackgroundDrawable(r1)
        L_0x02f4:
            r1 = r18
            r2 = 0
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r2)
            r0.f8958v0 = r1
            r2 = r17
            r6 = 0
            long r1 = r1.getLong(r2, r6)
            r0.f8941n = r1
            java.io.File r1 = r20.getFilesDir()
            r0.f8939m = r1
            british.xnews2.config r1 = r0.f8964z
            int r1 = r1.f7163D
            if (r1 <= 0) goto L_0x0318
            android.content.SharedPreferences r1 = r0.f8958v0
            r1.registerOnSharedPreferenceChangeListener(r0)
        L_0x0318:
            british.xnews2.config r1 = r0.f8964z
            int r1 = r1.f7163D
            if (r1 <= 0) goto L_0x0354
            android.content.SharedPreferences r1 = r0.f8958v0
            java.lang.String r2 = "fondo_v_act"
            r6 = 0
            int r1 = r1.getInt(r2, r6)
            british.xnews2.config r2 = r0.f8964z
            int r6 = r2.f7163D
            if (r1 != r6) goto L_0x0354
            r1 = 2131362370(0x7f0a0242, float:1.8344519E38)
            android.view.View r6 = r0.findViewById(r1)     // Catch:{ Exception -> 0x0353 }
            android.widget.ImageView r6 = (android.widget.ImageView) r6     // Catch:{ Exception -> 0x0353 }
            british.xnews2.config r7 = r0.f8964z     // Catch:{ Exception -> 0x0353 }
            boolean r7 = r7.f7145A     // Catch:{ Exception -> 0x0353 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x0353 }
            british.xnews2.config r9 = r0.f8964z     // Catch:{ Exception -> 0x0353 }
            int r9 = r9.f7157C     // Catch:{ Exception -> 0x0353 }
            r2.mo7514k1(r6, r7, r9)     // Catch:{ Exception -> 0x0353 }
            british.xnews2.config r2 = r0.f8964z     // Catch:{ Exception -> 0x0353 }
            java.lang.String r6 = "fondo"
            android.view.View r1 = r0.findViewById(r1)     // Catch:{ Exception -> 0x0353 }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ Exception -> 0x0353 }
            r2.mo7493Y(r6, r1)     // Catch:{ Exception -> 0x0353 }
            goto L_0x0354
        L_0x0353:
        L_0x0354:
            british.xnews2.config r1 = r0.f8964z
            british.xnews2.l[] r1 = r1.f7231O1
            int r2 = r0.f8943o
            r1 = r1[r2]
            int r1 = r1.f7947q0
            r2 = 1
            if (r1 != r2) goto L_0x0386
            java.lang.String r1 = "window"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r1.getSize(r2)
            r1 = 16
            int r6 = british.xnews2.C1692config.m8149E(r0, r1)
            int r2 = r2.x
            r7 = 2
            int r6 = r6 * 2
            int r2 = r2 - r6
            int r2 = r2 * 9
            int r2 = r2 / r1
            r0.f8924M = r2
        L_0x0386:
            boolean r1 = r0.f8916E
            if (r1 == 0) goto L_0x039d
            android.content.res.Resources r1 = r20.getResources()
            r2 = 2131231485(0x7f0802fd, float:1.8079052E38)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResource(r1, r2)
            r2 = 1
            android.graphics.Bitmap r1 = british.xnews2.C1692config.m8188g0(r1, r2)
            r0.f8925N = r1
            goto L_0x03af
        L_0x039d:
            r2 = 1
            android.content.res.Resources r1 = r20.getResources()
            r6 = 2131231487(0x7f0802ff, float:1.8079056E38)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResource(r1, r6)
            android.graphics.Bitmap r1 = british.xnews2.C1692config.m8188g0(r1, r2)
            r0.f8925N = r1
        L_0x03af:
            r1 = 2131363122(0x7f0a0532, float:1.8346044E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f8946p0 = r1
            r1 = 2131363111(0x7f0a0527, float:1.8346022E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f8948q0 = r1
            java.lang.String r1 = r0.f8957v
            boolean r1 = r1.equals(r14)
            r2 = 8
            r6 = 2131361964(0x7f0a00ac, float:1.8343695E38)
            if (r1 != 0) goto L_0x0412
            r1 = 2131362339(0x7f0a0223, float:1.8344456E38)
            android.view.View r1 = r0.findViewById(r1)
            british.xnews2.t_buscvideos$j r7 = new british.xnews2.t_buscvideos$j
            r7.<init>()
            r1.setOnClickListener(r7)
            r1 = 2131363151(0x7f0a054f, float:1.8346103E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.os.Bundle r7 = r0.f8944o0
            java.lang.String r8 = "nombreusu"
            java.lang.String r7 = r7.getString(r8)
            r1.setText(r7)
            android.view.View r1 = r0.findViewById(r6)
            r1.setVisibility(r2)
            r1 = 2131361936(0x7f0a0090, float:1.8343638E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r2)
            r1 = 2131361937(0x7f0a0091, float:1.834364E38)
            android.view.View r1 = r0.findViewById(r1)
            r7 = 0
            r1.setVisibility(r7)
            goto L_0x0474
        L_0x0412:
            r7 = 0
            r1 = 2131361970(0x7f0a00b2, float:1.8343707E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            british.xnews2.config r9 = r0.f8964z
            int r9 = r9.f7169E
            if (r9 <= 0) goto L_0x0437
            android.content.SharedPreferences r9 = r0.f8958v0
            java.lang.String r10 = "v_ico_perfil_act"
            int r9 = r9.getInt(r10, r7)
            british.xnews2.config r7 = r0.f8964z
            int r10 = r7.f7169E
            if (r9 != r10) goto L_0x0437
            java.lang.String r9 = "ico_perfil"
            r7.mo7493Y(r9, r1)     // Catch:{ Exception -> 0x0436 }
            goto L_0x0437
        L_0x0436:
        L_0x0437:
            r1.setOnClickListener(r0)
            r7 = 0
            r1.setVisibility(r7)
            android.content.res.Resources r1 = r20.getResources()
            r7 = 2131231346(0x7f080272, float:1.807877E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r7)
            java.lang.String r7 = r0.f6656b
            boolean r7 = r7.equals(r14)
            if (r7 != 0) goto L_0x046b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            java.lang.String r8 = r0.f6656b
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.setColorFilter(r7, r8)
        L_0x046b:
            android.view.View r7 = r0.findViewById(r6)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r7.setImageDrawable(r1)
        L_0x0474:
            british.xnews2.config r1 = r0.f8964z
            british.xnews2.l[] r1 = r1.f7231O1
            int r7 = r0.f8943o
            r1 = r1[r7]
            r7 = 1
            r0.f8917F = r7
            r7 = 0
            r0.f8918G = r7
            r7 = 0
            r8 = 0
        L_0x0484:
            british.xnews2.e[] r9 = r1.f7917g0
            int r10 = r9.length
            if (r7 >= r10) goto L_0x04a9
            r10 = r9[r7]
            boolean r10 = r10.f7654c
            if (r10 == 0) goto L_0x0495
            british.xnews2.config r10 = r0.f8964z
            boolean r10 = r10.f7324e
            if (r10 == 0) goto L_0x04a0
        L_0x0495:
            r10 = 0
            r0.f8917F = r10
            int r8 = r8 + 1
            r9 = r9[r7]
            int r9 = r9.f7652a
            r0.f8923L = r9
        L_0x04a0:
            r9 = 1
            if (r8 <= r9) goto L_0x04a6
            r0.f8918G = r9
            goto L_0x04a9
        L_0x04a6:
            int r7 = r7 + 1
            goto L_0x0484
        L_0x04a9:
            boolean r7 = r0.f8917F
            if (r7 != 0) goto L_0x04b5
            android.view.View r2 = r0.findViewById(r6)
            r2.setOnClickListener(r0)
            goto L_0x04bc
        L_0x04b5:
            android.view.View r6 = r0.findViewById(r6)
            r6.setVisibility(r2)
        L_0x04bc:
            boolean r2 = r0.f8917F
            r6 = 1
            r2 = r2 ^ r6
            boolean r6 = r1.f7935m0
            if (r6 == 0) goto L_0x04c6
            int r2 = r2 + 1
        L_0x04c6:
            boolean r6 = r1.f7929k0
            if (r6 == 0) goto L_0x04cc
            int r2 = r2 + 1
        L_0x04cc:
            boolean r6 = r1.f7926j0
            if (r6 == 0) goto L_0x04d2
            int r2 = r2 + 1
        L_0x04d2:
            boolean r6 = r1.f7923i0
            if (r6 == 0) goto L_0x04d8
            int r2 = r2 + 1
        L_0x04d8:
            boolean r6 = r1.f7920h0
            if (r6 == 0) goto L_0x04de
            int r2 = r2 + 1
        L_0x04de:
            boolean r6 = r1.f7932l0
            if (r6 == 0) goto L_0x04e4
            int r2 = r2 + 1
        L_0x04e4:
            r6 = 1
            if (r2 <= r6) goto L_0x04e9
            r2 = 1
            goto L_0x04ea
        L_0x04e9:
            r2 = 0
        L_0x04ea:
            r0.f8914C = r2
            british.xnews2.e[] r1 = r1.f7917g0
            int r1 = r1.length
            if (r1 <= r6) goto L_0x04f3
            r1 = 1
            goto L_0x04f4
        L_0x04f3:
            r1 = 0
        L_0x04f4:
            r0.f8915D = r1
            r20.mo8397u()
            android.app.Dialog r1 = r20.mo8381o()
            r0.f8950r0 = r1
            android.app.Dialog r1 = r20.mo8395p()
            r0.f8952s0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f8929R = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f8931T = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f8926O = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f8927P = r1
            r1 = 2131362669(0x7f0a036d, float:1.8345125E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.f8935X = r1
            r2 = 1
            r1.setHasFixedSize(r2)
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r0)
            r0.f8937Z = r1
            androidx.recyclerview.widget.RecyclerView r2 = r0.f8935X
            r2.setLayoutManager(r1)
            british.xnews2.t_buscvideos$p r1 = new british.xnews2.t_buscvideos$p
            java.util.ArrayList<british.xnews2.u> r2 = r0.f8929R
            r1.<init>(r2)
            r0.f8936Y = r1
            androidx.recyclerview.widget.RecyclerView r2 = r0.f8935X
            r2.setAdapter(r1)
            british.xnews2.t_buscvideos$k r1 = new british.xnews2.t_buscvideos$k
            r1.<init>()
            r0.f8932U = r1
            java.lang.Thread r1 = new java.lang.Thread
            r2 = 0
            java.lang.Runnable r6 = r0.f8932U
            java.lang.String r7 = "buscandoelems"
            r1.<init>(r2, r6, r7)
            r0.f8938l0 = r1
            r1 = 2131362780(0x7f0a03dc, float:1.834535E38)
            android.view.View r1 = r0.findViewById(r1)
            r2 = 0
            r1.setVisibility(r2)
            java.lang.Thread r1 = r0.f8938l0
            r1.start()
            boolean r1 = r0.f8912A
            if (r1 != 0) goto L_0x06d9
            android.os.Bundle r1 = r0.f8944o0
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L_0x06d9
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<british.xnews2.t_buscvideo> r2 = british.xnews2.t_buscvideo.class
            r1.<init>(r0, r2)
            android.os.Bundle r2 = r0.f8944o0
            java.lang.String r2 = r2.getString(r3)
            android.os.Bundle r3 = r0.f8944o0
            java.lang.String r6 = "abrir_buscvideo_idusu"
            java.lang.String r3 = r3.getString(r6)
            android.os.Bundle r6 = r0.f8944o0
            java.lang.String r7 = "abrir_buscvideo_formato"
            java.lang.String r8 = "mp4"
            java.lang.String r6 = r6.getString(r7, r8)
            java.lang.String r7 = "1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x05a3
            java.lang.String r6 = "mp4"
            goto L_0x05ba
        L_0x05a3:
            java.lang.String r7 = "2"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x05ae
            java.lang.String r6 = "3gp"
            goto L_0x05ba
        L_0x05ae:
            java.lang.String r7 = "3"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x05b9
            java.lang.String r6 = "webm"
            goto L_0x05ba
        L_0x05b9:
            r6 = r14
        L_0x05ba:
            boolean r7 = r6.equals(r14)
            if (r7 != 0) goto L_0x06d9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "https://video.e-droid.net/files_busc/v"
            r7.append(r8)
            r7.append(r2)
            java.lang.String r8 = "_"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "."
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = "?ida="
            r7.append(r6)
            r6 = 2260177(0x227cd1, float:3.167183E-39)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "url"
            r1.putExtra(r7, r6)
            int r6 = r0.f8943o
            java.lang.String r7 = "ind"
            r1.putExtra(r7, r6)
            android.os.Bundle r6 = r0.f8944o0
            java.lang.String r7 = "abrir_buscvideo_nlikes"
            java.lang.String r6 = r6.getString(r7)
            java.lang.String r7 = "nlikes"
            r1.putExtra(r7, r6)
            android.os.Bundle r6 = r0.f8944o0
            java.lang.String r7 = "abrir_buscvideo_liked"
            java.lang.String r6 = r6.getString(r7)
            java.lang.String r7 = "liked"
            r1.putExtra(r7, r6)
            java.lang.String r6 = "idv"
            r1.putExtra(r6, r2)
            r2 = -1
            java.lang.String r6 = "indv"
            r1.putExtra(r6, r2)
            r2 = r16
            r1.putExtra(r2, r3)
            java.lang.String r2 = "desde_videosdeusu"
            r3 = 0
            r1.putExtra(r2, r3)
            british.xnews2.config r2 = r0.f8964z
            british.xnews2.l[] r2 = r2.f7231O1
            int r3 = r0.f8943o
            r2 = r2[r3]
            boolean r2 = r2.f7950r0
            if (r2 == 0) goto L_0x063d
            android.os.Bundle r2 = r0.f8944o0
            java.lang.String r3 = "abrir_buscvideo_descr"
            java.lang.String r2 = r2.getString(r3)
            goto L_0x063e
        L_0x063d:
            r2 = r14
        L_0x063e:
            british.xnews2.config r3 = r0.f8964z
            british.xnews2.l[] r3 = r3.f7231O1
            int r6 = r0.f8943o
            r3 = r3[r6]
            boolean r3 = r3.f7953s0
            if (r3 == 0) goto L_0x0653
            android.os.Bundle r3 = r0.f8944o0
            java.lang.String r6 = "abrir_buscvideo_nombre"
            java.lang.String r3 = r3.getString(r6)
            goto L_0x0654
        L_0x0653:
            r3 = r14
        L_0x0654:
            british.xnews2.config r6 = r0.f8964z
            british.xnews2.l[] r6 = r6.f7231O1
            int r7 = r0.f8943o
            r6 = r6[r7]
            boolean r6 = r6.f7874O
            if (r6 == 0) goto L_0x0668
            android.os.Bundle r6 = r0.f8944o0
            java.lang.String r7 = "abrir_buscvideo_fcrea"
            java.lang.String r14 = r6.getString(r7)
        L_0x0668:
            r1.putExtra(r12, r2)
            java.lang.String r2 = "nombre"
            r1.putExtra(r2, r3)
            java.lang.String r2 = "fcrea"
            r1.putExtra(r2, r14)
            android.os.Bundle r2 = r0.f8944o0
            java.lang.String r3 = "abrir_buscvideo_coments"
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "coments"
            r1.putExtra(r3, r2)
            android.os.Bundle r2 = r0.f8944o0
            java.lang.String r3 = "abrir_buscvideo_fnac_d"
            java.lang.String r2 = r2.getString(r3)
            r1.putExtra(r5, r2)
            android.os.Bundle r2 = r0.f8944o0
            java.lang.String r3 = "abrir_buscvideo_fnac_m"
            java.lang.String r2 = r2.getString(r3)
            r1.putExtra(r15, r2)
            android.os.Bundle r2 = r0.f8944o0
            java.lang.String r3 = "abrir_buscvideo_fnac_a"
            java.lang.String r2 = r2.getString(r3)
            r1.putExtra(r11, r2)
            android.os.Bundle r2 = r0.f8944o0
            java.lang.String r3 = "abrir_buscvideo_sexo"
            java.lang.String r2 = r2.getString(r3)
            r1.putExtra(r4, r2)
            android.os.Bundle r2 = r0.f8944o0
            java.lang.String r3 = "abrir_buscvideo_privados"
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "privados"
            r1.putExtra(r3, r2)
            android.os.Bundle r2 = r0.f8944o0
            java.lang.String r3 = "abrir_buscvideo_nvideos"
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "nvideos"
            r1.putExtra(r3, r2)
            android.os.Bundle r2 = r0.f8944o0
            java.lang.String r3 = "abrir_buscvideo_vfoto"
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "vfoto"
            r1.putExtra(r3, r2)
            r2 = 0
            r0.startActivityForResult(r1, r2)
        L_0x06d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.t_buscvideos.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f8964z.f7384n3 == 0 || (cVar3 = this.f8942n0) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f8964z.f7384n3 == 0 || (cVar2 = this.f8942n0) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f8964z.f7384n3 == 0 || (cVar = this.f8942n0) == null || (adColonyAdView = cVar.f6889d) == null)) {
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

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        C2197r rVar = this.f8940m0;
        if (rVar != null) {
            try {
                rVar.cancel(true);
            } catch (Exception unused) {
            }
        }
        if (!(this.f8964z.f7384n3 == 0 || (cVar = this.f8942n0) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2184f());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 109) {
            return;
        }
        if (iArr == null || iArr.length <= 0 || !strArr[0].equals("android.permission.CAMERA") || iArr[0] != 0) {
            C1692config.m8148C0(this, "", getResources().getString(R.string.permisos), this.f6656b);
            return;
        }
        C1692config config = this.f8964z;
        config.mo7526t0(this, config.mo7507i0(this, "dt_foto98_temp.mp4"));
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        ArrayList<C2586u> arrayList = this.f8929R;
        if (arrayList != null && arrayList.size() > 0) {
            C2197r rVar = new C2197r();
            this.f8940m0 = rVar;
            rVar.execute(new String[0]);
        }
        if (this.f8964z.f7384n3 != 0 && (cVar = this.f8942n0) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f8960w0 = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f8960w0) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f8960w0 = true;
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
                this.f8964z.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f8964z.f7145A), this.f8964z.f7157C);
                ((ImageView) findViewById(R.id.iv_fondo)).setVisibility(8);
                this.f8964z.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
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
        this.f8960w0 = true;
        C1692config.m8175Y0(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public Dialog mo8395p() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.buscvideos_nuevo);
        dialog.setTitle(getResources().getString(R.string.enviarvideo));
        ((TextView) dialog.findViewById(R.id.btn_cancel)).setOnClickListener(new C2175b());
        TextView textView = (TextView) dialog.findViewById(R.id.btn_aceptar);
        textView.setOnClickListener(new C2176c());
        if (Build.VERSION.SDK_INT > 20) {
            textView.setTextColor(Color.parseColor("#" + this.f6656b));
        }
        Spinner spinner = (Spinner) dialog.findViewById(R.id.sp_cat);
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(R.string.busc_cat) + "..");
        int i = 0;
        while (true) {
            C1692config config = this.f8964z;
            C1855l[] lVarArr = config.f7231O1;
            int i2 = this.f8943o;
            if (i >= lVarArr[i2].f7917g0.length) {
                break;
            }
            if (!lVarArr[i2].f7917g0[i].f7654c || config.f7324e) {
                arrayList.add(lVarArr[i2].f7917g0[i].f7653b);
            }
            i++;
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter(arrayAdapter);
        if (arrayList.size() < 3) {
            spinner.setSelection(1);
        } else {
            spinner.setSelection(0);
            spinner.setVisibility(0);
        }
        if (this.f8964z.f7231O1[this.f8943o].f7950r0) {
            dialog.findViewById(R.id.tv_descr).setVisibility(0);
        }
        return dialog;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo8396t() {
        int q0 = this.f8964z.mo7522q0(this);
        int i = this.f8964z.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f8956u0 = listView;
            this.f8964z.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f8964z.f7231O1;
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
            int[] iArr = this.f8964z.f7249R1;
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
    /* renamed from: u */
    public void mo8397u() {
        String str;
        if (this.f8914C || this.f8915D) {
            findViewById(R.id.ll_filtros).setOnClickListener(this);
            findViewById(R.id.ll_filtros).setVisibility(0);
            if (this.f8914C) {
                int i = this.f8920I;
                String str2 = "";
                if (i == 1) {
                    str = this.f8964z.f7231O1[this.f8943o].f7965y0;
                    if (str.equals(str2)) {
                        str2 = getString(R.string.tipo_ultimos);
                        this.f8946p0.setText(str2);
                        this.f8946p0.setVisibility(0);
                    }
                } else if (i == 2) {
                    str = this.f8964z.f7231O1[this.f8943o].f7959v0;
                    if (str.equals(str2)) {
                        str2 = getString(R.string.tipo_maspuntuados);
                        this.f8946p0.setText(str2);
                        this.f8946p0.setVisibility(0);
                    }
                } else if (i == 3) {
                    str = this.f8964z.f7231O1[this.f8943o].f7957u0;
                    if (str.equals(str2)) {
                        str2 = getString(R.string.tipo_masvistos);
                        this.f8946p0.setText(str2);
                        this.f8946p0.setVisibility(0);
                    }
                } else if (i == 4) {
                    str = this.f8964z.f7231O1[this.f8943o].f7963x0;
                    if (str.equals(str2)) {
                        str2 = getString(R.string.tipo_destacados);
                        this.f8946p0.setText(str2);
                        this.f8946p0.setVisibility(0);
                    }
                } else if (i == 5) {
                    str = this.f8964z.f7231O1[this.f8943o].f7967z0;
                    if (str.equals(str2)) {
                        str2 = getString(R.string.tipo_dist);
                        this.f8946p0.setText(str2);
                        this.f8946p0.setVisibility(0);
                    }
                } else if (i == 6) {
                    str = this.f8964z.f7231O1[this.f8943o].f7961w0;
                    if (str.equals(str2)) {
                        str2 = getString(R.string.tipo_fav);
                        this.f8946p0.setText(str2);
                        this.f8946p0.setVisibility(0);
                    }
                } else {
                    if (i == 7) {
                        str = this.f8964z.f7231O1[this.f8943o].f7847A0;
                        if (str.equals(str2)) {
                            str2 = getString(R.string.tipo_propios);
                        }
                    }
                    this.f8946p0.setText(str2);
                    this.f8946p0.setVisibility(0);
                }
                str2 = str;
                this.f8946p0.setText(str2);
                this.f8946p0.setVisibility(0);
            } else {
                this.f8946p0.setVisibility(8);
            }
            if (this.f8915D) {
                int i2 = this.f8922K;
                if (i2 == 0) {
                    this.f8948q0.setText(getString(R.string.todo));
                } else {
                    this.f8948q0.setText(this.f8964z.f7231O1[this.f8943o].f7917g0[i2 - 1].f7653b);
                }
                this.f8948q0.setVisibility(0);
            } else {
                this.f8948q0.setVisibility(8);
            }
            findViewById(R.id.tv_filtrar).setVisibility(8);
            return;
        }
        findViewById(R.id.ll_filtros).setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo8398v(String str) {
        Bitmap bitmap;
        File file = new File(str);
        boolean z = false;
        if (file.length() == 0) {
            return false;
        }
        if (file.length() > 111149056) {
            AlertDialog create = new AlertDialog.Builder(this).setCancelable(false).setPositiveButton(getString(R.string.aceptar), (DialogInterface.OnClickListener) null).setMessage(R.string.vidlargo).create();
            if (!this.f6656b.equals("")) {
                create.setOnShowListener(new C2193o(create));
            }
            create.show();
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
            return false;
        }
        Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, 1);
        try {
            createVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(this.f8964z.mo7516l0(this, 99)));
        } catch (Exception unused2) {
        }
        try {
            File l0 = this.f8964z.mo7516l0(this, 99);
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
            bitmap.compress(Bitmap.CompressFormat.JPEG, 75, new FileOutputStream(this.f8964z.mo7516l0(this, 99)));
        } catch (Exception unused3) {
        }
        return true;
    }

    public void videoEnded() {
        this.f8960w0 = true;
        C1692config.m8175Y0(this);
    }
}
