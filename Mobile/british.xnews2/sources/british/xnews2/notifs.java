package british.xnews2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
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
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
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
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.util.Calendar;

public class notifs extends Activity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: m */
    private SharedPreferences f7981m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C1692config f7982n;

    /* renamed from: o */
    private boolean f7983o = false;

    /* renamed from: p */
    private boolean f7984p;

    /* renamed from: q */
    private Bundle f7985q;

    /* renamed from: r */
    private C1603c f7986r;

    /* renamed from: s */
    boolean f7987s = false;

    /* renamed from: t */
    ListView f7988t;

    /* renamed from: british.xnews2.notifs$a */
    class C1870a extends AdColonyInterstitialListener {
        C1870a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            notifs notifs = notifs.this;
            if (notifs.f7987s) {
                notifs.abrir_secc(notifs.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            notifs.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            notifs.this.f6661g.cancel();
            notifs notifs = notifs.this;
            notifs.abrir_secc(notifs.f6660f);
        }
    }

    /* renamed from: british.xnews2.notifs$b */
    class C1871b implements SearchManager.OnCancelListener {
        C1871b() {
        }

        public void onCancel() {
            notifs notifs = notifs.this;
            notifs.f6657c = false;
            notifs.setResult(0);
        }
    }

    /* renamed from: british.xnews2.notifs$c */
    class C1872c implements SearchManager.OnDismissListener {
        C1872c() {
        }

        public void onDismiss() {
            notifs.this.f6658d = false;
        }
    }

    /* renamed from: british.xnews2.notifs$d */
    class C1873d implements DialogInterface.OnClickListener {
        C1873d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C1692config.m8151G(notifs.this);
            notifs.this.m8334e();
            C1692config.m8154I0(notifs.this);
        }
    }

    /* renamed from: british.xnews2.notifs$e */
    class C1874e implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7993a;

        C1874e(AlertDialog alertDialog) {
            this.f7993a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7993a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + notifs.this.f6656b));
            Button button2 = this.f7993a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + notifs.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.notifs$f */
    class C1875f extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f7995a;

        /* renamed from: british.xnews2.notifs$f$a */
        class C1876a extends FullScreenContentCallback {
            C1876a() {
            }

            public void onAdDismissedFullScreenContent() {
                notifs notifs = notifs.this;
                if (notifs.f7987s) {
                    notifs.abrir_secc(notifs.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                notifs notifs = notifs.this;
                notifs.abrir_secc(notifs.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.notifs$f$b */
        class C1877b implements OnUserEarnedRewardListener {
            C1877b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C1875f fVar = C1875f.this;
                notifs.this.f7987s = true;
                C1692config.m8175Y0(fVar.f7995a);
            }
        }

        C1875f(Context context) {
            this.f7995a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            notifs.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C1876a());
            rewardedAd.show((Activity) this.f7995a, new C1877b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            if (!notifs.this.f7982n.mo7502f(this.f7995a, notifs.this.f6663i)) {
                notifs.this.f6661g.cancel();
                notifs notifs = notifs.this;
                notifs.abrir_secc(notifs.f6660f);
            }
        }
    }

    /* renamed from: british.xnews2.notifs$g */
    class C1878g implements AdDisplayListener {
        C1878g() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            notifs notifs = notifs.this;
            if (notifs.f7987s) {
                notifs.abrir_secc(notifs.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: c */
    private void m8333c(Context context) {
        this.f6662h = new C1875f(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m8334e() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.llnotifs);
        linearLayout.removeAllViews();
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
        boolean z = false;
        int i = this.f7981m.getInt("id_ultnotif", 0);
        int i2 = 0;
        while (i > 0) {
            if (this.f7981m.contains("notif_" + i + "_title")) {
                int i3 = C1692config.f7101A5;
                int i4 = C1692config.f7106F5;
                if (!this.f7984p) {
                    i3 = C1692config.f7103C5;
                    i4 = C1692config.f7105E5;
                }
                LinearLayout linearLayout2 = (LinearLayout) layoutInflater.inflate(R.layout.notif, (ViewGroup) null);
                TextView textView = (TextView) linearLayout2.findViewById(R.id.tv_title);
                textView.setText(this.f7981m.getString("notif_" + i + "_title", ""));
                TextView textView2 = (TextView) linearLayout2.findViewById(R.id.tv_text);
                textView2.setText(this.f7981m.getString("notif_" + i + "_text", ""));
                textView.setTextColor(i3);
                textView2.setTextColor(i3);
                linearLayout2.findViewById(R.id.v_sepnotifs).setBackgroundColor(i4);
                if (!this.f7981m.getBoolean("notif_" + i + "_leida", z)) {
                    linearLayout2.findViewById(R.id.tv_nuevo).setVisibility(z ? 1 : 0);
                }
                DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(this);
                DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(this);
                TextView textView3 = (TextView) linearLayout2.findViewById(R.id.tv_f);
                DateFormat dateFormat2 = dateFormat;
                if (System.currentTimeMillis() - this.f7981m.getLong("notif_" + i + "_fcrea", 0) < DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS) {
                    textView3.setText(getResources().getString(R.string.ahora));
                } else {
                    Calendar instance = Calendar.getInstance();
                    Calendar instance2 = Calendar.getInstance();
                    instance2.setTimeInMillis(this.f7981m.getLong("notif_" + i + "_fcrea", 0));
                    if (instance2.get(1) == instance.get(1) && instance2.get(6) == instance.get(6)) {
                        textView3.setText(getResources().getString(R.string.hoy) + " " + timeFormat.format(Long.valueOf(instance2.getTimeInMillis())));
                    } else {
                        textView3.setText(dateFormat2.format(Long.valueOf(instance2.getTimeInMillis())) + " " + timeFormat.format(Long.valueOf(instance2.getTimeInMillis())));
                    }
                }
                linearLayout2.setTag(R.id.idaux1, Integer.valueOf(i));
                linearLayout2.setOnClickListener(this);
                linearLayout.addView(linearLayout2);
                i2++;
                if (i2 > 99) {
                    break;
                }
            }
            i--;
            z = false;
        }
        if (i2 == 0) {
            findViewById(R.id.tv_sinnotifs).setVisibility(0);
        }
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f7982n.mo7510j0(view, this);
        try {
            Intent intent = j0.f7842a;
            if (intent != null && intent.getComponent().getClassName().endsWith(".notifs")) {
                return;
            }
        } catch (Exception unused) {
        }
        if (j0.f7843b) {
            this.f6657c = true;
            Intent intent2 = new Intent();
            intent2.putExtra("finalizar", true);
            intent2.putExtra("finalizar_app", j0.f7844c);
            setResult(-1, intent2);
        }
        if (j0.f7845d) {
            startActivityForResult(j0.f7842a, 0);
        } else {
            Intent intent3 = j0.f7842a;
            if (intent3 != null) {
                if (j0.f7843b) {
                    this.f6659e = false;
                    if (this.f7982n.f7427t4 != 2) {
                        intent3.putExtra("es_root", true);
                    }
                    try {
                        startActivity(j0.f7842a);
                    } catch (Exception unused2) {
                    }
                } else {
                    startActivityForResult(intent3, 0);
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
    /* renamed from: d */
    public void mo7753d() {
        int q0 = this.f7982n.mo7522q0(this);
        int i = this.f7982n.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f7988t = listView;
            this.f7982n.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f7982n.f7231O1;
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
            int[] iArr = this.f7982n.f7249R1;
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
        if (this.f7987s) {
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
        if (!this.f6659e || this.f7983o || !this.f7982n.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f7983o = true;
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
        Intent intent = null;
        boolean z = false;
        if (view.getId() == R.id.btntrash) {
            if (this.f7981m.getInt("id_ultnotif", 0) != 0) {
                AlertDialog create = new AlertDialog.Builder(this).setNegativeButton(R.string.cancelar, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.aceptar, new C1873d()).setMessage(R.string.confirmar_elimnotifs).create();
                if (!this.f6656b.equals("")) {
                    create.setOnShowListener(new C1874e(create));
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused) {
                }
            }
        } else if (view.getId() == R.id.btnsettings) {
            startActivityForResult(new Intent(this, notifs_cats.class), 0);
        } else if (view.getTag(R.id.idaux1) != null) {
            SharedPreferences sharedPreferences = this.f7981m;
            int i = sharedPreferences.getInt("notif_" + view.getTag(R.id.idaux1) + "_numnotif", 0);
            if (i != 0) {
                ((NotificationManager) getSystemService("notification")).cancel(i);
            }
            SharedPreferences.Editor edit = this.f7981m.edit();
            edit.putBoolean("notif_" + view.getTag(R.id.idaux1) + "_leida", true);
            edit.commit();
            C1692config.m8184e(this);
            SharedPreferences sharedPreferences2 = this.f7981m;
            String string = sharedPreferences2.getString("notif_" + view.getTag(R.id.idaux1) + "_intent", "");
            if (!string.equals("")) {
                try {
                    intent = Intent.parseUri(string, 0);
                    z = true;
                } catch (URISyntaxException unused2) {
                }
                if (z) {
                    intent.putExtra("directo", true);
                    startActivity(intent);
                    Intent intent2 = new Intent();
                    intent2.putExtra("finalizar", true);
                    intent2.putExtra("finalizar_app", true);
                    C1692config.f7111K5 = true;
                    this.f6657c = true;
                    setResult(-1, intent2);
                }
            }
        } else {
            String str9 = this.f7982n.f7251R3;
            if ((str9 == null || str9.equals("")) && (((str = this.f7982n.f7281W3) == null || str.equals("")) && (((str2 = this.f7982n.f7250R2) == null || str2.equals("")) && (((str3 = this.f7982n.f7245Q3) == null || str3.equals("")) && (((str4 = this.f7982n.f7269U3) == null || str4.equals("")) && (((str5 = this.f7982n.f7275V3) == null || str5.equals("")) && (((str6 = this.f7982n.f7358j4) == null || str6.equals("")) && (((str7 = this.f7982n.f7287X3) == null || str7.equals("")) && ((str8 = this.f7982n.f7293Y3) == null || str8.equals("")))))))))) {
                abrir_secc(view);
                return;
            }
            String str10 = this.f7982n.f7251R3;
            if (str10 != null && !str10.equals("")) {
                this.f6663i = new RewardedVideo((Context) this, this.f7982n.f7251R3);
            }
            String str11 = this.f7982n.f7245Q3;
            if (str11 != null) {
                str11.equals("");
            }
            String str12 = this.f7982n.f7269U3;
            if (str12 != null && !str12.equals("")) {
                this.f6664j = new RewardedVideoAd(this, this.f7982n.f7269U3);
            }
            String str13 = this.f7982n.f7275V3;
            if (str13 != null && !str13.equals("")) {
                this.f6665k = new StartAppAd(this);
            }
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f6661g = progressDialog;
            this.f6660f = view;
            if (!this.f7982n.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
                abrir_secc(view);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo7753d();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f7986r;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f7986r;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f7986r = this.f7982n.mo7474A0(this, false);
    }

    public void onCreate(Bundle bundle) {
        C1692config config = (C1692config) getApplicationContext();
        this.f7982n = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8333c(this);
        this.f6666l = new C1870a();
        C1692config config2 = this.f7982n;
        this.f6656b = C1692config.m8189h(config2.f7313c1, config2.f7368l1);
        if (Build.VERSION.SDK_INT > 12) {
            if (!C1692config.m8153I("#" + this.f7982n.f7313c1)) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.notifs);
        mo7753d();
        this.f7982n.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C1871b());
        searchManager.setOnDismissListener(new C1872c());
        this.f7982n.mo7503f1(this, false, false);
        this.f7986r = this.f7982n.mo7474A0(this, false);
        Bundle extras = getIntent().getExtras();
        this.f7985q = extras;
        if (bundle == null) {
            this.f6659e = extras != null && extras.containsKey("es_root") && this.f7985q.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f7981m = getSharedPreferences("sh", 0);
        this.f7984p = C1692config.m8153I("#" + this.f7982n.f7313c1);
        if (!this.f7982n.f7313c1.equals("")) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + this.f7982n.f7313c1), Color.parseColor("#" + this.f7982n.f7319d1)}));
        }
        int i = -16777216;
        if (!this.f7984p) {
            i = -1;
        }
        ((TextView) findViewById(R.id.tv_listanotifs)).setTextColor(i);
        findViewById(R.id.v_listanotifs).setBackgroundColor(i);
        ((TextView) findViewById(R.id.tv_sinnotifs)).setTextColor(i);
        if (this.f7984p) {
            ((ImageView) findViewById(R.id.btntrash)).setImageDrawable(getResources().getDrawable(R.drawable.trash));
            ((ImageView) findViewById(R.id.btnsettings)).setImageDrawable(getResources().getDrawable(R.drawable.settings));
        } else {
            ((ImageView) findViewById(R.id.btntrash)).setImageDrawable(getResources().getDrawable(R.drawable.trash_light));
            ((ImageView) findViewById(R.id.btnsettings)).setImageDrawable(getResources().getDrawable(R.drawable.settings_light));
        }
        findViewById(R.id.btntrash).setOnClickListener(this);
        if (this.f7982n.f7428t5) {
            findViewById(R.id.btnsettings).setOnClickListener(this);
            findViewById(R.id.btnsettings).setVisibility(0);
        }
        m8334e();
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f7982n.f7384n3 == 0 || (cVar3 = this.f7986r) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f7982n.f7384n3 == 0 || (cVar2 = this.f7986r) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f7982n.f7384n3 == 0 || (cVar = this.f7986r) == null || (adColonyAdView = cVar.f6889d) == null)) {
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
        if (!(this.f7982n.f7384n3 == 0 || (cVar = this.f7986r) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C1878g());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f7982n.f7384n3 != 0 && (cVar = this.f7986r) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f7987s = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f7987s) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f7987s = true;
        C1692config.m8175Y0(this);
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
        this.f7987s = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f7987s = true;
        C1692config.m8175Y0(this);
    }
}
