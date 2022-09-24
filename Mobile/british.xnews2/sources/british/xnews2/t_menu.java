package british.xnews2;

import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import british.xnews2.C1692config;
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

public class t_menu extends ListActivity implements C1592a, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: b */
    final AdColonyInterstitialListener f9558b = new C2364a();

    /* renamed from: c */
    C1692config f9559c;

    /* renamed from: d */
    boolean f9560d = false;

    /* renamed from: e */
    String f9561e;

    /* renamed from: f */
    RewardedVideo f9562f;

    /* renamed from: g */
    RewardedVideoAd f9563g;

    /* renamed from: h */
    StartAppAd f9564h;

    /* renamed from: i */
    boolean f9565i = false;

    /* renamed from: j */
    boolean f9566j = false;

    /* renamed from: k */
    int f9567k;

    /* renamed from: l */
    ProgressDialog f9568l;

    /* renamed from: m */
    int[] f9569m;

    /* renamed from: n */
    int f9570n;

    /* renamed from: o */
    final RewardedAdLoadCallback f9571o = new C2365b();

    /* renamed from: british.xnews2.t_menu$a */
    class C2364a extends AdColonyInterstitialListener {
        C2364a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_menu t_menu = t_menu.this;
            if (t_menu.f9565i) {
                t_menu.abrir_secc((View) null);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_menu.this.f9568l.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_menu.this.f9568l.cancel();
            t_menu.this.abrir_secc((View) null);
        }
    }

    /* renamed from: british.xnews2.t_menu$b */
    class C2365b extends RewardedAdLoadCallback {

        /* renamed from: british.xnews2.t_menu$b$a */
        class C2366a extends FullScreenContentCallback {
            C2366a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_menu t_menu = t_menu.this;
                if (t_menu.f9565i) {
                    t_menu.abrir_secc((View) null);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_menu.this.abrir_secc((View) null);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.t_menu$b$b */
        class C2367b implements OnUserEarnedRewardListener {
            C2367b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                t_menu t_menu = t_menu.this;
                t_menu.f9565i = true;
                C1692config.m8175Y0(t_menu);
            }
        }

        C2365b() {
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_menu.this.f9568l.cancel();
            rewardedAd.setFullScreenContentCallback(new C2366a());
            rewardedAd.show(t_menu.this, new C2367b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_menu t_menu = t_menu.this;
            if (!t_menu.f9559c.mo7502f(t_menu, t_menu.f9562f)) {
                t_menu.this.f9568l.cancel();
                t_menu.this.abrir_secc((View) null);
            }
        }
    }

    /* renamed from: british.xnews2.t_menu$c */
    class C2368c implements AdDisplayListener {
        C2368c() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_menu t_menu = t_menu.this;
            if (t_menu.f9565i) {
                t_menu.abrir_secc((View) null);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    public void abrir_secc(View view) {
        C1845j B = this.f9559c.mo7475B(Integer.valueOf(this.f9569m[this.f9567k]), this);
        this.f9560d = true;
        Intent intent = new Intent();
        intent.putExtra("finalizar", B.f7843b);
        setResult(-1, intent);
        if (this.f9559c.f7427t4 != 2) {
            B.f7842a.putExtra("es_root", true);
        }
        startActivity(B.f7842a);
        finish();
    }

    public void adError(String str) {
        this.f9568l.cancel();
        abrir_secc((View) null);
    }

    public void adLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
        this.f9568l.cancel();
        this.f9562f.showAd();
    }

    public void onAdClicked(C3371Ad ad) {
    }

    public void onAdClosed() {
        if (this.f9565i) {
            abrir_secc((View) null);
        }
    }

    public void onAdLoaded(C3371Ad ad) {
        this.f9568l.cancel();
        this.f9563g.show();
    }

    public void onClick(View view) {
    }

    public void onCreate(Bundle bundle) {
        String str;
        C1692config config;
        C1692config config2 = (C1692config) getApplicationContext();
        this.f9559c = config2;
        if (config2.f7313c1 == null) {
            config2.mo7490V0();
        }
        C1692config config3 = this.f9559c;
        int i = config3.f7318d;
        if (i != -1) {
            this.f9561e = C1692config.m8189h(config3.f7313c1, config3.f7368l1);
            str = this.f9559c.f7313c1;
        } else {
            this.f9561e = C1692config.m8189h(config3.f7231O1[i].f7916g, config3.f7368l1);
            C1692config config4 = this.f9559c;
            str = config4.f7231O1[config4.f7318d].f7916g;
        }
        if (Build.VERSION.SDK_INT > 12) {
            if (!C1692config.m8153I("#" + str)) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        C1692config.m8190i(this, this.f9559c.f7313c1);
        int i2 = 0;
        this.f9570n = 0;
        C1692config config5 = this.f9559c;
        int i3 = config5.f7336g;
        if (config5.f7386n5) {
            i3++;
        }
        String[] strArr = new String[i3];
        this.f9569m = new int[i3];
        while (true) {
            config = this.f9559c;
            C1855l[] lVarArr = config.f7231O1;
            if (i2 >= lVarArr.length) {
                break;
            }
            if (!lVarArr[i2].f7848B) {
                int i4 = this.f9570n;
                strArr[i4] = lVarArr[i2].f7898a;
                this.f9569m[i4] = i2;
                this.f9570n = i4 + 1;
            }
            i2++;
        }
        if (config.f7386n5) {
            strArr[this.f9570n] = getResources().getString(R.string.privacidad);
            this.f9569m[this.f9570n] = -123;
        }
        if (Build.VERSION.SDK_INT >= 17 && getResources().getBoolean(R.bool.es_rtl)) {
            getListView().setTextDirection(4);
        }
        setListAdapter(new ArrayAdapter(this, 17367043, strArr));
    }

    public void onError(C3371Ad ad, com.facebook.ads.AdError adError) {
        this.f9568l.cancel();
        abrir_secc((View) null);
    }

    public void onFailedToReceiveAd(C5041Ad ad) {
        this.f9568l.cancel();
        abrir_secc((View) null);
    }

    /* access modifiers changed from: protected */
    public void onListItemClick(ListView listView, View view, int i, long j) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        View view2 = view;
        int i2 = i;
        C1692config config = this.f9559c;
        if (!config.f7386n5 || this.f9569m[i2] != -123) {
            view.setId(config.f7243Q1[i2]);
            view.setTag(R.id.TAG_IDSECC, Integer.valueOf(this.f9559c.f7243Q1[i2]));
            this.f9567k = i2;
            String str9 = this.f9559c.f7251R3;
            if ((str9 == null || str9.equals("")) && (((str = this.f9559c.f7281W3) == null || str.equals("")) && (((str2 = this.f9559c.f7250R2) == null || str2.equals("")) && (((str3 = this.f9559c.f7245Q3) == null || str3.equals("")) && (((str4 = this.f9559c.f7269U3) == null || str4.equals("")) && (((str5 = this.f9559c.f7275V3) == null || str5.equals("")) && (((str6 = this.f9559c.f7358j4) == null || str6.equals("")) && (((str7 = this.f9559c.f7287X3) == null || str7.equals("")) && ((str8 = this.f9559c.f7293Y3) == null || str8.equals("")))))))))) {
                abrir_secc((View) null);
                return;
            }
            String str10 = this.f9559c.f7251R3;
            if (str10 != null && !str10.equals("")) {
                this.f9562f = new RewardedVideo((Context) this, this.f9559c.f7251R3);
            }
            String str11 = this.f9559c.f7245Q3;
            if (str11 != null) {
                str11.equals("");
            }
            String str12 = this.f9559c.f7269U3;
            if (str12 != null && !str12.equals("")) {
                this.f9563g = new RewardedVideoAd(this, this.f9559c.f7269U3);
            }
            String str13 = this.f9559c.f7275V3;
            if (str13 != null && !str13.equals("")) {
                this.f9564h = new StartAppAd(this);
            }
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f9568l = progressDialog;
            if (!this.f9559c.mo7494Z0(this, view, this.f9561e, progressDialog, this.f9571o, this.f9562f, this.f9563g, this.f9564h, this.f9558b, (View) null)) {
                abrir_secc((View) null);
                return;
            }
            return;
        }
        C1692config config2 = this.f9559c;
        String str14 = config2.f7368l1;
        new C1692config.C1721n0(this, str14, C1692config.m8189h(config2.f7313c1, str14)).execute(new String[0]);
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f9568l.cancel();
        this.f9564h.showAd("REWARDED VIDEO", new C2368c());
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f9565i = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f9565i) {
            abrir_secc((View) null);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f9565i = true;
        C1692config.m8175Y0(this);
    }

    public void onStop() {
        super.onStop();
        if (this.f9560d && !this.f9566j) {
            finish();
        }
    }

    public void onVideoCompleted() {
        this.f9565i = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f9565i = true;
        C1692config.m8175Y0(this);
    }
}
