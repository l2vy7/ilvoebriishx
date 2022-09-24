package british.xnews2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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
import com.google.android.exoplayer2.C6540C;
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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import p272b9.C11188h;
import p310h9.C12773l;
import p313j8.C12796d;
import p315k8.C12819a;
import p317l8.C12831e;

public class contactar extends Activity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: m */
    long f7596m;

    /* renamed from: n */
    int f7597n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ProgressDialog f7598o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f7599p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f7600q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f7601r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f7602s;

    /* renamed from: t */
    boolean f7603t = false;

    /* renamed from: u */
    C1692config f7604u;

    /* renamed from: v */
    C1603c f7605v;

    /* renamed from: w */
    boolean f7606w = false;

    /* renamed from: x */
    ListView f7607x;

    /* renamed from: british.xnews2.contactar$a */
    class C1744a implements DialogInterface.OnShowListener {
        C1744a() {
        }

        public void onShow(DialogInterface dialogInterface) {
            C1692config.m8168S0((ProgressBar) contactar.this.f7598o.findViewById(16908301), contactar.this.f7604u.f7417s1);
        }
    }

    /* renamed from: british.xnews2.contactar$b */
    class C1745b extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f7609a;

        /* renamed from: british.xnews2.contactar$b$a */
        class C1746a extends FullScreenContentCallback {
            C1746a() {
            }

            public void onAdDismissedFullScreenContent() {
                contactar contactar = contactar.this;
                if (contactar.f7606w) {
                    contactar.abrir_secc(contactar.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                contactar contactar = contactar.this;
                contactar.abrir_secc(contactar.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.contactar$b$b */
        class C1747b implements OnUserEarnedRewardListener {
            C1747b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C1745b bVar = C1745b.this;
                contactar.this.f7606w = true;
                C1692config.m8175Y0(bVar.f7609a);
            }
        }

        C1745b(Context context) {
            this.f7609a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            contactar.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C1746a());
            rewardedAd.show((Activity) this.f7609a, new C1747b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            contactar contactar = contactar.this;
            if (!contactar.f7604u.mo7502f(this.f7609a, contactar.f6663i)) {
                contactar.this.f6661g.cancel();
                contactar contactar2 = contactar.this;
                contactar2.abrir_secc(contactar2.f6660f);
            }
        }
    }

    /* renamed from: british.xnews2.contactar$c */
    class C1748c implements AdDisplayListener {
        C1748c() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            contactar contactar = contactar.this;
            if (contactar.f7606w) {
                contactar.abrir_secc(contactar.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.xnews2.contactar$d */
    class C1749d extends AdColonyInterstitialListener {
        C1749d() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            contactar contactar = contactar.this;
            if (contactar.f7606w) {
                contactar.abrir_secc(contactar.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            contactar.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            contactar.this.f6661g.cancel();
            contactar contactar = contactar.this;
            contactar.abrir_secc(contactar.f6660f);
        }
    }

    /* renamed from: british.xnews2.contactar$e */
    class C1750e implements SearchManager.OnCancelListener {
        C1750e() {
        }

        public void onCancel() {
            contactar contactar = contactar.this;
            contactar.f6657c = false;
            contactar.setResult(0);
        }
    }

    /* renamed from: british.xnews2.contactar$f */
    class C1751f implements SearchManager.OnDismissListener {
        C1751f() {
        }

        public void onDismiss() {
            contactar.this.f6658d = false;
        }
    }

    /* renamed from: british.xnews2.contactar$g */
    class C1752g implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7617a;

        C1752g(AlertDialog alertDialog) {
            this.f7617a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7617a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + contactar.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.contactar$h */
    class C1753h implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7619a;

        C1753h(AlertDialog alertDialog) {
            this.f7619a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7619a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + contactar.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.contactar$i */
    class C1754i implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7621a;

        C1754i(AlertDialog alertDialog) {
            this.f7621a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7621a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + contactar.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.contactar$j */
    class C1755j implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7623a;

        C1755j(AlertDialog alertDialog) {
            this.f7623a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7623a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + contactar.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.contactar$k */
    class C1756k implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7625a;

        C1756k(AlertDialog alertDialog) {
            this.f7625a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7625a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + contactar.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.contactar$l */
    class C1757l implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7627a;

        C1757l(AlertDialog alertDialog) {
            this.f7627a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7627a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + contactar.this.f6656b));
        }
    }

    /* renamed from: british.xnews2.contactar$m */
    private class C1758m extends AsyncTask<String, Void, Byte> {

        /* renamed from: british.xnews2.contactar$m$a */
        class C1759a implements DialogInterface.OnClickListener {
            C1759a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                if (contactar.this.f6659e) {
                    int i2 = 0;
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        C1855l[] lVarArr = contactar.this.f7604u.f7231O1;
                        if (i3 >= lVarArr.length) {
                            break;
                        } else if (!lVarArr[i3].f7848B) {
                            z = true;
                        } else {
                            i3++;
                        }
                    }
                    if (z) {
                        i2 = i3;
                    }
                    C1845j B = contactar.this.f7604u.mo7475B(Integer.valueOf(i2), contactar.this);
                    B.f7842a.putExtra("es_root", true);
                    contactar.this.startActivity(B.f7842a);
                }
                contactar.this.finish();
            }
        }

        /* renamed from: british.xnews2.contactar$m$b */
        class C1760b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f7631a;

            C1760b(AlertDialog alertDialog) {
                this.f7631a = alertDialog;
            }

            public void onShow(DialogInterface dialogInterface) {
                Button button = this.f7631a.getButton(-1);
                button.setTextColor(Color.parseColor("#" + contactar.this.f6656b));
            }
        }

        private C1758m() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            C11188h hVar = new C11188h();
            C12831e eVar = new C12831e(C1692config.f7109I5 + "/srv/enviar_petic.php?v=1&idapp=" + 2260177 + "&idusu=" + contactar.this.f7596m + "&idofic=" + contactar.this.f7597n);
            StringBuilder sb = new StringBuilder();
            try {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(new C12773l("nombre", contactar.this.f7599p));
                arrayList.add(new C12773l("email", contactar.this.f7600q));
                arrayList.add(new C12773l("tel", contactar.this.f7601r));
                arrayList.add(new C12773l("observ", contactar.this.f7602s));
                eVar.mo47986B(new C12819a(arrayList, C6540C.UTF8_NAME));
                eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo43518a(eVar).mo47805b().mo43577k()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                if (sb.indexOf("ANDROID:KO") != -1) {
                    return (byte) 2;
                }
                if (sb.indexOf("ANDROID:OK") != -1) {
                    return (byte) 1;
                }
                return (byte) 2;
            } catch (C12796d unused) {
                return (byte) 2;
            } catch (IOException unused2) {
                return (byte) 2;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            try {
                contactar.this.f7598o.dismiss();
            } catch (Exception unused) {
            }
            if (b.byteValue() == 1) {
                AlertDialog create = new AlertDialog.Builder(contactar.this).setCancelable(false).setPositiveButton(R.string.aceptar, new C1759a()).setMessage(R.string.mensaje_enviado).create();
                if (!contactar.this.f6656b.equals("")) {
                    create.setOnShowListener(new C1760b(create));
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused2) {
                }
            } else {
                contactar.this.mo7598h();
            }
        }
    }

    /* renamed from: f */
    private void m8276f(Context context) {
        this.f6662h = new C1745b(context);
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f7604u.mo7510j0(view, this);
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
                    if (this.f7604u.f7427t4 != 2) {
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
    /* renamed from: g */
    public void mo7597g() {
        int q0 = this.f7604u.mo7522q0(this);
        int i = this.f7604u.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f7607x = listView;
            this.f7604u.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f7604u.f7231O1;
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
            int[] iArr = this.f7604u.f7249R1;
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
    /* renamed from: h */
    public void mo7598h() {
        AlertDialog create = new AlertDialog.Builder(this).setCancelable(false).setPositiveButton(R.string.cerrar, (DialogInterface.OnClickListener) null).setMessage(R.string.error_http).create();
        if (!this.f6656b.equals("")) {
            create.setOnShowListener(new C1752g(create));
        }
        create.show();
        try {
            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused) {
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
        if (this.f7606w) {
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
        if (!this.f6659e || this.f7603t || !this.f7604u.f7365k5) {
            super.onBackPressed();
            return;
        }
        this.f7603t = true;
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
        if (view.getId() == R.id.button1) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(false).setPositiveButton(getResources().getString(R.string.cerrar), (DialogInterface.OnClickListener) null);
            this.f7599p = ((TextView) findViewById(R.id.c_nombre)).getText().toString();
            this.f7600q = ((TextView) findViewById(R.id.c_email)).getText().toString();
            this.f7601r = ((TextView) findViewById(R.id.c_telefono)).getText().toString();
            this.f7602s = ((TextView) findViewById(R.id.c_observ)).getText().toString();
            if (this.f7599p.length() == 0 && this.f7604u.f7401q == 2) {
                builder.setMessage(R.string.falta_nombre);
                AlertDialog create = builder.create();
                if (!this.f6656b.equals("")) {
                    create.setOnShowListener(new C1753h(create));
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused) {
                }
            } else if (this.f7600q.length() == 0 && this.f7604u.f7408r == 2) {
                builder.setMessage(R.string.falta_email);
                AlertDialog create2 = builder.create();
                if (!this.f6656b.equals("")) {
                    create2.setOnShowListener(new C1754i(create2));
                }
                create2.show();
                ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (this.f7601r.length() == 0 && this.f7604u.f7415s == 2) {
                builder.setMessage(R.string.falta_tel);
                AlertDialog create3 = builder.create();
                if (!this.f6656b.equals("")) {
                    create3.setOnShowListener(new C1755j(create3));
                }
                create3.show();
                ((TextView) create3.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (this.f7602s.length() == 0) {
                builder.setMessage(R.string.falta_msg);
                AlertDialog create4 = builder.create();
                if (!this.f6656b.equals("")) {
                    create4.setOnShowListener(new C1756k(create4));
                }
                create4.show();
                ((TextView) create4.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (this.f7600q.length() <= 0 || this.f7600q.contains("@")) {
                ProgressDialog progressDialog = new ProgressDialog(this);
                this.f7598o = progressDialog;
                progressDialog.setMessage(getString(R.string.enviando));
                this.f7598o.setIndeterminate(true);
                if (Build.VERSION.SDK_INT > 20) {
                    this.f7598o.setOnShowListener(new C1744a());
                }
                this.f7598o.show();
                new C1758m().execute(new String[0]);
            } else {
                builder.setMessage(R.string.email_nook);
                AlertDialog create5 = builder.create();
                if (!this.f6656b.equals("")) {
                    create5.setOnShowListener(new C1757l(create5));
                }
                create5.show();
                ((TextView) create5.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            }
        } else {
            String str9 = this.f7604u.f7251R3;
            if ((str9 == null || str9.equals("")) && (((str = this.f7604u.f7281W3) == null || str.equals("")) && (((str2 = this.f7604u.f7250R2) == null || str2.equals("")) && (((str3 = this.f7604u.f7245Q3) == null || str3.equals("")) && (((str4 = this.f7604u.f7269U3) == null || str4.equals("")) && (((str5 = this.f7604u.f7275V3) == null || str5.equals("")) && (((str6 = this.f7604u.f7358j4) == null || str6.equals("")) && (((str7 = this.f7604u.f7287X3) == null || str7.equals("")) && ((str8 = this.f7604u.f7293Y3) == null || str8.equals("")))))))))) {
                abrir_secc(view);
                return;
            }
            String str10 = this.f7604u.f7251R3;
            if (str10 != null && !str10.equals("")) {
                this.f6663i = new RewardedVideo((Context) this, this.f7604u.f7251R3);
            }
            String str11 = this.f7604u.f7245Q3;
            if (str11 != null) {
                str11.equals("");
            }
            String str12 = this.f7604u.f7269U3;
            if (str12 != null && !str12.equals("")) {
                this.f6664j = new RewardedVideoAd(this, this.f7604u.f7269U3);
            }
            String str13 = this.f7604u.f7275V3;
            if (str13 != null && !str13.equals("")) {
                this.f6665k = new StartAppAd(this);
            }
            ProgressDialog progressDialog2 = new ProgressDialog(this);
            this.f6661g = progressDialog2;
            this.f6660f = view;
            if (!this.f7604u.mo7494Z0(this, view, this.f6656b, progressDialog2, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
                abrir_secc(view);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        C1692config config = (C1692config) getApplicationContext();
        this.f7604u = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8276f(this);
        this.f6666l = new C1749d();
        C1692config config2 = this.f7604u;
        this.f6656b = C1692config.m8189h(config2.f7355j1, config2.f7417s1);
        int i = Build.VERSION.SDK_INT;
        if (i > 12) {
            if (!C1692config.m8153I("#" + this.f7604u.f7355j1)) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.contactar);
        mo7597g();
        this.f7604u.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C1750e());
        searchManager.setOnDismissListener(new C1751f());
        if (bundle == null) {
            this.f7604u.mo7503f1(this, false, false);
        }
        this.f7605v = this.f7604u.mo7474A0(this, false);
        Bundle extras = getIntent().getExtras();
        if (bundle == null) {
            this.f6659e = extras != null && extras.containsKey("es_root") && extras.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f7597n = extras.getInt("idofic");
        this.f7596m = getSharedPreferences("sh", 0).getLong("idusu", 0);
        if (!this.f7604u.f7382n1.equals("")) {
            ((TextView) findViewById(R.id.tv_tit)).setTextColor(Color.parseColor("#" + this.f7604u.f7382n1));
        }
        if (!this.f7604u.f7389o1.equals("")) {
            View findViewById = findViewById(R.id.v_sep);
            findViewById.setBackgroundColor(Color.parseColor("#" + this.f7604u.f7389o1));
        }
        if (!this.f7604u.f7396p1.equals("")) {
            Drawable drawable = getResources().getDrawable(R.drawable.email_contactar);
            drawable.setColorFilter(Color.parseColor("#" + this.f7604u.f7396p1), PorterDuff.Mode.MULTIPLY);
            ((ImageView) findViewById(R.id.iv_email)).setImageDrawable(drawable);
        }
        if (!this.f7604u.f7403q1.equals("")) {
            int parseColor = Color.parseColor("#" + this.f7604u.f7403q1);
            ((TextView) findViewById(R.id.tv_to_lit)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.tv_to)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.tv_nombre)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.opcional_nombre)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.tv_email)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.opcional_email)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.tv_tel)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.opcional_tel)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.tv_msg)).setTextColor(parseColor);
            if (i > 20) {
                C1692config.m8150F((EditText) findViewById(R.id.c_nombre), Boolean.valueOf(C1692config.m8153I("#" + this.f7604u.f7403q1)), this.f7604u.f7417s1);
                C1692config.m8150F((EditText) findViewById(R.id.c_email), Boolean.valueOf(C1692config.m8153I("#" + this.f7604u.f7403q1)), this.f7604u.f7417s1);
                C1692config.m8150F((EditText) findViewById(R.id.c_telefono), Boolean.valueOf(C1692config.m8153I("#" + this.f7604u.f7403q1)), this.f7604u.f7417s1);
                C1692config.m8150F((EditText) findViewById(R.id.c_observ), Boolean.valueOf(C1692config.m8153I("#" + this.f7604u.f7403q1)), this.f7604u.f7417s1);
            }
        }
        if (C1692config.m8153I("#" + this.f7604u.f7417s1)) {
            findViewById(R.id.iv_btn_fondo_n).setVisibility(0);
        } else {
            findViewById(R.id.iv_btn_fondo_b).setVisibility(0);
        }
        Drawable drawable2 = getResources().getDrawable(R.drawable.enviar_btn);
        drawable2.setColorFilter(Color.parseColor("#" + this.f7604u.f7417s1), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = (ImageView) findViewById(R.id.button1);
        imageView.setImageDrawable(drawable2);
        imageView.setOnClickListener(this);
        int i2 = 0;
        while (true) {
            C1840i[] iVarArr = this.f7604u.f7237P1;
            if (i2 < iVarArr.length) {
                if (iVarArr[i2].f7827l == this.f7597n && iVarArr[i2].f7840y && !iVarArr[i2].f7820e.equals("")) {
                    ((TextView) findViewById(R.id.tv_to)).setText(this.f7604u.f7237P1[i2].f7820e);
                    findViewById(R.id.tr_to).setVisibility(0);
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        int i3 = this.f7604u.f7401q;
        if (i3 > 0) {
            if (i3 == 1) {
                findViewById(R.id.opcional_nombre).setVisibility(0);
            }
            findViewById(R.id.tr_nombre).setVisibility(0);
        }
        int i4 = this.f7604u.f7408r;
        if (i4 > 0) {
            if (i4 == 1) {
                findViewById(R.id.opcional_email).setVisibility(0);
            }
            findViewById(R.id.tr_email).setVisibility(0);
        }
        int i5 = this.f7604u.f7415s;
        if (i5 > 0) {
            if (i5 == 1) {
                findViewById(R.id.opcional_tel).setVisibility(0);
            }
            findViewById(R.id.tr_tel).setVisibility(0);
        }
        if (extras.containsKey("msg_predefinido")) {
            ((EditText) findViewById(R.id.c_observ)).setText(getResources().getString(R.string.masinfo_sobre) + " " + extras.getString("msg_predefinido"));
        }
        if (!this.f7604u.f7355j1.equals("")) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + this.f7604u.f7355j1), Color.parseColor("#" + this.f7604u.f7361k1)}));
        }
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f7604u.f7384n3 == 0 || (cVar3 = this.f7605v) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f7604u.f7384n3 == 0 || (cVar2 = this.f7605v) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f7604u.f7384n3 == 0 || (cVar = this.f7605v) == null || (adColonyAdView = cVar.f6889d) == null)) {
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
        if (!(this.f7604u.f7384n3 == 0 || (cVar = this.f7605v) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C1748c());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f7604u.f7384n3 != 0 && (cVar = this.f7605v) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f7606w = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f7606w) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f7606w = true;
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
        this.f7606w = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f7606w = true;
        C1692config.m8175Y0(this);
    }
}
