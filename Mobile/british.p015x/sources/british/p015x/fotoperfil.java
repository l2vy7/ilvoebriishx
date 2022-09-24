package british.p015x;

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
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.content.FileProvider;
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

/* renamed from: british.x.fotoperfil */
public class fotoperfil extends Activity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: m */
    C1692config f7764m;

    /* renamed from: n */
    Bundle f7765n;

    /* renamed from: o */
    long f7766o;

    /* renamed from: p */
    boolean f7767p = true;

    /* renamed from: q */
    String f7768q;

    /* renamed from: r */
    String f7769r;

    /* renamed from: s */
    SharedPreferences f7770s;

    /* renamed from: t */
    WebView f7771t;

    /* renamed from: u */
    C1603c f7772u;

    /* renamed from: v */
    boolean f7773v = false;

    /* renamed from: w */
    ListView f7774w;

    /* renamed from: british.x.fotoperfil$a */
    class C1812a implements AdDisplayListener {
        C1812a() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            fotoperfil fotoperfil = fotoperfil.this;
            if (fotoperfil.f7773v) {
                fotoperfil.abrir_secc(fotoperfil.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: british.x.fotoperfil$b */
    class C1813b extends AdColonyInterstitialListener {
        C1813b() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            fotoperfil fotoperfil = fotoperfil.this;
            if (fotoperfil.f7773v) {
                fotoperfil.abrir_secc(fotoperfil.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            fotoperfil.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            fotoperfil.this.f6661g.cancel();
            fotoperfil fotoperfil = fotoperfil.this;
            fotoperfil.abrir_secc(fotoperfil.f6660f);
        }
    }

    /* renamed from: british.x.fotoperfil$c */
    class C1814c implements SearchManager.OnCancelListener {
        C1814c() {
        }

        public void onCancel() {
            fotoperfil fotoperfil = fotoperfil.this;
            fotoperfil.f6657c = false;
            fotoperfil.setResult(0);
        }
    }

    /* renamed from: british.x.fotoperfil$d */
    class C1815d implements SearchManager.OnDismissListener {
        C1815d() {
        }

        public void onDismiss() {
            fotoperfil.this.f6658d = false;
        }
    }

    /* renamed from: british.x.fotoperfil$e */
    class C1816e extends WebChromeClient {
        C1816e() {
        }
    }

    /* renamed from: british.x.fotoperfil$f */
    class C1817f implements View.OnTouchListener {
        C1817f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if ((action != 0 && action != 1) || view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    /* renamed from: british.x.fotoperfil$g */
    class C1818g extends WebViewClient {
        C1818g() {
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            boolean z;
            boolean z2;
            fotoperfil fotoperfil = fotoperfil.this;
            if (!fotoperfil.f6657c && !fotoperfil.isFinishing() && !fotoperfil.this.f7765n.getString("url").contains("youtube.com") && !fotoperfil.this.f7765n.getString("url").contains("youtu.be")) {
                fotoperfil fotoperfil2 = fotoperfil.this;
                if (fotoperfil2.f7767p) {
                    Bundle bundle = fotoperfil2.f7765n;
                    z = true;
                    z2 = bundle != null && bundle.containsKey("ad_entrar");
                    Bundle bundle2 = fotoperfil.this.f7765n;
                    if (bundle2 == null || !bundle2.containsKey("fb_entrar")) {
                        z = false;
                    }
                    fotoperfil.this.f7767p = false;
                } else {
                    z2 = false;
                    z = false;
                }
                fotoperfil fotoperfil3 = fotoperfil.this;
                fotoperfil3.f7764m.mo7504g1(fotoperfil3, z2, z, false);
            }
        }
    }

    /* renamed from: british.x.fotoperfil$h */
    class C1819h implements DialogInterface.OnClickListener {
        C1819h() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.putExtra("elim_fotoperfil", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            fotoperfil.this.setResult(-1, intent);
            fotoperfil.this.finish();
        }
    }

    /* renamed from: british.x.fotoperfil$i */
    class C1820i implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7783a;

        C1820i(AlertDialog alertDialog) {
            this.f7783a = alertDialog;
        }

        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f7783a.getButton(-1);
            button.setTextColor(Color.parseColor("#" + fotoperfil.this.f6656b));
            Button button2 = this.f7783a.getButton(-2);
            button2.setTextColor(Color.parseColor("#" + fotoperfil.this.f6656b));
        }
    }

    /* renamed from: british.x.fotoperfil$j */
    class C1821j extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f7785a;

        /* renamed from: british.x.fotoperfil$j$a */
        class C1822a extends FullScreenContentCallback {
            C1822a() {
            }

            public void onAdDismissedFullScreenContent() {
                fotoperfil fotoperfil = fotoperfil.this;
                if (fotoperfil.f7773v) {
                    fotoperfil.abrir_secc(fotoperfil.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                fotoperfil fotoperfil = fotoperfil.this;
                fotoperfil.abrir_secc(fotoperfil.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.x.fotoperfil$j$b */
        class C1823b implements OnUserEarnedRewardListener {
            C1823b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C1821j jVar = C1821j.this;
                fotoperfil.this.f7773v = true;
                C1692config.m8175Y0(jVar.f7785a);
            }
        }

        C1821j(Context context) {
            this.f7785a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            fotoperfil.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C1822a());
            rewardedAd.show((Activity) this.f7785a, new C1823b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            fotoperfil fotoperfil = fotoperfil.this;
            if (!fotoperfil.f7764m.mo7502f(this.f7785a, fotoperfil.f6663i)) {
                fotoperfil.this.f6661g.cancel();
                fotoperfil fotoperfil2 = fotoperfil.this;
                fotoperfil2.abrir_secc(fotoperfil2.f6660f);
            }
        }
    }

    /* renamed from: a */
    private void m8317a(Context context) {
        this.f6662h = new C1821j(context);
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f7764m.mo7510j0(view, this);
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
                    if (this.f7764m.f7427t4 != 2) {
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

    /* renamed from: b */
    public void mo7701b() {
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7702c() {
        int q0 = this.f7764m.mo7522q0(this);
        int i = this.f7764m.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f7774w = listView;
            this.f7764m.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f7764m.f7231O1;
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
            int[] iArr = this.f7764m.f7249R1;
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
        if (this.f7773v) {
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
        if (view.getId() == R.id.iv_cerrar) {
            mo7701b();
        } else if (view.getId() == R.id.iv_reportar) {
            AlertDialog create = new AlertDialog.Builder(this).setNegativeButton(R.string.cancelar, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.aceptar, new C1819h()).setMessage(R.string.confirmar_elimusu).create();
            if (!this.f6656b.equals("")) {
                create.setOnShowListener(new C1820i(create));
            }
            create.show();
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
        } else {
            String str9 = this.f7764m.f7251R3;
            if ((str9 == null || str9.equals("")) && (((str = this.f7764m.f7281W3) == null || str.equals("")) && (((str2 = this.f7764m.f7250R2) == null || str2.equals("")) && (((str3 = this.f7764m.f7245Q3) == null || str3.equals("")) && (((str4 = this.f7764m.f7269U3) == null || str4.equals("")) && (((str5 = this.f7764m.f7275V3) == null || str5.equals("")) && (((str6 = this.f7764m.f7358j4) == null || str6.equals("")) && (((str7 = this.f7764m.f7287X3) == null || str7.equals("")) && ((str8 = this.f7764m.f7293Y3) == null || str8.equals("")))))))))) {
                abrir_secc(view);
                return;
            }
            String str10 = this.f7764m.f7251R3;
            if (str10 != null && !str10.equals("")) {
                this.f6663i = new RewardedVideo((Context) this, this.f7764m.f7251R3);
            }
            String str11 = this.f7764m.f7245Q3;
            if (str11 != null) {
                str11.equals("");
            }
            String str12 = this.f7764m.f7269U3;
            if (str12 != null && !str12.equals("")) {
                this.f6664j = new RewardedVideoAd(this, this.f7764m.f7269U3);
            }
            String str13 = this.f7764m.f7275V3;
            if (str13 != null && !str13.equals("")) {
                this.f6665k = new StartAppAd(this);
            }
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f6661g = progressDialog;
            this.f6660f = view;
            if (!this.f7764m.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
                abrir_secc(view);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo7702c();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f7772u;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f7772u;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f7772u = this.f7764m.mo7474A0(this, false);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        boolean z;
        Uri e;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.compartir) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap decodeFile = BitmapFactory.decodeFile(this.f7765n.getString("url").replace("file://", ""), options);
            try {
                File file = new File(getCacheDir(), "images");
                file.mkdirs();
                FileOutputStream fileOutputStream = new FileOutputStream(file + "/temporal.png");
                decodeFile.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
                z = true;
            } catch (IOException e2) {
                z = false;
                e2.printStackTrace();
            }
            if (z && (e = FileProvider.m3280e(this, "british.x.fileprovider", new File(new File(getCacheDir(), "images"), "temporal.png"))) != null) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.addFlags(1);
                intent.setType(getContentResolver().getType(e));
                intent.putExtra("android.intent.extra.STREAM", e);
                startActivity(Intent.createChooser(intent, getResources().getString(R.string.compartir)));
            }
            return true;
        } else if (itemId != R.id.guardar) {
            return super.onContextItemSelected(menuItem);
        } else {
            C1692config.m8174X(this.f7765n.getString("url"), this);
            return true;
        }
    }

    public void onCreate(Bundle bundle) {
        C1692config config = (C1692config) getApplicationContext();
        this.f7764m = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8317a(this);
        this.f6666l = new C1813b();
        this.f6656b = C1692config.m8189h("FFFFFFFF", this.f7764m.f7368l1);
        super.onCreate(bundle);
        setContentView(R.layout.fotoperfil);
        Bundle extras = getIntent().getExtras();
        this.f7765n = extras;
        if (bundle == null) {
            this.f6659e = extras != null && extras.containsKey("es_root") && this.f7765n.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        mo7702c();
        this.f7764m.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C1814c());
        searchManager.setOnDismissListener(new C1815d());
        this.f7772u = this.f7764m.mo7474A0(this, false);
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f7770s = sharedPreferences;
        this.f7766o = sharedPreferences.getLong("idusu", 0);
        this.f7768q = this.f7770s.getString("cod", "");
        this.f7769r = this.f7765n.getString("idusu_profile");
        findViewById(R.id.iv_cerrar).setOnClickListener(this);
        String str = this.f7769r;
        if (str.equals(this.f7766o + "")) {
            findViewById(R.id.iv_reportar).setVisibility(8);
        } else {
            findViewById(R.id.iv_reportar).setOnClickListener(this);
        }
        this.f7771t = (WebView) findViewById(R.id.webview);
        if (this.f7765n.getString("url").startsWith("file://")) {
            this.f7771t.getSettings().setAllowFileAccess(true);
            registerForContextMenu(this.f7771t);
            C1692config config2 = this.f7764m;
            String str2 = config2.f7313c1;
            String str3 = config2.f7319d1;
            int i = config2.f7318d;
            if (i != -1) {
                C1855l[] lVarArr = config2.f7231O1;
                str2 = lVarArr[i].f7916g;
                str3 = lVarArr[i].f7919h;
            }
            if (this.f7765n.containsKey("bg1")) {
                str2 = this.f7765n.getString("bg1");
                str3 = this.f7765n.getString("bg2");
            }
            if (!str2.equals("")) {
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + str2), Color.parseColor("#" + str3)}));
                this.f7771t.setBackgroundColor(0);
            }
        }
        this.f7771t.setWebChromeClient(new C1816e());
        this.f7771t.getSettings().setBuiltInZoomControls(true);
        this.f7771t.getSettings().setSupportZoom(true);
        this.f7771t.setOnTouchListener(new C1817f());
        this.f7771t.getSettings().setUseWideViewPort(true);
        this.f7771t.getSettings().setLoadWithOverviewMode(true);
        this.f7771t.setWebViewClient(new C1818g());
        if (bundle == null) {
            this.f7771t.loadUrl(this.f7765n.getString("url"));
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        getMenuInflater().inflate(R.menu.m3, contextMenu);
        MenuItem findItem = contextMenu.findItem(R.id.guardar);
        String str = findItem.getTitle() + "";
        findItem.setTitle(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f7764m.f7384n3 == 0 || (cVar3 = this.f7772u) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f7764m.f7384n3 == 0 || (cVar2 = this.f7772u) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f7764m.f7384n3 == 0 || (cVar = this.f7772u) == null || (adColonyAdView = cVar.f6889d) == null)) {
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

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f7771t.canGoBack()) {
            this.f7771t.goBack();
            return true;
        }
        mo7701b();
        return true;
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f7764m.f7384n3 == 0 || (cVar = this.f7772u) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C1812a());
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f7771t.restoreState(bundle);
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (!(this.f7764m.f7384n3 == 0 || (cVar = this.f7772u) == null || (adView = cVar.f6886a) == null)) {
            adView.resume();
        }
        this.f7771t.onResume();
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f7773v = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f7773v) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f7773v = true;
        C1692config.m8175Y0(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f7771t.saveState(bundle);
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
        this.f7773v = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f7773v = true;
        C1692config.m8175Y0(this);
    }
}
