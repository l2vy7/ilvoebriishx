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
import british.xnews2.t_buscador_fr;
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

public class t_buscador extends FragmentActivity_ext_class implements C1592a, t_buscador_fr.C2093b, View.OnClickListener, RewardedVideoAdListener, OnAdLoaded, OnAdClosed, OnVideoEnded, OnAdError, VideoListener, AdEventListener, AdColonyRewardListener {

    /* renamed from: B */
    C1692config f8561B;

    /* renamed from: C */
    t_detalle_fr f8562C;

    /* renamed from: D */
    Bundle f8563D;

    /* renamed from: E */
    C1603c f8564E;

    /* renamed from: F */
    boolean f8565F = false;

    /* renamed from: G */
    boolean f8566G = false;

    /* renamed from: H */
    ListView f8567H;

    /* renamed from: british.xnews2.t_buscador$a */
    class C2077a extends AdColonyInterstitialListener {
        C2077a() {
        }

        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            t_buscador t_buscador = t_buscador.this;
            if (t_buscador.f8565F) {
                t_buscador.abrir_secc(t_buscador.f6672u);
            }
        }

        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        }

        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            t_buscador.this.f6673v.cancel();
            adColonyInterstitial.show();
        }

        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            t_buscador.this.f6673v.cancel();
            t_buscador t_buscador = t_buscador.this;
            t_buscador.abrir_secc(t_buscador.f6672u);
        }
    }

    /* renamed from: british.xnews2.t_buscador$b */
    class C2078b implements SearchManager.OnCancelListener {
        C2078b() {
        }

        public void onCancel() {
            t_buscador t_buscador = t_buscador.this;
            t_buscador.f6669r = false;
            t_buscador.setResult(0);
        }
    }

    /* renamed from: british.xnews2.t_buscador$c */
    class C2079c implements SearchManager.OnDismissListener {
        C2079c() {
        }

        public void onDismiss() {
            t_buscador.this.f6670s = false;
        }
    }

    /* renamed from: british.xnews2.t_buscador$d */
    class C2080d extends RewardedAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f8571a;

        /* renamed from: british.xnews2.t_buscador$d$a */
        class C2081a extends FullScreenContentCallback {
            C2081a() {
            }

            public void onAdDismissedFullScreenContent() {
                t_buscador t_buscador = t_buscador.this;
                if (t_buscador.f8565F) {
                    t_buscador.abrir_secc(t_buscador.f6672u);
                }
            }

            public void onAdFailedToShowFullScreenContent(AdError adError) {
                t_buscador t_buscador = t_buscador.this;
                t_buscador.abrir_secc(t_buscador.f6672u);
            }

            public void onAdShowedFullScreenContent() {
            }
        }

        /* renamed from: british.xnews2.t_buscador$d$b */
        class C2082b implements OnUserEarnedRewardListener {
            C2082b() {
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                C2080d dVar = C2080d.this;
                t_buscador.this.f8565F = true;
                C1692config.m8175Y0(dVar.f8571a);
            }
        }

        C2080d(Context context) {
            this.f8571a = context;
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            t_buscador.this.f6673v.cancel();
            rewardedAd.setFullScreenContentCallback(new C2081a());
            rewardedAd.show((Activity) this.f8571a, new C2082b());
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            t_buscador t_buscador = t_buscador.this;
            if (!t_buscador.f8561B.mo7502f(this.f8571a, t_buscador.f6675x)) {
                t_buscador.this.f6673v.cancel();
                t_buscador t_buscador2 = t_buscador.this;
                t_buscador2.abrir_secc(t_buscador2.f6672u);
            }
        }
    }

    /* renamed from: british.xnews2.t_buscador$e */
    class C2083e implements AdDisplayListener {
        C2083e() {
        }

        public void adClicked(C5041Ad ad) {
        }

        public void adDisplayed(C5041Ad ad) {
        }

        public void adHidden(C5041Ad ad) {
            t_buscador t_buscador = t_buscador.this;
            if (t_buscador.f8565F) {
                t_buscador.abrir_secc(t_buscador.f6672u);
            }
        }

        public void adNotDisplayed(C5041Ad ad) {
        }
    }

    /* renamed from: B */
    private void m8552B(Context context) {
        this.f6674w = new C2080d(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo8184C() {
        int q0 = this.f8561B.mo7522q0(this);
        int i = this.f8561B.f7427t4;
        int i2 = 0;
        if (i == 1) {
            ListView listView = (ListView) findViewById(R.id.left_drawer);
            this.f8567H = listView;
            this.f8561B.mo7524s(listView);
        } else if (i == 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C1855l[] lVarArr = this.f8561B.f7231O1;
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
            int[] iArr = this.f8561B.f7249R1;
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
        C1845j j0 = this.f8561B.mo7510j0(view, this);
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
                    if (this.f8561B.f7427t4 != 2) {
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

    /* renamed from: k */
    public void mo8185k(String str, long j) {
        t_detalle_fr t_detalle_fr = this.f8562C;
        if (t_detalle_fr == null || !t_detalle_fr.mo3415f0()) {
            Intent intent = new Intent(getApplicationContext(), t_detalle.class);
            intent.putExtra("url", str);
            intent.putExtra("idprod", j);
            startActivityForResult(intent, 0);
            return;
        }
        this.f8562C.mo8633T1(str, j);
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
        if (this.f8565F) {
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
        String str9 = this.f8561B.f7251R3;
        if ((str9 == null || str9.equals("")) && (((str = this.f8561B.f7281W3) == null || str.equals("")) && (((str2 = this.f8561B.f7250R2) == null || str2.equals("")) && (((str3 = this.f8561B.f7245Q3) == null || str3.equals("")) && (((str4 = this.f8561B.f7269U3) == null || str4.equals("")) && (((str5 = this.f8561B.f7275V3) == null || str5.equals("")) && (((str6 = this.f8561B.f7358j4) == null || str6.equals("")) && (((str7 = this.f8561B.f7287X3) == null || str7.equals("")) && ((str8 = this.f8561B.f7293Y3) == null || str8.equals("")))))))))) {
            abrir_secc(view);
            return;
        }
        String str10 = this.f8561B.f7251R3;
        if (str10 != null && !str10.equals("")) {
            this.f6675x = new RewardedVideo((Context) this, this.f8561B.f7251R3);
        }
        String str11 = this.f8561B.f7245Q3;
        if (str11 != null) {
            str11.equals("");
        }
        String str12 = this.f8561B.f7269U3;
        if (str12 != null && !str12.equals("")) {
            this.f6676y = new RewardedVideoAd(this, this.f8561B.f7269U3);
        }
        String str13 = this.f8561B.f7275V3;
        if (str13 != null && !str13.equals("")) {
            this.f6677z = new StartAppAd(this);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6673v = progressDialog;
        this.f6672u = view;
        if (!this.f8561B.mo7494Z0(this, view, this.f6668q, progressDialog, this.f6674w, this.f6675x, this.f6676y, this.f6677z, this.f6667A, view)) {
            abrir_secc(view);
        }
    }

    @TargetApi(13)
    public void onCreate(Bundle bundle) {
        int i;
        boolean z;
        boolean z2;
        C1692config config = (C1692config) getApplicationContext();
        this.f8561B = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        m8552B(this);
        this.f6667A = new C2077a();
        Bundle extras = getIntent().getExtras();
        this.f8563D = extras;
        boolean z3 = true;
        if (bundle == null) {
            this.f6671t = extras != null && extras.containsKey("es_root") && this.f8563D.getBoolean("es_root", false);
        } else {
            this.f6671t = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        C1692config config2 = this.f8561B;
        this.f6668q = C1692config.m8189h(config2.f7431u1, config2.f7452x1);
        super.onCreate(bundle);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 13) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.x;
        } else {
            i = defaultDisplay.getWidth();
        }
        if (i > ((int) ((getResources().getDisplayMetrics().density * 500.0f) + 0.5f))) {
            setContentView((int) R.layout.t_buscador_h);
            z2 = false;
            z = false;
        } else {
            setContentView((int) R.layout.t_buscador_v);
            z2 = true;
            z = true;
        }
        this.f8562C = (t_detalle_fr) mo3505r().mo3589i0(R.id.detalle_fr);
        mo8184C();
        if (z2) {
            this.f8561B.mo7486N0(this, true);
        }
        SearchManager searchManager = (SearchManager) getSystemService("search");
        searchManager.setOnCancelListener(new C2078b());
        searchManager.setOnDismissListener(new C2079c());
        if (bundle == null) {
            C1692config config3 = this.f8561B;
            Bundle bundle2 = this.f8563D;
            boolean z4 = bundle2 != null && bundle2.containsKey("ad_entrar");
            Bundle bundle3 = this.f8563D;
            if (bundle3 == null || !bundle3.containsKey("fb_entrar")) {
                z3 = false;
            }
            config3.mo7503f1(this, z4, z3);
        }
        if (z) {
            this.f8564E = this.f8561B.mo7474A0(this, false);
        }
    }

    public void onDestroy() {
        C1603c cVar;
        AdColonyAdView adColonyAdView;
        C1603c cVar2;
        AdView adView;
        C1603c cVar3;
        com.google.android.gms.ads.AdView adView2;
        if (!(this.f8561B.f7384n3 == 0 || (cVar3 = this.f8564E) == null || (adView2 = cVar3.f6886a) == null)) {
            adView2.destroy();
        }
        if (!(this.f8561B.f7384n3 == 0 || (cVar2 = this.f8564E) == null || (adView = cVar2.f6887b) == null)) {
            adView.destroy();
        }
        if (!(this.f8561B.f7384n3 == 0 || (cVar = this.f8564E) == null || (adColonyAdView = cVar.f6889d) == null)) {
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
        t_detalle_fr t_detalle_fr = this.f8562C;
        if (t_detalle_fr == null || !t_detalle_fr.mo3415f0()) {
            if (i != 4 || !this.f6671t || this.f8566G || !this.f8561B.f7365k5) {
                return super.onKeyDown(i, keyEvent);
            }
            this.f8566G = true;
            C1692config.m8199t(this);
            return true;
        } else if (this.f8562C.mo8635W1(i, keyEvent)) {
            return true;
        } else {
            if (i != 4 || !this.f6671t || this.f8566G || !this.f8561B.f7365k5) {
                return super.onKeyDown(i, keyEvent);
            }
            this.f8566G = true;
            C1692config.m8199t(this);
            return true;
        }
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onPause() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        if (!(this.f8561B.f7384n3 == 0 || (cVar = this.f8564E) == null || (adView = cVar.f6886a) == null)) {
            adView.pause();
        }
        super.onPause();
        C1692config.m8162O0(this);
    }

    public void onReceiveAd(C5041Ad ad) {
        this.f6673v.cancel();
        this.f6677z.showAd("REWARDED VIDEO", new C2083e());
    }

    public void onResume() {
        C1603c cVar;
        com.google.android.gms.ads.AdView adView;
        super.onResume();
        C1692config.m8164P0(this);
        if (this.f8561B.f7384n3 != 0 && (cVar = this.f8564E) != null && (adView = cVar.f6886a) != null) {
            adView.resume();
        }
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward.success()) {
            this.f8565F = true;
            C1692config.m8175Y0(this);
        }
    }

    public void onRewardedVideoClosed() {
        if (this.f8565F) {
            abrir_secc(this.f6672u);
        }
    }

    public void onRewardedVideoCompleted() {
        this.f8565F = true;
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
        this.f8565F = true;
        C1692config.m8175Y0(this);
    }

    public void videoEnded() {
        this.f8565F = true;
        C1692config.m8175Y0(this);
    }
}
