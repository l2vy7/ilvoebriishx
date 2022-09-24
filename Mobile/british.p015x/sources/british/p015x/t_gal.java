package british.p015x;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
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
import java.util.Iterator;

/* renamed from: british.x.t_gal */
public class t_gal extends Activity_ext_class implements C1592a, View.OnClickListener, SharedPreferences.OnSharedPreferenceChangeListener, AdapterView.OnItemClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: A */
    C2326k f9402A;

    /* renamed from: B */
    C2324i f9403B;

    /* renamed from: C */
    C2325j f9404C;

    /* renamed from: D */
    C2327l f9405D;

    /* renamed from: E */
    C1603c f9406E;

    /* renamed from: F */
    boolean f9407F = false;

    /* renamed from: G */
    ProgressDialog f9408G;

    /* renamed from: H */
    Bundle f9409H;

    /* renamed from: I */
    ListView f9410I;

    /* renamed from: J */
    SharedPreferences f9411J;

    /* renamed from: m */
    long f9412m;

    /* renamed from: n */
    int f9413n;

    /* renamed from: o */
    int f9414o = -1;

    /* renamed from: p */
    int f9415p;

    /* renamed from: q */
    C1692config f9416q;

    /* renamed from: r */
    boolean f9417r = false;

    /* renamed from: s */
    boolean f9418s;

    /* renamed from: t */
    boolean f9419t = false;

    /* renamed from: u */
    boolean f9420u;

    /* renamed from: v */
    boolean f9421v;

    /* renamed from: w */
    boolean f9422w;

    /* renamed from: x */
    ArrayList<C2323h> f9423x;

    /* renamed from: y */
    GridView f9424y;

    /* renamed from: z */
    C2321g f9425z;

    /* renamed from: british.x.t_gal$a */
    class C2311a extends AdColonyInterstitialListener {
        C2311a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_gal t_gal = t_gal.this;
            if (t_gal.f9407F) {
                t_gal.abrir_secc(t_gal.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_gal.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_gal.this.f6661g.cancel();
            t_gal t_gal = t_gal.this;
            t_gal.abrir_secc(t_gal.f6660f);
        }
    }

    /* renamed from: british.x.t_gal$b */
    class C2312b implements SearchManager.OnCancelListener {
        C2312b() {
        }

        public void onCancel() {
            t_gal t_gal = t_gal.this;
            t_gal.f6657c = false;
            t_gal.setResult(0);
        }
    }

    /* renamed from: british.x.t_gal$c */
    class C2313c implements SearchManager.OnDismissListener {
        C2313c() {
        }

        public void onDismiss() {
            t_gal.this.f6658d = false;
        }
    }

    /* renamed from: british.x.t_gal$d */
    class C2314d implements View.OnClickListener {

        /* renamed from: british.x.t_gal$d$a */
        class C2315a implements DialogInterface.OnClickListener {
            C2315a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C2325j jVar = t_gal.this.f9404C;
                if (jVar != null) {
                    jVar.cancel(true);
                }
            }
        }

        /* renamed from: british.x.t_gal$d$b */
        class C2316b implements DialogInterface.OnShowListener {
            C2316b() {
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = t_gal.this.f9408G.getButton(-2);
                button.setTextColor(Color.parseColor("#" + t_gal.this.f6656b));
            }
        }

        C2314d() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:26|(1:28)|29|30|31|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0153 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r7) {
            /*
                r6 = this;
                british.x.t_gal r7 = british.p015x.t_gal.this
                british.x.t_gal$j r7 = r7.f9404C
                if (r7 == 0) goto L_0x000e
                android.os.AsyncTask$Status r7 = r7.getStatus()
                android.os.AsyncTask$Status r0 = android.os.AsyncTask.Status.RUNNING
                if (r7 == r0) goto L_0x017a
            L_0x000e:
                british.x.t_gal r7 = british.p015x.t_gal.this
                r0 = 0
                r7.f9415p = r0
                java.io.File r7 = new java.io.File
                british.x.t_gal r1 = british.p015x.t_gal.this
                java.io.File r1 = r1.getFilesDir()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "img_s"
                r2.append(r3)
                british.x.t_gal r3 = british.p015x.t_gal.this
                british.x.config r4 = r3.f9416q
                british.x.l[] r4 = r4.f7231O1
                int r3 = r3.f9413n
                r3 = r4[r3]
                int r3 = r3.f7964y
                r2.append(r3)
                java.lang.String r3 = "_ico"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r7.<init>(r1, r2)
                british.x.t_gal r1 = british.p015x.t_gal.this
                british.x.config r2 = r1.f9416q
                british.x.l[] r2 = r2.f7231O1
                int r1 = r1.f9413n
                r1 = r2[r1]
                boolean r1 = r1.f7871M0
                r2 = 1
                if (r1 != 0) goto L_0x0055
                boolean r7 = r7.exists()
                if (r7 != 0) goto L_0x005c
            L_0x0055:
                british.x.t_gal r7 = british.p015x.t_gal.this
                int r1 = r7.f9415p
                int r1 = r1 + r2
                r7.f9415p = r1
            L_0x005c:
                british.x.t_gal r7 = british.p015x.t_gal.this
                java.util.ArrayList<british.x.t_gal$h> r7 = r7.f9423x
                if (r7 == 0) goto L_0x00af
                r7 = 0
            L_0x0063:
                r1 = 30
                if (r7 >= r1) goto L_0x00af
                british.x.t_gal r1 = british.p015x.t_gal.this
                java.util.ArrayList<british.x.t_gal$h> r1 = r1.f9423x
                int r1 = r1.size()
                if (r7 != r1) goto L_0x0072
                goto L_0x00af
            L_0x0072:
                java.io.File r1 = new java.io.File
                british.x.t_gal r3 = british.p015x.t_gal.this
                java.io.File r3 = r3.getFilesDir()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "gal_"
                r4.append(r5)
                british.x.t_gal r5 = british.p015x.t_gal.this
                java.util.ArrayList<british.x.t_gal$h> r5 = r5.f9423x
                java.lang.Object r5 = r5.get(r7)
                british.x.t_gal$h r5 = (british.p015x.t_gal.C2323h) r5
                java.lang.String r5 = r5.f9445a
                r4.append(r5)
                java.lang.String r5 = "_g.webp"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r1.<init>(r3, r4)
                boolean r1 = r1.exists()
                if (r1 != 0) goto L_0x00ac
                british.x.t_gal r1 = british.p015x.t_gal.this
                int r3 = r1.f9415p
                int r3 = r3 + r2
                r1.f9415p = r3
            L_0x00ac:
                int r7 = r7 + 1
                goto L_0x0063
            L_0x00af:
                british.x.t_gal r7 = british.p015x.t_gal.this
                int r1 = r7.f9415p
                if (r1 <= 0) goto L_0x0165
                android.content.Context r7 = r7.getApplicationContext()
                boolean r7 = british.p015x.C1692config.m8205x0(r7)
                if (r7 != 0) goto L_0x00e1
                british.x.t_gal r7 = british.p015x.t_gal.this
                android.content.res.Resources r0 = r7.getResources()
                r1 = 2131820789(0x7f1100f5, float:1.9274303E38)
                java.lang.String r0 = r0.getString(r1)
                british.x.t_gal r1 = british.p015x.t_gal.this
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131820788(0x7f1100f4, float:1.92743E38)
                java.lang.String r1 = r1.getString(r2)
                british.x.t_gal r2 = british.p015x.t_gal.this
                java.lang.String r2 = r2.f6656b
                british.p015x.C1692config.m8148C0(r7, r0, r1, r2)
                return
            L_0x00e1:
                british.x.t_gal r7 = british.p015x.t_gal.this
                android.app.ProgressDialog r1 = new android.app.ProgressDialog
                british.x.t_gal r3 = british.p015x.t_gal.this
                r1.<init>(r3)
                r7.f9408G = r1
                british.x.t_gal r7 = british.p015x.t_gal.this
                android.app.ProgressDialog r7 = r7.f9408G
                r7.setCancelable(r0)
                british.x.t_gal r7 = british.p015x.t_gal.this
                android.app.ProgressDialog r1 = r7.f9408G
                android.content.res.Resources r7 = r7.getResources()
                r3 = 2131820620(0x7f11004c, float:1.927396E38)
                java.lang.String r7 = r7.getString(r3)
                r1.setMessage(r7)
                british.x.t_gal r7 = british.p015x.t_gal.this
                android.app.ProgressDialog r7 = r7.f9408G
                r7.setProgressStyle(r2)
                british.x.t_gal r7 = british.p015x.t_gal.this
                android.app.ProgressDialog r7 = r7.f9408G
                r7.setProgress(r0)
                british.x.t_gal r7 = british.p015x.t_gal.this
                android.app.ProgressDialog r1 = r7.f9408G
                int r7 = r7.f9415p
                r1.setMax(r7)
                british.x.t_gal r7 = british.p015x.t_gal.this
                android.app.ProgressDialog r1 = r7.f9408G
                r2 = -2
                android.content.res.Resources r7 = r7.getResources()
                r3 = 2131820619(0x7f11004b, float:1.9273958E38)
                java.lang.String r7 = r7.getString(r3)
                british.x.t_gal$d$a r3 = new british.x.t_gal$d$a
                r3.<init>()
                r1.setButton(r2, r7, r3)
                british.x.t_gal r7 = british.p015x.t_gal.this
                java.lang.String r7 = r7.f6656b
                java.lang.String r1 = ""
                boolean r7 = r7.equals(r1)
                if (r7 != 0) goto L_0x014c
                british.x.t_gal r7 = british.p015x.t_gal.this
                android.app.ProgressDialog r7 = r7.f9408G
                british.x.t_gal$d$b r1 = new british.x.t_gal$d$b
                r1.<init>()
                r7.setOnShowListener(r1)
            L_0x014c:
                british.x.t_gal r7 = british.p015x.t_gal.this     // Catch:{ Exception -> 0x0153 }
                android.app.ProgressDialog r7 = r7.f9408G     // Catch:{ Exception -> 0x0153 }
                r7.show()     // Catch:{ Exception -> 0x0153 }
            L_0x0153:
                british.x.t_gal r7 = british.p015x.t_gal.this     // Catch:{ Exception -> 0x0165 }
                android.app.ProgressDialog r7 = r7.f9408G     // Catch:{ Exception -> 0x0165 }
                r1 = 16908299(0x102000b, float:2.387726E-38)
                android.view.View r7 = r7.findViewById(r1)     // Catch:{ Exception -> 0x0165 }
                android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ Exception -> 0x0165 }
                android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x0165 }
                r7.setTypeface(r1)     // Catch:{ Exception -> 0x0165 }
            L_0x0165:
                british.x.t_gal r7 = british.p015x.t_gal.this
                british.x.t_gal$j r1 = new british.x.t_gal$j
                british.x.t_gal r2 = british.p015x.t_gal.this
                r3 = 0
                r1.<init>()
                r7.f9404C = r1
                british.x.t_gal r7 = british.p015x.t_gal.this
                british.x.t_gal$j r7 = r7.f9404C
                java.lang.String[] r0 = new java.lang.String[r0]
                r7.execute(r0)
            L_0x017a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_gal.C2314d.onClick(android.view.View):void");
        }
    }

    /* renamed from: british.x.t_gal$e */
    class C2317e extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f9432a;

        /* renamed from: british.x.t_gal$e$a */
        class C2318a extends FullScreenContentCallback {
            C2318a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_gal t_gal = t_gal.this;
                if (t_gal.f9407F) {
                    t_gal.abrir_secc(t_gal.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_gal t_gal = t_gal.this;
                t_gal.abrir_secc(t_gal.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.x.t_gal$e$b */
        class C2319b implements OnUserEarnedRewardListener {
            C2319b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2317e eVar = C2317e.this;
                t_gal.this.f9407F = true;
                C1692config.m8175Y0(eVar.f9432a);
            }
        }

        C2317e(Context context) {
            this.f9432a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_gal.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2318a());
            rewardedAd.show((Activity) this.f9432a, new C2319b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_gal t_gal = t_gal.this;
            if (!t_gal.f9416q.mo7502f(this.f9432a, t_gal.f6663i)) {
                t_gal.this.f6661g.cancel();
                t_gal t_gal2 = t_gal.this;
                t_gal2.abrir_secc(t_gal2.f6660f);
            }
        }
    }

    /* renamed from: british.x.t_gal$f */
    class C2320f implements AdDisplayListener {
        C2320f() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_gal t_gal = t_gal.this;
            if (t_gal.f9407F) {
                t_gal.abrir_secc(t_gal.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.x.t_gal$g */
    public class C2321g extends ArrayAdapter<C2323h> {

        /* renamed from: b */
        private Context f9437b;

        /* renamed from: c */
        private int f9438c;

        /* renamed from: d */
        private ArrayList<C2323h> f9439d = new ArrayList<>();

        /* renamed from: british.x.t_gal$g$a */
        class C2322a {

            /* renamed from: a */
            ImageView f9441a;

            /* renamed from: b */
            ProgressBar f9442b;

            /* renamed from: c */
            ProgressBar f9443c;

            C2322a() {
            }
        }

        public C2321g(Context context, int i, ArrayList<C2323h> arrayList) {
            super(context, i, arrayList);
            this.f9438c = i;
            this.f9437b = context;
            this.f9439d = arrayList;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C2322a aVar;
            C2324i iVar;
            C2326k kVar;
            t_gal t_gal = t_gal.this;
            if (!t_gal.f9418s && t_gal.f9423x.size() - i < 10 && ((kVar = t_gal.this.f9402A) == null || kVar.getStatus() != AsyncTask.Status.RUNNING)) {
                t_gal t_gal2 = t_gal.this;
                t_gal t_gal3 = t_gal.this;
                t_gal2.f9402A = new C2326k(t_gal3.f9423x.size());
                t_gal.this.f9402A.execute(new String[0]);
            }
            t_gal t_gal4 = t_gal.this;
            Bitmap bitmap = null;
            if (t_gal4.f9419t && ((iVar = t_gal4.f9403B) == null || iVar.getStatus() != AsyncTask.Status.RUNNING)) {
                t_gal.this.f9403B = new C2324i();
                t_gal.this.f9403B.execute(new String[0]);
            }
            if (view == null) {
                view = ((Activity) this.f9437b).getLayoutInflater().inflate(this.f9438c, viewGroup, false);
                aVar = new C2322a();
                aVar.f9441a = (ImageView) view.findViewById(R.id.iv_usugrid);
                aVar.f9442b = (ProgressBar) view.findViewById(R.id.pb_foto);
                aVar.f9443c = (ProgressBar) view.findViewById(R.id.pb_foto_inv);
                if (Build.VERSION.SDK_INT > 20) {
                    C1692config.m8168S0(aVar.f9442b, t_gal.this.f9416q.f7368l1);
                    C1692config.m8168S0(aVar.f9443c, t_gal.this.f9416q.f7368l1);
                }
                view.setTag(aVar);
            } else {
                aVar = (C2322a) view.getTag();
            }
            C2323h hVar = this.f9439d.get(i);
            if (hVar.f9445a.equals("-1")) {
                aVar.f9441a.setImageBitmap((Bitmap) null);
                aVar.f9442b.setVisibility(8);
                aVar.f9443c.setVisibility(8);
                if (t_gal.this.f9420u) {
                    aVar.f9443c.setVisibility(0);
                } else {
                    aVar.f9442b.setVisibility(0);
                }
                return view;
            }
            aVar.f9442b.setVisibility(8);
            aVar.f9443c.setVisibility(8);
            if (hVar.f9451g || hVar.f9450f) {
                aVar.f9441a.setImageBitmap((Bitmap) null);
                if (t_gal.this.f9420u) {
                    aVar.f9443c.setVisibility(0);
                } else {
                    aVar.f9442b.setVisibility(0);
                }
            } else {
                try {
                    File filesDir = t_gal.this.getApplicationContext().getFilesDir();
                    File file = new File(filesDir, "gal_" + hVar.f9445a + ".webp");
                    if (file.exists()) {
                        bitmap = MediaStore.Images.Media.getBitmap(t_gal.this.getContentResolver(), Uri.fromFile(file));
                    }
                } catch (Exception unused) {
                }
                aVar.f9441a.setImageBitmap(bitmap);
                if (!hVar.f9453i) {
                    hVar.f9453i = true;
                    C1692config.m8172V(aVar.f9441a);
                }
            }
            if (hVar.f9452h) {
                if (t_gal.this.f9420u) {
                    aVar.f9443c.setVisibility(0);
                } else {
                    aVar.f9442b.setVisibility(0);
                }
            }
            return view;
        }
    }

    /* renamed from: british.x.t_gal$h */
    private class C2323h {

        /* renamed from: a */
        String f9445a;

        /* renamed from: b */
        String f9446b;

        /* renamed from: c */
        String f9447c;

        /* renamed from: d */
        String f9448d;

        /* renamed from: e */
        String f9449e;

        /* renamed from: f */
        boolean f9450f;

        /* renamed from: g */
        boolean f9451g;

        /* renamed from: h */
        boolean f9452h;

        /* renamed from: i */
        boolean f9453i;

        private C2323h() {
            this.f9450f = true;
            this.f9451g = false;
            this.f9452h = false;
            this.f9453i = false;
        }
    }

    /* renamed from: british.x.t_gal$i */
    private class C2324i extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f9455a;

        /* renamed from: b */
        Bitmap f9456b;

        /* renamed from: c */
        int f9457c;

        private C2324i() {
            this.f9457c = -1;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r5) {
            /*
                r4 = this;
                java.lang.String r5 = "0"
                java.lang.String r0 = r4.f9455a
                if (r0 != 0) goto L_0x0009
                java.lang.String r5 = "-1"
                return r5
            L_0x0009:
                java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0089 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0089 }
                r1.<init>()     // Catch:{ MalformedURLException -> 0x0089 }
                java.lang.String r2 = british.p015x.C1692config.f7108H5     // Catch:{ MalformedURLException -> 0x0089 }
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x0089 }
                java.lang.String r2 = "/srv/imgs/gal/"
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x0089 }
                java.lang.String r2 = r4.f9455a     // Catch:{ MalformedURLException -> 0x0089 }
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x0089 }
                java.lang.String r2 = "_p.png"
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x0089 }
                java.lang.String r1 = r1.toString()     // Catch:{ MalformedURLException -> 0x0089 }
                r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x0089 }
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
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{  }
                r4.f9456b = r2     // Catch:{  }
                r1.close()     // Catch:{  }
                r0.disconnect()     // Catch:{  }
                java.io.File r0 = new java.io.File     // Catch:{  }
                british.x.t_gal r1 = british.p015x.t_gal.this     // Catch:{  }
                android.content.Context r1 = r1.getApplicationContext()     // Catch:{  }
                java.io.File r1 = r1.getFilesDir()     // Catch:{  }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{  }
                r2.<init>()     // Catch:{  }
                java.lang.String r3 = "gal_"
                r2.append(r3)     // Catch:{  }
                java.lang.String r3 = r4.f9455a     // Catch:{  }
                r2.append(r3)     // Catch:{  }
                java.lang.String r3 = ".webp"
                r2.append(r3)     // Catch:{  }
                java.lang.String r2 = r2.toString()     // Catch:{  }
                r0.<init>(r1, r2)     // Catch:{  }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{  }
                r1.<init>(r0)     // Catch:{  }
                android.graphics.Bitmap r0 = r4.f9456b     // Catch:{  }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.WEBP     // Catch:{  }
                r3 = 100
                r0.compress(r2, r3, r1)     // Catch:{  }
                java.lang.String r5 = "1"
            L_0x0089:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_gal.C2324i.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            ArrayList<C2323h> arrayList;
            int i = this.f9457c;
            if (!(i == -1 || (arrayList = t_gal.this.f9423x) == null)) {
                try {
                    arrayList.get(i).f9451g = false;
                } catch (Exception unused) {
                    return;
                }
            }
            if (this.f9455a != null) {
                t_gal.this.f9425z.notifyDataSetChanged();
                new C2324i().execute(new String[0]);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            int firstVisiblePosition = t_gal.this.f9424y.getFirstVisiblePosition();
            while (firstVisiblePosition <= Math.max(t_gal.this.f9424y.getLastVisiblePosition(), 30) && (r1 = t_gal.this.f9423x) != null && firstVisiblePosition < r1.size()) {
                if (!t_gal.this.f9423x.get(firstVisiblePosition).f9450f || t_gal.this.f9423x.get(firstVisiblePosition).f9445a.equals("-1")) {
                    firstVisiblePosition++;
                } else {
                    this.f9455a = t_gal.this.f9423x.get(firstVisiblePosition).f9445a;
                    t_gal.this.f9423x.get(firstVisiblePosition).f9451g = true;
                    t_gal.this.f9423x.get(firstVisiblePosition).f9450f = false;
                    this.f9457c = firstVisiblePosition;
                    return;
                }
            }
        }
    }

    /* renamed from: british.x.t_gal$j */
    private class C2325j extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f9459a;

        /* renamed from: b */
        Bitmap f9460b;

        private C2325j() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            String str;
            SharedPreferences sharedPreferences;
            if (this.f9459a == -1) {
                t_gal t_gal = t_gal.this;
                if (t_gal.f9416q.f7231O1[t_gal.f9413n].f7875O0 == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C1692config.f7108H5);
                    sb.append("/srv/imgs/seccs/");
                    t_gal t_gal2 = t_gal.this;
                    sb.append(t_gal2.f9416q.f7231O1[t_gal2.f9413n].f7964y);
                    sb.append("_ico.png?v=");
                    t_gal t_gal3 = t_gal.this;
                    sb.append(t_gal3.f9416q.f7231O1[t_gal3.f9413n].f7877P0);
                    str = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C1692config.f7108H5);
                    sb2.append("/android-app-creator/icos_secc/");
                    t_gal t_gal4 = t_gal.this;
                    sb2.append(t_gal4.f9416q.f7231O1[t_gal4.f9413n].f7875O0);
                    sb2.append(".png");
                    str = sb2.toString();
                }
            } else {
                str = C1692config.f7108H5 + "/srv/imgs/gal/" + t_gal.this.f9423x.get(this.f9459a).f9445a + ".png";
            }
            try {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(60000);
                    httpURLConnection.connect();
                    int i = this.f9459a;
                    if (i == -1) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        this.f9460b = BitmapFactory.decodeStream(inputStream);
                        inputStream.close();
                        httpURLConnection.disconnect();
                        try {
                            t_gal t_gal5 = t_gal.this;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("img_s");
                            t_gal t_gal6 = t_gal.this;
                            sb3.append(t_gal6.f9416q.f7231O1[t_gal6.f9413n].f7964y);
                            sb3.append("_ico");
                            FileOutputStream openFileOutput = t_gal5.openFileOutput(sb3.toString(), 0);
                            this.f9460b.compress(Bitmap.CompressFormat.PNG, 100, openFileOutput);
                            openFileOutput.close();
                            t_gal t_gal7 = t_gal.this;
                            if (!(t_gal7.f9416q == null || (sharedPreferences = t_gal7.f9411J) == null)) {
                                int i2 = t_gal7.f9413n;
                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                C1855l[] lVarArr = t_gal.this.f9416q.f7231O1;
                                lVarArr[i2].f7869L0 = this.f9460b;
                                lVarArr[i2].f7871M0 = false;
                                edit.putInt("s" + t_gal.this.f9416q.f7231O1[i2].f7964y + "_ico", 0);
                                edit.putLong("ico_cargado", System.currentTimeMillis());
                                C1692config config = t_gal.this.f9416q;
                                if (config.f7427t4 == 1) {
                                    C1855l[] lVarArr2 = config.f7231O1;
                                    if (!lVarArr2[i2].f7848B) {
                                        config.f7261T1.get(lVarArr2[i2].f7966z).f7512b = this.f9460b;
                                        C1692config config2 = t_gal.this.f9416q;
                                        config2.f7261T1.get(config2.f7231O1[i2].f7966z).f7513c = false;
                                    }
                                }
                                edit.commit();
                            }
                            return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                        } catch (Exception | OutOfMemoryError unused) {
                            return SessionDescription.SUPPORTED_SDP_VERSION;
                        }
                    } else if (t_gal.this.f9423x.get(i).f9449e.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(t_gal.this.getApplicationContext().getFilesDir(), "gal_" + t_gal.this.f9423x.get(this.f9459a).f9445a + "_g.webp"));
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = inputStream2.read(bArr);
                                if (read != -1) {
                                    fileOutputStream.write(bArr, 0, read);
                                } else {
                                    fileOutputStream.flush();
                                    inputStream2.close();
                                    httpURLConnection.disconnect();
                                    return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                                }
                            }
                        } catch (Exception unused2) {
                            return SessionDescription.SUPPORTED_SDP_VERSION;
                        } catch (OutOfMemoryError e) {
                            e.printStackTrace();
                            return SessionDescription.SUPPORTED_SDP_VERSION;
                        }
                    } else {
                        InputStream inputStream3 = httpURLConnection.getInputStream();
                        this.f9460b = BitmapFactory.decodeStream(inputStream3);
                        inputStream3.close();
                        httpURLConnection.disconnect();
                        try {
                            this.f9460b.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(new File(t_gal.this.getApplicationContext().getFilesDir(), "gal_" + t_gal.this.f9423x.get(this.f9459a).f9445a + "_g.webp")));
                            return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return SessionDescription.SUPPORTED_SDP_VERSION;
                        } catch (OutOfMemoryError e3) {
                            e3.printStackTrace();
                            return SessionDescription.SUPPORTED_SDP_VERSION;
                        }
                    }
                } catch (IOException e4) {
                    e4.printStackTrace();
                    return SessionDescription.SUPPORTED_SDP_VERSION;
                }
            } catch (MalformedURLException e5) {
                e5.printStackTrace();
                return SessionDescription.SUPPORTED_SDP_VERSION;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                try {
                    t_gal.this.f9408G.incrementProgressBy(1);
                } catch (Exception unused) {
                }
                t_gal t_gal = t_gal.this;
                t_gal.f9404C = new C2325j();
                t_gal.this.f9404C.execute(new String[0]);
            } else if (str.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                try {
                    t_gal.this.f9408G.dismiss();
                    t_gal t_gal2 = t_gal.this;
                    if (t_gal2.f6656b != null) {
                        C1692config.m8148C0(t_gal2, t_gal2.getResources().getString(R.string.error_http_tit), t_gal.this.getResources().getString(R.string.error_http), t_gal.this.f6656b);
                    }
                } catch (Exception unused2) {
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            this.f9459a = -2;
            File filesDir = t_gal.this.getFilesDir();
            StringBuilder sb = new StringBuilder();
            sb.append("img_s");
            t_gal t_gal = t_gal.this;
            sb.append(t_gal.f9416q.f7231O1[t_gal.f9413n].f7964y);
            sb.append("_ico");
            File file = new File(filesDir, sb.toString());
            t_gal t_gal2 = t_gal.this;
            if (t_gal2.f9416q.f7231O1[t_gal2.f9413n].f7871M0 || !file.exists()) {
                this.f9459a = -1;
            } else if (t_gal.this.f9423x != null) {
                int i = 0;
                while (true) {
                    if (i >= 30 || i == t_gal.this.f9423x.size()) {
                        break;
                    }
                    File filesDir2 = t_gal.this.getFilesDir();
                    if (!new File(filesDir2, "gal_" + t_gal.this.f9423x.get(i).f9445a + "_g.webp").exists()) {
                        this.f9459a = i;
                        break;
                    }
                    i++;
                }
            }
            if (this.f9459a == -2) {
                cancel(false);
                try {
                    t_gal.this.f9408G.dismiss();
                } catch (Exception unused) {
                }
                t_gal t_gal3 = t_gal.this;
                t_gal3.f9416q.f7231O1[t_gal3.f9413n].f7939n1 = System.currentTimeMillis();
                Intent intent = new Intent();
                t_gal t_gal4 = t_gal.this;
                if (t_gal4.f9421v) {
                    intent.setPackage("com.whatsapp");
                } else if (t_gal4.f9422w) {
                    intent.setPackage("com.whatsapp.w4b");
                }
                intent.setAction("com.whatsapp.intent.action.ENABLE_STICKER_PACK");
                StringBuilder sb2 = new StringBuilder();
                t_gal t_gal5 = t_gal.this;
                sb2.append(t_gal5.f9416q.f7231O1[t_gal5.f9413n].f7964y);
                sb2.append("");
                intent.putExtra("sticker_pack_id", sb2.toString());
                intent.putExtra("sticker_pack_authority", "british.x.stickercontentprovider");
                t_gal t_gal6 = t_gal.this;
                intent.putExtra("sticker_pack_name", t_gal6.f9416q.f7231O1[t_gal6.f9413n].f7898a);
                t_gal.this.startActivityForResult(intent, 110);
            }
        }
    }

    /* renamed from: british.x.t_gal$k */
    private class C2326k extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f9462a;

        C2326k(int i) {
            this.f9462a = i;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x009a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0096 }
                r0.<init>()     // Catch:{ Exception -> 0x0096 }
                java.lang.String r1 = british.p015x.C1692config.f7109I5     // Catch:{ Exception -> 0x0096 }
                r0.append(r1)     // Catch:{ Exception -> 0x0096 }
                java.lang.String r1 = "/srv/obtener_gal.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x0096 }
                british.x.t_gal r1 = british.p015x.t_gal.this     // Catch:{ Exception -> 0x0096 }
                long r1 = r1.f9412m     // Catch:{ Exception -> 0x0096 }
                r0.append(r1)     // Catch:{ Exception -> 0x0096 }
                java.lang.String r1 = "&ind_ini="
                r0.append(r1)     // Catch:{ Exception -> 0x0096 }
                int r1 = r5.f9462a     // Catch:{ Exception -> 0x0096 }
                r0.append(r1)     // Catch:{ Exception -> 0x0096 }
                java.lang.String r1 = "&idsec="
                r0.append(r1)     // Catch:{ Exception -> 0x0096 }
                british.x.t_gal r1 = british.p015x.t_gal.this     // Catch:{ Exception -> 0x0096 }
                british.x.config r2 = r1.f9416q     // Catch:{ Exception -> 0x0096 }
                british.x.l[] r2 = r2.f7231O1     // Catch:{ Exception -> 0x0096 }
                int r1 = r1.f9413n     // Catch:{ Exception -> 0x0096 }
                r1 = r2[r1]     // Catch:{ Exception -> 0x0096 }
                int r1 = r1.f7964y     // Catch:{ Exception -> 0x0096 }
                r0.append(r1)     // Catch:{ Exception -> 0x0096 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0096 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0096 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0096 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x0096 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x0096 }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x008f, all -> 0x008d }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x008f, all -> 0x008d }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x008f, all -> 0x008d }
                r2.<init>(r6)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
                r1.<init>(r2)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008f, all -> 0x008d }
                r6.<init>()     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            L_0x006a:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x008f, all -> 0x008d }
                if (r2 == 0) goto L_0x0085
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008f, all -> 0x008d }
                r3.<init>()     // Catch:{ Exception -> 0x008f, all -> 0x008d }
                r3.append(r2)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x008f, all -> 0x008d }
                r6.append(r2)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
                goto L_0x006a
            L_0x0085:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x008f, all -> 0x008d }
                r0.disconnect()
                return r6
            L_0x008d:
                r6 = move-exception
                goto L_0x009e
            L_0x008f:
                r6 = r0
                goto L_0x0096
            L_0x0091:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x009e
            L_0x0096:
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x009d
                r6.disconnect()
            L_0x009d:
                return r0
            L_0x009e:
                if (r0 == 0) goto L_0x00a3
                r0.disconnect()
            L_0x00a3:
                goto L_0x00a5
            L_0x00a4:
                throw r6
            L_0x00a5:
                goto L_0x00a4
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_gal.C2326k.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            String str2;
            ArrayList<C2323h> arrayList = t_gal.this.f9423x;
            if (arrayList != null && arrayList.get(arrayList.size() - 1).f9445a.equals("-1")) {
                ArrayList<C2323h> arrayList2 = t_gal.this.f9423x;
                arrayList2.remove(arrayList2.size() - 1);
                t_gal.this.f9425z.notifyDataSetChanged();
            }
            if (str.contains("ANDROID:OK DATOS:")) {
                String[] split = str.substring(str.indexOf("DATOS:") + 6).split(";");
                int i = 0;
                while (true) {
                    str2 = "";
                    if (!split[i].equals("S") && !split[i].equals("N")) {
                        String[] split2 = split[i].split(",");
                        C2323h hVar = new C2323h();
                        hVar.f9445a = split2[0];
                        hVar.f9446b = split2[1].replace("@X@", ",").replace("@Y@", ";");
                        hVar.f9447c = split2[2];
                        if (split2.length > 3) {
                            hVar.f9448d = split2[3].replace("@X@", ",").replace("@Y@", ";");
                        } else {
                            hVar.f9448d = str2;
                        }
                        if (split2.length > 4) {
                            hVar.f9449e = split2[4];
                        } else {
                            hVar.f9449e = SessionDescription.SUPPORTED_SDP_VERSION;
                        }
                        File filesDir = t_gal.this.getApplicationContext().getFilesDir();
                        if (new File(filesDir, "gal_" + split2[0] + ".webp").exists()) {
                            hVar.f9451g = false;
                            hVar.f9450f = false;
                        }
                        t_gal.this.f9423x.add(hVar);
                        i++;
                    }
                }
                if (split[i].equals("N")) {
                    t_gal.this.f9418s = true;
                }
                t_gal.this.f9425z.notifyDataSetChanged();
                Iterator<C2323h> it = t_gal.this.f9423x.iterator();
                while (it.hasNext()) {
                    C2323h next = it.next();
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(next.f9445a);
                    sb.append("@");
                    sb.append(next.f9450f ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : SessionDescription.SUPPORTED_SDP_VERSION);
                    sb.append("@");
                    sb.append(next.f9446b.replace("/", "BARRA98").replace("@", "ARROBA98"));
                    sb.append("@");
                    sb.append(next.f9447c);
                    sb.append("@");
                    sb.append(next.f9448d.replace("/", "BARRA98").replace("@", "ARROBA98"));
                    sb.append("@");
                    sb.append(next.f9449e);
                    sb.append("/");
                    str2 = sb.toString();
                }
                SharedPreferences.Editor edit = t_gal.this.f9411J.edit();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("gal_a_");
                t_gal t_gal = t_gal.this;
                sb2.append(t_gal.f9416q.f7231O1[t_gal.f9413n].f7964y);
                edit.putString(sb2.toString(), str2);
                edit.commit();
                if (i > 0) {
                    C2324i iVar = t_gal.this.f9403B;
                    if (iVar == null || iVar.getStatus() != AsyncTask.Status.RUNNING) {
                        t_gal t_gal2 = t_gal.this;
                        t_gal2.f9403B = new C2324i();
                        t_gal.this.f9403B.execute(new String[0]);
                        t_gal.this.f9419t = true;
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (!t_gal.this.f9423x.isEmpty()) {
                ArrayList<C2323h> arrayList = t_gal.this.f9423x;
                if (arrayList.get(arrayList.size() - 1).f9445a.equals("-1")) {
                    return;
                }
            }
            C2323h hVar = new C2323h();
            hVar.f9445a = "-1";
            hVar.f9446b = "";
            t_gal.this.f9423x.add(hVar);
            t_gal.this.f9425z.notifyDataSetChanged();
        }
    }

    /* renamed from: british.x.t_gal$l */
    private class C2327l extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f9464a;

        /* renamed from: b */
        String f9465b;

        /* renamed from: c */
        String f9466c;

        /* renamed from: d */
        Bitmap f9467d;

        public C2327l(String str, int i, String str2) {
            this.f9465b = str;
            this.f9466c = str2;
            this.f9464a = i;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r8) {
            /*
                r7 = this;
                java.lang.String r8 = "1"
                java.lang.String r0 = "0"
                java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00b6 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x00b6 }
                r2.<init>()     // Catch:{ MalformedURLException -> 0x00b6 }
                java.lang.String r3 = british.p015x.C1692config.f7108H5     // Catch:{ MalformedURLException -> 0x00b6 }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x00b6 }
                java.lang.String r3 = "/srv/imgs/gal/"
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x00b6 }
                java.lang.String r3 = r7.f9465b     // Catch:{ MalformedURLException -> 0x00b6 }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x00b6 }
                java.lang.String r3 = ".png"
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x00b6 }
                java.lang.String r2 = r2.toString()     // Catch:{ MalformedURLException -> 0x00b6 }
                r1.<init>(r2)     // Catch:{ MalformedURLException -> 0x00b6 }
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{  }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{  }
                r2 = 1
                r1.setDoInput(r2)     // Catch:{  }
                r2 = 10000(0x2710, float:1.4013E-41)
                r1.setConnectTimeout(r2)     // Catch:{  }
                r2 = 60000(0xea60, float:8.4078E-41)
                r1.setReadTimeout(r2)     // Catch:{  }
                r1.connect()     // Catch:{  }
                java.io.File r2 = new java.io.File     // Catch:{  }
                british.x.t_gal r3 = british.p015x.t_gal.this     // Catch:{  }
                android.content.Context r3 = r3.getApplicationContext()     // Catch:{  }
                java.io.File r3 = r3.getFilesDir()     // Catch:{  }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{  }
                r4.<init>()     // Catch:{  }
                java.lang.String r5 = "gal_"
                r4.append(r5)     // Catch:{  }
                java.lang.String r5 = r7.f9465b     // Catch:{  }
                r4.append(r5)     // Catch:{  }
                java.lang.String r5 = "_g.webp"
                r4.append(r5)     // Catch:{  }
                java.lang.String r4 = r4.toString()     // Catch:{  }
                r2.<init>(r3, r4)     // Catch:{  }
                java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00b2 }
                r3.<init>(r2)     // Catch:{ Exception -> 0x00b2 }
                java.io.InputStream r2 = r1.getInputStream()     // Catch:{ Exception -> 0x00b2 }
                british.x.t_gal r4 = british.p015x.t_gal.this     // Catch:{ Exception -> 0x00b2 }
                java.util.ArrayList<british.x.t_gal$h> r4 = r4.f9423x     // Catch:{ Exception -> 0x00b2 }
                int r5 = r7.f9464a     // Catch:{ Exception -> 0x00b2 }
                java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x00b2 }
                british.x.t_gal$h r4 = (british.p015x.t_gal.C2323h) r4     // Catch:{ Exception -> 0x00b2 }
                java.lang.String r4 = r4.f9449e     // Catch:{ Exception -> 0x00b2 }
                boolean r4 = r4.equals(r8)     // Catch:{ Exception -> 0x00b2 }
                if (r4 == 0) goto L_0x009c
                r4 = 4096(0x1000, float:5.74E-42)
                byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x00b2 }
            L_0x0086:
                int r5 = r2.read(r4)     // Catch:{ Exception -> 0x00b2 }
                r6 = -1
                if (r5 == r6) goto L_0x0092
                r6 = 0
                r3.write(r4, r6, r5)     // Catch:{ Exception -> 0x00b2 }
                goto L_0x0086
            L_0x0092:
                r3.flush()     // Catch:{ Exception -> 0x00b2 }
                r2.close()     // Catch:{ Exception -> 0x00b2 }
                r1.disconnect()     // Catch:{ Exception -> 0x00b2 }
                goto L_0x00b1
            L_0x009c:
                android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ Exception -> 0x00b2 }
                r7.f9467d = r4     // Catch:{ Exception -> 0x00b2 }
                r2.close()     // Catch:{ Exception -> 0x00b2 }
                r1.disconnect()     // Catch:{ Exception -> 0x00b2 }
                android.graphics.Bitmap r1 = r7.f9467d     // Catch:{ Exception -> 0x00b2 }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.WEBP     // Catch:{ Exception -> 0x00b2 }
                r4 = 100
                r1.compress(r2, r4, r3)     // Catch:{ Exception -> 0x00b2 }
            L_0x00b1:
                return r8
            L_0x00b2:
                r8 = move-exception
                r8.printStackTrace()     // Catch:{  }
            L_0x00b6:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_gal.C2327l.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            t_gal.this.f9423x.get(this.f9464a).f9452h = false;
            t_gal.this.f9425z.notifyDataSetChanged();
            Intent intent = new Intent(t_gal.this, t_gal_foto.class);
            File filesDir = t_gal.this.getApplicationContext().getFilesDir();
            File file = new File(filesDir, "gal_" + this.f9465b + "_g.webp");
            StringBuilder sb = new StringBuilder();
            sb.append("file://");
            sb.append(file.getAbsolutePath());
            intent.putExtra("url", sb.toString());
            intent.putExtra("descr", this.f9466c);
            t_gal.this.startActivityForResult(intent, 0);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            t_gal.this.f9423x.get(this.f9464a).f9452h = true;
            t_gal.this.f9425z.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private void m8808a(Context context) {
        this.f6662h = new C2317e(context);
    }

    public void abrir_secc(View view) {
        if (view == null) {
            int i = this.f9414o;
            if (i != -1) {
                this.f9416q.mo7499d(this, i);
                return;
            }
            return;
        }
        C1845j j0 = this.f9416q.mo7510j0(view, this);
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
                    if (this.f9416q.f7427t4 != 2) {
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
    /* renamed from: b */
    public void mo8660b() {
        int q0 = this.f9416q.mo7522q0(this);
        int i = this.f9416q.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f9410I = listView;
            this.f9416q.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f9416q.f7231O1;
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
            int[] iArr = this.f9416q.f7249R1;
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

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 110) {
            if (i2 == 0 && intent != null) {
                intent.getStringExtra("validation_error");
            }
        } else if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
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
        if (this.f9407F) {
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
        if (!this.f6659e || this.f9417r || !this.f9416q.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f9417r = true;
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
        String str9 = this.f9416q.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f9416q.f7281W3) == null || str.equals("")) && (((str2 = this.f9416q.f7250R2) == null || str2.equals("")) && (((str3 = this.f9416q.f7245Q3) == null || str3.equals("")) && (((str4 = this.f9416q.f7269U3) == null || str4.equals("")) && (((str5 = this.f9416q.f7275V3) == null || str5.equals("")) && (((str6 = this.f9416q.f7358j4) == null || str6.equals("")) && (((str7 = this.f9416q.f7287X3) == null || str7.equals("")) && ((str8 = this.f9416q.f7293Y3) == null || str8.equals("")))))))))) {
            abrir_secc(view);
            return;
        }
        String str10 = this.f9416q.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6663i = new RewardedVideo((Context) this, this.f9416q.f7251R3);
        }
        String str11 = this.f9416q.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f9416q.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6664j = new RewardedVideoAd(this, this.f9416q.f7269U3);
        }
        String str13 = this.f9416q.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6665k = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6661g = progressDialog;
        this.f6660f = view;
        if (!this.f9416q.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
            abrir_secc(view);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo8660b();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f9406E;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f9406E;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f9406E = this.f9416q.mo7474A0(this, false);
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        C1692config config = (C1692config) getApplicationContext();
        this.f9416q = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8808a(this);
        this.f6666l = new C2311a();
        C1692config config2 = this.f9416q;
        C1855l[] lVarArr = config2.f7231O1;
        int i = config2.f7318d;
        String str = lVarArr[i].f7916g;
        String str2 = lVarArr[i].f7919h;
        this.f9420u = C1692config.m8153I("#" + str);
        this.f6656b = C1692config.m8189h(str, this.f9416q.f7368l1);
        if (Build.VERSION.SDK_INT > 12 && !this.f9420u) {
            setTheme(R.style.holonolight);
        }
        Bundle extras = getIntent().getExtras();
        this.f9409H = extras;
        if (bundle2 == null) {
            this.f6659e = extras != null && extras.containsKey("es_root") && this.f9409H.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle2.containsKey("es_root") && bundle2.getBoolean("es_root", false);
        }
        this.f9413n = this.f9416q.f7318d;
        super.onCreate(bundle);
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f9411J = sharedPreferences;
        this.f9412m = sharedPreferences.getLong("idusu", 0);
        setContentView(R.layout.t_gal);
        mo8660b();
        this.f9416q.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C2312b());
        searchManager.setOnDismissListener(new C2313c());
        C1692config config3 = this.f9416q;
        Bundle bundle3 = this.f9409H;
        boolean z = bundle3 != null && bundle3.containsKey("ad_entrar");
        Bundle bundle4 = this.f9409H;
        config3.mo7503f1(this, z, bundle4 != null && bundle4.containsKey("fb_entrar"));
        this.f9406E = this.f9416q.mo7474A0(this, false);
        C1692config config4 = this.f9416q;
        config4.mo7488Q0(this, config4.f7318d, this.f6656b, bundle2);
        if (!str.equals("")) {
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#" + str), Color.parseColor("#" + str2)}));
        }
        if (this.f9416q.f7163D > 0) {
            this.f9411J.registerOnSharedPreferenceChangeListener(this);
        }
        if (this.f9416q.f7163D > 0) {
            int i2 = this.f9411J.getInt("fondo_v_act", 0);
            C1692config config5 = this.f9416q;
            if (i2 == config5.f7163D) {
                try {
                    config5.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f9416q.f7145A), this.f9416q.f7157C);
                    this.f9416q.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
                } catch (Exception unused) {
                }
            }
        }
        if (this.f9416q.f7231O1[this.f9413n].f7933l1) {
            this.f9421v = false;
            this.f9422w = false;
            PackageManager packageManager = getPackageManager();
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo("com.whatsapp", 0);
                if (applicationInfo != null || applicationInfo.enabled) {
                    this.f9421v = true;
                }
            } catch (Exception unused2) {
            }
            if (!this.f9421v) {
                try {
                    ApplicationInfo applicationInfo2 = packageManager.getApplicationInfo("com.whatsapp.w4b", 0);
                    if (applicationInfo2 != null || applicationInfo2.enabled) {
                        this.f9422w = true;
                    }
                } catch (Exception unused3) {
                }
            }
            if (this.f9421v || this.f9422w) {
                ComponentName componentName = new ComponentName(this, "british.x.StickerContentProvider");
                if (packageManager.getComponentEnabledSetting(componentName) != 1) {
                    packageManager.setComponentEnabledSetting(componentName, 1, 1);
                }
                findViewById(R.id.env_stickers).setOnClickListener(new C2314d());
                findViewById(R.id.env_stickers).setVisibility(0);
            }
        }
        this.f9423x = new ArrayList<>();
        this.f9418s = false;
        this.f9424y = (GridView) findViewById(R.id.grid);
        C2321g gVar = new C2321g(this, R.layout.t_gal_row, this.f9423x);
        this.f9425z = gVar;
        this.f9424y.setAdapter(gVar);
        this.f9424y.setOnItemClickListener(this);
        this.f9419t = false;
        if (C1692config.m8205x0(this)) {
            C2326k kVar = new C2326k(0);
            this.f9402A = kVar;
            kVar.execute(new String[0]);
            return;
        }
        this.f9418s = true;
        if (this.f9411J.contains("gal_a_" + this.f9416q.f7231O1[this.f9413n].f7964y)) {
            for (String str3 : this.f9411J.getString("gal_a_" + this.f9416q.f7231O1[this.f9413n].f7964y, "").split("/")) {
                if (!str3.equals("")) {
                    String[] split = str3.split("@");
                    if (split.length == 4 || split.length == 5 || split.length == 6) {
                        C2323h hVar = new C2323h();
                        hVar.f9445a = split[0];
                        if (new File(getApplicationContext().getFilesDir(), "gal_" + hVar.f9445a + ".webp").exists()) {
                            hVar.f9450f = false;
                        } else {
                            hVar.f9450f = true;
                        }
                        hVar.f9446b = split[2].replace("BARRA98", "/").replace("ARROBA98", "@");
                        hVar.f9447c = split[3];
                        if (split.length == 5) {
                            hVar.f9448d = split[4].replace("BARRA98", "/").replace("ARROBA98", "@");
                        } else {
                            hVar.f9448d = "";
                        }
                        if (split.length == 6) {
                            hVar.f9449e = split[5];
                        } else {
                            hVar.f9449e = SessionDescription.SUPPORTED_SDP_VERSION;
                        }
                        this.f9423x.add(hVar);
                    }
                }
            }
            this.f9425z.notifyDataSetChanged();
        }
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f9416q.f7384n3 == 0 || (cVar3 = this.f9406E) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f9416q.f7384n3 == 0 || (cVar2 = this.f9406E) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f9416q.f7384n3 == 0 || (cVar = this.f9406E) == null || (adColonyAdView = cVar.f6889d) == null)) {
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
        int i2 = i;
        C2323h hVar = this.f9423x.get(i2);
        if (!hVar.f9445a.equals("-1")) {
            C2327l lVar = this.f9405D;
            if (lVar != null && lVar.getStatus() == AsyncTask.Status.RUNNING) {
                return;
            }
            if (!hVar.f9447c.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                View view2 = new View(this);
                int indexOf = C1692config.f7114N5.indexOf(Integer.valueOf(Integer.parseInt(hVar.f9447c)));
                view2.setId(indexOf);
                view2.setTag(R.id.TAG_IDSECC, Integer.valueOf(indexOf));
                String str = this.f9416q.f7251R3;
                if (str != null && !str.equals("")) {
                    this.f6663i = new RewardedVideo((Context) this, this.f9416q.f7251R3);
                }
                String str2 = this.f9416q.f7245Q3;
                if (str2 != null) {
                    str2.equals("");
                }
                String str3 = this.f9416q.f7269U3;
                if (str3 != null && !str3.equals("")) {
                    this.f6664j = new RewardedVideoAd(this, this.f9416q.f7269U3);
                }
                String str4 = this.f9416q.f7275V3;
                if (str4 != null && !str4.equals("")) {
                    this.f6665k = new StartAppAd(this);
                }
                ProgressDialog progressDialog = new ProgressDialog(this);
                this.f6661g = progressDialog;
                this.f6660f = null;
                this.f9414o = indexOf;
                if (!this.f9416q.mo7494Z0(this, view2, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, (View) null)) {
                    this.f9416q.mo7499d(this, indexOf);
                }
            } else if (!hVar.f9448d.equals("")) {
                C1845j k0 = this.f9416q.mo7513k0(hVar.f9448d, this);
                if (k0.f7843b) {
                    this.f6657c = true;
                    Intent intent = new Intent();
                    intent.putExtra("finalizar", true);
                    intent.putExtra("finalizar_app", k0.f7844c);
                    setResult(-1, intent);
                }
                if (k0.f7845d) {
                    startActivityForResult(k0.f7842a, 0);
                } else {
                    Intent intent2 = k0.f7842a;
                    if (intent2 != null) {
                        if (k0.f7843b) {
                            this.f6659e = false;
                            if (this.f9416q.f7427t4 != 2) {
                                intent2.putExtra("es_root", true);
                            }
                            try {
                                startActivity(k0.f7842a);
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
            } else {
                File filesDir = getFilesDir();
                File file = new File(filesDir, "gal_" + hVar.f9445a + "_g.webp");
                if (file.exists()) {
                    Intent intent3 = new Intent(this, t_gal_foto.class);
                    intent3.putExtra("url", "file://" + file.getAbsolutePath());
                    intent3.putExtra("idf", hVar.f9445a);
                    intent3.putExtra("descr", hVar.f9446b);
                    startActivityForResult(intent3, 0);
                } else if (C1692config.m8205x0(this)) {
                    C2327l lVar2 = new C2327l(hVar.f9445a, i2, hVar.f9446b);
                    this.f9405D = lVar2;
                    lVar2.execute(new String[0]);
                }
            }
        }
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f9416q.f7384n3 == 0 || (cVar = this.f9406E) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2320f());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        C2321g gVar = this.f9425z;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
        if (this.f9416q.f7384n3 != 0 && (cVar = this.f9406E) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f9407F = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f9407F) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f9407F = true;
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
                this.f9416q.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f9416q.f7145A), this.f9416q.f7157C);
                ((ImageView) findViewById(R.id.iv_fondo)).setVisibility(8);
                this.f9416q.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
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
        this.f9407F = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f9407F = true;
        C1692config.m8175Y0(this);
    }
}
