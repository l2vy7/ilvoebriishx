package british.xnews2;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
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
import android.widget.ImageView;
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

public class t_gal_foto extends Activity_ext_class implements C1592a, View.OnClickListener, SharedPreferences.OnSharedPreferenceChangeListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: m */
    C1692config f9469m;

    /* renamed from: n */
    Bundle f9470n;

    /* renamed from: o */
    boolean f9471o = true;

    /* renamed from: p */
    SharedPreferences f9472p;

    /* renamed from: q */
    WebView f9473q;

    /* renamed from: r */
    C1603c f9474r;

    /* renamed from: s */
    boolean f9475s = false;

    /* renamed from: t */
    ListView f9476t;

    /* renamed from: british.xnews2.t_gal_foto$a */
    class C2328a extends AdColonyInterstitialListener {
        C2328a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_gal_foto t_gal_foto = t_gal_foto.this;
            if (t_gal_foto.f9475s) {
                t_gal_foto.abrir_secc(t_gal_foto.f6660f);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_gal_foto.this.f6661g.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_gal_foto.this.f6661g.cancel();
            t_gal_foto t_gal_foto = t_gal_foto.this;
            t_gal_foto.abrir_secc(t_gal_foto.f6660f);
        }
    }

    /* renamed from: british.xnews2.t_gal_foto$b */
    class C2329b implements SearchManager.OnCancelListener {
        C2329b() {
        }

        public void onCancel() {
            t_gal_foto t_gal_foto = t_gal_foto.this;
            t_gal_foto.f6657c = false;
            t_gal_foto.setResult(0);
        }
    }

    /* renamed from: british.xnews2.t_gal_foto$c */
    class C2330c implements SearchManager.OnDismissListener {
        C2330c() {
        }

        public void onDismiss() {
            t_gal_foto.this.f6658d = false;
        }
    }

    /* renamed from: british.xnews2.t_gal_foto$d */
    class C2331d extends WebChromeClient {
        C2331d() {
        }
    }

    /* renamed from: british.xnews2.t_gal_foto$e */
    class C2332e implements View.OnTouchListener {
        C2332e() {
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

    /* renamed from: british.xnews2.t_gal_foto$f */
    class C2333f extends WebViewClient {
        C2333f() {
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            boolean z;
            boolean z2;
            t_gal_foto t_gal_foto = t_gal_foto.this;
            if (!t_gal_foto.f6657c && !t_gal_foto.isFinishing() && !t_gal_foto.this.f9470n.getString("url").contains("youtube.com") && !t_gal_foto.this.f9470n.getString("url").contains("youtu.be")) {
                t_gal_foto t_gal_foto2 = t_gal_foto.this;
                if (t_gal_foto2.f9471o) {
                    Bundle bundle = t_gal_foto2.f9470n;
                    z = true;
                    z2 = bundle != null && bundle.containsKey("ad_entrar");
                    Bundle bundle2 = t_gal_foto.this.f9470n;
                    if (bundle2 == null || !bundle2.containsKey("fb_entrar")) {
                        z = false;
                    }
                    t_gal_foto.this.f9471o = false;
                } else {
                    z2 = false;
                    z = false;
                }
                t_gal_foto t_gal_foto3 = t_gal_foto.this;
                t_gal_foto3.f9469m.mo7504g1(t_gal_foto3, z2, z, false);
            }
        }
    }

    /* renamed from: british.xnews2.t_gal_foto$g */
    class C2334g extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f9483a;

        /* renamed from: british.xnews2.t_gal_foto$g$a */
        class C2335a extends FullScreenContentCallback {
            C2335a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_gal_foto t_gal_foto = t_gal_foto.this;
                if (t_gal_foto.f9475s) {
                    t_gal_foto.abrir_secc(t_gal_foto.f6660f);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_gal_foto t_gal_foto = t_gal_foto.this;
                t_gal_foto.abrir_secc(t_gal_foto.f6660f);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.t_gal_foto$g$b */
        class C2336b implements OnUserEarnedRewardListener {
            C2336b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2334g gVar = C2334g.this;
                t_gal_foto.this.f9475s = true;
                C1692config.m8175Y0(gVar.f9483a);
            }
        }

        C2334g(Context context) {
            this.f9483a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_gal_foto.this.f6661g.cancel();
            rewardedAd.setFullScreenContentCallback(new C2335a());
            rewardedAd.show((Activity) this.f9483a, new C2336b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_gal_foto t_gal_foto = t_gal_foto.this;
            if (!t_gal_foto.f9469m.mo7502f(this.f9483a, t_gal_foto.f6663i)) {
                t_gal_foto.this.f6661g.cancel();
                t_gal_foto t_gal_foto2 = t_gal_foto.this;
                t_gal_foto2.abrir_secc(t_gal_foto2.f6660f);
            }
        }
    }

    /* renamed from: british.xnews2.t_gal_foto$h */
    class C2337h implements AdDisplayListener {
        C2337h() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_gal_foto t_gal_foto = t_gal_foto.this;
            if (t_gal_foto.f9475s) {
                t_gal_foto.abrir_secc(t_gal_foto.f6660f);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: a */
    private void m8819a(Context context) {
        this.f6662h = new C2334g(context);
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f9469m.mo7510j0(view, this);
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
                    if (this.f9469m.f7427t4 != 2) {
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
    public void mo8701b() {
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8702c() {
        int q0 = this.f9469m.mo7522q0(this);
        int i = this.f9469m.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f9476t = listView;
            this.f9469m.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f9469m.f7231O1;
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
            int[] iArr = this.f9469m.f7249R1;
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
        if (this.f9475s) {
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
            mo8701b();
            return;
        }
        String str9 = this.f9469m.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f9469m.f7281W3) == null || str.equals("")) && (((str2 = this.f9469m.f7250R2) == null || str2.equals("")) && (((str3 = this.f9469m.f7245Q3) == null || str3.equals("")) && (((str4 = this.f9469m.f7269U3) == null || str4.equals("")) && (((str5 = this.f9469m.f7275V3) == null || str5.equals("")) && (((str6 = this.f9469m.f7358j4) == null || str6.equals("")) && (((str7 = this.f9469m.f7287X3) == null || str7.equals("")) && ((str8 = this.f9469m.f7293Y3) == null || str8.equals("")))))))))) {
            abrir_secc(view);
            return;
        }
        String str10 = this.f9469m.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6663i = new RewardedVideo((Context) this, this.f9469m.f7251R3);
        }
        String str11 = this.f9469m.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f9469m.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6664j = new RewardedVideoAd(this, this.f9469m.f7269U3);
        }
        String str13 = this.f9469m.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6665k = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6661g = progressDialog;
        this.f6660f = view;
        if (!this.f9469m.mo7494Z0(this, view, this.f6656b, progressDialog, this.f6662h, this.f6663i, this.f6664j, this.f6665k, this.f6666l, view)) {
            abrir_secc(view);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AdView adView;
        com.google.android.gms.ads.AdView adView2;
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo8702c();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        C1603c cVar = this.f9474r;
        if (!(cVar == null || (adView2 = cVar.f6886a) == null)) {
            try {
                adView2.destroy();
            } catch (Exception unused) {
            }
        }
        C1603c cVar2 = this.f9474r;
        if (!(cVar2 == null || (adView = cVar2.f6887b) == null)) {
            try {
                adView.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f9474r = this.f9469m.mo7474A0(this, false);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        boolean z;
        Uri e;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.compartir) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap decodeFile = BitmapFactory.decodeFile(this.f9470n.getString("url").replace("file://", ""), options);
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
            if (z && (e = FileProvider.m3280e(this, "british.xnews2.fileprovider", new File(new File(getCacheDir(), "images"), "temporal.png"))) != null) {
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
            C1692config.m8174X(this.f9470n.getString("url"), this);
            return true;
        }
    }

    public void onCreate(Bundle bundle) {
        C1692config config = (C1692config) getApplicationContext();
        this.f9469m = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8819a(this);
        this.f6666l = new C2328a();
        this.f6656b = C1692config.m8189h("FFFFFFFF", this.f9469m.f7368l1);
        super.onCreate(bundle);
        setContentView(R.layout.t_gal_foto);
        Bundle extras = getIntent().getExtras();
        this.f9470n = extras;
        if (bundle == null) {
            this.f6659e = extras != null && extras.containsKey("es_root") && this.f9470n.getBoolean("es_root", false);
        } else {
            this.f6659e = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        mo8702c();
        this.f9469m.mo7486N0(this, false);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C2329b());
        searchManager.setOnDismissListener(new C2330c());
        this.f9474r = this.f9469m.mo7474A0(this, false);
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f9472p = sharedPreferences;
        if (this.f9469m.f7163D > 0) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
        if (this.f9469m.f7163D > 0) {
            int i = this.f9472p.getInt("fondo_v_act", 0);
            C1692config config2 = this.f9469m;
            if (i == config2.f7163D) {
                try {
                    config2.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f9469m.f7145A), this.f9469m.f7157C);
                    this.f9469m.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
                } catch (Exception unused) {
                }
            }
        }
        findViewById(R.id.iv_cerrar).setOnClickListener(this);
        this.f9473q = (WebView) findViewById(R.id.webview);
        if (this.f9470n.getString("url").startsWith("file://")) {
            this.f9473q.getSettings().setAllowFileAccess(true);
            registerForContextMenu(this.f9473q);
            C1692config config3 = this.f9469m;
            C1855l[] lVarArr = config3.f7231O1;
            int i2 = config3.f7318d;
            String str = lVarArr[i2].f7916g;
            String str2 = lVarArr[i2].f7919h;
            if (this.f9470n.containsKey("bg1")) {
                str = this.f9470n.getString("bg1");
                str2 = this.f9470n.getString("bg2");
            }
            if (!str.equals("")) {
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + str), Color.parseColor("#" + str2)}));
                this.f9473q.setBackgroundColor(0);
            }
        }
        this.f9473q.setWebChromeClient(new C2331d());
        this.f9473q.getSettings().setBuiltInZoomControls(true);
        this.f9473q.getSettings().setSupportZoom(true);
        this.f9473q.setOnTouchListener(new C2332e());
        this.f9473q.getSettings().setUseWideViewPort(true);
        this.f9473q.getSettings().setLoadWithOverviewMode(true);
        this.f9473q.setWebViewClient(new C2333f());
        if (bundle == null) {
            this.f9473q.loadUrl(this.f9470n.getString("url"));
        }
        String trim = this.f9470n.getString("descr").trim();
        if (!trim.equals("")) {
            ((TextView) findViewById(R.id.tv_descr)).setText(trim);
            findViewById(R.id.ll_descr).setVisibility(0);
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
        if (!(this.f9469m.f7384n3 == 0 || (cVar3 = this.f9474r) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f9469m.f7384n3 == 0 || (cVar2 = this.f9474r) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f9469m.f7384n3 == 0 || (cVar = this.f9474r) == null || (adColonyAdView = cVar.f6889d) == null)) {
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
        if (this.f9473q.canGoBack()) {
            this.f9473q.goBack();
            return true;
        }
        mo8701b();
        return true;
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f9469m.f7384n3 == 0 || (cVar = this.f9474r) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6661g.cancel();
        this.f6665k.showAd("REWARDED VIDEO", new C2337h());
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f9473q.restoreState(bundle);
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (!(this.f9469m.f7384n3 == 0 || (cVar = this.f9474r) == null || (adView = cVar.f6886a) == null)) {
            adView.resume();
        }
        this.f9473q.onResume();
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f9475s = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f9475s) {
            abrir_secc(this.f6660f);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f9475s = true;
        C1692config.m8175Y0(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f9473q.saveState(bundle);
    }

    public boolean onSearchRequested() {
        this.f6657c = true;
        this.f6658d = true;
        return super.onSearchRequested();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals("fondo_v_act")) {
            try {
                this.f9469m.mo7514k1((ImageView) findViewById(R.id.iv_fondo), Boolean.valueOf(this.f9469m.f7145A), this.f9469m.f7157C);
                ((ImageView) findViewById(R.id.iv_fondo)).setVisibility(8);
                this.f9469m.mo7493Y("fondo", (ImageView) findViewById(R.id.iv_fondo));
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
        this.f9475s = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f9475s = true;
        C1692config.m8175Y0(this);
    }
}
