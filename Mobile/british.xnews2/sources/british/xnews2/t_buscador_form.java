package british.xnews2;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.fragment.app.C0690c;
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
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class t_buscador_form extends FragmentActivity_ext_class implements C1592a, View.OnClickListener, SharedPreferences.OnSharedPreferenceChangeListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: L */
    static int f8576L;

    /* renamed from: M */
    static int f8577M;

    /* renamed from: N */
    static int f8578N;

    /* renamed from: O */
    static TextView f8579O;

    /* renamed from: P */
    static TableLayout f8580P;

    /* renamed from: Q */
    static ImageView f8581Q;

    /* renamed from: B */
    C1692config f8582B;

    /* renamed from: C */
    boolean f8583C = false;

    /* renamed from: D */
    int f8584D = 0;

    /* renamed from: E */
    int[] f8585E;

    /* renamed from: F */
    int[] f8586F;

    /* renamed from: G */
    Bundle f8587G;

    /* renamed from: H */
    C1603c f8588H;

    /* renamed from: I */
    boolean f8589I = false;

    /* renamed from: J */
    SharedPreferences f8590J;

    /* renamed from: K */
    ListView f8591K;

    /* renamed from: british.xnews2.t_buscador_form$a */
    class C2084a extends AdColonyInterstitialListener {
        C2084a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_buscador_form t_buscador_form = t_buscador_form.this;
            if (t_buscador_form.f8589I) {
                t_buscador_form.abrir_secc(t_buscador_form.f6672u);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_buscador_form.this.f6673v.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_buscador_form.this.f6673v.cancel();
            t_buscador_form t_buscador_form = t_buscador_form.this;
            t_buscador_form.abrir_secc(t_buscador_form.f6672u);
        }
    }

    /* renamed from: british.xnews2.t_buscador_form$b */
    class C2085b implements SearchManager.OnCancelListener {
        C2085b() {
        }

        public void onCancel() {
            t_buscador_form t_buscador_form = t_buscador_form.this;
            t_buscador_form.f6669r = false;
            t_buscador_form.setResult(0);
        }
    }

    /* renamed from: british.xnews2.t_buscador_form$c */
    class C2086c implements SearchManager.OnDismissListener {
        C2086c() {
        }

        public void onDismiss() {
            t_buscador_form.this.f6670s = false;
        }
    }

    /* renamed from: british.xnews2.t_buscador_form$d */
    class C2087d extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f8595a;

        /* renamed from: british.xnews2.t_buscador_form$d$a */
        class C2088a extends FullScreenContentCallback {
            C2088a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_buscador_form t_buscador_form = t_buscador_form.this;
                if (t_buscador_form.f8589I) {
                    t_buscador_form.abrir_secc(t_buscador_form.f6672u);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_buscador_form t_buscador_form = t_buscador_form.this;
                t_buscador_form.abrir_secc(t_buscador_form.f6672u);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.t_buscador_form$d$b */
        class C2089b implements OnUserEarnedRewardListener {
            C2089b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2087d dVar = C2087d.this;
                t_buscador_form.this.f8589I = true;
                C1692config.m8175Y0(dVar.f8595a);
            }
        }

        C2087d(Context context) {
            this.f8595a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_buscador_form.this.f6673v.cancel();
            rewardedAd.setFullScreenContentCallback(new C2088a());
            rewardedAd.show((Activity) this.f8595a, new C2089b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_buscador_form t_buscador_form = t_buscador_form.this;
            if (!t_buscador_form.f8582B.mo7502f(this.f8595a, t_buscador_form.f6675x)) {
                t_buscador_form.this.f6673v.cancel();
                t_buscador_form t_buscador_form2 = t_buscador_form.this;
                t_buscador_form2.abrir_secc(t_buscador_form2.f6672u);
            }
        }
    }

    /* renamed from: british.xnews2.t_buscador_form$e */
    class C2090e implements AdDisplayListener {
        C2090e() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_buscador_form t_buscador_form = t_buscador_form.this;
            if (t_buscador_form.f8589I) {
                t_buscador_form.abrir_secc(t_buscador_form.f6672u);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.xnews2.t_buscador_form$f */
    public static class C2091f extends C0690c implements DatePickerDialog.OnDateSetListener {
        /* renamed from: U1 */
        public Dialog mo3721U1(Bundle bundle) {
            int i;
            int i2;
            int i3;
            Calendar instance = Calendar.getInstance();
            if (t_buscador_form.f8576L == 0) {
                i3 = instance.get(1);
                i2 = instance.get(2);
                i = instance.get(5);
            } else {
                i3 = t_buscador_form.f8578N;
                i2 = t_buscador_form.f8577M;
                i = t_buscador_form.f8576L;
            }
            int i4 = i3;
            int i5 = i2;
            return new DatePickerDialog(mo3443p(), this, i4, i5, i);
        }

        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            Date date;
            t_buscador_form.f8576L = i3;
            t_buscador_form.f8577M = i2;
            t_buscador_form.f8578N = i;
            boolean z = true;
            try {
                DateFormat dateInstance = DateFormat.getDateInstance(3, Locale.US);
                date = dateInstance.parse((t_buscador_form.f8577M + 1) + "/" + t_buscador_form.f8576L + "/" + t_buscador_form.f8578N);
            } catch (Exception unused) {
                date = null;
                z = false;
            }
            t_buscador_form.f8579O.setText(z ? DateFormat.getDateInstance().format(date) : "");
            t_buscador_form.f8580P.setVisibility(0);
            t_buscador_form.f8581Q.setVisibility(0);
        }
    }

    /* renamed from: B */
    private void m8556B(Context context) {
        this.f6674w = new C2087d(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo8192C() {
        int q0 = this.f8582B.mo7522q0(this);
        int i = this.f8582B.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f8591K = listView;
            this.f8582B.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f8582B.f7231O1;
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
            int[] iArr = this.f8582B.f7249R1;
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

    public void abrir_secc(View view) {
        C1845j j0 = this.f8582B.mo7510j0(view, this);
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
                    if (this.f8582B.f7427t4 != 2) {
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

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return;
        }
        if (intent != null && intent.hasExtra("idcat")) {
            Bundle extras = intent.getExtras();
            this.f8584D = extras.getInt("idcat", 0);
            ((TextView) findViewById(R.id.c_busc_cat)).setText(extras.getString("cat"));
            findViewById(R.id.tl_busc_cat).setVisibility(0);
            ((ImageView) findViewById(R.id.iv_cat_limpiar)).setVisibility(0);
        } else if (intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
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
        if (this.f8589I) {
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
        if (!this.f6671t || this.f8583C || !this.f8582B.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f8583C = true;
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
        int i = 1;
        if (view.getId() == R.id.button1) {
            Intent intent = new Intent(this, t_buscador.class);
            if (this.f8582B.f7158C0) {
                intent.putExtra("texto", ((EditText) findViewById(R.id.c_busc_texto)).getText().toString());
            }
            if (this.f8582B.f7164D0) {
                Spinner spinner = (Spinner) findViewById(R.id.sp_busc_cat);
                if (spinner.getVisibility() == 0) {
                    intent.putExtra("idcat", this.f8585E[spinner.getSelectedItemPosition()]);
                } else {
                    intent.putExtra("idcat", this.f8584D);
                }
            }
            if (this.f8582B.f7170E0) {
                intent.putExtra("precio", ((EditText) findViewById(R.id.c_busc_precio)).getText().toString());
            }
            if (this.f8582B.f7176F0) {
                intent.putExtra("dia", f8576L);
                intent.putExtra("mes", f8577M + 1);
                intent.putExtra("anyo", f8578N);
            }
            C1692config config = this.f8582B;
            if (config.f7182G0 || config.f7188H0 || config.f7194I0) {
                intent.putExtra("orden", this.f8586F[((Spinner) findViewById(R.id.c_busc_orden)).getSelectedItemPosition()]);
                intent.putExtra("orden_tipo", ((ToggleButton) findViewById(R.id.togglebutton)).isChecked());
            } else {
                if (config.f7218M0.indexOf("TITULO") == -1) {
                    i = this.f8582B.f7218M0.indexOf("PRECIO") != -1 ? 2 : 3;
                }
                intent.putExtra("orden", i);
                intent.putExtra("orden_tipo", this.f8582B.f7218M0.contains("ASC"));
            }
            startActivityForResult(intent, 0);
        } else if (view.getId() == R.id.iv_cat || view.getId() == R.id.tl_busc_cat) {
            startActivityForResult(new Intent(this, cats.class), 0);
        } else if (view.getId() == R.id.iv_cat_limpiar) {
            this.f8584D = 0;
            findViewById(R.id.tl_busc_cat).setVisibility(8);
            ((TextView) findViewById(R.id.c_busc_cat)).setText("");
            ((ImageView) findViewById(R.id.iv_cat_limpiar)).setVisibility(8);
        } else if (view.getId() == R.id.iv_antiguedad || view.getId() == R.id.tl_busc_antiguedad) {
            C2091f fVar = new C2091f();
            fVar.mo3725Z1(true);
            fVar.mo3729e2(mo3505r(), "datePicker");
        } else if (view.getId() == R.id.iv_antiguedad_limpiar) {
            f8576L = 0;
            f8577M = 0;
            f8578N = 0;
            findViewById(R.id.tl_busc_antiguedad).setVisibility(8);
            ((TextView) findViewById(R.id.c_busc_antiguedad)).setText("");
            ((ImageView) findViewById(R.id.iv_antiguedad_limpiar)).setVisibility(8);
        } else {
            String str9 = this.f8582B.f7251R3;
            if ((str9 == null || str9.equals("")) && (((str = this.f8582B.f7281W3) == null || str.equals("")) && (((str2 = this.f8582B.f7250R2) == null || str2.equals("")) && (((str3 = this.f8582B.f7245Q3) == null || str3.equals("")) && (((str4 = this.f8582B.f7269U3) == null || str4.equals("")) && (((str5 = this.f8582B.f7275V3) == null || str5.equals("")) && (((str6 = this.f8582B.f7358j4) == null || str6.equals("")) && (((str7 = this.f8582B.f7287X3) == null || str7.equals("")) && ((str8 = this.f8582B.f7293Y3) == null || str8.equals("")))))))))) {
                abrir_secc(view);
                return;
            }
            String str10 = this.f8582B.f7251R3;
            if (str10 != null && !str10.equals("")) {
                this.f6675x = new RewardedVideo((Context) this, this.f8582B.f7251R3);
            }
            String str11 = this.f8582B.f7245Q3;
            if (str11 != null) {
                str11.equals("");
            }
            String str12 = this.f8582B.f7269U3;
            if (str12 != null && !str12.equals("")) {
                this.f6676y = new RewardedVideoAd(this, this.f8582B.f7269U3);
            }
            String str13 = this.f8582B.f7275V3;
            if (str13 != null && !str13.equals("")) {
                this.f6677z = new StartAppAd(this);
            }
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f6673v = progressDialog;
            this.f6672u = view;
            if (!this.f8582B.mo7494Z0(this, view, this.f6668q, progressDialog, this.f6674w, this.f6675x, this.f6676y, this.f6677z, this.f6667A, view)) {
                abrir_secc(view);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo8192C();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f8588H;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f8588H;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f8588H = this.f8582B.mo7474A0(this, false);
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        Bundle bundle2 = bundle;
        C1692config config = (C1692config) getApplicationContext();
        this.f8582B = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8556B(this);
        this.f6667A = new C2084a();
        Bundle extras = getIntent().getExtras();
        this.f8587G = extras;
        int i3 = 1;
        if (bundle2 == null) {
            this.f6671t = extras != null && extras.containsKey("es_root") && this.f8587G.getBoolean("es_root", false);
        } else {
            this.f6671t = bundle2.containsKey("es_root") && bundle2.getBoolean("es_root", false);
        }
        C1692config config2 = this.f8582B;
        this.f6668q = C1692config.m8189h(config2.f7431u1, config2.f7452x1);
        if (Build.VERSION.SDK_INT > 12) {
            if (!C1692config.m8153I("#" + this.f8582B.f7431u1)) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView((int) R.layout.t_buscador_form);
        mo8192C();
        this.f8582B.mo7486N0(this, true);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C2085b());
        searchManager.setOnDismissListener(new C2086c());
        C1692config config3 = this.f8582B;
        Bundle bundle3 = this.f8587G;
        boolean z = bundle3 != null && bundle3.containsKey("ad_entrar");
        Bundle bundle4 = this.f8587G;
        config3.mo7503f1(this, z, bundle4 != null && bundle4.containsKey("fb_entrar"));
        this.f8588H = this.f8582B.mo7474A0(this, false);
        C1692config config4 = this.f8582B;
        config4.mo7488Q0(this, config4.f7318d, this.f6668q, bundle2);
        getWindow().setSoftInputMode(2);
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f8590J = sharedPreferences;
        if (this.f8582B.f7163D > 0) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
        if (this.f8582B.f7163D > 0) {
            int i4 = this.f8590J.getInt("fondo_v_act", 0);
            C1692config config5 = this.f8582B;
            if (i4 == config5.f7163D) {
                try {
                    config5.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f8582B.f7145A), this.f8582B.f7157C);
                    this.f8582B.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
                } catch (Exception unused) {
                }
            }
        }
        f8579O = (TextView) findViewById(R.id.c_busc_antiguedad);
        f8580P = (TableLayout) findViewById(R.id.tl_busc_antiguedad);
        f8581Q = (ImageView) findViewById(R.id.iv_antiguedad_limpiar);
        if (!this.f8582B.f7230O0.equals("")) {
            ((TextView) findViewById(R.id.tv_tit)).setText(this.f8582B.f7230O0);
        }
        if (!this.f8582B.f7466z1.equals("")) {
            ((TextView) findViewById(R.id.tv_tit)).setTextColor(Color.parseColor("#" + this.f8582B.f7466z1));
        }
        if (!this.f8582B.f7147A1.equals("")) {
            View findViewById = findViewById(R.id.v_sep);
            findViewById.setBackgroundColor(Color.parseColor("#" + this.f8582B.f7147A1));
        }
        if (!this.f8582B.f7153B1.equals("")) {
            Drawable drawable = getResources().getDrawable(R.drawable.search_white);
            drawable.setColorFilter(Color.parseColor("#" + this.f8582B.f7153B1), PorterDuff.Mode.MULTIPLY);
            ((ImageView) findViewById(R.id.iv_search)).setImageDrawable(drawable);
        }
        if (!this.f8582B.f7445w1.equals("")) {
            int parseColor = Color.parseColor("#" + this.f8582B.f7445w1);
            ((TextView) findViewById(R.id.tv_busc_texto)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.tv_busc_cat)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.c_busc_cat)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.tv_busc_precio)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.tv_busc_antiguedad)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.c_busc_antiguedad)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.tv_busc_orden)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.busc_divisa)).setTextColor(parseColor);
            if (Build.VERSION.SDK_INT > 20) {
                C1692config.m8150F((EditText) findViewById(R.id.c_busc_texto), Boolean.valueOf(C1692config.m8153I("#" + this.f8582B.f7445w1)), this.f8582B.f7459y1);
                C1692config.m8150F((EditText) findViewById(R.id.c_busc_precio), Boolean.valueOf(C1692config.m8153I("#" + this.f8582B.f7445w1)), this.f8582B.f7459y1);
            }
        }
        if (this.f8582B.f7158C0) {
            findViewById(R.id.tr_texto).setVisibility(0);
        }
        if (this.f8582B.f7164D0) {
            SQLiteDatabase readableDatabase = new C2037q(getApplicationContext()).getReadableDatabase();
            Cursor rawQuery = readableDatabase.rawQuery("SELECT _id FROM cats WHERE idcat>0 LIMIT 1", (String[]) null);
            if (rawQuery.moveToFirst()) {
                findViewById(R.id.c_busc_cat).setVisibility(0);
                ImageView imageView = (ImageView) findViewById(R.id.iv_cat);
                Drawable drawable2 = getResources().getDrawable(R.drawable.tree);
                drawable2.setColorFilter(Color.parseColor("#" + this.f8582B.f7452x1), PorterDuff.Mode.MULTIPLY);
                imageView.setImageDrawable(drawable2);
                imageView.setOnClickListener(this);
                imageView.setVisibility(0);
                ImageView imageView2 = (ImageView) findViewById(R.id.iv_cat_limpiar);
                Drawable drawable3 = getResources().getDrawable(R.drawable.reload);
                drawable3.setColorFilter(Color.parseColor("#" + this.f8582B.f7459y1), PorterDuff.Mode.MULTIPLY);
                imageView2.setImageDrawable(drawable3);
                imageView2.setOnClickListener(this);
                findViewById(R.id.tl_busc_cat).setOnClickListener(this);
            } else {
                Spinner spinner = (Spinner) findViewById(R.id.sp_busc_cat);
                rawQuery = readableDatabase.rawQuery("SELECT * FROM cats ORDER BY descr", (String[]) null);
                if (rawQuery.moveToFirst()) {
                    CharSequence[] charSequenceArr = new CharSequence[(rawQuery.getCount() + 1)];
                    charSequenceArr[0] = getResources().getString(R.string.todo);
                    int[] iArr = new int[(rawQuery.getCount() + 1)];
                    this.f8585E = iArr;
                    iArr[0] = 0;
                    while (!rawQuery.isAfterLast()) {
                        charSequenceArr[rawQuery.getPosition() + i3] = rawQuery.getString(rawQuery.getColumnIndex("descr"));
                        this.f8585E[rawQuery.getPosition() + i3] = rawQuery.getInt(rawQuery.getColumnIndex("_id"));
                        rawQuery.moveToNext();
                        i3 = 1;
                    }
                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, new ArrayList(Arrays.asList(charSequenceArr)));
                    arrayAdapter.setDropDownViewResource(17367049);
                    spinner.setAdapter(arrayAdapter);
                    spinner.setVisibility(0);
                    findViewById(R.id.iv_cat).setVisibility(8);
                }
            }
            rawQuery.close();
            readableDatabase.close();
            findViewById(R.id.tr_cat).setVisibility(0);
        }
        if (this.f8582B.f7170E0) {
            ((TextView) findViewById(R.id.busc_divisa)).setText(Html.fromHtml(this.f8582B.f7224N0));
            findViewById(R.id.tr_precio).setVisibility(0);
        }
        if (this.f8582B.f7176F0) {
            ImageView imageView3 = (ImageView) findViewById(R.id.iv_antiguedad);
            Drawable drawable4 = getResources().getDrawable(R.drawable.calendar);
            drawable4.setColorFilter(Color.parseColor("#" + this.f8582B.f7452x1), PorterDuff.Mode.MULTIPLY);
            imageView3.setImageDrawable(drawable4);
            imageView3.setOnClickListener(this);
            ImageView imageView4 = (ImageView) findViewById(R.id.iv_antiguedad_limpiar);
            Drawable drawable5 = getResources().getDrawable(R.drawable.reload);
            drawable5.setColorFilter(Color.parseColor("#" + this.f8582B.f7459y1), PorterDuff.Mode.MULTIPLY);
            imageView4.setImageDrawable(drawable5);
            imageView4.setOnClickListener(this);
            findViewById(R.id.tl_busc_antiguedad).setOnClickListener(this);
            findViewById(R.id.tr_antiguedad).setVisibility(0);
        }
        C1692config config6 = this.f8582B;
        if (config6.f7182G0 || config6.f7188H0 || config6.f7194I0) {
            Spinner spinner2 = (Spinner) findViewById(R.id.c_busc_orden);
            C1692config config7 = this.f8582B;
            boolean z2 = config7.f7182G0;
            int i5 = config7.f7188H0 ? (z2 ? 1 : 0) + true : z2;
            if (config7.f7194I0) {
                i5++;
            }
            CharSequence[] charSequenceArr2 = new CharSequence[i5];
            this.f8586F = new int[i5];
            if (z2) {
                charSequenceArr2[0] = getString(R.string.titulo);
                this.f8586F[0] = 1;
                this.f8582B.f7218M0.indexOf("TITULO");
                i = 1;
            } else {
                i = 0;
            }
            if (this.f8582B.f7188H0) {
                charSequenceArr2[i] = getString(R.string.precio);
                this.f8586F[i] = 2;
                i2 = this.f8582B.f7218M0.indexOf("PRECIO") != -1 ? i : 0;
                i++;
            } else {
                i2 = 0;
            }
            if (this.f8582B.f7194I0) {
                charSequenceArr2[i] = getString(R.string.antiguedad);
                this.f8586F[i] = 3;
                if (this.f8582B.f7218M0.indexOf("FANTIGUEDAD") != -1) {
                    i2 = i;
                }
            }
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, 17367048, new ArrayList(Arrays.asList(charSequenceArr2)));
            arrayAdapter2.setDropDownViewResource(17367049);
            spinner2.setAdapter(arrayAdapter2);
            spinner2.setSelection(i2);
            ((ToggleButton) findViewById(R.id.togglebutton)).setChecked(this.f8582B.f7218M0.contains("ASC"));
            findViewById(R.id.tr_orden).setVisibility(0);
        }
        if (C1692config.m8153I("#" + this.f8582B.f7459y1)) {
            findViewById(R.id.iv_btn_fondo_n).setVisibility(0);
        } else {
            findViewById(R.id.iv_btn_fondo_b).setVisibility(0);
        }
        Drawable drawable6 = getResources().getDrawable(R.drawable.buscar_btn);
        drawable6.setColorFilter(Color.parseColor("#" + this.f8582B.f7459y1), PorterDuff.Mode.MULTIPLY);
        ImageView imageView5 = (ImageView) findViewById(R.id.button1);
        imageView5.setImageDrawable(drawable6);
        imageView5.setOnClickListener(this);
        if (!this.f8582B.f7431u1.equals("") && !this.f8582B.f7438v1.equals("")) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + this.f8582B.f7431u1), Color.parseColor("#" + this.f8582B.f7438v1)}));
        }
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f8582B.f7384n3 == 0 || (cVar3 = this.f8588H) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f8582B.f7384n3 == 0 || (cVar2 = this.f8588H) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f8582B.f7384n3 == 0 || (cVar = this.f8588H) == null || (adColonyAdView = cVar.f6889d) == null)) {
            adColonyAdView.destroy();
        }
        if ((this.f6671t && isFinishing()) || C1692config.f7111K5) {
            C1692config.m8176Z(this);
        }
        super.onDestroy();
    }

    public void onError(C3371Ad ad, com.facebook.ads.AdError adError) {
        this.f6673v.cancel();
        abrir_secc(this.f6672u);
    }

    public void onFailedToReceiveAd(C5041Ad ad) {
        this.f6673v.cancel();
        abrir_secc(this.f6672u);
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f8582B.f7384n3 == 0 || (cVar = this.f8588H) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6673v.cancel();
        this.f6677z.showAd("REWARDED VIDEO", new C2090e());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f8582B.f7384n3 != 0 && (cVar = this.f8588H) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f8589I = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f8589I) {
            abrir_secc(this.f6672u);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f8589I = true;
        C1692config.m8175Y0(this);
    }

    public boolean onSearchRequested() {
        this.f6669r = true;
        this.f6670s = true;
        return super.onSearchRequested();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals("fondo_v_act")) {
            try {
                this.f8582B.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f8582B.f7145A), this.f8582B.f7157C);
                ((ImageView) findViewById(R.id.iv_fondo)).setVisibility(8);
                this.f8582B.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
                C1692config.m8172V((ImageView) findViewById(R.id.iv_fondo));
            } catch (Exception unused) {
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
        this.f8589I = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f8589I = true;
        C1692config.m8175Y0(this);
    }
}
