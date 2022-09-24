package british.xnews2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;
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

public class t_rss extends FragmentActivity_ext_class implements C1592a, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: B */
    C1692config f9787B;

    /* renamed from: C */
    boolean f9788C = false;

    /* renamed from: D */
    boolean f9789D;

    /* renamed from: E */
    t_rssdetalle_fr f9790E;

    /* renamed from: F */
    Bundle f9791F;

    /* renamed from: G */
    C1603c f9792G;

    /* renamed from: H */
    boolean f9793H = false;

    /* renamed from: I */
    ListView f9794I;

    /* renamed from: british.xnews2.t_rss$a */
    class C2427a extends AdColonyInterstitialListener {
        C2427a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_rss t_rss = t_rss.this;
            if (t_rss.f9793H) {
                t_rss.abrir_secc(t_rss.f6672u);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_rss.this.f6673v.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_rss.this.f6673v.cancel();
            t_rss t_rss = t_rss.this;
            t_rss.abrir_secc(t_rss.f6672u);
        }
    }

    /* renamed from: british.xnews2.t_rss$b */
    class C2428b implements SearchManager.OnCancelListener {
        C2428b() {
        }

        public void onCancel() {
            t_rss t_rss = t_rss.this;
            t_rss.f6669r = false;
            t_rss.setResult(0);
        }
    }

    /* renamed from: british.xnews2.t_rss$c */
    class C2429c implements SearchManager.OnDismissListener {
        C2429c() {
        }

        public void onDismiss() {
            t_rss.this.f6670s = false;
        }
    }

    /* renamed from: british.xnews2.t_rss$d */
    class C2430d extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f9798a;

        /* renamed from: british.xnews2.t_rss$d$a */
        class C2431a extends FullScreenContentCallback {
            C2431a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_rss t_rss = t_rss.this;
                if (t_rss.f9793H) {
                    t_rss.abrir_secc(t_rss.f6672u);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_rss t_rss = t_rss.this;
                t_rss.abrir_secc(t_rss.f6672u);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.t_rss$d$b */
        class C2432b implements OnUserEarnedRewardListener {
            C2432b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2430d dVar = C2430d.this;
                t_rss.this.f9793H = true;
                C1692config.m8175Y0(dVar.f9798a);
            }
        }

        C2430d(Context context) {
            this.f9798a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_rss.this.f6673v.cancel();
            rewardedAd.setFullScreenContentCallback(new C2431a());
            rewardedAd.show((Activity) this.f9798a, new C2432b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_rss t_rss = t_rss.this;
            if (!t_rss.f9787B.mo7502f(this.f9798a, t_rss.f6675x)) {
                t_rss.this.f6673v.cancel();
                t_rss t_rss2 = t_rss.this;
                t_rss2.abrir_secc(t_rss2.f6672u);
            }
        }
    }

    /* renamed from: british.xnews2.t_rss$e */
    class C2433e implements AdDisplayListener {
        C2433e() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_rss t_rss = t_rss.this;
            if (t_rss.f9793H) {
                t_rss.abrir_secc(t_rss.f6672u);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: B */
    private void m8901B(Context context) {
        this.f6674w = new C2430d(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo8922C() {
        int q0 = this.f9787B.mo7522q0(this);
        int i = this.f9787B.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f9794I = listView;
            this.f9787B.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f9787B.f7231O1;
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
            int[] iArr = this.f9787B.f7249R1;
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

    /* renamed from: D */
    public void mo8923D(String str) {
        if (str != null) {
            t_rssdetalle_fr t_rssdetalle_fr = this.f9790E;
            if (t_rssdetalle_fr != null && t_rssdetalle_fr.mo3415f0()) {
                this.f9790E.mo8942N1(str);
            } else if (this.f9789D) {
                this.f9787B.mo7497c(this, str);
            } else {
                Intent intent = new Intent(getApplicationContext(), t_rssdetalle.class);
                intent.putExtra("url", str);
                startActivityForResult(intent, 0);
            }
        }
    }

    public void abrir_secc(View view) {
        C1845j j0 = this.f9787B.mo7510j0(view, this);
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
                    if (this.f9787B.f7427t4 != 2) {
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
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
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
        if (this.f9793H) {
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

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9 = this.f9787B.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f9787B.f7281W3) == null || str.equals("")) && (((str2 = this.f9787B.f7250R2) == null || str2.equals("")) && (((str3 = this.f9787B.f7245Q3) == null || str3.equals("")) && (((str4 = this.f9787B.f7269U3) == null || str4.equals("")) && (((str5 = this.f9787B.f7275V3) == null || str5.equals("")) && (((str6 = this.f9787B.f7358j4) == null || str6.equals("")) && (((str7 = this.f9787B.f7287X3) == null || str7.equals("")) && ((str8 = this.f9787B.f7293Y3) == null || str8.equals("")))))))))) {
            abrir_secc(view);
            return;
        }
        String str10 = this.f9787B.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6675x = new RewardedVideo((Context) this, this.f9787B.f7251R3);
        }
        String str11 = this.f9787B.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f9787B.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6676y = new RewardedVideoAd(this, this.f9787B.f7269U3);
        }
        String str13 = this.f9787B.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6677z = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6673v = progressDialog;
        this.f6672u = view;
        if (!this.f9787B.mo7494Z0(this, view, this.f6668q, progressDialog, this.f6674w, this.f6675x, this.f6676y, this.f6677z, this.f6667A, view)) {
            abrir_secc(view);
        }
    }

    @TargetApi(13)
    public void onCreate(Bundle bundle) {
        int i;
        boolean z;
        boolean z2;
        C1692config config = (C1692config) getApplicationContext();
        this.f9787B = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8901B(this);
        this.f6667A = new C2427a();
        Bundle extras = getIntent().getExtras();
        this.f9791F = extras;
        boolean z3 = true;
        if (bundle == null) {
            this.f6671t = extras != null && extras.containsKey("es_root") && this.f9791F.getBoolean("es_root", false);
        } else {
            this.f6671t = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f6668q = C1692config.m8189h(this.f9787B.f7231O1[getIntent().getExtras().getInt("ind")].f7916g, this.f9787B.f7368l1);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 12) {
            if (!C1692config.m8153I("#" + this.f9787B.f7231O1[getIntent().getExtras().getInt("ind")].f7916g)) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        boolean z4 = this.f9787B.f7231O1[getIntent().getExtras().getInt("ind")].f7910e.contains("youtube.com") || this.f9787B.f7231O1[getIntent().getExtras().getInt("ind")].f7910e.contains("youtu.be");
        this.f9789D = this.f9787B.f7231O1[getIntent().getExtras().getInt("ind")].f7962x == 1;
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        if (i2 >= 13) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.x;
        } else {
            i = defaultDisplay.getWidth();
        }
        if (this.f9789D || i <= ((int) ((getResources().getDisplayMetrics().density * 500.0f) + 0.5f))) {
            setContentView((int) R.layout.t_rss_v);
            z2 = true;
            z = true;
        } else {
            setContentView((int) R.layout.t_rss_h);
            z2 = false;
            z = false;
        }
        this.f9790E = (t_rssdetalle_fr) mo3505r().mo3589i0(R.id.rssdetalle_fr);
        mo8922C();
        if (z2) {
            this.f9787B.mo7486N0(this, true);
        }
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C2428b());
        searchManager.setOnDismissListener(new C2429c());
        if (bundle == null) {
            C1692config config2 = this.f9787B;
            Bundle bundle2 = this.f9791F;
            boolean z5 = bundle2 != null && bundle2.containsKey("ad_entrar");
            Bundle bundle3 = this.f9791F;
            if (bundle3 == null || !bundle3.containsKey("fb_entrar")) {
                z3 = false;
            }
            config2.mo7503f1(this, z5, z3);
        }
        if (z) {
            this.f9792G = this.f9787B.mo7474A0(this, z4);
        }
        C1692config config3 = this.f9787B;
        config3.mo7488Q0(this, config3.f7318d, this.f6668q, bundle);
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f9787B.f7384n3 == 0 || (cVar3 = this.f9792G) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f9787B.f7384n3 == 0 || (cVar2 = this.f9792G) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f9787B.f7384n3 == 0 || (cVar = this.f9792G) == null || (adColonyAdView = cVar.f6889d) == null)) {
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

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        t_rssdetalle_fr t_rssdetalle_fr = this.f9790E;
        if (t_rssdetalle_fr == null || !t_rssdetalle_fr.mo3415f0()) {
            if (i != 4 || !this.f6671t || this.f9788C || !this.f9787B.f7365k5) {
                return super.onKeyDown(i, keyEvent);
            }
            this.f9788C = true;
            C1692config.m8199t(this);
            return true;
        } else if (this.f9790E.mo8943O1(i, keyEvent)) {
            return true;
        } else {
            if (i != 4 || !this.f6671t || this.f9788C || !this.f9787B.f7365k5) {
                return super.onKeyDown(i, keyEvent);
            }
            this.f9788C = true;
            C1692config.m8199t(this);
            return true;
        }
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f9787B.f7384n3 == 0 || (cVar = this.f9792G) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6673v.cancel();
        this.f6677z.showAd("REWARDED VIDEO", new C2433e());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f9787B.f7384n3 != 0 && (cVar = this.f9792G) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f9793H = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f9793H) {
            abrir_secc(this.f6672u);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f9793H = true;
        C1692config.m8175Y0(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("es_root", this.f6671t);
    }

    public boolean onSearchRequested() {
        this.f6669r = true;
        this.f6670s = true;
        return super.onSearchRequested();
    }

    public void onStop() {
        super.onStop();
        if (this.f6669r && !this.f6670s) {
            finish();
        }
    }

    public void onVideoCompleted() {
        this.f9793H = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f9793H = true;
        C1692config.m8175Y0(this);
    }
}
