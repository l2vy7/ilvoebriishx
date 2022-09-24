package british.xnews2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
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

public class eliminarperfil extends Activity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: m */
    long f7678m;

    /* renamed from: n */
    int f7679n;

    /* renamed from: o */
    C1692config f7680o;

    /* renamed from: p */
    boolean f7681p;

    /* renamed from: q */
    boolean f7682q;

    /* renamed from: r */
    boolean f7683r;

    /* renamed from: s */
    C1603c f7684s;

    /* renamed from: t */
    boolean f7685t = false;

    /* renamed from: u */
    ListView f7686u;

    /* renamed from: v */
    SharedPreferences f7687v;

    /* renamed from: w */
    ProgressDialog f7688w;

    /* renamed from: x */
    Bundle f7689x;

    /* renamed from: british.xnews2.eliminarperfil$a */
    class C1776a extends AdColonyInterstitialListener {
        C1776a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            eliminarperfil eliminarperfil = eliminarperfil.this;
            if (eliminarperfil.f7685t) {
                eliminarperfil.abrir_secc(eliminarperfil.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            eliminarperfil.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            eliminarperfil.this.f6661g.cancel();
            eliminarperfil eliminarperfil = eliminarperfil.this;
            eliminarperfil.abrir_secc(eliminarperfil.f6660f);
        }
    }

    /* renamed from: british.xnews2.eliminarperfil$b */
    class C1777b implements SearchManager.OnCancelListener {
        C1777b() {
        }

        public void onCancel() {
            eliminarperfil eliminarperfil = eliminarperfil.this;
            eliminarperfil.f6657c = false;
            eliminarperfil.setResult(0);
        }
    }

    /* renamed from: british.xnews2.eliminarperfil$c */
    class C1778c implements SearchManager.OnDismissListener {
        C1778c() {
        }

        public void onDismiss() {
            eliminarperfil.this.f6658d = false;
        }
    }

    /* renamed from: british.xnews2.eliminarperfil$d */
    class C1779d implements DialogInterface.OnShowListener {
        C1779d() {
        }

        public void onShow(DialogInterface dialogInterface) {
            C1692config.m8168S0((ProgressBar) eliminarperfil.this.f7688w.findViewById(16908301), eliminarperfil.this.f7680o.f7368l1);
        }
    }

    /* renamed from: british.xnews2.eliminarperfil$e */
    class C1780e extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f7694a;

        /* renamed from: british.xnews2.eliminarperfil$e$a */
        class C1781a extends FullScreenContentCallback {
            C1781a() {
            }

            public void onAdDismissedFullScreenContent() {
                eliminarperfil eliminarperfil = eliminarperfil.this;
                if (eliminarperfil.f7685t) {
                    eliminarperfil.abrir_secc(eliminarperfil.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                eliminarperfil eliminarperfil = eliminarperfil.this;
                eliminarperfil.abrir_secc(eliminarperfil.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.eliminarperfil$e$b */
        class C1782b implements OnUserEarnedRewardListener {
            C1782b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C1780e eVar = C1780e.this;
                eliminarperfil.this.f7685t = true;
                C1692config.m8175Y0(eVar.f7694a);
            }
        }

        C1780e(Context context) {
            this.f7694a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            eliminarperfil.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C1781a());
            rewardedAd.show((Activity) this.f7694a, new C1782b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            eliminarperfil eliminarperfil = eliminarperfil.this;
            if (!eliminarperfil.f7680o.mo7502f(this.f7694a, eliminarperfil.f6663i)) {
                eliminarperfil.this.f6661g.cancel();
                eliminarperfil eliminarperfil2 = eliminarperfil.this;
                eliminarperfil2.abrir_secc(eliminarperfil2.f6660f);
            }
        }
    }

    /* renamed from: british.xnews2.eliminarperfil$f */
    class C1783f implements AdDisplayListener {
        C1783f() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            eliminarperfil eliminarperfil = eliminarperfil.this;
            if (eliminarperfil.f7685t) {
                eliminarperfil.abrir_secc(eliminarperfil.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.xnews2.eliminarperfil$g */
    private class C1784g extends AsyncTask<String, Void, Byte> {

        /* renamed from: british.xnews2.eliminarperfil$g$a */
        class C1785a implements DialogInterface.OnClickListener {
            C1785a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(eliminarperfil.this, preperfil.class);
                eliminarperfil eliminarperfil = eliminarperfil.this;
                if (eliminarperfil.f7681p) {
                    intent = C1692config.m8198r(intent, eliminarperfil.f7689x);
                } else {
                    intent.putExtra("idsecc", eliminarperfil.f7679n);
                }
                eliminarperfil eliminarperfil2 = eliminarperfil.this;
                if (eliminarperfil2.f7680o.f7427t4 != 2 || eliminarperfil2.f7683r) {
                    intent.putExtra("es_root", true);
                    eliminarperfil.this.f6659e = false;
                }
                intent.putExtra("desde_main", eliminarperfil.this.f7682q);
                intent.putExtra("desde_main_oblig", eliminarperfil.this.f7683r);
                eliminarperfil eliminarperfil3 = eliminarperfil.this;
                eliminarperfil3.f6657c = true;
                eliminarperfil3.startActivity(intent);
            }
        }

        /* renamed from: british.xnews2.eliminarperfil$g$b */
        class C1786b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f7701a;

            C1786b(AlertDialog alertDialog) {
                this.f7701a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f7701a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + eliminarperfil.this.f6656b));
            }
        }

        private C1784g() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b1, code lost:
            r0.disconnect();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00ab */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00b1  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                r7 = 2
                r0 = 0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ab }
                r1.<init>()     // Catch:{ Exception -> 0x00ab }
                java.lang.String r2 = british.xnews2.C1692config.f7109I5     // Catch:{ Exception -> 0x00ab }
                r1.append(r2)     // Catch:{ Exception -> 0x00ab }
                java.lang.String r2 = "/srv/eliminar_perfil.php?idusu="
                r1.append(r2)     // Catch:{ Exception -> 0x00ab }
                british.xnews2.eliminarperfil r2 = british.xnews2.eliminarperfil.this     // Catch:{ Exception -> 0x00ab }
                long r2 = r2.f7678m     // Catch:{ Exception -> 0x00ab }
                r1.append(r2)     // Catch:{ Exception -> 0x00ab }
                java.lang.String r2 = "&idapp="
                r1.append(r2)     // Catch:{ Exception -> 0x00ab }
                r2 = 2260177(0x227cd1, float:3.167183E-39)
                r1.append(r2)     // Catch:{ Exception -> 0x00ab }
                java.lang.String r2 = "&c="
                r1.append(r2)     // Catch:{ Exception -> 0x00ab }
                british.xnews2.eliminarperfil r2 = british.xnews2.eliminarperfil.this     // Catch:{ Exception -> 0x00ab }
                android.content.SharedPreferences r2 = r2.f7687v     // Catch:{ Exception -> 0x00ab }
                java.lang.String r3 = "cod"
                java.lang.String r4 = ""
                java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ Exception -> 0x00ab }
                r1.append(r2)     // Catch:{ Exception -> 0x00ab }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00ab }
                java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x00ab }
                r2.<init>(r1)     // Catch:{ Exception -> 0x00ab }
                java.net.URLConnection r1 = r2.openConnection()     // Catch:{ Exception -> 0x00ab }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x00ab }
                r0 = 1
                r1.setDoInput(r0)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                r2 = 10000(0x2710, float:1.4013E-41)
                r1.setConnectTimeout(r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                r1.setReadTimeout(r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                java.lang.String r2 = "User-Agent"
                java.lang.String r3 = "Android Vinebre Software"
                r1.setRequestProperty(r2, r3)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                java.io.InputStream r2 = r1.getInputStream()     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                r4.<init>(r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                r2.<init>()     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
            L_0x006c:
                java.lang.String r4 = r3.readLine()     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                if (r4 == 0) goto L_0x0087
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                r5.<init>()     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                r5.append(r4)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                java.lang.String r4 = "\n"
                r5.append(r4)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                r2.append(r4)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                goto L_0x006c
            L_0x0087:
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                java.lang.String r3 = "ANDROID:OK"
                int r2 = r2.indexOf(r3)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                r3 = -1
                if (r2 == r3) goto L_0x009c
                java.lang.Byte r7 = java.lang.Byte.valueOf(r0)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                r1.disconnect()
                return r7
            L_0x009c:
                java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch:{ Exception -> 0x00a7, all -> 0x00a4 }
                r1.disconnect()
                return r7
            L_0x00a4:
                r7 = move-exception
                r0 = r1
                goto L_0x00b5
            L_0x00a7:
                r0 = r1
                goto L_0x00ab
            L_0x00a9:
                r7 = move-exception
                goto L_0x00b5
            L_0x00ab:
                java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch:{ all -> 0x00a9 }
                if (r0 == 0) goto L_0x00b4
                r0.disconnect()
            L_0x00b4:
                return r7
            L_0x00b5:
                if (r0 == 0) goto L_0x00ba
                r0.disconnect()
            L_0x00ba:
                goto L_0x00bc
            L_0x00bb:
                throw r7
            L_0x00bc:
                goto L_0x00bb
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.eliminarperfil.C1784g.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            if (eliminarperfil.this.f7688w.isShowing()) {
                eliminarperfil.this.f7688w.dismiss();
            }
            if (b.byteValue() == 1) {
                try {
                    eliminarperfil eliminarperfil = eliminarperfil.this;
                    eliminarperfil.f7680o.mo7516l0(eliminarperfil, 1).delete();
                } catch (Exception unused) {
                }
                SharedPreferences.Editor edit = eliminarperfil.this.f7687v.edit();
                edit.clear();
                edit.commit();
                eliminarperfil.this.mo7636c();
                return;
            }
            AlertDialog create = new AlertDialog.Builder(eliminarperfil.this).setCancelable(false).setPositiveButton(eliminarperfil.this.getString(R.string.aceptar), new C1785a()).setMessage(R.string.error_http).create();
            if (!eliminarperfil.this.f6656b.equals("")) {
                create.setOnShowListener(new C1786b(create));
            }
            create.show();
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    private void m8295a(Context context) {
        this.f6662h = new C1780e(context);
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f7680o.mo7510j0(view, this);
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
                    if (this.f7680o.f7427t4 != 2) {
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
    public void mo7635b() {
        if (this.f7683r) {
            this.f7680o.mo7523r0(this, Boolean.FALSE);
            return;
        }
        int q0 = this.f7680o.mo7522q0(this);
        int i = this.f7680o.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f7686u = listView;
            this.f7680o.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f7680o.f7231O1;
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
            int[] iArr = this.f7680o.f7249R1;
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
    /* renamed from: c */
    public void mo7636c() {
        TextView textView = (TextView) findViewById(R.id.message_text);
        textView.setText(R.string.perfileliminado);
        textView.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
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
        if (this.f7685t) {
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

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9 = this.f7680o.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f7680o.f7281W3) == null || str.equals("")) && (((str2 = this.f7680o.f7250R2) == null || str2.equals("")) && (((str3 = this.f7680o.f7245Q3) == null || str3.equals("")) && (((str4 = this.f7680o.f7269U3) == null || str4.equals("")) && (((str5 = this.f7680o.f7275V3) == null || str5.equals("")) && (((str6 = this.f7680o.f7358j4) == null || str6.equals("")) && (((str7 = this.f7680o.f7287X3) == null || str7.equals("")) && ((str8 = this.f7680o.f7293Y3) == null || str8.equals("")))))))))) {
            abrir_secc(view);
            return;
        }
        String str10 = this.f7680o.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6663i = new RewardedVideo((Context) this, this.f7680o.f7251R3);
        }
        String str11 = this.f7680o.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f7680o.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6664j = new RewardedVideoAd(this, this.f7680o.f7269U3);
        }
        String str13 = this.f7680o.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6665k = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6661g = progressDialog;
        this.f6660f = view;
        if (!this.f7680o.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
            abrir_secc(view);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        this.f7680o = (C1692config) getApplicationContext();
        m8295a(this);
        this.f6666l = new C1776a();
        this.f6656b = C1692config.m8189h("FFFFFFFF", this.f7680o.f7368l1);
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        this.f7689x = extras;
        if (bundle == null) {
            this.f6659e = extras != null && extras.containsKey("es_root") && this.f7689x.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f7681p = this.f7689x.containsKey("externo");
        this.f7682q = this.f7689x.getBoolean("desde_main", false);
        this.f7683r = this.f7689x.getBoolean("desde_main_oblig", false);
        setContentView(R.layout.eliminarperfil);
        mo7635b();
        if (!this.f7683r) {
            this.f7680o.mo7486N0(this, false);
        }
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C1777b());
        searchManager.setOnDismissListener(new C1778c());
        this.f7684s = this.f7680o.mo7474A0(this, false);
        C1692config config = this.f7680o;
        int i = config.f7318d;
        if (this.f7682q) {
            str2 = config.f7313c1;
            str = config.f7319d1;
            this.f7679n = 0;
        } else {
            if (this.f7681p) {
                C1855l[] lVarArr = config.f7231O1;
                str3 = lVarArr[i].f7916g;
                str = lVarArr[i].f7919h;
            } else {
                C1855l[] lVarArr2 = config.f7231O1;
                str3 = lVarArr2[i].f7916g;
                str = lVarArr2[i].f7919h;
                this.f7679n = this.f7689x.getInt("idsecc");
            }
            str2 = str3;
        }
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f7687v = sharedPreferences;
        this.f7678m = sharedPreferences.getLong("idusu", 0);
        if (!str2.equals("")) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + str2), Color.parseColor("#" + str)}));
            if (C1692config.m8153I("#" + str2)) {
                ((TextView) findViewById(R.id.message_text)).setTextColor(-16777216);
            } else {
                ((TextView) findViewById(R.id.message_text)).setTextColor(-1);
            }
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f7688w = progressDialog;
        progressDialog.setMessage(getString(R.string.eliminando));
        this.f7688w.setIndeterminate(true);
        if (Build.VERSION.SDK_INT > 20) {
            this.f7688w.setOnShowListener(new C1779d());
        }
        this.f7688w.show();
        new C1784g().execute(new String[0]);
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f7680o.f7384n3 == 0 || (cVar3 = this.f7684s) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f7680o.f7384n3 == 0 || (cVar2 = this.f7684s) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f7680o.f7384n3 == 0 || (cVar = this.f7684s) == null || (adColonyAdView = cVar.f6889d) == null)) {
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
        if (!(this.f7680o.f7384n3 == 0 || (cVar = this.f7684s) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C1783f());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f7680o.f7384n3 != 0 && (cVar = this.f7684s) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f7685t = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f7685t) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f7685t = true;
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
        this.f7685t = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f7685t = true;
        C1692config.m8175Y0(this);
    }
}
